package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import qo3.C77407n;
import u73.C52465l0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.o */
public class C43972o implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C52465l0 f119113a;

    /* renamed from: b */
    public final /* synthetic */ int f119114b;

    /* renamed from: c */
    public final /* synthetic */ C43973p f119115c;

    public C43972o(C43973p pVar, C52465l0 l0Var, int i) {
        this.f119115c = pVar;
        this.f119113a = l0Var;
        this.f119114b = i;
    }

    public void onDismiss() {
        Log.m105927v("FTSSearchActionSheetMgr", "selected pos %d", -1);
        C52465l0 l0Var = this.f119113a;
        if (l0Var != null) {
            ((C43964e) l0Var).mo68559a(-1, this.f119114b);
        }
        ((HashMap) this.f119115c.f119117a).remove(Integer.valueOf(this.f119114b));
    }
}
