package xk1;

import android.text.TextWatcher;

/* renamed from: xk1.a1 */
public final class C66289a1 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C66352v0 f190831d;

    public C66289a1(C66352v0 v0Var) {
        this.f190831d = v0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r15 = r15.getText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r15) {
        /*
            r14 = this;
            xk1.v0 r15 = r14.f190831d
            android.widget.EditText r15 = r15.f190998j
            r0 = 0
            if (r15 == 0) goto L_0x0012
            android.text.Editable r15 = r15.getText()
            if (r15 == 0) goto L_0x0012
            java.lang.String r15 = r15.toString()
            goto L_0x0013
        L_0x0012:
            r15 = r0
        L_0x0013:
            r1 = 0
            r2 = 1
            if (r15 == 0) goto L_0x0020
            int r3 = r15.length()
            if (r3 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = 0
            goto L_0x0021
        L_0x0020:
            r3 = 1
        L_0x0021:
            if (r3 == 0) goto L_0x00e0
            xk1.v0 r3 = r14.f190831d
            android.view.View r3 = r3.f190997i
            r12 = 8
            if (r3 != 0) goto L_0x002c
            goto L_0x006d
        L_0x002c:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r13.mo10233c(r4)
            java.lang.Object[] r5 = r13.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$6"
            java.lang.String r7 = "afterTextChanged"
            java.lang.String r8 = "(Landroid/text/Editable;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r13.mo10231a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$6"
            java.lang.String r6 = "afterTextChanged"
            java.lang.String r7 = "(Landroid/text/Editable;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x006d:
            xk1.v0 r3 = r14.f190831d
            java.util.ArrayList<te3.ks1> r4 = r3.f191005t
            r4.clear()
            qk1.c r4 = r3.f191006u
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.getClass()
            java.util.ArrayList<sk1.b> r6 = r4.f179302d
            r6.clear()
            java.util.ArrayList<sk1.b> r6 = r4.f179302d
            r6.addAll(r5)
            r4.f179304f = r1
            qk1.c r4 = r3.f191006u
            r4.notifyDataSetChanged()
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r3.f190994f
            if (r3 == 0) goto L_0x0097
            android.view.View r0 = r3.getLoadMoreFooter()
        L_0x0097:
            if (r0 != 0) goto L_0x009a
            goto L_0x00da
        L_0x009a:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC"
            java.lang.String r6 = "clearSearchList"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r11.mo10231a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC"
            java.lang.String r5 = "clearSearchList"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x00da:
            xk1.v0 r0 = r14.f190831d
            xk1.C66352v0.m78264c3(r0, r2)
            goto L_0x012d
        L_0x00e0:
            xk1.v0 r0 = r14.f190831d
            android.view.View r0 = r0.f190997i
            if (r0 != 0) goto L_0x00e7
            goto L_0x0128
        L_0x00e7:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$6"
            java.lang.String r5 = "afterTextChanged"
            java.lang.String r6 = "(Landroid/text/Editable;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC$initView$6"
            java.lang.String r4 = "afterTextChanged"
            java.lang.String r5 = "(Landroid/text/Editable;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0128:
            xk1.v0 r0 = r14.f190831d
            xk1.C66352v0.m78264c3(r0, r1)
        L_0x012d:
            xk1.v0 r0 = r14.f190831d
            if (r15 != 0) goto L_0x0133
            java.lang.String r15 = ""
        L_0x0133:
            r0.f191002q = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66289a1.afterTextChanged(android.text.Editable):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
