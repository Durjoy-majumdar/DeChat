package com.tencent.p014mm.plugin.collect.p038ui;

import a21.C0006b;
import a63.C67008a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import b21.C113081b;
import b63.C113146l;
import b63.C67203r0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.edittext.PasterEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.collect.model.voice.F2fRcvVoiceOffLineLogic;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletPreferenceUI;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import de3.C75355a0;
import di3.C86312j;
import e21.C116641h0;
import e21.C116642q;
import e21.C116644q0;
import e21.C116657x;
import e21.C45530e;
import e21.C58516i0;
import e21.C58517j;
import e21.C75484o;
import e21.C75489r;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import g62.C32330n;
import h21.C117009a0;
import h21.C117011b0;
import h21.C117013c0;
import h21.C117015d0;
import h21.C117019e0;
import h21.C117022f0;
import h21.C117025g0;
import h21.C117047t;
import h21.C117053v;
import h21.C117055w;
import h21.C117057x;
import h21.C117060y;
import h21.C117061z;
import h21.C59749u;
import h21.C8482h0;
import hp3.C87581a;
import j20.C117292a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p159gw.C98250h;
import p196ln.C76705f;
import p281yz.C79173v;
import p629ny.C76979h;
import p755xs.C102720b;
import p910lj.C76701a;
import pe3.C89349b;
import pj3.C47511g;
import qo3.C101218e0;
import qo3.C12925w;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77407n;
import qo3.C77426q;
import tc0.C77885p;
import te3.C118447nw2;
import te3.C118461r00;
import te3.C118466sp;
import te3.C118477wj3;
import te3.C118479xj3;
import te3.C48745ap;
import te3.C49139df2;
import te3.C51549ui;
import te3.C51582uq;
import te3.C64334dz2;
import te3.C64761ux2;
import te3.C77963l1;
import yq3.C79148e;

@C86737h0
@C88989a(0)
/* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI */
public class CollectMainUI extends WalletPreferenceUI implements C116642q.C116643a, ScreenShotUtil.ScreenShotCallback, C11385n, TextWatcher {

    /* renamed from: A1 */
    public static int f345565A1 = -1;

    /* renamed from: B1 */
    public static int f345566B1 = -1;

    /* renamed from: z1 */
    public static int f345567z1;

    /* renamed from: A */
    public ScrollView f345568A = null;

    /* renamed from: B */
    public boolean f345569B = false;

    /* renamed from: C */
    public View f345570C = null;

    /* renamed from: D */
    public ImageView f345571D;

    /* renamed from: E */
    public TextView f345572E;

    /* renamed from: F */
    public TextView f345573F;

    /* renamed from: G */
    public TextView f345574G;

    /* renamed from: H */
    public LinearLayout f345575H;

    /* renamed from: I */
    public TextView f345576I;

    /* renamed from: J */
    public RelativeLayout f345577J;

    /* renamed from: K */
    public Bitmap f345578K = null;

    /* renamed from: L */
    public String f345579L = null;

    /* renamed from: M */
    public String f345580M = null;

    /* renamed from: N */
    public String f345581N = null;

    /* renamed from: P */
    public String f345582P = null;

    /* renamed from: Q */
    public int f345583Q;

    /* renamed from: Q0 */
    public C116657x f345584Q0;

    /* renamed from: R */
    public List<C115332s> f345585R = new LinkedList();

    /* renamed from: R0 */
    public int f345586R0 = 0;

    /* renamed from: S */
    public double f345587S;

    /* renamed from: S0 */
    public String f345588S0;

    /* renamed from: T */
    public String f345589T = null;

    /* renamed from: T0 */
    public String f345590T0;

    /* renamed from: U */
    public String f345591U = null;

    /* renamed from: U0 */
    public String f345592U0;

    /* renamed from: V */
    public boolean f345593V = false;

    /* renamed from: V0 */
    public CdnImageView f345594V0;

    /* renamed from: W */
    public long f345595W;

    /* renamed from: W0 */
    public TextView f345596W0;

    /* renamed from: X */
    public View f345597X;

    /* renamed from: X0 */
    public TextView f345598X0;

    /* renamed from: Y */
    public C115333t f345599Y = new C115333t((C115317d) null);

    /* renamed from: Y0 */
    public ImageView f345600Y0;

    /* renamed from: Z */
    public SpannableStringBuilder f345601Z;

    /* renamed from: Z0 */
    public ViewGroup f345602Z0;

    /* renamed from: a1 */
    public View f345603a1;

    /* renamed from: b1 */
    public C118477wj3 f345604b1;

    /* renamed from: c1 */
    public C118477wj3 f345605c1;

    /* renamed from: d1 */
    public LinearLayout f345606d1;

    /* renamed from: e1 */
    public TextView f345607e1;

    /* renamed from: f1 */
    public TextView f345608f1;

    /* renamed from: g */
    public int f345609g;

    /* renamed from: g1 */
    public TextView f345610g1;

    /* renamed from: h */
    public int f345611h;

    /* renamed from: h1 */
    public C89349b f345612h1;

    /* renamed from: i */
    public C101218e0 f345613i;

    /* renamed from: i1 */
    public C77426q f345614i1;

    /* renamed from: j */
    public C77407n f345615j;

    /* renamed from: j1 */
    public C77407n f345616j1;

    /* renamed from: k1 */
    public C101218e0 f345617k1;

    /* renamed from: l1 */
    public View f345618l1;

    /* renamed from: m1 */
    public C75489r f345619m1;

    /* renamed from: n */
    public Vibrator f345620n;

    /* renamed from: n1 */
    public C48745ap f345621n1;

    /* renamed from: o */
    public ImageView f345622o = null;

    /* renamed from: o1 */
    public boolean f345623o1;

    /* renamed from: p */
    public TextView f345624p = null;

    /* renamed from: p0 */
    public SpannableStringBuilder f345625p0;

    /* renamed from: p1 */
    public String f345626p1;

    /* renamed from: q */
    public WalletTextView f345627q = null;

    /* renamed from: q1 */
    public C49139df2 f345628q1;

    /* renamed from: r */
    public TextView f345629r = null;

    /* renamed from: r1 */
    public C12925w f345630r1;

    /* renamed from: s */
    public TextView f345631s = null;

    /* renamed from: s1 */
    public KeyboardHeightProvider f345632s1;

    /* renamed from: t */
    public TextView f345633t = null;

    /* renamed from: t1 */
    public int f345634t1;

    /* renamed from: u */
    public RelativeLayout f345635u = null;

    /* renamed from: u1 */
    public int f345636u1;

    /* renamed from: v */
    public View f345637v = null;

    /* renamed from: v1 */
    public boolean f345638v1;

    /* renamed from: w */
    public TextView f345639w = null;

    /* renamed from: w1 */
    public boolean f345640w1;

    /* renamed from: x */
    public C47511g f345641x = null;

    /* renamed from: x0 */
    public int f345642x0;

    /* renamed from: x1 */
    public boolean f345643x1;

    /* renamed from: y */
    public View f345644y = null;

    /* renamed from: y0 */
    public long f345645y0;

    /* renamed from: y1 */
    public C102720b.C78973a f345646y1 = new C68848l();

    /* renamed from: z */
    public View f345647z = null;

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$b */
    public class C55590b implements Runnable {
        public C55590b() {
        }

