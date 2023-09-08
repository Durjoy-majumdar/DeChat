package sb2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C86493v0;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59822f;
import hb2.C59833q;
import hi3.C87515a;
import ht1.C98521u5;
import ic0.C108455d;
import java.util.LinkedList;
import je1.C46530q2;
import jq3.C60905o;
import ke3.C88144b;
import kg3.C76577a;
import la2.C99364n;
import ma2.C61454t;
import nb2.C61643b0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C47269o0;
import nj3.C76874e0;
import nj3.C76875f0;
import o40.C61926c;
import p1081gi.C98121d;
import p166hy.C60228r0;
import p529fv.C59331r;
import p763ym.C79138l;
import p773yy.C66708h;
import p823sg.C90193h;
import pb1.C62251b1;
import qc0.C101093a;
import qc0.C101106m;
import qo3.C47883u;
import qo3.C77407n;
import qy2.C77459z;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C26236u;
import te3.C64488kb1;
import te3.C64519lb1;
import te3.C64719t23;
import ub2.C14142b;
import uz2.C65488a0;
import wc3.C15133e0;
import wc3.C78541w;
import z04.C112550d0;
import z04.C119027c;
import z04.C66725r;
import zc1.C66785b;

/* renamed from: sb2.t0 */
public final class C63849t0 extends UIComponent {

    /* renamed from: d */
    public C63796j1 f180994d;

    /* renamed from: e */
    public boolean f180995e;

    /* renamed from: f */
    public long f180996f;

    /* renamed from: g */
    public String f180997g;

    /* renamed from: h */
    public final C13643k1 f180998h = new C13643k1();

    /* renamed from: sb2.t0$a */
    public static final class C63850a implements C77407n.C47880p {

        /* renamed from: a */
        public static final C63850a f180999a = new C63850a();

        public final void onDismiss() {
        }
    }

    /* renamed from: sb2.t0$b */
    public static final class C63851b implements C108455d {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<Bitmap> f181000a;

        /* renamed from: b */
        public final /* synthetic */ String f181001b;

        public C63851b(C8479f0<Bitmap> f0Var, String str) {
            this.f181000a = f0Var;
            this.f181001b = str;
        }

        /* renamed from: a */
        public final void mo26263a(boolean z, Object[] objArr) {
            this.f181000a.f27484d = BitmapUtil.getBitmapNative(this.f181001b);
            Log.m105924i("MicroMsg.Mv.MusicMvShareUIC", "downloadImage");
        }
    }

    /* renamed from: sb2.t0$c */
    public static final class C63852c implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C15133e0 f181002d;

        /* renamed from: e */
        public final /* synthetic */ C63849t0 f181003e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<C77407n> f181004f;

