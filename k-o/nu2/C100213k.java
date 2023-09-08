package nu2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: nu2.k */
public class C100213k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C100211j f293628d;

    public C100213k(C100211j jVar) {
        this.f293628d = jVar;
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
        try {
            if (!this.f293628d.f293576c.f293379x.isAttachedToWindow()) {
                Log.m105918d("ShakeAdBusiness", "onPreDraw, return, isAttached=false, hash=" + hashCode());
                SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
                return true;
            }
            int width = this.f293628d.f293576c.f293379x.getWidth();
            int height = this.f293628d.f293576c.f293379x.getHeight();
            Log.m105924i("ShakeAdBusiness", "onPreDraw, w=" + width + ", h=" + height);
            this.f293628d.mo139499n(width, height);
            C100211j jVar = this.f293628d;
            if (jVar.f293583j != null) {
                View findViewById = jVar.mo139495j() ? this.f293628d.f293576c.f293377v.findViewById(C0966R.C0970id.a7q) : this.f293628d.f293576c.f293377v.findViewById(C0966R.C0970id.lvp);
                if (findViewById != null) {
                    int[] iArr = new int[2];
                    this.f293628d.f293576c.f293377v.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    findViewById.getLocationOnScreen(iArr2);
                    int height2 = (iArr2[1] + findViewById.getHeight()) - iArr[1];
                    int width2 = this.f293628d.f293576c.f293378w.getWidth();
                    ViewGroup.LayoutParams layoutParams = this.f293628d.f293583j.getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = height2;
                    this.f293628d.f293583j.setLayoutParams(layoutParams);
                    C100211j jVar2 = this.f293628d;
                    jVar2.mo139498m(jVar2.f293583j, width2, height2);
                } else {
                    Log.m105920e("ShakeAdBusiness", "onPreDraw, commentLayout==null");
                }
            } else {
                Log.m105920e("ShakeAdBusiness", "onPreDraw, breakFrameContainer==null");
            }
            if (width > 0 && height > 0) {
                Log.m105924i("ShakeAdBusiness", "onPreDraw, removeOnPreDrawListener, isAttached=true, hash=" + hashCode());
                this.f293628d.f293576c.f293379x.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            C100211j jVar3 = this.f293628d;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            jVar3.f293625u = false;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness");
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.ShakeAdBusiness$2");
            return true;
        } catch (Throwable th) {
            Log.m105920e("ShakeAdBusiness", "resizeBreakFrameContainer, onPreDraw exp is " + th);
        }
    }
}
