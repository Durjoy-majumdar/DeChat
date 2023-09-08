package hk3;

import android.util.LruCache;
import android.util.SparseArray;
import ck3.C39969i;
import ck3.C67391b;
import ck3.C67396e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hk3.C76227e;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import mk3.C76775c;
import oa1.C117731d;
import pf3.C110211d;
import pf3.C35477c;
import rx3.C13601g;
import rx3.C36568h;
import vk3.C78430l;

/* renamed from: hk3.b */
public final class C76221b extends C76218a {

    /* renamed from: h */
    public static final C13601g<Pattern> f223287h = C36568h.m40985a(C32940a.f89524d);

    /* renamed from: d */
    public final C39969i f223288d;

    /* renamed from: e */
    public final C13601g f223289e = C36568h.m40985a(C76223d.f223297d);

    /* renamed from: f */
    public final LruCache<String, C32941b> f223290f = new LruCache<>(800);

    /* renamed from: g */
    public final boolean f223291g;

    /* renamed from: hk3.b$a */
    public static final class C32940a extends C87413o implements C32224a<Pattern> {

        /* renamed from: d */
        public static final C32940a f89524d = new C32940a();

        public C32940a() {
            super(0);
        }

        public Object invoke() {
            return Pattern.compile("^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$");
        }
    }

    /* renamed from: hk3.b$b */
    public static final class C32941b {

        /* renamed from: a */
        public final boolean f89525a;

        /* renamed from: b */
        public final String f89526b;

        /* renamed from: c */
        public final boolean f89527c;

