package np1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.style.ImageSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C0665i1;
import cl1.C0666j1;
import cl1.C0667k1;
import cl1.C0670l1;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import go3.C76003c;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg3.C76577a;
import kotlin.Result;
import kotlin.ResultKt;
import l60.C99344b;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONObject;
import p1028re.C89928a;
import p1028re.C89931d;
import p40.C62192a;
import p629ny.C76979h;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C13696v;
import sk1.C63947a;
import sk1.C63964u;
import sk1.C63965x;
import sx3.C36907w;
import sx3.C64197v;
import t60.C64207e;
import te3.C50019jp1;
import te3.C51212s90;
import te3.C51358t81;
import te3.C52128yk0;
import te3.C64370fp1;
import te3.C64399gj1;
import te3.C64426ho2;
import te3.C64434i11;
import te3.C64688rq1;
import te3.C64805wk1;
import te3.C64834xn2;
import te3.z44;
import tf0.C64916p1;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import x60.C102564a;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: np1.i0 */
public final class C61866i0 {

    /* renamed from: a */
    public static final C61866i0 f175909a = new C61866i0();

    /* renamed from: b */
    public static final C13601g f175910b = C36568h.m40985a(C11251g.f33160d);

    /* renamed from: c */
    public static final C13601g f175911c = C36568h.m40985a(C11252h.f33161d);

    /* renamed from: d */
    public static final C13601g f175912d = C36568h.m40985a(C11250c.f33159d);

    /* renamed from: e */
    public static final C13601g f175913e = C36568h.m40985a(C34998f.f93931d);

    /* renamed from: f */
    public static final C13601g f175914f = C36568h.m40985a(C34996d.f93929d);

    /* renamed from: g */
    public static final C13601g f175915g = C36568h.m40985a(C34997e.f93930d);

    /* renamed from: h */
    public static final LruCache<String, Bitmap> f175916h = new LruCache<>(5);

    /* renamed from: np1.i0$c */
    public static final class C11250c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C11250c f33159d = new C11250c();

