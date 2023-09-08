package xs1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import og1.C62008a;
import rx3.C13598b0;

/* renamed from: xs1.m */
public final class C66438m extends C62008a implements C66418b {

    /* renamed from: g */
    public final boolean f191191g;

    /* renamed from: h */
    public final MMActivity f191192h;

    /* renamed from: i */
    public final C66417a f191193i;

    /* renamed from: j */
    public boolean f191194j;

    /* renamed from: xs1.m$a */
    public static final class C66439a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66438m f191195d;

        public C66439a(C66438m mVar) {
            this.f191195d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubbleViewCallback$applyBundle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66417a aVar = this.f191195d.f191193i;
            if (aVar != null) {
                aVar.mo90506b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubbleViewCallback$applyBundle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xs1.m$b */
    public static final class C66440b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66438m f191196d;

        public C66440b(C66438m mVar) {
            this.f191196d = mVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubbleViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66417a aVar = this.f191196d.f191193i;
            if (aVar != null) {
                aVar.mo90506b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/vote/plugin/FinderLiveVoteBubbleViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xs1.m$c */
    public static final class C66441c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f191197d;

        /* renamed from: e */
        public final /* synthetic */ float f191198e;

        public C66441c(View view, float f) {
            this.f191197d = view;
            this.f191198e = f;
        }

        public final void run() {
            this.f191197d.setScaleX(this.f191198e);
            this.f191197d.setScaleY(this.f191198e);
            this.f191197d.setPivotX(0.0f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66438m(boolean z, View view, FrameBubbleContentLayout frameBubbleContentLayout, MMActivity mMActivity, C66417a aVar) {
        super(view, frameBubbleContentLayout);
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f191191g = z;
        this.f191192h = mMActivity;
        this.f191193i = aVar;
        mo86891b().setTag(Float.valueOf(1.0f));
    }

    /* renamed from: A0 */
    public void mo90510A0(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        Log.m105924i("FinderLiveVoteBubbleViewCallback", "showPrepareVote");
        reset();
        mo90526M0();
        TextView J0 = mo90523J0();
        if (J0 != null) {
            J0.setText(mo86891b().getContext().getResources().getString(C0966R.string.mrs));
        }
        aVar.invoke();
    }

    /* renamed from: D */
    public void mo86885D(Bundle bundle) {
        mo90522I0(bundle);
    }

    /* renamed from: F0 */
    public String mo86887F0() {
        return "FinderLiveVoteBubbleViewCallback";
    }

    /* renamed from: I0 */
    public final void mo90522I0(Bundle bundle) {
        String str;
        TextView J0 = mo90523J0();
        if (J0 != null) {
            if (bundle == null || (str = bundle.getString("currentCountDownText")) == null) {
                str = "";
            }
            J0.setText(str);
        }
        View E0 = mo86886E0(C0966R.C0970id.ney);
        if (E0 != null) {
            E0.setOnClickListener(new C66439a(this));
        }
    }

    /* renamed from: J0 */
    public final TextView mo90523J0() {
        View E0 = mo86886E0(C0966R.C0970id.f357800bu0);
        if (E0 instanceof TextView) {
            return (TextView) E0;
        }
        return null;
    }

    /* renamed from: K0 */
    public void mo90524K0(boolean z) {
        if (z != this.f191194j) {
            Log.m105924i("FinderLiveVoteBubbleViewCallback", "needResize :" + z);
        }
        this.f191194j = z;
        View E0 = mo86886E0(C0966R.C0970id.ngx);
        ImageView imageView = E0 instanceof ImageView ? (ImageView) E0 : null;
        boolean z2 = false;
        if (imageView != null && imageView.getVisibility() == 0) {
            z2 = true;
        }
        if (z2) {
            mo90526M0();
        }
    }

    /* renamed from: L0 */
    public final Bundle mo90525L0() {
        Bundle bundle = new Bundle();
        TextView J0 = mo90523J0();
        bundle.putString("currentCountDownText", String.valueOf(J0 != null ? J0.getText() : null));
        return bundle;
    }

    /* renamed from: M0 */
    public final void mo90526M0() {
        float f = this.f191194j ? 0.8f : 1.0f;
        View b = mo86891b();
        if (C87412m.m108589b(b.getTag(), Float.valueOf(f))) {
            Log.m105924i("FinderLiveVoteBubbleViewCallback", "updateRootViewSize fail, scale:" + f + ",width:" + b.getLayoutParams().width);
            return;
        }
        b.setTag(Float.valueOf(f));
        Log.m105924i("FinderLiveVoteBubbleViewCallback", "updateRootViewSize scale:" + f);
        b.post(new C66441c(b, f));
    }

    /* renamed from: N */
    public void mo90511N(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        Log.m105924i("FinderLiveVoteBubbleViewCallback", "showBubbleFinish");
        TextView J0 = mo90523J0();
        if (J0 != null) {
            J0.setText(mo86891b().getContext().getResources().getString(C0966R.string.mrr));
        }
        aVar.invoke();
    }

    /* renamed from: Z */
    public Bundle mo86890Z() {
        return mo90525L0();
    }

    /* renamed from: a */
    public void mo90512a() {
        Log.m105924i("FinderLiveVoteBubbleViewCallback", "initView!");
        View E0 = mo86886E0(C0966R.C0970id.ney);
        if (E0 != null) {
            E0.setOnClickListener(new C66440b(this));
        }
        mo90526M0();
    }

    public MMFragmentActivity getActivity() {
        return this.f191192h;
    }

    /* renamed from: m0 */
    public void mo86892m0(Bundle bundle) {
        mo90522I0(bundle);
        TextView J0 = mo90523J0();
        if (J0 != null) {
            J0.setBackgroundResource(C0966R.C0969drawable.a0f);
        }
    }

    public void reset() {
        Log.m105924i("FinderLiveVoteBubbleViewCallback", "reset");
    }

    /* renamed from: x */
    public void mo86894x() {
    }

    /* renamed from: y */
    public Bundle mo86895y() {
        return mo90525L0();
    }
}
