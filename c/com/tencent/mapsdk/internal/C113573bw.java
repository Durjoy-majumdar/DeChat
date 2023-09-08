package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import com.tencent.map.sdk.utilities.heatmap.Gradient;
import com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Tile;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;
import com.tencent.xweb.file.XVFSFile;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.bw */
public final class C113573bw extends HeatMapTileProvider {

    /* renamed from: a */
    public static final double f339881a = 1.0d;

    /* renamed from: b */
    private static final boolean f339882b = false;

    /* renamed from: c */
    private static final int f339883c = 256;

    /* renamed from: d */
    private static final int f339884d = 1280;

    /* renamed from: e */
    private static final int f339885e = 5;

    /* renamed from: f */
    private static final int f339886f = 11;

    /* renamed from: g */
    private static final int f339887g = 22;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final HeatMapTileProvider.OnHeatMapReadyListener f339888h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public HeatMapTileProvider.HeatTileGenerator f339889i;

    /* renamed from: j */
    private C113742fx<C113575bx> f339890j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Collection<C113575bx> f339891k;

    /* renamed from: l */
    private C113731fn f339892l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f339893m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Gradient f339894n;

    /* renamed from: o */
    private int[] f339895o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public double[] f339896p;

    /* renamed from: q */
    private double f339897q;

    /* renamed from: r */
    private double[] f339898r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f339899s;

