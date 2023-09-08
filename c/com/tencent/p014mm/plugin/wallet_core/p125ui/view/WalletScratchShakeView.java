package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import ud3.C101998d;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView */
public class WalletScratchShakeView extends FrameLayout {

    /* renamed from: d */
    public C72449b f210740d;

    /* renamed from: e */
    public boolean f210741e;

    /* renamed from: f */
    public boolean f210742f;

    /* renamed from: g */
    public C72448a f210743g;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView$a */
    public interface C72448a {
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView$b */
    public class C72449b extends View {

        /* renamed from: A */
        public boolean f210744A;

        /* renamed from: B */
        public float f210745B = 0.9f;

        /* renamed from: d */
        public Bitmap f210747d;

        /* renamed from: e */
        public Canvas f210748e;

        /* renamed from: f */
        public Paint f210749f;

        /* renamed from: g */
        public Drawable f210750g;

        /* renamed from: h */
        public Paint f210751h;

        /* renamed from: i */
        public Paint f210752i;

        /* renamed from: j */
        public Path f210753j;

        /* renamed from: n */
        public Path f210754n;

        /* renamed from: o */
        public float f210755o;

        /* renamed from: p */
        public float f210756p;

        /* renamed from: q */
        public int f210757q;

        /* renamed from: r */
        public int[] f210758r;

        /* renamed from: s */
        public boolean f210759s;

        /* renamed from: t */
        public boolean f210760t;

        /* renamed from: u */
        public C101998d f210761u;

        /* renamed from: v */
        public float f210762v;

        /* renamed from: w */
        public float f210763w;

        /* renamed from: x */
        public boolean f210764x;

        /* renamed from: y */
        public long f210765y;

        /* renamed from: z */
        public boolean f210766z = false;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView$b$a */
        public class C72450a implements Runnable {
            public C72450a() {
            }

            public void run() {
                C72448a aVar = WalletScratchShakeView.this.f210743g;
                if (aVar != null) {
                    ((C72467f) aVar).mo99874a(true);
                }
            }
        }

        public C72449b(Context context) {
            super(context);
        }

        /* renamed from: a */
        public boolean mo99825a(MotionEvent motionEvent) {
            if (this.f210747d == null) {
                return false;
            }
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3 && motionEvent.getAction() != 0) {
                return false;
            }
            int width = getWidth();
            int height = getHeight();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int i = (y * width) + x;
            Log.m105919d("MicroMsg.WalletScratchShakeView", "checkIsTouchEraseArea, x: %s, y: %s, width: %s, height: %s, index: %s, len: %s", Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()), Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(i), Integer.valueOf(getWidth() * getHeight()));
            return i > 0 && x > 0 && y > 0 && x < getWidth() && y < getHeight() && this.f210747d.getPixel(x, y) == 0;
        }

