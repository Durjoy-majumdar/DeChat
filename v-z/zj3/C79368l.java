package zj3;

import android.util.SparseArray;
import android.view.View;
import cj3.C67383b;
import com.tencent.p014mm.p136ui.C45094u2;
import com.tencent.p014mm.p136ui.chatting.C44851e0;
import com.tencent.p014mm.p136ui.chatting.C6784h2;
import com.tencent.p014mm.p136ui.chatting.C73688g2;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72841x1;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C57547m0;
import com.tencent.p014mm.storage.C72963f4;
import hc0.C20937c;
import hk3.C76227e;
import java.util.Set;
import mh0.C99865e0;
import p270xi.C53356d;
import p682rz.C101489t;
import p872ah.C67046a;
import wk3.C78606a;

/* renamed from: zj3.l */
public interface C79368l extends C53356d, C67046a, C67383b.C67386b, C57547m0 {
    /* renamed from: A1 */
    C72841x1 mo108165A1();

    /* renamed from: A2 */
    int mo108166A2(C72963f4 f4Var);

    /* renamed from: B4 */
    void mo108167B4();

    /* renamed from: D2 */
    C44851e0 mo108168D2();

    /* renamed from: D4 */
    void mo108169D4(Runnable runnable);

    /* renamed from: D5 */
    void mo108170D5(int i, int i2);

    /* renamed from: E0 */
    void mo108171E0();

    /* renamed from: E5 */
    void mo108172E5(int i, C76227e.C76228a aVar);

    /* renamed from: G */
    void mo108173G(long j, boolean z);

    /* renamed from: G1 */
    void mo108174G1();

    /* renamed from: K1 */
    SparseArray<C72963f4> mo108175K1();

    /* renamed from: L */
    void mo108176L(boolean z);

    /* renamed from: L4 */
    long mo108177L4();

    /* renamed from: L5 */
    void mo108178L5(C78606a aVar);

    /* renamed from: M2 */
    void mo108179M2();

    /* renamed from: M3 */
    void mo108180M3(int i, int i2);

    /* renamed from: M5 */
    int mo108181M5();

    /* renamed from: N0 */
    boolean mo108183N0(long j);

    /* renamed from: T1 */
    void mo108184T1(long j, int i, int i2);

    /* renamed from: T3 */
    void mo108185T3(int i);

    /* renamed from: V */
    void mo108186V(long j, C72963f4 f4Var, boolean z);

    /* renamed from: V4 */
    void mo108187V4();

    /* renamed from: Z4 */
    C6784h2 mo108189Z4();

    /* renamed from: b0 */
    boolean mo108190b0(C72963f4 f4Var);

    /* renamed from: d1 */
    void mo108191d1(boolean z);

    /* renamed from: d2 */
    void mo108192d2();

    /* renamed from: e5 */
    void mo108193e5(C72963f4 f4Var);

    /* renamed from: f4 */
    C101489t.C77595a mo108194f4();

    void finish();

    int getCount();

    C73688g2 getDoubleClickListener();

    C72963f4 getItem(int i);

    /* renamed from: i0 */
    void mo108201i0(int i);

    /* renamed from: j */
    C20937c mo108202j();

    /* renamed from: m5 */
    C99865e0.C99869e mo108203m5();

    /* renamed from: p */
    int mo108205p();

    /* renamed from: p3 */
    Set<Long> mo108206p3();

    /* renamed from: p4 */
    void mo108207p4(C76227e.C76228a aVar);

    void pause();

    void resume();

    /* renamed from: s2 */
    C45094u2 mo108210s2();

    /* renamed from: t5 */
    void mo108211t5(View.OnClickListener onClickListener);

    /* renamed from: v */
    View mo108212v(long j);

    /* renamed from: v1 */
    boolean mo108213v1();

    /* renamed from: y2 */
    void mo108214y2(long j, boolean z, boolean z2, boolean z3, int i, boolean z4, C76227e.C76228a aVar);
}
