package sb2;

import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: sb2.u */
public final class C63863u implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvMakerFixEditUIC f181038d;

    public C63863u(MusicMvMakerFixEditUIC musicMvMakerFixEditUIC) {
        this.f181038d = musicMvMakerFixEditUIC;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Log.m105924i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "initEditUI: " + i2 + ", " + i4 + "; " + i6 + ", " + i8);
        this.f181038d.f163340o.f163351a = i3 - i;
    }
}
