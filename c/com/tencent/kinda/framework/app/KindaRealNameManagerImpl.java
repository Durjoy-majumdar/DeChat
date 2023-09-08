package com.tencent.kinda.framework.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KindaRealNameManager;
import com.tencent.kinda.gen.VoidCallback;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WxPayPrivacyDutyResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess$$g;
import com.tencent.p014mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72428s1;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import yq3.C79143a;
import yq3.C79148e;

public class KindaRealNameManagerImpl implements KindaRealNameManager {
    public static final int REQUEST_CODE_AGREEMENTS = 911;
    private final String KEY_PROCESS_ID = "process_id";
    private final String TAG = "KindaRealNameManagerImpl";
    /* access modifiers changed from: private */
    public C72428s1 mPrivacyDutyHelper;
    private final IListener privacyDutyIListener = new IListener<WxPayPrivacyDutyResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 758220246;
        }

        public boolean callback(WxPayPrivacyDutyResultEvent wxPayPrivacyDutyResultEvent) {
            if (KindaRealNameManagerImpl.this.mPrivacyDutyHelper != null) {
                Log.m105925i("KindaRealNameManagerImpl", "privacyDutyIListener callback：%s", Boolean.valueOf(wxPayPrivacyDutyResultEvent.f107846d.f107847a));
                if (wxPayPrivacyDutyResultEvent.f107846d.f107847a) {
                    Intent intent = new Intent();
                    intent.putExtra("key_marketing_switch_closed", wxPayPrivacyDutyResultEvent.f107846d.f107848b);
                    KindaRealNameManagerImpl.this.mPrivacyDutyHelper.mo99789a(intent);
                } else {
                    C72428s1.C72429a aVar = KindaRealNameManagerImpl.this.mPrivacyDutyHelper.f210687g;
                    if (aVar != null) {
                        aVar.cancel();
                    }
                }
            }
            return true;
        }
    };

    /* access modifiers changed from: private */
    public void resetPrivacyDutyHelper() {
        C72428s1 s1Var = this.mPrivacyDutyHelper;
        if (s1Var != null) {
            s1Var.f210684d = false;
            s1Var.mo99790b();
            this.mPrivacyDutyHelper.getClass();
            this.mPrivacyDutyHelper = null;
            this.privacyDutyIListener.dead();
        }
    }

    public void callPrivacyDutyPageImpl(final VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        Log.m105924i("KindaRealNameManagerImpl", "callPrivacyDutyPageImpl");
        final Context context = KindaContext.get();
        if (!(context instanceof MMActivity)) {
            Log.m105921e("KindaRealNameManagerImpl", "Fail to start callPrivacyDutyPageImpl due to incompatible context(%s)", context.getClass().getName());
            ITransmitKvData create = ITransmitKvData.create();
            create.putBool("agree", false);
            voidITransmitKvDataCallback.call(create);
            return;
        }
        C72428s1 s1Var = new C72428s1();
        this.mPrivacyDutyHelper = s1Var;
        s1Var.f210686f = new C72428s1.C72430b() {
            public Context getContext() {
                return context;
            }

            public int getShowAgreenRequestCode() {
                return KindaRealNameManagerImpl.REQUEST_CODE_AGREEMENTS;
            }
        };
        this.mPrivacyDutyHelper.mo99791c();
        C72428s1 s1Var2 = this.mPrivacyDutyHelper;
        s1Var2.f210685e = true;
        s1Var2.mo99792d(new C72428s1.C72429a() {
            public void agree(Intent intent) {
                ITransmitKvData create = ITransmitKvData.create();
                create.putBool("agree", true);
                if (intent != null) {
                    create.putBool("marketingSwitchClosed", intent.getBooleanExtra("key_marketing_switch_closed", false));
                }
                voidITransmitKvDataCallback.call(create);
                KindaRealNameManagerImpl.this.resetPrivacyDutyHelper();
            }

            public void cancel() {
                ITransmitKvData create = ITransmitKvData.create();
                create.putBool("agree", false);
                voidITransmitKvDataCallback.call(create);
                KindaRealNameManagerImpl.this.resetPrivacyDutyHelper();
            }

            public void nothing() {
                ITransmitKvData create = ITransmitKvData.create();
                create.putBool("agree", true);
                voidITransmitKvDataCallback.call(create);
                KindaRealNameManagerImpl.this.resetPrivacyDutyHelper();
            }
        }, true);
        this.privacyDutyIListener.alive();
    }

    public void goToRealNameInputUIImpl(final VoidCallback voidCallback, final VoidCallback voidCallback2, ITransmitKvData iTransmitKvData) {
        Class<RealNameVerifyProcess> cls = RealNameVerifyProcess.class;
        Log.m105924i("KindaRealNameManagerImpl", "go to realname input ui");
        Context context = KindaContext.get();
        if (!(context instanceof MMActivity)) {
            Log.m105921e("KindaRealNameManagerImpl", "Fail to start go to realname input ui, due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        MMActivity mMActivity = (MMActivity) context;
        mMActivity.getIntent().putExtra("process_id", cls.hashCode());
        boolean bool = iTransmitKvData.getBool("marketingSwitchClosed");
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_marketing_switch_closed", bool);
        bundle.putString("start_activity_class", mMActivity.getClass().getName());
        bundle.putBoolean("directGotoInputUI", true);
        C79143a.m95771j(mMActivity, cls, bundle, (C79148e.C79149a) null);
        C79148e g = C79143a.m95768g(mMActivity);
        if (!(g instanceof RealNameVerifyProcess)) {
            Log.m105921e("KindaRealNameManagerImpl", "Fail to get correct wallet process in KindaRealNameManagerImpl, expect RealNameVerifyProcess got %s", g.getClass().getName());
            return;
        }
        ((RealNameVerifyProcess) g).f209025j = new RealNameVerifyProcess$$g() {
            public void run(Activity activity) {
                if (activity instanceof WcPayRealnameVerifySuccessUI) {
                    Log.m105924i("KindaRealNameManagerImpl", "process end");
                    voidCallback.call();
                    return;
                }
                voidCallback2.call();
            }
        };
    }

    public void reportRealnameAction(int i) {
        C75228t.m90245f0(i, 1, Util.nowSecond(), 1012);
    }

    public void startRealNameImpl(final VoidCallback voidCallback, final VoidCallback voidCallback2, ITransmitKvData iTransmitKvData) {
        Class<RealNameVerifyProcess> cls = RealNameVerifyProcess.class;
        Context context = KindaContext.get();
        if (!(context instanceof MMActivity)) {
            Log.m105921e("KindaRealNameManagerImpl", "Fail to start KindaRealNameManagerImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        MMActivity mMActivity = (MMActivity) context;
        mMActivity.getIntent().putExtra("process_id", cls.hashCode());
        int i = iTransmitKvData.getInt("reportScene");
        if (i == 0) {
            i = 2;
        }
        int i2 = iTransmitKvData.getInt("realname_entry_scene");
        Bundle bundle = new Bundle();
        bundle.putString("realname_verify_process_jump_activity", ".id_verify.SwitchRealnameVerifyModeUI");
        bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        bundle.putInt("real_name_verify_mode", 0);
        bundle.putInt("entry_scene", i);
        bundle.putBoolean("process_finish_stay_orgpage", false);
        bundle.putBoolean("is_from_new_cashier", true);
        bundle.putString("start_activity_class", mMActivity.getClass().getName());
        bundle.putInt("realname_entry_scene", i2);
        C79143a.m95771j(mMActivity, cls, bundle, (C79148e.C79149a) null);
        C79148e g = C79143a.m95768g(mMActivity);
        if (!(g instanceof RealNameVerifyProcess)) {
            Log.m105921e("KindaRealNameManagerImpl", "Fail to get correct wallet process in KindaRealNameManagerImpl, expect RealNameVerifyProcess got %s", g.getClass().getName());
            return;
        }
        ((RealNameVerifyProcess) g).f209025j = new RealNameVerifyProcess$$g() {
            public void run(Activity activity) {
                if (activity instanceof WcPayRealnameVerifySuccessUI) {
                    voidCallback.call();
                } else {
                    voidCallback2.call();
                }
            }
        };
    }
}
