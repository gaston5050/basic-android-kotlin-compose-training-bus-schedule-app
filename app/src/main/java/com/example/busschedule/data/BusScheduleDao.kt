package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface BusScheduleDao {


    @Query("SELECT * FROM bus_schedule ORDER BY id ASC")
    fun getAllBusSchedule(): Flow<List<BusSchedule>>


    @Query("SELECT * FROM bus_schedule WHERE stop_name = :stopName ORDER BY id ASC")
    fun getBusScheduleById(stopName: String): Flow<BusSchedule>

}