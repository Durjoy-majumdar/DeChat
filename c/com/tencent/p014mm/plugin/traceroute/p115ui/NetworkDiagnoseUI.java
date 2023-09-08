package com.tencent.p014mm.plugin.traceroute.p115ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import b13.C79646a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMProgressBar;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import eb0.C75576f4;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI */
public class NetworkDiagnoseUI extends MMActivity {

    /* renamed from: n */
    public static final /* synthetic */ int f249148n = 0;

    /* renamed from: d */
    public int f249149d = 0;

    /* renamed from: e */
    public int f249150e = 0;

    /* renamed from: f */
    public C79646a f249151f;

    /* renamed from: g */
    public MMProgressBar f249152g;

    /* renamed from: h */
    public TextView f249153h;

    /* renamed from: i */
    public MTimerHandler f249154i = new MTimerHandler(new C85493a(), true);

    /* renamed from: j */
    public MMHandler f249155j = new C85494b();

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI$a */
    public class C85493a implements MTimerHandler.CallBack {
        public C85493a() {
        }

        public boolean onTimerExpired() {
            NetworkDiagnoseUI networkDiagnoseUI = NetworkDiagnoseUI.this;
            int i = networkDiagnoseUI.f249149d + 1;
            networkDiagnoseUI.f249150e = i;
            networkDiagnoseUI.f249149d = i;
            if (i < 100) {
                networkDiagnoseUI.f249152g.setProgress(i);
                return true;
            }
            networkDiagnoseUI.f249152g.setProgress(100);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI$b */
    public class C85494b extends MMHandler {
        public C85494b() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                NetworkDiagnoseUI networkDiagnoseUI = NetworkDiagnoseUI.this;
                networkDiagnoseUI.f249154i.stopTimer();
                C79646a aVar = networkDiagnoseUI.f249151f;
                if (aVar != null) {
                    aVar.mo109778e();
                }
                NetworkDiagnoseUI networkDiagnoseUI2 = NetworkDiagnoseUI.this;
                if (networkDiagnoseUI2.f249150e < 95) {
                    networkDiagnoseUI2.f249152g.setProgress(95);
                }
                C79646a aVar2 = NetworkDiagnoseUI.this.f249151f;
                synchronized (aVar2) {
                    C79646a.C79653g gVar = aVar2.f233541b;
                    if (gVar != null) {
                        gVar.mo109780b();
                    }
                }
            } else if (i == 2) {
                NetworkDiagnoseUI networkDiagnoseUI3 = NetworkDiagnoseUI.this;
                if (networkDiagnoseUI3.f249150e < 95) {
                    networkDiagnoseUI3.f249152g.setProgress(95);
                }
                C79646a aVar3 = NetworkDiagnoseUI.this.f249151f;
                synchronized (aVar3) {
                    C79646a.C79653g gVar2 = aVar3.f233541b;
                    if (gVar2 != null) {
                        gVar2.mo109780b();
                    }
                }
            } else if (i == 3) {
                NetworkDiagnoseUI.this.f249152g.setProgress(100);
                NetworkDiagnoseUI.m105506H7(NetworkDiagnoseUI.this, false);
            } else if (i == 4) {
                NetworkDiagnoseUI.this.f249152g.setProgress(100);
                NetworkDiagnoseUI.m105506H7(NetworkDiagnoseUI.this, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI$c */
    public class C85495c implements MMProgressBar.C85814b {
        public C85495c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI$d */
    public class C85496d implements MenuItem.OnMenuItemClickListener {
        public C85496d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NetworkDiagnoseUI networkDiagnoseUI = NetworkDiagnoseUI.this;
            int i = NetworkDiagnoseUI.f249148n;
            networkDiagnoseUI.getClass();
            C76879j.m92739j(networkDiagnoseUI, C0966R.string.bj5, C0966R.string.byv, C0966R.string.a4h, C0966R.string.f360090a14, new C85503e(networkDiagnoseUI), new C85504f(networkDiagnoseUI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI$e */
    public class C85497e implements Runnable {
        public C85497e() {
        }

        public void run() {
            NetworkDiagnoseUI networkDiagnoseUI = NetworkDiagnoseUI.this;
            int i = NetworkDiagnoseUI.f249148n;
            networkDiagnoseUI.getClass();
            C97625j3.m125815e().mo123460f(new C75576f4(new C85498d(networkDiagnoseUI), (String) null));
        }
    }

    /* renamed from: H7 */
    public static void m105506H7(NetworkDiagnoseUI networkDiagnoseUI, boolean z) {
        networkDiagnoseUI.getClass();
        Intent intent = new Intent(networkDiagnoseUI, NetworkDiagnoseReportUI.class);
        intent.putExtra("diagnose_result", z);
        if (!z) {
            networkDiagnoseUI.f249151f.getClass();
            intent.putExtra("diagnose_log_file_path", C79646a.f233538i);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(networkDiagnoseUI, aVar.mo10232b(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseUI", "redirectToReportUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        networkDiagnoseUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(networkDiagnoseUI, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseUI", "redirectToReportUI", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        networkDiagnoseUI.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkp;
    }

    public void initView() {
        this.f249153h = (TextView) findViewById(C0966R.C0970id.ips);
        MMProgressBar mMProgressBar = (MMProgressBar) findViewById(C0966R.C0970id.c5m);
        this.f249152g = mMProgressBar;
        mMProgressBar.setOnProgressChangedListener(new C85495c());
        setMMTitle("");
        setBackBtn(new C85496d());
        new MMHandler().postDelayed(new C85497e(), 200);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C76879j.m92739j(this, C0966R.string.bj5, C0966R.string.byv, C0966R.string.a4h, C0966R.string.f360090a14, new C85503e(this), new C85504f(this));
        return true;
    }

    public void onPause() {
        this.f249152g.setAutoProgress(false);
        super.onPause();
    }

    public void onResume() {
        if (!C97625j3.m125812b().mo105883I()) {
            C76912y0.m92771j(this, (View) null);
            return;
        }
        this.f249152g.setAutoProgress(true);
        super.onResume();
    }
}
