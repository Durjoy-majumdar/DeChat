package dj1;

import cj1.C54730a;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import er1.C58739j4;
import fe1.C58961d;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C46523h2;
import jm2.C117361f;
import kt1.C46744d;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import ok1.C62042e;
import org.json.JSONObject;
import p823sg.C90193h;
import pe3.C89349b;
import sk1.C63947a;
import sx3.C36907w;
import tc2.C118418g;
import te3.C49291ej0;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49842ig0;
import te3.C49966ja;
import te3.C51018qv3;
import te3.C51020qw0;
import te3.C51163rv3;
import te3.C51745vv0;
import te3.C51946xa1;
import te3.C64314dj0;
import te3.C64436i61;
import te3.C64756up2;
import te3.C64848y91;
import te3.b65;
import te3.lx4;
import z04.C119027c;

/* renamed from: dj1.i */
public final class C58280i extends C58286q<C49291ej0> {

    /* renamed from: t */
    public final C51020qw0 f166881t;

    /* renamed from: u */
    public final boolean f166882u;

    /* renamed from: v */
    public final String f166883v;

    /* renamed from: w */
    public C58281a f166884w;

    /* renamed from: x */
    public C64314dj0 f166885x;

    /* renamed from: y */
    public final JSONObject f166886y;

    /* renamed from: z */
    public final JSONObject f166887z;

