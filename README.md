# SI_lab2_126027

2. Control Flow Graph
  ![190585832_264765315397331_7405024521620876320_n](https://user-images.githubusercontent.com/82406691/119419739-3364f680-bcfb-11eb-8d2b-8575a506d3cc.png)

3. Цикломатската комплексност на дадениот код е:

  V(G) = E - N + 2 = 23 - 17 + 2 = 8

  Имаме E=23 ребра и N=17 јазли. Со замена во формулата добиваме дека цикломатската комплексност е 8.

4. Според multiple - condition критериумот имаме 10 тест случаи и тоа:
  
  1 2 3 4 5 7 17 18           (hours < 0)
  1 2 3 4 5 8 17 18           (hours > 24)
  1 2 3 4 6 9 11 17 18        (0 < hours < 24 && minutes < 0)
  1 2 3 4 6 9 11 17 18        (0 < hours < 24 && minutes > 59)
  1 2 3 4 6 9 12 16 2 18      (0 < hours < 24 && 0 <= minutes <= 59 && 0 <= seconds <= 59)
  1 2 3 4 6 9 12 15 17 18     (0 < hours < 24 && 0 <= minutes <= 59 && seconds < 0)
  1 2 3 4 6 9 12 15 17 18     (0 < hours < 24 && 0 <= minutes <= 59 && seconds > 59)
  1 2 3 4 6 10 14 2 18        (hours == 24 && minutes == 0 && seconds == 0)
  1 2 3 4 6 10 13 17 18       (hours == 24 && minutes != 0)
  1 2 3 4 6 10 13 17 18       (hours == 24 && minutes == 0 && seconds != 0)

5. Според every branch критериумот имаме 7 тест случаи и тоа:
  
  1 2 3 4 5 7 17 18           (hours < 0)
  1 2 3 4 5 8 17 18           (hours > 24)
  1 2 3 4 6 9 11 17 18        (0 < hours < 24 && minutes < 0)
  1 2 3 4 6 9 12 16 2 18      (0 < hours < 24 && 0 <= minutes <= 59 && 0 <= seconds <= 59)
  1 2 3 4 6 9 12 15 17 18     (0 < hours < 24 && 0 <= minutes <= 59 && seconds < 0)
  1 2 3 4 6 10 14 2 18        (hours == 24 && minutes == 0 && seconds == 0)
  1 2 3 4 6 10 13 17 18       (hours == 24 && minutes != 0)
