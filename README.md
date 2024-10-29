# JavaFX Acronym & Password Generator

## Overview
This project includes a JavaFX GUI application for generating acronyms and passwords from user-input text. It consists of the `StringGenerator` class for text manipulation and a user-friendly JavaFX interface to test the functionalities.

### Applications

1. **StringGenerator Class**:
   - **generateAcronym(String text)**: Generates an acronym from capitalized words and numeric tokens in the input text.
   - **generatePassword(String text)**: Creates a password by alternating lowercase and uppercase transformations and using character substitutions for security.

2. **JavaFX GUI Application**:
   - A simple graphical interface allows users to enter text and generate an acronym or password with a single click.
   - Provides options to reset input/output fields and display results instantly.

### Key Features
- **Text Manipulation**: Uses loops, string parsing, and custom transformations for acronym and password generation.
- **JavaFX GUI**: An interactive interface for easy user interaction.
- **Security-Enhancing Substitutions**: Strengthens generated passwords with specific character substitutions (e.g., 'B' to '3').

## Usage
1. Run the GUI application to enter a phrase and generate an acronym or password.
2. Click the "Generate Acronym" or "Generate Password" button for instant output.
3. Use the "Reset" button to clear fields and start a new session.

## Documentation
Javadoc comments are included in the `StringGenerator` class, detailing both methods and the class itself.

## Project Files
- `StringGenerator.java`: Contains static methods to generate acronyms and passwords.
- `AcronymPasswordGUI.java`: JavaFX interface for testing `StringGenerator`.
- Sample output screenshots are included for reference.
