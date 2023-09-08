package uz0;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.widget.CardTagTextView;
import com.tencent.p014mm.plugin.card.widget.MemberCardTopCropImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C22502jn;
import te3.C49871in;
import wz0.C22945n;

/* renamed from: uz0.g */
public final class C22676g extends RecyclerView.C16613e<C22677a> {

    /* renamed from: d */
    public final boolean f65211d;

    /* renamed from: e */
    public ArrayList<C22668a> f65212e;

    /* renamed from: uz0.g$a */
    public static final class C22677a extends RecyclerView.C16631z {

        /* renamed from: A */
        public int f65213A;

        /* renamed from: B */
        public TextView f65214B;

        /* renamed from: C */
        public TextView f65215C;

        /* renamed from: D */
        public LinearLayout f65216D;

        /* renamed from: E */
        public LinearLayout f65217E;

        /* renamed from: F */
        public ImageView f65218F;

        /* renamed from: G */
        public MemberCardTopCropImageView f65219G;

        /* renamed from: H */
        public ImageView f65220H;

        /* renamed from: z */
        public int f65221z;

        /* renamed from: uz0.g$a$a */
        public static final class C22678a extends C87413o implements C32224a<TextView> {

            /* renamed from: d */
            public final /* synthetic */ Context f65222d;

            /* renamed from: e */
            public final /* synthetic */ int f65223e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C22678a(Context context, int i) {
                super(0);
                this.f65222d = context;
                this.f65223e = i;
            }

            public Object invoke() {
                TextView textView = new TextView(this.f65222d);
                textView.setGravity(17);
                int i = this.f65223e;
                if (i == 1 || i == 5) {
                    textView.setTextColor(C76577a.m92153d(this.f65222d, C0966R.color.FG_1));
                } else {
                    textView.setTextColor(-1);
                }
                return textView;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22677a(View view, int i) {
            super(view);
            C87412m.m108594g(view, "itemView");
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3 || i == 4) {
                        View findViewById = view.findViewById(C0966R.C0970id.bcd);
                        C87412m.m108593f(findViewById, "itemView.findViewById(R.id.chpiv3_title_tv)");
                        this.f65214B = (TextView) findViewById;
                        View findViewById2 = view.findViewById(C0966R.C0970id.bc8);
                        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.chpiv3_desc_tv)");
                        this.f65215C = (TextView) findViewById2;
                        View findViewById3 = view.findViewById(C0966R.C0970id.bcb);
                        C87412m.m108593f(findViewById3, "itemView.findViewById(R.…iv3_right_subtext_layout)");
                        this.f65216D = (LinearLayout) findViewById3;
                        View findViewById4 = view.findViewById(C0966R.C0970id.bbe);
                        C87412m.m108593f(findViewById4, "itemView.findViewById(R.….chpc_rignt_label_layout)");
                        this.f65217E = (LinearLayout) findViewById4;
                        View findViewById5 = view.findViewById(C0966R.C0970id.bc7);
                        C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.chpiv3_card_bg_iv)");
                        this.f65219G = (MemberCardTopCropImageView) findViewById5;
                        View findViewById6 = view.findViewById(C0966R.C0970id.bc6);
                        C87412m.m108593f(findViewById6, "itemView.findViewById(R.id.chpiv3_bg_shadow_iv)");
                        this.f65220H = (ImageView) findViewById6;
                        View findViewById7 = view.findViewById(C0966R.C0970id.bc9);
                        C87412m.m108593f(findViewById7, "itemView.findViewById(R.id.chpiv3_icon_iv)");
                        this.f65218F = (ImageView) findViewById7;
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                View findViewById8 = view.findViewById(C0966R.C0970id.bcd);
                C87412m.m108593f(findViewById8, "itemView.findViewById(R.id.chpiv3_title_tv)");
                this.f65214B = (TextView) findViewById8;
                View findViewById9 = view.findViewById(C0966R.C0970id.bc8);
                C87412m.m108593f(findViewById9, "itemView.findViewById(R.id.chpiv3_desc_tv)");
                this.f65215C = (TextView) findViewById9;
                View findViewById10 = view.findViewById(C0966R.C0970id.bcb);
                C87412m.m108593f(findViewById10, "itemView.findViewById(R.…iv3_right_subtext_layout)");
                this.f65216D = (LinearLayout) findViewById10;
                View findViewById11 = view.findViewById(C0966R.C0970id.bbe);
                C87412m.m108593f(findViewById11, "itemView.findViewById(R.….chpc_rignt_label_layout)");
                this.f65217E = (LinearLayout) findViewById11;
                View findViewById12 = view.findViewById(C0966R.C0970id.bc9);
                C87412m.m108593f(findViewById12, "itemView.findViewById(R.id.chpiv3_icon_iv)");
                this.f65218F = (ImageView) findViewById12;
                return;
            }
            View findViewById13 = view.findViewById(C0966R.C0970id.avm);
            C87412m.m108593f(findViewById13, "itemView.findViewById(R.id.card_list_header_text)");
            this.f65214B = (TextView) findViewById13;
        }

