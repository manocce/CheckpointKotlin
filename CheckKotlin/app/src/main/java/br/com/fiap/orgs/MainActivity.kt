//Pacote criado para a MainActivity
package br.com.fiap.orgs

//Importações de Classes necessárias para o desenvolvimento
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

// Classe principal da atividade, estendendo ComponentActivity
class MainActivity : ComponentActivity() {
    // Método chamado quando a atividade é criada
    @SuppressLint("SetTextI18n")
    // Sobrescreve o método onCreate da classe ComponentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        // Chama o método onCreate da classe pai para realizar
        // as inicializações necessárias da atividade
        super.onCreate(savedInstanceState)

        // Vincula os elementos do layout mercado_item.xml às variáveis no código
        val nome = findViewById<TextView>(R.id.rename)
        // Define o texto do TextView "nome" como "Mercado"
        nome.text = "Mercado"

        // Vincula os elementos do layout mercado_item.xml e define o texto para "Endereço 1"
        findViewById<TextView>(R.id.address1).apply {
            text = "Endereço 1 - Descrição de como chegar ao mercado"
        }

        // Vincula os elementos do layout mercado_item.xml e define o texto para a direção 1
        findViewById<TextView>(R.id.direction1).apply {
            text = "Direção: Siga pela rua A e vire à esquerda na rua B."
        }

        // Vincula os elementos do layout mercado_item.xml e define o texto para "Endereço 2"
        findViewById<TextView>(R.id.address2).apply {
            text = "Endereço 2 - Outra descrição de como chegar ao mercado"
        }

        // Vincula os elementos do layout mercado_item.xml e define o texto para a direção 2
        findViewById<TextView>(R.id.direction2).apply {
            text = "Direção: Siga pela rua C e vire à direita na rua D."
        }
       // Vincula o elemento ImageView do layout mercado_item.xml com o ID "imageView" e aplica uma operação
       // para definir a imagem exibida no ImageView como "mercado_view"
        findViewById<ImageView>(R.id.imageView).apply {
           setImageResource(R.drawable.mercado_view)
        }
    }


}
