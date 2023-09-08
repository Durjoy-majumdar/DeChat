package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsRatioView;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONObject;
import os2.C100417r0;

/* renamed from: com.tencent.mm.plugin.sns.ui.y2 */
public class C96319y2 implements View.OnClickListener {

    /* renamed from: d */
    public Context f281693d;

    /* renamed from: e */
    public View f281694e;

    /* renamed from: f */
    public TextView f281695f;

    /* renamed from: g */
    public TextView f281696g;

    /* renamed from: h */
    public TextView f281697h;

    /* renamed from: i */
    public View f281698i;

    /* renamed from: j */
    public Button f281699j;

    /* renamed from: n */
    public Button f281700n;

    /* renamed from: o */
    public View f281701o;

    /* renamed from: p */
    public SnsRatioView f281702p;

    /* renamed from: q */
    public TextView f281703q;

    /* renamed from: r */
    public TextView f281704r;

    /* renamed from: s */
    public TimelineClickListener f281705s;

    /* renamed from: t */
    public int f281706t = Color.parseColor("#1A000000");

    /* renamed from: u */
    public int f281707u = Color.parseColor("#FFFFFFFF");

    /* renamed from: v */
    public int f281708v = Color.parseColor("#E6000000");

    /* renamed from: w */
    public int f281709w = Color.parseColor("#4D000000");

