# TEST RESULTS

## Tip testiranja: Sistemsko testiranje (Black Box Testing)

## Testirani izrazi i rezultati:

 Unos         Očekivano  Dobijeno

 4+5            9.0         9.0             

 10+5*2        20.0        20.0     
 10*2+5        25.0        25.0     
 10+5*4+3      33.0        33.0     
 10/2*3        15.0        15.0     
 10/0          ERROR       Infinity   Ne hvata deljenje nulom
 -5+10         5.0         5.0         
 a+2           ERROR       ERROR    
 2.5*2         5.0         5.0      
 2+(2*9)       20.0        ERROR      Ne prihvata racunanje sa zagradama


## Problemi i nedostaci:

1. Deljenje nulom (`10/0`): metoda vraća `"Infinity"` umesto `"ERROR"`. Potrebno je dodati proveru za nulu.
2. Nema podrške za zagrade** (npr. `2*(3+4)`) – izrazi sa zagradama nisu podržani.



## Preporuke:

- Dodati proveru za deljenje nulom i vratiti ERROR kada se detektuje.
- Razmisliti o podršci za zagrade.