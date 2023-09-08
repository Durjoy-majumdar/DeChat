package gu3;

import android.os.Handler;
import android.os.Looper;
import fu3.C116901a;
import fu3.C116902b;
import mu3.C109639a;
import mu3.C117561c;

/* renamed from: gu3.e */
public class C107919e implements C87399g {

    /* renamed from: d */
    public C116901a f323133d;

    public C107919e(C107920f fVar) {
        this.f323133d = C109639a.m148953d() == null ? new C116902b(new Handler(Looper.myLooper())) : new C117561c(C109639a.m148953d());
    }

    public void execute(Runnable runnable) {
        this.f323133d.post(runnable);
    }

    /* renamed from: g */
    public void mo9401g() {
        this.f323133d.removeCallbacksAndMessages((Object) null);
    }

    public String getTag() {
        C116901a aVar = this.f323133d;
        return aVar instanceof C117561c ? aVar.getSerialTag() : C109639a.m148952c(aVar.getLooper());
    }
}
