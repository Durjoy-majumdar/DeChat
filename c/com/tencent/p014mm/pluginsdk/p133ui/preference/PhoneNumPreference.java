package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.C1233a;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileMobilePhoneView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import dg0.C75398e;
import eb0.C75592q0;
import hg0.C76166a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import pj3.C47511g;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.PhoneNumPreference */
public class PhoneNumPreference extends Preference implements View.OnClickListener {

    /* renamed from: J */
    public ProfileMobilePhoneView f24038J;

    /* renamed from: K */
    public String f24039K;

    /* renamed from: L */
    public String f24040L;

    /* renamed from: M */
    public C47511g f24041M;

    /* renamed from: N */
    public View f24042N;

    /* renamed from: P */
    public C72996z1 f24043P;

    /* renamed from: Q */
    public Intent f24044Q;

    public PhoneNumPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: I */
    public void mo7607I(Intent intent, C72996z1 z1Var) {
        C76166a aVar;
        this.f24043P = z1Var;
        this.f24044Q = intent;
        Log.m105925i("MicroMsg.PhoneNumPreference", "isCancelMatchPhoneMD5 %s", z1Var.mo62922p3() + "");
        String str = null;
        if (!z1Var.mo62922p3()) {
            String stringExtra = intent.getStringExtra("Contact_Mobile_MD5");
            String stringExtra2 = intent.getStringExtra("Contact_full_Mobile_MD5");
            String str2 = "true";
            if (!Util.isNullOrNil(stringExtra) || !Util.isNullOrNil(stringExtra2)) {
                if (!Util.isNullOrNil(stringExtra) || !Util.isNullOrNil(stringExtra2)) {
                    Log.m105925i("MicroMsg.PhoneNumPreference", "Contact name: %s mMobileByMD5: %s mobileFullMD5:%s", z1Var.getUsername(), stringExtra, stringExtra2);
                    C76166a b = C75398e.vx0().mo106402b(stringExtra);
                    aVar = (b == null || Util.isNullOrNil(b.mo106385e())) ? C75398e.vx0().mo106402b(stringExtra2) : b;
                    Object[] objArr = new Object[2];
                    objArr[0] = z1Var.getUsername();
                    if (aVar != null) {
                        str2 = "false";
                    }
                    objArr[1] = str2;
                    Log.m105925i("MicroMsg.PhoneNumPreference", "Contact name: %s AddrUpload IS NULL? %s", objArr);
                    if (aVar != null && !Util.isNullOrNil(aVar.mo106385e())) {
                        this.f24039K = Util.nullAsNil(aVar.mo106386f()).replace(" ", "");
                        Log.m105925i("MicroMsg.PhoneNumPreference", "Contact name: %s mMobileByMD5: %s", z1Var.getUsername(), this.f24039K);
                    }
                    mo7608J();
                }
            } else if (!Util.isNullOrNil(z1Var.getUsername())) {
                aVar = C75398e.vx0().mo106401a(z1Var.getUsername());
                Object[] objArr2 = new Object[2];
                objArr2[0] = z1Var.getUsername();
                if (aVar != null) {
                    str2 = "false";
                }
                objArr2[1] = str2;
                Log.m105925i("MicroMsg.PhoneNumPreference", "Contact name: %s AddrUpload IS NULL? %s", objArr2);
                this.f24039K = Util.nullAsNil(aVar.mo106386f()).replace(" ", "");
                Log.m105925i("MicroMsg.PhoneNumPreference", "Contact name: %s mMobileByMD5: %s", z1Var.getUsername(), this.f24039K);
                mo7608J();
            }
            aVar = null;
            this.f24039K = Util.nullAsNil(aVar.mo106386f()).replace(" ", "");
            Log.m105925i("MicroMsg.PhoneNumPreference", "Contact name: %s mMobileByMD5: %s", z1Var.getUsername(), this.f24039K);
            mo7608J();
        }
        String str3 = this.f24039K;
        if (z1Var.f149525Y0 != null) {
            HashSet hashSet = new HashSet();
            if (str3 != null) {
                hashSet.add(str3);
            }
            StringBuilder sb = new StringBuilder();
            String[] c = C1233a.m1356c(z1Var);
            if (c != null) {
                for (String trim : c) {
                    String trim2 = trim.trim();
                    if (!hashSet.contains(trim2) && !Util.isNullOrNil(trim2)) {
                        sb.append(trim2);
                        sb.append(C1233a.m1355b(z1Var));
                    }
                    hashSet.add(trim2);
                }
            }
            if (sb.length() > 1) {
                sb.subSequence(0, sb.length() - 1);
            }
            Log.m105925i("MicroMsg.PhoneNumPreference", "[filterPhoneList] phoneNumberByMD5:%s phoneList:%s", str3, z1Var.f149525Y0);
            str = sb.toString();
        }
        this.f24040L = str;
        this.f24041M.mo72529n("contact_profile_phone", true);
    }

    /* renamed from: J */
    public void mo7608J() {
        C72996z1 z1Var = this.f24043P;
        if (z1Var == null || !z1Var.mo62927s3() || C75592q0.m90764L(this.f24043P.getUsername()) || C72996z1.m85843n5(this.f24043P.getUsername()) || (Util.isNullOrNil(this.f24039K) && Util.isNullOrNil(this.f24040L))) {
            this.f24041M.mo72529n("contact_profile_phone", true);
        } else {
            this.f24041M.mo72529n("contact_profile_phone", false);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/PhoneNumPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C42599h.xx0(this.f24044Q, 17, 1, this.f24043P.getUsername());
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/preference/PhoneNumPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        this.f24038J.mo7594b();
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f24042N == null) {
            View x = super.mo1087x(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
            viewGroup2.removeAllViews();
            ProfileMobilePhoneView profileMobilePhoneView = new ProfileMobilePhoneView(x.getContext(), (View.OnClickListener) this);
            this.f24038J = profileMobilePhoneView;
            viewGroup2.addView(profileMobilePhoneView, new AbsListView.LayoutParams(-1, -2));
            ProfileMobilePhoneView profileMobilePhoneView2 = this.f24038J;
            profileMobilePhoneView2.f24012d = this.f24043P;
            String str = this.f24039K;
            String str2 = this.f24040L;
            Log.m105925i("MicroMsg.ProfileMobilePhoneView", "phoneNumberByMD5:%s phoneNumberList:%s", str, str2);
            profileMobilePhoneView2.f24014e = str;
            profileMobilePhoneView2.f24015f = str2;
            profileMobilePhoneView2.mo7594b();
            this.f24042N = x;
        }
        return this.f24042N;
    }

    public PhoneNumPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhoneNumPreference(Context context) {
        super(context);
    }
}
