package com.tencent.p014mm.plugin.gallery.model;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import qw1.C101316l;

/* renamed from: com.tencent.mm.plugin.gallery.model.a */
public class C93945a extends C93946b implements Comparator<GalleryItem$MediaItem> {

    /* renamed from: h */
    public final ContentResolver f271106h = MMApplicationContext.getContext().getContentResolver();

    /* renamed from: i */
    public final C93968l f271107i = new C93968l();

    /* renamed from: j */
    public final C93985p f271108j = new C93985p();

    /* renamed from: a */
    public LinkedList<GalleryItem$AlbumItem> mo128866a() {
        Cursor cursor;
        GalleryItem$AlbumItem galleryItem$AlbumItem;
        Cursor cursor2;
        Cursor cursor3;
        GalleryItem$AlbumItem galleryItem$AlbumItem2;
        Cursor cursor4;
        if (C101316l.m132915n()) {
            LinkedList<GalleryItem$AlbumItem> linkedList = new LinkedList<>();
            HashMap hashMap = new HashMap();
            try {
                ContentResolver contentResolver = this.f271106h;
                this.f271108j.getClass();
                Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                String[] i = this.f271108j.mo128927i();
                this.f271108j.getClass();
                String str = C101316l.m132915n() ? null : "0==0) GROUP BY (bucket_display_name";
                this.f271108j.getClass();
                cursor3 = contentResolver.query(uri, i, str, (String[]) null, C101316l.m132915n() ? "_id desc" : "max_time desc, _id desc");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AllMediaQuery", "query video album list failed : [%s]", e.getMessage());
                cursor3 = null;
            }
            if (cursor3 == null) {
                Log.m105918d("MicroMsg.AllMediaQuery", "no video folder now");
                galleryItem$AlbumItem2 = null;
            } else {
                try {
                    if (cursor3.moveToFirst()) {
                        GalleryItem$MediaItem galleryItem$MediaItem = null;
                        while (true) {
                            this.f271108j.getClass();
                            GalleryItem$AlbumItem c = mo128869c(cursor3, 2, "bucket_display_name");
                            if (c != null && hashMap.get(c.f271099g) == null) {
                                hashMap.put(c.f271099g, c);
                                if (galleryItem$MediaItem == null) {
                                    galleryItem$MediaItem = c.f271101i;
                                }
                            }
                            if (!(c == null || hashMap.get(c.f271099g) == null)) {
                                ((GalleryItem$AlbumItem) hashMap.get(c.f271099g)).f271100h++;
                                ((GalleryItem$AlbumItem) hashMap.get(c.f271099g)).f271098f++;
                            }
                            if (!cursor3.moveToNext()) {
                                break;
                            }
                        }
                        int i2 = 0;
                        for (GalleryItem$AlbumItem galleryItem$AlbumItem3 : hashMap.values()) {
                            i2 += galleryItem$AlbumItem3.f271100h;
                        }
                        galleryItem$AlbumItem2 = new GalleryItem$AlbumItem(MMApplicationContext.getContext().getString(C0966R.string.f360829f50), i2);
                        galleryItem$AlbumItem2.f271103n = true;
                        galleryItem$AlbumItem2.f271101i = galleryItem$MediaItem;
                    } else {
                        galleryItem$AlbumItem2 = null;
                    }
                } finally {
                    cursor3.close();
                }
            }
            try {
                ContentResolver contentResolver2 = this.f271106h;
                this.f271107i.getClass();
                Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                String[] i3 = this.f271107i.mo128897i();
                this.f271107i.getClass();
                String str2 = C101316l.m132915n() ? null : "0==0) GROUP BY (bucket_display_name";
                this.f271107i.getClass();
                cursor4 = contentResolver2.query(uri2, i3, str2, (String[]) null, C101316l.m132915n() ? "_id desc" : "max_time desc, _id desc");
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AllMediaQuery", "query image album list failed : [%s]", e2.getMessage());
                cursor4 = null;
            }
            if (cursor4 == null) {
                Log.m105918d("MicroMsg.AllMediaQuery", "no image folder now");
            } else {
                try {
                    if (cursor4.moveToFirst()) {
                        do {
                            this.f271107i.getClass();
                            GalleryItem$AlbumItem c2 = mo128869c(cursor4, 1, "bucket_display_name");
                            if (c2 != null) {
                                GalleryItem$AlbumItem galleryItem$AlbumItem4 = (GalleryItem$AlbumItem) hashMap.get(c2.f271099g);
                                if (galleryItem$AlbumItem4 == null) {
                                    hashMap.put(c2.f271099g, c2);
                                } else {
                                    if (((int) ((c2.f271101i.f162752i - galleryItem$AlbumItem4.f271101i.f162752i) / 1000)) > 0) {
                                        hashMap.put(c2.f271099g, c2);
                                    }
                                    c2 = galleryItem$AlbumItem4;
                                }
                                c2.f271098f++;
                            }
                        } while (cursor4.moveToNext());
                    }
                } finally {
                    cursor4.close();
                }
            }
            if (!hashMap.isEmpty()) {
                linkedList.addAll(hashMap.values());
                Collections.sort(linkedList);
            }
            mo128871e(linkedList);
            if (galleryItem$AlbumItem2 != null) {
                linkedList.add(1, galleryItem$AlbumItem2);
            }
            return linkedList;
        }
        HashMap hashMap2 = new HashMap();
        LinkedList<GalleryItem$AlbumItem> linkedList2 = new LinkedList<>();
        try {
            ContentResolver contentResolver3 = this.f271106h;
            this.f271108j.getClass();
            Uri uri3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            String[] i4 = this.f271108j.mo128927i();
            this.f271108j.getClass();
            String str3 = C101316l.m132915n() ? null : "0==0) GROUP BY (bucket_display_name";
            this.f271108j.getClass();
            cursor = contentResolver3.query(uri3, i4, str3, (String[]) null, C101316l.m132915n() ? "_id desc" : "max_time desc, _id desc");
        } catch (Exception e3) {
            Log.m105921e("MicroMsg.AllMediaQuery", "query video album list failed : [%s]", e3.getMessage());
            cursor = null;
        }
        if (cursor == null) {
            Log.m105918d("MicroMsg.AllMediaQuery", "no video folder now");
            galleryItem$AlbumItem = null;
        } else {
            if (cursor.moveToFirst()) {
                int i5 = 0;
                GalleryItem$MediaItem galleryItem$MediaItem2 = null;
                do {
                    this.f271108j.getClass();
                    GalleryItem$AlbumItem c3 = mo128869c(cursor, 2, "bucket_display_name");
                    if (c3 != null) {
                        if (!c3.f271104o) {
                            i5 += c3.f271098f;
                        }
                        hashMap2.put(c3.f271099g, c3);
                        if (galleryItem$MediaItem2 == null) {
                            galleryItem$MediaItem2 = c3.f271101i;
                        }
                    }
                } while (cursor.moveToNext());
                galleryItem$AlbumItem = new GalleryItem$AlbumItem(MMApplicationContext.getContext().getString(C0966R.string.f360829f50), i5);
                galleryItem$AlbumItem.f271103n = true;
                galleryItem$AlbumItem.f271101i = galleryItem$MediaItem2;
            } else {
                galleryItem$AlbumItem = null;
            }
            cursor.close();
        }
        try {
            ContentResolver contentResolver4 = this.f271106h;
            this.f271107i.getClass();
            Uri uri4 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String[] i6 = this.f271107i.mo128897i();
            this.f271107i.getClass();
            String str4 = C101316l.m132915n() ? null : "0==0) GROUP BY (bucket_display_name";
            this.f271107i.getClass();
            cursor2 = contentResolver4.query(uri4, i6, str4, (String[]) null, C101316l.m132915n() ? "_id desc" : "max_time desc, _id desc");
        } catch (Exception e4) {
            Log.m105921e("MicroMsg.AllMediaQuery", "query image album list failed : [%s]", e4.getMessage());
            cursor2 = null;
        }
        if (cursor2 == null) {
            Log.m105918d("MicroMsg.AllMediaQuery", "no image folder now");
        } else {
            if (cursor2.moveToFirst()) {
                do {
                    this.f271107i.getClass();
                    GalleryItem$AlbumItem c4 = mo128869c(cursor2, 1, "bucket_display_name");
                    if (c4 != null) {
                        GalleryItem$AlbumItem galleryItem$AlbumItem5 = (GalleryItem$AlbumItem) hashMap2.get(c4.f271099g);
                        if (galleryItem$AlbumItem5 != null) {
                            c4.f271098f += galleryItem$AlbumItem5.f271098f;
                            hashMap2.remove(c4.f271099g);
                        }
                        linkedList2.add(c4);
                    }
                } while (cursor2.moveToNext());
            }
            cursor2.close();
        }
        if (!hashMap2.isEmpty()) {
            linkedList2.addAll(hashMap2.values());
            Collections.sort(linkedList2);
        }
        mo128871e(linkedList2);
        if (galleryItem$AlbumItem != null) {
            linkedList2.add(1, galleryItem$AlbumItem);
        }
        return linkedList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a1, code lost:
        r2 = r29;
        r21 = r3;
        r8 = r4;
        r9 = r5;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ae, code lost:
        if (r2 == null) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.AllMediaQuery", "finish, size: %d.", java.lang.Integer.valueOf(r15.size()));
        r2.mo80207B3(r15, r30, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02c8, code lost:
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ca, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.AllMediaQuery", "[queryMediaItemsInAlbum] albumName:%s type:%s result size:%s ticket:%s cost:%s", r0, java.lang.Integer.valueOf(r28), java.lang.Integer.valueOf(r15.size()), java.lang.Long.valueOf(r30), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r18));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02f8, code lost:
        if (r13 == null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02fa, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02fd, code lost:
        if (r8 == null) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ff, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0302, code lost:
        if (r9 == null) goto L_0x0307;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0304, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0307, code lost:
        if (r21 == null) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0309, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x030c, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e6, code lost:
        if (r8.f162752i < r14.f162752i) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fa, code lost:
        if (r8.f162752i < r1.f162752i) goto L_0x01fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x026c A[Catch:{ Exception -> 0x030f, all -> 0x030d }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0272 A[Catch:{ Exception -> 0x030f, all -> 0x030d }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x028d A[LOOP:0: B:55:0x01ba->B:119:0x028d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02a1 A[EDGE_INSN: B:185:0x02a1->B:120:0x02a1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0278 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x017d A[SYNTHETIC, Splitter:B:39:0x017d] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0193 A[Catch:{ Exception -> 0x0189, all -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0198 A[Catch:{ Exception -> 0x0189, all -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019d A[Catch:{ Exception -> 0x0189, all -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d4 A[Catch:{ Exception -> 0x0189, all -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01dc A[Catch:{ Exception -> 0x0189, all -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ea A[Catch:{ Exception -> 0x0189, all -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f0 A[Catch:{ Exception -> 0x0189, all -> 0x0181 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0204 A[SYNTHETIC, Splitter:B:85:0x0204] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0130=Splitter:B:32:0x0130, B:13:0x0075=Splitter:B:13:0x0075} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedList<com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem> mo128867b(java.lang.String r27, int r28, com.tencent.p014mm.plugin.gallery.model.C93964k.C93967c r29, long r30) {
        /*
            r26 = this;
            r7 = r26
            r0 = r27
            r8 = r28
            r9 = r29
            java.lang.String r10 = "MicroMsg.AllMediaQuery"
            long r11 = java.lang.System.currentTimeMillis()
            r14 = 0
            r7.f271112g = r14     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            java.util.LinkedList r15 = new java.util.LinkedList     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            r15.<init>()     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            r6 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x00d2
            if (r8 == r5) goto L_0x0027
            if (r8 != r6) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            r1 = 0
            r2 = 0
            goto L_0x0071
        L_0x0027:
            android.content.ContentResolver r1 = r7.f271106h     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            com.tencent.mm.plugin.gallery.model.l r2 = r7.f271107i     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            r2.getClass()     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            android.net.Uri r17 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            com.tencent.mm.plugin.gallery.model.l r2 = r7.f271107i     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            java.lang.String[] r18 = r2.mo128899k()     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            com.tencent.mm.plugin.gallery.model.l r2 = r7.f271107i     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            java.lang.String[] r3 = r7.f271110e     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            java.lang.String r19 = r2.mo128901m(r3, r14)     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            r20 = 0
            com.tencent.mm.plugin.gallery.model.l r2 = r7.f271107i     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            java.lang.String r21 = r2.mo128898j(r14)     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            r16 = r1
            android.database.Cursor r1 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            android.content.ContentResolver r2 = r7.f271106h     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            com.tencent.mm.plugin.gallery.model.l r3 = r7.f271107i     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            r3.getClass()     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            android.net.Uri r17 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            com.tencent.mm.plugin.gallery.model.l r3 = r7.f271107i     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            java.lang.String[] r18 = r3.mo128899k()     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            com.tencent.mm.plugin.gallery.model.l r3 = r7.f271107i     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            java.lang.String[] r13 = r7.f271110e     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            java.lang.String r19 = r3.mo128901m(r13, r5)     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            r20 = 0
            com.tencent.mm.plugin.gallery.model.l r3 = r7.f271107i     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            java.lang.String r21 = r3.mo128898j(r5)     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            r16 = r2
            android.database.Cursor r2 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
        L_0x0071:
            if (r8 == r4) goto L_0x0075
            if (r8 != r6) goto L_0x012b
        L_0x0075:
            android.content.ContentResolver r3 = r7.f271106h     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            com.tencent.mm.plugin.gallery.model.p r13 = r7.f271108j     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            r13.getClass()     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            android.net.Uri r17 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            com.tencent.mm.plugin.gallery.model.p r13 = r7.f271108j     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            java.lang.String[] r18 = r13.mo128929k()     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            com.tencent.mm.plugin.gallery.model.p r13 = r7.f271108j     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            java.lang.String[] r4 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            java.lang.String[] r6 = r7.f271110e     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            r6 = r6[r14]     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            r4[r14] = r6     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            java.lang.String r19 = r13.mo128931m(r4, r14)     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            r20 = 0
            com.tencent.mm.plugin.gallery.model.p r4 = r7.f271108j     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            java.lang.String r21 = r4.mo128928j(r14)     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            r16 = r3
            android.database.Cursor r3 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            android.content.ContentResolver r4 = r7.f271106h     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            com.tencent.mm.plugin.gallery.model.p r6 = r7.f271108j     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r6.getClass()     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            android.net.Uri r17 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            com.tencent.mm.plugin.gallery.model.p r6 = r7.f271108j     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            java.lang.String[] r18 = r6.mo128929k()     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            com.tencent.mm.plugin.gallery.model.p r6 = r7.f271108j     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            java.lang.String[] r13 = new java.lang.String[r5]     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            java.lang.String[] r5 = r7.f271110e     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r5 = r5[r14]     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r13[r14] = r5     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r5 = 1
            java.lang.String r19 = r6.mo128931m(r13, r5)     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r20 = 0
            com.tencent.mm.plugin.gallery.model.p r6 = r7.f271108j     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            java.lang.String r21 = r6.mo128928j(r5)     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r16 = r4
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r13 = r1
            r5 = r3
            r3 = r4
            r6 = 3
            goto L_0x017a
        L_0x00d2:
            r1 = 1
            if (r8 == r1) goto L_0x00dd
            r1 = 3
            if (r8 != r1) goto L_0x00d9
            goto L_0x00dd
        L_0x00d9:
            r1 = 0
            r2 = 0
        L_0x00db:
            r3 = 2
            goto L_0x0125
        L_0x00dd:
            android.content.ContentResolver r1 = r7.f271106h     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            com.tencent.mm.plugin.gallery.model.l r2 = r7.f271107i     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            r2.getClass()     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            android.net.Uri r17 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            com.tencent.mm.plugin.gallery.model.l r2 = r7.f271107i     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            java.lang.String[] r18 = r2.mo128899k()     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            com.tencent.mm.plugin.gallery.model.l r2 = r7.f271107i     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            java.lang.String r19 = r2.mo128900l(r0, r14)     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            r20 = 0
            com.tencent.mm.plugin.gallery.model.l r2 = r7.f271107i     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            java.lang.String r21 = r2.mo128898j(r14)     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            r16 = r1
            android.database.Cursor r1 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0348, all -> 0x0340 }
            android.content.ContentResolver r2 = r7.f271106h     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            com.tencent.mm.plugin.gallery.model.l r3 = r7.f271107i     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            r3.getClass()     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            android.net.Uri r17 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            com.tencent.mm.plugin.gallery.model.l r3 = r7.f271107i     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            java.lang.String[] r18 = r3.mo128899k()     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            com.tencent.mm.plugin.gallery.model.l r3 = r7.f271107i     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            r4 = 1
            java.lang.String r19 = r3.mo128900l(r0, r4)     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            r20 = 0
            com.tencent.mm.plugin.gallery.model.l r3 = r7.f271107i     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            java.lang.String r21 = r3.mo128898j(r4)     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            r16 = r2
            android.database.Cursor r2 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x033c, all -> 0x0338 }
            goto L_0x00db
        L_0x0125:
            r6 = 3
            if (r8 == r3) goto L_0x0130
            if (r8 != r6) goto L_0x012b
            goto L_0x0130
        L_0x012b:
            r13 = r1
            r4 = r2
            r3 = 0
            r5 = 0
            goto L_0x017b
        L_0x0130:
            android.content.ContentResolver r3 = r7.f271106h     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            com.tencent.mm.plugin.gallery.model.p r4 = r7.f271108j     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            r4.getClass()     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            android.net.Uri r17 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            com.tencent.mm.plugin.gallery.model.p r4 = r7.f271108j     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            java.lang.String[] r18 = r4.mo128929k()     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            com.tencent.mm.plugin.gallery.model.p r4 = r7.f271108j     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            java.lang.String r19 = r4.mo128930l(r0, r14)     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            r20 = 0
            com.tencent.mm.plugin.gallery.model.p r4 = r7.f271108j     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            java.lang.String r21 = r4.mo128928j(r14)     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            r16 = r3
            android.database.Cursor r3 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0335, all -> 0x0332 }
            android.content.ContentResolver r4 = r7.f271106h     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            com.tencent.mm.plugin.gallery.model.p r5 = r7.f271108j     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r5.getClass()     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            android.net.Uri r17 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            com.tencent.mm.plugin.gallery.model.p r5 = r7.f271108j     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            java.lang.String[] r18 = r5.mo128929k()     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            com.tencent.mm.plugin.gallery.model.p r5 = r7.f271108j     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r13 = 1
            java.lang.String r19 = r5.mo128930l(r0, r13)     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r20 = 0
            com.tencent.mm.plugin.gallery.model.p r5 = r7.f271108j     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            java.lang.String r21 = r5.mo128928j(r13)     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r16 = r4
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x032b, all -> 0x0324 }
            r13 = r1
            r5 = r3
            r3 = r4
        L_0x017a:
            r4 = r2
        L_0x017b:
            if (r13 == 0) goto L_0x0191
            r13.moveToFirst()     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            goto L_0x0191
        L_0x0181:
            r0 = move-exception
            r21 = r3
            r2 = r4
            r22 = r5
            goto L_0x0372
        L_0x0189:
            r0 = move-exception
            r21 = r3
            r2 = r4
            r22 = r5
            goto L_0x034f
        L_0x0191:
            if (r4 == 0) goto L_0x0196
            r4.moveToFirst()     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
        L_0x0196:
            if (r5 == 0) goto L_0x019b
            r5.moveToFirst()     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
        L_0x019b:
            if (r3 == 0) goto L_0x01a0
            r3.moveToFirst()     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
        L_0x01a0:
            r1 = 1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r2 = r7.mo128872h(r13, r1)     // Catch:{ Exception -> 0x031b, all -> 0x0311 }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r16 = r7.mo128872h(r4, r1)     // Catch:{ Exception -> 0x031b, all -> 0x0311 }
            r1 = 2
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r17 = r7.mo128872h(r5, r1)     // Catch:{ Exception -> 0x031b, all -> 0x0311 }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r18 = r7.mo128872h(r3, r1)     // Catch:{ Exception -> 0x031b, all -> 0x0311 }
            r6 = r16
            r14 = r17
            r1 = r18
            r17 = 1
        L_0x01ba:
            if (r2 == 0) goto L_0x01be
            r8 = r2
            goto L_0x01bf
        L_0x01be:
            r8 = 0
        L_0x01bf:
            if (r6 == 0) goto L_0x01d4
            if (r8 == 0) goto L_0x01d0
            r18 = r11
            long r11 = r8.f162752i     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r20 = r8
            long r8 = r6.f162752i     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            int r21 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r21 >= 0) goto L_0x01d8
            goto L_0x01d2
        L_0x01d0:
            r18 = r11
        L_0x01d2:
            r8 = r6
            goto L_0x01da
        L_0x01d4:
            r20 = r8
            r18 = r11
        L_0x01d8:
            r8 = r20
        L_0x01da:
            if (r14 == 0) goto L_0x01ea
            if (r8 == 0) goto L_0x01e8
            long r11 = r8.f162752i     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r20 = r8
            long r8 = r14.f162752i     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            int r21 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r21 >= 0) goto L_0x01ec
        L_0x01e8:
            r8 = r14
            goto L_0x01ee
        L_0x01ea:
            r20 = r8
        L_0x01ec:
            r8 = r20
        L_0x01ee:
            if (r1 == 0) goto L_0x01fe
            if (r8 == 0) goto L_0x01fc
            long r11 = r8.f162752i     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r20 = r8
            long r8 = r1.f162752i     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            int r21 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r21 >= 0) goto L_0x0200
        L_0x01fc:
            r8 = r1
            goto L_0x0202
        L_0x01fe:
            r20 = r8
        L_0x0200:
            r8 = r20
        L_0x0202:
            if (r8 == 0) goto L_0x02a1
            r15.add(r8)     // Catch:{ Exception -> 0x031b, all -> 0x0311 }
            if (r8 != r2) goto L_0x0218
            r13.moveToNext()     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r2 = 1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r8 = r7.mo128872h(r13, r2)     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r11 = r1
            r12 = r8
            r2 = r17
            r8 = 2
            r9 = 1
            goto L_0x024c
        L_0x0218:
            if (r8 != r6) goto L_0x0228
            r4.moveToNext()     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r9 = 1
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r6 = r7.mo128872h(r4, r9)     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r11 = r1
            r12 = r2
            r2 = r17
            r8 = 2
            goto L_0x024c
        L_0x0228:
            r9 = 1
            if (r8 != r14) goto L_0x023c
            r5.moveToNext()     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r8 = 2
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r11 = r7.mo128872h(r5, r8)     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r12 = r2
            r14 = r6
            r2 = r17
            r8 = 2
            r17 = r11
            r11 = r1
            goto L_0x024f
        L_0x023c:
            if (r8 != r1) goto L_0x0247
            r3.moveToNext()     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            r8 = 2
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = r7.mo128872h(r3, r8)     // Catch:{ Exception -> 0x0189, all -> 0x0181 }
            goto L_0x0248
        L_0x0247:
            r8 = 2
        L_0x0248:
            r11 = r1
            r12 = r2
            r2 = r17
        L_0x024c:
            r17 = r14
            r14 = r6
        L_0x024f:
            r1 = r26
            r20 = r2
            r2 = r29
            r21 = r3
            r3 = r15
            r8 = r4
            r9 = r5
            r6 = 1
            r23 = 2
            r4 = r30
            r25 = r11
            r11 = 1
            r24 = 3
            r6 = r20
            boolean r1 = r1.mo128870d(r2, r3, r4, r6)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            if (r1 == 0) goto L_0x0272
            r1 = r20
            if (r1 == 0) goto L_0x0274
            r1 = 0
            goto L_0x0274
        L_0x0272:
            r1 = r20
        L_0x0274:
            boolean r2 = r7.f271112g     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            if (r2 == 0) goto L_0x028d
            if (r13 == 0) goto L_0x027d
            r13.close()
        L_0x027d:
            if (r8 == 0) goto L_0x0282
            r8.close()
        L_0x0282:
            if (r9 == 0) goto L_0x0287
            r9.close()
        L_0x0287:
            if (r21 == 0) goto L_0x028c
            r21.close()
        L_0x028c:
            return r15
        L_0x028d:
            r4 = r8
            r5 = r9
            r2 = r12
            r6 = r14
            r14 = r17
            r11 = r18
            r3 = r21
            r8 = r28
            r9 = r29
            r17 = r1
            r1 = r25
            goto L_0x01ba
        L_0x02a1:
            r2 = r29
            r21 = r3
            r8 = r4
            r9 = r5
            r1 = r17
            r11 = 1
            r23 = 2
            r24 = 3
            if (r2 == 0) goto L_0x02c8
            java.lang.String r3 = "finish, size: %d."
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            int r5 = r15.size()     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r3, r4)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            r3 = r30
            r2.mo80207B3(r15, r3, r1)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            goto L_0x02ca
        L_0x02c8:
            r3 = r30
        L_0x02ca:
            java.lang.String r1 = "[queryMediaItemsInAlbum] albumName:%s type:%s result size:%s ticket:%s cost:%s"
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            r5 = 0
            r2[r5] = r0     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            r2[r11] = r0     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            int r0 = r15.size()     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            r2[r23] = r0     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            java.lang.Long r0 = java.lang.Long.valueOf(r30)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            r2[r24] = r0     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            r0 = 4
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            long r3 = r3 - r18
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            r2[r0] = r3     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r2)     // Catch:{ Exception -> 0x030f, all -> 0x030d }
            if (r13 == 0) goto L_0x02fd
            r13.close()
        L_0x02fd:
            if (r8 == 0) goto L_0x0302
            r8.close()
        L_0x0302:
            if (r9 == 0) goto L_0x0307
            r9.close()
        L_0x0307:
            if (r21 == 0) goto L_0x030c
            r21.close()
        L_0x030c:
            return r15
        L_0x030d:
            r0 = move-exception
            goto L_0x0316
        L_0x030f:
            r0 = move-exception
            goto L_0x0320
        L_0x0311:
            r0 = move-exception
            r21 = r3
            r8 = r4
            r9 = r5
        L_0x0316:
            r2 = r8
            r22 = r9
            goto L_0x0372
        L_0x031b:
            r0 = move-exception
            r21 = r3
            r8 = r4
            r9 = r5
        L_0x0320:
            r2 = r8
            r22 = r9
            goto L_0x034f
        L_0x0324:
            r0 = move-exception
            r13 = r1
            r22 = r3
            r21 = 0
            goto L_0x0372
        L_0x032b:
            r0 = move-exception
            r13 = r1
            r22 = r3
            r21 = 0
            goto L_0x034f
        L_0x0332:
            r0 = move-exception
            r13 = r1
            goto L_0x0343
        L_0x0335:
            r0 = move-exception
            r13 = r1
            goto L_0x034b
        L_0x0338:
            r0 = move-exception
            r13 = r1
            r2 = 0
            goto L_0x0343
        L_0x033c:
            r0 = move-exception
            r13 = r1
            r2 = 0
            goto L_0x034b
        L_0x0340:
            r0 = move-exception
            r2 = 0
            r13 = 0
        L_0x0343:
            r21 = 0
            r22 = 0
            goto L_0x0372
        L_0x0348:
            r0 = move-exception
            r2 = 0
            r13 = 0
        L_0x034b:
            r21 = 0
            r22 = 0
        L_0x034f:
            java.lang.String r1 = ""
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0371 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r1, r3)     // Catch:{ all -> 0x0371 }
            if (r13 == 0) goto L_0x035c
            r13.close()
        L_0x035c:
            if (r2 == 0) goto L_0x0361
            r2.close()
        L_0x0361:
            if (r22 == 0) goto L_0x0366
            r22.close()
        L_0x0366:
            if (r21 == 0) goto L_0x036b
            r21.close()
        L_0x036b:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            return r0
        L_0x0371:
            r0 = move-exception
        L_0x0372:
            if (r13 == 0) goto L_0x0377
            r13.close()
        L_0x0377:
            if (r2 == 0) goto L_0x037c
            r2.close()
        L_0x037c:
            if (r22 == 0) goto L_0x0381
            r22.close()
        L_0x0381:
            if (r21 == 0) goto L_0x0386
            r21.close()
        L_0x0386:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.model.C93945a.mo128867b(java.lang.String, int, com.tencent.mm.plugin.gallery.model.k$c, long):java.util.LinkedList");
    }

    public int compare(Object obj, Object obj2) {
        return Long.compare(((GalleryItem$MediaItem) obj).f162752i, ((GalleryItem$MediaItem) obj2).f162752i);
    }
}
