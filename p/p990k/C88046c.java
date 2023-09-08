package p990k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.tencent.p014mm.C0966R;

/* renamed from: k.c */
public class C88046c extends ContextWrapper {

    /* renamed from: a */
    public int f254678a;

    /* renamed from: b */
    public Resources.Theme f254679b;

    /* renamed from: c */
    public LayoutInflater f254680c;

    /* renamed from: d */
    public Resources f254681d;

    public C88046c() {
        super((Context) null);
    }

    /* renamed from: a */
    public final void mo122488a() {
        if (this.f254679b == null) {
            this.f254679b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f254679b.setTo(theme);
            }
        }
        this.f254679b.applyStyle(this.f254678a, true);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.f254681d == null) {
            this.f254681d = super.getResources();
        }
        return this.f254681d;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f254680c == null) {
            this.f254680c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f254680c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f254679b;
        if (theme != null) {
            return theme;
        }
        if (this.f254678a == 0) {
            this.f254678a = C0966R.style.f8814xo;
        }
        mo122488a();
        return this.f254679b;
    }

    public void setTheme(int i) {
        if (this.f254678a != i) {
            this.f254678a = i;
            mo122488a();
        }
    }

    public C88046c(Context context, int i) {
        super(context);
        this.f254678a = i;
    }
}
