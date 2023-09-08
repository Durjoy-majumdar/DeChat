package rn1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di0.C86295k;
import di0.C86299o;
import di3.C86312j;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.LinkedList;
import k20.C9556a;
import kotlin.ResultKt;
import kr0.C76630x0;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49398f93;
import te3.C50221l60;
import wk1.C15440n;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: rn1.a */
public final class C13091a {

    /* renamed from: a */
    public static final C13091a f37264a = new C13091a();

    /* renamed from: b */
    public static final C13601g f37265b = C36568h.m40985a(C13092a.f37266d);

    /* renamed from: rn1.a$a */
    public static final class C13092a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C13092a f37266d = new C13092a();

        public C13092a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.order.FinderLiveOrderUtil", mo125469f = "FinderLiveOrderUtil.kt", mo125470l = {132}, mo125471m = "getAllHeadLabelSpan")
    /* renamed from: rn1.a$b */
    public static final class C13093b extends C66704d {

        /* renamed from: d */
        public Object f37267d;

        /* renamed from: e */
        public Object f37268e;

        /* renamed from: f */
        public Object f37269f;

        /* renamed from: g */
        public int f37270g;

        /* renamed from: h */
        public /* synthetic */ Object f37271h;

        /* renamed from: i */
        public final /* synthetic */ C13091a f37272i;

        /* renamed from: j */
        public int f37273j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13093b(C13091a aVar, C15601d<? super C13093b> dVar) {
            super(dVar);
            this.f37272i = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f37271h = obj;
            this.f37273j |= Integer.MIN_VALUE;
            return this.f37272i.mo12594b((Context) null, (LinkedList<C49398f93>) null, 0, this);
        }
    }

    /* renamed from: rn1.a$c */
    public static final class C13094c implements C86295k {

        /* renamed from: d */
        public final /* synthetic */ C50221l60 f37274d;

        public C13094c(C50221l60 l602) {
            this.f37274d = l602;
        }

