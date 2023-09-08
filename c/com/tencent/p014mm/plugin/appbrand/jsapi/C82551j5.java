package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiPrivateAddContact;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.j5 */
public class C82551j5 implements AppBrandProxyUIProcessTask.C81943b<JsApiPrivateAddContact.AddContactResult> {

    /* renamed from: a */
    public final /* synthetic */ C82381f f241655a;

    /* renamed from: b */
    public final /* synthetic */ int f241656b;

    /* renamed from: c */
    public final /* synthetic */ JsApiPrivateAddContact f241657c;

    public C82551j5(JsApiPrivateAddContact jsApiPrivateAddContact, C82381f fVar, int i) {
        this.f241657c = jsApiPrivateAddContact;
        this.f241655a = fVar;
        this.f241656b = i;
    }

    public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
        JsApiPrivateAddContact.AddContactResult addContactResult = (JsApiPrivateAddContact.AddContactResult) processResult;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf(addContactResult == null ? -1000 : addContactResult.f240442d);
        Log.m105925i("MicroMsg.JsApiPrivateAddContact", "onReceiveResult resultCode:%d", objArr);
        if (addContactResult == null) {
            this.f241655a.mo109647a(this.f241656b, this.f241657c.mo115109j("fail"));
            return;
        }
        int i = addContactResult.f240442d;
        if (i != -2) {
            if (i == -1) {
                this.f241655a.mo109647a(this.f241656b, this.f241657c.mo115109j("fail"));
                return;
            } else if (i == 0) {
                this.f241655a.mo109647a(this.f241656b, this.f241657c.mo115109j("cancel"));
                return;
            } else if (i != 1) {
                return;
            }
        }
        this.f241655a.mo109647a(this.f241656b, this.f241657c.mo115109j("ok"));
    }
}
