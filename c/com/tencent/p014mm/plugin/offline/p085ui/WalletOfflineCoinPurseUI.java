package com.tencent.p014mm.plugin.offline.p085ui;

import a63.C67008a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import b63.C113146l;
import b63.C67180c;
import b63.C67183e;
import b63.C67188h0;
import b63.C67203r0;
import b63.C67205s0;
import b63.C67207t;
import b73.C28273c;
import b73.C67213b;
import com.hilive.mediasdk.SdkInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CardOfflinePayFinishButtonEvent;
import com.tencent.p014mm.autogen.events.DoOfflineShowCodeEventEvent;
import com.tencent.p014mm.autogen.events.FuckOfflinePayResultEvent;
import com.tencent.p014mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.autogen.events.OfflineBindCardEventEvent;
import com.tencent.p014mm.autogen.events.OfflineCreateEvent;
import com.tencent.p014mm.autogen.events.OpenECardFinishEvent;
import com.tencent.p014mm.autogen.events.ShowWalletOrderInfoEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.autogen.events.WalletOfflineRealNameNotifyEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ClickFFOfflineCoinPurseStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.offline.C30326g;
import com.tencent.p014mm.plugin.offline.C69945c;
import com.tencent.p014mm.plugin.offline.C69952f;
import com.tencent.p014mm.plugin.offline.C69959k;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75105d;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75218i;
import com.tencent.p014mm.wallet_core.p137ui.C75225n;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.C75240v;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C75576f4;
import f40.C86709a0;
import f40.C86737h0;
import g63.C75886j;
import gy3.C87412m;
import h81.C32735h;
import hi3.C87515a;
import id2.C46217g;
import id2.C76303b;
import id2.C76311p;
import id2.C76312r;
import id2.C76313t;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k53.C76492a;
import kd2.C76555c;
import kd2.C76559f;
import kg3.C76577a;
import l20.C21388a;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76901s0;
import nj3.C76912y0;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87203t;
import p200lx.C76736w;
import p281yz.C79173v;
import p327ct.C20362d;
import p327ct.C30914c;
import p626nv.C109759g;
import p626nv.C76963d;
import p629ny.C76979h;
import p755xs.C102720b;
import p823sg.C77710q;
import qo3.C77390c0;
import qo3.C77398g;
import te3.C64485k53;
import te3.C64651q80;
import te3.C77951j53;
import te3.C77963l1;
import ub3.C78144b;
import v53.C78342e0;
import xi2.C78843b;
import yq3.C79144b;
import yq3.C79148e;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI */
public class WalletOfflineCoinPurseUI extends WalletBaseUI implements C76313t.C76314b, C102720b.C78973a, C69945c, C69990b, ScreenShotUtil.ScreenShotCallback, C76555c.C76557b {

    /* renamed from: W1 */
    public static final /* synthetic */ int f201810W1 = 0;

    /* renamed from: A */
    public String f201811A;

    /* renamed from: A1 */
    public boolean f201812A1 = false;

    /* renamed from: B */
    public View f201813B;

    /* renamed from: B1 */
    public boolean f201814B1 = false;

    /* renamed from: C */
    public TextView f201815C;

    /* renamed from: C1 */
    public String f201816C1;

    /* renamed from: D */
    public WeImageView f201817D;

    /* renamed from: D1 */
    public JsApiOfflineUserBindQueryResultCallBackEvent f201818D1;

    /* renamed from: E */
    public RelativeLayout f201819E;

    /* renamed from: E1 */
    public IListener<WalletPayResultEvent> f201820E1;

    /* renamed from: F */
    public LinearLayout f201821F;

    /* renamed from: F1 */
    public IListener<JsApiOfflineUserBindQueryResultCallBackEvent> f201822F1;

    /* renamed from: G */
    public CdnImageView f201823G;

    /* renamed from: G1 */
    public IListener<WalletPayResultEvent> f201824G1;

    /* renamed from: H */
    public TextView f201825H;

    /* renamed from: H1 */
    public IListener<DoOfflineShowCodeEventEvent> f201826H1;

    /* renamed from: I */
    public TextView f201827I;

    /* renamed from: I1 */
    public IListener<OpenECardFinishEvent> f201828I1;

    /* renamed from: J */
    public WalletOfflineCoinPurseUI$$e0 f201829J;

    /* renamed from: J1 */
    public IListener<OfflineBindCardEventEvent> f201830J1;

    /* renamed from: K */
    public WalletOfflineCoinPurseUI$$h0 f201831K;

    /* renamed from: K1 */
    public IListener<OfflineCreateEvent> f201832K1;

    /* renamed from: L */
    public WalletOfflineCoinPurseUI$$b0 f201833L;

    /* renamed from: L1 */
    public IListener f201834L1;

    /* renamed from: M */
    public WalletOfflineCoinPurseUI$$f0 f201835M;

    /* renamed from: M1 */
    public IListener f201836M1;

    /* renamed from: N */
    public WalletOfflineCoinPurseUI$$d0 f201837N;

    /* renamed from: N1 */
    public IListener f201838N1;

    /* renamed from: O1 */
    public View.OnClickListener f201839O1;

    /* renamed from: P */
    public LinearLayout f201840P;

    /* renamed from: P1 */
    public boolean f201841P1;

    /* renamed from: Q */
    public CdnImageView f201842Q;

    /* renamed from: Q0 */
    public String f201843Q0 = "";

    /* renamed from: Q1 */
    public HashMap<String, Integer> f201844Q1;

    /* renamed from: R */
    public TextView f201845R;

    /* renamed from: R0 */
    public String f201846R0 = "";

    /* renamed from: R1 */
    public int f201847R1;

    /* renamed from: S */
    public WalletOfflineCoinPurseUI$$g0 f201848S;

    /* renamed from: S0 */
    public boolean f201849S0 = true;

    /* renamed from: S1 */
    public MTimerHandler f201850S1;

    /* renamed from: T */
    public boolean f201851T = false;

    /* renamed from: T0 */
    public boolean f201852T0 = false;

    /* renamed from: T1 */
    public MTimerHandler f201853T1;

    /* renamed from: U */
    public LinearLayout f201854U;

    /* renamed from: U0 */
    public C30326g f201855U0;

    /* renamed from: U1 */
    public MTimerHandler f201856U1;

    /* renamed from: V */
    public LinearLayout f201857V;

    /* renamed from: V0 */
    public int f201858V0;

    /* renamed from: V1 */
    public IListener<KindaBindCardEvent> f201859V1;

    /* renamed from: W */
    public LinearLayout f201860W;

    /* renamed from: W0 */
    public boolean f201861W0 = false;

    /* renamed from: X */
    public LinearLayout f201862X;

    /* renamed from: X0 */
    public boolean f201863X0 = false;

    /* renamed from: Y */
    public LinearLayout f201864Y;

    /* renamed from: Y0 */
    public boolean f201865Y0 = false;

    /* renamed from: Z */
    public LinearLayout f201866Z;

    /* renamed from: Z0 */
    public boolean f201867Z0 = true;

    /* renamed from: a1 */
    public boolean f201868a1 = false;

    /* renamed from: b1 */
    public int f201869b1 = -1;

    /* renamed from: c1 */
    public C76492a f201870c1;

    /* renamed from: d */
    public long f201871d = 0;

    /* renamed from: d1 */
    public int f201872d1 = 1;

    /* renamed from: e */
    public int f201873e = 3;

    /* renamed from: e1 */
    public boolean f201874e1 = false;

    /* renamed from: f */
    public HashMap<String, View> f201875f = new HashMap<>();

    /* renamed from: f1 */
    public boolean f201876f1 = false;

    /* renamed from: g */
    public HashMap<String, Integer> f201877g = new HashMap<>();

    /* renamed from: g1 */
    public boolean f201878g1 = false;

    /* renamed from: h */
    public int f201879h = -1;

    /* renamed from: h1 */
    public ArrayList<Bitmap> f201880h1 = new ArrayList<>();

    /* renamed from: i */
    public Bitmap f201881i = null;

    /* renamed from: i1 */
    public ArrayList<Bitmap> f201882i1 = new ArrayList<>();

    /* renamed from: j */
    public Bitmap f201883j = null;

    /* renamed from: j1 */
    public C75218i f201884j1;

    /* renamed from: k1 */
    public C70034w f201885k1;

    /* renamed from: l1 */
    public boolean f201886l1;

    /* renamed from: m1 */
    public OfflineAlertView f201887m1;

    /* renamed from: n */
    public boolean f201888n = false;

    /* renamed from: n1 */
    public boolean f201889n1 = false;

    /* renamed from: o */
    public boolean f201890o = false;

    /* renamed from: o1 */
    public int f201891o1;

    /* renamed from: p */
    public ArrayList<String> f201892p = new ArrayList<>();

    /* renamed from: p0 */
    public TextView f201893p0;

    /* renamed from: p1 */
    public boolean f201894p1 = false;

    /* renamed from: q */
    public ArrayList<String> f201895q = new ArrayList<>();

    /* renamed from: q1 */
    public String f201896q1 = null;

    /* renamed from: r */
    public ArrayList<Boolean> f201897r = new ArrayList<>();

    /* renamed from: r1 */
    public boolean f201898r1 = false;

    /* renamed from: s */
    public String f201899s = "";

    /* renamed from: s1 */
    public int f201900s1 = 0;

    /* renamed from: t */
    public String f201901t = "";

    /* renamed from: t1 */
    public String f201902t1;

    /* renamed from: u */
    public Bankcard f201903u;

    /* renamed from: u1 */
    public boolean f201904u1 = false;

    /* renamed from: v */
    public ScrollView f201905v;

    /* renamed from: v1 */
    public int f201906v1;

    /* renamed from: w */
    public View f201907w;

    /* renamed from: w1 */
    public boolean f201908w1 = true;

    /* renamed from: x */
    public ImageView f201909x;

    /* renamed from: x0 */
    public Toast f201910x0;

    /* renamed from: x1 */
    public boolean f201911x1 = false;

    /* renamed from: y */
    public ImageView f201912y;

    /* renamed from: y0 */
    public Dialog f201913y0;

    /* renamed from: y1 */
    public boolean f201914y1 = false;

    /* renamed from: z */
    public TextView f201915z;

    /* renamed from: z1 */
    public C67207t f201916z1;

