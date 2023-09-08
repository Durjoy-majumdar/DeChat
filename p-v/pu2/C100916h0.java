package pu2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.handle.ImproveTimelineItemExposeHandle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import gy3.C87412m;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: pu2.h0 */
public abstract class C100916h0 extends C100940q {

    /* renamed from: pu2.h0$a */
    public static final class C100917a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C100916h0 f295526a;

        public C100917a(C100916h0 h0Var) {
            this.f295526a = h0Var;
        }

        /* renamed from: a */
        public long mo52a(View view) {
            SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemExpose$onAttachedToWindow$1");
            C87412m.m108594g(view, "view");
            long j = (long) this.f295526a.getStruct().f281367a.localid;
            SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemExpose$onAttachedToWindow$1");
            return j;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemExpose$onAttachedToWindow$1");
            C87412m.m108594g(view, "view");
            ImproveTimelineItemExposeHandle improveTimelineItemExposeHandle = ImproveTimelineItemExposeHandle.INSTANCE;
            SnsInfo snsInfo = this.f295526a.getStruct().f281367a;
            C87412m.m108593f(snsInfo, "struct.mSnsInfo");
            improveTimelineItemExposeHandle.onViewExposed(snsInfo, view, j, j2, z);
            SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemExpose$onAttachedToWindow$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100916h0(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemExpose");
        super.onAttachedToWindow();
        C23564m.m28138h(this, new C100917a(this));
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemExpose");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemExpose");
        super.onDetachedFromWindow();
        C23564m.m28138h(this, (C23555k.C23562d) null);
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemExpose");
    }
}
