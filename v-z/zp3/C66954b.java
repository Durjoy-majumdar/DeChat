package zp3;

import android.graphics.Rect;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.view.C106853e;

/* renamed from: zp3.b */
public class C66954b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106853e f192356d;

    public C66954b(C106853e eVar) {
        this.f192356d = eVar;
    }

    public void run() {
        int i;
        Rect rect = new Rect();
        this.f192356d.getWindowVisibleDisplayFrame(rect);
        boolean z = this.f192356d.getBottom() - rect.bottom >= 300;
        this.f192356d.getResources().getDisplayMetrics();
        if (!z) {
            i = this.f192356d.getBottom() - ((int) this.f192356d.getResources().getDimension(C0966R.dimen.f4293z0));
        } else {
            int bottom = (this.f192356d.getBottom() - MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getInt(KeyBoardUtil.KEYBORD_HEIGHT_PX_PREFS, 0)) - ((int) this.f192356d.getResources().getDimension(C0966R.dimen.f4293z0));
            Log.m105921e("MicroMsg.BaseDrawingView", "[onKeyboardChanged] height:%s", Integer.valueOf(bottom));
            i = bottom;
        }
        if (this.f192356d.f319943t.getHeight() != i) {
            this.f192356d.f319943t.setHeight(i);
        }
        this.f192356d.getViewTreeObserver().removeOnGlobalLayoutListener(this.f192356d);
        this.f192356d.getViewTreeObserver().addOnGlobalLayoutListener(this.f192356d);
    }
}
