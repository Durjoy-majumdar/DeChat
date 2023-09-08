package k11;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.net.URL;
import m83.C10770c;
import m83.C10771d;

public final /* synthetic */ class x$$f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanNewUI f29776d;

    public /* synthetic */ x$$f(CleanNewUI cleanNewUI) {
        this.f29776d = cleanNewUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CleanNewUI cleanNewUI = this.f29776d;
        String str = CleanNewUI.f267927I;
        cleanNewUI.getClass();
        try {
            Log.m105925i("MicroMsg.CleanNewUI", "download url:%s, md5:%s", new URL(cleanNewUI.f267935H.getString("url")), cleanNewUI.f267935H.getString("md5"));
            C10770c cVar = new C10770c(cleanNewUI);
            cVar.f32244b = "mmdownloadapp_HMNgrd6q8lVpXoJy7Y";
            ((C10771d) C86312j.m106911c(C10771d.class)).mo10782yz(cVar, new C9554y(cleanNewUI));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CleanNewUI", e, "", new Object[0]);
        }
        C115669n.INSTANCE.idkeyStat(714, 4, 1, false);
    }
}
