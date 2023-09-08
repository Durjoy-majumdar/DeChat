package com.tencent.p014mm.plugin.finder.order.p054ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di0.C86295k;
import di0.C86299o;
import di3.C86312j;
import er1.C58739j4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import jq3.C60896i;
import jq3.C60905o;
import kr0.C76630x0;
import org.json.JSONObject;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C50684oh3;
import te3.C50831ph3;
import tn1.C14051a;
import un1.C65411a;

/* renamed from: com.tencent.mm.plugin.finder.order.ui.OrderConvert */
public final class OrderConvert extends C60896i<C14051a> {

    /* renamed from: e */
    public final String f15844e = "Finder.OrderConvert";

    /* renamed from: f */
    public final HashSet<String> f15845f = new HashSet<>();

    /* renamed from: com.tencent.mm.plugin.finder.order.ui.OrderConvert$a */
    public static final class C3365a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f15846d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f15847e;

        /* renamed from: f */
        public final /* synthetic */ C14051a f15848f;

        /* renamed from: g */
        public final /* synthetic */ String f15849g;

        /* renamed from: h */
        public final /* synthetic */ String f15850h;

        /* renamed from: i */
        public final /* synthetic */ String f15851i;

        /* renamed from: com.tencent.mm.plugin.finder.order.ui.OrderConvert$a$a */
        public static final class C3366a implements C86295k {

            /* renamed from: d */
            public final /* synthetic */ String f15852d;

            public C3366a(String str) {
                this.f15852d = str;
            }

