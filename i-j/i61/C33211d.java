package i61;

import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: i61.d */
public class C33211d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f90106d;

    /* renamed from: e */
    public final /* synthetic */ C33212e f90107e;

    public C33211d(C33212e eVar, String str) {
        this.f90107e = eVar;
        this.f90106d = str;
    }

    public void run() {
        this.f90107e.mo59026c(this.f90106d);
        if (this.f90107e.f90109a) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_CLEAN_TEMP_FILE_TASK_LONG, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
