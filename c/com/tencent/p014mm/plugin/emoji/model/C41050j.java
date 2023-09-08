package com.tencent.p014mm.plugin.emoji.model;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.emoji.model.EmojiGroupRemove$start$1", mo125469f = "EmojiGroupRemove.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.emoji.model.j */
public final class C41050j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f110528d;

    /* renamed from: e */
    public Object f110529e;

    /* renamed from: f */
    public int f110530f;

    /* renamed from: g */
    public final /* synthetic */ C41045h f110531g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41050j(C41045h hVar, C15601d<? super C41050j> dVar) {
        super(2, dVar);
        this.f110531g = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C41050j(this.f110531g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C41050j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f A[Catch:{ Exception -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068 A[Catch:{ Exception -> 0x006c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f110530f
            r2 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            java.lang.Object r1 = r9.f110529e
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r9.f110528d
            com.tencent.mm.plugin.emoji.model.h r3 = (com.tencent.p014mm.plugin.emoji.model.C41045h) r3
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ Exception -> 0x006c }
            goto L_0x0049
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001d:
            kotlin.ResultKt.throwOnFailure(r10)
            com.tencent.mm.plugin.emoji.model.h r10 = r9.f110531g     // Catch:{ Exception -> 0x006c }
            android.content.Context r3 = r10.f110513a     // Catch:{ Exception -> 0x006c }
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r4 = r3.getString(r1)     // Catch:{ Exception -> 0x006c }
            android.content.Context r1 = r10.f110513a     // Catch:{ Exception -> 0x006c }
            r5 = 2131821714(0x7f110492, float:1.9276179E38)
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x006c }
            com.tencent.mm.plugin.emoji.model.i r8 = new com.tencent.mm.plugin.emoji.model.i     // Catch:{ Exception -> 0x006c }
            r8.<init>(r10)     // Catch:{ Exception -> 0x006c }
            r6 = 1
            r7 = 1
            qo3.i0 r1 = nj3.C76879j.m92723Q(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x006c }
            r10.f110517e = r1     // Catch:{ Exception -> 0x006c }
            com.tencent.mm.plugin.emoji.model.h r3 = r9.f110531g     // Catch:{ Exception -> 0x006c }
            java.util.List<java.lang.String> r10 = r3.f110514b     // Catch:{ Exception -> 0x006c }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ Exception -> 0x006c }
        L_0x0049:
            boolean r10 = r1.hasNext()     // Catch:{ Exception -> 0x006c }
            if (r10 == 0) goto L_0x0062
            java.lang.Object r10 = r1.next()     // Catch:{ Exception -> 0x006c }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x006c }
            r9.f110528d = r3     // Catch:{ Exception -> 0x006c }
            r9.f110529e = r1     // Catch:{ Exception -> 0x006c }
            r9.f110530f = r2     // Catch:{ Exception -> 0x006c }
            java.lang.Object r10 = r3.mo64087a(r10, r9)     // Catch:{ Exception -> 0x006c }
            if (r10 != r0) goto L_0x0049
            return r0
        L_0x0062:
            com.tencent.mm.plugin.emoji.model.h r10 = r9.f110531g     // Catch:{ Exception -> 0x006c }
            qo3.i0 r10 = r10.f110517e     // Catch:{ Exception -> 0x006c }
            if (r10 == 0) goto L_0x0075
            r10.dismiss()     // Catch:{ Exception -> 0x006c }
            goto L_0x0075
        L_0x006c:
            com.tencent.mm.plugin.emoji.model.h r10 = r9.f110531g
            qo3.i0 r10 = r10.f110517e
            if (r10 == 0) goto L_0x0075
            r10.dismiss()
        L_0x0075:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.model.C41050j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