        public C11250c() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3703bv));
        }
    }

    /* renamed from: np1.i0$g */
    public static final class C11251g extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C11251g f33160d = new C11251g();

        public C11251g() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C32444a.f86033A0.mo60266n().intValue() == 0);
        }
    }

    /* renamed from: np1.i0$h */
    public static final class C11252h extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C11252h f33161d = new C11252h();

        public C11252h() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C32444a.f86045D0.mo60266n().intValue() == 0);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.ShoppingUtil$insertImageSpanToText$1", mo125469f = "ShoppingUtil.kt", mo125470l = {689}, mo125471m = "invokeSuspend")
    /* renamed from: np1.i0$l */
    public static final class C11253l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f33162d;

        /* renamed from: e */
        public boolean f33163e;

        /* renamed from: f */
        public int f33164f;

        /* renamed from: g */
        public /* synthetic */ Object f33165g;

        /* renamed from: h */
        public final /* synthetic */ List<String> f33166h;

        /* renamed from: i */
        public final /* synthetic */ String f33167i;

        /* renamed from: j */
        public final /* synthetic */ C0000n0 f33168j;

        /* renamed from: n */
        public final /* synthetic */ boolean f33169n;

        /* renamed from: o */
        public final /* synthetic */ boolean f33170o;

        /* renamed from: p */
        public final /* synthetic */ TextView f33171p;

        /* renamed from: q */
        public final /* synthetic */ String f33172q;

        /* renamed from: r */
        public final /* synthetic */ boolean f33173r;

        /* renamed from: s */
        public final /* synthetic */ C32224a<C13598b0> f33174s;

        /* renamed from: t */
        public final /* synthetic */ int f33175t;

        /* renamed from: u */
        public final /* synthetic */ boolean f33176u;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.ShoppingUtil$insertImageSpanToText$1$1$work$1", mo125469f = "ShoppingUtil.kt", mo125470l = {683}, mo125471m = "invokeSuspend")
        /* renamed from: np1.i0$l$a */
        public static final class C11254a extends C91594j implements C32227p<C0000n0, C15601d<? super ImageSpan>, Object> {

            /* renamed from: d */
            public int f33177d;

            /* renamed from: e */
            public final /* synthetic */ TextView f33178e;

            /* renamed from: f */
            public final /* synthetic */ String f33179f;

            /* renamed from: g */
            public final /* synthetic */ int f33180g;

            /* renamed from: h */
            public final /* synthetic */ boolean f33181h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11254a(TextView textView, String str, int i, boolean z, C15601d<? super C11254a> dVar) {
                super(2, dVar);
                this.f33178e = textView;
                this.f33179f = str;
                this.f33180g = i;
                this.f33181h = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C11254a(this.f33178e, this.f33179f, this.f33180g, this.f33181h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C11254a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f33177d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C61866i0 i0Var = C61866i0.f175909a;
                    Context context = this.f33178e.getContext();
                    C87412m.m108593f(context, "text.context");
                    this.f33177d = 1;
                    obj = i0Var.mo86795f(context, this.f33179f, this.f33180g, !this.f33181h, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11253l(List<String> list, String str, C0000n0 n0Var, boolean z, boolean z2, TextView textView, String str2, boolean z3, C32224a<C13598b0> aVar, int i, boolean z4, C15601d<? super C11253l> dVar) {
            super(2, dVar);
            this.f33166h = list;
            this.f33167i = str;
            this.f33168j = n0Var;
            this.f33169n = z;
            this.f33170o = z2;
            this.f33171p = textView;
            this.f33172q = str2;
            this.f33173r = z3;
            this.f33174s = aVar;
            this.f33175t = i;
            this.f33176u = z4;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C11253l lVar = new C11253l(this.f33166h, this.f33167i, this.f33168j, this.f33169n, this.f33170o, this.f33171p, this.f33172q, this.f33173r, this.f33174s, this.f33175t, this.f33176u, dVar);
            lVar.f33165g = obj;
            return lVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11253l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0132  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f33164f
                java.lang.String r3 = "genSpanList source:"
                java.lang.String r4 = "ShoppingUtil"
                r5 = 1
                if (r2 == 0) goto L_0x0029
                if (r2 != r5) goto L_0x0021
                boolean r2 = r0.f33163e
                java.lang.Object r6 = r0.f33162d
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.f33165g
                java.util.LinkedList r7 = (java.util.LinkedList) r7
                kotlin.ResultKt.throwOnFailure(r23)
                r9 = r23
                r8 = r0
                goto L_0x012e
            L_0x0021:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0029:
                kotlin.ResultKt.throwOnFailure(r23)
                java.lang.Object r2 = r0.f33165g
                a14.n0 r2 = (a14.C0000n0) r2
                np1.i0 r6 = np1.C61866i0.f175909a
                java.util.List<java.lang.String> r7 = r0.f33166h
                r6.getClass()
                java.lang.String r6 = "iconList"
                gy3.C87412m.m108594g(r7, r6)
                int r6 = r7.size()
                r8 = 2
                r9 = 0
                if (r6 >= r8) goto L_0x0046
            L_0x0044:
                r12 = 0
                goto L_0x0069
            L_0x0046:
                int r6 = r7.size()
                int r8 = r6 + -1
                r10 = 0
            L_0x004d:
                if (r10 >= r8) goto L_0x0044
                int r11 = r10 + 1
                r12 = r11
            L_0x0052:
                if (r12 >= r6) goto L_0x0067
                java.lang.Object r13 = r7.get(r10)
                java.lang.Object r14 = r7.get(r12)
                boolean r13 = gy3.C87412m.m108589b(r13, r14)
                if (r13 == 0) goto L_0x0064
                r12 = 1
                goto L_0x0069
            L_0x0064:
                int r12 = r12 + 1
                goto L_0x0052
            L_0x0067:
                r10 = r11
                goto L_0x004d
            L_0x0069:
                er1.j4 r6 = er1.C58739j4.f168176a
                boolean r6 = r6.mo83692U()
                if (r6 == 0) goto L_0x009c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                java.lang.String r7 = r0.f33167i
                r6.append(r7)
                java.lang.String r7 = " hasSameUrl:"
                r6.append(r7)
                r6.append(r12)
                java.lang.String r7 = ", start gen icons(scope:"
                r6.append(r7)
                a14.n0 r7 = r0.f33168j
                r6.append(r7)
                java.lang.String r7 = ")!"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
            L_0x009c:
                java.util.LinkedList r11 = new java.util.LinkedList
                r11.<init>()
                java.util.List<java.lang.String> r6 = r0.f33166h
                android.widget.TextView r10 = r0.f33171p
                int r9 = r0.f33175t
                java.util.Iterator r19 = r6.iterator()
            L_0x00ab:
                boolean r6 = r19.hasNext()
                if (r6 == 0) goto L_0x00df
                java.lang.Object r6 = r19.next()
                r15 = r6
                java.lang.String r15 = (java.lang.String) r15
                r7 = 0
                r8 = 0
                np1.i0$l$a r20 = new np1.i0$l$a
                r18 = 0
                r13 = r20
                r14 = r10
                r16 = r9
                r17 = r12
                r13.<init>(r14, r15, r16, r17, r18)
                r13 = 3
                r14 = 0
                r6 = r2
                r15 = r9
                r9 = r20
                r16 = r10
                r10 = r13
                r13 = r11
                r11 = r14
                a14.u0 r6 = a14.C53895h.m60464b(r6, r7, r8, r9, r10, r11)
                r13.add(r6)
                r11 = r13
                r9 = r15
                r10 = r16
                goto L_0x00ab
            L_0x00df:
                r13 = r11
                er1.j4 r2 = er1.C58739j4.f168176a
                boolean r2 = r2.mo83692U()
                if (r2 == 0) goto L_0x0101
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                java.lang.String r6 = r0.f33167i
                r2.append(r6)
                java.lang.String r6 = " async gen icons!"
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            L_0x0101:
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                boolean r6 = r0.f33176u
                java.util.Iterator r7 = r13.iterator()
                r8 = r0
                r21 = r7
                r7 = r2
                r2 = r6
                r6 = r21
            L_0x0113:
                boolean r9 = r6.hasNext()
                if (r9 == 0) goto L_0x0147
                java.lang.Object r9 = r6.next()
                a14.u0 r9 = (a14.C53953u0) r9
                r8.f33165g = r7
                r8.f33162d = r6
                r8.f33163e = r2
                r8.f33164f = r5
                java.lang.Object r9 = r9.mo74634A(r8)
                if (r9 != r1) goto L_0x012e
                return r1
            L_0x012e:
                android.text.style.ImageSpan r9 = (android.text.style.ImageSpan) r9
                if (r9 == 0) goto L_0x0113
                int r10 = r7.size()
                if (r10 <= 0) goto L_0x0143
                if (r2 == 0) goto L_0x0143
                wk1.n r10 = wk1.C15440n.f41895a
                android.text.style.ImageSpan r10 = r10.mo14262k()
                r7.add(r10)
            L_0x0143:
                r7.add(r9)
                goto L_0x0113
            L_0x0147:
                er1.j4 r1 = er1.C58739j4.f168176a
                boolean r1 = r1.mo83692U()
                if (r1 == 0) goto L_0x0174
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r2 = r8.f33167i
                r1.append(r2)
                java.lang.String r2 = " finish gen icons, spanList size:"
                r1.append(r2)
                int r2 = r7.size()
                r1.append(r2)
                r2 = 33
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            L_0x0174:
                boolean r1 = r7.isEmpty()
                r1 = r1 ^ r5
                if (r1 == 0) goto L_0x0195
                boolean r1 = r8.f33169n
                if (r1 == 0) goto L_0x0188
                wk1.n r1 = wk1.C15440n.f41895a
                android.text.style.ImageSpan r1 = r1.mo14262k()
                r7.addFirst(r1)
            L_0x0188:
                boolean r1 = r8.f33170o
                if (r1 == 0) goto L_0x0195
                wk1.n r1 = wk1.C15440n.f41895a
                android.text.style.ImageSpan r1 = r1.mo14262k()
                r7.addLast(r1)
            L_0x0195:
                android.widget.TextView r1 = r8.f33171p
                wk1.n r2 = wk1.C15440n.f41895a
                android.content.Context r3 = r1.getContext()
                java.lang.String r4 = "text.context"
                gy3.C87412m.m108593f(r3, r4)
                java.lang.String r4 = r8.f33172q
                boolean r5 = r8.f33173r
                de3.u r2 = r2.mo14267p(r3, r4, r7, r5)
                r1.setText(r2)
                fy3.a<rx3.b0> r1 = r8.f33174s
                if (r1 == 0) goto L_0x01b5
                r1.invoke()
            L_0x01b5:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: np1.C61866i0.C11253l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: np1.i0$d */
    public static final class C34996d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C34996d f93929d = new C34996d();

        public C34996d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C61866i0.f175909a.mo86796h());
        }
    }

    /* renamed from: np1.i0$e */
    public static final class C34997e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C34997e f93930d = new C34997e();

        public C34997e() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C61866i0.f175909a.mo86796h());
        }
    }

    /* renamed from: np1.i0$f */
    public static final class C34998f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C34998f f93931d = new C34998f();

        public C34998f() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C61866i0.f175909a.mo86796h());
        }
    }

    /* renamed from: np1.i0$a */
    public static final class C61867a implements C89928a {
        /* renamed from: a */
        public void mo391a(int i) {
            C61866i0.m72595a(C61866i0.f175909a, "systemTrim");
        }

        /* renamed from: b */
        public void mo392b() {
            C61866i0.m72595a(C61866i0.f175909a, "backgroundTrim");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.ShoppingUtil", mo125469f = "ShoppingUtil.kt", mo125470l = {291}, mo125471m = "addGuarentee")
    /* renamed from: np1.i0$b */
    public static final class C61868b extends C66704d {

        /* renamed from: d */
        public Object f175917d;

        /* renamed from: e */
        public Object f175918e;

        /* renamed from: f */
        public Object f175919f;

        /* renamed from: g */
        public Object f175920g;

        /* renamed from: h */
        public Object f175921h;

        /* renamed from: i */
        public Object f175922i;

        /* renamed from: j */
        public Object f175923j;

        /* renamed from: n */
        public /* synthetic */ Object f175924n;

        /* renamed from: o */
        public final /* synthetic */ C61866i0 f175925o;

        /* renamed from: p */
        public int f175926p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61868b(C61866i0 i0Var, C15601d<? super C61868b> dVar) {
            super(dVar);
            this.f175925o = i0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f175924n = obj;
            this.f175926p |= Integer.MIN_VALUE;
            return this.f175925o.mo86791b((String) null, (Context) null, (TextView) null, (ViewGroup) null, (String) null, (String) null, 0, this);
        }
    }

    /* renamed from: np1.i0$i */
    public static final class C61869i<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ Context f175927a;

        /* renamed from: b */
        public final /* synthetic */ int f175928b;

        /* renamed from: c */
        public final /* synthetic */ String f175929c;

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f175930d;

        /* renamed from: e */
        public final /* synthetic */ C15601d<ImageSpan> f175931e;

        public C61869i(Context context, int i, String str, C8477a0 a0Var, C15601d<? super ImageSpan> dVar) {
            this.f175927a = context;
            this.f175928b = i;
            this.f175929c = str;
            this.f175930d = a0Var;
            this.f175931e = dVar;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C13598b0 b0Var;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                Context context = this.f175927a;
                int i = this.f175928b;
                String str = this.f175929c;
                C8477a0 a0Var = this.f175930d;
                C15601d<ImageSpan> dVar = this.f175931e;
                ImageSpan c = C61866i0.f175909a.mo86792c(context, bitmap, i);
                C61866i0.f175916h.put(str, bitmap);
                C61866i0.m72596g(a0Var, dVar, c);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C61866i0.m72596g(this.f175930d, this.f175931e, (ImageSpan) null);
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.ShoppingUtil", mo125469f = "ShoppingUtil.kt", mo125470l = {361}, mo125471m = "getEcResponse")
    /* renamed from: np1.i0$j */
    public static final class C61870j extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f175932d;

        /* renamed from: e */
        public final /* synthetic */ C61866i0 f175933e;

        /* renamed from: f */
        public int f175934f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61870j(C61866i0 i0Var, C15601d<? super C61870j> dVar) {
            super(dVar);
            this.f175933e = i0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f175932d = obj;
            this.f175934f |= Integer.MIN_VALUE;
            return this.f175933e.mo86798j(0, 0, 0, (String) null, this);
        }
    }

    /* renamed from: np1.i0$k */
    public static final class C61871k extends C87413o implements C32226l<C0740i2, Boolean> {

        /* renamed from: d */
        public static final C61871k f175935d = new C61871k();

        public C61871k() {
            super(1);
        }

        public Object invoke(Object obj) {
            C0740i2 i2Var = (C0740i2) obj;
            C87412m.m108594g(i2Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(i2Var instanceof C63965x);
        }
    }

    static {
        Log.m105924i("ShoppingUtil", "initMemoryTrim");
        C89931d.f258426c.mo124253c(new C61867a());
    }

    /* renamed from: a */
    public static final void m72595a(C61866i0 i0Var, String str) {
        i0Var.getClass();
        try {
            LruCache<String, Bitmap> lruCache = f175916h;
            int size = lruCache.size();
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("ShoppingUtil", str + " cache Size:" + size);
            if (size > 0) {
                lruCache.evictAll();
            }
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "ShoppingUtil-memoryTrim");
        }
    }

    /* renamed from: g */
    public static final void m72596g(C8477a0 a0Var, C15601d<? super ImageSpan> dVar, ImageSpan imageSpan) {
        if (!a0Var.f27482d) {
            a0Var.f27482d = true;
            dVar.resumeWith(Result.m168114constructorimpl(imageSpan));
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m72597o(C61866i0 i0Var, String str, C0000n0 n0Var, TextView textView, List list, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, C32224a aVar, int i2, Object obj) {
        int i3 = i2;
        i0Var.mo86802n(str, n0Var, textView, list, str2, z, z2, z3, (i3 & 256) != 0 ? true : z4, (i3 & 512) != 0 ? C76577a.m92151b(textView.getContext(), 16) : i, (i3 & 1024) != 0 ? null : aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo86791b(java.lang.String r16, android.content.Context r17, android.widget.TextView r18, android.view.ViewGroup r19, java.lang.String r20, java.lang.String r21, int r22, wx3.C15601d<? super java.lang.Integer> r23) {
        /*
            r15 = this;
            r6 = r17
            r7 = r18
            r8 = r20
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof np1.C61866i0.C61868b
            if (r2 == 0) goto L_0x001e
            r2 = r1
            np1.i0$b r2 = (np1.C61866i0.C61868b) r2
            int r3 = r2.f175926p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001e
            int r3 = r3 - r4
            r2.f175926p = r3
            r9 = r15
            goto L_0x0024
        L_0x001e:
            np1.i0$b r2 = new np1.i0$b
            r9 = r15
            r2.<init>(r15, r1)
        L_0x0024:
            r5 = r2
            java.lang.Object r1 = r5.f175924n
            xx3.a r10 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r5.f175926p
            r11 = 0
            r12 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 != r12) goto L_0x0055
            java.lang.Object r0 = r5.f175923j
            gy3.f0 r0 = (gy3.C8479f0) r0
            java.lang.Object r2 = r5.f175922i
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r3 = r5.f175921h
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r3 = r5.f175920g
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.f175919f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r6 = r5.f175918e
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r5 = r5.f175917d
            android.content.Context r5 = (android.content.Context) r5
            kotlin.ResultKt.throwOnFailure(r1)
            r8 = r3
            r14 = r4
            r7 = r6
            goto L_0x00c8
        L_0x0055:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005d:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "addGuarentee "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = ",space:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r2 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            int r1 = r20.length()
            if (r1 != 0) goto L_0x0086
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r1 != 0) goto L_0x015f
            if (r0 > 0) goto L_0x008d
            goto L_0x015f
        L_0x008d:
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            r13.f27484d = r8
            int r0 = r21.length()
            if (r0 <= 0) goto L_0x009c
            r0 = 1
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            if (r0 == 0) goto L_0x00e0
            np1.i0 r0 = f175909a
            r1 = 14
            int r3 = kg3.C76577a.m92151b(r6, r1)
            r4 = 1
            r5.f175917d = r6
            r5.f175918e = r7
            r14 = r19
            r5.f175919f = r14
            r5.f175920g = r8
            r5.f175921h = r7
            r5.f175922i = r7
            r5.f175923j = r13
            r5.f175926p = r12
            r1 = r17
            r2 = r21
            java.lang.Object r1 = r0.mo86795f(r1, r2, r3, r4, r5)
            if (r1 != r10) goto L_0x00c5
            return r10
        L_0x00c5:
            r5 = r6
            r2 = r7
            r0 = r13
        L_0x00c8:
            android.text.style.ImageSpan r1 = (android.text.style.ImageSpan) r1
            if (r1 == 0) goto L_0x00dc
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r1)
            wk1.n r1 = wk1.C15440n.f41895a
            de3.u r1 = r1.mo14267p(r5, r8, r3, r12)
            r0.f27484d = r1
        L_0x00dc:
            r13 = r0
            r0 = r7
            r7 = r2
            goto L_0x00e4
        L_0x00e0:
            r14 = r19
            r5 = r6
            r0 = r7
        L_0x00e4:
            r1 = 2131232834(0x7f080842, float:1.8081788E38)
            r7.setBackgroundResource(r1)
            r1 = 2131099920(0x7f060110, float:1.7812207E38)
            int r1 = kg3.C76577a.m92153d(r5, r1)
            r7.setTextColor(r1)
            T r1 = r13.f27484d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r7.setText(r1)
            r1 = 1094713344(0x41400000, float:12.0)
            r7.setTextSize(r12, r1)
            r1 = 2131165280(0x7f070060, float:1.7944773E38)
            int r2 = kg3.C76577a.m92155f(r5, r1)
            int r3 = r7.getPaddingTop()
            int r1 = kg3.C76577a.m92155f(r5, r1)
            int r4 = r7.getPaddingBottom()
            r7.setPadding(r2, r3, r1, r4)
            r1 = 17
            r7.setGravity(r1)
            r7.setMaxLines(r12)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r7.setEllipsize(r1)
            java.lang.CharSequence r1 = r0.getText()
            java.lang.String r1 = r1.toString()
            android.text.TextPaint r2 = r0.getPaint()
            float r1 = android.text.Layout.getDesiredWidth(r1, r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r2.<init>(r3, r3)
            np1.i0 r3 = f175909a
            r3.getClass()
            rx3.g r3 = f175915g
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.setMargins(r11, r11, r3, r11)
            r14.addView(r0, r2)
            int r0 = (int) r1
            int r1 = r2.leftMargin
            int r0 = r0 + r1
            int r1 = r2.rightMargin
            int r0 = r0 + r1
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x015f:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61866i0.mo86791b(java.lang.String, android.content.Context, android.widget.TextView, android.view.ViewGroup, java.lang.String, java.lang.String, int, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final ImageSpan mo86792c(Context context, Bitmap bitmap, int i) {
        int i2;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        try {
            i2 = (int) ((((float) i) * ((float) bitmap.getWidth())) / ((float) bitmap.getHeight()));
        } catch (Exception e) {
            Log.m105920e("ShoppingUtil", "buildImageSpan " + e.getMessage());
            i2 = i * 2;
        }
        bitmapDrawable.setBounds(0, 0, i2, i);
        return new C76003c(bitmapDrawable, 1);
    }

    /* renamed from: d */
    public final JSONObject mo86793d(String str, C64370fp1 fp12) {
        C87412m.m108594g(str, "animUrl");
        if (fp12 != null) {
            JSONObject e = mo86794e(fp12);
            e.put("animat_url", str);
            return e;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("animat_url", str);
        return jSONObject;
    }

    /* renamed from: e */
    public final JSONObject mo86794e(C64370fp1 fp12) {
        C64688rq1 rq12;
        T t;
        C89349b bVar;
        boolean z;
        C87412m.m108594g(fp12, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("seckill", f175909a.mo86803p(fp12) ? 1 : 0);
        LinkedList<z44> linkedList = fp12.f183165J;
        C87412m.m108593f(linkedList, "this.show_box_items");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            rq12 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((z44) t).f186625d == 4) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        z44 z44 = (z44) t;
        if (!(z44 == null || (bVar = z44.f186626e) == null)) {
            rq12 = new C64688rq1();
            rq12.parseFrom(bVar.mo123703f());
        }
        if (rq12 != null) {
            jSONObject.put("buyer", rq12.f185233e);
        }
        return jSONObject;
    }

    /* renamed from: f */
    public final Object mo86795f(Context context, String str, int i, boolean z, C15601d<? super ImageSpan> dVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C8477a0 a0Var = new C8477a0();
        Bitmap bitmap = f175916h.get(str);
        if (!z || bitmap == null) {
            if (C58739j4.f168176a.mo83692U()) {
                Log.m105924i("ShoppingUtil", "genImageSpan load:" + str + '!');
            }
            C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.RAW_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DEFAULT));
            C61869i iVar = new C61869i(context, i, str, a0Var, hVar);
            b.getClass();
            b.f291320d = iVar;
            b.mo85951a();
        } else {
            if (C58739j4.f168176a.mo83692U()) {
                Log.m105924i("ShoppingUtil", "genImageSpan reuse span:" + str + '!');
            }
            m72596g(a0Var, hVar, f175909a.mo86792c(context, bitmap, i));
        }
        return hVar.mo90314b();
    }

    /* renamed from: h */
    public final int mo86796h() {
        return ((Number) ((C36570n) f175912d).getValue()).intValue();
    }

    /* renamed from: i */
    public final String mo86797i(String str, String str2) {
        C87412m.m108594g(str, "resourceDirName");
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        String mD5String = MD5Util.getMD5String(str2);
        C87412m.m108593f(mD5String, "md5Str");
        String wa = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76726wa(str, mD5String);
        Log.m105924i("ShoppingUtil", "getEcResourcePath resourceDirName:" + str + ", url:" + str2 + ", md5Str:" + mD5String + ", path:" + wa);
        return wa;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo86798j(long r11, long r13, int r15, java.lang.String r16, wx3.C15601d<? super te3.C49255ea1> r17) {
        /*
            r10 = this;
            r0 = r17
            boolean r1 = r0 instanceof np1.C61866i0.C61870j
            if (r1 == 0) goto L_0x0016
            r1 = r0
            np1.i0$j r1 = (np1.C61866i0.C61870j) r1
            int r2 = r1.f175934f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.f175934f = r2
            r2 = r10
            goto L_0x001c
        L_0x0016:
            np1.i0$j r1 = new np1.i0$j
            r2 = r10
            r1.<init>(r10, r0)
        L_0x001c:
            java.lang.Object r0 = r1.f175932d
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r1.f175934f
            r5 = 1
            if (r4 == 0) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ d -> 0x002b }
            goto L_0x0076
        L_0x002b:
            r0 = move-exception
            goto L_0x0079
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r0)
            te3.ca1 r0 = new te3.ca1
            r0.<init>()
            r6 = r11
            r0.f182455d = r6
            r6 = r13
            r0.f182456e = r6
            r4 = r15
            r0.f182457f = r4
            r4 = r16
            r0.f182458g = r4
            java.lang.String r4 = "/cgi-bin/mmbiz-bin/finderliveecgetliveconfig"
            r6 = 7668(0x1df4, float:1.0745E-41)
            qg1.b0 r7 = new qg1.b0     // Catch:{ d -> 0x002b }
            te3.ux0 r8 = new te3.ux0     // Catch:{ d -> 0x002b }
            r8.<init>()     // Catch:{ d -> 0x002b }
            r9 = 0
            r11 = r7
            r12 = r4
            r13 = r6
            r14 = r8
            r15 = r0
            r16 = r9
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ d -> 0x002b }
            r8 = 0
            r0 = 0
            r4 = 3
            r6 = 0
            r1.f175934f = r5     // Catch:{ d -> 0x002b }
            r11 = r7
            r12 = r8
            r14 = r0
            r15 = r1
            r16 = r4
            r17 = r6
            java.lang.Object r0 = q40.C89456b.m111831a(r11, r12, r14, r15, r16, r17)     // Catch:{ d -> 0x002b }
            if (r0 != r3) goto L_0x0076
            return r3
        L_0x0076:
            te3.ea1 r0 = (te3.C49255ea1) r0     // Catch:{ d -> 0x002b }
            goto L_0x00b0
        L_0x0079:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getEcResponse:"
            r1.append(r3)
            java.lang.String r3 = r0.getLocalizedMessage()
            r1.append(r3)
            r3 = 44
            r1.append(r3)
            int r4 = r0.f35058f
            r1.append(r4)
            r4 = 45
            r1.append(r4)
            int r4 = r0.f35057e
            r1.append(r4)
            r1.append(r3)
            java.lang.String r0 = r0.f35059g
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "ShoppingUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            r0 = 0
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61866i0.mo86798j(long, long, int, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: k */
    public final String mo86799k(boolean z, C63965x xVar, C51212s90 s902) {
        Integer num;
        T t;
        C64834xn2 xn22;
        String str;
        C89349b bVar;
        boolean z2;
        C87412m.m108594g(xVar, "item");
        int i = xVar.f181337E;
        boolean z3 = s902 != null;
        if (z) {
            C62042e.f176370a.getClass();
            if ((i == 0 || i == 9999999 || i == 10000000) || z3) {
                C64370fp1 fp12 = xVar.f181346s;
                C87412m.m108594g(fp12, "data");
                LinkedList<z44> linkedList = fp12.f183165J;
                C87412m.m108593f(linkedList, "this.show_box_items");
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    num = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((z44) t).f186625d == 1) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                z44 z44 = (z44) t;
                if (z44 == null || (bVar = z44.f186626e) == null) {
                    xn22 = null;
                } else {
                    xn22 = new C64834xn2();
                    xn22.parseFrom(bVar.mo123703f());
                }
                Integer valueOf = ((xn22 != null ? xn22.f186353e : 0) <= C31543z5.m39453c() || xn22 == null) ? null : Integer.valueOf(xn22.f186355g);
                StringBuilder sb = new StringBuilder();
                sb.append(xVar.f181348u);
                sb.append('-');
                sb.append(xVar.f181347t);
                sb.append(" discountStock:");
                sb.append(valueOf);
                sb.append(",isExclusiveStock:");
                sb.append(z3);
                sb.append(",exclusive stock:");
                if (s902 != null) {
                    num = Integer.valueOf(s902.f141383g);
                }
                sb.append(num);
                sb.append(",stock:");
                sb.append(xVar.f181350w);
                Log.m105924i("ShoppingUtil", sb.toString());
                if (valueOf != null && valueOf.intValue() > 0) {
                    str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e8f, new Object[]{valueOf});
                } else if (z3) {
                    Resources resources = MMApplicationContext.getContext().getResources();
                    Object[] objArr = new Object[1];
                    objArr[0] = Integer.valueOf(s902 != null ? s902.f141383g : 0);
                    str = resources.getString(C0966R.string.f360693e82, objArr);
                } else {
                    str = MMApplicationContext.getContext().getResources().getString(C0966R.string.e8f, new Object[]{Integer.valueOf(xVar.f181350w)});
                }
                C87412m.m108593f(str, "{\n            val discou…)\n            }\n        }");
                return str;
            }
        }
        return "";
    }

    /* renamed from: l */
    public final boolean mo86800l(String str, C45795b bVar, C64434i11 i112) {
        String str2;
        C64426ho2 ho22;
        byte[] bArr;
        C50019jp1 jp12;
        String str3 = str;
        C45795b bVar2 = bVar;
        C64434i11 i113 = i112;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(bVar2, "buContext");
        C87412m.m108594g(i113, "resp");
        String str4 = "ShoppingUtil";
        if (i113.f183579i != ((C55001u) bVar2.mo71262a(cls2)).f154420q.f182392d) {
            Log.m105924i(str4, "handleShopShellResp invalid live resp,liveId:" + i113.f183579i + ",current liveId:" + ((C55001u) bVar2.mo71262a(cls2)).f154420q.f182392d);
            return false;
        }
        C54979h1 h1Var = (C54979h1) bVar2.mo71262a(C54979h1.class);
        h1Var.f154110B = false;
        h1Var.f154111C = null;
        h1Var.f154146u = 0;
        h1Var.f154140o.f127225a.clear();
        h1Var.f154135g = true;
        h1Var.f154110B = i113.f183573C > 0;
        h1Var.f154111C = i113.f183572B;
        h1Var.f154146u = i113.f183583p;
        String str5 = "";
        String str6 = "MMFinder.LiveShopSlice";
        if (str3 == null) {
            C64434i11 i114 = h1Var.f154139n;
            if (i114 == null) {
                h1Var.mo75947n3(i113);
                LinkedList<C51358t81> linkedList = i113.f183574d;
                C87412m.m108593f(linkedList, "resp.item_list");
                Iterator<T> it = linkedList.iterator();
                while (it.hasNext()) {
                    C51358t81 t812 = (C51358t81) it.next();
                    C63947a aVar = C63947a.f181274a;
                    C87412m.m108593f(t812, "remote");
                    C0740i2 w = aVar.mo88737w(t812);
                    if (w != null) {
                        h1Var.f154140o.f127225a.add(w);
                        if (w instanceof C63964u) {
                            HashMap<Long, String> hashMap = ((C54991o) h1Var.business(cls)).f154361r3;
                            C63964u uVar = (C63964u) w;
                            String str7 = str4;
                            Long valueOf = Long.valueOf(uVar.f181326t);
                            String str8 = uVar.f181322B;
                            if (str8 == null) {
                                str8 = str5;
                            }
                            hashMap.put(valueOf, str8);
                            Log.m105924i(str6, "uxinfo：add adItem uxInfo, id:" + uVar.f181326t + ", info:" + uVar.f181322B);
                            it = it;
                            C45795b bVar3 = bVar;
                            str4 = str7;
                        }
                    }
                    C45795b bVar4 = bVar;
                }
                str2 = str4;
                Log.m105924i(str6, "first mergeProductShelf, size:" + h1Var.f154140o.mo87252c());
            } else {
                str2 = str4;
                i114.f183575e = i113.f183575e;
                i114.f183577g = i113.f183577g;
                i114.f183578h = i113.f183578h;
                i114.f183580j = i113.f183580j;
                i114.f183584q = i113.f183584q;
                LinkedList linkedList2 = new LinkedList();
                LinkedList<C51358t81> linkedList3 = i113.f183574d;
                C87412m.m108593f(linkedList3, "resp.item_list");
                for (C51358t81 t813 : linkedList3) {
                    C63947a aVar2 = C63947a.f181274a;
                    C87412m.m108593f(t813, "remote");
                    C0740i2 w2 = aVar2.mo88737w(t813);
                    if (w2 instanceof C63965x) {
                        if (h1Var.f154140o.mo87253d(new C0665i1(w2)) == -1) {
                            linkedList2.add(w2);
                        }
                    } else if (w2 instanceof C63964u) {
                        int d = h1Var.f154140o.mo87253d(new C0666j1(w2));
                        if (d == -1) {
                            linkedList2.add(w2);
                            C63964u uVar2 = (C63964u) w2;
                            ((C54991o) h1Var.business(cls)).f154361r3.put(Long.valueOf(uVar2.f181326t), uVar2.f181322B);
                            str6 = str6;
                            Log.m105924i(str6, "uxinfo：add adItem uxInfo, id:" + uVar2.f181326t + ", info:" + uVar2.f181322B);
                            StringBuilder sb = new StringBuilder();
                            sb.append("add adItem, index:");
                            sb.append(h1Var.f154140o.mo87252c() + linkedList2.size() + -1);
                            Log.m105924i(str6, sb.toString());
                        } else {
                            Log.m105924i(str6, "add adItem, exist:" + d);
                        }
                    } else if (w2 instanceof C13696v) {
                        Log.m105924i(str6, "add couponItem: " + w2);
                        linkedList2.add(w2);
                    }
                }
                C62192a<C0740i2> aVar3 = h1Var.f154140o;
                C0667k1 k1Var = C0667k1.f1572d;
                aVar3.getClass();
                C87412m.m108594g(k1Var, "predicate");
                List<E> list = aVar3.f127225a;
                C87412m.m108593f(list, "list");
                C61926c.m72700y(list, k1Var);
                h1Var.f154140o.f127225a.addAll(linkedList2);
                Log.m105924i(str6, "continue mergeProductShelf, size:" + h1Var.f154140o.mo87252c());
            }
            if (!h1Var.f154140o.f127225a.isEmpty()) {
                Log.m105924i(str6, "mergeProducts, anchorProductsOnSale!");
            }
            List<C0740i2> b = h1Var.f154140o.mo87251b(C0670l1.f1579d);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(b, 10));
            Iterator it4 = ((ArrayList) b).iterator();
            while (it4.hasNext()) {
                C0740i2 i2Var = (C0740i2) it4.next();
                C87412m.m108592e(i2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
                arrayList.add(((C63965x) i2Var).f181346s);
            }
            h1Var.mo75942i3(arrayList);
            if (C13598b0.f38549a == null) {
                Log.m105924i(str6, "continue mergeProductShelf resp is empty,current size:" + h1Var.f154140o.mo87252c());
            }
        } else {
            str2 = str4;
            h1Var.f154144s.clear();
            LinkedList<C51358t81> linkedList4 = i113.f183574d;
            C87412m.m108593f(linkedList4, "resp.item_list");
            for (C51358t81 t814 : linkedList4) {
                C63947a aVar4 = C63947a.f181274a;
                C87412m.m108593f(t814, "remote");
                C0740i2 w3 = aVar4.mo88737w(t814);
                if (w3 != null && (w3 instanceof C63965x)) {
                    h1Var.f154144s.add(w3);
                }
            }
            h1Var.f154112D = str3;
        }
        C64399gj1 gj12 = i113.f183585r;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("switch:");
        sb4.append(gj12 != null ? Integer.valueOf(gj12.f183343d) : null);
        sb4.append(", type:");
        sb4.append(gj12 != null ? Integer.valueOf(gj12.f183344e) : null);
        Log.m105924i(str6, sb4.toString());
        h1Var.f154113E = gj12;
        h1Var.f154114F = i113.f183586s;
        C64805wk1 wk12 = i113.f183591x;
        if (wk12 != null) {
            ho22 = new C64426ho2();
            ho22.f183521d = wk12.f186130d;
            ho22.f183522e = wk12.f186131e;
            ho22.f183523f = wk12.f186132f;
            ho22.f183524g = wk12.f186133g;
        } else {
            ho22 = null;
        }
        h1Var.f154116H = ho22;
        h1Var.f154117I = i113.f183589v;
        C52128yk0 yk02 = i113.f183592y;
        h1Var.f154132Y = yk02;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("set flash sale record config: enabled = ");
        sb5.append(yk02 != null ? Integer.valueOf(yk02.f145339d) : null);
        sb5.append(", path = ");
        sb5.append((yk02 == null || (jp12 = yk02.f145340e) == null) ? null : jp12.f136238e);
        Log.m105918d(str6, sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("handleShopShellResp licenseLiteApp:");
        C64426ho2 ho23 = h1Var.f154116H;
        sb6.append(ho23 != null ? ho23.f183521d : null);
        sb6.append(",productList:");
        List<C0740i2> b2 = h1Var.f154140o.mo87251b(C61871k.f175935d);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(b2, 10));
        Iterator it5 = ((ArrayList) b2).iterator();
        while (it5.hasNext()) {
            C0740i2 i2Var2 = (C0740i2) it5.next();
            C87412m.m108592e(i2Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem");
            arrayList2.add(((C63965x) i2Var2).f181346s);
        }
        if (arrayList2.isEmpty()) {
            bArr = null;
        } else {
            StringBuilder sb7 = new StringBuilder();
            Iterator it6 = arrayList2.iterator();
            int i = 0;
            while (it6.hasNext()) {
                Object next = it6.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C64370fp1 fp12 = (C64370fp1) next;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("[第");
                    sb8.append(i);
                    sb8.append("个,");
                    sb8.append(fp12.f183177e);
                    sb8.append('-');
                    sb8.append(fp12.f183176d);
                    sb8.append(",price:");
                    sb8.append(fp12.f183181i);
                    sb8.append('-');
                    sb8.append(fp12.f183180h);
                    sb8.append(",showBox:");
                    C54979h1.C0663a aVar5 = C54979h1.f154108p0;
                    LinkedList<z44> linkedList5 = fp12.f183165J;
                    C87412m.m108593f(linkedList5, "finderWindowProductInfo.show_box_items");
                    sb8.append(aVar5.mo628a(linkedList5));
                    sb8.append(',');
                    sb8.append(fp12.f183186q);
                    sb8.append(']');
                    sb7.append(sb8.toString());
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            bArr = null;
            str5 = sb7.toString();
            C87412m.m108593f(str5, "sb.toString()");
        }
        sb6.append(str5);
        String str9 = str2;
        Log.m105924i(str9, sb6.toString());
        C45795b bVar5 = bVar;
        C55001u uVar3 = (C55001u) bVar5.mo71262a(cls2);
        C89349b bVar6 = i113.f183576f;
        if (bVar6 != null) {
            bArr = bVar6.f257327a;
        }
        uVar3.mo76041l3(bArr);
        Log.m105924i(str9, "handleShopShellResp mergeProducts, resp list size:" + i113.f183574d.size());
        String str10 = i113.f183581n;
        if (str10 != null) {
            ((C54991o) bVar5.mo71262a(cls)).mo75961G4(str10);
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo86801m(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        Uri n = C116299g2.m163858n(mo86797i(str, str2));
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            return false;
        }
        return l.f348991a.mo119948x(l.f348992b);
    }

    /* renamed from: n */
    public final void mo86802n(String str, C0000n0 n0Var, TextView textView, List<String> list, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i, C32224a<C13598b0> aVar) {
        TextView textView2 = textView;
        String str3 = str2;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(textView2, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(str3, "str");
        if (list == null || list.isEmpty()) {
            textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), str3));
        } else {
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C11253l(list, str, n0Var, z2, z3, textView, str2, z, aVar, i, z4, (C15601d<? super C11253l>) null), 3, (Object) null);
        }
    }

    /* renamed from: p */
    public final boolean mo86803p(C64370fp1 fp12) {
        C64834xn2 xn22;
        boolean z;
        T t;
        C89349b bVar;
        boolean z2;
        C87412m.m108594g(fp12, "data");
        LinkedList<z44> linkedList = fp12.f183165J;
        C87412m.m108593f(linkedList, "this.show_box_items");
        Iterator<T> it = linkedList.iterator();
        while (true) {
            xn22 = null;
            z = true;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((z44) t).f186625d == 1) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        z44 z44 = (z44) t;
        if (!(z44 == null || (bVar = z44.f186626e) == null)) {
            xn22 = new C64834xn2();
            xn22.parseFrom(bVar.mo123703f());
        }
        if (xn22 == null) {
            return false;
        }
        if (xn22.f186352d <= 0) {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0119, code lost:
        if ((r28.length() > 0) != false) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e7  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86804q(android.widget.TextView r22, java.lang.String r23, android.view.View r24, android.widget.TextView r25, java.lang.String r26, android.widget.TextView r27, java.lang.String r28, android.view.View r29) {
        /*
            r21 = this;
            r0 = r22
            r9 = r24
            r10 = r25
            r1 = r26
            r11 = r27
            r12 = r29
            java.lang.String r2 = "stockTv"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "stock"
            r13 = r23
            gy3.C87412m.m108594g(r13, r2)
            java.lang.String r2 = "shopNameDivider"
            gy3.C87412m.m108594g(r9, r2)
            java.lang.String r2 = "sourceTv"
            gy3.C87412m.m108594g(r10, r2)
            java.lang.String r2 = "shopName"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "descWordStr"
            r14 = r28
            gy3.C87412m.m108594g(r14, r2)
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.text.SpannableString r15 = r2.mo107057T1(r3, r1)
            int r1 = r23.length()
            r16 = 1
            r8 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            if (r1 <= 0) goto L_0x0052
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            r6 = 8
            if (r1 == 0) goto L_0x00b9
            int r1 = r28.length()
            if (r1 <= 0) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            if (r1 == 0) goto L_0x00b9
            if (r12 != 0) goto L_0x006a
            r14 = r7
            r26 = 8
            r10 = 0
            goto L_0x0105
        L_0x006a:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r5.mo10233c(r7)
            java.lang.Object[] r2 = r5.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/shopping/ShoppingUtil"
            java.lang.String r4 = "setProductSource"
            java.lang.String r17 = "(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r1 = r29
            r13 = r5
            r5 = r17
            r26 = 8
            r6 = r18
            r14 = r7
            r7 = r19
            r10 = 0
            r8 = r20
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r13.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r12.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/shopping/ShoppingUtil"
            java.lang.String r3 = "setProductSource"
            java.lang.String r4 = "(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r29
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0105
        L_0x00b9:
            r14 = r7
            r26 = 8
            r10 = 0
            if (r12 != 0) goto L_0x00c0
            goto L_0x0105
        L_0x00c0:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r13.mo10233c(r1)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/shopping/ShoppingUtil"
            java.lang.String r4 = "setProductSource"
            java.lang.String r5 = "(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r29
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r13.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r12.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/shopping/ShoppingUtil"
            java.lang.String r3 = "setProductSource"
            java.lang.String r4 = "(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r29
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x0105:
            int r1 = r23.length()
            if (r1 <= 0) goto L_0x010d
            r8 = 1
            goto L_0x010e
        L_0x010d:
            r8 = 0
        L_0x010e:
            if (r8 != 0) goto L_0x011b
            int r1 = r28.length()
            if (r1 <= 0) goto L_0x0118
            r8 = 1
            goto L_0x0119
        L_0x0118:
            r8 = 0
        L_0x0119:
            if (r8 == 0) goto L_0x016e
        L_0x011b:
            java.lang.String r1 = "shopNameStr"
            gy3.C87412m.m108593f(r15, r1)
            int r1 = r15.length()
            if (r1 <= 0) goto L_0x0129
            r8 = 1
            goto L_0x012a
        L_0x0129:
            r8 = 0
        L_0x012a:
            if (r8 == 0) goto L_0x016e
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r12.mo10233c(r14)
            java.lang.Object[] r2 = r12.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/shopping/ShoppingUtil"
            java.lang.String r4 = "setProductSource"
            java.lang.String r5 = "(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r24
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r12.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/shopping/ShoppingUtil"
            java.lang.String r3 = "setProductSource"
            java.lang.String r4 = "(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r24
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01b3
        L_0x016e:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r12.mo10233c(r1)
            java.lang.Object[] r2 = r12.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/shopping/ShoppingUtil"
            java.lang.String r4 = "setProductSource"
            java.lang.String r5 = "(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r24
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r12.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r9.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/shopping/ShoppingUtil"
            java.lang.String r3 = "setProductSource"
            java.lang.String r4 = "(Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;Landroid/widget/TextView;Ljava/lang/String;Landroid/widget/TextView;Ljava/lang/String;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r24
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x01b3:
            int r1 = r23.length()
            if (r1 <= 0) goto L_0x01bb
            r8 = 1
            goto L_0x01bc
        L_0x01bb:
            r8 = 0
        L_0x01bc:
            if (r8 == 0) goto L_0x01c4
            r0.setVisibility(r10)
            r1 = 8
            goto L_0x01c9
        L_0x01c4:
            r1 = 8
            r0.setVisibility(r1)
        L_0x01c9:
            int r2 = r28.length()
            if (r2 <= 0) goto L_0x01d0
            goto L_0x01d2
        L_0x01d0:
            r16 = 0
        L_0x01d2:
            if (r16 == 0) goto L_0x01db
            if (r11 != 0) goto L_0x01d7
            goto L_0x01e1
        L_0x01d7:
            r11.setVisibility(r10)
            goto L_0x01e1
        L_0x01db:
            if (r11 != 0) goto L_0x01de
            goto L_0x01e1
        L_0x01de:
            r11.setVisibility(r1)
        L_0x01e1:
            r22.setText(r23)
            if (r11 != 0) goto L_0x01e7
            goto L_0x01ea
        L_0x01e7:
            r27.setText(r28)
        L_0x01ea:
            r0 = r25
            r1 = 0
            r0.setText(r15)
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61866i0.mo86804q(android.widget.TextView, java.lang.String, android.view.View, android.widget.TextView, java.lang.String, android.widget.TextView, java.lang.String, android.view.View):void");
    }
}
