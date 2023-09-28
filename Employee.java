package com.sprint_2.entity;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Employee {

	
	@Id
	@GeneratedValue
	@NotNull(message = "cant be null")
    private int Id;
	
	@NotBlank(message = "cant be blank")
    private String empName;
	
	@NotNull(message = "cant be null")
    private Integer empAge;
	
	@Email(message = "follow email format")
    private String email;
    
    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dep_fk", referencedColumnName = "depid" )
	private Department department;
	
    
  
    
}
