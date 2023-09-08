package nw3;

import bs3.C104161b;
import java.util.TimerTask;
import ow3.C110091o;

/* renamed from: nw3.g */
public class C109798g extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ C110091o f328665d;

    /* renamed from: e */
    public final /* synthetic */ C109782f f328666e;

    public C109798g(C109782f fVar, C110091o oVar) {
        this.f328666e = fVar;
        this.f328665d = oVar;
    }

    public void run() {
        C110091o oVar = this.f328665d;
        if (oVar == null) {
            C104161b.m138997f("TalkRoomService", "doHelloTimeOutTask scene is null");
        } else if (!this.f328666e.mo161078J(oVar.f329407j, oVar.f329408k, oVar.f329409l, false)) {
            C110091o oVar2 = this.f328665d;
            C104161b.m138997f("TalkRoomService", "doHelloTimeOutTask isCurrentRoom is false scene.mGroupId: ", oVar2.f329407j, " scene.mRoomId: ", Integer.valueOf(oVar2.f329408k), " scene.mRoomKey: ", Long.valueOf(this.f328665d.f329409l));
        } else {
            C109782f fVar = this.f328666e;
            C104161b.m138997f("TalkRoomService", "doHelloTimeOutTask mGroupId: ", fVar.f328593p, " mRoomId: ", Integer.valueOf(fVar.f328597s), " mRoomKey: ", Long.valueOf(this.f328666e.f328598t));
            this.f328666e.f328563J.mo161128j(330);
            C109799g0.m149206g(-1606);
            C109782f fVar2 = this.f328666e;
            C110091o oVar3 = this.f328665d;
            fVar2.mo161103n(oVar3.f329407j, oVar3.f329408k, oVar3.f329409l, 117, true);
            this.f328666e.f328573S.mo161132b(-600, (Object) null);
        }
    }
}
