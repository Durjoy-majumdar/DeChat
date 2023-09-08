package com.tencent.p014mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.MediaStore;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import java.util.LinkedList;
import qw1.C101316l;

/* renamed from: com.tencent.mm.plugin.gallery.model.p */
public class C93985p extends C93946b {

    /* renamed from: h */
    public final ContentResolver f271236h = MMApplicationContext.getContext().getContentResolver();

    /* renamed from: a */
    public LinkedList<GalleryItem$AlbumItem> mo128866a() {
        Cursor query;
        LinkedList<GalleryItem$AlbumItem> linkedList = new LinkedList<>();
        try {
            query = this.f271236h.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, mo128927i(), C101316l.m132915n() ? null : "0==0) GROUP BY (bucket_display_name", (String[]) null, C101316l.m132915n() ? "_id desc" : "max_time desc, _id desc");
            if (query != null) {
                HashMap hashMap = new HashMap();
                if (query.moveToFirst()) {
                    do {
                        GalleryItem$AlbumItem c = mo128869c(query, 2, "bucket_display_name");
                        if (c != null) {
                            hashMap.put(c.f271099g, c);
                        }
                    } while (query.moveToNext());
                    linkedList.addAll(hashMap.values());
                    mo128871e(linkedList);
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ImageMediaQuery", "query album list failed : [%s]", e.getMessage());
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return linkedList;
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x00fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0143 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0189 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7 A[Catch:{ all -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105 A[LOOP:0: B:20:0x009c->B:50:0x0105, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014c A[LOOP:1: B:51:0x010b->B:68:0x014c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0192 A[LOOP:2: B:70:0x0155->B:87:0x0192, LOOP_END] */
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
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)     // Catch:{ all -> 0x01d7 }
            r12 = 1
            if (r1 == 0) goto L_0x0052
            android.content.ContentResolver r13 = r7.f271236h     // Catch:{ all -> 0x01d7 }
            android.net.Uri r14 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01d7 }
            java.lang.String[] r15 = r20.mo128929k()     // Catch:{ all -> 0x01d7 }
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x01d7 }
            java.lang.String[] r2 = r7.f271110e     // Catch:{ all -> 0x01d7 }
            r2 = r2[r9]     // Catch:{ all -> 0x01d7 }
            r1[r9] = r2     // Catch:{ all -> 0x01d7 }
            java.lang.String r16 = r7.mo128931m(r1, r9)     // Catch:{ all -> 0x01d7 }
            r17 = 0
            java.lang.String r18 = r7.mo128928j(r9)     // Catch:{ all -> 0x01d7 }
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d7 }
            android.content.ContentResolver r13 = r7.f271236h     // Catch:{ all -> 0x01d4 }
            android.net.Uri r14 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01d4 }
            java.lang.String[] r15 = r20.mo128929k()     // Catch:{ all -> 0x01d4 }
            java.lang.String[] r2 = new java.lang.String[r12]     // Catch:{ all -> 0x01d4 }
            java.lang.String[] r3 = r7.f271110e     // Catch:{ all -> 0x01d4 }
            r3 = r3[r9]     // Catch:{ all -> 0x01d4 }
            r2[r9] = r3     // Catch:{ all -> 0x01d4 }
            java.lang.String r16 = r7.mo128931m(r2, r12)     // Catch:{ all -> 0x01d4 }
            r17 = 0
            java.lang.String r18 = r7.mo128928j(r12)     // Catch:{ all -> 0x01d4 }
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d4 }
            goto L_0x007e
        L_0x0052:
            android.content.ContentResolver r13 = r7.f271236h     // Catch:{ all -> 0x01d7 }
            android.net.Uri r14 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01d7 }
            java.lang.String[] r15 = r20.mo128929k()     // Catch:{ all -> 0x01d7 }
            java.lang.String r16 = r7.mo128930l(r0, r9)     // Catch:{ all -> 0x01d7 }
            r17 = 0
            java.lang.String r18 = r7.mo128928j(r9)     // Catch:{ all -> 0x01d7 }
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d7 }
            android.content.ContentResolver r13 = r7.f271236h     // Catch:{ all -> 0x01d4 }
            android.net.Uri r14 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x01d4 }
            java.lang.String[] r15 = r20.mo128929k()     // Catch:{ all -> 0x01d4 }
            java.lang.String r16 = r7.mo128930l(r0, r12)     // Catch:{ all -> 0x01d4 }
            r17 = 0
            java.lang.String r18 = r7.mo128928j(r12)     // Catch:{ all -> 0x01d4 }
            android.database.Cursor r2 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d4 }
        L_0x007e:
            r13 = r1
            r14 = r2
            if (r13 == 0) goto L_0x008a
            r13.moveToFirst()     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            r11 = r13
            goto L_0x01da
        L_0x008a:
            if (r14 == 0) goto L_0x008f
            r14.moveToFirst()     // Catch:{ all -> 0x0086 }
        L_0x008f:
            r15 = 2
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r7.mo128872h(r13, r15)     // Catch:{ all -> 0x0086 }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = r7.mo128872h(r14, r15)     // Catch:{ all -> 0x0086 }
            r6 = r1
            r1 = 0
            r16 = 1
        L_0x009c:
            if (r2 == 0) goto L_0x010b
            if (r6 == 0) goto L_0x010b
            long r3 = r2.f162752i     // Catch:{ all -> 0x0086 }
            long r11 = r6.f162752i     // Catch:{ all -> 0x0086 }
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b0
            r10.add(r2)     // Catch:{ all -> 0x0086 }
            r14.moveToNext()     // Catch:{ all -> 0x0086 }
            r11 = r6
            goto L_0x00c9
        L_0x00b0:
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bc
            r10.add(r6)     // Catch:{ all -> 0x0086 }
            r13.moveToNext()     // Catch:{ all -> 0x0086 }
            r11 = r2
            goto L_0x00c9
        L_0x00bc:
            r10.add(r6)     // Catch:{ all -> 0x0086 }
            r10.add(r2)     // Catch:{ all -> 0x0086 }
            r14.moveToNext()     // Catch:{ all -> 0x0086 }
            r13.moveToNext()     // Catch:{ all -> 0x0086 }
            r11 = 0
        L_0x00c9:
            if (r11 == 0) goto L_0x00d0
            if (r11 != r2) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r12 = r6
            goto L_0x00d5
        L_0x00d0:
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r7.mo128872h(r13, r15)     // Catch:{ all -> 0x0086 }
            r12 = r1
        L_0x00d5:
            if (r11 == 0) goto L_0x00dd
            if (r11 != r12) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            r19 = r2
            goto L_0x00e3
        L_0x00dd:
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r7.mo128872h(r14, r15)     // Catch:{ all -> 0x0086 }
            r19 = r1
        L_0x00e3:
            r1 = r20
            r2 = r23
            r3 = r10
            r4 = r24
            r6 = r16
            boolean r1 = r1.mo128870d(r2, r3, r4, r6)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x00f6
            if (r16 == 0) goto L_0x00f6
            r16 = 0
        L_0x00f6:
            boolean r1 = r7.f271112g     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0105
            if (r13 == 0) goto L_0x00ff
            r13.close()
        L_0x00ff:
            if (r14 == 0) goto L_0x0104
            r14.close()
        L_0x0104:
            return r10
        L_0x0105:
            r1 = r11
            r6 = r12
            r2 = r19
            r12 = 1
            goto L_0x009c
        L_0x010b:
            if (r2 == 0) goto L_0x0151
            if (r1 == 0) goto L_0x011f
            long r3 = r1.f162752i     // Catch:{ all -> 0x0086 }
            long r11 = r2.f162752i     // Catch:{ all -> 0x0086 }
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x011f
            r10.add(r1)     // Catch:{ all -> 0x0086 }
            r10.add(r2)     // Catch:{ all -> 0x0086 }
            r11 = 0
            goto L_0x0123
        L_0x011f:
            r10.add(r2)     // Catch:{ all -> 0x0086 }
            r11 = r1
        L_0x0123:
            r14.moveToNext()     // Catch:{ all -> 0x0086 }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r12 = r7.mo128872h(r14, r15)     // Catch:{ all -> 0x0086 }
            r1 = r20
            r2 = r23
            r3 = r10
            r4 = r24
            r19 = r6
            r6 = r16
            boolean r1 = r1.mo128870d(r2, r3, r4, r6)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x013f
            if (r16 == 0) goto L_0x013f
            r16 = 0
        L_0x013f:
            boolean r1 = r7.f271112g     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x014c
            if (r13 == 0) goto L_0x0148
            r13.close()
        L_0x0148:
            r14.close()
            return r10
        L_0x014c:
            r1 = r11
            r2 = r12
            r6 = r19
            goto L_0x010b
        L_0x0151:
            r19 = r6
            r11 = r16
        L_0x0155:
            if (r6 == 0) goto L_0x0196
            if (r1 == 0) goto L_0x0169
            long r2 = r1.f162752i     // Catch:{ all -> 0x0086 }
            long r4 = r6.f162752i     // Catch:{ all -> 0x0086 }
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0169
            r10.add(r1)     // Catch:{ all -> 0x0086 }
            r10.add(r6)     // Catch:{ all -> 0x0086 }
            r12 = 0
            goto L_0x016d
        L_0x0169:
            r10.add(r6)     // Catch:{ all -> 0x0086 }
            r12 = r1
        L_0x016d:
            r13.moveToNext()     // Catch:{ all -> 0x0086 }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r16 = r7.mo128872h(r13, r15)     // Catch:{ all -> 0x0086 }
            r1 = r20
            r2 = r23
            r3 = r10
            r4 = r24
            r6 = r11
            boolean r1 = r1.mo128870d(r2, r3, r4, r6)     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0185
            if (r11 == 0) goto L_0x0185
            r11 = 0
        L_0x0185:
            boolean r1 = r7.f271112g     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0192
            r13.close()
            if (r14 == 0) goto L_0x0191
            r14.close()
        L_0x0191:
            return r10
        L_0x0192:
            r1 = r12
            r6 = r16
            goto L_0x0155
        L_0x0196:
            if (r1 == 0) goto L_0x019b
            r10.add(r1)     // Catch:{ all -> 0x0086 }
        L_0x019b:
            if (r8 == 0) goto L_0x01a3
            r1 = r24
            r8.mo80207B3(r10, r1, r11)     // Catch:{ all -> 0x0086 }
            goto L_0x01a5
        L_0x01a3:
            r1 = r24
        L_0x01a5:
            java.lang.String r3 = "MicroMsg.ImageMediaQuery"
            java.lang.String r4 = "[queryMediaItemsInAlbum] albumName:%s type:%s result:%s ticket:%s"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0086 }
            r5[r9] = r0     // Catch:{ all -> 0x0086 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0086 }
            r6 = 1
            r5[r6] = r0     // Catch:{ all -> 0x0086 }
            int r0 = r10.size()     // Catch:{ all -> 0x0086 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0086 }
            r5[r15] = r0     // Catch:{ all -> 0x0086 }
            r0 = 3
            java.lang.Long r1 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0086 }
            r5[r0] = r1     // Catch:{ all -> 0x0086 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)     // Catch:{ all -> 0x0086 }
            if (r13 == 0) goto L_0x01ce
            r13.close()
        L_0x01ce:
            if (r14 == 0) goto L_0x01d3
            r14.close()
        L_0x01d3:
            return r10
        L_0x01d4:
            r0 = move-exception
            r11 = r1
            goto L_0x01d9
        L_0x01d7:
            r0 = move-exception
            r11 = 0
        L_0x01d9:
            r14 = 0
        L_0x01da:
            if (r11 == 0) goto L_0x01df
            r11.close()
        L_0x01df:
            if (r14 == 0) goto L_0x01e4
            r14.close()
        L_0x01e4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.model.C93985p.mo128867b(java.lang.String, int, com.tencent.mm.plugin.gallery.model.k$c, long):java.util.LinkedList");
    }

    /* renamed from: i */
    public String[] mo128927i() {
        if (C101316l.m132915n()) {
            return new String[]{"_id", "_data", "bucket_display_name", "datetaken", "date_modified", "mime_type", "bucket_id"};
        }
        return new String[]{"_id", "_data", "bucket_display_name", "count(*)", "datetaken", "date_modified", "mime_type", "max(date_modified) as max_time", "bucket_id"};
    }

    /* renamed from: j */
    public String mo128928j(boolean z) {
        return z ? "datetaken desc, bucket_display_name desc, _id desc" : "date_modified desc, bucket_display_name desc, _id desc";
    }

    /* renamed from: k */
    public String[] mo128929k() {
        return new String[]{"_id", "_data", "datetaken", "date_modified", "mime_type", "latitude", "longitude"};
    }

    /* renamed from: l */
    public String mo128930l(String str, boolean z) {
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
    public String mo128931m(String[] strArr, boolean z) {
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
