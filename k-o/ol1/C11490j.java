package ol1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import ml1.C10929b;
import ml1.C10930c;
import nl1.C11217a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C50767p11;

/* renamed from: ol1.j */
public final class C11490j extends C11475a<C11217a> {

    /* renamed from: j */
    public final C10929b f33766j;

    /* renamed from: n */
    public final C10930c f33767n;

    /* renamed from: o */
    public final C13601g f33768o;

    /* renamed from: p */
    public final LinkedHashMap<String, C11217a> f33769p = new LinkedHashMap<>();

    /* renamed from: q */
    public final LinkedHashMap<String, C11491a> f33770q = new LinkedHashMap<>();

    /* renamed from: r */
    public final C32226l<C11217a, C13598b0> f33771r = new C11492b(this);

    /* renamed from: s */
    public ConstraintLayout f33772s;

    /* renamed from: t */
    public TextView f33773t;

    /* renamed from: ol1.j$a */
    public final class C11491a implements View.OnClickListener {

        /* renamed from: d */
        public C11217a f33774d;

        /* renamed from: e */
        public final View f33775e;

        /* renamed from: f */
        public final RelativeLayout f33776f;

        /* renamed from: g */
        public final ConstraintLayout f33777g;

        /* renamed from: h */
        public final ImageView f33778h;

        /* renamed from: i */
        public final TextView f33779i;

        /* renamed from: j */
        public final TextView f33780j;

        /* renamed from: n */
        public final TextView f33781n;

        /* renamed from: o */
        public final View f33782o;

