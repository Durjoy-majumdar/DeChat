package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFriendLikeLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import er1.C58784w3;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k40.C9562a;
import kf1.C10023w2;
import kf1.C10039x2;
import kf1.C9732g;
import kf1.C9753h;
import kotlin.Metadata;
import p629ny.C76979h;
import rs1.C13442s8;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseGridFeedUI;", "Lkf1/x2;", "Lkf1/w2;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeFeedUI */
public final class FinderFriendLikeFeedUI extends FinderBaseGridFeedUI<C10039x2, C10023w2> {

    /* renamed from: o */
    public final String f14339o = "Finder.FinderFriendLikeFeedUI";

    /* renamed from: p */
    public C10023w2 f14340p;

    /* renamed from: q */
    public C10039x2 f14341q;

    /* renamed from: r */
    public String f14342r;

    /* renamed from: s */
    public String f14343s;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFriendLikeFeedUI$a */
    public static final class C2909a extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFriendLikeLoader f14344d;

        /* renamed from: e */
        public final /* synthetic */ FinderFriendLikeFeedUI f14345e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2909a(FinderFriendLikeLoader finderFriendLikeLoader, FinderFriendLikeFeedUI finderFriendLikeFeedUI) {
            super(1);
            this.f14344d = finderFriendLikeLoader;
            this.f14345e = finderFriendLikeFeedUI;
        }

        public Object invoke(Object obj) {
            TextView textView;
            TextView textView2;
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            if (!((FinderFriendLikeLoader.C2684b) iResponse).getHasMore() && this.f14344d.getDataListJustForAdapter().size() != 0) {
                C10039x2 x2Var = this.f14345e.f14341q;
                View view = null;
                if (x2Var != null) {
                    View loadMoreFooter = x2Var.f30220j.getLoadMoreFooter();
                    if (loadMoreFooter != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C10039x2 x2Var2 = this.f14345e.f14341q;
                    if (x2Var2 != null) {
                        View loadMoreFooter2 = x2Var2.f30220j.getLoadMoreFooter();
                        if (!(loadMoreFooter2 == null || (textView2 = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                            textView2.setText(C0966R.string.eat);
                        }
                        C10039x2 x2Var3 = this.f14345e.f14341q;
                        if (x2Var3 != null) {
                            View loadMoreFooter3 = x2Var3.f30220j.getLoadMoreFooter();
                            if (!(loadMoreFooter3 == null || (textView = (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t)) == null)) {
                                textView.setTextColor(this.f14345e.getResources().getColor(C0966R.color.FG_2));
                            }
                            C10039x2 x2Var4 = this.f14345e.f14341q;
                            if (x2Var4 != null) {
                                View loadMoreFooter4 = x2Var4.f30220j.getLoadMoreFooter();
                                TextView textView3 = loadMoreFooter4 != null ? (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t) : null;
                                if (textView3 != null) {
                                    textView3.setVisibility(8);
                                }
                                C10039x2 x2Var5 = this.f14345e.f14341q;
                                if (x2Var5 != null) {
                                    View loadMoreFooter5 = x2Var5.f30220j.getLoadMoreFooter();
                                    if (loadMoreFooter5 != null) {
                                        view = loadMoreFooter5.findViewById(C0966R.C0970id.g2s);
                                    }
                                    if (view != null) {
                                        C9556a aVar2 = new C9556a();
                                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                        aVar2.mo10233c(0);
                                        View view2 = view;
                                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderFriendLikeFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    }
                                } else {
                                    C87412m.m108603p("viewCallback");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("viewCallback");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: N7 */
    public C9732g mo2960N7() {
        C10023w2 w2Var = this.f14340p;
        if (w2Var != null) {
            return w2Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: O7 */
    public C9753h mo2961O7() {
        C10039x2 x2Var = this.f14341q;
        if (x2Var != null) {
            return x2Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: P7 */
    public void mo2962P7() {
    }

    /* renamed from: Q7 */
    public void mo2963Q7() {
        Class cls = C76979h.class;
        String stringExtra = getIntent().getStringExtra("KEY_USERNAME");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f14342r = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("KEY_NICKNAME");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f14343s = str;
        C58784w3 w3Var = C58784w3.f168295a;
        String R7 = mo2976R7();
        String str2 = this.f14343s;
        if (str2 != null) {
            this.f14343s = C58784w3.m68433S(w3Var, R7, str2, false, 4, (Object) null);
            String str3 = this.f14339o;
            StringBuilder sb = new StringBuilder();
            sb.append("initOnCreate ");
            sb.append(mo2976R7());
            sb.append(", ");
            String str4 = this.f14343s;
            if (str4 != null) {
                sb.append(str4);
                Log.m105924i(str3, sb.toString());
                if (mo2976R7().length() > 0) {
                    C9562a q = C86709a0.m107533q(C75700k0.class);
                    C87412m.m108592e(q, "null cannot be cast to non-null type com.tencent.mm.plugin.messenger.foundation.api.IMessengerStorage");
                    C72996z1 z1Var = ((C75700k0) q).mo96097Ni().get(mo2976R7());
                    String string = getContext().getResources().getString(C0966R.string.dcq);
                    C87412m.m108593f(string, "context.resources.getString(R.string.finder_he)");
                    String string2 = getContext().getResources().getString(C0966R.string.epe);
                    C87412m.m108593f(string2, "context.resources.getString(R.string.finder_she)");
                    if (z1Var != null) {
                        C76979h hVar = (C76979h) C86312j.m106911c(cls);
                        AppCompatActivity context = getContext();
                        Object[] objArr = new Object[1];
                        if (z1Var.f149500H != 1) {
                            string = string2;
                        }
                        objArr[0] = string;
                        setMMTitle((CharSequence) hVar.mo107057T1(context, getString(C0966R.string.fnp, objArr)));
                    } else {
                        setMMTitle((CharSequence) ((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), getString(C0966R.string.fnp, new Object[]{string})));
                    }
                }
                FinderFriendLikeLoader finderFriendLikeLoader = new FinderFriendLikeLoader(mo2976R7(), ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).mo12861q3());
                finderFriendLikeLoader.f13615e = new C2909a(finderFriendLikeLoader, this);
                this.f14340p = new C10023w2(this, 0, 0, finderFriendLikeLoader);
                C10039x2 x2Var = new C10039x2(this, 0, 0, true);
                this.f14341q = x2Var;
                C10023w2 w2Var = this.f14340p;
                if (w2Var != null) {
                    x2Var.f30222o = w2Var;
                    if (Util.isNullOrNil(mo2976R7())) {
                        finish();
                        return;
                    }
                    return;
                }
                C87412m.m108603p("presenter");
                throw null;
            }
            C87412m.m108603p("targetNickname");
            throw null;
        }
        C87412m.m108603p("targetNickname");
        throw null;
    }

    /* renamed from: R7 */
    public final String mo2976R7() {
        String str = this.f14342r;
        if (str != null) {
            return str;
        }
        C87412m.m108603p("targetUsername");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.abz;
    }

    public void onBackPressed() {
        finish();
    }
}
