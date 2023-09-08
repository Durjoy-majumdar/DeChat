package p270xi;

import android.content.Intent;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: xi.f */
public final class C15688f {
    /* renamed from: a */
    public static final Intent m14685a(Intent intent, Class<? extends C53356d> cls) {
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(cls, "component");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_intent_chatting_components");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        if (!stringArrayListExtra.contains(cls.getName())) {
            stringArrayListExtra.add(cls.getName());
        }
        intent.putStringArrayListExtra("key_intent_chatting_components", stringArrayListExtra);
        return intent;
    }
}
