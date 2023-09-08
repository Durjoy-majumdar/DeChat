package k11;

import android.content.Intent;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81427p;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import gy3.C8479f0;
import gy3.C87412m;
import h11.C98311d;
import i11.C98580c;
import java.util.List;
import nj3.C76912y0;
import qo3.C77398g;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: k11.p */
public final class C108822p implements C98580c {

    /* renamed from: a */
    public final /* synthetic */ List<String> f325862a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f325863b;

    /* renamed from: c */
    public final /* synthetic */ CleanCacheUI f325864c;

    /* renamed from: d */
    public final /* synthetic */ C108809b f325865d;

    /* renamed from: e */
    public final /* synthetic */ long f325866e;

    /* renamed from: f */
    public final /* synthetic */ long f325867f;

    /* renamed from: g */
    public final /* synthetic */ C89779i0 f325868g;

    /* renamed from: h */
    public final /* synthetic */ C8479f0<List<C108808a<C81427p>>> f325869h;

    /* renamed from: i */
    public final /* synthetic */ boolean f325870i;

    /* renamed from: k11.p$a */
    public static final class C108823a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f325871d;

        /* renamed from: e */
        public final /* synthetic */ byte[] f325872e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<List<C108808a<C81427p>>> f325873f;

        /* renamed from: g */
        public final /* synthetic */ CleanCacheUI f325874g;

        /* renamed from: h */
        public final /* synthetic */ C108809b f325875h;

        /* renamed from: i */
        public final /* synthetic */ long f325876i;

        /* renamed from: j */
        public final /* synthetic */ boolean f325877j;

        public C108823a(C89779i0 i0Var, byte[] bArr, C8479f0<List<C108808a<C81427p>>> f0Var, CleanCacheUI cleanCacheUI, C108809b bVar, long j, boolean z) {
            this.f325871d = i0Var;
            this.f325872e = bArr;
            this.f325873f = f0Var;
            this.f325874g = cleanCacheUI;
            this.f325875h = bVar;
            this.f325876i = j;
            this.f325877j = z;
        }

