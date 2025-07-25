# Anagrams Finder

Acesta este un program simplu în Java care citește cuvinte dintr-un fișier și le grupează dacă sunt anagrame.

## 🛠 Cerințe

- Java 8 sau o versiune mai recentă
- Sistem de operare: Windows, Linux sau macOS
- Compilator Java instalat (`javac`)
- Fișierele `Main.java`, `sample.txt` și permisiuni de scriere în folderul `src`

## 📥 Intrare
- Fișierul de intrare este `src/sample.txt` (pentru exemplul din taskurile internshipului)
- Al doilea fișier de intrare conține in jur de 5 milioane de cuvinte (`src/input5millions.txt`)
- Fiecare linie conține un singur cuvânt.

## 📤 Ieșire
- Rezultatul este scris în `src/output.txt`
- Cuvintele care sunt anagrame vor fi afișate pe aceeași linie.

## ▶️ Cum rulezi programul
- Pentru a rula programul, compilează și rulează clasa Main din `src/Main.class`

**Fișier de intrare (`sample.txt`):**  
act  
cat  
tree  
race  
care  
acre  
bee

**Fișier de ieșire (`output.txt`):**  
race care acre  
act cat  
bee  
tree  

**Pentru a utiliza input-ul cu 5 miliaone de cuvinte, puteți schimba manual în codul Main calea către fișierul de input (în loc de sample.txt introduceți input5millions.txt)**
## ℹ️ Observații
- Programul afișează în consolă cât timp a durat procesarea.
- Fișierul de ieșire este suprascris de fiecare dată când rulezi programul.