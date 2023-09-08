package com.tencent.p014mm.opensdk.diffdev.p315a;

import android.os.AsyncTask;
import android.util.Base64;
import com.tencent.p014mm.opensdk.channel.p943a.C81053a;
import com.tencent.p014mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.p014mm.opensdk.diffdev.OAuthListener;
import com.tencent.p014mm.opensdk.utils.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.opensdk.diffdev.a.b */
public class C17826b extends AsyncTask<Void, Void, C17827a> {

    /* renamed from: a */
    private String f49099a;

    /* renamed from: b */
    private String f49100b;

    /* renamed from: c */
    private String f49101c;

    /* renamed from: d */
    private String f49102d;

    /* renamed from: e */
    private String f49103e;

    /* renamed from: f */
    private OAuthListener f49104f;

    /* renamed from: g */
    private C17828c f49105g;

    /* renamed from: com.tencent.mm.opensdk.diffdev.a.b$a */
    public static class C17827a {

        /* renamed from: a */
        public OAuthErrCode f49106a;

        /* renamed from: b */
        public String f49107b;

        /* renamed from: c */
        public String f49108c;

        /* renamed from: d */
        public String f49109d;

        /* renamed from: e */
        public byte[] f49110e;

        private C17827a() {
        }

        /* renamed from: a */
        public static C17827a m18215a(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String format;
            C17827a aVar = new C17827a();
            if (bArr == null || bArr.length == 0) {
                Log.m99044e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                        int i = jSONObject.getInt("errcode");
                        if (i != 0) {
                            Log.m99044e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", new Object[]{Integer.valueOf(i)}));
                            aVar.f49106a = OAuthErrCode.WechatAuth_Err_NormalErr;
                            jSONObject.optString("errmsg");
                            return aVar;
                        }
                        String string = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                        if (string != null) {
                            if (string.length() != 0) {
                                byte[] decode = Base64.decode(string, 0);
                                if (decode != null) {
                                    if (decode.length != 0) {
                                        aVar.f49106a = OAuthErrCode.WechatAuth_Err_OK;
                                        aVar.f49110e = decode;
                                        aVar.f49107b = jSONObject.getString("uuid");
                                        String string2 = jSONObject.getString("appname");
                                        aVar.f49108c = string2;
                                        Log.m99043d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", new Object[]{aVar.f49107b, string2, Integer.valueOf(aVar.f49110e.length)}));
                                        return aVar;
                                    }
                                }
                                Log.m99044e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                                aVar.f49106a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                                return aVar;
                            }
                        }
                        Log.m99044e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                        aVar.f49106a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                        return aVar;
                    } catch (Exception e) {
                        format = String.format("parse json fail, ex = %s", new Object[]{e.getMessage()});
                        Log.m99044e("MicroMsg.SDK.GetQRCodeResult", format);
                        oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                        aVar.f49106a = oAuthErrCode;
                        return aVar;
                    }
                } catch (Exception e2) {
                    format = String.format("parse fail, build String fail, ex = %s", new Object[]{e2.getMessage()});
                    Log.m99044e("MicroMsg.SDK.GetQRCodeResult", format);
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.f49106a = oAuthErrCode;
                    return aVar;
                }
            }
            aVar.f49106a = oAuthErrCode;
            return aVar;
        }
    }

    public C17826b(String str, String str2, String str3, String str4, String str5, OAuthListener oAuthListener) {
        this.f49099a = str;
        this.f49100b = str2;
        this.f49101c = str3;
        this.f49102d = str4;
        this.f49103e = str5;
        this.f49104f = oAuthListener;
    }

    /* renamed from: a */
    public boolean mo22000a() {
        Log.m99045i("MicroMsg.SDK.GetQRCodeTask", "cancelTask");
        C17828c cVar = this.f49105g;
        return cVar == null ? cancel(true) : cVar.cancel(true);
    }

    public Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        Thread.currentThread().setName("OpenSdkGetQRCodeTask");
        Log.m99045i("MicroMsg.SDK.GetQRCodeTask", "doInBackground");
        String format = String.format("https://open.weixin.qq.com/connect/sdk/qrconnect?appid=%s&noncestr=%s&timestamp=%s&scope=%s&signature=%s", new Object[]{this.f49099a, this.f49101c, this.f49102d, this.f49100b, this.f49103e});
        long currentTimeMillis = System.currentTimeMillis();
        byte[] a = C81053a.m99036a(format, (int) CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        Log.m99043d("MicroMsg.SDK.GetQRCodeTask", String.format("doInBackground, url = %s, time consumed = %d(ms)", new Object[]{format, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
        return C17827a.m18215a(a);
    }

    public void onPostExecute(Object obj) {
        C17827a aVar = (C17827a) obj;
        OAuthErrCode oAuthErrCode = aVar.f49106a;
        if (oAuthErrCode == OAuthErrCode.WechatAuth_Err_OK) {
            Log.m99043d("MicroMsg.SDK.GetQRCodeTask", "onPostExecute, get qrcode success imgBufSize = " + aVar.f49110e.length);
            this.f49104f.onAuthGotQrcode(aVar.f49109d, aVar.f49110e);
            C17828c cVar = new C17828c(aVar.f49107b, this.f49104f);
            this.f49105g = cVar;
            cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        Log.m99044e("MicroMsg.SDK.GetQRCodeTask", String.format("onPostExecute, get qrcode fail, OAuthErrCode = %s", new Object[]{oAuthErrCode}));
        this.f49104f.onAuthFinish(aVar.f49106a, (String) null);
    }
}
