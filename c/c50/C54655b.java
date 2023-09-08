package c50;

import ac3.C0031n;
import ac3.C54009m;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Surface;
import android.view.TextureView;
import b50.C54407c;
import b50.C54410e;
import c30.C104289g;
import c30.C26827e;
import c30.C79922d;
import c30.C79923f;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.core.model.UserVolumeInfo;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.xeffect.IWeJsonMessageCallback;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d50.C58115i;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import k50.C60971a;
import k50.C60974c;
import m50.C61437a;
import m50.C61440d;
import m50.C61441e;
import n50.C61619b;
import n50.C61620c;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import q00.C110264g;
import q00.C62571i;
import qr3.C63321d;
import r50.C63367f;
import rx3.C13598b0;
import rx3.C13604l;
import s50.C110742c;
import s50.C110743c0;
import s50.C110747k;
import s50.C110760u;
import s50.C36624a;
import s50.C63699b;
import s50.C63705e;
import s50.C63706f;
import s50.C63709l;
import s50.C63714v;
import s50.C63722z;
import sx3.C26236u;
import sx3.C64186f0;
import z04.C119027c;
import z40.C66733d;

/* renamed from: c50.b */
public final class C54655b extends C60735a implements C54654a {

    /* renamed from: f1 */
    public static C54655b f153178f1;

    /* renamed from: W0 */
    public int f153179W0;

    /* renamed from: X0 */
    public final C54658c f153180X0 = new C54658c(this);

    /* renamed from: Y0 */
    public int f153181Y0;

    /* renamed from: Z0 */
    public final MTimerHandler f153182Z0 = new MTimerHandler("anchor_sei_sender", (MTimerHandler.CallBack) new C54657b(this), true);

    /* renamed from: a1 */
    public final C54009m f153183a1;

    /* renamed from: b1 */
    public final C0031n f153184b1;

    /* renamed from: c1 */
    public C32230s<? super String, ? super Float, ? super Float, ? super Float, ? super Float, C54656a> f153185c1;

    /* renamed from: d1 */
    public C36624a f153186d1;

    /* renamed from: e1 */
    public C63699b f153187e1;

    /* renamed from: c50.b$i */
    public static final class C0415i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54655b f1023d;

        /* renamed from: e */
        public final /* synthetic */ C13604l<Integer, String> f1024e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f1025f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f1026g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0415i(C54655b bVar, C13604l<Integer, String> lVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
            super(0);
            this.f1023d = bVar;
            this.f1024e = lVar;
            this.f1025f = aVar;
            this.f1026g = aVar2;
        }

