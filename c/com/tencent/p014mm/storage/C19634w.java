package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import java.util.Map;
import jw0.C9533e;
import kj2.C117407d;
import org.json.JSONObject;
import rb0.C48009v0;
import te3.re4;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.w */
public final class C19634w implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f55622d;

    /* renamed from: com.tencent.mm.storage.w$a */
    public static final class C19635a implements Runnable {

        /* renamed from: d */
        public static final C19635a f55623d = new C19635a();

        public final void run() {
            C19627t.f55586a.mo25821C();
            C19627t.f55578F = false;
        }
    }

    public C19634w(int i) {
        this.f55622d = i;
    }

    public final void run() {
        re4 d;
        JSONObject d2;
        C9533e.f29713a.mo10210c().encode("biz_canvas_card_expose_preload_crash_times", this.f55622d + 1);
        Log.m105924i("MicroMsg.BizCardLogic", "exposePreload set crash flag");
        C19627t.f55578F = true;
        boolean z = false;
        for (C19623o0 o0Var : C48009v0.Jx0().mo25799bO(637534257, 1)) {
            if (Math.abs(o0Var.field_createTime - System.currentTimeMillis()) < 86400000) {
                C19627t.f55586a.mo25850x(o0Var);
                C117407d.INSTANCE.mo182089r(1454, 12, 1);
                z = true;
            }
        }
        for (C19623o0 o0Var2 : C48009v0.Jx0().mo25799bO(620757041, 1)) {
            if (Math.abs(o0Var2.field_createTime - System.currentTimeMillis()) < 86400000 && C19627t.f55586a.mo25850x(o0Var2)) {
                C117407d.INSTANCE.mo182089r(1454, 13, 1);
                z = true;
            }
        }
        C19627t tVar = C19627t.f55586a;
        String decodeString = tVar.mo25832f().decodeString(tVar.mo25825G("biz_ad_card_data"));
        if (!(decodeString == null || C112551y.m153811k(decodeString)) && (d2 = tVar.mo25830d(decodeString)) != null) {
            tVar.mo25849w(d2);
        }
        String g = C19636w0.m21165g();
        if (!Util.isNullOrNil(g)) {
            C87412m.m108593f(g, "msgContent");
            int E = C112550d0.m153769E(g, "<sysmsg", 0, false, 6, (Object) null);
            if (E != -1) {
                String substring = g.substring(E);
                C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                Map<String, String> parseXml = XmlParser.parseXml(substring, "sysmsg", (String) null);
                if (parseXml == null) {
                    Log.m105921e("MicroMsg.BizCardLogic", "XmlParser values is null, msgContent %s", g);
                } else if (C19613h1.m21036i(parseXml) && (d = C19613h1.m21031d(parseXml)) != null) {
                    tVar.mo25851y(d, (C19623o0) null);
                }
            }
        }
        if (!z || !C19627t.f55579G) {
            C19627t.f55578F = false;
            tVar.mo25821C();
            return;
        }
        ((C119157j) C119157j.f356862d).mo183878i(C19635a.f55623d, 3000);
    }
}
