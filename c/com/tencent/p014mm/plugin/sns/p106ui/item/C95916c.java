package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.storage.C96983o3;
import java.util.ArrayList;
import te3.C101804kv2;
import uo3.C78253a;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.c */
public class C95916c extends BaseTimeLineItem {
    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        int Hx0 = C94866e1.Hx0();
        if (BaseTimeLineItem.m122773q(baseViewHolder) == null) {
            baseViewHolder.f279949c0 = baseViewHolder.f279960i.findViewById(C0966R.C0970id.brl);
            baseViewHolder.f279947b0 = true;
        } else if (!baseViewHolder.f279947b0) {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c3h);
            baseViewHolder.f279949c0 = BaseTimeLineItem.m122773q(baseViewHolder).inflate();
            baseViewHolder.f279947b0 = true;
        }
        baseViewHolder.f279982t = (TagImageView) baseViewHolder.f279949c0.findViewById(C0966R.C0970id.bs_);
        baseViewHolder.f279984u = (ImageView) baseViewHolder.f279949c0.findViewById(C0966R.C0970id.k0s);
        baseViewHolder.f279988w = (TextView) baseViewHolder.f279949c0.findViewById(C0966R.C0970id.brt);
        View view = baseViewHolder.f279949c0;
        SnsMethodCalculate.markStartTimeMs("setContentSize", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = Hx0;
        layoutParams.width = Hx0;
        view.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setContentSize", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        C102236a0.m134779x0(baseViewHolder.f279982t, this.f279904e);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        int i3 = i;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        baseViewHolder2.f279982t.setPosition(i3);
        String str = w6Var2.f281381h;
        int size = timeLineObject2.ContentObj.f298427h.size();
        if (size > 0) {
            C101804kv2 kv22 = timeLineObject2.ContentObj.f298427h.get(0);
            int i4 = timeLineObject2.ContentObj.f298424e;
            if (i4 == 1) {
                baseViewHolder2.f279982t.setOnClickListener(snsTimeLineBaseAdapter2.f278572f.f280385o);
                C96235u4 u4Var = new C96235u4();
                u4Var.f281206a = str;
                u4Var.f281207b = 0;
                new ArrayList().add(baseViewHolder2.f279982t);
                u4Var.f281210e = this.f279907h;
                u4Var.f281208c = i3;
                baseViewHolder2.f279982t.setTag(u4Var);
                baseViewHolder2.f279982t.setVisibility(0);
                C94901o Fx0 = C94866e1.Fx0();
                String snsId = w6Var2.f281367a.getSnsId();
                TagImageView tagImageView = baseViewHolder2.f279982t;
                int hashCode = this.f279904e.hashCode();
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = timeLineObject2.CreateTime;
                Fx0.mo131101U(snsId, kv22, tagImageView, hashCode, c);
                baseViewHolder2.f279984u.setVisibility(8);
                baseViewHolder2.f279988w.setText(this.f279904e.getString(C0966R.string.jfw, new Object[]{Integer.valueOf(size)}));
                baseViewHolder2.f279988w.setVisibility(0);
            } else if (i4 == 15) {
                baseViewHolder2.f279982t.setTag(new C95787g0(timeLineObject2, str));
                baseViewHolder2.f279982t.setOnClickListener(snsTimeLineBaseAdapter2.f278572f.f280354J);
                baseViewHolder2.f279984u.setImageResource(C0966R.raw.sns_collapse_video_play);
                baseViewHolder2.f279984u.setVisibility(0);
                baseViewHolder2.f279988w.setVisibility(8);
                C94901o Fx02 = C94866e1.Fx0();
                TagImageView tagImageView2 = baseViewHolder2.f279982t;
                int hashCode2 = this.f279904e.hashCode();
                C96983o3 c2 = C96983o3.m124651c();
                c2.f284145b = timeLineObject2.CreateTime;
                Fx02.mo131105Y(kv22, tagImageView2, hashCode2, c2);
            }
        }
        C78253a k = snsTimeLineBaseAdapter.mo132921k();
        TagImageView tagImageView3 = baseViewHolder2.f279982t;
        TimelineClickListener timelineClickListener = snsTimeLineBaseAdapter2.f278572f;
        k.mo108275j(tagImageView3, timelineClickListener.f280346B, timelineClickListener.f280381k);
        mo133391g(w6Var2, 1);
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.CollapseTimelineItem");
        return "CollapseTimelineItem";
    }
}
