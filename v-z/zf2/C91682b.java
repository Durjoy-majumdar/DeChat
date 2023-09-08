package zf2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.net.URI;
import java.net.URL;
import ke3.C88144b;

/* renamed from: zf2.b */
public class C91682b implements C80883e<Bundle, IPCLong> {
    public void invoke(Object obj, C1256g gVar) {
        C1256g gVar2 = gVar;
        Bundle bundle = (Bundle) obj;
        try {
            String string = bundle.getString("download_url", "");
            Log.m105925i("MicroMsg.DownloadMailApkTask", "download, url %s, md5 %s", string, bundle.getString("download_md5", ""));
            URL url = new URL(string);
            new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toURL();
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://wx.mail.qq.com/list/readtemplate?name=wxplugin_push.html");
            C88144b.m109791i(MMApplicationContext.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            gVar2.mo894a(new IPCLong(-1));
        } catch (Exception e) {
            gVar2.mo894a(new IPCLong(-1));
            Log.m105921e("MicroMsg.DownloadMailApkTask", "dz[download qq mail error:%s]", e.toString());
            Log.printErrStackTrace("MicroMsg.DownloadMailApkTask", e, "", new Object[0]);
        }
    }
}
