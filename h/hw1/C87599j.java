package hw1;

import a70.C112760b;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import te3.C64260bi2;
import te3.C64288ci2;

/* renamed from: hw1.j */
public class C87599j {

    /* renamed from: a */
    public int f253690a = 5;

    /* renamed from: b */
    public C86009m1 f253691b;

    /* renamed from: c */
    public SparseArray<RandomAccessFile> f253692c;

    /* renamed from: d */
    public SparseArray<C64288ci2> f253693d;

    /* renamed from: e */
    public int f253694e;

    public C87599j() {
        long j;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(MMApplicationContext.getContext());
        if (defaultSharedPreferences.getInt("com.tencent.mm.plugin.gallery.cache.cache-up-to-date", 0) == 0) {
            defaultSharedPreferences.edit().putInt("com.tencent.mm.plugin.gallery.cache.cache-up-to-date", 1).apply();
            String str = C112760b.m154195C() + "diskcache";
            Log.m105924i("MicroMsg.DiskCache", str);
            C86013q1.m106445f(str);
        }
        try {
            StatFs statFs = new StatFs(C112760b.m154230f0());
            j = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Exception unused) {
            j = 0;
        }
        int i = (int) (((((float) j) / 1024.0f) / 1024.0f) / 1024.0f);
        Log.m105919d("MicroMsg.DiskCache", "adjustCacheFileNum: %s gb: %s.", Long.valueOf(j), Integer.valueOf(i));
        if (i < 64) {
            this.f253690a = 5;
        } else if (i < 128) {
            this.f253690a = 10;
        }
        int i2 = PreferenceManager.getDefaultSharedPreferences(MMApplicationContext.getContext()).getInt("com.tencent.mm.plugin.gallery.cache.cache-file-num", 0);
        if (i2 == 0 || i2 != this.f253690a) {
            String e = mo122052e();
            if (e != null) {
                Log.m105925i("MicroMsg.DiskCache", "cache path: %s.", e);
                C86013q1.m106445f(e);
            } else {
                Log.m105920e("MicroMsg.DiskCache", "wtf!!! shared storage is not currently available.");
            }
        }
        PreferenceManager.getDefaultSharedPreferences(MMApplicationContext.getContext()).edit().putInt("com.tencent.mm.plugin.gallery.cache.cache-file-num", this.f253690a).apply();
        String e2 = mo122052e();
        if (e2 == null) {
            Log.m105924i("MicroMsg.DiskCache", "wtf!!! use old dir!!!");
            e2 = C112760b.m154195C() + "diskcache";
        }
        C86009m1 m1Var = !Util.isNullOrNil(e2) ? new C86009m1(e2) : null;
        if (m1Var != null) {
            if (!m1Var.mo119977o()) {
                Log.m105919d("MicroMsg.DiskCache", "dir[%s] not exist, try to create it, result[%B]", m1Var.mo119971i(), Boolean.valueOf(m1Var.mo119987x()));
            }
            this.f253691b = m1Var;
            this.f253693d = new SparseArray<>();
            return;
        }
        throw new IllegalArgumentException("save dir is null");
    }

