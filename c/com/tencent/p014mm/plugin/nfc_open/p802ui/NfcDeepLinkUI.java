package com.tencent.p014mm.plugin.nfc_open.p802ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Queue;
import kotlin.Metadata;
import pc2.C89342c;
import pc2.C89343d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/nfc_open/ui/NfcDeepLinkUI;", "Lcom/tencent/mm/plugin/nfc_open/ui/TransparentUI;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.nfc_open.ui.NfcDeepLinkUI */
public final class NfcDeepLinkUI extends TransparentUI {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105924i("MicroMsg.Nfc.NfcDeepLinkUI", "onCreate, intent is null");
            finish();
            return;
        }
        Queue<C89342c> queue = C89343d.f257320a;
        C89343d.f257321b.mo11763a(this, intent);
        finish();
    }
}
