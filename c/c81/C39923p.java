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
import v71.C52778d;

/* renamed from: c81.p */
public final class C39923p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f107050d;

    /* renamed from: e */
    public final /* synthetic */ int f107051e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f107052f;

    /* renamed from: g */
    public final /* synthetic */ C0435q f107053g;

    /* renamed from: h */
    public final /* synthetic */ pa4 f107054h;

    /* renamed from: i */
    public final /* synthetic */ C52778d f107055i;

    public C39923p(boolean z, int i, JSONObject jSONObject, C0435q qVar, pa4 pa4, C52778d dVar) {
        this.f107050d = z;
        this.f107051e = i;
        this.f107052f = jSONObject;
        this.f107053g = qVar;
        this.f107054h = pa4;
        this.f107055i = dVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f107050d && this.f107051e == 1) {
            String optString = this.f107052f.optString("finder_username");
            Activity context = this.f107053g.getContext();
            C87412m.m108593f(optString, "finderUserName");
            C87412m.m108594g(context, "context");
            Intent intent = new Intent();
            intent.putExtra("finder_username", optString);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(context, intent);
            C20448c cVar = C20448c.f57466a;
            String str = this.f107054h.f139679e;
            C87412m.m108593f(str, "sportRecord.appName");
            String str2 = this.f107055i.field_username;
            C87412m.m108593f(str2, "info.field_username");
            cVar.mo31991a(1, 2, str, 1, 1, str2);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
