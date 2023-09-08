package gk1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.ratio.RatioLayout;
import di3.C7335d;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import iq3.C60601c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import te3.C64284cg;
import te3.C64836xp2;
import tf0.C13887q1;
import tf0.C64916p1;
import up1.C27696y;
import wh1.C66114a;
import z04.C112550d0;

/* renamed from: gk1.a */
public final class C59522a implements View.OnClickListener {

    /* renamed from: E */
    public static final int f170111E = Color.parseColor("#4C4646");

    /* renamed from: F */
    public static final int f170112F = Color.parseColor("#222425");

    /* renamed from: G */
    public static final int f170113G = Color.parseColor("#323233");

    /* renamed from: H */
    public static final Map<String, Integer> f170114H = new HashMap();

    /* renamed from: I */
    public static final int f170115I = 1;

    /* renamed from: J */
    public static final int f170116J = 2;

    /* renamed from: A */
    public Drawable f170117A;

    /* renamed from: B */
    public int f170118B;

    /* renamed from: C */
    public C64836xp2 f170119C;

    /* renamed from: D */
    public int f170120D = f170116J;

    /* renamed from: d */
    public final C59523a f170121d;

    /* renamed from: e */
    public final View f170122e;

    /* renamed from: f */
    public ViewGroup f170123f;

    /* renamed from: g */
    public LiveScrollSquareLayout f170124g;

    /* renamed from: h */
    public FrameLayout f170125h;

    /* renamed from: i */
    public FrameLayout f170126i;

    /* renamed from: j */
    public RoundedCornerFrameLayout f170127j;

    /* renamed from: n */
    public LinearLayout f170128n;

    /* renamed from: o */
    public TextView f170129o;

    /* renamed from: p */
    public WeImageView f170130p;

    /* renamed from: q */
    public TextView f170131q;

    /* renamed from: r */
    public TextView f170132r;

    /* renamed from: s */
    public ImageView f170133s;

    /* renamed from: t */
    public ImageView f170134t;

    /* renamed from: u */
    public WeImageView f170135u;

    /* renamed from: v */
    public WeImageView f170136v;

    /* renamed from: w */
    public RoundedCornerFrameLayout f170137w;

    /* renamed from: x */
    public Space f170138x;

    /* renamed from: y */
    public RatioLayout f170139y;

    /* renamed from: z */
    public Drawable f170140z;

    /* renamed from: gk1.a$a */
    public interface C59523a {
        /* renamed from: a */
        void mo84267a();

        /* renamed from: b */
        void mo84268b();
    }

