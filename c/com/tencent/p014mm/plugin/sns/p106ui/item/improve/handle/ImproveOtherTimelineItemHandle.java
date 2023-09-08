package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsOtherFeedClickEvent;
import com.tencent.p014mm.plugin.sns.p106ui.C95787g0;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96965r;
import ft3.C116895f;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C101789j00;
import te3.C101842st2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H&J0\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0004J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0004J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0014JH\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\rH\u0004¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "", "Lcom/tencent/mm/protocal/protobuf/TimeLineObject;", "tlObj", "", "getDefaultTitle", "getDescStr", "", "getContentStyle", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Landroid/view/ViewGroup;", "layout", "Lrx3/l;", "handle", "Lcom/tencent/mm/plugin/sns/ui/g0;", "getTagObject", "", "checkClickValid", "checkMediaValid", "Landroid/view/View;", "Lrx3/b0;", "postClickEvent", "first", "second", "pickValidContent", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle */
public abstract class ImproveOtherTimelineItemHandle {
    private final String getDefaultTitle(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        String str = timeLineObject.ContentObj.f298425f;
        if (str != null && str.length() > 40) {
            boolean z = C96965r.f284067d;
            int g = C96965r.C44649c.f121057a.mo135555g(str, 0, 40);
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, g);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("...");
            str = sb.toString();
        }
        SnsMethodCalculate.markEndTimeMs("getDefaultTitle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return str;
    }

    private final String getDescStr(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("getDescStr", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        String str = "";
        String o = SnsTimeLineBaseAdapter.m122256r(timeLineObject) ? SnsTimeLineBaseAdapter.m122253o(timeLineObject.ContentObj.f298426g) : str;
        C101789j00 j002 = timeLineObject.ContentObj;
        int i = j002.f298424e;
        if (i == 9 || i == 14 || i == 12 || i == 13) {
            o = j002.f298423d;
        }
        C101842st2 st22 = j002.f298430n;
        if (st22 != null && st22.f299453q == 1) {
            o = MMApplicationContext.getContext().getString(C0966R.string.gw8);
        }
        if (o != null) {
            str = o;
        }
        SnsMethodCalculate.markEndTimeMs("getDescStr", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return str;
    }

    public boolean checkClickValid(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        SnsMethodCalculate.markEndTimeMs("checkClickValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return true;
    }

    public final boolean checkMediaValid(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("checkMediaValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        TimeLineObject timeLine = snsInfo.getTimeLine();
        C87412m.m108593f(timeLine, "snsInfo.timeLine");
        boolean z = timeLine.ContentObj.f298427h.size() > 0;
        SnsMethodCalculate.markEndTimeMs("checkMediaValid", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return z;
    }

    public abstract int getContentStyle();

    public final C95787g0 getTagObject(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getTagObject", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        String localid = snsInfo.getLocalid();
        TimeLineObject timeLine = snsInfo.getTimeLine();
        C87412m.m108593f(timeLine, "snsInfo.timeLine");
        C95787g0 g0Var = new C95787g0(timeLine, localid, snsInfo.getTypeFlag());
        SnsMethodCalculate.markEndTimeMs("getTagObject", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return g0Var;
    }

    public C13604l<String, String> handle(SnsInfo snsInfo, TimeLineObject timeLineObject, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        C87412m.m108594g(timeLineObject, "tlObj");
        C87412m.m108594g(viewGroup, "layout");
        viewGroup.setTag(getTagObject(snsInfo));
        viewGroup.setOnClickListener((View.OnClickListener) null);
        if (checkClickValid(snsInfo)) {
            viewGroup.setOnClickListener(new ImproveOtherTimelineItemHandle$handle$1(this, snsInfo));
        }
        C13604l<String, String> lVar = new C13604l<>(getDefaultTitle(timeLineObject), getDescStr(timeLineObject));
        SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return lVar;
    }

    public final C13604l<String, String> pickValidContent(C13604l<String, String> lVar, C13604l<String, String> lVar2) {
        SnsMethodCalculate.markStartTimeMs("pickValidContent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        C87412m.m108594g(lVar, "first");
        C87412m.m108594g(lVar2, "second");
        C13604l<String, String> lVar3 = new C13604l<>((String) (!TextUtils.isEmpty((CharSequence) lVar.f38555d) ? lVar.f38555d : lVar2.f38555d), (String) (!TextUtils.isEmpty((CharSequence) lVar.f38556e) ? lVar.f38556e : lVar2.f38556e));
        SnsMethodCalculate.markEndTimeMs("pickValidContent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        return lVar3;
    }

    public void postClickEvent(View view, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
        C87412m.m108594g(view, "layout");
        C87412m.m108594g(snsInfo, "snsInfo");
        C116895f.m164891c("MicroMsg.Improve.ImproveOtherTimelineItemHandle", "postClickEvent type:" + getContentStyle() + " snsid:" + snsInfo.getSnsId());
        SnsOtherFeedClickEvent snsOtherFeedClickEvent = new SnsOtherFeedClickEvent();
        snsOtherFeedClickEvent.f265177d.f265178a = getContentStyle();
        snsOtherFeedClickEvent.f265177d.f265179b = getTagObject(snsInfo);
        snsOtherFeedClickEvent.f265177d.f265180c = view;
        snsOtherFeedClickEvent.publish();
        SnsMethodCalculate.markEndTimeMs("postClickEvent", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherTimelineItemHandle");
    }
}
