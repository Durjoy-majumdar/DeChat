package aw0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.service.C105050r;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import oa1.C117731d;

/* renamed from: aw0.l */
public class C103925l {

    /* renamed from: a */
    public static Boolean f307288a;

    /* renamed from: b */
    public static Integer f307289b;

    /* renamed from: c */
    public static Integer f307290c;

    static {
        Integer valueOf = Integer.valueOf(C117731d.m166007c().mo182443e("clicfg_float_ball_message_ball_time_limit_in_ms", 3000, true, true));
        f307290c = valueOf;
        if (valueOf.intValue() <= 0) {
            f307290c = 3000;
        } else if (f307290c.intValue() > 10000) {
            f307290c = 10000;
        }
        Log.m105925i("MicroMsg.FloatBallUtil", "addMessageBallTimeLimitInMs %s", f307290c);
    }

    /* renamed from: a */
    public static boolean m138627a(Collection collection) {
        return collection != null && !collection.isEmpty();
    }

    /* renamed from: b */
    public static boolean m138628b(View view, int i, int i2) {
        Map<String, Integer> map = C92162m.f263793a;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return new Rect(i3, i4, view.getWidth() + i3, view.getHeight() + i4).contains(i, i2);
    }

    /* renamed from: c */
    public static boolean m138629c(List<BallInfo> list, BallInfo ballInfo) {
        return (m138627a(list) && list.size() == 1) && list.contains(ballInfo);
    }

    /* renamed from: d */
    public static List<BallInfo> m138630d(List<BallInfo> list) {
        if (!m138627a(list)) {
            return new Vector();
        }
        Vector vector = new Vector();
        for (BallInfo next : list) {
            if (!next.f311680E) {
                vector.add(next);
            }
        }
        return vector;
    }

    /* renamed from: e */
    public static List<BallInfo> m138631e(List<BallInfo> list) {
        if (!m138627a(list)) {
            return new Vector();
        }
        Vector vector = new Vector();
        for (BallInfo next : list) {
            if (!next.f311681F) {
                vector.add(next);
            }
        }
        return vector;
    }

    /* renamed from: f */
    public static List<BallInfo> m138632f(List<BallInfo> list) {
        if (!m138627a(list)) {
            return new Vector();
        }
        Vector vector = new Vector();
        for (BallInfo next : list) {
            if (!m138640n(next)) {
                vector.add(next);
            }
        }
        return vector;
    }

    /* renamed from: g */
    public static List<BallInfo> m138633g(List<BallInfo> list) {
        if (!m138627a(list)) {
            return new Vector();
        }
        Vector vector = new Vector();
        for (BallInfo next : list) {
            if (next.f311680E) {
                vector.add(next);
            }
        }
        return vector;
    }

    /* renamed from: h */
    public static BallInfo m138634h(List<BallInfo> list) {
        if (!m138627a(list)) {
            return null;
        }
        for (BallInfo next : list) {
            if (m138640n(next)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static int m138635i() {
        C105050r.m140969d().getClass();
        return C105050r.f311802f;
    }

    /* renamed from: j */
    public static int m138636j(Context context) {
        if (f307288a == null) {
            f307288a = Boolean.valueOf(C85875k4.m106205t(context, false));
        }
        if (!f307288a.booleanValue()) {
            return 0;
        }
        if (f307289b == null) {
            f307289b = Integer.valueOf(C85875k4.m106198o(context));
        }
        return f307289b.intValue();
    }

    /* renamed from: k */
    public static int m138637k(BallInfo ballInfo) {
        int i = ballInfo.f311686d;
        return (i == 20 && (i = ballInfo.f311687e) == 5) ? C0966R.raw.float_ball_icon_game_center_default : i != 1 ? i != 6 ? i != 8 ? i != 3 ? i != 4 ? C0966R.raw.float_ball_icon_webpage_default : C0966R.raw.float_ball_icon_files_default : C0966R.raw.float_ball_icon_fav_default : C0966R.raw.float_ball_icon_topstory_default : C0966R.raw.float_ball_icon_music_default : C0966R.raw.float_ball_icon_appbrand_default;
    }

    /* renamed from: l */
    public static int m138638l(BallInfo ballInfo) {
        int i = ballInfo.f311679D;
        if (m138639m(i, 1)) {
            return C0966R.raw.float_ball_state_location;
        }
        if (m138639m(i, 2) || m138639m(i, 128)) {
            return C0966R.raw.float_ball_state_music;
        }
        if (m138639m(i, 16)) {
            return C0966R.raw.float_ball_state_game_download_stable;
        }
        if (m138639m(i, 32)) {
            return C0966R.raw.float_ball_state_mike_on;
        }
        if (m138639m(i, 64)) {
            return C0966R.raw.float_ball_state_mike_off;
        }
        if (m138639m(i, 256)) {
            return ballInfo.f311687e == 32 ? ballInfo.f311698s : C0966R.raw.float_ball_state_message;
        }
        if (m138639m(i, 4096)) {
            return C0966R.raw.float_ball_state_appbrand_bluetooth;
        }
        return -1;
    }

    /* renamed from: m */
    public static boolean m138639m(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: n */
    public static boolean m138640n(BallInfo ballInfo) {
        if (ballInfo == null) {
            return false;
        }
        int i = ballInfo.f311686d;
        if (i == 20) {
            i = ballInfo.f311687e;
        }
        return i == 9 || i == 21 || i == 22 || i == 32 || i == 23 || i == 24 || i == 35;
    }
}
