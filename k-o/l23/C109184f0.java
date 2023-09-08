package l23;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tencent.p014mm.cache.ArtistCacheManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import h90.C98324b;
import hi2.C98453h;
import ig3.C108460i;
import java.util.Collection;
import java.util.HashMap;
import lh2.C99417a;
import me3.C109610a;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104085b;
import p248ug.C111161j0;
import p248ug.C111162m0;
import p248ug.C111163p0;
import p248ug.C111164r0;
import p248ug.C111167t;
import p520fi.C107546c;
import qh2.C101198e;
import rx3.C13598b0;
import th2.C110992d;
import z20.C112579f;
import zp3.C112660e0;

/* renamed from: l23.f0 */
public final class C109184f0 extends C99417a {

    /* renamed from: f */
    public FrameLayout f326906f;

    /* renamed from: g */
    public C111164r0 f326907g;

    /* renamed from: h */
    public RecordConfigProvider f326908h;

    /* renamed from: i */
    public C98324b f326909i;

    /* renamed from: j */
    public C112660e0 f326910j;

    /* renamed from: n */
    public C109623f f326911n;

    /* renamed from: o */
    public final Context f326912o;

    /* renamed from: p */
    public final HashMap<String, C99298a> f326913p = new HashMap<>();

    /* renamed from: q */
    public boolean f326914q;

    /* renamed from: r */
    public C111167t f326915r = C111167t.DEFAULT;

    /* renamed from: s */
    public int f326916s = -1;

    /* renamed from: l23.f0$a */
    public static final class C99298a {

        /* renamed from: a */
        public final C111164r0 f291193a;

        /* renamed from: b */
        public final C112660e0 f291194b;

