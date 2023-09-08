package pu2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.kiss.widget.textview.PLSysTextView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncNormalTextView;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncTextView;
import com.tencent.p014mm.plugin.sns.p106ui.C71253l1;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import tu2.C14093e;
import xt2.C102723a;

/* renamed from: pu2.r */
public abstract class C100942r extends LinearLayout {

    /* renamed from: C */
    public static final C100947q f295575C = new C100947q((C8480h) null);

    /* renamed from: D */
    public static final C13601g<String> f295576D = C36568h.m40985a(C12008a.f35003d);

    /* renamed from: E */
    public static final C13601g<Integer> f295577E = C36568h.m40985a(C12019p.f35014d);

    /* renamed from: F */
    public static final C13601g<Integer> f295578F = C36568h.m40985a(C12018o.f35013d);

    /* renamed from: G */
    public static final C13601g<Integer> f295579G = C36568h.m40985a(C12010d.f35005d);

    /* renamed from: H */
    public static final C13601g<Integer> f295580H = C36568h.m40985a(C12014j.f35009d);

    /* renamed from: I */
    public static final C13601g<Integer> f295581I = C36568h.m40985a(C12017n.f35012d);

    /* renamed from: J */
    public static final C13601g<Integer> f295582J = C36568h.m40985a(C12015k.f35010d);

    /* renamed from: K */
    public static final C13601g<Integer> f295583K = C36568h.m40985a(C12016l.f35011d);

    /* renamed from: L */
    public static final C13601g<Integer> f295584L = C36568h.m40985a(C12011e.f35006d);

    /* renamed from: M */
    public static final C13601g<Integer> f295585M = C36568h.m40985a(C12013i.f35008d);

    /* renamed from: N */
    public static final C13601g<Integer> f295586N = C36568h.m40985a(C12009c.f35004d);

    /* renamed from: P */
    public static final C13601g<Integer> f295587P = C36568h.m40985a(C12012h.f35007d);

    /* renamed from: Q */
    public static final C13601g<Integer> f295588Q = C36568h.m40985a(C100944f.f295615d);

    /* renamed from: R */
    public static final C13601g<Integer> f295589R = C36568h.m40985a(C100945g.f295616d);

    /* renamed from: S */
    public static final C13601g<Integer> f295590S = C36568h.m40985a(C100943b.f295614d);

    /* renamed from: T */
    public static final C13601g<Integer> f295591T = C36568h.m40985a(C100946m.f295617d);

    /* renamed from: A */
    public ViewStub f295592A = mo140437h(C0966R.C0971layout.d5n);

    /* renamed from: B */
    public ViewStub f295593B = mo140437h(C0966R.C0971layout.d5p);

    /* renamed from: d */
    public C96275w6 f295594d;

    /* renamed from: e */
    public SnsTimeLineBaseAdapter f295595e;

    /* renamed from: f */
    public ViewGroup f295596f;

    /* renamed from: g */
    public final C13601g f295597g;

    /* renamed from: h */
    public final C13601g f295598h;

    /* renamed from: i */
    public final C13601g f295599i;

    /* renamed from: j */
    public final C13601g f295600j;

    /* renamed from: n */
    public final C13601g f295601n;

    /* renamed from: o */
    public PLSysTextView f295602o;

    /* renamed from: p */
    public ImageView f295603p;

    /* renamed from: q */
    public View f295604q;

    /* renamed from: r */
    public View f295605r;

    /* renamed from: s */
    public View f295606s;

    /* renamed from: t */
    public View f295607t;

    /* renamed from: u */
    public View f295608u;

    /* renamed from: v */
    public View f295609v;

    /* renamed from: w */
    public View f295610w;

    /* renamed from: x */
    public LinearLayout f295611x;

    /* renamed from: y */
    public ViewStub f295612y = mo140437h(C0966R.C0971layout.f360010d34);

    /* renamed from: z */
    public ViewStub f295613z = mo140437h(C0966R.C0971layout.d0j);

    /* renamed from: pu2.r$a */
    public static final class C12008a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C12008a f35003d = new C12008a();

