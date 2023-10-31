/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Courses.CourseDetails;
import Student.Studentde;
import Courses.Suggestion;
import Student.Adminlog;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.ArrayList;

/**
 *
 * @author shush
 */
public class ProfessorHistory {
   private ArrayList<ProfessorCourses> professor_courselist;
   private ArrayList<ProfessorProfile> ph;
    ArrayList<CourseDetails> coursehistory;
    private ArrayList<Studentde> history;
     private ArrayList<registercours> regcoursehistory;
    private ArrayList<Suggestion> sugg;
    private ArrayList<Adminlog> addlog;

    public ArrayList<ProfessorProfile> getPh() {
        return ph;
    }

    public void setPh(ArrayList<ProfessorProfile> ph) {
        this.ph = ph;
    }

    public ArrayList<Adminlog> getAddlog() {
        return addlog;
    }

    public void setAddlog(ArrayList<Adminlog> addlog) {
        this.addlog = addlog;
    }
    
    
    

    public ArrayList<Studentde> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Studentde> history) {
        this.history = history;
    }

    public ArrayList<registercours> getRegcoursehistory() {
        return regcoursehistory;
    }

    public void setRegcoursehistory(ArrayList<registercours> regcoursehistory) {
        this.regcoursehistory = regcoursehistory;
    }

    public ArrayList<Suggestion> getSugg() {
        return sugg;
    }

    public void setSugg(ArrayList<Suggestion> sugg) {
        this.sugg = sugg;
    }
    

    
    
    public ArrayList<ProfessorCourses> getProfessor_courselist() {
        return professor_courselist;
    }

    public void setProfessor_courselist(ArrayList<ProfessorCourses> professor_courselist) {
        this.professor_courselist = professor_courselist;
    }

    public ArrayList<ProfessorProfile> getHistory_professor() {
        return ph;
    }

    public void setHistory_professor(ArrayList<ProfessorProfile> history_professor) {
        this.ph = history_professor;
    }

    public ArrayList<CourseDetails> getCoursehistory() {
        return coursehistory;
    }

    public void setCoursehistory(ArrayList<CourseDetails> coursehistory) {
        this.coursehistory = coursehistory;
    }
    
    
    
    public Courses.CourseDetails addNewcourse()
    {
        Courses.CourseDetails newcourse = new Courses.CourseDetails();
        coursehistory.add(newcourse);
        return newcourse;
    }
    
    public registercours adduser()
    {
        registercours newrcourse = new registercours();
        regcoursehistory.add(newrcourse);
        return newrcourse;
    }
    
    
     public Student.Studentde addnuser()
    {
        Student.Studentde newrcourse1 = new Student.Studentde();
        history.add(newrcourse1);
        return newrcourse1;
    }
     
     
