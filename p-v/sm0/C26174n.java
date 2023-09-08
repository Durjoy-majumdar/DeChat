package sm0;

import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tenpay.ndk.WxSmCryptoUtil;
import com.tenpay.tsm.TSMException;
import fl0.C86918c;
import fl0.C86920e;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import js0.C88016e;
import org.json.JSONException;
import p284zb.C91635f;
import p963fc.C86812g;
import rx3.C13604l;
import sm0.C26168h;
import sm0.C26170i;
import sm0.C26172j;
import sx3.C110823p;
import sx3.C36902a1;
import sx3.C36907w;
import sx3.C90364q0;
import z04.C39298f0;
import z04.C66713a;

/* renamed from: sm0.n */
public enum C26174n implements C90237a {
    ;
    

    /* renamed from: f */
    public static final C26181d f73116f = null;

    /* renamed from: d */
    public final C90247p f73118d;

    /* renamed from: e */
    public final String f73119e;

    /* renamed from: sm0.n$a */
    public static final class C26175a extends C26174n {
        public C26175a(String str, int i) {
            super(str, i, C90247p.SmStorage, "checkSm2PrivateKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm2PrivateKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                boolean D = bVar.mo53065D((String) t2);
                return new C90246m(C86920e.f252311a, C90364q0.m113148g(new C13604l("exist", Boolean.valueOf(D))));
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm2PrivateKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$a0 */
    public static final class C26176a0 extends C26174n {
        public C26176a0(String str, int i) {
            super(str, i, C90247p.Default, "sm3", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm3.operate");
            C26181d.C26182a d = C26181d.m33625d(C26174n.f73116f, lVar, StateEvent.Name.MESSAGE);
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm32 = WxSmCryptoUtil.getInstance().sm3((byte[]) t);
            if (sm32 == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm3.operate, digest is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("digest", C84782s1.m104464e(sm32)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$b */
    public static final class C26177b extends C26174n {
        public C26177b(String str, int i) {
            super(str, i, C90247p.SmStorage, "checkSm2PublicKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm2PublicKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                boolean U = bVar.mo53074U((String) t2);
                return new C90246m(C86920e.f252311a, C90364q0.m113148g(new C13604l("exist", Boolean.valueOf(U))));
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm2PublicKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$b0 */
    public static final class C26178b0 extends C26174n {
        public C26178b0(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm3Hmac", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm3Hmac.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, StateEvent.Name.MESSAGE);
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "key");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm3Hmac = WxSmCryptoUtil.getInstance().sm3Hmac(bArr, (byte[]) t2);
            if (sm3Hmac == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm3Hmac.operate, mac is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l(TPDownloadProxyEnum.USER_MAC, C84782s1.m104464e(sm3Hmac)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$c */
    public static final class C26179c extends C26174n {
        public C26179c(String str, int i) {
            super(str, i, C90247p.SmStorage, "checkSm4Key", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm4Key.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                boolean g2 = bVar.mo53078g((String) t2);
                return new C90246m(C86920e.f252311a, C90364q0.m113148g(new C13604l("exist", Boolean.valueOf(g2))));
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "CheckSm4Key.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$c0 */
    public static final class C26180c0 extends C26174n {
        public C26180c0(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm4CbcDecrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CbcDecrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "key");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] sm4CbcDecrypt = WxSmCryptoUtil.getInstance().sm4CbcDecrypt(bArr, bArr2, (byte[]) t3, lVar.f259056b.getBoolean("noPadding"));
                if (sm4CbcDecrypt == null) {
                    Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CbcDecrypt.operate, plaintext is null");
                    return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
                }
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(sm4CbcDecrypt)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
            } catch (JSONException unused) {
                return new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$d */
    public static final class C26181d {

        /* renamed from: sm0.n$d$a */
        public static abstract class C26182a {

            /* renamed from: sm0.n$d$a$a */
            public static final class C26183a extends C26182a {

                /* renamed from: a */
                public final C90246m f73120a;

                public C26183a(C90246m mVar) {
                    C87412m.m108594g(mVar, "operateResult");
                    this.f73120a = mVar;
                }
            }

            /* renamed from: sm0.n$d$a$b */
            public static final class C26184b<T> extends C26182a {

                /* renamed from: a */
                public final T f73121a;

                public C26184b(T t) {
                    this.f73121a = t;
                }
            }
        }

        public C26181d(C8480h hVar) {
        }

        /* renamed from: a */
        public static final byte[] m33622a(C26181d dVar, String str) {
            dVar.getClass();
            if (str.length() % 2 != 0) {
                return null;
            }
            C39298f0 f0Var = C39298f0.f105667d;
            C87412m.m108594g(f0Var, "transform");
            C36902a1.m41087a(2, 2);
            int length = str.length();
            int i = 0;
            ArrayList arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
            int i2 = 0;
            while (true) {
                if (!(i2 >= 0 && i2 < length)) {
                    break;
                }
                int i3 = i2 + 2;
                arrayList.add(f0Var.invoke(str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3)));
                i2 = i3;
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C66713a.m78712a(16);
                arrayList2.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), 16)));
            }
            byte[] bArr = new byte[arrayList2.size()];
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                bArr[i] = ((Number) it4.next()).byteValue();
                i++;
            }
            return bArr;
        }

        /* renamed from: b */
        public static final C26182a m33623b(C26181d dVar, C90245l lVar) {
            dVar.getClass();
            try {
                C86812g H0 = lVar.f259055a.getRuntime();
                if (H0 == null) {
                    Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "getSmStorage, runtime is null");
                    return new C26182a.C26183a(new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null));
                }
                C26165b a = C90248q.f259063a.mo124477a(H0);
                return a != null ? new C26182a.C26184b(a) : new C26182a.C26183a(new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null));
            } catch (TSMException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e, "getSmStorage failure", new Object[0]);
                return new C26182a.C26183a(dVar.mo53096h(e));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e2, "getSmStorage failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null));
            }
        }

        /* renamed from: c */
        public static final C26182a m33624c(C26181d dVar, C90245l lVar, String str) {
            C26168h hVar;
            dVar.getClass();
            try {
                C26168h.C26169a aVar = C26168h.f73102g;
                int i = lVar.f259056b.getInt(str);
                aVar.getClass();
                C26168h[] values = C26168h.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        hVar = null;
                        break;
                    }
                    hVar = values[i2];
                    if (hVar.f73104d == i) {
                        break;
                    }
                    i2++;
                }
                if (hVar != null) {
                    return new C26182a.C26184b(hVar);
                }
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "parseCipherMode, null");
                return new C26182a.C26183a(new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e, "parseCipherMode failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e2, "parseCipherMode failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null));
            }
        }

        /* renamed from: d */
        public static final C26182a m33625d(C26181d dVar, C90245l lVar, String str) {
            dVar.getClass();
            try {
                Object obj = lVar.f259056b.get(str);
                C87412m.m108592e(obj, "null cannot be cast to non-null type java.nio.ByteBuffer");
                return new C26182a.C26184b(C88016e.m109544a((ByteBuffer) obj));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e, "parseNativeBuffer failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e2, "parseNativeBuffer failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null));
            }
        }

        /* renamed from: e */
        public static final C26182a m33626e(C26181d dVar, C90245l lVar, String str) {
            C26172j jVar;
            dVar.getClass();
            try {
                C26172j.C26173a aVar = C26172j.f73111g;
                int i = lVar.f259056b.getInt(str);
                aVar.getClass();
                C26172j[] values = C26172j.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        jVar = null;
                        break;
                    }
                    jVar = values[i2];
                    if (jVar.f73113d == i) {
                        break;
                    }
                    i2++;
                }
                if (jVar != null) {
                    return new C26182a.C26184b(jVar);
                }
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "parseSignMode, null");
                return new C26182a.C26183a(new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e, "parseSignMode failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e2, "parseSignMode failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null));
            }
        }

        /* renamed from: f */
        public static final C26182a m33627f(C26181d dVar, C90245l lVar, String str) {
            C26170i iVar;
            dVar.getClass();
            try {
                C26170i.C26171a aVar = C26170i.f73107f;
                int i = lVar.f259056b.getInt(str);
                aVar.getClass();
                C26170i[] values = C26170i.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        iVar = null;
                        break;
                    }
                    iVar = values[i2];
                    if (iVar.f73109d == i) {
                        break;
                    }
                    i2++;
                }
                if (iVar != null) {
                    return new C26182a.C26184b(iVar);
                }
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "parseSm2KeyFormat, null");
                return new C26182a.C26183a(new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e, "parseSm2KeyFormat failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e2, "parseSm2KeyFormat failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null));
            }
        }

        /* renamed from: g */
        public static final C26182a m33628g(C26181d dVar, C90245l lVar, String str) {
            dVar.getClass();
            try {
                return new C26182a.C26184b(lVar.f259056b.getString(str));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e, "parseString failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.AppBrand.SmCryptoInvoker", e2, "parseString failure", new Object[0]);
                return new C26182a.C26183a(new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null));
            }
        }

        /* renamed from: h */
        public final C90246m mo53096h(TSMException tSMException) {
            return new C90246m(new C86918c(8, "fail:" + tSMException.errCode), (Map) null, 2, (C8480h) null);
        }
    }

    /* renamed from: sm0.n$d0 */
    public static final class C26185d0 extends C26174n {
        public C26185d0(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm4CbcEncrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CbcEncrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "key");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] sm4CbcEncrypt = WxSmCryptoUtil.getInstance().sm4CbcEncrypt(bArr, bArr2, (byte[]) t3, lVar.f259056b.getBoolean("noPadding"));
                if (sm4CbcEncrypt == null) {
                    Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CbcEncrypt.operate, ciphertext is null");
                    return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
                }
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(sm4CbcEncrypt)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
            } catch (JSONException unused) {
                return new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$e */
    public static final class C26186e extends C26174n {
        public C26186e(String str, int i) {
            super(str, i, C90247p.SmStorage, "deleteSm2PrivateKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm2PrivateKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53068G((String) t2);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm2PrivateKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$e0 */
    public static final class C26187e0 extends C26174n {
        public C26187e0(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm4CtrDecrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CtrDecrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "key");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm4CtrDecrypt = WxSmCryptoUtil.getInstance().sm4CtrDecrypt(bArr, bArr2, (byte[]) t3);
            if (sm4CtrDecrypt == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CtrDecrypt.operate, plaintext is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(sm4CtrDecrypt)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$f */
    public static final class C26188f extends C26174n {
        public C26188f(String str, int i) {
            super(str, i, C90247p.SmStorage, "deleteSm2PublicKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm2PublicKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53070K((String) t2);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm2PublicKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$f0 */
    public static final class C26189f0 extends C26174n {
        public C26189f0(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm4CtrEncrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CtrEncrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "key");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm4CtrEncrypt = WxSmCryptoUtil.getInstance().sm4CtrEncrypt(bArr, bArr2, (byte[]) t3);
            if (sm4CtrEncrypt == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4CtrEncrypt.operate, ciphertext is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(sm4CtrEncrypt)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$g */
    public static final class C26190g extends C26174n {
        public C26190g(String str, int i) {
            super(str, i, C90247p.SmStorage, "deleteSm4Key", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm4Key.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53067F((String) t2);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "DeleteSm4Key.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$g0 */
    public static final class C26191g0 extends C26174n {
        public C26191g0(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm4EcbDecrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4EcbDecrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] c = bVar.mo53076Y().mo53089c(str, (byte[]) t3);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(c)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4EcbDecrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$h */
    public static final class C26192h extends C26174n {
        public C26192h(String str, int i) {
            super(str, i, C90247p.SmStorage, "exportSm2PrivateKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm2PrivateKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a f = C26181d.m33627f(dVar, lVar, "sm2KeyFormat");
            if (!(f instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) f).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) f).f73121a;
            if (!(t3 instanceof C26170i)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                String[] E = bVar.mo53066E(str, ((C26170i) t3).f73110e);
                return new C90246m(C86920e.f252311a, C90364q0.m113148g(new C13604l("privateKey", E)));
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm2PrivateKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$h0 */
    public static final class C26193h0 extends C26174n {
        public C26193h0(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm4EcbEncrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4EcbEncrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] e = bVar.mo53076Y().mo53091e(str, (byte[]) t3);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(e)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e2) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4EcbEncrypt.operate, fail since " + e2);
                return new C90246m(new C86918c(8, "fail:" + e2.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$i */
    public static final class C26194i extends C26174n {
        public C26194i(String str, int i) {
            super(str, i, C90247p.SmStorage, "exportSm2PublicKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm2PublicKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a f = C26181d.m33627f(dVar, lVar, "sm2KeyFormat");
            if (!(f instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) f).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) f).f73121a;
            if (!(t3 instanceof C26170i)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                String N = bVar.mo53072N(str, ((C26170i) t3).f73110e);
                return new C90246m(C86920e.f252311a, C90364q0.m113148g(new C13604l("publicKey", N)));
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm2PublicKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$i0 */
    public static final class C26195i0 extends C26174n {
        public C26195i0(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm4GcmDecrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4GcmDecrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "tag");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "key");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr3 = (byte[]) t3;
            C26181d.C26182a d4 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d4 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d4).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d4).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr4 = (byte[]) t4;
            C26181d.C26182a d5 = C26181d.m33625d(dVar, lVar, "aad");
            if (!(d5 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d5).f73120a;
            }
            T t5 = ((C26181d.C26182a.C26184b) d5).f73121a;
            if (!(t5 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm4GcmDecrypt = WxSmCryptoUtil.getInstance().sm4GcmDecrypt(bArr, bArr2, bArr3, bArr4, (byte[]) t5);
            if (sm4GcmDecrypt == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4GcmDecrypt.operate, plaintext is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(sm4GcmDecrypt)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$j */
    public static final class C26196j extends C26174n {
        public C26196j(String str, int i) {
            super(str, i, C90247p.SmStorage, "exportSm4Key", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C90245l lVar2 = lVar;
            C87412m.m108594g(lVar2, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm4Key.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar2);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar2, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                String L = C110823p.m150986L(bVar.mo53071L((String) t2), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C48420o.f129601d, 30, (Object) null);
                return new C90246m(C86920e.f252311a, C90364q0.m113148g(new C13604l("key", L)));
            } catch (TSMException e) {
                TSMException tSMException = e;
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "ExportSm4Key.operate, fail since " + tSMException);
                return new C90246m(new C86918c(8, "fail:" + tSMException.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$j0 */
    public static final class C26197j0 extends C26174n {
        public C26197j0(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm4GcmEncrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            byte[] bArr;
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4GcmEncrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "key");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr3 = (byte[]) t2;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr4 = (byte[]) t3;
            C26181d.C26182a d4 = C26181d.m33625d(dVar, lVar, "aad");
            if (!(d4 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d4).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d4).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[][] sm4GcmEncrypt = WxSmCryptoUtil.getInstance().sm4GcmEncrypt(bArr2, bArr3, bArr4, (byte[]) t4);
            if (sm4GcmEncrypt == null || 2 > sm4GcmEncrypt.length || (bArr = sm4GcmEncrypt[0]) == null || sm4GcmEncrypt[1] == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm4GcmEncrypt.operate, encryptResult is illegal");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(bArr)), new C13604l("tag", C84782s1.m104464e(sm4GcmEncrypt[1])));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$k0 */
    public static final class C26198k0 extends C26174n {
        public C26198k0(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm4CbcDecrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CbcDecrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] f = bVar.mo53076Y().mo53092f(str, bArr, (byte[]) t4);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(f)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CbcDecrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$l */
    public static final class C26199l extends C26174n {
        public C26199l(String str, int i) {
            super(str, i, C90247p.SmStorage, "generateSm2KeyPair", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "GenerateSm2KeyPair.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53075X((String) t2);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "GenerateSm2KeyPair.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$l0 */
    public static final class C26200l0 extends C26174n {
        public C26200l0(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm4CbcEncrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CbcEncrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] h = bVar.mo53076Y().mo53094h(str, bArr, (byte[]) t4);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(h)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CbcEncrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$m */
    public static final class C26201m extends C26174n {
        public C26201m(String str, int i) {
            super(str, i, C90247p.SmStorage, "generateSm4Key", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "GenerateSm4Key.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53080p((String) t2);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "GenerateSm4Key.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$m0 */
    public static final class C26202m0 extends C26174n {
        public C26202m0(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm4CtrDecrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CtrDecrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] a = bVar.mo53076Y().mo53087a(str, bArr, (byte[]) t4);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(a)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CtrDecrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$n */
    public static final class C26203n extends C26174n {
        public C26203n(String str, int i) {
            super(str, i, C90247p.SmStorage, "importSm2PrivateKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm2PrivateKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a g2 = C26181d.m33628g(dVar, lVar, "privateKey");
            if (!(g2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g2).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) g2).f73121a;
            if (!(t3 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str2 = (String) t3;
            C26181d.C26182a f = C26181d.m33627f(dVar, lVar, "sm2KeyFormat");
            if (!(f instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) f).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) f).f73121a;
            if (!(t4 instanceof C26170i)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53069I(str, str2, ((C26170i) t4).f73110e);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm2PrivateKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$n0 */
    public static final class C26204n0 extends C26174n {
        public C26204n0(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm4CtrEncrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CtrEncrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] d3 = bVar.mo53076Y().mo53090d(str, bArr, (byte[]) t4);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(d3)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4CtrEncrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$o */
    public static final class C26205o extends C26174n {
        public C26205o(String str, int i) {
            super(str, i, C90247p.SmStorage, "importSm2PublicKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm2PublicKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a g2 = C26181d.m33628g(dVar, lVar, "publicKey");
            if (!(g2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g2).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) g2).f73121a;
            if (!(t3 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str2 = (String) t3;
            C26181d.C26182a f = C26181d.m33627f(dVar, lVar, "sm2KeyFormat");
            if (!(f instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) f).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) f).f73121a;
            if (!(t4 instanceof C26170i)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53073R(str, str2, ((C26170i) t4).f73110e);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm2PublicKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$o0 */
    public static final class C26206o0 extends C26174n {
        public C26206o0(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm4GcmDecrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4GcmDecrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "tag");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t4;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t5 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t5 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr3 = (byte[]) t5;
            C26181d.C26182a d4 = C26181d.m33625d(dVar, lVar, "aad");
            if (!(d4 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d4).f73120a;
            }
            T t6 = ((C26181d.C26182a.C26184b) d4).f73121a;
            if (!(t6 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] g2 = bVar.mo53076Y().mo53093g(str, bArr, bArr2, bArr3, (byte[]) t6);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g3 = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(g2)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g3, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g3) : new C90246m(cVar, g3);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4GcmDecrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$p */
    public static final class C26207p extends C26174n {
        public C26207p(String str, int i) {
            super(str, i, C90247p.SmStorage, "importSm4Key", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm4Key.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a g2 = C26181d.m33628g(dVar, lVar, "key");
            if (!(g2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g2).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) g2).f73121a;
            if (!(t3 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] a = C26181d.m33622a(dVar, (String) t3);
            if (a == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm4Key.operate, decode hexKey fail");
                return new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53079m(str, a);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "ImportSm4Key.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$p0 */
    public static final class C26208p0 extends C26174n {
        public C26208p0(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm4GcmEncrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4GcmEncrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "iv");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t4;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "aad");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t5 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t5 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[][] b2 = bVar.mo53076Y().mo53088b(str, bArr, bArr2, (byte[]) t5);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(b2[0])), new C13604l("tag", C84782s1.m104464e(b2[1])));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "SmStorageSm4GcmEncrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$q */
    public static final class C26209q extends C26174n {
        public C26209q(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm2Decrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Decrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a c = C26181d.m33624c(dVar, lVar, "cipherMode");
            if (!(c instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) c).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) c).f73121a;
            if (!(t4 instanceof C26168h)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] c2 = bVar.mo53077Z().mo53085c(str, bArr, ((C26168h) t4).f73106f);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(c2)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Decrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$q0 */
    public static final class C26210q0 extends C26174n {
        public C26210q0(String str, int i) {
            super(str, i, C90247p.SmStorage, "updateSm2PrivateKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm2PrivateKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a g2 = C26181d.m33628g(dVar, lVar, "privateKey");
            if (!(g2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g2).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) g2).f73121a;
            if (!(t3 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str2 = (String) t3;
            C26181d.C26182a f = C26181d.m33627f(dVar, lVar, "sm2KeyFormat");
            if (!(f instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) f).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) f).f73121a;
            if (!(t4 instanceof C26170i)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53064B(str, str2, ((C26170i) t4).f73110e);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm2PrivateKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$r */
    public static final class C26211r extends C26174n {
        public C26211r(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm2DecryptWithMode", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2DecryptWithMode.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "ciphertext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "privateKey");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a c = C26181d.m33624c(dVar, lVar, "cipherMode");
            if (!(c instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) c).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) c).f73121a;
            if (!(t3 instanceof C26168h)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm2DecryptWithMode = WxSmCryptoUtil.getInstance().sm2DecryptWithMode(bArr, bArr2, ((C26168h) t3).f73105e);
            if (sm2DecryptWithMode == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2DecryptWithMode.operate, plaintext is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("plaintext", C84782s1.m104464e(sm2DecryptWithMode)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$r0 */
    public static final class C26212r0 extends C26174n {
        public C26212r0(String str, int i) {
            super(str, i, C90247p.SmStorage, "updateSm2PublicKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm2PublicKey.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a g2 = C26181d.m33628g(dVar, lVar, "publicKey");
            if (!(g2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g2).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) g2).f73121a;
            if (!(t3 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str2 = (String) t3;
            C26181d.C26182a f = C26181d.m33627f(dVar, lVar, "sm2KeyFormat");
            if (!(f instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) f).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) f).f73121a;
            if (!(t4 instanceof C26170i)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53081r(str, str2, ((C26170i) t4).f73110e);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm2PublicKey.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$s */
    public static final class C26213s extends C26174n {
        public C26213s(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm2Encrypt", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Encrypt.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a c = C26181d.m33624c(dVar, lVar, "cipherMode");
            if (!(c instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) c).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) c).f73121a;
            if (!(t4 instanceof C26168h)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] d2 = bVar.mo53077Z().mo53086d(str, bArr, ((C26168h) t4).f73106f);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g2 = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(d2)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g2, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g2) : new C90246m(cVar, g2);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Encrypt.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$s0 */
    public static final class C26214s0 extends C26174n {
        public C26214s0(String str, int i) {
            super(str, i, C90247p.SmStorage, "updateSm4Key", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm4Key.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a g2 = C26181d.m33628g(dVar, lVar, "key");
            if (!(g2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g2).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) g2).f73121a;
            if (!(t3 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] a = C26181d.m33622a(dVar, (String) t3);
            if (a == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm4Key.operate, decode hexKey fail");
                return new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null);
            }
            try {
                bVar.mo53082z(str, a);
                return new C90246m(C86920e.f252311a, (Map) null, 2, (C8480h) null);
            } catch (TSMException e) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "UpdateSm4Key.operate, fail since " + e);
                return new C90246m(new C86918c(8, "fail:" + e.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$t */
    public static final class C26215t extends C26174n {
        public C26215t(String str, int i) {
            super(str, i, C90247p.Default, "sm2EncryptWithMode", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2EncryptWithMode.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, "plaintext");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "publicKey");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a c = C26181d.m33624c(dVar, lVar, "cipherMode");
            if (!(c instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) c).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) c).f73121a;
            if (!(t3 instanceof C26168h)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm2EncryptWithMode = WxSmCryptoUtil.getInstance().sm2EncryptWithMode(bArr, bArr2, ((C26168h) t3).f73105e);
            if (sm2EncryptWithMode == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2EncryptWithMode.operate, ciphertext is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("ciphertext", C84782s1.m104464e(sm2EncryptWithMode)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$v */
    public static final class C26216v extends C26174n {
        public C26216v(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm2GenPublicKey", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2GenPublicKey.operate");
            C26181d.C26182a d = C26181d.m33625d(C26174n.f73116f, lVar, "privateKey");
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm2GenPublicKey = WxSmCryptoUtil.getInstance().sm2GenPublicKey((byte[]) t);
            if (sm2GenPublicKey == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2GenPublicKey.operate, publicKey is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("publicKey", C84782s1.m104464e(sm2GenPublicKey)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$w */
    public static final class C26217w extends C26174n {
        public C26217w(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm2Sign", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Sign.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, StateEvent.Name.MESSAGE);
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a g2 = C26181d.m33628g(dVar, lVar, "id");
            if (!(g2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g2).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) g2).f73121a;
            if (!(t4 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str2 = (String) t4;
            C26181d.C26182a e = C26181d.m33626e(dVar, lVar, "signMode");
            if (!(e instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) e).f73120a;
            }
            T t5 = ((C26181d.C26182a.C26184b) e).f73121a;
            if (!(t5 instanceof C26172j)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                byte[] b2 = bVar.mo53077Z().mo53084b(str, bArr, str2, ((C26172j) t5).f73115f);
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g3 = C90364q0.m113148g(new C13604l("signed", C84782s1.m104464e(b2)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g3, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g3) : new C90246m(cVar, g3);
            } catch (TSMException e2) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Sign.operate, fail since " + e2);
                return new C90246m(new C86918c(8, "fail:" + e2.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$x */
    public static final class C26218x extends C26174n {
        public C26218x(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm2SignWithMode", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2SignWithMode.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, StateEvent.Name.MESSAGE);
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "uid");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "privateKey");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr3 = (byte[]) t3;
            C26181d.C26182a d4 = C26181d.m33625d(dVar, lVar, "publicKey");
            if (!(d4 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d4).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d4).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr4 = (byte[]) t4;
            C26181d.C26182a e = C26181d.m33626e(dVar, lVar, "signMode");
            if (!(e instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) e).f73120a;
            }
            T t5 = ((C26181d.C26182a.C26184b) e).f73121a;
            if (!(t5 instanceof C26172j)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] sm2SignWithMode = WxSmCryptoUtil.getInstance().sm2SignWithMode(bArr, bArr2, bArr3, bArr4, ((C26172j) t5).f73114e);
            if (sm2SignWithMode == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2SignWithMode.operate, signed is null");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("signed", C84782s1.m104464e(sm2SignWithMode)));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* renamed from: sm0.n$y */
    public static final class C26219y extends C26174n {
        public C26219y(String str, int i) {
            super(str, i, C90247p.SmStorage, "sm2Verify", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Verify.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a b = C26181d.m33623b(dVar, lVar);
            if (!(b instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) b).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) b).f73121a;
            if (!(t instanceof C26165b)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C26165b bVar = (C26165b) t;
            C26181d.C26182a g = C26181d.m33628g(dVar, lVar, "desc");
            if (!(g instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) g).f73121a;
            if (!(t2 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str = (String) t2;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, StateEvent.Name.MESSAGE);
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t3;
            C26181d.C26182a g2 = C26181d.m33628g(dVar, lVar, "id");
            if (!(g2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) g2).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) g2).f73121a;
            if (!(t4 instanceof String)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            String str2 = (String) t4;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "signed");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t5 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t5 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t5;
            C26181d.C26182a e = C26181d.m33626e(dVar, lVar, "signMode");
            if (!(e instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) e).f73120a;
            }
            T t6 = ((C26181d.C26182a.C26184b) e).f73121a;
            if (!(t6 instanceof C26172j)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            try {
                boolean a = bVar.mo53077Z().mo53083a(str, bArr, str2, bArr2, ((C26172j) t6).f73115f);
                return new C90246m(C86920e.f252311a, C90364q0.m113148g(new C13604l("success", Boolean.valueOf(a))));
            } catch (TSMException e2) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2Verify.operate, fail since " + e2);
                return new C90246m(new C86918c(8, "fail:" + e2.errCode), (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$z */
    public static final class C26220z extends C26174n {
        public C26220z(String str, int i) {
            super(str, i, C90247p.Default, "sm2VerifyWithMode", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2VerifyWithMode.operate");
            C26181d dVar = C26174n.f73116f;
            C26181d.C26182a d = C26181d.m33625d(dVar, lVar, StateEvent.Name.MESSAGE);
            if (!(d instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d).f73120a;
            }
            T t = ((C26181d.C26182a.C26184b) d).f73121a;
            if (!(t instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr = (byte[]) t;
            C26181d.C26182a d2 = C26181d.m33625d(dVar, lVar, "uid");
            if (!(d2 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d2).f73120a;
            }
            T t2 = ((C26181d.C26182a.C26184b) d2).f73121a;
            if (!(t2 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr2 = (byte[]) t2;
            C26181d.C26182a d3 = C26181d.m33625d(dVar, lVar, "signed");
            if (!(d3 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d3).f73120a;
            }
            T t3 = ((C26181d.C26182a.C26184b) d3).f73121a;
            if (!(t3 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr3 = (byte[]) t3;
            C26181d.C26182a d4 = C26181d.m33625d(dVar, lVar, "publicKey");
            if (!(d4 instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) d4).f73120a;
            }
            T t4 = ((C26181d.C26182a.C26184b) d4).f73121a;
            if (!(t4 instanceof byte[])) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            byte[] bArr4 = (byte[]) t4;
            C26181d.C26182a e = C26181d.m33626e(dVar, lVar, "signMode");
            if (!(e instanceof C26181d.C26182a.C26184b)) {
                return ((C26181d.C26182a.C26183a) e).f73120a;
            }
            T t5 = ((C26181d.C26182a.C26184b) e).f73121a;
            if (!(t5 instanceof C26172j)) {
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            boolean sm2VerifyWithMode = WxSmCryptoUtil.getInstance().sm2VerifyWithMode(bArr, bArr2, bArr3, bArr4, ((C26172j) t5).f73114e);
            Log.m105924i("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2VerifyWithMode.operate, success: " + sm2VerifyWithMode);
            return new C90246m(C86920e.f252311a, C90364q0.m113148g(new C13604l("success", Boolean.valueOf(sm2VerifyWithMode))));
        }
    }

    /* renamed from: sm0.n$k */
    public static final class C26221k extends C26174n {
        public C26221k(String str, int i) {
            super(str, i, C90247p.Default, "genRandomBytes", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "GenRandomBytes.operate");
            try {
                int i = lVar.f259056b.getInt("length");
                Log.m105924i("MicroMsg.AppBrand.SmCryptoInvoker", "GenRandomBytes.operate, len: " + i);
                byte[] randomBytes = WxSmCryptoUtil.getInstance().randomBytes(i);
                if (randomBytes == null) {
                    Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "GenRandomBytes.operate, randomBytes is null");
                    return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
                }
                C91635f fVar = lVar.f259055a;
                C86918c cVar = C86920e.f252311a;
                Map g = C90364q0.m113148g(new C13604l("randomBytes", C84782s1.m104464e(randomBytes)));
                C87412m.m108594g(fVar, "env");
                return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
            } catch (JSONException unused) {
                return new C90246m(C86920e.f252317g, (Map) null, 2, (C8480h) null);
            }
        }
    }

    /* renamed from: sm0.n$u */
    public static final class C26222u extends C26174n {
        public C26222u(String str, int i) {
            super(str, i, C90247p.Sensitive, "sm2GenKeyPair", (C8480h) null);
        }

        /* renamed from: a */
        public C90246m mo53095a(C90245l lVar) {
            byte[] bArr;
            C87412m.m108594g(lVar, "params");
            Log.m105918d("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2GenKeyPair.operate");
            byte[][] sm2GenKeyPair = WxSmCryptoUtil.getInstance().sm2GenKeyPair();
            if (sm2GenKeyPair == null || 2 > sm2GenKeyPair.length || (bArr = sm2GenKeyPair[0]) == null || sm2GenKeyPair[1] == null) {
                Log.m105920e("MicroMsg.AppBrand.SmCryptoInvoker", "Sm2GenKeyPair.operate, keyPair is illegal");
                return new C90246m(C86920e.f252314d, (Map) null, 2, (C8480h) null);
            }
            C91635f fVar = lVar.f259055a;
            C86918c cVar = C86920e.f252311a;
            Map g = C90364q0.m113148g(new C13604l("privateKey", C84782s1.m104464e(bArr)), new C13604l("publicKey", C84782s1.m104464e(sm2GenKeyPair[1])));
            C87412m.m108594g(fVar, "env");
            return C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT == C84782s1.m104463d(fVar.getJsRuntime(), g, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class)) ? new C90246m(new C86918c(2, "fail:convert native buffer parameter fail. native buffer exceed size limit."), g) : new C90246m(cVar, g);
        }
    }

    /* access modifiers changed from: public */
    static {
        f73116f = new C26181d((C8480h) null);
    }

    /* access modifiers changed from: public */
    C26174n(C90247p pVar, String str, C8480h hVar) {
        this.f73118d = pVar;
        this.f73119e = str;
    }
}
