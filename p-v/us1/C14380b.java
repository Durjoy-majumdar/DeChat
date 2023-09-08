package us1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import d60.C58124b;
import f40.C86709a0;
import gy3.C87412m;
import lc3.C10485b;
import qj1.C62660c;
import zj1.C16217b;

/* renamed from: us1.b */
public final class C14380b {

    /* renamed from: a */
    public final ViewGroup f39942a;

    /* renamed from: b */
    public final C58124b f39943b;

    /* renamed from: c */
    public final C62660c f39944c;

    /* renamed from: d */
    public final String f39945d = "portrait_action_goto_create_lottery";

    /* renamed from: e */
    public boolean f39946e = true;

    /* renamed from: f */
    public final View f39947f;

    /* renamed from: g */
    public final String f39948g;

    public C14380b(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f39942a = viewGroup;
        this.f39943b = bVar;
        this.f39944c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.opl);
        this.f39947f = findViewById;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.opj);
        this.f39948g = "anchorlive.bottom.tools.vote";
        viewGroup.setOnClickListener(new C14379a(this));
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.tools.vote", findViewById, textView, (TextView) null, 16, (Object) null);
    }

    /* renamed from: a */
    public final void mo13684a(int i) {
        boolean z = true;
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderLiveVotingSwitch", 0) != 1) {
            z = false;
        }
        if (i != 0) {
            this.f39942a.setVisibility(i);
        } else if (z) {
            if (this.f39946e) {
                C16217b.f43438a.mo14751g(this.f39948g);
                this.f39946e = false;
            }
            this.f39942a.setVisibility(i);
        }
    }
}