        /* renamed from: a */
        public final String mo3693a() {
            JSONObject jSONObject = new JSONObject();
            String str = this.f37274d.f137207q;
            if (str == null) {
                str = "";
            }
            jSONObject.put("orderDetailsJson", str);
            return jSONObject.toString();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.order.FinderLiveOrderUtil$setOrderName$1", mo125469f = "FinderLiveOrderUtil.kt", mo125470l = {47}, mo125471m = "invokeSuspend")
    /* renamed from: rn1.a$d */
    public static final class C13095d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f37275d;

        /* renamed from: e */
        public final /* synthetic */ TextView f37276e;

        /* renamed from: f */
        public final /* synthetic */ String f37277f;

        /* renamed from: g */
        public final /* synthetic */ LinkedList<C49398f93> f37278g;

        /* renamed from: h */
        public final /* synthetic */ int f37279h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13095d(TextView textView, String str, LinkedList<C49398f93> linkedList, int i, C15601d<? super C13095d> dVar) {
            super(2, dVar);
            this.f37276e = textView;
            this.f37277f = str;
            this.f37278g = linkedList;
            this.f37279h = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13095d(this.f37276e, this.f37277f, this.f37278g, this.f37279h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13095d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f37275d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f37276e.setText(this.f37277f);
                if (!this.f37278g.isEmpty()) {
                    C13091a aVar2 = C13091a.f37264a;
                    Context context = this.f37276e.getContext();
                    C87412m.m108593f(context, "name.context");
                    LinkedList<C49398f93> linkedList = this.f37278g;
                    int i2 = this.f37279h;
                    this.f37275d = 1;
                    obj = aVar2.mo12594b(context, linkedList, i2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return C13598b0.f38549a;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LinkedList linkedList2 = (LinkedList) obj;
            if (!linkedList2.isEmpty()) {
                linkedList2.addLast(C15440n.f41895a.mo14262k());
            }
            TextView textView = this.f37276e;
            C15440n nVar = C15440n.f41895a;
            Context context2 = textView.getContext();
            C87412m.m108593f(context2, "name.context");
            textView.setText(nVar.mo14267p(context2, this.f37277f, linkedList2, true));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.order.FinderLiveOrderUtil$setPlatformName$1", mo125469f = "FinderLiveOrderUtil.kt", mo125470l = {64}, mo125471m = "invokeSuspend")
    /* renamed from: rn1.a$e */
    public static final class C13096e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f37280d;

        /* renamed from: e */
        public int f37281e;

        /* renamed from: f */
        public final /* synthetic */ TextView f37282f;

        /* renamed from: g */
        public final /* synthetic */ LinkedList<C49398f93> f37283g;

        /* renamed from: h */
        public final /* synthetic */ String f37284h;

        /* renamed from: i */
        public final /* synthetic */ int f37285i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13096e(TextView textView, LinkedList<C49398f93> linkedList, String str, int i, C15601d<? super C13096e> dVar) {
            super(2, dVar);
            this.f37282f = textView;
            this.f37283g = linkedList;
            this.f37284h = str;
            this.f37285i = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13096e(this.f37282f, this.f37283g, this.f37284h, this.f37285i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13096e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            TextView textView;
            CharSequence charSequence;
            TextView textView2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f37281e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                textView = this.f37282f;
                LinkedList<C49398f93> linkedList = this.f37283g;
                if (linkedList == null || linkedList.isEmpty()) {
                    charSequence = this.f37284h;
                    textView.setText(charSequence);
                    return C13598b0.f38549a;
                }
                C13091a aVar2 = C13091a.f37264a;
                Context context = this.f37282f.getContext();
                C87412m.m108593f(context, "name.context");
                LinkedList<C49398f93> linkedList2 = this.f37283g;
                int i2 = this.f37285i;
                this.f37280d = textView;
                this.f37281e = 1;
                Object b = aVar2.mo12594b(context, linkedList2, i2, this);
                if (b == aVar) {
                    return aVar;
                }
                textView2 = textView;
                obj = b;
            } else if (i == 1) {
                textView2 = (TextView) this.f37280d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LinkedList linkedList3 = (LinkedList) obj;
            if (!linkedList3.isEmpty()) {
                linkedList3.addFirst(C15440n.f41895a.mo14262k());
            }
            C15440n nVar = C15440n.f41895a;
            Context context2 = this.f37282f.getContext();
            C87412m.m108593f(context2, "name.context");
            TextView textView3 = textView2;
            charSequence = nVar.mo14267p(context2, this.f37284h, linkedList3, false);
            textView = textView3;
            textView.setText(charSequence);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo12593a(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderLiveOrderUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/FinderLiveOrderUtil", "enterFinderLiveOrderUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/order/FinderLiveOrderUtil", "enterFinderLiveOrderUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0240 A[SYNTHETIC] */
    /* renamed from: b */
    public final java.lang.Object mo12594b(android.content.Context r17, java.util.LinkedList<te3.C49398f93> r18, int r19, wx3.C15601d<? super java.util.LinkedList<android.text.style.ImageSpan>> r20) {
        /*
            r16 = this;
            r0 = r20
            boolean r1 = r0 instanceof rn1.C13091a.C13093b
            if (r1 == 0) goto L_0x0017
            r1 = r0
            rn1.a$b r1 = (rn1.C13091a.C13093b) r1
            int r2 = r1.f37273j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f37273j = r2
            r2 = r16
            goto L_0x001e
        L_0x0017:
            rn1.a$b r1 = new rn1.a$b
            r2 = r16
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.f37271h
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r1.f37273j
            java.lang.String r5 = "FinderLiveOrderUtil"
            r6 = 1
            if (r4 == 0) goto L_0x004d
            if (r4 != r6) goto L_0x0045
            int r4 = r1.f37270g
            java.lang.Object r7 = r1.f37269f
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r1.f37268e
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            java.lang.Object r9 = r1.f37267d
            android.content.Context r9 = (android.content.Context) r9
            kotlin.ResultKt.throwOnFailure(r0)
            r13 = r5
            r14 = r7
            r15 = r8
            r5 = r3
            r3 = r4
            r4 = r1
            r1 = r9
            goto L_0x020e
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r4 = r18.iterator()
            r15 = r0
            r14 = r4
            r13 = r5
            r4 = r1
            r5 = r3
            r1 = r17
            r3 = r19
        L_0x0062:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0240
            java.lang.Object r0 = r14.next()
            te3.f93 r0 = (te3.C49398f93) r0
            int r7 = r0.f133363d
            java.lang.String r8 = ""
            java.lang.String r9 = ",wording:"
            r10 = 0
            java.lang.String r11 = "getAllHeadLabelSpan label_type:"
            r12 = 0
            if (r7 != 0) goto L_0x01c1
            te3.h93 r7 = r0.f133364e
            if (r7 == 0) goto L_0x019f
            java.lang.String r7 = r7.f134516d
            if (r7 == 0) goto L_0x008b
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r7 = 0
            goto L_0x008c
        L_0x008b:
            r7 = 1
        L_0x008c:
            if (r7 == 0) goto L_0x0090
            goto L_0x019f
        L_0x0090:
            te3.h93 r7 = r0.f133364e
            gy3.C87412m.m108591d(r7)
            java.lang.String r0 = r7.f134517e
            if (r0 == 0) goto L_0x00a2
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r0 = 0
            goto L_0x00a3
        L_0x00a2:
            r0 = 1
        L_0x00a3:
            r9 = 2131099940(0x7f060124, float:1.7812247E38)
            if (r0 != 0) goto L_0x0108
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            java.lang.String r10 = ",serverColor:"
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = r7.f134521i     // Catch:{ Exception -> 0x00b7 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x0114
        L_0x00b7:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r10)
            java.lang.String r0 = r7.f134521i
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r9)
            goto L_0x0114
        L_0x00dc:
            java.lang.String r0 = r7.f134517e     // Catch:{ Exception -> 0x00e3 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x0114
        L_0x00e3:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r10)
            java.lang.String r0 = r7.f134517e
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r9)
            goto L_0x0114
        L_0x0108:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r9)
        L_0x0114:
            int r9 = wk1.C15460p.f41933f
            wk1.p$a r9 = new wk1.p$a
            r9.<init>()
            java.lang.String r10 = r7.f134518f
            r9.mo14277d(r10)
            wk1.p$c r10 = r9.f41936a
            r10.f41940c = r0
            int r0 = r7.f134519g
            int r0 = r0 * 255
            int r0 = r0 / 100
            r10.f41944g = r0
            boolean r0 = r7.f134520h
            r10.f41945h = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r10 = 2131165444(0x7f070104, float:1.7945105E38)
            float r0 = r0.getDimension(r10)
            int r0 = (int) r0
            wk1.p$c r10 = r9.f41936a
            r10.f41941d = r0
            r10.f41943f = r12
            rx3.g r0 = f37265b
            r10 = r0
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            wk1.p$c r11 = r9.f41936a
            r11.f41946i = r10
            r10 = r0
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r9.mo14276c(r10)
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            wk1.p$c r10 = r9.f41936a
            r10.f41952o = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r10 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r0 = r0.getDimensionPixelOffset(r10)
            wk1.p$c r10 = r9.f41936a
            r10.f41951n = r0
            java.lang.String r0 = r7.f134516d
            if (r0 != 0) goto L_0x0192
            goto L_0x0193
        L_0x0192:
            r8 = r0
        L_0x0193:
            r9.mo14278e(r8)
            wk1.p r0 = r9.mo14274a()
            r15.add(r0)
            goto L_0x0062
        L_0x019f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            int r8 = r0.f133363d
            r7.append(r8)
            r7.append(r9)
            te3.h93 r0 = r0.f133364e
            if (r0 == 0) goto L_0x01b5
            java.lang.String r10 = r0.f134516d
        L_0x01b5:
            r7.append(r10)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x0062
        L_0x01c1:
            if (r7 != r6) goto L_0x021e
            java.lang.String r7 = r0.f133365f
            if (r7 == 0) goto L_0x01cd
            int r7 = r7.length()
            if (r7 != 0) goto L_0x01ce
        L_0x01cd:
            r12 = 1
        L_0x01ce:
            if (r12 == 0) goto L_0x01f0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            int r8 = r0.f133363d
            r7.append(r8)
            java.lang.String r8 = ",img_url:"
            r7.append(r8)
            java.lang.String r0 = r0.f133365f
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x0062
        L_0x01f0:
            np1.i0 r7 = np1.C61866i0.f175909a
            java.lang.String r0 = r0.f133365f
            if (r0 != 0) goto L_0x01f8
            r9 = r8
            goto L_0x01f9
        L_0x01f8:
            r9 = r0
        L_0x01f9:
            r11 = 0
            r4.f37267d = r1
            r4.f37268e = r15
            r4.f37269f = r14
            r4.f37270g = r3
            r4.f37273j = r6
            r8 = r1
            r10 = r3
            r12 = r4
            java.lang.Object r0 = r7.mo86795f(r8, r9, r10, r11, r12)
            if (r0 != r5) goto L_0x020e
            return r5
        L_0x020e:
            android.text.style.ImageSpan r0 = (android.text.style.ImageSpan) r0
            if (r0 == 0) goto L_0x0217
            r15.add(r0)
            goto L_0x0062
        L_0x0217:
            java.lang.String r0 = "getAllHeadLabelSpan imgSpan is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x0062
        L_0x021e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            int r8 = r0.f133363d
            r7.append(r8)
            r7.append(r9)
            te3.h93 r0 = r0.f133364e
            if (r0 == 0) goto L_0x0234
            java.lang.String r10 = r0.f134516d
        L_0x0234:
            r7.append(r10)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            goto L_0x0062
        L_0x0240:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: rn1.C13091a.mo12594b(android.content.Context, java.util.LinkedList, int, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo12595c(Context context, C50221l60 l602, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(l602, "order");
        C86299o oVar = new C86299o();
        String str = l602.f137210t;
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            String str2 = l602.f137211u;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                oVar.f250929a = l602.f137210t;
                oVar.f250934f = l602.f137211u;
                oVar.f250939k = i;
                oVar.f250931c = C58739j4.f168176a.mo83673A();
                oVar.f250937i = new C13094c(l602);
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
            }
        }
        oVar.f250930b = "wxb1b30dcd0a6be5cb";
        oVar.f250934f = "pages/detail/index.html";
        oVar.f250939k = i;
        oVar.f250931c = C58739j4.f168176a.mo83673A();
        oVar.f250937i = new C13094c(l602);
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
    }

    /* renamed from: d */
    public final void mo12596d(TextView textView, String str, LinkedList<C49398f93> linkedList, int i, C0000n0 n0Var) {
        C87412m.m108594g(textView, "name");
        C87412m.m108594g(str, "desc");
        C87412m.m108594g(linkedList, "headLabel");
        if (n0Var != null) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C13095d(textView, str, linkedList, i, (C15601d<? super C13095d>) null), 3, (Object) null);
            return;
        }
        Log.m105924i("FinderLiveOrderUtil", "setOrderName scope is null!");
        textView.setText(str);
        C13598b0 b0Var = C13598b0.f38549a;
    }

    /* renamed from: e */
    public final void mo12597e(TextView textView, String str, LinkedList<C49398f93> linkedList, int i, C0000n0 n0Var) {
        C87412m.m108594g(textView, "name");
        C87412m.m108594g(str, "desc");
        if (n0Var != null) {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C13096e(textView, linkedList, str, i, (C15601d<? super C13096e>) null), 3, (Object) null);
            return;
        }
        Log.m105924i("FinderLiveOrderUtil", "setPlatformName scope is null!");
        textView.setText(str);
        C13598b0 b0Var = C13598b0.f38549a;
    }
}
