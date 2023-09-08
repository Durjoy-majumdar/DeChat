package com.tencent.p014mm.plugin.product.p087ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.product.ui.MallBaseUI */
public abstract class MallBaseUI extends MMActivity {

    /* renamed from: d */
    public String f202266d;

    /* renamed from: com.tencent.mm.plugin.product.ui.MallBaseUI$a */
    public class C70074a implements MenuItem.OnMenuItemClickListener {
        public C70074a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MallBaseUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallBaseUI$b */
    public class C70075b implements DialogInterface.OnClickListener {
        public C70075b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MallBaseUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallBaseUI$c */
    public class C70076c implements DialogInterface.OnCancelListener {
        public C70076c(MallBaseUI mallBaseUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new C70074a());
    }

    public Dialog onCreateDialog(int i) {
        if (i == -10002) {
            return C75197d0.m90164e(getContext(), false, new C70076c(this));
        }
        if (i != -10001) {
            return super.onCreateDialog(i);
        }
        if (Util.isNullOrNil(this.f202266d)) {
            this.f202266d = getString(C0966R.string.gnv);
        }
        return C76879j.m92713G(this, this.f202266d, (String) null, false, new C70075b());
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            callBackMenu();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setContentViewVisibility(int i) {
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/product/ui/MallBaseUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(contentView, "com/tencent/mm/plugin/product/ui/MallBaseUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i == 0) {
            showTitleView();
        } else {
            hideTitleView();
        }
    }
}
