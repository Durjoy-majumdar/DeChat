package com.tencent.p014mm.modelavatar;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.modelavatar.t */
public class C68099t {

    /* renamed from: a */
    public static List<String> f195740a;

    /* renamed from: b */
    public static int f195741b;

    /* renamed from: c */
    public static C68100a f195742c = new C68100a(new C68101b(), true);

    /* renamed from: com.tencent.mm.modelavatar.t$a */
    public static class C68100a extends MTimerHandler {

        /* renamed from: a */
        public final C68101b f195743a;

        public C68100a(C68101b bVar, boolean z) {
            super(bVar, z);
            this.f195743a = bVar;
        }
    }

    /* renamed from: com.tencent.mm.modelavatar.t$b */
    public static class C68101b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public Runnable f195744d;

        public boolean onTimerExpired() {
            int size = ((ArrayList) C68099t.f195740a).size();
            Log.m105920e("MicroMsg.RemoveAvatarTask", "RemoveOldAvatar left count:" + size);
            if (size <= 2000 || C68099t.f195741b >= 300) {
                Runnable runnable = this.f195744d;
                if (runnable != null) {
                    runnable.run();
                }
                C68099t.f195741b = 0;
                return false;
            }
            long beginTransaction = C86709a0.m107535s().f251811i.beginTransaction(Thread.currentThread().getId());
            for (int i = size - 1; i >= size - 30; i--) {
                C68099t.f195741b++;
                String str = (String) ((ArrayList) C68099t.f195740a).get(i);
                ((ArrayList) C68099t.f195740a).remove(i);
                C68102u.wx0().mo93566o(str, false);
                C68102u.wx0().mo93566o(str, true);
                C68102u.zx0().mo93610qq(str);
            }
            C86709a0.m107535s().f251811i.endTransaction(beginTransaction);
            return true;
        }
    }
}
