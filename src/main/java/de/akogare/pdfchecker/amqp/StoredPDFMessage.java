package de.akogare.pdfchecker.amqp;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class StoredPDFMessage {

  private String messageId;
  private List<UUID> message;
  private Date messageDate;

  public StoredPDFMessage() {
  }

  public StoredPDFMessage(String messageId, List<UUID> message, Date messageDate) {
    this.messageId = messageId;
    this.message = message;
    this.messageDate = messageDate;
  }

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public List<UUID> getMessage() {
    return message;
  }

  public void setMessage(List<UUID> message) {
    this.message = message;
  }

  public Date getMessageDate() {
    return messageDate;
  }

  public void setMessageDate(Date messageDate) {
    this.messageDate = messageDate;
  }

  @Override
  public String toString() {
    return "CustomMassage{" +
            "messageId='" + messageId + '\'' +
            ", message=" + message +
            ", messageDate=" + messageDate +
            '}';
  }
}
