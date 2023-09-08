package rv3;

import androidx.exifinterface.media.ExifInterface;
import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import com.tencent.wxmm.v2encoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rv3.i */
public class C90104i {

    /* renamed from: a */
    public static byte[] f258760a = {68, 70, 71, 35, 36, 37, 94, 35, 37, 36, 82, 71, 72, 82, 40, 38, ExifInterface.START_CODE, 77, 60, 62, 60};

    /* renamed from: b */
    public static byte[] f258761b = {77, 12, 61, -119, 116, -43, 122, -45, 103, -63, -105, v2encoder.enumCODEC_vcodec2, 70, 121, -88, ExifInterface.START_CODE};

    /* renamed from: c */
    public static byte[] f258762c = {-27, -63, 58, 27, 82, 11, -15, -54, -59, -75, 1, 61, 125, 119, 90, -8};

    /* renamed from: rv3.i$a */
    public interface C90105a {
    }

    /* renamed from: rv3.i$b */
    public static final class C90106b extends JceStruct {

        /* renamed from: e */
        public static Map<String, String> f258763e;

        /* renamed from: d */
        public Map<String, String> f258764d = null;

        public C90106b() {
            HashMap hashMap = new HashMap();
            f258763e = hashMap;
            hashMap.put("", "");
        }

        public void readFrom(JceInputStream jceInputStream) {
            this.f258764d = (Map) jceInputStream.read(f258763e, 0, true);
        }

        public void writeTo(JceOutputStream jceOutputStream) {
            jceOutputStream.write(this.f258764d, 0);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0057 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m112734a(rv3.C90104i.C90105a r9) {
        /*
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = ""
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = android.os.Process.myUid()     // Catch:{ all -> 0x0047 }
            r4 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r3 / r4
            java.lang.String r4 = "android.os.Environment$UserEnvironment"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0047 }
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ all -> 0x0047 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0047 }
            r8 = 0
            r6[r8] = r7     // Catch:{ all -> 0x0047 }
            java.lang.reflect.Constructor r6 = r4.getConstructor(r6)     // Catch:{ all -> 0x0047 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0047 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0047 }
            r7[r8] = r3     // Catch:{ all -> 0x0047 }
            java.lang.Object r3 = r6.newInstance(r7)     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = "getExternalStorageDirectory"
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch:{ all -> 0x0047 }
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch:{ all -> 0x0047 }
            r4.setAccessible(r5)     // Catch:{ all -> 0x0047 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0047 }
            java.lang.Object r3 = r4.invoke(r3, r5)     // Catch:{ all -> 0x0047 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0047 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0047 }
            goto L_0x0049
        L_0x0047:
            r3 = r1
        L_0x0049:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0057
            java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = r4.getAbsolutePath()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            byte[] r4 = f258761b     // Catch:{ all -> 0x006b }
            byte[] r5 = f258760a     // Catch:{ all -> 0x006b }
            r6 = r9
            xv3.a$a r6 = (xv3.C118905a.C118906a) r6     // Catch:{ all -> 0x006b }
            r6.getClass()     // Catch:{ all -> 0x006b }
            byte[] r4 = rv3.C90100b.m112724b(r4, r5)     // Catch:{ all -> 0x006b }
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x006b }
            r5.<init>(r4, r0)     // Catch:{ all -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r5 = r1
        L_0x006c:
            byte[] r4 = f258762c     // Catch:{ all -> 0x0080 }
            byte[] r6 = f258760a     // Catch:{ all -> 0x0080 }
            r7 = r9
            xv3.a$a r7 = (xv3.C118905a.C118906a) r7     // Catch:{ all -> 0x0080 }
            r7.getClass()     // Catch:{ all -> 0x0080 }
            byte[] r4 = rv3.C90100b.m112724b(r4, r6)     // Catch:{ all -> 0x0080 }
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0080 }
            r6.<init>(r4, r0)     // Catch:{ all -> 0x0080 }
            r1 = r6
        L_0x0080:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            rv3.i$b r0 = new rv3.i$b
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x00b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e8
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = r9
            xv3.a$a r3 = (xv3.C118905a.C118906a) r3     // Catch:{ all -> 0x00e6 }
            r3.getClass()     // Catch:{ all -> 0x00e6 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x00e6 }
            r3.<init>(r2)     // Catch:{ all -> 0x00e6 }
            byte[] r2 = rv3.C90103e.m112733a(r3)     // Catch:{ all -> 0x00e6 }
            byte[] r3 = f258760a     // Catch:{ all -> 0x00e6 }
            byte[] r2 = rv3.C90100b.m112724b(r2, r3)     // Catch:{ all -> 0x00e6 }
            byte[] r2 = rv3.C90099a.m112722b(r2)     // Catch:{ all -> 0x00e6 }
            com.qq.taf.jce.JceInputStream r3 = new com.qq.taf.jce.JceInputStream     // Catch:{ all -> 0x00e6 }
            r3.<init>((byte[]) r2)     // Catch:{ all -> 0x00e6 }
            r0.readFrom(r3)     // Catch:{ all -> 0x00e6 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f258764d     // Catch:{ all -> 0x00e6 }
            int r2 = r2.size()     // Catch:{ all -> 0x00e6 }
            if (r2 == 0) goto L_0x00b0
            goto L_0x00e8
        L_0x00e6:
            goto L_0x00b0
        L_0x00e8:
            java.util.Map<java.lang.String, java.lang.String> r9 = r0.f258764d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.C90104i.m112734a(rv3.i$a):java.util.Map");
    }
}
