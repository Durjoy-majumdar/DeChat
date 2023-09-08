package n20;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: n20.l */
public final class C61606l extends BaseStateAction {

    /* renamed from: a */
    public final String f175197a;

    /* renamed from: b */
    public final Bitmap f175198b;

    /* renamed from: c */
    public final WeakReference<ImageView> f175199c;

    public C61606l(String str, Bitmap bitmap, WeakReference<ImageView> weakReference) {
        C87412m.m108594g(str, "imageKey");
        C87412m.m108594g(bitmap, "bitmap");
        C87412m.m108594g(weakReference, "imageViewRef");
        this.f175197a = str;
        this.f175198b = bitmap;
        this.f175199c = weakReference;
    }
}
