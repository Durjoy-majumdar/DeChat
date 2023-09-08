package wp1;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cm1.C55033u;
import com.google.android.gms.common.internal.ImagesContract;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.service.C3604o1;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8794p5;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p629ny.C76979h;
import qo3.C77407n;
import te3.C51954xc1;
import te3.C64854ye0;
import up1.C65426w0;

/* renamed from: wp1.a */
public final class C66164a {

    /* renamed from: a */
    public static final C66164a f190162a = new C66164a();

    /* renamed from: wp1.a$a */
    public static final class C15581a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ Context f42203d;

        public C15581a(Context context) {
            this.f42203d = context;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.mo107176v()) {
                e0Var.mo107140d(1, this.f42203d.getResources().getColor(C0966R.color.a_3), this.f42203d.getString(C0966R.string.d8r));
            }
        }
    }

    /* renamed from: wp1.a$b */
    public static final class C15582b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f42204d;

        /* renamed from: e */
        public final /* synthetic */ C8794p5<C51954xc1> f42205e;

        public C15582b(BaseFinderFeed baseFinderFeed, C8794p5<C51954xc1> p5Var) {
            this.f42204d = baseFinderFeed;
            this.f42205e = p5Var;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 1) {
                ((C3604o1) C86312j.m106911c(C3604o1.class)).mo3976wm(this.f42204d.mo3513o().getId(), this.f42204d.mo3513o().getFeedObject(), this.f42204d.mo3513o().getObjectNonceId(), false, this.f42205e);
            }
        }
    }

    /* renamed from: a */
    public final void mo90220a(Context context, BaseFinderFeed baseFinderFeed, boolean z, C8794p5<C51954xc1> p5Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        if (!z) {
            C77407n nVar = new C77407n(context, 1, true);
            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.csb, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.knp)).setText(context.getResources().getString(C0966R.string.m4z));
            nVar.mo107569n(inflate, false);
            nVar.f225771i = new C15581a(context);
            nVar.f225782p = new C15582b(baseFinderFeed, p5Var);
            nVar.mo107573q();
            return;
        }
        ((C3604o1) C86312j.m106911c(C3604o1.class)).mo3976wm(baseFinderFeed.mo3513o().getId(), baseFinderFeed.mo3513o().getFeedObject(), baseFinderFeed.mo3513o().getObjectNonceId(), true, p5Var);
    }

    /* renamed from: b */
    public final C55033u mo90221b(FinderCommentInfo finderCommentInfo, long j) {
        C87412m.m108594g(finderCommentInfo, "level1CommentInfo");
        C65426w0 w0Var = new C65426w0();
        w0Var.field_feedId = j;
        w0Var.field_state = 2;
        C64854ye0 ye02 = w0Var.field_actionInfo;
        ye02.f186497e = finderCommentInfo;
        ye02.f186500h = 0;
        return mo90223d(w0Var);
    }

    /* renamed from: c */
    public final C55033u mo90222c(FinderCommentInfo finderCommentInfo, long j, long j2) {
        C87412m.m108594g(finderCommentInfo, "level2CommentInfo");
        C65426w0 w0Var = new C65426w0();
        w0Var.field_feedId = j;
        w0Var.field_state = 2;
        C64854ye0 ye02 = w0Var.field_actionInfo;
        ye02.f186497e = finderCommentInfo;
        ye02.f186500h = j2;
        return mo90223d(w0Var);
    }

    /* renamed from: d */
    public final C55033u mo90223d(C65426w0 w0Var) {
        C87412m.m108594g(w0Var, ImagesContract.LOCAL);
        C55033u uVar = new C55033u(w0Var);
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), uVar.f154492d.getContent());
        return uVar;
    }
}
