package is2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2", mo125469f = "SnsImageLoader.kt", mo125470l = {81}, mo125471m = "invokeSuspend")
/* renamed from: is2.b */
public final class C98786b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public int f289619d;

    /* renamed from: e */
    public final /* synthetic */ String f289620e;

    /* renamed from: f */
    public final /* synthetic */ String f289621f;

    /* renamed from: g */
    public final /* synthetic */ boolean f289622g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98786b(String str, String str2, boolean z, C15601d<? super C98786b> dVar) {
        super(2, dVar);
        this.f289620e = str;
        this.f289621f = str2;
        this.f289622g = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        C98786b bVar = new C98786b(this.f289620e, this.f289621f, this.f289622g, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        Object invokeSuspend = ((C98786b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2");
        return invokeSuspend;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r0 = "invokeSuspend"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion$getImagePath$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r14.f289619d
            java.lang.String r4 = " mediaId:"
            java.lang.String r5 = "getImagePath snsId:"
            r6 = 1
            java.lang.String r7 = "MicroMsg.SnsImageLoader"
            r8 = 0
            if (r3 == 0) goto L_0x0028
            if (r3 != r6) goto L_0x001d
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00f6
        L_0x001d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r15
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.String r15 = r14.f289620e
            java.lang.String r3 = r14.f289621f
            java.lang.String r9 = "getMedia"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.withta.SnsImageLoader$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            java.lang.String r11 = "snsId"
            gy3.C87412m.m108594g(r15, r11)
            java.lang.String r11 = "mediaId"
            gy3.C87412m.m108594g(r3, r11)
            os2.e0 r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r11.mo139807TE(r15)
            if (r11 != 0) goto L_0x0065
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "Couldn't find SnsInfo, snsId="
            r3.append(r11)
            r3.append(r15)
            java.lang.String r15 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
        L_0x0063:
            r12 = r8
            goto L_0x00b7
        L_0x0065:
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r11.getTimeLine()
            if (r11 == 0) goto L_0x0091
            te3.j00 r11 = r11.ContentObj
            if (r11 == 0) goto L_0x0091
            java.util.LinkedList<te3.kv2> r11 = r11.f298427h
            if (r11 == 0) goto L_0x0091
            java.util.Iterator r11 = r11.iterator()
        L_0x0077:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x008d
            java.lang.Object r12 = r11.next()
            r13 = r12
            te3.kv2 r13 = (te3.C101804kv2) r13
            java.lang.String r13 = r13.f298689d
            boolean r13 = gy3.C87412m.m108589b(r13, r3)
            if (r13 == 0) goto L_0x0077
            goto L_0x008e
        L_0x008d:
            r12 = r8
        L_0x008e:
            te3.kv2 r12 = (te3.C101804kv2) r12
            goto L_0x0092
        L_0x0091:
            r12 = r8
        L_0x0092:
            if (r12 != 0) goto L_0x00b4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Couldn't find media, snsId="
            r11.append(r12)
            r11.append(r15)
            java.lang.String r15 = ", mediaId="
            r11.append(r15)
            r11.append(r3)
            java.lang.String r15 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            goto L_0x0063
        L_0x00b4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
        L_0x00b7:
            if (r12 != 0) goto L_0x00d9
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r5)
            java.lang.String r2 = r14.f289620e
            r15.append(r2)
            r15.append(r4)
            java.lang.String r2 = r14.f289621f
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        L_0x00d9:
            boolean r15 = r14.f289622g
            r14.f289619d = r6
            java.lang.String r3 = "getImagePathFromMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r10)
            a14.h0 r6 = a14.C53872d1.f151119c
            is2.c r9 = new is2.c
            r9.<init>(r15, r12, r8)
            java.lang.Object r15 = a14.C53895h.m60469g(r6, r9, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r10)
            if (r15 != r2) goto L_0x00f6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x00f6:
            java.lang.String r15 = (java.lang.String) r15
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
            if (r2 == 0) goto L_0x0102
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r15
        L_0x0102:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r5)
            java.lang.String r2 = r14.f289620e
            r15.append(r2)
            r15.append(r4)
            java.lang.String r2 = r14.f289621f
            r15.append(r2)
            java.lang.String r2 = " requestThumb:"
            r15.append(r2)
            boolean r2 = r14.f289622g
            r15.append(r2)
            java.lang.String r2 = " path is null"
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: is2.C98786b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
