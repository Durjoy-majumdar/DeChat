package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import di3.C86312j;
import fy3.C32227p;
import gr1.C59664m2;
import gr1.C59680w0;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import java.util.LinkedList;
import k34.C117388a;
import p707tz.C65000f;
import rx3.C13598b0;
import sp3.C36777d;
import te3.C64689rq2;

/* renamed from: com.tencent.mm.plugin.finder.ui.q2 */
public final class C56414q2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161267d;

    /* renamed from: e */
    public final /* synthetic */ C64689rq2 f161268e;

    /* renamed from: f */
    public final /* synthetic */ int f161269f;

    /* renamed from: g */
    public final /* synthetic */ int f161270g;

    /* renamed from: h */
    public final /* synthetic */ LinkedList<Long> f161271h;

    /* renamed from: i */
    public final /* synthetic */ Canvas f161272i;

    /* renamed from: j */
    public final /* synthetic */ Bitmap f161273j;

    /* renamed from: com.tencent.mm.plugin.finder.ui.q2$a */
    public static final class C56415a extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LinkedList<Long> f161274d;

        /* renamed from: e */
        public final /* synthetic */ FinderSelectCoverUI f161275e;

        /* renamed from: f */
        public final /* synthetic */ C64689rq2 f161276f;

        /* renamed from: g */
        public final /* synthetic */ Canvas f161277g;

        /* renamed from: h */
        public final /* synthetic */ Bitmap f161278h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56415a(LinkedList<Long> linkedList, FinderSelectCoverUI finderSelectCoverUI, C64689rq2 rq22, Canvas canvas, Bitmap bitmap) {
            super(2);
            this.f161274d = linkedList;
            this.f161275e = finderSelectCoverUI;
            this.f161276f = rq22;
            this.f161277g = canvas;
            this.f161278h = bitmap;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
            r2 = r1.f183836j;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            /*
                r12 = this;
                java.lang.Number r13 = (java.lang.Number) r13
                long r0 = r13.longValue()
                android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
                java.util.LinkedList<java.lang.Long> r13 = r12.f161274d
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                int r13 = r13.indexOf(r0)
                if (r13 < 0) goto L_0x0090
                if (r14 == 0) goto L_0x0090
                com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI r0 = r12.f161275e
                te3.rq2 r1 = r12.f161276f
                android.graphics.Canvas r7 = r12.f161277g
                int r2 = com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI.f161087x0
                float r8 = r0.mo79108X7()
                com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI r2 = r12.f161275e
                float r2 = r2.mo79107W7()
                int r9 = (int) r2
                boolean r2 = r1.f185280t
                r10 = 0
                r11 = 0
                if (r2 == 0) goto L_0x0078
                te3.jr2 r1 = r1.f185281u
                if (r1 == 0) goto L_0x003a
                te3.zr4 r2 = r1.f183836j
                if (r2 == 0) goto L_0x003a
                int r2 = r2.f186847d
                goto L_0x003b
            L_0x003a:
                r2 = 0
            L_0x003b:
                if (r1 == 0) goto L_0x0044
                te3.zr4 r3 = r1.f183836j
                if (r3 == 0) goto L_0x0044
                int r3 = r3.f186850g
                goto L_0x0045
            L_0x0044:
                r3 = 0
            L_0x0045:
                if (r1 == 0) goto L_0x004e
                te3.zr4 r4 = r1.f183836j
                if (r4 == 0) goto L_0x004e
                int r4 = r4.f186849f
                goto L_0x004f
            L_0x004e:
                r4 = 0
            L_0x004f:
                if (r1 == 0) goto L_0x0059
                te3.zr4 r1 = r1.f183836j
                if (r1 == 0) goto L_0x0059
                int r1 = r1.f186848e
                r5 = r1
                goto L_0x005a
            L_0x0059:
                r5 = 0
            L_0x005a:
                int r6 = (int) r8
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r9
                android.graphics.Rect r0 = r0.mo79101Q7(r1, r2, r3, r4, r5, r6)
                android.graphics.Rect r1 = new android.graphics.Rect
                float r2 = (float) r13
                float r2 = r2 * r8
                int r2 = (int) r2
                int r13 = r13 + 1
                float r13 = (float) r13
                float r13 = r13 * r8
                int r13 = (int) r13
                r1.<init>(r2, r11, r13, r9)
                r7.drawBitmap(r14, r0, r1, r10)
                goto L_0x0084
            L_0x0078:
                int r0 = (int) r8
                android.graphics.Bitmap r14 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r14, r0, r9, r11)
                float r13 = (float) r13
                float r13 = r13 * r8
                r0 = 0
                r7.drawBitmap(r14, r13, r0, r10)
            L_0x0084:
                com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI r13 = r12.f161275e
                com.tencent.mm.plugin.finder.ui.p2 r14 = new com.tencent.mm.plugin.finder.ui.p2
                android.graphics.Bitmap r0 = r12.f161278h
                r14.<init>(r13, r0)
                r13.runOnUiThread(r14)
            L_0x0090:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C56414q2.C56415a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public C56414q2(FinderSelectCoverUI finderSelectCoverUI, C64689rq2 rq22, int i, int i2, LinkedList<Long> linkedList, Canvas canvas, Bitmap bitmap) {
        this.f161267d = finderSelectCoverUI;
        this.f161268e = rq22;
        this.f161269f = i;
        this.f161270g = i2;
        this.f161271h = linkedList;
        this.f161272i = canvas;
        this.f161273j = bitmap;
    }

    public final void run() {
        C60695a player;
        FinderSelectCoverUI finderSelectCoverUI = this.f161267d;
        C65000f fVar = (C65000f) C86312j.m106911c(C65000f.class);
        C64689rq2 rq22 = this.f161268e;
        int i = this.f161269f;
        int i2 = this.f161270g;
        C59664m2 m2Var = this.f161267d.f161089B;
        C117388a aVar = null;
        if (m2Var != null) {
            C59680w0 w0Var = m2Var instanceof C59680w0 ? (C59680w0) m2Var : null;
            if (!(w0Var == null || (player = w0Var.f170501a.getPlayer()) == null)) {
                aVar = player.mo85616j();
            }
            finderSelectCoverUI.f161092E = fVar.mv0(rq22, i, i2, aVar);
            C36777d dVar = this.f161267d.f161092E;
            if (dVar != null) {
                dVar.mo58663C(this.f161269f, this.f161270g);
            }
            FinderSelectCoverUI finderSelectCoverUI2 = this.f161267d;
            C36777d dVar2 = finderSelectCoverUI2.f161092E;
            if (dVar2 != null) {
                LinkedList<Long> linkedList = this.f161271h;
                dVar2.mo58665b(linkedList, new C56415a(linkedList, finderSelectCoverUI2, this.f161268e, this.f161272i, this.f161273j));
                return;
            }
            return;
        }
        C87412m.m108603p("seeker");
        throw null;
    }
}
