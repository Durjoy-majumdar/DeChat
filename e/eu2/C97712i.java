package eu2;

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
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.AsyncTextView;
import com.tencent.p014mm.plugin.sns.p106ui.C71253l1;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadTierView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAvatarImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import pu2.C100942r;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import tu2.C14093e;
import ut2.C102087b;

/* renamed from: eu2.i */
public abstract class C97712i extends LinearLayout {

    /* renamed from: C */
    public static final C97717p f286637C = new C97717p((C8480h) null);

    /* renamed from: D */
    public static final C13601g<String> f286638D = C36568h.m40985a(C7933a.f26619d);

    /* renamed from: E */
    public static final C13601g<Integer> f286639E = C36568h.m40985a(C7934c.f26620d);

    /* renamed from: F */
    public static final C13601g<Integer> f286640F = C36568h.m40985a(C7943o.f26629d);

    /* renamed from: G */
    public static final C13601g<Integer> f286641G = C36568h.m40985a(C7942n.f26628d);

    /* renamed from: H */
    public static final C13601g<Integer> f286642H = C36568h.m40985a(C7935d.f26621d);

    /* renamed from: I */
    public static final C13601g<Integer> f286643I = C36568h.m40985a(C7938h.f26624d);

    /* renamed from: J */
    public static final C13601g<Integer> f286644J = C36568h.m40985a(C7941m.f26627d);

    /* renamed from: K */
    public static final C13601g<Integer> f286645K = C36568h.m40985a(C7939i.f26625d);

    /* renamed from: L */
    public static final C13601g<Integer> f286646L = C36568h.m40985a(C7936e.f26622d);

    /* renamed from: M */
    public static final C13601g<Integer> f286647M = C36568h.m40985a(C7937g.f26623d);

    /* renamed from: N */
    public static final C13601g<Integer> f286648N = C36568h.m40985a(C97715k.f286676d);

    /* renamed from: P */
    public static final C13601g<Integer> f286649P = C36568h.m40985a(C97714f.f286675d);

    /* renamed from: Q */
    public static final C13601g<Integer> f286650Q = C36568h.m40985a(C97713b.f286674d);

    /* renamed from: R */
    public static final C13601g<Integer> f286651R = C36568h.m40985a(C97716l.f286677d);

    /* renamed from: A */
    public final C13601g f286652A;

    /* renamed from: B */
    public final View f286653B;

    /* renamed from: d */
    public final C0125s f286654d;

    /* renamed from: e */
    public ViewGroup f286655e;

    /* renamed from: f */
    public final C13601g f286656f;

    /* renamed from: g */
    public final C13601g f286657g;

    /* renamed from: h */
    public final C13601g f286658h;

    /* renamed from: i */
    public final C13601g f286659i;

    /* renamed from: j */
    public final C13601g f286660j;

    /* renamed from: n */
    public final C13601g f286661n;

    /* renamed from: o */
    public TextView f286662o;

    /* renamed from: p */
    public final C13601g f286663p;

    /* renamed from: q */
    public View f286664q;

    /* renamed from: r */
    public View f286665r;

    /* renamed from: s */
    public View f286666s;

    /* renamed from: t */
    public View f286667t;

    /* renamed from: u */
    public View f286668u;

    /* renamed from: v */
    public View f286669v;

    /* renamed from: w */
    public View f286670w;

    /* renamed from: x */
    public LinearLayout f286671x;

    /* renamed from: y */
    public ViewStub f286672y = mo137010m(C0966R.C0971layout.f360010d34);

    /* renamed from: z */
    public ViewStub f286673z = mo137010m(C0966R.C0971layout.d0j);

    /* renamed from: eu2.i$a */
    public static final class C7933a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C7933a f26619d = new C7933a();

