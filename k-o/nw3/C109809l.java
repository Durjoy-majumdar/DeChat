package nw3;

import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import nw3.C109804j;

/* renamed from: nw3.l */
public class C109809l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f328714d;

    /* renamed from: e */
    public final /* synthetic */ MultiTalkGroup f328715e;

    /* renamed from: f */
    public final /* synthetic */ C109804j f328716f;

    public C109809l(C109804j jVar, int i, MultiTalkGroup multiTalkGroup) {
        this.f328716f = jVar;
        this.f328714d = i;
        this.f328715e = multiTalkGroup;
    }

    public void run() {
        synchronized (this.f328716f.f328705a) {
            for (C109804j.C109807c j : this.f328716f.f328705a) {
                j.mo161053j(this.f328714d, this.f328715e);
            }
        }
    }
}
