package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.URLUtil;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.scanner.model.C19028m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import nj3.C76879j;
import ob0.C117747y;
import p728vs.C52990d;
import pj3.C47511g;
import qe3.C12212g;

/* renamed from: com.tencent.mm.plugin.scanner.ui.VcardContactUI */
public class VcardContactUI extends MMPreference {

    /* renamed from: g */
    public static ArrayList<String> f53792g = new ArrayList<>();

    /* renamed from: h */
    public static int f53793h = 1;

    /* renamed from: i */
    public static int f53794i = 1;

    /* renamed from: d */
    public C19028m1 f53795d;

    /* renamed from: e */
    public C47511g f53796e;

    /* renamed from: f */
    public C94512a0 f53797f;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.VcardContactUI$a */
    public class C19120a implements MenuItem.OnMenuItemClickListener {
        public C19120a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            VcardContactUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m20231H7(VcardContactUI vcardContactUI, Intent intent) {
        C19028m1.C5155a aVar;
        vcardContactUI.getClass();
        intent.setFlags(268435456);
        String a = vcardContactUI.f53795d.f53481a.mo6120a();
        if (!Util.isNullOrNil(a)) {
            intent.putExtra("name", a);
        } else {
            Log.m105920e("MicroMsg.scanner.VardContactUI", "no contact user name");
        }
        List<String> list = vcardContactUI.f53795d.f53490j;
        int i = 2;
        if (list == null || ((ArrayList) list).size() <= 0) {
            i = 1;
        } else {
            vcardContactUI.mo24467J7(list, intent, 2, 1);
        }
        List<String> list2 = vcardContactUI.f53795d.f53491k;
        if (list2 != null && ((ArrayList) list2).size() > 0) {
            vcardContactUI.mo24467J7(list2, intent, 1, i);
            i++;
        }
        List<String> list3 = vcardContactUI.f53795d.f53492l;
        if (list3 != null && ((ArrayList) list3).size() > 0) {
            vcardContactUI.mo24467J7(list3, intent, 3, i);
            i++;
        }
        List<String> list4 = vcardContactUI.f53795d.f53494n;
        if (list4 != null && ((ArrayList) list4).size() > 0) {
            vcardContactUI.mo24467J7(list4, intent, 7, i);
            i++;
        }
        List<String> list5 = vcardContactUI.f53795d.f53493m;
        if (list5 != null && ((ArrayList) list5).size() > 0) {
            vcardContactUI.mo24467J7(list5, intent, 0, i);
        }
        if (!Util.isNullOrNil(vcardContactUI.f53795d.f53501u)) {
            intent.putExtra("company", vcardContactUI.f53795d.f53501u);
        }
        if (!Util.isNullOrNil(vcardContactUI.f53795d.f53499s)) {
            intent.putExtra("notes", vcardContactUI.f53795d.f53499s);
        }
        if (!Util.isNullOrNil(vcardContactUI.f53795d.f53495o)) {
            intent.putExtra(Scopes.EMAIL, vcardContactUI.f53795d.f53495o);
        }
        if (!Util.isNullOrNil(vcardContactUI.f53795d.f53496p)) {
            intent.putExtra("job_title", vcardContactUI.f53795d.f53496p);
        }
        C19028m1 m1Var = vcardContactUI.f53795d;
        C19028m1.C5155a aVar2 = m1Var.f53487g;
        if (aVar2 == null || aVar2.mo6119a().length() <= 0) {
            C19028m1.C5155a aVar3 = m1Var.f53488h;
            if (aVar3 == null || aVar3.mo6119a().length() <= 0) {
                C19028m1.C5155a aVar4 = m1Var.f53489i;
                if (aVar4 == null || aVar4.mo6119a().length() <= 0) {
                    C19028m1.C5155a aVar5 = m1Var.f53486f;
                    aVar = (aVar5 == null || aVar5.mo6119a().length() <= 0) ? null : m1Var.f53486f;
                } else {
                    aVar = m1Var.f53489i;
                }
            } else {
                aVar = m1Var.f53488h;
            }
        } else {
            aVar = m1Var.f53487g;
        }
        if (aVar != null && aVar.mo6119a().length() > 0) {
            intent.putExtra("postal", aVar.mo6119a());
        }
    }

