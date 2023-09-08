package com.tencent.p014mm.plugin.webwx.p129ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI */
public class WebWeiXinIntroductionUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI$a */
    public class C6625a implements View.OnClickListener {
        public C6625a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/webwx/ui/WebWeiXinIntroductionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 1);
            intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
            intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
            intent.putExtra("from_album", false);
            intent.putExtra("show_intro", false);
            intent.setFlags(65536);
            C88144b.m109791i(WebWeiXinIntroductionUI.this, "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/webwx/ui/WebWeiXinIntroductionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI$b */
    public class C6626b implements MenuItem.OnMenuItemClickListener {
        public C6626b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WebWeiXinIntroductionUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chp;
    }

    public void initView() {
        setMMTitle("");
        ((Button) findViewById(C0966R.C0970id.lne)).setOnClickListener(new C6625a());
        setBackBtn(new C6626b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
