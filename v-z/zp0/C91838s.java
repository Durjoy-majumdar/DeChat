package zp0;

import android.util.SparseIntArray;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.soter.core.biometric.FaceManager;
import fk0.C86910b;
import java.util.Locale;
import junit.framework.Assert;
import lp3.C88629c;
import nr3.C89059e;
import nr3.C89060f;
import ob0.C47350c;
import p1070zf.C91675a;
import pe3.C47465a;
import ql0.C89703c;
import ug3.C90661f;
import wm0.C91035a;

/* renamed from: zp0.s */
public class C91838s implements C16377l {

    /* renamed from: d */
    public static final C91838s f262955d = new C91838s();

    /* renamed from: e */
    public static final boolean f262956e = (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger());

    /* renamed from: f */
    public static final C90661f f262957f = new C90661f("MicroMsg.WxaCgiServiceWC");

    /* renamed from: g */
    public static final C91839a f262958g;

    /* renamed from: zp0.s$a */
    public static final class C91839a extends SparseIntArray {
        public C91839a(C91835p pVar) {
        }

        /* renamed from: a */
        public int mo125666a(String str) {
            int i = get(str.hashCode(), -1);
            if (i == -1) {
                Assert.assertEquals(String.format(Locale.US, "Found invalid funcid, please register %s in this map.", new Object[]{str}), false, C91838s.f262956e);
            }
            return i;
        }
    }

    /* renamed from: zp0.s$b */
    public static final class C91840b implements C40324j.C40325b {
        public C91840b(C91835p pVar) {
        }

        /* renamed from: a */
        public C47350c mo63016a(C47350c cVar) {
            Log.m105925i("MicroMsg.WxaCgiServiceWC.IPCRunCgiMainProcessMonitor", "before run cgi, rr.url=%s, rr.cmdid=%d", cVar.f127057c, Integer.valueOf(cVar.f127058d));
            return cVar;
        }
    }

    static {
        C91839a aVar = new C91839a((C91835p) null);
        f262958g = aVar;
        aVar.put(-1327997639, 1714);
        aVar.put(-1275324719, 1192);
        aVar.put(933572841, 1345);
        aVar.put(863922063, FaceManager.FACE_ACQUIRED_UP);
        aVar.put(-2066070349, 1862);
        aVar.put(-1914617239, C91675a.CTRL_INDEX);
        aVar.put(-1866359436, C40475h.CTRL_INDEX);
        aVar.put(-1785304773, C86910b.CTRL_INDEX);
        aVar.put(1719564262, C89703c.CTRL_INDEX);
        aVar.put(1410133958, 1157);
        aVar.put(-1813933127, C91035a.CTRL_INDEX);
        aVar.put(1292008571, 2932);
        aVar.put(127341741, 2695);
        aVar.put(-150020997, 1024);
        aVar.put(-86607985, 2775);
        aVar.put(-94918271, 1010);
        aVar.put(-735781660, 2536);
        aVar.put(1292008571, 2932);
        aVar.put(127341741, 2695);
        aVar.put(-150020997, 1024);
        aVar.put(-86607985, 2775);
        aVar.put(-94918271, 1010);
        aVar.put(-735781660, 2536);
        aVar.put(865414636, 1133);
        aVar.put(1410133958, 1157);
        aVar.put(-1813933127, C91035a.CTRL_INDEX);
        aVar.put(-453030458, 1029);
        aVar.put(865464761, 1117);
        aVar.put(-306295037, 2920);
        aVar.put(930481433, 2946);
        aVar.put(-1772031937, 4428);
        aVar.put(-946646219, 1009);
        aVar.put(-917290477, 7056);
        aVar.put(1063353410, 2955);
    }

    /* renamed from: YQ */
    public C88629c mo14840YQ(String str, String str2, C47465a aVar, Class cls) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = f262958g.mo125666a(str);
        bVar.f127068c = str;
        bVar.f127066a = aVar;
        try {
            bVar.f127067b = (C47465a) cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            Log.m105921e("MicroMsg.WxaCgiServiceWC", "new Response failed %s", cls.getName());
            if (f262956e) {
                throw new RuntimeException(e);
            }
        }
        C89059e<Void> a = C89060f.m111322a();
        a.mo123424y(f262957f);
        a.mo123420E(new C91837r(this, bVar, str));
        return a;
    }
}
