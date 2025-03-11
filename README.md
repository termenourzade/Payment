فروشگاه

این اپلیکیشن تجاری برای شبیه‌سازی پرداخت‌های مختلف توسط مشتریان طراحی شده است. مشتریان می‌توانند با استفاده از روش‌های مختلف پرداخت خرید انجام دهند.


پروژه شامل یک پکیج به نام payment است که شامل کلاس‌ها و اینترفیس‌های زیر می‌باشد:

1. PaymentStrategy (interface)

2. CreditCardPayment (class)

3. PayPalPayment (class)

4. BitcoinPayment (class)

5. Customer (abstract class)

6. RegularCustomer (class)

7. PremiumCustomer (class)


اینترفیس PaymentStrategy :

این اینترفیس دارای دو متد اصلی است:

• void pay(double amount): متد پرداخت که مقدار پرداخت شده را دریافت می‌کند.

• String getPaymentDetails(): متد برای دریافت جزئیات مربوط به روش پرداخت.

کلاس‌های پرداخت:

• CreditCardPayment: 

  • فیلدها: cardNumber و cardHolderName

  • متدها: پیاده‌سازی pay و getPaymentDetails.

• PayPalPayment: 

  • فیلد: email

  • متدها: پیاده‌سازی pay و getPaymentDetails.

• BitcoinPayment: 

  • فیلد: walletAddress

  • متدها: پیاده‌سازی pay و getPaymentDetails.

کلاس Customer:

این کلاس نمایانگر مشتریان است و شامل موارد زیر است:

• فیلدها:

  • name: نام مشتری

  • paymentHistory: تاریخچه پرداخت‌ها

• متدها:

  • abstract void displayCustomerInfo(): متد برای نمایش اطلاعات مشتری.

  • void makePayment(PaymentStrategy paymentStrategy, double amount): متد برای انجام پرداخت.

  • void showPaymentHistory(): متد برای نمایش تاریخچه پرداخت‌ها.

زیرکلاس‌های Customer:

• RegularCustomer: 

  • نمایانگر مشتریان معمولی.

  • پیاده‌سازی متد displayCustomerInfo.

• PremiumCustomer: 

  • نمایانگر مشتریان پرمیوم.

  • پیاده‌سازی متد displayCustomerInfo.
