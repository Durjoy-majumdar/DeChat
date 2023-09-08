package com.tencent.p014mm.plugin.flash.action;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import au1.C0222b;
import au1.C113079a;
import bu1.C0381a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.flash.C105347i;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
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
import tc2.C118418g;
import te3.C49779i02;
import te3.C64542m02;
import zt1.C119133a;

/* renamed from: com.tencent.mm.plugin.flash.action.a */
public class C115445a extends C119133a {

    /* renamed from: B */
    public String f346072B;

    /* renamed from: C */
    public String f346073C;

    /* renamed from: D */
    public String f346074D = "";

    /* renamed from: E */
    public byte[] f346075E;

    /* renamed from: F */
    public String f346076F;

    /* renamed from: G */
    public String f346077G;

    /* renamed from: H */
    public float f346078H;

    /* renamed from: I */
    public String f346079I;

    /* renamed from: J */
    public boolean f346080J = false;

    /* renamed from: K */
    public String f346081K;

    /* renamed from: L */
    public String f346082L;

    /* renamed from: M */
    public String f346083M;

    /* renamed from: N */
    public int f346084N;

    /* renamed from: P */
    public long f346085P;

    public C115445a() {
        StringBuilder sb = new StringBuilder();
        String str = C105347i.f313123a;
        sb.append(str);
        sb.append(Util.currentTicks());
        sb.append(".mp4");
        this.f346081K = sb.toString();
        this.f346082L = str + Util.currentTicks() + "_encrypt";
        this.f346083M = "";
        this.f346084N = 0;
        this.f346085P = 0;
    }

    /* renamed from: a */
    public void mo14859a(TextView textView) {
        textView.setText(this.f346083M);
    }

