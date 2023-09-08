package wo0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualitySystemJsApiInfoCGIStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.AppLaunchPrepareProcess;
import com.tencent.p014mm.plugin.appbrand.launching.C83454r3;
import com.tencent.p014mm.plugin.appbrand.launching.C83471t3;
import com.tencent.p014mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify;
import com.tencent.p014mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.p014mm.plugin.appbrand.task.ipc.AppBrandLaunchWxaAppInfoNotifyMessage;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import ob0.C89147n0;
import op3.C117882j;
import rp0.C90077a;
import te3.C49335eu3;
import te3.C90422jy;
import te3.h65;
import te3.i65;
import te3.j65;
import te3.k65;
import za0.C91626a;
import zp0.C91823b;

/* renamed from: wo0.i */
public class C91050i extends C91823b<i65> {

    /* renamed from: p */
    public final String f261202p;

    /* renamed from: q */
    public final int f261203q;

    /* renamed from: r */
    public final C83471t3 f261204r;

    /* renamed from: s */
    public volatile boolean f261205s = false;

    /* renamed from: t */
    public final WeAppQualitySystemJsApiInfoCGIStruct f261206t;

    /* renamed from: u */
    public volatile HashMap<String, AppRuntimeApiPermissionBundle> f261207u = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91050i(String str, int i, List<C91052l> list, boolean z, String str2, QualitySession qualitySession, C83471t3 t3Var, C90422jy jyVar) {
        super((String) null, (String) null);
        String str3 = str;
        QualitySession qualitySession2 = qualitySession;
        WeAppQualitySystemJsApiInfoCGIStruct.C80781a aVar = null;
        this.f261202p = str3;
        this.f261203q = i;
        this.f261204r = t3Var;
        C87412m.m108594g(qualitySession2, "session");
        WeAppQualitySystemJsApiInfoCGIStruct weAppQualitySystemJsApiInfoCGIStruct = new WeAppQualitySystemJsApiInfoCGIStruct();
        weAppQualitySystemJsApiInfoCGIStruct.f237190e = weAppQualitySystemJsApiInfoCGIStruct.mo86045b("AppId", qualitySession2.f245833e, true);
        weAppQualitySystemJsApiInfoCGIStruct.f237189d = weAppQualitySystemJsApiInfoCGIStruct.mo86045b("InstanceId", qualitySession2.f245832d, true);
        int i2 = qualitySession2.f245834f;
        if (i2 == 1) {
            aVar = WeAppQualitySystemJsApiInfoCGIStruct.C80781a.release;
        } else if (i2 == 2) {
            aVar = WeAppQualitySystemJsApiInfoCGIStruct.C80781a.debug;
        } else if (i2 == 3) {
            aVar = WeAppQualitySystemJsApiInfoCGIStruct.C80781a.demo;
        }
        weAppQualitySystemJsApiInfoCGIStruct.f237192g = aVar;
        weAppQualitySystemJsApiInfoCGIStruct.f237193h = (long) qualitySession2.f245835g;
        weAppQualitySystemJsApiInfoCGIStruct.f237195j = (long) qualitySession2.f245836h;
        weAppQualitySystemJsApiInfoCGIStruct.f237191f = (long) qualitySession2.f245837i;
        this.f261206t = weAppQualitySystemJsApiInfoCGIStruct;
        weAppQualitySystemJsApiInfoCGIStruct.f237199n = z ? WeAppQualitySystemJsApiInfoCGIStruct.C80782b.sync : WeAppQualitySystemJsApiInfoCGIStruct.C80782b.async;
        weAppQualitySystemJsApiInfoCGIStruct.f237200o = (long) C84201i.m103806c();
        h65 h65 = new h65();
        for (C91052l next : list) {
            j65 j65 = new j65();
            j65.f135907d = next.f261211a;
            j65.f135908e = next.f261212b;
            h65.f134469d.add(j65);
        }
        Objects.requireNonNull(jyVar);
        h65.f134470e = jyVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 3827;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaattr/wxajsapiinfo";
        bVar.f127066a = h65;
        bVar.f127067b = new i65();
        mo123453j(bVar.mo72403a());
        Object[] objArr = new Object[7];
        objArr[0] = str3;
        objArr[1] = Integer.valueOf(i);
        StringBuilder sb = new StringBuilder("[");
        for (C91052l next2 : list) {
            sb.append("{");
            sb.append("appId:");
            sb.append(next2.f261211a);
            sb.append(", appType:");
            sb.append(next2.f261212b);
            sb.append("}");
        }
        sb.append("]");
        objArr[2] = sb.toString();
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = str2;
        objArr[5] = qualitySession2.f245832d;
        objArr[6] = C91626a.m114981a(jyVar);
        Log.m105925i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "<init> appId:%s, versionType:%d, appIdList:%s, sync:%b, sessionId:%s, instanceId:%s, source:%s", objArr);
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        String str2;
        LinkedList<k65> linkedList;
        int i3 = i;
        int i4 = i2;
        i65 i65 = (i65) eu32;
        int i5 = 0;
        try {
            long nowMilliSecond = Util.nowMilliSecond();
            WeAppQualitySystemJsApiInfoCGIStruct weAppQualitySystemJsApiInfoCGIStruct = this.f261206t;
            weAppQualitySystemJsApiInfoCGIStruct.f237197l = nowMilliSecond;
            weAppQualitySystemJsApiInfoCGIStruct.mo86048e("EndTimeStampMs", nowMilliSecond);
            WeAppQualitySystemJsApiInfoCGIStruct weAppQualitySystemJsApiInfoCGIStruct2 = this.f261206t;
            long j = nowMilliSecond - weAppQualitySystemJsApiInfoCGIStruct2.f237196k;
            weAppQualitySystemJsApiInfoCGIStruct2.f237194i = j;
            weAppQualitySystemJsApiInfoCGIStruct2.mo86046c("CostTimeMs", j);
            if (C90077a.m112678a(i3, i4, i65)) {
                this.f261206t.f237198m = 0;
            } else {
                this.f261206t.f237198m = 1;
            }
            this.f261206t.mo86054n();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.CgiWxaJsApiInfo", "quality report e = %s", e);
        }
        boolean z = ((h65) this.f256789f.f127055a.f127080a).f134470e.f259640e;
        if (i65 == null) {
            str2 = "NULL";
        } else if (i65.f135138d == null) {
            str2 = "NULL_API_INFO_LIST";
        } else {
            str2 = "API_INFO_LIST SIZE:" + i65.f135138d.size();
        }
        Log.m105925i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "onCgiBack, errType %d, errCode %d, errMsg %s, req[sync %B], resp[%s], isForPreRender[%b]", Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(this.f261205s), str2, Boolean.valueOf(z));
        if (i3 == 0 && i4 == 0 && i65 != null && (linkedList = i65.f135138d) != null) {
            try {
                Iterator<k65> it = linkedList.iterator();
                while (it.hasNext()) {
                    k65 next = it.next();
                    if (next.f136590f == 0) {
                        j65 j65 = next.f136588d;
                        String str3 = j65.f135907d;
                        if (j65.f135908e == 2) {
                            C81161g2.requireAccountInitializedOnDemand();
                            C81161g2.f238480s.mo56813jo(str3, next.f136589e.toByteArray());
                            this.f261207u.put(str3, new AppRuntimeApiPermissionBundle(next.f136589e));
                            Log.m105925i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "wxaJs plugin AppId:%s,jsApiControlBytes:%d,bg:%d,suspend:%d", str3, Integer.valueOf(next.f136589e.f130770d.f257327a.length), Integer.valueOf(next.f136589e.f130771e.get(0).f257327a.length), Integer.valueOf(next.f136589e.f130771e.get(1).f257327a.length));
                        }
                    }
                }
            } catch (IOException e2) {
                Log.printErrStackTrace("MicroMsg.AppBrand.CgiWxaJsApiInfo", e2, "IOException", new Object[0]);
            }
            if (!this.f261205s) {
                String str4 = this.f261202p;
                int i6 = this.f261203q;
                String str5 = this.f261206t.f237189d;
                HashMap<String, AppRuntimeApiPermissionBundle> hashMap = this.f261207u;
                AppLaunchPrepareProcess i7 = AppLaunchPrepareProcess.m102197i(str5);
                if (i7 != null) {
                    Object[] objArr = new Object[4];
                    objArr[0] = str4;
                    objArr[1] = Integer.valueOf(i6);
                    objArr[2] = str5;
                    objArr[3] = Integer.valueOf(hashMap == null ? 0 : hashMap.size());
                    Log.m105925i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyPluginPermissionInfoUpdate [update deferred process] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr);
                    if (i7.f243260j != null) {
                        AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) i7.f243260j.mo182596a(0);
                        if (appBrandSysConfigWC == null) {
                            Log.m105921e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "notifyLaunchInfoUpdate null config with appId(%s)", str4);
                        } else {
                            Object[] objArr2 = new Object[4];
                            objArr2[0] = str4;
                            objArr2[1] = Integer.valueOf(i6);
                            objArr2[2] = str5;
                            objArr2[3] = Integer.valueOf(hashMap == null ? 0 : hashMap.size());
                            Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifPluginPermissionInfoUpdate] fillLaunchConfig to pending launchResult appId[%s] type[%d] instanceId[%s] info[%d]", objArr2);
                            appBrandSysConfigWC.f234857B = hashMap;
                            i7.f243260j = C117882j.m166285d(appBrandSysConfigWC, null, i7.f243237K);
                        }
                    } else {
                        Object[] objArr3 = new Object[4];
                        objArr3[0] = str4;
                        objArr3[1] = Integer.valueOf(i6);
                        objArr3[2] = str5;
                        objArr3[3] = Integer.valueOf(hashMap == null ? 0 : hashMap.size());
                        Log.m105925i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifPluginPermissionInfoUpdate] set mMaybeUpdatedPluginPermissionMap appId[%s] type[%d] instanceId[%s] info[%d]", objArr3);
                        i7.f243251X = hashMap;
                    }
                }
                try {
                    Object[] objArr4 = new Object[4];
                    objArr4[0] = str4;
                    objArr4[1] = Integer.valueOf(i6);
                    objArr4[2] = str5;
                    objArr4[3] = Integer.valueOf(hashMap == null ? 0 : hashMap.size());
                    Log.m105925i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyPluginPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr4);
                    ILaunchWxaAppInfoNotify.PluginIpcWrapper pluginIpcWrapper = new ILaunchWxaAppInfoNotify.PluginIpcWrapper();
                    pluginIpcWrapper.f243344d = str4;
                    pluginIpcWrapper.f243345e = i6;
                    pluginIpcWrapper.f243346f = hashMap;
                    AppBrandLaunchWxaAppInfoNotifyMessage.C84298b.m103919a(str4, pluginIpcWrapper);
                } catch (Throwable th) {
                    Object[] objArr5 = new Object[4];
                    objArr5[0] = str4;
                    objArr5[1] = Integer.valueOf(i6);
                    objArr5[2] = str5;
                    if (hashMap != null) {
                        i5 = hashMap.size();
                    }
                    objArr5[3] = Integer.valueOf(i5);
                    Log.printErrStackTrace("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", th, "notifyPluginPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr5);
                }
            }
        } else if (this.f261205s && !z) {
            C83454r3.m102416b(C84737f0.m104395b(C0966R.string.f7815sf, String.format(Locale.US, " (%d,%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})), this.f261204r);
        }
    }

    /* renamed from: i */
    public final synchronized C89059e<C89132b.C89134c<i65>> mo9225i() {
        long nowMilliSecond = Util.nowMilliSecond();
        WeAppQualitySystemJsApiInfoCGIStruct weAppQualitySystemJsApiInfoCGIStruct = this.f261206t;
        weAppQualitySystemJsApiInfoCGIStruct.f237196k = nowMilliSecond;
        weAppQualitySystemJsApiInfoCGIStruct.mo86048e("StartTimeStampMs", nowMilliSecond);
        return super.mo9225i();
    }

    /* renamed from: n */
    public C89132b.C89134c<i65> mo115600n() {
        this.f261205s = true;
        return C89147n0.m111434a(this);
    }
}
