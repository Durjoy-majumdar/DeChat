package com.tencent.p014mm.plugin.biz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import kotlin.Metadata;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.biz.h */
public final class C2077h implements C88144b.C9615g {

    /* renamed from: d */
    public final String f12031d = "MicroMsg.PluginBizHelper";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/biz/h$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-biz_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.biz.h$a */
    public static final class C2078a implements C80883e<IPCVoid, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C87412m.m108594g(gVar, "callback");
            ((C45696d) C86709a0.m107533q(C45696d.class)).Bw0(MMApplicationContext.getContext(), new C2076g(gVar));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/biz/h$b;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-biz_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.biz.h$b */
    public static final class C2079b implements C80916r<IPCVoid, IPCBoolean> {
        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            return new IPCBoolean(((C45696d) C86709a0.m107533q(C45696d.class)).mo70993g3());
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.h$c */
    public static final class C2080c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f12032d;

        /* renamed from: e */
        public final /* synthetic */ C2077h f12033e;

        /* renamed from: f */
        public final /* synthetic */ String f12034f;

        /* renamed from: g */
        public final /* synthetic */ Intent f12035g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2080c(Context context, C2077h hVar, String str, Intent intent) {
            super(1);
            this.f12032d = context;
            this.f12033e = hVar;
            this.f12034f = str;
            this.f12035g = intent;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Context context = this.f12032d;
                Context context2 = (!(context instanceof Activity) || !((Activity) context).isFinishing()) ? this.f12032d : MMApplicationContext.getContext();
                C2077h hVar = this.f12033e;
                C87412m.m108593f(context2, "useReplayContext");
                hVar.mo2010q(context2, this.f12034f, this.f12035g);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.biz.h$d */
    public static final class C2081d<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C2077h f12036d;

        /* renamed from: e */
        public final /* synthetic */ Context f12037e;

        /* renamed from: f */
        public final /* synthetic */ String f12038f;

        /* renamed from: g */
        public final /* synthetic */ Intent f12039g;

        public C2081d(C2077h hVar, Context context, String str, Intent intent) {
            this.f12036d = hVar;
            this.f12037e = context;
            this.f12038f = str;
            this.f12039g = intent;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCBoolean iPCBoolean = (IPCBoolean) obj;
            boolean z = true;
            if (iPCBoolean == null || !iPCBoolean.f10312d) {
                z = false;
            }
            if (z) {
                this.f12036d.mo2010q(this.f12037e, this.f12038f, this.f12039g);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2009d(android.content.Context r6, java.lang.String r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.Class<ex0.d> r0 = ex0.C45696d.class
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r6, r1)
            java.lang.String r1 = "activity"
            gy3.C87412m.m108594g(r7, r1)
            r1 = 0
            if (r8 != 0) goto L_0x0010
            return r1
        L_0x0010:
            java.lang.String r2 = "webview"
            boolean r3 = z04.C112551y.m153819s(r7, r2, r1)
            r4 = 1
            if (r3 != 0) goto L_0x0024
            java.lang.String r3 = "brandservice"
            boolean r3 = z04.C112551y.m153819s(r7, r3, r1)
            if (r3 != 0) goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x006d
        L_0x0024:
            boolean r2 = z04.C112550d0.m153801u(r7, r2, r4)
            if (r2 == 0) goto L_0x005a
            java.lang.String r2 = "rawUrl"
            java.lang.String r2 = r8.getStringExtra(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x0038
            goto L_0x0053
        L_0x0038:
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = r2.getHost()
            if (r3 == 0) goto L_0x0050
            java.lang.String r2 = r2.getHost()
            java.lang.String r3 = "mp.weixin.qq.com"
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x0050
            r2 = 1
            goto L_0x0051
        L_0x0050:
            r2 = 0
        L_0x0051:
            if (r2 != 0) goto L_0x0055
        L_0x0053:
            r2 = 0
            goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            if (r2 == 0) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            if (r2 != 0) goto L_0x005e
            goto L_0x0022
        L_0x005e:
            java.lang.String r2 = "float_ball_key"
            java.lang.String r2 = r8.getStringExtra(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x006c
            goto L_0x0022
        L_0x006c:
            r2 = 1
        L_0x006d:
            if (r2 != 0) goto L_0x0070
            return r1
        L_0x0070:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r2 == 0) goto L_0x0095
            k40.a r2 = f40.C86709a0.m107533q(r0)
            ex0.d r2 = (ex0.C45696d) r2
            boolean r2 = r2.mo70993g3()
            if (r2 != 0) goto L_0x00b7
            k40.a r0 = f40.C86709a0.m107533q(r0)
            ex0.d r0 = (ex0.C45696d) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.biz.h$c r2 = new com.tencent.mm.plugin.biz.h$c
            r2.<init>(r6, r5, r7, r8)
            r0.Bw0(r1, r2)
            return r4
        L_0x0095:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.ipcinvoker.type.IPCVoid r2 = com.tencent.p014mm.ipcinvoker.type.IPCVoid.f10316d
            java.lang.Class<com.tencent.mm.plugin.biz.h$b> r3 = com.tencent.p014mm.plugin.biz.C2077h.C2079b.class
            java.lang.Object r3 = com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98749b(r0, r2, r3)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r3 = (com.tencent.p014mm.ipcinvoker.type.IPCBoolean) r3
            if (r3 == 0) goto L_0x00a9
            boolean r3 = r3.f10312d
            if (r3 != 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            if (r3 == 0) goto L_0x00b7
            java.lang.Class<com.tencent.mm.plugin.biz.h$a> r1 = com.tencent.p014mm.plugin.biz.C2077h.C2078a.class
            com.tencent.mm.plugin.biz.h$d r3 = new com.tencent.mm.plugin.biz.h$d
            r3.<init>(r5, r6, r7, r8)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r2, r1, r3)
            return r4
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.biz.C2077h.mo2009d(android.content.Context, java.lang.String, android.content.Intent):boolean");
    }

    /* renamed from: q */
    public final void mo2010q(Context context, String str, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(intent, "intent");
        try {
            int E = C112550d0.m153769E(str, ".", 0, false, 6, (Object) null);
            String substring = str.substring(0, E);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = str.substring(E);
            C87412m.m108593f(substring2, "this as java.lang.String).substring(startIndex)");
            C88144b.m109791i(context, substring, substring2, intent, (Bundle) null);
        } catch (Exception e) {
            Log.m105921e(this.f12031d, "reload webView fail! %s", e.getMessage());
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
