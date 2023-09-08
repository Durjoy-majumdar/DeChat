package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c30.C104289g;
import c30.C79923f;
import ck3.C67391b;
import com.google.android.flexbox.FlexboxLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OnWxaOptionsChangedEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.BrandTmplExposeReportStruct;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.C73326c2;
import com.tencent.p014mm.p136ui.chatting.C73679e2;
import com.tencent.p014mm.p136ui.chatting.C73839r2;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.chatting.view.FoldableCellLayout;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.XWebFeature;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C97625j3;
import f12.C7970a;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import gw0.C76073b;
import gy3.C87412m;
import hc0.C20937c;
import ht1.C60200t1;
import ie3.C76328d;
import j20.C117292a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kb0.C46664n;
import ke3.C88144b;
import kg3.C76577a;
import kj2.C117407d;
import kr0.C76629w0;
import kr0.C76630x0;
import lo2.C99516a;
import lp3.C88629c;
import lp3.C88633e;
import lp3.C88643g;
import mp3.C88819d;
import mp3.C88825i;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76879j;
import nj3.C76891l0;
import nj3.C76912y0;
import o40.C61926c;
import p196ln.C76705f;
import p206nj.C11171e;
import p248ug.C52558c;
import p270xi.C66282i;
import p270xi.C78839k;
import p287zz.C16418h;
import p565ir.C60603k;
import p565ir.C60606n;
import p629ny.C76979h;
import p910lj.C76701a;
import qe3.C89625d;
import qo3.C77407n;
import qo3.C89779i0;
import rb0.C47984k;
import rd0.C22222c;
import rd0.C48018e;
import te3.jy4;
import te3.ky4;
import uo3.C78253a;
import v90.C78374b;
import wd0.C22894a;
import zj3.C79357g;
import zj3.C79375p;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate */
public final class ChattingItemDyeingTemplate extends C74023i {

    /* renamed from: Q0 */
    public static Integer f216835Q0 = null;

    /* renamed from: R0 */
    public static Integer f216836R0 = null;

    /* renamed from: S0 */
    public static Integer f216837S0 = null;

