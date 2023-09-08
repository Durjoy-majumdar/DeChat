package ro3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;
import android.widget.PopupWindow;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85975v4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: ro3.b */
public final class C110577b extends View {

    /* renamed from: A */
    public static final /* synthetic */ int f330752A = 0;

    /* renamed from: d */
    public final C110588j f330753d;

    /* renamed from: e */
    public final PopupWindow f330754e;

    /* renamed from: f */
    public final Paint f330755f;

    /* renamed from: g */
    public final int f330756g;

    /* renamed from: h */
    public final int f330757h;

    /* renamed from: i */
    public final int f330758i;

    /* renamed from: j */
    public Path f330759j = new Path();

    /* renamed from: n */
    public Point f330760n;

    /* renamed from: o */
    public Point f330761o;

    /* renamed from: p */
    public Point f330762p;

    /* renamed from: q */
    public Point f330763q;

    /* renamed from: r */
    public boolean f330764r;

    /* renamed from: s */
    public int f330765s;

    /* renamed from: t */
    public int f330766t;

    /* renamed from: u */
    public final int[] f330767u;

    /* renamed from: v */
    public final int[] f330768v;

    /* renamed from: w */
    public int f330769w;

    /* renamed from: x */
    public int f330770x;

    /* renamed from: y */
    public final int f330771y;

    /* renamed from: z */
    public final int f330772z;

    /* renamed from: ro3.b$a */
    public static final class C110578a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C110577b f330773d;

