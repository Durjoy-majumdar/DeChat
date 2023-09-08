package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import aw0.C103928o;
import bh3.C113177k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ipcall.model.C105381e;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.ipcall.model.C42464d;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105420i2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import eb0.C97625j3;
import gy3.C87412m;
import j12.C108528a;
import l12.C109121b;
import l12.C109123c;
import l12.C109129g;
import m12.C109470c;
import nj3.C76879j;
import nj3.C88989a;
import o33.C109938b;
import ou0.C110066a;
import ou0.C110071c;
import p331dj.C107043a;
import p447aw.C103918d;
import p910lj.C76701a;
import pu0.C110248b;
import t12.C110899d;
import t12.C13818a;
import uv0.C22663i;
import wc3.C15131b;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI */
public class IPCallTalkUI extends MMActivity implements C105420i2.C105422b {

    /* renamed from: p */
    public static final /* synthetic */ int f313323p = 0;

    /* renamed from: d */
    public String f313324d;

    /* renamed from: e */
    public String f313325e;

    /* renamed from: f */
    public String f313326f;

    /* renamed from: g */
    public String f313327g;

    /* renamed from: h */
    public String f313328h;

    /* renamed from: i */
    public int f313329i;

    /* renamed from: j */
    public int f313330j;

    /* renamed from: n */
    public C105420i2 f313331n;

    /* renamed from: o */
    public C109938b f313332o;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI$a */
    public class C105391a implements C113177k.C113181e {
        public C105391a() {
        }

