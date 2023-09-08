package t22;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import ed0.C75607a;
import ed0.C75608b;
import ed0.C75610d;
import ei3.C86522b;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p446av.C67111g;
import s22.C77611a;
import s22.C77612b;
import wm0.C38230b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: t22.s */
public class C77832s extends C86301e implements C67111g {

    /* renamed from: d */
    public C77827e f226784d;

    /* renamed from: e */
    public C118355y f226785e = null;

    /* renamed from: f */
    public C77833z f226786f = null;

    /* renamed from: g */
    public C118351p f226787g = null;

    /* renamed from: h */
    public C77830r f226788h = null;

    /* renamed from: i */
    public C77829q f226789i = null;

    public static C118355y Ax0() {
        if (vx0().f226785e == null) {
            vx0().f226785e = new C118355y();
        }
        return vx0().f226785e;
    }

    public static C77833z Bx0() {
        if (vx0().f226786f == null) {
            vx0().f226786f = new C77833z();
        }
        return vx0().f226786f;
    }

    public static C77832s vx0() {
        return (C77832s) C86312j.m106911c(C77832s.class);
    }

    public static C77827e wx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f226784d == null) {
            vx0().f226784d = new C77827e();
        }
        return vx0().f226784d;
    }

    public static C118351p xx0() {
        if (vx0().f226787g == null) {
            vx0().f226787g = new C118351p();
        }
        return vx0().f226787g;
    }

    public static C77829q yx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f226789i == null) {
            vx0().f226789i = new C77829q();
        }
        return vx0().f226789i;
    }

    public static C77830r zx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f226788h == null) {
            vx0().f226788h = new C77830r();
        }
        return vx0().f226788h;
    }

    public C75607a O50() {
        return Bx0();
    }

    /* renamed from: lZ */
    public C75608b mo91213lZ() {
        return Ax0();
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C77833z zVar = (C77833z) C75610d.m90859a();
        synchronized (zVar) {
            LinkedList<C77611a> linkedList = new LinkedList<>();
            LinkedList<C77611a> linkedList2 = zVar.f226791b.f226273d;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                for (C77611a aVar : (C77611a[]) zVar.f226791b.f226273d.toArray(new C77611a[0])) {
                    if (!Util.isNullOrNil((List) aVar.f226268e)) {
                        Iterator<String> it = aVar.f226268e.iterator();
                        boolean z = true;
                        while (it.hasNext()) {
                            String next = it.next();
                            Log.m105918d("MicroMsg.TrackRoomListMgr", "member :" + next);
                            if (next.equals(C75592q0.m90789s())) {
                                Log.m105924i("MicroMsg.TrackRoomListMgr", "reset list info and remove self location info");
                                z = false;
                            }
                        }
                        if (z) {
                            linkedList.add(aVar);
                        }
                    }
                }
            }
            C77612b bVar = new C77612b();
            bVar.f226273d = linkedList;
            bVar.f226274e = zVar.f226791b.f226274e;
            zVar.mo107952e(bVar);
        }
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C118355y yVar = this.f226785e;
        if (yVar != null) {
            yVar.f353755x = null;
            yVar.mo183163f();
            this.f226785e.mo183158a(1);
        }
        C118351p pVar = this.f226787g;
        if (pVar != null) {
            pVar.mo183153c();
            pVar.f353717c.clear();
        }
        C77830r rVar = this.f226788h;
        if (rVar != null) {
            Log.m105924i("MicroMsg.StaticMapServer", "stop static map server");
            C86709a0.m107524d().mo123470p(C38230b.CTRL_INDEX, rVar);
        }
        C77829q qVar = this.f226789i;
        if (qVar != null) {
            zx0().mo107946c(qVar);
        }
    }
}
