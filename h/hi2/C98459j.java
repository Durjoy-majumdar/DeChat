package hi2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import p159gw.C98250h;

/* renamed from: hi2.j */
public final class C98459j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f288789d;

    public C98459j(String str) {
        this.f288789d = str;
    }

    public final void run() {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        Log.m105924i("MicroMsg.MediaFileUtil", "handleMultiVideoResult videoState : " + g + ' ');
        if (g) {
            String exportImagePath = AndroidMediaUtil.getExportImagePath("jpg");
            Context context = MMApplicationContext.getContext();
            String str = this.f288789d;
            C87412m.m108591d(str);
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137343Ne(context, str, exportImagePath);
            AndroidMediaUtil.refreshMediaScanner(exportImagePath, MMApplicationContext.getContext());
        }
    }
}
