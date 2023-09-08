package qj1;

import android.os.Bundle;
import b50.C54410e;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: qj1.rh */
public final class C35912rh implements C54410e {

    /* renamed from: d */
    public final /* synthetic */ C62983sh f95804d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f95805e;

    public C35912rh(C62983sh shVar, C32226l<? super Boolean, C13598b0> lVar) {
        this.f95804d = shVar;
        this.f95805e = lVar;
    }

    public void callback(int i, Bundle bundle) {
        if (i >= 0) {
            this.f95804d.getClass();
            this.f95805e.invoke(Boolean.TRUE);
            return;
        }
        this.f95804d.getClass();
        this.f95805e.invoke(Boolean.FALSE);
    }
}
