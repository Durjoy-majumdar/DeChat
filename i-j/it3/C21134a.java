package it3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.QbarNative;
import com.tencent.stubs.logger.Log;
import gt3.C20839a;
import java.util.List;

/* renamed from: it3.a */
public class C21134a {

    /* renamed from: a */
    public String f59751a = "BaseQBarAIDecoder";

    /* renamed from: b */
    public C19931a f59752b = new C19931a();

    /* renamed from: c */
    public boolean f59753c;

    /* renamed from: d */
    public Object f59754d = new Object();

    public C21134a(String str) {
        this.f59751a += "_" + str;
    }

    /* renamed from: c */
    public byte[] mo33086c(byte[] bArr, Point point, int i, Rect rect, int[] iArr) {
        byte[] bArr2 = bArr;
        Point point2 = point;
        Rect rect2 = rect;
        if (bArr2 == null || bArr2.length <= 0) {
            Log.m106513w(this.f59751a, "prepareGrayData , data is null");
            return null;
        }
        int i2 = 0;
        Log.m106505i(this.f59751a, String.format("cropGrayData, size %s, rect %s, rotation %d", new Object[]{point2, rect2, Integer.valueOf(i)}));
        int width = rect2 != null ? rect.width() : point2.x;
        int height = rect2 != null ? rect.height() : point2.y;
        int i3 = rect2 != null ? rect2.left : 0;
        if (rect2 != null) {
            i2 = rect2.top;
        }
        byte[] bArr3 = new byte[(((width * height) * 3) / 2)];
        synchronized (this.f59754d) {
            int nativeGrayRotateCropSub = QbarNative.nativeGrayRotateCropSub(bArr, point2.x, point2.y, i3, i2, width, height, bArr3, iArr, i, 0);
            if (nativeGrayRotateCropSub == 0) {
                return bArr3;
            }
            String str = this.f59751a;
            Log.m106497e(str, "rotate result " + nativeGrayRotateCropSub);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|(1:11)|41|12|13|(4:15|16|(4:20|(1:22)(1:23)|24|42)|25)|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00a8 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.tencent.qbar.C19931a.C19932a> mo33087d(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.qbar.a r2 = r9.f59752b
            int r10 = r2.mo27307b(r10, r11, r12)
            r11 = 0
            if (r10 >= 0) goto L_0x0025
            java.lang.String r12 = r9.f59751a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "scanImage result "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.stubs.logger.Log.m106497e(r12, r10)
            return r11
        L_0x0025:
            com.tencent.qbar.a r10 = r9.f59752b
            r12 = 3
            monitor-enter(r10)
            int r2 = r10.f56825a     // Catch:{ all -> 0x00f1 }
            r3 = 0
            if (r2 < 0) goto L_0x00ab
            com.tencent.qbar.QbarNative$QBarResultJNI[] r11 = new com.tencent.qbar.QbarNative.QBarResultJNI[r12]     // Catch:{ all -> 0x00f1 }
            r2 = 0
        L_0x0031:
            if (r2 >= r12) goto L_0x0053
            com.tencent.qbar.QbarNative$QBarResultJNI r4 = new com.tencent.qbar.QbarNative$QBarResultJNI     // Catch:{ all -> 0x00f1 }
            r4.<init>()     // Catch:{ all -> 0x00f1 }
            r11[r2] = r4     // Catch:{ all -> 0x00f1 }
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00f1 }
            r5.<init>()     // Catch:{ all -> 0x00f1 }
            r4.charset = r5     // Catch:{ all -> 0x00f1 }
            r4 = r11[r2]     // Catch:{ all -> 0x00f1 }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x00f1 }
            r4.data = r5     // Catch:{ all -> 0x00f1 }
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x00f1 }
            r5.<init>()     // Catch:{ all -> 0x00f1 }
            r4.typeName = r5     // Catch:{ all -> 0x00f1 }
            int r2 = r2 + 1
            goto L_0x0031
        L_0x0053:
            com.tencent.qbar.QbarNative r2 = r10.f56826b     // Catch:{ all -> 0x00f1 }
            int r4 = r10.f56825a     // Catch:{ all -> 0x00f1 }
            r2.GetResults(r11, r4)     // Catch:{ all -> 0x00f1 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00f1 }
            r2.<init>()     // Catch:{ all -> 0x00f1 }
            r4 = 0
        L_0x0060:
            if (r4 >= r12) goto L_0x00a8
            r5 = r11[r4]     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            java.lang.String r6 = r5.typeName     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            if (r6 == 0) goto L_0x00a5
            boolean r6 = r6.isEmpty()     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            if (r6 != 0) goto L_0x00a5
            com.tencent.qbar.a$a r6 = new com.tencent.qbar.a$a     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            java.lang.String r7 = r5.charset     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            r6.f56831h = r7     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            int r8 = r5.typeID     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            r6.f56827d = r8     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            java.lang.String r8 = r5.typeName     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            r6.f56828e = r8     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            byte[] r8 = r5.data     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            r6.f56830g = r8     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            java.lang.String r8 = "ANY"
            boolean r7 = r7.equals(r8)     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            if (r7 == 0) goto L_0x0097
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            byte[] r5 = r5.data     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            java.lang.String r8 = "UTF-8"
            r7.<init>(r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            r6.f56829f = r7     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            goto L_0x00a2
        L_0x0097:
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            byte[] r5 = r5.data     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            java.lang.String r8 = r6.f56831h     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            r7.<init>(r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
            r6.f56829f = r7     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
        L_0x00a2:
            r2.add(r6)     // Catch:{ UnsupportedEncodingException -> 0x00a8 }
        L_0x00a5:
            int r4 = r4 + 1
            goto L_0x0060
        L_0x00a8:
            monitor-exit(r10)     // Catch:{ all -> 0x00f1 }
            r11 = r2
            goto L_0x00ac
        L_0x00ab:
            monitor-exit(r10)     // Catch:{ all -> 0x00f1 }
        L_0x00ac:
            r10 = 1
            if (r11 == 0) goto L_0x00b5
            int r12 = r11.size()
            if (r12 != 0) goto L_0x00cd
        L_0x00b5:
            java.lang.String r12 = r9.f59751a
            java.lang.String r2 = "get no results ,cost %dms"
            java.lang.Object[] r4 = new java.lang.Object[r10]
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r3] = r5
            java.lang.String r2 = java.lang.String.format(r2, r4)
            com.tencent.stubs.logger.Log.m106497e(r12, r2)
        L_0x00cd:
            java.lang.String r12 = r9.f59751a
            java.lang.String r2 = "get %d results ,cost %dms"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r11.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4[r10] = r0
            java.lang.String r10 = java.lang.String.format(r2, r4)
            com.tencent.stubs.logger.Log.m106505i(r12, r10)
            return r11
        L_0x00f1:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00f1 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: it3.C21134a.mo33087d(byte[], int, int):java.util.List");
    }

    /* renamed from: e */
    public void mo33088e(List<QbarNative.QBarCodeDetectInfo> list, List<QbarNative.QBarPoint> list2) {
        if (list != null && list2 != null) {
            C19931a aVar = this.f59752b;
            synchronized (aVar) {
                try {
                    if (aVar.f56825a >= 0) {
                        QbarNative.QBarCodeDetectInfo[] qBarCodeDetectInfoArr = new QbarNative.QBarCodeDetectInfo[3];
                        QbarNative.QBarPoint[] qBarPointArr = new QbarNative.QBarPoint[3];
                        for (int i = 0; i < 3; i++) {
                            qBarCodeDetectInfoArr[i] = new QbarNative.QBarCodeDetectInfo();
                            qBarPointArr[i] = new QbarNative.QBarPoint();
                        }
                        list.clear();
                        list2.clear();
                        aVar.f56826b.GetCodeDetectInfo(qBarCodeDetectInfoArr, qBarPointArr, aVar.f56825a);
                        for (int i2 = 0; i2 < 3; i2++) {
                            QbarNative.QBarCodeDetectInfo qBarCodeDetectInfo = qBarCodeDetectInfoArr[i2];
                            if (qBarCodeDetectInfo.readerId > 0) {
                                list.add(qBarCodeDetectInfo);
                            }
                        }
                        for (int i3 = 0; i3 < 3; i3++) {
                            QbarNative.QBarPoint qBarPoint = qBarPointArr[i3];
                            if (qBarPoint.point_cnt != 0) {
                                list2.add(qBarPoint);
                            }
                        }
                        list.size();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            Log.m106505i(this.f59751a, String.format("get detect code result %d", new Object[]{Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: f */
    public void mo33089f(Context context, int i, QbarNative.QbarAiModelParam qbarAiModelParam) {
        if (!this.f59753c) {
            try {
                synchronized (C20839a.f58864n) {
                    synchronized (this.f59754d) {
                        int hashCode = hashCode();
                        String str = this.f59751a;
                        Log.m106505i(str, "init qbar start , hashCode:" + hashCode);
                        int i2 = C20839a.f58859i;
                        boolean z = C20839a.f58860j;
                        boolean z2 = C20839a.f58861k;
                        boolean z3 = C20839a.f58862l;
                        boolean z4 = C20839a.f58863m;
                        boolean z5 = z4;
                        boolean z6 = z3;
                        boolean z7 = z2;
                        int a = this.f59752b.mo27306a(i2, z, z2, z3, z4, 1, i, "ANY", "UTF-8", qbarAiModelParam);
                        if (a != 0) {
                            String str2 = this.f59751a;
                            Log.m106497e(str2, "init qbar error, result: " + a + ",  hashCode: " + hashCode);
                            return;
                        }
                        this.f59753c = true;
                        String str3 = this.f59751a;
                        Log.m106505i(str3, "init qbar success , qbarBackend: " + i2 + ",  qBarOptSr: " + z + ",  qBarOptDet: " + z7 + ",  qBarOptForceDM: " + z6 + ",  qBarOptLibdmtx: " + z5 + ",  hashCode: " + hashCode);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public void mo33090g() {
        synchronized (C20839a.f58864n) {
            synchronized (this.f59754d) {
                this.f59753c = false;
                String str = this.f59751a;
                Log.m106505i(str, "qbar release , hashCode:" + hashCode());
                C19931a aVar = this.f59752b;
                if (aVar != null) {
                    synchronized (aVar) {
                        int i = aVar.f56825a;
                        if (i >= 0) {
                            aVar.f56826b.Release(i);
                            aVar.f56825a = -1;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public int mo33091h(int[] iArr) {
        int[] iArr2;
        int SetReaders;
        int i = 0;
        if (iArr != null) {
            iArr2 = new int[iArr.length];
            int length = iArr.length;
            int i2 = 0;
            while (i < length) {
                iArr2[i2] = iArr[i];
                i++;
                i2++;
            }
        } else {
            iArr2 = new int[5];
            iArr2[0] = 2;
            iArr2[1] = 1;
            iArr2[2] = 4;
            iArr2[3] = 5;
        }
        C19931a aVar = this.f59752b;
        int length2 = iArr2.length;
        synchronized (aVar) {
            int i3 = aVar.f56825a;
            SetReaders = i3 < 0 ? -1 : aVar.f56826b.SetReaders(iArr2, length2, i3);
        }
        return SetReaders;
    }
}
