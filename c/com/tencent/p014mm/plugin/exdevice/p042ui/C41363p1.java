package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import d81.C20448c;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import te3.pa4;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.p1 */
public final class C41363p1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f111355d;

    /* renamed from: e */
    public final /* synthetic */ int f111356e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f111357f;

    /* renamed from: g */
    public final /* synthetic */ pa4 f111358g;

    /* renamed from: h */
    public final /* synthetic */ SportHistoryUI f111359h;

    public C41363p1(boolean z, int i, JSONObject jSONObject, pa4 pa4, SportHistoryUI sportHistoryUI) {
        this.f111355d = z;
        this.f111356e = i;
        this.f111357f = jSONObject;
        this.f111358g = pa4;
        this.f111359h = sportHistoryUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f111355d && this.f111356e == 1) {
            String optString = this.f111357f.optString("finder_username");
            C20448c cVar = C20448c.f57466a;
            String str = this.f111358g.f139679e;
            C87412m.m108593f(str, "sportRecord.appName");
            cVar.mo31991a(3, 2, str, 1, 1, this.f111359h.f111281g);
            AppCompatActivity context = this.f111359h.getContext();
            C87412m.m108593f(context, "context");
            C87412m.m108593f(optString, "finderUserName");
            Intent intent = new Intent();
            intent.putExtra("finder_username", optString);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(context, intent);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
