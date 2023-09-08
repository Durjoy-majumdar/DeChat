package ry1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.p061ui.GameDetailUI2;
import nj3.C11182m0;
import nj3.C76874e0;
import py1.C47643o4;

/* renamed from: ry1.v */
public class C48164v implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C47643o4 f129095d;

    /* renamed from: e */
    public final /* synthetic */ GameDetailUI2 f129096e;

    public C48164v(GameDetailUI2 gameDetailUI2, C47643o4 o4Var) {
        this.f129096e = gameDetailUI2;
        this.f129095d = o4Var;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        if (this.f129095d.f127912i) {
            e0Var.mo107144g(0, this.f129096e.getString(C0966R.string.fbs), C0966R.raw.bottomsheet_icon_transmit);
        }
        if (this.f129095d.f127913j) {
            e0Var.mo107144g(1, this.f129096e.getString(C0966R.string.fby), C0966R.raw.bottomsheet_icon_moment);
        }
    }
}
