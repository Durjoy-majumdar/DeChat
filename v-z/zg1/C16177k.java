package zg1;

import cj1.C54843w3;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58052j1;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C50179ku0;
import te3.C52013xs0;
import yg1.C16006g;

/* renamed from: zg1.k */
public final class C16177k extends C16006g {

    /* renamed from: c */
    public final String f43365c = "LiveSingSongMsgInterceptor";

    /* renamed from: d */
    public String f43366d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16177k(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        Class cls = C54991o.class;
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        C50179ku0 ku02 = new C50179ku0();
        String str = null;
        if (xs02 != null) {
            C52013xs0 xs03 = xs02.f144906h != null ? xs02 : null;
            if (xs03 != null) {
                C89349b bVar = xs03.f144906h;
                ku02.parseFrom(bVar != null ? bVar.mo123703f() : null);
            }
        }
        String str2 = this.f43365c;
        StringBuilder sb = new StringBuilder();
        sb.append("from msg syncRoomManagaerInfo modType: ");
        sb.append(ku02.f137040d);
        sb.append(", msgId: ");
        sb.append(xs02 != null ? xs02.f144904f : null);
        Log.m105924i(str2, sb.toString());
        String str3 = this.f43366d;
        if (str3 != null) {
            if (C87412m.m108589b(str3, xs02 != null ? xs02.f144904f : null)) {
                return;
            }
        }
        if (ku02.f137040d == 2) {
            C54843w3.f153747a.mo75789d(this.f43066a, 2, false);
            ((C58052j1) ((C54991o) this.f43066a.mo71262a(cls)).f154194E).setValue(Boolean.FALSE);
        } else {
            C54843w3.f153747a.mo75789d(this.f43066a, 1, true);
            ((C58052j1) ((C54991o) this.f43066a.mo71262a(cls)).f154194E).setValue(Boolean.TRUE);
        }
        if (xs02 != null) {
            str = xs02.f144904f;
        }
        this.f43366d = str;
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20069};
    }
}
