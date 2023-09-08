package uf1;

import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32227p;
import rx3.C13598b0;
import tf1.C13914m;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: uf1.d */
public class C65345d<T extends C13914m> {

    /* renamed from: a */
    public C32227p<? super IResponse<T>, ? super C15601d<? super C13598b0>, ? extends Object> f188102a;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.model.loader.Task", mo125469f = "Task.kt", mo125470l = {16, 18}, mo125471m = "start")
    /* renamed from: uf1.d$a */
    public static final class C65346a extends C66704d {

        /* renamed from: d */
        public Object f188103d;

        /* renamed from: e */
        public /* synthetic */ Object f188104e;

        /* renamed from: f */
        public final /* synthetic */ C65345d<T> f188105f;

        /* renamed from: g */
        public int f188106g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65346a(C65345d<T> dVar, C15601d<? super C65346a> dVar2) {
            super(dVar2);
            this.f188105f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f188104e = obj;
            this.f188106g |= Integer.MIN_VALUE;
            return this.f188105f.mo89454b(this);
        }
    }

    /* renamed from: a */
    public Object mo89453a(C15601d<? super IResponse<T>> dVar) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89454b(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof uf1.C65345d.C65346a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            uf1.d$a r0 = (uf1.C65345d.C65346a) r0
            int r1 = r0.f188106g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f188106g = r1
            goto L_0x0018
        L_0x0013:
            uf1.d$a r0 = new uf1.d$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f188104e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f188106g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005d
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0032:
            java.lang.Object r2 = r0.f188103d
            uf1.d r2 = (uf1.C65345d) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0049
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f188103d = r5
            r0.f188106g = r4
            java.lang.Object r6 = r5.mo89453a(r0)
            if (r6 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r2 = r5
        L_0x0049:
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r6 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r6
            if (r6 == 0) goto L_0x005d
            fy3.p<? super com.tencent.mm.plugin.finder.feed.model.internal.IResponse<T>, ? super wx3.d<? super rx3.b0>, ? extends java.lang.Object> r2 = r2.f188102a
            if (r2 == 0) goto L_0x005d
            r4 = 0
            r0.f188103d = r4
            r0.f188106g = r3
            java.lang.Object r6 = r2.invoke(r6, r0)
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x005d:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uf1.C65345d.mo89454b(wx3.d):java.lang.Object");
    }
}
