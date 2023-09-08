package dp1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.thumbplayer.tplayer.plugins.ITPEventID;
import gy3.C87412m;
import nj3.C76874e0;
import o40.C61926c;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: dp1.e1 */
public final class C7433e1 {

    /* renamed from: a */
    public static final C7433e1 f25622a = new C7433e1();

    /* renamed from: b */
    public static long f25623b;

    /* renamed from: c */
    public static JSONObject f25624c;

    /* renamed from: a */
    public final void mo8572a(C76874e0 e0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        C87412m.m108594g(e0Var, "menu");
        if (!(e0Var.findItem(103) == null || (jSONObject4 = f25624c) == null)) {
            jSONObject4.put("button_forward_friendcircle", 1);
        }
        if (!(e0Var.findItem(102) == null || (jSONObject3 = f25624c) == null)) {
            jSONObject3.put("button_forward_friend", 1);
        }
        if (!(e0Var.findItem(113) == null || (jSONObject2 = f25624c) == null)) {
            jSONObject2.put("textstatus_in_menu", 1);
        }
        if (e0Var.findItem(114) != null && (jSONObject = f25624c) != null) {
            jSONObject.put("button_set_bell", 1);
        }
    }

    /* renamed from: b */
    public final void mo8573b(C76874e0 e0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        JSONObject jSONObject9;
        C87412m.m108594g(e0Var, "menu");
        if (!(e0Var.findItem(ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE) == null || (jSONObject9 = f25624c) == null)) {
            jSONObject9.put("button_minimize", 1);
        }
        if (!(e0Var.findItem(116) == null || (jSONObject8 = f25624c) == null)) {
            jSONObject8.put("button_speedplay", 1);
        }
        if (!(e0Var.findItem(109) == null || (jSONObject7 = f25624c) == null)) {
            jSONObject7.put("button_original_sound", 1);
        }
        if (!(e0Var.findItem(99) == null || (jSONObject6 = f25624c) == null)) {
            jSONObject6.put("button_uninterested", 1);
        }
        if (!(e0Var.findItem(101) == null || (jSONObject5 = f25624c) == null)) {
            jSONObject5.put("button_complaint", 1);
        }
        if (!(e0Var.findItem(202) == null || (jSONObject4 = f25624c) == null)) {
            jSONObject4.put("launch_promotion", 1);
        }
        if (!(e0Var.findItem(207) == null || (jSONObject3 = f25624c) == null)) {
            jSONObject3.put("copy_id", 1);
        }
        if (!(e0Var.findItem(ITPEventID.RICH_MEDIA_SYNCHRONIZER_RESET) == null || (jSONObject2 = f25624c) == null)) {
            jSONObject2.put("close_auto_slide", 1);
        }
        if (!(e0Var.findItem(ITPEventID.RICH_MEDIA_SYNCHRONIZER_DESELECT_DONE) == null || (jSONObject = f25624c) == null)) {
            jSONObject.put("open_auto_slide", 1);
        }
        JSONObject jSONObject10 = f25624c;
        if (jSONObject10 != null) {
            jSONObject10.put("button_cancel", 1);
        }
    }

    /* renamed from: c */
    public final void mo8574c(MMActivity mMActivity, long j, int i) {
        C87412m.m108594g(mMActivity, "context");
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        JSONObject jSONObject = f25624c;
        int i2 = 2;
        if (jSONObject != null) {
            jSONObject.put("feedid", C61926c.m72691p(j));
            if (i == 1) {
                i2 = 1;
            }
            jSONObject.put("from_action", i2);
            C13598b0 b0Var = C13598b0.f38549a;
        } else {
            jSONObject = new JSONObject();
            jSONObject.put("feedid", C61926c.m72691p(j));
            if (i == 1) {
                i2 = 1;
            }
            jSONObject.put("from_action", i2);
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
        f2Var.mo8580d(q3, "channel_feedcard_moreActionPanel", false, jSONObject);
        f25624c = null;
    }

    /* renamed from: d */
    public final void mo8575d(MMActivity mMActivity, String str, long j, int i) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(str, "userName");
        C7435f2 f2Var = C7435f2.f25626a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
        C49712hj1 q3 = f != null ? f.mo12861q3() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("username", str);
        jSONObject.put("menu_exp_time", f25623b);
        jSONObject.put("from_action", i == 1 ? 1 : 2);
        jSONObject.put("feedid", C61926c.m72691p(j));
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8577a(q3, "icon_recent_forward", 1, jSONObject);
    }
}
