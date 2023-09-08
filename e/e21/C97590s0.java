package e21;

import android.app.Dialog;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ScanMaterialCodeEvent;
import com.tencent.p014mm.sdk.platformtools.Util;
import f21.C45741c;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import te3.C49909iw3;
import vl2.j$$w;

/* renamed from: e21.s0 */
public class C97590s0 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ ScanMaterialCodeEvent f286322d;

    /* renamed from: e */
    public final /* synthetic */ Context f286323e;

    /* renamed from: f */
    public final /* synthetic */ C97591t0 f286324f;

    public C97590s0(C97591t0 t0Var, ScanMaterialCodeEvent scanMaterialCodeEvent, Context context) {
        this.f286324f = t0Var;
        this.f286322d = scanMaterialCodeEvent;
        this.f286323e = context;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Dialog dialog = this.f286324f.f286325d;
        if (dialog != null && dialog.isShowing()) {
            this.f286324f.f286325d.dismiss();
            this.f286324f.f286325d = null;
        }
        C86709a0.m107524d().mo123470p(2811, this);
        C45741c cVar = (C45741c) yVar;
        if (!cVar.f221039i && !cVar.f221040j) {
            ScanMaterialCodeEvent.C92558b bVar = this.f286322d.f265076e;
            C49909iw3 iw32 = cVar.f123596r;
            bVar.f265083b = iw32.f135727f;
            bVar.f265084c = iw32.f135728g;
        }
        if (cVar.f221040j) {
            ScanMaterialCodeEvent.C92558b bVar2 = this.f286322d.f265076e;
            String str2 = cVar.f123596r.f135726e;
            bVar2.f265082a = str2;
            if (Util.isNullOrNil(str2)) {
                this.f286322d.f265076e.f265082a = this.f286323e.getString(C0966R.string.l_3);
            }
        }
        if (cVar.f221039i) {
            String str3 = cVar.f221037g;
            this.f286322d.f265076e.f265082a = str3;
            if (Util.isNullOrNil(str3)) {
                this.f286322d.f265076e.f265082a = this.f286323e.getString(C0966R.string.l_3);
            }
        }
        ((j$$w) this.f286322d.f265075d.f265081e).run();
    }
}
