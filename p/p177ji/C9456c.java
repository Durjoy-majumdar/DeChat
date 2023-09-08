package p177ji;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$f;
import f62.C7994b0;
import gy3.C87412m;

/* renamed from: ji.c */
public final class C9456c implements MMFragmentActivity$$f {

    /* renamed from: a */
    public final /* synthetic */ C7994b0.C7995a f29528a;

    public C9456c(C7994b0.C7995a aVar) {
        this.f29528a = aVar;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        C87412m.m108594g(intent, "bindData");
        if (i == 15002 && i2 == -1) {
            String stringExtra = intent.getStringExtra("key_chat_room_open_id");
            C7994b0.C7995a aVar = this.f29528a;
            if (aVar != null) {
                aVar.mo1112a(true, (String) null, stringExtra);
            }
        }
    }
}
