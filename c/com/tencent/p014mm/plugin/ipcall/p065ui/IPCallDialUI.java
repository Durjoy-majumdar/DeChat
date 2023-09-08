package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UpdateCountryCodeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105394b;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C97625j3;
import java.util.LinkedList;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p12.C35363c;
import p12.C47420b;
import p447aw.C103918d;
import t12.C110899d;
import t12.C13818a;
import te3.C51114ri3;
import te3.px4;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallDialUI */
public class IPCallDialUI extends MMActivity implements C105394b.C56829c, C11385n {

    /* renamed from: A */
    public IListener f313287A = new IListener<UpdateCountryCodeEvent>(C40008f.f107254d) {
        {
            this.__eventId = -53647664;
        }

        public boolean callback(IEvent iEvent) {
            UpdateCountryCodeEvent updateCountryCodeEvent = (UpdateCountryCodeEvent) iEvent;
            if (!(updateCountryCodeEvent instanceof UpdateCountryCodeEvent)) {
                return false;
            }
            updateCountryCodeEvent.f154894d.getClass();
            if (IPCallDialUI.this.f313296o == null || Util.isNullOrNil((String) null)) {
                return false;
            }
            IPCallDialUI.this.f313296o.mo150126c((String) null);
            return false;
        }
    };

    /* renamed from: d */
    public DialPad f313288d;

    /* renamed from: e */
    public TextView f313289e;

    /* renamed from: f */
    public View f313290f;

    /* renamed from: g */
    public EditText f313291g;

    /* renamed from: h */
    public View f313292h;

    /* renamed from: i */
    public TextView f313293i;

    /* renamed from: j */
    public ImageButton f313294j;

    /* renamed from: n */
    public TextView f313295n;

    /* renamed from: o */
    public C105394b f313296o;

    /* renamed from: p */
    public String f313297p;

    /* renamed from: q */
    public String f313298q;

    /* renamed from: r */
    public String f313299r;

    /* renamed from: s */
    public String f313300s;

    /* renamed from: t */
    public String f313301t;

    /* renamed from: u */
    public int f313302u = 0;

    /* renamed from: v */
    public int f313303v = 0;

    /* renamed from: w */
    public int f313304w = -1;

    /* renamed from: x */
    public LinkedList<px4> f313305x;

    /* renamed from: y */
    public C47420b f313306y;

