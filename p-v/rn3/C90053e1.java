package rn3;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.transmit.C85970n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import te3.k55;
import te3.w45;

/* renamed from: rn3.e1 */
public final class C90053e1 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<String> f258698d;

    /* renamed from: e */
    public final /* synthetic */ C44561j f258699e;

    /* renamed from: f */
    public final /* synthetic */ boolean f258700f;

    /* renamed from: g */
    public final /* synthetic */ boolean f258701g;

    /* renamed from: h */
    public final /* synthetic */ WXMediaMessage f258702h;

    /* renamed from: i */
    public final /* synthetic */ int f258703i;

    /* renamed from: j */
    public final /* synthetic */ String f258704j;

    /* renamed from: n */
    public final /* synthetic */ C85970n.C85973b f258705n;

    public C90053e1(LinkedList<String> linkedList, C44561j jVar, boolean z, boolean z2, WXMediaMessage wXMediaMessage, int i, String str, C85970n.C85973b bVar) {
        this.f258698d = linkedList;
        this.f258699e = jVar;
        this.f258700f = z;
        this.f258701g = z2;
        this.f258702h = wXMediaMessage;
        this.f258703i = i;
        this.f258704j = str;
        this.f258705n = bVar;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        LinkedList<k55> linkedList;
        Log.m105925i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg getShareInfo callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C47465a aVar = cVar.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaAppGetShareInfoResponse");
        w45 w45 = (w45) aVar;
        if (i == 0 && i2 == 0 && (linkedList = w45.f143857d) != null) {
            Log.m105925i("MicroMsg.SendWXMediaMessageHelper", "sendSecretAppMsg getShareInfo size = %d, toUserList size = %d", Integer.valueOf(linkedList.size()), Integer.valueOf(this.f258698d.size()));
            int size = this.f258698d.size();
            int i3 = 0;
            while (i3 < size) {
                k55 k55 = i3 < linkedList.size() ? linkedList.get(i3) : new k55();
                C68070l.C68072b bVar = new C68070l.C68072b();
                String str2 = this.f258699e.field_appId;
                C87412m.m108593f(str2, "app.field_appId");
                if (!this.f258700f && this.f258701g) {
                    str2 = "";
                }
                bVar.f195562d = str2;
                bVar.f195484F = this.f258699e.field_appName;
                bVar.f195618r = 2;
                C85970n nVar = C85970n.f250401a;
                C85970n.m106292a(nVar, bVar, k55);
                C72695v.m85084z(bVar, this.f258702h, this.f258698d.get(i3), (String) null, this.f258703i, C85970n.m106294i(nVar, this.f258700f, this.f258704j, (String) null, this.f258705n, 4, (Object) null));
                i3++;
            }
            return 0;
        }
        Iterator<String> it = this.f258698d.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String str3 = this.f258699e.field_appId;
            C87412m.m108593f(str3, "app.field_appId");
            if (!this.f258700f && this.f258701g) {
                str3 = "";
            }
            C68070l.C68072b bVar2 = new C68070l.C68072b();
            bVar2.f195562d = str3;
            bVar2.f195484F = this.f258699e.field_appName;
            bVar2.f195618r = 2;
            C85970n nVar2 = C85970n.f250401a;
            C85970n.m106292a(nVar2, bVar2, (k55) null);
            C72695v.m85084z(bVar2, this.f258702h, next, (String) null, this.f258703i, C85970n.m106294i(nVar2, this.f258700f, this.f258704j, (String) null, this.f258705n, 4, (Object) null));
        }
        return 0;
    }
}
