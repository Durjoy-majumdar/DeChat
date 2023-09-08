package com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene;

import a14.C0000n0;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;
import v23.C111379x;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout$statusChange$17$1$1", mo125469f = "TimelineEditorPlatformVideoPluginLayout.kt", mo125470l = {365}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.a */
public final class C96579a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f282712d;

    /* renamed from: e */
    public int f282713e;

    /* renamed from: f */
    public final /* synthetic */ AudioCacheInfo f282714f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<String> f282715g;

    /* renamed from: h */
    public final /* synthetic */ TimelineEditorPlatformVideoPluginLayout f282716h;

    /* renamed from: i */
    public final /* synthetic */ String f282717i;

    /* renamed from: j */
    public final /* synthetic */ Rect f282718j;

    /* renamed from: n */
    public final /* synthetic */ Rect f282719n;

    /* renamed from: o */
    public final /* synthetic */ Rect f282720o;

    /* renamed from: p */
    public final /* synthetic */ boolean f282721p;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.a$a */
    public static final class C96580a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditorPlatformVideoPluginLayout f282722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96580a(TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout) {
            super(1);
            this.f282722d = timelineEditorPlatformVideoPluginLayout;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            C111379x xVar = (C111379x) this.f282722d.mo151221j(C111379x.class);
            if (xVar != null) {
                xVar.mo163044x();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96579a(AudioCacheInfo audioCacheInfo, C8479f0<String> f0Var, TimelineEditorPlatformVideoPluginLayout timelineEditorPlatformVideoPluginLayout, String str, Rect rect, Rect rect2, Rect rect3, boolean z, C15601d<? super C96579a> dVar) {
        super(2, dVar);
        this.f282714f = audioCacheInfo;
        this.f282715g = f0Var;
        this.f282716h = timelineEditorPlatformVideoPluginLayout;
        this.f282717i = str;
        this.f282718j = rect;
        this.f282719n = rect2;
        this.f282720o = rect3;
        this.f282721p = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C96579a(this.f282714f, this.f282715g, this.f282716h, this.f282717i, this.f282718j, this.f282719n, this.f282720o, this.f282721p, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C96579a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(T r10) {
        /*
            r9 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f282713e
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r4) goto L_0x0013
            java.lang.Object r0 = r9.f282712d
            gy3.f0 r0 = (gy3.C8479f0) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x004f
        L_0x0013:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r10)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r10 = r9.f282714f
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f163830y
            if (r10 == 0) goto L_0x0080
            gy3.f0<java.lang.String> r10 = r9.f282715g
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout r1 = r9.f282716h
            java.lang.Class<j23.a> r5 = j23.C108531a.class
            lh2.g0 r1 = r1.mo151221j(r5)
            j23.a r1 = (j23.C108531a) r1
            if (r1 == 0) goto L_0x0053
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r5 = r9.f282714f
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f163830y
            gy3.C87412m.m108591d(r5)
            java.lang.String r6 = r9.f282717i
            r9.f282712d = r10
            r9.f282713e = r4
            a14.h0 r7 = a14.C53872d1.f151119c
            j23.b r8 = new j23.b
            r8.<init>(r6, r5, r1, r2)
            java.lang.Object r1 = a14.C53895h.m60469g(r7, r8, r9)
            if (r1 != r0) goto L_0x004d
            return r0
        L_0x004d:
            r0 = r10
            r10 = r1
        L_0x004f:
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            r10 = r0
        L_0x0053:
            r10.f27484d = r2
            gy3.f0<java.lang.String> r10 = r9.f282715g
            T r10 = r10.f27484d
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L_0x0065
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            if (r4 == 0) goto L_0x0080
            java.lang.String r10 = "MicroMsg.BasePluginLayout"
            java.lang.String r0 = "appendFinderMusicInfo fail, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout r10 = r9.f282716h
            java.lang.Class<v23.x> r0 = v23.C111379x.class
            lh2.g0 r10 = r10.mo151221j(r0)
            v23.x r10 = (v23.C111379x) r10
            if (r10 == 0) goto L_0x007d
            r10.mo163044x()
        L_0x007d:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x0080:
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout r10 = r9.f282716h
            java.lang.Class<v23.f> r0 = v23.C111348f.class
            lh2.g0 r10 = r10.mo151221j(r0)
            v23.f r10 = (v23.C111348f) r10
            if (r10 == 0) goto L_0x00f2
            gy3.f0<java.lang.String> r0 = r9.f282715g
            T r0 = r0.f27484d
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r1 == 0) goto L_0x00cd
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "addMusicTrack "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.TimelineEditorCorePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.timelineedit.TimelineEditor r1 = r10.f333356g
            gy3.C87412m.m108591d(r0)
            r1.getClass()
            ki3.a r2 = new ki3.a
            r2.<init>(r1, r0)
            ki3.b r0 = new ki3.b
            r0.<init>(r1)
            java.lang.Object r0 = r1.mo153351v(r2, r0)
            sp3.k r0 = (sp3.C110807k) r0
            r10.mo163025A(r0)
        L_0x00cd:
            sp3.k r2 = r10.f333357h
            if (r2 == 0) goto L_0x00f2
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorPlatformVideoPluginLayout r10 = r9.f282716h
            android.graphics.Rect r4 = r9.f282718j
            android.graphics.Rect r5 = r9.f282719n
            android.graphics.Rect r6 = r9.f282720o
            boolean r7 = r9.f282721p
            java.lang.Class<v23.q> r0 = v23.C102143q.class
            lh2.g0 r0 = r10.mo151221j(r0)
            r1 = r0
            v23.q r1 = (v23.C102143q) r1
            if (r1 == 0) goto L_0x00f2
            java.lang.String r3 = r10.getEditId()
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.a$a r8 = new com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.a$a
            r8.<init>(r10)
            r1.mo141685x(r2, r3, r4, r5, r6, r7, r8)
        L_0x00f2:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene.C96579a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
