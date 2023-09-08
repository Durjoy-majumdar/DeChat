package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.tencent.mapsdk.raster.model.BitmapDescriptor;
import com.tencent.mapsdk.raster.model.BitmapDescriptorFactory;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.LatLngBounds;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.mapsdk.raster.model.MarkerOptions;
import com.tencent.tencentmap.mapsdk.map.Projection;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.MarkerManager;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterManager;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.Algorithm;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo.PreCachingAlgorithmDecorator;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p847ui.IconGenerator;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116377b;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116378c;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C75247e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DefaultClusterRenderer<T extends ClusterItem> implements ClusterRenderer<T> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f349270b = true;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static volatile boolean f349271g = false;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final TimeInterpolator f349272z = new DecelerateInterpolator();

    /* renamed from: a */
    public double f349273a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final TencentMap f349274c;

    /* renamed from: d */
    private final IconGenerator f349275d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ClusterManager<T> f349276e;

    /* renamed from: f */
    private final float f349277f;

    /* renamed from: h */
    private int[] f349278h = {10, 20, 50, 100, 200, 500, 1000};

    /* renamed from: i */
    private ShapeDrawable f349279i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Set<MarkerWithPosition> f349280j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private SparseArray<BitmapDescriptor> f349281k = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MarkerCache<T> f349282l = new MarkerCache<>();

    /* renamed from: m */
    private int f349283m = 4;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Set<? extends Cluster<T>> f349284n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f349285o = true;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Map<Marker, Cluster<T>> f349286p = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Map<Cluster<T>, Marker> f349287q = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f349288r;

    /* renamed from: s */
    private final DefaultClusterRenderer<T>.ViewModifier f349289s = new ViewModifier();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ClusterManager.OnClusterClickListener<T> f349290t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ClusterManager.OnClusterInfoWindowClickListener<T> f349291u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public ClusterManager.ClusterInfoWindowAdapter<T> f349292v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ClusterManager.OnClusterItemClickListener<T> f349293w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public ClusterManager.OnClusterItemInfoWindowClickListener<T> f349294x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public ClusterManager.ClusterItemInfoWindowAdapter<T> f349295y;

    public class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b */
        private final MarkerWithPosition f349303b;

        /* renamed from: c */
        private final Marker f349304c;

        /* renamed from: d */
        private final LatLng f349305d;

        /* renamed from: e */
        private final LatLng f349306e;

        /* renamed from: f */
        private boolean f349307f;

        /* renamed from: g */
        private MarkerManager f349308g;

        public void onAnimationEnd(Animator animator) {
            if (this.f349307f) {
                DefaultClusterRenderer.this.f349287q.remove((Cluster) DefaultClusterRenderer.this.f349286p.get(this.f349304c));
                DefaultClusterRenderer.this.f349282l.remove(this.f349304c);
                DefaultClusterRenderer.this.f349286p.remove(this.f349304c);
                this.f349308g.mo178897a(this.f349304c);
            }
            LatLng unused = this.f349303b.f349325b = this.f349306e;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            double d = (double) animatedFraction;
            double latitude = ((this.f349306e.getLatitude() - this.f349305d.getLatitude()) * d) + this.f349305d.getLatitude();
            double longitude = this.f349306e.getLongitude() - this.f349305d.getLongitude();
            if (Math.abs(longitude) > 180.0d) {
                longitude -= Math.signum(longitude) * 360.0d;
            }
            this.f349304c.setPosition(new LatLng(latitude, (longitude * d) + this.f349305d.getLongitude()));
        }

        public void perform() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setInterpolator(DefaultClusterRenderer.f349272z);
            ofFloat.addUpdateListener(this);
            ofFloat.addListener(this);
            ofFloat.start();
        }

        public void removeOnAnimationComplete(MarkerManager markerManager) {
            this.f349308g = markerManager;
            this.f349307f = true;
        }

        private AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f349303b = markerWithPosition;
            this.f349304c = markerWithPosition.f349324a;
            this.f349305d = latLng;
            this.f349306e = latLng2;
        }
    }

    public class CreateMarkerTask {

        /* renamed from: b */
        private final Cluster<T> f349310b;

        /* renamed from: c */
        private final Set<MarkerWithPosition> f349311c;

        /* renamed from: d */
        private final LatLng f349312d;

        public CreateMarkerTask(Cluster<T> cluster, Set<MarkerWithPosition> set, LatLng latLng) {
            this.f349310b = cluster;
            this.f349311c = set;
            this.f349312d = latLng;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m164104a(DefaultClusterRenderer<T>.MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            if (!DefaultClusterRenderer.this.mo179005a(this.f349310b)) {
                for (T t : this.f349310b.getItems()) {
                    Marker marker = DefaultClusterRenderer.this.f349282l.get(t);
                    if (marker == null) {
                        MarkerOptions anchor = new MarkerOptions().position(t.getPosition()).anchor(0.5f, 0.5f);
                        LatLng latLng = this.f349312d;
                        if (latLng != null) {
                            anchor.position(latLng);
                        }
                        DefaultClusterRenderer.this.onBeforeClusterItemRendered(t, anchor);
                        marker = DefaultClusterRenderer.this.f349276e.getMarkerCollection().mo178898a(anchor);
                        markerWithPosition = new MarkerWithPosition(marker);
                        DefaultClusterRenderer.this.f349282l.put(t, marker);
                        LatLng latLng2 = this.f349312d;
                        if (latLng2 != null) {
                            markerModifier.animate(markerWithPosition, latLng2, t.getPosition());
                        }
                    } else {
                        markerWithPosition = new MarkerWithPosition(marker);
                    }
                    DefaultClusterRenderer.this.mo179004a(t, marker);
                    this.f349311c.add(markerWithPosition);
                }
                return;
            }
            MarkerOptions markerOptions = new MarkerOptions();
            LatLng latLng3 = this.f349312d;
            if (latLng3 == null) {
                latLng3 = this.f349310b.getPosition();
            }
            MarkerOptions anchor2 = markerOptions.position(latLng3).anchor(0.5f, 0.5f);
            DefaultClusterRenderer.this.onBeforeClusterRendered(this.f349310b, anchor2);
            Marker a = DefaultClusterRenderer.this.f349276e.getClusterMarkerCollection().mo178898a(anchor2);
            DefaultClusterRenderer.this.f349286p.put(a, this.f349310b);
            DefaultClusterRenderer.this.f349287q.put(this.f349310b, a);
            MarkerWithPosition markerWithPosition2 = new MarkerWithPosition(a);
            LatLng latLng4 = this.f349312d;
            if (latLng4 != null) {
                markerModifier.animate(markerWithPosition2, latLng4, this.f349310b.getPosition());
            }
            DefaultClusterRenderer.this.mo179003a(this.f349310b, a);
            this.f349311c.add(markerWithPosition2);
        }
    }

    public static class MarkerCache<T> {

        /* renamed from: a */
        private Map<T, Marker> f349313a;

        /* renamed from: b */
        private Map<Marker, T> f349314b;

        private MarkerCache() {
            this.f349313a = new HashMap();
            this.f349314b = new HashMap();
        }

        public Marker get(T t) {
            return this.f349313a.get(t);
        }

        public void put(T t, Marker marker) {
            this.f349313a.put(t, marker);
            this.f349314b.put(marker, t);
        }

        public void remove(Marker marker) {
            T t = this.f349314b.get(marker);
            this.f349314b.remove(marker);
            this.f349313a.remove(t);
        }

        public T get(Marker marker) {
            return this.f349314b.get(marker);
        }
    }

    public class MarkerModifier extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: b */
        private final Lock f349316b;

        /* renamed from: c */
        private final Condition f349317c;

        /* renamed from: d */
        private Queue<DefaultClusterRenderer<T>.CreateMarkerTask> f349318d;

        /* renamed from: e */
        private Queue<DefaultClusterRenderer<T>.CreateMarkerTask> f349319e;

        /* renamed from: f */
        private Queue<Marker> f349320f;

        /* renamed from: g */
        private Queue<Marker> f349321g;

        /* renamed from: h */
        private Queue<DefaultClusterRenderer<T>.AnimationTask> f349322h;

        /* renamed from: i */
        private boolean f349323i;

        /* renamed from: a */
        private void m164105a() {
            try {
                if (!this.f349321g.isEmpty()) {
                    m164106a(this.f349321g.poll());
                } else if (!this.f349322h.isEmpty()) {
                    this.f349322h.poll().perform();
                } else if (!this.f349319e.isEmpty()) {
                    this.f349319e.poll().m164104a(this);
                } else if (!this.f349318d.isEmpty()) {
                    this.f349318d.poll().m164104a(this);
                } else if (!this.f349320f.isEmpty()) {
                    m164106a(this.f349320f.poll());
                }
            } catch (NullPointerException unused) {
                if (DefaultClusterRenderer.f349271g) {
                    cancel();
                }
            }
        }

        public void add(boolean z, DefaultClusterRenderer<T>.CreateMarkerTask createMarkerTask) {
            this.f349316b.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f349319e.add(createMarkerTask);
            } else {
                this.f349318d.add(createMarkerTask);
            }
            this.f349316b.unlock();
        }

        public void animate(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f349316b.lock();
            this.f349322h.add(new AnimationTask(markerWithPosition, latLng, latLng2));
            this.f349316b.unlock();
        }

        public void animateThenRemove(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.f349316b.lock();
            AnimationTask animationTask = new AnimationTask(markerWithPosition, latLng, latLng2);
            animationTask.removeOnAnimationComplete(DefaultClusterRenderer.this.f349276e.getMarkerManager());
            this.f349322h.add(animationTask);
            this.f349316b.unlock();
        }

        public void cancel() {
            this.f349319e.clear();
            this.f349322h.clear();
            this.f349318d.clear();
            this.f349321g.clear();
            this.f349320f.clear();
        }

        public void handleMessage(Message message) {
            if (!this.f349323i) {
                Looper.myQueue().addIdleHandler(this);
                this.f349323i = true;
            }
            removeMessages(0);
            this.f349316b.lock();
            int i = 0;
            while (i < 10) {
                try {
                    m164105a();
                    i++;
                } catch (Throwable th) {
                    this.f349316b.unlock();
                    throw th;
                }
            }
            if (!isBusy()) {
                this.f349323i = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f349317c.signalAll();
            } else {
                sendEmptyMessageDelayed(0, 10);
            }
            this.f349316b.unlock();
        }

        public boolean isBusy() {
            try {
                this.f349316b.lock();
                return !this.f349318d.isEmpty() || !this.f349319e.isEmpty() || !this.f349321g.isEmpty() || !this.f349320f.isEmpty() || !this.f349322h.isEmpty();
            } finally {
                this.f349316b.unlock();
            }
        }

        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public void remove(boolean z, Marker marker) {
            this.f349316b.lock();
            sendEmptyMessage(0);
            if (z) {
                this.f349321g.add(marker);
            } else {
                this.f349320f.add(marker);
            }
            this.f349316b.unlock();
        }

        public void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                this.f349316b.lock();
                try {
                    if (isBusy()) {
                        this.f349317c.await();
                    }
                    this.f349316b.unlock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    this.f349316b.unlock();
                    throw th;
                }
            }
        }

        private MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f349316b = reentrantLock;
            this.f349317c = reentrantLock.newCondition();
            this.f349318d = new LinkedList();
            this.f349319e = new LinkedList();
            this.f349320f = new LinkedList();
            this.f349321g = new LinkedList();
            this.f349322h = new LinkedList();
        }

        /* renamed from: a */
        private void m164106a(Marker marker) {
            DefaultClusterRenderer.this.f349287q.remove((Cluster) DefaultClusterRenderer.this.f349286p.get(marker));
            DefaultClusterRenderer.this.f349282l.remove(marker);
            DefaultClusterRenderer.this.f349286p.remove(marker);
            DefaultClusterRenderer.this.f349276e.getMarkerManager().mo178897a(marker);
        }
    }

    public static class MarkerWithPosition {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Marker f349324a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public LatLng f349325b;

        public boolean equals(Object obj) {
            if (obj instanceof MarkerWithPosition) {
                return this.f349324a.equals(((MarkerWithPosition) obj).f349324a);
            }
            return false;
        }

        public int hashCode() {
            return this.f349324a.hashCode();
        }

        private MarkerWithPosition(Marker marker) {
            this.f349324a = marker;
            this.f349325b = marker.getPosition();
        }
    }

    public class RenderTask implements Runnable {

        /* renamed from: a */
        public final Set<? extends Cluster<T>> f349326a;

        /* renamed from: c */
        private Runnable f349328c;

        /* renamed from: d */
        private Projection f349329d;

        /* renamed from: e */
        private C116378c f349330e;

        /* renamed from: f */
        private float f349331f;

        /* renamed from: g */
        private double f349332g;

        public void run() {
            ArrayList arrayList;
            Marker marker;
            if (!this.f349326a.equals(DefaultClusterRenderer.this.f349284n) || DefaultClusterRenderer.this.f349285o) {
                boolean z = false;
                if (DefaultClusterRenderer.this.f349285o) {
                    boolean unused = DefaultClusterRenderer.this.f349285o = false;
                }
                ArrayList arrayList2 = null;
                MarkerModifier markerModifier = new MarkerModifier();
                float f = this.f349331f;
                if (f > DefaultClusterRenderer.this.f349288r) {
                    z = true;
                }
                float j = f - DefaultClusterRenderer.this.f349288r;
                Set<MarkerWithPosition> m = DefaultClusterRenderer.this.f349280j;
                LatLngBounds latLngBounds = this.f349329d.getVisibleRegion().getLatLngBounds();
                if (DefaultClusterRenderer.this.f349284n == null || !DefaultClusterRenderer.f349270b) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (Cluster cluster : DefaultClusterRenderer.this.f349284n) {
                        if (DefaultClusterRenderer.this.mo179005a(cluster) && latLngBounds.contains(cluster.getPosition())) {
                            arrayList.add(this.f349330e.mo178914a(cluster.getPosition()));
                        }
                    }
                }
                Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                for (Cluster cluster2 : this.f349326a) {
                    if (DefaultClusterRenderer.this.f349284n == null || !DefaultClusterRenderer.this.f349284n.contains(cluster2) || !DefaultClusterRenderer.this.mo179005a(cluster2) || (marker = (Marker) DefaultClusterRenderer.this.f349287q.get(cluster2)) == null) {
                        boolean contains = latLngBounds.contains(cluster2.getPosition());
                        if (!z || !contains || !DefaultClusterRenderer.f349270b) {
                            markerModifier.add(contains, new CreateMarkerTask(cluster2, newSetFromMap, (LatLng) null));
                        } else {
                            C116377b a = DefaultClusterRenderer.m164080b(arrayList, this.f349330e.mo178914a(cluster2.getPosition()), this.f349332g);
                            if (a != null) {
                                markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, this.f349330e.mo178913a(a)));
                            } else {
                                markerModifier.add(true, new CreateMarkerTask(cluster2, newSetFromMap, (LatLng) null));
                            }
                        }
                    } else {
                        newSetFromMap.add(new MarkerWithPosition(marker));
                    }
                }
                markerModifier.waitUntilFree();
                m.removeAll(newSetFromMap);
                if (DefaultClusterRenderer.f349270b) {
                    arrayList2 = new ArrayList();
                    for (Cluster cluster3 : this.f349326a) {
                        if (DefaultClusterRenderer.this.mo179005a(cluster3) && latLngBounds.contains(cluster3.getPosition())) {
                            arrayList2.add(this.f349330e.mo178914a(cluster3.getPosition()));
                        }
                    }
                }
                for (MarkerWithPosition markerWithPosition : m) {
                    boolean contains2 = latLngBounds.contains(markerWithPosition.f349325b);
                    if (z || j <= -3.0f || !contains2 || !DefaultClusterRenderer.f349270b) {
                        markerModifier.remove(contains2, markerWithPosition.f349324a);
                    } else {
                        C116377b a2 = DefaultClusterRenderer.m164080b(arrayList2, this.f349330e.mo178914a(markerWithPosition.f349325b), this.f349332g);
                        if (a2 != null) {
                            markerModifier.animateThenRemove(markerWithPosition, markerWithPosition.f349325b, this.f349330e.mo178913a(a2));
                        } else {
                            markerModifier.remove(true, markerWithPosition.f349324a);
                        }
                    }
                }
                markerModifier.waitUntilFree();
                Set unused2 = DefaultClusterRenderer.this.f349280j = newSetFromMap;
                Set unused3 = DefaultClusterRenderer.this.f349284n = this.f349326a;
                float unused4 = DefaultClusterRenderer.this.f349288r = f;
                this.f349328c.run();
                return;
            }
            this.f349328c.run();
        }

        public void setCallback(Runnable runnable) {
            this.f349328c = runnable;
        }

        public void setMapZoom(float f) {
            this.f349331f = f;
            this.f349330e = new C116378c(Math.pow(2.0d, (double) (Math.min(f, DefaultClusterRenderer.this.f349288r) - 1.0f)) * 256.0d);
        }

        public void setProjection(Projection projection) {
            this.f349329d = projection;
        }

        private RenderTask(Set<? extends Cluster<T>> set, double d) {
            this.f349326a = set;
            this.f349332g = d;
        }
    }

    public class ViewModifier extends Handler {

        /* renamed from: b */
        private boolean f349334b;

        /* renamed from: c */
        private DefaultClusterRenderer<T>.RenderTask f349335c;

        private ViewModifier() {
            this.f349334b = false;
            this.f349335c = null;
        }

        public void handleMessage(Message message) {
            Projection projection;
            DefaultClusterRenderer<T>.RenderTask renderTask;
            if (message.what == 1) {
                this.f349334b = false;
                if (this.f349335c != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (!this.f349334b && this.f349335c != null && (projection = DefaultClusterRenderer.this.f349274c.getProjection()) != null) {
                synchronized (this) {
                    renderTask = this.f349335c;
                    this.f349335c = null;
                    this.f349334b = true;
                }
                renderTask.setCallback(new Runnable() {
                    public void run() {
                        ViewModifier.this.sendEmptyMessage(1);
                    }
                });
                renderTask.setProjection(projection);
                try {
                    renderTask.setMapZoom(DefaultClusterRenderer.this.f349274c.getCameraPosition().getZoom());
                    new Thread(renderTask).start();
                } catch (NullPointerException unused) {
                    boolean unused2 = DefaultClusterRenderer.f349271g;
                }
            }
        }

        public void queue(Set<? extends Cluster<T>> set) {
            synchronized (this) {
                DefaultClusterRenderer defaultClusterRenderer = DefaultClusterRenderer.this;
                this.f349335c = new RenderTask(set, defaultClusterRenderer.f349273a);
            }
            sendEmptyMessage(0);
        }
    }

    public DefaultClusterRenderer(Context context, TencentMap tencentMap, ClusterManager<T> clusterManager) {
        this.f349274c = tencentMap;
        float f = context.getResources().getDisplayMetrics().density;
        this.f349277f = f;
        IconGenerator iconGenerator = new IconGenerator(context);
        this.f349275d = iconGenerator;
        iconGenerator.setContentView(m164075a(context));
        iconGenerator.setTextAppearance(16973886, -1118482, 16.0f, 1);
        iconGenerator.setBackground(m164086d());
        this.f349276e = clusterManager;
        Algorithm<T> algorithm = clusterManager.getAlgorithm() instanceof PreCachingAlgorithmDecorator ? ((PreCachingAlgorithmDecorator) clusterManager.getAlgorithm()).getAlgorithm() : clusterManager.getAlgorithm();
        if (algorithm instanceof NonHierarchicalDistanceBasedAlgorithm) {
            this.f349273a = (((double) ((NonHierarchicalDistanceBasedAlgorithm) algorithm).getMaxDistanceAtZoom()) + 0.5d) * ((double) f);
        } else {
            this.f349273a = (double) (f * 35.0f);
        }
    }

    /* renamed from: a */
    public void mo179003a(Cluster<T> cluster, Marker marker) {
    }

    /* renamed from: a */
    public void mo179004a(T t, Marker marker) {
    }

    public void cancel() {
        f349271g = true;
        onRemove();
    }

    public int getBucket(Cluster<T> cluster) {
        int size = cluster.getSize();
        int[] iArr = this.f349278h;
        if (iArr == null) {
            return size;
        }
        int i = 0;
        if (size <= iArr[0]) {
            return size;
        }
        while (true) {
            int[] iArr2 = this.f349278h;
            if (i >= iArr2.length - 1) {
                return iArr2[iArr2.length - 1];
            }
            int i2 = i + 1;
            if (size < iArr2[i2]) {
                return iArr2[i];
            }
            i = i2;
        }
    }

    public int[] getBuckets() {
        return this.f349278h;
    }

    public Cluster<T> getCluster(Marker marker) {
        return this.f349286p.get(marker);
    }

    public T getClusterItem(Marker marker) {
        return (ClusterItem) this.f349282l.get(marker);
    }

    public int getColor(int i) {
        float min = 300.0f - Math.min((float) i, 300.0f);
        return Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    public Marker getMarker(T t) {
        return this.f349282l.get(t);
    }

    public int getMinClusterSize() {
        return this.f349283m;
    }

    public void onAdd() {
        this.f349276e.getMarkerCollection().mo178902a((TencentMap.OnMarkerClickListener) new TencentMap.OnMarkerClickListener() {
            public boolean onMarkerClick(Marker marker) {
                ClusterItem clusterItem = (ClusterItem) DefaultClusterRenderer.this.f349282l.get(marker);
                return (DefaultClusterRenderer.this.f349293w == null || clusterItem == null || !DefaultClusterRenderer.this.f349293w.onClusterItemClick(clusterItem)) ? false : true;
            }
        });
        this.f349276e.getMarkerCollection().mo178901a((TencentMap.OnInfoWindowClickListener) new TencentMap.OnInfoWindowClickListener() {
            public void onInfoWindowClick(Marker marker) {
                if (DefaultClusterRenderer.this.f349294x != null) {
                    DefaultClusterRenderer.this.f349294x.onClusterItemInfoWindowClick((ClusterItem) DefaultClusterRenderer.this.f349282l.get(marker));
                }
            }
        });
        this.f349276e.getMarkerCollection().mo178900a((TencentMap.InfoWindowAdapter) new TencentMap.InfoWindowAdapter() {
            public View getInfoWindow(Marker marker) {
                ClusterItem clusterItem = (ClusterItem) DefaultClusterRenderer.this.f349282l.get(marker);
                if (DefaultClusterRenderer.this.f349295y == null || clusterItem == null) {
                    return null;
                }
                return DefaultClusterRenderer.this.f349295y.getInfoWindow(clusterItem);
            }

            public void onInfoWindowDettached(Marker marker, View view) {
            }
        });
        this.f349276e.getClusterMarkerCollection().mo178902a((TencentMap.OnMarkerClickListener) new TencentMap.OnMarkerClickListener() {
            public boolean onMarkerClick(Marker marker) {
                Cluster cluster = (Cluster) DefaultClusterRenderer.this.f349286p.get(marker);
                return (DefaultClusterRenderer.this.f349290t == null || cluster == null || !DefaultClusterRenderer.this.f349290t.onClusterClick(cluster)) ? false : true;
            }
        });
        this.f349276e.getClusterMarkerCollection().mo178901a((TencentMap.OnInfoWindowClickListener) new TencentMap.OnInfoWindowClickListener() {
            public void onInfoWindowClick(Marker marker) {
                if (DefaultClusterRenderer.this.f349291u != null) {
                    DefaultClusterRenderer.this.f349291u.onClusterInfoWindowClick((Cluster) DefaultClusterRenderer.this.f349286p.get(marker));
                }
            }
        });
        this.f349276e.getClusterMarkerCollection().mo178900a((TencentMap.InfoWindowAdapter) new TencentMap.InfoWindowAdapter() {
            public View getInfoWindow(Marker marker) {
                Cluster cluster = (Cluster) DefaultClusterRenderer.this.f349286p.get(marker);
                if (DefaultClusterRenderer.this.f349292v == null || cluster == null) {
                    return null;
                }
                return DefaultClusterRenderer.this.f349292v.getInfoWindow(cluster);
            }

            public void onInfoWindowDettached(Marker marker, View view) {
            }
        });
    }

    public void onBeforeClusterItemRendered(T t, MarkerOptions markerOptions) {
    }

    public void onBeforeClusterRendered(Cluster<T> cluster, MarkerOptions markerOptions) {
        int bucket = getBucket(cluster);
        BitmapDescriptor bitmapDescriptor = this.f349281k.get(bucket);
        if (bitmapDescriptor == null) {
            this.f349279i.getPaint().setColor(getColor(bucket));
            bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(this.f349275d.makeIcon(mo179002a(bucket)));
            this.f349281k.put(bucket, bitmapDescriptor);
        }
        markerOptions.icon(bitmapDescriptor);
    }

    public void onClustersChanged(Set<? extends Cluster<T>> set) {
        this.f349289s.queue(set);
    }

    public void onRemove() {
        this.f349276e.getMarkerCollection().mo178902a((TencentMap.OnMarkerClickListener) null);
        this.f349276e.getClusterMarkerCollection().mo178902a((TencentMap.OnMarkerClickListener) null);
    }

    public void setBuckets(int[] iArr) {
        this.f349278h = iArr;
    }

    public void setInfoWindowAdapter(ClusterManager.ClusterInfoWindowAdapter clusterInfoWindowAdapter) {
        this.f349292v = clusterInfoWindowAdapter;
    }

    public void setItemInfoWindowAdapter(ClusterManager.ClusterItemInfoWindowAdapter clusterItemInfoWindowAdapter) {
        this.f349295y = clusterItemInfoWindowAdapter;
    }

    public void setMinClusterSize(int i) {
        this.f349283m = i;
        ClusterManager<T> clusterManager = this.f349276e;
        if (clusterManager != null) {
            this.f349285o = true;
            clusterManager.cluster();
        }
    }

    public void setOnClusterClickListener(ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
        this.f349290t = onClusterClickListener;
    }

    public void setOnClusterInfoWindowClickListener(ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
        this.f349291u = onClusterInfoWindowClickListener;
    }

    public void setOnClusterItemClickListener(ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
        this.f349293w = onClusterItemClickListener;
    }

    public void setOnClusterItemInfoWindowClickListener(ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
        this.f349294x = onClusterItemInfoWindowClickListener;
    }

    /* renamed from: d */
    private LayerDrawable m164086d() {
        this.f349279i = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f349279i});
        int i = (int) (this.f349277f * 3.0f);
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    public Marker getMarker(Cluster<T> cluster) {
        return this.f349287q.get(cluster);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C116377b m164080b(List<C116377b> list, C116377b bVar, double d) {
        C116377b bVar2 = null;
        if (list != null && !list.isEmpty()) {
            double d2 = d * d;
            for (C116377b next : list) {
                double a = m164072a(next, bVar);
                if (a < d2) {
                    bVar2 = next;
                    d2 = a;
                }
            }
        }
        return bVar2;
    }

    /* renamed from: a */
    private C75247e m164075a(Context context) {
        C75247e eVar = new C75247e(context);
        eVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        eVar.setId(IconGenerator.SQUARE_TEXT_VIEW_ID);
        int i = (int) (this.f349277f * 12.0f);
        eVar.setPadding(i, i, i, i);
        return eVar;
    }

    /* renamed from: a */
    public String mo179002a(int i) {
        int[] iArr = this.f349278h;
        if (iArr == null) {
            return String.valueOf(i);
        }
        if (i < iArr[0]) {
            return String.valueOf(i);
        }
        return String.valueOf(i) + "+";
    }

    /* renamed from: a */
    public boolean mo179005a(Cluster<T> cluster) {
        return cluster.getSize() > this.f349283m;
    }

    /* renamed from: a */
    private static double m164072a(C116377b bVar, C116377b bVar2) {
        double d = bVar.f349207a;
        double d2 = bVar2.f349207a;
        double d3 = (d - d2) * (d - d2);
        double d4 = bVar.f349208b;
        double d5 = bVar2.f349208b;
        return d3 + ((d4 - d5) * (d4 - d5));
    }
}
