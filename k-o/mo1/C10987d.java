package mo1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import da0.C58247e;
import di3.C86312j;
import dp1.C58417y0;
import er1.C7853p2;
import nj3.C11182m0;
import nj3.C76874e0;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: mo1.d */
public final class C10987d implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C10943a f32690d;

    /* renamed from: e */
    public final /* synthetic */ AppCompatActivity f32691e;

    public C10987d(C10943a aVar, AppCompatActivity appCompatActivity) {
        this.f32690d = aVar;
        this.f32691e = appCompatActivity;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        Class cls = C58417y0.class;
        if (e0Var.mo107176v()) {
            e0Var.mo107125a(1, C0966R.string.f7980y8);
            e0Var.mo107125a(2, C0966R.string.f7989yh);
            if (((C58247e) C86312j.m106911c(C58247e.class)).yf0().mo8429d()) {
                e0Var.mo107125a(4, C0966R.string.lr5);
            }
            C7853p2.f26439a.mo8962e(1010, this.f32690d.f32621M, e0Var, this.f32691e);
        }
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C13442s8 f = aVar.mo12873f(this.f32691e);
        C49712hj1 hj12 = null;
        y0Var.Cx0(0, "post_acionsheet_camera", "", f != null ? f.mo12861q3() : null);
        C58417y0 y0Var2 = (C58417y0) C86312j.m106911c(cls);
        C13442s8 f2 = aVar.mo12873f(this.f32691e);
        if (f2 != null) {
            hj12 = f2.mo12861q3();
        }
        y0Var2.Cx0(0, "post_actionsheet_album", "", hj12);
    }
}
