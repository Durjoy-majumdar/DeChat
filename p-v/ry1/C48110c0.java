package ry1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.game.p061ui.GameDownloadView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: ry1.c0 */
public class C48110c0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameDownloadView f128973d;

    public C48110c0(GameDownloadView gameDownloadView) {
        this.f128973d = gameDownloadView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        GameDownloadView gameDownloadView = this.f128973d;
        int i2 = GameDownloadView.f113844i;
        gameDownloadView.getClass();
        MMHandlerThread.postToMainThread(new C48114d0(gameDownloadView));
    }
}
