package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import ce1.C0461e0;
import ce1.C0479p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import gy3.C87412m;
import i33.C98595b;
import java.util.Set;
import kotlin.Metadata;
import nj3.C88989a;
import sx3.C110826x0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderActivityPostUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityPostUI */
public final class FinderActivityPostUI extends MMFinderUI {

    /* renamed from: o */
    public ScrollView f16777o;

    public int getLayoutId() {
        return C0966R.C0971layout.a8n;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C0479p.class, C0461e0.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.d6q);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_activity_post_scroll)");
        this.f16777o = (ScrollView) findViewById;
        C74779i.m89536a(this, false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        int f = C75044y4.m89994f(this);
        ScrollView scrollView = this.f16777o;
        if (scrollView != null) {
            scrollView.setPadding(0, f, 0, 0);
            getController().mo177105z0(getResources().getColor(C0966R.color.ahf));
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            Object systemService = context.getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            float f2 = (17.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
            TextView textView = (TextView) findViewById(C0966R.C0970id.d6r);
            if (textView != null) {
                textView.setTextSize(1, f2);
                C98595b.f289089a.mo137988f(textView);
            }
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.d6j);
            if (textView2 != null) {
                textView2.setTextSize(1, f2);
                C98595b.f289089a.mo137988f(textView2);
                return;
            }
            return;
        }
        C87412m.m108603p("scrollView");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
