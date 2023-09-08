package xv1;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import kv1.C99252h;
import p278yh.C23311i;
import pv1.C22019b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C52241zb0;
import te3.pd4;
import w00.C22835e;

/* renamed from: xv1.o */
public final class C23137o extends C22019b {

    /* renamed from: p */
    public boolean f66454p;

    /* renamed from: q */
    public LinkedList<C52241zb0> f66455q = new LinkedList<>();

    /* renamed from: r */
    public String f66456r = "";

    /* renamed from: s */
    public final C13601g f66457s = C36568h.m40985a(new C23141d(this));

    /* renamed from: t */
    public final C13601g f66458t = C36568h.m40985a(new C23142e(this));

    /* renamed from: xv1.o$a */
    public final class C23138a extends C22019b.C22020a {

        /* renamed from: a */
        public C23311i f66459a;

        public C23138a(C23137o oVar) {
            super(oVar);
        }
    }

    /* renamed from: xv1.o$b */
    public final class C23139b extends C22019b.C22021b {
        public C23139b() {
            super();
        }

        /* renamed from: b */
        public void mo35142b(Context context, C22019b.C22020a aVar, C22019b bVar, Object... objArr) {
            LinearLayout linearLayout;
            C87412m.m108594g(objArr, "extraData");
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.item.FTSRelevantSearchDataItem.FTSRelevantSearchViewHolder");
            C23138a aVar2 = (C23138a) aVar;
            C23311i iVar = aVar2.f66459a;
            if (iVar != null) {
                C23137o oVar = C23137o.this;
                if (!Util.isNullOrNil(oVar.f66456r)) {
                    if (iVar.f67026k == null) {
                        iVar.f67026k = (TextView) iVar.f67016a.findViewById(C0966R.C0970id.oi9);
                    }
                    iVar.f67026k.setText(oVar.f66456r);
                }
                if (iVar.f67025j == null) {
                    iVar.f67025j = (LinearLayout) iVar.f67016a.findViewById(C0966R.C0970id.ohy);
                }
                LinearLayout linearLayout2 = iVar.f67025j;
                C87412m.m108593f(linearLayout2, "it.relevantLayout1");
                if (iVar.f67027l == null) {
                    iVar.f67027l = (TextView) iVar.f67016a.findViewById(C0966R.C0970id.oi5);
                }
                TextView textView = iVar.f67027l;
                C87412m.m108593f(textView, "it.relevantQuery1");
                oVar.mo36519l(0, linearLayout2, textView, (ImageView) null, (ProgressBar) null, true);
                if (iVar.f67018c == null) {
                    iVar.f67018c = (LinearLayout) iVar.f67016a.findViewById(C0966R.C0970id.ohz);
                }
                LinearLayout linearLayout3 = iVar.f67018c;
                C87412m.m108593f(linearLayout3, "it.relevantLayout2");
                if (iVar.f67021f == null) {
                    iVar.f67021f = (TextView) iVar.f67016a.findViewById(C0966R.C0970id.oi6);
                }
                TextView textView2 = iVar.f67021f;
                C87412m.m108593f(textView2, "it.relevantQuery2");
                if (iVar.f67024i == null) {
                    iVar.f67024i = (WeImageView) iVar.f67016a.findViewById(C0966R.C0970id.ohu);
                }
                WeImageView weImageView = iVar.f67024i;
                if (iVar.f67020e == null) {
                    iVar.f67020e = (ProgressBar) iVar.f67016a.findViewById(C0966R.C0970id.f359058oi2);
                }
                oVar.mo36519l(1, linearLayout3, textView2, weImageView, iVar.f67020e, oVar.f66454p);
                if (iVar.f67017b == null) {
                    iVar.f67017b = (LinearLayout) iVar.f67016a.findViewById(C0966R.C0970id.f359056oi0);
                }
                LinearLayout linearLayout4 = iVar.f67017b;
                C87412m.m108593f(linearLayout4, "it.relevantLayout3");
                if (iVar.f67023h == null) {
                    iVar.f67023h = (TextView) iVar.f67016a.findViewById(C0966R.C0970id.oi7);
                }
                TextView textView3 = iVar.f67023h;
                C87412m.m108593f(textView3, "it.relevantQuery3");
                if (iVar.f67022g == null) {
                    iVar.f67022g = (WeImageView) iVar.f67016a.findViewById(C0966R.C0970id.ohv);
                }
                WeImageView weImageView2 = iVar.f67022g;
                if (iVar.f67019d == null) {
                    iVar.f67019d = (ProgressBar) iVar.f67016a.findViewById(C0966R.C0970id.f359059oi3);
                }
                oVar.mo36519l(2, linearLayout4, textView3, weImageView2, iVar.f67019d, oVar.f66454p);
            }
            C23311i iVar2 = aVar2.f66459a;
            if (iVar2 != null) {
                if (iVar2.f67028m == null) {
                    iVar2.f67028m = (LinearLayout) iVar2.f67016a.findViewById(C0966R.C0970id.f359057oi1);
                }
                linearLayout = iVar2.f67028m;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }

        /* renamed from: c */
        public View mo35143c(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d9z, viewGroup, false);
            C23138a aVar = (C23138a) ((C36570n) C23137o.this.f66457s).getValue();
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.item.FTSRelevantSearchDataItem.FTSRelevantSearchViewHolder");
            aVar.f66459a = new C23311i(inflate);
            inflate.setTag(aVar);
            return inflate;
        }

