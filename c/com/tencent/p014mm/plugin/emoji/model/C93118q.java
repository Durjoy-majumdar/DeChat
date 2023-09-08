package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.autogen.events.EmotionStateChangeEvent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.emoji.model.q */
public class C93118q {

    /* renamed from: a */
    public EmotionStateChangeEvent f268263a = new EmotionStateChangeEvent();

    /* renamed from: b */
    public final Map<String, Integer> f268264b = new HashMap();

    /* renamed from: a */
    public void mo127627a(String str, int i, int i2, String str2) {
        EmotionStateChangeEvent emotionStateChangeEvent = this.f268263a;
        EmotionStateChangeEvent.C92476a aVar = emotionStateChangeEvent.f264696d;
        aVar.f264697a = str;
        aVar.f264698b = i;
        aVar.f264699c = i2;
        aVar.f264700d = str2;
        emotionStateChangeEvent.publish();
        if (i != 6) {
            ((HashMap) this.f268264b).remove(str);
        } else if (i2 < 0 || i2 >= 100) {
            ((HashMap) this.f268264b).remove(str);
        } else {
            ((HashMap) this.f268264b).put(str, Integer.valueOf(i2));
        }
    }

    /* renamed from: b */
    public int mo127628b(String str) {
        Integer num = (Integer) ((HashMap) this.f268264b).get(str);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
