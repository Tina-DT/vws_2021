  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  **[Clean Code Development Cheat Sheet]{.ul}**                                                                                                
  ----------------------------------------------- -------------------------------------------------------------------------------------------- ---------------------------------------------------------------------------------------
                                                  **Do\'s**                                                                                    **Don\'ts**

  Testing rules                                   Use metrics\                                                                                 Don\'t ignore parts of your code\
                                                  to provide yourself a better insight into the code you are developing                        test everything what\'s there to be tested

                                                  Ask for feedback\                                                                            Don\'t overdo your test\
                                                  discuss your code with other developers                                                      Making your tests too complicated might cause huge running problems.

                                                  Test Test Test\                                                                              Don\'t write dirty tests\
                                                  test your code with auto and manual tests through you, other developers and non-developers   Tests must be as clean and easy to read as your production code

  Function rules                                  Implement small functions\                                                                   Don't repeat yourself (DRY)\
                                                  one functionality in one function will keep your code away from explosions                   code doesn't like echo either

                                                  Better do it right than quick\                                                               Don\'t underestimate a change\
                                                  fixing (cleaning) the code later may take much more time and problems than you think         every code change could trigger twists

                                                  Use descriptive naming\                                                                      No copy paste\
                                                  you don't want to read the whole documentation just to change one line of code               Don't copy a content and use it in your code, if you are not sure about its functions

                                                  Better using fewer arguments\                                                                Don\'t use flag arguments\
                                                  even if it might take longer, keep your arguments short and sweet                            better use several independent methods

                                                  Pay attention to the dependencies\                                                           Don\'t use output arguments\
                                                  get rid of any possible side effects                                                         they might tangle you

                                                  Kiss your code\                                                                              Don't forget your CCDCS\
                                                  keep it short and simple (KISS)                                                              keep your cheat sheet always in mind

  Comment rules                                   Use readable comments\                                                                       Don\'t comment too much\
                                                  not only you will read the code, others would also like to understand your work              if your coding is named self-evident, there is no need for code novel

                                                  Let your intent guide your comments\                                                         Don\'t keep code in comments\
                                                  Your intention is to be used as an explanation                                               Please remove this eyesore

  Design rules                                    Better long analysis than long code\                                                         Don\'t modify to extend\
                                                  try to think your code well through before start tipping long spaghetti code                 your classes should be extendable without a need of modification

                                                  Keep your lines short\                                                                       Don\'t change your style\
                                                  no one wants to get dizzy from reading                                                       create all similar things in the same way

                                                  One level of abstraction is enough\                                                          Don\'t use prefixes\
                                                  descent code is pleasant                                                                     appending prefixes or type information is not a good idea (naming rules)

  General rules                                   Document your code\                                                                          Don\'t confuse error handling and code\
                                                  otherwise you will not remember what you did 1 year, 2 years or 10 years ago                 keep your goal in mind

                                                  The Law of Demeter\                                                                          Don\'t over-configure\
                                                  don\'t overwhelm your class, let it deal just with its direct dependencies                   this might make more headaches than needed
  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
