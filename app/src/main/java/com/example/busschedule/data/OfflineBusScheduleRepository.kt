package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class OfflineBusScheduleRepository( private val busScheduleDao: BusScheduleDao):
    BusScheduleRepository  {

    override fun getAllItemsStream(): Flow<List<BusSchedule>> = busScheduleDao.getAllBusSchedule()

    override fun getItemStream(id: Int): Flow<BusSchedule?> = busScheduleDao.getBusScheduleById(id)


}