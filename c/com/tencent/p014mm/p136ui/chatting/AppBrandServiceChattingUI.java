package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import c30.C104289g;
import com.tencent.p014mm.autogen.events.AppBrandGetServiceUnreadCountEvent;
import com.tencent.p014mm.autogen.events.AppBrandSetServiceUnreadCountEvent;
import com.tencent.p014mm.autogen.events.LocationServerEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.component.appbrand.AppBrandServiceComponent;
import com.tencent.p014mm.p136ui.chatting.component.appbrand.C73425c;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter$$n1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import de3.C45335p;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import kb0.C76529i;
import kj3.C76592n;
import kj3.C76593o;
import kr0.C76629w0;
import kr0.C76630x0;
import lb0.C88394b;
import p629ny.C76978g;
import wd3.C53155r0;
import zj3.C79336a;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.AppBrandServiceChattingUI */
public class AppBrandServiceChattingUI extends ChattingUI {
    /* renamed from: M7 */
    public ChattingUIFragment mo101990M7() {
        return new AppBrandServiceChattingFmUI(true);
    }

    public void onCreate(Bundle bundle) {
        if (!getIntent().getBooleanExtra("enableAnimation", false)) {
            overridePendingTransition(0, 0);
        } else {
            initNavigationSwipeBack();
        }
        super.onCreate((Bundle) null);
    }

    /* renamed from: com.tencent.mm.ui.chatting.AppBrandServiceChattingUI$AppBrandServiceChattingFmUI */
    public static class AppBrandServiceChattingFmUI extends ChattingUIFragment {

        /* renamed from: Q0 */
        public String f215154Q0;

        /* renamed from: R */
        public int f215155R;

        /* renamed from: R0 */
        public String f215156R0;

        /* renamed from: S */
        public WxaExposedParams f215157S;

        /* renamed from: S0 */
        public WxaAttributes.C68591b f215158S0;

        /* renamed from: T */
        public String f215159T;

        /* renamed from: T0 */
        public final ChatFooter$$n1 f215160T0 = new C73249a();

        /* renamed from: U */
        public String f215161U;

        /* renamed from: U0 */
        public C45335p f215162U0 = new C73250b();

        /* renamed from: V */
        public String f215163V;

        /* renamed from: V0 */
        public C76593o f215164V0;

        /* renamed from: W */
        public String f215165W;

        /* renamed from: W0 */
        public C73425c f215166W0 = new C73425c(new AppBrandServiceComponent());

        /* renamed from: X */
        public String f215167X;

        /* renamed from: Y */
        public byte[] f215168Y;

        /* renamed from: Z */
        public String f215169Z;

        /* renamed from: p0 */
        public boolean f215170p0;

        /* renamed from: x0 */
        public boolean f215171x0;

        /* renamed from: y0 */
        public int f215172y0;

        /* renamed from: com.tencent.mm.ui.chatting.AppBrandServiceChattingUI$AppBrandServiceChattingFmUI$a */
        public class C73249a implements ChatFooter$$n1 {
            public C73249a() {
            }

            /* renamed from: a */
            public boolean mo70088a(boolean z) {
                WxaAttributes.C68591b bVar = AppBrandServiceChattingFmUI.this.f215158S0;
                if (bVar != null) {
                    WxaAttributes.C68591b.C68592a aVar = bVar.f197028a.get(0);
                    AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = AppBrandServiceChattingFmUI.this;
                    if (appBrandServiceChattingFmUI.f215155R != 2 || !appBrandServiceChattingFmUI.f215157S.f239542g.equals(aVar.f197029a)) {
                        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                        appBrandStatObject.f245533f = 1080;
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).Rg0(AppBrandServiceChattingFmUI.this.getContext(), aVar.f197029a, "", 0, aVar.f197031c, aVar.f197030b, appBrandStatObject, AppBrandServiceChattingFmUI.this.mo101997z0());
                    } else {
                        Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "[bizmenu]onBackFromContact username:%s path:%s", aVar.f197029a, aVar.f197030b);
                        AppBrandServiceChattingFmUI.m86300w0(AppBrandServiceChattingFmUI.this, aVar.f197030b);
                        return true;
                    }
                } else {
                    Log.m105920e("MicroMsg.AppBrandServiceChattingUI", "[mOnOpenMiniProgramBtnClickListener]wxaBizMenu or wxaBizMenu.ButtonList is empty, error");
                }
                return true;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.AppBrandServiceChattingUI$AppBrandServiceChattingFmUI$b */
        public class C73250b implements C45335p {
            public C73250b() {
            }

