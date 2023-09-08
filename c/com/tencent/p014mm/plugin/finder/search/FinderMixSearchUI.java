package com.tencent.p014mm.plugin.finder.search;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.C6997a;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import h81.C59774i;
import hp1.C46091u0;
import hp1.C60055x0;
import hp1.C8669i0;
import hp1.C8670j0;
import hp1.C8671k0;
import hp1.C8672l0;
import hp1.C8684r0;
import ht1.C8777j5;
import ip1.C60571a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import pe3.C89349b;
import rs1.C13442s8;
import up1.C37521f;
import vo3.C78461f;
import vo3.C90852c;
import wc1.C15115r;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/search/FinderMixSearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Lcom/tencent/mm/ui/search/FTSEditTextView$j;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "Lcom/tencent/mm/plugin/finder/search/FinderMixSearchPresenter;", "presenter", "Lcom/tencent/mm/plugin/finder/search/FinderMixSearchPresenter;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.search.FinderMixSearchUI */
public final class FinderMixSearchUI extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l, FTSEditTextView.C45049j {

    /* renamed from: v */
    public static final /* synthetic */ int f16598v = 0;

    /* renamed from: o */
    public FTSSearchView f16599o;

    /* renamed from: p */
    public C8684r0 f16600p;
    /* access modifiers changed from: private */
    public FinderMixSearchPresenter presenter;

    /* renamed from: q */
    public C46091u0 f16601q;

    /* renamed from: r */
    public C60055x0 f16602r;

    /* renamed from: s */
    public boolean f16603s;

    /* renamed from: t */
    public int f16604t;

    /* renamed from: u */
    public final C3575a f16605u = new C3575a();

