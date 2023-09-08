package com.tencent.p014mm.plugin.messenger.foundation;

import a11.C39478b;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C27050c0;
import f62.C45760z0;
import f62.C75694f1;
import f62.C75699i1;
import f62.C75700k0;
import f62.C75701k1;
import java.io.IOException;
import java.util.Set;
import nr3.C89055a;
import p261wl.C38166b;
import p261wl.C38174i;
import sf0.C48374j0;
import te3.C48743ao2;
import te3.C49072d00;
import te3.C50052jy2;
import te3.C50482n20;
import te3.C50886px;
import te3.C52208z3;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.c */
public class C42569c implements C75694f1 {

    /* renamed from: a */
    public static final C26898b f115170a = new C26898b((C30254a) null);

    /* renamed from: com.tencent.mm.plugin.messenger.foundation.c$b */
    public static final class C26898b extends C89055a<C27050c0> implements C27050c0 {

        /* renamed from: com.tencent.mm.plugin.messenger.foundation.c$b$a */
        public class C26899a implements C89055a.C89056a<C27050c0> {

            /* renamed from: a */
            public final /* synthetic */ C72996z1 f74793a;

            /* renamed from: b */
            public final /* synthetic */ C50482n20 f74794b;

            public C26899a(C26898b bVar, C72996z1 z1Var, C50482n20 n202) {
                this.f74793a = z1Var;
                this.f74794b = n202;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C27050c0) obj).mo54200b1(this.f74793a, this.f74794b);
            }
        }

        /* renamed from: com.tencent.mm.plugin.messenger.foundation.c$b$b */
        public class C26900b implements C89055a.C89056a<C27050c0> {

            /* renamed from: a */
            public final /* synthetic */ C72996z1 f74795a;

            /* renamed from: b */
            public final /* synthetic */ C72996z1 f74796b;

            /* renamed from: c */
            public final /* synthetic */ C50052jy2 f74797c;

            /* renamed from: d */
            public final /* synthetic */ byte[] f74798d;

            /* renamed from: e */
            public final /* synthetic */ boolean f74799e;

            public C26900b(C26898b bVar, C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
                this.f74795a = z1Var;
                this.f74796b = z1Var2;
                this.f74797c = jy22;
                this.f74798d = bArr;
                this.f74799e = z;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C27050c0) obj).mo54199Z1(this.f74795a, this.f74796b, this.f74797c, this.f74798d, this.f74799e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.messenger.foundation.c$b$c */
        public class C26901c implements C89055a.C89056a<C27050c0> {

            /* renamed from: a */
            public final /* synthetic */ C72996z1 f74800a;

            /* renamed from: b */
            public final /* synthetic */ C72996z1 f74801b;

            /* renamed from: c */
            public final /* synthetic */ C50052jy2 f74802c;

            /* renamed from: d */
            public final /* synthetic */ byte[] f74803d;

            /* renamed from: e */
            public final /* synthetic */ boolean f74804e;

            public C26901c(C26898b bVar, C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
                this.f74800a = z1Var;
                this.f74801b = z1Var2;
                this.f74802c = jy22;
                this.f74803d = bArr;
                this.f74804e = z;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C27050c0) obj).mo54198W4(this.f74800a, this.f74801b, this.f74802c, this.f74803d, this.f74804e);
            }
        }

        public C26898b(C30254a aVar) {
        }

        /* renamed from: W4 */
        public void mo54198W4(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
            mo123416n(new C26901c(this, z1Var, z1Var2, jy22, bArr, z));
        }

        /* renamed from: Z1 */
        public void mo54199Z1(C72996z1 z1Var, C72996z1 z1Var2, C50052jy2 jy22, byte[] bArr, boolean z) {
            mo123416n(new C26900b(this, z1Var, z1Var2, jy22, bArr, z));
        }

        /* renamed from: b1 */
        public void mo54200b1(C72996z1 z1Var, C50482n20 n202) {
            mo123416n(new C26899a(this, z1Var, n202));
        }
    }

    /* JADX WARNING: type inference failed for: r2v28, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* renamed from: b */
    public static void m46213b(C50052jy2 jy22, String str, byte[] bArr, boolean z, boolean z2, int i) {
        C72996z1 z1Var;
        ? r2;
        C48743ao2 ao22;
        boolean z3;
        C72996z1 D4;
        C50052jy2 jy23 = jy22;
        Class<C45760z0> cls = C45760z0.class;
        Class cls2 = C75700k0.class;
        if (jy23 == null) {
            Log.m105922f("MicroMsg.ContactSyncExtension", "unable to parse mod contact");
            return;
        }
        String g = !Util.isNullOrNil(jy23.f136438k1) ? jy23.f136438k1 : C48374j0.m53718g(jy23.f136424d);
        String nullAsNil = Util.nullAsNil(jy23.f136419Z);
        if (!Util.isNullOrNil(g) || !Util.isNullOrNil(nullAsNil)) {
            Log.m105925i("MicroMsg.ContactSyncExtension", "username %s mobileHash %s mobileFullHash %s modContactScene %s ", jy23.f136424d, jy23.f136465y0, jy23.f136402Q0, Integer.valueOf(i));
            C72996z1 f3 = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69696f3(g);
            if (f3 != null) {
                Log.m105925i("MicroMsg.ContactSyncExtension", "oldContact.getEncryptUsername() :%s %s", f3.mo73978v2(), Integer.valueOf((int) f3.f108320R1));
            } else {
                Log.m105924i("MicroMsg.ContactSyncExtension", "oldContact is null ");
            }
            if (C72996z1.m85820U5(g) || f3 == null || !g.equals(f3.mo73978v2())) {
                if (f3 == null || (D4 = f3.mo101227D4()) == null) {
                    z1Var = f3;
                    f3 = null;
                } else {
                    z1Var = D4;
                }
                if (f3 == null) {
                    f3 = new C72996z1(g);
                }
                C72996z1 z1Var2 = f3;
                z1Var2.setUsername(g);
                z1Var2.mo62857I2(jy23.f136395J);
                z1Var2.setType(jy23.f136436j & jy23.f136441n);
                z1Var2.mo73961b3(jy23.f136457u1 & jy23.f136459v1);
                if (z && z1Var != null && ((int) z1Var.f108320R1) > 0) {
                    Log.m105929w("MicroMsg.ContactSyncExtension", "processModContact bad GETCONTACT can't give the REAL_TYPE (mariohuang), user:%s old:%d get:%d", g, Integer.valueOf(z1Var.getType()), Integer.valueOf(z1Var2.getType()));
                    if ((z1Var2.getType() & 1) == 0 && (z1Var.getType() & 1) == 1) {
                        Log.m105924i("MicroMsg.ContactSyncExtension", "processModContact resetNoContact!!");
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z1Var2.setType(z1Var2.getType() | z1Var.getType());
                    z1Var2.mo73961b3(z1Var2.mo73951C2() | z1Var.mo73951C2());
                    if (z3) {
                        z1Var2.mo62935u4();
                    }
                }
                if (!Util.isNullOrNil(nullAsNil)) {
                    z1Var2.mo62874S2(nullAsNil);
                } else if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
                    z1Var2.mo62874S2(z1Var.mo73978v2());
                }
                z1Var2.f108320R1 = z1Var == null ? 0 : (long) ((int) z1Var.f108320R1);
                z1Var2.mo62878U2(C48374j0.m53718g(jy23.f136426e));
                z1Var2.mo62882W2(C48374j0.m53718g(jy23.f136428f));
                z1Var2.mo62884X2(C48374j0.m53718g(jy23.f136430g));
                z1Var2.mo62900f4(jy23.f136432h);
                z1Var2.mo62866N3(jy23.f136452s);
                z1Var2.mo62872R2(C48374j0.m53718g(jy23.f136458v));
                z1Var2.mo62861K3(jy23.f136460w);
                z1Var2.mo62889Z3(jy23.f136387B);
                z1Var2.mo62893c4(RegionCodeDecoder.m124564q(jy23.f136405S, jy23.f136464y, jy23.f136466z));
                z1Var2.mo62902g4(jy23.f136386A);
                z1Var2.mo62894d3(jy23.f136389D);
                z1Var2.mo62925q4(jy23.f136390E);
                if (jy23.f136392G == 9 && !Util.isNullOrNil(jy23.f136433h1)) {
                    Log.m105924i("MicroMsg.ContactSyncExtension", "fix addContactScene!");
                    jy23.f136392G = 14;
                }
                z1Var2.mo62912k4(jy23.f136392G);
                z1Var2.mo62896e3(jy23.f136398M);
                z1Var2.mo62899f3(jy23.f136397L);
                z1Var2.mo62888Z2(jy23.f136433h1);
                z1Var2.mo62856H3(jy23.f136437j1);
                Log.m105925i("MicroMsg.ContactSyncExtension", "username:%s nickname:%s SourceExtInfo:%s source:%s ChatroomBusinessType:%s", z1Var2.getUsername(), Util.secPrint(z1Var2.getNickname()), z1Var2.mo73950B2(), Integer.valueOf(jy23.f136392G), Long.valueOf(jy23.f136437j1));
                if (C45628s0.m50754S(jy23.f136393H)) {
                    z1Var2.mo62928s4(jy23.f136393H);
                }
                if (z1Var2.mo101231Y5()) {
                    z1Var2.mo62863L3((int) Util.nowSecond());
                }
                if (!TextUtils.isEmpty(str)) {
                    z1Var2.mo62848B3(str);
                }
                Log.m105925i("MicroMsg.ContactSyncExtension", "remark (%s -> %s), remarkpyshort:%s, nickname:%s, pyinitial:%s, quanpin:%s", z1Var2.mo73969n2(), C48374j0.m53718g(jy23.f136445p), C48374j0.m53718g(jy23.f136448q), Util.secPrint(C48374j0.m53718g(jy23.f136426e)), C48374j0.m53718g(jy23.f136428f), C48374j0.m53718g(jy23.f136430g));
                z1Var2.mo62860K2(C48374j0.m53718g(jy23.f136445p));
                z1Var2.mo62862L2(C48374j0.m53718g(jy23.f136450r));
                z1Var2.mo62864M2(C48374j0.m53718g(jy23.f136448q));
                z1Var2.mo62867O2(jy23.f136421a1);
                z1Var2.mo62895d4(jy23.f136418Y0);
                z1Var2.mo62897e4(jy23.f136420Z0);
                byte[] d = C48374j0.m53715d(jy23.f136461w1);
                if (!Util.isNullOrNil(d)) {
                    C49072d00 d002 = new C49072d00();
                    try {
                        d002.parseFrom(d);
                        z1Var2.mo73959N2(d002);
                    } catch (IOException unused) {
                    }
                } else {
                    C49072d00 q2 = z1Var2.mo73973q2();
                    if (q2 != null) {
                        q2.f132050d.clear();
                        z1Var2.mo73959N2(q2);
                    }
                }
                if (!Util.isNullOrNil(bArr)) {
                    ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69716n4(g, bArr);
                } else {
                    byte[] bArr2 = bArr;
                    ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69718o4(g);
                    Log.m105921e("MicroMsg.ContactSyncExtension", "[processModContact] cmdBuf is null! user:%s", g);
                }
                z1Var2.mo62869P2(jy23.f136416X0);
                C52208z3 z3Var = jy23.f136404R0;
                if (!(z3Var == null || (ao22 = z3Var.f145664d) == null)) {
                    z1Var2.mo62881V3(ao22.f130697e);
                    z1Var2.mo62883W3(jy23.f136404R0.f145664d.f130696d);
                    z1Var2.mo62885X3(jy23.f136404R0.f145664d.f130698f);
                }
                if (C45628s0.m50812z(g)) {
                    z1Var2.mo62877T3();
                }
                if (z1Var2.mo62916m3()) {
                    z1Var2.mo62937v4();
                }
                String str2 = jy23.f136423c1;
                if (!Util.isEqual(z1Var2.f149523X0, str2)) {
                    z1Var2.f149523X0 = str2;
                    r2 = 1;
                    z1Var2.f149550u = true;
                    z1Var2.mo62914l3();
                } else {
                    r2 = 1;
                }
                z1Var2.f149528a1 = jy23.f136431g1;
                z1Var2.f149550u = r2;
                z1Var2.setFromType(i);
                Object[] objArr = new Object[24];
                objArr[0] = g;
                objArr[r2] = nullAsNil;
                C72996z1 z1Var3 = z1Var;
                objArr[2] = Integer.valueOf((int) z1Var2.f108320R1);
                objArr[3] = Util.secPrint(z1Var2.getNickname());
                objArr[4] = z1Var2.mo62945z2();
                objArr[5] = Integer.valueOf(z1Var2.mo73975s2());
                objArr[6] = Integer.valueOf(z1Var2.getType());
                objArr[7] = Integer.valueOf(jy23.f136436j);
                objArr[8] = Integer.valueOf(jy23.f136441n);
                objArr[9] = Long.valueOf(z1Var2.mo73951C2());
                objArr[10] = Long.valueOf(jy23.f136457u1);
                objArr[11] = Long.valueOf(jy23.f136459v1);
                objArr[12] = Integer.valueOf(z1Var2.f149507P);
                objArr[13] = Integer.valueOf(z1Var2.f149512S);
                objArr[14] = jy23.f136405S;
                objArr[15] = jy23.f136464y;
                objArr[16] = jy23.f136466z;
                objArr[17] = Integer.valueOf(z1Var2.getSource());
                objArr[18] = z1Var2.mo73974r2();
                objArr[19] = Boolean.valueOf(z);
                objArr[20] = Boolean.valueOf(jy23.f136418Y0 == null);
                String str3 = jy23.f136418Y0;
                objArr[21] = Integer.valueOf(str3 == null ? 0 : str3.length());
                String str4 = jy23.f136418Y0;
                objArr[22] = str4 == null ? "" : Util.secPrint(str4);
                objArr[23] = Integer.valueOf(jy23.f136389D);
                Log.m105925i("MicroMsg.ContactSyncExtension", "processModContact:user[%s,%s] id:%d nick:%s pin:%s delflag:%d type:%d [%d,%d] uitype:%d [%d,%d] contype:%d notify:%d region[%s,%s,%s] src:%d LabelIDList:%s fromGetContactService:%b remark_Description:(%s,%s,%s) verifyFlag:%d", objArr);
                C72996z1 z1Var4 = z1Var2;
                f115170a.mo54199Z1(z1Var2, z1Var3, jy22, bArr, z2);
                C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(cls);
                C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                while (bVar.hasNext()) {
                    ((C45760z0) ((C38174i) bVar.next()).get()).mo59216Z1(z1Var4, z1Var3, jy22, bArr, z2);
                }
                z1Var4.f149534e1 = 1;
                z1Var4.f149550u = true;
                if (!Util.isNullOrNil(nullAsNil)) {
                    ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69678Y2(nullAsNil, z1Var4);
                } else {
                    ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69668Q3(z1Var4);
                }
                f115170a.mo54198W4(z1Var4, z1Var3, jy22, bArr, z2);
                C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(cls);
                C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
                while (bVar2.hasNext()) {
                    ((C45760z0) ((C38174i) bVar2.next()).get()).mo59215W4(z1Var4, z1Var3, jy22, bArr, z2);
                }
                if ((z1Var4.getType() & 2048) != 0) {
                    if (z1Var3 == null || (z1Var3.getType() & 2048) != (z1Var4.getType() & 2048)) {
                        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69766g0(z1Var4.getUsername());
                    }
                } else if (z1Var3 == null || (z1Var3.getType() & 2048) != (z1Var4.getType() & 2048)) {
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69772j0(z1Var4.getUsername());
                }
                Log.m105925i("MicroMsg.ContactSyncExtension", "operationModSnsBlackContact username:%s isSnsBlackContact:%s", g, Boolean.valueOf(z1Var4.mo62943y3()));
                return;
            }
            Log.m105929w("MicroMsg.ContactSyncExtension", "cat's replace user with stranger  user:%s", g);
            return;
        }
        Log.m105921e("MicroMsg.ContactSyncExtension", "processModContact user is null user:%s enuser:%s", g, nullAsNil);
    }

    /* renamed from: a */
    public void mo66659a(Object obj, C50886px pxVar, int i, byte[] bArr, boolean z, C75699i1 i1Var) {
        C72996z1 z1Var;
        int i2 = pxVar.f140037d;
        if (i2 != 2) {
            if (i2 == 4) {
                C50482n20 n202 = (C50482n20) new C50482n20().parseFrom(bArr);
                Class<C45760z0> cls = C45760z0.class;
                Class cls2 = C75700k0.class;
                String g = C48374j0.m53718g(n202.f138337d);
                if (C72996z1.m85820U5(g)) {
                    Log.m105925i("MicroMsg.ContactSyncExtension", "processDelContact user:%s, but not del conv", g);
                    C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(g);
                    f115170a.mo54200b1(z1Var2, n202);
                    C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(cls);
                    C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                    while (bVar.hasNext()) {
                        ((C45760z0) ((C38174i) bVar.next()).get()).mo59217b1(z1Var2, n202);
                    }
                    Set<String> set = C45628s0.f123410p;
                    if (!Util.isNullOrNil(g) && (z1Var = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(g)) != null) {
                        z1Var.mo62935u4();
                        ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().mo69719p3(g, z1Var);
                    }
                    ((C39478b) C86312j.m106911c(C39478b.class)).mo62077Yv(g);
                    C75701k1.m90962b(4, n202);
                    return;
                }
                Log.m105925i("MicroMsg.ContactSyncExtension", "processDelContact user:%s", g);
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls2)).mo96094Ku()).mo69763f(g);
                C72996z1 z1Var3 = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(g);
                f115170a.mo54200b1(z1Var3, n202);
                C38166b.C38167a aVar2 = (C38166b.C38167a) C38166b.m41759f(cls);
                C38166b.C38167a.C38169b bVar2 = new C38166b.C38167a.C38169b(aVar2, aVar2.f100837d.all().iterator());
                while (bVar2.hasNext()) {
                    ((C45760z0) ((C38174i) bVar2.next()).get()).mo59217b1(z1Var3, n202);
                }
                C45628s0.m50736A0(g);
                C75701k1.m90962b(4, n202);
                return;
            } else if (i2 != 17) {
                return;
            }
        }
        C50052jy2 jy22 = (C50052jy2) new C50052jy2().parseFrom(bArr);
        if (!z) {
            bArr = null;
        }
        m46213b(jy22, "", bArr, false, z, 0);
    }
}
