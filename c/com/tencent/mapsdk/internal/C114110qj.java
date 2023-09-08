package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.mapsdk.core.utils.cache.DiskCache;
import com.tencent.mapsdk.core.utils.cache.MemoryCache;
import com.tencent.mapsdk.internal.C113846jl;
import com.tencent.mapsdk.internal.C113934lj;
import com.tencent.tencentmap.mapsdk.maps.model.Tile;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;
import java.io.File;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.tencent.mapsdk.internal.qj */
public class C114110qj extends C114027oy implements TileOverlayCallback {

    /* renamed from: a */
    public static final String f341562a = ("%s" + File.separatorChar + "%d-%d-%d");

    /* renamed from: n */
    public static final String f341563n = "/tile/";

    /* renamed from: s */
    private static final String f341564s = "GLTileOverlay";

    /* renamed from: t */
    private static final boolean f341565t = false;

    /* renamed from: u */
    private static final long f341566u = 1024;

    /* renamed from: o */
    public int f341567o;

    /* renamed from: p */
    public C114117qo f341568p;

    /* renamed from: q */
    public TileOverlayOptions f341569q;

    /* renamed from: r */
    public C113846jl<C114114ql> f341570r;

    /* renamed from: v */
    private Map<String, Integer> f341571v = new Hashtable();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C113934lj f341572w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public BlockingQueue<Runnable> f341573x;

    /* renamed from: y */
    private final C113942lo f341574y = new C113942lo() {
        /* renamed from: b */
        public final void mo171886b(String str) {
            C113934lj a = C114110qj.this.f341572w;
            if (a != null) {
                C113934lj.C113938a aVar = a.f340793a.get(str);
                Runnable runnable = aVar != null ? aVar.f340807a : null;
                if (runnable != null) {
                    C114110qj.this.f341573x.remove(runnable);
                }
            }
        }
    };

    public C114110qj(C114117qo qoVar, TileOverlayOptions tileOverlayOptions) {
        super((C113532ba) qoVar.f341590h.f339859b);
        this.f341568p = qoVar;
        this.f341569q = tileOverlayOptions;
        int i = -1;
        if (tileOverlayOptions == null) {
            this.f341567o = -1;
            return;
        }
        this.f341570r = mo172015g();
        C114117qo qoVar2 = this.f341568p;
        boolean isBetterQuality = this.f341569q.isBetterQuality();
        if (qoVar2.f341588f != null) {
            C113896kq.m157668c(C0949kl.f2232b);
            i = qoVar2.f341588f.mo172896a((TileOverlayCallback) this, isBetterQuality);
        }
        this.f341567o = i;
        mo172716a(this.f341569q.getZIndex());
    }

    /* renamed from: i */
    private int m159180i() {
        return this.f341567o;
    }

    /* renamed from: t */
    private C114117qo m159181t() {
        return this.f341568p;
    }

    /* renamed from: u */
    private TileProvider m159182u() {
        return this.f341569q.getTileProvider();
    }

    /* renamed from: v */
    private C114116qn m159183v() {
        return new C114116qn(this.f341568p);
    }

    /* renamed from: w */
    private void m159184w() {
        C113846jl<C114114ql> jlVar = this.f341570r;
        if (jlVar != null) {
            if (jlVar instanceof C113852jo) {
                C113846jl a = ((C113852jo) jlVar).mo172236a(0);
                if (a instanceof MemoryCache) {
                    a.mo170953b();
                }
                C113846jl a2 = ((C113852jo) this.f341570r).mo172236a(1);
                if (a2 instanceof DiskCache) {
                    ((DiskCache) a2).mo170957f();
                }
            } else if (jlVar instanceof MemoryCache) {
                jlVar.mo170953b();
            }
            this.f341571v.clear();
        }
    }

    /* renamed from: b */
    public int mo172729b(int i) {
        return i + 100;
    }

    /* renamed from: d */
    public final synchronized C113934lj mo172012d() {
        if (this.f341572w == null) {
            C113934lj ljVar = new C113934lj();
            this.f341572w = ljVar;
            ljVar.mo172357a((C113933li) this.f341574y);
            ThreadPoolExecutor c = C113802hg.m157154c();
            this.f341573x = c.getQueue();
            this.f341572w.f340794b = c;
        }
        return this.f341572w;
    }