    /* renamed from: z */
    public C35363c f313307z;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallDialUI$b */
    public class C4637b implements DialogInterface.OnClickListener {
        public C4637b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(IPCallDialUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallDialUI$c */
    public class C4638c implements DialogInterface.OnClickListener {
        public C4638c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            IPCallDialUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallDialUI$a */
    public class C105387a implements MenuItem.OnMenuItemClickListener {
        public C105387a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IPCallDialUI.this.finish();
            return true;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2_;
    }

    public final void init() {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.RECORD_AUDIO", 80, (String) null, (String) null);
        Log.m105925i("MicroMsg.IPCallDialUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
        if (z1) {
            setMMTitle((int) C0966R.string.f360906fu1);
            setVolumeControlStream(1);
            this.f313288d = (DialPad) findViewById(C0966R.C0970id.c69);
            this.f313289e = (TextView) findViewById(C0966R.C0970id.bub);
            this.f313290f = findViewById(C0966R.C0970id.bu_);
            this.f313291g = (EditText) findViewById(C0966R.C0970id.hvq);
            this.f313292h = findViewById(C0966R.C0970id.hvp);
            this.f313293i = (TextView) findViewById(C0966R.C0970id.c6c);
            this.f313294j = (ImageButton) findViewById(C0966R.C0970id.c5t);
            this.f313295n = (TextView) findViewById(C0966R.C0970id.bud);
            C105394b bVar = new C105394b(this, this.f313291g, this.f313289e, this.f313292h, this.f313288d, this.f313294j, this.f313293i, this.f313290f, this.f313295n, (TextView) findViewById(C0966R.C0970id.c5w));
            this.f313296o = bVar;
            bVar.f313336a = this;
            if (!Util.isNullOrNil(this.f313298q)) {
                this.f313296o.mo150128e(this.f313298q, -1);
            }
            if (!Util.isNullOrNil(this.f313300s)) {
                this.f313296o.mo150126c(this.f313300s);
            }
            if (!Util.isNullOrNil(this.f313298q) && !Util.isNullOrNil(this.f313300s)) {
                this.f313296o.mo150125b();
            }
            this.f313296o.mo150127d(this.f313305x);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C105394b bVar = this.f313296o;
        bVar.getClass();
        Log.m105918d("MicroMsg.DialPadController", "onActivityResult");
        if (i == 100 && i2 == 100) {
            String nullAs = Util.nullAs(intent.getStringExtra("country_name"), "");
            String nullAs2 = Util.nullAs(intent.getStringExtra("couttry_code"), "");
            Log.m105919d("MicroMsg.DialPadController", "onActivityResult, countryName: %s, countryCode: %s", nullAs2, nullAs);
            if (!Util.isNullOrNil(nullAs2) && !Util.isNullOrNil(nullAs)) {
                bVar.f313348m = nullAs;
                String str = "+" + nullAs2;
                bVar.f313349n = str;
                bVar.f313338c.setText(str);
                String a = bVar.mo150124a(nullAs2.replace("+", ""), bVar.f313350o);
                bVar.f313350o = a;
                bVar.mo150128e(a, -1);
                bVar.f313355t = false;
            }
        } else if (i == 1001 && i2 == -1) {
            intent.getBooleanExtra("IPCallTalkUI_TalkIsOverdue", false);
            bVar.f313346k.setResult(-1, intent);
            bVar.f313346k.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f313287A.alive();
        C97625j3.m125815e().mo123455a(807, this);
        C97625j3.m125815e().mo123455a(746, this);
        getWindow().addFlags(131072);
        setBackBtn(new C105387a(), C0966R.raw.actionbar_quit_webview_icon);
        this.f313297p = getIntent().getStringExtra("IPCallTalkUI_nickname");
        this.f313298q = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
        this.f313299r = getIntent().getStringExtra("IPCallTalkUI_contactId");
        this.f313300s = getIntent().getStringExtra("IPCallTalkUI_countryCode");
        this.f313301t = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
        int intExtra = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
        this.f313302u = intExtra;
        Log.m105925i("MicroMsg.IPCallDialUI", "onCreate nickName:%s, phoneNumber:%s, contactId:%s, countryCode:%s, toUserName:%s, dialScene:%d", this.f313297p, this.f313298q, this.f313299r, this.f313300s, this.f313301t, Integer.valueOf(intExtra));
        if (!Util.isNullOrNil(this.f313298q)) {
            this.f313298q = C110899d.m151196j(this.f313298q);
        }
        if (Util.isNullOrNil(this.f313300s)) {
            if (!C13818a.m13118n(this.f313298q)) {
                this.f313300s = C110899d.m151192f();
            } else if (Util.isNullOrNil(C13818a.m13106b(this.f313298q))) {
                this.f313298q = C13818a.m13120p(this.f313298q);
                this.f313300s = C110899d.m151192f();
            } else {
                Log.m105924i("MicroMsg.IPCallDialUI", "country code exist, directly go to talk ui.");
                this.f313303v = 4;
                Intent intent = new Intent(this, IPCallTalkUI.class);
                intent.putExtra("IPCallTalkUI_contactId", this.f313299r);
                intent.putExtra("IPCallTalkUI_countryCode", this.f313300s);
                intent.putExtra("IPCallTalkUI_nickname", this.f313297p);
                intent.putExtra("IPCallTalkUI_phoneNumber", this.f313298q);
                intent.putExtra("IPCallTalkUI_dialScene", this.f313302u);
                intent.putExtra("IPCallTalkUI_countryType", this.f313303v);
                startActivityForResult(intent, 1001);
                finish();
                return;
            }
        }
        if (this.f313302u != 1) {
            this.f313304w = 0;
            this.f313303v = 3;
            this.f313306y = new C47420b(this.f313298q, this.f313300s, "", Util.getSimCountryCode(this), this.f313302u);
            C97625j3.m125815e().mo123460f(this.f313306y);
        } else {
            this.f313304w = -1;
            this.f313303v = 4;
        }
        init();
    }

    public void onDestroy() {
        super.onDestroy();
        C105394b bVar = this.f313296o;
        if (bVar != null) {
            bVar.f313336a = null;
        }
        this.f313287A.dead();
        C97625j3.m125815e().mo123470p(807, this);
        C97625j3.m125815e().mo123470p(746, this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.IPCallDialUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.IPCallDialUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 80) {
            if (iArr[0] == 0) {
                init();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C4637b(), new C4638c());
        }
    }

    public void onResume() {
        Log.m105918d("MicroMsg.IPCallDialUI", "onResume");
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C47420b bVar;
        int i3;
        if (yVar instanceof C47420b) {
            if (i == 0 && i2 == 0 && yVar == (bVar = this.f313306y)) {
                C51114ri3 ri32 = bVar.f127207e;
                if (ri32 != null) {
                    C51114ri3 ri33 = this.f313306y.f127207e;
                    Log.m105925i("MicroMsg.IPCallDialUI", "Response Result:%d,PureNumber:%s,CountryCode:%s", Integer.valueOf(ri32.f140936f), ri33.f140934d, ri33.f140935e);
                }
                if (this.f313304w != 2) {
                    this.f313304w = 1;
                    this.f313303v = 1;
                    C51114ri3 ri34 = this.f313306y.f127207e;
                    if (ri34 != null && ri34.f140936f == 2) {
                        Log.m105924i("MicroMsg.IPCallDialUI", "check error show error dialog");
                        return;
                    }
                    if (ri34 != null && ((i3 = ri34.f140936f) == 1 || i3 == 0)) {
                        if (ri34 == null || Util.isNullOrNil(ri34.f140935e)) {
                            Log.m105924i("MicroMsg.IPCallDialUI", "response country code is empty, ignore");
                        } else if (this.f313296o != null) {
                            Log.m105925i("MicroMsg.IPCallDialUI", "response country code:%s, old country code:%s", this.f313306y.f127207e.f140935e, this.f313300s);
                            String str2 = this.f313306y.f127207e.f140935e;
                            this.f313300s = str2;
                            this.f313296o.mo150126c(str2);
                        }
                    }
                    C51114ri3 ri35 = this.f313306y.f127207e;
                    if (ri35 != null && !Util.isNullOrNil(ri35.f140934d) && this.f313296o != null) {
                        Log.m105925i("MicroMsg.IPCallDialUI", "response number:%s, old number:%s", this.f313306y.f127207e.f140934d, this.f313298q);
                        String str3 = this.f313306y.f127207e.f140934d;
                        this.f313298q = str3;
                        this.f313296o.mo150128e(str3, -1);
                        return;
                    }
                    return;
                }
                Log.m105924i("MicroMsg.IPCallDialUI", "NetSceneIPCallCheckNumber onSceneEnd, mCheckNumberStatus = userModify, ignore");
            }
        } else if (yVar instanceof C35363c) {
            if (i == 0 && i2 == 0) {
                this.f313305x = ((C35363c) yVar).f94696e.f143960e;
            } else {
                this.f313305x = null;
            }
            C105394b bVar2 = this.f313296o;
            if (bVar2 != null) {
                bVar2.mo150127d(this.f313305x);
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.f313307z = new C35363c();
        C97625j3.m125815e().mo123460f(this.f313307z);
    }
}
