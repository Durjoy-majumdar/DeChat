package com.tencent.p014mm.sdk.platformtools;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: com.tencent.mm.sdk.platformtools.JpegTools */
public class JpegTools {
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final String TAG = "MicroMsg.JpegTools";
    private boolean bigOrder = true;
    private MBuf buf = null;
    private int ordivalue = -1;

    public JpegTools(byte[] bArr) {
        MBuf mBuf = new MBuf();
        this.buf = mBuf;
        mBuf.setBuffer(bArr);
    }

    public static String byte2HexString(byte b) {
        String hexString = Integer.toHexString(b & ExifInterface.MARKER);
        if (hexString.length() == 1) {
            hexString = '0' + hexString;
        }
        return "" + hexString.toUpperCase();
    }

    private String byteOrder() {
        byte b = this.buf.getBuffer().get();
        byte b2 = this.buf.getBuffer().get();
        char c = (char) b;
        return (c == 'M' && ((char) b2) == 'M') ? "MM" : (c == 'I' && ((char) b2) == 'I') ? "II" : "";
    }

    private boolean checkExifTag() {
        byte b = this.buf.getBuffer().get();
        byte b2 = this.buf.getBuffer().get();
        byte b3 = this.buf.getBuffer().get();
        byte b4 = this.buf.getBuffer().get();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) b);
        sb.append((char) b2);
        sb.append((char) b3);
        sb.append((char) b4);
        return sb.toString().equals("Exif");
    }

    private boolean checkIsJpeg() {
        return byte2HexString(this.buf.getBuffer().get()).equals("FF") && byte2HexString(this.buf.getBuffer().get()).equals("D8");
    }

    private boolean checkTiffTag(boolean z) {
        byte b = this.buf.getBuffer().get();
        byte b2 = this.buf.getBuffer().get();
        if (z && byte2HexString(b).equals("00") && byte2HexString(b2).equals("2A")) {
            return true;
        }
        if (byte2HexString(b).equals("2A") && byte2HexString(b2).equals("00")) {
            return true;
        }
        Log.m105928w(TAG, "checkTiffTag: " + byte2HexString(b) + " " + byte2HexString(b2));
        return false;
    }

    private void dropByte(int i) {
        this.buf.getBuffer().position(this.buf.getBuffer().position() + i);
    }

    private int findAppTag() {
        int i = 0;
        do {
            byte b = this.buf.getBuffer().get();
            byte b2 = this.buf.getBuffer().get();
            this.buf.getBuffer().get();
            byte b3 = this.buf.getBuffer().get();
            if (!byte2HexString(b).equals("FF")) {
                return -1;
            }
            if (byte2HexString(b).equals("FF") && byte2HexString(b2).equals("E1")) {
                return (b3 & ExifInterface.MARKER) - 2;
            }
            if (byte2HexString(b).equals("FF") && byte2HexString(b2).equals("D9")) {
                return -1;
            }
            this.buf.getBuffer().position((this.buf.getOffset() + b3) - 2);
            i++;
        } while (i <= 100);
        Log.m105920e(TAG, "error while!");
        return -1;
    }

    private int getOffset() {
        dropByte(4);
        return 0;
    }

    private int getOrei(boolean z) {
        byte b = this.buf.getBuffer().get();
        byte b2 = this.buf.getBuffer().get();
        dropByte(2);
        return z ? b2 & ExifInterface.MARKER : b & ExifInterface.MARKER;
    }

    public int getOreiValue() {
        int i = this.ordivalue;
        if (i != -1) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 180;
            }
            if (i != 6) {
                return i != 8 ? -1 : 270;
            }
            return 90;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        if (byte2HexString(r8).equals("12") != false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int parserJpeg() {
        /*
            r13 = this;
            java.lang.String r0 = "MM"
            java.lang.String r1 = "MicroMsg.JpegTools"
            r2 = -1
            boolean r3 = r13.checkIsJpeg()     // Catch:{ Exception -> 0x010b }
            if (r3 != 0) goto L_0x0011
            java.lang.String r0 = "this is not jpeg or no exif data!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ Exception -> 0x010b }
            return r2
        L_0x0011:
            int r3 = r13.findAppTag()     // Catch:{ Exception -> 0x010b }
            if (r3 >= 0) goto L_0x001d
            java.lang.String r0 = "datalen is error "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ Exception -> 0x010b }
            return r2
        L_0x001d:
            boolean r3 = r13.checkExifTag()     // Catch:{ Exception -> 0x010b }
            if (r3 != 0) goto L_0x0029
            java.lang.String r0 = "checkExifTag is error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ Exception -> 0x010b }
            return r2
        L_0x0029:
            r3 = 2
            r13.dropByte(r3)     // Catch:{ Exception -> 0x010b }
            java.lang.String r4 = r13.byteOrder()     // Catch:{ Exception -> 0x010b }
            boolean r5 = r4.equals(r0)     // Catch:{ Exception -> 0x010b }
            if (r5 != 0) goto L_0x0054
            java.lang.String r5 = "II"
            boolean r5 = r4.equals(r5)     // Catch:{ Exception -> 0x010b }
            if (r5 != 0) goto L_0x0054
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010b }
            r0.<init>()     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = "byteOrder  is error "
            r0.append(r3)     // Catch:{ Exception -> 0x010b }
            r0.append(r4)     // Catch:{ Exception -> 0x010b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ Exception -> 0x010b }
            return r2
        L_0x0054:
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010b }
            r13.bigOrder = r0     // Catch:{ Exception -> 0x010b }
            boolean r0 = r13.checkTiffTag(r0)     // Catch:{ Exception -> 0x010b }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "checkTiffTag  is error "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)     // Catch:{ Exception -> 0x010b }
            return r2
        L_0x0066:
            r13.getOffset()     // Catch:{ Exception -> 0x010b }
            com.tencent.mm.sdk.platformtools.MBuf r0 = r13.buf     // Catch:{ Exception -> 0x010b }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ Exception -> 0x010b }
            byte r0 = r0.get()     // Catch:{ Exception -> 0x010b }
            com.tencent.mm.sdk.platformtools.MBuf r4 = r13.buf     // Catch:{ Exception -> 0x010b }
            java.nio.ByteBuffer r4 = r4.getBuffer()     // Catch:{ Exception -> 0x010b }
            byte r4 = r4.get()     // Catch:{ Exception -> 0x010b }
            r5 = 255(0xff, float:3.57E-43)
            r0 = r0 & r5
            boolean r6 = r13.bigOrder     // Catch:{ Exception -> 0x010b }
            if (r6 == 0) goto L_0x0086
            r0 = r4 & 255(0xff, float:3.57E-43)
        L_0x0086:
            r4 = 0
            r6 = 0
        L_0x0088:
            if (r4 >= r0) goto L_0x00f0
            if (r4 >= r5) goto L_0x00f0
            com.tencent.mm.sdk.platformtools.MBuf r7 = r13.buf     // Catch:{ Exception -> 0x010b }
            java.nio.ByteBuffer r7 = r7.getBuffer()     // Catch:{ Exception -> 0x010b }
            byte r7 = r7.get()     // Catch:{ Exception -> 0x010b }
            com.tencent.mm.sdk.platformtools.MBuf r8 = r13.buf     // Catch:{ Exception -> 0x010b }
            java.nio.ByteBuffer r8 = r8.getBuffer()     // Catch:{ Exception -> 0x010b }
            byte r8 = r8.get()     // Catch:{ Exception -> 0x010b }
            boolean r9 = r13.bigOrder     // Catch:{ Exception -> 0x010b }
            java.lang.String r10 = "12"
            java.lang.String r11 = "01"
            r12 = 1
            if (r9 == 0) goto L_0x00bf
            java.lang.String r9 = byte2HexString(r7)     // Catch:{ Exception -> 0x010b }
            boolean r9 = r9.equals(r11)     // Catch:{ Exception -> 0x010b }
            if (r9 == 0) goto L_0x00bf
            java.lang.String r9 = byte2HexString(r8)     // Catch:{ Exception -> 0x010b }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x010b }
            if (r9 == 0) goto L_0x00bf
        L_0x00bd:
            r6 = 1
            goto L_0x00d8
        L_0x00bf:
            boolean r9 = r13.bigOrder     // Catch:{ Exception -> 0x010b }
            if (r9 != 0) goto L_0x00d8
            java.lang.String r7 = byte2HexString(r7)     // Catch:{ Exception -> 0x010b }
            boolean r7 = r7.equals(r10)     // Catch:{ Exception -> 0x010b }
            if (r7 == 0) goto L_0x00d8
            java.lang.String r7 = byte2HexString(r8)     // Catch:{ Exception -> 0x010b }
            boolean r7 = r7.equals(r11)     // Catch:{ Exception -> 0x010b }
            if (r7 == 0) goto L_0x00d8
            goto L_0x00bd
        L_0x00d8:
            r13.dropByte(r3)     // Catch:{ Exception -> 0x010b }
            r7 = 4
            r13.dropByte(r7)     // Catch:{ Exception -> 0x010b }
            if (r6 == 0) goto L_0x00ea
            boolean r0 = r13.bigOrder     // Catch:{ Exception -> 0x010b }
            int r0 = r13.getOrei(r0)     // Catch:{ Exception -> 0x010b }
            r13.ordivalue = r0     // Catch:{ Exception -> 0x010b }
            goto L_0x00f0
        L_0x00ea:
            r13.dropByte(r7)     // Catch:{ Exception -> 0x010b }
            int r4 = r4 + 1
            goto L_0x0088
        L_0x00f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010b }
            r0.<init>()     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = "orei "
            r0.append(r3)     // Catch:{ Exception -> 0x010b }
            int r3 = r13.ordivalue     // Catch:{ Exception -> 0x010b }
            r0.append(r3)     // Catch:{ Exception -> 0x010b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ Exception -> 0x010b }
            int r0 = r13.getOreiValue()
            return r0
        L_0x010b:
            java.lang.String r0 = "parser jpeg error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.JpegTools.parserJpeg():int");
    }
}