        public C110578a(C110577b bVar) {
            this.f330773d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/edittext/InsertHandle$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C110584g h = this.f330773d.f330753d.mo162138h();
            if (h.f330790b.isShowing()) {
                h.f330790b.dismiss();
            } else {
                h.mo162106a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/edittext/InsertHandle$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110577b(C110588j jVar, Context context) {
        super(context);
        C110588j jVar2 = jVar;
        C87412m.m108594g(jVar2, "helper");
        this.f330753d = jVar2;
        int i = jVar2.f330847v / 2;
        this.f330756g = i;
        int i2 = i * 2;
        this.f330757h = i2;
        int a = C74942w4.m89784a(jVar2.f330832g, 9);
        this.f330758i = a;
        this.f330760n = new Point(i, 0);
        double d = (double) 1;
        double d2 = (double) 2;
        int i3 = i2;
        double d3 = (double) i;
        this.f330761o = new Point((int) ((d - (Math.sqrt(2.0d) / d2)) * d3), (int) ((Math.sqrt(2.0d) / d2) * d3));
        this.f330762p = new Point((int) ((d + (Math.sqrt(2.0d) / d2)) * d3), (int) ((Math.sqrt(2.0d) / d2) * d3));
        this.f330763q = new Point(i, (int) (Math.sqrt(2.0d) * d3));
        C110578a aVar = new C110578a(this);
        this.f330767u = new int[2];
        this.f330768v = new int[2];
        this.f330771y = 1;
        this.f330772z = 2;
        Paint paint = new Paint(1);
        this.f330755f = paint;
        paint.setColor(jVar2.f330846u);
        PopupWindow popupWindow = new PopupWindow(this);
        this.f330754e = popupWindow;
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(i3 + (a * 2));
        popupWindow.setHeight(i3 + (a / 2));
        invalidate();
        setOnClickListener(aVar);
    }

    private final void setVisible(boolean z) {
        View contentView = this.f330754e.getContentView();
        int i = z ? 0 : 4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/edittext/InsertHandle", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/widget/edittext/InsertHandle", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: a */
    public final void mo162079a(int i, int i2) {
        this.f330753d.f330833h.getLocationInWindow(this.f330767u);
        int extraX = i + 0 + getExtraX();
        int extraY = i2 + getExtraY();
        int i3 = this.f330767u[1];
        if (extraY >= i3 && extraY <= ((i3 + this.f330753d.f330833h.getHeight()) - this.f330753d.f330833h.getPaddingBottom()) + C74942w4.m89784a(getContext(), 5)) {
            mo162080b(extraX, extraY);
        }
    }

    /* renamed from: b */
    public final void mo162080b(int i, int i2) {
        this.f330765s = i;
        this.f330766t = i2;
        C85975v4.m106304a("EditHelper.InsertHandle", "showOrUpdate() called with: x = " + i + ", y = " + i2, new Object[0]);
        if (this.f330754e.isShowing()) {
            this.f330754e.update(i, i2, -1, -1);
        } else {
            this.f330754e.showAtLocation(this.f330753d.f330833h, 0, i, i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.graphics.Point} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: android.graphics.Point} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: android.graphics.Point} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162081c(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "event"
            r2 = r17
            gy3.C87412m.m108594g(r2, r1)
            ro3.j r1 = r0.f330753d
            ro3.c r1 = r1.mo162137g()
            if (r1 != 0) goto L_0x0012
            return
        L_0x0012:
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            ro3.j r3 = r0.f330753d
            ro3.c r4 = r3.f330820U
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0025
            boolean r4 = r4.f330776c
            if (r4 != r5) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x002a
            goto L_0x00c8
        L_0x002a:
            android.widget.TextView r3 = r3.f330833h
            float r3 = r3.getRotation()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0037
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 == 0) goto L_0x00ca
            ro3.j r3 = r0.f330753d
            android.widget.TextView r3 = r3.f330833h
            float r3 = r3.getRotationX()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0048
            r3 = 1
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            if (r3 == 0) goto L_0x00ca
            ro3.j r3 = r0.f330753d
            android.widget.TextView r3 = r3.f330833h
            float r3 = r3.getRotationY()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0059
            r3 = 1
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            if (r3 != 0) goto L_0x005e
            goto L_0x00ca
        L_0x005e:
            ro3.j r3 = r0.f330753d
            android.widget.TextView r7 = r3.f330833h
            float r7 = r7.getScaleX()
            r3.f330824Y = r7
            ro3.j r3 = r0.f330753d
            android.widget.TextView r7 = r3.f330833h
            float r7 = r7.getScaleY()
            r3.f330825Z = r7
            ro3.j r3 = r0.f330753d
            android.widget.TextView r3 = r3.f330833h
            android.view.ViewParent r3 = r3.getParent()
        L_0x007a:
            if (r3 == 0) goto L_0x00c8
            boolean r7 = r3 instanceof android.view.View
            if (r7 == 0) goto L_0x00c3
            r7 = r3
            android.view.View r7 = (android.view.View) r7
            float r8 = r7.getRotation()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x008d
            r8 = 1
            goto L_0x008e
        L_0x008d:
            r8 = 0
        L_0x008e:
            if (r8 == 0) goto L_0x00ca
            float r8 = r7.getRotationX()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x009a
            r8 = 1
            goto L_0x009b
        L_0x009a:
            r8 = 0
        L_0x009b:
            if (r8 == 0) goto L_0x00ca
            float r8 = r7.getRotationY()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x00a7
            r8 = 1
            goto L_0x00a8
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            if (r8 != 0) goto L_0x00ab
            goto L_0x00ca
        L_0x00ab:
            ro3.j r8 = r0.f330753d
            float r9 = r8.f330824Y
            float r10 = r7.getScaleX()
            float r9 = r9 * r10
            r8.f330824Y = r9
            ro3.j r8 = r0.f330753d
            float r9 = r8.f330825Z
            float r7 = r7.getScaleY()
            float r9 = r9 * r7
            r8.f330825Z = r9
        L_0x00c3:
            android.view.ViewParent r3 = r3.getParent()
            goto L_0x007a
        L_0x00c8:
            r3 = 1
            goto L_0x00cb
        L_0x00ca:
            r3 = 0
        L_0x00cb:
            if (r3 == 0) goto L_0x02f5
            ro3.j r3 = r0.f330753d
            ro3.c r3 = r3.f330820U
            if (r3 == 0) goto L_0x00dc
            android.widget.Magnifier r3 = r3.f330774a
            if (r3 == 0) goto L_0x00dc
            int r3 = r3.getHeight()
            goto L_0x00dd
        L_0x00dc:
            r3 = 0
        L_0x00dd:
            float r3 = (float) r3
            ro3.j r4 = r0.f330753d
            ro3.c r4 = r4.f330820U
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L_0x00ef
            android.widget.Magnifier r4 = r4.f330774a
            if (r4 == 0) goto L_0x00ef
            float r4 = r4.getZoom()
            goto L_0x00f1
        L_0x00ef:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00f1:
            float r3 = r3 / r4
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            ro3.j r4 = r0.f330753d
            android.widget.TextView r4 = r4.f330833h
            android.text.TextPaint r4 = r4.getPaint()
            android.graphics.Paint$FontMetrics r4 = r4.getFontMetrics()
            java.lang.String r8 = "helper.mTextView.getPaint().getFontMetrics()"
            gy3.C87412m.m108593f(r4, r8)
            float r8 = r4.descent
            float r4 = r4.ascent
            float r8 = r8 - r4
            ro3.j r4 = r0.f330753d
            float r4 = r4.f330825Z
            float r8 = r8 * r4
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0119
            r3 = 1
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            if (r3 != 0) goto L_0x02f5
            int r3 = r16.getMagnifierHandleTrigger()
            r4 = -1
            if (r3 != 0) goto L_0x012c
            ro3.j r8 = r0.f330753d
            android.widget.TextView r8 = r8.f330833h
            int r8 = r8.getSelectionStart()
            goto L_0x0157
        L_0x012c:
            int r8 = r0.f330771y
            if (r3 != r8) goto L_0x0141
            ro3.j r8 = r0.f330753d
            android.widget.TextView r8 = r8.f330833h
            int r8 = r8.getSelectionStart()
            ro3.j r9 = r0.f330753d
            android.widget.TextView r9 = r9.f330833h
            int r9 = r9.getSelectionEnd()
            goto L_0x0158
        L_0x0141:
            int r8 = r0.f330772z
            if (r3 != r8) goto L_0x0156
            ro3.j r8 = r0.f330753d
            android.widget.TextView r8 = r8.f330833h
            int r8 = r8.getSelectionEnd()
            ro3.j r9 = r0.f330753d
            android.widget.TextView r9 = r9.f330833h
            int r9 = r9.getSelectionStart()
            goto L_0x0158
        L_0x0156:
            r8 = -1
        L_0x0157:
            r9 = -1
        L_0x0158:
            if (r8 != r4) goto L_0x015c
            goto L_0x02f1
        L_0x015c:
            int r10 = r17.getActionMasked()
            if (r10 != 0) goto L_0x016b
            ro3.j r10 = r0.f330753d
            float r11 = r17.getRawX()
            r10.f330823X = r11
            goto L_0x0178
        L_0x016b:
            int r10 = r17.getActionMasked()
            if (r10 != r5) goto L_0x0178
            ro3.j r10 = r0.f330753d
            int r11 = r10.f330822W
            float r11 = (float) r11
            r10.f330823X = r11
        L_0x0178:
            ro3.j r10 = r0.f330753d
            android.widget.TextView r10 = r10.f330833h
            android.text.Layout r10 = r10.getLayout()
            java.lang.String r11 = "helper.mTextView.getLayout()"
            gy3.C87412m.m108593f(r10, r11)
            int r12 = r10.getLineForOffset(r8)
            if (r9 == r4) goto L_0x0193
            int r4 = r10.getLineForOffset(r9)
            if (r12 != r4) goto L_0x0193
            r4 = 1
            goto L_0x0194
        L_0x0193:
            r4 = 0
        L_0x0194:
            if (r4 == 0) goto L_0x01c4
            if (r8 >= r9) goto L_0x019a
            r10 = 1
            goto L_0x019b
        L_0x019a:
            r10 = 0
        L_0x019b:
            ro3.j r13 = r0.f330753d
            android.widget.TextView r13 = r13.f330833h
            android.text.Layout r13 = r13.getLayout()
            gy3.C87412m.m108593f(r13, r11)
            float r8 = r13.getPrimaryHorizontal(r8)
            ro3.j r13 = r0.f330753d
            android.widget.TextView r13 = r13.f330833h
            android.text.Layout r13 = r13.getLayout()
            gy3.C87412m.m108593f(r13, r11)
            float r13 = r13.getPrimaryHorizontal(r9)
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x01bf
            r8 = 1
            goto L_0x01c0
        L_0x01bf:
            r8 = 0
        L_0x01c0:
            if (r10 == r8) goto L_0x01c4
            r8 = 1
            goto L_0x01c5
        L_0x01c4:
            r8 = 0
        L_0x01c5:
            r10 = 2
            int[] r13 = new int[r10]
            ro3.j r14 = r0.f330753d
            android.widget.TextView r14 = r14.f330833h
            r14.getLocationOnScreen(r13)
            float r14 = r17.getRawX()
            r15 = r13[r6]
            float r15 = (float) r15
            float r14 = r14 - r15
            ro3.j r15 = r0.f330753d
            android.widget.TextView r15 = r15.f330833h
            int r15 = r15.getTotalPaddingLeft()
            ro3.j r5 = r0.f330753d
            android.widget.TextView r5 = r5.f330833h
            int r5 = r5.getScrollX()
            int r15 = r15 - r5
            float r5 = (float) r15
            ro3.j r15 = r0.f330753d
            android.widget.TextView r15 = r15.f330833h
            int r15 = r15.getTotalPaddingLeft()
            ro3.j r6 = r0.f330753d
            android.widget.TextView r6 = r6.f330833h
            int r6 = r6.getScrollX()
            int r15 = r15 - r6
            float r6 = (float) r15
            if (r4 == 0) goto L_0x0217
            int r15 = r0.f330772z
            if (r3 != r15) goto L_0x0203
            r15 = 1
            goto L_0x0204
        L_0x0203:
            r15 = 0
        L_0x0204:
            r15 = r15 ^ r8
            if (r15 == 0) goto L_0x0217
            ro3.j r15 = r0.f330753d
            android.widget.TextView r15 = r15.f330833h
            android.text.Layout r15 = r15.getLayout()
            gy3.C87412m.m108593f(r15, r11)
            float r15 = r15.getPrimaryHorizontal(r9)
            goto L_0x0223
        L_0x0217:
            ro3.j r15 = r0.f330753d
            android.widget.TextView r15 = r15.f330833h
            android.text.Layout r15 = r15.getLayout()
            float r15 = r15.getLineLeft(r12)
        L_0x0223:
            float r5 = r5 + r15
            if (r4 == 0) goto L_0x0240
            int r4 = r0.f330771y
            if (r3 != r4) goto L_0x022c
            r3 = 1
            goto L_0x022d
        L_0x022c:
            r3 = 0
        L_0x022d:
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0240
            ro3.j r3 = r0.f330753d
            android.widget.TextView r3 = r3.f330833h
            android.text.Layout r3 = r3.getLayout()
            gy3.C87412m.m108593f(r3, r11)
            float r3 = r3.getPrimaryHorizontal(r9)
            goto L_0x024c
        L_0x0240:
            ro3.j r3 = r0.f330753d
            android.widget.TextView r3 = r3.f330833h
            android.text.Layout r3 = r3.getLayout()
            float r3 = r3.getLineRight(r12)
        L_0x024c:
            float r6 = r6 + r3
            ro3.j r3 = r0.f330753d
            float r4 = r3.f330824Y
            float r5 = r5 * r4
            float r6 = r6 * r4
            ro3.c r3 = r3.f330820U
            if (r3 == 0) goto L_0x0262
            android.widget.Magnifier r3 = r3.f330774a
            if (r3 == 0) goto L_0x0262
            int r3 = r3.getWidth()
            goto L_0x0263
        L_0x0262:
            r3 = 0
        L_0x0263:
            float r3 = (float) r3
            ro3.j r4 = r0.f330753d
            ro3.c r4 = r4.f330820U
            if (r4 == 0) goto L_0x0273
            android.widget.Magnifier r4 = r4.f330774a
            if (r4 == 0) goto L_0x0273
            float r4 = r4.getZoom()
            goto L_0x0275
        L_0x0273:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0275:
            float r3 = r3 / r4
            int r3 = java.lang.Math.round(r3)
            float r3 = (float) r3
            float r4 = (float) r10
            float r3 = r3 / r4
            float r4 = r5 - r3
            int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x02f0
            float r3 = r3 + r6
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0289
            goto L_0x02f0
        L_0x0289:
            ro3.j r3 = r0.f330753d
            float r3 = r3.f330824Y
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0293
            r3 = 1
            goto L_0x0294
        L_0x0293:
            r3 = 0
        L_0x0294:
            if (r3 == 0) goto L_0x0297
            goto L_0x02ab
        L_0x0297:
            float r2 = r17.getRawX()
            ro3.j r3 = r0.f330753d
            float r4 = r3.f330823X
            float r2 = r2 - r4
            float r3 = r3.f330824Y
            float r2 = r2 * r3
            float r2 = r2 + r4
            r3 = 0
            r4 = r13[r3]
            float r3 = (float) r4
            float r14 = r2 - r3
        L_0x02ab:
            float r2 = java.lang.Math.min(r6, r14)
            float r2 = java.lang.Math.max(r5, r2)
            r1.x = r2
            ro3.j r2 = r0.f330753d
            android.widget.TextView r2 = r2.f330833h
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineTop(r12)
            ro3.j r3 = r0.f330753d
            android.widget.TextView r3 = r3.f330833h
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineBottom(r12)
            int r2 = r2 + r3
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            ro3.j r3 = r0.f330753d
            android.widget.TextView r3 = r3.f330833h
            int r3 = r3.getTotalPaddingTop()
            float r3 = (float) r3
            float r2 = r2 + r3
            ro3.j r3 = r0.f330753d
            android.widget.TextView r3 = r3.f330833h
            int r3 = r3.getScrollY()
            float r3 = (float) r3
            float r2 = r2 - r3
            ro3.j r3 = r0.f330753d
            float r3 = r3.f330825Z
            float r2 = r2 * r3
            r1.y = r2
            r6 = 1
            goto L_0x02f1
        L_0x02f0:
            r6 = 0
        L_0x02f1:
            if (r6 == 0) goto L_0x02f5
            r2 = 1
            goto L_0x02f6
        L_0x02f5:
            r2 = 0
        L_0x02f6:
            if (r2 == 0) goto L_0x03f8
            ro3.j r2 = r0.f330753d
            ro3.c r2 = r2.f330820U
            if (r2 == 0) goto L_0x034e
            float r3 = r1.x
            float r1 = r1.y
            boolean r4 = r2.f330776c
            if (r4 == 0) goto L_0x0313
            float r4 = r2.f330782i
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x030e
            r4 = 1
            goto L_0x030f
        L_0x030e:
            r4 = 0
        L_0x030f:
            if (r4 != 0) goto L_0x0313
            r4 = 1
            goto L_0x0314
        L_0x0313:
            r4 = 0
        L_0x0314:
            if (r4 == 0) goto L_0x033a
            android.animation.ValueAnimator r4 = r2.f330775b
            boolean r4 = r4.isRunning()
            if (r4 == 0) goto L_0x032c
            android.animation.ValueAnimator r4 = r2.f330775b
            r4.cancel()
            float r4 = r2.f330779f
            r2.f330777d = r4
            float r4 = r2.f330780g
            r2.f330778e = r4
            goto L_0x0334
        L_0x032c:
            float r4 = r2.f330781h
            r2.f330777d = r4
            float r4 = r2.f330782i
            r2.f330778e = r4
        L_0x0334:
            android.animation.ValueAnimator r4 = r2.f330775b
            r4.start()
            goto L_0x0347
        L_0x033a:
            android.animation.ValueAnimator r4 = r2.f330775b
            boolean r4 = r4.isRunning()
            if (r4 != 0) goto L_0x0347
            android.widget.Magnifier r4 = r2.f330774a
            r4.show(r3, r1)
        L_0x0347:
            r2.f330781h = r3
            r2.f330782i = r1
            r1 = 1
            r2.f330776c = r1
        L_0x034e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 29
            if (r1 < r3) goto L_0x0364
            ro3.j r1 = r0.f330753d
            ro3.c r1 = r1.f330820U
            if (r1 == 0) goto L_0x03a0
            android.widget.Magnifier r1 = r1.f330774a
            if (r1 == 0) goto L_0x03a0
            android.graphics.Point r2 = r1.getPosition()
            goto L_0x03a0
        L_0x0364:
            r3 = 28
            if (r1 != r3) goto L_0x03a0
            ro3.j r1 = r0.f330753d
            ro3.c r1 = r1.f330820U
            if (r1 == 0) goto L_0x0371
            android.widget.Magnifier r1 = r1.f330774a
            goto L_0x0372
        L_0x0371:
            r1 = r2
        L_0x0372:
            java.lang.String r3 = "getWindowCoords"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]
            java.lang.Class r4 = r1.getClass()
            r6 = r2
        L_0x037c:
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r4 == r7) goto L_0x0389
            java.lang.reflect.Method r6 = r4.getDeclaredMethod(r3, r5)     // Catch:{ all -> 0x0384 }
        L_0x0384:
            java.lang.Class r4 = r4.getSuperclass()
            goto L_0x037c
        L_0x0389:
            if (r6 != 0) goto L_0x0392
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r4 = "MB getWindowCoords"
            r3.<init>(r4)
        L_0x0392:
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 1
            r6.setAccessible(r5)     // Catch:{ all -> 0x039d }
            java.lang.Object r2 = r6.invoke(r1, r4)     // Catch:{ all -> 0x039d }
        L_0x039d:
            android.graphics.Point r2 = (android.graphics.Point) r2
            goto L_0x03a1
        L_0x03a0:
            r3 = 0
        L_0x03a1:
            if (r2 != 0) goto L_0x03a4
            goto L_0x0405
        L_0x03a4:
            android.graphics.Rect r1 = new android.graphics.Rect
            int r4 = r2.x
            int r5 = r2.y
            ro3.j r6 = r0.f330753d
            ro3.c r6 = r6.f330820U
            if (r6 == 0) goto L_0x03b9
            android.widget.Magnifier r6 = r6.f330774a
            if (r6 == 0) goto L_0x03b9
            int r6 = r6.getWidth()
            goto L_0x03ba
        L_0x03b9:
            r6 = 0
        L_0x03ba:
            int r6 = r6 + r4
            int r2 = r2.y
            ro3.j r7 = r0.f330753d
            ro3.c r7 = r7.f330820U
            if (r7 == 0) goto L_0x03cb
            android.widget.Magnifier r7 = r7.f330774a
            if (r7 == 0) goto L_0x03cb
            int r3 = r7.getHeight()
        L_0x03cb:
            int r2 = r2 + r3
            r1.<init>(r4, r5, r6, r2)
            android.widget.PopupWindow r2 = r0.f330754e
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r0.f330765s
            int r5 = r0.f330766t
            android.view.View r6 = r2.getContentView()
            int r6 = r6.getWidth()
            int r6 = r6 + r4
            int r7 = r0.f330766t
            android.view.View r2 = r2.getContentView()
            int r2 = r2.getHeight()
            int r7 = r7 + r2
            r3.<init>(r4, r5, r6, r7)
            boolean r1 = android.graphics.Rect.intersects(r3, r1)
            r2 = 1
            r1 = r1 ^ r2
            r0.setVisible(r1)
            goto L_0x0405
        L_0x03f8:
            r2 = 1
            ro3.j r1 = r0.f330753d
            ro3.c r1 = r1.f330820U
            if (r1 == 0) goto L_0x0405
            r1.mo162103a()
            r0.setVisible(r2)
        L_0x0405:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ro3.C110577b.mo162081c(android.view.MotionEvent):void");
    }

