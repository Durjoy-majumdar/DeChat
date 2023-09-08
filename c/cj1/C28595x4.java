package cj1;

import android.os.Bundle;
import b50.C54410e;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: cj1.x4 */
public final class C28595x4 implements C54410e {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Integer, C13598b0> f78483d;

    public C28595x4(C32226l<? super Integer, C13598b0> lVar) {
        this.f78483d = lVar;
    }

    public void callback(int i, Bundle bundle) {
        this.f78483d.invoke(Integer.valueOf(i));
    }
}