        public void onOp(Boolean bool) {
            if (bool.booleanValue()) {
                IPCallTalkUI iPCallTalkUI = IPCallTalkUI.this;
                int i = IPCallTalkUI.f313323p;
                iPCallTalkUI.init();
                return;
            }
            IPCallTalkUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI$b */
    public class C105392b implements DialogInterface.OnClickListener {
        public C105392b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            IPCallTalkUI.this.finish();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(IPCallTalkUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI$c */
    public class C105393c implements DialogInterface.OnClickListener {
        public C105393c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            IPCallTalkUI.this.finish();
        }
    }

    public void finish() {
        C105420i2 i2Var = this.f313331n;
        if (i2Var != null) {
            i2Var.f313426E = true;
        }
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b2b;
    }

    public final void init() {
        C105385g xx02 = C105385g.xx0();
        if (xx02.f313269g == null) {
            xx02.f313269g = new C109123c();
        }
        C109123c cVar = xx02.f313269g;
        if (!cVar.f326759c) {
            cVar.f326758b = new C108528a();
            cVar.f326759c = true;
        }
        C105420i2 i2Var = new C105420i2(this);
        this.f313331n = i2Var;
        i2Var.f313453z = this;
        String str = this.f313324d;
        String str2 = this.f313325e;
        String str3 = this.f313326f;
        String str4 = this.f313327g;
        String str5 = this.f313328h;
        int i = this.f313329i;
        int i2 = this.f313330j;
        boolean booleanExtra = i2Var.f313450w.getIntent().getBooleanExtra("IPCallTalkUI_isFromMiniNotification", false);
        i2Var.f313424C = booleanExtra;
        Log.m105925i("MicroMsg.TalkUIController", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername: %s, isFromMinimize: %b", str, str2, str3, str4, str5, Boolean.valueOf(booleanExtra));
        i2Var.f313431d = (ImageView) i2Var.f313450w.findViewById(C0966R.C0970id.kfd);
        i2Var.f313432e = (ImageView) i2Var.f313450w.findViewById(C0966R.C0970id.kfb);
        i2Var.f313428a = (EditText) i2Var.f313450w.findViewById(C0966R.C0970id.kfi);
        i2Var.f313430c = (TextView) i2Var.f313450w.findViewById(C0966R.C0970id.kfl);
        i2Var.f313429b = (TextView) i2Var.f313450w.findViewById(C0966R.C0970id.kfj);
        i2Var.f313433f = (IPCallFuncButton) i2Var.f313450w.findViewById(C0966R.C0970id.kfh);
        i2Var.f313434g = (IPCallFuncButton) i2Var.f313450w.findViewById(C0966R.C0970id.kfe);
        i2Var.f313435h = (IPCallFuncButton) i2Var.f313450w.findViewById(C0966R.C0970id.kfk);
        i2Var.f313436i = (ImageButton) i2Var.f313450w.findViewById(C0966R.C0970id.kfg);
        i2Var.f313440m = (ImageButton) i2Var.f313450w.findViewById(C0966R.C0970id.f_t);
        i2Var.f313438k = (TextView) i2Var.f313450w.findViewById(C0966R.C0970id.f359525ld0);
        i2Var.f313439l = i2Var.f313450w.findViewById(C0966R.C0970id.f359526ld1);
        i2Var.f313437j = (DialPad) i2Var.f313450w.findViewById(C0966R.C0970id.c69);
        if (i2Var.f313424C) {
            if (C105385g.Gx0().f313260u != null) {
                i2Var.f313441n = C105385g.Gx0().f313260u.f325888F;
                i2Var.f313447t = C105385g.Gx0().f313260u.f325892J;
                i2Var.f313446s = C105385g.Gx0().f313260u.f325891I;
                i2Var.f313444q = C105385g.Gx0().f313260u.f325890H;
                i2Var.f313442o = C105385g.Gx0().f313260u.f325889G;
                int i3 = C105385g.Gx0().f313260u.f325894L;
                i2Var.f313443p = i3;
                Log.m105925i("MicroMsg.TalkUIController", "restoreParam nickname:%s,fianlPhoneNumber:%s,toUserName:%s,contactId:%s,phoneNumber:%s,phoneType:%d", i2Var.f313441n, i2Var.f313447t, i2Var.f313446s, i2Var.f313444q, i2Var.f313442o, Integer.valueOf(i3));
            }
            i2Var.mo150159a();
            i2Var.mo150161c();
            C105385g.Fx0();
            Log.m105924i("MicroMsg.TalkUIController", C105381e.m141555e(C105385g.Fx0().f313245a));
            i2Var.mo150165g(C105385g.Fx0().f313245a);
            String str6 = C105385g.Gx0().f313260u.f325892J;
            String str7 = C105385g.Gx0().f313260u.f325893K;
            if (!Util.isNullOrNil(str7)) {
                i2Var.mo150166h(str7);
                i2Var.f313429b.setText(C13818a.m13108d(str7));
            } else if (!Util.isNullOrNil(str6)) {
                i2Var.mo150166h(str6);
                i2Var.f313429b.setText(C13818a.m13108d(str6));
            }
            if (C105385g.Fx0().mo150084b()) {
                i2Var.f313435h.setChecked(C105385g.yx0().f326758b.mo161485s());
                i2Var.f313433f.setChecked(C105385g.yx0().f326758b.f324869n.f326766d);
            }
        } else if (C105385g.Fx0().mo150086d()) {
            C76879j.m92744o(i2Var.f313450w, C0966R.string.fr6, C0966R.string.a3h, false, new C105411f2(i2Var));
        } else {
            i2Var.mo150159a();
            i2Var.f313441n = str;
            i2Var.f313442o = str2;
            i2Var.f313444q = str3;
            i2Var.f313445r = str4;
            i2Var.f313448u = i;
            i2Var.f313449v = i2;
            if (!Util.isNullOrNil(str2)) {
                i2Var.f313442o = C110899d.m151196j(i2Var.f313442o);
            }
            if (Util.isNullOrNil(i2Var.f313445r)) {
                if (C13818a.m13118n(i2Var.f313442o)) {
                    String b = C13818a.m13106b(i2Var.f313442o);
                    if (Util.isNullOrNil(b)) {
                        i2Var.f313442o = C13818a.m13120p(i2Var.f313442o);
                        i2Var.f313445r = C110899d.m151192f();
                    } else {
                        i2Var.f313442o = C13818a.m13107c(i2Var.f313442o);
                        i2Var.f313445r = b;
                    }
                } else {
                    i2Var.f313445r = C110899d.m151192f();
                }
            }
            Log.m105925i("MicroMsg.TalkUIController", "final mCountryCode: %s", i2Var.f313445r);
            C42464d a = C42464d.m46136a();
            String str8 = i2Var.f313445r;
            if (!a.f114953c) {
                a.mo66546b(false);
            }
            if (!Util.isNullOrNil(str8)) {
                C105385g.Bx0().mo60757jo(Util.getInt(str8.replace("+", ""), 0), Util.nowMilliSecond());
                a.mo66548d();
            }
            if (Util.isNullOrNil(i2Var.f313441n)) {
                IPCallTalkUI iPCallTalkUI = i2Var.f313450w;
                String f = C13818a.m13110f(iPCallTalkUI, i2Var.f313442o);
                i2Var.f313441n = !Util.isNullOrNil(f) ? C15131b.m14239c(f, iPCallTalkUI) : null;
            }
            i2Var.f313446s = str5;
            if (Util.isNullOrNil(i2Var.f313445r) || C13818a.m13118n(i2Var.f313442o)) {
                i2Var.f313447t = i2Var.f313442o;
            } else {
                String str9 = i2Var.f313445r + i2Var.f313442o;
                i2Var.f313447t = str9;
                if (!str9.startsWith("+")) {
                    i2Var.f313447t = "+" + i2Var.f313447t;
                }
            }
            Log.m105925i("MicroMsg.TalkUIController", "final call mPhoneNumber: %s", i2Var.f313447t);
            int i4 = -1;
            if (C42464d.m46136a().mo66549e(Util.getInt(i2Var.f313445r, -1))) {
                C115669n.INSTANCE.kvStat(12058, i2Var.f313445r);
                IPCallTalkUI iPCallTalkUI2 = i2Var.f313450w;
                C76879j.m92713G(iPCallTalkUI2, iPCallTalkUI2.getString(C0966R.string.aua), i2Var.f313450w.getString(C0966R.string.aub), false, new C105417h2(i2Var));
            } else if (!NetStatusUtil.isNetworkConnected(i2Var.f313450w)) {
                C76701a.makeText((Context) i2Var.f313450w, (int) C0966R.string.f360087a11, 1).show();
                i2Var.f313450w.finish();
            } else {
                long j = i2Var.f313450w.getSharedPreferences("IPCall_LastInputPref", 0).getLong("IPCall_LastInvite", -1);
                long currentTimeMillis = System.currentTimeMillis();
                if (j <= currentTimeMillis || j == -1) {
                    i2Var.mo150161c();
                    if (!i2Var.f313424C || !C105385g.Fx0().mo150086d()) {
                        String str10 = i2Var.f313444q;
                        String str11 = i2Var.f313442o;
                        PhoneFormater phoneFormater = C13818a.f38950a;
                        if (!Util.isNullOrNil(str10) && !Util.isNullOrNil(str11)) {
                            int j2 = C13818a.m13114j(str10, str11);
                            if (j2 != -1 || !str11.startsWith("+")) {
                                i4 = j2;
                            } else {
                                String b2 = C13818a.m13106b(str11);
                                if (!Util.isNullOrNil(b2)) {
                                    str11 = str11.substring(("+" + b2).length());
                                }
                                i4 = C13818a.m13114j(str10, str11);
                            }
                        }
                        i2Var.f313443p = i4;
                        i2Var.mo150165g(1);
                        i2Var.f313452y.mo150070m(i2Var.f313441n, i2Var.f313442o, i2Var.f313446s, i2Var.f313447t, i2Var.f313444q, i2Var.f313443p, i2Var.f313448u, i2Var.f313449v);
                        Log.m105925i("MicroMsg.TalkUIController", "startLaunchTalk, callNumber: %s", i2Var.f313447t);
                        C109470c Dx0 = C105385g.Dx0();
                        String str12 = i2Var.f313445r;
                        Dx0.getClass();
                        Log.m105919d("MicroMsg.IPCallReportHelper", "setCountryCode: %s", str12);
                        if (!Util.isNullOrNil(str12)) {
                            Dx0.f327647B = str12;
                        }
                    }
                } else {
                    Log.m105924i("MicroMsg.TalkUIController", "onDisasterHappen");
                    IPCallTalkUI iPCallTalkUI3 = i2Var.f313450w;
                    C76879j.m92711E(iPCallTalkUI3, iPCallTalkUI3.getString(C0966R.string.f360907fu2, new Object[]{String.valueOf(((j - currentTimeMillis) / 1000) + 1)}), i2Var.f313450w.getString(C0966R.string.fts), i2Var.f313450w.getString(C0966R.string.ftt), false, new C105414g2(i2Var));
                }
            }
        }
        C109938b bVar = new C109938b(new C22663i(this));
        this.f313332o = bVar;
        bVar.mo35648A(9, "VOIPFloatBall");
    }

    public void onBackPressed() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getSupportActionBar().mo91104o();
        getWindow().addFlags(6946944);
        this.f313324d = getIntent().getStringExtra("IPCallTalkUI_nickname");
        this.f313325e = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
        this.f313326f = getIntent().getStringExtra("IPCallTalkUI_contactId");
        this.f313327g = getIntent().getStringExtra("IPCallTalkUI_countryCode");
        this.f313328h = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
        this.f313329i = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
        this.f313330j = getIntent().getIntExtra("IPCallTalkUI_countryType", 0);
        Log.m105925i("MicroMsg.IPCallTalkUI", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername:%s, mDialScene:%d ,mCountryType:%d", this.f313324d, this.f313325e, this.f313326f, this.f313327g, this.f313328h, Integer.valueOf(this.f313329i), Integer.valueOf(this.f313330j));
        Log.m105925i("MicroMsg.IPCallTalkUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", Boolean.valueOf(((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.RECORD_AUDIO", 80, (String) null, (String) null)), Util.getStack());
        if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.MICRO_PHONE, C113177k.C113178a.WECHAT_OUT, new C105391a())) {
            init();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        setScreenEnable(true);
        C105420i2 i2Var = this.f313331n;
        if (i2Var != null) {
            Log.m105924i("MicroMsg.TalkUIController", "onDestroy");
            i2Var.f313452y.f313219d = null;
            C105385g.yx0().f326761e = null;
            C108528a aVar = C105385g.yx0().f326758b;
            if (aVar != null) {
                aVar.f324867l = null;
            }
            C105385g.yx0().f326760d = null;
            C109129g gVar = C105385g.yx0().f326757a;
            gVar.f326777h = null;
            gVar.f326773d.removeSensorCallBack();
            gVar.f326774e.stopShake();
            i2Var.f313450w = null;
            i2Var.f313453z = null;
        }
        C109938b bVar = this.f313332o;
        if (bVar != null) {
            bVar.mo67996A0();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        int i3;
        Class cls = C110248b.class;
        if (this.f313331n != null) {
            boolean z = false;
            if (C105385g.Fx0().mo150084b()) {
                if (i == 25) {
                    C109121b bVar = C105385g.yx0().f326758b.f324868m;
                    if (bVar != null) {
                        C106336d dVar = bVar.f326750a;
                        i3 = (dVar == null || !bVar.f326752c) ? -1 : dVar.mo152548g();
                    } else {
                        i3 = 0;
                    }
                    if (i3 != -1) {
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
                        C110066a aVar = ((C110248b) c).f329779e;
                        if (aVar == null) {
                            aVar = new C110071c();
                            C7335d c2 = C86312j.m106911c(cls);
                            C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
                            ((C110248b) c2).f329781g[0] = "music";
                        }
                        C107043a.m144903a(aVar.f329358h, i3, -1, 5);
                    }
                } else if (i == 24) {
                    C109121b bVar2 = C105385g.yx0().f326758b.f324868m;
                    if (bVar2 != null) {
                        C106336d dVar2 = bVar2.f326750a;
                        i2 = (dVar2 == null || !bVar2.f326752c) ? -1 : dVar2.mo152548g();
                    } else {
                        i2 = 0;
                    }
                    if (i2 != -1) {
                        C7335d c3 = C86312j.m106911c(cls);
                        C87412m.m108593f(c3, "getService(SubCoreAudio::class.java)");
                        C110066a aVar2 = ((C110248b) c3).f329779e;
                        if (aVar2 == null) {
                            aVar2 = new C110071c();
                            C7335d c4 = C86312j.m106911c(cls);
                            C87412m.m108593f(c4, "getService(SubCoreAudio::class.java)");
                            ((C110248b) c4).f329781g[0] = "music";
                        }
                        C107043a.m144903a(aVar2.f329358h, i2, 1, 5);
                    }
                }
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        Log.m105918d("MicroMsg.IPCallTalkUI", "onPause");
        super.onPause();
        C105420i2 i2Var = this.f313331n;
        if (i2Var != null) {
            boolean hasWindowFocus = hasWindowFocus();
            i2Var.getClass();
            Log.m105918d("MicroMsg.TalkUIController", "onPause");
            i2Var.f313427F = (hasWindowFocus || !((KeyguardManager) MMApplicationContext.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode()) && ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).isScreenOn();
        }
        C109938b bVar = this.f313332o;
        if (bVar != null) {
            bVar.mo64001C();
            C103928o.m138642b();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.IPCallTalkUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.IPCallTalkUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 80) {
            if (iArr[0] == 0) {
                init();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C105392b(), new C105393c());
        }
    }

    public void onResume() {
        Log.m105918d("MicroMsg.IPCallTalkUI", "onResume");
        super.onResume();
        C105420i2 i2Var = this.f313331n;
        if (i2Var != null) {
            i2Var.getClass();
            Log.m105918d("MicroMsg.TalkUIController", "onResume");
            ((MMNotification) C97625j3.m125816f()).mo93207e(42);
        }
        C109938b bVar = this.f313332o;
        if (bVar != null) {
            bVar.mo78184B0();
            C103928o.m138641a(true, false, true);
        }
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.IPCallTalkUI", "onStop");
        C105420i2 i2Var = this.f313331n;
        if (i2Var != null && i2Var.f313427F && !i2Var.f313426E) {
            C105385g.xx0().f313271i.mo150061d();
        }
    }
}
