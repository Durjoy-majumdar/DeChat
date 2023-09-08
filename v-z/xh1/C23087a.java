package xh1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53916l;
import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k14.C60949f;
import k14.C99088c;
import kotlin.Result;
import kotlin.ResultKt;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98123f;
import p1081gi.C98124g;
import rx3.C13598b0;
import te3.C48928bz0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

/* renamed from: xh1.a */
public final class C23087a {

    /* renamed from: a */
    public static final C23087a f66318a = new C23087a();

    /* renamed from: b */
    public static final String f66319b = (C112760b.m154231g() + "live/gestures_0/");

    /* renamed from: c */
    public static final C99088c f66320c = C60949f.m71437a(false, 1, (Object) null);

    /* renamed from: d */
    public static final Map<String, Boolean> f66321d = new LinkedHashMap();

    /* renamed from: xh1.a$a */
    public static final class C15676a {

        /* renamed from: a */
        public final String f42362a;

        public C15676a(String str) {
            this.f42362a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15676a) && C87412m.m108589b(this.f42362a, ((C15676a) obj).f42362a);
        }

        public int hashCode() {
            String str = this.f42362a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AnchorFileStatus(d_lua=" + this.f42362a + ')';
        }
    }

    /* renamed from: xh1.a$b */
    public static final class C15677b {

        /* renamed from: a */
        public final String f42363a;

        /* renamed from: b */
        public final String f42364b;

        /* renamed from: c */
        public final String f42365c;

