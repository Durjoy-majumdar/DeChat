package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.autogen.events.UpdateGestureProtectInfoEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C116734h6;
import eb0.C75592q0;
import eb0.C7624i3;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ru0.C118231b;
import te3.C50789p62;
import te3.C77984q62;
import te3.h85;
import te3.xo4;

/* renamed from: com.tencent.mm.modelsimple.w */
public class C68143w extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f195824d;

    /* renamed from: e */
    public String f195825e;

    /* renamed from: f */
    public C11385n f195826f;

    public C68143w(String str) {
        this.f195825e = str;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50789p62();
        bVar.f127067b = new C77984q62();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getprofile";
        bVar.f127069d = 302;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f195824d = a;
        ((C50789p62) a.f127055a.f127080a).f139608d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (Util.isNullOrNil(this.f195825e)) {
            Log.m105920e("MicroMsg.NetSceneGetProfile", "null or empty username");
            return -1;
        }
        this.f195826f = nVar;
        return dispatch(gVar, this.f195824d, this);
    }

    public int getType() {
        return 302;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        h85 h85;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105918d("MicroMsg.NetSceneGetProfile", "get profile ret: errType=" + i4 + " errCode=" + i5 + " errMsg=" + str2);
        if (i4 == 0 && i5 == 0) {
            C77984q62 q622 = (C77984q62) this.f195824d.f127056b.f127083a;
            UpdateGestureProtectInfoEvent updateGestureProtectInfoEvent = new UpdateGestureProtectInfoEvent();
            updateGestureProtectInfoEvent.f193985d.f193986a = q622.f228110e.f228468E;
            updateGestureProtectInfoEvent.publish();
            if (C75592q0.m90789s().equals(q622.f228109d.f228078e.f141175d) && !Util.isNullOrNil(q622.f228110e.f228507p)) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SELFINFO_SMALLIMGURL_STRING, q622.f228110e.f228507p);
            }
            boolean z = true;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_ANONYMOUS_SWITCH_BOOLEAN_SYNC, Boolean.valueOf((q622.f228110e.f228480Q0 & 8) > 0));
            Log.m105925i("MicroMsg.NetSceneGetProfile", "summersafecdn resp.UserInfo.PluginSwitch[%d], GrayscaleFlag[%d]", Integer.valueOf(q622.f228109d.f228063E), Integer.valueOf(q622.f228110e.f228513u));
            C86709a0.m107535s().mo121142i().mo119676J(64, Integer.valueOf(q622.f228110e.f228512t));
            C86709a0.m107535s().mo121142i().mo119676J(144385, Integer.valueOf(q622.f228110e.f228513u));
            C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(q622.f228109d.f228063E));
            Log.m105925i("MicroMsg.NetSceneGetProfile", "getprofile PluginSwitch: %d", Integer.valueOf(q622.f228109d.f228063E));
            C118231b.f353395e = q622.f228109d.f228063E;
            C86709a0.m107535s().mo121142i().mo119676J(339975, Integer.valueOf(q622.f228110e.f228470G));
            Log.m105925i("MicroMsg.NetSceneGetProfile", "hy: getprofile pay wallet type: %d", Integer.valueOf(q622.f228110e.f228470G));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, Integer.valueOf(q622.f228110e.f228472I));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SMCRYPTO_FLAG_TYPE_INT_SYNC, Integer.valueOf(q622.f228110e.f228486T0));
            Log.m105925i("MicroMsg.NetSceneGetProfile", "getprofile smcrypto flag: %d", Integer.valueOf(q622.f228110e.f228486T0));
            C116734h6.m164657m(q622.f228110e.f228472I);
            Log.m105925i("MicroMsg.NetSceneGetProfile", "hy: getprofile pay wallet type: %d %d", Integer.valueOf(q622.f228110e.f228470G), Integer.valueOf(q622.f228110e.f228472I));
            C86709a0.m107535s().mo121142i().mo119676J(208903, q622.f228110e.f228514v);
            C86709a0.m107535s().mo121142i().mo119676J(274433, q622.f228110e.f228516x);
            C86709a0.m107535s().mo121142i().mo119676J(274434, q622.f228110e.f228515w);
            C86709a0.m107535s().mo121142i().mo119676J(274436, q622.f228110e.f228518y);
            MultiProcessMMKV.getMMKV("mmkv_crossprocess_infos").encode("mmkv_key_user_reg_ic", q622.f228110e.f228518y);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PROFILE_WEIDIANINFO_STRING, Util.nullAs(q622.f228110e.f228471H, ""));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_F2F_RING_TONE_STRING, q622.f228110e.f228474K);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_USER_STATUS_INT_SYNC, Integer.valueOf(q622.f228110e.f228475L));
            Log.m105925i("MicroMsg.NetSceneGetProfile", "userinfoExt.UserStatus:%s", Integer.valueOf(q622.f228110e.f228475L));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_BIND_XMAIL_STRING_SYNC, q622.f228110e.f228481R);
            Log.m105925i("MicroMsg.NetSceneGetProfile", "userinfoExt.BindXMail:%s", q622.f228110e.f228481R);
            Log.m105919d("MicroMsg.NetSceneGetProfile", "weidianInfo:%s", q622.f228110e.f228471H);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC, q622.f228110e.f228483S);
            Log.m105925i("MicroMsg.NetSceneGetProfile", "userinfoExt.PatSuffix:%s", q622.f228110e.f228483S);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, Integer.valueOf(q622.f228110e.f228485T));
            Log.m105925i("MicroMsg.NetSceneGetProfile", "userinfoExt.PatSuffixVersion:%d", Integer.valueOf(q622.f228110e.f228485T));
            C86709a0.m107535s().mo121142i().mo119676J(147458, Long.valueOf(q622.f228110e.f228492W0));
            Log.m105925i("MicroMsg.NetSceneGetProfile", "userinfoExt.DiscoveryPageCtrlFlag:%s", Long.valueOf(q622.f228110e.f228492W0));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, Boolean.valueOf((q622.f228110e.f228473J & 1099511627776L) != 0));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, Integer.valueOf(q622.f228110e.f228487U));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, Integer.valueOf(q622.f228110e.f228489V));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, Integer.valueOf(q622.f228110e.f228491W));
            boolean z2 = (q622.f228110e.f228473J & 18014398509481984L) != 0;
            String str3 = "";
            Log.m105925i("MicroMsg.NetSceneGetProfile", "dancy test isCareMode:%s, value:%s, ExtStatus:%s", Boolean.valueOf(z2), Long.valueOf(18014398509481984L & q622.f228110e.f228473J), Long.valueOf(q622.f228110e.f228473J));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, Boolean.valueOf(z2));
            if ((q622.f228110e.f228473J & 67108864) == 0) {
                z = false;
            }
            if (z) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_VOIP_CLOSE_SOUND_BOOLEAN_SYNC, Boolean.valueOf(z));
            }
            C7624i3 i3Var = C7624i3.f25910c;
            i3Var.mo8756d("last_login_use_voice", q622.f228109d.f228063E + str3);
            Log.m105924i("MicroMsg.NetSceneGetProfile", "handling xagreement configs");
            xo4 xo4 = q622.f228110e;
            if (!(xo4 == null || (h85 = xo4.f228493X) == null)) {
                C116734h6.m164656l(h85.f134509d, h85.f134510e);
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ACCOUNT_SALT_STRING_SYNC, q622.f228110e.f228519y0);
            ((C68142q0) MvvmEventCenter.getEvent(C68142q0.class)).publish(q622);
        }
        this.f195826f.onSceneEnd(i4, i5, str2, this);
    }
}
