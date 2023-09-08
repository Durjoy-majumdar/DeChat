package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C86491q2;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.f */
public final class C81480f extends C86491q2 {
    /* renamed from: a */
    public String mo56580a() {
        return "MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer";
    }

    /* renamed from: b */
    public boolean mo56581b(int i) {
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_APP_BRAND_COLLECTION_RECORD_TABLE_UPGRADE_ISSUE_DONE_BOOLEAN, false);
        Log.m105918d("MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer", "needTransfer doneIssue " + g);
        return !g;
    }

    /* renamed from: c */
    public void mo56582c(int i) {
        try {
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238476o.execSQL("AppBrandStarApp", "update AppBrandStarApp set orderSequence = updateTime");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_APP_BRAND_COLLECTION_RECORD_TABLE_UPGRADE_ISSUE_DONE_BOOLEAN, Boolean.TRUE);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppBrandCollectionRecordTableUpgradeIssueDataTransfer", th, "transfer failed", new Object[0]);
        }
    }
}
