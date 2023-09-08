package cp1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l60.C99344b;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import t60.C64207e;
import te3.C64662qp2;
import up1.C27696y;
import x60.C102564a;

/* renamed from: cp1.g */
public final class C57939g extends FrameLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f165825h = 0;

    /* renamed from: d */
    public ImageView f165826d;

    /* renamed from: e */
    public View f165827e;

    /* renamed from: f */
    public ViewGroup f165828f;

    /* renamed from: g */
    public View f165829g;

    /* renamed from: cp1.g$a */
    public static final class C57940a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C57939g f165830a;

        /* renamed from: b */
        public final /* synthetic */ C64662qp2 f165831b;

        public C57940a(C57939g gVar, C64662qp2 qp22) {
            this.f165830a = gVar;
            this.f165831b = qp22;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                C61926c.m72668M(new C57938f(this.f165830a, bitmap, this.f165831b));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57939g(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.d8_, this, false);
        C87412m.m108593f(inflate, "from(context).inflate(R.…_thumb_view, this, false)");
        this.f165827e = inflate;
        addView(inflate);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        View findViewById = findViewById(C0966R.C0970id.o_7);
        C87412m.m108593f(findViewById, "findViewById(R.id.preview_iv)");
        this.f165826d = (ImageView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.c2h);
        C87412m.m108593f(findViewById2, "findViewById(R.id.desc_tv)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.f358955i22);
        C87412m.m108593f(findViewById3, "findViewById(R.id.preview_container)");
        this.f165828f = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.o_3);
        C87412m.m108593f(findViewById4, "findViewById(R.id.play_iv)");
        this.f165829g = findViewById4;
    }

    /* access modifiers changed from: private */
    public final void setDimension(float f) {
        ViewGroup.LayoutParams layoutParams = this.f165828f.getLayoutParams();
        if (f > 1.0f) {
            layoutParams.width = (int) getContext().getResources().getDimension(C0966R.dimen.f3721of);
            layoutParams.height = (int) getContext().getResources().getDimension(C0966R.dimen.f3713c6);
        } else {
            layoutParams.width = (int) getContext().getResources().getDimension(C0966R.dimen.f3713c6);
            layoutParams.height = (int) getContext().getResources().getDimension(C0966R.dimen.f3721of);
        }
        this.f165828f.setLayoutParams(layoutParams);
    }

    public final void setFragment(C64662qp2 qp22) {
        C87412m.m108594g(qp22, "fragment");
        View view = this.f165829g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView", "setFragment", "(Lcom/tencent/mm/protocal/protobuf/LiveReplayWonderfulFragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView", "setFragment", "(Lcom/tencent/mm/protocal/protobuf/LiveReplayWonderfulFragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(qp22.f185062f, C27696y.THUMB_IMAGE));
        C57940a aVar2 = new C57940a(this, qp22);
        a.getClass();
        a.f291320d = aVar2;
        a.mo85951a();
    }
}
