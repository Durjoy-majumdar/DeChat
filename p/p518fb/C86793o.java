package p518fb;

import android.view.KeyEvent;
import android.view.View;
import com.tencent.luggage.game.widget.input.WAGamePanelInputEditText;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: fb.o */
public class C86793o implements C84983t0.C84991j {

    /* renamed from: a */
    public final /* synthetic */ WAGamePanelInputEditText f251929a;

    public C86793o(C86795q qVar, WAGamePanelInputEditText wAGamePanelInputEditText) {
        this.f251929a = wAGamePanelInputEditText;
    }

    /* renamed from: a */
    public boolean mo117901a(String str) {
        WAGamePanelInputEditText wAGamePanelInputEditText = this.f251929a;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (!C107207u.C107211e.m145207b(wAGamePanelInputEditText)) {
            return false;
        }
        if ("[DELETE_EMOTION]".equalsIgnoreCase(str)) {
            WAGamePanelInputEditText wAGamePanelInputEditText2 = this.f251929a;
            wAGamePanelInputEditText2.getClass();
            wAGamePanelInputEditText2.dispatchKeyEvent(new KeyEvent(0, 67));
            wAGamePanelInputEditText2.dispatchKeyEvent(new KeyEvent(1, 67));
        } else {
            this.f251929a.append(str);
        }
        return true;
    }
}
