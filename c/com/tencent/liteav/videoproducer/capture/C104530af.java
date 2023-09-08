package com.tencent.liteav.videoproducer.capture;

import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.Rotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.liteav.videoproducer.capture.af */
public final class C104530af {

    /* renamed from: e */
    private static Boolean f309842e;

    /* renamed from: a */
    public C104531a f309843a = C104531a.CAMERA_1;

    /* renamed from: b */
    public int f309844b = Integer.MAX_VALUE;

    /* renamed from: c */
    public boolean f309845c = false;

    /* renamed from: d */
    public boolean f309846d = false;

    /* renamed from: com.tencent.liteav.videoproducer.capture.af$a */
    public enum C104531a {
        MOCK,
        CAMERA_1,
        CAMERA_2
    }

    /* renamed from: a */
    public static C104507p m139869a(List<C104507p> list, Rotation rotation, int i, int i2) {
        double d;
        Rotation rotation2 = rotation;
        C104507p pVar = new C104507p(i, i2);
        LiteavLog.m16901i("CameraSupervisor", "preview wanted: " + pVar + " cameraRotation:" + rotation2);
        if (list == null) {
            LiteavLog.m16898e("CameraSupervisor", "findBestMatchedPreviewSize getPreviewSizes null");
            return pVar;
        }
        if (rotation2 == Rotation.ROTATION_90 || rotation2 == Rotation.ROTATION_270) {
            pVar.mo147175a();
        }
        double c = pVar.mo147179c();
        C104507p pVar2 = new C104507p(640, 640);
        int i3 = pVar.f309736a;
        int i4 = pVar2.f309736a;
        if (i3 > i4 || pVar.f309737b > pVar2.f309737b) {
            int i5 = pVar.f309737b;
            if (i3 > i5) {
                pVar2.f309737b = (i4 * i5) / i3;
            } else {
                pVar2.f309736a = (pVar2.f309737b * i3) / i5;
            }
        } else {
            pVar2.mo147177a(pVar);
        }
        ArrayList arrayList = new ArrayList();
        long j = Long.MAX_VALUE;
        for (C104507p next : list) {
            LiteavLog.m16896d("CameraSupervisor", "support preview size ".concat(String.valueOf(next)));
            long round = (next.f309736a < pVar2.f309736a || next.f309737b < pVar2.f309737b) ? Long.MAX_VALUE : Math.round(Math.abs(next.mo147179c() - c) * 10.0d);
            int i6 = (round > j ? 1 : (round == j ? 0 : -1));
            if (i6 < 0) {
                arrayList.clear();
                arrayList.add(next);
                j = round;
            } else if (i6 == 0) {
                arrayList.add(next);
            }
        }
        Collections.sort(arrayList, C104532ag.m139872a());
        C104507p pVar3 = (C104507p) arrayList.get(0);
        int b = pVar.mo147178b();
        double d2 = Double.MAX_VALUE;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C104507p pVar4 = (C104507p) it.next();
            LiteavLog.m16901i("CameraSupervisor", "size in same buck ".concat(String.valueOf(pVar4)));
            if (c > pVar4.mo147179c()) {
                int i7 = pVar4.f309736a;
                d = ((double) (i7 * i7)) / c;
            } else {
                int i8 = pVar4.f309737b;
                d = ((double) (i8 * i8)) * c;
            }
            double d3 = (double) b;
            if (d / d3 >= 0.9d) {
                double d4 = d - d3;
                if (Math.abs(d4) < d2) {
                    d2 = Math.abs(d4);
                    pVar3 = pVar4;
                }
            }
        }
        LiteavLog.m16901i("CameraSupervisor", "best match preview size ".concat(String.valueOf(pVar3)));
        return new C104507p(pVar3.f309736a, pVar3.f309737b);
    }

    /* renamed from: b */
    private boolean m139870b() {
        boolean z = false;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            LiteavLog.m16905w("CameraSupervisor", "isSupportCamera2 false, current:" + LiteavSystemInfo.getSystemOSVersionInt() + " is low to:21");
            return false;
        } else if (this.f309844b < 21) {
            LiteavLog.m16905w("CameraSupervisor", "isSupportCamera2 false, apiLevel:" + this.f309844b + " is too low.");
            return false;
        } else if (LiteavSystemInfo.getSystemOSVersionInt() < this.f309844b) {
            LiteavLog.m16905w("CameraSupervisor", "isSupportCamera2 false, current:" + LiteavSystemInfo.getSystemOSVersionInt() + " is low to config api level:" + this.f309844b);
            return false;
        } else {
            Boolean bool = f309842e;
            if (bool != null) {
                return bool.booleanValue();
            }
            int a = C104525a.m139840a();
            if (a == 1 || a == 3) {
                z = true;
            }
            f309842e = Boolean.valueOf(z);
            LiteavLog.m16901i("CameraSupervisor", "isSupportCamera2 apiLevel:" + this.f309844b + " supportLevel:" + a + " result:" + f309842e);
            return f309842e.booleanValue();
        }
    }

    /* renamed from: a */
    public final C104531a mo147209a() {
        if (this.f309846d) {
            this.f309843a = C104531a.MOCK;
        } else if (!m139870b() || this.f309845c) {
            this.f309843a = C104531a.CAMERA_1;
        } else {
            this.f309843a = C104531a.CAMERA_2;
        }
        return this.f309843a;
    }
}
