package eb2;

import ob0.C35142u;

/* renamed from: eb2.c */
public final class C58545c implements C35142u {
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x033e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, ob0.C117747y r20) {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            hb2.o r4 = hb2.C59830o.f170808a
            boolean r5 = r3 instanceof jb2.C46468t
            java.lang.String r6 = ", errMsg:"
            java.lang.String r7 = ", errType:"
            java.lang.String r8 = "MicroMsg.Mv.MvChattingDataManger"
            r10 = 0
            if (r5 == 0) goto L_0x006e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "NetSceneMusicMvJoin, errCode:"
            r5.append(r11)
            r5.append(r1)
            r5.append(r7)
            r5.append(r0)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            if (r0 != 0) goto L_0x04b2
            if (r1 != 0) goto L_0x04b2
            r0 = r3
            jb2.t r0 = (jb2.C46468t) r0
            te3.h23 r0 = r0.f125192n
            if (r0 == 0) goto L_0x04b2
            pe3.b r1 = r0.f134418d
            hb2.C59830o.f170819l = r1
            te3.kb1 r1 = hb2.C59830o.f170818k
            if (r1 != 0) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            java.lang.String r0 = r0.f134419e
            r1.f183909i = r0
        L_0x004d:
            r4.mo84787a(r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NetSceneMusicMvJoin songId:"
            r0.append(r1)
            te3.kb1 r1 = hb2.C59830o.f170818k
            if (r1 == 0) goto L_0x0061
            java.lang.String r9 = r1.f183909i
            goto L_0x0062
        L_0x0061:
            r9 = 0
        L_0x0062:
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x04b2
        L_0x006e:
            boolean r5 = r3 instanceof jb2.C46467s
            java.lang.String r11 = "commentAreaRvMap.values"
            java.lang.String r12 = " is added, continue"
            java.lang.String r15 = ""
            r9 = 1
            if (r5 == 0) goto L_0x0381
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "NetSceneMusicMvHeartbeat, errCode:"
            r5.append(r10)
            r5.append(r1)
            r5.append(r7)
            r5.append(r0)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            if (r0 != 0) goto L_0x04b2
            if (r1 != 0) goto L_0x04b2
            boolean r0 = hb2.C59830o.f170817j
            if (r0 != 0) goto L_0x04b2
            r0 = r3
            jb2.s r0 = (jb2.C46467s) r0
            te3.f23 r1 = r0.f125189n
            if (r1 == 0) goto L_0x0371
            java.lang.Class<fv.r> r2 = p529fv.C59331r.class
            int r3 = r1.f133253f
            hb2.C59830o.f170811d = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedList<te3.k23> r1 = r1.f133252e
            java.util.Iterator r1 = r1.iterator()
        L_0x00b9:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0120
            java.lang.Object r5 = r1.next()
            te3.k23 r5 = (te3.C64482k23) r5
            te3.i23 r6 = r5.f183874d
            if (r6 == 0) goto L_0x00d1
            int r7 = r6.f183594d
            r10 = 101(0x65, float:1.42E-43)
            if (r7 != r10) goto L_0x00d1
            r7 = 1
            goto L_0x00d2
        L_0x00d1:
            r7 = 0
        L_0x00d2:
            if (r7 == 0) goto L_0x00e6
            hb2.C59830o.f170812e = r9
            if (r6 == 0) goto L_0x00df
            te3.j23 r5 = r6.f183596f
            if (r5 == 0) goto L_0x00df
            java.lang.String r5 = r5.f135828d
            goto L_0x00e0
        L_0x00df:
            r5 = 0
        L_0x00e0:
            if (r5 != 0) goto L_0x00e3
            r5 = r15
        L_0x00e3:
            hb2.C59830o.f170813f = r5
            goto L_0x00b9
        L_0x00e6:
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c r6 = new com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c
            r6.<init>(r5)
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a r7 = new com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a
            r7.<init>(r6)
            java.util.List<java.lang.Long> r6 = hb2.C59830o.f170820m
            long r13 = r5.f183877g
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x0113
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r13 = r5.f183877g
            r6.append(r13)
            r6.append(r12)
            java.lang.String r5 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            goto L_0x00b9
        L_0x0113:
            long r13 = r5.f183877g
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            r6.add(r5)
            r3.add(r7)
            goto L_0x00b9
        L_0x0120:
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ r9
            if (r1 == 0) goto L_0x012c
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r1 = hb2.C59830o.f170821n
            r1.addAll(r3)
        L_0x012c:
            android.app.Activity r1 = hb2.C59830o.f170829v
            if (r1 == 0) goto L_0x0150
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r1 = r3.mo62443b(r1)
            java.lang.Class<sb2.e> r3 = sb2.C63756e.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(it).get(MusicMvDataUIC::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            sb2.e r1 = (sb2.C63756e) r1
            long r5 = r1.f180747o
            r12 = 2
            long r5 = r5 & r12
            r12 = 0
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0150
            r1 = 1
            goto L_0x0151
        L_0x0150:
            r1 = 0
        L_0x0151:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "chatroom switch status:"
            r3.append(r5)
            di3.d r5 = di3.C86312j.m106911c(r2)
            fv.r r5 = (p529fv.C59331r) r5
            boolean r5 = r5.mo84022PC()
            r3.append(r5)
            java.lang.String r5 = ", "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            di3.d r2 = di3.C86312j.m106911c(r2)
            fv.r r2 = (p529fv.C59331r) r2
            boolean r2 = r2.mo84022PC()
            r3 = 2131833349(0x7f113205, float:1.9299778E38)
            r5 = 2131833348(0x7f113204, float:1.9299776E38)
            java.lang.String r6 = "onlineUserTvMap.values"
            if (r2 == 0) goto L_0x02d7
            if (r1 == 0) goto L_0x02d7
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.LinearLayout>> r1 = hb2.C59830o.f170825r
            java.util.Collection r1 = r1.values()
            java.lang.String r2 = "chattingFooterLlMap.values"
            gy3.C87412m.m108593f(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x019d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01b7
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 != 0) goto L_0x01b2
            goto L_0x019d
        L_0x01b2:
            r7 = 0
            r2.setVisibility(r7)
            goto L_0x019d
        L_0x01b7:
            boolean r1 = hb2.C59830o.f170812e
            r2 = 8
            java.lang.String r7 = "userEnterTipTvMap.values"
            if (r1 == 0) goto L_0x022b
            java.lang.String r1 = hb2.C59830o.f170813f
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x01ca
            r1 = 1
            goto L_0x01cb
        L_0x01ca:
            r1 = 0
        L_0x01cb:
            if (r1 == 0) goto L_0x022b
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.TextView>> r1 = hb2.C59830o.f170822o
            java.util.Collection r1 = r1.values()
            gy3.C87412m.m108593f(r1, r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x01da:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01f3
            java.lang.Object r3 = r1.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 != 0) goto L_0x01ef
            goto L_0x01da
        L_0x01ef:
            r3.setVisibility(r2)
            goto L_0x01da
        L_0x01f3:
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.TextView>> r1 = hb2.C59830o.f170823p
            java.util.Collection r1 = r1.values()
            gy3.C87412m.m108593f(r1, r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x0200:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x021e
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0200
            java.lang.String r3 = hb2.C59830o.f170813f
            r2.setText(r3)
            r3 = 0
            r2.setVisibility(r3)
            goto L_0x0200
        L_0x021e:
            r3 = 0
            com.tencent.mm.sdk.platformtools.MMHandler r1 = hb2.C59830o.f170830w
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            r5 = 2000(0x7d0, double:9.88E-321)
            r1.sendEmptyMessageDelayed(r3, r5)
            goto L_0x029a
        L_0x022b:
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.TextView>> r1 = hb2.C59830o.f170822o
            java.util.Collection r1 = r1.values()
            gy3.C87412m.m108593f(r1, r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x0238:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0274
            java.lang.Object r6 = r1.next()
            java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
            java.lang.Object r6 = r6.get()
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0238
            int r8 = hb2.C59830o.f170811d
            if (r8 > r9) goto L_0x025a
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = r8.getString(r3)
            r13 = 0
            goto L_0x026d
        L_0x025a:
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            int r12 = hb2.C59830o.f170811d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 0
            r10[r13] = r12
            java.lang.String r8 = r8.getString(r5, r10)
        L_0x026d:
            r6.setText(r8)
            r6.setVisibility(r13)
            goto L_0x0238
        L_0x0274:
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.TextView>> r1 = hb2.C59830o.f170823p
            java.util.Collection r1 = r1.values()
            gy3.C87412m.m108593f(r1, r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x0281:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x029a
            java.lang.Object r3 = r1.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 != 0) goto L_0x0296
            goto L_0x0281
        L_0x0296:
            r3.setVisibility(r2)
            goto L_0x0281
        L_0x029a:
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView>> r1 = hb2.C59830o.f170824q
            java.util.Collection r1 = r1.values()
            gy3.C87412m.m108593f(r1, r11)
            java.util.Iterator r1 = r1.iterator()
        L_0x02a7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0320
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r3 = hb2.C59830o.f170821n
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r9
            if (r3 == 0) goto L_0x02a7
            java.lang.Object r3 = r2.get()
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r3 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView) r3
            if (r3 != 0) goto L_0x02c5
            goto L_0x02c9
        L_0x02c5:
            r5 = 0
            r3.setVisibility(r5)
        L_0x02c9:
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r2 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView) r2
            if (r2 == 0) goto L_0x02a7
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r3 = hb2.C59830o.f170821n
            r2.mo80544c(r3)
            goto L_0x02a7
        L_0x02d7:
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.TextView>> r1 = hb2.C59830o.f170822o
            java.util.Collection r1 = r1.values()
            gy3.C87412m.m108593f(r1, r6)
            java.util.Iterator r1 = r1.iterator()
        L_0x02e4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0320
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x02e4
            int r6 = hb2.C59830o.f170811d
            if (r6 > r9) goto L_0x0306
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = r6.getString(r3)
            r10 = 0
            goto L_0x0319
        L_0x0306:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r7 = new java.lang.Object[r9]
            int r8 = hb2.C59830o.f170811d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 0
            r7[r10] = r8
            java.lang.String r6 = r6.getString(r5, r7)
        L_0x0319:
            r2.setText(r6)
            r2.setVisibility(r10)
            goto L_0x02e4
        L_0x0320:
            java.lang.Integer r1 = hb2.C59830o.f170814g
            java.lang.Long r2 = hb2.C59830o.f170815h
            if (r1 == 0) goto L_0x035f
            if (r2 == 0) goto L_0x035f
            long r2 = r2.longValue()
            int r1 = r1.intValue()
            java.util.HashMap<java.lang.Integer, java.lang.Long> r5 = hb2.C59830o.f170816i
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Object r6 = r5.get(r6)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto L_0x0344
            r7 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r7)
        L_0x0344:
            java.lang.String r7 = "onlineUserTimeMap[lastOnlineCount] ?: 0L"
            gy3.C87412m.m108593f(r6, r7)
            long r6 = r6.longValue()
            long r8 = eb0.C31543z5.m39453c()
            long r8 = r8 - r2
            long r6 = r6 + r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r5.put(r1, r2)
        L_0x035f:
            int r1 = hb2.C59830o.f170811d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            hb2.C59830o.f170814g = r1
            long r1 = eb0.C31543z5.m39453c()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            hb2.C59830o.f170815h = r1
        L_0x0371:
            te3.f23 r0 = r0.f125189n
            if (r0 == 0) goto L_0x0378
            pe3.b r9 = r0.f133251d
            goto L_0x0379
        L_0x0378:
            r9 = 0
        L_0x0379:
            hb2.C59830o.f170819l = r9
            r0 = 0
            r4.mo84787a(r0)
            goto L_0x04b2
        L_0x0381:
            boolean r4 = r3 instanceof jb2.C46469u
            if (r4 == 0) goto L_0x049e
            jb2.u r4 = hb2.C59830o.f170826s
            boolean r4 = gy3.C87412m.m108589b(r3, r4)
            if (r4 == 0) goto L_0x049e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NetSceneMusicMvPostLiveMsg, errCode:"
            r4.append(r5)
            r4.append(r1)
            r4.append(r7)
            r4.append(r0)
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            if (r0 != 0) goto L_0x0486
            if (r1 != 0) goto L_0x0486
            r0 = r3
            jb2.u r0 = (jb2.C46469u) r0
            te3.n23 r0 = r0.f125195n
            if (r0 == 0) goto L_0x04b2
            te3.k23 r0 = r0.f138353d
            if (r0 == 0) goto L_0x04b2
            long r1 = r0.f183877g
            r3 = 0
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x046e
            te3.i23 r1 = r0.f183874d
            if (r1 != 0) goto L_0x03ca
            goto L_0x046e
        L_0x03ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onPostMsgEnd, msg.songId:"
            r1.append(r2)
            java.lang.String r2 = r0.f183879i
            r1.append(r2)
            java.lang.String r2 = ", content:"
            r1.append(r2)
            te3.i23 r2 = r0.f183874d
            if (r2 == 0) goto L_0x03ea
            te3.l23 r2 = r2.f183595e
            if (r2 == 0) goto L_0x03ea
            java.lang.String r2 = r2.f184027d
            goto L_0x03eb
        L_0x03ea:
            r2 = 0
        L_0x03eb:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            java.util.List<java.lang.Long> r1 = hb2.C59830o.f170820m
            long r2 = r0.f183877g
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x0419
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r2 = r0.f183877g
            r1.append(r2)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x04b2
        L_0x0419:
            long r2 = r0.f183877g
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.add(r2)
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c r1 = new com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$c
            r1.<init>(r0)
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a r0 = new com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a
            r0.<init>(r1)
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r1 = hb2.C59830o.f170821n
            r1.add(r0)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView>> r0 = hb2.C59830o.f170824q
            java.util.Collection r0 = r0.values()
            gy3.C87412m.m108593f(r0, r11)
            java.util.Iterator r0 = r0.iterator()
        L_0x043e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04b2
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r2 = hb2.C59830o.f170821n
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r9
            if (r2 == 0) goto L_0x043e
            java.lang.Object r2 = r1.get()
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r2 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView) r2
            r3 = 0
            if (r2 != 0) goto L_0x045d
            goto L_0x0460
        L_0x045d:
            r2.setVisibility(r3)
        L_0x0460:
            java.lang.Object r1 = r1.get()
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r1 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView) r1
            if (r1 == 0) goto L_0x043e
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r2 = hb2.C59830o.f170821n
            r1.mo80544c(r2)
            goto L_0x043e
        L_0x046e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onPostMsgEnd, null == msgPack.msg, msgid:"
            r1.append(r2)
            long r2 = r0.f183877g
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x04b2
        L_0x0486:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 != 0) goto L_0x04b2
            android.app.Activity r0 = hb2.C59830o.f170829v
            if (r0 == 0) goto L_0x0498
            r1 = 2131821557(0x7f1103f5, float:1.927586E38)
            java.lang.String r1 = r0.getString(r1)
            goto L_0x0499
        L_0x0498:
            r1 = 0
        L_0x0499:
            r3 = 0
            nj3.C76879j.m92754y(r0, r2, r15, r1, r3)
            goto L_0x04b2
        L_0x049e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid: Scene"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x04b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb2.C58545c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