        public Object invoke() {
            C0031n nVar = this.f1023d.f153184b1;
            C13604l<Integer, String> lVar = this.f1024e;
            nVar.mo28e(lVar != null ? C26236u.m33719b(lVar) : C64186f0.f181907d, this.f1025f, this.f1026g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c50.b$a */
    public static final class C54656a {

        /* renamed from: a */
        public final boolean f153188a;

        /* renamed from: b */
        public final String f153189b;

        /* renamed from: c */
        public final float f153190c;

        /* renamed from: d */
        public final String f153191d;

        /* renamed from: e */
        public final String f153192e;

        /* renamed from: f */
        public final float f153193f;

        /* renamed from: g */
        public final float f153194g;

        /* renamed from: h */
        public final float f153195h;

        /* renamed from: i */
        public final float f153196i;

        /* renamed from: j */
        public final String f153197j;

        /* renamed from: k */
        public final int f153198k;

        public C54656a(boolean z, String str, float f, String str2, String str3, float f2, float f3, float f4, float f5, String str4, int i) {
            C87412m.m108594g(str, "sdkUserId");
            C87412m.m108594g(str2, "gestureId");
            C87412m.m108594g(str3, "randomId");
            C87412m.m108594g(str4, "giftComboId");
            this.f153188a = z;
            this.f153189b = str;
            this.f153190c = f;
            this.f153191d = str2;
            this.f153192e = str3;
            this.f153193f = f2;
            this.f153194g = f3;
            this.f153195h = f4;
            this.f153196i = f5;
            this.f153197j = str4;
            this.f153198k = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54656a)) {
                return false;
            }
            C54656a aVar = (C54656a) obj;
            return this.f153188a == aVar.f153188a && C87412m.m108589b(this.f153189b, aVar.f153189b) && C87412m.m108589b(Float.valueOf(this.f153190c), Float.valueOf(aVar.f153190c)) && C87412m.m108589b(this.f153191d, aVar.f153191d) && C87412m.m108589b(this.f153192e, aVar.f153192e) && C87412m.m108589b(Float.valueOf(this.f153193f), Float.valueOf(aVar.f153193f)) && C87412m.m108589b(Float.valueOf(this.f153194g), Float.valueOf(aVar.f153194g)) && C87412m.m108589b(Float.valueOf(this.f153195h), Float.valueOf(aVar.f153195h)) && C87412m.m108589b(Float.valueOf(this.f153196i), Float.valueOf(aVar.f153196i)) && C87412m.m108589b(this.f153197j, aVar.f153197j) && this.f153198k == aVar.f153198k;
        }

        public int hashCode() {
            boolean z = this.f153188a;
            if (z) {
                z = true;
            }
            return ((((((((((((((((((((z ? 1 : 0) * true) + this.f153189b.hashCode()) * 31) + Float.floatToIntBits(this.f153190c)) * 31) + this.f153191d.hashCode()) * 31) + this.f153192e.hashCode()) * 31) + Float.floatToIntBits(this.f153193f)) * 31) + Float.floatToIntBits(this.f153194g)) * 31) + Float.floatToIntBits(this.f153195h)) * 31) + Float.floatToIntBits(this.f153196i)) * 31) + this.f153197j.hashCode()) * 31) + this.f153198k;
        }

        public String toString() {
            return "GestureSeiData(isSuccess=" + this.f153188a + ", sdkUserId=" + this.f153189b + ", aspect=" + this.f153190c + ", gestureId=" + this.f153191d + ", randomId=" + this.f153192e + ", transX=" + this.f153193f + ", transY=" + this.f153194g + ", rotation=" + this.f153195h + ", scale=" + this.f153196i + ", giftComboId=" + this.f153197j + ", renderMode=" + this.f153198k + ')';
        }
    }

    /* renamed from: c50.b$b */
    public static final class C54657b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C54655b f153199d;

        public C54657b(C54655b bVar) {
            this.f153199d = bVar;
        }

