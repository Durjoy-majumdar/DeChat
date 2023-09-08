package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import nj3.C11184p0;
import nj3.C76879j;
import te3.C78017yd3;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.l1 */
public class C71806l1 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C78017yd3 f208339d;

    /* renamed from: e */
    public final /* synthetic */ WalletLqtPlanDetailUI f208340e;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.l1$a */
    public class C71807a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f208341d;

        public C71807a(int i) {
            this.f208341d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletLqtPlanDetailUI.m84224H7(C71806l1.this.f208340e, this.f208341d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.l1$b */
    public class C71808b implements DialogInterface.OnClickListener {
        public C71808b(C71806l1 l1Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C71806l1(WalletLqtPlanDetailUI walletLqtPlanDetailUI, C78017yd3 yd32) {
        this.f208340e = walletLqtPlanDetailUI;
        this.f208339d = yd32;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        this.f208340e.f208080z = this.f208339d.f228580p;
        Log.m105925i("MicroMsg.WalletLqtPlanDetailUI", "operType：%s", Integer.valueOf(itemId));
        if (itemId == 1) {
            WalletLqtPlanDetailUI.m84224H7(this.f208340e, itemId);
        } else if (itemId == 2) {
            C76879j.m92718L(this.f208340e.getContext(), true, this.f208340e.getString(C0966R.string.kyg), "", this.f208340e.getString(C0966R.string.kyf), this.f208340e.getString(C0966R.string.f7926wf), new C71807a(itemId), new C71808b(this), C0966R.color.a1d, C0966R.color.a7f);
        } else if (itemId == 3) {
            WalletLqtPlanDetailUI.m84224H7(this.f208340e, itemId);
        } else if (itemId == 4) {
            WalletLqtPlanDetailUI walletLqtPlanDetailUI = this.f208340e;
            C78017yd3 yd32 = this.f208339d;
            walletLqtPlanDetailUI.getClass();
            Log.m105924i("MicroMsg.WalletLqtPlanDetailUI", "go to add plan ui -> modify");
            Intent intent = new Intent(walletLqtPlanDetailUI, WalletLqtPlanAddUI.class);
            intent.putExtra("key_mode", 2);
            try {
                intent.putExtra("key_plan_item", yd32.toByteArray());
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.WalletLqtPlanDetailUI", e, "", new Object[0]);
            }
            Log.m105919d("MicroMsg.WalletLqtPlanDetailUI", "gotoModifyPlanUI：%s", 65281);
            walletLqtPlanDetailUI.startActivityForResult(intent, 65281);
        }
    }
}
