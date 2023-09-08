package p431e;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import gy3.C87412m;

/* renamed from: e.c */
public final class C75464c extends C116634a<Intent, ActivityResult> {
    /* renamed from: a */
    public Intent mo105808a(Context context, Object obj) {
        Intent intent = (Intent) obj;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "input");
        return intent;
    }

    /* renamed from: c */
    public Object mo105809c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
