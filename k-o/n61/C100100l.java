package n61;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3HomeBaseFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import p61.C100664m;

/* renamed from: n61.l */
public final class C100100l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3HomeBaseFragment f293250d;

    public C100100l(EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        this.f293250d = emojiStoreV3HomeBaseFragment;
    }

    public final void run() {
        Log.m105918d(this.f293250d.f268992d, "page first reportExposeData 18662, 12875");
        C100664m L = this.f293250d.mo127886L();
        RecyclerView recyclerView = this.f293250d.f268999n;
        L.mo140099G4(recyclerView != null ? recyclerView.getLayoutManager() : null);
    }
}
