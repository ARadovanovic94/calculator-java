# Assignment - Metrika, pregled i staticka analiza
1. Broj linija koda (LOC) :
Ukupan broj fajlova: 2
Ukupan broj linija (sve zajedno): 214
-Calculator.java : 188 linija
-Start.java: 26 linija

Koriscenjem alata cloc u vs code dobio sam i sledece informacije:
-50 praznih linija
-30 komentara
-134 stvarne linje koda

2. Neformalna staticka analiza(SonarQube na vs code):
Calculator.java - 1 - import je zuto podvucen. Poruka: Move this file to a named package.
Calculator.java - 4 - Calculator je podvucen zuto. Poruka: Add a private constructor to hide the implicit public one.
Calculator.java - 18 - ToString ime je podvuceno zuto. Poruka: Rename method "ToString" to prevent any misunderstanding/clash with
method "toString" defined in superclass "java.lang.Object".
Calculator.java - 18 - ToString ime je podvuceno zuto. Poruka: Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'.
Calculator.java - 24 - Run je zuto podvuceno. Poruka: Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'.
Calculator.java - 53 - for je zuto podvuceno. Poruka: Use enhanced for loop to iterate over the array
Calculator.java - 55 - if je zuto podvuceno. Poruka: Convert to switch
Calculator.java - 62 - Float.parseFloat(numbers[i]) zuto podvuceno. Poruka: Unnecessary temporary when converting from String
Calculator.java - 63 - Exceptions zuto podvuceno. Poruka:Can be replaced with multicatch or several catch clauses catching specific exceptions
Calculator.java - 70 - Float.toString(finalResult) podvuceno zuto. Poruka:Immediately return this expression instead of assigning it to the temporary
variable "textResult".
Calculator.java - 74 - Calculate je zuto podvuceno. Poruka: Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'.
Calculator.java - 183 - Return podvucen zuto. Poruka: Unnecessary return statement
Calculator.java - 183 - Poruka Remove this redundant jump.

Start.java - 1 - import zuto podvucen. Poruka: Move this file to a named package.
Start.java - 6 - Expression zuto podvucen. Poruka: Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'.
Start.java - 8 - System.out zuto podvucen. Poruka: Replace this use of System.out by a logger.
Start.java - 19 - System.out zuto podvucen. Poruka: Replace this use of System.out by a logger.

Zaključak i dodatno pojašnjenje:

Analizom su obuhvaceni fajlovi Calculator.java i Start.java.
SonarQube je ukazao na vise tacaka koje se odnose na:
-organizaciju paketa (npr. potreba za premestanjem klasa u imenovane pakete)
-konvencije imenovanja metoda i promenljivih (preporuke za uskladjivanje sa regularnim izrazima)
-zamenu System.out poziva korišćenjem loggera
-upotrebu efikasnijih struktura kao što su switch umesto if izraza
-uklanjanje nepotrebnih privremenih promenljivih
-optimizaciju obrade izuzetaka.

Ove preporuke nisu kriticne greske, vec predstavljaju smernice za refaktorisanje radi postizanja boljeg stila, citljivosti i odrzavanja koda.
