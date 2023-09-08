package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.k1 */
public class C72393k1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72379f1 f210613d;

    public C72393k1(C72379f1 f1Var) {
        this.f210613d = f1Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72379f1 f1Var = this.f210613d;
        int i = f1Var.f210553R;
        if (i == 0) {
            if (f1Var.f210554S == 0) {
                f1Var.f210549M.setText(f1Var.getContext().getString(C0966R.string.l5z));
                f1Var.f210553R = 1;
                f1Var.f210560Y = Util.currentTicks();
                View view2 = f1Var.f210550N;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f1Var.f210552Q.setVisibility(0);
                f1Var.f210551P.setVisibility(8);
                f1Var.f210576t.setVisibility(8);
                View view4 = f1Var.f210565g;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f1Var.f210567i.setText(C0966R.string.l5q);
                C72379f1.m84718r(false);
                f1Var.f210559X.f212603x = 1;
                C115669n.INSTANCE.mo160131h(11977, 1, 1, 0, 0, 0, 2);
                C75228t.m90243e0(9, 1);
            } else {
                f1Var.f210549M.setText(f1Var.getContext().getString(C0966R.string.l5z));
                f1Var.f210553R = 2;
                f1Var.f210560Y = Util.currentTicks();
                f1Var.f210540D.setVisibility(0);
                f1Var.f210576t.setVisibility(8);
                View view6 = f1Var.f210565g;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFaceId", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFaceId", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f1Var.f210567i.setText(C0966R.string.l5p);
                C72379f1.m84718r(false);
                f1Var.f210559X.f212603x = 1;
            }
        } else if (i == 1) {
            PayInfo payInfo = f1Var.f210559X;
            C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 19, "");
            this.f210613d.mo99739c();
        } else if (i == 2) {
            f1Var.mo99739c();
            C115669n.INSTANCE.mo160131h(15817, 4);
        }
        C72379f1 f1Var2 = this.f210613d;
        if (f1Var2.f210553R == 1) {
            f1Var2.mo99741f();
            C72379f1 f1Var3 = this.f210613d;
            Log.m105925i("MicroMsg.WalletPwdDialog", "hy: is screen on: %b", Boolean.valueOf(!f1Var3.f210583y0));
            if (!f1Var3.f210583y0) {
                this.f210613d.mo99742g();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
