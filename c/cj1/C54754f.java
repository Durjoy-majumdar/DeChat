package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import er1.C58739j4;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C64197v;
import te3.C52312zv0;

/* renamed from: cj1.f */
public final class C54754f {

    /* renamed from: k */
    public static final C54755a f153463k = new C54755a((C8480h) null);

    /* renamed from: a */
    public int f153464a = C32444a.f86044D.mo60266n().intValue();

    /* renamed from: b */
    public int f153465b = 50;

    /* renamed from: c */
    public LinkedList<Integer> f153466c = new LinkedList<>();

    /* renamed from: d */
    public int f153467d = -1;

    /* renamed from: e */
    public LinkedList<Integer> f153468e = new LinkedList<>();

    /* renamed from: f */
    public ArrayList<C54768h6> f153469f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C54768h6> f153470g = new ArrayList<>();

    /* renamed from: h */
    public String f153471h = "";

    /* renamed from: i */
    public C89349b f153472i;

    /* renamed from: j */
    public int f153473j;

    /* renamed from: cj1.f$a */
    public static final class C54755a {
        public C54755a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo75656a(ArrayList<C54768h6> arrayList, String str, boolean z) {
            String str2;
            C87412m.m108594g(arrayList, "list");
            C87412m.m108594g(str, "tag");
            StringBuilder sb = new StringBuilder(str + XVFSFile.PATH_SEPARATOR_CHAR);
            int i = 0;
            for (T next : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    C54768h6 h6Var = (C54768h6) next;
                    sb.append("[第" + i + "首:");
                    if (z) {
                        str2 = h6Var.f153498a.f144442d + ", " + h6Var.f153499b + ']';
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(h6Var);
                        sb4.append(']');
                        str2 = sb4.toString();
                    }
                    sb.append(str2);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            Log.m105924i("FinderLiveAnchorMusicData", sb.toString());
        }
    }

    public C54754f() {
        C32444a aVar = C32444a.f86121a;
    }

    /* renamed from: a */
    public final C13604l<C54768h6, Integer> mo75644a(int i) {
        int i2 = 0;
        for (T next : this.f153469f) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C54768h6 h6Var = (C54768h6) next;
                if (h6Var.f153498a.f144442d == i) {
                    return new C13604l<>(h6Var, Integer.valueOf(i2));
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return new C13604l<>(null, -1);
    }

    /* renamed from: b */
    public final C13604l<C54768h6, Integer> mo75645b(C54768h6 h6Var, int i) {
        C87412m.m108594g(h6Var, "musicItem");
        mo75652i(h6Var, i);
        ArrayList<C54768h6> arrayList = this.f153469f;
        int i2 = 0;
        if (arrayList == null || arrayList.isEmpty()) {
            Log.m105920e("FinderLiveAnchorMusicData", "musicList is empty!");
            return new C13604l<>(null, -1);
        }
        int i3 = i + 1;
        if (i3 < this.f153469f.size()) {
            i2 = i3;
        }
        C54768h6 h6Var2 = this.f153469f.get(i2);
        C87412m.m108593f(h6Var2, "musicList[nextPos]");
        C54768h6 h6Var3 = h6Var2;
        Log.m105924i("FinderLiveAnchorMusicData", "songId size:" + this.f153468e.size() + ", musicList id size:" + this.f153469f.size() + ", findNextMusicItem pos:" + i + ", nextPos:" + i2 + ", curPlayPos:" + this.f153467d + ",nextMusicItem:" + h6Var3);
        return new C13604l<>(h6Var3, Integer.valueOf(i2));
    }

    /* renamed from: c */
    public final C54768h6 mo75646c() {
        int i = this.f153467d;
        if (i < 0 || i >= this.f153469f.size()) {
            return null;
        }
        return this.f153469f.get(this.f153467d);
    }

    /* renamed from: d */
    public final int mo75647d() {
        int i = this.f153467d;
        if (i < 0 || i >= this.f153468e.size()) {
            return 0;
        }
        Integer num = this.f153468e.get(this.f153467d);
        C87412m.m108593f(num, "songIdList[curPlayPos]");
        return num.intValue();
    }

    /* renamed from: e */
    public final C52312zv0 mo75648e() {
        C52312zv0 zv02 = new C52312zv0();
        zv02.f146240d = this.f153468e;
        return zv02;
    }

    /* renamed from: f */
    public final LinkedList<Integer> mo75649f(boolean z) {
        int i;
        int size = this.f153468e.size();
        int size2 = this.f153469f.size();
        int i2 = size - size2;
        if (i2 <= 0) {
            return null;
        }
        if (!z && (i = this.f153465b) <= i2) {
            i2 = i;
        }
        return new LinkedList<>(this.f153468e.subList(size2, i2 + size2));
    }

    /* renamed from: g */
    public final void mo75650g(C54768h6 h6Var, int i) {
        C87412m.m108594g(h6Var, "item");
        if (h6Var.f153499b == 1) {
            h6Var.f153499b = 2;
        }
        Log.m105924i("FinderLiveAnchorMusicData", "pauseMusicItem " + h6Var + " songId size:" + this.f153468e.size() + ", musicList id size:" + this.f153469f.size() + ", pos:" + i + ", curPlayPos:" + this.f153467d);
    }

    /* renamed from: h */
    public final void mo75651h(C54768h6 h6Var, int i) {
        C87412m.m108594g(h6Var, "item");
        try {
            C54768h6 c = mo75646c();
            C54768h6 h6Var2 = this.f153469f.get(i);
            C87412m.m108593f(h6Var2, "musicList[pos]");
            C54768h6 h6Var3 = h6Var2;
            if (h6Var3.f153498a.f144442d == h6Var.f153498a.f144442d) {
                if (c != null) {
                    c.f153499b = 0;
                }
                h6Var3.f153499b = 1;
                this.f153467d = i;
            }
            Log.m105924i("FinderLiveAnchorMusicData", "playMusicItem item:" + h6Var + " songId size:" + this.f153468e.size() + ", musicList id size:" + this.f153469f.size() + ", pos:" + i + " oriMusicItem:" + c + " newMusicItem:" + h6Var3 + ", curPlayPos:" + this.f153467d);
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "FinderLiveAnchorMusicData playMusicItem");
        }
    }

