package tq2;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.widget.admedia.SeekBarView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: tq2.a */
public final class C101915a implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SeekBarView f300077d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<Float, C32224a<C13598b0>, C13598b0> f300078e;

    /* renamed from: tq2.a$a */
    public static final class C101916a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SeekBarView f300079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C101916a(SeekBarView seekBarView) {
            super(0);
            this.f300079d = seekBarView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1$1");
            this.f300079d.setRefreshing(true);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1$1");
            return b0Var;
        }
    }

    public C101915a(SeekBarView seekBarView, C32227p<? super Float, ? super C32224a<C13598b0>, C13598b0> pVar) {
        this.f300077d = seekBarView;
        this.f300078e = pVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$initDragControl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f300077d.requestDisallowInterceptTouchEvent(true);
            SeekBarView seekBarView = this.f300077d;
            float progress = seekBarView.getProgress();
            SnsMethodCalculate.markStartTimeMs("access$setDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            seekBarView.f274209v = progress;
            SnsMethodCalculate.markEndTimeMs("access$setDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            SeekBarView seekBarView2 = this.f300077d;
            float rawX = motionEvent.getRawX();
            SnsMethodCalculate.markStartTimeMs("access$setDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            seekBarView2.f274208u = rawX;
            SnsMethodCalculate.markEndTimeMs("access$setDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
        } else if (action != 2) {
            this.f300077d.requestDisallowInterceptTouchEvent(false);
            this.f300078e.invoke(Float.valueOf(this.f300077d.getProgress()), new C101916a(this.f300077d));
        } else {
            this.f300077d.setRefreshing(false);
            float rawX2 = motionEvent.getRawX();
            SeekBarView seekBarView3 = this.f300077d;
            SnsMethodCalculate.markStartTimeMs("access$getDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f = seekBarView3.f274208u;
            SnsMethodCalculate.markEndTimeMs("access$getDragBeginPosition$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f2 = rawX2 - f;
            SeekBarView seekBarView4 = this.f300077d;
            SnsMethodCalculate.markStartTimeMs("access$getLineWidth$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            int i = seekBarView4.f274205r;
            SnsMethodCalculate.markEndTimeMs("access$getLineWidth$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            SnsMethodCalculate.markStartTimeMs("access$getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            C32224a<Integer> a = seekBarView4.mo130419a(i);
            SnsMethodCalculate.markEndTimeMs("access$getConvertToXmlPxInt", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float floatValue = f2 / ((Number) ((SeekBarView.C94728c) a).invoke()).floatValue();
            SeekBarView seekBarView5 = this.f300077d;
            SnsMethodCalculate.markStartTimeMs("access$getDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f3 = seekBarView5.f274209v;
            SnsMethodCalculate.markEndTimeMs("access$getDragBeginProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            SeekBarView seekBarView6 = this.f300077d;
            SnsMethodCalculate.markStartTimeMs("access$getTotalProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            float f4 = seekBarView6.f274201n;
            SnsMethodCalculate.markEndTimeMs("access$getTotalProgress$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            seekBarView5.setProgress(f3 + (floatValue * f4));
        }
        SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$initDragControl$1");
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ad/widget/admedia/SeekBarView$initDragControl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