    public WalletOfflineCoinPurseUI() {
        C40008f fVar = C40008f.f107254d;
        this.f201820E1 = new IListener<WalletPayResultEvent>(fVar) {
            {
                this.__eventId = 520089918;
            }

            public boolean callback(IEvent iEvent) {
                WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
                if (walletPayResultEvent.f194085d.f194091f) {
                    Log.m105922f("MicroMsg.WalletOfflineCoinPurseUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                } else {
                    dead();
                    if (walletPayResultEvent.f194085d.f194088c == 0) {
                        WalletOfflineCoinPurseUI.this.f201852T0 = false;
                    }
                }
                return false;
            }
        };
        this.f201822F1 = new IListener<JsApiOfflineUserBindQueryResultCallBackEvent>(fVar) {
            {
                this.__eventId = 1878810586;
            }

            public boolean callback(IEvent iEvent) {
                JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent = (JsApiOfflineUserBindQueryResultCallBackEvent) iEvent;
                JsApiOfflineUserBindQueryResultCallBackEvent.C67718a aVar = jsApiOfflineUserBindQueryResultCallBackEvent.f193679d;
                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "FQOpenResultCallBackEvent callback，appid：%s,event.data.nonceStr：%s，event.data.paySign：%s,event.data.signType:%s，event.data.bankType:%s，event.data.bindSerial:%s，event.data.openSuccess:%s", aVar.f193681a, aVar.f193684d, aVar.f193687g, aVar.f193688h, aVar.f193689i, aVar.f193690j, aVar.f193691k);
                WalletOfflineCoinPurseUI.this.f201818D1 = jsApiOfflineUserBindQueryResultCallBackEvent;
                ((C119157j) C119157j.f356862d).mo183895z(new C70025r0(this, jsApiOfflineUserBindQueryResultCallBackEvent));
                return false;
            }
        };
        this.f201824G1 = new IListener<WalletPayResultEvent>(fVar) {
            {
                this.__eventId = 520089918;
            }

            public boolean callback(IEvent iEvent) {
                Bankcard g;
                WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "callback from kinda");
                Intent intent = walletPayResultEvent.f194085d.f194086a;
                if (intent == null) {
                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "event.data.intent == null");
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        if (extras.getInt("isFromKinda") == 1 && extras.getInt("payScene") == 8) {
                            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "pay from Kinda ");
                            WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = WalletOfflineCoinPurseUI.this;
                            walletOfflineCoinPurseUI.f201914y1 = true;
                            walletOfflineCoinPurseUI.f201911x1 = false;
                        }
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "kinda offline pay cashier callback, with data.");
                        if (extras.getInt("payScene") == 8 && walletPayResultEvent.f194085d.f194088c == -1) {
                            String string = extras.getString("pay_bind_serial");
                            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "tempBindSerial:%s", string);
                            if (!Util.isNullOrNil(string) && (g = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91325g(string, true, true)) != null) {
                                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "bindSerial：now bindSerial:%s、pay serial:%s", WalletOfflineCoinPurseUI.this.f201899s, g.field_bindSerial);
                                if (C67188h0.m79467b(g)) {
                                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "after pay：set as default bankcard");
                                    C76559f.m92123s(g.field_bindSerial);
                                    C69963m.wx0().vx0().f201767b = g.field_bindSerial;
                                } else {
                                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "after pay：do not set as default bankcard");
                                }
                            }
                            FuckOfflinePayResultEvent fuckOfflinePayResultEvent = new FuckOfflinePayResultEvent();
                            fuckOfflinePayResultEvent.f193628d.f193629a = "ok";
                            fuckOfflinePayResultEvent.publish();
                            WalletOfflineCoinPurseUI.this.finish();
                            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "kinda offline pay cashier callback, finish.");
                        }
                    }
                }
                return false;
            }
        };
        this.f201826H1 = new IListener<DoOfflineShowCodeEventEvent>(fVar) {
            {
                this.__eventId = -1811648750;
            }

            public boolean callback(IEvent iEvent) {
                DoOfflineShowCodeEventEvent doOfflineShowCodeEventEvent = (DoOfflineShowCodeEventEvent) iEvent;
                Log.m105918d("MicroMsg.WalletOfflineCoinPurseUI", "do offline showcode");
                C76311p pVar = new C76311p(C69963m.wx0().vx0().mo96260b(), WalletOfflineCoinPurseUI.this.f201879h, 0, doOfflineShowCodeEventEvent.f193545d.f193546a, "", C76559f.m92110f() == 2 ? "1" : "0");
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(pVar);
                return false;
            }
        };
        this.f201828I1 = new IListener<OpenECardFinishEvent>(fVar) {
            {
                this.__eventId = 1883130380;
            }

            public boolean callback(IEvent iEvent) {
                ((OpenECardFinishEvent) iEvent).f107686d.getClass();
                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", " ecard finish: %s", 0);
                WalletOfflineCoinPurseUI.this.doSceneProgress(new C78342e0((String) null, 8), false);
                return false;
            }
        };
        this.f201830J1 = new IListener<OfflineBindCardEventEvent>(fVar) {
            {
                this.__eventId = 619332608;
            }

            public boolean callback(IEvent iEvent) {
                OfflineBindCardEventEvent offlineBindCardEventEvent = (OfflineBindCardEventEvent) iEvent;
                WalletOfflineCoinPurseUI.this.doSceneProgress(new C78342e0((String) null, 8), false);
                WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = WalletOfflineCoinPurseUI.this;
                int i = WalletOfflineCoinPurseUI.f201810W1;
                walletOfflineCoinPurseUI.mo96305a8();
                WalletOfflineCoinPurseUI.this.mo96307b8();
                WalletOfflineCoinPurseUI.this.mo96302X7();
                return false;
            }
        };
        this.f201832K1 = new IListener<OfflineCreateEvent>(fVar) {
            {
                this.__eventId = 1771437899;
            }

            public boolean callback(IEvent iEvent) {
                if (((OfflineCreateEvent) iEvent).f193775d.f193776a == hashCode()) {
                    return false;
                }
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "has create a new ui, finish self");
                WalletOfflineCoinPurseUI.this.finish();
                return false;
            }
        };
        this.f201834L1 = new IListener<ShowWalletOrderInfoEvent>(fVar) {
            {
                this.__eventId = -837480444;
            }

            public boolean callback(IEvent iEvent) {
                ShowWalletOrderInfoEvent showWalletOrderInfoEvent = (ShowWalletOrderInfoEvent) iEvent;
                if (WalletOfflineCoinPurseUI.this.isFinishing()) {
                    return false;
                }
                WalletOfflineCoinPurseUI.this.finish();
                return false;
            }
        };
        this.f201836M1 = new IListener<WalletOfflineRealNameNotifyEvent>(fVar) {
            {
                this.__eventId = 201806318;
            }

            public boolean callback(IEvent iEvent) {
                WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent = (WalletOfflineRealNameNotifyEvent) iEvent;
                if (!(walletOfflineRealNameNotifyEvent instanceof WalletOfflineRealNameNotifyEvent)) {
                    return false;
                }
                WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = WalletOfflineCoinPurseUI.this;
                C76313t.C76322j jVar = walletOfflineRealNameNotifyEvent.f194081d.f194082a;
                int i = WalletOfflineCoinPurseUI.f201810W1;
                walletOfflineCoinPurseUI.getClass();
                if ("1".equals(jVar.f223580a)) {
                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "need realname verify");
                    Bundle bundle = new Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".ui.WalletOfflineCoinPurseUI");
                    bundle.putString("realname_verify_process_jump_plugin", "offline");
                    C67008a.m79172h(walletOfflineCoinPurseUI, jVar.f223581b, 0, jVar.f223582c, jVar.f223583d, bundle, walletOfflineCoinPurseUI.isTransparent(), (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 0, 2);
                    return false;
                } else if ("2".equals(jVar.f223580a)) {
                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "need upload credit");
                    C67008a.m79173i(walletOfflineCoinPurseUI, jVar.f223581b, jVar.f223584e, jVar.f223582c, jVar.f223583d, false, (DialogInterface.OnClickListener) null);
                    return false;
                } else {
                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "realnameGuideFlag =  " + jVar.f223580a);
                    return false;
                }
            }
        };
        this.f201838N1 = new IListener<CardOfflinePayFinishButtonEvent>(fVar) {
            {
                this.__eventId = 2018267472;
            }

            public boolean callback(IEvent iEvent) {
                CardOfflinePayFinishButtonEvent cardOfflinePayFinishButtonEvent = (CardOfflinePayFinishButtonEvent) iEvent;
                if (C76559f.f224089g != 3 || !(cardOfflinePayFinishButtonEvent instanceof CardOfflinePayFinishButtonEvent) || !cardOfflinePayFinishButtonEvent.f193511d.f193512a) {
                    return false;
                }
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "finish button event!");
                WalletOfflineCoinPurseUI.this.finish();
                return true;
            }
        };
        this.f201839O1 = new WalletOfflineCoinPurseUI$$i(this);
        this.f201841P1 = false;
        this.f201844Q1 = new HashMap<>();
        this.f201847R1 = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        this.f201850S1 = new MTimerHandler(new WalletOfflineCoinPurseUI$$w(this), false);
        this.f201853T1 = new MTimerHandler(new WalletOfflineCoinPurseUI$$x(this), false);
        this.f201856U1 = new MTimerHandler(new WalletOfflineCoinPurseUI$$y(this), false);
        this.f201859V1 = new IListener<KindaBindCardEvent>(fVar) {
            {
                this.__eventId = 572563856;
            }

            public boolean callback(IEvent iEvent) {
                KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "KindaBindCardEvent callback");
                if (kindaBindCardEvent == null) {
                    return false;
                }
                C75133p0.m90117a();
                KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
                if (aVar != null) {
                    if (aVar.f193699a) {
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "KindaBindCardEvent bindCard Succ");
                        if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w()) {
                            WalletOfflineCoinPurseUI.this.doSceneForceProgress(new C78342e0((String) null, 13));
                        } else {
                            WalletOfflineCoinPurseUI.this.doSceneForceProgress(new C78342e0((String) null, 22));
                        }
                        WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = WalletOfflineCoinPurseUI.this;
                        walletOfflineCoinPurseUI.f201894p1 = true;
                        walletOfflineCoinPurseUI.f201896q1 = kindaBindCardEvent.f193698d.f193702d;
                    } else {
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "KindaBindCardEvent bindCard Cancel");
                    }
                }
                WalletOfflineCoinPurseUI.this.f201859V1.dead();
                return true;
            }
        };
    }

    /* renamed from: H7 */
    public static boolean m82434H7(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI) {
        walletOfflineCoinPurseUI.getClass();
        if (C79144b.m95773a().mo109087b()) {
            Log.m105918d("MicroMsg.WalletOfflineCoinPurseUI", "startKindaBindCard:true");
            walletOfflineCoinPurseUI.f201859V1.alive();
            return true;
        }
        Log.m105918d("MicroMsg.WalletOfflineCoinPurseUI", "startKindaBindCard:false");
        return false;
    }

    /* renamed from: R7 */
    public static void m82435R7(int i) {
        ClickFFOfflineCoinPurseStruct clickFFOfflineCoinPurseStruct = new ClickFFOfflineCoinPurseStruct();
        clickFFOfflineCoinPurseStruct.f9648d = i;
        clickFFOfflineCoinPurseStruct.mo86054n();
    }

    /* renamed from: A0 */
    public void mo96287A0() {
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "on token type change");
        mo96294O7();
        mo96298T7();
    }

    /* renamed from: C */
    public void mo96258C() {
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "token update, check if need refresh code");
        if (!Util.isNullOrNil(this.f201843Q0) && !Util.isNullOrNil(this.f201846R0)) {
            C64651q80 q802 = ((C57154g1) component(C57154g1.class)).f163791d;
            if (q802 == null || q802.f184980d == 0) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "has code showing, ignore code update");
                C115669n.INSTANCE.idkeyStat(1105, 75, 1, false);
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_offline_code_update_from_gettoken, false)) {
                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "abtest update code from get token is true, update code");
                    mo96308c8(0, false);
                    mo96291L7(true);
                    return;
                }
                return;
            }
        }
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "code is null or has disable block need update code");
        mo96308c8(0, false);
        mo96291L7(true);
    }

    /* renamed from: I7 */
    public final int mo96288I7(long j) {
        return Color.argb((int) ((j >> 24) & 255), (int) ((j >> 16) & 255), (int) ((j >> 8) & 255), (int) (j & 255));
    }

    /* renamed from: J7 */
    public final boolean mo96289J7() {
        if (!this.f201887m1.mo96281d(2)) {
            return false;
        }
        OfflineAlertView offlineAlertView = this.f201887m1;
        if (offlineAlertView.f201797d == 2) {
            offlineAlertView.mo96278a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Bankcard> c = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91321c(true);
        for (int i = 0; i < c.size(); i++) {
            arrayList.add(c.get(i));
        }
        Log.m105924i("MicroMsg.WalletOfflineUtil", "getOfflineBindBankCardList() list size is " + arrayList.size());
        if (arrayList.size() < 1) {
            Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
            return false;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Bankcard bankcard = (Bankcard) arrayList.get(i2);
            if (bankcard != null && bankcard.field_support_micropay && Util.isNullOrNil(bankcard.field_forbidWord)) {
                return true;
            }
        }
        OfflineAlertView offlineAlertView2 = this.f201887m1;
        View view = this.f201907w;
        WalletOfflineCoinPurseUI$$o walletOfflineCoinPurseUI$$o = new WalletOfflineCoinPurseUI$$o(this);
        WalletOfflineCoinPurseUI$$p walletOfflineCoinPurseUI$$p = new WalletOfflineCoinPurseUI$$p(this);
        offlineAlertView2.f201797d = 2;
        offlineAlertView2.setVisibility(0);
        offlineAlertView2.f201799f.removeAllViews();
        View inflate = LayoutInflater.from(offlineAlertView2.getContext()).inflate(C0966R.C0971layout.cfk, (ViewGroup) null);
        offlineAlertView2.f201799f.addView(inflate);
        view.post(new C70009j(offlineAlertView2, walletOfflineCoinPurseUI$$o, walletOfflineCoinPurseUI$$p, view, inflate));
        return false;
    }

    /* renamed from: K7 */
    public void mo96290K7(int i, String str, String str2, String str3) {
        doSceneProgress(new C46217g(i, str, str2, str3), C76559f.m92117m());
    }

    /* renamed from: L7 */
    public final void mo96291L7(boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Class cls = C76736w.class;
        long currentTimeMillis = System.currentTimeMillis();
        if (z && (Util.isNullOrNil(this.f201843Q0) || Util.isNullOrNil(this.f201846R0))) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "empty code!");
            if (this.f201887m1.mo96281d(5)) {
                OfflineAlertView offlineAlertView = this.f201887m1;
                if (offlineAlertView.f201797d == 5) {
                    offlineAlertView.mo96278a();
                }
                OfflineAlertView offlineAlertView2 = this.f201887m1;
                View view = this.f201907w;
                C69992b1 b1Var = new C69992b1(this);
                offlineAlertView2.f201797d = 5;
                offlineAlertView2.setVisibility(0);
                offlineAlertView2.f201800g = false;
                offlineAlertView2.f201799f.removeAllViews();
                View inflate = LayoutInflater.from(offlineAlertView2.getContext()).inflate(C0966R.C0971layout.cfn, (ViewGroup) null);
                offlineAlertView2.f201799f.addView(inflate);
                ((TextView) inflate.findViewById(C0966R.C0970id.f5782oh)).setText(C0966R.string.he9);
                Button button = (Button) inflate.findViewById(C0966R.C0970id.f358422f12);
                button.setText(C0966R.string.he8);
                button.setOnClickListener(b1Var);
                ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.j0f);
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                view.post(new C57152c(offlineAlertView2, view, inflate));
                C115669n.INSTANCE.idkeyStat(135, 73, 1, true);
            }
        } else if (this.f201887m1.mo96282e()) {
            OfflineAlertView offlineAlertView3 = this.f201887m1;
            if (offlineAlertView3.f201797d == 5) {
                offlineAlertView3.mo96278a();
            }
        }
        Bitmap bitmap4 = this.f201881i;
        if (TextUtils.isEmpty(this.f201843Q0)) {
            Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "getBitmap mQRcode == null");
            bitmap = bitmap4;
            bitmap2 = null;
        } else {
            bitmap = bitmap4;
            bitmap2 = ((C76736w) C86312j.m106911c(cls)).p10(this, this.f201843Q0, 12, 3, 0.0d);
        }
        this.f201881i = bitmap2;
        this.f201909x.setImageBitmap(bitmap2);
        this.f201880h1.add(0, bitmap);
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh qrcode is " + (System.currentTimeMillis() - currentTimeMillis));
        Bitmap bitmap5 = this.f201883j;
        if (TextUtils.isEmpty(this.f201846R0)) {
            Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "getBarcodeBitmap mBarcode == null");
            bitmap3 = null;
        } else {
            bitmap3 = ((C76736w) C86312j.m106911c(cls)).p10(this, this.f201846R0, 5, 0, 0.0d);
        }
        this.f201883j = bitmap3;
        this.f201912y.setImageBitmap(bitmap3);
        int i = this.f201873e;
        if (i == 2 || i == 1 || i == 7) {
            this.f201912y.setAlpha(10);
        } else {
            this.f201912y.setAlpha(255);
        }
        this.f201882i1.add(0, bitmap5);
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh is " + (System.currentTimeMillis() - currentTimeMillis));
        if (this.f201880h1.size() >= 2) {
            for (int size = this.f201880h1.size() - 1; size > 1; size--) {
                C75228t.m90239c0(this.f201880h1.remove(size));
            }
        }
        if (this.f201882i1.size() >= 2) {
            for (int size2 = this.f201882i1.size() - 1; size2 > 1; size2--) {
                C75228t.m90239c0(this.f201882i1.remove(size2));
            }
        }
        C75218i iVar = this.f201884j1;
        if (iVar != null) {
            iVar.f221321e = this.f201846R0;
            iVar.f221318b = this.f201881i;
            iVar.f221319c = this.f201883j;
            C76901s0 s0Var = iVar.f221324h;
            if (s0Var != null && s0Var.isShowing()) {
                iVar.mo105150d();
            }
        }
        mo96311f8();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAY_OFFLINE_JUMPINFOPAGE_DATA_STRING_SYNC, "");
        if (Util.isNullOrNil(str)) {
            this.f201840P.setVisibility(8);
        } else {
            this.f201848S = new WalletOfflineCoinPurseUI$$g0((C699651) null);
            try {
                WalletOfflineCoinPurseUI$$g0.m82488a(this.f201848S, new JSONObject(str));
                if (Util.isNullOrNil(this.f201848S.f201953b)) {
                    Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "title is null, can not show info page");
                    this.f201840P.setVisibility(8);
                } else {
                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "show jump info layout");
                    if (!this.f201851T) {
                        this.f201851T = true;
                        C115669n.INSTANCE.mo160131h(14515, 5);
                    }
                    this.f201840P.setVisibility(0);
                    if (!Util.isNullOrNil(this.f201848S.f201952a)) {
                        this.f201842Q.setUrl(this.f201848S.f201952a);
                        this.f201842Q.setVisibility(0);
                    } else {
                        this.f201842Q.setVisibility(8);
                    }
                    this.f201845R.setText(this.f201848S.f201953b);
                    this.f201840P.setOnClickListener(new C70017o0(this));
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.WalletOfflineCoinPurseUI", "parse jumpinfo json fail : %s", e.getMessage());
                this.f201840P.setVisibility(8);
            }
        }
        C75136r0.m90122d(10, 0);
        C115669n nVar = C115669n.INSTANCE;
        MMApplicationContext.getContext();
        AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
        nVar.mo160131h(14163, 3, Integer.valueOf(appForegroundDelegate.f343454n ^ true ? 1 : 0), Integer.valueOf(NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext()) ? 1 : 0), Integer.valueOf(C69963m.wx0().vx0().mo96260b()));
        nVar.idkeyStat(135, 67, 1, true);
        if (NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext())) {
            nVar.idkeyStat(135, 32, 1, true);
        } else {
            nVar.idkeyStat(135, 33, 1, true);
        }
        if (appForegroundDelegate.f343454n) {
            nVar.idkeyStat(135, 34, 1, true);
        } else {
            nVar.idkeyStat(135, 35, 1, true);
        }
    }

    /* renamed from: M7 */
    public final void mo96292M7(Bankcard bankcard, boolean z) {
        if (bankcard != null) {
            String str = bankcard.field_bindSerial;
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "doSelectBackcard tempSerial:%s，mBindSerial：%s", str, this.f201899s);
            if (!TextUtils.isEmpty(str) && !str.equals(this.f201899s)) {
                mo96299U7(bankcard);
                mo96298T7();
                mo96308c8(0, z);
                mo96291L7(true);
            }
        }
    }

    /* renamed from: N7 */
    public final void mo96293N7(Bankcard bankcard, boolean z, Runnable runnable) {
        if (bankcard != null) {
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "doSelectPaymentCompat: %s", bankcard.field_bindSerial);
            if (!bankcard.field_bindSerial.equals(this.f201899s)) {
                if (C76559f.m92110f() != 2) {
                    this.f201816C1 = null;
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
                    mo96311f8();
                    mo96292M7(bankcard, z);
                    if (runnable != null) {
                        runnable.run();
                    }
                } else if (C76303b.f223503j) {
                    Log.m105928w("MicroMsg.WalletOfflineCoinPurseUI", "is doing setpayment, skip");
                    Toast toast = this.f201910x0;
                    if (toast != null) {
                        toast.cancel();
                    }
                    this.f201910x0 = C76912y0.m92763b(getContext(), getString(C0966R.string.m0i));
                } else {
                    showLoading(false);
                    new C76303b(bankcard.field_bindSerial, bankcard.field_bankcardType, bankcard.field_defaultCardState).mo9225i().mo123062e(new WalletOfflineCoinPurseUI$$a(this, bankcard, z, runnable)).mo11397F(this);
                }
            }
        }
    }

    /* renamed from: O7 */
    public final void mo96294O7() {
        Bankcard a = C76555c.f224079a.mo106804a(false);
        this.f201903u = a;
        if (a != null) {
            this.f201899s = a.field_bindSerial;
        }
        Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "initBindSerial(): %s", this.f201899s);
    }

    /* renamed from: P7 */
    public final void mo96295P7() {
        int size = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91319a(true).size();
        boolean z = false;
        Bankcard d = C76559f.m92108d(false);
        this.f201885k1.getClass();
        if (C69963m.wx0().Ax0().f223553b != null) {
            z = true;
        }
        if (z) {
            this.f201873e = 7;
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FREEZE");
        } else if (!NetStatusUtil.isNetworkConnected(getBaseContext())) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_DISCONNECT_NETWORK");
            this.f201873e = 6;
        } else if (C76559f.m92115k()) {
            if (size == 0) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount == 0");
                this.f201873e = 1;
            } else if (size == 0 || d != null) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
                this.f201873e = 5;
            } else {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount != 0 && bankcard == null");
                this.f201873e = 2;
            }
        } else if (size == 0) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount == 0");
            this.f201873e = 1;
        } else if (size == 0 || d != null) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
            this.f201873e = 5;
        } else {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount != 0 && bankcard == null");
            this.f201873e = 2;
        }
    }

    /* renamed from: Q7 */
    public final void mo96296Q7(boolean z, boolean z2) {
        boolean z3 = true;
        if (((ArrayList) C76559f.m92107c(true)).size() >= 1) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList size > 0");
            mo96294O7();
            mo96298T7();
            View view = this.f201813B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "refreshUI", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "refreshUI", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f201813B;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "refreshUI", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "refreshUI", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList== null or size is 0");
        }
        if (z) {
            mo96308c8(0, false);
        }
        mo96291L7(z2);
        if (C76559f.m92115k()) {
            C64651q80 q802 = ((C57154g1) component(C57154g1.class)).f163791d;
            if (!(q802 == null || q802.f184980d == 0)) {
                z3 = false;
            }
            if (z3) {
                this.f201819E.setVisibility(0);
                mo96304Z7();
            }
        }
        this.f201819E.setVisibility(4);
        mo96304Z7();
    }

    /* renamed from: S7 */
    public final void mo96297S7(boolean z) {
        Bankcard a;
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "resetDefaultBankcard");
        C76555c cVar = C76555c.f224079a;
        C76555c.C76556a aVar = C76555c.f224080b;
        if (aVar != null) {
            aVar.mo106800b();
            if (z && (a = cVar.mo106804a(true)) != null) {
                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "newCard : %s，oldCard：：%s", a.field_bindSerial, this.f201899s);
                if (C76559f.m92110f() != 2) {
                    mo96293N7(a, false, (Runnable) null);
                }
                Bankcard bankcard = this.f201903u;
                if (bankcard != null && bankcard.mo99391q2()) {
                    m82435R7(8);
                    this.f201876f1 = true;
                    return;
                }
                this.f201876f1 = false;
                return;
            }
            return;
        }
        C87412m.m108603p("sImpl");
        throw null;
    }

    /* renamed from: T7 */
    public void mo96298T7() {
        boolean z;
        String str;
        C67183e eVar;
        String str2;
        C67180c cVar;
        Bankcard bankcard = this.f201903u;
        View findViewById = findViewById(C0966R.C0970id.ljq);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "setChangeBankcardText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "setChangeBankcardText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f201815C.setTextSize(0, (float) getResources().getDimensionPixelSize(C0966R.dimen.f3927j7));
        if (this.f201815C == null || bankcard == null) {
            if (bankcard == null) {
                Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "setChangeBankcardText bankcard == null");
            }
            z = false;
        } else {
            String string = bankcard.mo99391q2() ? bankcard.f209395H2 : getString(C0966R.string.lac, new Object[]{bankcard.field_desc});
            C67205s0 Ex0 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0();
            List<C67180c> list = Ex0.f192959l;
            List<C67180c> list2 = (list == null || list.size() <= 0) ? null : Ex0.f192959l;
            if (list2 != null && !Util.isNullOrNil(bankcard.field_forbidWord)) {
                Iterator<C67180c> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    cVar = it.next();
                    if (cVar.f192867a.equals(bankcard.field_bindSerial)) {
                        break;
                    }
                }
            }
            cVar = null;
            if (cVar == null || Util.isNullOrNil(cVar.f192868b)) {
                z = false;
            } else {
                if (!bankcard.mo99391q2()) {
                    string = bankcard.field_desc + cVar.f192868b;
                }
                View findViewById2 = findViewById(C0966R.C0970id.ljq);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view = findViewById2;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "setChangeBankcardText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI", "setChangeBankcardText", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C115669n.INSTANCE.mo160131h(14515, 2);
                this.f201815C.setTextSize(0, (float) getResources().getDimensionPixelSize(C0966R.dimen.f3881hq));
                z = true;
            }
            this.f201815C.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), string, this.f201815C.getTextSize()));
        }
        if (bankcard != null) {
            if (TextUtils.isEmpty(this.f201899s)) {
                Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() mBindSerial is null");
            } else if (bankcard.mo99392r2()) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "show local hy logo");
                this.f201817D.setImageDrawable(C87515a.m108835e(getContext().getResources(), C0966R.raw.honey_pay_bank_logo, 0.0f));
            } else {
                String str3 = this.f201899s;
                ArrayList<Bankcard> a = C67188h0.m79466a(true);
                if (TextUtils.isEmpty(C76559f.f224087e)) {
                    str = C69963m.wx0().zx0(196615);
                    C76559f.f224087e = str;
                } else {
                    str = C76559f.f224087e;
                }
                LinkedList<C76559f.C76562c> p = C76559f.m92120p(str);
                String str4 = "";
                if (p != null && p.size() != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= a.size()) {
                            str2 = str4;
                            break;
                        }
                        Bankcard bankcard2 = a.get(i);
                        if (bankcard2 != null && str3.equals(bankcard2.field_bindSerial)) {
                            str2 = bankcard2.field_bankcardType;
                            break;
                        }
                        i++;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        int i2 = 0;
                        while (true) {
                            if (i2 < p.size()) {
                                C76559f.C76562c cVar2 = p.get(i2);
                                if (cVar2 != null && str2.equals(cVar2.f224098a)) {
                                    str4 = cVar2.f224099b;
                                    break;
                                }
                                i2++;
                            } else {
                                break;
                            }
                        }
                    } else {
                        Log.m105920e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() bank_type == null, can not find this bank_type");
                    }
                } else {
                    Log.m105920e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() cardList == null || cardLogoList == null || cardList.size() == 0 || cardLogoList.size() == 0");
                }
                if (bankcard.mo99393s2() && (eVar = bankcard.f209427v2) != null) {
                    str4 = eVar.f192875a;
                }
                if (TextUtils.isEmpty(str4)) {
                    Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() icon_url == null, can not find this icon_url");
                    this.f201817D.setImageBitmap((Bitmap) null);
                } else {
                    WeImageView weImageView = this.f201817D;
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0966R.dimen.atf);
                    if (weImageView != null && !TextUtils.isEmpty(str4)) {
                        Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C75886j(str4));
                        if (N6 != null) {
                            weImageView.setEnableColorFilter(false);
                            weImageView.setImageBitmap(BitmapUtil.extractThumbNail(N6, dimensionPixelOffset, dimensionPixelOffset, true, false));
                        }
                        this.f201875f.put(str4, weImageView);
                        this.f201877g.put(str4, Integer.valueOf(dimensionPixelOffset));
                    }
                }
            }
        }
        if (z) {
            this.f201817D.setEnableColorFilter(true);
            this.f201817D.setIconColor(Color.parseColor("#FA9D3B"));
            this.f201817D.setImageResource(C0966R.raw.icons_filled_error);
        }
    }

    /* renamed from: U7 */
    public final void mo96299U7(Bankcard bankcard) {
        if (bankcard != null) {
            String str = bankcard.field_bindSerial;
            this.f201899s = str;
            this.f201903u = bankcard;
            C76555c cVar = C76555c.f224079a;
            C87412m.m108594g(str, "bindSerial");
            C76555c.C76556a aVar = C76555c.f224080b;
            if (aVar != null) {
                aVar.mo106799a(str);
                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "set current bindSerial: %s, %s", this.f201899s, bankcard.field_bankcardType);
                return;
            }
            C87412m.m108603p("sImpl");
            throw null;
        }
    }

    /* renamed from: V7 */
    public final void mo96300V7(boolean z) {
        boolean z2;
        if (!C76559f.m92115k()) {
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "unOpen %s", Boolean.valueOf(C76559f.m92115k()));
            return;
        }
        if (C76559f.m92110f() == 2) {
            int m = C86709a0.m107524d().mo123467m();
            if (m == 6 || m == 4) {
                z2 = true;
            } else {
                Toast toast = this.f201910x0;
                if (toast != null) {
                    toast.cancel();
                }
                this.f201910x0 = C76912y0.m92763b(getContext(), getString(C0966R.string.m0i));
                z2 = false;
            }
            if (!z2) {
                Log.m105928w("MicroMsg.WalletOfflineCoinPurseUI", "network disabled");
                return;
            }
        }
        if (((ArrayList) C76559f.m92107c(false)).size() < 1) {
            Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
            this.f201815C.setVisibility(8);
            return;
        }
        ArrayList<Bankcard> a = C67188h0.m79466a(true);
        if (!z || this.f201870c1 != null) {
            this.f201870c1 = null;
            this.f201870c1 = new C76492a(this);
        } else {
            this.f201870c1 = new C76492a(this);
        }
        this.f201869b1 = -1;
        this.f201870c1.mo106728c();
        Bankcard bankcard = null;
        int i = 0;
        for (int i2 = 0; i2 < a.size(); i2++) {
            Bankcard bankcard2 = a.get(i2);
            if (!Util.isNullOrNil(bankcard2.field_bindSerial) && this.f201899s.equals(bankcard2.field_bindSerial)) {
                i = i2;
                bankcard = bankcard2;
            }
        }
        if (bankcard != null) {
            a.remove(bankcard);
            a.add(0, bankcard);
            i = 0;
        }
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_payment_select_remove_confirm_button_android, false);
        C76492a aVar = this.f201870c1;
        aVar.f223923c = new WalletOfflineCoinPurseUI$$q(this, a);
        if (wf) {
            aVar.f223924d = new WalletOfflineCoinPurseUI$$r(this, a);
        } else {
            aVar.f223921a.f296375F = new WalletOfflineCoinPurseUI$$s(this, a);
        }
        if (wf && wf) {
            C76874e0 e0Var = new C76874e0(this);
            e0Var.mo107160r(0, "", true);
            C76492a aVar2 = this.f201870c1;
            WalletOfflineCoinPurseUI$$t walletOfflineCoinPurseUI$$t = new WalletOfflineCoinPurseUI$$t(this);
            aVar2.f223927g = e0Var;
            aVar2.f223925e = walletOfflineCoinPurseUI$$t;
        }
        View inflate = View.inflate(this, C0966R.C0971layout.cfe, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.hlf);
        linearLayout.setFocusable(true);
        linearLayout.setContentDescription(MMApplicationContext.getContext().getString(C0966R.string.f361111he2) + MMApplicationContext.getContext().getString(C0966R.string.f361110he1));
        C75228t.m90240d((TextView) inflate.findViewById(C0966R.C0970id.hle));
        inflate.findViewById(C0966R.C0970id.hl_).setOnClickListener(new WalletOfflineCoinPurseUI$$u(this));
        inflate.findViewById(C0966R.C0970id.hl_).setContentDescription(getString(C0966R.string.kk5));
        C76492a aVar3 = this.f201870c1;
        aVar3.f223931k = true;
        aVar3.f223921a.mo140677w(getResources().getString(C0966R.string.kse));
        C76492a aVar4 = this.f201870c1;
        aVar4.f223933m = i;
        aVar4.f223932l = true;
        aVar4.f223921a.mo140673s(inflate);
        aVar4.f223930j = inflate;
        this.f201870c1.mo106729d();
        MMHandlerThread.postToMainThreadDelayed(new WalletOfflineCoinPurseUI$$v(this, linearLayout), 500);
        C115669n.INSTANCE.mo160131h(13955, 3);
    }

    /* renamed from: W7 */
    public final void mo96301W7() {
        C67207t tVar = this.f201916z1;
        if (tVar == null || !tVar.f192970a) {
            OfflineAlertView offlineAlertView = this.f201887m1;
            if (offlineAlertView.f201797d == 8) {
                offlineAlertView.mo96278a();
            }
        } else if (this.f201887m1.mo96281d(8)) {
            OfflineAlertView offlineAlertView2 = this.f201887m1;
            if (offlineAlertView2.f201797d == 8) {
                offlineAlertView2.mo96278a();
            }
            OfflineAlertView offlineAlertView3 = this.f201887m1;
            View view = this.f201907w;
            C67207t tVar2 = this.f201916z1;
            offlineAlertView3.f201797d = 8;
            offlineAlertView3.setVisibility(0);
            offlineAlertView3.f201800g = false;
            offlineAlertView3.f201799f.removeAllViews();
            View inflate = LayoutInflater.from(offlineAlertView3.getContext()).inflate(C0966R.C0971layout.cfi, offlineAlertView3.f201799f, false);
            offlineAlertView3.f201799f.addView(inflate);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gl9);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.k9q);
            Button button = (Button) inflate.findViewById(C0966R.C0970id.f358422f12);
            WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.f2q);
            weImageView.setImageResource(C0966R.raw.icons_outlined_info);
            weImageView.setIconColor(offlineAlertView3.getResources().getColor(C0966R.color.ajq));
            String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
            C67207t.C67208a b = (currentLanguage.equals("zh_CN") || currentLanguage.equals("zh_HK") || currentLanguage.equals("zh_TW")) ? offlineAlertView3.mo96279b(tVar2, currentLanguage) : offlineAlertView3.mo96279b(tVar2, "en");
            if (b != null) {
                textView.setText(b.f192976a);
                textView2.setText(b.f192977b);
                button.setText(b.f192978c);
            }
            button.setTextColor(offlineAlertView3.getResources().getColor(C0966R.color.f3257l0));
            button.setBackgroundResource(C0966R.C0969drawable.f4653j6);
            button.setOnClickListener(new C70006h(offlineAlertView3, tVar2));
            view.post(new C57162i(offlineAlertView3, view, inflate));
            C115669n.INSTANCE.mo160131h(20258, 1);
        }
    }

    /* renamed from: X7 */
    public final void mo96302X7() {
        if (!this.f201861W0 && this.f201887m1.mo96281d(4)) {
            C86709a0.m107528h();
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue() && !this.f201887m1.mo96282e()) {
                mo96303Y7();
            }
        }
    }

    /* renamed from: Y7 */
    public final void mo96303Y7() {
        if (this.f201887m1.mo96281d(4)) {
            OfflineAlertView offlineAlertView = this.f201887m1;
            View view = this.f201907w;
            offlineAlertView.setVisibility(0);
            offlineAlertView.f201799f.removeAllViews();
            View inflate = LayoutInflater.from(offlineAlertView.getContext()).inflate(C0966R.C0971layout.cfh, (ViewGroup) null);
            offlineAlertView.f201799f.addView(inflate);
            C115669n.INSTANCE.mo160131h(13750, 1);
            offlineAlertView.f201797d = 4;
            TextView textView = (TextView) offlineAlertView.f201798e.findViewById(C0966R.C0970id.f358422f12);
            if (textView != null) {
                textView.setOnClickListener(new C70013l(offlineAlertView));
            } else {
                Log.m105920e("MicroMsg.OfflineAlertView", "iKnowBtn is null!");
            }
            TextView textView2 = (TextView) offlineAlertView.f201798e.findViewById(C0966R.C0970id.kew);
            if (textView2 != null) {
                textView2.setText(C0966R.string.kzp);
                C75228t.m90253j0(textView2, MMApplicationContext.getContext().getString(C0966R.string.kzp), 0, textView2.length(), new C7092q((C7092q.C7093a) new C70014m(offlineAlertView), true), offlineAlertView.f201798e.getContext());
                C75228t.m90252j(textView2, C76577a.m92157h(offlineAlertView.getContext(), C0966R.dimen.f3723cd));
            } else {
                Log.m105920e("MicroMsg.OfflineAlertView", "moreTV is null!");
            }
            view.post(new C57164n(offlineAlertView, view, inflate));
        }
    }

    /* renamed from: Z7 */
    public final void mo96304Z7() {
        if (!this.f201841P1 && !NetStatusUtil.isNetworkConnected(getBaseContext()) && C69963m.wx0().vx0().mo96260b() == 0) {
            this.f201841P1 = true;
            Log.m105920e("MicroMsg.OfflineErrorHelper", "offline code size is 0, show check network error dialog");
            C76879j.m92713G(this, getString(C0966R.string.lai), (String) null, false, new C70026s(this));
            Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "network disconnect and code count == 0");
        }
    }

    /* renamed from: a8 */
    public final void mo96305a8() {
        boolean z;
        Class cls = C79173v.class;
        if (this.f201887m1.mo96281d(1)) {
            OfflineAlertView offlineAlertView = this.f201887m1;
            if (offlineAlertView.f201797d == 1) {
                offlineAlertView.mo96278a();
            }
            boolean y = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91343y();
            boolean x = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91342x();
            C67203r0 r0Var = ((C79173v) C86312j.m106911c(cls)).Ex0().f192953f;
            if (r0Var != null) {
                if ((r0Var.field_is_reg == 1) && r0Var.field_isDomesticUser) {
                    if (r0Var.field_authen_account_type == 0) {
                        z = true;
                        if (!y || x || z) {
                            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "unreg: %B, simplereg: %B, isRegButUnRealname: %B", Boolean.valueOf(y), Boolean.valueOf(x), Boolean.valueOf(z));
                            this.f201887m1.mo96283f(this.f201907w, new WalletOfflineCoinPurseUI$$m(this), 1);
                        }
                        return;
                    }
                }
            }
            z = false;
            if (!y) {
            }
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "unreg: %B, simplereg: %B, isRegButUnRealname: %B", Boolean.valueOf(y), Boolean.valueOf(x), Boolean.valueOf(z));
            this.f201887m1.mo96283f(this.f201907w, new WalletOfflineCoinPurseUI$$m(this), 1);
        }
    }

    public void addDialog(Dialog dialog) {
        if ((dialog instanceof C77398g) && this.f201863X0) {
            this.f201865Y0 = true;
            dialog.setOnDismissListener(new WalletOfflineCoinPurseUI$$j(this, ((C77398g) dialog).f225688L));
        } else if ((dialog instanceof C77390c0) && this.f201863X0) {
            this.f201865Y0 = true;
            dialog.setOnDismissListener(new WalletOfflineCoinPurseUI$$k(this));
        }
        super.addDialog(dialog);
    }

    /* renamed from: b8 */
    public final void mo96307b8() {
        if (this.f201887m1.mo96281d(3)) {
            OfflineAlertView offlineAlertView = this.f201887m1;
            if (offlineAlertView.f201797d == 3) {
                offlineAlertView.mo96278a();
            }
            String zx02 = C69963m.wx0().zx0(196617);
            boolean j = C75105d.m90074e().mo104806j(zx02);
            boolean k = C76559f.m92115k();
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "show unopened alert, %B, %B", Boolean.valueOf(j), Boolean.valueOf(k));
            if (!j || !k) {
                if (!j) {
                    C86709a0.m107528h();
                    String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_IEMI_STRING_SYNC, "");
                    if (str == null || !str.equals(C87203t.m108270f(true))) {
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is diff between create and getToken");
                    } else {
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is same between create and getToken");
                    }
                    Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineEntranceUI CertUtil.getInstance().isCertExist(cn) is false ,cn == " + zx02 + " ,recreate offline");
                    C76559f.m92105a();
                }
                this.f201819E.setVisibility(4);
                this.f201887m1.mo96283f(this.f201907w, new WalletOfflineCoinPurseUI$$n(this), 3);
            }
        }
    }

    /* renamed from: c8 */
    public final void mo96308c8(int i, boolean z) {
        if (!C76559f.m92115k()) {
            Log.m105928w("MicroMsg.WalletOfflineCoinPurseUI", "offline is not create!");
            return;
        }
        C64651q80 q802 = ((C57154g1) component(C57154g1.class)).f163791d;
        if (!(q802 == null || q802.f184980d == 0)) {
            Log.m105928w("MicroMsg.WalletOfflineCoinPurseUI", "token is disabled");
        } else if (C76303b.f223503j) {
            Log.m105928w("MicroMsg.WalletOfflineCoinPurseUI", "is doing setofflinepayment, skip update code");
        } else if (this.f201903u == null || C76559f.m92110f() != 2 || z || C67188h0.m79467b(this.f201903u)) {
            mo96310e8(i);
        } else {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "update undefault card, need do setpayment");
            Bankcard bankcard = this.f201903u;
            new C76303b(bankcard.field_bindSerial, bankcard.field_bankcardType, bankcard.field_defaultCardState).mo9225i().mo123062e(new WalletOfflineCoinPurseUI$$b(this, i)).mo11397F(this);
        }
    }

    public boolean checkProcLife() {
        return false;
    }

    /* renamed from: d8 */
    public void mo96309d8() {
        if (!this.f201850S1.stopped()) {
            this.f201850S1.stopTimer();
        }
        mo96308c8(0, false);
        mo96291L7(true);
        this.f201852T0 = false;
        this.f201850S1.startTimer((long) this.f201847R1);
    }

    /* renamed from: e8 */
    public final void mo96310e8(int i) {
        C69952f vx02 = C69963m.wx0().vx0();
        int i2 = this.f201879h;
        String str = this.f201811A;
        vx02.getClass();
        Log.m105925i("MicroMsg.OfflineCodesMgr", "generatetKey scene %s isSnapshot %s stack: %s", Integer.valueOf(i2), Integer.valueOf(i), Util.getStack().toString());
        String a = vx02.mo96259a(i2, i, str);
        this.f201846R0 = a;
        this.f201843Q0 = a;
        Log.m105927v("MicroMsg.WalletOfflineCoinPurseUI", "updateCode isSnapshot:%s mBarcode:%s mQRcode:%s stack: %s", Integer.valueOf(i), this.f201846R0, this.f201843Q0, Util.getStack().toString());
        C77963l1 c = C113146l.m154805c();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f201843Q0);
        C86709a0.m107528h();
        sb.append(C77710q.m93738a(C86709a0.m107523b().mo121110g()));
        String mD5String = MD5Util.getMD5String(sb.toString());
        if (c != null) {
            C115669n.INSTANCE.mo160131h(13444, c.f227796i, c.f227797j, Long.valueOf(c.f227795h), mD5String, c.f227798n, c.f227799o, c.f227800p);
        }
        if (Util.isNullOrNil(a)) {
            C115669n nVar = C115669n.INSTANCE;
            MMApplicationContext.getContext();
            nVar.mo160131h(14163, 1, Integer.valueOf(AppForegroundDelegate.INSTANCE.f343454n ^ true ? 1 : 0), Integer.valueOf(NetStatusUtil.isNetworkConnected(getBaseContext()) ? 1 : 0));
            nVar.idkeyStat(135, 26, 1, true);
            if (NetStatusUtil.isNetworkConnected(getBaseContext())) {
                nVar.idkeyStat(135, 28, 1, true);
            } else {
                nVar.idkeyStat(135, 27, 1, true);
            }
        }
    }

    /* renamed from: f8 */
    public final void mo96311f8() {
        boolean z;
        String str;
        if (!(C76559f.m92110f() == 2) || Util.isNullOrNil(this.f201816C1)) {
            this.f201866Z.setVisibility(8);
            z = false;
        } else {
            this.f201866Z.setVisibility(0);
            this.f201893p0.setText(this.f201816C1);
            z = true;
        }
        if (!z) {
            Class cls = C79173v.class;
            C77951j53 j532 = ((C79173v) C86312j.m106911c(cls)).Ex0().f192961n;
            if (j532 == null) {
                this.f201821F.setVisibility(8);
                return;
            }
            if (j532.f227645d == 1) {
                C64485k53 k532 = j532.f227646e;
                if (k532 == null) {
                    Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "offlineGuideBar.guide_data == null");
                    this.f201821F.setVisibility(8);
                    return;
                }
                String str2 = k532.f183895d;
                if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91325g(str2, false, false) == null) {
                    Log.m105921e("MicroMsg.WalletOfflineCoinPurseUI", "updateOfflineGuideBar bindSerial(%s) is null bankcard!", Util.nullAs(str2, ""));
                    this.f201821F.setVisibility(8);
                    return;
                }
                Bankcard bankcard = this.f201903u;
                if (!(bankcard == null || (str = bankcard.field_bindSerial) == null || !Util.isEqual(j532.f227646e.f183895d, str))) {
                    Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "updateOfflineGuideBar defaultBankcard(%s) == bindSerial(%s)", bankcard.field_bindSerial, j532.f227646e.f183895d);
                    this.f201821F.setVisibility(8);
                    return;
                }
            }
            if (this.f201821F.isShown() && this.f201821F.getTag() != null && (this.f201821F.getTag() instanceof C77951j53) && Util.isEqual((Object) (C77951j53) this.f201821F.getTag(), (Object) j532)) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "");
            } else if (j532.f227647f == 0) {
                this.f201821F.setVisibility(8);
            } else if (!this.f201867Z0) {
                Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "isShowGuideBar == false");
            } else {
                int visibility = this.f201821F.getVisibility();
                this.f201821F.setTag(j532);
                this.f201821F.setVisibility(0);
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 20.0f);
                this.f201823G.mo100288c(j532.f227653o, fromDPToPix, fromDPToPix, -1);
                this.f201825H.setText(j532.f227648g);
                this.f201827I.setText(j532.f227650i);
                C85875k4.m106189j0(this.f201827I.getPaint(), 0.8f);
                int i = j532.f227645d;
                if (i == 1) {
                    if (!Util.isNullOrNil(j532.f227654p) && this.f201821F.getBackground() != null) {
                        this.f201821F.getBackground().setColorFilter(Color.parseColor(j532.f227654p), PorterDuff.Mode.SRC);
                    }
                    this.f201825H.setTextColor(Color.parseColor(j532.f227649h));
                    this.f201827I.setTextColor(Color.parseColor(j532.f227651j));
                    this.f201827I.setTag(j532.f227646e.f183895d);
                    this.f201827I.setOnClickListener(new C70029t0(this));
                    m82435R7(1);
                    this.f201878g1 = true;
                } else if (i == 2) {
                    if (!Util.isNullOrNil(j532.f227654p) && this.f201821F.getBackground() != null) {
                        this.f201821F.getBackground().setColorFilter(mo96288I7(Long.parseLong(j532.f227654p.substring(2), 16)), PorterDuff.Mode.SRC);
                    }
                    this.f201825H.setTextColor(mo96288I7(Long.parseLong(j532.f227649h.substring(2), 16)));
                    this.f201827I.setTextColor(mo96288I7(Long.parseLong(j532.f227651j.substring(2), 16)));
                    if (!Util.isNullOrNil(j532.f227652n)) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f201827I.getLayoutParams();
                        layoutParams.rightMargin = C76577a.m92151b(getContext(), 8);
                        this.f201827I.setLayoutParams(layoutParams);
                        this.f201827I.setPadding(C76577a.m92151b(getContext(), 12), C76577a.m92151b(getContext(), 4), C76577a.m92151b(getContext(), 12), C76577a.m92151b(getContext(), 4));
                        int I7 = mo96288I7(Long.parseLong(j532.f227652n.substring(2), 16));
                        this.f201827I.setBackgroundDrawable(getContext().getResources().getDrawable(C0966R.C0969drawable.b29));
                        ((GradientDrawable) this.f201827I.getBackground()).setColor(I7);
                        this.f201827I.setOnTouchListener(new C4928u0(this, I7));
                    }
                    this.f201827I.setOnClickListener(new C70032v0(this, j532));
                    m82435R7(4);
                    this.f201878g1 = false;
                }
                if (visibility == 8 && this.f201887m1.mo96282e()) {
                    mo96302X7();
                    if (!this.f201861W0 && this.f201887m1.mo96281d(4)) {
                        C86709a0.m107528h();
                        if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                            mo96303Y7();
                        }
                    }
                }
            }
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cfg;
    }

    public Resources getResources() {
        return super.getResources();
    }

    public void initView() {
        C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_NEW;
        Class cls = C30914c.class;
        Class cls2 = C76963d.class;
        ScrollView scrollView = (ScrollView) findViewById(C0966R.C0970id.hlb);
        this.f201905v = scrollView;
        scrollView.setBackgroundColor(getResources().getColor(C0966R.color.f2969az));
        OfflineAlertView offlineAlertView = (OfflineAlertView) findViewById(C0966R.C0970id.hl7);
        this.f201887m1 = offlineAlertView;
        offlineAlertView.mo96278a();
        this.f201887m1.setDialogState(new WalletOfflineCoinPurseUI$$g(this));
        C75105d.m90074e().mo104805i(getApplicationContext());
        int i = this.f201879h;
        if (i == 3 || i == 10 || i == 11 || i == 12) {
            setMMTitle((int) C0966R.string.laq);
        } else {
            setMMTitle((int) C0966R.string.lar);
        }
        C70034w wVar = new C70034w(this, this);
        this.f201885k1 = wVar;
        wVar.f202063d = (Vibrator) wVar.f202060a.getSystemService("vibrator");
        C75218i iVar = new C75218i(this, true);
        this.f201884j1 = iVar;
        iVar.mo105147a();
        this.f201907w = findViewById(C0966R.C0970id.ljd);
        this.f201909x = (ImageView) findViewById(C0966R.C0970id.ljc);
        this.f201912y = (ImageView) findViewById(C0966R.C0970id.lfh);
        this.f201915z = (TextView) findViewById(C0966R.C0970id.lfj);
        this.f201813B = findViewById(C0966R.C0970id.ljp);
        this.f201815C = (TextView) findViewById(C0966R.C0970id.ljr);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.ljo);
        this.f201817D = weImageView;
        weImageView.setEnableColorFilter(false);
        this.f201819E = (RelativeLayout) findViewById(C0966R.C0970id.lhl);
        this.f201821F = (LinearLayout) findViewById(C0966R.C0970id.lju);
        this.f201823G = (CdnImageView) findViewById(C0966R.C0970id.ljv);
        this.f201825H = (TextView) findViewById(C0966R.C0970id.ljt);
        this.f201827I = (TextView) findViewById(C0966R.C0970id.ljs);
        this.f201813B.post(new C70018p0(this));
        this.f201819E.setOnClickListener(new C70020q0(this));
        this.f201909x.setOnClickListener(this.f201839O1);
        this.f201912y.setOnClickListener(this.f201839O1);
        this.f201915z.setOnClickListener(this.f201839O1);
        this.f201813B.setClickable(true);
        this.f201813B.setOnClickListener(new C70027s0(this));
        this.f201871d = System.currentTimeMillis();
        Class cls3 = C109759g.class;
        WalletOfflineCoinPurseUI$$e0 walletOfflineCoinPurseUI$$e0 = new WalletOfflineCoinPurseUI$$e0(this);
        this.f201829J = walletOfflineCoinPurseUI$$e0;
        ((C76963d) C86312j.m106911c(cls2)).mo107038o0(walletOfflineCoinPurseUI$$e0);
        C20362d sM = ((C30914c) C86312j.m106911c(cls)).mo17862sM();
        C72994y1.C72995a aVar = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC;
        C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC;
        if (((C21388a) sM).mo33496d(aVar, aVar2)) {
            C86709a0.m107528h();
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, "");
            if (!Util.isNullOrNil(str)) {
                walletOfflineCoinPurseUI$$e0.f201935e.setText(str);
                walletOfflineCoinPurseUI$$e0.f201935e.setVisibility(0);
                walletOfflineCoinPurseUI$$e0.f201936f.setVisibility(0);
                walletOfflineCoinPurseUI$$e0.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, true);
            } else {
                walletOfflineCoinPurseUI$$e0.f201934d.setVisibility(0);
                walletOfflineCoinPurseUI$$e0.mo64136k(nVar, true);
            }
        }
        ((C115627l) ((C109759g) C86312j.m106911c(cls3)).V40()).mo175770k(this.f201829J);
        WalletOfflineCoinPurseUI$$h0 walletOfflineCoinPurseUI$$h0 = new WalletOfflineCoinPurseUI$$h0(this);
        this.f201831K = walletOfflineCoinPurseUI$$h0;
        ((C76963d) C86312j.m106911c(cls2)).mo107038o0(walletOfflineCoinPurseUI$$h0);
        if (((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33496d(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC, aVar2)) {
            walletOfflineCoinPurseUI$$h0.f201934d.setVisibility(0);
            walletOfflineCoinPurseUI$$h0.mo64136k(nVar, true);
        }
        ((C115627l) ((C109759g) C86312j.m106911c(cls3)).V40()).mo175770k(this.f201831K);
        WalletOfflineCoinPurseUI$$b0 walletOfflineCoinPurseUI$$b0 = new WalletOfflineCoinPurseUI$$b0(this);
        this.f201833L = walletOfflineCoinPurseUI$$b0;
        ((C76963d) C86312j.m106911c(cls2)).mo107038o0(walletOfflineCoinPurseUI$$b0);
        if (((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33496d(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC, aVar2)) {
            walletOfflineCoinPurseUI$$b0.f201934d.setVisibility(0);
            walletOfflineCoinPurseUI$$b0.mo64136k(nVar, true);
        }
        ((C115627l) ((C109759g) C86312j.m106911c(cls3)).V40()).mo175770k(this.f201833L);
        WalletOfflineCoinPurseUI$$f0 walletOfflineCoinPurseUI$$f0 = new WalletOfflineCoinPurseUI$$f0(this);
        this.f201835M = walletOfflineCoinPurseUI$$f0;
        ((C76963d) C86312j.m106911c(cls2)).mo107038o0(walletOfflineCoinPurseUI$$f0);
        if (((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33496d(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC, aVar2)) {
            walletOfflineCoinPurseUI$$f0.f201934d.setVisibility(0);
            walletOfflineCoinPurseUI$$f0.mo64136k(nVar, true);
        }
        ((C115627l) ((C109759g) C86312j.m106911c(cls3)).V40()).mo175770k(this.f201835M);
        this.f201837N = new WalletOfflineCoinPurseUI$$d0(this);
        ((C115627l) ((C109759g) C86312j.m106911c(cls3)).V40()).mo175770k(this.f201837N);
        int i2 = this.f201879h;
        if (i2 == 3 || i2 == 10 || i2 == 11 || i2 == 12) {
            this.f201854U.setVisibility(8);
            this.f201857V.setVisibility(8);
            this.f201860W.setVisibility(8);
            this.f201862X.setVisibility(8);
        } else {
            this.f201862X.setVisibility(0);
            this.f201864Y.setVisibility(0);
            boolean pU = ((C76963d) C86312j.m106911c(cls2)).mo107039pU(this.f201829J);
            boolean pU2 = ((C76963d) C86312j.m106911c(cls2)).mo107039pU(this.f201833L);
            boolean pU3 = ((C76963d) C86312j.m106911c(cls2)).mo107039pU(this.f201835M);
            boolean pU4 = ((C76963d) C86312j.m106911c(cls2)).mo107039pU(this.f201831K);
            boolean pU5 = ((C76963d) C86312j.m106911c(cls2)).mo107039pU(this.f201837N);
            if (((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAY_OR_RECV_HAS_SHOW_RED_DOT_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "no need scroll");
            } else {
                getWindow().getDecorView().post(new C70015n0(this, pU, pU4, pU2, pU3, pU5));
            }
            TextView textView = (TextView) findViewById(C0966R.C0970id.a5v);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.a5u);
            if (this.f201898r1) {
                textView.setText(C0966R.string.agw);
                imageView.setImageResource(C0966R.raw.icons_outlined_transfer);
                imageView.getDrawable().setColorFilter(getResources().getColor(C0966R.color.BW_100_Alpha_0_9), PorterDuff.Mode.SRC_ATOP);
            } else {
                textView.setText(C0966R.string.aie);
                imageView.setImageResource(C0966R.raw.bank_remit_transfer);
                imageView.clearColorFilter();
            }
        }
        this.f201840P = (LinearLayout) findViewById(C0966R.C0970id.lhj);
        this.f201842Q = (CdnImageView) findViewById(C0966R.C0970id.lhi);
        this.f201845R = (TextView) findViewById(C0966R.C0970id.lhk);
        this.f201866Z = (LinearLayout) findViewById(C0966R.C0970id.f359553m90);
        this.f201893p0 = (TextView) findViewById(C0966R.C0970id.f359554m91);
        if (C76559f.m92115k()) {
            this.f201885k1.getClass();
            if (C69963m.wx0().Ax0().f223553b != null) {
                this.f201885k1.mo96362d(C69963m.wx0().Ax0().f223553b);
            }
        }
        mo96295P7();
        mo96296Q7(true, true);
        this.f201850S1.startTimer((long) this.f201847R1);
        int i3 = C76559f.f224089g;
        if (i3 == 3 && C76559f.f224092j) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, is marked!");
            int i4 = C76559f.f224090h;
            long j = C76559f.f224091i;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = (((long) (i4 * 1000)) + j) - currentTimeMillis;
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "expire_time:" + i4 + " beginTime:" + j + " now:" + currentTimeMillis + " interval:" + j2);
            if (C76559f.f224090h <= 0 || C76559f.f224091i <= 0 || j2 <= 0) {
                Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "not to start card expire timer!");
            } else {
                if (!this.f201856U1.stopped()) {
                    this.f201856U1.stopTimer();
                }
                this.f201856U1.startTimer(j2);
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "start card expire timer!");
            }
        } else if (i3 == 3) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, not need to mark!");
        } else {
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from %d, not need to start timer!", Integer.valueOf(i3));
        }
        mo96304Z7();
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY;
        walletGetBulletinEvent.callback = new WalletOfflineCoinPurseUI$$h(this, walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        if (!TextUtils.isEmpty(str) && bitmap != null && !bitmap.isRecycled()) {
            ImageView imageView = (ImageView) this.f201875f.get(str);
            Integer num = this.f201877g.get(str);
            if (imageView != null && num != null) {
                new MMHandler(getMainLooper()).post(new WalletOfflineCoinPurseUI$$l(this, num, imageView, bitmap));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C79173v.class;
        super.onCreate(bundle);
        C76555c.f224079a.mo106806c();
        this.f201898r1 = ((C79173v) C86312j.m106911c(cls)).Ix0();
        boolean z = true;
        C69963m.f201787j = true;
        C75228t.m90243e0(41, 1);
        Intent intent = getIntent();
        this.f201861W0 = intent.getBooleanExtra("is_offline_create", false);
        if (intent.hasExtra("key_entry_scene")) {
            this.f201879h = intent.getIntExtra("key_entry_scene", this.f201879h);
        }
        this.f201858V0 = intent.getIntExtra("key_from_scene", 0);
        this.f201811A = Util.nullAs(intent.getStringExtra("key_business_attach"), "");
        this.f201891o1 = 1;
        int i = this.f201879h;
        if (i == 2) {
            this.f201891o1 = 1;
        } else if (i == 1) {
            this.f201891o1 = 2;
        } else if (i == 8) {
            this.f201891o1 = 4;
        } else if (i == 4) {
            this.f201891o1 = 6;
        } else {
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %d", 1);
        }
        if (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE && !WeChatEnvironment.hasDebugger()) {
            getWindow().addFlags(8192);
        }
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91354h(this, (C67213b.C67214b) null);
        setContentViewVisibility(0);
        setActionbarColor(getResources().getColor(C0966R.color.f2969az));
        setActionbarElementColor(getResources().getColor(C0966R.color.f2975b6));
        setNavigationbarColor(getResources().getColor(C0966R.color.f2969az));
        hideActionbarLine();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        setBackBtn(new WalletOfflineCoinPurseUI$$z(this));
        try {
            ScreenShotUtil.setScreenShotCallback(this, this);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletOfflineCoinPurseUI", e, "", new Object[0]);
            getWindow().setFlags(8192, 8192);
            z = false;
        }
        if (!z) {
            ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C75576f4(new C75240v(), (String) null));
        int i2 = C76312r.f223547h;
        if (!C76559f.m92115k()) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "doNetSceneUserBindQuery on create when not open offlinepay");
            C76312r rVar = new C76312r(this.f201879h, (String) null, 8, this.f201900s1, this.f201902t1, this.f201872d1);
            this.f201872d1 = 0;
            doSceneProgress(rVar, false);
        }
        if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91337s()) {
            Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is invalid");
        } else if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91343y()) {
            Log.m105920e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is isUnreg");
            C76559f.m92105a();
            C69963m.wx0().Cx0(196648, "0");
        } else if (((C79173v) C86312j.m106911c(cls)).Ex0().mo91341w()) {
            C76559f.m92115k();
        }
        initView();
        String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_DISABLE_BLOCK_LAYER_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            try {
                this.f201916z1 = C67207t.m79538a(new JSONObject(str));
            } catch (JSONException e2) {
                Log.printErrStackTrace("MicroMsg.WalletOfflineCoinPurseUI", e2, "", new Object[0]);
            }
        }
        this.f201816C1 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
        mo96311f8();
        ((C102720b) C86312j.m106911c(C102720b.class)).Lu0(this);
        C69963m.wx0().Ax0().mo106555j(this);
        addSceneEndListener(606);
        addSceneEndListener(SdkInfo.ErrCode.kErrCodeFormatUnSupport);
        addSceneEndListener(1501);
        addSceneEndListener(580);
        C69952f vx02 = C69963m.wx0().vx0();
        if (vx02.f201762a != null) {
            vx02.f201762a = new ArrayList();
        }
        ((ArrayList) vx02.f201762a).add(new WeakReference(this));
        this.f201838N1.alive();
        C69963m.wx0().Cx0(196643, "1");
        this.f201834L1.alive();
        this.f201830J1.alive();
        this.f201820E1.alive();
        this.f201822F1.alive();
        ArrayList<C76555c.C76557b> arrayList = C76555c.f224081c;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.f201824G1.alive();
        this.f201826H1.alive();
        this.f201828I1.alive();
        this.f201855U0 = new C30326g();
        OfflineCreateEvent offlineCreateEvent = new OfflineCreateEvent();
        offlineCreateEvent.f193775d.f193776a = hashCode();
        offlineCreateEvent.publish();
        this.f201832K1.alive();
    }

    public void onDestroy() {
        Object obj;
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "onDestory()");
        Bankcard bankcard = this.f201903u;
        if (bankcard != null) {
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "mBindSerial:%s serial:%s", this.f201899s, bankcard.field_bindSerial);
            if (C67188h0.m79467b(this.f201903u)) {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "onDestory：do set as default card");
            } else {
                Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "onDestory：do not set as default card");
                mo96297S7(false);
            }
        }
        this.f201887m1.mo96278a();
        C69963m.f201787j = false;
        C75228t.m90239c0(this.f201881i);
        C75228t.m90239c0(this.f201883j);
        C75228t.m90241d0(this.f201880h1);
        C75228t.m90241d0(this.f201882i1);
        this.f201880h1.clear();
        this.f201882i1.clear();
        this.f201892p.clear();
        this.f201895q.clear();
        this.f201897r.clear();
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this);
        C69963m.wx0().Ax0().mo106556k(this);
        removeSceneEndListener(606);
        removeSceneEndListener(SdkInfo.ErrCode.kErrCodeFormatUnSupport);
        removeSceneEndListener(1501);
        removeSceneEndListener(580);
        C69952f vx02 = C69963m.wx0().vx0();
        if (vx02.f201762a != null) {
            for (int i = 0; i < ((ArrayList) vx02.f201762a).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) vx02.f201762a).get(i);
                if (!(weakReference == null || (obj = weakReference.get()) == null || !obj.equals(this))) {
                    weakReference.clear();
                    ((ArrayList) vx02.f201762a).remove(weakReference);
                }
            }
        }
        this.f201838N1.dead();
        this.f201834L1.dead();
        this.f201820E1.dead();
        this.f201822F1.dead();
        if (!this.f201850S1.stopped()) {
            this.f201850S1.stopTimer();
        }
        if (!this.f201856U1.stopped()) {
            this.f201856U1.stopTimer();
        }
        if (!this.f201853T1.stopped()) {
            this.f201853T1.stopTimer();
        }
        C75218i iVar = this.f201884j1;
        if (iVar != null) {
            iVar.mo105148b();
        }
        C70034w wVar = this.f201885k1;
        if (wVar != null) {
            wVar.f202063d.cancel();
            wVar.f202060a = null;
        }
        this.f201830J1.dead();
        this.f201826H1.dead();
        this.f201828I1.dead();
        C30326g gVar = this.f201855U0;
        gVar.mo57282g();
        C30326g.m39030e();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(385, gVar.f81863a);
        gVar.f81864b = null;
        this.f201832K1.dead();
        this.f201824G1.dead();
        C78843b.f231662a = 0;
        C76555c cVar = C76555c.f224079a;
        C76555c.f224081c.remove(this);
        cVar.mo106806c();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC, "");
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        OfflineAlertView offlineAlertView;
        if (i == 4 && (offlineAlertView = this.f201887m1) != null && offlineAlertView.getVisibility() == 0) {
            OfflineAlertView offlineAlertView2 = this.f201887m1;
            if (offlineAlertView2.f201800g) {
                offlineAlertView2.mo96278a();
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on new intent");
        this.f201888n = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (kd2.C76559f.m92117m() != false) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onNotify(id2.C76313t.C76317e r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 0
            java.lang.String r3 = "MicroMsg.WalletOfflineCoinPurseUI"
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = "onNotify msg == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            return r2
        L_0x0010:
            android.app.Dialog r4 = r0.f201913y0
            if (r4 == 0) goto L_0x001f
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L_0x001f
            android.app.Dialog r4 = r0.f201913y0
            r4.dismiss()
        L_0x001f:
            com.tencent.mm.wallet_core.ui.i r4 = r0.f201884j1
            nj3.s0 r5 = r4.f221324h
            if (r5 == 0) goto L_0x0030
            boolean r5 = r5.isShowing()
            if (r5 == 0) goto L_0x0030
            nj3.s0 r4 = r4.f221324h
            r4.dismiss()
        L_0x0030:
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            int r6 = r1.f223559a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            java.lang.String r6 = r0.f201899s
            r7 = 1
            r5[r7] = r6
            java.lang.String r6 = "onNotify msgtype：%s，mBindSerial：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
            int r3 = r1.f223559a
            r5 = 8
            r6 = 24
            r8 = 6
            r9 = 5
            r10 = 4
            r11 = 23
            r12 = 20
            if (r10 != r3) goto L_0x0059
            r0.f201852T0 = r2
            goto L_0x0120
        L_0x0059:
            if (r9 != r3) goto L_0x0070
            r0.f201852T0 = r7
            r0.f201863X0 = r7
            r0.f201865Y0 = r2
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            boolean r3 = r3.stopped()
            if (r3 != 0) goto L_0x0120
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            r3.stopTimer()
            goto L_0x0120
        L_0x0070:
            if (r8 != r3) goto L_0x0096
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            boolean r3 = r3.stopped()
            if (r3 != 0) goto L_0x007f
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            r3.stopTimer()
        L_0x007f:
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201850S1
            boolean r3 = r3.stopped()
            if (r3 != 0) goto L_0x008c
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201850S1
            r3.stopTimer()
        L_0x008c:
            r0.f201852T0 = r2
            boolean r3 = kd2.C76559f.m92117m()
            if (r3 == 0) goto L_0x0122
            goto L_0x0120
        L_0x0096:
            if (r5 != r3) goto L_0x00a7
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            boolean r3 = r3.stopped()
            if (r3 != 0) goto L_0x0122
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            r3.stopTimer()
            goto L_0x0122
        L_0x00a7:
            if (r11 != r3) goto L_0x00bb
            r0.f201914y1 = r2
            r0.f201911x1 = r7
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            boolean r3 = r3.stopped()
            if (r3 != 0) goto L_0x0120
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            r3.stopTimer()
            goto L_0x0120
        L_0x00bb:
            if (r12 != r3) goto L_0x00cd
            r0.f201852T0 = r2
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            boolean r3 = r3.stopped()
            if (r3 != 0) goto L_0x0120
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            r3.stopTimer()
            goto L_0x0120
        L_0x00cd:
            if (r6 != r3) goto L_0x0122
            com.tencent.mm.plugin.wallet_core.model.Bankcard r3 = r0.f201903u
            if (r3 == 0) goto L_0x00db
            boolean r3 = r3.mo99391q2()
            if (r3 == 0) goto L_0x00db
            r3 = 1
            goto L_0x00dc
        L_0x00db:
            r3 = 0
        L_0x00dc:
            if (r3 == 0) goto L_0x00f7
            boolean r3 = r0.f201876f1
            if (r3 == 0) goto L_0x00e8
            r3 = 10
            m82435R7(r3)
            goto L_0x00f7
        L_0x00e8:
            boolean r3 = r0.f201878g1
            if (r3 == 0) goto L_0x00f2
            r3 = 11
            m82435R7(r3)
            goto L_0x00f7
        L_0x00f2:
            r3 = 12
            m82435R7(r3)
        L_0x00f7:
            r0.f201852T0 = r7
            android.app.Dialog r3 = r0.f201913y0
            if (r3 != 0) goto L_0x010d
            androidx.appcompat.app.AppCompatActivity r3 = r23.getContext()
            com.tencent.mm.plugin.offline.ui.y0 r13 = new com.tencent.mm.plugin.offline.ui.y0
            r13.<init>(r0)
            android.app.Dialog r3 = com.tencent.p014mm.wallet_core.p137ui.C75197d0.m90164e(r3, r2, r13)
            r0.f201913y0 = r3
            goto L_0x0118
        L_0x010d:
            boolean r3 = r3.isShowing()
            if (r3 != 0) goto L_0x0118
            android.app.Dialog r3 = r0.f201913y0
            r3.show()
        L_0x0118:
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r0.f201853T1
            int r13 = com.tencent.p014mm.plugin.offline.C30326g.f81861c
            long r13 = (long) r13
            r3.startTimer(r13)
        L_0x0120:
            r3 = 0
            goto L_0x0123
        L_0x0122:
            r3 = 1
        L_0x0123:
            com.tencent.mm.plugin.offline.ui.w r13 = r0.f201885k1
            r13.getClass()
            java.lang.String r14 = "MicroMsg.OfflineLogicMgr"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r12 = "onNotify OfflineMsg type :"
            r15.append(r12)
            int r12 = r1.f223559a
            r15.append(r12)
            java.lang.String r12 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            int r12 = r1.f223559a
            if (r12 != r6) goto L_0x014c
            android.os.Vibrator r6 = r13.f202063d
            r11 = 50
            r6.vibrate(r11)
        L_0x014c:
            int r6 = r1.f223559a
            if (r10 != r6) goto L_0x015a
            id2.t$c r1 = (id2.C76313t.C76315c) r1
            r13.mo96362d(r1)
            com.tencent.p014mm.plugin.offline.C30326g.m39030e()
            goto L_0x0471
        L_0x015a:
            r11 = 0
            if (r9 != r6) goto L_0x0211
            id2.t$g r1 = (id2.C76313t.C76319g) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "showNotifyMsg msg.wxRetCode:"
            r4.append(r5)
            java.lang.String r5 = r1.f223565f
            r4.append(r5)
            java.lang.String r5 = " msg.wxRetMsg:"
            r4.append(r5)
            java.lang.String r5 = r1.f223566g
            r4.append(r5)
            java.lang.String r5 = " msg.cftRetCode:"
            r4.append(r5)
            java.lang.String r5 = r1.f223565f
            r4.append(r5)
            java.lang.String r5 = " msg.cftRetMsg:"
            r4.append(r5)
            java.lang.String r5 = r1.f223564e
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            java.lang.String r4 = r1.f223565f
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01b5
            java.lang.String r4 = r1.f223566g
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01b5
            java.lang.String r4 = r1.f223563d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01b5
            java.lang.String r4 = r1.f223564e
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01b5
            goto L_0x0200
        L_0x01b5:
            java.lang.String r4 = r1.f223565f
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01dd
            java.lang.String r4 = r1.f223566g
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01dd
            java.lang.String r4 = r1.f223563d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x01dd
            java.lang.String r4 = r1.f223564e
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x01dd
            android.app.Activity r4 = r13.f202060a
            java.lang.String r5 = r1.f223564e
            com.tencent.p014mm.plugin.offline.p085ui.C70021r.m82512a(r4, r5, r1)
            goto L_0x0200
        L_0x01dd:
            java.lang.String r4 = r1.f223565f
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x01f9
            java.lang.String r4 = r1.f223565f
            boolean r4 = kd2.C76559f.m92114j(r4)
            if (r4 == 0) goto L_0x01f9
            java.lang.String r4 = r1.f223565f
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r4, (int) r2)
            java.lang.String r5 = r1.f223566g
            r13.mo96360b(r11, r4, r5, r1)
            goto L_0x0200
        L_0x01f9:
            android.app.Activity r4 = r13.f202060a
            java.lang.String r5 = r1.f223566g
            com.tencent.p014mm.plugin.offline.p085ui.C70021r.m82512a(r4, r5, r1)
        L_0x0200:
            com.tencent.p014mm.plugin.offline.C30326g.m39030e()
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 135(0x87, double:6.67E-322)
            r11 = 0
            r13 = 1
            r15 = 1
            r8.idkeyStat(r9, r11, r13, r15)
            goto L_0x0471
        L_0x0211:
            if (r8 != r6) goto L_0x02f5
            id2.t$h r1 = (id2.C76313t.C76320h) r1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "showOrderSuccessUI transid : "
            r5.append(r6)
            java.lang.String r6 = r1.f223572d
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
            com.tencent.mm.plugin.offline.m r5 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            jd2.a r5 = r5.yx0()
            com.tencent.mm.plugin.wallet_core.model.Orders r6 = r1.f223573e
            java.lang.String r6 = r6.f209563e
            id2.s r5 = r5.mo59197qq(r6)
            r6 = 20000(0x4e20, float:2.8026E-41)
            if (r5 == 0) goto L_0x0248
            int r5 = r5.field_status
            int r8 = com.tencent.p014mm.plugin.offline.C30326g.f81861c
            if (r5 != r6) goto L_0x0248
            r5 = 1
            goto L_0x0249
        L_0x0248:
            r5 = 0
        L_0x0249:
            if (r5 != 0) goto L_0x02d2
            com.tencent.mm.plugin.wallet_core.model.Orders r5 = r1.f223573e
            java.lang.String r5 = r5.f209563e
            com.tencent.p014mm.plugin.offline.C30326g.m39026a(r5, r6)
            android.app.Activity r5 = r13.f202060a
            java.lang.String r6 = "MicroMsg.WalletOfflineUtil"
            java.lang.String r8 = "hy: whole pay msg coming. direct parse"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            com.tencent.mm.plugin.wallet_core.model.Orders r8 = r1.f223573e
            if (r8 != 0) goto L_0x0266
            java.lang.String r1 = "order == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            goto L_0x02c7
        L_0x0266:
            boolean r6 = kd2.C76559f.m92117m()
            if (r6 != 0) goto L_0x026d
            goto L_0x02c7
        L_0x026d:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            com.tencent.mm.plugin.wallet_core.model.Orders r8 = r1.f223573e
            java.lang.String r9 = "key_orders"
            r6.putParcelable(r9, r8)
            java.lang.String r8 = "key_pay_type"
            r6.putInt(r8, r4)
            id2.t$j r4 = r1.f223574f
            if (r4 == 0) goto L_0x02a8
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper r4 = new com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper
            r4.<init>()
            id2.t$j r1 = r1.f223574f
            java.lang.String r8 = r1.f223580a
            java.lang.String r9 = r1.f223581b
            java.lang.String r12 = r1.f223582c
            java.lang.String r15 = r1.f223583d
            java.lang.String r1 = r1.f223584e
            r21 = 8
            r19 = r15
            r15 = r4
            r16 = r8
            r17 = r9
            r18 = r12
            r20 = r1
            r15.mo99373d(r16, r17, r18, r19, r20, r21)
            java.lang.String r1 = "key_realname_guide_helper"
            r6.putParcelable(r1, r4)
        L_0x02a8:
            boolean r1 = r5 instanceof com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI
            if (r1 == 0) goto L_0x02c2
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r4 = "key_appid"
            java.lang.String r8 = r1.getStringExtra(r4)
            r6.putString(r4, r8)
            java.lang.String r4 = "key_from_scene"
            int r1 = r1.getIntExtra(r4, r2)
            r6.putInt(r4, r1)
        L_0x02c2:
            java.lang.Class<com.tencent.mm.plugin.offline.l> r1 = com.tencent.p014mm.plugin.offline.C69962l.class
            yq3.C79143a.m95771j(r5, r1, r6, r11)
        L_0x02c7:
            android.app.Activity r1 = r13.f202060a
            r4 = -1
            r1.setResult(r4)
            android.app.Activity r1 = r13.f202060a
            r1.finish()
        L_0x02d2:
            com.tencent.p014mm.plugin.offline.C30326g.m39030e()
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 135(0x87, double:6.67E-322)
            r18 = 7
            r20 = 1
            r22 = 1
            r15 = r1
            r15.idkeyStat(r16, r18, r20, r22)
            int r4 = kd2.C76559f.f224089g
            if (r4 != r10) goto L_0x0471
            java.lang.String r4 = "hy: is from ext"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            r4 = 13412(0x3464, float:1.8794E-41)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r1.mo160131h(r4, r5)
            goto L_0x0471
        L_0x02f5:
            java.lang.String r4 = ""
            if (r5 != r6) goto L_0x041e
            id2.t$i r1 = (id2.C76313t.C76321i) r1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "showPayConfirmMsg msg id:"
            r6.append(r8)
            java.lang.String r8 = r1.f223577f
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            int r6 = r1.f223578g
            r8 = 10001(0x2711, float:1.4014E-41)
            if (r6 != 0) goto L_0x036d
            android.app.Activity r4 = r13.f202060a
            android.view.LayoutInflater r4 = r4.getLayoutInflater()
            r5 = 2131498266(0x7f0c151a, float:1.8620148E38)
            android.view.View r4 = r4.inflate(r5, r11)
            r5 = 2131310807(0x7f0938d7, float:1.8239936E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131310810(0x7f0938da, float:1.8239943E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r9 = r1.f223576e
            r5.setText(r9)
            java.lang.String r5 = r1.f223575d
            r6.setText(r5)
            java.lang.String r5 = r1.f223579h
            com.tencent.p014mm.plugin.offline.C30326g.m39026a(r5, r8)
            android.app.Activity r14 = r13.f202060a
            r5 = 2131839810(0x7f114b42, float:1.9312882E38)
            java.lang.String r17 = r13.mo96359a(r5)
            r5 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r18 = r13.mo96359a(r5)
            com.tencent.mm.plugin.offline.ui.c0 r5 = new com.tencent.mm.plugin.offline.ui.c0
            r5.<init>(r13, r1)
            com.tencent.mm.plugin.offline.ui.d0 r6 = new com.tencent.mm.plugin.offline.ui.d0
            r6.<init>(r13, r1)
            java.lang.String r15 = ""
            r16 = r4
            r19 = r5
            r20 = r6
            nj3.C76879j.m92747r(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0471
        L_0x036d:
            if (r6 != r7) goto L_0x0471
            com.tencent.mm.plugin.wallet_core.ui.f1 r6 = r13.f202062c
            if (r6 == 0) goto L_0x0376
            r6.show()
        L_0x0376:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 13955(0x3683, float:1.9555E-41)
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            r10[r2] = r12
            r6.mo160131h(r9, r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "launchPwdDialog msg id:"
            r6.append(r9)
            java.lang.String r9 = r1.f223577f
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            java.lang.String r6 = r1.f223579h
            com.tencent.p014mm.plugin.offline.C30326g.m39026a(r6, r8)
            android.app.Activity r6 = r13.f202060a
            java.lang.String r8 = r1.f223575d
            java.lang.String r9 = r1.f223576e
            com.tencent.mm.plugin.offline.ui.e0 r10 = new com.tencent.mm.plugin.offline.ui.e0
            r10.<init>(r13, r1)
            com.tencent.mm.plugin.offline.ui.f0 r12 = new com.tencent.mm.plugin.offline.ui.f0
            r12.<init>(r13)
            com.tencent.mm.plugin.offline.ui.g0 r14 = new com.tencent.mm.plugin.offline.ui.g0
            r14.<init>(r13, r1)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1.f210536Q0
            boolean r1 = r6 instanceof android.app.Activity
            if (r1 == 0) goto L_0x03c3
            boolean r15 = r6.isFinishing()
            if (r15 == 0) goto L_0x03c3
            goto L_0x040f
        L_0x03c3:
            if (r1 == 0) goto L_0x03cc
            boolean r1 = r6.isFinishing()
            if (r1 == 0) goto L_0x03cc
            goto L_0x040f
        L_0x03cc:
            com.tencent.mm.plugin.wallet_core.ui.f1 r11 = new com.tencent.mm.plugin.wallet_core.ui.f1
            r1 = 2131887332(0x7f1204e4, float:1.9409268E38)
            r11.<init>(r6, r1)
            r11.mo99751s(r12)
            r11.setOnCancelListener(r12)
            r11.setCancelable(r7)
            android.widget.TextView r1 = r11.f210566h
            r1.setText(r8)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x03f3
            android.widget.TextView r1 = r11.f210568j
            r1.setVisibility(r2)
            android.widget.TextView r1 = r11.f210568j
            r1.setText(r9)
            goto L_0x03f8
        L_0x03f3:
            android.widget.TextView r1 = r11.f210568j
            r1.setVisibility(r5)
        L_0x03f8:
            r11.f210546J = r7
            r11.mo99753u(r7)
            r11.mo99754v(r2)
            r11.f210546J = r2
            r11.f210541E = r14
            r11.mo99746n(r4)
            r11.f210577u = r10
            r11.show()
            nj3.C76879j.m92730a(r6, r11)
        L_0x040f:
            r13.f202062c = r11
            android.widget.TextView r1 = r11.f210566h
            r1.setVisibility(r2)
            com.tencent.mm.plugin.wallet_core.ui.f1 r1 = r13.f202062c
            android.widget.TextView r1 = r1.f210568j
            r1.setVisibility(r5)
            goto L_0x0471
        L_0x041e:
            r8 = 23
            if (r8 != r6) goto L_0x046a
            id2.t$f r1 = (id2.C76313t.C76318f) r1
            com.tencent.mm.pluginsdk.wallet.PayInfo r6 = new com.tencent.mm.pluginsdk.wallet.PayInfo
            r6.<init>()
            java.lang.String r1 = r1.f223562d
            r6.f212592j = r1
            r6.f212587e = r5
            r6.f212580K = r7
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r6.f212600u = r1
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "extinfo_key_9"
            r1.putLong(r5, r8)
            yq3.b r1 = yq3.C79144b.m95773a()
            r1.getClass()
            yq3.b r1 = yq3.C79144b.m95773a()
            r1.getClass()
            java.lang.Class<ie3.c> r1 = ie3.C76324c.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ie3.c r1 = (ie3.C76324c) r1
            android.app.Activity r5 = r13.f202060a
            java.lang.String r8 = r6.f212592j
            com.tencent.mm.plugin.offline.ui.b r9 = r13.f202061b
            if (r9 != 0) goto L_0x0460
            goto L_0x0464
        L_0x0460:
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r9 = (com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI) r9
            java.lang.String r4 = r9.f201899s
        L_0x0464:
            int r6 = r6.f212589g
            r1.startOfflinePay(r5, r8, r4, r6)
            goto L_0x0471
        L_0x046a:
            r1 = 20
            if (r1 != r6) goto L_0x0471
            com.tencent.p014mm.plugin.offline.C30326g.m39030e()
        L_0x0471:
            boolean r1 = r0.f201863X0
            if (r1 == 0) goto L_0x047d
            boolean r1 = r0.f201865Y0
            if (r1 != 0) goto L_0x047d
            r0.f201863X0 = r2
            r0.f201852T0 = r2
        L_0x047d:
            if (r3 == 0) goto L_0x0485
            r0.mo96308c8(r2, r2)
            r0.mo96291L7(r7)
        L_0x0485:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI.onNotify(id2.t$e):boolean");
    }

    public void onPause() {
        C69959k Bx0 = C69963m.wx0().Bx0();
        Bx0.f201779f.removeCallbacks(Bx0.f201781h);
        ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
        this.f201886l1 = false;
        this.f201836M1.dead();
        this.f201855U0.mo57282g();
        Toast toast = this.f201910x0;
        if (toast != null) {
            toast.cancel();
        }
        super.onPause();
    }

    public void onResume() {
        boolean z;
        String str;
        super.onResume();
        C69963m.f201787j = true;
        this.f201836M1.alive();
        try {
            ScreenShotUtil.setScreenShotCallback(this, this);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletOfflineCoinPurseUI", e, "", new Object[0]);
        }
        if (!this.f201889n1) {
            mo96305a8();
            mo96289J7();
            mo96307b8();
            mo96301W7();
            mo96302X7();
            this.f201889n1 = true;
        }
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on resume");
        this.f201886l1 = true;
        C67213b Jf = ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf();
        Jf.mo91357j(this, Jf.mo91358k(), (C67213b.C67215a) null);
        if (NetStatusUtil.isNetworkConnected(getBaseContext())) {
            if (((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91337s()) {
                doSceneForceProgress(new C78342e0((String) null, 8));
            }
            if (C76559f.m92115k() && this.f201908w1) {
                C69963m.wx0().Bx0().mo96270e(false);
                this.f201885k1.getClass();
                if (!(C69963m.wx0().Ax0().f223553b != null)) {
                    int i = C76312r.f223547h;
                    if (this.f201874e1) {
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "do not doNetSceneUserBindQuery()");
                        this.f201874e1 = false;
                    } else if (this.f201914y1) {
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "callbackFromKinda，do not doSceneUserBindQuery");
                        this.f201914y1 = false;
                        this.f201911x1 = false;
                    } else if (this.f201911x1) {
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "is paying in kinda，do not doSceneUserBindQuery");
                    } else {
                        C76312r rVar = new C76312r(this.f201879h, (String) null, 8, this.f201900s1, this.f201902t1, this.f201872d1);
                        this.f201872d1 = 0;
                        doSceneProgress(rVar, false);
                        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "do doNetSceneUserBindQuery()");
                    }
                }
            }
        }
        if (!this.f201908w1) {
            this.f201908w1 = true;
        }
        mo96295P7();
        Bankcard a = C76555c.f224079a.mo106804a(false);
        if (a == null || (str = a.field_bindSerial) == null || str.equals(this.f201899s)) {
            z = false;
        } else {
            mo96299U7(a);
            z = true;
        }
        if (z || (this.f201890o && this.f201888n)) {
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "onresume BindSerial isChange");
            this.f201890o = false;
            this.f201888n = false;
            mo96298T7();
            mo96308c8(0, false);
            mo96291L7(true);
        }
        C30326g gVar = this.f201855U0;
        gVar.getClass();
        Log.m105924i("MicroMsg.OfflineGetMsgLogic", "OFFLINEGETMSGLOGIN START; IS stopped=" + gVar.f81864b.stopped());
        MTimerHandler mTimerHandler = gVar.f81864b;
        if (mTimerHandler == null || mTimerHandler.stopped()) {
            C115669n.INSTANCE.idkeyStat(135, 61, 1, true);
            C30326g.m39030e();
            gVar.f81864b.startTimer((long) 5000);
        }
        if (this.f201904u1) {
            this.f201904u1 = false;
            C115669n.INSTANCE.mo160131h(18930, Integer.valueOf(this.f201906v1), 4);
        }
        this.f201812A1 = false;
        this.f201814B1 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x056c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSceneEnd(int r29, int r30, java.lang.String r31, ob0.C117747y r32) {
        /*
            r28 = this;
            r11 = r28
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "errType:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = "  errCode"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " errMsg:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " scene: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.WalletOfflineCoinPurseUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.lang.String r4 = ""
            r7 = 0
            r12 = 1
            java.lang.String r8 = "onScene end NetSceneCheckPayJsapi fail"
            if (r0 != 0) goto L_0x058d
            if (r1 != 0) goto L_0x058d
            boolean r9 = r3 instanceof v53.C78342e0
            java.lang.String r10 = "1"
            r6 = 7
            if (r9 == 0) goto L_0x0202
            boolean r0 = r11.f201894p1
            if (r0 == 0) goto L_0x0071
            r11.f201894p1 = r7
            java.lang.String r0 = "bind card success - fromKinda"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            boolean r0 = kd2.C76559f.m92115k()
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "bind card success need doCreateOffline"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = kd2.C76559f.m92108d(r12)
            if (r0 == 0) goto L_0x0070
            id2.l r1 = new id2.l
            java.lang.String r2 = r11.f201896q1
            r1.<init>(r0, r2, r7)
            r11.doSceneForceProgress(r1)
        L_0x0070:
            return r12
        L_0x0071:
            boolean r0 = kd2.C76559f.m92115k()
            if (r0 == 0) goto L_0x009a
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = kd2.C76559f.m92108d(r7)
            if (r0 == 0) goto L_0x009a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            id2.o r1 = new id2.o
            int r2 = r11.f201879h
            r1.<init>(r0, r2)
            r11.doSceneProgress(r1, r7)
        L_0x009a:
            r0 = r3
            v53.e0 r0 = (v53.C78342e0) r0
            b63.s r1 = r0.f229576z
            if (r1 == 0) goto L_0x01e5
            int r2 = r1.f192942b
            if (r2 != 0) goto L_0x00a7
            goto L_0x01e5
        L_0x00a7:
            com.tencent.mm.plugin.offline.ui.OfflineAlertView r2 = r11.f201887m1
            boolean r2 = r2.mo96281d(r6)
            if (r2 != 0) goto L_0x00b9
            r19 = r4
            r20 = r5
            r17 = r8
            r18 = r9
            goto L_0x01f7
        L_0x00b9:
            com.tencent.mm.plugin.offline.ui.OfflineAlertView r2 = r11.f201887m1
            int r15 = r2.f201797d
            if (r15 != r6) goto L_0x00c2
            r2.mo96278a()
        L_0x00c2:
            int r2 = r1.f192941a
            r11.f201906v1 = r2
            com.tencent.mm.plugin.offline.ui.OfflineAlertView r2 = r11.f201887m1
            android.view.View r15 = r11.f201907w
            com.tencent.mm.plugin.offline.ui.d1 r13 = new com.tencent.mm.plugin.offline.ui.d1
            r13.<init>(r11)
            r2.getClass()
            java.lang.Class<ny.g> r14 = p629ny.C76978g.class
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r17 = r8
            int r8 = r1.f192941a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r7] = r8
            r8 = 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            r12[r8] = r16
            r8 = 18930(0x49f2, float:2.6527E-41)
            r6.mo160131h(r8, r12)
            r6 = 7
            r2.f201797d = r6
            r2.setVisibility(r7)
            r2.f201800g = r7
            android.view.ViewGroup r6 = r2.f201799f
            r6.removeAllViews()
            android.content.Context r6 = r2.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            android.view.ViewGroup r8 = r2.f201799f
            r12 = 2131498263(0x7f0c1517, float:1.8620142E38)
            android.view.View r6 = r6.inflate(r12, r8, r7)
            android.view.ViewGroup r8 = r2.f201799f
            r8.addView(r6)
            r8 = 2131308867(0x7f093143, float:1.8236002E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r12 = 2131314666(0x7f0947ea, float:1.8247763E38)
            android.view.View r12 = r6.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r7 = 2131306157(0x7f0926ad, float:1.8230505E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r18 = r9
            java.lang.String r9 = r1.f192944d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x013c
            java.lang.String r9 = r1.f192944d
            r8.setText(r9)
        L_0x013c:
            java.lang.String r8 = r1.f192945e
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0191
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r9 = r1.f192946f
            r19 = r4
            java.lang.String r4 = "repayment_tiny_app_username"
            r8.putString(r4, r9)
            java.lang.String r4 = r1.f192947g
            java.lang.String r9 = "repayment_tiny_app_path"
            r8.putString(r9, r4)
            java.lang.String r4 = r1.f192945e
            r12.setText(r4)
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            r20 = r5
            r5 = 1
            r9 = 0
            r4.mo107052M6(r12, r5, r9, r8)
            de3.p r4 = r2.f201803j
            if (r4 == 0) goto L_0x017e
            di3.d r4 = di3.C86312j.m106911c(r14)
            ny.g r4 = (p629ny.C76978g) r4
            de3.p r5 = r2.f201803j
            r4.bj0(r5)
        L_0x017e:
            com.tencent.mm.plugin.offline.ui.d r4 = new com.tencent.mm.plugin.offline.ui.d
            r4.<init>(r2, r13, r1)
            r2.f201803j = r4
            di3.d r4 = di3.C86312j.m106911c(r14)
            ny.g r4 = (p629ny.C76978g) r4
            de3.p r5 = r2.f201803j
            r4.k30(r5)
            goto L_0x0195
        L_0x0191:
            r19 = r4
            r20 = r5
        L_0x0195:
            int r4 = r1.f192943c
            if (r4 <= 0) goto L_0x01d4
            r4 = 0
            r7.setEnabled(r4)
            android.os.CountDownTimer r4 = r2.f201802i
            if (r4 == 0) goto L_0x01a5
            r4.cancel()
            goto L_0x01cf
        L_0x01a5:
            com.tencent.mm.wallet_core.model.g r4 = new com.tencent.mm.wallet_core.model.g
            r4.<init>()
            int r5 = r1.f192943c
            int r5 = r5 * 1000
            long r8 = (long) r5
            r4.f221044a = r8
            r8 = 1000(0x3e8, double:4.94E-321)
            r4.f221045b = r8
            com.tencent.mm.plugin.offline.ui.e r5 = new com.tencent.mm.plugin.offline.ui.e
            r5.<init>(r2, r7)
            r4.f221046c = r5
            com.tencent.mm.wallet_core.model.f r5 = new com.tencent.mm.wallet_core.model.f
            long r8 = r4.f221044a
            long r12 = r4.f221045b
            r21 = r5
            r22 = r4
            r23 = r8
            r25 = r12
            r21.<init>(r22, r23, r25)
            r2.f201802i = r5
        L_0x01cf:
            android.os.CountDownTimer r4 = r2.f201802i
            r4.start()
        L_0x01d4:
            com.tencent.mm.plugin.offline.ui.f r4 = new com.tencent.mm.plugin.offline.ui.f
            r4.<init>(r2, r1)
            r7.setOnClickListener(r4)
            com.tencent.mm.plugin.offline.ui.g r1 = new com.tencent.mm.plugin.offline.ui.g
            r1.<init>(r2, r15, r6)
            r15.post(r1)
            goto L_0x01f7
        L_0x01e5:
            r19 = r4
            r20 = r5
            r17 = r8
            r18 = r9
            com.tencent.mm.plugin.offline.ui.OfflineAlertView r1 = r11.f201887m1
            int r2 = r1.f201797d
            r4 = 7
            if (r2 != r4) goto L_0x01f7
            r1.mo96278a()
        L_0x01f7:
            b63.t r0 = r0.f229553A
            r11.f201916z1 = r0
            r28.mo96301W7()
            r28.mo96289J7()
            goto L_0x022b
        L_0x0202:
            r19 = r4
            r20 = r5
            r17 = r8
            r18 = r9
            boolean r4 = r3 instanceof id2.C76309n
            if (r4 == 0) goto L_0x0215
            r0 = r3
            id2.n r0 = (id2.C76309n) r0
            r0.mo106544l1()
            goto L_0x022b
        L_0x0215:
            boolean r4 = r3 instanceof id2.C46218k
            if (r4 == 0) goto L_0x0231
            r28.mo96295P7()
            r28.mo96305a8()
            r28.mo96289J7()
            r28.mo96307b8()
            r28.mo96301W7()
            r28.mo96302X7()
        L_0x022b:
            r5 = r19
            r4 = r20
            goto L_0x0495
        L_0x0231:
            boolean r4 = r3 instanceof id2.C76310o
            if (r4 == 0) goto L_0x02d7
            r0 = r3
            id2.o r0 = (id2.C76310o) r0
            java.lang.String r1 = r0.f223544g
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0266
            java.lang.String r1 = "hy: should pause. showFirstPostTip alert to finish"
            r4 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            java.lang.String r1 = r0.f223545h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0257
            r0 = 2131839043(0x7f114843, float:1.9311326E38)
            java.lang.String r0 = r11.getString(r0)
            goto L_0x0259
        L_0x0257:
            java.lang.String r0 = r0.f223545h
        L_0x0259:
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$e r1 = new com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$e
            r1.<init>(r11)
            r5 = r19
            r2 = 0
            nj3.C76879j.m92713G(r11, r0, r5, r2, r1)
            r0 = 1
            return r0
        L_0x0266:
            r5 = r19
            r4 = r20
            int r1 = r0.f223541d
            if (r1 != 0) goto L_0x02cb
            com.tencent.mm.plugin.offline.ui.w r1 = r11.f201885k1
            r1.getClass()
            com.tencent.mm.plugin.offline.m r1 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            r2 = 196629(0x30015, float:2.75536E-40)
            java.lang.String r1 = r1.zx0(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x028f
            boolean r2 = kd2.C76559f.m92114j(r1)
            if (r2 != 0) goto L_0x028b
            goto L_0x028f
        L_0x028b:
            r2 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
        L_0x028f:
            java.lang.String r0 = r0.f223543f
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0495
            java.lang.String r0 = "hy: should refresh codes. doscene"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            boolean r0 = id2.C76303b.f223503j
            if (r0 != 0) goto L_0x02c4
            id2.n r0 = new id2.n
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r2 = (int) r6
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 8
            r0.<init>(r1, r2, r2)
            r1 = 0
            r11.doSceneProgress(r0, r1)
            goto L_0x0495
        L_0x02c4:
            java.lang.String r0 = "is doing setofflinepayment"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0495
        L_0x02cb:
            if (r1 == 0) goto L_0x0495
            com.tencent.mm.plugin.offline.ui.w r2 = r11.f201885k1
            java.lang.String r6 = r0.f223542e
            r7 = 0
            r2.mo96360b(r0, r1, r6, r7)
            goto L_0x0495
        L_0x02d7:
            r5 = r19
            r4 = r20
            boolean r6 = r3 instanceof id2.C46216c
            if (r6 == 0) goto L_0x02e4
            r0 = r3
            id2.c r0 = (id2.C46216c) r0
            goto L_0x0495
        L_0x02e4:
            boolean r6 = r3 instanceof id2.C46217g
            if (r6 == 0) goto L_0x02ef
            com.tencent.mm.plugin.offline.ui.w r6 = r11.f201885k1
            r6.mo96361c(r0, r1, r2, r3)
            goto L_0x0495
        L_0x02ef:
            boolean r0 = r3 instanceof z53.C79311j
            if (r0 == 0) goto L_0x0384
            android.app.Dialog r0 = r11.f201913y0
            if (r0 == 0) goto L_0x0302
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0302
            android.app.Dialog r0 = r11.f201913y0
            r0.dismiss()
        L_0x0302:
            r0 = r3
            z53.j r0 = (z53.C79311j) r0
            java.lang.String r1 = r0.f232848d
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x035a
            java.lang.String r1 = r0.f232848d
            java.lang.String r2 = "2"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0320
            java.lang.String r1 = r0.f232849e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0320
            goto L_0x035a
        L_0x0320:
            java.lang.String r1 = r0.f232852h
            java.lang.String r2 = "collect"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0336
            r0 = 32
            r1 = 1
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90243e0(r0, r1)
            int r0 = r11.f201891o1
            ie3.C76331i.m91765i(r11, r0)
            goto L_0x0382
        L_0x0336:
            java.lang.String r1 = r0.f232852h
            java.lang.String r3 = "reward"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x034b
            androidx.appcompat.app.AppCompatActivity r0 = r28.getContext()
            java.lang.String r1 = ".reward.ui.QrRewardMainUI"
            ke3.C88144b.m109789g(r0, r2, r1)
            goto L_0x0382
        L_0x034b:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r0 = r0.f232852h
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "unknown scene: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r0, r2)
            goto L_0x0382
        L_0x035a:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r1 = "realname_verify_process_jump_activity"
            java.lang.String r2 = ".ui.WalletOfflineCoinPurseUI"
            r5.putString(r1, r2)
            java.lang.String r1 = "realname_verify_process_jump_plugin"
            java.lang.String r2 = "offline"
            r5.putString(r1, r2)
            java.lang.String r1 = r0.f232849e
            r2 = 0
            java.lang.String r3 = r0.f232850f
            java.lang.String r4 = r0.f232851g
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1006(0x3ee, float:1.41E-42)
            r10 = 1
            r0 = r28
            a63.C67008a.m79172h(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x0382:
            r0 = 1
            return r0
        L_0x0384:
            r0 = 1
            boolean r1 = r3 instanceof id2.C76312r
            if (r1 == 0) goto L_0x0495
            java.lang.String r1 = "onScene end NetSceneTenpayWxOfflineUserBindQuery ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r1 = r3
            id2.r r1 = (id2.C76312r) r1
            r11.f201867Z0 = r0
            boolean r2 = r1.isJumpRemind()
            if (r2 == 0) goto L_0x03af
            boolean r2 = r11.f201868a1
            if (r2 != 0) goto L_0x03af
            com.tencent.mm.wallet_core.model.JumpRemind r2 = r1.getJumpRemind()
            r2.mo104779a()
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$f r6 = new com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$f
            r6.<init>(r11)
            r2.mo104782f(r11, r6)
            r11.f201868a1 = r0
        L_0x03af:
            com.tencent.mm.wallet_core.model.i r0 = r1.f223551g
            int r2 = r0.f221052a
            int r6 = r0.f221053b
            java.lang.String r0 = r0.f221054c
            v53.e0 r7 = r1.f223549e
            r11.onSceneEnd(r2, r6, r0, r7)
            com.tencent.mm.wallet_core.model.i r0 = r1.f223550f
            int r2 = r0.f221052a
            int r6 = r0.f221053b
            java.lang.String r0 = r0.f221054c
            id2.o r1 = r1.f223548d
            r11.onSceneEnd(r2, r6, r0, r1)
            kd2.c r0 = kd2.C76555c.f224079a
            kd2.c$a r0 = kd2.C76555c.f224080b
            if (r0 == 0) goto L_0x048d
            boolean r0 = r0 instanceof kd2.C76554b
            if (r0 == 0) goto L_0x03d9
            r28.mo96294O7()
            r28.mo96298T7()
        L_0x03d9:
            k53.a r0 = r11.f201870c1
            if (r0 == 0) goto L_0x03ec
            boolean r0 = r0.mo106726a()
            if (r0 == 0) goto L_0x03ec
            int r0 = r11.f201869b1
            r1 = 1
            if (r0 != r1) goto L_0x03ed
            r11.mo96300V7(r1)
            goto L_0x03ed
        L_0x03ec:
            r1 = 1
        L_0x03ed:
            java.lang.String r0 = r11.f201901t
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0477
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r2 = r11.f201901t
            r6 = 0
            r0[r6] = r2
            java.lang.String r2 = "mBindSerialOperation：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
            java.util.List r0 = kd2.C76559f.m92107c(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            if (r2 >= r1) goto L_0x0414
            java.lang.String r0 = "getBindBankCardList == null or size < 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0477
        L_0x0414:
            r1 = 0
        L_0x0415:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0442
            java.lang.Object r2 = r0.get(r1)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r2
            java.lang.String r6 = r2.field_bindSerial
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x043f
            java.lang.String r6 = r11.f201901t
            java.lang.String r7 = r2.field_bindSerial
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x043f
            r6 = 0
            r7 = 0
            r11.mo96293N7(r2, r7, r6)
            r11.f201901t = r5
            java.lang.String r2 = "find the mBindSerialOperation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
        L_0x043f:
            int r1 = r1 + 1
            goto L_0x0415
        L_0x0442:
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            if (r0 != 0) goto L_0x044d
            java.lang.String r0 = "mJsApiOfflineUserBindQueryResultCallBackEventEvent == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0477
        L_0x044d:
            java.lang.String r0 = r11.f201901t
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x045e
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$b r0 = r0.f193680e
            java.lang.String r1 = "fail:no find operation bindSerial"
            r0.f193693a = r1
            goto L_0x0467
        L_0x045e:
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$b r0 = r0.f193680e
            java.lang.String r1 = "ok:open success"
            r0.f193693a = r1
        L_0x0467:
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r0 = r0.f193679d
            java.lang.Runnable r0 = r0.f193692l
            com.tencent.mm.plugin.appbrand.jsapi.z3 r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.C68622z3) r0
            r0.run()
            r0 = 0
            r11.f201818D1 = r0
            r11.f201901t = r5
        L_0x0477:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_OFFLINE_PREFER_CARD_CHANGE_WORDING_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r1, r5)
            java.lang.String r0 = (java.lang.String) r0
            r11.f201816C1 = r0
            r28.mo96311f8()
            goto L_0x0495
        L_0x048d:
            java.lang.String r0 = "sImpl"
            gy3.C87412m.m108603p(r0)
            r0 = 0
            throw r0
        L_0x0495:
            if (r18 != 0) goto L_0x056c
            boolean r0 = r3 instanceof id2.C76310o
            if (r0 != 0) goto L_0x056c
            boolean r0 = r3 instanceof id2.C46216c
            if (r0 != 0) goto L_0x056c
            boolean r0 = r3 instanceof id2.C46217g
            if (r0 == 0) goto L_0x04a5
            goto L_0x056c
        L_0x04a5:
            boolean r0 = r3 instanceof id2.C76307l
            if (r0 == 0) goto L_0x04c7
            r0 = 1
            r11.mo96296Q7(r0, r0)
            kd2.C76559f.m92126v(r28)
            v53.e0 r0 = new v53.e0
            r1 = 8
            r2 = 0
            r0.<init>(r2, r1)
            r1 = 0
            r11.doSceneProgress(r0, r1)
            r28.mo96305a8()
            r28.mo96307b8()
            r28.mo96302X7()
            goto L_0x0620
        L_0x04c7:
            r1 = 8
            boolean r0 = r3 instanceof v53.C78339d
            if (r0 == 0) goto L_0x0620
            java.lang.String r0 = "onScene end NetSceneCheckPayJsapi ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.widget.LinearLayout r0 = r11.f201821F
            r0.setVisibility(r1)
            java.lang.Class<yz.v> r0 = p281yz.C79173v.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            yz.v r0 = (p281yz.C79173v) r0
            b63.s0 r0 = r0.Ex0()
            r1 = 0
            r0.mo91316F(r1)
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            if (r0 == 0) goto L_0x0565
            java.lang.String r0 = "onScene end mJsApiOfflineUserBindQueryResultCallBackEventEvent != null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r1 = r0.f193679d
            java.lang.String r1 = r1.f193691k
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0541
            java.lang.String r1 = "FQF openSuccess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r1 = 6
            m82435R7(r1)
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r1 = r0.f193679d
            java.lang.String r1 = r1.f193690j
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0526
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r1 = r0.f193679d
            java.lang.String r1 = r1.f193690j
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "event.data.bindSerial is : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r2)
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r1 = r0.f193679d
            java.lang.String r1 = r1.f193690j
            r11.f201901t = r1
        L_0x0526:
            id2.r r1 = new id2.r
            int r3 = r11.f201879h
            r4 = 0
            r5 = 8
            int r6 = r11.f201900s1
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r0 = r0.f193679d
            java.lang.String r8 = r0.f193681a
            java.lang.String r9 = r0.f193686f
            java.lang.String r7 = ""
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r11.doSceneProgress(r1, r0)
            goto L_0x0620
        L_0x0541:
            java.lang.String r0 = "FQF openfail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 7
            m82435R7(r0)
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            if (r0 == 0) goto L_0x0620
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$b r1 = r0.f193680e
            java.lang.String r2 = "ok:open fail"
            r1.f193693a = r2
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r0 = r0.f193679d
            java.lang.Runnable r0 = r0.f193692l
            com.tencent.mm.plugin.appbrand.jsapi.z3 r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.C68622z3) r0
            r0.run()
            r0 = 0
            r11.f201818D1 = r0
            r11.f201901t = r5
            goto L_0x0620
        L_0x0565:
            r6 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            goto L_0x0620
        L_0x056c:
            if (r18 == 0) goto L_0x0583
            boolean r0 = r11.f201814B1
            if (r0 != 0) goto L_0x057c
            boolean r0 = r11.f201812A1
            if (r0 == 0) goto L_0x0577
            goto L_0x057c
        L_0x0577:
            r7 = 1
            r11.mo96297S7(r7)
            goto L_0x0584
        L_0x057c:
            r7 = 1
            java.lang.String r0 = "hasClickFQFGuideBar || hasClickChangeBankcardLayout，dont resetDefaultBankcard"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0584
        L_0x0583:
            r7 = 1
        L_0x0584:
            r28.mo96295P7()
            r8 = 0
            r11.mo96296Q7(r8, r7)
            goto L_0x0620
        L_0x058d:
            r6 = r8
            r7 = 1
            r8 = 0
            r27 = r5
            r5 = r4
            r4 = r27
            boolean r9 = r3 instanceof id2.C76310o
            r10 = 411(0x19b, float:5.76E-43)
            if (r9 == 0) goto L_0x05ab
            r28.mo96295P7()
            r11.mo96296Q7(r8, r7)
            if (r10 != r1) goto L_0x0620
            com.tencent.mm.plugin.offline.ui.w r0 = r11.f201885k1
            r4 = 0
            r0.mo96360b(r3, r1, r2, r4)
            goto L_0x0620
        L_0x05ab:
            boolean r7 = r3 instanceof id2.C46217g
            if (r7 == 0) goto L_0x05b5
            com.tencent.mm.plugin.offline.ui.w r4 = r11.f201885k1
            r4.mo96361c(r0, r1, r2, r3)
            goto L_0x0620
        L_0x05b5:
            boolean r0 = r3 instanceof id2.C46218k
            if (r0 == 0) goto L_0x05ba
            goto L_0x0620
        L_0x05ba:
            boolean r0 = r3 instanceof z53.C79311j
            if (r0 == 0) goto L_0x05ce
            android.app.Dialog r0 = r11.f201913y0
            if (r0 == 0) goto L_0x0620
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0620
            android.app.Dialog r0 = r11.f201913y0
            r0.dismiss()
            goto L_0x0620
        L_0x05ce:
            boolean r0 = r3 instanceof id2.C76312r
            if (r0 == 0) goto L_0x0601
            java.lang.String r0 = "onScene end NetSceneTenpayWxOfflineUserBindQuery fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r28.mo96295P7()
            r0 = 0
            r4 = 1
            r11.mo96296Q7(r0, r4)
            if (r10 != r1) goto L_0x05e8
            com.tencent.mm.plugin.offline.ui.w r0 = r11.f201885k1
            r4 = 0
            r0.mo96360b(r3, r1, r2, r4)
        L_0x05e8:
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            if (r0 == 0) goto L_0x0620
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$b r1 = r0.f193680e
            java.lang.String r2 = "fail:NetSceneTenpayWxOfflineUserBindQuery"
            r1.f193693a = r2
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r0 = r0.f193679d
            java.lang.Runnable r0 = r0.f193692l
            com.tencent.mm.plugin.appbrand.jsapi.z3 r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.C68622z3) r0
            r0.run()
            r0 = 0
            r11.f201818D1 = r0
            r11.f201901t = r5
            goto L_0x0620
        L_0x0601:
            boolean r0 = r3 instanceof v53.C78339d
            if (r0 == 0) goto L_0x0620
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent r0 = r11.f201818D1
            if (r0 == 0) goto L_0x0620
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$b r1 = r0.f193680e
            java.lang.String r2 = "fail:NetSceneCheckPayJsapi"
            r1.f193693a = r2
            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent$a r0 = r0.f193679d
            java.lang.Runnable r0 = r0.f193692l
            com.tencent.mm.plugin.appbrand.jsapi.z3 r0 = (com.tencent.p014mm.plugin.appbrand.jsapi.C68622z3) r0
            r0.run()
            r0 = 0
            r11.f201818D1 = r0
            r11.f201901t = r5
        L_0x0620:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI.onSceneEnd(int, int, java.lang.String, ob0.y):boolean");
    }

    public void onScreenShot(String str, long j) {
        Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "setScreenShotCallback");
        mo96308c8(1, false);
        mo96291L7(true);
        C75228t.m90243e0(40, 1);
        C115669n.INSTANCE.idkeyStat(135, 21, 1, true);
        if (this.f201884j1.f221324h.isShowing()) {
            C75218i iVar = this.f201884j1;
            if (iVar.f221322f) {
                ViewGroup viewGroup = iVar.f221330n;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    iVar.f221330n.post(new C75225n(iVar));
                    return;
                }
                return;
            }
            C76901s0 s0Var = iVar.f221324h;
            if (s0Var != null && s0Var.isShowing()) {
                iVar.f221324h.dismiss();
            }
            mo96303Y7();
            return;
        }
        mo96303Y7();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(WalletOfflineCoinPurseUI$$c0.class);
        hashSet.add(C57154g1.class);
    }
}
