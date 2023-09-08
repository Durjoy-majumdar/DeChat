package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jc0.C21210b;
import my3.C61594j;
import p243tn.C14050a;
import sx3.C64173a;
import wd3.C118762j;
import z04.C112550d0;
import z04.C39297e;
import z04.C53732l;
import z04.C66715f;
import z04.C66716g;
import z04.C66717h;

/* renamed from: com.tencent.mm.pluginsdk.model.n */
public final class C19457n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C19449k.C19451b f54984d;

    /* renamed from: e */
    public final /* synthetic */ C21210b f54985e;

    public C19457n(C19449k.C19451b bVar, C21210b bVar2) {
        this.f54984d = bVar;
        this.f54985e = bVar2;
    }

    public final void run() {
        C66717h hVar;
        C66715f fVar;
        String str;
        C19449k kVar = C19449k.f54939a;
        C19449k.C19451b bVar = this.f54984d;
        C21210b bVar2 = this.f54985e;
        C61594j jVar = null;
        if (bVar2 != null && bVar2.f59986b == 2) {
            bVar.f54962m = bVar2.f59987c != null;
        } else {
            bVar.f54962m = (bVar2 != null ? bVar2.f59988d : null) != null;
            bVar.f54963n = true;
        }
        bVar.f54960k = bVar2 != null ? (long) bVar2.f59990f : -1;
        C118762j jVar2 = C118762j.f355306a;
        Context context = MMApplicationContext.getContext();
        bVar.f54958i = !NetStatusUtil.isConnected(context) ? "unknow" : NetStatusUtil.is4G(context) ? "4G" : NetStatusUtil.is5G(context) ? "5G" : NetStatusUtil.isWifi(context) ? "WiFi" : NetStatusUtil.is3G(context) ? "3G" : NetStatusUtil.is2G(context) ? "2G" : "other";
        String str2 = bVar.f54957h;
        Pattern compile = Pattern.compile("https?://([0-9a-zA-Z.]+)/");
        C87412m.m108593f(compile, "compile(pattern)");
        C87412m.m108594g(str2, "input");
        Matcher matcher = compile.matcher(str2);
        C87412m.m108593f(matcher, "nativePattern.matcher(input)");
        C66716g a = C53732l.m60231a(matcher, 0, str2);
        if (!(a == null || (fVar = hVar.f191753c) == null)) {
            if (((C64173a) fVar).mo52189f() > 1) {
                C39297e eVar = ((C66717h.C66719b) (hVar = (C66717h) a).f191753c).get(1);
                String str3 = eVar != null ? eVar.f105665a : null;
                C39297e eVar2 = ((C66717h.C66719b) hVar.f191753c).get(1);
                if (eVar2 != null) {
                    jVar = eVar2.f105666b;
                }
                String str4 = C19449k.f54944f.get(str3);
                if (str4 == null) {
                    str4 = "0";
                }
                if (jVar != null) {
                    str = C112550d0.m153781Q(str2, jVar.mo59687f0().intValue(), jVar.mo59688g0().intValue() + 1, str4).toString();
                    Log.m105927v("MicroMsg.BizImageBlankReporter", "alvinluo simplifyAppMsg old: %s, new: %s", str2, str);
                    str2 = str;
                }
            }
            str = str2;
            Log.m105927v("MicroMsg.BizImageBlankReporter", "alvinluo simplifyAppMsg old: %s, new: %s", str2, str);
            str2 = str;
        }
        C87412m.m108594g(str2, "<set-?>");
        bVar.f54957h = str2;
        if (bVar.f54960k <= 0) {
            bVar.f54960k = C86013q1.m106451l(C14050a.m13405b(bVar.f54956g));
        }
        C21210b bVar3 = this.f54985e;
        C19449k.C19452c cVar = C19449k.f54942d;
        cVar.f54971a++;
        if (bVar3 != null && bVar3.f59986b == 0) {
            cVar.f54974d++;
        } else {
            if (bVar3 != null && bVar3.f59986b == 1) {
                cVar.f54973c++;
            } else {
                if (bVar3 != null && bVar3.f59986b == 2) {
                    cVar.f54972b++;
                }
            }
        }
        C19449k.C19451b bVar4 = this.f54984d;
        if (bVar4.f54970u) {
            if (((bVar4.f54951b + bVar4.f54952c) + bVar4.f54953d) + 0 >= 50) {
                Log.m105925i("MicroMsg.BizImageBlankReporter", "alvinluo reportBlank doReport reportInfo %s", bVar4);
                C118762j jVar3 = C118762j.f355306a;
                Uri parse = Uri.parse(bVar4.f54956g);
                C87412m.m108593f(parse, "parse(reportInfo.url)");
                bVar4.f54956g = jVar3.mo183492e(parse, "tp");
                C115669n.INSTANCE.mo160131h(17611, Long.valueOf(bVar4.f54950a), Long.valueOf(bVar4.f54951b), Long.valueOf(bVar4.f54952c), Long.valueOf(bVar4.f54953d), Integer.valueOf(bVar4.f54959j), bVar4.f54958i, bVar4.f54956g, Long.valueOf(bVar4.f54960k), Integer.valueOf(bVar4.f54961l), Integer.valueOf(bVar4.f54962m ? 1 : 0), 0L, Long.valueOf(bVar4.f54954e), bVar4.f54957h);
            }
        }
    }
}
