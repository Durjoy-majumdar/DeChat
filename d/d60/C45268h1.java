package d60;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import nj3.C76912y0;
import o40.C61926c;
import rx3.C13598b0;
import y50.C53496k;

/* renamed from: d60.h1 */
public final class C45268h1 extends C58121a {

    /* renamed from: f */
    public final C58124b f122624f;

    /* renamed from: g */
    public final ImageView f122625g;

    /* renamed from: h */
    public final View f122626h;

    /* renamed from: i */
    public final TextView f122627i;

    /* renamed from: j */
    public final C32226l<String, C13598b0> f122628j;

    /* renamed from: d60.h1$a */
    public static final class C45269a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C45268h1 f122629d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f122630e;

        public C45269a(C45268h1 h1Var, ViewGroup viewGroup) {
            this.f122629d = h1Var;
            this.f122630e = viewGroup;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVisitorCommentPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            if (RoomLiveService.f157197h.f133060q) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
                this.f122629d.f122624f.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle);
            } else {
                C76912y0.makeText(this.f122630e.getContext(), (CharSequence) C76577a.m92166q(this.f122630e.getContext(), C0966R.string.f360963ga2), 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVisitorCommentPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.h1$b */
    public static final class C45270b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45268h1 f122631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45270b(C45268h1 h1Var) {
            super(1);
            this.f122631d = h1Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((String) obj, "<anonymous parameter 0>");
            C61926c.m72668M(new C45271i1(this.f122631d));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45268h1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f122624f = bVar;
        this.f122625g = (ImageView) viewGroup.findViewById(C0966R.C0970id.fui);
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fug);
        this.f122626h = findViewById;
        this.f122627i = (TextView) viewGroup.findViewById(C0966R.C0970id.fue);
        C45270b bVar2 = new C45270b(this);
        this.f122628j = bVar2;
        mo70805x0();
        findViewById.setOnClickListener(new C45269a(this, viewGroup));
        if (viewGroup.findViewById(C0966R.C0970id.bsc) != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = C75044y4.m89991c(viewGroup.getContext());
            ((RelativeLayout) viewGroup.findViewById(C0966R.C0970id.bsc)).setLayoutParams(layoutParams);
        }
        C53496k kVar = C53496k.f150436a;
        C53496k.f150439d.put(mo82894j0(), bVar2);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            mo10792g(0);
        } else if (ordinal == 39) {
            boolean z = true;
            if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                z = false;
            }
            if (z) {
                mo10792g(8);
            } else {
                mo10792g(0);
            }
        } else if (ordinal == 27 || ordinal == 28) {
            mo10792g(8);
        }
    }

    /* renamed from: x0 */
    public final void mo70805x0() {
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (RoomLiveService.f157197h.f133060q) {
            this.f122627i.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g7q));
            ImageView imageView = this.f122625g;
            Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_chat);
            C74933u4.m89769f(drawable, -1);
            imageView.setImageDrawable(drawable);
            return;
        }
        this.f122627i.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g7q));
        ImageView imageView2 = this.f122625g;
        Drawable drawable2 = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_ban_comment);
        C74933u4.m89769f(drawable2, -1);
        imageView2.setImageDrawable(drawable2);
    }
}
