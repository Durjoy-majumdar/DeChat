package com.tencent.p014mm.plugin.finder.feed.model;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.g */
public final class C55762g implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C55763h f158762d;

    public C55762g(C55763h hVar) {
        this.f158762d = hVar;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        int i = message.what;
        if (i == 1000) {
            C55763h.m63488s(this.f158762d, message);
            return true;
        } else if (i == 1003) {
            C55763h.m63488s(this.f158762d, message);
            return true;
        } else if (i != 1001) {
            return true;
        } else {
            Object obj = message.obj;
            ArrayList arrayList = null;
            C13604l lVar = obj instanceof C13604l ? (C13604l) obj : null;
            C55763h.m63489t(this.f158762d, lVar != null ? (ArrayList) lVar.f38555d : null, 15);
            C55763h hVar = this.f158762d;
            if (lVar != null) {
                arrayList = (ArrayList) lVar.f38556e;
            }
            C55763h.m63489t(hVar, arrayList, 16);
            return true;
        }
    }
}
