package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.database.Cursor;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.game.p061ui.message.C42376x;
import di3.C86312j;
import sw1.C48484q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.message.z */
public class C42383z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f114656d;

    /* renamed from: e */
    public final /* synthetic */ C42376x f114657e;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.z$a */
    public class C42384a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Cursor f114658d;

        /* renamed from: e */
        public final /* synthetic */ int f114659e;

        public C42384a(Cursor cursor, int i) {
            this.f114658d = cursor;
            this.f114659e = i;
        }

        public void run() {
            C42383z zVar = C42383z.this;
            C42376x xVar = zVar.f114657e;
            xVar.f114630A1 = new C42376x.C42380d(zVar.f114656d, this.f114658d, this.f114659e);
            C42383z zVar2 = C42383z.this;
            zVar2.f114657e.setLayoutManager(new LinearLayoutManager(zVar2.f114656d));
            C42376x xVar2 = C42383z.this.f114657e;
            xVar2.setAdapter(xVar2.f114630A1);
        }
    }

    public C42383z(C42376x xVar, Context context) {
        this.f114657e = xVar;
        this.f114656d = context;
    }

    public void run() {
        Class cls = C48484q.class;
        int mL = ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(2);
        Cursor TE = ((C48484q) C86312j.m106911c(cls)).xi0().mo66002TE(2);
        ((C119157j) C119157j.f356862d).mo183895z(new C42384a(TE, mL));
    }
}
