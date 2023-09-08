package c33;

import a14.C0000n0;
import android.content.Context;
import android.os.Bundle;
import b62.C92178b;
import b62.C92179c;
import b62.C92180d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import fh2.C97882i;
import fy3.C32224a;
import fy3.C32227p;
import gf3.C98108b;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import hi2.C98453h;
import kotlin.ResultKt;
import l80.C99346b;
import rx3.C13598b0;
import wh2.C102446b;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: c33.g */
public final class C92347g extends C98108b {

    /* renamed from: b */
    public C97882i.C97883a f264249b;

    /* renamed from: c */
    public C97882i f264250c;

    /* renamed from: d */
    public C98324b f264251d;

    /* renamed from: e */
    public RecordConfigProvider f264252e;

    /* renamed from: f */
    public Context f264253f;

    /* renamed from: g */
    public C102446b f264254g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.VideoCheckJumpRemuxChain", mo125469f = "VideoCheckJumpRemuxChain.kt", mo125470l = {58, 60}, mo125471m = "checkThirdPartyVideo")
    /* renamed from: c33.g$a */
    public static final class C92348a extends C66704d {

        /* renamed from: d */
        public Object f264255d;

        /* renamed from: e */
        public /* synthetic */ Object f264256e;

        /* renamed from: f */
        public final /* synthetic */ C92347g f264257f;

