package qo3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C7064x4;
import com.tencent.p014mm.p136ui.C75044y4;
import java.util.LinkedList;

/* renamed from: qo3.w */
public class C12925w implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: A */
    public int f36920A;

    /* renamed from: B */
    public ViewGroup f36921B;

    /* renamed from: C */
    public ViewGroup f36922C;

    /* renamed from: D */
    public LinkedList<w$$c> f36923D;

    /* renamed from: E */
    public C7064x4 f36924E;

    /* renamed from: d */
    public Dialog f36925d;

    /* renamed from: e */
    public Context f36926e;

    /* renamed from: f */
    public View f36927f;

    /* renamed from: g */
    public boolean f36928g;

    /* renamed from: h */
    public int f36929h;

    /* renamed from: i */
    public int f36930i;

    /* renamed from: j */
    public View f36931j;

    /* renamed from: n */
    public ViewTreeObserver f36932n;

    /* renamed from: o */
    public boolean f36933o;

    /* renamed from: p */
    public boolean f36934p;

    /* renamed from: q */
    public boolean f36935q;

    /* renamed from: r */
    public BottomSheetBehavior f36936r;

    /* renamed from: s */
    public w$$d f36937s;

    /* renamed from: t */
    public w$$e f36938t;

    /* renamed from: u */
    public boolean f36939u;

    /* renamed from: v */
    public LinearLayout f36940v;

    /* renamed from: w */
    public View f36941w;

    /* renamed from: x */
    public TextView f36942x;

    /* renamed from: y */
    public int f36943y;

    /* renamed from: z */
    public int f36944z;

    public C12925w(Context context) {
        this(context, 0, false, false);
        this.f36924E = new C7064x4(context);
        this.f36924E = new C7064x4(context);
    }

    /* renamed from: a */
    public void mo12461a() {
        this.f36921B.setBackgroundColor(this.f36926e.getResources().getColor(C0966R.color.ahf));
    }

    /* renamed from: b */
    public Window mo12462b() {
        Dialog dialog = this.f36925d;
        if (dialog != null) {
            return dialog.getWindow();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12463c(qo3.w$$c r13, boolean r14) {
        /*
            r12 = this;
            android.view.ViewGroup r0 = r12.f36922C
            java.util.LinkedList<qo3.w$$c> r1 = r12.f36923D
            int r1 = r1.indexOf(r13)
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            r1 = 0
            r10 = 0
            if (r14 != 0) goto L_0x0066
            r14 = 8
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r11.mo10233c(r14)
            java.lang.Object[] r3 = r11.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog"
            java.lang.String r5 = "hideBottomPage"
            java.lang.String r6 = "(Lcom/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$CustomBottomSheetPage;Z)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r14 = r11.mo10231a(r10)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r0.setVisibility(r14)
            java.lang.String r3 = "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog"
            java.lang.String r4 = "hideBottomPage"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$CustomBottomSheetPage;Z)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            r13.mo4872b()
            r13.f36949a = r1
            java.util.LinkedList<qo3.w$$c> r14 = r12.f36923D
            r14.remove(r13)
            android.view.ViewGroup r13 = r12.f36922C
            r13.removeView(r0)
            goto L_0x00fa
        L_0x0066:
            com.tencent.mm.ui.x4 r14 = r12.f36924E
            qo3.w$$b r2 = new qo3.w$$b
            r2.<init>(r12, r0, r13)
            android.view.ViewGroup r13 = r12.f36922C
            int r13 = r13.getWidth()
            float r13 = (float) r13
            r14.getClass()
            android.animation.ObjectAnimator r3 = r14.f24903d
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r3 = r3.getTarget()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x0086
            r1 = r3
            android.view.View r1 = (android.view.View) r1
        L_0x0086:
            boolean r1 = gy3.C87412m.m108589b(r1, r0)
            if (r1 == 0) goto L_0x00ad
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "slideToRightAnim view:"
            r13.append(r1)
            int r1 = r0.hashCode()
            r13.append(r1)
            java.lang.String r1 = " reuseAnim"
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            java.lang.String r1 = "WeUISlideAnimHelper"
            r14.mo8120a(r1, r13)
            goto L_0x00eb
        L_0x00ad:
            r1 = 0
            r3 = 1
            int r4 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r4 != 0) goto L_0x00b5
            r4 = 1
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            if (r4 == 0) goto L_0x00c1
            android.content.Context r13 = r14.f24900a
            android.graphics.Point r13 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r13)
            int r13 = r13.x
            float r13 = (float) r13
        L_0x00c1:
            r4 = 2
            float[] r4 = new float[r4]
            r4[r10] = r1
            r4[r3] = r13
            java.lang.String r13 = "translationX"
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r0, r13, r4)
            r14.f24903d = r13
            com.tencent.mm.ui.v0 r13 = r14.f24904e
            if (r13 != 0) goto L_0x00da
            com.tencent.mm.ui.v0 r13 = new com.tencent.mm.ui.v0
            r13.<init>()
        L_0x00da:
            r14.f24904e = r13
            android.animation.ObjectAnimator r1 = r14.f24903d
            if (r1 == 0) goto L_0x00e3
            r1.addListener(r13)
        L_0x00e3:
            android.animation.ObjectAnimator r13 = r14.f24903d
            if (r13 != 0) goto L_0x00e8
            goto L_0x00eb
        L_0x00e8:
            r13.setTarget(r0)
        L_0x00eb:
            com.tencent.mm.ui.v0 r13 = r14.f24904e
            if (r13 == 0) goto L_0x00f3
            r13.f24804d = r0
            r13.f24805e = r2
        L_0x00f3:
            android.animation.ObjectAnimator r13 = r14.f24903d
            if (r13 == 0) goto L_0x00fa
            r13.start()
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo3.C12925w.mo12463c(qo3.w$$c, boolean):void");
    }

    /* renamed from: d */
    public void mo12464d(boolean z) {
        LinearLayout linearLayout = this.f36940v;
        if (linearLayout != null) {
            if (z) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo12465e() {
        return this.f36926e.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: f */
    public boolean mo12466f() {
        Dialog dialog = this.f36925d;
        return dialog != null && dialog.isShowing();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0102 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12467g(qo3.w$$c r13) {
        /*
            r12 = this;
            java.util.LinkedList<qo3.w$$c> r0 = r12.f36923D
            boolean r0 = r0.contains(r13)
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.LinkedList<qo3.w$$c> r0 = r12.f36923D
            int r0 = r0.indexOf(r13)
            r1 = 1
            if (r0 <= 0) goto L_0x001a
            android.view.ViewGroup r2 = r12.f36922C
            int r0 = r0 - r1
            android.view.View r0 = r2.getChildAt(r0)
            goto L_0x001c
        L_0x001a:
            android.view.ViewGroup r0 = r12.f36921B
        L_0x001c:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r11 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog"
            java.lang.String r5 = "popBottomPage"
            java.lang.String r6 = "(Lcom/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$CustomBottomSheetPage;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog"
            java.lang.String r4 = "popBottomPage"
            java.lang.String r5 = "(Lcom/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$CustomBottomSheetPage;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.ui.x4 r2 = r12.f36924E
            android.view.ViewGroup r3 = r12.f36922C
            int r3 = r3.getWidth()
            float r3 = (float) r3
            r2.getClass()
            android.animation.ObjectAnimator r4 = r2.f24905f
            r5 = 2
            r6 = 0
            if (r4 == 0) goto L_0x00a3
            java.lang.Object r4 = r4.getTarget()
            boolean r7 = r4 instanceof android.view.View
            if (r7 == 0) goto L_0x007b
            android.view.View r4 = (android.view.View) r4
            goto L_0x007c
        L_0x007b:
            r4 = r6
        L_0x007c:
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x00a3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "slideFromLeft view:"
            r3.append(r4)
            int r4 = r0.hashCode()
            r3.append(r4)
            java.lang.String r4 = " reuseAnim"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "WeUISlideAnimHelper"
            r2.mo8120a(r4, r3)
            goto L_0x00e0
        L_0x00a3:
            r4 = 0
            int r7 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00aa
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            if (r7 == 0) goto L_0x00b6
            android.content.Context r3 = r2.f24900a
            android.graphics.Point r3 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r3)
            int r3 = r3.x
            float r3 = (float) r3
        L_0x00b6:
            float[] r7 = new float[r5]
            float r3 = -r3
            r7[r11] = r3
            r7[r1] = r4
            java.lang.String r3 = "translationX"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r0, r3, r7)
            r2.f24905f = r3
            com.tencent.mm.ui.v0 r3 = r2.f24906g
            if (r3 != 0) goto L_0x00cf
            com.tencent.mm.ui.v0 r3 = new com.tencent.mm.ui.v0
            r3.<init>()
        L_0x00cf:
            r2.f24906g = r3
            android.animation.ObjectAnimator r4 = r2.f24905f
            if (r4 == 0) goto L_0x00d8
            r4.addListener(r3)
        L_0x00d8:
            android.animation.ObjectAnimator r3 = r2.f24905f
            if (r3 != 0) goto L_0x00dd
            goto L_0x00e0
        L_0x00dd:
            r3.setTarget(r0)
        L_0x00e0:
            com.tencent.mm.ui.v0 r3 = r2.f24906g
            if (r3 == 0) goto L_0x00e8
            r3.f24804d = r0
            r3.f24805e = r6
        L_0x00e8:
            android.animation.ObjectAnimator r0 = r2.f24905f
            if (r0 == 0) goto L_0x00ef
            r0.start()
        L_0x00ef:
            java.util.LinkedList<qo3.w$$c> r0 = r12.f36923D
            java.lang.Object r0 = r0.peekLast()
            qo3.w$$c r0 = (qo3.w$$c) r0
            r12.mo12463c(r0, r1)
            java.util.LinkedList<qo3.w$$c> r0 = r12.f36923D
            int r13 = r0.indexOf(r13)
            if (r13 >= 0) goto L_0x0103
            return
        L_0x0103:
            java.util.LinkedList<qo3.w$$c> r0 = r12.f36923D
            int r0 = r0.size()
            int r0 = r0 - r5
        L_0x010a:
            if (r0 < r13) goto L_0x011a
            java.util.LinkedList<qo3.w$$c> r1 = r12.f36923D
            java.lang.Object r1 = r1.get(r0)
            qo3.w$$c r1 = (qo3.w$$c) r1
            r12.mo12463c(r1, r11)
            int r0 = r0 + -1
            goto L_0x010a
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo3.C12925w.mo12467g(qo3.w$$c):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12468h(qo3.w$$c r15) {
        /*
            r14 = this;
            if (r15 != 0) goto L_0x0003
            return
        L_0x0003:
            android.app.Dialog r0 = r14.f36925d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            android.view.ViewGroup r3 = r14.f36922C
            android.content.Context r3 = r3.getContext()
            android.view.View r3 = r15.mo4781a(r3)
            if (r3 != 0) goto L_0x001f
            return
        L_0x001f:
            r15.f36949a = r14
            java.util.LinkedList<qo3.w$$c> r4 = r14.f36923D
            r4.add(r15)
            r4 = 8
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog"
            java.lang.String r7 = "pushBottomPage"
            java.lang.String r8 = "(Lcom/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$CustomBottomSheetPage;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog"
            java.lang.String r6 = "pushBottomPage"
            java.lang.String r7 = "(Lcom/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$CustomBottomSheetPage;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.view.ViewGroup r4 = r14.f36922C
            r4.addView(r3)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            r5 = 80
            r4.gravity = r5
            r3.setLayoutParams(r4)
            java.util.LinkedList<qo3.w$$c> r3 = r14.f36923D
            boolean r3 = r3.contains(r15)
            if (r3 != 0) goto L_0x0085
            goto L_0x0212
        L_0x0085:
            java.util.LinkedList<qo3.w$$c> r3 = r14.f36923D
            int r3 = r3.indexOf(r15)
            android.view.ViewGroup r4 = r14.f36922C
            android.view.View r4 = r4.getChildAt(r3)
            if (r4 != 0) goto L_0x0095
            goto L_0x0212
        L_0x0095:
            if (r3 <= 0) goto L_0x009f
            android.view.ViewGroup r5 = r14.f36922C
            int r3 = r3 - r2
            android.view.View r3 = r5.getChildAt(r3)
            goto L_0x00a1
        L_0x009f:
            android.view.ViewGroup r3 = r14.f36921B
        L_0x00a1:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r13.mo10233c(r5)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog"
            java.lang.String r8 = "showBottomPage"
            java.lang.String r9 = "(Lcom/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$CustomBottomSheetPage;Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r4
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog"
            java.lang.String r7 = "showBottomPage"
            java.lang.String r8 = "(Lcom/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$CustomBottomSheetPage;Z)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r4
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            r15.mo4873c()
            r15 = 0
            if (r0 == 0) goto L_0x00ea
            r5 = 0
            goto L_0x00f1
        L_0x00ea:
            android.view.ViewGroup r5 = r14.f36922C
            int r5 = r5.getWidth()
            float r5 = (float) r5
        L_0x00f1:
            r4.setTranslationX(r5)
            if (r0 != 0) goto L_0x0212
            com.tencent.mm.ui.x4 r0 = r14.f36924E
            android.view.ViewGroup r5 = r14.f36922C
            int r5 = r5.getWidth()
            float r5 = (float) r5
            r0.getClass()
            android.animation.ObjectAnimator r6 = r0.f24901b
            java.lang.String r7 = "WeUISlideAnimHelper"
            java.lang.String r8 = " reuseAnim"
            java.lang.String r9 = "translationX"
            r10 = 2
            r11 = 0
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r6.getTarget()
            boolean r12 = r6 instanceof android.view.View
            if (r12 == 0) goto L_0x011a
            android.view.View r6 = (android.view.View) r6
            goto L_0x011b
        L_0x011a:
            r6 = r11
        L_0x011b:
            boolean r6 = gy3.C87412m.m108589b(r6, r4)
            if (r6 == 0) goto L_0x013e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "slideFromRight view:"
            r5.append(r6)
            int r6 = r4.hashCode()
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r0.mo8120a(r7, r5)
            goto L_0x0176
        L_0x013e:
            int r6 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x0144
            r6 = 1
            goto L_0x0145
        L_0x0144:
            r6 = 0
        L_0x0145:
            if (r6 == 0) goto L_0x0150
            android.content.Context r5 = r0.f24900a
            android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r5)
            int r5 = r5.x
            float r5 = (float) r5
        L_0x0150:
            float[] r6 = new float[r10]
            r6[r1] = r5
            r6[r2] = r15
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r4, r9, r6)
            r0.f24901b = r5
            com.tencent.mm.ui.v0 r5 = r0.f24902c
            if (r5 != 0) goto L_0x0165
            com.tencent.mm.ui.v0 r5 = new com.tencent.mm.ui.v0
            r5.<init>()
        L_0x0165:
            r0.f24902c = r5
            android.animation.ObjectAnimator r6 = r0.f24901b
            if (r6 == 0) goto L_0x016e
            r6.addListener(r5)
        L_0x016e:
            android.animation.ObjectAnimator r5 = r0.f24901b
            if (r5 != 0) goto L_0x0173
            goto L_0x0176
        L_0x0173:
            r5.setTarget(r4)
        L_0x0176:
            com.tencent.mm.ui.v0 r5 = r0.f24902c
            if (r5 == 0) goto L_0x017e
            r5.f24804d = r4
            r5.f24805e = r11
        L_0x017e:
            android.animation.ObjectAnimator r0 = r0.f24901b
            if (r0 == 0) goto L_0x0185
            r0.start()
        L_0x0185:
            if (r3 == 0) goto L_0x0212
            com.tencent.mm.ui.x4 r0 = r14.f36924E
            qo3.z r4 = new qo3.z
            r4.<init>(r14, r3)
            android.view.ViewGroup r5 = r14.f36922C
            int r5 = r5.getWidth()
            float r5 = (float) r5
            r0.getClass()
            android.animation.ObjectAnimator r6 = r0.f24907h
            if (r6 == 0) goto L_0x01ca
            java.lang.Object r6 = r6.getTarget()
            boolean r12 = r6 instanceof android.view.View
            if (r12 == 0) goto L_0x01a7
            r11 = r6
            android.view.View r11 = (android.view.View) r11
        L_0x01a7:
            boolean r6 = gy3.C87412m.m108589b(r11, r3)
            if (r6 == 0) goto L_0x01ca
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "slideToLeftAnim view:"
            r15.append(r1)
            int r1 = r3.hashCode()
            r15.append(r1)
            r15.append(r8)
            java.lang.String r15 = r15.toString()
            r0.mo8120a(r7, r15)
            goto L_0x0203
        L_0x01ca:
            int r6 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x01d0
            r6 = 1
            goto L_0x01d1
        L_0x01d0:
            r6 = 0
        L_0x01d1:
            if (r6 == 0) goto L_0x01dc
            android.content.Context r5 = r0.f24900a
            android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r5)
            int r5 = r5.x
            float r5 = (float) r5
        L_0x01dc:
            float[] r6 = new float[r10]
            r6[r1] = r15
            float r15 = -r5
            r6[r2] = r15
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r3, r9, r6)
            r0.f24907h = r15
            com.tencent.mm.ui.v0 r15 = r0.f24908i
            if (r15 != 0) goto L_0x01f2
            com.tencent.mm.ui.v0 r15 = new com.tencent.mm.ui.v0
            r15.<init>()
        L_0x01f2:
            r0.f24908i = r15
            android.animation.ObjectAnimator r1 = r0.f24907h
            if (r1 == 0) goto L_0x01fb
            r1.addListener(r15)
        L_0x01fb:
            android.animation.ObjectAnimator r15 = r0.f24907h
            if (r15 != 0) goto L_0x0200
            goto L_0x0203
        L_0x0200:
            r15.setTarget(r3)
        L_0x0203:
            com.tencent.mm.ui.v0 r15 = r0.f24908i
            if (r15 == 0) goto L_0x020b
            r15.f24804d = r3
            r15.f24805e = r4
        L_0x020b:
            android.animation.ObjectAnimator r15 = r0.f24907h
            if (r15 == 0) goto L_0x0212
            r15.start()
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo3.C12925w.mo12468h(qo3.w$$c):void");
    }

    /* renamed from: i */
    public void mo12469i(boolean z) {
        Dialog dialog = this.f36925d;
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(z);
            this.f36925d.setCancelable(z);
        }
    }

    /* renamed from: j */
    public C12925w mo12470j(int i) {
        LayoutInflater.from(this.f36927f.getContext()).inflate(i, this.f36921B, true);
        return this;
    }

    /* renamed from: k */
    public C12925w mo12471k(View view) {
        this.f36921B.addView(view, 0);
        return this;
    }

    /* renamed from: l */
    public void mo12472l(Boolean bool) {
        this.f36934p = bool.booleanValue();
    }

    /* renamed from: m */
    public C12925w mo12473m(boolean z) {
        if (this.f36927f != null) {
            if (z) {
                this.f36921B.setBackgroundResource(C0966R.C0969drawable.az7);
                this.f36941w.setBackgroundColor(this.f36926e.getResources().getColor(C0966R.color.f2948a5));
                this.f36942x.setTextColor(this.f36926e.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                this.f36942x.setBackgroundResource(C0966R.C0969drawable.f4882q5);
            } else {
                this.f36921B.setBackgroundResource(C0966R.C0969drawable.az_);
            }
        }
        return this;
    }

    /* renamed from: n */
    public void mo5085n() {
        Dialog dialog = this.f36925d;
        if (dialog != null) {
            Context context = this.f36926e;
            if (!(context instanceof Activity)) {
                this.f36939u = true;
                dialog.dismiss();
            } else if (context != null && !((Activity) context).isFinishing() && !((Activity) this.f36926e).isDestroyed()) {
                this.f36939u = true;
                this.f36925d.dismiss();
            }
            BottomSheetBehavior bottomSheetBehavior = this.f36936r;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309230p = true;
            }
        }
    }

    /* renamed from: o */
    public void mo5086o() {
        this.f36928g = mo12465e();
        Context context = this.f36926e;
        this.f36929h = context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        if (this.f36925d != null) {
            ((ViewGroup) this.f36927f.getParent()).setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36927f.getLayoutParams();
            boolean z = true;
            if (!this.f36935q && this.f36928g && this.f36931j != null) {
                Rect rect = new Rect();
                this.f36931j.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = Math.min(rect.right, rect.bottom);
                layoutParams.gravity = 1;
                ViewParent parent = this.f36927f.getParent();
                if (parent instanceof View) {
                    ((View) parent).setOnTouchListener(new C12902a0(this, parent));
                }
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.getLayoutParams() instanceof CoordinatorLayout.C103717e) {
                        C12905b0 b0Var = new C12905b0(this);
                        ((CoordinatorLayout.C103717e) viewGroup.getLayoutParams()).mo144938b(b0Var);
                        this.f36936r = b0Var;
                        if (this.f36943y > 0) {
                            b0Var.mo146384B(4);
                            this.f36936r.mo146383A(this.f36943y);
                        } else {
                            b0Var.mo146384B(3);
                        }
                    }
                }
            }
            if (this.f36928g && this.f36931j != null) {
                Rect rect2 = new Rect();
                this.f36931j.getWindowVisibleDisplayFrame(rect2);
                if (this.f36935q) {
                    layoutParams.width = (int) ((((float) rect2.right) * 1.0f) / 2.0f);
                    int i = this.f36920A;
                    if (i != 0) {
                        layoutParams.width = i;
                    }
                    if (C75044y4.m89999k(this.f36926e)) {
                        layoutParams.height = rect2.bottom - C75044y4.m89996h(this.f36926e);
                    } else {
                        layoutParams.height = rect2.bottom;
                    }
                } else {
                    layoutParams.width = Math.min(rect2.right, rect2.bottom);
                    int i2 = this.f36920A;
                    if (i2 != 0) {
                        layoutParams.width = i2;
                    }
                }
            }
            this.f36927f.setLayoutParams(layoutParams);
            this.f36925d.getWindow().addFlags(Integer.MIN_VALUE);
            if (this.f36934p) {
                this.f36925d.getWindow().setFlags(8, 8);
                this.f36925d.getWindow().addFlags(131200);
                this.f36925d.getWindow().getDecorView().setSystemUiVisibility(6);
            } else {
                this.f36925d.getWindow().clearFlags(8);
                this.f36925d.getWindow().clearFlags(131072);
                this.f36925d.getWindow().clearFlags(128);
                this.f36925d.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            View view = this.f36931j;
            if (view != null) {
                if (this.f36932n != null) {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f36932n = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            Context context2 = this.f36926e;
            if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                this.f36925d.show();
            }
            BottomSheetBehavior bottomSheetBehavior = this.f36936r;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309230p = false;
            }
        }
    }

    public void onGlobalLayout() {
        if (mo12466f()) {
            View view = this.f36931j;
            if (view == null || (!view.isShown() && view.getVisibility() != 0)) {
                mo5085n();
            } else if (mo12466f()) {
                if (this.f36928g == mo12465e()) {
                    int i = this.f36929h;
                    Context context = this.f36926e;
                    if (i == (context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        if (this.f36930i != this.f36921B.getHeight()) {
                            this.f36930i = this.f36921B.getHeight();
                            int width = this.f36921B.getWidth();
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36922C.getLayoutParams();
                            layoutParams.height = this.f36930i;
                            layoutParams.width = width;
                            layoutParams.gravity = 85;
                            this.f36922C.setLayoutParams(layoutParams);
                            return;
                        }
                        return;
                    }
                }
                mo5085n();
            }
        }
    }

    public C12925w(Context context, int i, boolean z, boolean z2) {
        this.f36928g = false;
        this.f36933o = false;
        this.f36934p = false;
        this.f36935q = false;
        this.f36937s = null;
        this.f36938t = null;
        this.f36939u = false;
        this.f36944z = C0966R.style.f8363ft;
        this.f36920A = 0;
        this.f36923D = new LinkedList<>();
        this.f36926e = context;
        this.f36924E = new C7064x4(context);
        this.f36935q = z2;
        Context context2 = this.f36926e;
        if (context2 instanceof Activity) {
            this.f36931j = ((ViewGroup) ((Activity) context2).getWindow().getDecorView()).findViewById(16908290);
        }
        this.f36943y = i;
        Context context3 = this.f36926e;
        if (this.f36935q) {
            this.f36925d = new C12903b(context3, 0);
        } else if (z) {
            this.f36925d = new C12918l0(context3, C0966R.style.f8426i2);
        } else {
            this.f36925d = new C104428a(context3, this.f36944z);
        }
        View inflate = View.inflate(context3, C0966R.C0971layout.bcc, (ViewGroup) null);
        this.f36927f = inflate;
        this.f36921B = (ViewGroup) inflate.findViewById(C0966R.C0970id.ahb);
        this.f36922C = (ViewGroup) this.f36927f.findViewById(C0966R.C0970id.ahi);
        this.f36940v = (LinearLayout) this.f36927f.findViewById(C0966R.C0970id.ah_);
        this.f36941w = this.f36927f.findViewById(C0966R.C0970id.aq6);
        this.f36942x = (TextView) this.f36927f.findViewById(C0966R.C0970id.aq7);
        this.f36940v.setOnClickListener(new C12926x(this));
        this.f36928g = mo12465e();
        this.f36925d.requestWindowFeature(1);
        this.f36925d.setContentView(this.f36927f);
        if (!this.f36935q && !z) {
            BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) this.f36927f.getParent());
            this.f36936r = y;
            if (y != null) {
                if (this.f36943y > 0) {
                    y.mo146384B(4);
                    this.f36936r.mo146383A(this.f36943y);
                } else {
                    y.mo146384B(3);
                }
            }
        }
        this.f36925d.setOnKeyListener(new w$$a(this));
        this.f36925d.setOnDismissListener(new C12927y(this));
    }
}
