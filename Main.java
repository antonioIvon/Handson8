package Hands_on_8;

public class Main {

    public static void main(String[] args) {

        int[][] data = {
            {23, 651},
            {26, 762},
            {30, 856},
            {34, 1063},
            {43, 1190},
            {48, 1298},
            {52, 1421},
            {57, 1440},
            {58, 1518}
        };

        DataSet dataSet = new DataSet(data);

        SLR slr = new SLR(dataSet);

        slr.analyzeData();
    }
}
