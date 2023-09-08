package xk1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54108o;
import al1.C54125e;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import ci1.C39952a;
import cj1.C54754f;
import cj1.C54768h6;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView;
import com.tencent.p014mm.plugin.finder.utils.FinderGameEventListener;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import dd3.C58256b;
import di3.C7335d;
import di3.C86312j;
import er1.C7777a0;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fe1.C8014g;
import fj1.C45795b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8777j5;
import il1.C60343a6;
import il1.C60349b6;
import il1.C60451k6;
import il1.C60529u5;
import il1.C9046k5;
import il1.C9128u4;
import il1.C9149v5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import k50.C60971a;
import kotlin.ResultKt;
import ob0.C11385n;
import ob0.C117747y;
import ok1.C62042e;
import org.json.JSONObject;
import p140cw.C7138g;
import p447aw.C103918d;
import qj1.C62987t2;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64234an2;
import te3.C64311db1;
import te3.C64756up2;
import te3.C64848y91;
import tf0.C64916p1;
import wg1.C65954a0;
import wg1.C66089v;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: xk1.d2 */
public final class C66297d2 extends UIComponent implements View.OnClickListener, C11385n {

    /* renamed from: A */
    public C32226l<? super FinderObjectDesc, C13598b0> f190840A;

    /* renamed from: B */
    public FinderGameEventListener f190841B;

    /* renamed from: C */
    public C53358b f190842C = new C53358b(0, 0, 3, (C8480h) null);

    /* renamed from: D */
    public long f190843D;

    /* renamed from: E */
    public C15724d f190844E = new C66307j(this);

    /* renamed from: F */
    public int f190845F = 8;

    /* renamed from: G */
    public final int f190846G = -1;

    /* renamed from: H */
    public final int f190847H = 1;

    /* renamed from: d */
    public final int f190848d = 1;

    /* renamed from: e */
    public final int f190849e = 2;

    /* renamed from: f */
    public C58124b f190850f;

    /* renamed from: g */
    public View f190851g;

    /* renamed from: h */
    public TextView f190852h;

    /* renamed from: i */
    public C60349b6 f190853i;

    /* renamed from: j */
    public C60529u5 f190854j;

    /* renamed from: n */
    public C9149v5 f190855n;

    /* renamed from: o */
    public C9128u4 f190856o;

    /* renamed from: p */
    public RelativeLayout f190857p;

    /* renamed from: q */
    public View f190858q;

    /* renamed from: r */
    public View f190859r;

    /* renamed from: s */
    public TextView f190860s;

    /* renamed from: t */
    public View f190861t;

    /* renamed from: u */
    public View f190862u;

    /* renamed from: v */
    public View f190863v;

    /* renamed from: w */
    public C60451k6 f190864w;

    /* renamed from: x */
    public FinderLiveTaskBannerView f190865x;

    /* renamed from: y */
    public C45795b f190866y;

    /* renamed from: z */
    public int f190867z = 0;

    /* renamed from: xk1.d2$c */
    public static final class C15723c {

        /* renamed from: a */
        public final int f42429a;

        public C15723c(int i) {
            this.f42429a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15723c) && this.f42429a == ((C15723c) obj).f42429a;
        }

        public int hashCode() {
            return this.f42429a;
        }

