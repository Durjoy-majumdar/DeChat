package com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import rx3.C13604l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherItemLoadHandle;", "", "Lcom/tencent/mm/plugin/sns/storage/SnsInfo;", "snsInfo", "Landroid/view/ViewGroup;", "layout", "Lrx3/l;", "", "handle", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/sns/ui/item/improve/handle/ImproveOtherTimelineItemHandle;", "Lkotlin/collections/ArrayList;", "handleList", "Ljava/util/ArrayList;", "<init>", "()V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle */
public final class ImproveOtherItemLoadHandle {
    public static final ImproveOtherItemLoadHandle INSTANCE = new ImproveOtherItemLoadHandle();
    private static final ArrayList<ImproveOtherTimelineItemHandle> handleList;

    static {
        ArrayList<ImproveOtherTimelineItemHandle> arrayList = new ArrayList<>();
        handleList = arrayList;
        arrayList.add(ImproveProductHandle.INSTANCE);
        arrayList.add(ImproveEmojiShareHandle.INSTANCE);
        arrayList.add(ImproveEmojiDesignerShareHandle.INSTANCE);
        arrayList.add(ImproveEmotionListShareHandle.INSTANCE);
        arrayList.add(ImproveEmojiListShareHandle.INSTANCE);
        arrayList.add(ImproveEmotionSetShareHandle.INSTANCE);
        arrayList.add(ImproveObjectTvHandle.INSTANCE);
        arrayList.add(ImproveMallHandle.INSTANCE);
        arrayList.add(ImproveGeneralCardHandle.INSTANCE);
        arrayList.add(ImproveSinglePageHandle.INSTANCE);
        arrayList.add(ImproveWNNotePageHandle.INSTANCE);
        arrayList.add(ImproveFinderShareHandle.INSTANCE);
        arrayList.add(ImproveFinderTopicHandle.INSTANCE);
        arrayList.add(ImproveFinderFollowTopicHandle.INSTANCE);
        arrayList.add(ImproveFinderColumnCardHandle.INSTANCE);
        arrayList.add(ImproveFinderLiveHandle.INSTANCE);
        arrayList.add(ImproveFinderPurchaseHandle.INSTANCE);
        arrayList.add(ImproveFinderMegaVideoHandle.INSTANCE);
        arrayList.add(ImproveFinderPoiHandle.INSTANCE);
        arrayList.add(ImproveFinderMusicTopicHandle.INSTANCE);
        arrayList.add(ImproveLiteAppHandle.INSTANCE);
        arrayList.add(ImproveFinderAggreateHandle.INSTANCE);
        arrayList.add(ImproveObjectMusicHandle.INSTANCE);
        arrayList.add(ImproveObjectFeedHandle.INSTANCE);
        arrayList.add(ImproveObjectVideoHandle.INSTANCE);
        arrayList.add(ImproveGameShareCardHandle.INSTANCE);
    }

    private ImproveOtherItemLoadHandle() {
    }

    public final C13604l<String, String> handle(SnsInfo snsInfo, ViewGroup viewGroup) {
        T t;
        boolean z;
        SnsMethodCalculate.markStartTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle");
        C87412m.m108594g(snsInfo, "snsInfo");
        C87412m.m108594g(viewGroup, "layout");
        TimeLineObject timeLine = snsInfo.getTimeLine();
        C87412m.m108593f(timeLine, "snsInfo.timeLine");
        int i = timeLine.ContentObj.f298424e;
        Iterator<T> it = handleList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((ImproveOtherTimelineItemHandle) t).getContentStyle() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ImproveOtherTimelineItemHandle improveOtherTimelineItemHandle = (ImproveOtherTimelineItemHandle) t;
        if (improveOtherTimelineItemHandle == null) {
            improveOtherTimelineItemHandle = ImproveDefaultHandle.INSTANCE;
        }
        C13604l<String, String> handle = improveOtherTimelineItemHandle.handle(snsInfo, timeLine, viewGroup);
        SnsMethodCalculate.markEndTimeMs("handle", "com.tencent.mm.plugin.sns.ui.item.improve.handle.ImproveOtherItemLoadHandle");
        return handle;
    }
}
