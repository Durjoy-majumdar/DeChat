package gk3;

import com.tencent.p014mm.plugin.scanner.api.ScanImagePHashInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sk2.C101643c;
import sk2.C101648g;
import te3.C51834wh2;

/* renamed from: gk3.l */
public final class C98154l {

    /* renamed from: e */
    public static final HashMap<String, C51834wh2> f287765e = new HashMap<>();

    /* renamed from: f */
    public static final ConcurrentHashMap<Long, C98155a> f287766f = new ConcurrentHashMap<>();

    /* renamed from: a */
    public C98156b f287767a = new C98156b();

    /* renamed from: b */
    public HashMap<String, ArrayList<C98134c>> f287768b = new HashMap<>();

    /* renamed from: c */
    public HashMap<Long, C98132a> f287769c = new HashMap<>();

    /* renamed from: d */
    public C101648g f287770d;

    /* renamed from: gk3.l$a */
    public static final class C98155a {

        /* renamed from: a */
        public ScanImagePHashInfo f287771a;

        /* renamed from: b */
        public String f287772b;
    }

    /* renamed from: gk3.l$b */
    public static final class C98156b {

        /* renamed from: a */
        public final MMKVSlotManager f287773a;

        public C98156b() {
            String s = C75592q0.m90789s();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(s + "__image_gallery_search_preview_slot_mmkv_key__");
            C87412m.m108593f(mmkv, "getMMKV(\"${username}__im…preview_slot_mmkv_key__\")");
            this.f287773a = new MMKVSlotManager(mmkv, 604800);
        }

