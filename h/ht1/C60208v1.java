package ht1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.storage.C72996z1;
import di3.C7335d;
import java.util.List;
import te3.C64284cg;

/* renamed from: ht1.v1 */
public interface C60208v1 extends C7335d {

    /* renamed from: ht1.v1$a */
    public interface C60209a {
        /* renamed from: a */
        void mo78737a(C60187m5 m5Var);
    }

    /* renamed from: ht1.v1$b */
    public interface C60210b {
        void onDone(List<C60187m5> list);
    }

    void Aw0(String str, C60209a aVar, int i);

    void Do0(C60187m5 m5Var);

    /* renamed from: Ff */
    C60187m5 mo78700Ff(String str);

    /* renamed from: G6 */
    void mo78701G6(String str, long j, long j2, long j3, C60209a aVar);

    void He0(String str, String str2, C60209a aVar);

    /* renamed from: Kv */
    void mo78703Kv(String str, String str2, C60209a aVar);

    /* renamed from: O1 */
    boolean mo78704O1(String str);

    C64284cg O40(C60187m5 m5Var);

    /* renamed from: TU */
    void mo78706TU();

    /* renamed from: VB */
    void mo78707VB(String str, Boolean bool);

    /* renamed from: Wd */
    void mo78708Wd(String str, C60209a aVar);

    /* renamed from: aq */
    C60187m5 mo78709aq(String str);

    /* renamed from: cT */
    void mo78710cT(String str, Long l, Long l2, C60209a aVar);

    /* renamed from: g */
    void mo78711g(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: i */
    void mo78712i(MStorage.IOnStorageChange iOnStorageChange);

    /* renamed from: iR */
    String mo78713iR();

    void lf0(String str, C60209a aVar, long j, String str2, long j2);

    /* renamed from: m8 */
    void mo78715m8(String str, String str2, C60209a aVar);

    /* renamed from: qg */
    C60187m5 mo78716qg(String str);

    /* renamed from: rl */
    void mo78717rl(String str, int i, Long l, boolean z, int i2);

    /* renamed from: s9 */
    C60187m5 mo78718s9(FinderContact finderContact);

    /* renamed from: wU */
    List<C72996z1> mo78720wU();

    C60187m5 x40(String str);

    void z00(List<String> list, long j, C60210b bVar);
}
