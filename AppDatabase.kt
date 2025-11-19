import androidx.room.Database
import androidx.room.RoomDatabase

// Define que este é o banco de dados e lista as tabelas que ele possui
@Database(entities = [Encomenda::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    // Permite que o app acesse o "Gerente" (DAO) das encomendas
    abstract fun encomendaDao(): EncomendaDao
}
