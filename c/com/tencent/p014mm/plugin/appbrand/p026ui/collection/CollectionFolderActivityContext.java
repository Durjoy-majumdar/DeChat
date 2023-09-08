package com.tencent.p014mm.plugin.appbrand.p026ui.collection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81495g1;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherBlankPage;
import com.tencent.p014mm.plugin.appbrand.p026ui.launcher.FolderActivityContextWithLifecycle;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import kr0.C88273g1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionFolderActivityContext;", "Lcom/tencent/mm/plugin/appbrand/ui/launcher/FolderActivityContextWithLifecycle;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "Lcom/tencent/mm/ui/MMActivity;", "activity", "<init>", "(Lcom/tencent/mm/ui/MMActivity;)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.CollectionFolderActivityContext */
public final class CollectionFolderActivityContext extends FolderActivityContextWithLifecycle implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public final String f246653d = "CollectionFolderActivityContext";

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.collection.CollectionFolderActivityContext$a */
    public static final class C84516a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CollectionFolderActivityContext f246654d;

        public C84516a(CollectionFolderActivityContext collectionFolderActivityContext) {
            this.f246654d = collectionFolderActivityContext;
        }

        public final void run() {
            this.f246654d.mo117057A2(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionFolderActivityContext(MMActivity mMActivity) {
        super(mMActivity);
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: A2 */
    public void mo117057A2(boolean z) {
        Fragment fragment;
        String str;
        Intent intent;
        Intent intent2;
        if (!mo117251a().isFinishing()) {
            if (!(z ? AppBrandCollectionDisplayVerticalList.class : AppBrandLauncherBlankPage.class).isInstance(mo117251a().getSupportFragmentManager().findFragmentById(16908290))) {
                mo117251a().removeAllOptionMenu();
                if (z) {
                    mo117251a().showActionbarLine();
                } else {
                    mo117251a().hideActionbarLine();
                }
                C112919c0 beginTransaction = mo117251a().getSupportFragmentManager().beginTransaction();
                if (z) {
                    fragment = new AppBrandCollectionDisplayVerticalList();
                } else {
                    String string = mo117251a().getString(C0966R.string.f7839tb);
                    String string2 = mo117251a().getString(C0966R.string.f7640mb);
                    AppBrandLauncherBlankPage appBrandLauncherBlankPage = new AppBrandLauncherBlankPage();
                    Bundle bundle = new Bundle(2);
                    bundle.putString("extra_title", string);
                    bundle.putString("extra_tip", string2);
                    appBrandLauncherBlankPage.setArguments(bundle);
                    fragment = appBrandLauncherBlankPage;
                }
                beginTransaction.mo165200l(16908290, fragment);
                beginTransaction.mo165163e();
                C68585h1 h1Var = (C68585h1) C86312j.m106911c(C68585h1.class);
                MMActivity a = mo117251a();
                if (a == null || (intent2 = a.getIntent()) == null || (str = intent2.getStringExtra("extra_enter_scene_note")) == null) {
                    str = "";
                }
                MMActivity a2 = mo117251a();
                if (!(a2 == null || (intent = a2.getIntent()) == null)) {
                    int intExtra = intent.getIntExtra("extra_enter_scene", -1);
                    String str2 = this.f246653d;
                    Log.m105924i(str2, "EnterScene = " + intExtra);
                    if (intExtra == 1 || intExtra == 3 || intExtra == 4) {
                        C84240s.m103842h(intExtra, str);
                    }
                }
                if (!z) {
                    h1Var.add(this.f246653d + ".WORKER", (MStorage.IOnStorageChange) this);
                } else {
                    h1Var.remove(this);
                }
                if (z) {
                    AppBrandProcessesManager.C84268b bVar = AppBrandProcessesManager.f246131g;
                    AppBrandProcessesManager a3 = bVar.mo116962a();
                    LuggageServiceType luggageServiceType = LuggageServiceType.WASERVICE;
                    C88273g1 g1Var = C88273g1.APPBRAND_LAUNCHER;
                    a3.mo116954S(luggageServiceType, g1Var);
                    bVar.mo116962a().mo116954S(LuggageServiceType.WAGAME, g1Var);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo117188b(Intent intent) {
        View findViewById = mo117251a().findViewById(16908290);
        if (findViewById != null) {
            findViewById.setBackgroundColor(-855310);
        }
        mo117057A2(true);
        if (intent != null) {
            C81495g1.C81496a.m99972a(C81495g1.f239096a, intent.getIntExtra("extra_get_usage_reason", 7), intent.getIntExtra("extra_get_usage_prescene", 0), (C81495g1.C81497b) null, 4, (Object) null);
        }
    }

    public void onActivityDidResume() {
        mo117251a().setMMTitle((int) C0966R.string.f7839tb);
    }

    public void onActivityWillDestroy() {
        super.onActivityWillDestroy();
        ((C68585h1) C86312j.m106911c(C68585h1.class)).remove(this);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (((C68585h1) C86312j.m106911c(C68585h1.class)).getCount() > 0) {
            mo117251a().runOnUiThread(new C84516a(this));
        }
    }
}
