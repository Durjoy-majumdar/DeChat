package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.q1 */
public class C73835q1 {

    /* renamed from: a */
    public long[] f216666a;

    /* renamed from: b */
    public C67391b f216667b;

    public C73835q1(C67391b bVar, long[] jArr) {
        this.f216667b = bVar;
        this.f216666a = jArr;
        bVar.f193286j.removeAllOptionMenu();
        C67391b bVar2 = this.f216667b;
        bVar2.f193286j.addTextOptionMenu(2, bVar2.mo91572m().getString(C0966R.string.anp), new C73769o1(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        C79368l lVar = (C79368l) this.f216667b.f193278b.mo102812a(C79368l.class);
        lVar.mo108211t5(new C73773p1(this, lVar));
    }
}
