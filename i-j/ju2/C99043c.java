package ju2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsFeedRelocateEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: ju2.c */
public final class C99043c {

    /* renamed from: a */
    public static final C99043c f290342a = new C99043c();

    /* renamed from: a */
    public final void mo138385a(View view, int i) {
        SnsMethodCalculate.markStartTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[1];
        SnsMethodCalculate.markStartTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        mo138386b(view, i2, i2 + view.getHeight(), i, (Runnable) null);
        SnsMethodCalculate.markEndTimeMs("relocateFeed$default", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        SnsMethodCalculate.markEndTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
    }

    /* renamed from: b */
    public final void mo138386b(View view, int i, int i2, int i3, Runnable runnable) {
        SnsMethodCalculate.markStartTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
            return;
        }
        int dimensionPixelSize = MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3705bx) + i3;
        SnsFeedRelocateEvent snsFeedRelocateEvent = new SnsFeedRelocateEvent();
        SnsFeedRelocateEvent.C92575a aVar = snsFeedRelocateEvent.f265138d;
        aVar.f265139a = view;
        aVar.f265140b = i;
        aVar.f265141c = i2;
        aVar.f265142d = dimensionPixelSize;
        aVar.f265143e = runnable;
        snsFeedRelocateEvent.publish();
        Log.m105924i("MicroMsg.Improve.FeedRelocateUtil", "relocateFeed: changeAreaTop:" + i + ", changeAreaBottom:" + i2 + ", totalExtraOffsetY:" + dimensionPixelSize);
        SnsMethodCalculate.markEndTimeMs("relocateFeed", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveFeedRelocateUtil");
    }
}
