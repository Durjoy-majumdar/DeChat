package com.tencent.p014mm.mj_template.template_res;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.mmdata.rpt.MaasTemplateResReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p523fp.C32147e;
import p749xh.C118881x7;
import ra0.C36267a;
import ra0.C36268b;
import ra0.C36269c;
import rx3.C13598b0;
import sx3.C64197v;
import sx3.C77813z;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.mj_template.template_res.MaasTemplateResMgr */
public final class MaasTemplateResMgr {

    /* renamed from: g */
    public static final MaasTemplateResMgr f79455g = new MaasTemplateResMgr(106, VFSStrategy.m163776d("MaasWarmUpRes") + "/album");

    /* renamed from: h */
    public static final MaasTemplateResMgr f79456h = new MaasTemplateResMgr(107, VFSStrategy.m163776d("MaasWarmUpRes") + "/camera");

    /* renamed from: a */
    public final int f79457a;

    /* renamed from: b */
    public final String f79458b;

    /* renamed from: c */
    public final String f79459c;

    /* renamed from: d */
    public final Object f79460d = new Object();

    /* renamed from: e */
    public final C36269c f79461e;

    /* renamed from: f */
    public final MaasTemplateResMgr$resEventListener$1 f79462f;

    /* renamed from: com.tencent.mm.mj_template.template_res.MaasTemplateResMgr$a */
    public static final class C28974a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MaasTemplateResMgr f79463d;

        public C28974a(MaasTemplateResMgr maasTemplateResMgr) {
            this.f79463d = maasTemplateResMgr;
        }