public void addruser(registercours course) {
        this.regcoursehistory.add(course);
    }

    public ProfessorHistory() {
        
      
                   this.addlog = new ArrayList<>();
                   Adminlog ad1 = new Adminlog("Admin","Admin1234!");

        addlog.add(ad1);
        
        
        
        this.ph = new ArrayList<>();
        ProfessorProfile p1 = new ProfessorProfile("Alex", "Ferguson", " john.smith@northeastern.edu", "002817662", "Computer Science",15, "United States", "professor123","/UI_Images/Faculty1.jpeg.jpg");
        ProfessorProfile p2 = new ProfessorProfile("Tuchel", "", " emily.johnson@northeastern.edu", "002816766", "Information Systems",12 , "Canada", "chemprof567","/UI_Images/Faculty2.jpeg.jpg");
        ProfessorProfile p3 = new ProfessorProfile("Zidane", "", " david.wilson@northeastern.edu", "002816767", "Informatics",20 , "United Kingdom", "historyprof246","/UI_Images/Faculty3.jpeg.jpg");
        ProfessorProfile p4 = new ProfessorProfile("Pep", "Gadialo", " shyam.bhaskar@northeastern.edu", "002271578", "Data Management",20 , "United Kingdom", "shyam123","/UI_Images/Faculty4.jpeg.jpg");
        ProfessorProfile p5 = new ProfessorProfile("John", "Durairaj", " deepak.bob@northeastern.edu", "002816764", "Project Management",20 , "Australia", "deepak123","/UI_Images/Faculty5.jpeg.jpg");
        ProfessorProfile p6   = new ProfessorProfile("Annie", "","ann.bob@northeastern.edu","002837662","Software Engineering",20 , "Australia", "deepak123","/UI_Images/Faculty6.jpeg.jpg");
        ProfessorProfile p7 = new ProfessorProfile("Katie", "","kat.bob@northeastern.edu", "002276578","Software Engineering",20 , "Australia", "deepak123","/UI_Images/Faculty7.jpeg.jpg");
        ProfessorProfile p8   = new ProfessorProfile("Alvaro", "mortae","kat.bob@northeastern.edu", "002777662","Information Systems",20 , "Australia", "deepak123","/UI_Images/Faculty7.jpeg.jpg");
        ph.add(p1);
        ph.add(p2);
        ph.add(p3);
        ph.add(p4);
        ph.add(p5);
        ph.add(p6);
        ph.add(p7);
        ph.add(p8);

          
        this.history = new ArrayList<Studentde>();
         Student.Studentde person1 = new  Student.Studentde("Dev Mithunisvar", 23, "Boston", "Information Systems", "dev@northeasern.edu",12345678,"fall","2023","2025","NEU01", "Abc1234!","/UI_Images/student1.png");
         Student.Studentde person2 = new  Student.Studentde("Mateo trucker", 24, "Boston", "Information Systems", "mat@noeth.edu",809765432,"fall","2022","2024", "NEU02", "Abc1234!","/UI_Images/student2.png");
         Student.Studentde person3 = new  Student.Studentde("Cristiano santos", 25, "Boston", "Data Architecture Management", "cri.s@northeasern.edu",56781234,"fall","2023","2025","NEU03", "Abc1234!","/UI_Images/student3.jpg");
         Student.Studentde person4 = new  Student.Studentde("Georgina rodri", 21, "Boston", "Software Engineering", "georgina.r@noeth.edu",81237645,"fall","2022","2024", "NEU04", "Abc1234!","/UI_Images/student4.jpeg");
         Student.Studentde person5 = new  Student.Studentde("Nikhil", 22, "Boston", "Data Analytics", "nikhil@northeasern.edu",82341567,"fall","2023","2025","NEU05", "Abc1234!","/UI_Images/student5.png");
         Student.Studentde person6 = new  Student.Studentde("David", 20, "Boston", "Software Engineering", "david@noeth.edu",82347651,"fall","2022","2024", "NEU06", "Abc1234!","/UI_Images/student6.jpg");
        
        
        
        
        
        this.coursehistory = new ArrayList<CourseDetails>();
        Courses.CourseDetails Cour1 = new Courses.CourseDetails("Application Development and Engineering", "No pre-requisite", "Information Systems", "INFO 5100", "CRN061", "Alex Ferguson","Fall and Spring","9/5/2023 08:00", "9/5/2023 10:00","Takes students in a step-by-step manner through the process of systematically combining UX techniques, business processes, and complex data models to assemble applications that are user-friendly and meet business requirements. Employs the object-oriented paradigm, visual user experience, and system design principles to put together complicated, powerful, real-world applications. The primary objective of this course is to practice social-technical software engineering methods and tools to solve real-world problems. Offers students an opportunity to learn innovative design and programming techniques to build significant business applications quickly; to practice simple and smart ways of making software construction enjoyable; and to master the art of how to systematically write software programs to solve any business problem.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails Cour2 = new Courses.CourseDetails("Data Science Engineering and Tools", "No pre-requisite", "Information Systems", "INFO 6105", "CRN062", "Pep Gadialo","Fall and Spring","9/6/2023 08:00", "9/6/2023 10:00","Introduces the fundamental techniques for machine learning and data science engineering. Discusses a variety of machine learning algorithms, along with examples of their implementation, evaluation, and best practices. Lays the foundation of how learning models are derived from complex data pipelines, both algorithmically and practically. Topics include supervised learning (parametric/nonparametric algorithms, support vector machines, kernels, neural networks, deep learning) and unsupervised learning (clustering, dimensionality reduction, recommender systems). Based on numerous real-world case studies.",4,"un-enrolled", 10, "online","NA",4,0);
        Courses.CourseDetails Cour3 = new Courses.CourseDetails("Big Data Engineering", " INFO 6205, INFO 6150, INFO 7390", "Information Systems", "INFO 7003", "CRN063", "Zidane","Fall and Spring","9/7/2023 18:00", "9/7/2023 19:00","ntroduces a general framework for thinking about big data. Services such as Web analytics and intelligent e-commerce have promoted a rapid increase in the volume of data generated, analyzed, and archived. In order to solve the problems related to big data, a newer type of database product has emerged. Covers how to apply technologies like Hadoop, Accumulo, MongoDB, and various NoSQL databases to build simple, robust, and efficient systems to manage and analyze big data. Also describes an easy approach to big data systems that can be built and run by a small team of students. Guides students through the theory of big data systems, how to implement them in practice, and how to deploy and operate them once they are built.",4,"un-enrolled", 10 ,"offline","NA",4,0);
        Courses.CourseDetails Cour4 = new Courses.CourseDetails("Advanced Data Science", "INFO 6105", "Information Systems", "INFO 7390", "CRN064", "Tuchel","Fall and Spring","9/8/2023 08:00", "9/8/2023 10:00","Covers a wide range of skills and responsibilities that are necessary for managing complex business performance and operational data. Such data tend to be fragmented, poorly organized, and often flawed. Offers students an opportunity to learn how a more up-to-date mapping of complex data works and to be alerted to the care and attention they must give to such a task as well as the implications of the results. Covers best practices for managing all aspects of the data transformation life cycle, covering broad areas such as requirements gathering, meta-model design, data integration and transformation, as well as implementation and ongoing operations. Discusses tools for mapping fragmented data into business intelligence solutions that guide successful strategies.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails Cour5 = new Courses.CourseDetails("Web development", "No pre-requisite", "Information Systems", "INFO 6150", "CRN065", "John Durairaj","Fall and Spring","9/9/2023 08:00", "9/9/2023 10:00","Exposes students to both conceptual and technical aspects of Web design. User experience design is the discipline of creating a useful and usable website or application that is easily navigated and meets the needs of both the site owner and its users. Covers Web standards and best practices. Studies the fundamental concepts, techniques, practices, work flows, and tools associated with the practice of user-experience design in Web interfaces. Offers students an opportunity to learn the core principles of information architecture, usability, marketing hierarchy, and user experience for contextual, value-driven websites. Additional areas of focus include typography, color theory and composition, responsive design, CSS3 concepts, basic scripting, and JavaScript libraries to create functional, effective, and visually appealing websites.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails Cour6 = new Courses.CourseDetails("Smart Contract Application Engineering and Development", "CSYE 6200", "Information Systems", "INFO 7510", "CRN066", "Alex Ferguson","Fall and Spring","9/5/2023 08:00", "9/5/2023 10:00","Emphasizes the essential coding skills for implementing self-enforcing, multiparty, mutually beneficial, contractual rights and obligations on top of blockchain technologies. Offers students an opportunity to learn how to leverage the principles and mechanisms of “decentralized autonomous organization” to programmatically coordinate the interaction between participating parties at a global scale without the need for trusting a third party and how to build blockchain-type applications that automate the interaction of a network of participating entities such as buyers, sellers, suppliers, insurance, and finance.",4,"un-enrolled", 10, "offline","NA",4,0);
        
        
        Courses.CourseDetails Cour7 = new Courses.CourseDetails("Program Structure and Algorithms", "INFO 5100 , CSYE 6200", "Information Systems", "INFO 6205", "CRN052", "Pep Gadialo","Fall and Spring","9/5/2023 08:00", "9/5/2023 10:00","Presents data structures and related algorithms, beginning with a brief review of dynamic memory allocation. Discusses the fundamental data structures in detail, including the abstract representation, supporting algorithms, and implementation methods. Focuses on understanding the application of the abstract data structure and the circumstances that affect implementation decisions. Covers lists, stacks, queues, trees, hash tables, and graphs. Covers recursion and searching and sorting algorithms in detail. Emphasizes data abstraction and encapsulation in code design. Explores external storage structures, time permitting.",4,"un-enrolled", 10, "online","NA",4,0);
        Courses.CourseDetails Cour8 = new Courses.CourseDetails("Business Ethics and Intellectual Property for Engineers", "No pre-requisite", "Information Systems", "INFO 6660", "CRN053", "Zidane","Fall and Spring","9/6/2023 18:00", "9/6/2023 19:00","Seeks to support successful engineering careers by offering students an applied understanding of ethical principles in the workplace and fundamentals of intellectual property and the American legal system. Seeks to increase students’ awareness of the ethical implications of their work and to influence colleagues to think and act in a socially cognizant manner. Introduces ethical principles and codes of professional ethics; types of intellectual property (patents, trade secrets, trademarks, copyrights); and fundamentals of the American legal system (sources of American law, contracts, torts, intellectual property, antitrust). Offers students an opportunity to practice verbal communication and presentation skills; develop an applied understanding of the relationship and differences between legal liability and ethical behavior; and develop applied critical thinking, communication, and presentation skills.",4,"un-enrolled", 10 ,"offline","NA",4,0);
        
        Courses.CourseDetails Cour9 = new Courses.CourseDetails("Concepts of Object-Oriented Design", "No pre-requisite", "Software Engineering", "CSYE 6200", "CRN054", "Tuchel","Fall and Spring","9/8/2023 08:00", "9/8/2023 9:00","Introduces object-oriented design and programming via the Java programming language; the use of inheritance, composition, and interface classes in software design; development of Java applets and applications; study of the Java class libraries, including the swing tool kit for building human computer interfaces, the network package for development of client-server systems, and the collections’ package for data structures and sorting algorithms. Requires a course project. Requires knowledge of C programming",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails cour10 = new Courses.CourseDetails("High-Performance Parallel Machine Learning and AI", "INFO 6105, DAMG 6105", "Software Engineering", "CSYE 7105", "CRN055", "Tuchel","Fall and Spring","9/9/2023 08:00", "9/9/2023 10:00","Explores the parallelization of machine learning and deep learning code that leads to high performance on heterogeneous cluster architectures. Includes the applications to a variety of domains, including image classification, speech recognition, and natural language processing, etc. Covers a brief overview of the emerging parallel computing applications. Analyzes system architectures for different kinds of parallel computing systems (shared-memory system, distributed-memory system, accelerator system, and hybrid). Offers students an opportunity to practice the principles and the practice of the emerging parallelism-based machine-learning paradigm.",4,"un-enrolled",10,"offline","NA",4,0);
        
        //
        Courses.CourseDetails Cour11 = new Courses.CourseDetails("Deployment and Operation of Software Applications", " CSYE 6220 with a minimum grade of B- or INFO 6250 with a minimum grade of B-", "Software Engineering", "CSYE 7220", "CRN056", "Annie ","Fall and Spring","9/7/2023 08:00", "9/7/2023 10:00","Introduces the four most popular infrastructure languages—Chef, Puppet, Ansible, and Salt— and codes with them in the same way that we code with Java, Python, C#, and Javascript. IT infrastructure languages and their underlying methods and tools, referred to as DevOps, bridge the gap between software development and software administration. Instead of recruiting CPU cycles on our laptops, we create and manage virtual IT infrastructures on a public cloud. Offers students an opportunity to learn how to manipulate virtual machines, containers, and lambdas and set up assembly lines on public clouds in the fashion of a Model T assembly line.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails Cour12 = new Courses.CourseDetails("Network Structures and Cloud Computing", "CSYE 6200 with a minimum grade of B- or INFO 5100 with a minimum grade of B- or INFO 5100 with a minimum grade of B-", "Software Engineering", "CSYE 6225", "CRN057", "Katie","Fall and Spring","9/6/2023 08:00", "9/6/2023 10:00","Offers a practical foundation in cloud computing and hands-on experience with the tools used in cloud computing. Designed as a foundation course for cloud-aware, adept professionals. Focuses on the fundamentals of cloud computing, the principal areas of cloud architectures, cloud security, cloud governance, cloud storage, cloud virtualization, and cloud capacity. Discusses the Internet evolution that led to cloud and how cloud applications revolutionized Web applications.",4,"un-enrolled", 10, "online","NA",4,0);
        Courses.CourseDetails Cour13 = new Courses.CourseDetails("Enterprise Software Design", "CSYE 6200 with a minimum grade of B- or CSYE 6202 with a minimum grade of B-", "Software Engineering", "CSYE 6220", "CRN058", "Alvaro mortae","Fall and Spring","9/5/2023 18:00", "9/5/2023 19:00","Designed to build on previous experience in concepts of object-oriented design courses with equal focus in the three areas of architecture, design, and implementation. Instruction and hands-on exercises cover both server-side and client-side web programming. Offers students an opportunity to build a conceptual understanding and to gain practical experience with popular frameworks (Spring MVC, Hibernate, and Dojo or jQuery) that increase productivity, empower developers, and greatly simplify web development. The goal is to be able to build the server side and client side of substantial web-based, client-server, database-intensive, multitier applications.",4,"un-enrolled", 10 ,"offline","NA",4,0);
        //
        
        Courses.CourseDetails Cour14 = new Courses.CourseDetails("Operating Systems", "INFO 6205 with a minimum grade of B-", "Software Engineering", "CSYE 6230", "CRN059", "Annie","Fall and Spring","9/8/2023 08:00", "9/8/2023 10:00","Covers basic concepts of operating systems and system programming, such as utility programs, subsystems, and multiple-program systems. Main topics include processes, interprocess communication, and synchronization; memory allocation, segmentation, and paging; loading, linking, and libraries; resource allocation, scheduling, and performance evaluation; file systems, storage devices, and I/O systems; and protection, security, and privacy. Emphasizes key concepts through code design and development.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails cour15 = new Courses.CourseDetails("Concepts of Object-Oriented Design with C++", "No pre-requisite", "Software Engineering", "CSYE 6205", "CRN060", "Katie","Fall and Spring","9/9/2023 08:00", "9/9/2023 10:00","Introduces object-oriented design and programming via the C++ programming language. Covers the use of inheritance and composition in software design and development of complex C++ applications. Topics include classes, overloading, data abstraction, information hiding, encapsulation, inheritance, polymorphism, file processing, templates, exceptions, container classes, and low-level language features. Requires a course project.",4,"un-enrolled",10,"offline","NA",4,0);
        
        Courses.CourseDetails Cour16 = new Courses.CourseDetails("Application Development and Engineering", "No pre-requisite", "Information Systems", "INFO 5100", "CRN061", "Alex Ferguson","Fall and Spring","9/5/2023 18:00", "9/5/2023 21:00","Takes students in a step-by-step manner through the process of systematically combining UX techniques, business processes, and complex data models to assemble applications that are user-friendly and meet business requirements. Employs the object-oriented paradigm, visual user experience, and system design principles to put together complicated, powerful, real-world applications. The primary objective of this course is to practice social-technical software engineering methods and tools to solve real-world problems. Offers students an opportunity to learn innovative design and programming techniques to build significant business applications quickly; to practice simple and smart ways of making software construction enjoyable; and to master the art of how to systematically write software programs to solve any business problem.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails Cour17 = new Courses.CourseDetails("Data Management and Analytics", "No pre-requisite", "Information Systems", "INFO 6105", "CRN062", "Pep Gadialo","Fall and Spring","9/6/2023 18:00", "9/6/2023 20:00","Introduces the fundamental techniques for machine learning and data science engineering. Discusses a variety of machine learning algorithms, along with examples of their implementation, evaluation, and best practices. Lays the foundation of how learning models are derived from complex data pipelines, both algorithmically and practically. Topics include supervised learning (parametric/nonparametric algorithms, support vector machines, kernels, neural networks, deep learning) and unsupervised learning (clustering, dimensionality reduction, recommender systems). Based on numerous real-world case studies.",4,"un-enrolled", 10, "online","NA",4,0);
        
        
        Courses.CourseDetails Cour19 = new CourseDetails("Data Warehousing and Business Intelligence", "DAMG 6210 with a minimum grade of B or DAMG 7275 with a minimum grade of B", "Data Architecture Management", "DAMG 7290", "CRN074", "Alvaro mortae","Fall and Spring","9/8/2023 08:00", "9/8/2023 10:00","Examines the technical and management aspects of building a data warehouse. Explores the architecture, infrastructure, processes, data quality, database design, and data analysis involved in building the data warehouse for business analysis. Management issues include business goals, tool selection, project management, personnel skills, training, and user requirements. Topics include dimensional data modeling, extraction/transformation/load processes, data quality problems, datamarts, operational data stores (ODS), staging databases, and online analytic processing (OLAP)",4,"un-enrolled",10,"online","NA",4,0);
        Courses.CourseDetails cour20 = new Courses.CourseDetails("Data Management and Database Design", "No pre-requisite", "Data Architecture Management", "DAMG 6210", "CRN075", "Tuchel","Fall and Spring","5/9/2023 12:00", "5/9/2023 14:00","Studies design of information systems from a data perspective for engineering and business applications; data modeling, including entity-relationship (E-R) and object approaches; user-centric information requirements and data sharing; fundamental concepts of database management systems (DBMS) and their applications; alternative data models, with emphasis on relational design; SQL; data normalization; data-driven application design for personal computer, server-based, enterprise-wide, and Internet databases; and distributed data applications.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails Cour21 = new Courses.CourseDetails("Data Science Engineering with Python", "No pre-requisite", "Data Architecture Management", "DAMG 6105", "CRN071", "Alex Ferguson","Fall and Spring","9/6/2023 12:00", "9/6/2023 14:00","Studies the Python programming language with data science as the application domain. Offers students an opportunity to learn how to perform complex numerical calculations, fixed data types, space efficiency, and vector manipulations. Covers tools and techniques for manipulating tables, spreadsheets, and group and pivot tables involving extremely large data sets. Covers large multidimensional arrays and matrices and the high-level mathematical functions to operate on these arrays. Studies how to use Python to manipulate the classic math and science algorithms. Analyzes helper functions such as linear and nonlinear regression, integration, Fourier transformations, numerical optimization, etc. Includes higher-level classes for manipulating and visualizing data. Applies tools and techniques to classical data science using cases such as time series forecasting, social network analysis, text analytics, and big data processing.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails Cour22 = new Courses.CourseDetails("Advanced Database Management Systems", "DAMG 6210 with a minimum grade of B or INFO 6210 with a minimum grade of B", "Data Architecture Management", "DAMG 7275", "CRN072", "Pep Gadialo","Fall and Spring","9/9/2023 16:00", "9/9/2023 17:30","Introduces the skill set required to become a serious database applications developer. Offers an overview of the Oracle9i object-relational database system for those who have mastered the fundamental principles of database design and are competent with basic SQL. Gives students the opportunity to develop a strong understanding of the PL/SQL programming language, which is used to create triggers, user-generated functions, stored procedures, and packages for programming Oracle objects. Emphasizes advanced SQL features and Oracle-specific SQL enhancements. Covers optimization and tuning issues. Covers corresponding material for Transact-SQL (used for Microsoft SQL Server and Sybase database systems) as time and resources permit.",4,"un-enrolled", 10, "online","NA",4,0);
      
        Courses.CourseDetails Cour24 = new Courses.CourseDetails("Data Warehousing and Business Intelligence", "DAMG 6210 with a minimum grade of B or DAMG 7275 with a minimum grade of B", "Data Analytics", "DAMG 7290", "CRN079", "Tuchel","Fall and Spring","10/18/2023 08:00", "10/18/2023 10:00","Examines the technical and management aspects of building a data warehouse. Explores the architecture, infrastructure, processes, data quality, database design, and data analysis involved in building the data warehouse for business analysis. Management issues include business goals, tool selection, project management, personnel skills, training, and user requirements. Topics include dimensional data modeling, extraction/transformation/load processes, data quality problems, datamarts, operational data stores (ODS), staging databases, and online analytic processing (OLAP).",4,"un-enrolled",10,"online","NA",4,0);
        Courses.CourseDetails Cour65 = new Courses.CourseDetails("Web Programming using Java", "No pre-requisite", "Information Systems", "INFO 6150", "CRN065", "John Durairaj","Fall and Spring","9/9/2023 08:00", "9/9/2023 10:00","Exposes students to both conceptual and technical aspects of Web design. User experience design is the discipline of creating a useful and usable website or application that is easily navigated and meets the needs of both the site owner and its users. Covers Web standards and best practices. Studies the fundamental concepts, techniques, practices, work flows, and tools associated with the practice of user-experience design in Web interfaces. Offers students an opportunity to learn the core principles of information architecture, usability, marketing hierarchy, and user experience for contextual, value-driven websites. Additional areas of focus include typography, color theory and composition, responsive design, CSS3 concepts, basic scripting, and JavaScript libraries to create functional, effective, and visually appealing websites.",4,"un-enrolled",10,"online","NA",4,0);
//       
        
        coursehistory.add(Cour1);
        coursehistory.add(Cour2);
        coursehistory.add(Cour3);
        coursehistory.add(Cour4);
        coursehistory.add(Cour5);
        coursehistory.add(Cour6);
        coursehistory.add(Cour7);
        coursehistory.add(Cour8);
        coursehistory.add(Cour9);
        coursehistory.add(cour10);
        coursehistory.add(Cour11);
        coursehistory.add(Cour12);
        coursehistory.add(Cour13);
        coursehistory.add(Cour14);
        coursehistory.add(cour15);
        coursehistory.add(Cour16);
        coursehistory.add(Cour17);
        coursehistory.add(Cour19);
        coursehistory.add(cour20);
        coursehistory.add(Cour21);
        coursehistory.add(Cour22);
        coursehistory.add(Cour24);
        coursehistory.add(Cour65);
        
        history.add(person1);
        history.add(person2);
        history.add(person3);
        history.add(person4);
        history.add(person5);
        history.add(person6);
        
        this.professor_courselist = new ArrayList<ProfessorCourses>();

        
        
        ProfessorCourses pc1 = new ProfessorCourses("Alex", "Ferguson","002817662");
        pc1.addCourse(Cour1);
        pc1.addCourse(Cour6);
        pc1.addCourse(Cour16);
        pc1.addCourse(Cour21);
        ProfessorCourses pc2 = new ProfessorCourses("Pep", "Gadialo", "002271578");
        pc1.addCourse(Cour2);
        pc1.addCourse(Cour7);
        pc1.addCourse(Cour17);
        pc1.addCourse(Cour22);
        ProfessorCourses pc9 = new ProfessorCourses("Annie", "","002837662");
        pc9.addCourse(Cour11);
        pc9.addCourse(Cour14);
        
        ProfessorCourses pc8 = new ProfessorCourses("Katie", "", "002276578");
        pc8.addCourse(Cour12);
        pc8.addCourse(cour15);
        
        ProfessorCourses pc7 = new ProfessorCourses("Alvaro", "mortae","002777662");
        pc7.addCourse(Cour13);
    
        
        ProfessorCourses pc4 = new ProfessorCourses("Zidane", "", "002816767");
         pc4.addCourse(Cour3);
        pc4.addCourse(Cour8);
        ProfessorCourses pc3 = new ProfessorCourses("Tuchel", "", "002816766");
        pc3.addCourse(Cour4);
        pc3.addCourse(Cour9);
        pc3.addCourse(cour10);
        pc3.addCourse(Cour24);
        pc3.addCourse(cour20);


        ProfessorCourses pc5 = new ProfessorCourses("John", "Durairaj", "002816764");
         pc5.addCourse(Cour5);
         pc5.addCourse(Cour65);
        
        professor_courselist.add(pc1);
        professor_courselist.add(pc2);
        professor_courselist.add(pc3);
        professor_courselist.add(pc4);
        professor_courselist.add(pc5);
        professor_courselist.add(pc9);
        professor_courselist.add(pc8);
        professor_courselist.add(pc7);
    
     // add courses to students
    
      this.regcoursehistory = new ArrayList<registercours>();

   //    public Courses(String Subject, String pre_requisite, String Core_requisite, String Subject_code, String CRN, String professor_name, String Term_offered, String startDateTimeString, String endDateTimeString, String Description) //throws ParseException{
     
        registercours reguser1 = new registercours("Dev Mithunisvar", "NEU01","awating","NotApplicable","NA","NA");
         Courses.CourseDetails C1 = new Courses.CourseDetails("Application Development and Engineering", "No pre-requisite", "Information Systems", "INFO 5100", "CRN061", "Alex Ferguson","Fall and Spring","9/5/2023 08:00", "9/5/2023 10:00","Takes students in a step-by-step manner through the process of systematically combining UX techniques, business processes, and complex data models to assemble applications that are user-friendly and meet business requirements. Employs the object-oriented paradigm, visual user experience, and system design principles to put together complicated, powerful, real-world applications. The primary objective of this course is to practice social-technical software engineering methods and tools to solve real-world problems. Offers students an opportunity to learn innovative design and programming techniques to build significant business applications quickly; to practice simple and smart ways of making software construction enjoyable; and to master the art of how to systematically write software programs to solve any business problem.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails C2 = new Courses.CourseDetails("Data Science Engineering and Tools", "No pre-requisite", "Information Systems", "INFO 6105", "CRN062", "Pep Gadialo","Fall and Spring","9/6/2023 08:00", "9/6/2023 10:00","Introduces the fundamental techniques for machine learning and data science engineering. Discusses a variety of machine learning algorithms, along with examples of their implementation, evaluation, and best practices. Lays the foundation of how learning models are derived from complex data pipelines, both algorithmically and practically. Topics include supervised learning (parametric/nonparametric algorithms, support vector machines, kernels, neural networks, deep learning) and unsupervised learning (clustering, dimensionality reduction, recommender systems). Based on numerous real-world case studies.",4,"un-enrolled", 10, "online","NA",4,0);
        Courses.CourseDetails C3 = new Courses.CourseDetails("Big Data Engineering", " INFO 6205, INFO 6150, INFO 7390", "Information Systems", "INFO 7003", "CRN063", "Zidane","Fall and Spring","9/7/2023 18:00", "9/7/2023 19:00","ntroduces a general framework for thinking about big data. Services such as Web analytics and intelligent e-commerce have promoted a rapid increase in the volume of data generated, analyzed, and archived. In order to solve the problems related to big data, a newer type of database product has emerged. Covers how to apply technologies like Hadoop, Accumulo, MongoDB, and various NoSQL databases to build simple, robust, and efficient systems to manage and analyze big data. Also describes an easy approach to big data systems that can be built and run by a small team of students. Guides students through the theory of big data systems, how to implement them in practice, and how to deploy and operate them once they are built.",4,"un-enrolled", 10 ,"offline","NA",4,0);
        Courses.CourseDetails C4 = new Courses.CourseDetails("Advanced Data Science", "INFO 6105", "Information Systems", "INFO 7390", "CRN064", "Tuchel","Fall and Spring","9/8/2023 08:00", "9/8/2023 10:00","Covers a wide range of skills and responsibilities that are necessary for managing complex business performance and operational data. Such data tend to be fragmented, poorly organized, and often flawed. Offers students an opportunity to learn how a more up-to-date mapping of complex data works and to be alerted to the care and attention they must give to such a task as well as the implications of the results. Covers best practices for managing all aspects of the data transformation life cycle, covering broad areas such as requirements gathering, meta-model design, data integration and transformation, as well as implementation and ongoing operations. Discusses tools for mapping fragmented data into business intelligence solutions that guide successful strategies.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails C5 = new Courses.CourseDetails("Web development", "No pre-requisite", "Information Systems", "INFO 6150", "CRN065", "John Durairaj","Fall and Spring","9/9/2023 08:00", "9/9/2023 10:00","Exposes students to both conceptual and technical aspects of Web design. User experience design is the discipline of creating a useful and usable website or application that is easily navigated and meets the needs of both the site owner and its users. Covers Web standards and best practices. Studies the fundamental concepts, techniques, practices, work flows, and tools associated with the practice of user-experience design in Web interfaces. Offers students an opportunity to learn the core principles of information architecture, usability, marketing hierarchy, and user experience for contextual, value-driven websites. Additional areas of focus include typography, color theory and composition, responsive design, CSS3 concepts, basic scripting, and JavaScript libraries to create functional, effective, and visually appealing websites.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails C6 = new Courses.CourseDetails("Smart Contract Application Engineering and Development", "CSYE 6200", "Information Systems", "INFO 7510", "CRN066", "Alex Ferguson","Fall and Spring","9/5/2023 08:00", "9/5/2023 10:00","Emphasizes the essential coding skills for implementing self-enforcing, multiparty, mutually beneficial, contractual rights and obligations on top of blockchain technologies. Offers students an opportunity to learn how to leverage the principles and mechanisms of “decentralized autonomous organization” to programmatically coordinate the interaction between participating parties at a global scale without the need for trusting a third party and how to build blockchain-type applications that automate the interaction of a network of participating entities such as buyers, sellers, suppliers, insurance, and finance.",4,"un-enrolled", 10, "offline","NA",4,0);
        
        reguser1.addCourse(C1);
        reguser1.addCourse(C2);
        reguser1.addCourse(C3);
        reguser1.addCourse(C4);
        reguser1.addCourse(C5);
        reguser1.addCourse(C6);

        
        
        registercours reguser2 = new registercours("Cristiano santos", "NEU02","awating","NotApplicable","NA","NA");
        Courses.CourseDetails C19 = new CourseDetails("Data Warehousing and Business Intelligence", "DAMG 6210 with a minimum grade of B or DAMG 7275 with a minimum grade of B", "Data Architecture Management", "DAMG 7290", "CRN074", "Alvaro mortae","Fall and Spring","9/8/2023 08:00", "9/8/2023 10:00","Examines the technical and management aspects of building a data warehouse. Explores the architecture, infrastructure, processes, data quality, database design, and data analysis involved in building the data warehouse for business analysis. Management issues include business goals, tool selection, project management, personnel skills, training, and user requirements. Topics include dimensional data modeling, extraction/transformation/load processes, data quality problems, datamarts, operational data stores (ODS), staging databases, and online analytic processing (OLAP)",4,"un-enrolled",10,"online","NA",4,0);
        Courses.CourseDetails C20 = new Courses.CourseDetails("Data Management and Database Design", "No pre-requisite", "Data Architecture Management", "DAMG 6210", "CRN075", "Tuchel","Fall and Spring","5/9/2023 12:00", "5/9/2023 14:00","Studies design of information systems from a data perspective for engineering and business applications; data modeling, including entity-relationship (E-R) and object approaches; user-centric information requirements and data sharing; fundamental concepts of database management systems (DBMS) and their applications; alternative data models, with emphasis on relational design; SQL; data normalization; data-driven application design for personal computer, server-based, enterprise-wide, and Internet databases; and distributed data applications.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails C21 = new Courses.CourseDetails("Data Science Engineering with Python", "No pre-requisite", "Data Architecture Management", "DAMG 6105", "CRN071", "Alex Ferguson","Fall and Spring","9/6/2023 12:00", "9/6/2023 14:00","Studies the Python programming language with data science as the application domain. Offers students an opportunity to learn how to perform complex numerical calculations, fixed data types, space efficiency, and vector manipulations. Covers tools and techniques for manipulating tables, spreadsheets, and group and pivot tables involving extremely large data sets. Covers large multidimensional arrays and matrices and the high-level mathematical functions to operate on these arrays. Studies how to use Python to manipulate the classic math and science algorithms. Analyzes helper functions such as linear and nonlinear regression, integration, Fourier transformations, numerical optimization, etc. Includes higher-level classes for manipulating and visualizing data. Applies tools and techniques to classical data science using cases such as time series forecasting, social network analysis, text analytics, and big data processing.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails C22 = new Courses.CourseDetails("Advanced Database Management Systems", "DAMG 6210 with a minimum grade of B or INFO 6210 with a minimum grade of B", "Data Architecture Management", "DAMG 7275", "CRN072", "Pep Gadialo","Fall and Spring","9/9/2023 16:00", "9/9/2023 17:30","Introduces the skill set required to become a serious database applications developer. Offers an overview of the Oracle9i object-relational database system for those who have mastered the fundamental principles of database design and are competent with basic SQL. Gives students the opportunity to develop a strong understanding of the PL/SQL programming language, which is used to create triggers, user-generated functions, stored procedures, and packages for programming Oracle objects. Emphasizes advanced SQL features and Oracle-specific SQL enhancements. Covers optimization and tuning issues. Covers corresponding material for Transact-SQL (used for Microsoft SQL Server and Sybase database systems) as time and resources permit.",4,"un-enrolled", 10, "online","NA",4,0);
      
        reguser2.addCourse(C19);
        reguser2.addCourse(C20);
        reguser2.addCourse(C21);
        reguser2.addCourse(C22);
        
        registercours reguser3 = new registercours("Georgina rodri", "NEU03","awating","NotApplicable","NA","NA");
        Courses.CourseDetails C9 = new Courses.CourseDetails("Concepts of Object-Oriented Design", "No pre-requisite", "Software Engineering", "CSYE 6200", "CRN054", "Tuchel","Fall and Spring","9/8/2023 08:00", "9/8/2023 9:00","Introduces object-oriented design and programming via the Java programming language; the use of inheritance, composition, and interface classes in software design; development of Java applets and applications; study of the Java class libraries, including the swing tool kit for building human computer interfaces, the network package for development of client-server systems, and the collections’ package for data structures and sorting algorithms. Requires a course project. Requires knowledge of C programming",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails C10 = new Courses.CourseDetails("High-Performance Parallel Machine Learning and AI", "INFO 6105, DAMG 6105", "Software Engineering", "CSYE 7105", "CRN055", "Tuchel","Fall and Spring","9/9/2023 08:00", "9/9/2023 10:00","Explores the parallelization of machine learning and deep learning code that leads to high performance on heterogeneous cluster architectures. Includes the applications to a variety of domains, including image classification, speech recognition, and natural language processing, etc. Covers a brief overview of the emerging parallel computing applications. Analyzes system architectures for different kinds of parallel computing systems (shared-memory system, distributed-memory system, accelerator system, and hybrid). Offers students an opportunity to practice the principles and the practice of the emerging parallelism-based machine-learning paradigm.",4,"un-enrolled",10,"offline","NA",4,0);
         Courses.CourseDetails C11 = new Courses.CourseDetails("Deployment and Operation of Software Applications", " CSYE 6220 with a minimum grade of B- or INFO 6250 with a minimum grade of B-", "Software Engineering", "CSYE 7220", "CRN056", "Annie ","Fall and Spring","9/7/2023 08:00", "9/7/2023 10:00","Introduces the four most popular infrastructure languages—Chef, Puppet, Ansible, and Salt— and codes with them in the same way that we code with Java, Python, C#, and Javascript. IT infrastructure languages and their underlying methods and tools, referred to as DevOps, bridge the gap between software development and software administration. Instead of recruiting CPU cycles on our laptops, we create and manage virtual IT infrastructures on a public cloud. Offers students an opportunity to learn how to manipulate virtual machines, containers, and lambdas and set up assembly lines on public clouds in the fashion of a Model T assembly line.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails C12 = new Courses.CourseDetails("Network Structures and Cloud Computing", "CSYE 6200 with a minimum grade of B- or INFO 5100 with a minimum grade of B- or INFO 5100 with a minimum grade of B-", "Software Engineering", "CSYE 6225", "CRN057", "Katie","Fall and Spring","9/6/2023 08:00", "9/6/2023 10:00","Offers a practical foundation in cloud computing and hands-on experience with the tools used in cloud computing. Designed as a foundation course for cloud-aware, adept professionals. Focuses on the fundamentals of cloud computing, the principal areas of cloud architectures, cloud security, cloud governance, cloud storage, cloud virtualization, and cloud capacity. Discusses the Internet evolution that led to cloud and how cloud applications revolutionized Web applications.",4,"un-enrolled", 10, "online","NA",4,0);
        reguser3.addCourse(C9);
        reguser3.addCourse(C10);
         reguser3.addCourse(C11);
        reguser3.addCourse(C12);
        
        
        
        registercours reguser4 = new registercours("Nikhil", "NEU04","awating","Applied","Data Analyst","Google");
         Courses.CourseDetails C119 = new CourseDetails("Data Warehousing and Business Intelligence", "DAMG 6210 with a minimum grade of B or DAMG 7275 with a minimum grade of B", "Data Architecture Management", "DAMG 7290", "CRN074", "Alvaro mortae","Fall and Spring","9/8/2023 08:00", "9/8/2023 10:00","Examines the technical and management aspects of building a data warehouse. Explores the architecture, infrastructure, processes, data quality, database design, and data analysis involved in building the data warehouse for business analysis. Management issues include business goals, tool selection, project management, personnel skills, training, and user requirements. Topics include dimensional data modeling, extraction/transformation/load processes, data quality problems, datamarts, operational data stores (ODS), staging databases, and online analytic processing (OLAP)",4,"un-enrolled",10,"online","NA",4,0);
        Courses.CourseDetails C120 = new Courses.CourseDetails("Data Management and Database Design", "No pre-requisite", "Data Architecture Management", "DAMG 6210", "CRN075", "Tuchel","Fall and Spring","5/9/2023 12:00", "5/9/2023 14:00","Studies design of information systems from a data perspective for engineering and business applications; data modeling, including entity-relationship (E-R) and object approaches; user-centric information requirements and data sharing; fundamental concepts of database management systems (DBMS) and their applications; alternative data models, with emphasis on relational design; SQL; data normalization; data-driven application design for personal computer, server-based, enterprise-wide, and Internet databases; and distributed data applications.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails C121 = new Courses.CourseDetails("Data Science Engineering with Python", "No pre-requisite", "Data Architecture Management", "DAMG 6105", "CRN071", "Alex Ferguson","Fall and Spring","9/6/2023 12:00", "9/6/2023 14:00","Studies the Python programming language with data science as the application domain. Offers students an opportunity to learn how to perform complex numerical calculations, fixed data types, space efficiency, and vector manipulations. Covers tools and techniques for manipulating tables, spreadsheets, and group and pivot tables involving extremely large data sets. Covers large multidimensional arrays and matrices and the high-level mathematical functions to operate on these arrays. Studies how to use Python to manipulate the classic math and science algorithms. Analyzes helper functions such as linear and nonlinear regression, integration, Fourier transformations, numerical optimization, etc. Includes higher-level classes for manipulating and visualizing data. Applies tools and techniques to classical data science using cases such as time series forecasting, social network analysis, text analytics, and big data processing.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails C124 = new Courses.CourseDetails("Data Warehousing and Business Intelligence", "DAMG 6210 with a minimum grade of B or DAMG 7275 with a minimum grade of B", "Data Analytics", "DAMG 7290", "CRN079", "Tuchel","Fall and Spring","10/18/2023 08:00", "10/18/2023 10:00","Examines the technical and management aspects of building a data warehouse. Explores the architecture, infrastructure, processes, data quality, database design, and data analysis involved in building the data warehouse for business analysis. Management issues include business goals, tool selection, project management, personnel skills, training, and user requirements. Topics include dimensional data modeling, extraction/transformation/load processes, data quality problems, datamarts, operational data stores (ODS), staging databases, and online analytic processing (OLAP).",4,"un-enrolled",10,"online","NA",4,0);
        reguser4.addCourse(C119);
        reguser4.addCourse(C124);
         reguser4.addCourse(C120);
        reguser4.addCourse(C121);
        
        registercours reguser5 = new registercours("David ", "NEU05","awating","Applied","Business Manager","Walmart");
        Courses.CourseDetails Course9 = new Courses.CourseDetails("Concepts of Object-Oriented Design", "No pre-requisite", "Software Engineering", "CSYE 6200", "CRN054", "Tuchel","Fall and Spring","9/8/2023 08:00", "9/8/2023 9:00","Introduces object-oriented design and programming via the Java programming language; the use of inheritance, composition, and interface classes in software design; development of Java applets and applications; study of the Java class libraries, including the swing tool kit for building human computer interfaces, the network package for development of client-server systems, and the collections’ package for data structures and sorting algorithms. Requires a course project. Requires knowledge of C programming",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails Course10 = new Courses.CourseDetails("High-Performance Parallel Machine Learning and AI", "INFO 6105, DAMG 6105", "Software Engineering", "CSYE 7105", "CRN055", "Tuchel","Fall and Spring","9/9/2023 08:00", "9/9/2023 10:00","Explores the parallelization of machine learning and deep learning code that leads to high performance on heterogeneous cluster architectures. Includes the applications to a variety of domains, including image classification, speech recognition, and natural language processing, etc. Covers a brief overview of the emerging parallel computing applications. Analyzes system architectures for different kinds of parallel computing systems (shared-memory system, distributed-memory system, accelerator system, and hybrid). Offers students an opportunity to practice the principles and the practice of the emerging parallelism-based machine-learning paradigm.",4,"un-enrolled",10,"offline","NA",4,0);
         
        Courses.CourseDetails Course14 = new Courses.CourseDetails("Operating Systems", "INFO 6205 with a minimum grade of B-", "Software Engineering", "CSYE 6230", "CRN059", "Annie","Fall and Spring","9/8/2023 08:00", "9/8/2023 10:00","Covers basic concepts of operating systems and system programming, such as utility programs, subsystems, and multiple-program systems. Main topics include processes, interprocess communication, and synchronization; memory allocation, segmentation, and paging; loading, linking, and libraries; resource allocation, scheduling, and performance evaluation; file systems, storage devices, and I/O systems; and protection, security, and privacy. Emphasizes key concepts through code design and development.",4,"un-enrolled",10,"offline","NA",4,0);
        Courses.CourseDetails Course15 = new Courses.CourseDetails("Concepts of Object-Oriented Design with C++", "No pre-requisite", "Software Engineering", "CSYE 6205", "CRN060", "Katie","Fall and Spring","9/9/2023 08:00", "9/9/2023 10:00","Introduces object-oriented design and programming via the C++ programming language. Covers the use of inheritance and composition in software design and development of complex C++ applications. Topics include classes, overloading, data abstraction, information hiding, encapsulation, inheritance, polymorphism, file processing, templates, exceptions, container classes, and low-level language features. Requires a course project.",4,"un-enrolled",10,"offline","NA",4,0);
        
        reguser5.addCourse(Course9);
        reguser5.addCourse(Course10);
         reguser5.addCourse(Course14);
        reguser5.addCourse(Course15);
        
       

        registercours reguser6 = new registercours("Mateo trucker", "NEU06","awating","Hired","Goverance Manager","Amazon");
         Courses.CourseDetails Course7 = new Courses.CourseDetails("Program Structure and Algorithms", "INFO 5100 , CSYE 6200", "Information Systems", "INFO 6205", "CRN052", "Pep Gadialo","Fall and Spring","9/5/2023 08:00", "9/5/2023 10:00","Presents data structures and related algorithms, beginning with a brief review of dynamic memory allocation. Discusses the fundamental data structures in detail, including the abstract representation, supporting algorithms, and implementation methods. Focuses on understanding the application of the abstract data structure and the circumstances that affect implementation decisions. Covers lists, stacks, queues, trees, hash tables, and graphs. Covers recursion and searching and sorting algorithms in detail. Emphasizes data abstraction and encapsulation in code design. Explores external storage structures, time permitting.",4,"un-enrolled", 10, "online","NA",4,0);
        Courses.CourseDetails Course8 = new Courses.CourseDetails("Business Ethics and Intellectual Property for Engineers", "No pre-requisite", "Information Systems", "INFO 6660", "CRN053", "Zidane","Fall and Spring","9/6/2023 18:00", "9/6/2023 19:00","Seeks to support successful engineering careers by offering students an applied understanding of ethical principles in the workplace and fundamentals of intellectual property and the American legal system. Seeks to increase students’ awareness of the ethical implications of their work and to influence colleagues to think and act in a socially cognizant manner. Introduces ethical principles and codes of professional ethics; types of intellectual property (patents, trade secrets, trademarks, copyrights); and fundamentals of the American legal system (sources of American law, contracts, torts, intellectual property, antitrust). Offers students an opportunity to practice verbal communication and presentation skills; develop an applied understanding of the relationship and differences between legal liability and ethical behavior; and develop applied critical thinking, communication, and presentation skills.",4,"un-enrolled", 10 ,"offline","NA",4,0);
         Courses.CourseDetails Co1 = new Courses.CourseDetails("Application Development and Engineering", "No pre-requisite", "Information Systems", "INFO 5100", "CRN061", "Alex Ferguson","Fall and Spring","9/5/2023 08:00", "9/5/2023 10:00","Takes students in a step-by-step manner through the process of systematically combining UX techniques, business processes, and complex data models to assemble applications that are user-friendly and meet business requirements. Employs the object-oriented paradigm, visual user experience, and system design principles to put together complicated, powerful, real-world applications. The primary objective of this course is to practice social-technical software engineering methods and tools to solve real-world problems. Offers students an opportunity to learn innovative design and programming techniques to build significant business applications quickly; to practice simple and smart ways of making software construction enjoyable; and to master the art of how to systematically write software programs to solve any business problem.",4,"un-enrolled", 10, "offline","NA",4,0);
        Courses.CourseDetails Co2 = new Courses.CourseDetails("Data Science Engineering and Tools", "No pre-requisite", "Information Systems", "INFO 6105", "CRN062", "Pep Gadialo","Fall and Spring","9/6/2023 08:00", "9/6/2023 10:00","Introduces the fundamental techniques for machine learning and data science engineering. Discusses a variety of machine learning algorithms, along with examples of their implementation, evaluation, and best practices. Lays the foundation of how learning models are derived from complex data pipelines, both algorithmically and practically. Topics include supervised learning (parametric/nonparametric algorithms, support vector machines, kernels, neural networks, deep learning) and unsupervised learning (clustering, dimensionality reduction, recommender systems). Based on numerous real-world case studies.",4,"un-enrolled", 10, "online","NA",4,0);
        
        reguser6.addCourse(Course7);
        reguser6.addCourse(Course8);
        reguser6.addCourse(Co1);
        reguser6.addCourse(Co2);
        // Adding registercours objects to regcoursehistory
        regcoursehistory.add(reguser1);
        regcoursehistory.add(reguser2);
        regcoursehistory.add(reguser3);
        regcoursehistory.add(reguser4);
        regcoursehistory.add(reguser5);
        regcoursehistory.add(reguser6);
        
    
     this.sugg = new ArrayList<Suggestion>();
        Suggestion sugg1 = new Suggestion("Data Scientist", "INFO 6105: Data Science Engineering and Tools, INFO 7390: Advance Data science");
        Suggestion sugg2 = new Suggestion("Software Engineer", "INFO 6205: Program Structure and Algorithms, INFO 7390: INFO 7390  ");
        Suggestion sugg3 = new Suggestion("Data Analyst", "DAMG 7290: Data Warehousing and Business Intelligence, DAMG 7390: Advanced Database Management Systems  ");
        Suggestion sugg4 = new Suggestion("Program Manager", "INFO 6105: Data Science Engineering and Tools, INFO 7390: INFO 7390  ");
        Suggestion sugg5 = new Suggestion("Full-stack Developer", "INFO 6150: Web development, INFO 7150:  Smart Contract Application Engineering and Development");
        Suggestion sugg6 = new Suggestion("Analyst", "CSYE 6230: Operating Systems, CSY6225:Network Structures and Cloud Computing   ");

        sugg.add(sugg1);
        sugg.add(sugg2);
        sugg.add(sugg3);
        sugg.add(sugg4);
        sugg.add(sugg5);
        sugg.add(sugg6);
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     public ProfessorProfile SearchProfessorbyneuid(String neuid){
        for(ProfessorProfile p: ph){
            if(neuid.equals(p.getProf_id())){
                return p;
            }
            }
        return null;
    }
    
     public ProfessorCourses SearchProfessorCoursesbyneuid(String neuid){
         for(ProfessorCourses p: professor_courselist){
            if(neuid.equals(p.getProf_id())){
                return p;
            }
            }
        return null;
     }
      public void AddProfessor(ProfessorProfile e ){
        ph.add(e);
    }
    public void AddProfessor1(ProfessorCourses e ){
        professor_courselist.add(e);
    }
    public registercours SearchRegCoursesbyneuid(String neuid){
        for(registercours r: regcoursehistory){
            if(neuid.equals(r.getNEUID())){
                return r;
            }
        }
        return null;
    }
     public Studentde SearchStudentsbyneuid(String neuid){
        for(Studentde s: history){
            if(neuid.equals(s.getNEUID())){
                return s;
            }
        }
        return null;
    }
    

}
