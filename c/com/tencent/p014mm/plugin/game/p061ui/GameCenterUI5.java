package com.tencent.p014mm.plugin.game.p061ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42051e1;
import com.tencent.p014mm.plugin.game.model.C42070k0;
import com.tencent.p014mm.plugin.game.model.C42094s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK;
import di3.C86312j;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import pe3.C47465a;
import py1.C47712z1;
import ry1.C48144p;
import sw1.C48483p;
import sw1.C48484q;
import uy1.C52638a;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameCenterUI5 */
public class GameCenterUI5 extends GameCenterBaseUI implements C11385n {

    /* renamed from: A */
    public boolean f113704A = true;

    /* renamed from: r */
    public GameNewTopBannerView f113705r;

    /* renamed from: s */
    public GameIndexSearchView f113706s;

    /* renamed from: t */
    public GameIndexWxagView f113707t;

    /* renamed from: u */
    public GameMessageBubbleView f113708u;

    /* renamed from: v */
    public GameBlockView f113709v;

    /* renamed from: w */
    public GameRecomBlockView f113710w;

    /* renamed from: x */
    public GameNewClassifyView f113711x;

    /* renamed from: y */
    public GameIndexListView f113712y;

    /* renamed from: z */
    public Dialog f113713z;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameCenterUI5$a */
    public class C42162a implements MenuItem.OnMenuItemClickListener {
        public C42162a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameCenterUI5.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameCenterUI5$b */
    public class C42163b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47465a f113715d;

        /* renamed from: e */
        public final /* synthetic */ long f113716e;

        /* renamed from: com.tencent.mm.plugin.game.ui.GameCenterUI5$b$a */
        public class C42164a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C42070k0 f113718d;

            public C42164a(C42070k0 k0Var) {
                this.f113718d = k0Var;
            }

            public void run() {
                try {
                    GameCenterUI5.m45861N7(GameCenterUI5.this, this.f113718d, 2);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.GameCenterUI5", "GameCenter crash, %s", e.getMessage());
                    GameCenterUI5.this.finish();
                }
                Dialog dialog = GameCenterUI5.this.f113713z;
                if (dialog != null) {
                    dialog.dismiss();
                }
                Log.m105925i("MicroMsg.GameCenterUI5", "Server data parsing time: %d", Long.valueOf(System.currentTimeMillis() - C42163b.this.f113716e));
            }
        }

        public C42163b(C47465a aVar, long j) {
            this.f113715d = aVar;
            this.f113716e = j;
        }

