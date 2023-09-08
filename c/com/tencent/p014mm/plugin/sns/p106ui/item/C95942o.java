package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.view.ViewStub;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.o */
public class C95942o extends BaseTimeLineItem {

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.o$a */
    public static class C95943a extends BaseTimeLineItem.BaseViewHolder {
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.TextTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.TextTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.TextTimeLineItem");
        mo133391g(w6Var, 1);
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.TextTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.TextTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.TextTimeLineItem");
        return "TextTimeLineItem";
    }
}