        public C11491a(C11217a aVar) {
            this.f33774d = aVar;
            LayoutInflater from = LayoutInflater.from(C11490j.this.f28306d);
            ConstraintLayout constraintLayout = C11490j.this.f33772s;
            if (constraintLayout != null) {
                View inflate = from.inflate(C0966R.C0971layout.f359707b14, constraintLayout, false);
                this.f33775e = inflate;
                RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C0966R.C0970id.iyz);
                this.f33776f = relativeLayout;
                this.f33777g = (ConstraintLayout) inflate.findViewById(C0966R.C0970id.f358146iz1);
                this.f33778h = (ImageView) inflate.findViewById(C0966R.C0970id.dmc);
                this.f33779i = (TextView) inflate.findViewById(C0966R.C0970id.dmf);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f358149iz3);
                this.f33780j = textView;
                TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.f358147iz2);
                this.f33781n = textView2;
                this.f33782o = inflate.findViewById(C0966R.C0970id.f358159nm1);
                relativeLayout.setOnClickListener(this);
                ((WeImageView) inflate.findViewById(C0966R.C0970id.f358145iz0)).setOnClickListener(this);
                textView2.setOnClickListener(this);
                inflate.setId(inflate.hashCode());
                C58739j4 j4Var = C58739j4.f168176a;
                C87412m.m108593f(textView, "giftPrice");
                j4Var.mo83703c0(textView, false);
                mo11454a(this.f33774d);
                return;
            }
            C87412m.m108603p("giftPanelLayout");
            throw null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x009b, code lost:
            r8 = r8.f33072a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11454a(nl1.C11217a r8) {
            /*
                r7 = this;
                r7.f33774d = r8
                r0 = 8
                r1 = 0
                if (r8 != 0) goto L_0x0019
                android.widget.RelativeLayout r2 = r7.f33776f
                r2.setVisibility(r1)
                androidx.constraintlayout.widget.ConstraintLayout r2 = r7.f33777g
                r2.setVisibility(r0)
                android.view.View r0 = r7.f33775e
                java.lang.String r2 = "NULL_ITEM"
                r0.setTag(r2)
                goto L_0x002c
            L_0x0019:
                android.widget.RelativeLayout r2 = r7.f33776f
                r2.setVisibility(r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r7.f33777g
                r0.setVisibility(r1)
                android.view.View r0 = r7.f33775e
                te3.p11 r2 = r8.f33072a
                java.lang.String r2 = r2.f139507d
                r0.setTag(r2)
            L_0x002c:
                if (r8 == 0) goto L_0x008f
                ol1.j r0 = ol1.C11490j.this
                te3.p11 r2 = r8.f33072a
                bl3.r r3 = bl3.C39818r.f106831a
                java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
                bl3.r$a r3 = r3.mo62446e(r4)
                java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
                bl3.c r3 = r3.mo62447c(r4)
                pl1.s0 r3 = (pl1.C11990s0) r3
                k60.d r3 = r3.mo11871f2()
                pl1.n0 r4 = new pl1.n0
                java.lang.String r5 = r2.f139509f
                up1.y r6 = up1.C27696y.THUMB_IMAGE
                r4.<init>(r5, r6)
                l60.b r3 = r3.mo85955a(r4)
                android.widget.ImageView r4 = r7.f33778h
                java.lang.String r5 = "giftView"
                gy3.C87412m.m108593f(r4, r5)
                l60.a r3 = (l60.C99342a) r3
                r3.mo85954d(r4)
                android.widget.TextView r3 = r7.f33779i
                java.lang.String r4 = r2.f139515o
                r3.setText(r4)
                android.widget.TextView r3 = r7.f33780j
                float r2 = r2.f139516p
                int r2 = (int) r2
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r3.setText(r2)
                android.widget.TextView r2 = r7.f33781n
                android.content.Context r0 = r0.f28306d
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2131829080(0x7f112158, float:1.929112E38)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                long r5 = r8.f33073b
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                r4[r1] = r5
                java.lang.String r0 = r0.getString(r3, r4)
                r2.setText(r0)
            L_0x008f:
                ok1.e r0 = ok1.C62042e.f176370a
                android.view.View r1 = r7.f33782o
                java.lang.String r2 = "tagView"
                gy3.C87412m.m108593f(r1, r2)
                if (r8 == 0) goto L_0x00a6
                te3.p11 r8 = r8.f33072a
                if (r8 == 0) goto L_0x00a6
                ig1.d$a r2 = ig1.C8916d.f28211b1
                ig1.d r8 = r2.mo9727a(r8)
                goto L_0x00a7
            L_0x00a6:
                r8 = 0
            L_0x00a7:
                r0.mo87007G1(r1, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ol1.C11490j.C11491a.mo11454a(nl1.a):void");
        }

        public void onClick(View view) {
            String str;
            C50767p11 p112;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$GiftItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
            if (valueOf != null && valueOf.intValue() == C0966R.C0970id.iyz) {
                C11490j.this.f33767n.mo11130v();
            } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358145iz0) {
                ((C11492b) C11490j.this.f33771r).invoke(this.f33774d);
            } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358147iz2) {
                C11490j.this.mo9763a();
                C11497n nVar = (C11497n) ((C36570n) C11490j.this.f33768o).getValue();
                C11217a aVar = this.f33774d;
                if (aVar == null || (p112 = aVar.f33072a) == null || (str = p112.f139507d) == null) {
                    str = "";
                }
                long j = aVar != null ? aVar.f33073b : 0;
                nVar.getClass();
                nVar.f33794j = str;
                nVar.f33795n = j;
                MMEditText mMEditText = nVar.f33793i;
                if (mMEditText != null) {
                    mMEditText.setText("");
                    MMEditText mMEditText2 = nVar.f33793i;
                    if (mMEditText2 != null) {
                        mMEditText2.setSelection(0);
                        Log.m105924i("WishKeyBoardInputWidget", "bindCurrentGift: " + str);
                        ((C11497n) ((C36570n) C11490j.this.f33768o).getValue()).mo3431p();
                    } else {
                        C87412m.m108603p("editText");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("editText");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$GiftItemView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ol1.j$b */
    public static final class C11492b extends C87413o implements C32226l<C11217a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C11490j f33784d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11492b(C11490j jVar) {
            super(1);
            this.f33784d = jVar;
        }

        public Object invoke(Object obj) {
            String str;
            C50767p11 p112;
            String str2;
            C50767p11 p113;
            String str3;
            String str4;
            C50767p11 p114;
            C50767p11 p115;
            C11217a aVar = (C11217a) obj;
            C11490j jVar = this.f33784d;
            ConstraintLayout constraintLayout = jVar.f33772s;
            if (constraintLayout != null) {
                String str5 = "NULL_ITEM";
                if (constraintLayout.getChildCount() != 3 || jVar.f33770q.containsKey(str5)) {
                    LinkedHashMap<String, C11217a> linkedHashMap = jVar.f33769p;
                    if (aVar == null || (p113 = aVar.f33072a) == null || (str = p113.f139507d) == null) {
                        str = str5;
                    }
                    C11217a remove = linkedHashMap.remove(str);
                    LinkedHashMap<String, C11491a> linkedHashMap2 = jVar.f33770q;
                    if (!(remove == null || (p112 = remove.f33072a) == null || (str2 = p112.f139507d) == null)) {
                        str5 = str2;
                    }
                    C11491a remove2 = linkedHashMap2.remove(str5);
                    if (remove2 != null) {
                        ConstraintLayout constraintLayout2 = jVar.f33772s;
                        if (constraintLayout2 != null) {
                            View view = remove2.f33775e;
                            C87412m.m108593f(view, "rootView");
                            constraintLayout2.removeView(view);
                        } else {
                            C87412m.m108603p("giftPanelLayout");
                            throw null;
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("add view size = MAX: ");
                    ConstraintLayout constraintLayout3 = jVar.f33772s;
                    if (constraintLayout3 != null) {
                        sb.append(constraintLayout3.getChildCount());
                        Log.m105924i("WishEditPanelWidget", sb.toString());
                        LinkedHashMap<String, C11217a> linkedHashMap3 = jVar.f33769p;
                        if (aVar == null || (p115 = aVar.f33072a) == null || (str3 = p115.f139507d) == null) {
                            str3 = str5;
                        }
                        linkedHashMap3.remove(str3);
                        LinkedHashMap<String, C11491a> linkedHashMap4 = jVar.f33770q;
                        if (aVar == null || (p114 = aVar.f33072a) == null || (str4 = p114.f139507d) == null) {
                            str4 = str5;
                        }
                        C11491a remove3 = linkedHashMap4.remove(str4);
                        if (remove3 != null) {
                            jVar.f33769p.put(str5, (Object) null);
                            remove3.mo11454a((C11217a) null);
                            jVar.f33770q.put(str5, remove3);
                        }
                    } else {
                        C87412m.m108603p("giftPanelLayout");
                        throw null;
                    }
                }
                ConstraintLayout constraintLayout4 = jVar.f33772s;
                if (constraintLayout4 != null) {
                    constraintLayout4.removeAllViews();
                    for (Map.Entry next : jVar.f33770q.entrySet()) {
                        ConstraintLayout constraintLayout5 = jVar.f33772s;
                        if (constraintLayout5 != null) {
                            View view2 = ((C11491a) next.getValue()).f33775e;
                            C87412m.m108593f(view2, "rootView");
                            constraintLayout5.addView(view2);
                        } else {
                            C87412m.m108603p("giftPanelLayout");
                            throw null;
                        }
                    }
                    jVar.mo11453w();
                    jVar.mo11450t();
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("giftPanelLayout");
                throw null;
            }
            C87412m.m108603p("giftPanelLayout");
            throw null;
        }
    }

    /* renamed from: ol1.j$c */
    public static final class C11493c extends C87413o implements C32224a<C11497n> {

        /* renamed from: d */
        public final /* synthetic */ Context f33785d;

        /* renamed from: e */
        public final /* synthetic */ C0125s f33786e;

        /* renamed from: f */
        public final /* synthetic */ C11490j f33787f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11493c(Context context, C0125s sVar, C11490j jVar) {
            super(0);
            this.f33785d = context;
            this.f33786e = sVar;
            this.f33787f = jVar;
        }

        public Object invoke() {
            return new C11497n(this.f33785d, this.f33786e, new C11494k(this.f33787f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11490j(Context context, C0125s sVar, C10929b bVar, C10930c cVar) {
        super(context, sVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(bVar, "serviceLive");
        C87412m.m108594g(cVar, "viewEvent");
        this.f33766j = bVar;
        this.f33767n = cVar;
        this.f33768o = C36568h.m40985a(new C11493c(context, sVar, this));
        mo11449s((C11217a) null);
    }

    /* renamed from: b */
    public View mo9448b() {
        return mo9767f();
    }

    /* renamed from: c */
    public View mo9764c() {
        return mo9766e();
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.f359706b13;
    }

    /* renamed from: j */
    public String mo9449j() {
        String string = this.f28306d.getString(C0966R.string.fyw);
        C87412m.m108593f(string, "context.getString(R.stri…er_live_wish_panel_title)");
        return string;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        View findViewById = view.findViewById(C0966R.C0970id.izj);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…ve_wish_edit_gift_layout)");
        this.f33772s = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.mmw);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.wecoin_balance_value)");
        TextView textView = (TextView) findViewById2;
        this.f33773t = textView;
        C58739j4.f168176a.mo83703c0(textView, false);
    }

    /* renamed from: o */
    public void mo9768o() {
        if (this.f33767n.mo11126D()) {
            Collection<C11217a> values = this.f33769p.values();
            C87412m.m108593f(values, "giftPanelDatas.values");
            if (((ArrayList) C110818d0.m150912J(values)).isEmpty()) {
                this.f33766j.mo11124X(true);
                mo9763a();
            }
        }
        C10929b bVar = this.f33766j;
        Collection<C11217a> values2 = this.f33769p.values();
        C87412m.m108593f(values2, "giftPanelDatas.values");
        bVar.mo11125n(new LinkedList(C110818d0.m150912J(values2)));
        mo9763a();
    }

    public void onChanged(Object obj) {
        C11217a aVar = (C11217a) obj;
        Log.m105924i("WishEditPanelWidget", "onChanged: " + aVar);
        mo11449s(aVar);
        mo11453w();
        mo11450t();
    }

    /* renamed from: s */
    public final void mo11449s(C11217a aVar) {
        View view;
        String str;
        C50767p11 p112;
        String str2;
        C50767p11 p113;
        String str3;
        C50767p11 p114;
        String str4;
        C50767p11 p115;
        String str5;
        C50767p11 p116;
        ConstraintLayout constraintLayout = this.f33772s;
        if (constraintLayout != null) {
            int childCount = constraintLayout.getChildCount();
            String str6 = "NULL_ITEM";
            if (childCount >= 0) {
                int i = 0;
                while (true) {
                    ConstraintLayout constraintLayout2 = this.f33772s;
                    if (constraintLayout2 != null) {
                        View childAt = constraintLayout2.getChildAt(i);
                        Object tag = childAt != null ? childAt.getTag() : null;
                        if (aVar == null || (p116 = aVar.f33072a) == null || (str5 = p116.f139507d) == null) {
                            str5 = str6;
                        }
                        if (!C87412m.m108589b(tag, str5)) {
                            if (i == childCount) {
                                break;
                            }
                            i++;
                        } else {
                            ConstraintLayout constraintLayout3 = this.f33772s;
                            if (constraintLayout3 != null) {
                                view = constraintLayout3.getChildAt(i);
                            } else {
                                C87412m.m108603p("giftPanelLayout");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("giftPanelLayout");
                        throw null;
                    }
                }
            }
            view = null;
            if (view != null) {
                Log.m105924i("WishEditPanelWidget", "add same view return data: " + aVar);
                return;
            }
            ConstraintLayout constraintLayout4 = this.f33772s;
            if (constraintLayout4 == null) {
                C87412m.m108603p("giftPanelLayout");
                throw null;
            } else if (constraintLayout4.getChildCount() == 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("add view size = MAX: ");
                ConstraintLayout constraintLayout5 = this.f33772s;
                if (constraintLayout5 != null) {
                    sb.append(constraintLayout5.getChildCount());
                    Log.m105924i("WishEditPanelWidget", sb.toString());
                    this.f33769p.remove(str6);
                    C11491a remove = this.f33770q.remove(str6);
                    if (remove != null) {
                        LinkedHashMap<String, C11217a> linkedHashMap = this.f33769p;
                        if (aVar == null || (p115 = aVar.f33072a) == null || (str3 = p115.f139507d) == null) {
                            str3 = str6;
                        }
                        linkedHashMap.put(str3, aVar);
                        remove.mo11454a(aVar);
                        LinkedHashMap<String, C11491a> linkedHashMap2 = this.f33770q;
                        if (!(aVar == null || (p114 = aVar.f33072a) == null || (str4 = p114.f139507d) == null)) {
                            str6 = str4;
                        }
                        linkedHashMap2.put(str6, remove);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("giftPanelLayout");
                throw null;
            } else {
                Log.m105924i("WishEditPanelWidget", "addView contesxt: " + this.f28306d);
                C11491a aVar2 = new C11491a(aVar);
                ConstraintLayout constraintLayout6 = this.f33772s;
                if (constraintLayout6 != null) {
                    View view2 = aVar2.f33775e;
                    C87412m.m108593f(view2, "rootView");
                    constraintLayout6.addView(view2);
                    LinkedHashMap<String, C11217a> linkedHashMap3 = this.f33769p;
                    if (aVar == null || (p113 = aVar.f33072a) == null || (str = p113.f139507d) == null) {
                        str = str6;
                    }
                    linkedHashMap3.put(str, aVar);
                    LinkedHashMap<String, C11491a> linkedHashMap4 = this.f33770q;
                    if (!(aVar == null || (p112 = aVar.f33072a) == null || (str2 = p112.f139507d) == null)) {
                        str6 = str2;
                    }
                    linkedHashMap4.put(str6, aVar2);
                    return;
                }
                C87412m.m108603p("giftPanelLayout");
                throw null;
            }
        } else {
            C87412m.m108603p("giftPanelLayout");
            throw null;
        }
    }

    /* renamed from: t */
    public final void mo11450t() {
        TextView textView = this.f33773t;
        if (textView != null) {
            textView.setText(String.valueOf(mo11451u()));
            Collection<C11217a> values = this.f33769p.values();
            C87412m.m108593f(values, "giftPanelDatas.values");
            if ((!C110818d0.m150912J(values).isEmpty()) || this.f33767n.mo11126D()) {
                View view = this.f28308f;
                C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) view;
                textView2.setTextColor(textView2.getContext().getResources().getColor(C0966R.color.al9));
                textView2.setEnabled(true);
                return;
            }
            View view2 = this.f28308f;
            C87412m.m108592e(view2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView3 = (TextView) view2;
            textView3.setTextColor(textView3.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
            textView3.setEnabled(false);
            return;
        }
        C87412m.m108603p("sumValueText");
        throw null;
    }

    /* renamed from: u */
    public final long mo11451u() {
        long j = 0;
        for (Map.Entry<String, C11217a> value : this.f33769p.entrySet()) {
            C11217a aVar = (C11217a) value.getValue();
            if (aVar != null) {
                long j2 = (long) ((int) aVar.f33072a.f139516p);
                long j3 = aVar.f33073b;
                Long.signum(j2);
                j += j2 * j3;
            }
        }
        return j;
    }

    /* renamed from: v */
    public final void mo11452v() {
        ConstraintLayout constraintLayout = this.f33772s;
        if (constraintLayout != null) {
            constraintLayout.removeAllViews();
            this.f33769p.clear();
            this.f33770q.clear();
            mo11449s((C11217a) null);
            TextView textView = this.f33773t;
            if (textView != null) {
                textView.setText(String.valueOf(mo11451u()));
                mo11453w();
                return;
            }
            C87412m.m108603p("sumValueText");
            throw null;
        }
        C87412m.m108603p("giftPanelLayout");
        throw null;
    }

    /* renamed from: w */
    public final void mo11453w() {
        C11491a aVar = this.f33770q.get("NULL_ITEM");
        if (aVar != null) {
            ConstraintLayout constraintLayout = this.f33772s;
            if (constraintLayout != null) {
                View view = aVar.f33775e;
                C87412m.m108593f(view, "rootView");
                constraintLayout.removeView(view);
                ConstraintLayout constraintLayout2 = this.f33772s;
                if (constraintLayout2 != null) {
                    View view2 = aVar.f33775e;
                    C87412m.m108593f(view2, "rootView");
                    constraintLayout2.addView(view2);
                } else {
                    C87412m.m108603p("giftPanelLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("giftPanelLayout");
                throw null;
            }
        }
        ConstraintLayout constraintLayout3 = this.f33772s;
        if (constraintLayout3 != null) {
            mo11446r(constraintLayout3);
        } else {
            C87412m.m108603p("giftPanelLayout");
            throw null;
        }
    }
}