        /* renamed from: d */
        public boolean mo35144d(Context context, View view, C22019b bVar, Object... objArr) {
            C87412m.m108594g(objArr, "extraData");
            return false;
        }
    }

    /* renamed from: xv1.o$c */
    public static final class C23140c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f66461d;

        /* renamed from: e */
        public final /* synthetic */ C23137o f66462e;

        /* renamed from: f */
        public final /* synthetic */ C52241zb0 f66463f;

        /* renamed from: g */
        public final /* synthetic */ int f66464g;

        public C23140c(LinearLayout linearLayout, C23137o oVar, C52241zb0 zb02, int i) {
            this.f66461d = linearLayout;
            this.f66462e = oVar;
            this.f66463f = zb02;
            this.f66464g = i;
        }

        public final void onClick(View view) {
            UIStateCenter stateCenter;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$updateRelevantSearchBar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f66461d.getContext();
            C87412m.m108593f(context, "layout.context");
            if (context instanceof MutableContextWrapper) {
                context = ((MutableContextWrapper) context).getBaseContext();
                C87412m.m108593f(context, "this.baseContext");
            }
            BaseMvvmActivity baseMvvmActivity = context instanceof BaseMvvmActivity ? (BaseMvvmActivity) context : null;
            if (!(baseMvvmActivity == null || (stateCenter = baseMvvmActivity.getStateCenter()) == null)) {
                String k = this.f66462e.mo35139k();
                C87412m.m108593f(k, SearchIntents.EXTRA_QUERY);
                this.f66462e.getClass();
                stateCenter.dispatch(new C22835e(k, C99252h.f291031d, this.f66462e.f62331i, this.f66463f, this.f66464g, 32));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$updateRelevantSearchBar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xv1.o$d */
    public static final class C23141d extends C87413o implements C32224a<C23138a> {

        /* renamed from: d */
        public final /* synthetic */ C23137o f66465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23141d(C23137o oVar) {
            super(0);
            this.f66465d = oVar;
        }

        public Object invoke() {
            return new C23138a(this.f66465d);
        }
    }

    /* renamed from: xv1.o$e */
    public static final class C23142e extends C87413o implements C32224a<C23139b> {

        /* renamed from: d */
        public final /* synthetic */ C23137o f66466d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23142e(C23137o oVar) {
            super(0);
            this.f66466d = oVar;
        }

        public Object invoke() {
            return new C23139b();
        }
    }

    public C23137o(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public void mo35129a(Context context, C22019b.C22020a aVar, Object... objArr) {
        C87412m.m108594g(objArr, "extraData");
        Arrays.copyOf(objArr, objArr.length);
        if (this.f66455q.isEmpty()) {
            LinkedList<C52241zb0> linkedList = this.f66455q;
            C52241zb0 zb02 = new C52241zb0();
            zb02.f145787f = C99252h.f291031d;
            zb02.f145786e = 0;
            pd4 pd4 = new pd4();
            pd4.f139710d = mo35139k();
            pd4.f139711e = "LocalRelevantQuery";
            pd4.f139714h = 1;
            zb02.f145785d = pd4;
            linkedList.add(zb02);
        }
        C23138a aVar2 = (C23138a) ((C36570n) this.f66457s).getValue();
        C23311i iVar = null;
        C23138a aVar3 = aVar instanceof C23138a ? (C23138a) aVar : null;
        if (aVar3 != null) {
            iVar = aVar3.f66459a;
        }
        aVar2.f66459a = iVar;
    }

    /* renamed from: h */
    public C22019b.C22021b mo35136h() {
        return (C23139b) ((C36570n) this.f66458t).getValue();
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36519l(int r5, android.widget.LinearLayout r6, android.widget.TextView r7, android.widget.ImageView r8, android.widget.ProgressBar r9, boolean r10) {
        /*
            r4 = this;
            java.lang.String r0 = "layout"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "queryTV"
            gy3.C87412m.m108594g(r7, r0)
            java.util.LinkedList<te3.zb0> r0 = r4.f66455q
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r5)
            te3.zb0 r0 = (te3.C52241zb0) r0
            r1 = 8
            r2 = 0
            r3 = 0
            if (r10 != 0) goto L_0x0043
            if (r9 != 0) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            r9.setVisibility(r3)
        L_0x001e:
            if (r8 != 0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r8.setVisibility(r1)
        L_0x0024:
            android.content.Context r5 = r7.getContext()
            r8 = 2131100909(0x7f0604ed, float:1.7814213E38)
            int r5 = kg3.C76577a.m92153d(r5, r8)
            r7.setTextColor(r5)
            r5 = 2131835441(0x7f113a31, float:1.930402E38)
            r7.setText(r5)
            r6.setOnClickListener(r2)
            r6.setClickable(r3)
            r6.setFocusable(r3)
            goto L_0x00bf
        L_0x0043:
            if (r9 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r9.setVisibility(r1)
        L_0x0049:
            if (r8 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            r8.setVisibility(r3)
        L_0x004f:
            if (r0 == 0) goto L_0x00b4
            te3.pd4 r8 = r0.f145785d
            if (r8 == 0) goto L_0x00b4
            java.lang.String r8 = r8.f139710d
            if (r8 == 0) goto L_0x00b4
            boolean r9 = z04.C112551y.m153811k(r8)
            r10 = 1
            r9 = r9 ^ r10
            if (r9 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r8 = r2
        L_0x0063:
            if (r8 == 0) goto L_0x00b4
            r6.setClickable(r10)
            r6.setFocusable(r10)
            r6.setVisibility(r3)
            android.content.Context r9 = r7.getContext()
            r10 = 2131101252(0x7f060644, float:1.7814908E38)
            int r9 = kg3.C76577a.m92153d(r9, r10)
            r7.setTextColor(r9)
            te3.pd4 r9 = r0.f145785d
            if (r9 == 0) goto L_0x0083
            java.lang.String r9 = r9.f139718o
            goto L_0x0084
        L_0x0083:
            r9 = r2
        L_0x0084:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x009d
            java.lang.String r9 = r4.mo35139k()
            lv1.i r9 = lv1.C99672i.m130094a(r9, r3)
            lv1.f r8 = lv1.C99667f.m130091d(r8, r9, r3, r3)
            lv1.g r8 = kv1.C99254i.m129308e(r8)
            java.lang.CharSequence r8 = r8.f292107a
            goto L_0x00a7
        L_0x009d:
            te3.pd4 r8 = r0.f145785d
            if (r8 == 0) goto L_0x00a3
            java.lang.String r2 = r8.f139718o
        L_0x00a3:
            java.lang.CharSequence r8 = kv1.C99254i.m129310g(r2)
        L_0x00a7:
            r7.setText(r8)
            xv1.o$c r7 = new xv1.o$c
            r7.<init>(r6, r4, r0, r5)
            r6.setOnClickListener(r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x00b4:
            if (r2 != 0) goto L_0x00bf
            r6.setClickable(r3)
            r6.setFocusable(r3)
            r6.setVisibility(r1)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.C23137o.mo36519l(int, android.widget.LinearLayout, android.widget.TextView, android.widget.ImageView, android.widget.ProgressBar, boolean):void");
    }

    /* renamed from: m */
    public final void mo36520m(LinkedList<pd4> linkedList, String str, String str2) {
        C87412m.m108594g(linkedList, "resultList");
        C87412m.m108594g(str, "extInfo");
        C87412m.m108594g(str2, "sugTitle");
        this.f66454p = true;
        this.f66456r = str2;
        this.f66455q.clear();
        int i = 0;
        for (T next : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                LinkedList<C52241zb0> linkedList2 = this.f66455q;
                C52241zb0 zb02 = new C52241zb0();
                zb02.f145787f = C99252h.f291031d;
                zb02.f145786e = i;
                zb02.f145785d = (pd4) next;
                linkedList2.add(zb02);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        C23311i iVar = ((C23138a) ((C36570n) this.f66457s).getValue()).f66459a;
        if (iVar != null) {
            if (!Util.isNullOrNil(str2)) {
                if (iVar.f67026k == null) {
                    iVar.f67026k = (TextView) iVar.f67016a.findViewById(C0966R.C0970id.oi9);
                }
                iVar.f67026k.setText(str2);
            }
            if (iVar.f67025j == null) {
                iVar.f67025j = (LinearLayout) iVar.f67016a.findViewById(C0966R.C0970id.ohy);
            }
            LinearLayout linearLayout = iVar.f67025j;
            C87412m.m108593f(linearLayout, "it.relevantLayout1");
            if (iVar.f67027l == null) {
                iVar.f67027l = (TextView) iVar.f67016a.findViewById(C0966R.C0970id.oi5);
            }
            TextView textView = iVar.f67027l;
            C87412m.m108593f(textView, "it.relevantQuery1");
            mo36519l(0, linearLayout, textView, (ImageView) null, (ProgressBar) null, this.f66454p);
            if (iVar.f67018c == null) {
                iVar.f67018c = (LinearLayout) iVar.f67016a.findViewById(C0966R.C0970id.ohz);
            }
            LinearLayout linearLayout2 = iVar.f67018c;
            C87412m.m108593f(linearLayout2, "it.relevantLayout2");
            if (iVar.f67021f == null) {
                iVar.f67021f = (TextView) iVar.f67016a.findViewById(C0966R.C0970id.oi6);
            }
            TextView textView2 = iVar.f67021f;
            C87412m.m108593f(textView2, "it.relevantQuery2");
            if (iVar.f67024i == null) {
                iVar.f67024i = (WeImageView) iVar.f67016a.findViewById(C0966R.C0970id.ohu);
            }
            WeImageView weImageView = iVar.f67024i;
            if (iVar.f67020e == null) {
                iVar.f67020e = (ProgressBar) iVar.f67016a.findViewById(C0966R.C0970id.f359058oi2);
            }
            mo36519l(1, linearLayout2, textView2, weImageView, iVar.f67020e, this.f66454p);
            if (iVar.f67017b == null) {
                iVar.f67017b = (LinearLayout) iVar.f67016a.findViewById(C0966R.C0970id.f359056oi0);
            }
            LinearLayout linearLayout3 = iVar.f67017b;
            C87412m.m108593f(linearLayout3, "it.relevantLayout3");
            if (iVar.f67023h == null) {
                iVar.f67023h = (TextView) iVar.f67016a.findViewById(C0966R.C0970id.oi7);
            }
            TextView textView3 = iVar.f67023h;
            C87412m.m108593f(textView3, "it.relevantQuery3");
            if (iVar.f67022g == null) {
                iVar.f67022g = (WeImageView) iVar.f67016a.findViewById(C0966R.C0970id.ohv);
            }
            WeImageView weImageView2 = iVar.f67022g;
            if (iVar.f67019d == null) {
                iVar.f67019d = (ProgressBar) iVar.f67016a.findViewById(C0966R.C0970id.f359059oi3);
            }
            mo36519l(2, linearLayout3, textView3, weImageView2, iVar.f67019d, this.f66454p);
        }
    }
}
