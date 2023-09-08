package fg2;

import android.content.Context;
import com.tencent.p014mm.plugin.radar.p091ui.RadarSpecialGridView;
import gy3.C87412m;

/* renamed from: fg2.b */
public abstract class C75748b {

    /* renamed from: a */
    public final RadarSpecialGridView f222347a;

    /* renamed from: b */
    public final Context f222348b;

    /* renamed from: c */
    public int f222349c = 3;

    public C75748b(RadarSpecialGridView radarSpecialGridView, Context context) {
        C87412m.m108594g(radarSpecialGridView, "mGridView");
        C87412m.m108594g(context, "mContext");
        this.f222347a = radarSpecialGridView;
        this.f222348b = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0500 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106065a() {
        /*
            r46 = this;
            r0 = r46
            int r1 = r0.f222349c
            java.lang.String r2 = "MicroMsg.RadarGridView.GridDataAdapter"
            if (r1 != 0) goto L_0x0010
            java.lang.String r1 = "column is 0, pls check!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            r3 = r0
            goto L_0x056e
        L_0x0010:
            r1 = r0
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r1 = (com.tencent.p014mm.plugin.radar.p091ui.RadarViewController.C70392b) r1
            te3.km3[] r3 = r1.f203369e
            int r10 = r3.length
            r11 = 0
            r12 = 0
        L_0x0018:
            if (r12 >= r10) goto L_0x054a
            int r3 = r0.f222349c
            int r3 = r12 / r3
            com.tencent.mm.plugin.radar.ui.RadarSpecialGridView r4 = r0.f222347a
            com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout r4 = r4.getMTable()
            int r4 = r4.getChildCount()
            if (r4 <= r3) goto L_0x0040
            com.tencent.mm.plugin.radar.ui.RadarSpecialGridView r5 = r0.f222347a
            com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout r5 = r5.getMTable()
            int r4 = r4 + -1
            int r4 = r4 - r3
            android.view.View r3 = r5.getChildAt(r4)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.TableRow"
            gy3.C87412m.m108592e(r3, r4)
            android.widget.TableRow r3 = (android.widget.TableRow) r3
            goto L_0x005a
        L_0x0040:
            android.widget.TableRow r3 = new android.widget.TableRow
            android.content.Context r4 = r0.f222348b
            r3.<init>(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = -1
            r4.<init>(r6, r5)
            r3.setLayoutParams(r4)
            com.tencent.mm.plugin.radar.ui.RadarSpecialGridView r4 = r0.f222347a
            com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout r4 = r4.getMTable()
            r4.addView(r3, r11)
        L_0x005a:
            r13 = r3
            int r3 = r0.f222349c
            int r3 = r12 % r3
            int r4 = r13.getChildCount()
            r14 = 1
            if (r4 > r3) goto L_0x0068
            r15 = 1
            goto L_0x0069
        L_0x0068:
            r15 = 0
        L_0x0069:
            int r4 = r4 + -1
            int r9 = r4 - r3
            r8 = 0
            if (r15 != 0) goto L_0x0076
            android.view.View r3 = r13.getChildAt(r9)
            r7 = r3
            goto L_0x0077
        L_0x0076:
            r7 = r8
        L_0x0077:
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r6 = com.tencent.p014mm.plugin.radar.model.RadarAddContact.C70378d.Stranger
            eg2.h$d r5 = eg2.C75617h.C75620d.SEARCH_RETRUN
            int r3 = com.tencent.p014mm.plugin.radar.p091ui.RadarViewController.f203346w
            java.lang.Object[] r3 = new java.lang.Object[r14]
            com.tencent.mm.plugin.radar.ui.RadarViewController r4 = r1.f203375k
            eg2.h$d r4 = r4.getRadarStatus()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r3[r11] = r4
            java.lang.String r4 = "MicroMsg.Radar.RadarViewController"
            java.lang.String r11 = "getview RadarStatus%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r11, r3)
            te3.km3[] r3 = r1.f203369e
            r11 = r3[r12]
            if (r11 == 0) goto L_0x0511
            java.lang.String r3 = r11.f183957d
            if (r3 == 0) goto L_0x00a5
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r3 = 0
            goto L_0x00a6
        L_0x00a5:
            r3 = 1
        L_0x00a6:
            if (r3 == 0) goto L_0x00ba
            java.lang.String r3 = r11.f183961h
            if (r3 == 0) goto L_0x00b5
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r3 = 0
            goto L_0x00b6
        L_0x00b5:
            r3 = 1
        L_0x00b6:
            if (r3 == 0) goto L_0x00ba
            r3 = 1
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            if (r3 != 0) goto L_0x0511
            java.lang.String r3 = r11.f183957d
            java.lang.String r17 = ""
            if (r3 != 0) goto L_0x00ca
            java.lang.String r3 = r11.f183961h
            if (r3 != 0) goto L_0x00ca
            r4 = r17
            goto L_0x00cb
        L_0x00ca:
            r4 = r3
        L_0x00cb:
            com.tencent.mm.plugin.radar.ui.RadarViewController r3 = r1.f203375k
            eg2.h$d r3 = r3.getRadarStatus()
            if (r7 != 0) goto L_0x0109
            r18 = r4
            android.content.Context r4 = r1.f203368d
            r19 = r6
            r6 = 2131497064(0x7f0c1068, float:1.861771E38)
            android.view.View r4 = android.view.View.inflate(r4, r6, r8)
            gy3.C87412m.m108591d(r4)
            com.tencent.mm.plugin.radar.ui.RadarViewController r6 = r1.f203375k
            int r6 = r6.f203361u
            com.tencent.mm.plugin.radar.ui.RadarViewController$a r8 = r1.f203372h
            r20 = r7
            int r7 = r8.f203363a
            r16 = 1
            int r7 = r7 + 1
            r8.f203363a = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.setTag(r6, r7)
            com.tencent.mm.plugin.radar.ui.RadarViewController r6 = r1.f203375k
            int r6 = r6.f203362v
            com.tencent.mm.plugin.radar.ui.RadarViewController$a r7 = r1.f203372h
            android.view.animation.Animation r7 = r7.mo96969a()
            r4.setTag(r6, r7)
            r8 = r4
            goto L_0x0111
        L_0x0109:
            r18 = r4
            r19 = r6
            r20 = r7
            r8 = r20
        L_0x0111:
            r4 = 2131311715(0x7f093c63, float:1.8241778E38)
            android.view.View r4 = r8.findViewById(r4)
            java.lang.String r6 = "null cannot be cast to non-null type android.widget.ImageView"
            gy3.C87412m.m108592e(r4, r6)
            r7 = r4
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r4 = 2131311709(0x7f093c5d, float:1.8241766E38)
            android.view.View r4 = r8.findViewById(r4)
            r21 = r9
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarStateView"
            gy3.C87412m.m108592e(r4, r9)
            r9 = r4
            com.tencent.mm.plugin.radar.ui.RadarStateView r9 = (com.tencent.p014mm.plugin.radar.p091ui.RadarStateView) r9
            r4 = 2131311717(0x7f093c65, float:1.8241782E38)
            android.view.View r4 = r8.findViewById(r4)
            r22 = r10
            java.lang.String r10 = "null cannot be cast to non-null type android.widget.TextView"
            gy3.C87412m.m108592e(r4, r10)
            r10 = r4
            android.widget.TextView r10 = (android.widget.TextView) r10
            r4 = 2131311716(0x7f093c64, float:1.824178E38)
            android.view.View r4 = r8.findViewById(r4)
            gy3.C87412m.m108592e(r4, r6)
            r6 = r4
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r4 = 2131311708(0x7f093c5c, float:1.8241764E38)
            android.view.View r4 = r8.findViewById(r4)
            r23 = r8
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarStateChooseView"
            gy3.C87412m.m108592e(r4, r8)
            r8 = r4
            com.tencent.mm.plugin.radar.ui.RadarStateChooseView r8 = (com.tencent.p014mm.plugin.radar.p091ui.RadarStateChooseView) r8
            r4 = 0
            r7.setVisibility(r4)
            r9.setVisibility(r4)
            r10.setVisibility(r4)
            r6.setVisibility(r4)
            eg2.h$d r4 = eg2.C75617h.C75620d.SEARCHING
            r24 = r2
            r2 = 8
            if (r3 == r4) goto L_0x0184
            if (r3 != r5) goto L_0x017c
            goto L_0x0184
        L_0x017c:
            r9.setVisibility(r2)
            r3 = 0
            r8.setVisibility(r3)
            goto L_0x018b
        L_0x0184:
            r3 = 0
            r9.setVisibility(r3)
            r8.setVisibility(r2)
        L_0x018b:
            com.tencent.mm.plugin.radar.ui.RadarViewController$b$a r3 = new com.tencent.mm.plugin.radar.ui.RadarViewController$b$a
            r25 = r3
            r27 = r4
            r26 = r18
            r4 = r1
            r28 = r5
            r5 = r10
            r18 = r6
            r10 = r19
            r6 = r7
            r29 = r20
            r7 = r9
            r9 = r23
            r2 = r9
            r30 = r21
            r9 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.setTag(r3)
            r3 = 7
            r4 = 2131315531(0x7f094b4b, float:1.8249518E38)
            r5 = 2131298260(0x7f0907d4, float:1.8214488E38)
            if (r12 == r3) goto L_0x024a
            int r3 = r12 % 3
            r6 = 1
            if (r3 != r6) goto L_0x01bc
            goto L_0x024a
        L_0x01bc:
            android.view.View r3 = r2.findViewById(r4)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r4.mo10233c(r14)
            java.lang.Object[] r32 = r4.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter"
            java.lang.String r34 = "makeView"
            java.lang.String r35 = "(Landroid/view/View;ILcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)Landroid/view/View;"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r3
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r6 = 0
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r32 = "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter"
            java.lang.String r33 = "makeView"
            java.lang.String r34 = "(Landroid/view/View;ILcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            j20.C117292a.m165359e(r31, r32, r33, r34, r35, r36, r37)
            android.view.View r3 = r2.findViewById(r5)
            k20.a r4 = new k20.a
            r4.<init>()
            r5 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r39 = r4.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter"
            java.lang.String r41 = "makeView"
            java.lang.String r42 = "(Landroid/view/View;ILcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)Landroid/view/View;"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r3
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r39 = "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter"
            java.lang.String r40 = "makeView"
            java.lang.String r41 = "(Landroid/view/View;ILcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)Landroid/view/View;"
            java.lang.String r42 = "android/view/View_EXEC_"
            java.lang.String r43 = "setVisibility"
            java.lang.String r44 = "(I)V"
            j20.C117292a.m165359e(r38, r39, r40, r41, r42, r43, r44)
            goto L_0x02d6
        L_0x024a:
            android.view.View r3 = r2.findViewById(r5)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r5.mo10233c(r14)
            java.lang.Object[] r32 = r5.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter"
            java.lang.String r34 = "makeView"
            java.lang.String r35 = "(Landroid/view/View;ILcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)Landroid/view/View;"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r3
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r32 = "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter"
            java.lang.String r33 = "makeView"
            java.lang.String r34 = "(Landroid/view/View;ILcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)Landroid/view/View;"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            j20.C117292a.m165359e(r31, r32, r33, r34, r35, r36, r37)
            android.view.View r3 = r2.findViewById(r4)
            k20.a r4 = new k20.a
            r4.<init>()
            r5 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r6)
            java.lang.Object[] r39 = r4.mo10232b()
            java.lang.String r40 = "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter"
            java.lang.String r41 = "makeView"
            java.lang.String r42 = "(Landroid/view/View;ILcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)Landroid/view/View;"
            java.lang.String r43 = "android/view/View_EXEC_"
            java.lang.String r44 = "setVisibility"
            java.lang.String r45 = "(I)V"
            r38 = r3
            j20.C117292a.m165358d(r38, r39, r40, r41, r42, r43, r44, r45)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r39 = "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter"
            java.lang.String r40 = "makeView"
            java.lang.String r41 = "(Landroid/view/View;ILcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)Landroid/view/View;"
            java.lang.String r42 = "android/view/View_EXEC_"
            java.lang.String r43 = "setVisibility"
            java.lang.String r44 = "(I)V"
            j20.C117292a.m165359e(r38, r39, r40, r41, r42, r43, r44)
        L_0x02d6:
            r3 = r29
            if (r3 == 0) goto L_0x02e0
            if (r2 == r3) goto L_0x02dd
            goto L_0x02e0
        L_0x02dd:
            r5 = r26
            goto L_0x02e7
        L_0x02e0:
            java.util.HashMap<java.lang.String, android.view.View> r4 = r1.f203374j
            r5 = r26
            r4.put(r5, r2)
        L_0x02e7:
            java.lang.Object r4 = r2.getTag()
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarViewController.RadarSearchAdapter.ViewHolder"
            gy3.C87412m.m108592e(r4, r6)
            com.tencent.mm.plugin.radar.ui.RadarViewController$b$a r4 = (com.tencent.p014mm.plugin.radar.p091ui.RadarViewController.C70392b.C70393a) r4
            android.widget.TextView r6 = r4.f203376a
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ny.h r7 = (p629ny.C76979h) r7
            com.tencent.mm.plugin.radar.ui.RadarViewController r8 = r1.f203375k
            android.content.Context r8 = r8.getContext()
            java.lang.String r9 = r11.f183959f
            android.widget.TextView r14 = r4.f203376a
            float r14 = r14.getTextSize()
            android.text.SpannableString r7 = r7.yp0(r8, r9, r14)
            r6.setText(r7)
            fg2.c$a r6 = fg2.C75749c.C75750a.f222350a
            android.widget.ImageView r7 = r4.f203377b
            r6.mo106066a(r7, r5)
            r6 = 2131311697(0x7f093c51, float:1.8241742E38)
            android.view.View r6 = r2.findViewById(r6)
            java.lang.String r7 = "view.findViewById(R.id.radar_avatar_container)"
            gy3.C87412m.m108593f(r6, r7)
            com.tencent.mm.plugin.radar.ui.RadarViewController$c r7 = new com.tencent.mm.plugin.radar.ui.RadarViewController$c
            com.tencent.mm.plugin.radar.ui.RadarViewController r8 = r1.f203375k
            r7.<init>(r8, r11)
            r6.setTag(r7)
            com.tencent.mm.plugin.radar.ui.RadarViewController r6 = r1.f203375k
            eg2.h$d r6 = r6.getRadarStatus()
            java.lang.String r7 = "radarManager"
            r8 = r27
            if (r6 == r8) goto L_0x03eb
            com.tencent.mm.plugin.radar.ui.RadarViewController r6 = r1.f203375k
            eg2.h$d r6 = r6.getRadarStatus()
            r8 = r28
            if (r6 != r8) goto L_0x0349
            goto L_0x03eb
        L_0x0349:
            com.tencent.mm.plugin.radar.ui.RadarViewController r5 = r1.f203375k
            eg2.h r5 = r5.f203355o
            if (r5 == 0) goto L_0x03e6
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f222150o
            java.lang.String r6 = r11.f183961h
            if (r6 != 0) goto L_0x035b
            java.lang.String r6 = r11.f183957d
            if (r6 != 0) goto L_0x035b
            r6 = r17
        L_0x035b:
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x03dc
            com.tencent.mm.plugin.radar.ui.RadarStateView r5 = r4.f203378c
            r6 = 0
            r5.f115875e = r6
            r6 = 8
            r5.setVisibility(r6)
            com.tencent.mm.plugin.radar.ui.RadarStateChooseView r5 = r4.f203379d
            r6 = 1
            r5.f115871f = r6
            r5.mo66958a()
            com.tencent.mm.plugin.radar.ui.RadarViewController r5 = r1.f203375k
            eg2.h r5 = r5.f203355o
            if (r5 == 0) goto L_0x03d7
            eg2.h$a r6 = eg2.C75617h.C45657a.UnSelected
            java.lang.String r7 = r11.f183957d
            if (r7 != 0) goto L_0x038d
            java.lang.String r7 = r11.f183961h
            if (r7 != 0) goto L_0x038d
            r7 = r17
        L_0x038d:
            java.util.Map<java.lang.String, eg2.h$a> r5 = r5.f222154s
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r5 = r5.get(r7)
            eg2.h$a r5 = (eg2.C75617h.C45657a) r5
            if (r5 != 0) goto L_0x039a
            r5 = r6
        L_0x039a:
            if (r5 == r6) goto L_0x03a2
            android.widget.ImageView r6 = r4.f203380e
            r8 = 0
            r6.setBackgroundDrawable(r8)
        L_0x03a2:
            com.tencent.mm.plugin.radar.ui.RadarStateChooseView r4 = r4.f203379d
            r4.mo66959b(r5)
            if (r12 != 0) goto L_0x03b1
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r1.f203371g
            int r4 = r4.size()
            r1.f203373i = r4
        L_0x03b1:
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r1.f203371g
            java.lang.String r5 = r11.f183961h
            if (r5 != 0) goto L_0x03bd
            java.lang.String r5 = r11.f183957d
            if (r5 != 0) goto L_0x03bd
            r5 = r17
        L_0x03bd:
            java.lang.Object r4 = r4.remove(r5)
            if (r4 == 0) goto L_0x03d1
            com.tencent.mm.plugin.radar.ui.RadarViewController$a r4 = r1.f203372h
            int r5 = r1.f203373i
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r1.f203371g
            int r6 = r6.size()
            int r5 = r5 - r6
            r4.mo96970b(r5, r2)
        L_0x03d1:
            r17 = r13
            r18 = r15
            goto L_0x04fe
        L_0x03d7:
            r8 = 0
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x03dc:
            android.view.View r8 = r1.mo96972c(r3, r12)
            r17 = r13
            r18 = r15
            goto L_0x0520
        L_0x03e6:
            r8 = 0
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x03eb:
            r8 = 0
            android.widget.ImageView r6 = r4.f203380e
            r9 = 2131234761(0x7f080fc9, float:1.8085697E38)
            r6.setBackgroundResource(r9)
            com.tencent.mm.plugin.radar.ui.RadarStateView r6 = r4.f203378c
            r9 = 1
            r6.f115875e = r9
            r6.mo66965d()
            com.tencent.mm.plugin.radar.ui.RadarStateChooseView r6 = r4.f203379d
            r9 = 0
            r6.f115871f = r9
            r14 = 8
            r6.setVisibility(r14)
            com.tencent.mm.plugin.radar.ui.RadarViewController r6 = r1.f203375k
            eg2.h r6 = r6.f203355o
            if (r6 == 0) goto L_0x050b
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r6 = r6.mo105963a(r11, r9)
            java.lang.String r9 = "member.EncodeUserName"
            java.lang.String r14 = "member.UserName"
            if (r6 != 0) goto L_0x043c
            com.tencent.mm.plugin.radar.ui.RadarViewController r6 = r1.f203375k
            com.tencent.mm.plugin.radar.model.RadarAddContact r6 = r6.f203356p
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r6 = r6.mo96913e(r5)
            com.tencent.mm.plugin.radar.ui.RadarViewController r8 = r1.f203375k
            eg2.h r8 = r8.f203355o
            if (r8 == 0) goto L_0x0437
            java.lang.String r0 = r11.f183957d
            gy3.C87412m.m108593f(r0, r14)
            r8.mo105965c(r0, r6)
            java.lang.String r0 = r11.f183961h
            gy3.C87412m.m108593f(r0, r9)
            r8.mo105965c(r0, r6)
            goto L_0x043c
        L_0x0437:
            gy3.C87412m.m108603p(r7)
            r0 = 0
            throw r0
        L_0x043c:
            com.tencent.mm.plugin.radar.ui.RadarViewController r0 = r1.f203375k
            eg2.h r0 = r0.f203355o
            if (r0 == 0) goto L_0x0505
            r8 = 1
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r0 = r0.mo105963a(r11, r8)
            com.tencent.mm.plugin.radar.ui.RadarStateView r8 = r4.f203378c
            if (r0 != 0) goto L_0x044c
            r0 = r10
        L_0x044c:
            r8.getClass()
            r8.mo66962a()
            r17 = r13
            fg2.u r13 = r8.f115876f
            r18 = r15
            r15 = 0
            r13.removeMessages(r15)
            r8.clearAnimation()
            r8.f115874d = r0
            r8.mo66965d()
            com.tencent.mm.plugin.radar.ui.RadarStateView r0 = r4.f203378c
            r0.getClass()
            r0.mo66962a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = " turnToState : "
            r4.append(r8)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "MicroMsg.RadarStateView"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r4)
            com.tencent.mm.plugin.radar.model.RadarAddContact$d r4 = r0.f115874d
            if (r4 != r6) goto L_0x048b
            r0.mo66965d()
        L_0x0489:
            r8 = r7
            goto L_0x04c7
        L_0x048b:
            int r4 = r0.getVisibility()
            if (r4 != 0) goto L_0x0493
            r4 = 1
            goto L_0x0494
        L_0x0493:
            r4 = 0
        L_0x0494:
            if (r4 == 0) goto L_0x049b
            r0.mo66963b()
            r4 = 1
            goto L_0x049c
        L_0x049b:
            r4 = 0
        L_0x049c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = " delay : "
            r13.append(r15)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r13)
            r0.f115874d = r6
            if (r6 == r10) goto L_0x0489
            if (r4 != 0) goto L_0x04bd
            fg2.u r0 = r0.f115876f
            r4 = 0
            r0.sendEmptyMessage(r4)
            goto L_0x0489
        L_0x04bd:
            r4 = 0
            fg2.u r0 = r0.f115876f
            r6 = 320(0x140, float:4.48E-43)
            r8 = r7
            long r6 = (long) r6
            r0.sendEmptyMessageDelayed(r4, r6)
        L_0x04c7:
            com.tencent.mm.plugin.radar.ui.RadarViewController r0 = r1.f203375k
            eg2.h r0 = r0.f203355o
            if (r0 == 0) goto L_0x0500
            java.lang.String r4 = r11.f183957d
            gy3.C87412m.m108593f(r4, r14)
            r6 = 0
            r0.mo105966d(r4, r6)
            java.lang.String r4 = r11.f183961h
            gy3.C87412m.m108593f(r4, r9)
            r0.mo105966d(r4, r6)
            if (r12 != 0) goto L_0x04e8
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.f203371g
            int r0 = r0.size()
            r1.f203373i = r0
        L_0x04e8:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.f203371g
            java.lang.Object r0 = r0.remove(r5)
            if (r0 == 0) goto L_0x04fe
            com.tencent.mm.plugin.radar.ui.RadarViewController$a r0 = r1.f203372h
            int r4 = r1.f203373i
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r1.f203371g
            int r5 = r5.size()
            int r4 = r4 - r5
            r0.mo96970b(r4, r2)
        L_0x04fe:
            r8 = r2
            goto L_0x0520
        L_0x0500:
            gy3.C87412m.m108603p(r8)
            r0 = 0
            throw r0
        L_0x0505:
            r8 = r7
            r0 = 0
            gy3.C87412m.m108603p(r8)
            throw r0
        L_0x050b:
            r0 = r8
            r8 = r7
            gy3.C87412m.m108603p(r8)
            throw r0
        L_0x0511:
            r24 = r2
            r3 = r7
            r30 = r9
            r22 = r10
            r17 = r13
            r18 = r15
            android.view.View r8 = r1.mo96972c(r3, r12)
        L_0x0520:
            if (r18 == 0) goto L_0x0529
            r0 = r17
            r2 = 0
            r0.addView(r8, r2)
            goto L_0x0536
        L_0x0529:
            r0 = r17
            r2 = 0
            if (r8 == r3) goto L_0x0536
            r4 = r30
            r0.removeViewAt(r4)
            r0.addView(r8, r4)
        L_0x0536:
            fg2.a r0 = new fg2.a
            r3 = r46
            r0.<init>(r3, r12)
            r8.setOnClickListener(r0)
            int r12 = r12 + 1
            r0 = r3
            r10 = r22
            r2 = r24
            r11 = 0
            goto L_0x0018
        L_0x054a:
            r3 = r0
            r24 = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mTable rows count : "
            r0.append(r1)
            com.tencent.mm.plugin.radar.ui.RadarSpecialGridView r1 = r3.f222347a
            com.tencent.mm.plugin.radar.ui.RadarSpecialTableLayout r1 = r1.getMTable()
            int r1 = r1.getChildCount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r1, r0)
        L_0x056e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fg2.C75748b.mo106065a():void");
    }
}
