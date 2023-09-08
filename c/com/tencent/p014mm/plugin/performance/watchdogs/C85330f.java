package com.tencent.p014mm.plugin.performance.watchdogs;

import android.app.ActivityManager;
import com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner;
import com.tencent.matrix.util.SystemInfo;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p269xe.C91190k;
import p269xe.C91191l;
import p723vf.C118672d;
import p723vf.C90782f;
import p757xv.C91355x;
import p761yd.C38993b;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.f */
public final class C85330f {

    /* renamed from: a */
    public static int f248651a;

    /* renamed from: b */
    public static boolean f248652b;

    /* renamed from: a */
    public static final void m105346a(C91355x xVar) {
        C91355x xVar2 = xVar;
        C87412m.m108594g(xVar2, "info");
        if (xVar2.f261988A + xVar2.f261989B > 2097152 && AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            f248651a++;
        }
        if (f248651a >= 3 && !f248652b && C38993b.m41993c(C32735h.C32737c.clicfg_matrix_m_oldbg_ams_pss_with_isolated_xweb_2g_enable, true)) {
            C91190k.C26537a aVar = C91190k.f261451a;
            long j = xVar2.f262021w;
            int i = xVar2.f261988A + xVar2.f261989B;
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("count", xVar2.f261990C.length);
                jSONObject.put("detail", jSONArray);
                C91355x[] xVarArr = xVar2.f261990C;
                C87412m.m108593f(xVarArr, "this@sumPssDetailJson.allProcessMemInfos");
                ArrayList arrayList = new ArrayList(xVarArr.length);
                for (C91355x xVar3 : xVarArr) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("process", xVar3.f262000b);
                    jSONObject2.put("pid", xVar3.f261999a);
                    jSONObject2.put("amsPss", xVar3.f262023y);
                    arrayList.add(jSONObject2);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) it.next());
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("process", "IsolatedXWeb");
                jSONObject3.put("pid", -1);
                jSONObject3.put("amsPss", xVar2.f261989B);
                jSONArray.put(jSONObject3);
            } catch (Throwable th) {
                C118672d.m167354d(CommonKt.TAG, th, "", new Object[0]);
            }
            String a = C91191l.m114455a(jSONObject);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = C90782f.f260693a;
            C90782f.f260693a.getMemoryInfo(memoryInfo);
            aVar.mo53491a(new C91190k.C26538b(1000, (String) null, 0, 0, 0, 0, 0, 0, (String) null, 0, (String) null, i, a, 0, 0, 0, (String) null, (String) null, 0, 0, 0, 0, 0, j, C91191l.m114455a(new SystemInfo(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.lowMemory, memoryInfo.threshold).mo112194a()), (String) null, (String) null, 0, 0, (String) null, (String) null, 0, 0, -25171970, 1, (C8480h) null));
            f248652b = true;
        }
    }
}
