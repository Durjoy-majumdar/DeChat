package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.ui.chatting.z4 */
public class C74355z4 {

    /* renamed from: a */
    public static LinkedList<View> f218406a = new LinkedList<>();

    /* renamed from: b */
    public static LinkedList<View> f218407b = new LinkedList<>();

    /* renamed from: c */
    public static LinkedList<View> f218408c = new LinkedList<>();

    /* renamed from: a */
    public static View m88793a(int i) {
        LinkedList<View> linkedList = i == 1 ? f218406a : i == 2 ? f218407b : f218408c;
        if (linkedList.size() != 0) {
            return linkedList.removeFirst();
        }
        return null;
    }

    /* renamed from: b */
    public static void m88794b(View view, int i) {
        LinkedList<View> linkedList = i == 1 ? f218406a : i == 2 ? f218407b : f218408c;
        if (linkedList.size() >= 35) {
            linkedList.removeFirst();
        }
        linkedList.addLast(view);
    }
}
