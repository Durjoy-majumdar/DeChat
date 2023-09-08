package com.tencent.p014mm.plugin.collect.p038ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b21.C113081b;
import b63.C113146l;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.xweb.util.WXWebReporter;
import di0.C86300q;
import di3.C86312j;
import e21.C116642q;
import e21.C116644q0;
import e21.C116645t;
import e21.C116648v0;
import e21.C116673y0;
import e21.C45530e;
import e21.C45532f;
import e21.C45534g;
import e21.C45536h;
import e21.C45537i;
import e21.C45540m;
import e21.C45541n;
import e21.C58517j;
import e21.C58518k;
import e21.C58519l;
import e21.C75489r;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import g62.C32330n;
import go3.C76003c;
import h21.C117010a1;
import h21.C117014c1;
import h21.C117016d1;
import h21.C117020e1;
import h21.C117023f1;
import h21.C117026g1;
import h21.C117027h1;
import h21.C117028i1;
import h21.C117029j1;
import h21.C117030k1;
import h21.C117031l1;
import h21.C117032m1;
import h21.C117033n1;
import h21.C117034o1;
import h21.C117035p1;
import h21.C117039q1;
import h21.C117042r1;
import h21.C117045s0;
import h21.C117046s1;
import h21.C117049t0;
import h21.C117051u0;
import h21.C117052u1;
import h21.C117054v0;
import h21.C117056w0;
import h21.C117058x0;
import h21.C8484y0;
import hp3.C87581a;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr0.C76630x0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C88989a;
import ob0.C117747y;
import ob0.C89132b;
import p159gw.C98250h;
import p281yz.C79173v;
import p626nv.C109759g;
import p629ny.C76979h;
import p755xs.C102720b;
import p910lj.C76701a;
import pe3.C89349b;
import qo3.C101218e0;
import qo3.C12925w;
import qo3.C77398g;
import qo3.C77407n;
import qo3.C77426q;
import tc0.C77885p;
import te3.C118447nw2;
import te3.C118460qp;
import te3.C118461r00;
import te3.C118466sp;
import te3.C118477wj3;
import te3.C118479xj3;
import te3.C118480xn3;
import te3.C48745ap;
import te3.C49139df2;
import te3.C50163kq;
import te3.C50434mq;
import te3.C51281sq;
import te3.C51549ui;
import te3.C51582uq;
import te3.C51862wp;
import te3.C52148yp;
import te3.C64334dz2;
import te3.C64761ux2;
import te3.C64774vi;
import te3.C77963l1;
import ub3.C78144b;
import zt3.C119157j;

@C86737h0
@C88989a(0)
/* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI */
public class WalletCollectQrCodeUI extends WalletBaseUI implements C116642q.C116643a, ScreenShotUtil.ScreenShotCallback, TextWatcher {

    /* renamed from: T */
    public static int f345669T;

    /* renamed from: A */
    public long f345670A;

    /* renamed from: B */
    public Vibrator f345671B;

    /* renamed from: C */
    public long f345672C;

    /* renamed from: D */
    public C101218e0 f345673D;

    /* renamed from: E */
    public C77407n f345674E;

    /* renamed from: F */
    public C77426q f345675F;

    /* renamed from: G */
    public C77407n f345676G;

    /* renamed from: H */
    public C101218e0 f345677H;

    /* renamed from: I */
    public View f345678I;

    /* renamed from: J */
    public C12925w f345679J;

    /* renamed from: K */
    public KeyboardHeightProvider f345680K;

    /* renamed from: L */
    public int f345681L;

    /* renamed from: M */
    public int f345682M;

    /* renamed from: N */
    public boolean f345683N;

    /* renamed from: P */
    public boolean f345684P;

    /* renamed from: Q */
    public int f345685Q;

    /* renamed from: R */
    public int f345686R = 1;

    /* renamed from: S */
    public C102720b.C78973a f345687S = new C115342f();

    /* renamed from: d */
    public int f345688d = 1;

    /* renamed from: e */
    public C116673y0.C116674b f345689e;

    /* renamed from: f */
    public C116673y0.C116674b f345690f;

    /* renamed from: g */
    public C116673y0.C116675c f345691g;

    /* renamed from: h */
    public C116673y0.C116675c f345692h;

    /* renamed from: i */
    public ViewGroup f345693i;

    /* renamed from: j */
    public LinearLayout f345694j;

    /* renamed from: n */
    public TextView f345695n;

    /* renamed from: o */
    public LinearLayout f345696o;

    /* renamed from: p */
    public RelativeLayout f345697p;

    /* renamed from: q */
    public CdnImageView f345698q;

    /* renamed from: r */
    public TextView f345699r;

    /* renamed from: s */
    public RelativeLayout f345700s;

    /* renamed from: t */
    public View f345701t;

    /* renamed from: u */
    public TextView f345702u;

    /* renamed from: v */
    public TextView f345703v;

    /* renamed from: w */
    public View f345704w;

    /* renamed from: x */
    public boolean f345705x = false;

    /* renamed from: y */
    public C115364z f345706y;

    /* renamed from: z */
    public C115361y f345707z;

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$x */
    public class C68855x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WalletGetBulletinEvent f197831d;

        public C68855x(WalletGetBulletinEvent walletGetBulletinEvent) {
            this.f197831d = walletGetBulletinEvent;
        }

        public void run() {
            if (!Util.isNullOrNil(this.f197831d.f79043e.f79046a)) {
                WalletGetBulletinEvent.C28848b bVar = this.f197831d.f79043e;
                C75228t.m90247g0((View) null, (TextView) WalletCollectQrCodeUI.this.findViewById(C0966R.C0970id.a7l), bVar.f79046a, bVar.f79047b, bVar.f79048c);
                return;
            }
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "no bulletin data");
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$a */
    public class C115334a implements C87581a<Object, C89132b.C89134c<C118460qp>> {
        public C115334a() {
        }

