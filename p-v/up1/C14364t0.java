package up1;

import android.content.Context;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ob0.C117747y;
import pe3.C89349b;
import sf0.C48372d;

/* renamed from: up1.t0 */
public interface C14364t0 {

    /* renamed from: up1.t0$a */
    public static final class C14365a {
        /* renamed from: a */
        public static /* synthetic */ C117747y m13678a(C14364t0 t0Var, C89349b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    bVar = null;
                }
                return t0Var.mo13649k(bVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNetScene");
        }
    }

    /* renamed from: up1.t0$b */
    public interface C14366b {
        /* renamed from: a */
        void mo3725a(boolean z);
    }

    /* renamed from: a */
    C117747y mo13639a(List<String> list);

    /* renamed from: b */
    boolean mo13640b();

    /* renamed from: c */
    CharSequence mo13641c(Context context, boolean z);

    /* renamed from: d */
    CharSequence mo13642d(Context context);

    /* renamed from: e */
    C48372d<FinderContact> mo13643e();

    /* renamed from: f */
    CharSequence mo13644f();

    /* renamed from: g */
    CharSequence mo13645g(Context context);

    /* renamed from: h */
    CharSequence mo13646h();

    /* renamed from: i */
    boolean mo13647i();

    /* renamed from: j */
    Set<C117747y> mo13648j(List<? extends FinderContact> list, C14366b bVar);

    /* renamed from: k */
    C117747y mo13649k(C89349b bVar);

    /* renamed from: l */
    LinkedList<FinderContact> mo13650l();

    /* renamed from: m */
    C117747y mo13651m(FinderContact finderContact, C14366b bVar);

    /* renamed from: n */
    LinkedList<FinderContact> mo13652n(C117747y yVar);

    /* renamed from: o */
    C89349b mo13653o(C117747y yVar);

    /* renamed from: p */
    void mo13654p(Context context);

    /* renamed from: q */
    CharSequence mo13655q();
}
