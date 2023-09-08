package ll0;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84959i;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.sdk.platformtools.SyncTask;

/* renamed from: ll0.h */
public class C88577h extends SyncTask<Void> {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f255826a;

    /* renamed from: b */
    public final /* synthetic */ boolean f255827b;

    /* renamed from: c */
    public final /* synthetic */ C88578i f255828c;

    public C88577h(C88578i iVar, C83780d1 d1Var, boolean z) {
        this.f255828c = iVar;
        this.f255826a = d1Var;
        this.f255827b = z;
    }

    public Object run() {
        C88578i iVar = this.f255828c;
        C83780d1 d1Var = this.f255826a;
        boolean z = this.f255827b;
        iVar.getClass();
        C84959i.f247617b.mo117842c(d1Var.f244558J);
        View contentView = d1Var.f244558J.getContentView();
        if (z) {
            C84983t0 G = C84983t0.m104780G(contentView, (Context) null, d1Var.mo116161P0());
            if (G != null) {
                G.setShowDoneButton(false);
            }
            contentView.requestFocus();
        }
        return null;
    }
}
