package th0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.widget.ImageView;
import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C7335d;
import di3.C86312j;
import f14.C58901s;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.io.FileDescriptor;
import java.math.BigDecimal;
import k60.C60979d;
import kotlin.ResultKt;
import mh0.C99864d;
import n60.C100075f;
import o40.C61926c;
import oh0.C100353d;
import p1081gi.C98124g;
import p1086ro.C101415b;
import p434ig.C98672d;
import p663qo.C77384i;
import p855lg.C61278a;
import p859og.C62007f;
import ph0.C100792a;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import wx3.C15601d;
import wx3.C66212f;
import x60.C102564a;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: th0.a */
public final class C101880a {

    /* renamed from: a */
    public static final C101880a f299976a = new C101880a();

    /* renamed from: b */
    public static final C100075f f299977b;

    /* renamed from: c */
    public static final C100075f f299978c;

    /* renamed from: d */
    public static final C60979d<C100353d> f299979d;

    /* renamed from: e */
    public static final C60979d<C100353d> f299980e;

    /* renamed from: f */
    public static final int f299981f = 640000;

    @C91590f(mo125468c = "com.tencent.mm.plugin.album.util.AlbumMediaUtil$checkIfDownloadVideo$1", mo125469f = "AlbumMediaUtil.kt", mo125470l = {162}, mo125471m = "invokeSuspend")
    /* renamed from: th0.a$a */
    public static final class C64928a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f186957d;

        /* renamed from: e */
        public final /* synthetic */ String f186958e;

        /* renamed from: f */
        public final /* synthetic */ C61278a f186959f;

        /* renamed from: g */
        public final /* synthetic */ int f186960g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f186961h;

