package p331dj;

import android.media.AudioRecord;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: dj.d */
public class C107044d extends AudioRecord {
    public C107044d(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5);
        int hashCode = hashCode();
        C107046f.f320453d++;
        Log.printInfoStack("MicroMsg.MMAudioManager", "mm audio record init [%d] mmInitCount[%d] mmReleaseCount[%d]", Integer.valueOf(hashCode), Integer.valueOf(C107046f.f320453d), Integer.valueOf(C107046f.f320454e));
        C107046f.f320455f.put(Integer.valueOf(hashCode), Util.getStack().toString());
        C107046f.m144906a();
    }

    public void release() {
        super.release();
        int hashCode = hashCode();
        if (C107046f.f320455f.containsKey(Integer.valueOf(hashCode))) {
            C107046f.f320454e++;
            Log.printInfoStack("MicroMsg.MMAudioManager", "mm audio record release [%d] mmInitCount[%d] mmReleaseCount[%d]", Integer.valueOf(hashCode), Integer.valueOf(C107046f.f320453d), Integer.valueOf(C107046f.f320454e));
            C107046f.f320455f.remove(Integer.valueOf(hashCode));
        }
    }
}
