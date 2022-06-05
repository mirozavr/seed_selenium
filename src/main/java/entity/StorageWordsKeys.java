package entity;
// юзаю БД с именем postgres!
// НЕ torgovus!!!



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity // сначала подстветится красным, так как нужен первичный ключ
@Table(name = "users", schema = "public") // так как имя таблицы отличается от названия класса
public class StorageWordsKeys {
    // @Column(name = "id", nullable = false)
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;
    private String bip44Btc;
    private String bip49Btc;
    private String bip84Btc;
    private String bip44Eth;
    private String bip32Eth;
   private String ltc;
   private String seed11Entity;

    public StorageWordsKeys(String bip) {
    }
}
