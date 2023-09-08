package com.tencent.p014mm.plugin.game.p061ui.message;

import android.database.Cursor;
import com.tencent.p014mm.plugin.game.p061ui.message.C42376x;
import di3.C86312j;
import sw1.C48484q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.message.y */
public class C42381y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C42376x f114653d;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.y$a */
    public class C42382a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Cursor f114654d;

        public C42382a(Cursor cursor) {
            this.f114654d = cursor;
        }

        public void run() {
            C42354k kVar;
            C42381y.this.f114653d.f114630A1.mo66413F4(this.f114654d);
            C42381y.this.f114653d.f114630A1.notifyDataSetChanged();
            Cursor cursor = this.f114654d;
            if ((cursor == null || cursor.getCount() == 0) && (kVar = C42381y.this.f114653d.f114633D1) != null) {
                kVar.mo66408a();
            }
        }
    }

    public C42381y(C42376x xVar) {
        this.f114653d = xVar;
    }

    public void run() {
        Class cls = C48484q.class;
        C42376x.C42380d dVar = this.f114653d.f114630A1;
        dVar.getClass();
        dVar.f114651h = ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(2);
        Cursor TE = ((C48484q) C86312j.m106911c(cls)).xi0().mo66002TE(2);
        ((C119157j) C119157j.f356862d).mo183895z(new C42382a(TE));
    }
}
