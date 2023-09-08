package com.tencent.p014mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import qw1.C101316l;

/* renamed from: com.tencent.mm.plugin.gallery.model.l */
public class C93968l extends C93946b {

    /* renamed from: h */
    public ContentResolver f271187h = MMApplicationContext.getContext().getContentResolver();

    /* renamed from: a */
    public LinkedList<GalleryItem$AlbumItem> mo128866a() {
        LinkedList<GalleryItem$AlbumItem> linkedList = new LinkedList<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            cursor = this.f271187h.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, mo128897i(), C101316l.m132915n() ? null : "0==0) GROUP BY (bucket_display_name", (String[]) null, C101316l.m132915n() ? "_id desc" : "max_time desc, _id desc");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ImageMediaQuery", "query image album list failed : [%s]", e.getMessage());
        }
        if (cursor == null) {
            Log.m105918d("MicroMsg.ImageMediaQuery", "no image folder now");
        } else {
            try {
                if (cursor.moveToFirst()) {
                    do {
                        GalleryItem$AlbumItem c = mo128869c(cursor, 1, "bucket_display_name");
                        if (c != null) {
                            if (!arrayList.contains(c.f271096d)) {
                                hashMap.put(c.f271099g, c);
                                arrayList.add(c.f271096d);
                            } else {
                                if (!(!hashMap.containsKey(c.f271099g) || c.f271101i == null || ((GalleryItem$AlbumItem) hashMap.get(c.f271099g)).f271101i == null)) {
                                    if (((int) ((c.f271101i.f162752i - ((GalleryItem$AlbumItem) hashMap.get(c.f271099g)).f271101i.f162752i) / 1000)) > 0) {
                                        hashMap.put(c.f271099g, c);
                                    }
                                }
                                Log.m105918d("MicroMsg.ImageMediaQuery", "queryAlbumListWalkAround, videoAlbumMap no containsKey = " + c.f271099g + ", albumName= " + c.f271096d);
                            }
                        }
                    } while (cursor.moveToNext());
                }
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.ImageMediaQuery", "query image album list failed : [%s]", e2.getMessage());
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
            cursor.close();
        }
        if (!hashMap.isEmpty()) {
            linkedList.addAll(hashMap.values());
            Collections.sort(linkedList);
        }
        mo128871e(linkedList);
        return linkedList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x010d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0157 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x019e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb A[Catch:{ all -> 0x01e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118 A[LOOP:0: B:19:0x00ae->B:49:0x0118, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160 A[LOOP:1: B:50:0x011e->B:67:0x0160, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a7 A[LOOP:2: B:69:0x0169->B:86:0x01a7, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedList<com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem> mo128867b(java.lang.String r21, int r22, com.tencent.p014mm.plugin.gallery.model.C93964k.C93967c r23, long r24) {
        /*
            r20 = this;
            r7 = r20
            r0 = r21
            r8 = r23
            r9 = 0
            r7.f271112g = r9
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)     // Catch:{ all -> 0x01ee }
            r12 = 1
            if (r1 == 0) goto L_0x0046
            android.content.ContentResolver r13 = r7.f271187h     // Catch:{ all -> 0x01ee }
            android.net.Uri r14 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01ee }
            java.lang.String[] r15 = r20.mo128899k()     // Catch:{ all -> 0x01ee }
            java.lang.String[] r1 = r7.f271110e     // Catch:{ all -> 0x01ee }
            java.lang.String r16 = r7.mo128901m(r1, r9)     // Catch:{ all -> 0x01ee }
            r17 = 0
            java.lang.String r18 = r7.mo128898j(r9)     // Catch:{ all -> 0x01ee }
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01ee }
            android.content.ContentResolver r13 = r7.f271187h     // Catch:{ all -> 0x01eb }
            android.net.Uri r14 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01eb }
            java.lang.String[] r15 = r20.mo128899k()     // Catch:{ all -> 0x01eb }
            java.lang.String[] r2 = r7.f271110e     // Catch:{ all -> 0x01eb }
            java.lang.String r16 = r7.mo128901m(r2, r12)     // Catch:{ all -> 0x01eb }
            r17 = 0
            java.lang.String r18 = r7.mo128898j(r12)     // Catch:{ all -> 0x01eb }
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01eb }
            goto L_0x0072
        L_0x0046:
            android.content.ContentResolver r13 = r7.f271187h     // Catch:{ all -> 0x01ee }
            android.net.Uri r14 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01ee }
            java.lang.String[] r15 = r20.mo128899k()     // Catch:{ all -> 0x01ee }
            java.lang.String r16 = r7.mo128900l(r0, r9)     // Catch:{ all -> 0x01ee }
            r17 = 0
            java.lang.String r18 = r7.mo128898j(r9)     // Catch:{ all -> 0x01ee }
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01ee }
            android.content.ContentResolver r13 = r7.f271187h     // Catch:{ all -> 0x01eb }
            android.net.Uri r14 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01eb }
            java.lang.String[] r15 = r20.mo128899k()     // Catch:{ all -> 0x01eb }
            java.lang.String r16 = r7.mo128900l(r0, r12)     // Catch:{ all -> 0x01eb }
            r17 = 0
            java.lang.String r18 = r7.mo128898j(r12)     // Catch:{ all -> 0x01eb }
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01eb }
        L_0x0072:
            r13 = r1
            r14 = r2
            java.lang.String r15 = "MicroMsg.ImageMediaQuery"
            if (r13 == 0) goto L_0x008c
            java.lang.String r1 = "cursorValid count:%s"
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ all -> 0x01e8 }
            int r3 = r13.getCount()     // Catch:{ all -> 0x01e8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01e8 }
            r2[r9] = r3     // Catch:{ all -> 0x01e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r2)     // Catch:{ all -> 0x01e8 }
            r13.moveToFirst()     // Catch:{ all -> 0x01e8 }
        L_0x008c:
            if (r14 == 0) goto L_0x00a2
            java.lang.String r1 = "cursorInvalid count:%s"
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ all -> 0x01e8 }
            int r3 = r14.getCount()     // Catch:{ all -> 0x01e8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01e8 }
            r2[r9] = r3     // Catch:{ all -> 0x01e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r2)     // Catch:{ all -> 0x01e8 }
            r14.moveToFirst()     // Catch:{ all -> 0x01e8 }
        L_0x00a2:
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r7.mo128872h(r13, r12)     // Catch:{ all -> 0x01e8 }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = r7.mo128872h(r14, r12)     // Catch:{ all -> 0x01e8 }
            r6 = r1
            r1 = 0
            r16 = 1
        L_0x00ae:
            if (r2 == 0) goto L_0x011e
            if (r6 == 0) goto L_0x011e
            long r3 = r2.f162752i     // Catch:{ all -> 0x01e8 }
            long r11 = r6.f162752i     // Catch:{ all -> 0x01e8 }
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c2
            r10.add(r2)     // Catch:{ all -> 0x01e8 }
            r14.moveToNext()     // Catch:{ all -> 0x01e8 }
            r11 = r6
            goto L_0x00db
        L_0x00c2:
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ce
            r10.add(r6)     // Catch:{ all -> 0x01e8 }
            r13.moveToNext()     // Catch:{ all -> 0x01e8 }
            r11 = r2
            goto L_0x00db
        L_0x00ce:
            r10.add(r6)     // Catch:{ all -> 0x01e8 }
            r10.add(r2)     // Catch:{ all -> 0x01e8 }
            r14.moveToNext()     // Catch:{ all -> 0x01e8 }
            r13.moveToNext()     // Catch:{ all -> 0x01e8 }
            r11 = 0
        L_0x00db:
            if (r11 == 0) goto L_0x00e3
            if (r11 != r2) goto L_0x00e0
            goto L_0x00e3
        L_0x00e0:
            r12 = r6
            r1 = 1
            goto L_0x00e9
        L_0x00e3:
            r1 = 1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r3 = r7.mo128872h(r13, r1)     // Catch:{ all -> 0x01e8 }
            r12 = r3
        L_0x00e9:
            if (r11 == 0) goto L_0x00f1
            if (r11 != r12) goto L_0x00ee
            goto L_0x00f1
        L_0x00ee:
            r19 = r2
            goto L_0x00f6
        L_0x00f1:
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = r7.mo128872h(r14, r1)     // Catch:{ all -> 0x01e8 }
            goto L_0x00ee
        L_0x00f6:
            r1 = r20
            r2 = r23
            r3 = r10
            r4 = r24
            r6 = r16
            boolean r1 = r1.mo128870d(r2, r3, r4, r6)     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0109
            if (r16 == 0) goto L_0x0109
            r16 = 0
        L_0x0109:
            boolean r1 = r7.f271112g     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0118
            if (r13 == 0) goto L_0x0112
            r13.close()
        L_0x0112:
            if (r14 == 0) goto L_0x0117
            r14.close()
        L_0x0117:
            return r10
        L_0x0118:
            r1 = r11
            r6 = r12
            r2 = r19
            r12 = 1
            goto L_0x00ae
        L_0x011e:
            if (r2 == 0) goto L_0x0165
            if (r1 == 0) goto L_0x0132
            long r3 = r1.f162752i     // Catch:{ all -> 0x01e8 }
            long r11 = r2.f162752i     // Catch:{ all -> 0x01e8 }
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0132
            r10.add(r1)     // Catch:{ all -> 0x01e8 }
            r10.add(r2)     // Catch:{ all -> 0x01e8 }
            r11 = 0
            goto L_0x0136
        L_0x0132:
            r10.add(r2)     // Catch:{ all -> 0x01e8 }
            r11 = r1
        L_0x0136:
            r14.moveToNext()     // Catch:{ all -> 0x01e8 }
            r1 = 1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r12 = r7.mo128872h(r14, r1)     // Catch:{ all -> 0x01e8 }
            r1 = r20
            r2 = r23
            r3 = r10
            r4 = r24
            r19 = r6
            r6 = r16
            boolean r1 = r1.mo128870d(r2, r3, r4, r6)     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0153
            if (r16 == 0) goto L_0x0153
            r16 = 0
        L_0x0153:
            boolean r1 = r7.f271112g     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x0160
            if (r13 == 0) goto L_0x015c
            r13.close()
        L_0x015c:
            r14.close()
            return r10
        L_0x0160:
            r1 = r11
            r2 = r12
            r6 = r19
            goto L_0x011e
        L_0x0165:
            r19 = r6
            r11 = r16
        L_0x0169:
            if (r6 == 0) goto L_0x01ab
            if (r1 == 0) goto L_0x017d
            long r2 = r1.f162752i     // Catch:{ all -> 0x01e8 }
            long r4 = r6.f162752i     // Catch:{ all -> 0x01e8 }
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x017d
            r10.add(r1)     // Catch:{ all -> 0x01e8 }
            r10.add(r6)     // Catch:{ all -> 0x01e8 }
            r12 = 0
            goto L_0x0181
        L_0x017d:
            r10.add(r6)     // Catch:{ all -> 0x01e8 }
            r12 = r1
        L_0x0181:
            r13.moveToNext()     // Catch:{ all -> 0x01e8 }
            r1 = 1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r16 = r7.mo128872h(r13, r1)     // Catch:{ all -> 0x01e8 }
            r1 = r20
            r2 = r23
            r3 = r10
            r4 = r24
            r6 = r11
            boolean r1 = r1.mo128870d(r2, r3, r4, r6)     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x019a
            if (r11 == 0) goto L_0x019a
            r11 = 0
        L_0x019a:
            boolean r1 = r7.f271112g     // Catch:{ all -> 0x01e8 }
            if (r1 == 0) goto L_0x01a7
            r13.close()
            if (r14 == 0) goto L_0x01a6
            r14.close()
        L_0x01a6:
            return r10
        L_0x01a7:
            r1 = r12
            r6 = r16
            goto L_0x0169
        L_0x01ab:
            if (r1 == 0) goto L_0x01b0
            r10.add(r1)     // Catch:{ all -> 0x01e8 }
        L_0x01b0:
            if (r8 == 0) goto L_0x01b8
            r1 = r24
            r8.mo80207B3(r10, r1, r11)     // Catch:{ all -> 0x01e8 }
            goto L_0x01ba
        L_0x01b8:
            r1 = r24
        L_0x01ba:
            java.lang.String r3 = "[queryMediaItemsInAlbum] albumName:%s type:%s result:%s ticket:%s"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x01e8 }
            r4[r9] = r0     // Catch:{ all -> 0x01e8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x01e8 }
            r5 = 1
            r4[r5] = r0     // Catch:{ all -> 0x01e8 }
            r0 = 2
            int r5 = r10.size()     // Catch:{ all -> 0x01e8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01e8 }
            r4[r0] = r5     // Catch:{ all -> 0x01e8 }
            r0 = 3
            java.lang.Long r1 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x01e8 }
            r4[r0] = r1     // Catch:{ all -> 0x01e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r4)     // Catch:{ all -> 0x01e8 }
            if (r13 == 0) goto L_0x01e2
            r13.close()
        L_0x01e2:
            if (r14 == 0) goto L_0x01e7
            r14.close()
        L_0x01e7:
            return r10
        L_0x01e8:
            r0 = move-exception
            r11 = r13
            goto L_0x01f1
        L_0x01eb:
            r0 = move-exception
            r11 = r1
            goto L_0x01f0
        L_0x01ee:
            r0 = move-exception
            r11 = 0
        L_0x01f0:
            r14 = 0
        L_0x01f1:
            if (r11 == 0) goto L_0x01f6
            r11.close()
        L_0x01f6:
            if (r14 == 0) goto L_0x01fb
            r14.close()
        L_0x01fb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.model.C93968l.mo128867b(java.lang.String, int, com.tencent.mm.plugin.gallery.model.k$c, long):java.util.LinkedList");
    }

    /* renamed from: i */
    public String[] mo128897i() {
        if (C101316l.m132915n()) {
            return new String[]{"_id", "_data", "bucket_display_name", "datetaken", "date_modified", "mime_type", "bucket_id"};
        }
        return new String[]{"_id", "_data", "bucket_display_name", "count(*)", "datetaken", "date_modified", "mime_type", "max(date_modified) as max_time", "bucket_id"};
    }

    /* renamed from: j */
    public String mo128898j(boolean z) {
        return z ? "datetaken desc, bucket_display_name desc, _id desc" : "date_modified desc, bucket_display_name desc, _id desc";
    }

    /* renamed from: k */
    public String[] mo128899k() {
        return new String[]{"_id", "_data", "datetaken", "date_modified", "mime_type", "latitude", "longitude"};
    }

    /* renamed from: l */
    public String mo128900l(String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("bucket_display_name='");
        sb.append(str);
        sb.append("' AND ");
        if (z) {
            str2 = "(" + "date_modified" + ">" + String.valueOf(Integer.MAX_VALUE) + " OR " + "date_modified" + "<=0 )";
        } else {
            str2 = "date_modified" + "<=" + String.valueOf(Integer.MAX_VALUE) + " AND " + "date_modified" + ">0";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: m */
    public String mo128901m(String[] strArr, boolean z) {
        String str;
        if (z) {
            String str2 = "(" + "date_modified" + ">" + String.valueOf(Integer.MAX_VALUE) + " OR " + "date_modified" + "<=0 ) AND (" + "_size" + ">" + String.valueOf(Task.EXTRAS_LIMIT_BYTES);
            for (String str3 : strArr) {
                str2 = str2 + " or lower(_data) like '%" + str3 + "%'";
            }
            str = str2 + ")";
        } else {
            String str4 = "date_modified" + "<=" + String.valueOf(Integer.MAX_VALUE) + " AND " + "date_modified" + ">0 AND (" + "_size" + ">" + String.valueOf(Task.EXTRAS_LIMIT_BYTES);
            for (String str5 : strArr) {
                str4 = str4 + " or lower(_data) like '%" + str5 + "%'";
            }
            str = str4 + ")";
        }
        Log.m105919d("MicroMsg.ImageMediaQuery", "where %s", str);
        return str;
    }
}
