package com.tencent.p014mm.plugin.traceroute.p115ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76912y0;
import p214om.C11502f;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI */
public class NetworkDiagnoseIntroUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI$a */
    public class C5657a implements View.OnClickListener {
        public C5657a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(NetworkDiagnoseIntroUI.this, (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C97625j3.m125815e().mo123467m() == 0) {
                NetworkDiagnoseIntroUI networkDiagnoseIntroUI = NetworkDiagnoseIntroUI.this;
                C76701a.makeText((Context) networkDiagnoseIntroUI, (CharSequence) networkDiagnoseIntroUI.getString(C0966R.string.f360087a11), 0).show();
                C117292a.m165361g(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                Intent intent = new Intent(NetworkDiagnoseIntroUI.this, NetworkDiagnoseUI.class);
                NetworkDiagnoseIntroUI networkDiagnoseIntroUI2 = NetworkDiagnoseIntroUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                NetworkDiagnoseIntroUI networkDiagnoseIntroUI3 = networkDiagnoseIntroUI2;
                C117292a.m165358d(networkDiagnoseIntroUI3, aVar.mo10232b(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                networkDiagnoseIntroUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(networkDiagnoseIntroUI3, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                NetworkDiagnoseIntroUI.this.finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI$b */
    public class C5658b implements View.OnClickListener {
        public C5658b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, NetworkDiagnoseIntroUI.this.getString(C0966R.string.hmt));
            intent.putExtra("rawUrl", NetworkDiagnoseIntroUI.this.getString(C0966R.string.f361485k83, new Object[]{LocaleUtil.getApplicationLanguage(), LocaleUtil.getCurrentCountryCode()}));
            intent.putExtra("showShare", false);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, NetworkDiagnoseIntroUI.this.getContext());
            C117292a.m165361g(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI$c */
    public class C5659c implements MenuItem.OnMenuItemClickListener {
        public C5659c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NetworkDiagnoseIntroUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkn;
    }

    public void initView() {
        ((Button) findViewById(C0966R.C0970id.k0e)).setOnClickListener(new C5657a());
        ((TextView) findViewById(C0966R.C0970id.har)).setOnClickListener(new C5658b());
        setMMTitle("");
        setBackBtn(new C5659c());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
