package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ZoomControls;
import com.tencent.mapsdk.internal.C113558bl;
import com.tencent.mapsdk.internal.C113701eo;
import com.tencent.mapsdk.vector.VectorMap;

/* renamed from: com.tencent.mapsdk.internal.rr */
public final class C114175rr extends C113699em {

    /* renamed from: a */
    public Context f341813a;

    /* renamed from: b */
    public ZoomControls f341814b;

    /* renamed from: c */
    public C92456rq f341815c = null;

    /* renamed from: d */
    public C113558bl.C113562a f341816d = null;

    /* renamed from: e */
    public C114322sx f341817e;

    /* renamed from: f */
    public boolean f341818f;

    /* renamed from: g */
    public boolean f341819g;

    /* renamed from: h */
    public Bitmap f341820h;

    /* renamed from: i */
    public Bitmap f341821i;

    /* renamed from: j */
    public Bitmap f341822j;

    /* renamed from: k */
    public Bitmap f341823k;

    /* renamed from: l */
    private C113701eo.C113703b f341824l = C113701eo.C113703b.RIGHT_BOTTOM;

    /* renamed from: m */
    private int f341825m = 0;

    /* renamed from: n */
    private LinearLayout f341826n;

    /* renamed from: o */
    private ViewGroup f341827o;

