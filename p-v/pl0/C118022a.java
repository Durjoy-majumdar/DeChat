package pl0;

import android.animation.Animator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ck0.C80043a;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.CustomLayer;
import com.tencent.mapsdk.raster.model.CustomLayerOptions;
import com.tencent.mapsdk.raster.model.IndoorInfo;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.mapsdk.raster.model.OverlayLevel;
import com.tencent.mapsdk.raster.model.Polygon;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.Polyline;
import com.tencent.mapsdk.raster.model.PolylineOptions;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C1737l0;
import com.tencent.p014mm.plugin.appbrand.luggage.customize.C92908m;
import com.tencent.p014mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import com.tencent.tencentmap.mapsdk.map.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.map.CancelableCallback;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.map.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.TencentMapInitializer;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.DefaultClusterRenderer;
import j20.C117292a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jk0.C87985i;
import js0.C88020k;
import js0.C88024r;
import ms0.C88840a;
import no0.C117632f;
import ol0.C117799e;
import ol0.C117809h0;
import ol0.C117816k;
import ol0.C117821m;
import ol0.C117823m0;
import ol0.C117824n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import p225rc.C89922k;
import p384tk.C101900d;
import pl0.C118080q;
import s24.C90125c;
import tt0.C111053d;
import tt0.C118513c;
import tt0.C78087b;
import zi0.C91755a;

/* renamed from: pl0.a */
public class C118022a implements C118080q {

    /* renamed from: h1 */
    public static final String f352806h1;

    /* renamed from: i1 */
    public static long f352807i1 = 500;

    /* renamed from: A */
    public boolean f352808A = false;

    /* renamed from: B */
    public boolean f352809B = false;

    /* renamed from: C */
    public Object f352810C = new Object();

    /* renamed from: D */
    public SurfaceView f352811D;

    /* renamed from: E */
    public Runnable f352812E = new C118030d0();

    /* renamed from: F */
    public C118080q.C118099n f352813F;

    /* renamed from: G */
    public C118080q.C118113z f352814G;

    /* renamed from: H */
    public boolean f352815H = false;

    /* renamed from: I */
    public C118080q.C118111x f352816I;

    /* renamed from: J */
    public Runnable f352817J;

    /* renamed from: K */
    public C118080q.C118112y f352818K;

    /* renamed from: L */
    public C118080q.C118090g f352819L;

    /* renamed from: M */
    public Map<String, CustomLayer> f352820M = new ConcurrentHashMap();

    /* renamed from: N */
    public ArrayList<String> f352821N = new ArrayList<>();

    /* renamed from: P */
    public Queue<Runnable> f352822P = new LinkedList();

    /* renamed from: Q */
    public CancelableCallback f352823Q = new C118029d();

    /* renamed from: Q0 */
    public AtomicBoolean f352824Q0 = new AtomicBoolean(false);

    /* renamed from: R */
    public ArrayList<Circle> f352825R = new ArrayList<>();

    /* renamed from: R0 */
    public Object f352826R0 = new Object();

    /* renamed from: S */
    public ArrayList<C118036g0> f352827S = new ArrayList<>();

    /* renamed from: S0 */
    public C118080q.C118103r f352828S0;

    /* renamed from: T */
    public Map<String, Polyline> f352829T = new ConcurrentHashMap();

    /* renamed from: T0 */
    public ArrayList<C118046l0> f352830T0 = new ArrayList<>();

    /* renamed from: U */
    public C118034f0 f352831U = new C118034f0();

    /* renamed from: U0 */
    public ArrayList<String> f352832U0 = new ArrayList<>();

    /* renamed from: V */
    public Map<String, C118051m0> f352833V = new ConcurrentHashMap();

    /* renamed from: V0 */
    public ArrayList<Integer> f352834V0 = new ArrayList<>();

    /* renamed from: W */
    public ArrayList<C118038h0> f352835W = new ArrayList<>();

    /* renamed from: W0 */
    public AtomicInteger f352836W0 = new AtomicInteger(100);

    /* renamed from: X */
    public ArrayList<Polygon> f352837X = new ArrayList<>();

    /* renamed from: X0 */
    public HashMap<Integer, Cluster<C118046l0>> f352838X0 = new HashMap<>();

    /* renamed from: Y */
    public boolean f352839Y;

    /* renamed from: Y0 */
    public HashMap<String, C118080q.C118108w> f352840Y0 = new HashMap<>();

    /* renamed from: Z */
    public C118115s f352841Z;

    /* renamed from: Z0 */
    public C91755a f352842Z0;

    /* renamed from: a1 */
    public boolean f352843a1;

    /* renamed from: b1 */
    public boolean f352844b1;

    /* renamed from: c1 */
    public HashMap<String, GroundOverlay> f352845c1 = new HashMap<>();

    /* renamed from: d */
    public Context f352846d;

    /* renamed from: d1 */
    public HashMap<String, VisualLayer> f352847d1 = new HashMap<>();

    /* renamed from: e */
    public String f352848e;

    /* renamed from: e1 */
    public HashMap<String, Arc> f352849e1 = new HashMap<>();

    /* renamed from: f */
    public FrameLayout f352850f;

    /* renamed from: f1 */
    public HashMap<String, VisualLayer.OnLayerStatusChangedListener> f352851f1 = new HashMap<>();

    /* renamed from: g */
    public ImageView f352852g;

    /* renamed from: g1 */
    public C118080q.C118089f f352853g1;

    /* renamed from: h */
    public final SoSoMapView f352854h;

    /* renamed from: i */
    public boolean f352855i;

    /* renamed from: j */
    public C118080q.C118098m f352856j;

    /* renamed from: n */
    public C118080q.C118102q f352857n;

    /* renamed from: o */
    public C118080q.C118101p f352858o;

    /* renamed from: p */
    public C118080q.C118105t f352859p;

    /* renamed from: p0 */
    public C88840a.C88842b f352860p0 = new C89365z();

    /* renamed from: q */
    public int f352861q;

    /* renamed from: r */
    public String f352862r;

    /* renamed from: s */
    public String f352863s;

    /* renamed from: t */
    public int f352864t;

    /* renamed from: u */
    public boolean f352865u;

    /* renamed from: v */
    public boolean f352866v;

    /* renamed from: w */
    public volatile HashMap<String, MarkerTranslateAnimator> f352867w = new HashMap<>();

    /* renamed from: x */
    public volatile HashMap<String, MarkerTranslateAnimator> f352868x = new HashMap<>();

    /* renamed from: x0 */
    public long f352869x0 = 0;

    /* renamed from: y */
    public volatile ClusterManager<C118046l0> f352870y;

    /* renamed from: y0 */
    public AtomicBoolean f352871y0 = new AtomicBoolean(false);

    /* renamed from: z */
    public DefaultClusterRenderer<C118046l0> f352872z;

    /* renamed from: pl0.a$z */
    public class C89365z implements C88840a.C88842b {

        /* renamed from: pl0.a$z$a */
        public class C89366a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C88840a.C88841a f257347d;

