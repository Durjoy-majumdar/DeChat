package q32;

import android.media.SoundPool;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import p492dn.C107054l;

/* renamed from: q32.c */
public class C77301c {

    /* renamed from: a */
    public SoundPool f225418a;

    /* renamed from: b */
    public Hashtable<String, Integer> f225419b;

    /* renamed from: c */
    public Map<Integer, Boolean> f225420c;

    /* renamed from: d */
    public volatile boolean f225421d = false;

    public C77301c(int i, int i2) {
        this.f225418a = new SoundPool(i, i2, 0);
        this.f225419b = new Hashtable<>();
        this.f225420c = new HashMap();
    }

    /* renamed from: a */
    public void mo107445a(String str) {
        int intValue;
        if (((C107054l) C86312j.m106911c(C107054l.class)).mo157471n()) {
            Log.m105924i("AsyncSoundPool", "do not play: system is mute");
        } else if (this.f225419b.containsKey(str) && (intValue = this.f225419b.get(str).intValue()) >= 0) {
            if (((HashMap) this.f225420c).containsKey(Integer.valueOf(intValue))) {
                if (((Boolean) ((HashMap) this.f225420c).get(Integer.valueOf(intValue))).booleanValue()) {
                    this.f225418a.play(intValue, 1.0f, 1.0f, 0, 0, 1.0f);
                }
            }
        }
    }
}
