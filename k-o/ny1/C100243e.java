package ny1;

import com.tencent.p014mm.plugin.game.media.preview.GameVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;

/* renamed from: ny1.e */
public class C100243e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameVideoView f293692d;

    public C100243e(GameVideoView gameVideoView) {
        this.f293692d = gameVideoView;
    }

    public void run() {
        C96814a aVar = this.f293692d.f271853e;
        if (aVar instanceof CommonVideoView) {
            ((CommonVideoView) aVar).mo135072F();
        }
    }
}
