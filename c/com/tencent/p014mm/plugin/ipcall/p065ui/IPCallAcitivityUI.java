package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C88989a;
import s12.C13610a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI */
public class IPCallAcitivityUI extends MMActivity {

    /* renamed from: d */
    public FrameLayout f19419d;

    /* renamed from: e */
    public TextView f19420e;

    /* renamed from: f */
    public TextView f19421f;

    /* renamed from: g */
    public Button f19422g;

    /* renamed from: h */
    public CdnImageView f19423h;

    /* renamed from: i */
    public boolean f19424i = false;

    /* renamed from: j */
    public C13610a f19425j;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI$a */
    public class C4617a implements View.OnClickListener {
        public C4617a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            IPCallAcitivityUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI$b */
    public class C4618b implements View.OnClickListener {
        public C4618b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (IPCallAcitivityUI.this.f19425j.f38572e == 1) {
                Log.m105924i("MicroMsg.IPCallAcitivityUI", "click activity, go to IPCallPackageUI");
                Intent intent = new Intent();
                intent.setClass(IPCallAcitivityUI.this.getContext(), IPCallShareCouponUI.class);
                IPCallAcitivityUI iPCallAcitivityUI = IPCallAcitivityUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                IPCallAcitivityUI iPCallAcitivityUI2 = iPCallAcitivityUI;
                C117292a.m165358d(iPCallAcitivityUI2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                iPCallAcitivityUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(iPCallAcitivityUI2, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                Intent intent2 = new Intent();
                intent2.setClass(IPCallAcitivityUI.this.getContext(), IPCallPackageUI.class);
                IPCallAcitivityUI iPCallAcitivityUI3 = IPCallAcitivityUI.this;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                IPCallAcitivityUI iPCallAcitivityUI4 = iPCallAcitivityUI3;
                C117292a.m165358d(iPCallAcitivityUI4, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                iPCallAcitivityUI3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(iPCallAcitivityUI4, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            IPCallAcitivityUI iPCallAcitivityUI5 = IPCallAcitivityUI.this;
            iPCallAcitivityUI5.f19424i = true;
            iPCallAcitivityUI5.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallAcitivityUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI$c */
    public class C4619c implements MenuItem.OnMenuItemClickListener {
        public C4619c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallAcitivityUI.this.finish();
            return true;
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2461dn);
        if (this.f19424i) {
            C115669n.INSTANCE.mo160131h(13779, 0, 1);
            return;
        }
        C115669n.INSTANCE.mo160131h(13779, 0, 0);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2d;
    }

    public void initView() {
        this.f19419d = (FrameLayout) findViewById(C0966R.C0970id.f_m);
        this.f19420e = (TextView) findViewById(C0966R.C0970id.f_s);
        this.f19421f = (TextView) findViewById(C0966R.C0970id.f_o);
        this.f19422g = (Button) findViewById(C0966R.C0970id.f_p);
        this.f19423h = (CdnImageView) findViewById(C0966R.C0970id.f_q);
        String str = (String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_ACTIVITY_STRING, "");
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.IPCallAcitivityUI", "xml is empty");
            finish();
        } else {
            C13610a a = C13610a.m12910a(str);
            this.f19425j = a;
            if (a == null) {
                Log.m105920e("MicroMsg.IPCallAcitivityUI", "mMsgInfo is null");
                finish();
            } else {
                this.f19420e.setText(a.f38568a);
                this.f19421f.setText(this.f19425j.f38569b);
                this.f19422g.setText(this.f19425j.f38571d);
                this.f19423h.setUrl(this.f19425j.f38570c);
            }
        }
        this.f19419d.setOnClickListener(new C4617a());
        this.f19422g.setOnClickListener(new C4618b());
        setBackBtn(new C4619c());
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(131072);
        getWindow().setFlags(1024, 1024);
        hideTitleView();
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
