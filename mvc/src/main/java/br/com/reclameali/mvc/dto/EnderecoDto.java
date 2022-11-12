package br.com.reclameali.mvc.dto;

public class EnderecoDto {

    private String url;



    public EnderecoDto(String url) {
        this.url = url;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