            /* renamed from: a */
            public Object mo22792a(C53155r0 r0Var) {
                int i = r0Var.f148313d;
                if (i == 1 || i == 25 || i == 30 || i == 31) {
                    return AppBrandServiceChattingFmUI.this.f215220f.mo91577r();
                }
                return null;
            }

            /* renamed from: b */
            public Object mo22793b(C53155r0 r0Var) {
                String str;
                if (r0Var.f148313d != 45) {
                    return null;
                }
                String str2 = new String(Base64.decode(r0Var.f148312c, 0));
                try {
                    str = new String(Base64.decode(Util.nullAs(new C104289g((String) r0Var.mo73845a(String.class)).optString("path"), ""), 0));
                } catch (Exception e) {
                    Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "json parse fail: e = %s", e);
                    str = "";
                }
                Log.m105919d("MicroMsg.AppBrandServiceChattingUI", "appId:%s,path:%s", str2, str);
                AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = AppBrandServiceChattingFmUI.this;
                if (appBrandServiceChattingFmUI.f215155R != 2 || !appBrandServiceChattingFmUI.f215157S.f239539d.equals(str2)) {
                    AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
                    appBrandStatObject.f245533f = 1081;
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(AppBrandServiceChattingFmUI.this.getContext(), (String) null, str2, 0, 0, str, appBrandStatObject);
                    return null;
                }
                Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "onBackFromContact appId:%s path:%s", str2, str);
                AppBrandServiceChattingFmUI.m86300w0(AppBrandServiceChattingFmUI.this, str);
                return Boolean.TRUE;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.AppBrandServiceChattingUI$AppBrandServiceChattingFmUI$c */
        public class C73251c implements C76593o.C76594a {
            public C73251c() {
            }

