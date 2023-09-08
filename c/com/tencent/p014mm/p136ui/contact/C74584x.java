package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import dg0.C75398e;
import hg0.C76166a;
import hg0.C76167a1;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.contact.x */
public final class C74584x {
    /* renamed from: a */
    public static void m89298a(Context context, C72996z1 z1Var, C72963f4.C72964b bVar) {
        m89299b(context, z1Var, bVar, false, false, (Bundle) null, bVar.f212697w);
    }

    /* renamed from: b */
    public static void m89299b(Context context, C72996z1 z1Var, C72963f4.C72964b bVar, boolean z, boolean z2, Bundle bundle, String str) {
        if (z1Var != null && bVar != null && z1Var.getUsername() != null && z1Var.getUsername().length() > 0) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", z1Var.getUsername());
            intent.putExtra("Contact_Alias", z1Var.mo62913l2());
            intent.putExtra("Contact_Nick", z1Var.mo62909j3());
            intent.putExtra("Contact_QuanPin", z1Var.mo62945z2());
            intent.putExtra("Contact_PyInitial", z1Var.mo62942y2());
            intent.putExtra("Contact_Sex", bVar.f212689o);
            intent.putExtra("Contact_Province", bVar.mo101027d());
            intent.putExtra("Contact_City", bVar.mo101024a());
            intent.putExtra("Contact_Signature", bVar.f212690p);
            intent.putExtra("Contact_Uin", bVar.f212684j);
            intent.putExtra("Contact_Mobile_MD5", bVar.f212682h);
            intent.putExtra("Contact_full_Mobile_MD5", bVar.f212683i);
            intent.putExtra("Contact_QQNick", bVar.mo101028e());
            intent.putExtra("User_From_Fmessage", true);
            intent.putExtra("Contact_Scene", bVar.f212681g);
            intent.putExtra("Contact_from_msgType", 40);
            if (z) {
                intent.putExtra("Contact_ShowUserName", false);
            }
            if (z2) {
                intent.putExtra("Contact_KSnsIFlag", 0);
            }
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("verify_gmail", str);
            }
            C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: c */
    public static void m89300c(Context context, C72963f4.C72964b bVar) {
        m89301d(context, bVar, false, false, (Bundle) null);
    }

    /* renamed from: d */
    public static void m89301d(Context context, C72963f4.C72964b bVar, boolean z, boolean z2, Bundle bundle) {
        if (context != null && bVar != null) {
            C72996z1 z1Var = new C72996z1();
            z1Var.setUsername(bVar.f212675a);
            z1Var.mo62878U2(bVar.mo101025b());
            z1Var.mo62882W2(bVar.f212679e);
            z1Var.mo62884X2(bVar.f212678d);
            m89299b(context, z1Var, bVar, z, z2, bundle, bVar.f212697w);
        }
    }

    /* renamed from: e */
    public static void m89302e(Intent intent, String str) {
        if (intent == null || str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.ContactInfoUtil", "setLocalQQMobile fail, intent = " + intent + ", username = " + str);
            return;
        }
        C76167a1 b = C75398e.Ax0().mo106405b(str);
        if (b != null) {
            intent.putExtra("Contact_Uin", b.f223139a);
            intent.putExtra("Contact_QQNick", b.mo106399c());
        }
        C76166a a = C75398e.vx0().mo106401a(str);
        if (a != null) {
            intent.putExtra("Contact_Mobile_MD5", a.mo106385e());
        }
    }
}
