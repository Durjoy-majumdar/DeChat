package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.view.View;
import android.view.ViewStub;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncTextView;
import com.tencent.p014mm.plugin.sns.p106ui.C95713a5;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.PhotosContent;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import eb0.C75592q0;
import java.util.ArrayList;
import te3.C101808lv2;
import te3.h84;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.g */
public class C95924g extends BaseTimeLineItem {
    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        baseViewHolder.f279927J.setImageResource(C0966R.C0969drawable.add);
        AsyncTextView asyncTextView = baseViewHolder.f279964k;
        asyncTextView.setTextColor(asyncTextView.getContext().getResources().getColor(C0966R.color.a_3));
        if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c37);
            if (!baseViewHolder.f279976q) {
                baseViewHolder.f279936S = (PhotosContent) BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                baseViewHolder.f279976q = true;
            }
        } else {
            baseViewHolder.f279936S = (PhotosContent) baseViewHolder.f279960i.findViewById(C0966R.C0970id.ets);
            baseViewHolder.f279976q = true;
        }
        Log.m105924i("MiroMsg.HBRewardTimeLineItem", "viewtype " + this.f279905f);
        TagImageView tagImageView = (TagImageView) baseViewHolder.f279936S.findViewById(C95713a5.f279140f[0]);
        baseViewHolder.f279936S.mo132425a(tagImageView);
        tagImageView.setOnClickListener(this.f279906g.f278572f.f280385o);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        String str;
        String str2;
        h84 h84;
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        String str3 = w6Var2.f281381h;
        View view = baseViewHolder2.f279975p0;
        if (view != null) {
            if (!w6Var2.f281342B || (h84 = baseViewHolder2.snsobj.SnsRedEnvelops) == null || h84.f134504d <= 0) {
                view.setBackgroundResource(C0966R.C0969drawable.c3_);
            } else {
                view.setBackgroundResource(C0966R.C0969drawable.c3a);
            }
        }
        TagImageView b = baseViewHolder2.f279936S.mo132426b(0);
        new ArrayList().add(b);
        C96235u4 u4Var = new C96235u4();
        u4Var.f281206a = str3;
        u4Var.f281207b = 0;
        u4Var.f281210e = this.f279907h;
        if (b != null) {
            b.setTag(u4Var);
        }
        C101808lv2 lv22 = w6Var2.f281368a0;
        baseViewHolder2.f279957g0 = lv22;
        if (lv22 == null) {
            str2 = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            str = "fillItem";
            Log.m105920e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo is null " + w6Var2.f281381h);
        } else if (C75592q0.m90789s().equals(timeLineObject2.UserName)) {
            baseViewHolder2.f279936S.setVisibility(0);
            C95713a5 a5Var = snsTimeLineBaseAdapter2.f278577k;
            PhotosContent photosContent = baseViewHolder2.f279936S;
            String str4 = w6Var2.f281381h;
            int hashCode = this.f279904e.hashCode();
            boolean z = w6Var2.f281391r;
            boolean z2 = this.f279907h;
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = timeLineObject2.CreateTime;
            str2 = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            a5Var.mo133157b(photosContent, timeLineObject, str4, (View.OnClickListener) null, (View.OnLongClickListener) null, hashCode, i2, i, z, z2, c, true);
            str = "fillItem";
        } else {
            str2 = "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem";
            if (w6Var2.f281345E) {
                baseViewHolder2.f279936S.setVisibility(0);
                C95713a5 a5Var2 = snsTimeLineBaseAdapter2.f278577k;
                PhotosContent photosContent2 = baseViewHolder2.f279936S;
                String str5 = w6Var2.f281381h;
                int hashCode2 = this.f279904e.hashCode();
                boolean z3 = w6Var2.f281391r;
                boolean z4 = this.f279907h;
                C96983o3 c2 = C96983o3.m124651c();
                c2.f284145b = timeLineObject2.CreateTime;
                str = "fillItem";
                a5Var2.mo133157b(photosContent2, timeLineObject, str5, (View.OnClickListener) null, (View.OnLongClickListener) null, hashCode2, i2, i, z3, z4, c2, false);
            } else {
                str = "fillItem";
                if (lv22.f298730D == 0) {
                    baseViewHolder2.f279936S.setVisibility(0);
                    C95713a5 a5Var3 = snsTimeLineBaseAdapter2.f278577k;
                    PhotosContent photosContent3 = baseViewHolder2.f279936S;
                    String str6 = w6Var2.f281381h;
                    int hashCode3 = this.f279904e.hashCode();
                    boolean z5 = w6Var2.f281391r;
                    boolean z6 = this.f279907h;
                    C96983o3 c3 = C96983o3.m124651c();
                    c3.f284145b = timeLineObject2.CreateTime;
                    a5Var3.mo133157b(photosContent3, timeLineObject, str6, (View.OnClickListener) null, (View.OnLongClickListener) null, hashCode3, i2, i, z5, z6, c3, true);
                } else {
                    Log.m105920e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo.hbStatus is " + lv22.f298730D);
                }
            }
        }
        mo133391g(w6Var2, 1);
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.HBRewardTimeLineItem");
        return "HBRewardTimeLineItem";
    }
}
