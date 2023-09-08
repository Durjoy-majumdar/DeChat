package com.tencent.mapsdk.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Tile;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.io.File;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mapsdk.internal.qo */
public final class C114117qo {

    /* renamed from: a */
    public static final String f341580a = "tileOverlay";

    /* renamed from: b */
    public static final String f341581b = "getTile";

    /* renamed from: c */
    public static final int f341582c = 1;

    /* renamed from: d */
    public static final int f341583d = 2;

    /* renamed from: e */
    public static final int f341584e = 100;

    /* renamed from: j */
    private static final String f341585j = "x";

    /* renamed from: k */
    private static final String f341586k = "y";

    /* renamed from: l */
    private static final String f341587l = "z";

    /* renamed from: f */
    public C114216sq f341588f;

    /* renamed from: g */
    public Map<Integer, C114110qj> f341589g = new Hashtable(4);

    /* renamed from: h */
    public C113961mq f341590h;

    /* renamed from: i */
    public String f341591i;

    /* renamed from: m */
    private C114119qq f341592m;

    /* renamed from: n */
    private Context f341593n;

    public C114117qo(Context context, C113961mq mqVar) {
        this.f341593n = context;
        this.f341590h = mqVar;
        this.f341588f = mqVar.f340899g;
        this.f341591i = C113959ml.m157965a(context, (TencentMapOptions) null).mo172403b().getPath();
    }

    /* renamed from: b */
    private C113961mq m159218b() {
        return this.f341590h;
    }

    /* renamed from: c */
    private boolean m159220c() {
        return this.f341588f.mo172960v();
    }

    /* renamed from: d */
    private void m159221d() {
        Map<Integer, C114110qj> map = this.f341589g;
        if (map != null && !map.isEmpty()) {
            C114110qj[] qjVarArr = (C114110qj[]) this.f341589g.values().toArray(new C114110qj[this.f341589g.keySet().size()]);
            for (C114110qj remove : qjVarArr) {
                remove.remove();
            }
        }
    }

    /* renamed from: a */
    public final C114110qj mo172732a(int i) {
        if (i >= 0) {
            return this.f341589g.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: a */
    private Context m159215a() {
        return this.f341593n;
    }

    /* renamed from: c */
    private void m159219c(int i) {
        if (this.f341588f != null) {
            this.f341589g.remove(Integer.valueOf(i));
            this.f341588f.mo172937d(i);
            C113896kq.m157671d(C0949kl.f2232b);
        }
    }

    /* renamed from: b */
    public final TileOverlay mo172738b(TileOverlayOptions tileOverlayOptions) {
        C114110qj a = mo172733a(tileOverlayOptions);
        C113896kq.m157663b(C0949kl.f2232b);
        return new C113531az(a);
    }

    /* renamed from: a */
    public final void mo172736a(C114110qj qjVar) {
        int i;
        if (qjVar != null && (i = qjVar.f341567o) > 0) {
            this.f341589g.put(Integer.valueOf(i), qjVar);
        }
    }

    /* renamed from: a */
    public final C114110qj mo172733a(TileOverlayOptions tileOverlayOptions) {
        if (this.f341592m == null) {
            this.f341592m = new C114119qq(this);
        }
        return this.f341592m.mo172740a(tileOverlayOptions);
    }

    /* renamed from: b */
    public final void mo172739b(int i) {
        C114216sq sqVar = this.f341588f;
        if (sqVar != null) {
            sqVar.mo172939e(i);
        }
    }

    /* renamed from: a */
    private void m159217a(boolean z) {
        this.f341588f.mo172945i(z);
    }

    /* renamed from: a */
    private int m159214a(TileOverlayCallback tileOverlayCallback, boolean z) {
        if (this.f341588f == null) {
            return -1;
        }
        C113896kq.m157668c(C0949kl.f2232b);
        return this.f341588f.mo172896a(tileOverlayCallback, z);
    }

    /* renamed from: a */
    public final void mo172734a(int i, int i2) {
        C114216sq sqVar = this.f341588f;
        if (sqVar != null) {
            sqVar.mo172928b(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo172735a(int i, int i2, int i3) {
        C114216sq sqVar = this.f341588f;
        if (sqVar != null) {
            sqVar.mo172908a(i, i2, i3);
        }
    }

    /* renamed from: a */
    public final byte[] mo172737a(String str) {
        int a;
        C114110qj qjVar;
        try {
            Uri parse = Uri.parse(str);
            if (!C40002he.m42806a(parse.getAuthority(), f341581b) || (a = m159212a(parse)) == -1 || (qjVar = this.f341589g.get(Integer.valueOf(a))) == null) {
                return null;
            }
            int a2 = m159213a(parse, f341585j);
            int a3 = m159213a(parse, f341586k);
            int a4 = m159213a(parse, f341587l);
            TileOverlayOptions tileOverlayOptions = qjVar.f341569q;
            if (tileOverlayOptions != null) {
                if (tileOverlayOptions.getTileProvider() != null) {
                    if (a4 >= 0) {
                        String b = C113884kf.m157495b(qjVar.f341569q.getVersionInfo());
                        String format = String.format(C114110qj.f341562a, new Object[]{b, Integer.valueOf(a2), Integer.valueOf(a3), Integer.valueOf(a4)});
                        Tile tile = qjVar.f341569q.getTileProvider().getTile(a2, a3, a4);
                        if (tile == null) {
                            C113889km.m157553d(C0949kl.f2232b, "Provider没有瓦片数据，返回空瓦块");
                            return C104548ha.m139950a();
                        }
                        byte[] bArr = tile.mData;
                        if (bArr != null && bArr.length > 0) {
                            C113896kq.m157660b(C0949kl.f2232b, "cacheId", (Object) format);
                            C114114ql qlVar = new C114114ql(bArr);
                            C113846jl<C114114ql> jlVar = qjVar.f341570r;
                            if (jlVar != null) {
                                C113861js<C114114ql> a5 = C113853jp.m157304a(jlVar);
                                if (a5 != null) {
                                    a5.mo172239b(format, qlVar);
                                } else {
                                    qjVar.f341570r.mo170951a(format, qlVar);
                                }
                            }
                        }
                        return bArr;
                    }
                }
            }
            C113889km.m157553d(C0949kl.f2232b, "无效坐标，返回空瓦块");
            return C104548ha.m139950a();
        } catch (Exception e) {
            C113889km.m157549c(Log.getStackTraceString(e));
            return null;
        }
    }

    /* renamed from: a */
    private static int m159212a(Uri uri) {
        String lastPathSegment;
        if (uri == null || (lastPathSegment = uri.getLastPathSegment()) == null) {
            return -1;
        }
        try {
            return Integer.parseInt(lastPathSegment);
        } catch (NumberFormatException e) {
            C113889km.m157549c(Log.getStackTraceString(e));
            return -1;
        }
    }

    /* renamed from: a */
    private static int m159213a(Uri uri, String str) {
        if (uri == null) {
            return -1;
        }
        try {
            return Integer.parseInt(uri.getQueryParameter(str));
        } catch (NumberFormatException e) {
            C113889km.m157549c(Log.getStackTraceString(e));
            return -1;
        }
    }

    /* renamed from: a */
    private static void m159216a(Context context) {
        File[] listFiles;
        if (context != null) {
            File file = new File(C113959ml.m157965a(context, (TencentMapOptions) null).mo172403b().getPath() + C114110qj.f341563n);
            if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (File file2 : listFiles) {
                    if (currentTimeMillis - file2.lastModified() > TimeUnit.DAYS.toMillis(7)) {
                        C113884kf.m157500b(file2);
                    }
                }
            }
        }
    }
}
