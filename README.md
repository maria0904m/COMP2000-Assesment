# COMP2000-Assesment
Overview
Holiday Management Application is a mobile phone application that the students developed for a university assignment in class. It is intended to reduce the hassle surrounding the holiday application among employees. Employees will be able to apply for holidays, check their remaining holidays, update their personal details like addresses via the app. The design of the interface follows the roles assigned to all accountants and administrators for safeguarding sensitive information.

Although the design of the project was successful, there were numerous challenges with button interactions, particularly the functionality of navigation, during its implementation. This README shall discuss the app's purpose, describe challenges encountered, and give instructions on how to set up and run the project.

Features
User Login: Secure login module for employees and administrators. It is designed such that the system can permit only those authorized users to their respective data.
Holiday Management - A user can apply for holidays, and the balance of holidays remaining can be viewed. 
Role-Based Access Control - There is a very clear separation of roles between the employee and the admin roles, each of which has a different set of permissions. 
UI - User interface very simple and intuitive design, where basic functions are exposed using the user-friendly layout.
How to Install
Prerequisites
Ensure you have installed the following to set up this project:

Android Studio - For compilation and running.
JDK: Versi 8 or above.
Installation Procedure
Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/holiday-management-app.git
Open the Project in Android Studio:

Open up Android Studio and click on Open an Existing Project.
Find the project that was cloned, then open the folder.
Build the Project:

Android Studio will automatically download all dependencies.
After syncing is complete, click Build > Make Project to compile the app.
Run the App:

Connect your device via USB or use the Android Emulator.
Choose the target device and click the Run button to start the app.
Usage of App
Login:

Employees and administrators can login into the app using a username and password.
According to the user, the app will route to either Main Employee Page or Main Admin Page.
Main Employee Page:

Once logged in, an employee can:
Request Holiday: Holiday requests can be done using a button.
View Remaining Holidays: To check the holiday balance.
View/Edit Details: To update personal details, such as contact information.
Navigation:

There is a bottom navigation bar to easily reach the main sections, including calendar and settings.
Current Issues
The design phase went smoothly, but during the implementation process, there are some issues that are still ongoing:

Button Navigation:

The app always crashes, or it redirects the user back to the login page when one activity is called from another. Some button functionalities or transitions between activities lead to this bug.
Partial Role-Based Access Control:

Splitting employee/administrator privileges using a role-based system is very much in the development stage. So far, access control has not been handled, and it needs to be improved.
Error Handling and Debugging:

It contains a weak error handler, resulting in a crash or sometimes undesired behavior while working with most of its features.
Future Improvements
Navigation and Button Issues:

The navigation issues shall be fixed to allow for smooth interactivity between activities without any crashes or navigation to the login screen.
Role-Based Access Full Implementation:

The application shall implement full role-based access so that employees and the administrators can access their respective data and features appropriately.
Error Handling:

Catch all exceptions that could make an app crash and provide at least a nice error message to the user.
Improved UI/UX:

Make the UI smooth with nice visuals and user-friendly. You may add any animation and active responses/ feedback.
Contributing
This is an academic project, but you are very welcome to join improving the developing process. If you wish to contribute, you can:

Fork the repo.
Create a feature branch.
Do your thing.
Push changes and make a pull request.
