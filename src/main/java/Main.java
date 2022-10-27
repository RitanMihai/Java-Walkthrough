import collections.ArraysExample;
import collections.MapsExamples;
import collections.SetsExamples;

import java.io.*;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ArraysExample.examplePrimitives();
        MapsExamples.exampleObjects();
        SetsExamples.examplesHashSetPrimitives();
        SetsExamples.examplesTreeSetPrimitives();
    }
}
