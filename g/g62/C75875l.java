package g62;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.storage.IStorage;
import com.tencent.p014mm.storage.C72963f4;
import java.util.ArrayList;
import junit.framework.Assert;
import kj2.C117407d;
import p261wl.C15510f;

/* renamed from: g62.l */
public interface C75875l extends IStorage {

    /* renamed from: g62.l$c */
    public interface C32329c extends C15510f {
        /* renamed from: w5 */
        void mo55728w5(C75875l lVar, C45886e eVar);
    }

    /* renamed from: g62.l$e */
    public static class C45886e {

        /* renamed from: a */
        public String f123844a;

        /* renamed from: b */
        public String f123845b;

        /* renamed from: c */
        public ArrayList<C72963f4> f123846c;

        /* renamed from: d */
        public int f123847d;

        /* renamed from: e */
        public int f123848e;

        /* renamed from: f */
        public int f123849f;

        /* renamed from: g */
        public long f123850g;

        /* renamed from: h */
        public long f123851h;

        public C45886e(String str, String str2, C72963f4 f4Var) {
            this(str, str2, f4Var, 0);
        }

        /* renamed from: a */
        public boolean mo71317a(C72963f4 f4Var) {
            return f4Var != null && f4Var.mo108769t2() == 0 && f4Var.getStatus() == 3;
        }

        public C45886e(String str, String str2, C72963f4 f4Var, int i) {
            this.f123846c = new ArrayList<>();
            this.f123848e = 0;
            this.f123849f = 0;
            this.f123850g = 0;
            long j = -1;
            this.f123851h = -1;
            this.f123844a = str;
            this.f123845b = str2;
            this.f123847d = i;
            this.f123851h = f4Var != null ? f4Var.mo108759l2() : j;
            if (f4Var != null) {
                this.f123846c.add(f4Var);
            }
        }

        public C45886e(String str, String str2, C72963f4 f4Var, int i, int i2) {
            this(str, str2, f4Var, i);
            this.f123849f = i2;
        }
    }

    /* renamed from: g62.l$b */
    public interface C75877b {
        /* renamed from: w5 */
        void mo26106w5(C75875l lVar, C45886e eVar);
    }

    /* renamed from: g62.l$d */
    public static class C75878d {

        /* renamed from: e */
        public static final MultiProcessMMKV f222520e = MultiProcessMMKV.getMMKV("db_max_id_record");

        /* renamed from: a */
        public long f222521a;

        /* renamed from: b */
        public C75879a[] f222522b;

        /* renamed from: c */
        public int f222523c;

        /* renamed from: d */
        public String f222524d;

        /* renamed from: g62.l$d$a */
        public static class C75879a {

            /* renamed from: a */
            public long f222525a;

            /* renamed from: b */
            public long f222526b;

            public C75879a(C75876a aVar) {
            }
        }

        public C75878d(int i, String str, C75879a[] aVarArr) {
            boolean z = true;
            Assert.assertTrue(str != null && str.length() > 0);
            this.f222524d = str;
            Assert.assertTrue(aVarArr.length == 2);
            C75879a aVar = aVarArr[0];
            Assert.assertTrue(aVar.f222526b >= aVar.f222525a);
            C75879a aVar2 = aVarArr[1];
            Assert.assertTrue(aVar2.f222526b >= aVar2.f222525a);
            Assert.assertTrue(aVarArr[1].f222525a < aVarArr[0].f222526b ? false : z);
            this.f222522b = aVarArr;
            this.f222523c = i;
            this.f222521a = aVarArr[0].f222525a;
        }

        /* renamed from: a */
        public static C75879a[] m91132a(long j, long j2, long j3, long j4) {
            C75879a aVar = new C75879a((C75876a) null);
            aVar.f222525a = j;
            aVar.f222526b = j2;
            C75879a aVar2 = new C75879a((C75876a) null);
            aVar2.f222525a = j3;
            aVar2.f222526b = j4;
            return new C75879a[]{aVar, aVar2};
        }

        /* renamed from: b */
        public String mo106146b() {
            return this.f222524d;
        }

        /* renamed from: c */
        public synchronized void mo106147c(C72963f4 f4Var) {
            C75879a[] aVarArr = this.f222522b;
            C75879a aVar = aVarArr[0];
            long j = this.f222521a;
            if (j == aVar.f222526b) {
                this.f222521a = aVarArr[1].f222525a;
                C117407d.INSTANCE.idkeyStat(111, 251, 1, false);
            } else {
                this.f222521a = j + 1;
            }
            if (!CrashReportFactory.isBackupMerge()) {
                Log.m105925i("MicroMsg.MsgTable", "incMsgLocalId %d  ", Long.valueOf(this.f222521a));
            }
            f4Var.setMsgId(this.f222521a);
            MultiProcessMMKV multiProcessMMKV = f222520e;
            multiProcessMMKV.putLong("msg." + this.f222524d, this.f222521a);
        }

        /* renamed from: d */
        public boolean mo106148d(long j) {
            for (C75879a aVar : this.f222522b) {
                if (j >= aVar.f222525a && j <= aVar.f222526b) {
                    return true;
                }
            }
            return false;
        }
    }
}
