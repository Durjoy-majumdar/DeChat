package jz2;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import az2.C39674e;
import b03.C67131h;
import b03.C67132o;
import b03.C67133s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.p136ui.widget.pulldown.NestedBounceView;
import com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusOtherTopicFriendsActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hz2.C60235a;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o40.C61926c;
import p640ox.C77049b;
import p773yy.C66710j;
import qy2.C47894a0;
import qy2.C63347a;
import qy2.C77448f0;
import qy2.C77452i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import rz2.C48201c;
import rz2.C48206h;
import su0.C13781a;
import sx3.C64197v;
import uz2.C52678e0;
import uz2.C52691j0;
import uz2.C78315f0;
import vl3.C102226d;
import vz2.C78501d;
import xk0.C91263b;
import yz2.C53671f;
import yz2.C79217a;
import yz2.C79224c;
import yz2.C79229d;
import yz2.C79255p;
import yz2.C79258q;
import z04.C112551y;
import zp3.C23555k;
import zp3.C23564m;
import zp3.C79406f;

/* renamed from: jz2.b */
public final class C76452b extends C76474e implements C76485k {

    /* renamed from: Q0 */
    public View f223790Q0;

    /* renamed from: R0 */
    public FrameLayout f223791R0;

    /* renamed from: S0 */
    public PullDownListView f223792S0;

    /* renamed from: T0 */
    public TextView f223793T0;

    /* renamed from: U0 */
    public View f223794U0;

    /* renamed from: V0 */
    public View f223795V0;

    /* renamed from: W0 */
    public View f223796W0;

    /* renamed from: X0 */
    public TextView f223797X0;

    /* renamed from: Y0 */
    public C79217a f223798Y0;

    /* renamed from: Z */
    public int f223799Z;

    /* renamed from: Z0 */
    public View f223800Z0;

    /* renamed from: a1 */
    public int f223801a1 = 1;

    /* renamed from: b1 */
    public LongTextView f223802b1;

    /* renamed from: c1 */
    public final C13601g f223803c1 = C36568h.m40985a(new C76456d(this));

    /* renamed from: d1 */
    public final C13601g f223804d1 = C36568h.m40985a(new C76455c(this));

    /* renamed from: e1 */
    public boolean f223805e1;

    /* renamed from: f1 */
    public C67133s f223806f1;

    /* renamed from: g1 */
    public boolean f223807g1;

    /* renamed from: h1 */
    public final C13601g f223808h1 = C36568h.m40985a(new C76453a(this));

    /* renamed from: i1 */
    public float f223809i1;

    /* renamed from: j1 */
    public final C13601g f223810j1 = C36568h.m40985a(new C76469p(this));

    /* renamed from: k1 */
    public final C13601g f223811k1 = C36568h.m40985a(new C76468o(this));

    /* renamed from: l1 */
    public final C13601g f223812l1 = C36568h.m40985a(new C76454b(this));

    /* renamed from: m1 */
    public boolean f223813m1;

    /* renamed from: n1 */
    public long f223814n1;

    /* renamed from: p0 */
    public int f223815p0;

    /* renamed from: x0 */
    public final double f223816x0 = 0.3d;

    /* renamed from: y0 */
    public int f223817y0;

    /* renamed from: jz2.b$a */
    public static final class C76453a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76453a(C76452b bVar) {
            super(0);
            this.f223818d = bVar;
        }

