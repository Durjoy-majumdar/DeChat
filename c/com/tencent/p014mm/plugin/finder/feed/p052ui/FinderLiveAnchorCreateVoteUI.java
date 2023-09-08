package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import hp3.C87581a;
import j20.C117292a;
import java.util.Set;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76912y0;
import nj3.C88989a;
import nr3.C89059e;
import ob0.C89132b;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C22415w0;
import te3.C50621o11;
import te3.C50934qa1;
import ws1.C15593c;
import ys1.C16065a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCreateVoteUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI */
public final class FinderLiveAnchorCreateVoteUI extends MMFinderUI {

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI$a */
    public static final class C2955a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorCreateVoteUI f14483d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI$a$a */
        public static final class C2956a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ FinderLiveAnchorCreateVoteUI f14484a;

            /* renamed from: b */
            public final /* synthetic */ String f14485b;

            public C2956a(FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI, String str) {
                this.f14484a = finderLiveAnchorCreateVoteUI;
                this.f14485b = str;
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    Intent intent = new Intent();
                    intent.setClass(this.f14484a.getContext(), FinderLiveVoteHistoryUI.class);
                    C50934qa1 qa12 = new C50934qa1();
                    C50621o11 o112 = (C50621o11) cVar.f256796d;
                    qa12.f140205d = o112.f138900d;
                    qa12.f140207f = o112.f138902f;
                    qa12.f140206e = o112.f138901e;
                    intent.putExtra("finderlivehistoryparamvotinginfo", qa12.toByteArray());
                    intent.putExtra("finderlivedetailparamusername", this.f14485b);
                    AppCompatActivity context = this.f14484a.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    AppCompatActivity appCompatActivity = context;
                    C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCreateVoteUI$onCreate$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCreateVoteUI$onCreate$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    C76912y0.m92767f(this.f14484a.getContext(), this.f14484a.getContext().getResources().getString(C0966R.string.ms9));
                }
                return C13598b0.f38549a;
            }
        }

        public C2955a(FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI) {
            this.f14483d = finderLiveAnchorCreateVoteUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            String stringExtra = this.f14483d.getIntent().getStringExtra("finderlivecreateparamusername");
            C89059e i = new C15593c(stringExtra, (C89349b) null).mo9225i();
            i.mo123420E(new C2956a(this.f14483d, stringExtra));
            i.mo11397F(this.f14483d);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI$b */
    public static final class C2957b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorCreateVoteUI f14486d;

        public C2957b(FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI) {
            this.f14486d = finderLiveAnchorCreateVoteUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14486d.hideVKB();
            this.f14486d.finish();
            this.f14486d.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2493eh);
            return true;
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C22415w0.m26092a(C16065a.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int color = getResources().getColor(C0966R.color.f2929c);
        setNavigationbarColor(color);
        setActionbarColor(color);
        getWindow().setStatusBarColor(color);
        setMMTitle(getResources().getString(C0966R.string.mss));
        setMMTitleColor(getResources().getColor(C0966R.color.FG_0));
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.f2927a));
        setBackBtn(new C2957b(this), C0966R.raw.icons_filled_close);
        addTextOptionMenu(0, getResources().getString(C0966R.string.msh), new C2955a(this));
    }
}