        public Object call(Object obj) {
            T t;
            String str;
            IOException e;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiGetQrcodeMch cgiBack.errType:%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (WalletCollectQrCodeUI.this.isFinishing() || WalletCollectQrCodeUI.this.isDestroyed() || (t = cVar.f256796d) == null) {
                return null;
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C116673y0.C116674b bVar = WalletCollectQrCodeUI.this.f345690f;
                C118460qp qpVar = (C118460qp) t;
                Class cls = C78144b.class;
                Log.m105924i("MicroMsg.WalletCollectQrCodeLogic", "[setMchConfig]");
                try {
                    str = new String(qpVar.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
                    try {
                        Log.m105924i("MicroMsg.WalletCollectQrCodeLogic", "setConfig success");
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    str = " ";
                    Log.m105920e("MicroMsg.WalletCollectQrCodeLogic", "save config exp, " + e.getLocalizedMessage());
                    ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WX_PAY_COLLECT_QRCODE_MCH_CONFIG_STRING_SYNC, str);
                    ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119990a(true);
                    C116673y0.m164541a(bVar, (C118466sp) null, qpVar);
                    WalletCollectQrCodeUI.this.mo175145j8(0);
                    return Boolean.TRUE;
                }
                ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WX_PAY_COLLECT_QRCODE_MCH_CONFIG_STRING_SYNC, str);
                ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119990a(true);
                C116673y0.m164541a(bVar, (C118466sp) null, qpVar);
                WalletCollectQrCodeUI.this.mo175145j8(0);
            } else {
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                C116648v0.m164519e(walletCollectQrCodeUI.f345692h, walletCollectQrCodeUI.f345690f, cVar.f256795c, walletCollectQrCodeUI.getContext());
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$b */
    public class C115335b implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ C116673y0.C116674b f345709a;

        /* renamed from: b */
        public final /* synthetic */ int f345710b;

        /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$b$a */
        public class C115336a implements C76324c.C76325a {
            public C115336a() {
            }

            /* renamed from: a */
            public void mo5281a(Intent intent) {
                String stringExtra = intent.getStringExtra("key_error_msg");
                if (Util.isNullOrNil(stringExtra) || !stringExtra.equals("ok")) {
                    WalletCollectQrCodeUI.this.f345686R = 2;
                    return;
                }
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                int i = WalletCollectQrCodeUI.f345669T;
                walletCollectQrCodeUI.mo175155s8(intent);
                C115335b bVar = C115335b.this;
                WalletCollectQrCodeUI.this.mo175149n8(bVar.f345710b);
            }
        }

        public C115335b(C116673y0.C116674b bVar, int i) {
            this.f345709a = bVar;
            this.f345710b = i;
        }

        public void onClick(View view) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "click set money tv");
            C116673y0.C116674b bVar = this.f345709a;
            if (bVar.f349842I) {
                C118480xn3 xn32 = bVar.f349843J;
                Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "qrcode setting page-title data，title：%s  subTitle：%s fillTitle：%s  fillHint：%s", xn32.f354543d, xn32.f354544e, xn32.f354545f, xn32.f354546g);
                C116673y0.C116674b bVar2 = this.f345709a;
                Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "qrcode setting page-money data，fee：%s desc：%s desc_required：%s desc_placeholder：%s", Double.valueOf(this.f345709a.f349861k), bVar2.f349863m, Boolean.valueOf(bVar2.f349865o), this.f345709a.f349864n);
                Intent intent = new Intent();
                intent.putExtra("key_type", this.f345710b);
                intent.putExtra("key_payer_desc_switch_title", this.f345709a.f349843J.f354543d);
                intent.putExtra("key_payer_desc_switch_sub_title", this.f345709a.f349843J.f354544e);
                intent.putExtra("key_payer_desc_fill_title", this.f345709a.f349843J.f354545f);
                intent.putExtra("key_payer_desc_fill_hint", this.f345709a.f349843J.f354546g);
                intent.putExtra("key_currency_unit", this.f345709a.f349867q);
                intent.putExtra("ftf_fixed_fee", C75228t.m90231X(this.f345709a.f349861k + "", "100"));
                intent.putExtra("ftf_fixed_desc", this.f345709a.f349863m);
                intent.putExtra("ftf_fixed_desc_required", this.f345709a.f349865o);
                intent.putExtra("ftf_fixed_desc_placeholder", this.f345709a.f349864n);
                ((C76324c) C86312j.m106911c(C76324c.class)).startQrcodeCollectionSettingUseCase(intent, new C115336a());
            } else {
                Intent intent2 = new Intent();
                intent2.setClass(WalletCollectQrCodeUI.this.getContext(), WalletCollectQrCodeSettingUI.class);
                intent2.putExtra("key_currency_unit", this.f345709a.f349867q);
                intent2.putExtra("key_type", this.f345710b);
                WalletCollectQrCodeUI.this.startActivityForResult(intent2, 4096);
            }
            WalletCollectQrCodeUI.this.f345686R = 3;
            C115669n.INSTANCE.mo160131h(25983, 3, Integer.valueOf(this.f345710b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$c */
    public class C115337c implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ int f345713a;

        /* renamed from: b */
        public final /* synthetic */ List f345714b;

        /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$c$a */
        public class C115338a implements C11182m0 {
            public C115338a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                C115669n.INSTANCE.mo160131h(25983, 7, Integer.valueOf(C115337c.this.f345713a));
                C115337c cVar = C115337c.this;
                if (WalletCollectQrCodeUI.m162104I7(WalletCollectQrCodeUI.this, cVar.f345713a)) {
                    e0Var.add(0, 1, 0, (int) C0966R.string.bge);
                } else {
                    e0Var.add(0, 1, 0, (int) C0966R.string.bgo);
                }
                for (int i = 0; i < C115337c.this.f345714b.size(); i++) {
                    C118447nw2 nw22 = (C118447nw2) C115337c.this.f345714b.get(i);
                    if (!Util.isNullOrNil(nw22.f354150e)) {
                        e0Var.add(0, i + 1 + 1, 0, (CharSequence) nw22.f354150e);
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$c$b */
        public class C115339b implements C11184p0 {
            public C115339b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_F2F_RING_TONE_MCH_STRING;
                Class cls = C75700k0.class;
                if (menuItem.getItemId() != 1) {
                    int itemId = (menuItem.getItemId() - 1) - 1;
                    if (itemId < 0) {
                        Log.m105929w("MicroMsg.WalletCollectQrCodeUI", "illegal pos: %s", Integer.valueOf(itemId));
                        return;
                    }
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160131h(25983, 10, Integer.valueOf(C115337c.this.f345713a));
                    C118447nw2 nw22 = (C118447nw2) C115337c.this.f345714b.get(itemId);
                    int i2 = nw22.f354149d;
                    if (i2 == 1) {
                        Log.m105929w("MicroMsg.WalletCollectQrCodeUI", "wrong native type: %s", nw22.f354151f);
                        nVar.mo160131h(14526, 2, 1, nw22.f354150e, "", "", "", 2);
                    } else if (i2 == 2) {
                        if (!Util.isNullOrNil(nw22.f354151f)) {
                            C75228t.m90219L(WalletCollectQrCodeUI.this.getContext(), nw22.f354151f, false);
                            nVar.mo160131h(14526, 2, 2, nw22.f354150e, "", "", nw22.f354151f, 2);
                        }
                    } else if (i2 == 3) {
                        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                        aVar2.f9526a = nw22.f354152g;
                        aVar2.f9527b = Util.nullAs(nw22.f354153h, "");
                        StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
                        aVar3.f9529d = 1072;
                        aVar3.f9528c = 0;
                        startAppBrandUIFromOuterEvent.publish();
                        nVar.mo160131h(14526, 2, 3, nw22.f354150e, nw22.f354152g, nw22.f354153h, "", 2);
                    }
                } else {
                    C115337c cVar = C115337c.this;
                    if (WalletCollectQrCodeUI.m162104I7(WalletCollectQrCodeUI.this, cVar.f345713a)) {
                        C115337c cVar2 = C115337c.this;
                        WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                        int i3 = cVar2.f345713a;
                        if (i3 == 0) {
                            i3 = walletCollectQrCodeUI.f345688d;
                        } else {
                            walletCollectQrCodeUI.getClass();
                        }
                        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[closeVoiceRingTone]，needRefreshType：%s", Integer.valueOf(i3));
                        if (i3 == 1) {
                            walletCollectQrCodeUI.f345672C &= -32769;
                            C86709a0.m107528h();
                            C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(walletCollectQrCodeUI.f345672C));
                            C64334dz2 dz22 = new C64334dz2();
                            dz22.f182905d = 2;
                            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(209, dz22));
                            C113081b.yx0().vx0();
                        } else if (i3 != 2) {
                            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
                        } else {
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, "in.caf");
                            new C45541n(3).mo9225i().mo123062e(new C117056w0(walletCollectQrCodeUI));
                        }
                        C76701a.makeText((Context) WalletCollectQrCodeUI.this.getContext(), (int) C0966R.string.bgf, 1).show();
                        C115669n nVar2 = C115669n.INSTANCE;
                        nVar2.mo160131h(13944, 8);
                        nVar2.mo160131h(25983, 9, Integer.valueOf(C115337c.this.f345713a));
                        return;
                    }
                    C115337c cVar3 = C115337c.this;
                    WalletCollectQrCodeUI walletCollectQrCodeUI2 = WalletCollectQrCodeUI.this;
                    int i4 = cVar3.f345713a;
                    if (i4 == 0) {
                        i4 = walletCollectQrCodeUI2.f345688d;
                    } else {
                        walletCollectQrCodeUI2.getClass();
                    }
                    Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[openVoiceRingTone]，needRefreshType：%s", Integer.valueOf(i4));
                    if (i4 == 1) {
                        walletCollectQrCodeUI2.f345672C |= 32768;
                        C86709a0.m107528h();
                        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(walletCollectQrCodeUI2.f345672C));
                        C64334dz2 dz23 = new C64334dz2();
                        dz23.f182905d = 1;
                        ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(209, dz23));
                        C113081b.yx0().wx0();
                    } else if (i4 != 2) {
                        Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
                    } else {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, "cash.caf");
                        new C45541n(2).mo9225i().mo123062e(new C117054v0(walletCollectQrCodeUI2));
                    }
                    C76701a.makeText((Context) WalletCollectQrCodeUI.this.getContext(), (int) C0966R.string.bgp, 1).show();
                    F2fRcvVoiceOffLineLogic.m162050d().mo175086k(false);
                    C115669n nVar3 = C115669n.INSTANCE;
                    nVar3.mo160131h(13944, 7);
                    nVar3.mo160131h(25983, 8, Integer.valueOf(C115337c.this.f345713a));
                }
            }
        }

        public C115337c(int i, List list) {
            this.f345713a = i;
            this.f345714b = list;
        }

        public void onClick(View view) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "click more tv");
            WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
            walletCollectQrCodeUI.f345676G = new C77407n((Context) walletCollectQrCodeUI.getContext(), 1, false);
            C77407n nVar = WalletCollectQrCodeUI.this.f345676G;
            nVar.f225771i = new C115338a();
            nVar.f225782p = new C115339b();
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$d */
    public class C115340d implements C87581a<Object, C89132b.C89134c<C51582uq>> {

        /* renamed from: a */
        public final /* synthetic */ C118461r00 f345718a;

        /* renamed from: b */
        public final /* synthetic */ int f345719b;

        public C115340d(C118461r00 r002, int i) {
            this.f345718a = r002;
            this.f345719b = i;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcode，cgiBack.errType：%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (WalletCollectQrCodeUI.this.isFinishing() || WalletCollectQrCodeUI.this.isDestroyed() || cVar.f256796d == null) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcode，isFinishing() || isDestroyed() || cgiBack.resp == null");
                return null;
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C115669n.INSTANCE.mo160131h(13944, 5);
                C51582uq uqVar = (C51582uq) cVar.f256796d;
                Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "cgiBack.resp.url:%s cgiBack.resp.true_name:%s", uqVar.f143026d, uqVar.f143027e);
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                C51582uq uqVar2 = (C51582uq) cVar.f256796d;
                WalletCollectQrCodeUI.m162106K7(walletCollectQrCodeUI, uqVar2.f143026d, uqVar2.f143027e, uqVar2.f143028f, uqVar2.f143029g, this.f345718a, this.f345719b);
                WalletCollectQrCodeUI.this.mo175131W7(1);
            } else {
                WalletCollectQrCodeUI.m162105J7(WalletCollectQrCodeUI.this, cVar.f256795c);
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$e */
    public class C115341e implements C87581a<Object, C89132b.C89134c<C51281sq>> {

        /* renamed from: a */
        public final /* synthetic */ C118461r00 f345721a;

        /* renamed from: b */
        public final /* synthetic */ int f345722b;

        public C115341e(C118461r00 r002, int i) {
            this.f345721a = r002;
            this.f345722b = i;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeMch，cgiBack.errType：%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (WalletCollectQrCodeUI.this.isFinishing() || WalletCollectQrCodeUI.this.isDestroyed() || cVar.f256796d == null) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeMch，isFinishing() || isDestroyed() || cgiBack.resp == null");
                return null;
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C115669n.INSTANCE.mo160131h(13944, 5);
                C51281sq sqVar = (C51281sq) cVar.f256796d;
                Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "cgiBack.resp.url:%s cgiBack.resp.true_name：%s", sqVar.f141667d, sqVar.f141668e);
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                C51281sq sqVar2 = (C51281sq) cVar.f256796d;
                WalletCollectQrCodeUI.m162106K7(walletCollectQrCodeUI, sqVar2.f141667d, sqVar2.f141668e, sqVar2.f141669f, sqVar2.f141670g, this.f345721a, this.f345722b);
                WalletCollectQrCodeUI.this.mo175131W7(2);
            } else {
                WalletCollectQrCodeUI.m162105J7(WalletCollectQrCodeUI.this, cVar.f256795c);
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$f */
    public class C115342f implements C102720b.C78973a {
        public C115342f() {
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            if (str != null && !Util.isNullOrNil(WalletCollectQrCodeUI.this.f345690f.f349848O) && str.equals(WalletCollectQrCodeUI.this.f345690f.f349848O)) {
                Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", WalletCollectQrCodeUI.this.f345690f.f349848O, str);
                WalletCollectQrCodeUI.this.mo175149n8(2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$g */
    public class C115343g extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C118447nw2 f345725g;

        public C115343g(C118447nw2 nw22) {
            this.f345725g = nw22;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "mBottomEntranceLayout setonClick item.type:%s", Integer.valueOf(this.f345725g.f354149d));
            C115669n.INSTANCE.mo160131h(25983, 16, Integer.valueOf(WalletCollectQrCodeUI.this.f345688d));
            C118447nw2 nw22 = this.f345725g;
            int i = nw22.f354149d;
            if (i == 2) {
                C75228t.m90219L(WalletCollectQrCodeUI.this.getContext(), this.f345725g.f354151f, false);
            } else if (i != 3) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknow type");
            } else {
                C75228t.m90224Q(nw22.f354152g, Util.nullAs(nw22.f354153h, ""), 0, 1072);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$h */
    public class C115344h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116674b f345727d;

        /* renamed from: e */
        public final /* synthetic */ int f345728e;

        /* renamed from: f */
        public final /* synthetic */ C116673y0.C116675c f345729f;

        /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$h$a */
        public class C115345a implements View.OnLongClickListener {
            public C115345a() {
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$24$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C115344h hVar = C115344h.this;
                C116673y0.C116674b bVar = hVar.f345727d;
                bVar.f349872v = 3;
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                C118477wj3 wj32 = bVar.f349856f;
                int i = WalletCollectQrCodeUI.f345669T;
                walletCollectQrCodeUI.mo175158v8(wj32);
                if (C115344h.this.f345727d.f349856f != null) {
                    C115669n.INSTANCE.mo160131h(20032, "wxface2face", "LongClick", "", "", "", "", 3, Integer.valueOf(C115344h.this.f345727d.f349856f.f354516d), 0, WalletCollectQrCodeUI.this.mo175139c8(), Integer.valueOf(WalletCollectQrCodeUI.this.mo175141e8(0)), WalletCollectQrCodeUI.this.mo175140d8(0));
                }
                C115669n.INSTANCE.mo160131h(25983, 13, Integer.valueOf(C115344h.this.f345728e));
                C117292a.m165362h(true, this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$24$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }

        public C115344h(C116673y0.C116674b bVar, int i, C116673y0.C116675c cVar) {
            this.f345727d = bVar;
            this.f345728e = i;
            this.f345729f = cVar;
        }

        public void run() {
            WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
            C116673y0.C116674b bVar = this.f345727d;
            double d = bVar.f349861k;
            String str = bVar.f349863m;
            boolean z = bVar.f349865o;
            String str2 = bVar.f349864n;
            int i = WalletCollectQrCodeUI.f345669T;
            if (walletCollectQrCodeUI.mo175143g8(d, str, z, str2)) {
                if (Util.isNullOrNil(this.f345727d.f349859i)) {
                    Log.m105928w("MicroMsg.WalletCollectQrCodeUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
                    return;
                } else {
                    C116673y0.C116674b bVar2 = this.f345727d;
                    bVar2.f349871u = WalletCollectQrCodeUI.this.mo175125Q7(this.f345728e, bVar2.f349859i, bVar2.f349848O, bVar2.f349866p);
                }
            } else if (Util.isNullOrNil(this.f345727d.f349851a)) {
                Log.m105928w("MicroMsg.WalletCollectQrCodeUI", "func[refreshQRCodeArea] : qrcode_url null");
                return;
            } else {
                C116673y0.C116674b bVar3 = this.f345727d;
                bVar3.f349871u = WalletCollectQrCodeUI.this.mo175125Q7(this.f345728e, bVar3.f349851a, bVar3.f349848O, bVar3.f349854d);
            }
            Bitmap bitmap = this.f345727d.f349871u;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f345729f.f349917q.setImageBitmap((Bitmap) null);
                this.f345729f.f349917q.setImageBitmap(this.f345727d.f349871u);
            }
            this.f345729f.f349917q.setOnLongClickListener(new C115345a());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f345729f.f349914n.getLayoutParams();
            if (this.f345727d.f349861k > 0.0d) {
                this.f345729f.f349912l.setVisibility(0);
                this.f345729f.f349913m.setPrefix(WalletCollectQrCodeUI.this.mo175134Z7(this.f345728e));
                this.f345729f.f349913m.setText(C75228t.m90260n(this.f345727d.f349861k));
                layoutParams.topMargin = C76577a.m92151b(WalletCollectQrCodeUI.this.getContext(), 8);
            } else {
                this.f345729f.f349912l.setVisibility(8);
                layoutParams.topMargin = C76577a.m92151b(WalletCollectQrCodeUI.this.getContext(), 16);
            }
            this.f345729f.f349914n.setLayoutParams(layoutParams);
            WalletCollectQrCodeUI.this.mo175153q8(this.f345728e, this.f345729f.f349914n);
            WalletCollectQrCodeUI.this.mo175154r8(this.f345728e, this.f345729f.f349915o);
            this.f345729f.f349911k.setText(WalletCollectQrCodeUI.this.mo175142f8(this.f345728e));
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$i */
    public class C115346i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116675c f345732d;

        /* renamed from: e */
        public final /* synthetic */ C116673y0.C116674b f345733e;

        /* renamed from: f */
        public final /* synthetic */ int f345734f;

        public C115346i(WalletCollectQrCodeUI walletCollectQrCodeUI, C116673y0.C116675c cVar, C116673y0.C116674b bVar, int i) {
            this.f345732d = cVar;
            this.f345733e = bVar;
            this.f345734f = i;
        }

        public void run() {
            C116648v0.C116655g gVar = this.f345732d.f349882F;
            LinkedList<C116645t.C116647b> linkedList = gVar.f349786f;
            linkedList.add((C116645t.C116647b) ((LinkedList) this.f345733e.f349873w).get(this.f345734f));
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$j */
    public class C115347j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116675c f345735d;

        /* renamed from: e */
        public final /* synthetic */ int f345736e;

        public C115347j(C116673y0.C116675c cVar, int i) {
            this.f345735d = cVar;
            this.f345736e = i;
        }

        public void run() {
            this.f345735d.f349882F.mo180650a(this.f345736e);
            WalletCollectQrCodeUI.this.mo175146k8(this.f345736e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$k */
    public class C115348k implements C87581a<Object, C89132b.C89134c<C48745ap>> {
        public C115348k() {
        }

        public Object call(Object obj) {
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiApplyQRcode，cgiBack.errType：%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (WalletCollectQrCodeUI.this.isFinishing() || WalletCollectQrCodeUI.this.isDestroyed() || (t = cVar.f256796d) == null) {
                return null;
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                C48745ap apVar = (C48745ap) t;
                Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "showQrcodeUsageHalfPage，mCollectType：%s", Integer.valueOf(walletCollectQrCodeUI.f345688d));
                C101218e0 e0Var = walletCollectQrCodeUI.f345677H;
                if ((e0Var == null || !e0Var.mo140661h()) && walletCollectQrCodeUI.f345688d != 2) {
                    C116673y0.C116674b X7 = walletCollectQrCodeUI.mo175132X7(1);
                    C101218e0 e0Var2 = new C101218e0(walletCollectQrCodeUI, 1, 3, false);
                    walletCollectQrCodeUI.f345677H = e0Var2;
                    e0Var2.f296384g.setFocusable(false);
                    walletCollectQrCodeUI.f345677H.mo140667n(apVar.f130704g.f354532d, apVar.f130705h.f354532d);
                    TextView textView = new TextView(walletCollectQrCodeUI);
                    textView.setPadding(C76577a.m92151b(walletCollectQrCodeUI, 24), C76577a.m92151b(walletCollectQrCodeUI, 40), C76577a.m92151b(walletCollectQrCodeUI, 24), C76577a.m92151b(walletCollectQrCodeUI, 24));
                    textView.setTextSize(1, C76577a.m92165p(walletCollectQrCodeUI.getContext()) * 17.0f);
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                    textView.setTextColor(walletCollectQrCodeUI.getResources().getColor(C0966R.color.FG_0));
                    textView.setText(apVar.f130701d);
                    walletCollectQrCodeUI.f345677H.mo140673s(textView);
                    RecyclerView recyclerView = new RecyclerView(walletCollectQrCodeUI, (AttributeSet) null);
                    C75489r rVar = new C75489r(walletCollectQrCodeUI, apVar.f130703f);
                    rVar.f221853e = apVar.f130702e;
                    rVar.f221856h = walletCollectQrCodeUI;
                    recyclerView.setFocusable(false);
                    recyclerView.setAdapter(rVar);
                    recyclerView.setLayoutManager(new LinearLayoutManager(walletCollectQrCodeUI));
                    recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                    walletCollectQrCodeUI.f345677H.mo140663j(recyclerView);
                    rVar.f221855g = new C117016d1(walletCollectQrCodeUI, apVar, X7);
                    C117020e1 e1Var = new C117020e1(walletCollectQrCodeUI, apVar);
                    C117023f1 f1Var = new C117023f1(walletCollectQrCodeUI, apVar);
                    walletCollectQrCodeUI.f345677H.mo140656b(false);
                    C101218e0 e0Var3 = walletCollectQrCodeUI.f345677H;
                    e0Var3.f296373D = e1Var;
                    e0Var3.f296374E = f1Var;
                    e0Var3.mo140655A();
                    walletCollectQrCodeUI.f345681L = walletCollectQrCodeUI.f345677H.f296384g.getMeasuredHeight();
                }
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$l */
    public class C115349l implements C87581a<Object, C89132b.C89134c<C50434mq>> {
        public C115349l(WalletCollectQrCodeUI walletCollectQrCodeUI) {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeNotify，cgiBack.errType：%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$m */
    public class C115350m implements C87581a<Object, C89132b.C89134c<C50163kq>> {
        public C115350m(WalletCollectQrCodeUI walletCollectQrCodeUI) {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiSaveQrcodeNotifyMch，cgiBack.errType：%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$n */
    public class C115351n extends C7089c0 {
        public C115351n(WalletCollectQrCodeUI walletCollectQrCodeUI) {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$o */
    public class C115352o extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C118461r00 f345739g;

        public C115352o(C118461r00 r002) {
            this.f345739g = r002;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
            walletCollectQrCodeUI.f345685Q = 3;
            WalletCollectQrCodeUI.m162109N7(walletCollectQrCodeUI, this.f345739g.f354295e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$p */
    public class C115353p extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C118461r00 f345741g;

        public C115353p(C118461r00 r002) {
            this.f345741g = r002;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
            walletCollectQrCodeUI.f345685Q = 3;
            WalletCollectQrCodeUI.m162109N7(walletCollectQrCodeUI, this.f345741g.f354296f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$q */
    public class C115354q implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ int f345743d;

        public C115354q(int i) {
            this.f345743d = i;
        }

        public boolean onTimerExpired() {
            WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
            int i = this.f345743d;
            int i2 = WalletCollectQrCodeUI.f345669T;
            walletCollectQrCodeUI.mo175129U7(i, true);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$r */
    public class C115355r implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C116673y0.C116674b f345745d;

        /* renamed from: e */
        public final /* synthetic */ C116673y0.C116675c f345746e;

        public C115355r(C116673y0.C116674b bVar, C116673y0.C116675c cVar) {
            this.f345745d = bVar;
            this.f345746e = cVar;
        }

        public boolean onTimerExpired() {
            if (this.f345745d.f349836C) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "has show error, do not show timer error");
            } else {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "has not back resp");
                C116673y0.C116674b bVar = this.f345745d;
                bVar.f349836C = true;
                C116648v0.m164519e(this.f345746e, bVar, "", WalletCollectQrCodeUI.this.getContext());
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$s */
    public class C115356s implements C87581a<Object, C89132b.C89134c<C52148yp>> {

        /* renamed from: a */
        public final /* synthetic */ C116673y0.C116674b f345748a;

        /* renamed from: b */
        public final /* synthetic */ int f345749b;

        /* renamed from: c */
        public final /* synthetic */ C116673y0.C116675c f345750c;

        public C115356s(C116673y0.C116674b bVar, int i, C116673y0.C116675c cVar) {
            this.f345748a = bVar;
            this.f345749b = i;
            this.f345750c = cVar;
        }

        public Object call(Object obj) {
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiF2fShortTermQrcode cgiBack.errType:%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (WalletCollectQrCodeUI.this.isFinishing() || WalletCollectQrCodeUI.this.isDestroyed() || (t = cVar.f256796d) == null) {
                return null;
            }
            C116673y0.C116674b bVar = this.f345748a;
            if (bVar.f349836C) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "has show error");
                return null;
            }
            bVar.f349836C = true;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C52148yp ypVar = (C52148yp) cVar.f256796d;
                C52148yp ypVar2 = (C52148yp) cVar.f256796d;
                Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "resp qrcode_type:%s，url：%s,fixed_fee :%s，fixed_desc:%s，payer_desc_placeholder：%s", Integer.valueOf(((C52148yp) t).f145445f), ypVar.f145443d, Long.valueOf(ypVar.f145446g), ypVar2.f145447h, ypVar2.f145449j);
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                C52148yp ypVar3 = (C52148yp) cVar.f256796d;
                String str = ypVar3.f145447h;
                boolean z = ypVar3.f145448i;
                String str2 = ypVar3.f145449j;
                int i = WalletCollectQrCodeUI.f345669T;
                boolean g8 = walletCollectQrCodeUI.mo175143g8((double) ypVar3.f145446g, str, z, str2);
                C52148yp ypVar4 = (C52148yp) cVar.f256796d;
                if (ypVar4.f145445f == 2 || g8) {
                    C116673y0.C116674b bVar2 = this.f345748a;
                    bVar2.f349859i = ypVar4.f145443d;
                    bVar2.f349866p = ypVar4.f145444e;
                    bVar2.f349861k = C75228t.m90250i("" + ((C52148yp) cVar.f256796d).f145446g, "100", 2, RoundingMode.HALF_UP);
                    C116673y0.C116674b bVar3 = this.f345748a;
                    C52148yp ypVar5 = (C52148yp) cVar.f256796d;
                    bVar3.f349863m = ypVar5.f145447h;
                    bVar3.f349864n = ypVar5.f145449j;
                    bVar3.f349865o = ypVar5.f145448i;
                    bVar3.f349838E = System.currentTimeMillis();
                } else {
                    C116673y0.C116674b bVar4 = this.f345748a;
                    bVar4.f349851a = ypVar4.f145443d;
                    bVar4.f349854d = ypVar4.f145444e;
                    bVar4.f349837D = System.currentTimeMillis();
                    WalletCollectQrCodeUI.this.mo175152p8(this.f345748a);
                }
                WalletCollectQrCodeUI.this.mo175149n8(this.f345749b);
                WalletCollectQrCodeUI.this.mo175161y8(this.f345749b);
                C116648v0.m164518d(this.f345750c);
            } else {
                C116648v0.m164519e(this.f345750c, bVar, cVar.f256795c, WalletCollectQrCodeUI.this.getContext());
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$t */
    public class C115357t implements C87581a<Object, C89132b.C89134c<C51862wp>> {

        /* renamed from: a */
        public final /* synthetic */ C116673y0.C116674b f345752a;

        /* renamed from: b */
        public final /* synthetic */ int f345753b;

        /* renamed from: c */
        public final /* synthetic */ C116673y0.C116675c f345754c;

        public C115357t(C116673y0.C116674b bVar, int i, C116673y0.C116675c cVar) {
            this.f345752a = bVar;
            this.f345753b = i;
            this.f345754c = cVar;
        }

        public Object call(Object obj) {
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "CgiF2fShortTermQrcodeMch cgiBack.errType:%s，cgiBack.errCode：%s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (WalletCollectQrCodeUI.this.isFinishing() || WalletCollectQrCodeUI.this.isDestroyed() || (t = cVar.f256796d) == null) {
                return null;
            }
            C116673y0.C116674b bVar = this.f345752a;
            if (bVar.f349836C) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "has show error");
                return null;
            }
            bVar.f349836C = true;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C51862wp wpVar = (C51862wp) cVar.f256796d;
                C51862wp wpVar2 = (C51862wp) cVar.f256796d;
                Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "resp qrcode_type:%s，url：%s,fixed_fee :%s，fixed_desc:%s，payer_desc_placeholder：%s", Integer.valueOf(((C51862wp) t).f144184f), wpVar.f144182d, Long.valueOf(wpVar.f144185g), wpVar2.f144186h, wpVar2.f144189n);
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                C51862wp wpVar3 = (C51862wp) cVar.f256796d;
                String str = wpVar3.f144186h;
                boolean z = wpVar3.f144188j;
                String str2 = wpVar3.f144189n;
                int i = WalletCollectQrCodeUI.f345669T;
                boolean g8 = walletCollectQrCodeUI.mo175143g8((double) wpVar3.f144185g, str, z, str2);
                C51862wp wpVar4 = (C51862wp) cVar.f256796d;
                if (wpVar4.f144184f == 2 || g8) {
                    C116673y0.C116674b bVar2 = this.f345752a;
                    bVar2.f349859i = wpVar4.f144182d;
                    bVar2.f349866p = wpVar4.f144183e;
                    bVar2.f349861k = C75228t.m90250i("" + ((C51862wp) cVar.f256796d).f144185g, "100", 2, RoundingMode.HALF_UP);
                    C116673y0.C116674b bVar3 = this.f345752a;
                    C51862wp wpVar5 = (C51862wp) cVar.f256796d;
                    bVar3.f349860j = wpVar5.f144187i;
                    bVar3.f349863m = wpVar5.f144186h;
                    bVar3.f349864n = wpVar5.f144189n;
                    bVar3.f349865o = wpVar5.f144188j;
                    bVar3.f349838E = System.currentTimeMillis();
                } else {
                    C116673y0.C116674b bVar4 = this.f345752a;
                    bVar4.f349851a = wpVar4.f144182d;
                    bVar4.f349854d = wpVar4.f144183e;
                    bVar4.f349852b = wpVar4.f144187i;
                    bVar4.f349837D = System.currentTimeMillis();
                    WalletCollectQrCodeUI.this.mo175152p8(this.f345752a);
                }
                WalletCollectQrCodeUI.this.mo175149n8(this.f345753b);
                WalletCollectQrCodeUI.this.mo175161y8(this.f345753b);
                C116648v0.m164518d(this.f345754c);
            } else {
                C116648v0.m164519e(this.f345754c, bVar, cVar.f256795c, WalletCollectQrCodeUI.this.getContext());
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$u */
    public class C115358u extends C7089c0 {
        public C115358u() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            if (WalletCollectQrCodeUI.this.f345692h.f349901a.getVisibility() != 8) {
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                if (walletCollectQrCodeUI.f345688d == 1) {
                    WalletCollectQrCodeUI.m162110O7(walletCollectQrCodeUI, 2);
                } else {
                    WalletCollectQrCodeUI.m162110O7(walletCollectQrCodeUI, 1);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$v */
    public class C115359v extends C7089c0 {
        public C115359v() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
            WalletCollectQrCodeUI.m162111P7(walletCollectQrCodeUI, walletCollectQrCodeUI.f345691g);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$w */
    public class C115360w implements C7020t0 {
        public C115360w() {
        }

        /* renamed from: Q1 */
        public void mo531Q1(int i, boolean z) {
            WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
            walletCollectQrCodeUI.f345683N = i > 0;
            C101218e0 e0Var = walletCollectQrCodeUI.f345677H;
            if (e0Var != null && e0Var.mo140661h()) {
                int i2 = C75044y4.m89990b(WalletCollectQrCodeUI.this.getContext()).y;
                if (i <= 0) {
                    WalletCollectQrCodeUI walletCollectQrCodeUI2 = WalletCollectQrCodeUI.this;
                    if (walletCollectQrCodeUI2.f345684P) {
                        walletCollectQrCodeUI2.f345677H.mo140674t(walletCollectQrCodeUI2.f345682M);
                    } else {
                        walletCollectQrCodeUI2.f345677H.mo140674t(walletCollectQrCodeUI2.f345681L);
                    }
                } else if (i * 2 < i2) {
                    WalletCollectQrCodeUI walletCollectQrCodeUI3 = WalletCollectQrCodeUI.this;
                    walletCollectQrCodeUI3.f345677H.mo140674t((i2 - C76577a.m92151b(walletCollectQrCodeUI3.getContext(), 56)) - i);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$y */
    public class C115361y extends C116673y0.C75493a {

        /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$y$a */
        public class C115362a extends C7089c0 {

            /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$y$a$a */
            public class C115363a implements C86300q {
                public C115363a() {
                }

                /* renamed from: a */
                public void mo63853a() {
                    Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "onAppBrandProcessDied");
                    WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                    int i = WalletCollectQrCodeUI.f345669T;
                    walletCollectQrCodeUI.mo175128T7(2);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
                }

                /* renamed from: b */
                public void mo63854b(String str) {
                    Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "onTriggerHalfScreenShare");
                }

                /* renamed from: c */
                public void mo63855c() {
                    Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "onAppBrandUIEnter");
                }

                /* renamed from: d */
                public /* synthetic */ void mo63856d() {
                }

                /* renamed from: e */
                public void mo63857e() {
                    Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "onAppBrandPreconditionError");
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
                }

                /* renamed from: f */
                public void mo63858f(boolean z) {
                    Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "onAppBrandUIExit：%s", Boolean.valueOf(z));
                    WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                    int i = WalletCollectQrCodeUI.f345669T;
                    walletCollectQrCodeUI.mo175128T7(2);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
                }
            }

            public C115362a() {
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(40);
                C64761ux2 ux22 = WalletCollectQrCodeUI.this.f345690f.f349850Q.f182422d;
                C75228t.m90225R(ux22.f185807d, ux22.f185808e, 0, 1072, new C115363a());
            }
        }

        public C115361y() {
        }

        /* renamed from: a */
        public void mo105820a() {
            this.f221863e = (ImageView) WalletCollectQrCodeUI.this.findViewById(C0966R.C0970id.f5m);
            WalletCollectQrCodeUI.this.f345701t.setOnClickListener(new C115362a());
        }

        /* renamed from: e */
        public View mo64133e() {
            return WalletCollectQrCodeUI.this.f345701t;
        }

        public String getPath() {
            return "facingreceiveremerchantapplydot";
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$z */
    public class C115364z extends C116673y0.C75493a {

        /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$z$a */
        public class C115365a extends C7089c0 {
            public C115365a() {
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(41);
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                if (walletCollectQrCodeUI.f345688d == 2) {
                    WalletCollectQrCodeUI.m162110O7(walletCollectQrCodeUI, 1);
                } else {
                    WalletCollectQrCodeUI.m162110O7(walletCollectQrCodeUI, 2);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI$z$b */
        public class C115366b extends C7089c0 {
            public C115366b() {
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                WalletCollectQrCodeUI walletCollectQrCodeUI = WalletCollectQrCodeUI.this;
                WalletCollectQrCodeUI.m162111P7(walletCollectQrCodeUI, walletCollectQrCodeUI.f345692h);
            }
        }

        public C115364z() {
        }

        /* renamed from: a */
        public void mo105820a() {
            C116673y0.C116675c cVar = WalletCollectQrCodeUI.this.f345692h;
            this.f221862d = cVar.f349907g;
            cVar.f349903c.setOnClickListener(new C115365a());
            WalletCollectQrCodeUI.this.f345692h.f349894R.setOnClickListener(new C115366b());
        }

        /* renamed from: e */
        public View mo64133e() {
            return WalletCollectQrCodeUI.this.f345691g.f349903c;
        }

        public String getPath() {
            return "facingreceiveremerchantdot";
        }
    }

    /* renamed from: H7 */
    public static void m162103H7(WalletCollectQrCodeUI walletCollectQrCodeUI, int i) {
        if (i == 0) {
            i = walletCollectQrCodeUI.f345688d;
        } else {
            walletCollectQrCodeUI.getClass();
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[refreshContentAreaLayoutHeight]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = walletCollectQrCodeUI.mo175132X7(i);
        C116673y0.C116675c Y7 = walletCollectQrCodeUI.mo175133Y7(i);
        if (Y7.f349909i.getHeight() != 0) {
            X7.f349875y = (float) Y7.f349909i.getHeight();
        } else {
            X7.f349875y = (float) f345669T;
        }
    }

    /* renamed from: I7 */
    public static boolean m162104I7(WalletCollectQrCodeUI walletCollectQrCodeUI, int i) {
        if (i == 0) {
            i = walletCollectQrCodeUI.f345688d;
        } else {
            walletCollectQrCodeUI.getClass();
        }
        boolean z = true;
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[queryVoiceRingTone]，needRefreshType：%s", Integer.valueOf(i));
        if (i == 1) {
            return C113081b.yx0().Ax0();
        }
        if (i != 2) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
            return false;
        }
        C113081b.yx0().getClass();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_F2F_RING_TONE_MCH_STRING, "");
        Log.m105925i("MicroMsg.SubCoreCollect", "isF2fRingToneOpenMch : %s ", str);
        if (Util.isNullOrNil(str) || !str.equals("cash.caf")) {
            z = false;
        }
        return z;
    }

    /* renamed from: J7 */
    public static void m162105J7(WalletCollectQrCodeUI walletCollectQrCodeUI, String str) {
        C77426q qVar = new C77426q(walletCollectQrCodeUI.getContext());
        if (Util.isNullOrNil(str)) {
            str = walletCollectQrCodeUI.getContext().getString(C0966R.string.l_3);
        }
        qVar.mo107595g(str);
        qVar.mo107600l(new C117039q1(walletCollectQrCodeUI));
        qVar.mo107602n(walletCollectQrCodeUI.getContext().getString(C0966R.string.kke));
        qVar.mo107603o();
    }

    /* renamed from: K7 */
    public static void m162106K7(WalletCollectQrCodeUI walletCollectQrCodeUI, String str, String str2, int i, C49139df2 df22, C118461r00 r002, int i2) {
        int i3;
        Bitmap bitmap;
        WalletCollectQrCodeUI walletCollectQrCodeUI2 = walletCollectQrCodeUI;
        String str3 = str;
        if (i2 == 0) {
            i3 = walletCollectQrCodeUI2.f345688d;
        } else {
            walletCollectQrCodeUI.getClass();
            i3 = i2;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "【saveQrcodeToLocal] needRefreshType：%s", Integer.valueOf(i3));
        C116673y0.C116674b X7 = walletCollectQrCodeUI2.mo175132X7(i3);
        X7.getClass();
        X7.f349870t = i;
        X7.f349846M = df22;
        X7.f349844K = false;
        if (walletCollectQrCodeUI.mo175143g8(X7.f349861k, X7.f349863m, X7.f349865o, X7.f349864n)) {
            X7.f349869s = str3;
            bitmap = walletCollectQrCodeUI2.mo175125Q7(i3, str3, X7.f349848O, X7.f349870t);
            C115669n.INSTANCE.mo160131h(11343, 1, Integer.valueOf((int) Math.round(X7.f349861k * 100.0d)));
        } else {
            X7.f349868r = str3;
            bitmap = walletCollectQrCodeUI2.mo175125Q7(i3, str3, X7.f349848O, X7.f349870t);
            C115669n.INSTANCE.mo160131h(11343, 0);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "【mSaveQrcodeBitmap == null");
            C76701a.makeText((Context) walletCollectQrCodeUI.getContext(), (CharSequence) walletCollectQrCodeUI2.getString(C0966R.string.bhb), 1).show();
            C115669n.INSTANCE.mo160131h(25983, 17, Integer.valueOf(i3));
            return;
        }
        if (!walletCollectQrCodeUI2.f345705x) {
            walletCollectQrCodeUI2.f345705x = true;
            walletCollectQrCodeUI2.f345704w = ((ViewStub) walletCollectQrCodeUI2.findViewById(C0966R.C0970id.gzy)).inflate();
        }
        View view = walletCollectQrCodeUI2.f345704w;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "saveQrcodeToLocal", "(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/HalfPage;Lcom/tencent/mm/protocal/protobuf/CoverInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "saveQrcodeToLocal", "(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/mm/protocal/protobuf/HalfPage;Lcom/tencent/mm/protocal/protobuf/CoverInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((ImageView) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.ff_)).setImageBitmap(bitmap);
        TextView textView = (TextView) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.nsr);
        LinearLayout linearLayout = (LinearLayout) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.bii);
        ImageView imageView = (ImageView) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.fmp);
        RelativeLayout relativeLayout = (RelativeLayout) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.ff9);
        TextView textView2 = (TextView) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.fdu);
        TextView textView3 = (TextView) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.ff7);
        TextView textView4 = (TextView) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.nsq);
        TextView textView5 = (TextView) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.ff8);
        RelativeLayout relativeLayout2 = (RelativeLayout) walletCollectQrCodeUI2.f345704w.findViewById(C0966R.C0970id.f7q);
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(walletCollectQrCodeUI2, walletCollectQrCodeUI2.mo175142f8(i3), textView.getTextSize()));
        C75228t.m90240d(textView);
        textView.setTextSize(1, 17.0f);
        textView3.setTextSize(1, 13.0f);
        textView4.setTextSize(1, 13.0f);
        textView5.setTextSize(1, 24.0f);
        textView2.setTextSize(1, 24.0f);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams.width = C76577a.m92151b(walletCollectQrCodeUI.getContext(), WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED);
        layoutParams.height = C76577a.m92151b(walletCollectQrCodeUI.getContext(), WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED);
        if (X7.f349861k <= 0.0d || Util.isNullOrNil(walletCollectQrCodeUI2.mo175140d8(i3))) {
            layoutParams.topMargin = C76577a.m92151b(walletCollectQrCodeUI.getContext(), 16);
        } else {
            layoutParams.topMargin = C76577a.m92151b(walletCollectQrCodeUI.getContext(), 12);
        }
        relativeLayout2.setLayoutParams(layoutParams);
        walletCollectQrCodeUI2.mo175153q8(i3, textView3);
        walletCollectQrCodeUI2.mo175154r8(i3, textView4);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) relativeLayout2.getLayoutParams();
        layoutParams2.topMargin = C76577a.m92151b(walletCollectQrCodeUI2, 16);
        relativeLayout2.setLayoutParams(layoutParams2);
        if (X7.f349861k > 0.0d) {
            relativeLayout.setVisibility(0);
            textView5.setText(C75228t.m90260n(X7.f349861k));
            textView2.setText(walletCollectQrCodeUI2.mo175134Z7(0));
            if (textView3.getVisibility() == 0 && textView.getLineCount() >= 2) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams3.bottomMargin = C76577a.m92151b(walletCollectQrCodeUI2, 24);
                imageView.setLayoutParams(layoutParams3);
            }
        } else {
            relativeLayout.setVisibility(8);
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams4.bottomMargin = C76577a.m92151b(walletCollectQrCodeUI2, 32);
            imageView.setLayoutParams(layoutParams4);
        }
        ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(walletCollectQrCodeUI2, new C117058x0(walletCollectQrCodeUI, linearLayout, X7, r002, i3), new C8484y0(walletCollectQrCodeUI2, i3));
    }

    /* renamed from: L7 */
    public static void m162107L7(WalletCollectQrCodeUI walletCollectQrCodeUI, C49139df2 df22) {
        walletCollectQrCodeUI.getClass();
        C12925w wVar = new C12925w(walletCollectQrCodeUI);
        walletCollectQrCodeUI.f345679J = wVar;
        wVar.f36927f.setFocusable(false);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(walletCollectQrCodeUI).inflate(C0966R.C0971layout.atk, (ViewGroup) null);
        walletCollectQrCodeUI.f345679J.mo12471k(linearLayout);
        Button button = (Button) linearLayout.findViewById(C0966R.C0970id.amg);
        Button button2 = (Button) linearLayout.findViewById(C0966R.C0970id.alm);
        Button button3 = (Button) linearLayout.findViewById(C0966R.C0970id.aln);
        C118479xj3 xj32 = df22.f132289f;
        if (xj32 != null) {
            button2.setText(xj32.f354532d);
            button3.setText(df22.f132290g.f354532d);
            button2.setOnClickListener(new C117026g1(walletCollectQrCodeUI, df22));
            button3.setOnClickListener(new C117027h1(walletCollectQrCodeUI, df22));
        } else {
            button2.setVisibility(8);
            button3.setVisibility(8);
            button.setText(df22.f132290g.f354532d);
            button.setVisibility(0);
            button.setOnClickListener(new C117028i1(walletCollectQrCodeUI, df22));
        }
        ((TextView) linearLayout.findViewById(C0966R.C0970id.mjf)).setText(df22.f132287d.f144645e);
        if (df22.f132291h == 0) {
            TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.mje);
            textView.setVisibility(0);
            textView.setText(df22.f132288e);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(C0966R.C0970id.mjg);
            linearLayout2.setGravity(3);
            Iterator<String> it = df22.f132292i.iterator();
            while (it.hasNext()) {
                LinearLayout linearLayout3 = (LinearLayout) LayoutInflater.from(walletCollectQrCodeUI).inflate(C0966R.C0971layout.atj, (ViewGroup) null);
                ((TextView) linearLayout3.findViewById(C0966R.C0970id.g55)).setText(it.next());
                linearLayout2.addView(linearLayout3);
            }
        }
        walletCollectQrCodeUI.f345679J.mo5086o();
    }

    /* renamed from: M7 */
    public static void m162108M7(WalletCollectQrCodeUI walletCollectQrCodeUI, Context context, String str, int i, C118461r00 r002) {
        walletCollectQrCodeUI.getClass();
        Toast makeText = C76701a.makeText(context, (CharSequence) "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(i);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        new MMHandler().postDelayed(new C117035p1(walletCollectQrCodeUI, makeText, r002), 750);
    }

    /* renamed from: N7 */
    public static void m162109N7(WalletCollectQrCodeUI walletCollectQrCodeUI, C118479xj3 xj32) {
        WalletCollectQrCodeUI walletCollectQrCodeUI2 = walletCollectQrCodeUI;
        C118479xj3 xj33 = xj32;
        walletCollectQrCodeUI.getClass();
        if (xj33 == null) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", " buttonInfo == null");
            return;
        }
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[ClickButtonAction]，buttonInfoType:%s，mCollectType：%s", Integer.valueOf(xj33.f354533e), Integer.valueOf(walletCollectQrCodeUI2.f345688d));
        C116673y0.C116675c Y7 = walletCollectQrCodeUI2.mo175133Y7(0);
        switch (xj33.f354533e) {
            case 1:
                if (Y7.f349883G.isShown()) {
                    Y7.f349883G.setVisibility(8);
                }
                C101218e0 e0Var = walletCollectQrCodeUI2.f345673D;
                if (e0Var != null) {
                    e0Var.mo140680z();
                    break;
                }
                break;
            case 2:
                if (walletCollectQrCodeUI2.f345685Q == 1) {
                    C115669n.INSTANCE.mo160131h(25983, 12, Integer.valueOf(walletCollectQrCodeUI2.f345688d));
                }
                if (walletCollectQrCodeUI2.f345685Q == 2) {
                    C115669n.INSTANCE.mo160131h(25983, 15, Integer.valueOf(walletCollectQrCodeUI2.f345688d));
                }
                walletCollectQrCodeUI2.mo175130V7(0, (C118461r00) null);
                break;
            case 3:
                if (walletCollectQrCodeUI2.f345685Q == 2) {
                    C115669n.INSTANCE.mo160131h(25983, 14, Integer.valueOf(walletCollectQrCodeUI2.f345688d));
                }
                C75228t.m90219L(walletCollectQrCodeUI.getContext(), xj33.f354534f, true);
                break;
            case 4:
                C64761ux2 ux22 = xj33.f354535g;
                C75228t.m90224Q(ux22.f185807d, ux22.f185808e, 0, 1072);
                break;
            case 5:
                walletCollectQrCodeUI2.mo175159w8(xj33.f354536h);
                break;
            case 6:
                walletCollectQrCodeUI2.mo175130V7(0, xj33.f354536h);
                break;
            case 7:
                walletCollectQrCodeUI.mo175127S7();
                break;
            case 8:
                walletCollectQrCodeUI2.mo175130V7(0, (C118461r00) null);
                break;
            case 9:
                walletCollectQrCodeUI.finish();
                break;
            default:
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknow buttonInfo.type");
                break;
        }
        int i = walletCollectQrCodeUI2.f345685Q;
        if (i == 1 || i == 2) {
            C115669n.INSTANCE.mo160131h(20032, "wxface2face", "ClickHalfDialogButton", "", "", "", "", 4, 0, Integer.valueOf(xj33.f354533e), walletCollectQrCodeUI.mo175139c8(), Integer.valueOf(walletCollectQrCodeUI2.mo175141e8(0)), walletCollectQrCodeUI2.mo175140d8(0));
        } else if (i != 3) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknow clickButtonSource");
        } else {
            C115669n.INSTANCE.mo160131h(20032, "wxface2face", "ClickCoverPageButton", "", "", "", "", 5, 0, Integer.valueOf(xj33.f354533e), walletCollectQrCodeUI.mo175139c8(), Integer.valueOf(walletCollectQrCodeUI2.mo175141e8(0)), walletCollectQrCodeUI2.mo175140d8(0));
        }
    }

    /* renamed from: O7 */
    public static void m162110O7(WalletCollectQrCodeUI walletCollectQrCodeUI, int i) {
        if (i == 2) {
            walletCollectQrCodeUI.f345688d = 2;
            walletCollectQrCodeUI.f345692h.f349908h.setVisibility(0);
            walletCollectQrCodeUI.f345692h.f349903c.post(new C117031l1(walletCollectQrCodeUI));
            C115669n.INSTANCE.mo160131h(25983, 2, Integer.valueOf(i));
        } else {
            walletCollectQrCodeUI.f345688d = 1;
            walletCollectQrCodeUI.f345691g.f349908h.setVisibility(0);
            walletCollectQrCodeUI.f345691g.f349903c.post(new C117042r1(walletCollectQrCodeUI));
            C115669n.INSTANCE.mo160131h(25983, 1, Integer.valueOf(i));
        }
        walletCollectQrCodeUI.mo175129U7(i, false);
    }

    /* renamed from: P7 */
    public static void m162111P7(WalletCollectQrCodeUI walletCollectQrCodeUI, C116673y0.C116675c cVar) {
        walletCollectQrCodeUI.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{270.0f, 90.0f});
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C117046s1(walletCollectQrCodeUI, cVar));
        ofFloat.start();
        cVar.f349893Q.setVisibility(8);
        cVar.f349903c.callOnClick();
    }

    /* renamed from: Q7 */
    public final Bitmap mo175125Q7(int i, String str, String str2, int i2) {
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 206.0f);
        if (i == 2) {
            return C116648v0.m164515a(this, str, C75592q0.m90789s(), str2, true, fromDPToPix, this.f345687S, true, i2, 0.0f, false, 0.0d);
        }
        return C116648v0.m164515a(this, str, C75592q0.m90789s(), "", true, fromDPToPix, this.f345687S, false, i2, 0.0f, true, 0.0d);
    }

    /* renamed from: R7 */
    public final void mo175126R7(int i) {
        Bitmap bitmap = mo175132X7(i).f349871u;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[stopShortTermQrCodeTimer]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        MTimerHandler mTimerHandler = X7.f349834A;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            X7.f349834A = null;
        }
    }

    /* renamed from: S7 */
    public final void mo175127S7() {
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "doApplyQrCode，mCollectType：%s", Integer.valueOf(this.f345688d));
        if (this.f345688d != 2) {
            if (!mo175132X7(1).f349844K) {
                mo175130V7(1, (C118461r00) null);
            } else {
                new C45530e(mo175137b8(1)).mo9225i().mo123062e(new C115348k());
            }
        }
    }

    /* renamed from: T7 */
    public final void mo175128T7(int i) {
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[doGetQrCodeMchConfig] scene:%s", Integer.valueOf(i));
        if (i == 0) {
            mo175145j8(-1);
        }
        if (i == 0 || i == 2) {
            C116648v0.m164520f(this.f345692h, this.f345690f, getContext());
            new C45537i(0).mo9225i().mo123062e(new C115334a());
            return;
        }
        Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
    }

    /* renamed from: U7 */
    public final void mo175129U7(int i, boolean z) {
        boolean z2 = true;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[doGetShortTermQrcode]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        C116673y0.C116675c Y7 = mo175133Y7(i);
        long j = mo175143g8(X7.f349861k, X7.f349863m, X7.f349865o, X7.f349864n) ? X7.f349838E : X7.f349837D;
        long currentTimeMillis = System.currentTimeMillis();
        if (!z && currentTimeMillis - j < ((long) (((X7.f349876z * 1000) - 3000) - 500))) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "do not refresh：hardRefresh or overtime");
        } else if (!ProcessUIResumedStateOwner.INSTANCE.isForeground()) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "do not refresh：is not in Foreground");
        } else if (i == 1) {
            if (Y7.f349888L.getVisibility() == 0) {
                C116648v0.m164520f(Y7, X7, getContext());
            }
            X7.f349836C = false;
            mo175160x8(i);
            new C45532f(mo175141e8(i), mo175134Z7(i), mo175140d8(i), X7.f349865o, mo175135a8(i), 0).mo9225i().mo123062e(new C115356s(X7, i, Y7));
        } else if (i != 2) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
        } else {
            if (this.f345692h.f349901a.getVisibility() != 0) {
                z2 = false;
            }
            if (!z2) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "do not has mch code,retrun ");
                return;
            }
            if (Y7.f349888L.getVisibility() == 0) {
                C116648v0.m164520f(Y7, X7, getContext());
            }
            X7.f349836C = false;
            mo175160x8(i);
            new C45534g(mo175141e8(i), mo175134Z7(i), mo175140d8(i), X7.f349865o, mo175135a8(i), 0).mo9225i().mo123062e(new C115357t(X7, i, Y7));
        }
    }

    /* renamed from: V7 */
    public final void mo175130V7(int i, C118461r00 r002) {
        C118461r00 r003 = r002;
        int i2 = i == 0 ? this.f345688d : i;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[doSaveQrCode] mCollectType：%s", Integer.valueOf(i2));
        C116673y0.C116674b X7 = mo175132X7(i2);
        C77963l1 c = C113146l.m154805c();
        if (c == null) {
            c = new C77963l1();
        }
        if (i2 == 1) {
            new C58517j(X7.f349861k, X7.f349862l, X7.f349845L, c.f227796i, c.f227797j, String.valueOf(c.f227795h), mo175137b8(0), mo175140d8(i2), X7.f349865o, mo175135a8(i2)).mo9225i().mo123062e(new C115340d(r003, i2));
        } else if (i2 != 2) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
        } else {
            double d = X7.f349861k;
            new C58518k(d, X7.f349862l, X7.f349845L, c.f227796i, c.f227797j, String.valueOf(c.f227795h), mo175137b8(0), mo175140d8(i2), X7.f349865o, mo175135a8(i2)).mo9225i().mo123062e(new C115341e(r003, i2));
        }
    }

    /* renamed from: W7 */
    public final void mo175131W7(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[doSaveQrcodeNotify]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        int e8 = mo175141e8(i);
        String d8 = mo175140d8(i);
        int i2 = X7.f349872v;
        int i3 = i == 0 ? this.f345688d : i;
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[getQRCodeSaveUrl]，needRefreshType：%s", Integer.valueOf(i3));
        C116673y0.C116674b X72 = mo175132X7(i3);
        String str = "";
        if (mo175143g8(X72.f349861k, X72.f349863m, X72.f349865o, X72.f349864n)) {
            if (i2 == 1) {
                if (!Util.isNullOrNil(X72.f349859i)) {
                    str = X72.f349859i;
                }
            } else if (!Util.isNullOrNil(X72.f349869s)) {
                str = X72.f349869s;
            }
        } else if (i2 == 1) {
            if (!Util.isNullOrNil(X72.f349851a)) {
                str = X72.f349851a;
            }
        } else if (!Util.isNullOrNil(X72.f349868r)) {
            str = X72.f349868r;
        }
        C89349b b8 = mo175137b8(i);
        boolean z = X7.f349865o;
        String a8 = mo175135a8(i);
        if (i == 1) {
            new C58519l(X7.f349872v, e8, d8, str, b8, z, a8).mo9225i().mo123062e(new C115349l(this));
        } else if (i != 2) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknown type");
        } else {
            new C45540m(X7.f349872v, e8, d8, str, b8, z, a8).mo9225i().mo123062e(new C115350m(this));
        }
    }

    /* renamed from: X7 */
    public final C116673y0.C116674b mo175132X7(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        return i == 2 ? this.f345690f : this.f345689e;
    }

    /* renamed from: Y7 */
    public final C116673y0.C116675c mo175133Y7(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        return i == 2 ? this.f345692h : this.f345691g;
    }

    /* renamed from: Z7 */
    public String mo175134Z7(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[getCurrencyUnit]，needRefreshType：%s", Integer.valueOf(i));
        mo175132X7(i).f349862l = "CNY";
        return C75228t.m90266q("CNY");
    }

    /* renamed from: a8 */
    public final String mo175135a8(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[getSettingDescBottom]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        return !Util.isNullOrNil(X7.f349864n) ? X7.f349864n : "";
    }

    public void afterTextChanged(Editable editable) {
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "afterTextChanged，mCollectType：%s", Integer.valueOf(this.f345688d));
        if (this.f345688d != 2) {
            C116673y0.C116674b X7 = mo175132X7(1);
            if (editable == null || editable.toString().equals("")) {
                this.f345677H.mo140656b(false);
                return;
            }
            this.f345677H.mo140656b(true);
            if (editable.length() > 16) {
                PasterEditText pasterEditText = (PasterEditText) this.f345678I.findViewById(C0966R.C0970id.g59);
                pasterEditText.setText(editable.toString().substring(0, 16));
                String substring = editable.toString().substring(0, 16);
                X7.f349845L = substring;
                pasterEditText.setSelection(substring.length());
                return;
            }
            X7.f349845L = editable.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        r1 = r0.f349860j;
     */
    /* renamed from: b8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pe3.C89349b mo175137b8(int r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0004
            int r8 = r7.f345688d
        L_0x0004:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r0[r1] = r2
            java.lang.String r1 = "MicroMsg.WalletCollectQrCodeUI"
            java.lang.String r2 = "[getQRCodeSaveNotifyInfo]，needRefreshType：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r2, r0)
            e21.y0$b r0 = r7.mo175132X7(r8)
            double r2 = r0.f349861k
            java.lang.String r4 = r0.f349863m
            boolean r5 = r0.f349865o
            java.lang.String r6 = r0.f349864n
            r1 = r7
            boolean r1 = r1.mo175143g8(r2, r4, r5, r6)
            if (r1 == 0) goto L_0x0030
            pe3.b r1 = r0.f349860j
            if (r1 == 0) goto L_0x0030
            r2 = 2
            if (r8 != r2) goto L_0x0030
            return r1
        L_0x0030:
            pe3.b r8 = r0.f349852b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeUI.mo175137b8(int):pe3.b");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c8 */
    public final String mo175139c8() {
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "getQRCodePayUrl，mCollectType：%s", Integer.valueOf(this.f345688d));
        C116673y0.C116674b X7 = mo175132X7(0);
        return mo175143g8(X7.f349861k, X7.f349863m, X7.f349865o, X7.f349864n) ? Util.isNullOrNil(X7.f349859i) ? "" : X7.f349859i : Util.isNullOrNil(X7.f349851a) ? "" : X7.f349851a;
    }

    /* renamed from: d8 */
    public final String mo175140d8(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[getSettingDesc]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        return !Util.isNullOrNil(X7.f349863m) ? X7.f349863m : "";
    }

    /* renamed from: e8 */
    public final int mo175141e8(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "getSettingMoney，mCollectType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        C116673y0.C116675c Y7 = mo175133Y7(i);
        if (X7.f349861k <= 0.0d || Util.isNullOrNil(Y7.f349913m.mo105014a())) {
            return 0;
        }
        return C75228t.m90231X(X7.f349861k + "", "100");
    }

    /* renamed from: f8 */
    public final SpannableStringBuilder mo175142f8(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[getShowName] needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        if (Util.isNullOrNil(X7.f349853c)) {
            String q = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91335q();
            X7.f349853c = q;
            X7.f349853c = C75228t.m90270s(q);
        }
        if (i == 2) {
            Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.c4c);
            drawable.setBounds(0, 0, C74942w4.m89784a(getContext(), 44), C74942w4.m89784a(getContext(), 20));
            C76003c cVar = new C76003c(drawable, 1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X7.f349853c + "  ");
            spannableStringBuilder.setSpan(cVar, X7.f349853c.length() + 1, spannableStringBuilder.length(), 17);
            return spannableStringBuilder;
        }
        String r = C75228t.m90268r(C75592q0.m90789s());
        if (!Util.isNullOrNil(X7.f349853c)) {
            r = r + getString(C0966R.string.bgx, new Object[]{X7.f349853c});
        }
        return new SpannableStringBuilder(r);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
    }

    /* renamed from: g8 */
    public final boolean mo175143g8(double d, String str, boolean z, String str2) {
        boolean z2 = d > 0.0d;
        boolean z3 = !Util.isNullOrNil(str);
        boolean z4 = z || !Util.isNullOrNil(str2);
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "isFixedMode：fee：%s desc:%s desc_required:%s desc_placeholder:%s", Double.valueOf(d), str, Boolean.valueOf(z), str2);
        return z2 || z3 || z4;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b0l;
    }

    /* renamed from: i8 */
    public final void mo175144i8(C64774vi viVar) {
        if (viVar == null || !viVar.f185899d) {
            this.f345696o.setVisibility(8);
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "bottomEntrance == null || !bottomEntrance.need_show");
            return;
        }
        this.f345696o.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f345696o.getLayoutParams();
        if (this.f345692h.f349901a.getVisibility() == 0) {
            layoutParams.addRule(3, C0966R.C0970id.f5p);
        } else if (this.f345700s.getVisibility() == 0) {
            layoutParams.addRule(3, C0966R.C0970id.f5l);
        } else {
            layoutParams.addRule(3, C0966R.C0970id.f5q);
        }
        this.f345696o.setLayoutParams(layoutParams);
        C115669n.INSTANCE.mo160131h(25982, 7);
        int b = C76577a.m92151b(getContext(), 16);
        this.f345698q.mo100288c(viVar.f185901f, b, b, C0966R.raw.icon_outlined_collect_security);
        C118447nw2 nw22 = viVar.f185900e;
        this.f345699r.setText(nw22.f354150e);
        this.f345697p.setOnClickListener(new C115343g(nw22));
    }

    public void initView() {
        setMMTitle((int) C0966R.string.he7);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.f7z);
        this.f345693i = viewGroup;
        viewGroup.setBackgroundColor(getResources().getColor(C0966R.color.f2974b5));
        ((ScrollView) findViewById(C0966R.C0970id.f357740f82)).setBackgroundColor(getResources().getColor(C0966R.color.f2974b5));
        this.f345694j = (LinearLayout) findViewById(C0966R.C0970id.f7f);
        this.f345695n = (TextView) findViewById(C0966R.C0970id.f6u);
        this.f345696o = (LinearLayout) findViewById(C0966R.C0970id.mac);
        this.f345697p = (RelativeLayout) findViewById(C0966R.C0970id.moo);
        this.f345699r = (TextView) findViewById(C0966R.C0970id.mst);
        this.f345698q = (CdnImageView) findViewById(C0966R.C0970id.mad);
        C86709a0.m107528h();
        this.f345688d = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_COLLECT_TYPE_INT_SYNC, 1)).intValue();
        C116673y0.C116675c cVar = new C116673y0.C116675c();
        this.f345691g = cVar;
        cVar.mo180677a(findViewById(C0966R.C0970id.f5q), getContext(), 1);
        this.f345691g.f349882F = new C116648v0.C116655g(1, getContext(), this.f345689e, this.f345691g, this);
        this.f345691g.f349903c.setOnClickListener(new C115358u());
        this.f345691g.f349894R.setOnClickListener(new C115359v());
        C116673y0.C116675c cVar2 = new C116673y0.C116675c();
        this.f345692h = cVar2;
        cVar2.mo180677a(findViewById(C0966R.C0970id.f5p), getContext(), 2);
        this.f345692h.f349882F = new C116648v0.C116655g(2, getContext(), this.f345690f, this.f345692h, this);
        this.f345706y = new C115364z();
        ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f345706y);
        this.f345700s = (RelativeLayout) findViewById(C0966R.C0970id.f5l);
        this.f345701t = findViewById(C0966R.C0970id.f1o);
        this.f345702u = (TextView) findViewById(C0966R.C0970id.f5n);
        this.f345703v = (TextView) findViewById(C0966R.C0970id.f5k);
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this);
        this.f345680K = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = new C115360w();
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = "8";
        walletGetBulletinEvent.callback = new C68855x(walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
    }

    /* renamed from: j8 */
    public final void mo175145j8(int i) {
        int i2 = i;
        C116648v0.m164517c(this.f345690f);
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[checkMchEntranceView] entrance_type:%s", Integer.valueOf(this.f345690f.f349849P));
        int i3 = this.f345690f.f349849P;
        if (i3 == 2) {
            this.f345688d = 1;
            this.f345700s.setVisibility(0);
            View view = this.f345692h.f349901a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo175148m8(8);
            if (!Util.isNullOrNil(this.f345690f.f349850Q.f182423e)) {
                this.f345702u.setText(this.f345690f.f349850Q.f182423e);
            }
            if (!Util.isNullOrNil(this.f345690f.f349850Q.f182424f)) {
                this.f345703v.setText(this.f345690f.f349850Q.f182424f);
                this.f345703v.setVisibility(0);
            } else {
                this.f345703v.setVisibility(8);
            }
            C64761ux2 ux22 = this.f345690f.f349850Q.f182422d;
            if (ux22 != null) {
                Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "username:%s，page_path：%s", ux22.f185807d, ux22.f185808e);
                this.f345707z = new C115361y();
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f345707z);
                if (i2 == -1) {
                    return;
                }
                if (this.f345707z.f221863e.getVisibility() == 0) {
                    C115669n.INSTANCE.mo160131h(25982, 2);
                    return;
                }
                C115669n.INSTANCE.mo160131h(25982, 3);
            }
        } else if (i3 != 3) {
            if (i2 != -1) {
                C115669n.INSTANCE.mo160131h(25982, 1);
            }
            this.f345688d = 1;
            this.f345700s.setVisibility(8);
            View view3 = this.f345692h.f349901a;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo175148m8(8);
        } else {
            this.f345700s.setVisibility(8);
            if (!Util.isNullOrNil(this.f345690f.f349851a)) {
                View view5 = this.f345692h.f349901a;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo175150o8(2);
                mo175148m8(0);
                if (this.f345688d == 1) {
                    this.f345692h.f349903c.setBackgroundResource(C0966R.C0969drawable.a9w);
                    this.f345692h.f349902b.setBackgroundResource(C0966R.C0969drawable.a86);
                    this.f345692h.f349905e.setRotation(90.0f);
                    ViewGroup.LayoutParams layoutParams = this.f345692h.f349908h.getLayoutParams();
                    layoutParams.height = 0;
                    this.f345692h.f349908h.setLayoutParams(layoutParams);
                    this.f345690f.f349875y = (float) f345669T;
                    if (i2 != -1) {
                        if (this.f345706y.f221862d.getVisibility() == 0) {
                            C115669n.INSTANCE.mo160131h(25982, 4);
                        } else {
                            C115669n.INSTANCE.mo160131h(25982, 5);
                        }
                    }
                } else if (i2 != -1) {
                    C115669n.INSTANCE.mo160131h(25982, 6);
                }
                if (i2 != -1) {
                    mo175161y8(2);
                    this.f345690f.f349837D = System.currentTimeMillis();
                    C116648v0.m164518d(this.f345692h);
                    Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "[doGetVoiceSwitchMch]");
                    if (Util.isNullOrNil(this.f345690f.f349851a)) {
                        Log.m105920e("MicroMsg.WalletCollectQrCodeUI", "qrcode_url is null.");
                    } else {
                        new C45541n(1).mo9225i().mo123062e(new C117051u0(this));
                    }
                }
            } else {
                View view7 = this.f345692h.f349901a;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI", "refreshMchViewModel", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo175148m8(8);
            }
        }
    }

    /* renamed from: k8 */
    public void mo175146k8(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[refreshPayerInfoArea]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        C116673y0.C116675c Y7 = mo175133Y7(i);
        if (((LinkedList) X7.f349873w).size() <= 0) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "dataModel.payer_msg_List.size() <=  0");
            Y7.f349926z.setVisibility(8);
            return;
        }
        Y7.f349921u.setBackgroundResource(C0966R.C0969drawable.a_0);
        Y7.f349926z.setVisibility(0);
        double d = 0.0d;
        for (int i2 = 0; i2 < ((LinkedList) X7.f349873w).size(); i2++) {
            C116645t.C116647b bVar = (C116645t.C116647b) ((LinkedList) X7.f349873w).get(i2);
            if (bVar.f349759j == 1 && bVar.f349772s) {
                d += bVar.f349755f;
            }
        }
        if (d > 0.0d) {
            Y7.f349877A.setVisibility(0);
            Y7.f349880D.setText(C75228t.m90258m(d, ((C116645t.C116647b) ((LinkedList) X7.f349873w).get(0)).f349756g));
        } else {
            Y7.f349877A.setVisibility(8);
        }
        X7.f349874x.notifyDataSetChanged();
        Y7.f349881E.setVisibility(0);
    }

    /* renamed from: l8 */
    public final void mo175147l8(int i) {
        mo175150o8(1);
        C116673y0.C116674b bVar = new C116673y0.C116674b();
        C116648v0.m164517c(bVar);
        if (this.f345688d == 2 && !Util.isNullOrNil(bVar.f349851a)) {
            this.f345691g.f349903c.setBackgroundResource(C0966R.C0969drawable.a9w);
            this.f345691g.f349902b.setBackgroundResource(C0966R.C0969drawable.a86);
            this.f345691g.f349905e.setRotation(90.0f);
            ViewGroup.LayoutParams layoutParams = this.f345691g.f349908h.getLayoutParams();
            layoutParams.height = 0;
            this.f345691g.f349908h.setLayoutParams(layoutParams);
            this.f345689e.f349875y = (float) f345669T;
        }
    }

    /* renamed from: m8 */
    public final void mo175148m8(int i) {
        this.f345691g.f349902b.setVisibility(i);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f345691g.f349911k.getLayoutParams();
        layoutParams.topMargin = C76577a.m92151b(this, i == 0 ? 32 : 64);
        this.f345691g.f349911k.setLayoutParams(layoutParams);
        if (i == 8) {
            ViewGroup.LayoutParams layoutParams2 = this.f345691g.f349908h.getLayoutParams();
            layoutParams2.height = -2;
            this.f345691g.f349908h.setLayoutParams(layoutParams2);
            this.f345691g.f349908h.setBackgroundResource(C0966R.C0969drawable.a86);
            this.f345691g.f349909i.setBackgroundResource(C0966R.C0969drawable.a86);
            this.f345691g.f349910j.setBackgroundResource(C0966R.C0969drawable.a86);
            return;
        }
        this.f345691g.f349908h.setBackgroundResource(C0966R.C0969drawable.a9x);
        this.f345691g.f349909i.setBackgroundResource(C0966R.C0969drawable.a9x);
        this.f345691g.f349910j.setBackgroundResource(C0966R.C0969drawable.a9x);
    }

    /* renamed from: n8 */
    public final void mo175149n8(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[refreshQRCodeLayout] needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        C116673y0.C116675c Y7 = mo175133Y7(i);
        ((C119157j) C119157j.f356862d).mo183895z(new C115344h(X7, i, Y7));
    }

    /* renamed from: o7 */
    public void mo175115o7(C116644q0 q0Var) {
        boolean z;
        boolean z2 = true;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[onRecv PayerMsg]，newMsg.msgType：%s", Integer.valueOf(q0Var.f349762p));
        int i = q0Var.f349762p;
        if (i == 9 || i == 50) {
            int i2 = i == 50 ? 2 : 1;
            C116673y0.C116674b X7 = mo175132X7(i2);
            C116673y0.C116675c Y7 = mo175133Y7(i2);
            Vibrator vibrator = this.f345671B;
            if (vibrator != null) {
                vibrator.vibrate(50);
            }
            if (((long) q0Var.f349757h) < this.f345670A) {
                Log.m105918d("MicroMsg.WalletCollectQrCodeUI", "Recieve but time out ");
                return;
            }
            int i3 = 0;
            while (i3 < ((LinkedList) X7.f349873w).size()) {
                if (q0Var.f349759j == 0 && Util.nullAsNil(q0Var.f349753d).equals(((C116645t.C116647b) ((LinkedList) X7.f349873w).get(i3)).f349753d) && ((C116645t.C116647b) ((LinkedList) X7.f349873w).get(i3)).f349759j == 2) {
                    ((LinkedList) X7.f349873w).remove(i3);
                    ((LinkedList) X7.f349873w).add(i3, new C116645t.C116647b(q0Var));
                } else if (q0Var.f349754e.equals(((C116645t.C116647b) ((LinkedList) X7.f349873w).get(i3)).f349754e)) {
                    Log.m105926v("MicroMsg.WalletCollectQrCodeUI", "Duplicated msg, transId=" + q0Var.f349754e);
                    if (((C116645t.C116647b) ((LinkedList) X7.f349873w).get(i3)).f349759j == 0) {
                        ((C116645t.C116647b) ((LinkedList) X7.f349873w).get(i3)).f349759j = q0Var.f349759j;
                        ((C116645t.C116647b) ((LinkedList) X7.f349873w).get(i3)).f349755f = q0Var.f349755f;
                        ((C116645t.C116647b) ((LinkedList) X7.f349873w).get(i3)).f349756g = q0Var.f349756g;
                        if (q0Var.f349759j == 1) {
                            MMHandlerThread.postToMainThread(new C115346i(this, Y7, X7, i3));
                        }
                    }
                } else {
                    i3++;
                }
                z = true;
            }
            z = false;
            if (!z) {
                int i4 = 0;
                while (true) {
                    if (i4 >= ((LinkedList) X7.f349873w).size()) {
                        z2 = false;
                        break;
                    } else if (q0Var.f349757h > ((C116644q0) ((LinkedList) X7.f349873w).get(i4)).f349757h) {
                        ((LinkedList) X7.f349873w).add(i4, new C116645t.C116647b(q0Var));
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z2) {
                    ((LinkedList) X7.f349873w).add(new C116645t.C116647b(q0Var));
                }
            }
            if (X7.f349874x == null) {
                C116645t tVar = new C116645t(getContext(), i2);
                X7.f349874x = tVar;
                Y7.f349881E.setAdapter(tVar);
            }
            C116645t tVar2 = X7.f349874x;
            List<C116645t.C116647b> list = X7.f349873w;
            tVar2.f349766e = list;
            Y7.f349882F.f349784d = X7;
            if (((LinkedList) list).size() > 0) {
                MMHandlerThread.postToMainThread(new C115347j(Y7, i2));
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "not target type");
    }

    /* renamed from: o8 */
    public final void mo175150o8(int i) {
        int i2 = i == 0 ? this.f345688d : i;
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[refreshView]，needRefreshType：%s", Integer.valueOf(i2));
        if (Util.isNullOrNil(mo175132X7(i2).f349851a)) {
            Log.m105920e("MicroMsg.WalletCollectQrCodeUI", "[refreshView], qrcode_url is null.");
            return;
        }
        mo175149n8(i2);
        int i3 = i2 == 0 ? this.f345688d : i2;
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[setSaveCodeTv]，needRefreshType：%s", Integer.valueOf(i3));
        C116673y0.C116674b X7 = mo175132X7(i3);
        C116673y0.C116675c Y7 = mo175133Y7(i3);
        String string = getString(C0966R.string.bgy);
        C75228t.m90253j0(Y7.f349918r, string, 0, string.length(), new C7092q(6, (C7092q.C7093a) new C117045s0(this, X7, i3)), getContext());
        mo175157u8(i2);
        mo175156t8(i2);
        int i4 = i2 == 0 ? this.f345688d : i2;
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[refreshBottomLayout]，needRefreshType：%s", Integer.valueOf(i4));
        C116673y0.C116674b X72 = mo175132X7(i4);
        C116673y0.C116675c Y72 = mo175133Y7(i4);
        C118447nw2 nw22 = X72.f349858h;
        LinearLayout linearLayout = Y72.f349921u;
        CdnImageView cdnImageView = Y72.f349922v;
        TextView textView = Y72.f349923w;
        TextView textView2 = Y72.f349924x;
        ImageView imageView = Y72.f349925y;
        if (nw22 == null || Util.isNullOrNil(nw22.f354150e)) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "empty item return");
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            cdnImageView.setVisibility(8);
            textView.setText(nw22.f354150e);
            if (!Util.isNullOrNil(nw22.f354154i)) {
                textView2.setText(nw22.f354154i);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            if (nw22.f354155j == 1) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            linearLayout.setOnClickListener(new C117010a1(this, nw22, textView2, imageView));
            int i5 = nw22.f354149d;
            if (i5 == 1) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(14526, 1, 1, nw22.f354150e, "", "", "", 1);
                if (nw22.f354155j == 1) {
                    nVar.mo160131h(14526, 3, 1, nw22.f354150e, "", "", "", 1);
                }
            } else if (i5 == 2) {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo160131h(14526, 1, 2, nw22.f354150e, "", "", nw22.f354151f, 1);
                if (nw22.f354155j == 1) {
                    nVar2.mo160131h(14526, 3, 2, nw22.f354150e, "", "", nw22.f354151f, 1);
                }
            } else if (i5 == 3) {
                C115669n nVar3 = C115669n.INSTANCE;
                nVar3.mo160131h(14526, 1, 3, nw22.f354150e, nw22.f354152g, nw22.f354153h, "", 1);
                if (nw22.f354155j == 1) {
                    nVar3.mo160131h(14526, 3, 3, nw22.f354150e, nw22.f354152g, nw22.f354153h, "", 1);
                }
            }
        }
        mo175144i8(this.f345689e.f349841H);
        if (i2 == 0) {
            i2 = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[reportLocation]，needRefreshType：%s", Integer.valueOf(i2));
        C116673y0.C116674b X73 = mo175132X7(0);
        C77963l1 c = C113146l.m154805c();
        int i6 = X73.f349861k > 0.0d ? 33 : 32;
        if (c != null) {
            C115669n.INSTANCE.mo160131h(13447, Integer.valueOf(i6), c.f227796i, c.f227797j, X73.f349851a, Double.valueOf(X73.f349861k), Long.valueOf(Util.nowSecond()), Long.valueOf(c.f227795h), c.f227798n, c.f227799o);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[onActivityResult]，mCollectType：%s", Integer.valueOf(this.f345688d));
        int i3 = this.f345688d;
        if (intent != null) {
            i3 = intent.getIntExtra("key_type", i3);
            if (i3 == 0) {
                i3 = this.f345688d;
            }
            intent.putExtra("key_type", i3);
        }
        C116673y0.C116674b X7 = mo175132X7(i3);
        if (i == 4096) {
            if (i2 != -1 || intent == null) {
                mo175152p8(X7);
                this.f345686R = 2;
            } else {
                mo175155s8(intent);
            }
            mo175149n8(i3);
        } else if (i == 4097) {
            C75592q0.m90781k();
            X7.getClass();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.he7);
        setIsDarkActionbarBg(true);
        setNavigationbarColor(getResources().getColor(C0966R.color.f2974b5));
        getContentView().setBackgroundColor(getResources().getColor(C0966R.color.f2974b5));
        setActionbarColor(getResources().getColor(C0966R.color.f2974b5));
        setActionbarElementColor(getResources().getColor(C0966R.color.f2975b6));
        hideActionbarLine();
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        setBackBtn(new C117014c1(this));
        initView();
        int b = C76577a.m92151b(this, 49);
        int b2 = C76577a.m92151b(this, WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC);
        f345669T = b + b2 + C76577a.m92151b(this, 77) + C76577a.m92151b(this, 60);
        this.f345689e = new C116673y0.C116674b();
        this.f345690f = new C116673y0.C116674b();
        Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "[doGetQrCodeConfig]");
        C116673y0.C116674b bVar = this.f345689e;
        Log.m105924i("MicroMsg.WalletCollectQrCodeLogic", "[getPersonalConfig]");
        C118466sp spVar = new C118466sp();
        String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WX_PAY_COLLECT_QRCODE_CONFIG_STRING_SYNC, (Object) null);
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeLogic", "getConfig failed");
        } else {
            try {
                spVar.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                Log.m105924i("MicroMsg.WalletCollectQrCodeLogic", "getConfig success");
            } catch (Exception e) {
                Log.m105920e("MicroMsg.WalletCollectQrCodeLogic", "parse fail, " + e.getLocalizedMessage());
            }
        }
        C116673y0.m164541a(bVar, spVar, (C118460qp) null);
        if (!Util.isNullOrNil(this.f345689e.f349851a)) {
            mo175147l8(-1);
        }
        C116648v0.m164520f(this.f345691g, this.f345689e, getContext());
        new C45536h().mo9225i().mo123062e(new C117052u1(this));
        mo175128T7(0);
        this.f345672C = C75592q0.m90781k();
        this.f345671B = (Vibrator) getSystemService("vibrator");
        this.f345670A = Util.nowSecond();
        C116642q zx02 = C113081b.yx0().zx0();
        if (!((LinkedList) zx02.f349752d).contains(this)) {
            ((LinkedList) zx02.f349752d).add(this);
        }
        C115669n.INSTANCE.mo160131h(14021, 2, Integer.valueOf(getIntent().getIntExtra("key_from_scene", 1)));
        C75136r0.m90122d(16, 0);
    }

    public void onDestroy() {
        Class cls = C109759g.class;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[onDestroy]，mCollectType：%s", Integer.valueOf(this.f345688d));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_COLLECT_TYPE_INT_SYNC, Integer.valueOf(this.f345688d));
        mo175126R7(2);
        mo175126R7(1);
        this.f345671B.cancel();
        ((LinkedList) C113081b.yx0().zx0().f349752d).remove(this);
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this.f345687S);
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175776r(this.f345706y);
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175776r(this.f345707z);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
    }

    public void onResume() {
        super.onResume();
        ScreenShotUtil.setScreenShotCallback(this, this);
        this.f345680K.mo104022e();
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[checkShortTermQrCodeTiming]，pageScene：%s", Integer.valueOf(this.f345686R));
        if (this.f345686R != 2) {
            this.f345686R = 2;
            return;
        }
        mo175129U7(1, false);
        mo175129U7(2, false);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void onScreenShot(String str, long j) {
        C77426q qVar;
        C101218e0 e0Var;
        C12925w wVar;
        C77398g gVar;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[onScreenShot]，mCollectType：%s", Integer.valueOf(this.f345688d));
        C116673y0.C116674b X7 = mo175132X7(0);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(25983, 11, Integer.valueOf(this.f345688d));
        nVar.mo160131h(13944, 9);
        if (X7.f349855e != null) {
            nVar.mo160131h(20032, "wxface2face", "ScreenShot", "", "", "", "", 1, Integer.valueOf(X7.f349855e.f354516d), 0, mo175139c8(), Integer.valueOf(mo175141e8(0)), mo175140d8(0));
        }
        C77407n nVar2 = this.f345676G;
        if ((nVar2 == null || !nVar2.mo107563h()) && (((qVar = this.f345675F) == null || (gVar = qVar.f225839c) == null || !gVar.isShowing()) && (((e0Var = this.f345677H) == null || !e0Var.mo140661h()) && ((wVar = this.f345679J) == null || !wVar.mo12466f())))) {
            mo175158v8(X7.f349855e);
            X7.f349872v = 1;
            mo175131W7(this.f345688d);
            mo175129U7(this.f345688d, true);
            return;
        }
        Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "helper.isShowing() || isShowTips, do not showScreen Action");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f345680K.mo104022e();
        }
    }

    /* renamed from: p8 */
    public final void mo175152p8(C116673y0.C116674b bVar) {
        bVar.f349859i = "";
        bVar.f349861k = 0.0d;
        bVar.f349863m = "";
        bVar.f349864n = "";
        bVar.f349865o = false;
        bVar.f349860j = null;
    }

    /* renamed from: q8 */
    public final void mo175153q8(int i, TextView textView) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[setDesc]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        if (!Util.isNullOrNil(X7.f349863m)) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), X7.f349863m, textView.getTextSize()));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: r8 */
    public final void mo175154r8(int i, TextView textView) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[setDescPlaceholder]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        String str = X7.f349864n;
        if (X7.f349865o && Util.isNullOrNil(str)) {
            str = getString(C0966R.string.ncn);
        }
        if (!Util.isNullOrNil(str)) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), str, textView.getTextSize()));
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: s8 */
    public final void mo175155s8(Intent intent) {
        Intent intent2 = intent;
        Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "setMoneyResult");
        int intExtra = intent2.getIntExtra("key_type", this.f345688d);
        C116673y0.C116674b X7 = mo175132X7(intExtra);
        double i = C75228t.m90250i("" + intent2.getIntExtra("ftf_fixed_fee", 0), "100", 2, RoundingMode.HALF_UP);
        String stringExtra = intent2.getStringExtra("ftf_fixed_desc");
        String stringExtra2 = intent2.getStringExtra("ftf_fixed_desc_placeholder");
        boolean booleanExtra = intent2.getBooleanExtra("ftf_fixed_desc_required", false);
        boolean z = booleanExtra;
        String str = stringExtra2;
        if (mo175143g8(i, stringExtra, booleanExtra, stringExtra2)) {
            X7.f349859i = intent2.getStringExtra("ftf_pay_url");
            X7.f349866p = intent2.getIntExtra("key_error_level", -1);
            X7.f349861k = i;
            X7.f349862l = intent2.getStringExtra("ftf_fixed_fee_type");
            X7.f349867q = intent2.getStringExtra("key_currency_unit");
            X7.f349863m = stringExtra;
            if (!Util.isNullOrNil(stringExtra)) {
                C115669n.INSTANCE.mo160131h(25983, 5, Integer.valueOf(intExtra));
            } else {
                C115669n.INSTANCE.mo160131h(25983, 4, Integer.valueOf(intExtra));
            }
            X7.f349864n = str;
            X7.f349865o = z;
            if (intExtra == 2) {
                String stringExtra3 = intent2.getStringExtra("key_save_notify_info");
                if (!Util.isNullOrNil(stringExtra3)) {
                    X7.f349860j = new C89349b(stringExtra3.getBytes());
                }
            }
            X7.f349838E = System.currentTimeMillis();
        } else {
            X7.f349851a = intent2.getStringExtra("ftf_pay_url");
            X7.f349854d = intent2.getIntExtra("key_error_level", -1);
            X7.f349837D = System.currentTimeMillis();
            if (intExtra == 2) {
                String stringExtra4 = intent2.getStringExtra("key_save_notify_info");
                if (!Util.isNullOrNil(stringExtra4)) {
                    X7.f349852b = new C89349b(stringExtra4.getBytes());
                }
            }
            mo175152p8(X7);
        }
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "setMoneyResult，url：%s，fee：%s ，desc：%s ，desc：placeholder：%s", X7.f349859i, Double.valueOf(X7.f349861k), X7.f349863m, X7.f349864n);
        if (!X7.f349842I) {
            int i2 = intExtra == 0 ? this.f345688d : intExtra;
            Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[setClearMoneyTv]，needRefreshType：%s", Integer.valueOf(i2));
            C116673y0.C116674b X72 = mo175132X7(i2);
            C116673y0.C116675c Y7 = mo175133Y7(i2);
            String string = getString(C0966R.string.bgm);
            C75228t.m90253j0(Y7.f349919s, string, 0, string.length(), new C7092q(6, (C7092q.C7093a) new C117049t0(this, X72, i2)), getContext());
        }
        mo175161y8(intExtra);
    }

    /* renamed from: t8 */
    public final void mo175156t8(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[setMoreSettingTv]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        C116673y0.C116675c Y7 = mo175133Y7(i);
        LinkedList<C118447nw2> linkedList = X7.f349857g;
        if (linkedList == null) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "menuItems == null");
            return;
        }
        String string = getString(C0966R.string.bt_);
        C75228t.m90253j0(Y7.f349920t, string, 0, string.length(), new C7092q(6, (C7092q.C7093a) new C115337c(i, linkedList)), getContext());
        for (C118447nw2 next : linkedList) {
            int i2 = next.f354149d;
            if (i2 == 1) {
                C115669n.INSTANCE.mo160131h(14526, 2, 1, next.f354150e, "", "", "", 1);
            } else if (i2 == 2) {
                C115669n.INSTANCE.mo160131h(14526, 2, 2, next.f354150e, "", "", next.f354151f, 1);
            } else if (i2 == 3) {
                C115669n.INSTANCE.mo160131h(14526, 2, 3, next.f354150e, next.f354152g, next.f354153h, "", 1);
            }
        }
    }

    /* renamed from: u8 */
    public final void mo175157u8(int i) {
        if (i == 0) {
            i = this.f345688d;
        }
        C116673y0.C116674b X7 = mo175132X7(i);
        C116673y0.C116675c Y7 = mo175133Y7(i);
        String string = X7.f349842I ? getString(C0966R.string.n0s) : getString(C0966R.string.bgl);
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[setSetMoneyTv]，needRefreshType：%s, receive_option_entrance:%s ", Integer.valueOf(i), Boolean.valueOf(X7.f349842I));
        C75228t.m90253j0(Y7.f349919s, string, 0, string.length(), new C7092q(6, (C7092q.C7093a) new C115335b(X7, i)), getContext());
    }

    /* renamed from: v8 */
    public final void mo175158v8(C118477wj3 wj32) {
        C101218e0 e0Var;
        if (wj32 == null) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "actionInfo is null");
            return;
        }
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "actionInfo.action_type：%s", Integer.valueOf(wj32.f354516d));
        int i = wj32.f354516d;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            C49139df2 df22 = wj32.f354517e;
            if (df22 == null || ((e0Var = this.f345673D) != null && e0Var.mo140661h())) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "mHalfBottomDialog != null || mHalfBottomDialog.isShowing() || halfPage == null ");
                return;
            }
            C77407n nVar = this.f345674E;
            if (nVar == null || !nVar.mo107563h()) {
                Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[showHalfDialog]，mCollectType：%s", Integer.valueOf(this.f345688d));
                C116673y0.C116674b X7 = mo175132X7(0);
                C118479xj3 xj32 = df22.f132289f;
                C118479xj3 xj33 = df22.f132290g;
                X7.f349872v = 4;
                C101218e0 e0Var2 = new C101218e0(getContext(), 1, 3);
                this.f345673D = e0Var2;
                e0Var2.mo140667n(xj32.f354532d, xj33.f354532d);
                C101218e0 e0Var3 = this.f345673D;
                C117029j1 j1Var = new C117029j1(this, X7, xj32);
                C117030k1 k1Var = new C117030k1(this, X7, xj33);
                e0Var3.f296373D = j1Var;
                e0Var3.f296374E = k1Var;
                if (df22.f132287d.f144644d == 2) {
                    View inflate = View.inflate(getContext(), C0966R.C0971layout.f7022v7, (ViewGroup) null);
                    ((ImageView) inflate.findViewById(C0966R.C0970id.f357486a34)).setOnClickListener(new C117032m1(this));
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f357731bh3);
                    textView.setText(df22.f132287d.f144645e);
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    this.f345673D.mo140672r(inflate);
                } else {
                    View inflate2 = View.inflate(getContext(), C0966R.C0971layout.f7021v6, (ViewGroup) null);
                    TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.et6);
                    textView2.setText(df22.f132287d.f144645e);
                    C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                    this.f345673D.mo140672r(inflate2);
                }
                View inflate3 = View.inflate(getContext(), C0966R.C0971layout.f7020v5, (ViewGroup) null);
                ((TextView) inflate3.findViewById(C0966R.C0970id.f358384et2)).setText(df22.f132288e);
                this.f345673D.mo140663j(inflate3);
                this.f345673D.mo140655A();
                return;
            }
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "mBottomSheet != null && mBottomSheet.isShowing()");
        } else if (i == 2) {
            mo175159w8(wj32.f354518f);
        } else if (i != 3) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "unknow actionInfo.action_type");
        } else {
            C51549ui uiVar = wj32.f354519g;
            if (uiVar == null) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", " bottomCell == null");
                return;
            }
            Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[showBottomCell]，mCollectType：%s", Integer.valueOf(this.f345688d));
            this.f345674E = new C77407n((Context) getContext(), 1, true);
            TextView textView3 = new TextView(getContext());
            textView3.setGravity(17);
            textView3.setHeight(C76577a.m92151b(getContext(), 56));
            textView3.setTextSize(12.0f);
            textView3.setTextColor(getResources().getColor(C0966R.color.FG_1));
            if (!Util.isNullOrNil(uiVar.f142862d)) {
                textView3.setText(uiVar.f142862d);
                this.f345674E.mo107569n(textView3, false);
                this.f345674E.f225784p1 = true;
            }
            C77407n nVar2 = this.f345674E;
            nVar2.f225771i = new C117033n1(this, uiVar);
            nVar2.f225782p = new C117034o1(this, uiVar);
            nVar2.mo107573q();
        }
    }

    /* renamed from: w8 */
    public final void mo175159w8(C118461r00 r002) {
        if (r002 == null) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeUI", " coverInfo == null");
            return;
        }
        Log.m105919d("MicroMsg.WalletCollectQrCodeUI", "[showCoverUI]，mCollectType：%s", Integer.valueOf(this.f345688d));
        C116673y0.C116675c Y7 = mo175133Y7(0);
        Y7.f349883G.setVisibility(0);
        Y7.f349883G.setOnClickListener(new C115351n(this));
        ViewGroup.LayoutParams layoutParams = Y7.f349883G.getLayoutParams();
        layoutParams.height = (Y7.f349910j.getHeight() - Y7.f349921u.getHeight()) - C76577a.m92151b(getContext(), 1);
        Y7.f349883G.setLayoutParams(layoutParams);
        Y7.f349885I.setText(r002.f354294d);
        Y7.f349886J.setText(r002.f354295e.f354532d);
        Y7.f349886J.setOnClickListener(new C115352o(r002));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) Y7.f349884H.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) Y7.f349886J.getLayoutParams();
        if (r002.f354297g == 0) {
            layoutParams2.topMargin = C76577a.m92151b(getContext(), 36);
            layoutParams3.topMargin = C76577a.m92151b(getContext(), 36);
            Y7.f349887K.setVisibility(0);
            Y7.f349887K.setText(r002.f354296f.f354532d);
            Y7.f349887K.setOnClickListener(new C115353p(r002));
        } else {
            if (Y7.f349902b.getVisibility() == 0) {
                layoutParams2.topMargin = C76577a.m92151b(getContext(), 48);
            } else {
                layoutParams2.topMargin = C76577a.m92151b(getContext(), 80);
            }
            layoutParams3.topMargin = C76577a.m92151b(getContext(), 64);
            Y7.f349887K.setVisibility(8);
        }
        Y7.f349884H.setLayoutParams(layoutParams2);
        Y7.f349886J.setLayoutParams(layoutParams3);
    }

    /* renamed from: x8 */
    public final void mo175160x8(int i) {
        boolean z = true;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[startShortTermQrCodeErrorTimer]，needRefreshType：%s", Integer.valueOf(i));
        C116673y0.C116674b X7 = mo175132X7(i);
        C116673y0.C116675c Y7 = mo175133Y7(i);
        if (i == 2) {
            if (this.f345692h.f349901a.getVisibility() != 0) {
                z = false;
            }
            if (!z) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "do not has mch code,return");
                return;
            }
        }
        MTimerHandler mTimerHandler = X7.f349835B;
        if (mTimerHandler == null) {
            X7.f349835B = new MTimerHandler(new C115355r(X7, Y7), false);
        } else {
            mTimerHandler.stopTimer();
        }
        X7.f349835B.startTimer(3000);
    }

    /* renamed from: y8 */
    public final void mo175161y8(int i) {
        C116673y0.C116674b X7 = mo175132X7(i);
        boolean z = true;
        Log.m105925i("MicroMsg.WalletCollectQrCodeUI", "[startShortTermQrCodeTimer]，needRefreshType：%s dataModel.refresh_url_interval:%s", Integer.valueOf(i), Integer.valueOf(X7.f349876z));
        if (i == 2) {
            if (this.f345692h.f349901a.getVisibility() != 0) {
                z = false;
            }
            if (!z) {
                Log.m105924i("MicroMsg.WalletCollectQrCodeUI", "do not has mch code，return");
                return;
            }
        }
        MTimerHandler mTimerHandler = X7.f349834A;
        if (mTimerHandler == null) {
            X7.f349834A = new MTimerHandler(new C115354q(i), false);
        } else {
            mTimerHandler.stopTimer();
        }
        if (X7.f349876z < 60) {
            X7.f349876z = 60;
        }
        X7.f349834A.startTimer((long) (X7.f349876z * 1000));
    }
}
