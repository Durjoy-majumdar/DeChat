package ou2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import gy3.C59741c0;
import os2.C62176t;
import os2.C62179t0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {196}, mo125471m = "invokeSuspend")
/* renamed from: ou2.o */
public final class C100541o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f294574d;

    /* renamed from: e */
    public int f294575e;

    /* renamed from: f */
    public int f294576f;

    /* renamed from: g */
    public float f294577g;

    /* renamed from: h */
    public int f294578h;

    /* renamed from: i */
    public final /* synthetic */ C100511m f294579i;

    /* renamed from: j */
    public final /* synthetic */ C62179t0 f294580j;

    /* renamed from: n */
    public final /* synthetic */ C62176t f294581n;

    /* renamed from: o */
    public final /* synthetic */ C59741c0 f294582o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100541o(C100511m mVar, C62179t0 t0Var, C62176t tVar, C59741c0 c0Var, C15601d<? super C100541o> dVar) {
        super(2, dVar);
        this.f294579i = mVar;
        this.f294580j = t0Var;
        this.f294581n = tVar;
        this.f294582o = c0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        C100541o oVar = new C100541o(this.f294579i, this.f294580j, this.f294581n, this.f294582o, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        return oVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        Object invokeSuspend = ((C100541o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1");
        return invokeSuspend;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        r14 = r14.mo87231a();
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$startWordingPlayAnim$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r13.f294578h
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002d
            if (r3 != r5) goto L_0x0022
            int r3 = r13.f294576f
            float r6 = r13.f294577g
            int r7 = r13.f294575e
            java.lang.Object r8 = r13.f294574d
            os2.t0 r8 = (os2.C62179t0) r8
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = r13
            goto L_0x0164
        L_0x0022:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r14
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r14)
            ou2.m r14 = r13.f294579i
            int r14 = ou2.C100511m.m131543m(r14)
            java.lang.String r3 = "getSTATE_BREAK"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
            java.lang.String r7 = "access$getSTATE_BREAK$cp"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            r3 = 0
            if (r14 != 0) goto L_0x0050
            os2.t0 r14 = r13.f294580j
            goto L_0x0064
        L_0x0050:
            os2.t r14 = r13.f294581n
            if (r14 == 0) goto L_0x0063
            java.util.List r14 = r14.mo87231a()
            if (r14 == 0) goto L_0x0063
            ky3.c$a r7 = ky3.C88334c.f255322d
            java.lang.Object r14 = sx3.C110818d0.m150935g0(r14, r7)
            os2.t0 r14 = (os2.C62179t0) r14
            goto L_0x0064
        L_0x0063:
            r14 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0071
            java.lang.String r7 = r14.mo87235b()
            if (r7 == 0) goto L_0x0071
            int r7 = r7.length()
            goto L_0x0072
        L_0x0071:
            r7 = 0
        L_0x0072:
            ou2.m r8 = r13.f294579i
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r8 = ou2.C100511m.m131545o(r8)
            if (r8 == 0) goto L_0x0096
            r9 = 14
            android.content.Context r10 = r8.getContext()
            java.lang.String r11 = "dp2Pix"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r6)
            float r10 = kg3.C76577a.m92156g(r10)
            float r9 = (float) r9
            float r10 = r10 * r9
            int r9 = java.lang.Math.round(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r6)
            androidx.core.widget.C103733h.m138105b(r8, r5, r9, r5, r4)
        L_0x0096:
            r6 = 2131313761(0x7f094461, float:1.8245928E38)
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM"
            java.lang.String r9 = ""
            if (r14 != 0) goto L_0x00cb
            ou2.m r14 = r13.f294579i
            android.widget.ImageView r14 = ou2.C100511m.m131544n(r14)
            if (r14 == 0) goto L_0x00aa
            r14.setImageDrawable(r3)
        L_0x00aa:
            ou2.m r14 = r13.f294579i
            android.widget.ImageView r14 = ou2.C100511m.m131544n(r14)
            sg.g<java.lang.String, android.graphics.Bitmap> r2 = rq2.C63489a.f180085a
            java.lang.String r2 = "resetLoadImage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r8)
            r14.setTag(r6, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r8)
            ou2.m r14 = r13.f294579i
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r14 = ou2.C100511m.m131545o(r14)
            if (r14 == 0) goto L_0x0166
            r14.setText(r9)
            goto L_0x0166
        L_0x00cb:
            java.lang.String r3 = r14.mo87234a()
            if (r3 != 0) goto L_0x00d2
            r3 = r9
        L_0x00d2:
            ou2.m r10 = r13.f294579i
            android.widget.ImageView r10 = ou2.C100511m.m131544n(r10)
            sg.g<java.lang.String, android.graphics.Bitmap> r11 = rq2.C63489a.f180085a
            java.lang.String r11 = "checkLoadImageNotSetNull"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r8)
            boolean r12 = android.text.TextUtils.isEmpty(r3)
            if (r12 == 0) goto L_0x00e9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r8)
            goto L_0x00fb
        L_0x00e9:
            java.lang.Object r6 = r10.getTag(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x00f8
            rq2.C63489a.m74830e(r3, r10)
        L_0x00f8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r8)
        L_0x00fb:
            if (r7 != 0) goto L_0x0109
            ou2.m r14 = r13.f294579i
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r14 = ou2.C100511m.m131545o(r14)
            if (r14 == 0) goto L_0x0166
            r14.setText(r9)
            goto L_0x0166
        L_0x0109:
            java.lang.String r3 = "getAnimationDuration"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.TagInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
            float r8 = r14.f176785c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0126
            gy3.c0 r8 = r13.f294582o
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
            float r9 = r14.f176785c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            r8.f170634d = r9
        L_0x0126:
            gy3.c0 r3 = r13.f294582o
            float r3 = r3.f170634d
            int r6 = r7 + 1
            float r6 = (float) r6
            float r3 = r3 / r6
            java.lang.String r6 = r14.mo87235b()
            if (r6 == 0) goto L_0x0166
            r8 = r14
            r6 = r3
            r3 = 0
            r14 = r13
        L_0x0138:
            if (r3 >= r7) goto L_0x0166
            ou2.m r9 = r14.f294579i
            com.tencent.mm.plugin.sns.ad.widget.appcompat.AdAppCompatTextView r9 = ou2.C100511m.m131545o(r9)
            if (r9 == 0) goto L_0x014f
            java.lang.String r10 = r8.mo87235b()
            int r11 = r3 + 1
            java.lang.CharSequence r10 = r10.subSequence(r4, r11)
            r9.setText(r10)
        L_0x014f:
            long r9 = (long) r6
            r14.f294574d = r8
            r14.f294575e = r7
            r14.f294577g = r6
            r14.f294576f = r3
            r14.f294578h = r5
            java.lang.Object r9 = a14.C53965x0.m60607b(r9, r14)
            if (r9 != r2) goto L_0x0164
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0164:
            int r3 = r3 + r5
            goto L_0x0138
        L_0x0166:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100541o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
