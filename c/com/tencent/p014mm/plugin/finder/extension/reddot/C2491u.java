package com.tencent.p014mm.plugin.finder.extension.reddot;

import c30.C104289g;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60152b4;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import te3.C64586nn1;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.u */
public final class C2491u {

    /* renamed from: a */
    public static final C2491u f13010a = new C2491u();

    /* renamed from: a */
    public final C104289g mo2470a(C64586nn1 nn12, String str) {
        C104289g gVar = new C104289g();
        gVar.mo145953n("show_type", nn12.f184502d);
        gVar.mo145953n("count", nn12.f184503e);
        gVar.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, nn12.f184504f);
        gVar.put("icon_url", nn12.f184505g);
        gVar.put("path", nn12.f184507i);
        gVar.mo145953n("clear_type", nn12.f184506h);
        gVar.put("parent", nn12.f184508j);
        if (!Util.isNullOrNil(str)) {
            gVar.put("tips_id", str);
        }
        return gVar;
    }

    /* renamed from: b */
    public final String mo2471b(HashSet<String> hashSet) {
        C87412m.m108594g(hashSet, "paths");
        C37521f.f99374d.getClass();
        boolean z = C37521f.f99177G3.mo60266n().intValue() == 1;
        C104289g gVar = new C104289g();
        C60152b4 Nt0 = ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0();
        if (z) {
            ArrayList<C64586nn1> arrayList = new ArrayList<>();
            C64586nn1 nn12 = new C64586nn1();
            nn12.f184507i = "h5_creator_auth";
            nn12.f184508j = "";
            nn12.f184506h = 1;
            nn12.f184503e = 0;
            nn12.f184504f = "";
            nn12.f184505g = "";
            nn12.f184502d = 1;
            arrayList.add(nn12);
            C64586nn1 nn13 = new C64586nn1();
            nn13.f184507i = "h5_creator_guide";
            nn13.f184508j = "";
            nn13.f184506h = 1;
            nn13.f184503e = 3;
            nn13.f184504f = "";
            nn13.f184505g = "";
            nn13.f184502d = 2;
            arrayList.add(nn13);
            C64586nn1 nn14 = new C64586nn1();
            nn14.f184507i = "h5_creator_original";
            nn14.f184508j = "";
            nn14.f184506h = 1;
            nn14.f184503e = 0;
            nn14.f184504f = "测试";
            nn14.f184505g = "";
            nn14.f184502d = 3;
            arrayList.add(nn14);
            for (C64586nn1 nn15 : arrayList) {
                String str = nn15.f184507i;
                if (str == null) {
                    str = "";
                }
                gVar.put(str, f13010a.mo2470a(nn15, ""));
            }
        } else {
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C87412m.m108593f(next, "path");
                C64586nn1 R5 = Nt0.mo77246R5(next);
                if (R5 != null) {
                    gVar.put(next, f13010a.mo2470a(R5, ""));
                }
            }
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "redDotInfoJson.toString()");
        return gVar2;
    }
}
