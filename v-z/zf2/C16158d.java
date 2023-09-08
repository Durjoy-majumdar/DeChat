package zf2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import di3.C86312j;
import p237sp.C13754y;

/* renamed from: zf2.d */
public class C16158d implements C80883e<IPCLong, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        FileDownloadTaskInfo n = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63966n(((IPCLong) obj).f10314d);
        Bundle bundle = new Bundle();
        bundle.putInt("download_status", n.f12196f);
        bundle.putFloat("download_progress", (((float) n.f12200j) * 1.0f) / ((float) n.f12201n));
        bundle.putString("download_apk_path", n.f12197g);
        gVar.mo894a(bundle);
    }
}
