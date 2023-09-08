package nu2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import nq2.C100151a;

/* renamed from: nu2.a */
public class C100197a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C100151a.C100155d f293572d;

    /* renamed from: e */
    public final /* synthetic */ C100198b f293573e;

    public C100197a(C100198b bVar, C100151a.C100155d dVar) {
        this.f293573e = bVar;
        this.f293572d = dVar;
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$1");
        if (!this.f293572d.f293379x.isAttachedToWindow()) {
            Log.m105918d("BaseFullCardAdBusiness", "onPreDraw, return, isAttached=false, hash=" + hashCode());
            SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$1");
            return true;
        }
        int width = this.f293572d.f293379x.getWidth();
        int height = this.f293572d.f293379x.getHeight();
        Log.m105924i("BaseFullCardAdBusiness", "onPreDraw, w=" + width + ", h=" + height);
        this.f293573e.mo139499n(width, height);
        C100198b bVar = this.f293573e;
        if (bVar.f293583j != null) {
            View findViewById = bVar.mo139495j() ? this.f293572d.f293377v.findViewById(C0966R.C0970id.a7q) : this.f293572d.f293377v.findViewById(C0966R.C0970id.lvp);
            if (findViewById != null) {
                int[] iArr = new int[2];
                this.f293572d.f293377v.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                findViewById.getLocationOnScreen(iArr2);
                int height2 = (iArr2[1] + findViewById.getHeight()) - iArr[1];
                int width2 = this.f293572d.f293378w.getWidth();
                ViewGroup.LayoutParams layoutParams = this.f293573e.f293583j.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = height2;
                this.f293573e.f293583j.setLayoutParams(layoutParams);
                C100198b bVar2 = this.f293573e;
                bVar2.mo139498m(bVar2.f293583j, width2, height2);
            } else {
                Log.m105920e("BaseFullCardAdBusiness", "onPreDraw, commentLayout==null");
            }
        } else {
            Log.m105920e("BaseFullCardAdBusiness", "onPreDraw, breakFrameContainer==null");
        }
        if (width > 0 && height > 0) {
            Log.m105924i("BaseFullCardAdBusiness", "onPreDraw, removeOnPreDrawListener, isAttached=true, hash=" + hashCode());
            this.f293572d.f293379x.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.BaseFullCardAdBusiness$1");
        return true;
    }
}
