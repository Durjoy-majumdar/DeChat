package je1;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C9255j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C36907w;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C50657ob1;
import te3.C50807pb1;
import vp1.C14937o;
import vp1.C14944s;
import wp1.C15585f;
import zc1.C66785b;

/* renamed from: je1.v3 */
public final class C46543v3 extends C9255j {

    /* renamed from: g */
    public final String f125409g;

    /* renamed from: h */
    public C47350c f125410h;

    /* renamed from: i */
    public C11385n f125411i;

    /* renamed from: j */
    public int f125412j;

    /* renamed from: n */
    public List<? extends FinderItem> f125413n;

    public C46543v3(String str, String str2, C89349b bVar, int i, C49712hj1 hj12) {
        super(hj12);
        this.f125409g = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 6628;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findermvuserpage";
        C50657ob1 ob12 = new C50657ob1();
        ob12.f139079f = str2;
        ob12.f139078e = str;
        ob12.f139080g = bVar;
        this.f125412j = i;
        C46523h2 h2Var = C46523h2.f125330a;
        ob12.f139077d = h2Var.mo71860b(6628, hj12);
        ob12.f139081h = h2Var.mo71867j();
        bVar2.f127066a = ob12;
        bVar2.f127067b = new C50807pb1();
        this.f125410h = bVar2.mo72403a();
        Log.m105924i("Finder.NetSceneFinderMVUserPage", "NetSceneFinderMVUserPage init finderUserName " + str + " finderSelfUserName: " + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125411i = nVar;
        return dispatch(gVar, this.f125410h, this);
    }

    public int getType() {
        return 6628;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        super.mo8516k1(i, i2, i3, str, uVar, bArr);
        Log.m105924i("Finder.NetSceneFinderMVUserPage", "errType " + i4 + ", errCode " + i5 + ", errMsg " + str2);
        if (i4 == 0 && i5 == 0) {
            C47465a aVar = this.f125410h.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMVUserPageResponse");
            C50807pb1 pb12 = (C50807pb1) aVar;
            C15585f.C15586a aVar2 = C15585f.f42211a;
            C47465a aVar3 = this.f125410h.f127056b.f127083a;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMVUserPageResponse");
            LinkedList<FinderObject> linkedList = ((C50807pb1) aVar3).f139687d;
            C87412m.m108593f(linkedList, "commReqResp.responseProt…serPageResponse).`object`");
            this.f125413n = aVar2.mo14343f(linkedList, 33280, this.f172736d);
            if (this.f125412j != 2) {
                String str3 = this.f125409g;
                if (str3 == null) {
                    str3 = C66785b.f191882e.mo90662O5();
                }
                List<? extends FinderItem> list = this.f125413n;
                if (list != null) {
                    LinkedList linkedList2 = new LinkedList();
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        FinderItem finderItem = (FinderItem) it.next();
                        C14944s sVar = r8;
                        C14944s sVar2 = new C14944s(0, finderItem.getFinderObject().f164794id, finderItem.getFinderObject(), 33280, false, 16, (C8480h) null);
                        linkedList2.add(sVar);
                    }
                    if (linkedList2.size() > 0) {
                        C14937o.C14938a aVar4 = C14937o.f40972a;
                        if (TextUtils.isEmpty(str3)) {
                            str3 = C66785b.f191882e.mo90662O5();
                        } else {
                            C87412m.m108591d(str3);
                        }
                        aVar4.mo13980a(17, str3, linkedList2);
                    }
                }
            }
        }
        C11385n nVar = this.f125411i;
        if (nVar != null) {
            nVar.onSceneEnd(i4, i5, str2, this);
        }
    }

    /* renamed from: l1 */
    public List<FinderItem> mo10031l1(C114799u uVar) {
        C47465a aVar = this.f125410h.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMVUserPageResponse");
        LinkedList<FinderObject> linkedList = ((C50807pb1) aVar).f139687d;
        C87412m.m108593f(linkedList, "commReqResp.responseProt…serPageResponse).`object`");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject b : linkedList) {
            arrayList.add(FinderItem.C56324a.m64570b(FinderItem.Companion, b, 0, 2, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: m1 */
    public long mo10032m1() {
        C47465a aVar = this.f125410h.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMVUserPageRequest");
        C49842ig0 ig02 = ((C50657ob1) aVar).f139077d;
        if (ig02 != null) {
            return ig02.f135317i;
        }
        return 0;
    }
}
