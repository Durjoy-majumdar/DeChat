package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.profile.p088ui.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C97625j3;
import junit.framework.Assert;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.profile.ui.p1 */
public abstract class C42671p1 implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public Context f115521d;

    /* renamed from: e */
    public C72996z1 f115522e;

    /* renamed from: f */
    public C47511g f115523f;

    /* renamed from: g */
    public HelperHeaderPreference.C42607a f115524g;

    public C42671p1(Context context, HelperHeaderPreference.C42607a aVar) {
        this.f115521d = context;
        this.f115524g = aVar;
    }

    /* renamed from: a */
    public abstract void mo66761a(boolean z);

    /* renamed from: b */
    public void mo66817b() {
        this.f115523f.removeAll();
        this.f115523f.mo72520b(C0966R.xml.f8868u);
        boolean z = (C75592q0.m90785o() & 32768) == 0;
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f115523f.mo72519a("contact_info_header_helper");
        if (helperHeaderPreference != null) {
            helperHeaderPreference.mo66737J(this.f115522e, this.f115524g);
        }
        if (!z) {
            this.f115523f.mo72531o("contact_info_plugin_view");
            this.f115523f.mo72531o("contact_info_plugin_clear_data");
            this.f115523f.mo72531o("contact_info_plugin_uninstall");
            return;
        }
        this.f115523f.mo72531o("contact_info_plugin_install");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        HelperHeaderPreference.C42607a aVar;
        C97625j3.m125812b().mo105906u().remove(this);
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f115523f.mo72519a("contact_info_header_helper");
        if (helperHeaderPreference == null || (aVar = helperHeaderPreference.f115333P) == null) {
            return true;
        }
        aVar.onDetach();
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MicroMsg.ContactWidgetPlugin", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C97625j3.m125812b().mo105906u() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.ContactWidgetPlugin", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (nullAsInt == 40 || nullAsInt == 34 || nullAsInt == 7) {
            mo66817b();
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        boolean z2 = false;
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(Util.nullAsNil(z1Var.getUsername()).length() > 0);
        if (gVar != null) {
            z2 = true;
        }
        Assert.assertTrue(z2);
        C97625j3.m125812b().mo105906u().add(this);
        this.f115522e = z1Var;
        this.f115523f = gVar;
        mo66817b();
        return true;
    }
}
