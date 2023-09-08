package rs1;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderFullSeekBarLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C7842n2;
import fy3.C32226l;
import gr1.C59667n2;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8784m2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import jq3.C60905o;
import rx3.C13598b0;
import te3.C50232l93;
import zp3.C23555k;

/* renamed from: rs1.t2 */
public final class C13452t2 extends C13117b implements C8784m2 {

    /* renamed from: n */
    public C50232l93 f38133n;

    /* renamed from: o */
    public int f38134o = C74783i3.m89537a(getContext()).f24704a;

    /* renamed from: p */
    public HashSet<View> f38135p = new HashSet<>();

    /* renamed from: rs1.t2$a */
    public static final class C13453a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C13452t2 f38136d;

        /* renamed from: e */
        public final /* synthetic */ TextView f38137e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f38138f;

        /* renamed from: g */
        public final /* synthetic */ View f38139g;

        /* renamed from: h */
        public final /* synthetic */ View f38140h;

        /* renamed from: i */
        public final /* synthetic */ BaseFinderFeed f38141i;

        /* renamed from: j */
        public final /* synthetic */ String f38142j;

        public C13453a(C13452t2 t2Var, TextView textView, C8479f0<String> f0Var, View view, View view2, BaseFinderFeed baseFinderFeed, String str) {
            this.f38136d = t2Var;
            this.f38137e = textView;
            this.f38138f = f0Var;
            this.f38139g = view;
            this.f38140h = view2;
            this.f38141i = baseFinderFeed;
            this.f38142j = str;
        }

