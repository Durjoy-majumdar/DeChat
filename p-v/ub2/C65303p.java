package ub2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;

/* renamed from: ub2.p */
public final class C65303p extends RecyclerView.C16633n {

    /* renamed from: a */
    public final /* synthetic */ MusicMVCardChooseView f187961a;

    public C65303p(MusicMVCardChooseView musicMVCardChooseView) {
        this.f187961a = musicMVCardChooseView;
    }

    /* renamed from: a */
    public boolean mo17379a(int i, int i2) {
        Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "onFling velocityY:" + i2);
        MusicMVCardChooseView musicMVCardChooseView = this.f187961a;
        int i3 = MusicMVCardChooseView.f163455X0;
        if (musicMVCardChooseView.mo80518h()) {
            return false;
        }
        MusicMVCardChooseView musicMVCardChooseView2 = this.f187961a;
        if (musicMVCardChooseView2.f163460D) {
            return false;
        }
        if (i2 > 8000 && musicMVCardChooseView2.f163481U0) {
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "onFling velocityY:" + i2 + ", changeTo maxMode");
            MusicMVCardChooseView.m65779j(this.f187961a, false, (C32226l) null, (C32224a) null, 6, (Object) null);
            return false;
        } else if (i2 >= -8000 || musicMVCardChooseView2.f163481U0) {
            return false;
        } else {
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "onFling velocityY:" + i2 + ", changeTo minMode");
            MusicMVCardChooseView.m65779j(this.f187961a, true, (C32226l) null, (C32224a) null, 6, (Object) null);
            return false;
        }
    }
}
