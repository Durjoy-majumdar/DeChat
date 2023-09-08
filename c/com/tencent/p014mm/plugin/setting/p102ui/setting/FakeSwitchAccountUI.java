package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.setting.model.SwitchAccountModel;
import com.tencent.p014mm.plugin.setting.p102ui.widget.SwitchAccountGridView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.SystemProperty;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k20.C9556a;
import kg3.C76577a;
import nj3.C88989a;
import nj3.C88990b;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI */
public class FakeSwitchAccountUI extends MMActivity {

    /* renamed from: p */
    public static final /* synthetic */ int f248940p = 0;

    /* renamed from: d */
    public SwitchAccountGridView f248941d;

    /* renamed from: e */
    public TextView f248942e;

    /* renamed from: f */
    public String f248943f;

    /* renamed from: g */
    public Map<String, SwitchAccountModel> f248944g = new HashMap();

    /* renamed from: h */
    public MTimerHandler f248945h;

    /* renamed from: i */
    public int f248946i;

    /* renamed from: j */
    public String f248947j;

    /* renamed from: n */
    public int f248948n;

    /* renamed from: o */
    public float f248949o;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI$a */
    public class C85417a implements MTimerHandler.CallBack {
        public C85417a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTimerExpired() {
            /*
                r8 = this;
                java.lang.String r0 = "MicroMsg.FakeSwitchAccountUI"
                com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI r1 = com.tencent.p014mm.plugin.setting.p102ui.setting.FakeSwitchAccountUI.this
                int r2 = com.tencent.p014mm.plugin.setting.p102ui.setting.FakeSwitchAccountUI.f248940p
                java.lang.String r2 = "activity"
                java.lang.Object r1 = r1.getSystemService(r2)
                android.app.ActivityManager r1 = (android.app.ActivityManager) r1
                r2 = 0
                r3 = 1
                r4 = 2
                java.util.List r1 = r1.getRunningAppProcesses()     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
            L_0x0019:
                boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                if (r5 == 0) goto L_0x007b
                java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                java.lang.String r6 = r5.processName     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getApplicationId()     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                if (r6 == 0) goto L_0x0019
                java.lang.String r1 = "process %s, %s"
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                java.lang.String r7 = r5.processName     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                r6[r2] = r7     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                int r7 = r5.pid     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                r6[r3] = r7     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r6)     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                int r1 = r5.pid     // Catch:{ Exception -> 0x0062, Error -> 0x0048 }
                goto L_0x007c
            L_0x0048:
                r1 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "isMMProcessExist Error: "
                r5.append(r6)
                java.lang.String r1 = r1.toString()
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                goto L_0x007b
            L_0x0062:
                r1 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "isMMProcessExist Exception: "
                r5.append(r6)
                java.lang.String r1 = r1.toString()
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x007b:
                r1 = 0
            L_0x007c:
                java.lang.Object[] r4 = new java.lang.Object[r4]
                com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI r5 = com.tencent.p014mm.plugin.setting.p102ui.setting.FakeSwitchAccountUI.this
                int r5 = r5.f248946i
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r2] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                r4[r3] = r5
                java.lang.String r5 = "oldPid %d, mm pid %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r4)
                com.tencent.mm.plugin.setting.ui.setting.FakeSwitchAccountUI r0 = com.tencent.p014mm.plugin.setting.p102ui.setting.FakeSwitchAccountUI.this
                int r4 = r0.f248946i
                if (r4 == 0) goto L_0x00aa
                if (r1 == 0) goto L_0x00aa
                if (r4 == r1) goto L_0x00aa
                int r1 = r0.f248948n
                if (r1 >= r3) goto L_0x00a6
                int r1 = r1 + r3
                r0.f248948n = r1
                return r3
            L_0x00a6:
                com.tencent.p014mm.plugin.setting.p102ui.setting.FakeSwitchAccountUI.m105425H7(r0)
                return r2
            L_0x00aa:
                int r1 = r0.f248948n
                int r1 = r1 + r3
                r0.f248948n = r1
                r4 = 20
                if (r1 > r4) goto L_0x00b4
                return r3
            L_0x00b4:
                com.tencent.p014mm.plugin.setting.p102ui.setting.FakeSwitchAccountUI.m105425H7(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.FakeSwitchAccountUI.C85417a.onTimerExpired():boolean");
        }
    }

    /* renamed from: H7 */
    public static void m105425H7(FakeSwitchAccountUI fakeSwitchAccountUI) {
        fakeSwitchAccountUI.getClass();
        Log.m105924i("MicroMsg.FakeSwitchAccountUI", "jump to launcher");
        fakeSwitchAccountUI.f248945h.stopTimer();
        try {
            Bitmap bitmapFromView = BitmapUtil.getBitmapFromView(fakeSwitchAccountUI.getBodyView());
            String str = C74928u.C30867e.f82897a;
            C86013q1.m106447h(str);
            if (bitmapFromView != null) {
                BitmapUtil.saveBitmapToImage(bitmapFromView, 80, Bitmap.CompressFormat.JPEG, str, true);
            } else {
                Log.m105920e("MicroMsg.FakeSwitchAccountUI", "getBitmap from AccountGrid null!");
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FakeSwitchAccountUI", "getBitmap from AccountGrid failed! %s", e.getMessage());
        }
        Intent intent = new Intent();
        intent.setClassName(fakeSwitchAccountUI, "com.tencent.mm.ui.LauncherUI");
        intent.addFlags(268468224);
        intent.putExtra("LauncherUI.jump_switch_account", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(fakeSwitchAccountUI, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/FakeSwitchAccountUI", "jumpToLauncher", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fakeSwitchAccountUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(fakeSwitchAccountUI, "com/tencent/mm/plugin/setting/ui/setting/FakeSwitchAccountUI", "jumpToLauncher", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fakeSwitchAccountUI.finish();
        C88990b.m111197f(fakeSwitchAccountUI);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxx;
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.aaz));
        setBackBtnVisible(false);
        Log.m105924i("MicroMsg.FakeSwitchAccountUI", "FakeSwitchAccount onCreate");
        this.f248942e = (TextView) findViewById(C0966R.C0970id.kat);
        SwitchAccountGridView switchAccountGridView = (SwitchAccountGridView) findViewById(C0966R.C0970id.kar);
        this.f248941d = switchAccountGridView;
        switchAccountGridView.setClickable(false);
        this.f248946i = getIntent().getIntExtra("key_mm_process_pid", 0);
        this.f248943f = getIntent().getStringExtra("key_switch_from_wx_username");
        Log.m105925i("MicroMsg.FakeSwitchAccountUI", "title %s", getResources().getString(C0966R.string.izx));
        this.f248942e.setText(getResources().getString(C0966R.string.izx));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_switch_account_users");
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                SwitchAccountModel switchAccountModel = (SwitchAccountModel) it.next();
                ((HashMap) this.f248944g).put(switchAccountModel.f248934d, switchAccountModel);
            }
        }
        Log.m105925i("MicroMsg.FakeSwitchAccountUI", "account count %d", Integer.valueOf(((HashMap) this.f248944g).size()));
        this.f248941d.setUseSystemDecoder(true);
        this.f248941d.mo118800a(this.f248944g);
        this.f248941d.setLastLoginWxUsername(this.f248943f);
        this.f248941d.setLogoutState(true);
        this.f248941d.mo118801b();
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.myLooper(), (MTimerHandler.CallBack) new C85417a(), true);
        this.f248945h = mTimerHandler;
        mTimerHandler.startTimer(1500, 500);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.f248947j = getIntent().getStringExtra("key_langauage_code");
            this.f248949o = getIntent().getFloatExtra("key_font_scale_size", 1.0f);
            if (!Util.isNullOrNil(this.f248947j)) {
                Log.m105925i("MicroMsg.FakeSwitchAccountUI", "country %s", this.f248947j);
                SystemProperty.setProperty(LocaleUtil.LANGUAGE_KEY, this.f248947j);
                MMActivity.initLanguage(MMApplicationContext.getContext(), this.f248947j);
            }
            Log.m105925i("MicroMsg.FakeSwitchAccountUI", "fontScale %f", Float.valueOf(this.f248949o));
            C76577a.m92149E(MMApplicationContext.getContext(), this.f248949o);
            initView();
        } catch (Throwable unused) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.FakeSwitchAccountUI", "fake switch account destroy");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.FakeSwitchAccountUI", "fake switch account resume");
        Intent intent = new Intent("action_kill_mm_process");
        intent.setPackage(MMApplicationContext.getPackageName());
        sendBroadcast(intent);
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.FakeSwitchAccountUI", "fake switch account stop");
    }
}
