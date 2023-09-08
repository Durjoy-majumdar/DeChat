package c60;

import android.graphics.Bitmap;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: c60.a */
public final class C28499a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f78311d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f78312e;

    public C28499a(C32226l<? super Bitmap, C13598b0> lVar, Bitmap bitmap) {
        this.f78311d = lVar;
        this.f78312e = bitmap;
    }

    public final void run() {
        C32226l<Bitmap, C13598b0> lVar = this.f78311d;
        if (lVar != null) {
            lVar.invoke(this.f78312e);
        }
    }
}
