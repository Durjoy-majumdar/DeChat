package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import nj3.C76901s0;

/* renamed from: com.tencent.mm.ui.base.VerticalScrollBar */
public abstract class VerticalScrollBar extends View {

    /* renamed from: A */
    public Context f348299A;

    /* renamed from: B */
    public int f348300B = 0;

    /* renamed from: d */
    public float f348301d;

    /* renamed from: e */
    public int f348302e;

    /* renamed from: f */
    public String[] f348303f;

    /* renamed from: g */
    public int f348304g;

    /* renamed from: h */
    public float f348305h;

    /* renamed from: i */
    public float f348306i = 0.0f;

    /* renamed from: j */
    public float f348307j;

    /* renamed from: n */
    public boolean f348308n = false;

    /* renamed from: o */
    public C76901s0 f348309o;

    /* renamed from: p */
    public TextView f348310p;

    /* renamed from: q */
    public C6756b f348311q;

    /* renamed from: r */
    public Paint f348312r;

    /* renamed from: s */
    public int f348313s;

    /* renamed from: t */
    public int f348314t;

    /* renamed from: u */
    public int f348315u;

    /* renamed from: v */
    public int f348316v;

    /* renamed from: w */
    public int f348317w;

    /* renamed from: x */
    public int f348318x;

    /* renamed from: y */
    public int f348319y;

    /* renamed from: z */
    public View f348320z;

    /* renamed from: com.tencent.mm.ui.base.VerticalScrollBar$b */
    public interface C6756b {
        /* renamed from: S0 */
        void mo5638S0(String str);
    }

    /* renamed from: com.tencent.mm.ui.base.VerticalScrollBar$a */
    public class C116070a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f348321d;

        /* renamed from: e */
        public final /* synthetic */ int f348322e;

        public C116070a(int i, int i2) {
            this.f348321d = i;
            this.f348322e = i2;
        }

