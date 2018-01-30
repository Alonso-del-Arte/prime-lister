# prime-lister
Just a simple program to list prime numbers using the sieve of Eratosthenes with only very basic optimizations.

A decade ago I would have thought it inefficient to use an array of boolean variables for an implementation of the sieve. I suppose  I'm still balking at the idea, but at the same time it seems somewhat elegant.

The main reason I even thought about this little problem that must seem like a rather basic programming exercise was the need to do unit testing on the `NumberTheoreticFunctionsCalculator` class in my visualization-quadratic-imaginary-rings repository.

Originally, I just copied a listing of prime numbers from Sloane's On-Line Encyclopedia of Integer Sequences (OEIS), A000040, into `NumberTheoreticFunctionsCalculatorTest`. But then I figured it made more sense to have the test setup come up with a little list of primes, and that it should not slow down the test suite by anything more than a few seconds, if that.

But with this repository, I give myself the option to refine and specialize the prime listing program beyond what is necessary for my unit testing of the other program.
