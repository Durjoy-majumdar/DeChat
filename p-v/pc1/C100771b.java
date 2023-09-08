package pc1;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C93670l;
import com.tencent.p014mm.plugin.fav.p047ui.C93674m;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import pb1.C100734q;

/* renamed from: pc1.b */
public class C100771b {

    /* renamed from: a */
    public boolean f295226a = false;

    /* renamed from: b */
    public View f295227b;

    /* renamed from: c */
    public TextView f295228c;

    /* renamed from: d */
    public Button f295229d;

    /* renamed from: e */
    public long f295230e = C100734q.m131814E();

    /* renamed from: f */
    public C100773b f295231f;

    /* renamed from: pc1.b$a */
    public class C100772a implements View.OnClickListener {
        public C100772a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavCleanFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100773b bVar = C100771b.this.f295231f;
            if (bVar == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavCleanFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C93674m mVar = (C93674m) bVar;
            C76879j.m92750u(mVar.f270456a.getContext(), mVar.f270456a.getString(C0966R.string.cmb), "", new C93670l(mVar), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavCleanFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pc1.b$b */
    public interface C100773b {
    }

    /* renamed from: a */
    public void mo140204a() {
        if (this.f295226a && this.f295227b.getVisibility() != 8) {
            View view = this.f295227b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavCleanFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavCleanFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f295227b;
            view3.startAnimation(AnimationUtils.loadAnimation(view3.getContext(), C0966R.C0968anim.f2394bx));
        }
    }

    /* renamed from: b */
    public void mo140205b() {
        if (!this.f295226a) {
            View view = this.f295227b;
            if (view != null) {
                if (view instanceof ViewStub) {
                    this.f295227b = ((ViewStub) view).inflate();
                }
                this.f295228c = (TextView) this.f295227b.findViewById(C0966R.C0970id.cuo);
                if (!LocaleUtil.isChineseAppLang()) {
                    this.f295228c.setTextSize(1, 14.0f);
                }
                this.f295229d = (Button) this.f295227b.findViewById(C0966R.C0970id.cun);
                mo140206c();
                this.f295229d.setOnClickListener(new C100772a());
                this.f295226a = true;
            } else {
                return;
            }
        }
        if (this.f295227b.getVisibility() != 0) {
            View view2 = this.f295227b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/widget/FavCleanFooter", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/widget/FavCleanFooter", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f295227b;
            view3.startAnimation(AnimationUtils.loadAnimation(view3.getContext(), C0966R.C0968anim.f2393bw));
        }
    }

    /* renamed from: c */
    public void mo140206c() {
        TextView textView = this.f295228c;
        textView.setText(textView.getContext().getString(C0966R.string.cm_, new Object[]{C100734q.m131824O(this.f295230e)}));
        this.f295229d.setEnabled(false);
    }
}
