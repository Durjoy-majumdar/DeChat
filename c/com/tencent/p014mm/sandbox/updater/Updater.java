package com.tencent.p014mm.sandbox.updater;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CheckTinkerUpdateEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.modelsimple.C40373y;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72682b;
import com.tencent.p014mm.pluginsdk.platformtools.C6666h;
import com.tencent.p014mm.sandbox.monitor.C85705h;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.service.C116024c;
import com.tencent.xweb.IXWebPreferences;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;
import k20.C9556a;
import ke3.C88144b;
import l20.C21388a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89137b0;
import p1054vg.C102189h;
import p206nj.C88955f;
import p206nj.C88956h;
import p327ct.C30914c;
import p629ny.C76979h;
import p918s2.C90116e;
import qe3.C89623b0;
import qe3.C89625d;
import qo3.C89779i0;
import s72.C77623a;
import sf0.C48374j0;
import sf0.C90188n0;
import sg3.C90198a;
import tc0.C48632o;
import tc0.C77885p;
import te3.C49247e82;
import te3.C49393f82;
import te3.C52049y03;
import te3.C90428oa2;
import tg3.C90493t;
import tg3.C90499y;
import vc3.C78382a;

/* renamed from: com.tencent.mm.sandbox.updater.Updater */
public class Updater extends LinearLayout implements C11385n, C77623a {

    /* renamed from: o */
    public static final /* synthetic */ int f249748o = 0;

    /* renamed from: d */
    public int f249749d;

    /* renamed from: e */
    public C89779i0 f249750e = null;

    /* renamed from: f */
    public boolean f249751f;

    /* renamed from: g */
    public boolean f249752g = false;

    /* renamed from: h */
    public boolean f249753h = false;

    /* renamed from: i */
    public boolean f249754i = false;

    /* renamed from: j */
    public C11385n f249755j;

    /* renamed from: n */
    public C11385n f249756n;

    /* renamed from: com.tencent.mm.sandbox.updater.Updater$a */
    public class C85715a implements DialogInterface.OnCancelListener {

        /* renamed from: e */
        public final /* synthetic */ DialogInterface.OnCancelListener f249758e;

        public C85715a(DialogInterface.OnCancelListener onCancelListener) {
            this.f249758e = onCancelListener;
        }

