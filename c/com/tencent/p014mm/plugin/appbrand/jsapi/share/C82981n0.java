package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82388f7;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82976l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sendtowework.VideoData;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import ke3.C88144b;
import p225rc.C89916g;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.n0 */
public final class C82981n0 extends C87413o implements C32227p<Boolean, C82976l0.C29538a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<C82975k0, C13598b0> f242637d;

    /* renamed from: e */
    public final /* synthetic */ String f242638e;

    /* renamed from: f */
    public final /* synthetic */ String f242639f;

    /* renamed from: g */
    public final /* synthetic */ Activity f242640g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82981n0(C32226l<? super C82975k0, C13598b0> lVar, String str, String str2, Activity activity) {
        super(2);
        this.f242637d = lVar;
        this.f242638e = str;
        this.f242639f = str2;
        this.f242640g = activity;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C82976l0.C29538a aVar = (C82976l0.C29538a) obj2;
        C82975k0 k0Var = C82975k0.FAIL;
        if (!booleanValue) {
            Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, fail since video illegal");
            this.f242637d.invoke(k0Var);
        } else {
            String a = C82388f7.m101144a(this.f242638e, this.f242639f);
            if (a == null || a.length() == 0) {
                Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShare, thumbPath is empty");
                this.f242637d.invoke(k0Var);
            } else {
                C89916g.m112446a(this.f242640g).mo124232f(new C82978m0(this.f242637d, aVar, this.f242640g, this.f242638e, a));
                StringBuilder sb = new StringBuilder();
                sb.append("doShare, SHARE_VIDEO_REQUEST_CODE: ");
                int i = C82976l0.f242616a;
                sb.append(i);
                Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", sb.toString());
                Activity activity = this.f242640g;
                String str = this.f242638e;
                Intent intent = new Intent();
                intent.putExtra("image_path", a);
                intent.putExtra("Retr_Msg_Type", 1);
                intent.putExtra("Select_Conv_Type", 3);
                intent.putExtra("select_is_ret", true);
                intent.putExtra("mutil_select_is_ret", true);
                intent.putExtra("content_type_forward_to_wework", 3);
                intent.putExtra("Select_Data_Send_To_WeWork", new VideoData(C86013q1.m106448i(str, false)));
                C88144b.m109802t(activity, ".ui.transmit.SelectConversationUI", intent, i);
            }
        }
        return C13598b0.f38549a;
    }
}
