package ht1;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import di3.C7335d;
import gy3.C8480h;
import java.util.Map;
import te3.C49712hj1;
import te3.C51978xi1;
import te3.C64586nn1;
import te3.C64682rk1;
import te3.C64888zo1;

/* renamed from: ht1.e4 */
public interface C60165e4 extends C7335d {

    /* renamed from: ht1.e4$a */
    public static final class C46105a {

        /* renamed from: a */
        public final int f124275a;

        /* renamed from: b */
        public final int f124276b;

        public C46105a() {
            this(0, 0, 3, (C8480h) null);
        }

        public C46105a(int i, int i2) {
            this.f124275a = i;
            this.f124276b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C46105a)) {
                return false;
            }
            C46105a aVar = (C46105a) obj;
            return this.f124275a == aVar.f124275a && this.f124276b == aVar.f124276b;
        }

        public int hashCode() {
            return (this.f124275a * 31) + this.f124276b;
        }

        public String toString() {
            return "DslRenderInfo(dslRenderState=" + this.f124275a + ", friend_remark_flag=" + this.f124276b + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C46105a(int i, int i2, int i3, C8480h hVar) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    /* renamed from: Bd */
    void mo85141Bd();

    void C00(String str, long j, String str2, String str3);

    void Dr0(C49712hj1 hj12);

    /* renamed from: E8 */
    Map<String, Object> mo85144E8(C55718s0 s0Var, C64586nn1 nn12, int i);

    /* renamed from: Fw */
    void mo85145Fw(C64888zo1 zo12);

    /* renamed from: GI */
    void mo85146GI();

    /* renamed from: I3 */
    void mo85147I3(int i, int i2, long j, Map<String, ? extends Object> map);

    /* renamed from: KR */
    void mo85148KR(String str, String str2);

    /* renamed from: Lb */
    void mo85149Lb(String str);

    void Lc0(String str, C55718s0 s0Var, C64586nn1 nn12, int i, String str2, int i2, int i3, int i4);

    /* renamed from: MA */
    void mo85151MA();

    void N40(String str, String str2);

    /* renamed from: NF */
    void mo85153NF();

    /* renamed from: NZ */
    void mo85154NZ(String str);

    /* renamed from: PJ */
    void mo85155PJ(long j, String str, String str2);

    /* renamed from: Qn */
    void mo85156Qn(Context context, int i, int i2);

    void T10(int i);

    /* renamed from: TJ */
    void mo85158TJ(Context context, Intent intent, long j, String str, int i, int i2, boolean z, int i3);

    /* renamed from: U3 */
    void mo85159U3(C64682rk1 rk12, int i, long j, String str, C49712hj1 hj12, long j2);

    /* renamed from: V8 */
    void mo85160V8(Context context, int i);

    /* renamed from: WM */
    void mo85161WM(Context context, Intent intent);

    void c70();

    void ct0();

    void cv0(long j, String str, String str2);

    /* renamed from: dP */
    long mo85165dP();

    /* renamed from: dj */
    C49712hj1 mo85166dj(Context context);

    /* renamed from: ly */
    String mo85167ly(int i);

    void m60(String str, int i);

    /* renamed from: nQ */
    void mo85169nQ(C64888zo1 zo12);

    /* renamed from: os */
    void mo85170os(boolean z, int i, int i2, C46105a aVar);

    /* renamed from: pZ */
    void mo85171pZ(String str);

    /* renamed from: sg */
    void mo85172sg(long j);

    /* renamed from: sz */
    void mo85173sz(String str, int i, C46105a aVar);

    void un0(String str, C51978xi1 xi12, String str2, long j, String str3, int i, int i2);

    /* renamed from: vS */
    String mo85175vS(String str, int i, int i2, C46105a aVar);

    void wf0(boolean z, boolean z2, C46105a aVar);

    /* renamed from: x6 */
    C49712hj1 mo85177x6(Fragment fragment);
}
