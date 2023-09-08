package com.tencent.p014mm.plugin.emoji.p040ui;

import android.os.Message;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p441aq.C92054g;
import u61.C101963g;
import u61.C101964h;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI$$i */
public class EmojiStoreDetailUI$$i extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ EmojiStoreDetailUI f268648a;

    public EmojiStoreDetailUI$$i(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268648a = emojiStoreDetailUI;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1001:
                EmojiStoreDetailUI emojiStoreDetailUI = this.f268648a;
                Class cls = C92054g.class;
                if (!C101963g.m134217b(emojiStoreDetailUI.f268597e)) {
                    if (C86709a0.m107535s().mo121147n()) {
                        ((C92054g) C86312j.m106911c(cls)).getClass();
                        if (C30790w2.m39221h().mo57715b().mo142032qq(emojiStoreDetailUI.f268597e)) {
                            ((C92054g) C86312j.m106911c(cls)).getClass();
                            if (C30790w2.m39221h().mo57717d().mo142048Yt(emojiStoreDetailUI.f268597e) > 0) {
                                C86009m1 m1Var = new C86009m1(C101964h.m134224f() + emojiStoreDetailUI.f268597e);
                                if (m1Var.mo119967g()) {
                                    C86009m1[] u = m1Var.mo119984u();
                                    if (u == null || u.length <= 0) {
                                        ((C92054g) C86312j.m106911c(cls)).getClass();
                                        C30790w2.m39221h().mo57715b().mo142021Ow(emojiStoreDetailUI.f268597e);
                                        ((C92054g) C86312j.m106911c(cls)).getClass();
                                        C30790w2.m39221h().mo57717d().mo142061mL(emojiStoreDetailUI.f268597e);
                                    } else {
                                        emojiStoreDetailUI.f268636y = true;
                                        emojiStoreDetailUI.f268616p = 7;
                                        emojiStoreDetailUI.mo127747S7();
                                        return;
                                    }
                                }
                            } else {
                                ((C92054g) C86312j.m106911c(cls)).getClass();
                                C30790w2.m39221h().mo57717d().mo142061mL(emojiStoreDetailUI.f268597e);
                            }
                        }
                    }
                    emojiStoreDetailUI.f268636y = false;
                    return;
                }
                return;
            case 1002:
                EmojiStoreDetailUI emojiStoreDetailUI2 = this.f268648a;
                int i = EmojiStoreDetailUI.f268553D1;
                emojiStoreDetailUI2.mo127744P7();
                return;
            case 1003:
                EmojiStoreDetailUI emojiStoreDetailUI3 = this.f268648a;
                int i2 = EmojiStoreDetailUI.f268553D1;
                emojiStoreDetailUI3.mo127747S7();
                return;
            case 1004:
                if (this.f268648a.f268565I.getVisibility() == 0) {
                    this.f268648a.f268565I.setVisibility(8);
                    View view = this.f268648a.f268570N;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$6", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$6", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f268648a.f268568L.setVisibility(0);
                }
                EmojiStoreDetailUI emojiStoreDetailUI4 = this.f268648a;
                emojiStoreDetailUI4.f268569M.setProgress(emojiStoreDetailUI4.f268614o);
                return;
            case 1005:
                this.f268648a.f268560D.scrollTo(0, 0);
                return;
            case 1007:
                this.f268648a.mo127748T7();
                return;
            default:
                Log.m105928w("MicroMsg.emoji.EmojiStoreDetailUI", "unknow message, cannt handle.");
                return;
        }
    }
}