        /* JADX WARNING: type inference failed for: r3v12, types: [rx3.b0] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                te3.l93 r1 = (te3.C50232l93) r1
                java.lang.Class<dx.p> r2 = p145dx.C7523p.class
                r3 = 0
                r4 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                if (r1 == 0) goto L_0x00be
                rs1.t2 r6 = r0.f38136d
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = r0.f38141i
                gy3.f0<java.lang.String> r8 = r0.f38138f
                java.lang.String r9 = r0.f38142j
                r6.f38133n = r1
                di3.d r10 = di3.C86312j.m106911c(r2)
                dx.p r10 = (p145dx.C7523p) r10
                long r11 = r7.getItemId()
                wj2.f r10 = r10.mo8647Xz(r11)
                if (r10 == 0) goto L_0x002d
                boolean r10 = r10.f190102y
                goto L_0x002e
            L_0x002d:
                r10 = 0
            L_0x002e:
                di3.d r11 = di3.C86312j.m106911c(r2)
                dx.p r11 = (p145dx.C7523p) r11
                long r12 = r7.getItemId()
                wj2.f r11 = r11.mo8647Xz(r12)
                if (r11 == 0) goto L_0x0041
                java.lang.String r11 = r11.f190086i
                goto L_0x0042
            L_0x0041:
                r11 = r3
            L_0x0042:
                di3.d r2 = di3.C86312j.m106911c(r2)
                dx.p r2 = (p145dx.C7523p) r2
                long r12 = r7.getItemId()
                wj2.f r2 = r2.mo8647Xz(r12)
                if (r2 == 0) goto L_0x0054
                java.lang.String r3 = r2.f190087j
            L_0x0054:
                java.lang.String r2 = r1.f137266d
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x0068
                te3.l93 r1 = r6.f38133n
                if (r1 == 0) goto L_0x0064
                java.lang.String r1 = r1.f137266d
                if (r1 != 0) goto L_0x0066
            L_0x0064:
                java.lang.String r1 = ""
            L_0x0066:
                r9 = r1
                goto L_0x00ba
            L_0x0068:
                java.lang.String r2 = r1.f137267e
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                java.lang.String r6 = "{\n                    St…tring()\n                }"
                java.lang.String r7 = " - "
                if (r2 != 0) goto L_0x0097
                java.lang.String r2 = r1.f137268f
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x0097
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r1.f137267e
                r2.append(r3)
                r2.append(r7)
                java.lang.String r1 = r1.f137268f
                r2.append(r1)
                java.lang.String r9 = r2.toString()
                gy3.C87412m.m108593f(r9, r6)
                goto L_0x00ba
            L_0x0097:
                if (r10 == 0) goto L_0x00ba
                boolean r1 = android.text.TextUtils.isEmpty(r11)
                if (r1 != 0) goto L_0x00ba
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 != 0) goto L_0x00ba
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                r1.append(r7)
                r1.append(r3)
                java.lang.String r9 = r1.toString()
                gy3.C87412m.m108593f(r9, r6)
            L_0x00ba:
                r8.f27484d = r9
                rx3.b0 r3 = rx3.C13598b0.f38549a
            L_0x00be:
                if (r3 != 0) goto L_0x00c6
                gy3.f0<java.lang.String> r1 = r0.f38138f
                java.lang.String r2 = r0.f38142j
                r1.f27484d = r2
            L_0x00c6:
                android.widget.TextView r1 = r0.f38137e
                android.text.TextPaint r1 = r1.getPaint()
                com.tencent.p014mm.p136ui.C85875k4.m106191k0(r1)
                android.widget.TextView r1 = r0.f38137e
                gy3.f0<java.lang.String> r2 = r0.f38138f
                T r2 = r2.f27484d
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.setText(r2)
                android.widget.TextView r1 = r0.f38137e
                rs1.t2 r2 = r0.f38136d
                android.app.Activity r2 = r2.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131165533(0x7f07015d, float:1.7945286E38)
                float r2 = r2.getDimension(r3)
                r1.setTextSize(r4, r2)
                android.widget.TextView r1 = r0.f38137e
                r1.requestLayout()
                rs1.t2 r1 = r0.f38136d
                int r1 = r1.f38134o
                double r1 = (double) r1
                r6 = 4603579539098121011(0x3fe3333333333333, double:0.6)
                double r1 = r1 * r6
                android.view.View r3 = r0.f38139g
                k20.a r14 = new k20.a
                r14.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r14.mo10233c(r5)
                java.lang.Object[] r7 = r14.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$bindRingtoneData$1"
                java.lang.String r9 = "onChanged"
                java.lang.String r10 = "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r3
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.Object r6 = r14.mo10231a(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r3.setVisibility(r6)
                java.lang.String r7 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$bindRingtoneData$1"
                java.lang.String r8 = "onChanged"
                java.lang.String r9 = "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r6 = r3
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                android.view.View r3 = r0.f38140h
                k20.a r6 = new k20.a
                r6.<init>()
                r6.mo10233c(r5)
                java.lang.Object[] r14 = r6.mo10232b()
                java.lang.String r15 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$bindRingtoneData$1"
                java.lang.String r16 = "onChanged"
                java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V"
                java.lang.String r18 = "android/view/View_EXEC_"
                java.lang.String r19 = "setVisibility"
                java.lang.String r20 = "(I)V"
                r13 = r3
                j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Object r4 = r6.mo10231a(r4)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r3.setVisibility(r4)
                java.lang.String r14 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$bindRingtoneData$1"
                java.lang.String r15 = "onChanged"
                java.lang.String r16 = "(Lcom/tencent/mm/protocal/protobuf/OriginalSoundInfo;)V"
                java.lang.String r17 = "android/view/View_EXEC_"
                java.lang.String r18 = "setVisibility"
                java.lang.String r19 = "(I)V"
                j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
                rs1.t2 r3 = r0.f38136d
                android.view.View r4 = r0.f38140h
                java.lang.String r5 = "ringtoneBubbleLeftLayout"
                gy3.C87412m.m108593f(r4, r5)
                int r3 = r3.mo12624l3(r4)
                double r3 = (double) r3
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 <= 0) goto L_0x01a2
                android.view.View r3 = r0.f38140h
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                int r1 = (int) r1
                r3.width = r1
                android.view.View r1 = r0.f38140h
                r1.setLayoutParams(r3)
                android.view.View r1 = r0.f38140h
                r1.requestLayout()
            L_0x01a2:
                rs1.t2 r1 = r0.f38136d
                android.app.Activity r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131165371(0x7f0700bb, float:1.7944957E38)
                float r1 = r1.getDimension(r2)
                android.view.View r2 = r0.f38139g
                java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout"
                gy3.C87412m.m108592e(r2, r3)
                com.tencent.mm.ui.widget.RoundedCornerFrameLayout r2 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r2
                r2.mo153905b(r1, r1, r1, r1)
                android.view.View r1 = r0.f38139g
                r1.requestLayout()
                rs1.t2 r1 = r0.f38136d
                java.util.HashSet<android.view.View> r1 = r1.f38135p
                android.view.View r2 = r0.f38140h
                r1.add(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13452t2.C13453a.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: rs1.t2$b */
    public static final class C13454b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13452t2 f38143d;

