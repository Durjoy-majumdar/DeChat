package com.tencent.p014mm.matrix;

import java.util.LinkedList;
import p1034se.C90173a;
import p1046ue.C90652e;

/* renamed from: com.tencent.mm.matrix.c$$d */
public class c$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80981c f237861d;

    public c$$d(C80981c cVar) {
        this.f237861d = cVar;
    }

    public void run() {
        C90173a aVar = this.f237861d.f237859n;
        if (aVar != null) {
            aVar.getClass();
            C90652e eVar = C90652e.f260459f;
            synchronized (eVar.f260461b) {
                ((LinkedList) eVar.f260461b).clear();
            }
        }
    }
}
