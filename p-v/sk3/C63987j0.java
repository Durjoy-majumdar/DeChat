package sk3;

import android.content.DialogInterface;
import android.os.Bundle;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.chatting.C73871v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Set;
import lv1.C99672i;
import lv1.C99681n;
import nk3.C61795a;
import nk3.C61796b;
import nk3.C61797d;
import nk3.C61802h;
import ok3.C62070e;
import ok3.C62072g;
import rk3.C63462a;
import s90.C77632o;

/* renamed from: sk3.j0 */
public final class C63987j0 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63994l0 f181404d;

    /* renamed from: e */
    public final /* synthetic */ Set<Long> f181405e;

    /* renamed from: f */
    public final /* synthetic */ C72963f4 f181406f;

    /* renamed from: sk3.j0$a */
    public static final class C63988a implements C77632o {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f181407d;

        /* renamed from: e */
        public final /* synthetic */ C63994l0 f181408e;

        /* renamed from: sk3.j0$a$a */
        public static final class C63989a extends C62070e {
        }

        public C63988a(C72963f4 f4Var, C63994l0 l0Var) {
            this.f181407d = f4Var;
            this.f181408e = l0Var;
        }

        /* renamed from: N */
        public boolean mo22497N() {
            return false;
        }

        /* renamed from: e0 */
        public boolean mo22498e0() {
            return false;
        }

        /* renamed from: g0 */
        public void mo22499g0(Bundle bundle) {
            C87412m.m108594g(bundle, "bundle");
        }

        /* renamed from: m6 */
        public void mo22500m6(C77632o.C77633a aVar) {
            C87412m.m108594g(aVar, "job");
        }

        /* renamed from: r7 */
        public void mo22502r7(C77632o.C77633a aVar) {
            C61802h d3;
            C87412m.m108594g(aVar, "job");
            Log.m105925i(this.f181408e.f181415d, "[requestExitSelectedMode] %s del ", Thread.currentThread(), aVar);
            if (aVar == C77632o.C77633a.del && (d3 = this.f181408e.mo88750d3()) != null) {
                d3.notifyDataSetChanged();
            }
        }

        /* renamed from: s0 */
        public boolean mo22503s0() {
            return true;
        }

        /* renamed from: z1 */
        public void mo22504z1(C77632o.C77633a aVar) {
            C77632o.C77633a aVar2 = aVar;
            C87412m.m108594g(aVar2, "job");
            if (aVar2 == C77632o.C77633a.del) {
                C63989a aVar3 = new C63989a();
                aVar3.f176459d = this.f181407d.getMsgId();
                this.f181408e.f181421j.remove(aVar3);
                C64024v vVar = (C64024v) C39818r.f106831a.mo62444c(this.f181408e.getActivity()).mo75002a(C64024v.class);
                C62072g gVar = r2;
                C62072g gVar2 = new C62072g((C61795a) null, (C61796b) null, (String) null, (String) null, (CharSequence) null, (CharSequence) null, (String) null, (String) null, this.f181407d.getMsgId(), (C99681n) null, (C99672i) null, 0, 3839, (C8480h) null);
                vVar.getClass();
                C62072g gVar3 = gVar;
                vVar.f181521n.remove(gVar3);
                vVar.f181520j.remove(gVar3);
                C61797d dVar = vVar.f181524q;
                if (dVar != null) {
                    ArrayList<C62072g> arrayList = vVar.f181521n;
                    C87412m.m108594g(arrayList, "<set-?>");
                    dVar.f175706f = arrayList;
                }
                C61797d dVar2 = vVar.f181524q;
                if (dVar2 != null) {
                    dVar2.notifyDataSetChanged();
                }
            }
        }
    }

    public C63987j0(C63994l0 l0Var, Set<Long> set, C72963f4 f4Var) {
        this.f181404d = l0Var;
        this.f181405e = set;
        this.f181406f = f4Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i(this.f181404d.f181415d, "delete message");
        C63462a.f180011a.mo88328b(19);
        C73871v0.m87560a(this.f181404d.getActivity(), this.f181405e, new C63988a(this.f181406f, this.f181404d));
    }
}
