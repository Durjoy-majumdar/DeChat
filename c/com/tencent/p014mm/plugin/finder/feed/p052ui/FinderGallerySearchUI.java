package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.TouchableLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hp1.C46091u0;
import hp1.C60055x0;
import hp1.C8703w0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import je1.C9320i4;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import kotlin.Metadata;
import ob0.C11385n;
import ob0.C117747y;
import p192l4.C10462b;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import te3.C48727ak1;
import te3.C49572gk1;
import vf1.C65687a0;
import vf1.C65689b0;
import vf1.C65692c0;
import vf1.C65694d0;
import vf1.C65695e0;
import vf1.C65696f0;
import vf1.C65740y;
import vf1.C65742z;
import vp1.C65838f;
import wp1.C15585f;
import ye1.C15976o;
import ye1.C66633p;
import z04.C112550d0;
import zf1.C66792b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/search/FTSSearchView$e;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Lob0/n;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClickBackBtn", "onClickCancelBtn", "onClickClearTextBtn", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI */
public final class FinderGallerySearchUI extends MMFinderUI implements FTSSearchView.C6995e, FTSEditTextView.C45051l, C11385n {

    /* renamed from: A */
    public RecyclerView f158873A;

    /* renamed from: B */
    public TextView f158874B;

    /* renamed from: C */
    public View f158875C;

    /* renamed from: D */
    public C46091u0 f158876D;

    /* renamed from: E */
    public C60055x0 f158877E;

    /* renamed from: F */
    public final C13601g f158878F = C36568h.m40985a(new C55804b(this));

    /* renamed from: G */
    public final C13601g f158879G = C36568h.m40985a(new C55803a(this));

    /* renamed from: H */
    public final int f158880H = 10000;

    /* renamed from: I */
    public C9320i4 f158881I;

    /* renamed from: o */
    public final String f158882o = "Finder.FinderGallerySearchUI";

    /* renamed from: p */
    public C66792b f158883p;

    /* renamed from: q */
    public FTSSearchView f158884q;

    /* renamed from: r */
    public String f158885r = "";

    /* renamed from: s */
    public int f158886s;

    /* renamed from: t */
    public int f158887t;

    /* renamed from: u */
    public C89349b f158888u;

    /* renamed from: v */
    public ArrayList<C0740i2> f158889v = new ArrayList<>();

    /* renamed from: w */
    public String f158890w = "";

    /* renamed from: x */
    public int f158891x = 1;

    /* renamed from: y */
    public boolean f158892y;

    /* renamed from: z */
    public RefreshLoadMoreLayout f158893z;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI$a */
    public static final class C55803a extends C87413o implements C32224a<C15976o> {

        /* renamed from: d */
        public final /* synthetic */ FinderGallerySearchUI f158894d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55803a(FinderGallerySearchUI finderGallerySearchUI) {
            super(0);
            this.f158894d = finderGallerySearchUI;
        }

