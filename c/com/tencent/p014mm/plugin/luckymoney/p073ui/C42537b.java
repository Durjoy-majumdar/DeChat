package com.tencent.p014mm.plugin.luckymoney.p073ui;

import b63.C67203r0;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KUserService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import p281yz.C79173v;
import te3.iy4;
import ub3.C78144b;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.b */
public class C42537b implements KUserService {
    public String city() {
        iy4 iy4 = new iy4();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            iy4.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
            return iy4.f135761g;
        } catch (Exception e) {
            Log.m105928w("KindaUserInfoServiceImpl", "parse cacheString exp, " + e.getLocalizedMessage());
            return "";
        }
    }

    public long localBalance() {
        return ((Long) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
    }

    public String province() {
        iy4 iy4 = new iy4();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            iy4.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
            return iy4.f135760f;
        } catch (Exception e) {
            Log.m105928w("KindaUserInfoServiceImpl", "parse cacheString exp, " + e.getLocalizedMessage());
            return "";
        }
    }

    public void updateBalance(long j) {
        Class cls = C79173v.class;
        Log.m105925i("KindaUserInfoServiceImpl", "wallet balance: %s", Long.valueOf(j));
        C67203r0 r = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91336r();
        r.field_wallet_balance = j;
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC, Long.valueOf(r.field_wallet_balance));
        ((C79173v) C86312j.m106911c(cls)).Ex0().mo91318H(r);
    }

    public void updateLqtBalance(long j) {
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_NEW_LQT_LONG_SYNC, Long.valueOf(j));
    }

    public void updateUserInfo(ITransmitKvData iTransmitKvData) {
        Log.m105924i("KindaUserInfoService", "updateUserInfo");
    }
}
