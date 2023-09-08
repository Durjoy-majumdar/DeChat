package ac3;

import a70.C112760b;
import android.content.res.AssetManager;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import p490dl.C97484a;
import p564iq.C87790d;
import p564iq.C98782c;
import q00.C12025f;
import rx3.C13598b0;
import rx3.C36570n;
import z04.C119027c;

/* renamed from: ac3.q0 */
public final class C91992q0 implements C12025f {

    /* renamed from: a */
    public static final C91992q0 f263331a;

    /* renamed from: b */
    public static final String f263332b;

    /* renamed from: c */
    public static final String f263333c = "Models";

    /* renamed from: d */
    public static final String f263334d;

    /* renamed from: e */
    public static final String f263335e;

    /* renamed from: f */
    public static final String f263336f = "Makeup";

    /* renamed from: g */
    public static final String f263337g;

    /* renamed from: h */
    public static final String f263338h = "LutFilters";

    /* renamed from: i */
    public static final String f263339i = "settings";

    /* renamed from: j */
    public static final String f263340j;

    /* renamed from: k */
    public static final String f263341k = "ImageLabel81V1.0.0.21.xnet";

    /* renamed from: l */
    public static C91996t0 f263342l = new C91996t0();

    /* renamed from: m */
    public static final C91996t0 f263343m;

    /* renamed from: n */
    public static final String f263344n;

    /* renamed from: ac3.q0$a */
    public static final class C91993a extends C87413o implements C32226l<C98782c, C13598b0> {

        /* renamed from: d */
        public static final C91993a f263345d = new C91993a();

