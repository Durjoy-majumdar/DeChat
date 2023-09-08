package qq0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83896q4;
import com.tencent.p014mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton;
import com.tencent.p014mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton;

/* renamed from: qq0.d */
public final class C89796d extends FrameLayout implements C89813r, C83896q4 {

    /* renamed from: d */
    public int f258181d = 0;

    /* renamed from: e */
    public AppBrandOptionButton f258182e;

    /* renamed from: f */
    public AppBrandCapsuleHomeButton f258183f;

    /* renamed from: g */
    public LinearLayout f258184g;

    /* renamed from: h */
    public View f258185h;

    public C89796d(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(C0966R.C0971layout.f6391dk, this);
        this.f258182e = (AppBrandOptionButton) findViewById(C0966R.C0970id.f5447fd);
        this.f258183f = (AppBrandCapsuleHomeButton) findViewById(C0966R.C0970id.f5446fc);
        this.f258184g = (LinearLayout) findViewById(C0966R.C0970id.f5443f_);
        this.f258185h = findViewById(C0966R.C0970id.f5445fb);
        this.f258182e.setAccessibilityLabel(getContext().getString(C0966R.string.f7584kc));
        this.f258183f.setAccessibilityLabel(getContext().getString(C0966R.string.f7580k9));
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        draw(canvas);
        return true;
    }

    public View getCapsuleContentAreaView() {
        return this.f258184g;
    }

    public AppBrandCapsuleHomeButton getCapsuleHomeButton() {
        return this.f258183f;
    }

    public AppBrandOptionButton getOptionBtn() {
        return this.f258182e;
    }

    public void setHomeButtonOnClickListener(View.OnClickListener onClickListener) {
        this.f258183f.setOnClickListener(onClickListener);
    }

    public void setOptionButtonOnClickListener(View.OnClickListener onClickListener) {
        this.f258182e.setOnClickListener(onClickListener);
    }

    public void setStyleColor(int i) {
        if (i != this.f258181d) {
            if (i == -1) {
                this.f258181d = -1;
                this.f258185h.setBackgroundResource(C0966R.color.f3052dh);
                this.f258184g.setBackgroundResource(C0966R.C0969drawable.f4439co);
                this.f258182e.setColor(-1);
                this.f258183f.setColor(-1);
                return;
            }
            this.f258181d = -16777216;
            this.f258185h.setBackgroundResource(C0966R.color.f3053di);
            this.f258184g.setBackgroundResource(C0966R.C0969drawable.f4440cp);
            this.f258182e.setColor(-16777216);
            this.f258183f.setColor(-16777216);
        }
    }
}
