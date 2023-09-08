package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.C96277w8;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lu2.C10655l;
import lu2.k$$a;
import p629ny.C76979h;
import te3.k94;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.s */
public class C95959s extends BaseTimeLineItem {

    /* renamed from: q */
    public String f280196q = "";

    /* renamed from: r */
    public boolean f280197r = false;

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.s$a */
    public static class C43123a extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public boolean f116689F0 = false;

        /* renamed from: G0 */
        public LinearLayout f116690G0 = null;

        /* renamed from: H0 */
        public TextView f116691H0 = null;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        C43123a aVar = (C43123a) baseViewHolder;
        if (BaseTimeLineItem.m122773q(baseViewHolder) == null || BaseTimeLineItem.m122773q(baseViewHolder).getParent() == null) {
            aVar.f116690G0 = (LinearLayout) baseViewHolder.f279960i.findViewById(C0966R.C0970id.jxe);
            aVar.f116689F0 = true;
        } else {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c56);
            if (!aVar.f116689F0) {
                aVar.f116690G0 = (LinearLayout) BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                aVar.f116689F0 = true;
            }
        }
        aVar.f116691H0 = (TextView) aVar.f116690G0.findViewById(C0966R.C0970id.jxk);
        TextView textView = (TextView) aVar.f116690G0.findViewById(C0966R.C0970id.jxg);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        int i3;
        k94 k94;
        C96275w6 w6Var2 = w6Var;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        C43123a aVar = (C43123a) baseViewHolder;
        if (w6Var2.f281372c0 == null || (k94 = w6Var2.f281374d0) == null || Util.isNullOrNil((List) k94.f183902d)) {
            i3 = 1;
        } else {
            String str = "";
            if (w6Var2.f281374d0.f183902d.size() == 1) {
                if (Util.isNullOrNil(w6Var2.f281374d0.f183903e)) {
                    SnsInfo SE = C94866e1.Yx0().mo139806SE(w6Var2.f281374d0.f183902d.get(0).longValue());
                    if (SE != null) {
                        str = C10655l.f32071a.mo10923a(SE.getTimeLine().ContentObj.f298424e, w6Var2.f281374d0.f183902d.size());
                    }
                } else {
                    str = w6Var2.f281374d0.f183903e;
                }
            } else if (w6Var2.f281374d0.f183902d.size() > 1) {
                if (Util.isNullOrNil(w6Var2.f281374d0.f183903e)) {
                    SnsInfo SE2 = C94866e1.Yx0().mo139806SE(w6Var2.f281374d0.f183902d.get(0).longValue());
                    if (SE2 != null) {
                        str = C10655l.f32071a.mo10923a(SE2.getTimeLine().ContentObj.f298424e, w6Var2.f281374d0.f183902d.size());
                    }
                } else {
                    str = w6Var2.f281374d0.f183903e;
                    this.f280196q = MMApplicationContext.getContext().getResources().getString(C0966R.string.f8195u0, new Object[]{Integer.valueOf(w6Var2.f281374d0.f183902d.size())});
                    this.f280197r = true;
                }
            }
            if (!this.f280197r) {
                aVar.f116691H0.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(aVar.f116691H0.getContext(), str, aVar.f116691H0.getTextSize()));
            }
            if (this.f280197r) {
                aVar.f116691H0.post(new k$$a(this, aVar, str));
            }
            aVar.f279968m.setVisibility(8);
            aVar.f279927J.setVisibility(8);
            aVar.f279923F.setVisibility(8);
            aVar.f279925H.setVisibility(8);
            View view = aVar.f279926I;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/WsFoldTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/WsFoldTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C96277w8 w8Var = new C96277w8();
            w8Var.f281402a = timeLineObject.UserName;
            w8Var.f281404c = w6Var2.f281374d0.f183902d.get(0).longValue();
            LinkedList<Long> linkedList = w6Var2.f281374d0.f183902d;
            w8Var.f281405d = linkedList.get(linkedList.size() - 1).longValue();
            w8Var.f281403b = w6Var2.f281372c0.field_groupId;
            ((ArrayList) w8Var.f281406e).addAll(w6Var2.f281374d0.f183902d);
            aVar.f116690G0.setTag(w8Var);
            aVar.f116690G0.setOnClickListener(snsTimeLineBaseAdapter.f278576j.f280590h);
            w6Var2.f281363W = null;
            w6Var2.f281364X = null;
            w6Var2.f281348H = false;
            w6Var2.f281346F = null;
            w6Var2.f281355O = false;
            i3 = 1;
            SnsReportHelper.f275506m0.mo131369b0(w6Var2.f281383j, true, i);
        }
        mo133391g(w6Var2, i3);
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.WsFoldTimeLineItem");
        return "WsFoldTimeLineItem";
    }
}
