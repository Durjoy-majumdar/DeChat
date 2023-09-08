package ud1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;

/* renamed from: ud1.q */
public final class C14172q implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39617d;

    public C14172q(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC) {
        this.f39617d = finderMusicTopicHeaderUIC;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f39617d.f12472g = null;
    }
}
