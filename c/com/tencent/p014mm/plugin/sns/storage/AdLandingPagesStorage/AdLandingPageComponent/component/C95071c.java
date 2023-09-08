package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C86258g;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import org.json.JSONException;
import org.json.JSONObject;
import qo3.C77407n;
import qs2.C101260d;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c */
public class C95071c extends C95045a {

    /* renamed from: s */
    public ImageView f275952s;

    /* renamed from: t */
    public ImageView f275953t;

    /* renamed from: u */
    public TextView f275954u;

    /* renamed from: v */
    public LinearLayout f275955v;

    /* renamed from: w */
    public LinearLayout f275956w;

    /* renamed from: x */
    public int f275957x;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c$a */
    public class C95072a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.c$a$a */
        public class C95073a implements C77407n.C47880p {
            public C95073a() {
            }

            public void onDismiss() {
                SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp$1$1");
                C95198o2.m121132d(C95071c.this.f276579d);
                SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp$1$1");
            }
        }

        public C95072a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingContactComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp$1");
            C95071c cVar = C95071c.this;
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("addClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            cVar.f275957x++;
            SnsMethodCalculate.markEndTimeMs("addClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            if (C86258g.C86259a.f250859a == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingContactComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (C95071c.m120885G(C95071c.this).f296559C.size() > 1) {
                C86258g gVar = C86258g.C86259a.f250859a;
                C95071c cVar2 = C95071c.this;
                gVar.mo10688Wu(cVar2.f276579d, C95071c.m120885G(cVar2).f296559C, new C95073a());
            } else if (C95071c.m120885G(C95071c.this).f296559C.size() > 0) {
                AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
                C95071c cVar3 = C95071c.this;
                instance.confirmDialPhoneNum((Activity) cVar3.f276579d, C95071c.m120885G(cVar3).f296559C.get(0));
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingContactComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C95071c(Context context, C101260d dVar, ViewGroup viewGroup) {
        super(context, dVar, viewGroup);
    }

    /* renamed from: G */
    public static /* synthetic */ C101260d m120885G(C95071c cVar) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        C101260d H = cVar.mo131582H();
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        return H;
    }

    /* renamed from: H */
    public final C101260d mo131582H() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        C101260d dVar = (C101260d) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        return dVar;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        if (mo131582H().f296559C.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            return;
        }
        View view = this.f276586n;
        this.f275952s = (ImageView) view.findViewById(C0966R.C0970id.fms);
        this.f275953t = (ImageView) view.findViewById(C0966R.C0970id.isy);
        this.f275954u = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        this.f275956w = (LinearLayout) view.findViewById(C0966R.C0970id.f357785br0);
        this.f275955v = (LinearLayout) view.findViewById(C0966R.C0970id.f7c);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        this.f275954u.setText(mo131582H().f296559C.get(0));
        if (mo131582H().f296503i) {
            this.f275952s.setImageDrawable(C76577a.m92158i(this.f276579d, C0966R.C0969drawable.bru));
            this.f275953t.setImageDrawable(C76577a.m92158i(this.f276579d, C0966R.C0969drawable.bq6));
            this.f275954u.setTextColor(-16777216);
            this.f275955v.setBackgroundResource(C0966R.C0969drawable.f4410bu);
        } else {
            this.f275952s.setImageDrawable(C76577a.m92158i(this.f276579d, C0966R.C0969drawable.brt));
            this.f275953t.setImageDrawable(C76577a.m92158i(this.f276579d, C0966R.C0969drawable.bq5));
            this.f275954u.setTextColor(-1);
            this.f275955v.setBackgroundResource(C0966R.C0969drawable.f4411bv);
        }
        this.f275955v.setPadding((int) mo131582H().f296499e, 0, (int) mo131582H().f296500f, 0);
        this.f275956w.setPadding(0, (int) mo131582H().f296497c, 0, (int) mo131582H().f296498d);
        mo131533E(this.f275955v);
        this.f275955v.setOnClickListener(new C95072a());
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        return C0966R.C0971layout.c1b;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            return false;
        }
        try {
            SnsMethodCalculate.markStartTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            int i = this.f275957x;
            SnsMethodCalculate.markEndTimeMs("getClickCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            jSONObject.put("clickCount", i);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("AdLandingBorderedComp", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingContactComp");
            return false;
        }
    }
}