        public void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnCancelListener onCancelListener;
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(99);
            C115669n.INSTANCE.idkeyStat(405, 47, 1, true);
            Updater.m105887j(2);
            Updater.this.mo119326i();
            if (!Updater.this.f249752g && (onCancelListener = this.f249758e) != null) {
                onCancelListener.onCancel(dialogInterface);
            }
        }
    }

    /* renamed from: com.tencent.mm.sandbox.updater.Updater$b */
    public class C85716b implements C75576f4.C75578b {

        /* renamed from: a */
        public final /* synthetic */ C90198a f249759a;

        /* renamed from: com.tencent.mm.sandbox.updater.Updater$b$a */
        public class C44642a implements C11385n {

            /* renamed from: d */
            public final /* synthetic */ C114770g f121052d;

            public C44642a(C114770g gVar) {
                this.f121052d = gVar;
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Map<String, String> parseXml;
                C86709a0.m107529k().f251779b.mo123470p(221, Updater.this.f249755j);
                Updater.this.f249755j = null;
                if (i == 0 && i2 == 0) {
                    C47350c cVar = ((C40373y) yVar).f108498d;
                    long j = 0;
                    if (((C49247e82) cVar.f127055a.f127080a).f132785d == 0) {
                        String str2 = ((C49393f82) cVar.f127056b.f127083a).f133352d;
                        if (!Util.isNullOrNil(str2) && (parseXml = XmlParser.parseXml(str2, "resourcecontrolinfo", (String) null)) != null) {
                            String str3 = parseXml.get(".resourcecontrolinfo.expiredtime");
                            Log.m105925i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate getDisableUpdateTime values[%s]", parseXml);
                            if (Util.getInt(parseXml.get(".resourcecontrolinfo.enableupdate"), 1) == 0) {
                                j = Util.getLong(str3, 0);
                            }
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    if (j > currentTimeMillis) {
                        Log.m105925i("MicroMsg.Updater", "summerupdate checkcontrol time[%d] > now[%d] control not auto download and ret", Long.valueOf(j), Long.valueOf(currentTimeMillis));
                        C115669n.INSTANCE.idkeyStat(405, 0, 1, true);
                        return;
                    }
                }
                Log.m105924i("MicroMsg.Updater", "summerupdate gonna start UpdaterService after checkcontrol");
                C115669n.INSTANCE.idkeyStat(405, 59, 1, true);
                Intent intent = new Intent(Updater.this.getContext(), UpdaterService.class);
                C85716b bVar = C85716b.this;
                Updater.m105886f(Updater.this, intent, this.f121052d, bVar.f249759a);
                intent.putExtra("intent_extra_run_in_foreground", true);
                intent.putExtra("intent_extra_download_mode", 2);
                C116024c.m163164d(intent, IXWebPreferences.XWEB_RENDERER_SANDBOX, true, C88144b.m109786e(IXWebPreferences.XWEB_RENDERER_SANDBOX));
            }
        }

        public C85716b(C90198a aVar) {
            this.f249759a = aVar;
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            C114770g gVar2 = gVar;
            if (gVar2 == null) {
                C115669n.INSTANCE.idkeyStat(405, 52, 1, true);
                Assert.assertTrue("updater invalid assert", false);
            }
            ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(34);
            Log.m105925i("MicroMsg.Updater", "go to update, isSilenceDownload:%s", Boolean.valueOf(Updater.this.f249753h));
            if (!C88956h.m111062c().equals("mounted")) {
                Log.m105920e("MicroMsg.Updater", "no sdcard.");
                C115669n.INSTANCE.idkeyStat(405, 53, 1, true);
                boolean unused = Updater.this.f249753h = false;
            }
            int l1 = this.f249759a.mo124439l1();
            C102189h b = C102189h.m134650b(this.f249759a.mo124440m1());
            C102189h.C90802a a = b != null ? b.mo141732a(C6666h.m6946a(Updater.this.getContext())) : null;
            if (a != null) {
                l1 += a.mo124917a();
            }
            if (!C88955f.m111059c((long) l1)) {
                Log.m105920e("MicroMsg.Updater", "no enough space.");
                C115669n.INSTANCE.idkeyStat(405, 54, 1, true);
                boolean unused2 = Updater.this.f249753h = false;
            }
            if ((ChannelUtil.updateMode & 1) != 0) {
                Log.m105924i("MicroMsg.Updater", "channel pack, not silence download.");
                C115669n.INSTANCE.idkeyStat(405, 55, 1, true);
                boolean unused3 = Updater.this.f249753h = false;
            }
            if (Updater.this.f249749d == 2 && !Updater.this.f249754i) {
                String b2 = C90499y.m113316b();
                if (C85705h.m105860d(this.f249759a.mo124438k1()) != null && !Util.isNullOrNil(b2) && b2.equals(this.f249759a.mo124438k1())) {
                    Log.m105925i("MicroMsg.Updater", "we already have this pack %s being to install, just ignore this update request", b2);
                    C115669n.INSTANCE.idkeyStat(405, 56, 1, true);
                    return;
                }
            }
            C90428oa2 j1 = this.f249759a.mo124437j1();
            if (j1 == null || j1.f259725n == 0 || Util.isNullOrNil(j1.f259726o)) {
                if (Updater.this.f249753h) {
                    Log.m105924i("MicroMsg.Updater", "summerupdate gonna start UpdaterService checkcontrol");
                    C115669n.INSTANCE.idkeyStat(405, 58, 1, true);
                    C89137b0 b3 = C86709a0.m107529k().mo121127b();
                    Updater updater = Updater.this;
                    C44642a aVar = new C44642a(gVar2);
                    C11385n unused4 = updater.f249755j = aVar;
                    b3.mo123455a(725, aVar);
                    C86709a0.m107529k().mo121127b().mo123460f(new C40373y(0));
                } else {
                    Log.m105924i("MicroMsg.Updater", "gonna start AppUpdaterUI");
                    Intent intent = new Intent(Updater.this.getContext(), AppUpdaterUI.class);
                    Updater.m105886f(Updater.this, intent, gVar2, this.f249759a);
                    Log.m105925i("MicroMsg.Updater", "current updateType : %s", Integer.valueOf(Updater.this.f249749d));
                    if (Updater.this.f249749d == 1) {
                        intent.putExtra("intent_extra_download_mode", 0);
                        C115669n.INSTANCE.idkeyStat(405, 60, 1, true);
                    } else {
                        C115669n.INSTANCE.idkeyStat(405, 61, 1, true);
                        intent.putExtra("intent_extra_download_mode", 1);
                    }
                    Context context = Updater.this.getContext();
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/sandbox/updater/Updater$3", "onSceneEnd", "(Lcom/tencent/mm/network/IDispatcher;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/sandbox/updater/Updater$3", "onSceneEnd", "(Lcom/tencent/mm/network/IDispatcher;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                if (Updater.this.f249749d != 3) {
                    ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33509r(262145, true);
                }
                C72682b.m84999a();
                return;
            }
            String str = j1.f259726o;
            Context context3 = Updater.this.getContext();
            String string = context3.getString(C0966R.string.a2_);
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setClassName(MMApplicationContext.getPackageName(), MMApplicationContext.getSourcePackageName() + "." + "plugin." + "webview" + ".ui.tools.WebViewUI");
            intent2.putExtra("rawUrl", str);
            intent2.putExtra("showShare", false);
            intent2.putExtra("show_bottom", false);
            intent2.setFlags(872415232);
            PendingIntent activity = PendingIntent.getActivity(Updater.this.getContext(), 0, intent2, 268435456);
            C90116e.C90121c d = C78382a.m94652d(Updater.this.getContext(), "reminder_channel_id");
            d.mo124390o((CharSequence) null);
            d.mo124391p(System.currentTimeMillis());
            d.mo124383h(string);
            d.mo124382g("");
            d.mo124381f(activity);
            d.mo124387l(C0966R.C0969drawable.c9k);
            Notification c = d.mo124379c();
            c.flags |= 16;
            ((NotificationManager) context3.getSystemService("notification")).notify(99, c);
            C90499y.m113320f();
            C115669n.INSTANCE.idkeyStat(405, 57, 1, true);
        }
    }

    /* renamed from: com.tencent.mm.sandbox.updater.Updater$c */
    public class C85717c implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ TextView f249761d;

        public C85717c(TextView textView) {
            this.f249761d = textView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0131  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0178  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r15, int r16, java.lang.String r17, ob0.C117747y r18) {
            /*
                r14 = this;
                r1 = r14
                f40.g r0 = f40.C86709a0.m107529k()
                ob0.b0 r0 = r0.f251779b
                r2 = 3899(0xf3b, float:5.464E-42)
                com.tencent.mm.sandbox.updater.Updater r3 = com.tencent.p014mm.sandbox.updater.Updater.this
                ob0.n r3 = r3.f249756n
                r0.mo123470p(r2, r3)
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                r2 = 0
                r0.f249755j = r2
                r2 = 2131838195(0x7f1144f3, float:1.9309606E38)
                r3 = 8
                r4 = 2131309332(0x7f093314, float:1.8236945E38)
                r5 = 0
                if (r15 != 0) goto L_0x01ea
                if (r16 != 0) goto L_0x01ea
                com.tencent.mm.network.u r0 = r18.getReqResp()
                ob0.c r0 = (ob0.C47350c) r0
                ob0.c$d r0 = r0.f127056b
                pe3.a r0 = r0.f127083a
                te3.r93 r0 = (te3.C90435r93) r0
                te3.u93 r0 = r0.f259789d
                tg3.t r6 = new tg3.t
                r6.<init>(r0)
                if (r0 == 0) goto L_0x0182
                int r0 = r0.f259855g
                r7 = 3
                if (r0 != r7) goto L_0x0182
                android.content.Intent r2 = new android.content.Intent
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                android.content.Context r0 = r0.getContext()
                java.lang.Class<com.tencent.mm.sandbox.updater.AppUpdaterUI> r3 = com.tencent.p014mm.sandbox.updater.AppUpdaterUI.class
                r2.<init>(r0, r3)
                java.lang.String r0 = r6.f260091l
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                r4 = 1
                if (r3 != 0) goto L_0x006c
                int r3 = r0.length()
                r7 = 10
                if (r3 != r7) goto L_0x006c
                java.lang.Integer r0 = java.lang.Integer.decode(r0)     // Catch:{ Exception -> 0x006e }
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x006e }
                r0 = r0 & 255(0xff, float:3.57E-43)
                if (r0 < 0) goto L_0x006c
                r3 = 31
                if (r0 > r3) goto L_0x006c
                r0 = 1
                goto L_0x0079
            L_0x006c:
                r0 = 0
                goto L_0x0079
            L_0x006e:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.String r7 = "Tinker.TinkerSyncResponse"
                java.lang.String r8 = "checkAplhVersion failed."
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r8, r3)
                goto L_0x006c
            L_0x0079:
                if (r0 == 0) goto L_0x0131
                java.lang.String r0 = r6.f260092m
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x00a1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "http://"
                r0.append(r2)
                r2 = 2131831337(0x7f112a29, float:1.9295697E38)
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.WeChatHosts.domainString(r2)
                r0.append(r2)
                java.lang.String r2 = "/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                goto L_0x00a3
            L_0x00a1:
                java.lang.String r0 = r6.f260092m
            L_0x00a3:
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r3 = "android.intent.action.VIEW"
                r2.<init>(r3)
                com.tencent.mm.sandbox.updater.Updater r3 = com.tencent.p014mm.sandbox.updater.Updater.this
                android.content.Context r3 = r3.getContext()
                java.lang.String r3 = r3.getPackageName()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getSourcePackageName()
                r6.append(r7)
                java.lang.String r7 = "."
                r6.append(r7)
                java.lang.String r7 = "plugin."
                r6.append(r7)
                java.lang.String r7 = "webview"
                r6.append(r7)
                java.lang.String r7 = ".ui.tools.WebViewUI"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r2.setClassName(r3, r6)
                java.lang.String r3 = "rawUrl"
                r2.putExtra(r3, r0)
                java.lang.String r0 = "useJs"
                r2.putExtra(r0, r4)
                java.lang.String r0 = "vertical_scroll"
                r2.putExtra(r0, r4)
                r0 = 872415232(0x34000000, float:1.1920929E-7)
                r2.setFlags(r0)
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                android.content.Context r0 = r0.getContext()
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r2)
                java.lang.Object[] r7 = r3.mo10232b()
                java.lang.String r8 = "com/tencent/mm/sandbox/updater/Updater$4"
                java.lang.String r9 = "onSceneEnd"
                java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
                java.lang.String r11 = "Undefined"
                java.lang.String r12 = "startActivity"
                java.lang.String r13 = "(Landroid/content/Intent;)V"
                r6 = r0
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r2 = r3.mo10231a(r5)
                android.content.Intent r2 = (android.content.Intent) r2
                r0.startActivity(r2)
                java.lang.String r7 = "com/tencent/mm/sandbox/updater/Updater$4"
                java.lang.String r8 = "onSceneEnd"
                java.lang.String r9 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
                java.lang.String r10 = "Undefined"
                java.lang.String r11 = "startActivity"
                java.lang.String r12 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                goto L_0x0172
            L_0x0131:
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                r0.mo119324g(r2, r6)
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                android.content.Context r0 = r0.getContext()
                k20.a r3 = new k20.a
                r3.<init>()
                r3.mo10233c(r2)
                java.lang.Object[] r7 = r3.mo10232b()
                java.lang.String r8 = "com/tencent/mm/sandbox/updater/Updater$4"
                java.lang.String r9 = "onSceneEnd"
                java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
                java.lang.String r11 = "Undefined"
                java.lang.String r12 = "startActivity"
                java.lang.String r13 = "(Landroid/content/Intent;)V"
                r6 = r0
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r2 = r3.mo10231a(r5)
                android.content.Intent r2 = (android.content.Intent) r2
                r0.startActivity(r2)
                java.lang.String r7 = "com/tencent/mm/sandbox/updater/Updater$4"
                java.lang.String r8 = "onSceneEnd"
                java.lang.String r9 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
                java.lang.String r10 = "Undefined"
                java.lang.String r11 = "startActivity"
                java.lang.String r12 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            L_0x0172:
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                qo3.i0 r0 = r0.f249750e
                if (r0 == 0) goto L_0x017b
                r0.cancel()
            L_0x017b:
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                r0.mo119326i()
                goto L_0x024f
            L_0x0182:
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                qo3.i0 r0 = r0.f249750e
                android.view.View r0 = r0.findViewById(r4)
                if (r0 == 0) goto L_0x01d4
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                qo3.i0 r0 = r0.f249750e
                android.view.View r0 = r0.findViewById(r4)
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4.mo10233c(r3)
                java.lang.Object[] r7 = r4.mo10232b()
                java.lang.String r8 = "com/tencent/mm/sandbox/updater/Updater$4"
                java.lang.String r9 = "onSceneEnd"
                java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r0
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r3 = r4.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r0.setVisibility(r3)
                java.lang.String r7 = "com/tencent/mm/sandbox/updater/Updater$4"
                java.lang.String r8 = "onSceneEnd"
                java.lang.String r9 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            L_0x01d4:
                android.widget.TextView r0 = r1.f249761d
                if (r0 == 0) goto L_0x024f
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 405(0x195, double:2.0E-321)
                r6 = 63
                r8 = 1
                r10 = 1
                r3.idkeyStat(r4, r6, r8, r10)
                android.widget.TextView r0 = r1.f249761d
                r0.setText(r2)
                goto L_0x024f
            L_0x01ea:
                qo3.i0 r0 = r0.f249750e
                android.view.View r0 = r0.findViewById(r4)
                if (r0 == 0) goto L_0x023a
                com.tencent.mm.sandbox.updater.Updater r0 = com.tencent.p014mm.sandbox.updater.Updater.this
                qo3.i0 r0 = r0.f249750e
                android.view.View r0 = r0.findViewById(r4)
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r4.mo10233c(r3)
                java.lang.Object[] r7 = r4.mo10232b()
                java.lang.String r8 = "com/tencent/mm/sandbox/updater/Updater$4"
                java.lang.String r9 = "onSceneEnd"
                java.lang.String r10 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r0
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r3 = r4.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r0.setVisibility(r3)
                java.lang.String r7 = "com/tencent/mm/sandbox/updater/Updater$4"
                java.lang.String r8 = "onSceneEnd"
                java.lang.String r9 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            L_0x023a:
                android.widget.TextView r0 = r1.f249761d
                if (r0 == 0) goto L_0x024f
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 405(0x195, double:2.0E-321)
                r6 = 63
                r8 = 1
                r10 = 1
                r3.idkeyStat(r4, r6, r8, r10)
                android.widget.TextView r0 = r1.f249761d
                r0.setText(r2)
            L_0x024f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sandbox.updater.Updater.C85717c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    public Updater(Context context) {
        super(context);
    }

    /* renamed from: f */
    public static void m105886f(Updater updater, Intent intent, C114770g gVar, C90198a aVar) {
        intent.putExtra("intent_short_ips", updater.getShortIps());
        intent.putExtra("intent_client_version", C89625d.f257841g);
        intent.putExtra("intent_extra_session", gVar.mo55443A3().mo55421S(1));
        intent.putExtra("intent_extra_cookie", gVar.mo55443A3().getCookie());
        intent.putExtra("intent_extra_ecdhkey", gVar.mo55443A3().mo55415D());
        intent.putExtra("intent_extra_uin", gVar.mo55443A3().getUin());
        intent.putExtra("intent_update_type", updater.f249749d);
        intent.putExtra("intent_extra_desc", ((C90428oa2) aVar.f258964d.f127056b.f127083a).f259721g);
        intent.putExtra("intent_extra_md5", aVar.mo124438k1());
        intent.putExtra("intent_extra_size", aVar.mo124439l1());
        C90428oa2 oa22 = (C90428oa2) aVar.f258964d.f127056b.f127083a;
        int size = oa22.f259723i.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = oa22.f259723i.get(i).f141175d;
        }
        intent.putExtra("intent_extra_download_url", strArr);
        intent.putExtra("intent_extra_patchInfo", aVar.mo124440m1());
        intent.putExtra("intent_extra_updateMode", ChannelUtil.updateMode);
        intent.putExtra("intent_extra_marketUrl", ChannelUtil.marketURL);
        String nullAsNil = Util.nullAsNil(C48374j0.m53717f(((C90428oa2) aVar.f258964d.f127056b.f127083a).f259728q));
        Log.m105919d("MicroMsg.NetSceneGetUpdateInfo", "summerupdate extInfo[%s], stack[%s]", nullAsNil, Util.getStack());
        intent.putExtra("intent_extra_extinfo", nullAsNil);
    }

    private String[] getShortIps() {
        String str = C90188n0.f258939g;
        if (str == null || str.length() <= 0) {
            String string = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
            if (string == null || string.length() <= 0) {
                string = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
            }
            LinkedList linkedList = (LinkedList) C89623b0.m112055d(string);
            String[] strArr = new String[linkedList.size()];
            for (int i = 0; i < linkedList.size(); i++) {
                strArr[i] = ((C89623b0) linkedList.get(i)).f257830c;
            }
            return strArr;
        }
        return new String[]{C90188n0.f258939g};
    }

    /* renamed from: j */
    public static void m105887j(int i) {
        if (C86709a0.m107522a()) {
            Log.m105918d("MicroMsg.Updater", "reportUpdateStat : opCode = " + i);
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C48632o(i));
        }
    }

    /* renamed from: k */
    public static Updater m105888k(Context context, int i, DialogInterface.OnCancelListener onCancelListener) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.getWindow() == null) {
                Log.m105920e("MicroMsg.Updater", "showWithProgress, context isFinishing");
                return null;
            }
        }
        MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", Util.nowSecond()).commit();
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(34);
        Log.m105924i("MicroMsg.Updater", "showWithProgress");
        Updater updater = (Updater) View.inflate(context, C0966R.C0971layout.f360040cb1, (ViewGroup) null);
        updater.mo119325h();
        C89779i0 c = C89779i0.m112246c(context, context.getString(C0966R.string.f361479k71), true, 0, (DialogInterface.OnCancelListener) null);
        c.setCancelable(true);
        c.setOnCancelListener(new C85715a(onCancelListener));
        try {
            updater.f249750e = c;
            c.show();
            updater.f249751f = true;
            C115669n.INSTANCE.idkeyStat(405, 46, 1, true);
            return updater;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Updater", "exception in showWithProgress, ", e.getMessage());
            Log.printErrStackTrace("MicroMsg.Updater", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    public void mo119324g(Intent intent, C90493t tVar) {
        HashMap<Integer, LinkedList<C52049y03>> hashMap;
        LinkedList linkedList;
        if (tVar != null) {
            intent.putExtra("intent_short_ips", getShortIps());
            intent.putExtra("intent_client_version", C89625d.f257841g);
            intent.putExtra("intent_update_type", 3);
            HashMap<Integer, LinkedList<C52049y03>> hashMap2 = tVar.f260081b;
            String str = "";
            if ((hashMap2 != null && !hashMap2.isEmpty() && tVar.f260081b.containsKey(4)) && (hashMap = tVar.f260081b) != null && !hashMap.isEmpty() && (linkedList = hashMap.get(4)) != null && !linkedList.isEmpty()) {
                int size = linkedList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C52049y03 y032 = (C52049y03) linkedList.get(i);
                    if (y032.f145065d.equalsIgnoreCase("default")) {
                        str = new String(Base64.decode(y032.f145066e, 0));
                    } else if (y032.f145065d.equalsIgnoreCase(LocaleUtil.getApplicationLanguage())) {
                        str = new String(Base64.decode(y032.f145066e, 0));
                        break;
                    }
                    i++;
                }
            }
            intent.putExtra("intent_extra_desc", str);
            intent.putExtra("intent_extra_md5", tVar.f260085f);
            intent.putExtra("intent_extra_size", tVar.f260087h);
            intent.putExtra("intent_extra_download_url", new String[]{tVar.f260084e});
            String str2 = tVar.f260084e;
            String substring = str2.substring(0, str2.lastIndexOf(47) + 1);
            String str3 = tVar.f260084e;
            String substring2 = str3.substring(str3.lastIndexOf(47) + 1);
            C102189h hVar = new C102189h(substring, Integer.valueOf(tVar.f260090k).intValue());
            String str4 = tVar.f260089j;
            ((HashMap) hVar.f300887b).put(str4, new C102189h.C90802a(str4, tVar.f260088i, tVar.f260085f, substring2, tVar.f260087h));
            intent.putExtra("intent_extra_patchInfo", hVar.mo141733c());
            intent.putExtra("intent_extra_updateMode", ChannelUtil.updateMode);
            intent.putExtra("intent_extra_marketUrl", ChannelUtil.marketURL);
            intent.putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
            intent.putExtra("intent_extra_tinker_patch", true);
            intent.putExtra("intent_extra_download_mode", 1);
            return;
        }
        Log.m105928w("MicroMsg.Updater", "tinker sync response is empty.");
    }

    /* renamed from: h */
    public void mo119325h() {
        C86709a0.m107529k().f251779b.mo123455a(11, this);
        C115669n.INSTANCE.idkeyStat(405, 42, 1, true);
    }

    /* renamed from: i */
    public void mo119326i() {
        C115669n.INSTANCE.idkeyStat(405, 43, 1, true);
        C86709a0.m107529k().f251779b.mo123470p(11, this);
    }

    /* renamed from: l */
    public void mo119327l(int i, boolean z) {
        Log.m105924i("MicroMsg.Updater", "summerupdate begin update routine, type=" + i);
        this.f249749d = i;
        this.f249754i = z;
        C115669n.INSTANCE.idkeyStat(405, 44, 1, true);
        C86709a0.m107529k().f251779b.mo123460f(new C90198a(i));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var;
        if (i == 0 && i2 == 0) {
            C115669n.INSTANCE.idkeyStat(405, 51, 1, true);
            Log.m105924i("MicroMsg.Updater", "isShow " + this.f249751f);
            if (!this.f249751f && (i0Var = this.f249750e) != null) {
                i0Var.show();
            }
            this.f249752g = true;
            C89779i0 i0Var2 = this.f249750e;
            if (i0Var2 != null) {
                i0Var2.cancel();
            }
            C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C85716b((C90198a) yVar), (String) null));
            mo119326i();
            return;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(405, 62, 1, true);
        C89779i0 i0Var3 = this.f249750e;
        if (i0Var3 != null) {
            ProgressBar progressBar = i0Var3.f258147e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = (TextView) this.f249750e.findViewById(C0966R.C0970id.gvj);
            if (i == 4 && i2 == -18) {
                new CheckTinkerUpdateEvent().publish();
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                C85717c cVar = new C85717c(textView);
                this.f249756n = cVar;
                b0Var.mo123455a(3899, cVar);
            } else if (textView != null) {
                nVar.idkeyStat(405, 64, 1, true);
                textView.setText(C0966R.string.k6w);
                ((C76979h) C86312j.m106911c(C76979h.class)).mo107079pD(textView, 1);
            }
        }
        C90499y.m113321g();
        C86709a0.m107529k().f251779b.mo123470p(11, this);
    }

    public Updater(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
