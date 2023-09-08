package com.tencent.p014mm.plugin.record.p094ui;

import android.view.View;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$n */
public class RecordMsgImageUI$$n implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f272670d;

    /* renamed from: e */
    public final /* synthetic */ List f272671e;

    /* renamed from: f */
    public final /* synthetic */ RecordMsgImageUI f272672f;

    public RecordMsgImageUI$$n(RecordMsgImageUI recordMsgImageUI, List list, List list2) {
        this.f272672f = recordMsgImageUI;
        this.f272670d = list;
        this.f272671e = list2;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        this.f272672f.f272641q.mo107567l((View) null);
        e0Var.clear();
        e0Var.setHeaderTitle((CharSequence) "");
        for (int i = 0; i < this.f272670d.size(); i++) {
            e0Var.mo107142f(((Integer) this.f272670d.get(i)).intValue(), (CharSequence) this.f272671e.get(i));
        }
    }
}
