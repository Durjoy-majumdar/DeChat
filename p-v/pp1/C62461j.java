package pp1;

import a14.C0000n0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.xweb.file.XVFSFile;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58739j4;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h81.C59774i;
import he0.C46025n;
import he0.C59837i;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76629w0;
import np1.C61817a;
import np1.C61852b;
import np1.C61854c;
import o40.C61926c;
import o40.C61937h;
import ok1.C62042e;
import ok1.C62062f;
import p185kq.C10383h;
import p573jk.C76417a;
import p629ny.C76979h;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qo3.C12925w;
import r60.C101350i;
import rn1.C13091a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63965x;
import t60.C64207e;
import t91.C64208c;
import te3.C49178dp1;
import te3.C49810i73;
import te3.C50019jp1;
import te3.C50926q81;
import te3.C51195s3;
import te3.C64388g93;
import te3.C64426ho2;
import te3.C64434i11;
import te3.C64837xq2;
import te3.t44;
import tf0.C13883o1;
import tf0.C64916p1;
import tl3.C78039a;
import up1.C27696y;
import up1.C37521f;
import wc1.C15064b;
import x60.C102564a;
import zc1.C66785b;

/* renamed from: pp1.j */
public final class C62461j implements View.OnClickListener {

    /* renamed from: A */
    public final C13601g f177475A;

    /* renamed from: B */
    public final C13601g f177476B;

    /* renamed from: C */
    public final C13601g f177477C;

    /* renamed from: D */
    public final C13601g f177478D;

    /* renamed from: d */
    public final C61817a f177479d;

    /* renamed from: e */
    public final ViewGroup f177480e;

    /* renamed from: f */
    public final C45795b f177481f;

    /* renamed from: g */
    public final C0000n0 f177482g;

    /* renamed from: h */
    public final String f177483h = "ShoppingPanelHeaderHolder";

    /* renamed from: i */
    public final C13601g f177484i = C36568h.m40985a(new C62485x(this));

    /* renamed from: j */
    public final C13601g f177485j = C36568h.m40985a(new C62471j(this));

    /* renamed from: n */
    public final C13601g f177486n = C36568h.m40985a(new C62464c(this));

    /* renamed from: o */
    public final C13601g f177487o = C36568h.m40985a(new C62465d(this));

    /* renamed from: p */
    public final C13601g f177488p = C36568h.m40985a(new C62469h(this));

    /* renamed from: q */
    public final C13601g f177489q;

    /* renamed from: r */
    public final C13601g f177490r;

    /* renamed from: s */
    public final C13601g f177491s;

    /* renamed from: t */
    public final C13601g f177492t;

    /* renamed from: u */
    public final C13601g f177493u;

    /* renamed from: v */
    public final C13601g f177494v;

    /* renamed from: w */
    public final C13601g f177495w;

    /* renamed from: x */
    public final C13601g f177496x;

    /* renamed from: y */
    public final C13601g f177497y;

    /* renamed from: z */
    public final C13601g f177498z;

    /* renamed from: pp1.j$a */
    public static final class C62462a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C62461j f177499a;

