package p235sm;

import com.tencent.p014mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C7335d;
import java.util.List;

/* renamed from: sm.q0 */
public interface C101649q0 extends C7335d {
    void dw0(MStorage.IOnStorageChange iOnStorageChange);

    void onCreate();

    void onDestroy();

    /* renamed from: rg */
    void mo60643rg(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: tM */
    List<AppBrandRecentTaskInfo> mo60644tM();

    /* renamed from: x5 */
    AppBrandRecentTaskInfo mo60645x5(String str);
}
