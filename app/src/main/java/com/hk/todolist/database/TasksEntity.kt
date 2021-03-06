package com.hk.todolist.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "task_table")
data class TasksEntity(@ColumnInfo(name = "task") val task: String) {
    @PrimaryKey(autoGenerate = true) var id =0
}