    /* renamed from: T0 */
    public static int f216838T0 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3288ma);

    /* renamed from: U0 */
    public static int f216839U0 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3288ma);

    /* renamed from: y0 */
    public static final String f216840y0 = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/infringement?from=8&username=%s&template_id=%s&template_msg_id=%s1&screenshot_localId=%s#wechat_redirect");

    /* renamed from: A */
    public View.OnClickListener f216841A;

    /* renamed from: B */
    public View.OnClickListener f216842B;

    /* renamed from: C */
    public View.OnClickListener f216843C;

    /* renamed from: D */
    public IListener<OnWxaOptionsChangedEvent> f216844D;

    /* renamed from: E */
    public C78839k f216845E;

    /* renamed from: F */
    public View.OnClickListener f216846F;

    /* renamed from: G */
    public C20937c f216847G;

    /* renamed from: H */
    public C22222c.C22225c f216848H = new C22222c.C22225c(true, false);

    /* renamed from: I */
    public String f216849I;

    /* renamed from: J */
    public String f216850J;

    /* renamed from: K */
    public int f216851K;

    /* renamed from: L */
    public C22222c f216852L;

    /* renamed from: M */
    public C22222c f216853M;

    /* renamed from: N */
    public String f216854N = "";

    /* renamed from: P */
    public int f216855P = -1;

    /* renamed from: Q */
    public boolean f216856Q = false;

    /* renamed from: R */
    public boolean f216857R = false;

    /* renamed from: S */
    public int f216858S = -1;

    /* renamed from: T */
    public int f216859T = -1;

    /* renamed from: U */
    public int f216860U = 0;

    /* renamed from: V */
    public boolean f216861V = false;

    /* renamed from: W */
    public C22894a.C22897b f216862W = new C22894a.C22897b();

    /* renamed from: X */
    public C77407n f216863X = null;

    /* renamed from: Y */
    public boolean f216864Y = false;

    /* renamed from: Z */
    public C89779i0 f216865Z;

    /* renamed from: p0 */
    public C73909s f216866p0;

    /* renamed from: v */
    public C67391b f216867v;

    /* renamed from: w */
    public C89779i0 f216868w;

    /* renamed from: x */
    public View.OnClickListener f216869x;

    /* renamed from: x0 */
    public C73910t f216870x0;

    /* renamed from: y */
    public C73904p f216871y;

    /* renamed from: z */
    public View.OnClickListener f216872z;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$a */
    public class C73888a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C67391b f216874d;

        /* renamed from: e */
        public final /* synthetic */ String f216875e;

        /* renamed from: f */
        public final /* synthetic */ C72963f4 f216876f;

        public C73888a(C67391b bVar, String str, C72963f4 f4Var) {
            this.f216874d = bVar;
            this.f216875e = str;
            this.f216876f = f4Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = ChattingItemDyeingTemplate.this;
            C67391b bVar = this.f216874d;
            if (chattingItemDyeingTemplate.f217202i == null) {
                chattingItemDyeingTemplate.f217202i = new C73326c2(bVar);
            }
            C73326c2 c2Var = chattingItemDyeingTemplate.f217202i;
            if (c2Var != null) {
                c2Var.onClick(view);
            }
            ChattingItemDyeingTemplate.this.mo102969W0(10, this.f216874d.mo91577r(), this.f216875e);
            ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 4, this.f216876f);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$b */
    public class C73889b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f216878d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f216879e;

        public C73889b(String str, C72963f4 f4Var) {
            this.f216878d = str;
            this.f216879e = f4Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = ChattingItemDyeingTemplate.this;
            C73839r2 z = chattingItemDyeingTemplate.mo103103z(chattingItemDyeingTemplate.f216867v);
            if (z != null) {
                z.onClick(view);
            }
            ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = ChattingItemDyeingTemplate.this;
            if (chattingItemDyeingTemplate2.f216864Y) {
                ChattingItemDyeingTemplate.m87576o0(chattingItemDyeingTemplate2, 8, this.f216878d, 2, 0);
            }
            ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 6, this.f216879e);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$c */
    public class C73890c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f216881d;

        /* renamed from: e */
        public final /* synthetic */ String f216882e;

        /* renamed from: f */
        public final /* synthetic */ Map f216883f;

        public C73890c(C72963f4 f4Var, String str, Map map) {
            this.f216881d = f4Var;
            this.f216882e = str;
            this.f216883f = map;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = ChattingItemDyeingTemplate.this;
            C73839r2 z = chattingItemDyeingTemplate.mo103103z(chattingItemDyeingTemplate.f216867v);
            if (z != null) {
                z.onClick(view);
            }
            ChattingItemDyeingTemplate.this.mo102969W0(2, this.f216881d.mo108768t(), this.f216882e);
            ChattingItemDyeingTemplate.m87576o0(ChattingItemDyeingTemplate.this, 8, this.f216882e, 2, 0);
            ChattingItemDyeingTemplate.this.mo102966T0(4, this.f216883f, "");
            ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 6, this.f216881d);
            ChattingItemDyeingTemplate.m87587z0(ChattingItemDyeingTemplate.this, (C74243t8) view.getTag(), this.f216883f);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$d */
    public class C73891d implements View.OnClickListener {
        public C73891d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C74243t8 t8Var = (C74243t8) view.getTag();
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "on header (%s) name click", t8Var.f217968b);
            Map<String, String> parseXml = XmlParser.parseXml(t8Var.f212238a.getContent(), "msg", (String) null);
            String nullAsNil = Util.nullAsNil(parseXml.get(".msg.fromusername"));
            C115669n.INSTANCE.mo160131h(11608, ChattingItemDyeingTemplate.this.f216849I, nullAsNil, 66666);
            String nullAsNil2 = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_header.weapp_username"));
            if (Util.isNullOrNil(nullAsNil2)) {
                String nullAsNil3 = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_header.header_jump_url"));
                if (!Util.isNullOrNil(nullAsNil3)) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", nullAsNil3);
                    intent.putExtra("key_enable_teen_mode_check", true);
                    C74023i.m87881c(intent, ChattingItemDyeingTemplate.this.f216867v.mo91577r());
                    C88144b.m109791i(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            } else {
                String nullAsNil4 = Util.nullAsNil(parseXml.get(".msg.appmsg.mmreader.template_header.weapp_path"));
                int i = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_header.weapp_state"), 0);
                int i2 = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_header.weapp_version"), 0);
                String nullAsNil5 = Util.nullAsNil(parseXml.get(".msg.appmsg.template_id"));
                AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                appBrandStatObject.f245534g = t8Var.f212238a.mo108774y2() + XVFSFile.PATH_SEPARATOR + t8Var.f217968b + XVFSFile.PATH_SEPARATOR + ChattingItemDyeingTemplate.this.f216867v.mo91577r() + XVFSFile.PATH_SEPARATOR + nullAsNil5;
                appBrandStatObject.f245533f = ChattingItemDyeingTemplate.m87584w0(nullAsNil5);
                ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), nullAsNil2, (String) null, i, i2, nullAsNil4, appBrandStatObject);
            }
            ChattingItemDyeingTemplate.m87587z0(ChattingItemDyeingTemplate.this, t8Var, parseXml);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$e */
    public class C73892e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f216886d;

        /* renamed from: e */
        public final /* synthetic */ Map f216887e;

        public C73892e(String str, Map map) {
            this.f216886d = str;
            this.f216887e = map;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83758E5(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), this.f216886d, 16, C16418h.m15245a(2));
            ChattingItemDyeingTemplate.this.mo102966T0(2, this.f216887e, "");
            ChattingItemDyeingTemplate.m87587z0(ChattingItemDyeingTemplate.this, (C74243t8) view.getTag(), this.f216887e);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$f */
    public class C73893f implements View.OnClickListener {
        public C73893f() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0075  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r9) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r8
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                java.lang.Object r0 = r9.getTag()
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r0
                com.tencent.mm.storage.f4 r1 = r0.f212238a
                java.lang.String r1 = r1.getContent()
                java.lang.String r2 = "msg"
                r3 = 0
                java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r2, r3)
                r2 = 0
                if (r1 == 0) goto L_0x005d
                int r4 = r1.size()
                if (r4 == 0) goto L_0x005d
                java.lang.String r4 = ".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"
                java.lang.Object r4 = r1.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r2)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r4 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                java.lang.String r5 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.f216840y0
                int r5 = r4.mo102962O0(r1)
                boolean r4 = r4.mo102964Q0(r5)
                if (r4 == 0) goto L_0x005d
                java.lang.String r4 = ".msg.appmsg.mmreader.template_detail.template_ext.block"
                java.lang.Object r4 = r1.get(r4)
                java.lang.String r4 = (java.lang.String) r4
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r4, r2)
                goto L_0x005e
            L_0x005d:
                r4 = 0
            L_0x005e:
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = r0.f217968b
                r5[r2] = r6
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
                r6 = 1
                r5[r6] = r2
                java.lang.String r2 = "MicroMsg.ChattingItemDyeingTemplate"
                java.lang.String r7 = "on app brand(%s) name click, blockProfile: %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r5)
                if (r4 != 0) goto L_0x00d9
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r2 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                r9.getContext()
                java.lang.String r9 = r0.f217968b
                java.lang.String r4 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.f216840y0
                r2.getClass()
                java.lang.Class<kr0.w0> r4 = kr0.C76629w0.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                kr0.w0 r4 = (kr0.C76629w0) r4
                com.tencent.mm.plugin.appbrand.config.WxaAttributes r4 = r4.mo106879N2(r9)
                if (r4 == 0) goto L_0x0096
                java.lang.String r5 = r4.field_appId
                java.lang.String r7 = r2.f216849I
                r2.mo102950C0(r6, r5, r7)
            L_0x0096:
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                java.lang.String r6 = "key_username"
                r5.putExtra(r6, r9)
                r9 = 5
                java.lang.String r6 = "key_from_scene"
                r5.putExtra(r6, r9)
                if (r4 == 0) goto L_0x00bd
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b r9 = new com.tencent.mm.plugin.appbrand.config.WxaExposedParams$b
                r9.<init>()
                java.lang.String r4 = r4.field_appId
                r9.f239557a = r4
                r4 = 6
                r9.f239566j = r4
                com.tencent.mm.plugin.appbrand.config.WxaExposedParams r9 = r9.mo113977a()
                java.lang.String r4 = "key_scene_exposed_params"
                r5.putExtra(r4, r9)
            L_0x00bd:
                ck3.b r9 = r2.f216867v
                android.app.Activity r9 = r9.mo91565f()
                java.lang.String r2 = "appbrand"
                java.lang.String r4 = ".ui.AppBrandProfileUI"
                ke3.C88144b.m109791i(r9, r2, r4, r5, r3)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r9 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                r2 = 10
                ck3.b r3 = r9.f216867v
                java.lang.String r3 = r3.mo91577r()
                java.lang.String r4 = r0.f217968b
                r9.mo102969W0(r2, r3, r4)
            L_0x00d9:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r9 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                r2 = 4
                com.tencent.mm.storage.f4 r3 = r0.f212238a
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87574A0(r9, r2, r3)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r9 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87587z0(r9, r0, r1)
                java.lang.String r9 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r8, r9, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.C73893f.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$g */
    public class C73894g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f216890d;

        /* renamed from: e */
        public final /* synthetic */ String f216891e;

        /* renamed from: f */
        public final /* synthetic */ int f216892f;

        /* renamed from: g */
        public final /* synthetic */ int f216893g;

        /* renamed from: h */
        public final /* synthetic */ String f216894h;

        /* renamed from: i */
        public final /* synthetic */ String f216895i;

        public C73894g(String str, String str2, int i, int i2, String str3, String str4) {
            this.f216890d = str;
            this.f216891e = str2;
            this.f216892f = i;
            this.f216893g = i2;
            this.f216894h = str3;
            this.f216895i = str4;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C74243t8 t8Var = (C74243t8) view.getTag();
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) button1 click", this.f216890d);
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245534g = t8Var.f212238a.mo108774y2() + XVFSFile.PATH_SEPARATOR + t8Var.f217968b + XVFSFile.PATH_SEPARATOR + ChattingItemDyeingTemplate.this.f216867v.mo91577r() + XVFSFile.PATH_SEPARATOR + this.f216891e;
            if (((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(t8Var.f217968b)) {
                appBrandStatObject.f245533f = ChattingItemDyeingTemplate.m87584w0(this.f216891e);
                ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), this.f216890d, (String) null, this.f216892f, this.f216893g, this.f216894h, appBrandStatObject);
            } else {
                appBrandStatObject.f245533f = XWebFeature.INTERFACE_CONFIGURE_V8_LITE;
                ChattingItemDyeingTemplate.m87577p0(ChattingItemDyeingTemplate.this, t8Var.f217968b, this.f216890d, this.f216892f, this.f216893g, this.f216894h, appBrandStatObject);
            }
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = ChattingItemDyeingTemplate.this;
            chattingItemDyeingTemplate.mo102950C0(9, chattingItemDyeingTemplate.f216850J, chattingItemDyeingTemplate.f216849I);
            C115669n.INSTANCE.mo160131h(11608, ChattingItemDyeingTemplate.this.f216849I, this.f216895i, 1);
            ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 7, t8Var.f212238a);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$h */
    public class C73895h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f216897d;

        /* renamed from: e */
        public final /* synthetic */ String f216898e;

        public C73895h(String str, String str2) {
            this.f216897d = str;
            this.f216898e = str2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(this.f216897d)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f216897d);
                intent.putExtra("geta8key_username", this.f216898e);
                intent.putExtra("key_enable_teen_mode_check", true);
                C74023i.m87881c(intent, ChattingItemDyeingTemplate.this.f216867v.mo91577r());
                C88144b.m109791i(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C115669n.INSTANCE.mo160131h(11608, ChattingItemDyeingTemplate.this.f216849I, this.f216898e, 1);
                ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 7, ((C74243t8) view.getTag()).f212238a);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$40", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$i */
    public class C73896i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f216900d;

        /* renamed from: e */
        public final /* synthetic */ String f216901e;

        /* renamed from: f */
        public final /* synthetic */ int f216902f;

        /* renamed from: g */
        public final /* synthetic */ int f216903g;

        /* renamed from: h */
        public final /* synthetic */ String f216904h;

        /* renamed from: i */
        public final /* synthetic */ String f216905i;

        public C73896i(String str, String str2, int i, int i2, String str3, String str4) {
            this.f216900d = str;
            this.f216901e = str2;
            this.f216902f = i;
            this.f216903g = i2;
            this.f216904h = str3;
            this.f216905i = str4;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C74243t8 t8Var = (C74243t8) view.getTag();
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) button1 click", this.f216900d);
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245534g = t8Var.f212238a.mo108774y2() + XVFSFile.PATH_SEPARATOR + t8Var.f217968b + XVFSFile.PATH_SEPARATOR + ChattingItemDyeingTemplate.this.f216867v.mo91577r() + XVFSFile.PATH_SEPARATOR + this.f216901e;
            if (((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(t8Var.f217968b)) {
                appBrandStatObject.f245533f = ChattingItemDyeingTemplate.m87584w0(this.f216901e);
                ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), this.f216900d, (String) null, this.f216902f, this.f216903g, this.f216904h, appBrandStatObject);
            } else {
                appBrandStatObject.f245533f = XWebFeature.INTERFACE_CONFIGURE_V8_LITE;
                ChattingItemDyeingTemplate.m87577p0(ChattingItemDyeingTemplate.this, t8Var.f217968b, this.f216900d, this.f216902f, this.f216903g, this.f216904h, appBrandStatObject);
            }
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = ChattingItemDyeingTemplate.this;
            chattingItemDyeingTemplate.mo102950C0(9, chattingItemDyeingTemplate.f216850J, chattingItemDyeingTemplate.f216849I);
            C115669n.INSTANCE.mo160131h(11608, ChattingItemDyeingTemplate.this.f216849I, this.f216905i, 2);
            ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 7, t8Var.f212238a);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$j */
    public class C73897j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f216907d;

        /* renamed from: e */
        public final /* synthetic */ String f216908e;

        public C73897j(String str, String str2) {
            this.f216907d = str;
            this.f216908e = str2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(this.f216907d)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", this.f216907d);
                intent.putExtra("key_enable_teen_mode_check", true);
                C74023i.m87881c(intent, ChattingItemDyeingTemplate.this.f216867v.mo91577r());
                C88144b.m109791i(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C115669n.INSTANCE.mo160131h(11608, ChattingItemDyeingTemplate.this.f216849I, this.f216908e, 2);
                ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 7, ((C74243t8) view.getTag()).f212238a);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$k */
    public class C73898k implements C76629w0.C61144a {

        /* renamed from: a */
        public final /* synthetic */ C74307x8 f216910a;

        /* renamed from: b */
        public final /* synthetic */ String f216911b;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$k$a */
        public class C73899a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f216913d;

            /* renamed from: e */
            public final /* synthetic */ String f216914e;

            public C73899a(String str, String str2) {
                this.f216913d = str;
                this.f216914e = str2;
            }

            public void run() {
                C20828a b = C20828a.m22825b();
                String str = this.f216913d;
                C73898k kVar = C73898k.this;
                b.mo32519h(str, kVar.f216910a.f218246J, ChattingItemDyeingTemplate.this.f216847G);
                C73898k.this.f216910a.f218247K.setText(TextUtils.isEmpty(this.f216914e) ? C73898k.this.f216911b : this.f216914e);
            }
        }

        public C73898k(C74307x8 x8Var, String str) {
            this.f216910a = x8Var;
            this.f216911b = str;
        }

        /* renamed from: a */
        public void mo21208a(WxaAttributes wxaAttributes) {
            if (wxaAttributes != null) {
                MMHandlerThread.postToMainThread(new C73899a(wxaAttributes.field_brandIconURL, wxaAttributes.field_nickname));
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$l */
    public class C73900l implements C78839k {
        public C73900l() {
        }

        /* renamed from: F4 */
        public void mo26186F4() {
        }

        /* renamed from: G4 */
        public void mo26160G4() {
        }

        /* renamed from: O4 */
        public void mo26162O4() {
        }

        /* renamed from: e */
        public void mo70065e() {
        }

        /* renamed from: g5 */
        public void mo70046g5() {
        }

        /* renamed from: n2 */
        public void mo26199n2() {
        }

        /* renamed from: u5 */
        public void mo26170u5() {
            Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "onChattingExitAnimStart, then remove AppBrandTmplMsgReceivingSwitchListener.");
            ChattingItemDyeingTemplate.this.f216844D.dead();
            C67391b bVar = ChattingItemDyeingTemplate.this.f216867v;
            if (bVar != null) {
                ((C66282i) bVar.f193278b.mo102812a(C66282i.class)).mo90406z0(this);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$m */
    public class C73901m implements View.OnClickListener {
        public C73901m() {
        }

        public void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C74243t8 t8Var = (C74243t8) view.getTag();
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "on app brand(%s) container click", t8Var.f217968b);
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9526a = t8Var.f217968b;
            aVar.f9527b = t8Var.f217952D;
            Map<String, String> parseXml = XmlParser.parseXml(t8Var.f212238a.getContent(), "msg", (String) null);
            if (parseXml == null || parseXml.size() <= 0) {
                str = "";
            } else {
                startAppBrandUIFromOuterEvent.f9522d.f9528c = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.template_ext.we_app_state"), 0);
                str = Util.nullAsNil(parseXml.get(".msg.appmsg.template_id"));
            }
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9538m = true;
            aVar2.f9529d = ChattingItemDyeingTemplate.m87584w0(str);
            StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
            aVar3.f9530e = t8Var.f212238a.mo108774y2() + XVFSFile.PATH_SEPARATOR + t8Var.f217968b + XVFSFile.PATH_SEPARATOR + ChattingItemDyeingTemplate.this.f216867v.mo91577r() + XVFSFile.PATH_SEPARATOR + str;
            startAppBrandUIFromOuterEvent.publish();
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = ChattingItemDyeingTemplate.this;
            chattingItemDyeingTemplate.mo102950C0(9, chattingItemDyeingTemplate.f216850J, chattingItemDyeingTemplate.f216849I);
            C115669n.INSTANCE.mo160131h(11608, ChattingItemDyeingTemplate.this.f216849I, t8Var.f217968b, 0);
            ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = ChattingItemDyeingTemplate.this;
            chattingItemDyeingTemplate2.mo102969W0(2, chattingItemDyeingTemplate2.f216867v.mo91577r(), t8Var.f217968b);
            ChattingItemDyeingTemplate.m87576o0(ChattingItemDyeingTemplate.this, 8, t8Var.f217968b, 1, 0);
            ChattingItemDyeingTemplate.this.mo102966T0(4, parseXml, "");
            ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 6, t8Var.f212238a);
            ChattingItemDyeingTemplate.m87587z0(ChattingItemDyeingTemplate.this, t8Var, parseXml);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$n */
    public class C73902n implements View.OnClickListener {
        public C73902n() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0188  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r22) {
            /*
                r21 = this;
                r6 = r21
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r7 = r22
                r0.add(r7)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$6"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r21
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.Object r0 = r22.getTag()
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r0
                com.tencent.mm.storage.f4 r1 = r0.f212238a
                java.lang.String r1 = r1.getContent()
                r2 = 0
                java.lang.String r3 = "msg"
                java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r3, r2)
                java.lang.String r2 = "(Landroid/view/View;)V"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "android/view/View$OnClickListener"
                java.lang.String r5 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$6"
                java.lang.String r8 = "MicroMsg.ChattingItemDyeingTemplate"
                if (r1 != 0) goto L_0x0049
                java.lang.String r0 = "values map is null."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
                j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                return
            L_0x0049:
                java.lang.String r9 = ".msg.appmsg.mmreader.category.item.template_op_type"
                java.lang.Object r9 = r1.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                r10 = -1
                int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r10)
                r11 = 1
                r12 = 0
                if (r9 != r11) goto L_0x0149
                java.lang.String r7 = ".msg.appmsg.mmreader.category.item.weapp_username"
                java.lang.Object r7 = r1.get(r7)
                r15 = r7
                java.lang.String r15 = (java.lang.String) r15
                java.lang.String r7 = ".msg.appmsg.mmreader.category.item.weapp_path"
                java.lang.Object r7 = r1.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r13 = ".msg.appmsg.mmreader.category.item.weapp_version"
                java.lang.Object r13 = r1.get(r13)
                java.lang.String r13 = (java.lang.String) r13
                int r18 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r12)
                java.lang.String r13 = ".msg.appmsg.mmreader.category.item.weapp_state"
                java.lang.Object r13 = r1.get(r13)
                java.lang.String r13 = (java.lang.String) r13
                int r17 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r13, (int) r12)
                java.lang.String r13 = ".msg.appmsg.template_id"
                java.lang.Object r13 = r1.get(r13)
                java.lang.String r13 = (java.lang.String) r13
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
                java.lang.Object[] r14 = new java.lang.Object[r11]
                r14[r12] = r15
                java.lang.String r10 = "on app brand(%s) container click"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r14)
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r8 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject
                r8.<init>()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                com.tencent.mm.storage.f4 r14 = r0.f212238a
                long r11 = r14.mo108774y2()
                r10.append(r11)
                java.lang.String r11 = ":"
                r10.append(r11)
                java.lang.String r12 = r0.f217968b
                r10.append(r12)
                r10.append(r11)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r12 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                ck3.b r12 = r12.f216867v
                java.lang.String r12 = r12.mo91577r()
                r10.append(r12)
                r10.append(r11)
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                r8.f245534g = r10
                java.lang.Class<gw0.b> r10 = gw0.C76073b.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                gw0.b r10 = (gw0.C76073b) r10
                java.lang.String r11 = r0.f217968b
                boolean r10 = r10.mo94598h0(r11)
                if (r10 == 0) goto L_0x0100
                int r10 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87584w0(r13)
                r8.f245533f = r10
                java.lang.Class<kr0.x0> r10 = kr0.C76630x0.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                r13 = r10
                kr0.x0 r13 = (kr0.C76630x0) r13
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r10 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                ck3.b r10 = r10.f216867v
                android.app.Activity r14 = r10.mo91565f()
                r16 = 0
                r19 = r7
                r20 = r8
                r13.Ko0(r14, r15, r16, r17, r18, r19, r20)
                goto L_0x0113
            L_0x0100:
                r10 = 1043(0x413, float:1.462E-42)
                r8.f245533f = r10
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r13 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                java.lang.String r14 = r0.f217968b
                r16 = r17
                r17 = r18
                r18 = r7
                r19 = r8
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87577p0(r13, r14, r15, r16, r17, r18, r19)
            L_0x0113:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r7 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                r8 = 9
                java.lang.String r10 = r7.f216850J
                java.lang.String r11 = r7.f216849I
                r7.mo102950C0(r8, r10, r11)
                com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r8 = 11608(0x2d58, float:1.6266E-41)
                r10 = 3
                java.lang.Object[] r10 = new java.lang.Object[r10]
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r11 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                java.lang.String r11 = r11.f216849I
                r12 = 0
                r10[r12] = r11
                java.lang.String r11 = r0.f217968b
                r13 = 1
                r10[r13] = r11
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                r12 = 2
                r10[r12] = r11
                r7.mo160131h(r8, r10)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r7 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                ck3.b r8 = r7.f216867v
                java.lang.String r8 = r8.mo91577r()
                java.lang.String r10 = r0.f217968b
                r7.mo102969W0(r12, r8, r10)
                goto L_0x017e
            L_0x0149:
                r12 = 2
                if (r9 != r12) goto L_0x017e
                java.lang.String r10 = ".msg.appmsg.mmreader.category.item.schedule_username"
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r11 = ".msg.appmsg.mmreader.category.item.schedule_messvrid"
                java.lang.Object r11 = r1.get(r11)
                java.lang.String r11 = (java.lang.String) r11
                r12 = -1
                long r11 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r11, r12)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r13 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                android.content.Context r7 = r22.getContext()
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87578q0(r13, r7, r10, r11)
                r7 = 2
                java.lang.Object[] r13 = new java.lang.Object[r7]
                r14 = 0
                r13[r14] = r10
                java.lang.Long r10 = java.lang.Long.valueOf(r11)
                r11 = 1
                r13[r11] = r10
                java.lang.String r10 = "[onClick] Remind! username:%s svrMsgId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r13)
                goto L_0x0180
            L_0x017e:
                r7 = 2
                r11 = 1
            L_0x0180:
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r8 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                r10 = 8
                java.lang.String r12 = r0.f217968b
                if (r9 != r11) goto L_0x0189
                r7 = 1
            L_0x0189:
                r9 = 0
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87576o0(r8, r10, r12, r7, r9)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r7 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                r8 = 4
                java.lang.String r9 = ""
                r7.mo102966T0(r8, r1, r9)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r7 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                r8 = 6
                com.tencent.mm.storage.f4 r9 = r0.f212238a
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87574A0(r7, r8, r9)
                com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate r7 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.this
                com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.m87587z0(r7, r0, r1)
                j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.C73902n.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$o */
    public class C73903o implements View.OnClickListener {
        public C73903o() {
        }

        public void onClick(View view) {
            int i;
            int i2;
            Class cls = C60606n.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C74243t8 t8Var = (C74243t8) view.getTag();
            int i3 = t8Var.f217958J;
            String str = t8Var.f217959K;
            int i4 = 2;
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "jumpNativePage opType: %d, opInfo: %s", Integer.valueOf(i3), t8Var.f217959K);
            String str2 = "";
            if (i3 == 3) {
                try {
                    Map<String, String> parseXml = XmlParser.parseXml(t8Var.f212238a.getContent(), "msg", (String) null);
                    String nullAsNil = (parseXml == null || parseXml.size() <= 0) ? str2 : Util.nullAsNil(parseXml.get(".msg.appmsg.template_id"));
                    C99516a.m129865b(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), str, t8Var.f212238a.mo108774y2() + XVFSFile.PATH_SEPARATOR + t8Var.f217968b + XVFSFile.PATH_SEPARATOR + ChattingItemDyeingTemplate.this.f216867v.mo91577r() + XVFSFile.PATH_SEPARATOR + nullAsNil);
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", "doSnsAdNotifyMsgClick ,nativePageInfo=" + str + ", exp=" + th.toString());
                }
            } else if (i3 == 4) {
                try {
                    C104289g gVar = new C104289g(t8Var.f217959K);
                    long P = C61926c.m72671P(gVar.optString("feed_id"));
                    long P2 = C61926c.m72671P(gVar.optString("live_id"));
                    String optString = gVar.optString("nonce_id");
                    String optString2 = gVar.optString("force_push_info");
                    String optString3 = !TextUtils.isEmpty(optString2) ? new C104289g(optString2).optString("forcePushId") : str2;
                    ((C60606n) C86312j.m106911c(cls)).mo85047ZH((Intent) null, ChattingItemDyeingTemplate.this.f216867v.mo91565f(), P, Long.valueOf(P2), "", optString, "", "", "", "", 0, "", 1, true);
                    ChattingItemDyeingTemplate chattingItemDyeingTemplate = ChattingItemDyeingTemplate.this;
                    String str3 = t8Var.f217968b;
                    int b = t8Var.mo103252b();
                    chattingItemDyeingTemplate.getClass();
                    ((C60603k) C86312j.m106911c(C60603k.class)).mo84961lD(P, P2, str3, b, optString3);
                } catch (Throwable th4) {
                    Log.printErrStackTrace("MicroMsg.ChattingItemDyeingTemplate", th4, "OP_ITEM_TYPE_FINDER_LIVE exception", new Object[0]);
                }
            } else if (i3 == 5) {
                try {
                    String optString4 = new C104289g(t8Var.f217959K).optString("ticket_s");
                    if (!Util.isNullOrNil(optString4)) {
                        Intent intent = new Intent();
                        intent.putExtra("KEY_TICKET", optString4);
                        intent.putExtra("KEY_FROM_SCAN", true);
                        ((C60606n) C86312j.m106911c(cls)).mo85046Z3(ChattingItemDyeingTemplate.this.f216867v.mo91565f(), intent);
                    }
                } catch (Throwable th5) {
                    Log.printErrStackTrace("MicroMsg.ChattingItemDyeingTemplate", th5, "OP_ITEM_TYPE_FINDER_GAME_LIVE exception", new Object[0]);
                }
            }
            Bundle bundle = t8Var.f217960L;
            if (bundle != null) {
                int i5 = bundle.getInt("click_area_type");
                if (i5 == 1) {
                    ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = ChattingItemDyeingTemplate.this;
                    C72963f4 f4Var = t8Var.f212238a;
                    if (f4Var != null) {
                        str2 = f4Var.mo108768t();
                    }
                    String str4 = t8Var.f217968b;
                    String str5 = ChattingItemDyeingTemplate.f216840y0;
                    chattingItemDyeingTemplate2.mo102969W0(2, str2, str4);
                    if (!Util.isNullOrNil(t8Var.f217961M)) {
                        ChattingItemDyeingTemplate.this.mo102968V0(4, t8Var.f217961M, t8Var.f217962N, t8Var.f217963O, "", "");
                    }
                } else if (i5 == 2) {
                    ChattingItemDyeingTemplate chattingItemDyeingTemplate3 = ChattingItemDyeingTemplate.this;
                    C72963f4 f4Var2 = t8Var.f212238a;
                    if (f4Var2 != null) {
                        str2 = f4Var2.mo108768t();
                    }
                    String str6 = t8Var.f217968b;
                    String str7 = ChattingItemDyeingTemplate.f216840y0;
                    chattingItemDyeingTemplate3.mo102969W0(3, str2, str6);
                    if (!Util.isNullOrNil(t8Var.f217961M)) {
                        i = 1;
                        i2 = 0;
                        ChattingItemDyeingTemplate.this.mo102968V0(5, t8Var.f217961M, t8Var.f217962N, (String) null, t8Var.f217966R, t8Var.f217967S);
                    } else {
                        i2 = 0;
                        i = 1;
                    }
                    C72963f4 f4Var3 = t8Var.f212238a;
                    if (f4Var3 != null && t8Var.f217965Q == i) {
                        ChattingItemDyeingTemplate.m87579r0(ChattingItemDyeingTemplate.this, f4Var3, t8Var.f217964P);
                    }
                    int i6 = bundle.getInt("is_top_msg");
                    String string = bundle.getString("top_msg_content");
                    ChattingItemDyeingTemplate chattingItemDyeingTemplate4 = ChattingItemDyeingTemplate.this;
                    String str8 = ChattingItemDyeingTemplate.f216840y0;
                    chattingItemDyeingTemplate4.mo102952E0(t8Var, i6, string);
                }
                i2 = 0;
                i = 1;
                int i64 = bundle.getInt("is_top_msg");
                String string2 = bundle.getString("top_msg_content");
                ChattingItemDyeingTemplate chattingItemDyeingTemplate42 = ChattingItemDyeingTemplate.this;
                String str82 = ChattingItemDyeingTemplate.f216840y0;
                chattingItemDyeingTemplate42.mo102952E0(t8Var, i64, string2);
            } else {
                i2 = 0;
                i = 1;
            }
            ChattingItemDyeingTemplate chattingItemDyeingTemplate5 = ChattingItemDyeingTemplate.this;
            String str9 = t8Var.f217968b;
            if (i3 == i) {
                i4 = 1;
            }
            ChattingItemDyeingTemplate.m87576o0(chattingItemDyeingTemplate5, 8, str9, i4, i2);
            ChattingItemDyeingTemplate.m87574A0(ChattingItemDyeingTemplate.this, 7, t8Var.f212238a);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$p */
    public final class C73904p implements View.OnClickListener {

        /* renamed from: d */
        public C74307x8 f216920d;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$p$a */
        public class C73905a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ String f216922d;

            /* renamed from: e */
            public final /* synthetic */ View f216923e;

            public C73905a(C73904p pVar, String str, View view) {
                this.f216922d = str;
                this.f216923e = view;
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.add(0, 2, 0, (CharSequence) ((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(this.f216922d) ? this.f216923e.getResources().getString(C0966R.string.f361105hd0) : this.f216923e.getResources().getString(C0966R.string.hcy));
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$p$b */
        public class C73906b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ View f216924d;

            /* renamed from: e */
            public final /* synthetic */ C72963f4 f216925e;

            /* renamed from: f */
            public final /* synthetic */ Map f216926f;

            /* renamed from: g */
            public final /* synthetic */ String f216927g;

            public C73906b(View view, C72963f4 f4Var, Map map, String str) {
                this.f216924d = view;
                this.f216925e = f4Var;
                this.f216926f = map;
                this.f216927g = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "on menu(id : %d, index : %d) item selected.", Integer.valueOf(menuItem.getItemId()), Integer.valueOf(i));
                if (menuItem.getItemId() == 2) {
                    C73904p pVar = C73904p.this;
                    ChattingItemDyeingTemplate.m87580s0(ChattingItemDyeingTemplate.this, pVar.f216920d, this.f216924d, this.f216925e, this.f216926f, this.f216927g);
                }
            }
        }

        public C73904p(C73891d dVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!(view.getTag() instanceof C72963f4)) {
                Log.m105928w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, tag not msg.");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C72963f4 f4Var = (C72963f4) view.getTag();
            if (f4Var == null) {
                Log.m105928w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, msg null.");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Map<String, String> parseXml = XmlParser.parseXml(f4Var.getContent(), "msg", (String) null);
            if (parseXml == null || parseXml.size() == 0) {
                Log.m105928w("MicroMsg.ChattingItemDyeingTemplate", "BizMoreViewOnClickListener#onClick, values null.");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String nullAsNil = Util.nullAsNil(parseXml.get(".msg.fromusername"));
            BrandTmplExposeReportStruct brandTmplExposeReportStruct = new BrandTmplExposeReportStruct();
            brandTmplExposeReportStruct.f194144d = 1;
            brandTmplExposeReportStruct.f194145e = System.currentTimeMillis();
            brandTmplExposeReportStruct.mo93193u(nullAsNil);
            brandTmplExposeReportStruct.f194147g = brandTmplExposeReportStruct.mo86045b("templateId", ChattingItemDyeingTemplate.this.f216849I, true);
            brandTmplExposeReportStruct.f194148h = brandTmplExposeReportStruct.mo86045b("templateTitle", ChattingItemDyeingTemplate.this.f216854N, true);
            brandTmplExposeReportStruct.f194149i = brandTmplExposeReportStruct.mo86045b("templateContent", ChattingItemDyeingTemplate.this.f216862W.f65823f, true);
            brandTmplExposeReportStruct.mo86054n();
            C77407n nVar = new C77407n(view.getContext(), 1, false);
            nVar.f225771i = new C73905a(this, nullAsNil, view);
            nVar.f225782p = new C73906b(view, f4Var, parseXml, nullAsNil);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$BizMoreViewOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$q */
    public static class C73907q extends C74243t8 {

        /* renamed from: T */
        public String f216929T;

        public C73907q(String str) {
            this.f216929T = str;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$r */
    public static class C73908r {

        /* renamed from: a */
        public String f216930a;

        /* renamed from: b */
        public String f216931b;

        /* renamed from: c */
        public String f216932c;

        /* renamed from: d */
        public String f216933d;

        /* renamed from: a */
        public static C73908r m87630a(Map<String, String> map) {
            C73908r rVar = new C73908r();
            rVar.f216930a = map.get(".msg.appmsg.mmreader.category.item.title");
            rVar.f216931b = map.get(".msg.appmsg.mmreader.category.item.url");
            rVar.f216933d = map.get(".msg.appmsg.mmreader.category.item.native_url");
            String str = map.get(".msg.appmsg.mmreader.category.item.shorturl");
            String str2 = map.get(".msg.appmsg.mmreader.category.item.longurl");
            Util.getLong(map.get(".msg.appmsg.mmreader.category.item.pub_time"), 0);
            String str3 = map.get(".msg.appmsg.mmreader.category.item.cover");
            String str4 = map.get(".msg.appmsg.mmreader.category.item.tweetid");
            String str5 = map.get(".msg.appmsg.mmreader.category.item.digest");
            Util.getInt(map.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
            rVar.f216932c = map.get(".msg.appmsg.template_id");
            return rVar;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$s */
    public static class C73909s implements View.OnClickListener {
        public C73909s(C73891d dVar) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (t8Var == null) {
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (t8Var instanceof C73913u) {
                while (view != null && (view.getParent() instanceof View) && view.getId() != C0966R.C0970id.f357678b63 && view.getId() != C0966R.C0970id.b66) {
                    view = (View) view.getParent();
                }
                if (view != null && (view.getId() == C0966R.C0970id.f357678b63 || view.getId() == C0966R.C0970id.b66)) {
                    view.performClick();
                }
            } else if (t8Var instanceof C73907q) {
                while (view != null && (view.getParent() instanceof View) && view.getId() != C0966R.C0970id.b65) {
                    view = (View) view.getParent();
                }
                if (view != null && view.getId() == C0966R.C0970id.b65) {
                    view.performClick();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$t */
    public static class C73910t implements View.OnLongClickListener {

        /* renamed from: d */
        public C67391b f216934d;

        /* renamed from: e */
        public C76891l0 f216935e = new C73911a();

        /* renamed from: f */
        public C11184p0 f216936f = new C73912b();

        /* renamed from: g */
        public boolean f216937g;

        /* renamed from: h */
        public String f216938h;

        /* renamed from: i */
        public String f216939i;

        /* renamed from: j */
        public String f216940j;

        /* renamed from: n */
        public C78253a f216941n;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$t$a */
        public class C73911a implements C76891l0 {
            public C73911a() {
            }

            /* renamed from: a */
            public void mo71744a(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                C74243t8 t8Var = (C74243t8) view.getTag();
                if (t8Var != null) {
                    int b = t8Var.mo103252b();
                    if (t8Var instanceof C73913u) {
                        C73910t tVar = C73910t.this;
                        C78374b.C78375a aVar = ((C73913u) t8Var).f216944T;
                        tVar.f216938h = aVar.f229669a;
                        tVar.f216939i = aVar.f229670b;
                        tVar.f216937g = false;
                    } else if (t8Var instanceof C73907q) {
                        C73910t tVar2 = C73910t.this;
                        tVar2.f216940j = ((C73907q) t8Var).f216929T;
                        tVar2.f216937g = true;
                    }
                    e0Var.mo107136c(b, 100, 0, C73910t.this.f216934d.mo91572m().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$t$b */
        public class C73912b implements C11184p0 {
            public C73912b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                String str;
                C73910t tVar = C73910t.this;
                if (tVar.f216937g) {
                    str = tVar.f216940j;
                } else {
                    str = String.format("%s:%s", new Object[]{tVar.f216938h, tVar.f216939i});
                }
                ClipboardHelper.setText(MMApplicationContext.getContext(), str, str);
                C76701a.makeText((Context) C73910t.this.f216934d.mo91565f(), (int) C0966R.string.f7938wv, 0).show();
            }
        }

        public C73910t(C67391b bVar) {
            this.f216934d = bVar;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (((C74243t8) view.getTag()) == null) {
                Log.m105928w("MicroMsg.ChattingItemDyeingTemplate", "open menu but tag is null");
            } else {
                C78253a aVar = this.f216941n;
                if (aVar != null) {
                    aVar.mo108266a();
                    this.f216941n = null;
                }
                C78253a aVar2 = new C78253a(this.f216934d.mo91565f());
                this.f216941n = aVar2;
                aVar2.f229257z = true;
                aVar2.f229227C = new C74290w5(this, view);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i = iArr[1];
                View view2 = view;
                this.f216941n.mo108271f(view2, this.f216935e, this.f216936f, iArr[0] + ((int) (((float) view.getWidth()) / 2.0f)), i);
                C67391b bVar = this.f216934d;
                if (bVar != null) {
                    bVar.mo91545F(false);
                    this.f216934d.mo91551L(false);
                    this.f216934d.f193296t = false;
                }
            }
            if (view.findViewById(C0966R.C0970id.foj) != null) {
                view.findViewById(C0966R.C0970id.foj).setBackgroundColor(view.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
            } else if (view.findViewById(C0966R.C0970id.c74) != null) {
                view.findViewById(C0966R.C0970id.c74).setBackgroundColor(view.getResources().getColor(C0966R.color.BW_0_Alpha_0_1));
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$LineDataLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$u */
    public static class C73913u extends C74243t8 {

        /* renamed from: T */
        public C78374b.C78375a f216944T;

        public C73913u(String str, String str2, boolean z) {
            C78374b.C78375a aVar = new C78374b.C78375a();
            this.f216944T = aVar;
            aVar.f229669a = str;
            aVar.f229670b = str2;
        }
    }

    static {
        WeChatHosts.domainString(C0966R.string.f360885fm3);
        WeChatHosts.domainString(C0966R.string.f360885fm3);
    }

    public ChattingItemDyeingTemplate() {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59364t = true;
        bVar.f59354j = 132;
        bVar.f59355k = 132;
        bVar.f59359o = C0966R.C0969drawable.be5;
        this.f216847G = bVar.mo32666a();
        this.f216860U = C76577a.m92145A(MMApplicationContext.getContext());
        C48018e eVar = C48018e.f128802a;
        this.f216852L = eVar.mo72802a("name_biz");
        this.f216853M = eVar.mo72802a("name_wxa");
        this.f216871y = new C73904p((C73891d) null);
        this.f216846F = new C73891d();
        this.f216872z = new C73893f();
        this.f216844D = new IListener<OnWxaOptionsChangedEvent>(C40008f.f107254d) {
            {
                this.__eventId = 495598387;
            }

            public boolean callback(IEvent iEvent) {
                OnWxaOptionsChangedEvent onWxaOptionsChangedEvent = (OnWxaOptionsChangedEvent) iEvent;
                C67391b bVar = ChattingItemDyeingTemplate.this.f216867v;
                if (bVar == null) {
                    return true;
                }
                bVar.mo91565f().runOnUiThread(new C73978e5(this));
                return true;
            }
        };
        this.f216845E = new C73900l();
        this.f216841A = new C73901m();
        this.f216842B = new C73902n();
        this.f216843C = new C73903o();
    }

    /* renamed from: A0 */
    public static void m87574A0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i, C72963f4 f4Var) {
        C67391b bVar = chattingItemDyeingTemplate.f216867v;
        if (bVar != null) {
            ((C79375p) bVar.f193278b.mo102812a(C79375p.class)).mo70114X4(i, f4Var);
        }
    }

    /* renamed from: S0 */
    public static int m87575S0(Map<String, String> map, String str, int i) {
        if (map == null || Util.isNullOrNil(str) || Util.isNullOrNil(map.get(str))) {
            return i;
        }
        try {
            return Color.parseColor(Util.nullAsNil(map.get(str)));
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: o0 */
    public static void m87576o0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, int i, String str, int i2, int i3) {
        if (chattingItemDyeingTemplate.f216864Y) {
            C115669n.INSTANCE.mo160131h(21825, Integer.valueOf(i), str, Long.valueOf(Util.nowSecond()), null, chattingItemDyeingTemplate.f216849I, Integer.valueOf(i2), Integer.valueOf(i3), 0);
        }
    }

    /* renamed from: p0 */
    public static void m87577p0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str, String str2, int i, int i2, String str3, AppBrandStatObject appBrandStatObject) {
        ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = chattingItemDyeingTemplate;
        String str4 = str;
        chattingItemDyeingTemplate.getClass();
        C52558c b = C47984k.m53328b(str);
        if (b == null) {
            Log.m105929w("MicroMsg.ChattingItemDyeingTemplate", "prepare to launch weapp, but bizInfo is null, username: %s", str4);
            C73938c.m87675a(10);
            C88629c e = ((C88633e) C88643g.m110546d()).mo123062e(new C73925a5(chattingItemDyeingTemplate2)).mo123060U(new C74326z4(chattingItemDyeingTemplate2, str4)).mo123061d(new C74314y4(chattingItemDyeingTemplate2, str4)).mo123062e(new C74301x4(chattingItemDyeingTemplate2));
            C88825i iVar = C88819d.f256219UI;
            e.mo123066f(iVar, new C74289w4(chattingItemDyeingTemplate2)).mo114039c(iVar, new C73934b5(chattingItemDyeingTemplate, str, str2, i, i2, str3, appBrandStatObject));
        } else {
            ((C76630x0) C86312j.m106911c(C76630x0.class)).Rg0(chattingItemDyeingTemplate2.f216867v.mo91565f(), str2, (String) null, i, i2, str3, appBrandStatObject, b.field_appId);
            C73938c.m87675a(1);
        }
        C73938c.m87675a(0);
    }

    /* renamed from: q0 */
    public static void m87578q0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, Context context, String str, long j) {
        Context context2 = context;
        String str2 = str;
        chattingItemDyeingTemplate.getClass();
        if (str2 == null) {
            Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] username is null");
            return;
        }
        long msgId = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(str, j).getMsgId();
        Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] msgLocalId:%s", Long.valueOf(msgId));
        if (!str.contains("@")) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
            if (z1Var == null || !z1Var.mo62927s3()) {
                if (z1Var == null) {
                    Log.m105929w("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] contact is null! username:%s", str2);
                } else {
                    Log.m105929w("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] isContact not ! username:%s", str2);
                }
                C76879j.m92749t(context, context.getString(C0966R.string.hze), context.getString(C0966R.string.f361465k34), (DialogInterface.OnClickListener) null);
                return;
            }
        } else if (((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(str) == null) {
            Log.m105929w("MicroMsg.ChattingItemDyeingTemplate", "[gotoChattingUIWithPosition] member is null! username:%s", str2);
            C76879j.m92749t(context, context.getString(C0966R.string.hze), context.getString(C0966R.string.f361465k34), (DialogInterface.OnClickListener) null);
            return;
        }
        Intent putExtra = new Intent().putExtra("Chat_User", str).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", msgId);
        putExtra.setClass(context, ChattingUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(putExtra);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "gotoChattingUIWithPosition", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "gotoChattingUIWithPosition", "(Landroid/content/Context;Ljava/lang/String;J)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: r0 */
    public static void m87579r0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C72963f4 f4Var, int i) {
        chattingItemDyeingTemplate.getClass();
        int i2 = (1 << i) | f4Var.f230753p0;
        Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "mark reddot state: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        f4Var.f230753p0 = i2;
        f4Var.f230755r = true;
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
    }

    /* renamed from: s0 */
    public static void m87580s0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C74307x8 x8Var, View view, C72963f4 f4Var, Map map, String str) {
        chattingItemDyeingTemplate.getClass();
        BrandTmplExposeReportStruct brandTmplExposeReportStruct = new BrandTmplExposeReportStruct();
        brandTmplExposeReportStruct.f194144d = 2;
        brandTmplExposeReportStruct.f194145e = System.currentTimeMillis();
        brandTmplExposeReportStruct.mo93193u(str);
        brandTmplExposeReportStruct.f194147g = brandTmplExposeReportStruct.mo86045b("templateId", chattingItemDyeingTemplate.f216849I, true);
        brandTmplExposeReportStruct.f194148h = brandTmplExposeReportStruct.mo86045b("templateTitle", chattingItemDyeingTemplate.f216854N, true);
        brandTmplExposeReportStruct.f194149i = brandTmplExposeReportStruct.mo86045b("templateContent", chattingItemDyeingTemplate.f216862W.f65823f, true);
        brandTmplExposeReportStruct.mo86054n();
        chattingItemDyeingTemplate.mo102969W0(5, f4Var.mo108768t(), str);
        C97625j3.m125815e().mo123455a(1198, new C74231t4(chattingItemDyeingTemplate, view, f4Var, map));
        C46664n nVar = new C46664n(f4Var.getContent());
        C89779i0 i0Var = chattingItemDyeingTemplate.f216868w;
        if (i0Var != null && i0Var.isShowing()) {
            chattingItemDyeingTemplate.f216868w.dismiss();
        }
        chattingItemDyeingTemplate.f216868w = C76879j.m92723Q(view.getContext(), view.getResources().getString(C0966R.string.a3h), view.getResources().getString(C0966R.string.a4d), true, true, new C74264u4(chattingItemDyeingTemplate, nVar));
        C97625j3.m125815e().mo123460f(nVar);
    }

    /* renamed from: t0 */
    public static boolean m87581t0(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        chattingItemDyeingTemplate.getClass();
        int m = C86709a0.m107524d().mo123467m();
        boolean z = m == 6 || m == 4;
        if (!z) {
            C76701a.makeText((Context) chattingItemDyeingTemplate.f216867v.mo91565f(), (CharSequence) chattingItemDyeingTemplate.f216867v.mo91572m().getString(C0966R.string.f360087a11), 0).show();
        }
        return z;
    }

    /* renamed from: u0 */
    public static void m87582u0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, Map map, boolean z, boolean z2, C74307x8 x8Var, String str, boolean z3) {
        chattingItemDyeingTemplate.mo102970X0(x8Var, z ? 0 : 8);
        int N0 = chattingItemDyeingTemplate.mo102961N0((String) map.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type"));
        boolean z4 = !z;
        chattingItemDyeingTemplate.f216848H.f62963a = z4;
        SubscribeMsgTmpItem subscribeMsgTmpItem = new SubscribeMsgTmpItem(chattingItemDyeingTemplate.f216849I, N0, z4 ? 1 : 0, z2);
        subscribeMsgTmpItem.f49033u = chattingItemDyeingTemplate.f216848H.f62966d;
        C22222c cVar = z3 ? chattingItemDyeingTemplate.f216853M : chattingItemDyeingTemplate.f216852L;
        C76912y0.m92773l(chattingItemDyeingTemplate.f216867v.mo91565f(), z ? String.format(chattingItemDyeingTemplate.f216867v.mo91572m().getString(C0966R.string.hdp), new Object[]{chattingItemDyeingTemplate.f216854N}) : String.format(chattingItemDyeingTemplate.f216867v.mo91572m().getString(C0966R.string.hdm), new Object[]{chattingItemDyeingTemplate.f216854N}));
        cVar.mo35372m(str, subscribeMsgTmpItem, new C74076j5(chattingItemDyeingTemplate));
    }

    /* renamed from: v0 */
    public static void m87583v0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, boolean z, String str, C74307x8 x8Var) {
        C76879j.m92709C(chattingItemDyeingTemplate.f216867v.mo91565f(), z ? chattingItemDyeingTemplate.f216867v.mo91565f().getString(C0966R.string.hci) : chattingItemDyeingTemplate.f216867v.mo91565f().getString(C0966R.string.hdj), z ? chattingItemDyeingTemplate.f216867v.mo91565f().getString(C0966R.string.hcj) : chattingItemDyeingTemplate.f216867v.mo91565f().getString(C0966R.string.hdk), chattingItemDyeingTemplate.f216867v.mo91565f().getString(C0966R.string.hdn), chattingItemDyeingTemplate.f216867v.mo91565f().getString(C0966R.string.f7926wf), true, new C19768g5(chattingItemDyeingTemplate, str, z), (DialogInterface.OnClickListener) null).setCanceledOnTouchOutside(false);
    }

    /* renamed from: w0 */
    public static int m87584w0(String str) {
        return (str == null || !str.startsWith("SUBSCRIPTION")) ? 1014 : 1107;
    }

    /* renamed from: x0 */
    public static void m87585x0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C74160o8 o8Var, C74243t8 t8Var, int i) {
        C72963f4 f4Var;
        C74170p8 p8Var;
        FoldableCellLayout foldableCellLayout;
        C79375p pVar = (C79375p) chattingItemDyeingTemplate.f216867v.f193278b.mo102812a(C79375p.class);
        if (t8Var != null && (f4Var = t8Var.f212238a) != null && (p8Var = o8Var.f217689k) != null && (foldableCellLayout = p8Var.f217718a) != null && foldableCellLayout.getVisibility() == 0) {
            FoldableCellLayout foldableCellLayout2 = o8Var.f217689k.f217718a;
            if (pVar != null) {
                List<C72963f4> z5 = pVar.mo70125z5(f4Var.getMsgId());
                pVar.mo70112M0(f4Var.getMsgId(), i);
                LayoutInflater from = LayoutInflater.from(foldableCellLayout2.getContext());
                foldableCellLayout2.removeAllViews();
                for (C72963f4 f : z5) {
                    C6807n4 n4Var = new C6807n4(from, C0966R.C0971layout.f6872qu);
                    C74191q8 q8Var = new C74191q8();
                    q8Var.mo103209a(n4Var);
                    q8Var.checkBox.setVisibility(8);
                    q8Var.timeTV.setVisibility(8);
                    chattingItemDyeingTemplate.mo26237f(q8Var, chattingItemDyeingTemplate.f216867v, f, t8Var.f217968b);
                    foldableCellLayout2.mo153656a(n4Var, new FrameLayout.LayoutParams(-2, -2));
                }
            }
            foldableCellLayout2.post(new C106700p4(chattingItemDyeingTemplate, foldableCellLayout2, pVar));
        }
    }

    /* renamed from: y0 */
    public static void m87586y0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, Map map, C22222c.C22225c cVar, String str, boolean z) {
        chattingItemDyeingTemplate.getClass();
        SubscribeMsgTmpItem subscribeMsgTmpItem = new SubscribeMsgTmpItem(chattingItemDyeingTemplate.f216849I, chattingItemDyeingTemplate.mo102961N0((String) map.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type")), (cVar.f62963a || z) ? 1 : 0, cVar.f62964b);
        subscribeMsgTmpItem.f49033u = z;
        chattingItemDyeingTemplate.f216853M.mo35372m(str, subscribeMsgTmpItem, new C74213s4(chattingItemDyeingTemplate));
    }

    /* renamed from: z0 */
    public static void m87587z0(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C74243t8 t8Var, Map map) {
        chattingItemDyeingTemplate.getClass();
        if (map != null && map.size() != 0) {
            chattingItemDyeingTemplate.mo102952E0(t8Var, Util.getInt((String) map.get(".msg.appmsg.mmreader.template_detail.is_top_msg"), 0), Util.nullAsNil((String) map.get(".msg.appmsg.mmreader.template_detail.top_msg_content")));
        }
    }

    /* renamed from: B0 */
    public final void mo102949B0(C77407n nVar, C76874e0 e0Var, String str, boolean z, boolean z2, boolean z3) {
        MenuItem menuItem;
        Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "alvinluo addAppBrandSubscribeOperateMenu title: %s", this.f216854N);
        if (!z || (z3 && !z2)) {
            menuItem = e0Var.mo107142f(1, z3 ? String.format(this.f216867v.mo91572m().getString(C0966R.string.hde), new Object[]{this.f216854N}) : this.f216867v.mo91572m().getString(C0966R.string.hdf));
        } else {
            menuItem = e0Var.mo107140d(0, this.f216867v.mo91572m().getColor(C0966R.color.a_3), z3 ? String.format(this.f216867v.mo91572m().getString(C0966R.string.hcm), new Object[]{this.f216854N}) : this.f216867v.mo91572m().getString(C0966R.string.hcr));
        }
        if (menuItem instanceof C76875f0) {
            ((C76875f0) menuItem).f224711E = new C73951d5(this);
        }
        String str2 = null;
        View inflate = C85868k2.m106137b(this.f216867v.mo91565f()).inflate(C0966R.C0971layout.f6984u4, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.k_5);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.k_4);
        C85875k4.m106191k0(textView.getPaint());
        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(str);
        String str3 = N2 == null ? null : N2.field_nickname;
        if (N2 != null) {
            str2 = N2.field_brandIconURL;
        }
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f216867v.mo91565f(), str3, textView.getTextSize()));
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59365u = 0.0f;
        bVar.f59364t = false;
        bVar.f59359o = C0966R.C0969drawable.be5;
        C20828a.m22825b().mo32519h(str2, imageView, bVar.mo32666a());
        nVar.mo107569n(inflate, false);
    }

    /* renamed from: C */
    public boolean mo82212C() {
        return this.f216851K == 0;
    }

    /* renamed from: C0 */
    public final void mo102950C0(int i, String str, String str2) {
        Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "stev report(%s), eventId : %d, appId %s, templateId %s", 13796, Integer.valueOf(i), str, str2);
        C115669n.INSTANCE.mo160131h(13796, Integer.valueOf(i), str, str2, 0, Long.valueOf(Util.nowSecond()));
    }

    /* renamed from: D0 */
    public final boolean mo102951D0(Map<String, String> map, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(".msg.appmsg.mmreader.template_detail.opitems.opitem");
        sb.append(i == 0 ? "" : Integer.valueOf(i));
        sb.append(".device_list.device");
        String sb4 = sb.toString();
        int i2 = 0;
        do {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(i2 == 0 ? "" : Integer.valueOf(i2));
            String sb6 = sb5.toString();
            if (!map.containsKey(sb6)) {
                return false;
            }
            if (Util.getInt(map.get(sb6 + ".device_type"), 0) == 2) {
                int i3 = Util.getInt(map.get(sb6 + ".device_op_type"), 0);
                int i4 = Util.getInt(map.get(sb6 + ".device_client_version"), 0);
                Log.m105927v("MicroMsg.ChattingItemDyeingTemplate", "checkButtonShouldHide opItemIndex: %s, deviceOpType: %s, deviceClientVersion: %x", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i4));
                return i3 == 1 && C89625d.f257841g >= i4;
            }
            i2++;
        } while (i2 <= 10);
        return false;
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6873qv);
        new C6804c7(n4Var);
        C74160o8 o8Var = new C74160o8();
        o8Var.mo103209a(n4Var);
        n4Var.setTag(o8Var);
        return n4Var;
    }

    /* renamed from: E0 */
    public final void mo102952E0(C74243t8 t8Var, int i, String str) {
        C72963f4 f4Var;
        if (t8Var != null && i == 1 && !Util.isNullOrNil(str)) {
            String str2 = t8Var.f217968b;
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "checkDeletePayTopMsg，username：%s", str2);
            if ("gh_f0a92aa7146c".equals(str2) && (f4Var = t8Var.f212238a) != null) {
                String t = f4Var.mo108768t();
                String l = Long.toString(f4Var.mo108774y2());
                Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "checkDeletePayTopMsg，username：%s，svrId: %s", t, l);
                if (!Util.isNullOrNil(t) && !Util.isNullOrNil(l)) {
                    t.getClass();
                    if (!t.equals("gh_f0a92aa7146c")) {
                        Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "unknown msgUsername");
                        return;
                    }
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_COLLECT_TOPMSG_STRING_SYNC;
                    C86709a0.m107528h();
                    String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
                    if (!Util.isNullOrNil(str3)) {
                        ky4 ky4 = new ky4();
                        try {
                            ky4.parseFrom(str3.getBytes(StandardCharsets.ISO_8859_1));
                            LinkedList<jy4> linkedList = ky4.f227784e;
                            if (linkedList != null && linkedList.size() > 0) {
                                Iterator<jy4> it = ky4.f227784e.iterator();
                                while (it.hasNext()) {
                                    jy4 next = it.next();
                                    if (next.f227709d.equals(l)) {
                                        ((C76328d) C86312j.m106911c(C76328d.class)).mo106559Ll(t, next);
                                        return;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.ChattingItemDyeingTemplate", "parse cacheString exp：%s", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: F0 */
    public final void mo102953F0(C74307x8 x8Var, String str, String str2, Map<String, String> map, C72963f4 f4Var, boolean z) {
        C74307x8 x8Var2 = x8Var;
        Map<String, String> map2 = map;
        C72963f4 f4Var2 = f4Var;
        x8Var2.f218266f.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f216867v.mo91565f(), str2, x8Var2.f218266f.getTextSize()));
        C20828a.m22825b().mo32519h(str, x8Var2.f218265e, this.f216847G);
        x8Var2.f218265e.setTag((Object) null);
        x8Var2.f218265e.setOnClickListener((View.OnClickListener) null);
        x8Var2.f218264d.setTag((Object) null);
        x8Var2.f218264d.setOnClickListener((View.OnClickListener) null);
        View view = x8Var2.f218264d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i = Util.getInt(map2.get(".msg.appmsg.mmreader.template_header.header_jump_type"), -1);
        if (i == -1 || i == 0) {
            String nullAsNil = Util.nullAsNil(map2.get(".msg.appmsg.mmreader.template_header.weapp_username"));
            String nullAsNil2 = Util.nullAsNil(map2.get(".msg.appmsg.mmreader.template_header.header_jump_url"));
            if (!Util.isNullOrNil(nullAsNil) || !Util.isNullOrNil(nullAsNil2)) {
                x8Var2.f218264d.setTag(new C74243t8(f4Var2, Util.nullAsNil(map2.get(".msg.fromusername"))));
                x8Var2.f218264d.setOnClickListener(this.f216846F);
            } else {
                x8Var2.f218264d.setTag((Object) null);
                x8Var2.f218264d.setOnClickListener((View.OnClickListener) null);
            }
        } else if (i == 1 || i == 2) {
            x8Var2.f218264d.setTag(new C74243t8(f4Var2, Util.nullAsNil(map2.get(".msg.fromusername"))));
            x8Var2.f218264d.setOnClickListener(this.f216846F);
        } else if (i == 3) {
            String nullAsNil3 = Util.nullAsNil(map2.get(".msg.appmsg.mmreader.template_header.finder_user_name"));
            x8Var2.f218264d.setTag(new C74243t8(f4Var2, nullAsNil3));
            x8Var2.f218264d.setOnClickListener(new C73892e(nullAsNil3, map2));
        } else {
            x8Var2.f218264d.setTag((Object) null);
            x8Var2.f218264d.setOnClickListener((View.OnClickListener) null);
        }
        String nullAsNil4 = Util.nullAsNil(map2.get(".msg.appmsg.mmreader.template_header.shortcut_icon_url"));
        if (!z || Util.isNullOrNil(nullAsNil4)) {
            View view2 = (View) x8Var2.f218268h.getParent();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = (View) x8Var2.f218268h.getParent();
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingAvatarAndName", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C20828a.m22825b().mo32519h(nullAsNil4, x8Var2.f218268h, this.f216847G);
    }

    /* renamed from: G0 */
    public void mo102954G0(ImageView imageView, C67391b bVar, String str, C72963f4 f4Var, String str2, Map<String, String> map) {
        if (imageView != null) {
            if (C45628s0.m50812z(str)) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            if (((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(str)) {
                C20828a.m22825b().mo32519h(str2, imageView, this.f216847G);
                imageView.setTag(new C74243t8(f4Var, str));
                imageView.setOnClickListener(this.f216872z);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(imageView, str);
                imageView.setTag(new C74243t8(str, bVar.mo91583x() ? bVar.mo91577r() : null));
                if (Util.getBoolean(map.get(".msg.appmsg.mmreader.template_detail.template_ext.block"), false)) {
                    imageView.setOnClickListener((View.OnClickListener) null);
                } else {
                    imageView.setOnClickListener(new C73888a(bVar, str, f4Var));
                }
            }
            if (this.f217203j == null) {
                this.f217203j = new C73679e2(bVar);
            }
            imageView.setOnLongClickListener(this.f217203j);
        }
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* renamed from: H0 */
    public final void mo102955H0(C74307x8 x8Var, C72963f4 f4Var, Map<String, String> map) {
        Object obj;
        Integer num;
        Object obj2;
        String str;
        String str2;
        String str3;
        int i;
        C72963f4 f4Var2;
        String str4;
        String str5;
        int i2;
        Integer num2;
        int i3;
        int i4;
        String str6;
        int i5;
        int i6;
        LinearLayout linearLayout;
        String str7;
        String str8;
        int i7;
        LinearLayout linearLayout2;
        int i8;
        LinearLayout linearLayout3;
        String str9;
        boolean z;
        int i9;
        boolean z2;
        int i15;
        boolean z3;
        int i16;
        C104289g gVar;
        String str10;
        String str11;
        ChattingItemDyeingTemplate chattingItemDyeingTemplate = this;
        C74307x8 x8Var2 = x8Var;
        C72963f4 f4Var3 = f4Var;
        Map<String, String> map2 = map;
        Class cls = C76629w0.class;
        ? r112 = 0;
        String str12 = ".msg.appmsg.template_id";
        String str13 = ".msg.fromusername";
        int i17 = 1;
        if (Util.getInt(map2.get(".msg.appmsg.mmreader.template_detail.opitems.show_type"), 0) != 0) {
            View view = x8Var2.f218245I;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x8Var2.f218284x.setVisibility(8);
            View view3 = x8Var2.f218286z;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x8Var2.f218285y.setVisibility(0);
            View view5 = x8Var2.f218283w;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            LinearLayout linearLayout4 = x8Var2.f218285y;
            int childCount = linearLayout4.getChildCount();
            int i18 = 0;
            while (i18 < 10) {
                String str14 = ".msg.appmsg.mmreader.template_detail.opitems.opitem";
                if (i18 != 0) {
                    str14 = str14 + i18;
                }
                String str15 = str14;
                String str16 = map2.get(str15 + ".word");
                String str17 = map2.get(str15 + ".hint_word");
                if (Util.isNullOrNil(str16)) {
                    Object[] objArr = new Object[i17];
                    objArr[r112] = Integer.valueOf(i18);
                    Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "fillingVerticalButtons: count=%d", objArr);
                    int childCount2 = linearLayout4.getChildCount();
                    if (childCount2 <= i18) {
                        return;
                    }
                    if (i18 == 0) {
                        linearLayout4.removeAllViews();
                        return;
                    } else {
                        linearLayout4.removeViews(i18, childCount2 - i18);
                        return;
                    }
                } else {
                    if (i18 < childCount) {
                        i5 = childCount;
                        str6 = str12;
                        linearLayout = (LinearLayout) linearLayout4.getChildAt(i18);
                        i6 = C0966R.C0970id.hwn;
                    } else {
                        i5 = childCount;
                        linearLayout = (LinearLayout) LayoutInflater.from(chattingItemDyeingTemplate.f216867v.mo91565f()).inflate(C0966R.C0971layout.f6834pt, (ViewGroup) null, r112);
                        C73948d dVar = new C73948d();
                        dVar.f217037a = (TextView) linearLayout.findViewById(C0966R.C0970id.hcb);
                        dVar.f217038b = (ImageView) linearLayout.findViewById(C0966R.C0970id.hc6);
                        dVar.f217043g = linearLayout;
                        dVar.f217044h = (ViewGroup) linearLayout.findViewById(C0966R.C0970id.hcc);
                        dVar.f217045i = (TextView) linearLayout.findViewById(C0966R.C0970id.hc5);
                        dVar.f217046j = (ImageView) linearLayout.findViewById(C0966R.C0970id.hc_);
                        dVar.f217047k = (ImageView) linearLayout.findViewById(C0966R.C0970id.hca);
                        dVar.f217039c = (ImageView) linearLayout.findViewById(C0966R.C0970id.hc4);
                        dVar.f217048l = (FlexboxLayout) linearLayout.findViewById(C0966R.C0970id.hbw);
                        dVar.f217040d = (ViewGroup) linearLayout.findViewById(C0966R.C0970id.hc8);
                        ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.hc7);
                        dVar.f217041e = imageView;
                        imageView.setClipToOutline(true);
                        dVar.f217041e.setOutlineProvider(new C74233t5(chattingItemDyeingTemplate));
                        if (Build.VERSION.SDK_INT >= 23) {
                            str6 = str12;
                            dVar.f217041e.setForeground(MMApplicationContext.getResources().getDrawable(C0966R.color.UN_BW_0_Alpha_0_3));
                        } else {
                            str6 = str12;
                        }
                        dVar.f217042f = (ImageView) linearLayout.findViewById(C0966R.C0970id.hc9);
                        i6 = C0966R.C0970id.hwn;
                        linearLayout.setTag(C0966R.C0970id.hwn, dVar);
                        linearLayout4.addView(linearLayout);
                    }
                    if (chattingItemDyeingTemplate.mo102951D0(map2, i18)) {
                        linearLayout.setVisibility(8);
                        i7 = i18;
                        str8 = str13;
                        linearLayout2 = linearLayout4;
                        i8 = i5;
                        str7 = str6;
                    } else {
                        linearLayout.setVisibility(0);
                        C73948d dVar2 = (C73948d) linearLayout.getTag(i6);
                        String str18 = map2.get(str15 + ".icon");
                        if (C85875k4.m106211z()) {
                            String str19 = map2.get(str15 + ".dmicon");
                            if (!Util.isNullOrNil(str19)) {
                                str18 = str19;
                            }
                        }
                        dVar2.f217037a.setTextColor(C85875k4.m106176d(m87575S0(map2, str15 + ".color", chattingItemDyeingTemplate.f216867v.mo91565f().getResources().getColor(C0966R.color.a7f))));
                        if (Util.getInt(map2.get(str15 + ".is_rich_text"), 0) == 0) {
                            dVar2.f217037a.setSingleLine(true);
                            dVar2.f217037a.setEllipsize(TextUtils.TruncateAt.END);
                            dVar2.f217037a.setText(str16);
                            str9 = str13;
                            linearLayout3 = linearLayout4;
                            z = true;
                        } else {
                            int i19 = Util.getInt(map2.get(str15 + ".display_line_number"), 1);
                            linearLayout3 = linearLayout4;
                            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "show rich text: %s", Integer.valueOf(i19));
                            dVar2.f217037a.setSingleLine(false);
                            dVar2.f217037a.setText(str16);
                            dVar2.f217037a.setMaxLines(i19);
                            str9 = str13;
                            z = true;
                            ((C76979h) C86312j.m106911c(C76979h.class)).mo107052M6(dVar2.f217037a, 1, false, (Object) null);
                        }
                        boolean isNullOrNil = Util.isNullOrNil(str17) ^ z;
                        dVar2.f217045i.setTextColor(chattingItemDyeingTemplate.f216867v.mo91565f().getResources().getColor(C0966R.color.FG_1));
                        int i25 = Util.getInt(map2.get(str15 + ".is_show_red_dot"), 0);
                        String nullAs = Util.nullAs(map2.get(str15 + ".ext_id"), "");
                        StringBuilder sb = new StringBuilder();
                        sb.append(str15);
                        String str20 = nullAs;
                        sb.append(".business_id");
                        String nullAs2 = Util.nullAs(map2.get(sb.toString()), "");
                        boolean z4 = C31543z5.m39453c() - f4Var.getCreateTime() > FrequentLimiter.WEEK_MILLS;
                        FlexboxLayout.LayoutParams layoutParams = (FlexboxLayout.LayoutParams) dVar2.f217048l.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.f45881f = 0.0f;
                        }
                        int i26 = f4Var3.f230753p0 & (1 << i18);
                        String str21 = str15;
                        Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "get reddot state: %s, %s", Integer.valueOf(i18), Integer.valueOf(i26));
                        if (!(i26 == 0) || i25 != 1 || z4) {
                            i9 = 8;
                            dVar2.f217046j.setVisibility(8);
                            dVar2.f217047k.setVisibility(8);
                            z2 = false;
                        } else {
                            if (!Util.isNullOrNil(str17)) {
                                i9 = 8;
                                dVar2.f217046j.setVisibility(8);
                                dVar2.f217047k.setVisibility(0);
                            } else {
                                i9 = 8;
                                dVar2.f217046j.setVisibility(0);
                                dVar2.f217047k.setVisibility(8);
                                if (layoutParams != null) {
                                    layoutParams.f45881f = 1.0f;
                                }
                            }
                            z2 = true;
                        }
                        dVar2.f217048l.setLayoutParams(layoutParams);
                        if (Util.isNullOrNil(str18)) {
                            dVar2.f217038b.setVisibility(i9);
                            dVar2.f217039c.setVisibility(i9);
                            i15 = 0;
                            dVar2.f217037a.setPadding(0, 0, 0, 0);
                            z3 = false;
                        } else {
                            i15 = 0;
                            if (x8Var2.f218260X) {
                                dVar2.f217038b.setVisibility(i9);
                                dVar2.f217039c.setVisibility(0);
                                chattingItemDyeingTemplate.mo102965R0(dVar2.f217039c, str18, 72, 72);
                                dVar2.f217037a.setPadding(0, 0, 0, 0);
                            } else {
                                dVar2.f217038b.setVisibility(0);
                                dVar2.f217039c.setVisibility(i9);
                                chattingItemDyeingTemplate.mo102965R0(dVar2.f217038b, str18, 72, 72);
                                dVar2.f217037a.setPadding(0, 0, C76577a.m92151b(chattingItemDyeingTemplate.f216867v.mo91565f(), 28), 0);
                            }
                            z3 = true;
                        }
                        if (x8Var2.f218260X) {
                            int h = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3736cp);
                            dVar2.f217044h.setPadding(i15, h, i15, h);
                            float h2 = (float) C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3725ce);
                            dVar2.f217037a.setTextSize(i15, h2);
                            dVar2.f217045i.setTextSize(i15, h2);
                            if (C76577a.m92147C(MMApplicationContext.getContext())) {
                                int A = (C76577a.m92145A(MMApplicationContext.getContext()) - C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3763dc)) - ((int) dVar2.f217037a.getPaint().measureText(str16));
                                if (z3) {
                                    A -= C76577a.m92151b(MMApplicationContext.getContext(), 30);
                                }
                                if (z2) {
                                    A -= C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3736cp);
                                }
                                if (isNullOrNil) {
                                    if (A < ((int) dVar2.f217045i.getPaint().measureText(str17))) {
                                        dVar2.f217045i.setText("");
                                    } else {
                                        dVar2.f217045i.setText(str17);
                                    }
                                }
                            } else {
                                dVar2.f217045i.setText(str17);
                            }
                        } else {
                            int h3 = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3722cc);
                            dVar2.f217044h.setPadding(0, h3, 0, h3);
                            float h4 = (float) C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f357060an0);
                            dVar2.f217037a.setTextSize(0, h4);
                            dVar2.f217045i.setTextSize(0, h4);
                            dVar2.f217045i.setText(str17);
                        }
                        dVar2.f217040d.setVisibility(8);
                        StringBuilder sb4 = new StringBuilder();
                        String str22 = str21;
                        sb4.append(str22);
                        sb4.append(".url");
                        Map<String, String> map3 = map;
                        String str23 = map3.get(sb4.toString());
                        String nullAsNil = Util.nullAsNil(map3.get(str9));
                        int i27 = Util.getInt(map3.get(str22 + ".op_type"), 0);
                        String str24 = map3.get(str22 + ".weapp_username");
                        String nullAsNil2 = Util.nullAsNil(map3.get(str22 + ".general_string"));
                        C74243t8 t8Var = new C74243t8(f4Var, nullAsNil, str23);
                        t8Var.f217964P = i18;
                        t8Var.f217966R = str20;
                        String str25 = nullAs2;
                        t8Var.f217967S = str25;
                        t8Var.f217965Q = i25;
                        dVar2.f217043g.setTag(t8Var);
                        int i28 = i18 + 1;
                        try {
                            gVar = new C104289g(nullAsNil2);
                            i16 = i18;
                        } catch (C79923f e) {
                            i16 = i18;
                            Log.printErrStackTrace("MicroMsg.ChattingItemDyeingTemplate", e, "", new Object[0]);
                            gVar = null;
                        }
                        String nullAs3 = Util.nullAs(map3.get(str22 + ".thumbnail"), "");
                        if (!Util.isNullOrNil(nullAs3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str22);
                            sb5.append(".is_show_play_btn");
                            boolean z5 = Util.getInt(map3.get(sb5.toString()), 0) == 1;
                            dVar2.f217040d.setVisibility(0);
                            str11 = str25;
                            int b = C85875k4.m106184h(chattingItemDyeingTemplate.f216867v.mo91565f()).x - C76577a.m92151b(chattingItemDyeingTemplate.f216867v.mo91565f(), 64);
                            int i29 = (int) (((float) b) / 4.425f);
                            ViewGroup.LayoutParams layoutParams2 = dVar2.f217041e.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.width = b;
                                layoutParams2.height = i29;
                                str10 = nullAsNil2;
                                dVar2.f217041e.setLayoutParams(layoutParams2);
                            } else {
                                str10 = nullAsNil2;
                            }
                            chattingItemDyeingTemplate.mo102965R0(dVar2.f217041e, nullAs3, b, i29);
                            if (z5) {
                                dVar2.f217042f.setVisibility(0);
                            } else {
                                dVar2.f217042f.setVisibility(8);
                            }
                        } else {
                            str10 = nullAsNil2;
                            str11 = str25;
                            dVar2.f217040d.setVisibility(8);
                        }
                        if (i27 == 3 || i27 == 4 || i27 == 5) {
                            str8 = str9;
                            linearLayout2 = linearLayout3;
                            i8 = i5;
                            str7 = str6;
                            i7 = i16;
                            mo102971Y0(dVar2.f217043g, f4Var, map, nullAsNil, i27, str10, 2);
                        } else if (i27 != 1 || TextUtils.isEmpty(str24)) {
                            C73948d dVar3 = dVar2;
                            str8 = str9;
                            linearLayout2 = linearLayout3;
                            i8 = i5;
                            str7 = str6;
                            String str26 = str20;
                            i7 = i16;
                            String str27 = str11;
                            if (i27 == 2) {
                                dVar3.f217043g.setOnClickListener(new C74175q5(this, i28, map, str26, str27));
                            } else if (i27 != 6) {
                                dVar3.f217043g.setOnClickListener(new C74214s5(this, str23, nullAsNil, i28, map, str26, str27, i25, f4Var, i7));
                            } else if (gVar != null) {
                                dVar3.f217043g.setOnClickListener(new C74195r5(this, gVar, map, str26, str27, i25, f4Var, i7));
                            }
                        } else {
                            int i35 = Util.getInt(map3.get(str22 + ".weapp_version"), 0);
                            String str28 = str6;
                            i7 = i16;
                            C74167p5 p5Var = r1;
                            str8 = str9;
                            i8 = i5;
                            linearLayout2 = linearLayout3;
                            str7 = str28;
                            C73948d dVar4 = dVar2;
                            String str29 = nullAsNil;
                            Map<String, String> map4 = map3;
                            C74167p5 p5Var2 = new C74167p5(this, str24, Util.nullAsNil(map3.get(str28)), Util.getInt(map3.get(str22 + ".weapp_state"), 0), i35, map3.get(str22 + ".weapp_path"), i25, f4Var, i7, str29, i28, map, str20, str11);
                            dVar4.f217043g.setOnClickListener(p5Var);
                        }
                    }
                    i18 = i7 + 1;
                    chattingItemDyeingTemplate = this;
                    x8Var2 = x8Var;
                    f4Var3 = f4Var;
                    map2 = map;
                    childCount = i8;
                    linearLayout4 = linearLayout2;
                    str13 = str8;
                    str12 = str7;
                    i17 = 1;
                    r112 = 0;
                }
            }
            return;
        }
        String str30 = str13;
        String str31 = str12;
        C74307x8 x8Var3 = x8Var2;
        x8Var3.f218285y.setVisibility(8);
        Map<String, String> map5 = map;
        String str32 = map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.word");
        String str33 = map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.icon");
        boolean D0 = mo102951D0(map5, 0);
        if (Util.isNullOrNil(str32) || D0) {
            f4Var2 = f4Var;
            obj2 = ".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type";
            num = 8;
            obj = ".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username";
            str2 = str30;
            str = str31;
            i = 1;
            str3 = null;
            x8Var3.f218237A.setVisibility(8);
        } else {
            x8Var3.f218240D.setTextColor(C85875k4.m106176d(m87575S0(map5, ".msg.appmsg.mmreader.template_detail.opitems.opitem.color", this.f216867v.mo91565f().getResources().getColor(C0966R.color.a7f))));
            x8Var3.f218240D.setText(str32);
            if (Util.isNullOrNil(str33)) {
                x8Var3.f218242F.setVisibility(8);
                x8Var3.f218240D.setPadding(0, 0, 0, 0);
            } else {
                x8Var3.f218242F.setVisibility(0);
                mo102965R0(x8Var3.f218242F, str33, 42, 42);
                x8Var3.f218240D.setPadding(0, 0, C76577a.m92151b(this.f216867v.mo91565f(), 16), 0);
            }
            String str34 = map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.url");
            String str35 = str30;
            String nullAsNil3 = Util.nullAsNil(map5.get(str35));
            int i36 = Util.getInt(map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type"), 0);
            String str36 = map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username");
            f4Var2 = f4Var;
            C74243t8 t8Var2 = new C74243t8(f4Var2, nullAsNil3, str34);
            x8Var3.f218237A.setTag(t8Var2);
            x8Var3.f218245I.setTag(t8Var2);
            if (i36 == 3 || i36 == 4 || i36 == 5) {
                str2 = str35;
                obj2 = ".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type";
                num = 8;
                obj = ".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username";
                str = str31;
                i = 1;
                str3 = null;
                mo102971Y0(x8Var3.f218237A, f4Var, map, nullAsNil3, i36, Util.nullAsNil(map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.general_string")), 2);
            } else {
                i = 1;
                if (i36 != 1 || TextUtils.isEmpty(str36)) {
                    str2 = str35;
                    obj2 = ".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type";
                    num = 8;
                    obj = ".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username";
                    str = str31;
                    x8Var3.f218237A.setOnClickListener(new C73895h(str34, nullAsNil3));
                    x8Var3.f218245I.setOnClickListener((View.OnClickListener) null);
                    str3 = null;
                } else {
                    String str37 = str31;
                    C73894g gVar2 = r1;
                    str2 = str35;
                    str = str37;
                    obj2 = ".msg.appmsg.mmreader.template_detail.opitems.opitem.op_type";
                    num = 8;
                    obj = ".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_username";
                    C73894g gVar3 = new C73894g(str36, Util.nullAsNil(map5.get(str37)), Util.getInt(map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_state"), 0), Util.getInt(map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_version"), 0), map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem.weapp_path"), nullAsNil3);
                    C73894g gVar4 = gVar2;
                    x8Var3.f218237A.setOnClickListener(gVar4);
                    x8Var3.f218245I.setOnClickListener(gVar4);
                    str3 = null;
                }
            }
            x8Var3.f218237A.setVisibility(0);
        }
        String str38 = map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.word");
        String str39 = map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.icon");
        boolean D02 = mo102951D0(map5, i);
        if (Util.isNullOrNil(str38) || D02) {
            str5 = str39;
            str4 = str2;
            i2 = 8;
            x8Var3.f218238B.setVisibility(8);
        } else {
            x8Var3.f218241E.setTextColor(C85875k4.m106176d(m87575S0(map5, ".msg.appmsg.mmreader.template_detail.opitems.opitem1.color", this.f216867v.mo91565f().getResources().getColor(C0966R.color.a7f))));
            x8Var3.f218241E.setText(str38);
            if (Util.isNullOrNil(str39)) {
                x8Var3.f218243G.setVisibility(8);
                i4 = 0;
                x8Var3.f218241E.setPadding(0, 0, 0, 0);
            } else {
                i4 = 0;
                x8Var3.f218243G.setVisibility(0);
                mo102965R0(x8Var3.f218243G, str39, 42, 42);
                x8Var3.f218241E.setPadding(0, 0, C76577a.m92151b(this.f216867v.mo91565f(), 16), 0);
            }
            String str40 = map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.url");
            String str41 = str2;
            String nullAsNil4 = Util.nullAsNil(map5.get(str41));
            int i37 = Util.getInt(map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.op_type"), i4);
            String str42 = map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_username");
            x8Var3.f218238B.setTag(new C74243t8(f4Var2, nullAsNil4, str40));
            if (i37 == 3 || i37 == 4 || i37 == 5) {
                str4 = str41;
                str5 = str39;
                mo102971Y0(x8Var3.f218238B, f4Var, map, nullAsNil4, i37, Util.nullAsNil(map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.general_string")), 2);
            } else if (i37 != i || TextUtils.isEmpty(str42)) {
                str4 = str41;
                str5 = str39;
                x8Var3.f218238B.setOnClickListener(new C73897j(str40, nullAsNil4));
            } else {
                int i38 = Util.getInt(map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_version"), 0);
                int i39 = Util.getInt(map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_state"), 0);
                String nullAsNil5 = Util.nullAsNil(map5.get(str));
                C73896i iVar = r1;
                LinearLayout linearLayout5 = x8Var3.f218238B;
                str4 = str41;
                str5 = str39;
                C73896i iVar2 = new C73896i(str42, nullAsNil5, i39, i38, map5.get(".msg.appmsg.mmreader.template_detail.opitems.opitem1.weapp_path"), nullAsNil4);
                linearLayout5.setOnClickListener(iVar2);
            }
            x8Var3.f218238B.setVisibility(0);
            i2 = 8;
        }
        x8Var3.f218244H.setVisibility(i2);
        if (x8Var3.f218237A.getVisibility() == i2 && x8Var3.f218238B.getVisibility() == i2) {
            x8Var3.f218284x.setVisibility(i2);
            View view7 = x8Var3.f218283w;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            num2 = num;
            aVar4.mo10233c(num2);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = x8Var3.f218286z;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(num2);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            num2 = num;
            View view11 = x8Var3.f218286z;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar6.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int dimensionPixelOffset = this.f216867v.mo91572m().getDimensionPixelOffset(C0966R.dimen.f3895i6);
            if (x8Var3.f218237A.getVisibility() == 0 && x8Var3.f218238B.getVisibility() == 0) {
                x8Var3.f218237A.setGravity(17);
                x8Var3.f218238B.setGravity(17);
                i3 = 0;
                x8Var3.f218237A.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                x8Var3.f218238B.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            } else if (x8Var3.f218237A.getVisibility() != 0) {
                i3 = 0;
                if (Util.isNullOrNil(str5)) {
                    x8Var3.f218238B.setGravity(19);
                    x8Var3.f218238B.setPadding(this.f216867v.mo91572m().getDimensionPixelOffset(C0966R.dimen.f3895i6), 0, 0, 0);
                    x8Var3.f218244H.setVisibility(0);
                } else {
                    x8Var3.f218238B.setGravity(17);
                    x8Var3.f218238B.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                }
            } else if (Util.isNullOrNil(str33)) {
                x8Var3.f218237A.setGravity(19);
                i3 = 0;
                x8Var3.f218237A.setPadding(dimensionPixelOffset, 0, 0, 0);
                x8Var3.f218244H.setVisibility(0);
            } else {
                i3 = 0;
                x8Var3.f218237A.setGravity(17);
                x8Var3.f218237A.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            }
            x8Var3.f218284x.setVisibility(i3);
            View view13 = x8Var3.f218283w;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view14 = view13;
            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (x8Var3.f218237A.getVisibility() == 0 && x8Var3.f218238B.getVisibility() == 0) {
            View view15 = x8Var3.f218239C;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(0);
            View view16 = view15;
            C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view17 = x8Var3.f218239C;
            C9556a aVar9 = new C9556a();
            aVar9.mo10233c(num2);
            View view18 = view17;
            C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view18, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        String nullAsNil6 = Util.nullAsNil(map5.get(str4));
        int i44 = Util.getInt(map5.get(obj2), 0);
        String str43 = map5.get(obj);
        if (C72996z1.m85804J4(nullAsNil6) || x8Var3.f218237A.getVisibility() == 8 || x8Var3.f218238B.getVisibility() != 8 || i44 != 1 || !C72996z1.m85804J4(str43)) {
            View view19 = x8Var3.f218245I;
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(num2);
            C117292a.m165358d(view19, aVar10.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view19, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(cls)).mo106879N2(str43);
        String str44 = N2 == null ? str3 : N2.field_brandIconURL;
        String str45 = N2 == null ? str43 : N2.field_nickname;
        C20828a.m22825b().mo32519h(str44, x8Var3.f218246J, this.f216847G);
        x8Var3.f218247K.setText(str45);
        if (N2 == null) {
            ((C76629w0) C86312j.m106911c(cls)).mo106884tG(str43, new C73898k(x8Var3, str43));
        }
        View view20 = x8Var3.f218245I;
        C9556a aVar11 = new C9556a();
        aVar11.mo10233c(0);
        View view21 = view20;
        C117292a.m165358d(view21, aVar11.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view20.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
        C117292a.m165359e(view21, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingButtons", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Lcom/tencent/mm/storage/MsgInfo;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        x8Var3.f218284x.setVisibility(8);
    }

    /* renamed from: I0 */
    public final void mo102956I0(C74307x8 x8Var, Map<String, String> map) {
        String str;
        C74307x8 x8Var2 = x8Var;
        Map<String, String> map2 = map;
        Class cls = C76979h.class;
        Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "[fillingCustomView]");
        x8Var2.f218282v.setVisibility(8);
        ViewGroup viewGroup = (ViewGroup) x8Var2.f218282v.getParent();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.bye);
        String str2 = null;
        if (findViewById == null) {
            findViewById = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bre, (ViewGroup) null);
            C74143n8 n8Var = new C74143n8();
            n8Var.f217650c = (ImageView) findViewById.findViewById(C0966R.C0970id.a1p);
            n8Var.f217649b = (TextView) findViewById.findViewById(C0966R.C0970id.hft);
            n8Var.f217648a = (TextView) findViewById.findViewById(C0966R.C0970id.knx);
            findViewById.setTag(n8Var);
            viewGroup.addView(findViewById);
        }
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingCustomView", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingCustomView", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C74143n8 n8Var2 = (C74143n8) findViewById.getTag();
        String str3 = map2.get(".msg.appmsg.mmreader.category.item.schedule_username");
        String str4 = map2.get(".msg.appmsg.mmreader.category.item.schedule_nickname");
        String str5 = map2.get(".msg.appmsg.mmreader.category.item.schedule_time");
        int i = Util.getInt(map2.get(".msg.appmsg.mmreader.category.item.schedule_remindsubtype"), -1);
        n8Var2.f217648a.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(n8Var2.f217648a.getContext(), map2.get(".msg.appmsg.mmreader.category.item.schedule_content")));
        TextView textView = n8Var2.f217649b;
        C76979h hVar = (C76979h) C86312j.m106911c(cls);
        Context context = n8Var2.f217648a.getContext();
        if (Util.isNullOrNil(str3)) {
            str = "";
        } else {
            if (C72996z1.m85820U5(str3)) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str3);
                if (z1Var != null) {
                    str2 = Util.isNullOrNil(z1Var.mo73969n2()) ? z1Var.getNickname() : z1Var.mo73969n2();
                }
            } else {
                C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(str3);
                str2 = z1Var2.mo62898f() == null ? z1Var2.mo62909j3() : z1Var2.mo62898f();
            }
            if (Util.isNullOrNil(str2)) {
                Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "[getDisplayName] username:%s nickname:%s", str3, str4);
                if (Util.isNullOrNil(str4)) {
                    str4 = MMApplicationContext.getContext().getString(C0966R.string.bba);
                }
                str = str4;
            } else {
                str = str2;
            }
        }
        textView.setText(hVar.mo107057T1(context, str));
        if (i == 2) {
            n8Var2.f217650c.setImageDrawable(MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.btt));
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(n8Var2.f217650c, str3);
        }
    }

    /* renamed from: J0 */
    public final void mo102957J0(C74307x8 x8Var, Map<String, String> map) {
        LinearLayout linearLayout;
        int i;
        int i2;
        C74307x8 x8Var2 = x8Var;
        Map<String, String> map2 = map;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= 100) {
                break;
            }
            String str = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
            if (i3 != 0) {
                str = str + i3;
            }
            String str2 = map2.get(str + ".value.word");
            String str3 = map2.get(str + ".key.word");
            if (Util.isNullOrNil(str2) && Util.isNullOrNil(str3)) {
                Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "fillingLines: lines count=%d", Integer.valueOf(i3));
                break;
            }
            C74284v8 v8Var = new C74284v8();
            v8Var.f218178b = str2;
            v8Var.f218177a = Util.nullAsNil(str3);
            if (!C85875k4.m106211z()) {
                v8Var.f218179c = m87575S0(map2, str + ".key.wxcolors.wxcolor", m87575S0(map2, str + ".key.color", f216838T0));
                v8Var.f218180d = m87575S0(map2, str + ".value.wxcolors.wxcolor", m87575S0(map2, str + ".value.color", this.f216867v.mo91565f().getResources().getColor(C0966R.color.a7f)));
            } else {
                v8Var.f218179c = m87575S0(map2, str + ".key.wxcolors.wxcolor1", m87575S0(map2, str + ".key.wxcolors.wxcolor", m87575S0(map2, str + ".key.color", f216838T0)));
                int S0 = m87575S0(map2, str + ".value.wxcolors.wxcolor1", m87575S0(map2, str + ".value.wxcolors.wxcolor", m87575S0(map2, str + ".value.color", this.f216867v.mo91565f().getResources().getColor(C0966R.color.a7f))));
                v8Var.f218180d = S0;
                v8Var.f218180d = C85875k4.m106176d(S0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".key.hide");
            v8Var.f218181e = Util.getInt(map2.get(sb.toString()), 0) != 0;
            String str4 = v8Var.f218177a;
            if (Util.isNullOrNil(str4)) {
                i2 = 1;
                i = 0;
            } else {
                int i5 = 0;
                i = 0;
                while (i5 < str4.length()) {
                    int i6 = i5 + 1;
                    i = str4.substring(i5, i6).matches("[Α-￥]") ? i + 2 : i + 1;
                    i5 = i6;
                }
                i2 = 1;
            }
            int i7 = (i + i2) / 2;
            if (i7 > i4) {
                i4 = i7;
            }
            arrayList.add(v8Var);
            i3++;
        }
        int i8 = 8;
        if (i4 > 8) {
            i4 = 8;
        }
        LinearLayout linearLayout2 = x8Var2.f218282v;
        linearLayout2.setVisibility(0);
        View findViewById = ((ViewGroup) x8Var2.f218282v.getParent()).findViewById(C0966R.C0970id.bye);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (linearLayout2.getChildCount() > arrayList.size()) {
            if (arrayList.size() == 0) {
                linearLayout2.removeAllViews();
            } else {
                linearLayout2.removeViews(arrayList.size(), linearLayout2.getChildCount() - arrayList.size());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        int childCount = linearLayout2.getChildCount();
        int i9 = 0;
        while (i9 < arrayList.size()) {
            C74284v8 v8Var2 = (C74284v8) arrayList.get(i9);
            if (i9 < childCount) {
                linearLayout = (LinearLayout) linearLayout2.getChildAt(i9);
            } else {
                linearLayout = (LinearLayout) LayoutInflater.from(this.f216867v.mo91565f()).inflate(C0966R.C0971layout.f6835pu, (ViewGroup) null, false);
                C74292w8 w8Var = new C74292w8();
                w8Var.f218191a = (TextView) linearLayout.findViewById(C0966R.C0970id.foa);
                w8Var.f218192b = (TextView) linearLayout.findViewById(C0966R.C0970id.foj);
                linearLayout.setTag(w8Var);
                linearLayout.setImportantForAccessibility(1);
                linearLayout2.addView(linearLayout);
            }
            if (i9 == 0) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), 0, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
            }
            C74292w8 w8Var2 = (C74292w8) linearLayout.getTag();
            if (v8Var2.f218181e) {
                w8Var2.f218191a.setVisibility(i8);
            } else {
                w8Var2.f218191a.setVisibility(0);
                w8Var2.f218191a.setEms(i4);
                w8Var2.f218191a.setTextColor(C85875k4.m106176d(v8Var2.f218179c));
                w8Var2.f218191a.setText(v8Var2.f218177a);
            }
            w8Var2.f218192b.setTextColor(C85875k4.m106176d(v8Var2.f218180d));
            w8Var2.f218192b.setText(v8Var2.f218178b);
            w8Var2.f218191a.setImportantForAccessibility(2);
            w8Var2.f218192b.setImportantForAccessibility(2);
            int i15 = Util.getInt(map2.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1);
            if (((C79375p) this.f216867v.f193278b.mo102812a(C79375p.class)).mo70111L3()) {
                if (i15 == 0 || i15 == 1 || i15 == 3) {
                    View view2 = x8Var2.f218261a;
                    if (view2 != null) {
                        view2.setBackgroundResource(C0966R.C0969drawable.f4906qz);
                    }
                    w8Var2.f218192b.setBackgroundResource(C0966R.C0969drawable.f4773mj);
                    w8Var2.f218192b.setTag(new C73913u(v8Var2.f218177a, v8Var2.f218178b, v8Var2.f218181e));
                    w8Var2.f218192b.setLongClickable(true);
                    w8Var2.f218192b.setClickable(true);
                    TextView textView = w8Var2.f218192b;
                    C67391b bVar = this.f216867v;
                    if (this.f216870x0 == null) {
                        this.f216870x0 = new C73910t(bVar);
                    }
                    textView.setOnLongClickListener(this.f216870x0);
                    TextView textView2 = w8Var2.f218192b;
                    if (this.f216866p0 == null) {
                        this.f216866p0 = new C73909s((C73891d) null);
                    }
                    textView2.setOnClickListener(this.f216866p0);
                    sb4.append(Util.nullAs(v8Var2.f218177a, ""));
                    sb4.append(XVFSFile.PATH_SEPARATOR);
                    sb4.append(Util.nullAs(v8Var2.f218178b, ""));
                    sb4.append("\n");
                    i9++;
                    i8 = 8;
                }
            }
            View view3 = x8Var2.f218261a;
            if (view3 != null) {
                view3.setBackgroundResource(C0966R.C0969drawable.b4y);
            }
            w8Var2.f218192b.setTag((Object) null);
            w8Var2.f218192b.setLongClickable(false);
            w8Var2.f218192b.setClickable(false);
            if (C11171e.m11046c(16)) {
                w8Var2.f218192b.setBackground((Drawable) null);
            } else {
                w8Var2.f218192b.setBackgroundDrawable((Drawable) null);
            }
            sb4.append(Util.nullAs(v8Var2.f218177a, ""));
            sb4.append(XVFSFile.PATH_SEPARATOR);
            sb4.append(Util.nullAs(v8Var2.f218178b, ""));
            sb4.append("\n");
            i9++;
            i8 = 8;
        }
        C22894a.C22897b bVar2 = this.f216862W;
        String sb5 = sb4.toString();
        bVar2.getClass();
        C87412m.m108594g(sb5, "<set-?>");
        bVar2.f65823f = sb5;
        if (linearLayout2.getChildCount() == 0) {
            View view4 = x8Var2.f218281u;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            linearLayout2.setVisibility(8);
            return;
        }
        if (Util.getInt(map2.get(".msg.appmsg.mmreader.template_detail.line_content.topline.key.hide_dash_line"), 0) != 0) {
            View view6 = x8Var2.f218281u;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view8 = x8Var2.f218281u;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view9 = view8;
            C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingLines", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        linearLayout2.setVisibility(0);
    }

    /* renamed from: K0 */
    public final void mo102958K0(C74307x8 x8Var, Map<String, String> map, C72963f4 f4Var) {
        C74307x8 x8Var2 = x8Var;
        Map<String, String> map2 = map;
        C72963f4 f4Var2 = f4Var;
        String nullAsNil = Util.nullAsNil(map2.get(".msg.fromusername"));
        boolean h0 = ((C76073b) C86312j.m106911c(C76073b.class)).mo94598h0(nullAsNil);
        if (this.f216864Y && x8Var2.f218269i.getTag(C0966R.C0970id.hcu) != null) {
            Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew handled by app single talker chat");
            x8Var2.f218270j.setTag(C0966R.C0970id.hcu, f4Var2);
            x8Var2.f218270j.setOnClickListener(this.f216869x);
            View view = x8Var2.f218270j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = x8Var2.f218269i;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = x8Var2.f218275o;
            view5.setPadding(view5.getPaddingLeft(), view5.getPaddingTop(), view5.getPaddingRight(), 0);
        } else if (h0 && "notifymessage".equals(f4Var.mo108768t())) {
            Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew handled by app brand");
            x8Var2.f218270j.setTag((Object) null);
            View view6 = x8Var2.f218270j;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (!C72996z1.m85840k5(f4Var.mo108768t()) || !C47984k.m53340n(nullAsNil) || !mo102964Q0(mo102962O0(map2))) {
            boolean z = true;
            if (Util.getInt(map2.get(".msg.appmsg.mmreader.template_header.show_complaint_button"), 0) != 1) {
                z = false;
            }
            if (!z) {
                Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew showMoreV false");
                x8Var2.f218269i.setTag((Object) null);
                x8Var2.f218270j.setTag((Object) null);
                View view8 = x8Var2.f218269i;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view9 = view8;
                C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view10 = x8Var2.f218270j;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(8);
                View view11 = view10;
                C117292a.m165358d(view11, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            this.f216871y.f216920d = x8Var2;
            if (x8Var2.f218264d.getVisibility() == 0) {
                x8Var2.f218269i.setTag(f4Var2);
                x8Var2.f218269i.setOnClickListener(this.f216871y);
                View view12 = x8Var2.f218269i;
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar6.mo10233c(0);
                View view13 = view12;
                C117292a.m165358d(view13, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view14 = x8Var2.f218270j;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view15 = view14;
                C117292a.m165358d(view15, aVar7.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view15, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (x8Var2.f218275o.getVisibility() == 0) {
                x8Var2.f218270j.setTag(f4Var2);
                x8Var2.f218270j.setOnClickListener(this.f216871y);
                View view16 = x8Var2.f218270j;
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar8.mo10233c(0);
                View view17 = view16;
                C117292a.m165358d(view17, aVar8.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view18 = x8Var2.f218269i;
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(8);
                View view19 = view18;
                C117292a.m165358d(view19, aVar9.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view18.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view19, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                x8Var2.f218269i.setTag((Object) null);
                x8Var2.f218270j.setTag((Object) null);
                View view20 = x8Var2.f218269i;
                C9556a aVar10 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar10.mo10233c(8);
                View view21 = view20;
                C117292a.m165358d(view21, aVar10.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view20.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view21, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view22 = x8Var2.f218270j;
                C9556a aVar11 = new C9556a();
                aVar11.mo10233c(8);
                View view23 = view22;
                C117292a.m165358d(view23, aVar11.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view22.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(view23, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            Log.m105924i("MicroMsg.ChattingItemDyeingTemplate", "fillingMoreVNew handled by biz subscribe msg");
            x8Var2.f218270j.setTag((Object) null);
            View view24 = x8Var2.f218270j;
            C9556a aVar12 = new C9556a();
            ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
            aVar12.mo10233c(8);
            View view25 = view24;
            C117292a.m165358d(view25, aVar12.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view24.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view25, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingMoreVNew", "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x06fa  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0850  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0852  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0855  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x08ca  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x090c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0b27  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0b45  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0b49  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0b5f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0b71  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0ba5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0d1f  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0db3  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0dbe  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0ecb  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0efd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0533  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102959L0(com.tencent.p014mm.p136ui.chatting.viewitems.C74191q8 r69, java.util.Map<java.lang.String, java.lang.String> r70, com.tencent.p014mm.storage.C72963f4 r71, uj3.C78208e r72, int r73) {
        /*
            r68 = this;
            r9 = r68
            r10 = r69
            r11 = r70
            r8 = r71
            r0 = r72
            java.lang.Class<kr0.w0> r12 = kr0.C76629w0.class
            java.lang.Class<gw0.b> r13 = gw0.C76073b.class
            com.tencent.mm.ui.chatting.viewitems.x8 r15 = r10.f217781d
            java.lang.String r1 = ".msg.appmsg.mmreader.template_detail.template_ext.type"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r14 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r14)
            r6 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r3 = 1
            java.lang.String r2 = "notifymessage"
            java.lang.String r14 = ".msg.fromusername"
            if (r1 != r3) goto L_0x0061
            java.lang.String r1 = ".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r17 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r1 = ".msg.appmsg.mmreader.template_detail.template_ext.app.display_name"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r18 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r19 = 0
            r1 = r68
            r22 = r2
            r2 = r15
            r3 = r17
            r4 = r18
            r24 = r5
            r5 = r70
            r10 = 8
            r6 = r71
            r10 = r7
            r7 = r19
            r1.mo102953F0(r2, r3, r4, r5, r6, r7)
            goto L_0x0098
        L_0x0061:
            r22 = r2
            r24 = r5
            r10 = r7
            java.lang.String r1 = ".msg.appmsg.mmreader.template_header.show_icon_and_display_name"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = ".msg.appmsg.mmreader.template_header.icon_url"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r1 = ".msg.appmsg.mmreader.template_header.display_name"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r7 = 1
            r1 = r68
            r2 = r15
            r5 = r70
            r6 = r71
            r1.mo102953F0(r2, r3, r4, r5, r6, r7)
        L_0x0098:
            r19 = r12
            r12 = r24
            r7 = 0
            goto L_0x0261
        L_0x009f:
            android.widget.ImageView r1 = r15.f218268h
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r7 = r24
            r2.mo10233c(r7)
            java.lang.Object[] r26 = r2.mo10232b()
            java.lang.String r27 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r28 = "fillingAvatarAndName"
            java.lang.String r29 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r1
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r26 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r27 = "fillingAvatarAndName"
            java.lang.String r28 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            java.lang.String r1 = r71.mo108768t()
            r6 = r22
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x021f
            boolean r1 = r9.f216864Y
            if (r1 != 0) goto L_0x021f
            java.lang.Object r1 = r11.get(r14)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            di3.d r1 = di3.C86312j.m106911c(r13)
            gw0.b r1 = (gw0.C76073b) r1
            boolean r1 = r1.mo94598h0(r5)
            if (r1 == 0) goto L_0x0142
            di3.d r1 = di3.C86312j.m106911c(r12)
            kr0.w0 r1 = (kr0.C76629w0) r1
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r4 = r1.mo106879N2(r5)
            if (r4 != 0) goto L_0x011a
            r17 = 0
            goto L_0x011e
        L_0x011a:
            java.lang.String r1 = r4.field_brandIconURL
            r17 = r1
        L_0x011e:
            android.widget.ImageView r2 = r15.f218265e
            ck3.b r3 = r9.f216867v
            r1 = r68
            r0 = r4
            r4 = r5
            r18 = r5
            r5 = r71
            r19 = r12
            r12 = r6
            r6 = r17
            r22 = r12
            r12 = r7
            r7 = r70
            r1.mo102954G0(r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x013d
            r1 = r18
            r5 = r1
            goto L_0x016b
        L_0x013d:
            java.lang.String r5 = r0.field_nickname
            r1 = r18
            goto L_0x016b
        L_0x0142:
            r18 = r5
            r22 = r6
            r19 = r12
            r12 = r7
            android.widget.ImageView r2 = r15.f218265e
            ck3.b r3 = r9.f216867v
            r6 = 0
            r1 = r68
            r4 = r18
            r5 = r71
            r7 = r70
            r1.mo102954G0(r2, r3, r4, r5, r6, r7)
            ck3.b r0 = r9.f216867v
            java.lang.Class<zj3.g> r1 = zj3.C79357g.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.g r0 = (zj3.C79357g) r0
            r1 = r18
            java.lang.CharSequence r5 = r0.getDisplayName(r1)
        L_0x016b:
            android.widget.TextView r0 = r15.f218266f
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            ck3.b r3 = r9.f216867v
            android.app.Activity r3 = r3.mo91565f()
            android.widget.TextView r4 = r15.f218266f
            float r4 = r4.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r3, r5, r4)
            r0.setText(r2)
            di3.d r0 = di3.C86312j.m106911c(r13)
            gw0.b r0 = (gw0.C76073b) r0
            boolean r0 = r0.mo94598h0(r1)
            if (r0 == 0) goto L_0x01a7
            android.view.View r0 = r15.f218264d
            com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
            r2.<init>((com.tencent.p014mm.storage.C72963f4) r8, (java.lang.String) r1)
            r0.setTag(r2)
            android.view.View r0 = r15.f218264d
            android.view.View$OnClickListener r1 = r9.f216872z
            r0.setOnClickListener(r1)
            r7 = 0
            goto L_0x01e2
        L_0x01a7:
            android.view.View r0 = r15.f218264d
            com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
            ck3.b r3 = r9.f216867v
            boolean r3 = r3.mo91583x()
            if (r3 == 0) goto L_0x01ba
            ck3.b r3 = r9.f216867v
            java.lang.String r4 = r3.mo91577r()
            goto L_0x01bb
        L_0x01ba:
            r4 = 0
        L_0x01bb:
            r2.<init>((java.lang.String) r1, (java.lang.String) r4)
            r0.setTag(r2)
            java.lang.String r0 = ".msg.appmsg.mmreader.template_detail.template_ext.block"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x01d7
            android.view.View r0 = r15.f218264d
            r7 = 0
            r0.setOnClickListener(r7)
            goto L_0x01e2
        L_0x01d7:
            r7 = 0
            android.view.View r0 = r15.f218264d
            com.tencent.mm.ui.chatting.viewitems.v4 r2 = new com.tencent.mm.ui.chatting.viewitems.v4
            r2.<init>(r9, r1, r11)
            r0.setOnClickListener(r2)
        L_0x01e2:
            android.view.View r0 = r15.f218264d
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r10)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r28 = "fillingAvatarAndName"
            java.lang.String r29 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r26 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r27 = "fillingAvatarAndName"
            java.lang.String r28 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0261
        L_0x021f:
            r22 = r6
            r19 = r12
            r12 = r7
            r7 = 0
            android.view.View r0 = r15.f218264d
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r12)
            java.lang.Object[] r33 = r1.mo10232b()
            java.lang.String r34 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r35 = "fillingAvatarAndName"
            java.lang.String r36 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r37 = "android/view/View_EXEC_"
            java.lang.String r38 = "setVisibility"
            java.lang.String r39 = "(I)V"
            r32 = r0
            j20.C117292a.m165358d(r32, r33, r34, r35, r36, r37, r38, r39)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r33 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r34 = "fillingAvatarAndName"
            java.lang.String r35 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            j20.C117292a.m165359e(r32, r33, r34, r35, r36, r37, r38)
        L_0x0261:
            java.lang.String r0 = ".msg.appmsg.mmreader.template_header.display_name_desc"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0281
            android.widget.TextView r1 = r15.f218250N
            r1.setText(r0)
            android.widget.TextView r0 = r15.f218250N
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x028e
        L_0x0281:
            r1 = 0
            android.widget.TextView r0 = r15.f218250N
            r0.setText(r6)
            android.widget.TextView r0 = r15.f218250N
            r2 = 8
            r0.setVisibility(r2)
        L_0x028e:
            java.lang.String r0 = ".msg.appmsg.mmreader.template_header.show_right_icon_and_desc_name"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            r5 = 1
            if (r0 != r5) goto L_0x029f
            r3 = 1
            goto L_0x02a0
        L_0x029f:
            r3 = 0
        L_0x02a0:
            r0 = -1
            r4 = 3
            if (r3 == 0) goto L_0x0312
            android.view.ViewGroup r2 = r15.f218251O
            r2.setVisibility(r1)
            java.lang.String r1 = ".msg.appmsg.mmreader.template_header.right_icon_url"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r2 = ".msg.appmsg.mmreader.template_header.right_desc_name"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.String r3 = ".msg.appmsg.mmreader.template_header.header_jump_type"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r0)
            if (r3 != r4) goto L_0x02e0
            android.widget.ImageView r1 = r15.f218252P
            r3 = 2131233408(0x7f080a80, float:1.8082953E38)
            r1.setImageResource(r3)
            android.widget.ImageView r1 = r15.f218252P
            r3 = 0
            r1.setVisibility(r3)
        L_0x02dd:
            r1 = 8
            goto L_0x0300
        L_0x02e0:
            r3 = 0
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r16 != 0) goto L_0x02f4
            android.widget.ImageView r4 = r15.f218252P
            r0 = 72
            r9.mo102965R0(r4, r1, r0, r0)
            android.widget.ImageView r0 = r15.f218252P
            r0.setVisibility(r3)
            goto L_0x02dd
        L_0x02f4:
            android.widget.ImageView r0 = r15.f218252P
            r0.setImageBitmap(r7)
            android.widget.ImageView r0 = r15.f218252P
            r1 = 8
            r0.setVisibility(r1)
        L_0x0300:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x030c
            android.widget.TextView r0 = r15.f218253Q
            r0.setText(r2)
            goto L_0x0319
        L_0x030c:
            android.widget.TextView r0 = r15.f218253Q
            r0.setText(r6)
            goto L_0x0319
        L_0x0312:
            r1 = 8
            android.view.ViewGroup r0 = r15.f218251O
            r0.setVisibility(r1)
        L_0x0319:
            java.lang.String r0 = ".msg.appmsg.mmreader.template_header.hide_icon_and_display_name_line"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            if (r0 == 0) goto L_0x0331
            android.view.View r0 = r15.f218264d
            r1 = 2131234067(0x7f080d13, float:1.808429E38)
            r0.setBackgroundResource(r1)
            goto L_0x0345
        L_0x0331:
            android.view.View r0 = r15.f218264d
            int r0 = r0.getPaddingLeft()
            android.view.View r1 = r15.f218264d
            r2 = 2131233600(0x7f080b40, float:1.8083342E38)
            r1.setBackgroundResource(r2)
            android.view.View r1 = r15.f218264d
            r2 = 0
            r1.setPadding(r0, r2, r2, r2)
        L_0x0345:
            r0 = 23
            boolean r1 = p206nj.C11171e.m11046c(r0)
            if (r1 == 0) goto L_0x035f
            android.view.View r1 = r15.f218264d
            ck3.b r2 = r9.f216867v
            android.app.Activity r2 = r2.mo91565f()
            r3 = 2131231938(0x7f0804c2, float:1.8079971E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r1.setForeground(r2)
        L_0x035f:
            java.lang.String r1 = ".msg.appmsg.mmreader.template_header.ignore_hide_title_and_time"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            if (r1 != 0) goto L_0x037d
            java.lang.String r1 = ".msg.appmsg.mmreader.template_header.hide_title_and_time"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r16 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            r1 = r16
            goto L_0x037e
        L_0x037d:
            r1 = 0
        L_0x037e:
            java.lang.String r3 = ".msg.appmsg.mmreader.template_header.hide_title"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r2)
            android.widget.TextView r4 = r15.f218271k
            r7 = 8
            r4.setVisibility(r7)
            if (r1 != 0) goto L_0x03d8
            if (r3 != 0) goto L_0x03d8
            r9.f216856Q = r5
            android.widget.TextView r4 = r15.f218271k
            r4.setVisibility(r2)
            java.lang.String r2 = ".msg.appmsg.mmreader.template_header.title"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r9.f216854N = r2
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.String r4 = ".msg.appmsg.mmreader.template_header.title_color"
            int r2 = m87575S0(r11, r4, r2)
            android.widget.TextView r4 = r15.f218271k
            int r2 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r2)
            r4.setTextColor(r2)
            android.widget.TextView r2 = r15.f218271k
            java.lang.String r4 = r9.f216854N
            r2.setText(r4)
            android.widget.TextView r2 = r15.f218271k
            r4 = 0
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            r2.measure(r7, r0)
            android.widget.TextView r0 = r15.f218271k
            int r0 = r0.getMeasuredWidth()
            r9.f216858S = r0
        L_0x03d8:
            java.lang.String r0 = ".msg.appmsg.mmreader.template_header.first_data"
            java.lang.Object r2 = r11.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            int r4 = f216839U0
            java.lang.String r7 = ".msg.appmsg.mmreader.template_header.first_color"
            int r4 = m87575S0(r11, r7, r4)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r5 = 2
            if (r7 == 0) goto L_0x03fd
            android.widget.TextView r4 = r15.f218274n
            r7 = 8
            r4.setVisibility(r7)
            r24 = r0
            goto L_0x0431
        L_0x03fd:
            android.widget.TextView r7 = r15.f218274n
            int r4 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r4)
            r7.setTextColor(r4)
            android.widget.TextView r4 = r15.f218274n
            r4.setText(r2)
            android.widget.TextView r4 = r15.f218274n
            r7 = 0
            r4.setVisibility(r7)
            r4 = r73
            if (r4 != r5) goto L_0x042a
            android.widget.TextView r4 = r15.f218274n
            ck3.b r5 = r9.f216867v
            android.content.res.Resources r5 = r5.mo91572m()
            r24 = r0
            r0 = 2131165553(0x7f070171, float:1.7945326E38)
            int r0 = r5.getDimensionPixelOffset(r0)
            r4.setPadding(r7, r0, r7, r7)
            goto L_0x0431
        L_0x042a:
            r24 = r0
            android.widget.TextView r0 = r15.f218274n
            r0.setPadding(r7, r7, r7, r7)
        L_0x0431:
            if (r1 == 0) goto L_0x0479
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x0479
            android.view.View r0 = r15.f218275o
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r1.mo10233c(r12)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r28 = "fillingHeader"
            java.lang.String r29 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;I)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r26 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r27 = "fillingHeader"
            java.lang.String r28 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;I)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0501
        L_0x0479:
            if (r3 == 0) goto L_0x04c0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 == 0) goto L_0x04c0
            android.view.View r0 = r15.f218275o
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r1.mo10233c(r12)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r28 = "fillingHeader"
            java.lang.String r29 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;I)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r26 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r27 = "fillingHeader"
            java.lang.String r28 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;I)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0501
        L_0x04c0:
            r1 = 1
            r9.f216856Q = r1
            android.view.View r0 = r15.f218275o
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r1.mo10233c(r10)
            java.lang.Object[] r26 = r1.mo10232b()
            java.lang.String r27 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r28 = "fillingHeader"
            java.lang.String r29 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;I)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r0
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r26 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r27 = "fillingHeader"
            java.lang.String r28 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;I)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x0501:
            wd0.a$b r0 = r9.f216862W
            r0.f65818a = r6
            r1 = 0
            r0.f65819b = r1
            r0.f65820c = r6
            r0.f65821d = r1
            r0.f65822e = r6
            r0.f65823f = r6
            r0.f65824g = r1
            r0.f65825h = r6
            r9.f216857R = r1
            java.lang.Object r0 = r11.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            di3.d r1 = di3.C86312j.m106911c(r13)
            gw0.b r1 = (gw0.C76073b) r1
            boolean r1 = r1.mo94598h0(r0)
            r2 = 2131833777(0x7f1133b1, float:1.9300646E38)
            java.lang.String r12 = "MicroMsg.ChattingItemDyeingTemplate"
            java.lang.String r5 = "<set-?>"
            if (r1 == 0) goto L_0x06fa
            int r0 = r9.mo102962O0(r11)
            boolean r0 = r9.mo102964Q0(r0)
            java.lang.String r1 = r71.mo108768t()
            r3 = r22
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0554
            r41 = r5
            r40 = r6
            r26 = r10
            r22 = r13
            r25 = r14
            r8 = 1
            goto L_0x0639
        L_0x0554:
            r1 = 1
            r9.f216857R = r1
            java.lang.Object r3 = r11.get(r14)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r3 = ".msg.appmsg.mmreader.template_detail.template_ext.is_audio_template"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r7 = 0
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r7)
            if (r3 != r1) goto L_0x0572
            r7 = 1
            goto L_0x0573
        L_0x0572:
            r7 = 0
        L_0x0573:
            wd0.a$b r1 = r9.f216862W
            r1.getClass()
            gy3.C87412m.m108594g(r4, r5)
            r1.f65818a = r4
            wd0.a$b r1 = r9.f216862W
            r3 = 2
            r1.f65819b = r3
            ck3.b r1 = r9.f216867v
            java.lang.Class<xi.i> r3 = p270xi.C66282i.class
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r3)
            xi.i r1 = (p270xi.C66282i) r1
            xi.k r3 = r9.f216845E
            r1.mo90405j4(r3)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnWxaOptionsChangedEvent> r1 = r9.f216844D
            r1.alive()
            if (r0 == 0) goto L_0x063d
            di3.d r0 = di3.C86312j.m106911c(r19)
            kr0.w0 r0 = (kr0.C76629w0) r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo106879N2(r4)
            if (r0 == 0) goto L_0x05ab
            java.lang.String r0 = r0.field_appId
            r9.f216850J = r0
            goto L_0x05b9
        L_0x05ab:
            di3.d r0 = di3.C86312j.m106911c(r19)
            kr0.w0 r0 = (kr0.C76629w0) r0
            com.tencent.mm.ui.chatting.viewitems.k5 r1 = new com.tencent.mm.ui.chatting.viewitems.k5
            r1.<init>(r9)
            r0.mo106884tG(r4, r1)
        L_0x05b9:
            android.widget.LinearLayout r0 = r15.f218248L
            r1 = 8
            r0.setVisibility(r1)
            r9.mo102970X0(r15, r1)
            android.widget.TextView r0 = r15.f218249M
            ck3.b r1 = r9.f216867v
            android.content.res.Resources r1 = r1.mo91572m()
            java.lang.String r1 = r1.getString(r2)
            r0.setText(r1)
            rd0.c$c r0 = r9.f216848H
            r3 = 1
            r0.f62963a = r3
            r0.f62964b = r3
            td0.a$a r0 = td0.C22478a.f63656d
            java.lang.String r1 = r9.f216849I
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.widget.LinearLayout r3 = r15.f218248L
            int r3 = r3.hashCode()
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r0.mo35627b(r1, r2)
            java.lang.String r3 = r9.f216849I
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.widget.LinearLayout r2 = r15.f218248L
            int r2 = r2.hashCode()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = r1.toString()
            com.tencent.mm.ui.chatting.viewitems.l5 r1 = new com.tencent.mm.ui.chatting.viewitems.l5
            r19 = r1
            r22 = r13
            r13 = r2
            r2 = r68
            r25 = r14
            r21 = 2
            r23 = 1
            r14 = r3
            r3 = r4
            r26 = r10
            r10 = r4
            r4 = r7
            r7 = r5
            r8 = 1
            r5 = r70
            r40 = r6
            r6 = r71
            r41 = r7
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.mo35626a(r14, r13, r1)
            rd0.c r0 = r9.f216853M
            java.lang.String r1 = r9.f216849I
            r0.mo35363d(r10, r1)
        L_0x0639:
            r8 = r71
            r14 = 1
            goto L_0x069e
        L_0x063d:
            r41 = r5
            r40 = r6
            r26 = r10
            r22 = r13
            r25 = r14
            r8 = 1
            r10 = r4
            rd0.c$c r0 = r9.f216848H
            r1 = 0
            r0.f62964b = r1
            di3.d r0 = di3.C86312j.m106911c(r19)
            kr0.w0 r0 = (kr0.C76629w0) r0
            com.tencent.mm.plugin.appbrand.config.WxaAttributes r0 = r0.mo106879N2(r10)
            if (r0 == 0) goto L_0x0670
            java.lang.String r1 = r0.field_appId
            r9.f216850J = r1
            int r0 = r0.field_appOpt
            r0 = r0 & r8
            if (r0 <= 0) goto L_0x0665
            r3 = 1
            goto L_0x0666
        L_0x0665:
            r3 = 0
        L_0x0666:
            rd0.c$c r0 = r9.f216848H
            r1 = r3 ^ 1
            r0.f62963a = r1
            r8 = r71
            r14 = 1
            goto L_0x0690
        L_0x0670:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r1 = 0
            r0[r1] = r10
            java.lang.String r1 = "try2HandleAppBrandLogic, sync attr username %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r0)
            rd0.c$c r0 = r9.f216848H
            r0.f62963a = r8
            di3.d r0 = di3.C86312j.m106911c(r19)
            kr0.w0 r0 = (kr0.C76629w0) r0
            com.tencent.mm.ui.chatting.viewitems.m5 r1 = new com.tencent.mm.ui.chatting.viewitems.m5
            r8 = r71
            r14 = 1
            r1.<init>(r9, r11, r8, r15)
            r0.mo106884tG(r10, r1)
        L_0x0690:
            r5 = 1
            rd0.c$c r6 = r9.f216848H
            r7 = 0
            r1 = r68
            r2 = r70
            r3 = r71
            r4 = r15
            r1.mo102963P0(r2, r3, r4, r5, r6, r7)
        L_0x069e:
            android.view.View r0 = r15.f218269i
            k20.a r1 = new k20.a
            r1.<init>()
            r4 = r26
            r1.mo10233c(r4)
            java.lang.Object[] r28 = r1.mo10232b()
            java.lang.String r29 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r30 = "try2HandleAppBrandLogic"
            java.lang.String r31 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r0
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r28 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r29 = "try2HandleAppBrandLogic"
            java.lang.String r30 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            android.view.View r0 = r15.f218269i
            r1 = 2131310148(0x7f093644, float:1.82386E38)
            r0.setTag(r1, r8)
            com.tencent.mm.ui.chatting.viewitems.u5 r0 = new com.tencent.mm.ui.chatting.viewitems.u5
            r0.<init>(r9, r15)
            r9.f216869x = r0
            android.view.View r1 = r15.f218269i
            r1.setOnClickListener(r0)
            r0 = r25
            r10 = r40
            r7 = r41
            goto L_0x0841
        L_0x06fa:
            r41 = r5
            r40 = r6
            r4 = r10
            r25 = r14
            r3 = r22
            r1 = 2131310148(0x7f093644, float:1.82386E38)
            r14 = 1
            r22 = r13
            boolean r0 = rb0.C47984k.m53340n(r0)
            if (r0 == 0) goto L_0x0831
            r9.f216857R = r14
            java.lang.String r0 = r71.mo108768t()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x071e
            r0 = 1
            r3 = 0
            goto L_0x072b
        L_0x071e:
            int r0 = r9.f216855P
            boolean r0 = r9.mo102964Q0(r0)
            if (r0 != 0) goto L_0x0734
            r3 = 0
            r9.f216857R = r3
            r0 = 0
            r3 = 1
        L_0x072b:
            r2 = r0
            r0 = r25
            r10 = r40
            r7 = r41
            goto L_0x07cf
        L_0x0734:
            r0 = r25
            java.lang.Object r3 = r11.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            wd0.a$b r5 = r9.f216862W
            r10 = r40
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r10)
            r5.getClass()
            r7 = r41
            gy3.C87412m.m108594g(r6, r7)
            r5.f65818a = r6
            wd0.a$b r5 = r9.f216862W
            r5.f65819b = r14
            java.lang.String r6 = r9.f216849I
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            gy3.C87412m.m108594g(r6, r7)
            r5.f65820c = r6
            wd0.a$b r5 = r9.f216862W
            int r6 = r9.f216855P
            r5.f65821d = r6
            java.lang.String r6 = r9.f216854N
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r10)
            gy3.C87412m.m108594g(r6, r7)
            r5.f65822e = r6
            android.widget.LinearLayout r5 = r15.f218248L
            r6 = 8
            r5.setVisibility(r6)
            r9.mo102970X0(r15, r6)
            android.widget.TextView r5 = r15.f218249M
            ck3.b r6 = r9.f216867v
            android.content.res.Resources r6 = r6.mo91572m()
            java.lang.String r2 = r6.getString(r2)
            r5.setText(r2)
            td0.a$a r2 = td0.C22478a.f63656d
            java.lang.String r5 = r9.f216849I
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.widget.LinearLayout r13 = r15.f218248L
            int r13 = r13.hashCode()
            r6.append(r13)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r2.mo35627b(r5, r6)
            java.lang.String r5 = r9.f216849I
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.widget.LinearLayout r13 = r15.f218248L
            int r13 = r13.hashCode()
            r6.append(r13)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.mm.ui.chatting.viewitems.c5 r13 = new com.tencent.mm.ui.chatting.viewitems.c5
            r13.<init>(r9, r11, r8, r15)
            r2.mo35626a(r5, r6, r13)
            rd0.c r2 = r9.f216852L
            java.lang.String r5 = r9.f216849I
            r2.mo35363d(r3, r5)
            r2 = 1
            r3 = 1
        L_0x07cf:
            if (r3 == 0) goto L_0x07d3
            if (r2 != 0) goto L_0x07dd
        L_0x07d3:
            android.widget.LinearLayout r5 = r15.f218248L
            r6 = 8
            r5.setVisibility(r6)
            r9.mo102970X0(r15, r6)
        L_0x07dd:
            if (r3 == 0) goto L_0x0841
            if (r2 == 0) goto L_0x0841
            android.view.View r2 = r15.f218269i
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r4)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r28 = "try2HandleBrandSubscribeMsgLogic"
            java.lang.String r29 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r27 = "try2HandleBrandSubscribeMsgLogic"
            java.lang.String r28 = "(Lcom/tencent/mm/ui/chatting/viewitems/NewTemplateHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            android.view.View r2 = r15.f218269i
            r2.setTag(r1, r8)
            com.tencent.mm.ui.chatting.viewitems.u5 r1 = new com.tencent.mm.ui.chatting.viewitems.u5
            r1.<init>(r9, r15)
            r9.f216869x = r1
            android.view.View r2 = r15.f218269i
            r2.setOnClickListener(r1)
            goto L_0x0841
        L_0x0831:
            r0 = r25
            r10 = r40
            r7 = r41
            android.widget.LinearLayout r1 = r15.f218248L
            r2 = 8
            r1.setVisibility(r2)
            r9.mo102970X0(r15, r2)
        L_0x0841:
            java.lang.String r1 = ".msg.appmsg.mmreader.template_header.show_finder_feed_entry"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            if (r1 != r14) goto L_0x0852
            r3 = 1
            goto L_0x0853
        L_0x0852:
            r3 = 0
        L_0x0853:
            if (r3 == 0) goto L_0x08ca
            java.lang.String r1 = ".msg.appmsg.mmreader.template_header.finder_feed_thumnail"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r2 = 1071665644(0x3fe051ec, float:1.7525)
            ck3.b r3 = r9.f216867v
            android.app.Activity r3 = r3.mo91565f()
            android.graphics.Point r3 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r3)
            int r3 = r3.x
            ck3.b r4 = r9.f216867v
            android.app.Activity r4 = r4.mo91565f()
            r5 = 64
            int r4 = kg3.C76577a.m92151b(r4, r5)
            int r3 = r3 - r4
            float r4 = (float) r3
            float r4 = r4 / r2
            int r2 = (int) r4
            android.widget.ImageView r4 = r15.f218262b
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x0891
            r4.width = r3
            r4.height = r2
            android.widget.ImageView r5 = r15.f218262b
            r5.setLayoutParams(r4)
        L_0x0891:
            android.widget.ImageView r4 = r15.f218262b
            r9.mo102965R0(r4, r1, r3, r2)
            android.widget.ImageView r1 = r15.f218262b
            r2 = 0
            r1.setVisibility(r2)
            android.widget.ImageView r1 = r15.f218262b
            com.tencent.mm.ui.chatting.viewitems.o5 r2 = new com.tencent.mm.ui.chatting.viewitems.o5
            r2.<init>(r9, r11)
            r1.setOnClickListener(r2)
            r1 = 23
            boolean r1 = p206nj.C11171e.m11046c(r1)
            if (r1 == 0) goto L_0x08c0
            android.widget.ImageView r1 = r15.f218262b
            ck3.b r2 = r9.f216867v
            android.app.Activity r2 = r2.mo91565f()
            r3 = 2131231936(0x7f0804c0, float:1.8079967E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r1.setForeground(r2)
        L_0x08c0:
            android.view.ViewGroup r1 = r15.f218263c
            r2 = 0
            r1.setVisibility(r2)
            r1 = r24
            r2 = 0
            goto L_0x08d9
        L_0x08ca:
            android.widget.ImageView r1 = r15.f218262b
            r2 = 0
            r1.setImageBitmap(r2)
            android.view.ViewGroup r1 = r15.f218263c
            r3 = 8
            r1.setVisibility(r3)
            r1 = r24
        L_0x08d9:
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.widget.TextView r3 = r15.f218274n
            r3.setText(r1)
            java.lang.Class<zz.i> r1 = p287zz.C79445i.class
            java.lang.String r3 = ".msg.appmsg.mmreader.template_detail.line_content.topline.key.word"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ".msg.appmsg.mmreader.template_detail.line_content.topline.value.word"
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word"
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r13 = ".msg.appmsg.mmreader.template_detail.pay_recepit_detail_word"
            java.lang.String r14 = ".msg.appmsg.mmreader.template_detail.pay_recepit_middle_tips_word"
            if (r6 != 0) goto L_0x0b27
            ck3.b r6 = r9.f216867v
            android.app.Activity r6 = r6.mo91565f()
            android.content.res.Resources r6 = r6.getResources()
            r2 = 2131101252(0x7f060644, float:1.7814908E38)
            int r6 = r6.getColor(r2)
            java.lang.String r2 = ".msg.appmsg.mmreader.template_detail.line_content.topline.key.color"
            int r2 = m87575S0(r11, r2, r6)
            int r2 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r2)
            ck3.b r6 = r9.f216867v
            android.app.Activity r6 = r6.mo91565f()
            android.content.res.Resources r6 = r6.getResources()
            r41 = r7
            r7 = 2131101252(0x7f060644, float:1.7814908E38)
            int r6 = r6.getColor(r7)
            java.lang.String r7 = ".msg.appmsg.mmreader.template_detail.line_content.topline.value.color"
            int r6 = m87575S0(r11, r7, r6)
            int r6 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r6)
            ck3.b r7 = r9.f216867v
            android.app.Activity r7 = r7.mo91565f()
            android.content.res.Resources r7 = r7.getResources()
            r73 = r12
            r12 = 2131100897(0x7f0604e1, float:1.7814188E38)
            int r7 = r7.getColor(r12)
            java.lang.String r12 = ".msg.appmsg.mmreader.template_detail.line_content.topline.value.strikethrough_word_color"
            int r7 = m87575S0(r11, r12, r7)
            int r7 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r7)
            java.lang.String r12 = ".msg.appmsg.mmreader.template_detail.line_content.topline.value.small_text_count"
            java.lang.Object r12 = r11.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            r40 = r10
            r10 = 0
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r12, (int) r10)
            android.widget.TextView r10 = r15.f218277q
            r10.setTextColor(r2)
            android.widget.TextView r2 = r15.f218279s
            r2.setTextColor(r6)
            android.widget.TextView r2 = r15.f218280t
            r2.setTextColor(r7)
            android.widget.TextView r2 = r15.f218280t
            android.text.TextPaint r2 = r2.getPaint()
            r7 = 16
            r2.setFlags(r7)
            android.widget.TextView r2 = r15.f218280t
            android.text.TextPaint r2 = r2.getPaint()
            r7 = 1
            r2.setAntiAlias(r7)
            android.widget.TextView r2 = r15.f218280t
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r10 = 2131165309(0x7f07007d, float:1.7944831E38)
            int r7 = kg3.C76577a.m92157h(r7, r10)
            float r7 = (float) r7
            r10 = 0
            r2.setTextSize(r10, r7)
            android.widget.TextView r2 = r15.f218277q
            r2.setText(r3)
            if (r12 <= 0) goto L_0x0a0d
            int r7 = r4.length()
            if (r12 >= r7) goto L_0x0a0d
            android.widget.TextView r7 = r15.f218278r
            r7.setVisibility(r10)
            android.widget.TextView r7 = r15.f218278r
            java.lang.String r2 = r4.substring(r10, r12)
            r7.setText(r2)
            android.widget.TextView r2 = r15.f218278r
            r2.setTextColor(r6)
            android.widget.TextView r2 = r15.f218278r
            di3.d r6 = di3.C86312j.m106911c(r1)
            zz.i r6 = (p287zz.C79445i) r6
            ck3.b r7 = r9.f216867v
            android.app.Activity r7 = r7.mo91565f()
            android.graphics.Typeface r6 = r6.mo109182Ep(r7, r10)
            r2.setTypeface(r6)
            android.widget.TextView r2 = r15.f218279s
            di3.d r6 = di3.C86312j.m106911c(r1)
            zz.i r6 = (p287zz.C79445i) r6
            ck3.b r7 = r9.f216867v
            android.app.Activity r7 = r7.mo91565f()
            android.graphics.Typeface r6 = r6.mo109182Ep(r7, r10)
            r2.setTypeface(r6)
            android.widget.TextView r2 = r15.f218279s
            r6 = 1109393408(0x42200000, float:40.0)
            r7 = 1
            r2.setTextSize(r7, r6)
            android.widget.TextView r2 = r15.f218278r
            r2.setTextSize(r7, r6)
            android.widget.TextView r2 = r15.f218279s
            r2.setIncludeFontPadding(r7)
            android.widget.TextView r2 = r15.f218279s
            java.lang.String r6 = r4.substring(r12)
            r2.setText(r6)
            goto L_0x0a89
        L_0x0a0d:
            android.widget.TextView r2 = r15.f218278r
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
            r2.setTypeface(r6)
            android.widget.TextView r2 = r15.f218278r
            r6 = 8
            r2.setVisibility(r6)
            java.lang.String r2 = "￥"
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L_0x0a61
            java.lang.String r2 = "¥"
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L_0x0a61
            java.lang.String r2 = "$"
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L_0x0a61
            java.lang.String r2 = "＄"
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L_0x0a3f
            goto L_0x0a61
        L_0x0a3f:
            android.widget.TextView r2 = r15.f218279s
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
            r2.setTypeface(r6)
            android.widget.TextView r2 = r15.f218279s
            android.text.TextPaint r2 = r2.getPaint()
            r6 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r6)
            android.widget.TextView r2 = r15.f218279s
            r6 = 1107296256(0x42000000, float:32.0)
            r7 = 1
            r2.setTextSize(r7, r6)
            android.widget.TextView r2 = r15.f218279s
            r6 = 0
            r2.setIncludeFontPadding(r6)
            goto L_0x0a84
        L_0x0a61:
            r6 = 0
            android.widget.TextView r2 = r15.f218279s
            di3.d r7 = di3.C86312j.m106911c(r1)
            zz.i r7 = (p287zz.C79445i) r7
            ck3.b r10 = r9.f216867v
            android.app.Activity r10 = r10.mo91565f()
            android.graphics.Typeface r7 = r7.mo109182Ep(r10, r6)
            r2.setTypeface(r7)
            android.widget.TextView r2 = r15.f218279s
            r6 = 1109393408(0x42200000, float:40.0)
            r7 = 1
            r2.setTextSize(r7, r6)
            android.widget.TextView r2 = r15.f218279s
            r2.setIncludeFontPadding(r7)
        L_0x0a84:
            android.widget.TextView r2 = r15.f218279s
            r2.setText(r4)
        L_0x0a89:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r2 != 0) goto L_0x0abd
            android.widget.TextView r2 = r15.f218280t
            r2.setText(r5)
            boolean r2 = r15.f218260X
            if (r2 == 0) goto L_0x0aaf
            android.widget.TextView r2 = r15.f218280t
            di3.d r1 = di3.C86312j.m106911c(r1)
            zz.i r1 = (p287zz.C79445i) r1
            ck3.b r6 = r9.f216867v
            android.app.Activity r6 = r6.mo91565f()
            r7 = 7
            android.graphics.Typeface r1 = r1.mo109182Ep(r6, r7)
            r2.setTypeface(r1)
            goto L_0x0ab6
        L_0x0aaf:
            android.widget.TextView r1 = r15.f218280t
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r2)
        L_0x0ab6:
            android.widget.TextView r1 = r15.f218280t
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x0ac4
        L_0x0abd:
            android.widget.TextView r1 = r15.f218280t
            r2 = 8
            r1.setVisibility(r2)
        L_0x0ac4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 != 0) goto L_0x0ad2
            r1.append(r3)
        L_0x0ad2:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r2 != 0) goto L_0x0adb
            r1.append(r4)
        L_0x0adb:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r2 != 0) goto L_0x0af9
            java.lang.String r2 = " "
            r1.append(r2)
            ck3.b r2 = r9.f216867v
            android.content.res.Resources r2 = r2.mo91572m()
            r3 = 2131823531(0x7f110bab, float:1.9279864E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            r1.append(r5)
        L_0x0af9:
            java.lang.Object r2 = r11.get(r14)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0b08
            r1.append(r2)
        L_0x0b08:
            java.lang.Object r2 = r11.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0b17
            r1.append(r2)
        L_0x0b17:
            android.widget.LinearLayout r2 = r15.f218276p
            java.lang.String r1 = r1.toString()
            r2.setContentDescription(r1)
            android.widget.LinearLayout r1 = r15.f218276p
            r2 = 0
            r1.setVisibility(r2)
            goto L_0x0b35
        L_0x0b27:
            r41 = r7
            r40 = r10
            r73 = r12
            r2 = 0
            android.widget.LinearLayout r1 = r15.f218276p
            r3 = 8
            r1.setVisibility(r3)
        L_0x0b35:
            java.lang.String r1 = ".msg.appmsg.mmreader.category.item.template_op_type"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r3 = -1
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r3)
            r1 = 2
            if (r10 != r1) goto L_0x0b49
            r9.mo102956I0(r15, r11)
            goto L_0x0b4c
        L_0x0b49:
            r9.mo102957J0(r15, r11)
        L_0x0b4c:
            r9.mo102955H0(r15, r8, r11)
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 != 0) goto L_0x0b71
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            com.tencent.mm.storage.z1 r0 = r0.get(r7)
            java.lang.String r4 = r0.mo62909j3()
            r6 = r4
            goto L_0x0b72
        L_0x0b71:
            r6 = 0
        L_0x0b72:
            java.lang.String r0 = ".msg.appmsg.mmreader.category.item.title"
            java.lang.Object r0 = r11.get(r0)
            r21 = r0
            java.lang.String r21 = (java.lang.String) r21
            java.lang.String r0 = ".msg.appmsg.mmreader.category.item.url"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = ".msg.appmsg.mmreader.category.item.native_url"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ".msg.appmsg.template_id"
            java.lang.Object r4 = r11.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = ".msg.appmsg.mmreader.category.item.weapp_username"
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r12 = ".msg.appmsg.mmreader.template_detail.pay_recepit_detail_url"
            r1 = 4
            r16 = r12
            r12 = 3
            if (r10 == r12) goto L_0x0cd6
            if (r10 == r1) goto L_0x0cd6
            r1 = 5
            if (r10 != r1) goto L_0x0bac
            goto L_0x0cd6
        L_0x0bac:
            r1 = 1
            if (r10 != r1) goto L_0x0be8
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 != 0) goto L_0x0be8
            com.tencent.mm.ui.chatting.viewitems.t8 r3 = new com.tencent.mm.ui.chatting.viewitems.t8
            r3.<init>(r8, r7, r0)
            r12 = r72
            r3.f217970d = r12
            android.view.View r0 = r15.f218261a
            r0.setTag(r3)
            android.view.View r0 = r15.f218261a
            android.view.View$OnClickListener r3 = r9.f216842B
            r0.setOnClickListener(r3)
            r3 = r40
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r3)
            r65 = r3
            r66 = r5
            r67 = r6
            r61 = r13
            r62 = r14
            r2 = r15
            r12 = r16
            r15 = r41
            r1 = 4
            r4 = 1
            r6 = 0
            r14 = 2
            r16 = r7
            r13 = r8
            goto L_0x0dba
        L_0x0be8:
            r12 = r72
            r4 = r40
            r1 = -1
            if (r10 != r1) goto L_0x0c44
            di3.d r1 = di3.C86312j.m106911c(r22)
            gw0.b r1 = (gw0.C76073b) r1
            boolean r1 = r1.mo94598h0(r7)
            if (r1 == 0) goto L_0x0c44
            java.lang.String r0 = ".msg.appmsg.mmreader.template_detail.opitems.opitem.url"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.view.View r1 = r15.f218261a
            com.tencent.mm.ui.chatting.viewitems.t8 r10 = new com.tencent.mm.ui.chatting.viewitems.t8
            r17 = 0
            r18 = 0
            ck3.b r2 = r9.f216867v
            java.lang.String r2 = r2.mo91576q()
            r60 = r16
            r12 = r10
            r61 = r13
            r13 = r71
            r62 = r14
            r14 = r17
            r63 = r15
            r15 = r72
            r16 = r7
            r17 = r18
            r18 = r2
            r19 = r7
            r20 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r10.f217992z = r3
            r10.f217952D = r0
            r1.setTag(r10)
            r2 = r63
            android.view.View r0 = r2.f218261a
            android.view.View$OnClickListener r1 = r9.f216841A
            r0.setOnClickListener(r1)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r7, (java.lang.String) r4)
            r14 = 2
            goto L_0x0cb0
        L_0x0c44:
            r61 = r13
            r62 = r14
            r2 = r15
            r60 = r16
            r1 = 2
            if (r10 != r1) goto L_0x0c64
            com.tencent.mm.ui.chatting.viewitems.t8 r1 = new com.tencent.mm.ui.chatting.viewitems.t8
            r1.<init>(r8, r7, r0)
            r15 = r72
            r1.f217970d = r15
            android.view.View r0 = r2.f218261a
            r0.setTag(r1)
            android.view.View r0 = r2.f218261a
            android.view.View$OnClickListener r1 = r9.f216842B
            r0.setOnClickListener(r1)
            goto L_0x0cc2
        L_0x0c64:
            r15 = r72
            r1 = r60
            java.lang.Object r10 = r11.get(r1)
            java.lang.String r10 = (java.lang.String) r10
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r12 != 0) goto L_0x0c75
            r0 = r10
        L_0x0c75:
            android.view.View r10 = r2.f218261a
            com.tencent.mm.ui.chatting.viewitems.t8 r14 = new com.tencent.mm.ui.chatting.viewitems.t8
            r16 = 0
            r17 = 0
            ck3.b r12 = r9.f216867v
            java.lang.String r18 = r12.mo91576q()
            r12 = r14
            r13 = r71
            r60 = r1
            r1 = r14
            r14 = r16
            r15 = r72
            r16 = r0
            r19 = r7
            r20 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.f217992z = r3
            r10.setTag(r1)
            android.view.View r1 = r2.f218261a
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$c r3 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$c
            r3.<init>(r8, r7, r11)
            r1.setOnClickListener(r3)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0cc2
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r14 = 1
        L_0x0cb0:
            r65 = r4
            r66 = r5
            r67 = r6
            r16 = r7
            r13 = r8
            r15 = r41
            r12 = r60
            r1 = 4
            r4 = 1
            r6 = 0
            goto L_0x0dba
        L_0x0cc2:
            r0 = r4
            r65 = r0
            r66 = r5
            r67 = r6
            r16 = r7
            r13 = r8
            r15 = r41
            r12 = r60
            r1 = 4
            r4 = 1
            r6 = 0
            r14 = 0
            goto L_0x0dba
        L_0x0cd6:
            r61 = r13
            r62 = r14
            r2 = r15
            r60 = r16
            r4 = r40
            r15 = r72
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
            r0.<init>((com.tencent.p014mm.storage.C72963f4) r8, (java.lang.String) r7)
            r0.f217970d = r15
            android.view.View r1 = r2.f218261a
            r1.setTag(r0)
            java.lang.String r0 = ".msg.appmsg.mmreader.category.item.general_string"
            java.lang.Object r1 = r11.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.view.View r3 = r2.f218261a
            r14 = 1
            r12 = r60
            r1 = r68
            r64 = r2
            r2 = r3
            r3 = r71
            r65 = r4
            r4 = r70
            r66 = r5
            r5 = r7
            r67 = r6
            r6 = r10
            r16 = r7
            r15 = r41
            r7 = r13
            r13 = r8
            r8 = r14
            r1.mo102971Y0(r2, r3, r4, r5, r6, r7, r8)
            r72.getAdapterPosition()
            r1 = 4
            if (r10 != r1) goto L_0x0db3
            r2 = 0
            java.lang.Object r0 = r11.get(r0)     // Catch:{ Exception -> 0x0d56 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0d56 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0d56 }
            c30.g r4 = new c30.g     // Catch:{ Exception -> 0x0d56 }
            r4.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0d56 }
            java.lang.String r0 = "live_id"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0d56 }
            long r2 = o40.C61926c.m72671P(r0)     // Catch:{ Exception -> 0x0d56 }
            java.lang.String r0 = "force_push_info"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0d56 }
            if (r0 == 0) goto L_0x0d4f
            c30.g r4 = new c30.g     // Catch:{ Exception -> 0x0d56 }
            r4.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0d56 }
            java.lang.String r0 = "forcePushId"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0d56 }
            r6 = r0
            goto L_0x0d51
        L_0x0d4f:
            r6 = r65
        L_0x0d51:
            r49 = r6
            r4 = 1
            r6 = 0
            goto L_0x0d6a
        L_0x0d56:
            r0 = move-exception
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r6 = 0
            r5[r6] = r0
            java.lang.String r0 = "opExtraInfo, liveId, crash: %s"
            r7 = r73
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r5)
            r49 = r65
        L_0x0d6a:
            java.lang.Class<kq.g> r0 = p185kq.C61130g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kq.g r0 = (p185kq.C61130g) r0
            java.lang.Class<kq.h> r5 = p185kq.C10383h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kq.h r5 = (p185kq.C10383h) r5
            java.lang.String r5 = r5.mo10700XQ(r2)
            boolean r0 = r0.mo33241QO(r5)
            if (r0 == 0) goto L_0x0d85
            goto L_0x0db5
        L_0x0d85:
            java.lang.Class<mr.m> r0 = p204mr.C61568m.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r42 = r0
            mr.m r42 = (p204mr.C61568m) r42
            ak1.k0 r43 = ak1.C0077k0.ExposeMsg
            r47 = 0
            r7 = 1
            java.lang.Long r50 = java.lang.Long.valueOf(r7)
            r57 = 0
            r59 = 0
            java.lang.String r48 = ""
            java.lang.String r51 = ""
            java.lang.String r52 = ""
            java.lang.String r53 = ""
            java.lang.String r54 = ""
            java.lang.String r55 = ""
            java.lang.String r56 = ""
            r44 = r16
            r45 = r2
            r42.mo74856HG(r43, r44, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59)
            goto L_0x0db5
        L_0x0db3:
            r4 = 1
            r6 = 0
        L_0x0db5:
            r2 = r64
            r0 = r65
            r14 = 3
        L_0x0dba:
            boolean r3 = r2.f218260X
            if (r3 == 0) goto L_0x0eb5
            android.view.ViewGroup r3 = r2.f218255S
            if (r3 == 0) goto L_0x0de8
            r3 = r61
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r11.get(r12)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0de1
            android.widget.TextView r5 = r2.f218256T
            r5.setText(r3)
            android.view.ViewGroup r3 = r2.f218255S
            r3.setVisibility(r6)
            goto L_0x0de8
        L_0x0de1:
            android.view.ViewGroup r3 = r2.f218255S
            r5 = 8
            r3.setVisibility(r5)
        L_0x0de8:
            android.widget.TextView r3 = r2.f218257U
            if (r3 == 0) goto L_0x0e0c
            r3 = r62
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0e05
            android.widget.TextView r5 = r2.f218257U
            r5.setText(r3)
            android.widget.TextView r3 = r2.f218257U
            r3.setVisibility(r6)
            goto L_0x0e0c
        L_0x0e05:
            android.widget.TextView r3 = r2.f218257U
            r5 = 8
            r3.setVisibility(r5)
        L_0x0e0c:
            android.widget.LinearLayout r3 = r2.f218258V
            if (r3 == 0) goto L_0x0eb5
            java.lang.String r3 = ".msg.appmsg.mmreader.template_detail.middle_tips_with_background.text"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0eae
            android.widget.LinearLayout r5 = r2.f218258V
            r5.setVisibility(r6)
            android.widget.TextView r5 = r2.f218259W
            r5.setText(r3)
            java.lang.String r3 = ".msg.appmsg.mmreader.template_detail.middle_tips_with_background.text_color"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = ".msg.appmsg.mmreader.template_detail.middle_tips_with_background.text_color_dark"
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r7 == 0) goto L_0x0e46
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x0e46
            r3 = r5
            goto L_0x0e4f
        L_0x0e46:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0e4d
            goto L_0x0e4f
        L_0x0e4d:
            r3 = r65
        L_0x0e4f:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0e5e
            android.widget.TextView r5 = r2.f218259W
            int r3 = android.graphics.Color.parseColor(r3)
            r5.setTextColor(r3)
        L_0x0e5e:
            java.lang.String r3 = ".msg.appmsg.mmreader.template_detail.middle_tips_with_background.background_color"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = ".msg.appmsg.mmreader.template_detail.middle_tips_with_background.background_color_dark"
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            boolean r7 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r7 == 0) goto L_0x0e7c
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x0e7c
            r3 = r5
            goto L_0x0e85
        L_0x0e7c:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0e83
            goto L_0x0e85
        L_0x0e83:
            r3 = r65
        L_0x0e85:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0eb5
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            r5.setShape(r6)
            ck3.b r7 = r9.f216867v
            android.app.Activity r7 = r7.mo91565f()
            int r1 = kg3.C76577a.m92151b(r7, r1)
            float r1 = (float) r1
            r5.setCornerRadius(r1)
            int r1 = android.graphics.Color.parseColor(r3)
            r5.setColor(r1)
            android.widget.LinearLayout r1 = r2.f218258V
            r1.setBackground(r5)
            goto L_0x0eb5
        L_0x0eae:
            android.widget.LinearLayout r1 = r2.f218258V
            r3 = 8
            r1.setVisibility(r3)
        L_0x0eb5:
            ck3.b r1 = r9.f216867v
            java.lang.Class<zj3.p> r3 = zj3.C79375p.class
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r3)
            zj3.p r1 = (zj3.C79375p) r1
            long r7 = r71.getMsgId()
            boolean r1 = r1.mo70113N2(r7)
            if (r1 != 0) goto L_0x0ed6
            android.view.View r1 = r2.f218261a
            ck3.b r3 = r9.f216867v
            com.tencent.mm.ui.chatting.viewitems.i$e r3 = r9.mo103098p(r3)
            r1.setOnLongClickListener(r3)
        L_0x0ed6:
            android.view.View r1 = r2.f218261a
            ck3.b r3 = r9.f216867v
            java.lang.Class<zj3.l> r5 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r3 = r3.f193278b
            xi.d r3 = r3.mo102812a(r5)
            zj3.l r3 = (zj3.C79368l) r3
            com.tencent.mm.ui.chatting.h2 r3 = r3.mo108189Z4()
            r1.setOnTouchListener(r3)
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.d r1 = r1.g50()
            boolean r1 = r1.mo72512e()
            if (r1 == 0) goto L_0x0f14
            r1 = r69
            android.widget.ImageView r3 = r1.f217784g
            r3.setVisibility(r6)
            ck3.b r3 = r9.f216867v
            android.widget.ImageView r1 = r1.f217784g
            com.tencent.mm.ui.chatting.q2 r5 = new com.tencent.mm.ui.chatting.q2
            r6 = r66
            r7 = r67
            r5.<init>(r6, r13, r7)
            r9.mo103072F(r3, r1, r5)
        L_0x0f14:
            r1 = r65
            r9.mo102966T0(r4, r11, r1)
            r9.mo102958K0(r2, r11, r13)
            wd0.a$b r1 = r9.f216862W
            r1.f65824g = r14
            gy3.C87412m.m108594g(r0, r15)
            r1.f65825h = r0
            java.lang.String r0 = r71.mo108768t()
            r1 = r16
            r9.mo102969W0(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.mo102959L0(com.tencent.mm.ui.chatting.viewitems.q8, java.util.Map, com.tencent.mm.storage.f4, uj3.e, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0638  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0796  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x079b  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x094f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0a74  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0a89  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0ab7  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0c76  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0c8b  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0d68 A[SYNTHETIC, Splitter:B:261:0x0d68] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0d85 A[SYNTHETIC, Splitter:B:267:0x0d85] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0dce  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0df4  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0e18  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0312 A[EDGE_INSN: B:291:0x0312->B:58:0x0312 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0358 A[EDGE_INSN: B:294:0x0358->B:65:0x0358 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0491  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x04c0  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102960M0(com.tencent.p014mm.p136ui.chatting.viewitems.C74191q8 r41, java.util.Map<java.lang.String, java.lang.String> r42, com.tencent.p014mm.storage.C72963f4 r43, uj3.C78208e r44) {
        /*
            r40 = this;
            r8 = r40
            r9 = r41
            r10 = r42
            r15 = r43
            java.lang.Class<ex0.d> r11 = ex0.C45696d.class
            java.lang.Class<zj3.p> r14 = zj3.C79375p.class
            java.lang.String r0 = ".msg.fromusername"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r0 = ".msg.appmsg.mmreader.template_detail.template_ext.type"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r12 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
            r6 = 1
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r12] = r2
            java.lang.String r5 = "MicroMsg.ChattingItemDyeingTemplate"
            java.lang.String r2 = "fillingOld extType=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r1)
            r4 = 0
            if (r0 != r6) goto L_0x008c
            java.lang.String r1 = ".msg.appmsg.mmreader.template_detail.template_ext.app.avatar_url"
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r2 = ".msg.appmsg.mmreader.template_detail.template_ext.app.display_name"
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            ck3.b r6 = r8.f216867v
            android.app.Activity r6 = r6.mo91565f()
            android.widget.TextView r12 = r9.userTV
            float r12 = r12.getTextSize()
            android.text.SpannableString r2 = r3.yp0(r6, r2, r12)
            r8.mo103090g0(r9, r2)
            com.tencent.mm.ui.chatting.view.ChattingAvatarImageView r2 = r9.avatarIV
            r2.setTag(r4)
            com.tencent.mm.ui.chatting.view.ChattingAvatarImageView r2 = r9.avatarIV
            r2.setOnClickListener(r4)
            gc0.a r2 = gc0.C20828a.m22825b()
            com.tencent.mm.ui.chatting.view.ChattingAvatarImageView r3 = r9.avatarIV
            hc0.c r6 = r8.f216847G
            r2.mo32519h(r1, r3, r6)
            r12 = r5
            r21 = r7
            r19 = r11
            r11 = 1
            goto L_0x00fd
        L_0x008c:
            ck3.b r1 = r8.f216867v
            r8.mo102973h(r9, r1, r15, r13)
            com.tencent.mm.ui.chatting.view.ChattingAvatarImageView r2 = r9.avatarIV
            ck3.b r3 = r8.f216867v
            r6 = 0
            r1 = r40
            r12 = r4
            r4 = r13
            r12 = r5
            r5 = r43
            r19 = r11
            r11 = 1
            r21 = r7
            r7 = r42
            r1.mo102954G0(r2, r3, r4, r5, r6, r7)
            java.lang.Class<gw0.b> r1 = gw0.C76073b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            gw0.b r1 = (gw0.C76073b) r1
            boolean r1 = r1.mo94598h0(r13)
            if (r1 == 0) goto L_0x00cb
            com.tencent.mm.ui.chatting.viewitems.s8 r1 = r9.f217780c
            android.view.View r1 = r1.f217879b
            com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
            r2.<init>((com.tencent.p014mm.storage.C72963f4) r15, (java.lang.String) r13)
            r1.setTag(r2)
            com.tencent.mm.ui.chatting.viewitems.s8 r1 = r9.f217780c
            android.view.View r1 = r1.f217879b
            android.view.View$OnClickListener r2 = r8.f216872z
            r1.setOnClickListener(r2)
            goto L_0x00fd
        L_0x00cb:
            com.tencent.mm.ui.chatting.viewitems.s8 r1 = r9.f217780c
            android.view.View r1 = r1.f217879b
            com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
            ck3.b r3 = r8.f216867v
            boolean r3 = r3.mo91583x()
            if (r3 == 0) goto L_0x00e0
            ck3.b r3 = r8.f216867v
            java.lang.String r4 = r3.mo91577r()
            goto L_0x00e1
        L_0x00e0:
            r4 = 0
        L_0x00e1:
            r2.<init>((java.lang.String) r13, (java.lang.String) r4)
            r1.setTag(r2)
            com.tencent.mm.ui.chatting.viewitems.s8 r1 = r9.f217780c
            android.view.View r1 = r1.f217879b
            ck3.b r2 = r8.f216867v
            com.tencent.mm.ui.chatting.c2 r3 = r8.f217202i
            if (r3 != 0) goto L_0x00f8
            com.tencent.mm.ui.chatting.c2 r3 = new com.tencent.mm.ui.chatting.c2
            r3.<init>(r2)
            r8.f217202i = r3
        L_0x00f8:
            com.tencent.mm.ui.chatting.c2 r2 = r8.f217202i
            r1.setOnClickListener(r2)
        L_0x00fd:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = r43.mo108768t()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "dyeing template talker(%s)."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r2, r1)
            java.lang.String r1 = r43.mo108768t()
            java.lang.String r2 = "notifymessage"
            boolean r1 = r2.equals(r1)
            r2 = 8
            if (r1 != 0) goto L_0x0177
            if (r0 != r11) goto L_0x011c
            goto L_0x0177
        L_0x011c:
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217879b
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r23 = r1.mo10232b()
            java.lang.String r24 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r25 = "fillingOld"
            java.lang.String r26 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r0
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r23 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r24 = "fillingOld"
            java.lang.String r25 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.widget.TextView r0 = r0.f217882e
            android.content.Context r1 = r0.getContext()
            r3 = 2131165186(0x7f070002, float:1.7944582E38)
            int r1 = kg3.C76577a.m92157h(r1, r3)
            float r1 = (float) r1
            r3 = 0
            r0.setTextSize(r3, r1)
            r3 = r21
            goto L_0x01cd
        L_0x0177:
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217879b
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = r21
            r1.mo10233c(r3)
            java.lang.Object[] r23 = r1.mo10232b()
            java.lang.String r24 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r25 = "fillingOld"
            java.lang.String r26 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r0
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r23 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r24 = "fillingOld"
            java.lang.String r25 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.widget.TextView r0 = r0.f217882e
            android.content.Context r1 = r0.getContext()
            r4 = 2131165591(0x7f070197, float:1.7945403E38)
            int r1 = kg3.C76577a.m92157h(r1, r4)
            float r1 = (float) r1
            r4 = 0
            r0.setTextSize(r4, r1)
        L_0x01cd:
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217878a
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r3)
            java.lang.Object[] r21 = r1.mo10232b()
            java.lang.String r22 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r23 = "fillingOld"
            java.lang.String r24 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r21 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r22 = "fillingOld"
            java.lang.String r23 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$r r1 = com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.C73908r.m87630a(r42)
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.widget.TextView r0 = r0.f217882e
            java.lang.String r4 = r1.f216930a
            r0.setText(r4)
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.widget.LinearLayout r4 = r0.f217884g
            android.widget.LinearLayout$LayoutParams r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.f218223a
            java.lang.String r5 = "MicroMsg.ChattingItemDyeingTemplateDecorator"
            java.lang.String r6 = ".msg.appmsg.mmreader.category.item.digest"
            r7 = -1
            if (r4 != 0) goto L_0x022b
            java.lang.String r0 = "decorateStyle fail, digestLl is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x023f
        L_0x022b:
            java.lang.Object r0 = r10.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            boolean r21 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r21 == 0) goto L_0x0247
            java.lang.String r0 = "decorateStyle, digest is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r4.setVisibility(r2)
        L_0x023f:
            r26 = r3
            r38 = r6
            r23 = r12
            goto L_0x047a
        L_0x0247:
            java.util.regex.Pattern r21 = o40.C61926c.f176038a
            java.lang.String r11 = "text"
            gy3.C87412m.m108594g(r0, r11)
            int r11 = r0.length()
            int r11 = r11 + r7
            java.lang.String r7 = ""
            if (r11 < 0) goto L_0x0277
        L_0x0258:
            int r23 = r11 + -1
            char r24 = r0.charAt(r11)
            boolean r24 = z04.C66713a.m78713b(r24)
            if (r24 != 0) goto L_0x026e
            r16 = 1
            int r11 = r11 + 1
            r2 = 0
            java.lang.CharSequence r0 = r0.subSequence(r2, r11)
            goto L_0x0279
        L_0x026e:
            r2 = 0
            if (r23 >= 0) goto L_0x0272
            goto L_0x0278
        L_0x0272:
            r11 = r23
            r2 = 8
            goto L_0x0258
        L_0x0277:
            r2 = 0
        L_0x0278:
            r0 = r7
        L_0x0279:
            java.lang.String r0 = r0.toString()
            r4.setVisibility(r2)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan     // Catch:{ IndexOutOfBoundsException -> 0x02ae }
            android.content.Context r23 = r4.getContext()     // Catch:{ IndexOutOfBoundsException -> 0x02ae }
            android.content.res.Resources r11 = r23.getResources()     // Catch:{ IndexOutOfBoundsException -> 0x02ae }
            r23 = r12
            r12 = 2131101252(0x7f060644, float:1.7814908E38)
            int r11 = r11.getColor(r12)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r0.<init>(r11)     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            int r11 = r2.length()     // Catch:{ IndexOutOfBoundsException -> 0x02aa }
            r26 = r3
            r3 = 0
            r12 = 17
            r2.setSpan(r0, r3, r11, r12)     // Catch:{ IndexOutOfBoundsException -> 0x02a8 }
            goto L_0x02c2
        L_0x02a8:
            r0 = move-exception
            goto L_0x02b3
        L_0x02aa:
            r0 = move-exception
            r26 = r3
            goto L_0x02b3
        L_0x02ae:
            r0 = move-exception
            r26 = r3
            r23 = r12
        L_0x02b3:
            r3 = 1
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r11[r3] = r0
            java.lang.String r0 = "decorateStyle setSpan error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r11)
        L_0x02c2:
            r3 = 0
        L_0x02c3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r11 = ".msg.appmsg.mmreader.category.item.styles.style"
            r0.append(r11)
            if (r3 != 0) goto L_0x02d1
            r11 = r7
            goto L_0x02e0
        L_0x02d1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
        L_0x02e0:
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            boolean r0 = r10.containsKey(r11)
            java.lang.String r12 = ".color"
            r27 = r11
            java.lang.String r11 = "u"
            r28 = r12
            java.lang.String r12 = "parseFrom, font is null, use default value"
            r29 = r11
            java.lang.String r11 = ".font"
            r30 = r12
            java.lang.String r12 = "parseFrom fail, ex = "
            r31 = r12
            r32 = 21
            r33 = 18
            java.lang.String r12 = "l"
            r34 = r12
            java.lang.String r12 = "b"
            r35 = r12
            java.lang.String r12 = "m"
            r36 = r12
            if (r0 != 0) goto L_0x0ab7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "decorateStyle end, total style count = "
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r3 = 0
        L_0x032c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r37 = r11
            java.lang.String r11 = ".msg.appmsg.mmreader.category.item.styles.line"
            r0.append(r11)
            if (r3 != 0) goto L_0x033c
            r11 = r7
            goto L_0x034b
        L_0x033c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
        L_0x034b:
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            boolean r0 = r10.containsKey(r11)
            if (r0 != 0) goto L_0x094f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "decorateStyle end, total line count = "
            r0.append(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            java.util.Collections.sort(r12)
            r4.removeAllViews()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "addLines, nodeList size = "
            r0.append(r3)
            int r3 = r12.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            int r0 = r2.length()
            java.util.Iterator r3 = r12.iterator()
            r7 = 0
        L_0x0393:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x042d
            java.lang.Object r11 = r3.next()
            com.tencent.mm.ui.chatting.viewitems.x5$a r11 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.C74303a) r11
            int r12 = r11.f218224d
            if (r12 <= r7) goto L_0x03c8
            android.widget.TextView r12 = new android.widget.TextView
            r27 = r3
            android.content.Context r3 = r4.getContext()
            r12.<init>(r3)
            int r3 = r11.f218224d
            int r3 = java.lang.Math.min(r3, r0)
            java.lang.CharSequence r3 = r2.subSequence(r7, r3)
            r12.setText(r3)
            r3 = 1077936128(0x40400000, float:3.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r12.setLineSpacing(r3, r7)
            android.widget.LinearLayout$LayoutParams r3 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.f218223a
            r4.addView(r12, r3)
            goto L_0x03ca
        L_0x03c8:
            r27 = r3
        L_0x03ca:
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r7 = r4.getContext()
            r3.<init>(r7)
            java.lang.String r7 = r11.f218229i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r7)
        L_0x03da:
            int r15 = r12.length()
            r38 = r6
            r6 = 80
            if (r15 >= r6) goto L_0x03ea
            r12.append(r7)
            r6 = r38
            goto L_0x03da
        L_0x03ea:
            java.lang.String r6 = r12.toString()
            r3.setText(r6)
            r6 = 1
            r3.setSingleLine(r6)
            int r7 = r11.f218225e
            r12 = 14
            if (r7 == r12) goto L_0x03ff
            float r7 = (float) r7
            r3.setTextSize(r7)
        L_0x03ff:
            boolean r7 = r11.f218226f
            if (r7 == 0) goto L_0x0407
            r7 = 0
            r3.setTypeface(r7, r6)
        L_0x0407:
            boolean r6 = r11.f218227g
            if (r6 == 0) goto L_0x0415
            int r6 = r3.getPaintFlags()
            r7 = 8
            r6 = r6 | r7
            r3.setPaintFlags(r6)
        L_0x0415:
            int r6 = r11.f218228h
            int r6 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r6)
            r3.setTextColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.f218223a
            r4.addView(r3, r6)
            int r7 = r11.f218224d
            r15 = r43
            r3 = r27
            r6 = r38
            goto L_0x0393
        L_0x042d:
            r38 = r6
            if (r7 < r0) goto L_0x044e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "addLines, lastOffset >= maxLength, lastOffset = "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = ", maxLength = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x047a
        L_0x044e:
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r5 = r4.getContext()
            r3.<init>(r5)
            android.content.Context r5 = r3.getContext()
            r6 = 2131165537(0x7f070161, float:1.7945294E38)
            int r5 = kg3.C76577a.m92157h(r5, r6)
            float r5 = (float) r5
            r6 = 0
            r3.setTextSize(r6, r5)
            java.lang.CharSequence r0 = r2.subSequence(r7, r0)
            r3.setText(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3.setLineSpacing(r0, r2)
            android.widget.LinearLayout$LayoutParams r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.f218223a
            r4.addView(r3, r0)
        L_0x047a:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 != 0) goto L_0x0491
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            com.tencent.mm.storage.z1 r0 = r0.get(r13)
            java.lang.String r4 = r0.mo62909j3()
            goto L_0x0492
        L_0x0491:
            r4 = 0
        L_0x0492:
            java.lang.String r0 = r1.f216931b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 1
            r6 = r0 ^ 1
            java.lang.String r0 = ".msg.appmsg.mmreader.category.item.template_op_type"
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            java.lang.String r2 = ".msg.appmsg.mmreader.category.item.weapp_username"
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            ck3.b r3 = r8.f216867v
            com.tencent.mm.ui.chatting.manager.a r3 = r3.f193278b
            xi.d r3 = r3.mo102812a(r14)
            zj3.p r3 = (zj3.C79375p) r3
            boolean r3 = r3.mo70111L3()
            if (r3 == 0) goto L_0x0541
            if (r0 == 0) goto L_0x04cb
            r3 = 1
            if (r0 == r3) goto L_0x04cb
            r3 = 3
            if (r0 != r3) goto L_0x04c9
            goto L_0x04cb
        L_0x04c9:
            r3 = 0
            goto L_0x04cc
        L_0x04cb:
            r3 = 1
        L_0x04cc:
            if (r3 == 0) goto L_0x0541
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.view.View r3 = r3.f217878a
            if (r3 == 0) goto L_0x04da
            r5 = 2131231937(0x7f0804c1, float:1.807997E38)
            r3.setBackgroundResource(r5)
        L_0x04da:
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            if (r3 == 0) goto L_0x053e
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x053e
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            r5 = 2131231671(0x7f0803b7, float:1.807943E38)
            r3.setBackgroundResource(r5)
            r15 = r38
            java.lang.Object r3 = r10.get(r15)
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.ui.chatting.viewitems.s8 r5 = r9.f217780c
            android.widget.LinearLayout r5 = r5.f217884g
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$q r7 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$q
            r7.<init>(r3)
            r5.setTag(r7)
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            r5 = 1
            r3.setLongClickable(r5)
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            r3.setClickable(r5)
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            ck3.b r5 = r8.f216867v
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$t r7 = r8.f216870x0
            if (r7 != 0) goto L_0x0524
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$t r7 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$t
            r7.<init>(r5)
            r8.f216870x0 = r7
        L_0x0524:
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$t r5 = r8.f216870x0
            r3.setOnLongClickListener(r5)
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$s r5 = r8.f216866p0
            if (r5 != 0) goto L_0x0539
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$s r5 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$s
            r7 = 0
            r5.<init>(r7)
            r8.f216866p0 = r5
        L_0x0539:
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$s r5 = r8.f216866p0
            r3.setOnClickListener(r5)
        L_0x053e:
            r3 = 1
            r5 = 0
            goto L_0x058c
        L_0x0541:
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.view.View r3 = r3.f217878a
            if (r3 == 0) goto L_0x054d
            r5 = 2131231940(0x7f0804c4, float:1.8079975E38)
            r3.setBackgroundResource(r5)
        L_0x054d:
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            if (r3 == 0) goto L_0x058a
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x058a
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            r5 = 0
            r3.setTag(r5)
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            r5 = 0
            r3.setLongClickable(r5)
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            r3.setClickable(r5)
            r3 = 16
            boolean r3 = p206nj.C11171e.m11046c(r3)
            if (r3 == 0) goto L_0x0581
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            r5 = 0
            r3.setBackground(r5)
            goto L_0x058b
        L_0x0581:
            r5 = 0
            com.tencent.mm.ui.chatting.viewitems.s8 r3 = r9.f217780c
            android.widget.LinearLayout r3 = r3.f217884g
            r3.setBackgroundDrawable(r5)
            goto L_0x058b
        L_0x058a:
            r5 = 0
        L_0x058b:
            r3 = 1
        L_0x058c:
            if (r0 != r3) goto L_0x05b8
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x05b8
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
            java.lang.String r2 = r1.f216931b
            r7 = r43
            r0.<init>(r7, r13, r2)
            r2 = r44
            r0.f217970d = r2
            com.tencent.mm.ui.chatting.viewitems.s8 r2 = r9.f217780c
            android.view.View r2 = r2.f217878a
            r2.setTag(r0)
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217878a
            android.view.View$OnClickListener r2 = r8.f216842B
            r0.setOnClickListener(r2)
            r2 = r7
            r6 = r14
            r39 = r23
            r5 = 0
            goto L_0x0624
        L_0x05b8:
            r7 = r43
            r2 = r44
            k40.a r0 = f40.C86709a0.m107533q(r19)
            ex0.d r0 = (ex0.C45696d) r0
            java.lang.String r11 = r1.f216931b
            boolean r0 = r0.mo70989eQ(r11)
            if (r0 == 0) goto L_0x05dd
            k40.a r0 = f40.C86709a0.m107533q(r19)
            ex0.d r0 = (ex0.C45696d) r0
            java.lang.String r11 = r1.f216931b
            r12 = 0
            java.lang.Object[] r15 = new java.lang.Object[r12]
            r25 = r6
            r3 = 2
            r6 = -1
            r0.Tn0(r11, r6, r3, r15)
            goto L_0x05e0
        L_0x05dd:
            r25 = r6
            r12 = 0
        L_0x05e0:
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217878a
            com.tencent.mm.ui.chatting.viewitems.t8 r3 = new com.tencent.mm.ui.chatting.viewitems.t8
            r6 = 0
            java.lang.String r15 = r1.f216931b
            r17 = 0
            ck3.b r11 = r8.f216867v
            java.lang.String r18 = r11.mo91576q()
            java.lang.String r11 = r1.f216930a
            r20 = r11
            r11 = r3
            r39 = r23
            r5 = 0
            r12 = r43
            r22 = r13
            r13 = r6
            r6 = r14
            r14 = r44
            r2 = r7
            r16 = r17
            r17 = r18
            r18 = r22
            r19 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r7 = r1.f216933d
            r3.f217992z = r7
            r0.setTag(r3)
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217878a
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$b r3 = new com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$b
            r13 = r22
            r3.<init>(r13, r2)
            r0.setOnClickListener(r3)
            r3 = r25
        L_0x0624:
            ck3.b r0 = r8.f216867v
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r6)
            zj3.p r0 = (zj3.C79375p) r0
            long r6 = r43.getMsgId()
            boolean r0 = r0.mo70113N2(r6)
            if (r0 != 0) goto L_0x0645
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217878a
            ck3.b r6 = r8.f216867v
            com.tencent.mm.ui.chatting.viewitems.i$e r6 = r8.mo103098p(r6)
            r0.setOnLongClickListener(r6)
        L_0x0645:
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217878a
            ck3.b r6 = r8.f216867v
            java.lang.Class<zj3.l> r7 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r6 = r6.mo102812a(r7)
            zj3.l r6 = (zj3.C79368l) r6
            com.tencent.mm.ui.chatting.h2 r6 = r6.mo108189Z4()
            r0.setOnTouchListener(r6)
            if (r3 != 0) goto L_0x06e6
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217885h
            k20.a r3 = new k20.a
            r3.<init>()
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r3.mo10233c(r7)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r14 = "fillingOld"
            java.lang.String r15 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r13 = "fillingOld"
            java.lang.String r14 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217883f
            k20.a r3 = new k20.a
            r3.<init>()
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r3.mo10233c(r7)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r14 = "fillingOld"
            java.lang.String r15 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r13 = "fillingOld"
            java.lang.String r14 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            r6 = r26
            goto L_0x0760
        L_0x06e6:
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217885h
            k20.a r3 = new k20.a
            r3.<init>()
            r6 = r26
            r3.mo10233c(r6)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r14 = "fillingOld"
            java.lang.String r15 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r13 = "fillingOld"
            java.lang.String r14 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            android.view.View r0 = r0.f217883f
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r6)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r14 = "fillingOld"
            java.lang.String r15 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r13 = "fillingOld"
            java.lang.String r14 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingItemHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0760:
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            lc3.b r0 = (lc3.C10485b) r0
            pj.d r0 = r0.g50()
            boolean r0 = r0.mo72512e()
            if (r0 == 0) goto L_0x0785
            android.widget.ImageView r0 = r9.f217784g
            r0.setVisibility(r5)
            ck3.b r0 = r8.f216867v
            android.widget.ImageView r3 = r9.f217784g
            com.tencent.mm.ui.chatting.q2 r7 = new com.tencent.mm.ui.chatting.q2
            java.lang.String r1 = r1.f216932c
            r7.<init>(r1, r2, r4)
            r8.mo103072F(r0, r3, r7)
        L_0x0785:
            com.tencent.mm.ui.chatting.viewitems.s8 r0 = r9.f217780c
            java.lang.String r1 = ".msg.appmsg.mmreader.category.item.show_complaint_button"
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r5)
            r14 = 1
            if (r1 != r14) goto L_0x0798
            r12 = 1
            goto L_0x0799
        L_0x0798:
            r12 = 0
        L_0x0799:
            if (r12 != 0) goto L_0x0832
            java.lang.String r1 = "fillingMoreVNew showMoreV false"
            r2 = r39
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.view.View r1 = r0.f217880c
            r2 = 0
            r1.setTag(r2)
            android.view.View r1 = r0.f217881d
            r1.setTag(r2)
            android.view.View r1 = r0.f217880c
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r12 = "fillingMoreVOld"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r11 = "fillingMoreVOld"
            java.lang.String r12 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r0 = r0.f217881d
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r19 = "fillingMoreVOld"
            java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r18 = "fillingMoreVOld"
            java.lang.String r19 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x094e
        L_0x0832:
            android.view.View r1 = r0.f217879b
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x08c5
            android.view.View r1 = r0.f217880c
            r1.setTag(r2)
            android.view.View r1 = r0.f217880c
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$p r2 = r8.f216871y
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f217880c
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r6)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r12 = "fillingMoreVOld"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r11 = "fillingMoreVOld"
            java.lang.String r12 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r0 = r0.f217881d
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r19 = "fillingMoreVOld"
            java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r18 = "fillingMoreVOld"
            java.lang.String r19 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x094e
        L_0x08c5:
            android.view.View r1 = r0.f217881d
            r1.setTag(r2)
            android.view.View r1 = r0.f217881d
            com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate$p r2 = r8.f216871y
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f217881d
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r6)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r12 = "fillingMoreVOld"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r11 = "fillingMoreVOld"
            java.lang.String r12 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r0 = r0.f217880c
            k20.a r1 = new k20.a
            r1.<init>()
            r16 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r19 = "fillingMoreVOld"
            java.lang.String r20 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate"
            java.lang.String r18 = "fillingMoreVOld"
            java.lang.String r19 = "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingTopSlot;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x094e:
            return
        L_0x094f:
            r15 = r6
            r17 = r14
            r24 = r23
            r18 = r26
            r6 = 0
            r16 = 8
            r22 = 0
            java.lang.String r14 = "MicroMsg.LineNode"
            com.tencent.mm.ui.chatting.viewitems.x5$a r0 = new com.tencent.mm.ui.chatting.viewitems.x5$a
            r0.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0a54 }
            r6.<init>()     // Catch:{ Exception -> 0x0a54 }
            r6.append(r11)     // Catch:{ Exception -> 0x0a54 }
            r38 = r1
            java.lang.String r1 = ".offset"
            r6.append(r1)     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x0a3a }
            java.lang.Object r1 = r10.get(r1)     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0a3a }
            r6 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r6)     // Catch:{ Exception -> 0x0a3a }
            r0.f218224d = r1     // Catch:{ Exception -> 0x0a3a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r6 = r37
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r25 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r25 == 0) goto L_0x09a9
            r37 = r4
            r4 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r14, r4)
            r1 = r36
            goto L_0x09b1
        L_0x09a9:
            r37 = r4
            r4 = r30
            java.lang.String r1 = r1.toLowerCase()
        L_0x09b1:
            r30 = r7
            r7 = r35
            boolean r8 = r1.contains(r7)
            r0.f218226f = r8
            r8 = r29
            boolean r9 = r1.contains(r8)
            r0.f218227g = r9
            r9 = r36
            boolean r25 = r1.contains(r9)
            if (r25 == 0) goto L_0x09d2
            r29 = r13
            r13 = r34
            r1 = 18
            goto L_0x09e1
        L_0x09d2:
            r29 = r13
            r13 = r34
            boolean r1 = r1.contains(r13)
            if (r1 == 0) goto L_0x09df
            r1 = 21
            goto L_0x09e1
        L_0x09df:
            r1 = 14
        L_0x09e1:
            r0.f218225e = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r34 = r15
            r15 = r28
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r25 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r28 = r2
            if (r25 == 0) goto L_0x0a08
            r2 = -855638017(0xffffffffccffffff, float:-1.3421772E8)
            goto L_0x0a0a
        L_0x0a08:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0a0a:
            int r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.m88635a(r1, r2)
            r0.f218228h = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".chars"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r10.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.f218229i = r1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0a37
            java.lang.String r0 = "parseFrom fail, chars is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            r2 = r31
            goto L_0x0a70
        L_0x0a37:
            r2 = r31
            goto L_0x0a72
        L_0x0a3a:
            r0 = move-exception
        L_0x0a3b:
            r8 = r29
            r9 = r36
            r6 = r37
            r37 = r4
            r29 = r13
            r4 = r30
            r13 = r34
            r30 = r7
            r34 = r15
            r15 = r28
            r7 = r35
            r28 = r2
            goto L_0x0a58
        L_0x0a54:
            r0 = move-exception
            r38 = r1
            goto L_0x0a3b
        L_0x0a58:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r31
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x0a70:
            r0 = r22
        L_0x0a72:
            if (r0 != 0) goto L_0x0a89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "parseFrom fail, skip to next, lineKey = "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0a8c
        L_0x0a89:
            r12.add(r0)
        L_0x0a8c:
            int r3 = r3 + 1
            r31 = r2
            r11 = r6
            r35 = r7
            r36 = r9
            r14 = r17
            r26 = r18
            r23 = r24
            r2 = r28
            r7 = r30
            r6 = r34
            r1 = r38
            r9 = r41
            r30 = r4
            r34 = r13
            r28 = r15
            r13 = r29
            r4 = r37
            r15 = r43
            r29 = r8
            r8 = r40
            goto L_0x032c
        L_0x0ab7:
            r38 = r1
            r37 = r4
            r17 = r14
            r24 = r23
            r18 = r26
            r15 = r28
            r8 = r29
            r4 = r30
            r9 = r36
            r16 = 8
            r22 = 0
            r28 = r2
            r30 = r7
            r29 = r13
            r2 = r31
            r13 = r34
            r7 = r35
            r34 = r6
            r6 = r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r27
            r0.append(r1)
            java.lang.String r11 = ".range"
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r12 = "MicroMsg.StyleNode"
            if (r11 == 0) goto L_0x0b06
            java.lang.String r0 = "parseFrom fail, range is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r27 = r3
            goto L_0x0c72
        L_0x0b06:
            int r11 = r0.length()
            r14 = 5
            if (r11 < r14) goto L_0x0c5c
            r11 = 0
            char r14 = r0.charAt(r11)
            r11 = 123(0x7b, float:1.72E-43)
            if (r14 != r11) goto L_0x0c5c
            int r11 = r0.length()
            r14 = 1
            int r11 = r11 - r14
            char r11 = r0.charAt(r11)
            r14 = 125(0x7d, float:1.75E-43)
            if (r11 != r14) goto L_0x0c5c
            java.lang.String r11 = ","
            boolean r14 = r0.contains(r11)
            if (r14 != 0) goto L_0x0b2e
            goto L_0x0c5c
        L_0x0b2e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r27 = r3
            java.lang.String r3 = "parseFrom, range = "
            r14.append(r3)
            r14.append(r0)
            java.lang.String r3 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r3)
            int r3 = r0.length()
            r14 = 1
            int r3 = r3 - r14
            java.lang.String r0 = r0.substring(r14, r3)
            java.lang.String[] r0 = r0.split(r11)
            if (r0 == 0) goto L_0x0c46
            int r3 = r0.length
            r11 = 2
            if (r3 == r11) goto L_0x0b5a
            goto L_0x0c46
        L_0x0b5a:
            com.tencent.mm.ui.chatting.viewitems.x5$b r3 = new com.tencent.mm.ui.chatting.viewitems.x5$b
            r3.<init>()
            r11 = 0
            r14 = r0[r11]     // Catch:{ Exception -> 0x0c2e }
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r14, (int) r11)     // Catch:{ Exception -> 0x0c2e }
            r3.f218230a = r14     // Catch:{ Exception -> 0x0c2e }
            r26 = 1
            r0 = r0[r26]     // Catch:{ Exception -> 0x0c2e }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)     // Catch:{ Exception -> 0x0c2e }
            int r14 = r14 + r0
            r3.f218231b = r14     // Catch:{ Exception -> 0x0c2e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0b93
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r4)
            r0 = r9
            goto L_0x0b97
        L_0x0b93:
            java.lang.String r0 = r0.toLowerCase()
        L_0x0b97:
            boolean r2 = r0.contains(r7)
            r3.f218233d = r2
            boolean r2 = r0.contains(r8)
            r3.f218234e = r2
            boolean r2 = r0.contains(r9)
            if (r2 == 0) goto L_0x0bac
            r0 = 18
            goto L_0x0bb7
        L_0x0bac:
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0bb5
            r0 = 21
            goto L_0x0bb7
        L_0x0bb5:
            r0 = 14
        L_0x0bb7:
            r3.f218232c = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r4 = ".wxcolors.wxcolor"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            boolean r4 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r4 != 0) goto L_0x0bf8
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.m88635a(r0, r4)
            int r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.m88635a(r2, r0)
            r3.f218235f = r0
            goto L_0x0c2c
        L_0x0bf8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r6 = "1"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r10.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r6 = -855638017(0xffffffffccffffff, float:-1.3421772E8)
            int r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.m88635a(r0, r6)
            int r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.m88635a(r2, r0)
            int r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74302x5.m88635a(r4, r0)
            r3.f218235f = r0
        L_0x0c2c:
            r4 = r3
            goto L_0x0c74
        L_0x0c2e:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0c72
        L_0x0c46:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parseFrom fail, range wrong format, strs array length = "
            r2.append(r3)
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x0c72
        L_0x0c5c:
            r27 = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parseFrom fail, range wrong format, range = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
        L_0x0c72:
            r4 = r22
        L_0x0c74:
            if (r4 != 0) goto L_0x0c8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "parseFrom fail, skip to next, styleKey = "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0cb1
        L_0x0c8b:
            int r12 = r4.f218230a
            int r0 = r4.f218231b
            java.lang.String r1 = ", rangeTo = "
            if (r12 < r0) goto L_0x0cb9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "addStyle, no need to add, rangeFrom = "
            r0.append(r2)
            int r2 = r4.f218230a
            r0.append(r2)
            r0.append(r1)
            int r1 = r4.f218231b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
        L_0x0cb1:
            r3 = r28
            r2 = 17
            r4 = 3
            r7 = 2
            goto L_0x0e24
        L_0x0cb9:
            int r2 = r4.f218232c
            boolean r3 = r4.f218233d
            boolean r6 = r4.f218234e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "setFont, rangeFrom = "
            r7.append(r8)
            r7.append(r12)
            r7.append(r1)
            r7.append(r0)
            java.lang.String r8 = ", fontSize = "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = ", isBlack = "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", isUnderLine = "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r7)
            java.lang.String r7 = "setFont, params error. length:%d, from:%d, to:%d"
            if (r12 >= 0) goto L_0x0d15
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            int r8 = r28.length()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = 0
            r9[r11] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r11 = 1
            r9[r11] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r11 = 2
            r9[r11] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r9)
            r12 = 0
        L_0x0d15:
            int r8 = r28.length()
            if (r0 <= r8) goto L_0x0d3f
            r8 = 3
            java.lang.Object[] r9 = new java.lang.Object[r8]
            int r8 = r28.length()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11 = 0
            r9[r11] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r11 = 1
            r9[r11] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = 2
            r9[r8] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r7, r9)
            int r0 = r28.length()
            goto L_0x0d40
        L_0x0d3f:
            r11 = 1
        L_0x0d40:
            r7 = r0
            java.lang.String r8 = "setFont setSpan error: %s"
            if (r3 == 0) goto L_0x0d64
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan     // Catch:{ IndexOutOfBoundsException -> 0x0d54 }
            r0.<init>(r11)     // Catch:{ IndexOutOfBoundsException -> 0x0d54 }
            r3 = r28
            r9 = 17
            r3.setSpan(r0, r12, r7, r9)     // Catch:{ IndexOutOfBoundsException -> 0x0d52 }
            goto L_0x0d66
        L_0x0d52:
            r0 = move-exception
            goto L_0x0d57
        L_0x0d54:
            r0 = move-exception
            r3 = r28
        L_0x0d57:
            java.lang.Object[] r9 = new java.lang.Object[r11]
            java.lang.String r0 = r0.getMessage()
            r11 = 0
            r9[r11] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r8, r9)
            goto L_0x0d66
        L_0x0d64:
            r3 = r28
        L_0x0d66:
            if (r6 == 0) goto L_0x0d81
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan     // Catch:{ IndexOutOfBoundsException -> 0x0d73 }
            r0.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0d73 }
            r6 = 17
            r3.setSpan(r0, r12, r7, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0d73 }
            goto L_0x0d81
        L_0x0d73:
            r0 = move-exception
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r6 = 0
            r9[r6] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r8, r9)
        L_0x0d81:
            r6 = 14
            if (r2 == r6) goto L_0x0d9e
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan     // Catch:{ IndexOutOfBoundsException -> 0x0d90 }
            r0.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0d90 }
            r2 = 17
            r3.setSpan(r0, r12, r7, r2)     // Catch:{ IndexOutOfBoundsException -> 0x0d90 }
            goto L_0x0d9e
        L_0x0d90:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r6[r2] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r8, r6)
        L_0x0d9e:
            int r12 = r4.f218230a
            int r0 = r4.f218231b
            int r2 = r4.f218235f
            int r2 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "setColor, rangeFrom = "
            r4.append(r6)
            r4.append(r12)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r1 = ", color = "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r1)
            java.lang.String r1 = "setColor, params error. length:%d, from:%d, to:%d"
            if (r12 >= 0) goto L_0x0dee
            r4 = 3
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r4 = r3.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r6[r7] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r7 = 1
            r6[r7] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r7 = 2
            r6[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r6)
            r12 = 0
        L_0x0dee:
            int r4 = r3.length()
            if (r0 <= r4) goto L_0x0e18
            r4 = 3
            java.lang.Object[] r6 = new java.lang.Object[r4]
            int r7 = r3.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 0
            r6[r9] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r6[r9] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = 2
            r6[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r1, r6)
            int r0 = r3.length()
            goto L_0x0e1a
        L_0x0e18:
            r4 = 3
            r7 = 2
        L_0x0e1a:
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan     // Catch:{ IndexOutOfBoundsException -> 0x0e29 }
            r1.<init>(r2)     // Catch:{ IndexOutOfBoundsException -> 0x0e29 }
            r2 = 17
            r3.setSpan(r1, r12, r0, r2)     // Catch:{ IndexOutOfBoundsException -> 0x0e27 }
        L_0x0e24:
            r1 = 1
            r9 = 0
            goto L_0x0e39
        L_0x0e27:
            r0 = move-exception
            goto L_0x0e2c
        L_0x0e29:
            r0 = move-exception
            r2 = 17
        L_0x0e2c:
            r1 = 1
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r9 = 0
            r6[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r8, r6)
        L_0x0e39:
            int r0 = r27 + 1
            r8 = r40
            r9 = r41
            r15 = r43
            r2 = r3
            r14 = r17
            r26 = r18
            r23 = r24
            r13 = r29
            r7 = r30
            r6 = r34
            r4 = r37
            r1 = r38
            r3 = r0
            goto L_0x02c3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemDyeingTemplate.mo102960M0(com.tencent.mm.ui.chatting.viewitems.q8, java.util.Map, com.tencent.mm.storage.f4, uj3.e):void");
    }

    /* renamed from: N0 */
    public final int mo102961N0(String str) {
        int i;
        if (str == null) {
            str = "-1";
        }
        try {
            i = Integer.valueOf(str).intValue();
        } catch (NumberFormatException e) {
            Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", e.getMessage());
            i = -1;
        }
        return Util.nullAsInt(Integer.valueOf(i), -1);
    }

    /* renamed from: O0 */
    public final int mo102962O0(Map<String, String> map) {
        return mo102961N0(map.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type"));
    }

    /* renamed from: P0 */
    public final void mo102963P0(Map<String, String> map, C72963f4 f4Var, C74307x8 x8Var, boolean z, C22222c.C22225c cVar, boolean z2) {
        boolean z3 = !cVar.f62963a;
        boolean z4 = cVar.f62964b;
        Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "alvinluo handleAppBrandMsgLogic isTmpBanned: %b, isNewTmpl: %b, templateId: %s, templateTitle: %s, isSwitchOpened: %b", Boolean.valueOf(z3), Boolean.valueOf(z2), this.f216849I, this.f216854N, Boolean.valueOf(z4));
        x8Var.f218248L.setVisibility(8);
        if (z3 || (z2 && !z4)) {
            mo102970X0(x8Var, 0);
            x8Var.f218249M.setText(this.f216867v.mo91572m().getString(z2 ? C0966R.string.hdi : C0966R.string.hdc));
        } else {
            mo102970X0(x8Var, 8);
            x8Var.f218249M.setText(this.f216867v.mo91572m().getString(z2 ? C0966R.string.hdh : C0966R.string.hck));
        }
        x8Var.f218248L.setTag(C0966R.C0970id.hbt, f4Var);
        if (cVar.f62965c) {
            x8Var.f218272l.setVisibility(0);
        } else {
            x8Var.f218272l.setVisibility(8);
        }
    }

    /* renamed from: Q0 */
    public final boolean mo102964Q0(int i) {
        return i == 2 || i == 3;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: R0 */
    public final void mo102965R0(ImageView imageView, String str, int i, int i2) {
        if (!Util.isNullOrNil(str) && imageView != null) {
            C20937c.C20939b bVar = new C20937c.C20939b();
            C97625j3.m125812b().getClass();
            bVar.f59351g = C7970a.m8128b();
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59354j = i;
            bVar.f59355k = i2;
            C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
        }
    }

    /* renamed from: T0 */
    public final void mo102966T0(int i, Map<String, String> map, String str) {
        mo102967U0(i, map, str, "", "");
    }

    /* renamed from: U0 */
    public final void mo102967U0(int i, Map<String, String> map, String str, String str2, String str3) {
        String nullAs = Util.nullAs(map.get(".msg.appmsg.mmreader.template_header.transaction_id"), "");
        String nullAs2 = Util.nullAs(map.get(".msg.appmsg.mmreader.template_header.finder_user_name"), "");
        String nullAs3 = !Util.isNullOrNil(str2) ? str2 : Util.nullAs(map.get(".msg.appmsg.mmreader.template_header.finder_feedid"), "");
        if (!Util.isNullOrNil(nullAs)) {
            mo102968V0(i, nullAs, nullAs2, nullAs3, str, str3);
        }
    }

    /* renamed from: V0 */
    public final void mo102968V0(int i, String str, String str2, String str3, String str4, String str5) {
        C115669n.INSTANCE.mo160131h(22516, Integer.valueOf(i), str, Integer.valueOf(Util.isNullOrNil(str2) ^ true ? 1 : 0), str2, str3, str4, str5);
    }

    /* renamed from: W0 */
    public final void mo102969W0(int i, String str, String str2) {
        if (mo102964Q0(this.f216855P) && C72996z1.m85840k5(str) && C47984k.m53340n(str2)) {
            C22894a.C22897b bVar = this.f216862W;
            C22894a aVar = C22894a.f65798a;
            C87412m.m108594g(bVar, "reportInfo");
            Log.m105925i("MicroMsg.SubscribeMsgReporter", "alvinluo reportSubscribeMsgOpInNotifyMessage opType: %s, username: %s, jumpType: %s, jumpInfo: %s", Integer.valueOf(i), bVar.f65818a, Integer.valueOf(bVar.f65824g), bVar.f65825h);
            C117407d.INSTANCE.mo160131h(21811, bVar.f65818a, bVar.f65820c, Integer.valueOf(bVar.f65821d), bVar.f65822e, bVar.f65823f, Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(bVar.f65824g), bVar.f65825h, Integer.valueOf(bVar.f65819b));
        }
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        if (f4Var != null && menuItem.getItemId() == 102) {
            C78374b a = C78374b.m94638a(f4Var.getContent());
            if (((C79375p) bVar.f193278b.mo102812a(C79375p.class)).mo70111L3()) {
                int i = a.f229660a;
                boolean z = true;
                if (!(i == 0 || i == 1 || i == 3)) {
                    z = false;
                }
                if (z) {
                    int i2 = a.f229665f;
                    StringBuilder sb = new StringBuilder();
                    sb.append(a.f229662c);
                    sb.append("\n");
                    if (i2 != 0) {
                        List<C78374b.C78375a> list = a.f229668i;
                        if (list != null) {
                            ArrayList arrayList = (ArrayList) list;
                            if (!arrayList.isEmpty()) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C78374b.C78375a aVar = (C78374b.C78375a) it.next();
                                    sb.append(aVar.f229669a);
                                    sb.append(XVFSFile.PATH_SEPARATOR);
                                    sb.append(aVar.f229670b);
                                    sb.append("\n");
                                }
                                if (sb.length() > 0) {
                                    sb.setLength(sb.length() - 1);
                                }
                                String sb4 = sb.toString();
                                ClipboardHelper.setText(MMApplicationContext.getContext(), sb4, sb4);
                                C76701a.makeText((Context) bVar.mo91565f(), (int) C0966R.string.f7938wv, 0).show();
                            }
                        }
                    } else if (!Util.isNullOrNil(a.f229667h)) {
                        sb.append(a.f229667h);
                        String sb5 = sb.toString();
                        ClipboardHelper.setText(MMApplicationContext.getContext(), sb5, sb5);
                        C76701a.makeText((Context) bVar.mo91565f(), (int) C0966R.string.f7938wv, 0).show();
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: X0 */
    public final void mo102970X0(C74307x8 x8Var, int i) {
        boolean z = this.f216864Y;
        if (this.f216857R) {
            x8Var.f218267g.setVisibility(8);
            if (this.f216856Q) {
                ViewGroup.LayoutParams layoutParams = x8Var.f218271k.getLayoutParams();
                if (i == 0) {
                    x8Var.f218273m.setVisibility(i);
                    x8Var.f218273m.measure(0, 0);
                    this.f216859T = (((this.f216860U - (f216836R0.intValue() * 4)) - f216835Q0.intValue()) - x8Var.f218273m.getMeasuredWidth()) - (z ? f216837S0.intValue() : 0);
                    Log.m105927v("MicroMsg.ChattingItemDyeingTemplate", "setBanViewVisibility screenWidth: %s, size8Dp: %s, 16dp: %s, 32dp: %s, templateTitleMeasuredWith: %s, templateTitleMaxWidth: %s, ban.width: %s", Integer.valueOf(this.f216860U), f216835Q0, f216836R0, f216837S0, Integer.valueOf(this.f216858S), Integer.valueOf(this.f216859T), Integer.valueOf(x8Var.f218273m.getMeasuredWidth()));
                    int i2 = this.f216858S;
                    int i3 = this.f216859T;
                    if (i2 <= i3) {
                        x8Var.f218271k.setEllipsize((TextUtils.TruncateAt) null);
                        int i4 = layoutParams.width;
                        int i5 = this.f216858S;
                        if (i4 != i5) {
                            layoutParams.width = i5;
                            x8Var.f218271k.setLayoutParams(layoutParams);
                        }
                    } else if (layoutParams.width != i3) {
                        layoutParams.width = i3;
                        x8Var.f218271k.setEllipsize(TextUtils.TruncateAt.END);
                        x8Var.f218271k.setLayoutParams(layoutParams);
                    }
                } else {
                    x8Var.f218273m.setVisibility(i);
                    x8Var.f218271k.setEllipsize(TextUtils.TruncateAt.END);
                    if (layoutParams.width != -2) {
                        layoutParams.width = -2;
                        x8Var.f218271k.setLayoutParams(layoutParams);
                    }
                }
            } else {
                x8Var.f218273m.setVisibility(8);
                mo102972Z0(x8Var, i);
            }
        } else {
            x8Var.f218271k.setEllipsize((TextUtils.TruncateAt) null);
            x8Var.f218273m.setVisibility(8);
            mo102972Z0(x8Var, i);
        }
    }

    /* renamed from: Y0 */
    public final void mo102971Y0(View view, C72963f4 f4Var, Map<String, String> map, String str, int i, String str2, int i2) {
        if (f4Var != null && "notifymessage".equals(f4Var.mo108768t())) {
            C74243t8 t8Var = (C74243t8) view.getTag();
            t8Var.f217958J = i;
            t8Var.f217959K = str2;
            Bundle bundle = new Bundle();
            bundle.putInt("click_area_type", i2);
            bundle.putInt("is_top_msg", Util.getInt(map.get(".msg.appmsg.mmreader.template_detail.is_top_msg"), 0));
            bundle.putString("top_msg_content", Util.nullAsNil(map.get(".msg.appmsg.mmreader.template_detail.top_msg_content")));
            t8Var.f217960L = bundle;
            String nullAs = Util.nullAs(map.get(".msg.appmsg.mmreader.template_header.transaction_id"), "");
            if (!Util.isNullOrNil(nullAs)) {
                String nullAs2 = Util.nullAs(map.get(".msg.appmsg.mmreader.template_header.finder_user_name"), "");
                String nullAs3 = Util.nullAs(map.get(".msg.appmsg.mmreader.template_header.finder_feedid"), "");
                t8Var.f217961M = nullAs;
                t8Var.f217962N = nullAs2;
                t8Var.f217963O = nullAs3;
            }
            view.setTag(t8Var);
            view.setOnClickListener(this.f216843C);
        }
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        boolean z = false;
        if (t8Var == null) {
            return false;
        }
        int b = t8Var.mo103252b();
        C78374b a = C78374b.m94638a(f4Var.getContent());
        if (((C79375p) this.f216867v.f193278b.mo102812a(C79375p.class)).mo70111L3()) {
            int i = a.f229660a;
            if (i == 0 || i == 1 || i == 3) {
                z = true;
            }
            if (z) {
                e0Var.mo107136c(b, 102, 0, this.f216867v.mo91572m().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
            }
        }
        if (!this.f216867v.mo91584y()) {
            e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        }
        return true;
    }

    /* renamed from: Z0 */
    public final void mo102972Z0(C74307x8 x8Var, int i) {
        x8Var.f218267g.setVisibility(i);
        if (i == 0) {
            x8Var.f218267g.setText(MMApplicationContext.getResources().getString(C0966R.string.f361107hd2));
        } else {
            x8Var.f218267g.setText("");
        }
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        int i;
        C67391b bVar2 = bVar;
        C72963f4 f4Var2 = f4Var;
        Class cls = C79375p.class;
        this.f216867v = bVar2;
        if (f216835Q0 == null) {
            f216835Q0 = Integer.valueOf(C76577a.m92155f(bVar.mo91565f(), C0966R.dimen.f3766df));
            f216836R0 = Integer.valueOf(C76577a.m92155f(bVar.mo91565f(), C0966R.dimen.f3736cp));
            f216837S0 = Integer.valueOf(C76577a.m92155f(bVar.mo91565f(), C0966R.dimen.f3749d0));
        }
        f216838T0 = bVar.mo91565f().getResources().getColor(C0966R.color.f3288ma);
        f216839U0 = bVar.mo91565f().getResources().getColor(C0966R.color.f3288ma);
        this.f216864Y = ((C79375p) bVar2.f193278b.mo102812a(cls)).mo70122s3();
        C74191q8 q8Var = (C74191q8) cVar;
        Map<String, String> parseXml = XmlParser.parseXml(f4Var.getContent(), "msg", (String) null);
        if (parseXml == null || parseXml.size() == 0) {
            Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", "filling fail, values is empty");
            q8Var.f217779b.setVisibility(8);
            return;
        }
        q8Var.f217779b.setVisibility(0);
        int i2 = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
        int i3 = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.is_pay_recepit"), 0);
        this.f216849I = Util.nullAsNil(parseXml.get(".msg.appmsg.template_id"));
        this.f216855P = mo102962O0(parseXml);
        this.f216851K = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_header.pay_style"), 0);
        this.f216844D.dead();
        ((C66282i) bVar2.f193278b.mo102812a(C66282i.class)).mo90406z0(this.f216845E);
        if (q8Var instanceof C74160o8) {
            C74160o8 o8Var = (C74160o8) q8Var;
            o8Var.f217687i.setVisibility(8);
            C79375p pVar = (C79375p) bVar2.f193278b.mo102812a(cls);
            i = i2;
            if (pVar != null) {
                long msgId = f4Var.getMsgId();
                if (pVar.mo70113N2(msgId)) {
                    long g2 = pVar.mo70118g2(msgId);
                    if (g2 >= 0) {
                        int size = pVar.mo70120i5(g2) == null ? 0 : pVar.mo70120i5(g2).size();
                        Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "filling end of group, id: %d, head id: %d, group size: %d", Long.valueOf(msgId), Long.valueOf(g2), Integer.valueOf(size));
                        C74243t8 t8Var = new C74243t8(f4Var2, str);
                        t8Var.f217970d = q8Var;
                        o8Var.f217687i.setVisibility(0);
                        TextView textView = o8Var.f217687i;
                        textView.setText(textView.getContext().getString(C0966R.string.bbz, new Object[]{Integer.valueOf(size)}));
                        o8Var.f217687i.setTag(t8Var);
                        o8Var.f217689k.f217718a.setTag(t8Var);
                        o8Var.f217687i.setOnClickListener(new C74279v5(this, o8Var));
                        o8Var.f217689k.f217718a.setOnBackgroundCardClickListener(new C74150o4(this, o8Var));
                        o8Var.timeTV.setVisibility(0);
                        o8Var.timeTV.setText(C72715f.m85112e(q8Var.timeTV.getContext(), f4Var.getCreateTime(), false));
                        o8Var.f217688j.f217820a.setVisibility(8);
                        if (size > 0) {
                            FoldableCellLayout foldableCellLayout = o8Var.f217689k.f217718a;
                            foldableCellLayout.setBackgroundCardLayout(C0966R.C0971layout.f6874qw);
                            foldableCellLayout.setBackgroundFillCardNum(size - 1);
                            View childAt = foldableCellLayout.getChildCount() > 0 ? foldableCellLayout.getChildAt(foldableCellLayout.getChildCount() - 1) : null;
                            if (childAt == null || childAt.getTag() == null) {
                                childAt = new C6807n4(LayoutInflater.from(o8Var.f217689k.f217718a.getContext()), C0966R.C0971layout.f6872qu);
                                C74191q8 q8Var2 = new C74191q8();
                                q8Var2.mo103209a(childAt);
                                childAt.setTag(q8Var2);
                                foldableCellLayout.mo153656a(childAt, new FrameLayout.LayoutParams(-2, -2));
                            }
                            C74191q8 q8Var3 = (C74191q8) childAt.getTag();
                            q8Var3.checkBox.setVisibility(8);
                            q8Var3.timeTV.setVisibility(8);
                            int i4 = Util.getInt(parseXml.get(".msg.appmsg.mmreader.template_detail.is_pay_recepit"), 0);
                            if (i != 0) {
                                View view = q8Var3.f217780c.f217878a;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                if (i4 == 1) {
                                    View view3 = q8Var3.f217781d.f218261a;
                                    C9556a aVar2 = new C9556a();
                                    aVar2.mo10233c(8);
                                    View view4 = view3;
                                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    View view5 = q8Var3.f217782e.f218261a;
                                    C9556a aVar3 = new C9556a();
                                    aVar3.mo10233c(0);
                                    View view6 = view5;
                                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                    C117292a.m165359e(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    q8Var3.f217781d = q8Var3.f217782e;
                                } else {
                                    View view7 = q8Var3.f217781d.f218261a;
                                    C9556a aVar4 = new C9556a();
                                    aVar4.mo10233c(0);
                                    View view8 = view7;
                                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                    C117292a.m165359e(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    View view9 = q8Var3.f217782e.f218261a;
                                    C9556a aVar5 = new C9556a();
                                    aVar5.mo10233c(8);
                                    View view10 = view9;
                                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(view10, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                mo102959L0(q8Var3, parseXml, f4Var, q8Var, i);
                                View view11 = q8Var3.f217781d.f218261a;
                                C9556a aVar6 = new C9556a();
                                aVar6.mo10233c(0);
                                View view12 = view11;
                                C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                C117292a.m165359e(view12, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            } else {
                                View view13 = q8Var3.f217781d.f218261a;
                                C9556a aVar7 = new C9556a();
                                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                aVar7.mo10233c(8);
                                View view14 = view13;
                                C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                C117292a.m165359e(view14, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                View view15 = q8Var3.f217782e.f218261a;
                                C9556a aVar8 = new C9556a();
                                aVar8.mo10233c(8);
                                View view16 = view15;
                                C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                C117292a.m165359e(view16, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                mo102960M0(q8Var3, parseXml, f4Var2, q8Var);
                                View view17 = q8Var3.f217780c.f217878a;
                                C9556a aVar9 = new C9556a();
                                aVar9.mo10233c(0);
                                View view18 = view17;
                                C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                                C117292a.m165359e(view18, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "fillingFolder", "(Lcom/tencent/mm/ui/chatting/viewitems/DyeingContainerHolder;Ljava/util/Map;Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                        o8Var.f217689k.f217718a.setVisibility(0);
                        return;
                    }
                    Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "filling content of group, id: %d", Long.valueOf(msgId));
                    o8Var.f217779b.setVisibility(8);
                    o8Var.timeTV.setVisibility(8);
                    o8Var.f217688j.f217820a.setVisibility(8);
                    o8Var.f217689k.f217718a.setVisibility(8);
                    return;
                }
                Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "normal msg, id: %d", Long.valueOf(msgId));
            }
            o8Var.f217688j.f217820a.setVisibility(0);
            o8Var.f217689k.f217718a.setVisibility(8);
        } else {
            i = i2;
        }
        C74307x8 x8Var = q8Var.f217783f;
        q8Var.f217781d = x8Var;
        if (i != 0) {
            View view19 = q8Var.f217780c.f217878a;
            C9556a aVar10 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar10.mo10233c(8);
            View view20 = view19;
            C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view20, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i3 == 1) {
                View view21 = q8Var.f217781d.f218261a;
                C9556a aVar11 = new C9556a();
                aVar11.mo10233c(8);
                View view22 = view21;
                C117292a.m165358d(view22, aVar11.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view21.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(view22, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view23 = q8Var.f217782e.f218261a;
                C9556a aVar12 = new C9556a();
                aVar12.mo10233c(0);
                View view24 = view23;
                C117292a.m165358d(view24, aVar12.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view23.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                C117292a.m165359e(view24, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                q8Var.f217781d = q8Var.f217782e;
            } else {
                View view25 = q8Var.f217781d.f218261a;
                C9556a aVar13 = new C9556a();
                aVar13.mo10233c(0);
                View view26 = view25;
                C117292a.m165358d(view26, aVar13.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view25.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                C117292a.m165359e(view26, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view27 = q8Var.f217782e.f218261a;
                C9556a aVar14 = new C9556a();
                aVar14.mo10233c(8);
                View view28 = view27;
                C117292a.m165358d(view28, aVar14.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view27.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                C117292a.m165359e(view28, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo102959L0(q8Var, parseXml, f4Var, q8Var, i);
            View view29 = q8Var.f217781d.f218261a;
            C9556a aVar15 = new C9556a();
            aVar15.mo10233c(0);
            View view30 = view29;
            C117292a.m165358d(view30, aVar15.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view29.setVisibility(((Integer) aVar15.mo10231a(0)).intValue());
            C117292a.m165359e(view30, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view31 = x8Var.f218261a;
        C9556a aVar16 = new C9556a();
        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
        aVar16.mo10233c(8);
        View view32 = view31;
        C117292a.m165358d(view32, aVar16.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view31.setVisibility(((Integer) aVar16.mo10231a(0)).intValue());
        C117292a.m165359e(view32, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view33 = q8Var.f217782e.f218261a;
        C9556a aVar17 = new C9556a();
        aVar17.mo10233c(8);
        View view34 = view33;
        C117292a.m165358d(view34, aVar17.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view33.setVisibility(((Integer) aVar17.mo10231a(0)).intValue());
        C117292a.m165359e(view34, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo102960M0(q8Var, parseXml, f4Var2, q8Var);
        View view35 = q8Var.f217780c.f217878a;
        C9556a aVar18 = new C9556a();
        aVar18.mo10233c(0);
        View view36 = view35;
        C117292a.m165358d(view36, aVar18.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view35.setVisibility(((Integer) aVar18.mo10231a(0)).intValue());
        C117292a.m165359e(view36, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: h */
    public void mo102973h(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        if (str != null && cVar.userTV != null) {
            mo103090g0(cVar, ((C76979h) C86312j.m106911c(C76979h.class)).yp0(bVar.mo91565f(), ((C79357g) bVar.f193278b.mo102812a(C79357g.class)).getDisplayName(str), cVar.userTV.getTextSize()));
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 318767153;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }
}