        /* renamed from: y */
        public final void mo35788y(List<? extends C49871in> list, LinearLayout linearLayout) {
            if (!(list == null || list.isEmpty())) {
                linearLayout.setVisibility(0);
                Context context = MMApplicationContext.getContext();
                for (C49871in inVar : list) {
                    CardTagTextView cardTagTextView = new CardTagTextView(context);
                    cardTagTextView.setMinHeight(C76577a.m92151b(context, 18));
                    cardTagTextView.setMinWidth(C76577a.m92151b(context, 56));
                    int b = C76577a.m92151b(context, 8);
                    int b2 = C76577a.m92151b(context, 4);
                    cardTagTextView.setPadding(b, b2, b, b2);
                    cardTagTextView.setText(inVar.f135509d);
                    cardTagTextView.setTextSize(1, 10.0f);
                    if (!Util.isNullOrNil(inVar.f135510e)) {
                        cardTagTextView.setTextColor(Color.parseColor(inVar.f135510e));
                    } else {
                        cardTagTextView.setTextColor(-1);
                    }
                    if (!Util.isNullOrNil(inVar.f135511f)) {
                        cardTagTextView.setFillColor(C22945n.m27002b(inVar.f135511f, inVar.f135514i));
                    } else {
                        cardTagTextView.setFillColor(C22945n.m27001a(-16777216, 26));
                    }
                    linearLayout.addView(cardTagTextView);
                }
            }
        }

