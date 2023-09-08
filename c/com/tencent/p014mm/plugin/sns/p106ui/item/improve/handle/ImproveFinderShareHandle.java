package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
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
import vr2.C102236a0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveFinderShareHandle;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "Landroid/view/ViewGroup;", "layout", "Lrx3/l;", "", "handle", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderShareHandle */
public final class ImproveFinderShareHandle extends ImproveOtherTimelineItemHandle {
    public static final ImproveFinderShareHandle INSTANCE = new ImproveFinderShareHandle();

    private ImproveFinderShareHandle() {
    }

    public int getContentStyle() {
        SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderShareHandle");
        SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderShareHandle");
        return 28;
    }

    public C13604l<String, String> handle(SnsInfo snsInfo, TimeLineObject timeLineObject, ViewGroup viewGroup) {
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderShareHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        C87412m.m108594g(timeLineObject2, "tlObj");
        C87412m.m108594g(viewGroup, "layout");
        C13604l<String, String> handle = super.handle(snsInfo, timeLineObject, viewGroup);
        Context context = viewGroup.getContext();
        String str = (String) handle.f38555d;
        String str2 = (String) handle.f38556e;
        if (timeLineObject2.ContentObj.f298431o != null) {
            if (((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF() || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_no_support_share_switch, 0) == 0) {
                if (Util.isNullOrNil(C102236a0.m134703A(timeLineObject2.ContentObj.f298431o)) && !Util.isNullOrNil(timeLineObject2.ContentObj.f298431o.f185187h)) {
                    str = timeLineObject2.ContentObj.f298431o.f185187h;
                } else if (!Util.isNullOrNil(timeLineObject2.ContentObj.f298431o.f185187h)) {
                    str = C102236a0.m134703A(timeLineObject2.ContentObj.f298431o) + ": " + timeLineObject2.ContentObj.f298431o.f185187h;
                } else {
                    str = context.getString(C0966R.string.jh9, new Object[]{C102236a0.m134703A(timeLineObject2.ContentObj.f298431o)});
                }
            }
            TagImageView access$leftIv = ImproveOtherTimelineItemHandleKt.access$leftIv(viewGroup);
            if (access$leftIv != null) {
                access$leftIv.setVisibility(0);
            }
            if (!timeLineObject2.ContentObj.f298431o.f185190n.isEmpty()) {
                C101804kv2 kv22 = new C101804kv2();
                kv22.f298692g = timeLineObject2.ContentObj.f298431o.f185190n.get(0).f184828f;
                kv22.f298694i = timeLineObject2.ContentObj.f298431o.f185190n.get(0).f184828f;
                kv22.f298690e = 2;
                kv22.f298695j = 1;
                C101817mv2 mv22 = new C101817mv2();
                kv22.f298698p = mv22;
                kv22.f298693h = 1;
                mv22.f298875d = timeLineObject2.ContentObj.f298431o.f185190n.get(0).f184829g;
                kv22.f298698p.f298876e = timeLineObject2.ContentObj.f298431o.f185190n.get(0).f184830h;
                kv22.f298689d = snsInfo.getSnsId();
                C94901o Fx0 = C94866e1.Fx0();
                String snsId = snsInfo.getSnsId();
                TagImageView access$leftIv2 = ImproveOtherTimelineItemHandleKt.access$leftIv(viewGroup);
                int hashCode = viewGroup.getContext().hashCode();
                C96983o3 c = C96983o3.m124651c();
                c.f284145b = timeLineObject2.CreateTime;
                Fx0.mo131101U(snsId, kv22, access$leftIv2, hashCode, c);
            }
        }
        C13604l<String, String> lVar = new C13604l<>(str, str2);
        SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveFinderShareHandle");
        return lVar;
    }
}
