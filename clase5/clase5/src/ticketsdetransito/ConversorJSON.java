package ticketsdetransito;

public class ConversorJSON<T> {
    public String convertir(T t) {
        return new com.google.gson.Gson().toJson(t);
    }
}
