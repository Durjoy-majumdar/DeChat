package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.ref.WeakReference;
import p1162x2.C112020b;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.v4 */
public class C84700v4 {

    /* renamed from: a */
    public static volatile WeakReference<Bitmap> f247083a;

    /* renamed from: a */
    public static Drawable m104349a() {
        Bitmap bitmap;
        if (f247083a == null || (bitmap = f247083a.get()) == null || bitmap.isRecycled()) {
            f247083a = new WeakReference<>(BitmapFactory.decodeResource(MMApplicationContext.getResources(), C0966R.C0969drawable.c8n));
        }
        C112020b bVar = new C112020b(MMApplicationContext.getResources(), f247083a.get());
        bVar.mo163679b(true);
        return bVar;
    }
}
