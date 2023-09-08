package yw3;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.sdk.comps.vis.VisualLayerOptions;
import com.tencent.mapsdk.raster.model.CameraPosition;
import com.tencent.mapsdk.raster.model.Circle;
import com.tencent.mapsdk.raster.model.CircleOptions;
import com.tencent.mapsdk.raster.model.CustomLayer;
import com.tencent.mapsdk.raster.model.CustomLayerOptions;
import com.tencent.mapsdk.raster.model.IndoorMapPoi;
import com.tencent.mapsdk.raster.model.Language;
import com.tencent.mapsdk.raster.model.Polygon;
import com.tencent.mapsdk.raster.model.PolygonOptions;
import com.tencent.mapsdk.raster.model.TileOverlay;
import com.tencent.mapsdk.raster.model.TileOverlayOptions;
import com.tencent.mapsdk.raster.model.UrlTileProvider;
import com.tencent.tencentmap.mapsdk.map.CameraUpdate;
import com.tencent.tencentmap.mapsdk.map.CancelableCallback;
import com.tencent.tencentmap.mapsdk.map.Projection;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.CameraUpdateFactory;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.Arc;
import com.tencent.tencentmap.mapsdk.maps.model.ArcOptions;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import com.tencent.tencentmap.mapsdk.maps.model.MapPoi;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.RestrictBoundsFitMode;
import com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import yw3.C119023n;

/* renamed from: yw3.i */
public class C119009i implements TencentMap, TencentMap.InfoWindowAdapter, TencentMap.OnMarkerDragListener, TencentMap.OnMapLoadedCallback, TencentMap.OnInfoWindowClickListener, TencentMap.OnMarkerClickListener, TencentMap.OnCameraChangeListener, TencentMap.OnMapClickListener, TencentMap.OnMapLongClickListener {

    /* renamed from: A */
    public List<TencentMap.OnMapLongClickListener> f356451A;

    /* renamed from: d */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap f356452d;

    /* renamed from: e */
    public HashMap<Integer, C119005e> f356453e = new HashMap<>();

    /* renamed from: f */
    public List<Marker> f356454f = new ArrayList();

    /* renamed from: g */
    public boolean f356455g = false;

    /* renamed from: h */
    public TencentMapGestureListener f356456h;

    /* renamed from: i */
    public TencentMap.InfoWindowAdapter f356457i;

    /* renamed from: j */
    public List<TencentMap.InfoWindowAdapter> f356458j;

    /* renamed from: n */
    public TencentMap.OnMarkerDraggedListener f356459n;

    /* renamed from: o */
    public List<TencentMap.OnMarkerDraggedListener> f356460o;

    /* renamed from: p */
    public TencentMap.OnMapLoadedListener f356461p;

    /* renamed from: q */
    public List<TencentMap.OnMapLoadedListener> f356462q;

    /* renamed from: r */
    public TencentMap.OnInfoWindowClickListener f356463r;

    /* renamed from: s */
    public List<TencentMap.OnInfoWindowClickListener> f356464s;

    /* renamed from: t */
    public TencentMap.OnMarkerClickListener f356465t;

    /* renamed from: u */
    public List<TencentMap.OnMarkerClickListener> f356466u;

    /* renamed from: v */
    public TencentMap.OnMapCameraChangeListener f356467v;

    /* renamed from: w */
    public List<TencentMap.OnMapCameraChangeListener> f356468w;

    /* renamed from: x */
    public TencentMap.OnMapClickListener f356469x;

    /* renamed from: y */
    public List<TencentMap.OnMapClickListener> f356470y;

    /* renamed from: z */
    public TencentMap.OnMapLongClickListener f356471z;

    /* renamed from: yw3.i$a */
    public class C119010a implements TencentMap.CancelableCallback {

        /* renamed from: a */
        public final /* synthetic */ Runnable f356472a;

        public C119010a(C119009i iVar, Runnable runnable) {
            this.f356472a = runnable;
        }

