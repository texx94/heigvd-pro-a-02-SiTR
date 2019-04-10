/*
 * Filename: ItineraryStopTest.java
 * Creation date: 10.04.2019
 */

package ch.heigvd.sitr.vehicle;

import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for Itinerary stop.
 * @author Simon Walther
 */
public class ItineraryStopTest {

    @Test
    public void constructor() {
        ItineraryStop itineraryStop = new ItineraryStop(new Point2D.Double(50, 50), new Point2D.Double(100, 100));
        assertEquals(new Point2D.Double(50, 50), itineraryStop.getOrigin());
        assertEquals(new Point2D.Double(100, 100), itineraryStop.getDestination());
    }
}