        public final void run() {
            ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(this.f79463d.f79457a);
        }
    }

    public MaasTemplateResMgr(int i, String str) {
        C87412m.m108594g(str, "resRootDir");
        this.f79457a = i;
        this.f79458b = str;
        this.f79459c = "MicroMsg.MaasTemplateResMgr_" + i;
        this.f79461e = new C36269c(i);
        this.f79462f = new MaasTemplateResMgr$resEventListener$1(this, C40008f.f107254d);
    }

    /* renamed from: a */
    public final void mo56369a() {
        synchronized (this.f79460d) {
            C36269c cVar = this.f79461e;
            cVar.getClass();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("maas_template_res");
            C87412m.m108593f(mmkv, "getMMKV(kvName)");
            long j = mmkv.getLong(cVar.f96580a, 0);
            MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("maas_template_res");
            C87412m.m108593f(mmkv2, "getMMKV(kvName)");
            boolean z = mmkv2.getLong(cVar.f96581b, 0) < j;
            boolean f = mo56374f();
            String str = this.f79459c;
            Log.m105924i(str, "checkMergeRes: update:" + z + ", empty:" + f);
            if (z || f) {
                ArrayList arrayList = new ArrayList();
                Iterable<C86001b0> t = C86013q1.m106459t(mo56371c(), false);
                if (t != null) {
                    for (C86001b0 b0Var : t) {
                        int i = Util.getInt(b0Var.f250472b, -1);
                        if (i >= 0) {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                }
                C77813z.m93908n(arrayList);
                String str2 = this.f79459c;
                Log.m105924i(str2, "checkMergeRes: merge res " + arrayList);
                if (!arrayList.isEmpty()) {
                    mo56375g(arrayList);
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo56370b() {
        MaasTemplateResReportStruct maasTemplateResReportStruct = new MaasTemplateResReportStruct();
        maasTemplateResReportStruct.f79129d = (long) this.f79457a;
        C36268b bVar = new C36268b();
        List<C118881x7> Us = ((C32147e) C86312j.m106911c(C32147e.class)).mo58509Us(this.f79457a);
        C87412m.m108593f(Us, "resList");
        for (C118881x7 x7Var : Us) {
            C36267a aVar = new C36267a();
            aVar.f96577a = x7Var.field_subType;
            aVar.f96578b = Util.getInt(x7Var.field_fileVersion, 0);
            bVar.f96579a.add(aVar);
        }
        String jSONObject = bVar.mo33258a().toString();
        C87412m.m108593f(jSONObject, "listConfig.toJson().toString()");
        maasTemplateResReportStruct.f79130e = maasTemplateResReportStruct.mo86045b("SubTypeList", C112551y.m153815o(jSONObject, ',', ';', false, 4, (Object) null), true);
        maasTemplateResReportStruct.mo86054n();
        String str = this.f79459c;
        Log.m105924i(str, "checkRes: " + maasTemplateResReportStruct.mo1006q());
        return !mo56374f();
    }

    /* renamed from: c */
    public final String mo56371c() {
        String str = this.f79458b + "/list";
        C86013q1.m106461v(str);
        return str;
    }

    /* renamed from: d */
    public final String mo56372d() {
        String str = this.f79458b + "/result";
        C86013q1.m106461v(str);
        return str;
    }

    /* renamed from: e */
    public final void mo56373e() {
        Class cls = C32147e.class;
        Log.m105924i(this.f79459c, "init: ");
        List<C118881x7> Us = ((C32147e) C86312j.m106911c(cls)).mo58509Us(this.f79457a);
        if (Us != null) {
            for (C118881x7 x7Var : Us) {
                int i = x7Var.field_subType;
                if (!C86013q1.m106450k(mo56371c() + XVFSFile.SEPARATOR_CHAR + i)) {
                    String AD = ((C32147e) C86312j.m106911c(cls)).mo58507AD(this.f79457a, i);
                    String str = this.f79459c;
                    Log.m105924i(str, "init: get cached file " + i + ", " + AD);
                    if (AD != null) {
                        mo56376h(i, AD);
                    }
                }
                ((C32147e) C86312j.m106911c(cls)).Y40(this.f79457a, i, -1);
            }
        }
        this.f79462f.alive();
        ((C119157j) C119157j.f356862d).mo183878i(new C28974a(this), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        mo56369a();
    }

    /* renamed from: f */
    public final boolean mo56374f() {
        int i;
        Iterable<C86001b0> t = C86013q1.m106459t(mo56372d(), false);
        if (t == null) {
            i = 0;
        } else if (t instanceof Collection) {
            i = ((Collection) t).size();
        } else {
            Iterator<C86001b0> it = t.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
                if (i2 < 0) {
                    C64197v.m75541j();
                    throw null;
                }
            }
            i = i2;
        }
        return i <= 0;
    }

    /* renamed from: g */
    public final void mo56375g(List<Integer> list) {
        C36269c cVar = this.f79461e;
        cVar.getClass();
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("maas_template_res");
        C87412m.m108593f(mmkv, "getMMKV(kvName)");
        mmkv.putLong(cVar.f96581b, System.currentTimeMillis());
        String d = mo56372d();
        C86013q1.m106445f(d);
        C86013q1.m106461v(d);
        for (Number intValue : list) {
            int intValue2 = intValue.intValue();
            String str = this.f79459c;
            Log.m105924i(str, "mergeRes: copy " + intValue2);
            C86013q1.m106441b(mo56371c() + XVFSFile.SEPARATOR_CHAR + intValue2, d);
        }
    }

    /* renamed from: h */
    public final boolean mo56376h(int i, String str) {
        synchronized (this.f79460d) {
            if (str == null) {
                return false;
            }
            String str2 = this.f79458b + "/temp";
            C86013q1.m106461v(str2);
            String str3 = mo56371c() + XVFSFile.SEPARATOR_CHAR + i;
            C86013q1.m106445f(str2);
            C86013q1.m106461v(str2);
            int R = C86013q1.m106436R(str, str2);
            if (R != 0) {
                Log.m105928w(this.f79459c, "unzipRes: unzip fail " + R);
                return false;
            }
            C86013q1.m106445f(str3);
            C86013q1.m106462w(str2, str3);
            C36269c cVar = this.f79461e;
            cVar.getClass();
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("maas_template_res");
            C87412m.m108593f(mmkv, "getMMKV(kvName)");
            mmkv.putLong(cVar.f96580a, System.currentTimeMillis());
            return true;
        }
    }
}
