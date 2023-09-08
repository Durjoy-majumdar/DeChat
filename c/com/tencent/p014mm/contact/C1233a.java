package com.tencent.p014mm.contact;

import com.tencent.p014mm.storage.C72996z1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.contact.a */
public class C1233a {
    /* renamed from: a */
    public static String m1354a(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            stringBuffer.append("，");
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m1355b(C72996z1 z1Var) {
        return (z1Var == null || z1Var.f149534e1 == 0) ? "," : "，";
    }

    /* renamed from: c */
    public static String[] m1356c(C72996z1 z1Var) {
        String str;
        if (z1Var == null || (str = z1Var.f149525Y0) == null) {
            return null;
        }
        return str.split(m1355b(z1Var));
    }

    /* renamed from: d */
    public static String[] m1357d(C72996z1 z1Var, String str) {
        if (str != null) {
            return str.split(m1355b(z1Var));
        }
        return null;
    }
}
