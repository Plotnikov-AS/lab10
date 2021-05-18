package ru.pis.lab10.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.pis.lab10.dao.HistoryDao;
import ru.pis.lab10.model.History;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.util.Objects.isNull;

@Service
@RequiredArgsConstructor
public class MainSerivce {
    private final HistoryDao historyDao;

    public List<History> getHistory(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sdf.format(date));
        return historyDao.getAllProductsByDate(strDate);
    }

    public Integer getTotalValue(List<History> history) {
        int val = 0;
        for (History product : history) {
            if (isNull(product.getPrice()) || isNull(product.getCount())) {
                continue;
            }
            val += product.getPrice().intValue() * product.getCount();
        }
        return val;
    }
}
