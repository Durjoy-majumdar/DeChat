package e21;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ScanMaterialCodeEvent;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import te3.C49622gw3;
import vl2.j$$w;

/* renamed from: e21.r0 */
public class C97589r0 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ ScanMaterialCodeEvent f286319d;

    /* renamed from: e */
    public final /* synthetic */ Context f286320e;

    /* renamed from: f */
    public final /* synthetic */ C97591t0 f286321f;

    public C97589r0(C97591t0 t0Var, ScanMaterialCodeEvent scanMaterialCodeEvent, Context context) {
        this.f286321f = t0Var;
        this.f286319d = scanMaterialCodeEvent;
        this.f286320e = context;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Dialog dialog = this.f286321f.f286325d;
        if (dialog != null && dialog.isShowing()) {
            this.f286321f.f286325d.dismiss();
            this.f286321f.f286325d = null;
        }
        C86709a0.m107524d().mo123470p(1800, this);
        C45535g0 g0Var = (C45535g0) yVar;
        if (!g0Var.f221039i && !g0Var.f221040j) {
            ScanMaterialCodeEvent.C92558b bVar = this.f286319d.f265076e;
            C49622gw3 gw32 = g0Var.f123204r;
            bVar.f265083b = gw32.f134331f;
            bVar.f265084c = gw32.f134332g;
        }
        if (g0Var.f221040j) {
            ScanMaterialCodeEvent.C92558b bVar2 = this.f286319d.f265076e;
            String str2 = g0Var.f123204r.f134330e;
            bVar2.f265082a = str2;
            if (Util.isNullOrNil(str2)) {
                this.f286319d.f265076e.f265082a = this.f286320e.getString(C0966R.string.l_3);
            }
        }
        if (g0Var.f221039i) {
            String str3 = g0Var.f221037g;
            this.f286319d.f265076e.f265082a = str3;
            if (Util.isNullOrNil(str3)) {
                this.f286319d.f265076e.f265082a = this.f286320e.getString(C0966R.string.l_3);
            }
        }
        ((j$$w) this.f286319d.f265075d.f265081e).run();
    }
}
