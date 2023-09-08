package com.tencent.p014mm.p136ui.contact;

import android.util.Base64;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import he0.C76158j;
import p196ln.C76706g;
import p248ug.C52558c;
import rb0.C47984k;
import te3.C50954qg;

/* renamed from: com.tencent.mm.ui.contact.y3 */
public class C44885y3 {
    /* renamed from: a */
    public static String m49774a(String str, C50954qg qgVar) {
        String str2 = str;
        C50954qg qgVar2 = qgVar;
        Class cls = C76158j.class;
        C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(str2);
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str2);
        C52558c cVar = null;
        if (z1Var == null) {
            return null;
        }
        String str3 = "";
        if (C72996z1.m85843n5(str)) {
            String x2 = z1Var.mo73980x2();
            String S10 = ((C76158j) C86312j.m106911c(cls)).S10(z1Var.mo73980x2(), "openim_desc_icon", C76158j.C8510a.TYPE_URL, 0);
            String wo = ((C76158j) C86312j.m106911c(cls)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
            Object[] objArr = new Object[8];
            objArr[0] = Util.escapeStringForXml(Lo != null ? Lo.mo93594c() : str3);
            if (Lo != null) {
                str3 = Lo.mo93597f();
            }
            objArr[1] = Util.escapeStringForXml(str3);
            objArr[2] = Util.escapeStringForXml(z1Var.getUsername());
            objArr[3] = Util.escapeStringForXml(z1Var.mo62909j3());
            objArr[4] = Integer.valueOf(z1Var.f149500H);
            objArr[5] = x2;
            objArr[6] = Util.escapeStringForXml(wo);
            objArr[7] = Util.escapeStringForXml(S10);
            return String.format(" <msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" sex=\"%d\"  openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", objArr);
        }
        int i = z1Var.f149499G;
        if (Lo != null) {
            i = Lo.f195729b;
        }
        if (z1Var.mo62916m3()) {
            cVar = C47984k.m53328b(z1Var.getUsername());
        }
        Object[] objArr2 = new Object[16];
        objArr2[0] = Util.escapeStringForXml(z1Var.getUsername());
        objArr2[1] = Util.escapeStringForXml(z1Var.mo62909j3());
        objArr2[2] = Util.escapeStringForXml(z1Var.mo62913l2());
        objArr2[3] = Util.escapeStringForXml(z1Var.mo62909j3());
        objArr2[4] = Util.escapeStringForXml(z1Var.mo62942y2());
        objArr2[5] = Integer.valueOf(i);
        objArr2[6] = Util.escapeStringForXml(z1Var.f149518V);
        objArr2[7] = Util.escapeStringForXml(z1Var.f149520W);
        objArr2[8] = Util.escapeStringForXml(z1Var.f149516U);
        objArr2[9] = Integer.valueOf(z1Var.f149514T);
        objArr2[10] = Integer.valueOf(z1Var.f149500H);
        objArr2[11] = Integer.valueOf(z1Var.mo73953E2());
        objArr2[12] = Util.escapeStringForXml(z1Var.f149554x0);
        objArr2[13] = cVar == null ? str3 : Util.escapeStringForXml(cVar.field_brandIconURL);
        objArr2[14] = Util.escapeStringForXml(z1Var.f149556y0);
        if (qgVar2 != null) {
            try {
                Object[] objArr3 = new Object[2];
                String str4 = qgVar2.f140288d;
                objArr3[0] = Integer.valueOf(str4 != null ? str4.length() : 0);
                String str5 = qgVar2.f140289e;
                objArr3[1] = Integer.valueOf(str5 != null ? str5.length() : 0);
                Log.m105925i("MicroMsg.SendContactCardHelper", "getBizNameCardString %d, %d", objArr3);
                str3 = Base64.encodeToString(qgVar.toByteArray(), 2);
            } catch (Exception e) {
                Log.m105929w("MicroMsg.SendContactCardHelper", "getBizNameCardString ex %s", e.getMessage());
            }
        }
        objArr2[15] = str3;
        return String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\" biznamecardinfo=\"%s\"/>", objArr2);
    }
}