            public C89366a(C88840a.C88841a aVar) {
                this.f257347d = aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ab, code lost:
                if (r7 <= 0) goto L_0x00e9;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e4, code lost:
                if (((r7 == -85.0d || r3 == -1000.0d || r14 == -1000.0d || r12 == -85.0d || pl0.C118116u.m166641f(r7, r3, r12, r14) < 5.0d) ? false : true) == false) goto L_0x00e9;
             */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
            /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r17 = this;
                    r0 = r17
                    pl0.a$z r1 = pl0.C118022a.C89365z.this
                    pl0.a r1 = pl0.C118022a.this
                    com.tencent.mm.plugin.location_soso.api.SoSoMapView r2 = r1.f352854h
                    if (r2 == 0) goto L_0x011a
                    pl0.s r2 = r1.f352841Z
                    r3 = 1
                    if (r2 != 0) goto L_0x005a
                    pl0.s r2 = new pl0.s
                    pl0.a$z r4 = pl0.C118022a.C89365z.this
                    pl0.a r4 = pl0.C118022a.this
                    android.content.Context r4 = r4.f352846d
                    r2.<init>(r4)
                    r1.f352841Z = r2
                    pl0.a$z r1 = pl0.C118022a.C89365z.this
                    pl0.a r1 = pl0.C118022a.this
                    pl0.s r2 = r1.f352841Z
                    com.tencent.mm.plugin.location_soso.api.SoSoMapView r1 = r1.f352854h
                    ms0.a$a r4 = r0.f257347d
                    r2.getClass()
                    com.tencent.mapsdk.raster.model.MarkerOptions r5 = new com.tencent.mapsdk.raster.model.MarkerOptions
                    r5.<init>()
                    r6 = 1056964608(0x3f000000, float:0.5)
                    r5.anchor(r6, r6)
                    com.tencent.mapsdk.raster.model.LatLng r6 = new com.tencent.mapsdk.raster.model.LatLng
                    double r7 = r4.f256263a
                    double r9 = r4.f256264b
                    r6.<init>(r7, r9)
                    r5.position(r6)
                    r5.markerView(r2)
                    r4 = 2147483647(0x7fffffff, float:NaN)
                    r5.zIndex(r4)
                    r5.flat(r3)
                    java.lang.String r4 = "AnchorPoint"
                    r5.tag(r4)
                    com.tencent.tencentmap.mapsdk.map.TencentMap r1 = r1.getMap()
                    com.tencent.mapsdk.raster.model.Marker r1 = r1.addMarker(r5)
                    r2.f353104e = r1
                L_0x005a:
                    pl0.a$z r1 = pl0.C118022a.C89365z.this
                    pl0.a r1 = pl0.C118022a.this
                    pl0.s r1 = r1.f352841Z
                    ms0.a$a r2 = r0.f257347d
                    double r12 = r2.f256263a
                    double r14 = r2.f256264b
                    java.lang.String r4 = r2.f256265c
                    double r5 = r2.f256266d
                    double r7 = r1.f353107h
                    r9 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                    int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r2 != 0) goto L_0x0081
                    double r7 = r1.f353108i
                    int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r2 != 0) goto L_0x0081
                    r1.f353107h = r12
                    r1.f353105f = r12
                    r1.f353108i = r14
                    r1.f353106g = r14
                    goto L_0x008d
                L_0x0081:
                    double r7 = r1.f353105f
                    r1.f353107h = r7
                    double r7 = r1.f353106g
                    r1.f353108i = r7
                    r1.f353106g = r14
                    r1.f353105f = r12
                L_0x008d:
                    double r7 = r1.f353107h
                    int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r2 == 0) goto L_0x00ec
                    r11 = r4
                    double r3 = r1.f353108i
                    int r16 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                    if (r16 == 0) goto L_0x00ec
                    java.lang.String r9 = "GPS"
                    boolean r9 = r9.equalsIgnoreCase(r11)
                    r16 = 0
                    if (r9 == 0) goto L_0x00ae
                    r3 = 0
                    int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r7 != 0) goto L_0x00ab
                    goto L_0x00e9
                L_0x00ab:
                    if (r7 <= 0) goto L_0x00e9
                    goto L_0x00e7
                L_0x00ae:
                    java.lang.String r5 = "NETWORK"
                    boolean r5 = r5.equalsIgnoreCase(r11)
                    if (r5 == 0) goto L_0x00e9
                    r5 = -4587690276662804480(0xc055400000000000, double:-85.0)
                    int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r9 == 0) goto L_0x00e3
                    r9 = -4571364728013586432(0xc08f400000000000, double:-1000.0)
                    int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                    if (r11 != 0) goto L_0x00c9
                    goto L_0x00e3
                L_0x00c9:
                    int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                    if (r11 == 0) goto L_0x00e3
                    int r9 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                    if (r9 != 0) goto L_0x00d2
                    goto L_0x00e3
                L_0x00d2:
                    r9 = r3
                    r4 = r7
                    r6 = r9
                    r8 = r12
                    r10 = r14
                    double r3 = pl0.C118116u.m166641f(r4, r6, r8, r10)
                    r5 = 4617315517961601024(0x4014000000000000, double:5.0)
                    int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r7 < 0) goto L_0x00e3
                    r3 = 1
                    goto L_0x00e4
                L_0x00e3:
                    r3 = 0
                L_0x00e4:
                    if (r3 != 0) goto L_0x00e7
                    goto L_0x00e9
                L_0x00e7:
                    r3 = 1
                    goto L_0x00ea
                L_0x00e9:
                    r3 = 0
                L_0x00ea:
                    r1.f353112p = r3
                L_0x00ec:
                    float r2 = r1.f353110n
                    r3 = 1147207680(0x44610000, float:900.0)
                    int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r2 == 0) goto L_0x0105
                    float r2 = r1.f353109j
                    int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                    if (r3 != 0) goto L_0x00fb
                    goto L_0x0105
                L_0x00fb:
                    r1.f353110n = r2
                    double r2 = pl0.C118116u.m166636a(r12, r14)
                    float r2 = (float) r2
                    r1.f353109j = r2
                    goto L_0x010e
                L_0x0105:
                    double r2 = pl0.C118116u.m166636a(r12, r14)
                    float r2 = (float) r2
                    r1.f353109j = r2
                    r1.f353110n = r2
                L_0x010e:
                    com.tencent.mapsdk.raster.model.Marker r1 = r1.f353104e
                    if (r1 == 0) goto L_0x011a
                    com.tencent.mapsdk.raster.model.LatLng r2 = new com.tencent.mapsdk.raster.model.LatLng
                    r2.<init>(r12, r14)
                    r1.setPosition(r2)
                L_0x011a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: pl0.C118022a.C89365z.C89366a.run():void");
            }
        }

        public C89365z() {
        }

        /* renamed from: f */
        public void mo114898f(int i, String str, C88840a.C88841a aVar) {
            if (i != 0) {
                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "errCode:%d, errStr:%s", Integer.valueOf(i), str);
                return;
            }
            Log.m105919d("MicroMsg.Map.DefaultTencentMapView", "refresh location latitude = %f, longitude = %f", Double.valueOf(aVar.f256263a), Double.valueOf(aVar.f256264b));
            if (!C89922k.m112465b(MMApplicationContext.getContext(), (C82381f) null, "android.permission.ACCESS_FINE_LOCATION")) {
                Log.m105928w("MicroMsg.Map.DefaultTencentMapView", "refresh location fail, no perrmission");
                return;
            }
            C118022a aVar2 = C118022a.this;
            if (aVar2.f352839Y && !aVar2.f352855i) {
                C88024r.m109572b(new C89366a(aVar));
            }
        }
    }

    /* renamed from: pl0.a$a */
    public class C118023a implements TencentMap.OnMapCameraChangeListener {
        public C118023a() {
        }

        public void onCameraChange(CameraPosition cameraPosition) {
            if (C118022a.this.f352816I != null) {
                C118080q.C118081a aVar = new C118080q.C118081a();
                cameraPosition.getTarget().getLatitude();
                cameraPosition.getTarget().getLongitude();
                aVar.f352975a = cameraPosition.getZoom();
                aVar.f352976b = cameraPosition.getBearing();
                aVar.f352977c = cameraPosition.getSkew();
                C118022a aVar2 = C118022a.this;
                aVar2.f352816I.mo182593b(aVar, aVar2.f352815H);
            }
        }

        public void onCameraChangeFinish(CameraPosition cameraPosition) {
            if (C118022a.this.f352816I != null) {
                C118080q.C118081a aVar = new C118080q.C118081a();
                cameraPosition.getTarget().getLatitude();
                cameraPosition.getTarget().getLongitude();
                aVar.f352975a = cameraPosition.getZoom();
                aVar.f352976b = cameraPosition.getBearing();
                aVar.f352977c = cameraPosition.getSkew();
                C118022a aVar2 = C118022a.this;
                aVar2.f352816I.mo182592a(aVar, aVar2.f352815H);
                C118022a.this.f352815H = false;
            }
            C118022a.m166456d0(C118022a.this);
        }
    }

    /* renamed from: pl0.a$a0 */
    public class C118024a0 implements C91755a.C91758c {

        /* renamed from: a */
        public final /* synthetic */ String f352874a;

        /* renamed from: b */
        public final /* synthetic */ GroundOverlayOptions f352875b;

        /* renamed from: c */
        public final /* synthetic */ int f352876c;

        public C118024a0(String str, GroundOverlayOptions groundOverlayOptions, int i) {
            this.f352874a = str;
            this.f352875b = groundOverlayOptions;
            this.f352876c = i;
        }

        /* renamed from: a */
        public void mo121428a(InputStream inputStream) {
            if (inputStream == null) {
                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay, openRead failed, url=%s", this.f352874a);
                return;
            }
            Bitmap w0 = C118022a.m166459w0(C118022a.this, inputStream, this.f352874a, 4000000);
            C90125c.m112774a(inputStream);
            if (w0 == null || w0.isRecycled()) {
                Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "groundOverlay decode bitmap fail");
                return;
            }
            this.f352875b.bitmap(BitmapDescriptorFactory.fromBitmap(w0));
            w0.recycle();
            GroundOverlay addGroundOverlay = C118022a.this.f352854h.getMap().addGroundOverlay(this.f352875b);
            if (addGroundOverlay == null) {
                Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay fail, groundOverlay is null");
                return;
            }
            HashMap<String, GroundOverlay> hashMap = C118022a.this.f352845c1;
            hashMap.put("" + this.f352876c, addGroundOverlay);
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay success id:%d", Integer.valueOf(this.f352876c));
        }
    }

    /* renamed from: pl0.a$b */
    public class C118025b implements Runnable {
        public C118025b() {
        }

        public void run() {
            C118022a aVar = C118022a.this;
            C118115s sVar = aVar.f352841Z;
            if (sVar != null && aVar.f352839Y) {
                double latitude = sVar.getLatitude();
                double longitude = C118022a.this.f352841Z.getLongitude();
                C118022a.this.f352854h.getIController().animateTo(latitude, longitude);
                Log.m105919d("MicroMsg.Map.DefaultTencentMapView", "[moveToMapLocation]latitude:%f, longtitude:%f", Double.valueOf(latitude), Double.valueOf(longitude));
            }
        }
    }

    /* renamed from: pl0.a$b0 */
    public class C118026b0 implements C91755a.C91758c {

        /* renamed from: a */
        public final /* synthetic */ String f352879a;

        /* renamed from: b */
        public final /* synthetic */ GroundOverlay f352880b;

        /* renamed from: c */
        public final /* synthetic */ int f352881c;

        public C118026b0(String str, GroundOverlay groundOverlay, int i) {
            this.f352879a = str;
            this.f352880b = groundOverlay;
            this.f352881c = i;
        }

        /* renamed from: a */
        public void mo121428a(InputStream inputStream) {
            if (inputStream == null) {
                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay, openRead failed, url=%s", this.f352879a);
                return;
            }
            Bitmap w0 = C118022a.m166459w0(C118022a.this, inputStream, this.f352879a, 4000000);
            C90125c.m112774a(inputStream);
            if (w0 == null || w0.isRecycled()) {
                Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay decode bitmap fail");
                return;
            }
            this.f352880b.setBitmap(BitmapDescriptorFactory.fromBitmap(w0));
            w0.recycle();
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay success id:%d", Integer.valueOf(this.f352881c));
        }
    }

    /* renamed from: pl0.a$c */
    public class C118027c implements C91755a.C91757b {
        public C118027c() {
        }

        /* renamed from: a */
        public void mo125629a(Bitmap bitmap) {
            if (bitmap != null) {
                C118115s sVar = C118022a.this.f352841Z;
                if (sVar != null && sVar.getRealMarker() != null) {
                    C118022a.this.f352841Z.getRealMarker().setIcon(com.tencent.mapsdk.raster.model.BitmapDescriptorFactory.fromBitmap(bitmap));
                    Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon success");
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon load bitmap is null");
        }
    }

    /* renamed from: pl0.a$c0 */
    public class C118028c0 implements TencentMap.OnScreenShotListener {
        public C118028c0() {
        }

        public void onMapScreenShot(Bitmap bitmap) {
            if (bitmap != null) {
                C118022a.this.f352852g.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: pl0.a$d */
    public class C118029d implements CancelableCallback {
        public C118029d() {
        }

        public void onCancel() {
            ((LinkedList) C118022a.this.f352822P).poll();
            if (!C118022a.this.f352822P.isEmpty()) {
                ((Runnable) ((LinkedList) C118022a.this.f352822P).peek()).run();
            }
        }

        public void onFinish() {
            ((LinkedList) C118022a.this.f352822P).poll();
            if (!C118022a.this.f352822P.isEmpty()) {
                ((Runnable) ((LinkedList) C118022a.this.f352822P).peek()).run();
            }
        }
    }

    /* renamed from: pl0.a$d0 */
    public class C118030d0 implements Runnable {
        public C118030d0() {
        }

        public void run() {
            C118022a.this.f352811D.setVisibility(4);
        }
    }

    /* renamed from: pl0.a$e */
    public class C118031e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TencentMap f352887d;

        /* renamed from: e */
        public final /* synthetic */ float f352888e;

        /* renamed from: f */
        public final /* synthetic */ float f352889f;

        /* renamed from: g */
        public final /* synthetic */ float f352890g;

        /* renamed from: h */
        public final /* synthetic */ double f352891h;

        /* renamed from: i */
        public final /* synthetic */ double f352892i;

        public C118031e(TencentMap tencentMap, float f, float f2, float f3, double d, double d2) {
            this.f352887d = tencentMap;
            this.f352888e = f;
            this.f352889f = f2;
            this.f352890g = f3;
            this.f352891h = d;
            this.f352892i = d2;
        }

        public void run() {
            CameraUpdate J0 = C118022a.this.mo182808J0(this.f352887d, this.f352888e, this.f352889f, this.f352890g, this.f352891h, this.f352892i);
            Log.m105927v("MicroMsg.Map.DefaultTencentMapView", "doing map:%s latitude:%f longitude:%f scale:%f rotate:%f skew:%f", this, Double.valueOf(this.f352891h), Double.valueOf(this.f352892i), Float.valueOf(this.f352888e), Float.valueOf(this.f352889f), Float.valueOf(this.f352890g));
            C118022a aVar = C118022a.this;
            aVar.f352815H = false;
            this.f352887d.animateCamera(J0, C118022a.f352807i1, aVar.f352823Q);
        }
    }

    /* renamed from: pl0.a$e0 */
    public class C118032e0 implements TencentMap.TencentMapGestureListener {
        public C118032e0() {
        }

        public boolean onDoubleTap(float f, float f2) {
            return false;
        }

        public boolean onDown(float f, float f2) {
            C118022a.this.f352815H = true;
            return false;
        }

        public boolean onFling(float f, float f2) {
            return false;
        }

        public boolean onLongPress(float f, float f2) {
            return false;
        }

        public void onMapStable() {
        }

        public boolean onScroll(float f, float f2) {
            return false;
        }

        public boolean onSingleTap(float f, float f2) {
            return false;
        }

        public boolean onUp(float f, float f2) {
            return false;
        }
    }

    /* renamed from: pl0.a$f */
    public class C118033f implements Runnable {
        public C118033f() {
        }

        public void run() {
            C118022a aVar = C118022a.this;
            FrameLayout frameLayout = aVar.f352850f;
            synchronized (aVar.f352827S) {
                Iterator<C118036g0> it = C118022a.this.f352827S.iterator();
                while (it.hasNext()) {
                    frameLayout.removeView(it.next().f352899a);
                }
                C118022a.this.f352827S.clear();
            }
        }
    }

    /* renamed from: pl0.a$f0 */
    public class C118034f0 implements TencentMap.InfoWindowAdapter {
        public C118034f0() {
        }

        public View getInfoWindow(Marker marker) {
            C78087b bVar = null;
            if (marker == null) {
                return null;
            }
            if (Util.isNullOrNil((String) marker.getTag())) {
                Log.m105928w("MicroMsg.Map.DefaultTencentMapView", "realMarker.getTag is null, return");
                return null;
            } else if (((String) marker.getTag()).endsWith("#label")) {
                return null;
            } else {
                C118051m0 H0 = C118022a.this.mo182804H0((String) marker.getTag());
                if (H0 == null) {
                    Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "[getInfoWindow] appbrandMarker is null, return");
                    return null;
                }
                C118080q.C118108w wVar = H0.f353057b;
                if (wVar == null) {
                    Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "[getInfoWindow] appBrandMarker.appBrandMarkerOptions is null, return");
                    return null;
                }
                C118080q.C118108w.C118109a aVar = wVar.f353075r;
                if (aVar == null) {
                    return null;
                }
                Object[] objArr = new Object[2];
                objArr[0] = H0;
                objArr[1] = Boolean.valueOf(aVar.f353089m != null);
                Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "marker:%s calloutStyle.view is %b", objArr);
                if (aVar.f353089m != null) {
                    if (H0.f352935e == null) {
                        H0.f352935e = new ImageView(C118022a.this.f352846d);
                    }
                    Bitmap bitmapFromView = BitmapUtil.getBitmapFromView(aVar.f353089m);
                    if (bitmapFromView == null) {
                        Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "marker:%s calloutStyle.view exist but bitmap is null");
                    }
                    synchronized (C118022a.this.f352810C) {
                        ImageView imageView = H0.f352935e;
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmapFromView);
                        }
                    }
                    return H0.f352935e;
                }
                C118022a aVar2 = C118022a.this;
                aVar2.getClass();
                synchronized (C110233x.f329756b) {
                    if (C110233x.f329756b.size() > 0) {
                        bVar = C110233x.f329756b.removeFirst();
                        if (bVar != null) {
                            if (ViewGroup.class.isInstance(bVar.getParent())) {
                                ((ViewGroup) bVar.getParent()).removeView(bVar);
                            }
                        }
                    }
                }
                if (bVar == null) {
                    bVar = new C78087b(aVar2.f352846d);
                }
                bVar.setText("");
                bVar.setTextSize(12);
                bVar.setTextColor(C78087b.f228881e);
                bVar.setTitlePadding(0);
                bVar.setGravity("center");
                int i = C78087b.f228882f;
                bVar.mo108063a(0, 0, i, i);
                bVar.setText(aVar.f353077a);
                bVar.setTextSize(aVar.f353079c);
                bVar.setTextColor(aVar.f353078b);
                bVar.setTitlePadding(aVar.f353084h);
                bVar.setGravity(aVar.f353086j);
                bVar.mo108063a(aVar.f353080d, aVar.f353081e, aVar.f353082f, aVar.f353083g);
                return bVar;
            }
        }

        public void onInfoWindowDettached(Marker marker, View view) {
            if (view instanceof C78087b) {
                Log.m105918d("MicroMsg.Map.DefaultTencentMapView", "recycler calloutView");
                C78087b bVar = (C78087b) view;
                synchronized (C110233x.f329756b) {
                    if (C110233x.f329756b.size() <= 0) {
                        C110233x.f329756b.push(bVar);
                    }
                }
            }
        }
    }

    /* renamed from: pl0.a$g */
    public class C118035g implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f352897d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f352898e;

        public C118035g(C118022a aVar, boolean z, ImageView imageView) {
            this.f352897d = z;
            this.f352898e = imageView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$19", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (this.f352897d) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f352898e.setColorFilter(Color.parseColor("#88888888"));
                } else if (action == 3 || action == 1) {
                    this.f352898e.clearColorFilter();
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$19", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: pl0.a$g0 */
    public class C118036g0 {

        /* renamed from: a */
        public ImageView f352899a;

        public C118036g0(C118022a aVar, ImageView imageView) {
            this.f352899a = imageView;
        }
    }

    /* renamed from: pl0.a$h */
    public class C118037h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f352900d;

        /* renamed from: e */
        public final /* synthetic */ C118080q.C118100o f352901e;

        /* renamed from: f */
        public final /* synthetic */ String f352902f;

        public C118037h(C118022a aVar, boolean z, C118080q.C118100o oVar, String str) {
            this.f352900d = z;
            this.f352901e = oVar;
            this.f352902f = str;
        }

        public void onClick(View view) {
            C118080q.C118100o oVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f352900d && (oVar = this.f352901e) != null) {
                String str = this.f352902f;
                C117799e.C117800a aVar = (C117799e.C117800a) oVar;
                aVar.getClass();
                C117799e.C117801b bVar = new C117799e.C117801b((C117799e.C117800a) null);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mapId", aVar.f352328a);
                    jSONObject.put("data", str);
                } catch (JSONException e) {
                    Log.m105921e("MicroMsg.JsApiAddMapControls", "put JSON data error : %s", e);
                }
                bVar.f242407f = jSONObject.toString();
                aVar.f352329b.mo109669n(bVar, (int[]) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/map/mapsdk/DefaultTencentMapView$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pl0.a$h0 */
    public class C118038h0 {

        /* renamed from: a */
        public Marker f352903a;

        public C118038h0(C118022a aVar, Marker marker) {
            this.f352903a = marker;
        }
    }

    /* renamed from: pl0.a$i */
    public class C118039i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImageView f352904d;

        /* renamed from: e */
        public final /* synthetic */ FrameLayout.LayoutParams f352905e;

        public C118039i(ImageView imageView, FrameLayout.LayoutParams layoutParams) {
            this.f352904d = imageView;
            this.f352905e = layoutParams;
        }

        public void run() {
            C118022a.this.f352850f.addView(this.f352904d, this.f352905e);
            synchronized (C118022a.this.f352827S) {
                C118022a aVar = C118022a.this;
                aVar.f352827S.add(new C118036g0(aVar, this.f352904d));
            }
        }
    }

    /* renamed from: pl0.a$i0 */
    public class C118040i0 extends ClusterManager<C118046l0> {
        public C118040i0(Context context, TencentMap tencentMap) {
            super(context, tencentMap);
        }

        public void onCameraChange(CameraPosition cameraPosition) {
            super.onCameraChange(cameraPosition);
            if (C118022a.this.f352816I != null) {
                C118080q.C118081a aVar = new C118080q.C118081a();
                cameraPosition.getTarget().getLatitude();
                cameraPosition.getTarget().getLongitude();
                aVar.f352975a = cameraPosition.getZoom();
                aVar.f352976b = cameraPosition.getBearing();
                aVar.f352977c = cameraPosition.getSkew();
                C118022a aVar2 = C118022a.this;
                aVar2.f352816I.mo182593b(aVar, aVar2.f352815H);
            }
        }

        public void onCameraChangeFinish(CameraPosition cameraPosition) {
            super.onCameraChangeFinish(cameraPosition);
            Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish");
            if (C118022a.this.f352816I != null) {
                C118080q.C118081a aVar = new C118080q.C118081a();
                cameraPosition.getTarget().getLatitude();
                cameraPosition.getTarget().getLongitude();
                aVar.f352975a = cameraPosition.getZoom();
                aVar.f352976b = cameraPosition.getBearing();
                aVar.f352977c = cameraPosition.getSkew();
                C118022a aVar2 = C118022a.this;
                aVar2.f352816I.mo182592a(aVar, aVar2.f352815H);
                C118022a.this.f352815H = false;
            }
            C118022a.m166456d0(C118022a.this);
            if (C118022a.this.f352870y != null && C118022a.this.f352870y.getAlgorithm().getClusters((double) cameraPosition.getZoom()).size() > 0) {
                Set<Cluster> clusters = ((NonHierarchicalDistanceBasedAlgorithm) ((PreCachingAlgorithmDecorator) C118022a.this.f352870y.getAlgorithm()).getAlgorithm()).getClusters((double) cameraPosition.getZoom());
                Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish cluster size:%d", Integer.valueOf(clusters.size()));
                for (Cluster items : clusters) {
                    Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "onCameraChangeFinish cluster item size:%d", Integer.valueOf(items.getItems().size()));
                }
            }
        }
    }

    /* renamed from: pl0.a$j */
    public class C118041j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f352908d;

        /* renamed from: e */
        public final /* synthetic */ C118080q.C118108w f352909e;

        /* renamed from: f */
        public final /* synthetic */ C91755a f352910f;

        public C118041j(String str, C118080q.C118108w wVar, C91755a aVar) {
            this.f352908d = str;
            this.f352909e = wVar;
            this.f352910f = aVar;
        }

        public void run() {
            C118022a.this.mo182884u(this.f352908d, this.f352909e, this.f352910f);
        }
    }

    /* renamed from: pl0.a$j0 */
    public class C118042j0 extends DefaultClusterRenderer<C118046l0> {
        public C118042j0(Context context, TencentMap tencentMap, ClusterManager<C118046l0> clusterManager) {
            super(context, tencentMap, clusterManager);
        }

        public void onBeforeClusterItemRendered(ClusterItem clusterItem, MarkerOptions markerOptions) {
            C118046l0 l0Var = (C118046l0) clusterItem;
            super.onBeforeClusterItemRendered(l0Var, markerOptions);
            Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "onBeforeClusterItemRendered");
            int i = l0Var.f352916c;
            if (i > 0 && C118022a.this.f352834V0.contains(Integer.valueOf(i))) {
                Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "remove clusterId:%d", Integer.valueOf(l0Var.f352916c));
                C118022a aVar = C118022a.this;
                aVar.mo182810K0("" + l0Var.f352916c);
                C118022a.this.f352834V0.remove(Integer.valueOf(l0Var.f352916c));
                C118022a.this.f352838X0.remove(Integer.valueOf(l0Var.f352916c));
                C118022a.this.f352870y.cluster();
            }
            l0Var.f352916c = 0;
            Marker marker = getMarker(l0Var);
            C118080q.C118108w wVar = C118022a.this.f352840Y0.get(l0Var.f352914a);
            C118022a.m166458v0(C118022a.this, l0Var.f352914a, markerOptions, wVar, marker);
            MMHandlerThread.postToMainThreadDelayed(new C118079o(this, l0Var, wVar, markerOptions), 200);
        }

        public void onBeforeClusterRendered(Cluster<C118046l0> cluster, MarkerOptions markerOptions) {
            super.onBeforeClusterRendered(cluster, markerOptions);
            boolean z = false;
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "onBeforeClusterRendered, cluster size:%d", Integer.valueOf(cluster.getItems().size()));
            for (C118046l0 next : cluster.getItems()) {
                if (next.f352916c > 0) {
                    C118022a aVar = C118022a.this;
                    aVar.mo182810K0("" + next.f352916c);
                }
                C118022a aVar2 = C118022a.this;
                aVar2.mo182810K0("" + next.f352914a);
            }
            if (!C118022a.this.f352844b1) {
                markerOptions.alpha(0.0f);
            }
            if (C118022a.this.f352828S0 != null) {
                Iterator<C118046l0> it = cluster.getItems().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C118046l0 next2 = it.next();
                    if (((C118051m0) ((ConcurrentHashMap) C118022a.this.f352833V).get(next2.f352914a)) != null) {
                        if (next2.f352916c > 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
                if (z) {
                    C118022a aVar3 = C118022a.this;
                    C118080q.C118103r rVar = aVar3.f352828S0;
                    aVar3.getClass();
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(aVar3.mo182798E0(cluster, true));
                    rVar.mo182579b(jSONArray);
                    return;
                }
                Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "don't send ClusterCreateEvent");
            }
        }
    }

    /* renamed from: pl0.a$k */
    public class C118043k extends Animation {
        public C118043k(C118022a aVar) {
        }
    }

    /* renamed from: pl0.a$k0 */
    public class C118044k0 implements VisualLayer.OnLayerStatusChangedListener {
        public C118044k0(String str) {
        }

        public boolean onEvent(VisualLayer visualLayer, String str, String str2) {
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "onEvent eventType:%s, eventInfo:%s ", str, str2);
            C118080q.C118089f fVar = C118022a.this.f352853g1;
            if (fVar != null) {
                String id = visualLayer.getId();
                C117816k.C117817a aVar = (C117816k.C117817a) fVar;
                aVar.getClass();
                C117821m.C117822a aVar2 = new C117821m.C117822a();
                HashMap hashMap = new HashMap();
                hashMap.put("mapId", Integer.valueOf(C118116u.m166638c(aVar.f352332a)));
                hashMap.put("layerId", id);
                hashMap.put("eventType", str);
                hashMap.put("eventInfo", str2);
                aVar2.mo115165o(hashMap);
                Log.m105925i("MicroMsg.JsApiAddMapVisualLayer", "onEvent eventType:%s, eventInfo:%s", str, str2);
                C82520h pG = ((C87985i) aVar.f352333b.mo109668l(C87985i.class)).mo116941pG(aVar.f352333b, aVar.f352332a);
                if (pG != null) {
                    pG.mo109669n(aVar2, (int[]) null);
                } else {
                    aVar.f352333b.mo109676w(aVar2);
                }
            }
            return false;
        }

        public void onLayerLoadFinish(int i) {
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "onLayerLoadFinish status:%d", Integer.valueOf(i));
        }
    }

    /* renamed from: pl0.a$l */
    public class C118045l extends Animation {
        public C118045l(C118022a aVar) {
        }
    }

    /* renamed from: pl0.a$l0 */
    public static class C118046l0 implements ClusterItem {

        /* renamed from: a */
        public String f352914a;

        /* renamed from: b */
        public LatLng f352915b;

        /* renamed from: c */
        public int f352916c;

        public C118046l0(String str, LatLng latLng) {
            this.f352914a = str;
            this.f352915b = latLng;
        }

        public LatLng getPosition() {
            return this.f352915b;
        }
    }

    /* renamed from: pl0.a$m */
    public class C118047m implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C118080q.C118108w f352917d;

        /* renamed from: e */
        public final /* synthetic */ C91755a f352918e;

        /* renamed from: f */
        public final /* synthetic */ String f352919f;

        /* renamed from: g */
        public final /* synthetic */ Marker f352920g;

        /* renamed from: h */
        public final /* synthetic */ ImageView f352921h;

        /* renamed from: i */
        public final /* synthetic */ FrameLayout f352922i;

        /* renamed from: j */
        public final /* synthetic */ boolean f352923j;

        /* renamed from: n */
        public final /* synthetic */ float f352924n;

        /* renamed from: o */
        public final /* synthetic */ float f352925o;

        /* renamed from: pl0.a$m$a */
        public class C118048a implements C91755a.C91758c {

            /* renamed from: a */
            public final /* synthetic */ String f352927a;

            /* renamed from: pl0.a$m$a$a */
            public class C118049a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ Bitmap[] f352929d;

                /* renamed from: e */
                public final /* synthetic */ int f352930e;

                public C118049a(Bitmap[] bitmapArr, int i) {
                    this.f352929d = bitmapArr;
                    this.f352930e = i;
                }

                public void run() {
                    Marker marker;
                    int i;
                    Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "realMarker setGifIcon markerId:%s", C118047m.this.f352919f);
                    C118047m mVar = C118047m.this;
                    C118051m0 H0 = C118022a.this.mo182804H0(mVar.f352919f);
                    Marker marker2 = C118047m.this.f352920g;
                    if (marker2 != null) {
                        marker2.setGifIcon(this.f352929d, true, this.f352930e);
                    } else if (!(H0 == null || (marker = H0.f352933c) == null || marker == null || (i = this.f352930e) <= 0)) {
                        marker.setGifIcon(this.f352929d, true, i);
                    }
                    for (Bitmap bitmap : this.f352929d) {
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                    }
                }
            }

            /* renamed from: pl0.a$m$a$b */
            public class C118050b implements Runnable {
                public C118050b() {
                }

                public void run() {
                    Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "setMarkerIconFromStream attachMarkerIcon, url=%s", C118048a.this.f352927a);
                    C118047m mVar = C118047m.this;
                    C118022a aVar = C118022a.this;
                    String str = mVar.f352919f;
                    Marker marker = mVar.f352920g;
                    FrameLayout frameLayout = mVar.f352922i;
                    String str2 = C118022a.f352806h1;
                    aVar.mo182816N0(str, marker, frameLayout);
                }
            }

            public C118048a(String str) {
                this.f352927a = str;
            }

            /* renamed from: a */
            public void mo121428a(InputStream inputStream) {
                if (inputStream == null) {
                    Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "_addMarker, openRead failed, url=%s", this.f352927a);
                    C118047m mVar = C118047m.this;
                    C118022a aVar = C118022a.this;
                    String str = mVar.f352919f;
                    Marker marker = mVar.f352920g;
                    ImageView imageView = mVar.f352921h;
                    FrameLayout frameLayout = mVar.f352922i;
                    boolean z = mVar.f352923j;
                    String str2 = C118022a.f352806h1;
                    aVar.mo182812L0(str, marker, imageView, frameLayout, z);
                    return;
                }
                Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "openRead result:%s", this.f352927a);
                InputStream a = C80043a.m97325a(inputStream);
                "HUAWEI".equals(Build.MANUFACTURER);
                a.mark(8388608);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                try {
                    Bitmap bitmap = null;
                    C118022a.m166455D0().mo1726jg(a, (Rect) null, options);
                    String str3 = options.outMimeType;
                    Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "bitmap stream mimeType:%s", str3);
                    if (!TextUtils.isEmpty(str3)) {
                        str3.getClass();
                        if (str3.equals("image/GIF") || str3.equals("image/gif")) {
                            try {
                                a.reset();
                                byte[] c = C90125c.m112776c(a);
                                C90125c.m112774a(a);
                                C11975p X2 = ((C118114r) C89909e.m112436a(C118114r.class)).mo1822X2(c);
                                if (X2 != null) {
                                    C101900d dVar = ((C92908m) X2).f267598a;
                                    int e = dVar != null ? dVar.mo35635e() : 0;
                                    Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "gifDecoder frameCount：%d", Integer.valueOf(e));
                                    if (e > 500) {
                                        e = 500;
                                    }
                                    Bitmap[] bitmapArr = new Bitmap[e];
                                    int i = 0;
                                    int i2 = 0;
                                    while (i < e) {
                                        C101900d dVar2 = ((C92908m) X2).f267598a;
                                        if (dVar2 != null) {
                                            dVar2.mo35631b();
                                        }
                                        C101900d dVar3 = ((C92908m) X2).f267598a;
                                        Bitmap frame = dVar3 != null ? dVar3.getFrame() : bitmap;
                                        if (frame != null) {
                                            C118047m mVar2 = C118047m.this;
                                            bitmapArr[i] = C118022a.m166457u0(C118022a.this, mVar2.f352924n, mVar2.f352925o, frame);
                                            C101900d dVar4 = ((C92908m) X2).f267598a;
                                            i2 += dVar4 != null ? dVar4.mo35633d() : 0;
                                        }
                                        i++;
                                        bitmap = null;
                                    }
                                    Log.m105924i("MicroMsg.WxaMapGifDecoder", "destroy");
                                    C101900d dVar5 = ((C92908m) X2).f267598a;
                                    if (dVar5 != null) {
                                        dVar5.destroy();
                                    }
                                    Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "gifDecoder duration：%d", Integer.valueOf(i2));
                                    MMHandlerThread.postToMainThread(new C118049a(bitmapArr, i2));
                                    return;
                                }
                            } catch (Throwable th) {
                                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "setMarkerIconFromStream, setGifIcon failed, url=%s", this.f352927a);
                                Log.printErrStackTrace("MicroMsg.Map.DefaultTencentMapView", th, "setGifIcon", new Object[0]);
                                C118047m mVar3 = C118047m.this;
                                C118022a.this.mo182812L0(mVar3.f352919f, mVar3.f352920g, mVar3.f352921h, mVar3.f352922i, mVar3.f352923j);
                            }
                        }
                    }
                    try {
                        a.reset();
                        if (options.inSampleSize <= 1) {
                            options.inSampleSize = 1;
                        }
                        while (true) {
                            int i3 = options.outHeight * options.outWidth;
                            int i4 = options.inSampleSize;
                            if ((i3 / i4) / i4 <= 4000000) {
                                break;
                            }
                            options.inSampleSize = i4 + 1;
                        }
                        options.inJustDecodeBounds = false;
                        options.inMutable = true;
                        Bitmap jg = C118022a.m166455D0().mo1726jg(a, (Rect) null, options);
                        if (jg != null) {
                            C118047m mVar4 = C118047m.this;
                            C118022a.this.mo182792A0(mVar4.f352924n, mVar4.f352925o, jg, mVar4.f352921h);
                            MMHandlerThread.postToMainThread(new C118050b());
                            return;
                        }
                        Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "setMarkerIconFromStream, load bitmap fail, url=%s", this.f352927a);
                        C118047m mVar5 = C118047m.this;
                        C118022a.this.mo182812L0(mVar5.f352919f, mVar5.f352920g, mVar5.f352921h, mVar5.f352922i, mVar5.f352923j);
                    } catch (Throwable th4) {
                        Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "setMarkerIconFromStream, exist exception, url=%s", this.f352927a);
                        Log.printErrStackTrace("MicroMsg.Map.DefaultTencentMapView", th4, "setMarkerIconFromStream", new Object[0]);
                        C118047m mVar6 = C118047m.this;
                        C118022a.this.mo182812L0(mVar6.f352919f, mVar6.f352920g, mVar6.f352921h, mVar6.f352922i, mVar6.f352923j);
                    }
                } catch (IllegalArgumentException e2) {
                    Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "setMarkerIconFromStream, exist exception, url=%s", this.f352927a);
                    Log.printErrStackTrace("MicroMsg.Map.DefaultTencentMapView", e2, "[CAUGHT EXCEPTION]", new Object[0]);
                    C118047m mVar7 = C118047m.this;
                    C118022a aVar2 = C118022a.this;
                    String str4 = mVar7.f352919f;
                    Marker marker2 = mVar7.f352920g;
                    ImageView imageView2 = mVar7.f352921h;
                    FrameLayout frameLayout2 = mVar7.f352922i;
                    boolean z2 = mVar7.f352923j;
                    String str5 = C118022a.f352806h1;
                    aVar2.mo182812L0(str4, marker2, imageView2, frameLayout2, z2);
                }
            }
        }

        public C118047m(C118080q.C118108w wVar, C91755a aVar, String str, Marker marker, ImageView imageView, FrameLayout frameLayout, boolean z, float f, float f2) {
            this.f352917d = wVar;
            this.f352918e = aVar;
            this.f352919f = str;
            this.f352920g = marker;
            this.f352921h = imageView;
            this.f352922i = frameLayout;
            this.f352923j = z;
            this.f352924n = f;
            this.f352925o = f2;
        }

        public void run() {
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "iconPath is %s", this.f352917d.f353062e);
            C91755a aVar = this.f352918e;
            if (aVar != null) {
                String str = this.f352917d.f353062e;
                aVar.mo124758Om(str, new C118048a(str));
                return;
            }
            C118022a.this.mo182812L0(this.f352919f, this.f352920g, this.f352921h, this.f352922i, this.f352923j);
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "iconPath is null or imageLoader is null");
        }
    }

    /* renamed from: pl0.a$m0 */
    public static class C118051m0 extends C118080q.C118107v {

        /* renamed from: c */
        public Marker f352933c;

        /* renamed from: d */
        public Marker f352934d;

        /* renamed from: e */
        public ImageView f352935e;
    }

    /* renamed from: pl0.a$n */
    public class C118052n extends Animation {
        public C118052n(C118022a aVar) {
        }
    }

    /* renamed from: pl0.a$o */
    public class C118053o extends Animation {
        public C118053o(C118022a aVar) {
        }
    }

    /* renamed from: pl0.a$p */
    public class C118054p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Marker f352936d;

        public C118054p(C118022a aVar, Marker marker) {
            this.f352936d = marker;
        }

        public void run() {
            this.f352936d.showInfoWindow();
        }
    }

    /* renamed from: pl0.a$q */
    public class C118055q implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C118080q.C118104s f352937d;

        public C118055q(C118022a aVar, C118080q.C118104s sVar) {
            this.f352937d = sVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105918d("MicroMsg.Map.DefaultTencentMapView", "MarkerAnimator end");
            C118080q.C118104s sVar = this.f352937d;
            if (sVar != null) {
                sVar.mo182583a(true);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            Log.m105918d("MicroMsg.Map.DefaultTencentMapView", "MarkerAnimator start");
        }
    }

    /* renamed from: pl0.a$r */
    public class C118056r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C118513c f352938d;

        public C118056r(C118022a aVar, C118513c cVar) {
            this.f352938d = cVar;
        }

        public void run() {
            this.f352938d.f354686d.start();
        }
    }

    /* renamed from: pl0.a$s */
    public class C118057s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C118513c f352939d;

        public C118057s(C118022a aVar, C118513c cVar) {
            this.f352939d = cVar;
        }

        public void run() {
            this.f352939d.f354686d.start();
        }
    }

    /* renamed from: pl0.a$t */
    public class C118058t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MarkerTranslateAnimator f352940d;

        public C118058t(C118022a aVar, MarkerTranslateAnimator markerTranslateAnimator) {
            this.f352940d = markerTranslateAnimator;
        }

        public void run() {
            this.f352940d.cancelAnimation();
        }
    }

    /* renamed from: pl0.a$u */
    public class C118059u implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C118080q.C118104s f352941d;

        /* renamed from: e */
        public final /* synthetic */ String f352942e;

        public C118059u(C118080q.C118104s sVar, String str) {
            this.f352941d = sVar;
            this.f352942e = str;
        }

        public void onAnimationCancel(Animator animator) {
            Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationCancel");
            C118080q.C118104s sVar = this.f352941d;
            if (sVar != null) {
                sVar.mo182584b();
            }
            synchronized (C118022a.this.f352867w) {
                C118022a.this.f352867w.remove(this.f352942e);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationEnd");
            C118080q.C118104s sVar = this.f352941d;
            if (sVar != null) {
                sVar.mo182583a(true);
            }
            synchronized (C118022a.this.f352867w) {
                C118022a.this.f352867w.remove(this.f352942e);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator onAnimationStart");
        }
    }

    /* renamed from: pl0.a$v */
    public class C118060v implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MarkerTranslateAnimator f352944d;

        public C118060v(C118022a aVar, MarkerTranslateAnimator markerTranslateAnimator) {
            this.f352944d = markerTranslateAnimator;
        }

        public void run() {
            Log.m105918d("MicroMsg.Map.DefaultTencentMapView", "MarkerTranslateAnimator start");
            this.f352944d.startAnimation();
        }
    }

    /* renamed from: pl0.a$w */
    public class C118061w implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MarkerTranslateAnimator f352945d;

        public C118061w(C118022a aVar, MarkerTranslateAnimator markerTranslateAnimator) {
            this.f352945d = markerTranslateAnimator;
        }

        public void run() {
            this.f352945d.cancelAnimation();
        }
    }

    /* renamed from: pl0.a$x */
    public class C118062x implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ String f352946d;

        public C118062x(String str) {
            this.f352946d = str;
        }

        public void onAnimationCancel(Animator animator) {
            synchronized (C118022a.this.f352868x) {
                C118022a.this.f352868x.remove(this.f352946d);
            }
        }

        public void onAnimationEnd(Animator animator) {
            synchronized (C118022a.this.f352868x) {
                C118022a.this.f352868x.remove(this.f352946d);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: pl0.a$y */
    public class C118063y implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MarkerTranslateAnimator f352948d;

        public C118063y(C118022a aVar, MarkerTranslateAnimator markerTranslateAnimator) {
            this.f352948d = markerTranslateAnimator;
        }

        public void run() {
            this.f352948d.startAnimation();
        }
    }

    static {
        String str = "E6FBZ-OLSCQ-UIU5C-GWLJ7-ABUPT-V7FJX";
        try {
            str = MMApplicationContext.getContext().getPackageManager().getApplicationInfo(MMApplicationContext.getContext().getPackageName(), 128).metaData.getString("TencentMapSubKey", str);
        } catch (PackageManager.NameNotFoundException e) {
            Log.printDebugStack("Luggage.AndroidPackageUtil", "", e);
        }
        f352806h1 = str;
    }

    public C118022a(Context context, String str, Map<String, Object> map) {
        this.f352846d = context;
        this.f352848e = str;
        this.f352850f = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f352850f.setBackgroundColor(0);
        this.f352850f.setLayoutParams(layoutParams);
        TencentMapOptions C0 = mo182355C0(map);
        boolean z = map.containsKey("isOverseasUser") && ((Boolean) map.get("isOverseasUser")).booleanValue();
        if (z) {
            C0.setServiceProtocol(1, Integer.valueOf(C0966R.raw.sdk_protocol));
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "isOverseaUser:%b", Boolean.valueOf(z));
        TencentMapInitializer.setAgreePrivacy(true);
        SoSoMapView soSoMapView = new SoSoMapView(context, C0);
        this.f352854h = soSoMapView;
        this.f352850f.addView(soSoMapView, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(context);
        this.f352852g = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f352850f.addView(this.f352852g, new ViewGroup.LayoutParams(-1, -1));
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s, init", this);
        soSoMapView.getMap().setInfoWindowAdapter(this.f352831U);
        soSoMapView.getMap().setMapAnchor(0.5f, 0.5f);
        soSoMapView.getMap().enableMultipleInfowindow(true);
        soSoMapView.getMap().setMapStyle(this.f352864t);
        soSoMapView.getMap().setMapType(this.f352866v ? 1008 : 1000);
        soSoMapView.getMap().setHandDrawMapEnable(this.f352865u);
        soSoMapView.getMap().setOnInfoWindowClickListener(new C118064b(this));
        soSoMapView.getMap().setOnMarkerClickListener(new C118067e(this));
        soSoMapView.getMap().setOnMapClickListener(new C118071i(this));
        soSoMapView.getMap().setOnMapLoadedListener(new C118076l(this));
        soSoMapView.getMap().setOnMapPoiClickListener(new C118077m(this));
        soSoMapView.getMap().setOnIndoorStateChangeListener(new C118078n(this));
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s onCreate", this);
        soSoMapView.onCreate((Bundle) null);
        onResume();
    }

    /* renamed from: D0 */
    public static C1737l0 m166455D0() {
        C1737l0 l0Var = (C1737l0) C89909e.m112436a(C1737l0.class);
        return l0Var == null ? C1737l0.f11455j0 : l0Var;
    }

    /* renamed from: d0 */
    public static void m166456d0(C118022a aVar) {
        if (aVar.f352861q == 0 && aVar.f352854h != null && !aVar.f352824Q0.get()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - aVar.f352869x0 > 500) {
                aVar.f352869x0 = currentTimeMillis;
                if (aVar.f352871y0.compareAndSet(false, true)) {
                    Log.m105926v("MicroMsg.Map.DefaultTencentMapView", "updateScreenCapture start");
                    aVar.f352854h.getMap().getScreenShot(new C118072j(aVar));
                }
            }
        }
    }

    /* renamed from: u0 */
    public static Bitmap m166457u0(C118022a aVar, float f, float f2, Bitmap bitmap) {
        aVar.getClass();
        if (f == 0.0f || f2 == 0.0f) {
            f = (float) C88020k.m109553d(bitmap.getWidth());
            f2 = (float) C88020k.m109553d(bitmap.getHeight());
        }
        if (f > 0.0f && f2 > 0.0f && (f != ((float) bitmap.getWidth()) || f2 != ((float) bitmap.getHeight()))) {
            Matrix matrix = new Matrix();
            matrix.postScale(f / ((float) bitmap.getWidth()), f2 / ((float) bitmap.getHeight()));
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } else if (bitmap == null) {
            return null;
        } else {
            try {
                if (!bitmap.isRecycled()) {
                    return bitmap.copy(Bitmap.Config.ARGB_8888, true);
                }
                return null;
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.Map.DefaultTencentMapView", th, "scaleBitmap", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: v0 */
    public static void m166458v0(C118022a aVar, String str, MarkerOptions markerOptions, C118080q.C118108w wVar, Marker marker) {
        aVar.getClass();
        if (wVar != null) {
            markerOptions.position(new LatLng(wVar.f353060c, wVar.f353061d));
            if (!Util.isNullOrNil((String) null)) {
                markerOptions.title((String) null);
            }
            if (!Util.isNullOrNil(wVar.f353073p)) {
                markerOptions.contentDescription(wVar.f353073p);
            }
            markerOptions.rotation(wVar.f353063f);
            markerOptions.alpha(wVar.f353064g);
            FrameLayout frameLayout = (FrameLayout) ((LayoutInflater) aVar.f352846d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f7121yx, (ViewGroup) null);
            C118022a aVar2 = aVar;
            String str2 = str;
            C118080q.C118108w wVar2 = wVar;
            Marker marker2 = marker;
            aVar2.mo182814M0(str2, wVar2, marker2, aVar.f352842Z0, (ImageView) frameLayout.findViewById(C0966R.C0970id.goi), frameLayout, wVar.f353058a);
            markerOptions.markerView(frameLayout);
            markerOptions.anchor(wVar.f353068k, wVar.f353069l);
            markerOptions.tag(str);
            markerOptions.infoWindowHideAnimation(new C118066d(aVar));
            markerOptions.infoWindowShowAnimation(new C118068f(aVar));
            markerOptions.visible(true);
            markerOptions.zIndex(wVar.f353070m + 2);
            markerOptions.level(OverlayLevel.OverlayLevelAboveLabels);
            if (!Util.isNullOrNil(wVar.f353071n) && !Util.isNullOrNil(wVar.f353072o)) {
                markerOptions.indoorInfo(new IndoorInfo(wVar.f353071n, wVar.f353072o));
            }
            C118080q.C118108w.C118109a aVar3 = wVar.f353075r;
            if (aVar3 != null) {
                markerOptions.infoWindowOffset(aVar3.f353087k, aVar3.f353088l);
            }
            if (TextUtils.isEmpty(wVar.f353074q) || !wVar.f353074q.equals("withLabel")) {
                if (marker != null) {
                    marker.setCollisions((Collision[]) null);
                }
                markerOptions.setCollisions((MarkerCollisionItem[]) null);
                return;
            }
            if (marker != null) {
                marker.setCollisions(MarkerCollisionItem.POI);
            }
            markerOptions.setCollisions(MarkerCollisionItem.POI);
        }
    }

    /* renamed from: w0 */
    public static Bitmap m166459w0(C118022a aVar, InputStream inputStream, String str, int i) {
        aVar.getClass();
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "fetchBitmapFromStream:%s", str);
        InputStream a = C80043a.m97325a(inputStream);
        "HUAWEI".equals(Build.MANUFACTURER);
        a.mark(8388608);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            m166455D0().mo1726jg(a, (Rect) null, options);
            try {
                a.reset();
                if (options.inSampleSize <= 1) {
                    options.inSampleSize = 1;
                }
                while (true) {
                    int i2 = options.outHeight * options.outWidth;
                    int i3 = options.inSampleSize;
                    if ((i2 / i3) / i3 > i) {
                        options.inSampleSize = i3 + 1;
                    } else {
                        options.inJustDecodeBounds = false;
                        options.inMutable = true;
                        return m166455D0().mo1726jg(a, (Rect) null, options);
                    }
                }
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "decodeBitmapFromStream, exist exception, url=%s", str);
                Log.printErrStackTrace("MicroMsg.Map.DefaultTencentMapView", th, "", new Object[0]);
                return null;
            }
        } catch (IllegalArgumentException e) {
            Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "decodeBitmapFromStream, exist exception, url=%s", str);
            Log.printErrStackTrace("MicroMsg.Map.DefaultTencentMapView", e, "[CAUGHT EXCEPTION]", new Object[0]);
            return null;
        }
    }

    /* renamed from: A */
    public float mo182791A() {
        return this.f352854h.getMap().getCameraPosition().getBearing();
    }

    /* renamed from: A0 */
    public final void mo182792A0(float f, float f2, Bitmap bitmap, ImageView imageView) {
        if (imageView == null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "markerIcon is null, err");
            return;
        }
        if (f == 0.0f || f2 == 0.0f) {
            f = (float) C88020k.m109553d(bitmap.getWidth());
            f2 = (float) C88020k.m109553d(bitmap.getHeight());
        }
        if (f <= 0.0f || f2 <= 0.0f || (f == ((float) bitmap.getWidth()) && f2 == ((float) bitmap.getHeight()))) {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f / ((float) bitmap.getWidth()), f2 / ((float) bitmap.getHeight()));
        imageView.setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
    }

    /* renamed from: B */
    public void mo182793B(String str) {
        CustomLayer customLayer = (CustomLayer) ((ConcurrentHashMap) this.f352820M).remove(str);
        if (customLayer != null) {
            Log.m105927v("MicroMsg.Map.DefaultTencentMapView", "removeCustomLayer success, layerId:%s", str);
            customLayer.remove();
            return;
        }
        Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "removeCustomLayer fail, layerId:%s", str);
    }

    /* renamed from: B0 */
    public final Bundle mo182794B0() {
        Bundle bundle = new Bundle();
        if (!f352806h1.equals(this.f352862r)) {
            String nullAsNil = Util.nullAsNil(bundle.getString("smallAppKey"));
            bundle.putString("smallAppKey", nullAsNil + this.f352862r + "#" + this.f352863s + ";");
        }
        return bundle;
    }

    /* renamed from: C */
    public void mo182795C(double d, double d2, float f, float f2, float f3) {
        mo182796D(d, d2, f, f2, f3, false);
    }

    /* renamed from: C0 */
    public TencentMapOptions mo182355C0(Map<String, Object> map) {
        TencentMapOptions tencentMapOptions = new TencentMapOptions();
        if (map == null) {
            Log.m105928w("MicroMsg.Map.DefaultTencentMapView", "params is null, return");
            return tencentMapOptions;
        }
        String e = C118116u.m166640e(map, "theme", "normal");
        this.f352865u = e.equals("handDraw");
        int d = C118116u.m166639d(map, "mapType", 1);
        this.f352861q = d;
        tencentMapOptions.setMapType(d);
        this.f352862r = C118116u.m166640e(map, "subKey", "");
        this.f352863s = C118116u.m166640e(map, "subId", "");
        this.f352866v = C118116u.m166639d(map, "enableDarkMode", 0) == 1;
        boolean z = map.containsKey("enableMSAA") && ((Boolean) map.get("enableMSAA")).booleanValue();
        tencentMapOptions.setEnableMSAA(z);
        if (Util.isNullOrNil(this.f352862r)) {
            this.f352862r = f352806h1;
            this.f352863s = "";
        } else {
            this.f352866v = false;
        }
        tencentMapOptions.setSubInfo(this.f352862r, this.f352863s);
        this.f352864t = C118116u.m166639d(map, "styleId", 0);
        Log.m105919d("MicroMsg.Map.DefaultTencentMapView", "MapReport subId:%s, subKey:%s", this.f352863s, this.f352862r);
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "[createTencentMapOptions]theme:%s isHandDraw:%b, mapType:%d, subId:%s, subKey:%s, styleId:%d enableDarkmode:%b", e, Boolean.valueOf(this.f352865u), Integer.valueOf(this.f352861q), this.f352863s, this.f352862r, Integer.valueOf(this.f352864t), Boolean.valueOf(this.f352866v));
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "enableMSAA:%b", Boolean.valueOf(z));
        return tencentMapOptions;
    }

    /* renamed from: D */
    public void mo182796D(double d, double d2, float f, float f2, float f3, boolean z) {
        TencentMap map;
        Log.m105927v("MicroMsg.Map.DefaultTencentMapView", "start map:%s latitude:%f longitude:%f scale:%f rotate:%f skew:%f", this, Double.valueOf(d), Double.valueOf(d2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
        if ((f != -1.0f || f2 != -1.0f || f3 != -1.0f || d != -1.0d || d2 != -1.0d) && (map = this.f352854h.getMap()) != null) {
            if (z) {
                C118031e eVar = new C118031e(map, f, f2, f3, d, d2);
                ((LinkedList) this.f352822P).add(eVar);
                if (((LinkedList) this.f352822P).size() == 1) {
                    eVar.run();
                    return;
                }
                return;
            }
            CameraUpdate J0 = mo182808J0(map, f, f2, f3, d, d2);
            this.f352815H = false;
            map.moveCamera(J0);
        }
    }

    /* renamed from: E */
    public Point mo182797E(C118080q.C118093j jVar) {
        if (jVar == null) {
            return null;
        }
        Log.m105924i("MicroMsg.Map.DefaultTencentMapView", C117823m0.NAME);
        return this.f352854h.getMap().getProjection().toScreenLocation(new LatLng(jVar.f353022a, jVar.f353023b));
    }

    /* renamed from: E0 */
    public final JSONObject mo182798E0(Cluster<C118046l0> cluster, boolean z) {
        int i = 0;
        if (z) {
            try {
                i = this.f352836W0.getAndIncrement();
                this.f352834V0.add(Integer.valueOf(i));
                this.f352838X0.put(Integer.valueOf(i), cluster);
                for (C118046l0 l0Var : cluster.getItems()) {
                    l0Var.f352916c = i;
                }
            } catch (Exception | JSONException unused) {
                return null;
            }
        } else {
            Iterator<C118046l0> it = cluster.getItems().iterator();
            if (it.hasNext()) {
                i = it.next().f352916c;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("clusterId", i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("latitude", cluster.getPosition().getLatitude());
        jSONObject2.put("longitude", cluster.getPosition().getLongitude());
        jSONObject.put("center", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        for (C118046l0 l0Var2 : cluster.getItems()) {
            jSONArray.put(l0Var2.f352914a);
        }
        jSONObject.put("markerIds", jSONArray);
        return jSONObject;
    }

    /* renamed from: F */
    public void mo182799F() {
        synchronized (this.f352835W) {
            Iterator<C118038h0> it = this.f352835W.iterator();
            while (it.hasNext()) {
                it.next().f352903a.remove();
            }
            this.f352835W.clear();
        }
    }

    /* renamed from: F0 */
    public final C118046l0 mo182800F0(String str) {
        synchronized (this.f352826R0) {
            Iterator<C118046l0> it = this.f352830T0.iterator();
            while (it.hasNext()) {
                C118046l0 next = it.next();
                if (str.contains(next.f352914a)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: G */
    public void mo182801G(String str, int i, C118080q.C118093j jVar, boolean z) {
        Polyline polyline = (Polyline) ((ConcurrentHashMap) this.f352829T).get(str);
        if (polyline == null) {
            Log.m105929w("MicroMsg.Map.DefaultTencentMapView", "lineId:%s is null", str);
            return;
        }
        polyline.setEraseable(z);
        polyline.eraseTo(i, new LatLng(jVar.f353022a, jVar.f353023b));
    }

    /* renamed from: G0 */
    public final int mo182802G0(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.equals("abovelabels")) {
            return OverlayLevel.OverlayLevelAboveLabels;
        }
        if (str.equals("abovebuildings")) {
            return OverlayLevel.OverlayLevelAboveBuildings;
        }
        if (str.equals("aboveroads")) {
            return OverlayLevel.OverlayLevelAboveRoads;
        }
        return -1;
    }

    /* renamed from: H */
    public void mo182803H(boolean z) {
        this.f352854h.getMap().setTrafficEnabled(z);
    }

    /* renamed from: H0 */
    public C118051m0 mo182804H0(String str) {
        return (C118051m0) ((ConcurrentHashMap) this.f352833V).get(str);
    }

    /* renamed from: I */
    public void mo182805I(float f, float f2, boolean z) {
        LatLng mapCenter = this.f352854h.getMap().getMapCenter();
        this.f352854h.setMapAnchor(f, f2);
        mo182796D(mapCenter.getLatitude(), mapCenter.getLongitude(), -1.0f, -1.0f, -1.0f, z);
    }

    /* renamed from: I0 */
    public final SurfaceView mo182806I0(ViewGroup viewGroup) {
        if (!(viewGroup == null || viewGroup.getChildCount() == 0)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof SurfaceView) {
                    return (SurfaceView) childAt;
                }
                if (childAt instanceof ViewGroup) {
                    return mo182806I0((ViewGroup) childAt);
                }
            }
        }
        return null;
    }

    /* renamed from: J */
    public void mo182807J(double d, double d2) {
        mo182796D(d, d2, -1.0f, -1.0f, -1.0f, true);
    }

    /* renamed from: J0 */
    public final CameraUpdate mo182808J0(TencentMap tencentMap, float f, float f2, float f3, double d, double d2) {
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        double d3 = d;
        double d4 = d2;
        int i = (f4 > -1.0f ? 1 : (f4 == -1.0f ? 0 : -1));
        if (i == 0 && f5 == -1.0f && f6 == -1.0f && d3 != -1.0d && d4 != -1.0d) {
            return CameraUpdateFactory.newLatLng(new LatLng(d3, d4));
        }
        CameraPosition cameraPosition = tencentMap.getCameraPosition();
        CameraPosition.Builder skew = new CameraPosition.Builder(cameraPosition).bearing(cameraPosition.getBearing()).skew(cameraPosition.getSkew());
        Log.m105927v("MicroMsg.Map.DefaultTencentMapView", "tencentMap.getCameraPosition:%s rotate:%f skew:%f", tencentMap.getCameraPosition(), Float.valueOf(tencentMap.getCameraPosition().getBearing()), Float.valueOf(tencentMap.getCameraPosition().getSkew()));
        if (i != 0) {
            skew.zoom(f4);
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map_scale zoom:%f", Float.valueOf(f));
        }
        if (f5 != -1.0f) {
            skew.bearing(f5);
        }
        if (f6 != -1.0f) {
            skew.skew(f6);
        }
        if (!(d3 == -1.0d || d4 == -1.0d)) {
            skew.target(new LatLng(d3, d4));
        }
        return CameraUpdateFactory.newCameraPosition(skew.build());
    }

    /* renamed from: K */
    public void mo182809K(boolean z) {
        this.f352854h.getUiSettings().setTiltGesturesEnabled(z);
    }

    /* renamed from: K0 */
    public boolean mo182810K0(String str) {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s removeLabelMarker markerId:%s", this, str);
        Map<String, C118051m0> map = this.f352833V;
        C118051m0 m0Var = (C118051m0) ((ConcurrentHashMap) map).remove(str + "#label");
        if (m0Var == null) {
            Log.m105929w("MicroMsg.Map.DefaultTencentMapView", "marker:%s is null", str);
            return false;
        }
        Marker marker = m0Var.f352934d;
        if (marker != null) {
            if (marker.getMarkerView() != null && (m0Var.f352934d.getMarkerView() instanceof C111053d)) {
                C110233x.m149844b((C111053d) m0Var.f352934d.getMarkerView());
            }
            m0Var.f352934d.remove();
        }
        return true;
    }

    /* renamed from: L */
    public void mo182811L(String str, ArrayList<C118080q.C118093j> arrayList, long j, boolean z, C118080q.C118104s sVar) {
        C118051m0 H0 = mo182804H0(str);
        int i = 0;
        if (H0 == null || H0.f352933c == null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "get marker failed!");
            if (sVar != null) {
                sVar.mo182583a(false);
            }
        } else if (arrayList == null || arrayList.size() <= 0) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "keyFrame is empty, err, return");
            if (sVar != null) {
                sVar.mo182583a(false);
            }
        } else {
            synchronized (this.f352867w) {
                if (this.f352867w.containsKey(str)) {
                    C88024r.m109572b(new C118058t(this, this.f352867w.get(str)));
                }
            }
            LatLng[] latLngArr = new LatLng[arrayList.size()];
            Iterator<C118080q.C118093j> it = arrayList.iterator();
            while (it.hasNext()) {
                C118080q.C118093j next = it.next();
                latLngArr[i] = new LatLng(next.f353022a, next.f353023b);
                i++;
            }
            MarkerTranslateAnimator markerTranslateAnimator = new MarkerTranslateAnimator(H0.f352933c, j, latLngArr, z);
            markerTranslateAnimator.addAnimatorListener(new C118059u(sVar, str));
            synchronized (this.f352867w) {
                this.f352867w.put(str, markerTranslateAnimator);
            }
            C88024r.m109572b(new C118060v(this, markerTranslateAnimator));
            if (H0.f352934d != null) {
                Log.m105918d("MicroMsg.Map.DefaultTencentMapView", "labelMarker do move animator");
                synchronized (this.f352868x) {
                    if (this.f352868x.containsKey(str)) {
                        C88024r.m109572b(new C118061w(this, this.f352868x.get(str)));
                    }
                }
                MarkerTranslateAnimator markerTranslateAnimator2 = new MarkerTranslateAnimator(H0.f352934d, j, latLngArr, z);
                markerTranslateAnimator2.addAnimatorListener(new C118062x(str));
                synchronized (this.f352868x) {
                    this.f352868x.put(str, markerTranslateAnimator2);
                }
                C88024r.m109572b(new C118063y(this, markerTranslateAnimator2));
            }
        }
    }

    /* renamed from: L0 */
    public final void mo182812L0(String str, Marker marker, ImageView imageView, FrameLayout frameLayout, boolean z) {
        if (imageView != null) {
            if (z) {
                imageView.setImageResource(C0966R.C0969drawable.bu9);
            } else {
                imageView.setImageBitmap((Bitmap) null);
            }
        }
        mo182816N0(str, marker, frameLayout);
    }

    /* renamed from: M */
    public final void mo182813M(List<LatLng> list, int i, int i2, int i3, int i4) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include((Iterable<LatLng>) list);
        this.f352815H = false;
        this.f352854h.getMap().animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), i4, i2, i, i3));
        this.f352817J = null;
    }

    /* renamed from: M0 */
    public final void mo182814M0(String str, C118080q.C118108w wVar, Marker marker, C91755a aVar, ImageView imageView, FrameLayout frameLayout, boolean z) {
        C118080q.C118108w wVar2 = wVar;
        float f = wVar2.f353066i;
        float f2 = wVar2.f353067j;
        if (aVar == null || Util.isNullOrNil(wVar2.f353062e)) {
            mo182812L0(str, marker, imageView, frameLayout, z);
            return;
        }
        String str2 = str;
        Marker marker2 = marker;
        ImageView imageView2 = imageView;
        FrameLayout frameLayout2 = frameLayout;
        mo182812L0(str2, marker2, imageView2, frameLayout2, false);
        C88024r.m109571a().postToWorker(new C118047m(wVar, aVar, str2, marker2, imageView2, frameLayout2, z, f, f2));
    }

    /* renamed from: N */
    public void mo182815N(String str, C91755a aVar) {
        Bitmap Rb;
        C118115s sVar;
        if (aVar != null && !TextUtils.isEmpty(str) && (Rb = aVar.mo124759Rb(str, (Rect) null, new C118027c())) != null && (sVar = this.f352841Z) != null && sVar.getRealMarker() != null) {
            this.f352841Z.getRealMarker().setIcon(com.tencent.mapsdk.raster.model.BitmapDescriptorFactory.fromBitmap(Rb));
            Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "setMapLocMarkerIcon success");
        }
    }

    /* renamed from: N0 */
    public final void mo182816N0(String str, Marker marker, FrameLayout frameLayout) {
        Marker marker2;
        C118051m0 H0 = mo182804H0(str);
        if (marker != null) {
            marker.setMarkerView(frameLayout);
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "setMarkerView markerId:%s", str);
        } else if (H0 != null && (marker2 = H0.f352933c) != null) {
            if (marker2 != null) {
                marker2.setMarkerView(frameLayout);
            }
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "setMarkerView, markerId:%s", str);
        }
    }

    /* renamed from: O */
    public C118080q.C118090g mo182817O() {
        C118080q.C118090g gVar = this.f352819L;
        if (gVar != null) {
            return gVar;
        }
        C118080q.C118090g gVar2 = new C118080q.C118090g();
        gVar2.f353011a = "";
        gVar2.f353012b = "";
        gVar2.f353013c = new LinkedList();
        gVar2.f353014d = -1;
        return gVar2;
    }

    /* renamed from: O0 */
    public final void mo182818O0(Marker marker) {
        if (marker != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                marker.showInfoWindow();
            } else {
                MMHandlerThread.postToMainThread(new C118054p(this, marker));
            }
        }
    }

    /* renamed from: P */
    public void mo182819P(String str) {
        if (!this.f352809B) {
            if (!this.f352821N.contains(str)) {
                this.f352821N.add(str);
            }
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "addCustomLayer, wait map loaded callback");
            return;
        }
        CustomLayer addCustomLayer = this.f352854h.getMap().addCustomLayer(new CustomLayerOptions().layerId(str));
        if (addCustomLayer != null) {
            Log.m105927v("MicroMsg.Map.DefaultTencentMapView", "addCustomLayer success, layerId:%s", str);
            CustomLayer customLayer = (CustomLayer) ((ConcurrentHashMap) this.f352820M).remove(str);
            if (customLayer != null) {
                customLayer.remove();
            }
            ((ConcurrentHashMap) this.f352820M).put(str, addCustomLayer);
            return;
        }
        Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "addCustomLayer fail, layerId:%s", str);
    }

    /* renamed from: Q */
    public void mo182820Q(C118080q.C118111x xVar) {
        this.f352816I = xVar;
        this.f352854h.getMap().setTencentMapGestureListener(new C118032e0());
        this.f352854h.getMap().setOnMapCameraChangeListener(new C118023a());
    }

    /* renamed from: R */
    public void mo182821R(String str, String str2) {
        this.f352854h.getMap().setIndoorFloor(str, str2);
    }

    /* renamed from: S */
    public void mo182822S(boolean z) {
        this.f352854h.getUiSettings().setRotateGesturesEnabled(z);
    }

    /* renamed from: T */
    public void mo182823T(int i) {
        HashMap<String, Arc> hashMap = this.f352849e1;
        if (hashMap.containsKey("" + i)) {
            HashMap<String, Arc> hashMap2 = this.f352849e1;
            hashMap2.remove("" + i).remove();
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "removeMapArc success id:%d", Integer.valueOf(i));
            return;
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "removeMapArc fail id:%d", Integer.valueOf(i));
    }

    /* renamed from: U */
    public void mo182824U() {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s removeAllMarker", this);
        for (C118051m0 m0Var : ((ConcurrentHashMap) this.f352833V).values()) {
            Marker marker = m0Var.f352933c;
            if (marker != null) {
                marker.remove();
            }
            Marker marker2 = m0Var.f352934d;
            if (marker2 != null) {
                if (marker2.getMarkerView() != null && (m0Var.f352934d.getMarkerView() instanceof C111053d)) {
                    C110233x.m149844b((C111053d) m0Var.f352934d.getMarkerView());
                }
                m0Var.f352934d.remove();
            }
        }
        ((ConcurrentHashMap) this.f352833V).clear();
        Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "removeAllMapCluster");
        if (this.f352870y != null) {
            ArrayList arrayList = new ArrayList();
            synchronized (this.f352826R0) {
                arrayList.addAll(this.f352830T0);
                this.f352832U0.clear();
                this.f352830T0.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f352870y.removeItem((C118046l0) it.next());
            }
            this.f352870y.cluster();
            this.f352834V0.clear();
            this.f352840Y0.clear();
        }
    }

    /* renamed from: V */
    public boolean mo182825V(Cluster<C118046l0> cluster) {
        Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "onClusterClick");
        if (this.f352843a1) {
            LinkedList linkedList = new LinkedList();
            for (C118046l0 l0Var : cluster.getItems()) {
                linkedList.add(l0Var.f352915b);
            }
            mo182813M(linkedList, 0, 0, 0, 0);
        }
        C118080q.C118103r rVar = this.f352828S0;
        if (rVar == null) {
            return true;
        }
        rVar.mo182578a(mo182798E0(cluster, false));
        return true;
    }

    /* renamed from: W */
    public void mo182826W(boolean z) {
        this.f352854h.getUiSettings().setZoomGesturesEnabled(z);
    }

    /* renamed from: X */
    public boolean mo182827X(boolean z, boolean z2, int i, int i2, C118080q.C118103r rVar) {
        boolean z3;
        if (this.f352854h.getMap() == null) {
            z3 = false;
        } else {
            this.f352808A = true;
            C118073k kVar = new C118073k(this, i, i2);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                kVar.run();
            } else {
                MMHandlerThread.postToMainThread(kVar);
            }
            z3 = true;
        }
        if (z3) {
            this.f352828S0 = rVar;
            this.f352843a1 = z2;
            this.f352844b1 = z;
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "initMapMarkerCluster zoomOnClick:%b, enableDefaultStyle:%b", Boolean.valueOf(z2), Boolean.valueOf(z));
        }
        return z3;
    }

    /* renamed from: Y */
    public void mo182828Y(float f, float f2) {
        C118115s sVar;
        if (this.f352839Y && !this.f352855i && (sVar = this.f352841Z) != null) {
            sVar.mo182828Y(f, f2);
        }
    }

    /* renamed from: Z */
    public boolean mo182829Z(int i, C118080q.C118093j jVar, C118080q.C118093j jVar2, C118080q.C118093j jVar3, float f, float f2, int i2) {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "addMapArc id:%d", Integer.valueOf(i));
        HashMap<String, Arc> hashMap = this.f352849e1;
        if (hashMap.containsKey("" + i)) {
            HashMap<String, Arc> hashMap2 = this.f352849e1;
            hashMap2.remove("" + i).remove();
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "removeMapArc success id:%d first and add again", Integer.valueOf(i));
        }
        ArcOptions arcOptions = new ArcOptions();
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
        latLng.latitude = jVar.f353022a;
        latLng.longitude = jVar.f353023b;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
        latLng2.latitude = jVar2.f353022a;
        latLng2.longitude = jVar2.f353023b;
        if (jVar3 != null) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
            latLng3.latitude = jVar3.f353022a;
            latLng3.longitude = jVar3.f353023b;
            arcOptions.pass(latLng3);
        }
        arcOptions.points(latLng, latLng2);
        arcOptions.angle(f);
        arcOptions.width(f2);
        arcOptions.color(i2);
        Arc addArc = this.f352854h.getMap().addArc(arcOptions);
        if (addArc != null) {
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "addMapArc success, id:%d", Integer.valueOf(i));
            HashMap<String, Arc> hashMap3 = this.f352849e1;
            hashMap3.put("" + i, addArc);
            return true;
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "addMapArc fail, id:%d", Integer.valueOf(i));
        return false;
    }

    /* renamed from: a */
    public void mo182830a(boolean z) {
        this.f352854h.getUiSettings().setScrollGesturesEnabled(z);
    }

    /* renamed from: a0 */
    public void mo182831a0() {
        synchronized (this.f352825R) {
            Iterator<Circle> it = this.f352825R.iterator();
            while (it.hasNext()) {
                it.next().remove();
            }
            this.f352825R.clear();
        }
    }

    /* renamed from: b */
    public void mo182356b(int i, int i2) {
    }

    /* renamed from: b0 */
    public void mo182832b0(C118080q.C118098m mVar) {
        this.f352856j = mVar;
    }

    /* renamed from: c */
    public void mo182833c() {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s moveToMapLocation", this);
        C118025b bVar = new C118025b();
        this.f352817J = bVar;
        if (this.f352841Z != null && this.f352839Y) {
            bVar.run();
            this.f352817J = null;
        }
    }

    /* renamed from: c0 */
    public void mo182834c0(boolean z) {
        this.f352854h.getUiSettings().setCompassEnabled(z);
    }

    /* renamed from: d */
    public void mo182835d(List<C118080q.C118093j> list, int i, int i2, int i3, int i4) {
        LinkedList linkedList = new LinkedList();
        for (C118080q.C118093j next : list) {
            linkedList.add(new LatLng(next.f353022a, next.f353023b));
        }
        mo182813M(linkedList, i, i2, i3, i4);
    }

    /* renamed from: e */
    public void mo182836e(C118080q.C118089f fVar) {
        this.f352853g1 = fVar;
    }

    /* renamed from: e0 */
    public void mo182837e0(C118080q.C118102q qVar) {
        this.f352857n = qVar;
    }

    public void enableAutoMaxOverlooking(boolean z) {
        this.f352854h.getMap().enableAutoMaxOverlooking(z);
    }

    public void enableIndoorLevelPick(boolean z) {
        this.f352854h.getUiSettings().setIndoorLevelPickerEnabled(z);
    }

    /* renamed from: f */
    public void mo182840f(C118080q.C118112y yVar) {
        this.f352818K = yVar;
    }

    /* renamed from: f0 */
    public boolean mo182841f0() {
        return (this.f352870y == null || this.f352872z == null) ? false : true;
    }

    public C118080q.C118093j fromScreenLocation(Point point) {
        if (point == null) {
            return null;
        }
        Log.m105924i("MicroMsg.Map.DefaultTencentMapView", C117824n.NAME);
        LatLng fromScreenLocation = this.f352854h.getMap().getProjection().fromScreenLocation(point);
        return new C118080q.C118093j(fromScreenLocation.getLatitude(), fromScreenLocation.getLongitude());
    }

    /* renamed from: g */
    public String mo182843g(String str, String str2) {
        if (this.f352854h == null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "executeMapVisualLayerCommand fail, tencentMapView null");
            return "";
        }
        HashMap<String, VisualLayer> hashMap = this.f352847d1;
        if (!hashMap.containsKey("" + str)) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "executeMapVisualLayerCommand fail, VisualLayer not exist");
            return "";
        }
        HashMap<String, VisualLayer> hashMap2 = this.f352847d1;
        VisualLayer visualLayer = hashMap2.get("" + str);
        return visualLayer != null ? this.f352854h.getMap().executeMapVisualLayerCommand(visualLayer, str2) : "";
    }

    /* renamed from: g0 */
    public boolean mo182844g0(C118080q.C118094k kVar) {
        Log.m105924i("MicroMsg.Map.DefaultTencentMapView", C117809h0.NAME);
        if (kVar.f353024a == null || kVar.f353025b == null) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
        C118080q.C118093j jVar = kVar.f353024a;
        latLng.longitude = jVar.f353023b;
        latLng.latitude = jVar.f353022a;
        com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
        C118080q.C118093j jVar2 = kVar.f353025b;
        latLng2.longitude = jVar2.f353023b;
        latLng2.latitude = jVar2.f353022a;
        this.f352854h.getMap().setMapBoundary(new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(latLng2, latLng));
        return true;
    }

    public C118080q.C118093j getMapCenter() {
        LatLng mapCenter = this.f352854h.getMap().getMapCenter();
        return new C118080q.C118093j(mapCenter.getLatitude(), mapCenter.getLongitude());
    }

    public C118080q.C118084b0 getProjection() {
        LatLngBounds latLngBounds = this.f352854h.getProjection().getVisibleRegion().getLatLngBounds();
        C118080q.C118094k kVar = new C118080q.C118094k();
        kVar.f353024a = new C118080q.C118093j(latLngBounds.getSouthwest().getLatitude(), latLngBounds.getSouthwest().getLongitude());
        kVar.f353025b = new C118080q.C118093j(latLngBounds.getNortheast().getLatitude(), latLngBounds.getNortheast().getLongitude());
        C118080q.C118086c0 c0Var = new C118080q.C118086c0();
        c0Var.f353000a = kVar;
        C118080q.C118084b0 b0Var = new C118080q.C118084b0();
        b0Var.f352992a = c0Var;
        return b0Var;
    }

    public View getView() {
        return this.f352850f;
    }

    public float getZoom() {
        return this.f352854h.getMap().getCameraPosition().getZoom();
    }

    /* renamed from: h */
    public boolean mo182849h() {
        return this instanceof C117632f;
    }

    /* renamed from: h0 */
    public void mo182850h0(C118080q.C118083b bVar) {
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.center(new LatLng(bVar.f352985a, bVar.f352986b));
        circleOptions.radius((double) bVar.f352987c);
        circleOptions.strokeColor(bVar.f352988d);
        circleOptions.strokeWidth((float) bVar.f352989e);
        circleOptions.fillColor(bVar.f352990f);
        int G0 = mo182802G0(bVar.f352991g);
        if (G0 >= 0) {
            circleOptions.level(G0);
        } else {
            circleOptions.level(OverlayLevel.OverlayLevelAboveLabels);
        }
        Circle addCircle = this.f352854h.getMap().addCircle(circleOptions);
        synchronized (this.f352825R) {
            this.f352825R.add(addCircle);
        }
    }

    /* renamed from: i */
    public boolean mo182851i(String str) {
        boolean z;
        C118046l0 l0Var;
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s removeMarker markerId:%s", this, str);
        if (this.f352832U0.contains(str)) {
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "removeMapMarkerClusterGeometry id:%s", str);
            if (this.f352870y != null && !TextUtils.isEmpty(str)) {
                synchronized (this.f352826R0) {
                    Iterator<C118046l0> it = this.f352830T0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            l0Var = null;
                            break;
                        }
                        l0Var = it.next();
                        if (str.contains(l0Var.f352914a)) {
                            break;
                        }
                    }
                }
                if (l0Var != null) {
                    this.f352870y.removeItem(l0Var);
                    synchronized (this.f352826R0) {
                        this.f352830T0.remove(l0Var);
                        this.f352832U0.remove(str);
                    }
                    this.f352840Y0.remove(str);
                    if (l0Var.f352916c > 0) {
                        mo182810K0("" + l0Var.f352916c);
                        this.f352834V0.remove(Integer.valueOf(l0Var.f352916c));
                        this.f352838X0.remove(Integer.valueOf(l0Var.f352916c));
                    }
                    Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "remove MapMarker ClusterGeometry success id:%s", str);
                    this.f352870y.cluster();
                }
            }
        }
        C118051m0 m0Var = (C118051m0) ((ConcurrentHashMap) this.f352833V).get(str);
        if (m0Var != null) {
            Marker marker = m0Var.f352933c;
            if (marker != null) {
                marker.remove();
            }
            Marker marker2 = m0Var.f352934d;
            if (marker2 != null) {
                if (marker2.getMarkerView() != null && (m0Var.f352934d.getMarkerView() instanceof C111053d)) {
                    C110233x.m149844b((C111053d) m0Var.f352934d.getMarkerView());
                }
                m0Var.f352934d.remove();
            }
            synchronized (this.f352810C) {
                m0Var.f352935e = null;
            }
            ((ConcurrentHashMap) this.f352833V).remove(str);
            z = true;
        } else {
            Log.m105929w("MicroMsg.Map.DefaultTencentMapView", "marker:%s is null", str);
            z = false;
        }
        C118051m0 m0Var2 = (C118051m0) ((ConcurrentHashMap) this.f352833V).remove(str + "#label");
        if (m0Var2 == null) {
            return z;
        }
        Marker marker3 = m0Var2.f352934d;
        if (marker3 != null) {
            marker3.remove();
        }
        Marker marker4 = m0Var2.f352933c;
        if (marker4 != null) {
            marker4.remove();
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "remove labelMarker id:%s", str + "#label");
        return true;
    }

    /* renamed from: i0 */
    public boolean mo182852i0(String str) {
        HashMap<String, VisualLayer> hashMap = this.f352847d1;
        if (!hashMap.containsKey("" + str)) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "removeMapVisualLayer fail, VisualLayer not exist");
            return false;
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "removeMapVisualLayer layerId:%s", str);
        HashMap<String, VisualLayer> hashMap2 = this.f352847d1;
        VisualLayer remove = hashMap2.remove("" + str);
        if (remove == null) {
            return false;
        }
        VisualLayer.OnLayerStatusChangedListener remove2 = this.f352851f1.remove(str);
        if (remove2 != null) {
            remove.removeLayerStatusChangedListener(remove2);
        }
        remove.remove();
        return true;
    }

    /* renamed from: j */
    public void mo182853j(C118080q.C118113z zVar) {
        this.f352814G = zVar;
    }

    /* renamed from: j0 */
    public boolean mo182854j0(C118080q.C118087d dVar, C91755a aVar) {
        if (dVar == null || Util.isNullOrNil(dVar.f353003c)) {
            return false;
        }
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(new LatLng(dVar.f353001a, dVar.f353002b));
        Bitmap load = aVar.load(dVar.f353003c);
        if (load != null && !load.isRecycled()) {
            markerOptions.icon(new BitmapDescriptor(load));
        }
        markerOptions.rotation(dVar.f353004d);
        Marker addMarker = this.f352854h.getMap().addMarker(markerOptions);
        synchronized (this.f352835W) {
            this.f352835W.add(new C118038h0(this, addMarker));
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo182855k(C118080q.C118082a0 a0Var) {
        PolygonOptions polygonOptions = new PolygonOptions();
        ArrayList arrayList = new ArrayList();
        for (C118080q.C118093j next : a0Var.f352978a) {
            arrayList.add(new LatLng(next.f353022a, next.f353023b));
        }
        polygonOptions.addAll(arrayList);
        polygonOptions.fillColor(a0Var.f352979b);
        polygonOptions.strokeColor(a0Var.f352981d);
        polygonOptions.strokeWidth((float) a0Var.f352980c);
        polygonOptions.zIndex((float) a0Var.f352982e);
        int G0 = mo182802G0(a0Var.f352983f);
        if (G0 >= 0) {
            polygonOptions.level(G0);
        }
        int[] iArr = a0Var.f352984g;
        if (iArr != null && iArr.length >= 2 && (iArr[0] > 0 || iArr[1] > 0)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(iArr[0]));
            arrayList2.add(Integer.valueOf(iArr[1]));
            polygonOptions.pattern(arrayList2);
        }
        Polygon addPolygon = this.f352854h.getMap().addPolygon(polygonOptions);
        synchronized (this.f352837X) {
            this.f352837X.add(addPolygon);
        }
        return true;
    }

    /* renamed from: k0 */
    public void mo182856k0(boolean z) {
        this.f352854h.getMap().setIndoorEnabled(z);
    }

    /* renamed from: l */
    public boolean mo182857l(int i, C118080q.C118088e eVar, C91755a aVar) {
        if (i < 0 || eVar == null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay fail, id < 0 or options is null");
            return false;
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "remove GroundOverlay id:%d, first ,and than add again", Integer.valueOf(i));
        mo182862n0(i);
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "addGroundOverlay id:%d", Integer.valueOf(i));
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        if (!(eVar.f353006b == null || eVar.f353007c == null)) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
            C118080q.C118093j jVar = eVar.f353006b;
            latLng.longitude = jVar.f353023b;
            latLng.latitude = jVar.f353022a;
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
            C118080q.C118093j jVar2 = eVar.f353007c;
            latLng2.longitude = jVar2.f353023b;
            latLng2.latitude = jVar2.f353022a;
            groundOverlayOptions.latLngBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(latLng2, latLng));
        }
        groundOverlayOptions.alpha(eVar.f353008d);
        groundOverlayOptions.visible(eVar.f353009e);
        groundOverlayOptions.zIndex(eVar.f353010f);
        if (aVar != null && !TextUtils.isEmpty(eVar.f353005a)) {
            String str = eVar.f353005a;
            aVar.mo124758Om(str, new C118024a0(str, groundOverlayOptions, i));
        } else if (aVar != null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "groundOverlay icon path is null");
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    public void mo182858l0(boolean z) {
        this.f352854h.getMap().setSatelliteEnabled(z);
    }

    /* renamed from: m */
    public boolean mo182859m(int i, C118080q.C118088e eVar, C91755a aVar) {
        if (eVar == null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay fail, options is null");
            return false;
        }
        HashMap<String, GroundOverlay> hashMap = this.f352845c1;
        if (!hashMap.containsKey("" + i)) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay fail, groundOverlay not exist");
            return false;
        }
        HashMap<String, GroundOverlay> hashMap2 = this.f352845c1;
        GroundOverlay groundOverlay = hashMap2.get("" + i);
        if (groundOverlay == null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay fail, groundOverlay is null");
            return false;
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "updateGroundOverlay id:%d", Integer.valueOf(i));
        if (!(eVar.f353006b == null || eVar.f353007c == null)) {
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
            C118080q.C118093j jVar = eVar.f353006b;
            latLng.longitude = jVar.f353023b;
            latLng.latitude = jVar.f353022a;
            com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2 = new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
            C118080q.C118093j jVar2 = eVar.f353007c;
            latLng2.longitude = jVar2.f353023b;
            latLng2.latitude = jVar2.f353022a;
            groundOverlay.setLatLongBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(latLng2, latLng));
        }
        groundOverlay.setAlpha(eVar.f353008d);
        groundOverlay.setVisibility(eVar.f353009e);
        groundOverlay.setZindex(eVar.f353010f);
        if (aVar != null && !TextUtils.isEmpty(eVar.f353005a)) {
            String str = eVar.f353005a;
            aVar.mo124758Om(str, new C118026b0(str, groundOverlay, i));
        } else if (aVar != null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "groundOverlay icon path is null");
            return false;
        }
        return true;
    }

    /* renamed from: m0 */
    public boolean mo182860m0(String str) {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s removeLine lineId:%s", this, str);
        Polyline polyline = (Polyline) ((ConcurrentHashMap) this.f352829T).get(str);
        if (polyline == null) {
            Log.m105929w("MicroMsg.Map.DefaultTencentMapView", "lineId:%s is null", str);
            return false;
        }
        polyline.remove();
        ((ConcurrentHashMap) this.f352829T).remove(str);
        return true;
    }

    /* renamed from: n */
    public void mo182861n(String str, C118080q.C118108w wVar, C91755a aVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo182884u(str, wVar, aVar);
        } else {
            MMHandlerThread.postToMainThread(new C118041j(str, wVar, aVar));
        }
    }

    /* renamed from: n0 */
    public boolean mo182862n0(int i) {
        HashMap<String, GroundOverlay> hashMap = this.f352845c1;
        if (!hashMap.containsKey("" + i)) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "removeGroundOverlay fail, groundOverlay not exist");
            return false;
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "removeGroundOverlay id:%d", Integer.valueOf(i));
        HashMap<String, GroundOverlay> hashMap2 = this.f352845c1;
        GroundOverlay remove = hashMap2.remove("" + i);
        if (remove == null) {
            return false;
        }
        remove.remove();
        return true;
    }

    /* renamed from: o */
    public void mo182863o(C118080q.C118105t tVar) {
        this.f352859p = tVar;
    }

    /* renamed from: o0 */
    public void mo182357o0(Surface surface) {
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s onDestroy", this);
        this.f352824Q0.set(true);
        this.f352854h.getMap().setOnMapCameraChangeListener((TencentMap.OnMapCameraChangeListener) null);
        mo182824U();
        mo182867p();
        mo182867p();
        mo182872r0();
        mo182799F();
        mo182873s();
        for (CustomLayer remove : ((ConcurrentHashMap) this.f352820M).values()) {
            remove.remove();
        }
        ((ConcurrentHashMap) this.f352820M).clear();
        SoSoMapView soSoMapView = this.f352854h;
        if (soSoMapView != null) {
            soSoMapView.getMap().setOnMapPoiClickListener((TencentMap.OnMapPoiClickListener) null);
            this.f352854h.clean();
            this.f352854h.onDestroy();
        }
        C118115s sVar = this.f352841Z;
        if (sVar != null) {
            Marker marker = sVar.f353104e;
            if (marker != null) {
                marker.remove();
                sVar.f353104e = null;
            }
            this.f352841Z = null;
        }
    }

    public void onPause() {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s onPause", this);
        if (this.f352861q == 0) {
            this.f352852g.setVisibility(0);
            SurfaceView surfaceView = this.f352811D;
            if (surfaceView == null) {
                if (surfaceView == null) {
                    surfaceView = mo182806I0(this.f352854h);
                    this.f352811D = surfaceView;
                }
                this.f352811D = surfaceView;
            }
            if (this.f352811D != null) {
                MMHandlerThread.postToMainThreadDelayed(this.f352812E, 100);
            } else {
                Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "hideTencentMap err");
            }
            this.f352854h.setVisibility(4);
            this.f352854h.getMap().getScreenShot(new C118028c0());
        } else {
            this.f352854h.onPause();
        }
        this.f352855i = true;
        if (this.f352839Y) {
            ((C88840a) C89909e.m112436a(C88840a.class)).mo123225a6("gcj02", this.f352860p0, mo182794B0());
            C118117v.m166648g(this);
        }
    }

    public void onResume() {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s onResume", this);
        if (this.f352861q == 0) {
            this.f352852g.setVisibility(4);
            this.f352854h.setVisibility(0);
            this.f352854h.onResume();
            SurfaceView surfaceView = this.f352811D;
            if (surfaceView == null) {
                if (surfaceView == null) {
                    surfaceView = mo182806I0(this.f352854h);
                    this.f352811D = surfaceView;
                }
                this.f352811D = surfaceView;
            }
            if (this.f352811D != null) {
                MMHandlerThread.removeRunnable(this.f352812E);
                this.f352811D.setVisibility(0);
            } else {
                Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "showTencentMap err");
            }
        } else {
            this.f352854h.onResume();
        }
        this.f352855i = false;
        if (this.f352839Y) {
            ((C88840a) C89909e.m112436a(C88840a.class)).Cb0("gcj02", this.f352860p0, mo182794B0());
            C118117v.m166646e(this);
        }
    }

    public void onTouchEvent(MotionEvent motionEvent) {
    }

    /* renamed from: p */
    public void mo182867p() {
        for (Polyline remove : ((ConcurrentHashMap) this.f352829T).values()) {
            remove.remove();
        }
        ((ConcurrentHashMap) this.f352829T).clear();
    }

    /* renamed from: p0 */
    public void mo182868p0(boolean z) {
        this.f352854h.getUiSettings().setScaleControlsEnabled(z);
    }

    /* renamed from: q */
    public boolean mo182869q(String str, int i, double d, int i2, String str2) {
        HashMap<String, VisualLayer> hashMap = this.f352847d1;
        if (hashMap.containsKey("" + str)) {
            Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "VisualLayer not exist, remove visualLayer id:%s first, and than add again", str);
            mo182852i0(str);
        }
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "addMapVisualLayer id:%s", str);
        VisualLayerOptionsBuilder newBuilder = new VisualLayerOptions(str).newBuilder();
        newBuilder.setTimeInterval(i);
        newBuilder.setZIndex(i2);
        newBuilder.setAlpha((float) d);
        if (!TextUtils.isEmpty(str2)) {
            int G0 = mo182802G0(str2);
            if (G0 >= 0) {
                newBuilder.setLevel(G0);
            } else {
                newBuilder.setLevel(OverlayLevel.OverlayLevelAboveBuildings);
            }
        } else {
            newBuilder.setLevel(OverlayLevel.OverlayLevelAboveBuildings);
        }
        VisualLayer addVisualLayer = this.f352854h.getMap().addVisualLayer(newBuilder.build());
        if (addVisualLayer == null) {
            Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "addMapVisualLayer fail id:%s", str);
            return false;
        }
        C118044k0 k0Var = new C118044k0(str);
        addVisualLayer.addLayerStatusChangedListener(k0Var);
        this.f352847d1.put(str, addVisualLayer);
        this.f352851f1.put(str, k0Var);
        return true;
    }

    /* renamed from: q0 */
    public void mo182870q0(C118080q.C118101p pVar) {
        this.f352858o = pVar;
    }

    /* renamed from: r */
    public float mo182871r() {
        return this.f352854h.getMap().getCameraPosition().getSkew();
    }

    /* renamed from: r0 */
    public void mo182872r0() {
        C88024r.m109572b(new C118033f());
    }

    /* renamed from: s */
    public void mo182873s() {
        synchronized (this.f352837X) {
            Iterator<Polygon> it = this.f352837X.iterator();
            while (it.hasNext()) {
                it.next().remove();
            }
            this.f352837X.clear();
        }
    }

    /* renamed from: s0 */
    public boolean mo182874s0() {
        return this.f352808A;
    }

    public void setBuilding3dEffectEnable(boolean z) {
        this.f352854h.getMap().setBuilding3dEffectEnable(z);
    }

    public void setIndoorMaskColor(int i) {
        this.f352854h.getMap().setIndoorMaskColor(i);
    }

    public void setMapStyle(int i) {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s setMapStyle: %d", this, Integer.valueOf(i));
        this.f352854h.getMap().setMapStyle(i);
    }

    public void setMaxZoomLevel(int i) {
        this.f352854h.getMap().setMaxZoomLevel(i);
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map_scale setMaxZoomLevel:%d", Integer.valueOf(i));
    }

    public void setMinZoomLevel(int i) {
        this.f352854h.getMap().setMinZoomLevel(i);
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map_scale setMinZoomLevel:%d", Integer.valueOf(i));
    }

    public void setPoisEnabled(boolean z) {
        this.f352854h.getMap().setPoisEnabled(z);
    }

    /* renamed from: t */
    public boolean mo182881t(C118080q.C118085c cVar, C118080q.C118100o oVar, C91755a aVar) {
        Bitmap load;
        if (cVar == null || Util.isNullOrNil(cVar.f352997e) || (load = aVar.load(cVar.f352997e)) == null) {
            return false;
        }
        ImageView imageView = new ImageView(this.f352846d);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(load);
        int i = cVar.f352993a;
        int i2 = cVar.f352994b;
        int i3 = cVar.f352996d;
        if (i3 == 0) {
            i3 = C88020k.m109553d(load.getHeight());
        }
        int i4 = cVar.f352995c;
        if (i4 == 0) {
            i4 = C88020k.m109553d(load.getWidth());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i3);
        layoutParams.setMargins(i, i2, 0, 0);
        boolean z = cVar.f352998f;
        String str = cVar.f352999g;
        imageView.setOnTouchListener(new C118035g(this, z, imageView));
        imageView.setOnClickListener(new C118037h(this, z, oVar, str));
        C88024r.m109572b(new C118039i(imageView, layoutParams));
        return true;
    }

    /* renamed from: t0 */
    public void mo182882t0(boolean z) {
        Class cls = C88840a.class;
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s show location", this);
        this.f352839Y = z;
        if (z) {
            C118115s sVar = this.f352841Z;
            if (!(sVar == null || sVar.f353104e == null)) {
                Log.m105924i("MicroMsg.AppbrandMapLocationPoint", "resumeMapView");
                sVar.f353104e.setVisible(true);
            }
            ((C88840a) C89909e.m112436a(cls)).Cb0("gcj02", this.f352860p0, mo182794B0());
            C118117v.m166646e(this);
            return;
        }
        C118115s sVar2 = this.f352841Z;
        if (!(sVar2 == null || sVar2.f353104e == null)) {
            Log.m105924i("MicroMsg.AppbrandMapLocationPoint", "pauseMapView");
            sVar2.f353104e.setVisible(false);
        }
        ((C88840a) C89909e.m112436a(cls)).mo123225a6("gcj02", this.f352860p0, mo182794B0());
        C118117v.m166648g(this);
    }

    public String toString() {
        return "DefaultTencentMapView{mapId=" + this.f352848e + '}';
    }

    /* renamed from: u */
    public void mo182884u(String str, C118080q.C118108w wVar, C91755a aVar) {
        String str2;
        Collision[] collisionArr;
        String str3 = str;
        C118080q.C118108w wVar2 = wVar;
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s _addMarker markerId:%s", this, str3);
        if (this.f352824Q0.get()) {
            Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "map:%s _addMarker markerId:%s fail", this, str3);
            return;
        }
        if (wVar2.f353059b > 0) {
            String str4 = "" + wVar2.f353059b;
            if (this.f352844b1) {
                Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "cluster item use default style");
                return;
            }
            int i = wVar2.f353059b;
            if (i <= 0 || !this.f352834V0.contains(Integer.valueOf(i))) {
                Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "cluster marker not exist, don't add, must remove exist label");
                mo182810K0(str4);
                return;
            }
            mo182888x0(str4, wVar2, aVar);
            str2 = str4;
        } else {
            C91755a aVar2 = aVar;
            if (wVar2.f353058a) {
                double d = wVar2.f353060c;
                double d2 = wVar2.f353061d;
                if (this.f352854h.getMap() == null) {
                    Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "addMapMarkerCluster map is null");
                } else if (!mo182841f0()) {
                    Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "addMapMarkerCluster mClusterManager is not initialize");
                } else {
                    if (!this.f352832U0.contains(str3) || mo182800F0(str) == null) {
                        C118046l0 l0Var = new C118046l0(str3, new LatLng(d, d2));
                        synchronized (this.f352826R0) {
                            this.f352830T0.add(l0Var);
                            this.f352832U0.add(l0Var.f352914a);
                        }
                        this.f352870y.addItem(l0Var);
                        this.f352870y.cluster();
                        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "addMapMarkerCluster mClusterItems:%d， id:%s， latitude:%f, longitude:%f", Integer.valueOf(this.f352830T0.size()), str3, Double.valueOf(l0Var.f352915b.getLatitude()), Double.valueOf(l0Var.f352915b.getLongitude()));
                    } else {
                        Log.m105924i("MicroMsg.Map.DefaultTencentMapView", "cluster item is added!");
                    }
                }
                mo182888x0(str, wVar, aVar);
            }
            str2 = str3;
        }
        C118051m0 m0Var = (C118051m0) ((ConcurrentHashMap) this.f352833V).get(str2);
        if (m0Var == null) {
            m0Var = new C118051m0();
        }
        C118051m0 m0Var2 = m0Var;
        m0Var2.f353056a = wVar2.f353065h;
        m0Var2.f353057b = wVar2;
        mo182892z0(str2, m0Var2);
        if (!wVar2.f353058a && !TextUtils.isEmpty(str)) {
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.position(new LatLng(wVar2.f353060c, wVar2.f353061d));
            if (!Util.isNullOrNil((String) null)) {
                markerOptions.title((String) null);
            }
            if (!Util.isNullOrNil(wVar2.f353073p)) {
                markerOptions.contentDescription(wVar2.f353073p);
            }
            markerOptions.rotation(wVar2.f353063f);
            markerOptions.alpha(wVar2.f353064g);
            FrameLayout frameLayout = (FrameLayout) ((LayoutInflater) this.f352846d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f7121yx, (ViewGroup) null);
            mo182814M0(str2, wVar, (Marker) null, aVar, (ImageView) frameLayout.findViewById(C0966R.C0970id.goi), frameLayout, true);
            markerOptions.markerView(frameLayout);
            markerOptions.anchor(wVar2.f353068k, wVar2.f353069l);
            markerOptions.tag(str2);
            markerOptions.infoWindowHideAnimation(new C118043k(this));
            markerOptions.infoWindowShowAnimation(new C118045l(this));
            markerOptions.visible(true);
            markerOptions.zIndex(wVar2.f353070m + 2);
            markerOptions.level(OverlayLevel.OverlayLevelAboveLabels);
            if (!Util.isNullOrNil(wVar2.f353071n) && !Util.isNullOrNil(wVar2.f353072o)) {
                markerOptions.indoorInfo(new IndoorInfo(wVar2.f353071n, wVar2.f353072o));
            }
            C118080q.C118108w.C118109a aVar3 = wVar2.f353075r;
            if (aVar3 != null) {
                markerOptions.infoWindowOffset(aVar3.f353087k, aVar3.f353088l);
            }
            if (TextUtils.isEmpty(wVar2.f353074q) || !wVar2.f353074q.equals("withLabel")) {
                collisionArr = null;
                markerOptions.setCollisions((MarkerCollisionItem[]) null);
            } else {
                markerOptions.setCollisions(MarkerCollisionItem.POI);
                collisionArr = null;
            }
            Marker addMarker = this.f352854h.getMap().addMarker(markerOptions);
            m0Var2.f352933c = addMarker;
            if (TextUtils.isEmpty(wVar2.f353074q) || !wVar2.f353074q.equals("withLabel")) {
                addMarker.setCollisions(collisionArr);
            } else {
                addMarker.setCollisions(MarkerCollisionItem.POI);
            }
            addMarker.getZIndex();
            C118080q.C118108w.C118109a aVar4 = wVar2.f353075r;
            if (aVar4 != null && aVar4.f353085i == 1) {
                mo182818O0(m0Var2.f352933c);
            }
        }
        if ((!wVar2.f353058a || wVar2.f353059b != -1) && wVar2.f353076s != null) {
            mo182890y0(str2, wVar2, m0Var2);
        }
    }

    /* renamed from: v */
    public void mo182885v(String str, C118080q.C118108w wVar, C91755a aVar) {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s updateMarker markerId:%s", this, str);
        C118051m0 H0 = mo182804H0(str);
        if (H0 != null) {
            C118080q.C118108w.C118109a aVar2 = wVar.f353075r;
            if (aVar2 != null) {
                if (aVar2.f353089m != null) {
                    H0.f353057b.f353075r = aVar2;
                    Marker marker = H0.f352933c;
                    if (marker != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            C118080q.C118108w.C118109a aVar3 = wVar.f353075r;
                            marker.setInfoWindowOffset(aVar3.f353087k, aVar3.f353088l);
                        } else {
                            MMHandlerThread.postToMainThread(new C118070h(this, marker, wVar));
                        }
                    }
                    Marker marker2 = H0.f352933c;
                    if (marker2 != null && wVar.f353075r.f353085i == 1) {
                        mo182818O0(marker2);
                    } else if (marker2 != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            H0.f352933c.refreshInfoWindow();
                        } else {
                            MMHandlerThread.postToMainThread(new C118069g(this, H0));
                        }
                    }
                } else {
                    synchronized (this.f352810C) {
                        H0.f352935e = null;
                    }
                }
            }
            if (wVar.f353076s != null) {
                H0.f352934d.remove();
                mo182851i(str + "#label");
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(new LatLng(wVar.f353060c, wVar.f353061d));
                C111053d a = C110233x.m149843a();
                if (a == null) {
                    a = new C111053d(this.f352846d);
                }
                a.mo162733a();
                a.setTextColor(wVar.f353076s.f353091b);
                a.setTextSize(wVar.f353076s.f353092c);
                a.setText(wVar.f353076s.f353090a);
                a.setTextPadding(wVar.f353076s.f353100k);
                a.setGravity(wVar.f353076s.f353099j);
                C118080q.C118108w.C118110b bVar = wVar.f353076s;
                a.mo162734b(bVar.f353096g, bVar.f353097h, bVar.f353098i, bVar.f353095f);
                a.setX(wVar.f353076s.f353093d);
                a.setY(wVar.f353076s.f353094e);
                C118080q.C118108w.C118110b bVar2 = wVar.f353076s;
                int i = bVar2.f353102m;
                int i2 = bVar2.f353101l;
                if (i > -1 && i2 > -1) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.f332559d.getLayoutParams();
                    layoutParams.width = i;
                    layoutParams.height = i2;
                    a.f332559d.setLayoutParams(layoutParams);
                    a.invalidate();
                }
                a.measure(0, 0);
                markerOptions.anchor(a.getAnchorX(), a.getAnchorY());
                markerOptions.markerView(a);
                markerOptions.visible(true);
                markerOptions.tag(str + "#label");
                markerOptions.zIndex(wVar.f353070m + 3);
                markerOptions.level(OverlayLevel.OverlayLevelAboveLabels);
                if (!Util.isNullOrNil(wVar.f353071n) && !Util.isNullOrNil(wVar.f353072o)) {
                    markerOptions.indoorInfo(new IndoorInfo(wVar.f353071n, wVar.f353072o));
                }
                H0.f352934d = this.f352854h.getMap().addMarker(markerOptions);
                mo182892z0(str + "#label", H0);
            }
        }
    }

    /* renamed from: w */
    public void mo182886w(C118080q.C118095l lVar, C91755a aVar) {
        String str;
        PolylineOptions polylineOptions = new PolylineOptions();
        ArrayList arrayList = new ArrayList();
        for (C118080q.C118093j next : lVar.f353027b) {
            arrayList.add(new LatLng(next.f353022a, next.f353023b));
        }
        polylineOptions.addAll(arrayList);
        List<Integer> list = lVar.f353040o;
        if (list == null || list.size() <= 0) {
            int i = lVar.f353038m;
            if (i != -1) {
                polylineOptions.color(i);
            } else {
                polylineOptions.color(lVar.f353028c);
            }
        } else {
            Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "colorList size:%d ", Integer.valueOf(lVar.f353040o.size()));
            int size = lVar.f353040o.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = lVar.f353040o.get(i2).intValue();
                iArr2[i2] = i2;
            }
            polylineOptions.colors(iArr, iArr2);
        }
        polylineOptions.setEnableGradient(lVar.f353042q);
        polylineOptions.width((float) lVar.f353029d);
        polylineOptions.setDottedLine(lVar.f353030e);
        polylineOptions.edgeColor(lVar.f353031f);
        polylineOptions.edgeWidth((float) lVar.f353032g);
        if (lVar.f353033h) {
            if (!TextUtils.isEmpty(lVar.f353035j)) {
                Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "reviseArrowIconPath:%s", lVar.f353035j);
                Bitmap load = aVar.load(lVar.f353035j);
                polylineOptions.reviseArrowTexture(new BitmapDescriptor(load));
                if (load == null) {
                    polylineOptions.reviseArrowTexture(new BitmapDescriptor(BitmapFactory.decodeResource(this.f352846d.getResources(), C0966R.C0969drawable.cgp)));
                }
            } else {
                Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "arrowIconPath:%s", lVar.f353034i);
                Bitmap load2 = aVar.load(lVar.f353034i);
                polylineOptions.arrowTexture(new BitmapDescriptor(load2));
                if (load2 == null) {
                    polylineOptions.arrowTexture(new BitmapDescriptor(BitmapFactory.decodeResource(this.f352846d.getResources(), C0966R.C0969drawable.bu8)));
                }
            }
        }
        polylineOptions.zIndex(1.0f);
        if (!Util.isNullOrNil(lVar.f353036k) && !Util.isNullOrNil(lVar.f353037l)) {
            polylineOptions.indoorInfo(new IndoorInfo(lVar.f353036k, lVar.f353037l));
        }
        polylineOptions.arrowGap((float) lVar.f353039n);
        int G0 = mo182802G0(lVar.f353041p);
        if (G0 >= 0) {
            polylineOptions.level(G0);
        } else {
            polylineOptions.level(OverlayLevel.OverlayLevelAboveRoads);
        }
        polylineOptions.lineCap(true);
        polylineOptions.setTextStyle(lVar.f353043r);
        polylineOptions.setSegmentTexts(lVar.f353044s);
        Polyline addPolyline = this.f352854h.getMap().addPolyline(polylineOptions);
        if (addPolyline == null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "polyline is null, return");
            return;
        }
        if (Util.isNullOrNil(lVar.f353026a)) {
            str = lVar.hashCode() + "";
        } else {
            str = lVar.f353026a;
        }
        ((ConcurrentHashMap) this.f352829T).put(Util.nullAs(str, lVar.toString()), addPolyline);
    }

    /* renamed from: x */
    public void mo182887x(boolean z) {
        this.f352854h.getMap().showBuilding(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo182888x0(java.lang.String r21, pl0.C118080q.C118108w r22, zi0.C91755a r23) {
        /*
            r20 = this;
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            int r0 = r11.f353059b
            r13 = 0
            if (r0 <= 0) goto L_0x0038
            java.util.ArrayList<java.lang.Integer> r1 = r9.f352834V0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0038
            java.util.HashMap<java.lang.Integer, com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster<pl0.a$l0>> r0 = r9.f352838X0
            int r1 = r11.f353059b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster r0 = (com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster) r0
            if (r0 == 0) goto L_0x0036
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager<pl0.a$l0> r1 = r9.f352870y
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer r1 = r1.getRenderer()
            pl0.a$j0 r1 = (pl0.C118022a.C118042j0) r1
            com.tencent.mapsdk.raster.model.Marker r0 = r1.getMarker(r0)
            goto L_0x005b
        L_0x0036:
            r0 = r13
            goto L_0x005b
        L_0x0038:
            boolean r0 = r11.f353058a
            if (r0 == 0) goto L_0x005d
            pl0.a$l0 r0 = r20.mo182800F0(r21)
            if (r0 == 0) goto L_0x004f
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager<pl0.a$l0> r1 = r9.f352870y
            com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view.ClusterRenderer r1 = r1.getRenderer()
            pl0.a$j0 r1 = (pl0.C118022a.C118042j0) r1
            com.tencent.mapsdk.raster.model.Marker r0 = r1.getMarker(r0)
            goto L_0x0050
        L_0x004f:
            r0 = r13
        L_0x0050:
            java.util.HashMap<java.lang.String, pl0.q$w> r1 = r9.f352840Y0
            r1.put(r10, r11)
            zi0.a r1 = r9.f352842Z0
            if (r1 != 0) goto L_0x005b
            r9.f352842Z0 = r12
        L_0x005b:
            r14 = r0
            goto L_0x005e
        L_0x005d:
            r14 = r13
        L_0x005e:
            if (r14 == 0) goto L_0x0166
            boolean r0 = r11.f353058a
            if (r0 == 0) goto L_0x0070
            com.tencent.mapsdk.raster.model.LatLng r0 = new com.tencent.mapsdk.raster.model.LatLng
            double r1 = r11.f353060c
            double r3 = r11.f353061d
            r0.<init>(r1, r3)
            r14.setPosition(r0)
        L_0x0070:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 != 0) goto L_0x0079
            r14.setTitle(r13)
        L_0x0079:
            java.lang.String r0 = r11.f353073p
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = r11.f353073p
            r14.setContentDescription(r0)
        L_0x0086:
            float r0 = r11.f353063f
            r14.setRotation(r0)
            float r0 = r11.f353064g
            r14.setAlpha(r0)
            android.content.Context r0 = r9.f352846d
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1 = 2131494028(0x7f0c048c, float:1.8611553E38)
            android.view.View r0 = r0.inflate(r1, r13)
            r15 = r0
            android.widget.FrameLayout r15 = (android.widget.FrameLayout) r15
            r0 = 2131309001(0x7f0931c9, float:1.8236273E38)
            android.view.View r0 = r15.findViewById(r0)
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            boolean r7 = r11.f353058a
            float r6 = r11.f353066i
            float r5 = r11.f353067j
            if (r12 == 0) goto L_0x00e5
            java.lang.String r0 = r11.f353062e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00e5
            if (r8 == 0) goto L_0x00c3
            r8.setImageBitmap(r13)
        L_0x00c3:
            java.lang.String r4 = r11.f353062e
            pl0.c r3 = new pl0.c
            r0 = r3
            r1 = r20
            r2 = r6
            r11 = r3
            r3 = r5
            r10 = r4
            r4 = r8
            r16 = r5
            r5 = r21
            r17 = r6
            r6 = r14
            r18 = r7
            r7 = r15
            r19 = r8
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Bitmap r0 = r12.mo124759Rb(r10, r13, r11)
            goto L_0x00fb
        L_0x00e5:
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r0 = r20
            r1 = r21
            r2 = r14
            r3 = r19
            r4 = r15
            r5 = r18
            r0.mo182812L0(r1, r2, r3, r4, r5)
            r0 = r13
        L_0x00fb:
            if (r0 == 0) goto L_0x010c
            r3 = r16
            r2 = r17
            r1 = r19
            r9.mo182792A0(r2, r3, r0, r1)
            r0 = r21
            r9.mo182816N0(r0, r14, r15)
            goto L_0x0115
        L_0x010c:
            r0 = r21
            java.lang.String r1 = "MicroMsg.Map.DefaultTencentMapView"
            java.lang.String r2 = "[addMarker] bitmap is null, use default"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
        L_0x0115:
            r14.setMarkerView(r15)
            r1 = r22
            float r2 = r1.f353068k
            float r3 = r1.f353069l
            r14.setAnchor(r2, r3)
            r14.setTag(r0)
            pl0.a$n r0 = new pl0.a$n
            r0.<init>(r9)
            r14.setInfoWindowHideAnimation(r0)
            pl0.a$o r0 = new pl0.a$o
            r0.<init>(r9)
            r14.setInfoWindowShowAnimation(r0)
            r0 = 1
            r14.setVisible(r0)
            int r2 = r1.f353070m
            int r2 = r2 + 2
            float r2 = (float) r2
            r14.setZIndex(r2)
            int r2 = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels
            r14.setLevel(r2)
            java.lang.String r2 = r1.f353074q
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0163
            java.lang.String r1 = r1.f353074q
            java.lang.String r2 = "withLabel"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0163
            com.tencent.tencentmap.mapsdk.maps.interfaces.Collision[] r0 = new com.tencent.tencentmap.mapsdk.maps.interfaces.Collision[r0]
            r1 = 0
            com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem r2 = com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem.POI
            r0[r1] = r2
            r14.setCollisions(r0)
            goto L_0x0166
        L_0x0163:
            r14.setCollisions(r13)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl0.C118022a.mo182888x0(java.lang.String, pl0.q$w, zi0.a):void");
    }

    /* renamed from: y */
    public void mo182889y(C118080q.C118099n nVar) {
        this.f352813F = nVar;
    }

    /* renamed from: y0 */
    public final void mo182890y0(String str, C118080q.C118108w wVar, C118051m0 m0Var) {
        if (mo182804H0(str + "#label") != null) {
            Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "addLabelMarker label is exist, label id:%s", str + "#label");
        } else if (wVar == null || wVar.f353076s == null) {
            Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "addLabelMarker labelStyle is null, label id:%s", str + "#label");
        } else {
            int i = wVar.f353059b;
            if (i <= 0 || this.f352834V0.contains(Integer.valueOf(i))) {
                Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "addLabelMarker label id:%s, content:%s", str + "#label", wVar.f353076s.f353090a);
                MarkerOptions markerOptions = new MarkerOptions();
                markerOptions.position(new LatLng(wVar.f353060c, wVar.f353061d));
                C111053d a = C110233x.m149843a();
                if (a == null) {
                    a = new C111053d(this.f352846d);
                }
                a.mo162733a();
                a.setTextColor(wVar.f353076s.f353091b);
                a.setTextSize(wVar.f353076s.f353092c);
                a.setText(wVar.f353076s.f353090a);
                a.setTextPadding(wVar.f353076s.f353100k);
                a.setGravity(wVar.f353076s.f353099j);
                C118080q.C118108w.C118110b bVar = wVar.f353076s;
                a.mo162734b(bVar.f353096g, bVar.f353097h, bVar.f353098i, bVar.f353095f);
                a.setX(wVar.f353076s.f353093d);
                a.setY(wVar.f353076s.f353094e);
                C118080q.C118108w.C118110b bVar2 = wVar.f353076s;
                int i2 = bVar2.f353102m;
                int i3 = bVar2.f353101l;
                if (i2 > -1 && i3 > -1) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a.f332559d.getLayoutParams();
                    layoutParams.width = i2;
                    layoutParams.height = i3;
                    a.f332559d.setLayoutParams(layoutParams);
                    a.invalidate();
                }
                a.measure(0, 0);
                markerOptions.anchor(a.getAnchorX(), a.getAnchorY());
                markerOptions.markerView(a);
                markerOptions.visible(true);
                markerOptions.tag(str + "#label");
                markerOptions.zIndex(wVar.f353070m + 3);
                markerOptions.level(OverlayLevel.OverlayLevelAboveLabels);
                if (!Util.isNullOrNil(wVar.f353071n) && !Util.isNullOrNil(wVar.f353072o)) {
                    markerOptions.indoorInfo(new IndoorInfo(wVar.f353071n, wVar.f353072o));
                }
                Marker addMarker = this.f352854h.getMap().addMarker(markerOptions);
                if (m0Var == null) {
                    m0Var = new C118051m0();
                    m0Var.f353057b = wVar;
                    m0Var.f352934d = addMarker;
                } else {
                    m0Var.f352934d = addMarker;
                }
                m0Var.f353056a = wVar.f353065h;
                mo182892z0(str + "#label", m0Var);
                return;
            }
            Log.m105921e("MicroMsg.Map.DefaultTencentMapView", "addLabelMarker marker is not exist, don't add, label id:%s", str + "#label");
        }
    }

    /* renamed from: z */
    public void mo182891z(String str, LinkedList<C118080q.C118092i> linkedList, C118080q.C118104s sVar) {
        C118051m0 H0 = mo182804H0(str);
        if (H0 == null || H0.f352933c == null) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "get marker failed!");
            if (sVar != null) {
                sVar.mo182583a(false);
            }
        } else if (linkedList == null || linkedList.size() <= 0) {
            Log.m105920e("MicroMsg.Map.DefaultTencentMapView", "keyFrame is empty, err, return");
            if (sVar != null) {
                sVar.mo182583a(false);
            }
        } else {
            C118080q.C118092i iVar = linkedList.get(0);
            iVar.f353017b = H0.f352933c.getPosition().getLatitude();
            iVar.f353016a = H0.f352933c.getPosition().getLongitude();
            int size = linkedList.size();
            for (int i = 1; i < size; i++) {
                C118080q.C118092i iVar2 = linkedList.get(i - 1);
                C118080q.C118092i iVar3 = linkedList.get(i);
                if (iVar2.f353020e == 0.0f) {
                    iVar3.f353016a = iVar2.f353018c;
                    iVar3.f353017b = iVar2.f353019d;
                } else {
                    iVar3.f353016a = H0.f352933c.getPosition().getLongitude();
                    iVar3.f353017b = H0.f352933c.getPosition().getLatitude();
                }
            }
            C118513c cVar = new C118513c(linkedList, H0.f352933c, this.f352854h);
            cVar.f354686d.addListener(new C118055q(this, sVar));
            C88024r.m109572b(new C118056r(this, cVar));
            Marker marker = H0.f352934d;
            if (marker != null) {
                C88024r.m109572b(new C118057s(this, new C118513c(linkedList, marker, this.f352854h)));
            }
        }
    }

    /* renamed from: z0 */
    public void mo182892z0(String str, C118051m0 m0Var) {
        Log.m105925i("MicroMsg.Map.DefaultTencentMapView", "map:%s addMarker markerId:%s", this, str);
        ((ConcurrentHashMap) this.f352833V).put(str, m0Var);
    }
}
