package qe0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import te3.C52076y63;

/* renamed from: qe0.e */
public class C47804e {

    /* renamed from: a */
    public final List<String> f128358a = new ArrayList();

    /* renamed from: b */
    public final List<String> f128359b = new ArrayList();

    /* renamed from: c */
    public final List<String> f128360c = new ArrayList();

    /* renamed from: d */
    public final List<String> f128361d = new ArrayList();

    /* renamed from: e */
    public final List<String> f128362e = new ArrayList();

    /* renamed from: f */
    public final List<String> f128363f = new ArrayList();

    /* renamed from: a */
    public void mo72572a(LinkedList<C52076y63> linkedList) {
        Iterator<C52076y63> it = linkedList.iterator();
        while (it.hasNext()) {
            C52076y63 next = it.next();
            int i = next.f145144e;
            if (i == 0) {
                ((ArrayList) this.f128358a).add(next.f145143d);
            } else if (i == 3) {
                Log.m105918d("OpenIMChatRoomMember.Classifier", " blacklist : " + next.f145143d);
                ((ArrayList) this.f128360c).add(next.f145143d);
            } else if (i == 1) {
                Log.m105918d("OpenIMChatRoomMember.Classifier", " not user : " + next.f145143d);
                ((ArrayList) this.f128361d).add(next.f145143d);
            } else if (i == 2) {
                Log.m105918d("OpenIMChatRoomMember.Classifier", " invalid username : " + next.f145143d);
                ((ArrayList) this.f128359b).add(next.f145143d);
            } else if (i == 4) {
                Log.m105918d("OpenIMChatRoomMember.Classifier", " verify user : " + next.f145143d);
                ((ArrayList) this.f128362e).add(next.f145143d);
            } else if (i != 5) {
                if (i == 6) {
                    ((ArrayList) this.f128363f).add(next.f145143d);
                } else {
                    Log.m105928w("OpenIMChatRoomMember.Classifier", "unknown member status : status = " + i);
                }
            }
        }
    }
}
