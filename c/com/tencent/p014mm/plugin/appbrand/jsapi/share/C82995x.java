package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sendtowework.FileData;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import ke3.C88144b;
import p225rc.C89916g;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.x */
public final class C82995x extends C87413o implements C32227p<Boolean, Long, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C82975k0, C13598b0> f242652d;

    /* renamed from: e */
    public final /* synthetic */ Activity f242653e;

    /* renamed from: f */
    public final /* synthetic */ String f242654f;

    /* renamed from: g */
    public final /* synthetic */ String f242655g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82995x(C32226l<? super C82975k0, C13598b0> lVar, Activity activity, String str, String str2) {
        super(2);
        this.f242652d = lVar;
        this.f242653e = activity;
        this.f242654f = str;
        this.f242655g = str2;
    }

    public Object invoke(Object obj, Object obj2) {
        Long l = (Long) obj2;
        if (!((Boolean) obj).booleanValue()) {
            Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", "doShare, fail since file illegal");
            this.f242652d.invoke(C82975k0.FAIL);
        } else {
            C89916g.m112446a(this.f242653e).mo124232f(new C82994w(this.f242652d, this.f242655g, this.f242654f));
            StringBuilder sb = new StringBuilder();
            sb.append("doShare, SHARE_VIDEO_REQUEST_CODE: ");
            int i = C82952a0.f242580a;
            sb.append(i);
            Log.m105924i("MicroMsg.AppBrand.JsApiShareFileMessage", sb.toString());
            Activity activity = this.f242653e;
            String str = this.f242654f;
            String str2 = this.f242655g;
            Intent intent = new Intent();
            intent.putExtra("desc_title", str);
            intent.putExtra("Retr_Msg_Type", 3);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("from_scene_forward_to_wework", 6);
            intent.putExtra("content_type_forward_to_wework", 4);
            intent.putExtra("Select_Data_Send_To_WeWork", new FileData(C86013q1.m106448i(str2, false), l, str));
            C88144b.m109802t(activity, ".ui.transmit.SelectConversationUI", intent, i);
        }
        return C13598b0.f38549a;
    }
}
