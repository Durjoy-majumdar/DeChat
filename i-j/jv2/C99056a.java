package jv2;

import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import ep3.C97683a;
import f40.C86709a0;
import f62.C75700k0;
import ht2.C98525b;
import java.util.concurrent.ConcurrentHashMap;
import jr2.C76440q;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: jv2.a */
public class C99056a extends C97683a implements C11385n {

    /* renamed from: q */
    public String f290362q;

    /* renamed from: r */
    public String f290363r;

    /* renamed from: s */
    public boolean f290364s;

    /* renamed from: t */
    public boolean f290365t;

    /* renamed from: u */
    public int f290366u;

    /* renamed from: v */
    public volatile C5431p1.C5432a f290367v;

    /* renamed from: w */
    public volatile C98525b f290368w;

    /* renamed from: x */
    public C76440q.C76441a f290369x;

    /* renamed from: jv2.a$a */
    public class C99057a extends C97683a.C75649d<C99064d> {
        public C99057a() {
            super(C99056a.this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo91385a() {
            /*
                r20 = this;
                java.lang.String r1 = "resolve"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Class<jv2.d> r3 = jv2.C99064d.class
                r4 = 0
                r0[r4] = r3
                java.lang.String r3 = "MicroMsg.SnsTimelineInteractor"
                java.lang.String r5 = "SnsTimelineInteractor index %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r0)
                r5 = r20
                jv2.a r0 = jv2.C99056a.this
                java.lang.String r6 = "access$000"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                r0.getClass()
                java.lang.String r8 = "getUpdateNotifyListStruct"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
                jv2.d r9 = new jv2.d
                r9.<init>()
                os2.x r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Tx0()
                android.database.Cursor r10 = r0.mo139893bD()
                int r11 = r10.getCount()
                java.lang.String r12 = ""
                if (r11 <= 0) goto L_0x0069
                r10.moveToFirst()
                os2.w r0 = new os2.w
                r0.<init>()
                r0.convertFrom(r10)
                te3.m64 r15 = new te3.m64     // Catch:{ Exception -> 0x0061 }
                r15.<init>()     // Catch:{ Exception -> 0x0061 }
                byte[] r13 = r0.field_curActionBuf     // Catch:{ Exception -> 0x0061 }
                pe3.a r13 = r15.parseFrom(r13)     // Catch:{ Exception -> 0x0061 }
                te3.m64 r13 = (te3.m64) r13     // Catch:{ Exception -> 0x0061 }
                java.lang.String r13 = r13.f298773d     // Catch:{ Exception -> 0x0061 }
                long r14 = r0.field_snsID     // Catch:{ Exception -> 0x005f }
                goto L_0x006c
            L_0x005f:
                r0 = move-exception
                goto L_0x0063
            L_0x0061:
                r0 = move-exception
                r13 = r12
            L_0x0063:
                java.lang.Object[] r14 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r12, r14)
                goto L_0x006a
            L_0x0069:
                r13 = r12
            L_0x006a:
                r14 = 0
            L_0x006c:
                r10.close()
                java.lang.String r0 = "getCollapseSnsIds"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
                f40.o r10 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_MEDIA_COLLAPSE_STRING
                java.lang.Object r4 = r10.mo119685f(r4, r12)
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r10 = "&"
                java.lang.String[] r4 = r4.split(r10)
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                r12 = 2
            L_0x0092:
                int r5 = r4.length
                if (r12 >= r5) goto L_0x00b3
                r5 = r4[r12]
                r18 = r1
                r19 = r2
                r1 = 0
                long r16 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r5, r1)
                int r5 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
                if (r5 == 0) goto L_0x00ac
                java.lang.Long r5 = java.lang.Long.valueOf(r16)
                r10.add(r5)
            L_0x00ac:
                int r12 = r12 + 1
                r1 = r18
                r2 = r19
                goto L_0x0092
            L_0x00b3:
                r18 = r1
                r19 = r2
                java.util.Collections.reverse(r10)
                int r1 = r10.size()
                if (r1 <= 0) goto L_0x00c8
                r1 = 0
                java.lang.Object r1 = r10.get(r1)
                java.lang.Long r1 = (java.lang.Long) r1
                goto L_0x00c9
            L_0x00c8:
                r1 = 0
            L_0x00c9:
                os2.C35299v.m40635c(r1)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
                r9.f290387b = r11
                r9.f290386a = r13
                r9.f290388c = r10
                r9.f290389d = r14
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                r2 = r18
                r1 = r19
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: jv2.C99056a.C99057a.mo91385a():java.lang.Object");
        }
    }

    /* renamed from: jv2.a$b */
    public class C99058b extends C97683a.C75649d<C99063c> {
        public C99058b() {
            super(C99056a.this);
        }

        /* renamed from: a */
        public Object mo91385a() {
            SnsMethodCalculate.markStartTimeMs("resolve", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor$2");
            SnsMethodCalculate.markStartTimeMs("resolve", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor$2");
            Log.m105925i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor index %s", C99063c.class);
            C99056a aVar = C99056a.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getHeaderInfoStruct", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            C99063c cVar = new C99063c();
            aVar.f290366u = aVar.f286525o.mo106599a("sns_source", 0);
            String b = aVar.f286525o.mo106600b("sns_userName");
            aVar.f290362q = b;
            if (b == null) {
                aVar.f290362q = "";
            }
            C86709a0.m107528h();
            aVar.f290364s = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69724s3(aVar.f290362q);
            String s = C75592q0.m90789s();
            aVar.f290363r = s;
            aVar.f290365t = Util.isEqual(s, aVar.f290362q);
            C44668u3 Jx0 = C94866e1.Jx0();
            String nullAs = Util.nullAs(aVar.f286525o.mo106600b("sns_signature"), "");
            String nullAs2 = Util.nullAs(aVar.f286525o.mo106600b("sns_nickName"), "");
            String str = aVar.f290362q;
            C72996z1 z1Var = (str == null || str.equals("")) ? Jx0.get(aVar.f290363r) : Jx0.get(aVar.f290362q);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
                String str2 = z1Var.f149516U;
                nullAs2 = z1Var.mo62909j3();
                Log.m105925i("MicroMsg.SnsTimelineInteractor", "contact:user[%s] id[%d] nickname[%s]", z1Var.getUsername(), Integer.valueOf((int) z1Var.f108320R1), nullAs2);
                nullAs = str2;
            }
            cVar.f290379a = aVar.f290362q;
            cVar.f290380b = aVar.f290363r;
            cVar.f290383e = aVar.f290364s;
            cVar.f290384f = aVar.f290365t;
            cVar.f290385g = aVar.f290366u;
            cVar.f290381c = nullAs2;
            cVar.f290382d = nullAs;
            SnsMethodCalculate.markEndTimeMs("getHeaderInfoStruct", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            SnsMethodCalculate.markEndTimeMs("resolve", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor$2");
            SnsMethodCalculate.markEndTimeMs("resolve", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor$2");
            return cVar;
        }
    }

    /* renamed from: d */
    public void mo67526d() {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
        super.mo67526d();
        C99057a aVar = new C99057a();
        mo136932b();
        ((ConcurrentHashMap) this.f286519f).put(C99064d.class, aVar);
        C99058b bVar = new C99058b();
        mo136932b();
        ((ConcurrentHashMap) this.f286519f).put(C99063c.class, bVar);
        Log.m105925i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onCreate %s", this);
        C94853e Vx0 = C94866e1.Vx0();
        Vx0.getClass();
        SnsMethodCalculate.markStartTimeMs("cleanHasDownloadList", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (Vx0.f274820g) {
            try {
                Vx0.f274819f.clear();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("cleanHasDownloadList", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("cleanHasDownloadList", "com.tencent.mm.plugin.sns.model.DownloadManager");
        C94866e1.Vx0().getClass();
        SnsMethodCalculate.markStartTimeMs("checkAdDonwload", "com.tencent.mm.plugin.sns.model.DownloadManager");
        SnsMethodCalculate.markEndTimeMs("checkAdDonwload", "com.tencent.mm.plugin.sns.model.DownloadManager");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
    }

    /* renamed from: e */
    public void mo67531e() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
        Log.m105925i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onDestroy %s", this);
        C86709a0.m107528h();
        if (!(!C86709a0.m107523b().mo121114l() || this.f290367v == null || this.f290369x == null)) {
            this.f290367v.mo6412c(this.f290369x, 1);
        }
        super.mo67531e();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
        Log.m105925i("MicroMsg.SnsTimelineInteractor", "SnsTimelineInteractor onSceneEnd  errType %d %d %s %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar.toString());
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
    }
}