    /* renamed from: com.tencent.mapsdk.internal.rr$5 */
    public static /* synthetic */ class C1141805 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f341834a;

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
                f341834a = r0
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.LEFT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f341834a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.CENTER_BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f341834a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.RIGHT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f341834a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.LEFT_TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f341834a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.CENTER_TOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f341834a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tencent.mapsdk.internal.eo$b r1 = com.tencent.mapsdk.internal.C113701eo.C113703b.RIGHT_TOP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114175rr.C1141805.<clinit>():void");
        }
    }

    public C114175rr(Context context, C114322sx sxVar) {
        this.f341813a = context;
        this.f341817e = sxVar;
    }

    /* renamed from: e */
    private void m159495e() {
        if (this.f341826n != null && this.f341814b != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (this.f341826n.indexOfChild(this.f341814b) < 0) {
                this.f341826n.addView(this.f341814b, layoutParams);
            } else {
                this.f341826n.updateViewLayout(this.f341814b, layoutParams);
            }
        }
    }

    /* renamed from: f */
    private void m159496f() {
        C114322sx sxVar;
        if (this.f341826n != null && this.f341815c != null && (sxVar = this.f341817e) != null && sxVar.f339878e_ != null) {
            m159489a(((C113961mq) sxVar.f339876d_).mo171803l());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (this.f341826n.indexOfChild(this.f341815c) < 0) {
                ZoomControls zoomControls = this.f341814b;
                if (zoomControls == null || this.f341826n.indexOfChild(zoomControls) < 0) {
                    this.f341826n.addView(this.f341815c, layoutParams);
                    return;
                }
                this.f341826n.removeViewInLayout(this.f341814b);
                this.f341826n.addView(this.f341815c, layoutParams);
                this.f341826n.addView(this.f341814b, layoutParams);
                return;
            }
            this.f341826n.updateViewLayout(this.f341815c, layoutParams);
        }
    }

    /* renamed from: g */
    private boolean m159497g() {
        ZoomControls zoomControls = this.f341814b;
        return zoomControls != null && zoomControls.getVisibility() == 0;
    }

    /* renamed from: h */
    private FrameLayout.LayoutParams m159498h() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = C40003jy.m42819a(this.f341813a, 5);
        switch (C1141805.f341834a[this.f341824l.ordinal()]) {
            case 1:
                layoutParams.gravity = 83;
                layoutParams.bottomMargin = a * 2;
                layoutParams.leftMargin = a;
                break;
            case 2:
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = a;
                break;
            case 3:
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = a * 6;
                layoutParams.rightMargin = a;
                break;
            case 4:
                layoutParams.gravity = 51;
                layoutParams.topMargin = a;
                layoutParams.leftMargin = a;
                break;
            case 5:
                layoutParams.gravity = 49;
                layoutParams.topMargin = a;
                break;
            case 6:
                layoutParams.gravity = 53;
                layoutParams.topMargin = a;
                layoutParams.rightMargin = a;
                break;
            default:
                C113889km.m157549c("Unknown position:" + this.f341824l);
                break;
        }
        return layoutParams;
    }

    /* renamed from: b */
    public final void mo171655b(int i, int i2) {
    }

    /* renamed from: d */
    public final C113701eo.C113703b mo172001d() {
        return this.f341824l;
    }

    /* renamed from: a */
    public final boolean mo171999a(ViewGroup viewGroup, Bundle bundle) {
        if (viewGroup == null) {
            return false;
        }
        this.f341827o = viewGroup;
        LinearLayout linearLayout = this.f341826n;
        if (linearLayout == null || linearLayout.getParent() != viewGroup) {
            LinearLayout linearLayout2 = new LinearLayout(this.f341813a);
            this.f341826n = linearLayout2;
            linearLayout2.setOrientation(1);
            viewGroup.addView(this.f341826n);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a = C40003jy.m42819a(this.f341813a, 5);
        switch (C1141805.f341834a[this.f341824l.ordinal()]) {
            case 1:
                layoutParams.gravity = 83;
                layoutParams.bottomMargin = a * 2;
                layoutParams.leftMargin = a;
                break;
            case 2:
                layoutParams.gravity = 81;
                layoutParams.bottomMargin = a;
                break;
            case 3:
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = a * 6;
                layoutParams.rightMargin = a;
                break;
            case 4:
                layoutParams.gravity = 51;
                layoutParams.topMargin = a;
                layoutParams.leftMargin = a;
                break;
            case 5:
                layoutParams.gravity = 49;
                layoutParams.topMargin = a;
                break;
            case 6:
                layoutParams.gravity = 53;
                layoutParams.topMargin = a;
                layoutParams.rightMargin = a;
                break;
            default:
                C113889km.m157549c("Unknown position:" + this.f341824l);
                break;
        }
        this.f341826n.setGravity(layoutParams.gravity);
        this.f341826n.setLayoutParams(layoutParams);
        if (!this.f341819g || this.f341814b != null) {
            m159495e();
        } else {
            mo172815a(this.f341813a);
        }
        if (!this.f341818f || this.f341815c != null) {
            m159496f();
        } else {
            mo172816b(this.f341813a);
        }
        int i = -1;
        if (bundle != null) {
            i = bundle.getInt(C113558bl.f339834a, -1);
        }
        m159489a(C114367v.m160528b(i));
        this.f341826n.requestLayout();
        return true;
    }

    /* renamed from: b */
    public final void mo172816b(Context context) {
        this.f341815c = new C92456rq(context);
        Bitmap b = C104548ha.m139953b(C104548ha.m139952b(this.f341813a, "location_enable.png"));
        this.f341815c.setScaleType(ImageView.ScaleType.CENTER);
        this.f341815c.setImageBitmap(b);
        this.f341815c.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C113558bl.C113562a aVar = C114175rr.this.f341816d;
                if (aVar != null) {
                    aVar.mo171699a();
                }
            }
        });
        m159496f();
    }

    /* renamed from: c */
    public final void mo172000c() {
        C92456rq rqVar = this.f341815c;
        if (rqVar != null) {
            rqVar.setClickable(false);
            Drawable background = rqVar.getBackground();
            if (background != null) {
                background.setCallback((Drawable.Callback) null);
            }
            rqVar.setBackgroundDrawable((Drawable) null);
        }
    }

    /* renamed from: c */
    private void m159494c(boolean z) {
        this.f341818f = z;
        if (z && this.f341815c == null) {
            mo172816b(this.f341813a);
        }
        C92456rq rqVar = this.f341815c;
        if (rqVar != null) {
            rqVar.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: b */
    private void m159492b(boolean z) {
        this.f341819g = z;
        if (z && this.f341814b == null) {
            mo172815a(this.f341813a);
        }
        ZoomControls zoomControls = this.f341814b;
        if (zoomControls != null) {
            zoomControls.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: b */
    public final View[] mo171997b() {
        return new View[]{this.f341814b, this.f341815c};
    }

    /* renamed from: a */
    public final void mo171998a(C113701eo.C113703b bVar) {
        if (this.f341824l != bVar) {
            this.f341824l = bVar;
            mo171999a(this.f341827o, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo172815a(Context context) {
        try {
            ZoomControls zoomControls = new ZoomControls(context);
            this.f341814b = zoomControls;
            zoomControls.setId(View.generateViewId());
            this.f341814b.setOnZoomInClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ((VectorMap) C114175rr.this.f341817e.f339878e_).f342909o.f340901i.mo171219a((Runnable) null);
                }
            });
            this.f341814b.setOnZoomOutClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ((VectorMap) C114175rr.this.f341817e.f339878e_).f342909o.f340901i.mo171235b((Runnable) null);
                }
            });
            m159495e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m159489a(boolean z) {
        if (this.f341815c != null) {
            if (z) {
                Bitmap bitmap = this.f341822j;
                if (bitmap == null || bitmap.isRecycled()) {
                    this.f341822j = C104548ha.m139953b(C104548ha.m139952b(this.f341813a, "location_state_dark_normal.png"));
                }
                Bitmap bitmap2 = this.f341823k;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    this.f341823k = C104548ha.m139953b(C104548ha.m139952b(this.f341813a, "location_state_dark_selected.png"));
                }
            } else {
                Bitmap bitmap3 = this.f341820h;
                if (bitmap3 == null || bitmap3.isRecycled()) {
                    this.f341820h = C104548ha.m139953b(C104548ha.m139952b(this.f341813a, "location_state_normal.png"));
                }
                Bitmap bitmap4 = this.f341821i;
                if (bitmap4 == null || bitmap4.isRecycled()) {
                    this.f341821i = C104548ha.m139953b(C104548ha.m139952b(this.f341813a, "location_state_selected.png"));
                }
            }
            this.f341815c.mo126461a(this.f341813a, z ? this.f341822j : this.f341820h, z ? this.f341823k : this.f341821i);
            this.f341815c.setVisibility(this.f341818f ? 0 : 8);
        }
    }

    /* renamed from: a */
    private void m159488a(C113558bl.C113562a aVar) {
        this.f341816d = aVar;
    }

    /* renamed from: a */
    private void m159490a(final boolean z, final boolean z2) {
        if (this.f341814b != null) {
            C113865kb.m157399a((Runnable) new Runnable() {
                public final void run() {
                    C114175rr.this.f341814b.setIsZoomInEnabled(z);
                    C114175rr.this.f341814b.setIsZoomOutEnabled(z2);
                }
            });
        }
    }

    /* renamed from: a */
    public final Rect mo171996a() {
        Rect rect = new Rect();
        ZoomControls zoomControls = this.f341814b;
        if (!(zoomControls == null || this.f341815c == null)) {
            rect.bottom = Math.min(zoomControls.getBottom(), this.f341815c.getBottom());
            rect.right = Math.max(this.f341814b.getRight(), this.f341815c.getRight());
            rect.left = Math.min(this.f341814b.getLeft(), this.f341815c.getLeft());
            rect.top = Math.min(this.f341814b.getTop(), this.f341815c.getTop());
        }
        return rect;
    }
}