        public void onCancel() {
            Runnable runnable = this.f356472a;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void onFinish() {
            Runnable runnable = this.f356472a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: yw3.i$b */
    public class C119011b implements TencentMap.CancelableCallback {

        /* renamed from: a */
        public final /* synthetic */ CancelableCallback f356473a;

        public C119011b(C119009i iVar, CancelableCallback cancelableCallback) {
            this.f356473a = cancelableCallback;
        }

        public void onCancel() {
            this.f356473a.onCancel();
        }

        public void onFinish() {
            CancelableCallback cancelableCallback = this.f356473a;
            if (cancelableCallback != null) {
                cancelableCallback.onFinish();
            }
        }
    }

    /* renamed from: yw3.i$c */
    public class C119012c implements TencentMap.CancelableCallback {

        /* renamed from: a */
        public final /* synthetic */ CancelableCallback f356474a;

        public C119012c(C119009i iVar, CancelableCallback cancelableCallback) {
            this.f356474a = cancelableCallback;
        }

        public void onCancel() {
            CancelableCallback cancelableCallback = this.f356474a;
            if (cancelableCallback != null) {
                cancelableCallback.onCancel();
            }
        }

        public void onFinish() {
            CancelableCallback cancelableCallback = this.f356474a;
            if (cancelableCallback != null) {
                cancelableCallback.onFinish();
            }
        }
    }

    /* renamed from: yw3.i$d */
    public class C119013d implements TencentMap.CancelableCallback {

        /* renamed from: a */
        public final /* synthetic */ CancelableCallback f356475a;

        public C119013d(C119009i iVar, CancelableCallback cancelableCallback) {
            this.f356475a = cancelableCallback;
        }

        public void onCancel() {
            CancelableCallback cancelableCallback = this.f356475a;
            if (cancelableCallback != null) {
                cancelableCallback.onCancel();
            }
        }

        public void onFinish() {
            CancelableCallback cancelableCallback = this.f356475a;
            if (cancelableCallback != null) {
                cancelableCallback.onFinish();
            }
        }
    }

    /* renamed from: yw3.i$e */
    public class C119014e implements TencentMap.OnMapPoiClickListener {

        /* renamed from: a */
        public final /* synthetic */ TencentMap.OnMapPoiClickListener f356476a;

        public C119014e(C119009i iVar, TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
            this.f356476a = onMapPoiClickListener;
        }

        public void onClicked(MapPoi mapPoi) {
            IndoorMapPoi indoorMapPoi;
            TencentMap.OnMapPoiClickListener onMapPoiClickListener = this.f356476a;
            if (onMapPoiClickListener != null) {
                if (mapPoi == null) {
                    indoorMapPoi = null;
                } else if (mapPoi instanceof com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi) {
                    com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi indoorMapPoi2 = (com.tencent.tencentmap.mapsdk.maps.model.IndoorMapPoi) mapPoi;
                    indoorMapPoi = new IndoorMapPoi(indoorMapPoi2.getName(), C119023n.m167767a(indoorMapPoi2.getPosition()), indoorMapPoi2.getBuildingId(), indoorMapPoi2.getBuildingName(), indoorMapPoi2.getFloorName());
                } else {
                    indoorMapPoi = new com.tencent.mapsdk.raster.model.MapPoi(mapPoi.getName(), C119023n.m167767a(mapPoi.getPosition()));
                }
                onMapPoiClickListener.onClicked(indoorMapPoi);
            }
        }
    }

    /* renamed from: yw3.i$f */
    public class C119015f implements TencentMap.OnIndoorStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ TencentMap.OnIndoorStateChangeListener f356477d;

        public C119015f(C119009i iVar, TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
            this.f356477d = onIndoorStateChangeListener;
        }

        public boolean onIndoorBuildingDeactivated() {
            TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f356477d;
            if (onIndoorStateChangeListener == null) {
                return false;
            }
            return onIndoorStateChangeListener.onIndoorBuildingDeactivated();
        }

        public boolean onIndoorBuildingFocused() {
            TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f356477d;
            if (onIndoorStateChangeListener == null) {
                return false;
            }
            return onIndoorStateChangeListener.onIndoorBuildingFocused();
        }

        public boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
            ArrayList arrayList;
            TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f356477d;
            if (onIndoorStateChangeListener == null) {
                return false;
            }
            com.tencent.mapsdk.raster.model.IndoorBuilding indoorBuilding2 = null;
            if (indoorBuilding != null) {
                List<IndoorLevel> levels = indoorBuilding.getLevels();
                if (levels != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(levels);
                    arrayList = new ArrayList();
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        IndoorLevel indoorLevel = (IndoorLevel) it.next();
                        if (indoorLevel == null) {
                            break;
                        }
                        arrayList.add(new com.tencent.mapsdk.raster.model.IndoorLevel(indoorLevel.getName()));
                    }
                }
                arrayList = null;
                if (arrayList != null) {
                    indoorBuilding2 = new com.tencent.mapsdk.raster.model.IndoorBuilding(indoorBuilding.getBuidlingId(), indoorBuilding.getBuildingName(), arrayList, indoorBuilding.getActiveLevelIndex());
                }
            }
            return onIndoorStateChangeListener.onIndoorLevelActivated(indoorBuilding2);
        }
    }

    /* renamed from: yw3.i$g */
    public class C119016g implements TencentMapGestureListener {

        /* renamed from: a */
        public final /* synthetic */ TencentMap.TencentMapGestureListener f356478a;

        public C119016g(C119009i iVar, TencentMap.TencentMapGestureListener tencentMapGestureListener) {
            this.f356478a = tencentMapGestureListener;
        }

        public boolean onDoubleTap(float f, float f2) {
            TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f356478a;
            if (tencentMapGestureListener == null) {
                return false;
            }
            return tencentMapGestureListener.onDoubleTap(f, f2);
        }

        public boolean onDown(float f, float f2) {
            TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f356478a;
            if (tencentMapGestureListener == null) {
                return false;
            }
            return tencentMapGestureListener.onDown(f, f2);
        }

        public boolean onFling(float f, float f2) {
            TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f356478a;
            if (tencentMapGestureListener == null) {
                return false;
            }
            return tencentMapGestureListener.onFling(f, f2);
        }

        public boolean onLongPress(float f, float f2) {
            TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f356478a;
            if (tencentMapGestureListener == null) {
                return false;
            }
            return tencentMapGestureListener.onLongPress(f, f2);
        }

        public void onMapStable() {
            TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f356478a;
            if (tencentMapGestureListener != null) {
                tencentMapGestureListener.onMapStable();
            }
        }

        public boolean onScroll(float f, float f2) {
            TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f356478a;
            if (tencentMapGestureListener == null) {
                return false;
            }
            return tencentMapGestureListener.onScroll(f, f2);
        }

        public boolean onSingleTap(float f, float f2) {
            TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f356478a;
            if (tencentMapGestureListener == null) {
                return false;
            }
            return tencentMapGestureListener.onSingleTap(f, f2);
        }

        public boolean onUp(float f, float f2) {
            TencentMap.TencentMapGestureListener tencentMapGestureListener = this.f356478a;
            if (tencentMapGestureListener == null) {
                return false;
            }
            return tencentMapGestureListener.onUp(f, f2);
        }
    }

    /* renamed from: yw3.i$h */
    public class C119017h implements TencentMap.SnapshotReadyCallback {

        /* renamed from: a */
        public final /* synthetic */ TencentMap.OnScreenShotListener f356479a;

        public C119017h(C119009i iVar, TencentMap.OnScreenShotListener onScreenShotListener) {
            this.f356479a = onScreenShotListener;
        }

        public void onSnapshotReady(Bitmap bitmap) {
            TencentMap.OnScreenShotListener onScreenShotListener = this.f356479a;
            if (onScreenShotListener != null) {
                onScreenShotListener.onMapScreenShot(bitmap);
            }
        }
    }

    /* renamed from: yw3.i$i */
    public class C119018i implements TencentMap.SnapshotReadyCallback {

        /* renamed from: a */
        public final /* synthetic */ TencentMap.OnScreenShotListener f356480a;

        public C119018i(C119009i iVar, TencentMap.OnScreenShotListener onScreenShotListener) {
            this.f356480a = onScreenShotListener;
        }

        public void onSnapshotReady(Bitmap bitmap) {
            TencentMap.OnScreenShotListener onScreenShotListener = this.f356480a;
            if (onScreenShotListener != null) {
                onScreenShotListener.onMapScreenShot(bitmap);
            }
        }
    }

    public C119009i(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap) {
        this.f356452d = tencentMap;
        tencentMap.setInfoWindowAdapter(this);
        this.f356452d.setOnMarkerDragListener(this);
        this.f356452d.setOnMapLoadedCallback(this);
        this.f356452d.setOnInfoWindowClickListener(this);
        this.f356452d.setOnMarkerClickListener(this);
        this.f356452d.setOnCameraChangeListener(this);
        this.f356452d.setOnMapClickListener(this);
        this.f356452d.setOnMapLongClickListener(this);
    }

