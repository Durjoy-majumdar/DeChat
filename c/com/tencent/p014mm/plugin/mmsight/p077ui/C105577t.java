package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.sdk.platformtools.Log;
import p248ug.C111163p0;
import p248ug.C111167t;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.t */
public class C105577t implements C111163p0 {

    /* renamed from: a */
    public final /* synthetic */ C105562q f314025a;

    public C105577t(C105562q qVar) {
        this.f314025a = qVar;
    }

    /* renamed from: a */
    public void mo150361a(C111167t tVar) {
        Log.m105925i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedFeature] features:%s", tVar.name());
        if (tVar == C111167t.CROP_VIDEO) {
            C105562q.m141754a(this.f314025a, true);
        }
    }

    /* renamed from: b */
    public void mo150362b(boolean z) {
        if (z) {
            this.f314025a.f313991j.showVKB();
            return;
        }
        C105562q qVar = this.f314025a;
        qVar.f313991j.hideVKB(qVar.f313990i);
    }

    /* renamed from: c */
    public void mo150363c(C111167t tVar, int i, Object obj) {
        Log.m105925i("MicroMsg.MMSightVideoEditor", "photoEditor [onSelectedDetailFeature] features:%s index:%s", tVar.name(), Integer.valueOf(i));
    }
}
