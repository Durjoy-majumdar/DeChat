package zv3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.util.Iterator;
import lw3.C117487b;
import lw3.C117488c;
import mx3.C117586d;
import mx3.C117588f;
import pv3.C118130a;
import rv3.C90099a;
import rv3.C90100b;
import rv3.C90101c;
import vv3.C118702d;

/* renamed from: zv3.b */
public class C119181b {

    /* renamed from: b */
    public static C119181b f356902b;

    /* renamed from: a */
    public C118130a f356903a = new C118130a();

    /* renamed from: b */
    public static C119181b m168096b() {
        if (f356902b == null) {
            synchronized (C119181b.class) {
                if (f356902b == null) {
                    f356902b = new C119181b();
                }
            }
        }
        return f356902b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final zv3.C119180a mo183896a(vv3.C118702d r17, java.lang.String r18, java.util.ArrayList<mx3.C117586d> r19, java.util.ArrayList<java.lang.String> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            if (r1 == 0) goto L_0x03d4
            boolean r3 = r19.isEmpty()
            if (r3 == 0) goto L_0x000e
            goto L_0x03d4
        L_0x000e:
            r3 = r17
            android.content.Context r3 = r3.f355205a
            if (r3 == 0) goto L_0x03b5
            boolean r4 = r19.isEmpty()
            if (r4 == 0) goto L_0x001c
            goto L_0x03b5
        L_0x001c:
            pv3.a r4 = r0.f356903a
            r4.getClass()
            boolean r4 = r19.isEmpty()
            java.lang.String r5 = "UTF-8"
            r6 = 0
            if (r4 == 0) goto L_0x002c
            r4 = 0
            goto L_0x0044
        L_0x002c:
            mx3.e r4 = new mx3.e
            r4.<init>()
            r4.f351786d = r1
            com.qq.taf.jce.JceOutputStream r7 = new com.qq.taf.jce.JceOutputStream
            r7.<init>()
            r7.setServerEncoding(r5)
            java.util.ArrayList<mx3.d> r4 = r4.f351786d
            r7.write(r4, (int) r6)
            byte[] r4 = r7.toByteArray()
        L_0x0044:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "V_301096_3_C_"
            r7.append(r8)
            java.lang.String r8 = ""
            android.content.pm.PackageManager r9 = r3.getPackageManager()
            java.lang.String r10 = r3.getPackageName()     // Catch:{ Exception -> 0x005f }
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r10, r6)     // Catch:{ Exception -> 0x005f }
            java.lang.String r9 = r9.versionName     // Catch:{ Exception -> 0x005f }
            goto L_0x0060
        L_0x005f:
            r9 = r8
        L_0x0060:
            r7.append(r9)
            java.lang.String r9 = "_"
            r7.append(r9)
            android.content.pm.PackageManager r9 = r3.getPackageManager()
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x0077 }
            android.content.pm.PackageInfo r3 = r9.getPackageInfo(r3, r6)     // Catch:{ Exception -> 0x0077 }
            int r3 = r3.versionCode     // Catch:{ Exception -> 0x0077 }
            goto L_0x0078
        L_0x0077:
            r3 = -1
        L_0x0078:
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            java.lang.String r7 = "com.tencent.turingsmi"
            r9 = 3
            java.lang.String r9 = java.lang.String.valueOf(r9)
            pv3.a r10 = r0.f356903a
            r10.getClass()
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 != 0) goto L_0x03b5
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 != 0) goto L_0x03b5
            if (r4 != 0) goto L_0x009b
            goto L_0x03b5
        L_0x009b:
            p9.b r10 = new p9.b
            r10.<init>()
            com.qq.taf.RequestPacket r11 = r10.f352686g
            java.lang.String r12 = "analytics"
            r11.sFuncName = r12
            r12 = 1
            r11.iRequestId = r12
            java.lang.String r13 = "uploadServer"
            r11.sServantName = r13
            jx3.a r11 = new jx3.a
            r11.<init>()
            r11.f351363h = r12
            r11.f351364i = r7
            r11.f351366n = r3
            java.lang.String r3 = "1.0.2"
            r11.f351372t = r3
            r11.f351373u = r9
            r3 = 206(0xce, float:2.89E-43)
            r11.f351360e = r3
            r3 = 2
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x03b2 }
            r7.<init>()     // Catch:{ all -> 0x03b2 }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x03b2 }
            r9.<init>(r7)     // Catch:{ all -> 0x03b2 }
            r9.write(r4)     // Catch:{ all -> 0x03b2 }
            r9.finish()     // Catch:{ all -> 0x03b2 }
            r9.close()     // Catch:{ all -> 0x03b2 }
            byte[] r4 = r7.toByteArray()     // Catch:{ all -> 0x03b2 }
            r7.close()     // Catch:{ all -> 0x03b2 }
            if (r4 == 0) goto L_0x00e1
            r11.f351375w = r3     // Catch:{ all -> 0x03b2 }
        L_0x00e1:
            java.lang.String r3 = "*^@K#K@!"
            if (r4 != 0) goto L_0x00e7
            r3 = 0
            goto L_0x0110
        L_0x00e7:
            java.lang.String r7 = "DES/CBC/PKCS5Padding"
            javax.crypto.Cipher r7 = javax.crypto.Cipher.getInstance(r7)     // Catch:{ all -> 0x03af }
            java.lang.String r9 = "DES"
            javax.crypto.SecretKeyFactory r9 = javax.crypto.SecretKeyFactory.getInstance(r9)     // Catch:{ all -> 0x03af }
            javax.crypto.spec.DESKeySpec r13 = new javax.crypto.spec.DESKeySpec     // Catch:{ all -> 0x03af }
            byte[] r14 = r3.getBytes(r5)     // Catch:{ all -> 0x03af }
            r13.<init>(r14)     // Catch:{ all -> 0x03af }
            javax.crypto.SecretKey r9 = r9.generateSecret(r13)     // Catch:{ all -> 0x03af }
            javax.crypto.spec.IvParameterSpec r13 = new javax.crypto.spec.IvParameterSpec     // Catch:{ all -> 0x03af }
            byte[] r3 = r3.getBytes(r5)     // Catch:{ all -> 0x03af }
            r13.<init>(r3)     // Catch:{ all -> 0x03af }
            r7.init(r12, r9, r13)     // Catch:{ all -> 0x03af }
            byte[] r3 = r7.doFinal(r4)     // Catch:{ all -> 0x03af }
        L_0x0110:
            if (r3 == 0) goto L_0x0114
            r11.f351361f = r12     // Catch:{ all -> 0x03af }
        L_0x0114:
            r11.f351371s = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = android.os.Build.BRAND
            r3.append(r4)
            java.lang.String r4 = "-"
            r3.append(r4)
            java.lang.String r4 = android.os.Build.MODEL
            r3.append(r4)
            java.lang.String r4 = ";Android "
            r3.append(r4)
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r3.append(r4)
            java.lang.String r4 = ",level "
            r3.append(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r11.f351362g = r3
            r11.f351368p = r8
            java.lang.String r3 = "detail"
            boolean r4 = r11 instanceof java.util.Set
            if (r4 != 0) goto L_0x03a7
            com.qq.taf.jce.JceOutputStream r4 = new com.qq.taf.jce.JceOutputStream
            r4.<init>()
            java.lang.String r5 = r10.f352685f
            r4.setServerEncoding(r5)
            r4.write((java.lang.Object) r11, (int) r6)
            java.nio.ByteBuffer r4 = r4.getByteBuffer()
            byte[] r4 = com.p013qq.taf.jce.JceUtil.getJceBufArray(r4)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r12)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r12)
            r10.mo182753a(r7, r11)
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>()
            r11 = 0
        L_0x0174:
            int r12 = r7.size()
            java.lang.String r13 = "map"
            java.lang.String r14 = "list"
            if (r11 >= r12) goto L_0x0245
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r15 = "java.lang.Integer"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x023c
            java.lang.String r15 = "int"
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0196
            goto L_0x023c
        L_0x0196:
            java.lang.String r15 = "java.lang.Boolean"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x0239
            java.lang.String r15 = "boolean"
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x01a8
            goto L_0x0239
        L_0x01a8:
            java.lang.String r15 = "java.lang.Byte"
            boolean r15 = r12.equals(r15)
            if (r15 != 0) goto L_0x0236
            java.lang.String r15 = "byte"
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x01ba
            goto L_0x0236
        L_0x01ba:
            java.lang.String r15 = "java.lang.Double"
            boolean r15 = r12.equals(r15)
            java.lang.String r2 = "double"
            if (r15 != 0) goto L_0x0234
            boolean r15 = r12.equals(r2)
            if (r15 == 0) goto L_0x01cc
            goto L_0x0234
        L_0x01cc:
            java.lang.String r2 = "java.lang.Float"
            boolean r2 = r12.equals(r2)
            java.lang.String r15 = "float"
            if (r2 != 0) goto L_0x0232
            boolean r2 = r12.equals(r15)
            if (r2 == 0) goto L_0x01dd
            goto L_0x0232
        L_0x01dd:
            java.lang.String r2 = "java.lang.Long"
            boolean r2 = r12.equals(r2)
            if (r2 != 0) goto L_0x022f
            java.lang.String r2 = "long"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x01ee
            goto L_0x022f
        L_0x01ee:
            java.lang.String r2 = "java.lang.Short"
            boolean r2 = r12.equals(r2)
            java.lang.String r15 = "short"
            if (r2 != 0) goto L_0x0232
            boolean r2 = r12.equals(r15)
            if (r2 == 0) goto L_0x01ff
            goto L_0x0232
        L_0x01ff:
            java.lang.String r2 = "java.lang.Character"
            boolean r2 = r12.equals(r2)
            if (r2 != 0) goto L_0x0227
            java.lang.String r2 = "java.lang.String"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0212
            java.lang.String r14 = "string"
            goto L_0x023e
        L_0x0212:
            java.lang.String r2 = "java.util.List"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x021b
            goto L_0x023e
        L_0x021b:
            java.lang.String r2 = "java.util.Map"
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x0224
            goto L_0x0225
        L_0x0224:
            r13 = r12
        L_0x0225:
            r14 = r13
            goto L_0x023e
        L_0x0227:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "can not support java.lang.Character"
            r1.<init>(r2)
            throw r1
        L_0x022f:
            java.lang.String r14 = "int64"
            goto L_0x023e
        L_0x0232:
            r14 = r15
            goto L_0x023e
        L_0x0234:
            r14 = r2
            goto L_0x023e
        L_0x0236:
            java.lang.String r14 = "char"
            goto L_0x023e
        L_0x0239:
            java.lang.String r14 = "bool"
            goto L_0x023e
        L_0x023c:
            java.lang.String r14 = "int32"
        L_0x023e:
            r7.set(r11, r14)
            int r11 = r11 + 1
            goto L_0x0174
        L_0x0245:
            java.util.Collections.reverse(r7)
            r2 = 0
        L_0x0249:
            int r11 = r7.size()
            if (r2 >= r11) goto L_0x0313
            java.lang.Object r11 = r7.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = r11.equals(r14)
            java.lang.String r15 = ">"
            java.lang.String r6 = "<"
            if (r12 == 0) goto L_0x0294
            int r11 = r2 + -1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.Object r6 = r7.get(r11)
            java.lang.String r6 = (java.lang.String) r6
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            r7.set(r11, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r11 = 0
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            r6.append(r12)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            r7.set(r11, r6)
            goto L_0x030e
        L_0x0294:
            boolean r12 = r11.equals(r13)
            if (r12 == 0) goto L_0x02d3
            int r11 = r2 + -1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.Object r6 = r7.get(r11)
            java.lang.String r6 = (java.lang.String) r6
            r12.append(r6)
            java.lang.String r6 = ","
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            r7.set(r11, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r11 = 0
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            r6.append(r12)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            r7.set(r11, r6)
            goto L_0x030e
        L_0x02d3:
            java.lang.String r12 = "Array"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x030e
            int r11 = r2 + -1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.Object r6 = r7.get(r11)
            java.lang.String r6 = (java.lang.String) r6
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            r7.set(r11, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r11 = 0
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            r6.append(r12)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            r7.set(r11, r6)
        L_0x030e:
            int r2 = r2 + 1
            r6 = 0
            goto L_0x0249
        L_0x0313:
            java.util.Collections.reverse(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x031a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x032a
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r9.append(r6)
            goto L_0x031a
        L_0x032a:
            java.lang.String r2 = r9.toString()
            r5.put(r2, r4)
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r10.f352684e
            r2.remove(r3)
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r2 = r10.f352683d
            r2.put(r3, r5)
            com.qq.taf.RequestPacket r2 = r10.f352686g
            java.lang.String r2 = r2.sServantName
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x039f
            com.qq.taf.RequestPacket r2 = r10.f352686g
            java.lang.String r2 = r2.sFuncName
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x0397
            com.qq.taf.jce.JceOutputStream r2 = new com.qq.taf.jce.JceOutputStream
            r3 = 0
            r2.<init>((int) r3)
            java.lang.String r4 = r10.f352685f
            r2.setServerEncoding(r4)
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r4 = r10.f352683d
            r2.write(r4, (int) r3)
            com.qq.taf.RequestPacket r4 = r10.f352686g
            java.nio.ByteBuffer r2 = r2.getByteBuffer()
            byte[] r2 = com.p013qq.taf.jce.JceUtil.getJceBufArray(r2)
            r4.sBuffer = r2
            com.qq.taf.jce.JceOutputStream r2 = new com.qq.taf.jce.JceOutputStream
            r2.<init>((int) r3)
            java.lang.String r3 = r10.f352685f
            r2.setServerEncoding(r3)
            r10.writeTo(r2)
            java.nio.ByteBuffer r2 = r2.getByteBuffer()
            byte[] r2 = com.p013qq.taf.jce.JceUtil.getJceBufArray(r2)
            int r3 = r2.length
            int r3 = r3 + 4
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteBuffer r3 = r4.putInt(r3)
            java.nio.ByteBuffer r2 = r3.put(r2)
            r2.flip()
            byte[] r2 = r4.array()
            goto L_0x03b6
        L_0x0397:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "funcName can not is null"
            r1.<init>(r2)
            throw r1
        L_0x039f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "servantName can not is null"
            r1.<init>(r2)
            throw r1
        L_0x03a7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "can not support Set"
            r1.<init>(r2)
            throw r1
        L_0x03af:
            byte[] r2 = pv3.C118130a.f353142a
            goto L_0x03b6
        L_0x03b2:
            byte[] r2 = pv3.C118130a.f353142a
            goto L_0x03b6
        L_0x03b5:
            r2 = 0
        L_0x03b6:
            if (r2 == 0) goto L_0x03ca
            zv3.a r3 = new zv3.a
            r3.<init>()
            r3.f356900a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = r20
            r2.<init>(r4)
            r3.f356901b = r2
            r2 = r3
            goto L_0x03cd
        L_0x03ca:
            r4 = r20
            r2 = 0
        L_0x03cd:
            r20.clear()
            r19.clear()
            return r2
        L_0x03d4:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zv3.C119181b.mo183896a(vv3.d, java.lang.String, java.util.ArrayList, java.util.ArrayList):zv3.a");
    }

    /* renamed from: c */
    public boolean mo183897c(C118702d dVar, Throwable th, String str) {
        String str2;
        String str3;
        C117586d dVar2;
        File[] c;
        StackTraceElement[] stackTrace;
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        this.f356903a.getClass();
        String str4 = "";
        if (th == null || (stackTrace = th.getStackTrace()) == null || stackTrace.length <= 0) {
            str2 = str4;
        } else {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement != null) {
                    sb.append(stackTraceElement.getClassName());
                    sb.append("(");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append(XVFSFile.PATH_SEPARATOR);
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append(")");
                    sb.append("\n");
                }
            }
            str2 = sb.toString();
        }
        String name = Thread.currentThread().getName();
        Context context = dVar.f355205a;
        if (context != null) {
            try {
                int myPid = Process.myPid();
                Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        str3 = next.processName;
                        break;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        str3 = str4;
        C118130a aVar = this.f356903a;
        Context context2 = dVar.f355205a;
        aVar.getClass();
        if (context2 == null || th == null) {
            dVar2 = null;
        } else {
            dVar2 = new C117586d();
            dVar2.f351778t = th.getClass().getName();
            dVar2.f351771j = str2;
            dVar2.f351773o = th.getMessage();
            dVar2.f351784z = str3;
            dVar2.f351777s = null;
            dVar2.f351763C = name;
            dVar2.f351775q = 0;
            dVar2.f351776r = str4;
            dVar2.f351772n = System.currentTimeMillis();
            dVar2.f351764D = "100";
            C117588f fVar = new C117588f();
            String str5 = "1234567890ABCDEF";
            String a = C90101c.m112728a(context2);
            if (TextUtils.isEmpty(str5)) {
                str5 = str4;
            }
            fVar.f351798q = str5;
            if (!TextUtils.isEmpty(a)) {
                str4 = a;
            }
            fVar.f351791g = str4;
            fVar.f351795n = Build.MODEL;
            fVar.f351788d = Build.BRAND;
            fVar.f351797p = "rom=" + Build.FINGERPRINT;
            dVar2.f351782x = fVar;
        }
        this.f356903a.getClass();
        int abs = TextUtils.isEmpty(str2) ? -1 : Math.abs(str2.hashCode());
        if (-1 != abs) {
            C117488c cVar = dVar.f355210f;
            if (dVar2 == null) {
                cVar.getClass();
            } else {
                C117487b bVar = cVar.f351593b;
                File e = bVar.mo182198e(bVar.mo182197d(cVar.f351592a.f355205a), "2");
                if (e != null) {
                    String valueOf = String.valueOf(abs);
                    C117487b bVar2 = cVar.f351593b;
                    String absolutePath = e.getAbsolutePath();
                    bVar2.getClass();
                    if (!TextUtils.isEmpty(absolutePath) && !TextUtils.isEmpty(valueOf) && (c = bVar2.mo182196c(absolutePath)) != null && c.length > 0) {
                        int length = c.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (c[i].getName().startsWith(valueOf)) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!z) {
                        C117487b bVar3 = cVar.f351593b;
                        byte[] byteArray = dVar2.toByteArray();
                        bVar3.getClass();
                        byte[] c2 = (byteArray == null || byteArray.length <= 0) ? null : C90100b.m112725c(C90099a.m112721a(byteArray), C90100b.m112727e());
                        if (c2 != null && c2.length > 0) {
                            String b = cVar.f351593b.mo182195b(e.getAbsolutePath(), valueOf + "_" + System.currentTimeMillis());
                            if (!TextUtils.isEmpty(b) && cVar.f351593b.mo182199f(b, c2)) {
                                cVar.mo182200a(e, (String) null, 20);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