        public C7933a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Description$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Description$2");
            String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.a_r);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Description$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Description$2");
            return q;
        }
    }

    /* renamed from: eu2.i$c */
    public static final class C7934c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7934c f26620d = new C7934c();

        public C7934c() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Size_Px$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Size_Px$2");
            Integer valueOf = Integer.valueOf(C76577a.m92151b(MMApplicationContext.getContext(), 52));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Size_Px$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Size_Px$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$d */
    public static final class C7935d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7935d f26621d = new C7935d();

        public C7935d() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Basic_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Basic_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3623g));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Basic_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Basic_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$e */
    public static final class C7936e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7936e f26622d = new C7936e();

        public C7936e() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Bigger_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Bigger_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3633r));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Bigger_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Bigger_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$g */
    public static final class C7937g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7937g f26623d = new C7937g();

        public C7937g() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$LARGE_RIGHT_PANEL_LAYOUT_WIDTH$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$LARGE_RIGHT_PANEL_LAYOUT_WIDTH$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.avl));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$LARGE_RIGHT_PANEL_LAYOUT_WIDTH$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$LARGE_RIGHT_PANEL_LAYOUT_WIDTH$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$h */
    public static final class C7938h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7938h f26624d = new C7938h();

        public C7938h() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Little_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Little_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3906ig));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Little_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Little_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$i */
    public static final class C7939i extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7939i f26625d = new C7939i();

        public C7939i() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Middle_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Middle_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3913iq));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Middle_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Middle_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$j */
    public static final class C7940j extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7940j f26626d = new C7940j();

        public C7940j() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Normal_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Normal_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3926j6));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Normal_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Normal_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$m */
    public static final class C7941m extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7941m f26627d = new C7941m();

        public C7941m() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Small_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Small_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3956le));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Small_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Small_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$n */
    public static final class C7942n extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7942n f26628d = new C7942n();

        public C7942n() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Smaller_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Smaller_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3961lj));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Smaller_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Smaller_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$o */
    public static final class C7943o extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C7943o f26629d = new C7943o();

        public C7943o() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Smallest_Padding$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Smallest_Padding$2");
            Integer valueOf = Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3963ll));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Smallest_Padding$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Smallest_Padding$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$b */
    public static final class C97713b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C97713b f286674d = new C97713b();

        public C97713b() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Margin_Left$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Margin_Left$2");
            Integer valueOf = Integer.valueOf(C97712i.f286637C.mo137029e());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Margin_Left$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Avatar_Margin_Left$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$f */
    public static final class C97714f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C97714f f286675d = new C97714f();

        public C97714f() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Content_Layout_Padding_Horizontal$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Content_Layout_Padding_Horizontal$2");
            C97717p pVar = C97712i.f286637C;
            SnsMethodCalculate.markStartTimeMs("getBigger_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getBigger_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286646L;
            SnsMethodCalculate.markEndTimeMs("access$getBigger_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getBigger_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            Integer valueOf = Integer.valueOf(intValue + pVar.mo137029e());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Content_Layout_Padding_Horizontal$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Content_Layout_Padding_Horizontal$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$k */
    public static final class C97715k extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C97715k f286676d = new C97715k();

        public C97715k() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Parent_Layout_Padding_Top$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Parent_Layout_Padding_Top$2");
            C100942r.C100947q qVar = C100942r.f295575C;
            SnsMethodCalculate.markStartTimeMs("getLarge_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getLarge_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            C13601g<Integer> gVar = C100942r.f295585M;
            SnsMethodCalculate.markEndTimeMs("access$getLarge_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getLarge_Padding", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemBuild$Companion");
            Integer valueOf = Integer.valueOf(intValue);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Parent_Layout_Padding_Top$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$Parent_Layout_Padding_Top$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$l */
    public static final class C97716l extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C97716l f286677d = new C97716l();

        public C97716l() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$RightPanelLayout_Margin_Left$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$RightPanelLayout_Margin_Left$2");
            Integer valueOf = Integer.valueOf(C97712i.f286637C.mo137026b());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$RightPanelLayout_Margin_Left$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion$RightPanelLayout_Margin_Left$2");
            return valueOf;
        }
    }

    /* renamed from: eu2.i$p */
    public static final class C97717p {
        public C97717p(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo137025a() {
            SnsMethodCalculate.markStartTimeMs("getAvatar_Size_Px", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getAvatar_Size_Px$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286639E;
            SnsMethodCalculate.markEndTimeMs("access$getAvatar_Size_Px$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getAvatar_Size_Px", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: b */
        public final int mo137026b() {
            SnsMethodCalculate.markStartTimeMs("getBasic_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getBasic_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286642H;
            SnsMethodCalculate.markEndTimeMs("access$getBasic_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getBasic_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: c */
        public final int mo137027c() {
            SnsMethodCalculate.markStartTimeMs("getContent_Layout_Padding_Horizontal", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getContent_Layout_Padding_Horizontal$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286649P;
            SnsMethodCalculate.markEndTimeMs("access$getContent_Layout_Padding_Horizontal$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getContent_Layout_Padding_Horizontal", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: d */
        public final int mo137028d() {
            SnsMethodCalculate.markStartTimeMs("getLARGE_RIGHT_PANEL_LAYOUT_WIDTH", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getLARGE_RIGHT_PANEL_LAYOUT_WIDTH$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286647M;
            SnsMethodCalculate.markEndTimeMs("access$getLARGE_RIGHT_PANEL_LAYOUT_WIDTH$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getLARGE_RIGHT_PANEL_LAYOUT_WIDTH", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: e */
        public final int mo137029e() {
            SnsMethodCalculate.markStartTimeMs("getLittle_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getLittle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286643I;
            SnsMethodCalculate.markEndTimeMs("access$getLittle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getLittle_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: f */
        public final int mo137030f() {
            SnsMethodCalculate.markStartTimeMs("getParent_Layout_Padding_Top", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getParent_Layout_Padding_Top$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286648N;
            SnsMethodCalculate.markEndTimeMs("access$getParent_Layout_Padding_Top$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getParent_Layout_Padding_Top", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: g */
        public final int mo137031g() {
            SnsMethodCalculate.markStartTimeMs("getRightPanelLayout_Margin_Left", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getRightPanelLayout_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286651R;
            SnsMethodCalculate.markEndTimeMs("access$getRightPanelLayout_Margin_Left$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getRightPanelLayout_Margin_Left", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: h */
        public final int mo137032h() {
            SnsMethodCalculate.markStartTimeMs("getSmall_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getSmall_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286644J;
            SnsMethodCalculate.markEndTimeMs("access$getSmall_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getSmall_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }

        /* renamed from: i */
        public final int mo137033i() {
            SnsMethodCalculate.markStartTimeMs("getSmallest_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getSmallest_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar = C97712i.f286640F;
            SnsMethodCalculate.markEndTimeMs("access$getSmallest_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue = ((Number) ((C36570n) gVar).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getSmallest_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            return intValue;
        }
    }

    /* renamed from: eu2.i$q */
    public static final class C97718q extends C87413o implements C32224a<SnsAvatarImageView> {

        /* renamed from: d */
        public final /* synthetic */ Context f286678d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97718q(Context context) {
            super(0);
            this.f286678d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$avatarImage$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$avatarImage$2");
            SnsAvatarImageView snsAvatarImageView = new SnsAvatarImageView(this.f286678d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$avatarImage$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$avatarImage$2");
            return snsAvatarImageView;
        }
    }

    /* renamed from: eu2.i$r */
    public static final class C97719r extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ Context f286679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97719r(Context context) {
            super(0);
            this.f286679d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$commentImage$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$commentImage$2");
            ImageView imageView = new ImageView(this.f286679d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$commentImage$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$commentImage$2");
            return imageView;
        }
    }

    /* renamed from: eu2.i$s */
    public static final class C97720s extends C87413o implements C32224a<ImproveContentView> {

        /* renamed from: d */
        public final /* synthetic */ Context f286680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97720s(Context context) {
            super(0);
            this.f286680d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$contentText$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$contentText$2");
            ImproveContentView improveContentView = new ImproveContentView(this.f286680d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$contentText$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$contentText$2");
            return improveContentView;
        }
    }

    /* renamed from: eu2.i$t */
    public static final class C97721t extends C87413o implements C32224a<ImproveTextView> {

        /* renamed from: d */
        public final /* synthetic */ Context f286681d;

        /* renamed from: e */
        public final /* synthetic */ C97712i f286682e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97721t(Context context, C97712i iVar) {
            super(0);
            this.f286681d = context;
            this.f286682e = iVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$debugLabel$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$debugLabel$2");
            ImproveTextView improveTextView = new ImproveTextView(this.f286681d);
            improveTextView.setTextSize(0, (float) C76577a.m92164o(this.f286681d, C0966R.dimen.f3927j7));
            improveTextView.setId(C0966R.C0970id.oio);
            improveTextView.setBackgroundColor(C76577a.m92153d(this.f286681d, C0966R.color.f2966ao));
            improveTextView.setPadding(0, this.f286682e.mo137011n(1), 0, this.f286682e.mo137011n(1));
            improveTextView.setTextColor(C76577a.m92153d(this.f286681d, C0966R.color.FG_0));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$debugLabel$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$debugLabel$2");
            return improveTextView;
        }
    }

    /* renamed from: eu2.i$u */
    public static final class C97722u extends C87413o implements C32224a<AsyncTextView> {

        /* renamed from: d */
        public final /* synthetic */ Context f286683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97722u(Context context) {
            super(0);
            this.f286683d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$nickNameText$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$nickNameText$2");
            AsyncTextView asyncTextView = new AsyncTextView(this.f286683d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$nickNameText$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$nickNameText$2");
            return asyncTextView;
        }
    }

    /* renamed from: eu2.i$v */
    public static final class C97723v extends C87413o implements C32224a<ConstraintLayout> {

        /* renamed from: d */
        public final /* synthetic */ Context f286684d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97723v(Context context) {
            super(0);
            this.f286684d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$rightPanelLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$rightPanelLayout$2");
            ConstraintLayout constraintLayout = new ConstraintLayout(this.f286684d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$rightPanelLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$rightPanelLayout$2");
            return constraintLayout;
        }
    }

    /* renamed from: eu2.i$w */
    public static final class C97724w extends C87413o implements C32224a<ImproveUnreadTierView> {

        /* renamed from: d */
        public final /* synthetic */ Context f286685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97724w(Context context) {
            super(0);
            this.f286685d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$unreadLayout$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$unreadLayout$2");
            ImproveUnreadTierView improveUnreadTierView = new ImproveUnreadTierView(this.f286685d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$unreadLayout$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$unreadLayout$2");
            return improveUnreadTierView;
        }
    }

    /* renamed from: eu2.i$x */
    public static final class C97725x extends C87413o implements C32224a<C14093e> {

        /* renamed from: d */
        public final /* synthetic */ Context f286686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97725x(Context context) {
            super(0);
            this.f286686d = context;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$weComTagImage$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$weComTagImage$2");
            C14093e eVar = new C14093e(this.f286686d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$weComTagImage$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$weComTagImage$2");
            return eVar;
        }
    }

    static {
        C36568h.m40985a(C7940j.f26626d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97712i(Context context) {
        super(context);
        int i;
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        this.f286654d = (C0125s) context2;
        this.f286656f = C36568h.m40985a(new C97718q(context2));
        this.f286657g = C36568h.m40985a(new C97723v(context2));
        this.f286658h = C36568h.m40985a(new C97722u(context2));
        this.f286659i = C36568h.m40985a(new C97721t(context2, this));
        this.f286660j = C36568h.m40985a(new C97725x(context2));
        this.f286661n = C36568h.m40985a(new C97720s(context2));
        this.f286663p = C36568h.m40985a(new C97719r(context2));
        this.f286664q = new ViewStub(context2);
        this.f286665r = new ViewStub(context2);
        this.f286666s = new ViewStub(context2);
        this.f286667t = new ViewStub(context2);
        this.f286668u = new ViewStub(context2);
        this.f286669v = new ViewStub(context2);
        this.f286670w = new ViewStub(context2);
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setId(C0966R.C0970id.nq6);
        this.f286671x = linearLayout;
        this.f286652A = C36568h.m40985a(new C97724w(context2));
        View view = new View(context2);
        this.f286653B = view;
        long currentTimeMillis = System.currentTimeMillis();
        SnsMethodCalculate.markStartTimeMs("setupSelfAttribute", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        setId(C0966R.C0970id.nq_);
        setOrientation(1);
        C97717p pVar = f286637C;
        setPadding(0, pVar.mo137030f(), 0, 0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        SnsMethodCalculate.markEndTimeMs("setupSelfAttribute", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("buildItemView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("buildUnreadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C13604l lVar = new C13604l(getUnreadLayout(), new LinearLayout.LayoutParams(-1, -2));
        SnsMethodCalculate.markEndTimeMs("buildUnreadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        m126019j(this, lVar, (ViewGroup) null, 2, (Object) null);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f286655e = linearLayout2;
        linearLayout2.setId(C0966R.C0970id.oin);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(pVar.mo137027c(), 0, pVar.mo137027c(), 0);
        SnsMethodCalculate.markStartTimeMs("buildAvatar", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        getAvatarImage().setId(C0966R.C0970id.f5678lm);
        getAvatarImage().setImageResource(C0966R.C0969drawable.bfa);
        SnsAvatarImageView avatarImage = getAvatarImage();
        SnsMethodCalculate.markStartTimeMs("access$getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getAvatar_Description$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C13601g<String> gVar = f286638D;
        SnsMethodCalculate.markEndTimeMs("access$getAvatar_Description$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        SnsMethodCalculate.markEndTimeMs("getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        SnsMethodCalculate.markEndTimeMs("access$getAvatar_Description", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        avatarImage.setContentDescription((String) ((C36570n) gVar).getValue());
        getAvatarImage().setPadding(0, 0, pVar.mo137029e(), pVar.mo137029e());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pVar.mo137025a(), pVar.mo137025a());
        layoutParams.setMargins(0, 0, 0, 0);
        C13604l lVar2 = new C13604l(getAvatarImage(), layoutParams);
        SnsMethodCalculate.markEndTimeMs("buildAvatar", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(lVar2, linearLayout2);
        SnsMethodCalculate.markStartTimeMs("buildRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        boolean z = C102087b.f300617d;
        SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        int o = mo137012o(z);
        StringBuilder sb = new StringBuilder();
        String str = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC";
        sb.append("buildRightPanelLayout: width=");
        sb.append(o);
        sb.append(", enableLargeUI:");
        sb.append(z);
        Log.m105924i("MicroMsg.Improve.TimelineItemBuild", sb.toString());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(o, -2);
        layoutParams2.setMarginStart(pVar.mo137031g());
        C13604l lVar3 = new C13604l(getRightPanelLayout(), layoutParams2);
        SnsMethodCalculate.markEndTimeMs("buildRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(lVar3, linearLayout2);
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_FEED_NEW_SHOW_DEBUG_INT_SYNC;
        SnsMethodCalculate.markStartTimeMs("setupRightPanelDetailLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("buildNickNameLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        LinearLayout linearLayout3 = linearLayout2;
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setGravity(16);
        linearLayout4.setOrientation(0);
        linearLayout4.setId(C0966R.C0970id.nq9);
        String str2 = "access$getEnableLargeUI$cp";
        getNickNameText().setId(C0966R.C0970id.hg4);
        String str3 = "buildItemView";
        getNickNameText().setTextColor(C76577a.m92153d(getContext(), C0966R.color.f3154h3));
        getNickNameText().setTextSize(0, (float) C76577a.m92164o(getContext(), C0966R.dimen.f3927j7));
        getNickNameText().setSingleLine(true);
        getNickNameText().setEllipsize(TextUtils.TruncateAt.END);
        getNickNameText().setClickable(true);
        getNickNameText().setOnTouchListener(new C71253l1());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.weight = 1.0f;
        SnsMethodCalculate.markStartTimeMs("getSmaller_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        SnsMethodCalculate.markStartTimeMs("access$getSmaller_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C13601g<Integer> gVar2 = f286641G;
        SnsMethodCalculate.markEndTimeMs("access$getSmaller_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int intValue = ((Number) ((C36570n) gVar2).getValue()).intValue();
        SnsMethodCalculate.markEndTimeMs("getSmaller_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
        layoutParams3.setMarginEnd(intValue);
        layoutParams3.gravity = 16;
        linearLayout4.addView(getNickNameText(), layoutParams3);
        getWeComTagImage().setId(C0966R.C0970id.hn4);
        linearLayout4.addView(getWeComTagImage(), new LinearLayout.LayoutParams(C76577a.m92157h(getContext(), C0966R.dimen.f3750d1), C76577a.m92157h(getContext(), C0966R.dimen.f3745cw)));
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams4.f44462q = 0;
        layoutParams4.f44449h = 0;
        String str4 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion";
        layoutParams4.setMargins(0, 0, C76577a.m92157h(getContext(), C0966R.dimen.f3961lj), 0);
        C13604l lVar4 = new C13604l(linearLayout4, layoutParams4);
        SnsMethodCalculate.markEndTimeMs("buildNickNameLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(lVar4, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z2 = C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) == 1;
        SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z2) {
            SnsMethodCalculate.markStartTimeMs("buildDebugTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams5.topMargin = pVar.mo137033i();
            layoutParams5.bottomMargin = pVar.mo137033i();
            layoutParams5.f44451i = C0966R.C0970id.nq9;
            C13604l lVar5 = new C13604l(getDebugLabel(), layoutParams5);
            SnsMethodCalculate.markEndTimeMs("buildDebugTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            mo137009i(lVar5, getRightPanelLayout());
        }
        SnsMethodCalculate.markStartTimeMs("buildContentTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        linearLayout5.setId(C0966R.C0970id.c29);
        linearLayout5.setOrientation(1);
        String str5 = "setupRightPanelDetailLayout";
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = mo137011n(3);
        linearLayout5.addView(getContentText(), layoutParams6);
        ConstraintLayout.LayoutParams layoutParams7 = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams7.f44462q = 0;
        SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z3 = C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) == 1;
        SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z3) {
            layoutParams7.f44451i = C0966R.C0970id.oio;
        } else {
            layoutParams7.f44451i = C0966R.C0970id.nq9;
        }
        getContentText().setStateChangeListener(new C97726j());
        C13604l lVar6 = new C13604l(linearLayout5, layoutParams7);
        SnsMethodCalculate.markEndTimeMs("buildContentTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(lVar6, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("processCustomLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C13604l<View, ConstraintLayout.LayoutParams> k = mo81009k();
        ((View) k.f38555d).setId(C0966R.C0970id.nq7);
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) k.f38556e;
        layoutParams8.f44462q = 0;
        layoutParams8.f44451i = C0966R.C0970id.c29;
        if (getViewType() != 6) {
            SnsMethodCalculate.markStartTimeMs("getMiddle_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getMiddle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C13601g<Integer> gVar3 = f286645K;
            SnsMethodCalculate.markEndTimeMs("access$getMiddle_Padding$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            int intValue2 = ((Number) ((C36570n) gVar3).getValue()).intValue();
            SnsMethodCalculate.markEndTimeMs("getMiddle_Padding", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            i = 0;
            ((ConstraintLayout.LayoutParams) k.f38556e).setMargins(0, intValue2, 0, pVar.mo137033i());
        } else {
            i = 0;
        }
        ((View) k.f38555d).setId(C0966R.C0970id.nq7);
        ConstraintLayout.LayoutParams layoutParams9 = (ConstraintLayout.LayoutParams) k.f38556e;
        layoutParams9.f44462q = i;
        layoutParams9.f44451i = C0966R.C0970id.c29;
        SnsMethodCalculate.markEndTimeMs("processCustomLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(k, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildFeedAboutLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        linearLayout6.setOrientation(1);
        linearLayout6.setGravity(16);
        linearLayout6.addView(this.f286664q);
        linearLayout6.addView(this.f286665r);
        linearLayout6.addView(this.f286666s);
        linearLayout6.setId(C0966R.C0970id.nq8);
        ConstraintLayout.LayoutParams layoutParams10 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams10.f44441d = 0;
        layoutParams10.f44451i = C0966R.C0970id.nq7;
        C13604l lVar7 = new C13604l(linearLayout6, layoutParams10);
        SnsMethodCalculate.markEndTimeMs("buildFeedAboutLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(lVar7, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildBottomLineLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        LinearLayout linearLayout7 = new LinearLayout(getContext());
        linearLayout7.setOrientation(0);
        linearLayout7.setGravity(16);
        LinearLayout linearLayout8 = linearLayout3;
        String str6 = str3;
        String str7 = str5;
        long j = currentTimeMillis;
        String str8 = "MicroMsg.Improve.TimelineItemBuild";
        this.f286662o = m126020l(this, true, C0966R.color.FG_2, C0966R.dimen.f3957lf, true, 0, 0, (String) null, 112, (Object) null);
        LinearLayout linearLayout9 = linearLayout7;
        linearLayout9.addView(this.f286662o, new LinearLayout.LayoutParams(-2, -2));
        linearLayout9.addView(this.f286667t);
        linearLayout9.addView(this.f286668u);
        linearLayout9.addView(this.f286670w);
        LinearLayout linearLayout10 = new LinearLayout(getContext());
        linearLayout10.setOrientation(0);
        linearLayout10.setGravity(16);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -2);
        layoutParams11.weight = 1.0f;
        C13598b0 b0Var = C13598b0.f38549a;
        linearLayout10.addView(linearLayout9, layoutParams11);
        linearLayout10.addView(this.f286669v);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setGravity(16);
        relativeLayout.setId(C0966R.C0970id.nq5);
        getCommentImage().setId(C0966R.C0970id.f5746nh);
        getCommentImage().setImageDrawable(C74942w4.m89785b(getContext(), C0966R.attr.a1n));
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(mo137011n(32), mo137011n(20));
        layoutParams12.setMargins(mo137011n(10), 0, 0, 0);
        layoutParams12.addRule(21, -1);
        layoutParams12.addRule(15, -1);
        relativeLayout.addView(getCommentImage(), layoutParams12);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams13.setMarginEnd(C76577a.m92157h(getContext(), C0966R.dimen.f3753d4));
        layoutParams13.addRule(15, -1);
        relativeLayout.addView(linearLayout10, layoutParams13);
        ConstraintLayout.LayoutParams layoutParams14 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams14.f44441d = 0;
        layoutParams14.f44447g = 0;
        layoutParams14.f44451i = C0966R.C0970id.nq8;
        layoutParams14.setMargins(0, pVar.mo137032h(), 0, 0);
        C13604l lVar8 = new C13604l(relativeLayout, layoutParams14);
        SnsMethodCalculate.markEndTimeMs("buildBottomLineLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(lVar8, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ConstraintLayout.LayoutParams layoutParams15 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams15.f44441d = 0;
        layoutParams15.f44447g = 0;
        layoutParams15.f44451i = C0966R.C0970id.nq5;
        C13604l lVar9 = new C13604l(this.f286671x, layoutParams15);
        SnsMethodCalculate.markEndTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(lVar9, getRightPanelLayout());
        SnsMethodCalculate.markStartTimeMs("buildTip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        LinearLayout linearLayout11 = new LinearLayout(getContext());
        linearLayout11.setOrientation(1);
        linearLayout11.setGravity(16);
        linearLayout11.setId(C0966R.C0970id.nqa);
        linearLayout11.addView(this.f286672y, getItemTipParam());
        linearLayout11.addView(this.f286673z, getItemTipParam());
        ConstraintLayout.LayoutParams layoutParams16 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams16.f44441d = 0;
        layoutParams16.f44447g = 0;
        layoutParams16.f44451i = C0966R.C0970id.nq6;
        C13604l lVar10 = new C13604l(linearLayout11, layoutParams16);
        SnsMethodCalculate.markEndTimeMs("buildTip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        mo137009i(lVar10, getRightPanelLayout());
        SnsMethodCalculate.markEndTimeMs(str7, "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        String str9 = str4;
        SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", str9);
        String str10 = str;
        String str11 = str2;
        SnsMethodCalculate.markStartTimeMs(str11, str10);
        boolean z4 = C102087b.f300617d;
        SnsMethodCalculate.markEndTimeMs(str11, str10);
        SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", str9);
        SnsMethodCalculate.markStartTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI$DefaultImpls");
        int i2 = z4 ? -2 : -1;
        Log.m105924i(str8, "getContentLayoutParams: enableLargeUI=" + z4 + ", lp width:" + i2);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(i2, -2);
        if (z4) {
            layoutParams17.gravity = 1;
        } else {
            layoutParams17.gravity = 0;
        }
        SnsMethodCalculate.markEndTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI$DefaultImpls");
        SnsMethodCalculate.markEndTimeMs("getContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        m126019j(this, new C13604l(linearLayout8, layoutParams17), (ViewGroup) null, 2, (Object) null);
        SnsMethodCalculate.markStartTimeMs("buildDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        view.setBackgroundColor(C76577a.m92153d(MMApplicationContext.getContext(), C0966R.color.BW_90));
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams18.setMargins(0, pVar.mo137030f(), 0, 0);
        C13604l lVar11 = new C13604l(view, layoutParams18);
        SnsMethodCalculate.markEndTimeMs("buildDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        m126019j(this, lVar11, (ViewGroup) null, 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs(str6, "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105924i(str8, "buildItemView cost:" + (currentTimeMillis2 - j));
    }

    private final LinearLayout.LayoutParams getItemTipParam() {
        SnsMethodCalculate.markStartTimeMs("getItemTipParam", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C97717p pVar = f286637C;
        layoutParams.setMargins(0, pVar.mo137032h(), 0, pVar.mo137026b());
        SnsMethodCalculate.markEndTimeMs("getItemTipParam", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return layoutParams;
    }

    /* renamed from: j */
    public static /* synthetic */ void m126019j(C97712i iVar, C13604l lVar, ViewGroup viewGroup, int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        if (obj == null) {
            if ((i & 2) != 0) {
                viewGroup = iVar;
            }
            iVar.mo137009i(lVar, viewGroup);
            SnsMethodCalculate.markEndTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCustomView");
        SnsMethodCalculate.markEndTimeMs("addCustomView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        throw unsupportedOperationException;
    }

    /* renamed from: l */
    public static TextView m126020l(C97712i iVar, boolean z, int i, int i2, boolean z2, int i3, int i4, String str, int i5, Object obj) {
        SnsMethodCalculate.markStartTimeMs("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        if (obj == null) {
            if ((i5 & 8) != 0) {
                z2 = false;
            }
            if ((i5 & 16) != 0) {
                i3 = -1;
            }
            if ((i5 & 32) != 0) {
                i4 = 0;
            }
            if ((i5 & 64) != 0) {
                str = "";
            }
            iVar.getClass();
            SnsMethodCalculate.markStartTimeMs("createImproveTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            C87412m.m108594g(str, "contentDescription");
            Log.m105924i("MicroMsg.Improve.TimelineItemBuild", "createImproveTextView: ");
            Context context = iVar.getContext();
            C87412m.m108593f(context, "context");
            ImproveTextView improveTextView = new ImproveTextView(context);
            if (z) {
                improveTextView.setSingleLine();
            }
            improveTextView.setTextColor(C76577a.m92153d(MMApplicationContext.getContext(), i));
            if (z2) {
                SnsMethodCalculate.markStartTimeMs("setSpecialTextSize", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
                improveTextView.setTextSize(0, Math.min(((float) C76577a.m92155f(iVar.getContext(), i2)) * C76577a.m92168s(iVar.getContext()), (float) C76577a.m92164o(iVar.getContext(), i2)));
                SnsMethodCalculate.markEndTimeMs("setSpecialTextSize", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            } else {
                improveTextView.setTextSize(0, (float) C76577a.m92164o(iVar.getContext(), i2));
            }
            if (i3 > 0) {
                improveTextView.setId(i3);
            }
            if (i4 != 0) {
                improveTextView.setBackgroundResource(i4);
            }
            if (!C87412m.m108589b(str, "")) {
                improveTextView.setContentDescription(str);
            }
            SnsMethodCalculate.markEndTimeMs("createImproveTextView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            SnsMethodCalculate.markEndTimeMs("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            return improveTextView;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createImproveTextView");
        SnsMethodCalculate.markEndTimeMs("createImproveTextView$default", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        throw unsupportedOperationException;
    }

    public final View getAddressStub() {
        SnsMethodCalculate.markStartTimeMs("getAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        View view = this.f286665r;
        SnsMethodCalculate.markEndTimeMs("getAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final View getAppNameStub() {
        SnsMethodCalculate.markStartTimeMs("getAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        View view = this.f286670w;
        SnsMethodCalculate.markEndTimeMs("getAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final SnsAvatarImageView getAvatarImage() {
        SnsMethodCalculate.markStartTimeMs("getAvatarImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        SnsAvatarImageView snsAvatarImageView = (SnsAvatarImageView) ((C36570n) this.f286656f).getValue();
        SnsMethodCalculate.markEndTimeMs("getAvatarImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return snsAvatarImageView;
    }

    public final LinearLayout getCommentContainer() {
        SnsMethodCalculate.markStartTimeMs("getCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        LinearLayout linearLayout = this.f286671x;
        SnsMethodCalculate.markEndTimeMs("getCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return linearLayout;
    }

    public final ImageView getCommentImage() {
        SnsMethodCalculate.markStartTimeMs("getCommentImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ImageView imageView = (ImageView) ((C36570n) this.f286663p).getValue();
        SnsMethodCalculate.markEndTimeMs("getCommentImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return imageView;
    }

    public final ViewGroup getContentContainer() {
        SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ViewGroup viewGroup = this.f286655e;
        SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return viewGroup;
    }

    public final ImproveContentView getContentText() {
        SnsMethodCalculate.markStartTimeMs("getContentText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ImproveContentView improveContentView = (ImproveContentView) ((C36570n) this.f286661n).getValue();
        SnsMethodCalculate.markEndTimeMs("getContentText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return improveContentView;
    }

    public final ImproveTextView getDebugLabel() {
        SnsMethodCalculate.markStartTimeMs("getDebugLabel", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ImproveTextView improveTextView = (ImproveTextView) ((C36570n) this.f286659i).getValue();
        SnsMethodCalculate.markEndTimeMs("getDebugLabel", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return improveTextView;
    }

    public final View getDelTextStub() {
        SnsMethodCalculate.markStartTimeMs("getDelTextStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        View view = this.f286669v;
        SnsMethodCalculate.markEndTimeMs("getDelTextStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final View getDivider() {
        SnsMethodCalculate.markStartTimeMs("getDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        View view = this.f286653B;
        SnsMethodCalculate.markEndTimeMs("getDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final ViewStub getFinderPostStub() {
        SnsMethodCalculate.markStartTimeMs("getFinderPostStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ViewStub viewStub = this.f286672y;
        SnsMethodCalculate.markEndTimeMs("getFinderPostStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return viewStub;
    }

    public final View getGameAboutStub() {
        SnsMethodCalculate.markStartTimeMs("getGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        View view = this.f286664q;
        SnsMethodCalculate.markEndTimeMs("getGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final View getGroupImageStub() {
        SnsMethodCalculate.markStartTimeMs("getGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        View view = this.f286667t;
        SnsMethodCalculate.markEndTimeMs("getGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final ViewStub getItemErrorStub() {
        SnsMethodCalculate.markStartTimeMs("getItemErrorStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ViewStub viewStub = this.f286673z;
        SnsMethodCalculate.markEndTimeMs("getItemErrorStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return viewStub;
    }

    public final C0125s getLifecycleOwner() {
        SnsMethodCalculate.markStartTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C0125s sVar = this.f286654d;
        SnsMethodCalculate.markEndTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return sVar;
    }

    public final ViewGroup.LayoutParams getMatchWidthWrapHeightParams() {
        SnsMethodCalculate.markStartTimeMs("getMatchWidthWrapHeightParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        SnsMethodCalculate.markEndTimeMs("getMatchWidthWrapHeightParams", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return layoutParams;
    }

    public final AsyncTextView getNickNameText() {
        SnsMethodCalculate.markStartTimeMs("getNickNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        AsyncTextView asyncTextView = (AsyncTextView) ((C36570n) this.f286658h).getValue();
        SnsMethodCalculate.markEndTimeMs("getNickNameText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return asyncTextView;
    }

    public final TextView getPublishTimeText() {
        SnsMethodCalculate.markStartTimeMs("getPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        TextView textView = this.f286662o;
        SnsMethodCalculate.markEndTimeMs("getPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return textView;
    }

    public final ConstraintLayout getRightPanelLayout() {
        SnsMethodCalculate.markStartTimeMs("getRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ConstraintLayout constraintLayout = (ConstraintLayout) ((C36570n) this.f286657g).getValue();
        SnsMethodCalculate.markEndTimeMs("getRightPanelLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return constraintLayout;
    }

    public final View getTypeIcon() {
        SnsMethodCalculate.markStartTimeMs("getTypeIcon", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        View view = this.f286668u;
        SnsMethodCalculate.markEndTimeMs("getTypeIcon", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    public final ImproveUnreadTierView getUnreadLayout() {
        SnsMethodCalculate.markStartTimeMs("getUnreadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ImproveUnreadTierView improveUnreadTierView = (ImproveUnreadTierView) ((C36570n) this.f286652A).getValue();
        SnsMethodCalculate.markEndTimeMs("getUnreadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return improveUnreadTierView;
    }

    public abstract int getViewType();

    public final C14093e getWeComTagImage() {
        SnsMethodCalculate.markStartTimeMs("getWeComTagImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C14093e eVar = (C14093e) ((C36570n) this.f286660j).getValue();
        SnsMethodCalculate.markEndTimeMs("getWeComTagImage", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return eVar;
    }

    public final View getWithFriendStub() {
        SnsMethodCalculate.markStartTimeMs("getWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        View view = this.f286666s;
        SnsMethodCalculate.markEndTimeMs("getWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return view;
    }

    /* renamed from: i */
    public final void mo137009i(C13604l<? extends View, ? extends ViewGroup.LayoutParams> lVar, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("addCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(lVar, "pair");
        C87412m.m108594g(viewGroup, "view");
        viewGroup.addView((View) lVar.f38555d, (ViewGroup.LayoutParams) lVar.f38556e);
        SnsMethodCalculate.markEndTimeMs("addCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    /* renamed from: k */
    public abstract C13604l<View, ConstraintLayout.LayoutParams> mo81009k();

    /* renamed from: m */
    public final ViewStub mo137010m(int i) {
        SnsMethodCalculate.markStartTimeMs("createViewStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        ViewStub viewStub = new ViewStub(getContext());
        viewStub.setLayoutInflater(C85868k2.m106137b(getContext()));
        viewStub.setLayoutResource(i);
        SnsMethodCalculate.markEndTimeMs("createViewStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return viewStub;
    }

    /* renamed from: n */
    public final int mo137011n(int i) {
        SnsMethodCalculate.markStartTimeMs("dip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        int b = C76577a.m92151b(MMApplicationContext.getContext(), i);
        SnsMethodCalculate.markEndTimeMs("dip", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return b;
    }

    public abstract String name();

    /* renamed from: o */
    public int mo137012o(boolean z) {
        int i;
        SnsMethodCalculate.markStartTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        SnsMethodCalculate.markStartTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI$DefaultImpls");
        if (z) {
            i = f286637C.mo137028d();
            SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI$DefaultImpls");
        } else {
            i = -1;
            SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI$DefaultImpls");
        }
        SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        return i;
    }

    public final void setAddressStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f286665r = view;
        SnsMethodCalculate.markEndTimeMs("setAddressStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setAppNameStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f286670w = view;
        SnsMethodCalculate.markEndTimeMs("setAppNameStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setCommentContainer(LinearLayout linearLayout) {
        SnsMethodCalculate.markStartTimeMs("setCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(linearLayout, "<set-?>");
        this.f286671x = linearLayout;
        SnsMethodCalculate.markEndTimeMs("setCommentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setContentContainer(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        this.f286655e = viewGroup;
        SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setDelTextStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setDelTextStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f286669v = view;
        SnsMethodCalculate.markEndTimeMs("setDelTextStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setFinderPostStub(ViewStub viewStub) {
        SnsMethodCalculate.markStartTimeMs("setFinderPostStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(viewStub, "<set-?>");
        this.f286672y = viewStub;
        SnsMethodCalculate.markEndTimeMs("setFinderPostStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setGameAboutStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f286664q = view;
        SnsMethodCalculate.markEndTimeMs("setGameAboutStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setGroupImageStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f286667t = view;
        SnsMethodCalculate.markEndTimeMs("setGroupImageStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setItemErrorStub(ViewStub viewStub) {
        SnsMethodCalculate.markStartTimeMs("setItemErrorStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(viewStub, "<set-?>");
        this.f286673z = viewStub;
        SnsMethodCalculate.markEndTimeMs("setItemErrorStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setPublishTimeText(TextView textView) {
        SnsMethodCalculate.markStartTimeMs("setPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        this.f286662o = textView;
        SnsMethodCalculate.markEndTimeMs("setPublishTimeText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setTypeIcon(View view) {
        SnsMethodCalculate.markStartTimeMs("setTypeIcon", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f286668u = view;
        SnsMethodCalculate.markEndTimeMs("setTypeIcon", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }

    public final void setWithFriendStub(View view) {
        SnsMethodCalculate.markStartTimeMs("setWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        C87412m.m108594g(view, "<set-?>");
        this.f286666s = view;
        SnsMethodCalculate.markEndTimeMs("setWithFriendStub", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
    }
}
