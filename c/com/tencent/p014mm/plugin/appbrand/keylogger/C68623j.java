package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.content.Context;
import java.util.Map;
import uo0.C78250j;
import uo0.C90709a;
import vo0.C78458a;
import vo0.C78460c;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.j */
public class C68623j implements C78250j.C78252b {

    /* renamed from: a */
    public final /* synthetic */ Map f197105a;

    /* renamed from: b */
    public final /* synthetic */ C78458a f197106b;

    /* renamed from: c */
    public final /* synthetic */ Context f197107c;

    /* renamed from: d */
    public final /* synthetic */ KeyStepAnalyserDetailActivity f197108d;

    public C68623j(KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity, Map map, C78458a aVar, Context context) {
        this.f197108d = keyStepAnalyserDetailActivity;
        this.f197105a = map;
        this.f197106b = aVar;
        this.f197107c = context;
    }

    /* renamed from: a */
    public void mo94303a(C78250j jVar) {
        int type = jVar.f229219a.getType();
        int e = jVar.f229219a.mo108260e();
        C78458a aVar = this.f197105a.containsKey(Integer.valueOf(e)) ? (C78458a) this.f197105a.get(Integer.valueOf(e)) : this.f197106b;
        C90709a b = jVar.mo108265b();
        if (type == 1) {
            C78460c cVar = new C78460c(this.f197107c);
            cVar.setStep(this.f197108d.f243042u.get(jVar.mo108265b().name()));
            aVar.addView(cVar);
            return;
        }
        C78458a aVar2 = new C78458a(this.f197107c, type == 3);
        if (this.f197105a.size() > 0) {
            aVar2.setHasBorder(true);
        }
        if (b != null) {
            aVar2.setStep(this.f197108d.f243042u.get(b.name()));
        }
        aVar.addView(aVar2);
        this.f197105a.put(Integer.valueOf(jVar.f229219a.mo108261f()), aVar2);
    }
}
