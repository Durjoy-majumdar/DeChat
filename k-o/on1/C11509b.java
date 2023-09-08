package on1;

import cm1.C0740i2;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import java.util.List;
import on1.C11545o;
import pe3.C89349b;
import te3.C49335eu3;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: on1.b */
public abstract class C11509b<T extends C0740i2, cgiType extends C60625c<_Resp>, _Resp extends C49335eu3> implements C11545o<T> {

    /* renamed from: d */
    public C89349b f33817d;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.newloader.CgiLoaderSource", mo125469f = "CgiLoaderSource.kt", mo125470l = {24}, mo125471m = "load$suspendImpl")
    /* renamed from: on1.b$a */
    public static final class C11510a extends C66704d {

        /* renamed from: d */
        public Object f33818d;

        /* renamed from: e */
        public long f33819e;

        /* renamed from: f */
        public /* synthetic */ Object f33820f;

        /* renamed from: g */
        public final /* synthetic */ C11509b<T, cgiType, _Resp> f33821g;

        /* renamed from: h */
        public int f33822h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11510a(C11509b<T, cgiType, _Resp> bVar, C15601d<? super C11510a> dVar) {
            super(dVar);
            this.f33821g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f33820f = obj;
            this.f33822h |= Integer.MIN_VALUE;
            return C11509b.m11331g(this.f33821g, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m11331g(on1.C11509b r11, wx3.C15601d r12) {
        /*
            boolean r0 = r12 instanceof on1.C11509b.C11510a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            on1.b$a r0 = (on1.C11509b.C11510a) r0
            int r1 = r0.f33822h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f33822h = r1
            goto L_0x0018
        L_0x0013:
            on1.b$a r0 = new on1.b$a
            r0.<init>(r11, r12)
        L_0x0018:
            r5 = r0
            java.lang.Object r12 = r5.f33820f
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f33822h
            r2 = 1
            java.lang.String r8 = "Finder.CgiLoaderSource"
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            long r0 = r5.f33819e
            java.lang.Object r11 = r5.f33818d
            on1.b r11 = (on1.C11509b) r11
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ d -> 0x0030 }
            goto L_0x006e
        L_0x0030:
            r12 = move-exception
            goto L_0x0096
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ d -> 0x0030 }
            r12.<init>()     // Catch:{ d -> 0x0030 }
            java.lang.String r1 = "load begin "
            r12.append(r1)     // Catch:{ d -> 0x0030 }
            r12.append(r11)     // Catch:{ d -> 0x0030 }
            java.lang.String r12 = r12.toString()     // Catch:{ d -> 0x0030 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)     // Catch:{ d -> 0x0030 }
            long r9 = eb0.C31543z5.m39451a()     // Catch:{ d -> 0x0030 }
            it1.c r1 = r11.mo11473h()     // Catch:{ d -> 0x0030 }
            r3 = 0
            r12 = 0
            r6 = 3
            r7 = 0
            r5.f33818d = r11     // Catch:{ d -> 0x0030 }
            r5.f33819e = r9     // Catch:{ d -> 0x0030 }
            r5.f33822h = r2     // Catch:{ d -> 0x0030 }
            r2 = r3
            r4 = r12
            java.lang.Object r12 = q40.C89456b.m111831a(r1, r2, r4, r5, r6, r7)     // Catch:{ d -> 0x0030 }
            if (r12 != r0) goto L_0x006d
            return r0
        L_0x006d:
            r0 = r9
        L_0x006e:
            te3.eu3 r12 = (te3.C49335eu3) r12     // Catch:{ d -> 0x0030 }
            long r2 = eb0.C31543z5.m39451a()     // Catch:{ d -> 0x0030 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ d -> 0x0030 }
            r4.<init>()     // Catch:{ d -> 0x0030 }
            java.lang.String r5 = "load end "
            r4.append(r5)     // Catch:{ d -> 0x0030 }
            r4.append(r11)     // Catch:{ d -> 0x0030 }
            java.lang.String r5 = ": "
            r4.append(r5)     // Catch:{ d -> 0x0030 }
            long r2 = r2 - r0
            r4.append(r2)     // Catch:{ d -> 0x0030 }
            java.lang.String r0 = r4.toString()     // Catch:{ d -> 0x0030 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ d -> 0x0030 }
            on1.a r11 = r11.mo11472e(r12)     // Catch:{ d -> 0x0030 }
            goto L_0x00d0
        L_0x0096:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "errType="
            r0.append(r1)
            int r1 = r12.f35057e
            r0.append(r1)
            java.lang.String r1 = " errCode="
            r0.append(r1)
            int r1 = r12.f35058f
            r0.append(r1)
            java.lang.String r1 = " fail:"
            r0.append(r1)
            java.lang.String r1 = r12.getLocalizedMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            int r0 = r12.f35057e
            int r1 = r12.f35058f
            java.lang.String r12 = r12.f35059g
            if (r12 != 0) goto L_0x00cc
            java.lang.String r12 = ""
        L_0x00cc:
            on1.a r11 = r11.mo11471d(r0, r1, r12)
        L_0x00d0:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: on1.C11509b.m11331g(on1.b, wx3.d):java.lang.Object");
    }

    /* renamed from: a */
    public void mo10079a() {
    }

    /* renamed from: b */
    public void mo10080b(Object obj) {
        C87412m.m108594g((C11575y) obj, "value");
    }

    /* renamed from: c */
    public Object mo11470c(C15601d<? super C11575y<T>> dVar) {
        return m11331g(this, dVar);
    }

    /* renamed from: d */
    public C11507a<T> mo11471d(int i, int i2, String str) {
        C87412m.m108594g(str, OpenSDKTool4Assistant.EXTRA_ERROR_MSG);
        C11507a aVar = new C11507a((List) null, false, (C89349b) null, false, 15, (C8480h) null);
        aVar.f33809g = i2;
        aVar.f33808f = i;
        aVar.f33810h = str;
        return aVar;
    }

    /* renamed from: e */
    public abstract C11507a<T> mo11472e(_Resp _resp);

    /* renamed from: f */
    public Object mo10083f(C15601d<? super C11575y<T>> dVar) {
        return mo11470c(dVar);
    }

    /* renamed from: h */
    public abstract cgiType mo11473h();

    public C11545o.C11546a getKey() {
        return new C11545o.C11546a("");
    }
}
