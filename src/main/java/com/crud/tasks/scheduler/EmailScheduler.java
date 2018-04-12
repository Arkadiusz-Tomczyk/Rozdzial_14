//package com.crud.tasks.scheduler;


//import org.springframework.stereotype.Component;
//
//@Component
//public class EmailScheduler {

//    private static final String SUBJECT = "Tasks: Once a day email";
//
//    @Autowired
//    private SimpleEmailService simpleEmailService;
//
//    @Autowired
//    private TaskRepository taskRepository;
//
//    @Autowired
//    private AdminConfig adminConfig;
//
//    @Scheduled(fixedDelayString = "10000")
//    public void sendInformationEmail() {
//        long size = taskRepository.count();
//        simpleEmailService.send(new Mail(
//                adminConfig.getAdminMail(),
//                SUBJECT,
//                "Currently in database you got: " + size + " tasks"));
//    }
//}
