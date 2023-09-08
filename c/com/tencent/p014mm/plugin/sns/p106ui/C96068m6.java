package com.tencent.p014mm.plugin.sns.p106ui;

import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.TestTimeForSns;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.HashMap;
import jp2.C98963o;
import os2.C35294o0;
import os2.C35296p0;
import os2.C35297q0;

/* renamed from: com.tencent.mm.plugin.sns.ui.m6 */
public class C96068m6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI$$h0 f280515d;

    public C96068m6(SnsTimeLineUI$$h0 snsTimeLineUI$$h0) {
        this.f280515d = snsTimeLineUI$$h0;
    }

    public void run() {
        int i;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$52$1");
        if (SnsTimeLineUI.m122282J7(this.f280515d.f278752a) == null || SnsTimeLineUI.m122298Z7(this.f280515d.f278752a) == null) {
            Log.m105924i("MicroMsg.SnsTimeLineUI", "onViewDrawed is error");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$52$1");
            return;
        }
        SnsTimeLineUI.m122298Z7(this.f280515d.f278752a).setListener((TestTimeForSns.C95702a) null);
        SnsTimeLineUI snsTimeLineUI = this.f280515d.f278752a;
        SnsMethodCalculate.markStartTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = snsTimeLineUI.f278620C;
        SnsMethodCalculate.markEndTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markStartTimeMs("access$3402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.f278624E = z;
        SnsMethodCalculate.markEndTimeMs("access$3402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI snsTimeLineUI2 = this.f280515d.f278752a;
        SnsMethodCalculate.markStartTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z2 = snsTimeLineUI2.f278636K;
        SnsMethodCalculate.markEndTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (z2) {
            Log.m105928w("MicroMsg.SnsTimeLineUI", "too fast that it finish");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$52$1");
            return;
        }
        SnsTimeLineUI snsTimeLineUI3 = this.f280515d.f278752a;
        SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z3 = snsTimeLineUI3.f278624E;
        SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (z3) {
            C5431p1.C5432a dy02 = C94866e1.dy0();
            C95790g2 Kx0 = C94866e1.Kx0();
            Kx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            long j = Kx0.f279538j;
            SnsMethodCalculate.markEndTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            dy02.mo6421r(j, -1);
            C5431p1.C5432a dy03 = C94866e1.dy0();
            C95790g2 Kx02 = C94866e1.Kx0();
            Kx02.getClass();
            SnsMethodCalculate.markStartTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            long j2 = Kx02.f279539k;
            SnsMethodCalculate.markEndTimeMs("getTimeFirstId", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            dy03.mo6420q(j2);
        }
        SnsTimeLineUI snsTimeLineUI4 = this.f280515d.f278752a;
        SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z4 = snsTimeLineUI4.f278624E;
        SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (!z4) {
            Log.m105924i("MicroMsg.SnsTimeLineUI", "onViewDrawed doFpList");
            C35297q0 jy02 = C94866e1.jy0();
            jy02.getClass();
            SnsMethodCalculate.markStartTimeMs("getcurGroupRange", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
            Cursor rawQuery = jy02.f94560d.rawQuery("select *,rowid from SnsWsFoldGroup  where SnsWsFoldGroup.state=1 order by SnsWsFoldGroup.top desc limit 1", (String[]) null, 2);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    C35296p0 p0Var = new C35296p0();
                    p0Var.convertFrom(rawQuery);
                    i = p0Var.field_size;
                } else {
                    i = -1;
                }
                rawQuery.close();
            } else {
                i = -1;
            }
            SnsMethodCalculate.markEndTimeMs("getcurGroupRange", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
            Log.m105925i("MicroMsg.SnsTimeLineUI", "oldWsFoldSize:%s newWsFoldSize:%s", Integer.valueOf(i), Integer.valueOf(C94847c1.f274794d));
            if (!(i == -1 || i == C94847c1.f274794d)) {
                C35297q0 jy03 = C94866e1.jy0();
                jy03.getClass();
                SnsMethodCalculate.markStartTimeMs("dropTable", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
                Log.m105925i("MicroMsg.SnsWsFoldGroupStorage", "dropTable:%s %s", Boolean.valueOf(jy03.f94560d.execSQL("SnsWsFoldGroup", "DELETE FROM SnsWsFoldGroup")), Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis()));
                SnsMethodCalculate.markEndTimeMs("dropTable", "com.tencent.mm.plugin.sns.storage.SnsWsFoldGroupStorage");
                C35294o0 iy02 = C94866e1.iy0();
                iy02.getClass();
                SnsMethodCalculate.markStartTimeMs("dropTable", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
                long currentTimeMillis = System.currentTimeMillis();
                boolean execSQL = iy02.f94556d.execSQL("SnsWsFoldGroupDetail", "DELETE FROM SnsWsFoldGroupDetail");
                ((HashMap) iy02.f94557e).clear();
                Log.m105925i("MicroMsg.SnsWsFoldDetailStorage", "dropTable:%s %s", Boolean.valueOf(execSQL), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                SnsMethodCalculate.markEndTimeMs("dropTable", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
            }
            SnsTimeLineUI.m122290R7(this.f280515d.f278752a).mo137501a(((SnsTimeLineUI$$p) SnsTimeLineUI.m122286N7(this.f280515d.f278752a)).getType(), SnsTimeLineUI.m122287O7(this.f280515d.f278752a), SnsTimeLineUI.m122288P7(this.f280515d.f278752a), SnsTimeLineUI.m122289Q7(this.f280515d.f278752a), SnsTimeLineUI.m122293U7(this.f280515d.f278752a));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_UPDATE_SNS_TIMELINE_SCENE_INT, 1);
        }
        SnsTimeLineUI snsTimeLineUI5 = this.f280515d.f278752a;
        SnsMethodCalculate.markStartTimeMs("access$3402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI5.f278624E = false;
        SnsMethodCalculate.markEndTimeMs("access$3402", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C98963o oVar = this.f280515d.f278752a.f278640M;
        if (oVar != null) {
            oVar.mo138300g();
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$52$1");
    }
}
