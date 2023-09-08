package hd0;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import p645pj.C77092c;
import p823sg.C101614i;

/* renamed from: hd0.m */
public class C76152m {

    /* renamed from: l */
    public static final long f223054l = C77092c.m93048j();

    /* renamed from: a */
    public Context f223055a = null;

    /* renamed from: b */
    public C76154b f223056b = null;

    /* renamed from: c */
    public String f223057c = null;

    /* renamed from: d */
    public int f223058d = 0;

    /* renamed from: e */
    public Intent f223059e = null;

    /* renamed from: f */
    public String f223060f = null;

    /* renamed from: g */
    public String f223061g = null;

    /* renamed from: h */
    public String f223062h = null;

    /* renamed from: i */
    public String f223063i = null;

    /* renamed from: j */
    public String f223064j = null;

    /* renamed from: k */
    public final AsyncTask<String, Integer, String> f223065k = new C76153a();

    /* renamed from: hd0.m$a */
    public class C76153a extends AsyncTask<String, Integer, String> {

        /* renamed from: a */
        public int f223066a = 0;

        public C76153a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0104 A[SYNTHETIC, Splitter:B:34:0x0104] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x014a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object doInBackground(java.lang.Object[] r20) {
            /*
                r19 = this;
                r1 = r19
                r0 = r20
                java.lang.String[] r0 = (java.lang.String[]) r0
                java.lang.String r2 = "exception:%s"
                java.lang.String r3 = "MicroMsg.ImportVideo"
                r4 = 0
                r1.f223066a = r4
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r5 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r0)
                r6 = 0
                r7 = 1
                hd0.m r0 = hd0.C76152m.this     // Catch:{ Exception -> 0x0023 }
                android.content.Context r8 = r0.f223055a     // Catch:{ Exception -> 0x0023 }
                android.content.Intent r0 = r0.f223059e     // Catch:{ Exception -> 0x0023 }
                r9 = -1
                oj.a$a r0 = p914oj.C100361a.m131253b(r8, r0, r9)     // Catch:{ Exception -> 0x0023 }
                goto L_0x0030
            L_0x0023:
                r0 = move-exception
                java.lang.Object[] r8 = new java.lang.Object[r7]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r8[r4] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r8)
                r0 = r6
            L_0x0030:
                if (r0 != 0) goto L_0x004a
                java.lang.String r0 = "GetVideoMetadata filed."
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 106(0x6a, double:5.24E-322)
                r10 = 244(0xf4, double:1.206E-321)
                r12 = 1
                r14 = 0
                r7.idkeyStat(r8, r10, r12, r14)
                r0 = -50005(0xffffffffffff3cab, float:NaN)
                r1.f223066a = r0
                goto L_0x015d
            L_0x004a:
                hd0.m r8 = hd0.C76152m.this
                java.lang.String r9 = r0.f224997a
                r8.f223057c = r9
                long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
                int r9 = (int) r8
                r8 = 4
                java.lang.Object[] r8 = new java.lang.Object[r8]
                java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
                r8[r4] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r8[r7] = r10
                r10 = 2
                int r11 = r0.f224999c
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r8[r10] = r11
                r10 = 3
                hd0.m r11 = hd0.C76152m.this
                java.lang.String r11 = r11.f223057c
                r8[r10] = r11
                java.lang.String r10 = "import file is2G:%b len:%d duration:%d path:%s "
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r8)
                if (r9 > 0) goto L_0x008f
                com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r12 = 106(0x6a, double:5.24E-322)
                r14 = 244(0xf4, double:1.206E-321)
                r16 = 1
                r18 = 0
                r11.idkeyStat(r12, r14, r16, r18)
                r0 = -50001(0xffffffffffff3caf, float:NaN)
                r1.f223066a = r0
                goto L_0x015d
            L_0x008f:
                long r8 = (long) r9
                if (r5 == 0) goto L_0x0096
                r10 = 10485760(0xa00000, double:5.180654E-317)
                goto L_0x0098
            L_0x0096:
                long r10 = hd0.C76152m.f223054l
            L_0x0098:
                int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r5 <= 0) goto L_0x00af
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 106(0x6a, double:5.24E-322)
                r11 = 245(0xf5, double:1.21E-321)
                r13 = 1
                r15 = 0
                r8.idkeyStat(r9, r11, r13, r15)
                r0 = -50002(0xffffffffffff3cae, float:NaN)
                r1.f223066a = r0
                goto L_0x015d
            L_0x00af:
                hd0.m r5 = hd0.C76152m.this
                java.lang.String r8 = r5.f223057c
                java.lang.String r5 = r5.f223062h
                com.tencent.p014mm.vfs.C86013q1.m106442c(r8, r5)
                hd0.m r5 = hd0.C76152m.this
                java.lang.String r5 = r5.f223063i
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                r5 = r5 ^ r7
                if (r5 == 0) goto L_0x00cc
                hd0.m r8 = hd0.C76152m.this
                java.lang.String r9 = r8.f223057c
                java.lang.String r8 = r8.f223064j
                com.tencent.p014mm.vfs.C86013q1.m106442c(r9, r8)
            L_0x00cc:
                hd0.m r8 = hd0.C76152m.this
                int r9 = r0.f224999c
                int r9 = r9 / 1000
                r8.f223058d = r9
                android.graphics.Bitmap r0 = r0.f224998b
                r9 = 60
                if (r0 == 0) goto L_0x0101
                android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00f3 }
                java.lang.String r8 = r8.f223061g     // Catch:{ Exception -> 0x00f3 }
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r9, r10, r8, r7)     // Catch:{ Exception -> 0x00f3 }
                com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00f0 }
                r12 = 106(0x6a, double:5.24E-322)
                r14 = 231(0xe7, double:1.14E-321)
                r16 = 1
                r18 = 0
                r11.idkeyStat(r12, r14, r16, r18)     // Catch:{ Exception -> 0x00f0 }
                r8 = 0
                goto L_0x0102
            L_0x00f0:
                r0 = move-exception
                r8 = 0
                goto L_0x00f5
            L_0x00f3:
                r0 = move-exception
                r8 = 1
            L_0x00f5:
                java.lang.Object[] r10 = new java.lang.Object[r7]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r10[r4] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r10)
                goto L_0x0102
            L_0x0101:
                r8 = 1
            L_0x0102:
                if (r8 == 0) goto L_0x0131
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0125 }
                r11 = 106(0x6a, double:5.24E-322)
                r13 = 232(0xe8, double:1.146E-321)
                r15 = 1
                r17 = 0
                r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ Exception -> 0x0125 }
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r8 = 320(0x140, float:4.48E-43)
                r10 = 480(0x1e0, float:6.73E-43)
                android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r0, r8, r10)     // Catch:{ Exception -> 0x0125 }
                android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0125 }
                hd0.m r10 = hd0.C76152m.this     // Catch:{ Exception -> 0x0125 }
                java.lang.String r10 = r10.f223061g     // Catch:{ Exception -> 0x0125 }
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r0, r9, r8, r10, r7)     // Catch:{ Exception -> 0x0125 }
                goto L_0x0131
            L_0x0125:
                r0 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r7]
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                r7[r4] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r7)
            L_0x0131:
                hd0.m r0 = hd0.C76152m.this
                java.lang.String r0 = r0.f223062h
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                r2 = -50003(0xffffffffffff3cad, float:NaN)
                if (r0 != 0) goto L_0x0140
                r1.f223066a = r2
            L_0x0140:
                hd0.m r0 = hd0.C76152m.this
                java.lang.String r0 = r0.f223061g
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                if (r0 != 0) goto L_0x014f
                r0 = -50004(0xffffffffffff3cac, float:NaN)
                r1.f223066a = r0
            L_0x014f:
                if (r5 == 0) goto L_0x015d
                hd0.m r0 = hd0.C76152m.this
                java.lang.String r0 = r0.f223064j
                boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                if (r0 != 0) goto L_0x015d
                r1.f223066a = r2
            L_0x015d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hd0.C76152m.C76153a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        public void onPostExecute(Object obj) {
            String str = (String) obj;
            C76152m mVar = C76152m.this;
            C76154b bVar = mVar.f223056b;
            if (bVar != null) {
                bVar.mo96034a(this.f223066a, mVar.f223060f, mVar.f223063i, mVar.f223057c, mVar.f223058d);
            }
        }
    }

    /* renamed from: hd0.m$b */
    public interface C76154b {
        /* renamed from: a */
        void mo96034a(int i, String str, String str2, String str3, int i2);
    }

    /* renamed from: a */
    public void mo106353a(Context context, Intent intent, String str, boolean z, C76154b bVar) {
        this.f223055a = context;
        this.f223059e = intent;
        C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
        this.f223060f = C98426q0.m127793a(str);
        this.f223061g = C98398h0.Bx0().mo137729r(this.f223060f);
        this.f223062h = C98398h0.Bx0().mo137728q(this.f223060f);
        if (z) {
            this.f223063i = this.f223060f + FirebaseAnalytics.C113379b.ORIGIN;
            this.f223064j = C98398h0.Bx0().mo137728q(this.f223063i);
        }
        this.f223056b = bVar;
        this.f223065k.execute(new String[0]);
    }
}
