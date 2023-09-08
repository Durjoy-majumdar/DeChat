package sb2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC;

/* renamed from: sb2.z0 */
public final class C13650z0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMvSongInfoUIC f38671d;

    public C13650z0(MusicMvSongInfoUIC musicMvSongInfoUIC) {
        this.f38671d = musicMvSongInfoUIC;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f38671d.getActivity().finish();
    }
}
