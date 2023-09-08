package yb2;

import android.content.Intent;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yb2.b */
public final class C79062b {
    /* renamed from: a */
    public static final List<Class<? extends C15946a>> m95630a(Intent intent) {
        C87412m.m108594g(intent, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_intent_action_uic_list");
        if (stringArrayListExtra != null) {
            for (String cls : stringArrayListExtra) {
                try {
                    arrayList.add(Class.forName(cls));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final void m95631b(Intent intent, Class<? extends C15946a> cls) {
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(cls, "intentAction");
        intent.getStringArrayListExtra("key_intent_action_uic_list");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_intent_action_uic_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        if (!stringArrayListExtra.contains(cls.getName())) {
            stringArrayListExtra.add(cls.getName());
        }
        intent.putStringArrayListExtra("key_intent_action_uic_list", stringArrayListExtra);
    }
}
