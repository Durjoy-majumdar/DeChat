package com.tencent.p014mm.plugin.sns.model;

import android.content.Intent;
import android.os.Parcel;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import hi2.C98453h;
import os2.C35285a0;

/* renamed from: com.tencent.mm.plugin.sns.model.u1 */
public class C94954u1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f275270d;

    public C94954u1(C94950t1 t1Var, String str) {
        this.f275270d = str;
    }

    public void run() {
        C35285a0 qq;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$2");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_clear_sns_tmp_file, true);
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        Log.m105925i("MicroMsg.SnsRetryEditTipManager", "removeDraftTmpFile clear:%s finalDraftKey:%s", Boolean.valueOf(wf), this.f275270d);
        if (wf && (qq = C94866e1.Wx0().mo60188qq(this.f275270d)) != null) {
            byte[] bArr = qq.field_draft;
            if (!Util.isNullOrNil(bArr)) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    Intent intent = (Intent) Intent.CREATOR.createFromParcel(obtain);
                    String stringExtra = intent.getStringExtra("KSightThumbPath");
                    String stringExtra2 = intent.getStringExtra("KSightPath");
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
                    Log.m105925i("MicroMsg.SnsRetryEditTipManager", "delete %s, %s", stringExtra, stringExtra2);
                    C98453h hVar = C98453h.f288774a;
                    hVar.mo137812j(stringExtra2);
                    hVar.mo137812j(stringExtra);
                } catch (Exception unused) {
                    C94866e1.Wx0().mo60186Yt(this.f275270d, (byte[]) null, 0);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$2");
    }
}
