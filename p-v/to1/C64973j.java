package to1;

import a14.C0000n0;
import android.os.Bundle;
import fy3.C32227p;
import qh2.C101198e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.record.plugin.FinderRecordControlPlugin$statusChange$1", mo125469f = "FinderRecordControlPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: to1.j */
public final class C64973j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C101198e.C101199b f187078d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f187079e;

    /* renamed from: f */
    public final /* synthetic */ C64963d f187080f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64973j(C101198e.C101199b bVar, Bundle bundle, C64963d dVar, C15601d<? super C64973j> dVar2) {
        super(2, dVar2);
        this.f187078d = bVar;
        this.f187079e = bundle;
        this.f187080f = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C64973j(this.f187078d, this.f187079e, this.f187080f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C64973j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            kotlin.ResultKt.throwOnFailure(r23)
            qh2.e$b r1 = r0.f187078d
            int r1 = r1.ordinal()
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 17
            java.lang.String r5 = "PARAM_1_BOOLEAN"
            if (r1 == r4) goto L_0x0152
            r4 = 25
            if (r1 == r4) goto L_0x001c
            goto L_0x0178
        L_0x001c:
            android.os.Bundle r1 = r0.f187079e
            if (r1 == 0) goto L_0x0178
            to1.d r4 = r0.f187080f
            lh2.o0 r6 = r4.f187058p
            boolean r7 = r1.getBoolean(r5)
            if (r7 != 0) goto L_0x003c
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r7 = r4.f187055j
            if (r7 == 0) goto L_0x0037
            java.lang.Boolean r7 = r7.f272931s
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            goto L_0x0038
        L_0x0037:
            r7 = 0
        L_0x0038:
            if (r7 == 0) goto L_0x003c
            r7 = 1
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            r6.mo160556m(r7)
            boolean r1 = r1.getBoolean(r5)
            if (r1 == 0) goto L_0x00d1
            lh2.o0 r1 = r4.f187058p
            r1.mo160555l()
            android.view.View r1 = r4.f187061s
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r13 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r3.mo10233c(r5)
            java.lang.Object[] r6 = r3.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$statusChange$1"
            java.lang.String r8 = "invokeSuspend"
            java.lang.String r9 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r3 = r3.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$statusChange$1"
            java.lang.String r7 = "invokeSuspend"
            java.lang.String r8 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            android.view.View r1 = r4.f187062t
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r3.mo10233c(r4)
            java.lang.Object[] r15 = r3.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$statusChange$1"
            java.lang.String r17 = "invokeSuspend"
            java.lang.String r18 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r2 = r3.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$statusChange$1"
            java.lang.String r16 = "invokeSuspend"
            java.lang.String r17 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0178
        L_0x00d1:
            lh2.o0 r1 = r4.f187058p
            r1.mo160554k()
            android.view.View r1 = r4.f187061s
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r13.mo10233c(r3)
            java.lang.Object[] r6 = r13.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$statusChange$1"
            java.lang.String r8 = "invokeSuspend"
            java.lang.String r9 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r13.mo10231a(r2)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$statusChange$1"
            java.lang.String r7 = "invokeSuspend"
            java.lang.String r8 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r1
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            android.view.View r1 = r4.f187062t
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r3)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$statusChange$1"
            java.lang.String r15 = "invokeSuspend"
            java.lang.String r16 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r2 = r4.mo10231a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$statusChange$1"
            java.lang.String r14 = "invokeSuspend"
            java.lang.String r15 = "(Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0178
        L_0x0152:
            android.os.Bundle r1 = r0.f187079e
            if (r1 == 0) goto L_0x015f
            boolean r1 = r1.getBoolean(r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0160
        L_0x015f:
            r1 = 0
        L_0x0160:
            if (r1 == 0) goto L_0x017b
            r1.booleanValue()
            to1.d r3 = r0.f187080f
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x016e
            r2 = 4
        L_0x016e:
            android.view.ViewGroup r1 = r3.f187054i
            r1.clearAnimation()
            android.view.ViewGroup r1 = r3.f187054i
            r1.setVisibility(r2)
        L_0x0178:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x017b:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: to1.C64973j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
