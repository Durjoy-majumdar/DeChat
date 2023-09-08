package nw3;

import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import nw3.C109804j;

/* renamed from: nw3.k */
public class C109808k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkGroup f328712d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328713e;

    public C109808k(C109804j jVar, MultiTalkGroup multiTalkGroup) {
        this.f328713e = jVar;
        this.f328712d = multiTalkGroup;
    }

    public void run() {
        synchronized (this.f328713e.f328705a) {
            for (C109804j.C109807c w : this.f328713e.f328705a) {
                w.mo161066w(this.f328712d);
            }
        }
    }
}
