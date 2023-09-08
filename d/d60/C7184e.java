package d60;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: d60.e */
public final class C7184e extends C58121a {

    /* renamed from: f */
    public final C58124b f25173f;

    /* renamed from: g */
    public C77407n f25174g;

    /* renamed from: h */
    public int f25175h;

    /* renamed from: i */
    public final C11184p0 f25176i;

    /* renamed from: d60.e$a */
    public static final class C7185a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7184e f25177d;

        public C7185a(C7184e eVar) {
            this.f25177d = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAnchorClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f25177d.f25173f, C58124b.C58125b.CLOSE_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAnchorClosePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.e$b */
    public static final class C7186b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f25178d;

        /* renamed from: e */
        public final /* synthetic */ C7184e f25179e;

        public C7186b(ViewGroup viewGroup, C7184e eVar) {
            this.f25178d = viewGroup;
            this.f25179e = eVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                Context context = this.f25178d.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).getIntent().putExtra("key_is_live_finished", true);
                C58124b.C7172a.m7372a(this.f25179e.f25173f, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
                Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorFinishLive");
                C115669n.INSTANCE.mo175913w(1380, 8, 1);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7184e(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f25173f = bVar;
        this.f25175h = C75044y4.m89991c(viewGroup.getContext());
        this.f25176i = new C7186b(viewGroup, this);
        ((TextView) viewGroup.findViewById(C0966R.C0970id.fre)).setOnClickListener(new C7185a(this));
        if (mo82893g0() && viewGroup.getLayoutParams() != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            int d0 = mo82891d0();
            if (d0 == 1) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C75044y4.m89991c(viewGroup.getContext()));
            } else if (d0 == 3) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(C74942w4.m89784a(viewGroup.getContext(), 16));
            }
        }
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        int c = C75044y4.m89991c(this.f166287d.getContext());
        if (c == 0) {
            c = C74942w4.m89784a(this.f166287d.getContext(), 16);
        }
        this.f25175h = c;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal != 65) {
                if (ordinal == 7) {
                    mo10792g(0);
                    return;
                } else if (ordinal == 8) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.add(this.f166287d.getContext().getResources().getString(C0966R.string.g8l));
                    arrayList2.add(0);
                    if (this.f25174g == null) {
                        this.f25174g = new C77407n(this.f166287d.getContext(), 1, false);
                    }
                    C77407n nVar = this.f25174g;
                    if (nVar != null) {
                        nVar.f225771i = new C7193f(this, arrayList, arrayList2);
                    }
                    if (nVar != null) {
                        nVar.f225782p = this.f25176i;
                    }
                    if (nVar != null) {
                        nVar.f225761d = new C7194g(this);
                    }
                    if (nVar != null) {
                        nVar.mo107573q();
                        return;
                    }
                    return;
                } else if (!(ordinal == 27 || ordinal == 28)) {
                    return;
                }
            } else if (this.f166287d.getLayoutParams() != null && (this.f166287d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                int d0 = mo82891d0();
                if (d0 == 1) {
                    ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(C74942w4.m89784a(this.f166287d.getContext(), 16));
                    return;
                } else if (d0 == 3) {
                    ViewGroup.LayoutParams layoutParams2 = this.f166287d.getLayoutParams();
                    C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginEnd(this.f25175h);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        mo10792g(8);
    }
}
