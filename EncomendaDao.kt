import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EncomendaDao {
    // Insere uma nova encomenda no banco
    @Insert
    suspend fun inserir(encomenda: Encomenda)

    // Busca todas as encomendas ordenadas pela data de entrega
    @Query("SELECT * FROM encomendas ORDER BY dataEntrega ASC")
    fun listarTodas(): List<Encomenda>

    // Busca encomendas de uma data específica (para o padeiro saber o que fazer hoje)
    @Query("SELECT * FROM encomendas WHERE dataEntrega = :dataHoje")
    fun buscarPorData(dataHoje: String): List<Encomenda>
}
