package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.os.SystemClock;
import cm1.C0730f2;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.HeadFooterLayout;
import f40.C86709a0;
import fo1.C59264a;
import fo1.C8178c;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.regex.Pattern;
import je1.C9326j3;
import je1.C9358o4;
import kotlin.Metadata;
import lp3.C88643g;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import pe1.C35464c;
import pe3.C47465a;
import te3.C49307en0;
import te3.C49447fn0;
import up1.C37521f;
import vp1.C14942q;

@Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowTopicListContract;", "", "()V", "FollowTopicPresenter", "FollowTopicViewCallback", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowTopicListContract */
public final class FinderFollowTopicListContract {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowTopicListContract$FollowTopicPresenter;", "Lfo1/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowTopicListContract$FollowTopicViewCallback;", "Lob0/n;", "<init>", "()V", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowTopicListContract$FollowTopicPresenter */
    public static final class FollowTopicPresenter implements C59264a<FollowTopicViewCallback>, C11385n {

        /* renamed from: g */
        public static final String f15966g = "topicFollowList.fp";

        /* renamed from: d */
        public final C14942q f15967d = new C14942q(f15966g);

        /* renamed from: e */
        public final ArrayList<C0730f2> f15968e = new ArrayList<>();

        /* renamed from: f */
        public long f15969f = SystemClock.uptimeMillis();

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowTopicListContract$FollowTopicPresenter$Companion;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowTopicListContract$FollowTopicPresenter$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        static {
            new Companion((C8480h) null);
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("errType ");
            sb.append(i);
            sb.append(", errCode ");
            sb.append(i2);
            sb.append(", errMsg ");
            sb.append(str);
            sb.append(" scene type ");
            sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
            Log.m105924i("Finder.FollowTopicPresenter", sb.toString());
            Integer valueOf = yVar != null ? Integer.valueOf(yVar.getType()) : null;
            if (valueOf != null && valueOf.intValue() == 712) {
                C8479f0 f0Var = new C8479f0();
                if (i == 0 && i2 == 0) {
                    C8477a0 a0Var = new C8477a0();
                    C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderGetFollowTopicList");
                    C9326j3 j3Var = (C9326j3) yVar;
                    C47465a aVar = j3Var.f29138g.f127055a.f127080a;
                    C49307en0 en02 = aVar instanceof C49307en0 ? (C49307en0) aVar : null;
                    if (!C87412m.m108589b((Object) null, en02 != null ? en02.f133021d : null)) {
                        Log.m105924i("Finder.FollowTopicPresenter", "not my buf, ignore!");
                        return;
                    }
                    a0Var.f27482d = true;
                    Pattern pattern = C61926c.f176038a;
                    C61926c.m72701z(C88643g.m110546d(), new C3384xe7e51b26(this, yVar));
                    C85801v1 i3 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_FINDER_TOPIC_FOLLOW_COUNT_INT_SYNC;
                    C47465a aVar3 = j3Var.f29138g.f127056b.f127083a;
                    C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowTopicListResponse");
                    i3.mo119677K(aVar2, Integer.valueOf(((C49447fn0) aVar3).f133594e));
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                long uptimeMillis = SystemClock.uptimeMillis() - this.f15969f;
                C37521f.f99374d.getClass();
                C35464c<Long> cVar = C37521f.f99343Z1;
                C61926c.m72666K(uptimeMillis >= cVar.mo60266n().longValue() ? 0 : cVar.mo60266n().longValue() - uptimeMillis, new FinderFollowTopicListContract$FollowTopicPresenter$onSceneEnd$3(f0Var));
            } else if (valueOf != null && valueOf.intValue() == 3844 && i == 0 && i2 == 0) {
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderTopicFollow");
                ((C9358o4) yVar).getClass();
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowTopicListContract$FollowTopicViewCallback;", "Lfo1/c;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowTopicListContract$FollowTopicPresenter;", "Lcom/tencent/mm/view/HeadFooterLayout$a;", "Companion", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowTopicListContract$FollowTopicViewCallback */
    public static final class FollowTopicViewCallback implements C8178c<FollowTopicPresenter>, HeadFooterLayout.C57874a {

        /* renamed from: d */
        public static final /* synthetic */ int f15970d = 0;

        @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderFollowTopicListContract$FollowTopicViewCallback$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
        /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowTopicListContract$FollowTopicViewCallback$Companion */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C8480h hVar) {
                this();
            }
        }

        static {
            new Companion((C8480h) null);
        }

        public /* bridge */ /* synthetic */ MMFragmentActivity getActivity() {
            return null;
        }

        /* renamed from: p */
        public boolean mo3718p(int i, int i2, int i3, boolean z, boolean z2) {
            return false;
        }

        /* renamed from: v */
        public boolean mo3719v(int i, int i2, int i3, boolean z, boolean z2) {
            return false;
        }

        /* renamed from: x */
        public void mo3720x(int i) {
        }
    }
}