    /* renamed from: i */
    public final void mo75652i(C54768h6 h6Var, int i) {
        if (h6Var != null) {
            h6Var.f153499b = 0;
        }
        Log.m105924i("FinderLiveAnchorMusicData", "resetMusicItem " + h6Var + " songId size:" + this.f153468e.size() + ", musicList id size:" + this.f153469f.size() + ", pos:" + i + ", curPlayPos:" + this.f153467d);
    }

    /* renamed from: j */
    public final void mo75653j(LinkedList<Integer> linkedList) {
        StringBuilder sb = new StringBuilder();
        sb.append("savePrepareSongIdList size:");
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        sb.append(", curPlayPos:");
        sb.append(this.f153467d);
        Log.m105924i("FinderLiveAnchorMusicData", sb.toString());
        if (linkedList != null) {
            this.f153466c = linkedList;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r12 = (r12 = (cj1.C54768h6) sx3.C110818d0.m150916N(r1)).f153498a;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75654k(te3.C49760hw0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "resp"
            gy3.C87412m.m108594g(r12, r0)
            java.util.LinkedList<te3.x41> r12 = r12.f134910d     // Catch:{ Exception -> 0x00d3 }
            r0 = 0
            if (r12 == 0) goto L_0x003c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x00d3 }
            r2 = 10
            int r2 = sx3.C36907w.m41090l(r12, r2)     // Catch:{ Exception -> 0x00d3 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00d3 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x00d3 }
        L_0x0019:
            boolean r2 = r12.hasNext()     // Catch:{ Exception -> 0x00d3 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r12.next()     // Catch:{ Exception -> 0x00d3 }
            r4 = r2
            te3.x41 r4 = (te3.C51922x41) r4     // Catch:{ Exception -> 0x00d3 }
            cj1.h6 r2 = new cj1.h6     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r3 = "it"
            gy3.C87412m.m108593f(r4, r3)     // Catch:{ Exception -> 0x00d3 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 24
            r10 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00d3 }
            r1.add(r2)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0019
        L_0x003c:
            r1 = r0
        L_0x003d:
            if (r1 == 0) goto L_0x0052
            java.lang.Object r12 = sx3.C110818d0.m150916N(r1)     // Catch:{ Exception -> 0x00d3 }
            cj1.h6 r12 = (cj1.C54768h6) r12     // Catch:{ Exception -> 0x00d3 }
            if (r12 == 0) goto L_0x0052
            te3.x41 r12 = r12.f153498a     // Catch:{ Exception -> 0x00d3 }
            if (r12 == 0) goto L_0x0052
            int r12 = r12.f144442d     // Catch:{ Exception -> 0x00d3 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x0053
        L_0x0052:
            r12 = r0
        L_0x0053:
            int r2 = r11.mo75647d()     // Catch:{ Exception -> 0x00d3 }
            java.util.ArrayList<cj1.h6> r3 = r11.f153469f     // Catch:{ Exception -> 0x00d3 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00d3 }
        L_0x005d:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00d3 }
            r5 = 0
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00d3 }
            cj1.h6 r4 = (cj1.C54768h6) r4     // Catch:{ Exception -> 0x00d3 }
            te3.x41 r4 = r4.f153498a     // Catch:{ Exception -> 0x00d3 }
            int r4 = r4.f144442d     // Catch:{ Exception -> 0x00d3 }
            if (r12 != 0) goto L_0x0071
            goto L_0x005d
        L_0x0071:
            int r6 = r12.intValue()     // Catch:{ Exception -> 0x00d3 }
            if (r4 != r6) goto L_0x005d
            r3 = 1
            goto L_0x007a
        L_0x0079:
            r3 = 0
        L_0x007a:
            if (r3 != 0) goto L_0x0083
            if (r1 == 0) goto L_0x0083
            java.util.ArrayList<cj1.h6> r4 = r11.f153469f     // Catch:{ Exception -> 0x00d3 }
            r4.addAll(r1)     // Catch:{ Exception -> 0x00d3 }
        L_0x0083:
            java.lang.String r1 = "FinderLiveAnchorMusicData"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d3 }
            r4.<init>()     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r6 = "updateMusicInfo respMusicInfo.first songId:"
            r4.append(r6)     // Catch:{ Exception -> 0x00d3 }
            r4.append(r12)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r12 = ", cur songId:"
            r4.append(r12)     // Catch:{ Exception -> 0x00d3 }
            r4.append(r2)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r12 = ", songIdExist:"
            r4.append(r12)     // Catch:{ Exception -> 0x00d3 }
            r4.append(r3)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r12 = ", curPlayPos:"
            r4.append(r12)     // Catch:{ Exception -> 0x00d3 }
            int r12 = r11.f153467d     // Catch:{ Exception -> 0x00d3 }
            r4.append(r12)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r12 = ", size:"
            r4.append(r12)     // Catch:{ Exception -> 0x00d3 }
            java.util.LinkedList<java.lang.Integer> r12 = r11.f153468e     // Catch:{ Exception -> 0x00d3 }
            if (r12 == 0) goto L_0x00be
            int r12 = r12.size()     // Catch:{ Exception -> 0x00d3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x00d3 }
        L_0x00be:
            r4.append(r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r12 = r4.toString()     // Catch:{ Exception -> 0x00d3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)     // Catch:{ Exception -> 0x00d3 }
            cj1.f$a r12 = f153463k     // Catch:{ Exception -> 0x00d3 }
            java.util.ArrayList<cj1.h6> r0 = r11.f153469f     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r1 = "updateMusicInfo"
            r12.mo75656a(r0, r1, r5)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00eb
        L_0x00d3:
            r12 = move-exception
            ft1.a r0 = ft1.C59319a.f169618b
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 60
            r8 = 0
            java.lang.String r1 = "updateMusicInfo"
            o40.C11348f.C11349a.m11178b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            er1.j4 r0 = er1.C58739j4.f168176a
            java.lang.String r1 = "FinderLiveAnchorMusicData updateMusicInfo"
            r0.mo83712h0(r12, r1)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54754f.mo75654k(te3.hw0):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0034 A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75655l(java.lang.String r14, te3.C49392f81 r15) {
        /*
            r13 = this;
            java.lang.String r0 = "query"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "resp"
            gy3.C87412m.m108594g(r15, r0)
            int r0 = r14.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r13.f153471h
            boolean r0 = gy3.C87412m.m108589b(r14, r0)
            if (r0 != 0) goto L_0x0026
        L_0x001f:
            java.util.ArrayList<cj1.h6> r0 = r13.f153470g
            r0.clear()
            r13.f153471h = r14
        L_0x0026:
            java.util.LinkedList<te3.x41> r0 = r15.f133349d
            r3 = 0
            if (r0 == 0) goto L_0x00a3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0034:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r0.next()
            r6 = r5
            te3.x41 r6 = (te3.C51922x41) r6
            boolean r7 = r6.f144448j
            if (r7 == 0) goto L_0x0057
            java.lang.String r6 = r6.f144449n
            if (r6 == 0) goto L_0x0052
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r6 = 0
            goto L_0x0053
        L_0x0052:
            r6 = 1
        L_0x0053:
            if (r6 != 0) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            if (r6 == 0) goto L_0x0034
            r4.add(r5)
            goto L_0x0034
        L_0x005e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = sx3.C36907w.m41090l(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L_0x006d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00a4
            java.lang.Object r4 = r1.next()
            r6 = r4
            te3.x41 r6 = (te3.C51922x41) r6
            cj1.h6 r4 = new cj1.h6
            java.lang.String r5 = "it"
            gy3.C87412m.m108593f(r6, r5)
            r7 = 0
            java.util.LinkedList<java.lang.Integer> r5 = r13.f153468e
            int r8 = r6.f144442d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r5 = r5.contains(r8)
            if (r5 == 0) goto L_0x0095
            r5 = 51
            r8 = 51
            goto L_0x0096
        L_0x0095:
            r8 = 0
        L_0x0096:
            r9 = 0
            r10 = 0
            r11 = 24
            r12 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.add(r4)
            goto L_0x006d
        L_0x00a3:
            r0 = r3
        L_0x00a4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "updateSearchMusicData last query:"
            r1.append(r2)
            java.lang.String r2 = r13.f153471h
            r1.append(r2)
            java.lang.String r2 = ", new query:"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = ", size:"
            r1.append(r14)
            if (r0 == 0) goto L_0x00cb
            int r14 = r0.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
        L_0x00cb:
            r1.append(r3)
            java.lang.String r14 = r1.toString()
            java.lang.String r1 = "FinderLiveAnchorMusicData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
            if (r0 == 0) goto L_0x00de
            java.util.ArrayList<cj1.h6> r14 = r13.f153470g
            r14.addAll(r0)
        L_0x00de:
            pe3.b r14 = r15.f133350e
            r13.f153472i = r14
            int r14 = r15.f133351f
            r13.f153473j = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54754f.mo75655l(java.lang.String, te3.f81):void");
    }
}
