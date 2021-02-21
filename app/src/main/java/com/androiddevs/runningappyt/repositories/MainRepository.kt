package com.androiddevs.runningappyt.repositories

import com.androiddevs.runningappyt.db.Run
import com.androiddevs.runningappyt.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {
    suspend fun  insertRun(run : Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) =runDao.deleteRun(run)

    fun  getAllRunSortedByDate() = runDao.getAllRunSortedByDate()

    fun  getAllRunSortedByDistance() = runDao.getAllRunSortedByDistance()

    fun  getAllRunSortedByTimeInMillis() = runDao.getAllRunSortedByTimeInMillis()

    fun  getAllRunSortedByAvgSpeed() = runDao.getAllRunSortedByAvgSpeed()

    fun  getAllRunSortedByCaloriesBurned() = runDao.getAllRunSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()




}