            /* renamed from: a */
            public void mo70225a() {
                AppBrandServiceChattingFmUI.this.hideVKB();
                C68070l.C68072b bVar = new C68070l.C68072b();
                AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = AppBrandServiceChattingFmUI.this;
                bVar.f195570f = appBrandServiceChattingFmUI.f215163V;
                bVar.f195582i = 33;
                bVar.f195573f2 = appBrandServiceChattingFmUI.f215157S.f239542g;
                bVar.f195569e2 = Util.isNullOrNil(appBrandServiceChattingFmUI.f215165W) ? AppBrandServiceChattingFmUI.this.f215157S.f239549q : AppBrandServiceChattingFmUI.this.f215165W;
                WxaExposedParams wxaExposedParams = AppBrandServiceChattingFmUI.this.f215157S;
                bVar.f195577g2 = wxaExposedParams.f239539d;
                bVar.f195653z2 = wxaExposedParams.f239545j;
                bVar.f195467A2 = wxaExposedParams.f239546n;
                bVar.f195585i2 = wxaExposedParams.f239547o;
                bVar.f195581h2 = 2;
                bVar.f195586j = wxaExposedParams.f239550r;
                bVar.f195471B2 = wxaExposedParams.f239544i;
                bVar.f195494H1 = "wxapp_" + AppBrandServiceChattingFmUI.this.f215157S.f239539d + AppBrandServiceChattingFmUI.this.f215157S.f239549q;
                AppBrandServiceChattingFmUI appBrandServiceChattingFmUI2 = AppBrandServiceChattingFmUI.this;
                WxaExposedParams wxaExposedParams2 = appBrandServiceChattingFmUI2.f215157S;
                bVar.f195634v = wxaExposedParams2.f239542g;
                bVar.f195638w = wxaExposedParams2.f239543h;
                C73252d dVar = new C73252d((C73253a) null);
                dVar.f215177e = appBrandServiceChattingFmUI2.mo101997z0();
                dVar.f215176d = bVar;
                AppBrandServiceChattingFmUI appBrandServiceChattingFmUI3 = AppBrandServiceChattingFmUI.this;
                dVar.f215179g = appBrandServiceChattingFmUI3.f215167X;
                dVar.f215178f = appBrandServiceChattingFmUI3.f215169Z;
                dVar.f215180h = appBrandServiceChattingFmUI3.f215220f.mo91577r();
                AppBrandServiceChattingFmUI appBrandServiceChattingFmUI4 = AppBrandServiceChattingFmUI.this;
                dVar.f215181i = appBrandServiceChattingFmUI4.f215163V;
                dVar.f215182j = appBrandServiceChattingFmUI4.f215171x0;
                dVar.f215183n = appBrandServiceChattingFmUI4.f215168Y;
                C86709a0.m107525e().postToWorker(dVar);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.AppBrandServiceChattingUI$AppBrandServiceChattingFmUI$d */
        public static class C73252d implements Runnable {

            /* renamed from: d */
            public C68070l.C68072b f215176d;

            /* renamed from: e */
            public String f215177e;

            /* renamed from: f */
            public String f215178f;

            /* renamed from: g */
            public String f215179g;

            /* renamed from: h */
            public String f215180h;

            /* renamed from: i */
            public String f215181i;

            /* renamed from: j */
            public boolean f215182j;

            /* renamed from: n */
            public byte[] f215183n;

            public C73252d(C73253a aVar) {
            }

            public void run() {
                Bitmap bitmap;
                byte[] bArr;
                boolean z = true;
                if (!Util.isNullOrNil(this.f215178f)) {
                    String str = C88394b.f255384g;
                    C88394b bVar = C88394b.C88418q.f255427a;
                    bitmap = bVar.mo122791g("file://" + this.f215178f, (C88394b.C88405h) null);
                    if (bitmap == null || bitmap.isRecycled()) {
                        bitmap = BitmapUtil.getBitmapNative(this.f215179g);
                        if (this.f215182j) {
                            Log.m105927v("MicroMsg.AppBrandServiceChattingUI", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", this.f215179g, Boolean.valueOf(C86013q1.m106447h(this.f215178f)));
                        }
                    }
                } else {
                    String str2 = C88394b.f255384g;
                    bitmap = C88394b.C88418q.f255427a.mo122791g(this.f215179g, (C88394b.C88405h) null);
                }
                if (bitmap == null || bitmap.isRecycled()) {
                    Object[] objArr = new Object[1];
                    if (this.f215183n == null) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105921e("MicroMsg.AppBrandServiceChattingUI", "thumb image is null sendMessageDefaultImg:%b", objArr);
                    bArr = this.f215183n;
                } else {
                    Log.m105924i("MicroMsg.AppBrandServiceChattingUI", "thumb image is not null ");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                }
                C72695v.m85052E(this.f215176d, this.f215177e, this.f215181i, this.f215180h, (String) null, bArr);
            }
        }

        public AppBrandServiceChattingFmUI() {
        }

        /* renamed from: w0 */
        public static void m86300w0(AppBrandServiceChattingFmUI appBrandServiceChattingFmUI, String str) {
            appBrandServiceChattingFmUI.getClass();
            Intent intent = new Intent();
            intent.putExtra("keyOutPagePath", str);
            appBrandServiceChattingFmUI.thisActivity().setResult(-1, intent);
            appBrandServiceChattingFmUI.finish();
        }

        /* renamed from: P */
        public void mo70223P() {
            byte[] bArr;
            Class<C79336a> cls = C79336a.class;
            if (!this.f215220f.f193278b.f216514a.containsKey(cls)) {
                this.f215220f.mo91579t(cls, this.f215166W0);
            }
            super.mo70223P();
            this.f215155R = getIntExtra("app_brand_chatting_from_scene", 1);
            this.f215157S = (WxaExposedParams) getParcelableExtra("app_brand_chatting_expose_params");
            this.f215161U = Util.nullAsNil(getStringExtra("key_scene_id"));
            this.f215163V = getStringExtra("sendMessageTitle");
            this.f215165W = getStringExtra("sendMessagePath");
            this.f215167X = getStringExtra("sendMessageImg");
            try {
                Bitmap createBitmap = BitmapUtil.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(-1);
                bArr = BitmapUtil.Bitmap2Bytes(createBitmap);
            } catch (Exception e) {
                Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "obtainMessageDefaultImg fail:%s", e);
                bArr = new byte[0];
            }
            this.f215168Y = bArr;
            this.f215169Z = getStringExtra("sendMessageLocalImg");
            this.f215170p0 = getBooleanExtra("showMessageCard", false).booleanValue();
            this.f215171x0 = getBooleanExtra("needDelThumb", false).booleanValue();
            this.f215172y0 = getIntExtra("app_brand_chatting_from_scene_new", 3);
            this.f215154Q0 = getStringExtra("app_brand_chatting_from_scene_note_new");
            this.f215156R0 = getStringExtra("app_brand_chatting_from_app_id");
            Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate fromScene:%d", Integer.valueOf(this.f215155R));
            Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate wxaExposedParams:%s", this.f215157S);
            Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "mSceneId:%s, sendMessageTitle:%s, sendMessagePath:%s, sendMessageImg:%s, showMessageCard:%b, needDelThumb:%b", this.f215161U, this.f215163V, this.f215165W, this.f215167X, Boolean.valueOf(this.f215170p0), Boolean.valueOf(this.f215171x0));
            Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "AppBrandServiceChattingFmUI onCreate newScene: %d, newSceneNote: %s, fromAppId: %s", Integer.valueOf(this.f215172y0), this.f215154Q0, this.f215156R0);
        }

