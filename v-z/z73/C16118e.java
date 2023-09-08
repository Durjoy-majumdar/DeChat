package z73;

import android.content.Intent;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.Map;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: z73.e */
public final class C16118e extends C15053a {

    /* renamed from: d */
    public static final C16118e f43302d = new C16118e();

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        Class cls = C60200t1.class;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Log.m105924i("MicroMsg.WebSearch.OpenFinderProfileJSApi", "handleMsg params:" + h1Var.f38983a);
        Map<String, Object> map = h1Var.f38983a;
        String f = C43471q.m46982f(map, "userName");
        String f2 = C43471q.m46982f(map, "reportExtraInfo");
        Intent intent = new Intent();
        intent.putExtra("finder_username", f);
        intent.putExtra("report_scene", 14);
        intent.putExtra("key_enter_profile_type", 1);
        intent.putExtra("key_extra_info", f2);
        boolean z = C43471q.m46981e(map, "isInsideFinder", 0) == 1 || C43471q.m46980d(map, "isInsideFinder", false);
        int e = C43471q.m46981e(map, "commentScene", 0);
        intent.putExtra("key_is_in_finder", z);
        intent.putExtra("key_entry_type", e);
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(6, 2, 32, intent);
        ((C60200t1) C86312j.m106911c(cls)).mo76819V1(jVar.f38998a, intent);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "openFinderProfileJsApi";
    }
}
