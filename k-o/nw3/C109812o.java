package nw3;

import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import nw3.C109804j;

/* renamed from: nw3.o */
public class C109812o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkGroup f328720d;

    /* renamed from: e */
    public final /* synthetic */ C109804j f328721e;

    public C109812o(C109804j jVar, MultiTalkGroup multiTalkGroup) {
        this.f328721e = jVar;
        this.f328720d = multiTalkGroup;
    }

    public void run() {
        synchronized (this.f328721e.f328705a) {
            for (C109804j.C109807c o : this.f328721e.f328705a) {
                o.mo161058o(this.f328720d);
            }
        }
    }
}
