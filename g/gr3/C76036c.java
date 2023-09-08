package gr3;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletEntryChangeAccountEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import oa1.C117731d;

/* renamed from: gr3.c */
public class C76036c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f222899d;

    /* renamed from: gr3.c$a */
    public class C76037a implements DialogInterface.OnClickListener {
        public C76037a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String f = C117731d.m166007c().mo182444f("clicfg_wcpay_host_change_to_cn_android", "", false, false);
            if (!Util.isNullOrNil(f) && Util.getInt(f, 0) != 0) {
                C75228t.m90219L(C76036c.this.f222899d, "https://tenpay.wechatpay.cn/cgi-bin/mmpayweb-bin/payunregshow?operation=1", false);
            } else {
                C75228t.m90219L(C76036c.this.f222899d, "https://wx.tenpay.com/cgi-bin/mmpayweb-bin/payunregshow?operation=1", false);
            }
            new WalletEntryChangeAccountEvent().publish();
        }
    }

    /* renamed from: gr3.c$b */
    public class C76038b implements DialogInterface.OnClickListener {
        public C76038b(C76036c cVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public C76036c(MMActivity mMActivity) {
        this.f222899d = mMActivity;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMActivity mMActivity = this.f222899d;
        C76879j.m92707A(mMActivity, mMActivity.getString(C0966R.string.kpl), this.f222899d.getString(C0966R.string.kpi), this.f222899d.getString(C0966R.string.kpk), this.f222899d.getString(C0966R.string.kpm), new C76037a(), new C76038b(this));
        C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/formview/CommonHintViewConfig$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