    /* renamed from: com.tencent.mm.plugin.finder.search.FinderMixSearchUI$a */
    public static final class C3575a extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderMixSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/search/FinderMixSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "temp_4", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/search/FinderMixSearchUI$mOnScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z) {
            String str = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb() + ',' + 1;
            Log.m105924i("Finder.FinderSearchReportLogic", "report19184 " + str);
            C117407d.INSTANCE.kvStat(19184, str);
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 23;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 3;
    }

    /* renamed from: L2 */
    public boolean mo3920L2(View view) {
        mo3921O7();
        return false;
    }

    /* renamed from: O7 */
    public final boolean mo3921O7() {
        String str;
        hideVKB();
        FTSSearchView fTSSearchView = this.f16599o;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            if (Util.isNullOrNil(str)) {
                return true;
            }
            FinderMixSearchPresenter finderMixSearchPresenter = this.presenter;
            if (finderMixSearchPresenter != null) {
                finderMixSearchPresenter.mo3919x(str, 1, false, (C89349b) null, this.f16604t);
                C46091u0 u0Var = this.f16601q;
                if (u0Var != null) {
                    u0Var.mo71529c(str);
                    Object[] objArr = new Object[1];
                    C46091u0 u0Var2 = this.f16601q;
                    if (u0Var2 != null) {
                        objArr[0] = Integer.valueOf(u0Var2.f124250b.getCount());
                        Log.m105919d("Finder.FinderMixSearchUI", "onActionDone historySize：%s", objArr);
                        C46091u0 u0Var3 = this.f16601q;
                        if (u0Var3 != null) {
                            if (u0Var3.f124250b.getCount() > 1) {
                                FTSSearchView fTSSearchView2 = this.f16599o;
                                if (fTSSearchView2 != null) {
                                    fTSSearchView2.setCancelBtnVisible(0);
                                } else {
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                            } else {
                                FTSSearchView fTSSearchView3 = this.f16599o;
                                if (fTSSearchView3 != null) {
                                    fTSSearchView3.setCancelBtnVisible(8);
                                } else {
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                            }
                            C60055x0 x0Var = this.f16602r;
                            if (x0Var != null) {
                                x0Var.mo84916b();
                                return true;
                            }
                            C87412m.m108603p("searchSuggestionManager");
                            throw null;
                        }
                        C87412m.m108603p("historyLogic");
                        throw null;
                    }
                    C87412m.m108603p("historyLogic");
                    throw null;
                }
                C87412m.m108603p("historyLogic");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        C46091u0 u0Var = this.f16601q;
        if (u0Var != null) {
            u0Var.mo71528b(str3);
            C8684r0 r0Var = this.f16600p;
            if (r0Var == null) {
                C87412m.m108603p("viewCallback");
                throw null;
            } else if (Util.isNullOrNil(str3)) {
                r0Var.f27884j.setVisibility(8);
                View view = r0Var.f27885n;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view2 = r0Var.f27888q;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onTextChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            C87412m.m108603p("historyLogic");
            throw null;
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onClickBackBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickCancelBtn(View view) {
        hideVKB();
        finish();
    }

    public void onClickClearTextBtn(View view) {
        FTSSearchView fTSSearchView = this.f16599o;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70355k();
            showVKB();
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        C37521f.f99374d.getClass();
        this.f16603s = C37521f.f99502r4.mo60266n().intValue() == 1;
        this.f16604t = getIntent().getIntExtra("request_type", 0);
        String stringExtra = getIntent().getStringExtra("key_click_sub_tab_context_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            ((C13442s8) C39818r.f106831a.mo62444c(this).mo75002a(C13442s8.class)).f38102q = stringExtra;
        }
        FTSSearchView fTSSearchView = this.f16604t == 13 ? new FTSSearchView((Context) this, false, true) : new FTSSearchView((Context) this, false);
        this.f16599o = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f16599o;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
            FTSSearchView fTSSearchView3 = this.f16599o;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f16599o;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f16599o;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().setActionSearchDoneListener(this);
                        if (this.f16603s) {
                            int i = this.f16604t == 13 ? C0966R.color.f2947a4 : C0966R.color.BW_93;
                            FTSSearchView fTSSearchView6 = this.f16599o;
                            if (fTSSearchView6 != null) {
                                View findViewById = fTSSearchView6.findViewById(C0966R.C0970id.f357484a32);
                                fTSSearchView6.f24722e = findViewById;
                                findViewById.setOnClickListener(new C6997a(fTSSearchView6));
                                View view = fTSSearchView6.f24722e;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/search/FTSSearchView", "initHotSearch", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/ui/search/FTSSearchView", "initHotSearch", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                fTSSearchView6.f24721d.setVisibility(8);
                                fTSSearchView6.f24723f.setBackgroundColor(fTSSearchView6.getResources().getColor(i));
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) fTSSearchView6.f24725h.getLayoutParams();
                                layoutParams.width = -2;
                                layoutParams.setMarginEnd((int) fTSSearchView6.getResources().getDimension(C0966R.dimen.f3736cp));
                                fTSSearchView6.f24725h.setLayoutParams(layoutParams);
                            } else {
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                        }
                        FTSSearchView fTSSearchView7 = this.f16599o;
                        if (fTSSearchView7 != null) {
                            fTSSearchView7.getFtsEditText().mo70355k();
                            FTSSearchView fTSSearchView8 = this.f16599o;
                            if (fTSSearchView8 != null) {
                                fTSSearchView8.getFtsEditText().mo70361q();
                                FTSSearchView fTSSearchView9 = this.f16599o;
                                if (fTSSearchView9 != null) {
                                    fTSSearchView9.getFtsEditText().mo70338f();
                                    ActionBar supportActionBar = getSupportActionBar();
                                    C87412m.m108591d(supportActionBar);
                                    FTSSearchView fTSSearchView10 = this.f16599o;
                                    if (fTSSearchView10 != null) {
                                        supportActionBar.mo91114y(fTSSearchView10);
                                        this.f16601q = new C46091u0(this, false, this.f16604t == 13, new C8669i0(this), new C8670j0());
                                        FinderMixSearchPresenter finderMixSearchPresenter = new FinderMixSearchPresenter(this, this.f16604t);
                                        this.presenter = finderMixSearchPresenter;
                                        C8684r0 r0Var = new C8684r0(this, finderMixSearchPresenter, this.f16604t);
                                        this.f16600p = r0Var;
                                        FinderMixSearchPresenter finderMixSearchPresenter2 = this.presenter;
                                        if (finderMixSearchPresenter2 != null) {
                                            finderMixSearchPresenter2.f16589v = r0Var;
                                            finderMixSearchPresenter2.f16590w.alive();
                                            C39818r rVar = C39818r.f106831a;
                                            AppCompatActivity context = getContext();
                                            C87412m.m108593f(context, "context");
                                            C60571a aVar2 = (C60571a) rVar.mo62444c(context).mo62449e(C60571a.class);
                                            if (aVar2 != null) {
                                                FinderMixSearchPresenter finderMixSearchPresenter3 = this.presenter;
                                                if (finderMixSearchPresenter3 != null) {
                                                    aVar2.f172650x = finderMixSearchPresenter3;
                                                    if (this.f16600p == null) {
                                                        C87412m.m108603p("viewCallback");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("presenter");
                                                    throw null;
                                                }
                                            }
                                            C8684r0 r0Var2 = this.f16600p;
                                            if (r0Var2 != null) {
                                                r0Var2.f27888q.setOnTouchListener(new C8671k0(this));
                                                FTSSearchView fTSSearchView11 = this.f16599o;
                                                if (fTSSearchView11 != null) {
                                                    FTSEditTextView ftsEditText = fTSSearchView11.getFtsEditText();
                                                    C87412m.m108593f(ftsEditText, "searchView.ftsEditText");
                                                    int i2 = this.f16604t;
                                                    C60055x0 x0Var = r0;
                                                    String str = "context";
                                                    C60055x0 x0Var2 = new C60055x0(this, ftsEditText, i2, 1, false, i2 == 13, new C8672l0(this));
                                                    this.f16602r = x0Var;
                                                    if (this.f16604t == 13) {
                                                        getController().mo177081j0(getContext().getResources().getColor(C0966R.color.f2947a4));
                                                        setBackGroundColorResource(C0966R.color.f2947a4);
                                                        C78461f bounceView = getBounceView();
                                                        if (bounceView != null) {
                                                            bounceView.setStart2EndBgColor(getContext().getResources().getColor(C0966R.color.f2947a4));
                                                        }
                                                        C78461f bounceView2 = getBounceView();
                                                        if (bounceView2 != null) {
                                                            bounceView2.setEnd2StartBgColor(getContext().getResources().getColor(C0966R.color.f2947a4));
                                                        }
                                                    }
                                                    C46091u0 u0Var = this.f16601q;
                                                    if (u0Var != null) {
                                                        u0Var.f124249a.setVisibility(0);
                                                        C8684r0 r0Var3 = this.f16600p;
                                                        if (r0Var3 != null) {
                                                            RecyclerView recyclerView = r0Var3.f27889r;
                                                            if (recyclerView != null) {
                                                                recyclerView.mo17043c(this.f16605u);
                                                            }
                                                            C8684r0 r0Var4 = this.f16600p;
                                                            if (r0Var4 != null) {
                                                                RecyclerView recyclerView2 = r0Var4.f27890s;
                                                                if (recyclerView2 != null) {
                                                                    recyclerView2.mo17043c(this.f16605u);
                                                                }
                                                                if (!this.f16603s) {
                                                                    Class cls2 = C58417y0.class;
                                                                    ((C58417y0) C86312j.m106911c(cls2)).f167351e = String.valueOf(C31543z5.m39453c());
                                                                    String uuid = UUID.randomUUID().toString();
                                                                    C87412m.m108593f(uuid, "randomUUID().toString()");
                                                                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls2);
                                                                    String str2 = ((C58417y0) C86312j.m106911c(cls2)).f167351e;
                                                                    C13442s8.C13443a aVar3 = C13442s8.f38060Q0;
                                                                    AppCompatActivity context2 = getContext();
                                                                    C87412m.m108593f(context2, str);
                                                                    C13442s8 f = aVar3.mo12873f(context2);
                                                                    y0Var.ay0(1, str2, uuid, "", 1, 1, 1, 0, 0, f != null ? f.mo12861q3() : null);
                                                                }
                                                                if (getIntent().getIntExtra("request_type", 0) == 13) {
                                                                    ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderMixSearchUI_Live").mo86178qr(this, C11345b.FinderMixSearchUI_Live).mo86179qs(this, C76986a.FinderLive);
                                                                } else {
                                                                    ((C61212e) C86312j.m106911c(cls)).mo86136FZ(this, "FinderMixSearchUI_Finder").mo86178qr(this, C11345b.FinderMixSearchUI_Finder).mo86179qs(this, C76986a.Finder);
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
                                                        C87412m.m108603p("historyLogic");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("searchView");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("viewCallback");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("presenter");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("searchView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("searchView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("searchView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("searchView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("searchView");
                    throw null;
                }
            } else {
                C87412m.m108603p("searchView");
                throw null;
            }
        } else {
            C87412m.m108603p("searchView");
            throw null;
        }
    }

    public void onDestroy() {
        C46091u0 u0Var = this.f16601q;
        if (u0Var != null) {
            u0Var.mo71527a();
            FinderMixSearchPresenter finderMixSearchPresenter = this.presenter;
            if (finderMixSearchPresenter != null) {
                finderMixSearchPresenter.onDetach();
                hideVKB();
                C8684r0 r0Var = this.f16600p;
                if (r0Var != null) {
                    RecyclerView recyclerView = r0Var.f27889r;
                    if (recyclerView != null) {
                        recyclerView.mo17098m1(this.f16605u);
                    }
                    C8684r0 r0Var2 = this.f16600p;
                    if (r0Var2 != null) {
                        RecyclerView recyclerView2 = r0Var2.f27890s;
                        if (recyclerView2 != null) {
                            recyclerView2.mo17098m1(this.f16605u);
                        }
                        if (!this.f16603s) {
                            ((C58417y0) C86312j.m106911c(C58417y0.class)).f167351e = "";
                        }
                        super.onDestroy();
                        return;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("historyLogic");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "temp_4", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
        C60055x0 x0Var = this.f16602r;
        if (x0Var != null) {
            C86709a0.m107524d().mo123470p(6200, x0Var);
        } else {
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, "temp_4", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
        C60055x0 x0Var = this.f16602r;
        if (x0Var != null) {
            C86709a0.m107524d().mo123455a(6200, x0Var);
        } else {
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C15115r.class);
        hashSet.add(C60571a.class);
    }

    /* renamed from: y */
    public boolean mo3009y() {
        mo3921O7();
        return true;
    }
}
