package sj3;

import com.tencent.p014mm.p136ui.bizchat.BizChatFavUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import sb0.C48327a;
import sb0.C48329b;

/* renamed from: sj3.h */
public class C48404h implements C48329b.C48332c {

    /* renamed from: d */
    public final /* synthetic */ BizChatFavUI f129581d;

    public C48404h(BizChatFavUI bizChatFavUI) {
        this.f129581d = bizChatFavUI;
    }

    /* renamed from: a */
    public void mo69969a(C48329b.C48332c.C48333a aVar) {
        C48327a aVar2;
        if (aVar != null && (aVar2 = aVar.f129411b) != null && this.f129581d.f121362h.equals(aVar2.field_brandUserName)) {
            Log.m105924i("MicroMsg.BizChatFavUI", "bizChatExtension bizChatConv change");
            BizChatFavUI bizChatFavUI = this.f129581d;
            if (bizChatFavUI.f121364j) {
                bizChatFavUI.f121360f.mo1333o();
            }
        }
    }
}
