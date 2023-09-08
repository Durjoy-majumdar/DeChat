package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.appbrand.p942v8.C80658e;
import com.tencent.p014mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.NoSuchElementException;
import my3.C34690i;
import my3.C61594j;
import qe3.C89625d;
import sx3.C36904l0;
import z04.C66713a;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.l0 */
public final class C84848l0 {

    /* renamed from: a */
    public static final C84848l0 f247335a = new C84848l0();

    /* renamed from: a */
    public final boolean mo117593a() {
        int i;
        int i2;
        int i3 = C89625d.f257841g;
        C66713a.m78712a(16);
        String num = Integer.toString(i3, 16);
        C87412m.m108593f(num, "toString(this, checkRadix(radix))");
        C1510o oVar = C1510o.f10864a;
        MultiProcessMMKV a = oVar.mo1516a();
        String str = "";
        String string = a != null ? a.getString("WxaCommLibV8Snapshot#BlockClientVersion", str) : null;
        if (string != null) {
            str = string;
        }
        C84840f0 f0Var = C84840f0.f247297a;
        f0Var.getClass();
        if (C84840f0.f247299c) {
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotPreConditions", "needBlock, curClientVersion: " + num + ", blockClientVersion: " + str);
        }
        if (!f0Var.mo117570b() && C87412m.m108589b(num, str)) {
            return true;
        }
        C84876x xVar = C84876x.f247386a;
        String[] strArr = C84876x.f247388c;
        if (!(strArr.length == 0)) {
            String str2 = strArr[0];
            MultiProcessMMKV a2 = oVar.mo1516a();
            if (a2 != null) {
                i = a2.getInt("V8ConsecutiveCrash#Count_" + str2, 0);
            } else {
                i = 0;
            }
            C36904l0 i4 = new C61594j(1, strArr.length - 1).iterator();
            while (((C34690i) i4).f93287f) {
                String str3 = strArr[i4.mo59695a()];
                MultiProcessMMKV a3 = C1510o.f10864a.mo1516a();
                if (a3 != null) {
                    i2 = a3.getInt("V8ConsecutiveCrash#Count_" + str3, 0);
                } else {
                    i2 = 0;
                }
                if (i < i2) {
                    i = i2;
                }
            }
            C84840f0 f0Var2 = C84840f0.f247297a;
            f0Var2.getClass();
            boolean z = C84840f0.f247299c;
            if (z) {
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotPreConditions", "needBlock, v8ConsecutiveCrashCount: " + i);
            }
            if (!f0Var2.mo117570b()) {
                f0Var2.getClass();
                if (C84840f0.f247314r <= i) {
                    Log.m105918d("MicroMsg.WxaCommLibV8SnapshotPreConditions", "needBlock");
                    MultiProcessMMKV a4 = C1510o.f10864a.mo1516a();
                    if (a4 != null) {
                        a4.encode("WxaCommLibV8Snapshot#BlockClientVersion", num);
                    }
                    C84876x xVar2 = C84876x.f247386a;
                    Log.m105924i("MicroMsg.V8CrashMonitor", "reset");
                    xVar2.mo117629b(0);
                    C84868u0 u0Var = C84868u0.f247366a;
                    f0Var2.getClass();
                    if (z) {
                        Log.m105924i("MicroMsg.WxaCommLibV8SnapshotStats", "onSnapshotBlock, snapshotTotalExceptionCount: " + -1 + ", v8ConsecutiveCrashCount: " + i);
                    }
                    C115669n.INSTANCE.mo175911u(1923, 0);
                    if (u0Var.mo117605b()) {
                        AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new AndroidWAServiceLibSnapshotQualityStruct();
                        androidWAServiceLibSnapshotQualityStruct.f236322d = 1;
                        androidWAServiceLibSnapshotQualityStruct.mo112530w(C80658e.m98345b());
                        androidWAServiceLibSnapshotQualityStruct.mo112527t(String.valueOf(-1));
                        androidWAServiceLibSnapshotQualityStruct.mo112528u(String.valueOf(i));
                        androidWAServiceLibSnapshotQualityStruct.mo86054n();
                    }
                    return true;
                }
            }
            return false;
        }
        throw new NoSuchElementException();
    }
}
