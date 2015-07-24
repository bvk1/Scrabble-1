# Scrabble
Create some parts of the scrabble game. Features are:
- Suggesting first word to be played given a rack
- Support for blank tiles
- Suggesting words to be played given some board constraints

##Tasks:

###Team 1

Implement anagram hashmap + basic structure of code

- Swati - Create the Base Class and the List Structure class for the HashMap; Read the words from the file and populate the hashmap
- Dinesh - writes a function to calculate the score for each word
- Yashaswini - finds the Top N words

###Team 2

Implement a function which given a rack of tiles, generates all possible combinations. Better to make a separate class like 
Combinations or something for this. 
Handles wildcard entries. Returns a list of all possible words after considering the spaces or special characters, along with the word scores.

- Radhika - Generate all the words from the characters in the rack
- Bhavya - Generate the words considering the blank tiles
- Aakash - Check if the generated word is valid or not. If valid add to the valid list along with its score.

###Team 3

Create a filter which given a list of combinations filters out combinations based on some criteria

- Rishabh : Use regex for matching constraints
- Amrit: Look for alternate ways to filter
