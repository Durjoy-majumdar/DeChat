package qe3;

import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import te3.C64860yl2;
import te3.fe4;

/* renamed from: qe3.c1 */
public final class C101126c1 {
    /* renamed from: a */
    public static Map<Integer, Long> m132544a(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            return null;
        }
        try {
            fe4 fe4 = (fe4) new fe4().parseFrom(bArr);
            if (fe4 == null) {
                return null;
            }
            Log.m105918d("MicroMsg.SyncKeyUtil", "dkpush : keyCount:" + fe4.f183128d);
            LinkedList<C64860yl2> linkedList = fe4.f183129e;
            if (linkedList.size() != fe4.f183128d) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < fe4.f183128d; i++) {
                hashMap.put(Integer.valueOf(linkedList.get(i).f186575d), Long.valueOf(Util.MAX_32BIT_VALUE & ((long) linkedList.get(i).f186576e)));
            }
            if (hashMap.size() != fe4.f183128d) {
                return null;
            }
            return hashMap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m132545b(byte[] bArr, byte[] bArr2) {
        Map<Integer, Long> a = m132544a(bArr);
        if (a == null) {
            Log.m105918d("MicroMsg.SyncKeyUtil", "dkpush local sync key failed");
            return true;
        }
        Map<Integer, Long> a2 = m132544a(bArr2);
        if (a2 == null) {
            Log.m105920e("MicroMsg.SyncKeyUtil", "dkpush svr sync key failed");
            return false;
        }
        HashMap hashMap = (HashMap) a2;
        for (Integer num : hashMap.keySet()) {
            Long l = (Long) ((HashMap) a).get(num);
            Long l2 = (Long) hashMap.get(num);
            if (l == null) {
                Log.m105918d("MicroMsg.SyncKeyUtil", "dkpush local key null :" + num);
                return true;
            }
            Log.m105918d("MicroMsg.SyncKeyUtil", "dkpush local key:" + num + " sv:" + l2 + " lv:" + l);
            if (l2.longValue() > l.longValue()) {
                return true;
            }
        }
        Log.m105918d("MicroMsg.SyncKeyUtil", "dkpush two sync key is the same");
        return false;
    }

    /* renamed from: c */
    public static byte[] m132546c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length <= 0) {
            Log.m105918d("MicroMsg.SyncKeyUtil", "empty old key, use new key");
            return bArr2;
        } else if (bArr2 == null || bArr2.length <= 0) {
            Log.m105920e("MicroMsg.SyncKeyUtil", "newKey is null");
            return null;
        } else {
            PByteArray pByteArray = new PByteArray();
            try {
                if (MMProtocalJni.mergeSyncKey(bArr, bArr2, pByteArray)) {
                    return pByteArray.value;
                }
                Log.m105920e("MicroMsg.SyncKeyUtil", "merge key failed");
                return null;
            } catch (IncompatibleClassChangeError e) {
                Log.printErrStackTrace("MicroMsg.Crash", e, "NoSuchMethod MMProtocalJni.mergeSyncKey", new Object[0]);
                throw ((IncompatibleClassChangeError) new IncompatibleClassChangeError("NoSuchMethod MMProtocalJni.mergeSyncKey").initCause(e));
            }
        }
    }

    /* renamed from: d */
    public static String m132547d(byte[] bArr) {
        Map<Integer, Long> a;
        if (!Util.isNullOrNil(bArr) && (a = m132544a(bArr)) != null) {
            HashMap hashMap = (HashMap) a;
            if (hashMap.size() >= 1) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(" MsgKey:" + hashMap.get(2));
                stringBuffer.append(" profile:" + hashMap.get(1));
                stringBuffer.append(" contact:" + hashMap.get(3));
                stringBuffer.append(" chatroom:" + hashMap.get(11));
                stringBuffer.append(" Bottle:" + hashMap.get(7));
                stringBuffer.append(" QContact:" + hashMap.get(5));
                return stringBuffer.toString();
            }
        }
        return "";
    }
}
