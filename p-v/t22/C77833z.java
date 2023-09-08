package t22;

import android.net.Uri;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import ed0.C75607a;
import ed0.C75609c;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p740wo.C53193b;
import s22.C77611a;
import s22.C77612b;

/* renamed from: t22.z */
public class C77833z implements C75607a {

    /* renamed from: a */
    public final String f226790a;

    /* renamed from: b */
    public C77612b f226791b;

    /* renamed from: c */
    public MMHandler f226792c;

    /* renamed from: d */
    public List<C75609c> f226793d = new LinkedList();

    /* renamed from: t22.z$a */
    public class C77834a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C75609c f226794d;

        /* renamed from: e */
        public final /* synthetic */ String f226795e;

        /* renamed from: f */
        public final /* synthetic */ String f226796f;

        /* renamed from: g */
        public final /* synthetic */ String f226797g;

        public C77834a(C77833z zVar, C75609c cVar, String str, String str2, String str3) {
            this.f226794d = cVar;
            this.f226795e = str;
            this.f226796f = str2;
            this.f226797g = str3;
        }

        public void run() {
            this.f226794d.mo102271d3(this.f226795e, this.f226796f, this.f226797g);
        }
    }

    public C77833z() {
        Uri n = C116299g2.m163858n(C86709a0.m107535s().f251807e + "trackroom/");
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
        sb.append(C86709a0.m107535s().f251807e + "trackroom/");
        sb.append("trackroominfolist.info");
        String sb4 = sb.toString();
        this.f226790a = sb4;
        this.f226792c = new MMHandler(Looper.getMainLooper());
        if (this.f226791b == null) {
            if (!C86013q1.m106450k(sb4)) {
                this.f226791b = new C77612b();
                return;
            }
            try {
                this.f226791b = (C77612b) new C77612b().parseFrom(C86013q1.m106433O(sb4, 0, -1));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.TrackRoomListMgr", e, "", new Object[0]);
                this.f226791b = new C77612b();
            }
        }
    }

    /* renamed from: a */
    public final void mo107948a(String str, String str2, String str3) {
        for (C75609c aVar : this.f226793d) {
            this.f226792c.post(new C77834a(this, aVar, str, str2, str3));
        }
    }

    /* renamed from: b */
    public String mo107949b() {
        C77612b bVar = this.f226791b;
        return bVar != null ? bVar.f226274e : "";
    }

    /* renamed from: c */
    public synchronized LinkedList<String> mo107950c(String str) {
        C77611a aVar = null;
        Iterator<C77611a> it = this.f226791b.f226273d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C77611a next = it.next();
            if (next.f226267d.equals(str)) {
                if (((C53193b) C86312j.m106911c(C53193b.class)).Z60(str)) {
                    aVar = next;
                } else {
                    return (LinkedList) next.f226268e.clone();
                }
            }
        }
        if (aVar != null) {
            mo107956i(aVar.f226267d, (LinkedList<String>) null, 0.0d, 0.0d, "", "", "");
        }
        return new LinkedList<>();
    }

    /* renamed from: d */
    public synchronized C77611a mo107951d(String str) {
        Iterator<C77611a> it = this.f226791b.f226273d.iterator();
        while (it.hasNext()) {
            C77611a next = it.next();
            if (next.f226267d.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo107952e(C77612b bVar) {
        Log.m105919d("MicroMsg.TrackRoomListMgr", "infoFile infolist size %d", Integer.valueOf(bVar.f226273d.size()));
        if (bVar.f226273d.isEmpty()) {
            C86013q1.m106447h(this.f226790a);
            return true;
        }
        try {
            byte[] byteArray = bVar.toByteArray();
            C86013q1.m106438T(this.f226790a, byteArray, 0, byteArray.length);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TrackRoomListMgr", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: f */
    public boolean mo107953f() {
        Iterator<C77611a> it = this.f226791b.f226273d.iterator();
        while (it.hasNext()) {
            C77611a next = it.next();
            Log.m105918d("MicroMsg.TrackRoomListMgr", "info :" + next.f226268e.size());
            Iterator<String> it4 = next.f226268e.iterator();
            while (true) {
                if (it4.hasNext()) {
                    String next2 = it4.next();
                    Log.m105918d("MicroMsg.TrackRoomListMgr", "member :" + next2);
                    if (next2.equals(C75592q0.m90789s())) {
                        Log.m105924i("MicroMsg.TrackRoomListMgr", "now is sharing location..");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo107954g(String str) {
        return mo107950c(str).size() > 0;
    }

    /* renamed from: h */
    public boolean mo107955h(String str, String str2) {
        return mo107950c(str).contains(str2);
    }

    /* renamed from: i */
    public synchronized void mo107956i(String str, LinkedList<String> linkedList, double d, double d2, String str2, String str3, String str4) {
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        Log.m105925i("MicroMsg.TrackRoomListMgr", "updateList talk: %s,  size: %d %f %f", str, Integer.valueOf(linkedList.size()), Double.valueOf(d), Double.valueOf(d2));
        LinkedList<String> linkedList2 = (LinkedList) linkedList.clone();
        boolean isEmpty = linkedList2.isEmpty();
        Iterator<C77611a> it = this.f226791b.f226273d.iterator();
        while (it.hasNext()) {
            C77611a next = it.next();
            if (next.f226267d.equals(str)) {
                if (isEmpty) {
                    this.f226791b.f226273d.remove(next);
                } else {
                    next.f226268e = linkedList2;
                    next.f226271h = str2;
                    next.f226270g = d;
                    next.f226269f = d2;
                }
                mo107952e(this.f226791b);
                mo107948a(str, str3, str4);
                return;
            }
        }
        if (!isEmpty) {
            C77611a aVar = new C77611a();
            aVar.f226267d = str;
            aVar.f226268e = linkedList2;
            aVar.f226271h = str2;
            aVar.f226270g = d;
            aVar.f226269f = d2;
            this.f226791b.f226273d.add(aVar);
        }
        mo107952e(this.f226791b);
        mo107948a(str, str3, str4);
    }
}
