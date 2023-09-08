package com.tencent.p014mm.plugin.nfc_open.p802ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import kotlin.Metadata;
import pc2.C89342c;
import pc2.C89343d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/nfc_open/ui/InnerNfcDispatchLogicUI;", "Lcom/tencent/mm/plugin/nfc_open/ui/TransparentUI;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.nfc_open.ui.InnerNfcDispatchLogicUI */
public final class InnerNfcDispatchLogicUI extends TransparentUI {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105924i("MicroMsg.Nfc.InnerNfcDispatchLogicUI", "onCreate, intent is null");
            finish();
            return;
        }
        Queue<C89342c> queue = C89343d.f257320a;
        Iterator it = ((PriorityQueue) C89343d.f257320a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C89342c cVar = (C89342c) it.next();
            Log.m105924i("MicroMsg.Nfc.NfcDispatchLogic", "doDispatch, dispatch to processor: " + cVar.getName());
            if (cVar.mo11763a(this, intent)) {
                Log.m105924i("MicroMsg.Nfc.NfcDispatchLogic", "doDispatch, processor: " + cVar.getName() + " processed");
                break;
            }
        }
        finish();
    }
}
