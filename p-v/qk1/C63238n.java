package qk1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import kg3.C76577a;
import rp1.C63486a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51059r51;

/* renamed from: qk1.n */
public final class C63238n extends RecyclerView.C16613e<C63239a> {

    /* renamed from: d */
    public final Context f179451d;

    /* renamed from: e */
    public final String f179452e = "FinderLiveAnchorPromoteInfoAdapter";

    /* renamed from: f */
    public LinkedList<C51059r51> f179453f;

    /* renamed from: g */
    public RecyclerView f179454g;

    /* renamed from: h */
    public final C13601g f179455h = C36568h.m40985a(C63242d.f179462d);

    /* renamed from: i */
    public final C13601g f179456i = C36568h.m40985a(C63241c.f179461d);

    /* renamed from: j */
    public final C13601g f179457j = C36568h.m40985a(C63240b.f179460d);

    /* renamed from: n */
    public C63486a f179458n;

    /* renamed from: o */
    public C32228q<? super C51059r51, ? super View, ? super Integer, C13598b0> f179459o;

    /* renamed from: qk1.n$a */
    public final class C63239a extends RecyclerView.C16631z {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63239a(C63238n nVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: qk1.n$b */
    public static final class C63240b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C63240b f179460d = new C63240b();

        public C63240b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3743cv));
        }
    }

    /* renamed from: qk1.n$c */
    public static final class C63241c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C63241c f179461d = new C63241c();

        public C63241c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3749d0));
        }
    }

    /* renamed from: qk1.n$d */
    public static final class C63242d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C63242d f179462d = new C63242d();

        public C63242d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3755d6));
        }
    }

    public C63238n(Context context) {
        C87412m.m108594g(context, "context");
        this.f179451d = context;
    }

    /* renamed from: F4 */
    public final int mo88142F4() {
        return ((Number) ((C36570n) this.f179456i).getValue()).intValue();
    }

    /* renamed from: G4 */
    public final int mo88143G4() {
        return ((Number) ((C36570n) this.f179455h).getValue()).intValue();
    }

    public int getItemCount() {
        LinkedList<C51059r51> linkedList = this.f179453f;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f179454g = recyclerView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x055e A[LOOP:0: B:155:0x055c->B:156:0x055e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x060e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r32, int r33) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            qk1.n$a r2 = (qk1.C63238n.C63239a) r2
            pl1.e0$a r3 = pl1.C11978e0.C11979a.TIMELINE
            up1.y r4 = up1.C27696y.THUMB_IMAGE
            pl1.e0$a r5 = pl1.C11978e0.C11979a.MP_ARTICE
            up1.y r6 = up1.C27696y.RAW_IMAGE
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r8 = ht1.C60200t1.class
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r2, r0)
            java.util.LinkedList<te3.r51> r0 = r1.f179453f
            if (r0 == 0) goto L_0x0025
            r10 = r33
            java.lang.Object r0 = r0.get(r10)
            te3.r51 r0 = (te3.C51059r51) r0
            r10 = r0
            goto L_0x0026
        L_0x0025:
            r10 = 0
        L_0x0026:
            if (r10 == 0) goto L_0x066b
            android.view.View r0 = r2.f44854d
            r0.setTag(r10)
            android.view.View r0 = r2.f44854d
            r11 = 2131304192(0x7f091f00, float:1.822652E38)
            android.view.View r0 = r0.findViewById(r11)
            r11 = r0
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            android.view.View r0 = r2.f44854d
            r12 = 2131304197(0x7f091f05, float:1.822653E38)
            android.view.View r0 = r0.findViewById(r12)
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.view.View r0 = r2.f44854d
            r13 = 2131304191(0x7f091eff, float:1.8226518E38)
            android.view.View r0 = r0.findViewById(r13)
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.view.View r0 = r2.f44854d
            r14 = 2131309274(0x7f0932da, float:1.8236827E38)
            android.view.View r0 = r0.findViewById(r14)
            r15 = r0
            com.tencent.mm.plugin.finder.view.notice.NoticeCouponMiniInfoView r15 = (com.tencent.p014mm.plugin.finder.view.notice.NoticeCouponMiniInfoView) r15
            android.view.View r0 = r2.f44854d
            r14 = 2131304196(0x7f091f04, float:1.8226528E38)
            android.view.View r0 = r0.findViewById(r14)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.TextPaint r14 = r0.getPaint()
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r14, r9)
            android.view.View r9 = r2.f44854d
            r14 = 2131304193(0x7f091f01, float:1.8226522E38)
            android.view.View r9 = r9.findViewById(r14)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r14 = 8
            r9.setVisibility(r14)
            android.view.View r14 = r2.f44854d
            android.content.Context r14 = r14.getContext()
            r16 = r5
            r5 = 0
            r13.setVisibility(r5)
            r5 = 8
            r15.setVisibility(r5)
            rp1.a r5 = r1.f179458n
            r17 = r15
            if (r5 == 0) goto L_0x00b0
            fj1.b r5 = r5.mo87856S2()
            if (r5 == 0) goto L_0x00b0
            java.lang.Class<cl1.o> r15 = cl1.C54991o.class
            androidx.lifecycle.i0 r5 = r5.mo71262a(r15)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo75999e4()
            r15 = 1
            if (r5 != r15) goto L_0x00b0
            r5 = 1
            goto L_0x00b1
        L_0x00b0:
            r5 = 0
        L_0x00b1:
            r15 = 2131232788(0x7f080814, float:1.8081695E38)
            if (r5 == 0) goto L_0x010a
            boolean r5 = r10.f140708g
            if (r5 == 0) goto L_0x00de
            android.content.res.Resources r5 = r14.getResources()
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r15)
            r0.setBackground(r5)
            android.content.res.Resources r5 = r14.getResources()
            r15 = 2131099898(0x7f0600fa, float:1.7812162E38)
            int r5 = r5.getColor(r15)
            r0.setTextColor(r5)
            r5 = 2131828608(0x7f111f80, float:1.9290162E38)
            java.lang.String r5 = r14.getString(r5)
            r0.setText(r5)
            goto L_0x0101
        L_0x00de:
            android.content.res.Resources r5 = r14.getResources()
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r15)
            r0.setBackground(r5)
            android.content.res.Resources r5 = r14.getResources()
            r15 = 2131101834(0x7f06088a, float:1.7816089E38)
            int r5 = r5.getColor(r15)
            r0.setTextColor(r5)
            r5 = 2131828617(0x7f111f89, float:1.929018E38)
            java.lang.String r5 = r14.getString(r5)
            r0.setText(r5)
        L_0x0101:
            qk1.p r5 = new qk1.p
            r5.<init>(r1, r14, r10)
            r0.setOnClickListener(r5)
            goto L_0x0135
        L_0x010a:
            android.content.res.Resources r5 = r14.getResources()
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r15)
            r0.setBackground(r5)
            android.content.res.Resources r5 = r14.getResources()
            r15 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r5 = r5.getColor(r15)
            r0.setTextColor(r5)
            r5 = 2131828617(0x7f111f89, float:1.929018E38)
            java.lang.String r5 = r14.getString(r5)
            r0.setText(r5)
            qk1.q r5 = new qk1.q
            r5.<init>(r14)
            r0.setOnClickListener(r5)
        L_0x0135:
            android.view.View r0 = r2.f44854d
            qk1.r r5 = new qk1.r
            r5.<init>(r1, r2)
            r0.setOnLongClickListener(r5)
            r11.clearColorFilter()
            r5 = 0
            r11.setLayerPaint(r5)
            int r0 = r10.f140706e
            java.lang.String r15 = ""
            java.lang.String r5 = "safeParser"
            r19 = r6
            r6 = 1
            if (r0 == r6) goto L_0x0481
            r6 = 2
            java.lang.String r1 = "imgUrl: "
            if (r0 == r6) goto L_0x03f6
            r6 = 3
            if (r0 == r6) goto L_0x039d
            r6 = 4
            if (r0 == r6) goto L_0x0305
            r6 = 7
            if (r0 == r6) goto L_0x026d
            r6 = 8
            if (r0 == r6) goto L_0x01db
            r1 = 13
            if (r0 == r1) goto L_0x016b
        L_0x0167:
            r1 = r31
            goto L_0x054c
        L_0x016b:
            te3.o51 r1 = new te3.o51
            r1.<init>()
            pe3.b r0 = r10.f140707f
            if (r0 == 0) goto L_0x0179
            byte[] r9 = r0.mo123703f()
            goto L_0x017a
        L_0x0179:
            r9 = 0
        L_0x017a:
            if (r9 != 0) goto L_0x017d
            goto L_0x018c
        L_0x017d:
            r1.parseFrom(r9)     // Catch:{ Exception -> 0x0181 }
            goto L_0x018c
        L_0x0181:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r4 = 0
            r0[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r15, r0)
        L_0x018c:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            int r3 = r31.mo88142F4()
            r0.width = r3
            int r3 = r31.mo88142F4()
            r0.height = r3
            r11.setLayoutParams(r0)
            r0 = 2131755715(0x7f1002c3, float:1.9142317E38)
            r3 = 2131099937(0x7f060121, float:1.7812241E38)
            int r3 = kg3.C76577a.m92153d(r14, r3)
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r14, r0, r3)
            r11.setImageDrawable(r0)
            java.lang.String r0 = r1.f138961e
            r12.setText(r0)
            r0 = 2131828460(0x7f111eec, float:1.9289861E38)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r1.f138962f
            long r4 = (long) r4
            java.lang.String r6 = "HH:mm"
            java.lang.String r4 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r6, r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r0 = r14.getString(r0, r3)
            r13.setText(r0)
            android.view.View r0 = r2.f44854d
            qk1.s r3 = new qk1.s
            r3.<init>(r1, r14)
            r0.setOnClickListener(r3)
            goto L_0x0167
        L_0x01db:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r1.<init>()
            pe3.b r0 = r10.f140707f
            if (r0 == 0) goto L_0x01e9
            byte[] r0 = r0.mo123703f()
            goto L_0x01ea
        L_0x01e9:
            r0 = 0
        L_0x01ea:
            if (r0 != 0) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            r1.parseFrom(r0)     // Catch:{ Exception -> 0x01f2 }
        L_0x01f0:
            r14 = 1
            goto L_0x01fe
        L_0x01f2:
            r0 = move-exception
            r6 = r0
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r16 = 0
            r0[r16] = r6
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r15, r0)
        L_0x01fe:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.String r0 = r1.icon_name
            if (r0 == 0) goto L_0x021e
            int r5 = r0.length()
            if (r5 != 0) goto L_0x020c
            r5 = 1
            goto L_0x020d
        L_0x020c:
            r5 = 0
        L_0x020d:
            r5 = r5 ^ r14
            if (r5 == 0) goto L_0x0211
            goto L_0x0212
        L_0x0211:
            r0 = 0
        L_0x0212:
            if (r0 == 0) goto L_0x021e
            r5 = 0
            r9.setVisibility(r5)
            r9.setText(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x021f
        L_0x021e:
            r0 = 0
        L_0x021f:
            if (r0 != 0) goto L_0x0226
            r5 = 8
            r9.setVisibility(r5)
        L_0x0226:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            int r5 = r31.mo88143G4()
            r0.width = r5
            int r5 = r31.mo88143G4()
            r0.height = r5
            r11.setLayoutParams(r0)
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r5 = r0.mo62446e(r8)
            bl3.c r5 = r5.mo62447c(r7)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            pl1.n0 r6 = new pl1.n0
            java.lang.String r9 = r1.icon_url
            r6.<init>(r9, r4)
            bl3.r$a r0 = r0.mo62446e(r8)
            bl3.c r0 = r0.mo62447c(r7)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r3)
            r5.mo85957c(r6, r11, r0)
            java.lang.String r0 = r1.wording
            r12.setText(r0)
            java.lang.String r0 = r1.recommend_reason
            r13.setText(r0)
            goto L_0x0167
        L_0x026d:
            te3.w51 r3 = new te3.w51
            r3.<init>()
            pe3.b r0 = r10.f140707f
            if (r0 == 0) goto L_0x027b
            byte[] r9 = r0.mo123703f()
            goto L_0x027c
        L_0x027b:
            r9 = 0
        L_0x027c:
            if (r9 != 0) goto L_0x027f
            goto L_0x028e
        L_0x027f:
            r3.parseFrom(r9)     // Catch:{ Exception -> 0x0283 }
            goto L_0x028e
        L_0x0283:
            r0 = move-exception
            r4 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r15, r0)
        L_0x028e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.util.LinkedList<te3.hi3> r0 = r3.f186059d
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            te3.hi3 r0 = (te3.C64424hi3) r0
            if (r0 == 0) goto L_0x0167
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            int r4 = r31.mo88143G4()
            r3.width = r4
            int r4 = r31.mo88143G4()
            r3.height = r4
            r11.setLayoutParams(r3)
            r3 = r1
            r1 = r31
            java.lang.String r4 = r1.f179452e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = r0.f183500e
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r8)
            bl3.c r4 = r4.mo62447c(r7)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11871f2()
            pl1.n0 r5 = new pl1.n0
            java.lang.String r6 = r0.f183500e
            r9 = r19
            r5.<init>(r6, r9)
            bl3.r$a r3 = r3.mo62446e(r8)
            bl3.c r3 = r3.mo62447c(r7)
            pl1.s0 r3 = (pl1.C11990s0) r3
            r6 = r16
            n60.f r3 = r3.mo11867O2(r6)
            r4.mo85957c(r5, r11, r3)
            java.lang.String r0 = r0.f183499d
            r12.setText(r0)
            r0 = 2131828629(0x7f111f95, float:1.9290204E38)
            java.lang.String r0 = r14.getString(r0)
            r13.setText(r0)
            goto L_0x054c
        L_0x0305:
            r1 = r31
            te3.s81 r6 = new te3.s81
            r6.<init>()
            pe3.b r0 = r10.f140707f
            if (r0 == 0) goto L_0x0315
            byte[] r0 = r0.mo123703f()
            goto L_0x0316
        L_0x0315:
            r0 = 0
        L_0x0316:
            if (r0 != 0) goto L_0x0319
            goto L_0x031c
        L_0x0319:
            r6.parseFrom(r0)     // Catch:{ Exception -> 0x0320 }
        L_0x031c:
            r23 = r2
            r2 = 1
            goto L_0x032e
        L_0x0320:
            r0 = move-exception
            r14 = r0
            r23 = r2
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r16 = 0
            r0[r16] = r14
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r15, r0)
        L_0x032e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            java.lang.String r0 = r6.f185380j
            if (r0 == 0) goto L_0x034e
            int r5 = r0.length()
            if (r5 != 0) goto L_0x033c
            r5 = 1
            goto L_0x033d
        L_0x033c:
            r5 = 0
        L_0x033d:
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0341
            goto L_0x0342
        L_0x0341:
            r0 = 0
        L_0x0342:
            if (r0 == 0) goto L_0x034e
            r2 = 0
            r9.setVisibility(r2)
            r9.setText(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x034f
        L_0x034e:
            r0 = 0
        L_0x034f:
            if (r0 != 0) goto L_0x0356
            r2 = 8
            r9.setVisibility(r2)
        L_0x0356:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            int r2 = r31.mo88143G4()
            r0.width = r2
            int r2 = r31.mo88143G4()
            r0.height = r2
            r11.setLayoutParams(r0)
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r2 = r0.mo62446e(r8)
            bl3.c r2 = r2.mo62447c(r7)
            pl1.s0 r2 = (pl1.C11990s0) r2
            k60.d r2 = r2.mo11871f2()
            pl1.n0 r5 = new pl1.n0
            java.lang.String r9 = r6.f185377g
            r5.<init>(r9, r4)
            bl3.r$a r0 = r0.mo62446e(r8)
            bl3.c r0 = r0.mo62447c(r7)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r3)
            r2.mo85957c(r5, r11, r0)
            java.lang.String r0 = r6.f185376f
            r12.setText(r0)
            java.lang.String r0 = r6.f185380j
            r13.setText(r0)
            goto L_0x047d
        L_0x039d:
            r1 = r31
            r23 = r2
            te3.u51 r2 = new te3.u51
            r2.<init>()
            pe3.b r0 = r10.f140707f
            if (r0 == 0) goto L_0x03af
            byte[] r9 = r0.mo123703f()
            goto L_0x03b0
        L_0x03af:
            r9 = 0
        L_0x03b0:
            if (r9 != 0) goto L_0x03b3
            goto L_0x03c2
        L_0x03b3:
            r2.parseFrom(r9)     // Catch:{ Exception -> 0x03b7 }
            goto L_0x03c2
        L_0x03b7:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r4 = 0
            r0[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r15, r0)
        L_0x03c2:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            int r3 = r31.mo88142F4()
            r0.width = r3
            int r3 = r31.mo88142F4()
            r0.height = r3
            r11.setLayoutParams(r0)
            android.content.res.Resources r0 = r14.getResources()
            r3 = 2131232792(0x7f080818, float:1.8081703E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r3)
            r11.setImageDrawable(r0)
            java.lang.String r0 = r2.f185714d
            r12.setText(r0)
            r0 = 2131828616(0x7f111f88, float:1.9290178E38)
            java.lang.String r0 = r14.getString(r0)
            r13.setText(r0)
            goto L_0x047d
        L_0x03f6:
            r3 = r1
            r23 = r2
            r6 = r16
            r9 = r19
            r1 = r31
            te3.t51 r2 = new te3.t51
            r2.<init>()
            pe3.b r0 = r10.f140707f
            if (r0 == 0) goto L_0x040d
            byte[] r0 = r0.mo123703f()
            goto L_0x040e
        L_0x040d:
            r0 = 0
        L_0x040e:
            if (r0 != 0) goto L_0x0411
            goto L_0x0420
        L_0x0411:
            r2.parseFrom(r0)     // Catch:{ Exception -> 0x0415 }
            goto L_0x0420
        L_0x0415:
            r0 = move-exception
            r4 = r0
            r14 = 1
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r14 = 0
            r0[r14] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r15, r0)
        L_0x0420:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            int r4 = r31.mo88143G4()
            r0.width = r4
            int r4 = r31.mo88143G4()
            r0.height = r4
            r11.setLayoutParams(r0)
            java.lang.String r0 = r1.f179452e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = r2.f185503f
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r3 = r0.mo62446e(r8)
            bl3.c r3 = r3.mo62447c(r7)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11871f2()
            pl1.n0 r4 = new pl1.n0
            java.lang.String r5 = r2.f185503f
            r4.<init>(r5, r9)
            bl3.r$a r0 = r0.mo62446e(r8)
            bl3.c r0 = r0.mo62447c(r7)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r6)
            r3.mo85957c(r4, r11, r0)
            java.lang.String r0 = r2.f185501d
            r12.setText(r0)
            java.lang.String r0 = r2.f185505h
            r13.setText(r0)
        L_0x047d:
            r2 = r23
            goto L_0x054c
        L_0x0481:
            r23 = r2
            r2 = 8
            te3.d51 r3 = new te3.d51
            r3.<init>()
            pe3.b r0 = r10.f140707f
            if (r0 == 0) goto L_0x0493
            byte[] r0 = r0.mo123703f()
            goto L_0x0494
        L_0x0493:
            r0 = 0
        L_0x0494:
            if (r0 != 0) goto L_0x0497
            goto L_0x04a6
        L_0x0497:
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x049b }
            goto L_0x04a6
        L_0x049b:
            r0 = move-exception
            r4 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r4
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r5, r15, r0)
        L_0x04a6:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            rx3.g r4 = r1.f179457j
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r0.width = r4
            rx3.g r4 = r1.f179457j
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r0.height = r4
            r11.setLayoutParams(r0)
            r0 = 2131756333(0x7f10052d, float:1.914357E38)
            r4 = 2131100705(0x7f060421, float:1.78138E38)
            int r4 = kg3.C76577a.m92153d(r14, r4)
            android.graphics.drawable.Drawable r0 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r14, r0, r4)
            r11.setImageDrawable(r0)
            r0 = 2131828288(0x7f111e40, float:1.9289513E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            er1.j4 r24 = er1.C58739j4.f168176a
            int r6 = r3.f132118d
            long r6 = (long) r6
            r8 = 1000(0x3e8, double:4.94E-321)
            long r25 = r6 * r8
            r27 = 0
            r28 = 0
            r29 = 2
            r30 = 0
            java.lang.String r6 = er1.C58739j4.m68254u(r24, r25, r27, r28, r29, r30)
            r7 = 0
            r5[r7] = r6
            java.lang.String r0 = r14.getString(r0, r5)
            r12.setText(r0)
            te3.uk1 r16 = er1.C7802g1.m7949a(r3)
            if (r16 == 0) goto L_0x0527
            r15 = 0
            r0 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            r21 = 52
            r22 = 0
            r14 = r17
            r4 = r17
            r5 = 1
            r17 = r0
            com.tencent.p014mm.plugin.finder.view.notice.NoticeCouponMiniInfoView.m4339a(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r13.setVisibility(r2)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            goto L_0x052b
        L_0x0527:
            r4 = r17
            r5 = 1
            r9 = 0
        L_0x052b:
            if (r9 != 0) goto L_0x047d
            r4.setVisibility(r2)
            java.lang.String r0 = r3.f132121g
            r13.setText(r0)
            java.lang.String r0 = r3.f132121g
            if (r0 == 0) goto L_0x0541
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0540
            goto L_0x0541
        L_0x0540:
            r5 = 0
        L_0x0541:
            if (r5 == 0) goto L_0x0546
            r14 = 8
            goto L_0x0547
        L_0x0546:
            r14 = 0
        L_0x0547:
            r13.setVisibility(r14)
            goto L_0x047d
        L_0x054c:
            android.view.View r0 = r2.f44854d
            r2 = 2131304190(0x7f091efe, float:1.8226516E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            r3 = 0
        L_0x055c:
            if (r3 >= r2) goto L_0x05a9
            android.view.View r4 = r0.getChildAt(r3)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r7)
            java.lang.Object[] r12 = r5.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter"
            java.lang.String r14 = "onBindViewHolder"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$PromotionViewHolder;I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r4
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            r7 = 0
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$PromotionViewHolder;I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            int r3 = r3 + 1
            goto L_0x055c
        L_0x05a9:
            r6 = 4
            int r2 = r10.f140706e
            r3 = -1000(0xfffffffffffffc18, float:NaN)
            r4 = 2131304195(0x7f091f03, float:1.8226526E38)
            if (r2 == r3) goto L_0x060e
            int r2 = r0.getChildCount()
            r3 = 0
        L_0x05b8:
            if (r3 >= r2) goto L_0x0669
            android.view.View r5 = r0.getChildAt(r3)
            int r7 = r5.getId()
            if (r7 == r4) goto L_0x05c6
            r7 = 0
            goto L_0x05c7
        L_0x05c6:
            r7 = 4
        L_0x05c7:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15.mo10233c(r7)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter"
            java.lang.String r10 = "onBindViewHolder"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$PromotionViewHolder;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r5
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r7 = 0
            java.lang.Object r8 = r15.mo10231a(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r7 = r8.intValue()
            r5.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter"
            java.lang.String r9 = "onBindViewHolder"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$PromotionViewHolder;I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r5
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            int r3 = r3 + 1
            goto L_0x05b8
        L_0x060e:
            int r2 = r0.getChildCount()
            r3 = 0
        L_0x0613:
            if (r3 >= r2) goto L_0x0669
            android.view.View r5 = r0.getChildAt(r3)
            int r7 = r5.getId()
            if (r7 != r4) goto L_0x0621
            r7 = 0
            goto L_0x0622
        L_0x0621:
            r7 = 4
        L_0x0622:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15.mo10233c(r7)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter"
            java.lang.String r10 = "onBindViewHolder"
            java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$PromotionViewHolder;I)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r5
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = 0
            java.lang.Object r7 = r15.mo10231a(r14)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter"
            java.lang.String r9 = "onBindViewHolder"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$PromotionViewHolder;I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r5
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            int r3 = r3 + 1
            goto L_0x0613
        L_0x0669:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x066b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk1.C63238n.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.aeo, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C63239a(this, inflate);
    }
}
