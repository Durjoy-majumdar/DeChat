package z33;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: z33.m */
public class C112605m {

    /* renamed from: a */
    public int f337213a;

    /* renamed from: b */
    public Map<Integer, Map<Integer, Integer>> f337214b;

    public C112605m(int i) {
        this.f337213a = i;
    }

    /* renamed from: a */
    public void mo164379a(int i, int i2, int i3) {
        Map map;
        if (this.f337214b == null) {
            this.f337214b = new HashMap();
        }
        if (!this.f337214b.containsKey(Integer.valueOf(i))) {
            map = new HashMap();
            this.f337214b.put(Integer.valueOf(i), map);
        } else {
            map = this.f337214b.get(Integer.valueOf(i));
        }
        map.put(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: b */
    public boolean mo164380b(int i) {
        Map<Integer, Map<Integer, Integer>> map = this.f337214b;
        if (map != null) {
            if (((HashMap) map).containsKey(Integer.valueOf(this.f337213a))) {
                if (((Map) ((HashMap) this.f337214b).get(Integer.valueOf(this.f337213a))).containsKey(Integer.valueOf(i))) {
                    return true;
                }
                Log.m105921e("MicroMsg.Voip.VoipStateMachine", "state: %s don't contain rule for action: %s", C112604l.m153981d(this.f337213a), C112604l.m153981d(i));
                return false;
            }
        }
        Log.m105921e("MicroMsg.Voip.VoipStateMachine", "no rule for state: %s", C112604l.m153981d(this.f337213a));
        return false;
    }
}
