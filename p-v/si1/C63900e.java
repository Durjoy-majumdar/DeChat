package si1;

import android.graphics.Color;
import cl1.C54949c0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import gg1.C32444a;
import nj3.C11182m0;
import nj3.C76874e0;
import nj3.C76875f0;

/* renamed from: si1.e */
public final class C63900e implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C63902g f181126d;

    public C63900e(C63902g gVar) {
        this.f181126d = gVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        C63902g gVar = this.f181126d;
        boolean z = true;
        if (gVar.mo88678i()) {
            ((C76875f0) e0Var.mo107148i(2, gVar.getContext().getResources().getString(C0966R.string.mz4), Color.parseColor("#B4B4B4"), C0966R.raw.icons_outlined_mic_on, Color.parseColor("#B4B4B4"))).f224722q = true;
        } else if (((C54991o) gVar.f181128h.mo87696x0(C54991o.class)).f154274W2) {
            e0Var.mo107144g(2, gVar.getContext().getResources().getString(C0966R.string.f360638dx3), C0966R.raw.icons_outlined_mic_on);
        } else {
            e0Var.mo107144g(2, gVar.getContext().getResources().getString(C0966R.string.dxs), C0966R.raw.icons_outlined_mic_off);
        }
        if (((C54949c0) gVar.f181128h.mo87696x0(C54949c0.class)).mo75864e3()) {
            if (gVar.f181130j == 1) {
                e0Var.mo107144g(7, gVar.getContext().getResources().getString(C0966R.string.f8126mg), C0966R.raw.icons_outlined_video_call);
            } else {
                e0Var.mo107144g(6, gVar.getContext().getResources().getString(C0966R.string.f8125mf), C0966R.raw.icons_outlined_call);
            }
        }
        if (gVar.mo86966j()) {
            e0Var.mo107144g(3, gVar.getContext().getResources().getString(C0966R.string.f360602mn3), C0966R.raw.icons_outlined_camera_switch);
            if (C32444a.f86161k.mo60266n().intValue() != 1) {
                z = false;
            }
            if (z) {
                e0Var.mo107144g(5, gVar.getContext().getResources().getString(C0966R.string.mnz), C0966R.raw.icons_outlined_screen_effect_regular);
            }
        }
        e0Var.mo107144g(4, gVar.getContext().getResources().getString(C0966R.string.dr8), C0966R.raw.finder_live_unmic);
    }
}
