package os1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import zp3.C23555k;

/* renamed from: os1.l */
public final class C11747l extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C62163m f34396a;

    public C11747l(C62163m mVar) {
        this.f34396a = mVar;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            C62163m mVar = this.f34396a;
            mVar.getClass();
            Log.m105924i("Finder.RedDotSessionVM", "enterFindPage isEnable=" + mVar.mo87214j3());
            return;
        }
        C62163m mVar2 = this.f34396a;
        if (mVar2.mo87214j3()) {
            if (!mVar2.f176739g) {
                mVar2.mo87213i3("exitFindPage");
                mVar2.mo87212g3(mVar2.mo87209d3(1));
            }
            mVar2.f176739g = false;
        }
    }
}
