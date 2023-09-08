package com.tencent.p014mm.wallet_core.model;

import android.text.TextUtils;
import b63.C113146l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ClientCellInfoReportStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ie3.C8883h;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import p156gj.C87203t;
import qe3.C89631w;
import te3.C51018qv3;
import te3.C77963l1;

/* renamed from: com.tencent.mm.wallet_core.model.g0 */
public abstract class C75117g0 extends C75123k0 {
    public static final int ERR_RETCODE_JSON_RESOLVE_ERROR = -10089;
    private static final int ERR_RETCODE_NO_JSON = -10088;
    private static final String PAY_END = "1";
    private static final String TAG = "MicroMsg.NetScenePayBase";
    public int SVR_ERR_CODE = 0;
    public int SVR_ERR_TYPE = 0;
    private Map<String, String> _request = new HashMap();
    public C11385n callback;
    public String crt_token = "";
    public String crt_wording = "";
    private String errDialogCancelText;
    private String errDialogOkText;
    public String error_detail_url;
    private boolean hasProcessWalletError = false;
    public boolean hasRevServerRep = false;
    public boolean isChildConsume = false;
    public int is_gen_cert = 0;
    public int is_hint_cert = 0;
    public int is_ignore_cert = 0;
    private JumpRemind jumpRemind;
    private String payAppUrl = "";
    private String payFlag = "";

    /* renamed from: rr */
    public C47350c f221047rr;
    private String wappay_jumped_url = "";

    public static C75120i getRetModel(int i, int i2, String str, int i3, String str2, int i4, String str3, int i5, String str4) {
        C75120i iVar = new C75120i(i, i2, str);
        if (i != 0 || i2 != 0) {
            getRetModel(i, i2, str, iVar);
        } else if (i3 != 0) {
            Log.m105928w(TAG, "hy: resolve busi error: plat ret is error");
            iVar.mo104849a(1000, i3, str2, 1);
        } else if (i4 != 0) {
            Log.m105928w(TAG, "hy: resolve busi error: errType is error");
            iVar.mo104849a(1000, i4, str3, 2);
        } else if (i5 != 0) {
            Log.m105928w(TAG, "hy: resolve busi error: retCode is error");
            if (i5 == -10089 || i5 == ERR_RETCODE_NO_JSON) {
                iVar.mo104849a(1000, 2, str4, 2);
            } else {
                iVar.mo104849a(1000, i5, str4, 2);
            }
        } else {
            if (!Util.isNullOrNil(str3)) {
                Log.m105924i(TAG, "finModel.errMsg = biz_errMsg");
                iVar.f221054c = str3;
            }
            Log.m105924i(TAG, "hy: all's OK");
        }
        return iVar;
    }

    public void addRequestData(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.remove("uin");
        if (this._request == null) {
            this._request = new HashMap();
        }
        Map<String, String> map2 = this._request;
        if (map2 != null) {
            map2.remove("uin");
        }
        Object[] array = map.keySet().toArray();
        for (Object obj : array) {
            String str = map.get(obj);
            if (this._request.containsKey(obj)) {
                this._request.remove(obj);
            }
            this._request.put((String) obj, str);
        }
        setRequestData(this._request);
    }

    public boolean callbackUIWhenWalletError() {
        return false;
    }

    public void certSignConfig() {
    }

    public boolean checkRecSrvResp() {
        return this.hasRevServerRep;
    }

    public abstract void configRequest(boolean z, boolean z2);

    public abstract int doSceneSimulately(C47350c cVar, C114770g gVar, C11385n nVar);

    public int getCgicmdForKV() {
        return getPayCgicmd();
    }

    public C47350c getCommReqResp() {
        return this.f221047rr;
    }

    public abstract String getEncryptUrl(String str);

    public String getErrDetailUrl() {
        return this.error_detail_url;
    }