        /* renamed from: S */
        public void mo101991S() {
            super.mo101991S();
            ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f215162U0);
        }

        /* renamed from: T */
        public void mo101992T() {
            super.mo101992T();
            ((C76978g) C86312j.m106911c(C76978g.class)).k30(this.f215162U0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0134  */
        /* renamed from: e0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo101993e0() {
            /*
                r20 = this;
                r0 = r20
                super.mo101993e0()
                ck3.b r1 = r0.f215220f
                java.lang.String r1 = r1.mo91577r()
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                r3 = 1
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x0015
                goto L_0x006d
            L_0x0015:
                java.lang.Class<kr0.w0> r2 = kr0.C76629w0.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                kr0.w0 r2 = (kr0.C76629w0) r2
                com.tencent.mm.plugin.appbrand.config.WxaAttributes r2 = r2.mo106879N2(r1)
                if (r2 == 0) goto L_0x0061
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$b r1 = r2.f239435V0
                if (r1 != 0) goto L_0x005e
                java.lang.String r1 = r2.field_bizMenu
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x005e
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x005c }
                java.lang.String r6 = r2.field_bizMenu     // Catch:{ Exception -> 0x005c }
                r1.<init>(r6)     // Catch:{ Exception -> 0x005c }
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$b r6 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$b     // Catch:{ Exception -> 0x005c }
                r6.<init>()     // Catch:{ Exception -> 0x005c }
                r2.f239435V0 = r6     // Catch:{ Exception -> 0x005c }
                java.lang.String r6 = "interactive_mode"
                r1.optInt(r6, r4)     // Catch:{ Exception -> 0x005c }
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$b r6 = r2.f239435V0     // Catch:{ Exception -> 0x005c }
                java.lang.String r7 = "type"
                r1.optInt(r7, r4)     // Catch:{ Exception -> 0x005c }
                r6.getClass()     // Catch:{ Exception -> 0x005c }
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$b r6 = r2.f239435V0     // Catch:{ Exception -> 0x005c }
                java.lang.String r7 = "button_list"
                org.json.JSONArray r1 = r1.optJSONArray(r7)     // Catch:{ Exception -> 0x005c }
                java.util.List r1 = r2.mo113943p2(r1)     // Catch:{ Exception -> 0x005c }
                r6.f197028a = r1     // Catch:{ Exception -> 0x005c }
                goto L_0x005e
            L_0x005c:
                r2.f239435V0 = r5
            L_0x005e:
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$b r1 = r2.f239435V0
                goto L_0x006e
            L_0x0061:
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r2[r4] = r1
                java.lang.String r1 = "MicroMsg.AppBrandServiceHelper"
                java.lang.String r6 = "username:%s, attr is null or getWxaBizMenuByUsername return null"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r2)
            L_0x006d:
                r1 = r5
            L_0x006e:
                r0.f215158S0 = r1
                java.lang.String r2 = "MicroMsg.AppBrandServiceChattingUI"
                if (r1 == 0) goto L_0x0095
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$b$a> r1 = r1.f197028a
                int r1 = r1.size()
                if (r1 != r3) goto L_0x0095
                ck3.b r1 = r0.f215220f
                java.lang.Class<zj3.w> r6 = zj3.C79387w.class
                com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
                xi.d r1 = r1.mo102812a(r6)
                zj3.w r1 = (zj3.C79387w) r1
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r1.mo102193k1()
                r1.setSwitchButtonMode(r3)
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$n1 r6 = r0.f215160T0
                r1.setOnFooterSwitchListener(r6)
                goto L_0x00b6
            L_0x0095:
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$b r1 = r0.f215158S0
                if (r1 == 0) goto L_0x00b0
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$b$a> r1 = r1.f197028a
                if (r1 == 0) goto L_0x00b0
                java.lang.Object[] r6 = new java.lang.Object[r3]
                int r1 = r1.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6[r4] = r1
                java.lang.String r1 = "wxaBizMenu.buttonList.size():%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r6)
                goto L_0x00b6
            L_0x00b0:
                java.lang.String r1 = "wxaBizMenu or wxaBizMenu.buttonList is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            L_0x00b6:
                int r1 = r0.f215155R
                java.lang.String r6 = "key_temp_session_from"
                r7 = 3
                if (r1 != r7) goto L_0x00eb
                java.lang.String r1 = "sns_landing_pages_ux_info"
                java.lang.String r1 = r0.getStringExtra(r1)
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                if (r8 == 0) goto L_0x00ca
                goto L_0x00ce
            L_0x00ca:
                byte[] r5 = r1.getBytes()
            L_0x00ce:
                r12 = r5
                com.tencent.mm.modelsimple.r r1 = new com.tencent.mm.modelsimple.r
                ck3.b r5 = r0.f215220f
                java.lang.String r9 = r5.mo91577r()
                r10 = 20
                java.lang.String r11 = r0.getStringExtra(r6)
                int r13 = r0.f215172y0
                r8 = r1
                r8.<init>(r9, r10, r11, r12, r13)
                ob0.b0 r5 = eb0.C97625j3.m125815e()
                r5.mo123460f(r1)
                goto L_0x0107
            L_0x00eb:
                com.tencent.mm.modelsimple.r r1 = new com.tencent.mm.modelsimple.r
                ck3.b r5 = r0.f215220f
                java.lang.String r9 = r5.mo91577r()
                r10 = 19
                java.lang.String r11 = r0.getStringExtra(r6)
                r12 = 0
                int r13 = r0.f215172y0
                r8 = r1
                r8.<init>(r9, r10, r11, r12, r13)
                ob0.b0 r5 = eb0.C97625j3.m125815e()
                r5.mo123460f(r1)
            L_0x0107:
                java.lang.String r1 = r20.mo101997z0()
                ck3.b r5 = r0.f215220f
                java.lang.String r5 = r5.mo91577r()
                int r6 = r0.f215155R
                int r8 = r0.f215172y0
                java.lang.String r9 = r0.f215154Q0
                java.lang.String r10 = r0.f215156R0
                eb0.c r11 = eb0.C97625j3.m125812b()
                com.tencent.mm.storage.v3 r11 = r11.mo105908w()
                com.tencent.mm.storage.i2 r11 = (com.tencent.p014mm.storage.C44660i2) r11
                com.tencent.mm.storage.h2 r11 = r11.mo69771j(r5)
                if (r11 != 0) goto L_0x0134
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r1[r4] = r5
                java.lang.String r3 = "cvs:%s is null, error"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r1)
                goto L_0x01b4
            L_0x0134:
                int r5 = r11.mo108786G2()
                java.lang.String r11 = r0.f215161U
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
                int r12 = r9.length()
                r13 = 1024(0x400, float:1.435E-42)
                if (r12 <= r13) goto L_0x0152
                java.lang.String r9 = r9.substring(r4, r13)
            L_0x0152:
                r12 = 8
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r14 = 13799(0x35e7, float:1.9337E-41)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
                r13[r4] = r15
                r13[r3] = r1
                java.lang.Integer r15 = java.lang.Integer.valueOf(r6)
                r16 = 2
                r13[r16] = r15
                java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
                r13[r7] = r15
                r15 = 4
                r13[r15] = r11
                java.lang.Integer r17 = java.lang.Integer.valueOf(r8)
                r18 = 5
                r13[r18] = r17
                r17 = 6
                r13[r17] = r9
                r19 = 7
                r13[r19] = r10
                java.lang.String r14 = "stev report(%s), appId : %s, scene %s, unReadCount %d, sceneId %s, newScene: %d, newSceneNote: %s, fromAppId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r14, r13)
                com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r12 = new java.lang.Object[r12]
                r12[r4] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                r12[r3] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r12[r16] = r1
                r12[r7] = r11
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
                r12[r15] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                r12[r18] = r1
                r12[r17] = r9
                r12[r19] = r10
                r1 = 13799(0x35e7, float:1.9337E-41)
                r13.mo160131h(r1, r12)
            L_0x01b4:
                java.lang.String r1 = "AppBrandServiceChattingFmUI onActivityCreated NetSceneEnterTempSession"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI.mo101993e0():void");
        }

        /* renamed from: i0 */
        public void mo101994i0() {
            int i = this.f215155R;
            if (i == 2 || i == 3) {
                C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j("appbrandcustomerservicemsg");
                if (j == null || Util.isNullOrNil(j.getUsername())) {
                    Log.m105920e("MicroMsg.AppBrandServiceChattingUI", "update Unread: can not find SPUSER_APP_BRAND_SERVICE cvs");
                } else {
                    int G2 = j.mo108786G2();
                    AppBrandGetServiceUnreadCountEvent appBrandGetServiceUnreadCountEvent = new AppBrandGetServiceUnreadCountEvent();
                    appBrandGetServiceUnreadCountEvent.f78712d.f78714a = this.f215220f.mo91577r();
                    appBrandGetServiceUnreadCountEvent.publish();
                    int i2 = appBrandGetServiceUnreadCountEvent.f78713e.f78715a;
                    Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "parUnReadCount:%d, unReadCount:%d", Integer.valueOf(G2), Integer.valueOf(i2));
                    j.mo108812g3(Math.max(0, G2 - i2));
                    if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69775m0(j, j.getUsername(), true, true) == -1) {
                        Log.m105920e("MicroMsg.AppBrandServiceChattingUI", "update SPUSER_APP_BRAND_SERVICE cvs unread failed");
                    } else {
                        AppBrandSetServiceUnreadCountEvent appBrandSetServiceUnreadCountEvent = new AppBrandSetServiceUnreadCountEvent();
                        appBrandSetServiceUnreadCountEvent.f78716d.f78717a = this.f215220f.mo91577r();
                        appBrandSetServiceUnreadCountEvent.f78716d.getClass();
                        appBrandSetServiceUnreadCountEvent.publish();
                    }
                }
            } else {
                Log.m105925i("MicroMsg.AppBrandServiceChattingUI", "writeOpLogAndMarkRead clear AppBrandKvData username:%s", this.f215220f.mo91577r());
                AppBrandSetServiceUnreadCountEvent appBrandSetServiceUnreadCountEvent2 = new AppBrandSetServiceUnreadCountEvent();
                appBrandSetServiceUnreadCountEvent2.f78716d.f78717a = this.f215220f.mo91577r();
                appBrandSetServiceUnreadCountEvent2.f78716d.getClass();
                appBrandSetServiceUnreadCountEvent2.publish();
            }
            super.mo101994i0();
        }

