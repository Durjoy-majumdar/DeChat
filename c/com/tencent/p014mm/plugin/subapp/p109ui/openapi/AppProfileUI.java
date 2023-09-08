package com.tencent.p014mm.plugin.subapp.p109ui.openapi;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.subapp.p109ui.openapi.AppHeaderPreference;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import eb0.C97625j3;
import java.util.LinkedList;
import junit.framework.Assert;
import p763ym.C79138l;
import pj3.C47511g;
import tc0.C37007j;
import tc0.C77885p;
import zw2.C53827e;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI */
public class AppProfileUI extends MMPreference implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public C44561j f116809d;

    /* renamed from: e */
    public C47511g f116810e;

    /* renamed from: f */
    public AppHeaderPreference.C43174a f116811f;

    /* renamed from: g */
    public MMHandler f116812g = null;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI$a */
    public class C43177a implements AppHeaderPreference.C43174a {
        public C43177a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI$b */
    public class C43178b implements MenuItem.OnMenuItemClickListener {
        public C43178b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppProfileUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo67403H7(C44561j jVar, boolean z) {
        LinkedList linkedList = new LinkedList();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(jVar.field_appId);
        sb.append(",");
        sb.append(z ? "1" : "2");
        linkedList.add(new C37007j.C37008a(10165, sb.toString()));
        ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C37007j(linkedList));
    }

    /* renamed from: I7 */
    public final void mo67404I7() {
        this.f116810e.removeAll();
        this.f116810e.mo72520b(getResourceId());
        boolean z = true;
        if (this.f116809d.field_status == 1) {
            this.f116810e.mo72531o("app_profile_add");
        } else {
            this.f116810e.mo72531o("app_profile_remove");
        }
        AppHeaderPreference appHeaderPreference = (AppHeaderPreference) this.f116810e.mo72519a("app_profile_header");
        AppHeaderPreference.C43174a aVar = this.f116811f;
        if (this.f116809d.field_status != 1) {
            z = false;
        }
        appHeaderPreference.mo67399I(aVar, z);
    }

    public int getResourceId() {
        return C0966R.xml.f8858g;
    }

    public void initView() {
        this.f116811f = new C43177a();
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(getIntent().getStringExtra("AppProfileUI_AppId"));
        this.f116809d = appInfo;
        Assert.assertTrue("initView : appInfo does not exist", appInfo != null);
        setMMTitle((int) C0966R.string.f360094a23);
        this.f116810e = getPreferenceScreen();
        setBackBtn(new C43178b());
        mo67404I7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (str.equals(this.f116809d.field_appId)) {
            initView();
        }
    }

    public void onPause() {
        C72709y1.yx0().remove(this);
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.AppProfileUI", str + " item has been clicked!");
        if (str.equals("app_profile_add")) {
            C44561j jVar = this.f116809d;
            jVar.field_status = 1;
            jVar.field_modifyTime = System.currentTimeMillis();
            C72709y1.yx0().update(this.f116809d, new String[0]);
            mo67404I7();
            mo67403H7(this.f116809d, true);
            C53827e eVar = new C53827e(this);
            this.f116812g = eVar;
            eVar.sendEmptyMessageDelayed(0, 30);
            return true;
        } else if (!str.equals("app_profile_remove")) {
            return false;
        } else {
            C44561j jVar2 = this.f116809d;
            jVar2.field_status = 0;
            jVar2.field_modifyTime = System.currentTimeMillis();
            C72709y1.yx0().update(this.f116809d, new String[0]);
            mo67404I7();
            mo67403H7(this.f116809d, false);
            C53827e eVar2 = new C53827e(this);
            this.f116812g = eVar2;
            eVar2.sendEmptyMessageDelayed(0, 30);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        C72709y1.yx0().add(this);
    }
}