        public C12008a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Description$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Description$2");
            String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.a_r);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Description$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Description$2");
            return q;
        }
    }

    /* renamed from: pu2.r$c */
    public static final class C12009c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12009c f35004d = new C12009c();

        public C12009c() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Size_Px$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Size_Px$2");
            Integer valueOf = Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 52));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Size_Px$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Size_Px$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$d */
    public static final class C12010d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12010d f35005d = new C12010d();

        public C12010d() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Basic_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Basic_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3623g));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Basic_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Basic_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$e */
    public static final class C12011e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12011e f35006d = new C12011e();

        public C12011e() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Bigger_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Bigger_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3633r));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Bigger_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Bigger_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$h */
    public static final class C12012h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12012h f35007d = new C12012h();

        public C12012h() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$LARGE_RIGHT_PANEL_LAYOUT_WIDTH$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$LARGE_RIGHT_PANEL_LAYOUT_WIDTH$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avl));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$LARGE_RIGHT_PANEL_LAYOUT_WIDTH$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$LARGE_RIGHT_PANEL_LAYOUT_WIDTH$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$i */
    public static final class C12013i extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12013i f35008d = new C12013i();

        public C12013i() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Large_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Large_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3895i6));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Large_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Large_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$j */
    public static final class C12014j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12014j f35009d = new C12014j();

        public C12014j() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Little_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Little_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3906ig));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Little_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Little_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$k */
    public static final class C12015k extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12015k f35010d = new C12015k();

        public C12015k() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Middle_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Middle_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3913iq));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Middle_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Middle_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$l */
    public static final class C12016l extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12016l f35011d = new C12016l();

        public C12016l() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Normal_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Normal_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3926j6));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Normal_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Normal_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$n */
    public static final class C12017n extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12017n f35012d = new C12017n();

        public C12017n() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Small_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Small_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3956le));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Small_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Small_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$o */
    public static final class C12018o extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12018o f35013d = new C12018o();

        public C12018o() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Smaller_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Smaller_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3961lj));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Smaller_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Smaller_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$p */
    public static final class C12019p extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C12019p f35014d = new C12019p();

        public C12019p() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Smallest_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Smallest_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3963ll));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Smallest_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Smallest_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$b */
    public static final class C100943b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C100943b f295614d = new C100943b();

        public C100943b() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Margin_HORIZATION$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Margin_HORIZATION$2");
            Integer valueOf = Integer.valueOf(C100942r.f295575C.mo140466g());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Margin_HORIZATION$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Avatar_Margin_HORIZATION$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$f */
    public static final class C100944f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C100944f f295615d = new C100944f();

        public C100944f() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Content_Layout_Padding_Horizontal_Left$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Content_Layout_Padding_Horizontal_Left$2");
            Integer valueOf = Integer.valueOf(C100942r.f295575C.mo140462c());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Content_Layout_Padding_Horizontal_Left$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Content_Layout_Padding_Horizontal_Left$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$g */
    public static final class C100945g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C100945g f295616d = new C100945g();

        public C100945g() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Content_Layout_Padding_Horizontal_Right$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Content_Layout_Padding_Horizontal_Right$2");
            Integer valueOf = Integer.valueOf(C100942r.f295575C.mo140468i());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Content_Layout_Padding_Horizontal_Right$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$Content_Layout_Padding_Horizontal_Right$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$m */
    public static final class C100946m extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C100946m f295617d = new C100946m();

        public C100946m() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$RightPanelLayout_Margin_Left$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$RightPanelLayout_Margin_Left$2");
            Integer valueOf = Integer.valueOf(C100942r.f295575C.mo140461b());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$RightPanelLayout_Margin_Left$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion$RightPanelLayout_Margin_Left$2");
            return valueOf;
        }
    }

    /* renamed from: pu2.r$q */
    public static final class C100947q {
        public C100947q(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo140460a() {
            SnsMethodCalculate.markStartTimeMs("getAvatar_Size_Px", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getAvatar_Size_Px$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295586N;
            SnsMethodCalculate.markEndTimeMs("access$getAvatar_Size_Px$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getAvatar_Size_Px", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: b */
        public final int mo140461b() {
            SnsMethodCalculate.markStartTimeMs("getBasic_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getBasic_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295579G;
            SnsMethodCalculate.markEndTimeMs("access$getBasic_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getBasic_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: c */
        public final int mo140462c() {
            SnsMethodCalculate.markStartTimeMs("getBigger_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getBigger_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295584L;
            SnsMethodCalculate.markEndTimeMs("access$getBigger_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getBigger_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: d */
        public final int mo140463d() {
            SnsMethodCalculate.markStartTimeMs("getContent_Layout_Padding_Horizontal_Left", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getContent_Layout_Padding_Horizontal_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295588Q;
            SnsMethodCalculate.markEndTimeMs("access$getContent_Layout_Padding_Horizontal_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getContent_Layout_Padding_Horizontal_Left", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: e */
        public final int mo140464e() {
            SnsMethodCalculate.markStartTimeMs("getContent_Layout_Padding_Horizontal_Right", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getContent_Layout_Padding_Horizontal_Right$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295589R;
            SnsMethodCalculate.markEndTimeMs("access$getContent_Layout_Padding_Horizontal_Right$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getContent_Layout_Padding_Horizontal_Right", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: f */
        public final int mo140465f() {
            SnsMethodCalculate.markStartTimeMs("getLARGE_RIGHT_PANEL_LAYOUT_WIDTH", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getLARGE_RIGHT_PANEL_LAYOUT_WIDTH$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295587P;
            SnsMethodCalculate.markEndTimeMs("access$getLARGE_RIGHT_PANEL_LAYOUT_WIDTH$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getLARGE_RIGHT_PANEL_LAYOUT_WIDTH", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: g */
        public final int mo140466g() {
            SnsMethodCalculate.markStartTimeMs("getLittle_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getLittle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295580H;
            SnsMethodCalculate.markEndTimeMs("access$getLittle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getLittle_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: h */
        public final int mo140467h() {
            SnsMethodCalculate.markStartTimeMs("getMiddle_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getMiddle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295582J;
            SnsMethodCalculate.markEndTimeMs("access$getMiddle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getMiddle_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: i */
        public final int mo140468i() {
            SnsMethodCalculate.markStartTimeMs("getNormal_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getNormal_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295583K;
            SnsMethodCalculate.markEndTimeMs("access$getNormal_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getNormal_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: j */
        public final int mo140469j() {
            SnsMethodCalculate.markStartTimeMs("getRightPanelLayout_Margin_Left", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getRightPanelLayout_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295591T;
            SnsMethodCalculate.markEndTimeMs("access$getRightPanelLayout_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getRightPanelLayout_Margin_Left", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: k */
        public final int mo140470k() {
            SnsMethodCalculate.markStartTimeMs("getSmall_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getSmall_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295581I;
            SnsMethodCalculate.markEndTimeMs("access$getSmall_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getSmall_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: l */
        public final int mo140471l() {
            SnsMethodCalculate.markStartTimeMs("getSmallest_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getSmallest_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295577E;
            SnsMethodCalculate.markEndTimeMs("access$getSmallest_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getSmallest_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            return intValue;
        }
    }

    /* renamed from: pu2.r$r */
    public static final class C100948r extends C87413o implements C32224a<SnsAvatarImageView> {

        /* renamed from: d */
        public final /* synthetic */ Context f295618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100948r(Context context) {
            super(0);
            this.f295618d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$avatarImage$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$avatarImage$2");
            SnsAvatarImageView snsAvatarImageView = new SnsAvatarImageView(this.f295618d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$avatarImage$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$avatarImage$2");
            return snsAvatarImageView;
        }
    }

    /* renamed from: pu2.r$s */
    public static final class C100949s extends C87413o implements C32224a<AsyncNormalTextView> {

        /* renamed from: d */
        public final /* synthetic */ Context f295619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100949s(Context context) {
            super(0);
            this.f295619d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$contentText$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$contentText$2");
            AsyncNormalTextView asyncNormalTextView = new AsyncNormalTextView(this.f295619d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$contentText$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$contentText$2");
            return asyncNormalTextView;
        }
    }

    /* renamed from: pu2.r$t */
    public static final class C100950t extends C87413o implements C32224a<AsyncTextView> {

        /* renamed from: d */
        public final /* synthetic */ Context f295620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100950t(Context context) {
            super(0);
            this.f295620d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$nickNameText$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$nickNameText$2");
            AsyncTextView asyncTextView = new AsyncTextView(this.f295620d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$nickNameText$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$nickNameText$2");
            return asyncTextView;
        }
    }

    /* renamed from: pu2.r$u */
    public static final class C100951u extends C87413o implements C32224a<ConstraintLayout> {

        /* renamed from: d */
        public final /* synthetic */ Context f295621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100951u(Context context) {
            super(0);
            this.f295621d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$rightPanelLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$rightPanelLayout$2");
            ConstraintLayout constraintLayout = new ConstraintLayout(this.f295621d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$rightPanelLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$rightPanelLayout$2");
            return constraintLayout;
        }
    }

    /* renamed from: pu2.r$v */
    public static final class C100952v extends C87413o implements C32224a<C14093e> {

        /* renamed from: d */
        public final /* synthetic */ Context f295622d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100952v(Context context) {
            super(0);
            this.f295622d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$weComTagImage$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$weComTagImage$2");
            C14093e eVar = new C14093e(this.f295622d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$weComTagImage$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$weComTagImage$2");
            return eVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100942r(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context);
        Context context2 = context;
        C96275w6 w6Var2 = w6Var;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(w6Var2, "struct");
        C87412m.m108594g(snsTimeLineBaseAdapter2, "adapter");
        this.f295594d = w6Var2;
        this.f295595e = snsTimeLineBaseAdapter2;
        this.f295597g = C36568h.m40985a(new C100948r(context2));
        this.f295598h = C36568h.m40985a(new C100951u(context2));
        this.f295599i = C36568h.m40985a(new C100950t(context2));
        this.f295600j = C36568h.m40985a(new C100952v(context2));
        this.f295601n = C36568h.m40985a(new C100949s(context2));
        this.f295604q = new ViewStub(context2);
        this.f295605r = new ViewStub(context2);
        this.f295606s = new ViewStub(context2);
        this.f295607t = new ViewStub(context2);
        this.f295608u = new ViewStub(context2);
        this.f295609v = new ViewStub(context2);
        this.f295610w = new ViewStub(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setId(C0966R.C0970id.nq6);
        this.f295611x = linearLayout;
        long currentTimeMillis = System.currentTimeMillis();
        SnsJankActivity.C96073a aVar = SnsJankActivity.f280539s;
        aVar.mo133612a(mo87544n(), "buildItemView");
        SnsMethodCalculate.markStartTimeMs("setupSelfAttribute", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        setId(C0966R.C0970id.nq_);
        setOrientation(1);
        C100947q qVar = f295575C;
        setPadding(0, qVar.mo140466g(), 0, 0);
        SnsMethodCalculate.markEndTimeMs("setupSelfAttribute", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("buildItemView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("buildRepostLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C13604l lVar = new C13604l(this.f295592A, new LinearLayout.LayoutParams(-1, -2));
        SnsMethodCalculate.markEndTimeMs("buildRepostLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        m132327d(this, lVar, (ViewGroup) null, 2, (Object) null);
        SnsMethodCalculate.markStartTimeMs("buildUnreadLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C13604l lVar2 = new C13604l(this.f295593B, new LinearLayout.LayoutParams(-1, -2));
        SnsMethodCalculate.markEndTimeMs("buildUnreadLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        m132327d(this, lVar2, (ViewGroup) null, 2, (Object) null);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f295596f = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(qVar.mo140463d(), 0, qVar.mo140464e(), 0);
        SnsMethodCalculate.markStartTimeMs("buildAvatar", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        getAvatarImage().setId(C0966R.C0970id.f5678lm);
        getAvatarImage().setImageResource(C0966R.C0969drawable.bfa);
        SnsAvatarImageView avatarImage = getAvatarImage();
        SnsMethodCalculate.markStartTimeMs("access$getAvatar_Description", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("getAvatar_Description", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getAvatar_Description$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C13601g<String> gVar = f295576D;
        SnsMethodCalculate.markEndTimeMs("access$getAvatar_Description$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsMethodCalculate.markEndTimeMs("getAvatar_Description", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        SnsMethodCalculate.markEndTimeMs("access$getAvatar_Description", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        avatarImage.setContentDescription((String) ((C36570n) gVar).getValue());
        getAvatarImage().setPadding(qVar.mo140466g(), qVar.mo140466g(), qVar.mo140466g(), qVar.mo140466g());
        SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_FEED_NEW_SHOW_DEBUG_INT_SYNC, 0) == 1;
        SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z) {
            getAvatarImage().setBackgroundColor(C76577a.m92153d(getContext(), C0966R.color.f2960ag));
        }
        C13604l lVar3 = new C13604l(getAvatarImage(), new LinearLayout.LayoutParams(qVar.mo140460a(), qVar.mo140460a()));
        SnsMethodCalculate.markEndTimeMs("buildAvatar", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(lVar3, linearLayout2);
        SnsMethodCalculate.markStartTimeMs("buildRightPanelLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        boolean z2 = C102723a.f303339d;
        SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
        int j = mo140439j(z2);
        long j2 = currentTimeMillis;
        Log.m105924i("MicroMsg.Improve.TimelineItemBuild", "buildRightPanelLayout width=" + j + ", enableLargeUI:" + z2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(j, -2);
        layoutParams.setMarginStart(qVar.mo140469j());
        C13604l lVar4 = new C13604l(getRightPanelLayout(), layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildRightPanelLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(lVar4, linearLayout2);
        SnsMethodCalculate.markStartTimeMs("setupRightPanelDetailLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("buildNickNameLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(0);
        linearLayout3.setId(C0966R.C0970id.nq9);
        SnsJankActivity.C96073a aVar2 = aVar;
        getNickNameText().setId(C0966R.C0970id.hg4);
        String str = "buildItemView";
        getNickNameText().setTextColor(C76577a.m92153d(getContext(), C0966R.color.f3154h3));
        getNickNameText().setTextSize(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3927j7));
        getNickNameText().setSingleLine(true);
        getNickNameText().setEllipsize(TextUtils.TruncateAt.END);
        getNickNameText().setOnTouchListener(new C71253l1());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        SnsMethodCalculate.markStartTimeMs("getSmaller_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getSmaller_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C13601g<Integer> gVar2 = f295578F;
        SnsMethodCalculate.markEndTimeMs("access$getSmaller_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        int intValue = ((Number) ((C36570n) gVar2).getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getSmaller_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
        layoutParams2.setMarginEnd(intValue);
        layoutParams2.gravity = 16;
        linearLayout3.addView(getNickNameText(), layoutParams2);
        getWeComTagImage().setId(C0966R.C0970id.hn4);
        linearLayout3.addView(getWeComTagImage(), new LinearLayout.LayoutParams(C76577a.m92157h(getContext(), C0966R.dimen.f3750d1), C76577a.m92157h(getContext(), C0966R.dimen.f3745cw)));
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams3.f44462q = 0;
        layoutParams3.f44449h = 0;
        LinearLayout linearLayout4 = linearLayout2;
        layoutParams3.setMargins(0, qVar.mo140466g(), C76577a.m92157h(getContext(), C0966R.dimen.f3961lj), 0);
        C13604l lVar5 = new C13604l(linearLayout3, layoutParams3);
        SnsMethodCalculate.markEndTimeMs("buildNickNameLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(lVar5, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildContentTextView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        linearLayout5.setId(C0966R.C0970id.c29);
        linearLayout5.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = mo140438i(3);
        linearLayout5.addView(getContentText(), layoutParams4);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams5.f44462q = 0;
        layoutParams5.f44451i = C0966R.C0970id.nq9;
        C13604l lVar6 = new C13604l(linearLayout5, layoutParams5);
        SnsMethodCalculate.markEndTimeMs("buildContentTextView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(lVar6, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("processCustomLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C13604l<View, ConstraintLayout.LayoutParams> f = mo87542f();
        ((View) f.f38555d).setId(C0966R.C0970id.nq7);
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) f.f38556e;
        layoutParams6.f44462q = 0;
        layoutParams6.f44451i = C0966R.C0970id.c29;
        if (getViewType() != 6) {
            ((ConstraintLayout.LayoutParams) f.f38556e).setMargins(0, qVar.mo140467h(), 0, qVar.mo140471l());
        }
        ((View) f.f38555d).setId(C0966R.C0970id.nq7);
        ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) f.f38556e;
        layoutParams7.f44462q = 0;
        layoutParams7.f44451i = C0966R.C0970id.c29;
        layoutParams7.setMargins(0, qVar.mo140467h(), 0, qVar.mo140471l());
        SnsMethodCalculate.markEndTimeMs("processCustomLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(f, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildFeedAboutLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        linearLayout6.setOrientation(1);
        linearLayout6.setGravity(16);
        linearLayout6.addView(this.f295604q);
        linearLayout6.addView(this.f295605r);
        linearLayout6.addView(this.f295606s);
        linearLayout6.setId(C0966R.C0970id.nq8);
        ConstraintLayout.LayoutParams layoutParams8 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams8.f44441d = 0;
        layoutParams8.f44451i = C0966R.C0970id.nq7;
        C13604l lVar7 = new C13604l(linearLayout6, layoutParams8);
        SnsMethodCalculate.markEndTimeMs("buildFeedAboutLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(lVar7, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildBottomLineLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        LinearLayout linearLayout7 = new LinearLayout(getContext());
        linearLayout7.setOrientation(0);
        linearLayout7.setGravity(16);
        PLSysTextView pLSysTextView = new PLSysTextView(getContext());
        this.f295602o = pLSysTextView;
        pLSysTextView.setTextColor(C76577a.m92153d(getContext(), C0966R.color.f356983ae1));
        mo140442o(pLSysTextView, C0966R.dimen.f3957lf);
        linearLayout7.addView(this.f295602o, new LinearLayout.LayoutParams(-2, -2));
        linearLayout7.addView(this.f295607t);
        linearLayout7.addView(this.f295608u);
        linearLayout7.addView(this.f295610w);
        LinearLayout linearLayout8 = new LinearLayout(getContext());
        linearLayout8.setOrientation(0);
        linearLayout8.setGravity(16);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.weight = 1.0f;
        C13598b0 b0Var = C13598b0.f38549a;
        linearLayout8.addView(linearLayout7, layoutParams9);
        linearLayout8.addView(this.f295609v);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setGravity(16);
        relativeLayout.setId(C0966R.C0970id.nq5);
        ImageView imageView = new ImageView(getContext());
        this.f295603p = imageView;
        imageView.setId(C0966R.C0970id.f5746nh);
        ImageView imageView2 = this.f295603p;
        if (imageView2 != null) {
            imageView2.setImageDrawable(C74942w4.m89785b(getContext(), C0966R.attr.a1n));
        }
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(mo140438i(32), mo140438i(20));
        layoutParams10.setMargins(mo140438i(10), 0, 0, 0);
        layoutParams10.addRule(21, -1);
        relativeLayout.addView(this.f295603p, layoutParams10);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.setMarginEnd(C76577a.m92157h(getContext(), C0966R.dimen.f3753d4));
        layoutParams11.addRule(15, -1);
        relativeLayout.addView(linearLayout8, layoutParams11);
        ConstraintLayout.LayoutParams layoutParams12 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams12.f44441d = 0;
        layoutParams12.f44447g = 0;
        layoutParams12.f44451i = C0966R.C0970id.nq8;
        layoutParams12.setMargins(0, qVar.mo140470k(), 0, 0);
        C13604l lVar8 = new C13604l(relativeLayout, layoutParams12);
        SnsMethodCalculate.markEndTimeMs("buildBottomLineLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(lVar8, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ConstraintLayout.LayoutParams layoutParams13 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams13.f44441d = 0;
        layoutParams13.f44447g = 0;
        layoutParams13.f44451i = C0966R.C0970id.nq5;
        C13604l lVar9 = new C13604l(this.f295611x, layoutParams13);
        SnsMethodCalculate.markEndTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(lVar9, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildTip", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        LinearLayout linearLayout9 = new LinearLayout(getContext());
        linearLayout9.setOrientation(1);
        linearLayout9.setGravity(16);
        linearLayout9.setId(C0966R.C0970id.nqa);
        linearLayout9.addView(this.f295612y, getItemTipParam());
        linearLayout9.addView(this.f295613z, getItemTipParam());
        ConstraintLayout.LayoutParams layoutParams14 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams14.f44441d = 0;
        layoutParams14.f44447g = 0;
        layoutParams14.f44451i = C0966R.C0970id.nq6;
        C13604l lVar10 = new C13604l(linearLayout9, layoutParams14);
        SnsMethodCalculate.markEndTimeMs("buildTip", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        mo140412c(lVar10, getRightPanelLayout());
        SnsMethodCalculate.markEndTimeMs("setupRightPanelDetailLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        boolean z3 = C102723a.f303339d;
        SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC");
        SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.old.TimelineFeedImproveConfigUIC$Companion");
        SnsMethodCalculate.markStartTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.component.old.IFeedImproveEnableLargeUI$DefaultImpls");
        int i = z3 ? -2 : -1;
        Log.m105924i("MicroMsg.Improve.TimelineItemBuild", "getContentLayoutParams: enableLargeUI=" + z3 + ", lp width:" + i);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(i, -2);
        if (z3) {
            layoutParams15.gravity = 1;
        } else {
            layoutParams15.gravity = 0;
        }
        SnsMethodCalculate.markEndTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.component.old.IFeedImproveEnableLargeUI$DefaultImpls");
        SnsMethodCalculate.markEndTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        m132327d(this, new C13604l(linearLayout4, layoutParams15), (ViewGroup) null, 2, (Object) null);
        SnsMethodCalculate.markStartTimeMs("buildDivider", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        View view = new View(getContext());
        view.setBackgroundColor(C76577a.m92153d(MMApplicationContext.getContext(), C0966R.color.BW_90));
        ConstraintLayout.LayoutParams layoutParams16 = new ConstraintLayout.LayoutParams(-1, 1);
        layoutParams16.setMargins(-(mo140438i(52) + qVar.mo140462c() + qVar.mo140461b()), qVar.mo140470k(), -qVar.mo140468i(), 0);
        layoutParams16.f44451i = C0966R.C0970id.nqa;
        layoutParams16.f44455k = 0;
        C13604l lVar11 = new C13604l(view, layoutParams16);
        SnsMethodCalculate.markEndTimeMs("buildDivider", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        m132327d(this, lVar11, (ViewGroup) null, 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        aVar2.mo133613b(mo87544n());
        long currentTimeMillis2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("buildItemView cost:");
        long j3 = currentTimeMillis2 - j2;
        sb.append(j3);
        mo140441m("MicroMsg.Improve.TimelineItemBuild", sb.toString());
        mo140398k();
        mo140441m("MicroMsg.Improve.TimelineItemBuild", "default load cost:" + j3);
    }

    /* renamed from: d */
    public static /* synthetic */ void m132327d(C100942r rVar, C13604l lVar, ViewGroup viewGroup, int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        if (obj == null) {
            if ((i & 2) != 0) {
                viewGroup = rVar;
            }
            rVar.mo140412c(lVar, viewGroup);
            SnsMethodCalculate.markEndTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCustomView");
        SnsMethodCalculate.markEndTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        throw unsupportedOperationException;
    }

    private final LinearLayout.LayoutParams getItemTipParam() {
        SnsMethodCalculate.markStartTimeMs("getItemTipParam", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C100947q qVar = f295575C;
        layoutParams.setMargins(0, qVar.mo140470k(), 0, qVar.mo140461b());
        SnsMethodCalculate.markEndTimeMs("getItemTipParam", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return layoutParams;
    }

    /* renamed from: c */
    public final void mo140412c(C13604l<? extends View, ? extends ViewGroup.LayoutParams> lVar, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("addCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(lVar, "pair");
        C87412m.m108594g(viewGroup, "view");
        viewGroup.addView((View) lVar.f38555d, (ViewGroup.LayoutParams) lVar.f38556e);
        SnsMethodCalculate.markEndTimeMs("addCustomView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    /* renamed from: f */
    public abstract C13604l<View, ConstraintLayout.LayoutParams> mo87542f();

    /* renamed from: g */
    public final PLSysTextView mo140413g(boolean z, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("createPLSysTextView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        PLSysTextView pLSysTextView = new PLSysTextView(getContext());
        if (z) {
            pLSysTextView.setSingleLine();
        }
        pLSysTextView.setTextColor(C76577a.m92153d(getContext(), i));
        pLSysTextView.setTextSize(0, (float) C76577a.m92164o(getContext(), i2));
        SnsMethodCalculate.markEndTimeMs("createPLSysTextView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return pLSysTextView;
    }

    public final SnsTimeLineBaseAdapter getAdapter() {
        SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f295595e;
        SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return snsTimeLineBaseAdapter;
    }

    public final View getAddressStub() {
        SnsMethodCalculate.markStartTimeMs("getAddressStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        View view = this.f295605r;
        SnsMethodCalculate.markEndTimeMs("getAddressStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return view;
    }

    public final View getAppNameStub() {
        SnsMethodCalculate.markStartTimeMs("getAppNameStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        View view = this.f295610w;
        SnsMethodCalculate.markEndTimeMs("getAppNameStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return view;
    }

    public final SnsAvatarImageView getAvatarImage() {
        SnsMethodCalculate.markStartTimeMs("getAvatarImage", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsAvatarImageView snsAvatarImageView = (SnsAvatarImageView) ((C36570n) this.f295597g).getValue();
        SnsMethodCalculate.markEndTimeMs("getAvatarImage", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return snsAvatarImageView;
    }

    public final LinearLayout getCommentContainer() {
        SnsMethodCalculate.markStartTimeMs("getCommentContainer", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        LinearLayout linearLayout = this.f295611x;
        SnsMethodCalculate.markEndTimeMs("getCommentContainer", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return linearLayout;
    }

    public final ImageView getCommentImage() {
        SnsMethodCalculate.markStartTimeMs("getCommentImage", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ImageView imageView = this.f295603p;
        SnsMethodCalculate.markEndTimeMs("getCommentImage", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return imageView;
    }

    public final ViewGroup getContentContainer() {
        SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ViewGroup viewGroup = this.f295596f;
        SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return viewGroup;
    }

    public final AsyncNormalTextView getContentText() {
        SnsMethodCalculate.markStartTimeMs("getContentText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        AsyncNormalTextView asyncNormalTextView = (AsyncNormalTextView) ((C36570n) this.f295601n).getValue();
        SnsMethodCalculate.markEndTimeMs("getContentText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return asyncNormalTextView;
    }

    public final View getDelTextStub() {
        SnsMethodCalculate.markStartTimeMs("getDelTextStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        View view = this.f295609v;
        SnsMethodCalculate.markEndTimeMs("getDelTextStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return view;
    }

    public final ViewStub getFinderPostStub() {
        SnsMethodCalculate.markStartTimeMs("getFinderPostStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ViewStub viewStub = this.f295612y;
        SnsMethodCalculate.markEndTimeMs("getFinderPostStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return viewStub;
    }

    public final View getGameAboutStub() {
        SnsMethodCalculate.markStartTimeMs("getGameAboutStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        View view = this.f295604q;
        SnsMethodCalculate.markEndTimeMs("getGameAboutStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return view;
    }

    public final View getGroupImageStub() {
        SnsMethodCalculate.markStartTimeMs("getGroupImageStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        View view = this.f295607t;
        SnsMethodCalculate.markEndTimeMs("getGroupImageStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return view;
    }

    public final ViewStub getItemErrorStub() {
        SnsMethodCalculate.markStartTimeMs("getItemErrorStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ViewStub viewStub = this.f295613z;
        SnsMethodCalculate.markEndTimeMs("getItemErrorStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return viewStub;
    }

    public final ViewGroup.LayoutParams getMatchWidthWrapHeightParams() {
        SnsMethodCalculate.markStartTimeMs("getMatchWidthWrapHeightParams", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        SnsMethodCalculate.markEndTimeMs("getMatchWidthWrapHeightParams", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return layoutParams;
    }

    public final AsyncTextView getNickNameText() {
        SnsMethodCalculate.markStartTimeMs("getNickNameText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        AsyncTextView asyncTextView = (AsyncTextView) ((C36570n) this.f295599i).getValue();
        SnsMethodCalculate.markEndTimeMs("getNickNameText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return asyncTextView;
    }

    public final PLSysTextView getPublishTimeText() {
        SnsMethodCalculate.markStartTimeMs("getPublishTimeText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        PLSysTextView pLSysTextView = this.f295602o;
        SnsMethodCalculate.markEndTimeMs("getPublishTimeText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return pLSysTextView;
    }

    public final ViewStub getRepostStub() {
        SnsMethodCalculate.markStartTimeMs("getRepostStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ViewStub viewStub = this.f295592A;
        SnsMethodCalculate.markEndTimeMs("getRepostStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return viewStub;
    }

    public final ConstraintLayout getRightPanelLayout() {
        SnsMethodCalculate.markStartTimeMs("getRightPanelLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ConstraintLayout constraintLayout = (ConstraintLayout) ((C36570n) this.f295598h).getValue();
        SnsMethodCalculate.markEndTimeMs("getRightPanelLayout", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return constraintLayout;
    }

    public final C96275w6 getStruct() {
        SnsMethodCalculate.markStartTimeMs("getStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C96275w6 w6Var = this.f295594d;
        SnsMethodCalculate.markEndTimeMs("getStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return w6Var;
    }

    public final View getTypeIcon() {
        SnsMethodCalculate.markStartTimeMs("getTypeIcon", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        View view = this.f295608u;
        SnsMethodCalculate.markEndTimeMs("getTypeIcon", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return view;
    }

    public final ViewStub getUnreadStub() {
        SnsMethodCalculate.markStartTimeMs("getUnreadStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ViewStub viewStub = this.f295593B;
        SnsMethodCalculate.markEndTimeMs("getUnreadStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return viewStub;
    }

    public abstract int getViewType();

    public final C14093e getWeComTagImage() {
        SnsMethodCalculate.markStartTimeMs("getWeComTagImage", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C14093e eVar = (C14093e) ((C36570n) this.f295600j).getValue();
        SnsMethodCalculate.markEndTimeMs("getWeComTagImage", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return eVar;
    }

    public final View getWithFriendStub() {
        SnsMethodCalculate.markStartTimeMs("getWithFriendStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        View view = this.f295606s;
        SnsMethodCalculate.markEndTimeMs("getWithFriendStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return view;
    }

    /* renamed from: h */
    public final ViewStub mo140437h(int i) {
        SnsMethodCalculate.markStartTimeMs("createViewStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        ViewStub viewStub = new ViewStub(getContext());
        viewStub.setLayoutInflater(C85868k2.m106137b(getContext()));
        viewStub.setLayoutResource(i);
        SnsMethodCalculate.markEndTimeMs("createViewStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return viewStub;
    }

    /* renamed from: i */
    public final int mo140438i(int i) {
        SnsMethodCalculate.markStartTimeMs("dip", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        int b = C76577a.m92151b(MMApplicationContext.getContext(), i);
        SnsMethodCalculate.markEndTimeMs("dip", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return b;
    }

    /* renamed from: j */
    public int mo140439j(boolean z) {
        int i;
        SnsMethodCalculate.markStartTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.component.old.IFeedImproveEnableLargeUI$DefaultImpls");
        if (z) {
            i = f295575C.mo140465f();
            SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.component.old.IFeedImproveEnableLargeUI$DefaultImpls");
        } else {
            i = -1;
            SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.component.old.IFeedImproveEnableLargeUI$DefaultImpls");
        }
        SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        return i;
    }

    /* renamed from: k */
    public abstract void mo140398k();

    /* renamed from: l */
    public final void mo140440l(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("logE", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        Log.m105920e(str, '[' + C100960u0.f295631a.mo140476a(this.f295594d) + '-' + hashCode() + ']' + str2);
        SnsMethodCalculate.markEndTimeMs("logE", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    /* renamed from: m */
    public final void mo140441m(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("logI", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "msg");
        Log.m105924i(str, '[' + C100960u0.f295631a.mo140476a(this.f295594d) + '-' + hashCode() + ']' + str2);
        SnsMethodCalculate.markEndTimeMs("logI", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    /* renamed from: n */
    public abstract String mo87544n();

    /* renamed from: o */
    public final void mo140442o(TextView textView, int i) {
        SnsMethodCalculate.markStartTimeMs("setSpecialTextSize", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(textView, MimeTypes.BASE_TYPE_TEXT);
        textView.setTextSize(0, Math.min(((float) C76577a.m92155f(getContext(), i)) * C76577a.m92168s(getContext()), (float) C76577a.m92164o(getContext(), i)));
        SnsMethodCalculate.markEndTimeMs("setSpecialTextSize", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setAdapter(SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(snsTimeLineBaseAdapter, "<set-?>");
        this.f295595e = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setAddressStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setAddressStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f295605r = view;
        SnsMethodCalculate.markEndTimeMs("setAddressStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setAppNameStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setAppNameStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f295610w = view;
        SnsMethodCalculate.markEndTimeMs("setAppNameStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setCommentContainer(LinearLayout linearLayout) {
        SnsMethodCalculate.markStartTimeMs("setCommentContainer", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(linearLayout, "<set-?>");
        this.f295611x = linearLayout;
        SnsMethodCalculate.markEndTimeMs("setCommentContainer", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setCommentImage(ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("setCommentImage", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        this.f295603p = imageView;
        SnsMethodCalculate.markEndTimeMs("setCommentImage", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setContentContainer(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        this.f295596f = viewGroup;
        SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setDelTextStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setDelTextStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f295609v = view;
        SnsMethodCalculate.markEndTimeMs("setDelTextStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setFinderPostStub(ViewStub viewStub) {
        SnsMethodCalculate.markStartTimeMs("setFinderPostStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(viewStub, "<set-?>");
        this.f295612y = viewStub;
        SnsMethodCalculate.markEndTimeMs("setFinderPostStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setGameAboutStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setGameAboutStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f295604q = view;
        SnsMethodCalculate.markEndTimeMs("setGameAboutStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setGroupImageStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setGroupImageStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f295607t = view;
        SnsMethodCalculate.markEndTimeMs("setGroupImageStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setItemErrorStub(ViewStub viewStub) {
        SnsMethodCalculate.markStartTimeMs("setItemErrorStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(viewStub, "<set-?>");
        this.f295613z = viewStub;
        SnsMethodCalculate.markEndTimeMs("setItemErrorStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setPublishTimeText(PLSysTextView pLSysTextView) {
        SnsMethodCalculate.markStartTimeMs("setPublishTimeText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        this.f295602o = pLSysTextView;
        SnsMethodCalculate.markEndTimeMs("setPublishTimeText", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setRepostStub(ViewStub viewStub) {
        SnsMethodCalculate.markStartTimeMs("setRepostStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(viewStub, "<set-?>");
        this.f295592A = viewStub;
        SnsMethodCalculate.markEndTimeMs("setRepostStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setStruct(C96275w6 w6Var) {
        SnsMethodCalculate.markStartTimeMs("setStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(w6Var, "<set-?>");
        this.f295594d = w6Var;
        SnsMethodCalculate.markEndTimeMs("setStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setTypeIcon(View view) {
        SnsMethodCalculate.markStartTimeMs("setTypeIcon", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f295608u = view;
        SnsMethodCalculate.markEndTimeMs("setTypeIcon", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setUnreadStub(ViewStub viewStub) {
        SnsMethodCalculate.markStartTimeMs("setUnreadStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(viewStub, "<set-?>");
        this.f295593B = viewStub;
        SnsMethodCalculate.markEndTimeMs("setUnreadStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }

    public final void setWithFriendStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setWithFriendStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f295606s = view;
        SnsMethodCalculate.markEndTimeMs("setWithFriendStub", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
    }
}