        public C63852c(C15133e0 e0Var, C63849t0 t0Var, C8479f0<C77407n> f0Var) {
            this.f181002d = e0Var;
            this.f181003e = t0Var;
            this.f181004f = f0Var;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            C15133e0 e0Var2 = this.f181002d;
            Activity context = this.f181003e.getContext();
            C87412m.m108593f(e0Var, "menu");
            e0Var2.el0(context, e0Var, (C77407n) this.f181004f.f27484d);
        }
    }

    /* renamed from: sb2.t0$d */
    public static final class C63853d implements C47269o0 {

        /* renamed from: a */
        public final /* synthetic */ C15133e0 f181005a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C77407n> f181006b;

        public C63853d(C15133e0 e0Var, C8479f0<C77407n> f0Var) {
            this.f181005a = e0Var;
            this.f181006b = f0Var;
        }

        /* renamed from: a */
        public final void mo2584a(MenuItem menuItem, int i) {
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            this.f181005a.mo14089YM((C77407n) this.f181006b.f27484d, (C76875f0) menuItem);
        }
    }

    /* renamed from: sb2.t0$e */
    public static final class C63854e implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C15133e0 f181007d;

        /* renamed from: e */
        public final /* synthetic */ C63849t0 f181008e;

        /* renamed from: f */
        public final /* synthetic */ C59822f f181009f;

        /* renamed from: sb2.t0$e$a */
        public static final class C63855a extends C87413o implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63849t0 f181010d;

            /* renamed from: e */
            public final /* synthetic */ C59822f f181011e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63855a(C63849t0 t0Var, C59822f fVar) {
                super(1);
                this.f181010d = t0Var;
                this.f181011e = fVar;
            }

            public Object invoke(Object obj) {
                String str;
                FinderObject d;
                LinkedList<FinderMedia> linkedList;
                FinderMedia finderMedia;
                String str2 = (String) obj;
                C87412m.m108594g(str2, "username");
                C63849t0 t0Var = this.f181010d;
                t0Var.f180995e = true;
                C59822f fVar = this.f181011e;
                C39622i0 a = C39818r.f106831a.mo62444c(t0Var.getActivity()).mo75002a(C63756e.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
                C63756e eVar = (C63756e) a;
                C101106m k = C99364n.m129616h().mo138832k();
                C64488kb1 kb12 = eVar.f180744i;
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.f195582i = 76;
                bVar.f195570f = kb12.f183904d;
                bVar.f195574g = kb12.f183905e;
                bVar.f195542X = kb12.f183916s;
                String str3 = kb12.f183908h;
                String str4 = "";
                if (str3 == null) {
                    str3 = str4;
                }
                bVar.f195586j = str3;
                bVar.f195590k = str4;
                String str5 = kb12.f183906f;
                if (str5 == null) {
                    str5 = str4;
                }
                bVar.f195530T = str5;
                bVar.f195533U = str4;
                bVar.f195562d = kb12.f183907g;
                C72916m mVar = new C72916m();
                mVar.f212519b = kb12.f183912o;
                mVar.f212520c = kb12.f183910j;
                mVar.f212533p = (!TextUtils.isEmpty(kb12.f183922y) || k == null) ? kb12.f183922y : k.f295954P;
                mVar.f212534q = eVar.f180757y ? "wx485a97c844086dc9" : str4;
                Log.m105925i("MicroMsg.Mv.MusicMvShareUIC", "doRecentForward isMvWithBeat:%b", Boolean.valueOf(fVar.f170778z));
                if (!fVar.f170778z && (d = C59822f.f170752A.mo84779d(fVar)) != null) {
                    mVar.f212521d = C61926c.m72691p(d.f164794id);
                    mVar.f212522e = d.objectNonceId;
                    FinderObjectDesc finderObjectDesc = d.objectDesc;
                    if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
                        mVar.f212523f = finderMedia.thumbUrl + finderMedia.thumb_url_token;
                    }
                    FinderContact finderContact = d.contact;
                    mVar.f212524g = finderContact != null ? finderContact.nickname : null;
                }
                mVar.f212519b = kb12.f183912o;
                mVar.f212520c = kb12.f183910j;
                mVar.f212525h = kb12.f183905e;
                mVar.f212526i = kb12.f183911n;
                mVar.f212527j = kb12.f183913p;
                mVar.f212528k = String.valueOf(kb12.f183915r);
                mVar.f212529l = kb12.f183917t;
                mVar.f212531n = kb12.f183918u;
                mVar.f212530m = kb12.f183916s;
                C64519lb1 lb12 = kb12.f183921x;
                if (!(lb12 == null || (str = lb12.f184069d) == null)) {
                    str4 = str;
                }
                mVar.f212532o = str4;
                bVar.mo93545f(mVar);
                C8479f0 f0Var = new C8479f0();
                T d3 = t0Var.mo88639d3(fVar);
                f0Var.f27484d = d3;
                if (d3 == null) {
                    f0Var.f27484d = ((C59331r) C86312j.m106911c(C59331r.class)).mo84031zw(C101093a.m132480b());
                }
                String str6 = str2;
                String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
                ((C78541w) C86312j.m106911c(C78541w.class)).Tm0(t0Var.getContext(), str6, s, (String) f0Var.f27484d, new C63864u0(t0Var, str6, s, f0Var, fVar, kb12)).show();
                C62251b1 b1Var = (C62251b1) C86312j.m106911c(C62251b1.class);
                Activity context = this.f181010d.getContext();
                C63849t0 t0Var2 = this.f181010d;
                String str7 = t0Var2.f180997g;
                if (str7 != null) {
                    long j = t0Var2.f180996f;
                    int i = C62251b1.f176956C0;
                    b1Var.e40(context, str7, j, 3);
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("mFavSearchId");
                throw null;
            }
        }

        public C63854e(C15133e0 e0Var, C63849t0 t0Var, C59822f fVar) {
            this.f181007d = e0Var;
            this.f181008e = t0Var;
            this.f181009f = fVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C15133e0 e0Var = this.f181007d;
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            e0Var.xc0((C76875f0) menuItem, new C63855a(this.f181008e, this.f181009f));
        }
    }

    /* renamed from: sb2.t0$f */
    public static final class C63856f implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C63849t0 f181012d;

        public C63856f(C63849t0 t0Var) {
            this.f181012d = t0Var;
        }

        public void onViewAttachedToWindow(View view) {
            C87412m.m108594g(view, "view");
        }

        public void onViewDetachedFromWindow(View view) {
            C63796j1 j1Var;
            C87412m.m108594g(view, "v");
            C63849t0 t0Var = this.f181012d;
            if (!t0Var.f180995e && (j1Var = t0Var.f180994d) != null) {
                j1Var.mo88590a(System.currentTimeMillis(), 1, "2", 10, (String) null);
            }
        }
    }

    /* renamed from: sb2.t0$g */
    public static final class C63857g implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C63849t0 f181013d;

        /* renamed from: e */
        public final /* synthetic */ boolean f181014e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f181015f;

        /* renamed from: g */
        public final /* synthetic */ BitmapDrawable f181016g;

        /* renamed from: h */
        public final /* synthetic */ String f181017h;

        public C63857g(C63849t0 t0Var, boolean z, C8477a0 a0Var, BitmapDrawable bitmapDrawable, String str) {
            this.f181013d = t0Var;
            this.f181014e = z;
            this.f181015f = a0Var;
            this.f181016g = bitmapDrawable;
            this.f181017h = str;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            BitmapDrawable bitmapDrawable;
            e0Var.mo107150j(101, this.f181013d.getContext().getString(C0966R.string.f360098a33), C0966R.raw.finder_full_share, this.f181013d.getContext().getResources().getColor(C0966R.color.f2939n), !this.f181014e);
            e0Var.mo107150j(102, this.f181013d.getContext().getString(C0966R.string.h44), C0966R.raw.bottomsheet_icon_moment, 0, !this.f181014e);
            e0Var.mo107150j(103, this.f181013d.getContext().getString(C0966R.string.h28), C0966R.raw.bottomsheet_icon_fav, 0, !this.f181014e);
            e0Var.mo107150j(104, this.f181013d.getContext().getString(C0966R.string.h47), C0966R.raw.state_icon_main, this.f181013d.getContext().getResources().getColor(C0966R.color.f2933h), !this.f181014e);
            if (this.f181015f.f27482d && (bitmapDrawable = this.f181016g) != null) {
                e0Var.mo107153m(105, this.f181017h, bitmapDrawable, 0);
            }
        }
    }

    /* renamed from: sb2.t0$h */
    public static final class C63858h implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C63849t0 f181018d;

        /* renamed from: e */
        public final /* synthetic */ boolean f181019e;

        /* renamed from: f */
        public final /* synthetic */ boolean f181020f;

        /* renamed from: g */
        public final /* synthetic */ C59822f f181021g;

        /* renamed from: h */
        public final /* synthetic */ boolean f181022h;

        public C63858h(C63849t0 t0Var, boolean z, boolean z2, C59822f fVar, boolean z3) {
            this.f181018d = t0Var;
            this.f181019e = z;
            this.f181020f = z2;
            this.f181021g = fVar;
            this.f181022h = z3;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            boolean z = true;
            e0Var.mo107150j(201, this.f181018d.getContext().getString(C0966R.string.f361076h31), C0966R.raw.icons_outlined_mv_making_share, this.f181018d.getContext().getResources().getColor(C0966R.color.f3133gi), !this.f181019e);
            if (!this.f181020f) {
                e0Var.mo107150j(202, this.f181018d.getContext().getString(C0966R.string.h4t), C0966R.raw.icons_outlined_delete, this.f181018d.getContext().getResources().getColor(C0966R.color.f3133gi), !this.f181022h);
            } else if (C59822f.f170752A.mo84780e(this.f181021g)) {
                e0Var.mo107150j(203, this.f181018d.getContext().getString(C0966R.string.h2l), C0966R.raw.icons_outlined_report_problem, this.f181018d.getContext().getResources().getColor(C0966R.color.f3133gi), false);
            }
            e0Var.mo107150j(204, this.f181018d.getContext().getString(C0966R.string.h1o), C0966R.raw.finder_icons_screen_clear, this.f181018d.getContext().getResources().getColor(C0966R.color.f3133gi), false);
            if (!BuildInfo.DEBUG) {
                if (!(BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.CLIENT_VERSION_INT == 788529167) && !WeChatEnvironment.hasDebugger()) {
                    z = false;
                }
            }
            if (z) {
                e0Var.mo107150j(205, "调试", C0966R.raw.icons_outlined_report_problem, this.f181018d.getContext().getResources().getColor(C0966R.color.f3133gi), false);
            }
        }
    }

    /* renamed from: sb2.t0$i */
    public static final class C63859i implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C63849t0 f181023d;

        /* renamed from: e */
        public final /* synthetic */ C59822f f181024e;

        /* renamed from: f */
        public final /* synthetic */ int f181025f;

        /* renamed from: sb2.t0$i$a */
        public static final class C63860a implements C44580q1 {

            /* renamed from: a */
            public final /* synthetic */ C63849t0 f181026a;

            /* renamed from: b */
            public final /* synthetic */ C64488kb1 f181027b;

            /* renamed from: c */
            public final /* synthetic */ C59822f f181028c;

            /* renamed from: d */
            public final /* synthetic */ int f181029d;

            /* renamed from: e */
            public final /* synthetic */ C63756e f181030e;

            public C63860a(C63849t0 t0Var, C64488kb1 kb12, C59822f fVar, int i, C63756e eVar) {
                this.f181026a = t0Var;
                this.f181027b = kb12;
                this.f181028c = fVar;
                this.f181029d = i;
                this.f181030e = eVar;
            }

            /* renamed from: a */
            public final void mo1579a(boolean z, boolean z2) {
                if (z) {
                    C59833q.m69726g(C59833q.f170832a, this.f181026a.getActivity(), this.f181027b, this.f181028c, 2, 1, this.f181029d == 3 ? 5 : 3, 0, this.f181030e.mo88571e3(), this.f181030e.mo88569c3(), this.f181030e.mo88570d3(), this.f181030e.f180736H, 64, (Object) null);
                }
                if (z2) {
                    C59833q.m69726g(C59833q.f170832a, this.f181026a.getActivity(), this.f181027b, this.f181028c, 2, 3, this.f181029d == 3 ? 5 : 3, 0, this.f181030e.mo88571e3(), this.f181030e.mo88569c3(), this.f181030e.mo88570d3(), this.f181030e.f180736H, 64, (Object) null);
                }
            }
        }

        public C63859i(C63849t0 t0Var, C59822f fVar, int i) {
            this.f181023d = t0Var;
            this.f181024e = fVar;
            this.f181025f = i;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            String str2;
            FinderObject d;
            LinkedList<FinderMedia> linkedList;
            FinderMedia finderMedia;
            String str3;
            Class cls;
            C64719t23 t232;
            String str4;
            Bitmap bitmap;
            FinderObject d2;
            LinkedList<FinderMedia> linkedList2;
            FinderMedia finderMedia2;
            C64719t23 t233;
            String str5;
            FinderObject d3;
            LinkedList<FinderMedia> linkedList3;
            FinderMedia finderMedia3;
            C63796j1 j1Var;
            Class cls2 = C62251b1.class;
            Class cls3 = C59331r.class;
            Class cls4 = C63756e.class;
            if (!(menuItem.getItemId() == 101 || (j1Var = this.f181023d.f180994d) == null)) {
                j1Var.mo88590a(System.currentTimeMillis(), 4, "2", 10, (String) null);
            }
            this.f181023d.f180995e = true;
            String str6 = "";
            switch (menuItem.getItemId()) {
                case 101:
                    Class cls5 = cls2;
                    String str7 = "wx485a97c844086dc9";
                    String str8 = str6;
                    String str9 = "mFavSearchId";
                    String str10 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity";
                    FinderContact finderContact = this.f181024e.f170762j;
                    if (((finderContact != null ? finderContact.extFlag : 0) & 1024) != 0) {
                        C58784w3 w3Var = C58784w3.f168295a;
                        AppCompatActivity activity = this.f181023d.getActivity();
                        String string = this.f181023d.getActivity().getString(C0966R.string.ej_);
                        C87412m.m108593f(string, "activity.getString(com.t…finder_private_ban_share)");
                        w3Var.mo83879J1(activity, string);
                        return;
                    }
                    C63796j1 j1Var2 = this.f181023d.f180994d;
                    if (j1Var2 != null) {
                        j1Var2.mo88590a(System.currentTimeMillis(), 2, "2", 10, (String) null);
                    }
                    C63849t0 t0Var = this.f181023d;
                    C59822f fVar = this.f181024e;
                    int i2 = this.f181025f;
                    t0Var.getClass();
                    C39622i0 a = C39818r.f106831a.mo62444c(t0Var.getActivity()).mo75002a(cls4);
                    C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
                    C63756e eVar = (C63756e) a;
                    C101106m k = C99364n.m129616h().mo138832k();
                    C64488kb1 kb12 = eVar.f180744i;
                    C68070l.C68072b bVar = new C68070l.C68072b();
                    bVar.f195582i = 76;
                    bVar.f195570f = kb12.f183904d;
                    bVar.f195574g = kb12.f183905e;
                    bVar.f195542X = kb12.f183916s;
                    String str11 = kb12.f183908h;
                    if (str11 == null) {
                        str11 = str8;
                    }
                    bVar.f195586j = str11;
                    String str12 = str8;
                    bVar.f195590k = str12;
                    String str13 = kb12.f183906f;
                    if (str13 == null) {
                        str13 = str12;
                    }
                    bVar.f195530T = str13;
                    bVar.f195533U = str12;
                    bVar.f195562d = kb12.f183907g;
                    C72916m mVar = new C72916m();
                    mVar.f212519b = kb12.f183912o;
                    mVar.f212520c = kb12.f183910j;
                    mVar.f212533p = (!TextUtils.isEmpty(kb12.f183922y) || k == null) ? kb12.f183922y : k.f295954P;
                    mVar.f212534q = eVar.f180757y ? str7 : str12;
                    Log.m105925i("MicroMsg.Mv.MusicMvShareUIC", "doShareToChat isMvWithBeat:%b", Boolean.valueOf(fVar.f170778z));
                    if (fVar.f170778z || (d = C59822f.f170752A.mo84779d(fVar)) == null) {
                        str = str9;
                    } else {
                        str = str9;
                        mVar.f212521d = C61926c.m72691p(d.f164794id);
                        mVar.f212522e = d.objectNonceId;
                        FinderObjectDesc finderObjectDesc = d.objectDesc;
                        if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
                            mVar.f212523f = finderMedia.thumbUrl + finderMedia.thumb_url_token;
                        }
                        FinderContact finderContact2 = d.contact;
                        mVar.f212524g = finderContact2 != null ? finderContact2.nickname : null;
                    }
                    mVar.f212519b = kb12.f183912o;
                    mVar.f212520c = kb12.f183910j;
                    mVar.f212525h = kb12.f183905e;
                    mVar.f212526i = kb12.f183911n;
                    mVar.f212527j = kb12.f183913p;
                    mVar.f212528k = String.valueOf(kb12.f183915r);
                    mVar.f212529l = kb12.f183917t;
                    mVar.f212531n = kb12.f183918u;
                    mVar.f212530m = kb12.f183916s;
                    C64519lb1 lb12 = kb12.f183921x;
                    mVar.f212532o = (lb12 == null || (str2 = lb12.f184069d) == null) ? str12 : str2;
                    bVar.mo93545f(mVar);
                    String d35 = t0Var.mo88639d3(fVar);
                    String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
                    Intent intent = new Intent();
                    intent.putExtra("Retr_Msg_Type", 2);
                    intent.putExtra("content_type_forward_to_wework", 11);
                    intent.putExtra("Retr_Msg_content", s);
                    intent.putExtra("Multi_Retr", true);
                    intent.putExtra("Retr_go_to_chattingUI", false);
                    intent.putExtra("Retr_show_success_tips", true);
                    if (d35 == null) {
                        d35 = ((C59331r) C86312j.m106911c(cls3)).mo84031zw(C101093a.m132480b());
                    }
                    intent.putExtra("Retr_Msg_thumb_path", d35);
                    Activity context = t0Var.getContext();
                    C87412m.m108592e(context, str10);
                    C88144b.m109803u((MMActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1, new C63871w0(fVar, t0Var, kb12, i2));
                    Log.m105924i("MicroMsg.Mv.MusicMvShareUIC", "share mv to chat songName:" + kb12.f183904d + " mvObjectId:" + mVar.f212521d + " mvNonceId:" + mVar.f212522e + " mvCoverUrl:" + mVar.f212523f + " mvMakerFinderNickname:" + mVar.f212524g + ", localCoverPath: " + d35);
                    C62251b1 b1Var = (C62251b1) C86312j.m106911c(cls5);
                    Activity context2 = t0Var.getContext();
                    String str14 = t0Var.f180997g;
                    if (str14 != null) {
                        b1Var.e40(context2, str14, t0Var.f180996f, 3);
                        return;
                    } else {
                        C87412m.m108603p(str);
                        throw null;
                    }
                case 102:
                    C59822f fVar2 = this.f181024e;
                    FinderContact finderContact3 = fVar2.f170762j;
                    if (((finderContact3 != null ? finderContact3.extFlag : 0) & 1024) != 0) {
                        C58784w3 w3Var2 = C58784w3.f168295a;
                        AppCompatActivity activity2 = this.f181023d.getActivity();
                        String string2 = this.f181023d.getActivity().getString(C0966R.string.ej_);
                        C87412m.m108593f(string2, "activity.getString(com.t…finder_private_ban_share)");
                        w3Var2.mo83879J1(activity2, string2);
                        break;
                    } else {
                        C63849t0 t0Var2 = this.f181023d;
                        int i3 = this.f181025f;
                        t0Var2.getClass();
                        Log.m105925i("MicroMsg.Mv.MusicMvShareUIC", "doShareToSns isMvWithBeat:%b", Boolean.valueOf(fVar2.f170778z));
                        if (fVar2.f170778z || (d2 = C59822f.f170752A.mo84779d(fVar2)) == null) {
                            cls = cls2;
                            str3 = "wx485a97c844086dc9";
                            t232 = null;
                        } else {
                            t232 = new C64719t23();
                            cls = cls2;
                            t232.f185459d = C61926c.m72691p(d2.f164794id);
                            t232.f185460e = d2.objectNonceId;
                            FinderObjectDesc finderObjectDesc2 = d2.objectDesc;
                            if (finderObjectDesc2 == null || (linkedList2 = finderObjectDesc2.media) == null || (finderMedia2 = (FinderMedia) C110818d0.m150916N(linkedList2)) == null) {
                                str3 = "wx485a97c844086dc9";
                            } else {
                                StringBuilder sb = new StringBuilder();
                                str3 = "wx485a97c844086dc9";
                                sb.append(finderMedia2.thumbUrl);
                                sb.append(finderMedia2.thumb_url_token);
                                t232.f185461f = sb.toString();
                            }
                            FinderContact finderContact4 = d2.contact;
                            t232.f185462g = finderContact4 != null ? finderContact4.nickname : null;
                        }
                        C101106m k2 = C99364n.m129616h().mo138832k();
                        String d36 = t0Var2.mo88639d3(fVar2);
                        if (t232 == null) {
                            t232 = new C64719t23();
                        }
                        C39818r rVar = C39818r.f106831a;
                        C39622i0 a2 = rVar.mo62444c(t0Var2.getActivity()).mo75002a(cls4);
                        C87412m.m108593f(a2, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
                        C63756e eVar2 = (C63756e) a2;
                        C64488kb1 kb13 = eVar2.f180744i;
                        String str15 = str6;
                        t232.f185463h = kb13.f183905e;
                        t232.f185464i = kb13.f183911n;
                        t232.f185466n = kb13.f183913p;
                        String str16 = "mFavSearchId";
                        String str17 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity";
                        t232.f185467o = kb13.f183915r;
                        t232.f185468p = kb13.f183917t;
                        t232.f185469q = kb13.f183918u;
                        t232.f185465j = kb13.f183916s;
                        C64519lb1 lb13 = kb13.f183921x;
                        if (lb13 == null || (str4 = lb13.f184069d) == null) {
                            str4 = str15;
                        }
                        t232.f185471s = str4;
                        t232.f185470r = (!TextUtils.isEmpty(kb13.f183922y) || k2 == null) ? kb13.f183922y : k2.f295954P;
                        t232.f185476x = eVar2.f180757y ? str3 : str15;
                        C87412m.m108593f(k2, "wrapper");
                        AppCompatActivity activity3 = t0Var2.getActivity();
                        WXMusicObject wXMusicObject = new WXMusicObject();
                        C39622i0 a3 = rVar.mo62443b(t0Var2.getContext()).mo75002a(cls4);
                        C87412m.m108593f(a3, "UICProvider.of(context).…sicMvDataUIC::class.java)");
                        C63756e eVar3 = (C63756e) a3;
                        wXMusicObject.musicUrl = k2.f295968p;
                        wXMusicObject.musicDataUrl = k2.f295966n;
                        String str18 = k2.f295967o;
                        wXMusicObject.musicLowBandUrl = str18;
                        wXMusicObject.musicLowBandDataUrl = str18;
                        wXMusicObject.songAlbumUrl = kb13.f183912o;
                        wXMusicObject.songLyric = kb13.f183910j;
                        WXMediaMessage wXMediaMessage = new WXMediaMessage();
                        wXMediaMessage.mediaObject = wXMusicObject;
                        wXMediaMessage.title = kb13.f183904d;
                        wXMediaMessage.description = k2.f295963h;
                        String str19 = kb13.f183916s;
                        if (str19 == null) {
                            str19 = str15;
                        }
                        wXMediaMessage.messageExt = str19;
                        if (Util.isNullOrNil(d36)) {
                            d36 = ((C59331r) C86312j.m106911c(cls3)).mo84031zw(k2);
                        }
                        if (d36 == null || !C86013q1.m106450k(d36)) {
                            bitmap = null;
                        } else {
                            int dimension = (int) activity3.getResources().getDimension(C0966R.dimen.f3896i7);
                            bitmap = BitmapUtil.getBitmapNative(d36, dimension, dimension);
                        }
                        if (bitmap != null) {
                            wXMediaMessage.thumbData = Util.bmpToByteArray(bitmap, true);
                        } else {
                            int i4 = C0966R.C0969drawable.aiu;
                            if (C85875k4.m106211z()) {
                                i4 = C0966R.C0969drawable.ait;
                            }
                            wXMediaMessage.thumbData = Util.bmpToByteArray(BitmapUtil.getBitmapNative(i4), true);
                        }
                        Intent intent2 = new Intent();
                        Bundle bundle = new Bundle();
                        SendMessageToWX.Req req = new SendMessageToWX.Req();
                        req.message = wXMediaMessage;
                        req.toBundle(bundle);
                        intent2.putExtra("Ksnsupload_timeline", bundle);
                        intent2.putExtra("Ksnsupload_musicid", k2.f295960e);
                        if (((C79138l) C86312j.m106911c(C79138l.class)).mo73994Lc(((C59331r) C86312j.m106911c(cls3)).mo84028pv(k2))) {
                            intent2.putExtra("Ksnsupload_appid", kb13.f183907g);
                        }
                        intent2.putExtra("Ksnsupload_appname", ((C59331r) C86312j.m106911c(cls3)).d40(k2));
                        String a4 = C86493v0.m107223a("music_player");
                        C86493v0.m107224d().mo120947c(a4, true).mo120962i("prePublishId", "music_player");
                        intent2.putExtra("reportSessionId", a4);
                        intent2.putExtra("Ksnsupload_music_share_object_xml", ((C60228r0) C86312j.m106911c(C60228r0.class)).mo84718BQ(t232).mo74685b());
                        intent2.putExtra("Ksnsupload_type", 25);
                        intent2.putExtra("need_result", true);
                        intent2.putExtra("Ksnsupload_source", 1);
                        C87412m.m108592e(activity3, str17);
                        C88144b.m109803u((MMActivity) activity3, ".plugin.sns.ui.SnsUploadUI", intent2, 2, new C63867v0(t0Var2, fVar2, kb13, i3));
                        C62251b1 b1Var2 = (C62251b1) C86312j.m106911c(cls);
                        Activity context3 = t0Var2.getContext();
                        String str20 = t0Var2.f180997g;
                        if (str20 != null) {
                            b1Var2.e40(context3, str20, t0Var2.f180996f, 4);
                            return;
                        }
                        C87412m.m108603p(str16);
                        throw null;
                    }
                    break;
                case 103:
                    C63849t0 t0Var3 = this.f181023d;
                    C59822f fVar3 = this.f181024e;
                    int i5 = this.f181025f;
                    t0Var3.getClass();
                    Log.m105925i("MicroMsg.Mv.MusicMvShareUIC", "doFav isMvWithBeat:%b", Boolean.valueOf(fVar3.f170778z));
                    if (fVar3.f170778z || (d3 = C59822f.f170752A.mo84779d(fVar3)) == null) {
                        t233 = null;
                    } else {
                        C64719t23 t234 = new C64719t23();
                        t234.f185459d = C61926c.m72691p(d3.f164794id);
                        t234.f185460e = d3.objectNonceId;
                        FinderObjectDesc finderObjectDesc3 = d3.objectDesc;
                        if (!(finderObjectDesc3 == null || (linkedList3 = finderObjectDesc3.media) == null || (finderMedia3 = (FinderMedia) C110818d0.m150916N(linkedList3)) == null)) {
                            t234.f185461f = finderMedia3.thumbUrl + finderMedia3.thumb_url_token;
                        }
                        FinderContact finderContact5 = d3.contact;
                        t234.f185462g = finderContact5 != null ? finderContact5.nickname : null;
                        t233 = t234;
                    }
                    if (t233 == null) {
                        t233 = new C64719t23();
                    }
                    C39622i0 a5 = C39818r.f106831a.mo62444c(t0Var3.getActivity()).mo75002a(cls4);
                    C87412m.m108593f(a5, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
                    C64488kb1 kb14 = ((C63756e) a5).f180744i;
                    C101106m k3 = C99364n.m129616h().mo138832k();
                    t233.f185463h = kb14.f183905e;
                    t233.f185464i = kb14.f183911n;
                    t233.f185466n = kb14.f183913p;
                    t233.f185467o = kb14.f183915r;
                    t233.f185468p = kb14.f183917t;
                    t233.f185465j = kb14.f183916s;
                    t233.f185469q = kb14.f183918u;
                    C64519lb1 lb14 = kb14.f183921x;
                    if (!(lb14 == null || (str5 = lb14.f184069d) == null)) {
                        str6 = str5;
                    }
                    t233.f185471s = str6;
                    t233.f185470r = (!TextUtils.isEmpty(kb14.f183922y) || k3 == null) ? kb14.f183922y : k3.f295954P;
                    ((C59331r) C86312j.m106911c(cls3)).hd0(k3, kb14, t0Var3.getActivity(), t233);
                    C59833q.f170832a.mo84801m(t0Var3.getContext(), kb14, fVar3, 2, 9, "", i5);
                    break;
                case 104:
                    this.f181023d.mo88641f3(this.f181024e, false, this.f181025f);
                    break;
                case 105:
                    C39818r rVar2 = C39818r.f106831a;
                    C39622i0 a6 = rVar2.mo62443b(this.f181023d.getContext()).mo75002a(cls4);
                    C87412m.m108593f(a6, "UICProvider.of(context).…sicMvDataUIC::class.java)");
                    C63756e eVar4 = (C63756e) a6;
                    C64488kb1 kb15 = eVar4.f180744i;
                    int i35 = ((MusicMvMainUIC) rVar2.mo62443b(this.f181023d.getContext()).mo75002a(MusicMvMainUIC.class)).mo80453i3(kb15, new C63860a(this.f181023d, kb15, this.f181024e, this.f181025f, eVar4));
                    if (i35 != 7) {
                        C59833q.m69726g(C59833q.f170832a, this.f181023d.getActivity(), kb15, this.f181024e, 2, i35, this.f181025f == 3 ? 5 : 3, 0, eVar4.mo88571e3(), eVar4.mo88569c3(), eVar4.mo88570d3(), eVar4.f180736H, 64, (Object) null);
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: sb2.t0$j */
    public static final class C63861j implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C63849t0 f181031d;

        /* renamed from: e */
        public final /* synthetic */ C59822f f181032e;

        /* renamed from: f */
        public final /* synthetic */ int f181033f;

        /* renamed from: g */
        public final /* synthetic */ C63756e f181034g;

        /* renamed from: h */
        public final /* synthetic */ C60905o f181035h;

        /* renamed from: sb2.t0$j$a */
        public static final class C63862a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ C63849t0 f181036a;

            /* renamed from: b */
            public final /* synthetic */ C59822f f181037b;

            public C63862a(C63849t0 t0Var, C59822f fVar) {
                this.f181036a = t0Var;
                this.f181037b = fVar;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                if (z) {
                    MusicMvMainUIC musicMvMainUIC = (MusicMvMainUIC) C39818r.f106831a.mo62444c(this.f181036a.getActivity()).mo75002a(MusicMvMainUIC.class);
                    C59822f fVar = this.f181037b;
                    musicMvMainUIC.getClass();
                    C87412m.m108594g(fVar, "musicMv");
                    String str2 = musicMvMainUIC.f163267d;
                    Log.m105924i(str2, "deleteMv " + fVar.f170755c + ' ' + fVar.f170756d + ' ' + fVar.f170768p);
                    int i = fVar.f170768p;
                    if (i == 1) {
                        Long l = fVar.f170755c;
                        String str3 = fVar.f170756d;
                        if (l != null && str3 != null) {
                            C86709a0.m107524d().mo123460f(new C46530q2(C66785b.f191882e.mo90662O5(), l.longValue(), str3, false));
                        }
                    } else if (i == 4) {
                        FinderObject finderObject = fVar.f170772t;
                        String str4 = null;
                        Long valueOf = finderObject != null ? Long.valueOf(finderObject.f164794id) : null;
                        FinderObject finderObject2 = fVar.f170772t;
                        if (finderObject2 != null) {
                            str4 = finderObject2.objectNonceId;
                        }
                        String str5 = str4;
                        if (valueOf != null && str5 != null) {
                            C86709a0.m107524d().mo123460f(new C46530q2(C66785b.f191882e.mo90662O5(), valueOf.longValue(), str5, false));
                        }
                    }
                }
            }
        }

        public C63861j(C63849t0 t0Var, C59822f fVar, int i, C63756e eVar, C60905o oVar) {
            this.f181031d = t0Var;
            this.f181032e = fVar;
            this.f181033f = i;
            this.f181034g = eVar;
            this.f181035h = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r24, int r25) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Class<sb2.e> r1 = sb2.C63756e.class
                sb2.t0 r2 = r0.f181031d
                r3 = 1
                r2.f180995e = r3
                sb2.j1 r4 = r2.f180994d
                if (r4 == 0) goto L_0x001a
                long r5 = java.lang.System.currentTimeMillis()
                r7 = 4
                r9 = 10
                r10 = 0
                java.lang.String r8 = "2"
                r4.mo88590a(r5, r7, r8, r9, r10)
            L_0x001a:
                int r2 = r24.getItemId()
                java.lang.String r4 = "musicMv"
                r7 = 0
                switch(r2) {
                    case 201: goto L_0x095a;
                    case 202: goto L_0x08ed;
                    case 203: goto L_0x08ca;
                    case 204: goto L_0x0515;
                    case 205: goto L_0x0028;
                    default: goto L_0x0026;
                }
            L_0x0026:
                goto L_0x0a3f
            L_0x0028:
                bl3.r r2 = bl3.C39818r.f106831a
                sb2.t0 r13 = r0.f181031d
                android.app.Activity r13 = r13.getContext()
                bl3.r$a r13 = r2.mo62443b(r13)
                java.lang.Class<sb2.k> r14 = sb2.C13642k.class
                androidx.lifecycle.i0 r13 = r13.mo75002a(r14)
                sb2.k r13 = (sb2.C13642k) r13
                hb2.f r14 = r0.f181032e
                r13.getClass()
                gy3.C87412m.m108594g(r14, r4)
                boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r4 != 0) goto L_0x0066
                boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r4 != 0) goto L_0x005a
                boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r4 != 0) goto L_0x005a
                int r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                r15 = 788529167(0x2f00000f, float:1.1641553E-10)
                if (r4 != r15) goto L_0x0058
                goto L_0x005a
            L_0x0058:
                r4 = 0
                goto L_0x005b
            L_0x005a:
                r4 = 1
            L_0x005b:
                if (r4 != 0) goto L_0x0066
                boolean r4 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r4 == 0) goto L_0x0064
                goto L_0x0066
            L_0x0064:
                r4 = 0
                goto L_0x0067
            L_0x0066:
                r4 = 1
            L_0x0067:
                if (r4 == 0) goto L_0x0a3f
                androidx.appcompat.app.AppCompatActivity r4 = r13.getActivity()
                bl3.r$a r2 = r2.mo62444c(r4)
                androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
                sb2.e r1 = (sb2.C63756e) r1
                te3.kb1 r1 = r1.f180744i
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r4 = r1.f183909i
                java.lang.String r15 = "songId"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183904d
                java.lang.String r15 = "songName"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183905e
                java.lang.String r15 = "singer"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183911n
                java.lang.String r15 = "albumName"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183912o
                java.lang.String r15 = "albumUrl"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183908h
                java.lang.String r15 = "musicWebUrl"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183906f
                java.lang.String r15 = "musicDataUrl"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183913p
                java.lang.String r15 = "genre"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183914q
                java.lang.String r15 = "publicTime"
                r2.put(r15, r4)
                java.lang.String r4 = r1.f183907g
                java.lang.String r15 = "musicAppId"
                r2.put(r15, r4)
                long r10 = r1.f183915r
                java.lang.String r4 = "publicTimeS"
                r2.put(r4, r10)
                java.lang.String r4 = r1.f183916s
                java.lang.String r10 = "extraInfo"
                r2.put(r10, r4)
                java.lang.String r4 = r1.f183917t
                java.lang.String r10 = "identification"
                r2.put(r10, r4)
                te3.lb1 r4 = r1.f183921x
                if (r4 == 0) goto L_0x00e9
                java.lang.String r4 = r4.f184069d
                if (r4 != 0) goto L_0x00eb
            L_0x00e9:
                java.lang.String r4 = ""
            L_0x00eb:
                java.lang.String r10 = "operationUrl"
                r2.put(r10, r4)
                la2.n r4 = la2.C99364n.m129616h()
                com.tencent.mm.plugin.music.player.base.g r4 = r4.mo138822a()
                r10 = 0
                if (r4 == 0) goto L_0x0105
                int r4 = r4.getDuration()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L_0x0106
            L_0x0105:
                r4 = r10
            L_0x0106:
                java.lang.String r11 = "duration"
                r2.put(r11, r4)
                int r1 = r1.f183918u
                java.lang.String r4 = "musicDuration"
                r2.put(r4, r1)
                la2.n r1 = la2.C99364n.m129616h()
                com.tencent.mm.plugin.music.player.base.g r1 = r1.mo138822a()
                if (r1 == 0) goto L_0x0126
                int r1 = r1.getPlayPosition()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x0127
            L_0x0126:
                r1 = r10
            L_0x0127:
                java.lang.String r4 = "currentPosition"
                r2.put(r4, r1)
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                java.lang.Long r4 = r14.f170753a
                java.lang.String r11 = "localId"
                r1.put(r11, r4)
                java.lang.String r4 = r14.f170754b
                java.lang.String r11 = "localCoverPath"
                r1.put(r11, r4)
                java.lang.Long r4 = r14.f170755c
                java.lang.String r11 = "mvObjectId"
                r1.put(r11, r4)
                java.lang.Long r4 = r14.f170755c
                if (r4 == 0) goto L_0x0152
                long r15 = r4.longValue()
                goto L_0x0153
            L_0x0152:
                r15 = r7
            L_0x0153:
                java.lang.String r4 = o40.C61926c.m72691p(r15)
                java.lang.String r11 = "unsignedMvObjectId"
                r1.put(r11, r4)
                java.lang.String r4 = r14.f170756d
                java.lang.String r11 = "mvObjectNonceId"
                r1.put(r11, r4)
                java.lang.String r4 = r14.f170758f
                java.lang.String r11 = "mvMakerNickName"
                r1.put(r11, r4)
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r14.f170762j
                if (r4 == 0) goto L_0x0174
                java.lang.String r4 = r4.username
                goto L_0x0175
            L_0x0174:
                r4 = r10
            L_0x0175:
                java.lang.String r11 = "mvMakerUsername"
                r1.put(r11, r4)
                java.lang.String r4 = r14.f170757e
                java.lang.String r11 = "coverUrl"
                r1.put(r11, r4)
                int r4 = r14.f170763k
                java.lang.String r15 = "likeCount"
                r1.put(r15, r4)
                int r4 = r14.f170764l
                java.lang.String r15 = "forwardCount"
                r1.put(r15, r4)
                int r4 = r14.f170765m
                java.lang.String r15 = "commentCount"
                r1.put(r15, r4)
                int r4 = r14.f170768p
                java.lang.String r15 = "mvPostStatus"
                r1.put(r15, r4)
                boolean r4 = r14.f170770r
                java.lang.String r15 = "isDelete"
                r1.put(r15, r4)
                te3.jb1 r4 = r14.f170761i
                if (r4 == 0) goto L_0x01b2
                float r4 = r4.f183775d
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                goto L_0x01b3
            L_0x01b2:
                r4 = r10
            L_0x01b3:
                java.lang.String r15 = "originality"
                r1.put(r15, r4)
                te3.jb1 r4 = r14.f170761i
                if (r4 == 0) goto L_0x01c4
                float r4 = r4.f183776e
                java.lang.Float r4 = java.lang.Float.valueOf(r4)
                goto L_0x01c5
            L_0x01c4:
                r4 = r10
            L_0x01c5:
                java.lang.String r15 = "completion"
                r1.put(r15, r4)
                org.json.JSONArray r4 = new org.json.JSONArray
                r4.<init>()
                java.util.LinkedList<te3.mb1> r15 = r14.f170759g
                java.util.Iterator r15 = r15.iterator()
                r5 = 0
            L_0x01d6:
                boolean r17 = r15.hasNext()
                java.lang.String r9 = "index"
                if (r17 == 0) goto L_0x023c
                java.lang.Object r17 = r15.next()
                int r19 = r5 + 1
                if (r5 < 0) goto L_0x0238
                r6 = r17
                te3.mb1 r6 = (te3.C64550mb1) r6
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                r3.put(r9, r5)
                r21 = r13
                long r12 = r6.f184260f
                java.lang.String r9 = "refObjectId"
                r3.put(r9, r12)
                long r12 = r6.f184260f
                java.lang.String r9 = o40.C61926c.m72691p(r12)
                java.lang.String r12 = "unsignedRefObjectId"
                r3.put(r12, r9)
                java.lang.String r9 = r6.f184261g
                java.lang.String r12 = "refNonceId"
                r3.put(r12, r9)
                long r12 = r6.f184258d
                java.lang.String r9 = "timeOffsetInMvMs"
                r3.put(r9, r12)
                int r9 = r6.f184259e
                java.lang.String r12 = "timeLengthInMvMs"
                r3.put(r12, r9)
                long r12 = r6.f184262h
                java.lang.String r9 = "timeOffsetInClipMs"
                r3.put(r9, r12)
                int r6 = r6.f184264j
                java.lang.String r9 = "isFirstUpload"
                r3.put(r9, r6)
                r4.put(r3)
                r5 = r19
                r13 = r21
                r3 = 1
                goto L_0x01d6
            L_0x0238:
                sx3.C64197v.m75542k()
                throw r10
            L_0x023c:
                r21 = r13
                org.json.JSONArray r3 = new org.json.JSONArray
                r3.<init>()
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r14.f170767o
                java.util.Iterator r6 = r6.iterator()
                r12 = 0
            L_0x024a:
                boolean r13 = r6.hasNext()
                if (r13 == 0) goto L_0x0356
                java.lang.Object r13 = r6.next()
                int r14 = r12 + 1
                if (r12 < 0) goto L_0x0352
                com.tencent.mm.protocal.protobuf.FinderObject r13 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r13
                org.json.JSONObject r15 = new org.json.JSONObject
                r15.<init>()
                r15.put(r9, r12)
                r19 = r6
                long r5 = r13.f164794id
                java.lang.String r12 = "id"
                r15.put(r12, r5)
                long r5 = r13.f164794id
                java.lang.String r5 = o40.C61926c.m72691p(r5)
                java.lang.String r6 = "unsignedId"
                r15.put(r6, r5)
                java.lang.String r5 = r13.objectNonceId
                java.lang.String r6 = "objectNonceId"
                r15.put(r6, r5)
                com.tencent.mm.protocal.protobuf.FinderContact r5 = r13.contact
                if (r5 == 0) goto L_0x0286
                java.lang.String r5 = r5.username
                goto L_0x0287
            L_0x0286:
                r5 = r10
            L_0x0287:
                java.lang.String r6 = "username"
                r15.put(r6, r5)
                com.tencent.mm.protocal.protobuf.FinderContact r5 = r13.contact
                if (r5 == 0) goto L_0x0294
                java.lang.String r5 = r5.nickname
                goto L_0x0295
            L_0x0294:
                r5 = r10
            L_0x0295:
                java.lang.String r6 = "nickname"
                r15.put(r6, r5)
                long r5 = r13.f164794id
                java.lang.String r12 = "video_"
                int r22 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r12)
                if (r22 == 0) goto L_0x02b2
                long r7 = r13.f164794id
                r5.append(r7)
                goto L_0x02b7
            L_0x02b2:
                java.lang.String r6 = r13.objectNonceId
                r5.append(r6)
            L_0x02b7:
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "mediaId"
                r15.put(r6, r5)
                gy3.C87412m.m108594g(r5, r6)
                com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
                ma2.t r7 = ma2.C61454t.f174766a
                java.lang.String r5 = r7.mo86431c(r5)
                r6.<init>((java.lang.String) r5)
                java.lang.String r5 = r6.mo119971i()
                java.lang.String r6 = "VFSFile(MusicFileNameUti…th(mediaId)).absolutePath"
                gy3.C87412m.m108593f(r5, r6)
                java.lang.String r6 = "videoPath"
                r15.put(r6, r5)
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r13.objectDesc
                if (r5 == 0) goto L_0x0348
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r5 = r5.media
                if (r5 == 0) goto L_0x0348
                java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
                com.tencent.mm.protocal.protobuf.FinderMedia r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r5
                if (r5 == 0) goto L_0x0348
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r5.url
                r6.append(r7)
                java.lang.String r7 = r5.url_token
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "video_url"
                r15.put(r7, r6)
                java.lang.String r6 = r5.decodeKey
                java.lang.String r7 = "decodeKey"
                r15.put(r7, r6)
                int r6 = r5.fileSize
                java.lang.String r7 = "fileSize"
                r15.put(r7, r6)
                float r6 = r5.width
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                java.lang.String r7 = "width"
                r15.put(r7, r6)
                float r6 = r5.height
                java.lang.Float r6 = java.lang.Float.valueOf(r6)
                java.lang.String r7 = "height"
                r15.put(r7, r6)
                int r6 = r5.videoDuration
                java.lang.String r7 = "videoDuration"
                r15.put(r7, r6)
                int r6 = r5.mediaType
                java.lang.String r7 = "mediaType"
                r15.put(r7, r6)
                int r6 = r5.bitrate
                java.lang.String r7 = "bitrate"
                r15.put(r7, r6)
                java.lang.String r5 = r5.coverUrl
                r15.put(r11, r5)
            L_0x0348:
                r3.put(r15)
                r12 = r14
                r6 = r19
                r7 = 0
                goto L_0x024a
            L_0x0352:
                sx3.C64197v.m75542k()
                throw r10
            L_0x0356:
                r5 = 11
                rx3.l[] r6 = new rx3.C13604l[r5]
                rx3.l r5 = new rx3.l
                r7 = 5286(0x14a6, float:7.407E-42)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r8 = "NetSceneMusicMvCheckPermission"
                r5.<init>(r7, r8)
                r7 = 0
                r6[r7] = r5
                rx3.l r7 = new rx3.l
                r8 = 3710(0xe7e, float:5.199E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvFinderLike"
                r7.<init>(r8, r9)
                r8 = 1
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 5904(0x1710, float:8.273E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvGetBeatTrack"
                r7.<init>(r8, r9)
                r8 = 2
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 6860(0x1acc, float:9.613E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvGetRecommendList"
                r7.<init>(r8, r9)
                r8 = 3
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 3966(0xf7e, float:5.558E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvGetFinderFavFeed"
                r7.<init>(r8, r9)
                r8 = 4
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 3763(0xeb3, float:5.273E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvGetFinderFeedDetail"
                r7.<init>(r8, r9)
                r8 = 5
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 3965(0xf7d, float:5.556E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvGetFinderLikeFeed"
                r7.<init>(r8, r9)
                r8 = 6
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 5292(0x14ac, float:7.416E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvGetSongStatus"
                r7.<init>(r8, r9)
                r8 = 7
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 6820(0x1aa4, float:9.557E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvHeartbeat"
                r7.<init>(r8, r9)
                r8 = 8
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 6893(0x1aed, float:9.659E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvJoin"
                r7.<init>(r8, r9)
                r8 = 9
                r6[r8] = r7
                rx3.l r7 = new rx3.l
                r8 = 6672(0x1a10, float:9.35E-42)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.String r9 = "NetSceneMusicMvPostLiveMsg"
                r7.<init>(r8, r9)
                r8 = 10
                r6[r8] = r7
                java.util.Map r6 = sx3.C90364q0.m113147f(r6)
                org.json.JSONObject r7 = new org.json.JSONObject
                r7.<init>()
                java.util.HashMap<java.lang.Integer, jb2.c> r8 = jb2.C46455a.f125135h
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            L_0x0420:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0454
                java.lang.Object r9 = r8.next()
                java.util.Map$Entry r9 = (java.util.Map.Entry) r9
                java.lang.Object r10 = r9.getKey()
                java.lang.Object r10 = r6.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                if (r10 != 0) goto L_0x0446
                java.lang.Object r10 = r9.getKey()
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                java.lang.String r10 = java.lang.String.valueOf(r10)
            L_0x0446:
                java.lang.Object r9 = r9.getValue()
                jb2.c r9 = (jb2.C46456c) r9
                java.lang.String r9 = r9.toString()
                r7.put(r10, r9)
                goto L_0x0420
            L_0x0454:
                qo3.n r6 = new qo3.n
                androidx.appcompat.app.AppCompatActivity r8 = r21.getActivity()
                r5 = 0
                r6.<init>((android.content.Context) r8, (int) r5, (boolean) r5)
                sb2.f r5 = new sb2.f
                r13 = r21
                r5.<init>(r13)
                r6.f225771i = r5
                sb2.g r5 = new sb2.g
                r5.<init>(r13)
                r6.f225773j = r5
                sb2.h r5 = new sb2.h
                r14 = r5
                r15 = r2
                r16 = r13
                r17 = r1
                r18 = r4
                r19 = r3
                r20 = r7
                r14.<init>(r15, r16, r17, r18, r19, r20)
                r6.f225782p = r5
                sb2.i r5 = new sb2.i
                r14 = r5
                r15 = r13
                r16 = r2
                r14.<init>(r15, r16, r17, r18, r19, r20)
                r6.f225787r = r5
                sb2.j r5 = sb2.C63773j.f180803a
                r6.f225761d = r5
                r6.mo107573q()
                java.lang.String r5 = r13.f38654d
                java.lang.String r6 = "MV START####################################################START"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
                java.lang.String r5 = r13.f38654d
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "songInfoText: "
                r6.append(r7)
                r6.append(r2)
                java.lang.String r2 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
                java.lang.String r2 = r13.f38654d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "mvHeadInfoText: "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
                java.lang.String r1 = r13.f38654d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "mvTrackInfoText: "
                r2.append(r5)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                java.lang.String r1 = r13.f38654d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "mvRefObjInfoText: "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                java.lang.String r1 = r13.f38654d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "cgiInfo: "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                java.lang.String r1 = r13.f38654d
                java.lang.String r2 = "MV END  ####################################################  END"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                goto L_0x0a3f
            L_0x0515:
                sb2.e r2 = r0.f181034g
                r3 = 1
                r2.f180752t = r3
                sb2.t0 r2 = r0.f181031d
                jq3.o r4 = r0.f181035h
                r2.getClass()
                r6 = 4
                java.lang.Integer[] r7 = new java.lang.Integer[r6]
                r6 = 2131314195(0x7f094613, float:1.8246808E38)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r5 = 0
                r7[r5] = r6
                r6 = 2131299726(0x7f090d8e, float:1.8217462E38)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r7[r3] = r6
                r3 = 2131305107(0x7f092293, float:1.8228376E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6 = 2
                r7[r6] = r3
                r3 = 2131305135(0x7f0922af, float:1.8228432E38)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r6 = 3
                r7[r6] = r3
                java.util.Set r3 = sx3.C110826x0.m151017e(r7)
                bl3.r r6 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r7 = r2.getActivity()
                bl3.r$a r7 = r6.mo62444c(r7)
                androidx.lifecycle.i0 r7 = r7.mo75002a(r1)
                sb2.e r7 = (sb2.C63756e) r7
                boolean r7 = r7.f180752t
                if (r7 == 0) goto L_0x0575
                sb2.k1 r7 = r2.f180998h
                android.view.View r4 = r4.f44854d
                r7.mo13035a(r4)
                r7.mo13036b(r3)
                sb2.k1 r2 = r2.f180998h
                java.util.HashMap<java.lang.Integer, sb2.k1$b> r2 = r2.f38657b
                r2.clear()
                goto L_0x0586
            L_0x0575:
                sb2.k1 r7 = r2.f180998h
                android.view.View r4 = r4.f44854d
                r7.mo13035a(r4)
                r7.mo13037c(r3)
                sb2.k1 r2 = r2.f180998h
                java.util.HashMap<java.lang.Integer, sb2.k1$b> r2 = r2.f38657b
                r2.clear()
            L_0x0586:
                sb2.t0 r2 = r0.f181031d
                jq3.o r3 = r0.f181035h
                hb2.f r4 = r0.f181032e
                r2.getClass()
                androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
                bl3.r$a r2 = r6.mo62444c(r2)
                androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
                sb2.e r1 = (sb2.C63756e) r1
                boolean r1 = r1.f180752t
                r2 = 2131308034(0x7f092e02, float:1.8234312E38)
                r6 = 2131308030(0x7f092dfe, float:1.8234304E38)
                if (r1 != 0) goto L_0x082f
                int r1 = r4.f170768p
                r7 = 1
                if (r1 == r7) goto L_0x0794
                r7 = 2
                if (r1 == r7) goto L_0x06fa
                r7 = 3
                if (r1 == r7) goto L_0x0652
                r7 = 4
                if (r1 == r7) goto L_0x05b7
                goto L_0x0a3f
            L_0x05b7:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r2)
                if (r1 != 0) goto L_0x05c0
                goto L_0x0603
            L_0x05c0:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                r4 = 8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r2.mo10233c(r7)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r4 = 0
                java.lang.Object r2 = r2.mo10231a(r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x0603:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r6)
                if (r1 != 0) goto L_0x060d
                goto L_0x0a3f
            L_0x060d:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r3 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r3)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0a3f
            L_0x0652:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r2)
                if (r1 != 0) goto L_0x065b
                goto L_0x069d
            L_0x065b:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                r5 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                r2.mo10233c(r7)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r5 = 0
                java.lang.Object r2 = r2.mo10231a(r5)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x069d:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r6)
                if (r1 != 0) goto L_0x06a6
                goto L_0x06e8
            L_0x06a6:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                r5 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
                r2.mo10233c(r7)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r5 = 0
                java.lang.Object r2 = r2.mo10231a(r5)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x06e8:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r6)
                if (r1 == 0) goto L_0x0a3f
                sb2.x0 r2 = new sb2.x0
                r2.<init>(r4)
                r1.setOnClickListener(r2)
                goto L_0x0a3f
            L_0x06fa:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r2)
                if (r1 != 0) goto L_0x0703
                goto L_0x0745
            L_0x0703:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                r4 = 0
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r2.mo10233c(r7)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r4 = 0
                java.lang.Object r2 = r2.mo10231a(r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x0745:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r6)
                if (r1 != 0) goto L_0x074f
                goto L_0x0a3f
            L_0x074f:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r3 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r3)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0a3f
            L_0x0794:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r2)
                if (r1 != 0) goto L_0x079d
                goto L_0x07e0
            L_0x079d:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                r4 = 8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r2.mo10233c(r7)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r4 = 0
                java.lang.Object r2 = r2.mo10231a(r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x07e0:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r6)
                if (r1 != 0) goto L_0x07ea
                goto L_0x0a3f
            L_0x07ea:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r3 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r3)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0a3f
            L_0x082f:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r2)
                if (r1 != 0) goto L_0x0838
                goto L_0x087b
            L_0x0838:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                r4 = 8
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                r2.mo10233c(r7)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r4 = 0
                java.lang.Object r2 = r2.mo10231a(r4)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x087b:
                android.view.View r1 = r3.f44854d
                android.view.View r1 = r1.findViewById(r6)
                if (r1 != 0) goto L_0x0885
                goto L_0x0a3f
            L_0x0885:
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                r3 = 8
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r2.mo10233c(r3)
                java.lang.Object[] r8 = r2.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r10 = "initLocalPostStats"
                java.lang.String r11 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r1
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r8 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC"
                java.lang.String r9 = "initLocalPostStats"
                java.lang.String r10 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
                goto L_0x0a3f
            L_0x08ca:
                hb2.f r1 = r0.f181032e
                java.lang.Long r1 = r1.f170755c
                if (r1 == 0) goto L_0x0a3f
                sb2.t0 r2 = r0.f181031d
                long r3 = r1.longValue()
                java.lang.Class<fv.r> r1 = p529fv.C59331r.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                fv.r r1 = (p529fv.C59331r) r1
                android.app.Activity r2 = r2.getContext()
                r5 = 69
                java.lang.String r3 = o40.C61926c.m72691p(r3)
                r1.mo84021Fq(r2, r5, r3)
                goto L_0x0a3f
            L_0x08ed:
                qo3.q r1 = new qo3.q
                sb2.t0 r2 = r0.f181031d
                android.app.Activity r2 = r2.getContext()
                r1.<init>(r2)
                sb2.t0 r2 = r0.f181031d
                android.app.Activity r2 = r2.getContext()
                r3 = 2131833307(0x7f1131db, float:1.9299692E38)
                java.lang.String r2 = r2.getString(r3)
                r1.mo107595g(r2)
                r2 = 2131821450(0x7f11038a, float:1.9275644E38)
                r1.mo107601m(r2)
                sb2.t0 r2 = r0.f181031d
                android.app.Activity r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131101361(0x7f0606b1, float:1.781513E38)
                int r2 = r2.getColor(r3)
                r1.mo107599k(r2)
                sb2.t0 r2 = r0.f181031d
                android.app.Activity r2 = r2.getContext()
                r3 = 2131821426(0x7f110372, float:1.9275595E38)
                java.lang.String r2 = r2.getString(r3)
                r1.mo107598j(r2)
                sb2.t0 r2 = r0.f181031d
                android.app.Activity r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131101252(0x7f060644, float:1.7814908E38)
                int r2 = r2.getColor(r3)
                qo3.g$i r3 = r1.f225837a
                qo3.a r3 = r3.f225714b
                r3.f225637T = r2
                sb2.t0$j$a r2 = new sb2.t0$j$a
                sb2.t0 r3 = r0.f181031d
                hb2.f r4 = r0.f181032e
                r2.<init>(r3, r4)
                r1.mo107590b(r2)
                r1.mo107603o()
                goto L_0x0a3f
            L_0x095a:
                sb2.t0 r2 = r0.f181031d
                hb2.f r3 = r0.f181032e
                int r5 = r0.f181033f
                r2.getClass()
                gy3.C87412m.m108594g(r3, r4)
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                bl3.r r6 = bl3.C39818r.f106831a
                android.app.Activity r7 = r2.getContext()
                bl3.r$a r6 = r6.mo62443b(r7)
                androidx.lifecycle.i0 r1 = r6.mo75002a(r1)
                java.lang.String r6 = "UICProvider.of(context).…sicMvDataUIC::class.java)"
                gy3.C87412m.m108593f(r1, r6)
                sb2.e r1 = (sb2.C63756e) r1
                te3.p23 r6 = new te3.p23
                r6.<init>()
                com.tencent.mm.protocal.protobuf.FinderObject r7 = new com.tencent.mm.protocal.protobuf.FinderObject
                r7.<init>()
                java.lang.Long r8 = r3.f170755c
                if (r8 == 0) goto L_0x0993
                long r8 = r8.longValue()
                goto L_0x0995
            L_0x0993:
                r8 = 0
            L_0x0995:
                r7.f164794id = r8
                java.lang.String r8 = r3.f170756d
                r7.objectNonceId = r8
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r8 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc
                r8.<init>()
                te3.hb1 r9 = new te3.hb1
                r9.<init>()
                te3.kb1 r10 = r1.f180744i
                r9.f183456e = r10
                te3.jb1 r10 = new te3.jb1
                r10.<init>()
                r11 = 0
                r10.f183775d = r11
                r10.f183776e = r11
                r9.f183457f = r10
                int r10 = r3.f170768p
                r11 = 1
                if (r10 != r11) goto L_0x09bf
                java.util.LinkedList<te3.mb1> r11 = r3.f170759g
                r9.f183455d = r11
                goto L_0x09d4
            L_0x09bf:
                r11 = 4
                if (r10 != r11) goto L_0x09d4
                com.tencent.mm.protocal.protobuf.FinderObject r11 = r3.f170772t
                if (r11 == 0) goto L_0x09d4
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r11 = r11.objectDesc
                if (r11 == 0) goto L_0x09d4
                te3.hb1 r11 = r11.mvInfo
                if (r11 == 0) goto L_0x09d4
                java.util.LinkedList<te3.mb1> r11 = r11.f183455d
                if (r11 == 0) goto L_0x09d4
                r9.f183455d = r11
            L_0x09d4:
                r11 = 1
                r9.f183461j = r11
                r8.mvInfo = r9
                r7.objectDesc = r8
                r6.f184739d = r7
                if (r10 != r11) goto L_0x09e5
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r7 = r3.f170767o
                r6.f184740e = r7
                r7 = 4
                goto L_0x09ec
            L_0x09e5:
                r7 = 4
                if (r10 != r7) goto L_0x09ec
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r8 = r3.f170773u
                r6.f184740e = r8
            L_0x09ec:
                int r8 = r1.f180753u
                r6.f184745j = r8
                r6.f184744i = r9
                java.lang.String r3 = r2.mo88639d3(r3)
                r6.f184741f = r3
                byte[] r3 = r6.toByteArray()
                java.lang.String r6 = "key_track_data"
                r4.putExtra(r6, r3)
                te3.kb1 r1 = r1.f180744i
                int r1 = r1.f183918u
                java.lang.String r3 = "key_mv_music_duration"
                r4.putExtra(r3, r1)
                r1 = 3
                if (r5 != r1) goto L_0x0a0f
                r9 = 4
                goto L_0x0a10
            L_0x0a0f:
                r9 = 3
            L_0x0a10:
                java.lang.String r1 = "key_mv_enter_maker_ui_from_scene"
                r4.putExtra(r1, r9)
                java.lang.Class<er1.b> r1 = er1.C58684b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                er1.b r1 = (er1.C58684b) r1
                androidx.appcompat.app.AppCompatActivity r3 = r2.getActivity()
                r1.ky0(r3, r4)
                java.lang.Class<ox.b> r1 = p640ox.C77049b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ox.b r1 = (p640ox.C77049b) r1
                android.app.Activity r2 = r2.getContext()
                java.lang.Class<te3.w23> r3 = te3.C64793w23.class
                r4 = 7
                pe3.a r1 = r1.Wi0(r2, r4, r3)
                te3.w23 r1 = (te3.C64793w23) r1
                if (r1 != 0) goto L_0x0a3c
                goto L_0x0a3f
            L_0x0a3c:
                r2 = 1
                r1.f186037h = r2
            L_0x0a3f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sb2.C63849t0.C63861j.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63849t0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ec  */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88638c3(jq3.C60905o r19, hb2.C59822f r20, int r21) {
        /*
            r18 = this;
            r6 = r18
            r7 = r20
            java.lang.Class<ym.l> r0 = p763ym.C79138l.class
            java.lang.String r1 = "holder"
            r8 = r19
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "musicMv"
            gy3.C87412m.m108594g(r7, r1)
            bl3.r r1 = bl3.C39818r.f106831a
            android.app.Activity r2 = r18.getContext()
            bl3.r$a r1 = r1.mo62443b(r2)
            java.lang.Class<sb2.e> r2 = sb2.C63756e.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(context).…sicMvDataUIC::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r9 = r1
            sb2.e r9 = (sb2.C63756e) r9
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r7.f170762j
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = r1.username
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            zc1.b r3 = zc1.C66785b.f191882e
            java.lang.String r3 = r3.mo90662O5()
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            r3 = 1
            r10 = r1 ^ 1
            int r1 = r7.f170768p
            r4 = 4
            r5 = 0
            if (r1 != r3) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            if (r1 != r4) goto L_0x004b
        L_0x0049:
            r11 = 1
            goto L_0x004c
        L_0x004b:
            r11 = 0
        L_0x004c:
            java.lang.Class<ky2.i> r1 = ky2.C10432i.class
            long r12 = r9.f180747o
            r14 = 1
            long r12 = r12 & r14
            r14 = 0
            r2 = 2
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x00b9
            java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ht1.t1 r12 = (ht1.C60200t1) r12
            boolean r12 = r12.mo76873sF()
            di3.d r13 = di3.C86312j.m106911c(r1)
            ky2.i r13 = (ky2.C10432i) r13
            boolean r13 = r13.mo10750e()
            if (r13 == 0) goto L_0x0080
            di3.d r1 = di3.C86312j.m106911c(r1)
            ky2.i r1 = (ky2.C10432i) r1
            int r1 = r1.mo10740Mn()
            if (r1 != r2) goto L_0x0080
            r1 = 1
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            java.lang.String r13 = r9.f180739d
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r12)
            r14[r5] = r15
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r1)
            r14[r3] = r15
            java.lang.String r15 = "[canCreateMv] show:%s, isTeenModeAndNothing:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r15, r14)
            if (r12 == 0) goto L_0x00b9
            if (r1 == 0) goto L_0x009b
            goto L_0x00b9
        L_0x009b:
            int r1 = r7.f170768p
            if (r1 == r3) goto L_0x00af
            if (r1 == r4) goto L_0x00a2
            goto L_0x00b9
        L_0x00a2:
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r7.f170772t
            if (r1 == 0) goto L_0x00b9
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r7.f170773u
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00b9
            goto L_0x00b7
        L_0x00af:
            java.util.LinkedList<te3.mb1> r1 = r7.f170759g
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00b9
        L_0x00b7:
            r12 = 1
            goto L_0x00ba
        L_0x00b9:
            r12 = 0
        L_0x00ba:
            sb2.j1 r1 = new sb2.j1
            android.app.Activity r13 = r18.getContext()
            long r14 = java.lang.System.currentTimeMillis()
            r1.<init>(r13, r14)
            r6.f180994d = r1
            r6.f180995e = r5
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            if (r11 == 0) goto L_0x00de
            qo3.n r13 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r14 = r18.getActivity()
            r13.<init>((android.content.Context) r14, (int) r5, (boolean) r5)
            r1.f27484d = r13
            goto L_0x0107
        L_0x00de:
            qo3.n r13 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r14 = r18.getActivity()
            r13.<init>((android.content.Context) r14, (int) r5, (boolean) r3)
            r1.f27484d = r13
            androidx.appcompat.app.AppCompatActivity r14 = r18.getActivity()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131833333(0x7f1131f5, float:1.9299745E38)
            java.lang.String r14 = r14.getString(r15)
            r15 = 17
            androidx.appcompat.app.AppCompatActivity r4 = r18.getActivity()
            r2 = 12
            int r2 = kg3.C76577a.m92151b(r4, r2)
            r13.mo107568m(r14, r15, r2)
        L_0x0107:
            di3.d r2 = di3.C86312j.m106911c(r0)
            ym.l r2 = (p763ym.C79138l) r2
            android.app.Activity r4 = r18.getContext()
            te3.kb1 r13 = r9.f180744i
            if (r13 == 0) goto L_0x0118
            java.lang.String r13 = r13.f183907g
            goto L_0x0119
        L_0x0118:
            r13 = 0
        L_0x0119:
            java.lang.String r2 = r2.mo74012l5(r4, r13)
            te3.kb1 r4 = r9.f180744i
            if (r4 == 0) goto L_0x0124
            java.lang.String r4 = r4.f183907g
            goto L_0x0125
        L_0x0124:
            r4 = 0
        L_0x0125:
            java.lang.String r13 = "wx122a2d4c4b5f211e"
            boolean r4 = z04.C112551y.m153809i(r13, r4, r3)
            gy3.a0 r13 = new gy3.a0
            r13.<init>()
            if (r2 == 0) goto L_0x0140
            int r14 = r2.length()
            if (r14 <= 0) goto L_0x013b
            r14 = 1
            goto L_0x013c
        L_0x013b:
            r14 = 0
        L_0x013c:
            if (r14 != r3) goto L_0x0140
            r14 = 1
            goto L_0x0141
        L_0x0140:
            r14 = 0
        L_0x0141:
            r13.f27482d = r14
            if (r4 == 0) goto L_0x0147
            r13.f27482d = r5
        L_0x0147:
            if (r2 == 0) goto L_0x0156
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x0151
            r4 = 1
            goto L_0x0152
        L_0x0151:
            r4 = 0
        L_0x0152:
            if (r4 != r3) goto L_0x0156
            r4 = 1
            goto L_0x0157
        L_0x0156:
            r4 = 0
        L_0x0157:
            java.lang.String r14 = ""
            if (r4 == 0) goto L_0x016c
            android.app.Activity r4 = r18.getContext()
            r15 = 2131831044(0x7f112904, float:1.9295102E38)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r5] = r2
            java.lang.String r2 = r4.getString(r15, r8)
            r8 = r2
            goto L_0x016d
        L_0x016c:
            r8 = r14
        L_0x016d:
            java.lang.String r2 = "if (appName?.isNotEmpty(…pp_tips, appName) else \"\""
            gy3.C87412m.m108593f(r8, r2)
            te3.kb1 r2 = r9.f180744i
            if (r2 == 0) goto L_0x0179
            java.lang.String r2 = r2.f183907g
            goto L_0x017a
        L_0x0179:
            r2 = 0
        L_0x017a:
            if (r2 == 0) goto L_0x0185
            int r4 = r2.length()
            if (r4 != 0) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r4 = 0
            goto L_0x0186
        L_0x0185:
            r4 = 1
        L_0x0186:
            java.lang.String r15 = "file://"
            if (r4 == 0) goto L_0x018b
            goto L_0x01c1
        L_0x018b:
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.l r0 = (p763ym.C79138l) r0
            com.tencent.mm.pluginsdk.model.app.j r0 = r0.getAppInfo(r2)
            java.lang.Class<ld2.f> r4 = ld2.C34229f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ld2.f r4 = (ld2.C34229f) r4
            java.lang.String r2 = r4.mo59505t2(r2, r3)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r4 == 0) goto L_0x01b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r2)
            java.lang.String r14 = r0.toString()
            goto L_0x01c1
        L_0x01b7:
            if (r0 == 0) goto L_0x01bc
            java.lang.String r0 = r0.field_appIconUrl
            goto L_0x01bd
        L_0x01bc:
            r0 = 0
        L_0x01bd:
            if (r0 != 0) goto L_0x01c0
            goto L_0x01c1
        L_0x01c0:
            r14 = r0
        L_0x01c1:
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            te3.kb1 r4 = r9.f180744i
            if (r4 == 0) goto L_0x01d0
            java.lang.String r4 = r4.f183907g
            goto L_0x01d1
        L_0x01d0:
            r4 = 0
        L_0x01d1:
            r2[r5] = r4
            boolean r4 = r13.f27482d
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r3] = r4
            r4 = 2
            r2[r4] = r14
            java.lang.String r3 = "MicroMsg.Mv.MusicMvShareUIC"
            java.lang.String r4 = "musicAppId:%s, isShowAppName:%b, iconPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r2 != 0) goto L_0x027a
            r2 = 2
            r4 = 0
            boolean r15 = z04.C112551y.m153820t(r14, r15, r5, r2, r4)
            if (r15 == 0) goto L_0x01fc
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r14)
            r0.f27484d = r2
            goto L_0x027a
        L_0x01fc:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            ma2.t r15 = ma2.C61454t.f174766a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "thumb_"
            r4.append(r5)
            java.nio.charset.Charset r5 = z04.C119027c.f356488a
            byte[] r5 = r14.getBytes(r5)
            r17 = r9
            java.lang.String r9 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r5, r9)
            java.lang.String r5 = p823sg.C90193h.m112878f(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r15.mo86430b(r4)
            r2.<init>((java.lang.String) r4)
            java.lang.String r2 = r2.mo119971i()
            java.lang.String r4 = "VFSFile(MusicFileNameUti…Array())}\")).absolutePath"
            gy3.C87412m.m108593f(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "initCover save Path:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r2)
            r0.f27484d = r4
            if (r4 == 0) goto L_0x0256
            boolean r4 = r4.isRecycled()
            if (r4 == 0) goto L_0x027c
        L_0x0256:
            hc0.c$b r4 = new hc0.c$b
            r4.<init>()
            r5 = 1
            r4.f59346b = r5
            r4.f59345a = r5
            r4.f59350f = r2
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r5 = 0
            r9[r5] = r14
            r4.f59368x = r9
            gc0.a r5 = gc0.C20828a.m22825b()
            hc0.c r4 = r4.mo32666a()
            sb2.t0$b r9 = new sb2.t0$b
            r9.<init>(r0, r2)
            r5.mo32515d(r14, r4, r9)
            goto L_0x027c
        L_0x027a:
            r17 = r9
        L_0x027c:
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            T r2 = r0.f27484d
            if (r2 == 0) goto L_0x0285
            r2 = 1
            goto L_0x0286
        L_0x0285:
            r2 = 0
        L_0x0286:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 0
            r4[r5] = r2
            T r2 = r0.f27484d
            if (r2 == 0) goto L_0x029b
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L_0x029b
            r2 = 1
            goto L_0x029c
        L_0x029b:
            r2 = 0
        L_0x029c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 1
            r4[r5] = r2
            java.lang.String r2 = "bitmap:%b, isRecycled:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r4)
            T r2 = r0.f27484d
            if (r2 == 0) goto L_0x02d2
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            boolean r2 = r2.isRecycled()
            if (r2 != 0) goto L_0x02d2
            T r0 = r0.f27484d
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.app.Activity r2 = r18.getContext()
            r4 = 4
            int r2 = kg3.C76577a.m92151b(r2, r4)
            float r2 = (float) r2
            r4 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r0, r4, r2)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r4 = r18.getResources()
            r2.<init>(r4, r0)
            r4 = r2
            goto L_0x02d3
        L_0x02d2:
            r4 = 0
        L_0x02d3:
            boolean r0 = r13.f27482d
            if (r0 == 0) goto L_0x02db
            if (r4 == 0) goto L_0x02db
            r5 = 1
            goto L_0x02dc
        L_0x02db:
            r5 = 0
        L_0x02dc:
            r13.f27482d = r5
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r5 = 0
            r0[r5] = r2
            if (r4 == 0) goto L_0x02eb
            r5 = 1
        L_0x02eb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r5 = 1
            r0[r5] = r2
            java.lang.String r2 = "isShowAppName:%b, drawable:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r2, r0)
            java.lang.Class<wc3.e0> r0 = wc3.C15133e0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wc3.e0 r0 = (wc3.C15133e0) r0
            wc3.e0 r0 = r0.Ct0()
            T r2 = r1.f27484d
            qo3.n r2 = (qo3.C77407n) r2
            sb2.t0$c r3 = new sb2.t0$c
            r3.<init>(r0, r6, r1)
            r2.f225778n = r3
            sb2.t0$d r3 = new sb2.t0$d
            r3.<init>(r0, r1)
            r2.f225791t = r3
            sb2.t0$e r3 = new sb2.t0$e
            r3.<init>(r0, r6, r7)
            r2.f225789s = r3
            android.view.Window r0 = r2.mo107558c()
            android.view.View r0 = r0.getDecorView()
            sb2.t0$f r2 = new sb2.t0$f
            r2.<init>(r6)
            r0.addOnAttachStateChangeListener(r2)
            T r0 = r1.f27484d
            r9 = r0
            qo3.n r9 = (qo3.C77407n) r9
            sb2.t0$g r14 = new sb2.t0$g
            r0 = r14
            r1 = r18
            r2 = r11
            r3 = r13
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r9.f225771i = r14
            sb2.t0$h r8 = new sb2.t0$h
            r0 = r8
            r2 = r12
            r3 = r10
            r4 = r20
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r9.f225773j = r8
            sb2.t0$i r0 = new sb2.t0$i
            r3 = r21
            r0.<init>(r6, r7, r3)
            r9.f225782p = r0
            sb2.t0$j r8 = new sb2.t0$j
            r0 = r8
            r2 = r20
            r4 = r17
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r9.f225787r = r8
            sb2.t0$a r0 = sb2.C63849t0.C63850a.f180999a
            r9.f225761d = r0
            r9.mo107573q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63849t0.mo88638c3(jq3.o, hb2.f, int):void");
    }

    /* renamed from: d3 */
    public final String mo88639d3(C59822f fVar) {
        Class cls = C63756e.class;
        boolean z = true;
        if (!C59822f.f170752A.mo84780e(fVar)) {
            C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
            String str = ((C63756e) a).f180744i.f183912o;
            if (str != null) {
                if (!(str.length() > 0)) {
                    str = null;
                }
                if (str != null) {
                    C61454t tVar = C61454t.f174766a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("thumb_");
                    byte[] bytes = str.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    sb.append(C90193h.m112878f(bytes));
                    String i = new C86009m1(tVar.mo86430b(sb.toString())).mo119971i();
                    C87412m.m108593f(i, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
                    if (C86013q1.m106450k(i)) {
                        return i;
                    }
                }
            }
        }
        String str2 = fVar.f170754b;
        if (str2 != null) {
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            if (str2 != null && C86013q1.m106450k(str2)) {
                return str2;
            }
        }
        String str3 = fVar.f170757e;
        if (str3 != null) {
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null) {
                C61454t tVar2 = C61454t.f174766a;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("thumb_");
                byte[] bytes2 = str3.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
                sb4.append(C90193h.m112878f(bytes2));
                String i2 = new C86009m1(tVar2.mo86430b(sb4.toString())).mo119971i();
                C87412m.m108593f(i2, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
                if (C86013q1.m106450k(i2)) {
                    return i2;
                }
            }
        }
        C39622i0 a2 = C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls);
        C87412m.m108593f(a2, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a2;
        String str4 = eVar.f180749q.f141283d;
        if (str4 != null) {
            if (!(str4.length() > 0)) {
                str4 = null;
            }
            if (str4 != null && C86013q1.m106450k(str4)) {
                return str4;
            }
        }
        String str5 = eVar.f180744i.f183912o;
        if (str5 != null) {
            if (str5.length() <= 0) {
                z = false;
            }
            if (!z) {
                str5 = null;
            }
            if (str5 != null) {
                C61454t tVar3 = C61454t.f174766a;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("thumb_");
                byte[] bytes3 = str5.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes3, "this as java.lang.String).getBytes(charset)");
                sb5.append(C90193h.m112878f(bytes3));
                String i3 = new C86009m1(tVar3.mo86430b(sb5.toString())).mo119971i();
                C87412m.m108593f(i3, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
                if (C86013q1.m106450k(i3)) {
                    return i3;
                }
            }
        }
        return null;
    }

    /* renamed from: e3 */
    public final SpannableString mo88640e3(Context context) {
        C87412m.m108594g(context, "context");
        SpannableString spannableString = new SpannableString(context.getString(C0966R.string.gs5));
        int E = C112550d0.m153769E(spannableString, "{music}", 0, false, 6, (Object) null);
        int intrinsicWidth = context.getResources().getDrawable(C0966R.raw.state_icon_main).getIntrinsicWidth();
        int h = C76577a.m92157h(context, C0966R.dimen.f3738cr);
        Drawable e = C87515a.m108835e(context.getResources(), C0966R.raw.state_icon_main, (((float) h) * 1.0f) / ((float) intrinsicWidth));
        e.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        e.setBounds(0, 0, h, h);
        spannableString.setSpan(new C14142b(e), E, E + 7, 17);
        return spannableString;
    }

    /* renamed from: f3 */
    public final void mo88641f3(C59822f fVar, boolean z, int i) {
        FinderObject finderObject;
        String str;
        String str2;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        C59822f fVar2 = fVar;
        Class cls = C63756e.class;
        C39622i0 a = C39818r.f106831a.mo62443b(getContext()).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(context).…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a;
        C64488kb1 kb12 = eVar.f180744i;
        String str3 = eVar.f180748p;
        if (kb12 != null && fVar2 != null && str3 != null) {
            String str4 = kb12.f183912o;
            if (str4 == null || str4.length() == 0) {
                try {
                    C61454t tVar = C61454t.f174766a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("thumb_");
                    byte[] bytes = "DEFAULT_TEXT_STATUS_MUSIC_THUMB_PATH".getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    sb.append(C90193h.m112878f(bytes));
                    String i2 = new C86009m1(tVar.mo86430b(sb.toString())).mo119971i();
                    C87412m.m108593f(i2, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
                    if (!C86013q1.m106450k(i2)) {
                        BitmapUtil.saveBitmapToImage(BitmapFactory.decodeResource(getContext().getResources(), C0966R.C0969drawable.ci_), 100, Bitmap.CompressFormat.PNG, i2, true);
                        str4 = i2;
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.Mv.MusicMvShareUIC", "save default text status thumb fail! " + e.getLocalizedMessage());
                }
            }
            C66708h hVar = (C66708h) C86312j.m106911c(C66708h.class);
            Activity context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            C77459z.C63350a aVar = new C77459z.C63350a();
            aVar.mo88254a("1016");
            aVar.f179715a.f229400e = str4;
            aVar.mo88258e("music_player@inner");
            aVar.mo88259f(kb12.f183904d);
            aVar.mo88257d("http://wxapp.tc.qq.com/258/20304/stodownload?m=2009416463c227ad5a09b4fcf23bf985&filekey=30340201010420301e020201020402534804102009416463c227ad5a09b4fcf23bf9850202042e040d00000004627466730000000131&hy=SH&storeid=32303231303331383139353931363030306366646534303030303030303037636638353130393030303030313032&bizid=1023");
            aVar.mo88256c(kb12.f183909i);
            aVar.mo88260g(str3);
            C65488a0 a0Var = new C65488a0();
            a0Var.f188439d = "1";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("\n<MusicVideoStatusOpenParams>\n");
            sb4.append(C61643b0.m72360b(kb12));
            sb4.append(10);
            String str5 = kb12.f183912o;
            C8479f0 f0Var = new C8479f0();
            int i3 = fVar2.f170768p;
            if (i3 == 1) {
                Long l = fVar2.f170755c;
                String str6 = fVar2.f170756d;
                if (!(l == null || str6 == null)) {
                    long longValue = l.longValue();
                    if (longValue != 0) {
                        T t232 = new C64719t23();
                        t232.f185459d = C61926c.m72691p(longValue);
                        t232.f185460e = str6;
                        String str7 = fVar2.f170757e;
                        if (str7 != null) {
                            str5 = str7;
                        }
                        t232.f185461f = str5;
                        t232.f185462g = fVar2.f170758f;
                        f0Var.f27484d = t232;
                    }
                }
            } else if (i3 == 4 && (finderObject = fVar2.f170772t) != null) {
                T t233 = new C64719t23();
                t233.f185459d = C61926c.m72691p(finderObject.f164794id);
                t233.f185460e = finderObject.objectNonceId;
                FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
                if (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) {
                    str = null;
                } else {
                    str = finderMedia.thumbUrl + finderMedia.thumb_url_token;
                }
                t233.f185461f = str;
                FinderContact finderContact = finderObject.contact;
                if (finderContact == null || (str2 = finderContact.nickname) == null) {
                    str2 = "";
                }
                t233.f185462g = str2;
                f0Var.f27484d = t233;
            }
            C64719t23 t234 = (C64719t23) f0Var.f27484d;
            if (t234 == null) {
                t234 = new C64719t23();
            }
            String a2 = C98521u5.m127973a(t234);
            C87412m.m108593f(a2, "makeContent(toMusicShareObject(albumUrl))");
            sb4.append(a2);
            sb4.append("\n</MusicVideoStatusOpenParams>");
            a0Var.f188441f = C66725r.m78728b(sb4.toString());
            C13598b0 b0Var = C13598b0.f38549a;
            aVar.mo88255b(C26236u.m33719b(a0Var));
            C77459z zVar = aVar.f179715a;
            zVar.f229402g = false;
            hVar.mo90743iL(context, 1, zVar);
            C39622i0 a3 = C39818r.f106831a.mo62443b(getContext()).mo75002a(cls);
            C87412m.m108593f(a3, "UICProvider.of(context).…sicMvDataUIC::class.java)");
            C63756e eVar2 = (C63756e) a3;
            C59833q qVar = C59833q.f170832a;
            Activity context2 = getContext();
            int i4 = 3;
            if (i == 3) {
                i4 = 5;
            } else if (z) {
                i4 = 4;
            }
            C59833q.m69726g(qVar, context2, kb12, fVar, 3, 0, i4, 0, eVar2.mo88571e3(), eVar2.mo88569c3(), (String) null, eVar2.f180736H, 576, (Object) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f180996f = System.currentTimeMillis();
        this.f180997g = ((C62251b1) C86312j.m106911c(C62251b1.class)).mo87307uj();
    }
}
