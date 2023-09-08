package i33;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gy3.C87412m;
import hd0.C98398h0;
import hi2.C98453h;
import i72.C98606a;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p914oj.C110052b;

/* renamed from: i33.a */
public final class C98594a {

    /* renamed from: a */
    public static final C98594a f289088a = new C98594a();

    /* renamed from: a */
    public final String mo137982a(C110052b bVar, ByteBuffer byteBuffer, int i, int i2, int i3) {
        C110052b bVar2 = bVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        long currentTicks = Util.currentTicks();
        byteBuffer.clear();
        byteBuffer2.position(0);
        int i4 = 0;
        while (bVar2 != null) {
            try {
                if (bVar.mo161384c() < 0) {
                    break;
                }
                int f = bVar.mo161387f(byteBuffer2, i4 + 7);
                if (f > 2) {
                    int i5 = f + 7;
                    C98606a.m128204a(byteBuffer, i4, i5, i, i2, i3);
                    i4 += i5;
                }
                bVar.mo161382a();
            } catch (Exception e) {
                Log.printErrStackTrace("AudioUtil", e, "loadAudioTrackData error:" + e.getMessage(), new Object[0]);
            }
        }
        long ticksToNow = Util.ticksToNow(currentTicks);
        Log.m105924i("AudioUtil", '[' + hashCode() + "]load audio track size:" + i4 + " cost:" + ticksToNow);
        StringBuilder sb = new StringBuilder();
        C98453h hVar = C98453h.f288774a;
        C98398h0.wx0().getClass();
        StringBuilder sb4 = new StringBuilder();
        C86709a0.m107528h();
        sb4.append(C86709a0.m107535s().f251806d);
        sb4.append("tmp/audio");
        String i6 = C86013q1.m106448i(sb4.toString(), true);
        if (!C86013q1.m106450k(i6)) {
            C86013q1.m106461v(i6);
        }
        sb.append(i6 + XVFSFile.SEPARATOR_CHAR + System.currentTimeMillis());
        sb.append(".mp3");
        String sb5 = sb.toString();
        OutputStream K = C86013q1.m106429K(sb5, false);
        C87412m.m108593f(K, "openWrite(filePath)");
        byte[] bArr = new byte[i4];
        byteBuffer2.position(0);
        byteBuffer2.get(bArr);
        try {
            K.write(bArr);
            K.flush();
        } catch (Exception e2) {
            Log.printErrStackTrace("AudioUtil", e2, "saveBuffer2File error:" + e2.getMessage(), new Object[0]);
        } catch (Throwable th) {
            K.close();
            throw th;
        }
        K.close();
        Log.m105924i("AudioUtil", '[' + hashCode() + "]save acc to path:" + sb5);
        return sb5;
    }
}
