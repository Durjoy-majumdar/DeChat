package oo1;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C0077k0;
import ak1.C54067f0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.profile.widget.DemoFooter;
import com.tencent.p014mm.plugin.finder.profile.widget.DemoHeader;
import com.tencent.p014mm.plugin.finder.view.notice.HighLightGreenBgView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeCouponMiniInfoView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeGetCouponView;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import er1.C58784w3;
import er1.C7776a;
import er1.C7802g1;
import f40.C86709a0;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import hs1.C8732a;
import ht1.C8777j5;
import ht1.C8797q5;
import ht1.C8817y2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import je1.C9315i0;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import nj3.C76912y0;
import nr3.C89059e;
import p204mr.C61568m;
import p565ir.C60606n;
import pe3.C89349b;
import qo3.C101218e0;
import qo3.C77407n;
import qq3.C63318b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C49098d51;
import te3.C49236e51;
import te3.C49359f1;
import te3.C49712hj1;
import te3.C50523nc3;
import te3.C51559uk1;
import tf0.C13887q1;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;
import zp3.C23564m;
import zp3.C79406f;

/* renamed from: oo1.d0 */
public final class C11614d0 implements C8797q5 {

    /* renamed from: a */
    public final String f34036a;

    /* renamed from: b */
    public final Context f34037b;

    /* renamed from: c */
    public final boolean f34038c;

    /* renamed from: d */
    public final C49712hj1 f34039d;

    /* renamed from: e */
    public final int f34040e;

    /* renamed from: f */
    public C101218e0 f34041f;

    /* renamed from: g */
    public TextView f34042g;

    /* renamed from: h */
    public TextView f34043h;

    /* renamed from: i */
    public RecyclerView f34044i;

    /* renamed from: j */
    public final List<C11618c> f34045j;

    /* renamed from: k */
    public C11619d f34046k;

    /* renamed from: l */
    public WxRefreshLayout f34047l;

    /* renamed from: m */
    public C9315i0 f34048m;

    /* renamed from: n */
    public C49236e51 f34049n;

    /* renamed from: o */
    public C77407n f34050o;

    /* renamed from: p */
    public final C11616b f34051p;

    /* renamed from: q */
    public C8797q5.C8799b f34052q;

    /* renamed from: r */
    public String f34053r;

    /* renamed from: oo1.d0$a */
    public enum C11615a {
        Mini,
        Big
    }

    /* renamed from: oo1.d0$b */
    public final class C11616b extends RecyclerView.C0131u {

        /* renamed from: d */
        public final float f34057d;

        /* renamed from: e */
        public float f34058e;

        /* renamed from: f */
        public float f34059f;

        /* renamed from: g */
        public boolean f34060g;

        /* renamed from: h */
        public boolean f34061h;

        /* renamed from: oo1.d0$b$a */
        public static final class C11617a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ C11616b f34063d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView.C16631z f34064e;

            public C11617a(C11616b bVar, RecyclerView.C16631z zVar) {
                this.f34063d = bVar;
                this.f34064e = zVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                C11616b bVar = this.f34063d;
                RecyclerView.C16631z zVar = this.f34064e;
                C87412m.m108593f(zVar, "viewHolder");
                bVar.mo11527b(floatValue, (C11619d.C11620a) zVar);
            }
        }

        public C11616b() {
            this.f34057d = (float) C79406f.m96347a(C11614d0.this.f34037b, -138.0f);
        }

