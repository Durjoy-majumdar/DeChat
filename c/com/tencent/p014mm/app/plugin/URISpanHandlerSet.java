package com.tencent.p014mm.app.plugin;

import a11.C39479c;
import a70.C112760b;
import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import c30.C104289g;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CloseAAEvent;
import com.tencent.p014mm.autogen.events.CloseAAUrgeNotifyEvent;
import com.tencent.p014mm.autogen.events.GetA8KeyRedirectEvent;
import com.tencent.p014mm.autogen.events.NotifyGroupTodoEvent;
import com.tencent.p014mm.autogen.events.RemittanceAccountDetailEvent;
import com.tencent.p014mm.autogen.events.RemittanceRefuseEvent;
import com.tencent.p014mm.autogen.events.ScrollChattingUIConversationListEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipExceptionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCTopicSearchContentActionStruct;
import com.tencent.p014mm.chatroom.p015ui.ManagerRoomByWeworkUI;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.chatting.component.C44814c;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.p136ui.contact.SelectContactUI;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.MobileFriendUI;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1728m2;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandCheckWxaShortLinkUI;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsPersonalInfoUI;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.plugin.wxpaysdk.api.ResendMsgInfo;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import de3.C45331f0;
import de3.C45335p;
import de3.C7304v;
import dg0.C75398e;
import di0.C86299o;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45607c2;
import eb0.C45608d2;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import h81.C32735h;
import hg0.C76166a;
import ht1.C60179k4;
import ht1.C60200t1;
import ie3.C76324c;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URLDecoder;
import java.util.HashMap;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kj3.C76587i;
import kr0.C76630x0;
import ky2.C10432i;
import nd3.C47223a;
import nj3.C76879j;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C117747y;
import p156gj.C87203t;
import p159gw.C45962f;
import p195li.C46860d;
import p203mi.C24982c0;
import p203mi.C76758b0;
import p248ug.C52558c;
import p255vr.C65873e;
import p275xz.C15919f;
import p287zz.C79445i;
import p626nv.C109759g;
import p640ox.C77049b;
import p644pi.C77089d;
import p684si.C77711c;
import p763ym.C79138l;
import p910lj.C76701a;
import pc0.C100760a0;
import q43.C77302a;
import qg0.C12215a;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import rb0.C47984k;
import rb0.C47997p;
import rb0.C77495c;
import rb0.C77497d;
import te0.C48639m;
import te3.C50107kb3;
import te3.C78001u03;
import te3.wj4;
import te3.ze4;
import u73.C101982p;
import u73.C14134p0;
import u73.C22613h1;
import vh0.C78415b;
import vr2.C102236a0;
import wc3.C53145l0;
import wc3.C53148n;
import wc3.C90945m;
import wd3.C53155r0;
import xm2.C53388s;
import xw0.C15906d;
import yd2.C79076g;
import z04.C112551y;
import zb3.C16134c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet */
public class URISpanHandlerSet {

    /* renamed from: a */
    public Context f107260a = null;

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AAUriSpanHandler */
    public class AAUriSpanHandler extends BaseUriSpanHandler {

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AAUriSpanHandler$a */
        public class C40011a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f107262d;

            /* renamed from: e */
            public final /* synthetic */ String f107263e;

            /* renamed from: f */
            public final /* synthetic */ long f107264f;

            public C40011a(AAUriSpanHandler aAUriSpanHandler, String str, String str2, long j) {
                this.f107262d = str;
                this.f107263e = str2;
                this.f107264f = j;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                CloseAAEvent closeAAEvent = new CloseAAEvent();
                CloseAAEvent.C40053a aVar = closeAAEvent.f107410d;
                aVar.f107411a = this.f107262d;
                aVar.f107412b = this.f107263e;
                aVar.f107413c = this.f107264f;
                closeAAEvent.publish();
            }
        }

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AAUriSpanHandler$b */
        public class C40012b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f107265d;

            /* renamed from: e */
            public final /* synthetic */ String f107266e;

            /* renamed from: f */
            public final /* synthetic */ long f107267f;

