package com.firozpocyt.mvvmdagger2example.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.firozpocyt.mvvmdagger2example.models.ProductItem

@Database(entities = [ProductItem::class], version = 1)
abstract class FakerDB: RoomDatabase() {

    abstract fun getFakerDAO() : FakerDAO
}