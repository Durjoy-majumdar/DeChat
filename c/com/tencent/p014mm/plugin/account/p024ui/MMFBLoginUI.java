package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116099e;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116102h;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116105j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.CookieManager;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import pj3.C47511g;
import qo3.C89779i0;
import wg0.C78595a;

/* renamed from: com.tencent.mm.plugin.account.ui.MMFBLoginUI */
public class MMFBLoginUI extends MMPreference implements C11385n {

    /* renamed from: p */
    public static final String[] f344655p = {"public_profile", Scopes.EMAIL, "user_location"};

    /* renamed from: d */
    public C116102h f344656d;

    /* renamed from: e */
    public String f344657e = "";

    /* renamed from: f */
    public C89779i0 f344658f;

    /* renamed from: g */
    public DialogInterface.OnCancelListener f344659g;

    /* renamed from: h */
    public C114735a0 f344660h;

    /* renamed from: i */
    public String f344661i;

    /* renamed from: j */
    public ThirdAppRegisterStruct f344662j = new ThirdAppRegisterStruct();

    /* renamed from: n */
    public C115118e f344663n;

    /* renamed from: o */
    public IListener f344664o = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.FacebookLoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBLoginUI$a */
    public class C68449a implements C75576f4.C75578b {
        public C68449a(MMFBLoginUI mMFBLoginUI) {
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C86709a0.m107523b().mo121110g());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBLoginUI$b */
    public class C68450b implements Runnable {
        public C68450b() {
        }

