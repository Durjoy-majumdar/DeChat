package com.tencent.p014mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView;
import com.tencent.p014mm.plugin.appbrand.page.C83896q4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.HashMap;
import js0.C88020k;
import org.json.JSONException;
import org.json.JSONObject;
import sn0.C90267g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer */
public class CoverViewContainer extends AppBrandNativeContainerView implements C90267g, C83896q4 {

    /* renamed from: C */
    public static HashMap<Integer, CoverViewContainer> f241363C = new HashMap<>();

    /* renamed from: A */
    public float[] f241364A = new float[8];

    /* renamed from: B */
    public C82351a f241365B;

    /* renamed from: e */
    public float f241366e;

    /* renamed from: f */
    public float[] f241367f;

    /* renamed from: g */
    public float f241368g;

    /* renamed from: h */
    public int f241369h;

    /* renamed from: i */
    public int f241370i;

    /* renamed from: j */
    public Paint f241371j = new Paint();

    /* renamed from: n */
    public View f241372n;

    /* renamed from: o */
    public boolean f241373o = false;

    /* renamed from: p */
    public String f241374p = "";

    /* renamed from: q */
    public int f241375q;

    /* renamed from: r */
    public int f241376r;

    /* renamed from: s */
    public boolean f241377s = false;

    /* renamed from: t */
    public float f241378t;

    /* renamed from: u */
    public float f241379u;

    /* renamed from: v */
    public long f241380v;

    /* renamed from: w */
    public View.OnClickListener f241381w;

    /* renamed from: x */
    public int f241382x = 0;

    /* renamed from: y */
    public int f241383y = 0;

