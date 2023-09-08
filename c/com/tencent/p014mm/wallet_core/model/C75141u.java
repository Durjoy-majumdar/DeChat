package com.tencent.p014mm.wallet_core.model;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.wallet_core.model.u */
public class C75141u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f221096d;

    /* renamed from: e */
    public final /* synthetic */ double f221097e;

    /* renamed from: f */
    public final /* synthetic */ int f221098f;

    /* renamed from: g */
    public final /* synthetic */ WalletTextView f221099g;

    /* renamed from: h */
    public final /* synthetic */ View f221100h;

    /* renamed from: i */
    public final /* synthetic */ View f221101i;

    /* renamed from: j */
    public final /* synthetic */ TextView f221102j;

    public C75141u(View view, double d, int i, WalletTextView walletTextView, View view2, View view3, TextView textView) {
        this.f221096d = view;
        this.f221097e = d;
        this.f221098f = i;
        this.f221099g = walletTextView;
        this.f221100h = view2;
        this.f221101i = view3;
        this.f221102j = textView;
    }

    public void run() {
        int width = this.f221096d.getWidth();
        long longValue = new Double(this.f221097e).longValue();
        int i = 0;
        int i2 = 0;
        while (longValue != 0) {
            longValue /= 10;
            i++;
            i2 = (int) (longValue % 10);
        }
        if (i >= this.f221098f) {
            int left = (int) ((((float) (this.f221100h.getLeft() + this.f221099g.getLeft())) + ((i2 == 1 ? this.f221099g.getPaint().measureText("1") : this.f221099g.getPaint().measureText("2")) / 2.0f)) - ((float) (width / 2)));
            if (left != 0) {
                View view = this.f221101i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f221102j.setText(C75157y0.m90139b(i));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f221096d.getLayoutParams();
                layoutParams.leftMargin = left;
                this.f221096d.setLayoutParams(layoutParams);
                return;
            }
            View view3 = this.f221101i;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view4 = this.f221101i;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/wallet_core/model/JumpItemUtil$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