            /* renamed from: a */
            public final String mo3693a() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("orderDetailsJson", this.f15852d);
                return jSONObject.toString();
            }
        }

        public C3365a(int i, C60905o oVar, C14051a aVar, String str, String str2, String str3) {
            this.f15846d = i;
            this.f15847e = oVar;
            this.f15848f = aVar;
            this.f15849g = str;
            this.f15850h = str2;
            this.f15851i = str3;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindEvaluation$setEvaluateClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = this.f15846d;
            String str = "";
            boolean z = true;
            String str2 = i != 1 ? i != 2 ? str : "show_order_comment_btn" : "order_comment_btn";
            if (str2.length() > 0) {
                C39818r rVar = C39818r.f106831a;
                Context context = this.f15847e.f173499A;
                C87412m.m108593f(context, "holder.context");
                C65411a aVar = (C65411a) rVar.mo62443b(context).mo75002a(C65411a.class);
                C13604l[] lVarArr = new C13604l[3];
                lVarArr[0] = new C13604l("element_name", str2);
                lVarArr[1] = new C13604l("page_name", "order_list_page");
                String str3 = this.f15848f.f39399d.f137197d;
                if (str3 == null) {
                    str3 = str;
                }
                lVarArr[2] = new C13604l("order_id", str3);
                aVar.mo89492c3("element_click", C90364q0.m113147f(lVarArr));
            }
            String str4 = this.f15848f.f39399d.f137197d;
            if (str4 != null) {
                str = str4;
            }
            Context context2 = this.f15847e.f44854d.getContext();
            if (context2 instanceof FinderLiveOrderUI) {
                ((FinderLiveOrderUI) context2).mo3024O7(str);
            }
            C86299o oVar = new C86299o();
            oVar.f250929a = this.f15849g;
            oVar.f250934f = this.f15850h;
            oVar.f250939k = C1824s.CTRL_INDEX;
            oVar.f250931c = C58739j4.f168176a.mo83673A();
            String str5 = this.f15851i;
            if (!(str5 == null || str5.length() == 0)) {
                z = false;
            }
            if (!z) {
                oVar.f250937i = new C3366a(this.f15851i);
            }
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.f15847e.f173499A, oVar);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindEvaluation$setEvaluateClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.order.ui.OrderConvert$b */
    public static final class C3367b extends RecyclerView.C0129l {
        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.left = 0;
            rect.right = 0;
            rect.bottom = (int) view.getContext().getResources().getDimension(C0966R.dimen.f3736cp);
            rect.top = 0;
        }
    }

    /* renamed from: j */
    public static final void m3428j(C60905o oVar, C14051a aVar, int i, TextView textView, String str, String str2, String str3) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                textView.setOnClickListener(new C3365a(i, oVar, aVar, str2, str, str3));
            }
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.ais;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0053, code lost:
        r3 = r3.f137848e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x070e  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x077b  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x077e  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x07da  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0874  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0877  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0881  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0889  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x092a  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0a15  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0b03  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0351  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r27, jq3.C9493c r28, int r29, int r30, boolean r31, java.util.List r32) {
        /*
            r26 = this;
            r6 = r26
            r14 = r27
            r15 = r28
            tn1.a r15 = (tn1.C14051a) r15
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = r6.f15844e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBindViewHolder position:"
            r1.append(r2)
            r2 = r29
            r1.append(r2)
            java.lang.String r2 = ",id:"
            r1.append(r2)
            te3.l60 r2 = r15.f39399d
            java.lang.String r2 = r2.f137197d
            java.lang.String r13 = ""
            if (r2 != 0) goto L_0x0031
            r2 = r13
        L_0x0031:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            te3.l60 r0 = r15.f39399d
            java.lang.String r1 = "order"
            gy3.C87412m.m108594g(r0, r1)
            ok1.e r1 = ok1.C62042e.f176370a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "desc:"
            r2.append(r3)
            te3.m54 r3 = r0.f137200g
            r7 = 0
            if (r3 == 0) goto L_0x005a
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = r3.f138419e
            goto L_0x005b
        L_0x005a:
            r3 = r7
        L_0x005b:
            r2.append(r3)
            r3 = 40
            r2.append(r3)
            te3.m54 r4 = r0.f137200g
            if (r4 == 0) goto L_0x0072
            te3.n54 r4 = r4.f137848e
            if (r4 == 0) goto L_0x0072
            int r4 = r4.f138418d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0073
        L_0x0072:
            r4 = r7
        L_0x0073:
            r2.append(r4)
            java.lang.String r4 = "),"
            r2.append(r4)
            long r4 = r0.f137201h
            r2.append(r4)
            java.lang.String r4 = ",sku list:"
            r2.append(r4)
            java.util.LinkedList<te3.v54> r4 = r0.f137199f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r4 == 0) goto L_0x0116
            java.util.Iterator r4 = r4.iterator()
            r9 = 0
        L_0x0093:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0116
            java.lang.Object r10 = r4.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x0112
            te3.v54 r10 = (te3.v54) r10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r8 = "[index"
            r12.append(r8)
            r12.append(r9)
            java.lang.String r8 = "(state:"
            r12.append(r8)
            int r8 = r10.f143321e
            r12.append(r8)
            java.lang.String r8 = "):"
            r12.append(r8)
            te3.qa4 r8 = r10.f143320d
            if (r8 == 0) goto L_0x00c6
            java.lang.String r8 = r8.f140215f
            goto L_0x00c7
        L_0x00c6:
            r8 = r7
        L_0x00c7:
            r12.append(r8)
            r12.append(r3)
            te3.qa4 r8 = r10.f143320d
            if (r8 == 0) goto L_0x00d8
            long r8 = r8.f140219j
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x00d9
        L_0x00d8:
            r8 = r7
        L_0x00d9:
            r12.append(r8)
            java.lang.String r8 = " or "
            r12.append(r8)
            te3.qa4 r8 = r10.f143320d
            if (r8 == 0) goto L_0x00ec
            long r8 = r8.f140220n
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x00ed
        L_0x00ec:
            r8 = r7
        L_0x00ed:
            r12.append(r8)
            java.lang.String r8 = " * "
            r12.append(r8)
            te3.qa4 r8 = r10.f143320d
            if (r8 == 0) goto L_0x0100
            int r8 = r8.f140217h
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0101
        L_0x0100:
            r8 = r7
        L_0x0101:
            r12.append(r8)
            java.lang.String r8 = ")]"
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r5.append(r8)
            r9 = r11
            goto L_0x0093
        L_0x0112:
            sx3.C64197v.m75542k()
            throw r7
        L_0x0116:
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "sb.toString()"
            gy3.C87412m.m108593f(r3, r4)
            r2.append(r3)
            java.lang.String r3 = ",evaluate:("
            r2.append(r3)
            int r3 = r0.f137212v
            r2.append(r3)
            r3 = 44
            r2.append(r3)
            java.lang.String r4 = r0.f137213w
            r2.append(r4)
            r2.append(r3)
            java.lang.String r0 = r0.f137214x
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "Finder.OrderFeed"
            r1.mo86998D1(r2, r0)
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            r3 = 2131313480(0x7f094348, float:1.8245358E38)
            android.view.View r3 = r14.mo85812D(r3)
            wn1.c r4 = new wn1.c
            r4.<init>(r15, r14)
            r3.setOnClickListener(r4)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r1)
            bl3.c r4 = r4.mo62447c(r0)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11872i2()
            pl1.n0 r5 = new pl1.n0
            java.lang.String r8 = r15.f39401f
            up1.y r9 = up1.C27696y.THUMB_IMAGE
            r5.<init>(r8, r9)
            r8 = 2131313477(0x7f094345, float:1.8245352E38)
            android.view.View r8 = r14.mo85812D(r8)
            java.lang.String r9 = "holder.getView(R.id.shop_avatar)"
            gy3.C87412m.m108593f(r8, r9)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            pl1.e0$a r9 = pl1.C11978e0.C11979a.AVATAR_WITHOUT_DEFAULT
            bl3.r$a r1 = r3.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r9)
            r4.mo85957c(r5, r8, r0)
            r0 = 2131310996(0x7f093994, float:1.824032E38)
            android.view.View r0 = r14.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131313482(0x7f09434a, float:1.8245362E38)
            android.view.View r1 = r14.mo85812D(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 2131313487(0x7f09434f, float:1.8245372E38)
            android.view.View r3 = r14.mo85812D(r3)
            java.lang.String r4 = r15.f39402g
            int r4 = r4.length()
            if (r4 != 0) goto L_0x01bd
            r4 = 1
            goto L_0x01be
        L_0x01bd:
            r4 = 0
        L_0x01be:
            r8 = 8
            if (r4 != 0) goto L_0x01f6
            java.lang.String r4 = r15.f39403h
            int r4 = r4.length()
            if (r4 != 0) goto L_0x01cc
            r4 = 1
            goto L_0x01cd
        L_0x01cc:
            r4 = 0
        L_0x01cd:
            if (r4 == 0) goto L_0x01d0
            goto L_0x01f6
        L_0x01d0:
            r4 = 0
            r0.setVisibility(r4)
            r1.setVisibility(r4)
            rn1.a r16 = rn1.C13091a.f37264a
            java.lang.String r4 = r15.f39402g
            java.util.LinkedList<te3.f93> r5 = r15.f39404i
            wk1.n r9 = wk1.C15440n.f41895a
            int r20 = r9.mo14263l()
            a14.n0 r9 = r14.f29679z
            r17 = r0
            r18 = r4
            r19 = r5
            r21 = r9
            r16.mo12597e(r17, r18, r19, r20, r21)
            java.lang.String r0 = r15.f39403h
            r1.setText(r0)
            goto L_0x0223
        L_0x01f6:
            r4 = 0
            r0.setVisibility(r4)
            r1.setVisibility(r8)
            rn1.a r16 = rn1.C13091a.f37264a
            java.lang.String r1 = r15.f39402g
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0209
            r4 = 1
            goto L_0x020a
        L_0x0209:
            r4 = 0
        L_0x020a:
            if (r4 == 0) goto L_0x020e
            java.lang.String r1 = r15.f39403h
        L_0x020e:
            r18 = r1
            java.util.LinkedList<te3.f93> r1 = r15.f39404i
            wk1.n r4 = wk1.C15440n.f41895a
            int r20 = r4.mo14263l()
            a14.n0 r4 = r14.f29679z
            r17 = r0
            r19 = r1
            r21 = r4
            r16.mo12597e(r17, r18, r19, r20, r21)
        L_0x0223:
            te3.l60 r0 = r15.f39399d
            te3.s44 r0 = r0.f137198e
            if (r0 == 0) goto L_0x022f
            boolean r0 = r0.f141324i
            if (r0 != 0) goto L_0x022f
            r0 = 1
            goto L_0x0230
        L_0x022f:
            r0 = 0
        L_0x0230:
            if (r0 == 0) goto L_0x0275
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0.mo10233c(r1)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindHeader"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindHeader"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x02b8
        L_0x0275:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r4)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindHeader"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindHeader"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x02b8:
            r0 = 2131314327(0x7f094697, float:1.8247076E38)
            android.view.View r0 = r14.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9 = 2131101164(0x7f0605ec, float:1.781473E38)
            if (r0 == 0) goto L_0x031d
            er1.C7919x.m8091a(r0)
            te3.l60 r1 = r15.f39399d
            java.lang.String r1 = r1.f137209s
            if (r1 == 0) goto L_0x02d0
            goto L_0x02d1
        L_0x02d0:
            r1 = r13
        L_0x02d1:
            r0.setText(r1)
            java.lang.CharSequence r1 = r0.getText()
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131828426(0x7f111eca, float:1.9289793E38)
            java.lang.String r3 = r3.getString(r4)
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x030d
            java.lang.CharSequence r1 = r0.getText()
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131828427(0x7f111ecb, float:1.9289795E38)
            java.lang.String r3 = r3.getString(r4)
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 == 0) goto L_0x02ff
            goto L_0x030d
        L_0x02ff:
            android.content.Context r1 = r14.f173499A
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getColor(r9)
            r0.setTextColor(r1)
            goto L_0x031d
        L_0x030d:
            android.content.Context r1 = r14.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
        L_0x031d:
            r0 = 2131310628(0x7f093824, float:1.8239573E38)
            android.view.View r0 = r14.mo85812D(r0)
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r0
            androidx.recyclerview.widget.RecyclerView$e r1 = r0.getAdapter()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.finder.model.RVFeed>"
            gy3.C87412m.m108592e(r1, r3)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            java.util.LinkedList<te3.v54> r3 = r15.f39410r
            if (r3 == 0) goto L_0x033e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x033c
            goto L_0x033e
        L_0x033c:
            r3 = 0
            goto L_0x033f
        L_0x033e:
            r3 = 1
        L_0x033f:
            r4 = 3
            if (r3 == 0) goto L_0x0351
            r0.setVisibility(r8)
            java.util.List r0 = r1.getData()
            r0.clear()
            r1.notifyDataSetChanged()
            goto L_0x03f3
        L_0x0351:
            r3 = 0
            r0.setVisibility(r3)
            java.util.List r0 = r1.getData()
            r0.clear()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedList<te3.v54> r3 = r15.f39410r
            java.lang.String r5 = "item.skuList"
            gy3.C87412m.m108593f(r3, r5)
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x036d:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x03b7
            java.lang.Object r10 = r3.next()
            int r11 = r5 + 1
            if (r5 < 0) goto L_0x03b3
            te3.v54 r10 = (te3.v54) r10
            if (r10 != 0) goto L_0x039c
            java.lang.String r10 = r6.f15844e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = "skulist, index:"
            r9.append(r8)
            r9.append(r5)
            java.lang.String r5 = " is Null"
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            goto L_0x03ac
        L_0x039c:
            tn1.n r5 = new tn1.n
            te3.l60 r8 = r15.f39399d
            java.lang.String r9 = r8.f137197d
            int r12 = r8.f137216z
            java.lang.String r8 = r8.f137193A
            r5.<init>(r10, r9, r12, r8)
            r0.add(r5)
        L_0x03ac:
            r5 = r11
            r8 = 8
            r9 = 2131101164(0x7f0605ec, float:1.781473E38)
            goto L_0x036d
        L_0x03b3:
            sx3.C64197v.m75542k()
            throw r7
        L_0x03b7:
            int r3 = r0.size()
            if (r3 <= r4) goto L_0x03e9
            boolean r3 = r15.f39411s
            if (r3 != 0) goto L_0x03e9
            java.util.List r3 = r1.getData()
            r5 = 0
            java.util.List r8 = r0.subList(r5, r4)
            java.lang.String r5 = "dataList.subList(0, 3)"
            gy3.C87412m.m108593f(r8, r5)
            r3.addAll(r8)
            java.util.List r3 = r1.getData()
            tn1.m r5 = new tn1.m
            int r8 = r0.size()
            int r8 = r8 - r4
            wn1.e r9 = new wn1.e
            r9.<init>(r1, r0, r15)
            r5.<init>(r8, r9)
            r3.add(r5)
            goto L_0x03f0
        L_0x03e9:
            java.util.List r3 = r1.getData()
            r3.addAll(r0)
        L_0x03f0:
            r1.notifyDataSetChanged()
        L_0x03f3:
            r0 = 2131300813(0x7f0911cd, float:1.8219666E38)
            android.view.View r0 = r14.mo85812D(r0)
            r1 = 2131311282(0x7f093ab2, float:1.82409E38)
            android.view.View r1 = r14.mo85812D(r1)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            r8 = 4
            java.lang.String r9 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            r12 = 2
            if (r3 == 0) goto L_0x070e
            int r3 = r3.f137847d
            r5 = 1
            if (r3 == r5) goto L_0x0412
            goto L_0x070e
        L_0x0412:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r1, r9)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            android.content.Context r3 = r14.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r3 = r3.getDimension(r5)
            int r3 = (int) r3
            r1.topMargin = r3
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r5)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindDeliveryInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindDeliveryInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "order.delivery_info?.delivery_type： "
            r1.append(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x0485
            int r3 = r3.f137847d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0486
        L_0x0485:
            r3 = r7
        L_0x0486:
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x049f
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x049f
            int r3 = r3.f138418d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x04a0
        L_0x049f:
            r3 = r7
        L_0x04a0:
            r1.append(r3)
            java.lang.String r3 = ", desc:"
            r1.append(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x04b5
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x04b5
            java.lang.String r3 = r3.f138419e
            goto L_0x04b6
        L_0x04b5:
            r3 = r7
        L_0x04b6:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            te3.l60 r2 = r15.f39399d
            te3.m54 r2 = r2.f137200g
            if (r2 == 0) goto L_0x04d1
            int r2 = r2.f137847d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x04d2
        L_0x04d1:
            r2 = r7
        L_0x04d2:
            if (r2 != 0) goto L_0x04d6
            goto L_0x06e0
        L_0x04d6:
            int r2 = r2.intValue()
            r3 = 1
            if (r2 != r3) goto L_0x06e0
            te3.l60 r2 = r15.f39399d
            te3.m54 r2 = r2.f137200g
            if (r2 == 0) goto L_0x04ea
            te3.n54 r2 = r2.f137848e
            if (r2 == 0) goto L_0x04ea
            java.lang.String r2 = r2.f138423i
            goto L_0x04eb
        L_0x04ea:
            r2 = r7
        L_0x04eb:
            if (r2 == 0) goto L_0x04f6
            int r3 = r2.length()
            if (r3 != 0) goto L_0x04f4
            goto L_0x04f6
        L_0x04f4:
            r3 = 0
            goto L_0x04f7
        L_0x04f6:
            r3 = 1
        L_0x04f7:
            if (r3 != 0) goto L_0x050f
            rx3.l r1 = new rx3.l
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x0509
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x0509
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x050a
        L_0x0509:
            r3 = r13
        L_0x050a:
            r1.<init>(r2, r3)
            goto L_0x06e5
        L_0x050f:
            te3.l60 r2 = r15.f39399d
            te3.m54 r2 = r2.f137200g
            if (r2 == 0) goto L_0x0520
            te3.n54 r2 = r2.f137848e
            if (r2 == 0) goto L_0x0520
            int r2 = r2.f138418d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0521
        L_0x0520:
            r2 = r7
        L_0x0521:
            if (r2 != 0) goto L_0x0524
            goto L_0x0548
        L_0x0524:
            int r3 = r2.intValue()
            if (r3 != 0) goto L_0x0548
            rx3.l r2 = new rx3.l
            r3 = 2131828396(0x7f111eac, float:1.9289732E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x0541
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x0541
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x0542
        L_0x0541:
            r3 = r13
        L_0x0542:
            r2.<init>(r1, r3)
        L_0x0545:
            r1 = r2
            goto L_0x06e5
        L_0x0548:
            if (r2 != 0) goto L_0x054b
            goto L_0x056e
        L_0x054b:
            int r3 = r2.intValue()
            r5 = 1
            if (r3 != r5) goto L_0x056e
            rx3.l r2 = new rx3.l
            r3 = 2131828399(0x7f111eaf, float:1.9289738E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x0569
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x0569
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x056a
        L_0x0569:
            r3 = r13
        L_0x056a:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x056e:
            if (r2 != 0) goto L_0x0571
            goto L_0x0593
        L_0x0571:
            int r3 = r2.intValue()
            if (r3 != r12) goto L_0x0593
            rx3.l r2 = new rx3.l
            r3 = 2131828400(0x7f111eb0, float:1.928974E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x058e
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x058e
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x058f
        L_0x058e:
            r3 = r13
        L_0x058f:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x0593:
            if (r2 != 0) goto L_0x0596
            goto L_0x05b8
        L_0x0596:
            int r3 = r2.intValue()
            if (r3 != r4) goto L_0x05b8
            rx3.l r2 = new rx3.l
            r3 = 2131828401(0x7f111eb1, float:1.9289742E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x05b3
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x05b3
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x05b4
        L_0x05b3:
            r3 = r13
        L_0x05b4:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x05b8:
            if (r2 != 0) goto L_0x05bb
            goto L_0x05de
        L_0x05bb:
            int r3 = r2.intValue()
            if (r3 != r8) goto L_0x05de
            rx3.l r2 = new rx3.l
            r3 = 2131828402(0x7f111eb2, float:1.9289744E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x05d8
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x05d8
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x05d9
        L_0x05d8:
            r3 = r13
        L_0x05d9:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x05de:
            r3 = 5
            if (r2 != 0) goto L_0x05e2
            goto L_0x0605
        L_0x05e2:
            int r4 = r2.intValue()
            if (r4 != r3) goto L_0x0605
            rx3.l r2 = new rx3.l
            r3 = 2131828403(0x7f111eb3, float:1.9289746E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x05ff
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x05ff
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x0600
        L_0x05ff:
            r3 = r13
        L_0x0600:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x0605:
            r3 = 6
            if (r2 != 0) goto L_0x0609
            goto L_0x062c
        L_0x0609:
            int r4 = r2.intValue()
            if (r4 != r3) goto L_0x062c
            rx3.l r2 = new rx3.l
            r3 = 2131828404(0x7f111eb4, float:1.9289748E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x0626
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x0626
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x0627
        L_0x0626:
            r3 = r13
        L_0x0627:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x062c:
            r3 = 7
            if (r2 != 0) goto L_0x0630
            goto L_0x0653
        L_0x0630:
            int r4 = r2.intValue()
            if (r4 != r3) goto L_0x0653
            rx3.l r2 = new rx3.l
            r3 = 2131828405(0x7f111eb5, float:1.928975E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x064d
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x064d
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x064e
        L_0x064d:
            r3 = r13
        L_0x064e:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x0653:
            if (r2 != 0) goto L_0x0656
            goto L_0x067b
        L_0x0656:
            int r3 = r2.intValue()
            r4 = 8
            if (r3 != r4) goto L_0x067b
            rx3.l r2 = new rx3.l
            r3 = 2131828406(0x7f111eb6, float:1.9289752E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x0675
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x0675
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x0676
        L_0x0675:
            r3 = r13
        L_0x0676:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x067b:
            r3 = 9
            if (r2 != 0) goto L_0x0680
            goto L_0x06a3
        L_0x0680:
            int r4 = r2.intValue()
            if (r4 != r3) goto L_0x06a3
            rx3.l r2 = new rx3.l
            r3 = 2131828397(0x7f111ead, float:1.9289734E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x069d
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x069d
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x069e
        L_0x069d:
            r3 = r13
        L_0x069e:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x06a3:
            r3 = 12
            if (r2 != 0) goto L_0x06a8
            goto L_0x06cb
        L_0x06a8:
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x06cb
            rx3.l r2 = new rx3.l
            r3 = 2131828398(0x7f111eae, float:1.9289736E38)
            java.lang.String r1 = r1.getString(r3)
            te3.l60 r3 = r15.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x06c5
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x06c5
            java.lang.String r3 = r3.f138419e
            if (r3 != 0) goto L_0x06c6
        L_0x06c5:
            r3 = r13
        L_0x06c6:
            r2.<init>(r1, r3)
            goto L_0x0545
        L_0x06cb:
            rx3.l r1 = new rx3.l
            te3.l60 r2 = r15.f39399d
            te3.m54 r2 = r2.f137200g
            if (r2 == 0) goto L_0x06db
            te3.n54 r2 = r2.f137848e
            if (r2 == 0) goto L_0x06db
            java.lang.String r2 = r2.f138419e
            if (r2 != 0) goto L_0x06dc
        L_0x06db:
            r2 = r13
        L_0x06dc:
            r1.<init>(r13, r2)
            goto L_0x06e5
        L_0x06e0:
            rx3.l r1 = new rx3.l
            r1.<init>(r13, r13)
        L_0x06e5:
            r2 = 2131300815(0x7f0911cf, float:1.821967E38)
            android.view.View r2 = r14.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            A r3 = r1.f38555d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            r2 = 2131300814(0x7f0911ce, float:1.8219668E38)
            android.view.View r2 = r14.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            B r1 = r1.f38556e
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            wn1.a r1 = new wn1.a
            r1.<init>(r15, r6, r14)
            r0.setOnClickListener(r1)
            goto L_0x0752
        L_0x070e:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindDeliveryInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindDeliveryInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0752:
            java.lang.String r0 = r6.f15844e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bind price "
            r1.append(r2)
            te3.l60 r2 = r15.f39399d
            java.util.LinkedList<te3.ph3> r2 = r2.f137196D
            java.lang.String r3 = "item.order.price_wording_part_list"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            te3.ph3 r2 = (te3.C50831ph3) r2
            if (r2 == 0) goto L_0x077e
            java.util.LinkedList<te3.oh3> r2 = r2.f139771d
            if (r2 == 0) goto L_0x077e
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            te3.oh3 r2 = (te3.C50684oh3) r2
            if (r2 == 0) goto L_0x077e
            java.lang.String r2 = r2.f139185e
            goto L_0x077f
        L_0x077e:
            r2 = r7
        L_0x077f:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 2131315233(0x7f094a21, float:1.8248913E38)
            android.view.View r0 = r14.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r15.f39412t
            r0.setText(r1)
            r0 = 2131311284(0x7f093ab4, float:1.8240904E38)
            android.view.View r0 = r14.mo85812D(r0)
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131311285(0x7f093ab5, float:1.8240906E38)
            android.view.View r0 = r14.mo85812D(r0)
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131311286(0x7f093ab6, float:1.8240908E38)
            android.view.View r0 = r14.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            te3.l60 r1 = r15.f39399d
            java.util.LinkedList<te3.ph3> r1 = r1.f137196D
            gy3.C87412m.m108593f(r1, r3)
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x07da
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r10 = r14.f44854d
            wn1.d r11 = new wn1.d
            r0 = r11
            r1 = r27
            r2 = r26
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r10.post(r11)
            goto L_0x0867
        L_0x07da:
            r1 = 0
            r0.setVisibility(r1)
            java.util.LinkedList<te3.v54> r1 = r15.f39410r
            if (r1 == 0) goto L_0x07eb
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x07e9
            goto L_0x07eb
        L_0x07e9:
            r1 = 0
            goto L_0x07ec
        L_0x07eb:
            r1 = 1
        L_0x07ec:
            if (r1 == 0) goto L_0x07f4
            r1 = 8
            r4.setVisibility(r1)
            goto L_0x0813
        L_0x07f4:
            r1 = 0
            r4.setVisibility(r1)
            android.content.Context r2 = r14.f173499A
            r3 = 2131828415(0x7f111ebf, float:1.928977E38)
            r5 = 1
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.util.LinkedList<te3.v54> r5 = r15.f39410r
            int r5 = r5.size()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r10[r1] = r5
            java.lang.String r1 = r2.getString(r3, r10)
            r4.setText(r1)
        L_0x0813:
            te3.l60 r1 = r15.f39399d
            int r2 = r1.f137216z
            if (r2 == 0) goto L_0x0850
            r3 = 2131827017(0x7f111949, float:1.9286935E38)
            r4 = 1
            if (r2 == r4) goto L_0x0837
            android.content.Context r2 = r14.f173499A
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.String r10 = r15.f39414v
            r11 = 0
            r5[r11] = r10
            java.lang.String r1 = r1.f137193A
            if (r1 != 0) goto L_0x082d
            r1 = r13
        L_0x082d:
            r5[r4] = r1
            java.lang.String r1 = r2.getString(r3, r5)
            r0.setText(r1)
            goto L_0x0867
        L_0x0837:
            android.content.Context r2 = r14.f173499A
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.String r5 = r15.f39414v
            r10 = 0
            r4[r10] = r5
            java.lang.String r1 = r1.f137193A
            if (r1 != 0) goto L_0x0845
            r1 = r13
        L_0x0845:
            r5 = 1
            r4[r5] = r1
            java.lang.String r1 = r2.getString(r3, r4)
            r0.setText(r1)
            goto L_0x0867
        L_0x0850:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 65509(0xffe5, float:9.1798E-41)
            r1.append(r2)
            java.lang.String r2 = r15.f39413u
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
        L_0x0867:
            r0 = 2131298259(0x7f0907d3, float:1.8214486E38)
            android.view.View r0 = r14.mo85812D(r0)
            te3.l60 r1 = r15.f39399d
            te3.wv3 r1 = r1.f137202i
            if (r1 == 0) goto L_0x0877
            java.lang.String r1 = r1.f144311e
            goto L_0x0878
        L_0x0877:
            r1 = r7
        L_0x0878:
            if (r1 == 0) goto L_0x0883
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0881
            goto L_0x0883
        L_0x0881:
            r1 = 0
            goto L_0x0884
        L_0x0883:
            r1 = 1
        L_0x0884:
            r2 = 2131302944(0x7f091a20, float:1.8223988E38)
            if (r1 == 0) goto L_0x092a
            android.view.View r1 = r14.mo85812D(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindFinderInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindFinderInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindFinderInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindFinderInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            gy3.C87412m.m108592e(r0, r9)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            android.content.Context r1 = r14.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165329(0x7f070091, float:1.7944872E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            r0.topMargin = r1
            goto L_0x09e7
        L_0x092a:
            android.view.View r1 = r14.mo85812D(r2)
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindFinderInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindFinderInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            k20.a r1 = new k20.a
            r1.<init>()
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r4)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindFinderInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r3 = 0
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindFinderInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            gy3.C87412m.m108592e(r0, r9)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            android.content.Context r1 = r14.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131165307(0x7f07007b, float:1.7944827E38)
            float r1 = r1.getDimension(r3)
            int r1 = (int) r1
            r0.topMargin = r1
            r0 = 2131304535(0x7f092057, float:1.8227215E38)
            android.view.View r0 = r14.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x09d9
            java.lang.String r1 = r15.f39415w
            r0.setText(r1)
        L_0x09d9:
            android.view.View r0 = r14.mo85812D(r2)
            if (r0 == 0) goto L_0x09e7
            wn1.b r1 = new wn1.b
            r1.<init>(r14, r15)
            r0.setOnClickListener(r1)
        L_0x09e7:
            r0 = 2131301711(0x7f09154f, float:1.8221488E38)
            android.view.View r0 = r14.mo85812D(r0)
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.text.TextPaint r0 = r10.getPaint()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r1)
            r0 = 1096810496(0x41600000, float:14.0)
            r10.setTextSize(r12, r0)
            te3.l60 r0 = r15.f39399d
            int r1 = r0.f137212v
            java.lang.String r11 = r0.f137213w
            java.lang.String r0 = r0.f137214x
            java.lang.String r2 = "holder.context"
            r3 = 2131306852(0x7f092964, float:1.8231915E38)
            java.lang.String r4 = "show_order_comment_btn"
            java.lang.String r5 = "order_comment_btn"
            r9 = 1
            if (r1 == r9) goto L_0x0b03
            if (r1 == r12) goto L_0x0a64
            android.view.View r0 = r14.mo85812D(r3)
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindEvaluation"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindEvaluation"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r0 = 8
            r10.setVisibility(r0)
            goto L_0x0b9d
        L_0x0a64:
            android.content.Context r8 = r14.f173499A
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131828409(0x7f111eb9, float:1.9289758E38)
            java.lang.String r8 = r8.getString(r9)
            r10.setText(r8)
            android.content.Context r8 = r14.f173499A
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131101164(0x7f0605ec, float:1.781473E38)
            int r7 = r8.getColor(r9, r7)
            r10.setTextColor(r7)
            r7 = 2131232762(0x7f0807fa, float:1.8081642E38)
            r10.setBackgroundResource(r7)
            android.view.View r3 = r14.mo85812D(r3)
            k20.a r7 = new k20.a
            r7.<init>()
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r9)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r19 = "bindEvaluation"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r18 = "bindEvaluation"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            r3 = 0
            r10.setVisibility(r3)
            java.lang.String r3 = r15.f39400e
            r7 = r27
            r8 = r15
            r16 = 1
            r9 = r1
            r29 = r4
            r4 = 1
            r12 = r0
            r17 = r13
            r13 = r3
            m3428j(r7, r8, r9, r10, r11, r12, r13)
            android.content.Context r0 = r14.f173499A
            gy3.C87412m.m108593f(r0, r2)
            if (r1 == r4) goto L_0x0af5
            r2 = 2
            if (r1 == r2) goto L_0x0af2
            r13 = r17
            goto L_0x0af6
        L_0x0af2:
            r13 = r29
            goto L_0x0af6
        L_0x0af5:
            r13 = r5
        L_0x0af6:
            te3.l60 r1 = r15.f39399d
            java.lang.String r1 = r1.f137197d
            if (r1 != 0) goto L_0x0afe
            r1 = r17
        L_0x0afe:
            r6.mo3691l(r0, r13, r1)
            goto L_0x0b9d
        L_0x0b03:
            r29 = r4
            r17 = r13
            r4 = 1
            android.content.Context r8 = r14.f173499A
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131828408(0x7f111eb8, float:1.9289756E38)
            java.lang.String r8 = r8.getString(r9)
            r10.setText(r8)
            android.content.Context r8 = r14.f173499A
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131099940(0x7f060124, float:1.7812247E38)
            int r7 = r8.getColor(r9, r7)
            r10.setTextColor(r7)
            r7 = 2131233671(0x7f080b87, float:1.8083486E38)
            r10.setBackgroundResource(r7)
            android.view.View r3 = r14.mo85812D(r3)
            k20.a r7 = new k20.a
            r7.<init>()
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r9)
            java.lang.Object[] r19 = r7.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r21 = "bindEvaluation"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r3
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = 0
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert"
            java.lang.String r20 = "bindEvaluation"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/order/data/OrderFeed;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r3 = 0
            r10.setVisibility(r3)
            java.lang.String r13 = r15.f39400e
            r7 = r27
            r8 = r15
            r9 = r1
            r12 = r0
            m3428j(r7, r8, r9, r10, r11, r12, r13)
            android.content.Context r0 = r14.f173499A
            gy3.C87412m.m108593f(r0, r2)
            if (r1 == r4) goto L_0x0b91
            r2 = 2
            if (r1 == r2) goto L_0x0b8e
            r13 = r17
            goto L_0x0b92
        L_0x0b8e:
            r13 = r29
            goto L_0x0b92
        L_0x0b91:
            r13 = r5
        L_0x0b92:
            te3.l60 r1 = r15.f39399d
            java.lang.String r1 = r1.f137197d
            if (r1 != 0) goto L_0x0b9a
            r1 = r17
        L_0x0b9a:
            r6.mo3691l(r0, r13, r1)
        L_0x0b9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.order.p054ui.OrderConvert.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) oVar.mo85812D(C0966R.C0970id.hon);
        wxRecyclerView.setLayoutManager(new OrderConvert$onCreateViewHolder$1(recyclerView.getContext()));
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new OrderConvert$onCreateViewHolder$2(), new ArrayList(), false);
        wxRecyclerAdapter.f173490q = true;
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        wxRecyclerView.mo17085h0(new C3367b());
        wxRecyclerView.setNestedScrollingEnabled(false);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.i2j);
        C58739j4 j4Var = C58739j4.f168176a;
        C87412m.m108593f(textView, "priceTv");
        j4Var.mo83703c0(textView, false);
    }

    /* renamed from: k */
    public final CharSequence mo3690k(C50831ph3 ph32) {
        StringBuilder sb = new StringBuilder();
        LinkedList<C50684oh3> linkedList = ph32.f139771d;
        C87412m.m108593f(linkedList, "wordingPart.price_wording_list");
        for (C50684oh3 oh32 : linkedList) {
            sb.append(oh32.f139185e);
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        LinkedList<C50684oh3> linkedList2 = ph32.f139771d;
        C87412m.m108593f(linkedList2, "wordingPart.price_wording_list");
        int i = 0;
        for (C50684oh3 oh33 : linkedList2) {
            if (oh33.f139184d == 2) {
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), "fonts/WeChatSansStd-Medium.ttf");
                    if (Build.VERSION.SDK_INT >= 28) {
                        TypefaceSpan typefaceSpan = new TypefaceSpan(createFromAsset);
                        String str = oh33.f139185e;
                        spannableString.setSpan(typefaceSpan, i, (str != null ? str.length() : 0) + i, 17);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace(this.f15844e, e, "set typeface span failed", new Object[0]);
                }
                RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(1.2142857f);
                String str2 = oh33.f139185e;
                spannableString.setSpan(relativeSizeSpan, i, (str2 != null ? str2.length() : 0) + i, 17);
            }
            String str3 = oh33.f139185e;
            i += str3 != null ? str3.length() : 0;
        }
        return spannableString;
    }

    /* renamed from: l */
    public final void mo3691l(Context context, String str, String str2) {
        if (!this.f15845f.contains(str2)) {
            this.f15845f.add(str2);
            ((C65411a) C39818r.f106831a.mo62443b(context).mo75002a(C65411a.class)).mo89492c3("element_expose", C90364q0.m113147f(new C13604l("element_name", str), new C13604l("page_name", "order_list_page"), new C13604l("order_id", str2)));
            String str3 = this.f15844e;
            Log.m105924i(str3, "report expose element name = " + str + ", orderId = " + str2);
        }
    }
}