    /* renamed from: z */
    public GradientDrawable f241384z = new GradientDrawable();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer$a */
    public interface C82351a {
        /* renamed from: a */
        void mo114754a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2);
    }

    public CoverViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo114739e();
    }

    /* renamed from: a */
    public static RectF m101092a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF((float) i, (float) iArr[1], (float) (i + view.getWidth()), (float) (iArr[1] + view.getHeight()));
    }

    private Drawable getShadowDrawable() {
        int i;
        int i2 = this.f241370i;
        if (i2 != 0) {
            this.f241384z.setColor(i2);
        }
        float[] fArr = this.f241364A;
        float[] fArr2 = this.f241367f;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[0];
        float f = fArr2[1];
        fArr[2] = f;
        fArr[3] = f;
        float f2 = fArr2[3];
        fArr[4] = f2;
        fArr[5] = f2;
        float f3 = fArr2[2];
        fArr[6] = f3;
        fArr[7] = f3;
        this.f241384z.setCornerRadii(fArr);
        float f4 = this.f241368g;
        if (f4 > 0.0f && (i = this.f241369h) != 0) {
            this.f241384z.setStroke((int) f4, i);
        }
        return this.f241384z;
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        if (!(getWidth() == 0 || getHeight() == 0)) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            draw(canvas);
            canvas.restore();
        }
        return true;
    }

    public void addView(View view, int i) {
        if (i < 0) {
            i = 0;
        } else if (i > getChildCount() - 1) {
            i = getChildCount() - 1;
        }
        super.addView(view, i + 1);
    }

    /* renamed from: d */
    public <T> T mo114736d(Class<T> cls) {
        try {
            if (cls.isAssignableFrom(this.f241372n.getClass())) {
                return this.f241372n;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean contains = m101092a(this).contains(motionEvent.getRawX(), motionEvent.getRawY());
        if (motionEvent.getActionMasked() != 0 || mo114740g(motionEvent.getX(), motionEvent.getY()) || contains) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        float[] fArr = this.f241367f;
        if (fArr == null || fArr.length <= 0) {
            boolean z = true;
            float f = 0.0f;
            boolean z2 = this.f241366e > 0.0f;
            if (z2) {
                canvas.save();
                Path path = new Path();
                RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
                float f2 = this.f241366e;
                path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
                canvas.clipPath(path);
            }
            int i = this.f241370i;
            if (i != 0) {
                canvas.drawColor(i);
            }
            float f3 = this.f241368g;
            if (f3 > 0.0f) {
                float f4 = f3 / 2.0f;
                RectF rectF2 = new RectF(f4, f4, ((float) getWidth()) - f4, ((float) getHeight()) - f4);
                float f5 = this.f241366e;
                canvas.drawRoundRect(rectF2, f5, f5, this.f241371j);
                if (z2) {
                    canvas.restore();
                }
                canvas.save();
                Path path2 = new Path();
                float f6 = this.f241366e;
                if (f6 > 0.0f) {
                    float f7 = this.f241368g;
                    if (f6 - f7 > 0.0f) {
                        f = f6 - f7;
                    }
                }
                float f8 = this.f241368g;
                path2.addRoundRect(new RectF(f8, f8, ((float) getWidth()) - this.f241368g, ((float) getHeight()) - this.f241368g), f, f, Path.Direction.CW);
                canvas.clipPath(path2);
            } else {
                z = z2;
            }
            super.draw(canvas);
            if (z) {
                canvas.restore();
                return;
            }
            return;
        }
        super.draw(canvas);
    }

    /* renamed from: e */
    public void mo114739e() {
        this.f241371j.setStyle(Paint.Style.STROKE);
        this.f241371j.setAntiAlias(true);
        setWillNotDraw(false);
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (this.f241382x == 0) {
            this.f241382x = windowManager.getDefaultDisplay().getWidth();
            this.f241383y = windowManager.getDefaultDisplay().getHeight();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f A[RETURN] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo114740g(float r12, float r13) {
        /*
            r11 = this;
            float r0 = r11.f241366e
            r1 = 1
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0009
            return r1
        L_0x0009:
            double r2 = (double) r0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r2, r4)
            int r0 = r11.getWidth()
            float r0 = (float) r0
            int r6 = r11.getHeight()
            float r6 = (float) r6
            float r7 = r11.f241366e
            r8 = 0
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0054
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            float r7 = r7 - r12
            double r6 = (double) r7
            double r6 = java.lang.Math.pow(r6, r4)
            float r12 = r11.f241366e
            float r12 = r12 - r13
            double r12 = (double) r12
            double r12 = java.lang.Math.pow(r12, r4)
            double r6 = r6 + r12
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x008f
            return r8
        L_0x0039:
            float r0 = r6 - r7
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008f
            float r7 = r7 - r12
            double r9 = (double) r7
            double r9 = java.lang.Math.pow(r9, r4)
            float r12 = r11.f241366e
            float r13 = r13 + r12
            float r13 = r13 - r6
            double r12 = (double) r13
            double r12 = java.lang.Math.pow(r12, r4)
            double r9 = r9 + r12
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x008f
            return r8
        L_0x0054:
            float r9 = r0 - r7
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x008f
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0073
            float r12 = r12 + r7
            float r12 = r12 - r0
            double r6 = (double) r12
            double r6 = java.lang.Math.pow(r6, r4)
            float r12 = r11.f241366e
            float r12 = r12 - r13
            double r12 = (double) r12
            double r12 = java.lang.Math.pow(r12, r4)
            double r6 = r6 + r12
            int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x008f
            return r8
        L_0x0073:
            float r9 = r6 - r7
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x008f
            float r12 = r12 + r7
            float r12 = r12 - r0
            double r9 = (double) r12
            double r9 = java.lang.Math.pow(r9, r4)
            float r12 = r11.f241366e
            float r13 = r13 + r12
            float r13 = r13 - r6
            double r12 = (double) r13
            double r12 = java.lang.Math.pow(r12, r4)
            double r9 = r9 + r12
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 <= 0) goto L_0x008f
            return r8
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer.mo114740g(float, float):boolean");
    }

    /* renamed from: h */
    public final boolean mo114741h(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (viewGroup == viewGroup2) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt == viewGroup2) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && mo114741h((ViewGroup) childAt, viewGroup2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo114742i(String str, CoverViewContainer coverViewContainer, MotionEvent motionEvent) {
        JSONObject jSONObject;
        C82351a aVar = this.f241365B;
        if (aVar != null) {
            String str2 = coverViewContainer.f241374p;
            int i = coverViewContainer.f241375q;
            JSONObject jSONObject2 = null;
            try {
                jSONObject = new JSONObject();
                jSONObject.put("viewId", i);
                jSONObject.put("left", (double) (coverViewContainer.getX() / C88020k.m109556g()));
                jSONObject.put("top", (double) (coverViewContainer.getY() / C88020k.m109556g()));
            } catch (JSONException unused) {
                jSONObject = null;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewId", this.f241375q);
                jSONObject3.put("x", (double) (motionEvent.getRawX() / C88020k.m109556g()));
                jSONObject3.put("y", (double) (motionEvent.getRawY() / C88020k.m109556g()));
                jSONObject2 = jSONObject3;
            } catch (JSONException unused2) {
            }
            aVar.mo114754a(str, str2, jSONObject, jSONObject2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        CoverViewContainer coverViewContainer;
        View.OnClickListener onClickListener;
        Log.m105918d("MicroMsg.CoverViewContainer", "event: " + motionEvent.getAction());
        if (this.f241373o) {
            coverViewContainer = this;
        } else {
            int i = this.f241376r;
            coverViewContainer = i > 0 ? f241363C.get(Integer.valueOf(i)) : null;
        }
        if (!this.f241373o && (!this.f241377s || !mo114741h(coverViewContainer, this))) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f241378t = motionEvent.getRawX();
            this.f241379u = motionEvent.getRawY();
            this.f241380v = System.currentTimeMillis();
            if (coverViewContainer != null) {
                mo114742i(IXWebBroadcastListener.STAGE_START, coverViewContainer, motionEvent);
            }
        } else if (action == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f241380v;
            long j2 = currentTimeMillis - j;
            if (j != 0 && j2 < 300 && j2 >= 0 && (onClickListener = this.f241381w) != null) {
                onClickListener.onClick(this);
            }
            if (coverViewContainer != null) {
                mo114742i("end", coverViewContainer, motionEvent);
            }
        } else if (action == 2) {
            float rawX = motionEvent.getRawX() - this.f241378t;
            float rawY = motionEvent.getRawY() - this.f241379u;
            if (coverViewContainer != null && (Math.abs(rawX) > 1.0f || Math.abs(rawY) > 1.0f)) {
                int x = (int) (coverViewContainer.getX() + rawX);
                int y = (int) (coverViewContainer.getY() + rawY);
                if (x < 0) {
                    x = 0;
                } else {
                    int width = coverViewContainer.getWidth() + x;
                    int i2 = this.f241382x;
                    if (width > i2) {
                        x = i2 - coverViewContainer.getWidth();
                    }
                }
                coverViewContainer.setX((float) x);
                if (y < 0) {
                    y = 0;
                } else {
                    int height = coverViewContainer.getHeight() + y;
                    int i3 = this.f241383y;
                    if (height > i3) {
                        y = i3 - coverViewContainer.getHeight();
                    }
                }
                coverViewContainer.setY((float) y);
                this.f241378t = motionEvent.getRawX();
                this.f241379u = motionEvent.getRawY();
                mo114742i("dragging", coverViewContainer, motionEvent);
            }
        }
        return true;
    }

    public void setBgColor(int i) {
        this.f241370i = i;
    }

    public void setBorderColor(int i) {
        this.f241369h = i;
        this.f241371j.setColor(i);
    }

    public void setBorderRadius(float f) {
        this.f241366e = f;
    }

    public void setBorderWidth(float f) {
        this.f241368g = f;
        this.f241371j.setStrokeWidth(f);
    }

    public void setDragConfig(String str) {
    }

    public void setDragEventCallback(C82351a aVar) {
        this.f241365B = aVar;
    }

    public void setIsInterceptEvent(boolean z) {
        this.f241377s = z;
    }

    public void setOnCustomerClickListener(View.OnClickListener onClickListener) {
        this.f241381w = onClickListener;
    }

    public void setTargetView(View view) {
        this.f241372n = view;
        super.addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setBorderRadius(float[] fArr) {
        this.f241367f = fArr;
        if (fArr != null && fArr.length > 0) {
            setBackground(getShadowDrawable());
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (i < 0) {
            i = 0;
        } else if (i > getChildCount() - 1) {
            i = getChildCount() - 1;
        }
        super.addView(view, i + 1, layoutParams);
    }

    public CoverViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo114739e();
    }

    public CoverViewContainer(Context context, View view) {
        super(context);
        setTargetView(view);
        mo114739e();
    }
}
