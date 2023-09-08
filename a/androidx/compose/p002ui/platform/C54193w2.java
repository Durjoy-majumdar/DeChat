package androidx.compose.p002ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import c14.C54625h;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.w2 */
public final class C54193w2 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ C54625h<C13598b0> f152155a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54193w2(C54625h<C13598b0> hVar, Handler handler) {
        super(handler);
        this.f152155a = hVar;
    }

    public void onChange(boolean z, Uri uri) {
        this.f152155a.mo75539t(C13598b0.f38549a);
    }
}
