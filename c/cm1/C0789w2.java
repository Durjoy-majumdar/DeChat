package cm1;

import a14.C53916l;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Result;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import x60.C102564a;

/* renamed from: cm1.w2 */
public final class C0789w2<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ C53916l<Drawable> f1845a;

    public C0789w2(C0777t2 t2Var, C53916l<? super Drawable> lVar) {
        this.f1845a = lVar;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        C13598b0 b0Var;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C53916l<Drawable> lVar = this.f1845a;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(new BitmapDrawable(bitmap)));
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f1845a.resumeWith(Result.m168114constructorimpl((Object) null));
        }
        Log.m105924i("Finder.SyncGetImageModel", "getImage resource :" + bitmap);
    }
}
