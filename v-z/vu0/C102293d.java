package vu0;

import a14.C0000n0;
import a14.C53934p0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import di3.C7335d;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C45747a;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import n20.C61605g;
import oa1.C117731d;
import p196ln.C76707h;
import p206nj.C11171e;
import p823sg.C90193h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tf3.C37067c;
import wu0.C102501a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;

@C86522b
/* renamed from: vu0.d */
public final class C102293d extends C86301e implements C76707h {

    /* renamed from: f */
    public static final C13601g<HashMap<String, List<WeakReference<C102501a>>>> f301273f = C36568h.m40985a(C37837a.f100188d);

    /* renamed from: d */
    public final C13601g f301274d = C36568h.m40985a(C37839c.f100189d);

    /* renamed from: e */
    public final C13601g f301275e = C36568h.m40985a(C37840d.f100190d);

    /* renamed from: vu0.d$a */
    public static final class C37837a extends C87413o implements C32224a<HashMap<String, List<WeakReference<C102501a>>>> {

        /* renamed from: d */
        public static final C37837a f100188d = new C37837a();

        public C37837a() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: vu0.d$b */
    public static final class C37838b {
        public C37838b(C8480h hVar) {
        }
    }

    /* renamed from: vu0.d$c */
    public static final class C37839c extends C87413o implements C32224a<Bitmap> {

        /* renamed from: d */
        public static final C37839c f100189d = new C37839c();

        public C37839c() {
            super(0);
        }

        public Object invoke() {
            return BitmapFactory.decodeResource(MMApplicationContext.getResources(), C0966R.C0969drawable.bfa);
        }
    }

    /* renamed from: vu0.d$d */
    public static final class C37840d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C37840d f100190d = new C37840d();

        public C37840d() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return "wcf://avatar/";
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.AvatarImageLoaderFeatureService$javaTriggerUpdate$1", mo125469f = "AvatarImageLoaderFeatureService.kt", mo125470l = {241}, mo125471m = "invokeSuspend")
    /* renamed from: vu0.d$e */
    public static final class C37841e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f100191d;

