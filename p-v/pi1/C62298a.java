package pi1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pi1.a */
public final class C62298a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f177101d;

    /* renamed from: e */
    public final /* synthetic */ C62305h f177102e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62298a(Bitmap bitmap, C62305h hVar) {
        super(0);
        this.f177101d = bitmap;
        this.f177102e = hVar;
    }

    public Object invoke() {
        if (this.f177101d != null) {
            this.f177102e.f177115v.f175487f.setImageDrawable(new BitmapDrawable(this.f177102e.getContext().getResources(), this.f177101d));
            ((C54991o) this.f177102e.getBasePlugin().mo87696x0(C54991o.class)).f154254S2 = this.f177101d;
        } else {
            Log.m105924i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return C13598b0.f38549a;
    }
}
