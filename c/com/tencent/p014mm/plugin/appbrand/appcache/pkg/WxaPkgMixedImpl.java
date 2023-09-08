package com.tencent.p014mm.plugin.appbrand.appcache.pkg;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appcache.pkg.WxaPkgBaseImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Map;
import p1042u.C111055b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl */
public final class WxaPkgMixedImpl extends WxaPkgBaseImpl {

    /* renamed from: g */
    public static final ByteOrder f238728g = ByteOrder.BIG_ENDIAN;

    /* renamed from: d */
    public volatile int f238729d = 0;

    /* renamed from: e */
    public volatile int f238730e = 0;

    /* renamed from: f */
    public volatile int f238731f = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl$Info */
    public static class Info extends WxaPkgBaseImpl.Info {

        /* renamed from: h */
        public final int f238732h;

        public Info(String str, String str2, int i, int i2, int i3) {
            super(str, str2, i, i2);
            this.f238732h = i3;
        }
    }

    /* renamed from: D0 */
    public int mo113572D0() {
        return this.f238729d;
    }

    /* renamed from: H */
    public boolean mo113573H(WxaPkg.Info info) {
        return (info instanceof Info) && info.f238570e != null && ((Info) info).f238732h == 1;
    }

    /* renamed from: a0 */
    public InputStream mo113574a0(WxaPkg.Info info) {
        return null;
    }

    public void close() {
    }

    /* renamed from: t */
    public boolean mo113576t(FileChannel fileChannel) {
        if (fileChannel == null) {
            return false;
        }
        fileChannel.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(18);
        allocate.order(f238728g);
        fileChannel.read(allocate);
        if (-66 != allocate.get(0) || -19 != allocate.get(17)) {
            return false;
        }
        byte[] array = allocate.array();
        WxaPkgBaseImpl.m99703a(array, 1, 4);
        this.f238729d = WxaPkgBaseImpl.m99703a(array, 5, 4);
        this.f238730e = WxaPkgBaseImpl.m99703a(array, 9, 4);
        WxaPkgBaseImpl.m99703a(array, 13, 4);
        return true;
    }

    /* renamed from: u */
    public int mo113577u() {
        return this.f238731f;
    }

    /* renamed from: z */
    public Map<String, WxaPkg.Info> mo113578z(FileChannel fileChannel, C86009m1 m1Var) {
        int i;
        int i2;
        FileChannel fileChannel2 = fileChannel;
        Info info = null;
        if (fileChannel2 == null) {
            Log.m105920e("MicroMsg.WxaPkgMixedImpl", "fileChannel is null");
            return null;
        } else if (m1Var == null) {
            Log.m105920e("MicroMsg.WxaPkgMixedImpl", "file is null");
            return null;
        } else {
            fileChannel2.position(18);
            ByteBuffer allocate = ByteBuffer.allocate(this.f238729d);
            allocate.order(f238728g);
            fileChannel2.read(allocate);
            byte[] array = allocate.array();
            this.f238731f = WxaPkgBaseImpl.m99703a(array, 0, 4);
            C111055b bVar = new C111055b();
            int i3 = 0;
            int i4 = 4;
            while (i3 < this.f238731f) {
                int a = WxaPkgBaseImpl.m99703a(array, i4, 4);
                int i5 = i4 + 4;
                String str = new String(array, i5, a);
                int i6 = i5 + a;
                int a2 = WxaPkgBaseImpl.m99703a(array, i6, 1);
                int i7 = i6 + 1;
                int a3 = WxaPkgBaseImpl.m99703a(array, i7, 4);
                int i8 = i7 + 4;
                int a4 = WxaPkgBaseImpl.m99703a(array, i8, 4);
                i4 = i8 + 4;
                if (a2 == 0) {
                    i2 = this.f238729d + 18 + this.f238730e;
                } else if (a2 == 1) {
                    i2 = this.f238729d + 18;
                } else {
                    Log.m105921e("MicroMsg.WxaPkgMixedImpl", "encType error: %d", Integer.valueOf(a2));
                    i = 0;
                    Info info2 = new Info(m1Var.mo119971i(), str, i, a4, a2);
                    bVar.put(str, info2);
                    i3++;
                    info = info2;
                }
                i = i2 + a3;
                Info info22 = new Info(m1Var.mo119971i(), str, i, a4, a2);
                bVar.put(str, info22);
                i3++;
                info = info22;
            }
            if (info != null && ((long) (info.f238571f + info.f238572g)) > m1Var.mo119980r()) {
                Log.m105921e("MicroMsg.WxaPkgMixedImpl", "getInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d), infoMap.size(%d), filesCount(%d)", Integer.valueOf(info.f238571f), Integer.valueOf(info.f238572g), Long.valueOf(m1Var.mo119980r()), Integer.valueOf(bVar.f332583f), Integer.valueOf(this.f238731f));
            }
            return bVar;
        }
    }
}
