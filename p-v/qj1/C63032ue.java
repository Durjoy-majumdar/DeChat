package qj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import al1.C54132m;
import android.os.Message;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import c30.C104289g;
import cl1.C0678p1;
import cl1.C54991o;
import cl1.C55001u;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import d60.C58124b;
import er1.C58739j4;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kg3.C76577a;
import kotlin.ResultKt;
import nk1.C11207i;
import ok1.C62042e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49712hj1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C66723k;

/* renamed from: qj1.ue */
public final class C63032ue extends C62660c {

    /* renamed from: A */
    public final C63035c f178880A = new C63035c(this);

    /* renamed from: p */
    public final C58124b f178881p;

    /* renamed from: q */
    public final C13601g f178882q;

    /* renamed from: r */
    public final C13601g f178883r;

    /* renamed from: s */
    public boolean f178884s = true;

    /* renamed from: t */
    public final LinkedHashMap<Integer, String> f178885t = new LinkedHashMap<>();

    /* renamed from: u */
    public final LinkedHashMap<Integer, String> f178886u = new LinkedHashMap<>();

    /* renamed from: v */
    public C54132m f178887v;

    /* renamed from: w */
    public C54132m f178888w;

    /* renamed from: x */
    public int f178889x;

    /* renamed from: y */
    public C53973z1 f178890y;

    /* renamed from: z */
    public C53973z1 f178891z;

    /* renamed from: qj1.ue$f */
    public static final class C35915f<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C63032ue f95809d;

        public C35915f(C63032ue ueVar) {
            this.f95809d = ueVar;
        }

