package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60200t1;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C101804kv2;
import te3.C101817mv2;
import te3.C64623p81;
import te3.C64730tk1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0002\u001a0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002\u001a0\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo182094d2 = {"Landroid/view/ViewGroup;", "Lcom/tencent/mm/plugin/sns/ui/TagImageView;", "leftIv", "Landroid/widget/ImageView;", "stateIv", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "layout", "Lrx3/l;", "", "layoutFinderTopic", "layoutFinderLive", "TAG", "Ljava/lang/String;", "plugin-sns_release"}, mo182095k = 2, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt */
public final class ImproveOtherTimelineItemHandleKt {
    private static final String TAG = "MicroMsg.Improve.ImproveOtherTimelineItemHandle";

    public static final /* synthetic */ C13604l access$layoutFinderLive(SnsInfo snsInfo, TimeLineObject timeLineObject, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("access$layoutFinderLive", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        C13604l<String, String> layoutFinderLive = layoutFinderLive(snsInfo, timeLineObject, viewGroup);
        SnsMethodCalculate.markEndTimeMs("access$layoutFinderLive", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return layoutFinderLive;
    }

    public static final /* synthetic */ C13604l access$layoutFinderTopic(SnsInfo snsInfo, TimeLineObject timeLineObject, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("access$layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        C13604l<String, String> layoutFinderTopic = layoutFinderTopic(snsInfo, timeLineObject, viewGroup);
        SnsMethodCalculate.markEndTimeMs("access$layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return layoutFinderTopic;
    }

    public static final /* synthetic */ TagImageView access$leftIv(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("access$leftIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        TagImageView leftIv = leftIv(viewGroup);
        SnsMethodCalculate.markEndTimeMs("access$leftIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return leftIv;
    }

    public static final /* synthetic */ ImageView access$stateIv(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("access$stateIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        ImageView stateIv = stateIv(viewGroup);
        SnsMethodCalculate.markEndTimeMs("access$stateIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return stateIv;
    }

    private static final C13604l<String, String> layoutFinderLive(SnsInfo snsInfo, TimeLineObject timeLineObject, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("layoutFinderLive", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        Context context = viewGroup.getContext();
        String str = "";
        if (timeLineObject.ContentObj.f298435s != null) {
            boolean z = false;
            if (((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF() || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_no_support_share_switch, 0) == 0) {
                if (Util.isNullOrNil(timeLineObject.ContentObj.f298435s.f184781g) && !Util.isNullOrNil(timeLineObject.ContentObj.f298435s.f184782h)) {
                    str = timeLineObject.ContentObj.f298435s.f184782h;
                } else if (!Util.isNullOrNil(timeLineObject.ContentObj.f298435s.f184782h)) {
                    str = timeLineObject.ContentObj.f298435s.f184781g + ": " + timeLineObject.ContentObj.f298435s.f184782h;
                } else {
                    str = context.getString(C0966R.string.jha, new Object[]{timeLineObject.ContentObj.f298435s.f184781g});
                }
            }
            TagImageView leftIv = leftIv(viewGroup);
            if (leftIv != null) {
                leftIv.setVisibility(0);
            }
            String str2 = timeLineObject.ContentObj.f298435s.f184783i;
            C87412m.m108591d(str2);
            if (str2.length() == 0) {
                z = true;
            }
            if (!z) {
                C101804kv2 kv22 = new C101804kv2();
                String str3 = timeLineObject.ContentObj.f298435s.f184783i;
                kv22.f298692g = str3;
                kv22.f298694i = str3;
                kv22.f298690e = 2;
                kv22.f298695j = 1;
                C101817mv2 mv22 = new C101817mv2();
                kv22.f298698p = mv22;
                kv22.f298693h = 1;
                C64623p81 p812 = timeLineObject.ContentObj.f298435s;
                mv22.f298875d = p812.f184784j;
                mv22.f298876e = p812.f184785n;
                kv22.f298689d = snsInfo.getSnsId();
                C94901o Fx0 = C94866e1.Fx0();
                String snsId = snsInfo.getSnsId();
                TagImageView leftIv2 = leftIv(viewGroup);
                int hashCode = viewGroup.getContext().hashCode();
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = timeLineObject.CreateTime;
                Fx0.mo131101U(snsId, kv22, leftIv2, hashCode, c);
            }
        }
        C13604l<String, String> lVar = new C13604l<>(str, null);
        SnsMethodCalculate.markEndTimeMs("layoutFinderLive", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return lVar;
    }

    private static final C13604l<String, String> layoutFinderTopic(SnsInfo snsInfo, TimeLineObject timeLineObject, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        Context context = viewGroup.getContext();
        if (timeLineObject.ContentObj.f298432p != null) {
            String string = context.getString(C0966R.string.f8013z9);
            C64730tk1 tk12 = timeLineObject.ContentObj.f298432p;
            if (tk12 != null) {
                if (tk12.f185604e == 1) {
                    string = MMApplicationContext.getContext().getString(C0966R.string.jhb, new Object[]{timeLineObject.ContentObj.f298432p.f185603d});
                } else {
                    string = tk12.f185603d;
                }
            }
            TagImageView leftIv = leftIv(viewGroup);
            if (leftIv != null) {
                leftIv.setVisibility(0);
            }
            if (!Util.isNullOrNil(timeLineObject.ContentObj.f298432p.f185605f)) {
                C101804kv2 kv22 = new C101804kv2();
                String str = timeLineObject.ContentObj.f298432p.f185605f;
                kv22.f298692g = str;
                kv22.f298694i = str;
                kv22.f298690e = 2;
                kv22.f298695j = 1;
                C101817mv2 mv22 = new C101817mv2();
                kv22.f298698p = mv22;
                kv22.f298693h = 1;
                mv22.f298875d = 0.0f;
                mv22.f298876e = 0.0f;
                kv22.f298689d = snsInfo.getSnsId();
                C94901o Fx0 = C94866e1.Fx0();
                String snsId = snsInfo.getSnsId();
                TagImageView leftIv2 = leftIv(viewGroup);
                int hashCode = viewGroup.getContext().hashCode();
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = timeLineObject.CreateTime;
                Fx0.mo131101U(snsId, kv22, leftIv2, hashCode, c);
            }
            C13604l<String, String> lVar = new C13604l<>(string, timeLineObject.ContentObj.f298432p.f185606g);
            SnsMethodCalculate.markEndTimeMs("layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
            return lVar;
        }
        C13604l<String, String> lVar2 = new C13604l<>("", "");
        SnsMethodCalculate.markEndTimeMs("layoutFinderTopic", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return lVar2;
    }

    private static final TagImageView leftIv(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("leftIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        TagImageView tagImageView = (TagImageView) viewGroup.getTag(C0966R.C0970id.f4p);
        SnsMethodCalculate.markEndTimeMs("leftIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return tagImageView;
    }

    private static final ImageView stateIv(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("stateIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        ImageView imageView = (ImageView) viewGroup.getTag(C0966R.C0970id.k0s);
        SnsMethodCalculate.markEndTimeMs("stateIv", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandleKt");
        return imageView;
    }
}