        public String toString() {
            return "OptionInfo(key=" + this.f42429a + ')';
        }
    }

    /* renamed from: xk1.d2$d */
    public interface C15724d {
        void onChange();
    }

    /* renamed from: xk1.d2$i */
    public static final class C15725i implements C47883u {

        /* renamed from: a */
        public static final C15725i f42430a = new C15725i();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: xk1.d2$b */
    public static final class C53358b {

        /* renamed from: a */
        public int f150159a;

        /* renamed from: b */
        public int f150160b;

        public C53358b() {
            this(0, 0, 3, (C8480h) null);
        }

        public C53358b(int i, int i2, int i3, C8480h hVar) {
            i = (i3 & 1) != 0 ? -1 : i;
            i2 = (i3 & 2) != 0 ? 0 : i2;
            this.f150159a = i;
            this.f150160b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53358b)) {
                return false;
            }
            C53358b bVar = (C53358b) obj;
            return this.f150159a == bVar.f150159a && this.f150160b == bVar.f150160b;
        }

        public int hashCode() {
            return (this.f150159a * 31) + this.f150160b;
        }

        public String toString() {
            return "NetSpeedTestResult(testResult=" + this.f150159a + ", avgSpeed=" + this.f150160b + ')';
        }
    }

    /* renamed from: xk1.d2$a */
    public static final class C66298a {

        /* renamed from: a */
        public String f190868a;

        /* renamed from: b */
        public String f190869b;

        /* renamed from: c */
        public String f190870c;

        /* renamed from: d */
        public String f190871d;

        public C66298a(String str, String str2, String str3, String str4) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(str2, "thumbUrl");
            C87412m.m108594g(str3, "choosePath");
            this.f190868a = str;
            this.f190869b = str2;
            this.f190870c = str3;
            this.f190871d = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C66298a)) {
                return false;
            }
            C66298a aVar = (C66298a) obj;
            return C87412m.m108589b(this.f190868a, aVar.f190868a) && C87412m.m108589b(this.f190869b, aVar.f190869b) && C87412m.m108589b(this.f190870c, aVar.f190870c) && C87412m.m108589b(this.f190871d, aVar.f190871d);
        }

        public int hashCode() {
            int hashCode = ((((this.f190868a.hashCode() * 31) + this.f190869b.hashCode()) * 31) + this.f190870c.hashCode()) * 31;
            String str = this.f190871d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CoverUrlDataItem(url=" + this.f190868a + ", thumbUrl=" + this.f190869b + ", choosePath=" + this.f190870c + ", fileMd5=" + this.f190871d + ')';
        }
    }

    /* renamed from: xk1.d2$e */
    public static final class C66299e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66297d2 f190872d;

        public C66299e(C66297d2 d2Var) {
            this.f190872d = d2Var;
        }

        public final void run() {
            C60451k6 k6Var = this.f190872d.f190864w;
            if (k6Var != null) {
                k6Var.mo85421c();
            }
        }
    }

    /* renamed from: xk1.d2$f */
    public static final class C66300f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C66297d2 f190873d;

        public C66300f(C66297d2 d2Var) {
            this.f190873d = d2Var;
        }

        public final void run() {
            C66297d2.m78220c3(this.f190873d);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostUIC$startPost$1", mo125469f = "FinderLivePostUIC.kt", mo125470l = {703, 704}, mo125471m = "invokeSuspend")
    /* renamed from: xk1.d2$g */
    public static final class C66301g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f190874d;

        /* renamed from: e */
        public /* synthetic */ Object f190875e;

        /* renamed from: f */
        public final /* synthetic */ C66297d2 f190876f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostUIC$startPost$1$avatarByteArrayResult$1", mo125469f = "FinderLivePostUIC.kt", mo125470l = {704}, mo125471m = "invokeSuspend")
        /* renamed from: xk1.d2$g$a */
        public static final class C66302a extends C91594j implements C32227p<C0000n0, C15601d<? super byte[]>, Object> {

            /* renamed from: d */
            public int f190877d;

            public C66302a(C15601d<? super C66302a> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C66302a(dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                C0000n0 n0Var = (C0000n0) obj;
                return new C66302a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f190877d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C62042e eVar = C62042e.f176370a;
                    C58969q b = C58961d.f168673a.mo84155b(C66785b.f191882e.mo90662O5());
                    String str = b != null ? b.field_avatarUrl : null;
                    if (str == null) {
                        str = "";
                    }
                    this.f190877d = 1;
                    obj = eVar.mo87014J(str, (String) null, this);
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

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostUIC$startPost$1$coverByteArrayResult$1", mo125469f = "FinderLivePostUIC.kt", mo125470l = {703}, mo125471m = "invokeSuspend")
        /* renamed from: xk1.d2$g$b */
        public static final class C66303b extends C91594j implements C32227p<C0000n0, C15601d<? super byte[]>, Object> {

            /* renamed from: d */
            public int f190878d;

            /* renamed from: e */
            public final /* synthetic */ C66297d2 f190879e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66303b(C66297d2 d2Var, C15601d<? super C66303b> dVar) {
                super(2, dVar);
                this.f190879e = d2Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C66303b(this.f190879e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C66303b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
                if (r1 == null) goto L_0x002f;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r4.f190878d
                    r2 = 1
                    if (r1 == 0) goto L_0x0015
                    if (r1 != r2) goto L_0x000d
                    kotlin.ResultKt.throwOnFailure(r5)
                    goto L_0x0044
                L_0x000d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L_0x0015:
                    kotlin.ResultKt.throwOnFailure(r5)
                    ok1.e r5 = ok1.C62042e.f176370a
                    xk1.d2 r1 = r4.f190879e
                    il1.u5 r1 = r1.f190854j
                    if (r1 == 0) goto L_0x002f
                    java.lang.String r3 = r1.f172530j
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                    if (r3 != 0) goto L_0x002b
                    java.lang.String r1 = r1.f172530j
                    goto L_0x002d
                L_0x002b:
                    java.lang.String r1 = r1.f172529i
                L_0x002d:
                    if (r1 != 0) goto L_0x0031
                L_0x002f:
                    java.lang.String r1 = ""
                L_0x0031:
                    xk1.d2 r3 = r4.f190879e
                    il1.u5 r3 = r3.f190854j
                    if (r3 == 0) goto L_0x003a
                    java.lang.String r3 = r3.f172528h
                    goto L_0x003b
                L_0x003a:
                    r3 = 0
                L_0x003b:
                    r4.f190878d = r2
                    java.lang.Object r5 = r5.mo87014J(r1, r3, r4)
                    if (r5 != r0) goto L_0x0044
                    return r0
                L_0x0044:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: xk1.C66297d2.C66301g.C66303b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66301g(C66297d2 d2Var, C15601d<? super C66301g> dVar) {
            super(2, dVar);
            this.f190876f = d2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C66301g gVar = new C66301g(this.f190876f, dVar);
            gVar.f190875e = obj;
            return gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66301g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: a14.n0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00b3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r11.f190874d
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r4) goto L_0x001d
                if (r1 != r3) goto L_0x0015
                java.lang.Object r0 = r11.f190875e
                byte[] r0 = (byte[]) r0
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x0069
            L_0x0015:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001d:
                java.lang.Object r1 = r11.f190875e
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r12)
                goto L_0x004a
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r12)
                java.lang.Object r12 = r11.f190875e
                r1 = r12
                a14.n0 r1 = (a14.C0000n0) r1
                r6 = 0
                r7 = 0
                xk1.d2$g$b r8 = new xk1.d2$g$b
                xk1.d2 r12 = r11.f190876f
                r8.<init>(r12, r2)
                r9 = 3
                r10 = 0
                r5 = r1
                a14.u0 r12 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
                r11.f190875e = r1
                r11.f190874d = r4
                a14.v0 r12 = (a14.C53957v0) r12
                java.lang.Object r12 = r12.mo74549z(r11)
                if (r12 != r0) goto L_0x004a
                return r0
            L_0x004a:
                r5 = r1
                byte[] r12 = (byte[]) r12
                r6 = 0
                r7 = 0
                xk1.d2$g$a r8 = new xk1.d2$g$a
                r8.<init>(r2)
                r9 = 3
                r10 = 0
                a14.u0 r1 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
                r11.f190875e = r12
                r11.f190874d = r3
                a14.v0 r1 = (a14.C53957v0) r1
                java.lang.Object r1 = r1.mo74549z(r11)
                if (r1 != r0) goto L_0x0067
                return r0
            L_0x0067:
                r0 = r12
                r12 = r1
            L_0x0069:
                byte[] r12 = (byte[]) r12
                te3.xs2 r1 = new te3.xs2
                r1.<init>()
                java.util.LinkedList r5 = new java.util.LinkedList
                r5.<init>()
                r1.f186383d = r5
                te3.qd3 r6 = new te3.qd3
                r6.<init>()
                r6.f184998d = r4
                r4 = 0
                if (r0 == 0) goto L_0x0089
                pe3.b r7 = new pe3.b
                int r8 = r0.length
                r7.<init>(r0, r4, r8)
                r6.f184999e = r7
            L_0x0089:
                r5.add(r6)
                java.util.LinkedList<te3.qd3> r0 = r1.f186383d
                te3.qd3 r5 = new te3.qd3
                r5.<init>()
                r5.f184998d = r3
                if (r12 == 0) goto L_0x009f
                pe3.b r3 = new pe3.b
                int r6 = r12.length
                r3.<init>(r12, r4, r6)
                r5.f184999e = r3
            L_0x009f:
                r0.add(r5)
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r12 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                androidx.lifecycle.i0 r12 = r12.mo77630e(r0)
                cl1.o r12 = (cl1.C54991o) r12
                if (r12 == 0) goto L_0x00b0
                d14.u0<rx3.l<java.lang.Boolean, byte[]>> r2 = r12.f154213I3
            L_0x00b0:
                if (r2 != 0) goto L_0x00b3
                goto L_0x00c3
            L_0x00b3:
                rx3.l r12 = new rx3.l
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                byte[] r1 = r1.toByteArray()
                r12.<init>(r0, r1)
                d14.j1 r2 = (d14.C58052j1) r2
                r2.setValue(r12)
            L_0x00c3:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: xk1.C66297d2.C66301g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostUIC$startPost$2", mo125469f = "FinderLivePostUIC.kt", mo125470l = {738, 740}, mo125471m = "invokeSuspend")
    /* renamed from: xk1.d2$h */
    public static final class C66304h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f190880d;

        /* renamed from: e */
        public /* synthetic */ Object f190881e;

        /* renamed from: f */
        public final /* synthetic */ C66297d2 f190882f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostUIC$startPost$2$bgUpLoadJob$1", mo125469f = "FinderLivePostUIC.kt", mo125470l = {727}, mo125471m = "invokeSuspend")
        /* renamed from: xk1.d2$h$a */
        public static final class C66305a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f190883d;

            /* renamed from: e */
            public final /* synthetic */ C66297d2 f190884e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66305a(C66297d2 d2Var, C15601d<? super C66305a> dVar) {
                super(2, dVar);
                this.f190884e = d2Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C66305a(this.f190884e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C66305a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C54991o oVar;
                C64756up2 N3;
                Class cls = C54991o.class;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f190883d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C54991o oVar2 = (C54991o) FinderLiveService.f159376d.mo77630e(cls);
                    if (oVar2 == null || (N3 = oVar2.mo75973N3()) == null) {
                        return null;
                    }
                    C66297d2 d2Var = this.f190884e;
                    C62042e eVar = C62042e.f176370a;
                    C45795b bVar = d2Var.f190866y;
                    this.f190883d = 1;
                    obj = eVar.mo86988A(bVar, N3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13604l lVar = (C13604l) obj;
                if (!(lVar.f38556e == null || (oVar = (C54991o) FinderLiveService.f159376d.mo77630e(cls)) == null)) {
                    oVar.f154230N = (C64756up2) lVar.f38556e;
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostUIC$startPost$2$coverDataItemJob$1", mo125469f = "FinderLivePostUIC.kt", mo125470l = {724}, mo125471m = "invokeSuspend")
        /* renamed from: xk1.d2$h$b */
        public static final class C66306b extends C91594j implements C32227p<C0000n0, C15601d<? super C66298a>, Object> {

            /* renamed from: d */
            public int f190885d;

            /* renamed from: e */
            public final /* synthetic */ C66297d2 f190886e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66306b(C66297d2 d2Var, C15601d<? super C66306b> dVar) {
                super(2, dVar);
                this.f190886e = d2Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C66306b(this.f190886e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C66306b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
                if ((!com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r3.f172528h) && com.tencent.p014mm.vfs.C86013q1.m106450k(r3.f172528h)) == true) goto L_0x0048;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
                if (r8 == null) goto L_0x00bb;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r7.f190885d
                    r2 = 1
                    if (r1 == 0) goto L_0x0016
                    if (r1 != r2) goto L_0x000e
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L_0x00e5
                L_0x000e:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L_0x0016:
                    kotlin.ResultKt.throwOnFailure(r8)
                    xk1.d2 r8 = r7.f190886e
                    r7.f190885d = r2
                    r8.getClass()
                    a14.m r1 = new a14.m
                    wx3.d r3 = xx3.C66447b.m78392b(r7)
                    r1.<init>(r3, r2)
                    r1.mo74609p()
                    il1.u5 r3 = r8.f190854j
                    r4 = 0
                    if (r3 == 0) goto L_0x0047
                    java.lang.String r5 = r3.f172528h
                    boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                    if (r5 != 0) goto L_0x0043
                    java.lang.String r3 = r3.f172528h
                    boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
                    if (r3 == 0) goto L_0x0043
                    r3 = 1
                    goto L_0x0044
                L_0x0043:
                    r3 = 0
                L_0x0044:
                    if (r3 != r2) goto L_0x0047
                    goto L_0x0048
                L_0x0047:
                    r2 = 0
                L_0x0048:
                    java.lang.String r3 = "Finder.FinderLivePostUIC"
                    java.lang.String r4 = ""
                    if (r2 == 0) goto L_0x00a3
                    xk1.f2 r2 = xk1.C15735f2.f42451d
                    r1.mo74599v(r2)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "choose live cover:"
                    r2.append(r5)
                    il1.u5 r5 = r8.f190854j
                    r6 = 0
                    if (r5 == 0) goto L_0x0065
                    java.lang.String r5 = r5.f172528h
                    goto L_0x0066
                L_0x0065:
                    r5 = r6
                L_0x0066:
                    r2.append(r5)
                    java.lang.String r5 = ", "
                    r2.append(r5)
                    il1.u5 r5 = r8.f190854j
                    if (r5 == 0) goto L_0x0074
                    java.lang.String r6 = r5.f172529i
                L_0x0074:
                    r2.append(r6)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                    java.lang.Class<lr.b> r2 = p599lr.C61381b.class
                    di3.d r2 = di3.C86312j.m106911c(r2)
                    lr.b r2 = (p599lr.C61381b) r2
                    qo1.g r2 = r2.mo78545UQ()
                    il1.u5 r3 = r8.f190854j
                    if (r3 == 0) goto L_0x0094
                    java.lang.String r3 = r3.f172528h
                    if (r3 != 0) goto L_0x0093
                    goto L_0x0094
                L_0x0093:
                    r4 = r3
                L_0x0094:
                    zc1.b r3 = zc1.C66785b.f191882e
                    java.lang.String r3 = r3.mo90662O5()
                    xk1.g2 r5 = new xk1.g2
                    r5.<init>(r1, r8)
                    r2.mo12411d(r4, r3, r5)
                    goto L_0x00de
                L_0x00a3:
                    java.lang.String r2 = "[dealWithCoverUrl] upload end"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                    il1.u5 r8 = r8.f190854j
                    if (r8 == 0) goto L_0x00bb
                    java.lang.String r2 = r8.f172530j
                    boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                    if (r2 != 0) goto L_0x00b7
                    java.lang.String r8 = r8.f172530j
                    goto L_0x00b9
                L_0x00b7:
                    java.lang.String r8 = r8.f172529i
                L_0x00b9:
                    if (r8 != 0) goto L_0x00bc
                L_0x00bb:
                    r8 = r4
                L_0x00bc:
                    kotlin.Result$Companion r2 = kotlin.Result.Companion
                    xk1.d2$a r2 = new xk1.d2$a
                    r2.<init>(r8, r8, r4, r4)
                    java.lang.Object r2 = kotlin.Result.m168114constructorimpl(r2)
                    r1.resumeWith(r2)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "choose default cover:"
                    r2.append(r4)
                    r2.append(r8)
                    java.lang.String r8 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)
                L_0x00de:
                    java.lang.Object r8 = r1.mo74608o()
                    if (r8 != r0) goto L_0x00e5
                    return r0
                L_0x00e5:
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: xk1.C66297d2.C66304h.C66306b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66304h(C66297d2 d2Var, C15601d<? super C66304h> dVar) {
            super(2, dVar);
            this.f190882f = d2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C66304h hVar = new C66304h(this.f190882f, dVar);
            hVar.f190881e = obj;
            return hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66304h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: type inference failed for: r13v18, types: [te3.db1] */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a6, code lost:
            r9 = r9.f42556d;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f190880d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0021
                if (r1 == r3) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0063
            L_0x0011:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0019:
                java.lang.Object r1 = r12.f190881e
                a14.u0 r1 = (a14.C53953u0) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0058
            L_0x0021:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.f190881e
                a14.n0 r13 = (a14.C0000n0) r13
                a14.h0 r1 = a14.C53872d1.f151119c
                r7 = 0
                xk1.d2$h$b r8 = new xk1.d2$h$b
                xk1.d2 r5 = r12.f190882f
                r8.<init>(r5, r4)
                r9 = 2
                r10 = 0
                r5 = r13
                r6 = r1
                a14.u0 r11 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
                r7 = 0
                xk1.d2$h$a r8 = new xk1.d2$h$a
                xk1.d2 r5 = r12.f190882f
                r8.<init>(r5, r4)
                r9 = 2
                r10 = 0
                r5 = r13
                r6 = r1
                a14.u0 r13 = a14.C53895h.m60464b(r5, r6, r7, r8, r9, r10)
                r12.f190881e = r11
                r12.f190880d = r3
                a14.v0 r13 = (a14.C53957v0) r13
                java.lang.Object r13 = r13.mo74549z(r12)
                if (r13 != r0) goto L_0x0057
                return r0
            L_0x0057:
                r1 = r11
            L_0x0058:
                r12.f190881e = r4
                r12.f190880d = r2
                java.lang.Object r13 = r1.mo74634A(r12)
                if (r13 != r0) goto L_0x0063
                return r0
            L_0x0063:
                xk1.d2$a r13 = (xk1.C66297d2.C66298a) r13
                java.lang.String r0 = "Finder.FinderLivePostUIC"
                java.lang.String r1 = "all upload end"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                if (r13 == 0) goto L_0x0286
                xk1.d2 r1 = r12.f190882f
                java.lang.String r2 = r13.f190868a
                java.lang.String r3 = r13.f190869b
                java.lang.String r5 = r13.f190870c
                java.lang.String r13 = r13.f190871d
                r1.getClass()
                java.lang.Class<cl1.o> r6 = cl1.C54991o.class
                java.lang.String r7 = "coverUrl"
                gy3.C87412m.m108594g(r2, r7)
                java.lang.String r7 = "thumbUrl"
                gy3.C87412m.m108594g(r3, r7)
                java.lang.String r7 = "path"
                gy3.C87412m.m108594g(r5, r7)
                com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = new com.tencent.mm.protocal.protobuf.FinderObjectDesc
                r7.<init>()
                bl3.r r8 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r9 = r1.getActivity()
                bl3.r$a r9 = r8.mo62444c(r9)
                java.lang.Class<xk1.y1> r10 = xk1.C15794y1.class
                androidx.lifecycle.i0 r9 = r9.mo75002a(r10)
                xk1.y1 r9 = (xk1.C15794y1) r9
                if (r9 == 0) goto L_0x00af
                com.tencent.mm.ui.widget.MMEditText r9 = r9.f42556d
                if (r9 == 0) goto L_0x00af
                android.text.Editable r9 = r9.getText()
                goto L_0x00b0
            L_0x00af:
                r9 = r4
            L_0x00b0:
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r7.description = r9
                r9 = 9
                r7.mediaType = r9
                il1.b6 r10 = r1.f190853i
                if (r10 == 0) goto L_0x00c3
                te3.db1 r10 = r10.mo85314a()
                goto L_0x00c4
            L_0x00c3:
                r10 = r4
            L_0x00c4:
                r7.location = r10
                te3.jk0 r10 = new te3.jk0
                r10.<init>()
                r7.extReading = r10
                te3.px0 r10 = new te3.px0
                r10.<init>()
                r10.f184911d = r2
                r7.liveDesc = r10
                com.tencent.mm.protocal.protobuf.FinderMedia r10 = new com.tencent.mm.protocal.protobuf.FinderMedia
                r10.<init>()
                r10.url = r2
                r10.mediaType = r9
                r10.thumbUrl = r3
                r3 = 0
                r10.videoDuration = r3
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r3 != 0) goto L_0x00f1
                er1.j4 r3 = er1.C58739j4.f168176a
                android.graphics.Point r3 = r3.mo83725x(r5)
                goto L_0x0100
            L_0x00f1:
                il1.u5 r3 = r1.f190854j
                if (r3 == 0) goto L_0x00ff
                android.graphics.Point r3 = new android.graphics.Point
                r5 = 300(0x12c, float:4.2E-43)
                r9 = 350(0x15e, float:4.9E-43)
                r3.<init>(r5, r9)
                goto L_0x0100
            L_0x00ff:
                r3 = r4
            L_0x0100:
                r5 = 0
                if (r3 == 0) goto L_0x0107
                int r9 = r3.x
                float r9 = (float) r9
                goto L_0x0108
            L_0x0107:
                r9 = 0
            L_0x0108:
                r10.width = r9
                if (r3 == 0) goto L_0x010f
                int r3 = r3.y
                float r5 = (float) r3
            L_0x010f:
                r10.height = r5
                java.lang.String r3 = ""
                if (r13 != 0) goto L_0x0117
                r5 = r3
                goto L_0x0118
            L_0x0117:
                r5 = r13
            L_0x0118:
                r10.md5sum = r5
                r10.coverUrl = r2
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r7.media
                r2.add(r10)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "desc coverUrl:"
                r2.append(r5)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r5 = r7.media
                java.lang.Object r5 = r5.getFirst()
                com.tencent.mm.protocal.protobuf.FinderMedia r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r5
                if (r5 == 0) goto L_0x0138
                java.lang.String r5 = r5.coverUrl
                goto L_0x0139
            L_0x0138:
                r5 = r4
            L_0x0139:
                r2.append(r5)
                java.lang.String r5 = ",thumbUrl:"
                r2.append(r5)
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r5 = r7.media
                java.lang.Object r5 = r5.getFirst()
                com.tencent.mm.protocal.protobuf.FinderMedia r5 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r5
                if (r5 == 0) goto L_0x014e
                java.lang.String r5 = r5.thumbUrl
                goto L_0x014f
            L_0x014e:
                r5 = r4
            L_0x014f:
                r2.append(r5)
                java.lang.String r5 = ",md5:"
                r2.append(r5)
                r2.append(r13)
                java.lang.String r13 = ", selfContact.anchorFlag:"
                r2.append(r13)
                fe1.q r13 = r1.mo90416f3()
                if (r13 == 0) goto L_0x016c
                long r9 = r13.field_liveAnchorStatusFlag
                java.lang.Long r13 = java.lang.Long.valueOf(r9)
                goto L_0x016d
            L_0x016c:
                r13 = r4
            L_0x016d:
                r2.append(r13)
                java.lang.String r13 = ", selfContact.switchFlag:"
                r2.append(r13)
                fe1.q r13 = r1.mo90416f3()
                if (r13 == 0) goto L_0x0182
                long r9 = r13.field_liveSwitchFlag
                java.lang.Long r13 = java.lang.Long.valueOf(r9)
                goto L_0x0183
            L_0x0182:
                r13 = r4
            L_0x0183:
                r2.append(r13)
                java.lang.String r13 = ", linkMic:"
                r2.append(r13)
                fj1.b r13 = r1.f190866y
                if (r13 == 0) goto L_0x01a7
                ok1.e r5 = ok1.C62042e.f176370a
                r5.getClass()
                androidx.lifecycle.i0 r13 = r13.mo71262a(r6)
                cl1.o r13 = (cl1.C54991o) r13
                int r13 = r13.f154354q
                r5 = 64
                boolean r13 = o40.C61926c.m72696u(r13, r5)
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                goto L_0x01a8
            L_0x01a7:
                r13 = r4
            L_0x01a8:
                r2.append(r13)
                java.lang.String r13 = ", gift:"
                r2.append(r13)
                ok1.e r13 = ok1.C62042e.f176370a
                fj1.b r5 = r1.f190866y
                boolean r5 = r13.mo87067b1(r5)
                r2.append(r5)
                java.lang.String r5 = ", comment:"
                r2.append(r5)
                fj1.b r5 = r1.f190866y
                if (r5 == 0) goto L_0x01cd
                boolean r13 = r13.mo87040S0(r5)
                java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                goto L_0x01ce
            L_0x01cd:
                r13 = r4
            L_0x01ce:
                r2.append(r13)
                java.lang.String r13 = ",location:"
                r2.append(r13)
                te3.db1 r13 = r7.location
                if (r13 != 0) goto L_0x01db
                goto L_0x01dc
            L_0x01db:
                r3 = r13
            L_0x01dc:
                org.json.JSONObject r13 = o40.C61937h.m72709h(r3)
                r2.append(r13)
                java.lang.String r13 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
                fj1.b r13 = r1.f190866y
                if (r13 == 0) goto L_0x01f5
                androidx.lifecycle.i0 r13 = r13.mo71262a(r6)
                cl1.o r13 = (cl1.C54991o) r13
                goto L_0x01f6
            L_0x01f5:
                r13 = r4
            L_0x01f6:
                fe1.q r0 = r1.mo90416f3()
                if (r13 == 0) goto L_0x0262
                if (r0 == 0) goto L_0x0262
                fh1.h$a r2 = fh1.C8048h.f26771n
                fj1.b r3 = r1.f190866y
                boolean r2 = r2.mo9138c(r3)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r9 = "checkAutoEnableGestureEffect enable:"
                r5.append(r9)
                r5.append(r2)
                java.lang.String r5 = r5.toString()
                java.lang.String r9 = "Finder.GestureEffectAnchorSettingController"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
                if (r3 == 0) goto L_0x0234
                androidx.lifecycle.i0 r3 = r3.mo71262a(r6)
                cl1.o r3 = (cl1.C54991o) r3
                if (r2 == 0) goto L_0x022c
                int r5 = r3.f154354q
                r6 = 131072(0x20000, float:1.83671E-40)
                r5 = r5 | r6
                goto L_0x0232
            L_0x022c:
                int r5 = r3.f154354q
                r6 = -131073(0xfffffffffffdffff, float:NaN)
                r5 = r5 & r6
            L_0x0232:
                r3.f154354q = r5
            L_0x0234:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r3.getClass()
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
                if (r3 == 0) goto L_0x0246
                java.lang.Class<fh1.g> r5 = fh1.C8044g.class
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r3 = r3.controller(r5)
                fh1.g r3 = (fh1.C8044g) r3
                goto L_0x0247
            L_0x0246:
                r3 = r4
            L_0x0247:
                if (r3 != 0) goto L_0x024a
                goto L_0x024d
            L_0x024a:
                r3.mo9135m3(r2)
            L_0x024d:
                int r2 = r13.f154354q
                long r2 = (long) r2
                r0.field_liveAnchorStatusFlag = r2
                fe1.d$b r2 = fe1.C58961d.f168673a
                r2.mo84166o(r0)
                int r2 = r13.f154354q
                long r2 = (long) r2
                r13.mo75982R4(r2)
                long r2 = r0.field_liveSwitchFlag
                r13.mo75983S4(r2)
            L_0x0262:
                il1.v5 r13 = r1.f190855n
                if (r13 == 0) goto L_0x026d
                gg1.a r0 = gg1.C32444a.f86121a
                int r13 = r13.f28817c
                r0.mo58624e(r13)
            L_0x026d:
                fy3.l<? super com.tencent.mm.protocal.protobuf.FinderObjectDesc, rx3.b0> r13 = r1.f190840A
                if (r13 == 0) goto L_0x0274
                r13.invoke(r7)
            L_0x0274:
                androidx.appcompat.app.AppCompatActivity r13 = r1.getActivity()
                bl3.r$a r13 = r8.mo62444c(r13)
                java.lang.Class<xk1.s1> r0 = xk1.C15775s1.class
                androidx.lifecycle.i0 r13 = r13.mo75002a(r0)
                xk1.s1 r13 = (xk1.C15775s1) r13
                r13.f42533j = r4
            L_0x0286:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: xk1.C66297d2.C66304h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: xk1.d2$j */
    public static final class C66307j implements C15724d {

        /* renamed from: a */
        public final /* synthetic */ C66297d2 f190887a;

        public C66307j(C66297d2 d2Var) {
            this.f190887a = d2Var;
        }

        public void onChange() {
            C58124b bVar;
            View view = this.f190887a.f190861t;
            if (view != null) {
                view.setEnabled(true);
            }
            C66297d2 d2Var = this.f190887a;
            Class cls = C54991o.class;
            C45795b bVar2 = d2Var.f190866y;
            if (bVar2 != null) {
                C54991o oVar = (C54991o) bVar2.mo71262a(cls);
                StringBuilder sb = new StringBuilder();
                sb.append("liveStart:");
                sb.append(oVar.mo75999e4());
                sb.append(", liveFinish:");
                sb.append(oVar.mo75997d4());
                sb.append(", liveCoverUrl:");
                C60529u5 u5Var = d2Var.f190854j;
                String str = null;
                sb.append(u5Var != null ? u5Var.f172530j : null);
                sb.append(", avatarUrl:");
                C60529u5 u5Var2 = d2Var.f190854j;
                sb.append(u5Var2 != null ? u5Var2.f172529i : null);
                sb.append(", choosePath:");
                C60529u5 u5Var3 = d2Var.f190854j;
                sb.append(u5Var3 != null ? u5Var3.f172528h : null);
                Log.m105924i("Finder.FinderLivePostUIC", sb.toString());
                if (!oVar.mo75999e4() && !oVar.mo75997d4()) {
                    C54125e eVar = oVar.f154249R2;
                    C60529u5 u5Var4 = d2Var.f190854j;
                    eVar.f151970a = u5Var4 != null ? u5Var4.f172530j : null;
                    eVar.f151971b = u5Var4 != null ? u5Var4.f172529i : null;
                    if (u5Var4 != null) {
                        str = u5Var4.f172528h;
                    }
                    eVar.f151972c = str;
                    C45795b bVar3 = d2Var.f190866y;
                    boolean z = false;
                    if (bVar3 != null && ((C54991o) bVar3.mo71262a(cls)).mo75960G3()) {
                        z = true;
                    }
                    if (z && (bVar = d2Var.f190850f) != null) {
                        C58124b.C58125b bVar4 = C58124b.C58125b.FINDER_LIVE_MODE_SWITCH;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
                        C13598b0 b0Var = C13598b0.f38549a;
                        bVar.statusChange(bVar4, bundle);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66297d2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m78220c3(C66297d2 d2Var) {
        d2Var.getClass();
        Log.m105924i("Finder.FinderLivePostUIC", "adjustTopContainerMargin, " + C75044y4.m89994f(d2Var.getActivity()));
        RelativeLayout relativeLayout = d2Var.f190857p;
        ViewGroup.LayoutParams layoutParams = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = ((int) d2Var.getContext().getResources().getDimension(C0966R.dimen.f3766df)) + C75044y4.m89994f(d2Var.getActivity());
        RelativeLayout relativeLayout2 = d2Var.f190857p;
        if (relativeLayout2 != null) {
            relativeLayout2.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: d3 */
    public final void mo90414d3() {
        C60349b6 b6Var;
        Log.m105924i("Finder.FinderLivePostUIC", "afterSelectTagOperation");
        C45795b bVar = this.f190866y;
        if (bVar != null) {
            C54991o oVar = (C54991o) bVar.mo71262a(C54991o.class);
            if (mo90417g3() && (b6Var = this.f190853i) != null) {
                Class cls = C8014g.class;
                Class<C60200t1> cls2 = C60200t1.class;
                C39818r rVar = C39818r.f106831a;
                if (!((C8014g) rVar.mo62446e(cls2).mo62447c(cls)).mo9103H()) {
                    Log.m105924i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser no permission");
                } else {
                    C64311db1 a = b6Var.f172016f.mo83363a();
                    String str = null;
                    if (Util.isNullOrNil(a != null ? a.f182664g : null)) {
                        C64311db1 a2 = b6Var.f172016f.mo83363a();
                        if (a2 != null) {
                            str = a2.f182663f;
                        }
                        if (Util.isNullOrNil(str)) {
                            Log.m105924i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser begin");
                            C13604l<Float, Float> X0 = ((C8014g) rVar.mo62446e(cls2).mo62447c(cls)).mo9104X0();
                            C64234an2 an22 = new C64234an2();
                            an22.f182094d = ((Number) X0.f38555d).floatValue();
                            an22.f182095e = ((Number) X0.f38556e).floatValue();
                            an22.f182099i = 0;
                            an22.f182096f = 1;
                            ((C58256b) C86312j.m106911c(C58256b.class)).L00(6, an22, false, new C60343a6(b6Var, an22));
                        }
                    }
                    Log.m105924i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser poi exist");
                }
            }
            C60349b6 b6Var2 = this.f190853i;
            if (b6Var2 != null) {
                boolean g3 = true ^ mo90417g3();
                Log.m105924i("Finder.FinderLivePostLocationWidget", "#setIsCanSelectNone isCanSelectNone=" + g3);
                b6Var2.f172014d.getIntent().putExtra("poi_show_none", g3);
            }
        }
    }

    /* renamed from: e3 */
    public final void mo90415e3() {
        Log.m105924i("Finder.FinderLivePostUIC", "checkState state:" + this.f190867z);
        if (this.f190867z == 0) {
            View view = this.f190862u;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            RelativeLayout relativeLayout = this.f190857p;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.f190862u;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "checkState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        RelativeLayout relativeLayout2 = this.f190857p;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(4);
        }
    }

    /* renamed from: f3 */
    public final C58969q mo90416f3() {
        C45795b bVar = this.f190866y;
        if (bVar != null) {
            return ((C54991o) bVar.mo71262a(C54991o.class)).f154259T2;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = ((cl1.C54991o) r0.mo71262a(cl1.C54991o.class)).f154326i2;
     */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo90417g3() {
        /*
            r4 = this;
            fj1.b r0 = r4.f190866y
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            te3.y91 r0 = r0.f154326i2
            if (r0 == 0) goto L_0x0017
            int r0 = r0.f186458i
            if (r0 != r1) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66297d2.mo90417g3():boolean");
    }

    /* renamed from: i3 */
    public final void mo90418i3() {
        C55908a aVar;
        C39952a checkActiveAndGet;
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(getContext(), "android.permission.RECORD_AUDIO", 80, "", "");
        Log.m105924i("Finder.FinderLivePostUIC", "check micro:" + z1);
        if (!z1) {
            Log.m105924i("Finder.FinderLivePostUIC", "check micro:" + Util.getStack());
            View view = this.f190861t;
            if (view != null) {
                view.setEnabled(true);
                return;
            }
            return;
        }
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if (bVar != null) {
            C58124b.C7172a.m7372a(bVar, C58124b.C58125b.READY, (Bundle) null, 2, (Object) null);
        }
        finderLiveService.getClass();
        C56032b bVar2 = FinderLiveService.f159379g;
        if (!(bVar2 == null || (checkActiveAndGet = bVar2.checkActiveAndGet()) == null)) {
            C53895h.m60464b(checkActiveAndGet, C53872d1.f151119c, (C53934p0) null, new C66301g(this, (C15601d<? super C66301g>) null), 2, (Object) null);
        }
        finderLiveService.getClass();
        C45795b bVar3 = FinderLiveService.f159348A;
        if (bVar3 != null && (aVar = bVar3.f123702i) != null) {
            C53895h.m60466d(aVar, (C66212f) null, (C53934p0) null, new C66304h(this, (C15601d<? super C66304h>) null), 3, (Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v10, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a5, code lost:
        if ((r0 != null && r0.mo85420b()) != false) goto L_0x02a9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020f  */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90419j3() {
        /*
            r15 = this;
            re1.a r0 = gg1.C32444a.f86070J1
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            android.view.View r0 = r15.f190861t
            if (r0 != 0) goto L_0x0014
            goto L_0x0017
        L_0x0014:
            r0.setEnabled(r1)
        L_0x0017:
            r15.mo90418i3()
            return
        L_0x001b:
            boolean r0 = r15.mo90417g3()
            r2 = 0
            if (r0 == 0) goto L_0x0024
            r0 = r15
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            r3 = 1
            if (r0 == 0) goto L_0x007b
            il1.b6 r4 = r15.f190853i
            if (r4 == 0) goto L_0x0035
            te3.db1 r4 = r4.mo85314a()
            if (r4 == 0) goto L_0x0035
            java.lang.String r4 = r4.f182663f
            goto L_0x0036
        L_0x0035:
            r4 = r2
        L_0x0036:
            if (r4 == 0) goto L_0x0041
            int r4 = r4.length()
            if (r4 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r4 = 0
            goto L_0x0042
        L_0x0041:
            r4 = 1
        L_0x0042:
            if (r4 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            if (r0 == 0) goto L_0x007b
            il1.b6 r4 = r15.f190853i
            if (r4 == 0) goto L_0x0055
            te3.db1 r4 = r4.mo85314a()
            if (r4 == 0) goto L_0x0055
            java.lang.String r4 = r4.f182664g
            goto L_0x0056
        L_0x0055:
            r4 = r2
        L_0x0056:
            if (r4 == 0) goto L_0x0061
            int r4 = r4.length()
            if (r4 != 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r4 = 0
            goto L_0x0062
        L_0x0061:
            r4 = 1
        L_0x0062:
            if (r4 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r0 = r2
        L_0x0066:
            if (r0 == 0) goto L_0x007b
            android.app.Activity r0 = r15.getContext()
            android.app.Activity r1 = r15.getContext()
            r2 = 2131827952(0x7f111cf0, float:1.9288831E38)
            java.lang.String r1 = r1.getString(r2)
            nj3.C76912y0.m92773l(r0, r1)
            return
        L_0x007b:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
            r4 = 2131821556(0x7f1103f4, float:1.9275859E38)
            if (r0 != 0) goto L_0x00bc
            qo3.q r0 = new qo3.q
            androidx.appcompat.app.AppCompatActivity r1 = r15.getActivity()
            r0.<init>(r1)
            androidx.appcompat.app.AppCompatActivity r1 = r15.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131827637(0x7f111bb5, float:1.9288192E38)
            java.lang.String r1 = r1.getString(r2)
            r0.mo107595g(r1)
            androidx.appcompat.app.AppCompatActivity r1 = r15.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r4)
            r0.mo107602n(r1)
            xk1.d2$i r1 = xk1.C66297d2.C15725i.f42430a
            r0.mo107600l(r1)
            r0.mo107603o()
            goto L_0x02b6
        L_0x00bc:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r15.f190843D
            long r5 = r5 - r7
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86105U1
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r7 = (long) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            xk1.d2$b r0 = r15.f190842C
            int r5 = r0.f150159a
            if (r5 != 0) goto L_0x00ea
            int r0 = r0.f150160b
            pe1.c<java.lang.Integer> r5 = gg1.C32444a.f86102T1
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r0 >= r5) goto L_0x00f9
        L_0x00ea:
            xk1.d2$b r0 = r15.f190842C
            int r0 = r0.f150159a
            int r5 = r15.f190847H
            if (r0 == r5) goto L_0x00f9
            int r5 = r15.f190846G
            if (r0 != r5) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r0 = 0
            goto L_0x00fa
        L_0x00f9:
            r0 = 1
        L_0x00fa:
            if (r0 != 0) goto L_0x020f
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r5 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r5)
            r6 = r0
            ht1.j5 r6 = (ht1.C8777j5) r6
            r7 = 26
            java.lang.String r9 = java.lang.String.valueOf(r3)
            r10 = 0
            r11 = 4
            r12 = 0
            ht1.C8777j5.C8778a.m8600a(r6, r7, r9, r10, r11, r12)
            long r5 = java.lang.System.currentTimeMillis()
            r15.f190843D = r5
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_NET_SPEED_TIMESTAMP_LONG_SYNC
            long r5 = r15.f190843D
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.mo119677K(r3, r5)
            qo3.e0 r0 = new qo3.e0
            android.app.Activity r7 = r15.getContext()
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 1
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            android.app.Activity r3 = r15.getContext()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r4)
            r0.mo140677w(r3)
            r3 = 6
            r0.mo140676v(r3)
            xk1.p2 r3 = new xk1.p2
            r3.<init>(r0)
            r0.f296375F = r3
            android.app.Activity r3 = r15.getContext()
            android.view.LayoutInflater r3 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r3)
            r4 = 2131494771(0x7f0c0773, float:1.861306E38)
            android.view.View r3 = r3.inflate(r4, r2)
            if (r3 == 0) goto L_0x0170
            r4 = 2131311241(0x7f093a89, float:1.8240817E38)
            android.view.View r4 = r3.findViewById(r4)
            goto L_0x0171
        L_0x0170:
            r4 = r2
        L_0x0171:
            r13 = 8
            if (r4 != 0) goto L_0x0176
            goto L_0x01b9
        L_0x0176:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r14.mo10233c(r5)
            java.lang.Object[] r6 = r14.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC"
            java.lang.String r8 = "showNetworkSpeedTipPanel"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r4
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r14.mo10231a(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC"
            java.lang.String r7 = "showNetworkSpeedTipPanel"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r4
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x01b9:
            if (r3 == 0) goto L_0x01c2
            r2 = 2131311240(0x7f093a88, float:1.8240815E38)
            android.view.View r2 = r3.findViewById(r2)
        L_0x01c2:
            if (r2 != 0) goto L_0x01c5
            goto L_0x0207
        L_0x01c5:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC"
            java.lang.String r7 = "showNetworkSpeedTipPanel"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r2
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r1 = r12.mo10231a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC"
            java.lang.String r6 = "showNetworkSpeedTipPanel"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0207:
            r0.mo140663j(r3)
            r0.mo140655A()
            goto L_0x02b6
        L_0x020f:
            il1.v5 r0 = r15.f190855n
            if (r0 == 0) goto L_0x021f
            int r0 = r0.f28817c
            if (r0 != r3) goto L_0x0219
            r0 = 1
            goto L_0x021a
        L_0x0219:
            r0 = 0
        L_0x021a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0220
        L_0x021f:
            r0 = r2
        L_0x0220:
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0239
            il1.u4 r0 = r15.f190856o
            if (r0 == 0) goto L_0x02b6
            android.view.ViewGroup r2 = r0.f28756b
            r2.setVisibility(r1)
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r0.f28758d
            r0.mo78804d()
            goto L_0x02b6
        L_0x0239:
            il1.k6 r0 = r15.f190864w
            if (r0 == 0) goto L_0x0245
            boolean r0 = r0.mo85420b()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x0245:
            gy3.C87412m.m108591d(r2)
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L_0x0257
            il1.k6 r0 = r15.f190864w
            if (r0 == 0) goto L_0x02b6
            r0.mo85419a(r3)
            goto L_0x02b6
        L_0x0257:
            il1.u5 r0 = r15.f190854j
            if (r0 == 0) goto L_0x0283
            java.lang.String r2 = r0.f172530j
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x027e
            java.lang.String r2 = r0.f172529i
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x027e
            java.lang.String r2 = r0.f172528h
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x027c
            java.lang.String r0 = r0.f172528h
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x027c
            goto L_0x027e
        L_0x027c:
            r0 = 0
            goto L_0x027f
        L_0x027e:
            r0 = 1
        L_0x027f:
            if (r0 != r3) goto L_0x0283
            r0 = 1
            goto L_0x0284
        L_0x0283:
            r0 = 0
        L_0x0284:
            if (r0 == 0) goto L_0x02a8
            il1.v5 r0 = r15.f190855n
            if (r0 == 0) goto L_0x0295
            int r0 = r0.f28817c
            if (r0 != r3) goto L_0x0290
            r0 = 1
            goto L_0x0291
        L_0x0290:
            r0 = 0
        L_0x0291:
            if (r0 != r3) goto L_0x0295
            r0 = 1
            goto L_0x0296
        L_0x0295:
            r0 = 0
        L_0x0296:
            if (r0 == 0) goto L_0x02a8
            il1.k6 r0 = r15.f190864w
            if (r0 == 0) goto L_0x02a4
            boolean r0 = r0.mo85420b()
            if (r0 != r3) goto L_0x02a4
            r0 = 1
            goto L_0x02a5
        L_0x02a4:
            r0 = 0
        L_0x02a5:
            if (r0 == 0) goto L_0x02a8
            goto L_0x02a9
        L_0x02a8:
            r3 = 0
        L_0x02a9:
            if (r3 == 0) goto L_0x02b6
            android.view.View r0 = r15.f190861t
            if (r0 != 0) goto L_0x02b0
            goto L_0x02b3
        L_0x02b0:
            r0.setEnabled(r1)
        L_0x02b3:
            r15.mo90418i3()
        L_0x02b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66297d2.mo90419j3():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        Class cls = C54108o.class;
        super.onActivityResult(i, i2, intent);
        Log.m105924i("Finder.FinderLivePostUIC", "onActivityResult requestCode:" + i3 + ", resultCode:" + i4);
        C60529u5 u5Var = this.f190854j;
        if (u5Var != null) {
            C54067f0.C54073k kVar = C54067f0.C54073k.LIVE_COVER_DEFAULT;
            if (i3 == u5Var.f172531n) {
                if (intent2 == null) {
                    ((C54108o) C86312j.m106911c(cls)).by0(kVar);
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8600a((C8777j5) c, 7, String.valueOf(5), (String) null, 4, (Object) null);
                } else {
                    Uri data = intent.getData();
                    String path = data != null ? data.getPath() : null;
                    Uri data2 = intent.getData();
                    if (Util.isNullOrNil(data2 != null ? data2.getPath() : null)) {
                        path = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(u5Var.f172524d, intent2, ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76713pw());
                    }
                    String str = u5Var.f172526f;
                    Log.m105924i(str, "filePath[" + path + "] " + intent2);
                    if (path == null) {
                        ((C54108o) C86312j.m106911c(cls)).by0(kVar);
                        C7335d c2 = C86312j.m106911c(cls);
                        C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8600a((C8777j5) c2, 7, String.valueOf(5), (String) null, 4, (Object) null);
                    } else {
                        C7777a0 a0Var = new C7777a0(u5Var.f172524d, 100111);
                        u5Var.f172532o = a0Var;
                        a0Var.mo8889a(path, C7777a0.f26271h.mo8891a(), 0.5625f, u5Var.f172524d.getResources().getColor(C0966R.color.a_j), true);
                        Uri data3 = intent.getData();
                        if (data3 == null) {
                            ((C54108o) C86312j.m106911c(cls)).by0(kVar);
                            C7335d c3 = C86312j.m106911c(cls);
                            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                            C8777j5.C8778a.m8600a((C8777j5) c3, 7, String.valueOf(5), (String) null, 4, (Object) null);
                        } else {
                            C54108o oVar = (C54108o) C86312j.m106911c(cls);
                            String uri = data3.toString();
                            C87412m.m108593f(uri, "dataFilePath.toString()");
                            oVar.by0(C112551y.m153819s(uri, "file://", false) ? C54067f0.C54073k.LIVE_COVER_FRONT_CAMERA : C54067f0.C54073k.LIVE_COVER_ALBUM);
                        }
                    }
                }
            } else if (i3 == 100111) {
                if (i4 == -1) {
                    CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = intent2 != null ? (CaptureDataManager.CaptureVideoNormalModel) intent2.getParcelableExtra("KSEGMENTMEDIAINFO") : null;
                    String str2 = u5Var.f172526f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("REQUEST_CODE_CROP_FIX_IMAGE model: ");
                    sb.append(captureVideoNormalModel != null ? captureVideoNormalModel.f272895f : null);
                    Log.m105924i(str2, sb.toString());
                    String str3 = captureVideoNormalModel != null ? captureVideoNormalModel.f272895f : null;
                    if (str3 == null || !C86013q1.m106450k(str3)) {
                        ((C54108o) C86312j.m106911c(cls)).by0(kVar);
                        C7335d c4 = C86312j.m106911c(cls);
                        C87412m.m108593f(c4, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8600a((C8777j5) c4, 7, String.valueOf(5), (String) null, 4, (Object) null);
                        String str4 = u5Var.f172526f;
                        Log.m105920e(str4, "ERROR! filePath=" + str3);
                    } else {
                        char c5 = C60971a.C60973b.f173670a.mo85945b().f174704a == 0 ? (char) 2 : 1;
                        ((C54108o) C86312j.m106911c(cls)).getClass();
                        String valueOf = C54108o.f151869h.f151439U == 6 ? c5 == 1 ? String.valueOf(6) : String.valueOf(7) : String.valueOf(8);
                        C7335d c6 = C86312j.m106911c(cls);
                        C87412m.m108593f(c6, "getService(HellLiveReport::class.java)");
                        C8777j5.C8778a.m8600a((C8777j5) c6, 7, valueOf, (String) null, 4, (Object) null);
                        C62042e eVar = C62042e.f176370a;
                        ImageView imageView = u5Var.f172527g;
                        eVar.mo86999E(imageView, str3, Math.min(imageView.getWidth(), 500), Math.min(u5Var.f172527g.getHeight(), 500));
                        u5Var.f172528h = str3;
                        u5Var.f172529i = "";
                        u5Var.f172530j = "";
                        u5Var.f172525e.onChange();
                    }
                }
                C7777a0 a0Var2 = u5Var.f172532o;
                if (a0Var2 != null) {
                    a0Var2.mo8890b(i4);
                }
            }
        }
        C60349b6 b6Var = this.f190853i;
        if (!(b6Var == null || i3 != 20000 || intent2 == null)) {
            b6Var.f172016f.mo83369h(intent2);
            b6Var.f172016f.mo83371k();
            C64311db1 a = b6Var.f172016f.mo83363a();
            if (Util.isNullOrNil(a != null ? a.f182664g : null)) {
                C64311db1 a2 = b6Var.f172016f.mo83363a();
                if (Util.isNullOrNil(a2 != null ? a2.f182663f : null)) {
                    b6Var.f172016f.mo83372l((C64311db1) null);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("poiClassifyId", Util.nullAs(intent2.getStringExtra("get_poi_classify_id"), ""));
            jSONObject.put("longitude", Float.valueOf(intent2.getFloatExtra("get_lng", -1000.0f)));
            jSONObject.put("latitude", Float.valueOf(intent2.getFloatExtra("get_lat", -85.0f)));
            jSONObject.put("city", Util.nullAs(intent2.getStringExtra("get_city"), ""));
            jSONObject.put("poiname", Util.nullAs(intent2.getStringExtra("get_poi_name"), ""));
            C7335d c7 = C86312j.m106911c(cls);
            C87412m.m108593f(c7, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8600a((C8777j5) c7, 9, jSONObject.toString(), (String) null, 4, (Object) null);
        }
        C60451k6 k6Var = this.f190864w;
        if (k6Var != null && i4 == -1 && i3 == 1003) {
            k6Var.mo85421c();
        }
        if (i4 == -1 && i3 == 1003) {
            if (intent2 != null && intent2.getBooleanExtra("KEY_START_LIVE", false)) {
                Log.m105924i("Finder.FinderLivePostUIC", "onActivityResult REQUEST_CODE_SELECT_TAG startLive by selected tag result");
                mo90419j3();
                return;
            }
            mo90414d3();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onBackPressed() {
        /*
            r6 = this;
            il1.u4 r0 = r6.f190856o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            android.view.ViewGroup r3 = r0.f28756b
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0015
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r0.f28758d
            r0.mo78802a()
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != r1) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x001e
            goto L_0x004c
        L_0x001e:
            int r0 = r6.f190867z
            int r3 = r6.f190848d
            r4 = 2
            r5 = 0
            if (r0 != r3) goto L_0x0035
            r6.f190867z = r2
            d60.b r0 = r6.f190850f
            if (r0 == 0) goto L_0x0031
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_HIDE_CAMERA_OPT_SHEET
            d60.C58124b.C7172a.m7372a(r0, r2, r5, r4, r5)
        L_0x0031:
            r6.mo90415e3()
            goto L_0x004c
        L_0x0035:
            int r3 = r6.f190849e
            if (r0 != r3) goto L_0x0048
            r6.f190867z = r2
            d60.b r0 = r6.f190850f
            if (r0 == 0) goto L_0x0044
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SELECT_HIDE
            d60.C58124b.C7172a.m7372a(r0, r2, r5, r4, r5)
        L_0x0044:
            r6.mo90415e3()
            goto L_0x004c
        L_0x0048:
            boolean r1 = super.onBackPressed()
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C66297d2.onBackPressed():boolean");
    }

    public void onClick(View view) {
        String str;
        Class cls = LiveAnchorSlice.class;
        Class cls2 = C54108o.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dwg) {
            C58124b bVar = this.f190850f;
            if (bVar != null) {
                C58124b.C7172a.m7372a(bVar, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            }
            C58124b bVar2 = this.f190850f;
            boolean z = true;
            int i = 0;
            if (bVar2 == null || bVar2.getLiveRole() != 1) {
                z = false;
            }
            if (z) {
                C45795b bVar3 = this.f190866y;
                if (bVar3 != null) {
                    i = ((LiveAnchorSlice) bVar3.mo71262a(cls)).f160032h;
                }
                C45795b bVar4 = this.f190866y;
                long j = bVar4 != null ? ((LiveAnchorSlice) bVar4.mo71262a(cls)).f160033i : 0;
                if (i == 0 || j == 0) {
                    str = "";
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("entrance_type", i);
                    jSONObject.put("entrance_id", j);
                    str = jSONObject.toString();
                }
                String str2 = str;
                C87412m.m108593f(str2, "if (entranceType != 0 &&… \"\"\n                    }");
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8600a((C8777j5) c, 13, str2, (String) null, 4, (Object) null);
                ((C54108o) C86312j.m106911c(cls2)).getClass();
                ((C54108o) C86312j.m106911c(cls2)).Gx0(C54108o.f151869h.f151433O);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(5874, this);
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_NET_SPEED_TIMESTAMP_LONG_SYNC, 0L);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Long");
        this.f190843D = ((Long) f).longValue();
    }

    public void onDestroy() {
        super.onDestroy();
        C60349b6 b6Var = this.f190853i;
        if (b6Var != null) {
            b6Var.f172017g = true;
        }
        C86709a0.m107524d().mo123470p(5874, this);
        FinderGameEventListener finderGameEventListener = this.f190841B;
        if (finderGameEventListener != null) {
            finderGameEventListener.dead();
        }
    }

    public void onNewIntent(Intent intent) {
        byte[] byteArrayExtra;
        super.onNewIntent(intent);
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_CHOSEN_TAG")) != null) {
            C45795b bVar = this.f190866y;
            C54991o oVar = bVar != null ? (C54991o) bVar.mo71262a(C54991o.class) : null;
            if (oVar != null) {
                C64848y91 y912 = new C64848y91();
                y912.parseFrom(byteArrayExtra);
                oVar.f154326i2 = y912;
            }
            View view = this.f190851g;
            if (view != null) {
                view.post(new C66299e(this));
            }
        }
    }

    public void onPause() {
        super.onPause();
        FinderLiveTaskBannerView finderLiveTaskBannerView = this.f190865x;
        if (finderLiveTaskBannerView != null) {
            finderLiveTaskBannerView.f160097p = false;
            finderLiveTaskBannerView.f160099r.removeMessages(finderLiveTaskBannerView.f160094j);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 80) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Log.m105924i("Finder.FinderLivePostUIC", "FinderLive request permission " + i + " failed");
                C77426q qVar = new C77426q(getContext());
                qVar.mo107606r(getContext().getResources().getString(C0966R.string.f360662e22));
                qVar.mo107595g(getContext().getResources().getString(C0966R.string.f360661e21));
                qVar.mo107602n(getContext().getResources().getString(C0966R.string.f360660e20));
                qVar.mo107600l(C15763o2.f42493a);
                qVar.mo107603o();
                return;
            }
            Log.m105924i("Finder.FinderLivePostUIC", "onRequestPermissionsResult microphone granted");
            mo90418i3();
        }
    }

    public void onResume() {
        C45795b bVar;
        C54754f fVar;
        ArrayList<C54768h6> arrayList;
        C45795b bVar2;
        C54754f fVar2;
        C62987t2 t2Var;
        C66089v vVar;
        C62987t2 t2Var2;
        C66089v vVar2;
        boolean z;
        Class cls = C62987t2.class;
        Class cls2 = C54991o.class;
        super.onResume();
        RelativeLayout relativeLayout = this.f190857p;
        if (relativeLayout != null) {
            relativeLayout.post(new C66300f(this));
        }
        FinderLiveTaskBannerView finderLiveTaskBannerView = this.f190865x;
        if (finderLiveTaskBannerView != null) {
            finderLiveTaskBannerView.f160097p = true;
            finderLiveTaskBannerView.mo78259d();
        }
        C39818r rVar = C39818r.f106831a;
        C9046k5 k5Var = ((C15717b2) rVar.mo62444c(getActivity()).mo75002a(C15717b2.class)).f42414d;
        if (k5Var != null) {
            k5Var.mo9870a();
        }
        ((C15798z1) rVar.mo62444c(getActivity()).mo75002a(C15798z1.class)).mo14499e3();
        C45795b bVar3 = this.f190866y;
        C54768h6 h6Var = null;
        C54991o oVar = bVar3 != null ? (C54991o) bVar3.mo71262a(cls2) : null;
        if (oVar != null) {
            oVar.f154305d3 = false;
        }
        C54991o oVar2 = (C54991o) FinderLiveService.f159376d.mo77630e(cls2);
        if (!(oVar2 != null ? oVar2.mo75999e4() : false) && (bVar = this.f190866y) != null && (fVar = ((C54991o) bVar.mo71262a(cls2)).f154232N2) != null && (arrayList = fVar.f153469f) != null) {
            Iterator<C54768h6> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C54768h6 next = it.next();
                if (next.f153499b == 2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    h6Var = next;
                    break;
                }
            }
            C54768h6 h6Var2 = h6Var;
            if (h6Var2 != null && (bVar2 = this.f190866y) != null && (fVar2 = ((C54991o) bVar2.mo71262a(cls2)).f154232N2) != null) {
                int i = fVar2.f153467d;
                FinderLiveService.f159376d.getClass();
                C56032b bVar4 = FinderLiveService.f159379g;
                if (!(bVar4 == null || (t2Var2 = (C62987t2) bVar4.getPlugin(cls)) == null || (vVar2 = t2Var2.f178716q) == null)) {
                    ((C65954a0) vVar2).mo89993N(h6Var2, i);
                }
                C56032b bVar5 = FinderLiveService.f159379g;
                if (bVar5 != null && (t2Var = (C62987t2) bVar5.getPlugin(cls)) != null && (vVar = t2Var.f178716q) != null) {
                    ((C65954a0) vVar).mo89996Y();
                }
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }

    public void onStop() {
        C54754f fVar;
        ArrayList<C54768h6> arrayList;
        T t;
        C45795b bVar;
        C54754f fVar2;
        C62987t2 t2Var;
        C66089v vVar;
        boolean z;
        C62987t2 t2Var2;
        C66089v vVar2;
        Class cls = C62987t2.class;
        Class cls2 = C54991o.class;
        C45795b bVar2 = this.f190866y;
        if (bVar2 != null && ((C54991o) bVar2.mo71262a(cls2)).f154305d3) {
            FinderLiveService.f159376d.getClass();
            C56032b bVar3 = FinderLiveService.f159379g;
            if (!(bVar3 == null || (t2Var2 = (C62987t2) bVar3.getPlugin(cls)) == null || (vVar2 = t2Var2.f178716q) == null)) {
                vVar2.hide();
            }
            C45795b bVar4 = this.f190866y;
            if (bVar4 != null && (fVar = ((C54991o) bVar4.mo71262a(cls2)).f154232N2) != null && (arrayList = fVar.f153469f) != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C54768h6) t).f153499b == 1) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C54768h6 h6Var = (C54768h6) t;
                if (h6Var != null && (bVar = this.f190866y) != null && (fVar2 = ((C54991o) bVar.mo71262a(cls2)).f154232N2) != null) {
                    int i = fVar2.f153467d;
                    FinderLiveService.f159376d.getClass();
                    C56032b bVar5 = FinderLiveService.f159379g;
                    if (bVar5 != null && (t2Var = (C62987t2) bVar5.getPlugin(cls)) != null && (vVar = t2Var.f178716q) != null) {
                        vVar.mo89990E0(h6Var, i);
                    }
                }
            }
        }
    }
}
