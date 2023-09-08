package l23;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: l23.g0 */
public final class C109190g0 extends C99417a {

    /* renamed from: f */
    public ViewGroup f326922f;

    /* renamed from: g */
    public final C13601g f326923g = C36568h.m40985a(new C109193c(this));

    /* renamed from: h */
    public final C13601g f326924h;

    /* renamed from: i */
    public boolean f326925i;

    /* renamed from: j */
    public boolean f326926j;

    /* renamed from: n */
    public final List<C109192b> f326927n;

    /* renamed from: l23.g0$a */
    public static final class C109191a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109190g0 f326928d;

        /* renamed from: e */
        public final /* synthetic */ C101198e f326929e;

        public C109191a(C109190g0 g0Var, C101198e eVar) {
            this.f326928d = g0Var;
            this.f326929e = eVar;
        }

        public final void onClick(View view) {
            C101198e.C101199b bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiVideoPlayStatusPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109190g0 g0Var = this.f326928d;
            if (g0Var.f326925i) {
                g0Var.mo160433z();
                bVar = C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE;
            } else {
                g0Var.mo160429A();
                bVar = C101198e.C101199b.EDIT_CROP_VIDEO_RESUME;
            }
            C109190g0 g0Var2 = this.f326928d;
            g0Var2.f326926j = g0Var2.f326925i;
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_1_BOOLEAN", true);
            this.f326929e.mo14585p(bVar, bundle);
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiVideoPlayStatusPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l23.g0$b */
    public interface C109192b {
        void onVideoPause();

        void onVideoPlay();
    }

    /* renamed from: l23.g0$c */
    public static final class C109193c extends C87413o implements C32224a<Context> {

        /* renamed from: d */
        public final /* synthetic */ C109190g0 f326930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109193c(C109190g0 g0Var) {
            super(0);
            this.f326930d = g0Var;
        }

        public Object invoke() {
            return this.f326930d.f326922f.getContext();
        }
    }

    /* renamed from: l23.g0$d */
    public static final class C109194d extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ C109190g0 f326931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109194d(C109190g0 g0Var) {
            super(0);
            this.f326931d = g0Var;
        }

        public Object invoke() {
            return (WeImageView) this.f326931d.f326922f.findViewById(C0966R.C0970id.l_9);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109190g0(ViewGroup viewGroup, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f326922f = viewGroup;
        C13601g a = C36568h.m40985a(new C109194d(this));
        this.f326924h = a;
        this.f326925i = true;
        this.f326926j = true;
        this.f326927n = new ArrayList();
        ((WeImageView) ((C36570n) a).getValue()).setOnClickListener(new C109191a(this, eVar));
    }

    /* renamed from: A */
    public final void mo160429A() {
        ((WeImageView) ((C36570n) this.f326924h).getValue()).setImageDrawable(C74933u4.m89768e((Context) ((C36570n) this.f326923g).getValue(), C0966R.raw.icons_filled_pause, -1));
        this.f326925i = true;
        Iterator it = ((ArrayList) this.f326927n).iterator();
        while (it.hasNext()) {
            ((C109192b) it.next()).onVideoPlay();
        }
    }

    /* renamed from: B */
    public final void mo160430B() {
        this.f326926j = this.f326925i;
    }

    public void onPause() {
        mo160433z();
        C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE, (Bundle) null, 2, (Object) null);
    }

    public void onResume() {
        if (this.f326926j) {
            mo160429A();
            C101198e.C62622a.m73576a(this.f291492d, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
        }
    }

    public void reset() {
        mo160429A();
    }

    /* renamed from: x */
    public final void mo160431x(C109192b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((ArrayList) this.f326927n).add(bVar);
    }

    /* renamed from: y */
    public final boolean mo160432y() {
        return this.f326926j;
    }

    /* renamed from: z */
    public final void mo160433z() {
        ((WeImageView) ((C36570n) this.f326924h).getValue()).setImageDrawable(C74933u4.m89768e((Context) ((C36570n) this.f326923g).getValue(), C0966R.raw.icons_filled_play, -1));
        this.f326925i = false;
        Iterator it = ((ArrayList) this.f326927n).iterator();
        while (it.hasNext()) {
            ((C109192b) it.next()).onVideoPause();
        }
    }
}
