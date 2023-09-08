package w33;

import com.tencent.p014mm.autogen.mmdata.rpt.VoipIncomingCallLogStruct;
import gy3.C8480h;
import p734vz.C65907e;

/* renamed from: w33.a0 */
public final class C65925a0 implements C65907e {

    /* renamed from: a */
    public static final C65925a0 f189525a = new C65925a0();

    /* renamed from: b */
    public static long f189526b;

    /* renamed from: c */
    public static C65926a f189527c = new C65926a(0, 0, 0, 0, 0, 31, (C8480h) null);

    /* renamed from: w33.a0$a */
    public static final class C65926a {

        /* renamed from: a */
        public int f189528a;

        /* renamed from: b */
        public int f189529b;

        /* renamed from: c */
        public int f189530c;

        /* renamed from: d */
        public int f189531d;

        /* renamed from: e */
        public long f189532e;

        public C65926a() {
            this(0, 0, 0, 0, 0, 31, (C8480h) null);
        }

        public C65926a(int i, int i2, int i3, int i4, long j, int i5, C8480h hVar) {
            i = (i5 & 1) != 0 ? 0 : i;
            i2 = (i5 & 2) != 0 ? 0 : i2;
            i3 = (i5 & 4) != 0 ? 0 : i3;
            i4 = (i5 & 8) != 0 ? 0 : i4;
            j = (i5 & 16) != 0 ? 0 : j;
            this.f189528a = i;
            this.f189529b = i2;
            this.f189530c = i3;
            this.f189531d = i4;
            this.f189532e = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65926a)) {
                return false;
            }
            C65926a aVar = (C65926a) obj;
            return this.f189528a == aVar.f189528a && this.f189529b == aVar.f189529b && this.f189530c == aVar.f189530c && this.f189531d == aVar.f189531d && this.f189532e == aVar.f189532e;
        }

        public int hashCode() {
            long j = this.f189532e;
            return (((((((this.f189528a * 31) + this.f189529b) * 31) + this.f189530c) * 31) + this.f189531d) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "FloatCardReportData(dismissCalled=" + this.f189528a + ", viewRemoved=" + this.f189529b + ", showCallType=" + this.f189530c + ", permissionStatus=" + this.f189531d + ", duration=" + this.f189532e + ')';
        }
    }

    /* renamed from: a */
    public final void mo89959a(long j, int i, int i2) {
        VoipIncomingCallLogStruct voipIncomingCallLogStruct = new VoipIncomingCallLogStruct();
        voipIncomingCallLogStruct.f156895d = (long) i;
        voipIncomingCallLogStruct.f156896e = j;
        voipIncomingCallLogStruct.f156897f = (long) i2;
        voipIncomingCallLogStruct.mo86054n();
    }
}
