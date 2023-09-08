package hf2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fx0.C45821d;
import gy3.C87412m;
import java.util.LinkedList;
import rb0.C47966e0;
import te3.C49001ch;
import te3.C49699hg;
import te3.C49841ig;
import te3.C50249le;
import te3.C50387me;

/* renamed from: hf2.m */
public final class C46051m {

    /* renamed from: a */
    public static final C46051m f124174a = new C46051m();

    /* renamed from: a */
    public static final void m51352a(String str) {
        C87412m.m108594g(str, "userName");
        try {
            C86009m1 m1Var = new C86009m1(f124174a.mo71472d(str));
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final C49001ch m51353b(String str) {
        C87412m.m108594g(str, "userName");
        C49001ch chVar = new C49001ch();
        try {
            byte[] O = C86013q1.m106433O(f124174a.mo71472d(str), 0, -1);
            if (O != null) {
                chVar.parseFrom(O);
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ProfileV2", "readFromFile ex=" + e.getMessage());
        }
        return chVar;
    }

    /* renamed from: c */
    public static final void m51354c(C49001ch chVar) {
        LinkedList<C49699hg> linkedList;
        C50387me meVar;
        LinkedList<C50249le> linkedList2;
        C87412m.m108594g(chVar, "resp");
        try {
            C46051m mVar = f124174a;
            String str = chVar.f131707d.f140834d;
            C87412m.m108593f(str, "resp.AccountInfo.UserName");
            C86009m1 m1Var = new C86009m1(mVar.mo71472d(str));
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
            String i = m1Var.mo119971i();
            C49841ig igVar = chVar.f131709f;
            if (!(igVar == null || (linkedList = igVar.f135306d) == null)) {
                for (C49699hg hgVar : linkedList) {
                    if (!(hgVar == null || (meVar = hgVar.f134607i) == null || (linkedList2 = meVar.f137969e) == null)) {
                        for (C50249le leVar : linkedList2) {
                            if (leVar.f137323G != null) {
                                leVar.f137323G = null;
                            }
                        }
                    }
                }
            }
            C86013q1.m106437S(i, chVar.toByteArray());
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public final String mo71472d(String str) {
        StringBuilder sb = new StringBuilder();
        String Km = ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72737Km();
        if (!C86013q1.m106450k(Km)) {
            C86013q1.m106461v(Km);
        }
        sb.append(Km);
        sb.append("profile_resp_");
        sb.append(MD5Util.getMD5String(str));
        return sb.toString();
    }

    /* renamed from: e */
    public final void mo71473e(C49841ig igVar) {
        LinkedList<C49699hg> linkedList;
        C50387me meVar;
        LinkedList<C50249le> linkedList2;
        LinkedList<C49699hg> linkedList3;
        C50387me meVar2;
        LinkedList<C50249le> linkedList4;
        if (!(igVar == null || (linkedList3 = igVar.f135306d) == null)) {
            for (C49699hg hgVar : linkedList3) {
                if (!(hgVar == null || (meVar2 = hgVar.f134607i) == null || (linkedList4 = meVar2.f137969e) == null)) {
                    for (C50249le leVar : linkedList4) {
                        if (leVar != null && leVar.f137325I == 1) {
                            if (!Util.isNullOrNil(leVar != null ? leVar.f137340h : null)) {
                                C45821d dVar = C45821d.f123719a;
                                String str = leVar.f137340h;
                                C87412m.m108593f(str, "detail.ContentUrl");
                                dVar.mo71287e(str, leVar.f137326J == 1);
                            }
                        }
                    }
                }
            }
        }
        if (igVar != null && (linkedList = igVar.f135310h) != null) {
            for (C49699hg hgVar2 : linkedList) {
                if (!(hgVar2 == null || (meVar = hgVar2.f134607i) == null || (linkedList2 = meVar.f137969e) == null)) {
                    for (C50249le leVar2 : linkedList2) {
                        if (leVar2 != null && leVar2.f137325I == 1) {
                            if (!Util.isNullOrNil(leVar2 != null ? leVar2.f137340h : null)) {
                                C45821d dVar2 = C45821d.f123719a;
                                String str2 = leVar2.f137340h;
                                C87412m.m108593f(str2, "detail.ContentUrl");
                                dVar2.mo71287e(str2, leVar2.f137326J == 1);
                            }
                        }
                    }
                }
            }
        }
    }
}