        public C32941b(boolean z, String str, boolean z2) {
            C87412m.m108594g(str, "afterReplaceContent");
            this.f89525a = z;
            this.f89526b = str;
            this.f89527c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32941b)) {
                return false;
            }
            C32941b bVar = (C32941b) obj;
            return this.f89525a == bVar.f89525a && C87412m.m108589b(this.f89526b, bVar.f89526b) && this.f89527c == bVar.f89527c;
        }

        public int hashCode() {
            boolean z = this.f89525a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + this.f89526b.hashCode()) * 31;
            boolean z3 = this.f89527c;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        public String toString() {
            return "ProcessTextInfo(isNeedReplace=" + this.f89525a + ", afterReplaceContent=" + this.f89526b + ", isSpecialForNeatText=" + this.f89527c + ')';
        }
    }

    /* renamed from: hk3.b$c */
    public static final class C76222c implements C76227e.C32942b {

        /* renamed from: a */
        public final /* synthetic */ C78430l<C72963f4> f223292a;

        /* renamed from: b */
        public final /* synthetic */ C76227e.C76230d<C72963f4> f223293b;

        /* renamed from: c */
        public final /* synthetic */ C76221b f223294c;

        /* renamed from: d */
        public final /* synthetic */ C76227e.C76228a f223295d;

        /* renamed from: e */
        public final /* synthetic */ C76227e.C32942b f223296e;

        public C76222c(C78430l<C72963f4> lVar, C76227e.C76230d<C72963f4> dVar, C76221b bVar, C76227e.C76228a aVar, C76227e.C32942b bVar2) {
            this.f223292a = lVar;
            this.f223293b = dVar;
            this.f223294c = bVar;
            this.f223295d = aVar;
            this.f223296e = bVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x019a, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "sourceFinish action:" + r12.f223295d + " addCount:" + r12.f223293b.f223310d + " totalCount:" + r12.f223293b.f223312f + " calDuration:" + (java.lang.System.currentTimeMillis() - r0) + " queryCreateTime:" + r12.f223293b.f223314h);
            r0 = r12.f223296e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x01e6, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01e8, code lost:
            r0.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0126  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x004f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void next() {
            /*
                r12 = this;
                vk3.l<com.tencent.mm.storage.f4> r0 = r12.f223292a
                hk3.e$d<com.tencent.mm.storage.f4> r1 = r12.f223293b
                java.util.List<T> r1 = r1.f223309c
                r0.mo61318q(r1)
                vk3.l<com.tencent.mm.storage.f4> r0 = r12.f223292a
                r0.close()
                hk3.e$d<com.tencent.mm.storage.f4> r0 = r12.f223293b
                vk3.l<com.tencent.mm.storage.f4> r1 = r12.f223292a
                int r1 = r1.mo61317p()
                r0.f223312f = r1
                hk3.e$d<com.tencent.mm.storage.f4> r0 = r12.f223293b
                java.util.List<T> r1 = r0.f223309c
                java.util.LinkedList r1 = (java.util.LinkedList) r1
                int r1 = r1.size()
                r0.f223310d = r1
                hk3.e$d<com.tencent.mm.storage.f4> r0 = r12.f223293b
                vk3.l<com.tencent.mm.storage.f4> r1 = r12.f223292a
                long r1 = r1.mo61320s()
                r0.f223314h = r1
                hk3.b r0 = r12.f223294c
                hk3.e$d<com.tencent.mm.storage.f4> r1 = r12.f223293b
                r0.getClass()
                java.util.List<T> r2 = r1.f223309c
                if (r2 != 0) goto L_0x0045
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                java.lang.String r3 = "MicroMsg.ChattingLoader.ChattingDataCallbackV2"
                java.lang.String r4 = "[preProcessDataList] list is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            L_0x0045:
                android.util.SparseArray r3 = new android.util.SparseArray
                r3.<init>()
                java.util.Iterator r2 = r2.iterator()
                r4 = 0
            L_0x004f:
                boolean r5 = r2.hasNext()
                r6 = 1
                if (r5 == 0) goto L_0x0141
                java.lang.Object r5 = r2.next()
                r7 = r5
                com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
                rx3.b0 r8 = rx3.C13598b0.f38549a
                r3.put(r4, r5)
                int r4 = r4 + r6
                r5 = 0
                if (r7 == 0) goto L_0x0101
                boolean r8 = r7.mo100993e4()
                if (r8 == 0) goto L_0x0101
                java.lang.String r8 = r7.getContent()
                if (r8 == 0) goto L_0x0101
                boolean r8 = r0.f223291g
                java.lang.String r9 = ""
                if (r8 == 0) goto L_0x00dc
                android.util.LruCache<java.lang.String, hk3.b$b> r8 = r0.f223290f
                java.lang.String r10 = r7.getContent()
                java.lang.Object r8 = r8.get(r10)
                hk3.b$b r8 = (hk3.C76221b.C32941b) r8
                if (r8 == 0) goto L_0x0090
                boolean r6 = r8.f89525a
                if (r6 == 0) goto L_0x0102
                java.lang.String r6 = r8.f89526b
                r7.mo108732L2(r6)
                goto L_0x0102
            L_0x0090:
                rx3.g r8 = r0.f223289e
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                java.util.regex.Pattern r8 = (java.util.regex.Pattern) r8
                java.lang.String r10 = r7.getContent()
                java.util.regex.Matcher r8 = r8.matcher(r10)
                boolean r10 = r8.find()
                if (r10 == 0) goto L_0x00ad
                java.lang.String r8 = r8.replaceAll(r9)
                goto L_0x00b1
            L_0x00ad:
                java.lang.String r8 = r7.getContent()
            L_0x00b1:
                r7.mo108732L2(r8)
                rx3.g<java.util.regex.Pattern> r9 = hk3.C76221b.f223287h
                rx3.n r9 = (rx3.C36570n) r9
                java.lang.Object r9 = r9.getValue()
                java.util.regex.Pattern r9 = (java.util.regex.Pattern) r9
                java.util.regex.Matcher r9 = r9.matcher(r8)
                boolean r9 = r9.matches()
                r6 = r6 ^ r9
                hk3.b$b r9 = new hk3.b$b
                java.lang.String r11 = "afterContent"
                gy3.C87412m.m108593f(r8, r11)
                r9.<init>(r10, r8, r6)
                android.util.LruCache<java.lang.String, hk3.b$b> r6 = r0.f223290f
                java.lang.String r8 = r7.getContent()
                r6.put(r8, r9)
                r8 = r9
                goto L_0x0102
            L_0x00dc:
                java.lang.String r6 = r7.getContent()
                java.lang.String r8 = "msg.content"
                gy3.C87412m.m108593f(r6, r8)
                java.lang.String r8 = "‮"
                java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
                java.lang.String r10 = "compile(pattern)"
                gy3.C87412m.m108593f(r8, r10)
                java.util.regex.Matcher r6 = r8.matcher(r6)
                java.lang.String r6 = r6.replaceAll(r9)
                java.lang.String r8 = "nativePattern.matcher(in…).replaceAll(replacement)"
                gy3.C87412m.m108593f(r6, r8)
                r7.mo108732L2(r6)
            L_0x0101:
                r8 = r5
            L_0x0102:
                ck3.b r6 = r0.f223279b
                java.lang.String r9 = "mChattingContext"
                gy3.C87412m.m108593f(r6, r9)
                if (r7 != 0) goto L_0x010c
                goto L_0x0124
            L_0x010c:
                int r9 = com.tencent.p014mm.p136ui.chatting.viewitems.C74272u8.m88590b(r7)
                com.tencent.mm.ui.chatting.viewitems.i r9 = com.tencent.p014mm.p136ui.chatting.viewitems.C74272u8.m88592d(r9)
                if (r9 == 0) goto L_0x0121
                android.app.Activity r6 = r6.mo91565f()
                ck3.i r10 = r0.f223288d
                com.tencent.mm.storage.f4$d r6 = r9.mo82118d(r7, r6, r10)
                goto L_0x0122
            L_0x0121:
                r6 = r5
            L_0x0122:
                r7.f212670y1 = r6
            L_0x0124:
                if (r8 == 0) goto L_0x004f
                if (r7 == 0) goto L_0x012b
                com.tencent.mm.storage.f4$d r6 = r7.f212670y1
                goto L_0x012c
            L_0x012b:
                r6 = r5
            L_0x012c:
                boolean r7 = r6 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7.C74062c
                if (r7 == 0) goto L_0x0133
                r5 = r6
                com.tencent.mm.ui.chatting.viewitems.i7$c r5 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7.C74062c) r5
            L_0x0133:
                if (r5 != 0) goto L_0x0137
                goto L_0x004f
            L_0x0137:
                boolean r6 = r8.f89527c
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r5.f217312b = r6
                goto L_0x004f
            L_0x0141:
                r1.f223317k = r3
                hk3.b r0 = r12.f223294c
                r0.mo106477c()
                long r0 = java.lang.System.currentTimeMillis()
                hk3.b r2 = r12.f223294c
                ck3.b r2 = r2.f223279b
                ck3.e r2 = r2.f193294r
                android.util.SparseArray<com.tencent.mm.storage.f4> r2 = r2.f193313a
                hk3.e$d<com.tencent.mm.storage.f4> r3 = r12.f223293b
                uj3.c r4 = new uj3.c
                android.util.SparseArray<T> r5 = r3.f223317k
                java.lang.String r7 = "result.dataListToSet"
                gy3.C87412m.m108593f(r5, r7)
                r4.<init>(r2, r5)
                androidx.recyclerview.widget.l$c r2 = androidx.recyclerview.widget.C54248l.m60949a(r4, r6)
                r3.f223316j = r2
                hk3.e$d<com.tencent.mm.storage.f4> r2 = r12.f223293b
                hk3.f r2 = r2.f223318l
                java.lang.String r3 = "result.loader"
                gy3.C87412m.m108593f(r2, r3)
                hk3.e$d<com.tencent.mm.storage.f4> r3 = r12.f223293b
                hk3.b r4 = r12.f223294c
                monitor-enter(r2)
                java.util.concurrent.atomic.AtomicBoolean r5 = r3.f223315i     // Catch:{ all -> 0x01ec }
                boolean r5 = r5.get()     // Catch:{ all -> 0x01ec }
                if (r5 == 0) goto L_0x0187
                java.lang.String r0 = "MicroMsg.ChattingLoader.ChattingDataCallbackV2"
                java.lang.String r1 = "cancel source apply"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)     // Catch:{ all -> 0x01ec }
                monitor-exit(r2)
                return
            L_0x0187:
                ck3.b r4 = r4.f223279b     // Catch:{ all -> 0x01ec }
                ck3.e r4 = r4.f193294r     // Catch:{ all -> 0x01ec }
                android.util.SparseArray<T> r3 = r3.f223317k     // Catch:{ all -> 0x01ec }
                java.lang.String r5 = "result.dataListToSet"
                gy3.C87412m.m108593f(r3, r5)     // Catch:{ all -> 0x01ec }
                r4.getClass()     // Catch:{ all -> 0x01ec }
                r4.f193313a = r3     // Catch:{ all -> 0x01ec }
                rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x01ec }
                monitor-exit(r2)
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r0
                java.lang.String r0 = "MicroMsg.ChattingLoader.ChattingDataCallbackV2"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "sourceFinish action:"
                r1.append(r4)
                hk3.e$a r4 = r12.f223295d
                r1.append(r4)
                java.lang.String r4 = " addCount:"
                r1.append(r4)
                hk3.e$d<com.tencent.mm.storage.f4> r4 = r12.f223293b
                int r4 = r4.f223310d
                r1.append(r4)
                java.lang.String r4 = " totalCount:"
                r1.append(r4)
                hk3.e$d<com.tencent.mm.storage.f4> r4 = r12.f223293b
                int r4 = r4.f223312f
                r1.append(r4)
                java.lang.String r4 = " calDuration:"
                r1.append(r4)
                r1.append(r2)
                java.lang.String r2 = " queryCreateTime:"
                r1.append(r2)
                hk3.e$d<com.tencent.mm.storage.f4> r2 = r12.f223293b
                long r2 = r2.f223314h
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                hk3.e$b r0 = r12.f223296e
                if (r0 == 0) goto L_0x01eb
                r0.next()
            L_0x01eb:
                return
            L_0x01ec:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hk3.C76221b.C76222c.next():void");
        }
    }

    /* renamed from: hk3.b$d */
    public static final class C76223d extends C87413o implements C32224a<Pattern> {

        /* renamed from: d */
        public static final C76223d f223297d = new C76223d();

        public C76223d() {
            super(0);
        }

        public Object invoke() {
            return Pattern.compile(C117731d.m166007c().mo182441b(new C110211d()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76221b(C67391b bVar, SparseArray<C72963f4> sparseArray) {
        super(bVar, sparseArray);
        C87412m.m108594g(bVar, "chattingContext");
        C87412m.m108594g(sparseArray, "list");
        this.f223288d = bVar.mo91575p();
        boolean z = C117731d.m166007c().mo182440a(new C35477c()) == 1;
        this.f223291g = z;
        Log.m105925i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "init isFilterSpecialTextNew:%s", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo106475a(C76227e.C76228a aVar, C78430l<C72963f4> lVar, C76227e.C76230d<C72963f4> dVar, C76227e.C32942b bVar) {
        C87412m.m108594g(dVar, "result");
        C76775c.f224573b.mo107029a(dVar);
        if (lVar == null) {
            Log.m105920e("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "[load] null == source!");
            if (bVar != null) {
                bVar.next();
                return;
            }
            return;
        }
        lVar.mo61319r(new C76222c(lVar, dVar, this, aVar, bVar));
    }

    /* renamed from: b */
    public SparseArray<C72963f4> mo106476b(C76227e.C76230d<C72963f4> dVar) {
        C39969i iVar;
        C76227e.C76230d<C72963f4> dVar2 = dVar;
        SparseArray<T> sparseArray = null;
        List list = dVar2 != null ? dVar2.f223309c : null;
        if (list == null) {
            list = new LinkedList();
            Log.m105920e("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "[fillData] list is null!");
        }
        try {
            if (list.size() > 0 && (iVar = this.f223288d) != null) {
                String str = iVar.f107141a;
                C72963f4 f4Var = (C72963f4) list.get(0);
                if (f4Var != null && !Util.isNullOrNil(str) && !Util.isNullOrNil(f4Var.mo108768t()) && !Util.isEqual(f4Var.mo108768t(), str)) {
                    Log.m105925i("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "talker not equal, chattingContextTalker:%s, msgInfoTalker:%s", f4Var.mo108768t(), str);
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160131h(18264, f4Var.mo108768t(), str);
                    nVar.mo175913w(1151, 0, 1);
                    SparseArray<C72963f4> sparseArray2 = this.f223278a;
                    C87412m.m108593f(sparseArray2, "mDataList");
                    return sparseArray2;
                }
            }
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ChattingLoader.ChattingDataCallbackV2", th, "fillData Exception", new Object[0]);
            C115669n.INSTANCE.mo175913w(1151, 1, 1);
        }
        this.f223278a.clear();
        if (dVar2 != null) {
            sparseArray = dVar2.f223317k;
        }
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            this.f223278a.put(sparseArray.keyAt(i), (C72963f4) sparseArray.valueAt(i));
        }
        C67396e eVar = this.f223279b.f193294r;
        eVar.getClass();
        eVar.f193314b = sparseArray;
        SparseArray<C72963f4> sparseArray3 = this.f223278a;
        C87412m.m108593f(sparseArray3, "mDataList");
        return sparseArray3;
    }

    public void cancel() {
        mo106477c();
        C67396e eVar = this.f223279b.f193294r;
        if (!C87412m.m108589b(eVar.f193313a, eVar.f193314b)) {
            eVar.f193313a = eVar.f193314b;
        }
    }
}