        /* renamed from: b */
        public final boolean mo99826b() {
            if (this.f210763w < ((float) getHeight())) {
                return false;
            }
            this.f210744A = true;
            if (!this.f210760t) {
                C72448a aVar = WalletScratchShakeView.this.f210743g;
                if (aVar != null) {
                    Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "onFinishScratchOrShake");
                    int i = ((C72467f) aVar).f210813a.f210778p.f226714n;
                }
                this.f210760t = true;
            }
            if (this.f210748e != null) {
                this.f210754n.reset();
                this.f210754n.moveTo(0.0f, 0.0f);
                this.f210754n.lineTo((float) getWidth(), 0.0f);
                this.f210754n.lineTo((float) getWidth(), (float) getHeight());
                this.f210754n.lineTo(0.0f, (float) getHeight());
                this.f210748e.drawPath(this.f210754n, this.f210752i);
            }
            invalidate();
            return true;
        }

        /* renamed from: c */
        public final void mo99827c() {
            if (this.f210748e != null) {
                this.f210754n.reset();
                this.f210754n.moveTo(0.0f, this.f210763w);
                this.f210754n.cubicTo((float) (getWidth() / 2), (float) getHeight(), (float) (getWidth() / 2), 0.0f, (float) getWidth(), this.f210762v);
                this.f210754n.lineTo((float) getWidth(), 0.0f);
                this.f210754n.lineTo(0.0f, 0.0f);
                this.f210748e.drawPath(this.f210754n, this.f210752i);
            }
            invalidate();
        }

        public void onDraw(Canvas canvas) {
            canvas.save();
            if (this.f210747d == null) {
                int width = getWidth();
                int height = getHeight();
                Log.m105925i("MicroMsg.WalletScratchShakeView", "createMasker width: %s, height: %s, waterMark: %s", Integer.valueOf(width), Integer.valueOf(height), this.f210750g);
                this.f210747d = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f210748e = new Canvas(this.f210747d);
                if (this.f210750g != null) {
                    this.f210750g.setBounds(new Rect(0, 0, width, height));
                    this.f210750g.draw(this.f210748e);
                }
                this.f210758r = new int[(width * height)];
            }
            canvas.drawBitmap(this.f210747d, 0.0f, 0.0f, this.f210749f);
            canvas.restore();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            if (r0 != 3) goto L_0x00af;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletScratchShakeView.this
                boolean r0 = r0.f210742f
                if (r0 != 0) goto L_0x000b
                boolean r8 = super.onTouchEvent(r8)
                return r8
            L_0x000b:
                int r0 = r8.getAction()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0085
                if (r0 == r2) goto L_0x006d
                r3 = 2
                if (r0 == r3) goto L_0x001d
                r3 = 3
                if (r0 == r3) goto L_0x006d
                goto L_0x00af
            L_0x001d:
                float r0 = r8.getX()
                float r1 = r8.getY()
                android.graphics.Canvas r3 = r7.f210748e
                if (r3 == 0) goto L_0x0069
                float r3 = r7.f210755o
                float r3 = r0 - r3
                float r3 = java.lang.Math.abs(r3)
                int r3 = (int) r3
                float r4 = r7.f210756p
                float r4 = r1 - r4
                float r4 = java.lang.Math.abs(r4)
                int r4 = (int) r4
                int r5 = r7.f210757q
                if (r3 >= r5) goto L_0x0041
                if (r4 < r5) goto L_0x0069
            L_0x0041:
                r7.f210755o = r0
                r7.f210756p = r1
                android.graphics.Path r3 = r7.f210753j
                float r4 = r0 + r0
                r5 = 1073741824(0x40000000, float:2.0)
                float r4 = r4 / r5
                float r6 = r1 + r1
                float r6 = r6 / r5
                r3.quadTo(r4, r6, r0, r1)
                android.graphics.Canvas r0 = r7.f210748e
                android.graphics.Path r1 = r7.f210753j
                android.graphics.Paint r3 = r7.f210751h
                r0.drawPath(r1, r3)
                android.graphics.Path r0 = r7.f210753j
                r0.reset()
                android.graphics.Path r0 = r7.f210753j
                float r1 = r7.f210755o
                float r3 = r7.f210756p
                r0.moveTo(r1, r3)
            L_0x0069:
                r7.invalidate()
                goto L_0x00ae
            L_0x006d:
                r0 = 0
                r7.f210755o = r0
                r7.f210756p = r0
                android.graphics.Path r0 = r7.f210753j
                r0.reset()
                com.tencent.mm.plugin.wallet_core.ui.view.d r0 = new com.tencent.mm.plugin.wallet_core.ui.view.d
                r0.<init>(r7)
                java.lang.String r1 = "ScratchShakeView_calcErasePercentAndCallEnd"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r1)
                r7.invalidate()
                goto L_0x00ae
            L_0x0085:
                float r0 = r8.getX()
                float r1 = r8.getY()
                android.graphics.Path r3 = r7.f210753j
                r3.reset()
                android.graphics.Path r3 = r7.f210753j
                r3.moveTo(r0, r1)
                r7.f210755o = r0
                r7.f210756p = r1
                r7.invalidate()
                boolean r0 = r7.f210759s
                if (r0 != 0) goto L_0x00ae
                com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView$b$a r0 = new com.tencent.mm.plugin.wallet_core.ui.view.WalletScratchShakeView$b$a
                r0.<init>()
                r3 = 50
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r3)
                r7.f210759s = r2
            L_0x00ae:
                r1 = 1
            L_0x00af:
                boolean r0 = r7.f210744A
                if (r0 != 0) goto L_0x00bc
                boolean r0 = r7.mo99825a(r8)
                if (r0 != 0) goto L_0x00bc
                if (r1 == 0) goto L_0x00bc
                return r2
            L_0x00bc:
                boolean r8 = super.onTouchEvent(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletScratchShakeView.C72449b.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public WalletScratchShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo99823a() {
        C72449b bVar = this.f210740d;
        if (bVar != null) {
            bVar.getClass();
            Log.m105924i("MicroMsg.WalletScratchShakeView", "onDestroy");
            C101998d dVar = bVar.f210761u;
            if (dVar != null) {
                dVar.mo141498b();
            }
        }
    }

    public void setScratchShakeCallback(C72448a aVar) {
        this.f210743g = aVar;
    }

    public WalletScratchShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