    public final int getExtraX() {
        return (this.f330767u[0] - this.f330758i) + this.f330753d.f330833h.getPaddingLeft() + 2;
    }

    public final int getExtraY() {
        return (this.f330767u[1] + this.f330753d.f330833h.getPaddingTop()) - this.f330753d.f330833h.getScrollY();
    }

    public final int getINSERTION() {
        return 0;
    }

    public final Path getMPath() {
        return this.f330759j;
    }

    public final Point getMPointR() {
        return this.f330763q;
    }

    public final Point getMPointT1() {
        return this.f330760n;
    }

    public final Point getMPointT2() {
        return this.f330761o;
    }

    public final Point getMPointT3() {
        return this.f330762p;
    }

    public final PopupWindow getMWindow() {
        return this.f330754e;
    }

    public final int getMagnifierHandleTrigger() {
        return 0;
    }

    public final int getSELECTION_END() {
        return this.f330772z;
    }

    public final int getSELECTION_START() {
        return this.f330771y;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        super.onDraw(canvas);
        this.f330759j.reset();
        Path path = this.f330759j;
        Point point = this.f330760n;
        path.moveTo((float) point.x, (float) point.y);
        Path path2 = this.f330759j;
        Point point2 = this.f330761o;
        path2.lineTo((float) point2.x, (float) point2.y);
        Path path3 = this.f330759j;
        Point point3 = this.f330762p;
        path3.lineTo((float) point3.x, (float) point3.y);
        Path path4 = this.f330759j;
        Point point4 = this.f330760n;
        path4.lineTo((float) point4.x, (float) point4.y);
        canvas.drawPath(this.f330759j, this.f330755f);
        Point point5 = this.f330763q;
        canvas.drawCircle((float) point5.x, (float) point5.y, (float) this.f330756g, this.f330755f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r0 != 3) goto L_0x017a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r10, r0)
            super.onTouchEvent(r10)
            int r0 = r10.getAction()
            r1 = 1
            r2 = 28
            if (r0 == 0) goto L_0x0113
            r3 = 0
            if (r0 == r1) goto L_0x00e5
            r4 = 2
            if (r0 == r4) goto L_0x001c
            r4 = 3
            if (r0 == r4) goto L_0x00e5
            goto L_0x017a
        L_0x001c:
            r9.f330764r = r1
            ro3.j r0 = r9.f330753d
            ro3.g r0 = r0.f330830e
            if (r0 == 0) goto L_0x003c
            android.widget.PopupWindow r0 = r0.f330790b
            boolean r0 = r0.isShowing()
            if (r0 != r1) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x003c
            ro3.j r0 = r9.f330753d
            ro3.g r0 = r0.f330830e
            if (r0 == 0) goto L_0x003c
            android.widget.PopupWindow r0 = r0.f330790b
            r0.dismiss()
        L_0x003c:
            float r0 = r10.getRawX()
            int r0 = (int) r0
            float r4 = r10.getRawY()
            int r4 = (int) r4
            int[] r5 = r9.f330768v
            r3 = r5[r3]
            int r5 = r9.f330770x
            int r6 = r9.f330757h
            ro3.j r7 = r9.f330753d
            int r8 = r7.f330850y
            int r0 = r0 - r3
            int r4 = r4 + r5
            int r4 = r4 - r6
            int r4 = r4 - r8
            android.widget.TextView r3 = r7.f330833h
            int r3 = r3.getScrollY()
            int r4 = r4 + r3
            ro3.j r3 = r9.f330753d
            android.widget.TextView r3 = r3.f330833h
            int[] r5 = r9.f330767u
            r3.getLocationInWindow(r5)
            ro3.j r3 = r9.f330753d
            ro3.j$d r5 = r3.f330831f
            int r5 = r5.f330855a
            int[] r6 = r9.f330767u
            r6 = r6[r1]
            int r4 = r4 - r6
            android.widget.TextView r3 = r3.f330833h
            int r0 = xo3.C78967g.m95468a(r3, r0, r4, r5)
            if (r0 == r5) goto L_0x00d6
            ro3.j r3 = r9.f330753d
            r3.mo148761n(r0, r0)
            ro3.j r0 = r9.f330753d
            android.widget.TextView r0 = r0.f330833h
            int[] r3 = r9.f330767u
            r0.getLocationInWindow(r3)
            ro3.j r0 = r9.f330753d
            android.widget.TextView r0 = r0.f330833h
            android.text.Layout r0 = r0.getLayout()
            java.lang.String r3 = "helper.mTextView.getLayout()"
            gy3.C87412m.m108593f(r0, r3)
            ro3.j r3 = r9.f330753d
            android.widget.TextView r3 = r3.f330833h
            int r3 = r3.getSelectionStart()
            int r4 = r0.getLineForOffset(r3)
            int r4 = r0.getLineBottom(r4)
            int r5 = r9.getExtraY()
            int r4 = r4 + r5
            int[] r5 = r9.f330767u
            r5 = r5[r1]
            ro3.j r6 = r9.f330753d
            android.widget.TextView r6 = r6.f330833h
            int r6 = r6.getHeight()
            int r5 = r5 + r6
            ro3.j r6 = r9.f330753d
            android.widget.TextView r6 = r6.f330833h
            int r6 = r6.getPaddingBottom()
            int r5 = r5 - r6
            if (r4 <= r5) goto L_0x00c2
            r4 = r5
        L_0x00c2:
            int[] r5 = r9.f330767u
            r5 = r5[r1]
            if (r4 >= r5) goto L_0x00c9
            r4 = r5
        L_0x00c9:
            float r0 = r0.getPrimaryHorizontal(r3)
            int r0 = (int) r0
            int r3 = r9.getExtraX()
            int r0 = r0 + r3
            r9.mo162080b(r0, r4)
        L_0x00d6:
            ro3.j r0 = r9.f330753d
            boolean r0 = r0.f330819T
            if (r0 == 0) goto L_0x017a
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L_0x017a
            r9.mo162081c(r10)
            goto L_0x017a
        L_0x00e5:
            r9.f330764r = r3
            r10.getRawX()
            r10.getRawY()
            int[] r10 = r9.f330768v
            r10 = r10[r3]
            ro3.j r10 = r9.f330753d
            int r0 = r10.f330850y
            boolean r0 = r10.f330819T
            if (r0 == 0) goto L_0x0107
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L_0x0107
            ro3.c r10 = r10.f330820U
            if (r10 == 0) goto L_0x0107
            r10.mo162103a()
            r9.setVisible(r1)
        L_0x0107:
            ro3.j r10 = r9.f330753d
            android.widget.TextView r0 = r10.f330833h
            java.lang.Runnable r2 = r10.f330821V
            long r3 = r10.f330818S
            r0.postDelayed(r2, r3)
            goto L_0x017a
        L_0x0113:
            ro3.j r0 = r9.f330753d
            ro3.j$d r0 = r0.f330831f
            r0.getClass()
            ro3.j r0 = r9.f330753d
            ro3.j$d r0 = r0.f330831f
            r0.getClass()
            float r0 = r10.getX()
            int r0 = (int) r0
            r9.f330769w = r0
            float r0 = r10.getY()
            int r0 = (int) r0
            r9.f330770x = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "soontest mAdjustX:"
            r0.append(r3)
            int r3 = r9.f330769w
            r0.append(r3)
            java.lang.String r3 = ",mAdjustY:"
            r0.append(r3)
            int r3 = r9.f330770x
            r0.append(r3)
            java.lang.String r3 = ",mHeight:"
            r0.append(r3)
            int r3 = r9.f330757h
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r0)
            ro3.j r0 = r9.f330753d
            android.widget.TextView r0 = r0.f330833h
            int[] r3 = r9.f330768v
            r0.getLocationInWindow(r3)
            ro3.j r0 = r9.f330753d
            boolean r0 = r0.f330819T
            if (r0 == 0) goto L_0x0171
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L_0x0171
            r9.mo162081c(r10)
        L_0x0171:
            ro3.j r10 = r9.f330753d
            android.widget.TextView r0 = r10.f330833h
            java.lang.Runnable r10 = r10.f330821V
            r0.removeCallbacks(r10)
        L_0x017a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ro3.C110577b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setMPath(Path path) {
        C87412m.m108594g(path, "<set-?>");
        this.f330759j = path;
    }

    public final void setMPointR(Point point) {
        C87412m.m108594g(point, "<set-?>");
        this.f330763q = point;
    }

    public final void setMPointT1(Point point) {
        C87412m.m108594g(point, "<set-?>");
        this.f330760n = point;
    }

    public final void setMPointT2(Point point) {
        C87412m.m108594g(point, "<set-?>");
        this.f330761o = point;
    }

    public final void setMPointT3(Point point) {
        C87412m.m108594g(point, "<set-?>");
        this.f330762p = point;
    }

    public final void setMoving(boolean z) {
        this.f330764r = z;
    }
}
