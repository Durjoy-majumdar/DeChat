package ow1;

import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;

public final /* synthetic */ class q$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f294694d;

    public /* synthetic */ q$$c(String str) {
        this.f294694d = str;
    }

    public final void run() {
        String str = this.f294694d;
        int i = ImagePreviewUI.f271368h1;
        C86013q1.m106447h(str);
        Log.m105924i("MicroMsg.ImagePreviewUI", "[handlePhotoEditResult] VFSFileOp.deleteFile = " + str);
    }
}
