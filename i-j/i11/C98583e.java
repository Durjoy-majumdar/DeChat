package i11;

import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C97318g1;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import com.tencent.wcdb.support.CancellationSignal;
import f40.C86709a0;
import gy3.C87412m;
import i11.C98581d;
import j11.C98896e;
import java.util.HashMap;
import k11.C99083a0;
import k11.C99087z;
import k11.x$$g;
import k11.z$$a;
import oa1.C117731d;
import wy0.C102506a;
import z04.C112551y;

/* renamed from: i11.e */
public final class C98583e implements C98581d.C98582a {

    /* renamed from: a */
    public final C98579b f289052a = new C98579b();

    /* renamed from: b */
    public final HashMap<String, Integer> f289053b = new HashMap<>();

    /* renamed from: c */
    public final int f289054c;

    /* renamed from: d */
    public int f289055d;

    /* renamed from: e */
    public int f289056e;

    /* renamed from: f */
    public int f289057f;

    /* renamed from: g */
    public int f289058g;

    /* renamed from: h */
    public String f289059h;

    /* renamed from: i */
    public boolean f289060i;

    /* renamed from: j */
    public final /* synthetic */ boolean f289061j;

    /* renamed from: k */
    public final /* synthetic */ C98578a f289062k;

    public C98583e(boolean z, C98578a aVar) {
        this.f289061j = z;
        this.f289062k = aVar;
        int i = 0;
        for (int i2 = 0; i2 < 17; i2++) {
            HashMap<String, Integer> hashMap = this.f289053b;
            String str = C98585g.f289072a[i2];
            int[] iArr = C98585g.f289073b;
            hashMap.put(str, Integer.valueOf(iArr[i2]));
            i += iArr[i2];
        }
        int i3 = i + 50000;
        this.f289054c = i3;
        Log.m105918d("MicroMsg.CleanWxTask", "Progress total: " + i3);
    }

    /* renamed from: a */
    public void mo137951a(boolean z) {
        if (!this.f289060i) {
            this.f289060i = true;
            long g = C86709a0.m107535s().f251811i.f262815b.mo183814g();
            long f = C86709a0.m107535s().f251811i.f262815b.mo183813f() - g;
            Log.m105924i("MicroMsg.CleanWxTask", "freeListSize = " + g + ", dbRealDataSize = " + f);
            boolean g2 = C117731d.m166007c().mo182445g("clicfg_vacuum_aggressive_clean_cache_2", false, true);
            boolean g3 = C117731d.m166007c().mo182445g("clicfg_vacuum_aggressive_clean_cache_3", false, true);
            long j = g2 ? DownloadHelper.SAVE_LENGTH : 52428800;
            if (g3) {
                j = 209715200;
            }
            if (f < j && g > 52428800) {
                C98579b bVar = this.f289052a;
                bVar.f289041c += g;
                long[] jArr = bVar.f289045g;
                jArr[0] = jArr[0] + g;
                bVar.f289046h = true;
            }
        }
        C98578a aVar = this.f289062k;
        if (aVar != null) {
            C98579b bVar2 = this.f289052a;
            C99087z zVar = (C99087z) aVar;
            if (!z) {
                CleanNewUI cleanNewUI = zVar.f290542a;
                cleanNewUI.f267931D = bVar2;
                long j2 = bVar2.f289039a;
                long j3 = bVar2.f289042d;
                long j4 = cleanNewUI.f267936d ? bVar2.f289041c : bVar2.f289040b;
                C98896e wx02 = C98896e.wx0();
                synchronized (C98896e.class) {
                    wx02.f289906d = j2;
                    wx02.f289907e = j3;
                    wx02.f289908f = j4;
                    wx02.f289909g = bVar2.f289043e;
                }
                wx02.xx0(0, (CancellationSignal) null);
                MMHandlerThread.postToMainThread(new z$$a(zVar, j2, j4));
                C115669n.INSTANCE.idkeyStat(714, 53, 1, false);
                zVar.f290542a.f267930C = System.currentTimeMillis();
                CleanNewUI cleanNewUI2 = zVar.f290542a;
                long j5 = cleanNewUI2.f267930C - cleanNewUI2.f267929B;
                Log.m105924i("MicroMsg.CleanNewUI", "Scan folder finished. Time cost: " + j5);
                long[] vx02 = C98896e.wx0().vx0();
                C102506a.m135309i(2, j5, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(vx02[1]), Long.valueOf(vx02[0]), Long.valueOf(bVar2.f289043e));
                CleanNewUI cleanNewUI3 = zVar.f290542a;
                cleanNewUI3.getClass();
                C99083a0 a0Var = new C99083a0(cleanNewUI3);
                CancellationSignal cancellationSignal = cleanNewUI3.f267954y;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                cleanNewUI3.f267954y = new CancellationSignal();
                cleanNewUI3.f267955z = System.currentTimeMillis();
                cleanNewUI3.f267949t = cleanNewUI3.f267946q;
                ThreadPool.postAtFront(new x$$g(cleanNewUI3, a0Var), "CleanScanWxIndex");
            }
        }
    }