    /* renamed from: I7 */
    public final void mo24466I7(String str, String str2) {
        KeyValuePreference keyValuePreference = new KeyValuePreference(this);
        keyValuePreference.mo69924H(str2);
        keyValuePreference.f121271G = C0966R.C0971layout.bcy;
        keyValuePreference.mo69912I(false);
        keyValuePreference.mo7741E(str);
        keyValuePreference.f121240L = false;
        keyValuePreference.f121243P = true;
        keyValuePreference.f121245R = 49;
        this.f53796e.mo72524h(keyValuePreference, f53794i);
    }

    /* renamed from: J7 */
    public final void mo24467J7(List<String> list, Intent intent, int i, int i2) {
        for (String next : list) {
            if (i2 == 1) {
                intent.putExtra("phone", next);
                intent.putExtra("phone_type", i);
            } else if (i2 == 2) {
                intent.putExtra("secondary_phone", next);
                intent.putExtra("phone_type", i);
            } else if (i2 == 3) {
                intent.putExtra("tertiary_phone", next);
                intent.putExtra("phone_type", i);
            }
        }
    }

    /* renamed from: K7 */
    public final void mo24468K7(List<String> list, String str, String str2) {
        if (list != null && list.size() > 0) {
            for (String next : list) {
                VcardContactLinkPreference vcardContactLinkPreference = new VcardContactLinkPreference(this);
                vcardContactLinkPreference.mo26273A(str + String.valueOf(next));
                ArrayList<String> arrayList = f53792g;
                if (!arrayList.contains(str + String.valueOf(next))) {
                    ArrayList<String> arrayList2 = f53792g;
                    arrayList2.add(str + String.valueOf(next));
                }
                vcardContactLinkPreference.mo69924H(str2);
                vcardContactLinkPreference.f121271G = C0966R.C0971layout.bcy;
                vcardContactLinkPreference.mo7741E(next);
                vcardContactLinkPreference.mo69912I(false);
                vcardContactLinkPreference.f121240L = true;
                vcardContactLinkPreference.f121243P = true;
                vcardContactLinkPreference.f121245R = 49;
                this.f53796e.mo72524h(vcardContactLinkPreference, f53793h);
            }
        }
    }

    public int getResourceId() {
        return -1;
    }

