package com.ofirt.bank_app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String firstName;

    @NotNull
    @Column(nullable = false)
    private String lastName;

    private String otherName;

    @NotNull
    @Column(nullable = false)
    private String gender;

    @NotNull
    @Column(nullable = false)
    private String address;

    @NotNull
    @Column(nullable = false)
    private String stateOfOrigin;

    @Column(nullable = false)
    @NotNull
    private String accountNumber;

    @Column(nullable = false)
    @NotNull
    private BigDecimal accountBalance;

    @Column(nullable = false)
    @NotNull
    private String email;

    @Column(nullable = false)
    @NotNull
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    @NotNull
    private String phoneNumber;

    @Column(nullable = false)
    @NotNull
    private String alternativePhoneNumber;

    @Column(nullable = false)
    @NotNull
    private String status;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime modifiedAt;

}
