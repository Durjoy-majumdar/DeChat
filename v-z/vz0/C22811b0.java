package vz0;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.C18609n0;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import dz0.C20483c;
import hz0.C46153l0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import oz0.C47407b;
import pz0.C47725q;

/* renamed from: vz0.b0 */
public class C22811b0 extends C22821l {

    /* renamed from: b */
    public View f65580b;

    /* renamed from: c */
    public View f65581c;

    /* renamed from: d */
    public ImageView f65582d;

    /* renamed from: e */
    public TextView f65583e;

    /* renamed from: f */
    public TextView f65584f;

    /* renamed from: g */
    public ImageView f65585g;

    /* renamed from: h */
    public View f65586h;

    /* renamed from: i */
    public LinearLayout f65587i;

    /* renamed from: j */
    public MMActivity f65588j;

    /* renamed from: k */
    public View.OnClickListener f65589k = new C22812a();

    /* renamed from: vz0.b0$a */
    public class C22812a implements View.OnClickListener {
        public C22812a() {
        }

        public void onClick(View view) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!(view.getTag() instanceof C47725q)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C18609n0 n0Var = C22811b0.this.f65616a;
            C20483c cVar = ((CardDetailUIContoller) n0Var).f51776E;
            ((CardDetailUIContoller) n0Var).f51800h = false;
            C47725q qVar = (C47725q) view.getTag();
            if (qVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ArrayList<String> arrayList2 = qVar.f128232d;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String str = qVar.f128229a;
            if (str != null && str.equals(cVar.mo23280e())) {
                View view2 = C22811b0.this.f65586h;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((CardDetailUIContoller) C22811b0.this.f65616a).mo23367h();
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (!TextUtils.isEmpty(qVar.f128229a) || !TextUtils.isEmpty(cVar.mo23280e())) {
                ArrayList<C47725q> h = C47407b.m52745h(qVar.f128230b);
                if (h.size() > 0) {
                    z = false;
                    for (int i = 0; i < h.size(); i++) {
                        C47725q qVar2 = h.get(i);
                        String str2 = qVar2.f128229a;
                        if ((str2 == null || !str2.equals(qVar.f128229a)) && (!TextUtils.isEmpty(qVar2.f128229a) || !TextUtils.isEmpty(qVar.f128229a))) {
                            qVar2.f128233e = false;
                            h.set(i, qVar2);
                        } else {
                            qVar2.f128233e = true;
                            if (!qVar2.f128234f) {
                                qVar2.f128234f = true;
                                z = true;
                            }
                            h.set(i, qVar2);
                        }
                    }
                } else {
                    z = false;
                }
                ShareCardInfo jo = C46153l0.Lx0().mo72543jo(qVar.f128232d.get(0));
                if (jo != null) {
                    CardDetailUIContoller cardDetailUIContoller = (CardDetailUIContoller) C22811b0.this.f65616a;
                    cardDetailUIContoller.f51776E = jo;
                    CardDetailUIContoller.C18581j jVar = cardDetailUIContoller.f51790T;
                    if (jVar != null) {
                        CardDetailUI.C18563c cVar2 = (CardDetailUI.C18563c) jVar;
                        CardDetailUI cardDetailUI = CardDetailUI.this;
                        cardDetailUI.f51748f = jo;
                        cardDetailUI.f51749g = jo.getCardId();
                        CardDetailUI cardDetailUI2 = CardDetailUI.this;
                        cardDetailUI2.f51765z.f51824c = cardDetailUI2.f51749g;
                    }
                    cardDetailUIContoller.mo23367h();
                }
                if (z) {
                    C18609n0 n0Var2 = C22811b0.this.f65616a;
                    if (((CardDetailUIContoller) n0Var2).f51790T != null) {
                        CardDetailUI cardDetailUI3 = CardDetailUI.this;
                        int i2 = CardDetailUI.f51728S;
                        cardDetailUI3.getClass();
                    }
                }
                View view4 = C22811b0.this.f65586h;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                View view6 = C22811b0.this.f65586h;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view7 = view6;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((CardDetailUIContoller) C22811b0.this.f65616a).mo23367h();
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: c */
    public void mo35949c() {
        this.f65580b = mo35969b(C0966R.C0970id.jiz);
        this.f65581c = mo35969b(C0966R.C0970id.f359195jj1);
        this.f65582d = (ImageView) mo35969b(C0966R.C0970id.jit);
        this.f65583e = (TextView) mo35969b(C0966R.C0970id.jiu);
        this.f65584f = (TextView) mo35969b(C0966R.C0970id.jiw);
        this.f65585g = (ImageView) mo35969b(C0966R.C0970id.jiv);
        View view = this.f65580b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65586h = mo35969b(C0966R.C0970id.jix);
        this.f65587i = (LinearLayout) mo35969b(C0966R.C0970id.jiy);
        View view2 = this.f65586h;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f65588j = ((CardDetailUIContoller) this.f65616a).f51797e;
    }

    /* renamed from: d */
    public void mo35950d(int i) {
        View view = this.f65580b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x016d  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35951e() {
        /*
            r26 = this;
            r0 = r26
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            java.lang.Class<ln.f> r2 = p196ln.C76705f.class
            com.tencent.mm.plugin.card.ui.n0 r3 = r0.f65616a
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r3 = (com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller) r3
            dz0.c r3 = r3.f51776E
            java.lang.String r4 = r3.mo23270R0()
            java.util.ArrayList r4 = oz0.C47407b.m52745h(r4)
            com.tencent.mm.plugin.card.ui.n0 r5 = r0.f65616a
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = (com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller) r5
            rz0.g r5 = r5.f51798f
            boolean r6 = r5.mo35443q()
            r7 = 2131165591(0x7f070197, float:1.7945403E38)
            r8 = 2131823197(0x7f110a5d, float:1.9279187E38)
            java.lang.String r9 = ""
            r10 = 1
            r11 = 8
            r12 = 0
            if (r6 == 0) goto L_0x0364
            android.view.View r5 = r0.f65580b
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r6.mo10233c(r13)
            java.lang.Object[] r14 = r6.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r16 = "updateShareUsersInfoLayout"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r5
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r6 = r6.mo10231a(r12)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r14 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r15 = "updateShareUsersInfoLayout"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r3 = r3.mo23270R0()
            int r3 = oz0.C47407b.m52742d(r3)
            if (r3 <= r10) goto L_0x0086
            android.view.View r3 = r0.f65581c
            com.tencent.mm.plugin.card.ui.n0 r5 = r0.f65616a
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r5 = (com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller) r5
            android.view.View$OnClickListener r5 = r5.f51794X
            r3.setOnClickListener(r5)
            goto L_0x00d8
        L_0x0086:
            android.widget.ImageView r3 = r0.f65585g
            r3.setVisibility(r11)
            android.view.View r3 = r0.f65586h
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5.mo10233c(r6)
            java.lang.Object[] r14 = r5.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r16 = "updateShareUsersInfoLayout"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r3
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r5.mo10231a(r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r14 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r15 = "updateShareUsersInfoLayout"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.widget.LinearLayout r3 = r0.f65587i
            r3.removeAllViews()
            com.tencent.mm.plugin.card.ui.n0 r3 = r0.f65616a
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r3 = (com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller) r3
            r3.f51800h = r12
        L_0x00d8:
            com.tencent.mm.plugin.card.ui.n0 r3 = r0.f65616a
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r3 = (com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller) r3
            dz0.c r5 = r3.f51776E
            boolean r3 = r3.f51800h
            if (r3 == 0) goto L_0x0109
            android.widget.ImageView r3 = r0.f65582d
            r3.setVisibility(r11)
            android.widget.TextView r3 = r0.f65583e
            r3.setVisibility(r11)
            android.widget.TextView r3 = r0.f65584f
            r3.setVisibility(r12)
            android.widget.ImageView r3 = r0.f65585g
            r5 = 2131231519(0x7f08031f, float:1.8079121E38)
            r3.setImageResource(r5)
            android.widget.TextView r3 = r0.f65584f
            com.tencent.mm.ui.MMActivity r5 = r0.f65588j
            r6 = 2131823192(0x7f110a58, float:1.9279177E38)
            java.lang.String r5 = r5.getString(r6)
            r3.setText(r5)
            goto L_0x019f
        L_0x0109:
            android.widget.ImageView r3 = r0.f65582d
            r3.setVisibility(r12)
            android.widget.TextView r3 = r0.f65583e
            r3.setVisibility(r12)
            android.widget.TextView r3 = r0.f65584f
            r3.setVisibility(r11)
            java.lang.String r3 = r5.mo23270R0()
            int r3 = oz0.C47407b.m52742d(r3)
            if (r3 > r10) goto L_0x0128
            android.widget.ImageView r3 = r0.f65585g
            r3.setVisibility(r11)
            goto L_0x0135
        L_0x0128:
            android.widget.ImageView r3 = r0.f65585g
            r3.setVisibility(r12)
            android.widget.ImageView r3 = r0.f65585g
            r6 = 2131231518(0x7f08031e, float:1.807912E38)
            r3.setImageResource(r6)
        L_0x0135:
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x0152
            r3 = 0
        L_0x013c:
            int r6 = r4.size()
            if (r3 >= r6) goto L_0x0152
            java.lang.Object r6 = r4.get(r3)
            pz0.q r6 = (pz0.C47725q) r6
            boolean r13 = r6.f128233e
            if (r13 == 0) goto L_0x014f
            java.lang.String r3 = r6.f128229a
            goto L_0x0153
        L_0x014f:
            int r3 = r3 + 1
            goto L_0x013c
        L_0x0152:
            r3 = r9
        L_0x0153:
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 == 0) goto L_0x0167
            java.lang.String r6 = r5.mo23280e()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0167
            java.lang.String r3 = r5.mo23280e()
        L_0x0167:
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x019f
            di3.d r5 = di3.C86312j.m106911c(r2)
            ln.f r5 = (p196ln.C76705f) r5
            android.widget.ImageView r6 = r0.f65582d
            r5.mo106849z(r6, r3)
            com.tencent.mm.ui.MMActivity r5 = r0.f65588j
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r3 = wz0.C22945n.m27016p(r3)
            r6[r12] = r3
            java.lang.String r3 = r5.getString(r8, r6)
            android.widget.TextView r5 = r0.f65583e
            di3.d r6 = di3.C86312j.m106911c(r1)
            ny.h r6 = (p629ny.C76979h) r6
            com.tencent.mm.ui.MMActivity r8 = r0.f65588j
            android.content.res.Resources r10 = r8.getResources()
            int r7 = r10.getDimensionPixelOffset(r7)
            android.text.SpannableString r3 = r6.mo107080qH(r8, r3, r7)
            r5.setText(r3)
        L_0x019f:
            com.tencent.mm.plugin.card.ui.n0 r3 = r0.f65616a
            com.tencent.mm.plugin.card.ui.CardDetailUIContoller r3 = (com.tencent.p014mm.plugin.card.p031ui.CardDetailUIContoller) r3
            boolean r3 = r3.f51800h
            if (r3 == 0) goto L_0x0315
            android.view.View r3 = r0.f65586h
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r5.mo10233c(r6)
            java.lang.Object[] r14 = r5.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r16 = "updateShareUserBottomLayout"
            java.lang.String r17 = "(Ljava/util/ArrayList;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r3
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r5.mo10231a(r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r14 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r15 = "updateShareUserBottomLayout"
            java.lang.String r16 = "(Ljava/util/ArrayList;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.widget.LinearLayout r3 = r0.f65587i
            int r3 = r3.getChildCount()
            r5 = 2131316008(0x7f094d28, float:1.8250485E38)
            if (r3 != 0) goto L_0x02c4
            com.tencent.mm.ui.MMActivity r3 = r0.f65588j
            java.lang.String r7 = "layout_inflater"
            java.lang.Object r3 = r3.getSystemService(r7)
            android.view.LayoutInflater r3 = (android.view.LayoutInflater) r3
            java.util.Iterator r4 = r4.iterator()
        L_0x0204:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x02bd
            java.lang.Object r7 = r4.next()
            pz0.q r7 = (pz0.C47725q) r7
            r8 = 2131497494(0x7f0c1216, float:1.8618583E38)
            android.widget.LinearLayout r10 = r0.f65587i
            android.view.View r8 = r3.inflate(r8, r10, r12)
            r10 = 2131316006(0x7f094d26, float:1.8250481E38)
            android.view.View r10 = r8.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r13 = 2131316022(0x7f094d36, float:1.8250514E38)
            android.view.View r13 = r8.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131313425(0x7f094311, float:1.8245246E38)
            android.view.View r14 = r8.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            java.lang.String r15 = r7.f128229a
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x0271
            di3.d r15 = di3.C86312j.m106911c(r2)
            ln.f r15 = (p196ln.C76705f) r15
            java.lang.String r11 = r7.f128229a
            r15.mo106849z(r10, r11)
            java.lang.String r10 = r7.f128229a
            java.lang.String r10 = wz0.C22945n.m27016p(r10)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x026e
            di3.d r11 = di3.C86312j.m106911c(r1)
            ny.h r11 = (p629ny.C76979h) r11
            com.tencent.mm.ui.MMActivity r15 = r0.f65588j
            android.content.res.Resources r12 = r15.getResources()
            r6 = 2131165652(0x7f0701d4, float:1.7945527E38)
            int r6 = r12.getDimensionPixelOffset(r6)
            android.text.SpannableString r6 = r11.mo107080qH(r15, r10, r6)
            r13.setText(r6)
            goto L_0x0271
        L_0x026e:
            r13.setText(r9)
        L_0x0271:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "x "
            r6.append(r10)
            int r10 = r7.f128231c
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r14.setText(r6)
            r8.setTag(r7)
            android.view.View$OnClickListener r6 = r0.f65589k
            r8.setOnClickListener(r6)
            android.view.View r6 = r8.findViewById(r5)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r10 = 2131316007(0x7f094d27, float:1.8250483E38)
            android.view.View r11 = r8.findViewById(r10)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            boolean r7 = r7.f128233e
            if (r7 == 0) goto L_0x02ab
            r7 = 0
            r6.setVisibility(r7)
            r11.setVisibility(r7)
            goto L_0x02b3
        L_0x02ab:
            r7 = 8
            r6.setVisibility(r7)
            r11.setVisibility(r7)
        L_0x02b3:
            android.widget.LinearLayout r6 = r0.f65587i
            r6.addView(r8)
            r11 = 8
            r12 = 0
            goto L_0x0204
        L_0x02bd:
            android.widget.LinearLayout r1 = r0.f65587i
            r1.invalidate()
            goto L_0x0415
        L_0x02c4:
            r1 = 0
        L_0x02c5:
            android.widget.LinearLayout r2 = r0.f65587i
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L_0x030e
            android.widget.LinearLayout r2 = r0.f65587i
            android.view.View r2 = r2.getChildAt(r1)
            r3 = 0
            int r6 = r4.size()
            android.widget.LinearLayout r7 = r0.f65587i
            int r7 = r7.getChildCount()
            if (r6 < r7) goto L_0x02e6
            java.lang.Object r3 = r4.get(r1)
            pz0.q r3 = (pz0.C47725q) r3
        L_0x02e6:
            android.view.View r6 = r2.findViewById(r5)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 2131316007(0x7f094d27, float:1.8250483E38)
            android.view.View r2 = r2.findViewById(r7)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r3 == 0) goto L_0x0303
            boolean r3 = r3.f128233e
            if (r3 == 0) goto L_0x0303
            r3 = 0
            r6.setVisibility(r3)
            r2.setVisibility(r3)
            goto L_0x030b
        L_0x0303:
            r3 = 8
            r6.setVisibility(r3)
            r2.setVisibility(r3)
        L_0x030b:
            int r1 = r1 + 1
            goto L_0x02c5
        L_0x030e:
            android.widget.LinearLayout r1 = r0.f65587i
            r1.invalidate()
            goto L_0x0415
        L_0x0315:
            android.view.View r1 = r0.f65586h
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r5 = "updateShareUserBottomLayout"
            java.lang.String r6 = "(Ljava/util/ArrayList;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            java.lang.Object r2 = r10.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r4 = "updateShareUserBottomLayout"
            java.lang.String r5 = "(Ljava/util/ArrayList;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            android.widget.LinearLayout r1 = r0.f65587i
            r1.removeAllViews()
            goto L_0x0415
        L_0x0364:
            boolean r4 = r5.mo35443q()
            if (r4 != 0) goto L_0x0415
            android.view.View r4 = r0.f65580b
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r11)
            java.lang.Object[] r19 = r5.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r21 = "updateShareUsersInfoLayout"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r4
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r19 = "com/tencent/mm/plugin/card/ui/view/CardShareUsersInfoHeaderView"
            java.lang.String r20 = "updateShareUsersInfoLayout"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.widget.ImageView r4 = r0.f65582d
            r5 = 0
            r4.setVisibility(r5)
            android.widget.TextView r4 = r0.f65583e
            r4.setVisibility(r5)
            android.widget.TextView r4 = r0.f65584f
            r5 = 8
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r0.f65585g
            r4.setVisibility(r5)
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 == 0) goto L_0x03dc
            java.lang.String r4 = r3.mo23280e()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x03dc
            java.lang.String r9 = r3.mo23280e()
        L_0x03dc:
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto L_0x0415
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.f r2 = (p196ln.C76705f) r2
            android.widget.ImageView r3 = r0.f65582d
            r2.mo106849z(r3, r9)
            com.tencent.mm.ui.MMActivity r2 = r0.f65588j
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r4 = wz0.C22945n.m27016p(r9)
            r5 = 0
            r3[r5] = r4
            java.lang.String r2 = r2.getString(r8, r3)
            android.widget.TextView r3 = r0.f65583e
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            com.tencent.mm.ui.MMActivity r4 = r0.f65588j
            android.content.res.Resources r5 = r4.getResources()
            int r5 = r5.getDimensionPixelOffset(r7)
            android.text.SpannableString r1 = r1.mo107080qH(r4, r2, r5)
            r3.setText(r1)
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vz0.C22811b0.mo35951e():void");
    }
}