        public void run() {
            int b = C76577a.m92151b(CollectMainUI.this.getContext(), 37);
            ViewGroup.LayoutParams layoutParams = CollectMainUI.this.f345597X.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = b;
                CollectMainUI.this.f345597X.setLayoutParams(layoutParams);
                CollectMainUI.this.f345597X.requestLayout();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$a */
    public class C68846a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WalletGetBulletinEvent f197815d;

        public C68846a(WalletGetBulletinEvent walletGetBulletinEvent) {
            this.f197815d = walletGetBulletinEvent;
        }

        public void run() {
            if (!Util.isNullOrNil(this.f197815d.f79043e.f79046a)) {
                WalletGetBulletinEvent.C28848b bVar = this.f197815d.f79043e;
                C75228t.m90247g0((View) null, (TextView) CollectMainUI.this.findViewById(C0966R.C0970id.a7l), bVar.f79046a, bVar.f79047b, bVar.f79048c);
                return;
            }
            Log.m105924i("MicroMsg.CollectMainUI", "no bulletin data");
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$i */
    public class C68847i implements C47883u {
        public C68847i(CollectMainUI collectMainUI) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$l */
    public class C68848l implements C102720b.C78973a {
        public C68848l() {
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            String str2;
            if (str != null && (str2 = CollectMainUI.this.f345588S0) != null && str.equals(str2)) {
                Log.m105925i("MicroMsg.CollectMainUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", CollectMainUI.this.f345588S0, str);
                CollectMainUI.this.mo94701a8();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$o */
    public class C68849o implements C72476y0.C72477a {
        public C68849o() {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            Intent intent = new Intent();
            intent.setClass(CollectMainUI.this.getContext(), CollectCreateQRCodeNewUI.class);
            intent.putExtra("key_currency_unit", CollectMainUI.this.f345581N);
            CollectMainUI.this.startActivityForResult(intent, 4096);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$c */
    public class C115316c implements Runnable {
        public C115316c() {
        }

        public void run() {
            CollectMainUI collectMainUI = CollectMainUI.this;
            int i = CollectMainUI.f345567z1;
            collectMainUI.mo175107Z7();
            CollectMainUI.this.f345599Y.mo175124a();
            CollectMainUI.this.mo175111c8();
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$d */
    public class C115317d implements C7020t0 {
        public C115317d() {
        }

        /* renamed from: Q1 */
        public void mo531Q1(int i, boolean z) {
            CollectMainUI collectMainUI = CollectMainUI.this;
            collectMainUI.f345638v1 = i > 0;
            C101218e0 e0Var = collectMainUI.f345617k1;
            if (e0Var != null && e0Var.mo140661h()) {
                int i2 = C75044y4.m89990b(CollectMainUI.this.getContext()).y;
                if (i <= 0) {
                    CollectMainUI collectMainUI2 = CollectMainUI.this;
                    if (collectMainUI2.f345640w1) {
                        collectMainUI2.f345617k1.mo140674t(collectMainUI2.f345636u1);
                    } else {
                        collectMainUI2.f345617k1.mo140674t(collectMainUI2.f345634t1);
                    }
                } else if (i * 2 < i2) {
                    CollectMainUI collectMainUI3 = CollectMainUI.this;
                    collectMainUI3.f345617k1.mo140674t((i2 - C76577a.m92151b(collectMainUI3.getContext(), 56)) - i);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$e */
    public class C115318e implements C116657x.C116658a {

        /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$e$a */
        public class C115319a implements DialogInterface.OnClickListener {
            public C115319a(C115318e eVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.CollectMainUI", "RealnameVerifyUtil cancel");
            }
        }

        public C115318e() {
        }

        /* renamed from: a */
        public void mo175118a(boolean z, C118466sp spVar) {
            Object[] objArr = new Object[2];
            boolean z2 = false;
            objArr[0] = Boolean.valueOf(z);
            boolean z3 = true;
            objArr[1] = spVar == null ? "null" : Integer.valueOf(spVar.f354373d);
            Log.m105925i("MicroMsg.CollectMainUI", "get from cgi: %s resp.retcode: %s", objArr);
            if (!z) {
                return;
            }
            if (spVar == null || spVar.f354373d != 416) {
                CollectMainUI.this.mo175114f8();
                CollectMainUI.this.f345635u.setVisibility(0);
                CollectMainUI.this.getClass();
                CollectMainUI collectMainUI = CollectMainUI.this;
                collectMainUI.f345579L = spVar.f354375f;
                collectMainUI.f345583Q = C75157y0.m90138a(spVar.f354376g);
                CollectMainUI collectMainUI2 = CollectMainUI.this;
                collectMainUI2.f345580M = spVar.f354377h;
                collectMainUI2.f345590T0 = spVar.f354382p;
                collectMainUI2.f345592U0 = spVar.f354383q;
                CollectMainUI.m162071M7(collectMainUI2, spVar.f354379j);
                CollectMainUI.this.mo175106Y7(spVar.f354378i);
                CollectMainUI.this.getClass();
                Log.m105919d("MicroMsg.CollectMainUI", "flag: %s", 0);
                CollectMainUI collectMainUI3 = CollectMainUI.this;
                collectMainUI3.f345604b1 = spVar.f354384r;
                collectMainUI3.f345605c1 = spVar.f354385s;
                collectMainUI3.f345612h1 = spVar.f354387u;
                if (spVar.f354386t == 0) {
                    z2 = true;
                }
                collectMainUI3.f345623o1 = z2;
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_COLLECT_BUSITYPE_INT_SYNC, Integer.valueOf(CollectMainUI.this.f345586R0));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_COLLECT_BUSIURL_STRING_SYNC, CollectMainUI.this.f345588S0);
                CollectMainUI.this.mo175109b8();
                return;
            }
            Object[] objArr2 = new Object[1];
            if (spVar.f354374e != null) {
                z3 = false;
            }
            objArr2[0] = Boolean.valueOf(z3);
            Log.m105919d("MicroMsg.CollectMainUI", "realNameInfo:%s", objArr2);
            CollectMainUI.this.f345635u.setVisibility(4);
            CollectMainUI.this.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.CollectMainUI");
            bundle.putString("realname_verify_process_jump_plugin", "collect");
            C67008a.m79170e(CollectMainUI.this, spVar.f354373d, spVar.f354374e, bundle, true, new C115319a(this), (C79148e.C79149a) null, 1010, 2);
        }

        /* renamed from: b */
        public void mo175119b(String str, String str2, int i) {
            C118447nw2 nw22;
            Log.m105925i("MicroMsg.CollectMainUI", "get cache: %s, %s, %s", str, str2, Integer.valueOf(i));
            CollectMainUI.this.f345635u.setVisibility(0);
            CollectMainUI collectMainUI = CollectMainUI.this;
            collectMainUI.f345579L = str;
            collectMainUI.f345583Q = i;
            collectMainUI.f345580M = str2;
            collectMainUI.getClass();
            try {
                C86709a0.m107528h();
                nw22 = collectMainUI.mo175105X7(new JSONObject((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_BOTTOM_MENU_STRING_SYNC, "")));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.CollectMainUI", e, "", new Object[0]);
                nw22 = null;
            }
            CollectMainUI collectMainUI2 = CollectMainUI.this;
            collectMainUI2.getClass();
            ArrayList arrayList = new ArrayList();
            try {
                C86709a0.m107528h();
                String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_UPRIGHT_MENU_STRING_SYNC, "");
                if (!Util.isNullOrNil(str3)) {
                    JSONArray jSONArray = new JSONArray(str3);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add(collectMainUI2.mo175105X7(jSONArray.getJSONObject(i2)));
                    }
                }
            } catch (JSONException e2) {
                Log.printErrStackTrace("MicroMsg.CollectMainUI", e2, "", new Object[0]);
            }
            CollectMainUI.m162071M7(CollectMainUI.this, nw22);
            CollectMainUI.this.mo175106Y7(arrayList);
            CollectMainUI collectMainUI3 = CollectMainUI.this;
            if (collectMainUI3.f345642x0 == 1) {
                C86709a0.m107528h();
                collectMainUI3.f345586R0 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_COLLECT_BUSITYPE_INT_SYNC, -1)).intValue();
                CollectMainUI collectMainUI4 = CollectMainUI.this;
                C86709a0.m107528h();
                collectMainUI4.f345588S0 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_COLLECT_BUSIURL_STRING_SYNC, "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$f */
    public class C115320f extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ List f345651g;

        /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$f$a */
        public class C115321a implements C11182m0 {
            public C115321a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                if (C113081b.yx0().Ax0()) {
                    e0Var.add(0, 1, 0, (int) C0966R.string.bge);
                } else {
                    e0Var.add(0, 1, 0, (int) C0966R.string.bgo);
                }
                if (C115320f.this.f345651g != null) {
                    for (int i = 0; i < C115320f.this.f345651g.size(); i++) {
                        C118447nw2 nw22 = (C118447nw2) C115320f.this.f345651g.get(i);
                        if (!Util.isNullOrNil(nw22.f354150e)) {
                            e0Var.add(0, i + 1 + 1, 0, (CharSequence) nw22.f354150e);
                        }
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$f$b */
        public class C115322b implements C11184p0 {
            public C115322b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Class cls = C75700k0.class;
                if (menuItem.getItemId() != 1) {
                    int itemId = (menuItem.getItemId() - 1) - 1;
                    if (itemId < 0) {
                        Log.m105929w("MicroMsg.CollectMainUI", "illegal pos: %s", Integer.valueOf(itemId));
                        return;
                    }
                    C118447nw2 nw22 = (C118447nw2) C115320f.this.f345651g.get(itemId);
                    int i2 = nw22.f354149d;
                    if (i2 == 1) {
                        Log.m105929w("MicroMsg.CollectMainUI", "wrong native type: %s", nw22.f354151f);
                        C115669n.INSTANCE.mo160131h(14526, 2, 1, nw22.f354150e, "", "", "", 2);
                    } else if (i2 == 2) {
                        if (!Util.isNullOrNil(nw22.f354151f)) {
                            C75228t.m90219L(CollectMainUI.this.getContext(), nw22.f354151f, false);
                            C115669n.INSTANCE.mo160131h(14526, 2, 2, nw22.f354150e, "", "", nw22.f354151f, 2);
                        }
                    } else if (i2 == 3) {
                        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                        aVar.f9526a = nw22.f354152g;
                        aVar.f9527b = Util.nullAs(nw22.f354153h, "");
                        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                        aVar2.f9529d = 1072;
                        aVar2.f9528c = 0;
                        startAppBrandUIFromOuterEvent.publish();
                        C115669n.INSTANCE.mo160131h(14526, 2, 3, nw22.f354150e, nw22.f354152g, nw22.f354153h, "", 2);
                    }
                } else if (C113081b.yx0().Ax0()) {
                    CollectMainUI collectMainUI = CollectMainUI.this;
                    collectMainUI.f345645y0 &= -32769;
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(collectMainUI.f345645y0));
                    C64334dz2 dz22 = new C64334dz2();
                    dz22.f182905d = 2;
                    ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(209, dz22));
                    C113081b.yx0().vx0();
                    C76701a.makeText((Context) CollectMainUI.this.getContext(), (int) C0966R.string.bgf, 1).show();
                    C115669n.INSTANCE.mo160131h(13944, 8);
                } else {
                    CollectMainUI collectMainUI2 = CollectMainUI.this;
                    collectMainUI2.f345645y0 |= 32768;
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(collectMainUI2.f345645y0));
                    C64334dz2 dz23 = new C64334dz2();
                    dz23.f182905d = 1;
                    ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(209, dz23));
                    C113081b.yx0().wx0();
                    C76701a.makeText((Context) CollectMainUI.this.getContext(), (int) C0966R.string.bgp, 1).show();
                    F2fRcvVoiceOffLineLogic.m162050d().mo175086k(false);
                    C115669n.INSTANCE.mo160131h(13944, 7);
                }
            }
        }

        public C115320f(List list) {
            this.f345651g = list;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            CollectMainUI collectMainUI = CollectMainUI.this;
            collectMainUI.f345616j1 = new C77407n((Context) collectMainUI.getContext(), 1, false);
            C77407n nVar = CollectMainUI.this.f345616j1;
            nVar.f225771i = new C115321a();
            nVar.f225782p = new C115322b();
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$g */
    public class C115323g extends C7089c0 {
        public C115323g(CollectMainUI collectMainUI) {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$h */
    public class C115324h extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C118461r00 f345655g;

        public C115324h(C118461r00 r002) {
            this.f345655g = r002;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            CollectMainUI collectMainUI = CollectMainUI.this;
            collectMainUI.f345611h = 3;
            CollectMainUI.m162068J7(collectMainUI, this.f345655g.f354295e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$j */
    public class C115325j extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C118461r00 f345657g;

        public C115325j(C118461r00 r002) {
            this.f345657g = r002;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            CollectMainUI collectMainUI = CollectMainUI.this;
            collectMainUI.f345611h = 3;
            CollectMainUI.m162068J7(collectMainUI, this.f345657g.f354296f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$k */
    public class C115326k implements C87581a<Object, C89132b.C89134c<C51582uq>> {
        public C115326k() {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (CollectMainUI.this.isFinishing() || CollectMainUI.this.isDestroyed()) {
                return null;
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                CollectMainUI collectMainUI = CollectMainUI.this;
                C51582uq uqVar = (C51582uq) cVar.f256796d;
                String str = uqVar.f143026d;
                String str2 = uqVar.f143027e;
                int i = uqVar.f143028f;
                if (collectMainUI.f345593V) {
                    collectMainUI.f345582P = str;
                } else {
                    collectMainUI.f345579L = str;
                }
                collectMainUI.f345580M = str2;
                collectMainUI.f345583Q = i;
                collectMainUI.mo175109b8();
                CollectMainUI collectMainUI2 = CollectMainUI.this;
                collectMainUI2.f345628q1 = ((C51582uq) cVar.f256796d).f143029g;
                collectMainUI2.mo175099O7((C118477wj3) null, (C118461r00) null);
                CollectMainUI.this.mo175101Q7(2);
                CollectMainUI.this.getClass();
                C115669n.INSTANCE.mo160131h(13944, 5);
                CollectMainUI.this.f345623o1 = false;
                return Boolean.TRUE;
            }
            C77426q qVar = new C77426q(CollectMainUI.this.getContext());
            qVar.mo107606r(cVar.f256795c);
            qVar.mo107590b(new C115367a(this));
            qVar.mo107603o();
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$m */
    public class C115327m implements MenuItem.OnMenuItemClickListener {
        public C115327m() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CollectMainUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$n */
    public class C115328n implements C72476y0.C72477a {
        public C115328n() {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            CollectMainUI collectMainUI = CollectMainUI.this;
            int i = CollectMainUI.f345567z1;
            if (collectMainUI.f345642x0 == 8) {
                collectMainUI.getClass();
                collectMainUI.mo175099O7((C118477wj3) null, (C118461r00) null);
                CollectMainUI.this.mo175101Q7(2);
                CollectMainUI.this.getClass();
                C115669n.INSTANCE.mo160131h(13944, 5);
                return;
            }
            boolean z = collectMainUI.f345623o1;
            if (!z) {
                collectMainUI.mo175100P7();
            } else if (!z) {
                collectMainUI.mo175100P7();
            } else {
                new C45530e(collectMainUI.f345612h1).mo9225i().mo123062e(new C117025g0(collectMainUI));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$p */
    public class C115329p implements C72476y0.C72477a {
        public C115329p() {
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            CollectMainUI collectMainUI = CollectMainUI.this;
            collectMainUI.f345593V = false;
            collectMainUI.mo94701a8();
            CollectMainUI collectMainUI2 = CollectMainUI.this;
            collectMainUI2.f345574G.setText(collectMainUI2.f345601Z);
            CollectMainUI.this.mo175111c8();
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$q */
    public class C115330q implements View.OnLongClickListener {
        public C115330q() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectMainUI$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            CollectMainUI collectMainUI = CollectMainUI.this;
            collectMainUI.mo175112d8(collectMainUI.f345605c1);
            if (CollectMainUI.this.f345605c1 != null) {
                C115669n.INSTANCE.mo160131h(20032, "wxface2face", "LongClick", "", "", "", "", 3, Integer.valueOf(CollectMainUI.this.f345605c1.f354516d), 0, CollectMainUI.this.mo175102S7(), Integer.valueOf(CollectMainUI.this.mo175104U7()), CollectMainUI.this.mo175103T7());
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/collect/ui/CollectMainUI$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$r */
    public class C115331r implements Runnable {
        public C115331r() {
        }

        public void run() {
            int[] iArr = new int[2];
            CollectMainUI.this.f345644y.getLocationInWindow(iArr);
            CollectMainUI.f345567z1 = iArr[1];
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$s */
    public class C115332s extends C116644q0 {

        /* renamed from: s */
        public boolean f345665s = false;

        public C115332s(CollectMainUI collectMainUI, C116644q0 q0Var) {
            this.f349753d = q0Var.f349753d;
            this.f349754e = q0Var.f349754e;
            this.f349755f = q0Var.f349755f;
            this.f349757h = q0Var.f349757h;
            this.f349758i = q0Var.f349758i;
            this.f349759j = q0Var.f349759j;
            this.f349760n = q0Var.f349760n;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectMainUI$t */
    public class C115333t {

        /* renamed from: a */
        public boolean f345666a;

        /* renamed from: b */
        public LinkedList<C115332s> f345667b = new LinkedList<>();

        public C115333t(C115317d dVar) {
        }

        /* renamed from: a */
        public void mo175124a() {
            if (this.f345666a) {
                Log.m105918d("MicroMsg.CollectMainUI.ToastAnimationHelper", "Animating, wait. QueueSize=" + this.f345667b.size());
            } else if (!this.f345667b.isEmpty()) {
                C115332s poll = this.f345667b.poll();
                this.f345666a = true;
                CollectMainUI collectMainUI = CollectMainUI.this;
                int i = CollectMainUI.f345567z1;
                collectMainUI.mo175107Z7();
                CollectMainUI.this.f345570C.setLayoutParams(new LinearLayout.LayoutParams(CollectMainUI.this.f345644y.getWidth(), CollectMainUI.this.f345644y.getHeight() + C76577a.m92151b(CollectMainUI.this.getContext(), 8)));
                CollectMainUI.this.f345572E.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(CollectMainUI.this.getContext(), poll.f349760n, CollectMainUI.this.f345572E.getTextSize()));
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(CollectMainUI.this.f345571D, poll.f349753d);
                CollectMainUI.this.f345573F.setText(C75228t.m90258m(poll.f349755f, poll.f349756g));
                View view = CollectMainUI.this.f345570C;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper", "doAnimation", "(Lcom/tencent/mm/plugin/collect/ui/CollectMainUI$PayerMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper", "doAnimation", "(Lcom/tencent/mm/plugin/collect/ui/CollectMainUI$PayerMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                AnimationSet animationSet = new AnimationSet(false);
                animationSet.addAnimation(new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f));
                int i2 = 0;
                for (int i3 = 0; i3 < ((LinkedList) CollectMainUI.this.f345585R).size(); i3++) {
                    if (((C115332s) ((LinkedList) CollectMainUI.this.f345585R).get(i3)).f349754e.equals(poll.f349754e)) {
                        i2 = i3;
                    }
                }
                float f = (float) CollectMainUI.f345565A1;
                float height = ((float) (CollectMainUI.this.f345644y.getHeight() / 2)) + 0.0f;
                if (CollectMainUI.this.f345637v.getVisibility() == 0) {
                    height += (float) CollectMainUI.this.f345637v.getHeight();
                }
                int i4 = CollectMainUI.f345566B1;
                float f2 = height + ((float) ((i2 * i4) + (i4 / 2)));
                int[] iArr = new int[2];
                CollectMainUI.this.f345644y.getLocationInWindow(iArr);
                animationSet.addAnimation(new TranslateAnimation(0.0f, f, 0.0f, (float) ((int) (f2 + ((float) (iArr[1] - CollectMainUI.f345567z1))))));
                animationSet.setDuration(300);
                animationSet.setInterpolator(new DecelerateInterpolator());
                animationSet.setAnimationListener(new C115368b(this, poll));
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(300);
                scaleAnimation.setInterpolator(new LinearInterpolator());
                scaleAnimation.setAnimationListener(new C115369c(this, animationSet));
                CollectMainUI.this.f345570C.startAnimation(scaleAnimation);
            }
        }
    }

    /* renamed from: J7 */
    public static void m162068J7(CollectMainUI collectMainUI, C118479xj3 xj32) {
        CollectMainUI collectMainUI2 = collectMainUI;
        C118479xj3 xj33 = xj32;
        collectMainUI.getClass();
        if (xj33 == null) {
            Log.m105924i("MicroMsg.CollectMainUI", " buttonInfo == null");
            return;
        }
        Log.m105925i("MicroMsg.CollectMainUI", " ClickButtonAction：%s", Integer.valueOf(xj33.f354533e));
        switch (xj33.f354533e) {
            case 1:
                if (collectMainUI2.f345606d1.isShown()) {
                    collectMainUI2.f345606d1.setVisibility(8);
                }
                C101218e0 e0Var = collectMainUI2.f345613i;
                if (e0Var != null) {
                    e0Var.mo140680z();
                    break;
                }
                break;
            case 2:
                collectMainUI2.mo175099O7((C118477wj3) null, (C118461r00) null);
                collectMainUI2.mo175101Q7(collectMainUI2.f345609g);
                break;
            case 3:
                C75228t.m90219L(collectMainUI.getContext(), xj33.f354534f, true);
                break;
            case 4:
                C64761ux2 ux22 = xj33.f354535g;
                String str = ux22.f185807d;
                String str2 = ux22.f185808e;
                if (!Util.isNullOrNil(str)) {
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                    aVar.f9526a = str;
                    aVar.f9527b = Util.nullAs(str2, "");
                    StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                    aVar2.f9529d = 1072;
                    aVar2.f9528c = 0;
                    startAppBrandUIFromOuterEvent.publish();
                    break;
                }
                break;
            case 5:
                collectMainUI2.mo175113e8(xj33.f354536h);
                break;
            case 6:
                collectMainUI2.mo175099O7((C118477wj3) null, xj33.f354536h);
                collectMainUI2.mo175101Q7(collectMainUI2.f345609g);
                break;
            case 7:
                if (collectMainUI2.f345623o1) {
                    new C45530e(collectMainUI2.f345612h1).mo9225i().mo123062e(new C117025g0(collectMainUI2));
                    break;
                } else {
                    collectMainUI.mo175100P7();
                    break;
                }
            case 8:
                collectMainUI.mo175100P7();
                break;
            case 9:
                collectMainUI.finish();
                break;
            default:
                Log.m105924i("MicroMsg.CollectMainUI", "unknow buttonInfo.type");
                break;
        }
        int i = collectMainUI2.f345611h;
        if (i == 1 || i == 2) {
            C115669n.INSTANCE.mo160131h(20032, "wxface2face", "ClickHalfDialogButton", "", "", "", "", 4, 0, Integer.valueOf(xj33.f354533e), collectMainUI.mo175102S7(), Integer.valueOf(collectMainUI.mo175104U7()), collectMainUI.mo175103T7());
        } else if (i != 3) {
            Log.m105924i("MicroMsg.CollectMainUI", "unknow clickButtonSource");
        } else {
            C115669n.INSTANCE.mo160131h(20032, "wxface2face", "ClickCoverPageButton", "", "", "", "", 5, 0, Integer.valueOf(xj33.f354533e), collectMainUI.mo175102S7(), Integer.valueOf(collectMainUI.mo175104U7()), collectMainUI.mo175103T7());
        }
    }

    /* renamed from: K7 */
    public static void m162069K7(CollectMainUI collectMainUI, C49139df2 df22) {
        collectMainUI.getClass();
        C12925w wVar = new C12925w(collectMainUI);
        collectMainUI.f345630r1 = wVar;
        wVar.f36927f.setFocusable(false);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(collectMainUI).inflate(C0966R.C0971layout.atk, (ViewGroup) null);
        collectMainUI.f345630r1.mo12471k(linearLayout);
        Button button = (Button) linearLayout.findViewById(C0966R.C0970id.amg);
        Button button2 = (Button) linearLayout.findViewById(C0966R.C0970id.alm);
        Button button3 = (Button) linearLayout.findViewById(C0966R.C0970id.aln);
        C118479xj3 xj32 = df22.f132289f;
        if (xj32 != null) {
            button2.setText(xj32.f354532d);
            button3.setText(df22.f132290g.f354532d);
            button2.setOnClickListener(new C117053v(collectMainUI, df22));
            button3.setOnClickListener(new C117055w(collectMainUI, df22));
        } else {
            button2.setVisibility(8);
            button3.setVisibility(8);
            button.setText(df22.f132290g.f354532d);
            button.setVisibility(0);
            button.setOnClickListener(new C117057x(collectMainUI, df22));
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
                LinearLayout linearLayout3 = (LinearLayout) LayoutInflater.from(collectMainUI).inflate(C0966R.C0971layout.atj, (ViewGroup) null);
                ((TextView) linearLayout3.findViewById(C0966R.C0970id.g55)).setText(it.next());
                linearLayout2.addView(linearLayout3);
            }
        }
        collectMainUI.f345630r1.mo5086o();
    }

    /* renamed from: L7 */
    public static void m162070L7(CollectMainUI collectMainUI, Context context, String str, int i, C118477wj3 wj32, C118461r00 r002) {
        collectMainUI.getClass();
        Toast makeText = C76701a.makeText(context, (CharSequence) "", 0);
        View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(i);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(str);
        makeText.setGravity(17, 0, 0);
        makeText.setView(inflate);
        makeText.show();
        new MMHandler().postDelayed(new C117022f0(collectMainUI, makeText, wj32, r002), 750);
    }

    /* renamed from: M7 */
    public static void m162071M7(CollectMainUI collectMainUI, C118447nw2 nw22) {
        collectMainUI.getClass();
        if (nw22 == null || Util.isNullOrNil(nw22.f354150e)) {
            Log.m105924i("MicroMsg.CollectMainUI", "empty item return");
            return;
        }
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_BOTTOM_LEFT_ICON_URL_STRING_SYNC, "");
        if (!Util.isNullOrNil(str)) {
            collectMainUI.f345594V0.setUrl(str);
            collectMainUI.f345594V0.setVisibility(0);
        } else {
            collectMainUI.f345594V0.setVisibility(8);
        }
        collectMainUI.f345596W0.setText(nw22.f354150e);
        if (!Util.isNullOrNil(nw22.f354154i)) {
            collectMainUI.f345598X0.setText(nw22.f354154i);
            collectMainUI.f345598X0.setVisibility(0);
        } else {
            collectMainUI.f345598X0.setVisibility(4);
        }
        if (nw22.f354155j == 1) {
            collectMainUI.f345600Y0.setVisibility(0);
        } else {
            collectMainUI.f345600Y0.setVisibility(8);
        }
        int i = nw22.f354149d;
        if (i == 1) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(14526, 1, 1, nw22.f354150e, "", "", "", 1);
            if (nw22.f354155j == 1) {
                nVar.mo160131h(14526, 3, 1, nw22.f354150e, "", "", "", 1);
            }
        } else if (i == 2) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160131h(14526, 1, 2, nw22.f354150e, "", "", nw22.f354151f, 1);
            if (nw22.f354155j == 1) {
                nVar2.mo160131h(14526, 3, 2, nw22.f354150e, "", "", nw22.f354151f, 1);
            }
        } else if (i == 3) {
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.mo160131h(14526, 1, 3, nw22.f354150e, nw22.f354152g, nw22.f354153h, "", 1);
            if (nw22.f354155j == 1) {
                nVar3.mo160131h(14526, 3, 3, nw22.f354150e, nw22.f354152g, nw22.f354153h, "", 1);
            }
        }
        collectMainUI.f345602Z0.setOnClickListener(new C117061z(collectMainUI, nw22));
    }

    /* renamed from: I7 */
    public boolean mo94696I7(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    /* renamed from: N7 */
    public void mo94697N7() {
        if (C116657x.f349796e == null) {
            C116657x.f349796e = new C116657x();
        }
        C116657x xVar = C116657x.f349796e;
        this.f345584Q0 = xVar;
        xVar.getClass();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(5174, xVar);
        C116657x xVar2 = this.f345584Q0;
        C115318e eVar = new C115318e();
        xVar2.getClass();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_PAY_URL_STRING_SYNC, "");
        C86709a0.m107528h();
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_TRUE_NAME_STRING_SYNC, "");
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_F2F_COLLECT_PAY_URL_ERROR_LEVEL_INT_SYNC, -1)).intValue();
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.F2fGetPayUrlManager", "use old payurl");
            C67203r0 r0Var = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().f192953f;
            str = r0Var != null ? r0Var.field_ftf_pay_url : null;
        }
        eVar.mo175119b(str, str2, intValue);
        C116641h0 h0Var = new C116641h0();
        ((HashMap) xVar2.f349797d).put(h0Var, eVar);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(h0Var);
    }

    /* renamed from: O7 */
    public final void mo175099O7(C118477wj3 wj32, C118461r00 r002) {
        int i;
        Log.m105924i("MicroMsg.CollectMainUI", "doSaveQrCode");
        Bitmap bitmap = this.f345578K;
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105928w("MicroMsg.CollectMainUI", "save ftf pay qrcode failed: bmp null");
            C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.bhb), 1).show();
        } else {
            Class cls = C76979h.class;
            Bitmap a = C75484o.m90513a(this, this.f345579L, C75592q0.m90789s(), this.f345586R0, this.f345588S0, true, BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 197.0f), this.f345646y1, false, this.f345583Q, 0.0f, true);
            boolean z = false;
            if (a != null && !a.isRecycled()) {
                if (this.f345593V) {
                    C115669n.INSTANCE.mo160131h(11343, 1, Integer.valueOf((int) Math.round(this.f345587S * 100.0d)));
                } else {
                    C115669n.INSTANCE.mo160131h(11343, 0);
                }
                if (!this.f345569B) {
                    this.f345568A = (ScrollView) ((ViewStub) findViewById(C0966R.C0970id.f357736bi1)).inflate();
                    mo94700W7();
                    this.f345569B = true;
                    i = 250;
                } else {
                    i = 0;
                }
                this.f345568A.setVisibility(4);
                ((ImageView) this.f345568A.findViewById(C0966R.C0970id.bhv)).setImageBitmap(this.f345578K);
                TextView textView = (TextView) this.f345568A.findViewById(C0966R.C0970id.bhx);
                TextView textView2 = (TextView) this.f345568A.findViewById(C0966R.C0970id.bhy);
                LinearLayout linearLayout = (LinearLayout) this.f345568A.findViewById(C0966R.C0970id.bii);
                LinearLayout linearLayout2 = (LinearLayout) this.f345568A.findViewById(C0966R.C0970id.bhu);
                TextView textView3 = (TextView) this.f345568A.findViewById(C0966R.C0970id.bhr);
                TextView textView4 = (TextView) this.f345568A.findViewById(C0966R.C0970id.bhs);
                TextView textView5 = (TextView) this.f345568A.findViewById(C0966R.C0970id.bht);
                String z2 = C75228t.m90277z(C75228t.m90268r(C75592q0.m90789s()), 10);
                String V7 = mo94699V7();
                if (!Util.isNullOrNil(V7)) {
                    z2 = z2 + getString(C0966R.string.bgx, new Object[]{V7});
                }
                if (this.f345586R0 != 1) {
                    textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, z2, textView.getTextSize()));
                } else if (!Util.isNullOrNil((String) null)) {
                    textView.setText((CharSequence) null);
                    textView2.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, z2, textView2.getTextSize()));
                    textView2.setVisibility(0);
                } else {
                    textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, z2, textView.getTextSize()));
                }
                if (this.f345593V) {
                    if (!Util.isNullOrNil(this.f345591U)) {
                        textView4.setText(this.f345591U);
                        textView4.setVisibility(0);
                    } else {
                        textView4.setVisibility(8);
                    }
                    textView3.setText(mo94698R7());
                    textView5.setText(C75228t.m90260n(this.f345587S));
                    linearLayout2.setVisibility(0);
                } else {
                    linearLayout2.setVisibility(8);
                }
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(this, new C117047t(this, linearLayout, true, wj32, r002, i), new C59749u(this));
                z = true;
            }
            if (!z) {
                Log.m105928w("MicroMsg.CollectMainUI", "save ftf pay qrcode fail");
                C76701a.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.bhb), 1).show();
            }
        }
        getPreferenceScreen().notifyDataSetChanged();
    }

    /* renamed from: P7 */
    public final void mo175100P7() {
        C77963l1 c = C113146l.m154805c();
        if (c == null) {
            c = new C77963l1();
        }
        new C58517j(this.f345587S, this.f345589T, this.f345626p1, c.f227796i, c.f227797j, String.valueOf(c.f227795h), this.f345612h1, mo175103T7(), false, "").mo9225i().mo123062e(new C115326k());
    }

    /* renamed from: Q7 */
    public final void mo175101Q7(int i) {
        int U7 = mo175104U7();
        String T7 = mo175103T7();
        String S7 = mo175102S7();
        Log.m105925i("MicroMsg.CollectMainUI", "doSceneSaveQrcodeNotify notifyType:%s，amount: %s,memo: %s,url: %s,mSaveNotifyInfo:%s", Integer.valueOf(i), Integer.valueOf(U7), T7, S7, this.f345612h1);
        C86709a0.m107524d().mo123460f(new C58516i0(i, U7, T7, S7, this.f345612h1));
    }

    /* renamed from: R7 */
    public String mo94698R7() {
        return C75228t.m90266q(this.f345589T);
    }

    /* renamed from: S7 */
    public final String mo175102S7() {
        if (this.f345593V) {
            if (!Util.isNullOrNil(this.f345582P)) {
                return this.f345582P;
            }
            Log.m105928w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
            return "";
        } else if (!Util.isNullOrNil(this.f345579L)) {
            return this.f345579L;
        } else {
            Log.m105928w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mPayUrl null");
            return "";
        }
    }

    /* renamed from: T7 */
    public final String mo175103T7() {
        return (!this.f345624p.isShown() || Util.isNullOrNil(this.f345624p.getText())) ? "" : this.f345624p.getText().toString();
    }

    /* renamed from: U7 */
    public final int mo175104U7() {
        if (!this.f345627q.isShown() || Util.isNullOrNil(this.f345627q.getText())) {
            return 0;
        }
        return Integer.parseInt(C75228t.m90230W("" + this.f345627q.getText(), "100", 0, RoundingMode.HALF_UP).toString());
    }

    /* renamed from: V7 */
    public String mo94699V7() {
        if (Util.isNullOrNil(this.f345580M)) {
            String q = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91335q();
            this.f345580M = q;
            this.f345580M = C75228t.m90270s(q);
        }
        return this.f345580M;
    }

    /* renamed from: W7 */
    public void mo94700W7() {
    }

    /* renamed from: X7 */
    public final C118447nw2 mo175105X7(JSONObject jSONObject) {
        C118447nw2 nw22 = new C118447nw2();
        nw22.f354149d = jSONObject.optInt("type", -1);
        nw22.f354151f = jSONObject.optString("url", "");
        nw22.f354150e = jSONObject.optString("wording", "");
        nw22.f354152g = jSONObject.optString("waapp_username", "");
        nw22.f354153h = jSONObject.optString("waapp_path", "");
        return nw22;
    }

    /* renamed from: Y7 */
    public void mo175106Y7(List<C118447nw2> list) {
        if (list != null) {
            for (C118447nw2 next : list) {
                int i = next.f354149d;
                if (i == 1) {
                    C115669n.INSTANCE.mo160131h(14526, 2, 1, next.f354150e, "", "", "", 1);
                } else if (i == 2) {
                    C115669n.INSTANCE.mo160131h(14526, 2, 2, next.f354150e, "", "", next.f354151f, 1);
                } else if (i == 3) {
                    C115669n.INSTANCE.mo160131h(14526, 2, 3, next.f354150e, next.f354152g, next.f354153h, "", 1);
                }
            }
        }
        this.f345577J.setOnClickListener(new C115320f(list));
    }

    /* renamed from: Z7 */
    public final void mo175107Z7() {
        double d;
        List<C115332s> list = this.f345585R;
        if (list == null || ((LinkedList) list).size() <= 0) {
            d = 0.0d;
        } else {
            this.f345644y.setBackgroundResource(C0966R.C0969drawable.f4847on);
            this.f345641x.removeAll();
            d = 0.0d;
            int i = 0;
            while (i < ((LinkedList) this.f345585R).size()) {
                C115332s sVar = (C115332s) ((LinkedList) this.f345585R).get(i);
                String str = "" + i;
                C8482h0 h0Var = i == ((LinkedList) this.f345585R).size() - 1 ? new C8482h0(this, C0966R.C0971layout.f7027vb) : new C8482h0(this);
                h0Var.mo26273A(str);
                String str2 = sVar.f349760n;
                if (Util.isNullOrNil(str2) && !Util.isNullOrNil(sVar.f349753d)) {
                    str2 = C75228t.m90268r(sVar.f349753d);
                }
                h0Var.f27490N = str2;
                h0Var.f27489M = sVar.f349753d;
                int i2 = sVar.f349759j;
                if (i2 == 0) {
                    h0Var.mo7740D(C0966R.string.bgt);
                    this.f345641x.mo72527k(h0Var);
                } else if (i2 == 1) {
                    if (sVar.f345665s) {
                        double d2 = sVar.f349755f;
                        d += d2;
                        h0Var.mo7741E(C75228t.m90258m(d2, sVar.f349756g));
                    } else {
                        h0Var.mo7740D(C0966R.string.bgs);
                    }
                    this.f345641x.mo72527k(h0Var);
                } else if (i2 == 2) {
                    h0Var.mo7740D(C0966R.string.bgr);
                    this.f345641x.mo72527k(h0Var);
                } else {
                    this.f345641x.mo72527k(h0Var);
                }
                i++;
            }
            this.f345641x.notifyDataSetChanged();
            this.f345631s.setText(C75228t.m90258m(d, ((C115332s) ((LinkedList) this.f345585R).get(0)).f349756g));
            this.f345631s.setVisibility(0);
        }
        List<C115332s> list2 = this.f345585R;
        if (list2 == null || ((LinkedList) list2).size() <= 0) {
            this.f345631s.setVisibility(8);
            View view = this.f345637v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f345647z;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f345602Z0.setBackgroundResource(C0966R.C0969drawable.f4848oo);
        View view5 = this.f345637v;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (d > 0.0d && ((LinkedList) this.f345585R).size() >= 1) {
            View view7 = this.f345603a1;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view9 = this.f345647z;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshPayerInfoArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: a8 */
    public void mo94701a8() {
        this.f345622o.setImageBitmap((Bitmap) null);
        if (this.f345593V) {
            if (Util.isNullOrNil(this.f345582P)) {
                Log.m105928w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
                return;
            }
            String str = this.f345582P;
            int i = this.f345583Q;
            this.f345578K = C75484o.m90513a(this, str, C75592q0.m90789s(), this.f345586R0, this.f345588S0, true, BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 197.0f), this.f345646y1, false, i, 0.0f, true);
        } else if (Util.isNullOrNil(this.f345579L)) {
            Log.m105928w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : mPayUrl null");
            return;
        } else {
            String str2 = this.f345579L;
            int i2 = this.f345583Q;
            this.f345578K = C75484o.m90513a(this, str2, C75592q0.m90789s(), this.f345586R0, this.f345588S0, true, BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 197.0f), this.f345646y1, false, i2, 0.0f, true);
        }
        Bitmap bitmap = this.f345578K;
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105928w("MicroMsg.CollectMainUI", "func[refreshQRCodeArea] : bmp null ,mFixedPayUrl=" + Util.nullAsNil(this.f345582P));
        } else {
            this.f345622o.setImageBitmap(this.f345578K);
        }
        if (this.f345593V) {
            this.f345627q.setPrefix(mo94698R7());
            this.f345627q.setText(C75228t.m90260n(this.f345587S));
            this.f345627q.setVisibility(0);
            if (!Util.isNullOrNil(this.f345591U)) {
                this.f345624p.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), this.f345591U, this.f345624p.getTextSize()));
                this.f345624p.setVisibility(0);
            } else {
                this.f345624p.setVisibility(8);
            }
            View findViewById = findViewById(C0966R.C0970id.bhd);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f345629r.setVisibility(8);
        this.f345627q.setVisibility(8);
        this.f345624p.setVisibility(8);
        View findViewById2 = findViewById(C0966R.C0970id.bhd);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/ui/CollectMainUI", "refreshQRCodeArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void afterTextChanged(Editable editable) {
        if (editable == null || editable.toString().equals("")) {
            this.f345617k1.mo140656b(false);
            return;
        }
        this.f345617k1.mo140656b(true);
        if (editable.length() > 16) {
            PasterEditText pasterEditText = (PasterEditText) this.f345618l1.findViewById(C0966R.C0970id.g59);
            pasterEditText.setText(editable.toString().substring(0, 16));
            String substring = editable.toString().substring(0, 16);
            this.f345626p1 = substring;
            pasterEditText.setSelection(substring.length());
            return;
        }
        this.f345626p1 = editable.toString();
    }

    /* renamed from: b8 */
    public void mo175109b8() {
        if (Util.isNullOrNil(this.f345579L)) {
            Log.m105928w("MicroMsg.CollectMainUI", "func[refreshView], mPayUrl null.");
            return;
        }
        if (this.f345586R0 == 1) {
            if (!Util.isNullOrNil((String) null)) {
                this.f345639w.setText((CharSequence) null);
            }
            if (!Util.isNullOrNil((String) null)) {
                TextView textView = (TextView) findViewById(C0966R.C0970id.bhi);
                textView.setText((CharSequence) null);
                textView.setVisibility(0);
            }
        }
        mo94701a8();
        mo175107Z7();
        C77963l1 c = C113146l.m154805c();
        int i = this.f345593V ? 33 : 32;
        if (c != null) {
            C115669n.INSTANCE.mo160131h(13447, Integer.valueOf(i), c.f227796i, c.f227797j, this.f345579L, Double.valueOf(this.f345587S), Long.valueOf(Util.nowSecond()), Long.valueOf(c.f227795h), c.f227798n, c.f227799o);
        }
        if (!Util.isNullOrNil(this.f345590T0)) {
            this.f345576I.setText(this.f345590T0);
            this.f345576I.setOnClickListener(new C117060y(this));
            this.f345575H.setVisibility(0);
            return;
        }
        this.f345575H.setVisibility(8);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c8 */
    public final void mo175111c8() {
        getWindow().getDecorView().post(new C55590b());
    }

    /* renamed from: d8 */
    public final void mo175112d8(C118477wj3 wj32) {
        C101218e0 e0Var;
        if (wj32 == null) {
            Log.m105924i("MicroMsg.CollectMainUI", "actionInfo is null");
            return;
        }
        Log.m105925i("MicroMsg.CollectMainUI", "actionInfo.action_type：%s", Integer.valueOf(wj32.f354516d));
        int i = wj32.f354516d;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            C49139df2 df22 = wj32.f354517e;
            if (df22 == null || ((e0Var = this.f345613i) != null && e0Var.mo140661h())) {
                Log.m105924i("MicroMsg.CollectMainUI", "mHalfBottomDialog != null || mHalfBottomDialog.isShowing() || halfPage == null ");
                return;
            }
            C77407n nVar = this.f345615j;
            if (nVar == null || !nVar.mo107563h()) {
                Log.m105924i("MicroMsg.CollectMainUI", "showHalfDialog");
                C118479xj3 xj32 = df22.f132289f;
                C118479xj3 xj33 = df22.f132290g;
                this.f345609g = 4;
                C101218e0 e0Var2 = new C101218e0(getContext(), 1, 3);
                this.f345613i = e0Var2;
                e0Var2.mo140667n(xj32.f354532d, xj33.f354532d);
                C101218e0 e0Var3 = this.f345613i;
                C117009a0 a0Var = new C117009a0(this, xj32);
                C117011b0 b0Var = new C117011b0(this, xj33);
                e0Var3.f296373D = a0Var;
                e0Var3.f296374E = b0Var;
                if (df22.f132287d.f144644d == 2) {
                    View inflate = View.inflate(getContext(), C0966R.C0971layout.f7022v7, (ViewGroup) null);
                    ((ImageView) inflate.findViewById(C0966R.C0970id.f357486a34)).setOnClickListener(new C117013c0(this));
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f357731bh3);
                    textView.setText(df22.f132287d.f144645e);
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    this.f345613i.mo140672r(inflate);
                } else {
                    View inflate2 = View.inflate(getContext(), C0966R.C0971layout.f7021v6, (ViewGroup) null);
                    TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.et6);
                    textView2.setText(df22.f132287d.f144645e);
                    C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                    this.f345613i.mo140672r(inflate2);
                }
                View inflate3 = View.inflate(getContext(), C0966R.C0971layout.f7020v5, (ViewGroup) null);
                ((TextView) inflate3.findViewById(C0966R.C0970id.f358384et2)).setText(df22.f132288e);
                this.f345613i.mo140663j(inflate3);
                this.f345613i.mo140655A();
                return;
            }
            Log.m105924i("MicroMsg.CollectMainUI", "mBottomSheet != null && mBottomSheet.isShowing()");
        } else if (i == 2) {
            mo175113e8(wj32.f354518f);
        } else if (i != 3) {
            Log.m105924i("MicroMsg.CollectMainUI", "unknow actionInfo.action_type");
        } else {
            C51549ui uiVar = wj32.f354519g;
            if (uiVar == null) {
                Log.m105924i("MicroMsg.CollectMainUI", " bottomCell == null");
                return;
            }
            this.f345609g = 3;
            this.f345615j = new C77407n((Context) getContext(), 1, true);
            TextView textView3 = new TextView(getContext());
            textView3.setGravity(17);
            textView3.setHeight(C76577a.m92151b(getContext(), 56));
            textView3.setTextSize(12.0f);
            textView3.setTextColor(getResources().getColor(C0966R.color.FG_1));
            textView3.setText(uiVar.f142862d);
            this.f345615j.mo107569n(textView3, false);
            C77407n nVar2 = this.f345615j;
            nVar2.f225784p1 = true;
            nVar2.f225771i = new C117015d0(this, uiVar);
            nVar2.f225782p = new C117019e0(this, uiVar);
            nVar2.mo107573q();
        }
    }

    /* renamed from: e8 */
    public final void mo175113e8(C118461r00 r002) {
        if (r002 == null) {
            Log.m105924i("MicroMsg.CollectMainUI", " coverInfo == null");
            return;
        }
        Log.m105924i("MicroMsg.CollectMainUI", "showCoverUI");
        this.f345606d1.setVisibility(0);
        this.f345606d1.setOnClickListener(new C115323g(this));
        ViewGroup.LayoutParams layoutParams = this.f345606d1.getLayoutParams();
        layoutParams.height = this.f345644y.getHeight();
        this.f345606d1.setLayoutParams(layoutParams);
        this.f345607e1.setText(r002.f354294d);
        this.f345608f1.setText(r002.f354295e.f354532d);
        this.f345608f1.setOnClickListener(new C115324h(r002));
        this.f345610g1.setText(r002.f354296f.f354532d);
        this.f345610g1.setOnClickListener(new C115325j(r002));
    }

    /* renamed from: f8 */
    public void mo175114f8() {
        C86709a0.m107528h();
        if (((String) C86709a0.m107535s().mo121142i().mo119684e(327731, "0")).equals("0")) {
            C77426q qVar = new C77426q(getContext());
            this.f345614i1 = qVar;
            qVar.mo107606r(getResources().getString(C0966R.string.bgi));
            C77426q qVar2 = this.f345614i1;
            qVar2.mo107595g(getResources().getString(C45121z0.m49961a()));
            qVar2.mo107589a(true);
            qVar2.mo107601m(C0966R.string.kkf);
            qVar2.mo107600l(new C68847i(this));
            qVar2.mo107603o();
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(327731, "1");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
    }

    public int getHeaderResourceId() {
        return C0966R.C0971layout.f7025v_;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7023v8;
    }

    public int getResourceId() {
        return C0966R.xml.f8863p;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.he7);
        setBackBtn(new C115327m());
        this.f345641x = getPreferenceScreen();
        this.f345635u = (RelativeLayout) findViewById(C0966R.C0970id.iwc);
        ((ViewGroup) findViewById(C0966R.C0970id.bih)).setBackgroundColor(getResources().getColor(C0966R.color.f2974b5));
        this.f345637v = findViewById(C0966R.C0970id.bhm);
        this.f345603a1 = findViewById(C0966R.C0970id.bhn);
        this.f345627q = (WalletTextView) findViewById(C0966R.C0970id.bha);
        this.f345624p = (TextView) findViewById(C0966R.C0970id.bh_);
        this.f345629r = (TextView) findViewById(C0966R.C0970id.bhb);
        this.f345631s = (TextView) findViewById(C0966R.C0970id.bhl);
        this.f345575H = (LinearLayout) findViewById(C0966R.C0970id.hji);
        this.f345576I = (TextView) findViewById(C0966R.C0970id.a7l);
        this.f345644y = (RelativeLayout) findViewById(C0966R.C0970id.bhj);
        this.f345647z = findViewById(C0966R.C0970id.bhg);
        this.f345597X = LayoutInflater.from(this).inflate(C0966R.C0971layout.f7024v9, (ViewGroup) null, false);
        this.f345633t = (TextView) findViewById(C0966R.C0970id.bhw);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(C0966R.string.bgy));
        spannableStringBuilder.setSpan(new C72476y0(6, new C115328n(), true), 0, spannableStringBuilder.length(), 18);
        this.f345633t.setText(spannableStringBuilder);
        this.f345633t.setClickable(true);
        this.f345633t.setOnTouchListener(new C75355a0(this));
        getListView().addFooterView(this.f345597X, (Object) null, false);
        getListView().setFooterDividersEnabled(false);
        this.f345622o = (ImageView) findViewById(C0966R.C0970id.bhf);
        this.f345639w = (TextView) findViewById(C0966R.C0970id.f357738bi2);
        TextView textView = (TextView) findViewById(C0966R.C0970id.bik);
        this.f345574G = textView;
        textView.setClickable(true);
        this.f345574G.setOnTouchListener(new C75355a0(this));
        this.f345601Z = new SpannableStringBuilder(getString(C0966R.string.bgl));
        this.f345625p0 = new SpannableStringBuilder(getString(C0966R.string.bgm));
        C72476y0 y0Var = new C72476y0(6, new C68849o(), true);
        C72476y0 y0Var2 = new C72476y0(6, new C115329p(), true);
        SpannableStringBuilder spannableStringBuilder2 = this.f345601Z;
        spannableStringBuilder2.setSpan(y0Var, 0, spannableStringBuilder2.length(), 18);
        SpannableStringBuilder spannableStringBuilder3 = this.f345625p0;
        spannableStringBuilder3.setSpan(y0Var2, 0, spannableStringBuilder3.length(), 18);
        this.f345574G.setText(this.f345601Z);
        this.f345577J = (RelativeLayout) findViewById(C0966R.C0970id.bi9);
        this.f345622o.setOnLongClickListener(new C115330q());
        this.f345570C = findViewById(C0966R.C0970id.bhp);
        this.f345571D = (ImageView) findViewById(C0966R.C0970id.bia);
        this.f345572E = (TextView) findViewById(C0966R.C0970id.bic);
        this.f345573F = (TextView) findViewById(C0966R.C0970id.bib);
        this.f345594V0 = (CdnImageView) findViewById(C0966R.C0970id.bge);
        this.f345596W0 = (TextView) findViewById(C0966R.C0970id.bgh);
        this.f345598X0 = (TextView) findViewById(C0966R.C0970id.bgi);
        this.f345600Y0 = (ImageView) findViewById(C0966R.C0970id.bgg);
        this.f345602Z0 = (ViewGroup) findViewById(C0966R.C0970id.bgf);
        this.f345644y.postDelayed(new C115331r(), 300);
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = "8";
        walletGetBulletinEvent.callback = new C68846a(walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
        this.f345606d1 = (LinearLayout) findViewById(C0966R.C0970id.bi5);
        this.f345607e1 = (TextView) findViewById(C0966R.C0970id.bi8);
        this.f345608f1 = (Button) findViewById(C0966R.C0970id.bi6);
        this.f345610g1 = (Button) findViewById(C0966R.C0970id.bi7);
    }

    /* renamed from: o7 */
    public void mo175115o7(C116644q0 q0Var) {
        boolean z;
        Log.m105918d("MicroMsg.CollectMainUI", "func[onRecv]:Recv payerMsg");
        int i = this.f345642x0;
        boolean z2 = false;
        if (!((i == 1 || i == 0) && q0Var.f349762p == 9)) {
            if (!(i == 8) || q0Var.f349762p != 26) {
                return;
            }
        }
        Vibrator vibrator = this.f345620n;
        if (vibrator != null) {
            vibrator.vibrate(50);
        }
        if (((long) q0Var.f349757h) < this.f345595W) {
            Log.m105918d("MicroMsg.CollectMainUI", "Recieve but time out ");
            return;
        }
        int i2 = 0;
        while (i2 < ((LinkedList) this.f345585R).size()) {
            if (q0Var.f349759j == 0 && Util.nullAsNil(q0Var.f349753d).equals(((C115332s) ((LinkedList) this.f345585R).get(i2)).f349753d) && ((C115332s) ((LinkedList) this.f345585R).get(i2)).f349759j == 2) {
                ((LinkedList) this.f345585R).remove(i2);
                ((LinkedList) this.f345585R).add(i2, new C115332s(this, q0Var));
            } else if (q0Var.f349754e.equals(((C115332s) ((LinkedList) this.f345585R).get(i2)).f349754e)) {
                Log.m105926v("MicroMsg.CollectMainUI", "func[onRecv] Duplicated msg, transId=" + q0Var.f349754e);
                if (((C115332s) ((LinkedList) this.f345585R).get(i2)).f349759j == 0) {
                    ((C115332s) ((LinkedList) this.f345585R).get(i2)).f349759j = q0Var.f349759j;
                    ((C115332s) ((LinkedList) this.f345585R).get(i2)).f349755f = q0Var.f349755f;
                    ((C115332s) ((LinkedList) this.f345585R).get(i2)).f349756g = q0Var.f349756g;
                    if (q0Var.f349759j == 1) {
                        this.f345599Y.f345667b.add((C115332s) ((LinkedList) this.f345585R).get(i2));
                    }
                }
            } else {
                i2++;
            }
            z = true;
        }
        z = false;
        if (!z) {
            int i3 = 0;
            while (true) {
                if (i3 >= ((LinkedList) this.f345585R).size()) {
                    break;
                } else if (q0Var.f349757h > ((C116644q0) ((LinkedList) this.f345585R).get(i3)).f349757h) {
                    ((LinkedList) this.f345585R).add(i3, new C115332s(this, q0Var));
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z2) {
                ((LinkedList) this.f345585R).add(new C115332s(this, q0Var));
            }
        }
        MMHandlerThread.postToMainThread(new C115316c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4096) {
            if (i2 != -1 || intent == null) {
                this.f345593V = false;
            } else {
                this.f345582P = intent.getStringExtra("ftf_pay_url");
                this.f345583Q = intent.getIntExtra("key_error_level", -1);
                this.f345587S = intent.getDoubleExtra("ftf_fixed_fee", 0.0d);
                this.f345589T = intent.getStringExtra("ftf_fixed_fee_type");
                this.f345591U = intent.getStringExtra("ftf_fixed_desc");
                this.f345581N = intent.getStringExtra("key_currency_unit");
                this.f345574G.setText(this.f345625p0);
                this.f345593V = true;
            }
            mo175109b8();
            mo175111c8();
        } else if (i == 4097) {
            this.f345645y0 = C75592q0.m90781k();
        }
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        this.f345643x1 = false;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        if (attributes.screenBrightness < 0.85f) {
            attributes.screenBrightness = 0.85f;
            getWindow().setAttributes(attributes);
        }
        setIsDarkActionbarBg(true);
        setNavigationbarColor(getResources().getColor(C0966R.color.f2974b5));
        setActionbarElementColor(getResources().getColor(C0966R.color.f2975b6));
        hideActionbarLine();
        getContentView().setBackgroundColor(getResources().getColor(C0966R.color.f2974b5));
        C86709a0.m107528h();
        this.f345642x0 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        this.f345645y0 = C75592q0.m90781k();
        int intExtra = getIntent().getIntExtra("key_from_scene", 1);
        C115669n.INSTANCE.mo160131h(14021, 2, Integer.valueOf(intExtra));
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        C116642q zx02 = C113081b.yx0().zx0();
        if (!((LinkedList) zx02.f349752d).contains(this)) {
            ((LinkedList) zx02.f349752d).add(this);
        }
        initView();
        mo94697N7();
        mo175109b8();
        this.f345620n = (Vibrator) getSystemService("vibrator");
        this.f345595W = Util.nowSecond();
        if (f345565A1 < 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            f345565A1 = (displayMetrics.widthPixels / 2) - BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 20.0f);
            f345566B1 = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 60.0f);
            BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 40.0f);
            BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 70.0f);
        }
        mo175111c8();
        C75136r0.m90122d(16, 0);
        C86709a0.m107524d().mo123455a(3781, this);
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this);
        this.f345632s1 = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = new C115317d();
    }

    public void onDestroy() {
        ImageView imageView = this.f345622o;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
        }
        Bitmap bitmap = this.f345578K;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.CollectMainUI", "bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
        ((LinkedList) C113081b.yx0().zx0().f349752d).remove(this);
        this.f345620n.cancel();
        C116657x xVar = this.f345584Q0;
        if (xVar != null) {
            for (Map.Entry key : ((HashMap) xVar.f349797d).entrySet()) {
                Log.m105924i("MicroMsg.F2fGetPayUrlManager", "uninit, do cancel netscene");
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123458d((C117747y) key.getKey());
            }
            ((HashMap) xVar.f349797d).clear();
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(5174, xVar);
        }
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this.f345646y1);
        C86709a0.m107524d().mo123470p(3781, this);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
        KeyboardHeightProvider keyboardHeightProvider = this.f345632s1;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        return false;
    }

    public void onResume() {
        super.onResume();
        ScreenShotUtil.setScreenShotCallback(this, this);
        this.f345632s1.mo104022e();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.CollectMainUI", "errType: %d,errCode: %d,errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar instanceof C58516i0) {
            Log.m105924i("MicroMsg.CollectMainUI", "scene is NetSceneF2fQrcodeSaveNotify");
        }
    }

