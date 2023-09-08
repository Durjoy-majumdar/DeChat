package wy0;

import com.tencent.p014mm.modelimage.C92805a0;
import hd0.C98404n;
import kd0.C76539f;
import kd0.C76551y;
import kd0.C76552z;
import ob0.C117747y;
import ob0.C35142u;
import qg2.C77335p;

/* renamed from: wy0.j */
public final class C78737j implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        long j;
        C76551y o;
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C77335p) {
                j = ((C77335p) yVar).f225469j;
            } else if (yVar instanceof C92805a0) {
                j = ((C92805a0) yVar).f267220q;
            } else if (yVar instanceof C98404n) {
                j = ((C98404n) yVar).f288515j.f288567n;
            } else if ((yVar instanceof C76539f) && (o = C76552z.m92077o(((C76539f) yVar).f223996f)) != null) {
                j = o.f224062m;
            } else {
                return;
            }
            C102506a.f301832a.mo142123h(j);
        }
    }
}
