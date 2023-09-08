package wn1;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import er1.C58739j4;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import tn1.C14059n;

/* renamed from: wn1.p */
public final class C15567p extends C60896i<C14059n> {

    /* renamed from: e */
    public final String f42171e = "SpuConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.aiv;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0311  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r18, jq3.C9493c r19, int r20, int r21, boolean r22, java.util.List r23) {
        /*
            r17 = this;
            r1 = r18
            r2 = r19
            tn1.n r2 = (tn1.C14059n) r2
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r2, r4)
            r4 = r17
            java.lang.String r5 = r4.f42171e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onBindViewHolder pos:"
            r6.append(r7)
            r7 = r20
            r6.append(r7)
            java.lang.String r7 = ",info:"
            r6.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "orderId:"
            r7.append(r8)
            java.lang.String r8 = r2.f39439e
            r7.append(r8)
            java.lang.String r8 = ",spuId:"
            r7.append(r8)
            te3.v54 r8 = r2.f39438d
            te3.qa4 r8 = r8.f143320d
            r9 = 0
            if (r8 == 0) goto L_0x004e
            long r10 = r8.f140213d
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            goto L_0x004f
        L_0x004e:
            r8 = r9
        L_0x004f:
            r7.append(r8)
            java.lang.String r8 = ",spuName:"
            r7.append(r8)
            java.lang.String r8 = r2.f39443i
            r7.append(r8)
            java.lang.String r8 = ",headLabel size:"
            r7.append(r8)
            java.util.LinkedList<te3.f93> r8 = r2.f39444j
            int r8 = r8.size()
            r7.append(r8)
            java.lang.String r8 = ",deliveryInfo size:"
            r7.append(r8)
            java.util.LinkedList<te3.h93> r8 = r2.f39446o
            int r8 = r8.size()
            r7.append(r8)
            java.lang.String r8 = ",skuId:"
            r7.append(r8)
            te3.v54 r8 = r2.f39438d
            te3.qa4 r8 = r8.f143320d
            if (r8 == 0) goto L_0x008a
            long r10 = r8.f140214e
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            goto L_0x008b
        L_0x008a:
            r8 = r9
        L_0x008b:
            r7.append(r8)
            java.lang.String r8 = ",skuName:"
            r7.append(r8)
            java.lang.String r8 = r2.f39447p
            r7.append(r8)
            java.lang.String r8 = ", skuText:"
            r7.append(r8)
            te3.v54 r8 = r2.f39438d
            java.lang.String r8 = r8.f143325i
            r7.append(r8)
            java.lang.String r8 = ", featureLabel: "
            r7.append(r8)
            java.util.LinkedList<te3.f93> r8 = r2.f39445n
            int r8 = r8.size()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r6 = r5.mo62446e(r3)
            bl3.c r6 = r6.mo62447c(r0)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11871f2()
            pl1.n0 r7 = new pl1.n0
            java.lang.String r8 = r2.f39442h
            up1.y r10 = up1.C27696y.THUMB_IMAGE
            r7.<init>(r8, r10)
            r8 = 2131313690(0x7f09441a, float:1.8245784E38)
            android.view.View r8 = r1.mo85812D(r8)
            java.lang.String r10 = "holder.getView(R.id.sku_img)"
            gy3.C87412m.m108593f(r8, r10)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            pl1.e0$a r10 = pl1.C11978e0.C11979a.LIVE_SHOPPING_DEFAULT
            bl3.r$a r3 = r5.mo62446e(r3)
            bl3.c r0 = r3.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r10)
            r6.mo85957c(r7, r8, r0)
            rn1.a r0 = rn1.C13091a.f37264a
            r0 = 2131313687(0x7f094417, float:1.8245778E38)
            android.view.View r0 = r1.mo85812D(r0)
            java.lang.String r3 = "holder.getView(R.id.sku_delivery_tv)"
            gy3.C87412m.m108593f(r0, r3)
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.util.LinkedList<te3.h93> r0 = r2.f39446o
            boolean r5 = r0.isEmpty()
            r6 = 8
            java.lang.String r7 = ""
            r8 = 0
            r10 = 1
            if (r5 != 0) goto L_0x01b0
            java.lang.Object r5 = sx3.C110818d0.m150916N(r0)
            te3.h93 r5 = (te3.C49677h93) r5
            if (r5 == 0) goto L_0x0124
            java.lang.String r5 = r5.f134516d
            goto L_0x0125
        L_0x0124:
            r5 = r9
        L_0x0125:
            if (r5 == 0) goto L_0x0130
            int r5 = r5.length()
            if (r5 != 0) goto L_0x012e
            goto L_0x0130
        L_0x012e:
            r5 = 0
            goto L_0x0131
        L_0x0130:
            r5 = 1
        L_0x0131:
            if (r5 == 0) goto L_0x0135
            goto L_0x01b0
        L_0x0135:
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            r5 = r0
            te3.h93 r5 = (te3.C49677h93) r5
            if (r5 == 0) goto L_0x0143
            java.lang.String r0 = r5.f134516d
            if (r0 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r0 = r7
        L_0x0144:
            r3.setText(r0)
            r3.setVisibility(r8)
            if (r5 == 0) goto L_0x014f
            java.lang.String r0 = r5.f134517e
            goto L_0x0150
        L_0x014f:
            r0 = r9
        L_0x0150:
            if (r0 == 0) goto L_0x015b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r0 = 0
            goto L_0x015c
        L_0x015b:
            r0 = 1
        L_0x015c:
            r11 = 2131101164(0x7f0605ec, float:1.781473E38)
            if (r0 != 0) goto L_0x01a0
            if (r5 == 0) goto L_0x0168
            java.lang.String r0 = r5.f134517e     // Catch:{ Exception -> 0x0166 }
            goto L_0x0169
        L_0x0166:
            r0 = move-exception
            goto L_0x0171
        L_0x0168:
            r0 = r9
        L_0x0169:
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x0166 }
            r3.setTextColor(r0)     // Catch:{ Exception -> 0x0166 }
            goto L_0x01b6
        L_0x0171:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r0)
            java.lang.String r0 = ",server textColor:"
            r12.append(r0)
            if (r5 == 0) goto L_0x0183
            java.lang.String r0 = r5.f134517e
            goto L_0x0184
        L_0x0183:
            r0 = r9
        L_0x0184:
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            java.lang.String r5 = "FinderLiveOrderUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r11)
            r3.setTextColor(r0)
            goto L_0x01b6
        L_0x01a0:
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r11)
            r3.setTextColor(r0)
            goto L_0x01b6
        L_0x01b0:
            r3.setText(r7)
            r3.setVisibility(r6)
        L_0x01b6:
            r0 = 2131313691(0x7f09441b, float:1.8245786E38)
            android.view.View r3 = r1.mo85812D(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.util.LinkedList<te3.h93> r5 = r2.f39446o
            java.lang.String r11 = "item.deliveryInfo"
            gy3.C87412m.m108593f(r5, r11)
            java.lang.Object r5 = sx3.C110818d0.m150916N(r5)
            te3.h93 r5 = (te3.C49677h93) r5
            if (r5 == 0) goto L_0x01d0
            java.lang.String r9 = r5.f134516d
        L_0x01d0:
            if (r9 == 0) goto L_0x01db
            int r5 = r9.length()
            if (r5 != 0) goto L_0x01d9
            goto L_0x01db
        L_0x01d9:
            r5 = 0
            goto L_0x01dc
        L_0x01db:
            r5 = 1
        L_0x01dc:
            r9 = 2
            if (r5 == 0) goto L_0x01e9
            java.util.LinkedList<te3.f93> r5 = r2.f39445n
            int r5 = r5.size()
            if (r5 > 0) goto L_0x01e9
            r5 = 2
            goto L_0x01ea
        L_0x01e9:
            r5 = 1
        L_0x01ea:
            r3.setMaxLines(r5)
            rn1.a r3 = rn1.C13091a.f37264a
            android.view.View r0 = r1.mo85812D(r0)
            java.lang.String r5 = "holder.getView(R.id.sku_name_tv)"
            gy3.C87412m.m108593f(r0, r5)
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.String r13 = r2.f39443i
            java.util.LinkedList<te3.f93> r14 = r2.f39444j
            java.lang.String r0 = "item.headLabel"
            gy3.C87412m.m108593f(r14, r0)
            android.content.Context r0 = r1.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r15 = r0.getDimensionPixelOffset(r5)
            a14.n0 r0 = r1.f29679z
            r11 = r3
            r16 = r0
            r11.mo12596d(r12, r13, r14, r15, r16)
            r0 = 2131313688(0x7f094418, float:1.824578E38)
            android.view.View r0 = r1.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r11 = r2.f39447p
            int r11 = r11.length()
            if (r11 != 0) goto L_0x022c
            r11 = 1
            goto L_0x022d
        L_0x022c:
            r11 = 0
        L_0x022d:
            if (r11 == 0) goto L_0x0233
            r0.setVisibility(r6)
            goto L_0x0236
        L_0x0233:
            r0.setVisibility(r8)
        L_0x0236:
            java.lang.String r11 = r2.f39447p
            r0.setText(r11)
            java.util.LinkedList<te3.f93> r0 = r2.f39445n
            int r0 = r0.size()
            r11 = 2131313689(0x7f094419, float:1.8245782E38)
            if (r0 <= 0) goto L_0x0277
            android.view.View r0 = r1.mo85812D(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r8)
            android.view.View r0 = r1.mo85812D(r11)
            java.lang.String r6 = "holder.getView(R.id.sku_guarantee_tv)"
            gy3.C87412m.m108593f(r0, r6)
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.util.LinkedList<te3.f93> r14 = r2.f39445n
            java.lang.String r0 = "item.featureList"
            gy3.C87412m.m108593f(r14, r0)
            android.content.Context r0 = r1.f173499A
            android.content.res.Resources r0 = r0.getResources()
            int r15 = r0.getDimensionPixelOffset(r5)
            a14.n0 r0 = r1.f29679z
            java.lang.String r13 = "1"
            r11 = r3
            r16 = r0
            r11.mo12596d(r12, r13, r14, r15, r16)
            goto L_0x0280
        L_0x0277:
            android.view.View r0 = r1.mo85812D(r11)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r6)
        L_0x0280:
            int r0 = r2.f39440f
            r3 = 2131313692(0x7f09441c, float:1.8245788E38)
            if (r0 == 0) goto L_0x02c6
            r5 = 2131827017(0x7f111949, float:1.9286935E38)
            if (r0 == r10) goto L_0x02a9
            android.view.View r0 = r1.mo85812D(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r3 = r1.f173499A
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r9 = r2.f39449r
            r6[r8] = r9
            java.lang.String r8 = r2.f39441g
            if (r8 != 0) goto L_0x029f
            r8 = r7
        L_0x029f:
            r6[r10] = r8
            java.lang.String r3 = r3.getString(r5, r6)
            r0.setText(r3)
            goto L_0x02e3
        L_0x02a9:
            android.view.View r0 = r1.mo85812D(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r3 = r1.f173499A
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r9 = r2.f39449r
            r6[r8] = r9
            java.lang.String r8 = r2.f39441g
            if (r8 != 0) goto L_0x02bc
            r8 = r7
        L_0x02bc:
            r6[r10] = r8
            java.lang.String r3 = r3.getString(r5, r6)
            r0.setText(r3)
            goto L_0x02e3
        L_0x02c6:
            android.view.View r0 = r1.mo85812D(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r5 = 65509(0xffe5, float:9.1798E-41)
            r3.append(r5)
            java.lang.String r5 = r2.f39448q
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.setText(r3)
        L_0x02e3:
            r0 = 2131313686(0x7f094416, float:1.8245776E38)
            android.view.View r0 = r1.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r5 = 120(0x78, float:1.68E-43)
            r3.append(r5)
            int r5 = r2.f39450s
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.setText(r3)
            r0 = 2131313693(0x7f09441d, float:1.824579E38)
            android.view.View r0 = r1.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            te3.v54 r1 = r2.f39438d
            java.lang.String r1 = r1.f143325i
            if (r1 == 0) goto L_0x0312
            r7 = r1
        L_0x0312:
            r0.setText(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wn1.C15567p.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.jmv);
        C58739j4 j4Var = C58739j4.f168176a;
        C87412m.m108593f(textView, "priceTv");
        j4Var.mo83705d0(textView);
        oVar.f44854d.setOnClickListener((View.OnClickListener) null);
        oVar.f44854d.setClickable(false);
    }
}
