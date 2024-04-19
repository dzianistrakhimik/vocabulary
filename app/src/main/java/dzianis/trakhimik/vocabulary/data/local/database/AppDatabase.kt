package dzianis.trakhimik.vocabulary.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import dzianis.trakhimik.vocabulary.data.local.dao.WordDao
import dzianis.trakhimik.vocabulary.data.local.entity.WordEntity

@Database(entities = [WordEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wordDao(): WordDao
}