package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.p019aa.model.cgi.NetSceneNewAAQueryPFInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import te3.C77943hl3;
import te3.C77970o;

/* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI */
public class LaunchAABeforeUI extends AppCompatActivity {

    /* renamed from: d */
    public Dialog f196031d;

    /* renamed from: e */
    public String f196032e;

    /* renamed from: f */
    public String f196033f;

    /* renamed from: g */
    public C11385n f196034g = new C68192a();

    /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI$a */
    public class C68192a implements C11385n {

        /* renamed from: com.tencent.mm.plugin.aa.ui.LaunchAABeforeUI$a$a */
        public class C68193a implements DialogInterface.OnClickListener {
            public C68193a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LaunchAABeforeUI.m80615G7(LaunchAABeforeUI.this, true);
                LaunchAABeforeUI.this.finish();
            }
        }

        public C68192a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105924i("MicroMsg.Aa.LaunchAABeforeUI", "onSceneEnd() errType:" + i + " errCode:" + i2 + " errMsg:" + str + " netsceneType:" + yVar.getType());
            if (yVar instanceof NetSceneNewAAQueryPFInfo) {
                Dialog dialog = LaunchAABeforeUI.this.f196031d;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (i == 0 && i2 == 0) {
                    C77943hl3 hl32 = ((NetSceneNewAAQueryPFInfo) yVar).f195912s;
                    if (hl32 == null) {
                        hl32 = null;
                    }
                    Log.m105925i("MicroMsg.Aa.LaunchAABeforeUI", "NetSceneNewAAQueryPFInfo retcode:%s retmsg:%s", Integer.valueOf(hl32.f227578d), hl32.f227579e);
                    if (hl32.f227578d == 0) {
                        Intent intent = new Intent();
                        intent.putExtra("enter_scene", 6);
                        intent.putExtra("pfInfo", NetSceneNewAAQueryPFInfo.m80582r1(hl32));
                        intent.putExtra("pfOrderNo", LaunchAABeforeUI.this.f196032e);
                        C77970o oVar = hl32.f227587p;
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_PAYER_NUM_INT, Integer.valueOf(oVar.f227894d));
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_RECEIVER_NUM_INT, Integer.valueOf(oVar.f227895e));
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_TOTAL_USER_NUM_INT, Integer.valueOf(oVar.f227896f));
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_TOTAL_AMOUNT_LONG, Long.valueOf(oVar.f227897g));
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_AA_MAX_PER_AMOUNT_LONG, Long.valueOf(oVar.f227898h));
                        if (BuildInfo.DEBUG) {
                            Log.m105919d("MicroMsg.Aa.LaunchAABeforeUI", "NetSceneNewAAQueryPFInfo PfInfoParcel:%s", NetSceneNewAAQueryPFInfo.m80582r1(hl32));
                        }
                        C88144b.m109791i(LaunchAABeforeUI.this, "aa", ".ui.LaunchAAUI", intent, (Bundle) null);
                        LaunchAABeforeUI.m80615G7(LaunchAABeforeUI.this, false);
                        LaunchAABeforeUI.this.finish();
                        return;
                    }
                    C76879j.m92754y(LaunchAABeforeUI.this, Util.isNullOrNil(hl32.f227579e) ? LaunchAABeforeUI.this.getString(C0966R.string.f360940g43) : hl32.f227579e, "", LaunchAABeforeUI.this.getString(C0966R.string.g47), new C68193a());
                    return;
                }
                LaunchAABeforeUI.m80615G7(LaunchAABeforeUI.this, false);
                C76879j.m92726T(LaunchAABeforeUI.this, str);
                LaunchAABeforeUI.this.finish();
            }
        }
    }

    /* renamed from: G7 */
    public static void m80615G7(LaunchAABeforeUI launchAABeforeUI, boolean z) {
        launchAABeforeUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("cancel", z);
        launchAABeforeUI.setResult(-1, intent);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public Resources getResources() {
        return MMApplicationContext.getResources();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        C85875k4.m106187i0(this, getResources().getColor(C0966R.color.ahf));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1809, this.f196034g);
        this.f196032e = getIntent().getStringExtra("pfOrderNo");
        this.f196033f = getIntent().getStringExtra("appid");
        this.f196031d = C76879j.m92721O(this, (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gas), true, true, new C68281e0(this));
        NetSceneNewAAQueryPFInfo netSceneNewAAQueryPFInfo = new NetSceneNewAAQueryPFInfo(this.f196032e, this.f196033f);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(netSceneNewAAQueryPFInfo);
        setResult(0);
    }

    public void onDestroy() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1809, this.f196034g);
        super.onDestroy();
    }
}
