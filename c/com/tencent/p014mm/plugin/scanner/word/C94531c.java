package com.tencent.p014mm.plugin.scanner.word;

import com.tencent.p014mm.plugin.scanner.word.C94533d;
import java.util.ArrayList;
import java.util.Iterator;
import xl2.C102690c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.scanner.word.c */
public class C94531c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f273355d;

    /* renamed from: e */
    public final /* synthetic */ C102690c f273356e;

    /* renamed from: f */
    public final /* synthetic */ ImageWordScanDetailEngine f273357f;

    /* renamed from: com.tencent.mm.plugin.scanner.word.c$a */
    public class C94532a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C94533d.C94534a f273358d;

        public C94532a(C94533d.C94534a aVar) {
            this.f273358d = aVar;
        }

        public void run() {
            C94533d.C94534a aVar = this.f273358d;
            C94531c cVar = C94531c.this;
            aVar.mo86628w3(cVar.f273355d, cVar.f273356e);
        }
    }

    public C94531c(ImageWordScanDetailEngine imageWordScanDetailEngine, String str, C102690c cVar) {
        this.f273357f = imageWordScanDetailEngine;
        this.f273355d = str;
        this.f273356e = cVar;
    }

    public void run() {
        ArrayList remove = this.f273357f.f273351g.remove(this.f273355d);
        if (remove != null) {
            Iterator it = remove.iterator();
            while (it.hasNext()) {
                ((C119157j) C119157j.f356862d).mo183895z(new C94532a((C94533d.C94534a) it.next()));
            }
        }
    }
}
