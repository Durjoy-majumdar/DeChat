package androidx.window.layout;

import android.app.Activity;
import c14.C54625h;
import d14.C45253g;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo182094d2 = {"Ld14/g;", "Landroidx/window/layout/WindowLayoutInfo;", "Lrx3/b0;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 5, 1})
@C91590f(mo125468c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", mo125469f = "WindowInfoTrackerImpl.kt", mo125470l = {54, 55}, mo125471m = "invokeSuspend")
public final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends C91594j implements C32227p<C45253g<? super WindowLayoutInfo>, C15601d<? super C13598b0>, Object> {
    public final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ WindowInfoTrackerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Activity activity, C15601d<? super WindowInfoTrackerImpl$windowLayoutInfo$1> dVar) {
        super(2, dVar);
        this.this$0 = windowInfoTrackerImpl;
        this.$activity = activity;
    }

    /* access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0  reason: not valid java name */
    public static final void m168891invokeSuspend$lambda0(C54625h hVar, WindowLayoutInfo windowLayoutInfo) {
        C87412m.m108593f(windowLayoutInfo, "info");
        hVar.mo75539t(windowLayoutInfo);
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new WindowInfoTrackerImpl$windowLayoutInfo$1(this.this$0, this.$activity, dVar);
        windowInfoTrackerImpl$windowLayoutInfo$1.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    public final Object invoke(C45253g<? super WindowLayoutInfo> gVar, C15601d<? super C13598b0> dVar) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$1) create(gVar, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079 A[Catch:{ all -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084 A[Catch:{ all -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            java.lang.Object r1 = r9.L$2
            c14.j r1 = (c14.C54628j) r1
            java.lang.Object r4 = r9.L$1
            d3.a r4 = (p329d3.C86165a) r4
            java.lang.Object r5 = r9.L$0
            d14.g r5 = (d14.C45253g) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0039 }
            r10 = r5
            r5 = r1
            goto L_0x0069
        L_0x001e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0026:
            java.lang.Object r1 = r9.L$2
            c14.j r1 = (c14.C54628j) r1
            java.lang.Object r4 = r9.L$1
            d3.a r4 = (p329d3.C86165a) r4
            java.lang.Object r5 = r9.L$0
            d14.g r5 = (d14.C45253g) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0039 }
            r6 = r5
            r5 = r1
            r1 = r9
            goto L_0x007c
        L_0x0039:
            r10 = move-exception
            goto L_0x00a9
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            d14.g r10 = (d14.C45253g) r10
            r1 = 10
            c14.g r4 = c14.C54624g.DROP_OLDEST
            r5 = 4
            r6 = 0
            c14.h r1 = c14.C54629k.m61479a(r1, r4, r6, r5, r6)
            androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$a r4 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$a
            r4.<init>(r1)
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.this$0
            androidx.window.layout.WindowBackend r5 = r5.windowBackend
            android.app.Activity r6 = r9.$activity
            x3.e$$a r7 = new x3.e$$a
            r7.<init>()
            r5.registerLayoutChangeCallback(r6, r7, r4)
            c14.a r1 = (c14.C54602a) r1     // Catch:{ all -> 0x0039 }
            c14.a$a r5 = new c14.a$a     // Catch:{ all -> 0x0039 }
            r5.<init>(r1)     // Catch:{ all -> 0x0039 }
        L_0x0069:
            r1 = r9
        L_0x006a:
            r1.L$0 = r10     // Catch:{ all -> 0x00a7 }
            r1.L$1 = r4     // Catch:{ all -> 0x00a7 }
            r1.L$2 = r5     // Catch:{ all -> 0x00a7 }
            r1.label = r3     // Catch:{ all -> 0x00a7 }
            java.lang.Object r6 = r5.mo75523a(r1)     // Catch:{ all -> 0x00a7 }
            if (r6 != r0) goto L_0x0079
            return r0
        L_0x0079:
            r8 = r6
            r6 = r10
            r10 = r8
        L_0x007c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00a7 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00a7 }
            if (r10 == 0) goto L_0x009b
            java.lang.Object r10 = r5.next()     // Catch:{ all -> 0x00a7 }
            androidx.window.layout.WindowLayoutInfo r10 = (androidx.window.layout.WindowLayoutInfo) r10     // Catch:{ all -> 0x00a7 }
            r1.L$0 = r6     // Catch:{ all -> 0x00a7 }
            r1.L$1 = r4     // Catch:{ all -> 0x00a7 }
            r1.L$2 = r5     // Catch:{ all -> 0x00a7 }
            r1.label = r2     // Catch:{ all -> 0x00a7 }
            java.lang.Object r10 = r6.emit(r10, r1)     // Catch:{ all -> 0x00a7 }
            if (r10 != r0) goto L_0x0099
            return r0
        L_0x0099:
            r10 = r6
            goto L_0x006a
        L_0x009b:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r1.this$0
            androidx.window.layout.WindowBackend r10 = r10.windowBackend
            r10.unregisterLayoutChangeCallback(r4)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x00a7:
            r10 = move-exception
            goto L_0x00aa
        L_0x00a9:
            r1 = r9
        L_0x00aa:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r1.this$0
            androidx.window.layout.WindowBackend r0 = r0.windowBackend
            r0.unregisterLayoutChangeCallback(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
