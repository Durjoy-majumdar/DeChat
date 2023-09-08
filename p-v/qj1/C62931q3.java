package qj1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.q3 */
public final class C62931q3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f178566d;

    /* renamed from: e */
    public final /* synthetic */ C63081w3 f178567e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62931q3(Bitmap bitmap, C63081w3 w3Var) {
        super(0);
        this.f178566d = bitmap;
        this.f178567e = w3Var;
    }

    public Object invoke() {
        if (this.f178566d != null) {
            this.f178567e.f179015r.setImageDrawable(new BitmapDrawable(this.f178567e.f166287d.getContext().getResources(), this.f178566d));
            ((C54991o) this.f178567e.mo87696x0(C54991o.class)).f154254S2 = this.f178566d;
        } else {
            Log.m105924i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return C13598b0.f38549a;
    }
}
