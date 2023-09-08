package g73;

import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.jni.utils.UtilsJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86718e;
import java.io.ByteArrayOutputStream;
import java.util.List;
import p823sg.C77710q;
import p823sg.C90193h;
import pe3.C89349b;
import te3.C51018qv3;
import te3.C64551mb3;
import te3.C64576nb3;

/* renamed from: g73.g */
public class C107762g {
    /* renamed from: a */
    public static String m145993a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m145994b(C107763i iVar) {
        if (iVar.f322499a != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = iVar.f322499a;
            if (elapsedRealtime < j) {
                iVar.f322499a = elapsedRealtime;
                iVar.f322500b += elapsedRealtime;
                Log.m105918d("MicroMsg.GestureUtil", String.format("Rebooted, need to add additional %d ms, now elapsed %d ms", new Object[]{Long.valueOf(elapsedRealtime), Long.valueOf(iVar.f322500b)}));
                return;
            }
            iVar.f322500b += elapsedRealtime - j;
            iVar.f322499a = elapsedRealtime;
        }
    }

    /* renamed from: c */
    public static byte[] m145995c(List<C75893h> list) {
        if (list != null) {
            int size = list.size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                C75893h hVar = list.get(i);
                bArr[i] = (byte) ((hVar.f222569a * 3) + hVar.f222570b + 1);
            }
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(bArr[i2]);
            }
            String sb4 = sb.toString();
            String s = C75592q0.m90789s();
            String f = C90193h.m112878f((C90193h.m112878f(sb4.getBytes()) + s).getBytes());
            return C90193h.m112878f((f + sb4).getBytes()).getBytes();
        }
        throw new IllegalArgumentException("pattern is null");
    }

    /* renamed from: d */
    public static byte[] m145996d(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < bArr.length - 1; i += 2) {
            byteArrayOutputStream.write(("0123456789abcdef".indexOf(Character.toLowerCase(bArr[i])) << 4) | "0123456789abcdef".indexOf(Character.toLowerCase(bArr[i + 1])));
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    public static boolean m145997e() {
        if (!C86709a0.m107522a() || C86718e.m107551r()) {
            Log.m105928w("MicroMsg.GestureUtil", "not login !!");
            return false;
        }
        C64576nb3 c = C107761f.m145986c();
        C64551mb3 b = C107761f.m145985b();
        boolean z = c == null;
        boolean z2 = b == null;
        boolean h = !z ? m146000h(c) : false;
        Object[] objArr = new Object[3];
        objArr[0] = c;
        int i = -1;
        objArr[1] = Integer.valueOf(c == null ? -1 : c.f184454f);
        objArr[2] = Boolean.valueOf(h);
        Log.m105925i("MicroMsg.GestureUtil", "tom isUserSetWalletLock serverInfo:%s status:%d  svrinfoValid:%s", objArr);
        boolean g = !z2 ? m145999g(b) : false;
        Object[] objArr2 = new Object[3];
        objArr2[0] = b;
        if (b != null) {
            i = b.f184276g;
        }
        objArr2[1] = Integer.valueOf(i);
        objArr2[2] = Boolean.valueOf(g);
        Log.m105925i("MicroMsg.GestureUtil", "tom isUserSetWalletLock localBuff:%s status:%d  localBuffValid:%s", objArr2);
        if (h) {
            if (g) {
                try {
                    Log.m105924i("MicroMsg.GestureUtil", "Both info & buff are valid, choose one to trust.");
                    int i2 = c.f184452d;
                    int i3 = b.f184274e;
                    if (i2 > i3) {
                        Log.m105925i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, srvInfo wins.", Integer.valueOf(i2), Integer.valueOf(b.f184274e));
                        return c.f184454f == 1;
                    } else if (i2 == i3) {
                        Log.m105925i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, draw.", Integer.valueOf(i2), Integer.valueOf(b.f184274e));
                        return c.f184454f == 1;
                    } else {
                        Log.m105925i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, localBuff wins.", Integer.valueOf(i2), Integer.valueOf(b.f184274e));
                        return b.f184276g == 1;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.GestureUtil", e, "isUserSetWalletLock throw an exception.", new Object[0]);
                    return false;
                }
            } else {
                Log.m105924i("MicroMsg.GestureUtil", "Info is valid but buf is invalid, we trust info this time.");
                return c.f184454f == 1;
            }
        } else if (g) {
            Log.m105924i("MicroMsg.GestureUtil", "Info is invalid but buff is valid, we trust buff this time.");
            return b.f184276g == 1;
        } else {
            Log.m105928w("MicroMsg.GestureUtil", "Both buff & info are invalid, do not activate this time and wait for next sync.");
            return false;
        }
    }

    /* renamed from: f */
    public static byte[] m145998f(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 2;
            byteArrayOutputStream.write(Integer.parseInt(str.substring(i, i2), 16));
            i = i2;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: g */
    public static boolean m145999g(C64551mb3 mb32) {
        C51018qv3 qv32;
        C89349b bVar;
        if (mb32 == null || (qv32 = mb32.f184277h) == null || (bVar = qv32.f140574f) == null) {
            return false;
        }
        byte[] bArr = bVar.f257327a;
        if (bArr.length == 0 || (bArr.length & 1) != 0) {
            return false;
        }
        long longValue = new C77710q(mb32.f184273d).longValue();
        byte[] d = m145996d(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append(mb32.f184274e);
        C51018qv3 qv33 = mb32.f184275f;
        if (qv33.f140575g) {
            sb.append(new String(qv33.f140574f.f257327a));
        }
        sb.append(longValue);
        int doEcdsaVerify = UtilsJni.doEcdsaVerify(C8244b.f27173b, sb.toString().getBytes(), d);
        Log.m105918d("MicroMsg.GestureUtil", String.format("verifyPatternBuffer, ret:%d", new Object[]{Integer.valueOf(doEcdsaVerify)}));
        return doEcdsaVerify == 1;
    }

    /* renamed from: h */
    public static boolean m146000h(C64576nb3 nb32) {
        C51018qv3 qv32;
        C89349b bVar;
        if (!(nb32 == null || (qv32 = nb32.f184453e) == null || (bVar = qv32.f140574f) == null)) {
            byte[] bArr = bVar.f257327a;
            if (bArr.length != 0 && (bArr.length & 1) == 0) {
                byte[] d = m145996d(bArr);
                long longValue = new C77710q(C86709a0.m107523b().mo121110g()).longValue();
                StringBuilder sb = new StringBuilder();
                sb.append(nb32.f184452d);
                sb.append(longValue);
                int doEcdsaVerify = UtilsJni.doEcdsaVerify(C8244b.f27173b, sb.toString().getBytes(), d);
                boolean z = (doEcdsaVerify != 1 && nb32.f184454f == 1) || (doEcdsaVerify == 1 && nb32.f184454f == 0);
                Log.m105918d("MicroMsg.GestureUtil", String.format("verifyPatternInfo, verifyRes:%d ret:%b", new Object[]{Integer.valueOf(doEcdsaVerify), Boolean.valueOf(z)}));
                return z;
            }
        }
        return false;
    }
}
