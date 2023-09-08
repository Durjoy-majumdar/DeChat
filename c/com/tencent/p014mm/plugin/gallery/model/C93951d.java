package com.tencent.p014mm.plugin.gallery.model;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.vfs.C86009m1;
import hw1.C87599j;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o90.C100301b;
import p823sg.C101611g;
import qw1.C101316l;
import te3.C64260bi2;
import te3.C64288ci2;

/* renamed from: com.tencent.mm.plugin.gallery.model.d */
public final class C93951d {

    /* renamed from: a */
    public C101611g<String, C93955d> f271141a = new C100301b(200, new C93953b(this), C93951d.class);

    /* renamed from: b */
    public C87599j f271142b;

    /* renamed from: c */
    public MStorageEvent<C93956e, String> f271143c = new C93952a(this);

    /* renamed from: d */
    public CopyOnWriteArrayList<String> f271144d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public ConcurrentHashMap<String, C93956e> f271145e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public final byte[] f271146f = new byte[0];

    /* renamed from: com.tencent.mm.plugin.gallery.model.d$a */
    public class C93952a extends MStorageEvent<C93956e, String> {
        public C93952a(C93951d dVar) {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C93956e) obj).mo128888b((String) obj2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.d$b */
    public class C93953b implements C101611g.C101612b<String, C93955d> {
        public C93953b(C93951d dVar) {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            C93955d dVar = (C93955d) obj2;
            C93955d dVar2 = (C93955d) obj3;
            if (dVar == null) {
                Log.m105918d("MicroMsg.GalleryCache", "BitmapReference is null.");
                return;
            }
            Bitmap bitmap = dVar.f271148a;
            if (bitmap == null) {
                Log.m105918d("MicroMsg.GalleryCache", "get is null.");
                return;
            }
            Log.m105925i("MicroMsg.GalleryCache", "bitmap recycle %s.", bitmap.toString());
            dVar.f271148a.recycle();
            Log.m105919d("MicroMsg.GalleryCache", "gallery remove ", str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.d$c */
    public class C93954c implements C93956e {
        public C93954c() {
        }

        /* renamed from: a */
        public String mo128887a() {
            return "";
        }

        /* renamed from: b */
        public void mo128888b(String str) {
            Log.m105918d("MicroMsg.GalleryCache", "now listener size : " + C93951d.this.f271145e.size());
            if (BuildInfo.DEBUG) {
                for (Map.Entry<String, C93956e> key : C93951d.this.f271145e.entrySet()) {
                    Log.m105919d("MicroMsg.GalleryCache", "decodeTaskKey: %s.", key.getKey());
                }
            }
            Log.m105919d("MicroMsg.GalleryCache", "will hit??? decodeTaskKey: %s.", str);
            if (C93951d.this.f271145e.containsKey(str)) {
                Log.m105918d("MicroMsg.GalleryCache", "hit!!!");
                C93956e eVar = C93951d.this.f271145e.get(str);
                if (eVar != null) {
                    eVar.mo128888b(str);
                    return;
                }
                return;
            }
            Log.m105928w("MicroMsg.GalleryCache", "not hit!!!");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.d$d */
    public class C93955d {

        /* renamed from: a */
        public Bitmap f271148a;

        public C93955d(C93951d dVar, Bitmap bitmap, int i) {
            this.f271148a = bitmap;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.d$e */
    public interface C93956e {
        /* renamed from: a */
        String mo128887a();

        /* renamed from: b */
        void mo128888b(String str);
    }

    public C93951d() {
        C87599j jVar = new C87599j();
        int i = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getInt("com.tencent.mm.gallery.cache.suffix", 0);
        jVar.f253694e = i;
        Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache current suffix: %s.", Integer.valueOf(i));
        C86009m1 m1Var = new C86009m1(jVar.f253691b, "cache.idx");
        C64260bi2 bi22 = new C64260bi2();
        String i2 = m1Var.mo119971i();
        Log.m105919d("MicroMsg.DiskCache", "pennqin debug disk cache path: %s.", i2);
        if (!Util.isNullOrNil(i2)) {
            try {
                byte[] readFromFile = Util.readFromFile(i2);
                if (readFromFile != null) {
                    bi22.parseFrom(readFromFile);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.DiskCache", "load index file error");
                Log.printErrStackTrace("MicroMsg.DiskCache", e, "", new Object[0]);
                jVar.mo122050c(-1);
                bi22 = new C64260bi2();
            } catch (OutOfMemoryError e2) {
                Log.m105921e("MicroMsg.DiskCache", "load index file error, OOM, index length %s", Long.valueOf(m1Var.mo119980r()));
                Log.printErrStackTrace("MicroMsg.DiskCache", e2, "", new Object[0]);
                jVar.mo122050c(-1);
                bi22 = new C64260bi2();
            }
        }
        jVar.f253693d.clear();
        Iterator<C64288ci2> it = bi22.f182289d.iterator();
        while (it.hasNext()) {
            C64288ci2 next = it.next();
            jVar.f253693d.put(next.f182515d, next);
        }
        jVar.mo122054g(-1);
        this.f271142b = jVar;
        this.f271143c.add(new C93954c(), (Looper) null);
    }

    /* renamed from: a */
    public Bitmap mo128883a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.GalleryCache", "null filepath");
            return null;
        }
        C101611g<String, C93955d> gVar = this.f271141a;
        if (gVar == null) {
            Log.m105928w("MicroMsg.GalleryCache", "want to get bitmap, but gallery cache is null");
            return null;
        }
        if (gVar.check(str)) {
            C93955d b = this.f271141a.mo139556b(str);
            if (b == null) {
                Log.m105919d("MicroMsg.GalleryCache", "weakreference is null! %s", str);
                this.f271141a.remove(str);
                return null;
            }
            Bitmap bitmap = b.f271148a;
            if (bitmap == null) {
                this.f271141a.remove(str);
                Log.m105925i("MicroMsg.GalleryCache", "get bitmap is null! %s", str);
            } else if (bitmap.isRecycled()) {
                Log.m105925i("MicroMsg.GalleryCache", "cache bitmap has recycled: %s", str);
                this.f271141a.remove(str);
                return null;
            } else {
                Log.m105924i("MicroMsg.GalleryCache", "get cached bitmap:" + str);
                return bitmap;
            }
        }
        return null;
    }

    /* renamed from: b */
    public Bitmap mo128884b(String str, String str2, long j, C93974o.C93980f fVar, long j2) {
        synchronized (this.f271146f) {
            if (this.f271142b == null) {
                return null;
            }
            if (Util.isNullOrNil(str)) {
                str = str2;
            }
            String c = C101316l.m132904c(str, fVar, j2);
            int hashCode = c.hashCode();
            Log.m105919d("MicroMsg.GalleryCache", "keyStr: %s keyInt: %s.", c, Integer.valueOf(hashCode));
            Bitmap d = this.f271142b.mo122051d(hashCode);
            return d;
        }
    }

    /* renamed from: c */
    public void mo128885c(String str, String str2, long j, Bitmap bitmap, C93974o.C93980f fVar, long j2) {
        synchronized (this.f271146f) {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (this.f271142b != null) {
                        if (Util.isNullOrNil(str)) {
                            str = str2;
                        }
                        this.f271142b.mo122055h(C101316l.m132904c(str, fVar, j2).hashCode(), BitmapUtil.checkImgInsideCanvasMaxBitmapSize(bitmap));
                        return;
                    }
                    return;
                }
            }
            Log.m105920e("MicroMsg.GalleryCache", "saveBitmapToDiskCache bmp is null. wtf!!! tell pennqin!!!");
        }
    }

    /* renamed from: d */
    public void mo128886d(String str, Bitmap bitmap, int i, C93974o.C93980f fVar, boolean z, int i2, long j) {
        C101611g<String, C93955d> gVar = this.f271141a;
        if (gVar == null) {
            Log.m105920e("MicroMsg.GalleryCache", "cache is null");
            return;
        }
        gVar.mo139557c(C101316l.m132904c(str, fVar, j), new C93955d(this, BitmapUtil.checkImgInsideCanvasMaxBitmapSize(bitmap), i));
        if (!z) {
            this.f271143c.event(C101316l.m132905d(str, fVar, i2));
            this.f271143c.doNotify();
        }
    }
}
