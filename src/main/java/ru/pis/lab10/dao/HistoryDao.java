package ru.pis.lab10.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.pis.lab10.model.History;
import ru.pis.lab10.repo.HistoryRepo;

import java.util.Date;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class HistoryDao {
    private final HistoryRepo historyRepo;

    public List<History> getAllProductsByDate(String  date) {
        return historyRepo.findAllByDat(date);
    }
}
