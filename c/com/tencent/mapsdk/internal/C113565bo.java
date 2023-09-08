package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.map.sdk.comps.offlinemap.OfflineMapComponent;
import com.tencent.mapsdk.core.MapDelegate;
import com.tencent.mapsdk.internal.C113728fm;
import com.tencent.mapsdk.internal.C113749ge;
import com.tencent.tencentmap.mapsdk.maps.TencentMapComponent;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.TencentMapProtocol;
import com.tencent.tencentmap.mapsdk.maps.TencentMapResource;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.MapViewType;
import com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.mapsdk.internal.bo */
public abstract class C113565bo implements TencentMapContext {

    /* renamed from: g */
    private static final Map<Class<? extends TencentMapComponent.Component>, TencentMapComponent.Component> f339853g = new ConcurrentHashMap();

    /* renamed from: h */
    private static final Set<C113566a> f339854h;

    /* renamed from: i */
    private static final String f339855i = "map-context.cache";

    /* renamed from: j */
    private static final String f339856j = "navi_marker_location.png";

    /* renamed from: k */
    private static final String f339857k = "color_texture_flat_style.png";

    /* renamed from: a */
    public final TencentMapOptions f339858a;

    /* renamed from: b */
    public final C113568bp f339859b;

    /* renamed from: c */
    public C113749ge f339860c;

    /* renamed from: d */
    public C113792gv f339861d;

    /* renamed from: e */
    public boolean f339862e = false;

    /* renamed from: f */
    public volatile boolean f339863f = true;

    /* renamed from: l */
    private final Context f339864l;

    /* renamed from: m */
    private C113959ml f339865m;

    /* renamed from: com.tencent.mapsdk.internal.bo$a */
    public static class C113566a {

        /* renamed from: a */
        public Class<? extends TencentMapComponent.Component> f339866a;

        /* renamed from: b */
        public Class<? extends TencentMapComponent.Component> f339867b;

