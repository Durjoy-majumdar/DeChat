package r00;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.xwebutil.C19911o;
import com.tencent.p014mm.xwebutil.C19914p;
import com.tencent.p014mm.xwebutil.C86032n;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import ei3.C86522b;
import org.xwalk.core.XWalkEnvironment;
import s00.C90110f;

@C86522b
/* renamed from: r00.h */
public class C89857h extends C86301e implements C90110f {
    /* renamed from: ID */
    public void mo124149ID(String str) {
        C86032n.m106476b(str);
    }

    public boolean a60() {
        return XWebSdk.getAvailableVersion() > 0;
    }

    public void bg0(Intent intent) {
        C86032n.m106475a(intent);
    }

    /* renamed from: cj */
    public void mo124152cj() {
        C86032n.m106476b("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    }

    public void ie0() {
        C19911o.m21657b();
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C19911o.m21657b();
    }

    public void po0(WebView.WebViewKind webViewKind, WebView.PreInitCallback preInitCallback) {
        C19911o.m21657b();
        Context context = MMApplicationContext.getContext();
        String processName = MMApplicationContext.getProcessName();
        if (processName == null) {
            processName = "";
        } else if (processName.contains(XVFSFile.PATH_SEPARATOR)) {
            processName = processName.substring(processName.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1).toLowerCase();
            if (processName.startsWith(XWalkEnvironment.MODULE_APPBRAND)) {
                processName = XWalkEnvironment.MODULE_APPBRAND;
            }
        } else if (processName.contains(".")) {
            processName = processName.substring(processName.lastIndexOf(".") + 1).toLowerCase();
        }
        XWebSdk.initWebviewCore(context, webViewKind, processName, new C19914p(preInitCallback));
    }
}
