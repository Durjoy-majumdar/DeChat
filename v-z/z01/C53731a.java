package z01;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import eb0.C45613m2;
import f40.C86709a0;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import k40.C9562a;
import lc3.C10485b;
import p749xh.C53335e1;
import zh3.C91753f;

/* renamed from: z01.a */
public class C53731a implements C39479c, C9562a {

    /* renamed from: d */
    public volatile C44662n1 f150846d;

    /* renamed from: e */
    public boolean f150847e;

    /* renamed from: f */
    public HashMap<String, Boolean> f150848f = new HashMap<>();

    /* renamed from: g */
    public HashMap<String, Boolean> f150849g = new HashMap<>();

    /* renamed from: Ct */
    public boolean mo62082Ct(String str) {
        SingleTable singleTable = C53335e1.f149283M;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        linkedList.add(C53335e1.f149294U);
        C53335e1 e1Var = (C53335e1) C53335e1.f149283M.select((List<? extends ISqlColumn>) linkedList).where(C53335e1.f149285P.equal(str)).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().singleQuery(C53335e1.f149324r1.getDB(), C53335e1.class);
        return ((e1Var != null ? e1Var.field_spamStatus : 0) & 1) == 1;
    }

    public C45613m2 Df0(C91753f fVar) {
        return new C44662n1(fVar);
    }

    /* renamed from: a */
    public C44662n1 mo62084mr() {
        if (this.f150846d == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (this.f150846d == null) {
                    this.f150846d = new C44662n1(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f150846d;
    }

    /* renamed from: n0 */
    public void mo62085n0(boolean z) {
        this.f150847e = z;
    }

    /* renamed from: r1 */
    public boolean mo62086r1(String str) {
        try {
            if (this.f150849g.containsKey(str)) {
                return this.f150849g.get(str).booleanValue();
            }
            boolean z = (((long) mo62084mr().mo69799Lo(str).field_chatroomStatus) & 2) == 2;
            if (z) {
                this.f150849g.put(str, Boolean.valueOf(z));
            }
            return z;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChatroomService", e, "[isEnableRoomManager]", new Object[0]);
            return false;
        }
    }

    /* renamed from: yu */
    public boolean mo62087yu(String str) {
        Class cls = C10485b.class;
        if (this.f150847e) {
            return false;
        }
        try {
            if (this.f150848f.containsKey(str)) {
                return this.f150848f.get(str).booleanValue();
            }
            C44661m1 Lo = mo62084mr().mo69799Lo(str);
            boolean z = true;
            boolean z2 = (((long) Lo.field_chatroomStatus) & 16384) != 0;
            int b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("ChatRoomAdminSwitch", -1);
            int b2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("ChatRoomAdminMinMemberCount", -1);
            Log.m105925i("MicroMsg.ChatroomService", "[isEnableRoomManager] chatroomName:%s isStatusEnable:%s switchFlag:%s minCount:%d memberCount:%d", str, Boolean.valueOf(z2), Integer.valueOf(b), Integer.valueOf(b2), Integer.valueOf(Lo.mo69790r2().size()));
            if (b > 0) {
                if (!z2) {
                    if (b2 <= Lo.mo69790r2().size()) {
                    }
                }
                this.f150848f.put(str, Boolean.valueOf(z));
                return z;
            }
            z = false;
            this.f150848f.put(str, Boolean.valueOf(z));
            return z;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ChatroomService", e, "[isEnableRoomManager]", new Object[0]);
            return false;
        }
    }
}
