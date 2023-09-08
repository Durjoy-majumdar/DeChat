package yq1;

import gy3.C87412m;
import xq1.C66408e;
import xq1.C66412i;
import xq1.C66413j;

/* renamed from: yq1.a */
public final class C66692a extends C66413j {

    /* renamed from: e */
    public final String f191731e = "LogPost.PostFileClearStage";

    /* renamed from: yq1.a$a */
    public static final class C66693a extends C66412i {
        public C66693a(String str) {
            super(str);
        }

        /* renamed from: a */
        public int mo75100a() {
            return 100;
        }

        /* renamed from: c */
        public void mo75101c() {
        }
    }

    public C66692a() {
        super("PostFileClearStage");
    }

    /* renamed from: a */
    public int mo75100a() {
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xq1.C66408e mo90273c() {
        /*
            r11 = this;
            java.lang.String r0 = r11.f191731e
            java.lang.String r1 = "PostFileClearStage exec"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            uq1.e r0 = uq1.C65433e.f188292a
            long r0 = eb0.C31543z5.m39451a()
            long r2 = uq1.C65433e.f188294c
            long r0 = r0 - r2
            up1.f r2 = up1.C37521f.f99374d
            long r2 = r2.mo61186l()
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 != 0) goto L_0x0031
            re1.a r0 = up1.C37521f.f99316W1
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0031
            goto L_0x011c
        L_0x0031:
            java.lang.String r0 = "finder.FinderPostFileManager"
            java.lang.String r1 = "FinderFileTrack checkPostingFolder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            long r1 = eb0.C31543z5.m39451a()
            uq1.C65433e.f188294c = r1
            java.lang.String r1 = er1.C58741j5.f168196m     // Catch:{ all -> 0x0114 }
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0114 }
            r2.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.Iterable r3 = com.tencent.p014mm.vfs.C86013q1.m106459t(r1, r5)     // Catch:{ all -> 0x0114 }
            if (r3 == 0) goto L_0x007b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0114 }
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r3, r7)     // Catch:{ all -> 0x0114 }
            r6.<init>(r7)     // Catch:{ all -> 0x0114 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0114 }
        L_0x005a:
            boolean r7 = r3.hasNext()     // Catch:{ all -> 0x0114 }
            if (r7 == 0) goto L_0x007c
            java.lang.Object r7 = r3.next()     // Catch:{ all -> 0x0114 }
            com.tencent.mm.vfs.b0 r7 = (com.tencent.p014mm.vfs.C86001b0) r7     // Catch:{ all -> 0x0114 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r8.<init>()     // Catch:{ all -> 0x0114 }
            r8.append(r1)     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = r7.f250472b     // Catch:{ all -> 0x0114 }
            r8.append(r7)     // Catch:{ all -> 0x0114 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0114 }
            r6.add(r7)     // Catch:{ all -> 0x0114 }
            goto L_0x005a
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            sx3.f0 r6 = sx3.C64186f0.f181907d     // Catch:{ all -> 0x0114 }
        L_0x0081:
            r2.addAll(r6)     // Catch:{ all -> 0x0114 }
            java.util.List<uq1.e$a> r1 = uq1.C65433e.f188295d     // Catch:{ all -> 0x0114 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0114 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0114 }
        L_0x008c:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0114 }
            if (r3 == 0) goto L_0x00fe
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0114 }
            uq1.e$a r3 = (uq1.C65433e.C65434a) r3     // Catch:{ all -> 0x0114 }
            java.util.List r6 = r3.mo89560a()     // Catch:{ all -> 0x0114 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0114 }
            r7.<init>()     // Catch:{ all -> 0x0114 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0114 }
        L_0x00a5:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0114 }
            if (r8 == 0) goto L_0x00c5
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0114 }
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0114 }
            if (r9 == 0) goto L_0x00be
            java.lang.String r10 = ""
            boolean r9 = gy3.C87412m.m108589b(r9, r10)     // Catch:{ all -> 0x0114 }
            if (r9 != 0) goto L_0x00be
            r9 = 1
            goto L_0x00bf
        L_0x00be:
            r9 = 0
        L_0x00bf:
            if (r9 == 0) goto L_0x00a5
            r7.add(r8)     // Catch:{ all -> 0x0114 }
            goto L_0x00a5
        L_0x00c5:
            java.util.Iterator r6 = r7.iterator()     // Catch:{ all -> 0x0114 }
        L_0x00c9:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0114 }
            if (r8 == 0) goto L_0x00f6
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0114 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0114 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r9.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = "ownership, "
            r9.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = r3.name()     // Catch:{ all -> 0x0114 }
            r9.append(r10)     // Catch:{ all -> 0x0114 }
            java.lang.String r10 = " owns:"
            r9.append(r10)     // Catch:{ all -> 0x0114 }
            r9.append(r8)     // Catch:{ all -> 0x0114 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0114 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)     // Catch:{ all -> 0x0114 }
            goto L_0x00c9
        L_0x00f6:
            java.util.Collection r3 = gy3.C24564k0.m30737a(r2)     // Catch:{ all -> 0x0114 }
            r3.removeAll(r7)     // Catch:{ all -> 0x0114 }
            goto L_0x008c
        L_0x00fe:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0114 }
        L_0x0102:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x011c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0114 }
            uq1.e r3 = uq1.C65433e.f188292a     // Catch:{ all -> 0x0114 }
            r3.mo89559j(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0102
        L_0x0114:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "checkPostingFolder"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r1, r3, r2)
        L_0x011c:
            yq1.a$a r0 = new yq1.a$a
            java.lang.String r1 = "PostFileClearStage"
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yq1.C66692a.mo90273c():xq1.e");
    }

    /* renamed from: d */
    public void mo75102d(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: e */
    public void mo75103e(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }

    /* renamed from: f */
    public void mo75104f(C66408e eVar) {
        C87412m.m108594g(eVar, "nextStage");
    }
}
