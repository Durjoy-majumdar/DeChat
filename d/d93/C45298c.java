package d93;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d93.C45300e;
import di3.C86312j;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import ob0.C47350c;
import p728vs.C52989c;
import qe3.C12212g;
import sf0.C48374j0;
import te3.C48763au1;
import te3.C48857bh2;
import te3.C48907bu1;
import te3.C50729ot1;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C51874wt1;
import te3.C52018xt1;
import te3.C52304zt1;
import zt3.C119157j;

/* renamed from: d93.c */
public class C45298c {

    /* renamed from: C */
    public static final Pattern f122680C = Pattern.compile(".*#.*wechat_redirect");

    /* renamed from: D */
    public static final C40324j.C40325b f122681D = new c$$c();

    /* renamed from: A */
    public final HashMap<String, String> f122682A = new HashMap<>();

    /* renamed from: B */
    public boolean f122683B = false;

    /* renamed from: a */
    public final HashSet<String> f122684a = new HashSet<>();

    /* renamed from: b */
    public int f122685b = 0;

    /* renamed from: c */
    public String f122686c = null;

    /* renamed from: d */
    public int f122687d = 0;

    /* renamed from: e */
    public String f122688e = "";

    /* renamed from: f */
    public String f122689f = "";

    /* renamed from: g */
    public String f122690g = "";

    /* renamed from: h */
    public byte[] f122691h = new byte[0];

    /* renamed from: i */
    public int f122692i = C12212g.m11775a();

    /* renamed from: j */
    public boolean f122693j = true;

    /* renamed from: k */
    public boolean f122694k = true;

    /* renamed from: l */
    public boolean f122695l = false;

    /* renamed from: m */
    public int f122696m = 0;

    /* renamed from: n */
    public boolean f122697n = false;

    /* renamed from: o */
    public String f122698o = null;

    /* renamed from: p */
    public C52018xt1 f122699p = null;

    /* renamed from: q */
    public C51874wt1 f122700q = null;

    /* renamed from: r */
    public String f122701r = null;

    /* renamed from: s */
    public C45300e f122702s = new C45300e((JsapiPermissionWrapper) null, (GeneralControlWrapper) null);

    /* renamed from: t */
    public String f122703t = "";

    /* renamed from: u */
    public String f122704u = "";

    /* renamed from: v */
    public C48763au1 f122705v = null;

    /* renamed from: w */
    public C50729ot1 f122706w = new C50729ot1();

    /* renamed from: x */
    public C52304zt1 f122707x = new C52304zt1();

    /* renamed from: y */
    public int f122708y;

    /* renamed from: z */
    public int f122709z;

    public C45298c() {
        this.f122706w.f139358d |= 2;
    }

