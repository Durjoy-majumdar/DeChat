package p677rm;

import android.database.Cursor;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.plugin.appbrand.appusage.C29378l0;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import lj0.C34286i;
import p235sm.C101649q0;

@C86522b
/* renamed from: rm.f0 */
public class C36356f0 extends C86301e implements C101649q0 {
    public void dw0(MStorage.IOnStorageChange iOnStorageChange) {
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238473i != null) {
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238473i.add(iOnStorageChange);
        }
    }

    public void onCreate() {
        C81661j.m100182g().add(C34286i.f92410d);
    }

    public void onDestroy() {
        C81661j.m100182g().remove(C34286i.f92410d);
    }

    /* renamed from: rg */
    public void mo60643rg(MStorage.IOnStorageChange iOnStorageChange) {
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238473i != null) {
            C81161g2.requireAccountInitializedOnDemand();
            C81161g2.f238473i.remove(iOnStorageChange);
        }
    }

    /* renamed from: tM */
    public List<AppBrandRecentTaskInfo> mo60644tM() {
        LinkedList linkedList = new LinkedList();
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238473i != null) {
            C81161g2.requireAccountInitializedOnDemand();
            ArrayList<AppBrandRecentTaskInfo> SE = C29378l0.m38692SE(C81161g2.f238473i.mo56647mI((String[]) null, 10000, 0, Integer.MAX_VALUE));
            if (!Util.isNullOrNil((List) SE)) {
                linkedList.addAll(SE);
            }
        }
        return linkedList;
    }

    /* renamed from: x5 */
    public AppBrandRecentTaskInfo mo60645x5(String str) {
        AppBrandRecentTaskInfo appBrandRecentTaskInfo;
        Cursor query;
        C81161g2.requireAccountInitializedOnDemand();
        if (C81161g2.f238473i == null) {
            return null;
        }
        C81161g2.requireAccountInitializedOnDemand();
        C29378l0 l0Var = C81161g2.f238473i;
        l0Var.getClass();
        if (!Util.isNullOrNil(str) && (query = l0Var.f80165e.query("AppBrandLauncherLayoutItem", (String[]) null, String.format(Locale.US, "%s=? and %s=?", new Object[]{TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "recordId"}), new String[]{String.valueOf(2), str}, (String) null, (String) null, (String) null)) != null) {
            if (query.moveToFirst()) {
                C29378l0.C29380b bVar = new C29378l0.C29380b();
                bVar.convertFrom(query);
                if (!Util.isNullOrNil(bVar.field_brandId)) {
                    appBrandRecentTaskInfo = C81661j.m100178c(String.valueOf(bVar.field_recordId), bVar.field_brandId, bVar.field_versionType, bVar.field_updateTime, bVar.field_usedInThirdPartyAppRecently, bVar.field_thirdPartyAppUsingDesc);
                    query.close();
                }
            }
            appBrandRecentTaskInfo = null;
            query.close();
        } else {
            appBrandRecentTaskInfo = null;
        }
        if (appBrandRecentTaskInfo == null) {
            return null;
        }
        return appBrandRecentTaskInfo;
    }
}
