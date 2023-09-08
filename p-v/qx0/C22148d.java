package qx0;

import android.view.View;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18206a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C30766q;
import com.tencent.p014mm.storage.C30775s;
import gy3.C87412m;
import rb0.C48009v0;
import zt3.C119157j;

/* renamed from: qx0.d */
public final class C22148d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f62660d;

    /* renamed from: e */
    public final /* synthetic */ C19623o0 f62661e;

    /* renamed from: f */
    public final /* synthetic */ C22140b f62662f;

    /* renamed from: g */
    public final /* synthetic */ String f62663g;

    /* renamed from: h */
    public final /* synthetic */ C18412m3 f62664h;

    /* renamed from: qx0.d$a */
    public static final class C22149a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C18412m3 f62665d;

        /* renamed from: e */
        public final /* synthetic */ C19623o0 f62666e;

        /* renamed from: f */
        public final /* synthetic */ int f62667f;

        public C22149a(C18412m3 m3Var, C19623o0 o0Var, int i) {
            this.f62665d = m3Var;
            this.f62666e = o0Var;
            this.f62667f = i;
        }

        public final void run() {
            this.f62665d.mo22979f(this.f62666e, this.f62667f, 1);
        }
    }

    public C22148d(View view, C19623o0 o0Var, C22140b bVar, String str, C18412m3 m3Var) {
        this.f62660d = view;
        this.f62661e = o0Var;
        this.f62662f = bVar;
        this.f62663g = str;
        this.f62664h = m3Var;
    }

    public final void run() {
        C19623o0 o0Var;
        Object tag = this.f62660d.getTag();
        C18206a aVar = tag instanceof C18206a ? (C18206a) tag : null;
        if (aVar != null && (o0Var = aVar.f50327a) != null) {
            int i = aVar.f50328b;
            Log.m105926v("MicroMsg.BizTimeLineExposeHelper", "doUpdateReadStatus on time " + this.f62661e.mo25768r2());
            this.f62662f.f62642d.remove(this.f62663g);
            this.f62662f.getClass();
            String str = o0Var.mo25768r2() + '-' + o0Var.field_isExpand;
            if (!C87412m.m108589b(str, this.f62663g)) {
                return;
            }
            if (this.f62660d.isShown() || this.f62660d.isAttachedToWindow()) {
                C22140b bVar = this.f62662f;
                String r2 = this.f62661e.mo25768r2();
                C87412m.m108593f(r2, "info.id");
                bVar.getClass();
                bVar.f62641c.remove(r2);
                Log.m105926v("MicroMsg.BizTimeLineExposeHelper", "doUpdateReadStatus on expose " + this.f62661e.mo25768r2());
                if (!this.f62662f.f62643e.containsKey(str)) {
                    boolean z = false;
                    this.f62662f.mo35254a(false);
                    C22140b bVar2 = this.f62662f;
                    C19623o0 o0Var2 = this.f62661e;
                    bVar2.getClass();
                    C87412m.m108594g(o0Var2, "info");
                    if (C19627t.f55604s && o0Var2.mo25753A2()) {
                        C30766q vx02 = C48009v0.vx0();
                        vx02.getClass();
                        ((C119157j) C119157j.f356862d).mo183875f(new C30775s(o0Var2, vx02));
                        C48009v0.Jx0().ko0(o0Var2);
                    }
                    if (!o0Var2.field_isValidExposed) {
                        if (o0Var2.f55529n1 == 0) {
                            z = true;
                        }
                        if (z) {
                            C48009v0.Jx0().fq0(o0Var2);
                        }
                    }
                    o0Var2.f55522g1.f54997b = true;
                }
                this.f62662f.f62643e.put(str, Boolean.TRUE);
                ((C119157j) C119157j.f356862d).mo183876g(new C22149a(this.f62664h, this.f62661e, i), "BizTimeLineExpose");
            }
        }
    }
}
