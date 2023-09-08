package com.tencent.p014mm.plugin.facedetect.model;

import android.app.ActivityManager;
import com.tencent.p014mm.memory.C92702a;
import com.tencent.p014mm.memory.C92705d;
import com.tencent.p014mm.memory.C92707f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;

/* renamed from: com.tencent.mm.plugin.facedetect.model.g */
public class C93390g extends C92702a<byte[]> {

    /* renamed from: d */
    public static final C93390g f269584d = new C93390g();

    /* renamed from: e */
    public static int f269585e = 0;

    /* renamed from: o */
    public static void m117951o(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.FaceByteArrayPool", "preloadCameraData, width: %s, height: %s, count: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        long currentTicks = Util.currentTicks();
        for (int i4 = 0; i4 < i3; i4++) {
            C93390g gVar = f269584d;
            byte[] bArr = new byte[(((i * i2) * 3) / 2)];
            synchronized (gVar) {
                gVar.mo126900k(bArr);
            }
        }
        Log.m105925i("MicroMsg.FaceByteArrayPool", "preloadCameraData used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: b */
    public Object mo126891b(Comparable comparable) {
        return new byte[((Integer) comparable).intValue()];
    }

    /* renamed from: c */
    public void mo126892c() {
        super.mo126892c();
    }

    /* renamed from: e */
    public long mo126894e(Object obj) {
        return (long) ((byte[]) obj).length;
    }

    /* renamed from: f */
    public Comparable mo126895f(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null || bArr.length <= 0) {
            return 0;
        }
        return Integer.valueOf(bArr.length);
    }

    /* renamed from: g */
    public long mo126896g() {
        return 20971520;
    }

    /* renamed from: h */
    public long mo126897h() {
        if (f269585e <= 0) {
            f269585e = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        }
        return f269585e >= 512 ? 20971520 : 10485760;
    }

    /* renamed from: i */
    public Comparable mo126898i(Comparable comparable) {
        return (Integer) comparable;
    }

    /* renamed from: j */
    public C92705d mo126899j(Comparable comparable) {
        return new C92707f(((Integer) comparable).intValue());
    }

    /* renamed from: n */
    public synchronized byte[] mo126905m(Integer num) {
        byte[] bArr;
        bArr = (byte[]) super.mo126905m(num);
        if (bArr == null) {
            Log.m105926v("MicroMsg.FaceByteArrayPool", "hy: getExactSize no data");
            bArr = new byte[num.intValue()];
        } else {
            Log.m105926v("MicroMsg.FaceByteArrayPool", "hy: got exactSize data");
        }
        return bArr;
    }
}
