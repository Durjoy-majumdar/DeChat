package oo1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import com.google.android.gms.common.Scopes;
import com.tencent.xweb.util.WXWebReporter;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fe1.C58969q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import rs1.C13442s8;
import te3.C64284cg;

/* renamed from: oo1.w */
public final class C11691w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58969q f34243d;

    /* renamed from: e */
    public final /* synthetic */ C64284cg f34244e;

    /* renamed from: f */
    public final /* synthetic */ C11684u f34245f;

    public C11691w(C58969q qVar, C64284cg cgVar, C11684u uVar) {
        this.f34243d = qVar;
        this.f34244e = cgVar;
        this.f34245f = uVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderMediaEntranceWidget$handleMediaEntrance$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0 y0Var = (C58417y0) c;
        C58969q qVar = this.f34243d;
        String username = qVar != null ? qVar.getUsername() : "";
        String str = this.f34244e.f182468d;
        y0Var.xy0(4, username, str == null ? "" : str, "", ((C13442s8) C39818r.f106831a.mo62444c(this.f34245f.f34231a).mo75002a(C13442s8.class)).mo12861q3());
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f34244e.f182468d);
        intent.putExtra("Contact_Scene", WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", 210);
        C88144b.m109791i(this.f34245f.f34231a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderMediaEntranceWidget$handleMediaEntrance$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
