package p204mr;

import ak1.C0074h0;
import ak1.C0076j0;
import ak1.C0077k0;
import ak1.C54090i0;
import ak1.C54097l0;
import di3.C7335d;
import java.util.Map;

/* renamed from: mr.m */
public interface C61568m extends C7335d {

    /* renamed from: mr.m$a */
    public static final class C61569a {
        /* renamed from: a */
        public static /* synthetic */ void m72263a(C61568m mVar, C0077k0 k0Var, String str, long j, int i, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, long j2, int i2, int i3, Object obj) {
            int i4 = i3;
            if (obj == null) {
                mVar.mo74856HG(k0Var, str, j, i, str2, (i4 & 32) != 0 ? null : str3, (i4 & 64) != 0 ? 0L : l, (i4 & 128) != 0 ? "" : str4, (i4 & 256) != 0 ? "" : str5, (i4 & 512) != 0 ? "" : str6, (i4 & 1024) != 0 ? null : str7, (i4 & 2048) != 0 ? null : str8, (i4 & 4096) != 0 ? null : str9, (i4 & 8192) != 0 ? 0 : j2, (i4 & 16384) != 0 ? 0 : i2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21158");
        }

        /* renamed from: b */
        public static /* synthetic */ void m72264b(C61568m mVar, C54090i0 i0Var, C0074h0 h0Var, boolean z, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    z = true;
                }
                if ((i2 & 8) != 0) {
                    i = 0;
                }
                mVar.mo74893td(i0Var, h0Var, z, i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportRedPacket");
        }
    }

    /* renamed from: HG */
    void mo74856HG(C0077k0 k0Var, String str, long j, int i, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, long j2, int i2);

    void h10(long j, long j2, String str, String str2, String str3, String str4, String str5, long j3, String str6);

    void nv0(C0076j0 j0Var, String str, int i);

    void qw0(String str, C54097l0 l0Var, Map<String, String> map);

    /* renamed from: sS */
    void mo74891sS(String str);

    /* renamed from: td */
    void mo74893td(C54090i0 i0Var, C0074h0 h0Var, boolean z, int i);
}
