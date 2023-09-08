package w22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ol0.C117813j;
import te3.C118424dq3;
import te3.C118428eq3;
import te3.ep4;
import te3.ii4;

/* renamed from: w22.c */
public class C118722c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f355238d;

    /* renamed from: e */
    public final C47350c f355239e;

    /* renamed from: f */
    public String f355240f;

    /* renamed from: g */
    public int f355241g;

    /* renamed from: h */
    public ii4 f355242h = null;

    /* renamed from: i */
    public C118428eq3 f355243i;

    /* renamed from: j */
    public int f355244j;

    public C118722c(String str, int i, ep4 ep4, int i2, ii4 ii4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C118424dq3();
        bVar.f127067b = new C118428eq3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/refreshtrackroom";
        bVar.f127069d = C117813j.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f355239e = a;
        C118424dq3 dq32 = (C118424dq3) a.f127055a.f127080a;
        dq32.f353949d = str;
        dq32.f353950e = i;
        dq32.f353951f = ep4;
        dq32.f353952g = i2;
        dq32.f353953h = ii4;
        this.f355244j = i;
        Log.m105918d("MicroMsg.NetSceneRefreshTrackRoom", "userPosiItem " + ep4.f353978d + " " + ep4.f353979e.f354500d + " " + ep4.f353979e.f354501e + " heading:" + ep4.f353979e.f354502f);
        StringBuilder sb = new StringBuilder();
        sb.append("userPoi ");
        sb.append(ii4.f354055d);
        sb.append(" ");
        sb.append(ii4.f354056e);
        sb.append(" ");
        sb.append(ii4.f354057f);
        Log.m105918d("MicroMsg.NetSceneRefreshTrackRoom", sb.toString());
        Log.m105918d("MicroMsg.NetSceneRefreshTrackRoom", "trackRoomId:" + str + " uploadStatus:" + i);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f355238d = nVar;
        return dispatch(gVar, this.f355239e, this);
    }

    public int getType() {
        return C117813j.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        C118428eq3 eq32 = (C118428eq3) ((C47350c) uVar).f127056b.f127083a;
        this.f355243i = eq32;
        if (eq32 != null) {
            this.f355240f = eq32.f353982f;
        }
        if (i4 == 0 && i5 == 0) {
            this.f355241g = eq32.f353983g;
            this.f355242h = eq32.f353984h;
            LinkedList<ep4> linkedList = eq32.f353981e;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.format("[ resp count %d ] ", new Object[]{Integer.valueOf(this.f355243i.f353980d)}));
            ii4 ii4 = this.f355242h;
            if (ii4 != null) {
                stringBuffer.append(String.format("[ roomPoi  %f %f %s] ", new Object[]{Double.valueOf(ii4.f354055d), Double.valueOf(this.f355242h.f354056e), this.f355242h.f354057f}));
            }
            Log.m105918d("MicroMsg.NetSceneRefreshTrackRoom", "onGynetEnd " + stringBuffer.toString());
            LinkedList linkedList2 = new LinkedList();
            Iterator<ep4> it = this.f355243i.f353981e.iterator();
            while (it.hasNext()) {
                ep4 next = it.next();
                if (next == null) {
                    linkedList2.add(next);
                } else {
                    if (next.f353979e == null) {
                        linkedList2.add(next);
                    }
                    if (Math.abs(next.f353979e.f354501e) > 180.0d || Math.abs(next.f353979e.f354500d) > 90.0d) {
                        Log.m105929w("MicroMsg.NetSceneRefreshTrackRoom", "server lat lng invalid %s %f %f %f", next.f353978d, Double.valueOf(next.f353979e.f354500d), Double.valueOf(next.f353979e.f354501e), Double.valueOf(next.f353979e.f354502f));
                        linkedList2.add(next);
                    }
                }
            }
            C118428eq3 eq33 = this.f355243i;
            eq33.f353980d = eq33.f353981e.size();
        }
        C11385n nVar = this.f355238d;
        if (nVar != null) {
            nVar.onSceneEnd(i4, i5, str, this);
        }
    }
}