    /* renamed from: a */
    public static void m108945a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.DiskCache", "want close %s fail: %s", closeable.getClass().getName(), e.getMessage());
                Log.printErrStackTrace("MicroMsg.DiskCache", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public final void mo122049b() {
        SparseArray<RandomAccessFile> sparseArray = this.f253692c;
        if (sparseArray != null && sparseArray.size() > 0) {
            for (int i = 0; i < this.f253692c.size(); i++) {
                m108945a(this.f253692c.valueAt(i));
            }
            this.f253692c.clear();
        }
    }

    /* renamed from: c */
    public final void mo122050c(int i) {
        Uri.Builder builder;
        Uri.Builder builder2;
        Uri.Builder builder3;
        boolean z = true;
        Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache deleteDataAndIndex: %s.", Integer.valueOf(i));
        SparseArray<RandomAccessFile> sparseArray = this.f253692c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            Object[] objArr = new Object[1];
            if (this.f253692c != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105929w("MicroMsg.DiskCache", "file map is invalid, is null? [%s]", objArr);
            return;
        }
        if (i < 0) {
            C86009m1 m1Var = this.f253691b;
            Uri uri = m1Var == null ? null : m1Var.f250486d;
            if (uri == null) {
                builder3 = new Uri.Builder().path("cache.idx");
            } else {
                builder3 = uri.buildUpon();
                builder3.appendPath("cache.idx");
            }
            Uri build = builder3.build();
            String path = build.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!build.getPath().equals(k)) {
                    build = builder3.path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null);
            Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache delete res: %s.", Boolean.valueOf(l.mo177810a() && l.f348991a.mo119933c(l.f348992b)));
            this.f253693d.clear();
        } else {
            SparseArray<C64288ci2> sparseArray2 = new SparseArray<>();
            for (int i2 = 0; i2 < this.f253693d.size(); i2++) {
                C64288ci2 valueAt = this.f253693d.valueAt(i2);
                if (valueAt.f182518g != i) {
                    sparseArray2.put(this.f253693d.keyAt(i2), valueAt);
                }
                Log.m105927v("MicroMsg.DiskCache", "index info{key[%s] beg[%d] length[%d]}", Integer.valueOf(valueAt.f182515d), Long.valueOf(valueAt.f182516e), Integer.valueOf(valueAt.f182517f));
            }
            this.f253693d = sparseArray2;
            mo122056i();
        }
        if (i < 0) {
            mo122049b();
            Log.m105918d("MicroMsg.DiskCache", "pennqin debug disk cache !!!delete all cache file!!!");
            int i3 = 0;
            while (true) {
                int i4 = this.f253690a;
                if (i3 < i4) {
                    C86009m1 m1Var2 = this.f253691b;
                    String f = mo122053f(i4);
                    Uri uri2 = m1Var2 == null ? null : m1Var2.f250486d;
                    if (uri2 == null) {
                        builder2 = new Uri.Builder().path(f);
                    } else {
                        Uri.Builder buildUpon = uri2.buildUpon();
                        if (!f.isEmpty()) {
                            buildUpon.appendPath(f);
                        }
                        builder2 = buildUpon;
                    }
                    Uri build2 = builder2.build();
                    String path2 = build2.getPath();
                    if (path2 != null) {
                        String k2 = C116299g2.m163855k(path2, false, false);
                        if (!build2.getPath().equals(k2)) {
                            build2 = builder2.path(k2).build();
                        }
                    }
                    C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(build2, (C116281f0.C116288h) null);
                    Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache deleteDataAndIndex delete file res: %s.", Boolean.valueOf(l2.mo177810a() && l2.f348991a.mo119933c(l2.f348992b)));
                    i3++;
                } else {
                    return;
                }
            }
        } else {
            m108945a(this.f253692c.get(i));
            C86009m1 m1Var3 = this.f253691b;
            String f2 = mo122053f(i);
            Uri uri3 = m1Var3 == null ? null : m1Var3.f250486d;
            if (uri3 == null) {
                builder = new Uri.Builder().path(f2);
            } else {
                Uri.Builder buildUpon2 = uri3.buildUpon();
                if (!f2.isEmpty()) {
                    buildUpon2.appendPath(f2);
                }
                builder = buildUpon2;
            }
            Uri build3 = builder.build();
            String path3 = build3.getPath();
            if (path3 != null) {
                String k3 = C116299g2.m163855k(path3, false, false);
                if (!build3.getPath().equals(k3)) {
                    build3 = builder.path(k3).build();
                }
            }
            C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(build3, (C116281f0.C116288h) null);
            Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache deleteDataAndIndex delete file res: %s.", Boolean.valueOf(l3.mo177810a() && l3.f348991a.mo119933c(l3.f348992b)));
        }
    }

