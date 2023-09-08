package c81;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C49683hb2;
import te3.pa4;

/* renamed from: c81.a */
public final class C39904a extends UIComponent {

    /* renamed from: d */
    public String f106988d;

    /* renamed from: e */
    public String f106989e;

    /* renamed from: f */
    public C49683hb2 f106990f;

    /* renamed from: g */
    public LinkedList<LinkedList<pa4>> f106991g = new LinkedList<>();

    /* renamed from: h */
    public boolean f106992h;

    /* renamed from: i */
    public pa4 f106993i;

    /* renamed from: c81.a$a */
    public final class C39905a {

        /* renamed from: a */
        public TextView f106994a;

        public C39905a(C39904a aVar) {
        }
    }

    /* renamed from: c81.a$b */
    public final class C39906b {

        /* renamed from: a */
        public LinearLayout f106995a;

        /* renamed from: b */
        public LinearLayout f106996b;

        /* renamed from: c */
        public WeImageView f106997c;

        /* renamed from: d */
        public TextView f106998d;

        public C39906b(C39904a aVar) {
        }
    }

    /* renamed from: c81.a$c */
    public final class C39907c {

        /* renamed from: a */
        public View f106999a;

        /* renamed from: b */
        public View f107000b;

        public C39907c(C39904a aVar) {
        }
    }

    /* renamed from: c81.a$d */
    public final class C39908d {

        /* renamed from: a */
        public ImageView f107001a;

        /* renamed from: b */
        public TextView f107002b;

        /* renamed from: c */
        public TextView f107003c;

        /* renamed from: d */
        public TextView f107004d;

        /* renamed from: e */
        public TextView f107005e;

        /* renamed from: f */
        public TextView f107006f;

        /* renamed from: g */
        public LinearLayout f107007g;

        /* renamed from: h */
        public View f107008h;

        /* renamed from: i */
        public View f107009i;

        /* renamed from: j */
        public ImageView f107010j;

        /* renamed from: k */
        public ViewGroup f107011k;

        /* renamed from: l */
        public TextView f107012l;

        /* renamed from: m */
        public TextView f107013m;

        public C39908d(C39904a aVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39904a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo62522c3(String str) {
        this.f106989e = str;
    }

    /* renamed from: d3 */
    public final void mo62523d3(TextView textView, float f) {
        Activity context = getContext();
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: e3 */
    public final void mo62524e3(String str) {
        this.f106988d = str;
    }
}
