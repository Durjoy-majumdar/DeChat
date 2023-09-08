package oo1;

import ak1.C0077k0;
import ak1.C54067f0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import com.tencent.p014mm.plugin.finder.view.C4077j3;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import com.tencent.p014mm.plugin.finder.view.notice.HighLightGreenBgView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeCouponMiniInfoView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import er1.C7776a;
import er1.C7788c1;
import er1.C7802g1;
import f40.C86709a0;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import ht1.C8817y2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import je1.C33558n2;
import je1.C46553z0;
import nj3.C76912y0;
import nr3.C89059e;
import ob0.C11385n;
import ob0.C117747y;
import p204mr.C61568m;
import p565ir.C60606n;
import p687sr.C64153e;
import p823sg.C101614i;
import pe3.C89349b;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49098d51;
import te3.C49359f1;
import te3.C49712hj1;
import te3.C51559uk1;
import tf0.C13883o1;
import tf0.C13887q1;
import ye1.C15972e0;
import zc1.C66785b;

/* renamed from: oo1.e */
public final class C11625e {

    /* renamed from: a */
    public final AppCompatActivity f34087a;

    /* renamed from: b */
    public final C49712hj1 f34088b;

    /* renamed from: c */
    public C32224a<C13598b0> f34089c;

    /* renamed from: d */
    public final C13601g f34090d;

    /* renamed from: e */
    public final C13601g f34091e = C36568h.m40985a(new C11631f(this));

    /* renamed from: f */
    public final C13601g f34092f = C36568h.m40985a(new C11634i(this));

    /* renamed from: g */
    public final C13601g f34093g = C36568h.m40985a(new C11628c(this));

    /* renamed from: h */
    public final C13601g f34094h = C36568h.m40985a(new C11630e(this));

    /* renamed from: i */
    public final C13601g f34095i = C36568h.m40985a(new C11626a(this));

    /* renamed from: j */
    public final C13601g f34096j = C36568h.m40985a(new C11629d(this));

    /* renamed from: k */
    public final C13601g f34097k = C36568h.m40985a(new C11627b(this));

    /* renamed from: l */
    public final C13601g f34098l = C36568h.m40985a(new C11632g(this));

    /* renamed from: m */
    public final C13601g f34099m = C36568h.m40985a(new C11637l(this));

    /* renamed from: n */
    public final C13601g f34100n = C36568h.m40985a(new C11633h(this));

    /* renamed from: o */
    public final C13601g f34101o = C36568h.m40985a(new C11645t(this));

    /* renamed from: p */
    public final C13601g f34102p = C36568h.m40985a(new C11635j(this));

    /* renamed from: q */
    public final C13601g f34103q = C36568h.m40985a(new C11636k(this));

    /* renamed from: r */
    public C51559uk1 f34104r;

    /* renamed from: s */
    public int f34105s = -1;

    /* renamed from: t */
    public int f34106t = -1;

    /* renamed from: u */
    public boolean f34107u;

    /* renamed from: v */
    public String f34108v = "";

    /* renamed from: w */
    public final C13601g f34109w = C36568h.m40985a(new C11639n(this));

    /* renamed from: x */
    public final C13601g f34110x = C36568h.m40985a(new C11638m(this));

    /* renamed from: y */
    public String f34111y = "";

    /* renamed from: z */
    public final C11646u f34112z = new C11646u(this);

