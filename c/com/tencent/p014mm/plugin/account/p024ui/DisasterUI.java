package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.DisasterUI */
public class DisasterUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.account.ui.DisasterUI$a */
    public class C1414a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f10649d;

        public C1414a(String str) {
            this.f10649d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/DisasterUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.DisasterUI", "summerdiz jump link");
            C115669n.INSTANCE.mo160131h(13939, 1);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.f10649d));
            DisasterUI disasterUI = DisasterUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            DisasterUI disasterUI2 = disasterUI;
            C117292a.m165358d(disasterUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/DisasterUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            disasterUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(disasterUI2, "com/tencent/mm/plugin/account/ui/DisasterUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/DisasterUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.DisasterUI$b */
    public class C1415b implements MenuItem.OnMenuItemClickListener {
        public C1415b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C115669n.INSTANCE.mo160131h(13939, 3);
            Log.m105924i("MicroMsg.DisasterUI", "summerdiz back");
            DisasterUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7144zo;
    }

    public boolean needShowIdcError() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_disaster_content");
        String stringExtra2 = getIntent().getStringExtra("key_disaster_url");
        Log.m105925i("MicroMsg.DisasterUI", "summerdiz onCreate :%d, content[%s], url[%s]", Integer.valueOf(hashCode()), stringExtra, stringExtra2);
        ((TextView) findViewById(C0966R.C0970id.hka)).setText(stringExtra);
        findViewById(C0966R.C0970id.hk7).setOnClickListener(new C1414a(stringExtra2));
        setMMTitle(getString(C0966R.string.f360342c02));
        setBackBtn(new C1415b());
    }
}
