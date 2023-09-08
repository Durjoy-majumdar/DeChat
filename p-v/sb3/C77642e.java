package sb3;

import android.os.Bundle;
import android.view.MenuItem;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditDetailUI;
import di3.C86312j;
import java.util.ArrayList;
import nj3.C76879j;
import p281yz.C79173v;
import qb3.C77326e;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: sb3.e */
public class C77642e implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletWXCreditDetailUI f226361d;

    /* renamed from: sb3.e$a */
    public class C77643a implements C76879j.C11180n {
        public C77643a() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (i == 0) {
                C67205s0 Ex0 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0();
                String str = C77642e.this.f226361d.f211403i.field_bindSerial;
                Ex0.getClass();
                C77642e.this.f226361d.getClass();
            } else if (i == 1) {
                WalletWXCreditDetailUI walletWXCreditDetailUI = C77642e.this.f226361d;
                Bundle bundle = walletWXCreditDetailUI.f211402h.f232423c;
                bundle.putBoolean("offline_pay", false);
                bundle.putBoolean("key_is_show_detail", false);
                C79143a.m95771j(walletWXCreditDetailUI, C77326e.class, bundle, (C79148e.C79149a) null);
            }
        }
    }

    public C77642e(WalletWXCreditDetailUI walletWXCreditDetailUI) {
        this.f226361d = walletWXCreditDetailUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        ArrayList arrayList = new ArrayList();
        C67205s0 Ex0 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0();
        String str = this.f226361d.f211403i.field_bindSerial;
        Ex0.getClass();
        C76879j.m92737h(this.f226361d, (String) null, (String[]) arrayList.toArray(new String[arrayList.size()]), this.f226361d.getString(C0966R.string.kuh), false, new C77643a());
        return true;
    }
}
