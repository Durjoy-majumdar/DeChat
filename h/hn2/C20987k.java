package hn2;

import android.content.Context;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsManageFindOtherServiceUI;
import p274xx.C15907f;
import te3.C52238za0;
import xm2.C23109g;

/* renamed from: hn2.k */
public class C20987k implements SettingsManageFindOtherServiceUI.C19175c {

    /* renamed from: a */
    public final /* synthetic */ Context f59425a;

    /* renamed from: b */
    public final /* synthetic */ long f59426b;

    /* renamed from: c */
    public final /* synthetic */ C15907f.C15909b f59427c;

    /* renamed from: hn2.k$a */
    public class C20988a implements C23109g {
        public C20988a() {
        }

        /* renamed from: a */
        public void mo24594a(Context context, boolean z, C52238za0 za02) {
            if (za02 == null || !z) {
                C20974j.m23157k(C20987k.this.f59425a);
                C20987k.this.f59427c.mo6380a();
                return;
            }
            C20974j.m23158l(C20987k.this.f59425a);
            C20987k.this.f59427c.onSuccess();
        }
    }

    public C20987k(Context context, long j, C15907f.C15909b bVar) {
        this.f59425a = context;
        this.f59426b = j;
        this.f59427c = bVar;
    }

    /* renamed from: a */
    public void mo24593a(boolean z) {
        if (z) {
            C20974j.m23147a(this.f59425a, 3, 1, this.f59426b, 0, new C20988a());
        } else {
            this.f59427c.mo6380a();
        }
    }
}
