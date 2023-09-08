package com.tencent.p014mm.booter;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.autogen.events.OpenIMSyncEvent;
import com.tencent.p014mm.autogen.events.SnsSyncEvent;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import f40.C86744o;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C117747y;
import org.xwalk.core.XWalkEnvironment;
import p156gj.C87203t;
import p823sg.C90193h;
import p823sg.C90194m;
import pc0.C118012k;
import zh3.C91753f;

/* renamed from: com.tencent.mm.booter.m */
public class C114716m {

    /* renamed from: com.tencent.mm.booter.m$a */
    public class C114717a implements C11385n {
        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105925i("MicroMsg.NotifySyncMgr", "onGYNetEnd: %d [%d,%d,%s]", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    /* renamed from: a */
    public static String m161360a(int i) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, C91753f.C66827b> hashMap = C86744o.f251802w;
        String f = C90193h.m112878f((XWalkEnvironment.MODULE_MM + i).getBytes());
        sb.append(C72994y1.f212832a + f + XVFSFile.SEPARATOR_CHAR);
        sb.append("pushSyncResp");
        String sb4 = sb.toString();
        C86013q1.m106461v(sb4);
        return sb4;
    }

    /* renamed from: b */
    public static void m161361b(int i, int i2) {
        String a = m161360a(i2);
        int d = m161363d(a, i2);
        C86013q1.m106447h(a + "/" + "syncResp.bin" + i);
        Log.m105925i("MicroMsg.NotifySyncMgr", "consumeData delIndex:%d, total index:%d", Integer.valueOf(i), Integer.valueOf(d));
        if (i == d) {
            C86013q1.m106447h(a + "/" + "syncResp.ini");
            Log.m105924i("MicroMsg.NotifySyncMgr", "consumeData: has consme all respdata");
        }
    }

    /* renamed from: c */
    public static void m161362c(long j, int i) {
        Log.m105924i("MicroMsg.NotifySyncMgr", "dealWithSelector, selector = " + j);
        if ((256 & j) != 0) {
            SnsSyncEvent snsSyncEvent = new SnsSyncEvent();
            snsSyncEvent.f79001d.f79002a = 4;
            snsSyncEvent.publish();
        }
        if ((2097152 & j) != 0) {
            new OpenIMSyncEvent().publish();
        }
        if ((j & -16777217 & -33 & -257 & -2097153 & 2) != 0) {
            new C118012k().doScene(C114781l0.m161554a(), new C114717a());
        }
    }

    /* renamed from: d */
    public static int m161363d(String str, int i) {
        byte[] O = C86013q1.m106433O(str + "/" + "syncResp.ini", 0, -1);
        if (Util.isNullOrNil(O)) {
            return 0;
        }
        try {
            return Integer.parseInt(new String(O));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public static String m161364e(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            return "buf is nullOrNil";
        }
        if (bArr.length == 1) {
            return "buf.len is 1: " + Integer.toHexString(bArr[0]);
        }
        return "buf last two[len:" + bArr.length + "]: %s, %s" + Integer.toHexString(bArr[bArr.length - 2] & ExifInterface.MARKER) + ", " + Integer.toHexString(bArr[bArr.length - 1] & ExifInterface.MARKER);
    }

    /* renamed from: f */
    public static byte[] m161365f(PInt pInt, int i) {
        Log.m105924i("MicroMsg.NotifySyncMgr", XWalkReaderBasePlugin.READ_METHOD_NAME);
        String a = m161360a(i);
        int d = m161363d(a, i);
        for (int i2 = 1; i2 <= d; i2++) {
            Log.m105924i("MicroMsg.NotifySyncMgr", "readFile: " + i2);
            String str = a + "/" + "syncResp.bin" + i2;
            if (C86013q1.m106450k(str)) {
                byte[] O = C86013q1.m106433O(str, 0, -1);
                if (Util.isNullOrNil(O)) {
                    Log.m105928w("MicroMsg.NotifySyncMgr", "readFile getdata null, read again");
                    O = C86013q1.m106433O(str, 0, -1);
                }
                String f = C90193h.m112878f((C87203t.m108270f(true) + i).getBytes());
                byte[] b = C90194m.m112881b(O, f.getBytes());
                Log.m105925i("MicroMsg.NotifySyncMgr", "readFile, index:[%d of %d], dump data:%s -> %s, key:%s", Integer.valueOf(i2), Integer.valueOf(d), m161364e(O), m161364e(b), m161364e(f.getBytes()));
                if (!Util.isNullOrNil(b)) {
                    pInt.value = i2;
                    return b;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m161366g(byte[] bArr, int i) {
        Log.m105924i("MicroMsg.NotifySyncMgr", "writeFile");
        String a = m161360a(i);
        int d = m161363d(a, i) + 1;
        String str = a + "/" + "syncResp.bin" + d;
        String f = C90193h.m112878f((C87203t.m108270f(true) + i).getBytes());
        byte[] c = C90194m.m112882c(bArr, f.getBytes());
        Log.m105925i("MicroMsg.NotifySyncMgr", "writeFile %d, len:%d, resultLen:%d, file:%s, dump %s -> %s, key:%s", Integer.valueOf(d), Integer.valueOf(bArr.length), Integer.valueOf(c.length), str, m161364e(bArr), m161364e(c), m161364e(f.getBytes()));
        if (Util.isNullOrNil(c)) {
            Log.m105920e("MicroMsg.NotifySyncMgr", "encry failed");
            return false;
        }
        int T = C86013q1.m106438T(str, c, 0, c.length);
        boolean k = C86013q1.m106450k(str);
        if (T != 0 || !k) {
            Log.m105921e("MicroMsg.NotifySyncMgr", "writeFile failed:!!!!!, writeResult:%d, writedFileExit:%b", Integer.valueOf(T), Boolean.valueOf(k));
            return false;
        }
        byte[] bytes = (d + "").getBytes();
        C86013q1.m106438T(a + "/" + "syncResp.ini", bytes, 0, bytes.length);
        return true;
    }
}
