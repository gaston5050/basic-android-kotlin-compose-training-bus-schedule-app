package com.example.busschedule.data

import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface BusScheduleDao {

    @Query("SELECT * FROM bus_schedule ORDER BY arrival_time ASC")
    fun getAll(): Flow<List<BusSchedule>>)


    @Query("SELECT * FROM bus_schedule WHERE ID = :id")
    fun getItem(id: Int): Flow<BusSchedule>

}