package qy2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashSet;

/* renamed from: qy2.a */
public class C63347a {

    /* renamed from: a */
    public static final /* synthetic */ int f179714a = 0;

    /* renamed from: qy2.a$b */
    public enum C47891b {
        DEFAULT,
        WHITE,
        ORANGE,
        GREEN,
        GREY,
        FG_1,
        FG_0,
        FG_2,
        FG_3
    }

    /* renamed from: qy2.a$c */
    public enum C47892c {
        CONVERSATION_LIST,
        CONTACT_LIST,
        GROUP_CHAT,
        SNS_FEED,
        SNS_COMMENT,
        SNS_NOTIFICATION,
        PLANET,
        PATMSG_WITH_BG,
        PATMSG_NO_BG,
        PRIVATE_CONVERSATION_LIST,
        SNS_TIMELINE_NICK,
        SNS_TIMELINE_DETAIL
    }

    /* renamed from: qy2.a$d */
    public enum C47893d {
        FILLED,
        OUTLINED,
        READ
    }

    /* renamed from: qy2.a$a */
    public class C63348a extends HashSet<String> {
        public C63348a() {
            add("live_player@inner");
            add("finder@inner");
            add("music_player@inner");
        }
    }

    static {
        new C63348a();
    }

    /* renamed from: a */
    public static int[] m74683a(Context context) {
        C74783i3.C6978a a = C74783i3.m89537a(context);
        int i = a.f24704a;
        int i2 = a.f24705b;
        int i3 = (int) (((float) i) * 1.7777778f);
        int[] iArr = new int[2];
        if (i3 <= i2) {
            iArr[0] = i;
            iArr[1] = i3;
        } else {
            iArr[0] = i;
            iArr[1] = i2;
        }
        return iArr;
    }

    /* renamed from: b */
    public static int m74684b(Context context, View view) {
        int i = m74683a(context)[1];
        int[] a = m74683a(context);
        int i2 = (int) (((float) a[1]) / 1.7777778f);
        a[1] = i2;
        if (view != null) {
            i2 = view.getHeight();
            Log.m105919d("MicroMsg.TextStatus.ConstantsTextStatus", "getHoverOffset: foreHeight:%s foreView:%s", Integer.valueOf(i2), Integer.valueOf(view.getMeasuredHeight()));
        } else {
            Log.m105918d("MicroMsg.TextStatus.ConstantsTextStatus", "getHoverOffset: foreView is null ");
        }
        return i - i2;
    }

    /* renamed from: c */
    public static boolean m74685c(Context context) {
        C74783i3.C6978a a = C74783i3.m89537a(context);
        return ((float) a.f24705b) / ((float) a.f24704a) > 0.8f;
    }
}