            public C40012b(AAUriSpanHandler aAUriSpanHandler, String str, String str2, long j) {
                this.f107265d = str;
                this.f107266e = str2;
                this.f107267f = j;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                CloseAAUrgeNotifyEvent closeAAUrgeNotifyEvent = new CloseAAUrgeNotifyEvent();
                CloseAAUrgeNotifyEvent.C40054a aVar = closeAAUrgeNotifyEvent.f107414d;
                aVar.f107415a = this.f107265d;
                aVar.f107416b = this.f107266e;
                aVar.f107417c = this.f107267f;
                closeAAUrgeNotifyEvent.publish();
            }
        }

        public AAUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{35, 36, 37};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://weixinnewaa/opendetail")) {
                return new C53155r0(str, 35, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://weixinnewaa/closeurgenotify")) {
                return new C53155r0(str, 36, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://weixinnewaa/closeaa")) {
                return new C53155r0(str, 37, (Object) null);
            }
            return null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo62702c(android.view.View r21, wd3.C53155r0 r22, de3.C45335p r23) {
            /*
                r20 = this;
                r7 = r20
                r8 = r22
                int r0 = r8.f148313d
                r1 = 35
                r2 = 0
                java.lang.String r3 = "url error, billno is null"
                java.lang.String r4 = "billno"
                r9 = 2
                java.lang.String r5 = "chatroom_name"
                r10 = 0
                java.lang.String r11 = "MicroMsg.URISpanHandlerSet"
                r12 = 1
                if (r0 != r1) goto L_0x0087
                java.lang.String r0 = r8.f148312c     // Catch:{ Exception -> 0x0074 }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0074 }
                java.lang.String r1 = r0.getQueryParameter(r4)     // Catch:{ Exception -> 0x0074 }
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x0074 }
                if (r4 == 0) goto L_0x002a
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)     // Catch:{ Exception -> 0x0074 }
                return r12
            L_0x002a:
                java.lang.String r3 = "scene"
                java.lang.String r0 = r0.getQueryParameter(r3)     // Catch:{ Exception -> 0x0074 }
                r3 = 3
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)     // Catch:{ Exception -> 0x0074 }
                java.lang.Object r3 = r8.f148314e     // Catch:{ Exception -> 0x0074 }
                boolean r4 = r3 instanceof android.os.Bundle     // Catch:{ Exception -> 0x0074 }
                if (r4 == 0) goto L_0x0042
                android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ Exception -> 0x0074 }
                java.lang.String r3 = r3.getString(r5)     // Catch:{ Exception -> 0x0074 }
                goto L_0x004a
            L_0x0042:
                boolean r4 = r3 instanceof java.lang.String     // Catch:{ Exception -> 0x0074 }
                if (r4 == 0) goto L_0x006a
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0074 }
            L_0x004a:
                android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0074 }
                r4.<init>()     // Catch:{ Exception -> 0x0074 }
                java.lang.String r5 = "bill_no"
                r4.putExtra(r5, r1)     // Catch:{ Exception -> 0x0074 }
                java.lang.String r1 = "enter_scene"
                r4.putExtra(r1, r0)     // Catch:{ Exception -> 0x0074 }
                java.lang.String r0 = "chatroom"
                r4.putExtra(r0, r3)     // Catch:{ Exception -> 0x0074 }
                com.tencent.mm.app.plugin.URISpanHandlerSet r0 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this     // Catch:{ Exception -> 0x0074 }
                android.content.Context r0 = r0.f107260a     // Catch:{ Exception -> 0x0074 }
                java.lang.String r1 = "aa"
                java.lang.String r3 = ".ui.PaylistAAUI"
                ke3.C88144b.m109791i(r0, r1, r3, r4, r2)     // Catch:{ Exception -> 0x0074 }
                goto L_0x0086
            L_0x006a:
                java.lang.String r0 = "illegal data type, %s"
                java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x0074 }
                r1[r10] = r8     // Catch:{ Exception -> 0x0074 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)     // Catch:{ Exception -> 0x0074 }
                return r12
            L_0x0074:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r9]
                java.lang.String r0 = r0.getMessage()
                r1[r10] = r0
                java.lang.String r0 = r8.f148312c
                r1[r12] = r0
                java.lang.String r0 = "handle click new aa open detail link error: %s, url: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
            L_0x0086:
                return r12
            L_0x0087:
                r1 = 37
                r13 = -1
                java.lang.String r6 = "msg_id"
                java.lang.String r15 = "empty chatroom!"
                if (r0 != r1) goto L_0x0103
                java.lang.String r0 = r8.f148312c     // Catch:{ Exception -> 0x00f0 }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x00f0 }
                java.lang.String r0 = r0.getQueryParameter(r4)     // Catch:{ Exception -> 0x00f0 }
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x00f0 }
                if (r1 == 0) goto L_0x00a5
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)     // Catch:{ Exception -> 0x00f0 }
                return r12
            L_0x00a5:
                java.lang.Object r1 = r8.f148314e     // Catch:{ Exception -> 0x00f0 }
                boolean r2 = r1 instanceof android.os.Bundle     // Catch:{ Exception -> 0x00f0 }
                if (r2 != 0) goto L_0x00b1
                java.lang.String r0 = "error data!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x00f0 }
                return r12
            L_0x00b1:
                android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ Exception -> 0x00f0 }
                java.lang.String r4 = r1.getString(r5)     // Catch:{ Exception -> 0x00f0 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x00f0 }
                if (r2 == 0) goto L_0x00c1
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r15)     // Catch:{ Exception -> 0x00f0 }
                return r12
            L_0x00c1:
                long r5 = r1.getLong(r6, r13)     // Catch:{ Exception -> 0x00f0 }
                r1 = 0
                int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r3 >= 0) goto L_0x00d1
                java.lang.String r0 = "msgId is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)     // Catch:{ Exception -> 0x00f0 }
                return r12
            L_0x00d1:
                com.tencent.mm.app.plugin.URISpanHandlerSet r1 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this     // Catch:{ Exception -> 0x00f0 }
                android.content.Context r13 = r1.f107260a     // Catch:{ Exception -> 0x00f0 }
                r14 = 2131837351(0x7f1141a7, float:1.9307895E38)
                r15 = -1
                r16 = 2131837354(0x7f1141aa, float:1.93079E38)
                r17 = 2131822947(0x7f110963, float:1.927868E38)
                com.tencent.mm.app.plugin.URISpanHandlerSet$AAUriSpanHandler$a r18 = new com.tencent.mm.app.plugin.URISpanHandlerSet$AAUriSpanHandler$a     // Catch:{ Exception -> 0x00f0 }
                r1 = r18
                r2 = r20
                r3 = r0
                r1.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x00f0 }
                r19 = 0
                nj3.C76879j.m92739j(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x00f0 }
                goto L_0x016d
            L_0x00f0:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r9]
                java.lang.String r0 = r0.getMessage()
                r1[r10] = r0
                java.lang.String r0 = r8.f148312c
                r1[r12] = r0
                java.lang.String r0 = "handle click new aa close link error: %s, url: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
                goto L_0x016d
            L_0x0103:
                r1 = 36
                if (r0 != r1) goto L_0x016d
                java.lang.String r0 = r8.f148312c     // Catch:{ Exception -> 0x015b }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x015b }
                java.lang.String r0 = r0.getQueryParameter(r4)     // Catch:{ Exception -> 0x015b }
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x015b }
                if (r1 == 0) goto L_0x011b
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r3)     // Catch:{ Exception -> 0x015b }
                return r12
            L_0x011b:
                java.lang.Object r1 = r8.f148314e     // Catch:{ Exception -> 0x015b }
                boolean r3 = r1 instanceof android.os.Bundle     // Catch:{ Exception -> 0x015b }
                if (r3 == 0) goto L_0x0124
                r2 = r1
                android.os.Bundle r2 = (android.os.Bundle) r2     // Catch:{ Exception -> 0x015b }
            L_0x0124:
                if (r2 == 0) goto L_0x0157
                java.lang.String r1 = r2.getString(r5)     // Catch:{ Exception -> 0x015b }
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ Exception -> 0x015b }
                if (r1 == 0) goto L_0x0131
                goto L_0x0157
            L_0x0131:
                java.lang.String r4 = r2.getString(r5)     // Catch:{ Exception -> 0x015b }
                long r5 = r2.getLong(r6, r13)     // Catch:{ Exception -> 0x015b }
                com.tencent.mm.app.plugin.URISpanHandlerSet r1 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this     // Catch:{ Exception -> 0x015b }
                android.content.Context r13 = r1.f107260a     // Catch:{ Exception -> 0x015b }
                r14 = 2131837352(0x7f1141a8, float:1.9307897E38)
                r15 = -1
                r16 = 2131837353(0x7f1141a9, float:1.9307899E38)
                r17 = 2131822947(0x7f110963, float:1.927868E38)
                com.tencent.mm.app.plugin.URISpanHandlerSet$AAUriSpanHandler$b r18 = new com.tencent.mm.app.plugin.URISpanHandlerSet$AAUriSpanHandler$b     // Catch:{ Exception -> 0x015b }
                r1 = r18
                r2 = r20
                r3 = r0
                r1.<init>(r2, r3, r4, r5)     // Catch:{ Exception -> 0x015b }
                r19 = 0
                nj3.C76879j.m92739j(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x015b }
                goto L_0x016d
            L_0x0157:
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r15)     // Catch:{ Exception -> 0x015b }
                return r12
            L_0x015b:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r9]
                java.lang.String r0 = r0.getMessage()
                r1[r10] = r0
                java.lang.String r0 = r8.f148312c
                r1[r12] = r0
                java.lang.String r0 = "handle click new aa urge notify link error: %s, url: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r0, r1)
            L_0x016d:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.plugin.URISpanHandlerSet.AAUriSpanHandler.mo62702c(android.view.View, wd3.r0, de3.p):boolean");
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AddressUriSpanHandler */
    public class AddressUriSpanHandler extends BaseUriSpanHandler {
        public AddressUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{44};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C53155r0 r0Var2 = r0Var;
            if (r0Var2.f148313d != 44) {
                return false;
            }
            Uri parse = Uri.parse("geo:0,0?q=" + Uri.encode(r0Var2.f148312c));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            if (intent.resolveActivity(MMApplicationContext.getContext().getPackageManager()) != null) {
                Context context = MMApplicationContext.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$AddressUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/app/plugin/URISpanHandlerSet$AddressUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C115669n.INSTANCE.mo160131h(12809, 9, "");
            } else {
                Log.m105928w("MicroMsg.URISpanHandlerSet", "Cannot find map app");
            }
            C115669n.INSTANCE.mo160131h(12809, 8, "");
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AlphaInstallUriSpanHandler */
    public class AlphaInstallUriSpanHandler extends BaseUriSpanHandler {
        public AlphaInstallUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{32};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://alphainstall?")) {
                return new C53155r0(str, 32, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 32) {
                return false;
            }
            String replace = r0Var.f148312c.replace("weixin://alphainstall?", "");
            String str = C112760b.m154195C() + Uri.parse(replace).getQueryParameter("md5") + ".apk";
            if (C86013q1.m106450k(str)) {
                ((C45962f) C86312j.m106911c(C45962f.class)).go0(MMApplicationContext.getContext(), str, (C47223a) null, false);
                return true;
            }
            Intent intent = new Intent();
            intent.putExtra("rawUrl", replace.toString());
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$AppBrandLinkSpanHandler */
    public class AppBrandLinkSpanHandler extends BaseUriSpanHandler {
        public AppBrandLinkSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{45};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C72963f4 f4Var;
            if (r0Var.f148313d != 45) {
                return false;
            }
            if (r0Var.f148323n == 1 && (f4Var = r0Var.f148324o) != null) {
                long j = C47997p.f128731j;
                C77495c cVar = C77495c.f225960a;
                if (f4Var.mo108769t2() != 1) {
                    ((C119157j) C119157j.f356862d).mo183870a(new C77497d(f4Var, j));
                }
            }
            if (pVar != null) {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "AppBrandLinkSpanHandler click appbrandlink");
                pVar.mo22793b(r0Var);
                return true;
            }
            Log.m105920e("MicroMsg.URISpanHandlerSet", "clickCallback is null, return");
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$BaseUriSpanHandler */
    public static abstract class BaseUriSpanHandler {
        /* renamed from: a */
        public abstract int[] mo62700a();

        /* renamed from: b */
        public abstract C53155r0 mo62701b(String str);

        /* renamed from: c */
        public abstract boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar);

        /* renamed from: d */
        public abstract boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle);
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$BindMobileUrilSpanHandler */
    public class BindMobileUrilSpanHandler extends BaseUriSpanHandler {
        public BindMobileUrilSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{5};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/bindphone")) {
                return new C53155r0(str, 5, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 5) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            MMWizardActivity.m7017L7(URISpanHandlerSet.this.f107260a, new Intent(URISpanHandlerSet.this.f107260a, BindMContactIntroUI.class));
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://setting/bindphone")) {
                return false;
            }
            Intent intent = new Intent(URISpanHandlerSet.this.f107260a, BindMContactIntroUI.class);
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            MMWizardActivity.m7017L7(URISpanHandlerSet.this.f107260a, intent);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$BizMsgMenuUriSpanHandler */
    public class BizMsgMenuUriSpanHandler extends BaseUriSpanHandler {
        public BizMsgMenuUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{43};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://bizmsgmenu")) {
                return new C53155r0(str, 43, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C72963f4 f4Var;
            if (43 != r0Var.f148313d) {
                return false;
            }
            if (Util.isNullOrNil(r0Var.f148315f)) {
                Log.m105928w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler Username is null.");
                return true;
            }
            if (r0Var.f148323n == 1 && (f4Var = r0Var.f148324o) != null) {
                long j = C47997p.f128731j;
                C77495c cVar = C77495c.f225960a;
                if (f4Var.mo108769t2() != 1) {
                    ((C119157j) C119157j.f356862d).mo183870a(new C77497d(f4Var, j));
                }
            }
            Log.m105919d("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler, url:%s", r0Var.f148312c);
            Uri parse = Uri.parse(r0Var.f148312c.trim());
            String trim = Util.nullAs(parse.getQueryParameter("msgmenuid"), "").trim();
            String queryParameter = parse.getQueryParameter("msgmenucontent");
            C115669n.INSTANCE.mo160131h(14522, Util.nullAsNil(trim), r0Var.f148315f);
            if (Util.isNullOrNil(trim) || Util.isNullOrNil(queryParameter)) {
                Log.m105928w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler id or msgContent is null.");
                return true;
            }
            try {
                String decode = URLDecoder.decode(queryParameter, "UTF-8");
                HashMap hashMap = new HashMap();
                hashMap.put("bizmsgmenuid", trim);
                C100760a0.C100764f a = C100760a0.m131931a(r0Var.f148315f);
                String str = r0Var.f148315f;
                a.f295187a = str;
                a.f295189c = decode;
                a.f295190d = C45628s0.m50810y(str);
                a.f295191e = 1;
                a.f295193g = hashMap;
                a.f295194h = 5;
                a.mo140195a().mo123694a();
            } catch (UnsupportedEncodingException e) {
                Log.m105929w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler exp, msg = %s", e.getMessage());
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$CardUriSpanHandler */
    public class CardUriSpanHandler extends BaseUriSpanHandler {
        public CardUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[0];
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.startsWith("wxcard://cardjumptype=1")) {
                return false;
            }
            String obj = l0Var != null ? ((C44814c) l0Var).f121615a.f215752d.mo91574o().getUsername().toString() : null;
            Intent intent = new Intent();
            intent.putExtra("user_name", obj);
            intent.putExtra(XWalkReaderBasePlugin.PARAM_KEY_VIEW_TYPE, 1);
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "card", ".ui.CardViewUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ChatroomNotifyDetailSpanHandler */
    public class ChatroomNotifyDetailSpanHandler extends BaseUriSpanHandler {
        public ChatroomNotifyDetailSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{67};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://chatroomnotify/detail/")) {
                return new C53155r0(str, 67, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 67) {
                return false;
            }
            Log.m105924i("MicroMsg.URISpanHandlerSet", "ChatroomNotifyDetailSpanHandler");
            Uri.parse(r0Var.f148312c);
            String str = r0Var.f148312c;
            long j = Util.getLong(str.substring(str.trim().lastIndexOf("/") + 1), 0);
            if (j > 0) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
                ((C78415b) C86312j.m106911c(C78415b.class)).mo94220DD(view.getContext(), b002.mo108768t(), b002.mo108775z2());
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ContactUriSpanHandler */
    public class ContactUriSpanHandler extends BaseUriSpanHandler {
        public ContactUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{23, 21, 22, 2};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0087, code lost:
            r0 = r10.trim().substring(0, r10.trim().length() - 1);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public wd3.C53155r0 mo62701b(java.lang.String r10) {
            /*
                r9 = this;
                java.lang.String r0 = r10.trim()
                java.lang.String r1 = "weixin://contacts/all/"
                boolean r0 = r0.equals(r1)
                r1 = 0
                if (r0 == 0) goto L_0x002d
                com.tencent.mm.app.plugin.URISpanHandlerSet r0 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r0 = r0.f107260a
                r1 = 2131831055(0x7f11290f, float:1.9295125E38)
                java.lang.String r5 = r0.getString(r1)
                eb0.c2 r0 = new eb0.c2
                r4 = 0
                r6 = 0
                r7 = 1
                r8 = 1
                java.lang.String r3 = "@all.android"
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                wd3.r0 r1 = new wd3.r0
                r2 = 23
                r1.<init>(r10, r2, r0)
                goto L_0x00d1
            L_0x002d:
                java.lang.String r0 = r10.trim()
                java.lang.String r2 = "weixin://contacts/microblog/"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0051
                com.tencent.mm.app.plugin.URISpanHandlerSet r0 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r0 = r0.f107260a
                r1 = 2131831104(0x7f112940, float:1.9295224E38)
                java.lang.String r0 = r0.getString(r1)
                eb0.c2 r0 = eb0.C45608d2.m50668c(r0)
                wd3.r0 r1 = new wd3.r0
                r2 = 22
                r1.<init>(r10, r2, r0)
                goto L_0x00d1
            L_0x0051:
                java.lang.String r0 = r10.trim()
                java.lang.String r2 = "weixin://contacts/micromessenger/"
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x007b
                com.tencent.mm.app.plugin.URISpanHandlerSet r0 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r0 = r0.f107260a
                r1 = 2131831105(0x7f112941, float:1.9295226E38)
                java.lang.String r5 = r0.getString(r1)
                eb0.c2 r0 = new eb0.c2
                r4 = 0
                r6 = 0
                r7 = 1
                r8 = 1
                java.lang.String r3 = "@micromsg.qq.com"
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8)
                wd3.r0 r1 = new wd3.r0
                r2 = 2
                r1.<init>(r10, r2, r0)
                goto L_0x00d1
            L_0x007b:
                java.lang.String r0 = r10.trim()
                java.lang.String r2 = "weixin://contacts/"
                boolean r0 = r0.startsWith(r2)
                if (r0 == 0) goto L_0x00d1
                java.lang.String r0 = r10.trim()
                r2 = 0
                java.lang.String r3 = r10.trim()
                int r3 = r3.length()
                int r3 = r3 + -1
                java.lang.String r0 = r0.substring(r2, r3)
                java.lang.String r2 = "/"
                int r2 = r0.lastIndexOf(r2)
                r3 = -1
                if (r2 != r3) goto L_0x00a4
                return r1
            L_0x00a4:
                int r2 = r2 + 1
                java.lang.String r0 = r0.substring(r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "@"
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.mm.app.plugin.URISpanHandlerSet r1 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r1 = r1.f107260a
                r2 = 2131831057(0x7f112911, float:1.9295129E38)
                java.lang.String r1 = r1.getString(r2)
                eb0.c2 r0 = eb0.C45608d2.m50667b(r0, r1)
                wd3.r0 r1 = new wd3.r0
                r2 = 21
                r1.<init>(r10, r2, r0)
            L_0x00d1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.plugin.URISpanHandlerSet.ContactUriSpanHandler.mo62701b(java.lang.String):wd3.r0");
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00e7  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo62702c(android.view.View r21, wd3.C53155r0 r22, de3.C45335p r23) {
            /*
                r20 = this;
                r0 = r20
                r1 = r22
                r2 = r23
                java.lang.Class<f62.k0> r3 = f62.C75700k0.class
                int r4 = r1.f148313d
                r5 = 0
                r6 = 23
                if (r4 == r6) goto L_0x001c
                r6 = 21
                if (r4 == r6) goto L_0x001c
                r6 = 22
                if (r4 == r6) goto L_0x001c
                r6 = 2
                if (r4 != r6) goto L_0x001b
                goto L_0x001c
            L_0x001b:
                return r5
            L_0x001c:
                java.lang.Class<eb0.c2> r4 = eb0.C45607c2.class
                java.lang.Object r4 = r1.mo73845a(r4)
                eb0.c2 r4 = (eb0.C45607c2) r4
                if (r2 == 0) goto L_0x0029
                r2.mo22792a(r1)
            L_0x0029:
                r6 = 2131821704(0x7f110488, float:1.9276159E38)
                r7 = 2131831955(0x7f112c93, float:1.929695E38)
                if (r4 != 0) goto L_0x0045
                com.tencent.mm.app.plugin.URISpanHandlerSet r1 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r1 = r1.f107260a
                java.lang.String r2 = r1.getString(r7)
                com.tencent.mm.app.plugin.URISpanHandlerSet r3 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r3 = r3.f107260a
                java.lang.String r3 = r3.getString(r6)
                nj3.C76879j.m92748s(r1, r2, r3)
                return r5
            L_0x0045:
                java.lang.String r8 = r4.mo71122a()
                java.lang.String r9 = "@t.qq.com"
                boolean r8 = r8.equals(r9)
                r10 = 1
                if (r8 == 0) goto L_0x007c
                k40.a r8 = f40.C86709a0.m107533q(r3)
                f62.k0 r8 = (f62.C75700k0) r8
                g62.p r8 = r8.V50()
                com.tencent.mm.storage.s4 r8 = (com.tencent.p014mm.storage.C44667s4) r8
                com.tencent.mm.storage.r4 r8 = r8.mo69821jo(r9)
                if (r8 == 0) goto L_0x0066
                r8 = 1
                goto L_0x0067
            L_0x0066:
                r8 = 0
            L_0x0067:
                if (r8 != 0) goto L_0x007c
                com.tencent.mm.app.plugin.URISpanHandlerSet r8 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r8 = r8.f107260a
                java.lang.String r9 = r8.getString(r7)
                com.tencent.mm.app.plugin.URISpanHandlerSet r11 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r11 = r11.f107260a
                java.lang.String r11 = r11.getString(r6)
                nj3.C76879j.m92748s(r8, r9, r11)
            L_0x007c:
                java.lang.String r8 = r4.mo71122a()
                java.lang.String r9 = "@domain.android"
                boolean r8 = r8.equals(r9)
                if (r8 == 0) goto L_0x00fa
                k40.a r3 = f40.C86709a0.m107533q(r3)
                f62.k0 r3 = (f62.C75700k0) r3
                g62.p r3 = r3.V50()
                com.tencent.mm.storage.s4 r3 = (com.tencent.p014mm.storage.C44667s4) r3
                r3.getClass()
                java.util.LinkedList r8 = new java.util.LinkedList
                r8.<init>()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r11 = r3.f121101d
                r13 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 2
                java.lang.String r12 = "role_info"
                java.lang.String r14 = "int_reserved1=1"
                android.database.Cursor r3 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)
            L_0x00b0:
                boolean r9 = r3.moveToNext()
                if (r9 == 0) goto L_0x00c2
                com.tencent.mm.storage.r4 r9 = new com.tencent.mm.storage.r4
                r9.<init>()
                r9.mo69812a(r3)
                r8.add(r9)
                goto L_0x00b0
            L_0x00c2:
                r3.close()
                int r3 = r8.size()
                if (r3 > 0) goto L_0x00cc
                goto L_0x00e4
            L_0x00cc:
                r3 = 0
            L_0x00cd:
                int r9 = r8.size()
                if (r3 >= r9) goto L_0x00e4
                java.lang.Object r9 = r8.get(r3)
                com.tencent.mm.storage.r4 r9 = (com.tencent.p014mm.storage.C44665r4) r9
                boolean r9 = r9.mo69814c()
                if (r9 == 0) goto L_0x00e1
                r3 = 1
                goto L_0x00e5
            L_0x00e1:
                int r3 = r3 + 1
                goto L_0x00cd
            L_0x00e4:
                r3 = 0
            L_0x00e5:
                if (r3 != 0) goto L_0x00fa
                com.tencent.mm.app.plugin.URISpanHandlerSet r3 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r3 = r3.f107260a
                java.lang.String r7 = r3.getString(r7)
                com.tencent.mm.app.plugin.URISpanHandlerSet r8 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r8 = r8.f107260a
                java.lang.String r6 = r8.getString(r6)
                nj3.C76879j.m92748s(r3, r7, r6)
            L_0x00fa:
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                com.tencent.mm.app.plugin.URISpanHandlerSet r6 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r6 = r6.f107260a
                java.lang.Class<com.tencent.mm.ui.contact.SelectContactUI> r7 = com.tencent.p014mm.p136ui.contact.SelectContactUI.class
                r3.setClass(r6, r7)
                java.lang.String r6 = r4.mo71122a()
                java.lang.String r7 = "Contact_GroupFilter_Type"
                android.content.Intent r6 = r3.putExtra(r7, r6)
                java.lang.String r7 = r4.f123379c
                java.lang.String r8 = ""
                if (r7 != 0) goto L_0x0119
                r7 = r8
            L_0x0119:
                java.lang.String r9 = "Contact_GroupFilter_Str"
                android.content.Intent r6 = r6.putExtra(r9, r7)
                java.lang.String r4 = r4.f123378b
                if (r4 != 0) goto L_0x0124
                goto L_0x0125
            L_0x0124:
                r8 = r4
            L_0x0125:
                java.lang.String r4 = "Contact_GroupFilter_DisplayName"
                r6.putExtra(r4, r8)
                r4 = 268435456(0x10000000, float:2.5243549E-29)
                r3.addFlags(r4)
                com.tencent.mm.app.plugin.URISpanHandlerSet r4 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r4 = r4.f107260a
                k20.a r6 = new k20.a
                r6.<init>()
                r6.mo10233c(r3)
                java.lang.Object[] r12 = r6.mo10232b()
                java.lang.String r13 = "com/tencent/mm/app/plugin/URISpanHandlerSet$ContactUriSpanHandler"
                java.lang.String r14 = "handleSpanClick"
                java.lang.String r15 = "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z"
                java.lang.String r16 = "Undefined"
                java.lang.String r17 = "startActivity"
                java.lang.String r18 = "(Landroid/content/Intent;)V"
                r11 = r4
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r3 = r6.mo10231a(r5)
                android.content.Intent r3 = (android.content.Intent) r3
                r4.startActivity(r3)
                java.lang.String r12 = "com/tencent/mm/app/plugin/URISpanHandlerSet$ContactUriSpanHandler"
                java.lang.String r13 = "handleSpanClick"
                java.lang.String r14 = "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z"
                java.lang.String r15 = "Undefined"
                java.lang.String r16 = "startActivity"
                java.lang.String r17 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x016c
                r2.mo22793b(r1)
            L_0x016c:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.plugin.URISpanHandlerSet.ContactUriSpanHandler.mo62702c(android.view.View, wd3.r0, de3.p):boolean");
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://contacts/microblog/") && !str.equals("weixin://contacts/micromessenger/") && !str.equals("weixin://contacts/all/")) {
                return false;
            }
            C45607c2 c = C45608d2.m50668c(URISpanHandlerSet.this.f107260a.getString(C0966R.string.fgc));
            if (str.equals("weixin://contacts/microblog/")) {
                c = C45608d2.m50668c(URISpanHandlerSet.this.f107260a.getString(C0966R.string.fgb));
            }
            if (str.equals("weixin://contacts/micromessenger/")) {
                c = C45608d2.m50668c(URISpanHandlerSet.this.f107260a.getString(C0966R.string.fgc));
            }
            if (str.equals("weixin://contacts/all/")) {
                c = C45608d2.m50668c(URISpanHandlerSet.this.f107260a.getString(C0966R.string.f360859ff0));
            }
            Intent intent = new Intent();
            intent.setClass(URISpanHandlerSet.this.f107260a, SelectContactUI.class);
            Intent putExtra = intent.putExtra("Contact_GroupFilter_Type", c.mo71122a());
            String str2 = c.f123379c;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            Intent putExtra2 = putExtra.putExtra("Contact_GroupFilter_Str", str2);
            String str4 = c.f123378b;
            if (str4 != null) {
                str3 = str4;
            }
            putExtra2.putExtra("Contact_GroupFilter_DisplayName", str3);
            intent.addFlags(268435456);
            return true;
        }
    }

    @C40024a(priority = PRIORITY.LOW)
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$DeeplinkUriSpanHandler */
    public class DeeplinkUriSpanHandler extends BaseUriSpanHandler {

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$DeeplinkUriSpanHandler$a */
        public class C40013a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C52558c f107273d;

            /* renamed from: e */
            public final /* synthetic */ String f107274e;

            /* renamed from: f */
            public final /* synthetic */ String f107275f;

            public C40013a(DeeplinkUriSpanHandler deeplinkUriSpanHandler, C52558c cVar, String str, String str2) {
                this.f107273d = cVar;
                this.f107274e = str;
                this.f107275f = str2;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C52558c cVar = this.f107273d;
                int i2 = cVar.field_brandFlag;
                cVar.field_brandFlag = i2 | 1;
                Log.m105925i("MicroMsg.URISpanHandlerSet", "shield biz msg %s, %s, old = %d, new = %d", this.f107274e, this.f107275f, Integer.valueOf(i2), Integer.valueOf(this.f107273d.field_brandFlag));
                C47984k.m53343q(this.f107273d);
            }
        }

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$DeeplinkUriSpanHandler$b */
        public class C40014b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C52558c f107276d;

            /* renamed from: e */
            public final /* synthetic */ String f107277e;

            /* renamed from: f */
            public final /* synthetic */ String f107278f;

            public C40014b(DeeplinkUriSpanHandler deeplinkUriSpanHandler, C52558c cVar, String str, String str2) {
                this.f107276d = cVar;
                this.f107277e = str;
                this.f107278f = str2;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C52558c cVar = this.f107276d;
                int i2 = cVar.field_brandFlag;
                cVar.field_brandFlag = i2 & -2;
                Log.m105925i("MicroMsg.URISpanHandlerSet", "receive biz msg %s, %s, old = %d, new = %d", this.f107277e, this.f107278f, Integer.valueOf(i2), Integer.valueOf(this.f107276d.field_brandFlag));
                C47984k.m53343q(this.f107276d);
            }
        }

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$DeeplinkUriSpanHandler$c */
        public class C40015c implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f107279d;

            public C40015c(String str) {
                this.f107279d = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105925i("MicroMsg.URISpanHandlerSet", "AppBrandServiceHelper switchTo to receive msg for username %s", this.f107279d);
                C76587i.m92184d(URISpanHandlerSet.this.f107260a, this.f107279d, true);
            }
        }

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$DeeplinkUriSpanHandler$d */
        public class C40016d implements C90945m.C53147h {

            /* renamed from: a */
            public final /* synthetic */ C89779i0 f107281a;

            public C40016d(C89779i0 i0Var) {
                this.f107281a = i0Var;
            }

            /* renamed from: c */
            public void mo62709c(int i, int i2, String str, C117747y yVar, boolean z) {
                wj4 h;
                C89779i0 i0Var = this.f107281a;
                if (i0Var != null && i0Var.isShowing()) {
                    this.f107281a.dismiss();
                }
                if (yVar != null && i != 0 && i2 != 0 && (yVar instanceof C40360i0) && (h = ((C40360i0) yVar).mo63047h()) != null && URISpanHandlerSet.this.f107260a != null && !Util.isNullOrNil(h.f144098g)) {
                    Context context = URISpanHandlerSet.this.f107260a;
                    C76912y0.makeText(context, (CharSequence) URISpanHandlerSet.this.f107260a.getString(C0966R.string.a3h) + " : " + Util.nullAsNil(h.f144098g), 0).show();
                }
            }
        }

        public DeeplinkUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{30};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            Log.m105925i("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler getHrefFromUrl %s", str);
            if (str.trim().toLowerCase().startsWith("weixin://")) {
                return new C53155r0(str, 30, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            int i;
            C53155r0 r0Var2 = r0Var;
            C45335p pVar2 = pVar;
            Log.m105925i("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler handleSpanClick %d, %s", Integer.valueOf(r0Var2.f148313d), r0Var2.f148312c);
            String str = pVar2 != null ? (String) pVar2.mo22792a(r0Var2) : null;
            if (r0Var2.f148313d != 30) {
                return false;
            }
            String nullAsNil = Util.nullAsNil(r0Var2.f148312c);
            if (nullAsNil.startsWith("weixin://shieldBrandMsg/") || nullAsNil.startsWith("weixin://receiveBrandMsg/")) {
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler username is null");
                    return true;
                }
                C52558c b = C47984k.m53328b(str);
                if (b == null) {
                    Log.m105920e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler BizInfo is null");
                    return true;
                } else if (nullAsNil.startsWith("weixin://shieldBrandMsg/")) {
                    C76879j.m92739j(URISpanHandlerSet.this.f107260a, C0966R.string.jyn, C0966R.string.a3h, C0966R.string.jym, C0966R.string.auj, new C40013a(this, b, nullAsNil, str), (DialogInterface.OnClickListener) null);
                } else if (nullAsNil.startsWith("weixin://receiveBrandMsg/")) {
                    C76879j.m92739j(URISpanHandlerSet.this.f107260a, C0966R.string.jyl, C0966R.string.a3h, C0966R.string.jyk, C0966R.string.auj, new C40014b(this, b, nullAsNil, str), (DialogInterface.OnClickListener) null);
                }
            } else if (C90945m.m114067q(Uri.parse(nullAsNil))) {
                Context context = URISpanHandlerSet.this.f107260a;
                if (!C90945m.m114052b(nullAsNil)) {
                    C89779i0 Q = C76879j.m92723Q(context, "", "", true, true, (DialogInterface.OnCancelListener) null);
                    if (!Util.isNullOrNil(str)) {
                        if (C72996z1.m85820U5(str)) {
                            i = 7;
                        } else if (C45628s0.m50738C(str)) {
                            i = 9;
                        }
                        C90945m.m114057g(context, nullAsNil, i, (Bundle) null, new C53148n(Q, context), (String) null, (String) null, false);
                    }
                    i = 6;
                    C90945m.m114057g(context, nullAsNil, i, (Bundle) null, new C53148n(Q, context), (String) null, (String) null, false);
                }
            } else if (nullAsNil.startsWith("weixin://receiveWeAppKFMsg")) {
                if (Util.isNullOrNil(str)) {
                    Log.m105921e("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler username is null, handle the BUILTIN_RECEIVE_WEAPP_KFMSG ,  the herfUrl is %s", nullAsNil);
                    return true;
                }
                C76879j.m92739j(URISpanHandlerSet.this.f107260a, C0966R.string.f7857tx, C0966R.string.a3h, C0966R.string.f7856tw, C0966R.string.auj, new C40015c(str), (DialogInterface.OnClickListener) null);
            } else if (nullAsNil.startsWith("weixin://xmail/bind")) {
                Intent putExtra = new Intent().putExtra("Contact_User", "qqmail");
                putExtra.putExtra("key_need_rebind_xmail", true);
                C88144b.m109791i(URISpanHandlerSet.this.f107260a, Scopes.PROFILE, ".ui.ContactInfoUI", putExtra, (Bundle) null);
            } else {
                C90945m.m114054d(URISpanHandlerSet.this.f107260a, nullAsNil, str, 1, nullAsNil, (C90945m.C53147h) null);
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (Util.isNullOrNil(str) || bundle == null) {
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(str == null);
                objArr[1] = Boolean.valueOf(bundle == null);
                Log.m105921e("MicroMsg.URISpanHandlerSet", "url is null ? %b, paramsBundle is null ? %b", objArr);
                return false;
            } else if (!C90945m.m114067q(Uri.parse(str))) {
                return false;
            } else {
                int i = bundle.getInt("key_scene", -1);
                Log.m105919d("MicroMsg.URISpanHandlerSet", "DeeplinkUriSpanHandler jump, %d, %s", Integer.valueOf(i), str);
                C90945m.m114057g(URISpanHandlerSet.this.f107260a, str, i == -1 ? 5 : i, (Bundle) null, new C40016d(C76879j.m92723Q(URISpanHandlerSet.this.f107260a, "", "", false, true, (DialogInterface.OnCancelListener) null)), (String) null, (String) null, false);
                return true;
            }
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$EmotionStoreUriSpanHandler */
    public class EmotionStoreUriSpanHandler extends BaseUriSpanHandler {
        public EmotionStoreUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{29};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (!str.trim().startsWith("weixin://emoticonstore/")) {
                return null;
            }
            int lastIndexOf = str.lastIndexOf("/");
            return new C53155r0(str, 29, lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "");
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 29) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            Intent intent = new Intent();
            intent.putExtra("download_entrance_scene", 21);
            intent.putExtra("extra_id", (String) r0Var.mo73845a(String.class));
            intent.putExtra("preceding_scence", 3);
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$EnterChatRoomUriSpanHandler */
    public class EnterChatRoomUriSpanHandler extends BaseUriSpanHandler {
        public EnterChatRoomUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{55};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/chatroom/")) {
                return new C53155r0(str, 55, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C72996z1 z1Var;
            C53155r0 r0Var2 = r0Var;
            if (r0Var2.f148313d == 55) {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "handleClickEnterChatRoomSystemMsgUrl");
                try {
                    String str = r0Var2.f148312c;
                    int lastIndexOf = str.trim().lastIndexOf("/");
                    if (lastIndexOf >= 0 && lastIndexOf < str.trim().length() - 1) {
                        String substring = str.trim().substring(lastIndexOf + 1);
                        if (C72996z1.m85820U5(substring) && ((z1Var = C97625j3.m125812b().mo105907v().get(substring)) == null || ((int) z1Var.f108320R1) == 0)) {
                            C72996z1 z1Var2 = new C72996z1();
                            z1Var2.setUsername(substring);
                            C97625j3.m125812b().mo105907v().mo69667P3(z1Var2);
                        }
                        Intent putExtra = new Intent(URISpanHandlerSet.this.f107260a, ChattingUI.class).putExtra("Chat_User", substring).putExtra("Chat_Mode", 1);
                        if (URISpanHandlerSet.this.f107260a instanceof Service) {
                            putExtra.addFlags(268435456);
                        }
                        Context context = URISpanHandlerSet.this.f107260a;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(putExtra);
                        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterChatRoomUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context, "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterChatRoomUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        if (r0Var2.f148319j == 1) {
                            String nullAs = Util.nullAs(r0Var2.f148318i, "");
                            C46860d.m52180d(Util.nullAs(substring, ""), nullAs, 3);
                            Log.m105925i("MicroMsg.URISpanHandlerSet", "handleClickEnterChatRoomSystemMsgUrl migrate(%s -> %s)", nullAs, Util.nullAs(substring, ""));
                        }
                        return true;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e.getMessage(), r0Var2.f148312c);
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$EnterRoomUriSpanHandler */
    public class EnterRoomUriSpanHandler extends BaseUriSpanHandler {
        public EnterRoomUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[0];
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            int lastIndexOf;
            C72996z1 z1Var;
            if (!str.startsWith("weixin://jump/mainframe/") || (lastIndexOf = str.trim().lastIndexOf("/")) < 0 || lastIndexOf >= str.trim().length() - 1) {
                return false;
            }
            String substring = str.trim().substring(lastIndexOf + 1);
            if (C72996z1.m85820U5(substring) && ((z1Var = C97625j3.m125812b().mo105907v().get(substring)) == null || ((int) z1Var.f108320R1) == 0)) {
                C72996z1 z1Var2 = new C72996z1();
                z1Var2.setUsername(substring);
                C97625j3.m125812b().mo105907v().mo69667P3(z1Var2);
            }
            Intent putExtra = new Intent(URISpanHandlerSet.this.f107260a, ChattingUI.class).putExtra("Chat_User", substring).putExtra("Chat_Mode", 1).putExtra("enter_room_from_uri_jump", true);
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                putExtra.addFlags(268435456);
            }
            Context context = URISpanHandlerSet.this.f107260a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(putExtra);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterRoomUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/app/plugin/URISpanHandlerSet$EnterRoomUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ExposeUriSpanHandler */
    public class ExposeUriSpanHandler extends BaseUriSpanHandler {
        public ExposeUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{31};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().equals("weixin://expose/")) {
                return new C53155r0(str, 31, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 31) {
                return false;
            }
            Intent intent = new Intent();
            if (pVar == null) {
                return false;
            }
            String str = (String) pVar.mo22792a(r0Var);
            intent.putExtra("k_username", str);
            int i = 39;
            if (!Util.isNullOrNil(str) && str.endsWith("@chatroom")) {
                i = 36;
            }
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", String.format(C74928u.C45092d.f122306a, new Object[]{Integer.valueOf(i)}));
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FeedbackUriSpanHandler */
    public class FeedbackUriSpanHandler extends BaseUriSpanHandler {
        public FeedbackUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{34};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://feedback/next/")) {
                return new C53155r0(str, 34, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 34) {
                return false;
            }
            String replace = r0Var.f148312c.trim().replace("weixin://feedback/next/", "");
            Log.m105919d("MicroMsg.URISpanHandlerSet", "FeedbackUriSpanHandler, url:%s, content:%s", r0Var.f148312c, replace);
            C97625j3.m125815e().mo123460f(new C53388s(C87203t.m108274j(), replace, 8));
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FlightNumberSpanHandler */
    public class FlightNumberSpanHandler extends BaseUriSpanHandler {
        public FlightNumberSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{50};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            if (r0Var.f148313d == 50) {
                Log.m105925i("MicroMsg.URISpanHandlerSet", "FlightNumberSpanHandler click %s", r0Var.f148312c);
                long j = 0;
                Object obj = r0Var.f148314e;
                if (obj != null && (obj instanceof Bundle)) {
                    j = ((Bundle) obj).getLong("msgSvrId");
                }
                ((C15906d) C86312j.m106911c(C15906d.class)).p50(URISpanHandlerSet.this.f107260a, 3, r0Var.f148312c, j);
            }
            if (pVar != null) {
                pVar.mo22793b(r0Var);
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FlowStatUriSpanHandler */
    public class FlowStatUriSpanHandler extends BaseUriSpanHandler {
        public FlowStatUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{16};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://flowstat")) {
                return new C53155r0(str, 16, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 16) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://flowstat")) {
                return false;
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance == null) {
                return true;
            }
            instance.mo101375O7().mo101428l("tab_settings");
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FriendMobileUriSpanHandler */
    public class FriendMobileUriSpanHandler extends BaseUriSpanHandler {
        public FriendMobileUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{20};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://findfriend/mobile")) {
                return new C53155r0(str, 20, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 20) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            Intent intent = new Intent(URISpanHandlerSet.this.f107260a, MobileFriendUI.class);
            Context context = URISpanHandlerSet.this.f107260a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://findfriend/mobile")) {
                return false;
            }
            Intent intent = new Intent(URISpanHandlerSet.this.f107260a, MobileFriendUI.class);
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            Context context = URISpanHandlerSet.this.f107260a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/app/plugin/URISpanHandlerSet$FriendMobileUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FriendSearchUriSpanHandler */
    public class FriendSearchUriSpanHandler extends BaseUriSpanHandler {
        public FriendSearchUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{17};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://findfriend/search")) {
                return new C53155r0(str, 17, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 17) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            C88144b.m109789g(URISpanHandlerSet.this.f107260a, "subapp", ".ui.pluginapp.ContactSearchUI");
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://findfriend/search")) {
                return false;
            }
            Intent intent = new Intent();
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "subapp", ".ui.pluginapp.ContactSearchUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$FriendShareUriSpanHandler */
    public class FriendShareUriSpanHandler extends BaseUriSpanHandler {
        public FriendShareUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{18};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://findfriend/share")) {
                return new C53155r0(str, 18, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 18) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            C88144b.m109789g(URISpanHandlerSet.this.f107260a, "setting", ".ui.qrcode.ShareMicroMsgChoiceUI");
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://findfriend/share")) {
                return false;
            }
            Intent intent = new Intent();
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "setting", ".ui.qrcode.ShareMicroMsgChoiceUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$HttpUriSpanHandler */
    public class HttpUriSpanHandler extends BaseUriSpanHandler {

        /* renamed from: a */
        public final String f107291a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/newsubscribemsg?action=subscribepage");

        public HttpUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{1};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("http")) {
                return new C53155r0(str, 1, (Object) null);
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo62702c(android.view.View r25, wd3.C53155r0 r26, de3.C45335p r27) {
            /*
                r24 = this;
                r0 = r24
                r1 = r26
                r2 = r27
                int r3 = r1.f148313d
                r4 = 0
                r5 = 1
                if (r3 != r5) goto L_0x0317
                java.lang.String r3 = r1.f148312c
                java.lang.String r3 = r3.trim()
                java.lang.String r6 = r0.f107291a
                boolean r3 = r3.startsWith(r6)
                java.lang.String r6 = "MicroMsg.URISpanHandlerSet"
                r7 = 3
                r9 = 2
                if (r3 == 0) goto L_0x0077
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.String r10 = r1.f148312c
                r3[r4] = r10
                java.lang.String r10 = "alvinluo processHttpLink subscribeMsgLink onClick url: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r3)
                if (r2 == 0) goto L_0x0075
                java.lang.String r3 = r1.f148316g
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0034
                goto L_0x0077
            L_0x0034:
                java.lang.String r3 = r1.f148315f
                boolean r10 = rb0.C47984k.m53340n(r3)
                if (r10 != 0) goto L_0x003d
                goto L_0x0077
            L_0x003d:
                java.lang.String r10 = r1.f148312c
                java.lang.Object r11 = r1.f148317h
                boolean r12 = r11 instanceof java.lang.String
                if (r12 == 0) goto L_0x0048
                java.lang.String r11 = (java.lang.String) r11
                goto L_0x0049
            L_0x0048:
                r11 = 0
            L_0x0049:
                if (r3 == 0) goto L_0x0075
                if (r10 == 0) goto L_0x0075
                java.lang.Object[] r12 = new java.lang.Object[r7]
                r12[r4] = r3
                r12[r5] = r10
                r12[r9] = r11
                java.lang.String r13 = "alvinluo clickSubscribeMsgSpan bizUsername: %s, url: %s, content: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r12)
                rd0.e r12 = rd0.C48018e.f128802a
                java.lang.String r13 = "name_biz"
                rd0.c r12 = r12.mo72802a(r13)
                android.os.Bundle r13 = new android.os.Bundle
                r13.<init>()
                java.lang.String r14 = "key_extra_content"
                r13.putString(r14, r11)
                if (r12 == 0) goto L_0x0075
                com.tencent.mm.app.plugin.URISpanHandlerSet r11 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r11 = r11.f107260a
                r12.mo35371l(r11, r3, r10, r13)
            L_0x0075:
                r3 = 1
                goto L_0x0078
            L_0x0077:
                r3 = 0
            L_0x0078:
                if (r3 == 0) goto L_0x007b
                return r5
            L_0x007b:
                com.tencent.mm.app.plugin.URISpanHandlerSet r3 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r3 = r3.f107260a
                if (r3 == 0) goto L_0x0087
                boolean r3 = r3 instanceof com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI
                if (r3 == 0) goto L_0x0087
                r3 = 1
                goto L_0x0088
            L_0x0087:
                r3 = 0
            L_0x0088:
                java.lang.Class<eb0.c2> r10 = eb0.C45607c2.class
                java.lang.Object r10 = r1.mo73845a(r10)
                eb0.c2 r10 = (eb0.C45607c2) r10
                com.tencent.mm.app.plugin.URISpanHandlerSet r10 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r10 = r10.f107260a
                if (r10 == 0) goto L_0x00c1
                if (r3 == 0) goto L_0x009e
                boolean r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMMProcess()
                if (r10 == 0) goto L_0x00c1
            L_0x009e:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "@"
                r10.append(r11)
                java.lang.String r11 = r1.f148312c
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                com.tencent.mm.app.plugin.URISpanHandlerSet r11 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r11 = r11.f107260a
                r12 = 2131831057(0x7f112911, float:1.9295129E38)
                java.lang.String r11 = r11.getString(r12)
                eb0.c2 r10 = eb0.C45608d2.m50667b(r10, r11)
                goto L_0x00c2
            L_0x00c1:
                r10 = 0
            L_0x00c2:
                if (r2 == 0) goto L_0x00cb
                java.lang.Object r11 = r2.mo22792a(r1)
                java.lang.String r11 = (java.lang.String) r11
                goto L_0x00cc
            L_0x00cb:
                r11 = 0
            L_0x00cc:
                int r12 = r1.f148323n
                if (r12 != r5) goto L_0x00eb
                com.tencent.mm.storage.f4 r12 = r1.f148324o
                if (r12 == 0) goto L_0x00eb
                long r13 = rb0.C47997p.f128731j
                rb0.c r15 = rb0.C77495c.f225960a
                int r15 = r12.mo108769t2()
                if (r15 != r5) goto L_0x00df
                goto L_0x00eb
            L_0x00df:
                zt3.t r15 = zt3.C119157j.f356862d
                rb0.d r8 = new rb0.d
                r8.<init>(r12, r13)
                zt3.j r15 = (zt3.C119157j) r15
                r15.mo183870a(r8)
            L_0x00eb:
                if (r10 == 0) goto L_0x00f3
                boolean r8 = r10.f123380d
                if (r8 == 0) goto L_0x00f3
                goto L_0x0310
            L_0x00f3:
                java.lang.String r8 = r1.f148312c
                java.lang.String r10 = r8.toLowerCase()
                java.lang.String r12 = "http"
                boolean r10 = r10.startsWith(r12)
                if (r10 != 0) goto L_0x0112
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "http://"
                r10.append(r12)
                r10.append(r8)
                java.lang.String r8 = r10.toString()
            L_0x0112:
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                java.lang.Object r12 = r1.f148314e
                java.lang.String r13 = ""
                java.lang.String r14 = "msgUsername"
                java.lang.String r15 = "serverMsgID"
                r17 = r6
                r5 = 0
                if (r12 == 0) goto L_0x015c
                boolean r4 = r12 instanceof android.os.Bundle
                if (r4 == 0) goto L_0x015c
                android.os.Bundle r12 = (android.os.Bundle) r12
                java.lang.String r4 = "msgSvrId"
                long r19 = r12.getLong(r4, r5)
                java.lang.String r4 = "msgId"
                long r21 = r12.getLong(r4, r5)
                int r4 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
                if (r4 == 0) goto L_0x0140
                java.lang.String r4 = java.lang.String.valueOf(r19)
                goto L_0x0144
            L_0x0140:
                java.lang.String r4 = r12.getString(r15)
            L_0x0144:
                java.lang.String r5 = r1.f148316g
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x014f
                java.lang.String r5 = r1.f148315f
                goto L_0x0151
            L_0x014f:
                java.lang.String r5 = r1.f148316g
            L_0x0151:
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r6 == 0) goto L_0x0160
                java.lang.String r5 = r12.getString(r14)
                goto L_0x0160
            L_0x015c:
                r21 = r5
                r4 = r13
                r5 = r4
            L_0x0160:
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r6 == 0) goto L_0x0168
                java.lang.String r4 = r1.f148326q
            L_0x0168:
                r10.putExtra(r15, r4)
                r10.putExtra(r14, r5)
                java.lang.String r6 = "rawUrl"
                r10.putExtra(r6, r8)
                java.lang.Object r6 = r1.f148314e
                java.lang.String r12 = "geta8key_scene"
                java.lang.String r7 = "geta8key_username"
                if (r6 == 0) goto L_0x01ae
                boolean r9 = r6 instanceof android.os.Bundle
                if (r9 == 0) goto L_0x01ae
                android.os.Bundle r6 = (android.os.Bundle) r6
                int r9 = r6.getInt(r12)
                java.lang.String r13 = r6.getString(r7)
                r10.putExtra(r12, r9)
                boolean r23 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r23 == 0) goto L_0x019c
                r23 = r9
                java.lang.String r9 = r6.getString(r14)
                r10.putExtra(r14, r9)
                goto L_0x019e
            L_0x019c:
                r23 = r9
            L_0x019e:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 == 0) goto L_0x01ab
                java.lang.String r4 = r6.getString(r15)
                r10.putExtra(r15, r4)
            L_0x01ab:
                r9 = r23
                goto L_0x01af
            L_0x01ae:
                r9 = 0
            L_0x01af:
                r4 = 4
                r6 = 5
                if (r9 != 0) goto L_0x022f
                int r15 = r1.f148323n
                r14 = 2
                if (r15 != r14) goto L_0x01bb
                int r5 = r1.f148325p
                goto L_0x01bf
            L_0x01bb:
                if (r15 != r6) goto L_0x01c2
                int r5 = r1.f148325p
            L_0x01bf:
                r4 = 2
                goto L_0x022a
            L_0x01c2:
                r14 = 3
                if (r15 != r14) goto L_0x01c8
                r5 = 14
                goto L_0x0228
            L_0x01c8:
                if (r15 != r4) goto L_0x01cd
                r5 = 71
                goto L_0x0228
            L_0x01cd:
                r14 = 6
                if (r15 != r14) goto L_0x01d3
                r5 = 72
                goto L_0x0228
            L_0x01d3:
                r14 = 7
                if (r15 != r14) goto L_0x0207
                com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r15 = 20849(0x5171, float:2.9216E-41)
                java.lang.Object[] r6 = new java.lang.Object[r4]
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r18 = 0
                r6[r18] = r14
                r14 = 2
                java.lang.Integer r20 = java.lang.Integer.valueOf(r14)
                r4 = 1
                r6[r4] = r20
                java.lang.String r16 = o40.C61926c.m72691p(r21)
                r6[r14] = r16
                java.lang.Class<ht1.k4> r14 = ht1.C60179k4.class
                di3.d r14 = di3.C86312j.m106911c(r14)
                ht1.k4 r14 = (ht1.C60179k4) r14
                java.lang.String r5 = r14.mo78770n(r5)
                r14 = 3
                r6[r14] = r5
                r9.mo160131h(r15, r6)
                r5 = 91
                goto L_0x0228
            L_0x0207:
                r4 = 1
                if (r15 != r4) goto L_0x0215
                boolean r4 = eb0.C45628s0.m50738C(r11)
                if (r4 == 0) goto L_0x0227
                r4 = 15
                r5 = 15
                goto L_0x0228
            L_0x0215:
                r4 = 8
                if (r15 != r4) goto L_0x021e
                r4 = 73
                r5 = 73
                goto L_0x0228
            L_0x021e:
                r4 = 9
                if (r15 != r4) goto L_0x0227
                r4 = 74
                r5 = 74
                goto L_0x0228
            L_0x0227:
                r5 = r9
            L_0x0228:
                r4 = r5
                r5 = 0
            L_0x022a:
                r10.putExtra(r12, r4)
                r9 = r4
                goto L_0x0230
            L_0x022f:
                r5 = 0
            L_0x0230:
                java.lang.String r4 = "KMsgType"
                if (r5 != 0) goto L_0x025b
                com.tencent.mm.storage.f4 r5 = r1.f148324o
                if (r5 == 0) goto L_0x023d
                int r5 = r5.getType()
                goto L_0x023e
            L_0x023d:
                r5 = 0
            L_0x023e:
                if (r5 != 0) goto L_0x024e
                java.lang.Object r6 = r1.f148314e
                if (r6 == 0) goto L_0x024e
                boolean r12 = r6 instanceof android.os.Bundle
                if (r12 == 0) goto L_0x024e
                android.os.Bundle r6 = (android.os.Bundle) r6
                int r5 = r6.getInt(r4)
            L_0x024e:
                r6 = 16777265(0x1000031, float:2.3510024E-38)
                if (r5 != r6) goto L_0x025b
                r5 = 49
                java.lang.String r6 = "KAppMsgType"
                r12 = 1
                r10.putExtra(r6, r12)
            L_0x025b:
                r10.putExtra(r4, r5)
                java.lang.String r4 = r1.f148322m
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r5 != 0) goto L_0x02aa
                eb0.v0 r5 = eb0.C86493v0.m107224d()
                eb0.v0$c r5 = r5.mo120946b(r4)
                if (r5 == 0) goto L_0x02aa
                java.lang.String r6 = "prePublishId"
                r12 = 0
                java.lang.String r14 = r5.mo120959f(r6, r12)
                java.lang.String r15 = "preUsername"
                r21 = r11
                java.lang.String r11 = r5.mo120959f(r15, r12)
                java.lang.String r2 = "preChatName"
                java.lang.String r5 = r5.mo120959f(r2, r12)
                java.lang.String r12 = "reportSessionId"
                r10.putExtra(r12, r4)
                java.lang.String r4 = "KPublisherId"
                r10.putExtra(r4, r14)
                r10.putExtra(r7, r5)
                java.lang.String r4 = "pre_username"
                r10.putExtra(r4, r11)
                r10.putExtra(r6, r14)
                r10.putExtra(r15, r11)
                r10.putExtra(r2, r5)
                int r2 = eb0.C45629t0.m50815b(r11, r5)
                java.lang.String r4 = "preChatTYPE"
                r10.putExtra(r4, r2)
                goto L_0x02ac
            L_0x02aa:
                r21 = r11
            L_0x02ac:
                java.lang.String r2 = r10.getStringExtra(r7)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x02c3
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r2 != 0) goto L_0x02be
                r11 = r13
                goto L_0x02c0
            L_0x02be:
                r11 = r21
            L_0x02c0:
                r10.putExtra(r7, r11)
            L_0x02c3:
                int r2 = r1.f148323n
                r4 = 1
                if (r2 == r4) goto L_0x02db
                r4 = 2
                if (r2 == r4) goto L_0x02db
                r4 = 3
                if (r2 == r4) goto L_0x02db
                r4 = 4
                if (r2 == r4) goto L_0x02db
                r4 = 6
                if (r2 == r4) goto L_0x02db
                r4 = 5
                if (r2 == r4) goto L_0x02db
                r2 = 31
                if (r9 != r2) goto L_0x02e1
            L_0x02db:
                java.lang.String r2 = "key_enable_teen_mode_check"
                r4 = 1
                r10.putExtra(r2, r4)
            L_0x02e1:
                if (r3 == 0) goto L_0x02e9
                r2 = 268435456(0x10000000, float:2.5243549E-29)
                r10.addFlags(r2)
                goto L_0x02ee
            L_0x02e9:
                r2 = 536870912(0x20000000, float:1.0842022E-19)
                r10.addFlags(r2)
            L_0x02ee:
                r2 = 2
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
                r4 = 1
                r2[r4] = r3
                java.lang.String r3 = "handleSpanClick url: %s, getA8KeyScene %d"
                r4 = r17
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r2)
                com.tencent.mm.app.plugin.URISpanHandlerSet r2 = com.tencent.p014mm.app.plugin.URISpanHandlerSet.this
                android.content.Context r2 = r2.f107260a
                java.lang.String r3 = "webview"
                java.lang.String r4 = ".ui.tools.WebViewUI"
                r5 = 0
                ke3.C88144b.m109791i(r2, r3, r4, r10, r5)
                r2 = r27
            L_0x0310:
                if (r2 == 0) goto L_0x0315
                r2.mo22793b(r1)
            L_0x0315:
                r1 = 1
                return r1
            L_0x0317:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.plugin.URISpanHandlerSet.HttpUriSpanHandler.mo62702c(android.view.View, wd3.r0, de3.p):boolean");
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$JumpActivityUriSpanHandler */
    public class JumpActivityUriSpanHandler extends BaseUriSpanHandler {
        public JumpActivityUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[0];
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.toLowerCase().startsWith("weixin://jump/")) {
                return false;
            }
            String[] split = str.split("/");
            String str2 = split[split.length - 1];
            if ("mainframe".equalsIgnoreCase(str2)) {
                Intent intent = new Intent(URISpanHandlerSet.this.f107260a, LauncherUI.class);
                if (URISpanHandlerSet.this.f107260a instanceof Service) {
                    intent.addFlags(268435456);
                }
                intent.addFlags(67108864);
                Context context = URISpanHandlerSet.this.f107260a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpActivityUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpActivityUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if ("shake".equalsIgnoreCase(str2)) {
                C115669n.INSTANCE.kvStat(10221, "1");
                Intent intent2 = new Intent();
                intent2.addFlags(67108864);
                if (URISpanHandlerSet.this.f107260a instanceof Service) {
                    intent2.addFlags(268435456);
                }
                C88144b.m109791i(URISpanHandlerSet.this.f107260a, "shake", ".ui.ShakeReportUI", intent2, (Bundle) null);
                Context context3 = URISpanHandlerSet.this.f107260a;
                if (context3 != null && (context3 instanceof Activity)) {
                    ((Activity) context3).finish();
                }
            } else if ("scanqrcode".equalsIgnoreCase(str2)) {
                Intent intent3 = new Intent();
                intent3.putExtra("BaseScanUI_select_scan_mode", 1);
                intent3.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
                intent3.setFlags(65536);
                intent3.addFlags(67108864);
                if (URISpanHandlerSet.this.f107260a instanceof Service) {
                    intent3.addFlags(268435456);
                }
                C88144b.m109791i(URISpanHandlerSet.this.f107260a, "scanner", ".ui.BaseScanUI", intent3, (Bundle) null);
            }
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$JumpPatSettingDialogUriSpanHandler */
    public class JumpPatSettingDialogUriSpanHandler extends BaseUriSpanHandler {
        public JumpPatSettingDialogUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{61};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/setpat_bottom_sheet/")) {
                return new C53155r0(str, 61, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 61) {
                return false;
            }
            ((C50107kb3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(view.getContext(), 4, C50107kb3.class)).f136647d = 1;
            C79076g gVar = new C79076g(view.getContext());
            gVar.show();
            gVar.getWindow().setLayout(-1, -1);
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$JumpPatSettingUriSpanHandler */
    public class JumpPatSettingUriSpanHandler extends BaseUriSpanHandler {

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$JumpPatSettingUriSpanHandler$a */
        public class C40017a implements Runnable {
            public C40017a(JumpPatSettingUriSpanHandler jumpPatSettingUriSpanHandler) {
            }

            public void run() {
                LauncherUI instance = LauncherUI.getInstance();
                if (instance != null) {
                    instance.closeChatting(false);
                    instance.mo101375O7().mo101428l("tab_settings");
                }
            }
        }

        public JumpPatSettingUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{57};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://jump/setpat/")) {
                return new C53155r0(str, 57, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d == 57) {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "handleClickJumpToPatSetting");
                Intent intent = new Intent();
                intent.setClass(URISpanHandlerSet.this.f107260a, SettingsPersonalInfoUI.class);
                intent.putExtra("jumptoPat", true);
                VASActivity.Companion.getClass();
                intent.putExtra(VASActivity.KEY_VAS_START_MODE, 0);
                Context context = URISpanHandlerSet.this.f107260a;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpPatSettingUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/app/plugin/URISpanHandlerSet$JumpPatSettingUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            new MMHandler().postDelayed(new C40017a(this), 2000);
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$LqtDetailSpanHandler */
    public class LqtDetailSpanHandler extends BaseUriSpanHandler {
        public LqtDetailSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{69};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://wcpay/lqt/lqtTransferInKnowDetail")) {
                return new C53155r0(str, 69, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d == 69) {
                String queryParameter = Uri.parse(r0Var.f148312c).getQueryParameter("url");
                if (queryParameter.length() > 0) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", queryParameter);
                    intent.putExtra("showShare", true);
                    intent.putExtra("allow_mix_content_mode", false);
                    C88144b.m109791i(URISpanHandlerSet.this.f107260a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a(priority = PRIORITY.HIGH)
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$LuckyMoneyUriSpanHandler */
    public class LuckyMoneyUriSpanHandler extends BaseUriSpanHandler {
        public LuckyMoneyUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{33, 59};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://weixinhongbao/") || str.trim().toLowerCase().startsWith("frhb://c2cbizmessagehandler/hongbao/receivehongbao")) {
                return new C53155r0(str, 33, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://weixinunionhongbao/")) {
                return new C53155r0(str, 59, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C53155r0 r0Var2 = r0Var;
            C45335p pVar2 = pVar;
            int i = r0Var2.f148313d;
            if (i == 33) {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == MMSpanConstants.Type.TYPE_LUCKY_MONEY_NORMAL");
                if (pVar2 == null) {
                    Log.m105924i("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
                    return false;
                }
                Intent intent = new Intent();
                intent.putExtra("key_native_url", r0Var2.f148312c);
                intent.putExtra("key_username", (String) pVar2.mo22792a(r0Var2));
                intent.putExtra("key_lucky_money_can_received", true);
                intent.putExtra("key_jump_from", 4);
                intent.putExtra("scene_id", 1002);
                if (r0Var2.f148312c.startsWith("frhb://c2cbizmessagehandler/hongbao/receivehongbao")) {
                    intent.putExtra("key_hk_scene", 1);
                    C88144b.m109791i(URISpanHandlerSet.this.f107260a, "luckymoney", ".hk.ui.LuckyMoneyHKBeforeDetailUI", intent, (Bundle) null);
                } else {
                    C88144b.m109791i(URISpanHandlerSet.this.f107260a, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent, (Bundle) null);
                }
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(12097, 11, 0, Long.valueOf(System.currentTimeMillis()));
                nVar.mo160131h(11850, 4, 1);
                return true;
            } else if (i != 59) {
                return false;
            } else {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == MMSpanConstants.Type.TYPE_LUCKY_MONEY_UNION");
                if (pVar2 == null) {
                    Log.m105924i("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
                    return false;
                }
                Intent intent2 = new Intent();
                intent2.putExtra("key_native_url", r0Var2.f148312c);
                intent2.putExtra("key_username", (String) pVar2.mo22792a(r0Var2));
                intent2.putExtra("key_lucky_money_can_received", true);
                intent2.putExtra("key_jump_from", 4);
                intent2.putExtra("scene_id", 1005);
                C88144b.m109791i(URISpanHandlerSet.this.f107260a, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent2, (Bundle) null);
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo160131h(12097, 11, 0, Long.valueOf(System.currentTimeMillis()));
                nVar2.mo160131h(11850, 4, 1);
                return true;
            }
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$OfflineFQFSpanHandler */
    public class OfflineFQFSpanHandler extends BaseUriSpanHandler {
        public OfflineFQFSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{51};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://wcpay/fqf/opentinyapp")) {
                return new C53155r0(str, 51, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d == 51) {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "go to offline fqf");
                Object obj = r0Var.f148314e;
                if (obj != null && (obj instanceof Bundle)) {
                    Bundle bundle = (Bundle) obj;
                    String string = bundle.getString("repayment_tiny_app_username");
                    String string2 = bundle.getString("repayment_tiny_app_path");
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                    aVar.f9526a = string;
                    aVar.f9527b = Util.nullAs(string2, "");
                    startAppBrandUIFromOuterEvent.f9522d.f9528c = 0;
                    startAppBrandUIFromOuterEvent.publish();
                }
                if (pVar != null) {
                    pVar.mo22793b(r0Var);
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$OpenIMKefuMsgMenuUriSpanHandler */
    public class OpenIMKefuMsgMenuUriSpanHandler extends BaseUriSpanHandler {
        public OpenIMKefuMsgMenuUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{62};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://kefumenu")) {
                return new C53155r0(str, 62, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (62 != r0Var.f148313d) {
                return false;
            }
            if (Util.isNullOrNil(r0Var.f148315f)) {
                Log.m105928w("MicroMsg.URISpanHandlerSet", "BizMsgMenuUriSpanHandler Username is null.");
                return true;
            } else if (!C72996z1.m85846q5(r0Var.f148315f)) {
                Log.m105929w("MicroMsg.URISpanHandlerSet", "OpenIMKefuMsgMenuUriSpanHandler Username not openim kefu: %s", r0Var.f148315f);
                return true;
            } else {
                Log.m105919d("MicroMsg.URISpanHandlerSet", "OpenIMKefuMsgMenuUriSpanHandler, url:%s", r0Var.f148312c);
                Uri parse = Uri.parse(r0Var.f148312c.trim());
                String trim = Util.nullAs(parse.getQueryParameter("kefumenuid"), "").trim();
                String queryParameter = parse.getQueryParameter("kefumenucontent");
                if (Util.isNullOrNil(trim) || Util.isNullOrNil(queryParameter)) {
                    Log.m105928w("MicroMsg.URISpanHandlerSet", "OpenIMKefuMsgMenuUriSpanHandler id or msgContent is null.");
                    return true;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("kefumenuid", trim);
                C100760a0.C100764f a = C100760a0.m131931a(r0Var.f148315f);
                String str = r0Var.f148315f;
                a.f295187a = str;
                a.f295189c = queryParameter;
                a.f295190d = C45628s0.m50810y(str);
                a.f295191e = 1;
                a.f295193g = hashMap;
                a.f295194h = 5;
                a.mo140195a().mo123694a();
                return true;
            }
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$OpenIMKefuRequestLocationAcceptSpanHandler */
    public class OpenIMKefuRequestLocationAcceptSpanHandler extends BaseUriSpanHandler {
        public OpenIMKefuRequestLocationAcceptSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{66};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://wwkf/systemmsg/location_request/")) {
                return new C53155r0(str, 66, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            Object obj;
            if (r0Var.f148313d != 66 || (obj = r0Var.f148314e) == null || !(obj instanceof Bundle)) {
                return false;
            }
            C48639m.f130178a.mo73334b(view.getContext(), ((Bundle) obj).getString("chatroom_name"));
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PRIORITY */
    public enum PRIORITY {
        LOW,
        NORMAL,
        HIGH
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PayTransferUriSpanHandler */
    public class PayTransferUriSpanHandler extends BaseUriSpanHandler {
        public PayTransferUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[0];
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            C77302a aVar;
            String str2;
            Class cls = C15919f.class;
            if (str.startsWith("wxpay://")) {
                C77302a aVar2 = null;
                if (l0Var != null) {
                    C44814c cVar = (C44814c) l0Var;
                    String obj = cVar.f121615a.f215752d.mo91574o().getUsername().toString();
                    C77302a aVar3 = cVar.f121615a.f215797e;
                    if (aVar3 instanceof C77302a) {
                        aVar2 = aVar3;
                    }
                    aVar = aVar2;
                    str2 = obj;
                } else {
                    str2 = null;
                    aVar = null;
                }
                if (Util.isNullOrNil(str2)) {
                    Log.m105920e("MicroMsg.URISpanHandlerSet", "SERVICE_JUMP_TO_PAY fail, null username");
                    return false;
                }
                String substring = str.substring(8);
                if (substring.indexOf("&") > 0) {
                    substring = substring.split("&")[0];
                }
                int indexOf = substring.indexOf("=");
                if (Util.getInt(indexOf >= 0 ? substring.substring(indexOf + 1) : "", 0) == 1) {
                    if (C75592q0.m90753A() || C75592q0.m90754B()) {
                        if (C72996z1.m85820U5(str2)) {
                            ((C15919f) C86312j.m106911c(cls)).mo14568d9(URISpanHandlerSet.this.f107260a, 5, str2, 14, aVar);
                        } else {
                            ((C15919f) C86312j.m106911c(cls)).mo14568d9(URISpanHandlerSet.this.f107260a, 5, str2, 11, aVar);
                        }
                    } else if (C72996z1.m85820U5(str2)) {
                        ((C15919f) C86312j.m106911c(cls)).mo14568d9(URISpanHandlerSet.this.f107260a, 2, str2, 14, aVar);
                    } else {
                        ((C15919f) C86312j.m106911c(cls)).mo14568d9(URISpanHandlerSet.this.f107260a, 2, str2, 11, aVar);
                    }
                    return true;
                }
                Context context = URISpanHandlerSet.this.f107260a;
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.im4), 0).show();
            }
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PayUriSpanHandler */
    public class PayUriSpanHandler extends BaseUriSpanHandler {
        public PayUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{28};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 28) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            GetA8KeyRedirectEvent getA8KeyRedirectEvent = new GetA8KeyRedirectEvent();
            GetA8KeyRedirectEvent.C40113a aVar = getA8KeyRedirectEvent.f107573d;
            aVar.f107575a = 11;
            aVar.f107576b = r0Var.f148312c;
            aVar.f107577c = URISpanHandlerSet.this.f107260a;
            aVar.f107578d = new Bundle();
            getA8KeyRedirectEvent.f107573d.f107578d.putInt("pay_channel", 6);
            getA8KeyRedirectEvent.asyncPublish(Looper.myLooper());
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PhoneEmailUriSpanHandler */
    public class PhoneEmailUriSpanHandler extends BaseUriSpanHandler {
        public PhoneEmailUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{25, 24};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            int i = r0Var.f148313d;
            if (i == 25) {
                String str = r0Var.f148315f;
                Bundle bundle = new Bundle();
                if (str != null && !str.equals(C75592q0.m90789s())) {
                    bundle.putString("Contact_User", str);
                    C76166a a = C75398e.vx0().mo106401a(str);
                    bundle.putString("Contact_Mobile_MD5", (a == null || Util.isNullOrNil(a.mo106385e())) ? null : Util.nullAsNil(a.mo106386f()).replace(" ", ""));
                }
                bundle.putInt("fromScene", 1);
                C7304v.m7461e(URISpanHandlerSet.this.f107260a, r0Var.f148312c, (DialogInterface.OnDismissListener) null, bundle);
                return true;
            }
            if (i == 24) {
                C7304v.m7460d(URISpanHandlerSet.this.f107260a, r0Var.f148312c, (DialogInterface.OnDismissListener) null);
            }
            if (pVar == null) {
                return false;
            }
            pVar.mo22793b(r0Var);
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$PluginUriSpanHandler */
    public class PluginUriSpanHandler extends BaseUriSpanHandler {
        public PluginUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{26};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://plugin")) {
                return new C53155r0(str, 26, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://plugin")) {
                return false;
            }
            Intent intent = new Intent();
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "setting", ".ui.setting.SettingsPluginsUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ProfileUriSpanHandler */
    public class ProfileUriSpanHandler extends BaseUriSpanHandler {
        public ProfileUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{3};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://contacts/profile/")) {
                return new C53155r0(str, 3, str.trim().replace("weixin://contacts/profile/", "").replace("/", ""));
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 3) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            String str = (String) r0Var.mo73845a(String.class);
            if (TextUtils.isEmpty(str)) {
                String str2 = r0Var.f148312c;
                try {
                    if (str2.trim().startsWith("weixin://contacts/profile/")) {
                        str = str2.trim().replace("weixin://contacts/profile/", "").replace("/", "");
                    }
                } catch (Throwable unused) {
                }
                str = null;
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", str);
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                C74584x.m89302e(intent, str);
            }
            if (Util.nullAsNil(str).length() > 0) {
                C88144b.m109791i(URISpanHandlerSet.this.f107260a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            }
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.startsWith("weixin://contacts/profile/")) {
                return false;
            }
            String replace = str.trim().replace("weixin://contacts/profile/", "").replace("/", "");
            if (Util.isNullOrNil(replace)) {
                Log.m105920e("MicroMsg.URISpanHandlerSet", "jumpToActivity fail, user is null");
                return true;
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.putExtra("Contact_User", replace);
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(replace);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                C74584x.m89302e(intent, replace);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$ScanQrCodeUriSpanHandler */
    public class ScanQrCodeUriSpanHandler extends BaseUriSpanHandler {
        public ScanQrCodeUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[0];
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            boolean z2 = false;
            if (!str.equals("weixin://scanqrcode/")) {
                return false;
            }
            if (!z) {
                Log.m105920e("MicroMsg.URISpanHandlerSet", "jumpToActivity, scan qrcode permission fail");
                return true;
            }
            Intent intent = new Intent();
            intent.putExtra("BaseScanUI_select_scan_mode", 1);
            if (bundle != null && bundle.getInt("fromScene") == 100) {
                z2 = true;
            }
            if (!z2) {
                intent.addFlags(67108864);
            }
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "scanner", ".ui.BaseScanUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SetSafeDeviceUriSpanHandler */
    public class SetSafeDeviceUriSpanHandler extends BaseUriSpanHandler {
        public SetSafeDeviceUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[0];
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://setting/account/safedevice")) {
                return false;
            }
            String str2 = (String) C97625j3.m125812b().mo105906u().mo119684e(4097, "");
            if (!Util.isNullOrNil((String) C97625j3.m125812b().mo105906u().mo119684e(6, ""))) {
                Intent intent = new Intent();
                if (URISpanHandlerSet.this.f107260a instanceof Service) {
                    intent.addFlags(268435456);
                }
                C88144b.m109789g(URISpanHandlerSet.this.f107260a, "account", ".security.ui.MySafeDeviceListUI");
            } else if (!Util.isNullOrNil(str2)) {
                Intent intent2 = new Intent(URISpanHandlerSet.this.f107260a, BindMContactIntroUI.class);
                intent2.putExtra("bind_scene", 1);
                if (URISpanHandlerSet.this.f107260a instanceof Service) {
                    intent2.addFlags(268435456);
                }
                MMWizardActivity.m7017L7(URISpanHandlerSet.this.f107260a, intent2);
            } else {
                Intent intent3 = new Intent();
                if (URISpanHandlerSet.this.f107260a instanceof Service) {
                    intent3.addFlags(268435456);
                }
                C88144b.m109779A(URISpanHandlerSet.this.f107260a, "account", ".security.ui.BindSafeDeviceUI", intent3);
            }
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingBindEmailUriSpanHandler */
    public class SettingBindEmailUriSpanHandler extends BaseUriSpanHandler {
        public SettingBindEmailUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{7};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/bindemail")) {
                return new C53155r0(str, 7, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 7) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingBlacklistUriSpanHandler */
    public class SettingBlacklistUriSpanHandler extends BaseUriSpanHandler {
        public SettingBlacklistUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{14};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/blacklist")) {
                return new C53155r0(str, 14, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 14) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            C45607c2 a = C45608d2.m50666a(URISpanHandlerSet.this.f107260a.getString(C0966R.string.f360860ff1));
            Intent intent = new Intent();
            intent.setClass(URISpanHandlerSet.this.f107260a, SelectContactUI.class);
            intent.putExtra("Contact_GroupFilter_Type", a.mo71122a());
            String str = a.f123378b;
            if (str == null) {
                str = "";
            }
            intent.putExtra("Contact_GroupFilter_DisplayName", str);
            intent.addFlags(67108864);
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            Context context = URISpanHandlerSet.this.f107260a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://setting/blacklist")) {
                return false;
            }
            C45607c2 a = C45608d2.m50666a(URISpanHandlerSet.this.f107260a.getString(C0966R.string.f360860ff1));
            Intent intent = new Intent();
            intent.setClass(URISpanHandlerSet.this.f107260a, AddressUI.class);
            intent.putExtra("Contact_GroupFilter_Type", a.mo71122a());
            String str2 = a.f123378b;
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra("Contact_GroupFilter_DisplayName", str2);
            intent.addFlags(67108864);
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            Context context = URISpanHandlerSet.this.f107260a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/app/plugin/URISpanHandlerSet$SettingBlacklistUriSpanHandler", "handleUriJump", "(Ljava/lang/String;ZLcom/tencent/mm/pluginsdk/UriJumpCallback;Landroid/os/Bundle;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingHeadImgUriSpanHandler */
    public class SettingHeadImgUriSpanHandler extends BaseUriSpanHandler {
        public SettingHeadImgUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{6};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/setheadimage")) {
                return new C53155r0(str, 6, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 6) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://setting/setheadimage")) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("Contact_User", C75592q0.m90789s());
            intent.putExtra("Contact_Nick", C75592q0.m90783m());
            intent.putExtra("User_Avatar", true);
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingNotifyUriSpanHandler */
    public class SettingNotifyUriSpanHandler extends BaseUriSpanHandler {
        public SettingNotifyUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{9};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/notify")) {
                return new C53155r0(str, 9, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 9) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            C88144b.m109789g(URISpanHandlerSet.this.f107260a, "setting", ".ui.setting.SettingsNotificationUI");
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://setting/notify")) {
                return false;
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            Intent intent = new Intent();
            intent.addFlags(67108864);
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "setting", ".ui.setting.SettingsNotificationUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPluginLomoUriSpanHandler */
    public class SettingPluginLomoUriSpanHandler extends BaseUriSpanHandler {
        public SettingPluginLomoUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{12};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/plugin/lomo")) {
                return new C53155r0(str, 12, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 12) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            Intent intent = new Intent();
            intent.putExtra("Contact_User", "weibo");
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://setting/plugin/lomo")) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("Contact_User", "weibo");
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPluginQQMailUriSpanHandler */
    public class SettingPluginQQMailUriSpanHandler extends BaseUriSpanHandler {
        public SettingPluginQQMailUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{10};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/plugin/qqmail")) {
                return new C53155r0(str, 10, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 10) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            Intent intent = new Intent();
            intent.putExtra("Contact_User", "qqmail");
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://setting/plugin/qqmail")) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("Contact_User", "qqmail");
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPluginQQMsgUriSpanHandler */
    public class SettingPluginQQMsgUriSpanHandler extends BaseUriSpanHandler {
        public SettingPluginQQMsgUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{13};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/plugin/qqmsg")) {
                return new C53155r0(str, 13, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPluginSxMsgUriSpanHandler */
    public class SettingPluginSxMsgUriSpanHandler extends BaseUriSpanHandler {
        public SettingPluginSxMsgUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{11};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/plugin/sxmsg")) {
                return new C53155r0(str, 11, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$SettingPrivacyUriSpanHandler */
    public class SettingPrivacyUriSpanHandler extends BaseUriSpanHandler {
        public SettingPrivacyUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{15};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://setting/privacy")) {
                return new C53155r0(str, 15, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 15) {
                return false;
            }
            if (pVar != null) {
                pVar.mo22792a(r0Var);
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            C88144b.m109789g(URISpanHandlerSet.this.f107260a, "setting", ".ui.setting.SettingsPrivacyUI");
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            if (!str.equals("weixin://setting/privacy")) {
                return false;
            }
            LauncherUI instance = LauncherUI.getInstance();
            if (instance != null) {
                instance.mo101375O7().mo101428l("tab_settings");
            }
            Intent intent = new Intent();
            if (URISpanHandlerSet.this.f107260a instanceof Service) {
                intent.addFlags(268435456);
            }
            C88144b.m109791i(URISpanHandlerSet.this.f107260a, "setting", ".ui.setting.SettingsPrivacyUI", intent, (Bundle) null);
            return true;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$StoryEntranceHandler */
    public class StoryEntranceHandler extends BaseUriSpanHandler {
        public StoryEntranceHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{48};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 48 || TextUtils.isEmpty(r0Var.f148315f)) {
                return false;
            }
            if (pVar == null) {
                return true;
            }
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TeenModeAgreeAuthorizationSpanHandler */
    public class TeenModeAgreeAuthorizationSpanHandler extends BaseUriSpanHandler {
        public TeenModeAgreeAuthorizationSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{64};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://teenagerModeAgreenAuthorization/")) {
                return new C53155r0(str, 64, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C53155r0 r0Var2 = r0Var;
            Class cls = C10432i.class;
            if (r0Var2.f148313d != 64) {
                return false;
            }
            Log.m105924i("MicroMsg.URISpanHandlerSet", "TeenModeAgreeAuthorizationSpanHandler");
            Uri.parse(r0Var2.f148312c);
            String str = r0Var2.f148312c;
            long j = Util.getLong(str.substring(str.trim().lastIndexOf("/") + 1), 0);
            if (j > 0) {
                C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(r0Var2.f148315f, j);
                if (h302.mo108774y2() > 0) {
                    if (h302.mo108769t2() == 1) {
                        ((C10432i) C86312j.m106911c(cls)).mo10744WJ(URISpanHandlerSet.this.f107260a, r0Var2.f148315f, C75592q0.m90789s(), h302.getCreateTime(), h302.mo108774y2(), h302.getContent(), h302.mo108765s2(), Boolean.TRUE);
                    } else {
                        ((C10432i) C86312j.m106911c(cls)).mo10744WJ(URISpanHandlerSet.this.f107260a, C75592q0.m90789s(), r0Var2.f148315f, h302.getCreateTime(), h302.mo108774y2(), h302.getContent(), h302.mo108765s2(), Boolean.TRUE);
                    }
                }
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$UnKnowToUrlSpanHandler */
    public class UnKnowToUrlSpanHandler extends BaseUriSpanHandler {
        public UnKnowToUrlSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{2147483646};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 2147483646) {
                return false;
            }
            Object obj = r0Var.f148314e;
            if (obj instanceof Bundle) {
                String string = ((Bundle) obj).getString("rawUrl");
                if (Util.isNullOrNil(string)) {
                    Log.m105924i("MicroMsg.URISpanHandlerSet", "TYPE_UNKNOW_TO_URL url == null");
                } else {
                    C12215a.m11778c(MMApplicationContext.getContext(), string, 0, true);
                }
            } else {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "TYPE_UNKNOW_TO_URL hrefInfo.getData() no instanceof Bundle");
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$UpgradeAssociateChatRoomUrlSpanHandler */
    public class UpgradeAssociateChatRoomUrlSpanHandler extends BaseUriSpanHandler {
        public UpgradeAssociateChatRoomUrlSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{53};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://weixingroupupdate?")) {
                return new C53155r0(str, 53, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C53155r0 r0Var2 = r0Var;
            Class cls = C109759g.class;
            if (r0Var2.f148313d != 53) {
                return false;
            }
            Log.m105924i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl");
            try {
                String queryParameter = Uri.parse(r0Var2.f148312c).getQueryParameter("roomname");
                if (Util.isNullOrNil(queryParameter)) {
                    Log.m105928w("MicroMsg.URISpanHandlerSet", "Username is null.");
                    return true;
                }
                if (C72996z1.m85820U5(queryParameter)) {
                    C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(queryParameter);
                    if (Lo == null) {
                        Log.m105921e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl %s member is null", queryParameter);
                        return true;
                    }
                    int i = 3;
                    Log.m105925i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl room:%s chatroomStatus:%s owener:%s", queryParameter, Integer.valueOf(Lo.field_chatroomStatus), Util.nullAs(Lo.field_roomowner, ""));
                    boolean z = Lo.field_memberCount >= C45612m0.m50699p();
                    if (C45628s0.m50737B(queryParameter)) {
                        if (!Lo.mo69796x2(C75592q0.m90789s())) {
                            Log.m105924i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：no owner");
                            Context context = URISpanHandlerSet.this.f107260a;
                            if (context != null) {
                                C76879j.m92711E(context, context.getString(C0966R.string.b6e), "", URISpanHandlerSet.this.f107260a.getString(C0966R.string.f8028zq), false, (DialogInterface.OnClickListener) null);
                            } else {
                                Log.m105920e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                            }
                            if (!z) {
                                i = 1;
                            }
                            ManagerRoomByWeworkUI.m43242H7(queryParameter, 2, 2, i);
                            return true;
                        }
                    } else if (C45628s0.m50735A(queryParameter) && !Lo.mo69796x2(C75592q0.m90789s())) {
                        Log.m105924i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：isAssociateChatRoom ");
                        Context context2 = URISpanHandlerSet.this.f107260a;
                        if (context2 != null) {
                            C76879j.m92711E(context2, context2.getString(C0966R.string.b6b), "", URISpanHandlerSet.this.f107260a.getString(C0966R.string.f8028zq), false, (DialogInterface.OnClickListener) null);
                        } else {
                            Log.m105920e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                        }
                        return true;
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：exceed maxnum");
                        Context context3 = URISpanHandlerSet.this.f107260a;
                        if (context3 != null) {
                            C76879j.m92711E(context3, context3.getString(C0966R.string.b6c), "", URISpanHandlerSet.this.f107260a.getString(C0966R.string.f8028zq), false, (DialogInterface.OnClickListener) null);
                        } else {
                            Log.m105920e("MicroMsg.URISpanHandlerSet", "handleClickUpgradeAssociateChatRoomUrl：mContext is null");
                        }
                        ManagerRoomByWeworkUI.m43242H7(queryParameter, 2, 2, 2);
                        return true;
                    }
                    ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175762a(25);
                    ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175762a(26);
                    ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175762a(27);
                    Intent intent = new Intent();
                    intent.setClass(MMApplicationContext.getContext(), ManagerRoomByWeworkUI.class);
                    intent.addFlags(268435456);
                    intent.putExtra("RoomInfo_Id", queryParameter);
                    intent.putExtra("upgrade_openim_room_from_scene", 2);
                    Context context4 = MMApplicationContext.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context4, aVar.mo10232b(), "com/tencent/mm/app/plugin/URISpanHandlerSet$UpgradeAssociateChatRoomUrlSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context4.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context4, "com/tencent/mm/app/plugin/URISpanHandlerSet$UpgradeAssociateChatRoomUrlSpanHandler", "handleSpanClick", "(Landroid/view/View;Lcom/tencent/mm/pluginsdk/ui/applet/HrefInfo;Lcom/tencent/mm/pluginsdk/ui/span/MMSpanClickCallback;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                return true;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e.getMessage(), r0Var2.f148312c);
                return true;
            }
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$VerifyContactUriSpanHandler */
    public class VerifyContactUriSpanHandler extends BaseUriSpanHandler {
        public VerifyContactUriSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{4};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://findfriend/verifycontact")) {
                return new C53155r0(str, 4, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 4) {
                return false;
            }
            if (pVar == null) {
                return true;
            }
            pVar.mo22792a(r0Var);
            pVar.mo22793b(r0Var);
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$WeWorkUrlSpanHandler */
    public class WeWorkUrlSpanHandler extends BaseUriSpanHandler {

        /* renamed from: a */
        public final String f107312a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmr) + "/wework_admin/commdownload");

        public WeWorkUrlSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{52};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("wxwork://jump?")) {
                return new C53155r0(str, 52, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            String str;
            if (r0Var.f148313d == 52) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(r0Var.f148312c));
                intent.setPackage("com.tencent.wework");
                intent.setFlags(268435456);
                try {
                    C79138l lVar = (C79138l) C86312j.m106911c(C79138l.class);
                    Context context = MMApplicationContext.getContext();
                    PackageManager packageManager = MMApplicationContext.getContext().getPackageManager();
                    try {
                        str = packageManager.getApplicationInfo("com.tencent.wework", 0).loadLabel(packageManager).toString();
                    } catch (PackageManager.NameNotFoundException unused) {
                        str = null;
                    }
                    boolean Sy = lVar.mo74000Sy(context, intent, str);
                    if (!Sy) {
                        C12215a.m11778c(MMApplicationContext.getContext(), this.f107312a, 0, true);
                    }
                    Log.m105925i("MicroMsg.URISpanHandlerSet", "WeWorkUrlSpanHandler result:%s", Boolean.valueOf(Sy));
                    return true;
                } catch (Exception unused2) {
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$WxaShortLinkUriSpanHandler */
    public class WxaShortLinkUriSpanHandler extends BaseUriSpanHandler {
        public WxaShortLinkUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{60};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("mp://")) {
                return new C53155r0(str, 60, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            C53155r0 r0Var2 = r0Var;
            Log.m105924i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] handleSpanClick ");
            Object obj = r0Var2.f148314e;
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                String str = "";
                String string = bundle.getString("key_wxa_short_link_launch_scene", str);
                int i = bundle.getInt("key_wxa_short_link_launch_chat_type", -1);
                if (string.isEmpty()) {
                    Log.m105924i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] scene is null ");
                    if (BuildInfo.IS_FLAVOR_RED) {
                        throw new Error("[WxaShortLinkUriSpanHandler]  scene must not is null");
                    }
                } else {
                    C45331f0.C45333b valueOf = C45331f0.C45333b.valueOf(string);
                    Log.m105925i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] sceneName=%s  scene=%d  preScene=%d", string, Integer.valueOf(valueOf.f122801d), Integer.valueOf(valueOf.f122802e));
                    Context context = URISpanHandlerSet.this.f107260a;
                    String str2 = r0Var2.f148312c;
                    String str3 = r0Var2.f148316g;
                    if (str3 != null) {
                        str = str3;
                    } else {
                        String str4 = r0Var2.f148315f;
                        if (str4 != null) {
                            str = str4;
                        }
                    }
                    int i2 = AppBrandCheckWxaShortLinkUI.f108873g;
                    C87412m.m108594g(context, "context");
                    C87412m.m108594g(str2, "url");
                    if (!C112551y.m153811k(str2)) {
                        Intent intent = new Intent(context, AppBrandCheckWxaShortLinkUI.class);
                        intent.putExtra("url", str2);
                        intent.putExtra("senderUsername", str);
                        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, valueOf.name());
                        intent.putExtra("need_check", true);
                        intent.putExtra("chatType", i);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        Context context2 = context;
                        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI$Companion", "startCheckLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/ui/span/WxaShortLinkScene$SCENE;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI$Companion", "startCheckLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/ui/span/WxaShortLinkScene$SCENE;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            } else {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "[WxaShortLinkUriSpanHandler] HrefInfo has not data");
                if (BuildInfo.IS_FLAVOR_RED) {
                    throw new Error("[WxaShortLinkUriSpanHandler] HrefInfo has not data");
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$HoneyPayLinkSpanHandler */
    public class HoneyPayLinkSpanHandler extends BaseUriSpanHandler {

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$HoneyPayLinkSpanHandler$a */
        public class C40018a implements C47883u {
            public C40018a(HoneyPayLinkSpanHandler honeyPayLinkSpanHandler) {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
            }
        }

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$HoneyPayLinkSpanHandler$b */
        public class C40019b implements C47883u {
            public C40019b(HoneyPayLinkSpanHandler honeyPayLinkSpanHandler) {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
            }
        }

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$HoneyPayLinkSpanHandler$c */
        public class C40020c implements UseCaseCallback {
            public C40020c(HoneyPayLinkSpanHandler honeyPayLinkSpanHandler) {
            }

            public void call(ITransmitKvData iTransmitKvData) {
            }
        }

        public HoneyPayLinkSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{46, 47};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("native://wcpay/honeypay")) {
                return new C53155r0(str, 46, (Object) null);
            }
            if (str.trim().startsWith("weixin://wcpay/bankCardList")) {
                return new C53155r0(str, 47, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            int i = r0Var.f148313d;
            if (i == 46) {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "go to honey pay proxy");
                Object obj = r0Var.f148314e;
                if (obj != null && (obj instanceof Bundle)) {
                    Uri parse = Uri.parse(r0Var.f148312c);
                    String queryParameter = parse.getQueryParameter("cardNo");
                    boolean equals = parse.getQueryParameter("isPayer").equals("1");
                    String queryParameter2 = parse.getQueryParameter("paymsgid");
                    if (Util.isNullOrNil(queryParameter2)) {
                        Intent intent = new Intent();
                        intent.putExtra("key_card_no", queryParameter);
                        intent.putExtra("key_is_payer", equals);
                        C88144b.m109791i(URISpanHandlerSet.this.f107260a, "honey_pay", ".ui.HoneyPayProxyUI", intent, (Bundle) null);
                    } else {
                        long nu = ((C79445i) C86312j.m106911c(C79445i.class)).mo109193nu(queryParameter2);
                        Log.m105925i("MicroMsg.URISpanHandlerSet", "handleSpanClick: %s,find msg: %s", r0Var.f148312c, Long.valueOf(nu));
                        if (nu > 0) {
                            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(nu);
                            if (b002.getMsgId() <= 0) {
                                Log.m105924i("MicroMsg.URISpanHandlerSet", "cannot find msg in msg storage!");
                                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                                qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.i1t));
                                qVar.mo107599k(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d));
                                qVar.mo107601m(C0966R.string.fmz);
                                qVar.mo107600l(new C40018a(this));
                                qVar.mo107603o();
                            } else {
                                ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent = new ScrollChattingUIConversationListEvent();
                                ScrollChattingUIConversationListEvent.C67784a aVar = scrollChattingUIConversationListEvent.f193923d;
                                aVar.f193925b = nu;
                                aVar.f193924a = b002.mo108768t();
                                scrollChattingUIConversationListEvent.publish();
                            }
                        } else {
                            Log.m105924i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_HONEY_PAY_CARD_MANAGER, cannot find local msg");
                            C77426q qVar2 = new C77426q(MMApplicationContext.getContext());
                            qVar2.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.i1t));
                            qVar2.mo107599k(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d));
                            qVar2.mo107601m(C0966R.string.fmz);
                            qVar2.mo107600l(new C40019b(this));
                            qVar2.mo107603o();
                        }
                    }
                }
            } else if (i == 47) {
                Log.m105924i("MicroMsg.URISpanHandlerSet", "go to bank card list");
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_kinda_android_bankcard_manager_config, false)) {
                    Log.m105924i("MicroMsg.URISpanHandlerSet", "isKindaBankCardManagerEnable");
                    ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("bankCard", ITransmitKvData.create(), new C40020c(this));
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("intent_finish_self", true);
                    C88144b.m109791i(URISpanHandlerSet.this.f107260a, "wallet", ".bind.ui.WalletBankcardManageUI", intent2, (Bundle) null);
                }
                C115669n.INSTANCE.mo160131h(15191, 0, 0, 0, 0, 0, 1);
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$OpenFinderLiveLotteryDetailSpanHandler */
    public class OpenFinderLiveLotteryDetailSpanHandler extends BaseUriSpanHandler {
        public OpenFinderLiveLotteryDetailSpanHandler(URISpanHandlerSet uRISpanHandlerSet) {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{68};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://finderlive/lotteryDetail")) {
                return new C53155r0(str, 68, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            Object obj;
            C53155r0 r0Var2 = r0Var;
            Class cls = C60200t1.class;
            if (r0Var2.f148313d == 68 && (obj = r0Var2.f148314e) != null && (obj instanceof Bundle)) {
                Bundle bundle = (Bundle) obj;
                C78001u03 u032 = new C78001u03();
                try {
                    u032.parseFrom(bundle.getByteArray("KEY_FINDER_LIVE_JUMP_DATA"));
                    String str = u032.f228275d;
                    String str2 = u032.f228277f;
                    String str3 = u032.f228276e;
                    Intent intent = new Intent();
                    intent.putExtra("FROM_SCENE", 1);
                    intent.putExtra("KEY_LOTTERY_HISTORY_LIVE_ID", C61926c.m72671P(str2));
                    intent.putExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", C61926c.m72671P(str3));
                    intent.putExtra("KEY_LOTTERY_HISTORY_SOURCE", 1);
                    intent.putExtra("KEY_LOTTERY_ID", str);
                    String n = ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(r0Var2.f148324o.mo101010p2());
                    if (!Util.isNullOrNil(n)) {
                        intent.putExtra("KEY_LIVE_ANCHOR_USERNAME", n);
                    }
                    if (u032.f228278g) {
                        try {
                            C115669n nVar = C115669n.INSTANCE;
                            C104289g gVar = new C104289g();
                            gVar.mo145953n("user_type", 2);
                            nVar.mo160131h(20849, 6, 2, str, "", gVar.toString().replace(",", ";"));
                        } catch (Exception e) {
                            Log.m105924i("MicroMsg.URISpanHandlerSet", "[setContent] e.msg:" + e.getMessage());
                        }
                        intent.putExtra("FINDER_NICKNAME", u032.f228279h);
                        intent.putExtra("KEY_SCENE", 2);
                        ((C60200t1) C86312j.m106911c(cls)).mo76871s3((Activity) view.getContext(), intent);
                    } else {
                        try {
                            C115669n nVar2 = C115669n.INSTANCE;
                            C104289g gVar2 = new C104289g();
                            gVar2.mo145953n("user_type", 1);
                            nVar2.mo160131h(20849, 6, 2, str, "", gVar2.toString().replace(",", ";"));
                        } catch (Exception e2) {
                            Log.m105924i("MicroMsg.URISpanHandlerSet", "[setContent] e.msg:" + e2.getMessage());
                        }
                        intent.putExtra("KEY_SCENE", 1);
                        ((C60200t1) C86312j.m106911c(cls)).mo76887v1((Activity) view.getContext(), intent);
                    }
                } catch (Exception e3) {
                    Log.m105924i("MicroMsg.URISpanHandlerSet", "[OpenFinderLiveLotteryDetailSpanHandler],e:" + e3.getMessage());
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TodoSystemMsgUrlSpanHandler */
    public class TodoSystemMsgUrlSpanHandler extends BaseUriSpanHandler {
        public TodoSystemMsgUrlSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{54};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://roomtoolstodo?")) {
                return new C53155r0(str, 54, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            boolean z;
            Class cls = C77089d.class;
            if (r0Var.f148313d != 54) {
                return false;
            }
            Log.m105924i("MicroMsg.URISpanHandlerSet", "handleClickTodoSystemMsgUrl");
            try {
                Uri parse = Uri.parse(r0Var.f148312c);
                String str = r0Var.f148318i;
                String queryParameter = parse.getQueryParameter("todoid");
                parse.getQueryParameter("related_msgid");
                String queryParameter2 = parse.getQueryParameter("username");
                String queryParameter3 = parse.getQueryParameter("path");
                C77711c Lo = ((C77089d) C86312j.m106911c(cls)).wx0().mo107864Lo(str, queryParameter);
                if (Util.isEqual("roomannouncement@app.origin", queryParameter2)) {
                    C76758b0.m92499d(MMApplicationContext.getContext(), str, true);
                } else {
                    C86299o oVar = new C86299o();
                    oVar.f250929a = queryParameter2;
                    oVar.f250934f = queryParameter3;
                    oVar.f250939k = C1728m2.CTRL_INDEX;
                    oVar.f250948t = str;
                    ((C77089d) C86312j.m106911c(cls)).mo107397j(oVar, Lo);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(URISpanHandlerSet.this.f107260a, oVar);
                }
                boolean e = C76758b0.m92500e(Lo);
                if (e) {
                    z = C76758b0.m92505j(Lo);
                    if (z) {
                        NotifyGroupTodoEvent notifyGroupTodoEvent = new NotifyGroupTodoEvent();
                        NotifyGroupTodoEvent.C67740a aVar = notifyGroupTodoEvent.f193762d;
                        aVar.f193763a = 3;
                        aVar.f193764b = Lo.field_roomname;
                        aVar.f193765c = queryParameter;
                        notifyGroupTodoEvent.asyncPublish(Looper.getMainLooper());
                    }
                } else {
                    z = false;
                }
                C24982c0.m31597a(str, Util.isEqual("roomannouncement@app.origin", queryParameter2) ? 1 : 0, 2, queryParameter, queryParameter2);
                Log.m105925i("MicroMsg.URISpanHandlerSet", "handleClickTodoSystemMsgUrl stoTodo(%s %s %s) update finish(%s)", Boolean.valueOf(Util.isNullOrNil(queryParameter)), Boolean.valueOf(Util.isNullOrNil(queryParameter2)), Boolean.valueOf(e), Boolean.valueOf(z));
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.URISpanHandlerSet", "handle click link error: %s, url: %s", e2.getMessage(), r0Var.f148312c);
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TopicSpanHandler */
    public class TopicSpanHandler extends BaseUriSpanHandler {
        public TopicSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{58};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            int i;
            int i2;
            long j;
            int i3;
            String str;
            boolean z;
            C53155r0 r0Var2 = r0Var;
            if (r0Var2.f148313d != 58) {
                return true;
            }
            ze4 ze4 = (ze4) ((C77049b) C86312j.m106911c(C77049b.class)).mo72347H6(1, view);
            Log.m105925i("MicroMsg.URISpanHandlerSet", "TopicSpanHandler click %s %s", r0Var2.f148312c, ze4);
            long j2 = 0;
            long e = (long) C31543z5.m39455e();
            if (ze4 != null) {
                j2 = ze4.f228684d;
                i3 = ze4.f228685e;
                String str2 = ze4.f228686f;
                j = ze4.f228687g;
                i2 = ze4.f228688h;
                i = ze4.f228689i;
                str = mo62711e(i3, str2, ze4.f228690j);
            } else {
                j = e;
                str = "";
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            Object obj = r0Var2.f148314e;
            if (obj != null && (obj instanceof Bundle)) {
                j2 = ((Bundle) obj).getLong("msgSvrId");
            }
            String str3 = r0Var2.f148312c;
            int i4 = 73;
            if (!(i3 == 1 || i3 == 2)) {
                if (i3 == 3) {
                    i4 = 79;
                } else if (i3 == 4 || i3 == 5) {
                    i4 = 80;
                }
            }
            String ep02 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(i4);
            C14134p0 p0Var = new C14134p0();
            Context context = URISpanHandlerSet.this.f107260a;
            p0Var.f39544a = context;
            p0Var.f39545b = i4;
            p0Var.f39547d = str3;
            p0Var.f39556m = str3;
            p0Var.f39548e = ep02;
            p0Var.f39549f = true;
            p0Var.f39551h = true;
            p0Var.f39552i = true;
            p0Var.f39553j = 1;
            p0Var.f39554k = C76577a.m92153d(context, C0966R.color.al6);
            p0Var.f39555l = true;
            ((HashMap) p0Var.f39550g).put("msgSvrId", String.valueOf(j2));
            ((HashMap) p0Var.f39550g).put("parentSearchID", "");
            ((HashMap) p0Var.f39550g).put("fromTagSearch", "1");
            ((HashMap) p0Var.f39561r).put("ShareSceneId", str);
            ((HashMap) p0Var.f39561r).put("SnsContentType", String.valueOf(i));
            ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
            WCTopicSearchContentActionStruct wCTopicSearchContentActionStruct = new WCTopicSearchContentActionStruct();
            wCTopicSearchContentActionStruct.f10095d = 1;
            wCTopicSearchContentActionStruct.f10096e = (long) C31543z5.m39455e();
            wCTopicSearchContentActionStruct.f10097f = 1;
            if (TextUtils.isEmpty(str3) || !str3.startsWith("#")) {
                z = true;
            } else {
                z = true;
                str3 = str3.substring(1);
            }
            wCTopicSearchContentActionStruct.f10098g = wCTopicSearchContentActionStruct.mo86045b("ResultQuery", str3, z);
            wCTopicSearchContentActionStruct.f10099h = (long) i3;
            wCTopicSearchContentActionStruct.f10100i = wCTopicSearchContentActionStruct.mo86045b("ShareSceneId", str, z);
            wCTopicSearchContentActionStruct.f10101j = j;
            wCTopicSearchContentActionStruct.f10102k = (long) i2;
            wCTopicSearchContentActionStruct.f10103l = wCTopicSearchContentActionStruct.mo86045b("SearchSessionId", ep02, z);
            wCTopicSearchContentActionStruct.f10104m = z ? 1 : 0;
            wCTopicSearchContentActionStruct.f10105n = 0;
            wCTopicSearchContentActionStruct.mo86054n();
            C22613h1.m26490p(wCTopicSearchContentActionStruct);
            return z;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }

        /* renamed from: e */
        public final String mo62711e(int i, String str, int i2) {
            String[] split;
            if (i == 3 && !TextUtils.isEmpty(str) && (split = str.split("#")) != null && split.length >= 2) {
                String str2 = split[1];
                if ((TextUtils.isEmpty(str2) || TextUtils.equals("0", str2)) && i2 != 0) {
                    Log.m105924i("MicroMsg.WebSearch.WebSearchReportLogic", "need correct feeId");
                    SnsInfo LL = C94866e1.Yx0().mo139800LL(i2);
                    if (LL != null) {
                        long j = LL.field_snsId;
                        if (j != 0) {
                            split[1] = C102236a0.m134765q0(j);
                            StringBuilder sb = new StringBuilder();
                            for (int i3 = 0; i3 < split.length; i3++) {
                                sb.append(split[i3]);
                                if (i3 != split.length - 1) {
                                    sb.append("#");
                                }
                            }
                            return sb.toString();
                        }
                    }
                }
            }
            return str;
        }

        /* renamed from: f */
        public void mo62712f(View view, C53155r0 r0Var, String str, int i, int i2) {
            String str2;
            int i3;
            ze4 ze4 = (ze4) ((C77049b) C86312j.m106911c(C77049b.class)).mo72347H6(1, view);
            int i4 = 0;
            Log.m105925i("MicroMsg.URISpanHandlerSet", "TopicSpanHandler click %s %s", r0Var.f148312c, ze4);
            long e = (long) C31543z5.m39455e();
            if (ze4 != null) {
                i4 = ze4.f228685e;
                String str3 = ze4.f228686f;
                e = ze4.f228687g;
                i3 = ze4.f228688h;
                str2 = mo62711e(i4, str3, ze4.f228690j);
            } else {
                str2 = "";
                i3 = 0;
            }
            String str4 = r0Var.f148312c;
            WCTopicSearchContentActionStruct wCTopicSearchContentActionStruct = new WCTopicSearchContentActionStruct();
            wCTopicSearchContentActionStruct.f10095d = 1;
            wCTopicSearchContentActionStruct.f10096e = (long) C31543z5.m39455e();
            wCTopicSearchContentActionStruct.f10097f = 1;
            if (!TextUtils.isEmpty(str4) && str4.startsWith("#")) {
                str4 = str4.substring(1);
            }
            wCTopicSearchContentActionStruct.f10098g = wCTopicSearchContentActionStruct.mo86045b("ResultQuery", str4, true);
            wCTopicSearchContentActionStruct.f10099h = (long) i4;
            wCTopicSearchContentActionStruct.f10100i = wCTopicSearchContentActionStruct.mo86045b("ShareSceneId", str2, true);
            wCTopicSearchContentActionStruct.f10101j = e;
            wCTopicSearchContentActionStruct.f10102k = (long) i3;
            wCTopicSearchContentActionStruct.f10103l = wCTopicSearchContentActionStruct.mo86045b("SearchSessionId", str, true);
            wCTopicSearchContentActionStruct.f10104m = i;
            wCTopicSearchContentActionStruct.f10105n = i2;
            wCTopicSearchContentActionStruct.mo86054n();
            C22613h1.m26490p(wCTopicSearchContentActionStruct);
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TransferUriSpanHandler */
    public class TransferUriSpanHandler extends BaseUriSpanHandler {

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TransferUriSpanHandler$a */
        public class C40021a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ Bundle f107318a;

            public C40021a(TransferUriSpanHandler transferUriSpanHandler, Bundle bundle) {
                this.f107318a = bundle;
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                if (z) {
                    String string = this.f107318a.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                    String string2 = this.f107318a.getString("transfer_id");
                    String string3 = this.f107318a.getString("receiver_name");
                    Intent intent = new Intent();
                    intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, string);
                    intent.putExtra("transfer_id", string2);
                    intent.putExtra("receiver_name", string3);
                    intent.putExtra("resend_msg_from_flag", 3);
                    intent.putExtra("is_open_im", this.f107318a.getInt("is_open_im"));
                    C88144b.m109791i(MMApplicationContext.getContext(), "remittance", ".ui.RemittanceResendMsgUI", intent, (Bundle) null);
                }
            }
        }

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TransferUriSpanHandler$b */
        public class C40022b implements C47883u {
            public C40022b(TransferUriSpanHandler transferUriSpanHandler) {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
            }
        }

        /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$TransferUriSpanHandler$c */
        public class C40023c implements C47883u {
            public C40023c(TransferUriSpanHandler transferUriSpanHandler) {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
            }
        }

        public TransferUriSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{39, 40, 41, 70, 42, 49, 56, 63};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/retrysendmsg")) {
                return new C53155r0(str, 39, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/rebacksendmsg")) {
                return new C53155r0(str, 40, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/watchbalance")) {
                return new C53155r0(str, 41, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/watchotheraccount")) {
                return new C53155r0(str, 70, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wcpay/transfer/watchlqt")) {
                return new C53155r0(str, 42, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("wechat://wcpay/transfer/transferquery")) {
                return new C53155r0(str, 49, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wxpay/transfer/remindrcvmsg")) {
                return new C53155r0(str, 56, (Object) null);
            }
            if (str.trim().toLowerCase().startsWith("weixin://wxpay/transfer/transfer_overtime")) {
                return new C53155r0(str, 63, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            String str;
            Class cls = C76324c.class;
            if (r0Var != null) {
                int i = r0Var.f148313d;
                if (i == 42) {
                    if (!((C76324c) C86312j.m106911c(cls)).startLqtDetailUseCase(URISpanHandlerSet.this.f107260a, new Intent())) {
                        C88144b.m109791i(URISpanHandlerSet.this.f107260a, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", new Intent(), (Bundle) null);
                    }
                    return true;
                } else if (i == 41) {
                    if (!((C76324c) C86312j.m106911c(cls)).startWalletBalanceEntryUseCase(URISpanHandlerSet.this.f107260a)) {
                        C88144b.m109789g(URISpanHandlerSet.this.f107260a, "wallet", ".balance.ui.WalletBalanceManagerUI");
                    }
                    return true;
                } else if (i == 70) {
                    Uri parse = Uri.parse(r0Var.f148312c);
                    RemittanceAccountDetailEvent remittanceAccountDetailEvent = new RemittanceAccountDetailEvent();
                    remittanceAccountDetailEvent.f193883d.f193884a = Util.getInt(parse.getQueryParameter("jumpinfo_type"), 0);
                    remittanceAccountDetailEvent.f193883d.f193885b = parse.getQueryParameter("jumpinfo_url");
                    remittanceAccountDetailEvent.f193883d.f193886c = parse.getQueryParameter("jumpinfo_username");
                    remittanceAccountDetailEvent.f193883d.f193887d = parse.getQueryParameter("jumpinfo_pagepath");
                    remittanceAccountDetailEvent.publish();
                    return true;
                } else if (i == 39) {
                    Object obj = r0Var.f148314e;
                    if (obj != null && (obj instanceof Bundle)) {
                        Bundle bundle = (Bundle) obj;
                        ((C16134c) C86312j.m106911c(C16134c.class)).mo14711xP(URISpanHandlerSet.this.f107260a, (ResendMsgInfo) bundle.getParcelable("resend_msg_info"), new C40021a(this, bundle));
                    }
                    return true;
                } else if (i == 40) {
                    Object obj2 = r0Var.f148314e;
                    if (obj2 != null && (obj2 instanceof Bundle)) {
                        Bundle bundle2 = (Bundle) obj2;
                        RemittanceRefuseEvent remittanceRefuseEvent = new RemittanceRefuseEvent();
                        remittanceRefuseEvent.f193895d.f193896a = bundle2.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                        remittanceRefuseEvent.f193895d.f193897b = bundle2.getString("transfer_id");
                        remittanceRefuseEvent.f193895d.f193898c = bundle2.getInt("total_fee");
                        remittanceRefuseEvent.f193895d.f193899d = bundle2.getString("sender_name");
                        remittanceRefuseEvent.publish();
                    }
                    return true;
                } else {
                    String str2 = "";
                    if (i == 49) {
                        Uri parse2 = Uri.parse(r0Var.f148312c);
                        String queryParameter = parse2.getQueryParameter("transfer_id");
                        String queryParameter2 = parse2.getQueryParameter("trans_id");
                        Object obj3 = r0Var.f148314e;
                        if (obj3 == null || !(obj3 instanceof Bundle)) {
                            Log.m105924i("MicroMsg.URISpanHandlerSet", "hrefInfo.getType() == TYPE_TRANSFER_QUERY_MSG senderName == null");
                            str = str2;
                        } else {
                            Bundle bundle3 = (Bundle) obj3;
                            str2 = bundle3.getString("sender_name");
                            str = bundle3.getString("receiver_name");
                        }
                        Intent intent = new Intent();
                        intent.putExtra("transfer_id", queryParameter);
                        intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, queryParameter2);
                        intent.putExtra("sender_name", str2);
                        intent.putExtra("receiver_name", str);
                        C88144b.m109791i(MMApplicationContext.getContext(), "remittance", ".ui.RemittanceDetailUI", intent, (Bundle) null);
                        return true;
                    } else if (i == 56 || i == 63) {
                        Uri parse3 = Uri.parse(r0Var.f148312c);
                        String queryParameter3 = parse3.getQueryParameter("transferid");
                        String queryParameter4 = parse3.getQueryParameter("fromusername");
                        String queryParameter5 = parse3.getQueryParameter("transfer_msg_type");
                        if (r0Var.f148313d == 56) {
                            Log.m105925i("MicroMsg.URISpanHandlerSet", "click MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, transferId: %s，msgType:%s", queryParameter3, queryParameter5);
                            C115669n.INSTANCE.mo160131h(20467, "transfer_to_change", "click message", str2, str2, str2, str2, 3, queryParameter3, queryParameter5);
                        }
                        if (!Util.isNullOrNil(queryParameter3)) {
                            Log.m105924i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG");
                            long gd = ((C79445i) C86312j.m106911c(C79445i.class)).mo109189gd(queryParameter3);
                            if (gd > 0) {
                                Log.m105925i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, localMsgId: %s", Long.valueOf(gd));
                                if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(gd).getMsgId() <= 0) {
                                    Log.m105924i("MicroMsg.URISpanHandlerSet", "cannot find msg in msg storage!");
                                    C77426q qVar = new C77426q(MMApplicationContext.getContext());
                                    qVar.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.i1t));
                                    qVar.mo107599k(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d));
                                    qVar.mo107601m(C0966R.string.fmz);
                                    qVar.mo107600l(new C40022b(this));
                                    qVar.mo107603o();
                                } else {
                                    ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent = new ScrollChattingUIConversationListEvent();
                                    ScrollChattingUIConversationListEvent.C67784a aVar = scrollChattingUIConversationListEvent.f193923d;
                                    aVar.f193925b = gd;
                                    aVar.f193924a = queryParameter4;
                                    scrollChattingUIConversationListEvent.publish();
                                }
                            } else {
                                Log.m105924i("MicroMsg.URISpanHandlerSet", "handle MSpanConstants.Type.TYPE_TRANSFER_REMINDE_RECEIVE_MSG, cannot find local msg");
                                C77426q qVar2 = new C77426q(MMApplicationContext.getContext());
                                qVar2.mo107595g(MMApplicationContext.getContext().getString(C0966R.string.i1t));
                                qVar2.mo107599k(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d));
                                qVar2.mo107601m(C0966R.string.fmz);
                                qVar2.mo107600l(new C40023c(this));
                                qVar2.mo107603o();
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @C40024a
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$VoipCallAgainUrilSpanHandler */
    public class VoipCallAgainUrilSpanHandler extends BaseUriSpanHandler {
        public VoipCallAgainUrilSpanHandler() {
        }

        /* renamed from: a */
        public int[] mo62700a() {
            return new int[]{38};
        }

        /* renamed from: b */
        public C53155r0 mo62701b(String str) {
            if (str.trim().startsWith("weixin://voip/callagain/")) {
                return new C53155r0(str, 38, (Object) null);
            }
            return null;
        }

        /* renamed from: c */
        public boolean mo62702c(View view, C53155r0 r0Var, C45335p pVar) {
            if (r0Var.f148313d != 38) {
                return false;
            }
            Uri parse = Uri.parse(r0Var.f148312c);
            String queryParameter = parse.getQueryParameter("username");
            String queryParameter2 = parse.getQueryParameter("isvideocall");
            VoipEvent voipEvent = new VoipEvent();
            VoipEvent.C67818a aVar = voipEvent.f194019d;
            aVar.f194022b = 5;
            aVar.f194025e = queryParameter;
            aVar.f194024d = URISpanHandlerSet.this.f107260a;
            VoipExceptionReportStruct voipExceptionReportStruct = new VoipExceptionReportStruct();
            voipExceptionReportStruct.f156894e = 1;
            voipExceptionReportStruct.mo86054n();
            if (queryParameter == null || queryParameter.equals("")) {
                return false;
            }
            if (queryParameter2 == null || !queryParameter2.equals("true")) {
                voipEvent.f194019d.f194026f = 4;
            } else {
                voipEvent.f194019d.f194026f = 2;
            }
            voipEvent.publish();
            return true;
        }

        /* renamed from: d */
        public boolean mo62703d(String str, boolean z, C53145l0 l0Var, Bundle bundle) {
            return false;
        }
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.mm.app.plugin.URISpanHandlerSet$a */
    public @interface C40024a {
        PRIORITY priority() default PRIORITY.NORMAL;
    }

    public URISpanHandlerSet(Context context) {
        Context context2 = null;
        this.f107260a = context == null ? MMApplicationContext.getContext() : context2;
    }
}
