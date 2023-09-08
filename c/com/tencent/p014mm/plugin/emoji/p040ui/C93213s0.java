package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.emoji.model.C93118q;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import j61.C46445t;
import j61.C98905c;
import k20.C60958c;
import k20.C9556a;
import p441aq.C92054g;
import p663qo.C101213l;
import u61.C101963g;
import x51.C102561f;

/* renamed from: com.tencent.mm.plugin.emoji.ui.s0 */
public class C93213s0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreDetailUI f268775d;

    public C93213s0(EmojiStoreDetailUI emojiStoreDetailUI) {
        this.f268775d = emojiStoreDetailUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (C101963g.m134217b(this.f268775d.f268597e)) {
            Log.m105918d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks stop tuzi downloading");
            C98905c.m128727a().mo138242d();
        } else {
            C86709a0.m107529k().f251779b.mo123458d(this.f268775d.f268621r);
        }
        if (!TextUtils.isEmpty(this.f268775d.f268598e1)) {
            if (!((C101213l) C86312j.m106911c(C101213l.class)).Gm0(this.f268775d.f268598e1)) {
                Log.m105929w("MicroMsg.emoji.EmojiStoreDetailUI", "[onClickClose] cancel RecvTask failed. CdnClientId:%s", this.f268775d.f268598e1);
            } else {
                Log.m105925i("MicroMsg.emoji.EmojiStoreDetailUI", "[onClickClose] cancel RecvTask. CdnClientId:%s", this.f268775d.f268598e1);
            }
        }
        if (C102561f.m135423c(this.f268775d.f268627u.f298242n, 1) || C102561f.m135424d(this.f268775d.f268627u.f298241j)) {
            this.f268775d.f268616p = 3;
        } else {
            this.f268775d.f268616p = -1;
        }
        C93118q zx02 = ((C92054g) C86312j.m106911c(C92054g.class)).zx0();
        EmojiStoreDetailUI emojiStoreDetailUI = this.f268775d;
        zx02.mo127627a(emojiStoreDetailUI.f268597e, emojiStoreDetailUI.f268616p, 0, emojiStoreDetailUI.f268598e1);
        View view = this.f268775d.f268570N;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$15", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/EmojiStoreDetailUI$15", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f268775d.f268569M.setProgress(0);
        this.f268775d.f268568L.setVisibility(4);
        this.f268775d.f268565I.setVisibility(0);
        EmojiStoreDetailUI emojiStoreDetailUI2 = this.f268775d;
        int i2 = emojiStoreDetailUI2.f268605i;
        emojiStoreDetailUI2.mo127747S7();
        C86709a0.m107529k().f251779b.mo123460f(new C46445t(this.f268775d.f268597e, 2));
    }
}
