package ht1;

import ak1.C0073g0;
import ak1.C0075i;
import ak1.C54064b0;
import ak1.C54067f0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0712b0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C7335d;
import er1.C58744l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import sx3.C36903g0;
import t91.C64208c;
import te3.C49712hj1;

/* renamed from: ht1.j5 */
public interface C8777j5 extends C7335d {

    /* renamed from: ht1.j5$a */
    public static final class C8778a {
        /* renamed from: a */
        public static /* synthetic */ void m8600a(C8777j5 j5Var, long j, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                j5Var.tw0(j, str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21017");
        }

        /* renamed from: b */
        public static /* synthetic */ void m8601b(C8777j5 j5Var, int i, int i2, long j, Map map, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 8) != 0) {
                    map = C36903g0.f97931d;
                }
                j5Var.mo9599I3(i, i2, j, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21017ForAnchorLivePath");
        }

        /* renamed from: c */
        public static /* synthetic */ void m8602c(C8777j5 j5Var, RecyclerView recyclerView, C54067f0.C54078q qVar, String str, C0075i iVar, int i, long j, int i2, int i3, Object obj) {
            if (obj == null) {
                j5Var.mo9611fM(recyclerView, qVar, str, iVar, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? -1 : j, (i3 & 64) != 0 ? 0 : i2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053");
        }

        /* renamed from: d */
        public static /* synthetic */ void m8603d(C8777j5 j5Var, long j, long j2, String str, long j3, long j4, C54067f0.C54078q qVar, String str2, String str3, int i, int i2, Object obj) {
            int i3 = i2;
            if (obj == null) {
                j5Var.oj0(j, j2, str, j3, j4, qVar, str2, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? 0 : i);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053OnClick");
        }

        /* renamed from: e */
        public static /* synthetic */ void m8604e(C8777j5 j5Var, BaseFinderFeed baseFinderFeed, long j, C54067f0.C54078q qVar, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    str2 = "";
                }
                j5Var.mo9603Kf(baseFinderFeed, j, qVar, str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21053OnClick");
        }

        /* renamed from: f */
        public static /* synthetic */ void m8605f(C8777j5 j5Var, C0073g0 g0Var, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                j5Var.mo9619wD(g0Var, str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report21054");
        }

        /* renamed from: g */
        public static /* synthetic */ void m8606g(C8777j5 j5Var, C54067f0.C0064m mVar, Map map, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = new LinkedHashMap();
                }
                if ((i & 4) != 0) {
                    str = null;
                }
                j5Var.g80(mVar, map, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportElementClick");
        }

        /* renamed from: h */
        public static /* synthetic */ void m8607h(C8777j5 j5Var, C54067f0.C0064m mVar, Map map, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = new LinkedHashMap();
                }
                j5Var.mo9601JK(mVar, map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportElementClick");
        }

        /* renamed from: i */
        public static /* synthetic */ void m8608i(C8777j5 j5Var, C54067f0.C0066n nVar, Map map, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = new LinkedHashMap();
                }
                j5Var.mo9602Jz(nVar, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportElementExpose");
        }

        /* renamed from: j */
        public static /* synthetic */ void m8609j(C8777j5 j5Var, C54067f0.C0066n nVar, Map map, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    map = new LinkedHashMap();
                }
                j5Var.lb0(nVar, map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportElementExpose");
        }
    }

    /* renamed from: CB */
    void mo9597CB(C54064b0 b0Var);

    /* renamed from: Cc */
    void mo9598Cc(BaseFinderFeed baseFinderFeed, C54067f0.C54078q qVar, String str, String str2);

    /* renamed from: I3 */
    void mo9599I3(int i, int i2, long j, Map<String, ? extends Object> map);

    /* renamed from: IK */
    void mo9600IK(View view, Object obj, C64208c.C64210b bVar, int i, int i2, C54067f0.C54078q qVar, String str, C0075i iVar, boolean z);

    /* renamed from: JK */
    void mo9601JK(C54067f0.C0064m mVar, Map<String, String> map, String str, String str2, String str3);

    /* renamed from: Jz */
    void mo9602Jz(C54067f0.C0066n nVar, Map<String, String> map);

    /* renamed from: Kf */
    void mo9603Kf(BaseFinderFeed baseFinderFeed, long j, C54067f0.C54078q qVar, String str, String str2);

    /* renamed from: Pw */
    void mo9604Pw(C0712b0 b0Var, String str, long j, C54067f0.C54078q qVar, String str2);

    void Tt0(C58744l lVar, C49712hj1 hj12);

    /* renamed from: UI */
    void mo9606UI();

    /* renamed from: Uk */
    void mo9607Uk(BaseFinderFeed baseFinderFeed, long j, C54067f0.C54078q qVar, String str, String str2, String str3, String str4);

    /* renamed from: aH */
    void mo9608aH(C54067f0.C0050b0 b0Var, String str, String str2);

    /* renamed from: ap */
    void mo9609ap(C54067f0.C0054e0 e0Var);

    /* renamed from: ca */
    void mo9610ca(BaseFinderFeed baseFinderFeed, long j, String str);

    /* renamed from: fM */
    void mo9611fM(RecyclerView recyclerView, C54067f0.C54078q qVar, String str, C0075i iVar, int i, long j, int i2);

    void g80(C54067f0.C0064m mVar, Map<String, String> map, String str);

    C54067f0 getConfig();

    void hg0(String str, String str2);

    void lb0(C54067f0.C0066n nVar, Map<String, String> map, String str, String str2, String str3);

    void oj0(long j, long j2, String str, long j3, long j4, C54067f0.C54078q qVar, String str2, String str3, int i);

    /* renamed from: rG */
    String mo9617rG(String str);

    void tw0(long j, String str, String str2);

    /* renamed from: wD */
    void mo9619wD(C0073g0 g0Var, String str, String str2);

    /* renamed from: xL */
    void mo9620xL(JSONObject jSONObject);
}