        public void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            Log.m105924i("FinderLiveSubtitlePlugin", "isOpenSubtitleData " + bool);
            C63032ue ueVar = this.f95809d;
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            boolean booleanValue = bool.booleanValue();
            ueVar.getClass();
            C62042e.f176370a.mo87106p0().putInt(ueVar.mo87973e1(), booleanValue ? 1 : 0);
            if (C87412m.m108589b(bool, Boolean.FALSE)) {
                C63032ue.m74316Z0(this.f95809d);
            }
        }
    }

    /* renamed from: qj1.ue$a */
    public static final class C63033a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63033a(ViewGroup viewGroup) {
            super(0);
            this.f178892d = viewGroup;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f178892d.findViewById(C0966R.C0970id.dzp);
            C85875k4.m106191k0(textView.getPaint());
            return textView;
        }
    }

    /* renamed from: qj1.ue$b */
    public static final class C63034b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f178893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63034b(ViewGroup viewGroup) {
            super(0);
            this.f178893d = viewGroup;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f178893d.findViewById(C0966R.C0970id.nme);
            C85875k4.m106191k0(textView.getPaint());
            return textView;
        }
    }

    /* renamed from: qj1.ue$c */
    public static final class C63035c extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ C63032ue f178894a;

        public C63035c(C63032ue ueVar) {
            this.f178894a = ueVar;
        }

        public void handleMessage(Message message) {
            C87412m.m108594g(message, "msg");
            super.handleMessage(message);
            Object obj = message.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            int i = message.what;
            if (i == 1) {
                this.f178894a.mo87972d1().setText(str);
            } else if (i == 2) {
                Object value = ((C36570n) this.f178894a.f178883r).getValue();
                C87412m.m108593f(value, "<get-engTitleView>(...)");
                ((TextView) value).setText(str);
            }
        }
    }

    /* renamed from: qj1.ue$d */
    public static final class C63036d<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C63032ue f178895d;

        public C63036d(C63032ue ueVar) {
            this.f178895d = ueVar;
        }

        public void onChanged(Object obj) {
            C55004v1.C55005a aVar = (C55004v1.C55005a) obj;
            if (aVar != null) {
                C63032ue ueVar = this.f178895d;
                ueVar.mo87970b1();
                ueVar.mo87976h1(aVar.f154448b, aVar.f154449c, aVar.f154450d);
                ueVar.f166287d.setAlpha(1.0f);
                if (!((C0678p1) ueVar.mo87696x0(C0678p1.class)).f1596f || ((C54991o) ueVar.mo87696x0(C54991o.class)).f154190D) {
                    C63032ue.m74316Z0(ueVar);
                }
            }
        }
    }

    /* renamed from: qj1.ue$e */
    public static final class C63037e<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C63032ue f178896d;

        public C63037e(C63032ue ueVar) {
            this.f178896d = ueVar;
        }

        public void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                C63032ue ueVar = this.f178896d;
                ueVar.f166287d.setAlpha(f.floatValue());
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveSubtitlePlugin$updateSubtitle$1", mo125469f = "FinderLiveSubtitlePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.ue$g */
    public static final class C63038g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f178897d;

        /* renamed from: e */
        public final /* synthetic */ C63032ue f178898e;

        /* renamed from: f */
        public final /* synthetic */ String f178899f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveSubtitlePlugin$updateSubtitle$1$2", mo125469f = "FinderLiveSubtitlePlugin.kt", mo125470l = {237, 238}, mo125471m = "invokeSuspend")
        /* renamed from: qj1.ue$g$a */
        public static final class C35916a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f95810d;

            /* renamed from: e */
            public final /* synthetic */ C63032ue f95811e;

            @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveSubtitlePlugin$updateSubtitle$1$2$1", mo125469f = "FinderLiveSubtitlePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
            /* renamed from: qj1.ue$g$a$a */
            public static final class C35917a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

                /* renamed from: d */
                public final /* synthetic */ C63032ue f95812d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C35917a(C63032ue ueVar, C15601d<? super C35917a> dVar) {
                    super(2, dVar);
                    this.f95812d = ueVar;
                }

                public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                    return new C35917a(this.f95812d, dVar);
                }

                public Object invoke(Object obj, Object obj2) {
                    return ((C35917a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                }

                public final Object invokeSuspend(Object obj) {
                    ResultKt.throwOnFailure(obj);
                    Log.m105924i("FinderLiveSubtitlePlugin", "count down timeout, hideSubtitle");
                    C63032ue.m74316Z0(this.f95812d);
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C35916a(C63032ue ueVar, C15601d<? super C35916a> dVar) {
                super(2, dVar);
                this.f95811e = ueVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C35916a(this.f95811e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C35916a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f95810d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f95810d = 1;
                    if (C53965x0.m60607b(3000, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return C13598b0.f38549a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C35917a aVar2 = new C35917a(this.f95811e, (C15601d<? super C35917a>) null);
                this.f95810d = 2;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63038g(C63032ue ueVar, String str, C15601d<? super C63038g> dVar) {
            super(2, dVar);
            this.f178898e = ueVar;
            this.f178899f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C63038g gVar = new C63038g(this.f178898e, this.f178899f, dVar);
            gVar.f178897d = obj;
            return gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63038g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C104289g m;
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f178897d;
            C53973z1 z1Var = this.f178898e.f178891z;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C104289g gVar = new C104289g(this.f178899f);
            if (gVar.optInt("wxT") == 2 && (m = gVar.optJSONObject("subtitle")) != null) {
                C63032ue ueVar = this.f178898e;
                int optInt = m.optInt("index_eng");
                int optInt2 = m.optInt("index_chn");
                int optInt3 = m.optInt("duration");
                String optString = m.optString("chn");
                String optString2 = m.optString("eng");
                C62042e eVar = C62042e.f176370a;
                eVar.mo86998D1("FinderLiveSubtitlePlugin", "msg:\n " + m + '}');
                C87412m.m108593f(optString, "chn");
                C63032ue.m74317a1(ueVar, optString, optInt2, optInt3, 1);
                C87412m.m108593f(optString2, "eng");
                C63032ue.m74317a1(ueVar, optString2, optInt, optInt3, 2);
                ((C0678p1) ueVar.mo87696x0(C0678p1.class)).f1598h = true;
            }
            C63032ue ueVar2 = this.f178898e;
            ueVar2.f178891z = C53895h.m60464b(n0Var, (C66212f) null, (C53934p0) null, new C35916a(ueVar2, (C15601d<? super C35916a>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63032ue(ViewGroup viewGroup, C58124b bVar, C49712hj1 hj12) {
        super(viewGroup, bVar, hj12);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178881p = bVar;
        this.f178882q = C36568h.m40985a(new C63033a(viewGroup));
        this.f178883r = C36568h.m40985a(new C63034b(viewGroup));
        boolean z = true;
        ((C0678p1) mo87696x0(C0678p1.class)).f1597g.setValue(Boolean.valueOf(C62042e.f176370a.mo87106p0().getInt(mo87973e1(), 1) != 1 ? false : z));
    }

    /* renamed from: Z0 */
    public static final void m74316Z0(C63032ue ueVar) {
        ueVar.f178887v = null;
        ueVar.f178888w = null;
        ueVar.mo87972d1().setText("");
        Object value = ((C36570n) ueVar.f178883r).getValue();
        C87412m.m108593f(value, "<get-engTitleView>(...)");
        ((TextView) value).setText("");
        ueVar.f178885t.clear();
        ueVar.f178886u.clear();
        ueVar.f178884s = true;
        C53973z1 z1Var = ueVar.f178890y;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        ueVar.f178880A.removeMessages(1);
        ueVar.f178880A.removeMessages(2);
    }

    /* renamed from: a1 */
    public static final void m74317a1(C63032ue ueVar, String str, int i, int i2, int i3) {
        ueVar.getClass();
        boolean z = false;
        if (str.length() > 0) {
            C54132m mVar = i3 == 1 ? ueVar.f178887v : ueVar.f178888w;
            if (mVar != null && i == mVar.f152042c) {
                z = true;
            }
            if (!z) {
                if (mVar != null) {
                    String str2 = mVar.f152041b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    int i4 = mVar.f152044e;
                    if (i4 > 0) {
                        str2 = ueVar.mo87977i1(str2, i4, str2.length());
                    }
                    (mVar.f152040a == 1 ? ueVar.f178885t : ueVar.f178886u).put(Integer.valueOf(mVar.f152042c), str2);
                }
                C54132m mVar2 = new C54132m(i3, str, i, i2, 0, 16, (C8480h) null);
                if (i3 == 2) {
                    ueVar.f178888w = mVar2;
                } else {
                    ueVar.f178887v = mVar2;
                }
                ueVar.mo87978j1(mVar2);
            } else if (mVar != null) {
                mVar.f152041b = str;
                mVar.f152043d = i2;
                ueVar.mo87978j1(mVar);
            }
        }
    }

    /* renamed from: U0 */
    public void mo12048U0() {
        Class cls = C55004v1.class;
        ((C55004v1) mo87696x0(cls)).f154436g.observe(this, new C63036d(this));
        ((C55004v1) mo87696x0(cls)).f154443q.observe(this, new C63037e(this));
        ((C0678p1) mo87696x0(C0678p1.class)).f1597g.observe(this, new C35915f(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo87970b1() {
        Class cls = C54991o.class;
        Class cls2 = C0678p1.class;
        Log.m105924i("FinderLiveSubtitlePlugin", "checkVisible enableSubtitle:" + ((C0678p1) mo87696x0(cls2)).f1596f);
        if (((C0678p1) mo87696x0(cls2)).f1596f && !((C54991o) mo87696x0(cls)).f154190D) {
            mo10792g(0);
            if (!mo82893g0()) {
                this.f178889x = (int) (((float) C75044y4.m89990b(this.f166287d.getContext()).x) - ((float) (this.f166287d.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp) * 2)));
            } else if (((C54991o) mo87696x0(cls)).mo75985T4()) {
                this.f178889x = mo87974f1();
            }
        }
    }

    /* renamed from: c1 */
    public final String mo87971c1(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!Pattern.compile("(?<=\\u002e)|(?<=\\u002c)|(?<=\\u0020)|(?<=\\uff0c)|(?<=\\uff1f)|(?<=\\u3002)|(?<=\\uff1b)|(\n)|(\r)").matcher(String.valueOf(str.charAt(i2))).find()) {
                break;
            }
            i++;
        }
        return mo87977i1(str, i, str.length());
    }

    /* renamed from: d1 */
    public final TextView mo87972d1() {
        Object value = ((C36570n) this.f178882q).getValue();
        C87412m.m108593f(value, "<get-chnTitleView>(...)");
        return (TextView) value;
    }

    /* renamed from: e1 */
    public final String mo87973e1() {
        return "Subtitle_" + ((C55001u) mo87696x0(C55001u.class)).f154420q.f182392d;
    }

    /* renamed from: f1 */
    public final int mo87974f1() {
        Class cls = C54991o.class;
        return ((int) (((float) C75044y4.m89990b(this.f166287d.getContext()).y) * (((float) ((C54991o) mo87696x0(cls)).f154335l1) / ((float) ((C54991o) mo87696x0(cls)).f154338m1)))) - C76577a.m92151b(this.f166287d.getContext(), 32);
    }

    /* renamed from: g1 */
    public final boolean mo87975g1(String str, int i) {
        return new StaticLayout(str, 0, str.length(), mo87972d1().getPaint(), this.f178889x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= i;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r5v9, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87976h1(int r4, int r5, int r6) {
        /*
            r3 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            android.view.ViewGroup r4 = r3.f166287d
            android.content.Context r4 = r4.getContext()
            android.graphics.Point r4 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r4)
            int r4 = r4.y
            boolean r0 = r3.mo82893g0()
            r1 = 16
            if (r0 == 0) goto L_0x0022
            android.view.ViewGroup r4 = r3.f166287d
            android.content.Context r4 = r4.getContext()
            int r4 = kg3.C76577a.m92151b(r4, r1)
            goto L_0x0049
        L_0x0022:
            int r5 = r5 + r6
            int r4 = r4 - r5
            java.lang.Class<cl1.o> r5 = cl1.C54991o.class
            androidx.lifecycle.i0 r5 = r3.mo87696x0(r5)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo75992a4()
            if (r5 == 0) goto L_0x003e
            android.view.ViewGroup r5 = r3.f166287d
            android.content.Context r5 = r5.getContext()
            r6 = 4
            int r5 = kg3.C76577a.m92151b(r5, r6)
            goto L_0x0048
        L_0x003e:
            android.view.ViewGroup r5 = r3.f166287d
            android.content.Context r5 = r5.getContext()
            int r5 = kg3.C76577a.m92151b(r5, r1)
        L_0x0048:
            int r4 = r4 + r5
        L_0x0049:
            boolean r5 = r3.mo82893g0()
            r6 = 0
            java.lang.String r0 = "requestLayout bottomMargin: "
            java.lang.String r1 = "FinderLiveSubtitlePlugin"
            if (r5 == 0) goto L_0x008c
            int r5 = r3.mo87974f1()
            r3.f178889x = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r2 = " maxWidth: "
            r5.append(r2)
            int r2 = r3.f178889x
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            android.view.ViewGroup r5 = r3.f166287d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r2 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0083
            r6 = r5
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
        L_0x0083:
            if (r6 == 0) goto L_0x009d
            r6.bottomMargin = r4
            int r5 = r3.f178889x
            r6.width = r5
            goto L_0x009d
        L_0x008c:
            android.view.ViewGroup r5 = r3.f166287d
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r2 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0099
            r6 = r5
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
        L_0x0099:
            if (r6 == 0) goto L_0x009d
            r6.bottomMargin = r4
        L_0x009d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63032ue.mo87976h1(int, int, int):void");
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        this.f178884s = true;
        ((C0678p1) mo87696x0(C0678p1.class)).f1598h = false;
    }

    /* renamed from: i1 */
    public final String mo87977i1(String str, int i, int i2) {
        if (i >= str.length() || i2 > str.length()) {
            return "";
        }
        String substring = str.substring(i, i2);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: j1 */
    public final void mo87978j1(C54132m mVar) {
        TextView textView;
        C13604l lVar;
        String str;
        boolean z;
        String str2;
        C54132m mVar2 = mVar;
        if (mVar2.f152040a == 2) {
            Object value = ((C36570n) this.f178883r).getValue();
            C87412m.m108593f(value, "<get-engTitleView>(...)");
            textView = (TextView) value;
        } else {
            textView = mo87972d1();
        }
        LinkedHashMap<Integer, String> linkedHashMap = mVar2.f152040a == 1 ? this.f178885t : this.f178886u;
        String str3 = mVar2.f152041b;
        String str4 = str3 == null ? "" : str3;
        int i = mVar2.f152044e;
        String i1 = i > 0 ? mo87977i1(str4, i, str4.length()) : str4;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> value2 : linkedHashMap.entrySet()) {
            sb.append((String) value2.getValue());
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        String str5 = sb4 + i1;
        int maxLines = textView.getMaxLines();
        this.f178880A.removeMessages(mVar2.f152040a);
        if (mo87975g1(str5, maxLines)) {
            textView.setText(mo87971c1(str5));
            return;
        }
        try {
            int length = str5.length();
            List<String> e = new C66723k("(?<=\\u002e)|(?<=\\u002c)|(?<=\\u0020)|(?<=\\uff0c)|(?<=\\uff1f)|(?<=\\u3002)|(?<=\\uff1b)|(\n)|(\r)").mo90760e(str5, 0);
            ArrayList arrayList = new ArrayList();
            for (T next : e) {
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            int i2 = size - 1;
            String str6 = str5;
            while (true) {
                if (i2 <= 0) {
                    str = "";
                    z = false;
                    break;
                }
                String S = C110818d0.m150921S(arrayList.subList(0, i2), "", (CharSequence) null, (CharSequence) null, 0, "", (C32226l) null, 46, (Object) null);
                if (mo87975g1(S, maxLines)) {
                    str = C110818d0.m150921S(arrayList.subList(i2, size), "", (CharSequence) null, (CharSequence) null, 0, "", (C32226l) null, 46, (Object) null);
                    str6 = S;
                    z = true;
                    break;
                }
                i2--;
                str6 = S;
            }
            if (!z) {
                int lineEnd = new StaticLayout(str5, 0, str5.length(), mo87972d1().getPaint(), this.f178889x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineEnd(0);
                int i3 = lineEnd - 1;
                if (i3 > 0) {
                    lineEnd = i3;
                }
                String substring = str5.substring(0, lineEnd);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str5.substring(lineEnd, length);
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                String str7 = substring;
                str = substring2;
                str2 = str7;
            } else {
                str2 = str6;
            }
            lVar = new C13604l(str2, str);
        } catch (Exception unused) {
            lVar = new C13604l("", "");
        }
        textView.setText(mo87971c1((String) lVar.f38555d));
        mVar2.f152044e = (C112550d0.m153772H(str4, (String) lVar.f38555d, 0, false, 6, (Object) null) + ((String) lVar.f38555d).length()) - sb4.length();
        linkedHashMap.clear();
        C63035c cVar = this.f178880A;
        Message obtain = Message.obtain();
        obtain.what = mVar2.f152040a;
        obtain.obj = lVar.f38556e;
        cVar.sendMessageDelayed(obtain, 1000);
    }

    /* renamed from: l1 */
    public final void mo87979l1(String str) {
        Class cls = C0678p1.class;
        if (((C0678p1) mo87696x0(cls)).f1596f && str != null && !C87412m.m108589b(((C0678p1) mo87696x0(cls)).f1597g.getValue(), Boolean.FALSE) && !((C54991o) mo87696x0(C54991o.class)).f154190D) {
            try {
                C53896h0 h0Var = C53872d1.f151117a;
                this.f178890y = C11207i.m11072h(this, C58901s.f168555a, (C53934p0) null, new C63038g(this, str, (C15601d<? super C63038g>) null), 2, (Object) null);
            } catch (Exception e) {
                C58739j4 j4Var = C58739j4.f168176a;
                j4Var.mo83712h0(e, "FinderLiveSubtitlePlugin, exception updateSubtitle msg: " + str);
            }
        } else if (this.f178884s && str != null) {
            Log.m105924i("FinderLiveSubtitlePlugin", "updateSubtitle msg:" + str + ", disable subtitle!");
            this.f178884s = false;
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f178880A.removeCallbacksAndMessages((Object) null);
    }
}
