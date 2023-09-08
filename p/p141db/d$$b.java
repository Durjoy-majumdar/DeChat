package p141db;

import android.view.View;
import android.view.ViewTreeObserver;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: db.d$$b */
public final /* synthetic */ class d$$b implements C79778e.C79779a {

    /* renamed from: a */
    public final /* synthetic */ C86219d f250796a;

    /* renamed from: b */
    public final /* synthetic */ View f250797b;

    /* renamed from: c */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f250798c;

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f250799d;

    /* renamed from: e */
    public final /* synthetic */ int f250800e;

    /* renamed from: f */
    public final /* synthetic */ boolean[] f250801f;

    public /* synthetic */ d$$b(C86219d dVar, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, C81925i2 i2Var, int i, boolean[] zArr) {
        this.f250796a = dVar;
        this.f250797b = view;
        this.f250798c = onGlobalLayoutListener;
        this.f250799d = i2Var;
        this.f250800e = i;
        this.f250801f = zArr;
    }

    /* renamed from: g */
    public final void mo109919g(C79778e.C79780b bVar, boolean z) {
        C86219d dVar = this.f250796a;
        View view = this.f250797b;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f250798c;
        C81925i2 i2Var = this.f250799d;
        int i = this.f250800e;
        boolean[] zArr = this.f250801f;
        dVar.getClass();
        if (!z) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            i2Var.mo109647a(i, dVar.mo115109j("fail: requestDeviceOrientation fail"));
            return;
        }
        C119179t tVar = C119157j.f356862d;
        d$$c d__c = new d$$c(dVar, zArr, i2Var, i, view, onGlobalLayoutListener);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(d__c, 500, false);
    }
}
