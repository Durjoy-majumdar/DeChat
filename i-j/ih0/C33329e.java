package ih0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: ih0.e */
public class C33329e extends C86301e {

    /* renamed from: d */
    public final HashMap<String, Integer> f90353d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, Integer> f90354e = new HashMap<>();

    /* renamed from: f */
    public HashMap<Integer, WeChatTabRedDotEvent.C28853a> f90355f = new HashMap<>();

    public static C33329e xx0() {
        return (C33329e) C86312j.m106911c(C33329e.class);
    }

    public void onCreate(Context context) {
        this.f90353d.put("album_dyna_photo_ui_title", 0);
        this.f90353d.put("find_live_friends_by_near", 1);
        this.f90353d.put("find_friends_by_near", 1);
        this.f90353d.put("find_friends_by_near_v3", 1);
        this.f90353d.put("find_friends_by_shake", 2);
        this.f90353d.put("find_friends_by_qrcode", 3);
        this.f90353d.put("more_tab_game_recommend", 4);
        this.f90353d.put("jd_market_entrance", 5);
        this.f90353d.put("app_brand_entrance", 6);
        this.f90353d.put("ip_call_entrance", 7);
        this.f90353d.put("find_friends_by_look", 8);
        this.f90353d.put("find_friends_by_search", 9);
        this.f90353d.put("my_life_around", 10);
        this.f90353d.put("find_friends_by_finder", 11);
        this.f90353d.put("find_friends_by_finder_live", 12);
    }

    public int[] vx0() {
        int[] iArr = new int[13];
        for (int i = 0; i < 13; i++) {
            iArr[i] = 0;
        }
        synchronized (this.f90354e) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(this.f90354e.keySet());
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (this.f90353d.containsKey(str)) {
                    iArr[this.f90353d.get(str).intValue()] = this.f90354e.get(str).intValue();
                }
            }
        }
        Log.m105919d("MicroMsg.AiRedDotData", "copyRedDotInfo [%s]", Arrays.toString(iArr));
        return iArr;
    }

    public String wx0() {
        int[] vx02 = vx0();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            sb.append(vx02[i]);
            if (i == 12) {
                return sb.toString();
            }
            sb.append("#");
            i++;
        }
    }
}
