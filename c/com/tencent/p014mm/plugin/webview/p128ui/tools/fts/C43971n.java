package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import nj3.C11184p0;
import u73.C52465l0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.n */
public class C43971n implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C52465l0 f119110d;

    /* renamed from: e */
    public final /* synthetic */ int f119111e;

    /* renamed from: f */
    public final /* synthetic */ C43973p f119112f;

    public C43971n(C43973p pVar, C52465l0 l0Var, int i) {
        this.f119112f = pVar;
        this.f119110d = l0Var;
        this.f119111e = i;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Log.m105927v("FTSSearchActionSheetMgr", "selected pos %d", Integer.valueOf(i));
        C52465l0 l0Var = this.f119110d;
        if (l0Var != null) {
            ((C43964e) l0Var).mo68559a(i, this.f119111e);
        }
        ((HashMap) this.f119112f.f119117a).remove(Integer.valueOf(this.f119111e));
    }
}
