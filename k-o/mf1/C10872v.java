package mf1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fe1.C58961d;
import gy3.C87412m;
import iq1.C60592c;
import iq1.C60593d;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import pf1.C11920q;
import pf1.C11922r;
import rf1.C12982a;
import rx3.C13604l;
import te3.C64284cg;
import vq1.C65866w;

/* renamed from: mf1.v */
public final class C10872v extends C12982a {

    /* renamed from: o */
    public ViewGroup f32461o;

    /* renamed from: p */
    public TextView f32462p;

    /* renamed from: q */
    public WeImageView f32463q;

    /* renamed from: r */
    public boolean f32464r;

    /* renamed from: s */
    public final Runnable f32465s = new C10873a(this);

    /* renamed from: mf1.v$a */
    public static final class C10873a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C10872v f32466d;

        public C10873a(C10872v vVar) {
            this.f32466d = vVar;
        }

        public final void run() {
            this.f32466d.mo11094y(true);
        }
    }

    /* renamed from: mf1.v$b */
    public static final class C10874b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C10872v f32467d;

        /* renamed from: e */
        public final /* synthetic */ int f32468e;

        public C10874b(C10872v vVar, int i) {
            this.f32467d = vVar;
            this.f32468e = i;
        }

        public final void run() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator translationY;
            ViewPropertyAnimator duration;
            ViewPropertyAnimator animate2;
            ViewPropertyAnimator translationY2;
            ViewPropertyAnimator duration2;
            ViewPropertyAnimator animate3;
            ViewPropertyAnimator translationY3;
            ViewPropertyAnimator duration3;
            ViewPropertyAnimator listener;
            C10872v vVar = this.f32467d;
            float f = (float) this.f32468e;
            C60905o oVar = vVar.f37016e;
            Float f2 = null;
            View D = oVar != null ? oVar.mo85812D(C0966R.C0970id.d97) : null;
            C60905o oVar2 = vVar.f37016e;
            View D2 = oVar2 != null ? oVar2.mo85812D(C0966R.C0970id.e6u) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("height=");
            sb.append(f);
            sb.append(", before 1=");
            ViewGroup viewGroup = vVar.f32461o;
            sb.append(viewGroup != null ? Float.valueOf(viewGroup.getTranslationY()) : null);
            sb.append(" 2=");
            sb.append(D != null ? Float.valueOf(D.getTranslationY()) : null);
            sb.append(" 3=");
            if (D2 != null) {
                f2 = Float.valueOf(D2.getTranslationY());
            }
            sb.append(f2);
            Log.m105924i("FeedJumperBigBtnObserver", sb.toString());
            ViewGroup viewGroup2 = vVar.f32461o;
            if (!(viewGroup2 == null || (animate3 = viewGroup2.animate()) == null || (translationY3 = animate3.translationY(f)) == null || (duration3 = translationY3.setDuration(300)) == null || (listener = duration3.setListener(new C10869u(vVar, f, D, D2))) == null)) {
                listener.start();
            }
            if (!(D == null || (animate2 = D.animate()) == null || (translationY2 = animate2.translationY(f)) == null || (duration2 = translationY2.setDuration(300)) == null)) {
                duration2.start();
            }
            if (D2 != null && (animate = D2.animate()) != null && (translationY = animate.translationY(f)) != null && (duration = translationY.setDuration(300)) != null) {
                duration.start();
            }
        }
    }

    /* renamed from: b */
    public void mo11020b(BaseFinderFeed baseFinderFeed, C60905o oVar, View view, C11920q qVar, String str) {
        C60905o oVar2 = oVar;
        View view2 = view;
        C11920q qVar2 = qVar;
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(view2, "jumpView");
        C87412m.m108594g(qVar2, "infoEx");
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        FinderJumpInfo finderJumpInfo = qVar2.f34827a;
        Log.m105924i("FeedJumperBigBtnObserver", "[onBindView] hashCode:" + hashCode() + "holder: " + oVar.hashCode() + " holder position: " + oVar.mo17365l() + " feedId=" + C61926c.m72691p(this.f37014c) + " showPosition=" + qVar2.f34841o + " showStyle=" + qVar2.f34842p + " businessType=" + finderJumpInfo.business_type + " jumpType=" + finderJumpInfo.jumpinfo_type + " title=" + finderJumpInfo.recommend_reason + '|' + finderJumpInfo.wording + " icon_url=" + finderJumpInfo.icon_url + " ext_info=" + finderJumpInfo.ext_info + ' ');
        ViewGroup viewGroup = (ViewGroup) view2.findViewById(C0966R.C0970id.d6z);
        this.f32461o = viewGroup;
        String str2 = null;
        this.f32462p = viewGroup != null ? (TextView) viewGroup.findViewById(C0966R.C0970id.d6y) : null;
        ViewGroup viewGroup2 = this.f32461o;
        this.f32463q = viewGroup2 != null ? (WeImageView) viewGroup2.findViewById(C0966R.C0970id.d6x) : null;
        FinderJumpInfo finderJumpInfo2 = qVar2.f34827a;
        if (2 == finderJumpInfo2.business_type) {
            if (7 == finderJumpInfo2.jumpinfo_type) {
                View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.d97);
                if (findViewById != null) {
                    findViewById.setTranslationY(0.0f);
                }
                View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.e6u);
                if (findViewById2 != null) {
                    findViewById2.setTranslationY(0.0f);
                }
                ViewGroup viewGroup3 = this.f32461o;
                if (viewGroup3 != null) {
                    viewGroup3.setTranslationY(0.0f);
                }
                WeImageView weImageView = this.f32463q;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                C58961d.C58963b bVar = C58961d.f168673a;
                String str3 = baseFinderFeed.mo3513o().field_username;
                C64284cg bizInfo = baseFinderFeed.mo3513o().getBizInfo();
                if (bizInfo != null) {
                    str2 = bizInfo.f182468d;
                }
                if (!C58961d.C58963b.m68836h(bVar, str3, str2, false, false, 12, (Object) null)) {
                    C13604l<Boolean, Boolean> g = C65866w.f189407h.mo89908g(baseFinderFeed.mo3513o().getFeedObject());
                    boolean booleanValue = ((Boolean) g.f38555d).booleanValue();
                    ((Boolean) g.f38556e).booleanValue();
                    mo11094y(booleanValue);
                    ViewGroup viewGroup4 = this.f32461o;
                    if (viewGroup4 != null) {
                        viewGroup4.setVisibility(0);
                    }
                    TextView textView = this.f32462p;
                    if (textView != null) {
                        Context context = oVar2.f173499A;
                        C87412m.m108593f(context, "holder.context");
                        textView.setText(mo11093x(context, qVar2.f34827a.wording, C0966R.string.d_j));
                    }
                    TextView textView2 = this.f32462p;
                    if (textView2 != null) {
                        textView2.setTextColor(oVar2.f173499A.getResources().getColor(C0966R.color.f3585yj));
                    }
                    View findViewById3 = oVar2.f44854d.findViewById(C0966R.C0970id.ec5);
                    if (findViewById3 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(4);
                        View view3 = findViewById3;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    oVar2.f44854d.requestLayout();
                } else {
                    ViewGroup viewGroup5 = this.f32461o;
                    if (viewGroup5 != null) {
                        viewGroup5.setVisibility(8);
                    }
                }
            } else {
                C13604l<Boolean, Boolean> g2 = C65866w.f189407h.mo89908g(baseFinderFeed.mo3513o().getFeedObject());
                boolean booleanValue2 = ((Boolean) g2.f38555d).booleanValue();
                ((Boolean) g2.f38556e).booleanValue();
                mo11094y(booleanValue2);
                ViewGroup viewGroup6 = this.f32461o;
                if (viewGroup6 != null) {
                    viewGroup6.setVisibility(0);
                }
                WeImageView weImageView2 = this.f32463q;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(0);
                }
                TextView textView3 = this.f32462p;
                if (textView3 != null) {
                    Context context2 = oVar2.f173499A;
                    C87412m.m108593f(context2, "holder.context");
                    textView3.setText(mo11093x(context2, qVar2.f34827a.wording, C0966R.string.czz));
                }
            }
            ViewGroup viewGroup7 = this.f32461o;
            if (viewGroup7 != null) {
                viewGroup7.postDelayed(this.f32465s, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                return;
            }
            return;
        }
        ViewGroup viewGroup8 = this.f32461o;
        if (viewGroup8 != null) {
            viewGroup8.setVisibility(0);
        }
        WeImageView weImageView3 = this.f32463q;
        if (weImageView3 != null) {
            weImageView3.setVisibility(0);
        }
        TextView textView4 = this.f32462p;
        if (textView4 != null) {
            Context context3 = oVar2.f173499A;
            C87412m.m108593f(context3, "holder.context");
            textView4.setText(mo11093x(context3, qVar2.f34827a.wording, C0966R.string.czz));
        }
    }

    /* renamed from: k */
    public void mo11089k(C60905o oVar, C11922r rVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(rVar, "action");
        int ordinal = rVar.f34855a.ordinal();
        if (ordinal == 0) {
            mo11094y(true);
        } else if (ordinal == 1) {
            mo11095z(oVar, true);
        } else if (ordinal == 2) {
            mo11095z(oVar, false);
        }
    }

    /* renamed from: l */
    public void mo11090l(C60905o oVar, View view, C11920q qVar) {
        C60592c cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "jumpView");
        C87412m.m108594g(qVar, "infoEx");
        super.mo11090l(oVar, view, qVar);
        FinderJumpInfo finderJumpInfo = qVar.f34827a;
        if (finderJumpInfo.business_type == 2 && finderJumpInfo.jumpinfo_type != 7) {
            C39818r rVar = C39818r.f106831a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            C60593d dVar = (C60593d) rVar.mo62443b(context).mo62449e(C60593d.class);
            if (dVar != null && (cVar = dVar.f172693f) != null) {
                cVar.mo85549a();
                cVar.mo85550b("big_btn_click");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        r8 = r8.mo3513o();
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11091r(jq3.C60905o r8, android.view.View r9, pf1.C11920q r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "jumpView"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "infoEx"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r11, r0)
            super.mo11091r(r8, r9, r10, r11)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r10.f34827a
            int r9 = r8.business_type
            r11 = 1
            r0 = 2
            if (r0 != r9) goto L_0x0057
            r9 = 7
            int r8 = r8.jumpinfo_type
            if (r9 != r8) goto L_0x0057
            fe1.d$b r0 = fe1.C58961d.f168673a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r10.f34830d
            r9 = 0
            if (r8 == 0) goto L_0x0036
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            if (r8 == 0) goto L_0x0036
            java.lang.String r8 = r8.field_username
            r1 = r8
            goto L_0x0037
        L_0x0036:
            r1 = r9
        L_0x0037:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r8 = r10.f34830d
            if (r8 == 0) goto L_0x004b
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            if (r8 == 0) goto L_0x004b
            te3.cg r8 = r8.getBizInfo()
            if (r8 == 0) goto L_0x004b
            java.lang.String r8 = r8.f182468d
            r2 = r8
            goto L_0x004c
        L_0x004b:
            r2 = r9
        L_0x004c:
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            boolean r8 = fe1.C58961d.C58963b.m68836h(r0, r1, r2, r3, r4, r5, r6)
            r8 = r8 ^ r11
            goto L_0x0058
        L_0x0057:
            r8 = 1
        L_0x0058:
            r7.mo11094y(r8)
            r7.f32464r = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mf1.C10872v.mo11091r(jq3.o, android.view.View, pf1.q, java.lang.String):void");
    }

    /* renamed from: s */
    public void mo11092s(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        ViewGroup viewGroup = this.f32461o;
        if (viewGroup != null) {
            viewGroup.removeCallbacks(this.f32465s);
        }
    }

    /* renamed from: x */
    public final String mo11093x(Context context, String str, int i) {
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        String string = context.getString(i);
        C87412m.m108593f(string, "{\n            context.ge…tring(strResId)\n        }");
        return string;
    }

    /* renamed from: y */
    public final void mo11094y(boolean z) {
        int i = (z || this.f32464r) ? C0966R.C0969drawable.f5037uu : C0966R.C0969drawable.f5092wg;
        ViewGroup viewGroup = this.f32461o;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r3 = r0.f34827a;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11095z(jq3.C60905o r6, boolean r7) {
        /*
            r5 = this;
            pf1.q r0 = r5.f37015d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r0.f34827a
            if (r3 == 0) goto L_0x0011
            r4 = 2
            int r3 = r3.business_type
            if (r4 != r3) goto L_0x0011
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            if (r3 == 0) goto L_0x00c9
            if (r0 == 0) goto L_0x0021
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f34827a
            if (r0 == 0) goto L_0x0021
            r3 = 7
            int r0 = r0.jumpinfo_type
            if (r3 != r0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x00c9
            if (r7 == 0) goto L_0x0038
            android.view.ViewGroup r0 = r5.f32461o
            if (r0 == 0) goto L_0x0033
            int r0 = r0.getVisibility()
            r3 = 8
            if (r0 != r3) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x0038
            goto L_0x00c9
        L_0x0038:
            android.content.Context r0 = r6.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165363(0x7f0700b3, float:1.794494E38)
            int r0 = r0.getDimensionPixelSize(r1)
            if (r7 == 0) goto L_0x0089
            android.widget.TextView r7 = r5.f32462p
            if (r7 == 0) goto L_0x0051
            r1 = 2131831218(0x7f1129b2, float:1.9295455E38)
            r7.setText(r1)
        L_0x0051:
            android.widget.TextView r7 = r5.f32462p
            if (r7 == 0) goto L_0x0065
            android.content.Context r1 = r6.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100930(0x7f060502, float:1.7814255E38)
            int r1 = r1.getColor(r2)
            r7.setTextColor(r1)
        L_0x0065:
            android.view.ViewGroup r7 = r5.f32461o
            if (r7 != 0) goto L_0x006a
            goto L_0x007a
        L_0x006a:
            android.content.Context r6 = r6.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r1 = 2131232395(0x7f08068b, float:1.8080898E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r1)
            r7.setBackground(r6)
        L_0x007a:
            android.view.ViewGroup r6 = r5.f32461o
            if (r6 == 0) goto L_0x00c9
            mf1.v$b r7 = new mf1.v$b
            r7.<init>(r5, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.postDelayed(r7, r0)
            goto L_0x00c9
        L_0x0089:
            android.widget.TextView r7 = r5.f32462p
            if (r7 != 0) goto L_0x008e
            goto L_0x00ab
        L_0x008e:
            android.content.Context r0 = r6.f173499A
            java.lang.String r1 = "holder.context"
            gy3.C87412m.m108593f(r0, r1)
            pf1.q r1 = r5.f37015d
            if (r1 == 0) goto L_0x00a0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = r1.f34827a
            if (r1 == 0) goto L_0x00a0
            java.lang.String r1 = r1.wording
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r3 = 2131826668(0x7f1117ec, float:1.9286227E38)
            java.lang.String r0 = r5.mo11093x(r0, r1, r3)
            r7.setText(r0)
        L_0x00ab:
            android.widget.TextView r7 = r5.f32462p
            if (r7 == 0) goto L_0x00bf
            android.content.Context r6 = r6.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131100935(0x7f060507, float:1.7814265E38)
            int r6 = r6.getColor(r0)
            r7.setTextColor(r6)
        L_0x00bf:
            android.view.ViewGroup r6 = r5.f32461o
            if (r6 == 0) goto L_0x00c9
            if (r6 != 0) goto L_0x00c6
            goto L_0x00c9
        L_0x00c6:
            r6.setVisibility(r2)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mf1.C10872v.mo11095z(jq3.o, boolean):void");
    }
}