    public C96319y2(Context context, View view, TimelineClickListener timelineClickListener) {
        this.f281693d = context;
        this.f281705s = timelineClickListener;
        this.f281694e = view.findViewById(C0966R.C0970id.f359534le1);
        this.f281706t = context.getResources().getColor(C0966R.color.acm);
        this.f281707u = context.getResources().getColor(C0966R.color.acj);
        this.f281708v = context.getResources().getColor(C0966R.color.acn);
        this.f281709w = context.getResources().getColor(C0966R.color.ack);
        this.f281695f = (TextView) view.findViewById(C0966R.C0970id.le5);
        this.f281696g = (TextView) view.findViewById(C0966R.C0970id.f359540le3);
        this.f281697h = (TextView) view.findViewById(C0966R.C0970id.f359535le2);
        this.f281698i = view.findViewById(C0966R.C0970id.ldy);
        this.f281699j = (Button) view.findViewById(C0966R.C0970id.ldz);
        this.f281700n = (Button) view.findViewById(C0966R.C0970id.f359529le0);
        this.f281701o = view.findViewById(C0966R.C0970id.icj);
        this.f281702p = (SnsRatioView) view.findViewById(C0966R.C0970id.le4);
        this.f281703q = (TextView) view.findViewById(C0966R.C0970id.le6);
        this.f281704r = (TextView) view.findViewById(C0966R.C0970id.le7);
        this.f281699j.setOnClickListener(this);
        this.f281700n.setOnClickListener(this);
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 4);
        int b2 = C76577a.m92151b(MMApplicationContext.getContext(), 8);
        int b3 = C76577a.m92151b(MMApplicationContext.getContext(), 8);
        SnsRatioView snsRatioView = this.f281702p;
        snsRatioView.getClass();
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
        snsRatioView.f281582o.setAntiAlias(true);
        snsRatioView.f281583p.setAntiAlias(true);
        snsRatioView.f281576f = b;
        snsRatioView.f281579i = Math.max(b, b3);
        snsRatioView.f281577g = 70;
        snsRatioView.f281578h = b2;
        float[] fArr = snsRatioView.f281584q;
        float f = (float) b;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
    }

    /* renamed from: a */
    public static ADInfo.C95012d m123550a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("getAdVoteInfoExtFromWebUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        SnsMethodCalculate.markStartTimeMs("getSnsAdVoteResultInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        long currentTimeMillis = System.currentTimeMillis();
        String i = C86709a0.m107523b().mo121111i();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        sb.append(str);
        if (str2 == null) {
            str2 = str3;
        }
        sb.append(str2);
        if (i == null) {
            i = str3;
        }
        sb.append(i);
        if (sb.length() > 0) {
            str3 = MMApplicationContext.getContext().getSharedPreferences("SnsAdVote", 0).getString(sb.toString() + "_voteRet", str3);
        } else {
            Log.m105920e("StorageHelper", "getSnsAdVoteResultInfo, key is empty");
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105924i("StorageHelper", "getSnsAdVoteResultInfo, ret=" + str3 + ", timeCost=" + (currentTimeMillis2 - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("getSnsAdVoteResultInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        try {
            if (!TextUtils.isEmpty(str3)) {
                JSONArray jSONArray = new JSONArray(str3);
                if (jSONArray.length() == 0) {
                    SnsMethodCalculate.markEndTimeMs("getAdVoteInfoExtFromWebUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
                    return null;
                }
                ADInfo.C95012d dVar = new ADInfo.C95012d();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    ADInfo.C95013e eVar = new ADInfo.C95013e();
                    eVar.f275664a = jSONObject.optString("id");
                    eVar.f275665b = jSONObject.optInt("scoring");
                    jSONObject.optInt("friends");
                    JSONArray optJSONArray = jSONObject.optJSONArray("friendsList");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                            eVar.f275666c.add(optJSONArray.getString(i3));
                        }
                    }
                    dVar.f275663a.add(eVar);
                }
                SnsMethodCalculate.markEndTimeMs("getAdVoteInfoExtFromWebUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
                return dVar;
            }
        } catch (Exception e) {
            Log.m105920e("SnsAdCardVoteCtrl", "getAdVoteInfoExtFromWebUpdate, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getAdVoteInfoExtFromWebUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        return null;
    }

    /* renamed from: b */
    public void mo134155b() {
        SnsMethodCalculate.markStartTimeMs("hideVoteInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        if (this.f281694e.getVisibility() != 8) {
            View view = this.f281694e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "hideVoteInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "hideVoteInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("hideVoteInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
    }

    /* renamed from: c */
    public void mo134156c(SnsInfo snsInfo, Object obj) {
        int i;
        Object obj2 = obj;
        SnsMethodCalculate.markStartTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        try {
            this.f281699j.setTag(obj2);
            this.f281700n.setTag(obj2);
            ADXml adXml = snsInfo.getAdXml();
            ADXml.C95025l lVar = snsInfo.getAdXml().adVoteInfo;
            String uxinfo = snsInfo.getUxinfo();
            String str = lVar.f275731a;
            int b = C100417r0.m131413b(str, uxinfo);
            boolean z = b > 0;
            ADInfo.C95012d a = m123550a(str, uxinfo);
            if (a == null) {
                Log.m105924i("SnsAdCardVoteCtrl", "fillVoteInfoView, web voteResult == null, snsId=" + snsInfo.getSnsId());
                a = snsInfo.getAdInfo().adVoteInfoExt;
            } else {
                Log.m105924i("SnsAdCardVoteCtrl", "fillVoteInfoView, web voteResult != null, snsId=" + snsInfo.getSnsId());
            }
            if (!TextUtils.isEmpty(adXml.adCardDesc)) {
                this.f281697h.setText(adXml.adCardDesc);
                this.f281697h.setVisibility(0);
            } else {
                this.f281697h.setVisibility(8);
            }
            if (!TextUtils.isEmpty(lVar.f275732b)) {
                this.f281696g.setText(lVar.f275732b);
                this.f281696g.setVisibility(0);
            } else {
                this.f281696g.setVisibility(8);
            }
            if (!TextUtils.isEmpty(adXml.adCardTitle)) {
                this.f281695f.setText(adXml.adCardTitle);
                this.f281695f.setVisibility(0);
            } else {
                this.f281695f.setVisibility(8);
                this.f281696g.setVisibility(8);
            }
            String str2 = lVar.f275733c.get(0).f275739f;
            String str3 = lVar.f275733c.get(1).f275739f;
            String a2 = lVar.mo131458a(0);
            String a3 = lVar.mo131458a(1);
            if (z) {
                a.getClass();
                SnsMethodCalculate.markStartTimeMs("getLeftRatio", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                ADInfo.C95013e a4 = a.mo131418a(str2);
                ADInfo.C95013e a5 = a.mo131418a(str3);
                int i2 = a4 == null ? 0 : a4.f275665b;
                int i3 = (a5 == null ? 0 : a5.f275665b) + i2;
                if (i3 > 0) {
                    i = (i2 * 100) / i3;
                    SnsMethodCalculate.markEndTimeMs("getLeftRatio", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                } else {
                    i = 50;
                    SnsMethodCalculate.markEndTimeMs("getLeftRatio", "com.tencent.mm.plugin.sns.storage.ADInfo$AdVoteInfoExt");
                }
                int i4 = 100 - i;
                View view = this.f281698i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = this.f281701o;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f281702p.mo134105a(i, i4);
                TextView textView = this.f281703q;
                textView.setText(a2 + " " + i + "%");
                TextView textView2 = this.f281704r;
                textView2.setText(i4 + "% " + a3);
                if (b == 1) {
                    SnsRatioView snsRatioView = this.f281702p;
                    int i5 = this.f281706t;
                    int i6 = this.f281707u;
                    snsRatioView.getClass();
                    SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
                    snsRatioView.f281582o.setColor(i5);
                    snsRatioView.f281583p.setColor(i6);
                    snsRatioView.invalidate();
                    SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
                    this.f281703q.setTextColor(this.f281708v);
                    this.f281704r.setTextColor(this.f281709w);
                } else {
                    SnsRatioView snsRatioView2 = this.f281702p;
                    int i7 = this.f281707u;
                    int i8 = this.f281706t;
                    snsRatioView2.getClass();
                    SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
                    snsRatioView2.f281582o.setColor(i7);
                    snsRatioView2.f281583p.setColor(i8);
                    snsRatioView2.invalidate();
                    SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ui.widget.SnsRatioView");
                    this.f281703q.setTextColor(this.f281709w);
                    this.f281704r.setTextColor(this.f281708v);
                }
            } else {
                View view3 = this.f281698i;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view4 = this.f281701o;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "refreshUI", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f281699j.setText(a2);
                this.f281700n.setText(a3);
            }
        } catch (Exception e) {
            Log.m105920e("SnsAdCardVoteCtrl", "fillVoteInfoView, exp:" + android.util.Log.getStackTraceString(e));
        }
        SnsMethodCalculate.markEndTimeMs("refreshUI", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
    }

    /* renamed from: d */
    public void mo134157d() {
        SnsMethodCalculate.markStartTimeMs("showVoteInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        if (this.f281694e.getVisibility() != 0) {
            View view = this.f281694e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "showVoteInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "showVoteInfoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        SnsMethodCalculate.markEndTimeMs("showVoteInfoView", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        if (view == this.f281699j) {
            this.f281705s.f280363S.onClick(view);
        } else if (view == this.f281700n) {
            this.f281705s.f280364T.onClick(view);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardVoteCtrl");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdCardVoteCtrl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
