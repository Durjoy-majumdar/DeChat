package rn3;

import android.content.Intent;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import wd3.C65953v0;

/* renamed from: rn3.e0 */
public class C77548e0 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ Intent f226091a;

    /* renamed from: b */
    public final /* synthetic */ SelectConversationUI f226092b;

    public C77548e0(SelectConversationUI selectConversationUI, Intent intent) {
        this.f226092b = selectConversationUI;
        this.f226091a = intent;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        this.f226092b.hideVKB();
        if (z) {
            Log.m105925i("MicroMsg.SelectConversationUI", "MicroMsg.SelectConversationUI", "onDialogClick: multiselect forward click ok ");
            SelectConversationUI selectConversationUI = this.f226092b;
            int i2 = SelectConversationUI.f220137K1;
            selectConversationUI.mo104121J8();
            this.f226091a.putExtra("custom_send_text", str);
            this.f226092b.mo104127P8(-1, this.f226091a);
            this.f226092b.finish();
            SelectConversationUI selectConversationUI2 = this.f226092b;
            int i3 = selectConversationUI2.f220182b1;
            if ((10 == i3 || 13 == i3) && selectConversationUI2.f220176X0) {
                C68144a.m80546b(selectConversationUI2.f220188h1, 9);
                return;
            }
            return;
        }
        SelectConversationUI selectConversationUI3 = this.f226092b;
        int i4 = selectConversationUI3.f220182b1;
        if ((10 == i4 || 13 == i4) && selectConversationUI3.f220176X0) {
            C68144a.m80546b(selectConversationUI3.f220188h1, 10);
        }
    }
}
