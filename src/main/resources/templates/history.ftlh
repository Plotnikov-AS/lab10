<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lab 10</title>
</head>
<body>
<h1>Товары</h1>
<div id="bodyDiv">
    <table>
        <tr>
            <th>Наименование</th>
            <th>Количество</th>
            <th>Стоимость</th>
            <th>Дата</th>
        </tr>
        <#foreach product in history>
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getCount()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDat()}</td>
        </tr>
        </#foreach>
    </table><br>
    Общая сумма: <input type="text" value="${totalValue}" readonly>
    <a href="javascript:history.back()">Назад</a>
</div>
</body>
</html>