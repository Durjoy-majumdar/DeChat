package com.tencent.p014mm.plugin.finder.live.model;

import android.telephony.PhoneStateListener;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.live.model.a */
public final class C55932a extends PhoneStateListener {
    public void onCallStateChanged(int i, String str) {
        C87412m.m108594g(str, "incomingNumber");
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            bVar.onCallStateChanged(i, str);
        }
    }
}
