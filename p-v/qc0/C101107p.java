package qc0;

import android.text.TextUtils;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C60212v5;
import java.util.LinkedList;
import p529fv.C98043l;
import rc0.C36290d;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C64719t23;

/* renamed from: qc0.p */
public class C101107p extends C89588n {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r0.f177794b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static qc0.C101106m m132494b(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, qc0.C62602o r26) {
        /*
            r0 = r26
            if (r0 == 0) goto L_0x0016
            te3.t23 r1 = r0.f177794b
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = r1.f185463h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0016
            te3.t23 r1 = r0.f177794b
            java.lang.String r1 = r1.f185463h
            r5 = r1
            goto L_0x0018
        L_0x0016:
            r5 = r17
        L_0x0018:
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            qc0.m r1 = qc0.C89588n.m112021a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            m132496d(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qc0.C101107p.m132494b(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, qc0.o):qc0.m");
    }

    /* renamed from: c */
    public static C101106m m132495c(String str, TimeLineObject timeLineObject, int i, C62602o oVar) {
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        C101804kv2 kv22;
        if (timeLineObject == null || (j002 = timeLineObject.ContentObj) == null || (linkedList = j002.f298427h) == null || linkedList.size() <= 0 || (kv22 = timeLineObject.ContentObj.f298427h.get(0)) == null) {
            return null;
        }
        C101106m mVar = new C101106m();
        mVar.f295959d = i;
        mVar.f295960e = timeLineObject.f283893Id;
        mVar.f295961f = 0.0f;
        mVar.f295964i = "";
        if (!TextUtils.isEmpty(kv22.f298682P)) {
            mVar.f295976x = kv22.f298682P;
        }
        mVar.f295965j = kv22.f298694i;
        mVar.f295970r = null;
        mVar.f295969q = kv22.f298683Q;
        mVar.f295962g = kv22.f298697o;
        C64719t23 t232 = timeLineObject.ContentObj.f298439w;
        if (t232 == null || Util.isNullOrNil(t232.f185463h)) {
            mVar.f295963h = kv22.f298691f;
        } else {
            mVar.f295963h = timeLineObject.ContentObj.f298439w.f185463h;
        }
        C101789j00 j003 = timeLineObject.ContentObj;
        C64719t23 t233 = j003.f298439w;
        if (t233 != null) {
            mVar.f295954P = t233.f185470r;
        }
        mVar.f295968p = j003.f298426g;
        mVar.f295967o = kv22.f298699q;
        mVar.f295966n = kv22.f298692g;
        mVar.f295973u = kv22.f298695j;
        mVar.f295975w = kv22.f298689d;
        mVar.f295972t = timeLineObject.AppInfo.f299236d;
        mVar.f295978z = timeLineObject.UserName;
        mVar.f295949J = timeLineObject.f283893Id;
        mVar.f295958T = true;
        mVar.f295952M = ((C98043l) C86312j.m106911c(C98043l.class)).mo58311iJ();
        m132496d(mVar, oVar);
        return mVar;
    }

    /* renamed from: d */
    public static void m132496d(C101106m mVar, C62602o oVar) {
        C64719t23 t232;
        if (((C98043l) C86312j.m106911c(C98043l.class)).mo58312q1(mVar.f295972t)) {
            mVar.f295958T = true;
        } else if (oVar != null) {
            mVar.f295958T = !C60212v5.m70422a(oVar.f177794b);
        } else {
            mVar.f295958T = false;
        }
        if (!(oVar == null || (t232 = oVar.f177794b) == null)) {
            if (Util.isNullOrNil(t232.f185473u) && !Util.isNullOrNil(mVar.f295962g)) {
                t232.f185473u = mVar.f295962g;
            }
            if (Util.isNullOrNil(t232.f185474v) && !Util.isNullOrNil(mVar.f295969q)) {
                t232.f185474v = mVar.f295969q;
            }
            if (!Util.isNullOrNil(t232.f185470r)) {
                mVar.f295954P = t232.f185470r;
            }
        }
        ((C36290d) C86312j.m106911c(C36290d.class)).mo59621z5(mVar, oVar);
    }
}
