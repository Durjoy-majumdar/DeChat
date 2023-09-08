package bc1;

import android.database.Cursor;
import cc1.C92413a;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C31543z5;
import ex0.C45696d;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import p823sg.C90193h;
import yb1.C38987b;
import zt3.C119157j;

/* renamed from: bc1.c */
public class C92241c {

    /* renamed from: a */
    public ConcurrentLinkedDeque<String> f264005a = new ConcurrentLinkedDeque<>();

    /* renamed from: b */
    public ConcurrentHashMap<String, C92413a> f264006b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public boolean f264007c;

    /* renamed from: d */
    public boolean f264008d = true;

    /* renamed from: e */
    public C29060q f264009e = new C92242a();

    /* renamed from: f */
    public Future f264010f;

    /* renamed from: g */
    public Runnable f264011g = new C92243b();

    /* renamed from: bc1.c$a */
    public class C92242a extends C29060q.C29061a {
        public C92242a() {
        }

        public void onNetworkChange(int i) {
            Future future;
            if (i == 0 || i == 3 || i == 2 || i == 5) {
                C92241c.this.f264008d = false;
            } else {
                try {
                    C92241c.this.f264008d = true;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.offline.FavOfflineService", e, "", new Object[0]);
                    return;
                }
            }
            boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
            Log.m105925i("MicroMsg.offline.FavOfflineService", "onNetworkChange st:%d hasNet:%s isWifi:%B, lastIsWifi:%B", Integer.valueOf(i), Boolean.valueOf(C92241c.this.f264008d), Boolean.valueOf(isWifi), Boolean.valueOf(C92241c.this.f264007c));
            C92241c cVar = C92241c.this;
            if (cVar.f264007c) {
                cVar.f264007c = isWifi;
                if (!isWifi && (future = cVar.f264010f) != null) {
                    future.cancel(false);
                    return;
                }
                return;
            }
            cVar.f264007c = isWifi;
            if (isWifi) {
                cVar.mo126239i();
            }
        }
    }

    /* renamed from: bc1.c$b */
    public class C92243b implements Runnable {

        /* renamed from: d */
        public ConcurrentLinkedQueue<String> f264013d = new ConcurrentLinkedQueue<>();

        /* renamed from: e */
        public ConcurrentHashMap<String, String> f264014e = new ConcurrentHashMap<>();

        /* renamed from: f */
        public CountDownLatch f264015f;

