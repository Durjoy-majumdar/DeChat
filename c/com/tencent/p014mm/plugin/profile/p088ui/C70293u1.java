package com.tencent.p014mm.plugin.profile.p088ui;

import ae3.C67030b;
import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72991u4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75604z3;
import fd0.C75743h;

/* renamed from: com.tencent.mm.plugin.profile.ui.u1 */
public class C70293u1 {
    /* renamed from: a */
    public static C67030b[] m82853a(Context context, C72996z1 z1Var, int i) {
        C67030b[] bVarArr;
        String nullAsNil = Util.nullAsNil(((Activity) context).getIntent().getStringExtra("Verify_ticket"));
        if (z1Var.mo62927s3() || Util.isNullOrNil(nullAsNil)) {
            return null;
        }
        Log.m105918d("MicroMsg.FMessageUtil", "initAddContent, scene = " + i);
        if (i == 18) {
            Log.m105918d("MicroMsg.FMessageUtil", "initAddContent, scene is lbs");
            bVarArr = C67030b.m79193h(context, C75743h.xx0().mo100934Yt(z1Var.getUsername(), 3));
        } else if (C75604z3.m90853y(i)) {
            Log.m105918d("MicroMsg.FMessageUtil", "initAddContent, scene is shake");
            bVarArr = C67030b.m79192g(context, C75743h.yx0().mo101223Yt(z1Var.getUsername(), 3));
        } else {
            Log.m105918d("MicroMsg.FMessageUtil", "initAddContent, scene is other");
            bVarArr = C67030b.m79191f(context, C75743h.wx0().mo101193qq(z1Var.getUsername(), 3));
        }
        if (bVarArr == null || bVarArr.length == 0) {
            return null;
        }
        return bVarArr;
    }

    /* renamed from: b */
    public static String m82854b(Context context, C72996z1 z1Var, int i) {
        String nullAsNil = Util.nullAsNil(((Activity) context).getIntent().getStringExtra("Verify_ticket"));
        if (z1Var.mo62927s3() || Util.isNullOrNil(nullAsNil)) {
            return null;
        }
        Log.m105918d("MicroMsg.FMessageUtil", "initAddContent, scene = " + i);
        if (i == 18) {
            Log.m105918d("MicroMsg.FMessageUtil", "initAddContent, scene is lbs");
            C72956b4[] Yt = C75743h.xx0().mo100934Yt(z1Var.getUsername(), 3);
            if (Yt.length < 1) {
                return "";
            }
            return Yt[0].field_svrid + "";
        } else if (C75604z3.m90853y(i)) {
            Log.m105918d("MicroMsg.FMessageUtil", "initAddContent, scene is shake");
            C72991u4[] Yt2 = C75743h.yx0().mo101223Yt(z1Var.getUsername(), 3);
            if (Yt2.length < 1) {
                return "";
            }
            return Yt2[0].field_svrid + "";
        } else {
            Log.m105918d("MicroMsg.FMessageUtil", "initAddContent, scene is other");
            C72985m3[] qq = C75743h.wx0().mo101193qq(z1Var.getUsername(), 3);
            if (qq.length < 1) {
                return "";
            }
            return qq[0].field_svrId + "";
        }
    }
}