        public final void run() {
            long j;
            this.f325871d.dismiss();
            byte[] bArr = this.f325872e;
            CleanCacheUI cleanCacheUI = this.f325874g;
            int length = bArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                j = 0;
                if (i >= length) {
                    break;
                }
                int i3 = i2 + 1;
                if (bArr[i] != Byte.MAX_VALUE) {
                    cleanCacheUI.f312128j[i2] = 0;
                }
                i++;
                i2 = i3;
            }
            T t = this.f325873f.f27484d;
            if (t != null) {
                long[] jArr = this.f325874g.f312128j;
                for (C108808a aVar : (Iterable) t) {
                    j += aVar.f325818c;
                }
                jArr[6] = j;
                this.f325875h.mo159909g(3, (List) this.f325873f.f27484d);
            }
            this.f325875h.mo159916h(this.f325874g.f312128j);
            this.f325874g.f312129n.invoke();
            CleanCacheUI cleanCacheUI2 = this.f325874g;
            Intent intent = new Intent();
            intent.putExtra("tagsResult", this.f325874g.f312128j);
            C13598b0 b0Var = C13598b0.f38549a;
            cleanCacheUI2.setResult(-1, intent);
            String string = this.f325874g.getString(C0966R.string.beb, new Object[]{C98311d.m127053b(this.f325876i)});
            C87412m.m108593f(string, "getString(R.string.clean….formatSize(checkedSize))");
            if (this.f325877j) {
                CleanCacheUI cleanCacheUI3 = this.f325874g;
                cleanCacheUI3.getClass();
                C77426q qVar = new C77426q(cleanCacheUI3);
                qVar.mo107595g(string + 10 + cleanCacheUI3.getString(C0966R.string.m2e, new Object[]{5}));
                qVar.mo107589a(false);
                qVar.mo107601m(C0966R.string.m2d);
                qVar.mo107593e(new C76487j(cleanCacheUI3));
                qVar.mo107603o();
                C77398g gVar = qVar.f225839c;
                C9553k kVar = new C9553k(gVar, (TextView) gVar.getContentView().findViewById(C0966R.C0970id.guo), string, cleanCacheUI3);
                C119157j jVar = (C119157j) C119157j.f356862d;
                jVar.getClass();
                jVar.mo183892w(kVar, 1000, false);
                return;
            }
            C76912y0.m92768g(this.f325874g, string);
        }
    }

    public C108822p(List<String> list, byte[] bArr, CleanCacheUI cleanCacheUI, C108809b bVar, long j, long j2, C89779i0 i0Var, C8479f0<List<C108808a<C81427p>>> f0Var, boolean z) {
        this.f325862a = list;
        this.f325863b = bArr;
        this.f325864c = cleanCacheUI;
        this.f325865d = bVar;
        this.f325866e = j;
        this.f325867f = j2;
        this.f325868g = i0Var;
        this.f325869h = f0Var;
        this.f325870i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01ee  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137949a(boolean r32) {
        /*
            r31 = this;
            r1 = r31
            java.lang.String r0 = "EnMicroMsg.db"
            if (r32 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.List<java.lang.String> r2 = r1.f325862a
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x001e
            java.lang.Class<kr0.h0> r2 = kr0.C88274h0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            kr0.h0 r2 = (kr0.C88274h0) r2
            java.util.List<java.lang.String> r4 = r1.f325862a
            r2.mo113304Ss(r4)
        L_0x001e:
            byte[] r2 = r1.f325863b
            r4 = 6
            byte r2 = r2[r4]
            r5 = 127(0x7f, float:1.78E-43)
            if (r2 == r5) goto L_0x0049
            com.tencent.mm.autogen.events.AppBrandFileCleanEvent r2 = new com.tencent.mm.autogen.events.AppBrandFileCleanEvent
            r2.<init>()
            com.tencent.mm.autogen.events.AppBrandFileCleanEvent$a r5 = r2.f236127d
            java.lang.String r6 = "ACTION_CLEAN_APPBRAND_COMMON_SPACE"
            r5.f236128a = r6
            r2.publish()
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI r2 = r1.f325864c
            boolean r2 = r2.f312124f
            if (r2 == 0) goto L_0x0049
            com.tencent.mm.autogen.events.AppBrandFileCleanEvent r2 = new com.tencent.mm.autogen.events.AppBrandFileCleanEvent
            r2.<init>()
            com.tencent.mm.autogen.events.AppBrandFileCleanEvent$a r5 = r2.f236127d
            java.lang.String r6 = "ACTION_CLEAN_ALL_APPBRAND_SPACE"
            r5.f236128a = r6
            r2.publish()
        L_0x0049:
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI r2 = r1.f325864c
            boolean r2 = r2.f312124f
            if (r2 == 0) goto L_0x0057
            com.tencent.mm.autogen.events.AggressiveCleanCacheEvent r2 = new com.tencent.mm.autogen.events.AggressiveCleanCacheEvent
            r2.<init>()
            r2.publish()
        L_0x0057:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "vacuum = "
            r2.append(r5)
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI r5 = r1.f325864c
            boolean r5 = r5.f312125g
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "MicroMsg.CleanCacheUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI r2 = r1.f325864c
            boolean r6 = r2.f312124f
            r8 = 3
            r9 = 0
            if (r6 == 0) goto L_0x01c7
            boolean r2 = r2.f312125g
            if (r2 == 0) goto L_0x01c7
            k11.b r2 = r1.f325865d
            boolean[] r2 = r2.f325822f
            boolean r2 = r2[r9]
            if (r2 == 0) goto L_0x01c7
            java.lang.String r2 = "is aggressive cache clean, run vacuum logic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            f40.o r2 = f40.C86709a0.m107535s()
            zh3.f r2 = r2.f251811i
            zh3.e r2 = r2.f262815b
            long r10 = r2.mo183814g()
            long r12 = r2.mo183813f()
            long r12 = r12 - r10
            long r14 = r2.mo183813f()     // Catch:{ all -> 0x01aa }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01aa }
            kj2.d r6 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x01aa }
            r4 = 13
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x01aa }
            r7[r9] = r0     // Catch:{ all -> 0x01aa }
            java.lang.String r19 = r2.mo183817j()     // Catch:{ all -> 0x01aa }
            r7[r3] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Long r19 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x01aa }
            r20 = 2
            r7[r20] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01aa }
            r7[r8] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Long r19 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01aa }
            r18 = 4
            r7[r18] = r19     // Catch:{ all -> 0x01aa }
            java.lang.String r19 = "c-before"
            r21 = 5
            r7[r21] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01aa }
            r22 = 6
            r7[r22] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Long r19 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x01aa }
            r22 = 7
            r7[r22] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01aa }
            r23 = 8
            r7[r23] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01aa }
            r24 = 9
            r7[r24] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01aa }
            r25 = 10
            r7[r25] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01aa }
            r26 = 11
            r7[r26] = r19     // Catch:{ all -> 0x01aa }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01aa }
            r27 = 12
            r7[r27] = r19     // Catch:{ all -> 0x01aa }
            r8 = 25824(0x64e0, float:3.6187E-41)
            r6.mo160131h(r8, r7)     // Catch:{ all -> 0x01aa }
            boolean r7 = r2.mo183826x()     // Catch:{ all -> 0x01aa }
            long r28 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01aa }
            long r8 = r28 - r16
            long r16 = r2.mo183813f()     // Catch:{ all -> 0x01aa }
            long r3 = r12 / r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01aa }
            r1.<init>()     // Catch:{ all -> 0x01aa }
            r30 = r6
            java.lang.String r6 = "vacuum done, duration = "
            r1.append(r6)     // Catch:{ all -> 0x01aa }
            r1.append(r8)     // Catch:{ all -> 0x01aa }
            java.lang.String r6 = ", speed = "
            r1.append(r6)     // Catch:{ all -> 0x01aa }
            r1.append(r3)     // Catch:{ all -> 0x01aa }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01aa }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)     // Catch:{ all -> 0x01aa }
            r1 = 13
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x01aa }
            r6 = 0
            r1[r6] = r0     // Catch:{ all -> 0x01aa }
            java.lang.String r0 = r2.mo183817j()     // Catch:{ all -> 0x01aa }
            r2 = 1
            r1[r2] = r0     // Catch:{ all -> 0x01aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x01aa }
            r1[r20] = r0     // Catch:{ all -> 0x01aa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01aa }
            r2 = 3
            r1[r2] = r0     // Catch:{ all -> 0x01a8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x01a8 }
            r6 = 4
            r1[r6] = r0     // Catch:{ all -> 0x01a6 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r0.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r10 = "c-"
            r0.append(r10)     // Catch:{ all -> 0x01a6 }
            r0.append(r7)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01a6 }
            r1[r21] = r0     // Catch:{ all -> 0x01a6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x01a6 }
            r7 = 6
            r1[r7] = r0     // Catch:{ all -> 0x01a6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x01a6 }
            r1[r22] = r0     // Catch:{ all -> 0x01a6 }
            long r14 = r14 - r16
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x01a6 }
            r1[r23] = r0     // Catch:{ all -> 0x01a6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x01a6 }
            r1[r24] = r0     // Catch:{ all -> 0x01a6 }
            r7 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01a6 }
            r1[r25] = r0     // Catch:{ all -> 0x01a6 }
            r7 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01a6 }
            r1[r26] = r0     // Catch:{ all -> 0x01a6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01a6 }
            r1[r27] = r0     // Catch:{ all -> 0x01a6 }
            r0 = r30
            r3 = 25824(0x64e0, float:3.6187E-41)
            r0.mo160131h(r3, r1)     // Catch:{ all -> 0x01a6 }
            goto L_0x01c9
        L_0x01a6:
            r0 = move-exception
            goto L_0x01ad
        L_0x01a8:
            r0 = move-exception
            goto L_0x01ac
        L_0x01aa:
            r0 = move-exception
            r2 = 3
        L_0x01ac:
            r6 = 4
        L_0x01ad:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "vacuum error : "
            r1.append(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x01c9
        L_0x01c7:
            r2 = 3
            r6 = 4
        L_0x01c9:
            zt3.t r0 = zt3.C119157j.f356862d
            k11.p$a r1 = new k11.p$a
            r3 = r31
            qo3.i0 r8 = r3.f325868g
            byte[] r9 = r3.f325863b
            gy3.f0<java.util.List<k11.a<com.tencent.mm.plugin.appbrand.appstorage.p>>> r10 = r3.f325869h
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI r11 = r3.f325864c
            k11.b r12 = r3.f325865d
            long r13 = r3.f325867f
            boolean r15 = r3.f325870i
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r15)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI r0 = r3.f325864c
            boolean r0 = r0.f312124f
            if (r0 == 0) goto L_0x01ee
            r7 = 4
            goto L_0x01ef
        L_0x01ee:
            r7 = 3
        L_0x01ef:
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r3.f325866e
            long r0 = r0 - r4
            r2 = 1
            java.lang.Long[] r2 = new java.lang.Long[r2]
            long r4 = r3.f325867f
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r2[r5] = r4
            wy0.C102506a.m135309i(r7, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k11.C108822p.mo137949a(boolean):void");
    }
}
