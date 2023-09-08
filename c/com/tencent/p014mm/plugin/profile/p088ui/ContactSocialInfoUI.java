package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import dg0.C75398e;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import hg0.C76166a;
import hg0.C76167a1;
import hg0.C76186t;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p214om.C11502f;
import p823sg.C77710q;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI */
public class ContactSocialInfoUI extends MMPreference {

    /* renamed from: s */
    public static final /* synthetic */ int f20186s = 0;

    /* renamed from: d */
    public C47511g f20187d;

    /* renamed from: e */
    public C72996z1 f20188e;

    /* renamed from: f */
    public C76166a f20189f;

    /* renamed from: g */
    public String f20190g;

    /* renamed from: h */
    public String f20191h;

    /* renamed from: i */
    public String f20192i;

    /* renamed from: j */
    public String f20193j;

    /* renamed from: n */
    public String f20194n;

    /* renamed from: o */
    public String f20195o;

    /* renamed from: p */
    public JSONObject f20196p;

    /* renamed from: q */
    public long f20197q;

    /* renamed from: r */
    public String f20198r;

    /* renamed from: com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI$a */
    public class C4946a implements MenuItem.OnMenuItemClickListener {
        public C4946a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ContactSocialInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo5906H7(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("tel:" + str));
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactSocialInfoUI", "dial", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/profile/ui/ContactSocialInfoUI", "dial", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: I7 */
    public final void mo5907I7() {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f20196p.optString("ShopUrl"));
        intent.putExtra("geta8key_username", C75592q0.m90789s());
        C88144b.m109791i(getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: J7 */
    public final boolean mo5908J7(String str, Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return C76186t.m91541i(str, getContext(), byteArrayOutputStream.toByteArray());
    }

    /* renamed from: K7 */
    public final void mo5909K7(String str, String str2, boolean z) {
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            this.f20187d.mo72531o(str);
            return;
        }
        KeyValuePreference keyValuePreference = (KeyValuePreference) this.f20187d.mo72519a(str);
        if (keyValuePreference != null) {
            keyValuePreference.f121244Q = true;
            keyValuePreference.f121246S = 5;
            if (z) {
                keyValuePreference.f121293z = getResources().getColor(C0966R.color.a1d);
            }
            keyValuePreference.mo7741E(str2);
            keyValuePreference.mo69912I(false);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8888ag;
    }

    public void initView() {
        String str;
        setMMTitle((int) C0966R.string.br7);
        setBackBtn(new C4946a());
        this.f20187d = getPreferenceScreen();
        String stringExtra = getIntent().getStringExtra("Contact_Mobile_MD5");
        String stringExtra2 = getIntent().getStringExtra("Contact_full_Mobile_MD5");
        if (!Util.isNullOrNil(stringExtra) || !Util.isNullOrNil(stringExtra2)) {
            if ((stringExtra != null && stringExtra.length() > 0) || (stringExtra2 != null && stringExtra2.length() > 0)) {
                C76166a b = C75398e.vx0().mo106402b(stringExtra);
                this.f20189f = b;
                if (b == null || b.mo106385e() == null || this.f20189f.mo106385e().length() <= 0) {
                    C76166a b2 = C75398e.vx0().mo106402b(stringExtra2);
                    this.f20189f = b2;
                    if (!(b2 == null || b2.mo106385e() == null)) {
                        this.f20189f.mo106385e().getClass();
                    }
                }
            }
        } else if (Util.isNullOrNil(this.f20188e.getUsername())) {
            this.f20189f = C75398e.vx0().mo106401a(this.f20198r);
        } else {
            this.f20189f = C75398e.vx0().mo106401a(this.f20188e.getUsername());
        }
        C76166a aVar = this.f20189f;
        if (aVar == null || aVar.mo106385e() == null || this.f20189f.mo106385e().length() <= 0) {
            Log.m105920e("MicroMsg.ContactSocialInfoUI", "error : this is not the mobile contact, MD5 = null");
        } else {
            this.f20190g = Util.nullAsNil(this.f20189f.mo106388h()) + " " + Util.nullAsNil(this.f20189f.mo106386f()).replace(" ", "");
        }
        mo5909K7("contact_info_social_mobile", this.f20190g, true);
        int nullAsNil = Util.nullAsNil((Integer) C97625j3.m125812b().mo105906u().mo119684e(9, (Object) null));
        this.f20197q = getIntent().getLongExtra("Contact_Uin", 0);
        String stringExtra3 = getIntent().getStringExtra("Contact_QQNick");
        this.f20191h = stringExtra3;
        if (!(this.f20197q == 0 || nullAsNil == 0)) {
            if (stringExtra3 == null || stringExtra3.length() == 0) {
                C76167a1 a = C75398e.Ax0().mo106404a(this.f20197q);
                if (a == null) {
                    a = null;
                }
                if (a != null) {
                    this.f20191h = a.mo106399c();
                }
            }
            this.f20192i = Util.nullAsNil(this.f20191h);
            this.f20192i += " " + new C77710q(this.f20197q).longValue();
        }
        mo5909K7("contact_info_social_qq", this.f20192i, true);
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("LinkedinPluginClose");
        if (!(Util.isNullOrNil(c) || Util.getInt(c, 0) == 0) || Util.isNullOrNil(this.f20188e.f149517U0)) {
            this.f20193j = "";
        } else {
            this.f20193j = this.f20188e.f149519V0;
        }
        mo5909K7("contact_info_social_linkedin", this.f20193j, true);
        mo5909K7("contact_info_social_facebook", (String) null, false);
        this.f20195o = Util.nullAs(getIntent().getStringExtra("verify_gmail"), "");
        this.f20194n = Util.nullAs(getIntent().getStringExtra("profileName"), Util.subStringEmail(this.f20195o));
        if (Util.isNullOrNil(this.f20195o) || Util.isNullOrNil(this.f20194n)) {
            mo5909K7("contact_info_social_googlecontacts", "", false);
        } else {
            mo5909K7("contact_info_social_googlecontacts", this.f20194n + 10 + this.f20195o, false);
        }
        if (C75592q0.m90789s().equals(this.f20188e.getUsername())) {
            str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_PROFILE_WEIDIANINFO_STRING, (Object) null);
            Log.m105925i("MicroMsg.ContactSocialInfoUI", "in self social info page, weishop info:%s", str);
        } else {
            str = this.f20188e.f149523X0;
            Log.m105925i("MicroMsg.ContactSocialInfoUI", "weiShopInfo:%s", str);
        }
        if (!Util.isNullOrNil(str)) {
            try {
                this.f20196p = new JSONObject(str);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.ContactSocialInfoUI", e, "", new Object[0]);
                this.f20196p = null;
            }
        }
        JSONObject jSONObject = this.f20196p;
        if (jSONObject != null) {
            mo5909K7("contact_info_social_weishop", jSONObject.optString("ShopName"), true);
        } else {
            mo5909K7("contact_info_social_weishop", "", false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20198r = Util.nullAsNil(getIntent().getStringExtra("Contact_User"));
        this.f20188e = C97625j3.m125812b().mo105907v().get(this.f20198r);
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        int lastIndexOf;
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.ContactSocialInfoUI", str + " item has been clicked!");
        if (str.equals("contact_info_social_mobile")) {
            if (!(this.f20189f == null || this.f20188e == null)) {
                if (C97625j3.m125812b().mo105907v().mo69724s3(this.f20189f.mo106389i())) {
                    C76166a aVar = this.f20189f;
                    String[] stringArray = (aVar == null || Util.isNullOrNil(aVar.f223128p)) ? getResources().getStringArray(C0966R.array.f2591aa) : getResources().getStringArray(C0966R.array.f2590a_);
                    if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().cx0()) {
                        ArrayList<String> stringsToList = Util.stringsToList(stringArray);
                        stringsToList.add(getResources().getString(C0966R.string.bae));
                        stringArray = (String[]) stringsToList.toArray(new String[stringsToList.size()]);
                        C115669n.INSTANCE.mo160131h(11621, 2, 3);
                    }
                    C76879j.m92736g(this, (String) null, stringArray, (String) null, new C4994h0(this, stringArray));
                } else {
                    String str2 = this.f20190g;
                    if (!(str2 == null || str2.length() == 0 || (lastIndexOf = this.f20190g.lastIndexOf(32) + 1) <= 0)) {
                        mo5906H7(this.f20190g.substring(lastIndexOf));
                    }
                }
            }
        } else if (!str.equals("contact_info_social_qq")) {
            if (str.equals("contact_info_social_linkedin")) {
                String str3 = this.f20188e.f149521W0;
                if (Util.isNullOrNil(str3)) {
                    Log.m105920e("MicroMsg.ContactSocialInfoUI", "this liurl is null!");
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", str3);
                    intent.putExtra("geta8key_username", C75592q0.m90789s());
                    C88144b.m109791i(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
                }
            } else if (!str.equals("contact_info_social_facebook") && !str.equals("contact_info_social_googlecontacts") && str.equals("contact_info_social_weishop") && this.f20196p != null) {
                if (C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_PROFILE_WEIDIANINFO_ALERT_INT, (Object) null) == null) {
                    C76879j.m92743n(this, C0966R.string.br9, C0966R.string.a3h, new C4996j0(this), (DialogInterface.OnClickListener) null);
                } else {
                    mo5907I7();
                }
            }
        }
        return false;
    }
}
