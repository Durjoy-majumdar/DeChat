package com.tencent.p014mm.plugin.traceroute.p115ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NetworkDiagnoseResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import p447aw.C103918d;
import p702ts.C78085c;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI */
public class NetworkDiagnoseAllInOneUI extends MMActivity implements View.OnClickListener {

    /* renamed from: y */
    public static final /* synthetic */ int f347457y = 0;

    /* renamed from: d */
    public int f347458d;

    /* renamed from: e */
    public Button f347459e;

    /* renamed from: f */
    public TextView f347460f;

    /* renamed from: g */
    public TextView f347461g;

    /* renamed from: h */
    public ImageView f347462h;

    /* renamed from: i */
    public TextView f347463i;

    /* renamed from: j */
    public TextView f347464j;

    /* renamed from: n */
    public C89779i0 f347465n;

    /* renamed from: o */
    public int f347466o;

    /* renamed from: p */
    public String f347467p;

    /* renamed from: q */
    public IListener<NetworkDiagnoseResultEvent> f347468q;

    /* renamed from: r */
    public boolean f347469r;

    /* renamed from: s */
    public boolean f347470s;

    /* renamed from: t */
    public boolean f347471t;

    /* renamed from: u */
    public C92411b f347472u;

    /* renamed from: v */
    public C92411b.C92412a f347473v;

    /* renamed from: w */
    public MTimerHandler f347474w;

    /* renamed from: x */
    public boolean f347475x;

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI$a */
    public class C115820a implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI$a$a */
        public class C115821a implements Runnable {
            public C115821a() {
            }

            public void run() {
                NetworkDiagnoseAllInOneUI.this.f347459e.setEnabled(true);
                C89779i0 i0Var = NetworkDiagnoseAllInOneUI.this.f347465n;
                if (i0Var != null && i0Var.isShowing()) {
                    NetworkDiagnoseAllInOneUI.this.f347465n.dismiss();
                }
                NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = NetworkDiagnoseAllInOneUI.this;
                networkDiagnoseAllInOneUI.f347458d = 6;
                networkDiagnoseAllInOneUI.mo176313H7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI$a$b */
        public class C115822b implements DialogInterface.OnClickListener {
            public C115822b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LocationUtil.jumpToOpenGps(NetworkDiagnoseAllInOneUI.this);
            }
        }

        public C115820a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            String str;
            Log.m105925i("MicroMsg.NetworkDiagnoseAllInOneUI", "get location, isOK:%b", Boolean.valueOf(z));
            NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = NetworkDiagnoseAllInOneUI.this;
            C92411b bVar = networkDiagnoseAllInOneUI.f347472u;
            if (bVar != null) {
                bVar.mo126408b(networkDiagnoseAllInOneUI.f347473v);
            }
            MMHandlerThread.postToMainThread(new C115821a());
            NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI2 = NetworkDiagnoseAllInOneUI.this;
            String str2 = networkDiagnoseAllInOneUI2.f347467p;
            if (z) {
                str = (String.valueOf(f2) + "-" + String.valueOf(f)) + "," + NetworkDiagnoseAllInOneUI.this.f347467p;
            } else {
                if (!networkDiagnoseAllInOneUI2.f347475x && !LocationUtil.isGpsEnable()) {
                    NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI3 = NetworkDiagnoseAllInOneUI.this;
                    networkDiagnoseAllInOneUI3.f347475x = true;
                    C76879j.m92709C(networkDiagnoseAllInOneUI3, networkDiagnoseAllInOneUI3.getString(C0966R.string.fez), NetworkDiagnoseAllInOneUI.this.getString(C0966R.string.a3h), NetworkDiagnoseAllInOneUI.this.getString(C0966R.string.fyd), NetworkDiagnoseAllInOneUI.this.getString(C0966R.string.f7926wf), false, new C115822b(), (DialogInterface.OnClickListener) null);
                }
                Log.m105920e("MicroMsg.NetworkDiagnoseAllInOneUI", "get geolocation fail");
                str = "," + NetworkDiagnoseAllInOneUI.this.f347467p;
            }
            C115669n.INSTANCE.kvStat(14533, str);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI$b */
    public class C115823b implements MTimerHandler.CallBack {
        public C115823b() {
        }