        public C99298a(C111164r0 r0Var, C112660e0 e0Var) {
            C87412m.m108594g(r0Var, "editor");
            C87412m.m108594g(e0Var, "drawingView");
            this.f291193a = r0Var;
            this.f291194b = e0Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C99298a)) {
                return false;
            }
            C99298a aVar = (C99298a) obj;
            return C87412m.m108589b(this.f291193a, aVar.f291193a) && C87412m.m108589b(this.f291194b, aVar.f291194b);
        }

        public int hashCode() {
            return (this.f291193a.hashCode() * 31) + this.f291194b.hashCode();
        }

        public String toString() {
            return "PhotoEditorViewData(editor=" + this.f291193a + ", drawingView=" + this.f291194b + ')';
        }
    }

    /* renamed from: l23.f0$b */
    public static final class C99299b implements C111161j0 {

        /* renamed from: a */
        public final /* synthetic */ long f291195a;

        /* renamed from: b */
        public final /* synthetic */ C109184f0 f291196b;

        /* renamed from: c */
        public final /* synthetic */ C32228q<Boolean, String, Boolean, C13598b0> f291197c;

        /* renamed from: d */
        public final /* synthetic */ boolean f291198d;

        public C99299b(long j, C109184f0 f0Var, C32228q<? super Boolean, ? super String, ? super Boolean, C13598b0> qVar, boolean z) {
            this.f291195a = j;
            this.f291196b = f0Var;
            this.f291197c = qVar;
            this.f291198d = z;
        }

        /* renamed from: a */
        public void mo79184a(Bitmap bitmap, boolean z) {
            Bitmap bitmap2 = bitmap;
            Log.m105924i("MicroMsg.MultiPhotoEditContainerPlugin", "photoEditor onSuccess: " + bitmap2 + " isNever：" + z + "  cost:" + Util.ticksToNow(this.f291195a));
            C115669n.INSTANCE.idkeyStat(985, 128, Util.ticksToNow(this.f291195a), false);
            if (bitmap2 == null) {
                C115669n.INSTANCE.idkeyStat(985, 126, 1, false);
            }
            if (bitmap2 != null) {
                long j = this.f291195a;
                C109184f0 f0Var = this.f291196b;
                C32228q<Boolean, String, Boolean, C13598b0> qVar = this.f291197c;
                boolean z2 = this.f291198d;
                C110992d dVar = C110992d.f332425a;
                dVar.mo162677k("KEY_CROP_MEDIA_WIDTH_INT", Integer.valueOf(bitmap.getWidth()));
                dVar.mo162677k("KEY_CROP_MEDIA_HEIGHT_INT", Integer.valueOf(bitmap.getHeight()));
                Log.m105924i("MicroMsg.MultiPhotoEditContainerPlugin", "photo width: " + bitmap.getWidth() + "  height:" + bitmap.getHeight());
                StringBuilder sb = new StringBuilder();
                sb.append(C98453h.f288774a.mo137813k());
                sb.append(bitmap.hashCode());
                String sb4 = sb.toString();
                BitmapUtil.saveBitmapToImage(bitmap2, 100, Bitmap.CompressFormat.JPEG, sb4, true);
                Log.m105924i("MicroMsg.MultiPhotoEditContainerPlugin", "saveBitmapToImage  cost:" + Util.ticksToNow(j) + "  path:" + sb4);
                f0Var.getClass();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("new ThreadPool  cost:");
                sb5.append(Util.ticksToNow(j));
                Log.m105918d("MicroMsg.MultiPhotoEditContainerPlugin", sb5.toString());
                qVar.invoke(Boolean.TRUE, sb4, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        public void mo79185b(Exception exc) {
            C87412m.m108594g(exc, "e");
            Log.m105921e("MicroMsg.MultiPhotoEditContainerPlugin", "photoEditor onError: %s", exc);
            C115669n.INSTANCE.idkeyStat(985, 125, 1, false);
            C115669n.INSTANCE.idkeyStat(985, 128, Util.ticksToNow(this.f291195a), false);
            this.f291196b.getClass();
            this.f291197c.invoke(Boolean.FALSE, null, Boolean.valueOf(this.f291198d));
        }
    }

    /* renamed from: l23.f0$c */
    public static final class C109185c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f326917d;

        public C109185c(C32224a aVar) {
            this.f326917d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f326917d.invoke();
        }
    }

    /* renamed from: l23.f0$d */
    public static final class C109186d implements C109612c.C109620e {

        /* renamed from: a */
        public final /* synthetic */ C109184f0 f326918a;

        public C109186d(C109184f0 f0Var) {
            this.f326918a = f0Var;
        }

        /* renamed from: a */
        public boolean mo79171a(C112579f fVar) {
            C87412m.m108594g(fVar, "item");
            Bundle bundle = new Bundle();
            bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", fVar.f337106C);
            bundle.putInt("PARAM_EDIT_TEXT_COLOR", fVar.f337110y);
            bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", fVar.f337111z);
            this.f326918a.f291492d.mo14585p(C101198e.C101199b.EDIT_CHANGE_TEXT, bundle);
            return true;
        }

        /* renamed from: b */
        public void mo79172b() {
        }

        /* renamed from: c */
        public void mo79173c(Boolean bool) {
            if (bool.booleanValue()) {
                C101198e.C62622a.m73576a(this.f326918a.f291492d, C101198e.C101199b.EDIT_DELETE_ITEM, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(this.f326918a.f291492d, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: l23.f0$e */
    public static final class C109187e implements C111163p0 {

        /* renamed from: a */
        public final /* synthetic */ C109184f0 f326919a;

        public C109187e(C109184f0 f0Var) {
            this.f326919a = f0Var;
        }

        /* renamed from: a */
        public void mo150361a(C111167t tVar) {
            C87412m.m108594g(tVar, "features");
            Log.m105925i("MicroMsg.MultiPhotoEditContainerPlugin", "[onSelectedFeature] features:%s", tVar.name());
            if (tVar == C111167t.DEFAULT) {
                C101198e.C62622a.m73576a(this.f326919a.f291492d, C101198e.C101199b.EDIT_PHOTO_SHOW_FUNC_LAYOUT, (Bundle) null, 2, (Object) null);
            }
        }

        /* renamed from: b */
        public void mo150362b(boolean z) {
        }

        /* renamed from: c */
        public void mo150363c(C111167t tVar, int i, Object obj) {
            C87412m.m108594g(tVar, "features");
            Log.m105925i("MicroMsg.MultiPhotoEditContainerPlugin", "[onSelectedDetailFeature] features:%s index:%s", tVar.name(), Integer.valueOf(i));
        }
    }

    /* renamed from: l23.f0$f */
    public static final class C109188f implements C104085b.C104088c {

        /* renamed from: a */
        public final /* synthetic */ C109184f0 f326920a;

        public C109188f(C109184f0 f0Var) {
            this.f326920a = f0Var;
        }

        /* renamed from: a */
        public final boolean mo145717a(MotionEvent motionEvent) {
            C109184f0 f0Var = this.f326920a;
            C87412m.m108593f(motionEvent, LocaleUtil.ITALIAN);
            C109184f0.m148229x(f0Var, motionEvent);
            return false;
        }
    }

    /* renamed from: l23.f0$g */
    public static final class C109189g implements C104085b.C104088c {

        /* renamed from: a */
        public final /* synthetic */ C109184f0 f326921a;

        public C109189g(C109184f0 f0Var) {
            this.f326921a = f0Var;
        }

        /* renamed from: a */
        public final boolean mo145717a(MotionEvent motionEvent) {
            C109184f0 f0Var = this.f326921a;
            C87412m.m108593f(motionEvent, LocaleUtil.ITALIAN);
            C109184f0.m148229x(f0Var, motionEvent);
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109184f0(FrameLayout frameLayout, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(frameLayout, "photoLayout");
        C87412m.m108594g(eVar, "status");
        this.f326906f = frameLayout;
        this.f326912o = frameLayout.getContext();
    }

    /* renamed from: x */
    public static final void m148229x(C109184f0 f0Var, MotionEvent motionEvent) {
        f0Var.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    f0Var.f326914q = true;
                    C101198e.C62622a.m73576a(f0Var.f291492d, C101198e.C101199b.EDIT_PHOTO_DOODLE_MOVE_START, (Bundle) null, 2, (Object) null);
                    return;
                } else if (!(actionMasked == 5 || actionMasked == 6)) {
                    return;
                }
            }
            if (f0Var.f326914q) {
                C101198e.C62622a.m73576a(f0Var.f291492d, C101198e.C101199b.EDIT_PHOTO_DOODLE_MOVE_STOP, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(f0Var.f291492d, C101198e.C101199b.EDIT_PHOTO_DOODLE_CLICK, (Bundle) null, 2, (Object) null);
            }
        } else {
            f0Var.f326914q = false;
        }
    }

    /* renamed from: A */
    public final void mo160422A(String str, C32228q<? super Boolean, ? super String, ? super Boolean, C13598b0> qVar) {
        String str2 = str;
        C32228q<? super Boolean, ? super String, ? super Boolean, C13598b0> qVar2 = qVar;
        C87412m.m108594g(str2, "sourcePath");
        C87412m.m108594g(qVar2, "callback");
        C99298a aVar = this.f326913p.get(str2);
        C111162m0 m0Var = null;
        C111164r0 r0Var = aVar != null ? aVar.f291193a : null;
        this.f326907g = r0Var;
        if (r0Var == null) {
            qVar2.invoke(Boolean.TRUE, str2, Boolean.FALSE);
            return;
        }
        ArtistCacheManager.m140185a().mo148162e(str2);
        C107546c.f321771c.mo157987b(Util.nullAs(str2, "MicroMsg.MultiPhotoEditContainerPlugin"));
        C110992d dVar = C110992d.f332425a;
        C111164r0 r0Var2 = this.f326907g;
        C111162m0 b = r0Var2 != null ? r0Var2.mo162893b() : null;
        C87412m.m108591d(b);
        dVar.mo162677k("KEY_ADD_EMOJI_COUNT_INT", Integer.valueOf(((C108460i) b).mo159002b()));
        C111164r0 r0Var3 = this.f326907g;
        C111162m0 b2 = r0Var3 != null ? r0Var3.mo162893b() : null;
        C87412m.m108591d(b2);
        dVar.mo162677k("KEY_ADD_TEXT_COUNT_INT", Integer.valueOf(((C108460i) b2).mo159005e()));
        C111164r0 r0Var4 = this.f326907g;
        C111162m0 b3 = r0Var4 != null ? r0Var4.mo162893b() : null;
        C87412m.m108591d(b3);
        dVar.mo162677k("KEY_ADD_DOODLE_COUNT_INT", Integer.valueOf(((C108460i) b3).mo159001a()));
        C111164r0 r0Var5 = this.f326907g;
        C111162m0 b4 = r0Var5 != null ? r0Var5.mo162893b() : null;
        C87412m.m108591d(b4);
        dVar.mo162677k("KEY_ADD_DOODLE_COLOR_COUNT_INT", Integer.valueOf(((C108460i) b4).mo159004d()));
        C111164r0 r0Var6 = this.f326907g;
        C111162m0 b5 = r0Var6 != null ? r0Var6.mo162893b() : null;
        C87412m.m108591d(b5);
        dVar.mo162677k("KEY_ADD_MOSAIC_COUNT_INT", Integer.valueOf(((C108460i) b5).mo159003c()));
        C111164r0 r0Var7 = this.f326907g;
        C111162m0 b6 = r0Var7 != null ? r0Var7.mo162893b() : null;
        C87412m.m108591d(b6);
        dVar.mo162677k("KEY_ROTATE_INT", Integer.valueOf(((C108460i) b6).mo159008h() ? 1 : 0));
        dVar.mo162677k("KEY_AFTER_EDIT_INT", 1);
        C111164r0 r0Var8 = this.f326907g;
        if (r0Var8 != null) {
            m0Var = r0Var8.mo162893b();
        }
        C87412m.m108591d(m0Var);
        boolean g = ((C108460i) m0Var).mo159007g();
        dVar.mo162677k("KEY_PHOTO_IS_EDITED_BOOLEAN", Boolean.valueOf(g));
        dVar.mo162672f();
        if (g) {
            C115669n.INSTANCE.idkeyStat(985, 118, 1, false);
        }
        C115669n.INSTANCE.idkeyStat(985, 127, 1, false);
        long currentTicks = Util.currentTicks();
        Log.m105924i("MicroMsg.MultiPhotoEditContainerPlugin", "dofinish time: " + currentTicks + ' ' + g);
        C111164r0 r0Var9 = this.f326907g;
        if (r0Var9 != null) {
            r0Var9.mo162898g(new C99299b(currentTicks, this, qVar, g));
        }
    }

    /* renamed from: B */
    public final void mo160423B() {
        C111167t tVar = C111167t.MOSAIC;
        this.f326915r = tVar;
        this.f326916s = 0;
        C109623f fVar = this.f326911n;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150361a(tVar);
        }
        C109623f fVar2 = this.f326911n;
        if (fVar2 != null) {
            new C109610a((C109612c) fVar2).mo150363c(tVar, 0, (Object) null);
        }
        C110992d dVar = C110992d.f332425a;
        C110992d.m151314c(dVar, "KEY_CLICK_MOSAIC_COUNT_INT", 0, 2, (Object) null);
        dVar.mo162669b(8);
    }

    /* renamed from: C */
    public final void mo160424C() {
        C109623f fVar = this.f326911n;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150363c(C107546c.f321771c.mo157986a(), -1, (Object) null);
        }
        C109623f fVar2 = this.f326911n;
        if (fVar2 != null) {
            new C109610a((C109612c) fVar2).mo150361a(this.f326915r);
        }
        C109623f fVar3 = this.f326911n;
        if (fVar3 != null) {
            new C109610a((C109612c) fVar3).mo150363c(this.f326915r, this.f326916s, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [eq3.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e8  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final zp3.C112660e0 mo160425D(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = "path"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updatePhotoEdit path:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", photoLayout rect:["
            r0.append(r1)
            android.widget.FrameLayout r1 = r11.f326906f
            int r1 = r1.getLeft()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            android.widget.FrameLayout r2 = r11.f326906f
            int r2 = r2.getTop()
            r0.append(r2)
            r0.append(r1)
            android.widget.FrameLayout r2 = r11.f326906f
            int r2 = r2.getRight()
            r0.append(r2)
            r0.append(r1)
            android.widget.FrameLayout r1 = r11.f326906f
            int r1 = r1.getBottom()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MultiPhotoEditContainerPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.widget.FrameLayout r0 = r11.f326906f
            r2 = 0
            r0.setVisibility(r2)
            java.util.HashMap<java.lang.String, l23.f0$a> r0 = r11.f326913p
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView"
            r4 = 1
            if (r0 != 0) goto L_0x0105
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "put new photo editor:"
            r0.append(r5)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.Class<ew.b> r0 = p511ew.C58849b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ew.b r0 = (p511ew.C58849b) r0
            ug.r0 r0 = r0.mo58069ZD()
            ug.r0$a r5 = new ug.r0$a
            r5.<init>()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r11.f326908h
            if (r6 == 0) goto L_0x0097
            int r7 = r6.f272905F
            r8 = 291(0x123, float:4.08E-43)
            if (r7 != r8) goto L_0x0097
            r7 = 1
            goto L_0x0098
        L_0x0097:
            r7 = 0
        L_0x0098:
            if (r7 != 0) goto L_0x00b6
            if (r6 == 0) goto L_0x00a4
            int r7 = r6.f272905F
            r8 = 293(0x125, float:4.1E-43)
            if (r7 != r8) goto L_0x00a4
            r7 = 1
            goto L_0x00a5
        L_0x00a4:
            r7 = 0
        L_0x00a5:
            if (r7 != 0) goto L_0x00b6
            if (r6 == 0) goto L_0x00b1
            int r6 = r6.f272905F
            r7 = 294(0x126, float:4.12E-43)
            if (r6 != r7) goto L_0x00b1
            r6 = 1
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            if (r6 != 0) goto L_0x00b6
            r6 = 1
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            r5.f332925b = r6
            r5.f332926c = r2
            android.graphics.Rect r6 = new android.graphics.Rect
            android.widget.FrameLayout r7 = r11.f326906f
            int r7 = r7.getLeft()
            android.widget.FrameLayout r8 = r11.f326906f
            int r8 = r8.getTop()
            android.widget.FrameLayout r9 = r11.f326906f
            int r9 = r9.getRight()
            android.widget.FrameLayout r10 = r11.f326906f
            int r10 = r10.getBottom()
            r6.<init>(r7, r8, r9, r10)
            r5.f332928e = r6
            ug.r0$b r6 = p248ug.C111164r0.C111166b.PHOTO
            r5.f332924a = r6
            h90.b r6 = r11.f326909i
            if (r6 == 0) goto L_0x00e8
            boolean r6 = r6.f288182c
            if (r6 != r4) goto L_0x00e8
            r6 = 1
            goto L_0x00e9
        L_0x00e8:
            r6 = 0
        L_0x00e9:
            r5.f332929f = r6
            r5.f332927d = r12
            r0.mo162895d(r5)
            android.content.Context r5 = r11.f326912o
            ug.e r5 = r0.mo162894c(r5)
            gy3.C87412m.m108592e(r5, r3)
            zp3.e0 r5 = (zp3.C112660e0) r5
            java.util.HashMap<java.lang.String, l23.f0$a> r6 = r11.f326913p
            l23.f0$a r7 = new l23.f0$a
            r7.<init>(r0, r5)
            r6.put(r12, r7)
        L_0x0105:
            java.util.HashMap<java.lang.String, l23.f0$a> r0 = r11.f326913p
            java.lang.Object r0 = r0.get(r12)
            l23.f0$a r0 = (l23.C109184f0.C99298a) r0
            r5 = 0
            if (r0 == 0) goto L_0x0113
            ug.r0 r0 = r0.f291193a
            goto L_0x0114
        L_0x0113:
            r0 = r5
        L_0x0114:
            r11.f326907g = r0
            java.util.HashMap<java.lang.String, l23.f0$a> r0 = r11.f326913p
            java.lang.Object r0 = r0.get(r12)
            l23.f0$a r0 = (l23.C109184f0.C99298a) r0
            if (r0 == 0) goto L_0x0123
            zp3.e0 r0 = r0.f291194b
            goto L_0x0124
        L_0x0123:
            r0 = r5
        L_0x0124:
            r11.f326910j = r0
            com.tencent.mm.cache.ArtistCacheManager r0 = com.tencent.p014mm.cache.ArtistCacheManager.m140185a()
            r0.mo148162e(r12)
            fi.c r0 = p520fi.C107546c.f321771c
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r1)
            r0.mo157987b(r1)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r0 = r11.f326908h
            if (r0 == 0) goto L_0x015b
            android.os.Bundle r0 = r0.f272912M
            if (r0 == 0) goto L_0x015b
            java.lang.String r1 = "matrix"
            float[] r0 = r0.getFloatArray(r1)
            if (r0 == 0) goto L_0x015b
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r1.setValues(r0)
            zp3.e0 r0 = r11.f326910j
            if (r0 == 0) goto L_0x015b
            cq3.a r0 = r0.getBaseBoardView()
            if (r0 == 0) goto L_0x015b
            r0.setForceMatrix(r1)
        L_0x015b:
            zp3.e0 r0 = r11.f326910j
            if (r0 == 0) goto L_0x0166
            eq3.a r0 = r0.getBaseFooterView()
            r5 = r0
            eq3.c r5 = (eq3.C107287c) r5
        L_0x0166:
            if (r5 != 0) goto L_0x0169
            goto L_0x016c
        L_0x0169:
            r5.setHideFooter(r4)
        L_0x016c:
            zp3.e0 r0 = r11.f326910j
            gy3.C87412m.m108592e(r0, r3)
            me3.f r0 = r0.getPresenter()
            r11.f326911n = r0
            if (r0 == 0) goto L_0x017e
            r1 = r0
            me3.c r1 = (me3.C109612c) r1
            r1.f328165h = r2
        L_0x017e:
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter"
            gy3.C87412m.m108592e(r0, r1)
            me3.c r0 = (me3.C109612c) r0
            l23.f0$d r1 = new l23.f0$d
            r1.<init>(r11)
            r0.f328172o = r1
            zp3.e0 r0 = r11.f326910j
            if (r0 != 0) goto L_0x0191
            goto L_0x0199
        L_0x0191:
            l23.f0$e r1 = new l23.f0$e
            r1.<init>(r11)
            r0.setSelectedFeatureListener(r1)
        L_0x0199:
            me3.f r0 = r11.f326911n
            if (r0 == 0) goto L_0x01b0
            ug.t r1 = p248ug.C111167t.DOODLE
            me3.c r0 = (me3.C109612c) r0
            bh.b r0 = r0.mo160818b(r1)
            bh.j r0 = (p1093bh.C104100j) r0
            if (r0 == 0) goto L_0x01b0
            l23.f0$f r1 = new l23.f0$f
            r1.<init>(r11)
            r0.f307896m = r1
        L_0x01b0:
            me3.f r0 = r11.f326911n
            if (r0 == 0) goto L_0x01c7
            ug.t r1 = p248ug.C111167t.MOSAIC
            me3.c r0 = (me3.C109612c) r0
            bh.b r0 = r0.mo160818b(r1)
            bh.p r0 = (p1093bh.C104107p) r0
            if (r0 == 0) goto L_0x01c7
            l23.f0$g r1 = new l23.f0$g
            r1.<init>(r11)
            r0.f307896m = r1
        L_0x01c7:
            android.graphics.BitmapFactory$Options r12 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r12)
            if (r12 == 0) goto L_0x01e5
            th2.d r0 = th2.C110992d.f332425a
            int r1 = r12.outWidth
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "KEY_ORIGIN_MEDIA_WIDTH_INT"
            r0.mo162677k(r2, r1)
            int r12 = r12.outHeight
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = "KEY_ORIGIN_MEDIA_HEIGHT_INT"
            r0.mo162677k(r1, r12)
        L_0x01e5:
            zp3.e0 r12 = r11.f326910j
            gy3.C87412m.m108591d(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l23.C109184f0.mo160425D(java.lang.String):zp3.e0");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        C111167t tVar = this.f326915r;
        C111167t tVar2 = C111167t.CROP_PHOTO;
        if (tVar != tVar2) {
            return false;
        }
        this.f326915r = C111167t.DEFAULT;
        C109623f fVar = this.f326911n;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150363c(tVar2, 1, (Object) null);
        }
        return true;
    }

    public void onDetach() {
        Log.m105924i("MicroMsg.MultiPhotoEditContainerPlugin", "release");
        Collection<C99298a> values = this.f326913p.values();
        C87412m.m108593f(values, "editorViewDataMap.values");
        for (C99298a aVar : values) {
            aVar.f291193a.mo162897f();
            ((C109612c) aVar.f291194b.getPresenter()).mo160828l();
        }
        this.f326913p.clear();
    }

    public void release() {
        Log.m105924i("MicroMsg.MultiPhotoEditContainerPlugin", "release");
        Collection<C99298a> values = this.f326913p.values();
        C87412m.m108593f(values, "editorViewDataMap.values");
        for (C99298a aVar : values) {
            aVar.f291193a.mo162897f();
            ((C109612c) aVar.f291194b.getPresenter()).mo160828l();
        }
        this.f326913p.clear();
        this.f326906f.removeAllViews();
        this.f326906f.setVisibility(8);
        this.f326907g = null;
    }

    public void reset() {
        Log.m105924i("MicroMsg.MultiPhotoEditContainerPlugin", "reset");
        C111167t tVar = C111167t.DEFAULT;
        this.f326915r = tVar;
        C109623f fVar = this.f326911n;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150361a(tVar);
        }
        C109623f fVar2 = this.f326911n;
        if (fVar2 != null) {
            new C109610a((C109612c) fVar2).mo150363c(tVar, -1, (Object) null);
        }
    }

    public void setVisibility(int i) {
        this.f326906f.setVisibility(i);
    }

    /* renamed from: y */
    public final void mo160426y() {
        C111167t tVar = C111167t.MOSAIC;
        this.f326915r = tVar;
        this.f326916s = 1;
        C109623f fVar = this.f326911n;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150361a(tVar);
        }
        C109623f fVar2 = this.f326911n;
        if (fVar2 != null) {
            new C109610a((C109612c) fVar2).mo150363c(tVar, 1, (Object) null);
        }
        C110992d dVar = C110992d.f332425a;
        C110992d.m151314c(dVar, "KEY_CLICK_BRUSH_COUNT_INT", 0, 2, (Object) null);
        dVar.mo162669b(9);
    }

    /* renamed from: z */
    public final void mo160427z(int i) {
        C111167t tVar = C111167t.DOODLE;
        this.f326915r = tVar;
        this.f326916s = i;
        C109623f fVar = this.f326911n;
        if (fVar != null) {
            new C109610a((C109612c) fVar).mo150361a(tVar);
        }
        C109623f fVar2 = this.f326911n;
        if (fVar2 != null) {
            new C109610a((C109612c) fVar2).mo150363c(tVar, i, (Object) null);
        }
    }
}
