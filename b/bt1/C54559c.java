package bt1;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sight.base.AdaptiveAdjustBitrate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C45113r1;
import di3.C86312j;
import er1.C58741j5;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.Iterator;
import rx3.C13598b0;
import te3.C64591nr3;
import te3.C64899zy;
import te3.hi4;
import up1.C37521f;

/* renamed from: bt1.c */
public final class C54559c {

    /* renamed from: a */
    public int f152939a;

    /* renamed from: b */
    public int f152940b;

    /* renamed from: bt1.c$a */
    public static final class C54560a extends C87413o implements C32228q<String, String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64591nr3 f152941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54560a(C64591nr3 nr32) {
            super(3);
            this.f152941d = nr32;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(str, "coverUrl");
            C87412m.m108594g(str2, "fullCoverUrl");
            C64591nr3 nr32 = this.f152941d;
            nr32.f184541d = str;
            nr32.f184542e = str2;
            nr32.f184543f = intValue;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: bt1.c$b */
    public static final class C54561b extends C87413o implements C32228q<String, String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64591nr3 f152942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54561b(C64591nr3 nr32) {
            super(3);
            this.f152942d = nr32;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(str, "coverUrl");
            C87412m.m108594g(str2, "fullCoverUrl");
            C64591nr3 nr32 = this.f152942d;
            nr32.f184541d = str;
            nr32.f184542e = str2;
            nr32.f184543f = intValue;
            return C13598b0.f38549a;
        }
    }