    /* renamed from: d */
    public Bitmap mo122051d(int i) {
        SparseArray<RandomAccessFile> sparseArray = this.f253692c;
        if (sparseArray == null || sparseArray.size() <= 0) {
            Log.m105920e("MicroMsg.DiskCache", "want to get bitmap, but data file is null");
            return null;
        }
        C64288ci2 ci22 = this.f253693d.get(i);
        if (ci22 != null) {
            try {
                byte[] bArr = new byte[ci22.f182517f];
                Log.m105919d("MicroMsg.DiskCache", "read data, beg pos %d, length %d", Long.valueOf(ci22.f182516e), Integer.valueOf(ci22.f182517f));
                RandomAccessFile randomAccessFile = this.f253692c.get(ci22.f182518g);
                randomAccessFile.seek(ci22.f182516e);
                randomAccessFile.read(bArr, 0, ci22.f182517f);
                Bitmap decodeByteArray = BitmapUtil.decodeByteArray(bArr);
                if (decodeByteArray != null) {
                    Log.m105919d("MicroMsg.DiskCache", "get bitmap from disk cache ok, wh[%d, %d]", Integer.valueOf(decodeByteArray.getWidth()), Integer.valueOf(decodeByteArray.getHeight()));
                } else {
                    this.f253693d.remove(i);
                }
                return decodeByteArray;
            } catch (Throwable th) {
                Log.m105929w("MicroMsg.DiskCache", "read data fail, key[%d]: %s", Integer.valueOf(i), th.getMessage());
                Log.printErrStackTrace("MicroMsg.DiskCache", th, "", new Object[0]);
                this.f253693d.remove(i);
                return null;
            }
        } else {
            Log.m105928w("MicroMsg.DiskCache", "oh!!! indexNode is null!!!");
            return null;
        }
    }

