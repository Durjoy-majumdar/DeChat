package rn3;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.p014mm.p136ui.transmit.C85970n;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
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

/* renamed from: rn3.b1 */
public final class C90050b1 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<String> f258664d;

    /* renamed from: e */
    public final /* synthetic */ C44561j f258665e;

    /* renamed from: f */
    public final /* synthetic */ boolean f258666f;

    /* renamed from: g */
    public final /* synthetic */ boolean f258667g;

    /* renamed from: h */
    public final /* synthetic */ WxaAttributes f258668h;

    /* renamed from: i */
    public final /* synthetic */ WXMiniProgramObject f258669i;

    /* renamed from: j */
    public final /* synthetic */ String f258670j;

    /* renamed from: n */
    public final /* synthetic */ int f258671n;

    /* renamed from: o */
    public final /* synthetic */ WXMediaMessage f258672o;

    /* renamed from: p */
    public final /* synthetic */ C85970n.C85973b f258673p;

    /* renamed from: q */
    public final /* synthetic */ int f258674q;

    /* renamed from: r */
    public final /* synthetic */ String f258675r;

    public C90050b1(LinkedList<String> linkedList, C44561j jVar, boolean z, boolean z2, WxaAttributes wxaAttributes, WXMiniProgramObject wXMiniProgramObject, String str, int i, WXMediaMessage wXMediaMessage, C85970n.C85973b bVar, int i2, String str2) {
        this.f258664d = linkedList;
        this.f258665e = jVar;
        this.f258666f = z;
        this.f258667g = z2;
        this.f258668h = wxaAttributes;
        this.f258669i = wXMiniProgramObject;
        this.f258670j = str;
        this.f258671n = i;
        this.f258672o = wXMediaMessage;
        this.f258673p = bVar;
        this.f258674q = i2;
        this.f258675r = str2;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        LinkedList<k55> linkedList;
        Log.m105925i("MicroMsg.SendWXMediaMessageHelper", "callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C47465a aVar = cVar.f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaAppGetShareInfoResponse");
        w45 w45 = (w45) aVar;
        if (i == 0 && i2 == 0 && (linkedList = w45.f143857d) != null) {
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            Log.m105925i("MicroMsg.SendWXMediaMessageHelper", "get wxaAppShareInfoList size = %d, toUserList size = %d", Integer.valueOf(linkedList.size()), Integer.valueOf(this.f258664d.size()));
            int size = this.f258664d.size();
            int i3 = 0;
            while (i3 < size) {
                k55 k55 = i3 < linkedList.size() ? linkedList.get(i3) : new k55();
                C68070l.C68072b bVar = new C68070l.C68072b();
                String str2 = this.f258665e.field_appId;
                C87412m.m108593f(str2, "app.field_appId");
                if (!this.f258666f && this.f258667g) {
                    str2 = "";
                }
                bVar.f195562d = str2;
                WxaAttributes wxaAttributes = this.f258668h;
                bVar.f195577g2 = wxaAttributes.field_appId;
                bVar.f195634v = wxaAttributes.field_username;
                bVar.f195638w = wxaAttributes.field_nickname;
                WXMiniProgramObject wXMiniProgramObject = this.f258669i;
                bVar.f195653z2 = wXMiniProgramObject.miniprogramType;
                bVar.f195484F = this.f258665e.field_appName;
                bVar.f195618r = 2;
                bVar.f195593k2 = k55.f136570e;
                bVar.f195589j2 = this.f258670j;
                bVar.f195581h2 = wXMiniProgramObject.withShareTicket ? 3 : 2;
                bVar.f195617q2 = this.f258671n;
                C85970n nVar = C85970n.f250401a;
                nVar.mo119885f(bVar, this.f258672o);
                nVar.mo119882b(this.f258668h, bVar, k55, this.f258673p);
                if (this.f258671n != 0) {
                    bVar.f195605n2 = 1;
                }
                C72695v.m85084z(bVar, this.f258672o, this.f258664d.get(i3), (String) null, this.f258674q, C85970n.m106294i(nVar, this.f258666f, this.f258675r, (String) null, this.f258673p, 4, (Object) null));
                i3++;
            }
            return 0;
        }
        Iterator<String> it = this.f258664d.iterator();
        while (it.hasNext()) {
            String next = it.next();
            String str3 = this.f258665e.field_appId;
            C87412m.m108593f(str3, "app.field_appId");
            if (!this.f258666f && this.f258667g) {
                str3 = "";
            }
            C68070l.C68072b bVar2 = new C68070l.C68072b();
            bVar2.f195562d = str3;
            WxaAttributes wxaAttributes2 = this.f258668h;
            bVar2.f195577g2 = wxaAttributes2.field_appId;
            bVar2.f195634v = wxaAttributes2.field_username;
            bVar2.f195638w = wxaAttributes2.field_nickname;
            WXMiniProgramObject wXMiniProgramObject2 = this.f258669i;
            bVar2.f195653z2 = wXMiniProgramObject2.miniprogramType;
            bVar2.f195484F = this.f258665e.field_appName;
            bVar2.f195618r = 2;
            bVar2.f195589j2 = this.f258670j;
            bVar2.f195581h2 = wXMiniProgramObject2.withShareTicket ? 3 : 2;
            bVar2.f195617q2 = this.f258671n;
            C85970n nVar2 = C85970n.f250401a;
            nVar2.mo119885f(bVar2, this.f258672o);
            nVar2.mo119882b(this.f258668h, bVar2, (k55) null, this.f258673p);
            if (this.f258671n != 0) {
                bVar2.f195605n2 = 1;
            }
            C72695v.m85084z(bVar2, this.f258672o, next, (String) null, this.f258674q, C85970n.m106294i(nVar2, this.f258666f, this.f258675r, (String) null, this.f258673p, 4, (Object) null));
        }
        return 0;
    }
}
