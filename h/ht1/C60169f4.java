package ht1;

import android.content.Context;
import c30.C104289g;
import cm1.C55033u;
import di3.C7335d;
import java.util.List;
import te3.C49712hj1;
import te3.C64682rk1;

/* renamed from: ht1.f4 */
public interface C60169f4 extends C7335d {

    /* renamed from: ht1.f4$a */
    public static final class C60170a {
        /* renamed from: a */
        public static /* synthetic */ void m70169a(C60169f4 f4Var, long j, int i, long j2, boolean z, boolean z2, int i2, C104289g gVar, String str, int i3, int i4, int i5, int i6, int i7, Object obj) {
            int i8 = i7;
            if (obj == null) {
                f4Var.H90(j, i, j2, z, z2, i2, gVar, str, (i8 & 256) != 0 ? 0 : i3, (i8 & 512) != 0 ? 0 : i4, (i8 & 1024) != 0 ? 0 : i5, (i8 & 2048) != 0 ? 0 : i6);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportFinderCommentAd");
        }
    }

    /* renamed from: Gr */
    void mo83290Gr(Context context, boolean z, boolean z2, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6);

    void H90(long j, int i, long j2, boolean z, boolean z2, int i2, C104289g gVar, String str, int i3, int i4, int i5, int i6);

    /* renamed from: K6 */
    void mo83298K6(Context context, boolean z, int i, String str, String str2, int i2, String str3, boolean z2, boolean z3, String str4, String str5, String str6, String str7);

    /* renamed from: U3 */
    void mo83314U3(C64682rk1 rk12, int i, long j, String str, C49712hj1 hj12, long j2);

    /* renamed from: Z6 */
    void mo83323Z6(String str, String str2, String str3, int i, long j, C55033u uVar, int i2, int i3, int i4, String str4);

    /* renamed from: d */
    void mo83327d(int i, long j, long j2, int i2, int i3, long j3, long j4, long j5, long j6, int i4, int i5, String str, int i6, int i7, String str2, int i8, int i9, String str3, String str4, String str5, long j7, long j8);

    /* renamed from: dc */
    int mo83328dc(int i);

    /* renamed from: ex */
    void mo83331ex(List<String> list, List<String> list2);

    void uv0(long j, String str, String str2, long j2, String str3, String str4, String str5);

    void w30(Context context, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6);
}
