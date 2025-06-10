# 🔗 Hibernate Relationship Mapping Examples <br>

This Java-based project demonstrates how to implement **ORM (Object Relational Mapping)** using **Hibernate** to model real-world relationships between entities like `Student`, `Classroom`, `Product`, and `ShopLocation`. <br>

> Hibernate's relationship annotations like `@OneToMany`, `@ManyToOne`, and `@JoinColumn`.

<br>

## 📁 Project Structure <br>
src/                         <br>
└── com.tka/                <br>
├── OneToManyEx.java # Product → ShopLocation (One-to-Many)          <br>
├── ManyToOneEx.java # Student → Classroom (Many-to-One)           <br>
├── entities/                     <br>
│ ├── Student.java               <br>
│ ├── Classroom.java               <br>
│ ├── Product.java                 <br>
│ └── ShopLocation.java             <br>
hibernate.cfg.xml # Hibernate configuration         <br>
pom.xml # Maven dependencies               <br>
