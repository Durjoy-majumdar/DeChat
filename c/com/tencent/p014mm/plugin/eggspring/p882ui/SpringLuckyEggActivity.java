package com.tencent.p014mm.plugin.eggspring.p882ui;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import ht1.C60200t1;
import java.util.concurrent.CancellationException;
import ke3.C88144b;
import kg3.C76577a;
import kotlin.Metadata;
import kr0.C76630x0;
import p385u2.C111105a;
import p51.C110184g;
import p682rz.C101487r;
import p765yp.C112477a;
import p821rk.C48028a;
import p821rk.C48029b;
import p821rk.C48030c;
import p821rk.C48031d;
import p821rk.C48040m;
import p821rk.C48041n;
import p821rk.C48047t;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t51.C101718x;
import t51.C110912d;
import t51.C110913e;
import t51.C110914f;
import t51.C110915g;
import t51.C110916h;
import t51.C110917i;
import t51.C110920k;
import t51.C110922l;
import t51.C110923m;
import t51.C110924n;
import t51.C110925o;
import t51.C110926p;
import t51.C110928q;
import t51.C110929r;
import t51.C110935w;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112550d0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-eggspring_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity */
public final class SpringLuckyEggActivity extends MMActivity {

    /* renamed from: n */
    public static final /* synthetic */ int f312420n = 0;

    /* renamed from: d */
    public final C0000n0 f312421d = C53930o0.m60555b();

    /* renamed from: e */
    public final C13601g f312422e = C36568h.m40985a(new C105194c(this));

    /* renamed from: f */
    public C110928q f312423f;

    /* renamed from: g */
    public C101718x f312424g;

    /* renamed from: h */
    public long f312425h;

    /* renamed from: i */
    public final C13601g f312426i = C36568h.m40985a(new C105193b(this));

    /* renamed from: j */
    public final C13601g f312427j = C36568h.m40985a(new C105192a(this));

    /* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity$a */
    public static final class C105192a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ SpringLuckyEggActivity f312428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105192a(SpringLuckyEggActivity springLuckyEggActivity) {
            super(0);
            this.f312428d = springLuckyEggActivity;
        }

