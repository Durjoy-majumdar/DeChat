package zu0;

import android.database.Cursor;
import av0.C16686a;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import h11.C98311d;
import j11.C98896e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import qv0.C101304e;
import wy0.C102506a;
import yu0.C102912i;

/* renamed from: zu0.d */
public class C103085d {

    /* renamed from: a */
    public boolean f304151a = false;

    /* renamed from: a */
    public void mo142811a(LinkedList<C102912i> linkedList, d$$d d__d, long j) {
        HashMap hashMap;
        Cursor kD;
        Throwable th;
        d$$d d__d2 = d__d;
        long nowMilliSecond = Util.nowMilliSecond();
        C101304e l = C16686a.m16193i().mo17663l();
        if (l.f296802p == 0) {
            long j2 = l.f296800n;
            long j3 = l.f296801o;
            long[] jArr = CleanChattingUI.f267888D;
            hashMap = new HashMap();
            try {
                kD = C102506a.f301832a.mo142120e().mo142700kD(j2, j3);
                while (kD.moveToNext()) {
                    String string = kD.getString(0);
                    long[] jArr2 = new long[5];
                    int i = 0;
                    while (i < 5) {
                        int i2 = i + 1;
                        jArr2[i] = jArr2[i] + kD.getLong(i2);
                        i = i2;
                    }
                    hashMap.put(string, jArr2);
                }
                kD.close();
            } catch (NullPointerException e) {
                Log.printErrStackTrace("MicroMsg.CleanChattingUI", e, "", new Object[0]);
            } catch (Throwable th4) {
                th.addSuppressed(th4);
            }
        } else {
            hashMap = null;
        }
        HashMap hashMap2 = hashMap;
        Iterator<C102912i> it = linkedList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C102912i next = it.next();
            if (next.f303762g >= 0) {
                i3++;
            } else {
                long[] jArr3 = next.f303761f;
                long[] jArr4 = CleanChattingUI.f267888D;
                long j4 = C98896e.wx0().f289910h;
                if (j4 < 0) {
                    j4 = C98311d.m127052a();
                    C98896e.wx0().f289910h = j4;
                }
                jArr3[0] = j4 * next.f303763h;
                next.f303762g = next.f303761f[0];
                if (hashMap2 != null && hashMap2.containsKey(next.f303759d)) {
                    long[] jArr5 = (long[]) hashMap2.get(next.f303759d);
                    if (jArr5.length > 0) {
                        long[] jArr6 = next.f303761f;
                        long j5 = jArr6[0] + jArr5[0];
                        jArr6[0] = j5;
                        long j6 = jArr5[0];
                        long j7 = jArr5[1];
                        if (j6 >= j7) {
                            jArr6[1] = jArr6[1] + (j6 - j7);
                        }
                        next.f303762g = j5;
                    }
                }
                int i4 = i3 + 1;
                if (!this.f304151a && d__d2 != null) {
                    C102912i iVar = new C102912i();
                    iVar.f303759d = next.f303759d;
                    iVar.f303760e = next.f303760e;
                    iVar.f303762g = next.f303762g;
                    iVar.f303763h = next.f303763h;
                    MMHandlerThread.postToMainThread(new d$$a(this, d__d, linkedList, iVar, i4));
                }
                i3 = i4;
            }
        }
        if (this.f304151a || d__d2 == null) {
            LinkedList<C102912i> linkedList2 = linkedList;
        } else {
            MMHandlerThread.postToMainThread(new d$$b(this, d__d2, linkedList));
        }
        Log.m105925i("MicroMsg.BackupCalculator", "calculChooseConvSize loading time[%d] userSize:%d", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)), Integer.valueOf(linkedList.size()));
        return;
        throw th;
    }

    /* renamed from: b */
    public void mo142812b() {
        Log.m105925i("MicroMsg.BackupCalculator", "cancel. stack:%s", Util.getStack());
        this.f304151a = true;
    }
}
