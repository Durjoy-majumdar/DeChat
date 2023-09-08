package com.tencent.p014mm.plugin.appbrand.config;

import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.C81652f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import f40.C86709a0;
import hp3.C87581a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kb0.C9576e;
import lc3.C10485b;
import lp3.C46888b;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import nr3.C89060f;
import ob0.C89132b;
import ob0.C89147n0;
import pe3.C89349b;
import te3.C49684hc;
import te3.C90422jy;
import te3.n55;
import te3.o55;
import wi0.C90978e0;
import wi0.C90990o;
import wm0.C38230b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.config.k */
public final class C81662k extends C81681p {

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$a */
    public class C81663a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f239698d;

        public C81663a(String str) {
            this.f239698d = str;
        }

        public void run() {
            C81662k.m100196o(this.f239698d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$b */
    public class C81664b implements C81670g<WxaAttributes> {

        /* renamed from: b */
        public final /* synthetic */ String f239699b;

        /* renamed from: c */
        public final /* synthetic */ C81673i f239700c;

        public C81664b(String str, C81673i iVar) {
            this.f239699b = str;
            this.f239700c = iVar;
        }

        public String getUsername() {
            return this.f239699b;
        }

        /* renamed from: m */
        public Object mo114015m(String str) {
            return C81161g2.Cx0().mo114000LL(this.f239699b, C81670g.f239716a);
        }

        /* renamed from: n */
        public boolean mo114016n(Object obj) {
            WxaAttributes wxaAttributes = (WxaAttributes) obj;
            return C81681p.m100219a(wxaAttributes) || C81681p.m100220b(wxaAttributes);
        }

        /* renamed from: o */
        public C90990o mo114017o(String str) {
            C81673i iVar = this.f239700c;
            if (iVar == null) {
                return new C90990o(str, (String) null, false);
            }
            return new C90990o(str, (String) null, false, iVar.mo114019a(), this.f239700c.mo114021c(), this.f239700c.mo114020b());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$c */
    public class C81665c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f239701d;

        /* renamed from: e */
        public final /* synthetic */ boolean f239702e;

        /* renamed from: f */
        public final /* synthetic */ C81673i f239703f;

        /* renamed from: g */
        public final /* synthetic */ C81671h f239704g;

        /* renamed from: com.tencent.mm.plugin.appbrand.config.k$c$a */
        public class C81666a implements C81670g<WxaAttributes> {
            public C81666a() {
            }

            public String getUsername() {
                return C81665c.this.f239701d;
            }

            /* renamed from: m */
            public Object mo114015m(String str) {
                return C81161g2.Cx0().mo114000LL(str, C81670g.f239716a);
            }

            /* renamed from: n */
            public boolean mo114016n(Object obj) {
                WxaAttributes wxaAttributes = (WxaAttributes) obj;
                return C81681p.m100219a(wxaAttributes) || C81681p.m100220b(wxaAttributes);
            }

            /* renamed from: o */
            public C90990o mo114017o(String str) {
                C81673i iVar = C81665c.this.f239703f;
                if (iVar == null) {
                    return new C90990o(str, (String) null, false);
                }
                return new C90990o(str, (String) null, false, iVar.mo114019a(), C81665c.this.f239703f.mo114021c(), C81665c.this.f239703f.mo114020b());
            }
        }

        public C81665c(String str, boolean z, C81673i iVar, C81671h hVar) {
            this.f239701d = str;
            this.f239702e = z;
            this.f239703f = iVar;
            this.f239704g = hVar;
        }

        public void run() {
            PBool pBool = new PBool();
            String str = this.f239701d;
            Pair j = C81662k.m100191j(str, this.f239702e && C81662k.m100193l(str), (C81676l) null, new C81666a(), pBool);
            C81671h hVar = this.f239704g;
            if (hVar != null) {
                Object obj = j.second;
                hVar.mo113997a(obj == null ? C81671h.C81672a.RET_HIT_FREQUENCY_LIMIT : (((C89132b.C89134c) obj).f256793a == 0 && ((C89132b.C89134c) obj).f256794b == 0) ? pBool.value ? C81671h.C81672a.RET_UPDATED : C81671h.C81672a.RET_NO_UPDATE : C81671h.C81672a.RET_CGI_FAIL, (WxaAttributes) j.first);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$d */
    public class C81667d implements C87581a<List<String>, Void> {

        /* renamed from: a */
        public final /* synthetic */ List f239706a;

        /* renamed from: b */
        public final /* synthetic */ C81652f.C81653a f239707b;

        /* renamed from: c */
        public final /* synthetic */ C81674j f239708c;

        public C81667d(List list, C81652f.C81653a aVar, C81674j jVar) {
            this.f239706a = list;
            this.f239707b = aVar;
            this.f239708c = jVar;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C88643g.m110543a(C81662k.m100184c(this.f239706a, this.f239707b, this.f239708c));
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$e */
    public class C81668e implements C88629c.C88630a<List<String>> {

        /* renamed from: a */
        public final /* synthetic */ List f239709a;

        /* renamed from: b */
        public final /* synthetic */ List f239710b;

        /* renamed from: c */
        public final /* synthetic */ C81652f.C81653a f239711c;

        /* renamed from: d */
        public final /* synthetic */ C81674j f239712d;

        public C81668e(List list, List list2, C81652f.C81653a aVar, C81674j jVar) {
            this.f239709a = list;
            this.f239710b = list2;
            this.f239711c = aVar;
            this.f239712d = jVar;
        }

        public Object call() {
            C46888b c = C88643g.m110545c();
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            C81678m mVar = new C81678m(this, new AtomicInteger(this.f239709a.size()), concurrentLinkedQueue, c);
            for (C88633e a : this.f239709a) {
                a.mo114038a(new C81680o(this, concurrentLinkedQueue, mVar)).mo123065b(new C81679n(this, mVar));
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$f */
    public class C81669f implements C87581a<List<String>, C89132b.C89134c<C49684hc>> {

        /* renamed from: a */
        public final /* synthetic */ int f239713a;

        /* renamed from: b */
        public final /* synthetic */ C81652f.C81653a f239714b;

        /* renamed from: c */
        public final /* synthetic */ List f239715c;

        public C81669f(int i, C81652f.C81653a aVar, List list) {
            this.f239713a = i;
            this.f239714b = aVar;
            this.f239715c = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x0196  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                r0 = r20
                ob0.b$c r0 = (ob0.C89132b.C89134c) r0
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]
                int r3 = r1.f239713a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4 = 0
                r2[r4] = r3
                int r3 = r0.f256793a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5 = 1
                r2[r5] = r3
                int r3 = r0.f256794b
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6 = 2
                r2[r6] = r3
                java.lang.String r3 = r0.f256795c
                r7 = 3
                r2[r7] = r3
                T r3 = r0.f256796d
                te3.hc r3 = (te3.C49684hc) r3
                java.util.LinkedList<te3.q55> r3 = r3.f134560d
                int r3 = r3.size()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r8 = 4
                r2[r8] = r3
                java.lang.String r3 = "MicroMsg.WxaAttrSyncHelper"
                java.lang.String r9 = "BatchWxaAttrSync(%d) respond (%d, %d, %s), RespInfoList.size:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r2)
                int r2 = r0.f256793a
                if (r2 != 0) goto L_0x019a
                int r2 = r0.f256794b
                if (r2 == 0) goto L_0x004b
                goto L_0x019a
            L_0x004b:
                T r2 = r0.f256796d
                if (r2 == 0) goto L_0x0197
                wi0.e0 r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                boolean r9 = r2.mo114012qq()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                if (r9 != 0) goto L_0x006e
                java.lang.String r0 = "BatchBizAttrSync(%d) storage can not work"
                java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r5 = r1.f239713a     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r2[r4] = r5     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r2)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                goto L_0x019e
            L_0x006e:
                java.util.LinkedList r9 = new java.util.LinkedList     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r9.<init>()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                T r10 = r0.f256796d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                te3.hc r10 = (te3.C49684hc) r10     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.LinkedList<te3.q55> r10 = r10.f134560d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                boolean r10 = r10.isEmpty()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                if (r10 == 0) goto L_0x0083
                r9.clear()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                goto L_0x00bb
            L_0x0083:
                T r10 = r0.f256796d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                te3.hc r10 = (te3.C49684hc) r10     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.LinkedList<te3.q55> r10 = r10.f134560d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r10 = r10.size()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                if (r10 != r5) goto L_0x00b0
                T r10 = r0.f256796d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                te3.hc r10 = (te3.C49684hc) r10     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.LinkedList<te3.q55> r10 = r10.f134560d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Object r10 = r10.getFirst()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                te3.q55 r10 = (te3.q55) r10     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.String r11 = r10.f140158d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                pe3.b r12 = r10.f140159e     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.LinkedList<te3.n55> r13 = r10.f140160f     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r2.mo114003SE(r11, r12, r13, r5)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.String r10 = r10.f140158d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r9.add(r10)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                goto L_0x00bb
            L_0x00aa:
                r0 = move-exception
                goto L_0x018e
            L_0x00ad:
                r0 = move-exception
                goto L_0x018e
            L_0x00b0:
                com.tencent.mm.plugin.appbrand.config.f$a r10 = r1.f239714b     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r10 = r10.f239687d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                T r11 = r0.f256796d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                te3.hc r11 = (te3.C49684hc) r11     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r2.mo114001Lo(r10, r11, r9)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
            L_0x00bb:
                int r10 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                if (r10 > r5) goto L_0x0121
                java.util.Iterator r10 = r9.iterator()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
            L_0x00c5:
                boolean r11 = r10.hasNext()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                if (r11 == 0) goto L_0x0121
                java.lang.Object r11 = r10.next()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.String r12 = "syncTimeSecond"
                java.lang.String[] r12 = new java.lang.String[]{r12}     // Catch:{ Exception -> 0x00df }
                com.tencent.mm.plugin.appbrand.config.WxaAttributes r12 = r2.mo114000LL(r11, r12)     // Catch:{ Exception -> 0x00df }
                long r12 = r12.field_syncTimeSecond     // Catch:{ Exception -> 0x00df }
                goto L_0x00e1
            L_0x00df:
                r12 = 0
            L_0x00e1:
                long r14 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r12)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r16 = 5
                int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                if (r18 < 0) goto L_0x00ed
                r14 = 1
                goto L_0x00ee
            L_0x00ed:
                r14 = 0
            L_0x00ee:
                if (r14 == 0) goto L_0x0108
                java.lang.String r14 = "BatchWxaAttrSync(%d) username(%s) flush error, lastSyncTimestamp(%d)"
                java.lang.Object[] r15 = new java.lang.Object[r7]     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r8 = r1.f239713a     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r15[r4] = r8     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r15[r5] = r11     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r15[r6] = r8     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r14, r15)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                goto L_0x011f
            L_0x0108:
                java.lang.String r8 = "BatchWxaAttrSync(%d) username(%s) flush ok, lastSyncTimestamp(%d)"
                java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r15 = r1.f239713a     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r14[r4] = r15     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r14[r5] = r11     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Long r11 = java.lang.Long.valueOf(r12)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r14[r6] = r11     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r14)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
            L_0x011f:
                r8 = 4
                goto L_0x00c5
            L_0x0121:
                java.lang.String r2 = "BatchWxaAttrSync(%d) end request.size:%d, response.size:%d, updated.size:%d"
                r8 = 4
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r10 = r1.f239713a     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r8[r4] = r10     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.List r10 = r1.f239715c     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r10 = r10.size()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r8[r5] = r10     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                T r0 = r0.f256796d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                te3.hc r0 = (te3.C49684hc) r0     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.LinkedList<te3.q55> r0 = r0.f134560d     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r0 = r0.size()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r8[r6] = r0     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r0 = r9.size()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r8[r7] = r0     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r8)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.List r0 = r1.f239715c     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r0 = r0.size()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r2 = r9.size()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                if (r0 <= r2) goto L_0x0197
                java.util.List r0 = r1.f239715c     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
            L_0x0169:
                boolean r2 = r0.hasNext()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                if (r2 == 0) goto L_0x0197
                java.lang.Object r2 = r0.next()     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                boolean r7 = r9.contains(r2)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                if (r7 == 0) goto L_0x017c
                goto L_0x0169
            L_0x017c:
                java.lang.String r7 = "BatchWxaAttrSync(%d) end, %s not respond"
                java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                int r10 = r1.f239713a     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r8[r4] = r10     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                r8[r5] = r2     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r8)     // Catch:{ NullPointerException -> 0x00ad, b -> 0x00aa }
                goto L_0x0169
            L_0x018e:
                com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
                sf0.z$a r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238476o
                if (r2 != 0) goto L_0x0196
                goto L_0x0197
            L_0x0196:
                throw r0
            L_0x0197:
                java.util.List r0 = r1.f239715c
                goto L_0x019e
            L_0x019a:
                java.util.List r0 = java.util.Collections.emptyList()
            L_0x019e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.C81662k.C81669f.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$g */
    public interface C81670g<T> {

        /* renamed from: a */
        public static final String[] f239716a = {"username", "appId", "versionInfo", "appInfo", "syncTimeSecond", "syncVersion", "smallHeadURL", "nickname", "dynamicInfo", "passThroughInfo", "stablePassThroughInfo"};

        String getUsername();

        /* renamed from: m */
        T mo114015m(String str);

        /* renamed from: n */
        boolean mo114016n(T t);

        /* renamed from: o */
        C90990o mo114017o(String str);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$h */
    public interface C81671h<T> {

        /* renamed from: com.tencent.mm.plugin.appbrand.config.k$h$a */
        public enum C81672a {
            RET_HIT_FREQUENCY_LIMIT,
            RET_UPDATED,
            RET_NO_UPDATE,
            RET_CGI_FAIL
        }

        /* renamed from: a */
        void mo113997a(C81672a aVar, T t);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$i */
    public interface C81673i {
        /* renamed from: a */
        String mo114019a();

        /* renamed from: b */
        C90422jy mo114020b();

        /* renamed from: c */
        int mo114021c();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$j */
    public interface C81674j {
        /* renamed from: a */
        void mo109935a();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$k */
    public interface C81675k extends C81674j {
        /* renamed from: b */
        void mo113620b(List<String> list);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.config.k$l */
    public interface C81676l {
        /* renamed from: a */
        void mo114022a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010d, code lost:
        r3 = r10.mo125060e(new java.lang.String[]{"syncTimeSecond"}, java.lang.String.format(java.util.Locale.ENGLISH, "%s=?", new java.lang.Object[]{"username"}), new java.lang.String[]{r8});
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0174 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0174 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static lp3.C88633e<java.util.List<java.lang.String>> m100184c(java.util.List<java.lang.String> r17, com.tencent.p014mm.plugin.appbrand.config.C81652f.C81653a r18, com.tencent.p014mm.plugin.appbrand.config.C81662k.C81674j r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r17.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            int r5 = r1.f239687d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 1
            r4[r7] = r5
            java.lang.String r5 = "MicroMsg.WxaAttrSyncHelper"
            java.lang.String r8 = "batchSync before real logic, list_size:%d, scene:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r17)
            if (r4 == 0) goto L_0x0033
            java.util.List r0 = java.util.Collections.emptyList()
            nr3.e r0 = nr3.C89060f.m111323b(r0)
            return r0
        L_0x0033:
            boolean r4 = com.tencent.p014mm.plugin.appbrand.utils.C2039g2.m1987a()
            if (r4 == 0) goto L_0x0046
            nr3.e r3 = nr3.C89060f.m111322a()
            com.tencent.mm.plugin.appbrand.config.k$d r4 = new com.tencent.mm.plugin.appbrand.config.k$d
            r4.<init>(r0, r1, r2)
            r3.mo123419C(r4)
            return r3
        L_0x0046:
            boolean r4 = r0 instanceof java.util.ArrayList
            if (r4 != 0) goto L_0x0055
            boolean r4 = r0 instanceof java.util.LinkedList
            if (r4 == 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>(r0)
            r0 = r4
        L_0x0055:
            java.util.Iterator r4 = r0.iterator()
        L_0x0059:
            boolean r8 = r4.hasNext()
            r9 = 3
            if (r8 == 0) goto L_0x0177
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 != 0) goto L_0x0171
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85804J4(r8)
            if (r10 != 0) goto L_0x0074
            goto L_0x0171
        L_0x0074:
            com.tencent.mm.plugin.appbrand.config.f$a[] r10 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81344s.f238812b
            boolean r10 = u24.C90595a.m113498b(r10, r1)
            if (r10 == 0) goto L_0x00ef
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L_0x0083
            goto L_0x00e5
        L_0x0083:
            boolean r10 = m100193l(r8)
            if (r10 != 0) goto L_0x008a
            goto L_0x00e5
        L_0x008a:
            java.lang.Class<ki0.j> r10 = ki0.C33915j.class
            java.lang.Object r10 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r10)
            ki0.j r10 = (ki0.C33915j) r10
            ki0.i r10 = r10.mo59363jo(r8)
            if (r10 == 0) goto L_0x00e7
            wi0.e0 r11 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String r12 = "versionInfo"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r11 = r11.mo114000LL(r8, r12)
            if (r11 == 0) goto L_0x00e7
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r12 = r11.mo113942o2()
            if (r12 == 0) goto L_0x00e7
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r12 = r11.mo113942o2()
            int r12 = r12.f239454f
            if (r12 != 0) goto L_0x00e7
            int r12 = r10.field_appVersion
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r13 = r11.mo113942o2()
            int r13 = r13.f239452d
            if (r12 > r13) goto L_0x00e7
            r12 = 4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r6] = r8
            java.lang.String r8 = r18.name()
            r12[r7] = r8
            int r8 = r10.field_appVersion
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r3] = r8
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo r8 = r11.mo113942o2()
            int r8 = r8.f239452d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r9] = r8
            java.lang.String r8 = "needUpdateAttrWithUsernameForBatchPreload, username(%s) scene(%s) notifyVersion(%d) appVersion(%d) return false"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r8, r12)
        L_0x00e5:
            r8 = 0
            goto L_0x00e8
        L_0x00e7:
            r8 = 1
        L_0x00e8:
            if (r8 != 0) goto L_0x0174
            r4.remove()
            goto L_0x0174
        L_0x00ef:
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r13 = "syncTimeSecond"
            if (r10 == 0) goto L_0x00fb
            r11 = 0
            goto L_0x0155
        L_0x00fb:
            ki0.k r10 = ki0.C33916k.f91610a
            long r14 = r10.mo59364a(r8)
            wi0.f0 r10 = wi0.C90980f0.f261056b
            r10.getClass()
            boolean r16 = android.text.TextUtils.isEmpty(r8)
            if (r16 == 0) goto L_0x010d
            goto L_0x012a
        L_0x010d:
            java.lang.String[] r3 = new java.lang.String[]{r13}
            java.util.Locale r9 = java.util.Locale.ENGLISH
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r12 = "username"
            r11[r6] = r12
            java.lang.String r12 = "%s=?"
            java.lang.String r9 = java.lang.String.format(r9, r12, r11)
            java.lang.String[] r11 = new java.lang.String[r7]
            r11[r6] = r8
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r3 = r10.mo125060e(r3, r9, r11)
            if (r3 != 0) goto L_0x012f
        L_0x012a:
            r9 = -1
        L_0x012c:
            r11 = 0
            goto L_0x0132
        L_0x012f:
            long r9 = r3.field_syncTimeSecond
            goto L_0x012c
        L_0x0132:
            int r3 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0155
            int r3 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x0155
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r6] = r8
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r3[r7] = r14
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 2
            r3[r10] = r9
            java.lang.String r9 = "MicroMsg.WxaAttrSyncUtils"
            java.lang.String r10 = "isContactMarkedAsInvalid (%s) returns true, treated as invalid until %d, attrs lastSyncTimestamp %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r3)
            r3 = 1
            goto L_0x0156
        L_0x0155:
            r3 = 0
        L_0x0156:
            wi0.e0 r9 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Cx0()
            java.lang.String[] r10 = new java.lang.String[]{r13}
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r9 = r9.mo114000LL(r8, r10)
            if (r9 != 0) goto L_0x0165
            goto L_0x0167
        L_0x0165:
            long r11 = r9.field_syncTimeSecond
        L_0x0167:
            boolean r3 = m100194m(r8, r3, r11)
            if (r3 != 0) goto L_0x0174
            r4.remove()
            goto L_0x0174
        L_0x0171:
            r4.remove()
        L_0x0174:
            r3 = 2
            goto L_0x0059
        L_0x0177:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r3 == 0) goto L_0x018b
            if (r2 == 0) goto L_0x0182
            r19.mo109935a()
        L_0x0182:
            java.util.List r0 = java.util.Collections.emptyList()
            nr3.e r0 = nr3.C89060f.m111323b(r0)
            return r0
        L_0x018b:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r0.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r6] = r4
            java.lang.String r4 = r18.name()
            r3[r7] = r4
            int r4 = r1.f239687d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 2
            r3[r7] = r4
            java.lang.String r4 = "batchSync, list_size %d, scene %s(%d)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r4 = 0
        L_0x01b2:
            int r5 = r0.size()
            int r5 = r5 / 20
            if (r6 >= r5) goto L_0x01cd
            int r4 = r6 * 20
            int r5 = r4 + 20
            java.util.List r4 = r0.subList(r4, r5)
            lp3.e r4 = m100185d(r4, r1)
            r3.add(r4)
            int r6 = r6 + 1
            r4 = r5
            goto L_0x01b2
        L_0x01cd:
            int r5 = r0.size()
            if (r4 >= r5) goto L_0x01e2
            int r5 = r0.size()
            java.util.List r4 = r0.subList(r4, r5)
            lp3.e r4 = m100185d(r4, r1)
            r3.add(r4)
        L_0x01e2:
            boolean r4 = r2 instanceof com.tencent.p014mm.plugin.appbrand.config.C81662k.C81675k
            if (r4 == 0) goto L_0x01ec
            r4 = r2
            com.tencent.mm.plugin.appbrand.config.k$k r4 = (com.tencent.p014mm.plugin.appbrand.config.C81662k.C81675k) r4
            r4.mo113620b(r0)
        L_0x01ec:
            com.tencent.mm.plugin.appbrand.config.k$e r4 = new com.tencent.mm.plugin.appbrand.config.k$e
            r4.<init>(r3, r0, r1, r2)
            nr3.e r0 = nr3.C89060f.m111325d(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.config.C81662k.m100184c(java.util.List, com.tencent.mm.plugin.appbrand.config.f$a, com.tencent.mm.plugin.appbrand.config.k$j):lp3.e");
    }

    /* renamed from: d */
    public static C88633e<List<String>> m100185d(List<String> list, C81652f.C81653a aVar) {
        if (Util.isNullOrNil((List) list)) {
            return C89060f.m111323b(Collections.emptyList());
        }
        C81652f fVar = new C81652f(list, aVar);
        int hashCode = fVar.hashCode();
        Log.m105925i("MicroMsg.WxaAttrSyncHelper", "BatchWxaAttrSync(%d) commit", Integer.valueOf(hashCode));
        return fVar.mo9225i().mo123060U(new C81669f(hashCode, aVar, list));
    }

    /* renamed from: e */
    public static boolean m100186e(String str) {
        if (Util.isNullOrNil(str) || C9576e.m9260a(str)) {
            return false;
        }
        Log.m105921e("MicroMsg.WxaAttrSyncHelper", "checkLogIfInvalidUsername %s, %s", str, MMStack.stackTraceToString(new Throwable()));
        C115669n.INSTANCE.mo175911u(C38230b.CTRL_INDEX, 1);
        return true;
    }

    /* renamed from: f */
    public static C89349b m100187f(String str) {
        return C81660i.m100161mI(C81161g2.Cx0().mo114000LL(str, "syncVersion"));
    }

    /* renamed from: g */
    public static C89349b m100188g(String str) {
        WxaAttributes mL = C81161g2.Cx0().mo114011mL(str, "syncVersion");
        return mL == null ? new C89349b(new byte[0], 0, 0) : C81660i.m100161mI(mL);
    }

    /* renamed from: h */
    public static long m100189h(boolean z) {
        if (!z) {
            return (long) ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBizAttrSyncFreq", 3600);
        }
        long j = AppBrandGlobalSystemConfig.m100099b().f239287J.f239355i;
        if (j <= 0) {
            j = 30;
        }
        Log.m105925i("MicroMsg.WxaAttrSyncHelper", "getSyncFreq forInvalidContact, return %d", Long.valueOf(j));
        return j;
    }

    /* renamed from: i */
    public static Pair<WxaAttributes, C89132b.C89134c<o55>> m100190i(String str, boolean z, C81676l lVar, C81673i iVar) {
        return m100186e(str) ? new Pair<>((Object) null, (Object) null) : m100191j(str, z, lVar, new C81664b(str, iVar), (PBool) null);
    }

    /* renamed from: j */
    public static <T> Pair<T, C89132b.C89134c<o55>> m100191j(String str, boolean z, C81676l lVar, C81670g<T> gVar, PBool pBool) {
        T t;
        String str2;
        C89132b.C89134c cVar = null;
        if (Util.isNullOrNil(str) || !C86709a0.m107523b().f251765p) {
            return Pair.create((Object) null, (Object) null);
        }
        if (!z) {
            t = gVar.mo114015m(str);
            if (t != null && !gVar.mo114016n(t)) {
                Log.m105925i("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, no need cgi sync, key:%s", Boolean.valueOf(z), str);
                m100195n(t);
                return Pair.create(t, cVar);
            }
        } else {
            t = null;
        }
        if (lVar != null) {
            lVar.mo114022a();
        }
        C89132b.C89134c n = gVar.mo114017o(str).mo115600n();
        if (n == null || (n instanceof C89147n0.C89151d) || n.f256793a != 0 || n.f256794b != 0) {
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(z);
            int i = -1;
            objArr[1] = Integer.valueOf(n == null ? -1 : n.f256793a);
            if (n != null) {
                i = n.f256794b;
            }
            objArr[2] = Integer.valueOf(i);
            objArr[3] = n == null ? "null resp" : n.f256795c;
            Log.m105921e("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, errType = %d, errCode = %d, errMsg = %s", objArr);
            return (t == null && (t = gVar.mo114015m(str)) == null) ? Pair.create((Object) null, n) : Pair.create(t, n);
        }
        Iterator<n55> it = ((o55) n.f256796d).f138969e.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            n55 next = it.next();
            if ("UserName".equalsIgnoreCase(next.f138424d)) {
                str2 = next.f138425e;
                if (!str2.endsWith("@app")) {
                    str2 = str2 + "@app";
                }
            }
        }
        if (Util.isNullOrNil(str2)) {
            str2 = gVar.getUsername();
            if (Util.isNullOrNil(str2)) {
                Log.m105921e("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, key %s, cgi sync fail username invalid", Boolean.valueOf(z), str);
                return Pair.create((Object) null, (Object) null);
            }
        }
        Log.m105925i("MicroMsg.WxaAttrSyncHelper", "loadOrSync key(%s), username(%s), flushAttrs", str, str2);
        C90978e0 Cx0 = C81161g2.Cx0();
        T t2 = n.f256796d;
        if (Cx0.mo114003SE(str2, ((o55) t2).f138968d, ((o55) t2).f138969e, true)) {
            C81661j.m100182g().doNotify(MStorageEventData.EventType.SINGLE, 3, str2);
            if (pBool != null) {
                pBool.value = true;
            }
        }
        t = gVar.mo114015m(str);
        Log.m105925i("MicroMsg.WxaAttrSyncHelper", "loadOrSync, ignoreLocal %b, cgi sync result, key:%s", Boolean.valueOf(z), str);
        m100195n(t);
        cVar = n;
        return Pair.create(t, cVar);
    }

    /* renamed from: k */
    public static void m100192k(String str, boolean z, C81671h<WxaAttributes> hVar, C81673i iVar) {
        if (!m100186e(str)) {
            ((C119157j) C119157j.f356862d).mo183875f(new C81665c(str, z, iVar, hVar));
        }
    }

    /* renamed from: l */
    public static boolean m100193l(String str) {
        WxaAttributes LL = C81161g2.Cx0().mo114000LL(str, "syncTimeSecond");
        return m100194m(str, false, LL == null ? 0 : LL.field_syncTimeSecond);
    }

    /* renamed from: m */
    public static boolean m100194m(String str, boolean z, long j) {
        if (C81161g2.Cx0() == null) {
            Log.m105929w("MicroMsg.WxaAttrSyncHelper", "needUpdateAttr(%s), storage NULL", str);
            return false;
        }
        long nowSecond = Util.nowSecond();
        long h = m100189h(z);
        if (Log.getLogLevel() <= 0) {
            Log.m105927v("MicroMsg.WxaAttrSyncHelper", "needUpdateAttr, username(%s), currentMS(%d), lastUpdateTime(%d), freq(%d).", str, Long.valueOf(nowSecond), Long.valueOf(j), Long.valueOf(h));
        }
        return nowSecond - j >= h || j > nowSecond + h;
    }

    /* renamed from: n */
    public static <T> void m100195n(T t) {
        if (t instanceof WxaAttributes) {
            WxaAttributes wxaAttributes = (WxaAttributes) t;
            wxaAttributes.getClass();
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {wxaAttributes.field_username, wxaAttributes.field_appId, wxaAttributes.field_nickname};
            String[] strArr = {String.format(locale, ">>>>>> WxaAttributes(%s|%s|%s)START >>>>>>", objArr), ">>> field_appInfo=" + wxaAttributes.field_appInfo, ">>> field_versionInfo=" + wxaAttributes.field_versionInfo, ">>> field_dynamicInfo=" + wxaAttributes.field_dynamicInfo, String.format(locale, ">>>>>> WxaAttributes(%s|%s|%s) END >>>>>>", new Object[]{wxaAttributes.field_username, wxaAttributes.field_appId, wxaAttributes.field_nickname})};
            for (int i = 0; i < 5; i++) {
                com.tencent.stubs.logger.Log.println(4, "MicroMsg.AppBrand.WxaAttributes", strArr[i]);
            }
            return;
        }
        Log.m105925i("MicroMsg.WxaAttrSyncHelper", "printContact %s", t);
    }

    /* renamed from: o */
    public static void m100196o(String str) {
        if (!m100186e(str) && m100193l(str)) {
            m100190i(str, true, (C81676l) null, (C81673i) null);
        }
    }

    /* renamed from: p */
    public static void m100197p(String str) {
        if (!m100186e(str)) {
            ((C119157j) C119157j.f356862d).mo183875f(new C81663a(str));
        }
    }
}
