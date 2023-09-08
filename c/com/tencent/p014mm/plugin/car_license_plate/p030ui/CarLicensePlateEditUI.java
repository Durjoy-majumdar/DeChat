package com.tencent.p014mm.plugin.car_license_plate.p030ui;

import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bz0.C67330h;
import bz0.C79856a;
import bz0.C79858b;
import bz0.C79859c;
import bz0.C79860d;
import bz0.C79861e;
import bz0.C79862f;
import bz0.C79864g;
import bz0.C79866k;
import bz0.C79870n;
import bz0.C79873o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85978w1;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import cz0.C45226a;
import cz0.C86159b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C88989a;
import p170ic.C87687a;
import p282z2.C16095a;
import p385u2.C111105a;
import vo3.C90852c;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112550d0;
import zy0.C91946a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI;", "Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateBaseActivity;", "<init>", "()V", "plugin-car-license-plate_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI */
public final class CarLicensePlateEditUI extends CarLicensePlateBaseActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f248001i = 0;

    /* renamed from: e */
    public C79856a f248002e;

    /* renamed from: f */
    public C79866k f248003f;

    /* renamed from: g */
    public View f248004g;

    /* renamed from: h */
    public String f248005h;

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$a */
    public static final class C85115a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CarLicensePlateEditUI f248006d;

        public C85115a(CarLicensePlateEditUI carLicensePlateEditUI) {
            this.f248006d = carLicensePlateEditUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f248006d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$b */
    public static final class C85116b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CarLicensePlateEditUI f248007d;

        public C85116b(CarLicensePlateEditUI carLicensePlateEditUI) {
            this.f248007d = carLicensePlateEditUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f248007d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$c */
    public static final class C85117c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CarLicensePlateEditUI f248008d;

        public C85117c(CarLicensePlateEditUI carLicensePlateEditUI) {
            this.f248008d = carLicensePlateEditUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CarLicensePlateEditUI carLicensePlateEditUI = this.f248008d;
            C79856a aVar = carLicensePlateEditUI.f248002e;
            if (aVar != null) {
                String str = aVar.f234005d;
                if (C87412m.m108589b(str, carLicensePlateEditUI.f248005h)) {
                    carLicensePlateEditUI.setResult(-1, new Intent().putExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT", str));
                    carLicensePlateEditUI.finish();
                } else {
                    C53895h.m60466d(carLicensePlateEditUI.f248000d, (C66212f) null, (C53934p0) null, new C79870n(carLicensePlateEditUI, str, (C15601d<? super C79870n>) null), 3, (Object) null);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI$onPostCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("inputLayoutController");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI$d */
    public static final class C85118d implements C79856a.C79857a {

        /* renamed from: a */
        public final /* synthetic */ CarLicensePlateEditUI f248009a;

        public C85118d(CarLicensePlateEditUI carLicensePlateEditUI) {
            this.f248009a = carLicensePlateEditUI;
        }

        /* renamed from: a */
        public void mo110036a(String str, boolean z) {
            C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
            View view = this.f248009a.f248004g;
            if (view != null) {
                view.setEnabled(z);
            } else {
                C87412m.m108603p("finishBtn");
                throw null;
            }
        }

        /* JADX WARNING: type inference failed for: r3v10, types: [android.view.View, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo110037b(bz0.C79873o.C79875b r31) {
            /*
                r30 = this;
                java.lang.String r0 = "type"
                r1 = r31
                gy3.C87412m.m108594g(r1, r0)
                r0 = r30
                com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateEditUI r2 = r0.f248009a
                bz0.k r2 = r2.f248003f
                if (r2 == 0) goto L_0x02c4
                android.util.SparseArray<android.view.ViewGroup> r4 = r2.f234020d
                int r5 = r31.mo110048a()
                java.lang.Object r4 = r4.get(r5)
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                java.lang.String r5 = "view.findViewById(R.id.layout_btn_line4)"
                java.lang.String r6 = "view.findViewById(R.id.layout_btn_line3)"
                java.lang.String r7 = "view.findViewById(R.id.layout_btn_line2)"
                java.lang.String r8 = "view.findViewById(R.id.layout_btn_line1)"
                java.lang.String r9 = "view.findViewById(R.id.layout_btn_line0)"
                r14 = 2131307081(0x7f092a49, float:1.823238E38)
                r16 = 4
                r10 = 5
                r12 = 0
                if (r4 != 0) goto L_0x0196
                android.content.Context r4 = r2.f234017a
                java.lang.String r20 = "context"
                if (r4 == 0) goto L_0x0191
                android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
                r3 = 2131493440(0x7f0c0240, float:1.861036E38)
                android.widget.RelativeLayout r13 = r2.f234018b
                java.lang.String r21 = "containerLayout"
                if (r13 == 0) goto L_0x018c
                android.view.View r3 = r4.inflate(r3, r13, r12)
                java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
                gy3.C87412m.m108592e(r3, r4)
                r4 = r3
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                android.widget.RelativeLayout r3 = r2.f234018b
                if (r3 == 0) goto L_0x0187
                android.widget.RelativeLayout$LayoutParams r13 = new android.widget.RelativeLayout$LayoutParams
                r11 = -2
                r15 = -1
                r13.<init>(r15, r11)
                r11 = 12
                r13.addRule(r11)
                rx3.b0 r11 = rx3.C13598b0.f38549a
                r3.addView(r4, r13)
                java.lang.CharSequence[] r3 = r31.mo110050c()
                android.widget.LinearLayout[] r11 = new android.widget.LinearLayout[r10]
                android.view.View r13 = r4.findViewById(r14)
                gy3.C87412m.m108593f(r13, r9)
                android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
                r11[r12] = r13
                r13 = 2131307082(0x7f092a4a, float:1.8232381E38)
                android.view.View r15 = r4.findViewById(r13)
                gy3.C87412m.m108593f(r15, r8)
                android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
                r13 = 1
                r11[r13] = r15
                r13 = 2131307083(0x7f092a4b, float:1.8232383E38)
                android.view.View r15 = r4.findViewById(r13)
                gy3.C87412m.m108593f(r15, r7)
                android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
                r13 = 2
                r11[r13] = r15
                r13 = 2131307084(0x7f092a4c, float:1.8232385E38)
                android.view.View r15 = r4.findViewById(r13)
                gy3.C87412m.m108593f(r15, r6)
                android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
                r13 = 3
                r11[r13] = r15
                r13 = 2131307085(0x7f092a4d, float:1.8232387E38)
                android.view.View r15 = r4.findViewById(r13)
                gy3.C87412m.m108593f(r15, r5)
                android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
                r11[r16] = r15
                bz0.m r13 = new bz0.m
                r13.<init>(r2)
                r15 = 2131298430(0x7f09087e, float:1.8214833E38)
                android.view.View r15 = r4.findViewById(r15)
                com.tencent.mm.plugin.car_license_plate.ui.RepeatKeyTouchFrameLayout r15 = (com.tencent.p014mm.plugin.car_license_plate.p030ui.RepeatKeyTouchFrameLayout) r15
                bz0.l r14 = new bz0.l
                r14.<init>(r2)
                r15.setRepeatKeyTouchListener(r14)
                com.tencent.mm.ui.w1 r14 = new com.tencent.mm.ui.w1
                android.content.Context r15 = r2.f234017a
                if (r15 == 0) goto L_0x0182
                r10 = 2131886339(0x7f120103, float:1.9407254E38)
                r14.<init>(r15, r10)
                int r10 = r3.length
                r15 = 1
                int r10 = r10 - r15
                r15 = 4
            L_0x00da:
                java.lang.Object r20 = sx3.C110823p.m150982H(r11, r15)
                r12 = r20
                android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
                if (r12 != 0) goto L_0x00ee
                r21 = r3
                r22 = r11
                r23 = r13
                r24 = r14
                goto L_0x0158
            L_0x00ee:
                java.lang.Object r20 = sx3.C110823p.m150982H(r3, r10)
                r0 = r20
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r21 = r3
                if (r0 == 0) goto L_0x014a
                r1 = 0
            L_0x00fb:
                int r3 = r0.length()
                if (r1 >= r3) goto L_0x013d
                char r3 = r0.charAt(r1)
                r20 = r0
                android.widget.TextView r0 = new android.widget.TextView
                r0.<init>(r14)
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r0.setText(r3)
                r0.setOnClickListener(r13)
                android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
                r22 = r11
                android.content.res.Resources r11 = r14.getResources()
                r23 = r13
                r13 = 2131165351(0x7f0700a7, float:1.7944917E38)
                int r11 = r11.getDimensionPixelSize(r13)
                r13 = 1065353216(0x3f800000, float:1.0)
                r24 = r14
                r14 = 0
                r3.<init>(r14, r11, r13)
                r12.addView(r0, r3)
                int r1 = r1 + 1
                r0 = r20
                r11 = r22
                r13 = r23
                r14 = r24
                goto L_0x00fb
            L_0x013d:
                r22 = r11
                r23 = r13
                r24 = r14
                r14 = 0
                r12.setVisibility(r14)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x0151
            L_0x014a:
                r22 = r11
                r23 = r13
                r24 = r14
                r0 = 0
            L_0x0151:
                if (r0 != 0) goto L_0x0158
                r0 = 8
                r12.setVisibility(r0)
            L_0x0158:
                int r10 = r10 + -1
                if (r10 < 0) goto L_0x015e
                r0 = 1
                goto L_0x015f
            L_0x015e:
                r0 = 0
            L_0x015f:
                int r15 = r15 + -1
                if (r15 < 0) goto L_0x0165
                r1 = 1
                goto L_0x0166
            L_0x0165:
                r1 = 0
            L_0x0166:
                r0 = r0 | r1
                if (r0 != 0) goto L_0x0173
                android.util.SparseArray<android.view.ViewGroup> r0 = r2.f234020d
                int r1 = r31.mo110048a()
                r0.put(r1, r4)
                goto L_0x0196
            L_0x0173:
                r0 = r30
                r1 = r31
                r3 = r21
                r11 = r22
                r13 = r23
                r14 = r24
                r12 = 0
                goto L_0x00da
            L_0x0182:
                gy3.C87412m.m108603p(r20)
                r0 = 0
                throw r0
            L_0x0187:
                r0 = 0
                gy3.C87412m.m108603p(r21)
                throw r0
            L_0x018c:
                r0 = 0
                gy3.C87412m.m108603p(r21)
                throw r0
            L_0x0191:
                r0 = 0
                gy3.C87412m.m108603p(r20)
                throw r0
            L_0x0196:
                r0 = 5
                android.widget.LinearLayout[] r1 = new android.widget.LinearLayout[r0]
                r0 = 2131307081(0x7f092a49, float:1.823238E38)
                android.view.View r0 = r4.findViewById(r0)
                gy3.C87412m.m108593f(r0, r9)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r3 = 0
                r1[r3] = r0
                r0 = 2131307082(0x7f092a4a, float:1.8232381E38)
                android.view.View r0 = r4.findViewById(r0)
                gy3.C87412m.m108593f(r0, r8)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r3 = 1
                r1[r3] = r0
                r0 = 2131307083(0x7f092a4b, float:1.8232383E38)
                android.view.View r0 = r4.findViewById(r0)
                gy3.C87412m.m108593f(r0, r7)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r3 = 2
                r1[r3] = r0
                r0 = 2131307084(0x7f092a4c, float:1.8232385E38)
                android.view.View r0 = r4.findViewById(r0)
                gy3.C87412m.m108593f(r0, r6)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r3 = 3
                r1[r3] = r0
                r0 = 2131307085(0x7f092a4d, float:1.8232387E38)
                android.view.View r0 = r4.findViewById(r0)
                gy3.C87412m.m108593f(r0, r5)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                r1[r16] = r0
                r0 = 5
                r14 = 0
            L_0x01e5:
                if (r14 >= r0) goto L_0x029e
                r3 = r1[r14]
                int r5 = r3.getVisibility()
                if (r5 != 0) goto L_0x0293
                int r5 = r3.getChildCount()
                r6 = 0
            L_0x01f4:
                if (r6 >= r5) goto L_0x0293
                android.view.View r7 = r3.getChildAt(r6)
                boolean r8 = r7 instanceof android.widget.TextView
                if (r8 == 0) goto L_0x023f
                android.widget.TextView r7 = (android.widget.TextView) r7
                java.lang.CharSequence r8 = r7.getText()
                int r8 = r8.length()
                r15 = 1
                if (r8 <= r15) goto L_0x0222
                java.lang.CharSequence r8 = r7.getText()
                java.lang.String r8 = r8.toString()
                r9 = 0
                java.lang.String r8 = r8.substring(r9, r15)
                java.lang.String r10 = "this as java.lang.String…ing(startIndex, endIndex)"
                gy3.C87412m.m108593f(r8, r10)
                r7.setText(r8)
                goto L_0x0223
            L_0x0222:
                r9 = 0
            L_0x0223:
                java.lang.CharSequence r8 = r31.mo110049b()
                java.lang.CharSequence r10 = r7.getText()
                char r10 = r10.charAt(r9)
                r11 = 0
                r13 = 2
                boolean r8 = z04.C112550d0.m153802v(r8, r10, r9, r13, r11)
                r7.setEnabled(r8)
                r16 = 8
                r17 = 2
                r19 = 0
                goto L_0x028f
            L_0x023f:
                r13 = 2
                r15 = 1
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                r16 = 8
                java.lang.Integer r9 = java.lang.Integer.valueOf(r16)
                r8.mo10233c(r9)
                java.lang.Object[] r23 = r8.mo10232b()
                java.lang.String r24 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditKeyboardController"
                java.lang.String r25 = "updateKeyboardViewBehaviorForType"
                java.lang.String r26 = "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditViewContract$CharViewType;)V"
                java.lang.String r27 = "android/view/View_EXEC_"
                java.lang.String r28 = "setVisibility"
                java.lang.String r29 = "(I)V"
                r22 = r7
                j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
                r12 = 0
                java.lang.Object r8 = r8.mo10231a(r12)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r7.setVisibility(r8)
                java.lang.String r8 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditKeyboardController"
                java.lang.String r9 = "updateKeyboardViewBehaviorForType"
                java.lang.String r10 = "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditViewContract$CharViewType;)V"
                java.lang.String r11 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r19 = 0
                r12 = r17
                r17 = 2
                r13 = r18
                j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            L_0x028f:
                int r6 = r6 + 1
                goto L_0x01f4
            L_0x0293:
                r15 = 1
                r16 = 8
                r17 = 2
                r19 = 0
                int r14 = r14 + 1
                goto L_0x01e5
            L_0x029e:
                r16 = 8
                r19 = 0
                android.util.SparseArray<android.view.ViewGroup> r0 = r2.f234020d
                int r0 = r0.size()
                r14 = 0
            L_0x02a9:
                if (r14 >= r0) goto L_0x02c3
                android.util.SparseArray<android.view.ViewGroup> r1 = r2.f234020d
                java.lang.Object r1 = r1.valueAt(r14)
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                boolean r3 = gy3.C87412m.m108589b(r4, r1)
                if (r3 == 0) goto L_0x02bb
                r3 = 0
                goto L_0x02bd
            L_0x02bb:
                r3 = 8
            L_0x02bd:
                r1.setVisibility(r3)
                int r14 = r14 + 1
                goto L_0x02a9
            L_0x02c3:
                return
            L_0x02c4:
                java.lang.String r0 = "keyboardController"
                gy3.C87412m.m108603p(r0)
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateEditUI.C85118d.mo110037b(bz0.o$b):void");
        }
    }

    /* renamed from: H7 */
    public final boolean mo118122H7() {
        String str = this.f248005h;
        return !(str == null || str.length() == 0);
    }

    public void finish() {
        super.finish();
        if (mo118122H7()) {
            overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
        } else {
            overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6678lj;
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        C87687a.m109086b(this, 10);
        C87687a.m109086b(this, 1);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(3);
        }
        Intent intent = getIntent();
        this.f248005h = intent != null ? intent.getStringExtra("INTENT_KEY_DEFAULT_PLATE_TEXT") : null;
        if (mo118122H7()) {
            overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        } else {
            overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
        }
    }

    public void onPostCreate(Bundle bundle) {
        TextView textView;
        super.onPostCreate(bundle);
        getController().mo177105z0(C111105a.m151500b(this, C0966R.color.al6));
        getController().mo177103x0(C111105a.m151500b(this, C0966R.color.BW_97));
        getContentView().setBackgroundColor(C111105a.m151500b(this, C0966R.color.al6));
        View findViewById = getContentView().findViewById(C0966R.C0970id.ald);
        int i = 8;
        int i2 = mo118122H7() ? 8 : 0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new C85115a(this));
        View findViewById2 = getContentView().findViewById(C0966R.C0970id.al_);
        int i3 = mo118122H7() ? 0 : 8;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i3));
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditUI", "onPostCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setOnClickListener(new C85116b(this));
        View findViewById3 = getContentView().findViewById(C0966R.C0970id.alq);
        C87412m.m108593f(findViewById3, "this");
        this.f248004g = findViewById3;
        findViewById3.setEnabled(false);
        findViewById3.setOnClickListener(new C85117c(this));
        C79866k kVar = new C79866k();
        View findViewById4 = getContentView().findViewById(C0966R.C0970id.ar_);
        C87412m.m108592e(findViewById4, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById4;
        kVar.f234018b = relativeLayout;
        Context context = relativeLayout.getContext();
        C87412m.m108593f(context, "containerLayout.context");
        kVar.f234017a = context;
        this.f248003f = kVar;
        LinearLayout linearLayout = (LinearLayout) getContentView().findViewById(C0966R.C0970id.fkk);
        C87412m.m108593f(linearLayout, "this");
        C79856a aVar3 = new C79856a(this, linearLayout);
        this.f248002e = aVar3;
        C79866k kVar2 = this.f248003f;
        if (kVar2 != null) {
            kVar2.f234019c = aVar3;
            aVar3.f234004c = new C85118d(this);
            String str = this.f248005h;
            if (str == null) {
                str = "";
            }
            C85978w1 w1Var = new C85978w1(aVar3.f234002a, C0966R.style.f8369fz);
            aVar3.f234007f = new TextView[8];
            int i4 = 0;
            while (i4 < i) {
                C79873o.C79875b a = C79873o.C79875b.f234031d.mo110051a(i4);
                int ordinal = a.ordinal();
                if (ordinal == 0) {
                    textView = (TextView) aVar3.f234003b.findViewById(C0966R.C0970id.azm);
                } else if (ordinal != 1) {
                    textView = new TextView(w1Var);
                    aVar3.f234003b.addView(textView, new ViewGroup.LayoutParams(w1Var.getResources().getDimensionPixelSize(C0966R.dimen.f3753d4), w1Var.getResources().getDimensionPixelSize(C0966R.dimen.f3755d6)));
                } else {
                    textView = (TextView) aVar3.f234003b.findViewById(C0966R.C0970id.azl);
                }
                textView.setSpannableFactory(new C79858b());
                C86159b.m106673a(textView, new C79859c());
                CharSequence b = a.mo110049b();
                C87412m.m108594g(b, "range");
                C86159b.m106673a(textView, new C45226a(b));
                textView.setEditableFactory(Editable.Factory.getInstance());
                Character valueOf = (i4 < 0 || i4 > C112550d0.m153765A(str)) ? null : Character.valueOf(str.charAt(i4));
                String ch = valueOf != null ? valueOf.toString() : null;
                if (ch == null) {
                    ch = "";
                }
                textView.setText(ch, TextView.BufferType.EDITABLE);
                textView.addTextChangedListener(new C79860d(aVar3));
                TextView[] textViewArr = aVar3.f234007f;
                if (textViewArr != null) {
                    textViewArr[i4] = textView;
                    if (i4 == 6) {
                        C86159b.m106673a(textView, new C79861e(aVar3, i4));
                        textView.addTextChangedListener(new C79862f(aVar3, i4, textView));
                    }
                    if (i4 == 7) {
                        C86159b.m106673a(textView, new C79864g(aVar3));
                    }
                    textView.setOnClickListener(new C67330h(aVar3, i4));
                    i4++;
                    i = 8;
                } else {
                    C87412m.m108603p("charViews");
                    throw null;
                }
            }
            if (str.length() == 0) {
                aVar3.mo110035c(0);
            } else {
                aVar3.mo110035c(C16095a.m14980b(str.length() - 1, 0, 7));
                C79856a.C79857a aVar4 = aVar3.f234004c;
                if (aVar4 != null) {
                    aVar4.mo110036a(str, false);
                }
            }
            CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1 carLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1 = new CarLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1(linearLayout, this);
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(carLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1);
            getLifecycle().addObserver(carLicensePlateEditUI$onPostCreate$5$reactiveSizeHelper$1);
            C91946a aVar5 = C91946a.f263217a;
            aVar5.getClass();
            ((TextView) getContentView().findViewById(C0966R.C0970id.kxr)).setText((String) C91946a.f263221e.mo124238b(aVar5, C91946a.f263218b[2]));
            return;
        }
        C87412m.m108603p("keyboardController");
        throw null;
    }
}