        public C62462a(C62461j jVar) {
            this.f177499a = jVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C62460i((Bitmap) obj, this.f177499a));
        }
    }

    /* renamed from: pp1.j$b */
    public static final class C62463b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177500d;

        /* renamed from: e */
        public final /* synthetic */ C64426ho2 f177501e;

        public C62463b(C62461j jVar, C64426ho2 ho22) {
            this.f177500d = jVar;
            this.f177501e = ho22;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShowLicense$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            Context context = this.f177500d.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C64837xq2 xq22 = new C64837xq2();
            C64426ho2 ho22 = this.f177501e;
            FinderJumpInfo finderJumpInfo = new FinderJumpInfo();
            finderJumpInfo.lite_app_info = ho22;
            finderJumpInfo.jumpinfo_type = 6;
            xq22.f186379e = finderJumpInfo;
            xq22.f186380f = true;
            xq22.f186381g = true;
            xq22.f186382h = 1;
            C13598b0 b0Var = C13598b0.f38549a;
            C64916p1.C64917a.m76439f((C64916p1) c, context, xq22, (C86299o) null, (C60905o) null, 8, (Object) null);
            this.f177500d.f177479d.mo86761q();
            String str = this.f177500d.f177483h;
            Log.m105924i(str, "enter licenseLiteApp " + C61937h.m72709h(this.f177501e));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShowLicense$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pp1.j$c */
    public static final class C62464c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177502d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62464c(C62461j jVar) {
            super(0);
            this.f177502d = jVar;
        }

        public Object invoke() {
            return this.f177502d.mo87511o().findViewById(C0966R.C0970id.dyu);
        }
    }

    /* renamed from: pp1.j$d */
    public static final class C62465d extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62465d(C62461j jVar) {
            super(0);
            this.f177503d = jVar;
        }

        public Object invoke() {
            return (WeImageView) this.f177503d.mo87511o().findViewById(C0966R.C0970id.dyv);
        }
    }

    /* renamed from: pp1.j$e */
    public static final class C62466e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C62466e f177504d = new C62466e();

        public C62466e() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_enable_customer_service_entry, 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: pp1.j$f */
    public static final class C62467f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62467f(C62461j jVar) {
            super(0);
            this.f177505d = jVar;
        }

        public Object invoke() {
            return this.f177505d.mo87511o().findViewById(C0966R.C0970id.m2l);
        }
    }

    /* renamed from: pp1.j$g */
    public static final class C62468g extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62468g(C62461j jVar) {
            super(0);
            this.f177506d = jVar;
        }

        public Object invoke() {
            View findViewById = this.f177506d.mo87504h().findViewById(C0966R.C0970id.m2n);
            C62461j jVar = this.f177506d;
            TextView textView = (TextView) findViewById;
            C15064b bVar = C15064b.f41199a;
            Context context = jVar.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C15064b.m14230a(bVar, context, textView, 15.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.j$h */
    public static final class C62469h extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62469h(C62461j jVar) {
            super(0);
            this.f177507d = jVar;
        }

        public Object invoke() {
            return this.f177507d.mo87511o().findViewById(C0966R.C0970id.f358232dz3);
        }
    }

    /* renamed from: pp1.j$i */
    public static final class C62470i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62470i(C62461j jVar) {
            super(0);
            this.f177508d = jVar;
        }

        public Object invoke() {
            View findViewById = this.f177508d.mo87511o().findViewById(C0966R.C0970id.dz5);
            C62461j jVar = this.f177508d;
            TextView textView = (TextView) findViewById;
            C15064b bVar = C15064b.f41199a;
            Context context = jVar.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C15064b.m14230a(bVar, context, textView, 15.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.j$j */
    public static final class C62471j extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62471j(C62461j jVar) {
            super(0);
            this.f177509d = jVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f177509d.mo87511o().findViewById(C0966R.C0970id.dza);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            return textView;
        }
    }

    /* renamed from: pp1.j$k */
    public static final class C62472k extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62472k(C62461j jVar) {
            super(0);
            this.f177510d = jVar;
        }

        public Object invoke() {
            return (ImageView) this.f177510d.mo87507k().findViewById(C0966R.C0970id.o3h);
        }
    }

    /* renamed from: pp1.j$l */
    public static final class C62473l extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62473l(C62461j jVar) {
            super(0);
            this.f177511d = jVar;
        }

        public Object invoke() {
            return (TextView) this.f177511d.mo87507k().findViewById(C0966R.C0970id.o3i);
        }
    }

    /* renamed from: pp1.j$m */
    public static final class C62474m extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177512d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62474m(C62461j jVar) {
            super(0);
            this.f177512d = jVar;
        }

        public Object invoke() {
            return this.f177512d.mo87507k().findViewById(C0966R.C0970id.o3k);
        }
    }

    /* renamed from: pp1.j$n */
    public static final class C62475n extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177513d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62475n(C62461j jVar) {
            super(0);
            this.f177513d = jVar;
        }

        public Object invoke() {
            return this.f177513d.mo87511o().findViewById(C0966R.C0970id.dz8);
        }
    }

    /* renamed from: pp1.j$o */
    public static final class C62476o extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177514d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62476o(C62461j jVar) {
            super(0);
            this.f177514d = jVar;
        }

        public Object invoke() {
            return (WeImageView) this.f177514d.mo87506j().findViewById(C0966R.C0970id.dz9);
        }
    }

    /* renamed from: pp1.j$p */
    public static final class C62477p extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177515d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62477p(C62461j jVar) {
            super(0);
            this.f177515d = jVar;
        }

        public Object invoke() {
            View findViewById = this.f177515d.mo87506j().findViewById(C0966R.C0970id.dz_);
            C62461j jVar = this.f177515d;
            TextView textView = (TextView) findViewById;
            C15064b bVar = C15064b.f41199a;
            Context context = jVar.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C15064b.m14230a(bVar, context, textView, 15.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.j$q */
    public static final class C62478q extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177516d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62478q(C62461j jVar) {
            super(0);
            this.f177516d = jVar;
        }

        public Object invoke() {
            View findViewById = this.f177516d.mo87507k().findViewById(C0966R.C0970id.n44);
            C62461j jVar = this.f177516d;
            TextView textView = (TextView) findViewById;
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            C15064b bVar = C15064b.f41199a;
            Context context = jVar.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C15064b.m14230a(bVar, context, textView, 10.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.j$r */
    public static final class C62479r extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177517d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62479r(C62461j jVar) {
            super(0);
            this.f177517d = jVar;
        }

        public Object invoke() {
            return this.f177517d.mo87511o().findViewById(C0966R.C0970id.n45);
        }
    }

    /* renamed from: pp1.j$s */
    public static final class C62480s extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62480s(C62461j jVar) {
            super(0);
            this.f177518d = jVar;
        }

        public Object invoke() {
            View findViewById = this.f177518d.mo87507k().findViewById(C0966R.C0970id.o3j);
            C62461j jVar = this.f177518d;
            TextView textView = (TextView) findViewById;
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            C15064b bVar = C15064b.f41199a;
            Context context = jVar.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C15064b bVar2 = bVar;
            TextView textView2 = textView;
            C15064b.m14230a(bVar2, context, textView2, 12.0f, 0.0f, 8, (Object) null);
            Context context2 = jVar.f177480e.getContext();
            C87412m.m108593f(context2, "root.context");
            C15064b.m14231f(bVar2, context2, textView2, 0.0f, 4, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.j$t */
    public static final class C62481t extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62481t(C62461j jVar) {
            super(0);
            this.f177519d = jVar;
        }

        public Object invoke() {
            View findViewById = this.f177519d.mo87507k().findViewById(C0966R.C0970id.n46);
            C62461j jVar = this.f177519d;
            TextView textView = (TextView) findViewById;
            C62042e eVar = C62042e.f176370a;
            C87412m.m108593f(textView, "this");
            eVar.getClass();
            try {
                textView.setTypeface(Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), "fonts/SF-Pro-Text-MediumItalic.ttf"));
            } catch (Exception e) {
                Log.m105920e("FinderLiveUtil", "setShopScoreTypeFace() Exception:" + e.getMessage());
            }
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            C15064b bVar = C15064b.f41199a;
            Context context = jVar.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.j$u */
    public static final class C62482u extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62482u(C62461j jVar) {
            super(0);
            this.f177520d = jVar;
        }

        public Object invoke() {
            View findViewById = this.f177520d.mo87510n().findViewById(C0966R.C0970id.f359199oa2);
            C62461j jVar = this.f177520d;
            ImageView imageView = (ImageView) findViewById;
            C15064b bVar = C15064b.f41199a;
            Context context = jVar.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C15064b.m14231f(bVar, context, imageView, 0.0f, 4, (Object) null);
            return imageView;
        }
    }

    /* renamed from: pp1.j$v */
    public static final class C62483v extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62483v(C62461j jVar) {
            super(0);
            this.f177521d = jVar;
        }

        public Object invoke() {
            View findViewById = this.f177521d.mo87510n().findViewById(C0966R.C0970id.n47);
            C62461j jVar = this.f177521d;
            TextView textView = (TextView) findViewById;
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            C15064b bVar = C15064b.f41199a;
            Context context = jVar.f177480e.getContext();
            C87412m.m108593f(context, "root.context");
            C15064b.m14230a(bVar, context, textView, 16.0f, 0.0f, 8, (Object) null);
            return textView;
        }
    }

    /* renamed from: pp1.j$w */
    public static final class C62484w extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62484w(C62461j jVar) {
            super(0);
            this.f177522d = jVar;
        }

        public Object invoke() {
            return this.f177522d.mo87511o().findViewById(C0966R.C0970id.n1u);
        }
    }

    /* renamed from: pp1.j$x */
    public static final class C62485x extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C62461j f177523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62485x(C62461j jVar) {
            super(0);
            this.f177523d = jVar;
        }

        public Object invoke() {
            return this.f177523d.f177480e.findViewById(C0966R.C0970id.dzb);
        }
    }

    public C62461j(C61817a aVar, ViewGroup viewGroup, C45795b bVar, C0000n0 n0Var) {
        C87412m.m108594g(aVar, "shoppingList");
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "buContext");
        this.f177479d = aVar;
        this.f177480e = viewGroup;
        this.f177481f = bVar;
        this.f177482g = n0Var;
        C13601g a = C36568h.m40985a(new C62470i(this));
        this.f177489q = a;
        this.f177490r = C36568h.m40985a(new C62467f(this));
        C13601g a2 = C36568h.m40985a(new C62468g(this));
        this.f177491s = C36568h.m40985a(new C62484w(this));
        this.f177492t = C36568h.m40985a(new C62483v(this));
        this.f177493u = C36568h.m40985a(new C62482u(this));
        this.f177494v = C36568h.m40985a(new C62479r(this));
        this.f177495w = C36568h.m40985a(new C62481t(this));
        this.f177496x = C36568h.m40985a(new C62480s(this));
        this.f177497y = C36568h.m40985a(new C62474m(this));
        this.f177498z = C36568h.m40985a(new C62472k(this));
        this.f177475A = C36568h.m40985a(new C62473l(this));
        this.f177476B = C36568h.m40985a(new C62478q(this));
        this.f177477C = C36568h.m40985a(new C62475n(this));
        C13601g a3 = C36568h.m40985a(new C62477p(this));
        C36568h.m40985a(new C62476o(this));
        if (LocaleUtil.isChineseAppLang() && !C76417a.m91844a()) {
            Object value = ((C36570n) a2).getValue();
            C87412m.m108593f(value, "<get-licenseTv>(...)");
            ((TextView) value).setVisibility(0);
            Object value2 = ((C36570n) a3).getValue();
            C87412m.m108593f(value2, "<get-serviceTv>(...)");
            ((TextView) value2).setVisibility(0);
            Object value3 = ((C36570n) a).getValue();
            C87412m.m108593f(value3, "<get-orderTv>(...)");
            ((TextView) value3).setVisibility(0);
        } else {
            Object value4 = ((C36570n) a2).getValue();
            C87412m.m108593f(value4, "<get-licenseTv>(...)");
            ((TextView) value4).setVisibility(8);
            Object value5 = ((C36570n) a3).getValue();
            C87412m.m108593f(value5, "<get-serviceTv>(...)");
            ((TextView) value5).setVisibility(8);
            Object value6 = ((C36570n) a).getValue();
            C87412m.m108593f(value6, "<get-orderTv>(...)");
            ((TextView) value6).setVisibility(8);
        }
        this.f177478D = C36568h.m40985a(C62466e.f177504d);
    }

    /* renamed from: a */
    public static final void m73429a(C62461j jVar, boolean z) {
        C62461j jVar2 = jVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        Class cls3 = C54979h1.class;
        t44 t44 = ((C54979h1) jVar2.f177481f.mo71262a(cls3)).f154117I;
        int i = t44 != null ? t44.f185496r : 0;
        t44 t442 = ((C54979h1) jVar2.f177481f.mo71262a(cls3)).f154117I;
        String str = null;
        String str2 = t442 != null ? t442.f185497s : null;
        t44 t443 = ((C54979h1) jVar2.f177481f.mo71262a(cls3)).f154117I;
        if (t443 != null) {
            str = t443.f185498t;
        }
        if (!z || i == 0) {
            Object value = ((C36570n) jVar2.f177498z).getValue();
            C87412m.m108593f(value, "<get-scoreGuaranteeIcon>(...)");
            ((ImageView) value).setVisibility(8);
            Object value2 = ((C36570n) jVar2.f177475A).getValue();
            C87412m.m108593f(value2, "<get-scoreGuaranteeTv>(...)");
            ((TextView) value2).setVisibility(8);
            Object value3 = ((C36570n) jVar2.f177497y).getValue();
            C87412m.m108593f(value3, "<get-scoreSpiltLine>(...)");
            View view = (View) value3;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        Object value4 = ((C36570n) jVar2.f177497y).getValue();
        C87412m.m108593f(value4, "<get-scoreSpiltLine>(...)");
        View view3 = (View) value4;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkScore$setGuarantee", "(Lcom/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Object value5 = ((C36570n) jVar2.f177498z).getValue();
        C87412m.m108593f(value5, "<get-scoreGuaranteeIcon>(...)");
        ((ImageView) value5).setVisibility(0);
        Object value6 = ((C36570n) jVar2.f177475A).getValue();
        C87412m.m108593f(value6, "<get-scoreGuaranteeTv>(...)");
        ((TextView) value6).setVisibility(0);
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
        C11984n0 n0Var = new C11984n0(str2, C27696y.RAW_IMAGE);
        Object value7 = ((C36570n) jVar2.f177498z).getValue();
        C87412m.m108593f(value7, "<get-scoreGuaranteeIcon>(...)");
        f2.mo85957c(n0Var, (ImageView) value7, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
        Object value8 = ((C36570n) jVar2.f177475A).getValue();
        C87412m.m108593f(value8, "<get-scoreGuaranteeTv>(...)");
        ((TextView) value8).setText(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ee A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0208 A[Catch:{ Exception -> 0x01e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x025a A[SYNTHETIC, Splitter:B:74:0x025a] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0268 A[Catch:{ Exception -> 0x0263 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02f4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87498b() {
        /*
            r23 = this;
            r1 = r23
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.Class<cl1.h1> r3 = cl1.C54979h1.class
            fj1.b r4 = r1.f177481f
            androidx.lifecycle.i0 r4 = r4.mo71262a(r3)
            cl1.h1 r4 = (cl1.C54979h1) r4
            te3.t44 r4 = r4.f154117I
            if (r4 == 0) goto L_0x0017
            java.lang.String r4 = r4.f185485d
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L_0x0025
            int r8 = r4.length()
            if (r8 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r8 = 0
            goto L_0x0026
        L_0x0025:
            r8 = 1
        L_0x0026:
            if (r8 != 0) goto L_0x0364
            android.view.View r8 = r23.mo87510n()
            int r8 = r8.getVisibility()
            if (r8 == 0) goto L_0x0055
            java.lang.Class<ak1.w> r8 = ak1.C54116w.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            java.lang.String r9 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r8, r9)
            r10 = r8
            ak1.w r10 = (ak1.C54116w) r10
            ak1.f0$r0 r11 = ak1.C54067f0.C54081r0.CommerceActionShopWindowExpose
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 504(0x1f8, float:7.06E-43)
            r22 = 0
            ak1.C54116w.Rx0(r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22)
        L_0x0055:
            rx3.g r8 = r1.f177492t
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            java.lang.String r9 = "<get-shopWindowDesc>(...)"
            gy3.C87412m.m108593f(r8, r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r8.setText(r4)
            fj1.b r4 = r1.f177481f
            androidx.lifecycle.i0 r4 = r4.mo71262a(r3)
            cl1.h1 r4 = (cl1.C54979h1) r4
            te3.t44 r4 = r4.f154117I
            r8 = 8
            if (r4 == 0) goto L_0x00d6
            java.util.LinkedList<te3.r44> r4 = r4.f185489h
            if (r4 == 0) goto L_0x00d6
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            te3.r44 r4 = (te3.r44) r4
            if (r4 == 0) goto L_0x00d6
            java.lang.String r9 = r4.f140690d
            if (r9 == 0) goto L_0x008e
            int r9 = r9.length()
            if (r9 != 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r9 = 0
            goto L_0x008f
        L_0x008e:
            r9 = 1
        L_0x008f:
            if (r9 == 0) goto L_0x0099
            android.widget.ImageView r0 = r23.mo87509m()
            r0.setVisibility(r8)
            goto L_0x00d3
        L_0x0099:
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r10 = r9.mo62446e(r2)
            bl3.c r10 = r10.mo62447c(r0)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11871f2()
            pl1.n0 r11 = new pl1.n0
            java.lang.String r4 = r4.f140690d
            up1.y r12 = up1.C27696y.RAW_IMAGE
            r11.<init>(r4, r12)
            pl1.e0$a r4 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r2 = r9.mo62446e(r2)
            bl3.c r0 = r2.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r4)
            l60.b r0 = r10.mo85956b(r11, r0)
            pp1.j$a r2 = new pp1.j$a
            r2.<init>(r1)
            r0.getClass()
            r0.f291320d = r2
            r0.mo85951a()
        L_0x00d3:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x00d7
        L_0x00d6:
            r0 = 0
        L_0x00d7:
            if (r0 != 0) goto L_0x00e0
            android.widget.ImageView r0 = r23.mo87509m()
            r0.setVisibility(r8)
        L_0x00e0:
            r1.mo87514q(r7)
            android.view.View r0 = r23.mo87510n()
            pp1.k r2 = new pp1.k
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            fj1.b r0 = r1.f177481f
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.h1 r0 = (cl1.C54979h1) r0
            te3.t44 r0 = r0.f154117I
            if (r0 == 0) goto L_0x0102
            int r0 = r0.f185490i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            if (r0 != 0) goto L_0x0106
            goto L_0x010c
        L_0x0106:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0317
        L_0x010c:
            android.view.View r0 = r23.mo87507k()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2.mo10233c(r4)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder"
            java.lang.String r12 = "checkScore"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r2 = r2.mo10231a(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder"
            java.lang.String r11 = "checkScore"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            fj1.b r0 = r1.f177481f
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.h1 r0 = (cl1.C54979h1) r0
            te3.t44 r0 = r0.f154117I
            if (r0 == 0) goto L_0x0164
            int r0 = r0.f185491j
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = r0
            goto L_0x0165
        L_0x0164:
            r2 = 0
        L_0x0165:
            fj1.b r0 = r1.f177481f
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.h1 r0 = (cl1.C54979h1) r0
            te3.t44 r0 = r0.f154117I
            if (r0 == 0) goto L_0x0175
            java.lang.String r0 = r0.f185492n
            r4 = r0
            goto L_0x0176
        L_0x0175:
            r4 = 0
        L_0x0176:
            fj1.b r0 = r1.f177481f
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.h1 r0 = (cl1.C54979h1) r0
            te3.t44 r0 = r0.f154117I
            if (r0 == 0) goto L_0x0186
            java.lang.String r0 = r0.f185493o
            r9 = r0
            goto L_0x0187
        L_0x0186:
            r9 = 0
        L_0x0187:
            fj1.b r0 = r1.f177481f
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.h1 r0 = (cl1.C54979h1) r0
            te3.t44 r0 = r0.f154117I
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = r0.f185494p
            r10 = r0
            goto L_0x0198
        L_0x0197:
            r10 = 0
        L_0x0198:
            android.widget.TextView r11 = r23.mo87508l()
            rx3.g r0 = r1.f177495w
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r12 = "<get-shopScoreValue>(...)"
            gy3.C87412m.m108593f(r0, r12)
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            rx3.g r0 = r1.f177476B
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r14 = "<get-shopScoreDesc>(...)"
            gy3.C87412m.m108593f(r0, r14)
            r15 = r0
            android.widget.TextView r15 = (android.widget.TextView) r15
            java.lang.String r0 = r1.f177483h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "setScoreGroupBg serverBgColor:"
            r5.append(r7)
            r5.append(r9)
            java.lang.String r7 = ",serverTextColor:"
            r5.append(r7)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            r5 = 2131232846(0x7f08084e, float:1.8081813E38)
            if (r9 == 0) goto L_0x01eb
            int r0 = r9.length()     // Catch:{ Exception -> 0x01e9 }
            if (r0 != 0) goto L_0x01e7
            goto L_0x01eb
        L_0x01e7:
            r0 = 0
            goto L_0x01ec
        L_0x01e9:
            r0 = move-exception
            goto L_0x021d
        L_0x01eb:
            r0 = 1
        L_0x01ec:
            if (r0 != 0) goto L_0x0208
            int r0 = android.graphics.Color.parseColor(r9)     // Catch:{ Exception -> 0x01e9 }
            android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable     // Catch:{ Exception -> 0x01e9 }
            r8.<init>()     // Catch:{ Exception -> 0x01e9 }
            r8.setShape(r6)     // Catch:{ Exception -> 0x01e9 }
            wk1.n r19 = wk1.C15440n.f41895a     // Catch:{ Exception -> 0x01e9 }
            int r6 = r19.mo14261j()     // Catch:{ Exception -> 0x01e9 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x01e9 }
            r8.setCornerRadius(r6)     // Catch:{ Exception -> 0x01e9 }
            r8.setColor(r0)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0244
        L_0x0208:
            android.graphics.drawable.Drawable r8 = r11.getBackground()     // Catch:{ Exception -> 0x01e9 }
            if (r8 != 0) goto L_0x0244
            android.view.ViewGroup r0 = r1.f177480e     // Catch:{ Exception -> 0x01e9 }
            android.content.Context r0 = r0.getContext()     // Catch:{ Exception -> 0x01e9 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x01e9 }
            android.graphics.drawable.Drawable r8 = r0.getDrawable(r5)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x0244
        L_0x021d:
            java.lang.String r6 = r1.f177483h
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            java.lang.String r0 = ",serverBgColor:"
            r8.append(r0)
            r8.append(r9)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            android.view.ViewGroup r0 = r1.f177480e
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r8 = r0.getDrawable(r5)
        L_0x0244:
            r11.setBackground(r8)
            android.view.ViewGroup r0 = r1.f177480e
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131100709(0x7f060425, float:1.7813807E38)
            int r0 = r0.getColor(r5)
            if (r10 == 0) goto L_0x0265
            int r6 = r10.length()     // Catch:{ Exception -> 0x0263 }
            if (r6 != 0) goto L_0x0261
            goto L_0x0265
        L_0x0261:
            r6 = 0
            goto L_0x0266
        L_0x0263:
            r0 = move-exception
            goto L_0x026d
        L_0x0265:
            r6 = 1
        L_0x0266:
            if (r6 != 0) goto L_0x0292
            int r0 = android.graphics.Color.parseColor(r10)     // Catch:{ Exception -> 0x0263 }
            goto L_0x0292
        L_0x026d:
            java.lang.String r6 = r1.f177483h
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r7)
            r8.append(r10)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            android.view.ViewGroup r0 = r1.f177480e
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r5)
        L_0x0292:
            r11.setTextColor(r0)
            r13.setTextColor(r0)
            r15.setTextColor(r0)
            rx3.g r0 = r1.f177495w
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r12)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.text.DecimalFormat r5 = new java.text.DecimalFormat
            java.lang.String r6 = ".00"
            r5.<init>(r6)
            if (r2 == 0) goto L_0x02b6
            int r2 = r2.intValue()
            goto L_0x02b7
        L_0x02b6:
            r2 = 0
        L_0x02b7:
            float r2 = (float) r2
            r6 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r6
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.String r2 = r5.format(r2)
            r0.setText(r2)
            rx3.g r0 = r1.f177476B
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            gy3.C87412m.m108593f(r0, r14)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r4 == 0) goto L_0x02d6
            goto L_0x02d8
        L_0x02d6:
            java.lang.String r4 = ""
        L_0x02d8:
            r0.setText(r4)
            fj1.b r0 = r1.f177481f
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.h1 r0 = (cl1.C54979h1) r0
            te3.t44 r0 = r0.f154117I
            if (r0 == 0) goto L_0x02ea
            java.lang.String r5 = r0.f185495q
            goto L_0x02eb
        L_0x02ea:
            r5 = 0
        L_0x02eb:
            if (r5 == 0) goto L_0x02f6
            int r0 = r5.length()
            if (r0 != 0) goto L_0x02f4
            goto L_0x02f6
        L_0x02f4:
            r0 = 0
            goto L_0x02f7
        L_0x02f6:
            r0 = 1
        L_0x02f7:
            if (r0 == 0) goto L_0x0303
            android.widget.TextView r0 = r23.mo87508l()
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0312
        L_0x0303:
            android.widget.TextView r0 = r23.mo87508l()
            r2 = 0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r23.mo87508l()
            r0.setText(r5)
        L_0x0312:
            r2 = 1
            m73429a(r1, r2)
            goto L_0x0368
        L_0x0317:
            android.view.View r0 = r23.mo87507k()
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder"
            java.lang.String r6 = "checkScore"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder"
            java.lang.String r5 = "checkScore"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            m73429a(r1, r2)
            goto L_0x0368
        L_0x0364:
            r2 = 0
            r1.mo87514q(r2)
        L_0x0368:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pp1.C62461j.mo87498b():void");
    }

    /* renamed from: c */
    public final void mo87499c() {
        C64426ho2 ho22 = ((C54979h1) this.f177481f.mo71262a(C54979h1.class)).f154116H;
        if (ho22 != null) {
            View h = mo87504h();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(h, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkShowLicense", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(h, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "checkShowLicense", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo87504h().setOnClickListener(new C62463b(this, ho22));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r1.f183584q;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87500d() {
        /*
            r19 = this;
            r0 = r19
            fj1.b r1 = r0.f177481f
            java.lang.Class<cl1.h1> r2 = cl1.C54979h1.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.h1 r1 = (cl1.C54979h1) r1
            te3.i11 r1 = r1.f154139n
            r2 = 0
            if (r1 == 0) goto L_0x001c
            te3.q81 r1 = r1.f183584q
            if (r1 == 0) goto L_0x001c
            int r1 = r1.f140177d
            r3 = 5
            if (r1 != r3) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            np1.a r3 = r0.f177479d
            op1.h r3 = r3.f175761C
            boolean r3 = r3.mo87157T5()
            java.lang.String r4 = r0.f177483h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkShowServiceButton hideServiceEntrance:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ",haveProductData:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ",configEnableServiceEntrance:"
            r5.append(r3)
            rx3.g r3 = r0.f177478D
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r5.append(r3)
            java.lang.String r3 = ",isAnchorOrAssistant:"
            r5.append(r3)
            np1.a r3 = r0.f177479d
            boolean r3 = r3.mo86766v()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            if (r1 != 0) goto L_0x00d0
            np1.a r3 = r0.f177479d
            boolean r3 = r3.mo86766v()
            if (r3 != 0) goto L_0x00d0
            np1.a r3 = r0.f177479d
            op1.h r3 = r3.f175761C
            boolean r3 = r3.mo87157T5()
            if (r3 == 0) goto L_0x00d0
            rx3.g r3 = r0.f177478D
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00d0
            android.view.View r1 = r19.mo87506j()
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r4)
            java.lang.Object[] r5 = r3.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder"
            java.lang.String r7 = "checkShowServiceButton"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r3.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder"
            java.lang.String r6 = "checkShowServiceButton"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0118
        L_0x00d0:
            if (r1 == 0) goto L_0x0118
            android.view.View r1 = r19.mo87506j()
            r3 = 8
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r3)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder"
            java.lang.String r14 = "checkShowServiceButton"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r4.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder"
            java.lang.String r13 = "checkShowServiceButton"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pp1.C62461j.mo87500d():void");
    }

    /* renamed from: e */
    public final void mo87501e(boolean z) {
        boolean z2;
        T t;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z3;
        C64434i11 i112 = ((C54979h1) this.f177481f.mo71262a(C54979h1.class)).f154139n;
        C50926q81 q812 = i112 != null ? i112.f183584q : null;
        Iterator<T> it = this.f177479d.f175761C.f176535i.iterator();
        while (true) {
            z2 = false;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C0740i2 i2Var = (C0740i2) t;
            if (!(i2Var instanceof C63965x) || ((C63965x) i2Var).f181336D != 1) {
                z3 = false;
                continue;
            } else {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        C62042e eVar = C62042e.f176370a;
        Context context = this.f177480e.getContext();
        C87412m.m108593f(context, "root.context");
        C63965x xVar = (C63965x) ((C0740i2) t);
        eVar.getClass();
        Class cls = C54116w.class;
        StringBuilder sb = new StringBuilder();
        sb.append("#enterShopCustomerService ");
        sb.append(xVar != null ? Long.valueOf(xVar.f181347t) : null);
        sb.append(", ");
        sb.append(q812 != null ? Integer.valueOf(q812.f140177d) : "null");
        Log.m105924i("FinderLiveUtil", sb.toString());
        if (q812 == null) {
            Log.m105924i("FinderLiveUtil", "#enterShopCustomerService csInfo is null. jump to msg");
            C62042e.m72801D(context);
            return;
        }
        Log.m105924i("FinderLiveUtil", "#enterShopCustomerService " + C61937h.m72709h(q812));
        int i = q812.f140177d;
        if (i != 1) {
            String str5 = "";
            if (i == 2) {
                C7335d c = C86312j.m106911c(C13883o1.class);
                C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
                C13883o1 o1Var = (C13883o1) c;
                C50019jp1 jp12 = q812.f140179f;
                o1Var.mo13270U5(context, (jp12 == null || (str2 = jp12.f136237d) == null) ? str5 : str2, (jp12 == null || (str = jp12.f136238e) == null) ? str5 : str, 1177, "");
            } else if (i == 3) {
                String str6 = q812.f140180g;
                if (str6 == null || str6.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    Log.m105924i("FinderLiveUtil", "invalid h5 url");
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("rawUrl", q812.f140180g);
                C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } else if (i != 4) {
                C62042e.m72801D(context);
            } else {
                ((C54116w) C86312j.m106911c(cls)).ty0(3);
                C49178dp1 dp12 = q812.f140181h;
                if (dp12 == null || (str3 = dp12.f132468d) == null) {
                    str3 = str5;
                }
                Log.m105924i("FinderLiveUtil", "#enterShopCustomerService kfUrl=" + str3);
                C59837i iVar = (C59837i) C86312j.m106911c(C59837i.class);
                if (iVar != null) {
                    OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
                    openIMKefuStartConversationRequest.f108515d = context;
                    openIMKefuStartConversationRequest.f108516e = System.currentTimeMillis();
                    openIMKefuStartConversationRequest.f108517f = 11;
                    C51195s3 s3Var = new C51195s3();
                    s3Var.f141285d = str3;
                    C49810i73 i732 = new C49810i73();
                    C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
                    if (!(oVar == null || (str4 = oVar.f154345o) == null)) {
                        str5 = str4;
                    }
                    i732.f135155e = str5;
                    Log.m105924i("FinderLiveUtil", "entityid " + i732.f135155e);
                    s3Var.f141288g = i732;
                    openIMKefuStartConversationRequest.f108520i = s3Var;
                    openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(openIMKefuStartConversationRequest.f108517f);
                    iVar.mo71855jT(openIMKefuStartConversationRequest);
                }
            }
        } else {
            ((C54116w) C86312j.m106911c(cls)).ty0(2);
            ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106884tG(q812.f140178e, new C62062f(q812, xVar, context));
        }
    }

    /* renamed from: f */
    public final View mo87502f() {
        Object value = ((C36570n) this.f177486n).getValue();
        C87412m.m108593f(value, "<get-close>(...)");
        return (View) value;
    }

    /* renamed from: g */
    public final WeImageView mo87503g() {
        Object value = ((C36570n) this.f177487o).getValue();
        C87412m.m108593f(value, "<get-closeIv>(...)");
        return (WeImageView) value;
    }

    /* renamed from: h */
    public final View mo87504h() {
        Object value = ((C36570n) this.f177490r).getValue();
        C87412m.m108593f(value, "<get-licenseGroup>(...)");
        return (View) value;
    }

    /* renamed from: i */
    public final View mo87505i() {
        Object value = ((C36570n) this.f177488p).getValue();
        C87412m.m108593f(value, "<get-orderGroup>(...)");
        return (View) value;
    }

    /* renamed from: j */
    public final View mo87506j() {
        Object value = ((C36570n) this.f177477C).getValue();
        C87412m.m108593f(value, "<get-serviceGroup>(...)");
        return (View) value;
    }

    /* renamed from: k */
    public final View mo87507k() {
        Object value = ((C36570n) this.f177494v).getValue();
        C87412m.m108593f(value, "<get-shopScoreGroup>(...)");
        return (View) value;
    }

    /* renamed from: l */
    public final TextView mo87508l() {
        Object value = ((C36570n) this.f177496x).getValue();
        C87412m.m108593f(value, "<get-shopScoreLevel>(...)");
        return (TextView) value;
    }

    /* renamed from: m */
    public final ImageView mo87509m() {
        Object value = ((C36570n) this.f177493u).getValue();
        C87412m.m108593f(value, "<get-shopWindowBrand>(...)");
        return (ImageView) value;
    }

    /* renamed from: n */
    public final View mo87510n() {
        Object value = ((C36570n) this.f177491s).getValue();
        C87412m.m108593f(value, "<get-shopWindowEntranceGroup>(...)");
        return (View) value;
    }

    /* renamed from: o */
    public final View mo87511o() {
        Object value = ((C36570n) this.f177484i).getValue();
        C87412m.m108593f(value, "<get-titleGroup>(...)");
        return (View) value;
    }

    public void onClick(View view) {
        String str;
        C86299o oVar;
        C50019jp1 jp12;
        String str2;
        C50019jp1 jp13;
        C50019jp1 jp14;
        C50019jp1 jp15;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str3 = null;
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dyu) {
            if (this.f177479d.mo86754k().getVisibility() == 0) {
                if (this.f177479d.mo86757n().getVisibility() == 0) {
                    C61817a aVar = this.f177479d;
                    aVar.getClass();
                    Log.m105924i("Finder.LiveShoppingListPlugin", "hideSecondaryPage true");
                    aVar.mo86754k().animate().setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).translationX((float) aVar.mo86758o().getWidth()).setListener(new C61854c(aVar)).start();
                } else {
                    this.f177479d.mo86761q();
                }
            } else if (this.f177479d.mo86757n().getVisibility() == 0) {
                this.f177479d.mo86760p(true, true);
            } else {
                this.f177479d.mo86761q();
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358232dz3) {
            if (!this.f177479d.mo86766v()) {
                C61817a aVar2 = this.f177479d;
                aVar2.getClass();
                Class cls = C54108o.class;
                Class cls2 = C10383h.class;
                Class cls3 = C54979h1.class;
                StringBuilder sb = new StringBuilder();
                sb.append("gotoShoppingOrder appId:");
                C64434i11 i112 = ((C54979h1) aVar2.f175774g.mo71262a(cls3)).f154139n;
                sb.append((i112 == null || (jp15 = i112.f183580j) == null) ? null : jp15.f136237d);
                sb.append(",path:");
                C64434i11 i113 = ((C54979h1) aVar2.f175774g.mo71262a(cls3)).f154139n;
                if (!(i113 == null || (jp14 = i113.f183580j) == null)) {
                    str3 = jp14.f136238e;
                }
                sb.append(str3);
                Log.m105924i("Finder.LiveShoppingListPlugin", sb.toString());
                C37521f.f99374d.getClass();
                String str4 = "";
                if (C37521f.f99553x0.mo60266n().intValue() == 0) {
                    C45795b bVar = aVar2.f175774g;
                    C61852b bVar2 = new C61852b(aVar2);
                    Class cls4 = C55001u.class;
                    Class cls5 = C54991o.class;
                    C87412m.m108594g(bVar, "liveData");
                    String obj = Util.getUuidRandom().toString();
                    C62042e eVar = C62042e.f176370a;
                    if (eVar.mo87027N0()) {
                        C64208c.C64209a aVar3 = C64208c.f181951a;
                        C87412m.m108594g(obj, "<set-?>");
                        C64208c.f181967q = obj;
                    }
                    C86299o oVar2 = new C86299o();
                    C64434i11 i114 = ((C54979h1) bVar.mo71262a(cls3)).f154139n;
                    if (i114 == null || (jp13 = i114.f183580j) == null || (str = jp13.f136237d) == null) {
                        str = str4;
                    }
                    oVar2.f250930b = str;
                    C64434i11 i115 = ((C54979h1) bVar.mo71262a(cls3)).f154139n;
                    if (!(i115 == null || (jp12 = i115.f183580j) == null || (str2 = jp12.f136238e) == null)) {
                        str4 = str2;
                    }
                    oVar2.f250934f = str4;
                    oVar2.f250939k = 1177;
                    oVar2.f250940l = "live_list_order:" + ((C55001u) bVar.mo71262a(cls4)).f154420q.f182392d + XVFSFile.PATH_SEPARATOR_CHAR + ((C54991o) bVar.mo71262a(cls5)).f154345o + "::" + ((C54991o) bVar.mo71262a(cls5)).f154325i1 + XVFSFile.PATH_SEPARATOR_CHAR + obj + XVFSFile.PATH_SEPARATOR_CHAR + ((C54991o) bVar.mo71262a(cls5)).f154318g2 + XVFSFile.PATH_SEPARATOR_CHAR + ((C54991o) bVar.mo71262a(cls5)).f154203G1;
                    if (!eVar.mo87027N0()) {
                        oVar = oVar2;
                        C64208c.f181951a.mo89033h(obj, oVar2.f250930b, ((C10383h) C86312j.m106911c(cls2)).mo10700XQ(((C55001u) bVar.mo71262a(cls4)).f154420q.f182392d), "", ((C10383h) C86312j.m106911c(cls2)).mo10700XQ(((C54991o) bVar.mo71262a(cls5)).f154325i1));
                    } else {
                        oVar = oVar2;
                    }
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    C54067f0 f0Var = C54108o.f151869h;
                    String str5 = oVar.f250940l;
                    C87412m.m108593f(str5, "sceneNote");
                    f0Var.getClass();
                    f0Var.f151475s = str5;
                    bVar2.invoke(Boolean.FALSE, oVar);
                } else {
                    Intent intent = new Intent();
                    C64388g93 g932 = new C64388g93();
                    C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
                    wVar.getClass();
                    g932.f183282d = ((C10383h) C86312j.m106911c(cls2)).mo10700XQ(wVar.f151937e);
                    g932.f183283e = ((C10383h) C86312j.m106911c(cls2)).mo10700XQ(wVar.f151943h);
                    g932.f183284f = wVar.f151939f;
                    String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
                    if (Wb == null) {
                        Wb = str4;
                    }
                    g932.f183285g = Wb;
                    g932.f183286h = wVar.f151945i;
                    String E = ((C10383h) C86312j.m106911c(cls2)).mo10696E();
                    if (E != null) {
                        str4 = E;
                    }
                    g932.f183287i = str4;
                    g932.f183288j = wVar.zx0(wVar.f151943h, wVar.f151945i);
                    ((C54108o) C86312j.m106911c(cls)).getClass();
                    g932.f183289n = (int) C54108o.f151869h.mo74755e(g932.f183286h, (long) wVar.f151947j);
                    g932.f183290o = wVar.f151907K;
                    intent.putExtra("ORDER_REPORT_STRUCT", g932.toByteArray());
                    intent.putExtra("ORDER_FROM_SCENE", 2);
                    C13091a aVar4 = C13091a.f37264a;
                    Context context = aVar2.f175772e.getContext();
                    C87412m.m108593f(context, "root.context");
                    aVar4.mo12593a(context, intent);
                }
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dz8) {
            int i = C66785b.f191882e.mo90673n0().f131584h;
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar5 = C72994y1.C72995a.USERINFO_LIVE_SHOPPING_SERVICE_NOTE_TIME_LONG_SYNC;
            long G = i2.mo119673G(aVar5, 0);
            String str6 = this.f177483h;
            Log.m105924i(str6, "lastShowNoteTime " + G);
            if (i == 1 || System.currentTimeMillis() - G <= 86400000) {
                mo87501e(false);
            } else {
                C86709a0.m107535s().mo121142i().mo119677K(aVar5, Long.valueOf(System.currentTimeMillis()));
                this.f177479d.mo86761q();
                C12925w wVar2 = new C12925w(this.f177480e.getContext());
                wVar2.mo12473m(true);
                wVar2.mo12470j(C0966R.C0971layout.f359755ak3);
                C85875k4.m106189j0(((TextView) wVar2.f36927f.findViewById(C0966R.C0970id.e3c)).getPaint(), 0.8f);
                View findViewById = wVar2.f36927f.findViewById(C0966R.C0970id.e3a);
                TextView textView = (TextView) findViewById.findViewById(C0966R.C0970id.knx);
                ((ImageView) findViewById.findViewById(C0966R.C0970id.itl)).setVisibility(8);
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f177480e.getContext(), C58739j4.f168176a.mo83676D(2)));
                textView.setTextColor(C76577a.m92153d(this.f177480e.getContext(), C0966R.color.BW_100_Alpha_0_8));
                ((TextView) findViewById.findViewById(C0966R.C0970id.f357845c22)).setVisibility(8);
                C78039a.m94189a((ImageView) findViewById.findViewById(C0966R.C0970id.f15), C75592q0.m90789s());
                ((Button) wVar2.f36927f.findViewById(C0966R.C0970id.hll)).setOnClickListener(new C62487l(wVar2, this));
                ((Button) wVar2.f36927f.findViewById(C0966R.C0970id.apy)).setOnClickListener(new C62488m(wVar2, this));
                wVar2.mo5086o();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: p */
    public final void mo87513p(String str) {
        Object value = ((C36570n) this.f177485j).getValue();
        C87412m.m108593f(value, "<get-productsTitle>(...)");
        ((TextView) value).setText(str);
    }

    /* renamed from: q */
    public final void mo87514q(boolean z) {
        if (z) {
            View n = mo87510n();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(n, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "setTitleLeftUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(n, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "setTitleLeftUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View f = mo87502f();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view = f;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "setTitleLeftUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "setTitleLeftUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View n2 = mo87510n();
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        C117292a.m165358d(n2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "setTitleLeftUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(n2, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "setTitleLeftUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View f2 = mo87502f();
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view2 = f2;
        C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "setTitleLeftUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder", "setTitleLeftUI", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
