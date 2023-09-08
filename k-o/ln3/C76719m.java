package ln3;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72958d5;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import rx3.C13604l;
import sx3.C90363p0;
import sx3.C90364q0;

/* renamed from: ln3.m */
public final class C76719m extends C76709a<C76719m> {

    /* renamed from: w */
    public static final C34316a f224451w = new C34316a((C8480h) null);

    /* renamed from: u */
    public final C72958d5 f224452u;

    /* renamed from: v */
    public final C72963f4 f224453v;

    /* renamed from: ln3.m$a */
    public static final class C34316a {
        public C34316a(C8480h hVar) {
        }

        /* renamed from: a */
        public final Map<String, Object> mo59556a(C72963f4 f4Var) {
            C68070l.C68072b u;
            C87412m.m108594g(f4Var, "msgInfo");
            boolean z = (f4Var.getMsgId() == 0 || f4Var.getType() == 268445456) ? false : true;
            long y2 = f4Var.mo108774y2();
            int type = f4Var.getType();
            int i = (!f4Var.mo101020w3() || (u = C68070l.C68072b.m80422u(Util.processXml(f4Var.getContent()), (String) null)) == null) ? 0 : u.f195582i;
            C13604l[] lVarArr = new C13604l[4];
            lVarArr[0] = new C13604l("group_is_bar_destination_reachable", Integer.valueOf(z ? 1 : 2));
            lVarArr[1] = new C13604l("group_msg_id", Long.valueOf(y2));
            lVarArr[2] = new C13604l("group_sub_msg_type", Integer.valueOf(i));
            lVarArr[3] = new C13604l("group_msg_type", Integer.valueOf(type));
            return C90364q0.m113147f(lVarArr);
        }
    }

    public C76719m(C72958d5 d5Var, C72963f4 f4Var) {
        C87412m.m108594g(d5Var, "record");
        C87412m.m108594g(f4Var, "msgInfo");
        this.f224452u = d5Var;
        this.f224453v = f4Var;
    }

    /* renamed from: a */
    public Map<String, Object> mo86283a() {
        return C90364q0.m113149h(C90363p0.m113143b(new C13604l("group_msg_top_item_id", Integer.valueOf(this.f224452u.getId()))), f224451w.mo59556a(this.f224453v));
    }

    /* renamed from: c */
    public int mo75c() {
        return C76709a.f224426i;
    }

    /* renamed from: d */
    public int mo86281d() {
        return 8;
    }

    /* renamed from: f */
    public boolean mo106998f(C76709a aVar) {
        C76719m mVar = (C76719m) aVar;
        C87412m.m108594g(mVar, "other");
        return this.f224452u.getId() == mVar.f224452u.getId() && C87412m.m108589b(this.f224452u.mo108714l2(), mVar.f224452u.mo108714l2());
    }

    /* renamed from: g */
    public int mo86282g(Object obj) {
        C76719m mVar = (C76719m) obj;
        C87412m.m108594g(mVar, "other");
        return this.f224452u.getId() - mVar.f224452u.getId();
    }

    public long getItemId() {
        return (long) this.f224452u.getId();
    }
}
