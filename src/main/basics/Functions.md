## Step down rule

### Reading code from top to bottom

We want the code to read like a top-down narrative. We want every function to be followed by those at the next level of abstraction
so that we can read the program, descending one level of abstraction at a time as we read down the list of functions. I call
this **The step-down Rule**

To say this differently, we want to be able to read the program as though it were a set of **TO** paragraphs,
each of which is describing the current level of abstraction and referencing subsequent TO paragraphs at the next level down.


## Function Arguments

The ideal number of arguments for a function is **zero (niladic)**. Next comes **one (monadic)**, followed by two (dyadic).
Three arguments (triadic) should be avoided where possible. More than three (polyadic) requires very special justification and
then shouldn't be used anyway.

## Dependent Functions

If one function call another, they should be vertically close, and the caller should be above the callee, if at all possible.
This gives the program a natural flow. If the convention is followed reliably, readers will be able to trust that function
definitions will follow shortly after their use.

## Don't pass NULL

Returning null from methods is bad, but passing null into methods is worse. Unless you
are working with an API which expects you to pass null, you should avoid passing null in
your code whenever possible.
