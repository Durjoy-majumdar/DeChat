package com.tencent.p014mm.chatting.component;

import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.mm.chatting.component.a */
public class C68010a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ListScrollPAGView f195176d;

    public C68010a(ListScrollPAGView listScrollPAGView) {
        this.f195176d = listScrollPAGView;
    }

    public void run() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f195176d.f48764s);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ListScrollPAGView.C17719f) it.next()).onFlush();
        }
    }
}
