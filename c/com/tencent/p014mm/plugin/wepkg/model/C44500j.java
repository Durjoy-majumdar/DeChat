package com.tencent.p014mm.plugin.wepkg.model;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import js0.C88016e;
import pb3.C21964b;
import te3.C50667oe0;
import te3.qz4;

/* renamed from: com.tencent.mm.plugin.wepkg.model.j */
public class C44500j {

    /* renamed from: g */
    public static ByteOrder f120690g = ByteOrder.BIG_ENDIAN;

    /* renamed from: a */
    public C86009m1 f120691a;

    /* renamed from: b */
    public volatile boolean f120692b = false;

    /* renamed from: c */
    public volatile int f120693c;

    /* renamed from: d */
    public volatile int f120694d = 0;

    /* renamed from: e */
    public volatile qz4 f120695e;

    /* renamed from: f */
    public volatile LinkedList<C50667oe0> f120696f;

    public C44500j(C86009m1 m1Var) {
        boolean z = false;
        FileChannel fileChannel = null;
        this.f120695e = null;
        this.f120696f = null;
        this.f120691a = m1Var;
        try {
            fileChannel = C86013q1.m106420B(m1Var.mo119976n(), false).getChannel();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Wepkg.WePkgReader", "openfile failed, " + e.getMessage());
        }
        if (fileChannel != null) {
            try {
                fileChannel.position(0);
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.order(f120690g);
                fileChannel.read(allocate);
                this.f120693c = allocate.getInt(0);
                z = mo69281b(fileChannel);
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.Wepkg.WePkgReader", "parseHeader error, " + e2.getMessage());
            } catch (Throwable th) {
                mo69280a(fileChannel);
                throw th;
            }
            mo69280a(fileChannel);
        }
        this.f120692b = z;
    }

    /* renamed from: a */
    public final void mo69280a(FileChannel fileChannel) {
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public final boolean mo69281b(FileChannel fileChannel) {
        if (this.f120693c <= 0) {
            return false;
        }
        try {
            fileChannel.position((long) 4);
            ByteBuffer allocate = ByteBuffer.allocate(this.f120693c);
            allocate.order(f120690g);
            fileChannel.read(allocate);
            byte[] array = allocate.array();
            if (array != null) {
                if (array.length != 0) {
                    this.f120695e = new qz4();
                    this.f120695e.parseFrom(array);
                    this.f120696f = this.f120695e.f140629d;
                    String str = this.f120695e.f140630e;
                    String str2 = this.f120695e.f140631f;
                    this.f120694d = 4 + this.f120693c;
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Wepkg.WePkgReader", "dealProtoData error, " + e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public String mo69282c(String str, String str2) {
        if (Util.isNullOrNil((List) this.f120696f) || this.f120694d < 4) {
            Log.m105920e("MicroMsg.Wepkg.WePkgReader", "getTargetFile, mFileIndexList is null");
            return null;
        }
        Iterator<C50667oe0> it = this.f120696f.iterator();
        while (it.hasNext()) {
            C50667oe0 next = it.next();
            if (Util.nullAsNil(str).equals(next.f139103d) && !mo69283d(next.f139106g)) {
                try {
                    byte[] b = C88016e.m109545b(new C21964b(this.f120691a, ((long) this.f120694d) + next.f139104e, (long) next.f139105f));
                    return "utf8".equals(str2) ? new String(b, "UTF-8") : Base64.encodeToString(b, 2);
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.Wepkg.WePkgReader", "getTargetFile: " + e.getMessage());
                } catch (OutOfMemoryError e2) {
                    Log.m105920e("MicroMsg.Wepkg.WePkgReader", "getTargetFile: " + e2.getMessage());
                }
            }
        }
        return "";
    }

    /* renamed from: d */
    public final boolean mo69283d(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return str.startsWith("video/") || str.startsWith("audio/");
    }
}
