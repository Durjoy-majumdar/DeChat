package nw3;

import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import nw3.C109804j;

/* renamed from: nw3.r */
public class C109815r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkGroup f328727d;

    /* renamed from: e */
    public final /* synthetic */ long f328728e;

    /* renamed from: f */
    public final /* synthetic */ C109804j f328729f;

    public C109815r(C109804j jVar, MultiTalkGroup multiTalkGroup, long j) {
        this.f328729f = jVar;
        this.f328727d = multiTalkGroup;
        this.f328728e = j;
    }

    public void run() {
        synchronized (this.f328729f.f328705a) {
            for (C109804j.C109807c h : this.f328729f.f328705a) {
                h.mo161051h(this.f328727d, this.f328728e);
            }
        }
    }
}
