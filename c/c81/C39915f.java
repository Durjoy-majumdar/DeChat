package c81;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import d81.C20448c;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import te3.pa4;

/* renamed from: c81.f */
public final class C39915f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f107027d;

    /* renamed from: e */
    public final /* synthetic */ int f107028e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f107029f;

    /* renamed from: g */
    public final /* synthetic */ C39904a f107030g;

    /* renamed from: h */
    public final /* synthetic */ pa4 f107031h;

    /* renamed from: i */
    public final /* synthetic */ String f107032i;

    public C39915f(boolean z, int i, JSONObject jSONObject, C39904a aVar, pa4 pa4, String str) {
        this.f107027d = z;
        this.f107028e = i;
        this.f107029f = jSONObject;
        this.f107030g = aVar;
        this.f107031h = pa4;
        this.f107032i = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f107027d && this.f107028e == 1) {
            String optString = this.f107029f.optString("finder_username");
            Activity context = this.f107030g.getContext();
            C87412m.m108593f(optString, "finderUserName");
            C87412m.m108594g(context, "context");
            Intent intent = new Intent();
            intent.putExtra("finder_username", optString);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(context, intent);
            C20448c cVar = C20448c.f57466a;
            String str = this.f107031h.f139679e;
            C87412m.m108593f(str, "sportRecord.appName");
            cVar.mo31991a(2, 2, str, 1, 1, this.f107032i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
