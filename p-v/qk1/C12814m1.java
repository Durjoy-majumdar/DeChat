package qk1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cj1.C0639y1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftPreviewView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import eb0.C31543z5;
import gg1.C32444a;
import gy3.C8477a0;
import gy3.C87412m;
import ht1.C60200t1;
import ig1.C8916d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import l31.C10460a;
import l60.C99342a;
import ok1.C62042e;
import pl1.C11984n0;
import pl1.C11990s0;
import qj1.C12282d7;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C90364q0;
import te3.C51548uh3;
import up1.C27696y;
import yh1.C16011a;

/* renamed from: qk1.m1 */
public final class C12814m1 extends RecyclerView.C16613e<C12815a> {

    /* renamed from: i */
    public static float f36675i;

    /* renamed from: d */
    public final Context f36676d;

    /* renamed from: e */
    public final WxRecyclerView f36677e;

    /* renamed from: f */
    public boolean f36678f;

    /* renamed from: g */
    public final ArrayList<C8916d> f36679g = new ArrayList<>();

    /* renamed from: h */
    public C16011a f36680h;

    /* renamed from: qk1.m1$a */
    public static final class C12815a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f36681A;

        /* renamed from: B */
        public final TextView f36682B;

        /* renamed from: C */
        public final View f36683C;

        /* renamed from: D */
        public final WeImageView f36684D;

        /* renamed from: E */
        public final TextView f36685E;

        /* renamed from: F */
        public final TextView f36686F;

        /* renamed from: G */
        public final WeImageView f36687G;

        /* renamed from: H */
        public final View f36688H;

        /* renamed from: I */
        public final FinderLiveGiftPreviewView f36689I;

        /* renamed from: J */
        public final TextView f36690J;

