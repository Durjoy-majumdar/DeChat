package sj3;

import com.tencent.p014mm.p136ui.bizchat.BizChatFavUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import rb0.C48009v0;
import sb0.C48335d;

/* renamed from: sj3.i */
public class C48405i implements C48335d.C48337b {

    /* renamed from: a */
    public final /* synthetic */ BizChatFavUI f129582a;

    public C48405i(BizChatFavUI bizChatFavUI) {
        this.f129582a = bizChatFavUI;
    }

    /* renamed from: a */
    public void mo69970a(C48335d.C48337b.C48339b bVar) {
        if (bVar != null && bVar.f129425c != null) {
            Log.m105924i("MicroMsg.BizChatFavUI", "bizChatExtension bizChat change");
            Log.m105919d("MicroMsg.BizChatFavUI", "needToUpdate:%s", Boolean.valueOf(C48009v0.Ax0().mo73042a0(bVar.f129424b).field_needToUpdate));
            BizChatFavUI bizChatFavUI = this.f129582a;
            if (bizChatFavUI.f121364j) {
                bizChatFavUI.f121360f.mo1333o();
            }
        }
    }
}
