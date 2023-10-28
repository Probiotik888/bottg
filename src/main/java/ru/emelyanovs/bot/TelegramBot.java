package ru.emelyanovs.bot;

import lombok.extern.slf4j.Slf4j;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.emelyanovs.config.BotConfig;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class TelegramBot extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "ConDomSPbBot";
    }

    @Override
    public String getBotToken() {
        return "6659713781:AAHFyQ3HOYf2eOIPyZfY7AKK5hZcd9ECRUM";
    }

    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            switch (messageText) {
                case "/start":
                    startCommandReceived(chatId, update.getMessage().getChat().getFirstName());

                    break;

                case "Товары":

                    goods(chatId);
                    break;

                case "Информация":

                    sendMessageWithImage(chatId, "❗Правила оформления заказа❗ \n" +
                            "Все очень просто. В боте выбираете товар и оплачиваете. После этого заказ поступает в работу! \n" +
                            "\n" +
                            "⚡Доставка⚡ \n" +
                            "После того, как вы оформили заказ, наш курьер выдвигается к вам. Примерное время ожидания срочного заказа 15 минут, но может изменяться в зависимости от трафика.\n" +
                            "Также Вы можете заказать доставку к определённому времени⏲", "https://www.nicepng.com/png/detail/72-729855_info-man-information-help-support-user-comments-customer.png");
                    break;

                default:
                        sendMessage(chatId, "Такой команды не существует");

            }
        } else if (update.hasCallbackQuery()) {
            String callBackData = update.getCallbackQuery().getData();
            long messageId = update.getCallbackQuery().getMessage().getMessageId();
            long chatId = update.getCallbackQuery().getMessage().getChatId();

            if(callBackData.equals("G1_BUTTON")) {

                sendMessageWithImage(chatId, "Товар №1: «Condom MAXUS 1 шт.» \n" +
                        "Цена: 100 рублей \n" +
                        "В наличии ✅\n" +
                        "\n" +
                        "Реквизиты для оплаты: 89502527742 \n" +
                        "(Сбер - Вячеслав Юрьевич Е.) \n" +
                        "\n" +
                        "После оплаты писать сюда ➠ @SPbdirect \n" +
                        "В сообщении указываем номер товара, адрес доставки и прикрепляем чек. \n" +
                        "\n" +
                        "Удачных покупок!\uD83D\uDE4B", "https://sun9-18.userapi.com/impg/xpUhQZpK0P11JwnRDaobTQujM0kXNuKyd7-fDw/MK5hAZMkOiY.jpg?size=1280x1266&quality=96&sign=ad7ff17e0b58de4421f76bfbb6acc974&type=album");
            }

            else if(callBackData.equals("G2_BUTTON")) {

                sendMessageWithImage(chatId, "Товар №2: «Condoms MAXUS 3 шт.» \n" +
                        "Цена: 280 рублей \n" +
                        "В наличии ✅\n" +
                        "\n" +
                        "Реквизиты для оплаты: 89502527742 \n" +
                        "(Сбер - Вячеслав Юрьевич Е.) \n" +
                        "\n" +
                        "После оплаты писать сюда ➠ @SPbdirect \n" +
                        "В сообщении указываем номер товара, адрес доставки и прикрепляем чек. \n" +
                        "\n" +
                        "Удачных покупок!\uD83D\uDE4B", "https://sun9-31.userapi.com/impg/0ktrZcXpEhiTjCnPEOjt_b0C-ZJwn_15n0NQIg/2TIdjV-nMVU.jpg?size=1280x1199&quality=96&sign=60f5623e0da0e2071749ecd2a8d8225b&type=album");
            }

            else if(callBackData.equals("G3_BUTTON")) {

                sendMessageWithImage(chatId, "Товар №3: «Condoms MAXUS 5 шт.» \n" +
                        "Цена: 450 рублей \n" +
                        "В наличии ✅\n" +
                        "\n" +
                        "Реквизиты для оплаты: 89502527742 \n" +
                        "(Сбер - Вячеслав Юрьевич Е.) \n" +
                        "\n" +
                        "После оплаты писать сюда ➠ @SPbdirect \n" +
                        "В сообщении указываем номер товара, адрес доставки и прикрепляем чек. \n" +
                        "\n" +
                        "Удачных покупок!\uD83D\uDE4B", "https://sun9-32.userapi.com/impg/6h4RCx79B0gBTa4GTycBQp3lbP4KCWhZjPD4sw/wWTlV_MGc3w.jpg?size=1280x1035&quality=96&sign=50f2be354881204730ff869d73a598f8&type=album");
            }

            else if(callBackData.equals("G4_BUTTON")) {

                sendMessageWithImage(chatId, "Товар №4: «Condoms MAXUS 10 шт.» \n" +
                        "Цена: 850 рублей \n" +
                        "В наличии ✅\n" +
                        "\n" +
                        "Реквизиты для оплаты: 89502527742 \n" +
                        "(Сбер - Вячеслав Юрьевич Е.) \n" +
                        "\n" +
                        "После оплаты писать сюда ➠ @SPbdirect \n" +
                        "В сообщении указываем номер товара, адрес доставки и прикрепляем чек. \n" +
                        "\n" +
                        "Удачных покупок!\uD83D\uDE4B", "https://sun9-7.userapi.com/impg/LM-U8-lUAu4tNmA3dIziMOABI2vm4-8ysHJKnA/N7xAKxLfRWU.jpg?size=953x1080&quality=96&sign=3896f6177b20cc20053851ed251e5363&type=album");
            }
        }
    }

    private void goods(long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText("☛           Ассортимент       ☚");

        InlineKeyboardMarkup markupInLine = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInLine = new ArrayList<>();
        List<InlineKeyboardButton> rowInlineUp = new ArrayList<>();
        List<InlineKeyboardButton> rowInlineDown = new ArrayList<>();

        var button1 = new InlineKeyboardButton();
        button1.setText("MAXUS 1 шт.");
        button1.setCallbackData("G1_BUTTON");

        var button2 = new InlineKeyboardButton();
        button2.setText("MAXUS 3 шт.");
        button2.setCallbackData("G2_BUTTON");

        var button3 = new InlineKeyboardButton();
        button3.setText("MAXUS 5 шт.");
        button3.setCallbackData("G3_BUTTON");

        var button4 = new InlineKeyboardButton();
        button4.setText("MAXUS 10 шт.");
        button4.setCallbackData("G4_BUTTON");

        rowInlineUp.add(button1);
        rowInlineUp.add(button2);
        rowInlineDown.add(button3);
        rowInlineDown.add(button4);

        rowsInLine.add(rowInlineUp);
        rowsInLine.add(rowInlineDown);

        markupInLine.setKeyboard(rowsInLine);
        message.setReplyMarkup(markupInLine);

        try {
            execute(message);
        }
        catch (TelegramApiException e) {
            log.error("Ошибка: " + e.getMessage());
        }
    }

    private void startCommandReceived(long chatId, String name) {

        String answer = "Привет, " + name + "\uD83D\uDE3C. Этот телеграм бот поможет тебе остаться в близости и сохранить время для самых нежных моментов.\n" +
                "\n" +
                "Заказывая у нас товар, ты получаешь:\n" +
                "~ бесконтактную доставку за 15 минут!\n" +
                "~ дополнительные принадлежности по заказу\n" +
                "\n" +
                "❗Очень важно❗\n" +
                "Мы используем презервативы компании MAXUS, так как это качественный и проверенный миллионами контрацептив, однако лишь компания несёт ответственность за надёжность своего продукта.\n" +
                "Мы являемся ТОЛЬКО доставкой❤";
        log.info("Ответил пользователю " + name);
        sendMessage(chatId, answer);

    }

    private void sendMessage(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));

        message.setText(textToSend);

        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();

        row.add("Товары");

        row.add("Информация");
        keyboardRows.add(row);

        keyboardMarkup.setKeyboard((keyboardRows));
        keyboardMarkup.setResizeKeyboard(true);

        message.setReplyMarkup(keyboardMarkup);

        try {
            execute(message);
        }
        catch (TelegramApiException e) {
            log.error("Ошибка: " + e.getMessage());
        }
    }

    private void sendMessageWithImage(long chatId, String textToSend, String imageUrl) {
        SendPhoto photo = new SendPhoto();
        photo.setChatId(String.valueOf(chatId));
        photo.setPhoto(new InputFile(imageUrl));
        photo.setCaption(textToSend); // Устанавливаем текст описания к картинке

        try {
            execute(photo); // Отправляем картинку с текстом описания
        } catch (TelegramApiException e) {
            log.error("Ошибка: " + e.getMessage());
        }
    }


}

