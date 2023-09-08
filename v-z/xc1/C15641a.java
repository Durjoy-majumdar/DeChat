package xc1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: xc1.a */
public abstract class C15641a extends MMBaseAccessibilityConfig {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15641a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final boolean mo14388c3(View view, int i) {
        C87412m.m108594g(view, "<this>");
        Object tag = view.getTag(i);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: d3 */
    public final int mo14389d3(View view, int i) {
        C87412m.m108594g(view, "<this>");
        Object tag = view.getTag(i);
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: e3 */
    public final CharSequence mo14390e3(View view, int i) {
        C87412m.m108594g(view, "<this>");
        Object tag = view.getTag(i);
        CharSequence charSequence = tag instanceof CharSequence ? (CharSequence) tag : null;
        return charSequence == null ? "" : charSequence;
    }
}
