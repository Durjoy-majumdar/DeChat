package p331dj;

import android.media.AudioTrack;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: dj.e */
public class C107045e extends AudioTrack {
    public C107045e(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        int hashCode = hashCode();
        C107046f.f320450a++;
        Log.m105921e("MicroMsg.MMAudioManager", "mm audio track init [%d] mmInitCount[%d] mmReleaseCount[%d]", Integer.valueOf(hashCode), Integer.valueOf(C107046f.f320450a), Integer.valueOf(C107046f.f320451b));
        C107046f.f320452c.put(Integer.valueOf(hashCode), Util.getStack().toString());
        C107046f.m144906a();
    }

    public void release() {
        super.release();
        int hashCode = hashCode();
        C107046f.f320451b++;
        Log.m105921e("MicroMsg.MMAudioManager", "mm audio track release [%d] mmInitCount[%d] mmReleaseCount[%d]", Integer.valueOf(hashCode), Integer.valueOf(C107046f.f320450a), Integer.valueOf(C107046f.f320451b));
        C107046f.f320452c.remove(Integer.valueOf(hashCode));
    }
}
