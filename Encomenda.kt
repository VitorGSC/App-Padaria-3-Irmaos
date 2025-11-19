import androidx.room.Entity
import androidx.room.PrimaryKey

// Define a tabela "encomendas" no banco de dados local
@Entity(tableName = "encomendas")
data class Encomenda(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nomeCliente: String,
    val telefoneCliente: String,
    val dataEntrega: String, // Formato DD/MM/AAAA
    val descricaoPedido: String,
    val valorSinal: Double,
    val valorTotal: Double,
    val status: String = "PENDENTE" // PENDENTE ou ENTREGUE
)
