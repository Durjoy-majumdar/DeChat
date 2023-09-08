package n63;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import f40.C86709a0;
import ie3.C76324c;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import nj3.C76879j;
import o63.C47331b;
import ob0.C11385n;
import ob0.C117747y;
import p287zz.C79441d;
import te3.C50244lc3;
import ub3.C78144b;

/* renamed from: n63.b */
public class C76831b implements C11385n, C79441d {

    /* renamed from: d */
    public Context f224652d;

    /* renamed from: e */
    public boolean f224653e = false;

    /* renamed from: f */
    public Dialog f224654f = null;

    /* renamed from: g */
    public C117747y f224655g;

    /* renamed from: n63.b$a */
    public class C76832a implements DialogInterface.OnCancelListener {
        public C76832a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Dialog dialog = C76831b.this.f224654f;
            if (dialog != null && dialog.isShowing()) {
                C76831b.this.f224654f.dismiss();
            }
        }
    }

    /* renamed from: n63.b$b */
    public class C76833b implements DialogInterface.OnClickListener {
        public C76833b(C76831b bVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105918d("MicroMsg.HKOfflineLogic", "onDialogClick() ");
        }
    }

    /* renamed from: n63.b$c */
    public class C76834c implements DialogInterface.OnClickListener {
        public C76834c(C76831b bVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105918d("MicroMsg.HKOfflineLogic", "onDialogClick() ");
        }
    }

    /* renamed from: a */
    public final void mo107098a(boolean z) {
        if (!z && this.f224654f == null) {
            Context context = this.f224652d;
            this.f224654f = C76879j.m92721O(context, (String) null, 3, C0966R.style.f8510l3, context.getString(C0966R.string.gas), true, true, new C76832a());
        }
        C86709a0.m107528h();
        this.f224655g = new C47331b(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue());
        C86709a0.m107524d().mo123460f(this.f224655g);
        this.f224653e = z;
    }

    /* renamed from: b */
    public final boolean mo107099b() {
        String topActivityName2 = Util.getTopActivityName2(this.f224652d);
        if (Util.isNullOrNil(topActivityName2) || !topActivityName2.equals("LauncherUI")) {
            Log.m105919d("MicroMsg.HKOfflineLogic", "LauncherUI is not on ActivityTask Top：%s", topActivityName2);
            return false;
        }
        Log.m105918d("MicroMsg.HKOfflineLogic", "LauncherUI is on ActivityTask Top ");
        return true;
    }

    /* renamed from: c */
    public void mo107100c(Context context) {
        this.f224652d = context;
        this.f224654f = null;
        this.f224653e = false;
        this.f224655g = null;
        C86709a0.m107524d().mo123455a(2540, this);
        Log.m105918d("MicroMsg.HKOfflineLogic", "OfflineH5 getConfig");
        C50244lc3 lc32 = new C50244lc3();
        String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, (Object) null);
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.HKOfflineLogic", "OfflineH5 get PayIBGQuickGetOverseaWalletConfig failed");
        } else {
            try {
                lc32.parseFrom(str.getBytes(StandardCharsets.ISO_8859_1));
                Log.m105918d("MicroMsg.HKOfflineLogic", "OfflineH5 getConfig success");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.HKOfflineLogic", "OfflineH5 parse PayIBGQuickGetOverseaWalletConfig fail, " + e.getLocalizedMessage());
            }
        }
        if (Util.isNullOrNil(lc32.f137303f)) {
            Log.m105924i("MicroMsg.HKOfflineLogic", "hk OfflineH5 has no cache");
            mo107098a(false);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j = currentTimeMillis - lc32.f137305h;
        Log.m105925i("MicroMsg.HKOfflineLogic", "hk currentTime ：%s ,lastTime：%s,internalTime ：%s", Long.valueOf(currentTimeMillis), Long.valueOf(lc32.f137305h), Long.valueOf(j));
        if (j <= 0 || j >= ((long) lc32.f137304g)) {
            Log.m105924i("MicroMsg.HKOfflineLogic", "hk OfflineH5 is expired");
            mo107098a(false);
            return;
        }
        Log.m105925i("MicroMsg.HKOfflineLogic", "hk OfflineH5 dont expired，url：%s", lc32.f137303f);
        if (!Util.isNullOrNil(lc32.f137303f)) {
            if (lc32.f137303f.equals("wxpay://bizmall/hk_offlinepay")) {
                Log.m105924i("MicroMsg.HKOfflineLogic", "goto native hk offlinepay");
                ((C76324c) C86312j.m106911c(C76324c.class)).startHKOfflinePrePay(this.f224652d, 2);
            } else {
                C75228t.m90221N(this.f224652d, lc32.f137303f, false);
            }
        }
        mo107098a(true);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.HKOfflineLogic", "on Scene End：errType %s , errCode：%s，errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        Dialog dialog = this.f224654f;
        if (dialog != null && dialog.isShowing()) {
            this.f224654f.dismiss();
            this.f224654f = null;
        }
        if ((yVar2 instanceof C47331b) && yVar2.equals(this.f224655g)) {
            if (i == 0 && i2 == 0) {
                C50244lc3 lc32 = ((C47331b) yVar2).f127020f;
                if (lc32 == null) {
                    lc32 = new C50244lc3();
                }
                if (lc32.f137301d == 0) {
                    Log.m105925i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd ok，pay_wallet_wxapp_h5_url：%s, cache_time：%s", lc32.f137303f, Integer.valueOf(lc32.f137304g));
                    if (!this.f224653e && !Util.isNullOrNil(lc32.f137303f)) {
                        if (lc32.f137303f.equals("wxpay://bizmall/hk_offlinepay")) {
                            Log.m105924i("MicroMsg.HKOfflineLogic", "goto native hk offlinepay");
                            ((C76324c) C86312j.m106911c(C76324c.class)).startHKOfflinePrePay(this.f224652d, 2);
                        } else {
                            Log.m105924i("MicroMsg.HKOfflineLogic", "on Scene End jump h5 ");
                            C75228t.m90221N(this.f224652d, lc32.f137303f, false);
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    lc32.f137305h = currentTimeMillis;
                    Log.m105919d("MicroMsg.HKOfflineLogic", "on Scene End currentTime ：%s ", Long.valueOf(currentTimeMillis));
                    Log.m105918d("MicroMsg.HKOfflineLogic", "OfflineH5 setConfig");
                    try {
                        str2 = new String(lc32.toByteArray(), StandardCharsets.ISO_8859_1);
                        try {
                            Log.m105918d("MicroMsg.HKOfflineLogic", "OfflineH5 setConfig success");
                        } catch (IOException e) {
                            e = e;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        str2 = " ";
                        Log.m105920e("MicroMsg.HKOfflineLogic", "save config exp, " + e.getLocalizedMessage());
                        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, str2);
                        C86709a0.m107524d().mo123470p(2540, this);
                        this.f224655g = null;
                    }
                    ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WX_PAY_HK_WALLET_ADD_CONFIG_STRING_SYNC, str2);
                } else {
                    Log.m105924i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd failed show dialog ");
                    if (!this.f224653e && mo107099b()) {
                        Context context = this.f224652d;
                        C76879j.m92711E(context, lc32.f137302e, "", context.getString(C0966R.string.lkg), false, new C76833b(this));
                    }
                }
            } else {
                Log.m105924i("MicroMsg.HKOfflineLogic", "NetScenePayIBGQuickGetOverseaWallet on SceneEnd faile show error dialog ");
                if (!this.f224653e && mo107099b()) {
                    Context context2 = this.f224652d;
                    C76879j.m92711E(context2, str, "", context2.getString(C0966R.string.lkg), false, new C76834c(this));
                }
            }
        }
        C86709a0.m107524d().mo123470p(2540, this);
        this.f224655g = null;
    }
}
