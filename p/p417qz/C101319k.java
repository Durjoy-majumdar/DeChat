package p417qz;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98429r0;
import ic3.C98663a;
import java.util.HashMap;
import java.util.List;
import p682rz.C101480j;
import p682rz.C101489t;

@C86522b
/* renamed from: qz.k */
public class C101319k extends C86301e implements C101480j {

    /* renamed from: d */
    public final HashMap<Long, List<String>> f296821d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<Long, List<String>> f296822e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<Long, C101480j.C101481a> f296823f = new HashMap<>();

    /* renamed from: g */
    public final HashMap<Long, Boolean> f296824g = new HashMap<>();

    /* renamed from: h */
    public final C101489t.C77595a f296825h = new k$$d(this);

    public static void vx0(C98408n0 n0Var, C98663a aVar) {
        aVar.mo55235t0(n0Var.mo137700d());
        aVar.mo55236u0(n0Var.f288557d);
        aVar.mo55241z0(n0Var.f288559f);
        String str = n0Var.f288546N;
        C98408n0 n0Var2 = null;
        if (str != null) {
            n0Var2 = C98429r0.m127818i(str);
        }
        if (n0Var2 != null) {
            aVar.mo55237v0(str);
            aVar.mo55238w0(n0Var2.f288557d);
            aVar.mo55239x0(n0Var2.f288559f);
        }
    }

    /* renamed from: Vx */
    public void mo140782Vx(String str, int[] iArr) {
        C96790t0.m124280a(str, iArr, 640, 480);
    }