    /* renamed from: e */
    public final String mo122052e() {
        try {
            C86009m1 c = C86009m1.m106378c(MMApplicationContext.getContext().getExternalCacheDir());
            return c.mo119971i() + "/" + "imgcache";
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public String mo122053f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("cache.data");
        String str = "";
        if (i != 0) {
            str = str + i;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: g */
    public final void mo122054g(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(this.f253692c == null);
        Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache fileSuffix: %s, mDataFileMap == null? [%s].", objArr);
        try {
            if (this.f253692c == null) {
                this.f253692c = new SparseArray<>();
                for (int i2 = 0; i2 < this.f253690a; i2++) {
                    this.f253692c.put(i2, C86013q1.m106420B(this.f253691b + "/" + mo122053f(i2), true));
                }
            } else if (i < 0) {
                mo122049b();
                for (int i3 = 0; i3 < this.f253690a; i3++) {
                    this.f253692c.put(i3, C86013q1.m106420B(this.f253691b + "/" + mo122053f(i3), true));
                }
            } else {
                RandomAccessFile B = C86013q1.m106420B(this.f253691b + "/" + mo122053f(i), true);
                m108945a(this.f253692c.get(i));
                this.f253692c.put(i, B);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.DiskCache", "load data file error: %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.DiskCache", e, "", new Object[0]);
            this.f253692c = null;
        }
    }

    /* renamed from: h */
    public void mo122055h(int i, Bitmap bitmap) {
        String str;
        int i2 = i;
        Bitmap bitmap2 = bitmap;
        SparseArray<RandomAccessFile> sparseArray = this.f253692c;
        boolean z = true;
        if (sparseArray == null || sparseArray.size() <= 0) {
            Object[] objArr = new Object[1];
            if (this.f253692c != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.DiskCache", "want to put bitmap, but data file is invalid, is null?[%s]", objArr);
        } else if (bitmap2 == null || bitmap.isRecycled()) {
            Object[] objArr2 = new Object[1];
            if (bitmap2 != null) {
                z = false;
            }
            objArr2[0] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.DiskCache", "put bmp, value error, bmp is null? [%s]", objArr2);
        } else {
            Log.m105919d("MicroMsg.DiskCache", "put bmp key[%d] size[%d, %d]", Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            SparseArray<RandomAccessFile> sparseArray2 = this.f253692c;
            int i3 = -1;
            if (sparseArray2 == null || sparseArray2.size() <= 0) {
                Log.m105918d("MicroMsg.DiskCache", "checkDataSize, cache file invalid.");
            } else {
                SparseArray<RandomAccessFile> sparseArray3 = this.f253692c;
                if (sparseArray3 != null && sparseArray3.size() > 0) {
                    int i4 = 0;
                    while (true) {
                        try {
                            if (i4 >= this.f253692c.size()) {
                                break;
                            }
                            RandomAccessFile valueAt = this.f253692c.valueAt(i4);
                            Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache r.length[%s] MAX_CACHE_FILE_SIZE[%s]", Long.valueOf(valueAt.length()), 52428800);
                            if (valueAt.length() < 52428800) {
                                Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache getUsedSuffix, %s.", Integer.valueOf(i4));
                                i3 = i4;
                                break;
                            }
                            i4++;
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.DiskCache", e, "", new Object[0]);
                        }
                    }
                }
                if (i3 < 0) {
                    Log.m105919d("MicroMsg.DiskCache", "jacks checkDataSize currentSuffix: %d", Integer.valueOf(this.f253694e));
                    int i5 = this.f253694e + 1;
                    if (i5 >= this.f253690a) {
                        i5 = 0;
                    }
                    Log.m105919d("MicroMsg.DiskCache", "jacks reset Index and Data: %d", Integer.valueOf(i5));
                    mo122050c(i5);
                    mo122054g(i5);
                    i3 = i5;
                }
            }
            if (i3 < 0) {
                Log.m105920e("MicroMsg.DiskCache", "impossible!!! put bmp, file suffix < 0");
                return;
            }
            C64288ci2 ci22 = this.f253693d.get(i2);
            if (ci22 == null) {
                ci22 = new C64288ci2();
                ci22.f182515d = i2;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                long currentTimeMillis = System.currentTimeMillis();
                RandomAccessFile randomAccessFile = this.f253692c.get(i3);
                ci22.f182516e = randomAccessFile.length();
                ci22.f182518g = i3;
                ci22.f182517f = byteArrayOutputStream.size();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                str = "";
                try {
                    randomAccessFile.seek(ci22.f182516e);
                    randomAccessFile.write(byteArray);
                    this.f253694e = i3;
                    Log.m105919d("MicroMsg.DiskCache", "jacks [time: %d]save data ok, key[%d] beg pos %d, length %d, file_suffix %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(ci22.f182515d), Long.valueOf(ci22.f182516e), Integer.valueOf(ci22.f182517f), Integer.valueOf(ci22.f182518g));
                    this.f253693d.put(i2, ci22);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                str = "";
                try {
                    Log.m105921e("MicroMsg.DiskCache", "error:%s", th.getMessage());
                    Log.printErrStackTrace("MicroMsg.DiskCache", th, str, new Object[0]);
                    m108945a(byteArrayOutputStream);
                } catch (Throwable th5) {
                    m108945a(byteArrayOutputStream);
                    throw th5;
                }
            }
            m108945a(byteArrayOutputStream);
        }
    }

    /* renamed from: i */
    public final void mo122056i() {
        C64288ci2 ci22;
        C64260bi2 bi22 = new C64260bi2();
        for (int i = 0; i < this.f253693d.size(); i++) {
            try {
                ci22 = this.f253693d.valueAt(i);
            } catch (ClassCastException e) {
                Log.printErrStackTrace("MicroMsg.DiskCache", e, "saveIndex ClassCastException.", new Object[0]);
                ci22 = null;
            }
            if (ci22 != null) {
                bi22.f182289d.add(ci22);
                Log.m105927v("MicroMsg.DiskCache", "index info{key[%s] beg[%d] length[%d] file_suffix[%d]}", Integer.valueOf(ci22.f182515d), Long.valueOf(ci22.f182516e), Integer.valueOf(ci22.f182517f), Integer.valueOf(ci22.f182518g));
            }
        }
        try {
            Util.writeToFile(new C86009m1(this.f253691b, "cache.idx").mo119971i(), bi22.toByteArray());
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.DiskCache", "save index data error: %s", e2.getMessage());
            Log.printErrStackTrace("MicroMsg.DiskCache", e2, "", new Object[0]);
        }
    }
}
