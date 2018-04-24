package project.catering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hp on 4/16/2018.
 */

public class ExpandableListDataPumpSeller {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> personalinfo = new ArrayList<String>();
        personalinfo.add("India");
        personalinfo.add("Pakistan");
        personalinfo.add("Australia");
        personalinfo.add("England");
        personalinfo.add("South Africa");

        List<String> transactionhistory = new ArrayList<String>();


        List<String> neworder = new ArrayList<String>();

        List<String> message = new ArrayList<String>();

        List<String> complain = new ArrayList<String>();


        expandableListDetail.put("Personal Information", personalinfo);
        expandableListDetail.put("Transaction History", transactionhistory);
        expandableListDetail.put("New Order", neworder);
        expandableListDetail.put("Message", message);
        expandableListDetail.put("Complain", complain);

        return expandableListDetail;
    }
}