        public void run() {
            C47712z1 z1Var;
            C47465a aVar = this.f113715d;
            if (aVar == null) {
                z1Var = new C47712z1();
            } else {
                z1Var = (C47712z1) aVar;
                ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57119qq("pb_index_4", z1Var);
            }
            MMHandlerThread.postToMainThread(new C42164a(new C42070k0(z1Var, true)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0898  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x089d  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0a78  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x023a  */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45861N7(com.tencent.p014mm.plugin.game.p061ui.GameCenterUI5 r33, com.tencent.p014mm.plugin.game.model.C42070k0 r34, int r35) {
        /*
            r0 = r33
            r1 = r34
            r2 = r35
            boolean r3 = r33.isFinishing()
            java.lang.String r4 = "MicroMsg.GameCenterUI5"
            if (r3 == 0) goto L_0x0015
            java.lang.String r0 = "GameCenterUI5 hasFinished"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x0bf4
        L_0x0015:
            if (r1 != 0) goto L_0x001e
            java.lang.String r0 = "Null data"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x0bf4
        L_0x001e:
            com.tencent.mm.plugin.game.ui.GameNewTopBannerView r3 = r0.f113705r
            py1.b3 r4 = r1.f113350b
            int r5 = r0.f113685i
            boolean r6 = r0.f113689p
            r7 = 0
            r8 = 2
            r9 = 1
            r10 = 8
            r11 = 0
            if (r4 == 0) goto L_0x01a2
            r3.getClass()
            py1.x3 r12 = r4.f127596e
            if (r12 == 0) goto L_0x01a2
            java.lang.String r12 = r12.f128148i
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x003f
            goto L_0x01a2
        L_0x003f:
            r3.f114100i = r5
            py1.d5 r5 = r4.f127595d
            if (r5 == 0) goto L_0x004c
            java.lang.String r5 = r5.f127646g
            java.lang.String r5 = qy1.C12934a.m12382d(r5)
            goto L_0x004d
        L_0x004c:
            r5 = r7
        L_0x004d:
            r3.f114102n = r5
            java.lang.String r5 = r3.f114101j
            py1.x3 r12 = r4.f127596e
            java.lang.String r12 = r12.f128148i
            boolean r5 = r5.equals(r12)
            if (r5 == 0) goto L_0x007d
            if (r2 != r8) goto L_0x01b1
            android.content.Context r12 = r3.f114095d
            r13 = 10
            r14 = 1017(0x3f9, float:1.425E-42)
            r15 = 1
            r16 = 1
            r17 = 0
            r18 = 0
            int r4 = r3.f114100i
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r3 = r3.f114102n
            r19 = r4
            r23 = r3
            com.tencent.p014mm.game.report.C40314g.m43485d(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x01b1
        L_0x007d:
            py1.x3 r5 = r4.f127596e
            java.lang.String r5 = r5.f128148i
            r3.f114101j = r5
            uy1.f r5 = uy1.C52645f.m59023a()
            android.widget.ImageView r12 = r3.f114097f
            py1.x3 r13 = r4.f127596e
            java.lang.String r13 = r13.f128148i
            r5.mo73595e(r12, r13, r7, r7)
            android.widget.ImageView r5 = r3.f114097f
            android.content.Context r12 = r3.f114095d
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131165524(0x7f070154, float:1.7945268E38)
            int r12 = r12.getDimensionPixelSize(r13)
            android.content.Context r13 = r3.f114095d
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131165523(0x7f070153, float:1.7945266E38)
            int r13 = r13.getDimensionPixelSize(r14)
            int r5 = r3.mo66253a(r5, r12, r13)
            r3.f114098g = r5
            if (r5 <= 0) goto L_0x0195
            if (r2 != r8) goto L_0x00d5
            android.content.Context r15 = r3.f114095d
            r16 = 10
            r17 = 1017(0x3f9, float:1.425E-42)
            r18 = 1
            r19 = 1
            r20 = 0
            r21 = 0
            int r5 = r3.f114100i
            r23 = 0
            r24 = 0
            r25 = 0
            java.lang.String r12 = r3.f114102n
            r22 = r5
            r26 = r12
            com.tencent.p014mm.game.report.C40314g.m43485d(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x00d5:
            int r5 = r3.f114098g
            if (r5 <= 0) goto L_0x012d
            py1.d5 r5 = r4.f127595d
            if (r5 == 0) goto L_0x012d
            java.lang.String r5 = r5.f127643d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x012d
            uy1.f r5 = uy1.C52645f.m59023a()
            android.widget.ImageView r12 = r3.f114096e
            py1.d5 r13 = r4.f127595d
            java.lang.String r13 = r13.f127643d
            r5.mo73595e(r12, r13, r7, r7)
            android.widget.ImageView r5 = r3.f114096e
            android.content.Context r12 = r3.f114095d
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131165521(0x7f070151, float:1.7945261E38)
            int r12 = r12.getDimensionPixelSize(r13)
            android.content.Context r13 = r3.f114095d
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getDimensionPixelSize(r14)
            int r5 = r3.mo66253a(r5, r12, r13)
            r3.f114099h = r5
            if (r5 <= 0) goto L_0x0127
            android.widget.ImageView r5 = r3.f114096e
            r5.setVisibility(r11)
            android.widget.ImageView r5 = r3.f114096e
            py1.d5 r12 = r4.f127595d
            java.lang.String r12 = r12.f127644e
            r5.setTag(r12)
            android.widget.ImageView r5 = r3.f114096e
            r5.setOnClickListener(r3)
            goto L_0x0132
        L_0x0127:
            android.widget.ImageView r5 = r3.f114096e
            r5.setVisibility(r10)
            goto L_0x0132
        L_0x012d:
            android.widget.ImageView r5 = r3.f114096e
            r5.setVisibility(r10)
        L_0x0132:
            android.widget.ImageView r5 = r3.f114096e
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x0188
            android.content.Context r5 = r3.f114095d
            java.lang.String r12 = "game_center_pref"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r12, r11)
            java.lang.String r13 = "game_top_banner_id"
            int r5 = r5.getInt(r13, r11)
            py1.d5 r14 = r4.f127595d
            int r14 = r14.f127645f
            if (r14 == r5) goto L_0x016f
            if (r6 == 0) goto L_0x0151
            goto L_0x016f
        L_0x0151:
            android.widget.ImageView r5 = r3.f114097f
            r5.setImageAlpha(r11)
            android.content.Context r5 = r3.f114095d
            py1.d5 r4 = r4.f127595d
            int r4 = r4.f127645f
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r12, r11)
            android.content.SharedPreferences$Editor r5 = r5.edit()
            android.content.SharedPreferences$Editor r4 = r5.putInt(r13, r4)
            r4.apply()
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setInitPadding(r11)
            goto L_0x017c
        L_0x016f:
            int r4 = r3.f114098g
            int r5 = r3.f114099h
            int r4 = r4 - r5
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setInitPadding(r4)
            android.widget.ImageView r4 = r3.f114096e
            r4.setImageAlpha(r11)
        L_0x017c:
            int r4 = r3.f114098g
            int r5 = r3.f114099h
            int r4 = r4 - r5
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setDefaultPadding(r4)
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setCanPulldown(r9)
            goto L_0x0191
        L_0x0188:
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setDefaultPadding(r11)
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setInitPadding(r11)
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setCanPulldown(r11)
        L_0x0191:
            r3.setVisibility(r11)
            goto L_0x01b1
        L_0x0195:
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setDefaultPadding(r11)
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setInitPadding(r11)
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setCanPulldown(r11)
            r3.setVisibility(r10)
            goto L_0x01b1
        L_0x01a2:
            r3.getClass()
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setDefaultPadding(r11)
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setInitPadding(r11)
            com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.setCanPulldown(r11)
            r3.setVisibility(r10)
        L_0x01b1:
            com.tencent.mm.plugin.game.ui.GameIndexSearchView r3 = r0.f113706s
            py1.b3 r4 = r1.f113350b
            int r5 = r0.f113685i
            if (r4 == 0) goto L_0x0226
            r3.getClass()
            py1.x3 r6 = r4.f127596e
            if (r6 == 0) goto L_0x0226
            py1.y3 r6 = r6.f128147h
            if (r6 != 0) goto L_0x01c5
            goto L_0x0226
        L_0x01c5:
            r3.removeAllViews()
            py1.x3 r4 = r4.f127596e
            py1.y3 r4 = r4.f128147h
            r3.setVisibility(r11)
            android.view.LayoutInflater r6 = r3.f113964e
            r12 = 2131495847(0x7f0c0ba7, float:1.8615242E38)
            r6.inflate(r12, r3, r9)
            r6 = 2131312920(0x7f094118, float:1.8244222E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r12 = 2131312967(0x7f094147, float:1.8244317E38)
            android.view.View r12 = r3.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            uy1.f$d$a r13 = new uy1.f$d$a
            r13.<init>()
            java.lang.String r14 = r4.f128167d
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x0204
            uy1.f r14 = uy1.C52645f.m59023a()
            java.lang.String r15 = r4.f128167d
            uy1.f$d r13 = r13.mo73598a()
            r14.mo73595e(r6, r15, r13, r7)
            goto L_0x0207
        L_0x0204:
            r6.setVisibility(r10)
        L_0x0207:
            java.lang.String r6 = r4.f128168e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0215
            java.lang.String r6 = r4.f128168e
            r12.setText(r6)
            goto L_0x0218
        L_0x0215:
            r12.setVisibility(r10)
        L_0x0218:
            java.lang.String r4 = r4.f128169f
            r3.setTag(r4)
            ry1.h0 r4 = new ry1.h0
            r4.<init>(r3, r5)
            r3.setOnClickListener(r4)
            goto L_0x0229
        L_0x0226:
            r3.setVisibility(r10)
        L_0x0229:
            com.tencent.mm.plugin.game.ui.GameIndexWxagView r3 = r0.f113707t
            py1.f1 r4 = r1.f113354f
            int r5 = r0.f113685i
            r15 = 5
            r14 = 2131100817(0x7f060491, float:1.7814026E38)
            r6 = -1
            if (r4 != 0) goto L_0x023a
            r3.setVisibility(r10)
            goto L_0x0253
        L_0x023a:
            r3.f113966e = r5
            r3.setVisibility(r11)
            android.view.ViewGroup r12 = r3.f113967f
            r12.removeAllViews()
            java.util.LinkedList<py1.c4> r12 = r4.f127686f
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r12)
            if (r12 == 0) goto L_0x0259
            py1.s5 r12 = r4.f127687g
            if (r12 != 0) goto L_0x0259
            r3.setVisibility(r10)
        L_0x0253:
            r6 = 2131100817(0x7f060491, float:1.7814026E38)
            r8 = 5
            goto L_0x03e4
        L_0x0259:
            if (r2 != r8) goto L_0x0286
            android.content.Context r12 = r3.getContext()
            r17 = 10
            r18 = 1025(0x401, float:1.436E-42)
            r19 = 0
            r21 = 1
            r22 = 0
            java.lang.String r13 = r4.f127688h
            java.lang.String r24 = qy1.C12934a.m12382d(r13)
            r13 = 1065353216(0x3f800000, float:1.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = -2
            r13 = r17
            r14 = r18
            r15 = r19
            r16 = r21
            r17 = r22
            r18 = r5
            r19 = r24
            qy1.C12934a.m12380b(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0289
        L_0x0286:
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = -2
        L_0x0289:
            android.view.LayoutInflater r12 = r3.f113965d
            r13 = 2131495768(0x7f0c0b58, float:1.8615082E38)
            r12.inflate(r13, r3, r9)
            r12 = 2131317298(0x7f095232, float:1.8253102E38)
            android.view.View r12 = r3.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131317296(0x7f095230, float:1.8253098E38)
            android.view.View r13 = r3.findViewById(r13)
            r15 = r13
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            java.lang.String r13 = r4.f127685e
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x02b2
            java.lang.String r13 = r4.f127685e
            r12.setText(r13)
            goto L_0x02b5
        L_0x02b2:
            r12.setVisibility(r10)
        L_0x02b5:
            r12 = 0
        L_0x02b6:
            r13 = 4
            if (r12 >= r13) goto L_0x02cf
            android.view.LayoutInflater r13 = r3.f113965d
            r14 = 2131495767(0x7f0c0b57, float:1.861508E38)
            android.view.View r13 = r13.inflate(r14, r3, r11)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r14.<init>(r6, r8, r7)
            r15.addView(r13, r14)
            int r12 = r12 + 1
            goto L_0x02b6
        L_0x02cf:
            java.util.LinkedList<py1.c4> r12 = r4.f127686f
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r12)
            r14 = 2131317295(0x7f09522f, float:1.8253096E38)
            r13 = 2131317297(0x7f095231, float:1.82531E38)
            if (r12 != 0) goto L_0x037b
            r7 = 0
            r12 = 0
        L_0x02df:
            java.util.LinkedList<py1.c4> r8 = r4.f127686f
            int r8 = r8.size()
            if (r12 >= r8) goto L_0x0379
            java.util.LinkedList<py1.c4> r8 = r4.f127686f
            java.lang.Object r8 = r8.get(r12)
            py1.c4 r8 = (py1.C47559c4) r8
            if (r8 == 0) goto L_0x0366
            py1.r5 r9 = r8.f127626d
            if (r9 == 0) goto L_0x0366
            py1.s5 r9 = r9.f127981d
            if (r9 == 0) goto L_0x0366
            android.view.View r9 = r15.getChildAt(r7)
            android.view.View r16 = r9.findViewById(r14)
            r14 = r16
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            android.view.View r16 = r9.findViewById(r13)
            r13 = r16
            android.widget.TextView r13 = (android.widget.TextView) r13
            uy1.f r11 = uy1.C52645f.m59023a()
            py1.r5 r10 = r8.f127626d
            py1.s5 r10 = r10.f127981d
            java.lang.String r10 = r10.f128006f
            r6 = 0
            r11.mo73595e(r14, r10, r6, r6)
            py1.r5 r6 = r8.f127626d
            py1.s5 r6 = r6.f127981d
            java.lang.String r6 = r6.f128005e
            r13.setText(r6)
            r6 = 2
            if (r2 != r6) goto L_0x034e
            android.content.Context r6 = r3.getContext()
            r13 = 10
            r14 = 1025(0x401, float:1.436E-42)
            int r10 = r7 + 1
            r16 = 1
            py1.r5 r11 = r8.f127626d
            py1.s5 r11 = r11.f127981d
            java.lang.String r11 = r11.f128004d
            r19 = 0
            r27 = r12
            r12 = r6
            r6 = 2131317297(0x7f095231, float:1.82531E38)
            r6 = 2131317295(0x7f09522f, float:1.8253096E38)
            r6 = r15
            r15 = r10
            r17 = r11
            r18 = r5
            qy1.C12934a.m12380b(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0351
        L_0x034e:
            r27 = r12
            r6 = r15
        L_0x0351:
            com.tencent.mm.plugin.game.ui.GameIndexWxagView$a r10 = new com.tencent.mm.plugin.game.ui.GameIndexWxagView$a
            int r7 = r7 + 1
            py1.r5 r8 = r8.f127626d
            py1.s5 r8 = r8.f127981d
            r10.<init>(r7, r8)
            r9.setTag(r10)
            r9.setOnClickListener(r3)
            r8 = 3
            if (r7 < r8) goto L_0x0369
            goto L_0x037d
        L_0x0366:
            r27 = r12
            r6 = r15
        L_0x0369:
            int r12 = r27 + 1
            r15 = r6
            r6 = -1
            r9 = 1
            r10 = 8
            r11 = 0
            r13 = 2131317297(0x7f095231, float:1.82531E38)
            r14 = 2131317295(0x7f09522f, float:1.8253096E38)
            goto L_0x02df
        L_0x0379:
            r6 = r15
            goto L_0x037d
        L_0x037b:
            r6 = r15
            r7 = 0
        L_0x037d:
            py1.s5 r8 = r4.f127687g
            if (r8 == 0) goto L_0x03b7
            android.view.View r6 = r6.getChildAt(r7)
            r7 = 2131317295(0x7f09522f, float:1.8253096E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131317297(0x7f095231, float:1.82531E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            uy1.f r9 = uy1.C52645f.m59023a()
            py1.s5 r10 = r4.f127687g
            java.lang.String r10 = r10.f128006f
            r11 = 0
            r9.mo73595e(r7, r10, r11, r11)
            py1.s5 r7 = r4.f127687g
            java.lang.String r7 = r7.f128005e
            r8.setText(r7)
            py1.s5 r4 = r4.f127687g
            r6.setTag(r4)
            ry1.i0 r4 = new ry1.i0
            r4.<init>(r3, r5)
            r6.setOnClickListener(r4)
        L_0x03b7:
            android.view.View r4 = new android.view.View
            android.content.Context r5 = r3.getContext()
            r4.<init>(r5)
            android.content.Context r5 = r3.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131100817(0x7f060491, float:1.7814026E38)
            int r5 = r5.getColor(r6)
            r4.setBackgroundColor(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r7 = r3.getContext()
            r8 = 5
            int r7 = kg3.C76577a.m92151b(r7, r8)
            r9 = -1
            r5.<init>(r9, r7)
            r3.addView(r4, r5)
        L_0x03e4:
            boolean r3 = r0.f113684h
            if (r3 == 0) goto L_0x03ed
            com.tencent.mm.plugin.game.ui.GameMessageBubbleView r3 = r0.f113708u
            r3.mo66241a()
        L_0x03ed:
            com.tencent.mm.plugin.game.ui.GameBlockView r3 = r0.f113709v
            com.tencent.mm.plugin.game.model.k0$a r4 = r1.f113351c
            int r5 = r0.f113685i
            if (r4 != 0) goto L_0x03ff
            r7 = 8
            r3.setVisibility(r7)
            r1 = r0
            r0 = 8
            goto L_0x088e
        L_0x03ff:
            ry1.k0 r7 = r3.f113657g
            r7.f129022d = r5
            r7 = 0
            r3.setVisibility(r7)
            android.widget.LinearLayout r7 = r3.f113656f
            r7.removeAllViews()
            com.tencent.mm.plugin.game.model.b r7 = r4.f113355a
            if (r7 == 0) goto L_0x0887
            java.lang.String r7 = r7.field_appId
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0887
            com.tencent.mm.plugin.game.model.b r7 = r4.f113355a
            java.lang.String r7 = r7.field_appName
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0424
            goto L_0x0887
        L_0x0424:
            r7 = 2
            if (r2 != r7) goto L_0x043b
            android.content.Context r9 = r3.getContext()
            r10 = 10
            r11 = 1002(0x3ea, float:1.404E-42)
            r12 = 0
            r13 = 1
            com.tencent.mm.plugin.game.model.b r7 = r4.f113355a
            java.lang.String r14 = r7.field_appId
            r16 = 0
            r15 = r5
            qy1.C12934a.m12380b(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x043b:
            com.tencent.mm.plugin.game.model.b r7 = r4.f113355a
            com.tencent.mm.plugin.game.ui.GameBlockView$a r9 = new com.tencent.mm.plugin.game.ui.GameBlockView$a
            r10 = 0
            r9.<init>(r10)
            r3.f113658h = r9
            android.view.LayoutInflater r9 = r3.f113654d
            android.widget.LinearLayout r10 = r3.f113656f
            r11 = 2131495762(0x7f0c0b52, float:1.861507E38)
            r12 = 0
            android.view.View r9 = r9.inflate(r11, r10, r12)
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            r11 = 2131308871(0x7f093147, float:1.823601E38)
            android.view.View r11 = r9.findViewById(r11)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r10.f113659a = r11
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            r11 = 2131305462(0x7f0923f6, float:1.8229096E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10.f113660b = r11
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            r11 = 2131305541(0x7f092445, float:1.8229256E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f113661c = r11
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            r11 = 2131305379(0x7f0923a3, float:1.8228927E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10.f113662d = r11
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            r11 = 2131305439(0x7f0923df, float:1.8229049E38)
            android.view.View r11 = r9.findViewById(r11)
            com.tencent.mm.plugin.game.ui.GameDownloadView r11 = (com.tencent.p014mm.plugin.game.p061ui.GameDownloadView) r11
            r10.f113663e = r11
            uy1.f r10 = uy1.C52645f.m59023a()
            com.tencent.mm.plugin.game.ui.GameBlockView$a r11 = r3.f113658h
            android.widget.ImageView r11 = r11.f113660b
            java.lang.String r12 = r7.field_appId
            android.content.Context r13 = r3.getContext()
            float r13 = kg3.C76577a.m92156g(r13)
            r10.mo73592b(r11, r12, r13)
            java.lang.String r10 = r7.field_appName
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r11 != 0) goto L_0x04d2
            java.lang.String r11 = r7.field_appName
            int r11 = r11.length()
            r12 = 8
            if (r11 <= r12) goto L_0x04d2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r7.field_appName
            r12 = 7
            r13 = 0
            java.lang.String r11 = r11.substring(r13, r12)
            r10.append(r11)
            java.lang.String r11 = "..."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
        L_0x04d2:
            com.tencent.mm.plugin.game.ui.GameBlockView$a r11 = r3.f113658h
            android.widget.TextView r11 = r11.f113661c
            r11.setText(r10)
            java.lang.String r10 = r7.f113249B1
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x04f3
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            android.widget.TextView r10 = r10.f113662d
            java.lang.String r11 = r7.f113249B1
            r10.setText(r11)
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            android.widget.TextView r10 = r10.f113662d
            r11 = 0
            r10.setVisibility(r11)
            goto L_0x04fc
        L_0x04f3:
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            android.widget.TextView r10 = r10.f113662d
            r11 = 8
            r10.setVisibility(r11)
        L_0x04fc:
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            com.tencent.mm.plugin.game.ui.GameDownloadView r10 = r10.f113663e
            com.tencent.mm.plugin.game.model.t r11 = new com.tencent.mm.plugin.game.model.t
            r11.<init>(r7)
            r10.setDownloadInfo(r11)
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            android.view.ViewGroup r10 = r10.f113659a
            ry1.k0 r11 = r3.f113657g
            r10.setOnClickListener(r11)
            com.tencent.mm.plugin.game.ui.GameBlockView$a r10 = r3.f113658h
            android.view.ViewGroup r10 = r10.f113659a
            r10.setTag(r7)
            android.widget.LinearLayout r7 = r3.f113656f
            r7.addView(r9)
            ry1.k r7 = new ry1.k
            android.content.Context r9 = r3.getContext()
            r7.<init>(r9)
            py1.z0 r9 = r4.f113357c
            com.tencent.mm.plugin.game.model.b r10 = r4.f113355a
            java.lang.String r15 = r10.field_appId
            if (r9 == 0) goto L_0x0611
            java.util.LinkedList<py1.r> r10 = r9.f128174d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r10)
            if (r10 == 0) goto L_0x0538
            goto L_0x0611
        L_0x0538:
            java.util.LinkedList<py1.r> r10 = r9.f128174d
            int r10 = r10.size()
            r11 = 1
            if (r10 != r11) goto L_0x054d
            java.util.LinkedList<py1.r> r10 = r9.f128174d
            r11 = 0
            r10.add(r11)
            java.util.LinkedList<py1.r> r10 = r9.f128174d
            r10.add(r11)
            goto L_0x055c
        L_0x054d:
            r11 = 0
            java.util.LinkedList<py1.r> r10 = r9.f128174d
            int r10 = r10.size()
            r12 = 2
            if (r10 != r12) goto L_0x055c
            java.util.LinkedList<py1.r> r10 = r9.f128174d
            r10.add(r11)
        L_0x055c:
            r7.f129021g = r15
            r7.f129020f = r5
            java.util.LinkedList<py1.r> r9 = r9.f128174d
            java.util.Iterator r17 = r9.iterator()
        L_0x0566:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L_0x0616
            java.lang.Object r9 = r17.next()
            py1.r r9 = (py1.C47659r) r9
            android.view.LayoutInflater r10 = r7.f129019e
            r11 = 2131495761(0x7f0c0b51, float:1.8615068E38)
            r12 = 0
            android.view.View r10 = r10.inflate(r11, r7, r12)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r13 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r12, r12, r13)
            r7.addView(r10, r11)
            r11 = 2131301678(0x7f09152e, float:1.822142E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r12 = 2131301680(0x7f091530, float:1.8221425E38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131301677(0x7f09152d, float:1.8221419E38)
            android.view.View r13 = r10.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            if (r9 != 0) goto L_0x05c3
            r9 = 2131233246(0x7f0809de, float:1.8082624E38)
            r11.setImageResource(r9)
            r9 = 2131830964(0x7f1128b4, float:1.929494E38)
            r12.setText(r9)
            android.content.Context r9 = r7.f129018d
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131100847(0x7f0604af, float:1.7814087E38)
            int r9 = r9.getColor(r10)
            r12.setTextColor(r9)
            goto L_0x0566
        L_0x05c3:
            r10.setOnClickListener(r7)
            uy1.f r14 = uy1.C52645f.m59023a()
            java.lang.String r8 = r9.f127955d
            r6 = 0
            r14.mo73595e(r11, r8, r6, r6)
            java.lang.String r6 = r9.f127956e
            r12.setText(r6)
            java.lang.String r6 = r9.f127957f
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x05e7
            java.lang.String r6 = r9.f127957f
            r13.setText(r6)
            r6 = 0
            r13.setVisibility(r6)
            goto L_0x05ec
        L_0x05e7:
            r6 = 8
            r13.setVisibility(r6)
        L_0x05ec:
            r10.setTag(r9)
            r6 = 2
            if (r2 != r6) goto L_0x0609
            android.content.Context r6 = r7.f129018d
            r10 = 10
            r11 = 1002(0x3ea, float:1.404E-42)
            int r12 = r9.f127959h
            r13 = 1
            java.lang.String r8 = r9.f127960i
            java.lang.String r16 = qy1.C12934a.m12382d(r8)
            r9 = r6
            r14 = r15
            r6 = r15
            r15 = r5
            qy1.C12934a.m12380b(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x060a
        L_0x0609:
            r6 = r15
        L_0x060a:
            r15 = r6
            r6 = 2131100817(0x7f060491, float:1.7814026E38)
            r8 = 5
            goto L_0x0566
        L_0x0611:
            r6 = 8
            r7.setVisibility(r6)
        L_0x0616:
            android.widget.LinearLayout r6 = r3.f113656f
            android.widget.LinearLayout$LayoutParams r8 = r3.f113655e
            r6.addView(r7, r8)
            ry1.j r6 = new ry1.j
            android.content.Context r7 = r3.getContext()
            r6.<init>(r7)
            py1.y0 r7 = r4.f113356b
            com.tencent.mm.plugin.game.model.b r8 = r4.f113355a
            java.lang.String r8 = r8.field_appId
            java.lang.Class<ny.h> r17 = p629ny.C76979h.class
            if (r7 == 0) goto L_0x07ee
            java.util.LinkedList<py1.q> r9 = r7.f128153d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
            if (r9 == 0) goto L_0x063a
            goto L_0x07ee
        L_0x063a:
            r6.f129011g = r8
            r6.f129010f = r5
            java.util.LinkedList<py1.q> r7 = r7.f128153d
            java.util.Iterator r7 = r7.iterator()
        L_0x0644:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x07eb
            java.lang.Object r9 = r7.next()
            py1.q r9 = (py1.C47652q) r9
            if (r9 != 0) goto L_0x0653
            goto L_0x0644
        L_0x0653:
            uy1.f$d$a r10 = new uy1.f$d$a
            r10.<init>()
            int r11 = r9.f127937h
            r12 = 1
            if (r11 == r12) goto L_0x070f
            r12 = 2
            if (r11 == r12) goto L_0x0664
            r18 = r7
            goto L_0x070b
        L_0x0664:
            py1.p4 r11 = r9.f127936g
            if (r11 != 0) goto L_0x0669
            goto L_0x0644
        L_0x0669:
            r6.mo72866a(r6)
            android.view.LayoutInflater r11 = r6.f129009e
            r12 = 2131495760(0x7f0c0b50, float:1.8615066E38)
            r13 = 0
            android.view.View r11 = r11.inflate(r12, r6, r13)
            r12 = 2131313682(0x7f094412, float:1.8245768E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131313684(0x7f094414, float:1.8245772E38)
            android.view.View r13 = r11.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131313683(0x7f094413, float:1.824577E38)
            android.view.View r14 = r11.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            di3.d r15 = di3.C86312j.m106911c(r17)
            ny.h r15 = (p629ny.C76979h) r15
            r18 = r7
            android.content.Context r7 = r6.f129008d
            java.lang.String r1 = r9.f127933d
            float r0 = r12.getTextSize()
            android.text.SpannableString r0 = r15.yp0(r7, r1, r0)
            r12.setText(r0)
            di3.d r0 = di3.C86312j.m106911c(r17)
            ny.h r0 = (p629ny.C76979h) r0
            android.content.Context r1 = r6.f129008d
            py1.p4 r7 = r9.f127936g
            java.lang.String r7 = r7.f127926d
            float r12 = r13.getTextSize()
            android.text.SpannableString r0 = r0.yp0(r1, r7, r12)
            r13.setText(r0)
            py1.p4 r0 = r9.f127936g
            java.lang.String r0 = r0.f127928f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x06f0
            py1.p4 r0 = r9.f127936g
            int r0 = r0.f127929g
            r1 = 1
            if (r0 != r1) goto L_0x06d8
            r10.f147023d = r1
            r0 = 2131233203(0x7f0809b3, float:1.8082537E38)
            r10.f147025f = r0
            goto L_0x06df
        L_0x06d8:
            r10.f147022c = r1
            r0 = 2131233202(0x7f0809b2, float:1.8082535E38)
            r10.f147025f = r0
        L_0x06df:
            uy1.f r0 = uy1.C52645f.m59023a()
            py1.p4 r1 = r9.f127936g
            java.lang.String r1 = r1.f127928f
            uy1.f$d r7 = r10.mo73598a()
            r10 = 0
            r0.mo73595e(r14, r1, r7, r10)
            goto L_0x06f5
        L_0x06f0:
            r0 = 8
            r14.setVisibility(r0)
        L_0x06f5:
            ry1.j$a r0 = new ry1.j$a
            int r1 = r9.f127934e
            py1.p4 r7 = r9.f127936g
            java.lang.String r7 = r7.f127927e
            java.lang.String r10 = r9.f127938i
            r0.<init>(r1, r7, r10)
            r11.setTag(r0)
            r11.setOnClickListener(r6)
            r6.addView(r11)
        L_0x070b:
            r19 = r4
            goto L_0x07c9
        L_0x070f:
            r18 = r7
            py1.c r0 = r9.f127935f
            if (r0 != 0) goto L_0x0719
            r19 = r4
            goto L_0x07e1
        L_0x0719:
            r6.mo72866a(r6)
            android.view.LayoutInflater r0 = r6.f129009e
            r1 = 2131495759(0x7f0c0b4f, float:1.8615064E38)
            r7 = 0
            android.view.View r0 = r0.inflate(r1, r6, r7)
            r1 = 2131309676(0x7f09346c, float:1.8237643E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7 = 2131309678(0x7f09346e, float:1.8237647E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r11 = 2131309675(0x7f09346b, float:1.823764E38)
            android.view.View r11 = r0.findViewById(r11)
            com.tencent.mm.plugin.game.widget.EllipsizingTextView r11 = (com.tencent.p014mm.plugin.game.widget.EllipsizingTextView) r11
            r12 = 2
            r11.setMaxLines(r12)
            r12 = 2131309677(0x7f09346d, float:1.8237645E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            di3.d r13 = di3.C86312j.m106911c(r17)
            ny.h r13 = (p629ny.C76979h) r13
            android.content.Context r14 = r6.f129008d
            java.lang.String r15 = r9.f127933d
            r19 = r4
            float r4 = r1.getTextSize()
            android.text.SpannableString r4 = r13.yp0(r14, r15, r4)
            r1.setText(r4)
            di3.d r1 = di3.C86312j.m106911c(r17)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r4 = r6.f129008d
            py1.c r13 = r9.f127935f
            java.lang.String r13 = r13.f127609d
            float r14 = r7.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r4, r13, r14)
            r7.setText(r1)
            di3.d r1 = di3.C86312j.m106911c(r17)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r4 = r6.f129008d
            py1.c r7 = r9.f127935f
            java.lang.String r7 = r7.f127610e
            float r13 = r11.getTextSize()
            android.text.SpannableString r1 = r1.yp0(r4, r7, r13)
            r11.setText(r1)
            py1.c r1 = r9.f127935f
            java.lang.String r1 = r1.f127611f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x07ae
            uy1.f r1 = uy1.C52645f.m59023a()
            py1.c r4 = r9.f127935f
            java.lang.String r4 = r4.f127611f
            uy1.f$d r7 = r10.mo73598a()
            r10 = 0
            r1.mo73595e(r12, r4, r7, r10)
            goto L_0x07b3
        L_0x07ae:
            r1 = 8
            r12.setVisibility(r1)
        L_0x07b3:
            ry1.j$a r1 = new ry1.j$a
            int r4 = r9.f127934e
            py1.c r7 = r9.f127935f
            java.lang.String r7 = r7.f127612g
            java.lang.String r10 = r9.f127938i
            r1.<init>(r4, r7, r10)
            r0.setTag(r1)
            r0.setOnClickListener(r6)
            r6.addView(r0)
        L_0x07c9:
            r0 = 2
            if (r2 != r0) goto L_0x07e1
            android.content.Context r0 = r6.f129008d
            r10 = 10
            r11 = 1002(0x3ea, float:1.404E-42)
            int r12 = r9.f127934e
            r13 = 1
            java.lang.String r1 = r9.f127938i
            java.lang.String r16 = qy1.C12934a.m12382d(r1)
            r9 = r0
            r14 = r8
            r15 = r5
            qy1.C12934a.m12380b(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x07e1:
            r0 = r33
            r1 = r34
            r7 = r18
            r4 = r19
            goto L_0x0644
        L_0x07eb:
            r19 = r4
            goto L_0x07f5
        L_0x07ee:
            r19 = r4
            r0 = 8
            r6.setVisibility(r0)
        L_0x07f5:
            android.widget.LinearLayout r0 = r3.f113656f
            android.widget.LinearLayout$LayoutParams r1 = r3.f113655e
            r0.addView(r6, r1)
            r0 = r19
            py1.b1 r1 = r0.f113358d
            if (r1 == 0) goto L_0x0855
            android.view.LayoutInflater r1 = r3.f113654d
            r4 = 2131495815(0x7f0c0b87, float:1.8615177E38)
            r6 = 0
            android.view.View r1 = r1.inflate(r4, r3, r6)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.content.Context r6 = r3.getContext()
            r7 = 20
            int r6 = kg3.C76577a.m92151b(r6, r7)
            r4.leftMargin = r6
            r1.setLayoutParams(r4)
            r3.addView(r1)
            android.view.LayoutInflater r1 = r3.f113654d
            r4 = 2131495763(0x7f0c0b53, float:1.8615072E38)
            r6 = 1
            r1.inflate(r4, r3, r6)
            r1 = 2131309514(0x7f0933ca, float:1.8237314E38)
            android.view.View r1 = r3.findViewById(r1)
            r4 = 2131309531(0x7f0933db, float:1.8237348E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            py1.b1 r6 = r0.f113358d
            java.lang.String r6 = r6.f127592d
            r4.setText(r6)
            py1.b1 r0 = r0.f113358d
            java.lang.String r0 = r0.f127593e
            r1.setTag(r0)
            ry1.l r0 = new ry1.l
            r0.<init>(r3, r5)
            r1.setOnClickListener(r0)
        L_0x0855:
            android.widget.LinearLayout r0 = r3.f113656f
            android.view.View r1 = new android.view.View
            android.content.Context r4 = r3.getContext()
            r1.<init>(r4)
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131100817(0x7f060491, float:1.7814026E38)
            int r4 = r4.getColor(r5)
            r1.setBackgroundColor(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r3 = r3.getContext()
            r5 = 5
            int r3 = kg3.C76577a.m92151b(r3, r5)
            r5 = -1
            r4.<init>(r5, r3)
            r0.addView(r1, r4)
            r0 = 8
            goto L_0x088c
        L_0x0887:
            r0 = 8
            r3.setVisibility(r0)
        L_0x088c:
            r1 = r33
        L_0x088e:
            com.tencent.mm.plugin.game.ui.GameRecomBlockView r3 = r1.f113710w
            r4 = r34
            py1.a1 r5 = r4.f113352d
            int r14 = r1.f113685i
            if (r5 != 0) goto L_0x089d
            r3.setVisibility(r0)
            goto L_0x0a70
        L_0x089d:
            r3.f114133f = r14
            r6 = 0
            r3.setVisibility(r6)
            android.view.ViewGroup r6 = r3.f114134g
            r6.removeAllViews()
            java.util.LinkedList<py1.i4> r6 = r5.f127556e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
            if (r6 == 0) goto L_0x08b5
            r3.setVisibility(r0)
            goto L_0x0a70
        L_0x08b5:
            r0 = 2
            if (r2 != r0) goto L_0x08cb
            android.content.Context r6 = r3.f114131d
            r7 = 10
            r8 = 1021(0x3fd, float:1.431E-42)
            r9 = 0
            r10 = 1
            r11 = 0
            java.lang.String r0 = r5.f127559h
            java.lang.String r13 = qy1.C12934a.m12382d(r0)
            r12 = r14
            qy1.C12934a.m12380b(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x08cb:
            android.view.LayoutInflater r0 = r3.f114132e
            r6 = 2131495764(0x7f0c0b54, float:1.8615074E38)
            r7 = 1
            r0.inflate(r6, r3, r7)
            r0 = 2131311927(0x7f093d37, float:1.8242208E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6 = 2131311924(0x7f093d34, float:1.8242202E38)
            android.view.View r6 = r3.findViewById(r6)
            r15 = r6
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r6 = 2131311928(0x7f093d38, float:1.824221E38)
            android.view.View r6 = r3.findViewById(r6)
            r7 = 2131311929(0x7f093d39, float:1.8242212E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r8 = r5.f127555d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0907
            java.lang.String r8 = r5.f127555d
            r0.setText(r8)
            r8 = 8
            goto L_0x090c
        L_0x0907:
            r8 = 8
            r0.setVisibility(r8)
        L_0x090c:
            java.lang.String r0 = r5.f127557f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x091a
            java.lang.String r0 = r5.f127557f
            r7.setText(r0)
            goto L_0x091d
        L_0x091a:
            r7.setVisibility(r8)
        L_0x091d:
            com.tencent.mm.plugin.game.ui.GameRecomBlockView$a r0 = new com.tencent.mm.plugin.game.ui.GameRecomBlockView$a
            r28 = 0
            r29 = 999(0x3e7, float:1.4E-42)
            java.lang.String r7 = r5.f127558g
            java.lang.String r8 = r5.f127559h
            java.lang.String r32 = "game_center_mygame_more"
            r27 = r0
            r30 = r7
            r31 = r8
            r27.<init>(r28, r29, r30, r31, r32)
            r6.setTag(r0)
            r6.setOnClickListener(r3)
            r0 = 0
            r6 = 0
        L_0x093a:
            java.util.LinkedList<py1.i4> r7 = r5.f127556e
            int r7 = r7.size()
            if (r0 >= r7) goto L_0x0a43
            java.util.LinkedList<py1.i4> r7 = r5.f127556e
            java.lang.Object r7 = r7.get(r0)
            py1.i4 r7 = (py1.C47601i4) r7
            if (r7 != 0) goto L_0x0952
            r18 = 1
            r19 = 3
            goto L_0x0a3f
        L_0x0952:
            int r8 = r15.getChildCount()
            r13 = 3
            if (r8 < r13) goto L_0x095b
            goto L_0x0a43
        L_0x095b:
            int r16 = r6 + 1
            android.view.LayoutInflater r6 = r3.f114132e
            r8 = 2131495765(0x7f0c0b55, float:1.8615076E38)
            r9 = 0
            android.view.View r6 = r6.inflate(r8, r3, r9)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            com.tencent.mm.plugin.game.ui.GameRecomBlockView$a r8 = new com.tencent.mm.plugin.game.ui.GameRecomBlockView$a
            java.lang.String r9 = r7.f127795j
            java.lang.String r10 = r7.f127794i
            java.lang.String r11 = r7.f127793h
            java.lang.String r32 = "game_center_mygame_rank"
            r27 = r8
            r28 = r9
            r29 = r16
            r30 = r10
            r31 = r11
            r27.<init>(r28, r29, r30, r31, r32)
            r6.setTag(r8)
            r6.setOnClickListener(r3)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = -1
            r8.<init>(r11, r9, r10)
            r15.addView(r6, r8)
            r8 = 2131311926(0x7f093d36, float:1.8242206E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131311923(0x7f093d33, float:1.82422E38)
            android.view.View r9 = r6.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10 = 2131311925(0x7f093d35, float:1.8242204E38)
            android.view.View r10 = r6.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131311922(0x7f093d32, float:1.8242198E38)
            android.view.View r6 = r6.findViewById(r11)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r0 == 0) goto L_0x09e1
            r12 = 1
            if (r0 == r12) goto L_0x09d0
            r11 = 2
            if (r0 == r11) goto L_0x09bf
            goto L_0x09f1
        L_0x09bf:
            android.content.Context r11 = r3.f114131d
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131100841(0x7f0604a9, float:1.7814075E38)
            int r11 = r11.getColor(r12)
            r8.setTextColor(r11)
            goto L_0x09f1
        L_0x09d0:
            android.content.Context r11 = r3.f114131d
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131100840(0x7f0604a8, float:1.7814073E38)
            int r11 = r11.getColor(r12)
            r8.setTextColor(r11)
            goto L_0x09f1
        L_0x09e1:
            android.content.Context r11 = r3.f114131d
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131100839(0x7f0604a7, float:1.781407E38)
            int r11 = r11.getColor(r12)
            r8.setTextColor(r11)
        L_0x09f1:
            java.lang.String r11 = r7.f127791f
            r8.setText(r11)
            uy1.f r8 = uy1.C52645f.m59023a()
            java.lang.String r11 = r7.f127790e
            r12 = 0
            r8.mo73595e(r9, r11, r12, r12)
            java.lang.String r8 = r7.f127789d
            r10.setText(r8)
            java.lang.String r8 = r7.f127792g
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0a13
            java.lang.String r8 = r7.f127792g
            r6.setText(r8)
            goto L_0x0a18
        L_0x0a13:
            r8 = 8
            r6.setVisibility(r8)
        L_0x0a18:
            r6 = 2
            if (r2 != r6) goto L_0x0a39
            android.content.Context r6 = r3.f114131d
            r8 = 10
            r9 = 1021(0x3fd, float:1.431E-42)
            r10 = 1
            java.lang.String r11 = r7.f127795j
            java.lang.String r7 = r7.f127793h
            java.lang.String r17 = qy1.C12934a.m12382d(r7)
            r7 = r8
            r8 = r9
            r9 = r16
            r18 = 1
            r12 = r14
            r19 = 3
            r13 = r17
            qy1.C12934a.m12380b(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0a3d
        L_0x0a39:
            r18 = 1
            r19 = 3
        L_0x0a3d:
            r6 = r16
        L_0x0a3f:
            int r0 = r0 + 1
            goto L_0x093a
        L_0x0a43:
            android.view.View r0 = new android.view.View
            android.content.Context r5 = r3.getContext()
            r0.<init>(r5)
            android.content.Context r5 = r3.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131100817(0x7f060491, float:1.7814026E38)
            int r5 = r5.getColor(r6)
            r0.setBackgroundColor(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r6 = r3.getContext()
            r7 = 5
            int r6 = kg3.C76577a.m92151b(r6, r7)
            r7 = -1
            r5.<init>(r7, r6)
            r3.addView(r0, r5)
        L_0x0a70:
            com.tencent.mm.plugin.game.ui.GameNewClassifyView r0 = r1.f113711x
            py1.f5 r3 = r4.f113353e
            int r4 = r1.f113685i
            if (r3 == 0) goto L_0x0be9
            r0.getClass()
            java.util.LinkedList<py1.e5> r5 = r3.f127700d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r5)
            if (r5 == 0) goto L_0x0a85
            goto L_0x0be9
        L_0x0a85:
            r0.f114089d = r4
            android.view.LayoutInflater r4 = r0.f114090e
            if (r4 != 0) goto L_0x0a99
            android.content.Context r4 = r0.getContext()
            java.lang.String r5 = "layout_inflater"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.view.LayoutInflater r4 = (android.view.LayoutInflater) r4
            r0.f114090e = r4
        L_0x0a99:
            android.widget.LinearLayout r4 = r0.f114091f
            r4.removeAllViews()
        L_0x0a9e:
            android.widget.LinearLayout r4 = r0.f114091f
            int r4 = r4.getChildCount()
            java.util.LinkedList<py1.e5> r5 = r3.f127700d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0ac9
            android.view.LayoutInflater r4 = r0.f114090e
            r5 = 2131495882(0x7f0c0bca, float:1.8615313E38)
            r6 = 0
            android.view.View r4 = r4.inflate(r5, r0, r6)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.setOnClickListener(r0)
            android.widget.LinearLayout r5 = r0.f114091f
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r8 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r7, r7, r8)
            r5.addView(r4, r6)
            goto L_0x0a9e
        L_0x0ac9:
            r4 = 0
        L_0x0aca:
            android.widget.LinearLayout r5 = r0.f114091f
            int r5 = r5.getChildCount()
            if (r4 >= r5) goto L_0x0b6e
            java.util.LinkedList<py1.e5> r5 = r3.f127700d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0b22
            android.widget.LinearLayout r5 = r0.f114091f
            android.view.View r5 = r5.getChildAt(r4)
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r14.mo10233c(r7)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/game/ui/GameNewClassifyView"
            java.lang.String r9 = "setData"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/game/protobuf/TypeNavModule;II)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r5
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            java.lang.Object r7 = r14.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/game/ui/GameNewClassifyView"
            java.lang.String r8 = "setData"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/game/protobuf/TypeNavModule;II)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r5
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0b6a
        L_0x0b22:
            android.widget.LinearLayout r5 = r0.f114091f
            android.view.View r5 = r5.getChildAt(r4)
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r14.mo10233c(r7)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/game/ui/GameNewClassifyView"
            java.lang.String r9 = "setData"
            java.lang.String r10 = "(Lcom/tencent/mm/plugin/game/protobuf/TypeNavModule;II)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r5
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            java.lang.Object r7 = r14.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/game/ui/GameNewClassifyView"
            java.lang.String r8 = "setData"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/game/protobuf/TypeNavModule;II)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r5
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x0b6a:
            int r4 = r4 + 1
            goto L_0x0aca
        L_0x0b6e:
            r4 = 0
        L_0x0b6f:
            java.util.LinkedList<py1.e5> r5 = r3.f127700d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0bd0
            android.widget.LinearLayout r5 = r0.f114091f
            android.view.View r5 = r5.getChildAt(r4)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 2131305375(0x7f09239f, float:1.822892E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 2131305376(0x7f0923a0, float:1.8228921E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            uy1.f r8 = uy1.C52645f.m59023a()
            java.util.LinkedList<py1.e5> r9 = r3.f127700d
            java.lang.Object r9 = r9.get(r4)
            py1.e5 r9 = (py1.C47574e5) r9
            java.lang.String r9 = r9.f127673d
            r10 = 0
            r8.mo73595e(r6, r9, r10, r10)
            java.util.LinkedList<py1.e5> r6 = r3.f127700d
            java.lang.Object r6 = r6.get(r4)
            py1.e5 r6 = (py1.C47574e5) r6
            java.lang.String r6 = r6.f127674e
            r7.setText(r6)
            com.tencent.mm.plugin.game.ui.GameNewClassifyView$a r6 = new com.tencent.mm.plugin.game.ui.GameNewClassifyView$a
            java.util.LinkedList<py1.e5> r7 = r3.f127700d
            java.lang.Object r7 = r7.get(r4)
            py1.e5 r7 = (py1.C47574e5) r7
            java.lang.String r7 = r7.f127675f
            int r8 = r4 + 1
            java.util.LinkedList<py1.e5> r9 = r3.f127700d
            java.lang.Object r4 = r9.get(r4)
            py1.e5 r4 = (py1.C47574e5) r4
            java.lang.String r4 = r4.f127676g
            r6.<init>(r7, r8, r4)
            r5.setTag(r6)
            r4 = r8
            goto L_0x0b6f
        L_0x0bd0:
            r4 = 0
            r0.setVisibility(r4)
            r3 = 2
            if (r2 != r3) goto L_0x0bee
            android.content.Context r4 = r0.getContext()
            r5 = 10
            r6 = 1019(0x3fb, float:1.428E-42)
            r7 = 0
            r8 = 1
            r9 = 0
            int r10 = r0.f114089d
            r11 = 0
            qy1.C12934a.m12380b(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0bee
        L_0x0be9:
            r2 = 8
            r0.setVisibility(r2)
        L_0x0bee:
            com.tencent.mm.plugin.game.ui.GameIndexListView r0 = r1.f113712y
            r1 = 0
            r0.setVisibility(r1)
        L_0x0bf4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameCenterUI5.m45861N7(com.tencent.mm.plugin.game.ui.GameCenterUI5, com.tencent.mm.plugin.game.model.k0, int):void");
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aup;
    }

    public void initView() {
        setBackBtn(new C42162a());
        setMMTitle((int) C0966R.string.fcu);
        GameIndexListView gameIndexListView = (GameIndexListView) findViewById(C0966R.C0970id.ekg);
        this.f113712y = gameIndexListView;
        gameIndexListView.setVisibility(8);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.awm, this.f113712y, false);
        this.f113712y.addHeaderView(inflate);
        this.f113705r = (GameNewTopBannerView) inflate.findViewById(C0966R.C0970id.eo7);
        this.f113706s = (GameIndexSearchView) inflate.findViewById(C0966R.C0970id.eky);
        this.f113707t = (GameIndexWxagView) inflate.findViewById(C0966R.C0970id.ekz);
        this.f113708u = (GameMessageBubbleView) inflate.findViewById(C0966R.C0970id.eml);
        this.f113709v = (GameBlockView) inflate.findViewById(C0966R.C0970id.ei5);
        this.f113710w = (GameRecomBlockView) inflate.findViewById(C0966R.C0970id.en_);
        this.f113711x = (GameNewClassifyView) inflate.findViewById(C0966R.C0970id.emx);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.GameCenterUI5", "account not ready");
            finish();
            return;
        }
        GameIndexListView.setSourceScene(this.f113685i);
        C86709a0.m107524d().mo123455a(2994, this);
        initView();
        C52642c.m58994l().postToWorker(new C48144p(this));
        Log.m105925i("MicroMsg.GameCenterUI5", "fromScene = %d", Integer.valueOf(this.f113685i));
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.GameCenterUI5", "onDestroy");
        super.onDestroy();
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.GameCenterUI5", "account not ready");
            return;
        }
        C52638a.C52640b.f146975a.mo73588a();
        C86709a0.m107524d().mo123470p(2994, this);
        ((C48483p) C86312j.m106911c(C48483p.class)).xg0().mo65970a();
        C42051e1.m45759a();
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Boolean.valueOf(C42051e1.f113299b == null);
        if (C42051e1.f113298a == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.QQDownloaderSDKWrapper", "destroyQQDownloader, sdk is null : [%b], instance is null : [%b]", objArr);
        ITMQQDownloaderOpenSDK iTMQQDownloaderOpenSDK = C42051e1.f113299b;
        if (iTMQQDownloaderOpenSDK != null) {
            iTMQQDownloaderOpenSDK.destroyQQDownloaderOpenSDK();
        }
        C42051e1.f113299b = null;
        C42051e1.f113298a = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = r0.f113663e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r3 = this;
            super.onResume()
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "MicroMsg.GameCenterUI5"
            java.lang.String r1 = "account not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x0011:
            boolean r0 = r3.f113704A
            if (r0 != 0) goto L_0x0072
            java.lang.Class<sw1.p> r0 = sw1.C48483p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sw1.p r0 = (sw1.C48483p) r0
            com.tencent.mm.plugin.game.model.a r0 = r0.xg0()
            r0.mo65971b(r3)
            com.tencent.mm.plugin.game.ui.GameMessageBubbleView r0 = r3.f113708u
            android.view.View r1 = r0.f114061e
            r2 = 0
            r1.setOnClickListener(r2)
            r1 = 8
            r0.setVisibility(r1)
            boolean r0 = r3.f113684h
            if (r0 == 0) goto L_0x003a
            com.tencent.mm.plugin.game.ui.GameMessageBubbleView r0 = r3.f113708u
            r0.mo66241a()
        L_0x003a:
            com.tencent.mm.plugin.game.ui.GameBlockView r0 = r3.f113709v
            com.tencent.mm.plugin.game.ui.GameBlockView$a r0 = r0.f113658h
            if (r0 == 0) goto L_0x005a
            com.tencent.mm.plugin.game.ui.GameDownloadView r0 = r0.f113663e
            com.tencent.mm.plugin.game.model.t r1 = r0.f113848g
            if (r1 == 0) goto L_0x005a
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1.mo66072a(r2)
            com.tencent.mm.plugin.game.model.t r1 = r0.f113848g
            r1.mo66073b()
            ry1.d0 r1 = new ry1.d0
            r1.<init>(r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
        L_0x005a:
            com.tencent.mm.plugin.game.ui.GameIndexListView r0 = r3.f113712y
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r2 = r1.mo16957C()
            int r1 = r1.mo16959E()
            com.tencent.mm.plugin.game.ui.GameIndexListView$c r0 = r0.f113949G1
            int r1 = r1 - r2
            int r1 = r1 + 1
            r0.notifyItemRangeChanged(r2, r1)
        L_0x0072:
            r0 = 0
            r3.f113704A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameCenterUI5.onResume():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.GameCenterUI5", "errType: %d errCode: %d, scene: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.hashCode()));
        if (i != 0 || i2 != 0) {
            if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str)) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f_l, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
            Dialog dialog = this.f113713z;
            if (dialog != null) {
                dialog.cancel();
            }
        } else if (yVar.getType() == 2994) {
            long currentTimeMillis = System.currentTimeMillis();
            C52642c.m58994l().postToWorker(new C42163b(((C42094s0) yVar).f113406e.f127056b.f127083a, currentTimeMillis));
        }
    }
}
