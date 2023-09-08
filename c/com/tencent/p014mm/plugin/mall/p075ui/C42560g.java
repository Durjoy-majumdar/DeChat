package com.tencent.p014mm.plugin.mall.p075ui;

import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.mall.p075ui.MallFunctionSettingsUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import s52.C48227a;
import te3.C51676vb3;

/* renamed from: com.tencent.mm.plugin.mall.ui.g */
public class C42560g implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ C51676vb3 f115162a;

    /* renamed from: b */
    public final /* synthetic */ MallFunctionSettingsUI.C42545c f115163b;

    public C42560g(MallFunctionSettingsUI.C42545c cVar, C51676vb3 vb32) {
        this.f115163b = cVar;
        this.f115162a = vb32;
    }

    public void onStatusChange(boolean z) {
        Log.m105925i("MicroMsg.MallFunctionSettingsUI", "click switch: %s, id: %s", Boolean.valueOf(z), this.f115162a.f143417d);
        if (z) {
            this.f115162a.f143418e = 0;
        } else {
            this.f115162a.f143418e = 1;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f115162a);
        MallFunctionSettingsUI mallFunctionSettingsUI = MallFunctionSettingsUI.this;
        mallFunctionSettingsUI.getClass();
        Log.m105924i("MicroMsg.MallFunctionSettingsUI", "do batch function operate");
        C48227a aVar = new C48227a(linkedList, mallFunctionSettingsUI.f115106i, 0);
        aVar.mo9225i().mo123062e(new C42559f(mallFunctionSettingsUI, aVar));
    }
}
