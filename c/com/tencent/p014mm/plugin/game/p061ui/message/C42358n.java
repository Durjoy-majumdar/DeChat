package com.tencent.p014mm.plugin.game.p061ui.message;

import android.content.Context;
import android.database.Cursor;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import di3.C86312j;
import sw1.C48484q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.message.n */
public class C42358n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f114577d;

    /* renamed from: e */
    public final /* synthetic */ InteractiveMsgMRecycleView f114578e;

    /* renamed from: com.tencent.mm.plugin.game.ui.message.n$a */
    public class C42359a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Cursor f114579d;

        /* renamed from: e */
        public final /* synthetic */ int f114580e;

        public C42359a(Cursor cursor, int i) {
            this.f114579d = cursor;
            this.f114580e = i;
        }

        public void run() {
            C42358n nVar = C42358n.this;
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = nVar.f114578e;
            interactiveMsgMRecycleView.f114491E1 = new InteractiveMsgMRecycleView.C42326c(nVar.f114577d, this.f114579d, this.f114580e);
            C42358n nVar2 = C42358n.this;
            nVar2.f114578e.setLayoutManager(new LinearLayoutManager(nVar2.f114577d));
            InteractiveMsgMRecycleView interactiveMsgMRecycleView2 = C42358n.this.f114578e;
            interactiveMsgMRecycleView2.setAdapter(interactiveMsgMRecycleView2.f114491E1);
        }
    }

    public C42358n(InteractiveMsgMRecycleView interactiveMsgMRecycleView, Context context) {
        this.f114578e = interactiveMsgMRecycleView;
        this.f114577d = context;
    }

    public void run() {
        Class cls = C48484q.class;
        int mL = ((C48484q) C86312j.m106911c(cls)).xi0().mo66010mL(1);
        Cursor bF = ((C48484q) C86312j.m106911c(cls)).xi0().mo66005bF(1, 0, 15);
        ((C119157j) C119157j.f356862d).mo183895z(new C42359a(bF, mL));
    }
}
