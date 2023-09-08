package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.C96167q1;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import te3.C101804kv2;
import te3.C101817mv2;
import te3.C49399fa;
import uo3.C78253a;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.h */
public class C95925h extends BaseTimeLineItem {

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.h$a */
    public static class C95926a extends BaseTimeLineItem.BaseViewHolder {
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c3m);
            ViewStub viewStub2 = (ViewStub) baseViewHolder.f279960i.findViewById(C0966R.C0970id.f5g);
            if (!baseViewHolder.f279947b0 && viewStub2 != null) {
                baseViewHolder.f279949c0 = viewStub2.inflate();
                baseViewHolder.f279947b0 = true;
            }
        } else {
            baseViewHolder.f279949c0 = baseViewHolder.f279960i.findViewById(C0966R.C0970id.f358729gq2);
            baseViewHolder.f279947b0 = true;
        }
        View view = baseViewHolder.f279949c0;
        baseViewHolder.f279980s = view;
        view.findViewById(C0966R.C0970id.k0s).setOnTouchListener(this.f279906g.f278562N);
        baseViewHolder.f279982t = (TagImageView) baseViewHolder.f279980s.findViewById(C0966R.C0970id.f4p);
        baseViewHolder.f279984u = (ImageView) baseViewHolder.f279980s.findViewById(C0966R.C0970id.k0s);
        baseViewHolder.f279986v = (TextView) baseViewHolder.f279980s.findViewById(C0966R.C0970id.iub);
        TextView textView = (TextView) baseViewHolder.f279980s.findViewById(C0966R.C0970id.kpq);
        baseViewHolder.f279988w = textView;
        textView.setMaxLines(2);
        C102236a0.m134779x0(baseViewHolder.f279982t, this.f279904e);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        if (timeLineObject2.ContentObj.f298433q != null) {
            baseViewHolder2.f279982t.setPosition(i);
            View view = baseViewHolder2.f279980s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101804kv2 kv22 = new C101804kv2();
            String str = timeLineObject2.ContentObj.f298433q.f133370h;
            kv22.f298692g = str;
            kv22.f298694i = str;
            kv22.f298690e = 2;
            kv22.f298695j = 1;
            C101817mv2 mv22 = new C101817mv2();
            kv22.f298698p = mv22;
            kv22.f298693h = 1;
            C49399fa faVar = timeLineObject2.ContentObj.f298433q;
            mv22.f298875d = (float) faVar.f133372j;
            mv22.f298876e = (float) faVar.f133373n;
            kv22.f298689d = timeLineObject2.f283893Id;
            C94901o Fx0 = C94866e1.Fx0();
            String snsId = w6Var2.f281367a.getSnsId();
            TagImageView tagImageView = baseViewHolder2.f279982t;
            int hashCode = this.f279904e.hashCode();
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = timeLineObject2.CreateTime;
            Fx0.mo131101U(snsId, kv22, tagImageView, hashCode, c);
            baseViewHolder2.f279984u.setPressed(false);
            ImageView imageView = baseViewHolder2.f279984u;
            imageView.setImageDrawable(C74933u4.m89768e(imageView.getContext(), C0966R.raw.icons_outlined_video_call, -1));
            baseViewHolder2.f279980s.setTag(new C96167q1(timeLineObject2, baseViewHolder2.f279982t, w6Var2.f281381h));
            baseViewHolder2.f279986v.setVisibility(8);
            C78253a k = snsTimeLineBaseAdapter.mo132921k();
            View view3 = baseViewHolder2.f279980s;
            TimelineClickListener timelineClickListener = snsTimeLineBaseAdapter2.f278572f;
            k.mo108275j(view3, timelineClickListener.f280349E, timelineClickListener.f280381k);
            baseViewHolder2.f279980s.setOnClickListener(snsTimeLineBaseAdapter2.f278576j.f280586d);
            String str2 = timeLineObject2.ContentObj.f298433q.f133369g;
            if (!Util.isNullOrNil(str2)) {
                baseViewHolder2.f279988w.setVisibility(0);
                baseViewHolder2.f279988w.setText(new SpannableString(str2), TextView.BufferType.SPANNABLE);
            } else {
                baseViewHolder2.f279988w.setVisibility(8);
            }
        } else {
            View view4 = baseViewHolder2.f279980s;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/MPVideoTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo133391g(w6Var2, 1);
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.MPVideoTimeLineItem");
        return "MPVideoTimeLineItem";
    }
}
