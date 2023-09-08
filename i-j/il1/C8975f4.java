package il1;

import hp3.C87581a;

/* renamed from: il1.f4 */
public final class C8975f4<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C9012h4 f28372a;

    /* renamed from: b */
    public final /* synthetic */ boolean f28373b;

    public C8975f4(C9012h4 h4Var, boolean z) {
        this.f28372a = h4Var;
        this.f28373b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        r11 = ((cl1.C0696x) r11.mo87696x0(r7)).f1644g;
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0571  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            ob0.b$c r1 = (ob0.C89132b.C89134c) r1
            il1.h4 r2 = r0.f28372a
            androidx.core.widget.NestedScrollView r3 = r2.f28480w
            r4 = 0
            r3.setVisibility(r4)
            android.widget.ProgressBar r2 = r2.f28481x
            r3 = 8
            r2.setVisibility(r3)
            int r2 = r1.f256793a
            if (r2 != 0) goto L_0x05b2
            int r2 = r1.f256794b
            if (r2 != 0) goto L_0x05b2
            il1.h4 r2 = r0.f28372a
            T r1 = r1.f256796d
            java.lang.String r5 = "it.resp"
            gy3.C87412m.m108593f(r1, r5)
            te3.ky0 r1 = (te3.C50192ky0) r1
            boolean r5 = r0.f28373b
            java.lang.Class<ak1.w> r6 = ak1.C54116w.class
            java.lang.Class<cl1.x> r7 = cl1.C0696x.class
            r8 = 4
            r9 = 1
            if (r5 == 0) goto L_0x0084
            qj1.c r11 = r2.getBasePlugin()
            if (r11 == 0) goto L_0x0045
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r7)
            cl1.x r11 = (cl1.C0696x) r11
            te3.ly0 r11 = r11.f1644g
            if (r11 == 0) goto L_0x0045
            int r11 = r11.f137711i
            goto L_0x0046
        L_0x0045:
            r11 = 0
        L_0x0046:
            int r12 = r1.f137088d
            if (r12 > 0) goto L_0x004c
            r1.f137088d = r11
        L_0x004c:
            te3.kf4 r12 = r1.f137092h
            if (r12 == 0) goto L_0x0073
            java.util.LinkedList<te3.lf4> r12 = r12.f136771d
            if (r12 == 0) goto L_0x0073
            java.util.Iterator r12 = r12.iterator()
        L_0x0058:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x006f
            java.lang.Object r13 = r12.next()
            r14 = r13
            te3.lf4 r14 = (te3.lf4) r14
            int r14 = r14.f137396i
            if (r14 != r8) goto L_0x006b
            r14 = 1
            goto L_0x006c
        L_0x006b:
            r14 = 0
        L_0x006c:
            if (r14 == 0) goto L_0x0058
            goto L_0x0070
        L_0x006f:
            r13 = 0
        L_0x0070:
            te3.lf4 r13 = (te3.lf4) r13
            goto L_0x0074
        L_0x0073:
            r13 = 0
        L_0x0074:
            if (r13 == 0) goto L_0x007c
            int r12 = r13.f137394g
            if (r12 != 0) goto L_0x007c
            r12 = 1
            goto L_0x007d
        L_0x007c:
            r12 = 0
        L_0x007d:
            if (r12 == 0) goto L_0x0087
            r13.f137394g = r9
            r13.f137393f = r11
            goto L_0x0087
        L_0x0084:
            r2.getClass()
        L_0x0087:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "setContent autoShowAfterJoin:"
            r11.append(r12)
            r11.append(r5)
            java.lang.String r5 = ",resp intimacy:"
            r11.append(r5)
            int r5 = r1.f137088d
            r11.append(r5)
            java.lang.String r5 = ",default intimacy:"
            r11.append(r5)
            qj1.c r5 = r2.getBasePlugin()
            if (r5 == 0) goto L_0x00bb
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r7)
            cl1.x r5 = (cl1.C0696x) r5
            te3.ly0 r5 = r5.f1644g
            if (r5 == 0) goto L_0x00bb
            int r5 = r5.f137711i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x00bc
        L_0x00bb:
            r5 = 0
        L_0x00bc:
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            java.lang.String r11 = "FinderLiveFansTaskWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r5)
            android.widget.TextView r5 = r2.f28482y
            int r11 = r1.f137088d
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r5.setText(r11)
            de3.u r5 = new de3.u
            java.lang.String r11 = " :"
            r5.<init>((java.lang.String) r11)
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan
            android.view.View r12 = r2.f28473p
            android.content.Context r12 = r12.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131099917(0x7f06010d, float:1.78122E38)
            int r12 = r12.getColor(r13)
            r11.<init>(r12)
            r12 = 33
            r13 = 2
            r5.mo105705b(r11, r9, r13, r12)
            wk1.n r11 = wk1.C15440n.f41895a
            java.util.LinkedList<te3.aw0> r11 = r1.f137089e
            java.lang.String r14 = ""
            if (r11 == 0) goto L_0x0166
            java.util.Iterator r11 = r11.iterator()
        L_0x0102:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0166
            java.lang.Object r15 = r11.next()
            te3.aw0 r15 = (te3.C48770aw0) r15
            int r10 = r15.f130789d
            if (r10 != r8) goto L_0x0102
            int r10 = r15.f130791f
            if (r10 <= 0) goto L_0x0102
            java.lang.String r10 = r15.f130793h
            if (r10 == 0) goto L_0x0123
            int r11 = r10.length()
            if (r11 != 0) goto L_0x0121
            goto L_0x0123
        L_0x0121:
            r11 = 0
            goto L_0x0124
        L_0x0123:
            r11 = 1
        L_0x0124:
            r11 = r11 ^ r9
            if (r11 == 0) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r10 = 0
        L_0x0129:
            if (r10 != 0) goto L_0x013d
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r10 = r10.mo77630e(r7)
            cl1.x r10 = (cl1.C0696x) r10
            if (r10 == 0) goto L_0x013c
            te3.ly0 r10 = r10.f1644g
            if (r10 == 0) goto L_0x013c
            java.lang.String r10 = r10.f137706d
            goto L_0x013d
        L_0x013c:
            r10 = 0
        L_0x013d:
            wk1.e$c r11 = wk1.C15426e.f41832e
            wk1.e$a r11 = new wk1.e$a
            r11.<init>()
            int r13 = r15.f130791f
            wk1.d r8 = new wk1.d
            wk1.x r3 = wk1.C15483x.MODE_DARK
            wk1.y r4 = wk1.C15484y.SIZE_NORMAL
            r8.<init>(r3, r4)
            r11.mo14235b(r13, r8)
            wk1.e$d r3 = r11.f41835a
            if (r10 != 0) goto L_0x0157
            r10 = r14
        L_0x0157:
            r3.getClass()
            r3.f41839d = r10
            java.lang.String r3 = r15.f130792g
            r11.mo14236c(r3)
            wk1.e r3 = r11.mo14234a()
            goto L_0x0167
        L_0x0166:
            r3 = 0
        L_0x0167:
            if (r3 == 0) goto L_0x0170
            r4 = 0
            r5.mo105705b(r3, r4, r9, r12)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0171
        L_0x0170:
            r3 = 0
        L_0x0171:
            if (r3 != 0) goto L_0x017a
            cl1.o$c r3 = cl1.C54991o.f154177g4
            java.util.LinkedList<te3.aw0> r4 = r1.f137089e
            r3.mo643b(r4, r14)
        L_0x017a:
            android.widget.TextView r3 = r2.f28483z
            r3.setText(r5)
            te3.a51 r3 = r1.f137091g
            if (r3 == 0) goto L_0x018f
            java.util.LinkedList<te3.z41> r3 = r3.f130317d
            if (r3 == 0) goto L_0x018f
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x018f
            r3 = 1
            goto L_0x0190
        L_0x018f:
            r3 = 0
        L_0x0190:
            java.lang.String r4 = "root.context.getString(R…next_level_need_intimacy)"
            if (r3 == 0) goto L_0x01bc
            android.view.View r3 = r2.f28473p
            android.content.Context r3 = r3.getContext()
            r5 = 2131827384(0x7f111ab8, float:1.928768E38)
            java.lang.Object[] r8 = new java.lang.Object[r9]
            int r10 = r1.f137090f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 0
            r8[r11] = r10
            java.lang.String r3 = r3.getString(r5, r8)
            gy3.C87412m.m108593f(r3, r4)
            int r4 = r1.f137090f
            de3.u r3 = r2.mo9826b(r3, r4)
            android.widget.TextView r4 = r2.f28461A
            r4.setText(r3)
            goto L_0x01e2
        L_0x01bc:
            android.widget.TextView r3 = r2.f28461A
            android.view.View r5 = r2.f28473p
            android.content.Context r5 = r5.getContext()
            r8 = 2131827385(0x7f111ab9, float:1.9287681E38)
            java.lang.Object[] r10 = new java.lang.Object[r9]
            int r11 = r1.f137090f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 0
            r10[r12] = r11
            java.lang.String r5 = r5.getString(r8, r10)
            gy3.C87412m.m108593f(r5, r4)
            int r4 = r1.f137090f
            de3.u r4 = r2.mo9826b(r5, r4)
            r3.setText(r4)
        L_0x01e2:
            com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansTaskView r3 = r2.f28462B
            qj1.c r4 = r2.getBasePlugin()
            if (r4 == 0) goto L_0x01f7
            java.lang.Class<cl1.z0> r5 = cl1.C0702z0.class
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r5)
            cl1.z0 r4 = (cl1.C0702z0) r4
            boolean r4 = r4.mo670d3()
            goto L_0x01f8
        L_0x01f7:
            r4 = 0
        L_0x01f8:
            r3.getClass()
            di3.d r5 = di3.C86312j.m106911c(r6)
            java.lang.String r8 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r5, r8)
            r10 = r5
            ak1.w r10 = (ak1.C54116w) r10
            ak1.f0$t0 r11 = ak1.C54067f0.C0069t0.FANS_ENTRANCE_CLICK
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            ak1.C54116w.Yx0(r10, r11, r12, r13, r14, r15)
            de3.u r5 = new de3.u
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            te3.kf4 r11 = r1.f137092h
            if (r11 == 0) goto L_0x0222
            int r11 = r11.f136772e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0223
        L_0x0222:
            r11 = 0
        L_0x0223:
            r10.append(r11)
            r11 = 47
            r10.append(r11)
            te3.kf4 r11 = r1.f137092h
            if (r11 == 0) goto L_0x0236
            int r11 = r11.f136773f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0237
        L_0x0236:
            r11 = 0
        L_0x0237:
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r5.<init>((java.lang.String) r10)
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            android.view.View r11 = r3.f17883d
            android.content.Context r11 = r11.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131099941(0x7f060125, float:1.781225E38)
            int r11 = r11.getColor(r12)
            r10.<init>(r11)
            te3.kf4 r11 = r1.f137092h
            if (r11 == 0) goto L_0x0262
            int r11 = r11.f136772e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0263
        L_0x0262:
            r11 = 0
        L_0x0263:
            te3.kf4 r12 = r1.f137092h
            if (r12 == 0) goto L_0x026e
            int r12 = r12.f136773f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x026f
        L_0x026e:
            r12 = 0
        L_0x026f:
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            r12 = 17
            if (r11 != 0) goto L_0x0290
            te3.kf4 r11 = r1.f137092h
            if (r11 == 0) goto L_0x0282
            int r11 = r11.f136772e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x0283
        L_0x0282:
            r11 = 0
        L_0x0283:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r11 = r11.length()
            r13 = 0
            r5.mo105705b(r10, r13, r11, r12)
            goto L_0x0298
        L_0x0290:
            r13 = 0
            int r11 = r5.length()
            r5.mo105705b(r10, r13, r11, r12)
        L_0x0298:
            android.widget.TextView r10 = r3.f17884e
            r10.setText(r5)
            te3.gy0 r5 = r1.f137097p
            if (r5 == 0) goto L_0x02a4
            int r5 = r5.f134348d
            goto L_0x02a5
        L_0x02a4:
            r5 = 0
        L_0x02a5:
            if (r5 <= 0) goto L_0x02d4
            if (r4 == 0) goto L_0x02d4
            android.widget.TextView r4 = r3.f17885f
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r10 = 2131827383(0x7f111ab7, float:1.9287677E38)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            te3.gy0 r12 = r1.f137097p
            if (r12 == 0) goto L_0x02c3
            int r12 = r12.f134348d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x02c4
        L_0x02c3:
            r12 = 0
        L_0x02c4:
            r13 = 0
            r11[r13] = r12
            java.lang.String r5 = r5.getString(r10, r11)
            r4.setText(r5)
            android.widget.TextView r4 = r3.f17885f
            r4.setVisibility(r13)
            goto L_0x02db
        L_0x02d4:
            android.widget.TextView r4 = r3.f17885f
            r5 = 8
            r4.setVisibility(r5)
        L_0x02db:
            qk1.w0 r4 = r3.f17886g
            te3.kf4 r5 = r1.f137092h
            if (r5 == 0) goto L_0x02e4
            java.util.LinkedList<te3.lf4> r5 = r5.f136771d
            goto L_0x02e5
        L_0x02e4:
            r5 = 0
        L_0x02e5:
            if (r5 == 0) goto L_0x02f2
            java.util.LinkedList<te3.lf4> r10 = r4.f36755d
            r10.clear()
            java.util.LinkedList<te3.lf4> r4 = r4.f36755d
            r4.addAll(r5)
            goto L_0x02f5
        L_0x02f2:
            r4.getClass()
        L_0x02f5:
            qk1.w0 r3 = r3.f17886g
            r3.notifyDataSetChanged()
            com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansRightView r3 = r2.f28463C
            r3.getClass()
            di3.d r4 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r4, r8)
            r10 = r4
            ak1.w r10 = (ak1.C54116w) r10
            ak1.f0$t0 r11 = ak1.C54067f0.C0069t0.FANS_CLUB_RIGHT_TAB_EXPOSURE
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            ak1.C54116w.Yx0(r10, r11, r12, r13, r14, r15)
            boolean r4 = r1.f137095n
            r5 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            if (r4 == 0) goto L_0x0332
            android.widget.LinearLayout r4 = r3.f17873f
            r5 = 0
            r4.setVisibility(r5)
            boolean r4 = r1.f137094j
            r3.mo4634b(r4)
            android.widget.LinearLayout r4 = r3.f17872e
            com.tencent.mm.plugin.finder.view.l3 r5 = new com.tencent.mm.plugin.finder.view.l3
            r5.<init>(r3)
            r4.setOnClickListener(r5)
            goto L_0x0339
        L_0x0332:
            android.widget.LinearLayout r4 = r3.f17873f
            r5 = 8
            r4.setVisibility(r5)
        L_0x0339:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r4 = r4.mo77630e(r7)
            cl1.x r4 = (cl1.C0696x) r4
            if (r4 == 0) goto L_0x034e
            te3.ly0 r4 = r4.f1644g
            if (r4 == 0) goto L_0x034e
            te3.oj r4 = r4.f137713n
            if (r4 == 0) goto L_0x034e
            int r4 = r4.f139209d
            goto L_0x0351
        L_0x034e:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0351:
            java.util.LinkedList<te3.aw0> r5 = r1.f137089e
            if (r5 == 0) goto L_0x0379
            java.util.Iterator r5 = r5.iterator()
        L_0x0359:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0371
            java.lang.Object r11 = r5.next()
            r12 = r11
            te3.aw0 r12 = (te3.C48770aw0) r12
            int r12 = r12.f130789d
            r13 = 4
            if (r12 != r13) goto L_0x036d
            r12 = 1
            goto L_0x036e
        L_0x036d:
            r12 = 0
        L_0x036e:
            if (r12 == 0) goto L_0x0359
            goto L_0x0372
        L_0x0371:
            r11 = 0
        L_0x0372:
            te3.aw0 r11 = (te3.C48770aw0) r11
            if (r11 == 0) goto L_0x0379
            int r5 = r11.f130791f
            goto L_0x037a
        L_0x0379:
            r5 = 0
        L_0x037a:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "limit = "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r12 = " , mylevel = "
            r11.append(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "FinderLiveVisitorFansRightView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            if (r5 >= r4) goto L_0x03de
            android.view.View r4 = r3.f17876i
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r5.mo10233c(r10)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView"
            java.lang.String r19 = "updateContent"
            java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveFanClubGetIntimacyResp;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView"
            java.lang.String r18 = "updateContent"
            java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveFanClubGetIntimacyResp;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0512
        L_0x03de:
            java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r11 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r7 = r11.mo77630e(r7)
            cl1.x r7 = (cl1.C0696x) r7
            if (r7 == 0) goto L_0x04cd
            te3.ly0 r7 = r7.f1644g
            if (r7 == 0) goto L_0x04cd
            te3.oj r7 = r7.f137713n
            if (r7 == 0) goto L_0x04cd
            java.lang.String r11 = r7.f139210e
            if (r11 == 0) goto L_0x03fa
            r11 = 1
            goto L_0x03fb
        L_0x03fa:
            r11 = 0
        L_0x03fb:
            if (r11 == 0) goto L_0x03fe
            goto L_0x03ff
        L_0x03fe:
            r7 = 0
        L_0x03ff:
            if (r7 == 0) goto L_0x04cd
            di3.d r6 = di3.C86312j.m106911c(r6)
            gy3.C87412m.m108593f(r6, r8)
            r16 = r6
            ak1.w r16 = (ak1.C54116w) r16
            ak1.f0$t0 r17 = ak1.C54067f0.C0069t0.FANS_CLUB_ANNOUNCEMENT_SHOW
            r18 = 0
            r19 = 0
            r20 = 6
            r21 = 0
            ak1.C54116w.Yx0(r16, r17, r18, r19, r20, r21)
            android.view.View r6 = r3.f17876i
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r8.mo10233c(r12)
            java.lang.Object[] r23 = r8.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView"
            java.lang.String r25 = "updateAnnouncement"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r6
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r11 = 0
            java.lang.Object r8 = r8.mo10231a(r11)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView"
            java.lang.String r24 = "updateAnnouncement"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.widget.TextView r6 = r3.f17877j
            java.lang.String r8 = r7.f139210e
            r6.setText(r8)
            java.lang.String r6 = r7.f139211f
            if (r6 == 0) goto L_0x0474
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0472
            goto L_0x0474
        L_0x0472:
            r7 = 0
            goto L_0x0475
        L_0x0474:
            r7 = 1
        L_0x0475:
            r7 = r7 ^ r9
            if (r7 == 0) goto L_0x0479
            goto L_0x047a
        L_0x0479:
            r6 = 0
        L_0x047a:
            if (r6 == 0) goto L_0x04c0
            android.widget.ImageView r7 = r3.f17878n
            r8 = 0
            r7.setVisibility(r8)
            bl3.r r7 = bl3.C39818r.f106831a
            bl3.r$a r8 = r7.mo62446e(r5)
            bl3.c r8 = r8.mo62447c(r4)
            pl1.s0 r8 = (pl1.C11990s0) r8
            k60.d r8 = r8.mo11871f2()
            pl1.n0 r11 = new pl1.n0
            up1.y r12 = up1.C27696y.THUMB_IMAGE
            r11.<init>(r6, r12)
            android.widget.ImageView r12 = r3.f17878n
            java.lang.String r13 = "announcementCoverView"
            gy3.C87412m.m108593f(r12, r13)
            pl1.e0$a r13 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r5 = r7.mo62446e(r5)
            bl3.c r4 = r5.mo62447c(r4)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r4 = r4.mo11867O2(r13)
            r8.mo85957c(r11, r12, r4)
            android.widget.ImageView r4 = r3.f17878n
            com.tencent.mm.plugin.finder.view.k3 r5 = new com.tencent.mm.plugin.finder.view.k3
            r5.<init>(r6, r3)
            r4.setOnClickListener(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x04c1
        L_0x04c0:
            r4 = 0
        L_0x04c1:
            if (r4 != 0) goto L_0x04ca
            android.widget.ImageView r4 = r3.f17878n
            r5 = 8
            r4.setVisibility(r5)
        L_0x04ca:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x04ce
        L_0x04cd:
            r4 = 0
        L_0x04ce:
            if (r4 != 0) goto L_0x0512
            android.view.View r4 = r3.f17876i
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r5.mo10233c(r10)
            java.lang.Object[] r17 = r5.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView"
            java.lang.String r19 = "updateAnnouncement"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r4
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView"
            java.lang.String r18 = "updateAnnouncement"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0512:
            qk1.b1 r4 = r3.f17879o
            te3.hs0 r1 = r1.f137096o
            if (r1 == 0) goto L_0x051b
            java.util.LinkedList<te3.z41> r10 = r1.f134838d
            goto L_0x051c
        L_0x051b:
            r10 = 0
        L_0x051c:
            if (r10 == 0) goto L_0x0529
            java.util.LinkedList<te3.z41> r1 = r4.f36613d
            r1.clear()
            java.util.LinkedList<te3.z41> r1 = r4.f36613d
            r1.addAll(r10)
            goto L_0x052c
        L_0x0529:
            r4.getClass()
        L_0x052c:
            qk1.b1 r1 = r3.f17879o
            r1.notifyDataSetChanged()
            qk1.a1 r1 = r2.f28464D
            r3 = 2
            android.widget.FrameLayout[] r3 = new android.widget.FrameLayout[r3]
            com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansTaskView r4 = r2.f28462B
            r5 = 0
            r3[r5] = r4
            com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansRightView r4 = r2.f28463C
            r3[r9] = r4
            java.util.List r3 = sx3.C64197v.m75537f(r3)
            r1.getClass()
            java.util.ArrayList<android.view.View> r4 = r1.f36611e
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0553
            java.util.ArrayList<android.view.View> r4 = r1.f36611e
            r4.clear()
        L_0x0553:
            java.util.ArrayList<android.view.View> r4 = r1.f36611e
            r4.addAll(r3)
            r1.notifyDataSetChanged()
            com.google.android.material.tabs.TabLayout r1 = r2.f28466F
            r1.mo146910n()
            com.google.android.material.tabs.TabLayout r1 = r2.f28466F
            com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager r3 = r2.f28465E
            r1.setupWithViewPager(r3)
            com.google.android.material.tabs.TabLayout r1 = r2.f28466F
            r3 = 0
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146907k(r3)
            if (r1 != 0) goto L_0x0571
            goto L_0x057f
        L_0x0571:
            android.content.Context r3 = r2.getContext()
            r4 = 2131827392(0x7f111ac0, float:1.9287695E38)
            java.lang.String r3 = r3.getString(r4)
            r1.mo76123d(r3)
        L_0x057f:
            com.google.android.material.tabs.TabLayout r1 = r2.f28466F
            com.google.android.material.tabs.TabLayout$f r1 = r1.mo146907k(r9)
            if (r1 != 0) goto L_0x0588
            goto L_0x0596
        L_0x0588:
            android.content.Context r3 = r2.getContext()
            r4 = 2131827391(0x7f111abf, float:1.9287693E38)
            java.lang.String r3 = r3.getString(r4)
            r1.mo76123d(r3)
        L_0x0596:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_HAS_OPEN_FAN_CLUB_BOTTTOM_SHEET_BOOLEAN_SYNC
            r4 = 0
            boolean r1 = r1.mo119686g(r3, r4)
            if (r1 != 0) goto L_0x05c8
            com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager r1 = r2.f28465E
            il1.i4 r3 = new il1.i4
            r3.<init>(r2)
            r1.post(r3)
            goto L_0x05c8
        L_0x05b2:
            il1.h4 r1 = r0.f28372a
            android.content.Context r1 = r1.getContext()
            il1.h4 r2 = r0.f28372a
            android.content.Context r2 = r2.getContext()
            r3 = 2131827511(0x7f111b37, float:1.9287937E38)
            java.lang.String r2 = r2.getString(r3)
            nj3.C76912y0.m92767f(r1, r2)
        L_0x05c8:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C8975f4.call(java.lang.Object):java.lang.Object");
    }
}
