package ap.vitor.testeEricsson.api.models;

import lombok.Data;

import java.util.List;

//A Classe QuoteModel é um DTO que conversa entre entre o banco de dados e as chamadas HTTP

@Data
public class QuoteModel {
    private List<Float> quotes;


}
