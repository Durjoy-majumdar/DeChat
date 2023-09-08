package he1;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;
import te3.C50409mj;

/* renamed from: he1.d */
public final class C59841d implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ boolean f170851d;

    /* renamed from: e */
    public final /* synthetic */ C50409mj f170852e;

    /* renamed from: f */
    public final /* synthetic */ Resources f170853f;

    /* renamed from: g */
    public final /* synthetic */ boolean f170854g;

    public C59841d(boolean z, C50409mj mjVar, Resources resources, boolean z2) {
        this.f170851d = z;
        this.f170852e = mjVar;
        this.f170853f = resources;
        this.f170854g = z2;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (this.f170851d) {
            if (this.f170852e.f138064j == 0) {
                e0Var.mo107142f(2, this.f170853f.getString(C0966R.string.gqt));
                e0Var.mo107142f(1, this.f170853f.getString(C0966R.string.gqo));
                if (this.f170854g) {
                    e0Var.mo107142f(4, this.f170853f.getString(C0966R.string.muz));
                } else {
                    e0Var.mo107142f(3, this.f170853f.getString(C0966R.string.muy));
                }
            } else {
                e0Var.mo107142f(1, this.f170853f.getString(C0966R.string.gqo));
            }
        } else if (this.f170852e.f138064j == 1) {
            e0Var.mo107142f(1, this.f170853f.getString(C0966R.string.gqo));
        } else {
            e0Var.mo107142f(2, this.f170853f.getString(C0966R.string.gqt));
        }
    }
}
