package lh2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di2.C97480a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hi2.C98466p;
import j20.C117292a;
import java.util.ArrayList;
import p248ug.C78158s0;
import p248ug.C78160t0;
import qh2.C101198e;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import th2.C110992d;

/* renamed from: lh2.e */
public final class C99426e extends C99417a implements View.OnClickListener {

    /* renamed from: f */
    public ImageView f291517f;

    /* renamed from: g */
    public final C13601g f291518g;

    /* renamed from: lh2.e$a */
    public static final class C99427a extends C87413o implements C32224a<C97480a> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f291519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99427a(ViewGroup viewGroup) {
            super(0);
            this.f291519d = viewGroup;
        }

        public Object invoke() {
            Context context = this.f291519d.getContext();
            C87412m.m108593f(context, "parent.context");
            return new C97480a(context, this.f291519d, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99426e(ViewGroup viewGroup, ImageView imageView, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(eVar, "status");
        this.f291517f = imageView;
        this.f291518g = C36568h.m40985a(new C99427a(viewGroup));
        this.f291517f.setOnClickListener(this);
        ImageView imageView2 = this.f291517f;
        imageView2.setImageDrawable(C74933u4.m89768e(imageView2.getContext(), C0966R.raw.icons_filled_sticker, -1));
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (!(mo138866y().f293961b.getVisibility() == 0)) {
            return false;
        }
        mo138866y().mo136744b(false);
        return true;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditAddEmojiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mo138867z();
        C110992d dVar = C110992d.f332425a;
        C110992d.m151314c(dVar, "KEY_CLICK_EMOJI_COUNT_INT", 0, 2, (Object) null);
        dVar.mo162669b(4);
        dVar.mo162670d(6);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddEmojiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void release() {
        mo138866y().f293962c.mo100189b();
    }

    public void setVisibility(int i) {
        this.f291517f.setVisibility(i);
    }

    /* renamed from: x */
    public final void mo138865x() {
        C97480a y = mo138866y();
        y.f293962c.setTalkerName("");
        y.f293962c.setShowSearch(true);
        y.f293962c.setHideSearchJumpMoreEntrance(true);
        y.f293962c.setSearchDialogForceDarkMode(y.f286121d);
    }

    /* renamed from: y */
    public final C97480a mo138866y() {
        return (C97480a) ((C36570n) this.f291518g).getValue();
    }

    /* renamed from: z */
    public final void mo138867z() {
        if (!(mo138866y().f286122e != null)) {
            mo138866y().f286122e = new C99430f(this);
            C97480a y = mo138866y();
            C99442g gVar = new C99442g(this);
            y.getClass();
            C78158s0 d = C78160t0.m94373d();
            d.f229009a = gVar;
            y.f293962c.setCallback(d);
            C98466p pVar = C98466p.f288808a;
            C97480a y2 = mo138866y();
            C87412m.m108594g(y2, "panel");
            String str = C98466p.f288810c;
            Log.m105924i(str, "add panel  " + y2);
            C98466p.f288809b.add(y2);
        }
        mo138866y().mo136744b(true);
    }
}