    /* renamed from: a */
    public final C119005e mo183687a(Marker marker) {
        if (marker == null) {
            return null;
        }
        return this.f356453e.get(Integer.valueOf(marker.getId().hashCode()));
    }

    public Arc addArc(ArcOptions arcOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null || arcOptions == null) {
            return null;
        }
        return tencentMap.addArc(arcOptions);
    }

    public Circle addCircle(CircleOptions circleOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null || circleOptions == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.CircleOptions circleOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.CircleOptions();
        LatLng f = C119023n.m167772f(circleOptions.getCenter());
        if (f != null) {
            circleOptions2.center(f);
        }
        circleOptions2.center(C119023n.m167772f(circleOptions.getCenter())).fillColor(circleOptions.getFillColor()).radius(circleOptions.getRadius()).strokeColor(circleOptions.getStrokeColor()).strokeWidth(circleOptions.getStrokeWidth()).visible(circleOptions.isVisible()).zIndex((int) circleOptions.getZIndex()).level(circleOptions.getLevel());
        return new C119002b(tencentMap.addCircle(circleOptions2));
    }

    public CustomLayer addCustomLayer(CustomLayerOptions customLayerOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions2 = null;
        if (tencentMap == null) {
            return null;
        }
        if (customLayerOptions != null) {
            customLayerOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions().layerId(customLayerOptions.getLayerId());
        }
        return new C119003c(tencentMap.addCustomLayer(customLayerOptions2));
    }

    public GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null || groundOverlayOptions == null) {
            return null;
        }
        return tencentMap.addGroundOverlay(groundOverlayOptions);
    }

    public void addInfoWindowAdapter(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        if (infoWindowAdapter != null) {
            if (this.f356458j == null) {
                this.f356458j = new LinkedList();
            }
            this.f356458j.add(infoWindowAdapter);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.mapsdk.raster.model.Marker addMarker(com.tencent.mapsdk.raster.model.MarkerOptions r8) {
        /*
            r7 = this;
            com.tencent.tencentmap.mapsdk.maps.TencentMap r0 = r7.f356452d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            if (r8 != 0) goto L_0x0009
            return r1
        L_0x0009:
            yw3.e r2 = new yw3.e
            com.tencent.mapsdk.raster.model.LatLng r3 = r8.getPosition()
            com.tencent.tencentmap.mapsdk.maps.model.LatLng r3 = yw3.C119023n.m167772f(r3)
            if (r3 != 0) goto L_0x0017
            goto L_0x00f8
        L_0x0017:
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r4 = new com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions
            r4.<init>(r3)
            float r3 = r8.getAlpha()
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r3 = r4.alpha(r3)
            boolean r5 = r8.isVisible()
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r3 = r3.visible(r5)
            boolean r5 = r8.isDraggable()
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r3 = r3.draggable(r5)
            float r5 = r8.getAnchorU()
            float r6 = r8.getAnchorV()
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r3 = r3.anchor(r5, r6)
            float r5 = r8.getRotation()
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r3 = r3.rotation(r5)
            com.tencent.mapsdk.raster.model.IndoorInfo r5 = r8.getIndoorInfo()
            if (r5 != 0) goto L_0x004f
            goto L_0x005c
        L_0x004f:
            com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo r1 = new com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo
            java.lang.String r6 = r5.getBuildingId()
            java.lang.String r5 = r5.getFloorName()
            r1.<init>(r6, r5)
        L_0x005c:
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r1 = r3.indoorInfo(r1)
            int r3 = r8.getZIndex()
            float r3 = (float) r3
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r1 = r1.zIndex(r3)
            int r3 = r8.getLevel()
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r1 = r1.level(r3)
            boolean r3 = r8.isFlat()
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r1 = r1.flat(r3)
            boolean r3 = r8.isFlat()
            boolean r5 = r8.isClockwise()
            if (r3 == r5) goto L_0x0085
            r3 = 1
            goto L_0x0086
        L_0x0085:
            r3 = 0
        L_0x0086:
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r1 = r1.clockwise(r3)
            int r3 = r8.getInfoWindowOffsetX()
            int r5 = r8.getInfowindowOffsetY()
            com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions r1 = r1.infoWindowOffset(r3, r5)
            java.lang.String r3 = r8.getContentDescription()
            r1.contentDescription(r3)
            com.tencent.mapsdk.raster.model.BitmapDescriptor r1 = r8.getIcon()
            if (r1 == 0) goto L_0x00b2
            com.tencent.mapsdk.raster.model.BitmapDescriptor r1 = r8.getIcon()
            android.graphics.Bitmap r1 = r1.getBitmap()
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(r1)
            r4.icon(r1)
        L_0x00b2:
            android.view.View r1 = r8.getMarkerView()
            if (r1 == 0) goto L_0x00c3
            android.view.View r1 = r8.getMarkerView()
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromView(r1)
            r4.icon(r1)
        L_0x00c3:
            java.lang.String r1 = r8.getSnippet()
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = r8.getSnippet()
            r4.snippet(r1)
        L_0x00d0:
            java.lang.String r1 = r8.getTitle()
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = r8.getTitle()
            r4.title(r1)
        L_0x00dd:
            java.lang.Object r1 = r8.getTag()
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r1 = r8.getTag()
            r4.tag(r1)
        L_0x00ea:
            com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] r1 = r8.getCollisions()
            if (r1 == 0) goto L_0x00f7
            com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] r8 = r8.getCollisions()
            r4.collisionBy(r8)
        L_0x00f7:
            r1 = r4
        L_0x00f8:
            com.tencent.tencentmap.mapsdk.maps.model.Marker r8 = r0.addMarker(r1)
            r2.<init>(r7, r8)
            java.util.HashMap<java.lang.Integer, yw3.e> r8 = r7.f356453e
            java.lang.String r0 = r2.getId()
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.put(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yw3.C119009i.addMarker(com.tencent.mapsdk.raster.model.MarkerOptions):com.tencent.mapsdk.raster.model.Marker");
    }

    public void addOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        if (onInfoWindowClickListener != null) {
            if (this.f356464s == null) {
                this.f356464s = new LinkedList();
            }
            this.f356464s.add(onInfoWindowClickListener);
        }
    }

    public void addOnMapCameraChangeListener(TencentMap.OnMapCameraChangeListener onMapCameraChangeListener) {
        if (onMapCameraChangeListener != null) {
            if (this.f356468w == null) {
                this.f356468w = new LinkedList();
            }
            this.f356468w.add(onMapCameraChangeListener);
        }
    }

    public void addOnMapClickListener(TencentMap.OnMapClickListener onMapClickListener) {
        if (onMapClickListener != null) {
            if (this.f356470y == null) {
                this.f356470y = new LinkedList();
            }
            this.f356470y.add(onMapClickListener);
        }
    }

    public void addOnMapLoadedListener(TencentMap.OnMapLoadedListener onMapLoadedListener) {
        if (onMapLoadedListener != null) {
            if (this.f356462q == null) {
                this.f356462q = new LinkedList();
            }
            this.f356462q.add(onMapLoadedListener);
        }
    }

    public void addOnMapLongClickListener(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        if (onMapLongClickListener != null) {
            if (this.f356451A == null) {
                this.f356451A = new LinkedList();
            }
            this.f356451A.add(onMapLongClickListener);
        }
    }

    public void addOnMarkerClickListener(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        if (onMarkerClickListener != null) {
            if (this.f356466u == null) {
                this.f356466u = new LinkedList();
            }
            this.f356466u.add(onMarkerClickListener);
        }
    }

    public void addOnMarkerDraggedListener(TencentMap.OnMarkerDraggedListener onMarkerDraggedListener) {
        if (onMarkerDraggedListener != null) {
            if (this.f356460o == null) {
                this.f356460o = new LinkedList();
            }
            this.f356460o.add(onMarkerDraggedListener);
        }
    }

    public Polygon addPolygon(PolygonOptions polygonOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions2 = null;
        if (tencentMap == null || polygonOptions == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions polygonOptions3 = new com.tencent.tencentmap.mapsdk.maps.model.PolygonOptions();
        List<LatLng> g = C119023n.m167773g(polygonOptions.getPoints());
        if (g != null && ((ArrayList) g).size() > 2) {
            polygonOptions3.addAll(g);
            polygonOptions3.visible(polygonOptions.isVisible()).zIndex((int) polygonOptions.getZIndex()).level(polygonOptions.getLevel()).strokeWidth(polygonOptions.getStrokeWidth()).strokeColor(polygonOptions.getStrokeColor()).fillColor(polygonOptions.getFillColor());
            if (polygonOptions.getPattern() != null) {
                polygonOptions3.pattern(polygonOptions.getPattern());
            }
            polygonOptions2 = polygonOptions3;
        }
        return new C119007g(tencentMap.addPolygon(polygonOptions2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v36 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.mapsdk.raster.model.Polyline addPolyline(com.tencent.mapsdk.raster.model.PolylineOptions r13) {
        /*
            r12 = this;
            com.tencent.tencentmap.mapsdk.maps.TencentMap r0 = r12.f356452d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            if (r13 != 0) goto L_0x0009
            return r1
        L_0x0009:
            yw3.f r2 = new yw3.f
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r3 = new com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions
            r3.<init>()
            java.util.List r4 = r13.getPoints()
            java.util.List r4 = yw3.C119023n.m167773g(r4)
            if (r4 == 0) goto L_0x01b6
            r5 = r4
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0025
            goto L_0x01b6
        L_0x0025:
            r3.addAll(r4)
            float r4 = r13.getWidth()
            float r5 = r13.getZIndex()
            int r5 = (int) r5
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r5 = r3.zIndex(r5)
            int r6 = r13.getLevel()
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r5 = r5.level(r6)
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r4 = r5.width(r4)
            boolean r5 = r13.isVisible()
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r4 = r4.visible(r5)
            int r5 = r13.getColor()
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r4 = r4.color(r5)
            int r5 = r13.getEdgeColor()
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r4 = r4.borderColor(r5)
            float r5 = r13.getEdgeWidth()
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r4 = r4.borderWidth(r5)
            int r5 = r13.getLineType()
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r4 = r4.lineType(r5)
            int r5 = r13.getEraseColor()
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r4 = r4.eraseColor(r5)
            com.tencent.mapsdk.raster.model.IndoorInfo r5 = r13.getIndoorInfo()
            if (r5 != 0) goto L_0x0078
            goto L_0x0085
        L_0x0078:
            com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo r1 = new com.tencent.tencentmap.mapsdk.maps.model.IndoorInfo
            java.lang.String r6 = r5.getBuildingId()
            java.lang.String r5 = r5.getFloorName()
            r1.<init>(r6, r5)
        L_0x0085:
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r1 = r4.indoorInfo(r1)
            boolean r4 = r13.lineCap()
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions r1 = r1.lineCap(r4)
            boolean r4 = r13.isGradientEnable()
            r1.gradient(r4)
            com.tencent.mapsdk.raster.model.BitmapDescriptor r1 = r13.getColorTexture()
            if (r1 == 0) goto L_0x00ad
            com.tencent.mapsdk.raster.model.BitmapDescriptor r1 = r13.getColorTexture()
            android.graphics.Bitmap r1 = r1.getBitmap()
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(r1)
            r3.colorTexture(r1)
        L_0x00ad:
            com.tencent.mapsdk.raster.model.BitmapDescriptor r1 = r13.getReviseArrowTexture()
            r4 = 1
            if (r1 == 0) goto L_0x00d1
            r3.arrow(r4)
            float r1 = r13.getArrowGap()
            int r1 = (int) r1
            r3.arrowSpacing(r1)
            com.tencent.mapsdk.raster.model.BitmapDescriptor r1 = r13.getReviseArrowTexture()     // Catch:{ Exception -> 0x00cf }
            android.graphics.Bitmap r1 = r1.getBitmap()     // Catch:{ Exception -> 0x00cf }
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(r1)     // Catch:{ Exception -> 0x00cf }
            r3.arrowTexture(r1)     // Catch:{ Exception -> 0x00cf }
            goto L_0x0116
        L_0x00cf:
            goto L_0x0116
        L_0x00d1:
            com.tencent.mapsdk.raster.model.BitmapDescriptor r1 = r13.getArrowTexture()
            if (r1 == 0) goto L_0x0116
            r3.arrow(r4)
            float r1 = r13.getArrowGap()
            int r1 = (int) r1
            r3.arrowSpacing(r1)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r10.postRotate(r1)
            com.tencent.mapsdk.raster.model.BitmapDescriptor r1 = r13.getArrowTexture()     // Catch:{ Exception -> 0x00cf }
            android.graphics.Bitmap r1 = r1.getBitmap()     // Catch:{ Exception -> 0x00cf }
            int r5 = r1.getWidth()     // Catch:{ Exception -> 0x00cf }
            int r6 = r1.getHeight()     // Catch:{ Exception -> 0x00cf }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r1, r5, r6, r4)     // Catch:{ Exception -> 0x00cf }
            r6 = 0
            r7 = 0
            int r8 = r5.getWidth()     // Catch:{ Exception -> 0x00cf }
            int r9 = r5.getHeight()     // Catch:{ Exception -> 0x00cf }
            r11 = 1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00cf }
            com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor r1 = com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(r1)     // Catch:{ Exception -> 0x00cf }
            r3.arrowTexture(r1)     // Catch:{ Exception -> 0x00cf }
        L_0x0116:
            boolean r1 = r13.isDottedLine()
            if (r1 == 0) goto L_0x0140
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = 1077936128(0x40400000, float:3.0)
            float r6 = r13.getWidth()
            float r6 = r6 * r5
            int r5 = (int) r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.add(r5)
            float r5 = r13.getWidth()
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.add(r5)
            r3.pattern(r1)
        L_0x0140:
            int[][] r1 = r13.getColors()
            if (r1 == 0) goto L_0x0156
            int[][] r1 = r13.getColors()
            r5 = 0
            r1 = r1[r5]
            int[][] r5 = r13.getColors()
            r4 = r5[r4]
            r3.colors(r1, r4)
        L_0x0156:
            pl0.q$l$b r1 = r13.getTextStyle()
            if (r1 == 0) goto L_0x01b5
            java.util.List r1 = r13.getSegmentTexts()
            if (r1 == 0) goto L_0x01b5
            java.util.List r1 = r13.getSegmentTexts()
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x01b5
            pl0.q$l$b r1 = r13.getTextStyle()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r13 = r13.getSegmentTexts()
            java.util.Iterator r13 = r13.iterator()
        L_0x017d:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x0198
            java.lang.Object r5 = r13.next()
            pl0.q$l$a r5 = (pl0.C118080q.C118095l.C118096a) r5
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions$SegmentText r6 = new com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions$SegmentText
            int r7 = r5.f353046b
            int r8 = r5.f353047c
            java.lang.String r5 = r5.f353045a
            r6.<init>(r7, r8, r5)
            r4.add(r6)
            goto L_0x017d
        L_0x0198:
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions$Text$Builder r13 = new com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions$Text$Builder
            r13.<init>((java.util.List<com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.SegmentText>) r4)
            int r4 = r1.f353048a
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions$Text$Builder r4 = r13.color(r4)
            int r5 = r1.f353050c
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions$Text$Builder r4 = r4.size(r5)
            int r1 = r1.f353049b
            r4.strokeColor(r1)
            com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions$Text r13 = r13.build()
            r3.text(r13)
        L_0x01b5:
            r1 = r3
        L_0x01b6:
            com.tencent.tencentmap.mapsdk.maps.model.Polyline r13 = r0.addPolyline(r1)
            r2.<init>(r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yw3.C119009i.addPolyline(com.tencent.mapsdk.raster.model.PolylineOptions):com.tencent.mapsdk.raster.model.Polyline");
    }

    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        TileProvider tileProvider = null;
        if (tencentMap == null || tileOverlayOptions == null) {
            return null;
        }
        com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions2 = new com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions();
        com.tencent.mapsdk.raster.model.TileProvider tileProvider2 = tileOverlayOptions.getTileProvider();
        if (tileProvider2 != null) {
            if (tileProvider2 instanceof UrlTileProvider) {
                UrlTileProvider urlTileProvider = (UrlTileProvider) tileProvider2;
                tileProvider = new C119021l(urlTileProvider.mWidth, urlTileProvider.mHeight, tileProvider2);
            } else {
                tileProvider = new C119022m(tileProvider2);
            }
        }
        return new C119020k(tencentMap.addTileOverlay(tileOverlayOptions2.tileProvider(tileProvider).diskCacheDir(tileOverlayOptions.getDiskCacheDir()).versionInfo(tileOverlayOptions.getVersionInfo()).zIndex(tileOverlayOptions.getZIndex()).betterQuality(tileOverlayOptions.isBetterQuality())));
    }

    public VisualLayer addVisualLayer(VisualLayerOptions visualLayerOptions) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null || visualLayerOptions == null) {
            return null;
        }
        return tencentMap.addVisualLayer(visualLayerOptions);
    }

    public void animateCamera(CameraUpdate cameraUpdate) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null && cameraUpdate != null) {
            tencentMap.animateCamera(C119023n.m167771e(cameraUpdate, tencentMap));
        }
    }

    public void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null && latLng != null) {
            tencentMap.animateCamera(CameraUpdateFactory.newLatLng(C119023n.m167772f(latLng)));
        }
    }

    public void clearAllOverlays() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.clear();
        }
    }

    public boolean clearCache() {
        return false;
    }

    public void enableAutoMaxOverlooking(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.enableAutoMaxSkew(z);
        }
    }

    public void enableMultipleInfowindow(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.enableMultipleInfowindow(z);
        }
    }

    public String executeMapVisualLayerCommand(VisualLayer visualLayer, String str) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        return tencentMap == null ? "" : visualLayer.executeCommand(tencentMap, str);
    }

    public String getActivedIndoorBuilding(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return null;
        }
        return tencentMap.getActivedIndoorBuilding(C119023n.m167772f(latLng));
    }

    public String[] getActivedIndoorFloorNames() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return null;
        }
        return tencentMap.getActivedIndoorFloorNames();
    }

    public CameraPosition getCameraPosition() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return null;
        }
        return C119023n.m167769c(tencentMap.getCameraPosition());
    }

    public String getDebugError() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return null;
        }
        return tencentMap.getDebugError();
    }

    public int getIndoorFloorId() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return 0;
        }
        return tencentMap.getIndoorFloorId();
    }

    public View getInfoContents(Marker marker) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d A[LOOP:0: B:3:0x000d->B:6:0x001d, LOOP_START, PHI: r1 
      PHI: (r1v2 android.view.View) = (r1v0 android.view.View), (r1v5 android.view.View) binds: [B:2:0x0009, B:6:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getInfoWindow(com.tencent.tencentmap.mapsdk.maps.model.Marker r4) {
        /*
            r3 = this;
            yw3.e r4 = r3.mo183687a(r4)
            java.util.List<com.tencent.tencentmap.mapsdk.map.TencentMap$InfoWindowAdapter> r0 = r3.f356458j
            r1 = 0
            if (r0 == 0) goto L_0x001f
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            com.tencent.tencentmap.mapsdk.map.TencentMap$InfoWindowAdapter r1 = (com.tencent.tencentmap.mapsdk.map.TencentMap.InfoWindowAdapter) r1
            android.view.View r1 = r1.getInfoWindow(r4)
            if (r1 == 0) goto L_0x000d
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yw3.C119009i.getInfoWindow(com.tencent.tencentmap.mapsdk.maps.model.Marker):android.view.View");
    }

    public com.tencent.mapsdk.raster.model.LatLng getMapCenter() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return null;
        }
        LatLng latLng = tencentMap.getCameraPosition().target;
        return C119023n.m167767a(this.f356452d.getCameraPosition().target);
    }

    public int getMapType() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return 1000;
        }
        return tencentMap.getMapType();
    }

    public int getMaxZoomLevel() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return 19;
        }
        return (int) tencentMap.getMaxZoomLevel();
    }

    public int getMinZoomLevel() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return 4;
        }
        return (int) tencentMap.getMinZoomLevel();
    }

    public Projection getProjection() {
        return new C119008h(this.f356452d);
    }

    public void getScreenShot(TencentMap.OnScreenShotListener onScreenShotListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.snapshot(new C119017h(this, onScreenShotListener));
        }
    }

    public String getVersion() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return null;
        }
        return tencentMap.getVersion();
    }

    public int getZoomLevel() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null || tencentMap.getCameraPosition() == null) {
            return -1;
        }
        return (int) this.f356452d.getCameraPosition().zoom;
    }

    public boolean isAppKeyAvailable() {
        return true;
    }

    public boolean isHandDrawMapEnable() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return false;
        }
        return tencentMap.isHandDrawMapEnable();
    }

    public boolean isSatelliteEnabled() {
        return this.f356455g;
    }

    public boolean isTrafficEnabled() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap == null) {
            return false;
        }
        return tencentMap.isTrafficEnabled();
    }

    public void moveCamera(CameraUpdate cameraUpdate) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null && cameraUpdate != null) {
            tencentMap.moveCamera(C119023n.m167771e(cameraUpdate, tencentMap));
        }
    }

    public void onCameraChange(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        CameraPosition c = C119023n.m167769c(cameraPosition);
        List<TencentMap.OnMapCameraChangeListener> list = this.f356468w;
        if (list != null) {
            for (TencentMap.OnMapCameraChangeListener onCameraChange : list) {
                onCameraChange.onCameraChange(c);
            }
        }
    }

    public void onCameraChangeFinished(com.tencent.tencentmap.mapsdk.maps.model.CameraPosition cameraPosition) {
        CameraPosition c = C119023n.m167769c(cameraPosition);
        List<TencentMap.OnMapCameraChangeListener> list = this.f356468w;
        if (list != null) {
            for (TencentMap.OnMapCameraChangeListener onCameraChangeFinish : list) {
                onCameraChangeFinish.onCameraChangeFinish(c);
            }
        }
    }

    public void onInfoWindowClick(Marker marker) {
        C119005e a = mo183687a(marker);
        List<TencentMap.OnInfoWindowClickListener> list = this.f356464s;
        if (list != null) {
            for (TencentMap.OnInfoWindowClickListener onInfoWindowClick : list) {
                onInfoWindowClick.onInfoWindowClick(a);
            }
        }
    }

    public void onInfoWindowClickLocation(int i, int i2, int i3, int i4) {
    }

    public void onMapClick(LatLng latLng) {
        com.tencent.mapsdk.raster.model.LatLng a = C119023n.m167767a(latLng);
        List<TencentMap.OnMapClickListener> list = this.f356470y;
        if (list != null) {
            for (TencentMap.OnMapClickListener onMapClick : list) {
                onMapClick.onMapClick(a);
            }
        }
    }

    public void onMapLoaded() {
        List<TencentMap.OnMapLoadedListener> list = this.f356462q;
        if (list != null) {
            for (TencentMap.OnMapLoadedListener onMapLoaded : list) {
                onMapLoaded.onMapLoaded();
            }
        }
    }

    public void onMapLongClick(LatLng latLng) {
        com.tencent.mapsdk.raster.model.LatLng a = C119023n.m167767a(latLng);
        List<TencentMap.OnMapLongClickListener> list = this.f356451A;
        if (list != null) {
            for (TencentMap.OnMapLongClickListener onMapLongClick : list) {
                onMapLongClick.onMapLongClick(a);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d A[LOOP:0: B:3:0x000d->B:6:0x001d, LOOP_START, PHI: r1 
      PHI: (r1v2 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:2:0x0009, B:6:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMarkerClick(com.tencent.tencentmap.mapsdk.maps.model.Marker r4) {
        /*
            r3 = this;
            yw3.e r4 = r3.mo183687a(r4)
            java.util.List<com.tencent.tencentmap.mapsdk.map.TencentMap$OnMarkerClickListener> r0 = r3.f356466u
            r1 = 0
            if (r0 == 0) goto L_0x001f
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            com.tencent.tencentmap.mapsdk.map.TencentMap$OnMarkerClickListener r1 = (com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener) r1
            boolean r1 = r1.onMarkerClick(r4)
            if (r1 == 0) goto L_0x000d
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yw3.C119009i.onMarkerClick(com.tencent.tencentmap.mapsdk.maps.model.Marker):boolean");
    }

    public void onMarkerDrag(Marker marker) {
        C119005e a = mo183687a(marker);
        List<TencentMap.OnMarkerDraggedListener> list = this.f356460o;
        if (list != null) {
            for (TencentMap.OnMarkerDraggedListener onMarkerDrag : list) {
                onMarkerDrag.onMarkerDrag(a);
            }
        }
    }

    public void onMarkerDragEnd(Marker marker) {
        C119005e a = mo183687a(marker);
        List<TencentMap.OnMarkerDraggedListener> list = this.f356460o;
        if (list != null) {
            for (TencentMap.OnMarkerDraggedListener onMarkerDragEnd : list) {
                onMarkerDragEnd.onMarkerDragEnd(a);
            }
        }
    }

    public void onMarkerDragStart(Marker marker) {
        C119005e a = mo183687a(marker);
        List<TencentMap.OnMarkerDraggedListener> list = this.f356460o;
        if (list != null) {
            for (TencentMap.OnMarkerDraggedListener onMarkerDragStart : list) {
                onMarkerDragStart.onMarkerDragStart(a);
            }
        }
    }

    public void remmoveOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        List<TencentMap.OnInfoWindowClickListener> list;
        if (onInfoWindowClickListener != null && (list = this.f356464s) != null) {
            ((LinkedList) list).remove(onInfoWindowClickListener);
        }
    }

    public void removeInfoWindowAdapter(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        List<TencentMap.InfoWindowAdapter> list;
        if (infoWindowAdapter != null && (list = this.f356458j) != null) {
            ((LinkedList) list).remove(infoWindowAdapter);
        }
    }

    public void removeOnMapCameraChangeListener(TencentMap.OnMapCameraChangeListener onMapCameraChangeListener) {
        List<TencentMap.OnMapCameraChangeListener> list;
        if (onMapCameraChangeListener != null && (list = this.f356468w) != null) {
            ((LinkedList) list).remove(onMapCameraChangeListener);
        }
    }

    public void removeOnMapClickListener(TencentMap.OnMapClickListener onMapClickListener) {
        List<TencentMap.OnMapClickListener> list;
        if (onMapClickListener != null && (list = this.f356470y) != null) {
            ((LinkedList) list).remove(onMapClickListener);
        }
    }

    public void removeOnMapLoadedListener(TencentMap.OnMapLoadedListener onMapLoadedListener) {
        List<TencentMap.OnMapLoadedListener> list;
        if (onMapLoadedListener != null && (list = this.f356462q) != null) {
            ((LinkedList) list).remove(onMapLoadedListener);
        }
    }

    public void removeOnMapLongClickListener(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        List<TencentMap.OnMapLongClickListener> list;
        if (onMapLongClickListener != null && (list = this.f356451A) != null) {
            ((LinkedList) list).remove(onMapLongClickListener);
        }
    }

    public void removeOnMarkerClickListener(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        List<TencentMap.OnMarkerClickListener> list;
        if (onMarkerClickListener != null && (list = this.f356466u) != null) {
            ((LinkedList) list).remove(onMarkerClickListener);
        }
    }

    public void removeOnMarkerDraggedListener(TencentMap.OnMarkerDraggedListener onMarkerDraggedListener) {
        List<TencentMap.OnMarkerDraggedListener> list;
        if (onMarkerDraggedListener != null && (list = this.f356460o) != null) {
            ((LinkedList) list).remove(onMarkerDraggedListener);
        }
    }

    public void removeTencentMapGestureListener(TencentMap.TencentMapGestureListener tencentMapGestureListener) {
        this.f356452d.removeTencentMapGestureListener(this.f356456h);
    }

    public void scrollBy(float f, float f2) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.animateCamera(CameraUpdateFactory.scrollBy(f, f2));
        }
    }

    public void set3DEnable(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setBuildingEnable(z);
        }
    }

    public void setBuilding3dEffectEnable(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setBuilding3dEffectEnable(z);
        }
    }

    public void setCenter(com.tencent.mapsdk.raster.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null && latLng != null) {
            tencentMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(latLng.getLatitude(), latLng.getLongitude())));
        }
    }

    @Deprecated
    public void setErrorListener(TencentMap.OnErrorListener onErrorListener) {
    }

    public void setForeignLanguage(Language language) {
        com.tencent.tencentmap.mapsdk.maps.model.Language language2;
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            if (language == null) {
                language2 = com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
            } else {
                int i = C119023n.C119024a.f356486a[language.ordinal()];
                language2 = i != 1 ? i != 2 ? com.tencent.tencentmap.mapsdk.maps.model.Language.zh : com.tencent.tencentmap.mapsdk.maps.model.Language.en : com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
            }
            tencentMap.setForeignLanguage(language2);
        }
    }

    public void setHandDrawMapEnable(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setHandDrawMapEnable(z);
        }
    }

    public void setIndoorEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setIndoorEnabled(z);
        }
    }

    public void setIndoorFloor(int i) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setIndoorFloor(i);
        }
    }

    public void setIndoorMaskColor(int i) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setIndoorMaskColor(i);
        }
    }

    public void setInfoWindowAdapter(TencentMap.InfoWindowAdapter infoWindowAdapter) {
        TencentMap.InfoWindowAdapter infoWindowAdapter2;
        if (infoWindowAdapter == null && (infoWindowAdapter2 = this.f356457i) != null) {
            removeInfoWindowAdapter(infoWindowAdapter2);
        }
        this.f356457i = infoWindowAdapter;
        addInfoWindowAdapter(infoWindowAdapter);
    }

    public void setMapAnchor(float f, float f2) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setCameraCenterProportion(f, f2, false);
            this.f356452d.getUiSettings().setGestureScaleByMapCenter(true);
        }
    }

    public void setMapBoundary(LatLngBounds latLngBounds) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null && latLngBounds != null) {
            tencentMap.setRestrictBounds(latLngBounds, RestrictBoundsFitMode.FIT_WIDTH);
        }
    }

    public void setMapStyle(int i) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setMapStyle(i);
        }
    }

    public void setMapType(int i) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setMapType(i);
        }
    }

    public void setMaxZoomLevel(int i) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setMaxZoomLevel(i);
        }
    }

    public void setMinZoomLevel(int i) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setMinZoomLevel(i);
        }
    }

    public void setOnIndoorStateChangeListener(TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setOnIndoorStateChangeListener(new C119015f(this, onIndoorStateChangeListener));
        }
    }

    public void setOnInfoWindowClickListener(TencentMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        TencentMap.OnInfoWindowClickListener onInfoWindowClickListener2;
        if (onInfoWindowClickListener == null && (onInfoWindowClickListener2 = this.f356463r) != null) {
            remmoveOnInfoWindowClickListener(onInfoWindowClickListener2);
        }
        this.f356463r = onInfoWindowClickListener;
        addOnInfoWindowClickListener(onInfoWindowClickListener);
    }

    public void setOnMapCameraChangeListener(TencentMap.OnMapCameraChangeListener onMapCameraChangeListener) {
        TencentMap.OnMapCameraChangeListener onMapCameraChangeListener2;
        if (onMapCameraChangeListener == null && (onMapCameraChangeListener2 = this.f356467v) != null) {
            removeOnMapCameraChangeListener(onMapCameraChangeListener2);
        }
        this.f356467v = onMapCameraChangeListener;
        addOnMapCameraChangeListener(onMapCameraChangeListener);
    }

    public void setOnMapClickListener(TencentMap.OnMapClickListener onMapClickListener) {
        TencentMap.OnMapClickListener onMapClickListener2;
        if (onMapClickListener == null && (onMapClickListener2 = this.f356469x) != null) {
            removeOnMapClickListener(onMapClickListener2);
        }
        this.f356469x = onMapClickListener;
        addOnMapClickListener(onMapClickListener);
    }

    public void setOnMapLoadedListener(TencentMap.OnMapLoadedListener onMapLoadedListener) {
        TencentMap.OnMapLoadedListener onMapLoadedListener2;
        if (onMapLoadedListener == null && (onMapLoadedListener2 = this.f356461p) != null) {
            removeOnMapLoadedListener(onMapLoadedListener2);
        }
        this.f356461p = onMapLoadedListener;
        addOnMapLoadedListener(onMapLoadedListener);
    }

    public void setOnMapLongClickListener(TencentMap.OnMapLongClickListener onMapLongClickListener) {
        TencentMap.OnMapLongClickListener onMapLongClickListener2;
        if (onMapLongClickListener == null && (onMapLongClickListener2 = this.f356471z) != null) {
            removeOnMapLongClickListener(onMapLongClickListener2);
        }
        this.f356471z = onMapLongClickListener;
        addOnMapLongClickListener(onMapLongClickListener);
    }

    public void setOnMapPoiClickListener(TencentMap.OnMapPoiClickListener onMapPoiClickListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setOnMapPoiClickListener(new C119014e(this, onMapPoiClickListener));
        }
    }

    public void setOnMarkerClickListener(TencentMap.OnMarkerClickListener onMarkerClickListener) {
        TencentMap.OnMarkerClickListener onMarkerClickListener2;
        if (onMarkerClickListener == null && (onMarkerClickListener2 = this.f356465t) != null) {
            removeOnMarkerClickListener(onMarkerClickListener2);
        }
        this.f356465t = onMarkerClickListener;
        addOnMarkerClickListener(onMarkerClickListener);
    }

    public void setOnMarkerDraggedListener(TencentMap.OnMarkerDraggedListener onMarkerDraggedListener) {
        TencentMap.OnMarkerDraggedListener onMarkerDraggedListener2;
        if (onMarkerDraggedListener == null && (onMarkerDraggedListener2 = this.f356459n) != null) {
            removeOnMarkerDraggedListener(onMarkerDraggedListener2);
        }
        this.f356459n = onMarkerDraggedListener;
        addOnMarkerDraggedListener(onMarkerDraggedListener);
    }

    public void setOnScaleViewChangedListener(TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        this.f356452d.setOnScaleViewChangedListener(onScaleViewChangedListener);
    }

    public void setPoisEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setPoisEnabled(z);
        }
    }

    public void setSatelliteEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            this.f356455g = z;
            tencentMap.setSatelliteEnabled(z);
        }
    }

    public void setTencentMapGestureListener(TencentMap.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null && tencentMapGestureListener != null) {
            TencentMapGestureListener tencentMapGestureListener2 = this.f356456h;
            if (tencentMapGestureListener2 != null) {
                tencentMap.removeTencentMapGestureListener(tencentMapGestureListener2);
            }
            C119016g gVar = new C119016g(this, tencentMapGestureListener);
            this.f356456h = gVar;
            this.f356452d.setTencentMapGestureListener(gVar);
        }
    }

    public void setTrafficEnabled(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setTrafficEnabled(z);
        }
    }

    public void setZoom(int i) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.moveCamera(CameraUpdateFactory.zoomTo((float) i));
        }
    }

    public void showBuilding(boolean z) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.showBuilding(z);
        }
    }

    public void stopAnimation() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.stopAnimation();
        }
    }

    public void zoomIn() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.animateCamera(CameraUpdateFactory.zoomIn());
        }
    }

    public void zoomInFixing(int i, int i2) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.moveCamera(CameraUpdateFactory.zoomBy(1.0f, new Point(i, i2)));
        }
    }

    public void zoomOut() {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.animateCamera(CameraUpdateFactory.zoomOut());
        }
    }

    public void zoomOutFixing(int i, int i2) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.moveCamera(CameraUpdateFactory.zoomBy(-1.0f, new Point(i, i2)));
        }
    }

    public void zoomToSpan(com.tencent.mapsdk.raster.model.LatLng latLng, com.tencent.mapsdk.raster.model.LatLng latLng2) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.moveCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(C119023n.m167772f(latLng), C119023n.m167772f(latLng2)), 0));
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate, long j, CancelableCallback cancelableCallback) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null && cameraUpdate != null) {
            tencentMap.animateCamera(C119023n.m167771e(cameraUpdate, tencentMap), j, new C119012c(this, cancelableCallback));
        }
    }

    @Deprecated
    public void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng, Runnable runnable) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null && latLng != null) {
            tencentMap.animateCamera(CameraUpdateFactory.newLatLng(C119023n.m167772f(latLng)), new C119010a(this, runnable));
        }
    }

    @Deprecated
    public void getScreenShot(TencentMap.OnScreenShotListener onScreenShotListener, Rect rect) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.snapshot(new C119018i(this, onScreenShotListener));
        }
    }

    public void scrollBy(float f, float f2, long j, CancelableCallback cancelableCallback) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.animateCamera(CameraUpdateFactory.scrollBy(f, f2), new C119013d(this, cancelableCallback));
        }
    }

    public void setIndoorFloor(String str, String str2) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.setIndoorFloor(str, str2);
        }
    }

    public void animateTo(com.tencent.mapsdk.raster.model.LatLng latLng, long j, CancelableCallback cancelableCallback) {
        com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap = this.f356452d;
        if (tencentMap != null) {
            tencentMap.animateCamera(CameraUpdateFactory.newLatLng(C119023n.m167772f(latLng)), j, new C119011b(this, cancelableCallback));
        }
    }

    public void zoomToSpan(double d, double d2) {
        double d3 = d / 2.0d;
        double d4 = d2 / 2.0d;
        zoomToSpan(new com.tencent.mapsdk.raster.model.LatLng(getMapCenter().getLatitude() - d3, getMapCenter().getLongitude() + d4), new com.tencent.mapsdk.raster.model.LatLng(getMapCenter().getLatitude() + d3, getMapCenter().getLongitude() - d4));
    }
}
