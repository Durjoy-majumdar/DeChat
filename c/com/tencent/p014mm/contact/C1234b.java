package com.tencent.p014mm.contact;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.contact.b */
public class C1234b {
    /* renamed from: a */
    public static String m1358a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() < 1) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append(",");
        }
        return stringBuffer.toString();
    }
}
