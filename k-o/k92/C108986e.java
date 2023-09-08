package k92;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.p014mm.plugin.multitask.C105919k;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import d92.C107028a;
import di3.C86312j;
import f92.C107522b;
import f92.C107525c;
import l92.C109296d;
import l92.C109299f;
import te3.C110964i13;
import te3.C64272c13;

/* renamed from: k92.e */
public final class C108986e implements C109299f {

    /* renamed from: a */
    public final /* synthetic */ C108976d f326452a;

    public C108986e(C108976d dVar) {
        this.f326452a = dVar;
    }

    /* renamed from: a */
    public int mo160108a(float f) {
        C108976d dVar;
        C107028a aVar;
        Class cls = C105919k.class;
        if (this.f326452a.mo160082g() && this.f326452a.mo160080e()) {
            return 1;
        }
        this.f326452a.mo67897d();
        if (!this.f326452a.mo90714X()) {
            return 2;
        }
        C108976d dVar2 = this.f326452a;
        C110964i13 i132 = dVar2.f326420c;
        C64272c13 c132 = null;
        C64272c13 c133 = i132 != null ? i132.f332063j : null;
        long j = 2;
        if (c133 != null) {
            c133.f182352d = 2;
        }
        if (i132 != null) {
            c132 = i132.f332063j;
        }
        if (c132 != null) {
            if (dVar2.mo160080e()) {
                j = 1;
            }
            c132.f182353e = j;
        }
        Point b4 = ((C105919k) C86312j.m106911c(cls)).mo151043b4();
        if (b4 == null || (aVar = dVar.f326423e) == null) {
            return 3;
        }
        Bitmap bitmap = (dVar = this.f326452a).f326434p;
        C109296d dVar3 = dVar.f326424f;
        ((C105919k) C86312j.m106911c(cls)).mo151041Y1();
        if (aVar.mo70828c()) {
            aVar.mo67912n(new C107522b(dVar3, b4, aVar, bitmap, false, f));
            return 3;
        }
        MMHandlerThread.postToMainThread(new C107525c(dVar3));
        return 3;
    }

    /* renamed from: b */
    public boolean mo160109b() {
        C107028a aVar = this.f326452a.f326423e;
        if (aVar != null) {
            aVar.mo67907g();
        }
        C108976d dVar = this.f326452a;
        C107028a aVar2 = dVar.f326423e;
        if (aVar2 != null) {
            aVar2.mo70835k();
        }
        C107028a aVar3 = dVar.f326423e;
        dVar.f326434p = aVar3 != null ? aVar3.getBitmap() : null;
        return false;
    }
}
