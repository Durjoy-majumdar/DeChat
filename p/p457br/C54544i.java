package p457br;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.webview.C41637m;
import com.tencent.p014mm.plugin.finder.webview.C41647w;
import com.tencent.p014mm.plugin.finder.webview.FinderWebViewHelper;
import com.tencent.p014mm.plugin.findersdk.receiver.HeadsetReceiver;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.Html5Info;
import com.tencent.p014mm.protocal.protobuf.MiniAppInfo;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import di0.C86299o;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60194q2;
import java.util.UUID;
import jq3.C60905o;
import mt1.C88848a;
import pe3.C89349b;
import pf1.C11920q;
import pf1.C62262d0;
import rs1.C48085q4;
import te3.C52267zi;
import z04.C119027c;
import zs1.C39444l;

@C86522b
/* renamed from: br.i */
public final class C54544i extends C86301e implements C60194q2 {
    public C41647w G30(Context context, String str, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "url");
        C52267zi ziVar = new C52267zi();
        ziVar.f145967e = UUID.randomUUID().toString();
        ziVar.f145968f = str;
        FinderWebViewHelper finderWebViewHelper = new FinderWebViewHelper(context, ziVar, (Window) null, i, 4, (C8480h) null);
        Window window = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            window = activity.getWindow();
        }
        finderWebViewHelper.setDialogWindow(window);
        return finderWebViewHelper;
    }

    /* renamed from: Sv */
    public void mo75416Sv(Context context, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, float f) {
        String str8 = str2;
        String str9 = str7;
        Context context2 = context;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "_appId");
        C87412m.m108594g(str8, "_appUsername");
        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
        MiniAppInfo miniAppInfo = new MiniAppInfo();
        miniAppInfo.app_id = str;
        miniAppInfo.path = str3;
        miniAppInfo.fetch_info_id = str4;
        miniAppInfo.request_id = str6;
        miniAppInfo.appusername = str8;
        int i = 0;
        if (str9 != null) {
            byte[] bytes = str9.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            miniAppInfo.extra_data = new C89349b(bytes, 0, bytes.length);
        }
        if (num != null) {
            i = num.intValue();
        }
        miniAppInfo.scene = i;
        finderJumpInfo.mini_app_info = miniAppInfo;
        C11920q qVar = new C11920q(finderJumpInfo);
        qVar.f34837k = new C86299o();
        qVar.f34836j = str5;
        C62262d0.m73170n(C62262d0.f176978a, context, qVar, 0, true, (C60905o) null, f, 20, (Object) null);
    }

    /* renamed from: Ua */
    public boolean mo75417Ua(Context context) {
        C87412m.m108594g(context, "context");
        return ((C48085q4) C39818r.f106831a.mo62443b(context).mo75002a(C48085q4.class)).onBackPressed();
    }

    /* renamed from: lL */
    public void mo75418lL(Context context, String str, int i, float f) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "url");
        FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
        finderJumpInfo.jumpinfo_type = 2;
        Html5Info html5Info = new Html5Info();
        html5Info.url = str;
        html5Info.style = 1;
        finderJumpInfo.html5_info = html5Info;
        C41637m.m44984a(context, str, new C11920q(finderJumpInfo), (RecyclerViewDrawerSquares.C45117c) null, new C39444l(0, f, false, 5, (C8480h) null), i, "");
    }

    public C88848a tq0() {
        return new HeadsetReceiver();
    }
}
