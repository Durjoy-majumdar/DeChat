package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.C116072d;
import com.tencent.p014mm.p136ui.base.MMFlipper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import junit.framework.Assert;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.MMGridPaper */
public final class MMGridPaper extends LinearLayout {

    /* renamed from: N */
    public static final /* synthetic */ int f348204N = 0;

    /* renamed from: A */
    public int f348205A = 96;

    /* renamed from: B */
    public int f348206B = 10;

    /* renamed from: C */
    public int f348207C = 10;

    /* renamed from: D */
    public boolean f348208D = false;

    /* renamed from: E */
    public boolean f348209E = false;

    /* renamed from: F */
    public int f348210F = -1;

    /* renamed from: G */
    public int f348211G = -1;

    /* renamed from: H */
    public int f348212H = 0;

    /* renamed from: I */
    public int f348213I = -1;

    /* renamed from: J */
    public int f348214J = -1;

    /* renamed from: K */
    public boolean f348215K = false;

    /* renamed from: L */
    public final MMFlipper.C73164b f348216L = new C116062d();

    /* renamed from: M */
    public final MMFlipper.C73165c f348217M = new C116063e();

    /* renamed from: d */
    public MMFlipper f348218d;

    /* renamed from: e */
    public MMDotView f348219e;

    /* renamed from: f */
    public C116072d f348220f;

    /* renamed from: g */
    public View f348221g;

    /* renamed from: h */
    public MMHandler f348222h = new MMHandler(Looper.getMainLooper());

    /* renamed from: i */
    public int f348223i;

    /* renamed from: j */
    public int f348224j;

    /* renamed from: n */
    public int f348225n = 0;

    /* renamed from: o */
    public int f348226o = 0;

    /* renamed from: p */
    public int f348227p = 3;

    /* renamed from: q */
    public int f348228q = 0;

    /* renamed from: r */
    public int f348229r = (3 - 1);

    /* renamed from: s */
    public int f348230s = 0;

    /* renamed from: t */
    public int f348231t = 0;

    /* renamed from: u */
    public int f348232u = 0;

    /* renamed from: v */
    public boolean f348233v = false;

    /* renamed from: w */
    public int f348234w = 9;

    /* renamed from: x */
    public int f348235x = -1;

    /* renamed from: y */
    public int f348236y = -1;

    /* renamed from: z */
    public int f348237z = 96;

