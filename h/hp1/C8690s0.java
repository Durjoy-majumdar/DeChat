package hp1;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import je1.C9382v4;
import kg3.C76577a;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import te3.C48727ak1;
import te3.C49145dh1;
import te3.C51982xj1;
import zt3.C119157j;

/* renamed from: hp1.s0 */
public final class C8690s0 implements C11385n {

    /* renamed from: d */
    public int f27898d = (C75054z4.m90003a(this.f27901g).x - C76577a.m92157h(this.f27901g, C0966R.dimen.f3758d_));

    /* renamed from: e */
    public int f27899e;

    /* renamed from: f */
    public C9382v4 f27900f;

    /* renamed from: g */
    public MMActivity f27901g;

    /* renamed from: h */
    public LinearLayout f27902h;

    /* renamed from: i */
    public TextView f27903i;

    /* renamed from: j */
    public ListView f27904j;

    /* renamed from: n */
    public C8696f f27905n;

    /* renamed from: o */
    public List<? extends C48727ak1> f27906o;

    /* renamed from: hp1.s0$a */
    public static final class C8691a implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8690s0 f27907d;

        /* renamed from: e */
        public final /* synthetic */ MMActivity f27908e;

        /* renamed from: f */
        public final /* synthetic */ C32228q<C48727ak1, Integer, List<? extends C48727ak1>, C13598b0> f27909f;

