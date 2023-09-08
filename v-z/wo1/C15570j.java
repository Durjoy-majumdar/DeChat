package wo1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cj1.C0581o5;
import cl1.C0702z0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ej1.C7704n;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p006bk.C54479b;
import p464ck.C54869f;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C48770aw0;

/* renamed from: wo1.j */
public final class C15570j extends C54869f {

    /* renamed from: a */
    public final Context f42178a;

    /* renamed from: b */
    public final C45795b f42179b;

    /* renamed from: c */
    public final String f42180c = "LiveDanmakuRender";

    /* renamed from: wo1.j$a */
    public static final class C15571a extends C54869f.C54870a {

        /* renamed from: d */
        public final View f42181d;

        /* renamed from: e */
        public final C13601g f42182e = C36568h.m40985a(C15573a.f42188d);

        /* renamed from: f */
        public final C13601g f42183f = C36568h.m40985a(new C15572b(this));

        /* renamed from: g */
        public final TextView f42184g;

        /* renamed from: h */
        public final View f42185h;

        /* renamed from: i */
        public final View f42186i;

        /* renamed from: wo1.j$a$b */
        public static final class C15572b extends C87413o implements C32224a<Integer> {

            /* renamed from: d */
            public final /* synthetic */ C15571a f42187d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C15572b(C15571a aVar) {
                super(0);
                this.f42187d = aVar;
            }

            public Object invoke() {
                return Integer.valueOf(View.MeasureSpec.makeMeasureSpec((int) ((Number) ((C36570n) this.f42187d.f42182e).getValue()).doubleValue(), Integer.MIN_VALUE));
            }
        }

        /* renamed from: wo1.j$a$a */
        public static final class C15573a extends C87413o implements C32224a<Double> {

            /* renamed from: d */
            public static final C15573a f42188d = new C15573a();

            public C15573a() {
                super(0);
            }