        /* renamed from: z */
        public final View f36691z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0205  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C12815a(android.view.View r18) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                java.lang.String r2 = "FinderLiveGiftGridAdapter"
                java.lang.String r3 = "mItemView"
                gy3.C87412m.m108594g(r0, r3)
                r17.<init>(r18)
                r1.f36691z = r0
                r3 = 2131303657(0x7f091ce9, float:1.8225435E38)
                android.view.View r3 = r0.findViewById(r3)
                java.lang.String r4 = "mItemView.findViewById(R…d.finder_live_gift_thumb)"
                gy3.C87412m.m108593f(r3, r4)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r1.f36681A = r3
                r3 = 2131303564(0x7f091c8c, float:1.8225246E38)
                android.view.View r3 = r0.findViewById(r3)
                java.lang.String r4 = "mItemView.findViewById(R.id.finder_live_gift_name)"
                gy3.C87412m.m108593f(r3, r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r1.f36682B = r3
                r4 = 2131303632(0x7f091cd0, float:1.8225384E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "mItemView.findViewById(R…er_live_gift_price_group)"
                gy3.C87412m.m108593f(r4, r5)
                r1.f36683C = r4
                r4 = 2131303633(0x7f091cd1, float:1.8225386E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "mItemView.findViewById(R…der_live_gift_price_icon)"
                gy3.C87412m.m108593f(r4, r5)
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
                r1.f36684D = r4
                r4 = 2131303635(0x7f091cd3, float:1.822539E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "mItemView.findViewById(R…inder_live_gift_price_tv)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r1.f36685E = r4
                r4 = 2131303648(0x7f091ce0, float:1.8225416E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "mItemView.findViewById(R.id.finder_live_gift_tag)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r1.f36686F = r4
                r4 = 2131303650(0x7f091ce2, float:1.822542E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "mItemView.findViewById(R…inder_live_gift_tag_icon)"
                gy3.C87412m.m108593f(r4, r5)
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
                r1.f36687G = r4
                r4 = 2131303649(0x7f091ce1, float:1.8225418E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "mItemView.findViewById(R…nder_live_gift_tag_group)"
                gy3.C87412m.m108593f(r4, r5)
                r1.f36688H = r4
                r4 = 2131303630(0x7f091cce, float:1.822538E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "mItemView.findViewById(R…r_live_gift_preview_view)"
                gy3.C87412m.m108593f(r4, r5)
                com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView r4 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftPreviewView) r4
                r1.f36689I = r4
                r4 = 2131304090(0x7f091e9a, float:1.8226313E38)
                android.view.View r4 = r0.findViewById(r4)
                java.lang.String r5 = "mItemView.findViewById(R…der_live_pkg_gift_cnt_tv)"
                gy3.C87412m.m108593f(r4, r5)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r1.f36690J = r4
                float r4 = qk1.C12814m1.f36675i
                r5 = 1
                r6 = 1094713344(0x41400000, float:12.0)
                r7 = 0
                java.lang.String r8 = "mItemView.context"
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 > 0) goto L_0x024b
                int r4 = r18.getMeasuredWidth()
                android.content.Context r9 = r18.getContext()
                android.content.res.Resources r9 = r9.getResources()
                r10 = 2131165279(0x7f07005f, float:1.794477E38)
                int r9 = r9.getDimensionPixelOffset(r10)
                int r4 = r4 - r9
                if (r4 > 0) goto L_0x00ea
                android.content.Context r4 = r18.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r9 = 2131165284(0x7f070064, float:1.794478E38)
                int r4 = r4.getDimensionPixelOffset(r9)
                android.content.Context r9 = r18.getContext()
                android.content.res.Resources r9 = r9.getResources()
                int r9 = r9.getDimensionPixelOffset(r10)
                int r4 = r4 - r9
            L_0x00ea:
                java.util.LinkedList r9 = new java.util.LinkedList
                r9.<init>()
                android.content.Context r10 = r18.getContext()
                gy3.C87412m.m108593f(r10, r8)
                float r10 = kg3.C76577a.m92167r(r10)
                java.lang.Float r10 = java.lang.Float.valueOf(r10)
                r9.add(r10)
                android.content.Context r10 = r18.getContext()
                float r10 = kg3.C76577a.m92171v(r10)
                java.lang.Float r10 = java.lang.Float.valueOf(r10)
                r9.add(r10)
                android.content.Context r0 = r18.getContext()
                kg3.C76577a.m92172w(r0)
                r10 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r0 = java.lang.Float.valueOf(r10)
                r9.add(r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                java.lang.String r0 = "梦幻城堡"
                java.lang.CharSequence r11 = r3.getText()
                float r12 = r3.getTextSize()
                r13 = 0
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                r14.<init>()     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.String r15 = "findMaxScaleTextSize origTextStr:"
                r14.append(r15)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                r14.append(r11)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.String r15 = ",origTextSizePixel:"
                r14.append(r15)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                r14.append(r12)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.String r15 = ",maxWidthPx:"
                r14.append(r15)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                r14.append(r4)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.String r15 = ",baseTextSizeDp:"
                r14.append(r15)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                r14.append(r6)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.String r15 = ",decrementScales:"
                r14.append(r15)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                r14.append(r9)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.String r15 = ",maxLengthStr:"
                r14.append(r15)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                r14.append(r0)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r14)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                boolean r14 = r9.isEmpty()     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                if (r14 == 0) goto L_0x0171
                goto L_0x01ca
            L_0x0171:
                int r14 = r9.size()     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                if (r14 != r5) goto L_0x0182
                java.lang.Object r0 = r9.get(r13)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                float r0 = r0.floatValue()     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                goto L_0x01da
            L_0x0182:
                r3.setText(r0)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.Object r0 = sx3.C110818d0.m150923U(r9)     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                float r14 = r0.floatValue()     // Catch:{ Exception -> 0x01cd, all -> 0x01c9 }
                int r0 = r9.size()     // Catch:{ Exception -> 0x01c7 }
                r15 = 0
            L_0x0194:
                if (r15 >= r0) goto L_0x01d9
                java.lang.Object r16 = r9.get(r15)     // Catch:{ Exception -> 0x01c7 }
                java.lang.Number r16 = (java.lang.Number) r16     // Catch:{ Exception -> 0x01c7 }
                float r16 = r16.floatValue()     // Catch:{ Exception -> 0x01c7 }
                float r10 = r16 * r6
                r3.setTextSize(r5, r10)     // Catch:{ Exception -> 0x01c7 }
                int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)     // Catch:{ Exception -> 0x01c7 }
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)     // Catch:{ Exception -> 0x01c7 }
                r3.measure(r10, r5)     // Catch:{ Exception -> 0x01c7 }
                int r5 = r3.getMeasuredWidth()     // Catch:{ Exception -> 0x01c7 }
                if (r5 > r4) goto L_0x01c1
                java.lang.Object r0 = r9.get(r15)     // Catch:{ Exception -> 0x01c7 }
                java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ Exception -> 0x01c7 }
                float r0 = r0.floatValue()     // Catch:{ Exception -> 0x01c7 }
                goto L_0x01da
            L_0x01c1:
                int r15 = r15 + 1
                r5 = 1
                r10 = 1065353216(0x3f800000, float:1.0)
                goto L_0x0194
            L_0x01c7:
                r0 = move-exception
                goto L_0x01d0
            L_0x01c9:
            L_0x01ca:
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L_0x01da
            L_0x01cd:
                r0 = move-exception
                r14 = 1065353216(0x3f800000, float:1.0)
            L_0x01d0:
                er1.j4 r4 = er1.C58739j4.f168176a     // Catch:{ all -> 0x01d8 }
                java.lang.String r5 = "FinderLiveGiftGridAdapter-findMaxScaleTextSize"
                r4.mo83712h0(r0, r5)     // Catch:{ all -> 0x01d8 }
                goto L_0x01d9
            L_0x01d8:
            L_0x01d9:
                r0 = r14
            L_0x01da:
                r3.setText(r11)
                r3.setTextSize(r13, r12)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "set nickNameMaxScaleSize from "
                r3.append(r4)
                float r5 = qk1.C12814m1.f36675i
                r3.append(r5)
                java.lang.String r5 = " to "
                r3.append(r5)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                qk1.C12814m1.f36675i = r0
                int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r0 > 0) goto L_0x024b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "FinderLiveGiftItemHolder findMaxScaleTextSize err,nickNameMaxScaleSize:"
                r0.append(r3)
                float r3 = qk1.C12814m1.f36675i
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
                android.view.View r0 = r1.f36691z
                android.content.Context r0 = r0.getContext()
                float r0 = kg3.C76577a.m92171v(r0)
                r3 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x022e
                r10 = 1065353216(0x3f800000, float:1.0)
                goto L_0x022f
            L_0x022e:
                r10 = r0
            L_0x022f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                float r3 = qk1.C12814m1.f36675i
                r0.append(r3)
                r0.append(r5)
                r0.append(r10)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                qk1.C12814m1.f36675i = r10
            L_0x024b:
                java.lang.Class<l31.e> r0 = l31.C61212e.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                l31.e r0 = (l31.C61212e) r0
                com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView r2 = r1.f36689I
                java.lang.String r3 = "finder_live_room_gift"
                r0.o30(r2, r3)
                wc1.b r9 = wc1.C15064b.f41199a
                android.view.View r0 = r1.f36691z
                android.content.Context r0 = r0.getContext()
                gy3.C87412m.m108593f(r0, r8)
                android.widget.TextView r2 = r1.f36682B
                float r3 = qk1.C12814m1.f36675i
                if (r2 != 0) goto L_0x026c
                goto L_0x027a
            L_0x026c:
                float r0 = kg3.C76577a.m92165p(r0)
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x027a
                float r6 = r6 * r3
                r3 = 1
                r2.setTextSize(r3, r6)
            L_0x027a:
                android.view.View r0 = r1.f36691z
                android.content.Context r10 = r0.getContext()
                gy3.C87412m.m108593f(r10, r8)
                android.widget.TextView r11 = r1.f36686F
                r12 = 1092616192(0x41200000, float:10.0)
                r13 = 0
                r14 = 8
                r15 = 0
                wc1.C15064b.m14230a(r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qk1.C12814m1.C12815a.<init>(android.view.View):void");
        }
    }

    public C12814m1(Context context, WxRecyclerView wxRecyclerView) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(wxRecyclerView, "gridView");
        this.f36676d = context;
        this.f36677e = wxRecyclerView;
    }

