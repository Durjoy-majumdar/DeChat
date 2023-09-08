package yw1;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.game.autogen.chatroom.HalfScreen;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.WeappJumpInfo;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.GameChatRoomAffinityUI;
import com.tencent.p014mm.plugin.game.commlib.util.C41874g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di0.C86299o;
import di3.C86312j;
import h81.C32735h;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import kr0.C76630x0;
import q90.C101070j;
import sw1.C48478n;
import v10.C52735e;
import yw1.C53591c;

/* renamed from: yw1.h */
public class C53601h {

    /* renamed from: a */
    public static C101070j<String, Bitmap> f150629a = new C101070j<>(8);

    /* renamed from: a */
    public static Bitmap m60122a(Bitmap bitmap) {
        long currentTimeMillis = System.currentTimeMillis();
        int[] iArr = {Color.argb(180, 0, 0, 0), Color.argb(125, 0, 0, 0)};
        C85875k4.m106211z();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        gradientDrawable.draw(new Canvas(bitmap));
        Log.m105925i("GameChatRoom.GameChatUtils", "addGradientDrawableToBitmap end, cost:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return bitmap;
    }

    /* renamed from: b */
    public static String m60123b(String str, String str2) {
        Uri parse = Uri.parse(str);
        String query = parse.getQuery();
        if (query != null) {
            str2 = query + "&" + str2;
        }
        try {
            return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str2, parse.getFragment()).toString();
        } catch (URISyntaxException e) {
            Log.printErrStackTrace("GameChatRoom.GameChatUtils", e, "", new Object[0]);
            return str;
        }
    }

    /* renamed from: c */
    public static boolean m60124c(boolean z) {
        for (ActivityManager.AppTask next : ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getAppTasks()) {
            ComponentName component = next.getTaskInfo().baseIntent.getComponent();
            if (component != null && component.getClassName().equals(GameChatRoomAffinityUI.class.getName())) {
                if (z) {
                    next.finishAndRemoveTask();
                }
                Log.m105925i("GameChatRoom.GameChatUtils", "finish and remove multi task, clear:%b", Boolean.valueOf(z));
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static String m60125d(List<String> list) {
        if (Util.isNullOrNil((List) list)) {
            return "()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < list.size() - 1; i++) {
            sb.append("'");
            sb.append(list.get(i));
            sb.append("'");
            sb.append(",");
        }
        sb.append("'");
        sb.append(list.get(list.size() - 1));
        sb.append("'");
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: e */
    public static C53591c.C53592a m60126e(String str) {
        return !((HashMap) C53591c.f150599a).containsKey(str) ? new C53591c.C53592a() : (C53591c.C53592a) ((HashMap) C53591c.f150599a).get(str);
    }

    /* renamed from: f */
    public static boolean m60127f(MMActivity mMActivity) {
        boolean z = mMActivity instanceof GameChatRoomAffinityUI;
        String str = C53591c.f150601c;
        return z && (str != null && str.contains(GameChatRoomAffinityUI.class.getName()));
    }

    /* renamed from: g */
    public static boolean m60128g() {
        return Build.VERSION.SDK_INT > 23 && ((C52735e) C86312j.m106911c(C52735e.class)).mo61266Ad(C32735h.C32737c.clicfg_game_chatroom_open_multitask, 0) == 1;
    }

    /* renamed from: h */
    public static int m60129h(Context context, JumpInfo jumpInfo) {
        return m60130i(context, jumpInfo, 0, (String) null);
    }

    /* renamed from: i */
    public static int m60130i(Context context, JumpInfo jumpInfo, int i, String str) {
        if (jumpInfo == null) {
            return 0;
        }
        int i2 = jumpInfo.jump_type;
        if (i2 != 1) {
            if (i2 != 2) {
                return 0;
            }
            WeappJumpInfo weappJumpInfo = jumpInfo.weapp_jump_info;
            if (weappJumpInfo == null) {
                return 3;
            }
            String str2 = weappJumpInfo.appid;
            String str3 = weappJumpInfo.path;
            C86299o oVar = new C86299o();
            oVar.f250930b = str2;
            oVar.f250934f = str3;
            oVar.f250931c = 0;
            oVar.f250939k = 1079;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
            return 3;
        } else if (Util.isNullOrNil(jumpInfo.jump_url)) {
            return 0;
        } else {
            ((C48478n) C86312j.m106911c(C48478n.class)).mo65690pN(jumpInfo.jump_url, new h$$a(context, jumpInfo, i, str));
            return 2;
        }
    }

    /* renamed from: j */
    public static int m60131j(Context context, JumpInfo jumpInfo, int i, String str) {
        JumpInfo jumpInfo2 = jumpInfo;
        HalfScreen halfScreen = jumpInfo2.half_screen;
        if (halfScreen != null) {
            int i2 = halfScreen.type;
            if (i2 == 1) {
                C41874g.m45397a(context, jumpInfo2.jump_url, i, true, halfScreen.screen_height_dp, -1.0f, str);
                return 2;
            } else if (i2 == 2) {
                C41874g.m45397a(context, jumpInfo2.jump_url, i, true, 0, halfScreen.screen_height_percent, str);
                return 2;
            }
        }
        C41874g.m45398b(context, jumpInfo2.jump_url, i, true, str);
        return 2;
    }

    /* renamed from: k */
    public static long m60132k(int i) {
        if (i == 1) {
            return 6;
        }
        if (i != 2) {
            return i != 3 ? -1 : 28;
        }
        return 7;
    }

    /* renamed from: l */
    public static int m60133l(String str, int i) {
        if (Util.isNullOrNil(str)) {
            return MMApplicationContext.getResources().getColor(i);
        }
        Integer m = m60134m(str);
        if (m == null) {
            m = Integer.valueOf(MMApplicationContext.getResources().getColor(i));
        }
        return m.intValue();
    }

    /* renamed from: m */
    public static Integer m60134m(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e) {
            Log.m105920e("GameChatRoom.GameChatUtils", "parseColor: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: n */
    public static String m60135n(String str, boolean z) {
        if (!Util.isNullOrNil(str) && str.startsWith("ChatRoomImgPath://")) {
            try {
                String decode = URLDecoder.decode(new URI(str).getPath());
                if (!Util.isNullOrNil(decode)) {
                    decode = decode.substring(1);
                }
                String decode2 = URLDecoder.decode(decode);
                String str2 = C53591c.f150602d + MD5Util.getMD5String(decode2);
                Log.m105924i("GameChatRoom.GameChatUtils", "pre send img, path:$filePath");
                return z ? str2 : decode2;
            } catch (Exception e) {
                Log.printErrStackTrace("GameChatRoom.GameChatUtils", e, "", new Object[0]);
            }
        }
        return null;
    }
}
