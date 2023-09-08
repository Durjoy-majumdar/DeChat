package com.tencent.p014mm.plugin.appbrand.config;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage;
import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import ii0.C87732a;
import java.util.List;
import junit.framework.Assert;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49684hc;
import te3.C64391gc;
import te3.p55;
import zp0.C91823b;

/* renamed from: com.tencent.mm.plugin.appbrand.config.f */
public class C81652f extends C91823b<C49684hc> {

    /* renamed from: com.tencent.mm.plugin.appbrand.config.f$a */
    public enum C81653a {
        DEFAULT(100),
        RECENTS_LIST(101),
        STAR_LIST(103),
        MP_PRELOAD(104),
        WXA_CUSTOMER_SERVICE(106),
        WXA_RECOMMEND_CARD_LIST(109),
        WALLET_MALL_INDEX(110),
        CHATTING(111),
        QRCODE(112),
        QRCODE_PRE(113),
        WX_OPEN_SDK_PRE_FETCH(114),
        SNS_TIMELINE_AD(115);
        

        /* renamed from: d */
        public final int f239687d;

        /* access modifiers changed from: public */
        C81653a(int i) {
            this.f239687d = i;
        }

        /* renamed from: a */
        public int mo113996a() {
            return this.f239687d;
        }
    }

    public C81652f(String str) {
        super((String) null, (String) null);
        C64391gc gcVar = new C64391gc();
        gcVar.f183300e = 113;
        p55 p55 = new p55();
        p55.f184756g = str;
        gcVar.f183299d.add(p55);
        mo113995r(gcVar);
    }

    /* renamed from: r */
    public final void mo113995r(C64391gc gcVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = gcVar;
        bVar.f127067b = new C49684hc();
        bVar.f127069d = 1192;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaattr/batchwxaattrsync";
        mo123453j(bVar.mo72403a());
    }

    public C81652f(List<String> list, C81653a aVar) {
        C89349b bVar;
        if (BuildInfo.DEBUG && Util.isNullOrNil((List) list)) {
            Assert.fail("usernameList should not be null or nil!");
        }
        Log.m105925i("MicroMsg.AppBrand.CgiBatchWxaAttrSync", "create sync request, list_size %d, scene %s(%d)", Integer.valueOf(list.size()), aVar.name(), Integer.valueOf(aVar.mo113996a()));
        C64391gc gcVar = new C64391gc();
        gcVar.f183300e = aVar.mo113996a();
        for (String next : list) {
            if (!Util.isNullOrNil(next)) {
                p55 p55 = new p55();
                p55.f184753d = next;
                WxaAttributes LL = C81161g2.Cx0().mo114000LL(next, C81662k.C81670g.f239716a);
                if (LL == null) {
                    bVar = new C89349b(new byte[0], 0, 0);
                } else if (C81681p.m100219a(LL)) {
                    bVar = new C89349b(new byte[0], 0, 0);
                } else if (C81681p.m100220b(LL)) {
                    C87732a.INSTANCE.mo122144a(((WxaSyncCmdPersistentStorage) C81161g2.Bx0(WxaSyncCmdPersistentStorage.class)).mo56569b(LL.field_username), WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE);
                    bVar = new C89349b(new byte[0], 0, 0);
                } else {
                    bVar = C81660i.m100161mI(LL);
                }
                p55.f184754e = bVar;
                gcVar.f183299d.add(p55);
                if (Log.getLogLevel() <= 1) {
                    Object[] objArr = new Object[2];
                    objArr[0] = p55.f184753d;
                    C89349b bVar2 = p55.f184754e;
                    objArr[1] = Boolean.valueOf(bVar2 != null && bVar2.mo123702e() > 0);
                    Log.m105925i("MicroMsg.AppBrand.CgiBatchWxaAttrSync", "create sync request, username[%s], has cache?[%b]", objArr);
                }
            }
        }
        mo113995r(gcVar);
    }
}
