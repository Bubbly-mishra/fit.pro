package com.stackroute.slot.service;

import com.stackroute.slot.model.Slot;
import com.stackroute.slot.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.stackroute.slot.model.Status.*;

@Service
public class SlotServiceImpl implements SlotService {


    @Autowired
    private SlotRepository slotRepository;

    @Override
    public void addSlot(Slot slot) {

        slotRepository.save(slot);
    }

    @Override
    public void deleteSlotByScheduleId(String scheduleId) {
        slotRepository.deleteSlotByScheduleId(scheduleId);
    }

    @Override
    public List<Slot> listSlotByExpertId(String expertId) {
        return slotRepository.findAllSlotByExpertId(expertId);
    }

    @Override
    public void updateStatusByExpertId(String expertId) {
        Slot slot = slotRepository.findAvailabilityByExpertId(expertId);
        slot.setStatus(AVAILABLE);
        slotRepository.save(slot);
    }


}