        public C8691a(C8690s0 s0Var, MMActivity mMActivity, C32228q<? super C48727ak1, ? super Integer, ? super List<? extends C48727ak1>, C13598b0> qVar) {
            this.f27907d = s0Var;
            this.f27908e = mMActivity;
            this.f27909f = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onItemClick(android.widget.AdapterView<?> r18, android.view.View r19, int r20, long r21) {
            /*
                r17 = this;
                r6 = r17
                r15 = r20
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r18
                r0.add(r1)
                r1 = r19
                r0.add(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
                r0.add(r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r21)
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$1"
                java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r4 = r17
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                hp1.s0 r0 = r6.f27907d
                java.util.List<? extends te3.ak1> r0 = r0.f27906o
                r1 = 0
                if (r0 == 0) goto L_0x0054
                if (r15 < 0) goto L_0x0046
                int r2 = r0.size()
                if (r15 >= r2) goto L_0x0046
                r2 = 1
                goto L_0x0047
            L_0x0046:
                r2 = 0
            L_0x0047:
                if (r2 == 0) goto L_0x004a
                goto L_0x004b
            L_0x004a:
                r0 = r1
            L_0x004b:
                if (r0 == 0) goto L_0x0054
                java.lang.Object r0 = r0.get(r15)
                te3.ak1 r0 = (te3.C48727ak1) r0
                goto L_0x0055
            L_0x0054:
                r0 = r1
            L_0x0055:
                if (r0 == 0) goto L_0x00a6
                com.tencent.mm.ui.MMActivity r2 = r6.f27908e
                fy3.q<te3.ak1, java.lang.Integer, java.util.List<? extends te3.ak1>, rx3.b0> r3 = r6.f27909f
                hp1.s0 r4 = r6.f27907d
                f40.o r5 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r5 = r5.mo121142i()
                com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING
                java.lang.String r8 = ""
                java.lang.String r16 = r5.mo119675I(r7, r8)
                java.lang.Class<dp1.y0> r5 = dp1.C58417y0.class
                di3.d r5 = di3.C86312j.m106911c(r5)
                r7 = r5
                dp1.y0 r7 = (dp1.C58417y0) r7
                java.lang.String r5 = r0.f130586d
                if (r5 != 0) goto L_0x007b
                r5 = r8
            L_0x007b:
                java.lang.String r9 = r0.f130591i
                if (r9 != 0) goto L_0x0080
                r9 = r8
            L_0x0080:
                r11 = 1
                r12 = 1
                r13 = 2
                rs1.s8$a r8 = rs1.C13442s8.f38060Q0
                rs1.s8 r2 = r8.mo12873f(r2)
                if (r2 == 0) goto L_0x008f
                te3.hj1 r1 = r2.mo12861q3()
            L_0x008f:
                r14 = r1
                long r1 = r0.f130593n
                java.lang.String r1 = o40.C61926c.m72691p(r1)
                r8 = r5
                r10 = r20
                r15 = r1
                r7.Fx0(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
                java.util.List<? extends te3.ak1> r2 = r4.f27906o
                r3.invoke(r0, r1, r2)
            L_0x00a6:
                java.lang.String r0 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$1"
                java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r6, r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hp1.C8690s0.C8691a.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: hp1.s0$b */
    public static final class C8692b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f27910d;

        public C8692b(MMActivity mMActivity) {
            this.f27910d = mMActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderPopularListLogic$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            this.f27910d.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: hp1.s0$c */
    public static final class C8693c {
        public C8693c(C8480h hVar) {
        }
    }

    /* renamed from: hp1.s0$d */
    public final class C8694d {

        /* renamed from: a */
        public TextView f27911a;

        /* renamed from: b */
        public TextView f27912b;

        /* renamed from: c */
        public TextView f27913c;

        /* renamed from: d */
        public View f27914d;

        /* renamed from: e */
        public View f27915e;

        public C8694d(C8690s0 s0Var) {
        }

        /* renamed from: a */
        public final TextView mo9540a() {
            TextView textView = this.f27913c;
            if (textView != null) {
                return textView;
            }
            C87412m.m108603p("hintText");
            throw null;
        }

        /* renamed from: b */
        public final TextView mo9541b() {
            TextView textView = this.f27911a;
            if (textView != null) {
                return textView;
            }
            C87412m.m108603p(MimeTypes.BASE_TYPE_TEXT);
            throw null;
        }
    }

    /* renamed from: hp1.s0$e */
    public static final class C8695e {

        /* renamed from: a */
        public static boolean f27916a;

        /* renamed from: b */
        public static int f27917b;

        /* renamed from: c */
        public static C49145dh1 f27918c;
    }

    /* renamed from: hp1.s0$f */
    public final class C8696f extends BaseAdapter {
        public C8696f() {
        }

        public int getCount() {
            List<? extends C48727ak1> list = C8690s0.this.f27906o;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public Object getItem(int i) {
            List<? extends C48727ak1> list = C8690s0.this.f27906o;
            C87412m.m108591d(list);
            return list.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: hp1.s0$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x02b2  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x02fc  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0347  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0365  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r34, android.view.View r35, android.view.ViewGroup r36) {
            /*
                r33 = this;
                r0 = r33
                r1 = r34
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                if (r35 != 0) goto L_0x0076
                gy3.C87412m.m108591d(r36)
                android.content.Context r4 = r36.getContext()
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                r5 = 2131495413(0x7f0c09f5, float:1.8614362E38)
                r6 = r36
                android.view.View r4 = r4.inflate(r5, r6, r2)
                hp1.s0$d r5 = new hp1.s0$d
                hp1.s0 r6 = hp1.C8690s0.this
                r5.<init>(r6)
                r6 = 2131302937(0x7f091a19, float:1.8223974E38)
                android.view.View r6 = r4.findViewById(r6)
                java.lang.String r7 = "contentView.findViewById….id.finder_hot_word_text)"
                gy3.C87412m.m108593f(r6, r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f27911a = r6
                r6 = 2131302936(0x7f091a18, float:1.8223972E38)
                android.view.View r6 = r4.findViewById(r6)
                java.lang.String r7 = "contentView.findViewById…inder_hot_word_last_line)"
                gy3.C87412m.m108593f(r6, r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f27912b = r6
                r6 = 2131305967(0x7f0925ef, float:1.823012E38)
                android.view.View r6 = r4.findViewById(r6)
                java.lang.String r7 = "contentView.findViewById(R.id.hint)"
                gy3.C87412m.m108593f(r6, r7)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f27913c = r6
                r6 = 2131301117(0x7f0912fd, float:1.8220283E38)
                android.view.View r6 = r4.findViewById(r6)
                java.lang.String r7 = "contentView.findViewById(R.id.divider_view)"
                gy3.C87412m.m108593f(r6, r7)
                r5.f27914d = r6
                r6 = 2131302960(0x7f091a30, float:1.822402E38)
                android.view.View r6 = r4.findViewById(r6)
                java.lang.String r7 = "contentView.findViewById…finder_last_line_divider)"
                gy3.C87412m.m108593f(r6, r7)
                r5.f27915e = r6
                r4.setTag(r5)
                goto L_0x0084
            L_0x0076:
                java.lang.Object r4 = r35.getTag()
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderPopularListLogic.HotWordItemHolder"
                gy3.C87412m.m108592e(r4, r5)
                r5 = r4
                hp1.s0$d r5 = (hp1.C8690s0.C8694d) r5
                r4 = r35
            L_0x0084:
                hp1.s0 r6 = hp1.C8690s0.this
                java.util.List<? extends te3.ak1> r6 = r6.f27906o
                gy3.C87412m.m108591d(r6)
                java.lang.Object r6 = r6.get(r1)
                te3.ak1 r6 = (te3.C48727ak1) r6
                java.lang.String r6 = r6.f130586d
                java.lang.String r7 = ""
                if (r6 != 0) goto L_0x0098
                r6 = r7
            L_0x0098:
                hp1.s0 r8 = hp1.C8690s0.this
                java.util.List<? extends te3.ak1> r8 = r8.f27906o
                gy3.C87412m.m108591d(r8)
                java.lang.Object r8 = r8.get(r1)
                te3.ak1 r8 = (te3.C48727ak1) r8
                java.lang.String r15 = r8.f130591i
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                r14 = 4
                r13 = 8
                r12 = 1
                java.lang.String r18 = "lastLineText"
                r19 = 0
                if (r8 == 0) goto L_0x00d7
                android.widget.TextView r7 = r5.mo9541b()
                r7.setVisibility(r2)
                android.widget.TextView r7 = r5.mo9541b()
                r7.setText(r6)
                android.widget.TextView r6 = r5.f27912b
                if (r6 == 0) goto L_0x00d3
                r6.setVisibility(r13)
                android.widget.TextView r6 = r5.mo9540a()
                r6.setVisibility(r13)
                goto L_0x02a5
            L_0x00d3:
                gy3.C87412m.m108603p(r18)
                throw r19
            L_0x00d7:
                hp1.s0 r8 = hp1.C8690s0.this
                int r11 = r8.f27898d
                android.text.StaticLayout r10 = new android.text.StaticLayout
                r16 = 0
                int r17 = r6.length()
                android.widget.TextView r8 = r5.mo9541b()
                android.text.TextPaint r20 = r8.getPaint()
                android.text.Layout$Alignment r21 = android.text.Layout.Alignment.ALIGN_NORMAL
                r22 = 1065353216(0x3f800000, float:1.0)
                r23 = 1065353216(0x3f800000, float:1.0)
                r24 = 1
                r8 = r10
                r9 = r6
                r35 = r10
                r10 = r16
                r36 = r11
                r11 = r17
                r12 = r20
                r20 = 8
                r13 = r36
                r14 = r21
                r26 = r15
                r15 = r22
                r16 = r23
                r17 = r24
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                int r8 = r35.getLineCount()
                if (r8 <= 0) goto L_0x02a5
                int r8 = r35.getLineCount()
                r9 = r35
                r9.getLineEnd(r2)
                r10 = 1
                if (r8 <= r10) goto L_0x0136
                int r11 = r9.getLineCount()
                int r11 = r11 + -2
                int r11 = r9.getLineEnd(r11)
                int r12 = r9.getLineCount()
                int r12 = r12 - r10
                int r9 = r9.getLineEnd(r12)
                goto L_0x0140
            L_0x0136:
                int r11 = r9.getLineCount()
                int r11 = r11 - r10
                int r9 = r9.getLineEnd(r11)
                r11 = 0
            L_0x0140:
                java.lang.String r9 = r6.substring(r11, r9)
                java.lang.String r12 = "this as java.lang.String…ing(startIndex, endIndex)"
                gy3.C87412m.m108593f(r9, r12)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "lastLineText :"
                r13.append(r14)
                r13.append(r9)
                java.lang.String r13 = r13.toString()
                java.lang.String r14 = "Finder.FinderPopularListLogic"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
                android.widget.TextView r13 = r5.f27912b
                if (r13 == 0) goto L_0x02a1
                android.text.TextPaint r13 = r13.getPaint()
                if (r13 == 0) goto L_0x0173
                int r15 = r9.length()
                float r13 = r13.measureText(r9, r2, r15)
                goto L_0x0174
            L_0x0173:
                r13 = 0
            L_0x0174:
                android.widget.TextView r15 = r5.mo9540a()
                android.text.TextPaint r15 = r15.getPaint()
                r10 = r26
                if (r15 == 0) goto L_0x0185
                float r15 = r15.measureText(r10)
                goto L_0x0186
            L_0x0185:
                r15 = 0
            L_0x0186:
                hp1.s0 r2 = hp1.C8690s0.this
                r17 = r4
                java.lang.String r4 = "推荐原因不在同一行"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
                android.widget.TextView r4 = r5.mo9540a()
                r0 = 0
                r4.setVisibility(r0)
                float r13 = r13 + r15
                int r2 = r2.f27899e
                float r2 = (float) r2
                float r13 = r13 + r2
                r2 = r36
                float r2 = (float) r2
                java.lang.String r4 = "lastLineDivider"
                int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                if (r2 <= 0) goto L_0x0218
                android.widget.TextView r2 = r5.mo9541b()
                r2.setVisibility(r0)
                android.widget.TextView r0 = r5.mo9541b()
                r0.setText(r6)
                android.widget.TextView r0 = r5.f27912b
                if (r0 == 0) goto L_0x0214
                r0.setText(r7)
                r2 = 4
                r0.setVisibility(r2)
                android.view.View r0 = r5.f27915e
                if (r0 == 0) goto L_0x0210
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
                r4.mo10233c(r6)
                java.lang.Object[] r26 = r4.mo10232b()
                java.lang.String r27 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter"
                java.lang.String r28 = "setHotWord"
                java.lang.String r29 = "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V"
                java.lang.String r30 = "android/view/View_EXEC_"
                java.lang.String r31 = "setVisibility"
                java.lang.String r32 = "(I)V"
                r25 = r0
                j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
                r6 = 0
                java.lang.Object r4 = r4.mo10231a(r6)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r0.setVisibility(r4)
                java.lang.String r26 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter"
                java.lang.String r27 = "setHotWord"
                java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V"
                java.lang.String r29 = "android/view/View_EXEC_"
                java.lang.String r30 = "setVisibility"
                java.lang.String r31 = "(I)V"
                j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
                android.widget.TextView r0 = r5.mo9540a()
                r0.setText(r10)
                goto L_0x02a8
            L_0x0210:
                gy3.C87412m.m108603p(r4)
                throw r19
            L_0x0214:
                gy3.C87412m.m108603p(r18)
                throw r19
            L_0x0218:
                r2 = 4
                java.lang.String r0 = "推荐原因在同一行"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
                r0 = 1
                if (r8 != r0) goto L_0x022d
                android.widget.TextView r0 = r5.mo9541b()
                r6 = 8
                r0.setVisibility(r6)
                r7 = 0
                goto L_0x0243
            L_0x022d:
                android.widget.TextView r0 = r5.mo9541b()
                r7 = 0
                r0.setVisibility(r7)
                android.widget.TextView r0 = r5.mo9541b()
                java.lang.String r6 = r6.substring(r7, r11)
                gy3.C87412m.m108593f(r6, r12)
                r0.setText(r6)
            L_0x0243:
                android.widget.TextView r0 = r5.f27912b
                if (r0 == 0) goto L_0x029d
                r0.setVisibility(r7)
                r0.setText(r9)
                android.view.View r0 = r5.f27915e
                if (r0 == 0) goto L_0x0299
                k20.a r4 = new k20.a
                r4.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                r4.mo10233c(r3)
                java.lang.Object[] r26 = r4.mo10232b()
                java.lang.String r27 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter"
                java.lang.String r28 = "setHotWord"
                java.lang.String r29 = "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V"
                java.lang.String r30 = "android/view/View_EXEC_"
                java.lang.String r31 = "setVisibility"
                java.lang.String r32 = "(I)V"
                r25 = r0
                j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
                r6 = 0
                java.lang.Object r4 = r4.mo10231a(r6)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                r0.setVisibility(r4)
                java.lang.String r26 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter"
                java.lang.String r27 = "setHotWord"
                java.lang.String r28 = "(Lcom/tencent/mm/plugin/finder/search/FinderPopularListLogic$HotWordItemHolder;Ljava/lang/String;Ljava/lang/String;)V"
                java.lang.String r29 = "android/view/View_EXEC_"
                java.lang.String r30 = "setVisibility"
                java.lang.String r31 = "(I)V"
                j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
                android.widget.TextView r0 = r5.mo9540a()
                r0.setText(r10)
                goto L_0x02a8
            L_0x0299:
                gy3.C87412m.m108603p(r4)
                throw r19
            L_0x029d:
                gy3.C87412m.m108603p(r18)
                throw r19
            L_0x02a1:
                gy3.C87412m.m108603p(r18)
                throw r19
            L_0x02a5:
                r17 = r4
                r2 = 4
            L_0x02a8:
                int r0 = r33.getCount()
                r4 = 1
                int r0 = r0 - r4
                java.lang.String r4 = "dividerView"
                if (r1 != r0) goto L_0x02fc
                android.view.View r0 = r5.f27914d
                if (r0 == 0) goto L_0x02f8
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.mo10233c(r2)
                java.lang.Object[] r7 = r3.mo10232b()
                java.lang.String r8 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter"
                java.lang.String r9 = "getView"
                java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r12 = "setVisibility"
                java.lang.String r13 = "(I)V"
                r6 = r0
                j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
                r2 = 0
                java.lang.Object r2 = r3.mo10231a(r2)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.setVisibility(r2)
                java.lang.String r7 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter"
                java.lang.String r8 = "getView"
                java.lang.String r9 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
                goto L_0x0340
            L_0x02f8:
                gy3.C87412m.m108603p(r4)
                throw r19
            L_0x02fc:
                android.view.View r0 = r5.f27914d
                if (r0 == 0) goto L_0x03b1
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                r2.mo10233c(r3)
                java.lang.Object[] r26 = r2.mo10232b()
                java.lang.String r27 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter"
                java.lang.String r28 = "getView"
                java.lang.String r29 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r30 = "android/view/View_EXEC_"
                java.lang.String r31 = "setVisibility"
                java.lang.String r32 = "(I)V"
                r25 = r0
                j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
                r3 = 0
                java.lang.Object r2 = r2.mo10231a(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.setVisibility(r2)
                java.lang.String r19 = "com/tencent/mm/plugin/finder/search/FinderPopularListLogic$PopularListAdapter"
                java.lang.String r20 = "getView"
                java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                r18 = r0
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            L_0x0340:
                int r0 = r33.getCount()
                r2 = 1
                if (r0 != r2) goto L_0x0365
                if (r1 != 0) goto L_0x0360
                r0 = r33
                hp1.s0 r1 = hp1.C8690s0.this
                com.tencent.mm.ui.MMActivity r1 = r1.f27901g
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131234423(0x7f080e77, float:1.8085011E38)
                android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
                r4 = r17
                r4.setBackground(r1)
                goto L_0x03b0
            L_0x0360:
                r0 = r33
                r4 = r17
                goto L_0x03b0
            L_0x0365:
                r0 = r33
                r4 = r17
                int r3 = r33.getCount()
                if (r3 <= r2) goto L_0x03b0
                if (r1 != 0) goto L_0x0384
                hp1.s0 r1 = hp1.C8690s0.this
                com.tencent.mm.ui.MMActivity r1 = r1.f27901g
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131234425(0x7f080e79, float:1.8085015E38)
                android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
                r4.setBackground(r1)
                goto L_0x03b0
            L_0x0384:
                int r3 = r33.getCount()
                int r3 = r3 - r2
                if (r1 != r3) goto L_0x039e
                hp1.s0 r1 = hp1.C8690s0.this
                com.tencent.mm.ui.MMActivity r1 = r1.f27901g
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131234424(0x7f080e78, float:1.8085013E38)
                android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
                r4.setBackground(r1)
                goto L_0x03b0
            L_0x039e:
                hp1.s0 r1 = hp1.C8690s0.this
                com.tencent.mm.ui.MMActivity r1 = r1.f27901g
                android.content.res.Resources r1 = r1.getResources()
                r2 = 2131101833(0x7f060889, float:1.7816087E38)
                int r1 = r1.getColor(r2)
                r4.setBackgroundColor(r1)
            L_0x03b0:
                return r4
            L_0x03b1:
                r0 = r33
                gy3.C87412m.m108603p(r4)
                throw r19
            */
            throw new UnsupportedOperationException("Method not decompiled: hp1.C8690s0.C8696f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    static {
        new C8693c((C8480h) null);
    }

    public C8690s0(MMActivity mMActivity, C32228q<? super C48727ak1, ? super Integer, ? super List<? extends C48727ak1>, C13598b0> qVar) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(qVar, "onHotWordClickListener");
        this.f27901g = mMActivity;
        View findViewById = mMActivity.findViewById(C0966R.C0970id.e3y);
        C87412m.m108593f(findViewById, "activity.findViewById(R.…r_popular_list_container)");
        this.f27902h = (LinearLayout) findViewById;
        View findViewById2 = mMActivity.findViewById(C0966R.C0970id.f358256e40);
        C87412m.m108593f(findViewById2, "activity.findViewById(R.…nder_popular_list_header)");
        this.f27903i = (TextView) findViewById2;
        View findViewById3 = mMActivity.findViewById(C0966R.C0970id.e3z);
        C87412m.m108593f(findViewById3, "activity.findViewById(R.…der_popular_list_content)");
        this.f27904j = (ListView) findViewById3;
        C8696f fVar = new C8696f();
        this.f27905n = fVar;
        this.f27904j.setAdapter(fVar);
        this.f27904j.setOnItemClickListener(new C8691a(this, mMActivity, qVar));
        this.f27902h.setOnTouchListener(new C8692b(mMActivity));
        this.f27899e = C76577a.m92157h(mMActivity, C0966R.dimen.f3723cd);
        mo9536c();
    }

    /* renamed from: a */
    public final void mo9534a(List<? extends C48727ak1> list, boolean z) {
        C31543z5.m39455e();
        if (z) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING, UUID.randomUUID().toString());
        }
        this.f27906o = list;
        StringBuilder sb = new StringBuilder();
        sb.append("onHotWordsChange : ");
        sb.append(list);
        sb.append(" size: ");
        sb.append(list != null ? list.size() : -1);
        Log.m105924i("Finder.FinderPopularListLogic", sb.toString());
        if (list == null) {
            this.f27902h.setVisibility(8);
        } else if (list.isEmpty()) {
            this.f27902h.setVisibility(8);
            this.f27905n.notifyDataSetChanged();
        } else {
            this.f27902h.setVisibility(0);
            this.f27905n.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f A[LOOP:0: B:2:0x000e->B:27:0x007f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9535b() {
        /*
            r14 = this;
            android.widget.ListView r0 = r14.f27904j
            int r0 = r0.getFirstVisiblePosition()
            android.widget.ListView r1 = r14.f27904j
            int r1 = r1.getLastVisiblePosition()
            if (r0 > r1) goto L_0x0082
        L_0x000e:
            java.util.List<? extends te3.ak1> r2 = r14.f27906o
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x002c
            if (r0 < 0) goto L_0x001e
            int r5 = r2.size()
            if (r0 >= r5) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            if (r5 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r2.get(r0)
            te3.ak1 r2 = (te3.C48727ak1) r2
            goto L_0x002d
        L_0x002c:
            r2 = r4
        L_0x002d:
            if (r2 == 0) goto L_0x007d
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_HOT_LIST_SEARCH_REQUEST_ID_STRING
            java.lang.String r7 = ""
            java.lang.String r11 = r5.mo119675I(r6, r7)
            java.lang.String r5 = r2.f130586d
            if (r5 == 0) goto L_0x004c
            java.lang.String r6 = ","
            java.lang.String r8 = "$"
            java.lang.String r3 = z04.C112551y.m153814n(r5, r6, r8, r3)
            goto L_0x004d
        L_0x004c:
            r3 = r4
        L_0x004d:
            java.lang.Class<dp1.y0> r5 = dp1.C58417y0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            dp1.y0 r5 = (dp1.C58417y0) r5
            java.lang.String r6 = r2.f130591i
            if (r6 != 0) goto L_0x005a
            r6 = r7
        L_0x005a:
            r7 = 1
            r8 = 1
            r9 = 1
            rs1.s8$a r10 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r12 = r14.f27901g
            rs1.s8 r10 = r10.mo12873f(r12)
            if (r10 == 0) goto L_0x006b
            te3.hj1 r4 = r10.mo12861q3()
        L_0x006b:
            r10 = r4
            long r12 = r2.f130593n
            java.lang.String r12 = o40.C61926c.m72691p(r12)
            r2 = r5
            r4 = r6
            r5 = r0
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r2.Fx0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x007d:
            if (r0 == r1) goto L_0x0082
            int r0 = r0 + 1
            goto L_0x000e
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hp1.C8690s0.mo9535b():void");
    }

    /* renamed from: c */
    public final void mo9536c() {
        if (this.f27902h.getParent() instanceof ViewGroup) {
            ViewParent parent = this.f27902h.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setBackgroundColor(this.f27901g.getResources().getColor(C0966R.color.BW_93));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9537d() {
        /*
            r9 = this;
            te3.dh1 r0 = hp1.C8690s0.C8695e.f27918c
            r1 = 1
            java.lang.String r2 = "Finder.PopularDataManager"
            r3 = 0
            if (r0 != 0) goto L_0x0044
            boolean r4 = hp1.C8690s0.C8695e.f27916a
            if (r4 != 0) goto L_0x0044
            if (r0 != 0) goto L_0x0015
            te3.dh1 r0 = new te3.dh1
            r0.<init>()
            hp1.C8690s0.C8695e.f27918c = r0
        L_0x0015:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = er1.C58741j5.f168194k
            r0.append(r4)
            java.lang.String r4 = "popular.info"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r4 = -1
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r3, r4)
            te3.dh1 r4 = hp1.C8690s0.C8695e.f27918c     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0034
            r4.parseFrom(r0)     // Catch:{ Exception -> 0x003a }
        L_0x0034:
            java.lang.String r0 = "read from File"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x003a }
            goto L_0x0042
        L_0x003a:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r4)
        L_0x0042:
            hp1.C8690s0.C8695e.f27916a = r1
        L_0x0044:
            te3.dh1 r0 = hp1.C8690s0.C8695e.f27918c
            if (r0 == 0) goto L_0x008f
            int r4 = eb0.C31543z5.m39455e()
            long r4 = (long) r4
            long r6 = r0.f132324d
            long r4 = r4 - r6
            r6 = 60
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x005f
            java.util.LinkedList<te3.ak1> r4 = r0.f132325e
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "cur: "
            r4.append(r5)
            int r5 = eb0.C31543z5.m39455e()
            r4.append(r5)
            java.lang.String r5 = "  lastUpdateTime : "
            r4.append(r5)
            long r5 = r0.f132324d
            r4.append(r5)
            java.lang.String r5 = " isValid: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            if (r1 == 0) goto L_0x008f
            java.util.LinkedList<te3.ak1> r0 = r0.f132325e
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            if (r0 == 0) goto L_0x00a7
            android.widget.LinearLayout r1 = r9.f27902h
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r9.f27902h
            r1.requestFocus()
            java.util.List<? extends te3.ak1> r1 = r9.f27906o
            if (r1 == 0) goto L_0x00a3
            r1.isEmpty()
        L_0x00a3:
            r9.mo9534a(r0, r3)
            goto L_0x00ae
        L_0x00a7:
            android.widget.LinearLayout r0 = r9.f27902h
            r1 = 8
            r0.setVisibility(r1)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hp1.C8690s0.mo9537d():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0 && (yVar instanceof C9382v4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSceneEnd getHotWords : ");
            C9382v4 v4Var = (C9382v4) yVar;
            C51982xj1 xj12 = v4Var.f29308j;
            String str2 = null;
            LinkedList<C48727ak1> linkedList = xj12 != null ? xj12.f144699d : null;
            sb.append(linkedList != null ? linkedList.size() : -1);
            sb.append(' ');
            Log.m105924i("Finder.FinderPopularListLogic", sb.toString());
            C51982xj1 xj13 = v4Var.f29308j;
            LinkedList<C48727ak1> linkedList2 = xj13 != null ? xj13.f144699d : null;
            if (linkedList2 != null) {
                Iterator<C48727ak1> it = linkedList2.iterator();
                C87412m.m108593f(it, "hotWords.iterator()");
                while (it.hasNext()) {
                    C48727ak1 next = it.next();
                    C87412m.m108593f(next, "iterator.next()");
                    if (next.f130587e != 1) {
                        it.remove();
                    }
                }
            }
            TextView textView = this.f27903i;
            C51982xj1 xj14 = v4Var.f29308j;
            if (xj14 != null) {
                str2 = xj14.f144700e;
            }
            if (str2 == null) {
                str2 = this.f27901g.getResources().getString(C0966R.string.enf);
            }
            textView.setText(str2);
            mo9534a(linkedList2, true);
            if (linkedList2 == null) {
                linkedList2 = new LinkedList<>();
            }
            C49145dh1 dh12 = new C49145dh1();
            dh12.f132325e = linkedList2;
            dh12.f132324d = (long) C31543z5.m39455e();
            C8695e.f27918c = dh12;
            ((C119157j) C119157j.f356862d).mo183875f(C8698t0.f27922d);
            mo9535b();
        }
    }
}