    /* renamed from: F4 */
    public final void mo12350F4(String str, int i) {
        C87412m.m108594g(str, "curGiftId");
        int size = this.f36679g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8916d dVar = this.f36679g.get(i2);
            C87412m.m108593f(dVar, "giftList[i]");
            C8916d dVar2 = dVar;
            RecyclerView.C16631z I0 = this.f36677e.mo17023I0(i2);
            C12815a aVar = I0 instanceof C12815a ? (C12815a) I0 : null;
            if (aVar != null) {
                if (C87412m.m108589b(dVar2.field_rewardProductId, str)) {
                    Log.m105924i("GiftItemPreview", "start show pag animate");
                    ViewGroup.LayoutParams layoutParams = aVar.f36689I.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = aVar.f36691z.getHeight();
                    }
                    aVar.f36689I.mo3280b(str, i);
                    aVar.f36689I.setVisibility(0);
                } else {
                    aVar.f36689I.f15251f.stop();
                    aVar.f36689I.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: G4 */
    public final void mo12351G4(List<C8916d> list, int i, LinkedList<LinkedList<String>> linkedList) {
        T t;
        C87412m.m108594g(list, "giftList");
        C87412m.m108594g(linkedList, "eachPageIndexList");
        int size = list.size();
        Log.m105924i("FinderLiveGiftGridAdapter", "updateGift pageIndex:" + i + ",size:" + size + ",eachPageIndexList:" + linkedList);
        this.f36679g.clear();
        if (linkedList.size() > 1) {
            LinkedList<String> linkedList2 = linkedList.get(i);
            C87412m.m108593f(linkedList2, "eachPageIndexList[pageIndex]");
            for (String str : linkedList2) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C8916d) t).field_rewardProductId, str)) {
                        break;
                    }
                }
                C8916d dVar = (C8916d) t;
                if (dVar != null) {
                    this.f36679g.add(dVar);
                }
            }
            return;
        }
        String str2 = C12282d7.f35384U0;
        int i2 = i * 8;
        int i3 = i2 + 8;
        while (i2 < size && i2 < i3) {
            this.f36679g.add(list.get(i2));
            i2++;
        }
    }

    public int getItemCount() {
        return this.f36679g.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        Object obj;
        int i2;
        String str;
        int i3 = i;
        C12815a aVar = (C12815a) zVar;
        C87412m.m108594g(aVar, "holder");
        Log.m105924i("FinderLiveGiftGridAdapter", "getView position:" + i3 + ", adapter:" + this);
        C8916d dVar = this.f36679g.get(i3);
        C87412m.m108593f(dVar, "giftList[position]");
        C8916d dVar2 = dVar;
        ((C99342a) ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(dVar2.field_thumbnailFileUrl, C27696y.THUMB_IMAGE))).mo85954d(aVar.f36681A);
        aVar.f36685E.setTextSize(1, 12.0f);
        aVar.f36682B.setText(dVar2.field_name);
        float f = dVar2.field_price;
        int i4 = (int) f;
        if (i4 > 0) {
            aVar.f36685E.setText(String.valueOf(i4));
        } else {
            aVar.f36685E.setText(String.valueOf(f));
        }
        LinkedList linkedList = C0639y1.f1518i.get(dVar2.field_rewardProductId);
        C8477a0 a0Var = new C8477a0();
        boolean z = ((Boolean) C32444a.f86059G2.mo60266n()).booleanValue() || C0639y1.f1520k == 1;
        if (!this.f36678f || linkedList == null) {
            C62042e.f176370a.mo87007G1(aVar.f36688H, dVar2);
            aVar.f36690J.setVisibility(8);
        } else {
            int e = C31543z5.m39455e();
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C51548uh3 uh32 = (C51548uh3) obj;
                Iterator it4 = it;
                if (uh32.f142858e > 0 && uh32.f142859f - e > 0) {
                    break;
                }
                it = it4;
            }
            C51548uh3 uh33 = (C51548uh3) obj;
            if (uh33 != null) {
                a0Var.f27482d = uh33.f142861h;
                TextView textView = aVar.f36686F;
                if (z) {
                    str = this.f36676d.getString(C0966R.string.n8o);
                } else {
                    int i5 = (((uh33.f142859f - e) / 60) / 60) / 24;
                    str = i5 > 0 ? this.f36676d.getString(C0966R.string.n8r, new Object[]{Integer.valueOf(i5)}) : this.f36676d.getString(C0966R.string.n8n);
                }
                textView.setText(str);
                if (uh33.f142861h) {
                    View view = aVar.f36691z;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(0.5f));
                    View view2 = view;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$FinderLiveGiftItemHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$FinderLiveGiftItemHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                aVar.f36687G.setVisibility(8);
                View view3 = aVar.f36688H;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$FinderLiveGiftItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$FinderLiveGiftItemHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : linkedList) {
                C51548uh3 uh34 = (C51548uh3) next;
                if (uh34.f142858e > 0 && uh34.f142859f - e > 0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                arrayList2.add(Long.valueOf(((C51548uh3) it5.next()).f142858e));
            }
            Iterator it6 = arrayList2.iterator();
            long j = 0;
            while (it6.hasNext()) {
                j += ((Number) it6.next()).longValue();
            }
            TextView textView2 = aVar.f36690J;
            if (j > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append('x');
                sb.append(j);
                textView2.setText(sb.toString());
                C62042e.f176370a.mo87033P1(aVar.f36690J);
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView2.setVisibility(i2);
        }
        aVar.f36684D.setImageResource(C0966R.raw.coin_icon);
        aVar.f36684D.setIconColor(aVar.f36691z.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
        aVar.f36691z.setOnClickListener(new C12821n1(dVar2, this));
        C62042e eVar = C62042e.f176370a;
        if (!eVar.mo87027N0() && !this.f36678f) {
            aVar.f36691z.setOnLongClickListener(new C12823o1(this, dVar2));
            aVar.f36689I.setOnLongClickListener(new C12828p1(this, dVar2));
        }
        aVar.f36689I.setOnClickListener(new C12831q1(this, z, a0Var, dVar2, aVar));
        aVar.f36691z.setTag(C0966R.C0970id.d4a, aVar.f36682B.getText());
        aVar.f36691z.setTag(C0966R.C0970id.d4b, aVar.f36685E.getText());
        if (dVar2.mo9721l2().size() > 0 && !eVar.mo87027N0()) {
            aVar.f36691z.getViewTreeObserver().addOnPreDrawListener(new C12833r1(aVar, this, dVar2));
        }
        View view5 = aVar.f36691z;
        C10460a.m10392a(view5, "live_gift_thing");
        String str2 = C12282d7.f35384U0;
        int i6 = i3 / 4;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i6 + 1);
        sb4.append('-');
        sb4.append((i3 - (i6 * 4)) + 1);
        C10460a.m10393b(view5, C90364q0.m113148g(new C13604l("gift_id", dVar2.field_rewardProductId), new C13604l("thing_idex", sb4.toString())));
        C10460a.m10394c(view5, 40, 25561);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f36676d).inflate(C0966R.C0971layout.ags, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C12815a(inflate);
    }
}
