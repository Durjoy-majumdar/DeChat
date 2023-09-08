package sb2;

import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: sb2.g */
public final class C13638g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C13642k f38640d;

    public C13638g(C13642k kVar) {
        this.f38640d = kVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107150j(1201, this.f38640d.getContext().getString(C0966R.string.bxg), C0966R.raw.bottomsheet_icon_star, this.f38640d.getContext().getResources().getColor(C0966R.color.f2939n), false);
        e0Var.mo107150j(TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, this.f38640d.getContext().getString(C0966R.string.bxh), C0966R.raw.bottomsheet_icon_star, this.f38640d.getContext().getResources().getColor(C0966R.color.f2939n), false);
    }
}
