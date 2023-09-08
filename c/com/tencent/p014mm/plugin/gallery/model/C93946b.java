package com.tencent.p014mm.plugin.gallery.model;

import android.database.Cursor;
import cc0.C79995a;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import hw1.C33105o;
import java.util.Iterator;
import java.util.LinkedList;
import qe3.C89625d;
import qw1.C101316l;

/* renamed from: com.tencent.mm.plugin.gallery.model.b */
public abstract class C93946b implements C93964k {

    /* renamed from: d */
    public int f271109d = 100;

    /* renamed from: e */
    public String[] f271110e = {"camera", "screenshots", "download"};

    /* renamed from: f */
    public boolean f271111f = false;

    /* renamed from: g */
    public volatile boolean f271112g = false;

    /* renamed from: f */
    public static void m118719f(String str, String str2, int i, GalleryItem$MediaItem galleryItem$MediaItem) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        long g = m118720g(str, currentTimeMillis, i == 1, true);
        if (i != 1) {
            z = false;
        }
        long g2 = m118720g(str2, currentTimeMillis, z, false);
        if (g <= 0) {
            g = g2;
        }
        galleryItem$MediaItem.f162752i = g;
        galleryItem$MediaItem.f162754n = g2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m118720g(java.lang.String r35, long r36, boolean r38, boolean r39) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r35)
            r1 = 0
            if (r0 != 0) goto L_0x0185
            r9 = 10
            r11 = 11
            r13 = 12
            r15 = 13
            r17 = 14
            r19 = 15
            r21 = 16
            r23 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r0 = r35
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r1)     // Catch:{ NumberFormatException -> 0x00a1, all -> 0x009d }
            int r0 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x002a
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NumberFormatException -> 0x009b }
            long r5 = r5.convert(r3, r5)     // Catch:{ NumberFormatException -> 0x009b }
            goto L_0x0032
        L_0x002a:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NumberFormatException -> 0x009b }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NumberFormatException -> 0x009b }
            long r5 = r5.convert(r3, r6)     // Catch:{ NumberFormatException -> 0x009b }
        L_0x0032:
            int r23 = (r5 > r36 ? 1 : (r5 == r36 ? 0 : -1))
            if (r23 <= 0) goto L_0x005d
            if (r39 == 0) goto L_0x004b
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x0041
            r28 = r15
            goto L_0x0043
        L_0x0041:
            r28 = r17
        L_0x0043:
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
            goto L_0x005d
        L_0x004b:
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x0054
            r18 = r19
            goto L_0x0056
        L_0x0054:
            r18 = r21
        L_0x0056:
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
        L_0x005d:
            if (r0 <= 0) goto L_0x0074
            if (r39 == 0) goto L_0x0085
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x006a
            r28 = 9
            goto L_0x006c
        L_0x006a:
            r28 = r9
        L_0x006c:
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
            goto L_0x0085
        L_0x0074:
            if (r39 != 0) goto L_0x0085
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x007e
            r10 = r11
            goto L_0x007f
        L_0x007e:
            r10 = r13
        L_0x007f:
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
        L_0x0085:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009a
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 363(0x16b, double:1.793E-321)
            if (r39 == 0) goto L_0x0092
            r10 = 17
            goto L_0x0094
        L_0x0092:
            r10 = 18
        L_0x0094:
            r12 = 1
            r14 = 0
            r7.idkeyStat(r8, r10, r12, r14)
        L_0x009a:
            return r5
        L_0x009b:
            r0 = move-exception
            goto L_0x00a3
        L_0x009d:
            r0 = move-exception
            r3 = r1
            goto L_0x011a
        L_0x00a1:
            r0 = move-exception
            r3 = r1
        L_0x00a3:
            java.lang.String r5 = "MicroMsg.BaseMediaQuery"
            java.lang.String r6 = ""
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r7)     // Catch:{ all -> 0x0119 }
            int r0 = (r1 > r36 ? 1 : (r1 == r36 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            if (r39 == 0) goto L_0x00c6
            com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x00bc
            r30 = r15
            goto L_0x00be
        L_0x00bc:
            r30 = r17
        L_0x00be:
            r32 = 1
            r34 = 0
            r27.idkeyStat(r28, r30, r32, r34)
            goto L_0x00d8
        L_0x00c6:
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x00cf
            r18 = r19
            goto L_0x00d1
        L_0x00cf:
            r18 = r21
        L_0x00d1:
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
        L_0x00d8:
            int r0 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f1
            if (r39 == 0) goto L_0x0102
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x00e7
            r18 = 9
            goto L_0x00e9
        L_0x00e7:
            r18 = r9
        L_0x00e9:
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x0102
        L_0x00f1:
            if (r39 != 0) goto L_0x0102
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x00fb
            r8 = r11
            goto L_0x00fc
        L_0x00fb:
            r8 = r13
        L_0x00fc:
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
        L_0x0102:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0185
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 363(0x16b, double:1.793E-321)
            if (r39 == 0) goto L_0x010f
            r6 = 17
            goto L_0x0111
        L_0x010f:
            r6 = 18
        L_0x0111:
            r8 = 1
            r10 = 0
            r3.idkeyStat(r4, r6, r8, r10)
            goto L_0x0185
        L_0x0119:
            r0 = move-exception
        L_0x011a:
            int r5 = (r1 > r36 ? 1 : (r1 == r36 ? 0 : -1))
            if (r5 <= 0) goto L_0x0145
            if (r39 == 0) goto L_0x0133
            com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r28 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x0129
            r30 = r15
            goto L_0x012b
        L_0x0129:
            r30 = r17
        L_0x012b:
            r32 = 1
            r34 = 0
            r27.idkeyStat(r28, r30, r32, r34)
            goto L_0x0145
        L_0x0133:
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x013c
            r18 = r19
            goto L_0x013e
        L_0x013c:
            r18 = r21
        L_0x013e:
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
        L_0x0145:
            int r5 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r5 <= 0) goto L_0x015e
            if (r39 == 0) goto L_0x016f
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x0154
            r18 = 9
            goto L_0x0156
        L_0x0154:
            r18 = r9
        L_0x0156:
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x016f
        L_0x015e:
            if (r39 != 0) goto L_0x016f
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 363(0x16b, double:1.793E-321)
            if (r38 == 0) goto L_0x0168
            r8 = r11
            goto L_0x0169
        L_0x0168:
            r8 = r13
        L_0x0169:
            r10 = 1
            r12 = 0
            r5.idkeyStat(r6, r8, r10, r12)
        L_0x016f:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0184
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 363(0x16b, double:1.793E-321)
            if (r39 == 0) goto L_0x017c
            r9 = 17
            goto L_0x017e
        L_0x017c:
            r9 = 18
        L_0x017e:
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
        L_0x0184:
            throw r0
        L_0x0185:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.model.C93946b.m118720g(java.lang.String, long, boolean, boolean):long");
    }

    /* renamed from: c */
    public GalleryItem$AlbumItem mo128869c(Cursor cursor, int i, String str) {
        int i2;
        Cursor cursor2 = cursor;
        try {
            long safeParseLong = Util.safeParseLong(cursor2.getString(cursor2.getColumnIndexOrThrow("_id")));
            String string = cursor2.getString(cursor2.getColumnIndexOrThrow("_data"));
            String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow(str));
            String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("date_modified"));
            String string4 = cursor2.getString(cursor2.getColumnIndexOrThrow("datetaken"));
            if (Util.isNullOrNil(string2)) {
                Log.m105920e("MicroMsg.BaseMediaQuery", "null or nil album name, ignore this folder");
                return null;
            }
            if (C101316l.m132915n()) {
                i2 = 0;
            } else {
                int i3 = cursor2.getInt(3);
                if (i3 != 0) {
                    if (!Util.isNullOrNil(string)) {
                        i2 = i3;
                    }
                }
                Log.m105920e("MicroMsg.BaseMediaQuery", "query album failed, " + i3 + ", " + string);
                return null;
            }
            Log.m105919d("MicroMsg.BaseMediaQuery", "%s(%s) path:%s", string2, Integer.valueOf(i2), string);
            GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(i, safeParseLong, Util.isNullOrNil(string) ? null : string, (String) null, cursor2.getString(cursor2.getColumnIndexOrThrow("mime_type")));
            m118719f(string3, string4, i, c);
            GalleryItem$AlbumItem galleryItem$AlbumItem = new GalleryItem$AlbumItem(string2, i2);
            galleryItem$AlbumItem.f271101i = c;
            String string5 = cursor2.getString(cursor2.getColumnIndexOrThrow("bucket_id"));
            galleryItem$AlbumItem.f271099g = string5;
            if (!Util.isNullOrNil(string5)) {
                String P1 = ((C33105o) C86312j.m106911c(C33105o.class)).mo58981P1(galleryItem$AlbumItem.f271099g);
                if (!Util.isNullOrNil(P1)) {
                    galleryItem$AlbumItem.f271097e = P1;
                }
            }
            galleryItem$AlbumItem.f271100h = 0;
            galleryItem$AlbumItem.f271104o = C101316l.m132915n();
            return galleryItem$AlbumItem;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.BaseMediaQuery", th, "#albumConvertFrom failed", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public boolean mo128870d(C93964k.C93967c cVar, LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
        if (!this.f271111f) {
            if (z) {
                this.f271109d = 200;
            } else {
                this.f271109d = 5000;
            }
        }
        if (cVar != null) {
            int size = linkedList.size();
            int i = this.f271109d;
            if (size % i == 0) {
                Log.m105919d("MicroMsg.BaseMediaQuery", "page notify, notifyCount: %d.", Integer.valueOf(i));
                cVar.mo80207B3(linkedList, j, z);
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo128871e(LinkedList<GalleryItem$AlbumItem> linkedList) {
        Iterator<GalleryItem$AlbumItem> it = linkedList.iterator();
        GalleryItem$MediaItem galleryItem$MediaItem = null;
        int i = 0;
        while (it.hasNext()) {
            GalleryItem$AlbumItem next = it.next();
            if (!next.f271104o) {
                i += next.f271098f;
            }
            if (galleryItem$MediaItem == null) {
                galleryItem$MediaItem = next.f271101i;
            }
        }
        GalleryItem$AlbumItem galleryItem$AlbumItem = new GalleryItem$AlbumItem("", i);
        galleryItem$AlbumItem.f271102j = true;
        if (galleryItem$MediaItem != null) {
            galleryItem$AlbumItem.f271101i = galleryItem$MediaItem;
        } else {
            galleryItem$AlbumItem.f271101i = new GalleryItem$ImageMediaItem();
        }
        linkedList.add(0, galleryItem$AlbumItem);
    }

    /* renamed from: h */
    public GalleryItem$MediaItem mo128872h(Cursor cursor, int i) {
        if (cursor != null && !cursor.isAfterLast() && !cursor.isClosed()) {
            while (!cursor.isAfterLast()) {
                try {
                    if (cursor.getColumnIndexOrThrow("_id") >= 0) {
                        long safeParseLong = Util.safeParseLong(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("date_modified"));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("datetaken"));
                        GalleryItem$MediaItem galleryItem$ImageMediaItem = i == 1 ? new GalleryItem$ImageMediaItem(safeParseLong) : new GalleryItem$VideoMediaItem(safeParseLong);
                        galleryItem$ImageMediaItem.f162747d = string;
                        m118719f(string2, string3, i, galleryItem$ImageMediaItem);
                        if (C89625d.f257842h) {
                            Log.m105926v("MicroMsg.BaseMediaQuery", "[mediaConvertFrom] [" + safeParseLong + " " + string2 + " " + string3 + "] | " + galleryItem$ImageMediaItem.f162752i + " " + i);
                        } else {
                            Log.m105918d("MicroMsg.BaseMediaQuery", "[mediaConvertFrom] [" + safeParseLong + " " + string2 + " " + string3 + "] | " + galleryItem$ImageMediaItem.f162752i + " " + i);
                        }
                        if (!Util.isNullOrNil(galleryItem$ImageMediaItem.f162747d) || !Util.isNullOrNil(galleryItem$ImageMediaItem.f162750g)) {
                            String string4 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
                            if (Util.isNullOrNil(string4)) {
                                string4 = "";
                            }
                            galleryItem$ImageMediaItem.f162755o = string4;
                            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("latitude");
                            if (cursor.getType(columnIndexOrThrow) != 0) {
                                double d = cursor.getDouble(columnIndexOrThrow);
                                if (C79995a.m97218a(d)) {
                                    galleryItem$ImageMediaItem.f162757q = d;
                                }
                            }
                            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("longitude");
                            if (cursor.getType(columnIndexOrThrow2) != 0) {
                                double d2 = cursor.getDouble(columnIndexOrThrow2);
                                if (C79995a.m97219b(d2)) {
                                    galleryItem$ImageMediaItem.f162756p = d2;
                                }
                            }
                            return galleryItem$ImageMediaItem;
                        }
                        Log.m105928w("MicroMsg.BaseMediaQuery", "thumb file and original file both not exist");
                        cursor.moveToNext();
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.BaseMediaQuery", th, "", new Object[0]);
                }
            }
            return null;
        }
        return null;
    }
}