        public boolean onTimerExpired() {
            NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = NetworkDiagnoseAllInOneUI.this;
            int i = networkDiagnoseAllInOneUI.f347466o + 1;
            networkDiagnoseAllInOneUI.f347466o = i;
            Log.m105927v("MicroMsg.NetworkDiagnoseAllInOneUI", "timer fired, percent:%d", Integer.valueOf(i));
            NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI2 = NetworkDiagnoseAllInOneUI.this;
            int i2 = networkDiagnoseAllInOneUI2.f347466o;
            if (i2 > 99) {
                return false;
            }
            if (networkDiagnoseAllInOneUI2.f347458d == 1) {
                networkDiagnoseAllInOneUI2.f347463i.setText(networkDiagnoseAllInOneUI2.getString(C0966R.string.bz5, new Object[]{Integer.valueOf(i2)}));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI$c */
    public class C115824c implements DialogInterface.OnClickListener {
        public C115824c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(NetworkDiagnoseAllInOneUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI$d */
    public class C115825d implements DialogInterface.OnClickListener {
        public C115825d(NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: H7 */
    public final void mo176313H7() {
        Log.m105925i("MicroMsg.NetworkDiagnoseAllInOneUI", "refreshUI, state:%d", Integer.valueOf(this.f347458d));
        switch (this.f347458d) {
            case 0:
            case 1:
                this.f347462h.setImageResource(C0966R.raw.network_diagnose_work);
                this.f347463i.setText(getString(C0966R.string.bz5, new Object[]{Integer.valueOf(this.f347466o)}));
                this.f347464j.setText(C0966R.string.byx);
                this.f347459e.setVisibility(4);
                this.f347461g.setVisibility(4);
                return;
            case 2:
                this.f347462h.setImageResource(C0966R.raw.network_diagnose_work);
                this.f347463i.setText(C0966R.string.bz9);
                this.f347464j.setText(C0966R.string.f360336bz0);
                this.f347459e.setVisibility(0);
                this.f347461g.setVisibility(4);
                return;
            case 3:
                Intent intent = new Intent();
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, C0966R.string.f360087a11);
                intent.putExtra("rawUrl", getString(C0966R.string.h75));
                intent.putExtra("showShare", false);
                C88144b.m109791i(this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                mo176314I7(false);
                finish();
                return;
            case 4:
                this.f347462h.setImageResource(C0966R.raw.network_diagnose_fail);
                this.f347463i.setText(C0966R.string.bz8);
                this.f347464j.setText(C0966R.string.byy);
                this.f347459e.setVisibility(0);
                this.f347459e.setText(C0966R.string.byu);
                this.f347461g.setVisibility(0);
                return;
            case 5:
                this.f347462h.setImageResource(C0966R.raw.network_diagnose_fail);
                this.f347463i.setText(C0966R.string.bz6);
                this.f347464j.setText(C0966R.string.byy);
                this.f347459e.setVisibility(0);
                this.f347459e.setText(C0966R.string.byu);
                this.f347461g.setVisibility(0);
                return;
            case 6:
                this.f347462h.setImageResource(C0966R.raw.network_diagnose_feedback);
                this.f347463i.setText(C0966R.string.bz7);
                this.f347464j.setText(C0966R.string.byz);
                this.f347459e.setVisibility(0);
                this.f347459e.setText(C0966R.string.byt);
                this.f347461g.setVisibility(4);
                return;
            default:
                return;
        }
    }

    /* renamed from: I7 */
    public final void mo176314I7(boolean z) {
        if (!Util.isNullOrNil(this.f347467p)) {
            Log.m105925i("MicroMsg.NetworkDiagnoseAllInOneUI", "submit action, bSendLoaction:%b", Boolean.valueOf(z));
            if (!z) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(14533, "," + this.f347467p);
            } else if (((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.ACCESS_FINE_LOCATION", 71, "", "")) {
                this.f347465n = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.bza), true, true, (DialogInterface.OnCancelListener) null);
                this.f347459e.setEnabled(false);
                if (this.f347472u == null) {
                    this.f347472u = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
                }
                this.f347472u.mo126409c(this.f347473v, true, false);
                C5139t.m5183e(22, 10);
            }
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bkm;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseAllInOneUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = this.f347458d;
        if ((i == 5 || i == 4) && view == this.f347459e) {
            mo176314I7(true);
        } else {
            mo176314I7(false);
            finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseAllInOneUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        setMMTitle("");
        getSupportActionBar().mo91104o();
        Intent intent = getIntent();
        this.f347458d = intent.getIntExtra("diagnose_state", 0);
        this.f347466o = intent.getIntExtra("diagnose_percent", 1);
        this.f347467p = intent.getStringExtra("diagnose_kvInfo");
        Log.m105925i("MicroMsg.NetworkDiagnoseAllInOneUI", "get state: %d percent: %d, kv: %s", Integer.valueOf(this.f347458d), Integer.valueOf(this.f347466o), this.f347467p);
        if (this.f347458d == 0) {
            this.f347458d = 1;
            Log.m105924i("MicroMsg.NetworkDiagnoseAllInOneUI", "start diagnose");
            C97625j3.m125815e().mo123460f(new C75576f4(new C115828c(this), (String) null));
        }
        this.f347459e = (Button) findViewById(C0966R.C0970id.c5l);
        this.f347460f = (TextView) findViewById(C0966R.C0970id.c5j);
        this.f347461g = (TextView) findViewById(C0966R.C0970id.c5i);
        this.f347462h = (ImageView) findViewById(C0966R.C0970id.c5n);
        this.f347463i = (TextView) findViewById(C0966R.C0970id.c5o);
        this.f347464j = (TextView) findViewById(C0966R.C0970id.c5k);
        this.f347460f.setOnClickListener(this);
        this.f347459e.setOnClickListener(this);
        this.f347461g.setOnClickListener(this);
        mo176313H7();
        C1158191 r5 = new IListener<NetworkDiagnoseResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = 829538561;
            }

            public boolean callback(IEvent iEvent) {
                int i;
                NetworkDiagnoseResultEvent networkDiagnoseResultEvent = (NetworkDiagnoseResultEvent) iEvent;
                int i2 = 2;
                boolean z = true;
                Log.m105927v("MicroMsg.NetworkDiagnoseAllInOneUI", "diagnose callback, stage:%d, status:%d", Integer.valueOf(networkDiagnoseResultEvent.f343573d.f343575b), Integer.valueOf(networkDiagnoseResultEvent.f343573d.f343574a));
                NetworkDiagnoseResultEvent.C114680a aVar = networkDiagnoseResultEvent.f343573d;
                int i3 = aVar.f343575b;
                if (i3 == 0) {
                    NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = NetworkDiagnoseAllInOneUI.this;
                    networkDiagnoseAllInOneUI.f347466o = 33;
                    if (aVar.f343574a != 0) {
                        z = false;
                    }
                    networkDiagnoseAllInOneUI.f347469r = z;
                } else if (i3 == 1) {
                    NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI2 = NetworkDiagnoseAllInOneUI.this;
                    networkDiagnoseAllInOneUI2.f347466o = 66;
                    if (aVar.f343574a != 0) {
                        z = false;
                    }
                    networkDiagnoseAllInOneUI2.f347470s = z;
                } else if (i3 == 2) {
                    NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI3 = NetworkDiagnoseAllInOneUI.this;
                    if (aVar.f343574a != 0) {
                        z = false;
                    }
                    networkDiagnoseAllInOneUI3.f347471t = z;
                }
                NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI4 = NetworkDiagnoseAllInOneUI.this;
                int i4 = networkDiagnoseAllInOneUI4.f347458d;
                if (aVar.f343576c) {
                    networkDiagnoseAllInOneUI4.f347466o = 100;
                    i = 1000;
                    MMHandlerThread.postToMainThread(new C115826a(this));
                    NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI5 = NetworkDiagnoseAllInOneUI.this;
                    networkDiagnoseAllInOneUI5.f347467p = networkDiagnoseResultEvent.f343573d.f343577d;
                    if (!networkDiagnoseAllInOneUI5.f347469r) {
                        i2 = networkDiagnoseAllInOneUI5.f347470s ? 4 : networkDiagnoseAllInOneUI5.f347471t ? 5 : 3;
                    }
                } else {
                    i2 = i4;
                    i = 0;
                }
                MMHandlerThread.postToMainThreadDelayed(new C115827b(this, i2), (long) i);
                return false;
            }
        };
        this.f347468q = r5;
        r5.alive();
        this.f347473v = new C115820a();
        MTimerHandler mTimerHandler = new MTimerHandler(new C115823b(), true);
        this.f347474w = mTimerHandler;
        int i = this.f347458d;
        if (i == 0 || i == 1) {
            mTimerHandler.startTimer(1000);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f347468q.dead();
        C92411b bVar = this.f347472u;
        if (bVar != null) {
            bVar.mo126408b(this.f347473v);
            this.f347472u = null;
        }
        MTimerHandler mTimerHandler = this.f347474w;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f347474w = null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m105925i("MicroMsg.NetworkDiagnoseAllInOneUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 71) {
            if (iArr[0] == 0) {
                mo176314I7(true);
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.hhr), false, new C115824c(), new C115825d(this));
        }
    }
}
