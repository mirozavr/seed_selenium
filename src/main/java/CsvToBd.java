import dao.BalanceDao;

public class CsvToBd {

    public static void main(String[] args) {
        var balanceDao = BalanceDao.getInstance();
        BalanceDao.csvToBd();
    }
}
