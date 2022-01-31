## Power of testing

If you don’t keep your tests clean, you will lose them. And without them, you lose the very
thing that keeps your production code flexible. Yes, you read that correctly. It is unit tests
that keep our code flexible, maintainable, and reusable. The reason is simple. If you have
tests, you do not fear making changes to the code! Without tests every change is a possible
bug. No matter how flexible your architecture is, no matter how nicely partitioned your
design, without tests you will be reluctant to make changes because of the fear that you
will introduce undetected bugs.
But with tests that fear virtually disappears. The higher your test coverage, the less
your fear. You can make changes with near impunity to code that has a less than stellar
architecture and a tangled and opaque design. Indeed, you can improve that architecture
and design without fear!
So having an automated suite of unit tests that cover the production code is the key to
keeping your design and architecture as clean as possible. Tests enable all the -ilities,
because tests enable change.
So if your tests are dirty, then your ability to change your code is hampered, and you
begin to lose the ability to improve the structure of that code. The dirtier y

## Learning tests

Learning the third-party code is hard. Integrating the third-party code is hard too.
Doing both at the same time is doubly hard. What if we took a different approach? Instead
of experimenting and trying out the new stuff in our production code, we could write some
tests to explore our understanding of the third-party code. Jim Newkirk calls such tests
learning tests.1
In learning tests we call the third-party API, as we expect to use it in our application.
We’re essentially doing controlled experiments that.

Learning tests verify that the third-party packages we are using work the way we
expect them to. Once integrated, there are no guarantees that the third-party code will stay
compatible with our needs. The original authors will have pressures to change their code to
meet new needs of their own. They will fix bugs and add new capabilities. With each
release comes new risk. If the third-party package changes in some way incompatible with
our tests, we will find out right away.
Whether you need the learning provided by the learning tests or not, a clean boundary
should be supported by a set of outbound tests that exercise the interface the same way the
production code does. Without these boundary tests to ease the migration, we might be
tempted to stay with the old version longer than we should. 

## Tests structure

The BUILD-OPERATE-CHECK2 pattern is made obvious by the structure of these tests.
Each of the tests is clearly split into three parts. The first part builds up the test data, the
second part operates on that test data, and the third part checks that the operation yielded
the expected results.
