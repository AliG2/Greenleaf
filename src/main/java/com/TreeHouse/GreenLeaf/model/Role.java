package com.TreeHouse.GreenLeaf.model;



import javax.persistence.*;


    @Entity
    @Table(name = "roles")
    public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        // vet ej vad konverterar från string till enum mellan databas och klass
        @Enumerated(EnumType.STRING)
        // google
        @Column(length = 20)
        private ERole name;

        public Role() {

        }

        public Role(ERole name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public ERole getName() {
            return name;
        }

        public void setName(ERole name) {
            this.name = name;
        }
    }