    public C54559c() {
        Class cls = C32735h.class;
        this.f152939a = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_android_use_algorithm_check_black_frame_switch, 0);
        this.f152940b = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_android_replace_user_default_thumb_switch, 0);
    }

    /* renamed from: a */
    public final C64591nr3 mo75446a(String str, long j) {
        String str2 = str;
        C87412m.m108594g(str, "path");
        C64591nr3 nr32 = new C64591nr3();
        nr32.f184546i = -1;
        Log.m105924i("FinderPostReplaceCover", "getCoverPath useAlgorithmCoverSwitch:" + this.f152939a + " replaceUserDefaultThumbSwitch:" + this.f152940b);
        int i = this.f152939a;
        nr32.f184547j = i;
        nr32.f184548n = this.f152940b;
        if (i > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long d = mo75449d(str, 0, j);
            nr32.f184545h = (int) (System.currentTimeMillis() - currentTimeMillis);
            nr32.f184544g = (int) d;
            if (this.f152940b > 0) {
                if (0 <= d && d <= j) {
                    Log.m105924i("FinderPostReplaceCover", "getThumbBitmap replace from: to:" + d);
                    String b = C45113r1.m49957b(str, false);
                    C87412m.m108593f(b, "exportExternalPath(firstVideoTrackPath, false)");
                    mo75450e(mo75448c(b, d), new C54560a(nr32));
                }
            }
        }
        return nr32;
    }

    /* renamed from: b */
    public final C64591nr3 mo75447b(C64899zy zyVar) {
        long j;
        String str;
        long j2;
        C64899zy zyVar2 = zyVar;
        C87412m.m108594g(zyVar2, "composition");
        C64591nr3 nr32 = new C64591nr3();
        nr32.f184546i = -1;
        Log.m105924i("FinderPostReplaceCover", "getCoverPath useAlgorithmCoverSwitch:" + this.f152939a + " replaceUserDefaultThumbSwitch:" + this.f152940b);
        int i = this.f152939a;
        nr32.f184547j = i;
        nr32.f184548n = this.f152940b;
        if (i > 0) {
            long j3 = zyVar2.f186900e;
            long j4 = zyVar2.f186901f;
            Iterator<hi4> it = zyVar2.f186899d.iterator();
            while (true) {
                j = -1;
                if (!it.hasNext()) {
                    str = "";
                    j2 = -1;
                    break;
                }
                hi4 next = it.next();
                C87412m.m108593f(next, "composition.tracks");
                hi4 hi4 = next;
                if (hi4.f183505e == 2) {
                    j = hi4.f183508h;
                    j2 = hi4.f183507g - hi4.f183506f;
                    String str2 = hi4.f183504d;
                    C87412m.m108593f(str2, "track.path");
                    str = str2;
                    break;
                }
            }
            if (j >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long d = mo75449d(str, j, j2);
                nr32.f184545h = (int) (System.currentTimeMillis() - currentTimeMillis);
                nr32.f184544g = (int) d;
                if (this.f152940b > 0) {
                    if (j3 <= d && d <= j4) {
                        Log.m105924i("FinderPostReplaceCover", "getThumbBitmap replace from:" + j3 + " to:" + d);
                        String b = C45113r1.m49957b(str, false);
                        C87412m.m108593f(b, "exportExternalPath(firstVideoTrackPath, false)");
                        mo75450e(mo75448c(b, d), new C54561b(nr32));
                    }
                }
            }
        }
        return nr32;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001b */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo75448c(java.lang.String r4, long r5) {
        /*
            r3 = this;
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r4)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x001b, all -> 0x0016 }
            r4 = 1000(0x3e8, float:1.401E-42)
            long r1 = (long) r4     // Catch:{ IllegalArgumentException | RuntimeException -> 0x001b, all -> 0x0016 }
            long r5 = r5 * r1
            r4 = 3
            android.graphics.Bitmap r4 = r0.getFrameAtTime(r5, r4)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x001b, all -> 0x0016 }
            r0.release()     // Catch:{ RuntimeException -> 0x001f }
            goto L_0x001f
        L_0x0016:
            r4 = move-exception
            r0.release()     // Catch:{ RuntimeException -> 0x001a }
        L_0x001a:
            throw r4
        L_0x001b:
            r0.release()     // Catch:{ RuntimeException -> 0x001e }
        L_0x001e:
            r4 = 0
        L_0x001f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54559c.mo75448c(java.lang.String, long):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public final long mo75449d(String str, long j, long j2) {
        Class cls = C32735h.class;
        return (long) AdaptiveAdjustBitrate.m119562h(str, ((float) j) / 1000.0f, ((float) j2) / 1000.0f, ((C32735h) C86312j.m106911c(cls)).mo58785xe(C32735h.C32737c.clicfg_finder_android_black_frame_avgmvthresh, -1.0f), ((C32735h) C86312j.m106911c(cls)).mo58785xe(C32735h.C32737c.clicfg_finder_android_black_frame_avgqpthresh, -1.0f), ((C32735h) C86312j.m106911c(cls)).mo58785xe(C32735h.C32737c.clicfg_finder_android_black_frame_skipmodethresh, -1.0f));
    }

    /* renamed from: e */
    public final void mo75450e(Bitmap bitmap, C32228q<? super String, ? super String, ? super Integer, C13598b0> qVar) {
        String str = "";
        int i = 0;
        if (bitmap == null) {
            qVar.invoke(str, str, 0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        C58741j5 j5Var = C58741j5.f168184a;
        String str2 = C58741j5.f168196m;
        sb.append(str2);
        sb.append("cover_full");
        sb.append(System.currentTimeMillis());
        String sb4 = sb.toString();
        C37521f fVar = C37521f.f99374d;
        if (!BitmapUtil.saveBitmapToImage(bitmap, fVar.mo61152F(), Bitmap.CompressFormat.JPEG, sb4, false)) {
            sb4 = str;
        }
        String str3 = str2 + "cover_" + System.currentTimeMillis();
        if (BitmapUtil.saveBitmapToImage(bitmap, fVar.mo61152F(), Bitmap.CompressFormat.JPEG, str3, false)) {
            str = str3;
        }
        if (fVar.mo61155I()) {
            fVar.getClass();
            i = AdaptiveAdjustBitrate.m119559e(C37521f.f99419i, 0, bitmap.getWidth(), bitmap.getHeight(), ((float) fVar.mo61152F()) / 100.0f);
        }
        qVar.invoke(str, sb4, Integer.valueOf(i));
    }
}