    /* renamed from: com.tencent.mm.ui.base.MMGridPaper$a */
    public class C116059a implements C116072d.C116073a {
        public C116059a() {
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMGridPaper$b */
    public class C116060b implements Runnable {
        public C116060b() {
        }

        public void run() {
            Log.m105928w("MicroMsg.MMGridPaper", "post do setDotView");
            MMGridPaper mMGridPaper = MMGridPaper.this;
            int i = MMGridPaper.f348204N;
            mMGridPaper.mo177263g();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMGridPaper$c */
    public class C116061c implements Runnable {
        public C116061c() {
        }

        public void run() {
            Log.m105928w("MicroMsg.MMGridPaper", "post do setDotView");
            MMGridPaper mMGridPaper = MMGridPaper.this;
            int i = MMGridPaper.f348204N;
            mMGridPaper.mo177263g();
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMGridPaper$d */
    public class C116062d implements MMFlipper.C73164b {
        public C116062d() {
        }

        /* renamed from: a */
        public void mo100336a(int i, int i2) {
            Log.m105927v("MicroMsg.MMGridPaper", "onMeasure width:[new %d, old %d] height:[new %d, old %d], dialogMode[%B], orientationChange[%B]", Integer.valueOf(i), Integer.valueOf(MMGridPaper.this.f348223i), Integer.valueOf(i2), Integer.valueOf(MMGridPaper.this.f348224j), Boolean.valueOf(MMGridPaper.this.f348209E), Boolean.valueOf(MMGridPaper.this.f348208D));
            if ((Math.abs(MMGridPaper.this.f348224j - i2) < 50 && Math.abs(MMGridPaper.this.f348223i - i) < 50) || i2 == 0 || i == 0) {
                Log.m105918d("MicroMsg.MMGridPaper", "match width height limit, return");
                return;
            }
            MMGridPaper mMGridPaper = MMGridPaper.this;
            if (!mMGridPaper.f348209E || mMGridPaper.f348223i <= i || mMGridPaper.f348208D) {
                Log.m105926v("MicroMsg.MMGridPaper", "onMeasure: match");
                Log.m105927v("MicroMsg.MMGridPaper", "onMeasure: mIsManualMeasureMode[%b]", Boolean.valueOf(MMGridPaper.this.f348215K));
                MMGridPaper mMGridPaper2 = MMGridPaper.this;
                mMGridPaper2.f348208D = false;
                if (!mMGridPaper2.f348215K) {
                    mMGridPaper2.f348224j = i2;
                    mMGridPaper2.f348223i = i;
                }
                mMGridPaper2.mo177262f();
                return;
            }
            Log.m105918d("MicroMsg.MMGridPaper", "match ori limit, return");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMGridPaper$e */
    public class C116063e implements MMFlipper.C73165c {

        /* renamed from: com.tencent.mm.ui.base.MMGridPaper$e$a */
        public class C116064a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f348243d;

            public C116064a(int i) {
                this.f348243d = i;
            }

            public void run() {
                MMFlipper mMFlipper = MMGridPaper.this.f348218d;
                MMGridPaperGridView mMGridPaperGridView = (MMGridPaperGridView) mMFlipper.getChildAt(mMFlipper.getChildCount() - 1);
                int childCount = this.f348243d - (MMGridPaper.this.f348218d.getChildCount() >> 1);
                Log.m105925i("MicroMsg.MMGridPaper", "move up, old index[%d], new index[%d]", Integer.valueOf(MMGridPaper.this.f348218d.getChildCount() - 1), Integer.valueOf(childCount));
                MMFlipper mMFlipper2 = MMGridPaper.this.f348218d;
                mMFlipper2.removeViewAt(mMFlipper2.getChildCount() - 1);
                MMGridPaper mMGridPaper = MMGridPaper.this;
                mMGridPaperGridView.mo177289i(childCount, mMGridPaper.f348232u, mMGridPaper.f348231t, mMGridPaper.f348220f);
                MMGridPaper.this.f348218d.addView(mMGridPaperGridView, 0);
                MMGridPaper.this.f348218d.mo101663a(MMGridPaper.this.f348218d.getChildCount() >> 1);
                MMGridPaper.m163304a(MMGridPaper.this, -1);
            }
        }

        /* renamed from: com.tencent.mm.ui.base.MMGridPaper$e$b */
        public class C116065b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f348245d;

            public C116065b(int i) {
                this.f348245d = i;
            }

            public void run() {
                MMGridPaperGridView mMGridPaperGridView = (MMGridPaperGridView) MMGridPaper.this.f348218d.getChildAt(0);
                int childCount = this.f348245d + (MMGridPaper.this.f348218d.getChildCount() >> 1);
                Log.m105925i("MicroMsg.MMGridPaper", "move down, old index[0], new index[%d]", Integer.valueOf(childCount));
                MMGridPaper.this.f348218d.removeViewAt(0);
                MMGridPaper mMGridPaper = MMGridPaper.this;
                mMGridPaperGridView.mo177289i(childCount, mMGridPaper.f348232u, mMGridPaper.f348231t, mMGridPaper.f348220f);
                MMGridPaper.this.f348218d.addView(mMGridPaperGridView);
                MMGridPaper.this.f348218d.mo101663a(MMGridPaper.this.f348218d.getChildCount() >> 1);
                MMGridPaper.m163304a(MMGridPaper.this, 1);
            }
        }

        public C116063e() {
        }

        /* renamed from: a */
        public void mo65479a(int i, int i2, boolean z) {
            Log.m105919d("MicroMsg.MMGridPaper", "onScreenChanged:curScreen[%d], topEdge[%d], bottomEdge[%d], virtualPage[%d]", Integer.valueOf(i2), Integer.valueOf(MMGridPaper.this.f348228q), Integer.valueOf(MMGridPaper.this.f348229r), Integer.valueOf(MMGridPaper.this.f348230s));
            MMGridPaper mMGridPaper = MMGridPaper.this;
            int i3 = mMGridPaper.f348228q;
            if (i2 > i3 || i3 <= 0) {
                int i4 = mMGridPaper.f348229r;
                if (i2 >= i4 && i4 < mMGridPaper.f348230s - 1) {
                    mMGridPaper.f348222h.post(new C116065b(i2));
                }
            } else {
                mMGridPaper.f348222h.post(new C116064a(i2));
            }
            MMGridPaper mMGridPaper2 = MMGridPaper.this;
            mMGridPaper2.f348226o = i2;
            mMGridPaper2.f348219e.setSelectedDot(i2);
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMGridPaper$f */
    public interface C116066f {
        /* renamed from: a */
        void mo177286a(int i, int i2, int i3);
    }

    public MMGridPaper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C0966R.C0971layout.bck, this);
        this.f348212H = getScreenOrientation();
    }

    /* renamed from: a */
    public static void m163304a(MMGridPaper mMGridPaper, int i) {
        int i2 = mMGridPaper.f348228q + i;
        mMGridPaper.f348228q = i2;
        if (i2 < 0) {
            mMGridPaper.f348228q = 0;
        } else {
            int i3 = mMGridPaper.f348230s - mMGridPaper.f348227p;
            if (i2 > i3) {
                mMGridPaper.f348228q = i3;
            }
        }
        mMGridPaper.f348229r = (mMGridPaper.f348228q + mMGridPaper.f348227p) - 1;
    }

    private MMGridPaperGridView getCurrentPage() {
        MMFlipper mMFlipper = this.f348218d;
        return (MMGridPaperGridView) mMFlipper.getChildAt(mMFlipper.getCurScreen());
    }

    private int getScreenOrientation() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        return defaultDisplay.getWidth() < defaultDisplay.getHeight() ? 1 : 2;
    }

    /* renamed from: b */
    public final void mo177258b() {
        if (-1 != this.f348235x && getScreenOrientation() == 2) {
            View findViewById = findViewById(C0966R.C0970id.equ);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
            int b = C76577a.m92151b(getContext(), this.f348235x);
            if (b != layoutParams.height) {
                Log.m105925i("MicroMsg.MMGridPaper", "set land mode, special height is %d", Integer.valueOf(this.f348235x));
                layoutParams.height = b;
                findViewById.setLayoutParams(layoutParams);
                this.f348222h.post(new C116060b());
            }
        } else if (-1 != this.f348236y && getScreenOrientation() == 1) {
            View findViewById2 = findViewById(C0966R.C0970id.equ);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) findViewById2.getLayoutParams();
            int b2 = C76577a.m92151b(getContext(), this.f348236y);
            if (b2 != layoutParams2.height) {
                Log.m105925i("MicroMsg.MMGridPaper", "set port mode, special height is %d", Integer.valueOf(this.f348236y));
                layoutParams2.height = b2;
                findViewById2.setLayoutParams(layoutParams2);
                this.f348222h.post(new C116061c());
            }
        }
    }

    /* renamed from: c */
    public final int mo177259c(int i, int i2) {
        if (i2 <= 0) {
            Log.m105929w("MicroMsg.MMGridPaper", "ceil:total[%d], length[%d]", Integer.valueOf(i), Integer.valueOf(i2));
            return 0;
        }
        int i3 = i;
        int i4 = 0;
        while (i3 > 0) {
            i3 -= i2;
            i4++;
        }
        Log.m105925i("MicroMsg.MMGridPaper", "ceil:num[%d], length[%d], result[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4));
        return i4;
    }

    /* renamed from: d */
    public final void mo177260d() {
        Log.m105926v("MicroMsg.MMGridPaper", "MMGridPaper initFlipper");
        if (this.f348219e == null) {
            MMDotView mMDotView = (MMDotView) findViewById(C0966R.C0970id.eqv);
            this.f348219e = mMDotView;
            mMDotView.setMaxCount(this.f348234w);
        }
        if (this.f348218d == null) {
            MMFlipper mMFlipper = (MMFlipper) findViewById(C0966R.C0970id.eqw);
            this.f348218d = mMFlipper;
            mMFlipper.setOnMeasureListener(this.f348216L);
            this.f348218d.setOnScreenChangedListener(this.f348217M);
        }
        mo177258b();
        mo177261e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo177261e() {
        /*
            r15 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r15.f348223i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            int r2 = r15.f348224j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.MMGridPaper"
            java.lang.String r5 = "initSubGrid, grid width %d, grid height %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r5, r1)
            int r1 = r15.f348223i
            if (r1 == 0) goto L_0x02a4
            int r1 = r15.f348224j
            if (r1 != 0) goto L_0x0026
            goto L_0x02a4
        L_0x0026:
            android.content.Context r1 = r15.getContext()
            int r5 = r15.f348237z
            int r1 = kg3.C76577a.m92151b(r1, r5)
            android.content.Context r5 = r15.getContext()
            int r6 = r15.f348205A
            int r5 = kg3.C76577a.m92151b(r5, r6)
            int r6 = r15.f348223i
            int r6 = r6 / r1
            int r1 = java.lang.Math.max(r6, r4)
            int r6 = r15.f348224j
            int r6 = r6 / r5
            int r5 = java.lang.Math.max(r6, r4)
            int r6 = r15.f348231t
            if (r1 != r6) goto L_0x0050
            int r6 = r15.f348232u
            if (r5 == r6) goto L_0x0052
        L_0x0050:
            r15.f348233v = r4
        L_0x0052:
            r15.f348231t = r1
            int r6 = r15.f348213I
            r7 = -1
            if (r6 == r7) goto L_0x005f
            int r1 = java.lang.Math.min(r1, r6)
            r15.f348231t = r1
        L_0x005f:
            r15.f348232u = r5
            int r1 = r15.f348214J
            if (r1 == r7) goto L_0x006b
            int r1 = java.lang.Math.min(r5, r1)
            r15.f348232u = r1
        L_0x006b:
            int r1 = r15.f348231t
            int r5 = r15.f348232u
            int r1 = r1 * r5
            r15.f348230s = r3
            com.tencent.mm.ui.base.d r5 = r15.f348220f
            if (r5 != 0) goto L_0x0079
            r5 = 0
            goto L_0x007d
        L_0x0079:
            int r5 = r5.mo177353a()
        L_0x007d:
            int r5 = r5 + r3
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r3] = r7
            boolean r7 = r15.f348209E
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r4] = r7
            java.lang.String r7 = "totalCount is %d, dialogMode is %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r7, r6)
            if (r5 < 0) goto L_0x0097
            r6 = 1
            goto L_0x0098
        L_0x0097:
            r6 = 0
        L_0x0098:
            junit.framework.Assert.assertTrue(r6)
            boolean r6 = r15.f348209E
            r7 = 5
            r8 = 4
            r9 = 8
            r10 = 3
            if (r6 != 0) goto L_0x00a6
            goto L_0x012f
        L_0x00a6:
            int r6 = r15.f348231t
            int r6 = r15.mo177259c(r5, r6)
            int r11 = r15.getScreenOrientation()
            java.lang.String r12 = "orientation[%d], minRows[%d], targetHeight[%d], displayHeight[%d], orientationChange[%B]"
            if (r11 == r4) goto L_0x00f3
            if (r11 == r0) goto L_0x00b8
            goto L_0x012f
        L_0x00b8:
            int r13 = r15.f348211G
            int r6 = java.lang.Math.min(r6, r13)
            int r13 = r15.f348205A
            int r13 = r13 + 10
            int r13 = r13 * r6
            int r13 = r13 + r9
            java.lang.Object[] r14 = new java.lang.Object[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14[r3] = r11
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14[r4] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r14[r0] = r6
            int r6 = r15.f348235x
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14[r10] = r6
            boolean r6 = r15.f348208D
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r14[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r12, r14)
            int r6 = r15.f348235x
            if (r6 == r13) goto L_0x012f
            r15.f348235x = r13
            goto L_0x012d
        L_0x00f3:
            int r13 = r15.f348210F
            int r6 = java.lang.Math.min(r6, r13)
            int r13 = r15.f348205A
            int r13 = r13 + 10
            int r13 = r13 * r6
            int r13 = r13 + r9
            java.lang.Object[] r14 = new java.lang.Object[r7]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14[r3] = r11
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14[r4] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r14[r0] = r6
            int r6 = r15.f348236y
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14[r10] = r6
            boolean r6 = r15.f348208D
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r14[r8] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r12, r14)
            int r6 = r15.f348236y
            if (r6 == r13) goto L_0x012f
            r15.f348236y = r13
        L_0x012d:
            r6 = 0
            goto L_0x0130
        L_0x012f:
            r6 = 1
        L_0x0130:
            if (r6 != 0) goto L_0x0136
            r15.mo177258b()
            return
        L_0x0136:
            int r5 = r15.mo177259c(r5, r1)
            r15.f348230s = r5
            int r5 = r5 - r4
            int r6 = r15.f348225n
            if (r6 == 0) goto L_0x0166
            if (r1 > 0) goto L_0x0144
            goto L_0x0166
        L_0x0144:
            r11 = 0
            r12 = r6
        L_0x0146:
            if (r12 < r1) goto L_0x014c
            int r12 = r12 - r1
            int r11 = r11 + 1
            goto L_0x0146
        L_0x014c:
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12[r3] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r12[r0] = r1
            java.lang.String r1 = "floor:num[%d], length[%d], result[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r12)
            goto L_0x017a
        L_0x0166:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11[r3] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r4] = r1
            java.lang.String r1 = "floor:total[%d], length[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r1, r11)
            r11 = 0
        L_0x017a:
            int r1 = java.lang.Math.min(r5, r11)
            r15.f348226o = r1
            int r1 = r15.f348230s
            int r1 = java.lang.Math.min(r10, r1)
            r15.f348227p = r1
            int r5 = r15.f348230s
            int r5 = r5 - r1
            int r6 = r15.f348226o
            int r1 = r1 >> r4
            int r6 = r6 - r1
            int r1 = java.lang.Math.max(r3, r6)
            int r1 = java.lang.Math.min(r5, r1)
            r15.f348228q = r1
            int r5 = r15.f348227p
            int r1 = r1 + r5
            int r1 = r1 - r4
            r15.f348229r = r1
            r1 = 9
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r5 = r15.f348237z
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r3] = r5
            int r5 = r15.f348205A
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r4] = r5
            int r5 = r15.f348232u
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r0] = r5
            int r5 = r15.f348231t
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r10] = r5
            int r5 = r15.f348227p
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r8] = r5
            int r5 = r15.f348230s
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r7] = r5
            r5 = 6
            int r6 = r15.f348226o
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r5] = r6
            r5 = 7
            int r6 = r15.f348228q
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r5] = r6
            int r5 = r15.f348229r
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r9] = r5
            java.lang.String r5 = "initSubGrid:item[%ddp,%ddp], row[%d], column[%d], activePage[%d], virtualPage[%d], curVirtualPage[%d], edge[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r1)
            com.tencent.mm.ui.base.MMFlipper r1 = r15.f348218d
            int r1 = r1.getChildCount()
            int r5 = r15.f348227p
            if (r1 != r5) goto L_0x0245
            boolean r1 = r15.f348233v
            if (r1 == 0) goto L_0x0201
            goto L_0x0245
        L_0x0201:
            int r1 = r15.f348228q
        L_0x0203:
            int r5 = r15.f348229r
            if (r1 > r5) goto L_0x02a0
            com.tencent.mm.ui.base.MMFlipper r5 = r15.f348218d
            int r6 = r15.f348228q
            int r6 = r1 - r6
            android.view.View r5 = r5.getChildAt(r6)
            com.tencent.mm.ui.base.MMGridPaperGridView r5 = (com.tencent.p014mm.p136ui.base.MMGridPaperGridView) r5
            int r6 = r5.getIndex()
            if (r6 == r1) goto L_0x023d
            java.lang.Object[] r6 = new java.lang.Object[r0]
            int r7 = r5.getIndex()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6[r4] = r7
            java.lang.String r7 = "old index %d, new index %d, reset it"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r7, r6)
            int r6 = r15.f348232u
            int r7 = r15.f348231t
            com.tencent.mm.ui.base.d r8 = r15.f348220f
            r5.mo177289i(r1, r6, r7, r8)
            r5.mo177288h()
            goto L_0x0242
        L_0x023d:
            java.lang.String r5 = "same grid index, continus"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r5)
        L_0x0242:
            int r1 = r1 + 1
            goto L_0x0203
        L_0x0245:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            boolean r1 = r15.f348233v
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r3] = r1
            java.lang.String r1 = "error child count or RowOrColChanged(%B), reset child view"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r1, r0)
            r15.f348233v = r3
            com.tencent.mm.ui.base.MMFlipper r0 = r15.f348218d
            r0.removeAllViews()
            int r0 = r15.f348228q
        L_0x025d:
            int r1 = r15.f348229r
            if (r0 > r1) goto L_0x02a0
            android.content.Context r1 = r15.getContext()
            r2 = 2131496529(0x7f0c0e51, float:1.8616625E38)
            r3 = 0
            android.view.View r1 = android.view.View.inflate(r1, r2, r3)
            com.tencent.mm.ui.base.MMGridPaperGridView r1 = (com.tencent.p014mm.p136ui.base.MMGridPaperGridView) r1
            int r2 = r15.f348232u
            int r3 = r15.f348231t
            com.tencent.mm.ui.base.d r4 = r15.f348220f
            r1.mo177289i(r0, r2, r3, r4)
            android.content.Context r2 = r15.getContext()
            int r3 = r15.f348206B
            int r2 = kg3.C76577a.m92151b(r2, r3)
            r1.setHorizontalSpacing(r2)
            android.content.Context r2 = r15.getContext()
            int r3 = r15.f348207C
            int r2 = kg3.C76577a.m92151b(r2, r3)
            r1.setVerticalSpacing(r2)
            com.tencent.mm.ui.base.MMFlipper r2 = r15.f348218d
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.addView(r1, r3)
            int r0 = r0 + 1
            goto L_0x025d
        L_0x02a0:
            r15.mo177263g()
            return
        L_0x02a4:
            java.lang.String r0 = "initSubGrid:gridWithd or gridHeight is 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.MMGridPaper.mo177261e():void");
    }

    /* renamed from: f */
    public void mo177262f() {
        int i = this.f348226o;
        this.f348225n = this.f348231t * i * this.f348232u;
        Log.m105927v("MicroMsg.MMGridPaper", "refreshed:virtualPage[%d], col[%d], row[%d], scrollCount[%d]", Integer.valueOf(i), Integer.valueOf(this.f348231t), Integer.valueOf(this.f348232u), Integer.valueOf(this.f348225n));
        mo177260d();
    }

    /* renamed from: g */
    public final void mo177263g() {
        Log.m105926v("MicroMsg.MMGridPaper", "set DotView");
        Assert.assertTrue(this.f348230s >= 0);
        this.f348219e.setDotCount(this.f348230s);
        if (this.f348220f == null || this.f348230s <= 1) {
            this.f348219e.setVisibility(8);
            Log.m105926v("MicroMsg.MMGridPaper", "set DotView gone");
        } else {
            this.f348219e.setVisibility(0);
            Log.m105926v("MicroMsg.MMGridPaper", "set DotView visible");
        }
        int i = this.f348226o;
        int i2 = this.f348230s;
        if (i >= i2) {
            this.f348226o = i2 - 1;
        }
        this.f348218d.mo101663a(this.f348226o - this.f348228q);
        this.f348218d.mo101667d(this.f348226o);
        this.f348219e.setSelectedDot(this.f348226o);
    }

    public int getItemsCountPerPage() {
        return this.f348232u * this.f348231t;
    }

    public int getPageCount() {
        return this.f348230s;
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i = configuration.orientation;
        if (i == 1 || i == 2) {
            Log.m105918d("MicroMsg.MMGridPaper", "onConfigChanged:" + configuration.orientation);
            this.f348208D = true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105919d("MicroMsg.MMGridPaper", "onLayout left=%s top=%s right=%s bottom=%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (this.f348212H != getScreenOrientation()) {
            this.f348212H = getScreenOrientation();
            Log.m105918d("MicroMsg.MMGridPaper", "onLayout, currentOrientation changed, reAdjustDisplayArea");
            this.f348208D = true;
            clearAnimation();
            mo177258b();
            mo177261e();
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setDialogMode(boolean z) {
        this.f348209E = z;
    }

    public void setDisplayHeightLandInDp(int i) {
        this.f348235x = i;
    }

    public void setDisplayHeightPortInDp(int i) {
        this.f348236y = i;
    }

    public void setGridHeight(int i) {
        this.f348224j = i;
    }

    public void setGridPaperAdapter(C116072d dVar) {
        this.f348220f = dVar;
        boolean z = true;
        Object[] objArr = new Object[1];
        if (dVar != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.MMGridPaper", "setGridPaperAdapter:adapter is null[%B]", objArr);
        C116072d dVar2 = this.f348220f;
        if (dVar2 != null) {
            dVar2.f348349a = new C116059a();
        }
        mo177260d();
    }

    public void setGridWidth(int i) {
        this.f348223i = i;
    }

    public void setHeaderView(View view) {
        this.f348221g = view;
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.eue);
        viewGroup.removeAllViews();
        View view2 = this.f348221g;
        if (view2 != null) {
            viewGroup.addView(view2);
        }
    }

    public void setItemHeightInDp(int i) {
        this.f348205A = i;
    }

    public void setItemWidthInDp(int i) {
        this.f348237z = i;
    }

    public void setManualMeasureMode(boolean z) {
        this.f348215K = z;
    }

    public void setMaxCol(int i) {
        this.f348213I = i;
    }

    public void setMaxDotCount(int i) {
        this.f348234w = i;
    }

    public void setMaxRow(int i) {
        this.f348214J = i;
    }

    public void setOnPageSizeChangeListener(C116066f fVar) {
    }
}
