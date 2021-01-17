#Caeaser cipher

##Questions:

   #####a/ Write an algorithm to solve the above issue. Please consider the complexity of the algorithm.
   Please checkout the project and `cd` into it and then:
   ```
    java src/com/dindinn/Main.java <INPUT_STRING> <INPUT_NUMBER>

    e.g. 
    java src/com/dindinn/Main.java AaZsO 12
   ```
   
   
   #####b/ What is the disadvantage of using the ASCII value of the letters to solve this problem?
   This problem can be solved efficiently using the ASCII value as other approaches will probably have greter time
    complexity. The only diadvantage that I can think of with this approach is that with ASCII values I had to
     consider the start of range of upper and lower case characters in ASCII table separately and then subtract that
      from each letters ASCII value to make sure that the *mod 26* operation works fine and then to bring it back
       to its original shifted place I had to start the start range index again.  
    