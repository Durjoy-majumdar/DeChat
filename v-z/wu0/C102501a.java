package wu0;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import p196ln.C76707h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vd3.C78399i;
import vu0.C102293d;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: wu0.a */
public final class C102501a extends BitmapDrawable implements C78399i.C78400a {

    /* renamed from: d */
    public final LifecycleScope f301814d;

    /* renamed from: e */
    public final String f301815e;

    /* renamed from: f */
    public final float f301816f;

    /* renamed from: g */
    public final boolean f301817g;

    /* renamed from: h */
    public final boolean f301818h;

    /* renamed from: i */
    public final Paint f301819i;

    /* renamed from: j */
    public boolean f301820j;

    /* renamed from: n */
    public boolean f301821n;

    /* renamed from: o */
    public Bitmap f301822o;

    /* renamed from: p */
    public final C13601g f301823p;

    /* renamed from: q */
    public final Runnable f301824q;

    /* renamed from: r */
    public final String f301825r;

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.drawable.AvatarBitmapDrawable$draw$loadBitmap$2$1", mo125469f = "AvatarBitmapDrawable.kt", mo125470l = {89}, mo125471m = "invokeSuspend")
    /* renamed from: wu0.a$a */
    public static final class C102502a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f301826d;

        /* renamed from: e */
        public final /* synthetic */ C102501a f301827e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102502a(C102501a aVar, C15601d<? super C102502a> dVar) {
            super(2, dVar);
            this.f301827e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C102502a(this.f301827e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C102502a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f301826d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C102501a aVar2 = this.f301827e;
                String str = aVar2.f301815e;
                float f = aVar2.f301816f;
                this.f301826d = 1;
                obj = ((C76707h) C86312j.m106911c(C76707h.class)).mo106994vb(str, f, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Bitmap) obj) != null) {
                C102501a aVar3 = this.f301827e;
                if (!aVar3.f301817g) {
                    ((MMHandler) ((C36570n) aVar3.f301823p).getValue()).postAtFrontOfQueue(this.f301827e.f301824q);
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.avatar.drawable.AvatarBitmapDrawable$draw$loadBitmap$2$loadBitmap$1", mo125469f = "AvatarBitmapDrawable.kt", mo125470l = {78}, mo125471m = "invokeSuspend")
    /* renamed from: wu0.a$b */
    public static final class C102503b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f301828d;

        /* renamed from: e */
        public final /* synthetic */ C102501a f301829e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102503b(C102501a aVar, C15601d<? super C102503b> dVar) {
            super(2, dVar);
            this.f301829e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C102503b(this.f301829e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C102503b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f301828d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C102501a aVar2 = this.f301829e;
                String str = aVar2.f301815e;
                float f = aVar2.f301816f;
                this.f301828d = 1;
                if (((C76707h) C86312j.m106911c(C76707h.class)).jo0(str, f, this) == aVar) {
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

    public C102501a(LifecycleScope lifecycleScope, String str, float f, boolean z, boolean z2, int i, C8480h hVar) {
        f = (i & 4) != 0 ? 0.1f : f;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        C87412m.m108594g(lifecycleScope, "workerScope");
        C87412m.m108594g(str, "username");
        this.f301814d = lifecycleScope;
        this.f301815e = str;
        this.f301816f = f;
        this.f301817g = z;
        this.f301818h = z2;
        Paint paint = new Paint();
        this.f301819i = paint;
        this.f301823p = C36568h.m40985a(C15594b.f42224d);
        this.f301824q = new C102504c(this);
        String A00 = ((C76707h) C86312j.m106911c(C76707h.class)).A00(str, f);
        this.f301825r = A00;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        C13601g<HashMap<String, List<WeakReference<C102501a>>>> gVar = C102293d.f301273f;
        HashMap hashMap = (HashMap) ((C36570n) C102293d.f301273f).getValue();
        Object obj = hashMap.get(A00);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(A00, obj);
        }
        ((List) obj).add(new WeakReference(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115 A[Catch:{ Exception -> 0x0120 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            java.lang.Class<ln.h> r0 = p196ln.C76707h.class
            java.lang.String r1 = "canvas"
            gy3.C87412m.m108594g(r13, r1)
            di3.d r1 = di3.C86312j.m106911c(r0)
            ln.h r1 = (p196ln.C76707h) r1
            java.lang.String r2 = r12.f301825r
            android.graphics.Bitmap r1 = r1.mo106988W2(r2)
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x012f
            boolean r4 = r12.f301820j
            if (r4 != 0) goto L_0x012f
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.tencent.p014mm.modelavatar.AvatarStorage.f195665d
            java.lang.String r4 = r12.f301815e
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x004b
            int r1 = r1.intValue()
            android.content.res.Resources r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            android.graphics.Bitmap r1 = p996kj.C88155a.decodeResource(r4, r1, r3)
            if (r1 == 0) goto L_0x0049
            float r4 = r12.f301816f
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0049
            int r5 = r1.getWidth()
            float r5 = (float) r5
            float r4 = r4 * r5
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r1, r2, r4)
        L_0x0049:
            if (r1 != 0) goto L_0x0122
        L_0x004b:
            boolean r1 = r12.f301817g     // Catch:{ Exception -> 0x0120 }
            r4 = 1
            if (r1 == 0) goto L_0x0112
            di3.d r1 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0120 }
            ln.h r1 = (p196ln.C76707h) r1     // Catch:{ Exception -> 0x0120 }
            java.lang.String r5 = r12.f301815e     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.vfs.m1 r1 = r1.u00(r5)     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.vfs.m1[] r1 = r1.mo119984u()     // Catch:{ Exception -> 0x0120 }
            if (r1 == 0) goto L_0x0086
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0120 }
            r5.<init>()     // Catch:{ Exception -> 0x0120 }
            int r6 = r1.length     // Catch:{ Exception -> 0x0120 }
            r7 = 0
        L_0x0069:
            if (r7 >= r6) goto L_0x0088
            r8 = r1[r7]     // Catch:{ Exception -> 0x0120 }
            java.lang.String r9 = r8.getName()     // Catch:{ Exception -> 0x0120 }
            java.lang.String r10 = "it.name"
            gy3.C87412m.m108593f(r9, r10)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r10 = "small_"
            boolean r9 = z04.C112551y.m153819s(r9, r10, r2)     // Catch:{ Exception -> 0x0120 }
            if (r9 == 0) goto L_0x0083
            r5.add(r8)     // Catch:{ Exception -> 0x0120 }
        L_0x0083:
            int r7 = r7 + 1
            goto L_0x0069
        L_0x0086:
            sx3.f0 r5 = sx3.C64186f0.f181907d     // Catch:{ Exception -> 0x0120 }
        L_0x0088:
            boolean r1 = r5.isEmpty()     // Catch:{ Exception -> 0x0120 }
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0112
            java.util.Iterator r1 = r5.iterator()     // Catch:{ Exception -> 0x0120 }
            boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x0120 }
            if (r5 == 0) goto L_0x010c
            java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x0120 }
            boolean r6 = r1.hasNext()     // Catch:{ Exception -> 0x0120 }
            if (r6 != 0) goto L_0x00a4
            goto L_0x00c2
        L_0x00a4:
            r6 = r5
            com.tencent.mm.vfs.m1 r6 = (com.tencent.p014mm.vfs.C86009m1) r6     // Catch:{ Exception -> 0x0120 }
            long r6 = r6.mo119979q()     // Catch:{ Exception -> 0x0120 }
        L_0x00ab:
            java.lang.Object r8 = r1.next()     // Catch:{ Exception -> 0x0120 }
            r9 = r8
            com.tencent.mm.vfs.m1 r9 = (com.tencent.p014mm.vfs.C86009m1) r9     // Catch:{ Exception -> 0x0120 }
            long r9 = r9.mo119979q()     // Catch:{ Exception -> 0x0120 }
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x00bc
            r5 = r8
            r6 = r9
        L_0x00bc:
            boolean r8 = r1.hasNext()     // Catch:{ Exception -> 0x0120 }
            if (r8 != 0) goto L_0x00ab
        L_0x00c2:
            com.tencent.mm.vfs.m1 r5 = (com.tencent.p014mm.vfs.C86009m1) r5     // Catch:{ Exception -> 0x0120 }
            java.lang.String r1 = r5.mo119971i()     // Catch:{ Exception -> 0x0120 }
            java.lang.String r5 = "avatarImgFileList.maxBy …Modified() }.absolutePath"
            gy3.C87412m.m108593f(r1, r5)     // Catch:{ Exception -> 0x0120 }
            r5 = 156(0x9c, float:2.19E-43)
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r1, r5, r5)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r6 = "MicroMsg.Avatar.AvatarBitmapDrawable"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0120 }
            r7.<init>()     // Catch:{ Exception -> 0x0120 }
            java.lang.String r8 = "load sync file bitmap "
            r7.append(r8)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r8 = r12.f301815e     // Catch:{ Exception -> 0x0120 }
            r7.append(r8)     // Catch:{ Exception -> 0x0120 }
            r8 = 32
            r7.append(r8)     // Catch:{ Exception -> 0x0120 }
            r7.append(r1)     // Catch:{ Exception -> 0x0120 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x0120 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)     // Catch:{ Exception -> 0x0120 }
            float r1 = r12.f301816f     // Catch:{ Exception -> 0x0120 }
            int r6 = r5.getWidth()     // Catch:{ Exception -> 0x0120 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x0120 }
            float r1 = r1 * r6
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRoundedCornerBitmap(r5, r4, r1)     // Catch:{ Exception -> 0x0120 }
            com.tencent.mm.sdk.coroutines.LifecycleScope r5 = r12.f301814d     // Catch:{ Exception -> 0x0120 }
            wu0.a$b r6 = new wu0.a$b     // Catch:{ Exception -> 0x0120 }
            r6.<init>(r12, r3)     // Catch:{ Exception -> 0x0120 }
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r5, r3, r6, r4, r3)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0113
        L_0x010c:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x0120 }
            r1.<init>()     // Catch:{ Exception -> 0x0120 }
            throw r1     // Catch:{ Exception -> 0x0120 }
        L_0x0112:
            r1 = r3
        L_0x0113:
            if (r1 != 0) goto L_0x0122
            com.tencent.mm.sdk.coroutines.LifecycleScope r5 = r12.f301814d     // Catch:{ Exception -> 0x0120 }
            wu0.a$a r6 = new wu0.a$a     // Catch:{ Exception -> 0x0120 }
            r6.<init>(r12, r3)     // Catch:{ Exception -> 0x0120 }
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r5, r3, r6, r4, r3)     // Catch:{ Exception -> 0x0120 }
            goto L_0x0122
        L_0x0120:
            r1 = r3
        L_0x0122:
            if (r1 == 0) goto L_0x012f
            di3.d r4 = di3.C86312j.m106911c(r0)
            ln.h r4 = (p196ln.C76707h) r4
            java.lang.String r5 = r12.f301825r
            r4.mo106984CO(r5, r1)
        L_0x012f:
            if (r1 != 0) goto L_0x0140
            di3.d r0 = di3.C86312j.m106911c(r0)
            ln.h r0 = (p196ln.C76707h) r0
            android.graphics.Bitmap r1 = r0.Vw0()
            boolean r0 = r12.f301820j
            r12.f301821n = r0
            goto L_0x0142
        L_0x0140:
            r12.f301821n = r2
        L_0x0142:
            r12.f301822o = r1
            boolean r0 = r12.f301818h
            if (r0 == 0) goto L_0x0167
            int r0 = r1.getHeight()
            int r0 = r0 / 15
            int r0 = r0 / 2
            int r2 = r1.getWidth()
            int r2 = r2 / 15
            int r2 = r2 / 2
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r1.getWidth()
            int r4 = r4 - r2
            int r5 = r1.getHeight()
            int r5 = r5 - r0
            r3.<init>(r2, r0, r4, r5)
        L_0x0167:
            android.graphics.Rect r0 = r12.getBounds()
            android.graphics.Paint r2 = r12.f301819i
            r13.drawBitmap(r1, r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wu0.C102501a.draw(android.graphics.Canvas):void");
    }

    public void onScrollStateChanged(boolean z) {
        Log.m105918d("MicroMsg.Avatar.AvatarBitmapDrawable", "needStop " + z);
        if (z) {
            this.f301820j = true;
        } else if (this.f301820j) {
            this.f301820j = false;
            if (this.f301821n) {
                this.f301821n = false;
                invalidateSelf();
            }
        }
    }
}