    /* renamed from: Wn */
    public boolean mo140783Wn(long j, List<String> list, C101480j.C101481a aVar) {
        boolean z;
        Log.m105924i("MicroMsg.ImportMultiVideoService", "call resumeVideoUpload, msg id = " + j);
        if (j < 0) {
            Log.m105924i("MicroMsg.ImportMultiVideoService", "resumeVideoUpload, msgLocalId :" + j + " is invalid");
            return false;
        }
        synchronized (this) {
            this.f296824g.remove(Long.valueOf(j));
            if (aVar != null) {
                this.f296823f.put(Long.valueOf(j), aVar);
            }
            List<String> list2 = this.f296821d.get(Long.valueOf(j));
            if (list2 != null || list == null) {
                if (list != null) {
                    list.removeAll(list2);
                    list2.addAll(list);
                }
                list = list2;
                z = false;
            } else {
                this.f296821d.put(Long.valueOf(j), list);
                z = true;
            }
            if (list != null) {
                if (!list.isEmpty()) {
                    for (String next : list) {
                        if (next == null) {
                            Log.m105924i("MicroMsg.ImportMultiVideoService", "call resume, but file name is null");
                        } else {
                            C98408n0 i = C98429r0.m127818i(next);
                            if (i == null) {
                                if (aVar != null) {
                                    aVar.mo139226c(next);
                                }
                                Log.m105924i("MicroMsg.ImportMultiVideoService", "can not found video info for " + next);
                            } else {
                                int i2 = i.f288562i;
                                if (i2 != 199) {
                                    if (i2 != 105) {
                                        if (!z) {
                                            Log.m105924i("MicroMsg.ImportMultiVideoService", "try resume send, but status is not pause, status = " + i2 + " file name = " + next);
                                            if (!(aVar == null || i2 == 104 || i2 == 103 || i2 == 106)) {
                                                aVar.mo139226c(next);
                                            }
                                        }
                                    }
                                    int K = C98429r0.m127805K(next);
                                    Log.m105924i("MicroMsg.ImportMultiVideoService", "try resume send, file name = " + next + " result = " + K + " status = " + i2);
                                    if (!(K == 0 || aVar == null)) {
                                        aVar.mo139226c(next);
                                    }
                                } else if (aVar != null) {
                                    C98663a aVar2 = new C98663a();
                                    aVar2.mo141099d(i.mo137705i());
                                    vx0(i, aVar2);
                                    aVar.mo139225b(next, aVar2);
                                    Log.m105924i("MicroMsg.ImportMultiVideoService", "try resume send, has already upload finish, just call listener");
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            Log.m105924i("MicroMsg.ImportMultiVideoService", "try resume video, but msg id have no process video, msg id = " + j);
            return false;
        }
    }

    public boolean d30(long j) {
        Log.m105924i("MicroMsg.ImportMultiVideoService", "call pauseVideoUpload, msg id = " + j);
        if (j < 0) {
            Log.m105924i("MicroMsg.ImportMultiVideoService", "pauseVideoUpload, msgLocalId :" + j + " is invalid");
            return false;
        }
        synchronized (this) {
            this.f296824g.put(Long.valueOf(j), Boolean.TRUE);
            List<String> list = this.f296821d.get(Long.valueOf(j));
            if (list != null) {
                if (!list.isEmpty()) {
                    for (String str : list) {
                        if (str != null) {
                            C98408n0 i = C98429r0.m127818i(str);
                            if (i != null) {
                                int i2 = i.f288562i;
                                if (i2 == 103 || i2 == 104) {
                                    if (C98429r0.m127835z(str) != 0) {
                                        Log.m105924i("MicroMsg.ImportMultiVideoService", "try pause send fail, file name = " + str);
                                    }
                                }
                            }
                            Log.m105924i("MicroMsg.ImportMultiVideoService", "can not found video info for " + str + " or in remux process now");
                        }
                    }
                    return true;
                }
            }
            Log.m105924i("MicroMsg.ImportMultiVideoService", "try pause video, but msg id have no process video, msg id = " + j);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        r3 = new android.content.Intent();
        r3.putExtra("ImportMsgLocalId", r12);
        ((zt3.C119157j) zt3.C119157j.f356862d).mo183884o(new com.tencent.p014mm.pluginsdk.model.C96790t0(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext(), r9, r3, r14, 2, new p417qz.k$$b(r8, r15, r12), r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c7, code lost:
        return;
     */
    /* renamed from: jd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo140785jd(java.util.List<java.lang.String> r9, boolean r10, boolean r11, long r12, java.lang.String r14, p682rz.C101480j.C101481a r15) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashMap<java.lang.Long, java.util.List<java.lang.String>> r10 = r8.f296822e     // Catch:{ all -> 0x00c8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x00c8 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x00c8 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x00c8 }
            java.util.HashMap<java.lang.Long, java.util.List<java.lang.String>> r0 = r8.f296821d     // Catch:{ all -> 0x00c8 }
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x00c8 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00c8 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00c8 }
            if (r10 == 0) goto L_0x00a2
            java.lang.String r1 = "MicroMsg.ImportMultiVideoService"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r2.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = "in process path = "
            r2.append(r3)     // Catch:{ all -> 0x00c8 }
            r2.append(r10)     // Catch:{ all -> 0x00c8 }
            java.lang.String r3 = " import path = "
            r2.append(r3)     // Catch:{ all -> 0x00c8 }
            r2.append(r9)     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00c8 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00c8 }
            r1.<init>(r9)     // Catch:{ all -> 0x00c8 }
            r9.removeAll(r10)     // Catch:{ all -> 0x00c8 }
            int r10 = r9.size()     // Catch:{ all -> 0x00c8 }
            if (r10 != 0) goto L_0x00a2
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00c8 }
            r9.<init>()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0076
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x00c8 }
        L_0x0052:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x00c8 }
            if (r11 == 0) goto L_0x0076
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x00c8 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00c8 }
            if (r11 != 0) goto L_0x0061
            goto L_0x0052
        L_0x0061:
            hd0.n0 r12 = hd0.C98429r0.m127818i(r11)     // Catch:{ all -> 0x00c8 }
            if (r12 != 0) goto L_0x0068
            goto L_0x0052
        L_0x0068:
            java.lang.String r12 = r12.mo137702f()     // Catch:{ all -> 0x00c8 }
            boolean r12 = r1.contains(r12)     // Catch:{ all -> 0x00c8 }
            if (r12 == 0) goto L_0x0052
            r9.add(r11)     // Catch:{ all -> 0x00c8 }
            goto L_0x0052
        L_0x0076:
            java.lang.String r10 = "MicroMsg.ImportMultiVideoService"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            r11.<init>()     // Catch:{ all -> 0x00c8 }
            java.lang.String r12 = "duplicate import path, return ImportVideoConstants.ERR_DUPLICATE_MSG_ID, import path = "
            r11.append(r12)     // Catch:{ all -> 0x00c8 }
            r11.append(r1)     // Catch:{ all -> 0x00c8 }
            java.lang.String r12 = " file name list = "
            r11.append(r12)     // Catch:{ all -> 0x00c8 }
            r11.append(r9)     // Catch:{ all -> 0x00c8 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00c8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x00c8 }
            zt3.t r10 = zt3.C119157j.f356862d     // Catch:{ all -> 0x00c8 }
            qz.k$$a r11 = new qz.k$$a     // Catch:{ all -> 0x00c8 }
            r11.<init>(r15, r9, r1)     // Catch:{ all -> 0x00c8 }
            zt3.j r10 = (zt3.C119157j) r10     // Catch:{ all -> 0x00c8 }
            r10.mo183895z(r11)     // Catch:{ all -> 0x00c8 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c8 }
            return
        L_0x00a2:
            monitor-exit(r8)     // Catch:{ all -> 0x00c8 }
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r10 = "ImportMsgLocalId"
            r3.putExtra(r10, r12)
            com.tencent.mm.pluginsdk.model.t0 r10 = new com.tencent.mm.pluginsdk.model.t0
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 2
            qz.k$$b r6 = new qz.k$$b
            r6.<init>(r8, r15, r12)
            r0 = r10
            r2 = r9
            r4 = r14
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            zt3.t r9 = zt3.C119157j.f356862d
            zt3.j r9 = (zt3.C119157j) r9
            r9.mo183884o(r10)
            return
        L_0x00c8:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c8 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p417qz.C101319k.mo140785jd(java.util.List, boolean, boolean, long, java.lang.String, rz.j$a):void");
    }

    public void ml0(String str, int[] iArr, int i, int i2) {
        C96790t0.m124280a(str, iArr, i, i2);
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C98398h0.Bx0().mo137716b(this.f296825h, Looper.getMainLooper());
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C98398h0.Bx0().mo137731u(this.f296825h);
    }

    public boolean tp0(long j, List<String> list) {
        Log.m105924i("MicroMsg.ImportMultiVideoService", "call deleteVideoUpload, msg id = " + j);
        if (j < 0) {
            Log.m105924i("MicroMsg.ImportMultiVideoService", "deleteVideoUpload, msgLocalId :" + j + " is invalid");
            return false;
        }
        if (list != null) {
            for (String next : list) {
                if (next != null) {
                    Log.m105924i("MicroMsg.ImportMultiVideoService", "delete in call list, file name = " + next);
                    C98429r0.m127815f(next);
                }
            }
        }
        synchronized (this) {
            this.f296824g.remove(Long.valueOf(j));
            List<String> remove = this.f296821d.remove(Long.valueOf(j));
            if (remove != null) {
                if (!remove.isEmpty()) {
                    for (String str : remove) {
                        if (str != null) {
                            if (C98429r0.m127818i(str) == null) {
                                Log.m105924i("MicroMsg.ImportMultiVideoService", "can not found video info for " + str);
                            } else {
                                C98429r0.m127815f(str);
                            }
                        }
                    }
                    this.f296822e.remove(Long.valueOf(j));
                    this.f296823f.remove(Long.valueOf(j));
                    return true;
                }
            }
            Log.m105924i("MicroMsg.ImportMultiVideoService", "try delete video, but msg id have no process video, msg id = " + j);
            return false;
        }
    }
}
