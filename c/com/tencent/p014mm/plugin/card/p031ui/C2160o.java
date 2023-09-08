package com.tencent.p014mm.plugin.card.p031ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.card.ui.o */
public class C2160o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f12137d;

    /* renamed from: e */
    public final /* synthetic */ CardGiftVideoUI f12138e;

    public C2160o(CardGiftVideoUI cardGiftVideoUI, boolean z) {
        this.f12138e = cardGiftVideoUI;
        this.f12137d = z;
    }

    public void run() {
        Log.m105925i("MicroMsg.CardGiftVideoUI", "%d switch video model isVideoPlay %b", Integer.valueOf(this.f12138e.hashCode()), Boolean.valueOf(this.f12137d));
        if (this.f12137d) {
            View view = (View) this.f12138e.f267752i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f12138e.f267754n.setVisibility(8);
            return;
        }
        View view3 = (View) this.f12138e.f267752i;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f12138e.f267754n.setVisibility(0);
    }
}
