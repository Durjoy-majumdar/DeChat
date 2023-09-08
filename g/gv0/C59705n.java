package gv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import pe3.C47465a;
import pv0.C62565l;
import pv0.C62567m;

/* renamed from: gv0.n */
public class C59705n extends C20842c {

    /* renamed from: u */
    public C62565l f170562u = new C62565l();

    /* renamed from: v */
    public C62567m f170563v = new C62567m();

    public C59705n(LinkedList<String> linkedList, long j, long j2) {
        Log.m105925i("MicroMsg.BackupRequestSessionScene", "init sessionName[%d], startTime[%d], endTime[%d]", Integer.valueOf(linkedList.size()), Long.valueOf(j), Long.valueOf(j2));
        C62565l lVar = this.f170562u;
        lVar.f177709d = linkedList;
        lVar.f177710e = new LinkedList<>();
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            this.f170562u.f177710e.add(Long.valueOf(j));
            this.f170562u.f177710e.add(Long.valueOf(j2));
        }
    }

    public int getType() {
        return 11;
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f170562u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f170563v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        C62567m mVar = this.f170563v;
        LinkedList<String> linkedList = mVar.f177715d;
        if (linkedList == null || mVar.f177716e == null || linkedList.isEmpty() || this.f170563v.f177715d.size() * 2 != this.f170563v.f177716e.size()) {
            C62567m mVar2 = this.f170563v;
            LinkedList<String> linkedList2 = mVar2.f177715d;
            if (!(linkedList2 == null || mVar2.f177716e == null)) {
                Log.m105921e("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName and TimeInterval size error. sessionName size[%d], timeInterval size[%d]", Integer.valueOf(linkedList2.size()), Integer.valueOf(this.f170563v.f177716e.size()));
            }
            mo32546m1(4, -1, "BackupRequestSession failed");
            return;
        }
        Log.m105925i("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName size[%d], name:%s", Integer.valueOf(this.f170563v.f177715d.size()), this.f170563v.f177715d.toString());
        Log.m105925i("MicroMsg.BackupRequestSessionScene", "onSceneEnd requestsession resp, TimeInterval:%s", this.f170563v.f177716e.toString());
        mo32546m1(0, 0, "BackupRequestSession success");
    }
}
