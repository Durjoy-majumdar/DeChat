package ow1;

import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

public final /* synthetic */ class q$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f294711d;

    public /* synthetic */ q$$h(String str) {
        this.f294711d = str;
    }

    public final void run() {
        String str = this.f294711d;
        int i = ImagePreviewUI.f271368h1;
        C86013q1.m106447h(str);
        Log.m105924i("MicroMsg.ImagePreviewUI", "[handleVideoEditResult] VFSFileOp.deleteFile = " + str);
    }
}
