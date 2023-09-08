package p384tk;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import jg3.C98942a;
import p008bq.C92285m0;
import p490dl.C97489o;

/* renamed from: tk.a */
public class C101897a implements C92285m0 {

    /* renamed from: b */
    public static C101897a f300054b;

    /* renamed from: a */
    public String f300055a;

    /* renamed from: e */
    public static C101897a m134075e() {
        if (f300054b == null) {
            synchronized (C101897a.class) {
                f300054b = new C101897a();
            }
        }
        return f300054b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo126270A2(com.tencent.p014mm.api.IEmojiInfo r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = 0
            java.lang.String r4 = "MicroMsg.emoji.EmojiFileEncryptMgr"
            if (r2 != 0) goto L_0x000f
            java.lang.String r0 = "decodeEmojiData failed. emoji is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            return r3
        L_0x000f:
            java.lang.String r5 = r22.mo62640K1()
            r0 = -1
            r6 = 0
            byte[] r7 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r6, r0)
            long r8 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            r10 = 0
            r12 = 1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
            if (r7 == 0) goto L_0x00db
            int r0 = r7.length
            r8 = 10
            if (r0 < r8) goto L_0x00db
            byte[] r0 = new byte[r8]
            java.lang.System.arraycopy(r7, r6, r0, r6, r8)
            int r8 = r22.getExtFlag()
            r8 = r8 & r12
            if (r8 == r12) goto L_0x0045
            boolean r0 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImageFile(r0)
            if (r0 != 0) goto L_0x003e
            goto L_0x0045
        L_0x003e:
            boolean r0 = r1.mo141393b(r2, r7)
            if (r0 == 0) goto L_0x00da
            return r7
        L_0x0045:
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            int r0 = (int) r10
            r10 = 1024(0x400, float:1.435E-42)
            if (r0 <= r10) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r10 = r0
        L_0x0054:
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r6, r10)
            java.lang.String r11 = r21.mo141395d()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0077
            java.lang.String r11 = r21.mo141395d()     // Catch:{ all -> 0x006f }
            byte[] r11 = r11.getBytes()     // Catch:{ all -> 0x006f }
            byte[] r0 = com.tencent.p014mm.jniinterface.AesEcb.aesCryptEcb(r0, r11, r6, r6)     // Catch:{ all -> 0x006f }
            goto L_0x0078
        L_0x006f:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.String r13 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r13, r11)
        L_0x0077:
            r0 = r3
        L_0x0078:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r11 != 0) goto L_0x00bd
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r7)
            if (r11 != 0) goto L_0x00bd
            java.lang.System.arraycopy(r0, r6, r7, r6, r10)
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 252(0xfc, double:1.245E-321)
            r16 = 0
            r20 = 0
            r13 = r0
            r18 = r10
            r13.idkeyStat(r14, r16, r18, r20)
            r16 = 5
            r18 = 1
            r13.idkeyStat(r14, r16, r18, r20)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r5 = r7.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r10)
            r0[r12] = r5
            java.lang.String r5 = "decode emoji file length:%d use time:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r0)
            boolean r0 = r1.mo141393b(r2, r7)
            if (r0 == 0) goto L_0x00da
            return r7
        L_0x00bd:
            com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 252(0xfc, double:1.245E-321)
            r16 = 2
            r18 = 1
            r20 = 0
            r13.idkeyStat(r14, r16, r18, r20)
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r6] = r5
            java.lang.String r5 = "decode emoji file failed. path:%s return original "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
            boolean r0 = r1.mo141393b(r2, r7)
            if (r0 == 0) goto L_0x00da
            return r7
        L_0x00da:
            return r3
        L_0x00db:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r6] = r5
            java.lang.String r2 = "decode emoji file failed. path is no exist :%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p384tk.C101897a.mo126270A2(com.tencent.mm.api.IEmojiInfo):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (com.tencent.p014mm.sdk.platformtools.ImgUtil.isImageFile(r12) != false) goto L_0x003f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo141392a(com.tencent.p014mm.storage.emotion.EmojiInfo r12) {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.emoji.EmojiFileEncryptMgr"
            r1 = 0
            if (r12 != 0) goto L_0x000b
            java.lang.String r12 = "decodeEmojiData failed. emoji is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r12)
            return r1
        L_0x000b:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = r12.mo62640K1()
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            int r6 = (int) r5
            r5 = 1024(0x400, float:1.435E-42)
            if (r6 <= r5) goto L_0x001e
            r6 = 1024(0x400, float:1.435E-42)
        L_0x001e:
            byte[] r5 = com.tencent.p014mm.vfs.C86013q1.m106433O(r4, r1, r6)
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            r8 = 0
            r4 = 1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0073
            if (r5 == 0) goto L_0x0073
            int r6 = r5.length
            r7 = 10
            if (r6 < r7) goto L_0x0073
            byte[] r6 = new byte[r7]
            java.lang.System.arraycopy(r5, r1, r6, r1, r7)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImageFile(r6)
            if (r6 == 0) goto L_0x0041
        L_0x003f:
            r12 = 1
            goto L_0x0074
        L_0x0041:
            int r12 = r12.field_reserved4
            r12 = r12 & r4
            if (r12 != r4) goto L_0x0073
            r12 = 0
            java.lang.String r6 = r11.mo141395d()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0066
            java.lang.String r6 = r11.mo141395d()     // Catch:{ all -> 0x005e }
            byte[] r6 = r6.getBytes()     // Catch:{ all -> 0x005e }
            byte[] r12 = com.tencent.p014mm.jniinterface.AesEcb.aesCryptEcb(r5, r6, r1, r1)     // Catch:{ all -> 0x005e }
            goto L_0x0066
        L_0x005e:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r5, r7, r6)
        L_0x0066:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r12)
            if (r5 != 0) goto L_0x0073
            boolean r12 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImageFile(r12)
            if (r12 == 0) goto L_0x0073
            goto L_0x003f
        L_0x0073:
            r12 = 0
        L_0x0074:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r5[r1] = r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r5[r4] = r1
            java.lang.String r1 = "checkout use time:%s result:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p384tk.C101897a.mo141392a(com.tencent.mm.storage.emotion.EmojiInfo):boolean");
    }

    /* renamed from: b */
    public final boolean mo141393b(IEmojiInfo iEmojiInfo, byte[] bArr) {
        String str;
        if (ImgUtil.isWXGF(bArr)) {
            str = iEmojiInfo.mo62644P1();
            if (TextUtils.isEmpty(str)) {
                return true;
            }
        } else {
            str = iEmojiInfo.mo62676i0();
        }
        String mD5String = MD5Util.getMD5String(bArr);
        boolean z = !Util.isNullOrNil(str) && !Util.isNullOrNil(mD5String) && Util.isEqual(str, mD5String);
        if (!z) {
            iEmojiInfo.mo62645S0();
            Log.m105929w("MicroMsg.emoji.EmojiFileEncryptMgr", "checkFileMd5: %s", iEmojiInfo.mo62676i0());
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo141394c(com.tencent.p014mm.storage.emotion.EmojiInfo r23, boolean r24) {
        /*
            r22 = this;
            r1 = r23
            java.lang.String r2 = "MicroMsg.emoji.EmojiFileEncryptMgr"
            r3 = 0
            if (r1 != 0) goto L_0x000d
            java.lang.String r0 = "encodeEmojiFile failed. emoji is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            return r3
        L_0x000d:
            java.lang.String r0 = r22.mo141395d()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r4 = 1
            r0 = r0 ^ r4
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "disable encrypt"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r3
        L_0x001f:
            java.lang.String r5 = r23.mo62640K1()
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r0 == 0) goto L_0x00e4
            r0 = 10
            byte[] r6 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r3, r0)
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0041
            int r8 = r6.length     // Catch:{ all -> 0x003b }
            if (r8 < r0) goto L_0x0041
            boolean r0 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isImageFile(r6)     // Catch:{ all -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r7, r6)
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r24 != 0) goto L_0x004d
            if (r0 == 0) goto L_0x0047
            goto L_0x004d
        L_0x0047:
            java.lang.String r0 = "encodeEmojiFile file had encrypt."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return r4
        L_0x004d:
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)
            int r6 = (int) r10
            r0 = 1024(0x400, float:1.435E-42)
            if (r6 <= r0) goto L_0x005d
            r10 = 1024(0x400, float:1.435E-42)
            goto L_0x005e
        L_0x005d:
            r10 = r6
        L_0x005e:
            byte[] r11 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r3, r6)
            byte[] r0 = com.tencent.p014mm.vfs.C86013q1.m106433O(r5, r3, r10)
            byte[] r12 = new byte[r3]
            java.lang.String r13 = r22.mo141395d()     // Catch:{ all -> 0x0075 }
            byte[] r13 = r13.getBytes()     // Catch:{ all -> 0x0075 }
            byte[] r12 = com.tencent.p014mm.jniinterface.AesEcb.aesCryptEcb(r0, r13, r4, r3)     // Catch:{ all -> 0x0075 }
            goto L_0x007b
        L_0x0075:
            r0 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r7, r13)
        L_0x007b:
            r0 = -1
            if (r12 == 0) goto L_0x008e
            int r7 = r12.length
            if (r7 < r10) goto L_0x008e
            if (r11 == 0) goto L_0x008e
            int r7 = r11.length
            if (r7 < r10) goto L_0x008e
            java.lang.System.arraycopy(r12, r3, r11, r3, r10)
            int r0 = r11.length
            int r0 = com.tencent.p014mm.vfs.C86013q1.m106438T(r5, r11, r3, r0)
        L_0x008e:
            if (r0 != 0) goto L_0x00d2
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r8
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 252(0xfc, double:1.245E-321)
            r17 = 1
            r21 = 0
            r14 = r0
            r19 = r12
            r14.idkeyStat(r15, r17, r19, r21)
            r17 = 6
            r19 = 1
            r14.idkeyStat(r15, r17, r19, r21)
            int r0 = r1.field_reserved4
            r0 = r0 | r4
            r1.field_reserved4 = r0
            r1.field_size = r6
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            r0.X90(r1)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r11.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r3] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            r0[r4] = r1
            java.lang.String r1 = "encode emoji file length:%d use time:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            return r4
        L_0x00d2:
            java.lang.String r0 = "encodeEmojiFile failed. write file failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 252(0xfc, double:1.245E-321)
            r7 = 3
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)
            return r3
        L_0x00e4:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r5
            java.lang.String r4 = "encodeEmojiFile failed. file not exist. path%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r0)
            r1.field_reserved4 = r3
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r0 = r0.mo57717d()
            r0.X90(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p384tk.C101897a.mo141394c(com.tencent.mm.storage.emotion.EmojiInfo, boolean):boolean");
    }

    /* renamed from: d */
    public String mo141395d() {
        if (Util.isNullOrNil(this.f300055a)) {
            C97489o g = C97489o.m125592g();
            String[] strArr = g.f286134f;
            if (strArr[0] == null) {
                synchronized (strArr) {
                    if (g.f286134f[0] == null) {
                        if (MMApplicationContext.isMainProcess()) {
                            g.f286134f[0] = C30790w2.m39221h().mo57717d().mo142056gY();
                        } else {
                            g.f286134f[0] = C98942a.m128786w(C98942a.m128787x(), "getEmojiKey", (String) null, (Bundle) null).getString("key_data", "");
                        }
                    }
                }
            }
            this.f300055a = g.f286134f[0];
        }
        return this.f300055a;
    }
}
