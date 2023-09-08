package y23;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kj2.C61103a;
import lh2.C109344g0;
import qh2.C101198e;

/* renamed from: y23.h */
public abstract class C112388h<T extends C61103a> implements C101198e {

    /* renamed from: d */
    public T f336503d;

    /* renamed from: a */
    public abstract void mo14581a(Intent intent);

    /* renamed from: b */
    public void mo14582b() {
    }

    /* renamed from: c */
    public void mo14583c() {
    }

    /* renamed from: d */
    public void mo142541d() {
    }

    /* renamed from: e */
    public final void mo164102e() {
        String i = mo164104i();
        Log.m105924i(i, "report:" + mo14584g());
        T t = this.f336503d;
        if (t != null) {
            t.mo86054n();
        }
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    /* renamed from: g */
    public abstract String mo14584g();

    /* renamed from: h */
    public final void mo164103h() {
        String i = mo164104i();
        Log.m105924i(i, "reportOnce:" + mo14584g());
        T t = this.f336503d;
        if (t != null) {
            t.mo86054n();
        }
        this.f336503d = null;
    }

    /* renamed from: i */
    public final String mo164104i() {
        return "MicroMsg.TimelineEditorReportBasePlugin" + mo14584g();
    }
}