    /* renamed from: b */
    public void mo137952b(C97318g1 g1Var) {
        int i;
        C98578a aVar;
        int i2;
        C87412m.m108594g(g1Var, "entry");
        String str = g1Var.f285614b;
        if (!C87412m.m108589b(str, this.f289059h)) {
            if (this.f289061j) {
                Log.m105924i("MicroMsg.CleanWxTask", ">>> fs: " + str + ", currentFs: " + this.f289059h + ", anchorTotal: " + this.f289057f + ", anchorCount: " + this.f289056e + ", anchorDone: " + this.f289055d);
            }
            int i3 = this.f289057f;
            if (i3 > 0) {
                int i4 = this.f289055d + i3;
                this.f289055d = i4;
                C98578a aVar2 = this.f289062k;
                if (aVar2 != null) {
                    ((C99087z) aVar2).mo138464a(i4 + Math.min(this.f289056e, i3) + Math.min(this.f289058g, 50000), this.f289054c);
                }
            }
            this.f289056e = 0;
            if (str == null || (g1Var.f285613a & 16384) != 0) {
                i2 = 0;
            } else {
                Integer num = this.f289053b.get(str);
                if (num == null) {
                    num = 0;
                }
                i2 = num.intValue();
            }
            this.f289057f = i2;
            this.f289059h = str;
        }
        int i5 = this.f289057f;
        if (i5 != 0) {
            i = this.f289056e + 1;
            this.f289056e = i;
        } else {
            i = this.f289058g + 1;
            this.f289058g = i;
        }
        if ((i & 255) == 0 && (aVar = this.f289062k) != null) {
            ((C99087z) aVar).mo138464a(this.f289055d + Math.min(this.f289056e, i5) + Math.min(this.f289058g, 50000), this.f289054c);
        }
        int i6 = g1Var.f285613a;
        C86001b0 b0Var = g1Var.f285615c;
        long j = b0Var.f250474d;
        int a = C98585g.m128098a(i6, b0Var.f250476f);
        C98579b bVar = this.f289052a;
        bVar.f289039a += j;
        if (a > 0) {
            int i7 = i6 & 4095;
            if (i7 >= 16) {
                i7 = 0;
            }
            if (a > 1) {
                bVar.f289040b += j;
                long[] jArr = bVar.f289044f;
                jArr[i7] = jArr[i7] + j;
            }
            bVar.f289041c += j;
            long[] jArr2 = bVar.f289045g;
            jArr2[i7] = jArr2[i7] + j;
        }
        if ((i6 & 8192) != 0) {
            bVar.f289042d += j;
        } else if ((i6 & 16384) != 0) {
            bVar.f289043e += j;
        }
        if (this.f289061j) {
            C86001b0 b0Var2 = g1Var.f285615c;
            String str2 = b0Var2.f250476f ? "* " : "  ";
            String str3 = b0Var2.f250471a;
            C87412m.m108593f(str3, "fe.relPath");
            int i8 = 0;
            for (int i9 = 0; i9 < str3.length(); i9++) {
                if (str3.charAt(i9) == '/') {
                    i8++;
                }
            }
            Log.m105924i("MicroMsg.CleanWxTask", C112551y.m153813m("  ", i8) + str2 + b0Var2.f250472b + 9 + b0Var2.f250474d + 9 + a);
        }
    }
}
