package rs1;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: rs1.i */
public final class C13266i implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C13248h f37643d;

    /* renamed from: e */
    public final /* synthetic */ Resources f37644e;

    public C13266i(C13248h hVar, Resources resources) {
        this.f37643d = hVar;
        this.f37644e = resources;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            e0Var.mo107140d(this.f37643d.f37609e, this.f37644e.getColor(C0966R.color.f2966ao), this.f37644e.getString(C0966R.string.d2t));
        }
    }
}
