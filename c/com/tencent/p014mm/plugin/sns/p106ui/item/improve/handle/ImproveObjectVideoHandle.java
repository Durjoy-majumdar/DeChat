package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.storage.C96983o3;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C101804kv2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveObjectVideoHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "Landroid/view/ViewGroup;", "layout", "Lrx3/l;", "", "handle", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectVideoHandle */
public final class ImproveObjectVideoHandle extends ImproveOtherTimelineItemHandle {
    public static final ImproveObjectVideoHandle INSTANCE = new ImproveObjectVideoHandle();

    private ImproveObjectVideoHandle() {
    }

    public int getContentStyle() {
        SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectVideoHandle");
        SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectVideoHandle");
        return 5;
    }

    public C13604l<String, String> handle(SnsInfo snsInfo, TimeLineObject timeLineObject, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectVideoHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        C87412m.m108594g(timeLineObject, "tlObj");
        C87412m.m108594g(viewGroup, "layout");
        C13604l<String, String> handle = super.handle(snsInfo, timeLineObject, viewGroup);
        if (!timeLineObject.ContentObj.f298427h.isEmpty()) {
            TagImageView access$leftIv = ImproveOtherTimelineItemHandleKt.access$leftIv(viewGroup);
            if (access$leftIv != null) {
                access$leftIv.setVisibility(0);
            }
            C101804kv2 kv22 = timeLineObject.ContentObj.f298427h.get(0);
            ImageView access$stateIv = ImproveOtherTimelineItemHandleKt.access$stateIv(viewGroup);
            if (access$stateIv != null) {
                access$stateIv.setImageResource(C0966R.raw.shortvideo_play_btn);
            }
            ImageView access$stateIv2 = ImproveOtherTimelineItemHandleKt.access$stateIv(viewGroup);
            if (access$stateIv2 != null) {
                access$stateIv2.setVisibility(0);
            }
            C94901o Fx0 = C94866e1.Fx0();
            TagImageView access$leftIv2 = ImproveOtherTimelineItemHandleKt.access$leftIv(viewGroup);
            int hashCode = viewGroup.getContext().hashCode();
            C96983o3 c = C96983o3.m124651c();
            c.f284145b = timeLineObject.CreateTime;
            Fx0.mo131104X(kv22, access$leftIv2, C0966R.raw.app_attach_file_icon_video, hashCode, c);
        }
        SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveObjectVideoHandle");
        return handle;
    }
}
