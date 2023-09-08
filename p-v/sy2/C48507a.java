package sy2;

import az2.C39674e;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13604l;
import rz2.C48212k;
import sx3.C64197v;
import uz2.C52677e;
import uz2.C52680f;
import uz2.C52682g;
import uz2.C52684h;
import xy2.C53477h;

/* renamed from: sy2.a */
public final class C48507a extends C117747y implements C1311n {

    /* renamed from: d */
    public final List<C13604l<String, String>> f129731d;

    /* renamed from: e */
    public final boolean f129732e;

    /* renamed from: f */
    public C11385n f129733f;

    /* renamed from: g */
    public final C47350c f129734g;

    /* renamed from: h */
    public final C52677e f129735h;

    /* renamed from: i */
    public C52682g f129736i;

    public C48507a(List<C13604l<String, String>> list, boolean z) {
        C87412m.m108594g(list, "sessionsToNames");
        this.f129731d = list;
        this.f129732e = z;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5829;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getv6stranger";
        bVar.f127066a = new C52677e();
        bVar.f127067b = new C52682g();
        C47350c a = bVar.mo72403a();
        this.f129734g = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.GetV6StrangerReq");
        this.f129735h = (C52677e) aVar;
        for (C13604l<String, String> lVar : list) {
            String str = (String) lVar.f38556e;
            if (str != null) {
                LinkedList<C52680f> linkedList = this.f129735h.f147086d;
                C52680f fVar = new C52680f();
                fVar.f147105d = str;
                linkedList.add(fVar);
            }
        }
        Log.m105924i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "req sessionsToNames:" + this.f129731d + " canTalk:" + this.f129732e);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f129733f = nVar;
        return dispatch(gVar, this.f129734g, this);
    }

    public int getType() {
        return 5829;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        LinkedList<C52684h> linkedList;
        LinkedList<C52684h> linkedList2;
        C87412m.m108594g(uVar, "rr");
        Log.m105925i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C47465a aVar = this.f129734g.f127056b.f127083a;
            C52682g gVar = aVar instanceof C52682g ? (C52682g) aVar : null;
            this.f129736i = gVar;
            Object[] objArr = new Object[2];
            objArr[0] = (gVar == null || (linkedList2 = gVar.f147109d) == null) ? null : Integer.valueOf(linkedList2.size());
            C52682g gVar2 = this.f129736i;
            if (gVar2 != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<C52684h> it = gVar2.f147109d.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    C52684h next = it.next();
                    sb.append(i4 + XVFSFile.PATH_SEPARATOR_CHAR + next.f147112d + ' ' + next.f147113e);
                    i4++;
                }
                str2 = sb.toString();
                C87412m.m108593f(str2, "sb.toString()");
            } else {
                str2 = null;
            }
            objArr[1] = str2;
            Log.m105925i("MicroMsg.TextStatus.NetSceneGetV6Stranger", "rsp size %s ret %s", objArr);
            C52682g gVar3 = this.f129736i;
            if (!(gVar3 == null || (linkedList = gVar3.f147109d) == null)) {
                int i5 = 0;
                for (T next2 : linkedList) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        C52684h hVar = (C52684h) next2;
                        if (hVar.f147112d == 0) {
                            C13604l lVar = this.f129731d.get(i5);
                            C48212k wx02 = ((C53477h) C86312j.m106911c(C53477h.class)).wx0((String) lVar.f38555d);
                            if (wx02 == null) {
                                wx02 = new C48212k();
                                wx02.field_sessionId = (String) lVar.f38555d;
                            }
                            wx02.field_nickname = hVar.f147115g;
                            wx02.field_sex = hVar.f147116h;
                            wx02.field_province = hVar.f147117i;
                            wx02.field_city = hVar.f147118j;
                            wx02.field_signature = hVar.f147119n;
                            wx02.field_bigHeadImgUrl = hVar.f147120o;
                            wx02.field_smallHeadImgUrl = hVar.f147121p;
                            wx02.field_textStatusExtInfo = hVar.f147122q;
                            wx02.field_country = hVar.f147123r;
                            wx02.field_userName = hVar.f147114f;
                            wx02.field_textStatusId = hVar.f147124s;
                            wx02.field_block = hVar.f147125t ? 1 : 0;
                            if (this.f129732e) {
                                wx02.field_canTalk = 1;
                            }
                            if (wx02.systemRowid == -1) {
                                C39674e.f106452d.mo62239E0().insert(wx02);
                            } else {
                                C39674e.f106452d.mo62239E0().update(wx02, new String[0]);
                            }
                        }
                        i5 = i6;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
        }
        C11385n nVar = this.f129733f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
