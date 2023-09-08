package com.tencent.p014mm.plugin.flash.action;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;
import au1.C0222b;
import au1.C113079a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import f40.C86709a0;
import java.util.HashMap;
import kg3.C76577a;
import lb1.C117473c;
import lb1.C46838a;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p1081gi.C98120c;
import p1081gi.C98121d;
import te3.C49779i02;
import te3.C64542m02;
import zt1.C119133a;

/* renamed from: com.tencent.mm.plugin.flash.action.l */
public class C115446l extends C119133a {

    /* renamed from: B */
    public String f346086B;

    /* renamed from: C */
    public String f346087C;

    /* renamed from: D */
    public String f346088D = "";

    /* renamed from: E */
    public String f346089E;

    /* renamed from: F */
    public String f346090F;

    /* renamed from: G */
    public float f346091G;

    /* renamed from: H */
    public String f346092H;

    /* renamed from: I */
    public boolean f346093I = false;

    /* renamed from: J */
    public int f346094J = 0;

    /* renamed from: K */
    public long f346095K = 0;

    /* renamed from: L */
    public boolean f346096L = false;

    /* renamed from: a */
    public void mo14859a(TextView textView) {
        Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "init prepareVerifyTip:%s", this.f356808t);
        textView.setText(this.f356808t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e A[Catch:{ Exception -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048 A[Catch:{ Exception -> 0x0066 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14863b(android.widget.TextView r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.FaceFlashActionReflectManager"
            r1 = 0
            r2 = 1
            java.lang.String r3 = "fl_act_blink"
            boolean r3 = r10.equals(r3)     // Catch:{ Exception -> 0x0066 }
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "fl_act_open_mouth"
            boolean r3 = r10.equals(r3)     // Catch:{ Exception -> 0x0066 }
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "fl_act_shake_head"
            boolean r3 = r10.equals(r3)     // Catch:{ Exception -> 0x0066 }
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "fl_act_nod_head"
            boolean r3 = r10.equals(r3)     // Catch:{ Exception -> 0x0066 }
            if (r3 == 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0066 }
            long r5 = r8.f356805q     // Catch:{ Exception -> 0x0066 }
            long r3 = r3 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0039
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0066 }
            r8.f356805q = r3     // Catch:{ Exception -> 0x0066 }
            goto L_0x003b
        L_0x0039:
            r3 = 0
            goto L_0x003c
        L_0x003b:
            r3 = 1
        L_0x003c:
            if (r3 != 0) goto L_0x0048
            java.lang.String r9 = "updateTipText tip failed : %s"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0066 }
            r3[r1] = r10     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r3)     // Catch:{ Exception -> 0x0066 }
            return
        L_0x0048:
            android.content.Context r3 = r9.getContext()     // Catch:{ Exception -> 0x0066 }
            java.lang.String r3 = bu1.C0381a.m326c(r3, r10)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r4 = "updateTipText tip succ :%s， res:%s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0066 }
            r5[r1] = r3     // Catch:{ Exception -> 0x0066 }
            r5[r2] = r10     // Catch:{ Exception -> 0x0066 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r5)     // Catch:{ Exception -> 0x0066 }
            boolean r10 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0066 }
            if (r10 != 0) goto L_0x0074
            r9.setText(r3)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0074
        L_0x0066:
            r9 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r9 = r9.getMessage()
            r10[r1] = r9
            java.lang.String r9 = "updateTipText：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r9, r10)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.flash.action.C115446l.mo14863b(android.widget.TextView, java.lang.String):void");
    }

