package com.tencent.p014mm.hardcoder;

import android.text.TextUtils;
import com.tencent.p014mm.hardcoder.C17766b;
import com.tencent.p014mm.plugin.hardcoder.HardCoderReporterImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.io.OutputStream;
import java.util.Arrays;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.hardcoder.i */
public class C17776i {

    /* renamed from: a */
    public static C17777a f48944a;

    /* renamed from: com.tencent.mm.hardcoder.i$a */
    public interface C17777a {
    }

    /* renamed from: a */
    public static void m18170a(C17766b.C17769c cVar) {
        int i;
        Class cls;
        int i2;
        HardCoderReporterImpl hardCoderReporterImpl;
        StringBuilder sb;
        StringBuilder sb4;
        StringBuilder sb5;
        C17766b.C17769c cVar2 = cVar;
        int i3 = (int) (cVar2.f48912a - cVar2.f48922k);
        boolean isHcEnable = HardCoderJNI.isHcEnable();
        int isRunning = HardCoderJNI.isRunning();
        int i4 = i3 - cVar2.f48913b <= 0 ? 1 : 0;
        int i5 = cVar2.f48919h;
        long j = cVar2.f48920i;
        int i6 = cVar2.f48915d;
        int i7 = cVar2.f48917f;
        int[] iArr = cVar2.f48931t;
        int i8 = (int) (cVar2.f48923l - cVar2.f48921j);
        int i9 = HardCoderJNI.tickRate;
        int[] iArr2 = cVar2.f48929r;
        int[] iArr3 = cVar2.f48930s;
        StringBuilder sb6 = new StringBuilder();
        int i15 = i9;
        int i16 = i3;
        if (iArr != null) {
            int length = iArr.length;
            i = i8;
            int i17 = 0;
            while (i17 < length) {
                int i18 = length;
                int i19 = iArr[i17];
                int[] iArr4 = iArr;
                sb6.append(i19 + "#");
                i17++;
                length = i18;
                iArr = iArr4;
            }
        } else {
            i = i8;
        }
        int[] iArr5 = iArr;
        StringBuilder sb7 = new StringBuilder();
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i25 = 0;
            while (i25 < length2) {
                int i26 = length2;
                int i27 = iArr2[i25];
                int[] iArr6 = iArr2;
                sb7.append(i27 + "#");
                i25++;
                length2 = i26;
                iArr2 = iArr6;
            }
        }
        int[] iArr7 = iArr2;
        StringBuilder sb8 = new StringBuilder();
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int i28 = 0;
            while (i28 < length3) {
                int i29 = length3;
                int i35 = iArr3[i28];
                int[] iArr8 = iArr3;
                sb8.append(i35 + "#");
                i28++;
                length3 = i29;
                iArr3 = iArr8;
            }
        }
        int[] iArr9 = iArr3;
        C17774h.m18164a("Hardcoder.HardCoderReporter", String.format("performanceReport, hash:%s, threadId:%s, enable:%s, engineStatus:%s, cancelInDelay:%s, scene:%s, action:%s, lastCpuLevel:%s, cpuLevel:%s, lastIoLevel:%s, ioLevel:%s, bindCoreIds:%s, executeTime:%s, runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", new Object[]{Integer.valueOf(cVar.hashCode()), cVar.mo21751a(), Integer.valueOf(isHcEnable ? 1 : 0), Integer.valueOf(isRunning), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), Integer.valueOf(cVar2.f48926o), Integer.valueOf(i6), Integer.valueOf(cVar2.f48927p), Integer.valueOf(i7), sb6.toString(), Integer.valueOf(i), Integer.valueOf(i16), Integer.valueOf(i15), sb7.toString(), sb8.toString()}));
        C17777a aVar = f48944a;
        if (aVar != null) {
            int[] iArr10 = cVar2.f48918g;
            HardCoderReporterImpl hardCoderReporterImpl2 = (HardCoderReporterImpl) aVar;
            hardCoderReporterImpl2.getClass();
            Class cls2 = WXHardCoderJNI.class;
            if (Log.getLogLevel() <= 1 || C40318k.m43492a().getHCKVPerReport()) {
                boolean isHCEnable = ((WXHardCoderJNI) C86312j.m106911c(cls2)).isHCEnable();
                if (HardCoderReporterImpl.f81456e == null) {
                    if (MMApplicationContext.isMMProcess()) {
                        C86709a0.m107528h();
                        HardCoderReporterImpl.f81456e = (Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_FLAG_LONG, 0L);
                    } else {
                        HardCoderReporterImpl.f81456e = 0L;
                    }
                }
                if (TextUtils.isEmpty(HardCoderReporterImpl.f81455d)) {
                    HardCoderReporterImpl.f81455d = C87203t.m108270f(false);
                }
                String str = HardCoderReporterImpl.f81455d;
                int longValue = (int) HardCoderReporterImpl.f81456e.longValue();
                StringBuilder sb9 = new StringBuilder();
                if (iArr5 != null) {
                    i2 = longValue;
                    int[] iArr11 = iArr5;
                    hardCoderReporterImpl = hardCoderReporterImpl2;
                    int length4 = iArr11.length;
                    cls = cls2;
                    int i36 = 0;
                    while (i36 < length4) {
                        int i37 = length4;
                        int i38 = iArr11[i36];
                        int[] iArr12 = iArr11;
                        sb9.append(i38 + "#");
                        i36++;
                        length4 = i37;
                        iArr11 = iArr12;
                    }
                } else {
                    hardCoderReporterImpl = hardCoderReporterImpl2;
                    cls = cls2;
                    i2 = longValue;
                }
                StringBuilder sb10 = new StringBuilder();
                if (iArr7 != null) {
                    int[] iArr13 = iArr7;
                    int length5 = iArr13.length;
                    sb = sb9;
                    int i39 = 0;
                    while (i39 < length5) {
                        int i44 = iArr13[i39];
                        int[] iArr14 = iArr13;
                        StringBuilder sb11 = new StringBuilder();
                        int i45 = length5;
                        sb11.append(i44 < 0 ? 0 : i44);
                        sb11.append("#");
                        sb10.append(sb11.toString());
                        i39++;
                        iArr13 = iArr14;
                        length5 = i45;
                    }
                } else {
                    sb = sb9;
                }
                StringBuilder sb12 = new StringBuilder();
                if (iArr9 != null) {
                    int[] iArr15 = iArr9;
                    int length6 = iArr15.length;
                    sb4 = sb10;
                    int i46 = 0;
                    while (i46 < length6) {
                        int i47 = iArr15[i46];
                        int[] iArr16 = iArr15;
                        StringBuilder sb13 = new StringBuilder();
                        int i48 = length6;
                        sb13.append(i47 < 0 ? 0 : i47);
                        sb13.append("#");
                        sb12.append(sb13.toString());
                        i46++;
                        iArr15 = iArr16;
                        length6 = i48;
                    }
                } else {
                    sb4 = sb10;
                }
                int i49 = i2;
                String format = String.format("[oneliang]performance report, imei:%s, threadId:%s, enable:%s, heavy:%s, speedUp:%s, engineStatus:%s, cancelInDelay:%s, scene:%s, action:%s, cpuLevel:%s, ioLevel:%s, bindCoreIds:%s, executeTime:%s,runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", new Object[]{str, Arrays.toString(iArr10), Integer.valueOf(isHcEnable), Integer.valueOf(i49), Integer.valueOf(isHCEnable ? 1 : 0), Integer.valueOf(isRunning), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), Integer.valueOf(i6), Integer.valueOf(i7), sb.toString(), Integer.valueOf(i), Integer.valueOf(i16), Integer.valueOf(i15), sb4.toString(), sb12.toString()});
                String format2 = String.format("time:%s,imei:%s,threadId:%s,enable:%s,heavy:%s,speedUp:%s,cancelInDelay:%s,sMidascene:%s,action:%s,cpuLevel:%s,ioLevel:%s,bindCoreIds:%s,executeTime:%s,runtime:%s, phoneHZ:%s, cpuLevelTimeArray:%s, ioLevelTimeArray:%s", new Object[]{Long.valueOf(System.currentTimeMillis()), str, Arrays.toString(iArr10), Integer.valueOf(isHcEnable), Integer.valueOf(i49), Integer.valueOf(isHCEnable), Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j), Integer.valueOf(i6), Integer.valueOf(i7), sb.toString(), Integer.valueOf(i), Integer.valueOf(i16), Integer.valueOf(i15), sb4.toString(), sb12.toString()});
                if (((WXHardCoderJNI) C86312j.m106911c(cls)).getDebug()) {
                    Log.m105924i("MicroMsg.HardCoderReporterImpl", format);
                }
                Object[] objArr = new Object[21];
                objArr[0] = str;
                objArr[1] = Integer.valueOf(i49);
                String str2 = format2;
                objArr[2] = Integer.valueOf(isHCEnable);
                objArr[3] = Integer.valueOf(i4);
                objArr[4] = Integer.valueOf(i5);
                objArr[5] = Long.valueOf(j);
                objArr[6] = Integer.valueOf(i6);
                objArr[7] = Integer.valueOf(i7);
                objArr[8] = sb.toString();
                if (i < 0) {
                    i = 0;
                }
                objArr[9] = Integer.valueOf(i);
                objArr[10] = Integer.valueOf(i16);
                objArr[11] = 0;
                objArr[12] = 0;
                objArr[13] = Integer.valueOf(i15);
                objArr[14] = 0;
                objArr[15] = sb4.toString();
                objArr[16] = sb12.toString();
                objArr[17] = "";
                objArr[18] = 0;
                objArr[19] = Integer.valueOf(isRunning);
                objArr[20] = Integer.valueOf(isHcEnable);
                hardCoderReporterImpl.mo57165a(14607, objArr);
                if (HardCoderReporterImpl.f81457f) {
                    StringBuilder sb14 = new StringBuilder();
                    C86709a0.m107528h();
                    sb14.append(C86709a0.m107535s().f251805c);
                    sb14.append("/hcstat");
                    String sb15 = sb14.toString();
                    String[] strArr = {sb15};
                    int i54 = 0;
                    for (int i55 = 1; i54 < i55; i55 = 1) {
                        String str3 = strArr[i54];
                        C86009m1 m1Var = new C86009m1(str3);
                        if (!m1Var.mo119967g() && (!m1Var.mo119987x() || !m1Var.mo119977o())) {
                            Log.m105921e("MicroMsg.FileOperation", "batchMkDirs mkdir error. %s", str3);
                        }
                        i54++;
                    }
                    C86009m1 m1Var2 = new C86009m1(sb15, "data.txt");
                    if (!m1Var2.mo119967g()) {
                        try {
                            m1Var2.mo119964e();
                        } catch (Exception e) {
                            Exception exc = e;
                            Log.m105924i("MicroMsg.HardCoderReporterImpl", "create new file exception:" + exc.getMessage());
                        }
                    }
                    OutputStream outputStream = null;
                    try {
                        outputStream = C86013q1.m106427I(m1Var2, true);
                        outputStream.write((str2 + "\n").getBytes("UTF-8"));
                        outputStream.flush();
                        try {
                            outputStream.close();
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            sb5 = new StringBuilder();
                        }
                    } catch (Exception e3) {
                        Log.m105924i("MicroMsg.HardCoderReporterImpl", "exception:" + e3.getMessage());
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                                return;
                            } catch (Exception e4) {
                                e = e4;
                                sb5 = new StringBuilder();
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        Throwable th4 = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception e5) {
                                Exception exc2 = e5;
                                Log.m105924i("MicroMsg.HardCoderReporterImpl", "close exception:" + exc2.getMessage());
                            }
                        }
                        throw th4;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            return;
        }
        sb5.append("close exception:");
        sb5.append(e.getMessage());
        Log.m105924i("MicroMsg.HardCoderReporterImpl", sb5.toString());
    }
}
