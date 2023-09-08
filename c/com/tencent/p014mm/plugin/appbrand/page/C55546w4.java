package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.p014mm.p136ui.component.UIComponentActivity;
import com.tencent.p014mm.plugin.appbrand.page.C83942u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import od3.C62001a;
import p640ox.C77049b;
import te3.C64291co3;

/* renamed from: com.tencent.mm.plugin.appbrand.page.w4 */
public final class C55546w4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83942u4.C55544b f158153d;

    /* renamed from: e */
    public final /* synthetic */ Context f158154e;

    public C55546w4(C83942u4.C55544b bVar, Context context) {
        this.f158153d = bVar;
        this.f158154e = context;
    }

    public final void run() {
        Log.m105924i(this.f158153d.f158149b, "onDismiss#reportOnActionSheetHideIfNeed");
        C83942u4.C55544b bVar = this.f158153d;
        Context context = this.f158154e;
        bVar.getClass();
        if (!(context instanceof UIComponentActivity)) {
            String str = bVar.f158149b;
            Log.m105928w(str, "getRecentForwardReportInfo, context: " + context);
        }
        C64291co3 co32 = (C64291co3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(context, 14, C64291co3.class);
        if (co32 == null) {
            Log.m105928w(bVar.f158149b, "tryReport, recentForwardReportInfo is null");
        } else {
            co32.f182544i = 9;
            int i = bVar.f158151d;
            if (2 == i || 3 == i) {
                co32.f182545j = String.valueOf(49);
                co32.f182546n = "33";
            }
            co32.f182549q = bVar.f158150c;
            co32.f182539d = bVar.f158151d;
            co32.f182547o = (int) (SystemClock.elapsedRealtime() - co32.f182550r);
            C62001a.f176265a.mo86878a(context);
        }
        C83942u4.C55544b bVar2 = this.f158153d;
        bVar2.f158150c = "";
        bVar2.f158151d = 1;
    }
}
