package nw3;

import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import nw3.C109804j;

/* renamed from: nw3.p */
public class C109813p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkGroup f328722d;

    /* renamed from: e */
    public final /* synthetic */ long f328723e;

    /* renamed from: f */
    public final /* synthetic */ C109804j f328724f;

    public C109813p(C109804j jVar, MultiTalkGroup multiTalkGroup, long j) {
        this.f328724f = jVar;
        this.f328722d = multiTalkGroup;
        this.f328723e = j;
    }

    public void run() {
        synchronized (this.f328724f.f328705a) {
            for (C109804j.C109807c x : this.f328724f.f328705a) {
                x.mo161067x(this.f328722d, this.f328723e);
            }
        }
    }
}