        public C91993a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C98782c cVar = (C98782c) obj;
            C87412m.m108594g(cVar, "$this$request");
            cVar.mo118206b(C91991o0.f263330d);
            cVar.mo118205a(C27859p0.f76997d);
            return C13598b0.f38549a;
        }
    }

    static {
        C91992q0 q0Var = new C91992q0();
        f263331a = q0Var;
        String str = C112760b.m154231g() + "xlab";
        f263332b = str;
        String str2 = str + XVFSFile.SEPARATOR_CHAR + "Models";
        f263334d = str2;
        f263335e = str2 + "/temp";
        f263337g = str + XVFSFile.SEPARATOR_CHAR + "Makeup";
        f263340j = str + XVFSFile.SEPARATOR_CHAR + "settings";
        C91996t0 t0Var = new C91996t0();
        f263343m = t0Var;
        String str3 = "assets:///xlab/" + "Models";
        f263344n = str3;
        C97484a.f286123a.mo136755a(str3 + "/ModelListConfig.xml", t0Var);
        Log.m105924i("MicroMsg.WeVisFileUtil", "init assets config: " + t0Var.f263355c + ", " + t0Var.f263354b);
        if (!t0Var.mo125839h()) {
            Log.m105928w("MicroMsg.WeVisFileUtil", "assets list config is invalid");
        }
        q0Var.mo125828b();
        q0Var.mo125834h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00df  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo11889a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "key"
            gy3.C87412m.m108594g(r8, r0)
            ac3.u0 r0 = ac3.C27862u0.f77002a
            rx3.g r0 = ac3.C27862u0.f77003b
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 47
            r2 = 0
            if (r0 != 0) goto L_0x001d
            goto L_0x00db
        L_0x001d:
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            java.util.LinkedList<ac3.d1> r3 = ac3.C27862u0.f77004c
            monitor-enter(r3)
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x014f }
        L_0x0029:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x014f }
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x014f }
            r6 = r5
            ac3.d1 r6 = (ac3.C27848d1) r6     // Catch:{ all -> 0x014f }
            java.lang.String r6 = r6.f76974a     // Catch:{ all -> 0x014f }
            boolean r6 = gy3.C87412m.m108589b(r6, r8)     // Catch:{ all -> 0x014f }
            if (r6 == 0) goto L_0x0029
            goto L_0x0040
        L_0x003f:
            r5 = r2
        L_0x0040:
            r0.f27484d = r5     // Catch:{ all -> 0x014f }
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x014f }
            monitor-exit(r3)
            if (r5 == 0) goto L_0x00bf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = f263334d
            r3.append(r4)
            r3.append(r1)
            T r4 = r0.f27484d
            ac3.d1 r4 = (ac3.C27848d1) r4
            int r4 = r4.f76975b
            r3.append(r4)
            r4 = 46
            r3.append(r4)
            T r4 = r0.f27484d
            ac3.d1 r4 = (ac3.C27848d1) r4
            int r4 = r4.f76976c
            r3.append(r4)
            r3.append(r1)
            T r4 = r0.f27484d
            ac3.d1 r4 = (ac3.C27848d1) r4
            java.lang.String r4 = r4.f76978e
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r4 == 0) goto L_0x0099
            java.lang.String r0 = "MicroMsg.WeVisModelMgr"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "modelPathWithKey: from new "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            goto L_0x00dc
        L_0x0099:
            ac3.h1 r3 = ac3.C27855h1.f76992a
            r4 = 6
            T r0 = r0.f27484d
            ac3.d1 r0 = (ac3.C27848d1) r0
            int r5 = r0.f76975b
            int r0 = r0.f76976c
            r3.mo55643b(r4, r5, r0)
            java.lang.String r0 = "MicroMsg.WeVisModelMgr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "modelPathWithKey: file not exist "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
            goto L_0x00db
        L_0x00bf:
            java.lang.String r0 = "MicroMsg.WeVisModelMgr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "modelPathWithKey: not find config "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = ", use fallback"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
        L_0x00db:
            r3 = r2
        L_0x00dc:
            if (r3 == 0) goto L_0x00df
            return r3
        L_0x00df:
            ac3.t0 r0 = f263342l
            java.util.LinkedList<ac3.s0> r0 = r0.f263356d
            java.util.Iterator r0 = r0.iterator()
        L_0x00e7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00fd
            java.lang.Object r3 = r0.next()
            r4 = r3
            ac3.s0 r4 = (ac3.C91995s0) r4
            java.lang.String r4 = r4.f263347b
            boolean r4 = gy3.C87412m.m108589b(r4, r8)
            if (r4 == 0) goto L_0x00e7
            goto L_0x00fe
        L_0x00fd:
            r3 = r2
        L_0x00fe:
            ac3.s0 r3 = (ac3.C91995s0) r3
            if (r3 == 0) goto L_0x0137
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = f263334d
            r0.append(r4)
            r0.append(r1)
            java.lang.String r1 = r3.f263350e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x011f
            return r0
        L_0x011f:
            java.lang.String r0 = "MicroMsg.WeVisFileUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "modelPathWithKey: file not exist "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r8)
            goto L_0x014e
        L_0x0137:
            java.lang.String r0 = "MicroMsg.WeVisFileUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "modelPathWithKey: not find config "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r8)
        L_0x014e:
            return r2
        L_0x014f:
            r8 = move-exception
            monitor-exit(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C91992q0.mo11889a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final void mo125828b() {
        Class cls = C87790d.class;
        if (mo125831e()) {
            return;
        }
        if (!((C87790d) C86312j.m106911c(cls)).Jw0("xlab")) {
            AssetManager assets = MMApplicationContext.getContext().getAssets();
            C87412m.m108593f(assets, "getContext().assets");
            mo125833g(assets);
            return;
        }
        ((C87790d) C86312j.m106911c(cls)).mo122031GY(C91993a.f263345d);
        if (MMApplicationContext.isMainProcess()) {
            f263331a.getClass();
            C61926c.m72657B("XLabFileUtil_checkFile", true, C91994r0.f263346d);
        }
    }

    /* renamed from: c */
    public final boolean mo125829c(AssetManager assetManager, String str, String str2) {
        try {
            String[] list = assetManager.list(str);
            if (list == null) {
                return true;
            }
            if (list.length == 0) {
                String q = C86013q1.m106456q(ImageSource.ASSET_SCHEME + str);
                String q2 = C86013q1.m106456q(str2);
                if (C87412m.m108589b(q, q2)) {
                    return true;
                }
                Log.m105924i("MicroMsg.WeVisFileUtil", "checkFileMd5Match: " + str + " is " + q + "; " + str2 + " is " + q2);
                mo125832f(assetManager, str, str2);
                return false;
            }
            C86013q1.m106461v(str2);
            for (String str3 : list) {
                f263331a.mo125829c(assetManager, str + XVFSFile.SEPARATOR_CHAR + str3, str2 + XVFSFile.SEPARATOR_CHAR + str3);
            }
            return false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WeVisFileUtil", e, "checkFileMd5Match", new Object[0]);
        }
    }

    /* renamed from: d */
    public final boolean mo125830d(C91995s0 s0Var) {
        C87412m.m108594g(s0Var, "config");
        s0Var.f263349d = -1;
        s0Var.f263351f = "";
        StringBuilder sb = new StringBuilder();
        String str = f263334d;
        sb.append(str);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        sb.append(s0Var.mo125837h());
        String sb4 = sb.toString();
        if (!C86013q1.m106450k(sb4)) {
            Log.m105928w("MicroMsg.WeVisFileUtil", "checkModelFile: " + sb4 + " file not exists");
            return false;
        }
        C91995s0 s0Var2 = new C91995s0();
        C97484a.f286123a.mo136755a(sb4, s0Var2);
        if (s0Var.f263352g != s0Var2.f263349d) {
            C86013q1.m106447h(sb4);
            C86013q1.m106447h(str + XVFSFile.SEPARATOR_CHAR + s0Var.f263350e);
            Log.m105928w("MicroMsg.WeVisFileUtil", "checkModelFile: version error " + sb4 + ", " + s0Var2.f263349d);
            return false;
        }
        if (!C86013q1.m106450k(str + XVFSFile.SEPARATOR_CHAR + s0Var2.f263350e)) {
            Log.m105928w("MicroMsg.WeVisFileUtil", "checkModelFile: model file not exists " + s0Var2.f263350e);
            return false;
        }
        s0Var.f263349d = s0Var2.f263349d;
        String str2 = s0Var2.f263351f;
        C87412m.m108594g(str2, "<set-?>");
        s0Var.f263351f = str2;
        String str3 = s0Var2.f263350e;
        C87412m.m108594g(str3, "<set-?>");
        s0Var.f263350e = str3;
        return true;
    }

    /* renamed from: e */
    public final boolean mo125831e() {
        String str;
        String str2 = f263332b + "/version.txt";
        if (C86013q1.m106450k(str2)) {
            try {
                str = C86013q1.m106432N(str2);
            } catch (IOException unused) {
            }
            Log.m105924i("MicroMsg.WeVisFileUtil", "checkVersionMatch: " + str + ", " + "ae5f3ac59135c190e9793a79ffbe0efe");
            C87412m.m108593f(str, "localVersion");
            return C87412m.m108589b("ae5f3ac59135c190e9793a79ffbe0efe", str);
        }
        str = "";
        Log.m105924i("MicroMsg.WeVisFileUtil", "checkVersionMatch: " + str + ", " + "ae5f3ac59135c190e9793a79ffbe0efe");
        C87412m.m108593f(str, "localVersion");
        return C87412m.m108589b("ae5f3ac59135c190e9793a79ffbe0efe", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        cy3.C58003b.m67160a(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        cy3.C58003b.m67160a(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
        throw r13;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo125832f(android.content.res.AssetManager r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = "assets"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "assetsPath"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "localPath"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "copyAssets: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = "; "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WeVisFileUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            java.lang.String[] r2 = r11.list(r12)     // Catch:{ Exception -> 0x00a2 }
            if (r2 != 0) goto L_0x0036
            return
        L_0x0036:
            int r3 = r2.length     // Catch:{ Exception -> 0x00a2 }
            if (r3 != 0) goto L_0x003b
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x006b
            java.io.InputStream r11 = r11.open(r12)     // Catch:{ Exception -> 0x00a2 }
            java.io.OutputStream r12 = com.tencent.p014mm.vfs.C86013q1.m106429K(r13, r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r13 = "input"
            gy3.C87412m.m108593f(r11, r13)     // Catch:{ all -> 0x005d }
            java.lang.String r13 = "output"
            gy3.C87412m.m108593f(r12, r13)     // Catch:{ all -> 0x005d }
            r13 = 2
            r2 = 0
            cy3.C86147a.m106660b(r11, r12, r0, r13, r2)     // Catch:{ all -> 0x005d }
            cy3.C58003b.m67160a(r12, r2)     // Catch:{ all -> 0x0064 }
            cy3.C58003b.m67160a(r11, r2)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x005d:
            r13 = move-exception
            throw r13     // Catch:{ all -> 0x005f }
        L_0x005f:
            r2 = move-exception
            cy3.C58003b.m67160a(r12, r13)     // Catch:{ all -> 0x0064 }
            throw r2     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r13 = move-exception
            cy3.C58003b.m67160a(r11, r12)     // Catch:{ Exception -> 0x00a2 }
            throw r13     // Catch:{ Exception -> 0x00a2 }
        L_0x006b:
            com.tencent.p014mm.vfs.C86013q1.m106461v(r13)     // Catch:{ Exception -> 0x00a2 }
            int r3 = r2.length     // Catch:{ Exception -> 0x00a2 }
            r4 = 0
        L_0x0070:
            if (r4 >= r3) goto L_0x00aa
            r5 = r2[r4]     // Catch:{ Exception -> 0x00a2 }
            ac3.q0 r6 = f263331a     // Catch:{ Exception -> 0x00a2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a2 }
            r7.<init>()     // Catch:{ Exception -> 0x00a2 }
            r7.append(r12)     // Catch:{ Exception -> 0x00a2 }
            r8 = 47
            r7.append(r8)     // Catch:{ Exception -> 0x00a2 }
            r7.append(r5)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00a2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a2 }
            r9.<init>()     // Catch:{ Exception -> 0x00a2 }
            r9.append(r13)     // Catch:{ Exception -> 0x00a2 }
            r9.append(r8)     // Catch:{ Exception -> 0x00a2 }
            r9.append(r5)     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x00a2 }
            r6.mo125832f(r11, r7, r5)     // Catch:{ Exception -> 0x00a2 }
            int r4 = r4 + 1
            goto L_0x0070
        L_0x00a2:
            r11 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r0]
            java.lang.String r13 = "copyAssets"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r11, r13, r12)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C91992q0.mo125832f(android.content.res.AssetManager, java.lang.String, java.lang.String):void");
    }

    /* renamed from: g */
    public final void mo125833g(AssetManager assetManager) {
        C87412m.m108594g(assetManager, TPMediaCompositionHelper.XML_TAG_ASSERT);
        StringBuilder sb = new StringBuilder();
        sb.append("xlab/");
        String str = f263336f;
        sb.append(str);
        String sb4 = sb.toString();
        StringBuilder sb5 = new StringBuilder();
        String str2 = f263332b;
        sb5.append(str2);
        sb5.append(XVFSFile.SEPARATOR_CHAR);
        sb5.append(str);
        mo125832f(assetManager, sb4, sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("xlab/");
        String str3 = f263338h;
        sb6.append(str3);
        String sb7 = sb6.toString();
        mo125832f(assetManager, sb7, str2 + XVFSFile.SEPARATOR_CHAR + str3);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("xlab/");
        String str4 = f263339i;
        sb8.append(str4);
        String sb9 = sb8.toString();
        mo125832f(assetManager, sb9, str2 + XVFSFile.SEPARATOR_CHAR + str4);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(str2);
        sb10.append("/version.txt");
        String sb11 = sb10.toString();
        byte[] bytes = "ae5f3ac59135c190e9793a79ffbe0efe".getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        C86013q1.m106438T(sb11, bytes, 0, bytes.length);
    }

    /* renamed from: h */
    public final void mo125834h() {
        C86013q1.m106461v(f263334d);
        C91996t0 t0Var = f263343m;
        if (t0Var.mo125839h()) {
            for (C91995s0 s0Var : t0Var.f263356d) {
                String str = s0Var.f263351f;
                C87412m.m108594g(str, "<set-?>");
                s0Var.f263353h = str;
                s0Var.f263352g = s0Var.f263349d;
                C91992q0 q0Var = f263331a;
                if (!q0Var.mo125830d(s0Var)) {
                    StringBuilder sb = new StringBuilder();
                    String str2 = f263344n;
                    sb.append(str2);
                    sb.append(XVFSFile.SEPARATOR_CHAR);
                    sb.append(s0Var.mo125837h());
                    if (C86013q1.m106450k(sb.toString())) {
                        C91995s0 s0Var2 = new C91995s0();
                        C97484a.f286123a.mo136755a(str2 + XVFSFile.SEPARATOR_CHAR + s0Var.mo125837h(), s0Var2);
                        Log.m105924i("MicroMsg.WeVisFileUtil", "copyModelFileFromAssets: " + s0Var2.f263349d + ", " + s0Var.f263352g);
                        if (s0Var2.f263349d == s0Var.f263352g) {
                            AssetManager assets = MMApplicationContext.getContext().getAssets();
                            StringBuilder sb4 = new StringBuilder();
                            String str3 = f263334d;
                            sb4.append(str3);
                            sb4.append(XVFSFile.SEPARATOR_CHAR);
                            sb4.append(s0Var.mo125837h());
                            C86013q1.m106442c(str2 + XVFSFile.SEPARATOR_CHAR + s0Var.mo125837h(), sb4.toString());
                            C87412m.m108593f(assets, TPMediaCompositionHelper.XML_TAG_ASSERT);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("xlab/");
                            String str4 = f263333c;
                            sb5.append(str4);
                            sb5.append(XVFSFile.SEPARATOR_CHAR);
                            sb5.append(s0Var.mo125837h());
                            q0Var.mo125829c(assets, sb5.toString(), str3 + XVFSFile.SEPARATOR_CHAR + s0Var.mo125837h());
                            C86013q1.m106442c(str2 + XVFSFile.SEPARATOR_CHAR + s0Var.f263350e, str3 + XVFSFile.SEPARATOR_CHAR + s0Var.f263350e);
                            q0Var.mo125829c(assets, "xlab/" + str4 + XVFSFile.SEPARATOR_CHAR + s0Var.f263350e, str3 + XVFSFile.SEPARATOR_CHAR + s0Var.f263350e);
                        }
                    }
                    q0Var.mo125830d(s0Var);
                }
            }
            f263342l = t0Var;
        }
    }

    /* renamed from: i */
    public final String mo125835i(String str) {
        String str2;
        T t;
        T t2;
        C87412m.m108594g(str, "key");
        C27862u0 u0Var = C27862u0.f77002a;
        LinkedList<C27848d1> linkedList = C27862u0.f77004c;
        synchronized (linkedList) {
            if (!((Boolean) ((C36570n) C27862u0.f77003b).getValue()).booleanValue()) {
                str2 = null;
            } else {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    if (C87412m.m108589b(((C27848d1) t2).f76974a, str)) {
                        break;
                    }
                }
                C27848d1 d1Var = (C27848d1) t2;
                str2 = d1Var != null ? d1Var.f76977d : null;
            }
        }
        if (str2 != null) {
            return str2;
        }
        Iterator<T> it4 = f263342l.f263356d.iterator();
        while (true) {
            if (!it4.hasNext()) {
                t = null;
                break;
            }
            t = it4.next();
            if (C87412m.m108589b(((C91995s0) t).f263347b, str)) {
                break;
            }
        }
        C91995s0 s0Var = (C91995s0) t;
        if (s0Var != null) {
            return s0Var.f263351f;
        }
        return null;
    }
}