    /* renamed from: dj1.i$a */
    public interface C58281a {
        /* renamed from: a */
        void mo75785a(int i, int i2, String str, C49291ej0 ej02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58280i(String str, FinderObjectDesc finderObjectDesc, C89349b bVar, C64848y91 y912, int i, int i2, LinkedList linkedList, LinkedList linkedList2, LinkedList linkedList3, LinkedList linkedList4, String str2, String str3, int i3, b65 b65, C51020qw0 qw02, boolean z, byte[] bArr, int i4, C49712hj1 hj12, C64756up2 up22, C58281a aVar, int i5, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        byte[] bArr2;
        C64848y91 y913;
        LinkedList<C51745vv0> linkedList5;
        String str4 = str;
        LinkedList linkedList6 = linkedList;
        LinkedList linkedList7 = linkedList2;
        LinkedList linkedList8 = linkedList3;
        LinkedList linkedList9 = linkedList4;
        C58281a aVar2 = aVar;
        int i6 = i5;
        C89349b bVar2 = (i6 & 4) != 0 ? null : bVar;
        int i7 = (i6 & 32) != 0 ? 0 : i2;
        b65 b652 = (i6 & 8192) != 0 ? null : b65;
        C51020qw0 qw03 = (i6 & 16384) != 0 ? null : qw02;
        boolean z2 = (32768 & i6) != 0 ? false : z;
        byte[] bArr3 = (65536 & i6) != 0 ? null : bArr;
        C49712hj1 hj13 = (i6 & 262144) != 0 ? null : hj12;
        C87412m.m108594g(linkedList6, "visibilityList");
        C87412m.m108594g(linkedList7, "visibilityRoomList");
        C87412m.m108594g(linkedList8, "visibilityUserList");
        C87412m.m108594g(linkedList9, "luckyMoneyChatroomList");
        C87412m.m108594g(aVar2, "callback");
        this.f166881t = qw03;
        this.f166882u = z2;
        this.f166883v = "Finder.CgiFinderCreateLive";
        this.f166884w = aVar2;
        this.f166885x = new C64314dj0();
        this.f166886y = new JSONObject();
        this.f166887z = new JSONObject();
        this.f166885x.f182722d = C46523h2.f125330a.mo71860b(3686, hj13);
        this.f166885x.f182719K = C58739j4.m68251e(C58739j4.f168176a, (C64436i61) null, (LinkedList) null, 3, (Object) null);
        C64314dj0 dj02 = this.f166885x;
        dj02.f182724f = finderObjectDesc;
        dj02.f182729n = bVar2;
        StringBuilder sb = new StringBuilder();
        if (str4 != null) {
            bArr2 = str4.getBytes(C119027c.f356488a);
            C87412m.m108593f(bArr2, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr2 = null;
        }
        sb.append(C90193h.m112878f(bArr2));
        sb.append('_');
        int i8 = i7;
        sb.append(System.currentTimeMillis());
        dj02.f182725g = sb.toString();
        C64314dj0 dj03 = this.f166885x;
        dj03.f182723e = str4;
        dj03.f182731p = y912;
        if (!C62042e.f176370a.mo87054X0(1)) {
            C64314dj0 dj04 = this.f166885x;
            dj04.f182721M = i8;
            dj04.f182732q = i;
            dj04.f182733r = linkedList6;
            dj04.f182735t = linkedList7;
            dj04.f182736u = linkedList8;
        }
        C64314dj0 dj05 = this.f166885x;
        dj05.f182734s = linkedList9;
        dj05.f182717I = str2;
        dj05.f182737v = str3;
        dj05.f182728j = i3;
        dj05.f182711C = b652;
        dj05.f182715G = z2 ? 1 : 0;
        dj05.f182714F = bArr3 != null ? new C89349b(bArr3, 0, bArr3.length) : null;
        C64314dj0 dj06 = this.f166885x;
        dj06.f182718J = i4;
        if (qw03 != null) {
            int i9 = qw03.f140580d;
            if (i9 == 2 || i9 == 8 || i9 == 16) {
                dj06.f182738w = i9;
                dj06.f182739x = qw03.f140581e;
                C51946xa1 xa12 = qw03.f140582f;
                dj06.f182741z = xa12 != null ? xa12.f144557d : null;
                dj06.f182709A = xa12 != null ? xa12.f144558e : null;
                if (!(xa12 == null || (linkedList5 = xa12.f144560g) == null)) {
                    ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList5, 10));
                    for (C51745vv0 vv02 : linkedList5) {
                        arrayList.add(vv02.f143709d);
                    }
                    dj06.f182713E = new LinkedList<>(arrayList);
                }
                C64314dj0 dj07 = this.f166885x;
                dj07.f182732q = 0;
                dj07.f182720L = this.f166881t.f140583g;
            }
        }
        try {
            this.f166887z.put("username", str4);
            this.f166887z.put(ClientInfoTable.Columns.CLIENTID, this.f166885x.f182725g);
            JSONObject jSONObject = this.f166887z;
            C64848y91 y914 = this.f166885x.f182731p;
            jSONObject.put("tagId", y914 != null ? Integer.valueOf(y914.f186453d) : null);
            JSONObject jSONObject2 = this.f166887z;
            C64848y91 y915 = this.f166885x.f182731p;
            jSONObject2.put("tagName", y915 != null ? y915.f186454e : null);
            this.f166887z.put("visibilityMode", this.f166885x.f182732q);
            this.f166887z.put("beautyData", C54730a.C54731a.f153381a.mo75621a());
        } catch (Exception e) {
            Log.m105920e(this.f166883v, e.toString());
        }
        lx4 lx4 = new lx4();
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(C118418g.INSTANCE.mo175821hd());
        lx4.f354117f = qv32;
        C49842ig0 ig02 = this.f166885x.f182722d;
        if (ig02 != null) {
            ig02.f135314f = new C89349b(lx4.toByteArray());
        }
        C117361f.INSTANCE.mo182041q(540999692);
        C64314dj0 dj08 = this.f166885x;
        dj08.f182716H = up22;
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127066a = dj08;
        C49291ej0 ej02 = new C49291ej0();
        ej02.setBaseResponse(new C49966ja());
        ej02.getBaseResponse().f135956e = new C51163rv3();
        bVar3.f127067b = ej02;
        bVar3.f127068c = "/cgi-bin/micromsg-bin/findercreatelive";
        bVar3.f127069d = 3686;
        mo123453j(bVar3.mo72403a());
        String str5 = this.f166883v;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("CgiFinderCreateLive init ");
        sb4.append(this.f166885x.f182725g);
        sb4.append(',');
        sb4.append(this.f166885x.f182723e);
        sb4.append(", liveEntranceType:");
        sb4.append(this.f166885x.f182718J);
        sb4.append(", ");
        sb4.append(this.f166885x.f182724f);
        sb4.append(", tag:[");
        C64848y91 y916 = this.f166885x.f182731p;
        sb4.append(y916 != null ? y916.f186454e : null);
        sb4.append('-');
        C64848y91 y917 = this.f166885x.f182731p;
        sb4.append((y917 == null || (y913 = y917.f186456g) == null) ? null : y913.f186454e);
        sb4.append("], visibility_mode:");
        sb4.append(this.f166885x.f182732q);
        sb4.append(", visible_username_list:");
        sb4.append(this.f166885x.f182736u);
        sb4.append(", visibility_file_id_list:");
        sb4.append(this.f166885x.f182733r);
        sb4.append(", visible_chatroom_id_list:");
        sb4.append(this.f166885x.f182735t);
        sb4.append(", luckyMoneyChatroom:");
        sb4.append(this.f166885x.f182734s);
        sb4.append(", gameAppId:");
        sb4.append(this.f166885x.f182737v);
        sb4.append(", gameVersionType:");
        b65 b653 = this.f166885x.f182711C;
        sb4.append(b653 != null ? Integer.valueOf(b653.f182225d) : null);
        sb4.append(", scene:");
        sb4.append(this.f166885x.f182728j);
        sb4.append(",liveChargePost:[");
        sb4.append(C63947a.f181274a.mo88724j(this.f166881t));
        sb4.append("], acknowledgeSpamMsg:");
        sb4.append(this.f166882u);
        Log.m105924i(str5, sb4.toString());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f166887z;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f166886y;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        FinderContact finderContact;
        C49291ej0 ej02 = (C49291ej0) eu32;
        C87412m.m108594g(ej02, "resp");
        String str2 = this.f166883v;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            String str3 = this.f166883v;
            Log.m105924i(str3, "CgiFinderCreateLive result:" + C61937h.m72709h(ej02));
            FinderObject finderObject = ej02.f132950d;
            if (!(finderObject == null || (finderContact = finderObject.contact) == null)) {
                C58961d.C58963b.m68837m(C58961d.f168673a, finderContact, false, 2, (Object) null);
            }
        }
        this.f166884w.mo75785a(i, i2, str, ej02);
    }
}
