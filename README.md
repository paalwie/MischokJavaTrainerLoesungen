# Java-Code-Lösungen für den Java-Trainer der Mischok Academy

Dieses Repository enthält Java-Code-Lösungen zu den Übungsaufgaben des **Java-Trainers** der **Mischok Academy**.  
Da der Trainer weder das Kopieren von Code erlaubt noch Zwischentests zulässt (nur vollständige Lösungen werden akzeptiert), wurden die Aufgaben hier vollständig in Java nachprogrammiert, um die eigene Lösung besser nachvollziehen und testen zu können.

---

## Aufbau des Codes

Die Datei enthält alle **Methoden (Lösungen)** des Java-Trainers in einer Klasse.  
Die Struktur ist wie folgt:

1. **Oben im Code:**  
   Alle Methoden mit den jeweiligen Lösungen zu den Aufgaben des Trainers.  
   - Die Aufgaben stammen ausschließlich aus **Modul II (Java II)**  
   - Sie sind **gemischt aus allen fünf Leveln**  
   - Nach dem **Aufgabentext** im Code kann gezielt gesucht werden  
   - Einige Methoden wurden **umbenannt**, da im Trainer teils doppelte Methodennamen vorkommen (z. B. `meineMethode`)

2. **Unten im Code (Main-Methode):**  
   - Hier befinden sich die **Methodenaufrufe**, allerdings sind **alle auskommentiert**  
   - Wer eine bestimmte Methode testen möchte, kann den entsprechenden Aufruf durch Entfernen des Kommentarzeichens (`//`) aktivieren  
   - Der einfachste Weg, die passende Stelle zu finden, ist über die **Suchfunktion nach dem Methodennamen**

---

## Beispiel: Struktur im Code

### Methoden-Definition

```java
public static String baueWortPyramide(String str) {
    String returnWert = "";
    for (int i = 1; i <= str.length(); i++) {
        returnWert += str.substring(0, i) + "\n";
    }
    return returnWert;
}
