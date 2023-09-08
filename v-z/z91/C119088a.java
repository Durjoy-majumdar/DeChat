package z91;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import java.util.Iterator;
import k91.C117393b;
import l91.C117466c;
import op3.C117877b;
import op3.C117882j;
import te3.C118433ga3;
import te3.C118484zl2;

/* renamed from: z91.a */
public final class C119088a {
    /* renamed from: a */
    public static int m167880a(String str) {
        if (str == null) {
            return -1;
        }
        int i = C72996z1.m85840k5(str) ? 4 : (C45628s0.m50751P(str) || C72996z1.m85795C5(str)) ? 5 : str.startsWith("gh_") ? 2 : C72996z1.m85820U5(str) ? 1 : 0;
        Log.m105925i("HABBYGE-MALI.HellChattingType", "getChatType: %s, %d", str, Integer.valueOf(i));
        return i;
    }

    /* renamed from: b */
    public static C117877b<String, Integer> m167881b() {
        String c = C117393b.m165534c("Chat_User");
        Log.m105919d("HABBYGE-MALI.HellChattingType", "getParamsOfChattingUI, userName: %s", c);
        int a = m167880a(c);
        Log.m105925i("HABBYGE-MALI.HellChattingType", "getParamsOfChattingUI, chatType: %d", Integer.valueOf(a));
        return C117882j.m166284c(c, Integer.valueOf(a));
    }

    /* renamed from: c */
    public static C117877b<String, Integer> m167882c() {
        C118433ga3 a = C117466c.m165684a();
        String str = null;
        if (a != null && !a.f354025d.isEmpty()) {
            Iterator<C118484zl2> it = a.f354025d.iterator();
            C118484zl2 zl22 = null;
            while (it.hasNext()) {
                C118484zl2 next = it.next();
                if (next != null && "Chat_User".equals(next.f354630d)) {
                    zl22 = next;
                }
            }
            if (zl22 != null) {
                str = zl22.f354631e;
            }
        }
        Log.m105919d("HABBYGE-MALI.HellChattingType", "getParamsOfChattingUIFragment, userName: %s", str);
        int a2 = m167880a(str);
        Log.m105925i("HABBYGE-MALI.HellChattingType", "getParamsOfChattingUIFragment, chatType: %d", Integer.valueOf(a2));
        return C117882j.m166284c(str, Integer.valueOf(a2));
    }
}
