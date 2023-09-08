package com.tencent.p014mm.plugin.traceroute.p115ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI */
public class NetworkDiagnoseReportUI extends MMActivity {

    /* renamed from: i */
    public static String f21623i;

    /* renamed from: d */
    public Button f21624d;

    /* renamed from: e */
    public Button f21625e;

    /* renamed from: f */
    public ImageView f21626f;

    /* renamed from: g */
    public TextView f21627g;

    /* renamed from: h */
    public TextView f21628h;

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI$a */
    public class C5660a implements MenuItem.OnMenuItemClickListener {
        public C5660a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NetworkDiagnoseReportUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI$b */
    public class C5661b implements MenuItem.OnMenuItemClickListener {
        public C5661b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NetworkDiagnoseReportUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI$c */
    public class C5662c implements View.OnClickListener {
        public C5662c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(268435456);
            intent.putExtra("android.intent.extra.EMAIL", new String[]{"WeChat_Log@qq.com"});
            NetworkDiagnoseReportUI networkDiagnoseReportUI = NetworkDiagnoseReportUI.this;
            String str = NetworkDiagnoseReportUI.f21623i;
            String string = networkDiagnoseReportUI.getString(C0966R.string.i3s);
            Uri n = C116299g2.m163858n(NetworkDiagnoseReportUI.f21623i);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                String path2 = n.getPath();
                int lastIndexOf = path2.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    path2 = path2.substring(lastIndexOf + 1);
                }
                if (!Util.isNullOrNil(path2)) {
                    int indexOf = path2.indexOf(".");
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append("_");
                    if (indexOf <= 0) {
                        indexOf = path2.length();
                    }
                    sb.append(path2.substring(0, indexOf));
                    string = sb.toString();
                }
            }
            intent.putExtra("android.intent.extra.SUBJECT", string);
            intent.putExtra("android.intent.extra.STREAM", FileProviderHelper.getUriForFile(NetworkDiagnoseReportUI.this.getContext(), new C86009m1(NetworkDiagnoseReportUI.f21623i)));
            intent.setType("text/plain");
            NetworkDiagnoseReportUI networkDiagnoseReportUI2 = NetworkDiagnoseReportUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            NetworkDiagnoseReportUI networkDiagnoseReportUI3 = networkDiagnoseReportUI2;
            C117292a.m165358d(networkDiagnoseReportUI3, aVar.mo10232b(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            networkDiagnoseReportUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(networkDiagnoseReportUI3, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI$d */
    public class C5663d implements View.OnClickListener {
        public C5663d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(NetworkDiagnoseReportUI.f21623i)) {
                C86009m1 m1Var = new C86009m1(NetworkDiagnoseReportUI.f21623i);
                if (m1Var.mo119967g()) {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    FileProviderHelper.setIntentDataAndType((Context) NetworkDiagnoseReportUI.this.getContext(), intent, m1Var, "text/plain", false);
                    intent.addFlags(268435456);
                    NetworkDiagnoseReportUI networkDiagnoseReportUI = NetworkDiagnoseReportUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    NetworkDiagnoseReportUI networkDiagnoseReportUI2 = networkDiagnoseReportUI;
                    C117292a.m165358d(networkDiagnoseReportUI2, aVar.mo10232b(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    networkDiagnoseReportUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(networkDiagnoseReportUI2, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bko;
    }

    public void initView() {
        setMMTitle("");
        this.f21626f = (ImageView) findViewById(C0966R.C0970id.ipo);
        this.f21627g = (TextView) findViewById(C0966R.C0970id.ipr);
        this.f21628h = (TextView) findViewById(C0966R.C0970id.ipq);
        if (getIntent().getBooleanExtra("diagnose_result", false)) {
            this.f21626f.setImageResource(C0966R.C0969drawable.bij);
            this.f21627g.setText(getString(C0966R.string.k7u));
            this.f21628h.setVisibility(0);
            addTextOptionMenu(0, getString(C0966R.string.f360337bz1), new C5660a());
            return;
        }
        setBackBtn(new C5661b());
        f21623i = getIntent().getStringExtra("diagnose_log_file_path");
        this.f21626f.setImageResource(C0966R.C0969drawable.bii);
        this.f21627g.setText(getString(C0966R.string.k7t));
        String str = f21623i;
        if (str != null && C86013q1.m106451l(str) > 0) {
            ((TextView) findViewById(C0966R.C0970id.ipp)).setText(getString(C0966R.string.i3t, new Object[]{f21623i.replace("mnt/", "")}));
            View findViewById = findViewById(C0966R.C0970id.ipp);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.jbj);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Button button = (Button) findViewById(C0966R.C0970id.jbp);
            this.f21624d = button;
            button.setVisibility(0);
            this.f21624d.setOnClickListener(new C5662c());
            Button button2 = (Button) findViewById(C0966R.C0970id.l8f);
            this.f21625e = button2;
            button2.setVisibility(0);
            this.f21625e.setOnClickListener(new C5663d());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }
}
