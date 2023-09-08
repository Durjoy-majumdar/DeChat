package p656py;

import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.surface.magiclivecard.p950mb.C85486a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import dx2.C31343d;
import dx2.C86414f;
import ei3.C86522b;
import gy3.C87412m;
import h70.C8494c;
import ix2.C87827a;
import java.util.Map;
import k70.C88119c;
import nx2.C89096b;
import nx2.C89099c;
import p671qy.C89856e;
import zt3.C119157j;

@C86522b
/* renamed from: py.d */
public final class C89443d extends C86301e implements C89856e {

    /* renamed from: d */
    public final String f257492d = "MagicLiveCardDevToolsService";

    /* renamed from: Cw */
    public C86414f mo123764Cw(String str) {
        C40427l0 l0Var;
        String str2;
        String str3;
        C87412m.m108594g(str, "appId");
        C89096b bVar = C89096b.f256754a;
        C85486a aVar = C89096b.f256755b;
        String str4 = null;
        if (aVar == null || (l0Var = aVar.mo118858C0().mo123643f()) == null) {
            l0Var = null;
        }
        C86414f fVar = new C86414f();
        C87827a.C87828a aVar2 = C87827a.f254266a;
        fVar.f251196b = C86013q1.m106450k(aVar2.mo122281b(str));
        if (C86013q1.m106450k(C31343d.f83890a.mo58080e(str))) {
            fVar.f251197c = true;
        }
        if (!fVar.f251196b && !fVar.f251197c) {
            fVar.f251195a = aVar2.mo122280a(str);
        }
        String str5 = "";
        if (C87412m.m108589b(str, "wx2f3fb5db9f226462")) {
            C40427l0 Ba0 = ((C8494c) C86312j.m106911c(C8494c.class)).Ba0();
            if (fVar.f251196b || fVar.f251197c) {
                if (Ba0 != null) {
                    Map<String, Long> map = C81291m0.f238702a;
                    str4 = C86013q1.m106456q(Ba0.mo63190c());
                }
                if (str4 == null) {
                    str4 = str5;
                }
                fVar.f251195a = str4;
            }
            if (Ba0 != null) {
                str5 = C88119c.f254874a.mo122517d(Ba0);
            }
            fVar.f251198d = str5;
        } else if (C87412m.m108589b(str, "wxe208ce76dfa39515")) {
            if (fVar.f251196b || fVar.f251197c) {
                if (l0Var != null) {
                    Map<String, Long> map2 = C81291m0.f238702a;
                    str2 = C86013q1.m106456q(l0Var.mo63190c());
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str3 = aVar2.mo122280a(str);
                } else {
                    if (l0Var != null) {
                        Map<String, Long> map3 = C81291m0.f238702a;
                        str4 = C86013q1.m106456q(l0Var.mo63190c());
                    }
                    str3 = str4 == null ? str5 : str4;
                }
                fVar.f251195a = str3;
            }
            if (l0Var != null) {
                str5 = C88119c.f254874a.mo122516c(l0Var);
            }
            fVar.f251198d = str5;
        }
        Log.m105924i(this.f257492d, "wxaPkg pkgInfo:" + fVar);
        return fVar;
    }

    public String Ua0(String str) {
        C87412m.m108594g(str, "appId");
        return C87827a.f254266a.mo122281b(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0045, code lost:
        if (r4.equals("wxe208ce76dfa39515") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004f, code lost:
        if (r4.equals("wx9e221f7828fa7482") == false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String q50(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "appId"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154195C()
            r0.append(r1)
            java.lang.String r1 = "surface/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = "app/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            int r2 = r4.hashCode()
            switch(r2) {
                case -1811583232: goto L_0x0054;
                case -702916869: goto L_0x0048;
                case 190545547: goto L_0x003e;
                case 1502683169: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x005d
        L_0x0034:
            java.lang.String r1 = "wx4edd479d258d7f25"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x005f
            goto L_0x005d
        L_0x003e:
            java.lang.String r0 = "wxe208ce76dfa39515"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0052
            goto L_0x005d
        L_0x0048:
            java.lang.String r0 = "wx9e221f7828fa7482"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            r0 = r1
            goto L_0x005f
        L_0x0054:
            java.lang.String r1 = "wx2f3fb5db9f226462"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r0 = ""
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p656py.C89443d.q50(java.lang.String):java.lang.String");
    }

    public void zm0() {
        C89096b bVar = C89096b.f256754a;
        synchronized (bVar) {
            Log.m105924i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "forceCleanUp");
            if (C89096b.f256755b != null) {
                if (bVar.mo123437c()) {
                    ((C119157j) C119157j.f356862d).mo183895z(C89099c.f256761d);
                    return;
                }
            }
            Log.m105920e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "forceCleanUp not registered or not open");
        }
    }
}