    public C59522a(C59523a aVar) {
        C87412m.m108594g(aVar, "actionEvent");
        this.f170121d = aVar;
        View inflate = LayoutInflater.from(MMApplicationContext.getContext()).inflate(C0966R.C0971layout.d6u, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(MMApplicationContex…ntrance_live_panel, null)");
        this.f170122e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.o0k);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.live_panel_root)");
        this.f170123f = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.brz);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.content_layout)");
        this.f170124g = (LiveScrollSquareLayout) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.l65);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.video_layout)");
        this.f170125h = (FrameLayout) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f357450aa3);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.id.ad_video_layout)");
        this.f170126i = (FrameLayout) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.o4t);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.id.video_parent_layout)");
        this.f170127j = (RoundedCornerFrameLayout) findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.o4x);
        C87412m.m108593f(findViewById6, "rootView.findViewById(R.id.video_state_layout)");
        this.f170128n = (LinearLayout) findViewById6;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.dt9);
        C87412m.m108593f(findViewById7, "rootView.findViewById(R.…_live_mini_view_state_tv)");
        this.f170129o = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.dt7);
        C87412m.m108593f(findViewById8, "rootView.findViewById(R.…ive_mini_view_state_icon)");
        this.f170130p = (WeImageView) findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.o0l);
        C87412m.m108593f(findViewById9, "rootView.findViewById(R.id.live_theme)");
        this.f170131q = (TextView) findViewById9;
        View findViewById10 = inflate.findViewById(C0966R.C0970id.fzk);
        C87412m.m108593f(findViewById10, "rootView.findViewById(R.….live_title_info_name_tv)");
        this.f170132r = (TextView) findViewById10;
        View findViewById11 = inflate.findViewById(C0966R.C0970id.fzl);
        C87412m.m108593f(findViewById11, "rootView.findViewById(R.id.live_title_info_tag_iv)");
        this.f170133s = (ImageView) findViewById11;
        View findViewById12 = inflate.findViewById(C0966R.C0970id.fzi);
        C87412m.m108593f(findViewById12, "rootView.findViewById(R.…e_title_info_avatar_icon)");
        this.f170134t = (ImageView) findViewById12;
        View findViewById13 = inflate.findViewById(C0966R.C0970id.hwy);
        C87412m.m108593f(findViewById13, "rootView.findViewById(R.id.play_btn)");
        this.f170135u = (WeImageView) findViewById13;
        View findViewById14 = inflate.findViewById(C0966R.C0970id.nbq);
        C87412m.m108593f(findViewById14, "rootView.findViewById(R.id.pause_btn)");
        this.f170136v = (WeImageView) findViewById14;
        View findViewById15 = inflate.findViewById(C0966R.C0970id.a8r);
        C87412m.m108593f(findViewById15, "rootView.findViewById(R.id.bg_view)");
        this.f170137w = (RoundedCornerFrameLayout) findViewById15;
        View findViewById16 = inflate.findViewById(C0966R.C0970id.o4u);
        C87412m.m108593f(findViewById16, "rootView.findViewById(R.id.video_space)");
        this.f170138x = (Space) findViewById16;
        View findViewById17 = inflate.findViewById(C0966R.C0970id.o1b);
        C87412m.m108593f(findViewById17, "rootView.findViewById(R.id.mic_ratio_layout)");
        this.f170139y = (RatioLayout) findViewById17;
        this.f170123f.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.f170124g.getLayoutParams();
        if (layoutParams != null) {
            C66114a aVar2 = C66114a.f190029a;
            layoutParams.width = C66114a.f190030b;
            layoutParams.height = C66114a.f190031c;
        }
        mo84598f(f170111E);
        this.f170139y.setAdapter(((C13887q1) C86312j.m106911c(C13887q1.class)).mo13345i9(2));
        this.f170139y.setLayoutManager(new C60601c());
    }

    /* renamed from: a */
    public final void mo84593a(View view) {
        if (view != null) {
            this.f170126i.removeAllViews();
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            this.f170126i.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* renamed from: b */
    public final String mo84594b(String str) {
        List U = C112550d0.m153785U(str, new String[]{"&token"}, false, 0, 6, (Object) null);
        return U.isEmpty() ^ true ? (String) U.get(0) : str;
    }

    /* renamed from: c */
    public final void mo84595c() {
        C64836xp2 xp22 = this.f170119C;
        if (xp22 != null) {
            this.f170135u.setOnClickListener(this);
            this.f170136v.setOnClickListener(this);
            C58969q b = C58961d.f168673a.mo84155b(xp22.f186369d);
            if (b != null) {
                this.f170132r.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f170123f.getContext(), b.mo84196w1(), this.f170132r.getTextSize()));
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                C39818r rVar = C39818r.f106831a;
                ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(b.mo84172g0(), (C27696y) null, 2, (C8480h) null), this.f170134t, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                FinderAuthInfo finderAuthInfo = b.field_authInfo;
                if (finderAuthInfo == null) {
                    this.f170133s.setVisibility(8);
                } else if (finderAuthInfo.authIconType > 0) {
                    this.f170133s.setVisibility(0);
                    C7335d c = C86312j.m106911c(C64916p1.class);
                    C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                    C64916p1.C64917a.m76444k((C64916p1) c, this.f170133s, b.field_authInfo, 0, (C64284cg) null, 8, (Object) null);
                } else {
                    this.f170133s.setVisibility(8);
                }
            }
        }
        this.f170123f.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo84596d() {
        this.f170135u.setVisibility(8);
        this.f170136v.setVisibility(0);
        this.f170136v.setImageResource(C0966R.raw.icons_filled_pause);
    }

    /* renamed from: e */
    public final void mo84597e() {
        this.f170135u.setVisibility(0);
        this.f170135u.setImageResource(C0966R.raw.icons_filled_play);
        this.f170136v.setVisibility(8);
    }

    /* renamed from: f */
    public final void mo84598f(int i) {
        Log.m105924i("LiveScrollPanelWidget", "setContentBackground color: " + i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        gradientDrawable.setColor(i);
        this.f170117A = gradientDrawable;
        this.f170124g.setBackgroundDrawable(gradientDrawable);
    }

    /* renamed from: g */
    public final void mo84599g(int i) {
        this.f170118B = i;
        if (i == 0) {
            this.f170128n.setVisibility(8);
            mo84596d();
            this.f170136v.setEnabled(true);
            this.f170135u.setEnabled(true);
            return;
        }
        this.f170128n.setVisibility(0);
        this.f170128n.setBackgroundColor(-16777216);
        this.f170130p.setImageResource(C0966R.raw.icons_outlined_error);
        mo84597e();
        this.f170136v.setEnabled(true);
        this.f170135u.setEnabled(false);
        if (C61926c.m72696u(i, 4)) {
            this.f170129o.setText(this.f170122e.getContext().getResources().getString(C0966R.string.n_x));
        } else if (C61926c.m72696u(i, 2)) {
            this.f170129o.setText(this.f170122e.getContext().getResources().getString(C0966R.string.g8q));
        } else if (C61926c.m72696u(i, 1)) {
            this.f170129o.setText(this.f170122e.getContext().getResources().getString(C0966R.string.g8n));
        } else if (C61926c.m72696u(i, 8)) {
            this.f170129o.setText(this.f170122e.getContext().getResources().getString(C0966R.string.g8o));
        } else {
            this.f170128n.setVisibility(8);
            mo84596d();
            this.f170136v.setEnabled(true);
            this.f170135u.setEnabled(true);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/squarescroll/widget/LiveScrollPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.hwy) {
            mo84596d();
            this.f170121d.mo84268b();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.nbq) {
            mo84597e();
            this.f170121d.mo84267a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/squarescroll/widget/LiveScrollPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
