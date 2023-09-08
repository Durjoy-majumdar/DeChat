package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kg3.C76577a;
import org.json.JSONException;
import org.json.JSONObject;
import qs2.C101272j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k */
public class C95131k extends C95045a {

    /* renamed from: s */
    public C101272j f276089s;

    /* renamed from: t */
    public View f276090t;

    /* renamed from: u */
    public ImageView f276091u;

    /* renamed from: v */
    public ImageView f276092v;

    /* renamed from: w */
    public TextView f276093w;

    /* renamed from: x */
    public LinearLayout f276094x;

    /* renamed from: y */
    public LinearLayout f276095y;

    /* renamed from: z */
    public int f276096z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k$a */
    public class C95132a implements View.OnClickListener {
        public C95132a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingLbsComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp$1");
            C95131k kVar = C95131k.this;
            kVar.getClass();
            SnsMethodCalculate.markStartTimeMs("addClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            kVar.f276096z++;
            SnsMethodCalculate.markEndTimeMs("addClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            Intent intent = new Intent();
            intent.putExtra("map_view_type", 1);
            intent.putExtra("kwebmap_slat", C95131k.m121005G(C95131k.this).f296639C.f296640a);
            intent.putExtra("kwebmap_lng", C95131k.m121005G(C95131k.this).f296639C.f296641b);
            intent.putExtra("kwebmap_scale", C95131k.m121005G(C95131k.this).f296639C.f296642c);
            intent.putExtra("kPoiName", C95131k.m121005G(C95131k.this).f296639C.f296644e);
            intent.putExtra("Kwebmap_locaion", C95131k.m121005G(C95131k.this).f296639C.f296643d);
            Log.m105924i("AdLandingBorderedComp", "locatint to slat " + C95131k.m121005G(C95131k.this).f296639C.f296640a + ", slong " + C95131k.m121005G(C95131k.this).f296639C.f296641b + ", " + C95131k.m121005G(C95131k.this).f296639C.f296644e);
            C88144b.m109795m(C95131k.this.f276579d, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 2002);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingLbsComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C95131k(Context context, C101272j jVar, ViewGroup viewGroup) {
        super(context, jVar, viewGroup);
        this.f276089s = jVar;
    }

    /* renamed from: G */
    public static /* synthetic */ C101272j m121005G(C95131k kVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        C101272j jVar = kVar.f276089s;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        return jVar;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        View view = this.f276586n;
        this.f276091u = (ImageView) view.findViewById(C0966R.C0970id.fms);
        this.f276092v = (ImageView) view.findViewById(C0966R.C0970id.isy);
        this.f276093w = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        this.f276094x = (LinearLayout) view.findViewById(C0966R.C0970id.f7c);
        this.f276095y = (LinearLayout) view.findViewById(C0966R.C0970id.f357785br0);
        this.f276090t = this.f276094x;
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        this.f276093w.setText(this.f276089s.f296639C.f296643d);
        if (this.f276089s.f296503i) {
            this.f276091u.setImageDrawable(C76577a.m92158i(this.f276579d, C0966R.C0969drawable.bpu));
            this.f276092v.setImageDrawable(C76577a.m92158i(this.f276579d, C0966R.C0969drawable.bq6));
            this.f276093w.setTextColor(-16777216);
            this.f276094x.setBackgroundResource(C0966R.C0969drawable.f4410bu);
        } else {
            this.f276091u.setImageDrawable(C76577a.m92158i(this.f276579d, C0966R.C0969drawable.bpt));
            this.f276092v.setImageDrawable(C76577a.m92158i(this.f276579d, C0966R.C0969drawable.bq5));
            this.f276093w.setTextColor(-1);
            this.f276094x.setBackgroundResource(C0966R.C0969drawable.f4411bv);
        }
        LinearLayout linearLayout = this.f276094x;
        C101272j jVar = this.f276089s;
        linearLayout.setPadding((int) jVar.f296499e, 0, (int) jVar.f296500f, 0);
        LinearLayout linearLayout2 = this.f276095y;
        C101272j jVar2 = this.f276089s;
        linearLayout2.setPadding(0, (int) jVar2.f296497c, 0, (int) jVar2.f296498d);
        mo131533E(this.f276094x);
        C95132a aVar = new C95132a();
        SnsMethodCalculate.markStartTimeMs("setOnclickLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        View view = this.f276090t;
        if (view != null) {
            view.setOnClickListener(aVar);
        }
        SnsMethodCalculate.markEndTimeMs("setOnclickLsn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        return C0966R.C0971layout.c1b;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return false;
        }
        try {
            SnsMethodCalculate.markStartTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            int i = this.f276096z;
            SnsMethodCalculate.markEndTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            jSONObject.put("clickCount", i);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("AdLandingBorderedComp", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingLbsComp");
            return false;
        }
    }
}
