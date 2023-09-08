package com.tencent.p014mm.plugin.sns.p106ui.item;

import ad0.C91999u;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C60200t1;
import java.util.List;
import pl1.C11978e0;
import te3.C101789j00;
import te3.C64350ew2;
import te3.C64378fw2;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.i */
public class C57414i extends BaseTimeLineItem {

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.i$a */
    public static class C57415a extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public boolean f164453F0 = false;

        /* renamed from: G0 */
        public View f164454G0;

        /* renamed from: H0 */
        public Guideline f164455H0;

        /* renamed from: I0 */
        public ImageView f164456I0;

        /* renamed from: J0 */
        public ImageIndicatorView f164457J0;

        /* renamed from: K0 */
        public ImageView f164458K0;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        C57415a aVar = (C57415a) baseViewHolder;
        if (BaseTimeLineItem.m122773q(aVar) == null || BaseTimeLineItem.m122773q(aVar).getParent() == null) {
            aVar.f164454G0 = aVar.f279960i.findViewById(C0966R.C0970id.jtc);
            aVar.f164453F0 = true;
        } else {
            BaseTimeLineItem.m122773q(aVar).setLayoutResource(C0966R.C0971layout.f360003c32);
            if (!aVar.f164453F0) {
                aVar.f164454G0 = BaseTimeLineItem.m122773q(aVar).inflate();
                aVar.f164453F0 = true;
            }
        }
        aVar.f164456I0 = (ImageView) aVar.f164454G0.findViewById(C0966R.C0970id.jtf);
        aVar.f164457J0 = (ImageIndicatorView) aVar.f164454G0.findViewById(C0966R.C0970id.jtd);
        aVar.f164458K0 = (ImageView) aVar.f164454G0.findViewById(C0966R.C0970id.jtg);
        aVar.f164455H0 = (Guideline) aVar.f164454G0.findViewById(C0966R.C0970id.jte);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        C101789j00 j002;
        C64378fw2 fw22;
        C64350ew2 ew22;
        C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        if (!(timeLineObject == null || (j002 = timeLineObject.ContentObj) == null || (fw22 = j002.f298436t) == null)) {
            C57415a aVar2 = (C57415a) baseViewHolder;
            if (!Util.isNullOrNil((List) fw22.f183247j) && (ew22 = fw22.f183247j.get(0)) != null) {
                aVar2.f164456I0.setVisibility(0);
                aVar2.f164457J0.setVisibility(8);
                aVar2.f164455H0.setGuidelineEnd(0);
                Pair<Integer, Integer> k = C91999u.m115565k((int) ew22.f183041f, (int) ew22.f183042g, aVar2.f164454G0.getContext(), false);
                int intValue = ((Integer) k.first).intValue();
                int intValue2 = ((Integer) k.second).intValue();
                aVar2.f164454G0.getLayoutParams().width = intValue;
                aVar2.f164454G0.getLayoutParams().height = intValue2;
                aVar2.f164454G0.requestLayout();
                if (!TextUtils.isEmpty(ew22.f183043h)) {
                    ((C60200t1) C86312j.m106911c(cls)).mo76741Cm(ew22.f183043h, aVar2.f164458K0, aVar);
                } else {
                    ((C60200t1) C86312j.m106911c(cls)).mo76741Cm(ew22.f183040e, aVar2.f164458K0, aVar);
                }
                aVar2.f164454G0.setTag(timeLineObject);
                aVar2.f164454G0.setOnClickListener(snsTimeLineBaseAdapter.f278576j.f280587e);
                C78253a k2 = snsTimeLineBaseAdapter.mo132921k();
                View view = aVar2.f164454G0;
                TimelineClickListener timelineClickListener = snsTimeLineBaseAdapter.f278572f;
                k2.mo108275j(view, timelineClickListener.f280350F, timelineClickListener.f280381k);
            }
        }
        mo133391g(w6Var, 1);
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.MegaVideoTimeLineItem");
        return "MegaVideoTimeLineItem";
    }
}
