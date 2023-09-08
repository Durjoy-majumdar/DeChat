package k02;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C22492da;
import te3.C22519om;
import te3.C22526qf2;
import te3.C51168rx;
import te3.C51171rx2;
import te3.C64841xw3;

/* renamed from: k02.b */
public class C21300b implements C87581a<Boolean, C22526qf2> {

    /* renamed from: a */
    public boolean f60158a;

    public C21300b(boolean z) {
        this.f60158a = z;
    }

    public Object call(Object obj) {
        String str;
        C22526qf2 qf22 = (C22526qf2) obj;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_HARDWARE_LAST_UPLOAD_TICKS_LONG_SYNC;
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105920e("MicroMsg.TaskReportHardwareInfo", "Account not init, just return");
            return Boolean.FALSE;
        }
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(aVar, -1L)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - longValue;
        Log.m105925i("MicroMsg.TaskReportHardwareInfo", "hy: last ticks: %d, current ticks: %d, interval: %d", Long.valueOf(longValue), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        boolean z = this.f60158a;
        if (!z && j < 86400000) {
            Log.m105918d("MicroMsg.TaskReportHardwareInfo", "hy: should not upload. too small interval");
            return Boolean.FALSE;
        } else if (z || !(qf22 == null || qf22.f64492d == null)) {
            Log.m105924i("MicroMsg.TaskReportHardwareInfo", "hy: found hardware infos. start report");
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[41];
            C22492da daVar = qf22.f64492d;
            objArr[0] = daVar.f63738d;
            objArr[1] = daVar.f63739e;
            objArr[2] = daVar.f63740f;
            objArr[3] = daVar.f63741g;
            C22519om omVar = qf22.f64493e;
            objArr[4] = omVar.f64359f;
            objArr[5] = omVar.f64357d;
            objArr[6] = omVar.f64360g;
            objArr[7] = omVar.f64361h;
            objArr[8] = Integer.valueOf(omVar.f64358e);
            objArr[9] = Integer.valueOf(qf22.f64494f.f64083d);
            objArr[10] = Integer.valueOf(qf22.f64494f.f64084e);
            objArr[11] = Integer.valueOf(qf22.f64495g.f137943d);
            objArr[12] = Integer.valueOf(qf22.f64495g.f137944e ? 1 : 0);
            objArr[13] = Integer.valueOf(qf22.f64499n.f354036d ? 1 : 0);
            objArr[14] = Integer.valueOf(qf22.f64499n.f354037e ? 1 : 0);
            C64841xw3 xw32 = qf22.f64496h;
            objArr[15] = xw32.f186412d;
            objArr[16] = Integer.valueOf(xw32.f186413e);
            objArr[17] = qf22.f64497i.f141193d;
            objArr[18] = Integer.valueOf(qf22.f64498j.f63803d ? 1 : 0);
            objArr[19] = Integer.valueOf(qf22.f64498j.f63804e ? 1 : 0);
            objArr[20] = Integer.valueOf(qf22.f64498j.f63805f ? 1 : 0);
            objArr[21] = Integer.valueOf(qf22.f64498j.f63806g ? 1 : 0);
            objArr[22] = Integer.valueOf(qf22.f64498j.f63807h ? 1 : 0);
            objArr[23] = Integer.valueOf(qf22.f64498j.f63808i ? 1 : 0);
            objArr[24] = Integer.valueOf(qf22.f64498j.f63809j ? 1 : 0);
            objArr[25] = Integer.valueOf(qf22.f64498j.f63820x ? 1 : 0);
            objArr[26] = Integer.valueOf(qf22.f64498j.f63810n ? 1 : 0);
            objArr[27] = Integer.valueOf(qf22.f64498j.f63811o ? 1 : 0);
            objArr[28] = Integer.valueOf(qf22.f64498j.f63812p ? 1 : 0);
            objArr[29] = Integer.valueOf(qf22.f64498j.f63813q ? 1 : 0);
            objArr[30] = Integer.valueOf(qf22.f64498j.f63814r ? 1 : 0);
            objArr[31] = Integer.valueOf(qf22.f64498j.f63815s ? 1 : 0);
            objArr[32] = Integer.valueOf(qf22.f64498j.f63816t ? 1 : 0);
            objArr[33] = Integer.valueOf(qf22.f64498j.f63817u ? 1 : 0);
            objArr[34] = Integer.valueOf(qf22.f64498j.f63818v ? 1 : 0);
            objArr[35] = Integer.valueOf(qf22.f64498j.f63819w ? 1 : 0);
            objArr[36] = Integer.valueOf(qf22.f64494f.f64086g);
            objArr[37] = Integer.valueOf(qf22.f64494f.f64085f);
            C51168rx rxVar = qf22.f64497i;
            objArr[38] = rxVar.f141194e;
            LinkedList<C51171rx2> linkedList = rxVar.f141195f;
            JSONArray jSONArray = new JSONArray();
            if (linkedList != null) {
                try {
                    Iterator<C51171rx2> it = linkedList.iterator();
                    while (it.hasNext()) {
                        C51171rx2 next = it.next();
                        if (next != null && !Util.isNullOrNil(next.f141204d)) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("mimeName", next.f141204d);
                            JSONArray jSONArray2 = new JSONArray();
                            LinkedList<String> linkedList2 = next.f141205e;
                            if (linkedList2 != null) {
                                Iterator<String> it4 = linkedList2.iterator();
                                while (it4.hasNext()) {
                                    jSONArray2.put(it4.next());
                                }
                            }
                            jSONObject.put("codecName", jSONArray2);
                            jSONArray.put(jSONObject);
                        }
                    }
                    str = jSONArray.toString();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.TaskReportHardwareInfo", e, "hy: error when build up json", new Object[0]);
                }
            } else {
                Log.m105928w("MicroMsg.TaskReportHardwareInfo", "hy: no mime info retrieved!");
                str = "";
            }
            objArr[39] = str;
            objArr[40] = Integer.valueOf(qf22.f64499n.f354038f ? 1 : 0);
            nVar.mo160131h(14552, objArr);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
            C115669n.INSTANCE.idkeyStat(661, 0, 1, false);
            return Boolean.TRUE;
        } else {
            Log.m105928w("MicroMsg.TaskReportHardwareInfo", "hy: error when finding hardware");
            C115669n.INSTANCE.idkeyStat(661, 1, 1, false);
            return Boolean.FALSE;
        }
    }
}
