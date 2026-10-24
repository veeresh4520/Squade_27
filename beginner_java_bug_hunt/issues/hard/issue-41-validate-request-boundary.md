# Issue #41: Word Guessing Game: Reject a zero-quantity guess request

**Difficulty:** Hard  
**Scenario:** Word Guessing Game: Reject a zero-quantity guess request. The supplied example uses fixed values so the participant can focus on the behaviour of this one operation.  
**Topic:** logical errors, conditions, loops, arrays, strings, classes/objects, constructors, and methods  
**Starter file:** `src/main/java/hackathon/Issue41_GuessRoundValidation.java`

## Scenario brief
Word Guessing Game: Reject a zero-quantity guess request. The supplied example uses fixed values so the participant can focus on the behaviour of this one operation.. This is a small, isolated exercise; keep the solution within beginner Java and do not add collections or external libraries.

## Task
The word guessing game accepts a request for 0 guess units even though a request must be at least 1 and no more than the available quantity. For the supplied request (0 requested, 5 available), reject it.

## Expected output
The program should produce exactly:

```text
Request rejected
```

## Done when
- [ ] The program produces the expected output.
- [ ] The supplied scenario and test values are preserved.
- [ ] You test one additional sensible boundary case.
- [ ] Your pull request explains the behaviour changed and how you tested it.
