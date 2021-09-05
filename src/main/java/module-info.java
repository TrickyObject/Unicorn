module mts.support.validator {
//    модулю нужны библиотеки
    requires javafx.controls;
    requires java.xml;
    requires javafx.fxml;
//позволяет экспортировать модуль проекта в модуль плагина
    exports mts.support.validator;
//открывает доступ плагина к содержимому модуля проекта
    opens mts.support.validator to javafx.fxml;
}