        public C15677b(String str, String str2, String str3) {
            C87412m.m108594g(str, "f_color_png");
            C87412m.m108594g(str2, "f_darkmode_png");
            C87412m.m108594g(str3, "f_lightmode_png");
            this.f42363a = str;
            this.f42364b = str2;
            this.f42365c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15677b)) {
                return false;
            }
            C15677b bVar = (C15677b) obj;
            return C87412m.m108589b(this.f42363a, bVar.f42363a) && C87412m.m108589b(this.f42364b, bVar.f42364b) && C87412m.m108589b(this.f42365c, bVar.f42365c);
        }

        public int hashCode() {
            return (((this.f42363a.hashCode() * 31) + this.f42364b.hashCode()) * 31) + this.f42365c.hashCode();
        }

        public String toString() {
            return "GestureIconStatus(f_color_png=" + this.f42363a + ", f_darkmode_png=" + this.f42364b + ", f_lightmode_png=" + this.f42365c + ')';
        }
    }

    /* renamed from: xh1.a$c */
    public static final class C15678c {

        /* renamed from: a */
        public final String f42366a;

        /* renamed from: b */
        public final String f42367b;

        /* renamed from: c */
        public final String f42368c;

        /* renamed from: d */
        public final String f42369d;

        /* renamed from: e */
        public final String f42370e;

        public C15678c(String str, String str2, String str3, String str4, String str5) {
            C87412m.m108594g(str, "f_gifting_pag");
            C87412m.m108594g(str2, "f_primary_pag");
            C87412m.m108594g(str3, "f_sound_mp3");
            C87412m.m108594g(str4, "d_primary_lua");
            C87412m.m108594g(str5, "d_gifting_lua");
            this.f42366a = str;
            this.f42367b = str2;
            this.f42368c = str3;
            this.f42369d = str4;
            this.f42370e = str5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15678c)) {
                return false;
            }
            C15678c cVar = (C15678c) obj;
            return C87412m.m108589b(this.f42366a, cVar.f42366a) && C87412m.m108589b(this.f42367b, cVar.f42367b) && C87412m.m108589b(this.f42368c, cVar.f42368c) && C87412m.m108589b(this.f42369d, cVar.f42369d) && C87412m.m108589b(this.f42370e, cVar.f42370e);
        }

        public int hashCode() {
            return (((((((this.f42366a.hashCode() * 31) + this.f42367b.hashCode()) * 31) + this.f42368c.hashCode()) * 31) + this.f42369d.hashCode()) * 31) + this.f42370e.hashCode();
        }

        public String toString() {
            return "ResourceStatus(f_gifting_pag=" + this.f42366a + ", f_primary_pag=" + this.f42367b + ", f_sound_mp3=" + this.f42368c + ", d_primary_lua=" + this.f42369d + ", d_gifting_lua=" + this.f42370e + ')';
        }
    }

    /* renamed from: xh1.a$d */
    public static final class C15679d {

        /* renamed from: a */
        public final String f42371a;

        public C15679d(String str) {
            C87412m.m108594g(str, "f_tips_icon_png");
            this.f42371a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15679d) && C87412m.m108589b(this.f42371a, ((C15679d) obj).f42371a);
        }

        public int hashCode() {
            return this.f42371a.hashCode();
        }

        public String toString() {
            return "TipsIconStatus(f_tips_icon_png=" + this.f42371a + ')';
        }
    }

    /* renamed from: xh1.a$f */
    public static final class C15680f implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ String f42372d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f42373e;

        /* renamed from: f */
        public final /* synthetic */ C53916l<Boolean> f42374f;

        public C15680f(String str, C8477a0 a0Var, C53916l<? super Boolean> lVar) {
            this.f42372d = str;
            this.f42373e = a0Var;
            this.f42374f = lVar;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            StringBuilder sb = new StringBuilder();
            sb.append("#downloadCdnRes cdncallback, mediaId:");
            sb.append(str);
            sb.append(", startRet:");
            sb.append(i);
            sb.append(", ");
            sb.append(dVar != null ? Integer.valueOf(dVar.field_retCode) : null);
            Log.m105924i("FinderGesturesFilesManager", sb.toString());
            if (dVar == null) {
                return 0;
            }
            if (dVar.field_retCode == 0) {
                Log.m105924i("FinderGesturesFilesManager", "#downloadCdnRes success, fileExist:" + C86013q1.m106450k(this.f42372d));
                C8477a0 a0Var = this.f42373e;
                if (!a0Var.f27482d) {
                    a0Var.f27482d = true;
                    C53916l<Boolean> lVar = this.f42374f;
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                }
            } else {
                Log.m105924i("FinderGesturesFilesManager", "#downloadCdnRes failed, " + dVar.field_retCode);
                C8477a0 a0Var2 = this.f42373e;
                if (!a0Var2.f27482d) {
                    a0Var2.f27482d = true;
                    C53916l<Boolean> lVar2 = this.f42374f;
                    Result.Companion companion2 = Result.Companion;
                    lVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                }
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            return new byte[0];
        }
    }

    /* renamed from: xh1.a$g */
    public static final class C15681g extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98123f f42375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15681g(C98123f fVar) {
            super(1);
            this.f42375d = fVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            Log.m105924i("FinderGesturesFilesManager", "#downloadCdnRes invokeOnCancellation");
            this.f42375d.f287662f = null;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles$getUnzipDirPath$2", mo125469f = "GesturesFiles.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: xh1.a$l */
    public static final class C15682l extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f42376d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15682l(String str, C15601d<? super C15682l> dVar) {
            super(2, dVar);
            this.f42376d = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15682l(this.f42376d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15682l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            String str = this.f42376d;
            if (str == null || str.length() == 0) {
                return "";
            }
            return C23087a.f66319b + MD5Util.getMD5String(this.f42376d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles$isDirRegular$2", mo125469f = "GesturesFiles.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: xh1.a$m */
    public static final class C15683m extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f42377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15683m(String str, C15601d<? super C15683m> dVar) {
            super(2, dVar);
            this.f42377d = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15683m(this.f42377d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15683m) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            String str = this.f42377d;
            if (str == null || str.length() == 0) {
                return Boolean.FALSE;
            }
            Object obj2 = ((LinkedHashMap) C23087a.f66321d).get(this.f42377d);
            Boolean bool = Boolean.TRUE;
            if (C87412m.m108589b(obj2, bool)) {
                return bool;
            }
            C8477a0 a0Var = new C8477a0();
            Iterable<C86001b0> t = C86013q1.m106459t(this.f42377d, false);
            if (t != null) {
                for (C86001b0 b0Var : t) {
                    String str2 = b0Var.f250472b;
                    C87412m.m108593f(str2, "it.name");
                    if (C112550d0.m153801u(str2, "manifest.json", false)) {
                        a0Var.f27482d = true;
                    }
                }
            }
            if (a0Var.f27482d) {
                C23087a.f66321d.put(this.f42377d, Boolean.TRUE);
            }
            return Boolean.valueOf(a0Var.f27482d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles", mo125469f = "GesturesFiles.kt", mo125470l = {406}, mo125471m = "downloadCdnRes")
    /* renamed from: xh1.a$e */
    public static final class C23088e extends C66704d {

        /* renamed from: d */
        public Object f66322d;

        /* renamed from: e */
        public Object f66323e;

        /* renamed from: f */
        public /* synthetic */ Object f66324f;

        /* renamed from: g */
        public final /* synthetic */ C23087a f66325g;

        /* renamed from: h */
        public int f66326h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23088e(C23087a aVar, C15601d<? super C23088e> dVar) {
            super(dVar);
            this.f66325g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66324f = obj;
            this.f66326h |= Integer.MIN_VALUE;
            C23087a aVar = this.f66325g;
            C23087a aVar2 = C23087a.f66318a;
            return aVar.mo36495b((String) null, (String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles", mo125469f = "GesturesFiles.kt", mo125470l = {307, 308}, mo125471m = "getAnchorFile")
    /* renamed from: xh1.a$h */
    public static final class C23089h extends C66704d {

        /* renamed from: d */
        public Object f66327d;

        /* renamed from: e */
        public Object f66328e;

        /* renamed from: f */
        public /* synthetic */ Object f66329f;

        /* renamed from: g */
        public final /* synthetic */ C23087a f66330g;

        /* renamed from: h */
        public int f66331h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23089h(C23087a aVar, C15601d<? super C23089h> dVar) {
            super(dVar);
            this.f66330g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66329f = obj;
            this.f66331h |= Integer.MIN_VALUE;
            return this.f66330g.mo36496c((C48928bz0) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles", mo125469f = "GesturesFiles.kt", mo125470l = {325, 326}, mo125471m = "getGestureIconFile")
    /* renamed from: xh1.a$i */
    public static final class C23090i extends C66704d {

        /* renamed from: d */
        public Object f66332d;

        /* renamed from: e */
        public /* synthetic */ Object f66333e;

        /* renamed from: f */
        public final /* synthetic */ C23087a f66334f;

        /* renamed from: g */
        public int f66335g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23090i(C23087a aVar, C15601d<? super C23090i> dVar) {
            super(dVar);
            this.f66334f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66333e = obj;
            this.f66335g |= Integer.MIN_VALUE;
            return this.f66334f.mo36497d((C48928bz0) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles", mo125469f = "GesturesFiles.kt", mo125470l = {341, 342}, mo125471m = "getResourceFile")
    /* renamed from: xh1.a$j */
    public static final class C23091j extends C66704d {

        /* renamed from: d */
        public Object f66336d;

        /* renamed from: e */
        public /* synthetic */ Object f66337e;

        /* renamed from: f */
        public final /* synthetic */ C23087a f66338f;

        /* renamed from: g */
        public int f66339g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23091j(C23087a aVar, C15601d<? super C23091j> dVar) {
            super(dVar);
            this.f66338f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66337e = obj;
            this.f66339g |= Integer.MIN_VALUE;
            return this.f66338f.mo36498e((C48928bz0) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles", mo125469f = "GesturesFiles.kt", mo125470l = {359, 360}, mo125471m = "getTipsIconFile")
    /* renamed from: xh1.a$k */
    public static final class C23092k extends C66704d {

        /* renamed from: d */
        public Object f66340d;

        /* renamed from: e */
        public /* synthetic */ Object f66341e;

        /* renamed from: f */
        public final /* synthetic */ C23087a f66342f;

        /* renamed from: g */
        public int f66343g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23092k(C23087a aVar, C15601d<? super C23092k> dVar) {
            super(dVar);
            this.f66342f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66341e = obj;
            this.f66343g |= Integer.MIN_VALUE;
            return this.f66342f.mo36499f((C48928bz0) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles", mo125469f = "GesturesFiles.kt", mo125470l = {411, 42}, mo125471m = "refresh")
    /* renamed from: xh1.a$n */
    public static final class C23093n extends C66704d {

        /* renamed from: d */
        public Object f66344d;

        /* renamed from: e */
        public Object f66345e;

        /* renamed from: f */
        public boolean f66346f;

        /* renamed from: g */
        public /* synthetic */ Object f66347g;

        /* renamed from: h */
        public final /* synthetic */ C23087a f66348h;

        /* renamed from: i */
        public int f66349i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23093n(C23087a aVar, C15601d<? super C23093n> dVar) {
            super(dVar);
            this.f66348h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f66347g = obj;
            this.f66349i |= Integer.MIN_VALUE;
            return this.f66348h.mo36502i((List<? extends C48928bz0>) null, false, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles$refreshInner$2", mo125469f = "GesturesFiles.kt", mo125470l = {121}, mo125471m = "invokeSuspend")
    /* renamed from: xh1.a$o */
    public static final class C23094o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f66350d;

        /* renamed from: e */
        public Object f66351e;

        /* renamed from: f */
        public int f66352f;

        /* renamed from: g */
        public /* synthetic */ Object f66353g;

        /* renamed from: h */
        public final /* synthetic */ List<C48928bz0> f66354h;

        /* renamed from: i */
        public final /* synthetic */ boolean f66355i;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles$refreshInner$2$1", mo125469f = "GesturesFiles.kt", mo125470l = {99}, mo125471m = "invokeSuspend")
        /* renamed from: xh1.a$o$a */
        public static final class C23095a extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

            /* renamed from: d */
            public int f66356d;

            /* renamed from: e */
            public final /* synthetic */ C48928bz0 f66357e;

            /* renamed from: f */
            public final /* synthetic */ boolean f66358f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23095a(C48928bz0 bz02, boolean z, C15601d<? super C23095a> dVar) {
                super(2, dVar);
                this.f66357e = bz02;
                this.f66358f = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C23095a(this.f66357e, this.f66358f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C23095a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f66356d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f66357e.f131402g;
                    boolean z = this.f66358f;
                    this.f66356d = 1;
                    obj = C23087a.m27397a(this.f66357e.f131399d + "-anchor_url", str, z, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles$refreshInner$2$2", mo125469f = "GesturesFiles.kt", mo125470l = {102}, mo125471m = "invokeSuspend")
        /* renamed from: xh1.a$o$b */
        public static final class C23096b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

            /* renamed from: d */
            public int f66359d;

            /* renamed from: e */
            public final /* synthetic */ C48928bz0 f66360e;

            /* renamed from: f */
            public final /* synthetic */ boolean f66361f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23096b(C48928bz0 bz02, boolean z, C15601d<? super C23096b> dVar) {
                super(2, dVar);
                this.f66360e = bz02;
                this.f66361f = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C23096b(this.f66360e, this.f66361f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C23096b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f66359d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f66360e.f131401f;
                    boolean z = this.f66361f;
                    this.f66359d = 1;
                    obj = C23087a.m27397a(this.f66360e.f131399d + "-gesture_icon_url", str, z, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles$refreshInner$2$3", mo125469f = "GesturesFiles.kt", mo125470l = {109}, mo125471m = "invokeSuspend")
        /* renamed from: xh1.a$o$c */
        public static final class C23097c extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

            /* renamed from: d */
            public int f66362d;

            /* renamed from: e */
            public final /* synthetic */ C48928bz0 f66363e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23097c(C48928bz0 bz02, C15601d<? super C23097c> dVar) {
                super(2, dVar);
                this.f66363e = bz02;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C23097c(this.f66363e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C23097c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f66362d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f66363e.f131405j;
                    this.f66362d = 1;
                    obj = C23087a.m27397a(this.f66363e.f131399d + "-resource_url", str, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesFiles$refreshInner$2$4", mo125469f = "GesturesFiles.kt", mo125470l = {112}, mo125471m = "invokeSuspend")
        /* renamed from: xh1.a$o$d */
        public static final class C23098d extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

            /* renamed from: d */
            public int f66364d;

            /* renamed from: e */
            public final /* synthetic */ C48928bz0 f66365e;

            /* renamed from: f */
            public final /* synthetic */ boolean f66366f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23098d(C48928bz0 bz02, boolean z, C15601d<? super C23098d> dVar) {
                super(2, dVar);
                this.f66365e = bz02;
                this.f66366f = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C23098d(this.f66365e, this.f66366f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C23098d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f66364d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f66365e.f131404i;
                    boolean z = this.f66366f;
                    this.f66364d = 1;
                    obj = C23087a.m27397a(this.f66365e.f131399d + "-tips_icon_url", str, z, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23094o(List<? extends C48928bz0> list, boolean z, C15601d<? super C23094o> dVar) {
            super(2, dVar);
            this.f66354h = list;
            this.f66355i = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C23094o oVar = new C23094o(this.f66354h, this.f66355i, dVar);
            oVar.f66353g = obj;
            return oVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C23094o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f66352f
                r2 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r13.f66351e
                java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
                java.lang.Object r3 = r13.f66350d
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r13.f66353g
                java.util.Iterator r4 = (java.util.Iterator) r4
                kotlin.ResultKt.throwOnFailure(r14)
                r5 = r1
                r1 = r0
                r0 = r13
                goto L_0x00b5
            L_0x001d:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.f66353g
                a14.n0 r14 = (a14.C0000n0) r14
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List<te3.bz0> r3 = r13.f66354h
                java.util.Iterator r9 = r3.iterator()
            L_0x0037:
                boolean r3 = r9.hasNext()
                if (r3 == 0) goto L_0x0084
                java.lang.Object r3 = r9.next()
                r10 = r3
                te3.bz0 r10 = (te3.C48928bz0) r10
                r4 = 0
                r5 = 0
                xh1.a$o$a r6 = new xh1.a$o$a
                boolean r3 = r13.f66355i
                r11 = 0
                r6.<init>(r10, r3, r11)
                r7 = 3
                r8 = 0
                r3 = r14
                a14.u0 r3 = a14.C53895h.m60464b(r3, r4, r5, r6, r7, r8)
                r1.add(r3)
                xh1.a$o$b r6 = new xh1.a$o$b
                boolean r3 = r13.f66355i
                r6.<init>(r10, r3, r11)
                r3 = r14
                a14.u0 r3 = a14.C53895h.m60464b(r3, r4, r5, r6, r7, r8)
                r1.add(r3)
                xh1.a$o$c r6 = new xh1.a$o$c
                r6.<init>(r10, r11)
                r3 = r14
                a14.u0 r3 = a14.C53895h.m60464b(r3, r4, r5, r6, r7, r8)
                r1.add(r3)
                xh1.a$o$d r6 = new xh1.a$o$d
                boolean r3 = r13.f66355i
                r6.<init>(r10, r3, r11)
                r3 = r14
                a14.u0 r3 = a14.C53895h.m60464b(r3, r4, r5, r6, r7, r8)
                r1.add(r3)
                goto L_0x0037
            L_0x0084:
                java.util.Iterator r14 = r1.iterator()
                r4 = r14
                r14 = r13
            L_0x008a:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x00c4
                java.lang.Object r1 = r4.next()
                a14.u0 r1 = (a14.C53953u0) r1
                java.lang.String r3 = "FinderGesturesFilesManager"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "#refreshInner result:"
                r5.append(r6)
                r14.f66353g = r4
                r14.f66350d = r3
                r14.f66351e = r5
                r14.f66352f = r2
                java.lang.Object r1 = r1.mo74634A(r14)
                if (r1 != r0) goto L_0x00b1
                return r0
            L_0x00b1:
                r12 = r0
                r0 = r14
                r14 = r1
                r1 = r12
            L_0x00b5:
                java.lang.String r14 = (java.lang.String) r14
                r5.append(r14)
                java.lang.String r14 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r14)
                r14 = r0
                r0 = r1
                goto L_0x008a
            L_0x00c4:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: xh1.C23087a.C23094o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m27397a(java.lang.String r11, java.lang.String r12, boolean r13, wx3.C15601d r14) {
        /*
            boolean r0 = r14 instanceof xh1.C23099c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            xh1.c r0 = (xh1.C23099c) r0
            int r1 = r0.f66373j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66373j = r1
            goto L_0x0018
        L_0x0013:
            xh1.c r0 = new xh1.c
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.f66372i
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f66373j
            java.lang.String r3 = ". cdnUrl="
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L_0x0093
            if (r2 == r9) goto L_0x0084
            if (r2 == r7) goto L_0x0071
            if (r2 == r6) goto L_0x005c
            if (r2 == r5) goto L_0x0047
            if (r2 != r4) goto L_0x003f
            java.lang.Object r11 = r0.f66368e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f66367d
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x01c1
        L_0x003f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0047:
            java.lang.Object r11 = r0.f66370g
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f66369f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.f66368e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.f66367d
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x016b
        L_0x005c:
            java.lang.Object r11 = r0.f66370g
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.f66369f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.f66368e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.f66367d
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0136
        L_0x0071:
            boolean r11 = r0.f66371h
            java.lang.Object r12 = r0.f66369f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.f66368e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.f66367d
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00f2
        L_0x0084:
            boolean r13 = r0.f66371h
            java.lang.Object r11 = r0.f66368e
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r0.f66367d
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00d6
        L_0x0093:
            kotlin.ResultKt.throwOnFailure(r14)
            if (r12 == 0) goto L_0x00a1
            int r14 = r12.length()
            if (r14 != 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r14 = 0
            goto L_0x00a2
        L_0x00a1:
            r14 = 1
        L_0x00a2:
            if (r14 == 0) goto L_0x00ba
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r11 = ":failed.cdnUrl="
            r13.append(r11)
            r13.append(r12)
            java.lang.String r1 = r13.toString()
            goto L_0x01f2
        L_0x00ba:
            xh1.a r14 = f66318a
            r0.f66367d = r11
            r0.f66368e = r12
            r0.f66371h = r13
            r0.f66373j = r9
            r14.getClass()
            a14.h0 r14 = a14.C53872d1.f151119c
            xh1.b r2 = new xh1.b
            r2.<init>(r12, r8)
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r2, r0)
            if (r14 != r1) goto L_0x00d6
            goto L_0x01f2
        L_0x00d6:
            java.lang.String r14 = (java.lang.String) r14
            xh1.a r2 = f66318a
            r0.f66367d = r11
            r0.f66368e = r12
            r0.f66369f = r14
            r0.f66371h = r13
            r0.f66373j = r7
            java.lang.Object r2 = r2.mo36500g(r12, r0)
            if (r2 != r1) goto L_0x00ec
            goto L_0x01f2
        L_0x00ec:
            r10 = r2
            r2 = r11
            r11 = r13
            r13 = r12
            r12 = r14
            r14 = r10
        L_0x00f2:
            java.lang.String r14 = (java.lang.String) r14
            java.util.Map<java.lang.String, java.lang.Boolean> r7 = f66321d
            boolean r9 = r7.containsKey(r14)
            if (r9 != 0) goto L_0x0101
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r7.put(r14, r9)
        L_0x0101:
            if (r11 != 0) goto L_0x011f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            java.lang.String r14 = ":done. isNeedDownload="
            r12.append(r14)
            r12.append(r11)
            r12.append(r3)
            r12.append(r13)
            java.lang.String r1 = r12.toString()
            goto L_0x01f2
        L_0x011f:
            xh1.a r11 = f66318a
            r0.f66367d = r2
            r0.f66368e = r13
            r0.f66369f = r12
            r0.f66370g = r14
            r0.f66373j = r6
            java.lang.Object r11 = r11.mo36501h(r14, r0)
            if (r11 != r1) goto L_0x0133
            goto L_0x01f2
        L_0x0133:
            r10 = r14
            r14 = r11
            r11 = r10
        L_0x0136:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0154
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r12 = ":done. dir cache exist. cdnUrl="
            r11.append(r12)
            r11.append(r13)
            java.lang.String r1 = r11.toString()
            goto L_0x01f2
        L_0x0154:
            com.tencent.p014mm.vfs.C86013q1.m106445f(r11)
            xh1.a r14 = f66318a
            r0.f66367d = r2
            r0.f66368e = r13
            r0.f66369f = r12
            r0.f66370g = r11
            r0.f66373j = r5
            java.lang.Object r14 = r14.mo36495b(r13, r12, r0)
            if (r14 != r1) goto L_0x016b
            goto L_0x01f2
        L_0x016b:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x0188
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r12 = ":failed. download failed. cdnUrl="
            r11.append(r12)
            r11.append(r13)
            java.lang.String r1 = r11.toString()
            goto L_0x01f2
        L_0x0188:
            com.tencent.p014mm.vfs.C86013q1.m106461v(r11)
            int r12 = com.tencent.p014mm.vfs.C86013q1.m106436R(r12, r11)
            if (r12 == 0) goto L_0x01ac
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r2)
            java.lang.String r14 = ":failed. unzip failed:"
            r11.append(r14)
            r11.append(r12)
            r11.append(r3)
            r11.append(r13)
            java.lang.String r1 = r11.toString()
            goto L_0x01f2
        L_0x01ac:
            xh1.a r12 = f66318a
            r0.f66367d = r2
            r0.f66368e = r13
            r0.f66369f = r8
            r0.f66370g = r8
            r0.f66373j = r4
            java.lang.Object r14 = r12.mo36501h(r11, r0)
            if (r14 != r1) goto L_0x01bf
            goto L_0x01f2
        L_0x01bf:
            r11 = r13
            r12 = r2
        L_0x01c1:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            if (r13 != 0) goto L_0x01de
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = ":failed. isDirRegular2Check failed. cdnUrl="
            r13.append(r12)
            r13.append(r11)
            java.lang.String r1 = r13.toString()
            goto L_0x01f2
        L_0x01de:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r12)
            java.lang.String r12 = ":done. download & unzip. cdnUrl="
            r13.append(r12)
            r13.append(r11)
            java.lang.String r1 = r13.toString()
        L_0x01f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xh1.C23087a.m27397a(java.lang.String, java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36495b(java.lang.String r13, java.lang.String r14, wx3.C15601d<? super java.lang.Boolean> r15) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            boolean r1 = r15 instanceof xh1.C23087a.C23088e
            if (r1 == 0) goto L_0x0015
            r1 = r15
            xh1.a$e r1 = (xh1.C23087a.C23088e) r1
            int r2 = r1.f66326h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f66326h = r2
            goto L_0x001a
        L_0x0015:
            xh1.a$e r1 = new xh1.a$e
            r1.<init>(r12, r15)
        L_0x001a:
            java.lang.Object r15 = r1.f66324f
            int r2 = r1.f66326h
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r13 = r1.f66323e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r13 = r1.f66322d
            java.lang.String r13 = (java.lang.String) r13
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0163
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "#downloadCdnRes url:"
            r15.append(r2)
            r15.append(r13)
            java.lang.String r2 = ", path:"
            r15.append(r2)
            r15.append(r14)
            java.lang.String r15 = r15.toString()
            java.lang.String r2 = "FinderGesturesFilesManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106450k(r14)
            if (r15 == 0) goto L_0x0067
            java.lang.String r15 = "#downloadCdnRes exist! why are you here?"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r14)
        L_0x0067:
            r1.f66322d = r13
            r1.f66323e = r14
            r1.f66326h = r3
            a14.m r15 = new a14.m
            wx3.d r1 = xx3.C66447b.m78392b(r1)
            r15.<init>(r1, r3)
            r15.mo74609p()
            gy3.a0 r1 = new gy3.a0
            r1.<init>()
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            gi.f r7 = new gi.f     // Catch:{ MalformedURLException -> 0x00fa }
            r7.<init>()     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r8 = "task_FinderCdnDownloader"
            r7.f287660d = r8     // Catch:{ MalformedURLException -> 0x00fa }
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00fa }
            r8.<init>(r13)     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r8 = r8.getHost()     // Catch:{ MalformedURLException -> 0x00fa }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x00fa }
            r9.<init>()     // Catch:{ MalformedURLException -> 0x00fa }
            int r9 = com.tencent.p014mm.network.C81035d.m98965f(r8, r6, r9)     // Catch:{ MalformedURLException -> 0x00fa }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x00fa }
            r10.<init>()     // Catch:{ MalformedURLException -> 0x00fa }
            int r10 = com.tencent.p014mm.network.C81035d.m98965f(r8, r3, r10)     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r13)     // Catch:{ MalformedURLException -> 0x00fa }
            r7.field_mediaId = r11     // Catch:{ MalformedURLException -> 0x00fa }
            r7.f287631R = r13     // Catch:{ MalformedURLException -> 0x00fa }
            r7.f287633S = r8     // Catch:{ MalformedURLException -> 0x00fa }
            r7.f287635U = r14     // Catch:{ MalformedURLException -> 0x00fa }
            r7.f287638X = r9     // Catch:{ MalformedURLException -> 0x00fa }
            r7.f287639Y = r10     // Catch:{ MalformedURLException -> 0x00fa }
            r7.f287640Z = r6     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00fa }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x00fa }
            r8.append(r4)     // Catch:{ MalformedURLException -> 0x00fa }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r9 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ MalformedURLException -> 0x00fa }
            int r9 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion.getCompatMixStrength$default(r9, r6, r3, r5)     // Catch:{ MalformedURLException -> 0x00fa }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r8 = r8.toString()     // Catch:{ MalformedURLException -> 0x00fa }
            r7.f287641p0 = r8     // Catch:{ MalformedURLException -> 0x00fa }
            r7.f287642x0 = r4     // Catch:{ MalformedURLException -> 0x00fa }
            r8 = 150(0x96, float:2.1E-43)
            r7.f287630Q0 = r8     // Catch:{ MalformedURLException -> 0x00fa }
            r8 = 20201(0x4ee9, float:2.8308E-41)
            r7.f287632R0 = r8     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x00fa }
            r8.<init>()     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r9 = "#generateTaskInfo mediaId:"
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r9 = r7.field_mediaId     // Catch:{ MalformedURLException -> 0x00fa }
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r9 = " resCdnUrl:"
            r8.append(r9)     // Catch:{ MalformedURLException -> 0x00fa }
            r8.append(r13)     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r13 = r8.toString()     // Catch:{ MalformedURLException -> 0x00fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)     // Catch:{ MalformedURLException -> 0x00fa }
            r5 = r7
            goto L_0x0114
        L_0x00fa:
            r13 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r13, r4, r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "#generateTaskInfo fail:"
            r4.append(r6)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r13)
        L_0x0114:
            if (r5 != 0) goto L_0x0128
            boolean r13 = r1.f27482d
            if (r13 != 0) goto L_0x015c
            r1.f27482d = r3
            kotlin.Result$Companion r13 = kotlin.Result.Companion
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.Object r13 = kotlin.Result.m168114constructorimpl(r13)
            r15.resumeWith(r13)
            goto L_0x015c
        L_0x0128:
            xh1.a$f r13 = new xh1.a$f
            r13.<init>(r14, r1, r15)
            r5.f287662f = r13
            java.lang.Class<qo.l> r13 = p663qo.C101213l.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            qo.l r13 = (p663qo.C101213l) r13
            boolean r13 = r13.xf0(r5)
            if (r13 == 0) goto L_0x0146
            xh1.a$g r13 = new xh1.a$g
            r13.<init>(r5)
            r15.mo74599v(r13)
            goto L_0x015c
        L_0x0146:
            java.lang.String r13 = "#downloadCdnRes addRecvTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            boolean r13 = r1.f27482d
            if (r13 != 0) goto L_0x015c
            r1.f27482d = r3
            kotlin.Result$Companion r13 = kotlin.Result.Companion
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.Object r13 = kotlin.Result.m168114constructorimpl(r13)
            r15.resumeWith(r13)
        L_0x015c:
            java.lang.Object r15 = r15.mo74608o()
            if (r15 != r0) goto L_0x0163
            return r0
        L_0x0163:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r13 = r15.booleanValue()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: xh1.C23087a.mo36495b(java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36496c(te3.C48928bz0 r9, wx3.C15601d<? super xh1.C23087a.C15676a> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof xh1.C23087a.C23089h
            if (r0 == 0) goto L_0x0013
            r0 = r10
            xh1.a$h r0 = (xh1.C23087a.C23089h) r0
            int r1 = r0.f66331h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66331h = r1
            goto L_0x0018
        L_0x0013:
            xh1.a$h r0 = new xh1.a$h
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f66329f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f66331h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r9 = r0.f66328e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.f66327d
            te3.bz0 r0 = (te3.C48928bz0) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x006c
        L_0x0032:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            java.lang.Object r9 = r0.f66328e
            te3.bz0 r9 = (te3.C48928bz0) r9
            java.lang.Object r2 = r0.f66327d
            xh1.a r2 = (xh1.C23087a) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0059
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = r9.f131402g
            r0.f66327d = r8
            r0.f66328e = r9
            r0.f66331h = r4
            java.lang.Object r10 = r8.mo36500g(r10, r0)
            if (r10 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r8
        L_0x0059:
            java.lang.String r10 = (java.lang.String) r10
            r0.f66327d = r9
            r0.f66328e = r10
            r0.f66331h = r3
            java.lang.Object r0 = r2.mo36501h(r10, r0)
            if (r0 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r7 = r0
            r0 = r9
            r9 = r10
            r10 = r7
        L_0x006c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r1 = 0
            if (r10 == 0) goto L_0x00b3
            long r2 = r0.f131410r
            int r10 = qr3.C110470e.f330363a
            r4 = 2011400(0x1eb108, float:2.818572E-39)
            if (r10 != 0) goto L_0x0080
            qr3.C110470e.f330363a = r4
        L_0x0080:
            int r10 = qr3.C110470e.f330363a
            long r5 = (long) r10
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x00ad
            int r10 = qr3.C110470e.f330363a
            if (r10 != 0) goto L_0x008d
            qr3.C110470e.f330363a = r4
        L_0x008d:
            int r10 = qr3.C110470e.f330363a
            long r2 = (long) r10
            long r4 = r0.f131411s
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x00ad
            xh1.a$a r1 = new xh1.a$a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "/lua"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r1.<init>(r9)
            goto L_0x00b3
        L_0x00ad:
            xh1.a$a r9 = new xh1.a$a
            r9.<init>(r1)
            r1 = r9
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xh1.C23087a.mo36496c(te3.bz0, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36497d(te3.C48928bz0 r7, wx3.C15601d<? super xh1.C23087a.C15677b> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xh1.C23087a.C23090i
            if (r0 == 0) goto L_0x0013
            r0 = r8
            xh1.a$i r0 = (xh1.C23087a.C23090i) r0
            int r1 = r0.f66335g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66335g = r1
            goto L_0x0018
        L_0x0013:
            xh1.a$i r0 = new xh1.a$i
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f66333e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f66335g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r7 = r0.f66332d
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005f
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            java.lang.Object r7 = r0.f66332d
            xh1.a r7 = (xh1.C23087a) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004f
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r7 = r7.f131401f
            r0.f66332d = r6
            r0.f66335g = r4
            java.lang.Object r8 = r6.mo36500g(r7, r0)
            if (r8 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r7 = r6
        L_0x004f:
            java.lang.String r8 = (java.lang.String) r8
            r0.f66332d = r8
            r0.f66335g = r3
            java.lang.Object r7 = r7.mo36501h(r8, r0)
            if (r7 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x005f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00a0
            xh1.a$b r8 = new xh1.a$b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "/color.png"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "/darkmode.png"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = "/lightmode.png"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r8.<init>(r0, r1, r7)
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xh1.C23087a.mo36497d(te3.bz0, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36498e(te3.C48928bz0 r8, wx3.C15601d<? super xh1.C23087a.C15678c> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof xh1.C23087a.C23091j
            if (r0 == 0) goto L_0x0013
            r0 = r9
            xh1.a$j r0 = (xh1.C23087a.C23091j) r0
            int r1 = r0.f66339g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66339g = r1
            goto L_0x0018
        L_0x0013:
            xh1.a$j r0 = new xh1.a$j
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f66337e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f66339g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r8 = r0.f66336d
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x005f
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            java.lang.Object r8 = r0.f66336d
            xh1.a r8 = (xh1.C23087a) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x004f
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r8 = r8.f131405j
            r0.f66336d = r7
            r0.f66339g = r4
            java.lang.Object r9 = r7.mo36500g(r8, r0)
            if (r9 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r8 = r7
        L_0x004f:
            java.lang.String r9 = (java.lang.String) r9
            r0.f66336d = r9
            r0.f66339g = r3
            java.lang.Object r8 = r8.mo36501h(r9, r0)
            if (r8 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x005f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x00c3
            xh1.a$c r9 = new xh1.a$c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = "/gifting.pag"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r2 = "/primary.pag"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r3 = "/sound.mp3"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r4 = "/primary-lua"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = "/gifting-lua"
            r0.append(r8)
            java.lang.String r5 = r0.toString()
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x00c4
        L_0x00c3:
            r9 = 0
        L_0x00c4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xh1.C23087a.mo36498e(te3.bz0, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36499f(te3.C48928bz0 r7, wx3.C15601d<? super xh1.C23087a.C15679d> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof xh1.C23087a.C23092k
            if (r0 == 0) goto L_0x0013
            r0 = r8
            xh1.a$k r0 = (xh1.C23087a.C23092k) r0
            int r1 = r0.f66343g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66343g = r1
            goto L_0x0018
        L_0x0013:
            xh1.a$k r0 = new xh1.a$k
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f66341e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f66343g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r7 = r0.f66340d
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005f
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            java.lang.Object r7 = r0.f66340d
            xh1.a r7 = (xh1.C23087a) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x004f
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r7 = r7.f131404i
            r0.f66340d = r6
            r0.f66343g = r4
            java.lang.Object r8 = r6.mo36500g(r7, r0)
            if (r8 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r7 = r6
        L_0x004f:
            java.lang.String r8 = (java.lang.String) r8
            r0.f66340d = r8
            r0.f66343g = r3
            java.lang.Object r7 = r7.mo36501h(r8, r0)
            if (r7 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x005f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x007e
            xh1.a$d r8 = new xh1.a$d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "/tips-icon.png"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xh1.C23087a.mo36499f(te3.bz0, wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public final Object mo36500g(String str, C15601d<? super String> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C15682l(str, (C15601d<? super C15682l>) null), dVar);
    }

    /* renamed from: h */
    public final Object mo36501h(String str, C15601d<? super Boolean> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C15683m(str, (C15601d<? super C15683m>) null), dVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: k14.d} */
    /* JADX WARNING: type inference failed for: r7v10, types: [k14.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063 A[Catch:{ all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064 A[Catch:{ all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo36502i(java.util.List<? extends te3.C48928bz0> r7, boolean r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof xh1.C23087a.C23093n
            if (r0 == 0) goto L_0x0013
            r0 = r9
            xh1.a$n r0 = (xh1.C23087a.C23093n) r0
            int r1 = r0.f66349i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f66349i = r1
            goto L_0x0018
        L_0x0013:
            xh1.a$n r0 = new xh1.a$n
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f66347g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f66349i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r7 = r0.f66344d
            k14.c r7 = (k14.C99088c) r7
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x002f }
            goto L_0x0073
        L_0x002f:
            r8 = move-exception
            goto L_0x007d
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            boolean r8 = r0.f66346f
            java.lang.Object r7 = r0.f66345e
            k14.c r7 = (k14.C99088c) r7
            java.lang.Object r2 = r0.f66344d
            java.util.List r2 = (java.util.List) r2
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r7
            r7 = r2
            goto L_0x005f
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r9)
            k14.c r9 = f66320c
            r0.f66344d = r7
            r0.f66345e = r9
            r0.f66346f = r8
            r0.f66349i = r4
            k14.d r9 = (k14.C60942d) r9
            java.lang.Object r2 = r9.mo85908b(r5, r0)
            if (r2 != r1) goto L_0x005f
            return r1
        L_0x005f:
            xh1.a r2 = f66318a     // Catch:{ all -> 0x007b }
            if (r8 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            r0.f66344d = r9     // Catch:{ all -> 0x007b }
            r0.f66345e = r5     // Catch:{ all -> 0x007b }
            r0.f66349i = r3     // Catch:{ all -> 0x007b }
            java.lang.Object r7 = r2.mo36503j(r7, r4, r0)     // Catch:{ all -> 0x007b }
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r7 = r9
        L_0x0073:
            rx3.b0 r8 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002f }
            r7.mo85909c(r5)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x007b:
            r8 = move-exception
            r7 = r9
        L_0x007d:
            r7.mo85909c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: xh1.C23087a.mo36502i(java.util.List, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: j */
    public final Object mo36503j(List<? extends C48928bz0> list, boolean z, C15601d<? super C13598b0> dVar) {
        Log.m105924i("FinderGesturesFilesManager", "#refreshInner newGestures.size=" + list.size());
        Object g = C53895h.m60469g(C53872d1.f151119c, new C23094o(list, z, (C15601d<? super C23094o>) null), dVar);
        return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
    }
}
