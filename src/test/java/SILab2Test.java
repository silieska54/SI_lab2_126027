import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SILab2Test {
    @Test
    public  void Test1(){
        Time time = new Time(-25,0,0);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The hours are smaller than the minimum");
        }

        time = new Time(25,0,0);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The hours are grater than the maximum");
        }

        time = new Time(15,-25,0);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The minutes are not valid!");
        }

        time = new Time(15,75,0);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The minutes are not valid!");
        }

        time = new Time(15,25,20);
        timesList = new ArrayList<>();
        timesList.add(time);

        List<Integer> result = SILab2.function(timesList);

        assertEquals(result.size(), 1);
        assertEquals(result.get(0).intValue(), 55520);

        time = new Time(15,45,-25);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The seconds are not valid");
        }

        time = new Time(15,45,70);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The seconds are not valid");
        }

        time = new Time(24,0,0);
        timesList = new ArrayList<>();
        timesList.add(time);

        result = SILab2.function(timesList);

        assertEquals(result.size(), 1);
        assertEquals(result.get(0).intValue(), 86400);

        time = new Time(24,10,0);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The time is greater than the maximum");
        }

        time = new Time(24,0,10);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The time is greater than the maximum");
        }
    }

    @Test
    public  void Test2(){
        Time time = new Time(-25,0,0);
        List<Time> timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The hours are smaller than the minimum");
        }

        time = new Time(25,0,0);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The hours are grater than the maximum");
        }

        time = new Time(15,-25,0);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The minutes are not valid!");
        }

        time = new Time(15,25,20);
        timesList = new ArrayList<>();
        timesList.add(time);

        List<Integer> result = SILab2.function(timesList);

        assertEquals(result.size(), 1);
        assertEquals(result.get(0).intValue(), 55520);

        time = new Time(15,45,-25);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The seconds are not valid");
        }

        time = new Time(24,0,0);
        timesList = new ArrayList<>();
        timesList.add(time);

        result = SILab2.function(timesList);

        assertEquals(result.size(), 1);
        assertEquals(result.get(0).intValue(), 86400);

        time = new Time(24,10,0);
        timesList = new ArrayList<>();
        timesList.add(time);
        try {
            SILab2.function(timesList);
        }
        catch(RuntimeException ex) {
            assertEquals(ex.getMessage(), "The time is greater than the maximum");
        }
    }
}