        /* renamed from: o0 */
        public void mo101995o0() {
            super.mo101995o0();
            LocationServerEvent locationServerEvent = new LocationServerEvent();
            LocationServerEvent.C67729a aVar = locationServerEvent.f193728d;
            aVar.f193730a = 0;
            aVar.f193731b = LocaleUtil.getApplicationLanguage();
            if (C72996z1.m85820U5(this.f215220f.mo91577r())) {
                locationServerEvent.f193728d.f193732c = true;
            } else {
                locationServerEvent.f193728d.f193732c = false;
            }
            locationServerEvent.publish();
        }

        public void onViewAttachedToWindow(View view) {
            Class cls = C76529i.class;
            super.onViewAttachedToWindow(view);
            int i = this.f215155R;
            if ((i == 2 || i == 3 || i == 4) && this.f215170p0) {
                if (this.f215164V0 == null) {
                    ChatFooter k1 = ((C79387w) this.f215220f.f193278b.mo102812a(C79387w.class)).mo102193k1();
                    C76593o oVar = new C76593o(getActivity(), k1, k1);
                    this.f215164V0 = oVar;
                    oVar.f224184q = false;
                }
                if (!Util.isNullOrNil(this.f215169Z)) {
                    String str = C88394b.f255384g;
                    C88394b bVar = C88394b.C88418q.f255427a;
                    C76593o oVar2 = this.f215164V0;
                    bVar.mo122797p(oVar2, "file://" + this.f215169Z, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(cls)).Ij0((int) mo101996x0(75), (int) mo101996x0(60)));
                } else {
                    String str2 = C88394b.f255384g;
                    C88394b.C88418q.f255427a.mo122797p(this.f215164V0, this.f215167X, (C88394b.C88408j) null, ((C76529i) C86312j.m106911c(cls)).Ij0((int) mo101996x0(75), (int) mo101996x0(60)));
                }
                C76593o oVar3 = this.f215164V0;
                oVar3.f224185r = new C73251c();
                Log.m105918d("MicroMsg.AppBrandServiceImageBubble", "show");
                C86709a0.m107525e().postToWorker(new C76592n(oVar3));
            }
        }

        /* renamed from: x0 */
        public final float mo101996x0(int i) {
            return TypedValue.applyDimension(1, (float) i, getContext().getResources().getDisplayMetrics());
        }

        /* renamed from: z0 */
        public final String mo101997z0() {
            if (Util.isNullOrNil(this.f215159T)) {
                WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(this.f215220f.mo91577r());
                this.f215159T = N2 == null ? null : N2.field_appId;
            }
            if (Util.isNullOrNil(this.f215159T)) {
                Log.m105920e("MicroMsg.AppBrandServiceChattingUI", "error, appId is null");
            }
            return this.f215159T;
        }

        public AppBrandServiceChattingFmUI(boolean z) {
            super(z);
        }
    }
}
