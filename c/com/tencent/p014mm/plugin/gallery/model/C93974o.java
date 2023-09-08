package com.tencent.p014mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.gallery.model.o */
public class C93974o {

    /* renamed from: e */
    public static final Uri f271204e = Uri.parse("content://com.open.gallery.smart.provider");

    /* renamed from: a */
    public ContentResolver f271205a = MMApplicationContext.getContext().getContentResolver();

    /* renamed from: b */
    public boolean f271206b;

    /* renamed from: c */
    public boolean f271207c;

    /* renamed from: d */
    public List<GalleryItem$MediaItem> f271208d = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$b */
    public static class C93976b extends C93983i {

        /* renamed from: b */
        public C93979e f271209b;

        /* renamed from: c */
        public String f271210c;

        /* renamed from: d */
        public String f271211d;

        /* renamed from: e */
        public int f271212e;

        /* renamed from: f */
        public long f271213f;

        /* renamed from: g */
        public String f271214g;

        /* renamed from: h */
        public C93977c f271215h;

        public C93976b() {
            this.f271234a = 1;
        }

        public String toString() {
            return "[albumID " + this.f271210c + " albumName " + this.f271211d + " albumCapacity " + this.f271212e + " albumCoverId " + this.f271213f + " albumCoverData " + this.f271214g + " albumTag " + this.f271215h + "]";
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$c */
    public static class C93977c {

        /* renamed from: a */
        public boolean f271216a = false;

        /* renamed from: b */
        public C93980f f271217b;

        /* renamed from: c */
        public boolean f271218c = false;

        /* renamed from: d */
        public boolean f271219d;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("isOcr: ");
            sb.append(this.f271216a);
            sb.append(" cropArea: ");
            C93980f fVar = this.f271217b;
            sb.append(fVar == null ? "" : fVar.toString());
            sb.append(" coverIsVideo: ");
            sb.append(this.f271218c);
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$d */
    public static class C93978d {

        /* renamed from: a */
        public List<C93979e> f271220a;

        /* renamed from: b */
        public Map<C93979e, List<C93976b>> f271221b;

        public C93978d(List<C93979e> list, Map<C93979e, List<C93976b>> map) {
            this.f271220a = list;
            this.f271221b = map;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$f */
    public static class C93980f {

        /* renamed from: a */
        public int f271224a = 0;

        /* renamed from: b */
        public double f271225b;

        /* renamed from: c */
        public double f271226c;

        /* renamed from: d */
        public double f271227d;

        /* renamed from: e */
        public double f271228e;

        /* renamed from: f */
        public String f271229f;

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            return ((C93980f) obj).f271229f.equals(this.f271229f);
        }

        public String toString() {
            return "crop area info -> cropType:" + this.f271224a + " left:" + this.f271225b + " top:" + this.f271226c + " right:" + this.f271227d + " bottom:" + this.f271228e + " id:" + this.f271229f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$g */
    public static class C93981g extends C93983i {
        public C93981g() {
            this.f271234a = 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$h */
    public static class C93982h {

        /* renamed from: a */
        public long f271230a;

        /* renamed from: b */
        public String f271231b;

        /* renamed from: c */
        public String f271232c;

        /* renamed from: d */
        public long f271233d;
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$i */
    public static abstract class C93983i {

        /* renamed from: a */
        public int f271234a;
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$j */
    public static class C93984j {

        /* renamed from: a */
        public static C93974o f271235a = new C93974o((C93975a) null);
    }

    public C93974o(C93975a aVar) {
    }

    /* renamed from: a */
    public final LinkedList<GalleryItem$AlbumItem> mo128916a(ArrayList<C93976b> arrayList) {
        LinkedList<GalleryItem$AlbumItem> linkedList = new LinkedList<>();
        Iterator<C93976b> it = arrayList.iterator();
        while (it.hasNext()) {
            linkedList.add(new PrivateAlbumItem(it.next()));
        }
        return linkedList;
    }

    /* renamed from: b */
    public final String[] mo128917b() {
        return new String[]{"categoryID", "categoryName", "albumID", "albumName", "albumCapacity", "coverID", "coverData", "albumTag"};
    }

    /* renamed from: c */
    public final C93978d mo128918c(List<C93976b> list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C93976b next : list) {
            C93979e eVar = next.f271209b;
            List list2 = (List) hashMap.get(eVar);
            if (list2 == null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                hashMap.put(eVar, arrayList2);
                arrayList.add(eVar);
            } else {
                list2.add(next);
            }
        }
        return new C93978d(arrayList, hashMap);
    }

    /* renamed from: d */
    public final List<C93983i> mo128919d(List<C93976b> list, String str) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        C93976b bVar = null;
        for (C93976b next : list) {
            C93977c cVar = next.f271215h;
            if (cVar == null || !cVar.f271216a) {
                C93979e eVar = next.f271209b;
                List list2 = (List) hashMap.get(eVar);
                if (list2 == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(next);
                    hashMap.put(eVar, arrayList2);
                } else {
                    list2.add(next);
                }
            } else {
                bVar = next;
            }
        }
        for (C93979e eVar2 : hashMap.keySet()) {
            arrayList.add(eVar2);
            arrayList.addAll((Collection) hashMap.get(eVar2));
        }
        if (bVar != null) {
            arrayList.add(new C93979e("OCR", MMApplicationContext.getContext().getResources().getString(C0966R.string.j8x)));
            bVar.f271211d = MMApplicationContext.getContext().getResources().getString(C0966R.string.j8w, new Object[]{str});
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* renamed from: e */
    public final C93977c mo128920e(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C93977c cVar = new C93977c();
        try {
            JSONObject jSONObject = new JSONObject(str);
            cVar.f271216a = jSONObject.optBoolean("ocr", false);
            JSONObject optJSONObject = jSONObject.optJSONObject("cropArea");
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("cropType", 0);
                double optDouble = optJSONObject.optDouble("left", -1.0d);
                double optDouble2 = optJSONObject.optDouble("top", -1.0d);
                double optDouble3 = optJSONObject.optDouble("right", -1.0d);
                double optDouble4 = optJSONObject.optDouble("bottom", -1.0d);
                C93980f fVar = new C93980f();
                fVar.f271224a = optInt;
                fVar.f271225b = optDouble;
                fVar.f271226c = optDouble2;
                fVar.f271227d = optDouble3;
                fVar.f271228e = optDouble4;
                fVar.f271229f = str2;
                cVar.f271217b = fVar;
            }
            cVar.f271218c = 3 == jSONObject.optInt("coverType", 1);
            cVar.f271219d = jSONObject.optBoolean("favorite", false);
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.SmartGalleryQueryUtil", "parse album json error, msg: %s.", e.getMessage(), e);
        }
        return cVar;
    }

    /* renamed from: com.tencent.mm.plugin.gallery.model.o$e */
    public static class C93979e extends C93983i {

        /* renamed from: b */
        public String f271222b;

        /* renamed from: c */
        public String f271223c;

        public C93979e() {
            this.f271234a = 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C93979e) {
                C93979e eVar = (C93979e) obj;
                return this.f271223c.equals(eVar.f271223c) && this.f271222b.equals(eVar.f271222b);
            }
        }

        public int hashCode() {
            return ((629 + this.f271222b.hashCode()) * 37) + this.f271223c.hashCode();
        }

        public C93979e(String str, String str2) {
            this();
            this.f271222b = str;
            this.f271223c = str2;
        }
    }
}
