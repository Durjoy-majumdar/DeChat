package wc3;

import android.content.Context;
import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C8480h;
import ht1.C60200t1;
import jr2.C33652w;
import jr2.C9510k;
import p03.C11796g;
import p166hy.C33128g0;
import p565ir.C60606n;
import p763ym.C39072t;
import sw1.C101703s;
import sw1.C48478n;

/* renamed from: wc3.f */
public final class C38055f {

    /* renamed from: a */
    public static final C38056a f100600a = new C38056a((C8480h) null);

    /* renamed from: wc3.f$a */
    public static final class C38056a {
        public C38056a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo61505a(String str, String str2, String str3, String str4) {
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            Class cls = C39072t.class;
            if (str5 == null) {
                return false;
            }
            boolean bi02 = ((C39072t) C86312j.m106911c(cls)).bi0(str6, str4);
            Log.m105924i("MicroMsg.BusinessViewHandler", "handle businessType=" + str5 + ", isSameAccount = " + bi02);
            switch (str.hashCode()) {
                case -1919727738:
                    if (str5.equals("nativeEmergencyContact")) {
                        ((C39072t) C86312j.m106911c(cls)).r10(str, "testExtMsg", str2, -3, "testErrMsg");
                        return true;
                    }
                    break;
                case -1487902783:
                    if (str5.equals("nativeShareToGameLive")) {
                        ((C60606n) C86312j.m106911c(C60606n.class)).mo84988BG(str5, str6, str7, bi02);
                        return true;
                    }
                    break;
                case 227411459:
                    if (str5.equals("nativeShareToGameHaoWan")) {
                        ((C101703s) C86312j.m106911c(C101703s.class)).mo10941x1(str5, str6, str7);
                        return true;
                    }
                    break;
                case 554520581:
                    if (str5.equals("nativeShareToHaokan")) {
                        ((C11796g) C86312j.m106911c(C11796g.class)).mo11694zx(str5, str6, str7);
                        return true;
                    }
                    break;
                case 616687678:
                    if (str5.equals("nativeGameCenterBusiness")) {
                        ((C48478n) C86312j.m106911c(C48478n.class)).mo65697x1(str5, str6, str7);
                        return true;
                    }
                    break;
                case 1526568343:
                    if (str5.equals("nativeUpdateRoomToOpenImChatroom")) {
                        ((C39072t) C86312j.m106911c(cls)).mo61913Vp(str5, str6, str7, bi02);
                        return true;
                    }
                    break;
                case 1730483080:
                    if (str5.equals("nativeShareToVideoChannels")) {
                        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76744Dl(str5, str6, str7);
                        return true;
                    }
                    break;
                case 1783390588:
                    if (str5.equals("nativeOpenAdCanvas")) {
                        Class cls2 = C33128g0.class;
                        try {
                            C104289g gVar = new C104289g(str7);
                            long safeParseLong = Util.safeParseLong(gVar.optString("canvasId"));
                            String optString = gVar.optString("uxInfo");
                            boolean z = gVar.optInt("videoMuted") == 0;
                            String optString2 = gVar.optString("canvasDynamicInfo");
                            String UR = ((C33128g0) C86312j.m106911c(cls2)).mo58701UR(safeParseLong, str6, optString);
                            ((C33128g0) C86312j.m106911c(cls2)).oa0(UR, 3);
                            Log.m105924i("MicroMsg.BusinessViewHandler", "handleOpenAdCanvas, appid=" + str6 + ", bType=" + str5 + ", extInfo=" + str7);
                            if (!Util.isNullOrNil(optString)) {
                                if (safeParseLong != 0) {
                                    C33652w wVar = new C33652w();
                                    wVar.f91063b = 29;
                                    wVar.f91065d = optString2;
                                    wVar.f91064c = UR;
                                    wVar.f91066e = z;
                                    ((C9510k) C86312j.m106911c(C9510k.class)).Ad0((Context) null, safeParseLong, optString, wVar);
                                    ((C33128g0) C86312j.m106911c(cls2)).oa0(UR, 4);
                                }
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.BusinessViewHandler", "handleOpenAdCanvas ex", e.getMessage());
                        }
                        return true;
                    }
                    break;
            }
            return false;
        }
    }
}