        /* renamed from: a */
        public final void mo11526a() {
            RecyclerView recyclerView = C11614d0.this.f34044i;
            if (recyclerView != null) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.C16631z P0 = recyclerView.mo17031P0(recyclerView.getChildAt(i));
                    if (P0 instanceof C11619d.C11620a) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((C11619d.C11620a) P0).f34071A.getTranslationX(), 0.0f});
                        C87412m.m108593f(ofFloat, "ofFloat(viewHolder.parentLid.translationX, 0f)");
                        ofFloat.setDuration(400);
                        ofFloat.addUpdateListener(new C11617a(this, P0));
                        ofFloat.start();
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo11527b(float f, C11619d.C11620a aVar) {
            aVar.f34071A.setTranslationX(Math.max(Math.min(f, 0.0f), this.f34057d));
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            View D0;
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "e");
            RecyclerView recyclerView2 = C11614d0.this.f34044i;
            if (recyclerView2 != null && (D0 = recyclerView2.mo17019D0(this.f34058e, this.f34059f)) != null) {
                RecyclerView recyclerView3 = C11614d0.this.f34044i;
                RecyclerView.C16631z P0 = recyclerView3 != null ? recyclerView3.mo17031P0(D0) : null;
                if (P0 instanceof C11619d.C11620a) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                return;
                            }
                        } else if (this.f34060g && this.f34061h) {
                            mo11527b(motionEvent.getX() - this.f34058e, (C11619d.C11620a) P0);
                            return;
                        } else {
                            return;
                        }
                    }
                    C11619d.C11620a aVar = (C11619d.C11620a) P0;
                    float max = Math.max(Math.min(motionEvent.getX() - this.f34058e, 0.0f), this.f34057d);
                    float f = this.f34057d;
                    if (!(max < f / ((float) 2))) {
                        f = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{max, f});
                    C87412m.m108593f(ofFloat, "ofFloat(from, to)");
                    ofFloat.setDuration(400);
                    ofFloat.addUpdateListener(new C11653e0(this, aVar));
                    ofFloat.start();
                    this.f34058e = 0.0f;
                    this.f34059f = 0.0f;
                    this.f34060g = false;
                    this.f34061h = false;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
            if (r3 != 3) goto L_0x0059;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo6022e(androidx.recyclerview.widget.RecyclerView r3, android.view.MotionEvent r4) {
            /*
                r2 = this;
                java.lang.String r0 = "rv"
                gy3.C87412m.m108594g(r3, r0)
                java.lang.String r3 = "e"
                gy3.C87412m.m108594g(r4, r3)
                int r3 = r4.getActionMasked()
                if (r3 == 0) goto L_0x004d
                r0 = 1
                if (r3 == r0) goto L_0x0042
                r1 = 2
                if (r3 == r1) goto L_0x001b
                r4 = 3
                if (r3 == r4) goto L_0x0042
                goto L_0x0059
            L_0x001b:
                boolean r3 = r2.f34060g
                if (r3 != 0) goto L_0x0059
                r2.f34060g = r0
                float r3 = r4.getX()
                float r1 = r2.f34058e
                float r3 = r3 - r1
                float r3 = java.lang.Math.abs(r3)
                float r4 = r4.getY()
                float r1 = r2.f34059f
                float r4 = r4 - r1
                float r4 = java.lang.Math.abs(r4)
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 <= 0) goto L_0x003e
                r2.f34061h = r0
                goto L_0x0059
            L_0x003e:
                r2.mo11526a()
                goto L_0x0059
            L_0x0042:
                r3 = 0
                r2.f34058e = r3
                r2.f34059f = r3
                r3 = 0
                r2.f34060g = r3
                r2.f34061h = r3
                goto L_0x0059
            L_0x004d:
                float r3 = r4.getX()
                r2.f34058e = r3
                float r3 = r4.getY()
                r2.f34059f = r3
            L_0x0059:
                boolean r3 = r2.f34061h
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C11614d0.C11616b.mo6022e(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: oo1.d0$c */
    public final class C11618c {

        /* renamed from: a */
        public final C49098d51 f34065a;

        /* renamed from: b */
        public C11615a f34066b = C11615a.Mini;

        public C11618c(C11614d0 d0Var, C49098d51 d512) {
            C51559uk1 a;
            C87412m.m108594g(d512, "real");
            this.f34065a = d512;
            d512 = !C7802g1.m7950b(d512) ? null : d512;
            if (d512 != null && (a = C7802g1.m7949a(d512)) != null) {
                C49359f1 f1Var = a.f142912z;
                boolean z = false;
                if (f1Var != null && !C7776a.m7931a(f1Var)) {
                    z = true;
                }
                if (z) {
                    this.f34066b = C11615a.Big;
                }
            }
        }
    }

    /* renamed from: oo1.d0$d */
    public final class C11619d extends RecyclerView.C16613e<C11620a> {

        /* renamed from: d */
        public final String f34067d;

        /* renamed from: e */
        public final boolean f34068e;

        /* renamed from: f */
        public final Context f34069f;

        /* renamed from: g */
        public final /* synthetic */ C11614d0 f34070g;

        /* renamed from: oo1.d0$d$a */
        public final class C11620a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final View f34071A;

            /* renamed from: B */
            public final HighLightGreenBgView f34072B;

            /* renamed from: C */
            public final TextView f34073C;

            /* renamed from: D */
            public final TextView f34074D;

            /* renamed from: E */
            public final TextView f34075E;

            /* renamed from: F */
            public final View f34076F;

            /* renamed from: G */
            public final NoticeStatusView f34077G;

            /* renamed from: H */
            public final View f34078H;

            /* renamed from: I */
            public final View f34079I;

            /* renamed from: J */
            public final NoticeCouponMiniInfoView f34080J;

            /* renamed from: K */
            public final NoticeGetCouponView f34081K;

            /* renamed from: z */
            public String f34082z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11620a(C11619d dVar, View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                View findViewById = view.findViewById(C0966R.C0970id.m5u);
                C87412m.m108593f(findViewById, "itemView.findViewById(R.id.parent_lid)");
                this.f34071A = findViewById;
                View findViewById2 = view.findViewById(C0966R.C0970id.nqx);
                C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.view_high_light)");
                this.f34072B = (HighLightGreenBgView) findViewById2;
                View findViewById3 = view.findViewById(C0966R.C0970id.m8f);
                C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.txv_date)");
                this.f34073C = (TextView) findViewById3;
                View findViewById4 = view.findViewById(C0966R.C0970id.m8g);
                C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.txv_desc)");
                this.f34074D = (TextView) findViewById4;
                View findViewById5 = view.findViewById(C0966R.C0970id.m8h);
                C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.txv_notice_count)");
                this.f34075E = (TextView) findViewById5;
                View findViewById6 = view.findViewById(C0966R.C0970id.m28);
                C87412m.m108593f(findViewById6, "itemView.findViewById(R.id.icon_more)");
                this.f34076F = findViewById6;
                View findViewById7 = view.findViewById(C0966R.C0970id.m7n);
                C87412m.m108593f(findViewById7, "itemView.findViewById(R.id.subscribe_layout)");
                this.f34077G = (NoticeStatusView) findViewById7;
                View findViewById8 = view.findViewById(C0966R.C0970id.haz);
                C87412m.m108593f(findViewById8, "itemView.findViewById(R.id.btn_anchor_revocation)");
                this.f34078H = findViewById8;
                View findViewById9 = view.findViewById(C0966R.C0970id.mt4);
                C87412m.m108593f(findViewById9, "itemView.findViewById(R.id.live_list_bottom_line)");
                this.f34079I = findViewById9;
                View findViewById10 = view.findViewById(C0966R.C0970id.n2a);
                C87412m.m108593f(findViewById10, "itemView.findViewById(R.id.mini_coupon_info)");
                this.f34080J = (NoticeCouponMiniInfoView) findViewById10;
                View findViewById11 = view.findViewById(C0966R.C0970id.aoh);
                C87412m.m108593f(findViewById11, "itemView.findViewById(R.id.big_coupon_info)");
                this.f34081K = (NoticeGetCouponView) findViewById11;
            }
        }

        public C11619d(C11614d0 d0Var, String str, boolean z, Context context) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(context, "context");
            this.f34070g = d0Var;
            this.f34067d = str;
            this.f34068e = z;
            this.f34069f = context;
        }

        /* renamed from: F4 */
        public static final void m11407F4(C11618c cVar, C11614d0 d0Var, C11620a aVar, C11619d dVar, int i) {
            String str;
            C11618c cVar2 = cVar;
            C11614d0 d0Var2 = d0Var;
            C51559uk1 a = C7802g1.m7949a(cVar2.f34065a);
            if (a != null && (str = a.f142894e) != null) {
                String str2 = cVar2.f34065a.f132122h;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                C11671n0 n0Var = new C11671n0(str, aVar, cVar, dVar, i);
                d0Var.getClass();
                C7335d c = C86312j.m106911c(C60606n.class);
                C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
                String str4 = d0Var2.f34036a;
                String O5 = C66785b.f191882e.mo90662O5();
                LinkedList linkedList = new LinkedList();
                linkedList.add(str);
                C13598b0 b0Var = C13598b0.f38549a;
                C60606n.C60607a.m70860d((C60606n) c, 0, 0, str4, O5, (C89349b) null, linkedList, str3, d0Var2.f34037b, false, n0Var, 256, (Object) null);
            }
        }

        public int getItemCount() {
            return ((ArrayList) this.f34070g.f34045j).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            String str;
            String str2;
            C11620a aVar = (C11620a) zVar;
            C87412m.m108594g(aVar, "holder");
            C11618c cVar = (C11618c) ((ArrayList) this.f34070g.f34045j).get(i);
            C51559uk1 a = C7802g1.m7949a(cVar.f34065a);
            aVar.f34082z = a != null ? a.f142894e : null;
            C49098d51 d512 = cVar.f34065a;
            boolean z = d512.f132127p == 1;
            String u = C58739j4.m68254u(C58739j4.f168176a, ((long) d512.f132118d) * 1000, (Boolean) null, false, 6, (Object) null);
            C85875k4.m106189j0(aVar.f34073C.getPaint(), 0.8f);
            aVar.f34073C.setText(this.f34069f.getResources().getString(C0966R.string.d5x, new Object[]{u}));
            String str3 = cVar.f34065a.f132121g;
            if (str3 == null || str3.length() == 0) {
                aVar.f34074D.setVisibility(8);
                aVar.f34074D.setText("");
            } else {
                aVar.f34074D.setVisibility(0);
                aVar.f34074D.setText(cVar.f34065a.f132121g);
            }
            C23564m.m28138h(aVar.f34081K, new C11655f0(cVar));
            int ordinal = cVar.f34066b.ordinal();
            if (ordinal == 0) {
                NoticeCouponMiniInfoView.m4339a(aVar.f34080J, C7802g1.m7950b(cVar.f34065a), C7802g1.m7949a(cVar.f34065a), !this.f34068e, false, false, new C11657g0(cVar, this.f34070g, aVar, this, i), 24, (Object) null);
                aVar.f34081K.setVisibility(8);
            } else if (ordinal == 1) {
                aVar.f34080J.setVisibility(8);
                aVar.f34081K.f18310i.setTextSize(0, this.f34069f.getResources().getDimension(C0966R.dimen.f3684bd));
                C11659h0 h0Var = r0;
                C11659h0 h0Var2 = new C11659h0(cVar, this.f34070g, aVar, this, i);
                aVar.f34081K.mo5015a(C7802g1.m7949a(cVar.f34065a), h0Var);
            }
            if (this.f34068e) {
                aVar.f34075E.setVisibility(0);
                View view = aVar.f34076F;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter$ItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter$ItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                aVar.f34077G.setVisibility(8);
                aVar.f34078H.setOnClickListener(new C11661i0(this.f34070g, cVar));
                aVar.f34071A.setOnClickListener(new C11663j0(this, cVar));
                C50523nc3 nc32 = cVar.f34065a.f132128q;
                if (nc32 != null && nc32.f138532d) {
                    TextView textView = aVar.f34075E;
                    Resources resources = this.f34069f.getResources();
                    Object[] objArr = new Object[1];
                    C50523nc3 nc33 = cVar.f34065a.f132128q;
                    objArr[0] = String.valueOf(nc33 != null ? nc33.f138537i : 0);
                    textView.setText(resources.getString(C0966R.string.mqi, objArr));
                    return;
                }
                aVar.f34075E.setText(this.f34069f.getResources().getString(C0966R.string.d5v, new Object[]{String.valueOf(cVar.f34065a.f132123i)}));
                return;
            }
            if (!z) {
                C11614d0 d0Var = this.f34070g;
                NoticeStatusView noticeStatusView = aVar.f34077G;
                C49098d51 d513 = cVar.f34065a;
                String str4 = this.f34067d;
                d0Var.getClass();
                Class cls = C61212e.class;
                ((C61212e) C86312j.m106911c(cls)).o30(noticeStatusView, d0Var.f34040e == 102 ? "live_reserve_gzh_profile" : "live_reserve_profile");
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(noticeStatusView, 8, 25653);
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(noticeStatusView, 32, 25652);
                ((C61212e) C86312j.m106911c(cls)).mo86149PM(noticeStatusView, C90364q0.m113149h(C90364q0.m113147f(new C13604l("finder_username", str4), new C13604l("comment_scene", "temp_5"), new C13604l("live_notice_id", d513.f132122h), new C13604l("show_type", 1)), C58784w3.f168295a.mo83877J()));
                ((C61212e) C86312j.m106911c(cls)).E60(noticeStatusView, new C11683t0(d513));
                C104289g gVar = new C104289g();
                gVar.mo145967r("source_type", Integer.valueOf(this.f34070g.f34040e == 102 ? 2 : 1));
                C104289g gVar2 = new C104289g();
                C51559uk1 a2 = C7802g1.m7949a(cVar.f34065a);
                gVar2.put("coupon_id", a2 != null ? a2.f142894e : null);
                gVar2.mo145953n("ui_position", 2);
                C7335d c = C86312j.m106911c(C61568m.class);
                C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
                C61568m mVar = (C61568m) c;
                C0077k0 k0Var = C0077k0.ExposeProfile;
                String str5 = this.f34070g.f34036a;
                C49098d51 d514 = cVar.f34065a;
                String str6 = (d514 == null || (str2 = d514.f132121g) == null) ? "" : str2;
                String gVar3 = gVar.toString();
                C49098d51 d515 = cVar.f34065a;
                C61568m.C61569a.m72263a(mVar, k0Var, str5, 0, 0, "temp_5", (String) null, (Long) null, (String) null, (String) null, str6, gVar3, (d515 == null || (str = d515.f132122h) == null) ? "" : str, gVar2.toString(), 0, 0, 25056, (Object) null);
                aVar.f34071A.setOnClickListener(new C11665k0(this, cVar));
            }
            aVar.f34075E.setVisibility(8);
            View view3 = aVar.f34076F;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter$ItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$RecyclerAdapter$ItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            aVar.f34077G.setVisibility(0);
            aVar.f34077G.mo5009f(this.f34070g.f34036a, new C11667l0(cVar));
            aVar.f34077G.setProgressDoneAndNextAction(new C11669m0(this.f34070g, cVar, z, this, i));
            HighLightGreenBgView highLightGreenBgView = aVar.f34072B;
            C53973z1 z1Var = highLightGreenBgView.f18301d;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            View view5 = highLightGreenBgView.f18302e;
            if (view5 != null) {
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(Float.valueOf(0.0f));
                View view6 = view5;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView", "resetFlashing", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/view/notice/HighLightGreenBgView", "resetFlashing", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (C87412m.m108589b(this.f34070g.f34053r, cVar.f34065a.f132122h)) {
                HighLightGreenBgView highLightGreenBgView2 = aVar.f34072B;
                highLightGreenBgView2.getClass();
                highLightGreenBgView2.f18301d = C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C8732a(highLightGreenBgView2, (C15601d<? super C8732a>) null), 3, (Object) null);
                this.f34070g.f34053r = "";
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(this.f34069f).inflate(C0966R.C0971layout.cll, (ViewGroup) null);
            C87412m.m108593f(inflate, "from(context)\n          …ist_widget_ui_item, null)");
            return new C11620a(this, inflate);
        }
    }

    /* renamed from: oo1.d0$e */
    public static final class C11621e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11614d0 f34083d;

        public C11621e(C11614d0 d0Var) {
            this.f34083d = d0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$showList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C11614d0 d0Var = this.f34083d;
            C49236e51 e512 = d0Var.f34049n;
            if (e512 != null && e512.f132699f == e512.f132700g) {
                C77407n nVar = new C77407n(d0Var.f34037b, 1, false);
                d0Var.f34050o = nVar;
                nVar.f225771i = new C11688u0(d0Var);
                nVar.f225782p = new C11690v0(d0Var);
                nVar.mo107573q();
            } else {
                C11614d0.m11397c(d0Var, (C11618c) null, 3);
                this.f34083d.mo11525f();
                C11619d dVar = this.f34083d.f34046k;
                if (dVar != null) {
                    dVar.notifyDataSetChanged();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$showList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: oo1.d0$f */
    public static final class C11622f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11614d0 f34084d;

        public C11622f(C11614d0 d0Var) {
            this.f34084d = d0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$showList$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101218e0 e0Var = this.f34084d.f34041f;
            if (e0Var != null) {
                e0Var.mo140680z();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveListWidget$showList$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: oo1.d0$g */
    public static final class C11623g implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ C11614d0 f34085a;

        public C11623g(C11614d0 d0Var) {
            this.f34085a = d0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r8 = r8.f34065a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3374a(boolean r8) {
            /*
                r7 = this;
                oo1.d0 r0 = r7.f34085a
                java.lang.String r3 = r0.f34036a
                java.util.List<oo1.d0$c> r8 = r0.f34045j
                java.lang.Object r8 = sx3.C110818d0.m150916N(r8)
                oo1.d0$c r8 = (oo1.C11614d0.C11618c) r8
                if (r8 == 0) goto L_0x0016
                te3.d51 r8 = r8.f34065a
                if (r8 == 0) goto L_0x0016
                int r8 = r8.f132118d
                r4 = r8
                goto L_0x0018
            L_0x0016:
                r8 = 0
                r4 = 0
            L_0x0018:
                r5 = 2
                r6 = 0
                r1 = 1
                r2 = 0
                oo1.C11614d0.m11399e(r0, r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C11614d0.C11623g.mo3374a(boolean):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
            r1 = r1.f34065a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLoadMore() {
            /*
                r7 = this;
                oo1.d0 r0 = r7.f34085a
                java.lang.String r3 = r0.f34036a
                java.util.List<oo1.d0$c> r1 = r0.f34045j
                java.lang.Object r1 = sx3.C110818d0.m150925W(r1)
                oo1.d0$c r1 = (oo1.C11614d0.C11618c) r1
                if (r1 == 0) goto L_0x0016
                te3.d51 r1 = r1.f34065a
                if (r1 == 0) goto L_0x0016
                int r1 = r1.f132118d
                r4 = r1
                goto L_0x0018
            L_0x0016:
                r1 = 0
                r4 = 0
            L_0x0018:
                r5 = 2
                r6 = 0
                r1 = 0
                r2 = 0
                oo1.C11614d0.m11399e(r0, r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C11614d0.C11623g.onLoadMore():void");
        }
    }

    /* renamed from: oo1.d0$h */
    public static final class C11624h implements C101218e0.C77394n {

        /* renamed from: a */
        public final /* synthetic */ C11614d0 f34086a;

        public C11624h(C11614d0 d0Var) {
            this.f34086a = d0Var;
        }

        public final void dismiss() {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.f34086a.f34045j).iterator();
            while (it.hasNext()) {
                arrayList.add(((C11618c) it.next()).f34065a);
            }
            C11614d0 d0Var = this.f34086a;
            C8797q5.C8799b bVar = d0Var.f34052q;
            if (bVar != null) {
                C49236e51 e512 = d0Var.f34049n;
                bVar.mo9630a(arrayList, e512 != null ? e512.f132700g : 0);
            }
        }
    }

    public C11614d0(String str, Context context, boolean z, C49712hj1 hj12, int i, int i2, C8480h hVar) {
        i = (i2 & 16) != 0 ? 101 : i;
        C87412m.m108594g(str, "anchorFinderUsername");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(hj12, "contextObj");
        this.f34036a = str;
        this.f34037b = context;
        this.f34038c = z;
        this.f34039d = hj12;
        this.f34040e = i;
        this.f34045j = new ArrayList();
        this.f34051p = new C11616b();
        this.f34053r = "";
    }

    /* renamed from: c */
    public static final void m11397c(C11614d0 d0Var, C11618c cVar, int i) {
        String str;
        String str2;
        C49098d51 d512;
        C49098d51 d513;
        C50523nc3 nc32;
        String str3;
        C49098d51 d514;
        C49098d51 d515;
        String str4;
        C49098d51 d516;
        String str5;
        C49098d51 d517;
        String str6;
        C49098d51 d518;
        String str7;
        C49098d51 d519;
        String str8;
        C49098d51 d5110;
        String str9;
        C49098d51 d5111;
        String str10;
        C49098d51 d5112;
        String str11;
        C49098d51 d5113;
        C51559uk1 a;
        C49098d51 d5114;
        C11614d0 d0Var2 = d0Var;
        C11618c cVar2 = cVar;
        int i2 = i;
        d0Var.getClass();
        Class cls = C8817y2.class;
        C0077k0 k0Var = C0077k0.Cancle;
        C0077k0 k0Var2 = C0077k0.Book;
        Class cls2 = C13887q1.class;
        Class cls3 = C61568m.class;
        C104289g gVar = new C104289g();
        boolean z = true;
        gVar.mo145967r("source_type", Integer.valueOf(d0Var2.f34040e == 102 ? 2 : 1));
        boolean z2 = (cVar2 == null || (d5114 = cVar2.f34065a) == null || d5114.f132127p != 1) ? false : true;
        C104289g gVar2 = new C104289g();
        C49098d51 d5115 = null;
        gVar2.put("coupon_id", (cVar2 == null || (d5113 = cVar2.f34065a) == null || (a = C7802g1.m7949a(d5113)) == null) ? null : a.f142894e);
        gVar2.mo145953n("ui_position", 2);
        C13598b0 b0Var = C13598b0.f38549a;
        if (i2 != 1) {
            if (i2 == 2) {
                C7335d c = C86312j.m106911c(cls3);
                C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
                C61568m.C61569a.m72263a((C61568m) c, k0Var, d0Var2.f34036a, 0, 0, "temp_5", (String) null, (Long) null, (String) null, (String) null, (cVar2 == null || (d518 = cVar2.f34065a) == null || (str7 = d518.f132121g) == null) ? "" : str7, gVar.toString(), (cVar2 == null || (d517 = cVar2.f34065a) == null || (str6 = d517.f132122h) == null) ? "" : str6, gVar2.toString(), 0, 0, 25056, (Object) null);
                if (!z2) {
                    if (cVar2 != null) {
                        d5115 = cVar2.f34065a;
                    }
                    if (d5115 != null) {
                        d5115.f132119e = 1;
                    }
                    C49236e51 e512 = d0Var2.f34049n;
                    if (e512 != null) {
                        int i3 = e512.f132700g - 1;
                        e512.f132700g = i3;
                        if (i3 < 0) {
                            e512.f132700g = 0;
                        }
                    }
                    str = d0Var2.f34037b.getString(C0966R.string.d2w);
                    C87412m.m108593f(str, "context.getString(com.te…tring.finder_cancel_succ)");
                }
            } else if (i2 == 3) {
                C7335d c2 = C86312j.m106911c(cls3);
                C87412m.m108593f(c2, "getService(IHellLiveVisitorReoprter::class.java)");
                C61568m.C61569a.m72263a((C61568m) c2, k0Var2, d0Var2.f34036a, 0, 0, "temp_5", (String) null, (Long) null, (String) null, (String) null, (cVar2 == null || (d5110 = cVar2.f34065a) == null || (str9 = d5110.f132121g) == null) ? "" : str9, gVar.toString(), (cVar2 == null || (d519 = cVar2.f34065a) == null || (str8 = d519.f132122h) == null) ? "" : str8, gVar2.toString(), 0, 0, 25056, (Object) null);
                Iterator it = ((ArrayList) d0Var2.f34045j).iterator();
                while (it.hasNext()) {
                    C11618c cVar3 = (C11618c) it.next();
                    cVar3.f34065a.f132119e = 0;
                    m11398d(cVar3);
                }
                C49236e51 e513 = d0Var2.f34049n;
                if (e513 != null) {
                    e513.f132700g = e513.f132699f;
                    C13598b0 b0Var2 = C13598b0.f38549a;
                }
                str = d0Var2.f34037b.getString(C0966R.string.dzj);
                C87412m.m108593f(str, "context.getString(com.te…ve_notice_edu_toast_tips)");
            } else if (i2 == 4) {
                C7335d c3 = C86312j.m106911c(cls3);
                C87412m.m108593f(c3, "getService(IHellLiveVisitorReoprter::class.java)");
                C61568m.C61569a.m72263a((C61568m) c3, k0Var, d0Var2.f34036a, 0, 0, "temp_5", (String) null, (Long) null, (String) null, (String) null, (cVar2 == null || (d5112 = cVar2.f34065a) == null || (str11 = d5112.f132121g) == null) ? "" : str11, gVar.toString(), (cVar2 == null || (d5111 = cVar2.f34065a) == null || (str10 = d5111.f132122h) == null) ? "" : str10, gVar2.toString(), 0, 0, 25056, (Object) null);
                Iterator it4 = ((ArrayList) d0Var2.f34045j).iterator();
                while (it4.hasNext()) {
                    C11618c cVar4 = (C11618c) it4.next();
                    String str12 = cVar4.f34065a.f132126o;
                    if (str12 == null || str12.length() == 0) {
                        C49098d51 d5116 = cVar4.f34065a;
                        C50523nc3 nc33 = d5116.f132128q;
                        if (!(nc33 != null && nc33.f138532d)) {
                            d5116.f132119e = 1;
                            C49236e51 e514 = d0Var2.f34049n;
                            if (e514 != null) {
                                int i4 = e514.f132700g - 1;
                                e514.f132700g = i4;
                                if (i4 < 0) {
                                    e514.f132700g = 0;
                                }
                                C13598b0 b0Var3 = C13598b0.f38549a;
                            }
                        }
                    }
                }
                str = d0Var2.f34037b.getString(C0966R.string.lnr);
                C87412m.m108593f(str, "context.getString(com.te…tice_edu_cancel_all_tips)");
            }
            str = "";
        } else {
            C7335d c4 = C86312j.m106911c(cls3);
            C87412m.m108593f(c4, "getService(IHellLiveVisitorReoprter::class.java)");
            C61568m.C61569a.m72263a((C61568m) c4, k0Var2, d0Var2.f34036a, 0, 0, "temp_5", (String) null, (Long) null, (String) null, (String) null, (cVar2 == null || (d516 = cVar2.f34065a) == null || (str5 = d516.f132121g) == null) ? "" : str5, gVar.toString(), (cVar2 == null || (d515 = cVar2.f34065a) == null || (str4 = d515.f132122h) == null) ? "" : str4, gVar2.toString(), 0, 0, 25056, (Object) null);
            if (cVar2 != null) {
                d5115 = cVar2.f34065a;
            }
            if (d5115 != null) {
                d5115.f132119e = 0;
            }
            C49236e51 e515 = d0Var2.f34049n;
            if (e515 != null) {
                int i5 = e515.f132700g + 1;
                e515.f132700g = i5;
                int i6 = e515.f132699f;
                if (i5 > i6) {
                    e515.f132700g = i6;
                }
            }
            if (z2) {
                HashMap hashMap = new HashMap();
                hashMap.put("finder_username", d0Var2.f34036a);
                if (cVar2 == null || (d514 = cVar2.f34065a) == null || (str3 = d514.f132126o) == null) {
                    str3 = "";
                }
                hashMap.put("activityId", str3);
                C7335d c5 = C86312j.m106911c(C8777j5.class);
                C87412m.m108593f(c5, "getService(IHellLiveReport::class.java)");
                C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_CONCERT_PROFILE_RECIVE;
                C49712hj1 hj12 = d0Var2.f34039d;
                C8777j5.C8778a.m8607h((C8777j5) c5, mVar, hashMap, hj12.f134671e, String.valueOf(hj12.f134675i), (String) null, 16, (Object) null);
                str = d0Var2.f34037b.getString(C0966R.string.fq9);
                C87412m.m108593f(str, "context.getString(com.te…ice_get_ticket_succ_tips)");
            } else {
                if ((cVar2 == null || (d513 = cVar2.f34065a) == null || (nc32 = d513.f132128q) == null || !nc32.f138532d) ? false : true) {
                    str = d0Var2.f34037b.getString(C0966R.string.mr5);
                    C87412m.m108593f(str, "{\n                      …_2)\n                    }");
                } else {
                    str = d0Var2.f34037b.getString(C0966R.string.dzj);
                    C87412m.m108593f(str, "{\n                      …ps)\n                    }");
                }
            }
            m11398d(cVar);
        }
        if (str.length() <= 0) {
            z = false;
        }
        if (z) {
            Toast makeText = C76912y0.makeText(d0Var2.f34037b, (CharSequence) str, 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            C13598b0 b0Var4 = C13598b0.f38549a;
        }
        C7335d c6 = C86312j.m106911c(cls2);
        C87412m.m108593f(c6, "getService(IFinderCommonLiveService::class.java)");
        C13887q1 q1Var = (C13887q1) c6;
        String str13 = d0Var2.f34036a;
        if (cVar2 == null || (d512 = cVar2.f34065a) == null || (str2 = d512.f132122h) == null) {
            str2 = "";
        }
        C39818r rVar = C39818r.f106831a;
        C49712hj1 q3 = ((C13442s8) rVar.mo62443b(d0Var2.f34037b).mo75002a(C13442s8.class)).mo12861q3();
        Context context = d0Var2.f34037b;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C86709a0.m107524d().mo123460f(C13887q1.C13888a.m13305a(q1Var, str13, str2, i, q3, ((MMActivity) context).getIntent().getStringExtra("key_promotion_token"), 10, (Long) null, 64, (Object) null));
        ((C8817y2) rVar.mo62444c((AppCompatActivity) d0Var2.f34037b).mo62447c(cls)).mo9643v2().mo9648f0(d0Var2.f34036a);
        if (cVar2 != null) {
            C13887q1 q1Var2 = (C13887q1) C86312j.m106911c(cls2);
            String str14 = d0Var2.f34036a;
            String str15 = cVar2.f34065a.f132122h;
            if (str15 == null) {
                str15 = "";
            }
            if (q1Var2.mo13343h4(str14, str15) == null) {
                C13887q1 q1Var3 = (C13887q1) C86312j.m106911c(cls2);
                String str16 = d0Var2.f34036a;
                C49098d51 d5117 = cVar2.f34065a;
                String str17 = d5117.f132122h;
                if (str17 == null) {
                    str17 = "";
                }
                q1Var3.mo13325QY(str16, str17, d5117);
            } else {
                C13887q1 q1Var4 = (C13887q1) C86312j.m106911c(cls2);
                String str18 = d0Var2.f34036a;
                String str19 = cVar2.f34065a.f132122h;
                if (str19 == null) {
                    str19 = "";
                }
                C49098d51 h4 = q1Var4.mo13343h4(str18, str19);
                if (h4 != null) {
                    h4.f132119e = cVar2.f34065a.f132119e;
                }
            }
        }
        ((C8817y2) rVar.mo62444c((AppCompatActivity) d0Var2.f34037b).mo62447c(cls)).mo9643v2().mo9648f0(d0Var2.f34036a);
    }

    /* renamed from: d */
    public static final void m11398d(C11618c cVar) {
        C49098d51 d512;
        C51559uk1 a;
        if (cVar != null && (d512 = cVar.f34065a) != null && (a = C7802g1.m7949a(d512)) != null) {
            C49359f1 f1Var = a.f142912z;
            boolean z = false;
            if (f1Var != null && !C7776a.m7931a(f1Var)) {
                z = true;
            }
            if (z) {
                cVar.f34066b = C11615a.Big;
            }
        }
    }

    /* renamed from: e */
    public static void m11399e(C11614d0 d0Var, boolean z, String str, String str2, int i, int i2, Object obj) {
        C11614d0 d0Var2 = d0Var;
        String str3 = (i2 & 4) != 0 ? "" : str2;
        int i3 = (i2 & 8) != 0 ? 0 : i;
        C9315i0 i0Var = d0Var2.f34048m;
        if (i0Var != null) {
            i0Var.mo85581g();
        }
        C9315i0 i0Var2 = new C9315i0((String) null, (String) null, str3, i3, (C9315i0.C9316a) null, (C49712hj1) null, z ? 1 : 0, 51, (C8480h) null);
        C89059e i4 = i0Var2.mo9225i();
        Context context = d0Var2.f34037b;
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i4.mo11397F((MMActivity) context);
        boolean z2 = z;
        i4.mo123420E(new C11681s0(z, d0Var));
        d0Var2.f34048m = i0Var2;
    }

    /* renamed from: a */
    public void mo9628a(C49236e51 e512, String str) {
        WxRefreshLayout wxRefreshLayout;
        LinkedList<C49098d51> linkedList;
        if (str == null) {
            str = "";
        }
        this.f34053r = str;
        C32444a aVar = C32444a.f86121a;
        if (C32444a.f86128b2.mo60266n().intValue() == 0) {
            Log.m105924i("MoreLiveListWidget", "multi notice disable, return.");
            return;
        }
        C101218e0 e0Var = this.f34041f;
        if (e0Var != null && e0Var.mo140661h()) {
            Log.m105924i("MoreLiveListWidget", "dialog is showing, return.");
            return;
        }
        this.f34049n = e512;
        C9315i0 i0Var = this.f34048m;
        if (i0Var != null) {
            i0Var.mo85581g();
        }
        ((ArrayList) this.f34045j).clear();
        if (!(e512 == null || (linkedList = e512.f132697d) == null)) {
            Iterator<C49098d51> it = linkedList.iterator();
            while (it.hasNext()) {
                C49098d51 next = it.next();
                StringBuilder sb = new StringBuilder();
                sb.append("#showList id=");
                sb.append(next.f132122h);
                sb.append(" time=");
                sb.append(next.f132118d);
                sb.append("  stock_id=");
                C51559uk1 a = C7802g1.m7949a(next);
                sb.append(a != null ? a.f142894e : null);
                Log.m105924i("MoreLiveListWidget", sb.toString());
                ((ArrayList) this.f34045j).add(new C11618c(this, next));
            }
        }
        C101218e0 e0Var2 = new C101218e0(this.f34037b, 0, 0);
        this.f34041f = e0Var2;
        e0Var2.mo140674t(C79406f.m96347a(this.f34037b, 600.0f));
        View inflate = LayoutInflater.from(this.f34037b).inflate(C0966R.C0971layout.cli, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context)\n          …ive_list_widget_ui, null)");
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f358205m02);
        this.f34042g = textView;
        C85875k4.m106189j0(textView != null ? textView.getPaint() : null, 0.8f);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.lzx);
        this.f34043h = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(new C11621e(this));
        }
        mo11525f();
        if (e512 != null) {
            int i = e512.f132699f;
            TextView textView3 = this.f34042g;
            if (textView3 != null) {
                textView3.setText(this.f34037b.getResources().getString(C0966R.string.luc, new Object[]{Integer.valueOf(i)}));
            }
        }
        inflate.findViewById(C0966R.C0970id.f358425m23).setOnClickListener(new C11622f(this));
        this.f34044i = (RecyclerView) inflate.findViewById(C0966R.C0970id.iio);
        this.f34047l = (WxRefreshLayout) inflate.findViewById(C0966R.C0970id.ije);
        this.f34046k = new C11619d(this, this.f34036a, this.f34038c, this.f34037b);
        RecyclerView recyclerView = this.f34044i;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f34037b));
        }
        RecyclerView recyclerView2 = this.f34044i;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f34046k);
        }
        WxRefreshLayout wxRefreshLayout2 = this.f34047l;
        if (wxRefreshLayout2 != null) {
            wxRefreshLayout2.mo26568A(new DemoHeader(this.f34037b, (AttributeSet) null));
        }
        WxRefreshLayout wxRefreshLayout3 = this.f34047l;
        if (wxRefreshLayout3 != null) {
            wxRefreshLayout3.mo26641y(new DemoFooter(this.f34037b, (AttributeSet) null));
        }
        WxRefreshLayout wxRefreshLayout4 = this.f34047l;
        if (wxRefreshLayout4 != null) {
            wxRefreshLayout4.setOnSimpleAction(new C11623g(this));
        }
        C101218e0 e0Var3 = this.f34041f;
        if (e0Var3 != null) {
            e0Var3.mo140665l(new C11624h(this));
        }
        C101218e0 e0Var4 = this.f34041f;
        if (e0Var4 != null) {
            e0Var4.mo140664k(inflate, 0, 0);
        }
        C101218e0 e0Var5 = this.f34041f;
        if (e0Var5 != null) {
            e0Var5.mo140655A();
        }
        if (((ArrayList) this.f34045j).isEmpty() && (wxRefreshLayout = this.f34047l) != null) {
            wxRefreshLayout.mo26573d();
        }
    }

    /* renamed from: b */
    public void mo9629b(C8797q5.C8799b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f34052q = bVar;
    }

    /* renamed from: f */
    public final void mo11525f() {
        int i;
        boolean z;
        TextView textView = this.f34043h;
        boolean z2 = true;
        if (textView != null) {
            if (!this.f34038c) {
                Iterator it = ((ArrayList) this.f34045j).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C11618c cVar = (C11618c) it.next();
                    String str = cVar.f34065a.f132126o;
                    if (str == null || str.length() == 0) {
                        C50523nc3 nc32 = cVar.f34065a.f132128q;
                        if (!(nc32 != null && nc32.f138532d)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    i = 0;
                    textView.setVisibility(i);
                }
            }
            i = 8;
            textView.setVisibility(i);
        }
        TextView textView2 = this.f34043h;
        if (textView2 != null) {
            C49236e51 e512 = this.f34049n;
            if (e512 == null || e512.f132699f != e512.f132700g) {
                z2 = false;
            }
            textView2.setText(z2 ? C0966R.string.lue : C0966R.string.lud);
        }
    }
}
