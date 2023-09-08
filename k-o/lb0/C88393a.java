package lb0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.ref.WeakReference;
import p1162x2.C112020b;
import p996kj.C88155a;

/* renamed from: lb0.a */
public enum C88393a {
    ;
    

    /* renamed from: d */
    public static volatile WeakReference<Bitmap> f255382d;

    /* renamed from: a */
    public static Drawable m110230a() {
        Bitmap bitmap;
        if (f255382d == null || (bitmap = f255382d.get()) == null || bitmap.isRecycled()) {
            f255382d = new WeakReference<>(C88155a.decodeResource(MMApplicationContext.getResources(), C0966R.raw.miniprogram_default_avatar, (BitmapFactory.Options) null));
        }
        C112020b bVar = new C112020b(MMApplicationContext.getResources(), f255382d.get());
        bVar.mo163679b(true);
        return bVar;
    }
}