    /* renamed from: c */
    public void mo14864c(Intent intent, Activity activity) {
        super.mo14864c(intent, activity);
        this.f356796e = intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f346086B = intent.getStringExtra("package");
        this.f346087C = intent.getStringExtra("packageSign");
        this.f346093I = intent.getBooleanExtra("needContract", false);
        this.f346088D = intent.getStringExtra("otherVerifyTitle");
        Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "[%s]init data, packageName:%s scene：%s,packageSign:%s needSignContract:%s otherVerifyTitle:%s", C115446l.class.getSimpleName(), Integer.valueOf(this.f356796e), this.f346086B, this.f346087C, Boolean.valueOf(this.f346093I), this.f346088D);
        mo183843q(activity);
    }

    /* renamed from: e */
    public int mo14860e() {
        return 18;
    }

    /* renamed from: g */
    public int mo14861g() {
        return 3;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C98121d dVar2 = dVar;
        Log.m105925i("MicroMsg.FaceFlashActionReflectManager", " cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] ", str, Integer.valueOf(i), cVar, dVar2);
        int i2 = dVar2 == null ? -1 : dVar2.field_retCode;
        C0222b.m173l("rspCdn", Integer.valueOf(i2));
        C0222b.m164c().f9716i = i2;
        C0222b.m164c().f9718k = System.currentTimeMillis() - this.f356809u;
        if (dVar2 != null && dVar2.field_retCode == 0) {
            Log.m105924i("MicroMsg.FaceFlashActionReflectManager", "cdnCallback upload video done. now upload");
            C117473c cVar2 = new C117473c(this.f346089E, this.f346090F, this.f346091G, dVar2.field_fileId, dVar2.field_aesKey, this.f356796e, this.f346092H, this.f346086B, (byte[]) null, this.f346093I, 2, this.f356797f, (double) this.f356794A, (double) this.f356814z);
            C86709a0.m107524d().mo123455a(2726, this);
            C86709a0.m107524d().mo123460f(cVar2);
            C0222b.m172k("reqVerify");
            C0222b.m164c().f9719l = System.currentTimeMillis() - this.f346095K;
            return 0;
        } else if (i == 0 && dVar2 == null) {
            return 0;
        } else {
            Log.m105924i("MicroMsg.FaceFlashActionReflectManager", "cdnCallback sceneResult.field_retCode != 0");
            C0222b.m164c().f9724q = 5;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 90020);
                String q = C76577a.m92166q(this.f356803o, C0966R.string.msg_net_error);
                jSONObject.put("err_feedback", this.f356802n);
                jSONObject.put("err_msg", q);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.FaceFlashActionReflectManager", "cdn callback error:%s", e.getMessage());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("response", jSONObject.toString());
            this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
            return 0;
        }
    }

    /* renamed from: l */
    public void mo175363l(String str) {
        Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "initPrepareTip :%s", str);
        String[] split = str.split(",");
        if (split.length > 1) {
            this.f346096L = true;
        } else {
            this.f346096L = false;
        }
        String str2 = split[0];
        if (str2.equals("1")) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_blink);
        } else if (str2.equals("2")) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_open_mouth);
        } else if (str2.equals("3")) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_nod_head);
        } else if (str2.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL)) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_shake_head);
        } else if (str2.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
            this.f356808t = C76577a.m92166q(this.f356803o, C0966R.string.fl_act_silence);
        }
    }

    public void onNetworkRequestEvent(String str, String str2, HashMap<String, String> hashMap, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "onNetworkRequestEvent  url:%s requestContent:%s requestHeaders:%s", str, str2, hashMap);
        this.f356795d = iYtSDKKitNetResponseParser;
        if (str.contains("wechat_face_config")) {
            C0222b.m172k("reqCfg");
            mo183838k();
            C113079a.m154758d(18);
            C0222b.m175n(2);
            try {
                String string = new JSONObject(str2).getString("select_data");
                this.f356800i = string;
                Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "requestFlashConfig getConfig selectData:%s", string);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.FaceFlashActionReflectManager", "requestFlashConfig reflect get yt config data error : %s", e.getMessage());
            }
            C46838a aVar = new C46838a(this.f356796e, this.f346086B, this.f346087C, 2, this.f356800i.getBytes());
            C86709a0.m107524d().mo123455a(2696, this);
            C86709a0.m107524d().mo123460f(aVar);
        } else if (str.contains("wechat_face_verify")) {
            try {
                mo183840n();
                C113079a.m154759e(18);
                mo183839m(str2);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.FaceFlashActionReflectManager", "action parse verify body error:%s", e2.getMessage());
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "onSceneEnd：errType %s，errCode %s ，errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar2 instanceof C46838a) {
            Log.m105924i("MicroMsg.FaceFlashActionReflectManager", "scene is getFaceCheckActionerrType");
            C86709a0.m107524d().mo123470p(2696, this);
            C0222b.m173l("rspCfg", Integer.valueOf(i2));
            C46838a aVar = (C46838a) yVar2;
            C0222b.m164c().f9715h = i3;
            this.f346094J++;
            Object obj = "response";
            this.f346095K = System.currentTimeMillis();
            if (i == 0 && i3 == 0) {
                C49779i02 i022 = aVar.f125988f;
                Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "response.ret_code:%s，response.ret_msg：%s bio_id：%s，response.action_data:%s response.color_data:%s response.select_data:%s", Integer.valueOf(i022.f134997d), i022.f134998e, Long.valueOf(i022.f135006p), i022.f135000g, i022.f135004n, i022.f135005o);
                int i4 = i022.f134997d;
                if (i4 == 0) {
                    this.f346089E = i022.f134999f;
                    this.f346090F = i022.f135000g;
                    this.f346091G = i022.f135001h;
                    this.f346092H = i022.f135002i;
                    this.f356797f = i022.f135006p;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0);
                        jSONObject.put("err_msg", "OK");
                        jSONObject.put("type", 1);
                        if (i022.f135005o != null) {
                            try {
                                jSONObject.put("select_data", new JSONObject(new String(i022.f135005o.f257327a)));
                            } catch (Exception e) {
                                Log.m105921e("MicroMsg.FaceFlashActionReflectManager", "parse select_data fail:%s", e.getMessage());
                            }
                        }
                        if (!Util.isNullOrNil(i022.f135000g)) {
                            mo175363l(i022.f135000g);
                            jSONObject.put("action_data", i022.f135000g);
                        }
                        if (!Util.isNullOrNil(i022.f135004n)) {
                            jSONObject.put("color_data", i022.f135004n);
                        }
                    } catch (JSONException e2) {
                        Log.m105921e("MicroMsg.FaceFlashActionReflectManager", "reflect get config error:%s", e2.getMessage());
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(obj, jSONObject.toString());
                    this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
                    Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "[sdk-info] retMap:%s", hashMap);
                    return;
                }
                mo175364s(i4, i022.f134998e, "response.ret_code != 0");
                return;
            }
            mo175364s(90036, C76577a.m92166q(this.f356803o, C0966R.string.net_fetch_failed), "cgi failed");
            return;
        }
        Object obj2 = "response";
        if (yVar2 instanceof C117473c) {
            C86709a0.m107524d().mo123470p(2726, this);
            C64542m02 m022 = ((C117473c) yVar2).f351564g;
            Log.m105925i("MicroMsg.FaceFlashActionReflectManager", "scene is getFaceCheckResult：ret_code: %s, ret_msg: %s serialId:%s retry:%s", Integer.valueOf(m022.f184190d), m022.f184191e, m022.f184194h, Integer.valueOf(m022.f184193g));
            C0222b.m173l("rspVerify", Integer.valueOf(m022.f184190d));
            C0222b.m164c().f9717j = m022.f184190d;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("countFace", this.f346094J);
                jSONObject2.put("err_code", m022.f184190d);
                if (i == 0 && i3 == 0) {
                    C113079a.m154757c(18);
                    jSONObject2.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, m022.f184190d);
                    jSONObject2.put(StateEvent.Name.ERROR_CODE, m022.f184190d);
                    jSONObject2.put("errormsg", m022.f184191e);
                    jSONObject2.put("err_msg", "ok");
                    jSONObject2.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, m022.f184192f);
                    jSONObject2.put("serial_id", m022.f184194h);
                    jSONObject2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f356796e);
                    if (m022.f184190d != 0) {
                        jSONObject2.put("err_retry", m022.f184193g);
                        jSONObject2.put("err_tip", m022.f184191e);
                        jSONObject2.put("err_msg", "fail");
                        jSONObject2.put("otherVerifyTitle", this.f346088D);
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(obj2, jSONObject2.toString());
                    this.f356795d.onNetworkResponseEvent(hashMap2, (Exception) null);
                }
                C113079a.m154755a(18);
                C0222b.m164c().f9724q = 4;
                jSONObject2.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i3);
                jSONObject2.put(StateEvent.Name.ERROR_CODE, i3);
                jSONObject2.put("errormsg", m022.f184191e);
                jSONObject2.put("otherVerifyTitle", this.f346088D);
                jSONObject2.put("err_code", i3);
                jSONObject2.put("err_retry", m022.f184193g);
                jSONObject2.put("err_msg", "fail");
                HashMap hashMap22 = new HashMap();
                hashMap22.put(obj2, jSONObject2.toString());
                this.f356795d.onNetworkResponseEvent(hashMap22, (Exception) null);
            } catch (JSONException e3) {
                Log.m105921e("MicroMsg.FaceFlashActionReflectManager", "NetSceneGetFaceCheckResult parse fail :%s", e3.getMessage());
            }
        }
    }

    public void release() {
        super.release();
        C86709a0.m107524d().mo123470p(2696, this);
        C86709a0.m107524d().mo123470p(2726, this);
    }

    /* renamed from: s */
    public final void mo175364s(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            C0222b.m164c().f9724q = 3;
            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i);
            jSONObject.put("err_code", i);
            jSONObject.put("err_msg", str);
            jSONObject.put("err_feedback", this.f356802n);
            jSONObject.put("otherVerifyTitle", this.f346088D);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.FaceFlashActionReflectManager", "packageErrorResult error:%s", e.getMessage());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("response", jSONObject.toString());
        this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
        Log.m105921e("MicroMsg.FaceFlashActionReflectManager", "packageErrorResult get mBioId failed：%s", str2);
    }
}