        /* renamed from: i */
        public final /* synthetic */ AlbumVideoView f186962i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64928a(String str, C61278a aVar, int i, C8479f0<String> f0Var, AlbumVideoView albumVideoView, C15601d<? super C64928a> dVar) {
            super(2, dVar);
            this.f186958e = str;
            this.f186959f = aVar;
            this.f186960g = i;
            this.f186961h = f0Var;
            this.f186962i = albumVideoView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C64928a(this.f186958e, this.f186959f, this.f186960g, this.f186961h, this.f186962i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64928a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f186957d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f186958e;
                this.f186957d = 1;
                obj = ((C77384i) C86312j.m106911c(C77384i.class)).mo107506oY(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                this.f186962i.setDataId(this.f186958e);
            } else if (Util.isNullOrNil(this.f186959f.f174389h.mo55250D()) || Util.isNullOrNil(this.f186959f.f174389h.mo55248C())) {
                C101880a aVar2 = C101880a.f299976a;
                Log.m105918d("MicroMsg.AlbumMediaUtil", "no video, cdn data invalid, dataId " + this.f186958e + ", pos: " + this.f186960g);
                AlbumVideoView albumVideoView = this.f186962i;
                String str2 = this.f186958e;
                albumVideoView.f154690q = (String) this.f186961h.f27484d;
                albumVideoView.f154673C = str2;
                albumVideoView.f154686j.setVisibility(0);
                albumVideoView.mo76214g(false);
            } else {
                C101880a aVar3 = C101880a.f299976a;
                Log.m105918d("MicroMsg.AlbumMediaUtil", "no video, start download, dataId " + this.f186958e + ", pos: " + this.f186960g);
                C98597b.C60245a aVar4 = C98597b.f289091e;
                C7335d c = C86312j.m106911c(C99864d.class);
                C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                C61278a aVar5 = this.f186959f;
                ((C101415b) aVar4.mo85231a((C98598e) c, C101415b.class)).mo140926j3(aVar5.f174390i, aVar5.f174389h, (String) this.f186961h.f27484d, false);
                AlbumVideoView albumVideoView2 = this.f186962i;
                String str3 = this.f186958e;
                albumVideoView2.f154690q = (String) this.f186961h.f27484d;
                albumVideoView2.f154681e.post(new C62007f(albumVideoView2));
                albumVideoView2.f154673C = str3;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: th0.a$b */
    public static final class C101881b<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ ImageView f299982a;

        /* renamed from: b */
        public final /* synthetic */ long f299983b;

        /* renamed from: c */
        public final /* synthetic */ String f299984c;

        /* renamed from: d */
        public final /* synthetic */ C98672d f299985d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f299986e;

        /* renamed from: f */
        public final /* synthetic */ C98124g f299987f;

        /* renamed from: g */
        public final /* synthetic */ boolean f299988g;

        public C101881b(ImageView imageView, long j, String str, C98672d dVar, C8479f0<String> f0Var, C98124g gVar, boolean z) {
            this.f299982a = imageView;
            this.f299983b = j;
            this.f299984c = str;
            this.f299985d = dVar;
            this.f299986e = f0Var;
            this.f299987f = gVar;
            this.f299988g = z;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C13598b0 b0Var;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C61926c.m72668M(new C101883b(this.f299982a, bitmap, this.f299983b, this.f299984c, this.f299985d, this.f299986e, this.f299987f, this.f299988g));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C61926c.m72668M(new C101884c(C101880a.f299976a, this.f299983b, this.f299984c, this.f299985d, this.f299986e, this.f299987f, this.f299982a));
            }
        }
    }

    /* renamed from: th0.a$c */
    public static final class C101882c<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ ImageView f299989a;

        /* renamed from: b */
        public final /* synthetic */ long f299990b;

        /* renamed from: c */
        public final /* synthetic */ String f299991c;

        /* renamed from: d */
        public final /* synthetic */ C98672d f299992d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f299993e;

        /* renamed from: f */
        public final /* synthetic */ C98124g f299994f;

        /* renamed from: g */
        public final /* synthetic */ boolean f299995g;

        public C101882c(ImageView imageView, long j, String str, C98672d dVar, C8479f0<String> f0Var, C98124g gVar, boolean z) {
            this.f299989a = imageView;
            this.f299990b = j;
            this.f299991c = str;
            this.f299992d = dVar;
            this.f299993e = f0Var;
            this.f299994f = gVar;
            this.f299995g = z;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C13598b0 b0Var;
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C61926c.m72668M(new C101885d(this.f299989a, bitmap, this.f299990b, this.f299991c, this.f299992d, this.f299993e, this.f299994f, this.f299995g));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C61926c.m72668M(new C101886e(C101880a.f299976a, this.f299990b, this.f299991c, this.f299992d, this.f299993e, this.f299994f, this.f299989a));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = (r0 = r0.getResources()).getDisplayMetrics();
     */
    static {
        /*
            th0.a r0 = new th0.a
            r0.<init>()
            f299976a = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 0
            if (r0 == 0) goto L_0x001d
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x001d
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L_0x001d
            int r0 = r0.heightPixels
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            if (r2 == 0) goto L_0x0032
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x0032
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r2 == 0) goto L_0x0032
            int r1 = r2.widthPixels
        L_0x0032:
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 204(0xcc, float:2.86E-43)
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r2, r3)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r3)
            n60.f$a r4 = new n60.f$a
            r4.<init>()
            r5 = 1
            r4.f293176b = r5
            r4.f293175a = r5
            r4.f293177c = r5
            n60.f$b r6 = n60.C100075f.C61628b.NETWORK
            r4.f293179e = r6
            r7 = 480(0x1e0, float:6.73E-43)
            r4.f293181g = r7
            r4.f293180f = r7
            r7 = 2131099648(0x7f060000, float:1.7811655E38)
            r4.f293183i = r7
            android.view.animation.AlphaAnimation r8 = new android.view.animation.AlphaAnimation
            r9 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r9, r10)
            r4.f293185k = r8
            n60.f r4 = r4.mo139398a()
            f299977b = r4
            n60.f$a r8 = new n60.f$a
            r8.<init>()
            r8.f293176b = r5
            r8.f293175a = r5
            r8.f293177c = r5
            r8.f293179e = r6
            r8.f293181g = r0
            r8.f293180f = r1
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r9, r10)
            r8.f293185k = r0
            n60.f r0 = r8.mo139398a()
            f299978c = r0
            n60.f$a r1 = new n60.f$a
            r1.<init>()
            r1.f293176b = r5
            r1.f293175a = r5
            r1.f293177c = r5
            r1.f293179e = r6
            r1.f293181g = r2
            r1.f293180f = r3
            r1.f293183i = r7
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r9, r10)
            r1.f293185k = r2
            n60.f r1 = r1.mo139398a()
            v60.f r2 = new v60.f
            v60.a r6 = new v60.a
            r3 = 2147483647(0x7fffffff, float:NaN)
            r6.<init>(r3, r3)
            v60.g r7 = new v60.g
            r3 = 5
            r7.<init>(r3, r3)
            v60.g r8 = new v60.g
            r8.<init>(r3, r3)
            v60.g r9 = new v60.g
            r9.<init>(r3, r3)
            r10 = 5
            java.lang.String r11 = "galleryLoader"
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            u60.f r3 = new u60.f
            r3.<init>(r2)
            n60.a r2 = new n60.a
            r2.<init>()
            oh0.a r5 = new oh0.a
            r5.<init>()
            r2.f293145c = r5
            oh0.c r5 = new oh0.c
            r5.<init>()
            r2.f293146d = r5
            oh0.e r5 = new oh0.e
            r5.<init>()
            r2.f293148f = r5
            oh0.b r5 = new oh0.b
            r5.<init>()
            r2.f293144b = r5
            r2.f293143a = r4
            r2.f293153k = r3
            n60.b r4 = new n60.b
            r4.<init>(r2)
            n60.a r2 = new n60.a
            r2.<init>()
            oh0.a r5 = new oh0.a
            r5.<init>()
            r2.f293145c = r5
            oh0.c r5 = new oh0.c
            r5.<init>()
            r2.f293146d = r5
            oh0.e r5 = new oh0.e
            r5.<init>()
            r2.f293148f = r5
            oh0.b r5 = new oh0.b
            r5.<init>()
            r2.f293144b = r5
            r2.f293143a = r0
            r2.f293153k = r3
            n60.b r0 = new n60.b
            r0.<init>(r2)
            n60.a r2 = new n60.a
            r2.<init>()
            oh0.a r5 = new oh0.a
            r5.<init>()
            r2.f293145c = r5
            oh0.c r5 = new oh0.c
            r5.<init>()
            r2.f293146d = r5
            oh0.e r5 = new oh0.e
            r5.<init>()
            r2.f293148f = r5
            oh0.b r5 = new oh0.b
            r5.<init>()
            r2.f293144b = r5
            r2.f293143a = r1
            r2.f293153k = r3
            n60.b r1 = new n60.b
            r1.<init>(r2)
            k60.e r2 = k60.C99101e.f290570a
            k60.d r3 = r2.mo138480b(r4)
            f299979d = r3
            k60.d r0 = r2.mo138480b(r0)
            f299980e = r0
            r2.mo138480b(r1)
            r0 = 640000(0x9c400, float:8.96831E-40)
            f299981f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101880a.<clinit>():void");
    }

    /* renamed from: a */
    public final String mo141344a(long j) {
        if (j < 0) {
            return "";
        }
        BigDecimal bigDecimal = new BigDecimal(j);
        float floatValue = bigDecimal.divide(new BigDecimal(1048576), 2, 0).floatValue();
        if (floatValue > 1.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append((int) floatValue);
            sb.append('M');
            return sb.toString();
        }
        float floatValue2 = bigDecimal.divide(new BigDecimal(1024), 2, 0).floatValue();
        StringBuilder sb4 = new StringBuilder();
        sb4.append((int) floatValue2);
        sb4.append('K');
        return sb4.toString();
    }

    /* renamed from: b */
    public final void mo141345b(C61278a aVar, int i, AlbumVideoView albumVideoView) {
        C87412m.m108594g(aVar, "item");
        C87412m.m108594g(albumVideoView, "videoView");
        String K = aVar.f174389h.mo55264K();
        C8479f0 f0Var = new C8479f0();
        C100792a aVar2 = C100792a.f295260a;
        T d = aVar2.mo140233d(aVar.f174389h, aVar.f174390i);
        f0Var.f27484d = d;
        if (C86013q1.m106450k(d)) {
            albumVideoView.setVideoData((String) f0Var.f27484d);
            albumVideoView.setDataId(K);
            Log.m105918d("MicroMsg.AlbumMediaUtil", "videoPath exist, dataId " + K + ", pos: " + i);
            return;
        }
        f0Var.f27484d = C101888l.f300029a.mo141359i(aVar.f174389h, aVar.f174390i) ? aVar2.mo140245q(aVar.f174389h, aVar.f174390i) : aVar2.mo140238j(aVar.f174389h, aVar.f174390i);
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(C53930o0.m60554a(C58901s.f168555a), (C66212f) null, (C53934p0) null, new C64928a(K, aVar, i, f0Var, albumVideoView, (C15601d<? super C64928a>) null), 3, (Object) null);
    }

    /* renamed from: c */
    public final Bitmap mo141346c(byte[] bArr, BitmapFactory.Options options, int i) {
        int i2;
        int i3;
        if (bArr == null) {
            return null;
        }
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i4 = options.outWidth;
        if (i4 < i || (i2 = options.outHeight) < i) {
            return null;
        }
        int max = Math.max(i4 / i, i2 / i);
        if (max <= 1) {
            i3 = 1;
        } else if (max <= 8) {
            if (max > 0) {
                i3 = Integer.highestOneBit(max);
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            i3 = (max / 8) * 8;
        }
        options.inSampleSize = i3;
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    /* renamed from: d */
    public final Bitmap mo141347d(FileDescriptor fileDescriptor, BitmapFactory.Options options, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (fileDescriptor == null) {
            return null;
        }
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
        int i6 = options.outWidth;
        int i7 = options.outHeight;
        if (i6 == -1 || i7 == -1) {
            Log.m105924i("MicroMsg.AlbumMediaUtil", "decode error, get invalid picture size");
            return null;
        }
        int min = Math.min(i6, i7) / i;
        if (min < 1) {
            i2 = 1;
        } else {
            if (min > 0 && min <= 1073741824) {
                int i8 = min - 1;
                int i9 = i8 | (i8 >> 16);
                int i15 = i9 | (i9 >> 8);
                int i16 = i15 | (i15 >> 4);
                int i17 = i16 | (i16 >> 2);
                i2 = (i17 | (i17 >> 1)) + 1;
            } else {
                throw new IllegalArgumentException(("n is invalid: " + min).toString());
            }
        }
        while (true) {
            i3 = i6 / i2;
            i4 = i7 / i2;
            int i18 = i3 * i4;
            i5 = f299981f;
            if (i18 < i5) {
                break;
            }
            i2 *= 2;
        }
        options.inSampleSize = i2;
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
        return decodeFileDescriptor.getWidth() * decodeFileDescriptor.getHeight() >= i5 ? Bitmap.createScaledBitmap(decodeFileDescriptor, i3, i4, false) : decodeFileDescriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0158, code lost:
        if (r5 != false) goto L_0x015a;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141348e(int r18, p434ig.C98672d r19, com.tencent.p014mm.storage.C72963f4 r20, android.widget.ImageView r21, int r22, boolean r23, boolean r24) {
        /*
            r17 = this;
            r8 = r19
            r0 = r20
            r9 = r21
            java.lang.String r1 = "albumDataItem"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "imgView"
            gy3.C87412m.m108594g(r9, r1)
            if (r0 == 0) goto L_0x0017
            long r1 = r20.getMsgId()
            goto L_0x0019
        L_0x0017:
            r1 = 0
        L_0x0019:
            r10 = r1
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = r20.mo108768t()
            goto L_0x0023
        L_0x0022:
            r2 = r1
        L_0x0023:
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0029
            r12 = r3
            goto L_0x002a
        L_0x0029:
            r12 = r2
        L_0x002a:
            th0.l r2 = th0.C101888l.f300029a
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            tf3.a r5 = new tf3.a
            r5.<init>()
            int r4 = r4.mo58782dM(r5)
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            if (r4 != 0) goto L_0x004b
            if (r23 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r4 = 0
            goto L_0x004c
        L_0x004b:
            r4 = 1
        L_0x004c:
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            r13.f27484d = r3
            gi.g r14 = new gi.g
            r14.<init>()
            boolean r3 = r2.mo141356f(r8, r0)
            boolean r7 = r2.mo141359i(r8, r0)
            if (r7 == 0) goto L_0x009b
            if (r3 == 0) goto L_0x009b
            ph0.a r2 = ph0.C100792a.f295260a
            java.lang.String r3 = r2.mo140245q(r8, r0)
            r13.f27484d = r3
            java.lang.String r3 = r19.mo55264K()
            java.lang.String r3 = r2.mo140244p(r3)
            java.lang.String r2 = r2.mo140242n(r3, r10, r6)
            r14.field_mediaId = r2
            int r2 = r19.mo55306f0()
            r14.field_fileType = r2
            long r2 = r19.mo55300c0()
            int r3 = (int) r2
            r14.field_totalLen = r3
            java.lang.String r2 = r19.mo55296a0()
            r14.field_aesKey = r2
            java.lang.String r2 = r19.mo55302d0()
            r14.field_fileId = r2
            java.lang.String r2 = r19.mo55298b0()
            r14.field_filemd5 = r2
            goto L_0x0145
        L_0x009b:
            if (r3 == 0) goto L_0x00cf
            ph0.a r2 = ph0.C100792a.f295260a
            java.lang.String r3 = r2.mo140238j(r8, r0)
            r13.f27484d = r3
            java.lang.String r3 = r19.mo55264K()
            java.lang.String r2 = r2.mo140242n(r3, r10, r6)
            r14.field_mediaId = r2
            int r2 = r19.mo55282T()
            r14.field_fileType = r2
            long r2 = r19.mo55268M()
            int r3 = (int) r2
            r14.field_totalLen = r3
            java.lang.String r2 = r19.mo55248C()
            r14.field_aesKey = r2
            java.lang.String r2 = r19.mo55250D()
            r14.field_fileId = r2
            java.lang.String r2 = r19.mo55286V()
            r14.field_filemd5 = r2
            goto L_0x0145
        L_0x00cf:
            if (r4 == 0) goto L_0x0145
            int r3 = r19.mo55274P()
            r4 = 4
            if (r3 == r4) goto L_0x0145
            boolean r2 = r2.mo141359i(r8, r0)
            if (r2 == 0) goto L_0x0114
            ph0.a r2 = ph0.C100792a.f295260a
            java.lang.String r3 = r2.mo140245q(r8, r0)
            r13.f27484d = r3
            java.lang.String r3 = r19.mo55264K()
            java.lang.String r3 = r2.mo140244p(r3)
            java.lang.String r2 = r2.mo140242n(r3, r10, r6)
            r14.field_mediaId = r2
            int r2 = r19.mo55306f0()
            r14.field_fileType = r2
            long r2 = r19.mo55300c0()
            int r3 = (int) r2
            r14.field_totalLen = r3
            java.lang.String r2 = r19.mo55296a0()
            r14.field_aesKey = r2
            java.lang.String r2 = r19.mo55302d0()
            r14.field_fileId = r2
            java.lang.String r2 = r19.mo55298b0()
            r14.field_filemd5 = r2
            goto L_0x0145
        L_0x0114:
            ph0.a r2 = ph0.C100792a.f295260a
            java.lang.String r3 = r2.mo140238j(r8, r0)
            r13.f27484d = r3
            java.lang.String r3 = r19.mo55264K()
            java.lang.String r2 = r2.mo140242n(r3, r10, r6)
            r14.field_mediaId = r2
            int r2 = r19.mo55282T()
            r14.field_fileType = r2
            long r2 = r19.mo55268M()
            int r3 = (int) r2
            r14.field_totalLen = r3
            java.lang.String r2 = r19.mo55248C()
            r14.field_aesKey = r2
            java.lang.String r2 = r19.mo55250D()
            r14.field_fileId = r2
            java.lang.String r2 = r19.mo55286V()
            r14.field_filemd5 = r2
        L_0x0145:
            java.lang.String r2 = r14.field_fileId
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x015a
            T r2 = r13.f27484d
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0158
            r5 = 1
        L_0x0158:
            if (r5 == 0) goto L_0x018f
        L_0x015a:
            ph0.a r2 = ph0.C100792a.f295260a
            java.lang.String r3 = r2.mo140250v(r8, r0)
            r13.f27484d = r3
            java.lang.String r3 = r19.mo55264K()
            java.lang.String r3 = r2.mo140249u(r3)
            java.lang.String r2 = r2.mo140242n(r3, r10, r6)
            r14.field_mediaId = r2
            int r2 = r19.mo55336u0()
            r14.field_fileType = r2
            long r2 = r19.mo55344y0()
            int r3 = (int) r2
            r14.field_totalLen = r3
            java.lang.String r2 = r19.mo55254F()
            r14.field_aesKey = r2
            java.lang.String r2 = r19.mo55256G()
            r14.field_fileId = r2
            java.lang.String r2 = r19.mo55338v0()
            r14.field_filemd5 = r2
        L_0x018f:
            T r2 = r13.f27484d
            java.lang.String r2 = (java.lang.String) r2
            r14.field_fullpath = r2
            java.lang.String r2 = "task_AlbumDownload"
            r14.f287660d = r2
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r12)
            r14.field_chattype = r2
            r2 = 3
            r14.field_priority = r2
            r9.setImageBitmap(r1)
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            android.content.Context r2 = r21.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099648(0x7f060000, float:1.7811655E38)
            int r2 = r2.getColor(r3)
            r1.<init>(r2)
            r9.setImageDrawable(r1)
            if (r23 == 0) goto L_0x0222
            ph0.a r1 = ph0.C100792a.f295260a
            java.lang.String r5 = r1.mo140250v(r8, r0)
            gi.g r7 = new gi.g
            r7.<init>()
            java.lang.String r0 = r19.mo55264K()
            java.lang.String r0 = r1.mo140249u(r0)
            java.lang.String r0 = r1.mo140242n(r0, r10, r6)
            r7.field_mediaId = r0
            int r0 = r19.mo55336u0()
            r7.field_fileType = r0
            long r0 = r19.mo55344y0()
            int r1 = (int) r0
            r7.field_totalLen = r1
            java.lang.String r0 = r19.mo55254F()
            r7.field_aesKey = r0
            java.lang.String r0 = r19.mo55256G()
            r7.field_fileId = r0
            java.lang.String r0 = r19.mo55338v0()
            r7.field_filemd5 = r0
            k60.d<oh0.d> r15 = f299979d
            oh0.d r6 = new oh0.d
            n60.f r16 = f299977b
            r0 = r6
            r1 = r10
            r3 = r12
            r4 = r19
            r8 = r6
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r7)
            l60.b r15 = r15.mo85955a(r8)
            th0.a$b r8 = new th0.a$b
            r0 = r8
            r1 = r21
            r2 = r10
            r4 = r12
            r5 = r19
            r6 = r13
            r7 = r14
            r9 = r8
            r8 = r24
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r15.f291320d = r9
            r15.mo85951a()
            goto L_0x0241
        L_0x0222:
            k60.d<oh0.d> r8 = f299979d
            oh0.d r15 = new oh0.d
            T r0 = r13.f27484d
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            n60.f r6 = f299977b
            r0 = r15
            r1 = r10
            r3 = r12
            r4 = r19
            r7 = r14
            r0.<init>(r1, r3, r4, r5, r6, r7)
            l60.b r0 = r8.mo85955a(r15)
            l60.a r0 = (l60.C99342a) r0
            r1 = r24
            r0.mo138754i(r9, r1)
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101880a.mo141348e(int, ig.d, com.tencent.mm.storage.f4, android.widget.ImageView, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(ph0.C100792a.f295260a.mo140246r(r8, r9, r10)) != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(ph0.C100792a.f295260a.mo140239k(r8, r9, r10)) != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a6, code lost:
        if (r2 != false) goto L_0x01a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141349f(int r18, p434ig.C98672d r19, java.lang.String r20, long r21, android.widget.ImageView r23, int r24, boolean r25, boolean r26) {
        /*
            r17 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            r12 = r23
            java.lang.String r0 = "albumDataItem"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "talker"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "imgView"
            gy3.C87412m.m108594g(r12, r0)
            th0.l r0 = th0.C101888l.f300029a
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            tf3.a r2 = new tf3.a
            r2.<init>()
            int r1 = r1.mo58782dM(r2)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 != 0) goto L_0x0039
            if (r25 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            java.lang.String r4 = ""
            r13.f27484d = r4
            gi.g r14 = new gi.g
            r14.<init>()
            int r4 = r19.mo55274P()
            r5 = 2
            if (r4 == r5) goto L_0x0050
            goto L_0x00a0
        L_0x0050:
            java.lang.Long r4 = java.lang.Long.valueOf(r21)
            boolean r4 = r0.mo141360j(r8, r9, r4)
            if (r4 == 0) goto L_0x007c
            java.lang.String r4 = r19.mo55302d0()
            if (r4 == 0) goto L_0x006d
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0068
            r4 = 1
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r4 != r3) goto L_0x006d
            r4 = 1
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r4 == 0) goto L_0x007c
            ph0.a r4 = ph0.C100792a.f295260a
            java.lang.String r4 = r4.mo140246r(r8, r9, r10)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 != 0) goto L_0x009e
        L_0x007c:
            java.lang.String r4 = r19.mo55250D()
            if (r4 == 0) goto L_0x008f
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x008a
            r4 = 1
            goto L_0x008b
        L_0x008a:
            r4 = 0
        L_0x008b:
            if (r4 != r3) goto L_0x008f
            r4 = 1
            goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            if (r4 == 0) goto L_0x00a0
            ph0.a r4 = ph0.C100792a.f295260a
            java.lang.String r4 = r4.mo140239k(r8, r9, r10)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x00a0
        L_0x009e:
            r4 = 1
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            if (r4 == 0) goto L_0x00e4
            java.lang.Long r5 = java.lang.Long.valueOf(r21)
            boolean r5 = r0.mo141360j(r8, r9, r5)
            if (r5 == 0) goto L_0x00e4
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r1 = r0.mo140246r(r8, r9, r10)
            r13.f27484d = r1
            java.lang.String r1 = r19.mo55264K()
            java.lang.String r1 = r0.mo140244p(r1)
            java.lang.String r0 = r0.mo140242n(r1, r10, r3)
            r14.field_mediaId = r0
            int r0 = r19.mo55306f0()
            r14.field_fileType = r0
            long r0 = r19.mo55300c0()
            int r1 = (int) r0
            r14.field_totalLen = r1
            java.lang.String r0 = r19.mo55296a0()
            r14.field_aesKey = r0
            java.lang.String r0 = r19.mo55302d0()
            r14.field_fileId = r0
            java.lang.String r0 = r19.mo55298b0()
            r14.field_filemd5 = r0
            goto L_0x0193
        L_0x00e4:
            if (r4 == 0) goto L_0x0119
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r1 = r0.mo140239k(r8, r9, r10)
            r13.f27484d = r1
            java.lang.String r1 = r19.mo55264K()
            java.lang.String r0 = r0.mo140242n(r1, r10, r3)
            r14.field_mediaId = r0
            int r0 = r19.mo55282T()
            r14.field_fileType = r0
            long r0 = r19.mo55268M()
            int r1 = (int) r0
            r14.field_totalLen = r1
            java.lang.String r0 = r19.mo55248C()
            r14.field_aesKey = r0
            java.lang.String r0 = r19.mo55250D()
            r14.field_fileId = r0
            java.lang.String r0 = r19.mo55286V()
            r14.field_filemd5 = r0
            goto L_0x0193
        L_0x0119:
            if (r1 == 0) goto L_0x0193
            int r1 = r19.mo55274P()
            r4 = 4
            if (r1 == r4) goto L_0x0193
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            boolean r0 = r0.mo141360j(r8, r9, r1)
            if (r0 == 0) goto L_0x0162
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r1 = r0.mo140246r(r8, r9, r10)
            r13.f27484d = r1
            java.lang.String r1 = r19.mo55264K()
            java.lang.String r1 = r0.mo140244p(r1)
            java.lang.String r0 = r0.mo140242n(r1, r10, r3)
            r14.field_mediaId = r0
            int r0 = r19.mo55306f0()
            r14.field_fileType = r0
            long r0 = r19.mo55300c0()
            int r1 = (int) r0
            r14.field_totalLen = r1
            java.lang.String r0 = r19.mo55296a0()
            r14.field_aesKey = r0
            java.lang.String r0 = r19.mo55302d0()
            r14.field_fileId = r0
            java.lang.String r0 = r19.mo55298b0()
            r14.field_filemd5 = r0
            goto L_0x0193
        L_0x0162:
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r1 = r0.mo140239k(r8, r9, r10)
            r13.f27484d = r1
            java.lang.String r1 = r19.mo55264K()
            java.lang.String r0 = r0.mo140242n(r1, r10, r3)
            r14.field_mediaId = r0
            int r0 = r19.mo55282T()
            r14.field_fileType = r0
            long r0 = r19.mo55268M()
            int r1 = (int) r0
            r14.field_totalLen = r1
            java.lang.String r0 = r19.mo55248C()
            r14.field_aesKey = r0
            java.lang.String r0 = r19.mo55250D()
            r14.field_fileId = r0
            java.lang.String r0 = r19.mo55286V()
            r14.field_filemd5 = r0
        L_0x0193:
            java.lang.String r0 = r14.field_fileId
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01a8
            T r0 = r13.f27484d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01a6
            r2 = 1
        L_0x01a6:
            if (r2 == 0) goto L_0x01dd
        L_0x01a8:
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r1 = r0.mo140251w(r8, r9, r10)
            r13.f27484d = r1
            java.lang.String r1 = r19.mo55264K()
            java.lang.String r1 = r0.mo140249u(r1)
            java.lang.String r0 = r0.mo140242n(r1, r10, r3)
            r14.field_mediaId = r0
            int r0 = r19.mo55336u0()
            r14.field_fileType = r0
            long r0 = r19.mo55344y0()
            int r1 = (int) r0
            r14.field_totalLen = r1
            java.lang.String r0 = r19.mo55254F()
            r14.field_aesKey = r0
            java.lang.String r0 = r19.mo55256G()
            r14.field_fileId = r0
            java.lang.String r0 = r19.mo55338v0()
            r14.field_filemd5 = r0
        L_0x01dd:
            T r0 = r13.f27484d
            java.lang.String r0 = (java.lang.String) r0
            r14.field_fullpath = r0
            java.lang.String r0 = "task_AlbumDownload"
            r14.f287660d = r0
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r20)
            r14.field_chattype = r0
            r0 = 3
            r14.field_priority = r0
            r0 = 0
            r12.setImageBitmap(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            android.content.Context r1 = r23.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099648(0x7f060000, float:1.7811655E38)
            int r1 = r1.getColor(r2)
            r0.<init>(r1)
            r12.setImageDrawable(r0)
            if (r25 == 0) goto L_0x0275
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r5 = r0.mo140251w(r8, r9, r10)
            gi.g r7 = new gi.g
            r7.<init>()
            java.lang.String r1 = r19.mo55264K()
            java.lang.String r1 = r0.mo140249u(r1)
            java.lang.String r0 = r0.mo140242n(r1, r10, r3)
            r7.field_mediaId = r0
            int r0 = r19.mo55336u0()
            r7.field_fileType = r0
            long r0 = r19.mo55344y0()
            int r1 = (int) r0
            r7.field_totalLen = r1
            java.lang.String r0 = r19.mo55254F()
            r7.field_aesKey = r0
            java.lang.String r0 = r19.mo55256G()
            r7.field_fileId = r0
            java.lang.String r0 = r19.mo55338v0()
            r7.field_filemd5 = r0
            k60.d<oh0.d> r15 = f299979d
            oh0.d r6 = new oh0.d
            n60.f r16 = f299977b
            r0 = r6
            r1 = r21
            r3 = r20
            r4 = r19
            r8 = r6
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r7)
            l60.b r15 = r15.mo85955a(r8)
            th0.a$c r8 = new th0.a$c
            r0 = r8
            r1 = r23
            r2 = r21
            r4 = r20
            r5 = r19
            r6 = r13
            r7 = r14
            r9 = r8
            r8 = r26
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r15.f291320d = r9
            r15.mo85951a()
            goto L_0x0296
        L_0x0275:
            k60.d<oh0.d> r8 = f299979d
            oh0.d r15 = new oh0.d
            T r0 = r13.f27484d
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            n60.f r6 = f299977b
            r0 = r15
            r1 = r21
            r3 = r20
            r4 = r19
            r7 = r14
            r0.<init>(r1, r3, r4, r5, r6, r7)
            l60.b r0 = r8.mo85955a(r15)
            l60.a r0 = (l60.C99342a) r0
            r1 = r26
            r0.mo138754i(r12, r1)
        L_0x0296:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101880a.mo141349f(int, ig.d, java.lang.String, long, android.widget.ImageView, int, boolean, boolean):void");
    }
}
