package cm1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import o40.C61937h;
import sx3.C64197v;
import te3.C49088d31;
import te3.C50191kx2;
import te3.C51729vr2;
import te3.C52204z21;
import tf1.C13914m;

/* renamed from: cm1.z0 */
public final class C0798z0 implements C0740i2 {

    /* renamed from: g */
    public static final C0799a f1856g = new C0799a((C8480h) null);

    /* renamed from: d */
    public final C52204z21 f1857d;

    /* renamed from: e */
    public final C51729vr2 f1858e;

    /* renamed from: f */
    public final int f1859f;

    /* renamed from: cm1.z0$a */
    public static final class C0799a {
        public C0799a(C8480h hVar) {
        }

        /* renamed from: a */
        public final LinkedList<C0798z0> mo733a(int i, C49088d31 d312) {
            C51729vr2 vr22;
            C52204z21 z212;
            int i2 = i;
            C49088d31 d313 = d312;
            C87412m.m108594g(d313, "lotteryRecord");
            LinkedList<C0798z0> linkedList = new LinkedList<>();
            int i3 = 0;
            if (i2 == 1) {
                LinkedList<C51729vr2> linkedList2 = d313.f132095o;
                C87412m.m108593f(linkedList2, "lotteryRecord.info");
                int i4 = 0;
                for (T next : linkedList2) {
                    int i5 = i4 + 1;
                    if (i4 >= 0) {
                        C51729vr2 vr23 = (C51729vr2) next;
                        LinkedList<C52204z21> linkedList3 = d313.f132088e;
                        C87412m.m108593f(linkedList3, "lotteryRecord.lotteryInfo");
                        if (i4 >= 0 && i4 < linkedList3.size()) {
                            C52204z21 z213 = linkedList3.get(i4);
                            C87412m.m108593f(z213, "{\n                lotter…List[index]\n            }");
                            z212 = z213;
                        } else {
                            z212 = new C52204z21();
                        }
                        C87412m.m108593f(vr23, "lotteryInfo");
                        linkedList.add(new C0798z0(z212, vr23, i2));
                        i4 = i5;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            } else {
                LinkedList<C52204z21> linkedList4 = d313.f132088e;
                C87412m.m108593f(linkedList4, "lotteryRecord.lotteryInfo");
                int i6 = 0;
                for (T next2 : linkedList4) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        C52204z21 z214 = (C52204z21) next2;
                        C87412m.m108593f(z214, "lotteryInfo");
                        LinkedList<C51729vr2> linkedList5 = d313.f132095o;
                        C87412m.m108593f(linkedList5, "lotteryRecord.info");
                        if (i6 >= 0 && i6 < linkedList5.size()) {
                            C51729vr2 vr24 = linkedList5.get(i6);
                            C87412m.m108593f(vr24, "{\n                lotter…List[index]\n            }");
                            vr22 = vr24;
                        } else {
                            vr22 = new C51729vr2();
                        }
                        linkedList.add(new C0798z0(z214, vr22, i2));
                        i6 = i7;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            if (C58739j4.f168176a.mo83692U()) {
                StringBuilder sb = new StringBuilder();
                sb.append("getLotteryHistoryData supportMultiType:");
                sb.append(i2);
                sb.append(',');
                StringBuilder sb4 = new StringBuilder();
                for (T next3 : linkedList) {
                    int i8 = i3 + 1;
                    if (i3 >= 0) {
                        C0798z0 z0Var = (C0798z0) next3;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("index:");
                        sb5.append(i3);
                        sb5.append(',');
                        C87412m.m108594g(z0Var, "data");
                        sb5.append("supportMultiType:" + z0Var.f1859f + ",lotteryInfo:" + C61937h.m72703b(z0Var.f1857d) + ",lotteryInfoV1:" + C61937h.m72703b(z0Var.f1858e));
                        sb5.append(';');
                        sb4.append(sb5.toString());
                        i3 = i8;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                String sb6 = sb4.toString();
                C87412m.m108593f(sb6, "sb.toString()");
                sb.append(sb6);
                Log.m105924i("FinderLotteryHistoryData", sb.toString());
            }
            return linkedList;
        }
    }

    public C0798z0(C52204z21 z212, C51729vr2 vr22, int i) {
        C87412m.m108594g(z212, "lotteryInfo");
        C87412m.m108594g(vr22, "lotteryInfoV1");
        this.f1857d = z212;
        this.f1858e = vr22;
        this.f1859f = i;
    }

    /* renamed from: a */
    public final String mo730a() {
        Object b = mo731b();
        if (b instanceof C52204z21) {
            return ((C52204z21) b).f145640d;
        }
        if (b instanceof C50191kx2) {
            return ((C50191kx2) b).f137084g;
        }
        Log.m105920e("FinderLotteryHistoryData", "getLotteryId fail,lottery is " + b + '!');
        return "";
    }

    /* renamed from: b */
    public final Object mo731b() {
        if (this.f1859f != 1) {
            return this.f1857d;
        }
        C51729vr2 vr22 = this.f1858e;
        return vr22.f143633d == 1 ? vr22.f143635f : vr22.f143634e;
    }

    /* renamed from: c */
    public int mo75c() {
        return C0798z0.class.hashCode();
    }

    /* renamed from: d */
    public final int mo732d() {
        Object b = mo731b();
        if (b instanceof C52204z21) {
            return ((C52204z21) b).f145641e;
        }
        if (b instanceof C50191kx2) {
            return ((C50191kx2) b).f137083f;
        }
        Log.m105920e("FinderLotteryHistoryData", "getLotteryTime fail,lottery is " + b + '!');
        return 0;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        C0798z0 z0Var = mVar instanceof C0798z0 ? (C0798z0) mVar : null;
        if (z0Var == null) {
            return -1;
        }
        if (C87412m.m108589b(z0Var.mo730a(), mo730a())) {
            return 0;
        }
        return mo732d() > z0Var.mo732d() ? 1 : -1;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
