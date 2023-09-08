package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
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
import uo3.C78253a;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.k */
public class C95927k extends BaseTimeLineItem {
    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
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
        textView.setTextColor(this.f279904e.getResources().getColor(C0966R.color.ad8));
        baseViewHolder.f279988w.setMaxLines(1);
        C102236a0.m134779x0(baseViewHolder.f279982t, this.f279904e);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
        String str = w6Var2.f281381h;
        if (!timeLineObject2.ContentObj.f298427h.isEmpty()) {
            baseViewHolder2.f279982t.setPosition(i);
            View view = baseViewHolder2.f279980s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/MusicTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/MusicTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C101804kv2 kv22 = timeLineObject2.ContentObj.f298427h.get(0);
            C94901o Fx0 = C94866e1.Fx0();
            TagImageView tagImageView = baseViewHolder2.f279982t;
            int hashCode = this.f279904e.hashCode();
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = timeLineObject2.CreateTime;
            Fx0.mo131104X(kv22, tagImageView, C0966R.raw.app_attach_file_icon_music, hashCode, c);
            baseViewHolder2.f279984u.setPressed(false);
            if (snsTimeLineBaseAdapter2.mo132924s(timeLineObject2.f283893Id)) {
                baseViewHolder2.f279984u.setImageResource(C0966R.C0969drawable.ajq);
            } else {
                baseViewHolder2.f279984u.setImageResource(C0966R.C0969drawable.ajs);
            }
            baseViewHolder2.f279982t.setTag(new C95787g0(timeLineObject2, str));
            baseViewHolder2.f279982t.setOnClickListener(snsTimeLineBaseAdapter2.f278576j.f280599q);
            baseViewHolder2.f279980s.setTag(new C95787g0(timeLineObject2, str, w6Var2.f281367a.getTypeFlag()));
            C78253a k = snsTimeLineBaseAdapter.mo132921k();
            View view3 = baseViewHolder2.f279980s;
            TimelineClickListener timelineClickListener = snsTimeLineBaseAdapter2.f278572f;
            k.mo108275j(view3, timelineClickListener.f280396z, timelineClickListener.f280381k);
            baseViewHolder2.f279980s.setOnClickListener(C96085n8.f280580B);
            String str2 = kv22.f298691f;
            if (!Util.isNullOrNil(str2)) {
                baseViewHolder2.f279986v.setVisibility(0);
                baseViewHolder2.f279986v.setText(str2);
            } else {
                baseViewHolder2.f279986v.setVisibility(4);
            }
            String str3 = kv22.f298697o;
            if (!Util.isNullOrNil(str3)) {
                baseViewHolder2.f279988w.setVisibility(0);
                baseViewHolder2.f279988w.setText(new SpannableString(str3), TextView.BufferType.SPANNABLE);
            } else {
                baseViewHolder2.f279988w.setVisibility(8);
            }
            baseViewHolder2.f279944a = this.f279904e.getString(C0966R.string.jea) + kv22.f298697o + "," + kv22.f298691f;
        } else {
            View view4 = baseViewHolder2.f279980s;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/MusicTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/MusicTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo133391g(w6Var2, 2);
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.MusicTimeLineItem");
        return "MusicTimeLineItem";
    }
}
