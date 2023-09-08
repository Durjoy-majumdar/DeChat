package com.tencent.p014mm.p136ui.chatting.component;

import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import s90.C77632o;
import zj3.C79348e;

/* renamed from: com.tencent.mm.ui.chatting.component.p1 */
public class C73570p1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f216073d;

    /* renamed from: e */
    public final /* synthetic */ C67391b f216074e;

    public C73570p1(C72963f4 f4Var, C67391b bVar) {
        this.f216073d = f4Var;
        this.f216074e = bVar;
    }

    public void run() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f216073d);
        C73313b1.m86457c(this.f216074e.mo91565f(), linkedList, ((C79348e) this.f216074e.f193278b.mo102812a(C79348e.class)).mo70075s4() || this.f216074e.mo91582w(), this.f216074e.mo91577r(), (C77632o) null);
    }
}