        public void run() {
            VerticalScrollBar verticalScrollBar = VerticalScrollBar.this;
            String[] strArr = verticalScrollBar.f348303f;
            if (strArr.length > 0) {
                int measureText = ((int) verticalScrollBar.f348312r.measureText(strArr[strArr.length - 1])) + C76577a.m92151b(VerticalScrollBar.this.getContext(), 16);
                VerticalScrollBar verticalScrollBar2 = VerticalScrollBar.this;
                int length = (int) (((float) verticalScrollBar2.f348303f.length) * verticalScrollBar2.f348305h * verticalScrollBar2.f348301d);
                Log.m105925i("MicroMsg.VerticalScrollBar", "onDraw newHeight:%s, viewHeight:%s", Integer.valueOf(length), Integer.valueOf(this.f348321d));
                if (length == 0) {
                    length = this.f348321d;
                }
                int i = this.f348322e;
                if (measureText > i) {
                    measureText = i;
                }
                ViewGroup.LayoutParams layoutParams = VerticalScrollBar.this.getLayoutParams();
                layoutParams.width = measureText;
                layoutParams.height = length;
                VerticalScrollBar.this.setLayoutParams(layoutParams);
            }
        }
    }

    public VerticalScrollBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo174288c();
        this.f348299A = context;
        setFocusable(true);
        setFocusableInTouchMode(true);
        BackwardSupportUtil.BitmapFactory.fromDPToPix(context, 3.0f);
        this.f348320z = View.inflate(context, getToastLayoutId(), (ViewGroup) null);
        this.f348317w = BackwardSupportUtil.BitmapFactory.fromDPToPix(context, (float) this.f348302e);
        this.f348318x = this.f348299A.getResources().getDisplayMetrics().widthPixels;
        this.f348319y = this.f348299A.getResources().getDisplayMetrics().heightPixels;
        View view = this.f348320z;
        int i = this.f348317w;
        this.f348309o = new C76901s0(view, i, i);
        this.f348310p = (TextView) this.f348320z.findViewById(C0966R.C0970id.f359201jk0);
        Context context2 = this.f348299A;
        float f = C74942w4.f220334a;
        TypedValue typedValue = new TypedValue();
        context2.getTheme().resolveAttribute(C0966R.attr.f2613a, typedValue, true);
        this.f348313s = typedValue.data;
        this.f348314t = this.f348299A.getResources().getColor(C0966R.color.al_);
        this.f348315u = context.getResources().getColor(C0966R.color.akw);
        this.f348316v = C74942w4.m89784a(getContext(), 7);
        Paint paint = new Paint();
        this.f348312r = paint;
        paint.setAntiAlias(true);
        this.f348300B = (int) (((float) ((((Math.max(this.f348319y, this.f348318x) - C75044y4.m89989a(this.f348299A)) - C75044y4.m89994f(this.f348299A)) - C75044y4.m89991c(this.f348299A)) - ((int) (((float) C76577a.m92155f(this.f348299A, C0966R.dimen.f3683bc)) * C76577a.m92161l(this.f348299A))))) / (((float) this.f348303f.length) * this.f348301d));
    }

    /* renamed from: a */
    public void mo177238a(Canvas canvas, float f, float f2, float f3, Paint paint, int i) {
        canvas.drawCircle(f, f2, f3, paint);
    }

    /* renamed from: b */
    public void mo177239b(Canvas canvas, float f, float f2, Paint paint, int i, boolean z) {
        canvas.drawText(this.f348303f[i], f, f2, paint);
    }

    /* renamed from: c */
    public abstract void mo174288c();

    /* renamed from: d */
    public void mo177240d(String str) {
        this.f348310p.setText(str);
    }

    public abstract int getToastLayoutId();

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int a = C74942w4.m89784a(getContext(), 9);
        float a2 = (float) C74942w4.m89784a(getContext(), 11);
        this.f348305h = a2;
        int i2 = this.f348300B;
        if (a2 > ((float) i2)) {
            a2 = (float) i2;
        }
        this.f348305h = a2;
        float f = (float) a;
        if (a2 < f) {
            a2 = f;
        }
        this.f348305h = a2;
        this.f348312r.setTextSize(a2);
        float f2 = this.f348306i;
        float f3 = this.f348305h;
        if (f2 != f3) {
            this.f348306i = f3;
            post(new C116070a(measuredHeight, measuredWidth));
        }
        if (this.f348308n && this.f348304g != 0) {
            this.f348312r.setStyle(Paint.Style.FILL);
            this.f348312r.setColor(this.f348315u);
            float f4 = this.f348305h;
            mo177238a(canvas, ((float) measuredWidth) / 2.0f, (f4 / 2.0f) + (((float) this.f348304g) * f4 * this.f348301d) + ((float) C74942w4.m89784a(this.f348299A, 1)), (float) this.f348316v, this.f348312r, this.f348304g);
        }
        this.f348312r.setTextAlign(Paint.Align.CENTER);
        int i3 = 0;
        while (i3 < this.f348303f.length) {
            boolean z = this.f348308n;
            boolean z2 = z && this.f348304g == i3;
            if (!z || (i = this.f348304g) == 0 || i != i3) {
                this.f348312r.setColor(this.f348313s);
            } else {
                this.f348312r.setColor(this.f348314t);
            }
            float f5 = this.f348305h;
            mo177239b(canvas, (float) (measuredWidth / 2), f5 + (((float) i3) * f5 * this.f348301d), this.f348312r, i3, z2);
            i3++;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.f348308n = true;
            float y = motionEvent.getY();
            this.f348307j = y;
            if (y < 0.0f) {
                this.f348307j = 0.0f;
            }
            if (this.f348307j > ((float) getMeasuredHeight())) {
                this.f348307j = (float) getMeasuredHeight();
            }
            int i = (int) (this.f348307j / (this.f348305h * this.f348301d));
            String[] strArr = this.f348303f;
            if (i >= strArr.length) {
                i = strArr.length - 1;
            }
            this.f348304g = i;
            if (i == -1) {
                mo177240d(getResources().getString(C0966R.string.ifx));
            } else {
                mo177240d(strArr[i]);
            }
            int a = this.f348318x - C74942w4.m89784a(getContext(), 120);
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            float f = this.f348305h;
            int i2 = (int) ((((double) ((f / 2.0f) + ((((float) this.f348304g) * f) * this.f348301d))) - (((double) this.f348317w) / 2.0d)) + ((double) iArr[1]));
            if (motionEvent.getAction() == 0) {
                this.f348309o.showAtLocation(this, 0, a, i2);
            }
            if (motionEvent.getAction() == 2) {
                C76901s0 s0Var = this.f348309o;
                int i3 = this.f348317w;
                s0Var.update(a, i2, i3, i3);
            }
            C6756b bVar = this.f348311q;
            if (bVar != null) {
                int i4 = this.f348304g;
                if (i4 == -1) {
                    bVar.mo5638S0(C76577a.m92166q(getContext(), C0966R.string.ifx));
                } else {
                    bVar.mo5638S0(this.f348303f[i4]);
                }
            }
            invalidate();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f348309o.dismiss();
            this.f348308n = false;
        }
        return true;
    }

    public void setOnScrollBarTouchListener(C6756b bVar) {
        this.f348311q = bVar;
    }
}
