package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.RefreshLuckyMoneyEnvelopeListEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import f32.C75672b;
import gy3.C87412m;
import java.util.Map;
import ke3.C88144b;
import kotlin.Metadata;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.g */
public final class C6239g extends C15053a {

    /* renamed from: d */
    public static final C6239g f23003d = new C6239g();

    /* renamed from: e */
    public static final String f23004e = "MicroMsg.JsApiGetRedPacketDone";

    /* renamed from: f */
    public static final int f23005f = 365;

    /* renamed from: g */
    public static final String f23006g = "getRedPacketDone";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/g$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.g$a */
    public static final class C6240a implements C80916r<Bundle, IPCVoid> {
        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                boolean z = bundle.getBoolean("shouldShowRedDot");
                boolean z2 = bundle.getBoolean("isNeedRefresh");
                C6239g.f23003d.getClass();
                String str = C6239g.f23004e;
                Log.m105924i(str, "get red packet: " + z + ", " + z2);
                ((C75672b) C86312j.m106911c(C75672b.class)).mo95329wA(z, z2);
                RefreshLuckyMoneyEnvelopeListEvent refreshLuckyMoneyEnvelopeListEvent = new RefreshLuckyMoneyEnvelopeListEvent();
                refreshLuckyMoneyEnvelopeListEvent.f9424d.f9425a = z2;
                refreshLuckyMoneyEnvelopeListEvent.publish();
            }
            IPCVoid iPCVoid = IPCVoid.f10316d;
            C87412m.m108593f(iPCVoid, "VOID");
            return iPCVoid;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.g$b */
    public static final class C6241b implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23007d;

        /* renamed from: e */
        public final /* synthetic */ C13851h1 f23008e;

        public C6241b(C13855j jVar, C13851h1 h1Var) {
            this.f23007d = jVar;
            this.f23008e = h1Var;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            C6239g.f23003d.getClass();
            String str = C6239g.f23004e;
            Log.m105924i(str, "on select envelope result: " + i2);
            if (i != 207) {
                return;
            }
            if (i2 == -1) {
                C13849g gVar = this.f23007d.f39001d;
                String str2 = this.f23008e.f38990c;
                gVar.mo10774a(str2, this.f23008e.f38996i + ":ok confirm", (Map<String, Object>) null);
                return;
            }
            C13849g gVar2 = this.f23007d.f39001d;
            String str3 = this.f23008e.f38990c;
            gVar2.mo10774a(str3, this.f23008e.f38996i + ":ok cancel", (Map<String, Object>) null);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = f23004e;
        Log.m105924i(str, "do get red packet done: " + h1Var.f38983a);
        boolean b = C87412m.m108589b(h1Var.f38983a.get("shouldShowRedDot"), "1");
        boolean b2 = C87412m.m108589b(h1Var.f38983a.get("isNeedRefresh"), "1");
        boolean b3 = C87412m.m108589b(h1Var.f38983a.get("shouldOpenSelectSkinPage"), "1");
        Log.m105924i(str, "isNeedRefresh: " + h1Var.f38983a.get("isNeedRefresh") + ", shouldShowRedDot: " + h1Var.f38983a.get("shouldShowRedDot") + ", shouldOpenSelectSkinPage: " + b3 + ", packageId: " + h1Var.f38983a.get("packetId"));
        Bundle bundle = new Bundle();
        bundle.putBoolean("shouldShowRedDot", b);
        bundle.putBoolean("isNeedRefresh", b2);
        C80907o.m98783f(WeChatProcess.PROCESS_MAIN, bundle, C6240a.class);
        if (b3) {
            Intent intent = new Intent();
            Object obj = h1Var.f38983a.get("packetId");
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
            intent.putExtra("packetId", (String) obj);
            Context context = jVar.f38998a;
            if (context instanceof MMActivity) {
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((MMActivity) context).mmSetOnActivityResultCallback(new C6241b(jVar, h1Var));
            }
            C88144b.m109795m(jVar.f38998a, "luckymoney", ".ui.LuckyMoneyPickEnvelopeUI", intent, 207);
            return true;
        }
        C13849g gVar = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar.mo10774a(str2, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23005f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23006g;
    }
}