        public Object invoke() {
            return Integer.valueOf(C63347a.m74683a(this.f223818d.mo106716y())[1]);
        }
    }

    /* renamed from: jz2.b$b */
    public static final class C76454b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76454b(C76452b bVar) {
            super(0);
            this.f223819d = bVar;
        }

        public Object invoke() {
            C76452b bVar = this.f223819d;
            View view = bVar.f223800Z0;
            return Integer.valueOf(view != null ? view.getHeight() : C79406f.m96347a(bVar.mo106716y(), 40.0f));
        }
    }

    /* renamed from: jz2.b$c */
    public static final class C76455c extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76455c(C76452b bVar) {
            super(0);
            this.f223820d = bVar;
        }

        public Object invoke() {
            return (FrameLayout) ((View) ((C36570n) this.f223820d.f223803c1).getValue()).findViewById(16908290);
        }
    }

    /* renamed from: jz2.b$d */
    public static final class C76456d extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223821d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76456d(C76452b bVar) {
            super(0);
            this.f223821d = bVar;
        }

        public Object invoke() {
            return ((Activity) this.f223821d.mo106716y()).getWindow().getDecorView();
        }
    }

    /* renamed from: jz2.b$e */
    public static final class C76457e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223822d;

        public C76457e(C76452b bVar) {
            this.f223822d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f223822d.mo106668X()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C76452b bVar = this.f223822d;
            bVar.f223807g1 = true;
            bVar.mo106699N(4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jz2.b$f */
    public static final class C76458f extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C76452b f223823a;

        /* renamed from: b */
        public final /* synthetic */ String f223824b;

        /* renamed from: jz2.b$f$a */
        public static final class C76459a implements C67133s.C67134a {

            /* renamed from: a */
            public final /* synthetic */ View f223825a;

            /* renamed from: b */
            public final /* synthetic */ C67133s f223826b;

            /* renamed from: c */
            public final /* synthetic */ C76452b f223827c;

            public C76459a(View view, C67133s sVar, C76452b bVar) {
                this.f223825a = view;
                this.f223826b = sVar;
                this.f223827c = bVar;
            }

            public void onChange(int i) {
                Log.m105919d("MicroMsg.TextStatus.BaseProfileLoadLogic", "onChange: count:%s view:%s", Integer.valueOf(i), this.f223825a);
                C67133s sVar = this.f223826b;
                if (sVar != null) {
                    sVar.f192758l = null;
                }
                this.f223827c.mo106704T(i);
            }
        }

        public C76458f(C76452b bVar, String str) {
            this.f223823a = bVar;
            this.f223824b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
            r5 = r5.getTextviewSuffixWrapper();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53b(android.view.View r3, long r4, long r6, boolean r8) {
            /*
                r2 = this;
                java.lang.String r4 = "view"
                gy3.C87412m.m108594g(r3, r4)
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
                r6 = 0
                r4[r6] = r5
                jz2.b r5 = r2.f223823a
                com.tencent.mm.plugin.textstatus.ui.LongTextView r5 = r5.f223876g
                if (r5 == 0) goto L_0x0023
                b03.s r5 = r5.getTextviewSuffixWrapper()
                if (r5 == 0) goto L_0x0023
                int r5 = r5.f192751e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                goto L_0x0024
            L_0x0023:
                r5 = 0
            L_0x0024:
                r7 = 1
                r4[r7] = r5
                r5 = 2
                r4[r5] = r3
                java.lang.String r0 = "MicroMsg.TextStatus.BaseProfileLoadLogic"
                java.lang.String r1 = "onViewExposed:  isNotReport isExposed:%s , fullTextLineCount:%s view:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r4)
                if (r8 == 0) goto L_0x006b
                java.lang.String r4 = r2.f223824b
                if (r4 == 0) goto L_0x0040
                int r4 = r4.length()
                if (r4 != 0) goto L_0x003e
                goto L_0x0040
            L_0x003e:
                r4 = 0
                goto L_0x0041
            L_0x0040:
                r4 = 1
            L_0x0041:
                if (r4 != 0) goto L_0x006b
                jz2.b r4 = r2.f223823a
                b03.s r8 = r4.f223806f1
                if (r8 == 0) goto L_0x006b
                boolean r1 = r8.f192752f
                if (r1 == 0) goto L_0x0064
                java.lang.Object[] r5 = new java.lang.Object[r5]
                int r1 = r8.f192751e
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r5[r6] = r1
                r5[r7] = r3
                java.lang.String r3 = "onViewExposed: it.isAfterMeasureFullTextLineCount:%s view:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r5)
                int r3 = r8.f192751e
                r4.mo106704T(r3)
                goto L_0x006b
            L_0x0064:
                jz2.b$f$a r5 = new jz2.b$f$a
                r5.<init>(r3, r8, r4)
                r8.f192758l = r5
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jz2.C76452b.C76458f.mo53b(android.view.View, long, long, boolean):void");
        }
    }

    /* renamed from: jz2.b$g */
    public static final class C76460g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223828d;

        public C76460g(C76452b bVar) {
            this.f223828d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StringBuilder sb = new StringBuilder();
            sb.append("tv.setOnClickListener :  hasClickCollageSuffix:");
            sb.append(this.f223828d.f223807g1);
            sb.append(" isPostOpen:");
            sb.append(this.f223828d.f223865R);
            sb.append(" pullDownListView?.translationY:");
            PullDownListView pullDownListView = this.f223828d.f223792S0;
            sb.append(pullDownListView != null ? Float.valueOf(pullDownListView.getTranslationY()) : null);
            Log.m105924i("MicroMsg.TextStatus.BaseProfileLoadLogic", sb.toString());
            C76452b bVar = this.f223828d;
            if (bVar.f223807g1) {
                bVar.f223807g1 = false;
            } else if (!bVar.f223865R) {
                C32224a<C13598b0> aVar = bVar.f223870W;
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (!bVar.mo106668X()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                this.f223828d.mo106699N(4);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$handleDesc$1$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jz2.b$h */
    public static final class C76461h implements C79258q {

        /* renamed from: a */
        public final /* synthetic */ C76452b f223829a;

        public C76461h(C76452b bVar) {
            this.f223829a = bVar;
        }

        /* renamed from: a */
        public void mo106680a() {
            PullDownListView pullDownListView;
            StringBuilder sb = new StringBuilder();
            sb.append("onExpand: isPostOpen:");
            sb.append(this.f223829a.f223865R);
            sb.append(' ');
            LongTextView longTextView = this.f223829a.f223802b1;
            Integer num = null;
            sb.append(longTextView != null ? Integer.valueOf(longTextView.getVisibility()) : null);
            sb.append(' ');
            TextView textView = this.f223829a.f223797X0;
            if (textView != null) {
                num = Integer.valueOf(textView.getVisibility());
            }
            sb.append(num);
            Log.m105924i("MicroMsg.TextStatus.BaseProfileLoadLogic", sb.toString());
            C76452b bVar = this.f223829a;
            if (!bVar.f223865R && (pullDownListView = bVar.f223792S0) != null) {
                pullDownListView.mo104547p();
            }
            this.f223829a.mo106703S();
            this.f223829a.mo106699N(4);
            TextView textView2 = this.f223829a.f223797X0;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        }
    }

    /* renamed from: jz2.b$i */
    public static final class C76462i implements C79255p {

        /* renamed from: a */
        public final /* synthetic */ C76452b f223830a;

        public C76462i(C76452b bVar) {
            this.f223830a = bVar;
        }

        /* renamed from: a */
        public void mo106681a() {
            StringBuilder sb = new StringBuilder();
            sb.append("onCollapse: isPostOpen:");
            sb.append(this.f223830a.f223865R);
            sb.append(' ');
            LongTextView longTextView = this.f223830a.f223802b1;
            Integer num = null;
            sb.append(longTextView != null ? Integer.valueOf(longTextView.getVisibility()) : null);
            sb.append(' ');
            TextView textView = this.f223830a.f223797X0;
            if (textView != null) {
                num = Integer.valueOf(textView.getVisibility());
            }
            sb.append(num);
            Log.m105924i("MicroMsg.TextStatus.BaseProfileLoadLogic", sb.toString());
            this.f223830a.mo106702R();
            C76452b bVar = this.f223830a;
            if (!bVar.f223865R) {
                LongTextView longTextView2 = bVar.f223802b1;
                boolean z = false;
                if (longTextView2 != null && longTextView2.getVisibility() == 0) {
                    z = true;
                }
                if (!z) {
                    this.f223830a.mo106673g0();
                }
            }
        }
    }

    /* renamed from: jz2.b$j */
    public static final class C76463j implements C67133s.C67135b {

        /* renamed from: a */
        public final /* synthetic */ C76452b f223831a;

        public C76463j(C76452b bVar) {
            this.f223831a = bVar;
        }

        /* renamed from: a */
        public void mo91248a() {
            StringBuilder sb = new StringBuilder();
            sb.append("onCollageEnd: isPostOpen:");
            sb.append(this.f223831a.f223865R);
            sb.append(' ');
            LongTextView longTextView = this.f223831a.f223802b1;
            Integer num = null;
            sb.append(longTextView != null ? Integer.valueOf(longTextView.getVisibility()) : null);
            sb.append(' ');
            TextView textView = this.f223831a.f223797X0;
            if (textView != null) {
                num = Integer.valueOf(textView.getVisibility());
            }
            sb.append(num);
            Log.m105924i("MicroMsg.TextStatus.BaseProfileLoadLogic", sb.toString());
            this.f223831a.mo106706W();
            C76452b bVar = this.f223831a;
            if (bVar.f223865R) {
                LongTextView longTextView2 = bVar.f223802b1;
                if (longTextView2 != null) {
                    longTextView2.setVisibility(4);
                }
                this.f223831a.mo106673g0();
                return;
            }
            LongTextView longTextView3 = bVar.f223802b1;
            boolean z = false;
            if (longTextView3 != null && longTextView3.getVisibility() == 0) {
                z = true;
            }
            if (!z) {
                this.f223831a.mo106673g0();
            }
        }
    }

    /* renamed from: jz2.b$k */
    public static final class C76464k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223832d;

        public C76464k(C76452b bVar) {
            this.f223832d = bVar;
        }

        public final void run() {
            this.f223832d.mo106671e0();
        }
    }

    /* renamed from: jz2.b$l */
    public static final class C76465l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223833d;

        public C76465l(C76452b bVar) {
            this.f223833d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223833d.mo106667U();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jz2.b$m */
    public static final class C76466m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223834d;

        public C76466m(C76452b bVar) {
            this.f223834d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223834d.mo106666O();
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jz2.b$n */
    public static final class C76467n implements View.OnTouchListener {

        /* renamed from: d */
        public boolean f223835d;

        /* renamed from: e */
        public final /* synthetic */ int f223836e;

        /* renamed from: f */
        public final /* synthetic */ C76452b f223837f;

        public C76467n(int i, C76452b bVar) {
            this.f223836e = i;
            this.f223837f = bVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ImageView imageView;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
            boolean z = false;
            if (valueOf != null && valueOf.intValue() == 0) {
                float x = motionEvent.getX();
                if (x >= 0.0f && x < ((float) this.f223836e)) {
                    z = true;
                }
                this.f223835d = z;
                C117292a.m165362h(z, this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return z;
            } else if (valueOf != null && valueOf.intValue() == 1) {
                float x2 = motionEvent.getX();
                if (x2 >= 0.0f && x2 < ((float) this.f223836e) && this.f223835d) {
                    z = true;
                }
                if (z && (imageView = this.f223837f.f223891y) != null) {
                    imageView.performClick();
                }
                C117292a.m165362h(z, this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return z;
            } else {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    /* renamed from: jz2.b$o */
    public static final class C76468o extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223838d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76468o(C76452b bVar) {
            super(0);
            this.f223838d = bVar;
        }

        public Object invoke() {
            return Integer.valueOf(C79406f.m96347a(this.f223838d.mo106716y(), 8.0f));
        }
    }

    /* renamed from: jz2.b$p */
    public static final class C76469p extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76469p(C76452b bVar) {
            super(0);
            this.f223839d = bVar;
        }

        public Object invoke() {
            return Integer.valueOf(C79406f.m96347a(this.f223839d.mo106716y(), 32.0f) + C85875k4.m106198o(this.f223839d.mo106716y()));
        }
    }

    /* renamed from: jz2.b$q */
    public static final class C76470q implements C79229d {

        /* renamed from: a */
        public final /* synthetic */ C76452b f223840a;

        public C76470q(C76452b bVar) {
            this.f223840a = bVar;
        }

        /* renamed from: a */
        public void mo106686a(int i) {
            this.f223840a.mo106675h0(i);
            LongTextView longTextView = this.f223840a.f223802b1;
            if (longTextView != null) {
                longTextView.setFullTextHeightChangeListener((C79229d) null);
            }
        }
    }

    /* renamed from: jz2.b$r */
    public static final class C76471r implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C76452b f223841d;

        public C76471r(C76452b bVar) {
            this.f223841d = bVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i8 - i6 != view.getHeight()) {
                this.f223841d.getClass();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76452b(C47894a0 a0Var) {
        super(a0Var);
        C87412m.m108594g(a0Var, "showParam");
    }

    /* renamed from: E */
    public void mo106662E(String str) {
        CharSequence charSequence;
        super.mo106662E(str);
        int A = mo106690A();
        boolean z = true;
        int i = 0;
        if (str == null || str.length() == 0) {
            mo106704T(0);
        }
        C67133s sVar = this.f223806f1;
        if (C112551y.m153810j((sVar == null || (charSequence = sVar.f192753g) == null) ? null : charSequence.toString(), str, false, 2, (Object) null)) {
            C67133s sVar2 = this.f223806f1;
            if (sVar2 == null || !sVar2.f192752f) {
                z = false;
            }
            if (z) {
                if (sVar2 != null) {
                    i = sVar2.f192751e;
                }
                mo106704T(i);
            }
            Log.m105924i("MicroMsg.TextStatus.BaseProfileLoadLogic", "handleDesc: is same textStatusDesc, return ");
            return;
        }
        TextView textView = this.f223797X0;
        if (textView != null) {
            C67133s sVar3 = new C67133s(textView);
            sVar3.mo91245g(str != null ? str : "");
            sVar3.f192768v = new C67132o(this.f223870W);
            String string = mo106716y().getResources().getString(C0966R.string.me6);
            sVar3.f192759m = null;
            sVar3.f192754h = string;
            if (string != null) {
                sVar3.mo91246i(mo106716y().getResources().getString(C0966R.string.me5).length(), string.length(), C0966R.color.BW_100_Alpha_0_6, new C76457e(this));
            }
            C23564m.m28138h(textView, new C76458f(this, str));
            String string2 = mo106716y().getResources().getString(C0966R.string.me7);
            sVar3.f192760n = null;
            sVar3.f192755i = string2;
            sVar3.f192756j = Integer.valueOf(C0966R.color.BW_100_Alpha_0_6);
            sVar3.f192763q = mo106690A();
            sVar3.f192759m = null;
            sVar3.f192760n = null;
            Transition transition = sVar3.f192764r;
            if (transition != null) {
                LongTextView longTextView = this.f223876g;
                ((TransitionSet) transition).mo145349V(longTextView != null ? longTextView.getAnimationDuration() : 0);
            }
            ViewParent parent = sVar3.f192747a.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            sVar3.f192766t = (ViewGroup) parent;
            sVar3.mo91242c(false);
            textView.setOnClickListener(new C76460g(this));
            this.f223806f1 = sVar3;
        }
        if (this.f223802b1 == null) {
            LongTextView longTextView2 = new LongTextView(mo106716y(), (AttributeSet) null, 0, 6, (C8480h) null);
            this.f223802b1 = longTextView2;
            longTextView2.setInPullDownListView(true);
        }
        LongTextView longTextView3 = this.f223802b1;
        if (longTextView3 != null) {
            longTextView3.setMaxLineCount(A);
            if (str == null) {
                str = "";
            }
            longTextView3.setTextContent(str);
            longTextView3.setSceneRoot(longTextView3.getRootView());
            TextView tvLongText = longTextView3.getTvLongText();
            if (tvLongText != null) {
                ViewGroup.LayoutParams layoutParams = tvLongText.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(longTextView3.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                layoutParams2.setMarginEnd(longTextView3.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                tvLongText.setLayoutParams(layoutParams2);
            }
            TextView tvInvisible = longTextView3.getTvInvisible();
            if (tvInvisible != null) {
                ViewGroup.LayoutParams layoutParams3 = tvInvisible.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(longTextView3.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                layoutParams4.setMarginEnd(longTextView3.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                tvInvisible.setLayoutParams(layoutParams4);
            }
        }
        LongTextView longTextView4 = this.f223802b1;
        if (longTextView4 != null) {
            longTextView4.setOnExpandListener(new C76461h(this));
        }
        LongTextView longTextView5 = this.f223802b1;
        if (longTextView5 != null) {
            longTextView5.setOnCollapseListener(new C76462i(this));
        }
        LongTextView longTextView6 = this.f223802b1;
        if (longTextView6 != null) {
            longTextView6.setOnCollageEndListener(new C76463j(this));
        }
        View view = this.f223866S;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "handleDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "handleDesc", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: F */
    public void mo106663F() {
        EmojiStatusView emojiStatusView;
        super.mo106663F();
        LongTextView longTextView = this.f223802b1;
        if ((longTextView != null ? C87412m.m108589b(longTextView.mo98340c(), Boolean.TRUE) : false) && (emojiStatusView = this.f223861M) != null) {
            emojiStatusView.setVisibility(8);
        }
        int A = mo106690A();
        C67133s sVar = this.f223806f1;
        if (!(sVar == null || sVar.f192763q == A)) {
            sVar.f192763q = A;
            sVar.f192759m = null;
            sVar.f192760n = null;
            sVar.mo91242c(false);
        }
        LongTextView longTextView2 = this.f223802b1;
        if (longTextView2 != null) {
            longTextView2.post(new C76464k(this));
        }
    }

    /* renamed from: G */
    public void mo106664G() {
        C48206h t0 = C39674e.f106452d.mo62255t0();
        C48201c cVar = this.f223860L;
        String str = null;
        if (((ArrayList) t0.mo72967bD(cVar != null ? C66710j.C53637a.m60171a(cVar, false, 1, (Object) null) : null, C64197v.m75534c(this.f223877h))).size() > 0) {
            C78315f0 f0Var = (C78315f0) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(mo106716y(), 9, C78315f0.class);
            int i = f0Var != null && f0Var.f229434j == 5 ? 3 : 4;
            SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
            C67131h hVar = this.f223872Y;
            if (hVar != null && hVar.f192744a) {
                String c = C77448f0.m93391c("squrered", hVar.f192745b);
                Log.m105919d("MicroMsg.TextStatus.TextStatusRedDotHelper", "setSquareRedDotMark() :%s", c);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_SQUARE_RED_DOT_TAG_STRING, c);
            }
            TextStatusOtherTopicFriendsActivity.C30508a.m39108a(TextStatusOtherTopicFriendsActivity.f116976t, mo106716y(), (String) null, i, mo106691B(i), 2, (Object) null);
            String a = C13781a.m13082a();
            C48201c cVar2 = this.f223860L;
            if (cVar2 != null) {
                str = cVar2.field_UserName;
            }
            C78501d.m94806h(C78501d.f229945a, mo106716y(), 28, C87412m.m108589b(a, str) ? "2" : "1", this.f223860L, 0, 0, 0, mo106691B(i), (Integer) null, 368, (Object) null);
            return;
        }
        mo106666O();
    }

    /* renamed from: M */
    public void mo106665M() {
        mo106699N(4);
    }

    /* renamed from: O */
    public boolean mo106666O() {
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        int i = C87412m.m108589b(C13781a.m13082a(), this.f223877h) ? 3 : 4;
        C78501d.m94806h(C78501d.f229945a, mo106716y(), 28, (String) null, this.f223860L, 0, 0, 0, mo106691B(i), (Integer) null, C91263b.CTRL_INDEX, (Object) null);
        C67131h hVar = this.f223872Y;
        if (hVar != null && hVar.f192744a) {
            String c = C77448f0.m93391c("squrered", hVar.f192745b);
            Log.m105919d("MicroMsg.TextStatus.TextStatusRedDotHelper", "setSquareRedDotMark() :%s", c);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_SQUARE_RED_DOT_TAG_STRING, c);
        }
        TextStatusOtherTopicFriendsActivity.C30508a.m39108a(TextStatusOtherTopicFriendsActivity.f116976t, mo106716y(), (String) null, i, mo106691B(i), 2, (Object) null);
        return true;
    }

    /* renamed from: U */
    public void mo106667U() {
        mo106693D(false);
        super.mo106667U();
    }

    /* renamed from: X */
    public boolean mo106668X() {
        PullDownListView pullDownListView;
        StringBuilder sb = new StringBuilder();
        sb.append("suffixOnClick: isPostOpen:");
        sb.append(this.f223865R);
        sb.append(' ');
        LongTextView longTextView = this.f223802b1;
        Float f = null;
        sb.append(longTextView != null ? Integer.valueOf(longTextView.getVisibility()) : null);
        sb.append(' ');
        TextView textView = this.f223797X0;
        sb.append(textView != null ? Integer.valueOf(textView.getVisibility()) : null);
        sb.append(" fullTextHeight:");
        LongTextView longTextView2 = this.f223802b1;
        sb.append(longTextView2 != null ? Integer.valueOf(longTextView2.getFullTextHeight()) : null);
        sb.append(' ');
        PullDownListView pullDownListView2 = this.f223792S0;
        if (pullDownListView2 != null) {
            f = Float.valueOf(pullDownListView2.getTranslationY());
        }
        sb.append(f);
        Log.m105924i("MicroMsg.TextStatus.BaseProfileLoadLogic", sb.toString());
        if (this.f223865R && (pullDownListView = this.f223792S0) != null && ((double) pullDownListView.getTranslationY()) <= 0.0d) {
            return false;
        }
        if (!this.f223865R) {
            mo106669c0();
            mo106671e0();
            LongTextView longTextView3 = this.f223802b1;
            if (longTextView3 != null) {
                if (longTextView3.getFullTextHeight() > 0) {
                    mo106675h0(longTextView3.getFullTextHeight());
                } else {
                    LongTextView longTextView4 = this.f223802b1;
                    if (longTextView4 != null) {
                        longTextView4.setFullTextHeightChangeListener(new C76470q(this));
                    }
                }
            }
            C78501d.m94806h(C78501d.f229945a, mo106716y(), 81, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
        } else {
            LongTextView longTextView5 = this.f223802b1;
            if (longTextView5 != null) {
                longTextView5.setVisibility(0);
            }
            TextView textView2 = this.f223797X0;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            LongTextView longTextView6 = this.f223802b1;
            if (longTextView6 != null) {
                longTextView6.mo98339b(true);
            }
            C78501d.m94806h(C78501d.f229945a, mo106716y(), 82, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo106661a(String str, C48201c cVar, C52691j0 j0Var) {
        int A;
        C52678e0 a;
        C78315f0 f0Var;
        String str2;
        String str3 = str;
        Class cls = C78315f0.class;
        Class cls2 = C77049b.class;
        C87412m.m108594g(str3, "username");
        boolean a2 = super.mo106661a(str, cVar, j0Var);
        TextView textView = this.f223867T;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C48201c cVar2 = this.f223860L;
        CharSequence charSequence = null;
        boolean z = true;
        if (cVar2 != null) {
            C39674e eVar = C39674e.f106452d;
            int size = ((ArrayList) eVar.mo62255t0().mo72967bD(C66710j.C53637a.m60171a(cVar2, false, 1, (Object) null), C64197v.m75534c(str3))).size();
            int TE = IStatusIconHelperKt.m39109a().mo62279I() ? eVar.mo62255t0().mo72965TE(C13781a.m13082a()) : 0;
            if (!this.f223873d.mo72635a(4) || ((size <= 0 || IStatusIconHelperKt.m39109a().mo62279I()) && (TE <= 0 || !IStatusIconHelperKt.m39109a().mo62279I()))) {
                this.f223813m1 = false;
            } else {
                Log.m105924i("MicroMsg.TextStatus.BaseProfileLoadLogic", "sameTopicSize " + size + " allFriendsTopicSize:" + TE);
                TextView textView2 = this.f223878i;
                if (textView2 != null) {
                    if (IStatusIconHelperKt.m39109a().mo62279I()) {
                        String string = mo106716y().getString(C0966R.string.k0e, new Object[]{Integer.valueOf(TE)});
                        C87412m.m108593f(string, "context.getString(R.stri…unt, allFriendsTopicSize)");
                        str2 = String.format(string, Arrays.copyOf(new Object[0], 0));
                        C87412m.m108593f(str2, "format(format, *args)");
                    } else if (IStatusIconHelperKt.m39109a().mo62275E()) {
                        String string2 = mo106716y().getString(C0966R.string.k0e, new Object[]{Integer.valueOf(size)});
                        C87412m.m108593f(string2, "context.getString(R.stri…end_count, sameTopicSize)");
                        str2 = String.format(string2, Arrays.copyOf(new Object[0], 0));
                        C87412m.m108593f(str2, "format(format, *args)");
                    } else {
                        str2 = IStatusIconHelperKt.m39109a().mo62291c(C66710j.C53637a.m60171a(cVar2, false, 1, (Object) null), size, IStatusIconHelperKt.m39109a().mo62301m(C66710j.C53637a.m60171a(cVar2, false, 1, (Object) null)), 1);
                    }
                    textView2.setText(str2);
                }
                this.f223813m1 = true;
                TextView textView3 = this.f223878i;
                if (textView3 != null) {
                    textView3.setAlpha(1.0f);
                }
                TextView textView4 = this.f223878i;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                C78315f0 f0Var2 = (C78315f0) ((C77049b) C86312j.m106911c(cls2)).Wi0(mo106716y(), 9, cls);
                if (f0Var2 != null) {
                    f0Var2.f229432h = size;
                }
            }
            if (this.f223813m1) {
                ImageView imageView = this.f223891y;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
            } else {
                ImageView imageView2 = this.f223891y;
                if (imageView2 != null) {
                    C87412m.m108593f(cVar2.field_IconID, "info.field_IconID");
                    imageView2.setAlpha(1.0f);
                }
            }
            if (a2 && (f0Var = (C78315f0) ((C77049b) C86312j.m106911c(cls2)).Wi0(mo106716y(), 9, cls)) != null) {
                f0Var.f229437p = this.f223801a1;
            }
            View view = this.f223796W0;
            if (view != null) {
                int i = (!a2 || C79224c.m95930b(cVar2, mo106711c())) ? 8 : 0;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "update", "(Ljava/lang/String;Lcom/tencent/mm/plugin/textstatus/model/storage/TextStatusItem;Lcom/tencent/mm/plugin/textstatus/proto/TextStatusCardShowExtraParam;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (a2) {
            View view3 = this.f223859K;
            if (view3 != null) {
                view3.addOnLayoutChangeListener(new C76471r(this));
            }
            String d = (cVar2 == null || (a = C66710j.C53637a.m60171a(cVar2, false, 1, (Object) null)) == null) ? null : C60235a.m70504d(a);
            if (!(d == null || C112551y.m153811k(d))) {
                C77452i z2 = mo106711c();
                FrameLayout frameLayout = this.f223791R0;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                FrameLayout frameLayout2 = this.f223791R0;
                Boolean valueOf = frameLayout2 == null ? Boolean.FALSE : z2 != null ? Boolean.valueOf(z2.mo84149o(frameLayout2)) : null;
                if (z2 != null) {
                    charSequence = z2.mo84143f();
                }
                if (C87412m.m108589b(valueOf, Boolean.TRUE)) {
                    if (charSequence != null && !C112551y.m153811k(charSequence)) {
                        z = false;
                    }
                    if (!z) {
                        TextView textView5 = this.f223793T0;
                        if (textView5 != null) {
                            textView5.setText(charSequence);
                        }
                        LinearLayout linearLayout = this.f223885s;
                        if (linearLayout != null) {
                            linearLayout.setOnClickListener(new C76472c(z2, this, cVar2));
                        }
                    }
                }
            }
        }
        if (IStatusIconHelperKt.m39109a().mo62278H()) {
            ImageView imageView3 = this.f223891y;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            TextView textView6 = this.f223892z;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
        }
        LongTextView longTextView = this.f223802b1;
        if (!(longTextView == null || longTextView.getMaxLineCount() == (A = mo106690A()))) {
            longTextView.setMaxLineCount(A);
            longTextView.mo98338a(false);
        }
        return a2;
    }

    /* renamed from: c0 */
    public final void mo106669c0() {
        mo106672f0();
        LongTextView longTextView = this.f223802b1;
        if (longTextView != null) {
            longTextView.setVisibility(0);
            ViewGroup rootView = longTextView.getRootView();
            if (rootView != null) {
                rootView.setVisibility(0);
            }
            ((FrameLayout) ((C36570n) this.f223804d1).getValue()).addView(this.f223802b1);
        }
    }

    /* renamed from: d0 */
    public final int mo106670d0() {
        int i;
        Integer num;
        int i2 = 0;
        if (!mo106696J() && !mo106697K() && !mo106695I()) {
            return 0;
        }
        if (mo106696J()) {
            EmojiStatusView emojiStatusView = this.f223861M;
            if (emojiStatusView == null) {
                num = null;
            } else if (emojiStatusView.getVisibility() == 0) {
                num = Integer.valueOf(emojiStatusView.getHeight());
            } else {
                int visibility = emojiStatusView.getVisibility();
                emojiStatusView.setVisibility(4);
                int height = emojiStatusView.getHeight();
                emojiStatusView.setVisibility(visibility);
                num = Integer.valueOf(height);
            }
            i = (num != null ? num.intValue() : C76577a.m92151b(mo106716y(), 80)) + 0;
        } else {
            i = 0;
        }
        if (mo106697K()) {
            TextView textView = this.f223883q;
            i += textView != null ? textView.getHeight() : 0;
        }
        if (!mo106695I()) {
            return i;
        }
        TextView textView2 = this.f223867T;
        if (textView2 != null) {
            i2 = textView2.getHeight();
        }
        return i2 + i;
    }

    /* renamed from: e */
    public void mo96596e() {
    }

    /* renamed from: e0 */
    public final void mo106671e0() {
        CharSequence charSequence;
        TextView textView = this.f223797X0;
        if (textView != null) {
            int intValue = ((Number) ((C36570n) this.f223810j1).getValue()).intValue();
            int intValue2 = (((Number) ((C36570n) this.f223808h1).getValue()).intValue() - ((Number) ((C36570n) this.f223812l1).getValue()).intValue()) - ((Number) ((C36570n) this.f223811k1).getValue()).intValue();
            this.f223799Z = intValue2;
            this.f223815p0 = this.f223865R ? 0 : (intValue2 - (C61926c.m72690o(textView)[1] + textView.getHeight())) - C79406f.m96347a(mo106716y(), 10.0f);
            LongTextView longTextView = this.f223802b1;
            if (longTextView != null) {
                longTextView.setPaddingBottomAfterCollapse(mo106670d0());
                TextView tvLongText = longTextView.getTvLongText();
                if (tvLongText != null) {
                    tvLongText.setMaxLines(mo106690A());
                    C67133s textviewSuffixWrapper = longTextView.getTextviewSuffixWrapper();
                    if (textviewSuffixWrapper == null || (charSequence = textviewSuffixWrapper.f192759m) == null) {
                        charSequence = "";
                    }
                    tvLongText.setText(charSequence);
                    ViewGroup.LayoutParams layoutParams = tvLongText.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin = this.f223815p0;
                    layoutParams2.height = -2;
                    tvLongText.setLayoutParams(layoutParams2);
                }
                longTextView.setRootViewPaddingTop(intValue);
                longTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f223799Z));
            }
        }
    }

    /* renamed from: f0 */
    public final void mo106672f0() {
        if (this.f223802b1 != null) {
            ((FrameLayout) ((C36570n) this.f223804d1).getValue()).removeView(this.f223802b1);
        }
        View findViewById = ((FrameLayout) ((C36570n) this.f223804d1).getValue()).findViewById(C0966R.C0970id.mws);
        if (findViewById != null && (findViewById.getParent() instanceof View)) {
            ViewParent parent = findViewById.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((FrameLayout) ((C36570n) this.f223804d1).getValue()).removeView((View) parent);
        }
    }

    /* renamed from: g0 */
    public final void mo106673g0() {
        TextView textView = this.f223797X0;
        if (textView != null) {
            textView.setVisibility(Util.isNullOrNil(textView.getText()) ? 8 : 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        r2 = r2.f151089f;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo106674h(android.view.View r6) {
        /*
            r5 = this;
            java.lang.Class<zz2.a> r0 = zz2.C53848a.class
            java.lang.String r1 = "contentView"
            gy3.C87412m.m108594g(r6, r1)
            super.mo106674h(r6)
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r2 = r5.mo106716y()
            bl3.r$a r2 = r1.mo62443b(r2)
            bl3.t r2 = r2.mo62449e(r0)
            zz2.a r2 = (zz2.C53848a) r2
            r3 = 0
            if (r2 == 0) goto L_0x0028
            java.lang.ref.WeakReference<com.tencent.mm.ui.widget.listview.PullDownListView> r2 = r2.f151089f
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r2.get()
            com.tencent.mm.ui.widget.listview.PullDownListView r2 = (com.tencent.p014mm.p136ui.widget.listview.PullDownListView) r2
            goto L_0x0029
        L_0x0028:
            r2 = r3
        L_0x0029:
            r5.f223792S0 = r2
            android.content.Context r2 = r5.mo106716y()
            bl3.r$a r1 = r1.mo62443b(r2)
            bl3.t r0 = r1.mo62449e(r0)
            zz2.a r0 = (zz2.C53848a) r0
            if (r0 == 0) goto L_0x0046
            java.lang.ref.WeakReference<yz2.a> r0 = r0.f151087d
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r0.get()
            yz2.a r0 = (yz2.C79217a) r0
            goto L_0x0047
        L_0x0046:
            r0 = r3
        L_0x0047:
            r5.f223798Y0 = r0
            if (r0 == 0) goto L_0x004d
            android.view.View r3 = r0.f232575i
        L_0x004d:
            r5.f223866S = r3
            r0 = 2131316079(0x7f094d6f, float:1.825063E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.f223790Q0 = r0
            r0 = 2131307071(0x7f092a3f, float:1.8232359E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.f223791R0 = r0
            r0 = 2131315674(0x7f094bda, float:1.8249808E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f223793T0 = r0
            r0 = 2131307161(0x7f092a99, float:1.8232542E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.f223794U0 = r0
            r0 = 2131307142(0x7f092a86, float:1.8232503E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.f223795V0 = r0
            r0 = 2131307176(0x7f092aa8, float:1.8232572E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.f223800Z0 = r0
            r0 = 2131315833(0x7f094c79, float:1.825013E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.f223797X0 = r0
            r0 = 2131316067(0x7f094d63, float:1.8250605E38)
            android.view.View r6 = r6.findViewById(r0)
            r5.f223796W0 = r6
            android.view.ViewGroup r6 = r5.f223862N
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x00ab
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x00ab
            r6 = 1
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            if (r6 == 0) goto L_0x00ba
            android.view.ViewGroup r6 = r5.f223862N
            if (r6 == 0) goto L_0x00ba
            jz2.b$l r2 = new jz2.b$l
            r2.<init>(r5)
            r6.setOnClickListener(r2)
        L_0x00ba:
            android.view.View r6 = r5.f223794U0
            if (r6 == 0) goto L_0x00c6
            jz2.b$m r2 = new jz2.b$m
            r2.<init>(r5)
            r6.setOnClickListener(r2)
        L_0x00c6:
            android.widget.FrameLayout r6 = r5.f223791R0
            android.content.Context r2 = r5.mo106716y()
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = kg3.C76577a.m92150a(r2, r3)
            float r2 = (float) r2
            r3 = 12
            r4 = r3 & 4
            if (r4 == 0) goto L_0x00db
            r4 = 1
            goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            r3 = r3 & 8
            if (r3 == 0) goto L_0x00e1
            r0 = 1
        L_0x00e1:
            if (r6 != 0) goto L_0x00e4
            goto L_0x00ec
        L_0x00e4:
            b03.c0 r3 = new b03.c0
            r3.<init>(r4, r0, r2)
            r6.setOutlineProvider(r3)
        L_0x00ec:
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f2
        L_0x00ef:
            r6.setClipToOutline(r1)
        L_0x00f2:
            android.content.Context r6 = r5.mo106716y()
            r0 = 20
            int r6 = kg3.C76577a.m92151b(r6, r0)
            android.view.View r0 = r5.f223800Z0
            if (r0 == 0) goto L_0x0108
            jz2.b$n r1 = new jz2.b$n
            r1.<init>(r6, r5)
            r0.setOnTouchListener(r1)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76452b.mo106674h(android.view.View):void");
    }

    /* renamed from: h0 */
    public final void mo106675h0(int i) {
        TextView textView = this.f223797X0;
        if (textView != null) {
            textView.setVisibility(4);
        }
        this.f223817y0 = Math.min(this.f223799Z - ((Number) ((C36570n) this.f223810j1).getValue()).intValue(), i);
        LongTextView longTextView = this.f223802b1;
        if (longTextView != null) {
            NestedScrollView scrollview = longTextView.getScrollview();
            if (scrollview != null) {
                C53671f.m60200a(scrollview, -1);
            }
            NestedBounceView nestedBounceView = longTextView.getNestedBounceView();
            if (nestedBounceView != null) {
                C53671f.m60200a(nestedBounceView, -1);
            }
            Log.m105918d("MicroMsg.TextStatus.BaseProfileLoadLogic", "startExpandLongTextAnimationFromClickSuffix: ");
            ViewPropertyAnimator animate = longTextView.animate();
            if (animate != null) {
                animate.setInterpolator(new AccelerateDecelerateInterpolator());
                animate.setDuration(290);
                TextView textView2 = this.f223797X0;
                animate.setUpdateListener(new C76473d(this, longTextView, textView2 != null ? textView2.getHeight() : 0, C102226d.m134696a(mo106716y(), longTextView.getExpandContent())));
                animate.start();
            }
        }
        mo106703S();
        PullDownListView pullDownListView = this.f223792S0;
        if (pullDownListView != null) {
            pullDownListView.mo104547p();
        }
        this.f223805e1 = true;
    }

    /* renamed from: i */
    public void mo96597i(int i) {
    }

    /* renamed from: n */
    public void mo96598n() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r5 = p773yy.C66710j.C53637a.m60171a(r5, false, 1, (java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostClose() {
        /*
            r25 = this;
            r0 = r25
            long r1 = eb0.C31543z5.m39453c()
            long r3 = r0.f223814n1
            long r1 = r1 - r3
            r3 = 0
            r0.f223865R = r3
            r4 = 1
            r0.f223801a1 = r4
            java.lang.Class<ox.b> r5 = p640ox.C77049b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ox.b r5 = (p640ox.C77049b) r5
            android.content.Context r6 = r25.mo106716y()
            java.lang.Class<uz2.f0> r7 = uz2.C78315f0.class
            r8 = 9
            pe3.a r5 = r5.Wi0(r6, r8, r7)
            uz2.f0 r5 = (uz2.C78315f0) r5
            if (r5 == 0) goto L_0x002b
            int r6 = r0.f223801a1
            r5.f229437p = r6
        L_0x002b:
            android.widget.TextView r5 = r0.f223867T
            r6 = 8
            if (r5 != 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            r5.setVisibility(r6)
        L_0x0035:
            rz2.c r5 = r0.f223860L
            r7 = 0
            if (r5 == 0) goto L_0x004b
            uz2.e0 r5 = p773yy.C66710j.C53637a.m60171a(r5, r3, r4, r7)
            if (r5 == 0) goto L_0x004b
            b03.c r8 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            java.lang.String r5 = r5.f147088e
            boolean r5 = r8.mo62289a(r5)
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            boolean r8 = r0.f223813m1
            if (r8 != 0) goto L_0x005a
            if (r5 != 0) goto L_0x005a
            android.widget.TextView r5 = r0.f223878i
            if (r5 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            r5.setVisibility(r6)
        L_0x005a:
            android.widget.LinearLayout r5 = r0.f223885s
            if (r5 != 0) goto L_0x005f
            goto L_0x0062
        L_0x005f:
            r5.setVisibility(r6)
        L_0x0062:
            rz2.c r5 = r0.f223860L
            if (r5 == 0) goto L_0x006b
            uz2.e0 r5 = p773yy.C66710j.C53637a.m60171a(r5, r3, r4, r7)
            goto L_0x006c
        L_0x006b:
            r5 = r7
        L_0x006c:
            if (r5 == 0) goto L_0x0076
            boolean r8 = r0.mo106700P(r5)
            if (r8 != r4) goto L_0x0076
            r8 = 1
            goto L_0x0077
        L_0x0076:
            r8 = 0
        L_0x0077:
            if (r8 == 0) goto L_0x0081
            android.widget.LinearLayout r8 = r0.f223884r
            if (r8 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r8.setVisibility(r3)
        L_0x0081:
            if (r5 == 0) goto L_0x0088
            java.lang.String r5 = hz2.C60235a.m70504d(r5)
            goto L_0x0089
        L_0x0088:
            r5 = r7
        L_0x0089:
            if (r5 == 0) goto L_0x0094
            boolean r5 = z04.C112551y.m153811k(r5)
            if (r5 == 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r5 = 0
            goto L_0x0095
        L_0x0094:
            r5 = 1
        L_0x0095:
            if (r5 != 0) goto L_0x00ec
            qy2.i r5 = r25.mo106711c()
            if (r5 == 0) goto L_0x00a5
            boolean r5 = r5.mo84146j()
            if (r5 != r4) goto L_0x00a5
            r5 = 1
            goto L_0x00a6
        L_0x00a5:
            r5 = 0
        L_0x00a6:
            if (r5 == 0) goto L_0x00ec
            com.tencent.mm.plugin.textstatus.ui.LongTextView r5 = r0.f223876g
            if (r5 == 0) goto L_0x00af
            jz2.C9549j.m9236b(r5)
        L_0x00af:
            android.view.View r5 = r0.f223794U0
            if (r5 == 0) goto L_0x00b6
            jz2.C9549j.m9236b(r5)
        L_0x00b6:
            android.view.View r5 = r0.f223795V0
            if (r5 == 0) goto L_0x00bd
            jz2.C9549j.m9236b(r5)
        L_0x00bd:
            android.widget.TextView r5 = r0.f223883q
            if (r5 == 0) goto L_0x00c4
            jz2.C9549j.m9236b(r5)
        L_0x00c4:
            java.lang.String r5 = r0.f223877h
            java.lang.String r8 = su0.C13781a.m13082a()
            boolean r5 = gy3.C87412m.m108589b(r5, r8)
            if (r5 == 0) goto L_0x00ec
            android.widget.ImageView r5 = r25.mo106715x()
            jz2.C9549j.m9236b(r5)
            android.widget.TextView r5 = r25.mo106692C()
            jz2.C9549j.m9236b(r5)
            android.view.View r5 = r0.f223890x
            if (r5 == 0) goto L_0x00e5
            jz2.C9549j.m9236b(r5)
        L_0x00e5:
            android.widget.TextView r5 = r0.f223850B
            if (r5 == 0) goto L_0x00ec
            jz2.C9549j.m9236b(r5)
        L_0x00ec:
            vz2.d r5 = vz2.C78501d.f229945a
            r8 = r5
            android.content.Context r9 = r25.mo106716y()
            r10 = 65
            r12 = 0
            rz2.c r13 = r0.f223860L
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 500(0x1f4, float:7.0E-43)
            r24 = 0
            vz2.C78501d.m94806h(r8, r9, r10, r12, r13, r14, r16, r18, r20, r22, r23, r24)
            rz2.c r8 = r0.f223860L
            if (r8 == 0) goto L_0x0117
            uz2.e0 r3 = p773yy.C66710j.C53637a.m60171a(r8, r3, r4, r7)
            if (r3 == 0) goto L_0x0117
            java.lang.String r7 = hz2.C60235a.m70504d(r3)
        L_0x0117:
            java.lang.String r3 = "music_player@inner"
            boolean r3 = gy3.C87412m.m108589b(r7, r3)
            if (r3 == 0) goto L_0x0140
            r3 = 5000(0x1388, double:2.4703E-320)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0140
            android.content.Context r9 = r25.mo106716y()
            r10 = 64
            r12 = 0
            rz2.c r13 = r0.f223860L
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 500(0x1f4, float:7.0E-43)
            r24 = 0
            r8 = r5
            vz2.C78501d.m94806h(r8, r9, r10, r12, r13, r14, r16, r18, r20, r22, r23, r24)
        L_0x0140:
            r25.mo106707Y()
            r25.mo106672f0()
            com.tencent.mm.plugin.textstatus.ui.LongTextView r1 = r0.f223802b1
            if (r1 != 0) goto L_0x014b
            goto L_0x014e
        L_0x014b:
            r1.setVisibility(r6)
        L_0x014e:
            r25.mo106673g0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76452b.onPostClose():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r3 = p773yy.C66710j.C53637a.m60171a(r3, false, 1, (java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostOpen(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            java.lang.Class<zz2.b> r1 = zz2.C16421b.class
            long r2 = eb0.C31543z5.m39453c()
            r0.f223814n1 = r2
            r2 = 1
            r0.f223865R = r2
            r3 = 2
            r0.f223801a1 = r3
            java.lang.Class<ox.b> r3 = p640ox.C77049b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ox.b r3 = (p640ox.C77049b) r3
            android.content.Context r4 = r23.mo106716y()
            r5 = 9
            java.lang.Class<uz2.f0> r6 = uz2.C78315f0.class
            pe3.a r3 = r3.Wi0(r4, r5, r6)
            uz2.f0 r3 = (uz2.C78315f0) r3
            if (r3 == 0) goto L_0x002c
            int r4 = r0.f223801a1
            r3.f229437p = r4
        L_0x002c:
            android.widget.TextView r3 = r0.f223878i
            r4 = 0
            if (r3 != 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            r3.setVisibility(r4)
        L_0x0035:
            rz2.c r3 = r0.f223860L
            r5 = 0
            if (r3 == 0) goto L_0x0045
            uz2.e0 r3 = p773yy.C66710j.C53637a.m60171a(r3, r4, r2, r5)
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = hz2.C60235a.m70504d(r3)
            goto L_0x0046
        L_0x0045:
            r3 = r5
        L_0x0046:
            if (r3 == 0) goto L_0x0051
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            goto L_0x0052
        L_0x0051:
            r3 = 1
        L_0x0052:
            if (r3 != 0) goto L_0x00d2
            qy2.i r3 = r23.mo106711c()
            if (r3 == 0) goto L_0x0062
            boolean r3 = r3.mo84146j()
            if (r3 != r2) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            if (r3 == 0) goto L_0x00d2
            qy2.i r3 = r23.mo106711c()
            if (r3 == 0) goto L_0x0070
            boolean r3 = r3.mo87469l()
            goto L_0x0071
        L_0x0070:
            r3 = 1
        L_0x0071:
            if (r3 == 0) goto L_0x0095
            android.widget.TextView r3 = r0.f223867T
            if (r3 != 0) goto L_0x0078
            goto L_0x0095
        L_0x0078:
            if (r3 == 0) goto L_0x007f
            java.lang.CharSequence r6 = r3.getText()
            goto L_0x0080
        L_0x007f:
            r6 = r5
        L_0x0080:
            if (r6 == 0) goto L_0x008b
            boolean r6 = z04.C112551y.m153811k(r6)
            if (r6 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r6 = 0
            goto L_0x008c
        L_0x008b:
            r6 = 1
        L_0x008c:
            if (r6 == 0) goto L_0x0091
            r6 = 8
            goto L_0x0092
        L_0x0091:
            r6 = 0
        L_0x0092:
            r3.setVisibility(r6)
        L_0x0095:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r3 = r0.f223876g
            if (r3 == 0) goto L_0x009c
            jz2.C9549j.m9235a(r3)
        L_0x009c:
            android.view.View r3 = r0.f223795V0
            if (r3 == 0) goto L_0x00a3
            jz2.C9549j.m9235a(r3)
        L_0x00a3:
            android.widget.TextView r3 = r0.f223883q
            if (r3 == 0) goto L_0x00aa
            jz2.C9549j.m9235a(r3)
        L_0x00aa:
            java.lang.String r3 = r0.f223877h
            java.lang.String r6 = su0.C13781a.m13082a()
            boolean r3 = gy3.C87412m.m108589b(r3, r6)
            if (r3 == 0) goto L_0x00d2
            android.widget.ImageView r3 = r23.mo106715x()
            jz2.C9549j.m9235a(r3)
            android.widget.TextView r3 = r0.f223850B
            if (r3 == 0) goto L_0x00c4
            jz2.C9549j.m9235a(r3)
        L_0x00c4:
            android.widget.TextView r3 = r23.mo106692C()
            jz2.C9549j.m9235a(r3)
            android.view.View r3 = r0.f223890x
            if (r3 == 0) goto L_0x00d2
            jz2.C9549j.m9235a(r3)
        L_0x00d2:
            r23.mo106707Y()
            vz2.d r6 = vz2.C78501d.f229945a
            android.content.Context r7 = r23.mo106716y()
            r8 = 42
            r10 = 0
            rz2.c r11 = r0.f223860L
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 500(0x1f4, float:7.0E-43)
            r22 = 0
            vz2.C78501d.m94806h(r6, r7, r8, r10, r11, r12, r14, r16, r18, r20, r21, r22)
            boolean r3 = r0.f223805e1
            r6 = 4
            if (r3 != 0) goto L_0x0190
            r23.mo106669c0()
            r23.mo106671e0()
            com.tencent.mm.plugin.textstatus.ui.LongTextView r3 = r0.f223802b1
            if (r3 == 0) goto L_0x0107
            int r7 = r23.mo106670d0()
            r3.setTextPaddingBottom(r7)
        L_0x0107:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r3 = r0.f223802b1
            if (r3 != 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r3.setVisibility(r6)
        L_0x010f:
            bl3.r r3 = bl3.C39818r.f106831a
            android.content.Context r6 = r23.mo106716y()
            bl3.r$a r3 = r3.mo62443b(r6)
            androidx.lifecycle.i0 r1 = r3.mo75002a(r1)
            zz2.b r1 = (zz2.C16421b) r1
            yz2.a r3 = r0.f223798Y0
            boolean r6 = r3 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x0128
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x0129
        L_0x0128:
            r3 = r5
        L_0x0129:
            rz2.c r6 = r0.f223860L
            if (r6 == 0) goto L_0x0130
            java.lang.String r6 = r6.field_UserName
            goto L_0x0131
        L_0x0130:
            r6 = r5
        L_0x0131:
            r1.mo14880d3(r3, r6)
            boolean r1 = r23.mo106696J()
            if (r1 == 0) goto L_0x0151
            com.tencent.mm.emoji.view.EmojiStatusView r1 = r0.f223861M
            if (r1 == 0) goto L_0x0146
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0146
            r1 = 1
            goto L_0x0147
        L_0x0146:
            r1 = 0
        L_0x0147:
            if (r1 != 0) goto L_0x0151
            com.tencent.mm.emoji.view.EmojiStatusView r1 = r0.f223861M
            if (r1 != 0) goto L_0x014e
            goto L_0x0151
        L_0x014e:
            r1.setVisibility(r4)
        L_0x0151:
            boolean r1 = r23.mo106697K()
            if (r1 == 0) goto L_0x015f
            android.widget.TextView r1 = r0.f223883q
            if (r1 != 0) goto L_0x015c
            goto L_0x015f
        L_0x015c:
            r1.setVisibility(r4)
        L_0x015f:
            rz2.c r1 = r0.f223860L
            if (r1 == 0) goto L_0x0167
            uz2.e0 r5 = p773yy.C66710j.C53637a.m60171a(r1, r4, r2, r5)
        L_0x0167:
            if (r5 == 0) goto L_0x0170
            boolean r1 = r0.mo106700P(r5)
            if (r1 != r2) goto L_0x0170
            goto L_0x0171
        L_0x0170:
            r2 = 0
        L_0x0171:
            if (r2 == 0) goto L_0x017b
            android.widget.LinearLayout r1 = r0.f223884r
            if (r1 != 0) goto L_0x0178
            goto L_0x017b
        L_0x0178:
            r1.setVisibility(r4)
        L_0x017b:
            boolean r1 = r23.mo106695I()
            if (r1 == 0) goto L_0x0189
            android.widget.TextView r1 = r0.f223867T
            if (r1 != 0) goto L_0x0186
            goto L_0x0189
        L_0x0186:
            r1.setVisibility(r4)
        L_0x0189:
            r23.mo106707Y()
            r23.mo106673g0()
            goto L_0x01ae
        L_0x0190:
            r0.mo106699N(r6)
            android.widget.TextView r2 = r0.f223797X0
            if (r2 != 0) goto L_0x0198
            goto L_0x019b
        L_0x0198:
            r2.setVisibility(r6)
        L_0x019b:
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r3 = r23.mo106716y()
            bl3.r$a r2 = r2.mo62443b(r3)
            androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
            zz2.b r1 = (zz2.C16421b) r1
            r1.mo14879c3()
        L_0x01ae:
            r0.f223805e1 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76452b.onPostOpen(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.animate();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreClose() {
        /*
            r3 = this;
            android.view.View r0 = r3.f223790Q0
            if (r0 == 0) goto L_0x0012
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x0012
            r1 = 1041865114(0x3e19999a, float:0.15)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
        L_0x001b:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r0 = r3.f223802b1
            if (r0 != 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            r1 = 4
            r0.setVisibility(r1)
        L_0x0024:
            com.tencent.mm.plugin.textstatus.ui.LongTextView r0 = r3.f223802b1
            if (r0 == 0) goto L_0x002c
            r1 = 0
            r0.mo98338a(r1)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76452b.onPreClose():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.animate();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreOpen() {
        /*
            r3 = this;
            android.view.View r0 = r3.f223790Q0
            if (r0 == 0) goto L_0x0010
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x0010
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 != 0) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76452b.onPreOpen():void");
    }

    /* renamed from: q */
    public void mo96603q(int i) {
    }

    /* renamed from: u */
    public void mo96604u(int i) {
    }

    /* renamed from: v */
    public void mo106676v(float f, float f2, float f3) {
        EmojiStatusView emojiStatusView;
        float f4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? 0.0f : f2 - this.f223809i1;
        this.f223809i1 = f2;
        TextView textView = this.f223797X0;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.f44409A = (f * 0.5f) + 0.5f;
                textView.setLayoutParams(layoutParams2);
            }
        }
        if (f2 < f3 && f4 < 0.0f) {
            LongTextView longTextView = this.f223802b1;
            if (longTextView != null) {
                longTextView.setVisibility(4);
            }
            View view = this.f223866S;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic", "onPullDownProgress", "(FFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo106673g0();
            if (mo106696J() && (emojiStatusView = this.f223861M) != null) {
                emojiStatusView.setVisibility(0);
            }
        }
    }

    /* renamed from: w */
    public void mo106677w() {
        C52678e0 a;
        super.mo106677w();
        if (this.f223801a1 == 2) {
            C48201c cVar = this.f223860L;
            String str = null;
            if (!(cVar == null || (a = C66710j.C53637a.m60171a(cVar, false, 1, (Object) null)) == null)) {
                str = C60235a.m70504d(a);
            }
            if (C87412m.m108589b(str, "music_player@inner")) {
                C78501d.m94806h(C78501d.f229945a, mo106716y(), 63, (String) null, this.f223860L, 0, 0, 0, 0, (Integer) null, 500, (Object) null);
            }
        }
    }
}
