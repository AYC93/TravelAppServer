// package travel.app.service.RepoService;

// import org.springframework.stereotype.Service;
// import org.telegram.telegrambots.bots.TelegramLongPollingBot;
// import org.telegram.telegrambots.meta.TelegramBotsApi;
// import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
// import org.telegram.telegrambots.meta.api.objects.Update;
// import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
// import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

// @Service
// public class TelegramService extends TelegramLongPollingBot {

//     @Override
//     // echoes received message
//     public void onUpdateReceived(Update update) {
//         // We check if the update has a message and the message has text
//         if (update.hasMessage() && update.getMessage().hasText()) {
//             SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
//             message.setChatId(update.getMessage().getChatId().toString());
//             message.setText(update.getMessage().getText());

//             try {
//                 execute(message); // Call method to send the message
//             } catch (TelegramApiException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     @Override
//     public String getBotUsername() {
//         // TODO
//         return "shiokplanbot";
//     }

//     @Override
//     public String getBotToken() {
//         // TODO
//         return "6088418842:AAFHNg3qQuy_yobdDhRaAGlKJveI5uOtDU4";
//     }

// }