        /* renamed from: e */
        public final /* synthetic */ BaseFinderFeed f38144e;

        /* renamed from: f */
        public final /* synthetic */ C60905o f38145f;

        /* renamed from: rs1.t2$b$a */
        public static final class C13455a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderFullSeekBarLayout f38146d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13455a(FinderFullSeekBarLayout finderFullSeekBarLayout) {
                super(1);
                this.f38146d = finderFullSeekBarLayout;
            }

            public Object invoke(Object obj) {
                ((Boolean) obj).booleanValue();
                this.f38146d.mo4259i("");
                return C13598b0.f38549a;
            }
        }

        public C13454b(C13452t2 t2Var, BaseFinderFeed baseFinderFeed, C60905o oVar) {
            this.f38143d = t2Var;
            this.f38144e = baseFinderFeed;
            this.f38145f = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$bindRingtoneData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C13452t2 t2Var = this.f38143d;
            BaseFinderFeed baseFinderFeed = this.f38144e;
            C50232l93 l932 = t2Var.f38133n;
            String str = null;
            t2Var.mo12617F3(baseFinderFeed, l932 != null ? l932.f137270h : null);
            FinderFullSeekBarLayout finderFullSeekBarLayout = (FinderFullSeekBarLayout) this.f38145f.mo85812D(C0966R.C0970id.eh4);
            C87412m.m108593f(finderFullSeekBarLayout, "fullVideoSeekBar");
            C59667n2.C8415a.m8377a(finderFullSeekBarLayout, (String) null, false, 3, (Object) null);
            C60905o oVar = this.f38145f;
            Context context = oVar.f173499A;
            MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
            if (mMActivity != null) {
                BaseFinderFeed baseFinderFeed2 = this.f38144e;
                C13452t2 t2Var2 = this.f38143d;
                C7842n2 n2Var = C7842n2.f26407a;
                C50232l93 l933 = t2Var2.f38133n;
                if (l933 != null) {
                    str = l933.f137270h;
                }
                n2Var.mo8952a(mMActivity, baseFinderFeed2, 4, false, str, t2Var2.f37344g, t2Var2.f37345h, oVar, new C13455a(finderFullSeekBarLayout));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC$bindRingtoneData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: rs1.t2$c */
    public static final class C13456c extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C13452t2 f38147a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeed f38148b;

        public C13456c(C13452t2 t2Var, BaseFinderFeed baseFinderFeed) {
            this.f38147a = t2Var;
            this.f38148b = baseFinderFeed;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C13452t2 t2Var = this.f38147a;
                BaseFinderFeed baseFinderFeed = this.f38148b;
                C50232l93 l932 = t2Var.f38133n;
                t2Var.mo12618G3(baseFinderFeed, l932 != null ? l932.f137270h : null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13452t2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public View mo12677c3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.f358280md0);
        if (D != null) {
            return D;
        }
        ViewStub viewStub = (ViewStub) oVar.mo85812D(C0966R.C0970id.f358281md1);
        return viewStub != null ? viewStub.inflate() : null;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12622j3(jq3.C60905o r25, java.lang.String r26) {
        /*
            r24 = this;
            r8 = r24
            r9 = r25
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.Object r0 = r9.f173503E
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            r2 = 0
            if (r1 == 0) goto L_0x0014
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            r10 = r0
            goto L_0x0015
        L_0x0014:
            r10 = r2
        L_0x0015:
            if (r10 != 0) goto L_0x0018
            return
        L_0x0018:
            er1.w3 r0 = er1.C58784w3.f168295a
            boolean r0 = r0.mo83933h(r10)
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            android.content.Context r0 = r9.f173499A
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r1 == 0) goto L_0x002a
            r2 = r0
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
        L_0x002a:
            r11 = r2
            if (r11 != 0) goto L_0x002e
            return
        L_0x002e:
            android.view.View r12 = r24.mo12677c3(r25)
            if (r12 != 0) goto L_0x0035
            return
        L_0x0035:
            go1.c r13 = go1.C8368c.f27352a
            int r0 = r25.hashCode()
            go1.a r14 = go1.C8366a.RINGTONE
            boolean r0 = r13.mo9335b(r0, r14)
            r15 = 0
            r7 = 8
            if (r0 != 0) goto L_0x0088
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC"
            java.lang.String r3 = "bindRingtoneData"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/String;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r12
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r9.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC"
            java.lang.String r2 = "bindRingtoneData"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/String;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r12
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0088:
            long r0 = java.lang.System.currentTimeMillis()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LAST_REMIND_TIME_LONG_SYNC
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.mo119677K(r3, r0)
            java.lang.String r6 = ""
            if (r26 != 0) goto L_0x00a3
            r0 = r6
            goto L_0x00a5
        L_0x00a3:
            r0 = r26
        L_0x00a5:
            r8.f37344g = r0
            r0 = 2131310662(0x7f093846, float:1.8239642E38)
            android.view.View r0 = r9.mo85812D(r0)
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r0 = "originalSoundTv"
            gy3.C87412m.m108593f(r5, r0)
            er1.C7919x.m8091a(r5)
            r0 = 2131312548(0x7f093fa4, float:1.8243468E38)
            android.view.View r16 = r9.mo85812D(r0)
            android.content.Context r0 = r9.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131829773(0x7f11240d, float:1.9292525E38)
            java.lang.String r4 = r0.getString(r1)
            java.lang.String r0 = "holder.context.resources…_ringtone_original_sound)"
            gy3.C87412m.m108593f(r4, r0)
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3.mo10233c(r0)
            java.lang.Object[] r1 = r3.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC"
            java.lang.String r17 = "bindRingtoneData"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/String;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r0 = r12
            r22 = r13
            r13 = r3
            r3 = r17
            r17 = r4
            r4 = r18
            r18 = r5
            r5 = r19
            r23 = r6
            r6 = r20
            r7 = r21
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r13.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedRingtoneBubbleUIC"
            java.lang.String r2 = "bindRingtoneData"
            java.lang.String r3 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Ljava/lang/String;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r12
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            gy3.f0 r3 = new gy3.f0
            r3.<init>()
            r0 = r23
            r3.f27484d = r0
            rx3.g r0 = r8.f37346i
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            pf1.n r0 = (pf1.C62273n) r0
            long r1 = r10.getItemId()
            androidx.lifecycle.z r13 = r0.mo87342i3(r1)
            rs1.t2$a r7 = new rs1.t2$a
            r0 = r7
            r1 = r24
            r2 = r18
            r4 = r12
            r5 = r16
            r6 = r10
            r15 = r7
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            o40.C61926c.m72695t(r13, r11, r15)
            r0 = 2131313242(0x7f09425a, float:1.8244875E38)
            android.view.View r0 = r9.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "setRingtoneTv"
            gy3.C87412m.m108593f(r0, r1)
            er1.C7919x.m8091a(r0)
            r1 = 2131312546(0x7f093fa2, float:1.8243464E38)
            android.view.View r1 = r9.mo85812D(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r2 = 2131312545(0x7f093fa1, float:1.8243462E38)
            android.view.View r2 = r9.mo85812D(r2)
            rs1.t2$b r3 = new rs1.t2$b
            r3.<init>(r8, r10, r9)
            r2.setOnClickListener(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFinderObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r4 = r3.objectDesc
            if (r4 != 0) goto L_0x018d
            r3 = 0
            goto L_0x01b2
        L_0x018d:
            java.lang.Class<dx.z> r5 = p145dx.C7527z.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            dx.z r5 = (p145dx.C7527z) r5
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r4 = r4.media
            java.lang.Object r4 = r4.getFirst()
            java.lang.String r6 = "media.media.first"
            gy3.C87412m.m108593f(r4, r6)
            com.tencent.mm.protocal.protobuf.FinderMedia r4 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r4
            wj2.f r3 = r5.sm0(r3, r4)
            java.lang.Class<dx.q> r4 = p145dx.C7524q.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            dx.q r4 = (p145dx.C7524q) r4
            boolean r3 = r4.fo0(r3)
        L_0x01b2:
            r4 = 2131232461(0x7f0806cd, float:1.8081032E38)
            r5 = 2131099927(0x7f060117, float:1.7812221E38)
            if (r3 == 0) goto L_0x01e5
            r3 = 0
            r1.setVisibility(r3)
            android.app.Activity r1 = r24.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131829774(0x7f11240e, float:1.9292527E38)
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            r2.setBackgroundResource(r4)
            android.app.Activity r1 = r24.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r5)
            r0.setTextColor(r1)
            r3 = 8
            goto L_0x020e
        L_0x01e5:
            r3 = 8
            r1.setVisibility(r3)
            android.app.Activity r1 = r24.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r6 = 2131829856(0x7f112460, float:1.9292693E38)
            java.lang.String r1 = r1.getString(r6)
            r0.setText(r1)
            android.app.Activity r1 = r24.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r5)
            r0.setTextColor(r1)
            r2.setBackgroundResource(r4)
        L_0x020e:
            r0 = 2131312553(0x7f093fa9, float:1.8243478E38)
            android.view.View r0 = r9.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.field_finderObject
            int r1 = r1.ringtone_count
            java.lang.String r1 = er1.C7878t0.m8039h(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r10.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.field_finderObject
            int r2 = r2.ringtone_count
            r4 = 1
            if (r2 < r4) goto L_0x0233
            r2 = 0
            r0.setVisibility(r2)
            goto L_0x0237
        L_0x0233:
            r2 = 0
            r0.setVisibility(r3)
        L_0x0237:
            android.app.Activity r3 = r24.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131165444(0x7f070104, float:1.7945105E38)
            float r3 = r3.getDimension(r5)
            r0.setTextSize(r2, r3)
            android.app.Activity r3 = r24.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131829772(0x7f11240c, float:1.9292523E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r1
            java.lang.String r1 = r3.getString(r5, r4)
            r0.setText(r1)
            rs1.t2$c r0 = new rs1.t2$c
            r0.<init>(r8, r10)
            zp3.C23564m.m28138h(r12, r0)
            r0 = r22
            r0.mo9337d(r9, r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13452t2.mo12622j3(jq3.o, java.lang.String):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = C74783i3.m89537a(getContext()).f24704a;
        if (i != this.f38134o) {
            this.f38134o = i;
            double d = ((double) i) * 0.6d;
            for (View view : this.f38135p) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (((double) mo12624l3(view)) > d) {
                    layoutParams.width = (int) d;
                } else {
                    layoutParams.width = -2;
                }
                view.setLayoutParams(layoutParams);
                view.requestLayout();
            }
        }
    }
}
