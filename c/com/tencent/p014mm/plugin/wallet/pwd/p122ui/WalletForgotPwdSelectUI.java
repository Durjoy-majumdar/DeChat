package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RequestFaceVerifyForPayEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI */
public class WalletForgotPwdSelectUI extends WalletBaseUI {

    /* renamed from: f */
    public static final /* synthetic */ int f208796f = 0;

    /* renamed from: d */
    public View f208797d;

    /* renamed from: e */
    public View f208798e;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI$a */
    public class C71983a extends C7089c0 {
        public C71983a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletForgotPwdSelectUI walletForgotPwdSelectUI = WalletForgotPwdSelectUI.this;
            int i = WalletForgotPwdSelectUI.f208796f;
            if (walletForgotPwdSelectUI.getProcess() != null) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(15774, Integer.valueOf(walletForgotPwdSelectUI.getProcess().f232423c.getInt("key_forgot_scene", 1)), 2);
                nVar.idkeyStat(917, 33, 1, false);
            }
            Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "gotToFaceCheck");
            RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new RequestFaceVerifyForPayEvent();
            RequestFaceVerifyForPayEvent.C1117a aVar = requestFaceVerifyForPayEvent.f9431d;
            aVar.f9441i = walletForgotPwdSelectUI;
            aVar.f9433a = walletForgotPwdSelectUI.getInput().getInt("key_face_action_scene");
            requestFaceVerifyForPayEvent.f9431d.f9434b = walletForgotPwdSelectUI.getInput().getString("key_face_action_package");
            requestFaceVerifyForPayEvent.f9431d.f9435c = walletForgotPwdSelectUI.getInput().getString("key_face_action_package_sign");
            requestFaceVerifyForPayEvent.f9431d.f9436d = walletForgotPwdSelectUI.getString(C0966R.string.kte);
            requestFaceVerifyForPayEvent.f9431d.f9440h = 233;
            requestFaceVerifyForPayEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI$b */
    public class C71984b extends C7089c0 {
        public C71984b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            if (WalletForgotPwdSelectUI.this.getProcess() != null) {
                C115669n.INSTANCE.mo160131h(15774, Integer.valueOf(WalletForgotPwdSelectUI.this.getProcess().f232423c.getInt("key_forgot_scene", 1)), 3);
            }
            WalletForgotPwdSelectUI walletForgotPwdSelectUI = WalletForgotPwdSelectUI.this;
            int i = WalletForgotPwdSelectUI.f208796f;
            walletForgotPwdSelectUI.mo99196H7();
        }
    }

    /* renamed from: H7 */
    public final void mo99196H7() {
        Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "goToBankcard");
        getInput().putBoolean("key_select_bank_card", true);
        getProcess().mo91264o(this, 0, getInput());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cer;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i2;
        Log.m105925i("MicroMsg.WalletForgotPwdSelectUI", "onActivityResult, requestCode: %s, resultCode: %s, data: %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        Intent intent2 = intent == null ? new Intent() : intent;
        int intExtra = intent2.getIntExtra("err_code", 0);
        int intExtra2 = intent2.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int intExtra3 = intent2.getIntExtra("countFace", 0);
        long longExtra = intent2.getLongExtra("totalTime", 0);
        int intExtra4 = intent2.getIntExtra("err_type", 6);
        Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "errCode： " + intExtra);
        Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "scene： " + intExtra2);
        Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "countFace： " + intExtra3);
        Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "totalTime： " + longExtra);
        Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "errorType： " + intExtra4);
        if (i == 233) {
            if (i3 == -1) {
                Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "resultCode：RESULT_OK");
                if (intent2.getExtras() != null) {
                    String string = intent2.getExtras().getString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
                    if (getProcess() != null && !Util.isNullOrNil(string)) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.mo160131h(15774, Integer.valueOf(getProcess().f232423c.getInt("key_forgot_scene", 1)), 4);
                        nVar.mo160131h(15711, Integer.valueOf(intExtra2), 0, Integer.valueOf(intExtra3), Long.valueOf(longExtra), 1, 0, Integer.valueOf(intExtra));
                    }
                    getInput().putString("key_face_action_result_token", string);
                    getInput().putBoolean("key_is_set_pwd_after_face_action", true);
                    getProcess().mo91264o(this, 0, getInput());
                    finish();
                    return;
                }
            } else {
                if (intent2.getExtras() != null) {
                    String string2 = intent2.getExtras().getString("click_other_verify_btn");
                    boolean z = !Util.isNullOrNil(string2) && string2.equalsIgnoreCase("yes");
                    Log.m105925i("MicroMsg.WalletForgotPwdSelectUI", "isClickOtherVerify: %s", string2);
                    if (z) {
                        Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "check face failed, click other verify");
                        if (getProcess() != null) {
                            C115669n nVar2 = C115669n.INSTANCE;
                            nVar2.mo160131h(15774, Integer.valueOf(getProcess().f232423c.getInt("key_forgot_scene", 1)), 5);
                            nVar2.mo160131h(15711, Integer.valueOf(intExtra2), 3, Integer.valueOf(intExtra3), Long.valueOf(longExtra), 1, Integer.valueOf(intExtra4), Integer.valueOf(intExtra));
                        }
                        mo99196H7();
                    }
                }
                if (i3 == 0) {
                    Log.m105924i("MicroMsg.WalletForgotPwdSelectUI", "resultCode：RESULT_CANCELED");
                    if (getProcess() != null) {
                        C115669n nVar3 = C115669n.INSTANCE;
                        nVar3.mo160131h(15774, Integer.valueOf(getProcess().f232423c.getInt("key_forgot_scene", 1)), 6);
                        nVar3.mo160131h(15711, Integer.valueOf(intExtra2), 2, Integer.valueOf(intExtra3), Long.valueOf(longExtra), 1, 1, Integer.valueOf(intExtra));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        setMMTitleVisibility(8);
        this.f208797d = findViewById(C0966R.C0970id.cp7);
        this.f208798e = findViewById(C0966R.C0970id.a6s);
        this.f208797d.setOnClickListener(new C71983a());
        this.f208798e.setOnClickListener(new C71984b());
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
