package d60;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import e60.C58532b;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import qo3.C77407n;
import z50.C16107i;

/* renamed from: d60.i */
public final class C7197i extends C58121a implements C11385n {

    /* renamed from: f */
    public final C58124b f25199f;

    /* renamed from: g */
    public Context f25200g;

    /* renamed from: h */
    public final ImageView f25201h;

    /* renamed from: i */
    public final RelativeLayout f25202i;

    /* renamed from: j */
    public final TextView f25203j;

    /* renamed from: n */
    public final ProgressBar f25204n;

    /* renamed from: o */
    public C77407n f25205o;

    /* renamed from: p */
    public boolean f25206p = true;

    /* renamed from: q */
    public final C11184p0 f25207q = new C7199b(this);

    /* renamed from: d60.i$a */
    public static final class C7198a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7197i f25208d;

        public C7198a(C7197i iVar) {
            this.f25208d = iVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveBanCommentPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7197i iVar = this.f25208d;
            boolean z = iVar.f25206p;
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (z) {
                    arrayList2.add(iVar.f25200g.getResources().getString(C0966R.string.g8k));
                } else {
                    arrayList2.add(iVar.f25200g.getResources().getString(C0966R.string.g8j));
                }
                arrayList3.add(1);
                if (z) {
                    iVar.f25205o = new C77407n(iVar.f25200g, 1, true);
                    View inflate = View.inflate(iVar.f25200g, C0966R.C0971layout.b6k, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.fs_);
                    C77407n nVar = iVar.f25205o;
                    if (nVar != null) {
                        nVar.mo107569n(inflate, false);
                    }
                    textView.setText(iVar.f166287d.getContext().getResources().getString(C0966R.string.g6p));
                } else {
                    iVar.f25205o = new C77407n(iVar.f25200g, 1, false);
                }
                C77407n nVar2 = iVar.f25205o;
                if (nVar2 != null) {
                    nVar2.f225771i = new C7200j(iVar, arrayList2, arrayList3);
                }
                if (nVar2 != null) {
                    nVar2.mo107570o(true);
                }
                C77407n nVar3 = iVar.f25205o;
                if (nVar3 != null) {
                    nVar3.f225782p = iVar.f25207q;
                }
                if (nVar3 != null) {
                    nVar3.f225761d = new C7201k(iVar);
                }
                if (nVar3 != null) {
                    nVar3.mo107573q();
                }
            } else {
                C89137b0 b0Var = C86709a0.m107529k().f251779b;
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                b0Var.mo123460f(new C16107i(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, true));
                C58532b.m67948d(RoomLiveService.f157192c, RoomLiveService.f157197h.f133050d, RoomLiveService.f157199j, 4, 0, (String) null, RoomLiveService.f157197h.f133055i, 32, (Object) null);
                Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorAllowComment");
                C115669n.INSTANCE.mo175913w(1380, 6, 1);
                C7197i iVar2 = this.f25208d;
                iVar2.f25201h.setVisibility(4);
                iVar2.f25203j.setVisibility(4);
                iVar2.f25204n.setVisibility(0);
                iVar2.f25202i.setClickable(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveBanCommentPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.i$b */
    public static final class C7199b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C7197i f25209d;

        public C7199b(C7197i iVar) {
            this.f25209d = iVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 1) {
                if (this.f25209d.f25206p) {
                    C89137b0 b0Var = C86709a0.m107529k().f251779b;
                    RoomLiveService roomLiveService = RoomLiveService.f157190a;
                    b0Var.mo123460f(new C16107i(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
                    C58532b.m67948d(RoomLiveService.f157192c, RoomLiveService.f157197h.f133050d, RoomLiveService.f157199j, 4, 1, (String) null, RoomLiveService.f157197h.f133055i, 32, (Object) null);
                    Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorForbidComment");
                    C115669n.INSTANCE.mo175913w(1380, 5, 1);
                } else {
                    C89137b0 b0Var2 = C86709a0.m107529k().f251779b;
                    RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
                    b0Var2.mo123460f(new C16107i(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, true));
                    C58532b.m67948d(RoomLiveService.f157192c, RoomLiveService.f157197h.f133050d, RoomLiveService.f157199j, 4, 0, (String) null, RoomLiveService.f157197h.f133055i, 32, (Object) null);
                    Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorAllowComment");
                    C115669n.INSTANCE.mo175913w(1380, 6, 1);
                }
                C7197i iVar = this.f25209d;
                iVar.f25201h.setVisibility(4);
                iVar.f25203j.setVisibility(4);
                iVar.f25204n.setVisibility(0);
                iVar.f25202i.setClickable(false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7197i(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25199f = bVar;
        this.f25200g = viewGroup.getContext();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.frq);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_ban_comment_icon)");
        ImageView imageView = (ImageView) findViewById;
        this.f25201h = imageView;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.frr);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.l…_comment_icon_click_area)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById2;
        this.f25202i = relativeLayout;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.frs);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.l…ban_comment_icon_desc_tv)");
        this.f25203j = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.fru);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.live_ban_comment_loading)");
        this.f25204n = (ProgressBar) findViewById4;
        Drawable drawable = viewGroup.getContext().getResources().getDrawable(C0966R.raw.icons_filled_chat);
        C74933u4.m89769f(drawable, -1);
        imageView.setImageDrawable(drawable);
        relativeLayout.setOnClickListener(new C7198a(this));
        if (!mo82893g0() && viewGroup.getLayoutParams() != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(viewGroup.getContext());
        }
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C86709a0.m107529k().f251779b.mo123455a(3664, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C16107i) {
            if (i == 0 && i2 == 0) {
                this.f25206p = !this.f25206p;
            } else {
                String string = this.f25206p ? this.f166287d.getContext().getResources().getString(C0966R.string.g6j) : this.f166287d.getContext().getResources().getString(C0966R.string.g6i);
                C87412m.m108593f(string, "if (enableComment) {\n   …il_tip)\n                }");
                C76912y0.makeText(this.f166287d.getContext(), (CharSequence) string, 0).show();
            }
            mo8375x0();
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (!(ordinal == 5 || ordinal == 6)) {
            if (ordinal == 7) {
                mo10792g(0);
                return;
            } else if (ordinal != 27) {
                return;
            }
        }
        mo10792g(8);
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C86709a0.m107529k().f251779b.mo123470p(3664, this);
    }

    /* renamed from: x0 */
    public final void mo8375x0() {
        this.f25201h.setVisibility(0);
        this.f25203j.setVisibility(0);
        this.f25204n.setVisibility(8);
        this.f25202i.setClickable(true);
        if (this.f25206p) {
            ImageView imageView = this.f25201h;
            Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_chat);
            C74933u4.m89769f(drawable, -1);
            imageView.setImageDrawable(drawable);
            this.f25203j.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g6h));
            return;
        }
        ImageView imageView2 = this.f25201h;
        Drawable drawable2 = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_ban_comment);
        C74933u4.m89769f(drawable2, -1);
        imageView2.setImageDrawable(drawable2);
        this.f25203j.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g6g));
    }
}
