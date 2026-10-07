# Reflection – AI Number Program Lab

##  Student Name:
Matthew Gordon

##  GitHub Repository Link:
https://github.com/Smokeworks/cmsc115_unit8_lab2

## Iteration 1

What the AI code does:
- The AI created the findResult method, but it only returns 0.

Tests passed/failed:
- 1 test and "Result: 0" + "Process finished with exit code 0"

What surprised you:
- Nothing, the first prompt was too vague for the AI to know what findResult was supposed to do.

Commit message:
Iteration 1: AI-generated implementation

---

## Iteration 2

What changed:
- The method now finds the largest value in the array.

What improved:
- 3 out of 4 tests now pass.

What still failed and why:
- testEmptyArray() failed because the method tries to access index 0 of an empty array because the AI doesnt have context of all the tests it needs to pass

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
The method returns the largest integer in the array and handles empty arrays

What was fixed:
- Empty arrays now return Integer.MIN_VALUE instead of causing an error.

What you learned:
- AI can't do everything in a single prompt without the right context. It's still up to the person to provide that context, test the results, and work through any issues with the AI or by yourself

Commit message:
teration 3: final version passing all tests

---

## Final Reflection

- How did AI responses change across prompts?
- How did testing affect your changes?
- What did version control help you understand?