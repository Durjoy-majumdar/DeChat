package com.tencent.p014mm.plugin.profile.p088ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.patmsg.p086ui.AvatarPatTipImageView;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileHdHeadImg;
import com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b;
import com.tencent.p014mm.pluginsdk.p133ui.preference.FMessageListView;
import com.tencent.p014mm.pluginsdk.p133ui.preference.PhoneNumPreference;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import df2.C75381g;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p214om.C11502f;
import p606mm.C47080g;
import p773yy.C79168k;
import pj3.C47511g;
import qy2.C77448f0;
import qy2.C77453j;
import tf3.C101874h;
import ud2.C78150h;
import uo3.C78253a;
import vd2.C78386e;
import yb2.C15956f;
import yb2.C79063g;

/* renamed from: com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference */
public class NormalProfileHeaderPreference extends Preference implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: J */
    public boolean f202570J = false;

    /* renamed from: K */
    public C72996z1 f202571K;

    /* renamed from: L */
    public String f202572L;

    /* renamed from: M */
    public int f202573M;

    /* renamed from: N */
    public Context f202574N;

    /* renamed from: P */
    public C47511g f202575P;

    /* renamed from: Q */
    public View f202576Q;

    /* renamed from: R */
    public C75381g f202577R;

    /* renamed from: S */
    public boolean f202578S;

    /* renamed from: T */
    public boolean f202579T;

    /* renamed from: U */
    public int f202580U;

    /* renamed from: V */
    public boolean f202581V;

    /* renamed from: W */
    public FinderContact f202582W;

    /* renamed from: X */
    public C72893b.C72896c f202583X;

    /* renamed from: Y */
    public View.OnLayoutChangeListener f202584Y = null;

    /* renamed from: Z */
    public String f202585Z;

    /* renamed from: p0 */
    public int f202586p0 = 0;

    /* renamed from: x0 */
    public int f202587x0 = 0;

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$a */
    public class C70148a implements C78386e.C78387a {
        public C70148a(NormalProfileHeaderPreference normalProfileHeaderPreference) {
        }

        /* renamed from: a */
        public boolean mo96620a(View view) {
            ((C78150h) C86312j.m106911c(C78150h.class)).getClass();
            view.startAnimation(AnimationUtils.loadAnimation(MMApplicationContext.getContext(), C0966R.C0968anim.f2341a6));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$b */
    public class C70149b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ C70150c f202588d;

        public C70149b(C70150c cVar) {
            this.f202588d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
            if (r5.f202579T != false) goto L_0x0077;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00e0 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r9 = this;
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r0 = r9.f202588d
                android.view.View r0 = r0.f202622z
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnPreDrawListener(r9)
                r0 = 2
                int[] r1 = new int[r0]
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r2 = r9.f202588d
                android.view.View r2 = r2.f202622z
                r2.getLocationOnScreen(r1)
                r2 = 1
                r1 = r1[r2]
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r3 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.this
                android.content.Context r3 = r3.f121274d
                int r3 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r3)
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r4 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.this
                android.content.Context r4 = r4.f121274d
                r5 = 2131167060(0x7f070754, float:1.7948383E38)
                int r4 = kg3.C76577a.m92155f(r4, r5)
                bl3.r r5 = bl3.C39818r.f106831a
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r6 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.this
                android.content.Context r6 = r6.f121274d
                bl3.r$a r5 = r5.mo62443b(r6)
                java.lang.Class<yb2.g> r6 = yb2.C79063g.class
                bl3.t r5 = r5.mo62449e(r6)
                yb2.g r5 = (yb2.C79063g) r5
                r6 = 0
                if (r5 == 0) goto L_0x0043
                boolean r5 = r5.f232169d
                goto L_0x0044
            L_0x0043:
                r5 = 0
            L_0x0044:
                r7 = 2131165324(0x7f07008c, float:1.7944862E38)
                if (r5 == 0) goto L_0x0052
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r4 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.this
                android.content.Context r4 = r4.f121274d
                int r4 = kg3.C76577a.m92155f(r4, r7)
                goto L_0x006f
            L_0x0052:
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r5 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.this
                boolean r8 = r5.f202578S
                if (r8 == 0) goto L_0x0062
                android.content.Context r4 = r5.f121274d
                r5 = 2131167058(0x7f070752, float:1.7948379E38)
                int r4 = kg3.C76577a.m92155f(r4, r5)
                goto L_0x006f
            L_0x0062:
                if (r3 <= 0) goto L_0x006f
                int r8 = r5.f202580U
                if (r8 <= 0) goto L_0x006f
                android.content.Context r4 = r5.f121274d
                int r4 = kg3.C76577a.m92155f(r4, r7)
                int r4 = r4 + r8
            L_0x006f:
                if (r1 != 0) goto L_0x0079
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r5 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.this
                boolean r5 = r5.f202578S
                if (r5 != 0) goto L_0x0079
            L_0x0077:
                int r4 = r4 + r3
                goto L_0x0084
            L_0x0079:
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r5 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.this
                boolean r7 = r5.f202581V
                if (r7 == 0) goto L_0x0084
                boolean r5 = r5.f202579T
                if (r5 == 0) goto L_0x0084
                goto L_0x0077
            L_0x0084:
                r5 = 5
                java.lang.Object[] r5 = new java.lang.Object[r5]
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r7 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.this
                int r7 = r7.f202580U
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r5[r6] = r7
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r5[r2] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5[r0] = r1
                r0 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                r5[r0] = r1
                r0 = 4
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r1 = r9.f202588d
                android.view.View r1 = r1.f202622z
                int r1 = r1.getPaddingTop()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5[r0] = r1
                java.lang.String r0 = "MicroMsg.NormalProfileHeaderPreference"
                java.lang.String r1 = "actionBarHeight=%s ,statusBarHeight=%s , rootTop:%s, paddingTopToSet:%s,curPaddingTop:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r0 = r9.f202588d
                android.view.View r0 = r0.f202622z
                int r0 = r0.getPaddingTop()
                if (r4 == r0) goto L_0x00e0
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r0 = r9.f202588d
                android.view.View r0 = r0.f202622z
                int r1 = r0.getPaddingLeft()
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r2 = r9.f202588d
                android.view.View r2 = r2.f202622z
                int r2 = r2.getPaddingRight()
                com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r3 = r9.f202588d
                android.view.View r3 = r3.f202622z
                int r3 = r3.getPaddingBottom()
                r0.setPadding(r1, r4, r2, r3)
                return r6
            L_0x00e0:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.C70149b.onPreDraw():boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c */
    public class C70150c {

        /* renamed from: A */
        public View f202590A;

        /* renamed from: B */
        public View f202591B;

        /* renamed from: C */
        public ImageView f202592C;

        /* renamed from: D */
        public TextView f202593D;

        /* renamed from: E */
        public View f202594E;

        /* renamed from: F */
        public View f202595F;

        /* renamed from: a */
        public View f202597a = null;

        /* renamed from: b */
        public View f202598b = null;

        /* renamed from: c */
        public View f202599c = null;

        /* renamed from: d */
        public View f202600d = null;

        /* renamed from: e */
        public View f202601e = null;

        /* renamed from: f */
        public View f202602f = null;

        /* renamed from: g */
        public ImageView f202603g = null;

        /* renamed from: h */
        public TextView f202604h = null;

        /* renamed from: i */
        public TextView f202605i = null;

        /* renamed from: j */
        public MMNeat7extView f202606j = null;

        /* renamed from: k */
        public TextView f202607k = null;

        /* renamed from: l */
        public TextView f202608l = null;

        /* renamed from: m */
        public TextView f202609m = null;

        /* renamed from: n */
        public TextView f202610n = null;

        /* renamed from: o */
        public TextView f202611o = null;

        /* renamed from: p */
        public TextView f202612p = null;

        /* renamed from: q */
        public AvatarPatTipImageView f202613q = null;

        /* renamed from: r */
        public FMessageListView f202614r;

        /* renamed from: s */
        public View f202615s;

        /* renamed from: t */
        public LinearLayout f202616t = null;

        /* renamed from: u */
        public C77453j f202617u = null;

        /* renamed from: v */
        public View f202618v = null;

        /* renamed from: w */
        public ImageView f202619w;

        /* renamed from: x */
        public View f202620x;

        /* renamed from: y */
        public ImageView f202621y;

        /* renamed from: z */
        public View f202622z;

        /* renamed from: com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c$a */
        public class C70151a implements View.OnTouchListener {
            public C70151a(NormalProfileHeaderPreference normalProfileHeaderPreference) {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                NormalProfileHeaderPreference.this.f202586p0 = (int) motionEvent.getRawX();
                NormalProfileHeaderPreference.this.f202587x0 = (int) motionEvent.getRawY();
                NormalProfileHeaderPreference normalProfileHeaderPreference = NormalProfileHeaderPreference.this;
                view.setTag(C0966R.C0970id.f359414kt0, new int[]{normalProfileHeaderPreference.f202586p0, normalProfileHeaderPreference.f202587x0});
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        public C70150c(View view) {
            View.OnLayoutChangeListener onLayoutChangeListener;
            this.f202594E = view;
            if (!(view == null || (onLayoutChangeListener = NormalProfileHeaderPreference.this.f202584Y) == null)) {
                view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.f202620x = view.findViewById(C0966R.C0970id.f5306bi);
            this.f202614r = (FMessageListView) view.findViewById(C0966R.C0970id.bpw);
            this.f202615s = view.findViewById(C0966R.C0970id.bpx);
            this.f202597a = view.findViewById(C0966R.C0970id.bpu);
            this.f202598b = view.findViewById(C0966R.C0970id.bpp);
            this.f202599c = view.findViewById(C0966R.C0970id.f357784bq3);
            this.f202601e = view.findViewById(C0966R.C0970id.bpq);
            this.f202602f = view.findViewById(C0966R.C0970id.bq5);
            this.f202600d = view.findViewById(C0966R.C0970id.bqa);
            this.f202613q = (AvatarPatTipImageView) view.findViewById(C0966R.C0970id.bpr);
            this.f202607k = (TextView) view.findViewById(C0966R.C0970id.bpt);
            this.f202606j = (MMNeat7extView) view.findViewById(C0966R.C0970id.f357782bq1);
            this.f202604h = (TextView) view.findViewById(C0966R.C0970id.f357781bq0);
            this.f202591B = view.findViewById(C0966R.C0970id.bms);
            this.f202592C = (ImageView) view.findViewById(C0966R.C0970id.bmq);
            this.f202593D = (TextView) view.findViewById(C0966R.C0970id.bmr);
            this.f202605i = (TextView) view.findViewById(C0966R.C0970id.bpk);
            this.f202603g = (ImageView) view.findViewById(C0966R.C0970id.bq6);
            this.f202608l = (TextView) view.findViewById(C0966R.C0970id.bq9);
            this.f202609m = (TextView) view.findViewById(C0966R.C0970id.bq7);
            this.f202610n = (TextView) view.findViewById(C0966R.C0970id.bpz);
            this.f202611o = (TextView) view.findViewById(C0966R.C0970id.bpv);
            this.f202612p = (TextView) view.findViewById(C0966R.C0970id.bq8);
            this.f202619w = (ImageView) view.findViewById(C0966R.C0970id.bpo);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.bpm);
            ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.bpn);
            this.f202621y = (ImageView) view.findViewById(C0966R.C0970id.bml);
            this.f202622z = view.findViewById(C0966R.C0970id.f357783bq2);
            this.f202590A = view.findViewById(C0966R.C0970id.bps);
            this.f202616t = (LinearLayout) view.findViewById(C0966R.C0970id.bpy);
            this.f202618v = view.findViewById(C0966R.C0970id.f359475l31);
            if (!C72996z1.m85846q5(NormalProfileHeaderPreference.this.f202571K.getUsername())) {
                RelativeLayout relativeLayout = (RelativeLayout) this.f202622z;
                LinearLayout linearLayout = this.f202616t;
                if (C77448f0.m93394f()) {
                    Context context = NormalProfileHeaderPreference.this.f121274d;
                    C77453j J6 = ((C79168k) C86312j.m106911c(C79168k.class)).mo74112J6(context, relativeLayout, linearLayout, context.getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                    relativeLayout.addView(J6.getView());
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) J6.getView().getLayoutParams();
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    layoutParams.addRule(3, C0966R.C0970id.bpy);
                    this.f202617u = J6;
                }
            }
            this.f202595F = view.findViewById(C0966R.C0970id.c7p);
            this.f202620x.findViewById(C0966R.C0970id.f359063il3).setOnClickListener(NormalProfileHeaderPreference.this);
            this.f202620x.findViewById(C0966R.C0970id.gxw).setOnClickListener(NormalProfileHeaderPreference.this);
            this.f202602f.setOnClickListener(NormalProfileHeaderPreference.this);
            this.f202600d.setOnClickListener(NormalProfileHeaderPreference.this);
            this.f202613q.setOnClickListener(NormalProfileHeaderPreference.this);
            this.f202597a.setOnClickListener(NormalProfileHeaderPreference.this);
            this.f202598b.setOnClickListener(NormalProfileHeaderPreference.this);
            this.f202599c.setOnClickListener(NormalProfileHeaderPreference.this);
            this.f202601e.setOnClickListener(NormalProfileHeaderPreference.this);
            if (this.f202594E.getContext() instanceof Activity) {
                this.f202614r.setForceHideReply(((Activity) this.f202594E.getContext()).getIntent().getBooleanExtra("Contact_Conversation_IsForceHideReplyBtn", false));
            }
            this.f202608l.setOnTouchListener(new C70151a(NormalProfileHeaderPreference.this));
            this.f202608l.setOnLongClickListener(NormalProfileHeaderPreference.this);
            if (C79758p.f233760a.mo109883f(new C101874h()) == 1) {
                this.f202606j.setOnLongClickListener(NormalProfileHeaderPreference.this);
            }
            ImageView imageView3 = this.f202621y;
            if (imageView3 != null) {
                imageView3.setOnClickListener(NormalProfileHeaderPreference.this);
            }
            View view2 = this.f202622z;
            if (view2 != null) {
                view2.setOnClickListener(NormalProfileHeaderPreference.this);
            }
            C79063g gVar = (C79063g) C39818r.f106831a.mo62443b(NormalProfileHeaderPreference.this.f202574N).mo62449e(C79063g.class);
            if (gVar != null) {
                View findViewById = view.findViewById(C0966R.C0970id.oc5);
                C87412m.m108594g(findViewById, "powerMoreIv");
                View findViewById2 = gVar.findViewById(C0966R.C0970id.f5421eo);
                if (gVar.f232169d) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/mvvmbase/uic/HalfScreenContactUIC", "onCreateViewHolder", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/mvvmbase/uic/HalfScreenContactUIC", "onCreateViewHolder", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setOnClickListener(new C15956f(findViewById2));
                    return;
                }
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = findViewById;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/mvvmbase/uic/HalfScreenContactUIC", "onCreateViewHolder", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/mvvmbase/uic/HalfScreenContactUIC", "onCreateViewHolder", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setOnClickListener((View.OnClickListener) null);
            }
        }
    }

    public NormalProfileHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f202574N = context;
    }

    /* renamed from: J */
    public static String m82681J(String str, String str2) {
        Class cls = C75339i.class;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        String Si = ((C75339i) C86312j.m106911c(cls)).mo62515Si(str);
        return !Util.isNullOrNil(Si) ? Si : !Util.isNullOrNil(str2) ? str2 : ((C75339i) C86312j.m106911c(cls)).getDisplayName(str);
    }

    /* renamed from: I */
    public void mo96611I(C72996z1 z1Var, int i, boolean z, C75381g gVar) {
        this.f202572L = ((Activity) this.f202574N).getIntent().getStringExtra("Contact_RoomNickname");
        this.f202571K = z1Var;
        this.f202573M = i;
        this.f202570J = true;
        this.f202577R = gVar;
    }

    /* renamed from: K */
    public final String mo96612K(C72996z1 z1Var) {
        String str;
        if (C72996z1.m85811N4(this.f202571K.getUsername())) {
            Resources resources = this.f202574N.getResources();
            Object[] objArr = new Object[1];
            objArr[0] = Util.isNullOrNil(z1Var.f149520W) ? ((C75339i) C86312j.m106911c(C75339i.class)).K90(z1Var.f149518V) : z1Var.f149520W;
            str = resources.getString(C0966R.string.as9, objArr).trim();
        } else {
            str = z1Var.mo62898f();
        }
        return Util.nullAs(str, "");
    }

    /* renamed from: L */
    public C77453j mo96613L() {
        View view = this.f202576Q;
        if (view != null) {
            return ((C70150c) view.getTag()).f202617u;
        }
        return null;
    }

    /* renamed from: M */
    public void mo96614M(C47511g gVar) {
        this.f202575P = gVar;
    }

    /* renamed from: N */
    public void mo96615N() {
        FMessageListView fMessageListView;
        View view = this.f202576Q;
        if (!(view == null || (fMessageListView = ((C70150c) view.getTag()).f202614r) == null)) {
            fMessageListView.mo100719b();
        }
        if (mo96613L() != null) {
            mo96613L().mo72644p(0);
        }
    }

    /* renamed from: P */
    public void mo96616P(boolean z, int i, boolean z2) {
        int a = C75044y4.m89989a(this.f121274d);
        this.f202578S = z;
        this.f202579T = z2;
        this.f202580U = i;
        this.f202581V = C77448f0.m93394f();
        if (i <= 0) {
            this.f202580U = a;
        }
        C47511g gVar = this.f202575P;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        Log.m105925i("MicroMsg.NormalProfileHeaderPreference", "setHasStory action=%s weuiActionBarHeight=%s", Integer.valueOf(i), Integer.valueOf(a));
    }

    /* renamed from: R */
    public final void mo96617R(String str, C72996z1 z1Var) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.NormalProfileHeaderPreference", "view stranger remark, username is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_Scene", this.f202573M);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", z1Var.getUsername());
        intent.putExtra("Contact_Nick", z1Var.getNickname());
        intent.putExtra("Contact_RemarkName", z1Var.mo73969n2());
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93186s(intent, this.f202574N);
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id = view.getId();
        if (id == C0966R.C0970id.f359063il3) {
            C72996z1 z1Var = this.f202571K;
            if (z1Var == null) {
                Log.m105920e("MicroMsg.NormalProfileHeaderPreference", "contact is null");
            } else if (z1Var.mo62927s3()) {
                Intent intent = new Intent();
                intent.putExtra("Contact_Scene", this.f202573M);
                intent.putExtra("Contact_User", z1Var.getUsername());
                intent.putExtra("view_mode", true);
                intent.putExtra("contact_phone_number_by_md5", ((PhoneNumPreference) this.f202575P.mo72519a("contact_profile_phone")).f24039K);
                intent.putExtra("contact_phone_number_list", z1Var.f149525Y0);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93175h(intent, this.f202574N);
            } else if (!Util.isNullOrNil(z1Var.mo73978v2())) {
                mo96617R(z1Var.mo73978v2(), z1Var);
            } else {
                mo96617R(z1Var.getUsername(), z1Var);
            }
        } else if (id == C0966R.C0970id.gxw) {
            C75381g gVar = this.f202577R;
            if (gVar != null) {
                gVar.mo105720d();
            }
        } else if (id == C0966R.C0970id.bpr) {
            String username = this.f202571K.getUsername();
            Intent intent2 = new Intent(this.f202574N, ProfileHdHeadImg.class);
            intent2.putExtra("username", username);
            Context context = this.f202574N;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "clickAvatar", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "clickAvatar", "(Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C42599h.xx0(((Activity) this.f202574N).getIntent(), 16, 1, this.f202571K.getUsername());
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        int id = view.getId();
        if (id == C0966R.C0970id.bq9) {
            TextView textView = (TextView) view;
            C72996z1 z1Var = this.f202571K;
            if (textView.getText() != null) {
                String charSequence = textView.getText().toString();
                int indexOf = charSequence.indexOf(58);
                if (indexOf >= 0 && indexOf < charSequence.length()) {
                    charSequence = charSequence.substring(indexOf + 1).trim();
                }
                SpannableString spannableString = new SpannableString(textView.getText());
                spannableString.setSpan(new BackgroundColorSpan(this.f202574N.getResources().getColor(C0966R.color.FG_3)), indexOf + 2, textView.getText().length(), 33);
                textView.setText(spannableString);
                C78253a aVar = new C78253a(this.f202574N, textView);
                aVar.f229249r = new C70302x1(this);
                aVar.f229251t = new C70305y1(this, charSequence);
                aVar.f229227C = new C42782z1(this, textView, z1Var);
                if (textView.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                    int[] iArr = (int[]) textView.getTag(C0966R.C0970id.f359414kt0);
                    aVar.mo71743n(iArr[0], iArr[1]);
                } else {
                    aVar.mo71743n(this.f202586p0, this.f202587x0);
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        } else if (id == C0966R.C0970id.f357782bq1) {
            ((C47080g) C86312j.m106911c(C47080g.class)).mo72228UH(Util.secPrint(this.f202571K.getUsername()) + "-" + C72715f.m85111d("yyyy-MM-dd_HH:mm:ss", (long) C31543z5.m39455e()) + ".txt", this.f202571K);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        } else {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0663  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x06aa  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0704  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0794  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x07af  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0836  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0861  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x08a8  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x08aa  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x08ad  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x08dd  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0900  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0943  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x049c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x04f2  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1086w(android.view.View r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            super.mo1086w(r32)
            boolean r3 = r0.f202570J
            java.lang.String r4 = "MicroMsg.NormalProfileHeaderPreference"
            if (r3 != 0) goto L_0x0015
            java.lang.String r1 = "[onBindView] never attach!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
            return
        L_0x0015:
            java.lang.Object r3 = r32.getTag()
            if (r3 != 0) goto L_0x0023
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r3 = new com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c
            r3.<init>(r1)
            r1.setTag(r3)
        L_0x0023:
            java.lang.Object r1 = r32.getTag()
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r1 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.C70150c) r1
            java.lang.Class<ln.f> r3 = p196ln.C76705f.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.f r3 = (p196ln.C76705f) r3
            com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView r5 = r1.f202613q
            com.tencent.mm.storage.z1 r6 = r0.f202571K
            java.lang.String r6 = r6.getUsername()
            r3.mo106849z(r5, r6)
            java.lang.Class<vd2.d> r3 = vd2.C78384d.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            vd2.d r3 = (vd2.C78384d) r3
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            com.tencent.mm.storage.z1 r6 = r0.f202571K
            java.lang.String r6 = r6.getUsername()
            r7 = 5
            boolean r3 = r3.mo108127cu(r7, r5, r6)
            if (r3 == 0) goto L_0x0085
            com.tencent.mm.storage.z1 r3 = r0.f202571K
            boolean r3 = r3.mo62927s3()
            if (r3 == 0) goto L_0x007b
            com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView r3 = r1.f202613q
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            r3.setTagUsername(r5)
            com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView r3 = r1.f202613q
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            r3.setTagTalker(r5)
            com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView r3 = r1.f202613q
            r3.setTagScene(r7)
            goto L_0x0085
        L_0x007b:
            com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView r3 = r1.f202613q
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$a r5 = new com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$a
            r5.<init>(r0)
            r3.setOnDoubleClickListener(r5)
        L_0x0085:
            com.tencent.mm.storage.z1 r3 = r0.f202571K
            java.lang.String r3 = r0.mo96612K(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r5 = 2131755869(0x7f10035d, float:1.914263E38)
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0248
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            r3.setVisibility(r7)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            float r3 = r3.getTextSize()
            com.tencent.mm.storage.z1 r8 = r0.f202571K
            java.lang.String r8 = r0.mo96612K(r8)
            android.content.Context r9 = r0.f202574N
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165363(0x7f0700b3, float:1.794494E38)
            float r9 = r9.getDimension(r10)
            int r9 = (int) r9
            android.content.Context r10 = r0.f202574N
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r10 = r10.getDimension(r11)
            int r10 = (int) r10
            int r10 = r10 * 3
            com.tencent.mm.storage.z1 r11 = r0.f202571K
            int r11 = r11.f149500H
            if (r11 == 0) goto L_0x00da
            android.content.Context r11 = r0.f202574N
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r5)
            int r11 = r11.getIntrinsicWidth()
            goto L_0x00db
        L_0x00da:
            r11 = 0
        L_0x00db:
            com.tencent.mm.storage.z1 r12 = r0.f202571K
            boolean r12 = r12.mo62943y3()
            jr2.t r13 = jr2.C99019x.m128974f()
            com.tencent.mm.storage.z1 r14 = r0.f202571K
            java.lang.String r14 = r14.getUsername()
            r15 = r8
            r7 = 5
            os2.m0 r13 = (os2.C11766m0) r13
            boolean r7 = r13.mo11654bD(r14, r7)
            com.tencent.mm.storage.z1 r8 = r0.f202571K
            boolean r8 = r8.mo62934u3()
            bl3.r r13 = bl3.C39818r.f106831a
            android.content.Context r14 = r0.f202574N
            bl3.r$a r13 = r13.mo62443b(r14)
            java.lang.Class<yb2.g> r14 = yb2.C79063g.class
            androidx.lifecycle.i0 r13 = r13.mo75002a(r14)
            yb2.g r13 = (yb2.C79063g) r13
            boolean r13 = r13.f232169d
            android.content.Context r14 = r0.f202574N
            android.content.res.Resources r14 = r14.getResources()
            r5 = 2131165281(0x7f070061, float:1.7944775E38)
            float r5 = r14.getDimension(r5)
            int r5 = (int) r5
            if (r12 == 0) goto L_0x0130
            android.content.Context r12 = r0.f202574N
            android.content.res.Resources r12 = r12.getResources()
            r14 = 2131755408(0x7f100190, float:1.9141694E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r14)
            int r12 = r12.getIntrinsicWidth()
            int r12 = r12 + r5
            int r12 = r12 + r5
            goto L_0x0131
        L_0x0130:
            r12 = r5
        L_0x0131:
            if (r8 == 0) goto L_0x0146
            android.content.Context r8 = r0.f202574N
            android.content.res.Resources r8 = r8.getResources()
            r14 = 2131756850(0x7f100732, float:1.914462E38)
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r14)
            int r8 = r8.getIntrinsicWidth()
            int r12 = r12 + r8
            int r12 = r12 + r5
        L_0x0146:
            if (r7 == 0) goto L_0x015b
            android.content.Context r7 = r0.f202574N
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131755409(0x7f100191, float:1.9141696E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
            int r7 = r7.getIntrinsicWidth()
            int r12 = r12 + r7
            int r12 = r12 + r5
        L_0x015b:
            if (r13 == 0) goto L_0x0179
            android.content.Context r5 = r0.f202574N
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131165337(0x7f070099, float:1.7944888E38)
            int r5 = r5.getDimensionPixelSize(r7)
            int r12 = r12 + r5
            android.content.Context r5 = r0.f202574N
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131165329(0x7f070091, float:1.7944872E38)
            int r5 = r5.getDimensionPixelSize(r7)
            int r12 = r12 + r5
        L_0x0179:
            android.content.Context r5 = r0.f202574N
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            int r5 = r5 - r9
            int r5 = r5 - r10
            int r5 = r5 - r11
            int r5 = r5 - r12
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r9 = 0
            r7[r9] = r8
            java.lang.String r8 = "[onBindView] calculateRemarkNameTvSize:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r7)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r1.f202606j
            r7.setMaxWidth(r5)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r1.f202606j
            di3.d r8 = di3.C86312j.m106911c(r2)
            ny.h r8 = (p629ny.C76979h) r8
            android.content.Context r9 = r0.f202574N
            r10 = r15
            android.text.SpannableString r8 = r8.yp0(r9, r10, r3)
            r7.mo104279b(r8)
            com.tencent.mm.ui.widget.MMNeat7extView r7 = r1.f202606j
            di3.d r8 = di3.C86312j.m106911c(r2)
            ny.h r8 = (p629ny.C76979h) r8
            android.content.Context r9 = r0.f202574N
            android.text.SpannableString r3 = r8.yp0(r9, r10, r3)
            r7.setContentDescription(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            r7 = 2147483647(0x7fffffff, float:NaN)
            yr3.a r3 = r3.mo154990i(r5, r7)
            com.tencent.neattextview.textview.layout.NeatLayout r3 = (com.tencent.neattextview.textview.layout.NeatLayout) r3
            int r3 = r3.f319992L
            if (r3 <= r6) goto L_0x0207
            android.content.Context r3 = r0.f202574N
            float r3 = kg3.C76577a.m92165p(r3)
            android.content.Context r5 = r0.f202574N
            com.tencent.mm.ui.widget.MMNeat7extView r8 = r1.f202606j
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131165655(0x7f0701d7, float:1.7945533E38)
            float r8 = r8.getDimension(r9)
            int r8 = (int) r8
            int r5 = kg3.C76577a.m92152c(r5, r8)
            float r5 = (float) r5
            float r3 = r3 * r5
            com.tencent.mm.ui.widget.MMNeat7extView r5 = r1.f202606j
            r5.setTextSize(r3)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            di3.d r5 = di3.C86312j.m106911c(r2)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r8 = r0.f202574N
            com.tencent.mm.ui.widget.MMNeat7extView r9 = r1.f202606j
            float r9 = r9.getTextSize()
            android.text.SpannableString r5 = r5.yp0(r8, r10, r9)
            r3.mo104279b(r5)
        L_0x0207:
            boolean r3 = r0.f202578S
            if (r3 != 0) goto L_0x0228
            boolean r3 = r0.f202579T
            if (r3 == 0) goto L_0x0210
            goto L_0x0228
        L_0x0210:
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            android.content.Context r5 = r0.f202574N
            android.content.res.Resources r5 = r5.getResources()
            r8 = 2131099800(0x7f060098, float:1.7811963E38)
            int r5 = r5.getColor(r8)
            r3.setTextColor(r5)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            r3.setMaxLines(r7)
            goto L_0x023f
        L_0x0228:
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            android.content.Context r5 = r0.f202574N
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r5 = r5.getColor(r7)
            r3.setTextColor(r5)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            r3.setMaxLines(r6)
        L_0x023f:
            com.tencent.mm.ui.widget.MMNeat7extView r3 = r1.f202606j
            android.text.TextPaint r3 = r3.getPaint()
            r3.setFakeBoldText(r6)
        L_0x0248:
            android.content.Context r3 = r0.f202574N
            android.app.Activity r3 = (android.app.Activity) r3
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r5 = "Contact_Distance"
            java.lang.String r3 = r3.getStringExtra(r5)
            android.content.Context r5 = r0.f202574N
            android.app.Activity r5 = (android.app.Activity) r5
            android.content.Intent r5 = r5.getIntent()
            java.lang.String r7 = "Contact_IsLBSFriend"
            r8 = 0
            boolean r5 = r5.getBooleanExtra(r7, r8)
            r7 = 2131824115(0x7f110df3, float:1.9281049E38)
            r8 = 8
            if (r5 == 0) goto L_0x0293
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r5 != 0) goto L_0x0293
            android.widget.TextView r5 = r1.f202611o
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.Context r10 = r0.f202574N
            java.lang.String r10 = r10.getString(r7)
            r9.append(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r5.setText(r9)
            android.widget.TextView r5 = r1.f202611o
            r9 = 0
            r5.setVisibility(r9)
            goto L_0x0298
        L_0x0293:
            android.widget.TextView r5 = r1.f202611o
            r5.setVisibility(r8)
        L_0x0298:
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85843n5(r5)
            r9 = 2131099650(0x7f060002, float:1.781166E38)
            if (r5 == 0) goto L_0x02be
            android.widget.TextView r5 = r1.f202605i
            r10 = 0
            r5.setVisibility(r10)
            android.widget.TextView r5 = r1.f202605i
            com.tencent.mm.storage.z1 r10 = r0.f202571K
            java.lang.String r10 = qe0.C47806g.m53116a(r10)
            r5.setText(r10)
            android.view.View r5 = r1.f202622z
            r5.setBackgroundResource(r9)
            goto L_0x030e
        L_0x02be:
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85846q5(r5)
            if (r5 == 0) goto L_0x030e
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = qe0.C47806g.m53117b(r5)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r10 != 0) goto L_0x02e2
            android.widget.TextView r10 = r1.f202605i
            r11 = 0
            r10.setVisibility(r11)
            android.widget.TextView r10 = r1.f202605i
            r10.setText(r5)
            goto L_0x02e7
        L_0x02e2:
            android.widget.TextView r5 = r1.f202605i
            r5.setVisibility(r8)
        L_0x02e7:
            android.view.View r5 = r1.f202622z
            r5.setBackgroundResource(r9)
            android.widget.LinearLayout r5 = r1.f202616t
            int r10 = r5.getPaddingLeft()
            android.widget.LinearLayout r11 = r1.f202616t
            int r11 = r11.getPaddingTop()
            android.widget.LinearLayout r12 = r1.f202616t
            int r12 = r12.getPaddingRight()
            android.content.Context r13 = r0.f121274d
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r13 = r13.getDimensionPixelSize(r14)
            r5.setPadding(r10, r11, r12, r13)
        L_0x030e:
            boolean r5 = r0.f202581V
            if (r5 != 0) goto L_0x0317
            android.view.View r5 = r1.f202622z
            r5.setBackgroundResource(r9)
        L_0x0317:
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getNickname()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0378
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.mo73969n2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0378
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85811N4(r5)
            if (r5 == 0) goto L_0x033c
            goto L_0x0378
        L_0x033c:
            android.widget.TextView r5 = r1.f202604h
            r9 = 0
            r5.setVisibility(r9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.Context r9 = r0.f121274d
            r10 = 2131824222(0x7f110e5e, float:1.9281266E38)
            java.lang.String r9 = r9.getString(r10)
            r5.append(r9)
            com.tencent.mm.storage.z1 r9 = r0.f202571K
            java.lang.String r9 = r9.getNickname()
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            android.widget.TextView r9 = r1.f202604h
            di3.d r10 = di3.C86312j.m106911c(r2)
            ny.h r10 = (p629ny.C76979h) r10
            android.content.Context r11 = r0.f202574N
            android.widget.TextView r12 = r1.f202604h
            float r12 = r12.getTextSize()
            android.text.SpannableString r5 = r10.yp0(r11, r5, r12)
            r9.setText(r5)
            goto L_0x037d
        L_0x0378:
            android.widget.TextView r5 = r1.f202604h
            r5.setVisibility(r8)
        L_0x037d:
            java.lang.String r5 = r0.f202572L
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            java.lang.String r9 = "Contact_Scene"
            if (r5 != 0) goto L_0x03d5
            android.content.Context r5 = r0.f202574N
            android.app.Activity r5 = (android.app.Activity) r5
            android.content.Intent r5 = r5.getIntent()
            r10 = -1
            int r5 = r5.getIntExtra(r9, r10)
            r10 = 14
            if (r5 != r10) goto L_0x039a
            r5 = 1
            goto L_0x039b
        L_0x039a:
            r5 = 0
        L_0x039b:
            if (r5 == 0) goto L_0x03d5
            android.widget.TextView r5 = r1.f202607k
            r10 = 0
            r5.setVisibility(r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.Context r10 = r0.f202574N
            r11 = 2131824099(0x7f110de3, float:1.9281016E38)
            java.lang.String r10 = r10.getString(r11)
            r5.append(r10)
            java.lang.String r10 = r0.f202572L
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            android.widget.TextView r10 = r1.f202607k
            di3.d r11 = di3.C86312j.m106911c(r2)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r12 = r0.f202574N
            android.widget.TextView r13 = r1.f202604h
            float r13 = r13.getTextSize()
            android.text.SpannableString r5 = r11.yp0(r12, r5, r13)
            r10.setText(r5)
            goto L_0x03da
        L_0x03d5:
            android.widget.TextView r5 = r1.f202607k
            r5.setVisibility(r8)
        L_0x03da:
            android.view.View r5 = r1.f202622z
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$b r10 = new com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$b
            r10.<init>(r1)
            r5.addOnPreDrawListener(r10)
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            qy2.j r10 = r1.f202617u
            android.widget.ImageView r11 = r1.f202621y
            if (r5 == 0) goto L_0x0494
            if (r10 != 0) goto L_0x03f4
            goto L_0x0494
        L_0x03f4:
            java.lang.String r5 = r5.getUsername()
            java.lang.String r12 = r0.f202585Z
            boolean r12 = android.text.TextUtils.equals(r12, r5)
            if (r12 == 0) goto L_0x0401
            goto L_0x0406
        L_0x0401:
            r10.mo72650h(r5)
            r0.f202585Z = r5
        L_0x0406:
            boolean r5 = r0.f202579T
            if (r5 == 0) goto L_0x044f
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r10)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r19 = "updateTextStatus"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/Contact;Lcom/tencent/mm/plugin/textstatus/api/IStatusCardView;Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r11
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r10 = 0
            java.lang.Object r5 = r5.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r18 = "updateTextStatus"
            java.lang.String r19 = "(Lcom/tencent/mm/storage/Contact;Lcom/tencent/mm/plugin/textstatus/api/IStatusCardView;Landroid/view/View;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0494
        L_0x044f:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r5.mo10233c(r12)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r19 = "updateTextStatus"
            java.lang.String r20 = "(Lcom/tencent/mm/storage/Contact;Lcom/tencent/mm/plugin/textstatus/api/IStatusCardView;Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r11
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r10 = 0
            java.lang.Object r5 = r5.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r18 = "updateTextStatus"
            java.lang.String r19 = "(Lcom/tencent/mm/storage/Contact;Lcom/tencent/mm/plugin/textstatus/api/IStatusCardView;Landroid/view/View;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0494:
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            boolean r5 = r5.mo62932t3()
            if (r5 == 0) goto L_0x04d4
            android.widget.TextView r5 = r1.f202612p
            r10 = 0
            r5.setVisibility(r10)
            android.widget.TextView r5 = r1.f202612p
            android.content.Context r10 = r0.f202574N
            r11 = 2131824027(0x7f110d9b, float:1.928087E38)
            java.lang.CharSequence r10 = r10.getText(r11)
            r5.setText(r10)
            android.widget.TextView r5 = r1.f202612p
            android.content.Context r10 = r0.f202574N
            r11 = 2131101361(0x7f0606b1, float:1.781513E38)
            int r10 = r10.getColor(r11)
            r5.setTextColor(r10)
            android.widget.TextView r5 = r1.f202604h
            r5.setVisibility(r8)
            android.widget.TextView r5 = r1.f202609m
            r5.setVisibility(r8)
            android.widget.ImageView r5 = r1.f202603g
            r5.setVisibility(r8)
            android.widget.TextView r5 = r1.f202608l
            r5.setVisibility(r8)
            r5 = 1
            goto L_0x04df
        L_0x04d4:
            android.widget.TextView r5 = r1.f202612p
            r5.setVisibility(r8)
            android.widget.TextView r5 = r1.f202609m
            r5.setVisibility(r8)
            r5 = 0
        L_0x04df:
            if (r5 == 0) goto L_0x04f2
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.mm.storage.z1 r2 = r0.f202571K
            java.lang.String r2 = r2.getUsername()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "[onBindView] has delete account! username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
            return
        L_0x04f2:
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.mo62913l2()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x050a
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x0580
        L_0x050a:
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            boolean r5 = r5.mo62927s3()
            if (r5 == 0) goto L_0x0580
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85843n5(r5)
            if (r5 != 0) goto L_0x0580
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85811N4(r5)
            if (r5 != 0) goto L_0x0580
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85846q5(r5)
            if (r5 != 0) goto L_0x0580
            android.widget.TextView r5 = r1.f202608l
            r10 = 0
            r5.setVisibility(r10)
            android.widget.TextView r5 = r1.f202608l
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            android.content.Context r11 = r0.f121274d
            com.tencent.mm.storage.z1 r12 = r0.f202571K
            java.lang.String r12 = r12.getUsername()
            java.lang.String r11 = com.tencent.p014mm.plugin.profile.C70142g.m82630b(r11, r12)
            r10.append(r11)
            com.tencent.mm.storage.z1 r11 = r0.f202571K
            java.lang.String r11 = r11.getUsername()
            com.tencent.mm.storage.z1 r12 = r0.f202571K
            java.lang.String r12 = r12.mo62913l2()
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x056b
            com.tencent.mm.storage.z1 r12 = r0.f202571K
            java.lang.String r12 = r12.getUsername()
            goto L_0x0571
        L_0x056b:
            com.tencent.mm.storage.z1 r12 = r0.f202571K
            java.lang.String r12 = r12.mo62913l2()
        L_0x0571:
            java.lang.String r11 = com.tencent.p014mm.plugin.profile.C70142g.m82631c(r11, r12)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r5.setText(r10)
            goto L_0x0585
        L_0x0580:
            android.widget.TextView r5 = r1.f202608l
            r5.setVisibility(r8)
        L_0x0585:
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            boolean r5 = r5.mo62927s3()
            if (r5 != 0) goto L_0x05fc
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85811N4(r5)
            if (r5 != 0) goto L_0x05fc
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85816S4(r5)
            if (r5 != 0) goto L_0x05fc
            java.lang.Object[] r5 = new java.lang.Object[r6]
            com.tencent.mm.storage.z1 r10 = r0.f202571K
            java.lang.String r10 = r10.getUsername()
            r11 = 0
            r5[r11] = r10
            java.lang.String r10 = "[onBindView] accept contact! username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r10, r5)
            android.view.View r4 = r1.f202620x
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r10)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r19 = "onBindView"
            java.lang.String r20 = "(Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r10 = 0
            java.lang.Object r5 = r5.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r18 = "onBindView"
            java.lang.String r19 = "(Landroid/view/View;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0644
        L_0x05fc:
            android.view.View r4 = r1.f202620x
            if (r4 == 0) goto L_0x0644
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r10)
            java.lang.Object[] r24 = r5.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r26 = "onBindView"
            java.lang.String r27 = "(Landroid/view/View;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r4
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r10 = 0
            java.lang.Object r5 = r5.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r25 = "onBindView"
            java.lang.String r26 = "(Landroid/view/View;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x0644:
            com.tencent.mm.storage.z1 r4 = r0.f202571K
            boolean r4 = r4.mo62927s3()
            if (r4 != 0) goto L_0x065f
            android.content.Context r4 = r0.f202574N
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Intent r4 = r4.getIntent()
            java.lang.String r5 = "User_Verify"
            r10 = 0
            boolean r4 = r4.getBooleanExtra(r5, r10)
            if (r4 == 0) goto L_0x0660
            r4 = 1
            goto L_0x0661
        L_0x065f:
            r10 = 0
        L_0x0660:
            r4 = 0
        L_0x0661:
            if (r4 == 0) goto L_0x06aa
            android.view.View r4 = r1.f202620x
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r5.mo10233c(r11)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r19 = "onBindView"
            java.lang.String r20 = "(Landroid/view/View;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r10 = 0
            java.lang.Object r5 = r5.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r18 = "onBindView"
            java.lang.String r19 = "(Landroid/view/View;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x06f0
        L_0x06aa:
            android.view.View r4 = r1.f202620x
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r10)
            java.lang.Object[] r24 = r5.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r26 = "onBindView"
            java.lang.String r27 = "(Landroid/view/View;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r4
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r10 = 0
            java.lang.Object r5 = r5.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r24 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r25 = "onBindView"
            java.lang.String r26 = "(Landroid/view/View;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x06f0:
            android.content.Context r4 = r0.f202574N
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            int r10 = r0.f202573M
            ae3.b[] r11 = com.tencent.p014mm.plugin.profile.p088ui.C70293u1.m82853a(r4, r5, r10)
            r12 = 2
            if (r11 == 0) goto L_0x0759
            boolean r13 = r5.mo62927s3()
            if (r13 == 0) goto L_0x0704
            goto L_0x0759
        L_0x0704:
            com.tencent.mm.pluginsdk.ui.preference.FMessageListView r13 = r1.f202614r
            com.tencent.mm.pluginsdk.ui.preference.b$c r14 = r0.f202583X
            r13.setGotoSayHiCallBack(r14)
            com.tencent.mm.pluginsdk.ui.preference.FMessageListView r13 = r1.f202614r
            r14 = 0
            r13.setVisibility(r14)
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Intent r4 = r4.getIntent()
            java.lang.String r13 = "Verify_ticket"
            java.lang.String r4 = r4.getStringExtra(r13)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            com.tencent.mm.pluginsdk.ui.preference.b$b r13 = new com.tencent.mm.pluginsdk.ui.preference.b$b
            r13.<init>()
            java.lang.String r14 = r5.getUsername()
            r13.f212466a = r14
            r13.f212467b = r10
            r13.f212468c = r4
            java.lang.String r4 = r5.f149527Z0
            r13.f212470e = r4
            r4 = 0
            r13.f212469d = r4
            r4 = 18
            if (r10 != r4) goto L_0x073e
            r13.f212469d = r6
            goto L_0x0746
        L_0x073e:
            boolean r4 = eb0.C75604z3.m90853y(r10)
            if (r4 == 0) goto L_0x0746
            r13.f212469d = r12
        L_0x0746:
            com.tencent.mm.pluginsdk.ui.preference.FMessageListView r4 = r1.f202614r
            r4.setFMessageArgs(r13)
            int r4 = r11.length
            r5 = 0
        L_0x074d:
            if (r5 >= r4) goto L_0x075e
            r10 = r11[r5]
            com.tencent.mm.pluginsdk.ui.preference.FMessageListView r13 = r1.f202614r
            r13.mo100718a(r10)
            int r5 = r5 + 1
            goto L_0x074d
        L_0x0759:
            com.tencent.mm.pluginsdk.ui.preference.FMessageListView r4 = r1.f202614r
            r4.setVisibility(r8)
        L_0x075e:
            com.tencent.mm.storage.z1 r4 = r0.f202571K
            java.lang.String r4 = r4.f149516U
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x07af
            com.tencent.mm.storage.z1 r4 = r0.f202571K
            java.lang.String r4 = r4.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85843n5(r4)
            if (r4 == 0) goto L_0x0794
            java.lang.Class<ge0.b> r4 = ge0.C32415b.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ge0.b r4 = (ge0.C32415b) r4
            re0.j r4 = r4.Ax0()
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.getUsername()
            long r4 = r4.mo60611Lo(r5)
            r10 = 2
            long r4 = r4 & r10
            r10 = 0
            int r13 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x0794
            goto L_0x07af
        L_0x0794:
            android.widget.TextView r4 = r1.f202609m
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r5 = r0.f202574N
            com.tencent.mm.storage.z1 r10 = r0.f202571K
            java.lang.String r10 = r10.f149516U
            android.text.SpannableString r2 = r2.mo107057T1(r5, r10)
            r4.setText(r2)
            android.widget.TextView r2 = r1.f202609m
            r2.setVisibility(r8)
            goto L_0x07b4
        L_0x07af:
            android.widget.TextView r2 = r1.f202609m
            r2.setVisibility(r8)
        L_0x07b4:
            com.tencent.mm.storage.z1 r2 = r0.f202571K
            java.lang.String r2 = r2.f149518V
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x07c4
            android.widget.TextView r2 = r1.f202610n
            r2.setVisibility(r8)
            goto L_0x0828
        L_0x07c4:
            android.widget.TextView r2 = r1.f202610n
            r4 = 0
            r2.setVisibility(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<d62.i> r4 = d62.C75339i.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            d62.i r4 = (d62.C75339i) r4
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.f149518V
            java.lang.String r4 = r4.K90(r5)
            r2.append(r4)
            com.tencent.mm.storage.z1 r4 = r0.f202571K
            java.lang.String r4 = r4.f149520W
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x07ef
            java.lang.String r4 = ""
            goto L_0x0804
        L_0x07ef:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  "
            r4.append(r5)
            com.tencent.mm.storage.z1 r5 = r0.f202571K
            java.lang.String r5 = r5.f149520W
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x0804:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.widget.TextView r4 = r1.f202610n
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.content.Context r10 = r0.f121274d
            r11 = 2131824195(0x7f110e43, float:1.9281211E38)
            java.lang.String r10 = r10.getString(r11)
            r5.append(r10)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.setText(r2)
        L_0x0828:
            android.widget.ImageView r2 = r1.f202603g
            com.tencent.mm.storage.z1 r4 = r0.f202571K
            r5 = 0
            r2.setVisibility(r5)
            int r4 = r4.f149500H
            java.lang.String r5 = "contact_profile_sex_icon"
            if (r4 != r6) goto L_0x0861
            android.content.Context r4 = r0.f202574N
            r10 = 2131755869(0x7f10035d, float:1.914263E38)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r4, r10)
            r2.setImageDrawable(r4)
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r2 = r2.getContext()
            bl3.r$a r2 = r4.mo62443b(r2)
            java.lang.Class<com.tencent.mm.plugin.profile.ui.y> r4 = com.tencent.p014mm.plugin.profile.p088ui.C5023y.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
            com.tencent.mm.plugin.profile.ui.y r2 = (com.tencent.p014mm.plugin.profile.p088ui.C5023y) r2
            android.content.Context r4 = r0.f121274d
            r10 = 2131834188(0x7f11354c, float:1.930148E38)
            java.lang.String r4 = r4.getString(r10)
            r2.setValue(r5, r4)
            goto L_0x0893
        L_0x0861:
            if (r4 != r12) goto L_0x088e
            android.content.Context r4 = r0.f202574N
            r10 = 2131755868(0x7f10035c, float:1.9142627E38)
            android.graphics.drawable.Drawable r4 = kg3.C76577a.m92158i(r4, r10)
            r2.setImageDrawable(r4)
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r2 = r2.getContext()
            bl3.r$a r2 = r4.mo62443b(r2)
            java.lang.Class<com.tencent.mm.plugin.profile.ui.y> r4 = com.tencent.p014mm.plugin.profile.p088ui.C5023y.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
            com.tencent.mm.plugin.profile.ui.y r2 = (com.tencent.p014mm.plugin.profile.p088ui.C5023y) r2
            android.content.Context r4 = r0.f121274d
            r10 = 2131834187(0x7f11354b, float:1.9301477E38)
            java.lang.String r4 = r4.getString(r10)
            r2.setValue(r5, r4)
            goto L_0x0893
        L_0x088e:
            if (r4 != 0) goto L_0x0893
            r2.setVisibility(r8)
        L_0x0893:
            android.content.Context r2 = r0.f202574N
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r2 = r2.getIntent()
            r4 = 0
            int r2 = r2.getIntExtra(r9, r4)
            r5 = 26
            if (r5 > r2) goto L_0x08aa
            r5 = 29
            if (r2 > r5) goto L_0x08aa
            r2 = 1
            goto L_0x08ab
        L_0x08aa:
            r2 = 0
        L_0x08ab:
            if (r2 == 0) goto L_0x08d1
            android.widget.TextView r2 = r1.f202611o
            r2.setVisibility(r4)
            android.widget.TextView r2 = r1.f202604h
            r2.setVisibility(r8)
            android.widget.TextView r2 = r1.f202611o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = r0.f202574N
            java.lang.String r5 = r5.getString(r7)
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.setText(r3)
        L_0x08d1:
            com.tencent.mm.storage.z1 r2 = r0.f202571K
            java.lang.String r2 = r2.getUsername()
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85816S4(r2)
            if (r2 != 0) goto L_0x08f6
            android.widget.ImageView r2 = r1.f202619w
            com.tencent.mm.storage.z1 r3 = r0.f202571K
            boolean r3 = r3.mo62934u3()
            if (r3 == 0) goto L_0x08f1
            com.tencent.mm.storage.z1 r3 = r0.f202571K
            boolean r3 = r3.mo62927s3()
            if (r3 == 0) goto L_0x08f1
            r3 = 0
            goto L_0x08f3
        L_0x08f1:
            r3 = 8
        L_0x08f3:
            r2.setVisibility(r3)
        L_0x08f6:
            java.lang.Class<er.n> r2 = p151er.C75651n.class
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r0.f202582W
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            if (r3 != 0) goto L_0x0943
            android.view.View r1 = r1.f202591B
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r4)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r10 = "updateFinderAuthInfo"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V"
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
            java.lang.String r8 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r9 = "updateFinderAuthInfo"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0a22
        L_0x0943:
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r3 = r3.authInfo
            if (r3 == 0) goto L_0x094b
            int r5 = r3.authIconType
            if (r5 > 0) goto L_0x0967
        L_0x094b:
            di3.d r5 = di3.C86312j.m106911c(r2)
            er.n r5 = (p151er.C75651n) r5
            boolean r5 = r5.up0()
            if (r5 == 0) goto L_0x0967
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r3 = new com.tencent.mm.protocal.protobuf.FinderAuthInfo
            r3.<init>()
            r3.authIconType = r6
            java.lang.String r5 = "https://dldir1.qq.com/weixin/checkresupdate/auth_icon_level3_2e2f94615c1e4651a25a7e0446f63135.png"
            r3.authIconUrl = r5
            java.lang.String r5 = "摄影博主"
            r3.authProfession = r5
        L_0x0967:
            di3.d r2 = di3.C86312j.m106911c(r2)
            er.n r2 = (p151er.C75651n) r2
            int r2 = r2.mo55951tw()
            if (r2 == 0) goto L_0x09e0
            if (r3 == 0) goto L_0x09e0
            int r2 = r3.authIconType
            if (r2 > 0) goto L_0x097a
            goto L_0x09e0
        L_0x097a:
            android.view.View r2 = r1.f202591B
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r7)
            java.lang.Object[] r8 = r4.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r10 = "updateFinderAuthInfo"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r2
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r8 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r9 = "updateFinderAuthInfo"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Class<ht1.a5> r2 = ht1.C76243a5.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.a5 r2 = (ht1.C76243a5) r2
            android.widget.ImageView r4 = r1.f202592C
            r5 = 0
            r2.mo13228X(r4, r3, r6, r5)
            android.widget.TextView r2 = r1.f202593D
            java.lang.String r3 = r3.authProfession
            r2.setText(r3)
            android.view.View r1 = r1.f202591B
            com.tencent.mm.plugin.profile.ui.a2 r2 = new com.tencent.mm.plugin.profile.ui.a2
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            goto L_0x0a22
        L_0x09e0:
            android.view.View r1 = r1.f202591B
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r4)
            java.lang.Object[] r4 = r2.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r6 = "updateFinderAuthInfo"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference"
            java.lang.String r5 = "updateFinderAuthInfo"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/profile/ui/NormalProfileHeaderPreference$ViewHolder;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r1
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0a22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.mo1086w(android.view.View):void");
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        if (this.f202576Q == null) {
            this.f202576Q = super.mo1087x(viewGroup);
        }
        return this.f202576Q;
    }

    public NormalProfileHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f202574N = context;
    }

    public NormalProfileHeaderPreference(Context context) {
        super(context);
        this.f202574N = context;
    }
}
