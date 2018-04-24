package project.catering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hp on 4/14/2018.
 */

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> personalinfo = new ArrayList<String>();
        personalinfo.add("India");
        personalinfo.add("Pakistan");
        personalinfo.add("Australia");
        personalinfo.add("England");
        personalinfo.add("South Africa");

        List<String> favcatering = new ArrayList<String>();
        favcatering.add("Brazil");
        favcatering.add("Spain");
        favcatering.add("Germany");
        favcatering.add("Netherlands");
        favcatering.add("Italy");

        List<String> order = new ArrayList<String>();
        order.add("United States");
        order.add("Spain");
        order.add("Argentina");
        order.add("France");
        order.add("Russia");

        expandableListDetail.put("Personal Information", personalinfo);
        expandableListDetail.put("Favorite Catering", favcatering);
        expandableListDetail.put("Order History", order);

        return expandableListDetail;
    }
}
