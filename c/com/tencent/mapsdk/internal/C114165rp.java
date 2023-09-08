package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.mapsdk.internal.C113701eo;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.mapsdk.internal.C113880kc;
import com.tencent.mapsdk.vector.VectorMap;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mapsdk.internal.rp */
public final class C114165rp extends C113699em {

    /* renamed from: ab */
    private static final int f341737ab = 6;

    /* renamed from: ae */
    private static final float f341738ae = 0.7f;

    /* renamed from: af */
    private static final float f341739af = 1.3f;

    /* renamed from: f */
    public static final float[] f341740f = {1000000.0f, 500000.0f, 200000.0f, 100000.0f, 50000.0f, 25000.0f, 20000.0f, 10000.0f, 5000.0f, 2000.0f, 1000.0f, 500.0f, 200.0f, 100.0f, 50.0f, 20.0f, 10.0f, 5.0f, 2.0f, 1.0f};

    /* renamed from: A */
    private volatile boolean f341741A;

    /* renamed from: B */
    private C113740fv f341742B;

    /* renamed from: C */
    private boolean f341743C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Context f341744D;

    /* renamed from: E */
    private Bitmap f341745E;

    /* renamed from: F */
    private Bitmap f341746F;

    /* renamed from: G */
    private C113701eo.C113703b f341747G = C113701eo.C113703b.RIGHT_BOTTOM;

    /* renamed from: H */
    private C113701eo.C113703b f341748H = C113701eo.C113703b.LEFT_BOTTOM;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public ViewGroup f341749I;

    /* renamed from: J */
    private int[] f341750J = {-1, -1, -1, -1};

    /* renamed from: K */
    private int[] f341751K = {-1, -1, -1, -1};

    /* renamed from: L */
    private int[] f341752L = new int[C113701eo.C113702a.values().length];

    /* renamed from: M */
    private int[] f341753M = new int[C113701eo.C113702a.values().length];

    /* renamed from: N */
    private float[] f341754N = {0.02f, 0.02f, 0.012f, 0.012f};

    /* renamed from: O */
    private float[] f341755O = {0.022f, 0.022f, 0.0125f, 0.0125f};

    /* renamed from: P */
    private float[] f341756P = {0.0185f, 0.0185f, 0.0104f, 0.0104f};

    /* renamed from: Q */
    private int f341757Q = 0;

    /* renamed from: R */
    private int f341758R = 0;

    /* renamed from: S */
    private int f341759S = 0;

    /* renamed from: T */
    private int f341760T = 0;

    /* renamed from: U */
    private int f341761U = 0;

    /* renamed from: V */
    private final List<C114183rt> f341762V = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final ConcurrentHashMap<String, Bitmap> f341763W = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final List<String> f341764X = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public String f341765Y = null;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public int f341766Z = 26;

    /* renamed from: a */
    public ImageView f341767a;
    /* access modifiers changed from: private */

    /* renamed from: aa */
    public C104571e f341768aa;

    /* renamed from: ac */
    private LinearLayout f341769ac;

    /* renamed from: ad */
    private final int f341770ad = 18;

    /* renamed from: ag */
    private Animation f341771ag;

    /* renamed from: ah */
    private int f341772ah = -1;

    /* renamed from: ai */
    private int f341773ai = -1;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public C113880kc.C113881a f341774aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public C113532ba f341775ak;

    /* renamed from: al */
    private boolean f341776al = true;

    /* renamed from: b */
    public boolean f341777b = true;

    /* renamed from: c */
    public float[] f341778c = {-1.0f, -1.0f, -1.0f, -1.0f};

    /* renamed from: d */
    public int f341779d = 0;

    /* renamed from: e */
    public int f341780e = 0;

    /* renamed from: g */
    public float f341781g = 0.0f;

    /* renamed from: h */
    public String f341782h = "50米";

    /* renamed from: i */
    public int f341783i = 109;

    /* renamed from: j */
    public float f341784j = 1.0f;

    /* renamed from: k */
    public int f341785k;

    /* renamed from: l */
    public double f341786l;

    /* renamed from: m */
    public boolean f341787m = true;

    /* renamed from: n */
    public boolean f341788n = false;

    /* renamed from: o */
    public LinearLayout f341789o;

    /* renamed from: p */
    public final int f341790p;

    /* renamed from: q */
    public float f341791q = Float.MIN_VALUE;

    /* renamed from: r */
    public List<C114173c> f341792r = new ArrayList();

    /* renamed from: s */
    public int f341793s = -1;

    /* renamed from: t */
    public int f341794t = -1;

    /* renamed from: u */
    public C114097qd f341795u;

    /* renamed from: v */
    private final int f341796v = 500;

    /* renamed from: w */
    private final int f341797w = 1000;

    /* renamed from: x */
    private Bitmap f341798x;

    /* renamed from: y */
    private Rect f341799y;

    /* renamed from: z */
    private boolean f341800z;

    /* renamed from: com.tencent.mapsdk.internal.rp$d */
    public enum C104570d {
        ;
        

        /* renamed from: a */
        public static final int f309974a = 1;

        /* renamed from: b */
        public static final int f309975b = 2;

        /* access modifiers changed from: public */
        static {
            f309976c = new int[]{1, 2};
        }