    public C113573bw(HeatMapTileProvider.Builder builder) {
        this.f339891k = m156373d(builder.getData());
        this.f339893m = builder.getRadius();
        this.f339894n = builder.getGradient();
        this.f339897q = builder.getOpacity();
        this.f339888h = builder.getReadyListener();
        this.f339889i = builder.getHeatTileGenerator();
        if (this.f339891k != null) {
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
                /* renamed from: a */
                private Boolean m156378a() {
                    if (C113573bw.this.f339899s) {
                        return Boolean.FALSE;
                    }
                    if (C113573bw.this.f339889i != null) {
                        C113573bw bwVar = C113573bw.this;
                        double[] unused = bwVar.f339896p = bwVar.f339889i.generateKernel(C113573bw.this.f339893m);
                    } else {
                        C113573bw bwVar2 = C113573bw.this;
                        double[] unused2 = bwVar2.f339896p = C113573bw.m156365a(bwVar2.f339893m, ((double) C113573bw.this.f339893m) / 3.0d);
                    }
                    C113573bw bwVar3 = C113573bw.this;
                    bwVar3.setGradient(bwVar3.f339894n);
                    C113573bw bwVar4 = C113573bw.this;
                    bwVar4.mo171871a((Collection<C113575bx>) bwVar4.f339891k);
                    boolean unused3 = C113573bw.this.f339899s = true;
                    if (C113573bw.this.f339888h != null) {
                        C113573bw.this.f339888h.onHeatMapReady();
                    }
                    return Boolean.TRUE;
                }

                public final /* synthetic */ Object call() {
                    if (C113573bw.this.f339899s) {
                        return Boolean.FALSE;
                    }
                    if (C113573bw.this.f339889i != null) {
                        C113573bw bwVar = C113573bw.this;
                        double[] unused = bwVar.f339896p = bwVar.f339889i.generateKernel(C113573bw.this.f339893m);
                    } else {
                        C113573bw bwVar2 = C113573bw.this;
                        double[] unused2 = bwVar2.f339896p = C113573bw.m156365a(bwVar2.f339893m, ((double) C113573bw.this.f339893m) / 3.0d);
                    }
                    C113573bw bwVar3 = C113573bw.this;
                    bwVar3.setGradient(bwVar3.f339894n);
                    C113573bw bwVar4 = C113573bw.this;
                    bwVar4.mo171871a((Collection<C113575bx>) bwVar4.f339891k);
                    boolean unused3 = C113573bw.this.f339899s = true;
                    if (C113573bw.this.f339888h != null) {
                        C113573bw.this.f339888h.onHeatMapReady();
                    }
                    return Boolean.TRUE;
                }
            }).mo172279a(Boolean.FALSE);
        }
    }

    public final Tile getTile(int i, int i2, int i3) {
        double d;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (!this.f339899s) {
            C113889km.m157553d("TileOverlay", "热力图未初始化完成，返回空瓦块");
            return TileProvider.NO_TILE;
        }
        double pow = 1.0d / Math.pow(2.0d, (double) i6);
        int i7 = this.f339893m;
        double d2 = (((double) i7) * pow) / 256.0d;
        double d3 = (((double) i4) * pow) - d2;
        double d4 = (((double) (i4 + 1)) * pow) + d2;
        double d5 = (((double) i5) * pow) - d2;
        double d6 = ((2.0d * d2) + pow) / ((double) ((i7 * 2) + 256));
        double d7 = (((double) (i5 + 1)) * pow) + d2;
        Collection<C113575bx> arrayList = new ArrayList<>();
        if (d3 < 0.0d) {
            arrayList = this.f339890j.mo172116a(new C113731fn(d3 + 1.0d, 1.0d, d5, d7));
            d = -1.0d;
        } else if (d4 > 1.0d) {
            arrayList = this.f339890j.mo172116a(new C113731fn(0.0d, d4 - 1.0d, d5, d7));
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        C113731fn fnVar = new C113731fn(d3, d4, d5, d7);
        C113731fn fnVar2 = this.f339892l;
        double d8 = d5;
        if (!fnVar.mo172082a(new C113731fn(fnVar2.f340209a - d2, fnVar2.f340211c + d2, fnVar2.f340210b - d2, fnVar2.f340212d + d2))) {
            C113889km.m157553d("TileOverlay", "热力图超出有效边界，返回空瓦块-" + i4 + XVFSFile.PATH_SEPARATOR + i5 + XVFSFile.PATH_SEPARATOR + i6);
            return TileProvider.NO_TILE;
        }
        Collection<C113575bx> a = this.f339890j.mo172116a(fnVar);
        if (a.isEmpty()) {
            C113889km.m157553d("TileOverlay", "热力图没有热力数据，返回空瓦块-" + i4 + XVFSFile.PATH_SEPARATOR + i5 + XVFSFile.PATH_SEPARATOR + i6);
            return TileProvider.NO_TILE;
        }
        int i8 = this.f339893m;
        int[] iArr = new int[2];
        iArr[1] = (i8 * 2) + 256;
        iArr[0] = (i8 * 2) + 256;
        double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr);
        for (C113575bx next : a) {
            C113732fo foVar = next.f339903b;
            int i9 = (int) ((foVar.f340216b - d8) / d6);
            double[] dArr2 = dArr[(int) ((foVar.f340215a - d3) / d6)];
            dArr2[i9] = dArr2[i9] + next.f339904c;
        }
        for (C113575bx next2 : arrayList) {
            C113732fo foVar2 = next2.f339903b;
            int i15 = (int) ((foVar2.f340216b - d8) / d6);
            double[] dArr3 = dArr[(int) (((foVar2.f340215a + d) - d3) / d6)];
            dArr3[i15] = dArr3[i15] + next2.f339904c;
        }
        Bitmap a2 = m156360a(m156367a(dArr, this.f339896p), this.f339895o, this.f339898r[i6]);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(256, 256, byteArrayOutputStream.toByteArray());
    }

    public final void setData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng bxVar : collection) {
            arrayList.add(new C113575bx(bxVar));
        }
        mo171871a((Collection<C113575bx>) arrayList);
    }

    public final void setGradient(Gradient gradient) {
        this.f339894n = gradient;
        HeatMapTileProvider.HeatTileGenerator heatTileGenerator = this.f339889i;
        if (heatTileGenerator != null) {
            this.f339895o = heatTileGenerator.generateColorMap(this.f339897q);
        } else {
            this.f339895o = gradient.generateColorMap(this.f339897q);
        }
    }

    public final void setHeatTileGenerator(HeatMapTileProvider.HeatTileGenerator heatTileGenerator) {
        this.f339889i = heatTileGenerator;
        if (heatTileGenerator != null) {
            this.f339896p = heatTileGenerator.generateKernel(this.f339893m);
            this.f339895o = this.f339889i.generateColorMap(this.f339897q);
        }
    }

    public final void setOpacity(double d) {
        this.f339897q = d;
        setGradient(this.f339894n);
    }

    public final void setRadius(int i) {
        if (i > 0) {
            this.f339893m = i;
            HeatMapTileProvider.HeatTileGenerator heatTileGenerator = this.f339889i;
            if (heatTileGenerator != null) {
                this.f339896p = heatTileGenerator.generateKernel(i);
            } else {
                this.f339896p = m156365a(i, ((double) i) / 3.0d);
            }
            this.f339898r = m156364a(this.f339893m);
        }
    }

    public final <T extends WeightedLatLng> void setWeightedData(Collection<T> collection) {
        mo171871a(m156373d(collection));
    }

    /* renamed from: b */
    private static C113731fn m156369b(Collection<C113575bx> collection) {
        Iterator<C113575bx> it = collection.iterator();
        C113732fo foVar = it.next().f339903b;
        double d = foVar.f340215a;
        double d2 = d;
        double d3 = foVar.f340216b;
        double d4 = d3;
        while (it.hasNext()) {
            C113732fo foVar2 = it.next().f339903b;
            double d5 = foVar2.f340215a;
            double d6 = foVar2.f340216b;
            if (d5 < d) {
                d = d5;
            }
            if (d5 > d2) {
                d2 = d5;
            }
            if (d6 < d3) {
                d3 = d6;
            }
            if (d6 > d4) {
                d4 = d6;
            }
        }
        return new C113731fn(d, d2, d3, d4);
    }

    /* renamed from: c */
    private static Collection<C113575bx> m156371c(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        for (LatLng bxVar : collection) {
            arrayList.add(new C113575bx(bxVar));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static <T extends WeightedLatLng> Collection<C113575bx> m156373d(Collection<T> collection) {
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            arrayList.add(new C113575bx(t.getPoint(), t.getIntensity()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m156362a() {
        if (this.f339891k != null) {
            C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
                /* renamed from: a */
                private Boolean m156378a() {
                    if (C113573bw.this.f339899s) {
                        return Boolean.FALSE;
                    }
                    if (C113573bw.this.f339889i != null) {
                        C113573bw bwVar = C113573bw.this;
                        double[] unused = bwVar.f339896p = bwVar.f339889i.generateKernel(C113573bw.this.f339893m);
                    } else {
                        C113573bw bwVar2 = C113573bw.this;
                        double[] unused2 = bwVar2.f339896p = C113573bw.m156365a(bwVar2.f339893m, ((double) C113573bw.this.f339893m) / 3.0d);
                    }
                    C113573bw bwVar3 = C113573bw.this;
                    bwVar3.setGradient(bwVar3.f339894n);
                    C113573bw bwVar4 = C113573bw.this;
                    bwVar4.mo171871a((Collection<C113575bx>) bwVar4.f339891k);
                    boolean unused3 = C113573bw.this.f339899s = true;
                    if (C113573bw.this.f339888h != null) {
                        C113573bw.this.f339888h.onHeatMapReady();
                    }
                    return Boolean.TRUE;
                }

                public final /* synthetic */ Object call() {
                    if (C113573bw.this.f339899s) {
                        return Boolean.FALSE;
                    }
                    if (C113573bw.this.f339889i != null) {
                        C113573bw bwVar = C113573bw.this;
                        double[] unused = bwVar.f339896p = bwVar.f339889i.generateKernel(C113573bw.this.f339893m);
                    } else {
                        C113573bw bwVar2 = C113573bw.this;
                        double[] unused2 = bwVar2.f339896p = C113573bw.m156365a(bwVar2.f339893m, ((double) C113573bw.this.f339893m) / 3.0d);
                    }
                    C113573bw bwVar3 = C113573bw.this;
                    bwVar3.setGradient(bwVar3.f339894n);
                    C113573bw bwVar4 = C113573bw.this;
                    bwVar4.mo171871a((Collection<C113575bx>) bwVar4.f339891k);
                    boolean unused3 = C113573bw.this.f339899s = true;
                    if (C113573bw.this.f339888h != null) {
                        C113573bw.this.f339888h.onHeatMapReady();
                    }
                    return Boolean.TRUE;
                }
            }).mo172279a(Boolean.FALSE);
        }
    }

    /* renamed from: a */
    public final void mo171871a(Collection<C113575bx> collection) {
        this.f339891k = collection;
        if (!collection.isEmpty()) {
            C113731fn b = m156369b(this.f339891k);
            this.f339892l = b;
            this.f339890j = new C113742fx<>(b);
            for (C113575bx a : this.f339891k) {
                this.f339890j.mo172117a(a);
            }
            this.f339898r = m156364a(this.f339893m);
            return;
        }
        throw new IllegalArgumentException("No input points.");
    }

    /* renamed from: a */
    private double[] m156364a(int i) {
        int i2;
        double[] dArr = new double[22];
        int i3 = 5;
        while (true) {
            if (i3 >= 11) {
                break;
            }
            dArr[i3] = m156359a(this.f339891k, this.f339892l, i, (int) (Math.pow(2.0d, (double) (i3 - 3)) * 1280.0d));
            if (i3 == 5) {
                for (int i4 = 0; i4 < i3; i4++) {
                    dArr[i4] = dArr[i3];
                }
            }
            i3++;
        }
        for (i2 = 11; i2 < 22; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    /* renamed from: a */
    private static Tile m156361a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(256, 256, byteArrayOutputStream.toByteArray());
    }

    /* renamed from: a */
    public static double[] m156365a(int i, double d) {
        double[] dArr = new double[((i * 2) + 1)];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = Math.exp(((double) ((-i2) * i2)) / ((2.0d * d) * d));
        }
        return dArr;
    }

    /* renamed from: a */
    private static double[][] m156367a(double[][] dArr, double[] dArr2) {
        double[][] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int floor = (int) Math.floor(((double) dArr4.length) / 2.0d);
        int length = dArr3.length;
        int i = length - (floor * 2);
        int i2 = 1;
        int i3 = (floor + i) - 1;
        int[] iArr = new int[2];
        iArr[1] = length;
        iArr[0] = length;
        double[][] dArr5 = (double[][]) Array.newInstance(Double.TYPE, iArr);
        int i4 = 0;
        while (true) {
            double d = 0.0d;
            if (i4 >= length) {
                break;
            }
            int i5 = 0;
            while (i5 < length) {
                double d2 = dArr3[i4][i5];
                if (d2 != d) {
                    int i6 = i4 + floor;
                    if (i3 < i6) {
                        i6 = i3;
                    }
                    int i7 = i6 + 1;
                    int i8 = i4 - floor;
                    for (int i9 = floor > i8 ? floor : i8; i9 < i7; i9++) {
                        double[] dArr6 = dArr5[i9];
                        dArr6[i5] = dArr6[i5] + (dArr4[i9 - i8] * d2);
                    }
                }
                i5++;
                d = 0.0d;
            }
            i4++;
        }
        int[] iArr2 = new int[2];
        iArr2[1] = i;
        iArr2[0] = i;
        double[][] dArr7 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
        int i15 = floor;
        while (i15 < i3 + 1) {
            int i16 = 0;
            while (i16 < length) {
                double d3 = dArr5[i15][i16];
                if (d3 != 0.0d) {
                    int i17 = i16 + floor;
                    if (i3 < i17) {
                        i17 = i3;
                    }
                    int i18 = i17 + i2;
                    int i19 = i16 - floor;
                    for (int i25 = floor > i19 ? floor : i19; i25 < i18; i25++) {
                        double[] dArr8 = dArr7[i15 - floor];
                        int i26 = i25 - floor;
                        dArr8[i26] = dArr8[i26] + (dArr4[i25 - i19] * d3);
                    }
                }
                i16++;
                i2 = 1;
            }
            i15++;
            i2 = 1;
        }
        return dArr7;
    }

    /* renamed from: a */
    private static Bitmap m156360a(double[][] dArr, int[] iArr, double d) {
        double[][] dArr2 = dArr;
        int[] iArr2 = iArr;
        int i = iArr2[iArr2.length - 1];
        double length = ((double) (iArr2.length - 1)) / d;
        int length2 = dArr2.length;
        int[] iArr3 = new int[(length2 * length2)];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d2 = dArr2[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d2 * length);
                if (d2 == 0.0d) {
                    iArr3[i4] = 0;
                } else if (i5 < iArr2.length) {
                    iArr3[i4] = iArr2[i5];
                } else {
                    iArr3[i4] = i;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr3, 0, length2, 0, 0, length2, length2);
        return createBitmap;
    }

    /* renamed from: a */
    private static double m156359a(Collection<C113575bx> collection, C113731fn fnVar, int i, int i2) {
        C113731fn fnVar2 = fnVar;
        double d = fnVar2.f340209a;
        double d2 = fnVar2.f340211c;
        double d3 = fnVar2.f340210b;
        double d4 = d2 - d;
        double d5 = fnVar2.f340212d - d3;
        if (d4 <= d5) {
            d4 = d5;
        }
        double d6 = ((double) ((int) (((double) (i2 / (i * 2))) + 0.5d))) / d4;
        HashMap hashMap = new HashMap();
        double d7 = 0.0d;
        for (C113575bx next : collection) {
            C113732fo foVar = next.f339903b;
            double d8 = foVar.f340215a;
            double d9 = foVar.f340216b;
            int i3 = (int) ((d8 - d) * d6);
            int i4 = (int) ((d9 - d3) * d6);
            Map map = (Map) hashMap.get(Integer.valueOf(i3));
            if (map == null) {
                map = new HashMap();
                hashMap.put(Integer.valueOf(i3), map);
            }
            Double d15 = (Double) map.get(Integer.valueOf(i4));
            if (d15 == null) {
                d15 = Double.valueOf(0.0d);
            }
            Double valueOf = Double.valueOf(d15.doubleValue() + next.f339904c);
            map.put(Integer.valueOf(i4), valueOf);
            if (valueOf.doubleValue() > d7) {
                d7 = valueOf.doubleValue();
            }
        }
        return d7;
    }
}
