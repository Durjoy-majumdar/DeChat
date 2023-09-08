package nk1;

import android.graphics.Bitmap;
import android.view.View;
import c60.C54667b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ok1.C11464n;
import ok1.C62042e;
import p1028re.C89928a;
import p1028re.C89931d;
import r60.C101350i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import t60.C64207e;
import x60.C102564a;
import zt3.C119157j;

/* renamed from: nk1.b */
public final class C11193b {

    /* renamed from: a */
    public static final C11193b f33003a = new C11193b();

    /* renamed from: b */
    public static final LruCache<String, Bitmap> f33004b = new LruCache<>(5);

    /* renamed from: c */
    public static final C13601g f33005c = C36568h.m40985a(C11195b.f33006d);

    /* renamed from: nk1.b$a */
    public static final class C11194a implements C89928a {
        /* renamed from: a */
        public void mo391a(int i) {
            C11193b.m11050a(C11193b.f33003a, "systemTrim");
        }

        /* renamed from: b */
        public void mo392b() {
            C11193b.m11050a(C11193b.f33003a, "backgroundTrim");
        }
    }

    /* renamed from: nk1.b$b */
    public static final class C11195b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C11195b f33006d = new C11195b();

        public C11195b() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
        }
    }

    /* renamed from: nk1.b$c */
    public static final class C11196c<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ View f33007a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f33008b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<String> f33009c;

        public C11196c(View view, C32226l<? super Boolean, C13598b0> lVar, C8479f0<String> f0Var) {
            this.f33007a = view;
            this.f33008b = lVar;
            this.f33009c = f0Var;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C62042e eVar = C62042e.f176370a;
                View view = this.f33007a;
                C11197c cVar = new C11197c(this.f33009c, this.f33008b);
                eVar.getClass();
                C87412m.m108594g(view, "view");
                int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_6);
                C11464n nVar = new C11464n(view, cVar);
                ((C119157j) C119157j.f356862d).mo183875f(new C54667b(bitmap, nVar, 8.0f, color));
                return;
            }
            C11193b bVar = C11193b.f33003a;
            Log.m105924i("BlurAvatarUtil", "loadAvatarBlurBg resource is null!");
            C32226l<Boolean, C13598b0> lVar = this.f33008b;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }
    }

    static {
        Log.m105924i("BlurAvatarUtil", "initMemoryTrim");
        C89931d.f258426c.mo124253c(new C11194a());
    }

    /* renamed from: a */
    public static final void m11050a(C11193b bVar, String str) {
        bVar.getClass();
        try {
            LruCache<String, Bitmap> lruCache = f33004b;
            int size = lruCache.size();
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("BlurAvatarUtil", str + " cache Size:" + size);
            if (size > 0) {
                lruCache.evictAll();
            }
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "BlurAvatarUtil-memoryTrim");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: rx3.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: rx3.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: rx3.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: rx3.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: rx3.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: rx3.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11281b(java.lang.String r10, java.lang.String r11, android.view.View r12, fy3.C32226l<? super java.lang.Boolean, rx3.C13598b0> r13) {
        /*
            r9 = this;
            java.lang.String r0 = "liveCoverUrl"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r12, r0)
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            int r1 = r11.length()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            r4 = 0
            if (r1 == 0) goto L_0x0043
            fe1.d$b r1 = fe1.C58961d.f168673a
            fe1.q r5 = r1.mo84155b(r10)
            if (r5 == 0) goto L_0x0029
            java.lang.String r5 = r5.field_liveCoverImg
            goto L_0x002a
        L_0x0029:
            r5 = r4
        L_0x002a:
            if (r5 == 0) goto L_0x0035
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r6 = 0
            goto L_0x0036
        L_0x0035:
            r6 = 1
        L_0x0036:
            if (r6 == 0) goto L_0x0044
            fe1.q r1 = r1.mo84155b(r10)
            if (r1 == 0) goto L_0x0041
            java.lang.String r5 = r1.field_avatarUrl
            goto L_0x0044
        L_0x0041:
            r5 = r4
            goto L_0x0044
        L_0x0043:
            r5 = r11
        L_0x0044:
            r0.f27484d = r5
            if (r5 == 0) goto L_0x0051
            int r1 = r5.length()
            if (r1 != 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r1 = 0
            goto L_0x0052
        L_0x0051:
            r1 = 1
        L_0x0052:
            if (r1 == 0) goto L_0x007f
            java.lang.String r12 = "BlurAvatarUtil"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadAvatarBlurBg anchorUsername:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = ",liveCoverUrl:"
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = " and coverUrl is empty!"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
            if (r13 == 0) goto L_0x007e
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r13.invoke(r10)
        L_0x007e:
            return r2
        L_0x007f:
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, android.graphics.Bitmap> r10 = f33004b
            monitor-enter(r10)
            T r11 = r0.f27484d     // Catch:{ all -> 0x024d }
            java.lang.Object r11 = r10.get(r11)     // Catch:{ all -> 0x024d }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x024d }
            monitor-exit(r10)
            java.lang.String r1 = "BlurAvatarUtil"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "loadAvatarBlurBg coverUrl:"
            r5.append(r6)
            T r6 = r0.f27484d
            java.lang.String r6 = (java.lang.String) r6
            r5.append(r6)
            java.lang.String r6 = ",cache bm is null:"
            r5.append(r6)
            if (r11 != 0) goto L_0x00a7
            r6 = 1
            goto L_0x00a8
        L_0x00a7:
            r6 = 0
        L_0x00a8:
            r5.append(r6)
            r6 = 33
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            if (r11 == 0) goto L_0x0218
            boolean r1 = r12 instanceof android.widget.ImageView
            if (r1 == 0) goto L_0x00d4
            r10 = r12
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r1.<init>(r2, r11)
            r10.setImageDrawable(r1)
            goto L_0x020e
        L_0x00d4:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r1)
            int r5 = r1.y
            float r5 = (float) r5
            int r1 = r1.x
            float r1 = (float) r1
            float r5 = r5 / r1
            int r1 = r11.getHeight()
            float r1 = (float) r1
            int r6 = r11.getWidth()
            float r6 = (float) r6
            float r1 = r1 / r6
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00f4
            r6 = 1
            goto L_0x00f5
        L_0x00f4:
            r6 = 0
        L_0x00f5:
            if (r6 == 0) goto L_0x010d
            rx3.l r1 = new rx3.l
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            android.util.Size r6 = new android.util.Size
            int r7 = r11.getWidth()
            int r8 = r11.getHeight()
            r6.<init>(r7, r8)
            r1.<init>(r5, r6)
            goto L_0x0196
        L_0x010d:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0122
            android.util.Size r1 = new android.util.Size
            int r6 = r11.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r5
            int r5 = (int) r6
            int r6 = r11.getHeight()
            r1.<init>(r5, r6)
            goto L_0x0133
        L_0x0122:
            android.util.Size r1 = new android.util.Size
            int r6 = r11.getWidth()
            int r7 = r11.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r5
            int r5 = (int) r7
            r1.<init>(r6, r5)
        L_0x0133:
            int r5 = r1.getWidth()
            if (r5 == 0) goto L_0x0182
            int r5 = r1.getHeight()
            if (r5 == 0) goto L_0x0182
            int r5 = r1.getWidth()
            int r6 = r11.getWidth()
            int r5 = r5 - r6
            int r5 = java.lang.Math.abs(r5)
            rx3.g r6 = f33005c
            r7 = r6
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r5 >= r7) goto L_0x0179
            int r5 = r1.getHeight()
            int r7 = r11.getHeight()
            int r5 = r5 - r7
            int r5 = java.lang.Math.abs(r5)
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r5 >= r6) goto L_0x0179
            goto L_0x0182
        L_0x0179:
            rx3.l r5 = new rx3.l
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.<init>(r6, r1)
            r1 = r5
            goto L_0x0196
        L_0x0182:
            rx3.l r1 = new rx3.l
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            android.util.Size r6 = new android.util.Size
            int r7 = r11.getWidth()
            int r8 = r11.getHeight()
            r6.<init>(r7, r8)
            r1.<init>(r5, r6)
        L_0x0196:
            A r5 = r1.f38555d
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x01f9
            B r5 = r1.f38556e
            android.util.Size r5 = (android.util.Size) r5
            int r5 = r5.getWidth()
            B r1 = r1.f38556e
            android.util.Size r1 = (android.util.Size) r1
            int r1 = r1.getHeight()
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(r11, r5, r1, r2)
            if (r1 == 0) goto L_0x01fa
            T r2 = r0.f27484d
            r10.put(r2, r1)
            java.lang.String r10 = "BlurAvatarUtil"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "getCenterCropBitmap old:"
            r2.append(r4)
            int r4 = r11.getWidth()
            r2.append(r4)
            r4 = 42
            r2.append(r4)
            int r5 = r11.getHeight()
            r2.append(r5)
            java.lang.String r5 = ",new:"
            r2.append(r5)
            int r5 = r1.getWidth()
            r2.append(r5)
            r2.append(r4)
            int r4 = r1.getHeight()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r4 = r1
            goto L_0x01fa
        L_0x01f9:
            r4 = r11
        L_0x01fa:
            android.graphics.drawable.BitmapDrawable r10 = new android.graphics.drawable.BitmapDrawable
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            if (r4 != 0) goto L_0x0207
            goto L_0x0208
        L_0x0207:
            r11 = r4
        L_0x0208:
            r10.<init>(r1, r11)
            r12.setBackground(r10)
        L_0x020e:
            if (r13 == 0) goto L_0x0215
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r13.invoke(r10)
        L_0x0215:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r2 = 1
        L_0x0218:
            if (r4 != 0) goto L_0x024b
            bl3.r r10 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            bl3.r$a r10 = r10.mo62446e(r11)
            java.lang.Class<pl1.s0> r11 = pl1.C11990s0.class
            bl3.c r10 = r10.mo62447c(r11)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11871f2()
            pl1.n0 r11 = new pl1.n0
            T r1 = r0.f27484d
            java.lang.String r1 = (java.lang.String) r1
            up1.y r2 = up1.C27696y.THUMB_IMAGE
            r11.<init>(r1, r2)
            l60.b r10 = r10.mo85955a(r11)
            nk1.b$c r11 = new nk1.b$c
            r11.<init>(r12, r13, r0)
            r10.getClass()
            r10.f291320d = r11
            r10.mo85951a()
            goto L_0x024c
        L_0x024b:
            r3 = r2
        L_0x024c:
            return r3
        L_0x024d:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nk1.C11193b.mo11281b(java.lang.String, java.lang.String, android.view.View, fy3.l):boolean");
    }
}