        public final boolean onTimerExpired() {
            TRTCCloud W = this.f153199d.mo85679W();
            C54655b bVar = this.f153199d;
            bVar.getClass();
            C79922d dVar = new C79922d();
            if (bVar.f153181Y0 <= bVar.f172999K.f83322a) {
                int i = bVar.f153179W0;
                Pattern pattern = C61926c.f176038a;
                bVar.f153179W0 = i | 1;
            } else {
                int i2 = bVar.f153179W0;
                Pattern pattern2 = C61926c.f176038a;
                bVar.f153179W0 = i2 & -2;
            }
            if (bVar.f172989A.mo82880b()) {
                bVar.f153179W0 |= 2;
            } else {
                bVar.f153179W0 &= -3;
            }
            C58115i iVar = bVar.f172989A;
            if (iVar.f166264k) {
                bVar.f153179W0 |= 4;
            } else {
                bVar.f153179W0 &= -5;
            }
            dVar.mo110094b("userId", iVar.f166260g);
            dVar.mo110094b("userStatus", Integer.valueOf(bVar.f153179W0));
            TXAudioEffectManager.AudioMusicParam audioMusicParam = bVar.f172994F;
            dVar.mo110094b("songId", Integer.valueOf(audioMusicParam != null ? audioMusicParam.f154608id : 0));
            dVar.mo110094b("playStatus", Integer.valueOf(bVar.f172995G ? 1 : 0));
            dVar.mo110094b("st", Long.valueOf(C31543z5.m39453c()));
            C104289g gVar = new C104289g();
            try {
                gVar.mo145967r("wxT", 16);
                gVar.mo145967r("d", dVar.toString());
                if (C66733d.f191763a.mo90766c()) {
                    bVar.mo75571D0(gVar);
                } else {
                    bVar.mo75570C0(gVar);
                }
                bVar.mo75574G(bVar.mo85680X().f175252r, bVar.mo85680X().f175251q);
            } catch (C79923f | IOException unused) {
            }
            Log.m105918d("MicroMsg.LiveCoreAnchor", "prepareAnchorSeiInfo json:" + gVar);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "prepareAnchorSeiInfo().toString()");
            byte[] bytes = gVar2.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            W.sendSEIMsg(bytes, 1);
            return true;
        }
    }

    /* renamed from: c50.b$c */
    public static final class C54658c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54655b f153200d;

        public C54658c(C54655b bVar) {
            this.f153200d = bVar;
        }

        public void run() {
            this.f153200d.f173021e.removeCallbacks(this);
            this.f153200d.f173021e.postDelayed(this, 10000);
        }
    }

    /* renamed from: c50.b$d */
    public static final class C54659d implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C54655b f153201d;

        /* renamed from: e */
        public final /* synthetic */ long f153202e;

        /* renamed from: f */
        public final /* synthetic */ Context f153203f;

        /* renamed from: g */
        public final /* synthetic */ TextureView f153204g;

        public C54659d(C54655b bVar, long j, Context context, TextureView textureView) {
            this.f153201d = bVar;
            this.f153202e = j;
            this.f153203f = context;
            this.f153204g = textureView;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureAvailable, surface:" + surfaceTexture + ", size:[" + i + ", " + i2 + ']');
            Util.ticksToNow(this.f153202e);
            int i3 = C75044y4.m89990b(this.f153203f).x;
            int i4 = C75044y4.m89990b(this.f153203f).y;
            if (i3 <= i4) {
                int i5 = i4;
                i4 = i3;
                i3 = i5;
            }
            if (i < i2) {
                i2 = (int) (((float) i) * (((float) i3) / ((float) i4)));
            } else if (i2 < i) {
                i = (int) (((float) i2) * (((float) i3) / ((float) i4)));
            }
            this.f153201d.f173031q.mo162268c(this.f153204g.getSurfaceTexture());
            this.f153201d.f173031q.mo162269d(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureDestroyed");
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            Log.m105924i("MicroMsg.LiveCoreAnchor", "float onSurfaceTextureSizeChanged, surface:" + surfaceTexture + ", size:[" + i + ", " + i2 + ']');
            this.f153201d.f173031q.mo162269d(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    /* renamed from: c50.b$e */
    public static final class C54660e extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54655b f153205d;

        /* renamed from: e */
        public final /* synthetic */ long f153206e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54660e(C54655b bVar, long j) {
            super(1);
            this.f153205d = bVar;
            this.f153206e = j;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            this.f153205d.f173031q.mo162268c(surfaceTexture);
            Util.ticksToNow(this.f153206e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c50.b$f */
    public static final class C54661f extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54655b f153207d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54661f(C54655b bVar) {
            super(2);
            this.f153207d = bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            this.f153207d.f173031q.mo162269d(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c50.b$g */
    public static final class C54662g implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C63714v f153208d;

        public C54662g(C63714v vVar) {
            this.f153208d = vVar;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            Log.m105925i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureAvailable, size:[%s, %s]", Integer.valueOf(i), Integer.valueOf(i2));
            this.f153208d.mo88556b(new Surface(surfaceTexture));
            this.f153208d.mo88557c(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            Log.m105924i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureDestroyed");
            C63714v vVar = this.f153208d;
            vVar.getClass();
            vVar.mo88555a(new C63722z(vVar));
            return false;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surfaceTexture");
            Log.m105925i("MicroMsg.LiveCoreAnchor", "customRender onSurfaceTextureSizeChanged, size:[%s, %s]", Integer.valueOf(i), Integer.valueOf(i2));
            this.f153208d.mo88557c(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    /* renamed from: c50.b$h */
    public static final class C54663h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54655b f153209d;

        /* renamed from: e */
        public final /* synthetic */ List<C13604l<Integer, String>> f153210e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54663h(C54655b bVar, List<C13604l<Integer, String>> list) {
            super(0);
            this.f153209d = bVar;
            this.f153210e = list;
        }

        public Object invoke() {
            this.f153209d.f153183a1.mo74674b(this.f153210e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c50.b$j */
    public static final class C54664j extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C54664j f153211d = new C54664j();

        public C54664j() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c50.b$k */
    public static final class C54665k extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C54665k f153212d = new C54665k();

        public C54665k() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c50.b$l */
    public static final class C54666l implements IWeJsonMessageCallback {

        /* renamed from: a */
        public final /* synthetic */ C54655b f153213a;

        public C54666l(C54655b bVar) {
            this.f153213a = bVar;
        }

        /* renamed from: a */
        public int mo75594a(int i, String str, C63321d dVar) {
            boolean z;
            float f;
            float f2;
            float f3;
            int i2 = i;
            String str2 = str;
            C63321d dVar2 = dVar;
            C87412m.m108594g(str2, StateEvent.Name.MESSAGE);
            C87412m.m108594g(dVar2, "type");
            Log.m105924i("MicroMsg.LiveCoreAnchor", "weVisionJsonCallback-cb type=" + dVar2 + " sourceId=" + i2 + " message=" + str2);
            if (dVar2 != C63321d.JSON_LUA_GENERIC) {
                return 0;
            }
            if (this.f153213a.f153183a1.mo74673a(i2)) {
                try {
                    C104289g gVar = new C104289g(str2);
                    C26827e j = gVar.mo110108i("actived");
                    if (j.length() > 0) {
                        Object obj = j.get(0);
                        C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.Boolean");
                        z = ((Boolean) obj).booleanValue();
                    } else {
                        z = false;
                    }
                    if (z) {
                        String valueOf = String.valueOf(this.f153213a.f153183a1.mo74675l(gVar.optInt("id")));
                        C26827e j2 = gVar.mo110108i("transX");
                        float f4 = 0.0f;
                        if (j2.length() > 0) {
                            Object obj2 = j2.get(0);
                            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.Double");
                            f = (float) ((Double) obj2).doubleValue();
                        } else {
                            f = 0.0f;
                        }
                        C26827e j3 = gVar.mo110108i("transY");
                        if (j3.length() > 0) {
                            Object obj3 = j3.get(0);
                            C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.Double");
                            f2 = (float) ((Double) obj3).doubleValue();
                        } else {
                            f2 = 0.0f;
                        }
                        C26827e j4 = gVar.mo110108i("rotation");
                        if (j4.length() > 0) {
                            Object obj4 = j4.get(0);
                            C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.Double");
                            f3 = (float) ((Double) obj4).doubleValue();
                        } else {
                            f3 = 0.0f;
                        }
                        C26827e j5 = gVar.mo110108i("scale");
                        if (j5.length() > 0) {
                            Object obj5 = j5.get(0);
                            C87412m.m108592e(obj5, "null cannot be cast to non-null type kotlin.Double");
                            f4 = (float) ((Double) obj5).doubleValue();
                        }
                        C54655b bVar = this.f153213a;
                        C32230s<? super String, ? super Float, ? super Float, ? super Float, ? super Float, C54656a> sVar = bVar.f153185c1;
                        if (sVar != null) {
                            C54656a D = sVar.mo237D(valueOf, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
                            if (!D.f153188a) {
                                D = null;
                            }
                            C54656a aVar = D;
                            if (aVar != null) {
                                TRTCCloud W = bVar.mo85679W();
                                byte[] bytes = C54655b.m61534B0(bVar, aVar.f153189b, aVar.f153190c, aVar.f153191d, aVar.f153192e, aVar.f153193f, aVar.f153194g, aVar.f153195h, aVar.f153196i, aVar.f153197j, aVar.f153198k).getBytes(C119027c.f356488a);
                                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                                W.sendSEIMsg(bytes, 1);
                            }
                        }
                    }
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.LiveCoreAnchor", e.toString());
                }
            } else if (this.f153213a.f153184b1.mo27a(i2)) {
                try {
                    long optLong = new C104289g(str2).optLong("id");
                    if (optLong > 0) {
                        C54655b bVar2 = this.f153213a;
                        bVar2.f173031q.mo148312q(new C0417d(bVar2, i2, optLong));
                    }
                } catch (Exception e2) {
                    Log.m105920e("MicroMsg.LiveCoreAnchor", e2.toString());
                }
            }
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54655b() {
        super(true);
        Class cls = C62571i.class;
        this.f153183a1 = ((C62571i) C86312j.m106911c(cls)).mo87571ab();
        this.f153184b1 = ((C62571i) C86312j.m106911c(cls)).mo87566HP();
        C54666l lVar = new C54666l(this);
        C110747k kVar = this.f173031q;
        kVar.getClass();
        kVar.mo148312q(new C63709l(kVar, lVar));
    }

    /* renamed from: B0 */
    public static final String m61534B0(C54655b bVar, String str, float f, String str2, String str3, float f2, float f3, float f4, float f5, String str4, int i) {
        bVar.getClass();
        C87412m.m108594g(str, "sdkUserId");
        C87412m.m108594g(str2, "gestureId");
        C87412m.m108594g(str3, "randomId");
        C87412m.m108594g(str4, "giftComboId");
        C104289g gVar = new C104289g();
        gVar.mo145953n("wxT", 32);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("u", str);
        if (i == 0) {
            jSONObject.put("a", Float.valueOf(f));
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject2.put("i", str3);
            jSONObject2.put("x", Float.valueOf(f2));
            jSONObject2.put("y", Float.valueOf(f3));
            jSONObject2.put("r", Float.valueOf(f4));
            jSONObject2.put("s", Float.valueOf(f5));
            jSONObject2.put("g", str4);
            jSONArray.put(jSONObject2);
            jSONObject.put("ga", jSONArray);
        } else if (i == 1) {
            jSONObject.put("gs", str2);
        }
        gVar.put("d", jSONObject.toString());
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "seiJson.toString()");
        return gVar2;
    }

    /* renamed from: B */
    public void mo33283B(int i) {
        super.mo33283B(i);
        this.f153182Z0.stopTimer();
    }

    /* renamed from: C0 */
    public final void mo75570C0(C104289g gVar) {
        String str;
        int i;
        JSONObject jSONObject = mo85680X().f175251q;
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("list");
            int length = optJSONArray != null ? optJSONArray.length() : 0;
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(i2) : null;
                int optInt = optJSONObject != null ? optJSONObject.optInt("us", 0) : 0;
                if (optJSONObject == null || (str = optJSONObject.optString(DownloadInfo.UID)) == null) {
                    str = "";
                } else {
                    C61619b b = C61620c.C61622b.f175234a.mo86554b(str);
                    if (b != null) {
                        if (b.f175225h <= this.f172999K.f83322a) {
                            Pattern pattern = C61926c.f176038a;
                            optInt |= 1;
                        } else {
                            Pattern pattern2 = C61926c.f176038a;
                            optInt &= -2;
                        }
                    }
                }
                C66733d dVar = C66733d.f191763a;
                C54407c cVar = C66733d.f191764b;
                if (cVar != null ? cVar.Ke0(str) : false) {
                    Pattern pattern3 = C61926c.f176038a;
                    i = optInt | 16;
                } else {
                    Pattern pattern4 = C61926c.f176038a;
                    i = optInt & -17;
                }
                if (optJSONObject != null) {
                    optJSONObject.putOpt("us", Integer.valueOf(i));
                }
            }
            gVar.mo145967r("m", jSONObject.toString());
        }
    }

    /* renamed from: D0 */
    public final void mo75571D0(C104289g gVar) {
        String str;
        int i;
        JSONArray jSONArray = mo85680X().f175252r;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                int optInt = optJSONObject != null ? optJSONObject.optInt("us", 0) : 0;
                if (optJSONObject == null || (str = optJSONObject.optString(DownloadInfo.UID)) == null) {
                    str = "";
                } else {
                    C61619b b = C61620c.C61622b.f175234a.mo86554b(str);
                    if (b != null) {
                        if (b.f175225h <= this.f172999K.f83322a) {
                            Pattern pattern = C61926c.f176038a;
                            optInt |= 1;
                        } else {
                            Pattern pattern2 = C61926c.f176038a;
                            optInt &= -2;
                        }
                    }
                }
                if (C66733d.f191763a.mo90764a(str)) {
                    Pattern pattern3 = C61926c.f176038a;
                    i = optInt | 2;
                } else {
                    Pattern pattern4 = C61926c.f176038a;
                    i = optInt & -3;
                }
                if (optJSONObject != null) {
                    optJSONObject.putOpt("us", Integer.valueOf(i));
                }
            }
            gVar.mo145967r("mt", jSONArray.toString());
        }
    }

    /* renamed from: E */
    public int mo75212E() {
        mo85679W().enableCustomVideoCapture(true);
        C60974c cVar = this.f173025i;
        if (cVar != null) {
            cVar.mo85950c();
        }
        this.f172990B = true;
        this.f173031q.mo162267b(C54664j.f153211d);
        C110747k kVar = this.f173031q;
        C54665k kVar2 = C54665k.f153212d;
        kVar.getClass();
        C87412m.m108594g(kVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C110760u uVar = kVar.f331238j;
        if (uVar == null) {
            return 0;
        }
        uVar.f331282L = kVar2;
        return 0;
    }

    /* renamed from: E0 */
    public void mo75572E0(String str) {
        C63714v f;
        Log.m105924i("MicroMsg.LiveCoreAnchor", "refreshMicUserView, userId:" + str);
        if (str != null && (f = mo85680X().mo86563f(str)) != null) {
            Log.m105924i("MicroMsg.LiveCoreAnchor", "refreshMicUserView, find renderSurface for userId:" + this.f172989A.f166260g);
            String str2 = f.f180603a;
            int i = f.f180604b;
            LivePreviewView livePreviewView = this.f173033s;
            TXCloudVideoView a = livePreviewView != null ? livePreviewView.mo76418a(str2, i) : null;
            if (a != null) {
                TextureView textureView = new TextureView(MMApplicationContext.getContext());
                a.addVideoView(textureView);
                textureView.setSurfaceTextureListener(new C54662g(f));
            }
        }
    }

    /* renamed from: F0 */
    public final void mo75573F0(boolean z) {
        C110743c0 c0Var;
        C110742c cVar;
        C110264g gVar;
        C110760u uVar = this.f173031q.f331238j;
        if (uVar != null && (c0Var = uVar.f331275E) != null && (cVar = c0Var.f331216b) != null && (gVar = cVar.f331212e) != null) {
            gVar.mo143238e(z);
        }
    }

    /* renamed from: G */
    public void mo75574G(JSONArray jSONArray, JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONArray != null) {
            bundle.putString("live_link_mic_info_in_anchor_sei_msg_mt", jSONArray.toString());
        }
        if (jSONObject != null) {
            bundle.putString("live_link_mic_info_in_anchor_sei_msg", jSONObject.toString());
        }
        if (C66733d.f191763a.mo90766c()) {
            C54410e eVar = this.f173038x;
            if (eVar != null) {
                eVar.callback(28, bundle);
                return;
            }
            return;
        }
        C54410e eVar2 = this.f173038x;
        if (eVar2 != null) {
            eVar2.callback(24, bundle);
        }
    }

    /* renamed from: G0 */
    public final void mo75575G0(List<C13604l<Integer, String>> list) {
        C87412m.m108594g(list, "luaRes");
        C110747k kVar = this.f173031q;
        C54009m mVar = this.f153183a1;
        kVar.getClass();
        C87412m.m108594g(mVar, "effect");
        kVar.mo148312q(new C63705e(kVar, mVar));
        this.f173031q.mo148312q(new C54663h(this, list));
    }

    /* renamed from: H0 */
    public final void mo75576H0(C13604l<Integer, String> lVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        C110747k kVar = this.f173031q;
        C0031n nVar = this.f153184b1;
        kVar.getClass();
        C87412m.m108594g(nVar, "effect");
        kVar.mo148312q(new C63706f(kVar, nVar));
        this.f173031q.mo148312q(new C0415i(this, lVar, aVar, aVar2));
    }

    /* renamed from: I0 */
    public void mo75577I0(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "connectRoomId");
        C87412m.m108594g(str2, "connectedRoomId");
        C87412m.m108594g(str3, "roomPkSign");
        C61440d c = C60971a.C60973b.f173670a.mo85946c();
        if (c != null) {
            c.f174708g = true;
            c.f174709h = str;
            c.f174710i = str2;
            c.f174706e = str4;
        }
    }

    /* renamed from: J0 */
    public void mo75578J0(C36624a aVar, C63699b bVar) {
        if (aVar == null) {
            aVar = this.f153186d1;
        } else {
            this.f153186d1 = aVar;
        }
        if (bVar == null) {
            bVar = this.f153187e1;
        } else {
            this.f153187e1 = bVar;
        }
        mo85700s0(this.f173033s, aVar, bVar);
    }

    /* renamed from: U */
    public C63367f mo75579U() {
        Log.m105928w("MicroMsg.LiveCoreAnchor", "getLiveMiniManager not support.");
        return new C63367f(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r1.f166251b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo75216e(android.content.Context r17, boolean r18, boolean r19, int r20, int r21, android.graphics.Bitmap r22, boolean r23, com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout<u62.C22597f> r24) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r22
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r7, r0)
            d50.i r0 = r6.f172989A
            d50.h r1 = r6.f173042z
            if (r1 == 0) goto L_0x001c
            d50.g r1 = r1.f166251b
            if (r1 == 0) goto L_0x001c
            long r1 = r1.f166232b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            boolean r0 = r0.mo82883e(r1)
            if (r0 != 0) goto L_0x0025
            r0 = -4
            return r0
        L_0x0025:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "floatMode liveMode:"
            r0.append(r1)
            d50.i r1 = r6.f172989A
            boolean r1 = r1.mo82880b()
            r0.append(r1)
            java.lang.String r1 = ", forceMoveTask:"
            r0.append(r1)
            r9 = r18
            r0.append(r9)
            java.lang.String r1 = ", dontFinish:"
            r0.append(r1)
            r10 = r19
            r0.append(r10)
            java.lang.String r1 = ", generateType:"
            r0.append(r1)
            r11 = r20
            r0.append(r11)
            java.lang.String r1 = ", opType:"
            r0.append(r1)
            r12 = r21
            r0.append(r12)
            java.lang.String r1 = ", staticFloatImage:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", isScreenShareMode:"
            r0.append(r1)
            d50.i r1 = r6.f172989A
            boolean r1 = r1.f166264k
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.LiveCoreAnchor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            d50.i r0 = r6.f172989A
            boolean r1 = r0.f166264k
            r13 = 0
            if (r1 != 0) goto L_0x00ba
            boolean r0 = r0.mo82880b()
            if (r0 == 0) goto L_0x008f
            goto L_0x00ba
        L_0x008f:
            android.view.TextureView r14 = new android.view.TextureView
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r14.<init>(r0)
            c50.b$d r15 = new c50.b$d
            r0 = r15
            r1 = r16
            r4 = r17
            r5 = r14
            r0.<init>(r1, r2, r4, r5)
            r14.setSurfaceTextureListener(r15)
            s50.k r0 = r6.f173031q
            s50.u r0 = r0.f331238j
            if (r0 == 0) goto L_0x00b4
            s50.q r0 = r0.f331287v
            if (r0 == 0) goto L_0x00b4
            r0.f331254K = r13
            r0.f331253J = r13
        L_0x00b4:
            r50.f r0 = r6.f173028o
            r0.mo88273c(r14)
            goto L_0x00fd
        L_0x00ba:
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.<init>(r1)
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1.<init>(r2)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r2)
            r1.setImageBitmap(r8)
            r0.addView(r1)
            d50.i r1 = r6.f172989A
            boolean r1 = r1.mo82880b()
            if (r1 == 0) goto L_0x00f8
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ir.n r1 = (p565ir.C60606n) r1
            android.view.View r1 = r1.h40()
            r2 = 4
            int r2 = kg3.C76577a.m92151b(r7, r2)
            float r2 = (float) r2
            float r2 = -r2
            r1.setTranslationX(r2)
            r0.addView(r1)
        L_0x00f8:
            r50.f r1 = r6.f173028o
            r1.mo88273c(r0)
        L_0x00fd:
            super.mo75216e(r17, r18, r19, r20, r21, r22, r23, r24)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c50.C54655b.mo75216e(android.content.Context, boolean, boolean, int, int, android.graphics.Bitmap, boolean, com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout):int");
    }

    /* renamed from: f0 */
    public void mo75580f0() {
        long currentTicks = Util.currentTicks();
        super.mo75580f0();
        LivePreviewView livePreviewView = this.f173033s;
        if (livePreviewView != null) {
            livePreviewView.mo76421d(new C54660e(this, currentTicks), new C54661f(this));
        }
    }

    /* renamed from: i */
    public void mo75218i(C54410e eVar) {
        C87412m.m108594g(eVar, "callback");
        super.mo75218i(eVar);
        TRTCCloud W = mo85679W();
        Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.raw.mic_user_leave);
        C87412m.m108593f(drawable, "getContext().resources.g…ble(R.raw.mic_user_leave)");
        W.setVideoMuteImage(C61926c.m72686k(drawable), 5);
        C60971a aVar = C60971a.C60973b.f173670a;
        C61441e d = aVar.mo85947d();
        C61437a a = aVar.mo85944a();
        d.getClass();
        a.getClass();
        C60974c cVar = this.f173025i;
        if (cVar != null) {
            cVar.mo85950c();
        }
        C60974c cVar2 = this.f173025i;
        if (cVar2 != null) {
            cVar2.f173671a.enableAudioEarMonitoring(false);
        }
    }

    /* renamed from: i0 */
    public void mo75581i0() {
        super.mo75581i0();
        C110747k kVar = this.f173031q;
        kVar.getClass();
        kVar.mo148312q(new C63709l(kVar, (IWeJsonMessageCallback) null));
        this.f153183a1.mo74671d((C110264g) null);
        this.f153184b1.mo74671d((C110264g) null);
        this.f173021e.removeCallbacks(this.f153180X0);
        this.f173036v = null;
        this.f173037w = null;
        this.f153186d1 = null;
        this.f153187e1 = null;
    }

    /* renamed from: o */
    public void mo33295o(long j) {
        super.mo33295o(j);
        if (j > 0) {
            this.f153182Z0.startTimer(1000, 1000);
        }
        this.f173021e.post(this.f153180X0);
    }

    /* renamed from: s */
    public void mo33298s(int i, String str, Bundle bundle) {
        if (i == -3301) {
            String str2 = "[-3301]create room fail," + str;
            C87412m.m108594g(str2, "debugText");
            Log.m105924i("MicroMsg.LiveCoreError", str2);
            C54410e eVar = this.f173036v;
            if (eVar != null) {
                C54410e.C54411a.m61124a(eVar, i, (Bundle) null, 2, (Object) null);
            }
            this.f173036v = null;
            return;
        }
        super.mo33298s(i, str, bundle);
    }

    /* renamed from: t */
    public void mo33299t(ArrayList<TRTCCloudDef.TRTCVolumeInfo> arrayList, int i) {
        super.mo33299t(arrayList, i);
        ArrayList<C61619b> arrayList2 = C61620c.C61622b.f175234a.f175229a;
        C87412m.m108593f(arrayList2, "getInstance().remoteUserConfigList");
        synchronized (arrayList2) {
            for (C61619b bVar : arrayList2) {
                bVar.f175225h = 0;
            }
        }
        this.f153181Y0 = 0;
        if (arrayList != null) {
            for (TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo : arrayList) {
                if (Util.isEqual(this.f172989A.f166260g, tRTCVolumeInfo.userId)) {
                    this.f153181Y0 = tRTCVolumeInfo.volume;
                } else {
                    C61619b b = C61620c.C61622b.f175234a.mo86554b(tRTCVolumeInfo.userId);
                    if (b != null) {
                        b.f175225h = tRTCVolumeInfo.volume;
                    }
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            for (TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo2 : arrayList) {
                String str = tRTCVolumeInfo2.userId;
                C87412m.m108593f(str, "it.userId");
                arrayList3.add(new UserVolumeInfo(str, tRTCVolumeInfo2.volume));
            }
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("live_user_volume_info", arrayList3);
        C54410e eVar = this.f173038x;
        if (eVar != null) {
            eVar.callback(19, bundle);
        }
    }
}
