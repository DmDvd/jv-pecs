package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer<T> producer = null;
        if (type == Bulldozer.class) {
            producer = (MachineProducer<T>) new BulldozerProducer();
        }
        if (type == Truck.class) {
            producer = (MachineProducer<T>) new TruckProducer();
        }
        if (type == Excavator.class) {
            producer = (MachineProducer<T>) new ExcavatorProducer();
        }
        if (producer != null) {
            return (List<T>) producer.get();
        } else {
            return List.of();
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        if (machines == null || machines.isEmpty()) {
            return;
        }
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}
