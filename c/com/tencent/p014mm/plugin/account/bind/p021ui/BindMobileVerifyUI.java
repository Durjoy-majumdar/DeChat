package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.pay.tool.APPluginConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.GetSafeDeviceNameEvent;
import com.tencent.p014mm.autogen.events.GetSafeDeviceTypeEvent;
import com.tencent.p014mm.autogen.events.UpdateLocalVerifySwitchEvent;
import com.tencent.p014mm.modelsimple.BindWordingContent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gg0.C75916o;
import hg0.C76170j0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import mg0.C76754b;
import nc0.C76850a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p214om.C11502f;
import p910lj.C76701a;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI */
public class BindMobileVerifyUI extends MMWizardActivity implements C11385n {

    /* renamed from: e */
    public EditText f196485e;

    /* renamed from: f */
    public String f196486f;

    /* renamed from: g */
    public C89779i0 f196487g = null;

    /* renamed from: h */
    public TextView f196488h;

    /* renamed from: i */
    public TextView f196489i;

    /* renamed from: j */
    public Button f196490j;

    /* renamed from: n */
    public Integer f196491n = 15;

    /* renamed from: o */
    public int f196492o;

    /* renamed from: p */
    public MTimerHandler f196493p;

    /* renamed from: q */
    public BindWordingContent f196494q;

    /* renamed from: r */
    public int f196495r;

    /* renamed from: s */
    public boolean f196496s;

    /* renamed from: t */
    public boolean f196497t;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI$a */
    public class C68381a implements InputFilter {
        public C68381a(BindMobileVerifyUI bindMobileVerifyUI) {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return Util.filterNumber(charSequence);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI$b */
    public class C68382b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI$b$a */
        public class C68383a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C76170j0 f196499d;

            public C68383a(C68382b bVar, C76170j0 j0Var) {
                this.f196499d = j0Var;
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d(this.f196499d);
            }
        }

        public C68382b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String trim = BindMobileVerifyUI.this.f196485e.getText().toString().trim();
            if (trim.equals("")) {
                C76879j.m92738i(BindMobileVerifyUI.this, C0966R.string.alf, C0966R.string.a3h);
                return true;
            }
            BindMobileVerifyUI.this.hideVKB();
            GetSafeDeviceNameEvent getSafeDeviceNameEvent = new GetSafeDeviceNameEvent();
            getSafeDeviceNameEvent.f193657d.f193659a = BindMobileVerifyUI.this;
            getSafeDeviceNameEvent.publish();
            String str = getSafeDeviceNameEvent.f193658e.f193660a;
            GetSafeDeviceTypeEvent getSafeDeviceTypeEvent = new GetSafeDeviceTypeEvent();
            getSafeDeviceTypeEvent.publish();
            C76170j0 j0Var = new C76170j0(BindMobileVerifyUI.this.f196486f, 2, trim, 0, "", str, getSafeDeviceTypeEvent.f78827d.f78828a);
            C86709a0.m107524d().mo123460f(j0Var);
            BindMobileVerifyUI bindMobileVerifyUI = BindMobileVerifyUI.this;
            bindMobileVerifyUI.f196487g = C76879j.m92723Q(bindMobileVerifyUI, bindMobileVerifyUI.getString(C0966R.string.a3h), BindMobileVerifyUI.this.getString(C0966R.string.al4), true, true, new C68383a(this, j0Var));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI$c */
    public class C68384c implements MenuItem.OnMenuItemClickListener {
        public C68384c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindMobileVerifyUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI$d */
    public class C68385d implements View.OnClickListener {
        public C68385d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindMobileVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindMobileVerifyUI.this.hideVKB();
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("bindmcontact_mobile", BindMobileVerifyUI.this.f196486f);
            bundle.putInt("voice_verify_type", 4);
            intent.putExtras(bundle);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93185r(BindMobileVerifyUI.this, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6575ir;
    }