    /* renamed from: b */
    public void mo14863b(TextView textView, String str) {
        boolean z;
        try {
            if (System.currentTimeMillis() - this.f356805q >= 1000) {
                this.f356805q = System.currentTimeMillis();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String c = C0381a.m326c(textView.getContext(), str);
                Log.m105925i("MicroMsg.FaceFlashActionManager", "updateTipText res:%s tip:%s", str, c);
                if (!TextUtils.isEmpty(c)) {
                    textView.setText(c);
                }
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo14864c(Intent intent, Activity activity) {
        super.mo14864c(intent, activity);
        this.f356796e = intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f346072B = intent.getStringExtra("package");
        this.f346073C = intent.getStringExtra("packageSign");
        this.f346080J = intent.getBooleanExtra("needContract", false);
        this.f346074D = intent.getStringExtra("otherVerifyTitle");
        Log.m105925i("MicroMsg.FaceFlashActionManager", "[%s]intent data, packageName:%s packageSign:%s needSignContract:%s otherVerifyTitle:%s", C115445a.class.getSimpleName(), this.f346072B, this.f346073C, Boolean.valueOf(this.f346080J), this.f346074D);
        mo183843q(activity);
    }

    /* renamed from: e */
    public int mo14860e() {
        return 16;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C98121d dVar2 = dVar;
        Log.m105925i("MicroMsg.FaceFlashActionManager", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
        int i2 = dVar2 == null ? -1 : dVar2.field_retCode;
        C0222b.m173l("rspCdn", Integer.valueOf(i2));
        C0222b.m164c().f9716i = i2;
        C0222b.m164c().f9718k = System.currentTimeMillis() - this.f356809u;
        if (dVar2 != null && dVar2.field_retCode == 0) {
            Log.m105924i("MicroMsg.FaceFlashActionManager", "hy: upload video done. now upload");
            C86013q1.m106447h(this.f346082L);
            C0222b.m172k("reqVerify");
            C117473c cVar2 = new C117473c(this.f346076F, this.f346077G, this.f346078H, dVar2.field_fileId, dVar2.field_aesKey, this.f356796e, this.f346079I, this.f346072B, this.f346075E, this.f346080J, 1, 0, (double) this.f356794A, (double) this.f356814z);
            C86709a0.m107524d().mo123455a(2726, this);
            C86709a0.m107524d().mo123460f(cVar2);
            C0222b.m164c().f9719l = System.currentTimeMillis() - this.f346085P;
            return 0;
        } else if (dVar2 != null) {
            Log.m105929w("MicroMsg.FaceFlashActionManager", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
            C86013q1.m106447h(this.f346082L);
            return 0;
        } else if (i == 0) {
            return 0;
        } else {
            Log.m105929w("MicroMsg.FaceFlashActionManager", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
            C0222b.m164c().f9724q = 5;
            return 0;
        }
    }

    public void onNetworkRequestEvent(String str, String str2, HashMap<String, String> hashMap, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        Log.m105925i("MicroMsg.FaceFlashActionManager", "onNetworkRequestEvent  url:%s requestContent:%s requestHeaders:%s", str, str2, hashMap);
        this.f356795d = iYtSDKKitNetResponseParser;
        if (str.contains("wechat_face_config")) {
            C0222b.m172k("reqCfg");
            mo183838k();
            C113079a.m154758d(16);
            C46838a aVar = new C46838a(this.f356796e, this.f346072B, this.f346073C);
            C86709a0.m107524d().mo123455a(2696, this);
            C86709a0.m107524d().mo123460f(aVar);
        } else if (str.contains("wechat_face_verify")) {
            try {
                mo183840n();
                C113079a.m154759e(16);
                String optString = new JSONObject(str2).optString("action_video");
                C86013q1.m106447h(this.f346081K);
                C86013q1.m106447h(this.f346082L);
                C86013q1.m106437S(this.f346081K, Base64.decode(optString, 0));
                mo175360s(this.f346081K);
                mo175361t(this.f346076F, this.f346081K, this.f346082L);
                C86013q1.m106447h(this.f346081K);
                mo183844r(this.f346082L);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "action parse verify body error!!!", new Object[0]);
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        int i4 = 2;
        Log.m105925i("MicroMsg.FaceFlashActionManager", "onSceneEnd：errType %s ， errCode %s ，errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str2);
        if (yVar2 instanceof C46838a) {
            Log.m105924i("MicroMsg.FaceFlashActionManager", "scene is getFaceCheckActionerrType");
            C0222b.m173l("rspCfg", Integer.valueOf(i2));
            this.f346084N++;
            C86709a0.m107524d().mo123470p(2696, this);
            C46838a aVar = (C46838a) yVar2;
            C0222b.m164c().f9715h = i3;
            String str3 = "errormsg";
            this.f346085P = System.currentTimeMillis();
            if (i == 0 && i3 == 0) {
                C49779i02 i022 = aVar.f125988f;
                Log.m105925i("MicroMsg.FaceFlashActionManager", "[cgi-ret]NetSceneGetFaceCheckAction, ret_code: %s, ret_msg: %s, action_data: %s, reduction_ratio: %s, take_message: %s", Integer.valueOf(i022.f134997d), i022.f134998e, i022.f135000g, Float.valueOf(i022.f135001h), i022.f135002i);
                int i5 = i022.f134997d;
                if (i5 == 0) {
                    String str4 = i022.f134999f;
                    this.f346076F = str4;
                    String str5 = i022.f135000g;
                    this.f346077G = str5;
                    float f = i022.f135001h;
                    this.f346078H = f;
                    this.f346079I = i022.f135002i;
                    Log.m105925i("MicroMsg.FaceFlashActionManager", "[cgi-ret]NetSceneGetFaceCheckAction personId:%s actionData:%s reductionRatio:%s", str4, str5, Float.valueOf(f));
                    int i6 = Util.getInt(this.f346077G, -1);
                    if (i6 == 1 || i6 == 3) {
                        Log.m105924i("MicroMsg.FaceFlashActionManager", "user check blink eye");
                        this.f346083M = C76577a.m92166q(this.f356803o, C0966R.string.chq);
                        i4 = 1;
                    } else if (i6 != 5) {
                        i4 = -1;
                    } else {
                        Log.m105924i("MicroMsg.FaceFlashActionManager", "user check open month");
                        this.f346083M = C76577a.m92166q(this.f356803o, C0966R.string.chr);
                    }
                    if (i4 == -1) {
                        mo175362u(-1, "", "get action data error 1");
                        return;
                    }
                    String str6 = i4 + "";
                    Log.m105924i("MicroMsg.FaceFlashActionManager", "packageSuccessResult1");
                    HashMap hashMap = new HashMap();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0);
                        jSONObject.put(str3, "OK");
                        jSONObject.put("type", 1);
                        jSONObject.put("action_data", str6);
                        hashMap.put("response", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                    this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
                    return;
                }
                mo175362u(i5, i022.f134998e, "get action data error 2");
                return;
            }
            C0222b.m164c().f9724q = 3;
            mo175362u(i3, str2, "get action data error 3");
            return;
        }
        String str7 = "errormsg";
        if (yVar2 instanceof C117473c) {
            C86709a0.m107524d().mo123470p(2726, this);
            C64542m02 m022 = ((C117473c) yVar2).f351564g;
            Log.m105925i("MicroMsg.FaceFlashActionManager", "scene is getFaceCheckResult get face check result, ret_code: %s, ret_msg: %s serialId:%s retry:%s", Integer.valueOf(m022.f184190d), m022.f184191e, m022.f184194h, Integer.valueOf(m022.f184193g));
            C0222b.m173l("rspVerify", Integer.valueOf(m022.f184190d));
            C0222b.m164c().f9717j = m022.f184190d;
            HashMap hashMap2 = new HashMap();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("countFace", this.f346084N);
                jSONObject2.put("err_code", m022.f184190d);
                if (i == 0 && i3 == 0) {
                    C113079a.m154757c(16);
                    jSONObject2.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, m022.f184190d);
                    jSONObject2.put(StateEvent.Name.ERROR_CODE, m022.f184190d);
                    jSONObject2.put(str7, m022.f184191e);
                    jSONObject2.put("err_msg", "ok");
                    jSONObject2.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, m022.f184192f);
                    jSONObject2.put("serial_id", m022.f184194h);
                    jSONObject2.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f356796e);
                    if (m022.f184190d != 0) {
                        jSONObject2.put("err_retry", m022.f184193g);
                        jSONObject2.put("err_tip", m022.f184191e);
                        jSONObject2.put("err_msg", "fail");
                        jSONObject2.put("otherVerifyTitle", this.f346074D);
                    }
                    hashMap2.put("response", jSONObject2.toString());
                    this.f356795d.onNetworkResponseEvent(hashMap2, (Exception) null);
                }
                C0222b.m164c().f9724q = 4;
                C113079a.m154755a(16);
                jSONObject2.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i3);
                jSONObject2.put(StateEvent.Name.ERROR_CODE, i3);
                jSONObject2.put(str7, m022.f184191e);
                jSONObject2.put("otherVerifyTitle", this.f346074D);
                jSONObject2.put("err_code", i3);
                jSONObject2.put("err_retry", m022.f184193g);
                jSONObject2.put("err_msg", "fail");
                hashMap2.put("response", jSONObject2.toString());
                this.f356795d.onNetworkResponseEvent(hashMap2, (Exception) null);
            } catch (JSONException unused2) {
            }
        }
    }

    public void release() {
        super.release();
        C86709a0.m107524d().mo123470p(2696, this);
        C86709a0.m107524d().mo123470p(2726, this);
        C86013q1.m106447h(this.f346081K);
        C86013q1.m106447h(this.f346082L);
    }

    /* renamed from: s */
    public final void mo175360s(String str) {
        String q = C86013q1.m106456q(str);
        Log.m105925i("MicroMsg.FaceFlashActionManager", "MD5ForSignatureString：%s", q);
        byte[] bytes = q.getBytes();
        PByteArray pByteArray = new PByteArray();
        if (C118418g.INSTANCE.mo175808ZU(1, bytes, 0, bytes.length, pByteArray)) {
            this.f346075E = pByteArray.value;
            return;
        }
        Log.m105924i("MicroMsg.FaceFlashActionManager", "digitalSignature failed");
        this.f346075E = bytes;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b1  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175361t(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "AES"
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r7)
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            r7.<init>((java.lang.String) r8)
            boolean r8 = r1.mo119967g()
            if (r8 == 0) goto L_0x00b5
            boolean r8 = r1.mo119978p()
            if (r8 == 0) goto L_0x00b5
            com.tencent.mm.vfs.m1 r8 = r7.mo119974l()
            boolean r8 = r8.mo119967g()
            if (r8 != 0) goto L_0x0029
            com.tencent.mm.vfs.m1 r8 = r7.mo119974l()
            r8.mo119987x()
        L_0x0029:
            r7.mo119964e()
            r8 = 0
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106422D(r1)     // Catch:{ Exception -> 0x009e, all -> 0x0098 }
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106426H(r7)     // Catch:{ Exception -> 0x0093, all -> 0x008e }
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r6.getBytes(r2)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            byte[] r2 = r3.getEncoded()     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r6 = 1
            r0.init(r6, r3, r2)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x0089, all -> 0x0084 }
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x0082 }
        L_0x0065:
            int r0 = r6.read(r8)     // Catch:{ Exception -> 0x0082 }
            r2 = -1
            if (r0 == r2) goto L_0x0074
            r2 = 0
            r7.write(r8, r2, r0)     // Catch:{ Exception -> 0x0082 }
            r7.flush()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0065
        L_0x0074:
            if (r7 == 0) goto L_0x0079
            r7.close()
        L_0x0079:
            r6.close()
            if (r1 == 0) goto L_0x00b5
            r1.close()
            goto L_0x00b5
        L_0x0082:
            r8 = move-exception
            goto L_0x00a3
        L_0x0084:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto L_0x00a5
        L_0x0089:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto L_0x00a3
        L_0x008e:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto L_0x00a5
        L_0x0093:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto L_0x00a3
        L_0x0098:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
            goto L_0x00a5
        L_0x009e:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
        L_0x00a3:
            throw r8     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r8 = move-exception
        L_0x00a5:
            if (r7 == 0) goto L_0x00aa
            r7.close()
        L_0x00aa:
            if (r6 == 0) goto L_0x00af
            r6.close()
        L_0x00af:
            if (r1 == 0) goto L_0x00b4
            r1.close()
        L_0x00b4:
            throw r8
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.flash.action.C115445a.mo175361t(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: u */
    public final void mo175362u(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i);
            jSONObject.put("errormsg", str);
            jSONObject.put("err_code", i);
            jSONObject.put("err_feedback", this.f356802n);
            jSONObject.put("otherVerifyTitle", this.f346074D);
        } catch (JSONException unused) {
        }
        hashMap.put("response", jSONObject.toString());
        this.f356795d.onNetworkResponseEvent(hashMap, (Exception) null);
        Log.m105920e("MicroMsg.FaceFlashManagerError", str2);
    }
}