    /* renamed from: e */
    public final void mo172013e() {
        if (this.f341568p != null && this.f341567o >= 0) {
            m159184w();
            this.f341568p.mo172739b(this.f341567o);
            BlockingQueue<Runnable> blockingQueue = this.f341573x;
            if (blockingQueue != null) {
                blockingQueue.clear();
            }
        }
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C114110qj) && this.f341567o == ((C114110qj) obj).f341567o;
    }

    /* renamed from: f */
    public final void mo172014f() {
        C113846jl<C114114ql> jlVar = this.f341570r;
        if (jlVar != null) {
            jlVar.mo170953b();
            this.f341571v.clear();
        }
    }

    /* renamed from: f_ */
    public final C113521ap mo171394f_() {
        return null;
    }

    /* renamed from: g */
    public final C113846jl<C114114ql> mo172015g() {
        TileOverlayOptions tileOverlayOptions;
        Class<C114114ql> cls = C114114ql.class;
        if (this.f341568p == null) {
            return null;
        }
        MemoryCache.C113493a aVar = new MemoryCache.C113493a();
        aVar.f339610b = this.f341569q.getMaxMemoryCacheSize(this.f341568p.f341590h);
        aVar.f339611c = new C114112a((byte) 0);
        if (TextUtils.isEmpty(this.f341568p.f341591i) || (tileOverlayOptions = this.f341569q) == null || TextUtils.isEmpty(tileOverlayOptions.getDiskCacheDir())) {
            return C113853jp.m157303a(cls, aVar);
        }
        DiskCache.C113491c cVar = new DiskCache.C113491c();
        if (!TextUtils.isEmpty(mo171381h())) {
            cVar.mo170963b();
        }
        String str = mo171381h() + this.f341569q.getDiskCacheDir();
        cVar.f339599c = new File(this.f341568p.f341591i);
        cVar.f339600d = str;
        cVar.f340638j = -1;
        cVar.f340639k = new C114113qk();
        cVar.f339601e = new C114115qm(this.f341568p.f341591i + File.separator + str);
        return C113853jp.m157303a(cls, aVar, cVar);
    }

    /* renamed from: h */
    public String mo171381h() {
        return f341563n;
    }

    /* renamed from: h_ */
    public final void mo172595h_() {
        if (this.f341568p != null && this.f341567o >= 0) {
            m159184w();
            synchronized (this) {
                C113934lj ljVar = this.f341572w;
                if (ljVar != null) {
                    ljVar.mo172356a();
                    this.f341572w = null;
                }
            }
            C114117qo qoVar = this.f341568p;
            int i = this.f341567o;
            if (qoVar.f341588f != null) {
                qoVar.f341589g.remove(Integer.valueOf(i));
                qoVar.f341588f.mo172937d(i);
                C113896kq.m157671d(C0949kl.f2232b);
            }
        }
    }

    public int hashCode() {
        return this.f341061b_.hashCode();
    }

    public Bitmap onLoadTile(int i, int i2, int i3, byte[] bArr) {
        int i4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        byte[] bArr2 = bArr;
        TileOverlayOptions tileOverlayOptions = this.f341569q;
        if (tileOverlayOptions == null || tileOverlayOptions.getTileProvider() == null) {
            return null;
        }
        String format = String.format(f341562a, new Object[]{C113884kf.m157495b(this.f341569q.getVersionInfo()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        int e = C113896kq.m157673e(C0949kl.f2232b, "load-count");
        int d = C113896kq.m157669d(C0949kl.f2232b, "cache-count");
        int d2 = C113896kq.m157669d(C0949kl.f2232b, "data-count");
        int d3 = C113896kq.m157669d(C0949kl.f2232b, "req-count");
        int d4 = C113896kq.m157669d(C0949kl.f2232b, "cancel-count");
        C114114ql b = C113853jp.m157304a(this.f341570r).mo172238b(format, C114114ql.class);
        if (b != null) {
            d = C113896kq.m157673e(C0949kl.f2232b, "cache-count");
            i4 = b.f340647e;
            if (e == d3 + d2 + d + d4) {
                C113896kq.m157674e(C0949kl.f2232b);
            }
        } else {
            i4 = 0;
        }
        C113896kq.m157658a("get from cache of cacheId:".concat(String.valueOf(format)), "dataLength:".concat(String.valueOf(i4)), "loadCount:".concat(String.valueOf(e)), "reqCount:".concat(String.valueOf(d3)), "dataCount:".concat(String.valueOf(d2)), "cacheCount:".concat(String.valueOf(d)), "cancelCount:".concat(String.valueOf(d4)));
        if (b != null) {
            this.f341571v.remove(format);
            b.mo172247e();
            return b.mo172245c();
        }
        Integer num = this.f341571v.get(format);
        if (num == null || num.intValue() <= 10) {
            byte[] bArr3 = bArr;
            this.f341571v.put(format, Integer.valueOf(num == null ? 0 : num.intValue() + 1));
            StringBuilder sb = new StringBuilder(128);
            sb.append("tileOverlay://getTile/");
            sb.append(this.f341567o);
            sb.append("?x=");
            sb.append(i5);
            sb.append("&y=");
            sb.append(i6);
            sb.append("&z=");
            sb.append(i7);
            byte[] bytes = sb.toString().getBytes();
            System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
            return null;
        }
        Iterator<Map.Entry<String, Integer>> it = this.f341571v.entrySet().iterator();
        int i8 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((Integer) it.next().getValue()).intValue() > 10) {
                    i8++;
                }
                if (i8 > 50) {
                    C113889km.m157549c("超过50个瓦片请求大于10次，重新加载TileOverlay");
                    mo172013e();
                    break;
                }
            } else {
                break;
            }
        }
        StringBuilder sb4 = new StringBuilder(128);
        sb4.append("tileOverlay://getTile/");
        sb4.append(this.f341567o);
        sb4.append("?x=");
        sb4.append(i5);
        sb4.append("&y=");
        sb4.append(i6);
        sb4.append("&z=");
        sb4.append(i7);
        byte[] bytes2 = sb4.toString().getBytes();
        System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
        return null;
    }

    public void onLoadTileFinish(int i, int i2, int i3) {
        String b = C113884kf.m157495b(this.f341569q.getVersionInfo());
        C114114ql b2 = C113853jp.m157304a(this.f341570r).mo172238b(String.format(f341562a, new Object[]{b, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}), C114114ql.class);
        if (b2 != null) {
            b2.mo172246d();
        }
    }

    public boolean onTap(float f, float f2) {
        return false;
    }

    public void onWriteTile(int i, int i2, int i3, String str, byte[] bArr) {
    }

    /* renamed from: com.tencent.mapsdk.internal.qj$a */
    public static class C114112a implements C113846jl.C113848b<C114114ql> {
        private C114112a() {
        }

        public /* synthetic */ C114112a(byte b) {
            this();
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo147866a(Object obj) {
            C114114ql qlVar = (C114114ql) obj;
            if (qlVar == null) {
                return true;
            }
            qlVar.mo172248f();
            return true;
        }

        /* renamed from: a */
        private static boolean m159196a(C114114ql qlVar) {
            if (qlVar == null) {
                return true;
            }
            qlVar.mo172248f();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo172716a(int i) {
        if (this.f341568p != null && this.f341567o >= 0) {
            if (i < 0) {
                i = 0;
            }
            this.f341568p.mo172734a(this.f341567o, mo172729b(i));
        }
    }

    /* renamed from: a */
    public final void mo172728a(int i, int i2) {
        int i3;
        C114117qo qoVar = this.f341568p;
        if (qoVar != null && (i3 = this.f341567o) >= 0) {
            qoVar.mo172735a(i3, i, i2);
        }
    }

    /* renamed from: a */
    private void m159177a(String str) {
        if (this.f341569q != null && !TextUtils.isEmpty(str)) {
            this.f341569q.diskCacheDir(str);
            this.f341570r = mo172015g();
        }
    }

    /* renamed from: a */
    private byte[] m159178a(int i, int i2, int i3) {
        TileOverlayOptions tileOverlayOptions = this.f341569q;
        if (tileOverlayOptions == null || tileOverlayOptions.getTileProvider() == null || i3 < 0) {
            C113889km.m157553d(C0949kl.f2232b, "无效坐标，返回空瓦块");
            return C104548ha.m139950a();
        }
        String b = C113884kf.m157495b(this.f341569q.getVersionInfo());
        String format = String.format(f341562a, new Object[]{b, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        Tile tile = this.f341569q.getTileProvider().getTile(i, i2, i3);
        if (tile == null) {
            C113889km.m157553d(C0949kl.f2232b, "Provider没有瓦片数据，返回空瓦块");
            return C104548ha.m139950a();
        }
        byte[] bArr = tile.mData;
        if (bArr != null && bArr.length > 0) {
            C113896kq.m157660b(C0949kl.f2232b, "cacheId", (Object) format);
            C114114ql qlVar = new C114114ql(bArr);
            C113846jl<C114114ql> jlVar = this.f341570r;
            if (jlVar != null) {
                C113861js<C114114ql> a = C113853jp.m157304a(jlVar);
                if (a != null) {
                    a.mo172239b(format, qlVar);
                } else {
                    this.f341570r.mo170951a(format, qlVar);
                }
            }
        }
        return bArr;
    }
}
