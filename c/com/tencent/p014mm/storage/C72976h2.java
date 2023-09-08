package com.tencent.p014mm.storage;

import ai3.C112789a;
import android.content.ContentValues;
import android.database.Cursor;
import bp3.C67301m;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import eb0.C45629t0;
import g62.C45881a;
import kj2.C117407d;
import p922vj.C78420a;
import te3.C64418hb3;

/* renamed from: com.tencent.mm.storage.h2 */
public class C72976h2 extends C78420a implements C112789a<String> {

    /* renamed from: n1 */
    public C72963f4 f212786n1;

    /* renamed from: o1 */
    public int f212787o1;

    public C72976h2(String str) {
        super(str);
    }

    /* renamed from: B1 */
    public void mo69635B1(int i, long j) {
        if (i == 0) {
            mo108812g3((int) j);
        } else if (i == 1) {
            mo108808d((int) j);
        } else if (i == 2) {
            mo108803Y2((int) j);
        } else if (i == 3) {
            mo108793N2(j);
        } else if (i == 7) {
            super.mo101161T2(j);
        } else if (i == 10) {
            mo108790K2((int) j);
        } else if (i == 16) {
            mo108802X2((int) j);
        } else if (i != 17) {
            switch (i) {
                case 12:
                    mo108789J2((int) j);
                    return;
                case 13:
                    mo108817i3((int) j);
                    return;
                case 14:
                    mo108816h3((int) j);
                    return;
                default:
                    return;
            }
        } else {
            mo108809d3((int) j);
        }
    }

    /* renamed from: L1 */
    public void mo69636L1(int i, String str) {
        if (i == 4) {
            setUsername(str);
        } else if (i == 5) {
            mo108792M2(str);
        } else if (i == 6) {
            mo108806b3(str);
        } else if (i == 8) {
            mo108794O2(str);
        } else if (i == 9) {
            mo108795P2(str);
        } else if (i == 11) {
            mo108796Q2(str);
        } else if (i == 18) {
            mo108807c3(str);
        }
    }

    /* renamed from: T2 */
    public void mo101161T2(long j) {
        super.mo101161T2(j);
    }

    /* renamed from: Y */
    public void mo69637Y(int i, byte[] bArr) {
    }

    /* renamed from: c1 */
    public void mo69641c1(int i, double d) {
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
    }

    public ContentValues convertTo() {
        return super.convertTo();
    }

    public Object getKey() {
        return getUsername();
    }

    /* renamed from: m3 */
    public void mo101162m3() {
        mo108808d(0);
        mo108803Y2(0);
        mo108792M2("");
        mo108806b3("0");
        mo108812g3(0);
        mo108816h3(0);
        mo108804Z2(0);
        mo108811f3(0);
        mo108811f3(0);
        mo108794O2("");
        mo108795P2("");
    }

    /* renamed from: n3 */
    public String mo101163n3() {
        return getUsername();
    }

    /* renamed from: o3 */
    public void mo101164o3(C72963f4 f4Var) {
        mo108808d(f4Var.getStatus());
        mo108803Y2(f4Var.mo108769t2());
        if (f4Var.mo100989b4()) {
            mo108793N2(f4Var.getCreateTime());
        } else if (f4Var.mo100986Y3()) {
            C64418hb3 d = C67301m.m79639d(getContent());
            if (!d.f183464e.isEmpty()) {
                mo108793N2(d.f183464e.getLast().f227610g);
            } else {
                mo108793N2(f4Var.getCreateTime());
            }
        } else {
            mo108793N2(f4Var.getStatus() == 1 ? MAlarmHandler.NEXT_FIRE_INTERVAL : f4Var.getCreateTime());
        }
        if (f4Var.mo100985X3()) {
            mo108792M2(f4Var.mo101011p3());
        } else {
            mo108792M2(f4Var.getContent());
        }
        if ("hidden_conv_parent".equalsIgnoreCase(mo108782C2())) {
            if (!C72996z1.m85804J4(getUsername()) || C72996z1.m85793A5(getUsername())) {
                mo108807c3((String) null);
                C117407d dVar = C117407d.INSTANCE;
                int i = 3;
                Object[] objArr = new Object[3];
                if (f4Var.mo108769t2() != 1) {
                    i = 6;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = getUsername();
                objArr[2] = Integer.valueOf(C45629t0.m50816c(getUsername()));
                dVar.mo160131h(21170, objArr);
                return;
            }
            mo108807c3("appbrandcustomerservicemsg");
        } else if ("message_fold".equalsIgnoreCase(getUsername())) {
            mo108793N2(0);
            super.mo101161T2(C45881a.m51165b(this, 2, 0));
        }
    }

    /* renamed from: q */
    public void mo69645q(int i) {
    }

    /* renamed from: w */
    public void mo69646w() {
    }

    public C72976h2() {
    }
}
