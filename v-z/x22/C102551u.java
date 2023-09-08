package x22;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.location_soso.ViewManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import lg3.C76695c;
import y22.C118913e;

/* renamed from: x22.u */
public class C102551u implements C102550b {

    /* renamed from: d */
    public boolean f301952d = true;

    /* renamed from: e */
    public double f301953e = 1000000.0d;

    /* renamed from: f */
    public double f301954f = 1000000.0d;

    /* renamed from: g */
    public TextView f301955g;

    /* renamed from: h */
    public ProgressBar f301956h;

    /* renamed from: i */
    public ImageView f301957i;

    /* renamed from: j */
    public FrameLayout f301958j;

    /* renamed from: n */
    public TextView f301959n;

    /* renamed from: o */
    public String f301960o;

    /* renamed from: p */
    public ViewManager f301961p;

    /* renamed from: q */
    public Context f301962q;

    public C102551u(C118913e eVar, Context context, boolean z) {
        this.f301962q = context;
        ImageView imageView = new ImageView(context);
        this.f301957i = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f301958j = (FrameLayout) View.inflate(context, C0966R.C0971layout.f359877bb2, (ViewGroup) null);
        if (z) {
            this.f301957i.setBackgroundResource(C0966R.C0969drawable.ags);
            this.f301957i.setImageResource(C0966R.C0969drawable.c54);
        } else {
            this.f301957i.setImageResource(C76695c.m92341b() ? C0966R.C0969drawable.c56 : C0966R.C0969drawable.c55);
        }
        this.f301961p = (ViewManager) eVar.getViewManager();
    }

    /* renamed from: a */
    public void mo142171a(float f) {
        Log.m105925i("ZItemOverlay", "setArrowIvAlpha:%s", Float.valueOf(f));
        this.f301957i.getDrawable().setAlpha((int) (255.0f * f));
        this.f301957i.setAlpha(f);
        this.f301961p.updateMarkerView(this.f301957i);
    }

    public String getPreText() {
        return "";
    }

    public void setText(String str) {
        this.f301955g = (TextView) this.f301958j.findViewById(C0966R.C0970id.g4v);
        this.f301956h = (ProgressBar) this.f301958j.findViewById(C0966R.C0970id.g4e);
        this.f301959n = (TextView) this.f301958j.findViewById(C0966R.C0970id.g4n);
        if (str == null || str.equals("")) {
            this.f301956h.setVisibility(0);
        } else {
            this.f301956h.setVisibility(8);
            this.f301955g.setVisibility(0);
            this.f301955g.setText(str);
        }
        String str2 = this.f301960o;
        if (str2 == null || str2.equals("")) {
            this.f301959n.setText("");
            this.f301959n.setVisibility(8);
        } else {
            this.f301959n.setVisibility(0);
            this.f301959n.setText(this.f301960o);
        }
        if (this.f301952d) {
            this.f301961p.updateViewLayout(this.f301957i, this.f301953e, this.f301954f, false);
        }
    }
}