    public void onScreenShot(String str, long j) {
        C77426q qVar;
        C101218e0 e0Var;
        C12925w wVar;
        C77398g gVar;
        Log.m105924i("MicroMsg.CollectMainUI", "do screen shot");
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(13944, 9);
        if (this.f345604b1 != null) {
            nVar.mo160131h(20032, "wxface2face", "ScreenShot", "", "", "", "", 1, Integer.valueOf(this.f345604b1.f354516d), 0, mo175102S7(), Integer.valueOf(mo175104U7()), mo175103T7());
        }
        C77407n nVar2 = this.f345616j1;
        if ((nVar2 == null || !nVar2.mo107563h()) && (((qVar = this.f345614i1) == null || (gVar = qVar.f225839c) == null || !gVar.isShowing()) && (((e0Var = this.f345617k1) == null || !e0Var.mo140661h()) && ((wVar = this.f345630r1) == null || !wVar.mo12466f())))) {
            mo175112d8(this.f345604b1);
            mo175101Q7(1);
            return;
        }
        Log.m105924i("MicroMsg.CollectMainUI", "helper.isShowing() || isShowTips, do not showScreen Action");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f345632s1.mo104022e();
        }
    }

    public void setStatusColor() {
        setActionbarColor(getResources().getColor(C0966R.color.f2974b5));
        setActionbarElementColor(getResources().getColor(C0966R.color.f2975b6));
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C0006b.class);
    }
}
