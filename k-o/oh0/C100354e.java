package oh0;

import q60.C101035b;

/* renamed from: oh0.e */
public final class C100354e extends C101035b {
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0108, code lost:
        if (r9 != null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0165, code lost:
        if (r6 != null) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0193  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w60.C65941g<android.graphics.Bitmap> mo87424a(r60.C101350i<?> r20, k60.C99102f<?, android.graphics.Bitmap> r21, y60.C102802a r22) {
        /*
            r19 = this;
            r1 = r21
            r2 = r22
            java.lang.Class<ds.n> r3 = p143ds.C97528n.class
            java.lang.String r0 = "targetView"
            r4 = r20
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "reaper"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "input"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.Object r0 = r2.f303503h
            boolean r4 = r0 instanceof oh0.C100353d
            if (r4 == 0) goto L_0x0022
            oh0.d r0 = (oh0.C100353d) r0
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            java.lang.String r4 = "AlbumThumbProducer"
            if (r0 == 0) goto L_0x01bd
            ig.d r6 = r0.f293935f
            int r6 = r6.mo55274P()
            r7 = 4
            r8 = 2
            if (r6 == r8) goto L_0x0036
            if (r6 == r7) goto L_0x0036
        L_0x0033:
            r5 = 0
            goto L_0x0191
        L_0x0036:
            th0.a r6 = th0.C101880a.f299976a
            long r9 = r0.f293933d
            ig.d r11 = r0.f293935f
            int r11 = r11.mo55274P()
            java.lang.String r12 = r0.f293936g
            n60.f r0 = r1.f290573b
            int r13 = r0.f293168f
            int r14 = r0.f293169g
            java.lang.String r15 = "MicroMsg.AlbumMediaUtil"
            r5 = 0
            if (r11 == r8) goto L_0x00b6
            if (r11 == r7) goto L_0x0050
            goto L_0x0033
        L_0x0050:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0061 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0061 }
            r6 = 1
            r11 = 0
            android.graphics.Bitmap r0 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r0, r9, r6, r11)     // Catch:{ Exception -> 0x005f }
            goto L_0x0072
        L_0x005f:
            r0 = move-exception
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            r6 = 1
            r11 = 0
        L_0x0064:
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r7[r5] = r0
            java.lang.String r0 = "exception: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r7)
            r0 = r11
        L_0x0072:
            if (r0 != 0) goto L_0x00b3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r0[r5] = r7
            r0[r6] = r12
            java.lang.String r7 = "get video thumb failed : [%d] [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r7, r0)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createVideoThumbnail(r12, r6)
            if (r0 != 0) goto L_0x00a5
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r7 != 0) goto L_0x00a5
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Long r8 = java.lang.Long.valueOf(r9)
            r7[r5] = r8
            r7[r6] = r12
            java.lang.String r5 = "get video thumb failed : [%d], call media scanner : [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r5, r7)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.p014mm.sdk.system.AndroidMediaUtil.refreshMediaScanner(r12, r5)
        L_0x00a5:
            if (r0 != 0) goto L_0x00b3
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r5 != 0) goto L_0x00b3
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r12, r13, r14)
            goto L_0x0191
        L_0x00b3:
            r5 = r0
            goto L_0x0191
        L_0x00b6:
            r11 = 0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "imgPath is invalid."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            r9 = r11
            goto L_0x0128
        L_0x00c5:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            if (r12 == 0) goto L_0x00d4
            androidx.exifinterface.media.ExifInterface r9 = new androidx.exifinterface.media.ExifInterface     // Catch:{ FileNotFoundException | IOException | Exception | IndexOutOfBoundsException | OutOfMemoryError -> 0x00d2 }
            r9.<init>((java.lang.String) r12)     // Catch:{ FileNotFoundException | IOException | Exception | IndexOutOfBoundsException | OutOfMemoryError -> 0x00d2 }
            goto L_0x00d5
        L_0x00d2:
            goto L_0x00eb
        L_0x00d4:
            r9 = r11
        L_0x00d5:
            if (r9 == 0) goto L_0x00dc
            byte[] r9 = r9.getThumbnail()     // Catch:{ FileNotFoundException | IOException | Exception | IndexOutOfBoundsException | OutOfMemoryError -> 0x00d2 }
            goto L_0x00dd
        L_0x00dc:
            r9 = r11
        L_0x00dd:
            if (r9 == 0) goto L_0x00eb
            android.graphics.Bitmap r9 = r6.mo141346c(r9, r0, r13)     // Catch:{ FileNotFoundException | IOException | Exception | IndexOutOfBoundsException | OutOfMemoryError -> 0x00d2 }
            if (r9 == 0) goto L_0x00eb
            java.lang.String r10 = "decode thumb success from exif."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r10)     // Catch:{ FileNotFoundException | IOException | Exception | IndexOutOfBoundsException | OutOfMemoryError -> 0x00d2 }
            goto L_0x0128
        L_0x00eb:
            java.lang.String r9 = "decodeThumbnail fail!!!"
            if (r12 == 0) goto L_0x0103
            java.lang.String r10 = "r"
            android.os.ParcelFileDescriptor r10 = com.tencent.p014mm.vfs.C86013q1.m106465z(r12, r10)     // Catch:{ FileNotFoundException -> 0x0101, Exception -> 0x00ff, OutOfMemoryError -> 0x00fd, all -> 0x00fb }
            java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0101, Exception -> 0x00ff, OutOfMemoryError -> 0x00fd, all -> 0x00fb }
            goto L_0x0104
        L_0x00fb:
            r0 = move-exception
            goto L_0x010b
        L_0x00fd:
            r0 = move-exception
            goto L_0x0113
        L_0x00ff:
            r0 = move-exception
            goto L_0x0119
        L_0x0101:
            r0 = move-exception
            goto L_0x011f
        L_0x0103:
            r10 = r11
        L_0x0104:
            android.graphics.Bitmap r9 = r6.mo141347d(r10, r0, r13)     // Catch:{ FileNotFoundException -> 0x0101, Exception -> 0x00ff, OutOfMemoryError -> 0x00fd, all -> 0x00fb }
            if (r9 == 0) goto L_0x0124
            goto L_0x0128
        L_0x010b:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r9 = "err!!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r9, r6)
            goto L_0x0124
        L_0x0113:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r9, r6)
            goto L_0x0124
        L_0x0119:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r9, r6)
            goto L_0x0124
        L_0x011f:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r9, r6)
        L_0x0124:
            android.graphics.Bitmap r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r12, r13, r13)
        L_0x0128:
            if (r9 == 0) goto L_0x0168
            long r13 = java.lang.System.currentTimeMillis()
            int r0 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r12)
            float r6 = (float) r0
            android.graphics.Bitmap r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r9, r6)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r10 = r9.getWidth()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7[r5] = r10
            int r9 = r9.getHeight()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 1
            r7[r10] = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r8] = r0
            r0 = 3
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r13
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r7[r0] = r9
            java.lang.String r0 = "do rotate finish, width[%d] height[%d] rotate[%d] use[%dms]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r0, r7)
            if (r6 == 0) goto L_0x0168
            goto L_0x0169
        L_0x0168:
            r6 = r11
        L_0x0169:
            if (r6 == 0) goto L_0x0174
            boolean r0 = r6.isRecycled()
            r7 = 1
            if (r0 != r7) goto L_0x0174
            r0 = 1
            goto L_0x0175
        L_0x0174:
            r0 = 0
        L_0x0175:
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = "get bitmap from file failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
            goto L_0x0182
        L_0x017d:
            java.lang.String r0 = "get bitmap from file."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r0)
        L_0x0182:
            if (r6 != 0) goto L_0x0190
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r5] = r12
            r5 = 1
            r0[r5] = r12
            java.lang.String r5 = "get thumb from content resolver failed: [%s], [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r5, r0)
        L_0x0190:
            r5 = r6
        L_0x0191:
            if (r5 != 0) goto L_0x01b7
            o40.b r0 = new o40.b
            r0.<init>(r4)
            java.io.InputStream r7 = r22.mo142542a()
            if (r7 == 0) goto L_0x01b4
            n60.f r1 = r1.f290573b
            int r8 = r1.f293168f
            int r9 = r1.f293169g
            di3.d r1 = di3.C86312j.m106911c(r3)
            r6 = r1
            ds.n r6 = (p143ds.C97528n) r6
            r10 = 1
            r11 = 0
            r12 = 1
            android.graphics.Bitmap r5 = r6.mo136634Vf(r7, r8, r9, r10, r11, r12)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x01b4:
            r0.mo86838a()
        L_0x01b7:
            w60.g r0 = new w60.g
            r0.<init>(r5)
            return r0
        L_0x01bd:
            r11 = 0
            o40.b r0 = new o40.b
            r0.<init>(r4)
            java.io.InputStream r13 = r22.mo142542a()
            if (r13 == 0) goto L_0x01e3
            n60.f r1 = r1.f290573b
            int r14 = r1.f293168f
            int r15 = r1.f293169g
            di3.d r1 = di3.C86312j.m106911c(r3)
            r12 = r1
            ds.n r12 = (p143ds.C97528n) r12
            r16 = 1
            r17 = 0
            r18 = 1
            android.graphics.Bitmap r5 = r12.mo136634Vf(r13, r14, r15, r16, r17, r18)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x01e4
        L_0x01e3:
            r5 = r11
        L_0x01e4:
            r0.mo86838a()
            w60.g r0 = new w60.g
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oh0.C100354e.mo87424a(r60.i, k60.f, y60.a):w60.g");
    }
}
