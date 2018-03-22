package com.revature.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Beans for the Interview Type table
 * @author Omowumi
 *
 */
@Entity
@Table(name = "CALIBER_INTERVIEW_TYPE")
public class InterviewType implements Serializable {
	private static final long serialVersionUID = 7126570131021707888L;

	@Id
	@Column(name = "INTERVIEW_TYPE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INTERVIEW_TYPE_ID_SEQUENCE")
	@SequenceGenerator(name = "INTERVIEW_TYPE_ID_SEQUENCE", sequenceName = "INTERVIEW_TYPE_ID_SEQUENCE", initialValue = 200)
	private Integer interviewTypeId;
	
	@NotEmpty
	@Column(name = "INTERVIEW_TYPE_NAME")
	private String interviewTypeName;

	public InterviewType() {
	}

	public InterviewType(Integer interviewTypeId, String interviewTypeName) {
		this.interviewTypeId = interviewTypeId;
		this.interviewTypeName = interviewTypeName;
	}

	public Integer getInterviewTypeId() {
		return interviewTypeId;
	}

	public void setInterviewTypeId(Integer interviewTypeId) {
		this.interviewTypeId = interviewTypeId;
	}

	public String getInterviewTypeName() {
		return interviewTypeName;
	}

	public void setInterviewTypeName(String interviewTypeName) {
		this.interviewTypeName = interviewTypeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((interviewTypeId == null) ? 0 : interviewTypeId.hashCode());
		result = prime * result + ((interviewTypeName == null) ? 0 : interviewTypeName.hashCode());
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
		InterviewType other = (InterviewType) obj;
		if (interviewTypeId == null) {
			if (other.interviewTypeId != null)
				return false;
		} else if (!interviewTypeId.equals(other.interviewTypeId))
			return false;
		if (interviewTypeName == null) {
			if (other.interviewTypeName != null)
				return false;
		} else if (!interviewTypeName.equals(other.interviewTypeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InterviewType [interviewTypeId=" + interviewTypeId + ", interviewTypeName=" + interviewTypeName + "]";
	}
}