        /* renamed from: z */
        public final void mo35789z(String str, List<? extends C49871in> list, LinearLayout linearLayout, int i) {
            if (str == null || str.length() == 0) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            }
            linearLayout.setVisibility(0);
            Context context = MMApplicationContext.getContext();
            if (context != null) {
                C22678a aVar = new C22678a(context, i);
                if (list != null) {
                    for (C49871in inVar : list) {
                        String str2 = inVar.f135509d;
                        if (str2 != null) {
                            TextView textView = (TextView) aVar.invoke();
                            textView.setText(str2);
                            textView.setTextSize(1, 12.0f);
                            linearLayout.addView(textView);
                        }
                    }
                }
                if (str != null) {
                    TextView textView2 = (TextView) aVar.invoke();
                    textView2.setText(str);
                    textView2.setTextSize(1, 10.0f);
                    linearLayout.addView(textView2);
                }
            }
        }
    }

    public C22676g(boolean z) {
        this.f65211d = z;
    }

    /* renamed from: F4 */
    public final C22668a mo35787F4(int i) {
        ArrayList<C22668a> arrayList = this.f65212e;
        if (arrayList == null) {
            return null;
        }
        boolean z = false;
        if (i >= 0 && i < arrayList.size()) {
            z = true;
        }
        if (z) {
            return arrayList.get(i);
        }
        return null;
    }

    public int getItemCount() {
        ArrayList<C22668a> arrayList = this.f65212e;
        if (arrayList != null) {
            return 0 + arrayList.size();
        }
        return 0;
    }

    public long getItemId(int i) {
        C22668a F4 = mo35787F4(i);
        if (F4 != null) {
            String str = F4.f65200b;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            C22502jn jnVar = F4.f65201c;
            String str3 = jnVar != null ? jnVar.f64049d : null;
            if (str3 != null) {
                str2 = str3;
            }
            String str4 = str + str2;
            if (str4 == null || str4.length() == 0) {
                return (long) F4.hashCode();
            }
            return (long) (str4 + i).hashCode();
        }
        Log.m105920e("MicroMsg.CouponAndGiftCardListAdapter", "[getItemId] position=" + i + " itemCount=" + getItemCount() + " }");
        return 0;
    }

    public int getItemViewType(int i) {
        C22668a F4 = mo35787F4(i);
        if (F4 != null) {
            return F4.f65199a;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r3 != 5) goto L_0x028a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            uz0.g$a r1 = (uz0.C22676g.C22677a) r1
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r1, r2)
            r2 = r27
            uz0.a r2 = r0.mo35787F4(r2)
            if (r2 == 0) goto L_0x02d9
            int r3 = r2.f65199a
            java.lang.String r4 = "titleTv"
            r6 = 0
            if (r3 == 0) goto L_0x0281
            r7 = 48
            java.lang.String r8 = "roundCornerIv"
            java.lang.String r9 = "subTextLayout"
            java.lang.String r10 = "labelLayout"
            java.lang.String r11 = "descTv"
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            r14 = 1
            if (r3 == r14) goto L_0x018a
            r15 = 2
            if (r3 == r15) goto L_0x003b
            r5 = 3
            if (r3 == r5) goto L_0x003b
            r5 = 4
            if (r3 == r5) goto L_0x003b
            r5 = 5
            if (r3 == r5) goto L_0x018a
            goto L_0x028a
        L_0x003b:
            te3.jn r2 = r2.f65201c
            if (r2 != 0) goto L_0x0041
            goto L_0x028a
        L_0x0041:
            java.lang.String r5 = r2.f64059q
            if (r5 == 0) goto L_0x004e
            int r5 = r5.length()
            if (r5 != 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r5 = 0
            goto L_0x004f
        L_0x004e:
            r5 = 1
        L_0x004f:
            if (r5 != 0) goto L_0x0065
            android.widget.TextView r5 = r1.f65214B
            if (r5 == 0) goto L_0x0061
            java.lang.String r14 = r2.f64059q
            int r13 = r2.f64060r
            int r13 = wz0.C22945n.m27002b(r14, r13)
            r5.setTextColor(r13)
            goto L_0x0065
        L_0x0061:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x0065:
            android.widget.TextView r5 = r1.f65214B
            if (r5 == 0) goto L_0x0186
            java.lang.String r13 = r2.f64050e
            r5.setText(r13)
            android.widget.TextView r5 = r1.f65214B
            if (r5 == 0) goto L_0x0182
            android.text.TextPaint r4 = r5.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r12)
            android.widget.TextView r4 = r1.f65215C
            if (r4 == 0) goto L_0x017e
            java.lang.String r5 = r2.f64051f
            r4.setText(r5)
            java.lang.String r4 = r2.f64063u
            if (r4 == 0) goto L_0x008f
            int r4 = r4.length()
            if (r4 != 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r14 = 0
            goto L_0x0090
        L_0x008f:
            r14 = 1
        L_0x0090:
            if (r14 != 0) goto L_0x00c6
            android.widget.ImageView r4 = r1.f65218F
            if (r4 == 0) goto L_0x00c2
            android.content.Context r4 = r4.getContext()
            int r22 = kg3.C76577a.m92151b(r4, r7)
            android.widget.ImageView r4 = r1.f65218F
            if (r4 == 0) goto L_0x00be
            java.lang.String r5 = r2.f64063u
            java.lang.String r7 = "element.card_icon_url"
            gy3.C87412m.m108593f(r5, r7)
            r18 = 0
            r19 = 0
            r20 = 2131755320(0x7f100138, float:1.9141516E38)
            r23 = 12
            r24 = 0
            r16 = r4
            r17 = r5
            r21 = r22
            wz0.C102526o.m135343c(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x00c6
        L_0x00be:
            gy3.C87412m.m108603p(r8)
            throw r6
        L_0x00c2:
            gy3.C87412m.m108603p(r8)
            throw r6
        L_0x00c6:
            if (r3 != r15) goto L_0x00ee
            android.widget.LinearLayout r3 = r1.f65217E
            if (r3 == 0) goto L_0x00ea
            r3.removeAllViews()
            android.widget.LinearLayout r3 = r1.f65216D
            if (r3 == 0) goto L_0x00e6
            r4 = 8
            r3.setVisibility(r4)
            java.util.LinkedList<te3.in> r3 = r2.f64055j
            android.widget.LinearLayout r4 = r1.f65217E
            if (r4 == 0) goto L_0x00e2
            r1.mo35788y(r3, r4)
            goto L_0x0109
        L_0x00e2:
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x00e6:
            gy3.C87412m.m108603p(r9)
            throw r6
        L_0x00ea:
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x00ee:
            android.widget.LinearLayout r4 = r1.f65216D
            if (r4 == 0) goto L_0x017a
            r4.removeAllViews()
            android.widget.LinearLayout r4 = r1.f65217E
            if (r4 == 0) goto L_0x0176
            r5 = 8
            r4.setVisibility(r5)
            java.lang.String r4 = r2.f64068z
            java.util.LinkedList<te3.in> r5 = r2.f64055j
            android.widget.LinearLayout r7 = r1.f65216D
            if (r7 == 0) goto L_0x0172
            r1.mo35789z(r4, r5, r7, r3)
        L_0x0109:
            com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView r3 = r1.f65219G
            java.lang.String r4 = "bgIv"
            if (r3 == 0) goto L_0x016e
            java.lang.Object r3 = r3.getTag()
            java.lang.String r5 = r2.f64049d
            if (r5 != 0) goto L_0x0119
            java.lang.String r5 = ""
        L_0x0119:
            boolean r7 = r3 instanceof java.lang.String
            if (r7 == 0) goto L_0x012e
            r7 = r3
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x012e
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x012e
            goto L_0x028a
        L_0x012e:
            com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView r3 = r1.f65219G
            if (r3 == 0) goto L_0x016a
            r3.setTag(r5)
            uz0.f r3 = new uz0.f
            r3.<init>(r1, r2)
            int r2 = r1.f65221z
            if (r2 <= 0) goto L_0x0142
            int r2 = r1.f65213A
            if (r2 > 0) goto L_0x0159
        L_0x0142:
            android.view.View r2 = r1.f44854d
            int r2 = r2.getHeight()
            r1.f65221z = r2
            android.view.View r2 = r1.f44854d
            int r2 = r2.getWidth()
            r1.f65213A = r2
            int r4 = r1.f65221z
            if (r4 <= 0) goto L_0x015e
            if (r2 > 0) goto L_0x0159
            goto L_0x015e
        L_0x0159:
            r3.invoke()
            goto L_0x028a
        L_0x015e:
            android.view.View r2 = r1.f44854d
            uz0.e r4 = new uz0.e
            r4.<init>(r1, r3)
            r2.post(r4)
            goto L_0x028a
        L_0x016a:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x016e:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x0172:
            gy3.C87412m.m108603p(r9)
            throw r6
        L_0x0176:
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x017a:
            gy3.C87412m.m108603p(r9)
            throw r6
        L_0x017e:
            gy3.C87412m.m108603p(r11)
            throw r6
        L_0x0182:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x0186:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x018a:
            te3.jn r2 = r2.f65201c
            if (r2 == 0) goto L_0x028a
            android.widget.TextView r5 = r1.f65214B
            if (r5 == 0) goto L_0x027d
            java.lang.String r13 = r2.f64050e
            r5.setText(r13)
            android.widget.TextView r5 = r1.f65214B
            if (r5 == 0) goto L_0x0279
            android.text.TextPaint r5 = r5.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r5, r12)
            android.widget.TextView r5 = r1.f65215C
            if (r5 == 0) goto L_0x0275
            java.lang.String r12 = r2.f64051f
            r5.setText(r12)
            java.lang.String r5 = r2.f64059q
            if (r5 == 0) goto L_0x01b8
            int r5 = r5.length()
            if (r5 != 0) goto L_0x01b6
            goto L_0x01b8
        L_0x01b6:
            r5 = 0
            goto L_0x01b9
        L_0x01b8:
            r5 = 1
        L_0x01b9:
            if (r5 != 0) goto L_0x01cf
            android.widget.TextView r5 = r1.f65214B
            if (r5 == 0) goto L_0x01cb
            java.lang.String r4 = r2.f64059q
            int r12 = r2.f64060r
            int r4 = wz0.C22945n.m27002b(r4, r12)
            r5.setTextColor(r4)
            goto L_0x01cf
        L_0x01cb:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x01cf:
            java.lang.String r4 = r2.f64061s
            if (r4 == 0) goto L_0x01dc
            int r4 = r4.length()
            if (r4 != 0) goto L_0x01da
            goto L_0x01dc
        L_0x01da:
            r4 = 0
            goto L_0x01dd
        L_0x01dc:
            r4 = 1
        L_0x01dd:
            if (r4 != 0) goto L_0x01f3
            android.widget.TextView r4 = r1.f65215C
            if (r4 == 0) goto L_0x01ef
            java.lang.String r5 = r2.f64061s
            int r11 = r2.f64062t
            int r5 = wz0.C22945n.m27002b(r5, r11)
            r4.setTextColor(r5)
            goto L_0x01f3
        L_0x01ef:
            gy3.C87412m.m108603p(r11)
            throw r6
        L_0x01f3:
            java.lang.String r4 = r2.f64063u
            if (r4 == 0) goto L_0x0224
            android.widget.ImageView r5 = r1.f65218F
            if (r5 == 0) goto L_0x0220
            android.content.Context r5 = r5.getContext()
            int r22 = kg3.C76577a.m92151b(r5, r7)
            android.widget.ImageView r5 = r1.f65218F
            if (r5 == 0) goto L_0x021c
            r18 = 0
            r19 = 0
            r20 = 2131755320(0x7f100138, float:1.9141516E38)
            r23 = 12
            r24 = 0
            r16 = r5
            r17 = r4
            r21 = r22
            wz0.C102526o.m135343c(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0224
        L_0x021c:
            gy3.C87412m.m108603p(r8)
            throw r6
        L_0x0220:
            gy3.C87412m.m108603p(r8)
            throw r6
        L_0x0224:
            r4 = 1
            if (r3 != r4) goto L_0x024d
            android.widget.LinearLayout r3 = r1.f65217E
            if (r3 == 0) goto L_0x0249
            r3.removeAllViews()
            android.widget.LinearLayout r3 = r1.f65216D
            if (r3 == 0) goto L_0x0245
            r4 = 8
            r3.setVisibility(r4)
            java.util.LinkedList<te3.in> r2 = r2.f64055j
            android.widget.LinearLayout r3 = r1.f65217E
            if (r3 == 0) goto L_0x0241
            r1.mo35788y(r2, r3)
            goto L_0x028a
        L_0x0241:
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x0245:
            gy3.C87412m.m108603p(r9)
            throw r6
        L_0x0249:
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x024d:
            android.widget.LinearLayout r4 = r1.f65216D
            if (r4 == 0) goto L_0x0271
            r4.removeAllViews()
            android.widget.LinearLayout r4 = r1.f65217E
            if (r4 == 0) goto L_0x026d
            r5 = 8
            r4.setVisibility(r5)
            java.lang.String r4 = r2.f64068z
            java.util.LinkedList<te3.in> r2 = r2.f64055j
            android.widget.LinearLayout r5 = r1.f65216D
            if (r5 == 0) goto L_0x0269
            r1.mo35789z(r4, r2, r5, r3)
            goto L_0x028a
        L_0x0269:
            gy3.C87412m.m108603p(r9)
            throw r6
        L_0x026d:
            gy3.C87412m.m108603p(r10)
            throw r6
        L_0x0271:
            gy3.C87412m.m108603p(r9)
            throw r6
        L_0x0275:
            gy3.C87412m.m108603p(r11)
            throw r6
        L_0x0279:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x027d:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x0281:
            android.widget.TextView r3 = r1.f65214B
            if (r3 == 0) goto L_0x02d5
            java.lang.String r2 = r2.f65200b
            r3.setText(r2)
        L_0x028a:
            boolean r2 = r0.f65211d
            if (r2 == 0) goto L_0x02d9
            android.view.View r1 = r1.f44854d
            r2 = 1058642330(0x3f19999a, float:0.6)
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r11.mo10233c(r2)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter"
            java.lang.String r6 = "onBindViewHolder"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter$CardTicketVH;I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            java.lang.Object r2 = r11.mo10231a(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.setAlpha(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter"
            java.lang.String r5 = "onBindViewHolder"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter$CardTicketVH;I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r9 = "(F)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x02d9
        L_0x02d5:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x02d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uz0.C22676g.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        int i2 = C0966R.C0971layout.f6719mo;
        if (i == 0) {
            i2 = C0966R.C0971layout.f6788oj;
        } else if (i == 1 || !(i == 2 || i == 3 || i == 4 || i != 5)) {
            i2 = C0966R.C0971layout.f6702m8;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        if (this.f65211d) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.6f));
            View view = inflate;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter$CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v4/CardsAndOffersAdapter$CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        C87412m.m108593f(inflate, "itemView");
        return new C22677a(inflate, i);
    }
}
