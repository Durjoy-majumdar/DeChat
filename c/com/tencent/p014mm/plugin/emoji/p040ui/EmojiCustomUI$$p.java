package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Context;
import android.os.Message;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$p */
public class EmojiCustomUI$$p extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ EmojiCustomUI f268454a;

    public EmojiCustomUI$$p(EmojiCustomUI emojiCustomUI) {
        this.f268454a = emojiCustomUI;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1001:
                EmojiCustomUI emojiCustomUI = this.f268454a;
                Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "dz[updateSyncView status:%s]", emojiCustomUI.f268425o.toString());
                if (emojiCustomUI.f268417d != EmojiCustomUI$$u.EDIT) {
                    int ordinal = emojiCustomUI.f268425o.ordinal();
                    if (ordinal == 0 || ordinal == 5) {
                        emojiCustomUI.f268429s = false;
                        MMHandler mMHandler = emojiCustomUI.f268415D;
                        if (mMHandler != null) {
                            mMHandler.sendEmptyMessageDelayed(1003, (long) 0);
                        }
                        emojiCustomUI.mo127702L7(EmojiCustomUI$$u.NORMAL);
                        return;
                    } else if (ordinal == 2) {
                        if (!NetStatusUtil.isWifi((Context) emojiCustomUI)) {
                            emojiCustomUI.f268429s = false;
                            View view = emojiCustomUI.f268426p;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            emojiCustomUI.mo127699I7(EmojiCustomUI$$t.PAUSE);
                        } else if (NetStatusUtil.isWifi((Context) emojiCustomUI) && !emojiCustomUI.f268429s) {
                            emojiCustomUI.f268429s = true;
                            MMHandler mMHandler2 = emojiCustomUI.f268415D;
                            if (mMHandler2 != null) {
                                mMHandler2.sendEmptyMessageDelayed(1003, (long) 0);
                            }
                            emojiCustomUI.mo127699I7(EmojiCustomUI$$t.EMPTY);
                        }
                        EmojiCustomUI$$u emojiCustomUI$$u = emojiCustomUI.f268417d;
                        EmojiCustomUI$$u emojiCustomUI$$u2 = EmojiCustomUI$$u.SYNCING;
                        if (emojiCustomUI$$u != emojiCustomUI$$u2) {
                            emojiCustomUI.mo127702L7(emojiCustomUI$$u2);
                            return;
                        }
                        return;
                    } else if (ordinal == 3) {
                        emojiCustomUI.f268429s = false;
                        MMHandler mMHandler3 = emojiCustomUI.f268415D;
                        if (mMHandler3 != null) {
                            mMHandler3.removeMessages(1003);
                        }
                        View view3 = emojiCustomUI.f268426p;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI", "handleLoaderStateChange", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        emojiCustomUI.mo127699I7(EmojiCustomUI$$t.START);
                        emojiCustomUI.mo127702L7(EmojiCustomUI$$u.WITH_OUT_ADD);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1002:
                this.f268454a.f268421h.mo137253c();
                NetStatusUtil.isWifi((Context) this.f268454a);
                return;
            case 1003:
                View view5 = this.f268454a.f268426p;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$6", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$6", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            default:
                Log.m105920e("MicroMsg.emoji.EmojiCustomUI", "unknow Msg");
                return;
        }
    }
}
