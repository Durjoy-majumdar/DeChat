package wt2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import ms2.C99965e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: wt2.b */
public final class C102497b {

    /* renamed from: a */
    public final C0000n0 f301796a;

    /* renamed from: b */
    public final LinearLayout f301797b;

    /* renamed from: c */
    public final HashMap<Integer, View> f301798c = new HashMap<>();

    /* renamed from: d */
    public final Context f301799d;

    /* renamed from: e */
    public String f301800e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1", mo125469f = "HeaderErrorPostHandle.kt", mo125470l = {62, 78}, mo125471m = "invokeSuspend")
    /* renamed from: wt2.b$a */
    public static final class C102498a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f301801d;

        /* renamed from: e */
        public int f301802e;

        /* renamed from: f */
        public int f301803f;

        /* renamed from: g */
        public int f301804g;

        /* renamed from: h */
        public final /* synthetic */ C102497b f301805h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1", mo125469f = "HeaderErrorPostHandle.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: wt2.b$a$a */
        public static final class C102499a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C102497b f301806d;

            /* renamed from: e */
            public final /* synthetic */ List<Object> f301807e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102499a(C102497b bVar, List<? extends Object> list, C15601d<? super C102499a> dVar) {
                super(2, dVar);
                this.f301806d = bVar;
                this.f301807e = list;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1");
                C102499a aVar = new C102499a(this.f301806d, this.f301807e, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1");
                Object invokeSuspend = ((C102499a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1");
                ResultKt.throwOnFailure(obj);
                C102497b bVar = this.f301806d;
                bVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                LinearLayout linearLayout = bVar.f301797b;
                SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                linearLayout.removeAllViews();
                C102497b bVar2 = this.f301806d;
                bVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                LinearLayout linearLayout2 = bVar2.f301797b;
                SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                linearLayout2.setVisibility(this.f301807e.isEmpty() ^ true ? 0 : 8);
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$1");
                return b0Var;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2", mo125469f = "HeaderErrorPostHandle.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: wt2.b$a$b */
        public static final class C102500b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C102497b f301808d;

            /* renamed from: e */
            public final /* synthetic */ C8478d0 f301809e;

            /* renamed from: f */
            public final /* synthetic */ List<Object> f301810f;

            /* renamed from: g */
            public final /* synthetic */ int f301811g;

            /* renamed from: h */
            public final /* synthetic */ C8479f0<String> f301812h;

            /* renamed from: i */
            public final /* synthetic */ Object f301813i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C102500b(C102497b bVar, C8478d0 d0Var, List<? extends Object> list, int i, C8479f0<String> f0Var, Object obj, C15601d<? super C102500b> dVar) {
                super(2, dVar);
                this.f301808d = bVar;
                this.f301809e = d0Var;
                this.f301810f = list;
                this.f301811g = i;
                this.f301812h = f0Var;
                this.f301813i = obj;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
                C102500b bVar = new C102500b(this.f301808d, this.f301809e, this.f301810f, this.f301811g, this.f301812h, this.f301813i, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
                Object invokeSuspend = ((C102500b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
                ResultKt.throwOnFailure(obj);
                C102497b bVar = this.f301808d;
                int i = this.f301809e.f27483d;
                int size = this.f301810f.size();
                int i2 = this.f301811g;
                SnsMethodCalculate.markStartTimeMs("access$getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                bVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                View view = bVar.f301798c.get(Integer.valueOf(i));
                if (view != null) {
                    if (view.getParent() != null) {
                        ViewParent parent = view.getParent();
                        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) parent).removeView(view);
                    }
                    SnsMethodCalculate.markEndTimeMs("getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                } else {
                    View inflate = C85868k2.m106137b(bVar.f301799d).inflate(C0966R.C0971layout.d_6, bVar.f301797b, false);
                    C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                    view = (LinearLayout) inflate;
                    view.setOnClickListener(new C102496a(bVar, size, i2));
                    bVar.f301798c.put(Integer.valueOf(i), view);
                    SnsMethodCalculate.markEndTimeMs("getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                }
                SnsMethodCalculate.markEndTimeMs("access$getNotifyView", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                LinearLayout linearLayout = (LinearLayout) view;
                linearLayout.setTag(this.f301812h.f27484d);
                View findViewById = linearLayout.findViewById(C0966R.C0970id.f359263jv1);
                C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) findViewById;
                Object obj2 = this.f301813i;
                if (obj2 instanceof SnsInfo) {
                    textView.setText(C0966R.string.mik);
                } else if (obj2 instanceof C99965e) {
                    int i3 = ((C99965e) obj2).f292908f;
                    if (i3 == 2) {
                        textView.setText(C0966R.string.m9_);
                    } else if (i3 == 1) {
                        textView.setText(C0966R.string.m9a);
                    }
                }
                C102497b bVar2 = this.f301808d;
                bVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                LinearLayout linearLayout2 = bVar2.f301797b;
                SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                linearLayout2.addView(linearLayout);
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1$2");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102498a(C102497b bVar, C15601d<? super C102498a> dVar) {
            super(2, dVar);
            this.f301805h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
            C102498a aVar = new C102498a(this.f301805h, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
            Object invokeSuspend = ((C102498a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1");
            return invokeSuspend;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x010c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.String r1 = "invokeSuspend"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$refreshError$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r0.f301804g
                r5 = 1
                r6 = 2
                r7 = 0
                java.lang.String r8 = ""
                if (r4 == 0) goto L_0x0040
                if (r4 == r5) goto L_0x0037
                if (r4 != r6) goto L_0x002c
                int r4 = r0.f301803f
                int r7 = r0.f301802e
                java.lang.Object r9 = r0.f301801d
                java.util.List r9 = (java.util.List) r9
                kotlin.ResultKt.throwOnFailure(r21)
                r12 = r0
                r15 = r7
                r14 = r8
                r13 = r9
                r0 = 1
                r7 = 2
                goto L_0x019d
            L_0x002c:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                throw r3
            L_0x0037:
                java.lang.Object r4 = r0.f301801d
                java.util.List r4 = (java.util.List) r4
                kotlin.ResultKt.throwOnFailure(r21)
                goto L_0x00f9
            L_0x0040:
                kotlin.ResultKt.throwOnFailure(r21)
                ms2.g r4 = ms2.C99966g.f292911a
                java.util.List r4 = r4.mo139307a()
                java.util.Iterator r9 = r4.iterator()
                r10 = r8
            L_0x004e:
                boolean r11 = r9.hasNext()
                if (r11 == 0) goto L_0x0092
                java.lang.Object r11 = r9.next()
                boolean r12 = r11 instanceof com.tencent.p014mm.plugin.sns.storage.SnsInfo
                r13 = 32
                if (r12 == 0) goto L_0x0077
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r10)
                com.tencent.mm.plugin.sns.storage.SnsInfo r11 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r11
                java.lang.String r10 = r11.getLocalid()
                r12.append(r10)
                r12.append(r13)
                java.lang.String r10 = r12.toString()
                goto L_0x004e
            L_0x0077:
                boolean r12 = r11 instanceof ms2.C99965e
                if (r12 == 0) goto L_0x004e
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r10)
                ms2.e r11 = (ms2.C99965e) r11
                long r10 = r11.f292906d
                r12.append(r10)
                r12.append(r13)
                java.lang.String r10 = r12.toString()
                goto L_0x004e
            L_0x0092:
                r9 = 3
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r11 = r4
                java.util.LinkedList r11 = (java.util.LinkedList) r11
                int r11 = r11.size()
                java.lang.Integer r12 = new java.lang.Integer
                r12.<init>(r11)
                r9[r7] = r12
                r9[r5] = r10
                wt2.b r11 = r0.f301805h
                java.lang.String r12 = "access$getLastErrorItems$p"
                java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
                java.lang.String r11 = r11.f301800e
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
                r9[r6] = r11
                java.lang.String r11 = "MicroMsg.Improve.ErrorPost"
                java.lang.String r14 = "refreshError %s %s %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r9)
                wt2.b r9 = r0.f301805h
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
                java.lang.String r9 = r9.f301800e
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
                boolean r9 = gy3.C87412m.m108589b(r10, r9)
                if (r9 == 0) goto L_0x00d3
                rx3.b0 r3 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x00d3:
                wt2.b r9 = r0.f301805h
                java.lang.String r11 = "access$setLastErrorItems$p"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)
                r9.f301800e = r10
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)
                a14.h0 r9 = a14.C53872d1.f151117a
                a14.k2 r9 = f14.C58901s.f168555a
                wt2.b$a$a r10 = new wt2.b$a$a
                wt2.b r11 = r0.f301805h
                r12 = 0
                r10.<init>(r11, r4, r12)
                r0.f301801d = r4
                r0.f301804g = r5
                java.lang.Object r9 = a14.C53895h.m60469g(r9, r10, r0)
                if (r9 != r3) goto L_0x00f9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x00f9:
                com.tencent.mm.plugin.sns.ui.SnsHeader$k r9 = new com.tencent.mm.plugin.sns.ui.SnsHeader$k
                r9.<init>()
                java.util.Collections.sort(r4, r9)
                int r9 = r4.size()
                r12 = r0
                r13 = r4
                r14 = r8
                r4 = r9
                r15 = 0
            L_0x010a:
                if (r15 >= r4) goto L_0x01a4
                java.lang.Object r11 = r13.get(r15)
                gy3.f0 r10 = new gy3.f0
                r10.<init>()
                r10.f27484d = r14
                gy3.d0 r9 = new gy3.d0
                r9.<init>()
                boolean r7 = r11 instanceof com.tencent.p014mm.plugin.sns.storage.SnsInfo
                if (r7 == 0) goto L_0x013f
                r7 = r11
                com.tencent.mm.plugin.sns.storage.SnsInfo r7 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r7
                int r8 = r7.localid
                r9.f27483d = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r5 = "feed_"
                r8.append(r5)
                java.lang.String r5 = r7.getLocalid()
                r8.append(r5)
                java.lang.String r5 = r8.toString()
                r10.f27484d = r5
                goto L_0x015f
            L_0x013f:
                boolean r5 = r11 instanceof ms2.C99965e
                if (r5 == 0) goto L_0x015f
                r5 = r11
                ms2.e r5 = (ms2.C99965e) r5
                int r5 = r5.f292907e
                r9.f27483d = r5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "comment_"
                r5.append(r7)
                int r7 = r9.f27483d
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                r10.f27484d = r5
            L_0x015f:
                a14.h0 r5 = a14.C53872d1.f151117a
                a14.k2 r5 = f14.C58901s.f168555a
                wt2.b$a$b r8 = new wt2.b$a$b
                wt2.b r7 = r12.f301805h
                r16 = 0
                r17 = r7
                r7 = r8
                r18 = r8
                r8 = r17
                r17 = r10
                r10 = r13
                r19 = r11
                r11 = r15
                r6 = r12
                r12 = r17
                r0 = r13
                r13 = r19
                r17 = r14
                r14 = r16
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                r6.f301801d = r0
                r6.f301802e = r15
                r6.f301803f = r4
                r7 = 2
                r6.f301804g = r7
                r8 = r18
                java.lang.Object r5 = a14.C53895h.m60469g(r5, r8, r6)
                if (r5 != r3) goto L_0x0198
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x0198:
                r13 = r0
                r12 = r6
                r14 = r17
                r0 = 1
            L_0x019d:
                int r15 = r15 + r0
                r0 = r20
                r5 = 1
                r6 = 2
                goto L_0x010a
            L_0x01a4:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wt2.C102497b.C102498a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C102497b(C0000n0 n0Var, LinearLayout linearLayout) {
        C87412m.m108594g(n0Var, "lifecycleScope");
        C87412m.m108594g(linearLayout, "layout");
        this.f301796a = n0Var;
        this.f301797b = linearLayout;
        this.f301799d = linearLayout.getContext();
        this.f301800e = "";
    }

    /* renamed from: a */
    public final void mo142115a() {
        SnsMethodCalculate.markStartTimeMs("refreshError", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        C53895h.m60466d(this.f301796a, C53872d1.f151117a, (C53934p0) null, new C102498a(this, (C15601d<? super C102498a>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("refreshError", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
    }
}
