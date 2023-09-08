package com.tencent.p014mm.plugin.webview.luggage;

import java.util.HashMap;
import java.util.LinkedList;
import p828wa.C53138x;

/* renamed from: com.tencent.mm.plugin.webview.luggage.k0 */
public class C43626k0 {

    /* renamed from: a */
    public static Object f117877a = new Object();

    /* renamed from: b */
    public static LinkedList<C53138x> f117878b = new LinkedList<>();

    /* renamed from: c */
    public static HashMap<String, C53138x> f117879c = new HashMap<>();

    /* renamed from: a */
    public static String m47359a(C53138x xVar) {
        return "luggage_page_" + xVar.hashCode();
    }

    /* renamed from: b */
    public static LinkedList<C53138x> m47360b() {
        LinkedList<C53138x> linkedList;
        synchronized (f117877a) {
            linkedList = new LinkedList<>(f117878b);
        }
        return linkedList;
    }
}
