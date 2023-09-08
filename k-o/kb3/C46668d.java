package kb3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wepkg.model.C44500j;
import com.tencent.p014mm.plugin.wepkg.model.C44501k;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import j00.C46392g;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import js0.C88016e;
import pb3.C21964b;
import te3.C50667oe0;

/* renamed from: kb3.d */
public class C46668d {

    /* renamed from: a */
    public static final String f125638a = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.flk) + "/jsserver.js?wechat_pkgid=jscore_lib");

    /* renamed from: b */
    public static C46677m f125639b;

    /* renamed from: a */
    public static void m51977a(C46392g.C46393a aVar) {
        C44500j jVar;
        if (aVar != null) {
            C46677m mVar = new C46677m();
            f125639b = mVar;
            mVar.mo71927f(f125638a, true, false);
            C44501k kVar = f125639b.f125652e;
            String str = null;
            if (!(kVar == null || (jVar = kVar.f120698e) == null)) {
                if (Util.isNullOrNil((List) jVar.f120696f) || jVar.f120694d < 4) {
                    Log.m105920e("MicroMsg.Wepkg.WePkgReader", "getAllCode, mFileIndexList is null");
                } else {
                    StringBuilder sb = new StringBuilder();
                    Iterator<C50667oe0> it = jVar.f120696f.iterator();
                    while (it.hasNext()) {
                        C50667oe0 next = it.next();
                        if (!jVar.mo69283d(next.f139106g)) {
                            try {
                                String d = C88016e.m109547d(new C21964b(jVar.f120691a, ((long) jVar.f120694d) + next.f139104e, (long) next.f139105f));
                                if (d != null) {
                                    sb.append("\n");
                                    sb.append(d);
                                }
                            } catch (IOException e) {
                                Log.m105920e("MicroMsg.Wepkg.WePkgReader", "getAllCode: " + e.getMessage());
                            }
                        }
                    }
                    str = sb.toString();
                }
            }
            aVar.mo71798a(str);
        }
    }
}