        /* renamed from: e */
        public final /* synthetic */ String f100192e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37841e(String str, C15601d<? super C37841e> dVar) {
            super(2, dVar);
            this.f100192e = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C37841e(this.f100192e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C37841e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f100191d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C7335d c = C86312j.m106911c(C76707h.class);
                C87412m.m108593f(c, "getService(IAvatarImageL…atureService::class.java)");
                String str = this.f100192e;
                this.f100191d = 1;
                if (((C76707h) c).jo0(str, 0.1f, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.AvatarImageLoaderFeatureService", mo125469f = "AvatarImageLoaderFeatureService.kt", mo125470l = {169}, mo125471m = "loadHdHeadPath")
    /* renamed from: vu0.d$f */
    public static final class C102294f extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f301276d;

        /* renamed from: e */
        public final /* synthetic */ C102293d f301277e;

        /* renamed from: f */
        public int f301278f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102294f(C102293d dVar, C15601d<? super C102294f> dVar2) {
            super(dVar2);
            this.f301277e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f301276d = obj;
            this.f301278f |= Integer.MIN_VALUE;
            return this.f301277e.mo106996zb((String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.AvatarImageLoaderFeatureService", mo125469f = "AvatarImageLoaderFeatureService.kt", mo125470l = {107}, mo125471m = "loadHeadBitmap")
    /* renamed from: vu0.d$g */
    public static final class C102295g extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f301279d;

        /* renamed from: e */
        public final /* synthetic */ C102293d f301280e;

        /* renamed from: f */
        public int f301281f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102295g(C102293d dVar, C15601d<? super C102295g> dVar2) {
            super(dVar2);
            this.f301280e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f301279d = obj;
            this.f301281f |= Integer.MIN_VALUE;
            return this.f301280e.mo106994vb((String) null, 0.0f, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.AvatarImageLoaderFeatureService", mo125469f = "AvatarImageLoaderFeatureService.kt", mo125470l = {141}, mo125471m = "updateHeadBitmap")
    /* renamed from: vu0.d$h */
    public static final class C102296h extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f301282d;

        /* renamed from: e */
        public final /* synthetic */ C102293d f301283e;

        /* renamed from: f */
        public int f301284f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102296h(C102293d dVar, C15601d<? super C102296h> dVar2) {
            super(dVar2);
            this.f301283e = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f301282d = obj;
            this.f301284f |= Integer.MIN_VALUE;
            return this.f301283e.jo0((String) null, 0.0f, this);
        }
    }

    static {
        new C37838b((C8480h) null);
    }

    public String A00(String str, float f) {
        C61605g gVar = new C61605g(156, 156);
        gVar.f175194c = f;
        return vx0(str, 0, gVar);
    }

    /* renamed from: CO */
    public void mo106984CO(String str, Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        if (!(str == null || C112551y.m153811k(str))) {
            C68102u.wx0().mo93569r(str, bitmap);
        }
    }

    /* renamed from: F1 */
    public void mo106985F1(String str) {
        if (!(str == null || C112551y.m153811k(str))) {
            C68102u.wx0().getClass();
            AvatarStorage.f195666e.mo93573a(str);
        }
    }

    /* renamed from: QU */
    public void mo106986QU(ImageView imageView, String str, float f) {
        LifecycleScope lifecycleScope;
        C87412m.m108594g(imageView, "imageView");
        if (!(str == null || C112551y.m153811k(str)) && (lifecycleScope = C86709a0.m107523b().f251755f.f123611e) != null) {
            imageView.setImageDrawable(new C102501a(lifecycleScope, str, f, imageView.getScaleType() == ImageView.ScaleType.CENTER_CROP, false, 16, (C8480h) null));
        }
    }

    public Bitmap Vw0() {
        Bitmap bitmap = (Bitmap) ((C36570n) this.f301274d).getValue();
        C87412m.m108593f(bitmap, "_defaultAvatarBitmap");
        return bitmap;
    }

    /* renamed from: W2 */
    public Bitmap mo106988W2(String str) {
        if (str == null || C112551y.m153811k(str)) {
            return null;
        }
        return C68102u.wx0().mo93561j(str);
    }

    /* renamed from: WS */
    public void mo106989WS(String str) {
        LifecycleScope lifecycleScope;
        if (mo106990am(str)) {
            Log.m105924i("MicroMsg.AvatarImageLoaderFeatureService", "javaTriggerUpdate " + str);
            C45747a aVar = C86709a0.m107523b().f251755f;
            if (aVar != null && (lifecycleScope = aVar.f123611e) != null) {
                LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C37841e(str, (C15601d<? super C37841e>) null), 1, (Object) null);
            }
        }
    }

    /* renamed from: am */
    public boolean mo106990am(String str) {
        if (str == null || C117731d.m166007c().mo182440a(new C37067c()) != 1 || !C11171e.m11046c(28) || C87412m.m108589b(str, C75592q0.m90789s()) || C112551y.m153819s(str, "gh_", false)) {
            return false;
        }
        return !C112550d0.m153801u(str, "@", false) || C72996z1.m85820U5(str) || C72996z1.m85843n5(str);
    }

    /* renamed from: g4 */
    public void mo106991g4(ImageView imageView, String str) {
        LifecycleScope lifecycleScope;
        C87412m.m108594g(imageView, "imageView");
        if (!(str == null || C112551y.m153811k(str)) && (lifecycleScope = C86709a0.m107523b().f251755f.f123611e) != null) {
            imageView.setImageDrawable(new C102501a(lifecycleScope, str, 0.1f, true, false, 16, (C8480h) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object jo0(java.lang.String r12, float r13, wx3.C15601d<? super android.graphics.Bitmap> r14) {
        /*
            r11 = this;
            java.lang.Class<ln.h> r0 = p196ln.C76707h.class
            boolean r1 = r14 instanceof vu0.C102293d.C102296h
            if (r1 == 0) goto L_0x0015
            r1 = r14
            vu0.d$h r1 = (vu0.C102293d.C102296h) r1
            int r2 = r1.f301284f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f301284f = r2
            goto L_0x001a
        L_0x0015:
            vu0.d$h r1 = new vu0.d$h
            r1.<init>(r11, r14)
        L_0x001a:
            r8 = r1
            java.lang.Object r14 = r8.f301282d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r8.f301284f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00ca
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = 0
            if (r12 == 0) goto L_0x0042
            boolean r2 = z04.C112551y.m153811k(r12)
            if (r2 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r2 = 0
            goto L_0x0043
        L_0x0042:
            r2 = 1
        L_0x0043:
            if (r2 == 0) goto L_0x0047
            r12 = 0
            return r12
        L_0x0047:
            r2 = 7
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<xu0.e> r4 = xu0.C102728e.class
            r2[r14] = r4
            java.lang.Class<xu0.a> r4 = xu0.C102724a.class
            r2[r3] = r4
            r4 = 2
            java.lang.Class<xu0.j> r5 = xu0.C102738j.class
            r2[r4] = r5
            r4 = 3
            java.lang.Class<xu0.g> r5 = xu0.C102731g.class
            r2[r4] = r5
            r4 = 4
            java.lang.Class<xu0.h> r5 = xu0.C102732h.class
            r2[r4] = r5
            r4 = 5
            java.lang.Class<n20.c> r5 = n20.C100033c.class
            r2[r4] = r5
            r4 = 6
            java.lang.Class<xu0.i> r5 = xu0.C102736i.class
            r2[r4] = r5
            java.util.List r4 = sx3.C64197v.m75539h(r2)
            n20.g r2 = new n20.g
            r5 = 156(0x9c, float:2.19E-43)
            r2.<init>(r5, r5)
            r2.f175194c = r13
            di3.d r13 = di3.C86312j.m106911c(r0)
            ln.h r13 = (p196ln.C76707h) r13
            android.graphics.Bitmap r13 = r13.Vw0()
            r2.f175196e = r13
            java.lang.String r13 = r11.vx0(r12, r14, r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.h r0 = (p196ln.C76707h) r0
            com.tencent.mm.vfs.m1 r0 = r0.u00(r12)
            com.tencent.mm.sdk.pipeline.PipelineState r5 = new com.tencent.mm.sdk.pipeline.PipelineState
            r5.<init>()
            java.lang.String r6 = "Common_BitmapOptions"
            r5.put(r6, r2)
            java.lang.String r2 = "Common_ImageKey"
            r5.put(r2, r13)
            java.lang.String r13 = "Common_TempFolder"
            r5.put(r13, r0)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r14)
            java.lang.String r14 = "Avatar_HdFlag"
            r5.put(r14, r13)
            java.lang.String r13 = "Avatar_Username"
            r5.put(r13, r12)
            com.tencent.mm.sdk.pipeline.Pipeline$Companion r2 = com.tencent.p014mm.sdk.pipeline.Pipeline.Companion
            r6 = 0
            r9 = 8
            r10 = 0
            r8.f301284f = r3
            java.lang.String r12 = "AvatarImageLoader"
            r3 = r4
            r4 = r5
            r5 = r12
            java.lang.Object r14 = com.tencent.p014mm.sdk.pipeline.Pipeline.Companion.startSyncPipelineForResult$default(r2, r3, r4, r5, r6, r8, r9, r10)
            if (r14 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            com.tencent.mm.sdk.pipeline.PipelineResult r14 = (com.tencent.p014mm.sdk.pipeline.PipelineResult) r14
            com.tencent.mm.sdk.pipeline.PipelineState r12 = r14.getData()
            java.lang.String r13 = "Avatar_ImgBitmap"
            java.lang.Object r12 = r12.get(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vu0.C102293d.jo0(java.lang.String, float, wx3.d):java.lang.Object");
    }

    public C86009m1 u00(String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr = null;
        }
        String f = C90193h.m112878f(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append((String) ((C36570n) this.f301275e).getValue());
        C87412m.m108593f(f, "md5");
        String substring = f.substring(0, 2);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        String substring2 = f.substring(2, 4);
        C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring2);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        sb.append(f);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        C86009m1 m1Var = new C86009m1(sb.toString());
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
        }
        return m1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: vb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo106994vb(java.lang.String r12, float r13, wx3.C15601d<? super android.graphics.Bitmap> r14) {
        /*
            r11 = this;
            java.lang.Class<ln.h> r0 = p196ln.C76707h.class
            boolean r1 = r14 instanceof vu0.C102293d.C102295g
            if (r1 == 0) goto L_0x0015
            r1 = r14
            vu0.d$g r1 = (vu0.C102293d.C102295g) r1
            int r2 = r1.f301281f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f301281f = r2
            goto L_0x001a
        L_0x0015:
            vu0.d$g r1 = new vu0.d$g
            r1.<init>(r11, r14)
        L_0x001a:
            r8 = r1
            java.lang.Object r14 = r8.f301279d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r8.f301281f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00ca
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = 0
            if (r12 == 0) goto L_0x0042
            boolean r2 = z04.C112551y.m153811k(r12)
            if (r2 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r2 = 0
            goto L_0x0043
        L_0x0042:
            r2 = 1
        L_0x0043:
            if (r2 == 0) goto L_0x0047
            r12 = 0
            return r12
        L_0x0047:
            r2 = 7
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<xu0.e> r4 = xu0.C102728e.class
            r2[r14] = r4
            java.lang.Class<xu0.a> r4 = xu0.C102724a.class
            r2[r3] = r4
            r4 = 2
            java.lang.Class<xu0.f> r5 = xu0.C102730f.class
            r2[r4] = r5
            r4 = 3
            java.lang.Class<xu0.g> r5 = xu0.C102731g.class
            r2[r4] = r5
            r4 = 4
            java.lang.Class<xu0.h> r5 = xu0.C102732h.class
            r2[r4] = r5
            r4 = 5
            java.lang.Class<n20.c> r5 = n20.C100033c.class
            r2[r4] = r5
            r4 = 6
            java.lang.Class<xu0.i> r5 = xu0.C102736i.class
            r2[r4] = r5
            java.util.List r4 = sx3.C64197v.m75539h(r2)
            n20.g r2 = new n20.g
            r5 = 156(0x9c, float:2.19E-43)
            r2.<init>(r5, r5)
            r2.f175194c = r13
            di3.d r13 = di3.C86312j.m106911c(r0)
            ln.h r13 = (p196ln.C76707h) r13
            android.graphics.Bitmap r13 = r13.Vw0()
            r2.f175196e = r13
            java.lang.String r13 = r11.vx0(r12, r14, r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.h r0 = (p196ln.C76707h) r0
            com.tencent.mm.vfs.m1 r0 = r0.u00(r12)
            com.tencent.mm.sdk.pipeline.PipelineState r5 = new com.tencent.mm.sdk.pipeline.PipelineState
            r5.<init>()
            java.lang.String r6 = "Common_BitmapOptions"
            r5.put(r6, r2)
            java.lang.String r2 = "Common_ImageKey"
            r5.put(r2, r13)
            java.lang.String r13 = "Common_TempFolder"
            r5.put(r13, r0)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r14)
            java.lang.String r14 = "Avatar_HdFlag"
            r5.put(r14, r13)
            java.lang.String r13 = "Avatar_Username"
            r5.put(r13, r12)
            com.tencent.mm.sdk.pipeline.Pipeline$Companion r2 = com.tencent.p014mm.sdk.pipeline.Pipeline.Companion
            r6 = 0
            r9 = 8
            r10 = 0
            r8.f301281f = r3
            java.lang.String r12 = "AvatarImageLoader"
            r3 = r4
            r4 = r5
            r5 = r12
            java.lang.Object r14 = com.tencent.p014mm.sdk.pipeline.Pipeline.Companion.startSyncPipelineForResult$default(r2, r3, r4, r5, r6, r8, r9, r10)
            if (r14 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            com.tencent.mm.sdk.pipeline.PipelineResult r14 = (com.tencent.p014mm.sdk.pipeline.PipelineResult) r14
            com.tencent.mm.sdk.pipeline.PipelineState r12 = r14.getData()
            java.lang.String r13 = "Avatar_ImgBitmap"
            java.lang.Object r12 = r12.get(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: vu0.C102293d.mo106994vb(java.lang.String, float, wx3.d):java.lang.Object");
    }

    public String vx0(String str, int i, C61605g gVar) {
        C87412m.m108594g(gVar, "options");
        return "key_" + str + '_' + i + '_' + gVar.f175194c + '_' + 0.0f;
    }

    /* renamed from: z */
    public void mo106995z(ImageView imageView, String str) {
        C87412m.m108594g(imageView, "imageView");
        if (!(str == null || C112551y.m153811k(str))) {
            mo106986QU(imageView, str, 0.1f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: zb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo106996zb(java.lang.String r9, wx3.C15601d<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof vu0.C102293d.C102294f
            if (r0 == 0) goto L_0x0013
            r0 = r10
            vu0.d$f r0 = (vu0.C102293d.C102294f) r0
            int r1 = r0.f301278f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f301278f = r1
            goto L_0x0018
        L_0x0013:
            vu0.d$f r0 = new vu0.d$f
            r0.<init>(r8, r10)
        L_0x0018:
            r7 = r0
            java.lang.Object r10 = r7.f301276d
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f301278f
            r2 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 != r2) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00b4
        L_0x0029:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = 0
            if (r9 == 0) goto L_0x0040
            boolean r1 = z04.C112551y.m153811k(r9)
            if (r1 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r1 = 0
            goto L_0x0041
        L_0x0040:
            r1 = 1
        L_0x0041:
            if (r1 == 0) goto L_0x0045
            r9 = 0
            return r9
        L_0x0045:
            r1 = 7
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<xu0.e> r3 = xu0.C102728e.class
            r1[r10] = r3
            java.lang.Class<xu0.a> r10 = xu0.C102724a.class
            r1[r2] = r10
            r10 = 2
            java.lang.Class<xu0.k> r3 = xu0.C102739k.class
            r1[r10] = r3
            r10 = 3
            java.lang.Class<xu0.g> r3 = xu0.C102731g.class
            r1[r10] = r3
            r10 = 4
            java.lang.Class<xu0.h> r3 = xu0.C102732h.class
            r1[r10] = r3
            r10 = 5
            java.lang.Class<xu0.l> r3 = xu0.C102740l.class
            r1[r10] = r3
            r10 = 6
            java.lang.Class<xu0.i> r3 = xu0.C102736i.class
            r1[r10] = r3
            java.util.List r10 = sx3.C64197v.m75539h(r1)
            n20.g r1 = new n20.g
            r3 = 1080(0x438, float:1.513E-42)
            r1.<init>(r3, r3)
            java.lang.String r1 = r8.vx0(r9, r2, r1)
            java.lang.Class<ln.h> r3 = p196ln.C76707h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.h r3 = (p196ln.C76707h) r3
            com.tencent.mm.vfs.m1 r3 = r3.u00(r9)
            com.tencent.mm.sdk.pipeline.PipelineState r4 = new com.tencent.mm.sdk.pipeline.PipelineState
            r4.<init>()
            java.lang.String r5 = "Common_ImageKey"
            r4.put(r5, r1)
            java.lang.String r1 = "Common_TempFolder"
            r4.put(r1, r3)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            java.lang.String r3 = "Avatar_HdFlag"
            r4.put(r3, r1)
            java.lang.String r1 = "Avatar_Username"
            r4.put(r1, r9)
            com.tencent.mm.sdk.pipeline.Pipeline$Companion r1 = com.tencent.p014mm.sdk.pipeline.Pipeline.Companion
            r5 = 30000(0x7530, double:1.4822E-319)
            r7.f301278f = r2
            java.lang.String r9 = "HdAvatarImageLoader"
            r2 = r10
            r3 = r4
            r4 = r9
            java.lang.Object r10 = r1.startSyncPipelineForResult(r2, r3, r4, r5, r7)
            if (r10 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            com.tencent.mm.sdk.pipeline.PipelineResult r10 = (com.tencent.p014mm.sdk.pipeline.PipelineResult) r10
            com.tencent.mm.sdk.pipeline.PipelineState r9 = r10.getData()
            java.lang.String r10 = "Avatar_HdImgPath"
            java.lang.String r0 = ""
            java.lang.String r9 = r9.getString(r10, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vu0.C102293d.mo106996zb(java.lang.String, wx3.d):java.lang.Object");
    }
}
