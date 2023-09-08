package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C101804kv2;
import te3.C101817mv2;
import te3.C64730tk1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveFinderMusicTopicHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "Landroid/view/ViewGroup;", "layout", "Lrx3/l;", "", "handle", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMusicTopicHandle */
public final class ImproveFinderMusicTopicHandle extends ImproveOtherTimelineItemHandle {
    public static final ImproveFinderMusicTopicHandle INSTANCE = new ImproveFinderMusicTopicHandle();

    private ImproveFinderMusicTopicHandle() {
    }

    public int getContentStyle() {
        SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMusicTopicHandle");
        SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMusicTopicHandle");
        return 46;
    }

    public C13604l<String, String> handle(SnsInfo snsInfo, TimeLineObject timeLineObject, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMusicTopicHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        C87412m.m108594g(timeLineObject, "tlObj");
        C87412m.m108594g(viewGroup, "layout");
        C13604l<String, String> handle = super.handle(snsInfo, timeLineObject, viewGroup);
        if (timeLineObject.ContentObj.f298442z != null) {
            TagImageView access$leftIv = ImproveOtherTimelineItemHandleKt.access$leftIv(viewGroup);
            if (access$leftIv != null) {
                access$leftIv.setVisibility(0);
            }
            if (!Util.isNullOrNil(timeLineObject.ContentObj.f298442z.f185605f)) {
                C101804kv2 kv22 = new C101804kv2();
                String str = timeLineObject.ContentObj.f298442z.f185605f;
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
                TagImageView access$leftIv2 = ImproveOtherTimelineItemHandleKt.access$leftIv(viewGroup);
                if (access$leftIv2 != null) {
                    access$leftIv2.setScaleType(QImageView.C97274a.CENTER_CROP);
                }
                String str2 = timeLineObject.ContentObj.f298442z.f185605f;
                TagImageView access$leftIv3 = ImproveOtherTimelineItemHandleKt.access$leftIv(viewGroup);
                C87412m.m108591d(access$leftIv3);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76882tg(str2, access$leftIv3);
            } else {
                C94866e1.Fx0().mo131095O(ImproveOtherTimelineItemHandleKt.access$leftIv(viewGroup), -1, C0966R.C0969drawable.b9g, hashCode());
            }
            C64730tk1 tk12 = timeLineObject.ContentObj.f298442z;
            C13604l<String, String> lVar = new C13604l<>(tk12.f185603d, tk12.f185606g);
            SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMusicTopicHandle");
            return lVar;
        }
        SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderMusicTopicHandle");
        return handle;
    }
}
