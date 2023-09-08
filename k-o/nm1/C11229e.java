package nm1;

import a14.C53973z1;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import zp3.C23555k;

/* renamed from: nm1.e */
public final class C11229e extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ ImageView f33093a;

    public C11229e(ImageView imageView) {
        this.f33093a = imageView;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (!z) {
            Log.m105924i("NearbyLiveViewCallback", "#bindActivityIcon onViewExposedListener false, cancel it");
            ImageView imageView = this.f33093a;
            C87412m.m108593f(imageView, "iconView");
            Object tag = imageView.getTag(C0966R.C0970id.e3t);
            if (tag instanceof C53973z1) {
                C53973z1.C53974a.m60623a((C53973z1) tag, (CancellationException) null, 1, (Object) null);
            }
        }
    }
}
