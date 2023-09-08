package com.tencent.p014mm.qqlogin;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WebViewExWindowCloseEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p244tt.C14088e;
import p286zl.C16293k;
import rx3.C13598b0;
import xe3.C15672a;
import xe3.C15674c;
import ye3.C15986a;
import ye3.C15987b;
import ye3.C15988c;

/* renamed from: com.tencent.mm.qqlogin.ChangeQQLoginTypeManager */
public final class ChangeQQLoginTypeManager {

    /* renamed from: a */
    public static final ChangeQQLoginTypeManager f24095a = new ChangeQQLoginTypeManager();

    /* renamed from: b */
    public static C16293k.C16295b f24096b = null;

    /* renamed from: c */
    public static String f24097c = "";

    /* renamed from: d */
    public static WebViewExWindowCloseEvent f24098d;

    /* renamed from: com.tencent.mm.qqlogin.ChangeQQLoginTypeManager$a */
    public static final class C6696a extends C87413o implements C32226l<Bundle, C13598b0> {

        /* renamed from: d */
        public static final C6696a f24099d = new C6696a();

        public C6696a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                ChangeQQLoginTypeManager changeQQLoginTypeManager = ChangeQQLoginTypeManager.f24095a;
                ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(MMApplicationContext.getContext(), bundle, true, true, new C15988c(bundle));
            }
            return C13598b0.f38549a;
        }
    }

    static {
        new ChangeQQLoginTypeManager$exWindowCloseEventIListener$1(C40008f.f107254d).alive();
    }

    /* renamed from: a */
    public static final void m7005a() {
        C6696a aVar = C6696a.f24099d;
        C87412m.m108594g(aVar, "callback");
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, null, C15672a.class, new C15987b(aVar));
    }

    /* renamed from: b */
    public final void mo7624b(WebViewExWindowCloseEvent webViewExWindowCloseEvent) {
        C87412m.m108594g(webViewExWindowCloseEvent, "event");
        Object obj = webViewExWindowCloseEvent.f9610d.f9612b.get("liteAppUuid");
        String str = obj instanceof String ? (String) obj : null;
        int parseInt = str != null ? Integer.parseInt(str) : 0;
        Object obj2 = webViewExWindowCloseEvent.f9610d.f9612b.get("liteAppPtr");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        long parseLong = str2 != null ? Long.parseLong(str2) : 0;
        Log.m105924i("MicroMsg.ChangeQQLoginTypeManager", "NEXT_ESCAPE_CHANGE_QQ_LOGIN, liteAppUuid=" + parseInt + " liteAppPtr=" + parseLong);
        ((C14088e) C86312j.m106911c(C14088e.class)).Ff0(parseInt, parseLong, new Intent());
        C80907o.m98781d(WeChatProcess.PROCESS_PUSH, null, C15674c.class, C15986a.f43033d);
        f24098d = null;
    }
}
