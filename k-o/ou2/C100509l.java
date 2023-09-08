package ou2;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C58097y0;
import fy3.C32224a;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: ou2.l */
public interface C100509l {

    /* renamed from: ou2.l$a */
    public static final class C100510a {
        /* renamed from: a */
        public static /* synthetic */ Object m131542a(C100509l lVar, String str, FrameLayout.LayoutParams layoutParams, String str2, C15601d dVar, int i, Object obj) {
            SnsMethodCalculate.markStartTimeMs("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame$DefaultImpls");
            if (obj == null) {
                if ((i & 2) != 0) {
                    layoutParams = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                Object b = lVar.mo133978b(str, layoutParams, str2, dVar);
                SnsMethodCalculate.markEndTimeMs("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame$DefaultImpls");
                return b;
            }
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            SnsMethodCalculate.markEndTimeMs("prepare$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IVideoControllerForBreakFrame$DefaultImpls");
            throw unsupportedOperationException;
        }
    }

    /* renamed from: a */
    void mo133977a(FrameLayout.LayoutParams layoutParams);

    /* renamed from: b */
    Object mo133978b(String str, FrameLayout.LayoutParams layoutParams, String str2, C15601d<? super C13598b0> dVar);

    /* renamed from: c */
    Object mo133979c(long j, boolean z, C32224a<Boolean> aVar, C15601d<? super C13598b0> dVar);

    C58097y0<Boolean> getCompletionFlow();

    long getCurrentPosInMills();

    long getDurationMs();

    void pause();

    void resume();

    void setFrameLayoutAlpha(float f);

    void start();

    void stop();
}