    /* renamed from: oo1.e$a */
    public static final class C11626a extends C87413o implements C32224a<NoticeStatusView> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11626a(C11625e eVar) {
            super(0);
            this.f34113d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34113d).f42916f;
        }
    }

    /* renamed from: oo1.e$b */
    public static final class C11627b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11627b(C11625e eVar) {
            super(0);
            this.f34114d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34114d).f42908b;
        }
    }

    /* renamed from: oo1.e$c */
    public static final class C11628c extends C87413o implements C32224a<FinderCollapsibleTextView> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11628c(C11625e eVar) {
            super(0);
            this.f34115d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34115d).f42910c;
        }
    }

    /* renamed from: oo1.e$d */
    public static final class C11629d extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34116d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11629d(C11625e eVar) {
            super(0);
            this.f34116d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34116d).f42920h;
        }
    }

    /* renamed from: oo1.e$e */
    public static final class C11630e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34117d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11630e(C11625e eVar) {
            super(0);
            this.f34117d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34117d).f42918g;
        }
    }

    /* renamed from: oo1.e$f */
    public static final class C11631f extends C87413o implements C32224a<ConstraintLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11631f(C11625e eVar) {
            super(0);
            this.f34118d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34118d).f42912d;
        }
    }

    /* renamed from: oo1.e$g */
    public static final class C11632g extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34119d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11632g(C11625e eVar) {
            super(0);
            this.f34119d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34119d).f42902W;
        }
    }

    /* renamed from: oo1.e$h */
    public static final class C11633h extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34120d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11633h(C11625e eVar) {
            super(0);
            this.f34120d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34120d).f42903X;
        }
    }

    /* renamed from: oo1.e$i */
    public static final class C11634i extends C87413o implements C32224a<HighLightGreenBgView> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34121d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11634i(C11625e eVar) {
            super(0);
            this.f34121d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34121d).f42939q0;
        }
    }

    /* renamed from: oo1.e$j */
    public static final class C11635j extends C87413o implements C32224a<RelativeLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11635j(C11625e eVar) {
            super(0);
            this.f34122d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34122d).f42914e;
        }
    }

    /* renamed from: oo1.e$k */
    public static final class C11636k extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34123d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11636k(C11625e eVar) {
            super(0);
            this.f34123d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34123d).f42905Z;
        }
    }

    /* renamed from: oo1.e$l */
    public static final class C11637l extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34124d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11637l(C11625e eVar) {
            super(0);
            this.f34124d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34124d).f42907a0;
        }
    }

    /* renamed from: oo1.e$m */
    public static final class C11638m extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11638m(C11625e eVar) {
            super(0);
            this.f34125d = eVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f34125d.f34087a.getIntent().getIntExtra("key_from_comment_scene", 0));
        }
    }

    /* renamed from: oo1.e$n */
    public static final class C11639n extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11639n(C11625e eVar) {
            super(0);
            this.f34126d = eVar;
        }

        public Object invoke() {
            return Long.valueOf(this.f34126d.f34087a.getIntent().getLongExtra("finder_read_feed_id", 0));
        }
    }

    /* renamed from: oo1.e$o */
    public static final class C11640o implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C49098d51 f34127d;

        /* renamed from: e */
        public final /* synthetic */ C11625e f34128e;

        public C11640o(C49098d51 d512, C11625e eVar) {
            this.f34127d = d512;
            this.f34128e = eVar;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            ClipData newPlainText = ClipData.newPlainText("Label", this.f34127d.f132122h);
            Object systemService = MMApplicationContext.getContext().getSystemService("clipboard");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
            C76912y0.m92773l(this.f34128e.f34087a, "已复制noticeId");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: oo1.e$p */
    public static final class C11641p implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58969q f34129d;

        /* renamed from: e */
        public final /* synthetic */ C49098d51 f34130e;

        /* renamed from: f */
        public final /* synthetic */ C11625e f34131f;

        public C11641p(C58969q qVar, C49098d51 d512, C11625e eVar) {
            this.f34129d = qVar;
            this.f34130e = d512;
            this.f34131f = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            C58969q qVar = this.f34129d;
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", qVar != null ? qVar.getUsername() : "");
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", this.f34130e.toByteArray());
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
            C7335d c = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
            C13883o1.C13884a.m13250b((C13883o1) c, this.f34131f.f34087a, intent, 0, 4, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: oo1.e$q */
    public static final class C11642q implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34132d;

        /* renamed from: e */
        public final /* synthetic */ C58969q f34133e;

        /* renamed from: f */
        public final /* synthetic */ C49098d51 f34134f;

        public C11642q(C11625e eVar, C58969q qVar, C49098d51 d512) {
            this.f34132d = eVar;
            this.f34133e = qVar;
            this.f34134f = d512;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f34132d.f34107u) {
                Intent intent = new Intent();
                C58969q qVar = this.f34133e;
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", qVar != null ? qVar.getUsername() : "");
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", this.f34134f.toByteArray());
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", true);
                C7335d c = C86312j.m106911c(C58684b.class);
                C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
                C13883o1.C13884a.m13250b((C13883o1) c, this.f34132d.f34087a, intent, 0, 4, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: oo1.e$r */
    public static final class C11643r extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C49098d51 f34135d;

        /* renamed from: e */
        public final /* synthetic */ C11625e f34136e;

        /* renamed from: f */
        public final /* synthetic */ String f34137f;

        /* renamed from: g */
        public final /* synthetic */ boolean f34138g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11643r(C49098d51 d512, C11625e eVar, String str, boolean z) {
            super(2);
            this.f34135d = d512;
            this.f34136e = eVar;
            this.f34137f = str;
            this.f34138g = z;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            int intValue = ((Number) obj).intValue();
            ((Number) obj2).intValue();
            C49098d51 d512 = this.f34135d;
            C11625e eVar = this.f34136e;
            String str2 = this.f34137f;
            boolean z = this.f34138g;
            if (intValue != -1) {
                d512.f132119e = 0;
                if (intValue == 1) {
                    ((C64153e) C86312j.m106911c(C64153e.class)).jc0(eVar.f34087a, 2, false, new C11654f(eVar, d512));
                    C104289g gVar = new C104289g();
                    gVar.mo145967r("source_type", 0);
                    C104289g gVar2 = new C104289g();
                    C51559uk1 a = C7802g1.m7949a(d512);
                    gVar2.put("coupon_id", a != null ? a.f142894e : null);
                    gVar2.mo145953n("ui_position", 1);
                    C7335d c = C86312j.m106911c(C61568m.class);
                    C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
                    C61568m mVar = (C61568m) c;
                    C0077k0 k0Var = C0077k0.Book;
                    String str3 = d512.f132121g;
                    boolean z2 = z;
                    C61568m.C61569a.m72263a(mVar, k0Var, str2, 0, 0, "temp_5", (String) null, (Long) null, (String) null, (String) null, str3 == null ? "" : str3, gVar.toString(), d512.f132122h, gVar2.toString(), ((Number) ((C36570n) eVar.f34109w).getValue()).longValue(), ((Number) ((C36570n) eVar.f34110x).getValue()).intValue(), 480, (Object) null);
                    C11646u uVar = eVar.f34112z;
                    str = str2;
                    C11656g gVar3 = new C11656g(str);
                    uVar.getClass();
                    uVar.f34141d = gVar3;
                    C11646u uVar2 = eVar.f34112z;
                    C11658h hVar = new C11658h(z2);
                    uVar2.getClass();
                    uVar2.f34142e = hVar;
                    C11646u uVar3 = eVar.f34112z;
                    C11660i iVar = new C11660i(d512);
                    uVar3.getClass();
                    uVar3.f34143f = iVar;
                    C86709a0.m107524d().mo123455a(6276, eVar.f34112z);
                    if (eVar.f34107u) {
                        Class cls = C13887q1.class;
                        eVar.f34105s = d512.f132119e;
                        HashMap hashMap = new HashMap();
                        hashMap.put("finder_username", str);
                        String str4 = d512.f132126o;
                        if (str4 == null) {
                            str4 = "";
                        }
                        hashMap.put("activityId", str4);
                        C7335d c2 = C86312j.m106911c(C8777j5.class);
                        C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
                        C54067f0.C0064m mVar2 = C54067f0.C0064m.LIVE_CONCERT_PROFILE_RECIVE;
                        C49712hj1 hj12 = eVar.f34088b;
                        C8777j5.C8778a.m8607h((C8777j5) c2, mVar2, hashMap, hj12.f134671e, String.valueOf(hj12.f134675i), (String) null, 16, (Object) null);
                        C7335d c3 = C86312j.m106911c(cls);
                        C87412m.m108593f(c3, "getService(IFinderCommonLiveService::class.java)");
                        String str5 = d512.f132122h;
                        C87412m.m108591d(str5);
                        C39818r rVar = C39818r.f106831a;
                        C86709a0.m107524d().mo123460f(C13887q1.C13888a.m13305a((C13887q1) c3, str, str5, 1, ((C13442s8) rVar.mo62444c(eVar.f34087a).mo75002a(C13442s8.class)).mo12861q3(), eVar.f34087a.getIntent().getStringExtra("key_promotion_token"), 0, (Long) null, 64, (Object) null));
                        C13887q1 q1Var = (C13887q1) C86312j.m106911c(cls);
                        String str6 = d512.f132122h;
                        if (str6 == null) {
                            str6 = "";
                        }
                        if (q1Var.mo13343h4(str, str6) == null) {
                            C13887q1 q1Var2 = (C13887q1) C86312j.m106911c(cls);
                            String str7 = d512.f132122h;
                            if (str7 == null) {
                                str7 = "";
                            }
                            q1Var2.mo13325QY(str, str7, d512);
                        } else {
                            C13887q1 q1Var3 = (C13887q1) C86312j.m106911c(cls);
                            String str8 = d512.f132122h;
                            if (str8 == null) {
                                str8 = "";
                            }
                            C49098d51 h4 = q1Var3.mo13343h4(str, str8);
                            if (h4 != null) {
                                h4.f132119e = d512.f132119e;
                            }
                        }
                        ((C8817y2) rVar.mo62444c(eVar.f34087a).mo62447c(C8817y2.class)).mo9643v2().mo9648f0(str);
                        eVar.mo11531c().mo5009f(str, new C11664k(d512));
                    } else {
                        C11625e.m11411h(eVar, str, d512, d512, 1);
                    }
                } else {
                    str = str2;
                }
                if (eVar.f34107u) {
                    String str9 = d512.f132126o;
                    String str10 = str9 == null ? "" : str9;
                    String str11 = d512.f132122h;
                    C89059e i = new C46553z0(str10, (String) null, (byte[]) null, 0, 0, str11 == null ? "" : str11, 1, false, 158, (C8480h) null).mo9225i();
                    AppCompatActivity appCompatActivity = eVar.f34087a;
                    C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    i.mo11397F((MMActivity) appCompatActivity);
                    i.mo123420E(new C11670n(eVar, str));
                }
            } else {
                String str12 = str2;
                if (!eVar.f34107u) {
                    C11662j jVar = new C11662j(d512, eVar, str12);
                    C77407n nVar = new C77407n((Context) eVar.f34087a, 1, true);
                    nVar.f225771i = new C11678r(eVar);
                    nVar.f225782p = new C11680s(d512, str12, eVar, jVar);
                    nVar.mo107573q();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oo1.e$s */
    public static final class C11644s implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34139d;

        public C11644s(C11625e eVar) {
            this.f34139d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f34139d.f34089c;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleFinderLiveNoticeInfo$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: oo1.e$t */
    public static final class C11645t extends C87413o implements C32224a<NoticeCouponMiniInfoView> {

        /* renamed from: d */
        public final /* synthetic */ C11625e f34140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11645t(C11625e eVar) {
            super(0);
            this.f34140d = eVar;
        }

        public Object invoke() {
            return C11625e.m11409a(this.f34140d).f42906a;
        }
    }

    /* renamed from: oo1.e$u */
    public static final class C11646u implements C11385n {

        /* renamed from: d */
        public C32224a<String> f34141d = C11650d.f34152d;

        /* renamed from: e */
        public C32224a<Boolean> f34142e = C11647a.f34145d;

        /* renamed from: f */
        public C32224a<String> f34143f = C11648b.f34146d;

        /* renamed from: g */
        public final /* synthetic */ C11625e f34144g;

        /* renamed from: oo1.e$u$a */
        public static final class C11647a extends C87413o implements C32224a<Boolean> {

            /* renamed from: d */
            public static final C11647a f34145d = new C11647a();

            public C11647a() {
                super(0);
            }

            public Object invoke() {
                return Boolean.FALSE;
            }
        }

        /* renamed from: oo1.e$u$b */
        public static final class C11648b extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C11648b f34146d = new C11648b();

            public C11648b() {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return "";
            }
        }

        /* renamed from: oo1.e$u$c */
        public static final class C11649c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C51559uk1 f34147d;

            /* renamed from: e */
            public final /* synthetic */ C49098d51 f34148e;

            /* renamed from: f */
            public final /* synthetic */ C11625e f34149f;

            /* renamed from: g */
            public final /* synthetic */ C11646u f34150g;

            /* renamed from: h */
            public final /* synthetic */ C8479f0<NoticeGetCouponView> f34151h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11649c(C51559uk1 uk12, C49098d51 d512, C11625e eVar, C11646u uVar, C8479f0<NoticeGetCouponView> f0Var) {
                super(0);
                this.f34147d = uk12;
                this.f34148e = d512;
                this.f34149f = eVar;
                this.f34150g = uVar;
                this.f34151h = f0Var;
            }

            public Object invoke() {
                String str;
                C7788c1 c1Var = C7788c1.f26289a;
                String str2 = this.f34147d.f142894e;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                String str4 = this.f34148e.f132122h;
                if (str4 == null) {
                    str4 = str3;
                }
                c1Var.mo8898a(str2, str4, false);
                C11625e eVar = this.f34149f;
                C51559uk1 uk12 = eVar.f34104r;
                if (!(uk12 == null || (str = uk12.f142894e) == null)) {
                    C11646u uVar = this.f34150g;
                    C49098d51 d512 = this.f34148e;
                    C8479f0<NoticeGetCouponView> f0Var = this.f34151h;
                    String invoke = uVar.f34141d.invoke();
                    String str5 = d512.f132122h;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    C11625e.m11410b(eVar, invoke, str, str3, new C11672o(str, eVar, uVar, d512, f0Var));
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: oo1.e$u$d */
        public static final class C11650d extends C87413o implements C32224a<String> {

            /* renamed from: d */
            public static final C11650d f34152d = new C11650d();

            public C11650d() {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return "";
            }
        }

        public C11646u(C11625e eVar) {
            this.f34144g = eVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C49098d51 d512;
            C117747y yVar2 = yVar;
            if ((yVar2 instanceof C33558n2) && C87412m.m108589b(((C33558n2) yVar2).f90851h, this.f34143f.invoke())) {
                C86709a0.m107524d().mo123470p(6276, this);
                if (i == 0 && i2 == 0) {
                    C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
                    FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(this.f34141d.invoke());
                    if (bVar != null && (d512 = bVar.f16265d) != null) {
                        C11625e eVar = this.f34144g;
                        C51559uk1 uk12 = eVar.f34104r;
                        if (uk12 != null) {
                            C49359f1 f1Var = uk12.f142912z;
                            if ((f1Var != null && !C7776a.m7931a(f1Var) ? uk12 : null) != null) {
                                C7788c1 c1Var = C7788c1.f26289a;
                                String str2 = uk12.f142894e;
                                String str3 = "";
                                if (str2 == null) {
                                    str2 = str3;
                                }
                                String str4 = d512.f132122h;
                                if (str4 != null) {
                                    str3 = str4;
                                }
                                c1Var.mo8899b(str2, str3, false);
                            }
                            C8479f0 f0Var = new C8479f0();
                            f0Var.f27484d = C4077j3.f18208a.mo4972a(eVar.f34087a, d512.f132121g, ((long) d512.f132118d) * 1000, uk12, new C11649c(uk12, d512, eVar, this, f0Var));
                        }
                        this.f34144g.mo11536i(this.f34141d.invoke(), d512, !this.f34142e.invoke().booleanValue());
                    }
                }
            }
        }
    }

    /* renamed from: oo1.e$v */
    public static final class C11651v extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C49098d51 f34153d;

        /* renamed from: e */
        public final /* synthetic */ C11625e f34154e;

        /* renamed from: f */
        public final /* synthetic */ String f34155f;

        /* renamed from: g */
        public final /* synthetic */ boolean f34156g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11651v(C49098d51 d512, C11625e eVar, String str, boolean z) {
            super(0);
            this.f34153d = d512;
            this.f34154e = eVar;
            this.f34155f = str;
            this.f34156g = z;
        }

        public Object invoke() {
            String str;
            C49359f1 f1Var;
            if (C7802g1.m7950b(this.f34153d)) {
                C51559uk1 uk12 = this.f34154e.f34104r;
                boolean z = true;
                if (uk12 == null || (f1Var = uk12.f142912z) == null || !C7776a.m7931a(f1Var)) {
                    z = false;
                }
                if (z) {
                    C4077j3 j3Var = C4077j3.f18208a;
                    AppCompatActivity appCompatActivity = this.f34154e.f34087a;
                    C49098d51 d512 = this.f34153d;
                    j3Var.mo4972a(appCompatActivity, d512.f132121g, ((long) d512.f132118d) * 1000, C7802g1.m7949a(d512), (C32224a<C13598b0>) null);
                } else {
                    C11625e eVar = this.f34154e;
                    C51559uk1 uk13 = eVar.f34104r;
                    if (!(uk13 == null || (str = uk13.f142894e) == null)) {
                        String str2 = this.f34155f;
                        C49098d51 d513 = this.f34153d;
                        boolean z2 = this.f34156g;
                        String str3 = d513.f132122h;
                        if (str3 == null) {
                            str3 = "";
                        }
                        C11625e.m11410b(eVar, str2, str, str3, new C11676q(str, eVar, d513, str2, z2));
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oo1.e$w */
    public static final class C11652w extends C87413o implements C32224a<C15972e0> {

        /* renamed from: d */
        public final /* synthetic */ View f34157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11652w(View view) {
            super(0);
            this.f34157d = view;
        }

        public Object invoke() {
            return C15972e0.m14887a(this.f34157d);
        }
    }

    public C11625e(View view, AppCompatActivity appCompatActivity, C49712hj1 hj12) {
        C87412m.m108594g(view, "header");
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
        this.f34087a = appCompatActivity;
        this.f34088b = hj12;
        this.f34090d = C36568h.m40985a(new C11652w(view));
    }

    /* renamed from: a */
    public static final C15972e0 m11409a(C11625e eVar) {
        return (C15972e0) ((C36570n) eVar.f34090d).getValue();
    }

    /* renamed from: b */
    public static final void m11410b(C11625e eVar, String str, String str2, String str3, C32227p pVar) {
        eVar.getClass();
        C7335d c = C86312j.m106911c(C60606n.class);
        C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
        String O5 = C66785b.f191882e.mo90662O5();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str2);
        C13598b0 b0Var = C13598b0.f38549a;
        C60606n.C60607a.m70860d((C60606n) c, 0, 0, str, O5, (C89349b) null, linkedList, str3, eVar.f34087a, false, pVar, 256, (Object) null);
    }

    /* renamed from: h */
    public static final void m11411h(C11625e eVar, String str, C49098d51 d512, C49098d51 d513, int i) {
        C11625e eVar2 = eVar;
        String str2 = str;
        C49098d51 d514 = d513;
        Class cls = C13887q1.class;
        eVar2.f34105s = d514.f132119e;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        String str3 = d514.f132122h;
        C87412m.m108591d(str3);
        C39818r rVar = C39818r.f106831a;
        C86709a0.m107524d().mo123460f(C13887q1.C13888a.m13305a((C13887q1) c, str, str3, i, ((C13442s8) rVar.mo62444c(eVar2.f34087a).mo75002a(C13442s8.class)).mo12861q3(), eVar2.f34087a.getIntent().getStringExtra("key_promotion_token"), 0, (Long) null, 64, (Object) null));
        C13887q1 q1Var = (C13887q1) C86312j.m106911c(cls);
        String str4 = d514.f132122h;
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        if (q1Var.mo13343h4(str2, str4) == null) {
            C13887q1 q1Var2 = (C13887q1) C86312j.m106911c(cls);
            String str6 = d514.f132122h;
            if (str6 != null) {
                str5 = str6;
            }
            q1Var2.mo13325QY(str2, str5, d514);
        } else {
            C13887q1 q1Var3 = (C13887q1) C86312j.m106911c(cls);
            String str7 = d514.f132122h;
            if (str7 != null) {
                str5 = str7;
            }
            C49098d51 h4 = q1Var3.mo13343h4(str2, str5);
            if (h4 != null) {
                h4.f132119e = d514.f132119e;
            }
        }
        ((C8817y2) rVar.mo62444c(eVar2.f34087a).mo62447c(C8817y2.class)).mo9643v2().mo9648f0(str2);
        eVar.mo11531c().mo5009f(str2, new C11664k(d512));
    }

    /* renamed from: c */
    public final NoticeStatusView mo11531c() {
        return (NoticeStatusView) ((C36570n) this.f34095i).getValue();
    }

    /* renamed from: d */
    public final TextView mo11532d() {
        return (TextView) ((C36570n) this.f34097k).getValue();
    }

    /* renamed from: e */
    public final FinderCollapsibleTextView mo11533e() {
        return (FinderCollapsibleTextView) ((C36570n) this.f34093g).getValue();
    }

    /* renamed from: f */
    public final ConstraintLayout mo11534f() {
        return (ConstraintLayout) ((C36570n) this.f34091e).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x041a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11535g(java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, boolean r31, fe1.C58969q r32, java.lang.String r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r31
            r4 = r32
            r5 = r33
            java.lang.String r6 = "source"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "username"
            gy3.C87412m.m108594g(r2, r6)
            java.lang.String r6 = "highLightNotice"
            gy3.C87412m.m108594g(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[handleFinderLiveNoticeInfo] source:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "Finder.HeaderLiveWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            java.lang.Class<ht1.v4> r6 = ht1.C8808v4.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ht1.v4 r6 = (ht1.C8808v4) r6
            boolean r6 = r6.mo9635e()
            if (r6 == 0) goto L_0x0042
            return
        L_0x0042:
            java.lang.String r6 = "oncreate"
            r7 = 1
            boolean r1 = z04.C112550d0.m153801u(r1, r6, r7)
            if (r1 == 0) goto L_0x007a
            java.lang.Class<tf0.q1> r1 = tf0.C13887q1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            tf0.q1 r1 = (tf0.C13887q1) r1
            te3.d51 r1 = r1.td0(r2)
            if (r1 == 0) goto L_0x007a
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r8 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.f16192h1
            java.lang.Object r9 = r8.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r9 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r9
            if (r9 == 0) goto L_0x0066
            te3.d51 r9 = r9.f16265d
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            if (r9 == 0) goto L_0x006f
            int r9 = r9.f132118d
            int r10 = r1.f132118d
            if (r9 <= r10) goto L_0x007a
        L_0x006f:
            java.lang.Object r8 = r8.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r8 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r8
            if (r8 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r8.f16265d = r1
        L_0x007a:
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r1 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.f16192h1
            java.lang.Object r8 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r8 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r8
            if (r8 == 0) goto L_0x0087
            te3.d51 r8 = r8.f16265d
            goto L_0x0088
        L_0x0087:
            r8 = 0
        L_0x0088:
            r10 = 0
            if (r8 == 0) goto L_0x059b
            java.lang.String r11 = r8.f132122h
            if (r11 == 0) goto L_0x0098
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r11 = 0
            goto L_0x0099
        L_0x0098:
            r11 = 1
        L_0x0099:
            if (r11 != 0) goto L_0x059b
            androidx.constraintlayout.widget.ConstraintLayout r11 = r26.mo11534f()
            r11.setVisibility(r10)
            rx3.g r11 = r0.f34098l
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r11.setVisibility(r10)
            er1.w3 r11 = er1.C58784w3.f168295a
            boolean r12 = r11.mo83910X0()
            if (r12 == 0) goto L_0x00c3
            androidx.constraintlayout.widget.ConstraintLayout r12 = r26.mo11534f()
            oo1.e$o r13 = new oo1.e$o
            r13.<init>(r8, r0)
            r12.setOnLongClickListener(r13)
        L_0x00c3:
            int r12 = r8.f132127p
            if (r12 != r7) goto L_0x00c9
            r12 = 1
            goto L_0x00ca
        L_0x00c9:
            r12 = 0
        L_0x00ca:
            r0.f34107u = r12
            java.lang.String r12 = r8.f132126o
            java.lang.String r13 = ""
            if (r12 != 0) goto L_0x00d3
            r12 = r13
        L_0x00d3:
            r0.f34108v = r12
            int r12 = r8.f132118d
            long r14 = (long) r12
            r16 = 1000(0x3e8, double:4.94E-321)
            long r19 = r14 * r16
            er1.j4 r18 = er1.C58739j4.f168176a
            r21 = 0
            r22 = 0
            r23 = 6
            r24 = 0
            java.lang.String r12 = er1.C58739j4.m68254u(r18, r19, r21, r22, r23, r24)
            rx3.g r14 = r0.f34094h
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r14 = r14.getValue()
            android.widget.TextView r14 = (android.widget.TextView) r14
            androidx.appcompat.app.AppCompatActivity r15 = r0.f34087a
            android.content.res.Resources r15 = r15.getResources()
            r6 = 2131826421(0x7f1116f5, float:1.9285726E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r10] = r12
            java.lang.String r6 = r15.getString(r6, r9)
            r14.setText(r6)
            java.lang.String r6 = r8.f132121g
            if (r6 == 0) goto L_0x0194
            int r9 = r6.length()
            if (r9 <= 0) goto L_0x0114
            r9 = 1
            goto L_0x0115
        L_0x0114:
            r9 = 0
        L_0x0115:
            if (r9 == 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r6 = 0
        L_0x0119:
            if (r6 == 0) goto L_0x0194
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = r26.mo11533e()
            androidx.appcompat.app.AppCompatActivity r13 = r0.f34087a
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131099800(0x7f060098, float:1.7811963E38)
            int r13 = r13.getColor(r14)
            r9.setTextColor(r13)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = r26.mo11533e()
            androidx.appcompat.app.AppCompatActivity r13 = r0.f34087a
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131100738(0x7f060442, float:1.7813866E38)
            int r13 = r13.getColor(r14)
            r9.setExpandTextColor(r13)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = r26.mo11533e()
            com.tencent.neattextview.textview.view.NeatTextView r9 = r9.getContentTextView()
            androidx.appcompat.app.AppCompatActivity r13 = r0.f34087a
            r14 = 2131165261(0x7f07004d, float:1.7944734E38)
            int r13 = kg3.C76577a.m92157h(r13, r14)
            float r13 = (float) r13
            r9.mo154994l(r10, r13)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = r26.mo11533e()
            r13 = 2131826149(0x7f1115e5, float:1.9285174E38)
            r9.setLocalExpanText(r13)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = r26.mo11533e()
            r9.setVisibility(r10)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = r26.mo11533e()
            r9.setLimitLine(r7)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r9 = r26.mo11533e()
            android.widget.TextView r9 = r9.getCollapseTextView()
            r9.setClickable(r10)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r14 = r26.mo11533e()
            java.lang.String r9 = "finderLiveDescView"
            gy3.C87412m.m108593f(r14, r9)
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r15 = r6
            com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView.m19531a(r14, r15, r16, r17, r18, r19)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r13 = r6
            goto L_0x0195
        L_0x0194:
            r9 = 0
        L_0x0195:
            if (r9 != 0) goto L_0x01a0
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r6 = r26.mo11533e()
            r9 = 8
            r6.setVisibility(r9)
        L_0x01a0:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r26.mo11534f()
            if (r6 == 0) goto L_0x01ac
            r9 = 2131302557(0x7f09189d, float:1.8223203E38)
            r6.setTag(r9, r12)
        L_0x01ac:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r26.mo11534f()
            if (r6 == 0) goto L_0x01b8
            r9 = 2131302539(0x7f09188b, float:1.8223167E38)
            r6.setTag(r9, r13)
        L_0x01b8:
            boolean r6 = r0.f34107u
            if (r6 != 0) goto L_0x0243
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r6 = r26.mo11531c()
            java.lang.String r9 = "finderLiveBookBtn"
            gy3.C87412m.m108593f(r6, r9)
            java.lang.Class<l31.e> r9 = l31.C61212e.class
            di3.d r12 = di3.C86312j.m106911c(r9)
            l31.e r12 = (l31.C61212e) r12
            java.lang.String r13 = "live_reserve_profile"
            r12.o30(r6, r13)
            di3.d r12 = di3.C86312j.m106911c(r9)
            l31.e r12 = (l31.C61212e) r12
            r13 = 25653(0x6435, float:3.5948E-41)
            r14 = 8
            r12.mo86175pO(r6, r14, r13)
            di3.d r12 = di3.C86312j.m106911c(r9)
            l31.e r12 = (l31.C61212e) r12
            r13 = 32
            r14 = 25652(0x6434, float:3.5946E-41)
            r12.mo86175pO(r6, r13, r14)
            di3.d r12 = di3.C86312j.m106911c(r9)
            l31.e r12 = (l31.C61212e) r12
            r13 = 4
            rx3.l[] r13 = new rx3.C13604l[r13]
            rx3.l r14 = new rx3.l
            java.lang.String r15 = "finder_username"
            r14.<init>(r15, r2)
            r13[r10] = r14
            rx3.l r14 = new rx3.l
            java.lang.String r15 = "comment_scene"
            java.lang.String r10 = "temp_5"
            r14.<init>(r15, r10)
            r13[r7] = r14
            r10 = 2
            java.lang.String r14 = r8.f132122h
            rx3.l r15 = new rx3.l
            java.lang.String r7 = "live_notice_id"
            r15.<init>(r7, r14)
            r13[r10] = r15
            r7 = 3
            r10 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            rx3.l r10 = new rx3.l
            java.lang.String r15 = "show_type"
            r10.<init>(r15, r14)
            r13[r7] = r10
            java.util.Map r7 = sx3.C90364q0.m113147f(r13)
            java.util.Map r10 = r11.mo83877J()
            java.util.Map r7 = sx3.C90364q0.m113149h(r7, r10)
            r12.mo86149PM(r6, r7)
            di3.d r7 = di3.C86312j.m106911c(r9)
            l31.e r7 = (l31.C61212e) r7
            oo1.p r9 = new oo1.p
            r9.<init>(r8)
            r7.E60(r6, r9)
        L_0x0243:
            te3.uk1 r6 = er1.C7802g1.m7949a(r8)
            r0.f34104r = r6
            r6 = r3 ^ 1
            r0.mo11536i(r2, r8, r6)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r6 = r26.mo11533e()
            r7 = 0
            r6.mo23655d(r7)
            if (r30 == 0) goto L_0x02ee
            if (r3 == 0) goto L_0x02ee
            android.widget.TextView r3 = r26.mo11532d()
            r3.setVisibility(r7)
            te3.nc3 r3 = r8.f132128q
            if (r3 == 0) goto L_0x026c
            boolean r3 = r3.f138532d
            r5 = 1
            if (r3 != r5) goto L_0x026d
            r3 = 1
            goto L_0x026e
        L_0x026c:
            r5 = 1
        L_0x026d:
            r3 = 0
        L_0x026e:
            if (r3 == 0) goto L_0x0296
            android.widget.TextView r3 = r26.mo11532d()
            androidx.appcompat.app.AppCompatActivity r6 = r0.f34087a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131826405(0x7f1116e5, float:1.9285693E38)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            te3.nc3 r5 = r8.f132128q
            if (r5 == 0) goto L_0x0286
            int r5 = r5.f138537i
            goto L_0x0287
        L_0x0286:
            r5 = 0
        L_0x0287:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r10 = 0
            r9[r10] = r5
            java.lang.String r5 = r6.getString(r7, r9)
            r3.setText(r5)
            goto L_0x02b6
        L_0x0296:
            r10 = 0
            android.widget.TextView r3 = r26.mo11532d()
            androidx.appcompat.app.AppCompatActivity r5 = r0.f34087a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131826416(0x7f1116f0, float:1.9285716E38)
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            int r7 = r8.f132123i
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r9[r10] = r7
            java.lang.String r5 = r5.getString(r6, r9)
            r3.setText(r5)
        L_0x02b6:
            androidx.constraintlayout.widget.ConstraintLayout r3 = r26.mo11534f()
            if (r3 == 0) goto L_0x02ca
            r5 = 2131302555(0x7f09189b, float:1.82232E38)
            android.widget.TextView r6 = r26.mo11532d()
            java.lang.CharSequence r6 = r6.getText()
            r3.setTag(r5, r6)
        L_0x02ca:
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r3 = r26.mo11531c()
            r5 = 8
            r3.setVisibility(r5)
            rx3.g r3 = r0.f34096j
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            r6 = 0
            r3.setVisibility(r6)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r26.mo11534f()
            oo1.e$p r5 = new oo1.e$p
            r5.<init>(r4, r8, r0)
            r3.setOnClickListener(r5)
            goto L_0x0357
        L_0x02ee:
            r6 = 0
            android.widget.TextView r7 = r26.mo11532d()
            r9 = 8
            r7.setVisibility(r9)
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r7 = r26.mo11531c()
            r7.setVisibility(r6)
            androidx.constraintlayout.widget.ConstraintLayout r6 = r26.mo11534f()
            oo1.e$q r7 = new oo1.e$q
            r7.<init>(r0, r4, r8)
            r6.setOnClickListener(r7)
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r4 = r26.mo11531c()
            oo1.k r6 = new oo1.k
            r6.<init>(r8)
            r4.mo5009f(r2, r6)
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView r4 = r26.mo11531c()
            oo1.e$r r6 = new oo1.e$r
            r6.<init>(r8, r0, r2, r3)
            r4.setProgressDoneAndNextAction(r6)
            java.lang.String r3 = r0.f34111y
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 != 0) goto L_0x0357
            java.lang.String r3 = r8.f132122h
            boolean r3 = gy3.C87412m.m108589b(r5, r3)
            if (r3 == 0) goto L_0x0357
            r0.f34111y = r5
            rx3.g r3 = r0.f34092f
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.plugin.finder.view.notice.HighLightGreenBgView r3 = (com.tencent.p014mm.plugin.finder.view.notice.HighLightGreenBgView) r3
            r3.getClass()
            a14.n0 r4 = a14.C53930o0.m60555b()
            hs1.a r7 = new hs1.a
            r10 = 0
            r7.<init>(r3, r10)
            r6 = 0
            r8 = 3
            r9 = 0
            r5 = 0
            a14.z1 r4 = a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            r3.f18301d = r4
            goto L_0x0358
        L_0x0357:
            r10 = 0
        L_0x0358:
            rx3.g r3 = r0.f34102p
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            oo1.e$s r4 = new oo1.e$s
            r4.<init>(r0)
            r3.setOnClickListener(r4)
            rx3.g r3 = r0.f34099m
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r21 = "handleFinderLiveNoticeInfo"
            java.lang.String r22 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r20 = "handleFinderLiveNoticeInfo"
            java.lang.String r21 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            rx3.g r3 = r0.f34100n
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            k20.a r4 = new k20.a
            r4.<init>()
            r5 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r21 = "handleFinderLiveNoticeInfo"
            java.lang.String r22 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r20 = "handleFinderLiveNoticeInfo"
            java.lang.String r21 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r3 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r3
            if (r3 == 0) goto L_0x04b3
            te3.e51 r3 = r3.f16272k
            if (r3 == 0) goto L_0x04b3
            int r4 = r3.f132699f
            if (r4 <= 0) goto L_0x0416
            r4 = 1
            goto L_0x0417
        L_0x0416:
            r4 = 0
        L_0x0417:
            if (r4 == 0) goto L_0x041a
            goto L_0x041b
        L_0x041a:
            r3 = r10
        L_0x041b:
            if (r3 == 0) goto L_0x04b3
            rx3.g r3 = r0.f34099m
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            k20.a r4 = new k20.a
            r4.<init>()
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r21 = "handleFinderLiveNoticeInfo"
            java.lang.String r22 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r20 = "handleFinderLiveNoticeInfo"
            java.lang.String r21 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            rx3.g r3 = r0.f34100n
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            k20.a r4 = new k20.a
            r4.<init>()
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r21 = "handleFinderLiveNoticeInfo"
            java.lang.String r22 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r20 = "handleFinderLiveNoticeInfo"
            java.lang.String r21 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x04b3:
            rx3.g r3 = r0.f34102p
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r4 = 8
            r3.setVisibility(r4)
            rx3.g r3 = r0.f34103q
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.mo10233c(r4)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r21 = "handleFinderLiveNoticeInfo"
            java.lang.String r22 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r4 = 0
            java.lang.Object r5 = r5.mo10231a(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r4 = r5.intValue()
            r3.setVisibility(r4)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r20 = "handleFinderLiveNoticeInfo"
            java.lang.String r21 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r1.get(r2)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r1 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r1
            if (r1 == 0) goto L_0x060a
            te3.e51 r1 = r1.f16272k
            if (r1 == 0) goto L_0x060a
            int r2 = r1.f132699f
            r3 = 1
            if (r2 <= r3) goto L_0x051f
            r2 = 1
            goto L_0x0520
        L_0x051f:
            r2 = 0
        L_0x0520:
            if (r2 == 0) goto L_0x0524
            r6 = r1
            goto L_0x0525
        L_0x0524:
            r6 = r10
        L_0x0525:
            if (r6 == 0) goto L_0x060a
            pe1.c<java.lang.Integer> r1 = gg1.C32444a.f86128b2
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x060a
            rx3.g r1 = r0.f34102p
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r2 = 0
            r1.setVisibility(r2)
            rx3.g r1 = r0.f34103q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r6 = "handleFinderLiveNoticeInfo"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            java.lang.Object r2 = r11.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r3 = "handleFinderLiveNoticeInfo"
            java.lang.String r4 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x060a
        L_0x059b:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r26.mo11534f()
            r2 = 8
            r1.setVisibility(r2)
            rx3.g r1 = r0.f34102p
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r1.setVisibility(r2)
            rx3.g r1 = r0.f34103q
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            android.view.View r1 = (android.view.View) r1
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11.mo10233c(r2)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r6 = "handleFinderLiveNoticeInfo"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            java.lang.Object r2 = r11.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget"
            java.lang.String r3 = "handleFinderLiveNoticeInfo"
            java.lang.String r4 = "(Ljava/lang/String;Ljava/lang/String;ZZZLcom/tencent/mm/plugin/finder/api/LocalFinderContact;Ljava/lang/String;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x060a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oo1.C11625e.mo11535g(java.lang.String, java.lang.String, boolean, boolean, boolean, fe1.q, java.lang.String):void");
    }

    /* renamed from: i */
    public final void mo11536i(String str, C49098d51 d512, boolean z) {
        NoticeCouponMiniInfoView noticeCouponMiniInfoView = (NoticeCouponMiniInfoView) ((C36570n) this.f34101o).getValue();
        C87412m.m108593f(noticeCouponMiniInfoView, "noticeCouponMiniInfoView");
        NoticeCouponMiniInfoView.m4339a(noticeCouponMiniInfoView, C7802g1.m7950b(d512), this.f34104r, z, false, false, z ? new C11651v(d512, this, str, z) : null, 24, (Object) null);
    }
}
