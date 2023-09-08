package xz2;

import android.util.Base64;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.HashMap;
import java.util.List;
import kr0.C76629w0;
import org.json.JSONObject;
import rx3.C13598b0;
import uz2.C52686h1;
import uz2.C65488a0;
import uz2.C65491m1;

/* renamed from: xz2.a */
public final class C66450a {

    /* renamed from: a */
    public static final C66450a f191209a = new C66450a();

    /* renamed from: b */
    public static final HashMap<String, C66453b> f191210b;

    /* renamed from: xz2.a$a */
    public static final class C66451a implements C66453b {

        /* renamed from: a */
        public static final C66451a f191211a = new C66451a();

        /* renamed from: xz2.a$a$a */
        public static final class C66452a implements C60200t1.C60202b {

            /* renamed from: a */
            public final /* synthetic */ long f191212a;

            /* renamed from: b */
            public final /* synthetic */ String f191213b;

            /* renamed from: c */
            public final /* synthetic */ C32224a<C13598b0> f191214c;

            /* renamed from: d */
            public final /* synthetic */ C65488a0 f191215d;

            public C66452a(long j, String str, C32224a<C13598b0> aVar, C65488a0 a0Var) {
                this.f191212a = j;
                this.f191213b = str;
                this.f191214c = aVar;
                this.f191215d = a0Var;
            }

            /* renamed from: a */
            public final void mo75691a(Object obj, int i, int i2) {
                Log.m105924i("MicroMsg.TextStatus.ExtJumpInfoHandler", "[CgiGetFinderFeed] errType=" + i + " errCode=" + i2 + " feed_id=" + this.f191212a + " nonce_id:" + this.f191213b);
                if (i == 0 && i2 == 0) {
                    FinderObject finderObject = obj instanceof FinderObject ? (FinderObject) obj : null;
                    if (finderObject != null) {
                        C65488a0 a0Var = this.f191215d;
                        byte[] byteArray = finderObject.toByteArray();
                        a0Var.f188441f = Base64.encodeToString(byteArray, 0, byteArray.length, 0);
                    }
                }
                this.f191214c.invoke();
            }
        }

        /* renamed from: a */
        public void mo90544a(C65488a0 a0Var, C32224a<C13598b0> aVar) {
            C87412m.m108594g(a0Var, "reqInfo");
            C87412m.m108594g(aVar, "callback");
            byte[] decode = Base64.decode(a0Var.f188442g, 0);
            C52686h1 h1Var = new C52686h1();
            h1Var.parseFrom(decode);
            long j = h1Var.f147133d;
            long j2 = j;
            String str = h1Var.f147134e;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76777Li(j2, str, 106, true, false, "", new C66452a(j2, str, aVar, a0Var));
        }
    }

    /* renamed from: xz2.a$b */
    public interface C66453b {
        /* renamed from: a */
        void mo90544a(C65488a0 a0Var, C32224a<C13598b0> aVar);
    }

    /* renamed from: xz2.a$c */
    public static final class C66454c implements C66453b {

        /* renamed from: a */
        public static final C66454c f191216a = new C66454c();

        /* renamed from: xz2.a$c$a */
        public static final class C66455a implements C76629w0.C61144a {

            /* renamed from: a */
            public final /* synthetic */ String f191217a;

            /* renamed from: b */
            public final /* synthetic */ C65491m1 f191218b;

            /* renamed from: c */
            public final /* synthetic */ C65488a0 f191219c;

            /* renamed from: d */
            public final /* synthetic */ C32224a<C13598b0> f191220d;

            public C66455a(String str, C65491m1 m1Var, C65488a0 a0Var, C32224a<C13598b0> aVar) {
                this.f191217a = str;
                this.f191218b = m1Var;
                this.f191219c = a0Var;
                this.f191220d = aVar;
            }

            /* renamed from: a */
            public void mo21208a(WxaAttributes wxaAttributes) {
                Log.m105924i("MicroMsg.TextStatus.ExtJumpInfoHandler", "onGetWeAppInfo() called with: info = " + wxaAttributes);
                if (wxaAttributes != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("username", this.f191217a);
                    jSONObject.put("path", this.f191218b.f188450e);
                    WxaAttributes.WxaVersionInfo o2 = wxaAttributes.mo113942o2();
                    jSONObject.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, o2 != null ? o2.f239452d : 0);
                    jSONObject.put("versionType", this.f191218b.f188452g);
                    String str = wxaAttributes.field_smallHeadURL;
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("headImageURL", str);
                    this.f191219c.f188441f = jSONObject.toString();
                }
                this.f191220d.invoke();
            }
        }

        /* renamed from: a */
        public void mo90544a(C65488a0 a0Var, C32224a<C13598b0> aVar) {
            C87412m.m108594g(a0Var, "reqInfo");
            C87412m.m108594g(aVar, "callback");
            byte[] decode = Base64.decode(a0Var.f188442g, 0);
            C65491m1 m1Var = new C65491m1();
            m1Var.parseFrom(decode);
            String str = m1Var.f188451f;
            ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106878CE(str, new C66455a(str, m1Var, a0Var, aVar));
        }
    }

    /* renamed from: xz2.a$d */
    public static final class C66456d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C65488a0> f191221d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f191222e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66456d(List<C65488a0> list, C32224a<C13598b0> aVar) {
            super(0);
            this.f191221d = list;
            this.f191222e = aVar;
        }

        public Object invoke() {
            C66450a.f191209a.mo90543a(this.f191221d, this.f191222e);
            return C13598b0.f38549a;
        }
    }

    static {
        HashMap<String, C66453b> hashMap = new HashMap<>();
        hashMap.put(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, C66451a.f191211a);
        hashMap.put("7", C66454c.f191216a);
        f191210b = hashMap;
    }

    /* renamed from: a */
    public final void mo90543a(List<C65488a0> list, C32224a<C13598b0> aVar) {
        C87412m.m108594g(list, "reqInfos");
        C87412m.m108594g(aVar, "callback");
        if (list.isEmpty()) {
            aVar.invoke();
            return;
        }
        try {
            C65488a0 remove = list.remove(0);
            C66453b bVar = f191210b.get(remove.f188439d);
            if (bVar != null) {
                bVar.mo90544a(remove, new C66456d(list, aVar));
            } else {
                mo90543a(list, aVar);
            }
        } catch (Throwable unused) {
            mo90543a(list, aVar);
        }
    }
}
