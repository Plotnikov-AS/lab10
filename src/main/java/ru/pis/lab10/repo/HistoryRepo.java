package ru.pis.lab10.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.pis.lab10.model.History;

import java.util.Date;
import java.util.List;

@Repository
public interface HistoryRepo extends JpaRepository<History, Long> {

    //    @Query("select a from History a where a.date = :dat")
    @Query(value = "SELECT * FROM lab10_schema.table_history h where h.dat = :dat", nativeQuery = true)
    List<History> findAllByDat(@Param("dat") String dat);
}
