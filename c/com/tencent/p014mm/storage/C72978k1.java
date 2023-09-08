package com.tencent.p014mm.storage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45696d;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Map;
import ke3.C88144b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.storage.k1 */
public final class C72978k1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Map<String, String> f212789d;

    /* renamed from: e */
    public final /* synthetic */ Context f212790e;

    /* renamed from: f */
    public final /* synthetic */ C19623o0 f212791f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72978k1(Map<String, String> map, Context context, C19623o0 o0Var) {
        super(0);
        this.f212789d = map;
        this.f212790e = context;
        this.f212791f = o0Var;
    }

    public Object invoke() {
        String str;
        String str2;
        Class cls = C45696d.class;
        String a = C92721n.m116873a(this.f212789d.get(".msg.appmsg.mmreader.notify_msg.url"), 0, 10000, (int) (System.currentTimeMillis() / ((long) 1000)));
        String str3 = this.f212789d.get(".msg.appmsg.mmreader.category.item.title");
        String str4 = this.f212789d.get(".msg.appmsg.mmreader.category.item.cover");
        String str5 = this.f212789d.get(".msg.appmsg.mmreader.category.item.cover_1_1");
        String str6 = this.f212789d.get(".msg.appmsg.template_id");
        String str7 = this.f212789d.get(".msg.fromusername");
        if (str7 != null) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str7);
            str = z1Var != null ? z1Var.mo62909j3() : null;
            if (str == null) {
                str = str7;
            }
        } else {
            str = null;
        }
        int i = Util.getInt(this.f212789d.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
        Intent intent = new Intent();
        C19623o0 o0Var = this.f212791f;
        intent.putExtra("rawUrl", a);
        intent.putExtra("shortUrl", a);
        intent.putExtra("webpageTitle", str3);
        String str8 = str5;
        if (Util.isNullOrNil(str8)) {
            str8 = str4;
        }
        intent.putExtra("thumbUrl", str8);
        intent.putExtra("KTemplateId", str6);
        long j = o0Var.field_msgId;
        if (j >= 0) {
            intent.putExtra("msg_id", j);
        }
        intent.putExtra("KPublisherId", "msg_" + o0Var.field_msgSvrId);
        intent.putExtra("pre_username", o0Var.field_talker);
        intent.putExtra("prePublishId", "msg_" + o0Var.field_msgSvrId);
        intent.putExtra("preChatName", o0Var.field_talker);
        intent.putExtra("geta8key_username", o0Var.field_talker);
        if (!Util.isNullOrNil(str7) && !Util.isNullOrNil(str)) {
            intent.putExtra("srcUsername", str7);
            intent.putExtra("srcDisplayname", str);
            intent.putExtra("mode", 1);
        }
        intent.putExtra("message_id", o0Var.field_msgSvrId);
        intent.putExtra("from_scence", 1);
        intent.putExtra("start_activity_time", System.currentTimeMillis());
        intent.putExtra(C74928u.C45093i.f122318j, i);
        intent.addFlags(536870912);
        if (((C45696d) C86709a0.m107533q(cls)).mo70957E5(2)) {
            str2 = "rawUrl";
            if (((C45696d) C86709a0.m107533q(cls)).Ms0(this.f212790e, a, i, false, 0, 10000, intent)) {
                Log.m105924i("MicroMsg.BizTimeLineStorageLogicExKt", "jump to TmplWebview");
                return C13598b0.f38549a;
            }
        } else {
            str2 = "rawUrl";
        }
        intent.putExtra(str2, a);
        C88144b.m109791i(this.f212790e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return C13598b0.f38549a;
    }
}