        public C92243b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x0371  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x046b  */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x02e0 A[EDGE_INSN: B:134:0x02e0->B:84:0x02e0 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0209  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x02ea  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo126241a(cc1.C92413a r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
            /*
                r22 = this;
                r1 = r22
                r0 = r23
                r2 = r24
                r3 = r25
                java.lang.Class<yb1.b> r4 = yb1.C38987b.class
                boolean r5 = r0.f264462F
                java.lang.String r6 = "MicroMsg.offline.FavOfflineService"
                r7 = 0
                if (r5 == 0) goto L_0x0022
                bc1.c r5 = bc1.C92241c.this
                boolean r5 = r5.f264007c
                if (r5 != 0) goto L_0x0022
                java.lang.String r0 = "current not wifi"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                bc1.c r0 = bc1.C92241c.this
                bc1.C92241c.m115978e(r0, r2)
                return r7
            L_0x0022:
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r26)
                r8 = 2
                r9 = 1
                if (r5 == 0) goto L_0x004a
                java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106432N(r25)     // Catch:{ Exception -> 0x002f }
                goto L_0x004c
            L_0x002f:
                r0 = move-exception
                r2 = r0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                java.lang.Class r3 = r2.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r0[r7] = r3
                java.lang.String r2 = r2.getMessage()
                r0[r9] = r2
                java.lang.String r2 = "replaceImagUrl Exception:%s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r0)
                return r7
            L_0x004a:
                r5 = r26
            L_0x004c:
                java.lang.String r10 = "<img.*?>"
                java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)
                java.lang.String r11 = "\"http?(.*?)(\"|>|\\s+)"
                java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)
                java.util.regex.Matcher r10 = r10.matcher(r5)
            L_0x005c:
                boolean r12 = r10.find()
                if (r12 == 0) goto L_0x0089
                java.lang.String r12 = r10.group()
                java.util.regex.Matcher r12 = r11.matcher(r12)
                boolean r13 = r12.find()
                if (r13 == 0) goto L_0x005c
                java.lang.String r12 = r12.group()
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r13 != 0) goto L_0x005c
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r13 = r1.f264013d
                int r14 = r12.length()
                int r14 = r14 - r9
                java.lang.String r12 = r12.substring(r9, r14)
                r13.add(r12)
                goto L_0x005c
            L_0x0089:
                java.lang.Object[] r10 = new java.lang.Object[r9]
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r11 = r1.f264013d
                int r11 = r11.size()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r10[r7] = r11
                java.lang.String r11 = "replaceImagUrl pics.size:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r10 = r1.f264013d
                int r10 = r10.size()
                if (r10 > 0) goto L_0x00a6
                return r9
            L_0x00a6:
                java.lang.String r10 = r0.field_imgDirPath
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                java.lang.String r11 = "/"
                if (r10 == 0) goto L_0x011b
                java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106458s(r25)
                android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r25)
                java.lang.String r13 = r12.getPath()
                if (r13 == 0) goto L_0x00d8
                java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r7, r7)
                java.lang.String r14 = r12.getPath()
                boolean r14 = r14.equals(r13)
                if (r14 != 0) goto L_0x00d8
                android.net.Uri$Builder r12 = r12.buildUpon()
                android.net.Uri$Builder r12 = r12.path(r13)
                android.net.Uri r12 = r12.build()
            L_0x00d8:
                java.lang.String r12 = r12.getPath()
                int r13 = r12.lastIndexOf(r11)
                if (r13 >= 0) goto L_0x00e3
                goto L_0x00e8
            L_0x00e3:
                int r13 = r13 + r9
                java.lang.String r12 = r12.substring(r13)
            L_0x00e8:
                byte[] r12 = r12.getBytes()
                java.lang.String r12 = p823sg.C90193h.m112878f(r12)
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r13 == 0) goto L_0x00f9
                java.lang.String r12 = "imagdir"
                goto L_0x0105
            L_0x00f9:
                int r13 = r12.length()
                r14 = 20
                if (r13 <= r14) goto L_0x0105
                java.lang.String r12 = r12.substring(r7, r14)
            L_0x0105:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r10)
                r13.append(r11)
                r13.append(r12)
                java.lang.String r10 = r13.toString()
                com.tencent.p014mm.vfs.C86013q1.m106461v(r10)
                goto L_0x0151
            L_0x011b:
                java.lang.String r10 = r0.field_imgDirPath
                android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r10)
                java.lang.String r13 = r12.getPath()
                if (r13 == 0) goto L_0x0141
                java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r7, r7)
                java.lang.String r14 = r12.getPath()
                boolean r14 = r14.equals(r13)
                if (r14 != 0) goto L_0x0141
                android.net.Uri$Builder r12 = r12.buildUpon()
                android.net.Uri$Builder r12 = r12.path(r13)
                android.net.Uri r12 = r12.build()
            L_0x0141:
                java.lang.String r12 = r12.getPath()
                int r13 = r12.lastIndexOf(r11)
                if (r13 >= 0) goto L_0x014c
                goto L_0x0151
            L_0x014c:
                int r13 = r13 + r9
                java.lang.String r12 = r12.substring(r13)
            L_0x0151:
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r14 = r1.f264013d
                java.util.Iterator r14 = r14.iterator()
            L_0x015c:
                boolean r15 = r14.hasNext()
                if (r15 == 0) goto L_0x0178
                java.lang.Object r15 = r14.next()
                java.lang.String r15 = (java.lang.String) r15
                byte[] r15 = r15.getBytes()
                java.lang.String r15 = p823sg.C90193h.m112878f(r15)
                java.lang.String r15 = bc1.C92241c.m115979g(r15)
                r13.add(r15)
                goto L_0x015c
            L_0x0178:
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r24)
                java.lang.String r15 = "MicroMsg.offline.FavOfflineHelp"
                if (r14 == 0) goto L_0x0188
                java.lang.String r13 = "updateFavOffline: url is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)
            L_0x0186:
                r8 = 0
                goto L_0x01dd
            L_0x0188:
                int r14 = r13.size()
                if (r14 != 0) goto L_0x0199
                java.lang.Object[] r13 = new java.lang.Object[r9]
                r13[r7] = r2
                java.lang.String r14 = "updateFavOffline: favOffline(%s) urls is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r14, r13)
                goto L_0x0186
            L_0x0199:
                java.lang.String r14 = ","
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r13, r14)
                di3.d r14 = di3.C86312j.m106911c(r4)
                yb1.b r14 = (yb1.C38987b) r14
                cc1.b r14 = r14.wx0()
                cc1.a r14 = r14.mo126415Lo(r2)
                if (r14 != 0) goto L_0x01ba
                java.lang.Object[] r13 = new java.lang.Object[r9]
                r13[r7] = r2
                java.lang.String r14 = "updateFavOffline: favOffline(%s) is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r14, r13)
                goto L_0x0186
            L_0x01ba:
                java.lang.String r8 = r14.field_imgPaths
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 != 0) goto L_0x01cd
                java.lang.Object[] r8 = new java.lang.Object[r9]
                r8[r7] = r2
                java.lang.String r13 = "updateFavOffline: favOffline(%s) field_imgPaths isn't null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r13, r8)
                goto L_0x0186
            L_0x01cd:
                r14.field_imgPaths = r13
                di3.d r8 = di3.C86312j.m106911c(r4)
                yb1.b r8 = (yb1.C38987b) r8
                cc1.b r8 = r8.wx0()
                boolean r8 = r8.mo126416Yt(r14)
            L_0x01dd:
                java.lang.Object[] r13 = new java.lang.Object[r9]
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                r13[r7] = r8
                java.lang.String r8 = "updateUrlsResult:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r13)
                long r13 = eb0.C31543z5.m39453c()
                java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r15 = r1.f264013d
                int r15 = r15.size()
                r8.<init>(r15)
                r1.f264015f = r8
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r8 = r1.f264013d
                java.util.Iterator r8 = r8.iterator()
                r15 = 0
            L_0x0203:
                boolean r16 = r8.hasNext()
                if (r16 == 0) goto L_0x02e0
                java.lang.Object r16 = r8.next()
                r7 = r16
                java.lang.String r7 = (java.lang.String) r7
                boolean r9 = r0.f264462F
                if (r9 == 0) goto L_0x022f
                di3.d r9 = di3.C86312j.m106911c(r4)
                yb1.b r9 = (yb1.C38987b) r9
                bc1.c r9 = r9.vx0()
                boolean r9 = r9.f264007c
                if (r9 != 0) goto L_0x022f
                java.lang.String r0 = "current not wifi, break off downloadImg"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                bc1.c r0 = bc1.C92241c.this
                bc1.C92241c.m115978e(r0, r2)
                goto L_0x02e0
            L_0x022f:
                int r15 = r15 + 1
                byte[] r9 = r7.getBytes()
                java.lang.String r9 = p823sg.C90193h.m112878f(r9)
                boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r16 == 0) goto L_0x024a
                java.util.concurrent.CountDownLatch r7 = r1.f264015f
                r7.countDown()
                r16 = r4
                r18 = r5
                goto L_0x02d6
            L_0x024a:
                java.lang.String r9 = bc1.C92241c.m115979g(r9)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r10)
                r0.append(r11)
                r0.append(r9)
                java.lang.String r0 = r0.toString()
                boolean r16 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                if (r16 == 0) goto L_0x02a9
                r16 = r4
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r18 = r5
                java.util.concurrent.CountDownLatch r5 = r1.f264015f
                long r19 = r5.getCount()
                java.lang.Long r5 = java.lang.Long.valueOf(r19)
                r17 = 0
                r4[r17] = r5
                r5 = 1
                r4[r5] = r7
                r5 = 2
                r4[r5] = r0
                java.lang.String r0 = "replaceImagUrl num:%s url:%s fullPath(%s) exist"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r4)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r1.f264014e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "./"
                r4.append(r5)
                r4.append(r12)
                r4.append(r11)
                r4.append(r9)
                java.lang.String r4 = r4.toString()
                r0.put(r7, r4)
                java.util.concurrent.CountDownLatch r0 = r1.f264015f
                r0.countDown()
                goto L_0x02d6
            L_0x02a9:
                r16 = r4
                r18 = r5
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r4 = 0
                r5[r4] = r7
                r4 = 1
                r5[r4] = r0
                java.lang.String r4 = "replaceImagUrl url:%s fullPath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r5)
                hc0.c$b r4 = new hc0.c$b
                r4.<init>()
                r4.f59350f = r0
                r5 = 1
                r4.f59346b = r5
                gc0.a r0 = gc0.C20828a.m22825b()
                hc0.c r4 = r4.mo32666a()
                bc1.d r5 = new bc1.d
                r5.<init>(r1, r7, r12, r9)
                r0.mo32515d(r7, r4, r5)
            L_0x02d6:
                r0 = r23
                r4 = r16
                r5 = r18
                r7 = 0
                r9 = 1
                goto L_0x0203
            L_0x02e0:
                r18 = r5
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r0 = r1.f264013d
                int r0 = r0.size()
                if (r15 >= r0) goto L_0x02fc
                r0 = 0
            L_0x02eb:
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r4 = r1.f264013d
                int r4 = r4.size()
                int r4 = r4 - r15
                if (r0 >= r4) goto L_0x02fc
                java.util.concurrent.CountDownLatch r4 = r1.f264015f
                r4.countDown()
                int r0 = r0 + 1
                goto L_0x02eb
            L_0x02fc:
                java.util.concurrent.CountDownLatch r0 = r1.f264015f     // Catch:{ Exception -> 0x0307 }
                r4 = 300(0x12c, double:1.48E-321)
                java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Exception -> 0x0307 }
                boolean r0 = r0.await(r4, r7)     // Catch:{ Exception -> 0x0307 }
                goto L_0x0323
            L_0x0307:
                r0 = move-exception
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.Class r4 = r0.getClass()
                java.lang.String r4 = r4.getSimpleName()
                r7 = 0
                r5[r7] = r4
                java.lang.String r0 = r0.getMessage()
                r4 = 1
                r5[r4] = r0
                java.lang.String r0 = "countDownLatch:%s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r5)
                r0 = 0
            L_0x0323:
                long r4 = eb0.C31543z5.m39453c()
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r7 = r1.f264014e
                int r7 = r7.size()
                r8 = 5
                java.lang.Object[] r9 = new java.lang.Object[r8]
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
                r12 = 0
                r9[r12] = r11
                java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
                r12 = 1
                r9[r12] = r11
                java.lang.Long r11 = java.lang.Long.valueOf(r13)
                r12 = 2
                r9[r12] = r11
                java.lang.Long r11 = java.lang.Long.valueOf(r4)
                r12 = 3
                r9[r12] = r11
                long r11 = r4 - r13
                java.lang.Long r16 = java.lang.Long.valueOf(r11)
                r19 = 4
                r9[r19] = r16
                java.lang.String r8 = "isNoExceedTime:%s finishNum:%s startTime:%s endTime:%s diff:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r9)
                if (r0 == 0) goto L_0x0360
                if (r7 >= r15) goto L_0x036f
            L_0x0360:
                int r0 = bc1.C92240b.m115973l(r24)
                r8 = -1
                if (r0 == r8) goto L_0x036f
                r8 = 3
                if (r0 >= r8) goto L_0x036f
                bc1.c r0 = bc1.C92241c.this
                bc1.C92241c.m115978e(r0, r2)
            L_0x036f:
                if (r7 <= 0) goto L_0x046b
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r1.f264014e
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
                r8 = r18
            L_0x037d:
                boolean r9 = r0.hasNext()
                if (r9 == 0) goto L_0x03e2
                java.lang.Object r9 = r0.next()
                java.lang.String r9 = (java.lang.String) r9
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r15 != 0) goto L_0x03d9
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r15 = r1.f264014e
                java.lang.Object r15 = r15.get(r9)
                java.lang.String r15 = (java.lang.String) r15
                boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r16 != 0) goto L_0x03d9
                r16 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r20 = r11
                java.lang.String r11 = "data-src=\""
                r0.append(r11)
                r0.append(r9)
                java.lang.String r0 = r0.toString()
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "src=\""
                r11.append(r12)
                r11.append(r15)
                java.lang.String r11 = r11.toString()
                java.lang.String r0 = r8.replace(r0, r11)
                r8 = 2
                java.lang.Object[] r11 = new java.lang.Object[r8]
                r8 = 0
                r11[r8] = r9
                r8 = 1
                r11[r8] = r15
                java.lang.String r8 = "replaceImagUrl url:%s replacePath:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r8, r11)
                r8 = r0
                goto L_0x03dd
            L_0x03d9:
                r16 = r0
                r20 = r11
            L_0x03dd:
                r0 = r16
                r11 = r20
                goto L_0x037d
            L_0x03e2:
                r20 = r11
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r25)
                if (r0 == 0) goto L_0x0412
                byte[] r8 = r8.getBytes()
                int r8 = com.tencent.p014mm.vfs.C86013q1.m106437S(r3, r8)
                r9 = 0
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r8, (int) r9)
                if (r11 == 0) goto L_0x0409
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r11 = r1.f264013d
                int r11 = r11.size()
                if (r7 != r11) goto L_0x0403
                r11 = 2
                goto L_0x0404
            L_0x0403:
                r11 = 1
            L_0x0404:
                boolean r17 = bc1.C92240b.m115972k(r2, r3, r10, r11)
                goto L_0x040d
            L_0x0409:
                boolean r17 = bc1.C92240b.m115972k(r2, r3, r10, r9)
            L_0x040d:
                r2 = r17
                r17 = r8
                goto L_0x0416
            L_0x0412:
                r9 = 0
                r2 = 0
                r17 = 0
            L_0x0416:
                r3 = 9
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r8 = r1.f264013d
                int r8 = r8.size()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r3[r9] = r8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r8 = 1
                r3[r8] = r7
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r7 = r1.f264014e
                int r7 = r7.size()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r8 = 2
                r3[r8] = r7
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r7 = 3
                r3[r7] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
                r3[r19] = r0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                r2 = 5
                r3[r2] = r0
                r0 = 6
                java.lang.Long r2 = java.lang.Long.valueOf(r13)
                r3[r0] = r2
                r0 = 7
                java.lang.Long r2 = java.lang.Long.valueOf(r4)
                r3[r0] = r2
                r0 = 8
                java.lang.Long r2 = java.lang.Long.valueOf(r20)
                r3[r0] = r2
                java.lang.String r0 = "replaceImagUrl pics(%s) finishNum(%s) imgPathHashMap(%s) deleteResult(%s) writeResult(%s) updateResult(%s) startTime(%s) endTime(%s) diff(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r3)
                goto L_0x0471
            L_0x046b:
                java.lang.String r0 = "replaceImagUrl imgPathHashMap.size() == 0"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            L_0x0471:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: bc1.C92241c.C92243b.mo126241a(cc1.a, java.lang.String, java.lang.String, java.lang.String):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0166, code lost:
            if (r8 == null) goto L_0x016f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0168, code lost:
            r8.getConnectionManager().shutdown();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x016f, code lost:
            r13.f264016g.mo126240j();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0196, code lost:
            if (r8 != null) goto L_0x0168;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0199, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01a2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                bc1.c r0 = bc1.C92241c.this
                java.util.concurrent.ConcurrentLinkedDeque r0 = r0.f264005a
                java.lang.Object r0 = r0.remove()
                java.lang.String r0 = (java.lang.String) r0
                bc1.c r1 = bc1.C92241c.this
                java.util.concurrent.ConcurrentHashMap r1 = r1.f264006b
                java.lang.Object r1 = r1.get(r0)
                cc1.a r1 = (cc1.C92413a) r1
                java.lang.String r2 = "MicroMsg.offline.FavOfflineService"
                if (r1 == 0) goto L_0x01af
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r3 == 0) goto L_0x0024
                goto L_0x01af
            L_0x0024:
                boolean r3 = r1.f264462F
                if (r3 == 0) goto L_0x003f
                bc1.c r3 = bc1.C92241c.this
                boolean r3 = r3.mo126238h()
                if (r3 != 0) goto L_0x003f
                java.lang.String r1 = "current not wifi"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                bc1.c r1 = bc1.C92241c.this
                java.util.concurrent.ConcurrentLinkedDeque r1 = r1.f264005a
                r1.add(r0)
                return
            L_0x003f:
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r3 = r13.f264013d
                r3.clear()
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r13.f264014e
                r3.clear()
                r3 = 0
                r13.f264015f = r3
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                boolean r5 = r1.f264462F
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r6 = 0
                r4[r6] = r5
                bc1.c r5 = bc1.C92241c.this
                boolean r5 = r5.f264007c
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r7 = 1
                r4[r7] = r5
                r5 = 2
                r4[r5] = r0
                int r8 = r1.field_status
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r9 = 3
                r4[r9] = r8
                java.lang.String r8 = "downloadTask isMustWifi:%s iswifi:%s url:%s status:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r4)
                java.lang.String r4 = bc1.C92241c.m115977d(r0)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                if (r8 == 0) goto L_0x008b
                java.lang.String r0 = "downloadTask path is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                bc1.c r0 = bc1.C92241c.this
                r0.mo126240j()
                return
            L_0x008b:
                int r8 = r1.field_status     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                java.lang.String r10 = ""
                if (r8 != 0) goto L_0x015b
                boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                if (r8 == 0) goto L_0x00a6
                java.lang.String r8 = "path(%s) exist!"
                java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                r9[r6] = r4     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r9)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                r13.mo126241a(r1, r0, r4, r10)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                goto L_0x0160
            L_0x00a6:
                org.apache.http.client.HttpClient r8 = com.tencent.p014mm.network.C81035d.m98962c()     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
                org.apache.http.client.methods.HttpGet r10 = new org.apache.http.client.methods.HttpGet     // Catch:{ Exception -> 0x0159 }
                r10.<init>(r0)     // Catch:{ Exception -> 0x0159 }
                org.apache.http.HttpResponse r3 = r8.execute(r10)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                org.apache.http.StatusLine r11 = r3.getStatusLine()     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                int r11 = r11.getStatusCode()     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r12 = 200(0xc8, float:2.8E-43)
                if (r11 != r12) goto L_0x012f
                org.apache.http.HttpEntity r3 = r3.getEntity()     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                java.lang.String r11 = "utf-8"
                java.lang.String r3 = org.apache.http.util.EntityUtils.toString(r3, r11)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                if (r11 != 0) goto L_0x0112
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                if (r11 != 0) goto L_0x0112
                java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106458s(r4)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                com.tencent.p014mm.vfs.C86013q1.m106461v(r11)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                byte[] r11 = r3.getBytes()     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                int r11 = com.tencent.p014mm.vfs.C86013q1.m106437S(r4, r11)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r11, (int) r6)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                if (r12 == 0) goto L_0x0104
                boolean r11 = bc1.C92240b.m115971j(r0, r4, r7)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                java.lang.String r12 = "downloadTask download html(%s) path(%s) success:%s"
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r9[r6] = r0     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r9[r7] = r4     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r9[r5] = r11     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r9)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r13.mo126241a(r1, r0, r4, r3)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                goto L_0x0151
            L_0x0104:
                java.lang.String r0 = "downloadTask writefile fail(%s)"
                java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r1[r6] = r3     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                goto L_0x0151
            L_0x0112:
                java.lang.String r0 = "downloadTask html:%s path:%s"
                java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                java.lang.String r11 = "null"
                if (r9 == 0) goto L_0x0120
                r3 = r11
            L_0x0120:
                r1[r6] = r3     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                if (r3 == 0) goto L_0x0129
                r4 = r11
            L_0x0129:
                r1[r7] = r4     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r0, r1)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                goto L_0x0151
            L_0x012f:
                int r1 = bc1.C92240b.m115973l(r0)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                java.lang.String r3 = "downloadTask http execute fail(%s) result(%s)"
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r4[r6] = r9     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r4[r7] = r9     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                r3 = -1
                if (r1 == r3) goto L_0x0151
                r3 = 5
                if (r1 >= r3) goto L_0x0151
                bc1.c r1 = bc1.C92241c.this     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
                bc1.C92241c.m115978e(r1, r0)     // Catch:{ Exception -> 0x0156, all -> 0x0153 }
            L_0x0151:
                r3 = r10
                goto L_0x0161
            L_0x0153:
                r0 = move-exception
                r3 = r10
                goto L_0x019b
            L_0x0156:
                r0 = move-exception
                r3 = r10
                goto L_0x017a
            L_0x0159:
                r0 = move-exception
                goto L_0x017a
            L_0x015b:
                if (r8 != r7) goto L_0x0160
                r13.mo126241a(r1, r0, r4, r10)     // Catch:{ Exception -> 0x0178, all -> 0x0175 }
            L_0x0160:
                r8 = r3
            L_0x0161:
                if (r3 == 0) goto L_0x0166
                r3.abort()
            L_0x0166:
                if (r8 == 0) goto L_0x016f
            L_0x0168:
                org.apache.http.conn.ClientConnectionManager r0 = r8.getConnectionManager()
                r0.shutdown()
            L_0x016f:
                bc1.c r0 = bc1.C92241c.this
                r0.mo126240j()
                goto L_0x0199
            L_0x0175:
                r0 = move-exception
                r8 = r3
                goto L_0x019b
            L_0x0178:
                r0 = move-exception
                r8 = r3
            L_0x017a:
                java.lang.String r1 = "downloadTask Exception: %s %s"
                java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ all -> 0x019a }
                java.lang.Class r5 = r0.getClass()     // Catch:{ all -> 0x019a }
                java.lang.String r5 = r5.getSimpleName()     // Catch:{ all -> 0x019a }
                r4[r6] = r5     // Catch:{ all -> 0x019a }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x019a }
                r4[r7] = r0     // Catch:{ all -> 0x019a }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r4)     // Catch:{ all -> 0x019a }
                if (r3 == 0) goto L_0x0196
                r3.abort()
            L_0x0196:
                if (r8 == 0) goto L_0x016f
                goto L_0x0168
            L_0x0199:
                return
            L_0x019a:
                r0 = move-exception
            L_0x019b:
                if (r3 == 0) goto L_0x01a0
                r3.abort()
            L_0x01a0:
                if (r8 == 0) goto L_0x01a9
                org.apache.http.conn.ClientConnectionManager r1 = r8.getConnectionManager()
                r1.shutdown()
            L_0x01a9:
                bc1.c r1 = bc1.C92241c.this
                r1.mo126240j()
                throw r0
            L_0x01af:
                java.lang.String r0 = "favOffline or url is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bc1.C92241c.C92243b.run():void");
        }
    }

    public C92241c() {
        if (!C92240b.m115969h()) {
            Log.m105924i("MicroMsg.offline.FavOfflineService", "fav offline switch is close");
            return;
        }
        this.f264007c = NetStatusUtil.isWifi(MMApplicationContext.getContext());
        C86709a0.m107529k().mo121126a(this.f264009e);
        mo126239i();
    }

    /* renamed from: d */
    public static String m115977d(String str) {
        String f = C90193h.m112878f(str.getBytes());
        if (Util.isNullOrNil(f)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("wcf://favoffline");
        int length = f.length();
        int i = 0;
        while (i < length) {
            sb.append(XVFSFile.SEPARATOR_CHAR);
            int i2 = i + 20;
            if (i2 < length) {
                sb.append(f.substring(i, i2));
                i = i2;
            } else {
                sb.append(f.substring(i, length));
                i = length;
            }
        }
        sb.append("/");
        if (f.length() > 20) {
            sb.append(f.substring(0, 20));
        } else {
            sb.append(f);
        }
        return sb.toString();
    }

    /* renamed from: e */
    public static void m115978e(C92241c cVar, String str) {
        cVar.getClass();
        C92413a Lo = ((C38987b) C86312j.m106911c(C38987b.class)).wx0().mo126415Lo(str);
        if (Lo != null) {
            Log.m105925i("MicroMsg.offline.FavOfflineService", "addUnfinishedTask url:%s", str);
            cVar.f264005a.add(str);
            cVar.f264006b.put(str, Lo);
            cVar.mo126240j();
            return;
        }
        Log.m105919d("MicroMsg.offline.FavOfflineService", "addUnfinishedTask FavOffline is null!!(url:%s)", str);
    }

    /* renamed from: g */
    public static String m115979g(String str) {
        if (Util.isNullOrNil(str)) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            sb.append("/");
            int i2 = i + 20;
            if (i2 < length) {
                sb.append(str.substring(i, i2));
                i = i2;
            } else {
                sb.append(str.substring(i, length));
                i = length;
            }
        }
        return sb.length() > 1 ? sb.substring(1) : "null";
    }

    /* renamed from: f */
    public void mo126237f(String str) {
        Class cls = C38987b.class;
        if (!Util.isNullOrNil(str)) {
            boolean h = C92240b.m115969h();
            boolean B60 = ((C45696d) C86709a0.m107533q(C45696d.class)).B60(str);
            boolean z = ((C38987b) C86312j.m106911c(cls)).wx0().mo126415Lo(str) != null;
            Log.m105925i("MicroMsg.offline.FavOfflineService", "add isOpen:%s isMpUrl:%s isOffline:%s", Boolean.valueOf(h), Boolean.valueOf(B60), Boolean.valueOf(z));
            if (h && B60 && !z) {
                C92413a aVar = new C92413a();
                aVar.field_url = str;
                aVar.field_favTime = C31543z5.m39453c();
                ((C38987b) C86312j.m106911c(cls)).wx0().insert(aVar);
                Log.m105925i("MicroMsg.offline.FavOfflineService", "add url:%s", str);
                C92413a Lo = ((C38987b) C86312j.m106911c(cls)).wx0().mo126415Lo(str);
                if (Lo != null) {
                    this.f264005a.add(str);
                    this.f264006b.put(str, Lo);
                    mo126240j();
                }
            }
        }
    }

    /* renamed from: h */
    public boolean mo126238h() {
        return this.f264007c;
    }

    /* renamed from: i */
    public final void mo126239i() {
        Cursor query = ((C38987b) C86312j.m106911c(C38987b.class)).wx0().f264465d.query("FavOffline", C92413a.f264461G.columns, "status!=? and failNum<?", new String[]{"2", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY}, (String) null, (String) null, "rowid");
        ArrayList<C92413a> arrayList = null;
        if (query != null) {
            ArrayList arrayList2 = new ArrayList();
            while (query.moveToNext()) {
                C92413a aVar = new C92413a();
                aVar.convertFrom(query);
                arrayList2.add(aVar);
            }
            if (arrayList2.size() != 0) {
                arrayList = arrayList2;
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            for (C92413a aVar2 : arrayList) {
                if (aVar2 != null && !Util.isNullOrNil(aVar2.field_url)) {
                    this.f264005a.add(aVar2.field_url);
                    this.f264006b.put(aVar2.field_url, aVar2);
                }
            }
        }
        Log.m105925i("MicroMsg.offline.FavOfflineService", "resetDownloadTask downloadUrlList.size:%s", Integer.valueOf(this.f264005a.size()));
        mo126240j();
    }

    /* renamed from: j */
    public void mo126240j() {
        if (this.f264005a.isEmpty()) {
            Log.m105924i("MicroMsg.offline.FavOfflineService", "run() downloadUrlList is empty!");
            return;
        }
        Future future = this.f264010f;
        if (future == null || future.isDone()) {
            this.f264010f = ((C119157j) C119157j.f356862d).mo183875f(this.f264011g);
        }
    }
}