    public void initView() {
        this.f196486f = (String) C86709a0.m107535s().mo121142i().mo119684e(4097, (Object) null);
        this.f196485e = (EditText) findViewById(C0966R.C0970id.a9x);
        this.f196488h = (TextView) findViewById(C0966R.C0970id.a9w);
        this.f196489i = (TextView) findViewById(C0966R.C0970id.a9r);
        Button button = (Button) findViewById(C0966R.C0970id.a9u);
        String str = this.f196486f;
        if (str == null || str.equals("")) {
            this.f196486f = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        }
        String str2 = this.f196486f;
        int i = 0;
        if (str2 != null && str2.length() > 0) {
            this.f196488h.setVisibility(0);
            this.f196488h.setText(this.f196486f);
        }
        this.f196485e.setFilters(new InputFilter[]{new C68381a(this)});
        this.f196490j = (Button) findViewById(C0966R.C0970id.a9z);
        button.setVisibility(8);
        this.f196489i.setText(getResources().getQuantityString(C0966R.plurals.f7240v, this.f196491n.intValue(), new Object[]{this.f196491n}));
        if (this.f196493p == null) {
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C75916o(this), true);
            this.f196493p = mTimerHandler;
            mTimerHandler.startTimer(1000, 1000);
        }
        addTextOptionMenu(0, getString(C0966R.string.f360089a13), new C68382b());
        setBackBtn(new C68384c());
        Button button2 = this.f196490j;
        if (!C76850a.m92635g(this.f196486f)) {
            i = 8;
        }
        button2.setVisibility(i);
        this.f196490j.setOnClickListener(new C68385d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(132, this);
        setMMTitle((int) C0966R.string.akr);
        this.f196494q = (BindWordingContent) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f196495r = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.f196496s = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
        this.f196497t = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
        this.f196492o = getIntent().getIntExtra("bind_scene", 0);
        initView();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(132, this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo7681K7(1);
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        Class cls = C11502f.class;
        Log.m105924i("MicroMsg.BindMobileVerifyUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        C76170j0 j0Var = (C76170j0) yVar;
        if (j0Var.mo106407f() == 2) {
            C89779i0 i0Var = this.f196487g;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f196487g = null;
            }
            boolean z2 = false;
            if (i != 0 || i2 != 0) {
                if (!((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(this, i, i2, str)) {
                    if (i2 == -214) {
                        C7660a a = C7660a.m7782a(str);
                        if (a != null) {
                            a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                        }
                    } else if (i2 == -43) {
                        C76701a.makeText((Context) this, (int) C0966R.string.aju, 0).show();
                    } else if (i2 != -41) {
                        switch (i2) {
                            case APPluginConstants.ERROR_IO_ObjectStreamException_NotSerializableException:
                                C76701a.makeText((Context) this, (int) C0966R.string.ajz, 0).show();
                                break;
                            case APPluginConstants.ERROR_IO_ObjectStreamException_NotActiveException:
                                C76701a.makeText((Context) this, (int) C0966R.string.ajv, 0).show();
                                break;
                            case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidObjectException:
                                C76701a.makeText((Context) this, (int) C0966R.string.ajx, 0).show();
                                break;
                            case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidClassException:
                                C76879j.m92742m(this, C0966R.string.al9, C0966R.string.ale, (DialogInterface.OnClickListener) null);
                                break;
                            case APPluginConstants.ERROR_IO_NoHttpResponseException:
                                C76879j.m92742m(this, C0966R.string.al_, C0966R.string.ale, (DialogInterface.OnClickListener) null);
                                break;
                            default:
                                z = false;
                                break;
                        }
                    } else {
                        C76701a.makeText((Context) this, (int) C0966R.string.ajw, 0).show();
                    }
                }
                z = true;
                if (!z) {
                    C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                }
            } else if (j0Var.mo106407f() == 2) {
                int i3 = this.f196492o;
                if (i3 == 1) {
                    if ((C75592q0.m90786p() & 16384) != 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new UpdateLocalVerifySwitchEvent();
                        UpdateLocalVerifySwitchEvent.C67808a aVar = updateLocalVerifySwitchEvent.f193987d;
                        aVar.f193988a = true;
                        aVar.f193989b = true;
                        updateLocalVerifySwitchEvent.publish();
                    }
                    mo7681K7(1);
                    Intent intent = new Intent();
                    intent.addFlags(67108864);
                    ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).getClass();
                    C88144b.m109791i(this, "account", ".security.ui.MySafeDeviceListUI", intent, (Bundle) null);
                } else if (i3 != 6) {
                    if (i3 == 0 || i3 == 3) {
                        ((C76754b) C86312j.m106911c(C76754b.class)).mo105747jG();
                    }
                    Intent intent2 = new Intent(this, BindMobileStatusUI.class);
                    intent2.putExtra("kstyle_bind_wording", this.f196494q);
                    intent2.putExtra("kstyle_bind_recommend_show", this.f196495r);
                    intent2.putExtra("Kfind_friend_by_mobile_flag", this.f196496s);
                    intent2.putExtra("Krecom_friends_by_mobile_flag", this.f196497t);
                    intent2.putExtra("bind_scene", this.f196492o);
                    MMWizardActivity.m7017L7(this, intent2);
                } else {
                    BindMobileStatusUI.m80724N7(this, !this.f196496s, !this.f196497t);
                    mo7679I7(-1);
                }
            }
        }
    }

    public void onStop() {
        MTimerHandler mTimerHandler = this.f196493p;
        if (mTimerHandler != null && !mTimerHandler.stopped()) {
            this.f196493p.stopTimer();
        }
        this.f196493p = null;
        super.onStop();
    }
}