        /* renamed from: g */
        public int f264258g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92348a(C92347g gVar, C15601d<? super C92348a> dVar) {
            super(dVar);
            this.f264257f = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f264256e = obj;
            this.f264258g |= Integer.MIN_VALUE;
            return this.f264257f.mo126329d(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.remux.VideoCheckJumpRemuxChain$checkThirdPartyVideo$2", mo125469f = "VideoCheckJumpRemuxChain.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: c33.g$b */
    public static final class C92349b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C92347g f264259d;

        /* renamed from: c33.g$b$a */
        public static final class C92350a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C92350a f264260d = new C92350a();

            public C92350a() {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92349b(C92347g gVar, C15601d<? super C92349b> dVar) {
            super(2, dVar);
            this.f264259d = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C92349b(this.f264259d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92349b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C102446b bVar = this.f264259d.f264254g;
            if (bVar != null) {
                bVar.mo142014a();
            }
            C92347g gVar = this.f264259d;
            C102446b bVar2 = gVar.f264254g;
            if (bVar2 == null) {
                return null;
            }
            bVar2.mo142015b(gVar.f264253f, false, C0966R.string.i3k, C92350a.f264260d);
            return C13598b0.f38549a;
        }
    }

    public C92347g(C97882i.C97883a aVar, C97882i iVar, C98324b bVar, RecordConfigProvider recordConfigProvider, Context context, C102446b bVar2) {
        C87412m.m108594g(aVar, "encode");
        C87412m.m108594g(context, "context");
        this.f264249b = aVar;
        this.f264250c = iVar;
        this.f264251d = bVar;
        this.f264252e = recordConfigProvider;
        this.f264253f = context;
        this.f264254g = bVar2;
    }

    /* renamed from: c */
    public Object mo126328c(C92178b bVar, C92179c cVar, C15601d<? super MediaErrorInfo> dVar) {
        Log.m105924i("MicroMsg.VideoCheckJumpRemuxChain", "come in VideoCheckJumpRemux");
        C98453h.f288774a.mo137809g(this.f264251d);
        RecordConfigProvider recordConfigProvider = this.f264252e;
        if (recordConfigProvider != null) {
            C97882i.C97883a aVar = this.f264249b;
            boolean z = aVar.f287160j;
            if (!z && recordConfigProvider.f272918T) {
                return mo126329d(dVar);
            }
            if (!aVar.f287159i || (!z && C99346b.f291328a)) {
                C97882i iVar = this.f264250c;
                if ((iVar != null ? iVar.f287142b : null) == null) {
                    return new MediaErrorInfo(C92180d.MediaRemuxError, 2, "check jump remux", (Bundle) null, 8, (C8480h) null);
                }
            }
        }
        return new MediaErrorInfo(C92180d.MediaRemuxIgnore, 0, (String) null, (Bundle) null, 12, (C8480h) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo126329d(wx3.C15601d<? super com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo> r11) {
        /*
            r10 = this;
            b62.d r1 = b62.C92180d.MediaRemuxIgnore
            boolean r0 = r11 instanceof c33.C92347g.C92348a
            if (r0 == 0) goto L_0x0015
            r0 = r11
            c33.g$a r0 = (c33.C92347g.C92348a) r0
            int r2 = r0.f264258g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r0.f264258g = r2
            goto L_0x001a
        L_0x0015:
            c33.g$a r0 = new c33.g$a
            r0.<init>(r10, r11)
        L_0x001a:
            java.lang.Object r11 = r0.f264256e
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r0.f264258g
            java.lang.String r4 = "MicroMsg.VideoCheckJumpRemuxChain"
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 == r8) goto L_0x003d
            if (r3 != r5) goto L_0x0035
            java.lang.Object r0 = r0.f264255d
            hi2.r r0 = (hi2.C46073r) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00d8
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003d:
            java.lang.Object r3 = r0.f264255d
            c33.g r3 = (c33.C92347g) r3
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a3
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = "checkThirdPartyVideo change:"
            r11.append(r3)
            fh2.i$a r3 = r10.f264249b
            boolean r3 = r3.f287160j
            r11.append(r3)
            java.lang.String r3 = ", check:"
            r11.append(r3)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r10.f264252e
            if (r3 == 0) goto L_0x0069
            boolean r3 = r3.f272918T
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x006a
        L_0x0069:
            r3 = r7
        L_0x006a:
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            fh2.i$a r11 = r10.f264249b
            boolean r11 = r11.f287160j
            if (r11 != 0) goto L_0x0106
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r11 = r10.f264252e
            if (r11 == 0) goto L_0x0084
            boolean r11 = r11.f272918T
            if (r11 != r8) goto L_0x0084
            r11 = 1
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            if (r11 == 0) goto L_0x0106
            h90.b r11 = r10.f264251d
            if (r11 == 0) goto L_0x00f9
            java.lang.String r11 = r11.f288180a
            if (r11 != 0) goto L_0x0090
            goto L_0x00f9
        L_0x0090:
            r0.f264255d = r10
            r0.f264258g = r8
            a14.h0 r3 = a14.C53872d1.f151119c
            hi2.s r9 = new hi2.s
            r9.<init>(r11, r7)
            java.lang.Object r11 = a14.C53895h.m60469g(r3, r9, r0)
            if (r11 != r2) goto L_0x00a2
            return r2
        L_0x00a2:
            r3 = r10
        L_0x00a3:
            hi2.r r11 = (hi2.C46073r) r11
            if (r11 != 0) goto L_0x00b4
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r11 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        L_0x00b4:
            boolean r9 = r11.f124221a
            if (r9 == 0) goto L_0x0106
            java.lang.String r9 = r11.f124222b
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x00c1
            r6 = 1
        L_0x00c1:
            if (r6 == 0) goto L_0x0106
            a14.h0 r1 = a14.C53872d1.f151117a
            a14.k2 r1 = f14.C58901s.f168555a
            c33.g$b r6 = new c33.g$b
            r6.<init>(r3, r7)
            r0.f264255d = r11
            r0.f264258g = r5
            java.lang.Object r0 = a14.C53895h.m60469g(r1, r6, r0)
            if (r0 != r2) goto L_0x00d7
            return r2
        L_0x00d7:
            r0 = r11
        L_0x00d8:
            java.lang.String r11 = "check is thirdparty video, pass result"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r11 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r11 = r11.f272892b
            java.lang.String r0 = r0.f124222b
            java.lang.String r1 = "kThirdPartyVideoExtData"
            r11.putString(r1, r0)
            r4 = 3
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r11 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            b62.d r3 = b62.C92180d.MediaRemuxError
            r6 = 0
            r7 = 8
            r8 = 0
            java.lang.String r5 = "check third video jump remux"
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r11
        L_0x00f9:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r11 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        L_0x0106:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r11 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c33.C92347g.mo126329d(wx3.d):java.lang.Object");
    }
}