        /* renamed from: a */
        private static int[] m140081a() {
            return (int[]) f309976c.clone();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rp$6 */
    public static /* synthetic */ class C1141706 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f341806a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.mapsdk.internal.eo$b[] r0 = com.tencent.mapsdk.internal.C113701eo.C113703b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f341806a = r0
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.LEFT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f341806a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.CENTER_BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f341806a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.RIGHT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f341806a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.LEFT_TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f341806a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.CENTER_TOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f341806a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.RIGHT_TOP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114165rp.C1141706.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rp$a */
    public static class C114171a extends C113865kb.C113879g<Bitmap> {

        /* renamed from: a */
        private WeakReference<C114165rp> f341807a;

        /* renamed from: b */
        private String f341808b;

        /* renamed from: c */
        private String f341809c;

        public C114171a(C114165rp rpVar, String str, String str2) {
            this.f341807a = new WeakReference<>(rpVar);
            this.f341808b = str;
            this.f341809c = str2;
        }

        /* renamed from: a */
        private Bitmap m159481a() {
            C114165rp rpVar;
            WeakReference<C114165rp> weakReference = this.f341807a;
            Bitmap bitmap = null;
            if (!(weakReference == null || (rpVar = weakReference.get()) == null)) {
                File file = new File(C114165rp.m159409a(rpVar, this.f341809c));
                C113889km.m157550c(C0949kl.f2252v, "Logo[" + this.f341809c + "] request url[" + this.f341808b + "]...");
                C113889km.m157550c(C0949kl.f2252v, "Logo[" + this.f341809c + "] save to[" + file + "]...");
                NetResponse downloadTo = NetManager.getInstance().builder().url(this.f341808b).downloadTo(file);
                if (downloadTo != null && downloadTo.available()) {
                    byte[] bArr = downloadTo.data;
                    int length = bArr.length;
                    C113889km.m157550c(C0949kl.f2252v, "Logo[" + this.f341809c + "] request url ok! bitmap size[" + length + "]...");
                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, length);
                    if (bitmap != null) {
                        rpVar.f341763W.put(this.f341809c, bitmap);
                    }
                }
            }
            return bitmap;
        }

        public final /* synthetic */ Object call() {
            C114165rp rpVar;
            WeakReference<C114165rp> weakReference = this.f341807a;
            Bitmap bitmap = null;
            if (!(weakReference == null || (rpVar = weakReference.get()) == null)) {
                File file = new File(C114165rp.m159409a(rpVar, this.f341809c));
                C113889km.m157550c(C0949kl.f2252v, "Logo[" + this.f341809c + "] request url[" + this.f341808b + "]...");
                C113889km.m157550c(C0949kl.f2252v, "Logo[" + this.f341809c + "] save to[" + file + "]...");
                NetResponse downloadTo = NetManager.getInstance().builder().url(this.f341808b).downloadTo(file);
                if (downloadTo != null && downloadTo.available()) {
                    byte[] bArr = downloadTo.data;
                    int length = bArr.length;
                    C113889km.m157550c(C0949kl.f2252v, "Logo[" + this.f341809c + "] request url ok! bitmap size[" + length + "]...");
                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, length);
                    if (bitmap != null) {
                        rpVar.f341763W.put(this.f341809c, bitmap);
                    }
                }
            }
            return bitmap;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rp$b */
    public static class C114172b extends C113865kb.C113868a<Bitmap> {

        /* renamed from: a */
        private WeakReference<C114165rp> f341810a;

        /* renamed from: b */
        private String f341811b;

        public C114172b(C114165rp rpVar, String str) {
            this.f341810a = new WeakReference<>(rpVar);
            this.f341811b = str;
        }

        /* renamed from: a */
        private void m159482a(Bitmap bitmap) {
            WeakReference<C114165rp> weakReference;
            C114165rp rpVar;
            if (bitmap != null && (weakReference = this.f341810a) != null && (rpVar = weakReference.get()) != null) {
                C113884kf.m157490a(new File(C114165rp.m159409a(rpVar, this.f341811b)), new File(rpVar.m159410a(this.f341811b)));
                if (this.f341811b.equals(rpVar.f341765Y)) {
                    C113889km.m157550c(C0949kl.f2252v, "Logo[" + this.f341811b + "] set from net");
                    rpVar.m159414a(bitmap);
                }
                rpVar.f341764X.remove(this.f341811b);
            }
        }

        public final /* synthetic */ void callback(Object obj) {
            WeakReference<C114165rp> weakReference;
            C114165rp rpVar;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null && (weakReference = this.f341810a) != null && (rpVar = weakReference.get()) != null) {
                C113884kf.m157490a(new File(C114165rp.m159409a(rpVar, this.f341811b)), new File(rpVar.m159410a(this.f341811b)));
                if (this.f341811b.equals(rpVar.f341765Y)) {
                    C113889km.m157550c(C0949kl.f2252v, "Logo[" + this.f341811b + "] set from net");
                    rpVar.m159414a(bitmap);
                }
                rpVar.f341764X.remove(this.f341811b);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.rp$c */
    public interface C114173c {
        /* renamed from: a */
        void mo171683a(View view, Rect rect, boolean z);

        /* renamed from: a */
        void mo171685a(C114165rp rpVar);

        /* renamed from: b */
        void mo171687b(View view, Rect rect, boolean z);

        /* renamed from: c */
        void mo171689c();
    }

    /* renamed from: com.tencent.mapsdk.internal.rp$f */
    public static class C114174f implements Runnable {

        /* renamed from: a */
        private WeakReference<C114165rp> f341812a;

        public C114174f(C114165rp rpVar) {
            this.f341812a = new WeakReference<>(rpVar);
        }

        public final void run() {
            C114165rp rpVar;
            WeakReference<C114165rp> weakReference = this.f341812a;
            if (weakReference != null && (rpVar = weakReference.get()) != null) {
                rpVar.mo171999a(rpVar.f341749I, (Bundle) null);
            }
        }
    }

    public C114165rp(Context context, final C114322sx sxVar, int i) {
        this.f341744D = context;
        this.f341775ak = sxVar;
        this.f341790p = i;
        this.f341784j = context.getResources().getDisplayMetrics().density;
        this.f341767a = new ImageView(context);
        this.f341768aa = new C104571e(this.f341744D);
        if (this.f341784j <= 0.0f) {
            this.f341784j = 1.0f;
        }
        LinearLayout linearLayout = new LinearLayout(this.f341744D);
        this.f341769ac = linearLayout;
        linearLayout.setOrientation(1);
        this.f341769ac.setGravity(16);
        this.f341769ac.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (C114165rp.this.f341774aj == null) {
                    C114165rp rpVar = C114165rp.this;
                    C113880kc.C113881a unused = rpVar.f341774aj = C113880kc.m157444a(rpVar.f341744D, (String) null, " ", 0);
                }
                C113889km.m157534a(C114165rp.this.f341744D, C114165rp.this.f341774aj);
            }
        });
        this.f341769ac.setOnLongClickListener(new View.OnLongClickListener() {
            public final boolean onLongClick(View view) {
                return C113760gf.m156973a((C113565bo) sxVar.f339876d_);
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(this.f341744D);
        this.f341789o = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f341789o.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        this.f341789o.addView(this.f341768aa, layoutParams);
        this.f341789o.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f341771ag = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.f341771ag.setStartOffset(500);
        this.f341771ag.setAnimationListener(new Animation.AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
                C114165rp.this.m159434d(false);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C114165rp.this.m159434d(true);
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 3;
        this.f341769ac.addView(this.f341767a, layoutParams2);
        C114185ru ruVar = sxVar.f342584k.f341875b;
        if (ruVar != null) {
            mo172794a(ruVar.mo172834c());
        }
    }

    /* renamed from: o */
    private String m159448o() {
        return this.f341744D.getFilesDir().getAbsolutePath() + "/tencentMapSdk/logos";
    }

    /* renamed from: p */
    private String m159449p() {
        return this.f341744D.getFilesDir().getAbsolutePath() + "/tencentMapSdk/oldLogos";
    }

    /* renamed from: q */
    private void m159450q() {
        this.f341763W.clear();
    }

    /* renamed from: r */
    private FrameLayout.LayoutParams m159451r() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = this.f341789o;
        if (linearLayout == null) {
            return layoutParams;
        }
        int measuredWidth = linearLayout.getMeasuredWidth();
        int measuredHeight = this.f341789o.getMeasuredHeight();
        switch (C1141706.f341806a[this.f341748H.ordinal()]) {
            case 1:
                layoutParams.gravity = 83;
                int[] iArr = this.f341753M;
                int i = iArr[C113701eo.C113702a.BOTTOM.f340162e];
                layoutParams.bottomMargin = i;
                int i2 = iArr[C113701eo.C113702a.LEFT.f340162e];
                layoutParams.leftMargin = i2;
                this.f341794t = (this.f341757Q - i) - measuredHeight;
                this.f341793s = i2;
                break;
            case 2:
                layoutParams.gravity = 81;
                int i3 = this.f341753M[C113701eo.C113702a.BOTTOM.f340162e];
                layoutParams.bottomMargin = i3;
                this.f341794t = (this.f341757Q - i3) - measuredHeight;
                this.f341793s = (this.f341779d - measuredWidth) / 2;
                break;
            case 3:
                layoutParams.gravity = 85;
                int[] iArr2 = this.f341753M;
                int i4 = iArr2[C113701eo.C113702a.BOTTOM.f340162e];
                layoutParams.bottomMargin = i4;
                int i5 = iArr2[C113701eo.C113702a.RIGHT.f340162e];
                layoutParams.rightMargin = i5;
                this.f341794t = (this.f341757Q - i4) - measuredHeight;
                this.f341793s = (this.f341779d - i5) - measuredWidth;
                break;
            case 4:
                layoutParams.gravity = 51;
                int[] iArr3 = this.f341753M;
                int i6 = iArr3[C113701eo.C113702a.TOP.f340162e];
                layoutParams.topMargin = i6;
                int i7 = iArr3[C113701eo.C113702a.LEFT.f340162e];
                layoutParams.leftMargin = i7;
                this.f341794t = i6;
                this.f341793s = i7;
                break;
            case 5:
                layoutParams.gravity = 49;
                int i8 = this.f341753M[C113701eo.C113702a.TOP.f340162e];
                layoutParams.topMargin = i8;
                this.f341794t = i8;
                this.f341793s = (this.f341779d - measuredWidth) / 2;
                break;
            case 6:
                layoutParams.gravity = 53;
                int[] iArr4 = this.f341753M;
                int i9 = iArr4[C113701eo.C113702a.TOP.f340162e];
                layoutParams.topMargin = i9;
                int i15 = iArr4[C113701eo.C113702a.RIGHT.f340162e];
                layoutParams.rightMargin = i15;
                this.f341794t = i9;
                this.f341793s = (this.f341779d - i15) - measuredWidth;
                break;
            default:
                C113889km.m157549c("Unknown positionScale:" + this.f341748H);
                break;
        }
        return layoutParams;
    }

    /* renamed from: s */
    private C113701eo.C113703b m159452s() {
        return this.f341748H;
    }

    /* renamed from: t */
    private void m159453t() {
        mo172801h();
    }

    /* renamed from: u */
    private void m159454u() {
        mo172802i();
    }

    /* renamed from: v */
    private boolean m159455v() {
        return this.f341787m;
    }

    /* renamed from: w */
    private void m159456w() {
        m159457x();
        this.f341789o.startAnimation(this.f341771ag);
    }

    /* renamed from: x */
    private void m159457x() {
        LinearLayout linearLayout = this.f341789o;
        if (linearLayout != null && this.f341771ag != null) {
            linearLayout.clearAnimation();
            this.f341771ag.reset();
        }
    }

    /* renamed from: y */
    private void m159458y() {
        String str;
        int width = this.f341767a.getWidth();
        if (width <= 0) {
            width = 1000;
        }
        int ceil = (int) Math.ceil((double) (((float) width) / 4.0f));
        int ceil2 = (int) (Math.ceil((double) ((((float) this.f341779d) * 3.0f) / 8.0f)) - ((double) (this.f341784j * 6.0f)));
        float[] fArr = f341740f;
        int length = fArr.length;
        int i = this.f341785k - this.f341790p;
        if (i < 0) {
            i = 0;
        }
        if (i >= length) {
            i = length - 1;
        }
        float f = fArr[i];
        if (this.f341781g != f) {
            this.f341781g = f;
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    C114165rp.this.f341775ak.mo171577b(C114165rp.this.f341781g);
                }
            });
        }
        float f2 = (float) ceil;
        double d = this.f341786l;
        if (d != 0.0d) {
            f2 = (float) (((double) f) / d);
        }
        int round = Math.round(f2);
        this.f341783i = round;
        if (round > ceil2) {
            this.f341783i = ceil2;
        } else if (round < ceil) {
            this.f341783i = ceil;
        }
        if (f >= 1000.0f) {
            f /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f341782h = ((int) f) + str;
    }

    /* renamed from: c */
    private Bitmap m159428c(String str) {
        FileInputStream fileInputStream;
        try {
            File file = new File(m159410a(str));
            if (!file.exists()) {
                C113886kg.m157515a((Closeable) null);
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                C113886kg.m157515a((Closeable) fileInputStream);
                return decodeStream;
            } catch (Throwable unused) {
                C113886kg.m157515a((Closeable) fileInputStream);
                return null;
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
            C113886kg.m157515a((Closeable) fileInputStream);
            return null;
        }
    }

    /* renamed from: n */
    private void m159447n() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f341771ag = alphaAnimation;
        alphaAnimation.setDuration(1000);
        this.f341771ag.setStartOffset(500);
        this.f341771ag.setAnimationListener(new Animation.AnimationListener() {
            public final void onAnimationEnd(Animation animation) {
                C114165rp.this.m159434d(false);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C114165rp.this.m159434d(true);
            }
        });
    }

    /* renamed from: d */
    public final C113701eo.C113703b mo172001d() {
        return this.f341747G;
    }

    /* renamed from: e */
    public final void mo172798e() {
        if (!this.f341787m) {
            m159434d(false);
        } else if (this.f341788n) {
            m159434d(true);
            m159457x();
        } else {
            m159434d(true);
            m159456w();
        }
    }

    /* renamed from: f */
    public final void mo172799f() {
        C113865kb.m157399a((Runnable) new C114174f(this));
    }

    /* renamed from: g */
    public final void mo172800g() {
        C113889km.m157550c(C0949kl.f2252v, "clearLogoCache..");
        this.f341763W.clear();
        this.f341764X.clear();
        try {
            File file = new File(m159448o());
            if (file.exists()) {
                File file2 = new File(m159449p());
                if (file.renameTo(file2)) {
                    C113886kg.m157524c(file2.getAbsolutePath());
                } else {
                    C113886kg.m157524c(file.getAbsolutePath());
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public final void mo172801h() {
        if (this.f341779d != 0 && this.f341757Q != 0) {
            float f = this.f341784j;
            int i = (int) ((((float) this.f341758R) * f) / 3.0f);
            int i2 = (int) ((((float) this.f341759S) * f) / 3.0f);
            int[] d = m159435d(i, i2);
            int i3 = this.f341760T;
            int i4 = d[0];
            if (!(i3 == i4 && this.f341761U == d[1])) {
                this.f341760T = i4;
                this.f341761U = d[1];
                this.f341741A = true;
            }
            float[] fArr = this.f341754N;
            int i5 = this.f341779d;
            if (i5 >= 1080) {
                fArr = this.f341756P;
            } else if (i5 >= 720) {
                fArr = this.f341755O;
            }
            int i6 = C113701eo.C113702a.LEFT.f340162e;
            float f2 = fArr[i6];
            float[] fArr2 = this.f341778c;
            float f3 = fArr2[i6];
            if (f3 >= 0.0f) {
                f2 = f3;
            }
            int[] iArr = this.f341752L;
            iArr[i6] = (int) (((float) i5) * f2);
            if (this.f341776al) {
                this.f341751K[C113701eo.C113702a.BOTTOM.f340162e] = i2;
            }
            int[] iArr2 = this.f341750J;
            int i7 = iArr2[i6];
            if (i7 >= 0 && i7 < i5 - i) {
                iArr[i6] = i7;
            }
            int i8 = C113701eo.C113702a.RIGHT.f340162e;
            float f4 = fArr[i8];
            float f5 = fArr2[i8];
            if (f5 >= 0.0f) {
                f4 = f5;
            }
            iArr[i8] = (int) (((float) i5) * f4);
            int i9 = iArr2[i8];
            if (i9 >= 0 && i9 < i5 - i) {
                iArr[i8] = i9;
            }
            int i15 = C113701eo.C113702a.BOTTOM.f340162e;
            float f6 = fArr[i15];
            float f7 = fArr2[i15];
            if (f7 >= 0.0f) {
                f6 = f7;
            }
            int i16 = this.f341757Q;
            iArr[i15] = (int) (((float) i16) * f6);
            int i17 = iArr2[i15];
            if (i17 >= 0 && i17 < i16 - i2) {
                iArr[i15] = i17;
            }
            int i18 = C113701eo.C113702a.TOP.f340162e;
            float f8 = fArr[i18];
            float f9 = fArr2[i18];
            if (f9 >= 0.0f) {
                f8 = f9;
            }
            iArr[i18] = (int) (((float) i16) * f8);
            int i19 = iArr2[i18];
            if (i19 >= 0 && i19 < i16 - i2) {
                iArr[i18] = i19;
            }
            mo172799f();
        }
    }

    /* renamed from: i */
    public final void mo172802i() {
        if (this.f341779d != 0 && this.f341757Q != 0) {
            int measuredHeight = this.f341789o.getMeasuredHeight();
            int measuredWidth = this.f341789o.getMeasuredWidth();
            float[] fArr = this.f341754N;
            int i = this.f341779d;
            if (i >= 1080) {
                fArr = this.f341756P;
            } else if (i >= 720) {
                fArr = this.f341755O;
            }
            int i2 = C113701eo.C113702a.LEFT.f340162e;
            float f = fArr[i2];
            float[] fArr2 = this.f341778c;
            float f2 = fArr2[i2];
            if (f2 >= 0.0f) {
                f = f2;
            }
            int[] iArr = this.f341753M;
            iArr[i2] = (int) (((float) i) * f);
            int[] iArr2 = this.f341751K;
            int i3 = iArr2[i2];
            if (i3 >= 0 && i3 < i - measuredWidth) {
                iArr[i2] = i3;
            }
            int i4 = C113701eo.C113702a.RIGHT.f340162e;
            float f3 = fArr[i4];
            float f4 = fArr2[i4];
            if (f4 >= 0.0f) {
                f3 = f4;
            }
            iArr[i4] = (int) (((float) i) * f3);
            int i5 = iArr2[i4];
            if (i5 >= 0 && i5 < i - measuredWidth) {
                iArr[i4] = i5;
            }
            int i6 = C113701eo.C113702a.BOTTOM.f340162e;
            float f5 = fArr[i6];
            float f6 = fArr2[i6];
            if (f6 >= 0.0f) {
                f5 = f6;
            }
            int i7 = this.f341757Q;
            iArr[i6] = (int) (((float) i7) * f5);
            int i8 = iArr2[i6];
            if (i8 >= 0 && i8 < i7 - measuredHeight) {
                iArr[i6] = i8;
            }
            int i9 = C113701eo.C113702a.TOP.f340162e;
            float f7 = fArr[i9];
            float f8 = fArr2[i9];
            if (f8 >= 0.0f) {
                f7 = f8;
            }
            iArr[i9] = (int) (((float) i7) * f7);
            int i15 = iArr2[i9];
            if (i15 >= 0 && i15 < i7 - measuredHeight) {
                iArr[i9] = i15;
            }
            mo172799f();
        }
    }

    /* renamed from: j */
    public final Bitmap mo172803j() {
        Drawable drawable;
        ImageView imageView = this.f341767a;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return null;
        }
        return ((BitmapDrawable) drawable).getBitmap();
    }

    /* renamed from: k */
    public final boolean mo172804k() {
        if (!C40002he.m42805a(this.f341765Y) && !this.f341765Y.contains("tencent") && !this.f341765Y.contains(C114181rs.f341837c)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo172805l() {
        List<C114173c> list = this.f341792r;
        if (list != null) {
            for (C114173c a : list) {
                a.mo171685a(this);
            }
        }
    }

    /* renamed from: m */
    public final void mo172806m() {
        List<C114173c> list = this.f341792r;
        if (list != null) {
            for (C114173c c : list) {
                c.mo171689c();
            }
        }
    }

    /* renamed from: b */
    private String m159424b(String str) {
        return m159410a(str) + ".tmp";
    }

    /* renamed from: d */
    private int m159433d(C113701eo.C113702a aVar) {
        return this.f341751K[aVar.f340162e];
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m159434d(boolean z) {
        LinearLayout linearLayout = this.f341789o;
        if (linearLayout != null) {
            linearLayout.setVisibility(z ? 0 : 8);
            this.f341789o.requestLayout();
            this.f341789o.invalidate();
        }
        C104571e eVar = this.f341768aa;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    /* renamed from: b */
    public final void mo171655b(int i, int i2) {
        this.f341779d = i;
        this.f341757Q = i2;
        mo172801h();
        mo172802i();
    }

    /* renamed from: a */
    public final boolean mo171999a(ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        Rect rect;
        int i;
        C114097qd qdVar;
        M m;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 == null) {
            return false;
        }
        this.f341749I = viewGroup2;
        if (this.f341741A) {
            C113886kg.m157517a(this.f341746F);
            Bitmap a = C104548ha.m139941a(this.f341745E, this.f341744D, this.f341760T, this.f341761U);
            this.f341746F = a;
            this.f341767a.setImageBitmap(a);
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f341760T;
        int i3 = this.f341761U;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (!(i2 == 0 || i3 == 0)) {
            switch (C1141706.f341806a[this.f341747G.ordinal()]) {
                case 1:
                    layoutParams.gravity = 83;
                    int[] iArr = this.f341752L;
                    int i4 = iArr[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams.bottomMargin = i4;
                    int i5 = iArr[C113701eo.C113702a.LEFT.f340162e];
                    layoutParams.leftMargin = i5;
                    this.f341773ai = (this.f341757Q - i4) - i3;
                    this.f341772ah = i5;
                    break;
                case 2:
                    layoutParams.gravity = 81;
                    int i6 = this.f341752L[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams.bottomMargin = i6;
                    this.f341773ai = (this.f341757Q - i6) - i3;
                    this.f341772ah = (this.f341779d - i2) / 2;
                    break;
                case 3:
                    layoutParams.gravity = 85;
                    int[] iArr2 = this.f341752L;
                    layoutParams.bottomMargin = iArr2[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams.rightMargin = iArr2[C113701eo.C113702a.RIGHT.f340162e];
                    if (C114207sl.f341931c.equals("wechat") && (qdVar = this.f341795u) != null) {
                        int i7 = layoutParams.bottomMargin + (i3 * 2);
                        qdVar.f341491g = i7;
                        C104567qb qbVar = qdVar.f341485a;
                        if (qbVar != null) {
                            qbVar.post(new Runnable() {
                                public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.qd.1.run():void, dex: classes9.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.qd.1.run():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/
                            });
                        }
                        ViewGroup viewGroup3 = qdVar.f341486b;
                        if (viewGroup3 != null) {
                            qdVar.f341492h = viewGroup3.getMeasuredHeight();
                        }
                        C114322sx sxVar = qdVar.f341490f;
                        if (!(sxVar == null || (m = sxVar.f339878e_) == null || ((VectorMap) m).f342909o.f340912t == null || ((VectorMap) m).f342909o.f340912t.f342798q == null)) {
                            qdVar.f341492h = (((int) ((VectorMap) m).f342909o.f340912t.f342798q.f340216b) - i7) * 2;
                            qdVar.mo172696f();
                        }
                    }
                    this.f341773ai = (this.f341757Q - layoutParams.bottomMargin) - i3;
                    this.f341772ah = (this.f341779d - layoutParams.rightMargin) - i2;
                    break;
                case 4:
                    layoutParams.gravity = 51;
                    int[] iArr3 = this.f341752L;
                    int i8 = iArr3[C113701eo.C113702a.TOP.f340162e];
                    layoutParams.topMargin = i8;
                    int i9 = iArr3[C113701eo.C113702a.LEFT.f340162e];
                    layoutParams.leftMargin = i9;
                    this.f341773ai = i8;
                    this.f341772ah = i9;
                    break;
                case 5:
                    layoutParams.gravity = 49;
                    int i15 = this.f341752L[C113701eo.C113702a.TOP.f340162e];
                    layoutParams.topMargin = i15;
                    this.f341773ai = i15;
                    this.f341772ah = (this.f341779d - i2) / 2;
                    break;
                case 6:
                    layoutParams.gravity = 53;
                    int[] iArr4 = this.f341752L;
                    int i16 = iArr4[C113701eo.C113702a.TOP.f340162e];
                    layoutParams.topMargin = i16;
                    int i17 = iArr4[C113701eo.C113702a.RIGHT.f340162e];
                    layoutParams.rightMargin = i17;
                    this.f341773ai = i16;
                    this.f341772ah = (this.f341779d - i17) - i2;
                    break;
                default:
                    C113889km.m157549c("Unknown position:" + this.f341747G);
                    break;
            }
        }
        if (viewGroup2.indexOfChild(this.f341769ac) < 0) {
            viewGroup2.addView(this.f341769ac, layoutParams);
        } else {
            viewGroup2.updateViewLayout(this.f341769ac, layoutParams);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = this.f341789o;
        if (linearLayout != null) {
            int measuredWidth = linearLayout.getMeasuredWidth();
            int measuredHeight = this.f341789o.getMeasuredHeight();
            switch (C1141706.f341806a[this.f341748H.ordinal()]) {
                case 1:
                    layoutParams2.gravity = 83;
                    int[] iArr5 = this.f341753M;
                    int i18 = iArr5[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams2.bottomMargin = i18;
                    int i19 = iArr5[C113701eo.C113702a.LEFT.f340162e];
                    layoutParams2.leftMargin = i19;
                    this.f341794t = (this.f341757Q - i18) - measuredHeight;
                    this.f341793s = i19;
                    break;
                case 2:
                    layoutParams2.gravity = 81;
                    int i25 = this.f341753M[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams2.bottomMargin = i25;
                    this.f341794t = (this.f341757Q - i25) - measuredHeight;
                    this.f341793s = (this.f341779d - measuredWidth) / 2;
                    break;
                case 3:
                    layoutParams2.gravity = 85;
                    int[] iArr6 = this.f341753M;
                    int i26 = iArr6[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams2.bottomMargin = i26;
                    int i27 = iArr6[C113701eo.C113702a.RIGHT.f340162e];
                    layoutParams2.rightMargin = i27;
                    this.f341794t = (this.f341757Q - i26) - measuredHeight;
                    this.f341793s = (this.f341779d - i27) - measuredWidth;
                    break;
                case 4:
                    layoutParams2.gravity = 51;
                    int[] iArr7 = this.f341753M;
                    int i28 = iArr7[C113701eo.C113702a.TOP.f340162e];
                    layoutParams2.topMargin = i28;
                    int i29 = iArr7[C113701eo.C113702a.LEFT.f340162e];
                    layoutParams2.leftMargin = i29;
                    this.f341794t = i28;
                    this.f341793s = i29;
                    break;
                case 5:
                    layoutParams2.gravity = 49;
                    int i35 = this.f341753M[C113701eo.C113702a.TOP.f340162e];
                    layoutParams2.topMargin = i35;
                    this.f341794t = i35;
                    this.f341793s = (this.f341779d - measuredWidth) / 2;
                    break;
                case 6:
                    layoutParams2.gravity = 53;
                    int[] iArr8 = this.f341753M;
                    int i36 = iArr8[C113701eo.C113702a.TOP.f340162e];
                    layoutParams2.topMargin = i36;
                    int i37 = iArr8[C113701eo.C113702a.RIGHT.f340162e];
                    layoutParams2.rightMargin = i37;
                    this.f341794t = i36;
                    this.f341793s = (this.f341779d - i37) - measuredWidth;
                    break;
                default:
                    C113889km.m157549c("Unknown positionScale:" + this.f341748H);
                    break;
            }
        }
        if (viewGroup2.indexOfChild(this.f341789o) < 0) {
            viewGroup2.addView(this.f341789o, layoutParams2);
        } else {
            viewGroup2.updateViewLayout(this.f341789o, layoutParams2);
        }
        C104571e eVar = this.f341768aa;
        if (eVar != null) {
            this.f341789o.updateViewLayout(eVar, eVar.getLayoutParams());
            mo172798e();
        }
        this.f341767a.setVisibility(this.f341777b ? 0 : 4);
        if (this.f341792r != null) {
            this.f341769ac.requestLayout();
            this.f341789o.requestLayout();
            for (C114173c next : this.f341792r) {
                if (this.f341799y == null || this.f341741A || this.f341800z != this.f341777b || (rect = this.f341799y).left != (i = this.f341772ah) || rect.top != this.f341773ai || rect.right != i + this.f341769ac.getMeasuredWidth() || this.f341799y.bottom != this.f341773ai + this.f341769ac.getMeasuredHeight()) {
                    this.f341800z = this.f341777b;
                    int i38 = this.f341772ah;
                    Rect rect2 = new Rect(i38, this.f341773ai, this.f341769ac.getMeasuredWidth() + i38, this.f341773ai + this.f341769ac.getMeasuredHeight());
                    this.f341799y = rect2;
                    next.mo171683a(this.f341769ac, rect2, this.f341777b);
                }
                next.mo171687b(this.f341789o, new Rect(this.f341793s, this.f341794t, 0, 0), this.f341787m);
            }
        }
        this.f341741A = !z && this.f341741A;
        viewGroup.requestLayout();
        return true;
    }

    /* renamed from: com.tencent.mapsdk.internal.rp$e */
    public class C104571e extends View {

        /* renamed from: b */
        private static final int f309977b = -16777216;

        /* renamed from: c */
        private static final int f309978c = -7368817;

        /* renamed from: d */
        private static final int f309979d = 35;

        /* renamed from: e */
        private Paint f309981e;

        /* renamed from: f */
        private Paint f309982f;

        /* renamed from: g */
        private Paint f309983g;

        /* renamed from: h */
        private int f309984h = f309977b;

        public C104571e(Context context) {
            super(context);
            Paint paint = new Paint();
            this.f309981e = paint;
            paint.setAntiAlias(true);
            this.f309981e.setStrokeWidth(C114165rp.this.f341784j * 1.0f);
            this.f309981e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f309982f = paint2;
            paint2.setTextSize(C114165rp.this.f341784j * 12.0f);
            this.f309982f.setAntiAlias(true);
            Paint paint3 = new Paint(65);
            this.f309983g = paint3;
            paint3.setStyle(Paint.Style.FILL);
            this.f309983g.setColor(0);
        }

        /* renamed from: a */
        private void m140082a(Canvas canvas, int i) {
            int f = (int) (C114165rp.this.f341784j * 6.0f);
            int f2 = (i / 2) + ((int) (C114165rp.this.f341784j * 7.0f));
            float measureText = this.f309982f.measureText(C114165rp.this.f341782h);
            canvas.drawPaint(this.f309983g);
            float f3 = (float) f;
            float f4 = (float) f2;
            canvas.drawText(C114165rp.this.f341782h, ((((float) C114165rp.this.f341783i) / 2.0f) + f3) - (measureText / 2.0f), f4 - (C114165rp.this.f341784j * 6.0f), this.f309982f);
            Canvas canvas2 = canvas;
            float f5 = f3;
            canvas2.drawLine(f5, f4, (float) (C114165rp.this.f341783i + f), f4, this.f309981e);
            canvas2.drawLine(f5, f4 - (C114165rp.this.f341784j * 3.0f), f3, f4 + (C114165rp.this.f341784j * 0.5f), this.f309981e);
            canvas2.drawLine((float) (C114165rp.this.f341783i + f), f4 - (C114165rp.this.f341784j * 3.0f), (float) (f + C114165rp.this.f341783i), f4 + (C114165rp.this.f341784j * 0.5f), this.f309981e);
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            this.f309981e.setColor(this.f309984h);
            this.f309982f.setColor(this.f309984h);
            int height = getHeight();
            int f = (int) (C114165rp.this.f341784j * 6.0f);
            int f2 = (height / 2) + ((int) (C114165rp.this.f341784j * 7.0f));
            float measureText = this.f309982f.measureText(C114165rp.this.f341782h);
            canvas.drawPaint(this.f309983g);
            float f3 = (float) f;
            float f4 = (float) f2;
            canvas.drawText(C114165rp.this.f341782h, ((((float) C114165rp.this.f341783i) / 2.0f) + f3) - (measureText / 2.0f), f4 - (C114165rp.this.f341784j * 6.0f), this.f309982f);
            Canvas canvas2 = canvas;
            float f5 = f3;
            canvas2.drawLine(f5, f4, (float) (C114165rp.this.f341783i + f), f4, this.f309981e);
            canvas2.drawLine(f5, f4 - (C114165rp.this.f341784j * 3.0f), f3, f4 + (C114165rp.this.f341784j * 0.5f), this.f309981e);
            canvas2.drawLine((float) (C114165rp.this.f341783i + f), f4 - (C114165rp.this.f341784j * 3.0f), (float) (f + C114165rp.this.f341783i), f4 + (C114165rp.this.f341784j * 0.5f), this.f309981e);
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            setMeasuredDimension(Math.min(Math.round(((float) C114165rp.this.f341783i) + (C114165rp.this.f341784j * 12.0f)), C114165rp.this.f341779d / 2), Math.round(((float) C114165rp.this.f341766Z) * C114165rp.this.f341784j));
        }

        /* renamed from: a */
        private void m140084a(boolean z) {
            int i = z ? f309978c : f309977b;
            if (i != this.f309984h) {
                this.f309984h = i;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m140083a(C104571e eVar, boolean z) {
            int i = z ? f309978c : f309977b;
            if (i != eVar.f309984h) {
                eVar.f309984h = i;
            }
        }
    }

    /* renamed from: b */
    public final void mo172797b(C113701eo.C113703b bVar) {
        if (this.f341748H != bVar) {
            mo172799f();
        }
        this.f341748H = bVar;
    }

    /* renamed from: e */
    private void m159437e(boolean z) {
        this.f341788n = !z;
        mo172798e();
    }

    /* renamed from: c */
    public final void mo172000c() {
        for (Map.Entry<String, Bitmap> value : this.f341763W.entrySet()) {
            C113886kg.m157517a((Bitmap) value.getValue());
        }
        C113886kg.m157517a(this.f341745E);
        C113886kg.m157517a(this.f341746F);
    }

    /* renamed from: d */
    private int[] m159435d(int i, int i2) {
        int[] iArr = new int[2];
        float f = this.f341791q;
        if (f == Float.MIN_VALUE) {
            int i3 = this.f341780e;
            f = i3 != -3 ? i3 != -2 ? i3 != -1 ? i3 != 1 ? 1.0f : 1.2f : 0.8333333f : 0.8f : f341738ae;
        }
        iArr[0] = (int) (((float) i) * f);
        iArr[1] = (int) (((float) i2) * f);
        return iArr;
    }

    /* renamed from: b */
    public final View[] mo171997b() {
        return new View[]{this.f341769ac, this.f341789o};
    }

    /* renamed from: b */
    private int m159421b(C113701eo.C113702a aVar) {
        return this.f341750J[aVar.f340162e];
    }

    /* renamed from: b */
    private void m159426b(boolean z) {
        this.f341777b = z;
        ImageView imageView = this.f341767a;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 4);
        }
    }

    /* renamed from: c */
    private int m159427c(C113701eo.C113702a aVar) {
        return this.f341752L[aVar.f340162e];
    }

    /* renamed from: c */
    private void m159431c(boolean z) {
        if (this.f341787m != z) {
            this.f341787m = z;
            List<C114173c> list = this.f341792r;
            if (list != null) {
                for (C114173c b : list) {
                    b.mo171687b(this.f341789o, new Rect(this.f341793s, this.f341794t, 0, 0), this.f341787m);
                }
            }
        }
        mo172798e();
    }

    /* renamed from: b */
    public final void mo172796b(C113701eo.C113702a aVar, int i) {
        if (this.f341776al) {
            this.f341776al = false;
        }
        this.f341751K[aVar.f340162e] = i;
        mo172802i();
    }

    /* renamed from: b */
    private void m159425b(float f) {
        if (f > f341739af) {
            f = f341739af;
        }
        if (f < f341738ae) {
            f = f341738ae;
        }
        this.f341780e = 0;
        this.f341791q = f;
        mo172801h();
    }

    /* renamed from: c */
    private void m159430c(int i, int i2) {
        String str;
        float[] fArr = f341740f;
        int length = fArr.length;
        int i3 = this.f341785k - this.f341790p;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 >= length) {
            i3 = length - 1;
        }
        float f = fArr[i3];
        if (this.f341781g != f) {
            this.f341781g = f;
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    C114165rp.this.f341775ak.mo171577b(C114165rp.this.f341781g);
                }
            });
        }
        float f2 = (float) i;
        double d = this.f341786l;
        if (d != 0.0d) {
            f2 = (float) (((double) f) / d);
        }
        int round = Math.round(f2);
        this.f341783i = round;
        if (round > i2) {
            this.f341783i = i2;
        } else if (round < i) {
            this.f341783i = i;
        }
        if (f >= 1000.0f) {
            f /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f341782h = ((int) f) + str;
    }

    /* renamed from: a */
    public final void mo172795a(final boolean z) {
        C113865kb.m157399a((Runnable) new Runnable() {
            public final void run() {
                if (C114165rp.this.f341768aa != null) {
                    C104571e.m140083a(C114165rp.this.f341768aa, z);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo172793a(C113740fv fvVar, boolean z) {
        C114183rt next;
        if (this.f341745E == null || fvVar.mo172110a(this.f341742B) || this.f341743C != z) {
            this.f341742B = fvVar.clone();
            this.f341743C = z;
            int i = (int) fvVar.f340304c;
            if (i > 18) {
                i = 18;
            }
            Iterator<C114183rt> it = this.f341762V.iterator();
            C114183rt rtVar = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
                if (i >= next.f341850a && i <= next.f341851b) {
                    Object[] a = next.mo172825a(fvVar, z);
                    if (a != null) {
                        String str = (String) a[0];
                        String str2 = (String) a[1];
                        Bitmap bitmap = (Bitmap) a[2];
                        if (bitmap != null) {
                            m159414a(bitmap);
                            this.f341765Y = str;
                            break;
                        } else if (!C40002he.m42806a(str, this.f341765Y)) {
                            C113889km.m157550c(C0949kl.f2252v, "Logo[" + str + "] changed! old=" + this.f341765Y + "|dark=" + z + "|level=" + i);
                            Bitmap bitmap2 = this.f341763W.get(str);
                            if (bitmap2 != null) {
                                if (!bitmap2.isRecycled()) {
                                    m159414a(bitmap2);
                                    this.f341765Y = str;
                                    C113889km.m157550c(C0949kl.f2252v, "Logo[" + str + "] set from mem cache");
                                    return;
                                }
                                this.f341763W.remove(str);
                            }
                            Bitmap c = m159428c(str);
                            if (c != null) {
                                this.f341765Y = str;
                                this.f341763W.put(str, c);
                                m159414a(c);
                                C113889km.m157550c(C0949kl.f2252v, "Logo[" + str + "] set from file cache");
                                return;
                            }
                            this.f341765Y = null;
                            m159420a(str2, str);
                        }
                    }
                    rtVar = next;
                }
            }
            rtVar = next;
            if (rtVar == null) {
                Bitmap bitmap3 = this.f341798x;
                if (bitmap3 == null || bitmap3.isRecycled()) {
                    this.f341798x = C104548ha.m139952b(this.f341744D, "default_tencent_map_logo.png");
                }
                Bitmap bitmap4 = this.f341798x;
                if (bitmap4 != null) {
                    m159414a(bitmap4);
                }
            }
        }
    }

    /* renamed from: a */
    private void m159420a(String str, String str2) {
        if (this.f341764X.contains(str2)) {
            C113889km.m157550c(C0949kl.f2252v, "Logo[" + str2 + "] is downloading.");
            return;
        }
        this.f341764X.add(str2);
        C113889km.m157550c(C0949kl.f2252v, "Logo[" + str2 + "] start download..");
        C113865kb.m157396a(new C114171a(this, str, str2)).mo172280a(null, new C114172b(this, str2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m159410a(String str) {
        String o = m159448o();
        C113886kg.m157518a(o);
        return o + "/" + str;
    }

    /* renamed from: a */
    public final void mo172794a(List<C114193ry> list) {
        if (list != null && !list.isEmpty()) {
            this.f341762V.clear();
            for (int i = 0; i < list.size(); i++) {
                C114193ry ryVar = list.get(i);
                int[] iArr = ryVar.f341891a;
                this.f341762V.add(new C114183rt(iArr[0], iArr[1], ryVar.f341892b));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m159414a(Bitmap bitmap) {
        try {
            this.f341745E = bitmap;
            if (bitmap != null) {
                this.f341758R = bitmap.getWidth();
                this.f341759S = this.f341745E.getHeight();
                this.f341741A = true;
            }
            mo172801h();
            mo172802i();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo171998a(C113701eo.C113703b bVar) {
        if (this.f341747G != bVar) {
            mo172799f();
        }
        this.f341747G = bVar;
    }

    /* renamed from: a */
    private void m159416a(C114097qd qdVar) {
        this.f341795u = qdVar;
    }

    /* renamed from: a */
    private FrameLayout.LayoutParams m159406a(int i, int i2) {
        C114097qd qdVar;
        M m;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (!(i == 0 || i2 == 0)) {
            switch (C1141706.f341806a[this.f341747G.ordinal()]) {
                case 1:
                    layoutParams.gravity = 83;
                    int[] iArr = this.f341752L;
                    int i3 = iArr[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams.bottomMargin = i3;
                    int i4 = iArr[C113701eo.C113702a.LEFT.f340162e];
                    layoutParams.leftMargin = i4;
                    this.f341773ai = (this.f341757Q - i3) - i2;
                    this.f341772ah = i4;
                    break;
                case 2:
                    layoutParams.gravity = 81;
                    int i5 = this.f341752L[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams.bottomMargin = i5;
                    this.f341773ai = (this.f341757Q - i5) - i2;
                    this.f341772ah = (this.f341779d - i) / 2;
                    break;
                case 3:
                    layoutParams.gravity = 85;
                    int[] iArr2 = this.f341752L;
                    layoutParams.bottomMargin = iArr2[C113701eo.C113702a.BOTTOM.f340162e];
                    layoutParams.rightMargin = iArr2[C113701eo.C113702a.RIGHT.f340162e];
                    if (C114207sl.f341931c.equals("wechat") && (qdVar = this.f341795u) != null) {
                        int i6 = layoutParams.bottomMargin + (i2 * 2);
                        qdVar.f341491g = i6;
                        C104567qb qbVar = qdVar.f341485a;
                        if (qbVar != null) {
                            qbVar.post(new Runnable() {
                                /*  JADX ERROR: Method generation error
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.qd.1.run():void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    */
                                /*  JADX ERROR: Method generation error: Method args not loaded: com.tencent.mapsdk.internal.qd.1.run():void, class status: UNLOADED
                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.qd.1.run():void, class status: UNLOADED
                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                    */
                                public final void run(
/*
Method generation error in method: com.tencent.mapsdk.internal.qd.1.run():void, dex: classes9.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.tencent.mapsdk.internal.qd.1.run():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                
*/
                            });
                        }
                        ViewGroup viewGroup = qdVar.f341486b;
                        if (viewGroup != null) {
                            qdVar.f341492h = viewGroup.getMeasuredHeight();
                        }
                        C114322sx sxVar = qdVar.f341490f;
                        if (!(sxVar == null || (m = sxVar.f339878e_) == null || ((VectorMap) m).f342909o.f340912t == null || ((VectorMap) m).f342909o.f340912t.f342798q == null)) {
                            qdVar.f341492h = (((int) ((VectorMap) m).f342909o.f340912t.f342798q.f340216b) - i6) * 2;
                            qdVar.mo172696f();
                        }
                    }
                    this.f341773ai = (this.f341757Q - layoutParams.bottomMargin) - i2;
                    this.f341772ah = (this.f341779d - layoutParams.rightMargin) - i;
                    break;
                case 4:
                    layoutParams.gravity = 51;
                    int[] iArr3 = this.f341752L;
                    int i7 = iArr3[C113701eo.C113702a.TOP.f340162e];
                    layoutParams.topMargin = i7;
                    int i8 = iArr3[C113701eo.C113702a.LEFT.f340162e];
                    layoutParams.leftMargin = i8;
                    this.f341773ai = i7;
                    this.f341772ah = i8;
                    break;
                case 5:
                    layoutParams.gravity = 49;
                    int i9 = this.f341752L[C113701eo.C113702a.TOP.f340162e];
                    layoutParams.topMargin = i9;
                    this.f341773ai = i9;
                    this.f341772ah = (this.f341779d - i) / 2;
                    break;
                case 6:
                    layoutParams.gravity = 53;
                    int[] iArr4 = this.f341752L;
                    int i15 = iArr4[C113701eo.C113702a.TOP.f340162e];
                    layoutParams.topMargin = i15;
                    int i16 = iArr4[C113701eo.C113702a.RIGHT.f340162e];
                    layoutParams.rightMargin = i16;
                    this.f341773ai = i15;
                    this.f341772ah = (this.f341779d - i16) - i;
                    break;
                default:
                    C113889km.m157549c("Unknown position:" + this.f341747G);
                    break;
            }
        }
        return layoutParams;
    }

    /* renamed from: a */
    public final Rect mo171996a() {
        Rect rect = new Rect();
        LinearLayout linearLayout = this.f341769ac;
        if (linearLayout != null) {
            rect.left = linearLayout.getLeft();
            rect.bottom = this.f341769ac.getBottom();
            rect.right = this.f341769ac.getRight();
            rect.top = this.f341769ac.getTop();
        }
        return rect;
    }

    /* renamed from: a */
    private void m159415a(C113701eo.C113702a aVar, float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.f341778c[aVar.f340162e] = f;
        mo172801h();
    }

    /* renamed from: a */
    private float m159405a(C113701eo.C113702a aVar) {
        return this.f341778c[aVar.f340162e];
    }

    /* renamed from: a */
    public final void mo172792a(C113701eo.C113702a aVar, int i) {
        this.f341750J[aVar.f340162e] = i;
    }

    /* renamed from: a */
    private void m159413a(int i, double d) {
        String str;
        this.f341785k = i;
        this.f341786l = d;
        int width = this.f341767a.getWidth();
        if (width <= 0) {
            width = 1000;
        }
        int ceil = (int) Math.ceil((double) (((float) width) / 4.0f));
        int ceil2 = (int) (Math.ceil((double) ((((float) this.f341779d) * 3.0f) / 8.0f)) - ((double) (this.f341784j * 6.0f)));
        float[] fArr = f341740f;
        int length = fArr.length;
        int i2 = this.f341785k - this.f341790p;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 >= length) {
            i2 = length - 1;
        }
        float f = fArr[i2];
        if (this.f341781g != f) {
            this.f341781g = f;
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    C114165rp.this.f341775ak.mo171577b(C114165rp.this.f341781g);
                }
            });
        }
        float f2 = (float) ceil;
        double d2 = this.f341786l;
        if (d2 != 0.0d) {
            f2 = (float) (((double) f) / d2);
        }
        int round = Math.round(f2);
        this.f341783i = round;
        if (round > ceil2) {
            this.f341783i = ceil2;
        } else if (round < ceil) {
            this.f341783i = ceil;
        }
        if (f >= 1000.0f) {
            f /= 1000.0f;
            str = "公里";
        } else {
            str = "米";
        }
        this.f341782h = ((int) f) + str;
        mo172799f();
    }

    /* renamed from: a */
    private void m159411a(float f) {
        if (this.f341781g != f) {
            this.f341781g = f;
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    C114165rp.this.f341775ak.mo171577b(C114165rp.this.f341781g);
                }
            });
        }
    }

    @Deprecated
    /* renamed from: a */
    private void m159412a(int i) {
        this.f341780e = i;
        this.f341791q = Float.MIN_VALUE;
        mo172801h();
    }

    /* renamed from: a */
    private void m159417a(C114173c cVar) {
        List<C114173c> list = this.f341792r;
        if (list != null && cVar != null) {
            list.add(cVar);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m159409a(C114165rp rpVar, String str) {
        return rpVar.m159410a(str) + ".tmp";
    }
}
