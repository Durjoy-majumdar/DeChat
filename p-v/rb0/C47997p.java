package rb0;

import android.database.Cursor;
import cc0.C92411b;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.z3$$h;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import lc3.C10485b;
import org.json.JSONObject;
import p196ln.C76708i;
import p248ug.C52558c;
import p680ru.C101464l;
import p702ts.C78085c;
import te3.C49618gw;
import te3.C49939j34;
import te3.C52054y14;

/* renamed from: rb0.p */
public class C47997p {

    /* renamed from: j */
    public static long f128731j;

    /* renamed from: a */
    public String f128732a = null;

    /* renamed from: b */
    public int f128733b = 0;

    /* renamed from: c */
    public C92411b f128734c;

    /* renamed from: d */
    public String f128735d = "";

    /* renamed from: e */
    public int f128736e = 10;

    /* renamed from: f */
    public boolean f128737f = false;

    /* renamed from: g */
    public MStorageEx.IOnStorageChange f128738g = new C47998a();

    /* renamed from: h */
    public C92411b.C92412a f128739h = new C47999b();

    /* renamed from: i */
    public C52054y14 f128740i;

    /* renamed from: rb0.p$a */
    public class C47998a implements MStorageEx.IOnStorageChange {
        public C47998a() {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            if (obj == null || !(obj instanceof String)) {
                Log.m105925i("MicroMsg.ReportLocation", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            } else if (C47997p.this.f128732a.equals((String) obj)) {
                C47997p pVar = C47997p.this;
                if (pVar.f128733b == 1) {
                    Log.m105925i("MicroMsg.ReportLocation", "contactStgUpdate, %s", pVar.f128732a);
                    C47997p pVar2 = C47997p.this;
                    pVar2.mo72791d(pVar2.f128732a);
                    ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(C47997p.this.f128738g);
                }
            }
        }
    }

    /* renamed from: rb0.p$b */
    public class C47999b implements C92411b.C92412a {

        /* renamed from: d */
        public long f128742d = 0;

        public C47999b() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            double d4 = d2;
            if (!z) {
                return true;
            }
            Log.m105925i("MicroMsg.ReportLocation", "LBSManager notify. lat:%f, lng:%f", Float.valueOf(f2), Float.valueOf(f));
            long nowSecond = Util.nowSecond();
            long j = this.f128742d;
            C47997p pVar = C47997p.this;
            if (nowSecond >= j + ((long) pVar.f128736e)) {
                pVar.mo72788a(pVar.f128732a, 11, 0, f2, f, (int) d4, (LinkedList<C49618gw>) null);
                this.f128742d = Util.nowSecond();
            }
            C47997p pVar2 = C47997p.this;
            if (pVar2.f128733b == 2) {
                pVar2.mo72792e();
            }
            C47997p pVar3 = C47997p.this;
            if (!pVar3.f128737f) {
                pVar3.f128737f = true;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2013, f, f2, (int) d4);
            }
            return true;
        }
    }

    public C47997p() {
        int i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72508a(1, "BrandService", "continueLocationReportInterval"), 5);
        this.f128736e = i;
        if (i < 2) {
            this.f128736e = 2;
        }
        Log.m105925i("MicroMsg.ReportLocation", "reportLocation interval %d", Integer.valueOf(this.f128736e));
    }

    /* renamed from: a */
    public final void mo72788a(String str, int i, int i2, float f, float f2, int i3, LinkedList<C49618gw> linkedList) {
        mo72789b(str, i, i2, f, f2, i3, linkedList, 0, (C52054y14) null, (C49939j34) null);
    }

    /* renamed from: b */
    public final void mo72789b(String str, int i, int i2, float f, float f2, int i3, LinkedList<C49618gw> linkedList, int i4, C52054y14 y142, C49939j34 j342) {
        String str2;
        if (i2 == 3) {
            str2 = "<event></event>";
        } else {
            str2 = String.format("<event><location><errcode>%d</errcode><data><latitude>%f</latitude><longitude>%f</longitude><precision>%d</precision></data></location></event>", new Object[]{Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i3)});
        }
        String str3 = str2;
        Log.m105925i("MicroMsg.ReportLocation", "doScene, info: %s", str3);
        C86709a0.m107529k().f251779b.mo123460f(new C47988l0(str, i, str3, linkedList, this.f128735d, i4, y142, j342));
    }

    /* renamed from: c */
    public void mo72790c(C52054y14 y142, String str) {
        int i;
        if (y142 != null && (i = y142.f145077f) > 0) {
            int min = Math.min(i, 30);
            y142.f145080i = 0;
            y142.f145081j = 0;
            Cursor zx02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).zx0(str, min, 0);
            while (zx02.moveToNext()) {
                C72963f4 f4Var = new C72963f4();
                f4Var.convertFrom(zx02);
                if (f4Var.mo108769t2() != 1) {
                    if (f4Var.mo100992d4()) {
                        y142.f145081j++;
                    } else {
                        z3$$h w = C75604z3.m90851w(f4Var.f230724G);
                        if (w != null && w.f222095b == 3) {
                            y142.f145080i++;
                        }
                    }
                }
            }
            zx02.close();
        }
    }

    /* renamed from: d */
    public void mo72791d(String str) {
        Log.m105924i("MicroMsg.ReportLocation", "Start report");
        this.f128732a = str;
        C52558c b = C47984k.m53328b(str);
        if (b != null) {
            if (this.f128733b != 0) {
                mo72792e();
            }
            boolean z = false;
            this.f128733b = 0;
            if (b.mo72809G1()) {
                Log.m105925i("MicroMsg.ReportLocation", "need update contact %s", str);
                ((C76708i) C86312j.m106911c(C76708i.class)).mo106823Jc(str);
            }
            C52558c.C52560b r2 = b.mo73500r2(false);
            if (r2 != null) {
                if (r2.mo73525r() && b.mo73495m2()) {
                    this.f128734c = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
                    C52558c.C52560b r25 = b.mo73500r2(false);
                    JSONObject jSONObject = r25.f146795a;
                    if (jSONObject != null) {
                        r25.f146808n = Util.getInt(jSONObject.optString("ReportLocationType"), 0) == 2;
                    }
                    this.f128733b = r25.f146808n ? 3 : 2;
                    if (LocationUtil.isGpsEnable() || LocationUtil.isNetworkProviderEnable()) {
                        C92411b bVar = this.f128734c;
                        C92411b.C92412a aVar = this.f128739h;
                        if (this.f128733b != 2) {
                            z = true;
                        }
                        bVar.mo126409c(aVar, true, z);
                        C5139t.m5183e(3, 10);
                        return;
                    }
                    mo72788a(str, 11, 2, 0.0f, 0.0f, 0, (LinkedList<C49618gw>) null);
                } else if (r2.mo73525r() && !b.mo73495m2()) {
                    mo72788a(str, 11, 1, 0.0f, 0.0f, 0, (LinkedList<C49618gw>) null);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo72792e() {
        Log.m105924i("MicroMsg.ReportLocation", "Stop report");
        this.f128733b = 0;
        C92411b bVar = this.f128734c;
        if (bVar != null) {
            bVar.mo126408b(this.f128739h);
        }
        if (C86709a0.m107523b().mo121114l()) {
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this.f128738g);
        }
    }
}