        /* renamed from: a */
        public final void mo137440a(String str, long j) {
            C51834wh2 wh22;
            boolean z = false;
            Log.m105919d("MicroMsg.ImageSearchPreviewManager", "alvinluo saveRequestInMemory pHash: %s, requestTime: %d", str, Long.valueOf(j));
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z && (wh22 = C98154l.f287765e.get(str)) != null) {
                wh22.f144055e = j;
            }
        }
    }

    /* renamed from: gk3.l$c */
    public static final class C98157c implements C101648g {

        /* renamed from: a */
        public final /* synthetic */ C98154l f287774a;

        public C98157c(C98154l lVar) {
            this.f287774a = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33401c(long r9, sk2.C101647f r11) {
            /*
                r8 = this;
                java.lang.String r0 = "result"
                gy3.C87412m.m108594g(r11, r0)
                gk3.l r0 = r8.f287774a
                r0.getClass()
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Long r3 = java.lang.Long.valueOf(r9)
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "MicroMsg.ImageSearchPreviewManager"
                java.lang.String r5 = "onPreviewCallbackWrapper session: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r5, r2)
                boolean r2 = r11.f297549c
                if (r2 == 0) goto L_0x0033
                java.lang.String r2 = r11.f297557k
                if (r2 == 0) goto L_0x002e
                int r2 = r2.length()
                if (r2 != 0) goto L_0x002c
                goto L_0x002e
            L_0x002c:
                r2 = 0
                goto L_0x002f
            L_0x002e:
                r2 = 1
            L_0x002f:
                if (r2 != 0) goto L_0x0033
                r2 = 2
                goto L_0x0034
            L_0x0033:
                r2 = 1
            L_0x0034:
                java.util.HashMap<java.lang.Long, gk3.a> r3 = r0.f287769c
                java.lang.Long r5 = java.lang.Long.valueOf(r9)
                java.lang.Object r3 = r3.remove(r5)
                gk3.a r3 = (gk3.C98132a) r3
                gk3.b r5 = new gk3.b
                r5.<init>()
                java.lang.System.currentTimeMillis()
                r5.f287722a = r11
                if (r3 == 0) goto L_0x004f
                long r6 = r3.f287721b
                goto L_0x0051
            L_0x004f:
                r6 = 0
            L_0x0051:
                r5.f287723b = r6
                r5.f287724c = r2
                java.lang.String r11 = r0.mo137438a(r3)
                java.util.HashMap<java.lang.String, java.util.ArrayList<gk3.c>> r6 = r0.f287768b
                java.lang.Object r11 = r6.remove(r11)
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                if (r11 == 0) goto L_0x0079
                java.util.Iterator r11 = r11.iterator()
            L_0x0067:
                boolean r6 = r11.hasNext()
                if (r6 == 0) goto L_0x0079
                java.lang.Object r6 = r11.next()
                gk3.c r6 = (gk3.C98134c) r6
                if (r6 == 0) goto L_0x0067
                r6.mo135807a(r9, r5)
                goto L_0x0067
            L_0x0079:
                te3.wh2 r9 = new te3.wh2
                r9.<init>()
                long r10 = java.lang.System.currentTimeMillis()
                r9.f144055e = r10
                r9.f144054d = r2
                gk3.l$b r10 = r0.f287767a
                if (r3 == 0) goto L_0x0095
                sk2.e r11 = r3.f287720a
                if (r11 == 0) goto L_0x0095
                com.tencent.mm.plugin.scanner.api.ScanImagePHashInfo r11 = r11.f297540i
                if (r11 == 0) goto L_0x0095
                java.lang.String r11 = r11.pHash
                goto L_0x0096
            L_0x0095:
                r11 = 0
            L_0x0096:
                r10.getClass()
                if (r11 == 0) goto L_0x00a3
                int r0 = r11.length()
                if (r0 != 0) goto L_0x00a2
                goto L_0x00a3
            L_0x00a2:
                r1 = 0
            L_0x00a3:
                if (r1 == 0) goto L_0x00a6
                goto L_0x00ba
            L_0x00a6:
                java.util.HashMap<java.lang.String, te3.wh2> r0 = gk3.C98154l.f287765e
                r0.put(r11, r9)
                com.tencent.mm.sdk.platformtools.MMKVSlotManager r10 = r10.f287773a
                java.lang.Object r10 = r10.getSlotForWrite()
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r10 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r10
                byte[] r9 = r9.toByteArray()
                r10.encode((java.lang.String) r11, (byte[]) r9)
            L_0x00ba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gk3.C98154l.C98157c.mo33401c(long, sk2.f):void");
        }
    }

    public C98154l() {
        Log.m105925i("MicroMsg.ImageSearchPreviewManager", "alvinluo ImageSearchPreviewManager init cache size: %d", Integer.valueOf(f287765e.size()));
        this.f287770d = new C98157c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r5.f287720a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo137438a(gk3.C98132a r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto L_0x0013
            sk2.e r2 = r5.f287720a
            if (r2 == 0) goto L_0x0013
            long r2 = r2.f297534c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0014
        L_0x0013:
            r2 = r1
        L_0x0014:
            r0.append(r2)
            r2 = 44
            r0.append(r2)
            if (r5 == 0) goto L_0x0024
            sk2.e r5 = r5.f287720a
            if (r5 == 0) goto L_0x0024
            java.lang.String r1 = r5.f297535d
        L_0x0024:
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gk3.C98154l.mo137438a(gk3.a):java.lang.String");
    }

    /* renamed from: b */
    public final void mo137439b() {
        Log.m105919d("MicroMsg.ImageSearchPreviewManager", "alvinluo release previewImage request size: %s", Integer.valueOf(this.f287769c.size()));
        for (Map.Entry<Long, C98132a> key : this.f287769c.entrySet()) {
            long longValue = ((Number) key.getKey()).longValue();
            Log.m105925i("MicroMsg.ImageSearchPreviewManager", "alvinluo cancelPreviewImage session: %d", Long.valueOf(longValue));
            ((C101643c) C86312j.m106911c(C101643c.class)).mo140874Un(longValue);
        }
        this.f287768b.clear();
    }
}