        public C113566a(Class<? extends TencentMapComponent.Component> cls, Class<? extends TencentMapComponent.Component> cls2) {
            this.f339866a = cls;
            this.f339867b = cls2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C113566a.class == obj.getClass()) {
                C113566a aVar = (C113566a) obj;
                Class<? extends TencentMapComponent.Component> cls = this.f339866a;
                if (cls == null ? aVar.f339866a != null : !cls.equals(aVar.f339866a)) {
                    return false;
                }
                Class<? extends TencentMapComponent.Component> cls2 = this.f339867b;
                Class<? extends TencentMapComponent.Component> cls3 = aVar.f339867b;
                if (cls2 != null) {
                    return cls2.equals(cls3);
                }
                if (cls3 == null) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Class<? extends TencentMapComponent.Component> cls = this.f339866a;
            int i = 0;
            int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
            Class<? extends TencentMapComponent.Component> cls2 = this.f339867b;
            if (cls2 != null) {
                i = cls2.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.bo$b */
    public static class C113567b {

        /* renamed from: a */
        public String f339868a = C113798hb.m157068a();

        /* renamed from: b */
        public String f339869b = C113798hb.m157095l();

        /* renamed from: c */
        public String f339870c;

        /* renamed from: d */
        public String f339871d;

        /* renamed from: e */
        public String f339872e = C113798hb.m157096m();

        /* renamed from: f */
        public String f339873f = "undefined";

        public C113567b(TencentMapOptions tencentMapOptions) {
            if (tencentMapOptions != null) {
                if (!TextUtils.isEmpty(tencentMapOptions.getMapKey())) {
                    this.f339868a = tencentMapOptions.getMapKey();
                }
                if (!TextUtils.isEmpty(tencentMapOptions.getSubKey())) {
                    this.f339870c = tencentMapOptions.getSubKey();
                }
                if (!TextUtils.isEmpty(tencentMapOptions.getSubId())) {
                    this.f339871d = tencentMapOptions.getSubId();
                }
                this.f339873f = tencentMapOptions.getCustomUserId();
            }
        }

        /* renamed from: d */
        private String m156318d() {
            return this.f339868a;
        }

        /* renamed from: e */
        private String m156319e() {
            return this.f339869b;
        }

        /* renamed from: f */
        private String m156320f() {
            return this.f339870c;
        }

        /* renamed from: g */
        private String m156321g() {
            return this.f339871d;
        }

        /* renamed from: h */
        private String m156322h() {
            return this.f339872e;
        }

        /* renamed from: i */
        private String m156323i() {
            return this.f339873f;
        }

        /* renamed from: j */
        private String m156324j() {
            return this.f339868a + "-" + this.f339869b + "-" + this.f339870c + "-" + this.f339871d;
        }

        /* renamed from: k */
        private String m156325k() {
            return C113904kw.m157758a(mo171816a());
        }

        /* renamed from: a */
        public final String mo171816a() {
            return this.f339872e + "-" + this.f339868a + "-" + this.f339869b + "-" + this.f339870c + "-" + this.f339871d;
        }

        /* renamed from: b */
        public final String mo171817b() {
            return TextUtils.isEmpty(this.f339870c) ? this.f339868a : this.f339870c;
        }

        /* renamed from: c */
        public final String mo171818c() {
            return C113904kw.m157758a(this.f339868a + "-" + this.f339869b + "-" + this.f339870c + "-" + this.f339871d);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f339854h = hashSet;
        hashSet.add(new C113566a(TencentMapProtocol.class, C113601cl.class));
        hashSet.add(new C113566a(OfflineMapComponent.class, C113585cb.class));
    }

    public C113565bo(Context context, TencentMapOptions tencentMapOptions, C113568bp bpVar) {
        this.f339864l = context.getApplicationContext();
        this.f339858a = tencentMapOptions;
        this.f339859b = bpVar;
        BitmapDescriptorFactory.attachMapContext(this);
        C113956mi.m157949a(tencentMapOptions);
    }

    /* renamed from: a */
    private void mo171633a() {
        C113749ge geVar = new C113749ge(this);
        this.f339860c = geVar;
        if (geVar.f340329a == 0) {
            geVar.mo172125a((Runnable) new Runnable(new C113749ge.C113755a<byte[]>() {
                /* renamed from: a */
                public final /* synthetic */ void mo172128a(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null && bArr.length > 0) {
                        C113749ge.this.mo172126a(bArr, (C113755a<Boolean>) new C113755a<Boolean>() {
                            /* renamed from: a */
                            public final /* synthetic */ void mo172128a(Object obj) {
                                C113749ge.m156931a(C113749ge.this, ((Boolean) obj).booleanValue());
                            }

                            /* renamed from: a */
                            private void m156949a(Boolean bool) {
                                C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                            }
                        });
                    }
                }

                /* renamed from: a */
                private void m156947a(byte[] bArr) {
                    if (bArr != null && bArr.length > 0) {
                        C113749ge.this.mo172126a(bArr, (C113755a<Boolean>) new C113755a<Boolean>() {
                            /* renamed from: a */
                            public final /* synthetic */ void mo172128a(Object obj) {
                                C113749ge.m156931a(C113749ge.this, ((Boolean) obj).booleanValue());
                            }

                            /* renamed from: a */
                            private void m156949a(Boolean bool) {
                                C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                            }
                        });
                    }
                }
            }) {
                public final void run() {
                    C113757c cVar = C113757c.READ;
                    C113759e a = C113759e.m156957a(cVar);
                    a.f340360a = C113756b.START;
                    File file = C113749ge.this.f340334f;
                    a.f340364e = file;
                    boolean exists = file.exists();
                    boolean z = false;
                    if (!exists) {
                        C113759e a2 = C113759e.m156957a(cVar);
                        a2.f340360a = C113756b.END;
                        a2.f340364e = C113749ge.this.f340334f;
                        a2.f340362c = false;
                        C113755a aVar = r0;
                        if (aVar != null) {
                            aVar.mo172128a(null);
                            return;
                        }
                        return;
                    }
                    C113759e a3 = C113759e.m156957a(cVar);
                    a3.f340360a = C113756b.PROCESSING;
                    File file2 = C113749ge.this.f340334f;
                    a3.f340364e = file2;
                    byte[] c = C113884kf.m157503c(file2);
                    C113759e a4 = C113759e.m156957a(cVar);
                    a4.f340360a = C113756b.END;
                    a4.f340364e = C113749ge.this.f340334f;
                    if (c != null) {
                        z = true;
                    }
                    a4.f340362c = z;
                    C113755a aVar2 = r0;
                    if (aVar2 != null) {
                        aVar2.mo172128a(c);
                    }
                }
            });
        }
        geVar.f340329a++;
        this.f339861d = C113749ge.m156926a(System.currentTimeMillis());
    }

    /* renamed from: b */
    private void mo172450b(boolean z) {
        this.f339863f = z;
    }

    /* renamed from: c */
    private C113792gv mo171635c() {
        return this.f339861d;
    }

    /* renamed from: d */
    private boolean mo171636d() {
        return this.f339862e;
    }

    /* renamed from: e */
    private boolean mo171637e() {
        return this.f339863f;
    }

    /* renamed from: f */
    private void mo171638f() {
        C113749ge geVar = this.f339860c;
        C113792gv gvVar = this.f339861d;
        gvVar.f340427b = System.currentTimeMillis() - gvVar.f340426a;
        geVar.f340329a--;
        synchronized (geVar) {
            geVar.f340330b.add(gvVar);
        }
        if (geVar.f340329a == 0 && !geVar.f340330b.isEmpty()) {
            geVar.mo172126a(C113749ge.m156935a(geVar.f340330b, (C113749ge.C113759e) null), (C113749ge.C113755a<Boolean>) new C113749ge.C113755a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ void mo172128a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                    if (bool.booleanValue()) {
                        C113749ge.this.f340330b.clear();
                    }
                }

                /* renamed from: a */
                private void m156951a(Boolean bool) {
                    C113749ge.m156931a(C113749ge.this, bool.booleanValue());
                    if (bool.booleanValue()) {
                        C113749ge.this.f340330b.clear();
                    }
                }
            });
        }
        Bundle bundle = new Bundle();
        if (bundle.size() > 0) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            C113884kf.m157491a(C113884kf.m157494b(C113884kf.f340711d, f339855i), obtain.marshall());
            obtain.recycle();
        }
        mo171808u();
        BitmapDescriptorFactory.detachMapContext(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void mo171639g() {
        /*
            r6 = this;
            java.util.Map r0 = r6.mo171807s()
            if (r0 == 0) goto L_0x0031
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.Set<com.tencent.mapsdk.internal.bo$a> r2 = f339854h
            com.tencent.mapsdk.internal.bo$a r3 = new com.tencent.mapsdk.internal.bo$a
            java.lang.Object r4 = r1.getKey()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r1 = r1.getValue()
            java.lang.Class r1 = (java.lang.Class) r1
            r3.<init>(r4, r1)
            r2.add(r3)
            goto L_0x000e
        L_0x0031:
            java.util.Set<com.tencent.mapsdk.internal.bo$a> r0 = f339854h
            java.util.Iterator r0 = r0.iterator()
        L_0x0037:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r0.next()
            com.tencent.mapsdk.internal.bo$a r1 = (com.tencent.mapsdk.internal.C113565bo.C113566a) r1
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component> r2 = r1.f339866a
            java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component> r3 = f339853g
            java.lang.Object r4 = r3.get(r2)
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component r4 = (com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component) r4
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component> r1 = r1.f339867b
            if (r4 != 0) goto L_0x0074
            if (r1 == 0) goto L_0x0074
            boolean r5 = r2.isAssignableFrom(r1)
            if (r5 == 0) goto L_0x0074
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r1 = com.tencent.mapsdk.internal.C113800hd.m157128a(r1, (java.lang.Object[]) r4)
            r4 = r1
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component r4 = (com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component) r4
            boolean r1 = r4 instanceof com.tencent.mapsdk.internal.C113564bn
            if (r1 == 0) goto L_0x0071
            r1 = r4
            com.tencent.mapsdk.internal.bn r1 = (com.tencent.mapsdk.internal.C113564bn) r1
            android.content.Context r5 = r6.getContext()
            r1.mo171779a((android.content.Context) r5)
        L_0x0071:
            r3.put(r2, r4)
        L_0x0074:
            boolean r1 = r4 instanceof com.tencent.mapsdk.internal.C113564bn
            if (r1 == 0) goto L_0x0037
            com.tencent.mapsdk.internal.bn r4 = (com.tencent.mapsdk.internal.C113564bn) r4
            r4.mo171780a((com.tencent.mapsdk.internal.C113565bo) r6)
            goto L_0x0037
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113565bo.mo171639g():void");
    }

    /* renamed from: h */
    private TencentMapProtocol mo171640h() {
        return (TencentMapProtocol) getMapComponent(TencentMapProtocol.class);
    }

    /* renamed from: i */
    private TencentMapOptions mo171641i() {
        return this.f339858a;
    }

    /* renamed from: j */
    private File mo171642j() {
        return mo171809v().mo172405c();
    }

    /* renamed from: k */
    private OverSeaSource mo171643k() {
        return this.f339858a.getOverSeaSource();
    }

    /* renamed from: m */
    private MapViewType mo171645m() {
        return this.f339858a.getMapViewType();
    }

    /* renamed from: t */
    public static Bundle m156304t() {
        byte[] c;
        File file = new File(C113884kf.f340711d, f339855i);
        if (!file.exists() || (c = C113884kf.m157503c(file)) == null || c.length <= 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(c, 0, c.length);
        Bundle bundle = new Bundle();
        bundle.readFromParcel(obtain);
        C113884kf.m157500b(file);
        obtain.recycle();
        return bundle;
    }

    /* renamed from: A */
    public abstract C113571bt mo171786A();

    public BitmapDescriptor createBitmapDescriptor(int i, int i2) {
        C113728fm fmVar = new C113728fm(getContext(), i2);
        fmVar.f340184a = i;
        return new BitmapDescriptor(fmVar);
    }

    public Context getContext() {
        return this.f339864l;
    }

    public MyLocationStyle getDefaultMyLocationStyle() {
        MyLocationStyle myLocationStyle = new MyLocationStyle();
        myLocationStyle.icon(createBitmapDescriptor(f339856j, 2));
        return myLocationStyle;
    }

    public <T extends TencentMapComponent.Component> T getMapComponent(Class<T> cls) {
        T t = (TencentMapComponent.Component) f339853g.get(cls);
        if (t instanceof C113564bn) {
            ((C113564bn) t).mo171781a(this, (Bundle) null);
        }
        return t;
    }

    public TencentMapComponent getMapComponent() {
        return this;
    }

    public TencentMapResource getMapResource() {
        return this;
    }

    public TencentMapServiceProtocol getMapServiceProtocol() {
        return (TencentMapServiceProtocol) getMapComponent(TencentMapProtocol.class);
    }

    public int getScreenPixels() {
        return C113798hb.m157089f();
    }

    public Typeface getTypeface() {
        return this.f339858a.getTypeface();
    }

    /* renamed from: l */
    public abstract boolean mo171803l();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo171804p() {
        /*
            r6 = this;
            com.tencent.mapsdk.internal.bo$b r0 = r6.mo171810w()
            android.content.Context r1 = r6.f339864l
            java.lang.String r2 = r0.f339868a
            java.lang.String r3 = r0.f339869b
            java.lang.String r0 = r0.f339873f
            com.tencent.mapsdk.internal.C113798hb.m157073a(r1, r2, r3, r0)
            com.tencent.mapsdk.internal.ge r0 = new com.tencent.mapsdk.internal.ge
            r0.<init>(r6)
            r6.f339860c = r0
            int r1 = r0.f340329a
            if (r1 != 0) goto L_0x0027
            com.tencent.mapsdk.internal.ge$2 r1 = new com.tencent.mapsdk.internal.ge$2
            r1.<init>()
            com.tencent.mapsdk.internal.ge$1 r2 = new com.tencent.mapsdk.internal.ge$1
            r2.<init>(r1)
            r0.mo172125a((java.lang.Runnable) r2)
        L_0x0027:
            int r1 = r0.f340329a
            int r1 = r1 + 1
            r0.f340329a = r1
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mapsdk.internal.ge$c r2 = com.tencent.mapsdk.internal.C113749ge.C113757c.CREATE
            com.tencent.mapsdk.internal.ge$e r2 = com.tencent.mapsdk.internal.C113749ge.C113759e.m156957a((com.tencent.mapsdk.internal.C113749ge.C113757c) r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2.f340364e = r3
            com.tencent.mapsdk.internal.gv r2 = new com.tencent.mapsdk.internal.gv
            r2.<init>(r0)
            r6.f339861d = r2
            java.util.Map r0 = r6.mo171807s()
            if (r0 == 0) goto L_0x0075
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0052:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.util.Set<com.tencent.mapsdk.internal.bo$a> r2 = f339854h
            com.tencent.mapsdk.internal.bo$a r3 = new com.tencent.mapsdk.internal.bo$a
            java.lang.Object r4 = r1.getKey()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r1 = r1.getValue()
            java.lang.Class r1 = (java.lang.Class) r1
            r3.<init>(r4, r1)
            r2.add(r3)
            goto L_0x0052
        L_0x0075:
            java.util.Set<com.tencent.mapsdk.internal.bo$a> r0 = f339854h
            java.util.Iterator r0 = r0.iterator()
        L_0x007b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r0.next()
            com.tencent.mapsdk.internal.bo$a r1 = (com.tencent.mapsdk.internal.C113565bo.C113566a) r1
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component> r2 = r1.f339866a
            java.util.Map<java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component>, com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component> r3 = f339853g
            java.lang.Object r4 = r3.get(r2)
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component r4 = (com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component) r4
            java.lang.Class<? extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component> r1 = r1.f339867b
            if (r4 != 0) goto L_0x00b8
            if (r1 == 0) goto L_0x00b8
            boolean r5 = r2.isAssignableFrom(r1)
            if (r5 == 0) goto L_0x00b8
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r1 = com.tencent.mapsdk.internal.C113800hd.m157128a(r1, (java.lang.Object[]) r4)
            r4 = r1
            com.tencent.tencentmap.mapsdk.maps.TencentMapComponent$Component r4 = (com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component) r4
            boolean r1 = r4 instanceof com.tencent.mapsdk.internal.C113564bn
            if (r1 == 0) goto L_0x00b5
            r1 = r4
            com.tencent.mapsdk.internal.bn r1 = (com.tencent.mapsdk.internal.C113564bn) r1
            android.content.Context r5 = r6.getContext()
            r1.mo171779a((android.content.Context) r5)
        L_0x00b5:
            r3.put(r2, r4)
        L_0x00b8:
            boolean r1 = r4 instanceof com.tencent.mapsdk.internal.C113564bn
            if (r1 == 0) goto L_0x007b
            com.tencent.mapsdk.internal.bn r4 = (com.tencent.mapsdk.internal.C113564bn) r4
            r4.mo171780a((com.tencent.mapsdk.internal.C113565bo) r6)
            goto L_0x007b
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113565bo.mo171804p():void");
    }

    /* renamed from: q */
    public final C113604cn mo171805q() {
        TencentMapProtocol h = mo171640h();
        return h instanceof C113601cl ? ((C113601cl) h).mo171934d().f339971b : C113601cl.m156515e();
    }

    /* renamed from: r */
    public abstract void mo171806r();

    /* renamed from: s */
    public Map<Class<? extends TencentMapComponent.Component>, Class<? extends TencentMapComponent.Component>> mo171807s() {
        return null;
    }

    /* renamed from: u */
    public final void mo171808u() {
        for (Map.Entry next : f339853g.entrySet()) {
            TencentMapComponent.Component component = (TencentMapComponent.Component) next.getValue();
            if (component instanceof C113564bn) {
                C113564bn bnVar = (C113564bn) component;
                bnVar.mo171783b(this);
                if (bnVar.mo171785c_() == null) {
                    f339853g.remove(next.getKey());
                }
            }
        }
        C113798hb.m157099p();
    }

    /* renamed from: v */
    public final C113959ml mo171809v() {
        if (this.f339865m == null) {
            this.f339865m = C113959ml.m157965a(this.f339864l, this.f339858a);
        }
        return this.f339865m;
    }

    /* renamed from: w */
    public final C113567b mo171810w() {
        return new C113567b(this.f339858a);
    }

    /* renamed from: x */
    public abstract String mo171811x();

    /* renamed from: y */
    public abstract String mo171812y();

    /* renamed from: z */
    public abstract String mo171813z();

    /* renamed from: b */
    public final MapDelegate mo171787b() {
        return this.f339859b;
    }

    public BitmapDescriptor createBitmapDescriptor(String str, int i) {
        C113728fm fmVar = new C113728fm(getContext(), i);
        if (i == 2) {
            fmVar.f340185b = str;
            return new BitmapDescriptor(fmVar);
        } else if (i == 3) {
            fmVar.f340186c = str;
            return new BitmapDescriptor(fmVar);
        } else if (i == 4) {
            fmVar.f340187d = str;
            return new BitmapDescriptor(fmVar);
        } else if (i != 8) {
            return null;
        } else {
            fmVar.f340189f = str;
            return new BitmapDescriptor(fmVar);
        }
    }

    /* renamed from: a */
    private void mo172440a(boolean z) {
        this.f339862e = z;
    }

    /* renamed from: a */
    private static void m156291a(Bundle bundle) {
        if (bundle.size() > 0) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            C113884kf.m157491a(C113884kf.m157494b(C113884kf.f340711d, f339855i), obtain.marshall());
            obtain.recycle();
        }
    }

    /* renamed from: a */
    private <T extends TencentMapComponent.Component> T m156289a(Class<T> cls) {
        T t = (TencentMapComponent.Component) f339853g.get(cls);
        if (t instanceof C113564bn) {
            ((C113564bn) t).mo171781a(this, (Bundle) null);
        }
        return t;
    }

    public BitmapDescriptor createBitmapDescriptor(float f, int i) {
        C113728fm fmVar = new C113728fm(getContext(), i);
        fmVar.f340188e = f;
        return new BitmapDescriptor(fmVar);
    }

    public BitmapDescriptor createBitmapDescriptor(Parcelable parcelable, int i) {
        C113728fm fmVar = new C113728fm(getContext(), i);
        if (i == 9) {
            if (!(parcelable instanceof C113728fm.C113729a)) {
                return null;
            }
            fmVar.f340190g = (C113728fm.C113729a) parcelable;
            return new BitmapDescriptor(fmVar);
        } else if (i != 7 || !(parcelable instanceof Bitmap)) {
            return null;
        } else {
            return new BitmapDescriptor(fmVar.mo172066a((Bitmap) parcelable));
        }
    }

    public BitmapDescriptor createBitmapDescriptor(Bitmap bitmap, int i) {
        return new BitmapDescriptor(new C113728fm(getContext(), i).mo172066a(bitmap));
    }

    public BitmapDescriptor createBitmapDescriptor(Bitmap[] bitmapArr, int i) {
        C113728fm fmVar = new C113728fm(getContext(), i);
        fmVar.f340191h = bitmapArr;
        fmVar.getBitmap(fmVar.f340192i);
        return new BitmapDescriptor(fmVar);
    }

    public BitmapDescriptor createBitmapDescriptor(int i) {
        C113728fm fmVar = new C113728fm(getContext(), i);
        if (i == 5) {
            return new BitmapDescriptor(fmVar);
        }
        return null;
    }
}
