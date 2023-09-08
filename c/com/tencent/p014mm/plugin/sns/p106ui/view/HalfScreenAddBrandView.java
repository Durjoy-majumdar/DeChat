package com.tencent.p014mm.plugin.sns.p106ui.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.model.C43035c;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import ob0.C117747y;
import or2.C100381a;
import org.json.JSONObject;
import p011cm.C28611c;
import p239sv.C48464g;
import qo3.C77407n;
import qo3.C89779i0;
import vr2.C102245g;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView */
public class HalfScreenAddBrandView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: d */
    public Context f281271d;

    /* renamed from: e */
    public C102245g f281272e;

    /* renamed from: f */
    public int f281273f;

    /* renamed from: g */
    public View f281274g;

    /* renamed from: h */
    public WeImageView f281275h;

    /* renamed from: i */
    public RoundCornerImageView f281276i;

    /* renamed from: j */
    public TextView f281277j;

    /* renamed from: n */
    public TextView f281278n;

    /* renamed from: o */
    public Button f281279o;

    /* renamed from: p */
    public C100381a f281280p;

    public HalfScreenAddBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onClick(View view) {
        int i;
        C102245g gVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/view/HalfScreenAddBrandView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        if (view.getId() == C0966R.C0970id.alc) {
            int i2 = this.f281273f;
            if (i2 == 182) {
                this.f281280p.mo139667g(i2);
            } else {
                C100381a aVar = this.f281280p;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                if (aVar.f294020c == null || (gVar = aVar.f294026i) == null || Util.isNullOrNil(gVar.f301112a)) {
                    SnsMethodCalculate.markEndTimeMs("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                } else {
                    Context context = aVar.f294020c;
                    C89779i0 Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), aVar.f294020c.getString(C0966R.string.bjo), true, true, (DialogInterface.OnCancelListener) null);
                    aVar.f294025h = Q;
                    C117747y a = C43035c.m46669a(aVar.f294026i.f301112a, new C100381a.C100384b(aVar.f294020c, i2, Q, (C100381a.C100382a) null), i2);
                    if (a instanceof C48464g) {
                        C86709a0.m107524d().mo123460f(a);
                    } else if (a instanceof C28611c) {
                        C86709a0.m107524d().mo123460f(a);
                    }
                    SnsMethodCalculate.markEndTimeMs("sendAddBrandFromTimeline", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                }
            }
            C100381a aVar2 = this.f281280p;
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("closeHalfScreen", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            C77407n nVar = aVar2.f294021d;
            if (nVar != null && nVar.mo107563h()) {
                aVar2.f294021d.mo107572p();
            }
            SnsMethodCalculate.markEndTimeMs("closeHalfScreen", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            C102245g gVar2 = this.f281272e;
            String str = (gVar2 == null || TextUtils.isEmpty(gVar2.f301112a)) ? "" : this.f281272e.f301112a;
            C100381a aVar3 = this.f281280p;
            int i3 = this.f281273f;
            aVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("addBrandReport", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            if (i3 == 0) {
                i = 1;
            } else if (i3 == 182) {
                try {
                    i = aVar3.f294027j ? 4 : 3;
                } catch (Exception e) {
                    Log.m105920e("HalfScreenAddBrandController", "addBrandReport exp:" + e.toString());
                }
            } else {
                i = 2;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("clickType", i);
            jSONObject2.put("brandUsername", Util.nullAsNil(str));
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", aVar3.f294028k);
            jSONObject.put("snsid", aVar3.f294030m);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            jSONObject.put("adExtInfo", aVar3.f294029l);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("timeline_ad_half_screen_quickly_add_brand_btn", jSONObject3);
            Log.m105924i("HalfScreenAddBrandController", "addBrandReport timeline_ad_half_screen_quickly_add_brand_btn, content=" + jSONObject3);
            SnsMethodCalculate.markEndTimeMs("addBrandReport", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        } else if (view.getId() == C0966R.C0970id.be4) {
            C100381a aVar4 = this.f281280p;
            aVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("closeHalfScreen", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            C77407n nVar2 = aVar4.f294021d;
            if (nVar2 != null && nVar2.mo107563h()) {
                aVar4.f294021d.mo107572p();
            }
            SnsMethodCalculate.markEndTimeMs("closeHalfScreen", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/view/HalfScreenAddBrandView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public HalfScreenAddBrandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f281271d = context;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
        View inflate = LayoutInflater.from(this.f281271d).inflate(C0966R.C0971layout.f359825az1, this);
        this.f281274g = inflate;
        this.f281275h = (WeImageView) inflate.findViewById(C0966R.C0970id.be4);
        this.f281276i = (RoundCornerImageView) this.f281274g.findViewById(C0966R.C0970id.fcl);
        this.f281277j = (TextView) this.f281274g.findViewById(C0966R.C0970id.kvo);
        this.f281278n = (TextView) this.f281274g.findViewById(C0966R.C0970id.kvm);
        TextView textView = (TextView) this.f281274g.findViewById(C0966R.C0970id.kvn);
        TextView textView2 = (TextView) this.f281274g.findViewById(C0966R.C0970id.kvl);
        Button button = (Button) this.f281274g.findViewById(C0966R.C0970id.alc);
        this.f281279o = button;
        button.setOnClickListener(this);
        this.f281275h.setOnClickListener(this);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.view.HalfScreenAddBrandView");
    }
}