        public Object invoke() {
            return C15976o.m14888a(this.f158894d.findViewById(C0966R.C0970id.egf));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI$b */
    public static final class C55804b extends C87413o implements C32224a<C66633p> {

        /* renamed from: d */
        public final /* synthetic */ FinderGallerySearchUI f158895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55804b(FinderGallerySearchUI finderGallerySearchUI) {
            super(0);
            this.f158895d = finderGallerySearchUI;
        }

        public Object invoke() {
            View findViewById = this.f158895d.findViewById(C0966R.C0970id.kzk);
            int i = C0966R.C0970id.ewk;
            ListView listView = (ListView) C10462b.m10395a(findViewById, C0966R.C0970id.ewk);
            if (listView != null) {
                i = C0966R.C0970id.g3e;
                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.g3e);
                if (linearLayout != null) {
                    i = C0966R.C0970id.gkz;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(findViewById, C0966R.C0970id.gkz);
                    if (coordinatorLayout != null) {
                        i = C0966R.C0970id.hgr;
                        TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.hgr);
                        if (textView != null) {
                            i = C0966R.C0970id.iiq;
                            RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.iiq);
                            if (recyclerView != null) {
                                i = C0966R.C0970id.ivb;
                                RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                                if (refreshLoadMoreLayout != null) {
                                    i = C0966R.C0970id.j5s;
                                    TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.j5s);
                                    if (textView2 != null) {
                                        i = C0966R.C0970id.k_t;
                                        ListView listView2 = (ListView) C10462b.m10395a(findViewById, C0966R.C0970id.k_t);
                                        if (listView2 != null) {
                                            TouchableLayout touchableLayout = (TouchableLayout) findViewById;
                                            return new C66633p(touchableLayout, listView, linearLayout, coordinatorLayout, textView, recyclerView, refreshLoadMoreLayout, textView2, listView2, touchableLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI$c */
    public static final class C55805c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f158896d;

        /* renamed from: e */
        public final /* synthetic */ FinderGallerySearchUI f158897e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f158898f;

        /* renamed from: g */
        public final /* synthetic */ boolean f158899g;

        public C55805c(C8478d0 d0Var, FinderGallerySearchUI finderGallerySearchUI, C8478d0 d0Var2, boolean z) {
            this.f158896d = d0Var;
            this.f158897e = finderGallerySearchUI;
            this.f158898f = d0Var2;
            this.f158899g = z;
        }

        public final void run() {
            int i = this.f158896d.f27483d;
            if (i != 0) {
                boolean z = true;
                RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(1);
                FinderGallerySearchUI finderGallerySearchUI = this.f158897e;
                cVar.f24951f = finderGallerySearchUI.f158887t != 0;
                int i2 = this.f158898f.f27483d;
                if (i2 - i > 0) {
                    z = false;
                }
                cVar.f24952g = z;
                cVar.f24953h = i2 - i;
                RefreshLoadMoreLayout refreshLoadMoreLayout = finderGallerySearchUI.f158893z;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            } else {
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f158897e.f158893z;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.mo82440F(this.f158898f.f27483d);
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            }
            if (!this.f158899g) {
                RecyclerView recyclerView = this.f158897e.f158873A;
                if (recyclerView != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    RecyclerView recyclerView2 = recyclerView;
                    C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$onSceneEnd$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI$onSceneEnd$2", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
    }

    /* renamed from: O7 */
    public static void m63545O7(FinderGallerySearchUI finderGallerySearchUI, String str, C89349b bVar, int i, Object obj) {
        FinderGallerySearchUI finderGallerySearchUI2 = finderGallerySearchUI;
        String str2 = str;
        C89349b bVar2 = (i & 2) != 0 ? null : bVar;
        String str3 = finderGallerySearchUI2.f158882o;
        Log.m105924i(str3, "startSearch query:" + str2);
        finderGallerySearchUI2.f158885r = str2;
        finderGallerySearchUI2.f158886s = 0;
        finderGallerySearchUI2.f158887t = 0;
        finderGallerySearchUI2.f158888u = null;
        finderGallerySearchUI2.f158889v.clear();
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        finderGallerySearchUI2.f158890w = uuid;
        RefreshLoadMoreLayout refreshLoadMoreLayout = finderGallerySearchUI2.f158893z;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setHasBottomMore(true);
            if (finderGallerySearchUI2.f158881I != null) {
                C86709a0.m107524d().mo123458d(finderGallerySearchUI2.f158881I);
            }
            int i2 = finderGallerySearchUI.mo77408N7().f191893a.f191889b;
            C9320i4 i4Var = r1;
            C9320i4 i4Var2 = new C9320i4(str, finderGallerySearchUI2.f158886s, finderGallerySearchUI2.f158890w, finderGallerySearchUI2.f158888u, i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 24 : 16 : 15, ((C13442s8) C39818r.f106831a.mo62444c(finderGallerySearchUI2).mo75002a(C13442s8.class)).mo12861q3(), bVar2, (C89349b) null, (C89349b) null, false, 0, 1920, (C8480h) null);
            finderGallerySearchUI2.f158881I = i4Var;
            i4Var.f29121r = finderGallerySearchUI2.f158891x;
            C86709a0.m107524d().mo123460f(finderGallerySearchUI2.f158881I);
            C86709a0.m107524d().mo123455a(3820, finderGallerySearchUI2);
            View view = finderGallerySearchUI2.f158875C;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "startSearch", "(Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "startSearch", "(Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = finderGallerySearchUI2.f158874B;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderGallerySearchUI2.f158893z;
                    if (refreshLoadMoreLayout2 != null) {
                        refreshLoadMoreLayout2.setVisibility(8);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("noResultView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingView");
                throw null;
            }
        } else {
            C87412m.m108603p("rlLayout");
            throw null;
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

    /* renamed from: N7 */
    public final C66792b mo77408N7() {
        C66792b bVar = this.f158883p;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("galleryConfig");
        throw null;
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        if (Util.isNullOrNil(str3)) {
            View view = this.f158875C;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onEditTextChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/tencent/mm/ui/search/FTSEditTextView$TextChangeStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f158874B;
                if (textView != null) {
                    textView.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f158893z;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(8);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("noResultView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingView");
                throw null;
            }
        }
        C46091u0 u0Var = this.f158876D;
        if (u0Var != null) {
            u0Var.mo71528b(str3);
        } else {
            C87412m.m108603p("historyLogic");
            throw null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.acf;
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo77408N7().mo77484i(this, i, i2, intent, C66792b.C66794b.SEARCH);
    }

    public void onBackPressed() {
        finish();
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
        FTSSearchView fTSSearchView = this.f158884q;
        if (fTSSearchView != null) {
            fTSSearchView.getFtsEditText().mo70355k();
            showVKB();
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f158883p = C66792b.f191892b.mo90791a(getIntent());
        this.f158892y = mo77408N7().mo77478c();
        FTSSearchView fTSSearchView = new FTSSearchView((Context) this, false);
        this.f158884q = fTSSearchView;
        fTSSearchView.setSearchViewListener(this);
        FTSSearchView fTSSearchView2 = this.f158884q;
        if (fTSSearchView2 != null) {
            fTSSearchView2.getFtsEditText().setHint(getString(C0966R.string.a2p));
            FTSSearchView fTSSearchView3 = this.f158884q;
            if (fTSSearchView3 != null) {
                fTSSearchView3.getFtsEditText().setFtsEditTextListener(this);
                FTSSearchView fTSSearchView4 = this.f158884q;
                if (fTSSearchView4 != null) {
                    fTSSearchView4.getFtsEditText().setCanDeleteTag(false);
                    FTSSearchView fTSSearchView5 = this.f158884q;
                    if (fTSSearchView5 != null) {
                        fTSSearchView5.getFtsEditText().mo70338f();
                        if (this.f158892y) {
                            FTSSearchView fTSSearchView6 = this.f158884q;
                            if (fTSSearchView6 != null) {
                                View findViewById = fTSSearchView6.findViewById(C0966R.C0970id.apy);
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view = findViewById;
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "initSearchView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                FTSSearchView fTSSearchView7 = this.f158884q;
                                if (fTSSearchView7 != null) {
                                    fTSSearchView7.getSearchContainer().setBackground((Drawable) null);
                                    int color = getResources().getColor(C0966R.color.f3584yh);
                                    FTSSearchView fTSSearchView8 = this.f158884q;
                                    if (fTSSearchView8 != null) {
                                        fTSSearchView8.getFtsEditText().getEditText().setTextColor(color);
                                        FTSSearchView fTSSearchView9 = this.f158884q;
                                        if (fTSSearchView9 != null) {
                                            fTSSearchView9.getSearchIcon().setIconColor(color);
                                            FTSSearchView fTSSearchView10 = this.f158884q;
                                            if (fTSSearchView10 != null) {
                                                fTSSearchView10.getFtsEditText().getClearBtn().getDrawable().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                                                FTSSearchView fTSSearchView11 = this.f158884q;
                                                if (fTSSearchView11 != null) {
                                                    fTSSearchView11.setBackgroundColor(getResources().getColor(C0966R.color.f3493v5));
                                                    setActionbarColor(getResources().getColor(C0966R.color.f3493v5));
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
                        ActionBar supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            FTSSearchView fTSSearchView12 = this.f158884q;
                            if (fTSSearchView12 != null) {
                                supportActionBar.mo91114y(fTSSearchView12);
                            } else {
                                C87412m.m108603p("searchView");
                                throw null;
                            }
                        }
                        ((C15976o) ((C36570n) this.f158879G).getValue()).f42961e.setVisibility(8);
                        FTSSearchView fTSSearchView13 = this.f158884q;
                        if (fTSSearchView13 != null) {
                            WeImageView weImageView = (WeImageView) fTSSearchView13.findViewById(C0966R.C0970id.f357484a32);
                            if (weImageView != null) {
                                weImageView.setVisibility(0);
                                if (this.f158892y) {
                                    weImageView.setIconColor(getResources().getColor(C0966R.color.f3584yh));
                                }
                                weImageView.setOnClickListener(new C65694d0(this));
                            }
                            C8703w0.f27930d.clear();
                            String uuid = UUID.randomUUID().toString();
                            C87412m.m108593f(uuid, "randomUUID().toString()");
                            this.f158890w = uuid;
                            this.f158885r = "";
                            FTSSearchView fTSSearchView14 = this.f158884q;
                            if (fTSSearchView14 != null) {
                                fTSSearchView14.getFtsEditText().mo70355k();
                                FTSSearchView fTSSearchView15 = this.f158884q;
                                if (fTSSearchView15 != null) {
                                    fTSSearchView15.getFtsEditText().mo70361q();
                                    this.f158876D = new C46091u0(this, this.f158892y, new C65692c0(this));
                                    FTSSearchView fTSSearchView16 = this.f158884q;
                                    if (fTSSearchView16 != null) {
                                        FTSEditTextView ftsEditText = fTSSearchView16.getFtsEditText();
                                        C87412m.m108593f(ftsEditText, "searchView.ftsEditText");
                                        C60055x0 x0Var = new C60055x0(this, ftsEditText, 0, 3, this.f158892y, false, new C65695e0(this));
                                        this.f158877E = x0Var;
                                        x0Var.f171401t = new C65696f0(this);
                                        View findViewById2 = getContext().findViewById(C0966R.C0970id.ivb);
                                        C87412m.m108593f(findViewById2, "context.findViewById(R.id.rl_layout)");
                                        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById2;
                                        this.f158893z = refreshLoadMoreLayout;
                                        this.f158873A = refreshLoadMoreLayout.getRecyclerView();
                                        View findViewById3 = getContext().findViewById(C0966R.C0970id.hgr);
                                        C87412m.m108593f(findViewById3, "context.findViewById(R.id.no_result_tv)");
                                        this.f158874B = (TextView) findViewById3;
                                        View findViewById4 = getContext().findViewById(C0966R.C0970id.g3e);
                                        C87412m.m108593f(findViewById4, "context.findViewById(R.id.loading_layout)");
                                        this.f158875C = findViewById4;
                                        RecyclerView recyclerView = this.f158873A;
                                        if (recyclerView != null) {
                                            recyclerView.setLayoutManager(mo77408N7().mo77480e(this, this.f158880H));
                                            RecyclerView recyclerView2 = this.f158873A;
                                            if (recyclerView2 != null) {
                                                recyclerView2.mo17085h0(mo77408N7().mo77479d(this.f158880H));
                                                WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(mo77408N7().mo77476a(this.f158880H), this.f158889v, true);
                                                wxRecyclerAdapter.f173488o = new C65740y(this);
                                                wxRecyclerAdapter.f165737C = new C65742z(this);
                                                RecyclerView recyclerView3 = this.f158873A;
                                                if (recyclerView3 != null) {
                                                    recyclerView3.setAdapter(wxRecyclerAdapter);
                                                    View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                                                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f158893z;
                                                    if (refreshLoadMoreLayout2 != null) {
                                                        C87412m.m108593f(inflate, "loadmoreFooter");
                                                        refreshLoadMoreLayout2.setLoadMoreFooter(inflate);
                                                        if (!this.f158892y) {
                                                            TextView textView = this.f158874B;
                                                            if (textView != null) {
                                                                textView.setTextColor(getResources().getColor(C0966R.color.f3563xt));
                                                            } else {
                                                                C87412m.m108603p("noResultView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            TextView textView2 = this.f158874B;
                                                            if (textView2 != null) {
                                                                textView2.setTextColor(getResources().getColor(C0966R.color.f3572y4));
                                                                ((C66633p) ((C36570n) this.f158878F).getValue()).f191602a.setBackgroundColor(getResources().getColor(C0966R.color.f3493v5));
                                                                TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.g2t);
                                                                if (textView3 != null) {
                                                                    textView3.setTextColor(getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                                                                }
                                                            } else {
                                                                C87412m.m108603p("noResultView");
                                                                throw null;
                                                            }
                                                        }
                                                        RecyclerView recyclerView4 = this.f158873A;
                                                        if (recyclerView4 != null) {
                                                            recyclerView4.setOnTouchListener(new C65687a0(this));
                                                            RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f158893z;
                                                            if (refreshLoadMoreLayout3 != null) {
                                                                refreshLoadMoreLayout3.setEnablePullDownHeader(false);
                                                                RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f158893z;
                                                                if (refreshLoadMoreLayout4 != null) {
                                                                    refreshLoadMoreLayout4.setActionCallback(new C65689b0(this));
                                                                    String str = this.f158885r;
                                                                    if (str != null) {
                                                                        C60055x0 x0Var2 = this.f158877E;
                                                                        if (x0Var2 != null) {
                                                                            x0Var2.f171399r = str;
                                                                            FTSSearchView fTSSearchView17 = this.f158884q;
                                                                            if (fTSSearchView17 != null) {
                                                                                fTSSearchView17.getFtsEditText().mo70356l(str, (List<FTSSearchView.C6996f>) null);
                                                                            } else {
                                                                                C87412m.m108603p("searchView");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            C87412m.m108603p("searchSuggestionManager");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                } else {
                                                                    C87412m.m108603p("rlLayout");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C87412m.m108603p("rlLayout");
                                                                throw null;
                                                            }
                                                        } else {
                                                            C87412m.m108603p("recyclerView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C87412m.m108603p("rlLayout");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("recyclerView");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("recyclerView");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("recyclerView");
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
        C8703w0 w0Var = C8703w0.f27927a;
        C8703w0.f27930d.clear();
        C46091u0 u0Var = this.f158876D;
        if (u0Var != null) {
            u0Var.mo71527a();
            C65838f.f189333a.mo89882c();
            C86709a0.m107524d().mo123470p(3820, this);
            hideVKB();
            super.onDestroy();
            return;
        }
        C87412m.m108603p("historyLogic");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C60055x0 x0Var = this.f158877E;
        if (x0Var != null) {
            C86709a0.m107524d().mo123470p(6200, x0Var);
        } else {
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C60055x0 x0Var = this.f158877E;
        if (x0Var != null) {
            C86709a0.m107524d().mo123455a(6200, x0Var);
        } else {
            C87412m.m108603p("searchSuggestionManager");
            throw null;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C48727ak1 ak12;
        C86709a0.m107524d().mo123470p(3820, this);
        C8478d0 d0Var = new C8478d0();
        d0Var.f27483d = this.f158889v.size();
        C8478d0 d0Var2 = new C8478d0();
        d0Var2.f27483d = this.f158889v.size();
        boolean z = this.f158887t != 0;
        if (i == 0 && i2 == 0) {
            C117407d.INSTANCE.idkeyStat(1265, 7, 1, false);
            C9320i4 i4Var = this.f158881I;
            C49572gk1 gk12 = i4Var != null ? i4Var.f29125v : null;
            C87412m.m108592e(gk12, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse");
            LinkedList<FinderObject> linkedList = gk12.f134091g;
            C87412m.m108593f(linkedList, "response.objectList");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderObject finderObject : linkedList) {
                C87412m.m108593f(finderObject, LocaleUtil.ITALIAN);
                FinderItem a = FinderItem.Companion.mo79056a(finderObject, 16);
                C8703w0.f27930d.put(Long.valueOf(a.getId()), a);
                this.f158889v.add(C15585f.f42211a.mo14348k(a));
                arrayList.add(C13598b0.f38549a);
            }
            this.f158886s = gk12.f134089e;
            this.f158887t = gk12.f134090f;
            this.f158888u = gk12.f134092h;
            d0Var2.f27483d = this.f158889v.size();
            String str2 = this.f158882o;
            StringBuilder sb = new StringBuilder();
            sb.append("onSceneEnd ");
            sb.append(gk12.f134089e);
            sb.append(' ');
            sb.append(gk12.f134090f);
            sb.append(' ');
            sb.append(this.f158889v.size());
            sb.append(' ');
            C9320i4 i4Var2 = this.f158881I;
            sb.append((i4Var2 == null || (ak12 = i4Var2.f29124u) == null) ? null : ak12.f130586d);
            Log.m105924i(str2, sb.toString());
        } else {
            C117407d.INSTANCE.idkeyStat(1265, 8, 1, false);
        }
        if (d0Var2.f27483d == 0) {
            View view = this.f158875C;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f158874B;
                if (textView != null) {
                    textView.setVisibility(0);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f158893z;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(8);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("noResultView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingView");
                throw null;
            }
        } else {
            View view3 = this.f158875C;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView2 = this.f158874B;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f158893z;
                    if (refreshLoadMoreLayout2 != null) {
                        refreshLoadMoreLayout2.setVisibility(0);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("noResultView");
                    throw null;
                }
            } else {
                C87412m.m108603p("loadingView");
                throw null;
            }
        }
        int i3 = d0Var.f27483d;
        if (i3 == 0) {
            RecyclerView recyclerView = this.f158873A;
            if (recyclerView != null) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        } else if (i3 < d0Var2.f27483d) {
            RecyclerView recyclerView2 = this.f158873A;
            if (recyclerView2 != null) {
                RecyclerView.C16613e adapter2 = recyclerView2.getAdapter();
                if (adapter2 != null) {
                    int i4 = d0Var.f27483d;
                    adapter2.notifyItemRangeInserted(i4, d0Var2.f27483d - i4);
                }
            } else {
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f158893z;
        if (refreshLoadMoreLayout3 != null) {
            refreshLoadMoreLayout3.post(new C55805c(d0Var, this, d0Var2, z));
        } else {
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        hideVKB();
    }

    /* renamed from: y */
    public boolean mo3009y() {
        String str;
        hideVKB();
        FTSSearchView fTSSearchView = this.f158884q;
        if (fTSSearchView != null) {
            String totalQuery = fTSSearchView.getFtsEditText().getTotalQuery();
            if (totalQuery == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
                str = "";
            }
            if (Util.isNullOrNil(str)) {
                return true;
            }
            this.f158891x = 1;
            m63545O7(this, str, (C89349b) null, 2, (Object) null);
            C46091u0 u0Var = this.f158876D;
            if (u0Var != null) {
                u0Var.mo71529c(str);
                C60055x0 x0Var = this.f158877E;
                if (x0Var != null) {
                    x0Var.mo84916b();
                    C117407d.INSTANCE.idkeyStat(1265, 6, 1, false);
                    return false;
                }
                C87412m.m108603p("searchSuggestionManager");
                throw null;
            }
            C87412m.m108603p("historyLogic");
            throw null;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}