        public void run() {
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(MMFBLoginUI.this);
            b.addFlags(67108864);
            MMFBLoginUI mMFBLoginUI = MMFBLoginUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            MMFBLoginUI mMFBLoginUI2 = mMFBLoginUI;
            C117292a.m165358d(mMFBLoginUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$6", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMFBLoginUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMFBLoginUI2, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$6", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(MMFBLoginUI.this.getClass().getName());
            sb.append(",");
            sb.append("L14");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L14"));
            sb.append(",");
            sb.append(4);
            C78595a.m94982b(10645, sb.toString());
            MMFBLoginUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBLoginUI$c */
    public class C114971c extends C115118e {
        public C114971c() {
        }

        /* renamed from: c */
        public C117747y mo174697c(C117747y yVar, String str) {
            C114735a0 a0Var = (C114735a0) yVar;
            return new C114735a0("facebook@wechat_auth", MMFBLoginUI.this.f344657e, a0Var.mo174360p1(), str, a0Var.mo174359o1(), a0Var.mo174358n1(), 0, "", true, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBLoginUI$d */
    public class C114972d implements DialogInterface.OnCancelListener {
        public C114972d() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            if (MMFBLoginUI.this.f344660h != null) {
                C86709a0.m107524d().mo123458d(MMFBLoginUI.this.f344660h);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBLoginUI$e */
    public class C114973e implements MenuItem.OnMenuItemClickListener {
        public C114973e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MMFBLoginUI mMFBLoginUI = MMFBLoginUI.this;
            String[] strArr = MMFBLoginUI.f344655p;
            C78595a.m94985e(mMFBLoginUI.f344661i);
            mMFBLoginUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.MMFBLoginUI$f */
    public final class C114974f implements C116102h.C116103a {
        public C114974f(C1149701 r2) {
        }

        /* renamed from: b */
        public void mo1391b(Bundle bundle) {
            MMFBLoginUI mMFBLoginUI = MMFBLoginUI.this;
            mMFBLoginUI.f344657e = mMFBLoginUI.f344656d.f348440a;
            if (!mMFBLoginUI.isFinishing()) {
                C89779i0 Q = C76879j.m92723Q(mMFBLoginUI, mMFBLoginUI.getString(C0966R.string.a3h), mMFBLoginUI.getString(C0966R.string.gda), true, true, (DialogInterface.OnCancelListener) null);
                mMFBLoginUI.f344658f = Q;
                Q.setOnCancelListener(mMFBLoginUI.f344659g);
                Log.m105925i("MicroMsg.FacebookLoginUI", "dkwt Ready to Facebook auth user[%s] token[%d][%s]", "facebook@wechat_auth", Integer.valueOf(mMFBLoginUI.f344657e.length()), mMFBLoginUI.f344657e.substring(0, 4));
                mMFBLoginUI.f344660h = new C114735a0("facebook@wechat_auth", mMFBLoginUI.f344657e, 0, "", "", "", 0, "", true, false);
                C86709a0.m107524d().mo123460f(mMFBLoginUI.f344660h);
            }
        }

        /* renamed from: c */
        public void mo1392c(C116105j jVar) {
            Log.m105918d("MicroMsg.FacebookLoginUI", "onFacebookError:" + jVar.getMessage());
            C76879j.m92748s(MMFBLoginUI.this, jVar.getMessage(), MMFBLoginUI.this.getString(C0966R.string.cl4));
            MMFBLoginUI.m161858H7(MMFBLoginUI.this, false);
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(MMFBLoginUI.this.getClass().getName());
            sb.append(",");
            sb.append("L14");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L14"));
            sb.append(",");
            sb.append(2);
            C78595a.m94982b(10645, sb.toString());
            C115669n.INSTANCE.idkeyStat(582, 7, 1, false);
        }

        /* renamed from: d */
        public void mo1393d(C116099e eVar) {
            Log.m105918d("MicroMsg.FacebookLoginUI", "onError:" + eVar.getMessage());
            C76879j.m92748s(MMFBLoginUI.this, eVar.getMessage(), MMFBLoginUI.this.getString(C0966R.string.cl4));
            MMFBLoginUI.m161858H7(MMFBLoginUI.this, false);
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(MMFBLoginUI.this.getClass().getName());
            sb.append(",");
            sb.append("L14");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L14"));
            sb.append(",");
            sb.append(2);
            C78595a.m94982b(10645, sb.toString());
            C115669n.INSTANCE.idkeyStat(582, 8, 1, false);
        }

        public void onCancel() {
            Log.m105918d("MicroMsg.FacebookLoginUI", "onCancel");
            MMFBLoginUI.m161858H7(MMFBLoginUI.this, false);
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(MMFBLoginUI.this.getClass().getName());
            sb.append(",");
            sb.append("L14");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L14"));
            sb.append(",");
            sb.append(2);
            C78595a.m94982b(10645, sb.toString());
            C115669n.INSTANCE.idkeyStat(582, 9, 1, false);
        }
    }

    /* renamed from: H7 */
    public static void m161858H7(MMFBLoginUI mMFBLoginUI, boolean z) {
        mMFBLoginUI.getClass();
        int i = z ? 19 : 20;
        C86709a0.m107535s().f251803a.mo119664f(i, Integer.valueOf(Util.nullAs((Integer) C86709a0.m107535s().f251803a.mo119660a(i), 0) + 1));
    }

    /* renamed from: I7 */
    public final void mo174696I7() {
        try {
            C116102h hVar = this.f344656d;
            if (hVar != null) {
                CookieManager.getInstance().removeAllCookie();
                hVar.mo177424h((String) null);
                hVar.f348441b = 0;
                hVar.mo177425i(this);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FacebookLoginUI", e, "", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("L14");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L14"));
        sb.append(",");
        sb.append(1);
        C78595a.m94982b(10645, sb.toString());
        C116102h hVar2 = new C116102h();
        this.f344656d = hVar2;
        hVar2.mo177418a(this, f344655p, new C114974f((C1149701) null));
        C115669n.INSTANCE.idkeyStat(582, 5, 1, false);
    }

    public int getResourceId() {
        return C0966R.xml.f8892am;
    }

    public void initView() {
        this.f344656d = new C116102h();
        this.f344659g = new C114972d();
        mo174696I7();
        setBackBtn(new C114973e());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = new Object[3];
        int i3 = 0;
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Boolean.valueOf(intent == null);
        Log.m105925i("MicroMsg.FacebookLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i2 == -1 && i == 1024 && intent != null) {
            String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            Object[] objArr2 = new Object[3];
            objArr2[0] = Boolean.valueOf(Util.isNullOrNil(stringExtra));
            if (!Util.isNullOrNil(stringExtra)) {
                i3 = stringExtra.length();
            }
            objArr2[1] = Integer.valueOf(i3);
            objArr2[2] = Integer.valueOf(intExtra);
            Log.m105925i("MicroMsg.FacebookLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                mo174696I7();
                return;
            }
        }
        C116102h hVar = this.f344656d;
        if (hVar != null) {
            hVar.mo177419b(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.gc8);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
        this.f344661i = C78595a.m94981a();
        initView();
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(252, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C116102h hVar = this.f344656d;
        if (hVar != null) {
            hVar.mo177420c(this);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        C78595a.m94985e(this.f344661i);
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        this.f344664o.dead();
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("L100_200_FB");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L100_200_FB"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str == null) {
            Log.m105920e("MicroMsg.FacebookLoginUI", "onPreferenceTreeClick, key is null");
            return true;
        } else if (!str.equals("facebook_auth_bind_btn")) {
            return false;
        } else {
            mo174696I7();
            return true;
        }
    }

    public void onResume() {
        this.f344664o.alive();
        super.onResume();
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("L100_200_FB");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("L100_200_FB"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        C78595a.m94984d("L100_200_FB");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        if (r8 != -3) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0168 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, ob0.C117747y r22) {
        /*
            r18 = this;
            r10 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r22
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r22.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12 = 0
            r1[r12] = r2
            int r2 = r22.getType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r13 = 1
            r1[r13] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r14 = 2
            r1[r14] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r3 = 3
            r1[r3] = r2
            r2 = 4
            r1[r2] = r9
            java.lang.String r3 = "MicroMsg.FacebookLoginUI"
            java.lang.String r4 = "dkwt onSceneEnd: hash:%d type:%d [%d,%d,%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            qo3.i0 r1 = r10.f344658f
            r15 = 0
            if (r1 == 0) goto L_0x0045
            r1.dismiss()
            r10.f344658f = r15
        L_0x0045:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isTopActivity(r18)
            if (r1 != 0) goto L_0x004c
            return
        L_0x004c:
            boolean r1 = r11 instanceof com.tencent.p014mm.modelsimple.C114735a0
            if (r1 != 0) goto L_0x0051
            return
        L_0x0051:
            r1 = r11
            com.tencent.mm.modelsimple.a0 r1 = (com.tencent.p014mm.modelsimple.C114735a0) r1
            r1.mo174354j1()
            int r3 = r22.getType()
            r6 = 701(0x2bd, float:9.82E-43)
            r5 = 252(0xfc, float:3.53E-43)
            if (r3 == r5) goto L_0x0067
            int r3 = r22.getType()
            if (r3 != r6) goto L_0x0084
        L_0x0067:
            if (r7 != r2) goto L_0x0084
            r3 = -16
            if (r8 == r3) goto L_0x0071
            r3 = -17
            if (r8 != r3) goto L_0x0084
        L_0x0071:
            ob0.b0 r3 = f40.C86709a0.m107524d()
            eb0.f4 r4 = new eb0.f4
            com.tencent.mm.plugin.account.ui.MMFBLoginUI$a r5 = new com.tencent.mm.plugin.account.ui.MMFBLoginUI$a
            r5.<init>(r10)
            r4.<init>(r5, r15)
            r3.mo123460f(r4)
            r3 = 1
            goto L_0x0085
        L_0x0084:
            r3 = 0
        L_0x0085:
            r4 = 1
            if (r3 != 0) goto L_0x01dc
            if (r7 != 0) goto L_0x008f
            if (r8 != 0) goto L_0x008f
            goto L_0x01dc
        L_0x008f:
            r3 = -106(0xffffffffffffff96, float:NaN)
            if (r8 != r3) goto L_0x0097
            sf0.C13665i0.m12970c(r10, r9, r12)
            return
        L_0x0097:
            r3 = -217(0xffffffffffffff27, float:NaN)
            if (r8 != r3) goto L_0x00a3
            com.tencent.mm.modelsimple.a0$c r0 = sf0.C118276e.m166845a(r1)
            sf0.C13665i0.m12973f(r10, r0, r8)
            return
        L_0x00a3:
            r3 = -6
            if (r8 == r3) goto L_0x01a1
            r3 = -311(0xfffffffffffffec9, float:NaN)
            if (r8 == r3) goto L_0x01a1
            r3 = -310(0xfffffffffffffeca, float:NaN)
            if (r8 != r3) goto L_0x00b0
            goto L_0x01a1
        L_0x00b0:
            if (r7 != r2) goto L_0x0149
            r1 = -107(0xffffffffffffff95, float:NaN)
            if (r8 == r1) goto L_0x010d
            r1 = -75
            if (r8 == r1) goto L_0x0100
            r1 = -72
            if (r8 == r1) goto L_0x00f2
            r1 = -9
            r2 = 2131832276(0x7f112dd4, float:1.9297601E38)
            if (r8 == r1) goto L_0x00eb
            r1 = -1
            if (r8 == r1) goto L_0x00d0
            r0 = -4
            if (r8 == r0) goto L_0x00e4
            r0 = -3
            if (r8 == r0) goto L_0x00e4
            goto L_0x0149
        L_0x00d0:
            ob0.b0 r1 = f40.C86709a0.m107524d()
            int r1 = r1.mo123467m()
            if (r1 != r0) goto L_0x00e4
            r0 = 2131833496(0x7f113298, float:1.9300076E38)
            r1 = 2131833495(0x7f113297, float:1.9300074E38)
            nj3.C76879j.m92738i(r10, r0, r1)
            goto L_0x0107
        L_0x00e4:
            r0 = 2131825174(0x7f111216, float:1.9283197E38)
            nj3.C76879j.m92738i(r10, r0, r2)
            goto L_0x0107
        L_0x00eb:
            r0 = 2131832275(0x7f112dd3, float:1.92976E38)
            nj3.C76879j.m92738i(r10, r0, r2)
            goto L_0x0107
        L_0x00f2:
            androidx.appcompat.app.AppCompatActivity r0 = r18.getContext()
            r1 = 2131834619(0x7f1136fb, float:1.9302353E38)
            r2 = 2131821704(0x7f110488, float:1.9276159E38)
            nj3.C76879j.m92738i(r0, r1, r2)
            goto L_0x0107
        L_0x0100:
            androidx.appcompat.app.AppCompatActivity r0 = r18.getContext()
            sf0.C13665i0.m12971d(r0)
        L_0x0107:
            r0 = 1
            r12 = 701(0x2bd, float:9.82E-43)
            r13 = 252(0xfc, float:3.53E-43)
            goto L_0x0166
        L_0x010d:
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct r0 = r10.f344662j
            r0.f343856d = r4
            r1 = 11
            r0.f343857e = r1
            r0.mo86054n()
            r0 = 2131825566(0x7f11139e, float:1.9283992E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131834641(0x7f113711, float:1.9302398E38)
            java.lang.String r3 = r10.getString(r0)
            r0 = 2131832309(0x7f112df5, float:1.9297668E38)
            java.lang.String r4 = r10.getString(r0)
            com.tencent.mm.plugin.account.ui.x0 r5 = new com.tencent.mm.plugin.account.ui.x0
            r5.<init>(r10)
            com.tencent.mm.plugin.account.ui.y0 r2 = new com.tencent.mm.plugin.account.ui.y0
            r2.<init>(r10)
            java.lang.String r16 = ""
            r0 = r18
            r17 = r2
            r2 = r16
            r13 = 252(0xfc, float:3.53E-43)
            r12 = 701(0x2bd, float:9.82E-43)
            r6 = r17
            nj3.C76879j.m92707A(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0163
        L_0x0149:
            r12 = 701(0x2bd, float:9.82E-43)
            r13 = 252(0xfc, float:3.53E-43)
            java.lang.Class<om.f> r0 = p214om.C11502f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            om.f r0 = (p214om.C11502f) r0
            wc3.y r0 = r0.mo11461Sr()
            androidx.appcompat.app.AppCompatActivity r1 = r18.getContext()
            boolean r0 = r0.mo93163uP(r1, r7, r8, r9)
            if (r0 == 0) goto L_0x0165
        L_0x0163:
            r0 = 1
            goto L_0x0166
        L_0x0165:
            r0 = 0
        L_0x0166:
            if (r0 == 0) goto L_0x0169
            return
        L_0x0169:
            int r0 = r22.getType()
            if (r0 == r13) goto L_0x0175
            int r0 = r22.getType()
            if (r0 != r12) goto L_0x0182
        L_0x0175:
            ei.a r0 = p148ei.C7660a.m7782a(r21)
            if (r0 == 0) goto L_0x0182
            boolean r0 = r0.mo8792b(r10, r15, r15)
            if (r0 == 0) goto L_0x0182
            return
        L_0x0182:
            r0 = 2131830303(0x7f11261f, float:1.92936E38)
            java.lang.Object[] r1 = new java.lang.Object[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r4 = 1
            r1[r4] = r2
            java.lang.String r0 = r10.getString(r0, r1)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r10, (java.lang.CharSequence) r0, (int) r3)
            r0.show()
            return
        L_0x01a1:
            com.tencent.mm.plugin.account.ui.e r0 = r10.f344663n
            if (r0 != 0) goto L_0x01ac
            com.tencent.mm.plugin.account.ui.MMFBLoginUI$c r0 = new com.tencent.mm.plugin.account.ui.MMFBLoginUI$c
            r0.<init>()
            r10.f344663n = r0
        L_0x01ac:
            com.tencent.mm.plugin.account.ui.e r12 = r10.f344663n
            byte[] r3 = r1.mo174357m1()
            r12.f345146c = r11
            com.tencent.mm.ui.applet.SecurityImage r0 = r12.f345145b
            if (r0 != 0) goto L_0x01d5
            r1 = 2131834632(0x7f113708, float:1.930238E38)
            r2 = 0
            com.tencent.mm.plugin.account.ui.c r6 = new com.tencent.mm.plugin.account.ui.c
            r6.<init>(r12, r10)
            r7 = 0
            com.tencent.mm.plugin.account.ui.d r8 = new com.tencent.mm.plugin.account.ui.d
            r8.<init>(r12)
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            r0 = r18
            r9 = r12
            com.tencent.mm.ui.applet.SecurityImage r0 = com.tencent.p014mm.p136ui.applet.SecurityImage.C116047a.m163296a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.f345145b = r0
            goto L_0x01db
        L_0x01d5:
            java.lang.String r1 = ""
            r2 = 0
            r0.mo177230b(r2, r3, r1, r1)
        L_0x01db:
            return
        L_0x01dc:
            f40.C86718e.m107546E()
            com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct r0 = r10.f344662j
            r0.f343856d = r4
            r1 = 12
            r0.f343857e = r1
            r0.mo86054n()
            java.lang.String r0 = eb0.C75592q0.m90789s()
            sf0.C13665i0.m12968a(r10, r0)
            com.tencent.mm.plugin.account.ui.MMFBLoginUI$b r0 = new com.tencent.mm.plugin.account.ui.MMFBLoginUI$b
            r0.<init>()
            r1 = 0
            sf0.C13665i0.m12969b(r10, r0, r1, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.MMFBLoginUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
