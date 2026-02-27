what is SDLC ?
SDLC = Software Development Life Cycle.
1. Design
2. Develop (code)
3. Testing

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

Unit testing : testing done by the developer itself at the time of development
↠ a class has multiple methods - each method is called a unit, and so unit testing.
↠ sometime a unit can be refered to a group of methods or even group of classes.

Flow of unit test: 
↠ write the test.
↠ develop the code.
↠ test the code with test.

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

junit5 is not junit4 + new features.
junit5 does not provide backward compatability.

if already some tests are written in junit4 you will need vintage api to run run them in junit5.

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

platform is where all tests run
jupiter is the api that runs the tests written by you

in any maven project we need junit dependency to use the junit libraries.

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

@test : annotation used to mark a method as test method
its from jupiter api
a test method can be public, default

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

1. write an empty method in the class file
2. write a test for it
3. develop the real method
4. re-run the test

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

to run the tests independent of ecplise facility
we must use surefire plugin
after adding this plugin -> right click -> run as maven test

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================


Assertion : helps comparing expected and actual values in a test
imported from assertion class

assertEquals(14, shape.areaOfSq(4), ()-> "Something is wrong");
↠ here we are using lambda function known as supplier which only pass the string when the test is failing else its ignored -> efficient way to write a test

we also have assertNotEqual();, assertTrue();, assertFalse();, assertArrayEquals(); -> size and data must be same

to test the performance of a method -> assertTimeout(Duration.ofMillis(1), Sort.sortArray(nums[]));

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

@BeforeEach -> if mentioned on a method.. that method will be executed before each test execution.
similarly we have @AfterEach -> for cleanups, closing of resources.

for juint4 -> @Before, @After


======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

@BeforeAll -> executed once before all tests
@AfterAll -> executed once after all tests
they are used only with static methods, as we need them to run only once.

======================================================================================================
------------------------------------------------------------------------------------------------------
======================================================================================================

@TestInstance(TestInstance.Lifecycle.PER_CLASS) -> will make the instances execute only once per class
so now we can use @Before or @After for non static methods too..
(default behaviour of lifeCycle is PER_METHOD)
