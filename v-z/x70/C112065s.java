package x70;

import android.os.Bundle;
import d14.C58056k1;
import d14.C58087u0;
import i80.C108399b;
import rx3.C13604l;
import v70.C111387b;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: x70.s */
public abstract class C112065s extends C112069u {

    /* renamed from: s */
    public final C58087u0<C13604l<C108399b, Bundle>> f335482s = C58056k1.m67214a(new C13604l(C108399b.Uninitialized, new Bundle()));

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitOperate", mo125469f = "CameraKitOperate.kt", mo125470l = {68}, mo125471m = "takePicture$suspendImpl")
    /* renamed from: x70.s$a */
    public static final class C112066a extends C66704d {

        /* renamed from: d */
        public Object f335483d;

        /* renamed from: e */
        public long f335484e;

        /* renamed from: f */
        public /* synthetic */ Object f335485f;

        /* renamed from: g */
        public final /* synthetic */ C112065s f335486g;

        /* renamed from: h */
        public int f335487h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112066a(C112065s sVar, C15601d<? super C112066a> dVar) {
            super(dVar);
            this.f335486g = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f335485f = obj;
            this.f335487h |= Integer.MIN_VALUE;
            return C112065s.m152793t(this.f335486g, 0, 0, 0, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitOperate", mo125469f = "CameraKitOperate.kt", mo125470l = {76}, mo125471m = "takePicture$suspendImpl")
    /* renamed from: x70.s$b */
    public static final class C112067b extends C66704d {

        /* renamed from: d */
        public Object f335488d;

        /* renamed from: e */
        public Object f335489e;

        /* renamed from: f */
        public /* synthetic */ Object f335490f;

        /* renamed from: g */
        public final /* synthetic */ C112065s f335491g;

        /* renamed from: h */
        public int f335492h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112067b(C112065s sVar, C15601d<? super C112067b> dVar) {
            super(dVar);
            this.f335491g = sVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f335490f = obj;
            this.f335492h |= Integer.MIN_VALUE;
            return C112065s.m152792s(this.f335491g, 0, 0, 0, (String) null, false, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m152791r(x70.C112065s r5, wx3.C15601d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof x70.C112054h
            if (r0 == 0) goto L_0x0016
            r0 = r6
            x70.h r0 = (x70.C112054h) r0
            int r1 = r0.f335462f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f335462f = r1
            goto L_0x001b
        L_0x0016:
            x70.h r0 = new x70.h
            r0.<init>(r5, r6)
        L_0x001b:
            java.lang.Object r6 = r0.f335460d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f335462f
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0066
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            x70.d r6 = (x70.C112043d) r6
            a80.c r6 = r6.f335420e
            if (r6 == 0) goto L_0x0041
            e80.c r6 = r6.mo143116v()
            goto L_0x0042
        L_0x0041:
            r6 = 0
        L_0x0042:
            if (r6 == 0) goto L_0x0066
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            boolean r6 = r6.f320908c
            r6 = r6 ^ r3
            java.lang.String r4 = "camera_boolean"
            r2.putBoolean(r4, r6)
            d14.u0<rx3.l<i80.b, android.os.Bundle>> r5 = r5.f335482s
            rx3.l r6 = new rx3.l
            i80.b r4 = i80.C108399b.SwitchCamera
            r6.<init>(r4, r2)
            r0.f335462f = r3
            d14.j1 r5 = (d14.C58052j1) r5
            r5.setValue(r6)
            rx3.b0 r5 = rx3.C13598b0.f38549a
            if (r5 != r1) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x70.C112065s.m152791r(x70.s, wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m152792s(x70.C112065s r8, int r9, int r10, int r11, java.lang.String r12, boolean r13, wx3.C15601d r14) {
        /*
            boolean r0 = r14 instanceof x70.C112065s.C112067b
            if (r0 == 0) goto L_0x0013
            r0 = r14
            x70.s$b r0 = (x70.C112065s.C112067b) r0
            int r1 = r0.f335492h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335492h = r1
            goto L_0x0018
        L_0x0013:
            x70.s$b r0 = new x70.s$b
            r0.<init>(r8, r14)
        L_0x0018:
            r6 = r0
            java.lang.Object r14 = r6.f335490f
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f335492h
            r7 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r7) goto L_0x0031
            java.lang.Object r8 = r6.f335489e
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r8 = r6.f335488d
            x70.s r8 = (x70.C112065s) r8
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0051
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r14)
            r6.f335488d = r8
            r6.f335489e = r12
            r6.f335492h = r7
            r8.getClass()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r13
            java.lang.Object r14 = m152793t(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L_0x0051
            return r0
        L_0x0051:
            rx3.l r14 = (rx3.C13604l) r14
            A r9 = r14.f38555d
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L_0x008f
            B r9 = r14.f38556e
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            r10 = 100
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r9, r10, r11, r12, r7)
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "takePicture size:"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MicroMsg.Camera.CameraKit"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            h80.a r11 = h80.C108171a.f323903a
            int r8 = r8.f335419d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r8 = r11.mo158577a(r8)
            if (r8 == 0) goto L_0x008f
            int r10 = (int) r9
            r8.f310058A = r10
        L_0x008f:
            A r8 = r14.f38555d
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x70.C112065s.m152792s(x70.s, int, int, int, java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m152793t(x70.C112065s r9, int r10, int r11, int r12, boolean r13, wx3.C15601d r14) {
        /*
            boolean r0 = r14 instanceof x70.C112065s.C112066a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            x70.s$a r0 = (x70.C112065s.C112066a) r0
            int r1 = r0.f335487h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335487h = r1
            goto L_0x0018
        L_0x0013:
            x70.s$a r0 = new x70.s$a
            r0.<init>(r9, r14)
        L_0x0018:
            r6 = r0
            java.lang.Object r14 = r6.f335485f
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f335487h
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            long r9 = r6.f335484e
            java.lang.Object r11 = r6.f335483d
            x70.s r11 = (x70.C112065s) r11
            kotlin.ResultKt.throwOnFailure(r14)
            r7 = r9
            r9 = r11
            goto L_0x0061
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r14)
            a80.c r1 = r9.f335420e
            if (r1 != 0) goto L_0x004c
            rx3.l r9 = new rx3.l
            r10 = -2
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            r10 = 0
            r9.<init>(r11, r10)
            return r9
        L_0x004c:
            long r7 = java.lang.System.currentTimeMillis()
            r6.f335483d = r9
            r6.f335484e = r7
            r6.f335487h = r2
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.mo143114s(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L_0x0061
            return r0
        L_0x0061:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            h80.a r10 = h80.C108171a.f323903a
            int r11 = r9.f335419d
            r12 = 0
            if (r14 == 0) goto L_0x006f
            int r13 = r14.getWidth()
            goto L_0x0070
        L_0x006f:
            r13 = 0
        L_0x0070:
            if (r14 == 0) goto L_0x0077
            int r0 = r14.getHeight()
            goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r11 = r10.mo158577a(r11)
            if (r11 == 0) goto L_0x0082
            r11.f310059B = r13
            r11.f310060C = r0
        L_0x0082:
            int r9 = r9.f335419d
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r7
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r9 = r10.mo158577a(r9)
            if (r9 == 0) goto L_0x0091
            r9.f310102u = r0
        L_0x0091:
            if (r14 != 0) goto L_0x0094
            r12 = -1
        L_0x0094:
            rx3.l r9 = new rx3.l
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r12)
            r9.<init>(r10, r14)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x70.C112065s.m152793t(x70.s, int, int, int, boolean, wx3.d):java.lang.Object");
    }

    public void setCustomRender(C111387b bVar) {
        mo163767p().setCustomRender(bVar);
    }
}
