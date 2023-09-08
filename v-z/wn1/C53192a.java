package wn1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.order.p054ui.OrderConvert;
import jq3.C60905o;
import tn1.C14051a;

/* renamed from: wn1.a */
public final class C53192a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14051a f148387d;

    /* renamed from: e */
    public final /* synthetic */ OrderConvert f148388e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f148389f;

    public C53192a(C14051a aVar, OrderConvert orderConvert, C60905o oVar) {
        this.f148387d = aVar;
        this.f148388e = orderConvert;
        this.f148389f = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindDeliveryInfo$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r8
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            tn1.a r9 = r8.f148387d
            te3.l60 r9 = r9.f39399d
            te3.m54 r9 = r9.f137200g
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x0033
            te3.n54 r9 = r9.f137848e
            if (r9 == 0) goto L_0x0033
            int r9 = r9.f138418d
            int r2 = ks3.C46738o.f125818a
            r2 = 12
            if (r9 != r2) goto L_0x0033
            r9 = 1
            goto L_0x0034
        L_0x0033:
            r9 = 0
        L_0x0034:
            java.lang.String r2 = ""
            java.lang.String r3 = "holder.context"
            if (r9 == 0) goto L_0x00ab
            com.tencent.mm.plugin.finder.order.ui.OrderConvert r9 = r8.f148388e
            jq3.o r0 = r8.f148389f
            android.content.Context r0 = r0.f173499A
            gy3.C87412m.m108593f(r0, r3)
            tn1.a r1 = r8.f148387d
            te3.l60 r3 = r1.f39399d
            te3.m54 r3 = r3.f137200g
            if (r3 == 0) goto L_0x0055
            te3.n54 r3 = r3.f137848e
            if (r3 == 0) goto L_0x0055
            java.lang.String r3 = r3.f138422h
            if (r3 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = r3
        L_0x0055:
            java.lang.String r1 = r1.f39416x
            java.lang.String r9 = r9.f15844e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Order jump kefu kfUrl="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
            java.lang.Class<he0.i> r9 = he0.C59837i.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            he0.i r9 = (he0.C59837i) r9
            if (r9 == 0) goto L_0x015b
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest r3 = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest
            r3.<init>()
            r3.f108515d = r0
            long r4 = java.lang.System.currentTimeMillis()
            r3.f108516e = r4
            r0 = 9
            r3.f108517f = r0
            te3.s3 r0 = new te3.s3
            r0.<init>()
            r0.f141285d = r2
            te3.i73 r4 = new te3.i73
            r4.<init>()
            int r5 = r3.f108517f
            r4.f135154d = r5
            r4.f135156f = r2
            r4.f135155e = r1
            r0.f141288g = r4
            r3.f108520i = r0
            int r0 = he0.C46025n.m51344a(r5)
            r3.f108519h = r0
            r9.mo71855jT(r3)
            goto L_0x015b
        L_0x00ab:
            bl3.r r9 = bl3.C39818r.f106831a
            jq3.o r4 = r8.f148389f
            android.content.Context r4 = r4.f173499A
            gy3.C87412m.m108593f(r4, r3)
            bl3.r$a r9 = r9.mo62443b(r4)
            java.lang.Class<un1.a> r3 = un1.C65411a.class
            androidx.lifecycle.i0 r9 = r9.mo75002a(r3)
            un1.a r9 = (un1.C65411a) r9
            r3 = 3
            rx3.l[] r3 = new rx3.C13604l[r3]
            rx3.l r4 = new rx3.l
            tn1.a r5 = r8.f148387d
            java.lang.String r6 = r5.f39408p
            java.lang.String r7 = "shipment_id"
            r4.<init>(r7, r6)
            r3[r1] = r4
            rx3.l r4 = new rx3.l
            java.lang.String r6 = "current_page"
            java.lang.String r7 = "order_list"
            r4.<init>(r6, r7)
            r3[r0] = r4
            r4 = 2
            rx3.l r6 = new rx3.l
            te3.l60 r5 = r5.f39399d
            java.lang.String r5 = r5.f137197d
            if (r5 != 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r2 = r5
        L_0x00e7:
            java.lang.String r5 = "order_id"
            r6.<init>(r5, r2)
            r3[r4] = r6
            java.util.Map r2 = sx3.C90364q0.m113147f(r3)
            java.lang.String r3 = "enter_shipment_detail"
            r9.mo89492c3(r3, r2)
            tn1.a r9 = r8.f148387d
            java.lang.String r9 = r9.f39408p
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            if (r0 == 0) goto L_0x0152
            com.tencent.mm.plugin.finder.order.ui.OrderConvert r0 = r8.f148388e
            java.lang.String r0 = r0.f15844e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "delivery appid "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = ", path:"
            r1.append(r2)
            tn1.a r2 = r8.f148387d
            java.lang.String r2 = r2.f39409q
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            di0.o r0 = new di0.o
            r0.<init>()
            r0.f250930b = r9
            tn1.a r9 = r8.f148387d
            java.lang.String r9 = r9.f39409q
            r0.f250934f = r9
            r9 = 1216(0x4c0, float:1.704E-42)
            r0.f250939k = r9
            er1.j4 r9 = er1.C58739j4.f168176a
            int r9 = r9.mo83673A()
            r0.f250931c = r9
            java.lang.Class<kr0.x0> r9 = kr0.C76630x0.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            kr0.x0 r9 = (kr0.C76630x0) r9
            jq3.o r1 = r8.f148389f
            android.content.Context r1 = r1.f173499A
            r9.mo106898tv(r1, r0)
            goto L_0x015b
        L_0x0152:
            com.tencent.mm.plugin.finder.order.ui.OrderConvert r9 = r8.f148388e
            java.lang.String r9 = r9.f15844e
            java.lang.String r0 = "delivery appid is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x015b:
            java.lang.String r9 = "com/tencent/mm/plugin/finder/order/ui/OrderConvert$bindDeliveryInfo$1"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r8, r9, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wn1.C53192a.onClick(android.view.View):void");
    }
}
