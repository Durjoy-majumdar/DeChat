package com.tencent.p014mm.modelvideoh265toh264;

import android.app.ActivityManager;
import com.tencent.p014mm.memory.C92702a;
import com.tencent.p014mm.memory.C92705d;
import com.tencent.p014mm.memory.C92707f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;

/* renamed from: com.tencent.mm.modelvideoh265toh264.b */
public class C92861b extends C92702a<byte[]> {

    /* renamed from: d */
    public static final C92861b f267508d = new C92861b();

    /* renamed from: e */
    public static int f267509e = 0;

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
        return 10485760;
    }

    /* renamed from: h */
    public long mo126897h() {
        if (f267509e <= 0) {
            f267509e = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        }
        return f267509e >= 512 ? 41943040 : 20971520;
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
            bArr = new byte[num.intValue()];
        }
        return bArr;
    }
}
