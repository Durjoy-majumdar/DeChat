package ba3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import aw0.C103928o;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ba3.d */
public class C39753d {

    /* renamed from: a */
    public Context f106651a;

    /* renamed from: b */
    public View f106652b;

    /* renamed from: c */
    public int f106653c;

    /* renamed from: d */
    public ViewGroup.LayoutParams f106654d;

    /* renamed from: e */
    public ViewGroup f106655e;

    /* renamed from: f */
    public int f106656f;

    /* renamed from: g */
    public int f106657g;

    /* renamed from: h */
    public int f106658h;

    /* renamed from: i */
    public WindowManager.LayoutParams f106659i;

    /* renamed from: j */
    public final Set<C39754e> f106660j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    public boolean f106661k = false;

    public C39753d(Context context) {
        this.f106651a = context;
    }

    /* renamed from: a */
    public boolean mo62391a(boolean z) {
        if (this.f106652b == null) {
            return false;
        }
        Context context = this.f106651a;
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (z || (activity != null && !activity.isFinishing() && !activity.isDestroyed())) {
            ((ViewGroup) activity.getWindow().getDecorView()).setSystemUiVisibility(this.f106656f);
            activity.getWindow().clearFlags(1024);
            if (this.f106659i != null) {
                activity.getWindow().setAttributes(this.f106659i);
            }
            activity.setRequestedOrientation(this.f106658h);
            Log.m105919d("MicroMsg.WebViewFullscreenImpl", "exitFullscreen mStashedOrientation=%d", Integer.valueOf(this.f106658h));
            if (this.f106655e != null) {
                if (this.f106652b.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.f106652b.getParent()).removeView(this.f106652b);
                }
                this.f106655e.addView(this.f106652b, this.f106653c, this.f106654d);
                this.f106652b.setBackgroundColor(this.f106657g);
            }
            this.f106652b = null;
            C103928o.m138642b();
            for (C39754e b : this.f106660j) {
                b.mo62393b();
            }
            return true;
        }
        Log.m105921e("MicroMsg.WebViewFullscreenImpl", "exitFullscreen activity(%s) destroyed", activity);
        return false;
    }
}
