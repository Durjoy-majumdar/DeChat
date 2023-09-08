package op1;

import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: op1.d */
public final class C11707d implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ String f34272d;

    /* renamed from: e */
    public final /* synthetic */ String f34273e;

    public C11707d(String str, String str2) {
        this.f34272d = str;
        this.f34273e = str2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (this.f34272d.length() == 0) {
            e0Var.mo107142f(1001, this.f34273e);
        } else {
            e0Var.mo107142f(1001, this.f34273e);
        }
        Log.m105924i("FinderLiveShoppingEditAdapter", "promotingWording:" + this.f34272d);
    }
}
