package oo1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C1838k;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import fe1.C58969q;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import rs1.C13442s8;
import te3.C50242lc1;

/* renamed from: oo1.y */
public final class C11696y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f34253d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C50242lc1> f34254e;

    /* renamed from: f */
    public final /* synthetic */ C11692x f34255f;

    /* renamed from: g */
    public final /* synthetic */ C58969q f34256g;

    public C11696y(String str, LinkedList<C50242lc1> linkedList, C11692x xVar, C58969q qVar) {
        this.f34253d = str;
        this.f34254e = linkedList;
        this.f34255f = xVar;
        this.f34256g = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderMiniProgramWidget$handleMIniProgramList$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String str = this.f34253d;
        String str2 = "";
        String str3 = str == null ? str2 : str;
        String str4 = this.f34254e.get(0).f137297d;
        y0Var.xy0(6, str3, "", str4 == null ? str2 : str4, ((C13442s8) C39818r.f106831a.mo62444c(this.f34255f.f34246a).mo75002a(C13442s8.class)).mo12861q3());
        String str5 = this.f34254e.get(0).f137297d;
        String str6 = this.f34254e.get(0).f137298e;
        C11692x xVar = this.f34255f;
        C58969q qVar = this.f34256g;
        if (!(str5 == null || str6 == null)) {
            C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
            AppCompatActivity appCompatActivity = xVar.f34246a;
            if (qVar != null) {
                str2 = qVar.getUsername();
            }
            bVar.mo13270U5(appCompatActivity, str5, str6, C1838k.CTRL_INDEX, str2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderMiniProgramWidget$handleMIniProgramList$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
