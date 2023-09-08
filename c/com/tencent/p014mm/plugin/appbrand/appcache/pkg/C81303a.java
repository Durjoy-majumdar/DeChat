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

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.pkg.a */
public final class C81303a extends WxaPkgBaseImpl {

    /* renamed from: f */
    public static final ByteOrder f238733f = ByteOrder.BIG_ENDIAN;

    /* renamed from: d */
    public volatile int f238734d = 0;

    /* renamed from: e */
    public volatile int f238735e = -1;

    /* renamed from: D0 */
    public int mo113572D0() {
        return this.f238734d;
    }

    /* renamed from: H */
    public boolean mo113573H(WxaPkg.Info info) {
        return false;
    }

    /* renamed from: a0 */
    public InputStream mo113574a0(WxaPkg.Info info) {
        return null;
    }

    public void close() {
        this.f238734d = 0;
        this.f238735e = -1;
    }

    /* renamed from: t */
    public boolean mo113576t(FileChannel fileChannel) {
        if (fileChannel == null) {
            return false;
        }
        fileChannel.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(14);
        allocate.order(f238733f);
        fileChannel.read(allocate);
        if (-66 != allocate.get(0) || -19 != allocate.get(13)) {
            return false;
        }
        byte[] array = allocate.array();
        WxaPkgBaseImpl.m99703a(array, 1, 4);
        this.f238734d = WxaPkgBaseImpl.m99703a(array, 5, 4);
        WxaPkgBaseImpl.m99703a(array, 9, 4);
        return true;
    }

    /* renamed from: u */
    public int mo113577u() {
        return this.f238735e;
    }

    /* renamed from: z */
    public Map<String, WxaPkg.Info> mo113578z(FileChannel fileChannel, C86009m1 m1Var) {
        WxaPkgBaseImpl.Info info = null;
        if (fileChannel == null) {
            Log.m105920e("MicroMsg.WxaPkgNormalImpl", "fileChannel is null");
            return null;
        } else if (m1Var == null) {
            Log.m105920e("MicroMsg.WxaPkgNormalImpl", "file is null");
            return null;
        } else {
            fileChannel.position(14);
            ByteBuffer allocate = ByteBuffer.allocate(this.f238734d);
            allocate.order(f238733f);
            fileChannel.read(allocate);
            byte[] array = allocate.array();
            this.f238735e = WxaPkgBaseImpl.m99703a(array, 0, 4);
            C111055b bVar = new C111055b();
            int i = 0;
            int i2 = 4;
            while (i < this.f238735e) {
                int a = WxaPkgBaseImpl.m99703a(array, i2, 4);
                int i3 = i2 + 4;
                String str = new String(array, i3, a);
                int i4 = i3 + a;
                int a2 = WxaPkgBaseImpl.m99703a(array, i4, 4);
                int i5 = i4 + 4;
                int a3 = WxaPkgBaseImpl.m99703a(array, i5, 4);
                i2 = i5 + 4;
                WxaPkgBaseImpl.Info info2 = new WxaPkgBaseImpl.Info(m1Var.mo119971i(), str, a2, a3);
                bVar.put(str, info2);
                i++;
                info = info2;
            }
            if (info != null && ((long) (info.f238571f + info.f238572g)) > m1Var.mo119980r()) {
                Log.m105921e("MicroMsg.WxaPkgNormalImpl", "getInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d), infoMap.size(%d), filesCount(%d)", Integer.valueOf(info.f238571f), Integer.valueOf(info.f238572g), Long.valueOf(m1Var.mo119980r()), Integer.valueOf(bVar.f332583f), Integer.valueOf(this.f238735e));
            }
            return bVar;
        }
    }
}
