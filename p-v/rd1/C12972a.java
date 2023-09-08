package rd1;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: rd1.a */
public class C12972a {

    /* renamed from: a */
    public final AppCompatActivity f36995a;

    /* renamed from: b */
    public Button f36996b;

    /* renamed from: c */
    public LinearLayout f36997c;

    /* renamed from: d */
    public TextView f36998d;

    /* renamed from: e */
    public TextView f36999e;

    /* renamed from: f */
    public WeImageView f37000f;

    /* renamed from: rd1.a$a */
    public static final class C12973a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12972a f37001d;

        public C12973a(C12972a aVar) {
            this.f37001d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/activity/handler/FinderActivityInvalidHandler$initInvalidView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f37001d.f36995a.isFinishing()) {
                this.f37001d.f36995a.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/handler/FinderActivityInvalidHandler$initInvalidView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C12972a(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f36995a = appCompatActivity;
    }

    /* renamed from: a */
    public void mo12502a(int i, String str) {
        String string = this.f36995a.getResources().getString(C0966R.string.cyu);
        C87412m.m108593f(string, "activity.resources.getSt…_activity_invalid_detail)");
        int color = this.f36995a.getResources().getColor(C0966R.color.Blue_100);
        if (i == -4063) {
            string = this.f36995a.getResources().getString(C0966R.string.cyq);
            C87412m.m108593f(string, "activity.resources.getSt…er_activity_feed_removed)");
            TextView textView = this.f36998d;
            if (textView != null) {
                textView.setText(string);
            }
            TextView textView2 = this.f36999e;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        } else if (i == -4058) {
            if (str == null) {
                str = this.f36995a.getResources().getString(C0966R.string.czu);
                C87412m.m108593f(str, "activity.resources.getSt…ctivity_violation_detail)");
            }
            color = this.f36995a.getResources().getColor(C0966R.color.Red_100);
            string = str;
        }
        TextView textView3 = this.f36999e;
        if (textView3 != null) {
            textView3.setText(string);
        }
        WeImageView weImageView = this.f37000f;
        if (weImageView != null) {
            weImageView.setIconColor(color);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.inflate();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12503b() {
        /*
            r4 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r4.f36995a
            r1 = 2131302630(0x7f0918e6, float:1.8223352E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r1 = 0
            if (r0 == 0) goto L_0x001e
            android.view.View r0 = r0.inflate()
            if (r0 == 0) goto L_0x001e
            r2 = 2131302629(0x7f0918e5, float:1.822335E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r4.f36997c = r0
            if (r0 != 0) goto L_0x0024
            goto L_0x0028
        L_0x0024:
            r2 = 0
            r0.setVisibility(r2)
        L_0x0028:
            android.widget.LinearLayout r0 = r4.f36997c
            if (r0 == 0) goto L_0x0042
            r2 = 2131302633(0x7f0918e9, float:1.8223358E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0042
            android.text.TextPaint r2 = r0.getPaint()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r3)
            goto L_0x0043
        L_0x0042:
            r0 = r1
        L_0x0043:
            r4.f36998d = r0
            android.widget.LinearLayout r0 = r4.f36997c
            if (r0 == 0) goto L_0x0053
            r2 = 2131302631(0x7f0918e7, float:1.8223354E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0054
        L_0x0053:
            r0 = r1
        L_0x0054:
            r4.f36999e = r0
            android.widget.LinearLayout r0 = r4.f36997c
            if (r0 == 0) goto L_0x0064
            r2 = 2131302632(0x7f0918e8, float:1.8223356E38)
            android.view.View r0 = r0.findViewById(r2)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            goto L_0x0065
        L_0x0064:
            r0 = r1
        L_0x0065:
            r4.f37000f = r0
            android.widget.LinearLayout r0 = r4.f36997c
            if (r0 == 0) goto L_0x007f
            r2 = 2131302628(0x7f0918e4, float:1.8223347E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.Button r0 = (android.widget.Button) r0
            if (r0 == 0) goto L_0x007f
            rd1.a$a r1 = new rd1.a$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            r1 = r0
        L_0x007f:
            r4.f36996b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rd1.C12972a.mo12503b():void");
    }
}