        public Object invoke() {
            return this.f312428d.getIntent().getStringExtra("app_id");
        }
    }

    /* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity$b */
    public static final class C105193b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ SpringLuckyEggActivity f312429d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105193b(SpringLuckyEggActivity springLuckyEggActivity) {
            super(0);
            this.f312429d = springLuckyEggActivity;
        }

        public Object invoke() {
            if (this.f312429d.getIntent().getExtras() != null) {
                return Boolean.valueOf(this.f312429d.getIntent().getBooleanExtra("is_chat_room", false));
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity$c */
    public static final class C105194c extends C87413o implements C32224a<C110935w> {

        /* renamed from: d */
        public final /* synthetic */ SpringLuckyEggActivity f312430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105194c(SpringLuckyEggActivity springLuckyEggActivity) {
            super(0);
            this.f312430d = springLuckyEggActivity;
        }

        public Object invoke() {
            SpringLuckyEggActivity springLuckyEggActivity = this.f312430d;
            C39622i0 a = C39629l0.m42233a(springLuckyEggActivity, new C105195a(springLuckyEggActivity)).mo75002a(C110935w.class);
            C87412m.m108593f(a, "invoke");
            return (C110935w) a;
        }
    }

    /* renamed from: H7 */
    public static final ColorStateList m141267H7(SpringLuckyEggActivity springLuckyEggActivity, int i, float f) {
        springLuckyEggActivity.getClass();
        float f2 = (float) 255;
        int argb = Color.argb((int) (f2 * f), Color.red(i), Color.green(i), Color.blue(i));
        int argb2 = Color.argb((int) (f2 * Math.min(f - 0.2f, 1.0f)), Color.red(i), Color.green(i), Color.blue(i));
        return new ColorStateList(new int[][]{new int[]{16842919}, StateSet.WILD_CARD}, new int[]{argb2, argb});
    }

    /* renamed from: I7 */
    public static final void m141268I7(SpringLuckyEggActivity springLuckyEggActivity, Object obj) {
        String str;
        String str2;
        springLuckyEggActivity.getClass();
        Class cls = C60200t1.class;
        Log.m105924i("MicroMsg.SpringLuckyEggActivity", "redirect: target=" + obj);
        if (obj instanceof C48028a) {
            Intent intent = new Intent();
            C48028a aVar = (C48028a) obj;
            String str3 = aVar.f128826e;
            C87412m.m108593f(str3, "target.ad_xml");
            if (C112550d0.m153769E(str3, "<adxml", 0, false, 6, (Object) null) >= 0) {
                str2 = aVar.f128826e;
            } else {
                str2 = "<adxml>" + aVar.f128826e + "</adxml>";
            }
            intent.putExtra("sns_landing_pages_xml", str2);
            intent.putExtra("sns_landig_pages_from_source", 14);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
            C88144b.m109791i(springLuckyEggActivity.getContext(), "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", intent, (Bundle) null);
        } else if (obj instanceof C48047t) {
            C86299o oVar = new C86299o();
            C48047t tVar = (C48047t) obj;
            String str4 = tVar.f128894d;
            C87412m.m108593f(str4, "target.app_user_name");
            if (C112551y.m153808h(str4, "@app", false, 2, (Object) null)) {
                str = tVar.f128894d;
            } else {
                str = tVar.f128894d + "@app";
            }
            oVar.f250929a = str;
            oVar.f250934f = tVar.f128895e;
            oVar.f250939k = 1189;
            oVar.f250931c = 0;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(MMApplicationContext.getContext(), oVar);
        } else if (obj instanceof C48040m) {
            String str5 = ((C48040m) obj).f128856d;
            Intent intent2 = new Intent();
            intent2.putExtra("rawUrl", str5);
            intent2.putExtra("from_shortcut", true);
            intent2.putExtra("disable_minimize", true);
            intent2.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
            intent2.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            C88144b.m109795m(springLuckyEggActivity, "webview", ".ui.tools.WebViewUI", intent2, 3001);
            springLuckyEggActivity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        } else if (obj instanceof C48031d) {
            C110935w M7 = springLuckyEggActivity.mo149514M7();
            C48031d dVar = (C48031d) obj;
            String str6 = dVar.f128830d;
            String str7 = "";
            if (str6 == null) {
                str6 = str7;
            }
            String str8 = dVar.f128831e;
            if (str8 != null) {
                str7 = str8;
            }
            M7.getClass();
            Log.m105924i("MicroMsg.SpringLuckyEggViewModel", "accept coupon: appId=" + str6 + ", stockId=" + str7 + ", traceId=" + M7.f331786g);
            C53895h.m60466d(M7.f331787h, (C66212f) null, (C53934p0) null, new C110929r(str6, str7, M7, (C15601d<? super C110929r>) null), 3, (Object) null);
        } else if (obj instanceof C48030c) {
            Intent intent3 = new Intent();
            intent3.putExtra("finder_username", ((C48030c) obj).f128829d);
            intent3.putExtra("key_session_id", String.valueOf(C110184g.f329622e));
            intent3.putExtra("key_comment_scene", 32);
            if (((Boolean) ((C36570n) springLuckyEggActivity.f312426i).getValue()).booleanValue()) {
                ((C60200t1) C86312j.m106911c(cls)).mo76842e7(3, 12, 32, intent3);
            } else {
                ((C60200t1) C86312j.m106911c(cls)).mo76842e7(2, 12, 32, intent3);
            }
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(springLuckyEggActivity, intent3);
        } else if (obj instanceof C48029b) {
            Intent intent4 = new Intent();
            intent4.putExtra("from_user", C75592q0.m90789s());
            C48029b bVar = (C48029b) obj;
            intent4.putExtra("feed_encrypted_object_id", bVar.f128827d);
            intent4.putExtra("feed_object_nonceId", bVar.f128828e);
            intent4.putExtra("key_session_id", String.valueOf(C110184g.f329622e));
            intent4.putExtra("key_comment_scene", 25);
            if (((Boolean) ((C36570n) springLuckyEggActivity.f312426i).getValue()).booleanValue()) {
                ((C60200t1) C86312j.m106911c(cls)).mo76842e7(3, 12, 25, intent4);
            } else {
                ((C60200t1) C86312j.m106911c(cls)).mo76842e7(2, 12, 25, intent4);
            }
            ((C60200t1) C86312j.m106911c(cls)).mo76864nr(springLuckyEggActivity, intent4);
        } else {
            springLuckyEggActivity.finish();
        }
    }

    /* renamed from: J7 */
    public static final int m141269J7(SpringLuckyEggActivity springLuckyEggActivity, String str, int i) {
        springLuckyEggActivity.getClass();
        if (str == null) {
            return C111105a.m151500b(springLuckyEggActivity, i);
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            Log.m105928w("MicroMsg.SpringLuckyEggActivity", "Illegal color value: " + str);
            return C111105a.m151500b(springLuckyEggActivity, i);
        }
    }

    /* renamed from: K7 */
    public static final void m141270K7(SpringLuckyEggActivity springLuckyEggActivity, String str, boolean z) {
        Drawable drawable;
        C110928q qVar = springLuckyEggActivity.f312423f;
        if (qVar != null) {
            ViewGroup.LayoutParams layoutParams = qVar.f331760p.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (z) {
                layoutParams2.width = springLuckyEggActivity.getResources().getDimensionPixelSize(C0966R.dimen.f4196vt);
                layoutParams2.height = springLuckyEggActivity.getResources().getDimensionPixelSize(C0966R.dimen.f4194vr);
                layoutParams2.topMargin = springLuckyEggActivity.getResources().getDimensionPixelSize(C0966R.dimen.f4195vs);
                layoutParams2.gravity = 1;
                Object obj = C111105a.f332697a;
                drawable = C111105a.C111110c.m151511b(springLuckyEggActivity, C0966R.C0969drawable.ccp);
                C87412m.m108591d(drawable);
            } else {
                layoutParams2.width = springLuckyEggActivity.getResources().getDimensionPixelSize(C0966R.dimen.f4190vn);
                layoutParams2.height = springLuckyEggActivity.getResources().getDimensionPixelSize(C0966R.dimen.f4189vm);
                layoutParams2.topMargin = 0;
                layoutParams2.gravity = 17;
                drawable = null;
            }
            C110928q qVar2 = springLuckyEggActivity.f312423f;
            if (qVar2 != null) {
                qVar2.f331760p.requestLayout();
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59346b = true;
                bVar.f59366v = true;
                bVar.f59350f = C112477a.f336782f + XVFSFile.SEPARATOR_CHAR + str.hashCode();
                bVar.f59360p = drawable;
                bVar.f59365u = (float) springLuckyEggActivity.getResources().getDimensionPixelSize(C0966R.dimen.f4197vu);
                C20937c a = bVar.mo32666a();
                C20828a b = C20828a.m22825b();
                C110928q qVar3 = springLuckyEggActivity.f312423f;
                if (qVar3 != null) {
                    b.mo32521j(str, qVar3.f331761q, a, new C110920k(springLuckyEggActivity));
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        } else {
            C87412m.m108603p("viewBinding");
            throw null;
        }
    }

    /* renamed from: L7 */
    public final Drawable mo149513L7(int i) {
        PaintDrawable paintDrawable = new PaintDrawable(i);
        paintDrawable.setCornerRadius((float) C76577a.m92150a(this, 4.0f));
        return paintDrawable;
    }

    /* renamed from: M7 */
    public final C110935w mo149514M7() {
        return (C110935w) ((C36570n) this.f312422e).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c5m;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f312425h = Util.nowMilliSecond();
        C110184g.f329624g = getIntent().getStringExtra("app_id");
        setMMTitle("");
        setBackBtn(new C110922l(this), C0966R.raw.icons_outlined_close);
        hideActionbarLine();
        getWindow().addFlags(128);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        setActionbarColor(0);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.iwc);
        MMAnimateView mMAnimateView = (MMAnimateView) findViewById(C0966R.C0970id.f358617g31);
        MMAnimateView mMAnimateView2 = mMAnimateView;
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.agd);
        TextView textView = (TextView) findViewById(C0966R.C0970id.agc);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.agb);
        TextView textView3 = textView2;
        View findViewById = findViewById(C0966R.C0970id.lvv);
        View view = findViewById;
        TextView textView4 = (TextView) findViewById(C0966R.C0970id.lvt);
        TextView textView5 = textView4;
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.ag9);
        ImageView imageView2 = imageView;
        MMAnimateView mMAnimateView3 = mMAnimateView;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(C0966R.C0970id.aww);
        TextView textView6 = textView4;
        ViewGroup viewGroup3 = viewGroup2;
        ViewGroup viewGroup4 = viewGroup2;
        ViewGroup viewGroup5 = (ViewGroup) findViewById(C0966R.C0970id.as_);
        MMAnimateView mMAnimateView4 = mMAnimateView2;
        View view2 = findViewById;
        ViewGroup viewGroup6 = viewGroup5;
        ViewGroup viewGroup7 = viewGroup5;
        MMAnimateView mMAnimateView5 = (MMAnimateView) findViewById(C0966R.C0970id.aso);
        WeImageView weImageView2 = weImageView;
        TextView textView7 = textView2;
        MMAnimateView mMAnimateView6 = mMAnimateView5;
        MMAnimateView mMAnimateView7 = mMAnimateView5;
        TextView textView8 = (TextView) findViewById(C0966R.C0970id.asp);
        TextView textView9 = textView;
        TextView textView10 = textView8;
        TextView textView11 = textView8;
        TextView textView12 = (TextView) findViewById(C0966R.C0970id.asd);
        TextView textView13 = textView3;
        WeImageView weImageView3 = weImageView;
        TextView textView14 = textView12;
        TextView textView15 = textView12;
        TextView textView16 = (TextView) findViewById(C0966R.C0970id.asc);
        TextView textView17 = textView16;
        TextView textView18 = textView16;
        Button button = (Button) findViewById(C0966R.C0970id.as9);
        Button button2 = button;
        Button button3 = button;
        MMAnimateView mMAnimateView8 = (MMAnimateView) findViewById(C0966R.C0970id.asa);
        MMAnimateView mMAnimateView9 = mMAnimateView8;
        MMAnimateView mMAnimateView10 = mMAnimateView8;
        ViewGroup viewGroup8 = (ViewGroup) findViewById(C0966R.C0970id.asb);
        ViewGroup viewGroup9 = viewGroup8;
        ViewGroup viewGroup10 = viewGroup8;
        ViewGroup viewGroup11 = (ViewGroup) findViewById(C0966R.C0970id.buv);
        ViewGroup viewGroup12 = viewGroup11;
        ViewGroup viewGroup13 = viewGroup11;
        TextView textView19 = (TextView) findViewById(C0966R.C0970id.gyr);
        TextView textView20 = textView19;
        TextView textView21 = textView19;
        ViewGroup viewGroup14 = (ViewGroup) findViewById(C0966R.C0970id.gyj);
        ViewGroup viewGroup15 = viewGroup14;
        ViewGroup viewGroup16 = viewGroup14;
        SpringEggVideoView springEggVideoView = (SpringEggVideoView) findViewById(C0966R.C0970id.ase);
        SpringEggVideoView springEggVideoView2 = springEggVideoView;
        SpringEggVideoView springEggVideoView3 = springEggVideoView;
        WeImageView weImageView4 = (WeImageView) findViewById(C0966R.C0970id.asf);
        View view3 = view;
        MMAnimateView mMAnimateView11 = mMAnimateView3;
        TextView textView22 = textView5;
        ViewGroup viewGroup17 = viewGroup4;
        ImageView imageView3 = imageView;
        ViewGroup viewGroup18 = viewGroup7;
        TextView textView23 = textView10;
        MMAnimateView mMAnimateView12 = mMAnimateView7;
        MMAnimateView mMAnimateView13 = mMAnimateView6;
        TextView textView24 = textView11;
        ViewGroup viewGroup19 = viewGroup3;
        TextView textView25 = textView15;
        ViewGroup viewGroup20 = viewGroup6;
        TextView textView26 = textView18;
        TextView textView27 = textView14;
        Button button4 = button3;
        C110928q qVar = r2;
        C87412m.m108593f(viewGroup, "findViewById(R.id.root)");
        C87412m.m108593f(mMAnimateView11, "findViewById(R.id.loading_animator)");
        C87412m.m108593f(weImageView3, "findViewById(R.id.bottom…itle_clickable_indicator)");
        C87412m.m108593f(textView, "findViewById(R.id.bottom_brand_title)");
        C87412m.m108593f(textView7, "findViewById(R.id.bottom_brand_subtitle)");
        C87412m.m108593f(view2, "findViewById(R.id.bottom_subtitle_divider)");
        C87412m.m108593f(textView6, "findViewById(R.id.bottom_brand_close)");
        C87412m.m108593f(imageView2, "findViewById(R.id.bottom_background_image)");
        C87412m.m108593f(textView24, "findViewById(R.id.card_brand_name)");
        C87412m.m108593f(mMAnimateView12, "findViewById(R.id.card_brand_logo)");
        C87412m.m108593f(viewGroup17, "findViewById(R.id.card_root)");
        C87412m.m108593f(viewGroup18, "findViewById(R.id.card_bag_container)");
        C87412m.m108593f(textView25, "findViewById(R.id.card_bag_title)");
        C87412m.m108593f(textView26, "findViewById(R.id.card_bag_subtitle)");
        C87412m.m108593f(button4, "findViewById(R.id.card_bag_accept_btn)");
        C87412m.m108593f(viewGroup10, "findViewById(R.id.card_bag_media_container)");
        C87412m.m108593f(mMAnimateView10, "findViewById(R.id.card_bag_cover)");
        C87412m.m108593f(viewGroup13, "findViewById(R.id.cover_container)");
        C87412m.m108593f(textView21, "findViewById(R.id.money_value)");
        C87412m.m108593f(viewGroup16, "findViewById(R.id.money_container)");
        C87412m.m108593f(springEggVideoView3, "findViewById(R.id.card_bag_video)");
        C87412m.m108593f(weImageView4, "findViewById(R.id.card_bag_volume_switch)");
        ViewGroup viewGroup21 = viewGroup;
        MMAnimateView mMAnimateView14 = mMAnimateView4;
        WeImageView weImageView5 = weImageView2;
        TextView textView28 = textView13;
        View view4 = view3;
        C110928q qVar2 = new C110928q(viewGroup21, mMAnimateView14, weImageView5, textView, textView28, view4, textView22, imageView3, textView23, mMAnimateView13, viewGroup19, viewGroup20, textView27, textView17, button2, viewGroup9, mMAnimateView9, viewGroup12, textView20, viewGroup15, springEggVideoView2, weImageView4);
        C110928q qVar3 = qVar;
        this.f312423f = qVar3;
        qVar3.f331745a.getViewTreeObserver().addOnGlobalLayoutListener(new C110923m(this));
        String str = C112477a.f336783g;
        if (C86013q1.m106450k(str)) {
            C110928q qVar4 = this.f312423f;
            if (qVar4 != null) {
                qVar4.f331746b.setImageFilePath(str);
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        } else {
            C110928q qVar5 = this.f312423f;
            if (qVar5 != null) {
                qVar5.f331746b.setImageResource(C0966R.C0969drawable.f357242c50);
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        }
        C110928q qVar6 = this.f312423f;
        if (qVar6 != null) {
            qVar6.f331759o.setOnClickListener(new C110924n(this));
            findViewById(C0966R.C0970id.age).setOnClickListener(new C110925o(this));
            C110928q qVar7 = this.f312423f;
            if (qVar7 != null) {
                qVar7.f331751g.setOnClickListener(new C110926p(this));
                mo149514M7().f331790n.observe(this, new C110912d(this));
                mo149514M7().f331788i.observe(this, new C110913e(this));
                mo149514M7().f331793q.observe(this, new C110914f(this));
                mo149514M7().f331794r.observe(this, new C110915g(this));
                mo149514M7().f331789j.observe(this, new C110916h(this));
                mo149514M7().f331795s.observe(this, new C110917i(this));
                return;
            }
            C87412m.m108603p("viewBinding");
            throw null;
        }
        C87412m.m108603p("viewBinding");
        throw null;
    }

    public void onDestroy() {
        long j;
        super.onDestroy();
        C48041n value = mo149514M7().f331793q.getValue();
        long j2 = value != null ? value.f128876u : 0;
        C101718x xVar = this.f312424g;
        long j3 = xVar != null ? xVar.f297783o : 0;
        int i = xVar != null ? xVar.f297782n : 0;
        if (xVar != null) {
            long j4 = xVar.f297780i;
            j = j4 > 0 ? xVar.f297781j + Util.milliSecondsToNow(j4) : xVar.f297781j;
        } else {
            j = 0;
        }
        C115669n.INSTANCE.mo160131h(18916, C110184g.f329622e, "", 16, "", Long.valueOf(j3), Integer.valueOf(i), Long.valueOf(j), "", C110184g.f329624g, Long.valueOf(j2));
        C101718x xVar2 = this.f312424g;
        if (xVar2 != null) {
            Log.m105924i("MicroMsg.VideoController", "release");
            String str = xVar2.f297778g;
            if (str != null) {
                ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126983g(str, (Object[]) null);
            }
            xVar2.f297775d.mo79616c();
            xVar2.f297780i = 0;
        }
        C110928q qVar = this.f312423f;
        if (qVar != null) {
            qVar.f331746b.mo129237x();
            C53930o0.m60558e(this.f312421d, (CancellationException) null, 1, (Object) null);
            return;
        }
        C87412m.m108603p("viewBinding");
        throw null;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.SpringLuckyEggActivity", "onPause");
        C101718x xVar = this.f312424g;
        if (xVar != null) {
            Log.m105924i("MicroMsg.VideoController", "pause");
            xVar.f297775d.mo79614b();
            xVar.f297781j += Util.milliSecondsToNow(xVar.f297780i);
            xVar.f297780i = 0;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.SpringLuckyEggActivity", "onResume");
        C101718x xVar = this.f312424g;
        if (xVar != null) {
            Log.m105924i("MicroMsg.VideoController", "resume");
            xVar.f297782n--;
            xVar.f297775d.mo79617f();
            xVar.f297780i = Util.nowMilliSecond();
        }
    }
}