    public String getErrDialogCancelBtnText() {
        return !Util.isNullOrNil(this.errDialogCancelText) ? this.errDialogCancelText : MMApplicationContext.getContext().getString(C0966R.string.a18);
    }

    public String getErrDialogOkBtnText() {
        return !Util.isNullOrNil(this.errDialogOkText) ? this.errDialogOkText : MMApplicationContext.getContext().getString(C0966R.string.ksl);
    }

    public JumpRemind getJumpRemind() {
        return this.jumpRemind;
    }

    public abstract int getPayCgicmd();

    public abstract C45118l0 getRetModel(C47350c cVar);

    public String getReturnUrl() {
        return this.payAppUrl;
    }

    public String getToken() {
        return null;
    }

    public String getWappayJumpUrl() {
        return this.wappay_jumped_url;
    }

    public boolean hasProcessWalletError() {
        return this.hasProcessWalletError;
    }

    public boolean isBlock() {
        return true;
    }

    public boolean isJumpRemind() {
        return this.jumpRemind != null;
    }

    public boolean isPayEnd() {
        String str = this.payFlag;
        if (str == null) {
            return false;
        }
        return "1".equals(str.trim());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x021c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r19, int r20, int r21, java.lang.String r22, com.tencent.p014mm.network.C114799u r23, byte[] r24, long r25) {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            r1.SVR_ERR_TYPE = r0
            r2 = r21
            r1.SVR_ERR_CODE = r2
            boolean r3 = sf0.C90188n0.f258924R
            r4 = 3
            if (r3 != 0) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            r3 = 1686(0x696, float:2.363E-42)
            int r5 = r18.getPayCgicmd()
            if (r3 != r5) goto L_0x001c
            r0 = -1
            r11 = 3
            r12 = -1
            goto L_0x001e
        L_0x001c:
            r11 = r0
            r12 = r2
        L_0x001e:
            r2 = 8
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r3 = r18.getType()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r0[r5] = r3
            int r3 = r23.getType()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 1
            r0[r6] = r3
            java.lang.String r3 = r23.getUri()
            r7 = 2
            r0[r7] = r3
            int r3 = r18.getPayCgicmd()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r8 = 4
            r0[r8] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r9 = 5
            r0[r9] = r3
            r3 = 6
            r0[r3] = r22
            java.lang.String r10 = r18.toString()
            r13 = 7
            r0[r13] = r10
            java.lang.String r14 = "MicroMsg.NetScenePayBase"
            java.lang.String r10 = "cgi: %d, rrType %d, rrCgi %s, PayCgicmd %s, errType %d, errCode %d, errMsg %s, this: %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r10, r0)
            r0 = r23
            ob0.c r0 = (ob0.C47350c) r0
            com.tencent.mm.wallet_core.model.l0 r0 = r1.getRetModel(r0)
            int r10 = r0.f122387b
            java.lang.String r15 = r0.f122388c
            int r2 = r0.f122389d
            java.lang.String r13 = r0.f122390e
            r16 = -10088(0xffffffffffffd898, float:NaN)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 2131839043(0x7f114843, float:1.9311326E38)
            java.lang.String r3 = r3.getString(r9)
            te3.qv3 r0 = r0.f122386a
            java.lang.String r0 = sf0.C48374j0.m53717f(r0)
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r9 = ""
            if (r17 != 0) goto L_0x0166
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0139 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.String r0 = "error_detail_url"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ Exception -> 0x0137 }
            r1.error_detail_url = r0     // Catch:{ Exception -> 0x0137 }
            java.lang.String r0 = "retcode"
            int r0 = r8.getInt(r0)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "retmsg"
            java.lang.String r3 = r8.optString(r4)     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "pay_flag"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ Exception -> 0x0137 }
            r1.payFlag = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "return_url"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ Exception -> 0x0137 }
            r1.payAppUrl = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "wappay_jumped_url"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ Exception -> 0x0137 }
            r1.wappay_jumped_url = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = r1.parseErrDialogCancelBtnText(r8)     // Catch:{ Exception -> 0x0137 }
            r1.errDialogCancelText = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = r1.parseErrDialogOkBtnText(r8)     // Catch:{ Exception -> 0x0137 }
            r1.errDialogOkText = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "is_gen_cert"
            int r4 = r8.optInt(r4)     // Catch:{ Exception -> 0x0137 }
            r1.is_gen_cert = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "crt_token"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ Exception -> 0x0137 }
            r1.crt_token = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "is_hint_crt"
            int r4 = r8.optInt(r4)     // Catch:{ Exception -> 0x0137 }
            r1.is_hint_cert = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "crt_wording"
            org.json.JSONObject r4 = r8.optJSONObject(r4)     // Catch:{ Exception -> 0x0137 }
            if (r4 == 0) goto L_0x00f8
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0137 }
            r1.crt_wording = r4     // Catch:{ Exception -> 0x0137 }
            goto L_0x00fa
        L_0x00f8:
            r1.crt_wording = r9     // Catch:{ Exception -> 0x0137 }
        L_0x00fa:
            java.lang.String r4 = "is_ignore_crt"
            int r4 = r8.optInt(r4)     // Catch:{ Exception -> 0x0137 }
            r1.is_ignore_cert = r4     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = "del_cert"
            int r4 = r8.optInt(r4, r5)     // Catch:{ Exception -> 0x0137 }
            if (r4 == 0) goto L_0x0128
            com.tencent.mm.wallet_core.model.t0 r4 = com.tencent.p014mm.wallet_core.model.C75140t0.m90124c()     // Catch:{ Exception -> 0x0137 }
            r4.getClass()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r4 = com.tencent.p014mm.wallet_core.model.C75140t0.m90123b()     // Catch:{ Exception -> 0x0137 }
            java.lang.String r7 = "clean token %s"
            r23 = r0
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0137 }
            r0[r5] = r4     // Catch:{ Exception -> 0x0137 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r7, r0)     // Catch:{ Exception -> 0x0137 }
            com.tencent.mm.wallet_core.model.t0 r0 = com.tencent.p014mm.wallet_core.model.C75140t0.m90124c()     // Catch:{ Exception -> 0x0137 }
            r0.mo104862a(r4)     // Catch:{ Exception -> 0x0137 }
            goto L_0x012a
        L_0x0128:
            r23 = r0
        L_0x012a:
            com.tencent.mm.wallet_core.model.JumpRemind r0 = com.tencent.p014mm.wallet_core.model.JumpRemind.m90058c(r8)     // Catch:{ Exception -> 0x0137 }
            r1.jumpRemind = r0     // Catch:{ Exception -> 0x0137 }
            r1.hasRevServerRep = r6     // Catch:{ Exception -> 0x0137 }
            r16 = r23
            r0 = r8
            r8 = r13
            goto L_0x016d
        L_0x0137:
            r0 = move-exception
            goto L_0x013b
        L_0x0139:
            r0 = move-exception
            r8 = 0
        L_0x013b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "hy: json resolve error: error when resolving error code : "
            r4.append(r7)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r0 = -10089(0xffffffffffffd897, float:NaN)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131839165(0x7f1148bd, float:1.9311574E38)
            java.lang.String r4 = r4.getString(r7)
            r13 = r3
            r0 = r8
            r16 = -10089(0xffffffffffffd897, float:NaN)
            r8 = r4
            goto L_0x016e
        L_0x0166:
            java.lang.String r0 = "hy: respString is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            r8 = r13
            r0 = 0
        L_0x016d:
            r13 = r3
        L_0x016e:
            if (r0 == 0) goto L_0x0174
            java.lang.String r9 = r0.toString()
        L_0x0174:
            java.lang.Class<ie3.c> r3 = ie3.C76324c.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ie3.c r3 = (ie3.C76324c) r3
            r3.ensureLibraryLoaded()
            r3 = 13
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r18.getType()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r5] = r4
            int r4 = r18.getPayCgicmd()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r5 = 2
            r3[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r5 = 3
            r3[r5] = r4
            r4 = 4
            r3[r4] = r22
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r5 = 5
            r3[r5] = r4
            r4 = 6
            r3[r4] = r15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 7
            r3[r5] = r4
            r4 = 8
            r3[r4] = r8
            r4 = 9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            r3[r4] = r5
            r4 = 10
            r3[r4] = r13
            r4 = 11
            java.lang.String r5 = com.tencent.kinda.gen.CppUtil.getFilterLog(r9)
            r3[r4] = r5
            r4 = 12
            java.lang.String r5 = r18.toString()
            r3[r4] = r5
            java.lang.String r4 = "tenpayResp: cgi: %d, cmd: %d, errType: %d, errCode: %d, errMsg: %s, platRet: %d, platMsg: %s, biz_ErrType: %d, biz_ErrMsg: %s, retcode: %d, retMsg: %s, json: %s this %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
            r7 = r2
            r2 = r11
            r3 = r12
            r4 = r22
            r5 = r10
            r6 = r15
            r9 = r16
            r10 = r13
            com.tencent.mm.wallet_core.model.i r2 = getRetModel(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.reportCellInfo(r11, r12)
            if (r0 == 0) goto L_0x020a
            int r3 = r2.f221052a
            if (r3 != 0) goto L_0x01fa
            int r3 = r2.f221053b
            if (r3 == 0) goto L_0x0200
        L_0x01fa:
            boolean r3 = r18.shouldResolveJsonWhenError()
            if (r3 == 0) goto L_0x0204
        L_0x0200:
            r1.onRawGYNetEnd(r2, r0)
            goto L_0x020f
        L_0x0204:
            java.lang.String r3 = "hy: ret code is not ok and should not resolve when error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            goto L_0x020f
        L_0x020a:
            java.lang.String r3 = "hy: no json object when doing business"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
        L_0x020f:
            r1.onRawGYNetEndFuck2(r2, r0)
            boolean r0 = r1.isChildConsume
            if (r0 == 0) goto L_0x021c
            java.lang.String r0 = "hy: user consumed the call back"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r0)
            return
        L_0x021c:
            ob0.n r0 = r1.callback
            int r3 = r2.f221052a
            int r4 = r2.f221053b
            java.lang.String r2 = r2.f221054c
            r0.onSceneEnd(r3, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.model.C75117g0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[], long):void");
    }

    public abstract void onGYNetEnd(int i, String str, JSONObject jSONObject);

    public void onGYNetEnd2(C75120i iVar, JSONObject jSONObject) {
    }

    public void onRawGYNetEnd(C75120i iVar, JSONObject jSONObject) {
        onGYNetEnd(iVar.f221053b, iVar.f221054c, jSONObject);
    }

    public void onRawGYNetEndFuck2(C75120i iVar, JSONObject jSONObject) {
        onGYNetEnd2(iVar, jSONObject);
    }

    public String parseErrDialogCancelBtnText(JSONObject jSONObject) {
        return null;
    }

    public String parseErrDialogOkBtnText(JSONObject jSONObject) {
        return null;
    }

    public abstract void putToReqText(C47350c cVar, C51018qv3 qv32);

    public void putToRequest(StringBuilder sb, String str) {
        sb.append(str);
    }

    public abstract void putToWXReqText(C47350c cVar, C51018qv3 qv32);

    public void reportCellInfo(int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3 = i;
        if (i3 == 0) {
            try {
                Log.m105920e(TAG, "errType is OK, reportCellInfo do nothing");
            } catch (Exception e) {
                Log.m105921e(TAG, "reportCellInfo error. %s", e.getMessage());
            }
        } else if (!C113146l.m154809g()) {
            Log.m105920e(TAG, "shouldReportCellInfo is false, reportCellInfo do nothing");
        } else {
            C77963l1 c = C113146l.m154805c();
            if (c != null && !Util.isNullOrNil(c.f227799o) && !Util.isNullOrNil(c.f227800p)) {
                int payCgicmd = getPayCgicmd();
                String str6 = c.f227799o;
                String str7 = c.f227798n;
                String str8 = c.f227800p;
                if (!Util.isNullOrNil(str8)) {
                    int length = str8.length();
                    if (length > 5000) {
                        Log.m105920e(TAG, "reportCellInfo. cell info is too long to report");
                    } else {
                        if (length > 4000) {
                            str = str8.substring(0, 1000);
                            str2 = str8.substring(1000, 2000);
                            str3 = str8.substring(2000, 3000);
                            str4 = str8.substring(3000, 4000);
                            str5 = str8.substring(4000, length);
                        } else if (length > 3000) {
                            str = str8.substring(0, 1000);
                            str2 = str8.substring(1000, 2000);
                            str3 = str8.substring(2000, 3000);
                            str4 = str8.substring(3000, length);
                            str5 = "";
                        } else if (length > 2000) {
                            str = str8.substring(0, 1000);
                            str2 = str8.substring(1000, 2000);
                            str3 = str8.substring(2000, length);
                            str5 = "";
                            str4 = str5;
                        } else if (length > 1000) {
                            str = str8.substring(0, 1000);
                            str2 = str8.substring(1000, length);
                            str5 = "";
                            str4 = str5;
                            str3 = str4;
                        } else if (length > 0) {
                            str = str8.substring(0, length);
                            str5 = "";
                            str4 = str5;
                            str3 = str4;
                            str2 = str3;
                        }
                        Log.m105920e(TAG, "reportCellInfo do report");
                        ClientCellInfoReportStruct clientCellInfoReportStruct = new ClientCellInfoReportStruct();
                        clientCellInfoReportStruct.f194168d = payCgicmd;
                        clientCellInfoReportStruct.f194169e = i3;
                        clientCellInfoReportStruct.f194170f = i2;
                        clientCellInfoReportStruct.f194171g = clientCellInfoReportStruct.mo86045b("EncryptKey", str6, true);
                        clientCellInfoReportStruct.f194172h = clientCellInfoReportStruct.mo86045b("EncryptUserinfo", str7, true);
                        clientCellInfoReportStruct.f194173i = clientCellInfoReportStruct.mo86045b("EncryptCellinfoLength", "" + length, true);
                        clientCellInfoReportStruct.f194174j = clientCellInfoReportStruct.mo86045b("EncryptCellinfo_01", str, true);
                        clientCellInfoReportStruct.f194175k = clientCellInfoReportStruct.mo86045b("EncryptCellinfo_02", str2, true);
                        clientCellInfoReportStruct.f194176l = clientCellInfoReportStruct.mo86045b("EncryptCellinfo_03", str3, true);
                        clientCellInfoReportStruct.f194177m = clientCellInfoReportStruct.mo86045b("EncryptCellinfo_04", str4, true);
                        clientCellInfoReportStruct.f194178n = clientCellInfoReportStruct.mo86045b("EncryptCellinfo_05", str5, true);
                        clientCellInfoReportStruct.mo86054n();
                    }
                    str5 = "";
                    str4 = str5;
                    str3 = str4;
                    str2 = str3;
                    str = str2;
                    Log.m105920e(TAG, "reportCellInfo do report");
                    ClientCellInfoReportStruct clientCellInfoReportStruct2 = new ClientCellInfoReportStruct();
                    clientCellInfoReportStruct2.f194168d = payCgicmd;
                    clientCellInfoReportStruct2.f194169e = i3;
                    clientCellInfoReportStruct2.f194170f = i2;
                    clientCellInfoReportStruct2.f194171g = clientCellInfoReportStruct2.mo86045b("EncryptKey", str6, true);
                    clientCellInfoReportStruct2.f194172h = clientCellInfoReportStruct2.mo86045b("EncryptUserinfo", str7, true);
                    clientCellInfoReportStruct2.f194173i = clientCellInfoReportStruct2.mo86045b("EncryptCellinfoLength", "" + length, true);
                    clientCellInfoReportStruct2.f194174j = clientCellInfoReportStruct2.mo86045b("EncryptCellinfo_01", str, true);
                    clientCellInfoReportStruct2.f194175k = clientCellInfoReportStruct2.mo86045b("EncryptCellinfo_02", str2, true);
                    clientCellInfoReportStruct2.f194176l = clientCellInfoReportStruct2.mo86045b("EncryptCellinfo_03", str3, true);
                    clientCellInfoReportStruct2.f194177m = clientCellInfoReportStruct2.mo86045b("EncryptCellinfo_04", str4, true);
                    clientCellInfoReportStruct2.f194178n = clientCellInfoReportStruct2.mo86045b("EncryptCellinfo_05", str5, true);
                    clientCellInfoReportStruct2.mo86054n();
                }
            }
        }
    }

    public boolean resend() {
        reset();
        return false;
    }

    public void setCommReqResp(C47350c cVar) {
        this.f221047rr = cVar;
    }

    public void setHasProcessWalletError(boolean z) {
        this.hasProcessWalletError = z;
    }

    public void setPayInfo(PayInfo payInfo, Map<String, String> map, Map<String, String> map2) {
        setPayInfo(payInfo, map, map2, false);
    }

    public void setRequestData(Map<String, String> map) {
        String str;
        if (map == null) {
            map = new HashMap<>();
        }
        map.remove("uin");
        if (!C8883h.m8692c()) {
            map.put("jsapi_reqkey", C8883h.f28150a);
        }
        this._request = map;
        configRequest(true, true);
        C89631w.C89634d reqObj = getCommReqResp().getReqObj();
        C75228t.m90208A(map.get("req_key"));
        reqObj.setRouteInfo(0);
        Object[] array = map.keySet().toArray();
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (true) {
            str = "&";
            if (i >= array.length) {
                break;
            }
            Object obj = array[i];
            String str2 = map.get(obj);
            if (!Util.isNullOrNil(str2)) {
                if (z) {
                    sb.append(str);
                }
                sb.append(obj);
                sb.append("=");
                putToRequest(sb, str2);
                z = true;
            }
            i++;
        }
        if (CrashReportFactory.hasDebuger()) {
            Log.m105924i(TAG, "RQ: Cmd : " + getPayCgicmd() + ", req = " + sb.toString() + " " + toString() + " " + Util.getStack().toString());
        } else {
            Log.m105924i(TAG, "RQ: Cmd : " + getPayCgicmd() + ", req = " + sb.toString() + " " + toString());
        }
        String encryptUrl = getEncryptUrl(sb.toString());
        if (!z) {
            str = "";
        }
        sb.append(str);
        sb.append("WCPaySign");
        sb.append("=");
        sb.append(encryptUrl);
        byte[] bytes = sb.toString().getBytes();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bytes);
        putToReqText(this.f221047rr, qv32);
        Log.m105925i(TAG, "setRequestData getPayCgicmd: %s type: %s this: %s cgi %s ", Integer.valueOf(getPayCgicmd()), Integer.valueOf(getType()), toString(), this.f221047rr.f127057c);
    }

    public void setWXRequestData(Map<String, String> map) {
        configRequest(false, false);
        if (map != null) {
            C77963l1 c = C113146l.m154805c();
            if (c != null) {
                Log.m105924i(TAG, "location found");
                map.put("province", c.f227791d);
                if (!map.containsKey("city")) {
                    map.put("city", c.f227792e);
                }
                map.put("location_timestamp", c.f227795h + "");
                map.put("encrypt_key", c.f227799o + "");
                map.put("encrypt_userinfo", c.f227798n + "");
                if (C113146l.m154809g()) {
                    map.put("encrypt_cellinfo", c.f227800p + "");
                }
            }
            Object[] array = map.keySet().toArray();
            Arrays.sort(array);
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (Object obj : array) {
                String str = map.get(obj);
                if (!Util.isNullOrNil(str)) {
                    if (z) {
                        sb.append("&");
                    }
                    sb.append(obj);
                    sb.append("=");
                    sb.append(str);
                    z = true;
                }
            }
            if (CrashReportFactory.hasDebuger()) {
                Log.m105918d(TAG, "Cmd : " + getPayCgicmd() + ", wxreq = " + sb.toString());
            }
            Log.m105918d(TAG, "wxreq: " + sb.toString());
            byte[] bytes = sb.toString().getBytes();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(bytes);
            putToWXReqText(this.f221047rr, qv32);
        }
    }

    public boolean shouldResolveJsonWhenError() {
        return false;
    }

    public void setPayInfo(PayInfo payInfo, Map<String, String> map, Map<String, String> map2, boolean z) {
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (payInfo == null) {
            Log.m105920e(TAG, "Cmd : " + getPayCgicmd() + ", payInfo is null");
            map2.put("devicename", C87203t.m108275k());
            setWXRequestData(map2);
            return;
        }
        map.put("req_key", payInfo.f212592j);
        map.put("partner_id", payInfo.f212596q);
        map.put("pay_sign", payInfo.f212597r);
        if (payInfo.f212577H > -1) {
            map.put("auto_deduct_flag", payInfo.f212577H + "");
        }
        if (payInfo.f212587e > 0) {
            map.put("pay_scene", payInfo.f212587e + "");
        }
        if (payInfo.f212586d >= 0) {
            map.put("bindbankscene", payInfo.f212586d + "");
        }
        if (!Util.isNullOrNil(payInfo.f212578I)) {
            map.put("deduct_bank_type", payInfo.f212578I);
        }
        if (!Util.isNullOrNil(payInfo.f212579J)) {
            map.put("deduct_bind_serial", payInfo.f212579J);
        }
        if (z) {
            map.put("use_touch", "0");
        } else {
            map.put("use_touch", "" + payInfo.f212603x);
        }
        map.put("fp_identify_num", "" + payInfo.f212573D);
        if (!TextUtils.isEmpty(payInfo.f212570A)) {
            map.put("encrypted_pay_info", URLEncoder.encode(payInfo.f212570A));
        }
        if (!TextUtils.isEmpty(payInfo.f212571B)) {
            map.put("encrypted_rsa_sign", URLEncoder.encode(payInfo.f212571B));
        }
        map2.put("uuid", payInfo.f212593n);
        map2.put("appid", payInfo.f212594o);
        map2.put("appsource", payInfo.f212595p);
        map2.put("channel", payInfo.f212589g + "");
        map2.put("devicename", C87203t.m108275k());
        map2.put("soter_req", payInfo.f212576G);
    }

    public static void getRetModel(int i, int i2, String str, C75120i iVar) {
        if (i != 0 || i2 != 0) {
            Log.m105928w(TAG, "hy: resolve system error.");
            Map<String, String> parseXml = XmlParser.parseXml(str, "e", (String) null);
            if (parseXml != null) {
                Log.m105918d(TAG, "hy: CDN error!");
                iVar.f221054c = parseXml.get(".e.Content");
            } else if (i2 == -1 || i2 == -500) {
                Log.m105928w(TAG, "hy: network error");
                iVar.f221054c = MMApplicationContext.getContext().getString(C0966R.string.kzk);
            } else {
                Log.m105928w(TAG, "hy: unknown system error");
                iVar.f221054c = MMApplicationContext.getContext().getString(C0966R.string.krp);
            }
        }
    }
}
