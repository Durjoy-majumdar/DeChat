package sx2;

import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import dd0.C45322a;
import dd0.C45323b;
import eb0.C97625j3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import qx2.C47888a;
import qx2.C47889b;
import te3.gf4;

/* renamed from: sx2.j */
public class C48497j implements C45323b {

    /* renamed from: a */
    public final String f129702a;

    /* renamed from: b */
    public C47889b f129703b;

    /* renamed from: c */
    public MMHandler f129704c;

    /* renamed from: d */
    public HashSet<C45322a> f129705d = new HashSet<>();

    /* renamed from: sx2.j$a */
    public class C48498a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C45322a f129706d;

        /* renamed from: e */
        public final /* synthetic */ String f129707e;

        /* renamed from: f */
        public final /* synthetic */ String f129708f;

        /* renamed from: g */
        public final /* synthetic */ String f129709g;

        public C48498a(C48497j jVar, C45322a aVar, String str, String str2, String str3) {
            this.f129706d = aVar;
            this.f129707e = str;
            this.f129708f = str2;
            this.f129709g = str3;
        }

        public void run() {
            this.f129706d.mo69890y1(this.f129707e, this.f129708f, this.f129709g);
        }
    }

    public C48497j() {
        Uri n = C116299g2.m163858n(C97625j3.m125812b().mo105901p() + "talkroom/");
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C97625j3.m125812b().mo105901p() + "talkroom/");
        sb.append("talkroomMemberList.info");
        String sb4 = sb.toString();
        this.f129702a = sb4;
        this.f129704c = new MMHandler(Looper.getMainLooper());
        if (this.f129703b == null) {
            if (!C86013q1.m106450k(sb4)) {
                this.f129703b = new C47889b();
                return;
            }
            try {
                this.f129703b = (C47889b) new C47889b().parseFrom(C86013q1.m106433O(sb4, 0, -1));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TalkRoomInfoListMgr", e, "", new Object[0]);
                this.f129703b = new C47889b();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo73127a(C45322a aVar) {
        this.f129705d.add(aVar);
    }

    /* renamed from: b */
    public final void mo73128b(String str, String str2, String str3) {
        Iterator<C45322a> it = this.f129705d.iterator();
        while (it.hasNext()) {
            this.f129704c.post(new C48498a(this, it.next(), str, str2, str3));
        }
    }

    /* renamed from: c */
    public synchronized boolean mo73129c(String str) {
        Iterator<C47888a> it = this.f129703b.f128488d.iterator();
        while (it.hasNext()) {
            C47888a next = it.next();
            if (next.f128485d.equals(str) && next.f128487f == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public synchronized LinkedList<gf4> mo73130d(String str) {
        Iterator<C47888a> it = this.f129703b.f128488d.iterator();
        while (it.hasNext()) {
            C47888a next = it.next();
            if (next.f128485d.equals(str)) {
                return (LinkedList) next.f128486e.clone();
            }
        }
        return new LinkedList<>();
    }

    /* renamed from: e */
    public final boolean mo73131e(C47889b bVar) {
        if (bVar.f128488d.isEmpty()) {
            C86013q1.m106447h(this.f129702a);
            return true;
        }
        try {
            byte[] byteArray = bVar.toByteArray();
            C86013q1.m106438T(this.f129702a, byteArray, 0, byteArray.length);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TalkRoomInfoListMgr", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: f */
    public synchronized void mo73132f(C45322a aVar) {
        this.f129705d.remove(aVar);
    }

    /* renamed from: g */
    public synchronized void mo73133g(String str, LinkedList<gf4> linkedList, String str2, String str3, int i) {
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        Log.m105925i("MicroMsg.TalkRoomInfoListMgr", "updateList talk: %s,  size: %d", str, Integer.valueOf(linkedList.size()));
        LinkedList<gf4> linkedList2 = (LinkedList) linkedList.clone();
        boolean isEmpty = linkedList2.isEmpty();
        Iterator<C47888a> it = this.f129703b.f128488d.iterator();
        while (it.hasNext()) {
            C47888a next = it.next();
            if (next.f128485d.equals(str)) {
                if (isEmpty) {
                    this.f129703b.f128488d.remove(next);
                } else {
                    next.f128486e = linkedList2;
                    next.f128487f = i;
                }
                mo73131e(this.f129703b);
                mo73128b(str, str2, str3);
                return;
            }
        }
        if (!isEmpty) {
            C47888a aVar = new C47888a();
            aVar.f128485d = str;
            aVar.f128486e = linkedList2;
            aVar.f128487f = i;
            this.f129703b.f128488d.add(aVar);
        }
        mo73131e(this.f129703b);
        mo73128b(str, str2, str3);
    }
}
