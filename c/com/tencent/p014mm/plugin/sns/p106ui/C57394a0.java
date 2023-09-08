package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import mt2.C47101a;
import qo3.C77407n;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.a0 */
public class C57394a0 {

    /* renamed from: a */
    public C89779i0 f164402a = null;

    /* renamed from: b */
    public C77407n f164403b = null;

    /* renamed from: c */
    public Context f164404c;

    public C57394a0(Context context) {
        this.f164404c = context;
    }

    /* renamed from: a */
    public void mo80996a(boolean z, SnsInfo snsInfo) {
        boolean z2;
        SnsMethodCalculate.markStartTimeMs("showBottomMenu", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            if (snsInfo == null) {
                SnsMethodCalculate.markEndTimeMs("showBottomMenu", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
                return;
            }
            SnsMethodCalculate.markStartTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC, 0);
            if (j == 0) {
                z2 = C47101a.f126572a;
                SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            } else if (j != 2) {
                if (C47101a.f126572a) {
                    Log.m105924i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                    C47101a.f126572a = false;
                }
                SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                z2 = false;
            } else {
                if (!C47101a.f126572a) {
                    Log.m105924i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                    C47101a.f126572a = true;
                }
                SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                z2 = true;
            }
            if (z2) {
                arrayList.add(this.f164404c.getString(C0966R.string.mym));
                arrayList2.add(2);
            } else if (snsInfo.getLocalPrivate() <= 0) {
                arrayList.add(this.f164404c.getString(C0966R.string.f361390jh2));
                arrayList2.add(0);
            } else if (!Util.isNullOrNil(C94866e1.Mx0()) && C94866e1.Mx0().equals(snsInfo.getUserName())) {
                arrayList.add(this.f164404c.getString(C0966R.string.f361389jh1));
                arrayList2.add(1);
            }
            SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            if (arrayList.size() == 0) {
                SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            } else {
                C77407n nVar = new C77407n(this.f164404c, 1, false);
                this.f164403b = nVar;
                nVar.f225771i = new C43157v(this, arrayList, arrayList2);
                nVar.f225782p = new C57436w(this, snsInfo);
                nVar.f225761d = new C57437x(this, arrayList2, snsInfo);
                nVar.mo107573q();
                SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
            }
        }
        SnsMethodCalculate.markEndTimeMs("showBottomMenu", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager");
    }
}