            public Object invoke() {
                int i = C54479b.m61196c().f152763j;
                int i2 = C54479b.m61196c().f152764k;
                if (i < i2) {
                    i = i2;
                }
                return Double.valueOf(((double) i) * 1.5d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15571a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f42181d = view;
            View findViewById = view.findViewById(C0966R.C0970id.fsv);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…_comment_item_content_tv)");
            this.f42184g = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.fss);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.live_comment_container)");
            this.f42185h = findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.iox);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.comment_like_ui_root)");
            this.f42186i = findViewById3;
        }

        /* renamed from: d */
        public void mo14335d(int i, int i2) {
            int intValue = ((Number) ((C36570n) this.f42183f).getValue()).intValue();
            if (i < intValue) {
                i = intValue;
            }
            super.mo14335d(i, i2);
        }

        /* renamed from: e */
        public void mo14336e(boolean z, String str, Object obj) {
            C87412m.m108594g(str, "identity");
            C0581o5 o5Var = obj instanceof C0581o5 ? (C0581o5) obj : null;
            if (o5Var != null) {
                C48770aw0 a = C0702z0.f1668D.mo676a(o5Var);
                Integer valueOf = a != null ? Integer.valueOf(a.f130789d) : null;
                if (valueOf != null && valueOf.intValue() == 2) {
                    int i = a.f130791f;
                    if (z) {
                        TextView textView = this.f42184g;
                        textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f2975b6));
                        View view = this.f42185h;
                        C7704n nVar = C7704n.f26123a;
                        boolean z2 = true;
                        boolean z3 = 40 <= i && i < 50;
                        int i2 = C0966R.C0969drawable.f5172c_;
                        if (!z3) {
                            if (50 <= i && i < 60) {
                                i2 = C0966R.C0969drawable.f5174di;
                            } else {
                                if (60 <= i && i < 70) {
                                    i2 = C0966R.C0969drawable.f5176ed;
                                } else {
                                    if (70 > i || i > Integer.MAX_VALUE) {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        i2 = C0966R.C0969drawable.f5178f6;
                                    }
                                }
                            }
                        }
                        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(i2, (Resources.Theme) null);
                        C87412m.m108593f(drawable, "getContext().resources.getDrawable(id, null)");
                        view.setBackground(drawable);
                        return;
                    }
                    TextView textView2 = this.f42184g;
                    textView2.setTextColor(textView2.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                    this.f42185h.setBackground(C7704n.f26123a.mo8824a(i));
                } else if (valueOf == null || valueOf.intValue() != 4) {
                } else {
                    if (z) {
                        TextView textView3 = this.f42184g;
                        textView3.setTextColor(textView3.getContext().getResources().getColor(C0966R.color.f2975b6));
                        this.f42185h.setBackgroundResource(C0966R.C0969drawable.f5170c7);
                        return;
                    }
                    TextView textView4 = this.f42184g;
                    textView4.setTextColor(textView4.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                    this.f42185h.setBackground((Drawable) null);
                }
            }
        }
    }

    public C15570j(Context context, C45795b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        this.f42178a = context;
        this.f42179b = bVar;
    }

    /* renamed from: e */
    public int mo14332e(Object obj) {
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:181:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0229  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14333f(int r34, p464ck.C54869f.C54870a r35, p001ak.C54057e r36) {
        /*
            r33 = this;
            r0 = r33
            r1 = r35
            r2 = r36
            boolean r3 = r1 instanceof wo1.C15570j.C15571a
            if (r3 == 0) goto L_0x000e
            r3 = r1
            wo1.j$a r3 = (wo1.C15570j.C15571a) r3
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            if (r2 == 0) goto L_0x0014
            DATA r5 = r2.f151367x
            goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            boolean r6 = r5 instanceof cj1.C0581o5
            if (r6 == 0) goto L_0x001c
            cj1.o5 r5 = (cj1.C0581o5) r5
            goto L_0x001d
        L_0x001c:
            r5 = 0
        L_0x001d:
            if (r3 == 0) goto L_0x061e
            if (r5 == 0) goto L_0x061e
            fj1.b r6 = r0.f42179b
            java.lang.Class<ny.h> r14 = p629ny.C76979h.class
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            java.lang.String r8 = "liveBuContext"
            gy3.C87412m.m108594g(r6, r8)
            int r8 = r5.getType()
            java.lang.String r9 = ",float msg badge type:"
            java.lang.String r10 = "LiveDanmaku_step4 fillFloatItem msg:"
            java.lang.String r11 = ""
            java.lang.String r15 = "holder.contentTv.context"
            java.lang.String r13 = "badgeInfo:"
            java.lang.String r12 = ", leftSpan:"
            java.lang.String r4 = " level:"
            java.lang.String r2 = ",floatType:"
            java.lang.String r1 = ",is_float:"
            java.lang.String r0 = ",likeCount:"
            r16 = r11
            java.lang.String r11 = ",like:"
            r17 = r13
            java.lang.String r13 = "holder.itemView.context"
            r18 = r12
            java.lang.String r12 = "holder.contentTv.paint"
            r19 = r4
            r4 = 20002(0x4e22, float:2.8029E-41)
            if (r8 != r4) goto L_0x01df
            cl1.z0$a r4 = cl1.C0702z0.f1668D
            te3.aw0 r4 = r4.mo676a(r5)
            ej1.n r8 = ej1.C7704n.f26123a
            r20 = r9
            android.text.style.ImageSpan r9 = r8.mo8825b(r4)
            r22 = r2
            android.view.View r2 = r3.f42185h
            r23 = r1
            android.view.View r1 = r3.f42186i
            r8.mo8827d(r4, r2, r1)
            androidx.lifecycle.i0 r1 = r6.mo71262a(r7)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154382x
            if (r1 == 0) goto L_0x0093
            c50.b r1 = c50.C54655b.f153178f1
            if (r1 == 0) goto L_0x007f
            r1 = 1
            goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            if (r1 != 0) goto L_0x008e
            i50.a r1 = i50.C60251a.f171781k1
            if (r1 == 0) goto L_0x0088
            r1 = 1
            goto L_0x0089
        L_0x0088:
            r1 = 0
        L_0x0089:
            if (r1 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r1 = 0
            goto L_0x008f
        L_0x008e:
            r1 = 1
        L_0x008f:
            if (r1 != 0) goto L_0x0093
            r1 = 1
            goto L_0x0094
        L_0x0093:
            r1 = 0
        L_0x0094:
            ej1.e0$a r2 = ej1.C7677e0.f26041j
            android.widget.TextView r6 = r3.f42184g
            android.content.Context r6 = r6.getContext()
            gy3.C87412m.m108593f(r6, r15)
            android.widget.TextView r7 = r3.f42184g
            android.text.TextPaint r7 = r7.getPaint()
            gy3.C87412m.m108593f(r7, r12)
            rx3.l r1 = r2.mo8806a(r6, r5, r1, r7)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            B r1 = r1.f38556e
            r7 = 0
            r6[r7] = r1
            java.lang.String r1 = r5.getContent()
            if (r1 != 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r16 = r1
        L_0x00c1:
            r1 = 1
            r6[r1] = r16
            r1 = 2131831999(0x7f112cbf, float:1.929704E38)
            java.lang.String r1 = r2.getString(r1, r6)
            java.lang.String r2 = "getContext().getString(\n…ent() ?: \"\"\n            )"
            gy3.C87412m.m108593f(r1, r2)
            android.widget.TextView r2 = r3.f42184g
            if (r9 == 0) goto L_0x00ef
            wk1.n r6 = wk1.C15440n.f41895a
            android.view.View r7 = r3.f42181d
            android.content.Context r7 = r7.getContext()
            gy3.C87412m.m108593f(r7, r13)
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            r12.add(r9)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            r13 = 1
            de3.u r1 = r6.mo14267p(r7, r1, r12, r13)
            goto L_0x00fd
        L_0x00ef:
            di3.d r6 = di3.C86312j.m106911c(r14)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.SpannableString r1 = r6.mo107057T1(r7, r1)
        L_0x00fd:
            r2.setText(r1)
            android.widget.TextView r1 = r3.f42184g
            int r2 = ej1.C7704n.f26125c
            float r2 = (float) r2
            r1.setTextSize(r2)
            er1.j4 r1 = er1.C58739j4.f168176a
            boolean r1 = r1.mo83692U()
            if (r1 == 0) goto L_0x01d8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            int r2 = r5.hashCode()
            r1.append(r2)
            r2 = 44
            r1.append(r2)
            java.lang.String r2 = r5.mo573g()
            r1.append(r2)
            r2 = 58
            r1.append(r2)
            java.lang.String r2 = r5.getContent()
            r1.append(r2)
            r1.append(r11)
            boolean r2 = r5 instanceof cj1.C0584p5
            if (r2 == 0) goto L_0x0142
            r6 = r5
            cj1.p5 r6 = (cj1.C0584p5) r6
            goto L_0x0143
        L_0x0142:
            r6 = 0
        L_0x0143:
            if (r6 == 0) goto L_0x014e
            boolean r6 = r6.mo583m()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x014f
        L_0x014e:
            r6 = 0
        L_0x014f:
            r1.append(r6)
            r1.append(r0)
            if (r2 == 0) goto L_0x015b
            r0 = r5
            cj1.p5 r0 = (cj1.C0584p5) r0
            goto L_0x015c
        L_0x015b:
            r0 = 0
        L_0x015c:
            if (r0 == 0) goto L_0x0167
            int r0 = r0.getLikeCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0168
        L_0x0167:
            r0 = 0
        L_0x0168:
            r1.append(r0)
            r2 = r23
            r1.append(r2)
            boolean r0 = r5.mo578h()
            r1.append(r0)
            r0 = r22
            r1.append(r0)
            int r0 = r5.mo584n()
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            if (r4 == 0) goto L_0x0191
            int r0 = r4.f130789d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0192
        L_0x0191:
            r0 = 0
        L_0x0192:
            r1.append(r0)
            r0 = r19
            r1.append(r0)
            if (r4 == 0) goto L_0x01a3
            int r0 = r4.f130791f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01a4
        L_0x01a3:
            r0 = 0
        L_0x01a4:
            r1.append(r0)
            r4 = r18
            r1.append(r4)
            if (r9 == 0) goto L_0x01b3
            int r4 = r9.hashCode()
            goto L_0x01b4
        L_0x01b3:
            r4 = 0
        L_0x01b4:
            r1.append(r4)
            r9 = r17
            r1.append(r9)
            wk1.n r0 = wk1.C15440n.f41895a
            te3.hx0 r2 = r5.mo579i()
            if (r2 == 0) goto L_0x01c7
            java.util.LinkedList<te3.aw0> r2 = r2.f134930r
            goto L_0x01c8
        L_0x01c7:
            r2 = 0
        L_0x01c8:
            java.lang.String r0 = r0.mo14268s(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CommentItemReplyDanmaku"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x01d8:
            android.view.View r0 = r3.f42186i
            r8.mo8826c(r5, r0)
            goto L_0x061b
        L_0x01df:
            r20 = r9
            r4 = r19
            r32 = r2
            r2 = r1
            r1 = r32
            r9 = 20035(0x4e43, float:2.8075E-41)
            if (r8 != r9) goto L_0x03f6
            androidx.lifecycle.i0 r6 = r6.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.f154382x
            if (r6 == 0) goto L_0x0210
            c50.b r6 = c50.C54655b.f153178f1
            if (r6 == 0) goto L_0x01fc
            r6 = 1
            goto L_0x01fd
        L_0x01fc:
            r6 = 0
        L_0x01fd:
            if (r6 != 0) goto L_0x020b
            i50.a r6 = i50.C60251a.f171781k1
            if (r6 == 0) goto L_0x0205
            r6 = 1
            goto L_0x0206
        L_0x0205:
            r6 = 0
        L_0x0206:
            if (r6 == 0) goto L_0x0209
            goto L_0x020b
        L_0x0209:
            r6 = 0
            goto L_0x020c
        L_0x020b:
            r6 = 1
        L_0x020c:
            if (r6 != 0) goto L_0x0210
            r8 = 1
            goto L_0x0211
        L_0x0210:
            r8 = 0
        L_0x0211:
            java.lang.Object r6 = r5.mo563q()
            boolean r7 = r6 instanceof te3.C50310lu0
            if (r7 == 0) goto L_0x021d
            te3.lu0 r6 = (te3.C50310lu0) r6
            r10 = r6
            goto L_0x021e
        L_0x021d:
            r10 = 0
        L_0x021e:
            java.lang.String r9 = "CommentItemLocationDanmaku"
            if (r10 != 0) goto L_0x0229
            java.lang.String r0 = "[onBindPoiMsg]: payload is not FinderLiveAppMsgLocationInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x061b
        L_0x0229:
            te3.db1 r6 = r10.f137642d
            if (r6 == 0) goto L_0x0231
            java.lang.String r6 = r6.f182663f
            r7 = r6
            goto L_0x0232
        L_0x0231:
            r7 = 0
        L_0x0232:
            if (r7 == 0) goto L_0x023d
            int r6 = r7.length()
            if (r6 != 0) goto L_0x023b
            goto L_0x023d
        L_0x023b:
            r6 = 0
            goto L_0x023e
        L_0x023d:
            r6 = 1
        L_0x023e:
            if (r6 == 0) goto L_0x0256
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[onBindPoiMsg]: city is null or empty:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x061b
        L_0x0256:
            java.lang.String r6 = r10.f137643e
            if (r6 == 0) goto L_0x0265
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0261
            goto L_0x0265
        L_0x0261:
            r6 = 1
            r21 = 0
            goto L_0x0268
        L_0x0265:
            r6 = 1
            r21 = 1
        L_0x0268:
            r26 = r21 ^ 1
            ej1.w$c r22 = ej1.C7715w.f26137k
            android.widget.TextView r6 = r3.f42184g
            android.content.Context r6 = r6.getContext()
            gy3.C87412m.m108593f(r6, r15)
            r16 = r6
            android.widget.TextView r6 = r3.f42184g
            android.text.TextPaint r6 = r6.getPaint()
            gy3.C87412m.m108593f(r6, r12)
            r12 = r16
            r16 = r6
            r6 = r22
            r19 = r7
            r7 = r12
            r12 = r9
            r9 = r5
            r20 = r10
            r28 = r4
            r4 = r11
            r11 = r19
            r30 = r12
            r29 = r18
            r12 = r26
            r31 = r17
            r17 = r1
            r1 = r13
            r13 = r16
            rx3.o r6 = r6.mo8836a(r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            B r8 = r6.f38558e
            java.lang.String r8 = (java.lang.String) r8
            r7.append(r8)
            C r6 = r6.f38559f
            java.lang.String r6 = (java.lang.String) r6
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            cl1.z0$a r7 = cl1.C0702z0.f1668D
            te3.aw0 r7 = r7.mo676a(r5)
            ej1.n r8 = ej1.C7704n.f26123a
            android.text.style.ImageSpan r9 = r8.mo8825b(r7)
            if (r9 == 0) goto L_0x02e3
            wk1.n r10 = wk1.C15440n.f41895a
            android.view.View r11 = r3.f42181d
            android.content.Context r11 = r11.getContext()
            gy3.C87412m.m108593f(r11, r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r1.add(r9)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r12 = 1
            de3.u r1 = r10.mo14267p(r11, r6, r1, r12)
            goto L_0x02f7
        L_0x02e3:
            de3.u r1 = new de3.u
            di3.d r10 = di3.C86312j.m106911c(r14)
            ny.h r10 = (p629ny.C76979h) r10
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 0
            android.text.SpannableString r6 = r10.Te0(r11, r6, r12)
            r1.<init>((android.text.SpannableString) r6)
        L_0x02f7:
            android.widget.TextView r6 = r3.f42184g
            android.content.Context r6 = r6.getContext()
            gy3.C87412m.m108593f(r6, r15)
            r23 = r6
            r24 = r20
            r25 = r1
            r27 = r19
            r22.mo8838c(r23, r24, r25, r26, r27)
            android.view.View r6 = r3.f42185h
            android.view.View r10 = r3.f42186i
            r8.mo8827d(r7, r6, r10)
            android.widget.TextView r6 = r3.f42184g
            r6.setText(r1)
            android.widget.TextView r1 = r3.f42184g
            int r6 = ej1.C7704n.f26125c
            float r6 = (float) r6
            r1.setTextSize(r6)
            er1.j4 r1 = er1.C58739j4.f168176a
            boolean r1 = r1.mo83692U()
            if (r1 == 0) goto L_0x03ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "LiveDanmaku_step4 fill location msg:"
            r1.append(r6)
            int r6 = r5.hashCode()
            r1.append(r6)
            r6 = 44
            r1.append(r6)
            java.lang.String r6 = r5.mo573g()
            r1.append(r6)
            r6 = 58
            r1.append(r6)
            java.lang.String r6 = r5.getContent()
            r1.append(r6)
            r1.append(r4)
            boolean r4 = r5 instanceof cj1.C0584p5
            if (r4 == 0) goto L_0x035b
            r6 = r5
            cj1.p5 r6 = (cj1.C0584p5) r6
            goto L_0x035c
        L_0x035b:
            r6 = 0
        L_0x035c:
            if (r6 == 0) goto L_0x0367
            boolean r6 = r6.mo583m()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0368
        L_0x0367:
            r6 = 0
        L_0x0368:
            r1.append(r6)
            r1.append(r0)
            if (r4 == 0) goto L_0x0374
            r0 = r5
            cj1.p5 r0 = (cj1.C0584p5) r0
            goto L_0x0375
        L_0x0374:
            r0 = 0
        L_0x0375:
            if (r0 == 0) goto L_0x0380
            int r0 = r0.getLikeCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0381
        L_0x0380:
            r0 = 0
        L_0x0381:
            r1.append(r0)
            r1.append(r2)
            boolean r0 = r5.mo578h()
            r1.append(r0)
            r11 = r17
            r1.append(r11)
            int r0 = r5.mo584n()
            r1.append(r0)
            java.lang.String r0 = ",badge type:"
            r1.append(r0)
            if (r7 == 0) goto L_0x03a8
            int r0 = r7.f130789d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x03a9
        L_0x03a8:
            r0 = 0
        L_0x03a9:
            r1.append(r0)
            r13 = r28
            r1.append(r13)
            if (r7 == 0) goto L_0x03ba
            int r0 = r7.f130791f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x03bb
        L_0x03ba:
            r0 = 0
        L_0x03bb:
            r1.append(r0)
            r15 = r29
            r1.append(r15)
            if (r9 == 0) goto L_0x03ca
            int r4 = r9.hashCode()
            goto L_0x03cb
        L_0x03ca:
            r4 = 0
        L_0x03cb:
            r1.append(r4)
            r9 = r31
            r1.append(r9)
            wk1.n r0 = wk1.C15440n.f41895a
            te3.hx0 r2 = r5.mo579i()
            if (r2 == 0) goto L_0x03de
            java.util.LinkedList<te3.aw0> r2 = r2.f134930r
            goto L_0x03df
        L_0x03de:
            r2 = 0
        L_0x03df:
            java.lang.String r0 = r0.mo14268s(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x03ef:
            android.view.View r0 = r3.f42186i
            r8.mo8826c(r5, r0)
            goto L_0x061b
        L_0x03f6:
            r9 = r17
            r15 = r18
            r32 = r11
            r11 = r1
            r1 = r13
            r13 = r4
            r4 = r32
            cl1.z0$a r8 = cl1.C0702z0.f1668D
            te3.aw0 r8 = r8.mo676a(r5)
            r31 = r9
            ej1.n r9 = ej1.C7704n.f26123a
            r29 = r15
            android.view.View r15 = r3.f42185h
            r19 = r13
            android.view.View r13 = r3.f42186i
            r9.mo8827d(r8, r15, r13)
            android.text.style.ImageSpan r13 = r9.mo8825b(r8)
            android.widget.TextView r15 = r3.f42184g
            android.text.TextPaint r15 = r15.getPaint()
            gy3.C87412m.m108593f(r15, r12)
            ok1.e r22 = ok1.C62042e.f176370a
            te3.hx0 r12 = r5.mo579i()
            if (r12 == 0) goto L_0x0434
            com.tencent.mm.protocal.protobuf.FinderContact r12 = r12.f134919d
            if (r12 == 0) goto L_0x0434
            java.lang.String r12 = r12.username
            r23 = r12
            goto L_0x0436
        L_0x0434:
            r23 = 0
        L_0x0436:
            te3.hx0 r12 = r5.mo579i()
            if (r12 == 0) goto L_0x0445
            com.tencent.mm.protocal.protobuf.FinderContact r12 = r12.f134919d
            if (r12 == 0) goto L_0x0445
            java.lang.String r12 = r12.nickname
            r24 = r12
            goto L_0x0447
        L_0x0445:
            r24 = 0
        L_0x0447:
            r25 = 0
            r26 = 4
            r27 = 0
            java.lang.String r12 = ok1.C62042e.m72808l0(r22, r23, r24, r25, r26, r27)
            androidx.lifecycle.i0 r6 = r6.mo71262a(r7)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.f154382x
            if (r6 == 0) goto L_0x0475
            c50.b r6 = c50.C54655b.f153178f1
            if (r6 == 0) goto L_0x0461
            r6 = 1
            goto L_0x0462
        L_0x0461:
            r6 = 0
        L_0x0462:
            if (r6 != 0) goto L_0x0470
            i50.a r6 = i50.C60251a.f171781k1
            if (r6 == 0) goto L_0x046a
            r6 = 1
            goto L_0x046b
        L_0x046a:
            r6 = 0
        L_0x046b:
            if (r6 == 0) goto L_0x046e
            goto L_0x0470
        L_0x046e:
            r6 = 0
            goto L_0x0471
        L_0x0470:
            r6 = 1
        L_0x0471:
            if (r6 != 0) goto L_0x0475
            r6 = 1
            goto L_0x0476
        L_0x0475:
            r6 = 0
        L_0x0476:
            if (r6 == 0) goto L_0x0492
            te3.hx0 r7 = r5.mo579i()
            if (r7 == 0) goto L_0x0485
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.f134919d
            if (r7 == 0) goto L_0x0485
            java.lang.String r7 = r7.username
            goto L_0x0486
        L_0x0485:
            r7 = 0
        L_0x0486:
            java.lang.String r7 = er1.C7878t0.m8042k(r7, r12)
            java.lang.String r12 = "makeAnonymousNameIfIsMyS…displayName\n            )"
            gy3.C87412m.m108593f(r7, r12)
            r25 = r7
            goto L_0x0494
        L_0x0492:
            r25 = r12
        L_0x0494:
            java.lang.Class<tf0.p1> r7 = tf0.C64916p1.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            java.lang.String r12 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r7, r12)
            r22 = r7
            tf0.p1 r22 = (tf0.C64916p1) r22
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r12 = "getContext()"
            gy3.C87412m.m108593f(r7, r12)
            r26 = 0
            r27 = 8
            r28 = 0
            r23 = r7
            r24 = r15
            java.lang.CharSequence r7 = tf0.C64916p1.C64917a.m76441h(r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r7 = r7.toString()
            te3.hx0 r12 = r5.mo579i()
            if (r12 == 0) goto L_0x04cb
            int r12 = r12.f134926n
            r15 = 3
            if (r12 != r15) goto L_0x04cb
            r12 = 1
            goto L_0x04cc
        L_0x04cb:
            r12 = 0
        L_0x04cc:
            if (r12 == 0) goto L_0x04e1
            if (r6 != 0) goto L_0x04e1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            java.lang.String r7 = ej1.C7704n.f26124b
            r6.append(r7)
            java.lang.String r7 = r6.toString()
        L_0x04e1:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r15 = 0
            r12[r15] = r7
            java.lang.String r7 = r5.getContent()
            if (r7 != 0) goto L_0x04f2
            goto L_0x04f4
        L_0x04f2:
            r16 = r7
        L_0x04f4:
            r7 = 1
            r12[r7] = r16
            r7 = 2131831999(0x7f112cbf, float:1.929704E38)
            java.lang.String r6 = r6.getString(r7, r12)
            java.lang.String r7 = "getContext().getString(\n…Content() ?: \"\"\n        )"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.TextView r7 = r3.f42184g
            if (r13 == 0) goto L_0x0522
            wk1.n r12 = wk1.C15440n.f41895a
            android.view.View r14 = r3.f42181d
            android.content.Context r14 = r14.getContext()
            gy3.C87412m.m108593f(r14, r1)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r1.add(r13)
            rx3.b0 r15 = rx3.C13598b0.f38549a
            r15 = 1
            de3.u r1 = r12.mo14267p(r14, r6, r1, r15)
            goto L_0x0530
        L_0x0522:
            di3.d r1 = di3.C86312j.m106911c(r14)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.SpannableString r1 = r1.mo107057T1(r12, r6)
        L_0x0530:
            r7.setText(r1)
            android.widget.TextView r1 = r3.f42184g
            int r6 = ej1.C7704n.f26125c
            float r6 = (float) r6
            r1.setTextSize(r6)
            er1.j4 r1 = er1.C58739j4.f168176a
            boolean r1 = r1.mo83692U()
            if (r1 == 0) goto L_0x0616
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            int r6 = r5.hashCode()
            r1.append(r6)
            r6 = 44
            r1.append(r6)
            java.lang.String r6 = r5.mo573g()
            r1.append(r6)
            r6 = 58
            r1.append(r6)
            java.lang.String r6 = r5.getContent()
            r1.append(r6)
            r1.append(r4)
            boolean r4 = r5 instanceof cj1.C0584p5
            if (r4 == 0) goto L_0x0575
            r6 = r5
            cj1.p5 r6 = (cj1.C0584p5) r6
            goto L_0x0576
        L_0x0575:
            r6 = 0
        L_0x0576:
            if (r6 == 0) goto L_0x0581
            boolean r6 = r6.mo583m()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto L_0x0582
        L_0x0581:
            r6 = 0
        L_0x0582:
            r1.append(r6)
            r1.append(r0)
            if (r4 == 0) goto L_0x058e
            r0 = r5
            cj1.p5 r0 = (cj1.C0584p5) r0
            goto L_0x058f
        L_0x058e:
            r0 = 0
        L_0x058f:
            if (r0 == 0) goto L_0x059a
            int r0 = r0.getLikeCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x059b
        L_0x059a:
            r0 = 0
        L_0x059b:
            r1.append(r0)
            r1.append(r2)
            boolean r0 = r5.mo578h()
            r1.append(r0)
            r1.append(r11)
            int r0 = r5.mo584n()
            r1.append(r0)
            r0 = r20
            r1.append(r0)
            if (r8 == 0) goto L_0x05c0
            int r0 = r8.f130789d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x05c1
        L_0x05c0:
            r0 = 0
        L_0x05c1:
            r1.append(r0)
            r0 = r19
            r1.append(r0)
            if (r8 == 0) goto L_0x05d2
            int r0 = r8.f130791f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x05d3
        L_0x05d2:
            r0 = 0
        L_0x05d3:
            r1.append(r0)
            r0 = r29
            r1.append(r0)
            if (r13 == 0) goto L_0x05e2
            int r7 = r13.hashCode()
            goto L_0x05e3
        L_0x05e2:
            r7 = 0
        L_0x05e3:
            r1.append(r7)
            r0 = r31
            r1.append(r0)
            wk1.n r0 = wk1.C15440n.f41895a
            te3.hx0 r2 = r5.mo579i()
            if (r2 == 0) goto L_0x05f6
            java.util.LinkedList<te3.aw0> r2 = r2.f134930r
            goto L_0x05f7
        L_0x05f6:
            r2 = 0
        L_0x05f7:
            java.lang.String r0 = r0.mo14268s(r2)
            r1.append(r0)
            java.lang.String r0 = ",holder:"
            r1.append(r0)
            int r0 = r3.hashCode()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "CommentItemTextDanmaku"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r2, r0, r1)
        L_0x0616:
            android.view.View r0 = r3.f42186i
            r9.mo8826c(r5, r0)
        L_0x061b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x061f
        L_0x061e:
            r0 = 0
        L_0x061f:
            if (r0 != 0) goto L_0x064d
            r0 = r33
            java.lang.String r1 = r0.f42180c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "viewHolder:"
            r2.append(r3)
            r3 = r35
            r2.append(r3)
            java.lang.String r3 = ",data:"
            r2.append(r3)
            r3 = r36
            if (r3 == 0) goto L_0x0641
            DATA r4 = r3.f151367x
            goto L_0x0642
        L_0x0641:
            r4 = 0
        L_0x0642:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x064f
        L_0x064d:
            r0 = r33
        L_0x064f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wo1.C15570j.mo14333f(int, ck.f$a, ak.e):void");
    }

    /* renamed from: g */
    public C54869f.C54870a mo14334g(int i) {
        View inflate = LayoutInflater.from(this.f42178a).inflate(C0966R.C0971layout.f7164e9, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…nt_danmaku_text_ui, null)");
        return new C15571a(inflate);
    }
}
