package lh1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
import gy3.C87412m;
import nj3.C76912y0;
import p159gw.C98250h;

/* renamed from: lh1.j */
public final class C10522j implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ ShellView f31775a;

    public C10522j(ShellView shellView) {
        this.f31775a = shellView;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        C76912y0.m92769h(this.f31775a.getContext(), this.f31775a.getContext().getResources().getString(C0966R.string.dzt), C0966R.raw.icons_filled_done);
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        C87412m.m108594g(str, "srcPath");
        C87412m.m108594g(str2, "destPath");
        C76912y0.m92769h(this.f31775a.getContext(), this.f31775a.getContext().getResources().getString(C0966R.string.dzs), C0966R.raw.icons_filled_close);
    }
}
