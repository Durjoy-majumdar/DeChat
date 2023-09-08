package com.tencent.p014mm.ext.p313ui;

import go3.C76019y;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import p1005ma.C88718b;

/* renamed from: com.tencent.mm.ext.ui.c */
public class C114718c {

    /* renamed from: a */
    public static C114720b f343913a;

    /* renamed from: b */
    public static LinkedList<WeakReference<C114719a>> f343914b = new LinkedList<>();

    /* renamed from: com.tencent.mm.ext.ui.c$a */
    public interface C114719a {
        void onSettle(boolean z, int i);

        void onSwipe(float f);
    }

    /* renamed from: com.tencent.mm.ext.ui.c$b */
    public interface C114720b {
    }

    /* renamed from: a */
    public static void m161369a(boolean z, int i) {
        if (f343913a != null) {
            C76019y.m91313a(z, i);
        }
        if (f343914b.size() <= 0) {
            C88718b.m110682d("MicroMsg.LiteAppSwipeBackHelper", "notifySettle callback stack empty!, open:%B, speed:%d", Boolean.valueOf(z), Integer.valueOf(i));
            return;
        }
        C114719a aVar = (C114719a) f343914b.get(0).get();
        if (aVar == null) {
            C88718b.m110682d("MicroMsg.LiteAppSwipeBackHelper", "notifySettle null, open:%B, speed:%d", Boolean.valueOf(z), Integer.valueOf(i));
            return;
        }
        aVar.onSettle(z, i);
        C88718b.f256076a.mo123154v("MicroMsg.LiteAppSwipeBackHelper", "notifySettle, open:%B speed:%d callback:%s", Boolean.valueOf(z), Integer.valueOf(i), aVar);
    }

    /* renamed from: b */
    public static void m161370b(float f) {
        if (f343913a != null) {
            C76019y.m91314b(f);
        }
        if (f343914b.size() <= 0) {
            C88718b.m110682d("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe callback stack empty!, scrollParent:%f", Float.valueOf(f));
            return;
        }
        C114719a aVar = (C114719a) f343914b.get(0).get();
        if (aVar == null) {
            C88718b.m110682d("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe null, scrollParent:%f", Float.valueOf(f));
            return;
        }
        aVar.onSwipe(f);
        C88718b.f256076a.mo123154v("MicroMsg.LiteAppSwipeBackHelper", "notifySwipe scrollParent:%f, callback:%s ", Float.valueOf(f), aVar);
    }
}
