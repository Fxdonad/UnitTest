# Ứng Dụng Máy Tính - Kiểm Thử Đơn Vị Thủ Công

## Tổng Quan
Dự án này minh họa một ứng dụng máy tính cơ bản được triển khai bằng Java. Trọng tâm chính là thực hiện kiểm thử đơn vị thủ công mà không sử dụng bất kỳ thư viện kiểm thử bên ngoài nào như JUnit. Mục tiêu là kiểm tra tính đúng đắn của phương thức cộng đơn giản bằng cách sử dụng các trường hợp kiểm thử khác nhau.

### Tính Năng
- Một máy tính đơn giản với phương thức `add` để cộng hai số nguyên.
- Cách tiếp cận kiểm thử đơn vị thủ công bằng cách sử dụng các chức năng cơ bản của Java.

### Các Tệp
1. **Calculator.java**: Chứa phần triển khai của máy tính.
2. **CalculatorTest.java**: Chứa các kiểm thử đơn vị thủ công cho phương thức `add` của máy tính.

---

## Phương Pháp Kiểm Thử
### Mục Tiêu
Mục tiêu của các kiểm thử là xác minh tính đúng đắn của phương thức `add` trong các kịch bản sau:
- Cộng hai số dương.
- Cộng hai số âm.
- Cộng một số dương và một số âm.

### Cách Tiếp Cận
1. **Xác Nhận Thủ Công**: Các trường hợp kiểm thử được tạo ra bằng cách gọi phương thức `add` với các đầu vào cụ thể và so sánh thủ công kết quả với giá trị mong đợi.
2. **Ghi Nhận Kết Quả**: Kết quả của mỗi trường hợp kiểm thử được ghi lại trên bảng điều khiển với thông báo `Passed` hoặc `Failed`.

### Các Trường Hợp Kiểm Thử
| Trường Hợp Kiểm Thử | Đầu Vào 1 | Đầu Vào 2 | Kết Quả Mong Đợi | Kết Quả  |
|----------------------|-----------|-----------|------------------|----------|
| TC1                 | 5         | 10        | 15               | Passed   |
| TC2                 | -5        | -10       | -15              | Passed   |
| TC3                 | 5         | -10       | -5               | Passed   |

### Ví Dụ Triển Khai
Dưới đây là một ví dụ về cách mỗi trường hợp kiểm thử được triển khai:

```java
Calculator calculator = new Calculator();

// Trường Hợp Kiểm Thử 1: Cộng hai số dương
int result1 = calculator.add(5, 10);
if (result1 == 15) {
    System.out.println("Test Case 1 Passed: add(5, 10) = 15");
} else {
    System.out.println("Test Case 1 Failed: Expected 15 but got " + result1);
}
```

---

## Kết Quả
Tất cả các trường hợp kiểm thử đều được thực thi thành công và cho ra kết quả như mong đợi trong từng kịch bản. Dưới đây là kết quả chi tiết:

```
Test Case 1 Passed: add(5, 10) = 15
Test Case 2 Passed: add(-5, -10) = -15
Test Case 3 Passed: add(5, -10) = -5
```

---

## Kết Luận
Cách tiếp cận kiểm thử đơn vị thủ công đã chứng minh được tính đúng đắn của phương thức `add` trong các kịch bản khác nhau. Mặc dù cách tiếp cận này phù hợp cho các kiểm thử quy mô nhỏ, nhưng nên sử dụng các thư viện kiểm thử tự động như JUnit cho các dự án lớn hơn để nâng cao hiệu quả, khả năng đọc và bảo trì của kiểm thử.

## Link ChatGPT
https://chatgpt.com/share/677b3b50-598c-800d-b5d8-80c5bb9f6eb5