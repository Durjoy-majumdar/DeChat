package com.tencent.p014mm.plugin.appbrand.jsapi.scanner;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.jsapi.scanner.JsApiScanCode;
import com.tencent.p014mm.plugin.scanner.C5177x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLDecoder;
import java.util.HashMap;
import kr0.C88267e;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.c */
public class C1858c implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C88267e f11681a;

    /* renamed from: b */
    public final /* synthetic */ int f11682b;

    /* renamed from: c */
    public final /* synthetic */ JsApiScanCode f11683c;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.c$a */
    public class C1859a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JsApiScanCode.GetA8KeyTask f11684d;

        /* renamed from: e */
        public final /* synthetic */ HashMap f11685e;

        public C1859a(JsApiScanCode.GetA8KeyTask getA8KeyTask, HashMap hashMap) {
            this.f11684d = getA8KeyTask;
            this.f11685e = hashMap;
        }

        public void run() {
            this.f11684d.mo114397h();
            JsApiScanCode.GetA8KeyTask getA8KeyTask = this.f11684d;
            if (getA8KeyTask.f11670g == 26) {
                Uri parse = Uri.parse(getA8KeyTask.f11671h);
                if (C1858c.this.f11681a.getRuntime().mo113210l1().f234839s.equals(parse.getQueryParameter("username"))) {
                    this.f11685e.put("path", URLDecoder.decode(Util.nullAsNil(parse.getQueryParameter("path"))));
                }
            }
            C1858c cVar = C1858c.this;
            cVar.f11681a.mo109647a(cVar.f11682b, cVar.f11683c.mo115112m("ok", this.f11685e));
        }
    }

    public C1858c(JsApiScanCode jsApiScanCode, C88267e eVar, int i) {
        this.f11683c = jsApiScanCode;
        this.f11681a = eVar;
        this.f11682b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        String str;
        int i3;
        String str2;
        int i4 = 0;
        JsApiScanCode.f11668g = false;
        if (i != (this.f11683c.hashCode() & 65535)) {
            return false;
        }
        if (i2 == -1) {
            String encodeToString = Base64.encodeToString(new byte[0], 2);
            String str3 = "";
            if (intent != null) {
                str2 = intent.getStringExtra("key_scan_result");
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_scan_result_raw");
                if (byteArrayExtra != null) {
                    encodeToString = Base64.encodeToString(byteArrayExtra, 2);
                }
                str = intent.getStringExtra("key_scan_result_code_name");
                i3 = C5177x.m5204a(str);
                i4 = intent.getIntExtra("key_scan_result_code_version", 0);
            } else {
                str = null;
                str2 = str3;
                i3 = 0;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("charSet", "utf-8");
            hashMap.put("rawData", encodeToString);
            hashMap.put("codeVersion", Integer.valueOf(i4));
            if (i3 == 19 || i3 == 22) {
                if (i3 != 22) {
                    str3 = str2;
                }
                hashMap.put("result", str3);
                hashMap.put("scanType", i3 == 22 ? "WX_CODE" : "QR_CODE");
                if (NetStatusUtil.isConnected(this.f11681a.getContext())) {
                    Log.m105924i("MicroMsg.JsApiScanCode", "online mode");
                    JsApiScanCode.GetA8KeyTask getA8KeyTask = new JsApiScanCode.GetA8KeyTask();
                    getA8KeyTask.f11669f = str2;
                    getA8KeyTask.f11672i = i3;
                    getA8KeyTask.f11673j = i4;
                    getA8KeyTask.f11674n = new C1859a(getA8KeyTask, hashMap);
                    getA8KeyTask.mo114395c();
                } else {
                    Log.m105924i("MicroMsg.JsApiScanCode", "offline mode");
                    this.f11681a.mo109647a(this.f11682b, this.f11683c.mo115112m("ok", hashMap));
                }
            } else {
                hashMap.put("result", str2);
                hashMap.put("scanType", Util.nullAsNil(str));
                this.f11681a.mo109647a(this.f11682b, this.f11683c.mo115112m("ok", hashMap));
                return true;
            }
        } else if (i2 != 0) {
            this.f11681a.mo109647a(this.f11682b, this.f11683c.mo115109j("fail"));
        } else {
            this.f11681a.mo109647a(this.f11682b, this.f11683c.mo115109j("cancel"));
        }
        return true;
    }
}