    public void initView() {
        C19028m1 m1Var;
        this.f53797f = new C94512a0(this);
        this.f53796e = getPreferenceScreen();
        this.f53795d = C19028m1.f53480v;
        setBackBtn(new C19120a());
        setMMTitle("");
        this.f53796e.removeAll();
        this.f53796e.mo72520b(C0966R.xml.f8982d5);
        VcardContactUserHeaderPreference vcardContactUserHeaderPreference = (VcardContactUserHeaderPreference) this.f53796e.mo72519a("v_contact_info_header");
        if (!(vcardContactUserHeaderPreference == null || (m1Var = this.f53795d) == null)) {
            if (!Util.isNullOrNil(m1Var.f53481a.mo6120a())) {
                vcardContactUserHeaderPreference.f20595M = m1Var.f53481a.mo6120a();
            }
            if (!Util.isNullOrNil(m1Var.f53482b)) {
                vcardContactUserHeaderPreference.f20596N = m1Var.f53482b;
            }
            if (!Util.isNullOrNil(m1Var.f53497q)) {
                vcardContactUserHeaderPreference.f20597P = m1Var.f53497q;
            }
            if (!Util.isNullOrNil(m1Var.f53496p)) {
                vcardContactUserHeaderPreference.f20598Q = m1Var.f53496p;
            }
        }
        this.f53796e.mo72531o("c_contact_info_wx_id");
        if (!Util.isNullOrNil(this.f53795d.f53483c)) {
            VcardContactLinkPreference vcardContactLinkPreference = (VcardContactLinkPreference) this.f53796e.mo72519a("v_contact_info_photo_uri");
            if (vcardContactLinkPreference != null) {
                vcardContactLinkPreference.mo7741E(this.f53795d.f53483c);
                vcardContactLinkPreference.mo69912I(false);
                vcardContactLinkPreference.f121240L = false;
                f53793h += 2;
                f53794i += 2;
            }
        } else {
            this.f53796e.mo72531o("v_contact_info_photo_uri");
            this.f53796e.mo72531o("v_category_photo_uri");
        }
        C19028m1.C5155a aVar = this.f53795d.f53488h;
        if (aVar != null && aVar.mo6119a().length() > 0) {
            mo24466I7(aVar.mo6119a(), getContext().getString(C0966R.string.k94));
        }
        C19028m1.C5155a aVar2 = this.f53795d.f53489i;
        if (aVar2 != null && aVar2.mo6119a().length() > 0) {
            mo24466I7(aVar2.mo6119a(), getContext().getString(C0966R.string.k9g));
        }
        C19028m1.C5155a aVar3 = this.f53795d.f53486f;
        if (aVar3 != null && aVar3.mo6119a().length() > 0) {
            mo24466I7(aVar3.mo6119a(), getContext().getString(C0966R.string.k8z));
        }
        C19028m1.C5155a aVar4 = this.f53795d.f53487g;
        if (aVar4 != null && aVar4.mo6119a().length() > 0) {
            mo24466I7(aVar4.mo6119a(), getContext().getString(C0966R.string.k8z));
        }
        List<String> list = this.f53795d.f53492l;
        if (list != null && ((ArrayList) list).size() > 0) {
            mo24468K7(list, "WorkTel", getContext().getString(C0966R.string.k9h));
        }
        List<String> list2 = this.f53795d.f53491k;
        if (list2 != null && ((ArrayList) list2).size() > 0) {
            mo24468K7(list2, "HomeTel", getContext().getString(C0966R.string.k96));
        }
        List<String> list3 = this.f53795d.f53493m;
        if (list3 != null && ((ArrayList) list3).size() > 0) {
            mo24468K7(list3, "VideoTEL", getContext().getString(C0966R.string.k9e));
        }
        List<String> list4 = this.f53795d.f53494n;
        if (list4 != null && ((ArrayList) list4).size() > 0) {
            mo24468K7(list4, "NormalTel", getContext().getString(C0966R.string.k99));
        }
        List<String> list5 = this.f53795d.f53490j;
        if (list5 != null && ((ArrayList) list5).size() > 0) {
            mo24468K7(list5, "CellTel", getContext().getString(C0966R.string.f361488k92));
        }
        if (!Util.isNullOrNil(this.f53795d.f53501u)) {
            KeyValuePreference keyValuePreference = (KeyValuePreference) this.f53796e.mo72519a("v_contact_info_org");
            if (keyValuePreference != null) {
                keyValuePreference.mo7741E(this.f53795d.f53501u);
                keyValuePreference.mo69912I(false);
                keyValuePreference.f121240L = true;
            }
        } else {
            this.f53796e.mo72531o("v_contact_info_org");
        }
        if (!Util.isNullOrNil(this.f53795d.f53498r)) {
            KeyValuePreference keyValuePreference2 = (KeyValuePreference) this.f53796e.mo72519a("v_contact_info_agent");
            if (keyValuePreference2 != null) {
                keyValuePreference2.mo7741E(this.f53795d.f53498r);
                keyValuePreference2.mo69912I(false);
                keyValuePreference2.f121240L = true;
            }
        } else {
            this.f53796e.mo72531o("v_contact_info_agent");
        }
        if (!Util.isNullOrNil(this.f53795d.f53500t)) {
            VcardContactLinkPreference vcardContactLinkPreference2 = (VcardContactLinkPreference) this.f53796e.mo72519a("v_contact_info_home_page");
            if (vcardContactLinkPreference2 != null) {
                vcardContactLinkPreference2.mo7741E(this.f53795d.f53500t);
                vcardContactLinkPreference2.mo69912I(false);
                vcardContactLinkPreference2.f121240L = true;
            }
        } else {
            this.f53796e.mo72531o("v_contact_info_home_page");
            this.f53796e.mo72531o("v_category_home_page");
        }
        if (!Util.isNullOrNil(this.f53795d.f53495o)) {
            VcardContactLinkPreference vcardContactLinkPreference3 = (VcardContactLinkPreference) this.f53796e.mo72519a("v_contact_info_email");
            if (vcardContactLinkPreference3 != null) {
                vcardContactLinkPreference3.mo7741E(this.f53795d.f53495o);
                vcardContactLinkPreference3.mo69912I(false);
                vcardContactLinkPreference3.f121240L = true;
            }
        } else {
            this.f53796e.mo72531o("v_contact_info_email");
        }
        if (!Util.isNullOrNil(this.f53795d.f53485e)) {
            KeyValuePreference keyValuePreference3 = (KeyValuePreference) this.f53796e.mo72519a("v_contact_info_birthday");
            if (keyValuePreference3 != null) {
                keyValuePreference3.mo7741E(this.f53795d.f53485e);
                keyValuePreference3.mo69912I(false);
                keyValuePreference3.f121240L = true;
            }
        } else {
            this.f53796e.mo72531o("v_contact_info_birthday");
            this.f53796e.mo72531o("v_category_birthday");
        }
        if (!Util.isNullOrNil(this.f53795d.f53499s)) {
            KeyValuePreference keyValuePreference4 = (KeyValuePreference) this.f53796e.mo72519a("v_contact_info_remark");
            if (keyValuePreference4 != null) {
                keyValuePreference4.mo7741E(this.f53795d.f53499s);
                keyValuePreference4.mo69912I(false);
                keyValuePreference4.f121240L = true;
            }
        } else {
            this.f53796e.mo72531o("v_contact_info_remark");
            this.f53796e.mo72531o("v_category_remark");
        }
        C19028m1.C19029c cVar = this.f53795d.f53484d;
        if (cVar == null || !cVar.f53502a.contains("uri")) {
            this.f53796e.mo72531o("v_contact_info_logo");
            this.f53796e.mo72531o("v_category_logo");
            return;
        }
        VcardContactLinkPreference vcardContactLinkPreference4 = (VcardContactLinkPreference) this.f53796e.mo72519a("v_contact_info_logo");
        vcardContactLinkPreference4.mo7741E(this.f53795d.f53484d.f53503b);
        vcardContactLinkPreference4.f121240L = false;
        vcardContactLinkPreference4.mo69912I(false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.equals("add_vcard_contact")) {
            C76879j.m92736g(this, "", new String[]{getString(C0966R.string.k8y), getString(C0966R.string.k8x)}, "", new C5174z(this));
            return true;
        }
        if (preference.f121285r.equals("v_contact_info_photo_uri") || preference.f121285r.equals("v_contact_info_home_page") || preference.f121285r.equals("v_contact_info_logo")) {
            String charSequence = preference.mo5913r().toString();
            if (charSequence != null && charSequence.length() > 0 && URLUtil.isNetworkUrl(charSequence)) {
                C94512a0 a0Var = this.f53797f;
                if (!a0Var.f273312h.stopped()) {
                    Log.m105920e("MicroMsg.scanner.ViewMMURL", "already running, skipped");
                } else if (charSequence.length() == 0) {
                    Log.m105920e("MicroMsg.scanner.ViewMMURL", "go fail, qqNum is null");
                } else {
                    a0Var.f273309e = charSequence;
                    String str = (String) C86709a0.m107535s().mo121142i().mo119684e(46, (Object) null);
                    if (str == null || str.length() == 0) {
                        a0Var.mo129998a(charSequence, C12212g.m11775a(), new byte[0]);
                    } else {
                        C86709a0.m107524d().mo123455a(233, a0Var);
                        a0Var.f273310f = ((C52990d) C86312j.m106911c(C52990d.class)).mo73579xD(charSequence, (String) null, 4, 0, C12212g.m11775a(), new byte[0]);
                        C86709a0.m107524d().mo123460f((C117747y) a0Var.f273310f);
                        a0Var.f273312h.startTimer(3000);
                    }
                }
                return true;
            }
        } else if (f53792g.contains(preference.f121285r) && !preference.f121285r.toLowerCase().contains("fax")) {
            String trim = preference.mo5913r().toString().trim();
            if (trim != null && trim.length() > 0) {
                C76879j.m92736g(this, "", new String[]{getString(C0966R.string.bls)}, "", new C5172x(this, trim));
                return true;
            }
        } else if (preference.f121285r.equals("v_contact_info_email")) {
            String charSequence2 = preference.mo5913r().toString();
            C76879j.m92736g(this, "", new String[]{getContext().getString(C0966R.string.il7), getContext().getString(C0966R.string.il6)}, "", new C5173y(this, charSequence2));
        }
        return false;
    }
}
