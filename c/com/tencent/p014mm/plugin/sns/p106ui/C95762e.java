package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import vr2.C102244f;

/* renamed from: com.tencent.mm.plugin.sns.ui.e */
public class C95762e extends BaseAdapter {

    /* renamed from: d */
    public final Context f279360d;

    /* renamed from: e */
    public C102244f f279361e;

    /* renamed from: f */
    public String f279362f = null;

    /* renamed from: g */
    public int f279363g = 0;

    public C95762e(Context context, C102244f fVar) {
        this.f279360d = context;
        this.f279361e = fVar;
        this.f279362f = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        if (this.f279363g == 1) {
            int size = this.f279361e.f301107a.f280527k.adUnlikeInfo.mo131416a().size();
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
            return size;
        }
        int i = 0;
        ADXml.C95016e eVar = this.f279361e.f301107a.f280526j.adFeedbackInfo;
        if (eVar != null) {
            i = ((LinkedList) eVar.f275680a).size();
        }
        int i2 = i + 1;
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return i2;
    }

    public Object getItem(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        ADInfo.C95010c.C95011a aVar = this.f279361e.f301107a.f280527k.adUnlikeInfo.mo131416a().get(i);
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return aVar;
    }

    public long getItemId(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        long j = (long) i;
        SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return j;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        View inflate = view == null ? View.inflate(this.f279360d, C0966R.C0971layout.f6357cl, (ViewGroup) null) : view;
        inflate.setTag(this.f279361e);
        if (this.f279363g == 1) {
            ADInfo.C95010c.C95011a aVar = (ADInfo.C95010c.C95011a) getItem(i);
            str = "zh_CN".equals(this.f279362f) ? aVar.f275655a : ("zh_TW".equals(this.f279362f) || "zh_HK".equals(this.f279362f)) ? aVar.f275656b : aVar.f275657c;
            if (Util.isNullOrNil(str)) {
                str = aVar.f275657c;
            }
        } else {
            if (i2 == 0) {
                C102244f fVar = this.f279361e;
                if (fVar != null) {
                    C96071m8 m8Var = fVar.f301107a;
                    if (m8Var.f280526j != null) {
                        ADInfo aDInfo = m8Var.f280527k;
                        String str2 = "zh_CN".equals(this.f279362f) ? aDInfo.adDislikeInfoTitle_cn : ("zh_TW".equals(this.f279362f) || "zh_HK".equals(this.f279362f)) ? aDInfo.adDislikeInfoTitle_tw : aDInfo.adDislikeInfoTitle_en;
                        if (Util.isNullOrNil(str2)) {
                            str2 = this.f279360d.getString(C0966R.string.jad);
                        }
                        str = str2;
                    }
                }
            } else {
                ADXml.C95016e eVar = this.f279361e.f301107a.f280526j.adFeedbackInfo;
                if (eVar != null && i2 <= ((LinkedList) eVar.f275680a).size()) {
                    ADXml.C95017f fVar2 = (ADXml.C95017f) ((LinkedList) eVar.f275680a).get(i2 - 1);
                    str = "zh_CN".equals(this.f279362f) ? fVar2.f275681a : ("zh_TW".equals(this.f279362f) || "zh_HK".equals(this.f279362f)) ? fVar2.f275683c : fVar2.f275682b;
                    if (Util.isNullOrNil(str)) {
                        str = fVar2.f275682b;
                    }
                }
            }
            str = "";
        }
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f5571io);
        if (this.f279361e.f301107a.f280527k.forbidClick) {
            textView.setTextColor(this.f279360d.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        } else {
            textView.setTextColor(this.f279360d.getResources().getColor(C0966R.color.f2958ae));
        }
        textView.setText(str);
        View findViewById = inflate.findViewById(C0966R.C0970id.f5570in);
        int i3 = i2 == getCount() - 1 ? 8 : 0;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i3));
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/AdUnLikeReasonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/AdUnLikeReasonAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
        return inflate;
    }
}
