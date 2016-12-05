package com.artbrain.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solution")
public class Solution {


  @Id
  @Column(name = "id")
  private int id;
  @Column(name = "username")
  private String username;
  @Column(name = "question")
  private int question;
  @Column(name = "answer")
  private String answer;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getQuestion() {
    return question;
  }

  public void setQuestion(int question) {
    this.question = question;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public Solution(String username, int question, String answer) {
    this.username = username;
    this.question = question;
    this.answer = answer;
  }

  public Solution() {
  }
}
