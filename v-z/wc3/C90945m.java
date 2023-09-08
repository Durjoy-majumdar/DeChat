package wc3;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.camera.core.FocusMeteringAction;
import c30.C104289g;
import c30.C26827e;
import c30.C79923f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.WXChannelOpenEvent;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di0.C86300q;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75597w2;
import f40.C86709a0;
import ht1.C60216z4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76630x0;
import ob0.C11385n;
import ob0.C117747y;
import p154fy.C87120h;
import p154fy.C87121j;
import p225rc.C89925n;
import p728vs.C52990d;
import p728vs.C52991e;
import p763ym.C79138l;
import qe3.C12212g;
import te3.C52064y4;
import te3.C52319zw3;
import te3.wj4;
import yo0.C91535b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: wc3.m */
public final class C90945m {

    /* renamed from: a */
    public static final String f260967a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/deeplink/noaccess#wechat_redirect");

    /* renamed from: b */
    public static boolean f260968b = false;

    /* renamed from: c */
    public static final String f260969c = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/security");

    /* renamed from: d */
    public static final String f260970d = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmh) + "/security");

    /* renamed from: e */
    public static String f260971e = "";

    /* renamed from: f */
    public static final Map<String, Long> f260972f;

    /* renamed from: wc3.m$e */
    public class C15139e implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ Intent f41266a;

        /* renamed from: b */
        public final /* synthetic */ Context f41267b;

        public C15139e(Intent intent, Context context) {
            this.f41266a = intent;
            this.f41267b = context;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            if (!z) {
                Log.m105921e("MicroMsg.DeepLinkHelper", "getContact fail, %s", str);
                return;
            }
            this.f41266a.putExtra("Chat_User", str);
            try {
                Context context = this.f41267b;
                if (context != null) {
                    Intent intent = this.f41266a;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/DeepLinkHelper$5", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/pluginsdk/DeepLinkHelper$5", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                Context context2 = MMApplicationContext.getContext();
                Intent intent2 = this.f41266a;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/DeepLinkHelper$5", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/pluginsdk/DeepLinkHelper$5", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.DeepLinkHelper", e, "", "");
            }
        }
    }

    /* renamed from: wc3.m$a */
    public class C53146a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ Context f148284d;

        /* renamed from: e */
        public final /* synthetic */ int f148285e;

        /* renamed from: f */
        public final /* synthetic */ String f148286f;

        /* renamed from: g */
        public final /* synthetic */ String f148287g;

        /* renamed from: h */
        public final /* synthetic */ C53147h f148288h;

        public C53146a(Context context, int i, String str, String str2, C53147h hVar) {
            this.f148284d = context;
            this.f148285e = i;
            this.f148286f = str;
            this.f148287g = str2;
            this.f148288h = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x0162  */
        /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r21, int r22, java.lang.String r23, ob0.C117747y r24) {
            /*
                r20 = this;
                r1 = r20
                r6 = r24
                ob0.b0 r0 = f40.C86709a0.m107524d()
                r2 = 233(0xe9, float:3.27E-43)
                r0.mo123470p(r2, r1)
                r2 = 3
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
                r4 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r0[r4] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
                r7 = 1
                r0[r7] = r3
                r3 = 2
                r0[r3] = r23
                java.lang.String r8 = "MicroMsg.DeepLinkHelper"
                java.lang.String r9 = "[oneliang][doDeepLink][onSceneEnd]:errType:%s,errCode:%s,errMsg:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r0)
                if (r6 == 0) goto L_0x015d
                boolean r0 = r6 instanceof p728vs.C52991e
                if (r0 == 0) goto L_0x015d
                r0 = r6
                vs.e r0 = (p728vs.C52991e) r0
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "bitset:"
                r9.append(r10)
                long r10 = r0.mo63057J0()
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r9)
                long r9 = r0.mo63057J0()
                java.lang.String r11 = r0.mo63062R()
                java.lang.String r11 = wc3.C90945m.m114069s(r11)
                boolean r9 = wc3.C90945m.m114065o(r11, r9)
                r10 = 5
                r15 = 11405(0x2c8d, float:1.5982E-41)
                r14 = 4
                if (r9 == 0) goto L_0x00e8
                java.lang.String r9 = "[oneliang] uri: %s"
                java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00ba }
                r12[r4] = r11     // Catch:{ Exception -> 0x00ba }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r12)     // Catch:{ Exception -> 0x00ba }
                android.content.Context r12 = r1.f148284d     // Catch:{ Exception -> 0x00ba }
                int r17 = r0.getCurrentSessionId()     // Catch:{ Exception -> 0x00ba }
                byte[] r18 = r0.mo63063U()     // Catch:{ Exception -> 0x00ba }
                r0 = 0
                r9 = 0
                r16 = 0
                r19 = 0
                r13 = r11
                r14 = r0
                r15 = r9
                boolean r9 = wc3.C90945m.m114063m(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00b5 }
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00b0 }
                java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x00b0 }
                r12[r4] = r11     // Catch:{ Exception -> 0x00b0 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00b0 }
                r12[r7] = r13     // Catch:{ Exception -> 0x00b0 }
                int r13 = r1.f148285e     // Catch:{ Exception -> 0x00b0 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x00b0 }
                r12[r3] = r13     // Catch:{ Exception -> 0x00b0 }
                java.lang.String r13 = r1.f148286f     // Catch:{ Exception -> 0x00b0 }
                r12[r2] = r13     // Catch:{ Exception -> 0x00b0 }
                java.lang.String r13 = r1.f148287g     // Catch:{ Exception -> 0x00b0 }
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)     // Catch:{ Exception -> 0x00b0 }
                r14 = 4
                r12[r14] = r13     // Catch:{ Exception -> 0x00ac }
                r13 = 11405(0x2c8d, float:1.5982E-41)
                r0.mo160131h(r13, r12)     // Catch:{ Exception -> 0x00aa }
                goto L_0x00e6
            L_0x00aa:
                r0 = move-exception
                goto L_0x00be
            L_0x00ac:
                r0 = move-exception
                r13 = 11405(0x2c8d, float:1.5982E-41)
                goto L_0x00be
            L_0x00b0:
                r0 = move-exception
                r13 = 11405(0x2c8d, float:1.5982E-41)
                r14 = 4
                goto L_0x00be
            L_0x00b5:
                r0 = move-exception
                r13 = 11405(0x2c8d, float:1.5982E-41)
                r14 = 4
                goto L_0x00bd
            L_0x00ba:
                r0 = move-exception
                r13 = 11405(0x2c8d, float:1.5982E-41)
            L_0x00bd:
                r9 = 0
            L_0x00be:
                java.lang.Object[] r12 = new java.lang.Object[r7]
                java.lang.String r15 = ""
                r12[r4] = r15
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r15, r12)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r8 = new java.lang.Object[r10]
                r8[r4] = r11
                r8[r7] = r5
                int r4 = r1.f148285e
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r8[r3] = r4
                java.lang.String r3 = r1.f148286f
                r8[r2] = r3
                java.lang.String r2 = r1.f148287g
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                r8[r14] = r2
                r0.mo160131h(r13, r8)
            L_0x00e6:
                r7 = r9
                goto L_0x015e
            L_0x00e8:
                r13 = 11405(0x2c8d, float:1.5982E-41)
                java.lang.String r9 = "[oneliang] no permission"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                int r8 = r0.mo63058K()
                r9 = 49
                if (r8 == r9) goto L_0x014f
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                r9 = 268435456(0x10000000, float:2.5243549E-29)
                r8.setFlags(r9)
                android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r12 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
                r8.setClassName(r9, r12)
                java.lang.String r9 = wc3.C90945m.f260967a
                java.lang.String r15 = "rawUrl"
                r8.putExtra(r15, r9)
                int r9 = r0.getCurrentSessionId()
                java.lang.String r15 = "geta8key_session_id"
                r8.putExtra(r15, r9)
                byte[] r0 = r0.mo63063U()
                java.lang.String r9 = "geta8key_cookie"
                r8.putExtra(r9, r0)
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r9 = 0
                java.lang.String r15 = "webview"
                ke3.C88144b.m109791i(r0, r15, r12, r8, r9)
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r8 = new java.lang.Object[r10]
                r8[r4] = r11
                r8[r7] = r5
                int r4 = r1.f148285e
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r8[r3] = r4
                java.lang.String r3 = r1.f148286f
                r8[r2] = r3
                java.lang.String r2 = r1.f148287g
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                r8[r14] = r2
                r0.mo160131h(r13, r8)
                goto L_0x015e
            L_0x014f:
                java.lang.Class<nj2.c> r0 = nj2.C109749c.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                nj2.c r0 = (nj2.C109749c) r0
                android.content.Context r2 = r1.f148284d
                r0.Yb0(r2, r14)
                goto L_0x015e
            L_0x015d:
                r7 = 0
            L_0x015e:
                wc3.m$h r2 = r1.f148288h
                if (r2 == 0) goto L_0x016d
                r3 = r21
                r4 = r22
                r5 = r23
                r6 = r24
                r2.mo62709c(r3, r4, r5, r6, r7)
            L_0x016d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wc3.C90945m.C53146a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: wc3.m$h */
    public interface C53147h {
        /* renamed from: c */
        void mo62709c(int i, int i2, String str, C117747y yVar, boolean z);
    }

    /* renamed from: wc3.m$b */
    public class C90946b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ boolean f260973d;

        /* renamed from: e */
        public final /* synthetic */ C53147h f260974e;

        /* renamed from: f */
        public final /* synthetic */ String f260975f;

        /* renamed from: g */
        public final /* synthetic */ Bundle f260976g;

        /* renamed from: h */
        public final /* synthetic */ Context f260977h;

        /* renamed from: i */
        public final /* synthetic */ int f260978i;

        /* renamed from: wc3.m$b$a */
        public class C90947a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C117747y f260979d;

            /* renamed from: e */
            public final /* synthetic */ int f260980e;

            /* renamed from: f */
            public final /* synthetic */ int f260981f;

            /* renamed from: g */
            public final /* synthetic */ String f260982g;

            /* renamed from: wc3.m$b$a$a */
            public class C90948a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f260984d;

                /* renamed from: e */
                public final /* synthetic */ wj4 f260985e;

                public C90948a(String str, wj4 wj4) {
                    this.f260984d = str;
                    this.f260985e = wj4;
                }

                /* JADX WARNING: Removed duplicated region for block: B:62:0x0183  */
                /* JADX WARNING: Removed duplicated region for block: B:71:0x01fe  */
                /* JADX WARNING: Removed duplicated region for block: B:74:0x0205  */
                /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r30 = this;
                        r1 = r30
                        wc3.m$b$a r0 = wc3.C90945m.C90946b.C90947a.this
                        wc3.m$b r2 = wc3.C90945m.C90946b.this
                        java.lang.String r14 = r1.f260984d
                        int r15 = r0.f260980e
                        int r13 = r0.f260981f
                        java.lang.String r12 = r0.f260982g
                        te3.wj4 r3 = r1.f260985e
                        ob0.y r11 = r0.f260979d
                        r2.getClass()
                        r10 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r10]
                        r9 = 0
                        java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
                        r0[r9] = r14
                        java.lang.String r8 = "MicroMsg.DeepLinkHelper"
                        java.lang.String r4 = "doTicketsDeepLink deepLinkUri: %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r0)
                        if (r3 == 0) goto L_0x002b
                        int r0 = r3.f144107s
                        goto L_0x002c
                    L_0x002b:
                        r0 = 0
                    L_0x002c:
                        java.lang.String r7 = ""
                        if (r3 == 0) goto L_0x0035
                        java.lang.String r4 = r3.f144108t
                        r17 = r4
                        goto L_0x0037
                    L_0x0035:
                        r17 = r7
                    L_0x0037:
                        boolean r4 = wc3.C90945m.m114053c(r14)
                        r18 = 3
                        r19 = 0
                        r6 = 4
                        r5 = 2
                        if (r4 == 0) goto L_0x0108
                        java.lang.String r3 = "doTicketsDeepLink: deepLinkUri = %s, extraData: %s"
                        java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00cd }
                        r4[r9] = r14     // Catch:{ Exception -> 0x00cd }
                        android.os.Bundle r5 = r2.f260976g     // Catch:{ Exception -> 0x00cd }
                        r4[r10] = r5     // Catch:{ Exception -> 0x00cd }
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)     // Catch:{ Exception -> 0x00cd }
                        android.content.Context r3 = r2.f260977h     // Catch:{ Exception -> 0x00cd }
                        int r5 = r2.f260978i     // Catch:{ Exception -> 0x00cd }
                        android.os.Bundle r4 = r2.f260976g     // Catch:{ Exception -> 0x00cd }
                        java.lang.String r10 = r2.f260975f     // Catch:{ Exception -> 0x00cd }
                        r23 = r5
                        wc3.m$h r5 = r2.f260974e     // Catch:{ Exception -> 0x00cd }
                        int r24 = qe3.C12212g.m11775a()     // Catch:{ Exception -> 0x00cd }
                        r25 = r5
                        byte[] r5 = new byte[r9]     // Catch:{ Exception -> 0x00cd }
                        r26 = 0
                        r27 = r4
                        r4 = r14
                        r20 = r23
                        r21 = r25
                        r1 = 11405(0x2c8d, float:1.5982E-41)
                        r25 = 2
                        r23 = r5
                        r5 = r26
                        r1 = 4
                        r6 = r20
                        r28 = r7
                        r7 = r27
                        r29 = r8
                        r8 = r24
                        r9 = r23
                        r20 = r11
                        r11 = r0
                        r22 = r12
                        r12 = r17
                        r17 = r13
                        r13 = r21
                        boolean r19 = wc3.C90945m.m114064n(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00c9 }
                        com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00c9 }
                        java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00c9 }
                        java.lang.String r4 = r2.f260975f     // Catch:{ Exception -> 0x00c9 }
                        r5 = 0
                        r3[r5] = r4     // Catch:{ Exception -> 0x00c7 }
                        int r4 = r2.f260978i     // Catch:{ Exception -> 0x00c7 }
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00c7 }
                        r6 = 1
                        r3[r6] = r4     // Catch:{ Exception -> 0x00c5 }
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00c5 }
                        r3[r25] = r4     // Catch:{ Exception -> 0x00c5 }
                        r3[r18] = r14     // Catch:{ Exception -> 0x00c5 }
                        r4 = 11405(0x2c8d, float:1.5982E-41)
                        r0.mo160131h(r4, r3)     // Catch:{ Exception -> 0x00c5 }
                        boolean r0 = wc3.C90945m.f260968b     // Catch:{ Exception -> 0x00c5 }
                        if (r0 == 0) goto L_0x00c2
                        android.content.Context r0 = r2.f260977h     // Catch:{ Exception -> 0x00c5 }
                        r3 = 2131833870(0x7f11340e, float:1.9300834E38)
                        java.lang.String r12 = r0.getString(r3)     // Catch:{ Exception -> 0x00c5 }
                        wc3.C90945m.f260968b = r5     // Catch:{ Exception -> 0x00c0 }
                        goto L_0x0103
                    L_0x00c0:
                        r0 = move-exception
                        goto L_0x00df
                    L_0x00c2:
                        r12 = r22
                        goto L_0x0103
                    L_0x00c5:
                        r0 = move-exception
                        goto L_0x00dd
                    L_0x00c7:
                        r0 = move-exception
                        goto L_0x00cb
                    L_0x00c9:
                        r0 = move-exception
                        r5 = 0
                    L_0x00cb:
                        r6 = 1
                        goto L_0x00dd
                    L_0x00cd:
                        r0 = move-exception
                        r28 = r7
                        r29 = r8
                        r20 = r11
                        r22 = r12
                        r17 = r13
                        r1 = 4
                        r5 = 0
                        r6 = 1
                        r25 = 2
                    L_0x00dd:
                        r12 = r22
                    L_0x00df:
                        java.lang.Object[] r3 = new java.lang.Object[r6]
                        r4 = r28
                        r3[r5] = r4
                        r7 = r29
                        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r3)
                        com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        java.lang.String r3 = r2.f260975f
                        r1[r5] = r3
                        int r3 = r2.f260978i
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                        r1[r6] = r3
                        r1[r25] = r16
                        r1[r18] = r14
                        r3 = 11405(0x2c8d, float:1.5982E-41)
                        r0.mo160131h(r3, r1)
                    L_0x0103:
                        r6 = r12
                        r8 = r19
                        goto L_0x0201
                    L_0x0108:
                        r4 = r7
                        r7 = r8
                        r20 = r11
                        r22 = r12
                        r17 = r13
                        r1 = 4
                        r5 = 0
                        r6 = 1
                        r25 = 2
                        java.lang.String r0 = "doTicketsDeepLink: translate failed"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
                        r0 = 268435456(0x10000000, float:2.5243549E-29)
                        java.lang.String r8 = "webview"
                        r9 = 0
                        java.lang.String r10 = "showShare"
                        java.lang.String r11 = "rawUrl"
                        java.lang.String r12 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
                        if (r15 != 0) goto L_0x012c
                        if (r17 == 0) goto L_0x0180
                    L_0x012c:
                        if (r3 == 0) goto L_0x0131
                        java.lang.String r3 = r3.f144105q
                        goto L_0x0132
                    L_0x0131:
                        r3 = r4
                    L_0x0132:
                        boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                        if (r4 != 0) goto L_0x0180
                        java.lang.Object[] r4 = new java.lang.Object[r6]
                        r4[r5] = r3
                        java.lang.String r13 = "doTicketsDeepLink goto redirectUrl: %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r13, r4)
                        java.lang.ref.WeakReference r4 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
                        if (r4 == 0) goto L_0x014d
                        java.lang.Object r13 = r4.get()
                        if (r13 != 0) goto L_0x0153
                    L_0x014d:
                        com.tencent.mm.app.AppForegroundDelegate r4 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
                        java.lang.ref.WeakReference r4 = r4.mo174212f()
                    L_0x0153:
                        android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                        if (r4 == 0) goto L_0x0166
                        java.lang.Object r21 = r4.get()
                        if (r21 == 0) goto L_0x0166
                        java.lang.Object r4 = r4.get()
                        r13 = r4
                        android.content.Context r13 = (android.content.Context) r13
                    L_0x0166:
                        android.content.Intent r4 = new android.content.Intent
                        r4.<init>()
                        boolean r6 = r13 instanceof android.app.Activity
                        if (r6 != 0) goto L_0x0172
                        r4.setFlags(r0)
                    L_0x0172:
                        r4.setClassName(r13, r12)
                        r4.putExtra(r11, r3)
                        r4.putExtra(r10, r5)
                        ke3.C88144b.m109791i(r13, r8, r12, r4, r9)
                        r3 = 1
                        goto L_0x0181
                    L_0x0180:
                        r3 = 0
                    L_0x0181:
                        if (r3 != 0) goto L_0x01fe
                        com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                        java.lang.Object[] r4 = new java.lang.Object[r1]
                        java.lang.String r6 = r2.f260975f
                        r4[r5] = r6
                        int r6 = r2.f260978i
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                        r13 = 1
                        r4[r13] = r6
                        r4[r25] = r16
                        r4[r18] = r14
                        r6 = 11405(0x2c8d, float:1.5982E-41)
                        r3.mo160131h(r6, r4)
                        int r4 = r2.f260978i
                        if (r4 != r13) goto L_0x01c9
                        wc3.m$h r6 = r2.f260974e
                        if (r6 == 0) goto L_0x01c9
                        java.lang.Object[] r0 = new java.lang.Object[r1]
                        java.lang.String r1 = r2.f260975f
                        r0[r5] = r1
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                        r0[r13] = r1
                        r0[r25] = r16
                        r0[r18] = r14
                        r1 = 11405(0x2c8d, float:1.5982E-41)
                        r3.mo160131h(r1, r0)
                        wc3.m$h r3 = r2.f260974e
                        r4 = r15
                        r5 = r17
                        r6 = r22
                        r7 = r20
                        r8 = r19
                        r3.mo62709c(r4, r5, r6, r7, r8)
                        goto L_0x020d
                    L_0x01c9:
                        android.content.Intent r1 = new android.content.Intent
                        r1.<init>()
                        r1.setFlags(r0)
                        android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                        r1.setClassName(r0, r12)
                        java.lang.String r0 = wc3.C90945m.f260967a
                        r1.putExtra(r11, r0)
                        r1.putExtra(r10, r5)
                        r3 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r3]
                        android.os.Bundle r4 = r2.f260976g
                        r0[r5] = r4
                        java.lang.String r4 = "doTicketsDeepLink goto WebViewUI extraData: %s"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r0)
                        android.os.Bundle r0 = r2.f260976g
                        if (r0 == 0) goto L_0x01f3
                        r1.putExtras(r0)
                    L_0x01f3:
                        android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                        ke3.C88144b.m109791i(r0, r8, r12, r1, r9)
                        r6 = r22
                        r8 = 1
                        goto L_0x0201
                    L_0x01fe:
                        r6 = r22
                        r8 = 0
                    L_0x0201:
                        wc3.m$h r3 = r2.f260974e
                        if (r3 == 0) goto L_0x020d
                        r4 = r15
                        r5 = r17
                        r7 = r20
                        r3.mo62709c(r4, r5, r6, r7, r8)
                    L_0x020d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: wc3.C90945m.C90946b.C90947a.C90948a.run():void");
                }
            }

            public C90947a(C117747y yVar, int i, int i2, String str) {
                this.f260979d = yVar;
                this.f260980e = i;
                this.f260981f = i2;
                this.f260982g = str;
            }

            public void run() {
                wj4 h = ((C87120h) this.f260979d).mo63047h();
                String H0 = ((C87120h) this.f260979d).mo63046H0();
                C90946b bVar = C90946b.this;
                String str = bVar.f260975f;
                Bundle bundle = bVar.f260976g;
                C87120h hVar = (C87120h) this.f260979d;
                String str2 = C90945m.f260967a;
                if (!(!str.startsWith("weixin://dl/channels/shareVideo/") || bundle == null || h == null)) {
                    C52319zw3 zw32 = h.f144109u;
                    Object[] objArr = new Object[1];
                    objArr[0] = zw32 != null ? Integer.valueOf(zw32.f146261d) : null;
                    Log.m105925i("MicroMsg.DeepLinkHelper", "fillTranslateLinkResponse finderInfoResult: %s", objArr);
                    if (zw32 != null) {
                        String string = bundle.getString("key_app_id");
                        bundle.putInt("key_finder_share_video_jump_info_state", zw32.f146261d);
                        bundle.putString("key_finder_share_video_jump_info_string", hVar.mo63050s(string));
                    }
                }
                ((C119157j) C119157j.f356862d).mo183895z(new C90948a(H0, h));
            }
        }

        public C90946b(boolean z, C53147h hVar, String str, Bundle bundle, Context context, int i) {
            this.f260973d = z;
            this.f260974e = hVar;
            this.f260975f = str;
            this.f260976g = bundle;
            this.f260977h = context;
            this.f260978i = i;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(1200, this);
            Log.m105925i("MicroMsg.DeepLinkHelper", "doTicketsDeepLink: errType = %s; errCode = %s; errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (!(yVar instanceof C87120h)) {
                return;
            }
            if (this.f260973d) {
                C53147h hVar = this.f260974e;
                if (hVar != null) {
                    hVar.mo62709c(i, i2, str, yVar, true);
                }
                Log.m105928w("MicroMsg.DeepLinkHelper", "doTicketsDeepLink justGetTranslateLinkResult, return");
                return;
            }
            ((C119157j) C119157j.f356862d).mo183870a(new C90947a(yVar, i, i2, str));
        }
    }

    /* renamed from: wc3.m$c */
    public class C90949c implements C60216z4.C8821a<Integer> {

        /* renamed from: a */
        public final /* synthetic */ String f260987a;

        public C90949c(String str) {
            this.f260987a = str;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            try {
                new C104289g().put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, num);
            } catch (C79923f e) {
                Log.printErrStackTrace("MicroMsg.DeepLinkHelper", e, "FINDER_OPEN_EVENT json expt", new Object[0]);
            }
            C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(this.f260987a);
            Bundle bundle = new Bundle();
            WXChannelOpenEvent.Resp resp = new WXChannelOpenEvent.Resp();
            if (num.intValue() == 400) {
                resp.errCode = 400;
                resp.extMsg = "";
                if (appInfo == null) {
                    Log.m105928w("MicroMsg.DeepLinkHelper", "can not find app info");
                    return;
                }
                resp.toBundle(bundle);
                MMessageActV2.Args args = new MMessageActV2.Args();
                args.targetPkgName = appInfo.field_packageName;
                args.bundle = bundle;
                C72688j0.m85024j(args);
                C72688j0.m85021g(bundle);
                C72688j0.m85022h(bundle);
                MMessageActV2.send(MMApplicationContext.getContext(), args);
            }
        }
    }

    /* renamed from: wc3.m$d */
    public class C90950d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C104289g f260988d;

        public C90950d(C104289g gVar) {
            this.f260988d = gVar;
        }

        public void run() {
            C90945m.m114055e(this.f260988d);
        }
    }

    /* renamed from: wc3.m$f */
    public class C90951f implements C90953i {

        /* renamed from: a */
        public final AtomicBoolean f260989a = new AtomicBoolean(false);

        /* renamed from: b */
        public final /* synthetic */ C90953i f260990b;

        public C90951f(C90953i iVar) {
            this.f260990b = iVar;
            mo118059b();
        }

        /* renamed from: a */
        public void mo118058a() {
            Log.m105924i("MicroMsg.DeepLinkHelper", "onDeepLinkDone#buildWeAppStartCallback");
            if (this.f260989a.compareAndSet(false, true)) {
                this.f260990b.mo118058a();
            } else {
                Log.m105924i("MicroMsg.DeepLinkHelper", "onDeepLinkDone#buildWeAppStartCallback, already callback");
            }
        }

        /* renamed from: b */
        public void mo118059b() {
            Log.m105924i("MicroMsg.DeepLinkHelper", "markDeepLinkDoneWillBeCallback#buildWeAppStartCallback");
            this.f260990b.mo118059b();
        }
    }

    /* renamed from: wc3.m$g */
    public class C90952g implements C86300q {

        /* renamed from: a */
        public final /* synthetic */ Context f260991a;

        /* renamed from: b */
        public final /* synthetic */ C90953i f260992b;

        public C90952g(Context context, C90953i iVar) {
            this.f260991a = context;
            this.f260992b = iVar;
            if (context instanceof Activity) {
                ((Application) MMApplicationContext.getContext()).registerActivityLifecycleCallbacks(new m$g$$b(this, this));
            }
        }

        /* renamed from: a */
        public void mo63853a() {
            Log.m105924i("MicroMsg.DeepLinkHelper", "onAppBrandProcessDied#buildWeAppStartCallback");
            this.f260992b.mo118058a();
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }

        /* renamed from: b */
        public void mo63854b(String str) {
            Log.m105924i("MicroMsg.DeepLinkHelper", "onTriggerHalfScreenShare#buildWeAppStartCallback, token: " + str);
        }

        /* renamed from: c */
        public void mo63855c() {
            Log.m105924i("MicroMsg.DeepLinkHelper", "onAppBrandUIEnter#buildWeAppStartCallback");
            this.f260992b.mo118058a();
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }

        /* renamed from: d */
        public void mo63856d() {
            Log.m105924i("MicroMsg.DeepLinkHelper", "onStartAppBrandUI#buildWeAppStartCallback");
            C119179t tVar = C119157j.f356862d;
            m$g$$a m_g__a = new m$g$$a(this.f260992b, this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(m_g__a, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, false);
        }

        /* renamed from: e */
        public void mo63857e() {
            Log.m105924i("MicroMsg.DeepLinkHelper", "onAppBrandPreconditionError#buildWeAppStartCallback");
            this.f260992b.mo118058a();
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
            Log.m105924i("MicroMsg.DeepLinkHelper", "onAppBrandUIExit#buildWeAppStartCallback, isFinish: " + z);
        }
    }

    /* renamed from: wc3.m$i */
    public interface C90953i {
        /* renamed from: a */
        void mo118058a();

        /* renamed from: b */
        void mo118059b();
    }

    static {
        HashMap hashMap = new HashMap();
        f260972f = hashMap;
        hashMap.put("weixin://", 0L);
        hashMap.put("weixin://dl/stickers", 1L);
        hashMap.put("weixin://dl/games", 2L);
        hashMap.put("weixin://dl/moments", 4L);
        hashMap.put("weixin://dl/add", 8L);
        hashMap.put("weixin://dl/shopping", 16L);
        hashMap.put("weixin://dl/groupchat", 32L);
        hashMap.put("weixin://dl/scan", 64L);
        hashMap.put("weixin://dl/profile", 128L);
        hashMap.put("weixin://dl/settings", 256L);
        hashMap.put("weixin://dl/general", 512L);
        hashMap.put("weixin://dl/help", 1024L);
        hashMap.put("weixin://dl/notifications", 2048L);
        hashMap.put("weixin://dl/terms", 4096L);
        hashMap.put("weixin://dl/chat", 8192L);
        hashMap.put("weixin://dl/features", 16384L);
        hashMap.put("weixin://dl/clear", 32768L);
        hashMap.put("weixin://dl/feedback", 65536L);
        hashMap.put("weixin://dl/faq", 131072L);
        hashMap.put("weixin://dl/recommendation", 262144L);
        hashMap.put("weixin://dl/groups", 524288L);
        hashMap.put("weixin://dl/tags", 1048576L);
        hashMap.put("weixin://dl/officialaccounts", 2097152L);
        hashMap.put("weixin://dl/posts", 4194304L);
        hashMap.put("weixin://dl/favorites", 8388608L);
        hashMap.put("weixin://dl/privacy", 16777216L);
        hashMap.put("weixin://dl/security", 33554432L);
        hashMap.put("weixin://dl/wallet", 67108864L);
        hashMap.put("weixin://dl/businessPay", 134217728L);
        hashMap.put("weixin://dl/businessPay/", 134217728L);
        hashMap.put("weixin://dl/wechatout", 268435456L);
        hashMap.put("weixin://dl/protection", 1073741824L);
        hashMap.put("weixin://dl/card", 2147483648L);
        hashMap.put("weixin://dl/about", 1125899906842624L);
        hashMap.put("weixin://dl/blacklist", 4294967296L);
        hashMap.put("weixin://dl/textsize", 8589934592L);
        hashMap.put("weixin://dl/sight", 17179869184L);
        hashMap.put("weixin://dl/languages", 34359738368L);
        hashMap.put("weixin://dl/chathistory", 68719476736L);
        hashMap.put("weixin://dl/bindqq", 137438953472L);
        hashMap.put("weixin://dl/bindmobile", 274877906944L);
        hashMap.put("weixin://dl/bindemail", 549755813888L);
        hashMap.put("weixin://dl/securityassistant", 1099511627776L);
        hashMap.put("weixin://dl/broadcastmessage", 2199023255552L);
        hashMap.put("weixin://dl/setname", 4398046511104L);
        hashMap.put("weixin://dl/myQRcode", 8796093022208L);
        hashMap.put("weixin://dl/myaddress", 17592186044416L);
        hashMap.put("weixin://dl/hidemoments", 35184372088832L);
        hashMap.put("weixin://dl/blockmoments", 70368744177664L);
        hashMap.put("weixin://dl/stickersetting", 140737488355328L);
        hashMap.put("weixin://dl/log", 281474976710656L);
        hashMap.put("weixin://dl/wechatoutcoupon", 562949953421312L);
        hashMap.put("weixin://dl/wechatoutshare", 18014398509481984L);
        hashMap.put("weixin://dl/personalemoticon", 4503599627370496L);
        hashMap.put("weixin://dl/designeremoji", 9007199254740992L);
        hashMap.put("weixin://dl/jumpWxa/", 576460752303423489L);
        hashMap.put("weixin://dl/offlinepay/", 576460752303423490L);
        hashMap.put("weixin://dl/channels/shareVideo/", 576460752303423492L);
        hashMap.put("weixin://dl/channels/profile/", 576460752303423496L);
        hashMap.put("weixin://dl/channels/live/", 576460752303423504L);
        hashMap.put("weixin://dl/channels/feed/", 576460752303423520L);
        hashMap.put("weixin://dl/customerService/", 576460752303423552L);
        hashMap.put("weixin://dl/channels/openEvent/", 576460752303423744L);
        hashMap.put("weixin://dl/channels/startLive/", 576460752303423616L);
    }

    /* renamed from: a */
    public static C86300q m114051a(Context context, C53147h hVar) {
        if (!(hVar instanceof C90953i)) {
            return null;
        }
        return new C90952g(context, new C90951f((C90953i) hVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m114052b(java.lang.String r5) {
        /*
            java.lang.String r0 = "weixin://dl/wechatout"
            boolean r0 = r5.equals(r0)
            r1 = 0
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "weixin://dl/wechatoutcoupon"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "weixin://dl/wechatoutshare"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0081
        L_0x001c:
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN
            boolean r0 = f40.C86709a0.m107522a()
            r2 = 1
            if (r0 == 0) goto L_0x0055
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r3 = "WCOEntranceSwitch"
            int r0 = r0.mo107404b(r3, r1)
            if (r0 <= 0) goto L_0x0048
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.mo119677K(r5, r3)
            r5 = 1
            goto L_0x0056
        L_0x0048:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.mo119677K(r5, r3)
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 != 0) goto L_0x0081
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            r5.setClassName(r0, r1)
            java.lang.String r0 = f260967a
            java.lang.String r1 = "rawUrl"
            r5.putExtra(r1, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 0
            java.lang.String r3 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r3, r4, r5, r1)
            return r2
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wc3.C90945m.m114052b(java.lang.String):boolean");
    }

    /* renamed from: c */
    public static boolean m114053c(String str) {
        String r = m114068r(m114069s(str));
        if (((HashMap) f260972f).containsKey(r)) {
            return true;
        }
        if (!Util.isNullOrNil(r) && r.startsWith("weixin://dl/business")) {
            return true;
        }
        if (!Util.isNullOrNil(r) && r.startsWith("weixin://dl/openbusinesswebview")) {
            return true;
        }
        if (!Util.isNullOrNil(r) && (r.startsWith("weixin://dl/jumpFakeWxa/") || r.startsWith("weixin://dl/openNativeView/"))) {
            return true;
        }
        return !Util.isNullOrNil(r) && r.startsWith("weixin://biz/");
    }

    /* renamed from: d */
    public static void m114054d(Context context, String str, String str2, int i, String str3, C53147h hVar) {
        if (Util.isNullOrNil(str)) {
            str = str3;
        }
        if (!m114052b(str)) {
            C52991e xD = ((C52990d) C86312j.m106911c(C52990d.class)).mo73579xD(str, str2, i, 0, C12212g.m11775a(), new byte[0]);
            C86709a0.m107524d().mo123455a(233, new C53146a(context, i, str2, str, hVar));
            C86709a0.m107524d().mo123460f((C117747y) xD);
        }
    }

    /* renamed from: e */
    public static void m114055e(C104289g gVar) {
        C104289g gVar2 = gVar;
        if (gVar2 != null) {
            String optString = gVar2.optString("package_info");
            if (Util.isNullOrNil(optString)) {
                Log.m105924i("MicroMsg.DeepLinkHelper", "package_info is null in invokeData");
                return;
            }
            try {
                C26827e eVar = new C26827e(optString);
                if (eVar.length() > 0) {
                    String str = C86709a0.m107535s().f251807e + "TempMiniProgram/";
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < eVar.length(); i++) {
                        C104289g gVar3 = new C104289g(eVar.getString(i));
                        String optString2 = gVar3.optString("downloadUrl");
                        long optLong = gVar3.optLong("expireTime");
                        String optString3 = gVar3.optString("extraBytes");
                        String optString4 = gVar3.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                        String optString5 = gVar3.optString("fileMd5");
                        if (!Util.isNullOrNil(optString5) && !Util.isNullOrNil(optString2) && !Util.isNullOrNil(optString4) && !Util.isNullOrNil(optString3) && optLong > 0) {
                            if (optString4.startsWith("content")) {
                                if (C86013q1.m106450k(optString4)) {
                                    if (!C86013q1.m106450k(str)) {
                                        C86013q1.m106461v(str);
                                    }
                                    String str2 = str + Util.safeFormatString("%s.%s", optString5, C86013q1.m106454o(optString4));
                                    if (C86013q1.m106443d(optString4, str2, false) <= 0) {
                                        Log.m105920e("MicroMsg.DeepLinkHelper", "file copy failed");
                                    } else {
                                        byte[] decodeHexString = Util.decodeHexString(optString3);
                                        C91535b.C91536a aVar = new C91535b.C91536a();
                                        aVar.mo125440b(decodeHexString);
                                        Log.m105924i("MicroMsg.DeepLinkHelper", aVar.toString());
                                        aVar.f262360j = optLong;
                                        aVar.f262358h = optString5;
                                        aVar.f262359i = optString2;
                                        arrayList.add(new Pair(aVar, str2));
                                    }
                                }
                            }
                            Log.m105925i("MicroMsg.DeepLinkHelper", "file not Exists, path = %s", optString4);
                        }
                    }
                    ((C91535b) C86312j.m106911c(C91535b.class)).mo125306jB(arrayList);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.DeepLinkHelper", e.getMessage());
            }
        }
    }

    /* renamed from: f */
    public static void m114056f(Context context, String str, int i, Bundle bundle, C53147h hVar, String str2, String str3) {
        m114057g(context, str, i, bundle, hVar, str2, str3, false);
    }

    /* renamed from: g */
    public static void m114057g(Context context, String str, int i, Bundle bundle, C53147h hVar, String str2, String str3, boolean z) {
        LinkedList linkedList = new LinkedList();
        C52064y4 y4Var = new C52064y4();
        if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(str3)) {
            Log.m105925i("MicroMsg.DeepLinkHelper", "package name = %s, package signature = %s", str2, str3);
            y4Var.f145107e = str2;
            y4Var.f145106d = str3;
            linkedList.add(y4Var);
        }
        if (!m114052b(str)) {
            C87120h A8 = ((C87121j) C86312j.m106911c(C87121j.class)).mo71209A8(str, i, linkedList);
            if (str.startsWith("weixin://dl/channels/shareVideo/") && bundle != null) {
                String string = bundle.getString("key_finder_share_video_jump_info_string", "");
                if (!Util.isNullOrNil(string)) {
                    A8.mo63051x(string);
                }
            }
            C86709a0.m107524d().mo123455a(1200, new C90946b(z, hVar, str, bundle, context, i));
            C86709a0.m107524d().mo123460f((C117747y) A8);
        }
    }

    /* renamed from: h */
    public static Intent m114058h(String str, Context context) {
        if (context == null || Util.isNullOrNil(str) || !str.startsWith("weixin://dl/businessPay")) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            String queryParameter = parse.getQueryParameter("reqkey");
            String queryParameter2 = parse.getQueryParameter("appid");
            if (!Util.isNullOrNil(queryParameter)) {
                PayInfo payInfo = new PayInfo();
                payInfo.f212592j = queryParameter;
                payInfo.f212594o = queryParameter2;
                payInfo.f212587e = 36;
                payInfo.f212590h = false;
                Intent intent = new Intent();
                intent.putExtra("key_pay_info", payInfo);
                if (context instanceof Activity) {
                    intent.putExtra("key_context_hashcode", context.hashCode());
                    Log.m105925i("MicroMsg.DeepLinkHelper", "startPay context %s %s", context, Integer.valueOf(context.hashCode()));
                }
                if (C75592q0.m90763K()) {
                    C88144b.m109795m(context, "wallet_payu", ".pay.ui.WalletPayUPayUI", intent, 1);
                } else {
                    C88144b.m109795m(context, "wallet", ".pay.ui.WalletPayUI", intent, 1);
                }
                return intent;
            }
            Log.m105928w("MicroMsg.DeepLinkHelper", "reqkey null");
            return null;
        }
        Log.m105928w("MicroMsg.DeepLinkHelper", "payUri null");
        return null;
    }

    /* renamed from: i */
    public static void m114059i(Context context, int i) {
        String string = (ChannelUtil.isNokiaAol || !LocaleUtil.getApplicationLanguage().equals("zh_CN")) ? LocaleUtil.getApplicationLanguage().equals("zh_HK") ? context.getString(C0966R.string.m9x) : LocaleUtil.getApplicationLanguage().equals("zh_TW") ? context.getString(C0966R.string.m9y) : context.getString(C0966R.string.m9z) : context.getString(C0966R.string.m9w);
        Log.m105918d("MicroMsg.DeepLinkHelper", "using faq webpage");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("show_feedback", false);
        intent.putExtra("KShowFixToolsBtn", true);
        intent.putExtra("geta8key_session_id", i);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: j */
    public static void m114060j(Context context, int i) {
        String string = (ChannelUtil.isNokiaAol || (!LocaleUtil.getApplicationLanguage().equals("zh_CN") && !LocaleUtil.getApplicationLanguage().equals("zh_HK") && !LocaleUtil.getApplicationLanguage().equals("zh_TW"))) ? context.getString(C0966R.string.lin) : context.getString(C0966R.string.lil);
        Log.m105918d("MicroMsg.DeepLinkHelper", "using faq webpage");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("show_feedback", false);
        intent.putExtra("KShowFixToolsBtn", true);
        intent.putExtra("geta8key_session_id", i);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: k */
    public static void m114061k(Context context, String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url is null. finish");
        } else if (str.startsWith("weixin://dl/login/phone_view")) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("cc");
            String queryParameter2 = parse.getQueryParameter("num");
            Log.m105919d("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI cc:%s num:%s", queryParameter, queryParameter2);
            Intent intent = new Intent();
            intent.putExtra("couttry_code", queryParameter);
            intent.putExtra("input_mobile_number", queryParameter2);
            intent.putExtra("from_deep_link", true);
            intent.putExtra("mobile_input_purpose", 1);
            intent.addFlags(268435456);
            C88144b.m109791i(context, "account", ".ui.MobileInputUI", intent, (Bundle) null);
        } else if (str.startsWith("weixin://dl/login/common_view")) {
            String queryParameter3 = Uri.parse(str).getQueryParameter("username");
            Log.m105919d("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI  username:%s", queryParameter3);
            Intent intent2 = new Intent();
            intent2.putExtra("login_username", queryParameter3);
            intent2.putExtra("from_deep_link", true);
            intent2.addFlags(268435456);
            C88144b.m109791i(context, "account", ".ui.LoginUI", intent2, (Bundle) null);
        } else {
            Log.m105921e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url not Correct:%s", str);
        }
    }

    /* renamed from: l */
    public static boolean m114062l(Context context, String str) {
        return m114063m(context, str, (Intent) null, 0, (Bundle) null, C12212g.m11775a(), new byte[0], (String) null);
    }

    /* renamed from: m */
    public static boolean m114063m(Context context, String str, Intent intent, int i, Bundle bundle, int i2, byte[] bArr, String str2) {
        return m114064n(context, str, intent, i, bundle, i2, bArr, str2, 0, "", (C53147h) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Class<kr0.x0>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v27, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r43v5, types: [kr0.x0$a] */
    /* JADX WARNING: type inference failed for: r4v28, types: [kr0.x0$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x06f0 A[Catch:{ UnsupportedEncodingException -> 0x072e }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x06f9 A[Catch:{ UnsupportedEncodingException -> 0x072c }] */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0c48 A[Catch:{ Exception -> 0x0c57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0c54  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0c6f A[SYNTHETIC, Splitter:B:403:0x0c6f] */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x0cf9  */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0ec1  */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0faf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f7  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m114064n(android.content.Context r36, java.lang.String r37, android.content.Intent r38, int r39, android.os.Bundle r40, int r41, byte[] r42, java.lang.String r43, int r44, java.lang.String r45, wc3.C90945m.C53147h r46) {
        /*
            r1 = r36
            r0 = r37
            r2 = r39
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r44
            r7 = r45
            r8 = r46
            java.lang.String r9 = "&"
            java.lang.Class<ht1.t1> r10 = ht1.C60200t1.class
            java.lang.Class<kr0.x0> r11 = kr0.C76630x0.class
            java.lang.String r12 = "utf-8"
            java.lang.String r13 = m114068r(r37)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            r15 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            if (r14 == 0) goto L_0x002b
            return r15
        L_0x002b:
            java.util.Map<java.lang.String, java.lang.Long> r14 = f260972f
            java.util.HashMap r14 = (java.util.HashMap) r14
            boolean r16 = r14.containsKey(r13)
            java.lang.String r15 = "webview"
            java.lang.String r18 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI"
            r19 = r15
            java.lang.String r15 = "geta8key_cookie"
            java.lang.String r6 = "geta8key_session_id"
            r20 = r11
            java.lang.String r11 = "rawUrl"
            r21 = 0
            java.lang.String r2 = "appid"
            java.lang.String r7 = ""
            r22 = r8
            java.lang.String r8 = "MicroMsg.DeepLinkHelper"
            r23 = r9
            java.lang.String r9 = "url"
            r24 = r7
            java.lang.String r7 = "username"
            r25 = r12
            java.lang.String r12 = "game_report_from_scene"
            java.lang.String r5 = ".ui.tools.WebViewUI"
            java.lang.String r0 = "key_data_center_session_id"
            r27 = r5
            r5 = 1
            if (r16 == 0) goto L_0x0fb1
            java.lang.Object r13 = r14.get(r13)
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            r16 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Long r28 = java.lang.Long.valueOf(r13)
            r17 = 0
            r0[r17] = r28
            java.lang.String r5 = "gotoUri, deepLinkMap contains uri, result = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r5, r0)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            if (r38 == 0) goto L_0x009a
            android.os.Bundle r0 = r38.getExtras()
            r5.putExtras(r0)
            int r0 = r38.getFlags()
            if (r0 == 0) goto L_0x009a
            int r0 = r38.getFlags()
            r5.addFlags(r0)
        L_0x009a:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)
            r29 = 0
            java.lang.String r0 = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI"
            int r26 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r26 != 0) goto L_0x00ad
            java.lang.String r18 = "com.tencent.mm.ui.LauncherUI"
        L_0x00a9:
            r7 = r27
            goto L_0x044d
        L_0x00ad:
            r29 = 1
            r38 = r0
            r0 = 12065(0x2f21, float:1.6907E-41)
            r26 = r15
            r15 = 7
            int r31 = (r13 > r29 ? 1 : (r13 == r29 ? 0 : -1))
            if (r31 != 0) goto L_0x00cc
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r7 = 0
            r4[r7] = r6
            r2.mo160131h(r0, r4)
            r18 = r38
            goto L_0x00a9
        L_0x00cc:
            r15 = 1
            r30 = 2
            int r28 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r28 != 0) goto L_0x00df
            java.lang.String r0 = "from_deeplink"
            r5.putExtra(r0, r15)
            r0 = 6
            r5.putExtra(r12, r0)
            java.lang.String r18 = "com.tencent.mm.plugin.game.ui.GameCenterUI"
            goto L_0x00a9
        L_0x00df:
            r30 = 4
            int r12 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r12 != 0) goto L_0x0102
            int r0 = eb0.C75592q0.m90785o()
            r2 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00f1
            r0 = 1
            goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            if (r0 == 0) goto L_0x00fe
            java.lang.String r0 = "sns_timeline_NeedFirstLoadint"
            r2 = 1
            r5.putExtra(r0, r2)
            java.lang.String r18 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            goto L_0x00a9
        L_0x00fe:
            r7 = r27
            goto L_0x033b
        L_0x0102:
            r30 = 576460752303423744(0x800000000000100, double:3.785766995733894E-270)
            java.lang.String r12 = "decode error"
            java.lang.String r15 = "UTF-8"
            int r32 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r32 != 0) goto L_0x0161
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r3 = r0.getQueryParameter(r7)
            java.lang.String r4 = "eventId"
            java.lang.String r0 = r0.getQueryParameter(r4)
            java.net.URLDecoder.decode(r3, r15)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r15)     // Catch:{ Exception -> 0x0129 }
            goto L_0x0132
        L_0x0129:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r12, r4)
            r0 = r24
        L_0x0132:
            c30.g r3 = new c30.g
            r3.<init>()
            c30.g r4 = new c30.g     // Catch:{ f -> 0x014d }
            r4.<init>()     // Catch:{ f -> 0x014d }
            java.lang.String r6 = "eventEncryptedTopicId"
            r4.put(r6, r0)     // Catch:{ f -> 0x014d }
            java.lang.String r0 = "topicType"
            r6 = 7
            r4.mo145953n(r0, r6)     // Catch:{ f -> 0x014d }
            java.lang.String r0 = "extInfo"
            r3.put(r0, r4)     // Catch:{ f -> 0x014d }
        L_0x014d:
            di3.d r0 = di3.C86312j.m106911c(r10)
            ht1.t1 r0 = (ht1.C60200t1) r0
            java.lang.String r3 = r3.toString()
            wc3.m$c r4 = new wc3.m$c
            r4.<init>(r2)
            r0.er0(r1, r3, r4)
            goto L_0x0262
        L_0x0161:
            r30 = 576460752303423616(0x800000000000080, double:3.785766995733787E-270)
            int r32 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r32 != 0) goto L_0x01af
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r3 = "openId"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.String r4 = "liveInfoData"
            java.lang.String r0 = r0.getQueryParameter(r4)
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r15)     // Catch:{ Exception -> 0x0184 }
            goto L_0x018e
        L_0x0184:
            r0 = move-exception
            r4 = r0
            r6 = 0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r4, r12, r0)
            r0 = r24
        L_0x018e:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x0196
            r3 = 1
            goto L_0x01a2
        L_0x0196:
            java.lang.Class<ym.t> r4 = p763ym.C39072t.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ym.t r4 = (p763ym.C39072t) r4
            boolean r3 = r4.bi0(r2, r3)
        L_0x01a2:
            java.lang.Class<ir.n> r4 = p565ir.C60606n.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ir.n r4 = (p565ir.C60606n) r4
            r4.mo85043Xf(r2, r0, r3)
            goto L_0x0262
        L_0x01af:
            r30 = 576460752303423492(0x800000000000004, double:3.7857669957336824E-270)
            int r32 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r32 != 0) goto L_0x0231
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r4 = "title"
            java.lang.String r4 = r0.getQueryParameter(r4)
            java.lang.String r0 = r0.getQueryParameter(r9)
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r15)     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r15)     // Catch:{ Exception -> 0x01d4 }
            goto L_0x01e1
        L_0x01d4:
            r0 = move-exception
            goto L_0x01d9
        L_0x01d6:
            r0 = move-exception
            r4 = r24
        L_0x01d9:
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r12, r7)
            r0 = r24
        L_0x01e1:
            java.lang.String r6 = "key_finder_video_path"
            java.lang.String r6 = r3.getString(r6)
            java.lang.String r7 = "key_finder_share_video_jump_info_state"
            int r7 = r3.getInt(r7)
            r9 = 1
            if (r7 != r9) goto L_0x01f7
            java.lang.String r11 = "key_finder_share_video_jump_info_string"
            java.lang.String r11 = r3.getString(r11)
            goto L_0x01f9
        L_0x01f7:
            r11 = r24
        L_0x01f9:
            java.lang.String r12 = "key_finder_share_video_jump_info_extra_data"
            java.lang.String r3 = r3.getString(r12)
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13 = 0
            r12[r13] = r7
            r12[r9] = r11
            r7 = 2
            r12[r7] = r6
            java.lang.String r7 = "finderShareVideo finderComponentState: %s, finderJumpInfo: %s, videoPath: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r12)
            di3.d r7 = di3.C86312j.m106911c(r10)
            ht1.t1 r7 = (ht1.C60200t1) r7
            ht1.u3 r7 = r7.fi0()
            r37 = r7
            r38 = r36
            r39 = r2
            r40 = r6
            r41 = r4
            r42 = r0
            r43 = r11
            r44 = r3
            r37.mo83752c(r38, r39, r40, r41, r42, r43, r44)
            goto L_0x0262
        L_0x0231:
            r30 = 576460752303423496(0x800000000000008, double:3.785766995733686E-270)
            int r9 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r9 != 0) goto L_0x0266
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r0 = r0.getQueryParameter(r7)
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r15)     // Catch:{ Exception -> 0x024b }
            goto L_0x0255
        L_0x024b:
            r0 = move-exception
            r3 = r0
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r3, r12, r0)
            r0 = r24
        L_0x0255:
            di3.d r3 = di3.C86312j.m106911c(r10)
            ht1.t1 r3 = (ht1.C60200t1) r3
            ht1.u3 r3 = r3.fi0()
            r3.mo83754e(r1, r2, r0)
        L_0x0262:
            r7 = r27
            goto L_0x03d5
        L_0x0266:
            r30 = 576460752303423504(0x800000000000010, double:3.7857669957336925E-270)
            int r7 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r7 != 0) goto L_0x02a7
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r3 = "feedID"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.String r4 = "nonceID"
            java.lang.String r0 = r0.getQueryParameter(r4)
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r15)     // Catch:{ Exception -> 0x028e }
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r15)     // Catch:{ Exception -> 0x028c }
            goto L_0x0299
        L_0x028c:
            r0 = move-exception
            goto L_0x0291
        L_0x028e:
            r0 = move-exception
            r3 = r24
        L_0x0291:
            r4 = 0
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r12, r6)
            r0 = r24
        L_0x0299:
            di3.d r4 = di3.C86312j.m106911c(r10)
            ht1.t1 r4 = (ht1.C60200t1) r4
            ht1.u3 r4 = r4.fi0()
            r4.mo83751b(r1, r2, r3, r0)
            goto L_0x0262
        L_0x02a7:
            r30 = 576460752303423520(0x800000000000020, double:3.785766995733706E-270)
            int r7 = (r13 > r30 ? 1 : (r13 == r30 ? 0 : -1))
            if (r7 != 0) goto L_0x02fb
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r2 = r0.getQueryParameter(r2)
            java.lang.String r3 = "feedID"
            java.lang.String r3 = r0.getQueryParameter(r3)
            java.lang.String r4 = "nonceID"
            java.lang.String r4 = r0.getQueryParameter(r4)
            java.lang.String r6 = "nonGetRelatedList"
            java.lang.String r6 = r0.getQueryParameter(r6)
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r15)     // Catch:{ Exception -> 0x02d5 }
            java.lang.String r0 = java.net.URLDecoder.decode(r4, r15)     // Catch:{ Exception -> 0x02d3 }
            goto L_0x02e0
        L_0x02d3:
            r0 = move-exception
            goto L_0x02d8
        L_0x02d5:
            r0 = move-exception
            r3 = r24
        L_0x02d8:
            r4 = 0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r12, r7)
            r0 = r24
        L_0x02e0:
            di3.d r4 = di3.C86312j.m106911c(r10)
            ht1.t1 r4 = (ht1.C60200t1) r4
            ht1.u3 r4 = r4.fi0()
            r37 = r4
            r38 = r36
            r39 = r2
            r40 = r3
            r41 = r0
            r42 = r6
            r37.mo83750a(r38, r39, r40, r41, r42)
            goto L_0x0262
        L_0x02fb:
            r9 = 8
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0305
            java.lang.String r18 = "com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI"
            goto L_0x00a9
        L_0x0305:
            r9 = 16
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x033f
            com.tencent.mm.autogen.events.GetJDUrlEvent r0 = new com.tencent.mm.autogen.events.GetJDUrlEvent
            r0.<init>()
            r0.publish()
            com.tencent.mm.autogen.events.GetJDUrlEvent$a r0 = r0.f236214d
            java.lang.String r0 = r0.f236215a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x00fe
            r5.putExtra(r11, r0)
            java.lang.String r0 = "useJs"
            r2 = 1
            r5.putExtra(r0, r2)
            java.lang.String r0 = "vertical_scroll"
            r5.putExtra(r0, r2)
            r5.putExtra(r6, r4)
            r10 = r42
            r15 = r26
            r7 = r27
            r5.putExtra(r15, r10)
            goto L_0x044d
        L_0x033b:
            r18 = r21
            goto L_0x044d
        L_0x033f:
            r10 = r42
            r15 = r26
            r7 = r27
            r26 = 32
            int r9 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r9 != 0) goto L_0x038c
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131820847(0x7f11012f, float:1.927442E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "titile"
            r5.putExtra(r2, r0)
            java.lang.String r0 = "list_type"
            r2 = 0
            r5.putExtra(r0, r2)
            r3 = 3
            int[] r0 = new int[r3]
            int r3 = com.tencent.p014mm.p136ui.contact.C74560s1.m89272a()
            r0[r2] = r3
            r2 = 256(0x100, float:3.59E-43)
            r9 = 1
            r0[r9] = r2
            r2 = 512(0x200, float:7.175E-43)
            r3 = 2
            r0[r3] = r2
            int r0 = com.tencent.p014mm.p136ui.contact.C74560s1.m89278g(r0)
            java.lang.String r2 = "list_attr"
            r5.putExtra(r2, r0)
            java.lang.String r0 = "create_group_recommend"
            r5.putExtra(r0, r9)
            java.lang.String r0 = "menu_mode"
            r5.putExtra(r0, r3)
            java.lang.String r18 = "com.tencent.mm.ui.contact.SelectContactUI"
            goto L_0x044d
        L_0x038c:
            r9 = 1
            r26 = 64
            int r12 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r12 != 0) goto L_0x039c
            java.lang.String r0 = "animation_pop_in"
            r5.putExtra(r0, r9)
            java.lang.String r18 = "com.tencent.mm.plugin.scanner.ui.BaseScanUI"
            goto L_0x044d
        L_0x039c:
            r26 = 128(0x80, double:6.32E-322)
            int r9 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r9 != 0) goto L_0x03a6
            java.lang.String r18 = "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI"
            goto L_0x044d
        L_0x03a6:
            r26 = 256(0x100, double:1.265E-321)
            int r9 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r9 != 0) goto L_0x03b0
            java.lang.String r18 = "com.tencent.mm.plugin.setting.ui.setting.SettingsUI"
            goto L_0x044d
        L_0x03b0:
            r26 = 512(0x200, double:2.53E-321)
            int r9 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r9 != 0) goto L_0x03ba
            java.lang.String r18 = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI"
            goto L_0x044d
        L_0x03ba:
            r26 = 1024(0x400, double:5.06E-321)
            int r9 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r9 != 0) goto L_0x03de
            boolean r0 = eb0.C45628s0.m50756U()
            if (r0 != 0) goto L_0x03ce
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            m114059i(r0, r4)
            goto L_0x03d5
        L_0x03ce:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            m114060j(r0, r4)
        L_0x03d5:
            r15 = r1
            r4 = r5
            r27 = r7
            r6 = r8
        L_0x03da:
            r9 = r24
            goto L_0x0af2
        L_0x03de:
            r26 = 2048(0x800, double:1.0118E-320)
            int r9 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r9 != 0) goto L_0x03e7
            java.lang.String r18 = "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI"
            goto L_0x044d
        L_0x03e7:
            r26 = 4096(0x1000, double:2.0237E-320)
            java.lang.String r9 = "showShare"
            int r12 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r12 != 0) goto L_0x0432
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131834135(0x7f113517, float:1.9301372E38)
            java.lang.String r0 = r0.getString(r2)
            java.lang.String r2 = "title"
            r5.putExtra(r2, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131838237(0x7f11451d, float:1.9309692E38)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r13 = 0
            r3[r13] = r12
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentCountryCode()
            r14 = 1
            r3[r14] = r12
            java.lang.String r0 = r0.getString(r2, r3)
            r5.putExtra(r11, r0)
            r5.putExtra(r9, r13)
            r5.putExtra(r6, r4)
            r5.putExtra(r15, r10)
            goto L_0x044d
        L_0x0432:
            r26 = 8192(0x2000, double:4.0474E-320)
            int r12 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r12 != 0) goto L_0x043b
            java.lang.String r18 = "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI"
            goto L_0x044d
        L_0x043b:
            r26 = 16384(0x4000, double:8.0948E-320)
            int r12 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r12 != 0) goto L_0x0444
            java.lang.String r18 = "com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI"
            goto L_0x044d
        L_0x0444:
            r26 = 32768(0x8000, double:1.61895E-319)
            int r12 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r12 != 0) goto L_0x0458
            java.lang.String r18 = "com.tencent.mm.plugin.clean.ui.CleanUI"
        L_0x044d:
            r15 = r1
            r4 = r5
            r27 = r7
            r6 = r8
            r21 = r18
            r9 = r24
            goto L_0x0b26
        L_0x0458:
            r26 = 65536(0x10000, double:3.2379E-319)
            int r12 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r12 != 0) goto L_0x075e
            java.lang.String r0 = "?"
            r12 = r37
            int r0 = r12.indexOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x073e }
            if (r0 <= 0) goto L_0x0471
            r2 = 1
            int r0 = r0 + r2
            java.lang.String r0 = r12.substring(r0)     // Catch:{ UnsupportedEncodingException -> 0x073e }
            r2 = r0
            goto L_0x0473
        L_0x0471:
            r2 = r24
        L_0x0473:
            f40.e r0 = f40.C86709a0.m107523b()     // Catch:{ UnsupportedEncodingException -> 0x073e }
            int r0 = r0.mo121110g()     // Catch:{ UnsupportedEncodingException -> 0x073e }
            java.lang.String r3 = qe3.C89625d.f257838d     // Catch:{ UnsupportedEncodingException -> 0x073e }
            r12 = r25
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r12)     // Catch:{ UnsupportedEncodingException -> 0x073e }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x073e }
            r13.<init>()     // Catch:{ UnsupportedEncodingException -> 0x073e }
            r14 = r24
            r13.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x0744 }
            r24 = r14
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.getTimeZoneOffset()     // Catch:{ UnsupportedEncodingException -> 0x073e }
            r13.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x073e }
            java.lang.String r13 = r13.toString()     // Catch:{ UnsupportedEncodingException -> 0x073e }
            java.lang.String r13 = java.net.URLEncoder.encode(r13, r12)     // Catch:{ UnsupportedEncodingException -> 0x073e }
            r27 = r7
            r14 = 1
            java.lang.String r7 = p156gj.C87203t.m108270f(r14)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r7 = java.net.URLEncoder.encode(r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r14 = qe3.C89625d.f257836b     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r14 = java.net.URLEncoder.encode(r14, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r1 = qe3.C89625d.f257837c     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r10 = qe3.C89625d.m112061b()     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r10 = java.net.URLEncoder.encode(r10, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            r26 = r15
            java.lang.String r15 = f40.C86718e.m107547e()     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r15 = java.net.URLEncoder.encode(r15, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.getSourceeMd5(r16)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            int r16 = com.tencent.xweb.XWebSdk.getXWebSdkVersion()     // Catch:{ UnsupportedEncodingException -> 0x073b }
            r25 = r6
            java.lang.String r6 = java.lang.String.valueOf(r16)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ UnsupportedEncodingException -> 0x073b }
            int r16 = com.tencent.xweb.XWebSdk.getInstalledNewstVersion(r16)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            r30 = r11
            java.lang.String r11 = java.lang.String.valueOf(r16)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r11 = java.net.URLEncoder.encode(r11, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            int r16 = com.tencent.xweb.XWebSdk.safeGetChromiumVersion()     // Catch:{ UnsupportedEncodingException -> 0x073b }
            r31 = r9
            java.lang.String r9 = java.lang.String.valueOf(r16)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            java.lang.String r9 = java.net.URLEncoder.encode(r9, r12)     // Catch:{ UnsupportedEncodingException -> 0x073b }
            int r16 = com.tencent.xweb.XWebSdk.getMultiProcessType()     // Catch:{ UnsupportedEncodingException -> 0x073b }
            r32 = r5
            java.lang.String r5 = java.lang.String.valueOf(r16)     // Catch:{ UnsupportedEncodingException -> 0x0738 }
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r12)     // Catch:{ UnsupportedEncodingException -> 0x0738 }
            boolean r16 = com.tencent.xweb.XWebSdk.getEnableSandbox()     // Catch:{ UnsupportedEncodingException -> 0x0738 }
            r33 = r8
            java.lang.String r8 = java.lang.String.valueOf(r16)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r8 = java.net.URLEncoder.encode(r8, r12)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r16 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r37 = r8
            java.lang.String r8 = "&uin="
            r12.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&deviceName="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&timeZone="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&imei="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&deviceBrand="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&deviceModel="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&ostype="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r10)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&clientSeqID="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&signature="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r12.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&scene="
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            if (r0 == 0) goto L_0x057b
            r0 = 0
            goto L_0x057c
        L_0x057b:
            r0 = 1
        L_0x057c:
            r12.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = r12.toString()     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&xwebSdkVersion="
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r1.append(r6)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&xwebCoreVersion="
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r1.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&sysCoreVersion="
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r1.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&multiProcessType="
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r1.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r0 = "&enableSandbox="
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r0 = r37
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.String r1 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r3.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            java.util.List r0 = com.tencent.xweb.xwalk.plugin.XWalkPluginManager.getAllPlugins()     // Catch:{ Exception -> 0x0645 }
            if (r0 == 0) goto L_0x05ff
            boolean r4 = r0.isEmpty()     // Catch:{ Exception -> 0x0645 }
            if (r4 != 0) goto L_0x05ff
            java.lang.String r4 = "&pluginInit=true"
            r3.append(r4)     // Catch:{ Exception -> 0x0645 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0645 }
        L_0x05d3:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0645 }
            if (r4 == 0) goto L_0x05fc
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0645 }
            com.tencent.xweb.xwalk.plugin.XWalkPlugin r4 = (com.tencent.xweb.xwalk.plugin.XWalkPlugin) r4     // Catch:{ Exception -> 0x0645 }
            if (r4 == 0) goto L_0x05d3
            r5 = r23
            r3.append(r5)     // Catch:{ Exception -> 0x0643 }
            java.lang.String r6 = r4.getPluginName()     // Catch:{ Exception -> 0x0643 }
            r3.append(r6)     // Catch:{ Exception -> 0x0643 }
            java.lang.String r6 = "="
            r3.append(r6)     // Catch:{ Exception -> 0x0643 }
            int r4 = r4.getAvailableVersion()     // Catch:{ Exception -> 0x0643 }
            r3.append(r4)     // Catch:{ Exception -> 0x0643 }
            r23 = r5
            goto L_0x05d3
        L_0x05fc:
            r5 = r23
            goto L_0x0640
        L_0x05ff:
            r5 = r23
            java.lang.String r0 = "&pluginInit=false"
            r3.append(r0)     // Catch:{ Exception -> 0x0643 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0643 }
            java.util.Map r0 = com.tencent.xweb.xwalk.plugin.XWalkPluginManager.getInstalledPluginVersions(r0)     // Catch:{ Exception -> 0x0643 }
            if (r0 == 0) goto L_0x0640
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x0643 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0643 }
        L_0x0618:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0643 }
            if (r4 == 0) goto L_0x0640
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0643 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x0643 }
            if (r4 != 0) goto L_0x0627
            goto L_0x0618
        L_0x0627:
            r3.append(r5)     // Catch:{ Exception -> 0x0643 }
            java.lang.Object r6 = r4.getKey()     // Catch:{ Exception -> 0x0643 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0643 }
            r3.append(r6)     // Catch:{ Exception -> 0x0643 }
            java.lang.String r6 = "="
            r3.append(r6)     // Catch:{ Exception -> 0x0643 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x0643 }
            r3.append(r4)     // Catch:{ Exception -> 0x0643 }
            goto L_0x0618
        L_0x0640:
            r6 = r33
            goto L_0x0655
        L_0x0643:
            r0 = move-exception
            goto L_0x0648
        L_0x0645:
            r0 = move-exception
            r5 = r23
        L_0x0648:
            java.lang.String r4 = "get xwalk plugin info error "
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r6 = 0
            r7[r6] = r0     // Catch:{ UnsupportedEncodingException -> 0x0732 }
            r6 = r33
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x072e }
        L_0x0655:
            java.lang.String r0 = "&userId="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            int r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppUserId()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r0 = "&userInfo="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppUserInfo(r36)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r4 = r16
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r0 = "&userPrf="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil.WorkProfiles.getAppProfile(r36)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r1 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r0.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r3 = "https://"
            r1.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3 = 2131831337(0x7f112a29, float:1.9295697E38)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r3)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r1.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r3 = "/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index"
            r1.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r1 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.<init>()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r1 = "&version="
            r3.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            int r1 = qe3.C89625d.f257841g     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r1 = "&lang="
            r3.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x072e }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            com.tencent.mm.sdk.platformtools.WeChatBrands$AppInfo$WhichApp r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.AppInfo.current()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            boolean r1 = r1.isMainland()     // Catch:{ UnsupportedEncodingException -> 0x072e }
            if (r1 != 0) goto L_0x06f9
            java.lang.String r1 = "KShowFixToolsBtn"
            r4 = r32
            r2 = 1
            r4.putExtra(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x072c }
            goto L_0x06fb
        L_0x06f9:
            r4 = r32
        L_0x06fb:
            r1 = r31
            r2 = 0
            r4.putExtra(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x072c }
            r5 = r30
            r4.putExtra(r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x072c }
            java.lang.String r0 = "neverGetA8Key"
            r1 = 1
            r4.putExtra(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x072c }
            r8 = r41
            r7 = r25
            r4.putExtra(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x072c }
            r10 = r42
            r11 = r26
            r4.putExtra(r11, r10)     // Catch:{ UnsupportedEncodingException -> 0x072c }
            java.lang.String r0 = "hardcode_jspermission"
            com.tencent.mm.protocal.JsapiPermissionWrapper r1 = com.tencent.p014mm.protocal.JsapiPermissionWrapper.f121047h     // Catch:{ UnsupportedEncodingException -> 0x072c }
            r4.putExtra(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x072c }
            java.lang.String r0 = "hardcode_general_ctrl"
            com.tencent.mm.protocal.GeneralControlWrapper r1 = com.tencent.p014mm.protocal.GeneralControlWrapper.f121044e     // Catch:{ UnsupportedEncodingException -> 0x072c }
            r4.putExtra(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x072c }
            r9 = r24
            goto L_0x0885
        L_0x072c:
            r0 = move-exception
            goto L_0x074b
        L_0x072e:
            r0 = move-exception
        L_0x072f:
            r4 = r32
            goto L_0x074b
        L_0x0732:
            r0 = move-exception
            r4 = r32
            r6 = r33
            goto L_0x074b
        L_0x0738:
            r0 = move-exception
            r6 = r8
            goto L_0x072f
        L_0x073b:
            r0 = move-exception
            r4 = r5
            goto L_0x0742
        L_0x073e:
            r0 = move-exception
            r4 = r5
            r27 = r7
        L_0x0742:
            r6 = r8
            goto L_0x074b
        L_0x0744:
            r0 = move-exception
            r4 = r5
            r27 = r7
            r6 = r8
            r24 = r14
        L_0x074b:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "[oneliang]UnsupportedEncodingException:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)
            r15 = r36
            goto L_0x03da
        L_0x075e:
            r12 = r37
            r27 = r7
            r1 = r9
            r9 = r24
            r7 = r6
            r6 = r8
            r8 = r4
            r4 = r5
            r5 = r11
            r11 = r15
            r23 = 131072(0x20000, double:6.47582E-319)
            int r15 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r15 != 0) goto L_0x07b8
            f40.e r0 = f40.C86709a0.m107523b()
            int r0 = r0.mo121110g()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r3 = 12304(0x3010, float:1.7242E-41)
            java.lang.Object r2 = r2.mo119683d(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r2)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 2131836381(0x7f113ddd, float:1.9305927E38)
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14 = 0
            r13[r14] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r2 = 1
            r13[r2] = r0
            java.lang.String r0 = r3.getString(r12, r13)
            r4.putExtra(r1, r14)
            r4.putExtra(r5, r0)
            r4.putExtra(r7, r8)
            r4.putExtra(r11, r10)
            goto L_0x0885
        L_0x07b8:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x07c3
            java.lang.String r18 = "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI"
            goto L_0x0885
        L_0x07c3:
            r7 = 524288(0x80000, double:2.590327E-318)
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x07ce
            java.lang.String r18 = "com.tencent.mm.ui.contact.ChatroomContactUI"
            goto L_0x0885
        L_0x07ce:
            r7 = 1048576(0x100000, double:5.180654E-318)
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x07d9
            java.lang.String r18 = "com.tencent.mm.plugin.label.ui.ContactLabelManagerUI"
            goto L_0x0885
        L_0x07d9:
            r7 = 2097152(0x200000, double:1.0361308E-317)
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x07e4
            java.lang.String r18 = "com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI"
            goto L_0x0885
        L_0x07e4:
            r7 = 268435456(0x10000000, double:1.32624737E-315)
            java.lang.String r1 = "ipcall"
            java.lang.String r5 = ".ui.IPCallAddressUI"
            java.lang.String r10 = "IPCallAddressUI_KFrom"
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x07fd
            r7 = 1
            r4.putExtra(r10, r7)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ke3.C88144b.m109790h(r0, r1, r5, r4)
            return r7
        L_0x07fd:
            r7 = 4194304(0x400000, double:2.0722615E-317)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0851
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 2
            java.lang.Object r0 = r0.mo119683d(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "sns_userName"
            r4.putExtra(r1, r0)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r4.addFlags(r0)
            java.lang.String r0 = "sns_adapter_type"
            r1 = 1
            r4.putExtra(r0, r1)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r2 = 68389(0x10b25, float:9.5833E-41)
            java.lang.Object r0 = r0.mo119683d(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.Integer) r0, (int) r2)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            r3 = 68389(0x10b25, float:9.5833E-41)
            int r0 = r0 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo119676J(r3, r0)
            java.lang.String r18 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUserPagerUI"
            goto L_0x0885
        L_0x0851:
            r7 = 8388608(0x800000, double:4.144523E-317)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x085b
            java.lang.String r18 = "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI"
            goto L_0x0885
        L_0x085b:
            r7 = 16777216(0x1000000, double:8.289046E-317)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0865
            java.lang.String r18 = "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI"
            goto L_0x0885
        L_0x0865:
            r7 = 33554432(0x2000000, double:1.6578092E-316)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x086f
            java.lang.String r18 = "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI"
            goto L_0x0885
        L_0x086f:
            r7 = 67108864(0x4000000, double:3.31561842E-316)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x088b
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = " walletMallV2 switch is ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.String r18 = "com.tencent.mm.plugin.mall.ui.MallIndexUIv2"
        L_0x0885:
            r15 = r36
            r21 = r18
            goto L_0x0b26
        L_0x088b:
            r7 = 134217728(0x8000000, double:6.63123685E-316)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x089b
            r15 = r36
            android.content.Intent r0 = m114058h(r12, r15)
            r5 = r0
            goto L_0x0b27
        L_0x089b:
            r15 = r36
            r7 = 1073741824(0x40000000, double:5.304989477E-315)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x08a8
            java.lang.String r0 = "com.tencent.mm.plugin.safedevice.ui.MySafeDeviceListUI"
            goto L_0x0b24
        L_0x08a8:
            r7 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x08c4
            java.lang.String r0 = "enter to cardhome"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.autogen.events.GotoCardHomePageEvent r0 = new com.tencent.mm.autogen.events.GotoCardHomePageEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GotoCardHomePageEvent$a r1 = r0.f107606d
            r1.f107608a = r15
            r0.publish()
            goto L_0x0af2
        L_0x08c4:
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0902
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131831056(0x7f112910, float:1.9295127E38)
            java.lang.String r0 = r0.getString(r1)
            eb0.c2 r0 = eb0.C45608d2.m50666a(r0)
            java.lang.String r0 = r0.mo71122a()
            java.lang.String r1 = "filter_type"
            r4.putExtra(r1, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131836277(0x7f113d75, float:1.9305716E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "titile"
            r4.putExtra(r1, r0)
            r0 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r1 = "list_attr"
            r4.putExtra(r1, r0)
            java.lang.String r0 = "com.tencent.mm.ui.contact.SelectSpecialContactUI"
            goto L_0x0b24
        L_0x0902:
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x090f
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI"
            goto L_0x0b24
        L_0x090f:
            r7 = 17179869184(0x400000000, double:8.4879831639E-314)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x091c
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI"
            goto L_0x0b24
        L_0x091c:
            r7 = 34359738368(0x800000000, double:1.69759663277E-313)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0929
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI"
            goto L_0x0b24
        L_0x0929:
            r7 = 68719476736(0x1000000000, double:3.39519326554E-313)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0936
            java.lang.String r0 = "com.tencent.mm.plugin.backup.backupmoveui.BackupUI"
            goto L_0x0b24
        L_0x0936:
            r7 = 137438953472(0x2000000000, double:6.7903865311E-313)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x094d
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "com.tencent.mm.plugin.account.bind.ui.BindQQUI"
            r4.setClassName(r0, r1)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r15, r4)
            r7 = 1
            return r7
        L_0x094d:
            r7 = 1
            r23 = 274877906944(0x4000000000, double:1.358077306218E-312)
            int r8 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x0964
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI"
            r4.setClassName(r0, r1)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r15, r4)
            return r7
        L_0x0964:
            r7 = 549755813888(0x8000000000, double:2.716154612436E-312)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0971
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI"
            goto L_0x0b24
        L_0x0971:
            r7 = 1099511627776(0x10000000000, double:5.43230922487E-312)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0991
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "Contact_User"
            java.lang.String r2 = "qqsync"
            android.content.Intent r1 = r4.putExtra(r1, r2)
            java.lang.String r2 = "profile"
            java.lang.String r3 = ".ui.ContactInfoUI"
            ke3.C88144b.m109790h(r0, r2, r3, r1)
            r1 = 1
            return r1
        L_0x0991:
            r7 = 2199023255552(0x20000000000, double:1.0864618449742E-311)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x099e
            java.lang.String r0 = "com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI"
            goto L_0x0b24
        L_0x099e:
            r7 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x09ab
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI"
            goto L_0x0b24
        L_0x09ab:
            r7 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x09b8
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI"
            goto L_0x0b24
        L_0x09b8:
            r7 = 17592186044416(0x100000000000, double:8.6916947597938E-311)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x09d4
            java.lang.String r0 = "launch_from_webview"
            r1 = 0
            r4.putExtra(r0, r1)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "address"
            java.lang.String r2 = ".ui.WalletSelectAddrUI"
            r7 = 1
            ke3.C88144b.m109792j(r0, r1, r2, r4, r7)
            return r7
        L_0x09d4:
            r7 = 1
            r23 = 35184372088832(0x200000000000, double:1.73833895195875E-310)
            int r8 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x09f7
            r0 = 4
            java.lang.String r2 = "k_sns_tag_id"
            r4.putExtra(r2, r0)
            java.lang.String r0 = "k_sns_from_settings_about_sns"
            r4.putExtra(r0, r7)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "sns"
            java.lang.String r2 = ".ui.SnsBlackDetailUI"
            ke3.C88144b.m109790h(r0, r1, r2, r4)
            return r7
        L_0x09f7:
            r7 = 70368744177664(0x400000000000, double:3.4766779039175E-310)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0a22
            r0 = 5
            java.lang.String r2 = "k_sns_tag_id"
            r4.putExtra(r2, r0)
            java.lang.String r0 = "k_sns_from_settings_about_sns"
            r1 = 2
            r4.putExtra(r0, r1)
            r0 = 8
            java.lang.String r1 = "k_tag_detail_sns_block_scene"
            r4.putExtra(r1, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "sns"
            java.lang.String r2 = ".ui.SnsTagDetailUI"
            ke3.C88144b.m109790h(r0, r1, r2, r4)
            goto L_0x0af2
        L_0x0a22:
            r7 = 140737488355328(0x800000000000, double:6.953355807835E-310)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0a2f
            java.lang.String r0 = "com.tencent.mm.plugin.emoji.ui.EmojiMineUI"
            goto L_0x0b24
        L_0x0a2f:
            r7 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            int r11 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0a4b
            com.tencent.mm.autogen.events.CommandProcessorEvent r0 = new com.tencent.mm.autogen.events.CommandProcessorEvent
            r0.<init>()
            com.tencent.mm.autogen.events.CommandProcessorEvent$a r1 = r0.f193536d
            java.lang.String r2 = "//uplog"
            r1.f193538a = r2
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1.f193539b = r2
            r0.publish()
            r7 = 1
            return r7
        L_0x0a4b:
            r7 = 1
            r23 = 562949953421312(0x2000000000000, double:2.781342323134002E-309)
            int r8 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x0a66
            r4.putExtra(r10, r7)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ke3.C88144b.m109790h(r0, r1, r5, r4)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = ".ui.IPCallShareCouponUI"
            ke3.C88144b.m109790h(r0, r1, r2, r4)
            return r7
        L_0x0a66:
            r23 = 18014398509481984(0x40000000000000, double:1.7800590868057611E-307)
            int r8 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r8 != 0) goto L_0x0a89
            r4.putExtra(r10, r7)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ke3.C88144b.m109790h(r0, r1, r5, r4)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = ".ui.IPCallShareCouponUI"
            ke3.C88144b.m109790h(r0, r1, r2, r4)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = ".ui.IPCallShareCouponCardUI"
            ke3.C88144b.m109790h(r0, r1, r2, r4)
            goto L_0x0af2
        L_0x0a89:
            r7 = 576460752303423488(0x800000000000000, double:3.785766995733679E-270)
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0af5
            r1 = 1
            r4.putExtra(r10, r1)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "com.tencent.mm.plugin.sight.draft.ui.SightDraftUI"
            r4.setClassName(r0, r1)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r4)
            java.lang.Object[] r2 = r1.mo10232b()
            java.lang.String r3 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r5 = "gotoUri"
            java.lang.String r7 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r8 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r37 = r0
            r38 = r2
            r39 = r3
            r40 = r5
            r41 = r7
            r42 = r8
            r43 = r10
            r44 = r11
            j20.C117292a.m165358d(r37, r38, r39, r40, r41, r42, r43, r44)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r1 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r2 = "gotoUri"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r38 = r1
            r39 = r2
            r40 = r3
            r41 = r5
            r42 = r7
            r43 = r8
            j20.C117292a.m165359e(r37, r38, r39, r40, r41, r42, r43)
        L_0x0af2:
            r1 = r15
            goto L_0x0eb8
        L_0x0af5:
            r7 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0afe
            java.lang.String r0 = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI"
            goto L_0x0b24
        L_0x0afe:
            r7 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0b1c
            java.lang.String r1 = "emoji_tab"
            r2 = 1
            r4.putExtra(r1, r2)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r3[r5] = r2
            r1.mo160131h(r0, r3)
            r0 = r38
            goto L_0x0b24
        L_0x0b1c:
            r0 = 9007199254740992(0x20000000000000, double:4.450147717014403E-308)
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0b2c
            java.lang.String r0 = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI"
        L_0x0b24:
            r21 = r0
        L_0x0b26:
            r5 = r4
        L_0x0b27:
            r1 = r15
        L_0x0b28:
            r0 = r21
            goto L_0x0ebb
        L_0x0b2c:
            r0 = 576460752303423489(0x800000000000001, double:3.78576699573368E-270)
            int r5 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0e14
            android.net.Uri r1 = android.net.Uri.parse(r37)
            java.lang.String r2 = r1.getQueryParameter(r2)
            java.lang.String r0 = "userName"
            java.lang.String r3 = r1.getQueryParameter(r0)
            java.lang.String r0 = "path"
            java.lang.String r4 = r1.getQueryParameter(r0)
            java.lang.String r0 = "pathType"
            java.lang.String r0 = r1.getQueryParameter(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r5 = 0
            int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            java.lang.String r0 = "invokeData"
            java.lang.String r8 = r1.getQueryParameter(r0)
            java.lang.String r0 = "runtimeSessionId"
            java.lang.String r10 = r1.getQueryParameter(r0)
            java.lang.String r0 = "runtimeTicket"
            java.lang.String r11 = r1.getQueryParameter(r0)
            java.lang.String r0 = "runtimeAppid"
            java.lang.String r12 = r1.getQueryParameter(r0)
            java.lang.String r0 = "miniProgramType"
            java.lang.String r0 = r1.getQueryParameter(r0)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            eb0.v0 r13 = eb0.C86493v0.m107224d()
            r14 = r16
            eb0.v0$c r13 = r13.mo120947c(r14, r5)
            if (r13 == 0) goto L_0x0b9a
            java.lang.String r0 = "key_launch_miniprogram_type"
            r5 = r22
            java.lang.Object r0 = r13.mo120956c(r0, r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0b9a:
            r5 = r0
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r13 = 0
            r0[r13] = r2
            r13 = 1
            r0[r13] = r3
            r13 = 2
            r0[r13] = r4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r39)
            r16 = 3
            r0[r16] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r16 = 4
            r0[r16] = r13
            java.lang.String r13 = "appid = %s, userName = %s, path = %s, translateLinkScene = %d, type = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r0)
            eb0.v0 r0 = eb0.C86493v0.m107224d()
            r0.mo120948e(r14)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r13 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
            r13.<init>()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r45)
            if (r0 != 0) goto L_0x0bd3
            r14 = r45
            r13.f245534g = r14
            goto L_0x0bdb
        L_0x0bd3:
            r14 = r45
            java.lang.String r0 = java.net.URLEncoder.encode(r43)
            r13.f245534g = r0
        L_0x0bdb:
            r0 = r39
            r15 = 2
            if (r0 == r15) goto L_0x0dce
            r15 = 21
            if (r0 != r15) goto L_0x0be6
            goto L_0x0dce
        L_0x0be6:
            r15 = 1
            if (r0 != r15) goto L_0x0d5a
            r15 = 2
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r16 = 0
            r0[r16] = r15
            r15 = 1
            r0[r15] = r8
            java.lang.String r15 = "pathType:%d invokeData:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r15, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r0 != 0) goto L_0x0c63
            c30.g r0 = new c30.g     // Catch:{ Exception -> 0x0c59 }
            r0.<init>((java.lang.String) r8)     // Catch:{ Exception -> 0x0c59 }
            java.lang.Class<kr0.w0> r15 = kr0.C76629w0.class
            di3.d r15 = di3.C86312j.m106911c(r15)     // Catch:{ Exception -> 0x0c59 }
            kr0.w0 r15 = (kr0.C76629w0) r15     // Catch:{ Exception -> 0x0c59 }
            java.lang.String r15 = r15.mo106883cZ(r3)     // Catch:{ Exception -> 0x0c59 }
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x0c59 }
            if (r16 != 0) goto L_0x0c37
            di3.d r16 = di3.C86312j.m106911c(r20)     // Catch:{ Exception -> 0x0c59 }
            r37 = r1
            r1 = r16
            kr0.x0 r1 = (kr0.C76630x0) r1     // Catch:{ Exception -> 0x0c57 }
            boolean r1 = r1.mo106899ud(r15, r5)     // Catch:{ Exception -> 0x0c57 }
            if (r1 == 0) goto L_0x0c39
            zt3.t r1 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0c57 }
            wc3.m$d r15 = new wc3.m$d     // Catch:{ Exception -> 0x0c57 }
            r15.<init>(r0)     // Catch:{ Exception -> 0x0c57 }
            zt3.j r1 = (zt3.C119157j) r1     // Catch:{ Exception -> 0x0c57 }
            r1.mo183870a(r15)     // Catch:{ Exception -> 0x0c57 }
            goto L_0x0c3c
        L_0x0c37:
            r37 = r1
        L_0x0c39:
            m114055e(r0)     // Catch:{ Exception -> 0x0c57 }
        L_0x0c3c:
            java.lang.String r1 = "ad_trace_data"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x0c57 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0c57 }
            if (r1 != 0) goto L_0x0c54
            c30.g r1 = new c30.g     // Catch:{ Exception -> 0x0c57 }
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0c57 }
            java.lang.String r0 = "click_id"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ Exception -> 0x0c57 }
            goto L_0x0c55
        L_0x0c54:
            r0 = r9
        L_0x0c55:
            r1 = r0
            goto L_0x0c66
        L_0x0c57:
            r0 = move-exception
            goto L_0x0c5c
        L_0x0c59:
            r0 = move-exception
            r37 = r1
        L_0x0c5c:
            r1 = 0
            java.lang.Object[] r15 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r15)
            goto L_0x0c65
        L_0x0c63:
            r37 = r1
        L_0x0c65:
            r1 = r9
        L_0x0c66:
            r15 = 1
            if (r15 != r7) goto L_0x0cf9
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r0 != 0) goto L_0x0cf9
            c30.g r0 = new c30.g     // Catch:{ f -> 0x0c7d }
            r0.<init>((java.lang.String) r8)     // Catch:{ f -> 0x0c7d }
            java.lang.String r7 = "name"
            java.lang.String r7 = r0.optString(r7)     // Catch:{ f -> 0x0c7d }
            r9 = r7
            r7 = 0
            goto L_0x0c84
        L_0x0c7d:
            r0 = move-exception
            r7 = 0
            java.lang.Object[] r15 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r15)
        L_0x0c84:
            r15 = 4
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r7] = r10
            r7 = 1
            r0[r7] = r11
            r7 = 2
            r0[r7] = r12
            r7 = 3
            r0[r7] = r9
            java.lang.String r7 = "runtimeSessionId:%s runtimeTicket:%s runtimeAppId:%s functionName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r0)
            r0 = 1111(0x457, float:1.557E-42)
            r13.f245533f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r6 = ":"
            r0.append(r6)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r13.f245534g = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x0ccc
            r6 = 2
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r6 = r13.f245534g
            r7 = 0
            r0[r7] = r6
            r6 = 1
            r0[r6] = r1
            java.lang.String r1 = "%s:%s"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r1, r0)
            r13.f245534g = r0
            goto L_0x0cd4
        L_0x0ccc:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r45)
            if (r0 != 0) goto L_0x0cd4
            r13.f245534g = r14
        L_0x0cd4:
            di3.d r0 = di3.C86312j.m106911c(r20)
            kr0.x0 r0 = (kr0.C76630x0) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 0
            r7 = 0
            r36 = r0
            r37 = r1
            r38 = r3
            r39 = r6
            r40 = r5
            r41 = r7
            r42 = r4
            r43 = r13
            r44 = r2
            r45 = r8
            r36.gm0(r37, r38, r39, r40, r41, r42, r43, r44, r45)
            goto L_0x0e12
        L_0x0cf9:
            java.lang.String r0 = "ad_trace_key"
            r6 = r37
            java.lang.String r0 = r6.getQueryParameter(r0)
            di0.o r6 = new di0.o
            r6.<init>()
            r6.f250929a = r3
            r6.f250931c = r5
            r3 = 0
            r6.f250932d = r3
            r6.f250934f = r4
            r3 = 3
            if (r3 != r7) goto L_0x0d17
            r3 = 1113(0x459, float:1.56E-42)
            r6.f250939k = r3
            goto L_0x0d1b
        L_0x0d17:
            r3 = 1069(0x42d, float:1.498E-42)
            r6.f250939k = r3
        L_0x0d1b:
            r6.f250940l = r2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x0d35
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r4 = 1
            r3[r4] = r1
            java.lang.String r1 = "%s:%s"
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r1, r3)
            r6.f250940l = r1
            goto L_0x0d3d
        L_0x0d35:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r45)
            if (r1 != 0) goto L_0x0d3d
            r13.f245534g = r14
        L_0x0d3d:
            r6.f250946r = r0
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r0 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r0.<init>()
            r6.f250947s = r0
            r0.f239397e = r2
            r1 = 4
            r0.f239396d = r1
            di3.d r0 = di3.C86312j.m106911c(r20)
            kr0.x0 r0 = (kr0.C76630x0) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.mo106898tv(r1, r6)
            goto L_0x0e12
        L_0x0d5a:
            r1 = 6
            if (r0 != r1) goto L_0x0d82
            r0 = 1007(0x3ef, float:1.411E-42)
            r13.f245533f = r0
            di3.d r0 = di3.C86312j.m106911c(r20)
            kr0.x0 r0 = (kr0.C76630x0) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 0
            r6 = 0
            r36 = r0
            r37 = r1
            r38 = r3
            r39 = r2
            r40 = r5
            r41 = r6
            r42 = r4
            r43 = r13
            r36.Ko0(r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0e12
        L_0x0d82:
            r1 = 7
            if (r0 != r1) goto L_0x0da9
            r0 = 1008(0x3f0, float:1.413E-42)
            r13.f245533f = r0
            di3.d r0 = di3.C86312j.m106911c(r20)
            kr0.x0 r0 = (kr0.C76630x0) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 0
            r6 = 0
            r36 = r0
            r37 = r1
            r38 = r3
            r39 = r2
            r40 = r5
            r41 = r6
            r42 = r4
            r43 = r13
            r36.Ko0(r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0e12
        L_0x0da9:
            r0 = 1000(0x3e8, float:1.401E-42)
            r13.f245533f = r0
            di3.d r0 = di3.C86312j.m106911c(r20)
            kr0.x0 r0 = (kr0.C76630x0) r0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 0
            r5 = 0
            r6 = 0
            r36 = r0
            r37 = r1
            r38 = r3
            r39 = r2
            r40 = r5
            r41 = r6
            r42 = r4
            r43 = r13
            r36.Ko0(r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0e12
        L_0x0dce:
            di0.o r0 = new di0.o
            r0.<init>()
            r0.f250929a = r3
            r0.f250931c = r5
            r1 = 0
            r0.f250932d = r1
            r0.f250934f = r4
            r1 = r44
            if (r1 <= 0) goto L_0x0de3
            r0.f250939k = r1
            goto L_0x0de7
        L_0x0de3:
            r1 = 1065(0x429, float:1.492E-42)
            r0.f250939k = r1
        L_0x0de7:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r45)
            if (r1 != 0) goto L_0x0df0
            r0.f250940l = r14
            goto L_0x0df2
        L_0x0df0:
            r0.f250940l = r2
        L_0x0df2:
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer r1 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer
            r1.<init>()
            r0.f250947s = r1
            r1.f239397e = r2
            r2 = 8
            r1.f239396d = r2
            r1 = r36
            r2 = r46
            di0.q r2 = m114051a(r1, r2)
            r0.f250916E = r2
            di3.d r2 = di3.C86312j.m106911c(r20)
            kr0.x0 r2 = (kr0.C76630x0) r2
            r2.mo106898tv(r1, r0)
        L_0x0e12:
            r1 = 1
            return r1
        L_0x0e14:
            r1 = r15
            r15 = r2
            r7 = 576460752303423490(0x800000000000002, double:3.785766995733681E-270)
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0e3a
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r0 = r0.getQueryParameter(r15)
            java.lang.Class<xz.f> r2 = p275xz.C15919f.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            xz.f r2 = (p275xz.C15919f) r2
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r5 = 0
            r2.Zt0(r1, r3, r5, r0)
            goto L_0x0eb8
        L_0x0e3a:
            r7 = 576460752303423552(0x800000000000040, double:3.785766995733733E-270)
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0eb8
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r2 = "kfurl"
            java.lang.String r0 = r0.getQueryParameter(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0e57
            java.lang.String r0 = java.net.URLDecoder.decode(r0)
        L_0x0e57:
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r2 = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest
            r2.<init>()
            long r7 = java.lang.System.currentTimeMillis()
            r2.f108516e = r7
            r5 = 6
            r2.f108517f = r5
            r2.f108515d = r1
            te3.s3 r5 = new te3.s3
            r5.<init>()
            r2.f108520i = r5
            r5.f141285d = r0
            r5.f141286e = r0
            te3.i73 r7 = new te3.i73
            r7.<init>()
            r5.f141288g = r7
            te3.s3 r5 = r2.f108520i
            te3.i73 r5 = r5.f141288g
            r5.f135156f = r0
            if (r3 == 0) goto L_0x0e88
            java.lang.String r0 = "key_app_id"
            java.lang.String r7 = r3.getString(r0, r9)
            goto L_0x0e89
        L_0x0e88:
            r7 = r9
        L_0x0e89:
            r5.f135155e = r7
            te3.s3 r0 = r2.f108520i
            te3.i73 r0 = r0.f141288g
            int r3 = r2.f108517f
            r0.f135154d = r3
            r3 = 1
            r2.f108522n = r3
            android.content.Context r0 = r2.f108515d
            r5 = 2131833846(0x7f1133f6, float:1.9300786E38)
            java.lang.String r0 = r0.getString(r5)
            r2.f108523o = r0
            int r0 = r2.f108517f
            int r0 = he0.C46025n.m51344a(r0)
            r2.f108519h = r0
            r2.f108524p = r3
            r2.f108526r = r3
            java.lang.Class<he0.i> r0 = he0.C59837i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            he0.i r0 = (he0.C59837i) r0
            r0.mo71855jT(r2)
        L_0x0eb8:
            r5 = r4
            goto L_0x0b28
        L_0x0ebb:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0faf
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5.setClassName(r2, r0)
            if (r1 == 0) goto L_0x0f2f
            java.lang.String r2 = "WebViewUI"
            boolean r0 = r0.contains(r2)     // Catch:{ Exception -> 0x0fa4 }
            if (r0 == 0) goto L_0x0edb
            r4 = r19
            r2 = r27
            ke3.C88144b.m109790h(r1, r4, r2, r5)     // Catch:{ Exception -> 0x0fa4 }
            goto L_0x0fa2
        L_0x0edb:
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x0fa4 }
            r0.<init>()     // Catch:{ Exception -> 0x0fa4 }
            r0.mo10233c(r5)     // Catch:{ Exception -> 0x0fa4 }
            java.lang.Object[] r2 = r0.mo10232b()     // Catch:{ Exception -> 0x0fa4 }
            java.lang.String r3 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r4 = "gotoUri"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r37 = r36
            r38 = r2
            r39 = r3
            r40 = r4
            r41 = r5
            r42 = r7
            r43 = r8
            r44 = r10
            j20.C117292a.m165358d(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ Exception -> 0x0fa4 }
            r2 = 0
            java.lang.Object r0 = r0.mo10231a(r2)     // Catch:{ Exception -> 0x0fa4 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x0fa4 }
            r1.startActivity(r0)     // Catch:{ Exception -> 0x0fa4 }
            java.lang.String r0 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r2 = "gotoUri"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r37 = r0
            r38 = r2
            r39 = r3
            r40 = r4
            r41 = r5
            r42 = r7
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x0fa4 }
            goto L_0x0fa2
        L_0x0f2f:
            r4 = r19
            r2 = r27
            java.lang.String r1 = "WebViewUI"
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0fa4 }
            if (r0 == 0) goto L_0x0f43
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0fa4 }
            ke3.C88144b.m109790h(r0, r4, r2, r5)     // Catch:{ Exception -> 0x0fa4 }
            goto L_0x0f9b
        L_0x0f43:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0fa4 }
            k20.a r1 = new k20.a     // Catch:{ Exception -> 0x0fa4 }
            r1.<init>()     // Catch:{ Exception -> 0x0fa4 }
            r1.mo10233c(r5)     // Catch:{ Exception -> 0x0fa4 }
            java.lang.Object[] r2 = r1.mo10232b()     // Catch:{ Exception -> 0x0fa4 }
            java.lang.String r3 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r4 = "gotoUri"
            java.lang.String r7 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r8 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r36 = r0
            r37 = r2
            r38 = r3
            r39 = r4
            r40 = r7
            r41 = r8
            r42 = r10
            r43 = r11
            j20.C117292a.m165358d(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x0fa4 }
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)     // Catch:{ Exception -> 0x0fa4 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ Exception -> 0x0fa4 }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x0fa4 }
            java.lang.String r1 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r2 = "gotoUri"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r36 = r0
            r37 = r1
            r38 = r2
            r39 = r3
            r40 = r4
            r41 = r7
            r42 = r8
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x0fa4 }
        L_0x0f9b:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0fa4 }
            nj3.C88990b.m111192a(r0, r5)     // Catch:{ Exception -> 0x0fa4 }
        L_0x0fa2:
            r1 = 1
            goto L_0x0fae
        L_0x0fa4:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r9
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r2)
        L_0x0fae:
            return r1
        L_0x0faf:
            r3 = 0
            return r3
        L_0x0fb1:
            r10 = r42
            r14 = r0
            r5 = r11
            r16 = r12
            r11 = r15
            r34 = r27
            r0 = r39
            r15 = r2
            r2 = r24
            r35 = r8
            r8 = r4
            r4 = r6
            r6 = r35
            java.lang.String r12 = "weixin://dl/businessTempSession/"
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L_0x1116
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            if (r38 == 0) goto L_0x0fe9
            android.os.Bundle r4 = r38.getExtras()
            r3.putExtras(r4)
            int r4 = r38.getFlags()
            if (r4 == 0) goto L_0x0fe9
            int r4 = r38.getFlags()
            r3.addFlags(r4)
        L_0x0fe9:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r4)
            android.net.Uri r4 = android.net.Uri.parse(r37)
            if (r4 != 0) goto L_0x0ffc
            java.lang.String r0 = "tempsession uri is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r1 = 0
            return r1
        L_0x0ffc:
            java.lang.String r5 = "sessionFrom"
            java.lang.String r5 = r4.getQueryParameter(r5)
            java.lang.String r8 = "showtype"
            java.lang.String r8 = r4.getQueryParameter(r8)
            java.lang.String r7 = r4.getQueryParameter(r7)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r9 == 0) goto L_0x101b
            java.lang.String r7 = "userName"
            java.lang.String r7 = r4.getQueryParameter(r7)
        L_0x101b:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r9 == 0) goto L_0x1029
            java.lang.String r0 = "tempsession user is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r9 = 0
            return r9
        L_0x1029:
            r9 = 0
            java.lang.String r10 = "scene"
            java.lang.String r4 = r4.getQueryParameter(r10)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r9)
            if (r4 == 0) goto L_0x1053
            r9 = 4
            if (r0 != r9) goto L_0x1053
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Jsapi assign scene to "
            r0.append(r9)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r0 = r4
        L_0x1053:
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r9 = 0
            r4[r9] = r7
            r9 = 1
            r4[r9] = r5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r10 = 2
            r4[r10] = r9
            r9 = 3
            r4[r9] = r37
            r9 = 4
            r4[r9] = r8
            java.lang.String r9 = "tempsession jump, %s, %s, %s, %s, %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r4)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "com.tencent.mm.ui.chatting.ChattingUI"
            r3.setClassName(r4, r6)
            java.lang.String r4 = "Chat_User"
            r3.putExtra(r4, r7)
            java.lang.String r4 = "finish_direct"
            r6 = 1
            r3.putExtra(r4, r6)
            java.lang.String r4 = "key_is_temp_session"
            r3.putExtra(r4, r6)
            java.lang.String r4 = "key_temp_session_from"
            r3.putExtra(r4, r5)
            java.lang.String r4 = "key_temp_session_scene"
            r3.putExtra(r4, r0)
            r4 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r8, (int) r4)
            java.lang.String r4 = "key_temp_session_show_type"
            r3.putExtra(r4, r0)
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            com.tencent.mm.storage.z1 r0 = r0.get(r7)
            if (r0 == 0) goto L_0x1108
            int r0 = r0.mo62907i3()
            if (r0 > 0) goto L_0x10b5
            goto L_0x1108
        L_0x10b5:
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r3)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r4 = "gotoUri"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r37 = r36
            r38 = r2
            r39 = r3
            r40 = r4
            r41 = r5
            r42 = r6
            r43 = r7
            r44 = r8
            j20.C117292a.m165358d(r37, r38, r39, r40, r41, r42, r43, r44)
            r2 = 0
            java.lang.Object r0 = r0.mo10231a(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r0 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r2 = "gotoUri"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r37 = r0
            r38 = r2
            r39 = r3
            r40 = r4
            r41 = r5
            r42 = r6
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)
            goto L_0x1114
        L_0x1108:
            eb0.w2 r0 = eb0.C31519v2.m39436a()
            wc3.m$e r4 = new wc3.m$e
            r4.<init>(r3, r1)
            r0.mo55988e(r7, r2, r4)
        L_0x1114:
            r1 = 1
            return r1
        L_0x1116:
            java.lang.String r7 = "weixin://dl/businessGame/detail/"
            boolean r7 = r13.startsWith(r7)
            if (r7 != 0) goto L_0x1594
            java.lang.String r7 = "weixin://dl/businessGame/detail"
            boolean r7 = r13.startsWith(r7)
            if (r7 == 0) goto L_0x112a
            goto L_0x1594
        L_0x112a:
            java.lang.String r7 = "weixin://dl/businessGame/library/"
            boolean r7 = r13.startsWith(r7)
            if (r7 != 0) goto L_0x14b2
            java.lang.String r7 = "weixin://dl/businessGame/library"
            boolean r7 = r13.startsWith(r7)
            if (r7 == 0) goto L_0x113e
            goto L_0x14b2
        L_0x113e:
            java.lang.String r7 = "weixin://dl/businessWebview/link/"
            boolean r7 = r13.startsWith(r7)
            java.lang.String r12 = "geta8key_scene"
            java.lang.String r0 = "geta8key_open_webview_appid"
            if (r7 != 0) goto L_0x1382
            java.lang.String r7 = "weixin://dl/businessWebview/link"
            boolean r7 = r13.startsWith(r7)
            if (r7 == 0) goto L_0x1156
            goto L_0x1382
        L_0x1156:
            java.lang.String r7 = "weixin://dl/openbusinesswebview/link/"
            boolean r7 = r13.startsWith(r7)
            if (r7 == 0) goto L_0x12c8
            java.lang.String r7 = "gotoUri, uri startsWith openbusinesswebview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            android.net.Uri r7 = android.net.Uri.parse(r37)
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            if (r7 == 0) goto L_0x11f0
            java.lang.String r9 = r7.getQueryParameter(r9)
            java.lang.String r14 = "type"
            java.lang.String r14 = r7.getQueryParameter(r14)
            r24 = r2
            r2 = 0
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r2)
            java.lang.String r7 = r7.getQueryParameter(r15)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            r15 = 3
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r2] = r9
            r2 = 1
            r1[r2] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r39)
            r15 = 2
            r1[r15] = r2
            java.lang.String r2 = "gotoUri, rawUrl = %s, appId:%s, translateLinkScene: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            r13.putExtra(r5, r9)
            r13.putExtra(r4, r8)
            r13.putExtra(r11, r10)
            r13.putExtra(r0, r7)
            r0 = 57
            r13.putExtra(r12, r0)
            java.lang.String r0 = "show_openapp_dialog"
            r1 = 0
            r13.putExtra(r0, r1)
            java.lang.String r0 = "webview_invoke_launch_app_when_back"
            r2 = 1
            r13.putExtra(r0, r2)
            r4 = 3
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r1] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r2] = r1
            r1 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "%s://openbusinesswebview?type=%d&ret=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "webview_invoke_launch_app_ext_info_when_back"
            r13.putExtra(r1, r0)
            java.lang.String r0 = "KAppId"
            r13.putExtra(r0, r7)
            java.lang.String r0 = f260971e
            java.lang.String r1 = "transaction_for_openapi_openwebview"
            r13.putExtra(r1, r0)
            if (r3 == 0) goto L_0x11ed
            r13.putExtras(r3)
        L_0x11ed:
            r0 = r18
            goto L_0x11f4
        L_0x11f0:
            r24 = r2
            r0 = r21
        L_0x11f4:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x12c6
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r13.setClassName(r1, r0)
            r1 = r36
            if (r1 == 0) goto L_0x1258
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x12b9 }
            r0.<init>()     // Catch:{ Exception -> 0x12b9 }
            r0.mo10233c(r13)     // Catch:{ Exception -> 0x12b9 }
            java.lang.Object[] r2 = r0.mo10232b()     // Catch:{ Exception -> 0x12b9 }
            java.lang.String r3 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r4 = "gotoUri"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r37 = r36
            r38 = r2
            r39 = r3
            r40 = r4
            r41 = r5
            r42 = r7
            r43 = r8
            r44 = r9
            j20.C117292a.m165358d(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ Exception -> 0x12b9 }
            r2 = 0
            java.lang.Object r0 = r0.mo10231a(r2)     // Catch:{ Exception -> 0x12b9 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x12b9 }
            r1.startActivity(r0)     // Catch:{ Exception -> 0x12b9 }
            java.lang.String r0 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r2 = "gotoUri"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r37 = r0
            r38 = r2
            r39 = r3
            r40 = r4
            r41 = r5
            r42 = r7
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x12b9 }
            goto L_0x12b7
        L_0x1258:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x12b9 }
            k20.a r1 = new k20.a     // Catch:{ Exception -> 0x12b9 }
            r1.<init>()     // Catch:{ Exception -> 0x12b9 }
            r1.mo10233c(r13)     // Catch:{ Exception -> 0x12b9 }
            java.lang.Object[] r2 = r1.mo10232b()     // Catch:{ Exception -> 0x12b9 }
            java.lang.String r3 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r4 = "gotoUri"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r36 = r0
            r37 = r2
            r38 = r3
            r39 = r4
            r40 = r5
            r41 = r7
            r42 = r8
            r43 = r9
            j20.C117292a.m165358d(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x12b9 }
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)     // Catch:{ Exception -> 0x12b9 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ Exception -> 0x12b9 }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x12b9 }
            java.lang.String r1 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r2 = "gotoUri"
            java.lang.String r3 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r36 = r0
            r37 = r1
            r38 = r2
            r39 = r3
            r40 = r4
            r41 = r5
            r42 = r7
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x12b9 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x12b9 }
            nj3.C88990b.m111192a(r0, r13)     // Catch:{ Exception -> 0x12b9 }
        L_0x12b7:
            r1 = 1
            goto L_0x12c5
        L_0x12b9:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r24
            r4 = r24
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r4, r2)
        L_0x12c5:
            return r1
        L_0x12c6:
            r3 = 0
            return r3
        L_0x12c8:
            r4 = r2
            r3 = 0
            java.lang.String r0 = "weixin://dl/jumpFakeWxa/"
            boolean r0 = r13.startsWith(r0)
            if (r0 != 0) goto L_0x12de
            java.lang.String r0 = "weixin://dl/openNativeView/"
            boolean r0 = r13.startsWith(r0)
            if (r0 == 0) goto L_0x12dd
            goto L_0x12de
        L_0x12dd:
            return r3
        L_0x12de:
            android.net.Uri r0 = android.net.Uri.parse(r37)
            java.lang.String r2 = r0.getQueryParameter(r15)
            java.lang.String r5 = "businessType"
            java.lang.String r0 = r0.getQueryParameter(r5)
            eb0.v0 r5 = eb0.C86493v0.m107224d()
            eb0.v0$c r5 = r5.mo120947c(r14, r3)
            if (r5 == 0) goto L_0x131d
            java.lang.String r3 = "key_launch_miniprogram_type"
            r7 = r22
            java.lang.Object r3 = r5.mo120956c(r3, r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r7 = "key_launch_miniprogram_query_info"
            java.lang.Object r7 = r5.mo120956c(r7, r4)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "key_open_business_view_ext_info"
            java.lang.Object r8 = r5.mo120956c(r8, r4)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "key_launch_mini_program_open_id"
            java.lang.Object r4 = r5.mo120956c(r9, r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x1322
        L_0x131d:
            r4 = r21
            r7 = r4
            r8 = r7
            r3 = 0
        L_0x1322:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r9 = 0
            r5[r9] = r2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r39)
            r10 = 1
            r5[r10] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r11 = 2
            r5[r11] = r9
            java.lang.String r9 = "appid = %s, translateLinkScene = %d, type = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r5)
            eb0.v0 r5 = eb0.C86493v0.m107224d()
            r5.mo120948e(r14)
            java.lang.String r5 = "weixin://dl/jumpFakeWxa/"
            boolean r5 = r13.startsWith(r5)
            if (r5 == 0) goto L_0x1374
            r13 = r39
            if (r13 != r10) goto L_0x1372
            r4 = r46
            boolean r5 = r4 instanceof kr0.C76630x0.C76631a
            if (r5 == 0) goto L_0x1359
            kr0.x0$a r4 = (kr0.C76630x0.C76631a) r4
            r21 = r4
        L_0x1359:
            di3.d r4 = di3.C86312j.m106911c(r20)
            kr0.x0 r4 = (kr0.C76630x0) r4
            r37 = r4
            r38 = r36
            r39 = r2
            r40 = r0
            r41 = r7
            r42 = r3
            r43 = r21
            r37.La0(r38, r39, r40, r41, r42, r43)
            r1 = 1
            return r1
        L_0x1372:
            r7 = 0
            return r7
        L_0x1374:
            r1 = 1
            r7 = 0
            wc3.f$a r3 = wc3.C38055f.f100600a
            boolean r0 = r3.mo61505a(r0, r2, r8, r4)
            if (r0 == 0) goto L_0x137f
            return r1
        L_0x137f:
            f260968b = r1
            return r7
        L_0x1382:
            r13 = r39
            r7 = 0
            java.lang.String r2 = "gotoUri, uri startsWith H5_LINK"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            android.net.Uri r2 = android.net.Uri.parse(r37)
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            if (r2 == 0) goto L_0x14b0
            java.lang.String r9 = r2.getQueryParameter(r9)
            java.lang.String r1 = "type"
            java.lang.String r1 = r2.getQueryParameter(r1)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r7)
            java.lang.String r15 = r2.getQueryParameter(r15)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r15)
            java.lang.String r7 = "outer"
            java.lang.String r2 = r2.getQueryParameter(r7)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r7 = 0
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r7)
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r7] = r9
            r7 = 1
            r3[r7] = r15
            java.lang.Integer r16 = java.lang.Integer.valueOf(r39)
            r18 = 2
            r3[r18] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            r18 = 3
            r3[r18] = r16
            java.lang.String r7 = "gotoUri, rawUrl = %s, appId:%s, translateLinkScene: %s, outer:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r3)
            r14.putExtra(r5, r9)
            r14.putExtra(r4, r8)
            r14.putExtra(r11, r10)
            r3 = 1
            if (r13 != r3) goto L_0x1404
            if (r2 != r3) goto L_0x13ef
            r14.putExtra(r0, r15)
            r0 = 53
            r14.putExtra(r12, r0)
        L_0x13ef:
            java.lang.String r0 = "show_openapp_dialog"
            r2 = 0
            r14.putExtra(r0, r2)
            r0 = 40
            java.lang.String r2 = "pay_channel"
            r14.putExtra(r2, r0)
            r0 = 39
            ie3.C87716k.m109137a(r0)
            goto L_0x141d
        L_0x1404:
            r3 = 2
            if (r13 != r3) goto L_0x141d
            r3 = 1
            if (r2 != r3) goto L_0x1412
            r14.putExtra(r0, r15)
            r0 = 52
            r14.putExtra(r12, r0)
        L_0x1412:
            r0 = 39
            java.lang.String r2 = "pay_channel"
            r14.putExtra(r2, r0)
            ie3.C87716k.m109137a(r0)
        L_0x141d:
            r0 = 5
            if (r1 != r0) goto L_0x144c
            java.lang.String r0 = "webview_invoke_launch_app_when_back"
            r2 = 1
            r14.putExtra(r0, r2)
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r3 = 0
            r0[r3] = r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            r1 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "%s://opentypewebview?wx_internal_resptype=%d&ret=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "webview_invoke_launch_app_ext_info_when_back"
            r14.putExtra(r1, r0)
            java.lang.String r0 = "KAppId"
            r14.putExtra(r0, r15)
        L_0x144c:
            java.lang.String r0 = f260971e
            java.lang.String r1 = "transaction_for_openapi_openwebview"
            r14.putExtra(r1, r0)
            r1 = r40
            if (r1 == 0) goto L_0x145b
            r14.putExtras(r1)
        L_0x145b:
            r1 = r36
            if (r1 == 0) goto L_0x149c
            r2 = 2
            if (r13 != r2) goto L_0x1494
            android.net.Uri r0 = android.net.Uri.parse(r9)
            boolean r0 = ke3.C88144b.m109784c(r0)
            if (r0 == 0) goto L_0x1482
            boolean r0 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49045a()
            if (r0 == 0) goto L_0x147a
            java.lang.String r0 = "game"
            java.lang.String r2 = ".luggage.SchemeEntryMMLuggageGameWebViewUI"
            ke3.C88144b.m109790h(r1, r0, r2, r14)
            goto L_0x14ae
        L_0x147a:
            java.lang.String r0 = "game"
            java.lang.String r2 = ".luggage.SchemeEntryLuggageGameWebViewUI"
            ke3.C88144b.m109790h(r1, r0, r2, r14)
            goto L_0x14ae
        L_0x1482:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r14.addFlags(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r14.addFlags(r0)
            java.lang.String r0 = ".ui.tools.CustomSchemeEntryWebViewUI"
            r2 = r19
            ke3.C88144b.m109790h(r1, r2, r0, r14)
            goto L_0x14ae
        L_0x1494:
            r2 = r19
            r3 = r34
            ke3.C88144b.m109790h(r1, r2, r3, r14)
            goto L_0x14ae
        L_0x149c:
            r2 = r19
            r3 = r34
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ke3.C88144b.m109790h(r0, r2, r3, r14)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            nj3.C88990b.m111192a(r0, r14)
        L_0x14ae:
            r1 = 1
            return r1
        L_0x14b0:
            r1 = 0
            return r1
        L_0x14b2:
            java.lang.String r0 = "gotoUri, uri startsWith GAME_LIBRARY"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = "com.tencent.mm.plugin.game.ui.GameLibraryUI"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x1592
            r4 = r16
            r5 = 6
            r0.putExtra(r4, r5)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.setClassName(r4, r3)
            if (r1 == 0) goto L_0x1526
            k20.a r3 = new k20.a     // Catch:{ Exception -> 0x1587 }
            r3.<init>()     // Catch:{ Exception -> 0x1587 }
            r3.mo10233c(r0)     // Catch:{ Exception -> 0x1587 }
            java.lang.Object[] r0 = r3.mo10232b()     // Catch:{ Exception -> 0x1587 }
            java.lang.String r4 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r5 = "gotoUri"
            java.lang.String r7 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r37 = r36
            r38 = r0
            r39 = r4
            r40 = r5
            r41 = r7
            r42 = r8
            r43 = r9
            r44 = r10
            j20.C117292a.m165358d(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ Exception -> 0x1587 }
            r4 = 0
            java.lang.Object r0 = r3.mo10231a(r4)     // Catch:{ Exception -> 0x1587 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x1587 }
            r1.startActivity(r0)     // Catch:{ Exception -> 0x1587 }
            java.lang.String r0 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r3 = "gotoUri"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r37 = r0
            r38 = r3
            r39 = r4
            r40 = r5
            r41 = r7
            r42 = r8
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x1587 }
            goto L_0x1585
        L_0x1526:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x1587 }
            k20.a r3 = new k20.a     // Catch:{ Exception -> 0x1587 }
            r3.<init>()     // Catch:{ Exception -> 0x1587 }
            r3.mo10233c(r0)     // Catch:{ Exception -> 0x1587 }
            java.lang.Object[] r4 = r3.mo10232b()     // Catch:{ Exception -> 0x1587 }
            java.lang.String r5 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r7 = "gotoUri"
            java.lang.String r8 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r36 = r1
            r37 = r4
            r38 = r5
            r39 = r7
            r40 = r8
            r41 = r9
            r42 = r10
            r43 = r11
            j20.C117292a.m165358d(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x1587 }
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)     // Catch:{ Exception -> 0x1587 }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ Exception -> 0x1587 }
            r1.startActivity(r3)     // Catch:{ Exception -> 0x1587 }
            java.lang.String r3 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r4 = "gotoUri"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r36 = r1
            r37 = r3
            r38 = r4
            r39 = r5
            r40 = r7
            r41 = r8
            r42 = r9
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x1587 }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x1587 }
            nj3.C88990b.m111192a(r1, r0)     // Catch:{ Exception -> 0x1587 }
        L_0x1585:
            r1 = 1
            goto L_0x1591
        L_0x1587:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r2, r3)
        L_0x1591:
            return r1
        L_0x1592:
            r4 = 0
            return r4
        L_0x1594:
            r4 = r16
            java.lang.String r0 = "gotoUri, uri startsWith GAME_DETAIL"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.net.Uri r0 = android.net.Uri.parse(r37)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            if (r0 == 0) goto L_0x15b5
            java.lang.String r0 = r0.getQueryParameter(r15)
            java.lang.String r5 = "game_app_id"
            r3.putExtra(r5, r0)
            r0 = 6
            r3.putExtra(r4, r0)
            java.lang.String r21 = "com.tencent.mm.plugin.game.ui.GameDetailUI"
        L_0x15b5:
            r0 = r21
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x1685
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3.setClassName(r4, r0)
            if (r1 == 0) goto L_0x1619
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x167a }
            r0.<init>()     // Catch:{ Exception -> 0x167a }
            r0.mo10233c(r3)     // Catch:{ Exception -> 0x167a }
            java.lang.Object[] r3 = r0.mo10232b()     // Catch:{ Exception -> 0x167a }
            java.lang.String r4 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r5 = "gotoUri"
            java.lang.String r7 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r37 = r36
            r38 = r3
            r39 = r4
            r40 = r5
            r41 = r7
            r42 = r8
            r43 = r9
            r44 = r10
            j20.C117292a.m165358d(r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ Exception -> 0x167a }
            r3 = 0
            java.lang.Object r0 = r0.mo10231a(r3)     // Catch:{ Exception -> 0x167a }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x167a }
            r1.startActivity(r0)     // Catch:{ Exception -> 0x167a }
            java.lang.String r0 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r3 = "gotoUri"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r37 = r0
            r38 = r3
            r39 = r4
            r40 = r5
            r41 = r7
            r42 = r8
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x167a }
            goto L_0x1678
        L_0x1619:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x167a }
            k20.a r1 = new k20.a     // Catch:{ Exception -> 0x167a }
            r1.<init>()     // Catch:{ Exception -> 0x167a }
            r1.mo10233c(r3)     // Catch:{ Exception -> 0x167a }
            java.lang.Object[] r4 = r1.mo10232b()     // Catch:{ Exception -> 0x167a }
            java.lang.String r5 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r7 = "gotoUri"
            java.lang.String r8 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r36 = r0
            r37 = r4
            r38 = r5
            r39 = r7
            r40 = r8
            r41 = r9
            r42 = r10
            r43 = r11
            j20.C117292a.m165358d(r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x167a }
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)     // Catch:{ Exception -> 0x167a }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ Exception -> 0x167a }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x167a }
            java.lang.String r1 = "com/tencent/mm/pluginsdk/DeepLinkHelper"
            java.lang.String r4 = "gotoUri"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;ILandroid/os/Bundle;I[BLjava/lang/String;ILjava/lang/String;Lcom/tencent/mm/pluginsdk/DeepLinkHelper$DeepLinkCallback;)Z"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r36 = r0
            r37 = r1
            r38 = r4
            r39 = r5
            r40 = r7
            r41 = r8
            r42 = r9
            j20.C117292a.m165359e(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x167a }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x167a }
            nj3.C88990b.m111192a(r0, r3)     // Catch:{ Exception -> 0x167a }
        L_0x1678:
            r1 = 1
            goto L_0x1684
        L_0x167a:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r2, r3)
        L_0x1684:
            return r1
        L_0x1685:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wc3.C90945m.m114064n(android.content.Context, java.lang.String, android.content.Intent, int, android.os.Bundle, int, byte[], java.lang.String, int, java.lang.String, wc3.m$h):boolean");
    }

    /* renamed from: o */
    public static boolean m114065o(String str, long j) {
        if (!Util.isNullOrNil(str)) {
            String r = m114068r(str);
            HashMap hashMap = (HashMap) f260972f;
            long longValue = hashMap.containsKey(r) ? ((Long) hashMap.get(r)).longValue() : -1;
            return longValue != -1 && (longValue == 0 || (longValue & j) == longValue);
        }
    }

    /* renamed from: p */
    public static boolean m114066p(Uri uri) {
        if (uri == null) {
            return false;
        }
        return uri.toString().startsWith("weixin://dl/business/tempsession/") || uri.toString().startsWith("weixin://dl/businessTempSession/");
    }

    /* renamed from: q */
    public static boolean m114067q(Uri uri) {
        if (uri == null || !C89925n.m112490c(uri.toString(), "weixin://dl/")) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("ticket");
        if (Util.isNullOrNil(queryParameter)) {
            queryParameter = uri.getQueryParameter("t");
        }
        if (!Util.isNullOrNil(queryParameter)) {
            return true;
        }
        return m114066p(uri);
    }

    /* renamed from: r */
    public static String m114068r(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() + "://" + parse.getHost() + parse.getPath();
    }

    /* renamed from: s */
    public static String m114069s(String str) {
        if (!WeChatBrands.AppInfo.current().isMainland() && str.startsWith("wechat://")) {
            str.replace("wechat://", "weixin://");
        }
        return str;
    }
}
