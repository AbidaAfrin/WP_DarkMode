# WP_DarkMode
Web Automation of 'WP Dark Mode'

## Prerequisite
If you don’t have WordPress installed yet, you’ll need to install it on your hosting provider.
Before installing WordPress, ensure you have the following:

* #### Web Hosting: A server running PHP and MySQL.
* #### Domain Name: A domain linked to your hosting.
* #### Database: MySQL or MariaDB.

To install wordpress  [Watch the video](https://www.youtube.com/watch?v=usoJ6ckzUz8&list=PLyx8809HprAbF6uQ0P7fue4OX9l7GaoMD)


## Technology used:
* Programming Language: Java
* Browser Automation: Selenium Webdriver
* Test Runner: TestNG Framework
* IDE: Intellij idea
* Test Reporting Tool:  Allure

## Test Cases Covered
* Log in to WordPress.
* Check if the "WP Dark Mode" plugin is active, and install/activate it if needed.
* Enable Admin Dashboard Dark Mode (from Controls → Admin Panel Dark Mode.)
* Validate dark mode on the admin dashboard.
* Navigate to the WP Dark Mode.
* Change Floating Switch Style settings:From Customization → Switch Settings → Change the “Floating Switch Style” from the default selections (Select any one from the available options, except the default selected one).
* Change Switch Size: From Customization → Switch Settings → Switch Customization - Select Custom Switch size & Scale it to 220.
* Change Floating Switch Position: From Customization → Switch Settings - Change the Floating Switch Position (Left).
* Disable the keyboard shortcut for dark mode.
* Enable page transition animation and change the animation effect: From Customization → Site Animation → “Enable Page-Transition Animation” & change the Animation Effect from the default selections.
* Validate dark mode on the frontend.
 
## Steps to Implement the Test Suite:
1. Clone the repository
2. Open the project in an IDE (Intellij, Eclipse etc.)
3. Use Maven for dependency management and project structure: Add the Selenium, TestNG, Dotenv and allure dependencies to your pom.xml.
4. Create the .env File (example has given in .env.example file)
5. Run the tests
