package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.i */
public class C82333i implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ C81925i2 f241298a;

    /* renamed from: b */
    public final /* synthetic */ int f241299b;

    /* renamed from: c */
    public final /* synthetic */ JsApiChooseWeChatContact f241300c;

    public C82333i(JsApiChooseWeChatContact jsApiChooseWeChatContact, C81925i2 i2Var, int i) {
        this.f241300c = jsApiChooseWeChatContact;
        this.f241298a = i2Var;
        this.f241299b = i;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        if (this.f241300c.f241250g != i) {
            Log.m105921e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact requestCode not equal, requestCode = %d", Integer.valueOf(i));
            this.f241298a.mo109647a(this.f241299b, this.f241300c.mo115109j("fail"));
            return false;
        } else if (i2 == 0 || i2 == 1) {
            Log.m105921e("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact user cancel, resultCode = %d", Integer.valueOf(i));
            this.f241298a.mo109647a(this.f241299b, this.f241300c.mo115109j("cancel"));
            return true;
        } else {
            if (i2 == -1) {
                String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105920e("MicroMsg.JsApiChooseWeChatContact", "mmOnActivityResult, selectSingleContact fail, user is null");
                    this.f241298a.mo109647a(this.f241299b, this.f241300c.mo115109j("fail"));
                } else {
                    JsApiChooseWeChatContact.GetUserDataTask getUserDataTask = new JsApiChooseWeChatContact.GetUserDataTask(stringExtra);
                    getUserDataTask.mo114396f();
                    String str = getUserDataTask.f241253h;
                    String str2 = getUserDataTask.f241254i;
                    String str3 = getUserDataTask.f241255j;
                    HashMap hashMap = new HashMap();
                    hashMap.put("avatarUrl", str3);
                    hashMap.put("userName", stringExtra);
                    hashMap.put("nickName", str);
                    hashMap.put("remarkName", str2);
                    Log.m105925i("MicroMsg.JsApiChooseWeChatContact", "selectSingleContact: nickName:%s, remarkName:%s", str, str2);
                    this.f241298a.mo109647a(this.f241299b, this.f241300c.mo115112m("ok", hashMap));
                }
            }
            return true;
        }
    }
}
