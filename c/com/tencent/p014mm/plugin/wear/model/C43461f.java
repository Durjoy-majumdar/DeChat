package com.tencent.p014mm.plugin.wear.model;

import com.tencent.p014mm.autogen.events.OpenChattingUIEvent;
import com.tencent.p014mm.plugin.wear.model.C43462g;
import com.tencent.p014mm.plugin.wear.model.WearLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import o73.C47341i;
import te3.t05;

/* renamed from: com.tencent.mm.plugin.wear.model.f */
public class C43461f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ OpenChattingUIEvent f117475d;

    public C43461f(WearLogic.C434443 r1, OpenChattingUIEvent openChattingUIEvent) {
        this.f117475d = openChattingUIEvent;
    }

    public void run() {
        boolean z;
        t05 t05;
        C43464h yx02 = C43457b.yx0();
        String str = this.f117475d.f107684d.f107685a;
        synchronized (yx02) {
            z = true;
            Log.m105925i("MicroMsg.Wear.WearNotificationMap", "reset notification talker=%s", str);
            if (yx02.f117487a.containsKey(str)) {
                yx02.f117487a.get(str).f117480e = C43462g.C43463a.INIT;
                yx02.f117487a.get(str).f117479d = 0;
            }
        }
        C43462g a = C43457b.yx0().mo67628a(this.f117475d.f107684d.f107685a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(a.f117477b));
        C43457b.Ax0().mo67630a(new C47341i((ArrayList<Integer>) arrayList));
        if (this.f117475d.f107684d.f107685a.equals("gh_43f2581f6fd6") && (t05 = C43457b.xx0().f347577c.f126742a) != null) {
            WearBizLogic wx02 = C43457b.wx0();
            if (!wx02.f117426d || !wx02.mo67618c(t05.f141886d)) {
                z = false;
            }
            if (z) {
                C43457b.wx0().mo67619d(t05);
            } else {
                C43457b.wx0().mo67616a();
            }
        }
    }
}
