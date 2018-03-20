package com.revature.beans;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Beans for the Interview table
 * @author Omowumi
 * 
 */
@Entity
@Table(name = "CALIBER_INTERVIEW")
public class Interview implements Serializable {
	private static final long serialVersionUID = -1694191467554072614L;

	@Id
	@Column(name = "INTERVIEW_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INTERVIEW_ID_SEQUENCE")
	@SequenceGenerator(name = "INTERVIEW_ID_SEQUENCE", sequenceName = "INTERVIEW_ID_SEQUENCE")
	private Integer interviewId;
	
	@NotEmpty
	@Column(name = "ASSOCIATE_ID")
	private Integer associateId;
	
	@NotEmpty
	@Column(name = "INTERVIEW_TYPE_ID")
	private Integer interviewTypeId;
	
	@NotEmpty
	@Column(name = "CLIENT_ID")
	private Integer clientId;
	
	@NotEmpty
	@Column(name = "END_CLIENT_ID")
	private Integer endClientId;
	
	@Column(name = "INTERVIEW_DATE")
	private Timestamp interviewDate;
	
	@Column(name = "INTERVIEW_FEEDBACK", length = 2000)
	private String interviewFeedback;

	public Interview() {
	}

	public Interview(Integer interviewId, Integer associateId, Integer interviewTypeId, Integer clientId,
			Integer endClientId, Timestamp interviewDate, String interviewFeedback) {
		this.interviewId = interviewId;
		this.associateId = associateId;
		this.interviewTypeId = interviewTypeId;
		this.clientId = clientId;
		this.endClientId = endClientId;
		this.interviewDate = interviewDate;
		this.interviewFeedback = interviewFeedback;
	}

	public Integer getInterviewId() {
		return interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

	public Integer getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Integer associateId) {
		this.associateId = associateId;
	}

	public Integer getInterviewTypeId() {
		return interviewTypeId;
	}

	public void setInterviewTypeId(Integer interviewTypeId) {
		this.interviewTypeId = interviewTypeId;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Integer getEndClientId() {
		return endClientId;
	}

	public void setEndClientId(Integer endClientId) {
		this.endClientId = endClientId;
	}

	public Timestamp getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(Timestamp interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewFeedback() {
		return interviewFeedback;
	}

	public void setInterviewFeedback(String interviewFeedback) {
		this.interviewFeedback = interviewFeedback;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((associateId == null) ? 0 : associateId.hashCode());
		result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
		result = prime * result + ((endClientId == null) ? 0 : endClientId.hashCode());
		result = prime * result + ((interviewDate == null) ? 0 : interviewDate.hashCode());
		result = prime * result + ((interviewFeedback == null) ? 0 : interviewFeedback.hashCode());
		result = prime * result + ((interviewId == null) ? 0 : interviewId.hashCode());
		result = prime * result + ((interviewTypeId == null) ? 0 : interviewTypeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interview other = (Interview) obj;
		if (associateId == null) {
			if (other.associateId != null)
				return false;
		} else if (!associateId.equals(other.associateId))
			return false;
		if (clientId == null) {
			if (other.clientId != null)
				return false;
		} else if (!clientId.equals(other.clientId))
			return false;
		if (endClientId == null) {
			if (other.endClientId != null)
				return false;
		} else if (!endClientId.equals(other.endClientId))
			return false;
		if (interviewDate == null) {
			if (other.interviewDate != null)
				return false;
		} else if (!interviewDate.equals(other.interviewDate))
			return false;
		if (interviewFeedback == null) {
			if (other.interviewFeedback != null)
				return false;
		} else if (!interviewFeedback.equals(other.interviewFeedback))
			return false;
		if (interviewId == null) {
			if (other.interviewId != null)
				return false;
		} else if (!interviewId.equals(other.interviewId))
			return false;
		if (interviewTypeId == null) {
			if (other.interviewTypeId != null)
				return false;
		} else if (!interviewTypeId.equals(other.interviewTypeId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Interview [interviewId=" + interviewId + ", associateId=" + associateId + ", interviewTypeId="
				+ interviewTypeId + ", clientId=" + clientId + ", endClientId=" + endClientId + ", interviewDate="
				+ interviewDate + ", interviewFeedback=" + interviewFeedback + "]";
	}
	
	
	
	
}
