package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {
    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> finishedContent = new LinkedHashSet<>();

    public Developer(String name) {
        this.name = name;
    }

    public void subscribeToBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContent());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void progress(){
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if(content.isPresent()){
            this.finishedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double getTotalXp(){
        return this.finishedContent.stream().mapToDouble(Content::getXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getFinishedContent() {
        return finishedContent;
    }

    public void setFinishedContent(Set<Content> finishedContent) {
        this.finishedContent = finishedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscribedContent, developer.subscribedContent) && Objects.equals(finishedContent, developer.finishedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, finishedContent);
    }
}
