# sdp-mastermind
## Group coursework

**Members**

* Ahmed Saif - msaif01
* Alun Davey - adavey03
* Damanjit Singh - dsingh06
* Ginestra Ferraro - gferra02

---

## Purpose
The purpose of this assignment is to design and implement a program with multiple classes utilising the functional programming aspects of the programming language. You should use immutable data structures where possible and a dependency injection mechanism to bind the specification with the implementation.

This assignment must be completed in either Scala or Kolin; you can choose.

## Preamble
This courseowrk is to be completed in groups of four; the only variation on this is with prior agreement with the Module Leader. You may divide the work into separate parts whch can be completed by each group member. You should initially meet to decide upon this division of work and should (at least) meet again at the integration testing phase. Each separate component should be fully unit tested. _Meet_ can be via _virutal meetings_, e.g., Skype.

You may not acquire, from any source (e.g.,, another student outline side your group, or student group, or an Internet site), a partial or complete solution to the problem that has been assigned. You may not show another student or student group your solution to the assignment. You may not have another person (current student, former student, tutor, friend, anyone) walk you through how to solve the assignment.

## Description
You are required to design and implement a program to play a text based version of the board game **Mastermind**. You are free to use whatever classes and methods from the Scala/Kotlin standard library you wish to use. You may also use one of the following dependency injection frameworks:

* SpringDI
* Google Guice
* Dagger 2
* MacWire
* Kodein

If you wish to use any other dependency injection framework then you need prior agreement with the Module Leader.

The version of the game you implement will have the following properties:

* The computer will randomly generate the secret code.
* The player will try to guess the secret code.
* The player has twelve guesses to obtain the code.
* If the player does not guess the code correctly in twelve or fewer guesses they lose the game.
* The code consists of four coloured pegs.
* The valid colours for the pegs are blue, green, orange, purple, red, and yellow.
* The results of a guess are displayed with black and white pegs. (The Wikipedia article refers to the results as feedback.)
* A black peg indicates one of the pegs in the player’s guess is the correct colour and in the correct position.
* A white peg indicates one of the peg’s in the player’s guess is correct, but is out of position.
* A peg in the guess will generate either one black peg, one white peg, or no pegs. A single peg in the guess cannot generate more than one feedback peg.
* The order of the feedback does not give any information about which pegs in the guess generated the feedback pegs.
* Capital letters will be used to indicate colours. B for blue, R for red, and so forth.
* A user’s guesses are error checked to ensure they are the correct length and only contain valid characters.
* The output of the game should be a simple text based display.

## Sample Output
Your program does not have to match the sample output shown below exactly. You can make changes to the style of the output if you wish. You will find a sample of the output in the file `SampleOutput.txt` on the module repository.

## Provided Files
The following files are provided in the module repository folders `cw-group-kotlin` or `cw-group-scala`.

|              |File/Class        |Descritption            |
|:-------------|:-----------------|:-----------------------|
|Sample Output |`SampleOutput.txt`|Example Output          |
|Implementation|`MasterMind`      |Driver file             |
|Implementation|`Game`            |Interface               |
|Implementation|`GameAbstractImpl`|Adds constructor to Game|

The top level "class" of your program must be called `Game`. It must have a constructor that takes a `boolean`. The boolean is used for testing purpose. If it is `true`, then the secret code is revealed throughout the game. The `Game` class must also have a method named `runGames` that carries out the actual games. Your program must run correctly when the `main` method/function of the class `Mastermind` is called.

## Evaluation Criteria
* Part of the assignment grade will be determined by how easily your program could be altered to allow a different number of pegs in the code and how easily different colours could be added, assuming they start with a different letter than other existing colours. (Up to 26, one for each capital letter. Are there any colours that start with an X?)

 For example, how easily would it be to change the code to have five pegs and allow pegs to be the colour Maroon?

* Part of the assignment grade will be determined by how you decomposed the problem into different classes and interfaces. For this assignment you should err on the side of having lots of simple classes instead of a few complex ones.

* Part of the assignment grade will be determined by appropriately applying the SOLID principles, especially interface separation and dependency injection.

* Part of the assignment grade will be determined by how comprehensive a test suite you provide.

* Part of the assignment grade will be determined by how well your group functioned.

## Submission
**Only one member of the group will submit the version of your code.** You should pick which repository to submit the code in. You will need to give that repo group access (via collaborators). **The other members of the group should include a `README.md` in their repository indicating who their partners were.**

The submission is part of your portfolio repository and it will be cloned at the appropriate due date and time.

## FAQ
"If I don't even try to be in a group and just submit the work as an individual will my work be graded?"

Yes, it will be graded and you will receive feedbeck; the grade will be zero. though.