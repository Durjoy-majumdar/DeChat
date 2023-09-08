package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import f40.C86709a0;
import ke3.C88144b;
import m71.C46948b;
import o71.C47332a;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI */
public class ExdeviceConnectedRouterActivateStateUI extends MMActivity {

    /* renamed from: p */
    public static final /* synthetic */ int f197900p = 0;

    /* renamed from: d */
    public ExdeviceConnectedRouterStateView f197901d;

    /* renamed from: e */
    public TextView f197902e;

    /* renamed from: f */
    public TextView f197903f;

    /* renamed from: g */
    public String f197904g;

    /* renamed from: h */
    public String f197905h;

    /* renamed from: i */
    public String f197906i;

    /* renamed from: j */
    public String f197907j;

    /* renamed from: n */
    public String f197908n;

    /* renamed from: o */
    public C46948b<C47332a> f197909o = new C68881a();

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI$a */
    public class C68881a implements C46948b<C47332a> {
        public C68881a() {
        }

        /* renamed from: a */
        public void mo64355a(int i, int i2, String str, C117747y yVar) {
            C47332a aVar = (C47332a) yVar;
            try {
                Log.m105919d("MicroMsg.ConnectedRouterActivateStateUi", "onNetSceneEndCallback, errType(%s), errCode(%s), errMsg(%s)", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (ExdeviceConnectedRouterActivateStateUI.this.isFinishing()) {
                    Log.m105924i("MicroMsg.ConnectedRouterActivateStateUi", "ExdeviceConnectedRouter destroyed.");
                } else {
                    ExdeviceConnectedRouterActivateStateUI.this.runOnUiThread(new C68885h(this, i2, i));
                }
            } catch (Exception e) {
                Log.m105918d("MicroMsg.ConnectedRouterActivateStateUi", e.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI$b */
    public class C68882b implements MenuItem.OnMenuItemClickListener {
        public C68882b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceConnectedRouterActivateStateUI exdeviceConnectedRouterActivateStateUI = ExdeviceConnectedRouterActivateStateUI.this;
            int i = ExdeviceConnectedRouterActivateStateUI.f197900p;
            exdeviceConnectedRouterActivateStateUI.mo94757H7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterActivateStateUI$c */
    public class C68883c implements MenuItem.OnMenuItemClickListener {
        public C68883c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceConnectedRouterActivateStateUI exdeviceConnectedRouterActivateStateUI = ExdeviceConnectedRouterActivateStateUI.this;
            int i = ExdeviceConnectedRouterActivateStateUI.f197900p;
            exdeviceConnectedRouterActivateStateUI.mo94757H7();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo94757H7() {
        finish();
        Intent intent = new Intent();
        intent.putExtra("From_fail_notify", true);
        Log.m105918d("MicroMsg.ConnectedRouterActivateStateUi", "startMainUI");
        C88144b.m109801s(this, "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
    }

    /* renamed from: I7 */
    public void mo94758I7(int i) {
        this.f197901d.setOnClickListener((View.OnClickListener) null);
        Log.m105919d("MicroMsg.ConnectedRouterActivateStateUi", "Current connection state : %d", Integer.valueOf(i));
        if (i == 1) {
            this.f197901d.setImageResource(C0966R.raw.connected_router_state_normal);
            this.f197901d.setState(1);
            this.f197902e.setText(C0966R.string.cda);
        } else if (i == 2) {
            this.f197901d.setImageResource(C0966R.raw.connected_router_state_succ);
            this.f197901d.setState(2);
            this.f197902e.setText(getString(C0966R.string.cde, new Object[]{this.f197908n}));
            addTextOptionMenu(0, getString(C0966R.string.cd_), new C68883c());
        } else if (i == 3) {
            this.f197901d.setImageResource(C0966R.raw.connected_router_state_error);
            this.f197901d.setState(3);
            this.f197901d.f197916g = 2;
            this.f197902e.setText(C0966R.string.cdb);
            this.f197903f.setText(getString(C0966R.string.cdc, new Object[]{this.f197908n}));
        } else if (i == 4) {
            this.f197901d.setImageResource(C0966R.raw.connected_router_state_error);
            this.f197901d.setState(3);
            this.f197901d.f197916g = 2;
            this.f197902e.setText(C0966R.string.cdb);
            this.f197903f.setText(getString(C0966R.string.cdd));
        } else if (i == 5) {
            this.f197901d.setImageResource(C0966R.raw.connected_router_state_error);
            this.f197901d.setState(3);
            this.f197901d.f197916g = 2;
            this.f197902e.setText(C0966R.string.cdb);
            this.f197903f.setText(getString(C0966R.string.cdf));
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a47;
    }

    public void init() {
        setMMTitle((int) C0966R.string.cdg);
        setBackBtn(new C68882b());
        this.f197901d = (ExdeviceConnectedRouterStateView) findViewById(C0966R.C0970id.cm6);
        this.f197902e = (TextView) findViewById(C0966R.C0970id.cm5);
        this.f197903f = (TextView) findViewById(C0966R.C0970id.cm7);
        try {
            Uri parse = Uri.parse(getIntent().getStringExtra("key_connected_router"));
            this.f197904g = parse.getQueryParameter("deviceid");
            this.f197905h = parse.getQueryParameter("devicetype");
            this.f197906i = parse.getQueryParameter(ClientInfoTable.TABLE_NAME);
            this.f197907j = parse.getQueryParameter("appid");
            if (Util.isNullOrNil(this.f197904g) || Util.isNullOrNil(this.f197905h) || Util.isNullOrNil(this.f197906i) || Util.isNullOrNil(this.f197907j)) {
                Log.m105921e("MicroMsg.ConnectedRouterActivateStateUi", "loss param %s", parse.toString());
                finish();
            }
            this.f197908n = parse.getQueryParameter(TPDownloadProxyEnum.USER_SSID);
            Log.m105919d("MicroMsg.ConnectedRouterActivateStateUi", "uri: %s, deviceid: %s, devicetype: %s, clientinfo: %s. ssid: %s", parse.toString(), this.f197904g, this.f197905h, this.f197906i, this.f197908n);
            if (this.f197908n == null) {
                this.f197908n = "";
            }
        } catch (Exception e) {
            Log.m105918d("MicroMsg.ConnectedRouterActivateStateUi", e.toString());
        }
        mo94758I7(1);
        C86709a0.m107529k().f251779b.mo123460f(new C47332a(this.f197904g, this.f197905h, this.f197906i, this.f197907j, this.f197909o));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.ConnectedRouterActivateStateUi", "create activity");
        init();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo94757H7();
        return true;
    }

    public void onResume() {
        super.onResume();
    }
}