    /* renamed from: a */
    public static void m50182a(C45298c cVar, String str, int i, int i2, int i3, String str2, C52018xt1 xt12, C45297a aVar) {
        C45298c cVar2 = cVar;
        String str3 = str;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C52018xt1 xt13 = xt12;
        C45297a aVar2 = aVar;
        if (!cVar2.f122697n) {
            boolean z = false;
            if (xt13 == null || aVar2 == null) {
                Object[] objArr = new Object[4];
                objArr[0] = Boolean.valueOf(xt13 == null);
                if (aVar2 == null) {
                    z = true;
                }
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = str3;
                objArr[3] = Integer.valueOf(i);
                Log.m105921e("MicroMsg.LuggageGetA8Key", "WebView-Trace onSceneEnd resp or cb not found(%b/%b), reqUrl: %s, reason: %d", objArr);
                if (aVar2 != null) {
                    aVar.mo63661A(i, str, i2, i3, Util.nullAsNil(str2));
                    aVar2.mo65765D(i4, str3);
                    return;
                }
                return;
            }
            Log.m105925i("MicroMsg.LuggageGetA8Key", "WebView-Trace onSceneEnd, reqUrl: %s, errType: %d, errCode: %d, reason: %d", str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i));
            String str4 = xt13.f144941d;
            cVar2.f122684a.remove(str4);
            String replaceAll = Util.nullAsNil(str4).trim().replaceAll(" ", "%20");
            xt13.f144941d = replaceAll;
            C51018qv3 qv32 = xt13.f144940E;
            if (qv32 != null && cVar2.f122694k && !cVar2.f122683B) {
                cVar2.f122683B = true;
                byte[] d = C48374j0.m53715d(qv32);
                if (!Util.isNullOrNil(d)) {
                    try {
                        cVar2.f122707x.parseFrom(d);
                        Log.m105925i("MicroMsg.LuggageGetA8Key", "updateGetA8KeySecurityBuffInfo ctrl mode=%d, preview=%d, text:%d, keyWordScanTime:%d", Integer.valueOf(cVar2.f122707x.f146213d), Integer.valueOf(cVar2.f122707x.f146214e), Integer.valueOf(cVar2.f122707x.f146215f), Integer.valueOf(cVar2.f122707x.f146218i));
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.LuggageGetA8Key", e, "parseFrom spamExtBuf ex", new Object[0]);
                    }
                } else {
                    Log.m105924i("MicroMsg.LuggageGetA8Key", "updateGetA8KeySecurityBuffInfo spamExtBuf is null");
                }
            }
            if (!Util.isNullOrNil(xt13.f144949o)) {
                synchronized (cVar2.f122682A) {
                    cVar2.f122682A.put(str3, xt13.f144949o);
                    cVar2.f122682A.put(replaceAll, xt13.f144949o);
                }
            }
            JsapiPermissionWrapper jsapiPermissionWrapper = new JsapiPermissionWrapper(C48374j0.m53715d(xt13.f144956v));
            GeneralControlWrapper generalControlWrapper = new GeneralControlWrapper(xt13.f144947j);
            if (!(i4 == 0 || i4 == 1 || i4 == 2)) {
                switch (i4) {
                    case 8:
                    case 9:
                    case 10:
                        break;
                }
            }
            if (!(i5 == 4 && i6 == -2005)) {
                cVar2.f122702s.mo70856c(str3, jsapiPermissionWrapper, generalControlWrapper);
            }
            cVar2.f122702s.mo70856c(replaceAll, jsapiPermissionWrapper, generalControlWrapper);
            cVar2.f122691h = C48374j0.m53715d(xt13.f144936A);
            aVar2.mo63682j(i4, str3, replaceAll, xt13);
            if (!aVar2.mo65766k(i4, str3, xt13)) {
                if (!(i5 == 0 && i6 == 0)) {
                    if (i5 == 4 && i6 == -2005) {
                        cVar.mo70850p(str, i, true, xt12, aVar);
                    } else {
                        if (i5 != 0 && i6 == -3300) {
                            z = true;
                        }
                        if (z) {
                            cVar2.f122695l = true;
                        } else {
                            aVar.mo63661A(i, str, i2, i3, Util.nullAsNil(str2));
                        }
                    }
                } else if (!(i4 == 5 || i4 == 1)) {
                    cVar.mo70850p(str, i, false, xt12, aVar);
                }
            }
            aVar2.mo65765D(i4, str3);
            ((C119157j) C119157j.f356862d).mo183895z(new c$$a(cVar2));
        }
    }

    /* renamed from: f */
    public static Map<String, String> m50183f(List<C48857bh2> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (C48857bh2 next : list) {
            hashMap.put(next.f131120d, next.f131121e);
        }
        return hashMap;
    }

    /* renamed from: b */
    public int mo70837b() {
        return this.f122709z;
    }

    /* renamed from: c */
    public final synchronized C47350c mo70838c(String str, int i) {
        C47350c cO;
        cO = ((C52989c) C86312j.m106911c(C52989c.class)).mo73576cO(str, i);
        C51874wt1 wt12 = (C51874wt1) cO.f127055a.f127080a;
        wt12.f144267d = 2;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        wt12.f144272i = rv32;
        wt12.f144275o = this.f122685b;
        wt12.f144276p = this.f122688e;
        wt12.f144259G = this.f122703t;
        wt12.f144260H = this.f122704u;
        wt12.f144279s = i;
        wt12.f144281u = this.f122687d;
        ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
        String str2 = "no";
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 1) {
                    str2 = "WIFI";
                } else if (activeNetworkInfo.getExtraInfo() != null) {
                    str2 = activeNetworkInfo.getExtraInfo().toLowerCase();
                }
            }
        }
        wt12.f144282v = str2;
        wt12.f144285y = this.f122692i;
        wt12.f144286z = this.f122690g;
        wt12.f144253A = this.f122696m;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = this.f122689f;
        rv33.f141176e = true;
        wt12.f144269f = rv33;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(this.f122691h);
        wt12.f144254B = qv32;
        wt12.f144262J = this.f122705v;
        wt12.f144263K = this.f122708y;
        wt12.f144264L = this.f122709z;
        wt12.f144266N = this.f122686c;
        if (5 == i) {
            wt12.f144255C = this.f122701r;
        } else {
            this.f122701r = null;
        }
        C50729ot1 ot12 = this.f122706w;
        if (ot12 != null) {
            try {
                wt12.f144265M = C48374j0.m53712a(ot12.toByteArray());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.LuggageGetA8Key", e, "GetA8KeyClientParam byteArrayToSKBuffer", new Object[0]);
            }
        }
        Log.m105925i("MicroMsg.LuggageGetA8Key", "ipcGetA8Key reqUrl = %s, username = %s, scene = %d, reason = %d, flag = %d, netType = %s, requestId = %d, appId = %s, functionId = %s, wallentRegion = %d, a8KeyCookie = %s,MsgUserName = %s, MsgID = %s, ContentType = %s, AppMsgInnerType = %s", str, this.f122688e, Integer.valueOf(this.f122685b), Integer.valueOf(i), Integer.valueOf(this.f122687d), wt12.f144282v, Integer.valueOf(this.f122692i), this.f122689f, this.f122690g, Integer.valueOf(this.f122696m), Util.encodeHexString(this.f122691h), this.f122703t, this.f122704u, Integer.valueOf(this.f122708y), Integer.valueOf(this.f122709z));
        return cO;
    }

    /* renamed from: d */
    public GeneralControlWrapper mo70839d(String str) {
        C45300e eVar = this.f122702s;
        if (eVar.f122725c != null) {
            Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", "getGenCtrl, return hardcodeGenCtrl = " + eVar.f122725c);
            return eVar.f122725c;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.LuggageGetA8KeyPermission", "getGenCtrl fail, url = " + str);
            return eVar.f122727e;
        } else {
            String a = eVar.mo70854a(str);
            C45300e.C45301a aVar = (C45300e.C45301a) ((HashMap) eVar.f122723a).get(a);
            StringBuilder sb = new StringBuilder();
            sb.append("edw getGenCtrl, genCtrl = ");
            sb.append(aVar == null ? null : aVar.f122729b);
            sb.append(", url = ");
            sb.append(a);
            Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", sb.toString());
            return aVar == null ? eVar.f122727e : aVar.f122729b;
        }
    }

    /* renamed from: e */
    public C48907bu1 mo70840e(String str) {
        C48907bu1 bu12 = new C48907bu1();
        bu12.f131306d = str;
        bu12.f131307e = this.f122685b;
        bu12.f131308f = this.f122692i;
        bu12.f131309g = this.f122708y;
        bu12.f131310h = this.f122709z;
        bu12.f131311i = this.f122704u;
        bu12.f131312j = this.f122703t;
        bu12.f131313n = this.f122688e;
        return bu12;
    }

    /* renamed from: g */
    public JsapiPermissionWrapper mo70841g(String str) {
        C45300e eVar = this.f122702s;
        if (eVar.f122724b != null) {
            Log.m105924i("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm, return hardcodeJsPerm = " + eVar.f122724b);
            return eVar.f122724b;
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm fail, url = " + str);
            return eVar.f122726d;
        } else {
            String a = eVar.mo70854a(str);
            Map<String, C45300e.C45301a> map = eVar.f122723a;
            if (map == null) {
                Log.m105920e("MicroMsg.LuggageGetA8KeyPermission", "getJsPerm fail, permMap is null");
                return eVar.f122726d;
            }
            C45300e.C45301a aVar = (C45300e.C45301a) ((HashMap) map).get(a);
            return aVar == null ? eVar.f122726d : aVar.f122728a;
        }
    }

    /* renamed from: h */
    public String mo70842h() {
        return this.f122704u;
    }

    /* renamed from: i */
    public int mo70843i() {
        return this.f122708y;
    }

    /* renamed from: j */
    public String mo70844j() {
        return this.f122703t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo70845k(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r7 = "MicroMsg.LuggageGetA8Key"
            java.lang.String r8 = "getReason fail, url is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)
            return r1
        L_0x000f:
            boolean r0 = r6.f122693j
            if (r0 == 0) goto L_0x0014
            return r1
        L_0x0014:
            java.util.regex.Pattern r0 = f122680C
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r0 = r0.find()
            if (r0 == 0) goto L_0x0022
            r7 = 2
            return r7
        L_0x0022:
            r0 = 1
            if (r8 != 0) goto L_0x006d
            java.util.LinkedList<java.lang.String> r8 = d93.C7254b.f25318a
            java.lang.String r8 = "url"
            gy3.C87412m.m108594g(r7, r8)
            java.util.LinkedList<java.lang.String> r8 = d93.C7254b.f25318a
            boolean r8 = r8.contains(r7)
            if (r8 == 0) goto L_0x0037
        L_0x0035:
            r1 = 1
            goto L_0x0068
        L_0x0037:
            rx3.g r8 = d93.C7254b.f25319b
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0045:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r2
            java.lang.String r4 = "MicroMsg.GetA8KeyReasonManager"
            java.lang.String r5 = "force geta8key path = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
            boolean r2 = p225rc.C12969d.m12408b(r7, r2, r1)
            if (r2 == 0) goto L_0x0045
            java.util.LinkedList<java.lang.String> r8 = d93.C7254b.f25318a
            r8.add(r7)
            goto L_0x0035
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r7 = 8
            return r7
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d93.C45298c.mo70845k(java.lang.String, boolean):int");
    }

    /* renamed from: l */
    public int mo70846l() {
        return this.f122685b;
    }

    /* renamed from: m */
    public int mo70847m() {
        return this.f122692i;
    }

    /* renamed from: n */
    public String mo70848n(String str) {
        String str2;
        synchronized (this.f122682A) {
            Log.m105925i("MicroMsg.LuggageGetA8Key", "getShareUrl, fullUrl = %s", str);
            for (String next : this.f122682A.keySet()) {
                Log.m105925i("MicroMsg.LuggageGetA8Key", "getShareUrl, Key = %s, value = %s", next, this.f122682A.get(next));
            }
            String str3 = this.f122682A.get(str);
            if (Util.isNullOrNil(str3)) {
                if (Util.isNullOrNil(str)) {
                    str2 = "";
                } else {
                    int indexOf = str.indexOf("#");
                    str2 = indexOf < 0 ? str : str.substring(0, indexOf);
                }
                String str4 = this.f122682A.get(str2);
                if (Util.isEqual(str4, str2)) {
                    return str;
                }
                str3 = str4;
            }
            String nullAs = Util.nullAs(str3, str);
            return nullAs;
        }
    }

    /* renamed from: o */
    public String mo70849o() {
        return this.f122688e;
    }

    /* renamed from: p */
    public final void mo70850p(String str, int i, boolean z, C52018xt1 xt12, C45297a<C52018xt1> aVar) {
        int i2 = xt12.f144943f;
        String str2 = xt12.f144945h;
        if (i2 != 1) {
            if (i2 == 2 || i2 == 6 || i2 == 7 || i2 == 30 || i2 == 44) {
                aVar.mo65767l(i, z, str, xt12.f144941d, xt12);
            }
        } else if (str2 == null || str2.length() == 0) {
            Log.m105920e("MicroMsg.LuggageGetA8Key", "getA8key-text fail, invalid content");
        } else {
            aVar.mo65768r(i, str, str2);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: q */
    public synchronized d93.c$$d mo70851q(java.lang.String r7, boolean r8, int r9, d93.C45297a<te3.C52018xt1> r10) {
        /*
            r6 = this;
            d93.c$$d r0 = d93.c$$d.NO_NEED
            d93.c$$d r1 = d93.c$$d.WILL_GET
            monitor-enter(r6)
            if (r8 != 0) goto L_0x0014
            java.util.HashSet<java.lang.String> r2 = r6.f122684a     // Catch:{ all -> 0x0011 }
            boolean r2 = r2.contains(r7)     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r6)
            return r1
        L_0x0011:
            r7 = move-exception
            goto L_0x00ac
        L_0x0014:
            if (r8 != 0) goto L_0x0020
            d93.e r2 = r6.f122702s     // Catch:{ all -> 0x0011 }
            boolean r2 = r2.mo70855b(r7)     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0020
            monitor-exit(r6)
            return r0
        L_0x0020:
            r2 = 5
            if (r9 != r2) goto L_0x0030
            boolean r2 = r6.f122695l     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0030
            java.lang.String r7 = "MicroMsg.LuggageGetA8Key"
            java.lang.String r8 = "disable iframe request"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r8)     // Catch:{ all -> 0x0011 }
            monitor-exit(r6)
            return r0
        L_0x0030:
            if (r8 != 0) goto L_0x003c
            java.util.HashSet<java.lang.String> r0 = r6.f122684a     // Catch:{ all -> 0x0011 }
            boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x003c
            monitor-exit(r6)
            return r1
        L_0x003c:
            java.util.HashSet<java.lang.String> r0 = r6.f122684a     // Catch:{ all -> 0x0011 }
            r0.add(r7)     // Catch:{ all -> 0x0011 }
            if (r10 == 0) goto L_0x0046
            r10.mo65764B(r9, r7)     // Catch:{ all -> 0x0011 }
        L_0x0046:
            r0 = -1
            r2 = 0
            if (r9 != r0) goto L_0x004e
            int r9 = r6.mo70845k(r7, r2)     // Catch:{ all -> 0x0011 }
        L_0x004e:
            boolean r0 = r6.f122693j     // Catch:{ all -> 0x0011 }
            r6.f122693j = r2     // Catch:{ all -> 0x0011 }
            java.lang.String r3 = "MicroMsg.LuggageGetA8Key"
            java.lang.String r4 = "WebView-Trace startGetA8Key, url: %s, force=%b"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0011 }
            r5[r2] = r7     // Catch:{ all -> 0x0011 }
            r2 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0011 }
            r5[r2] = r8     // Catch:{ all -> 0x0011 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x0088
            te3.xt1 r8 = r6.f122699p     // Catch:{ all -> 0x0011 }
            if (r8 == 0) goto L_0x0088
            java.lang.String r8 = r8.f144941d     // Catch:{ all -> 0x0011 }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0011 }
            if (r8 == 0) goto L_0x0088
            java.lang.String r7 = "MicroMsg.LuggageGetA8Key"
            java.lang.String r8 = "WebView-Trace Use Outer GetA8key Result"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x0011 }
            zt3.t r7 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0011 }
            d93.c$$b r8 = new d93.c$$b     // Catch:{ all -> 0x0011 }
            r8.<init>(r6, r9, r10)     // Catch:{ all -> 0x0011 }
            zt3.j r7 = (zt3.C119157j) r7     // Catch:{ all -> 0x0011 }
            r7.mo183875f(r8)     // Catch:{ all -> 0x0011 }
            monitor-exit(r6)
            return r1
        L_0x0088:
            monitor-enter(r6)     // Catch:{ all -> 0x0011 }
            d93.d r8 = new d93.d     // Catch:{ all -> 0x00a5 }
            r8.<init>(r6, r7, r9, r10)     // Catch:{ all -> 0x00a5 }
            monitor-enter(r6)     // Catch:{ all -> 0x00a5 }
            ob0.c r7 = r6.mo70838c(r7, r9)     // Catch:{ all -> 0x00a7 }
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r9 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ all -> 0x00a7 }
            com.tencent.mm.ipcinvoker.wx_extension.j r9 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r9     // Catch:{ all -> 0x00a7 }
            com.tencent.mm.ipcinvoker.wx_extension.j$b r10 = f122681D     // Catch:{ all -> 0x00a7 }
            r0 = 0
            r9.mo63015hC(r7, r10, r8, r0)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r6)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r6)     // Catch:{ all -> 0x0011 }
            monitor-exit(r6)
            return r1
        L_0x00a5:
            r7 = move-exception
            goto L_0x00aa
        L_0x00a7:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a5 }
            throw r7     // Catch:{ all -> 0x00a5 }
        L_0x00aa:
            monitor-exit(r6)     // Catch:{ all -> 0x0011 }
            throw r7     // Catch:{ all -> 0x0011 }
        L_0x00ac:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d93.C45298c.mo70851q(java.lang.String, boolean, int, d93.a):d93.c$$d");
    }
}
