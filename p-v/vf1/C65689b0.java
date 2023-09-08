package vf1;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGallerySearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ef1.C58556f;
import ef1.C58563g;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import je1.C9320i4;
import k20.C60958c;
import k20.C9556a;
import pe3.C89349b;
import rs1.C13442s8;

/* renamed from: vf1.b0 */
public final class C65689b0 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public boolean f189032a = true;

    /* renamed from: b */
    public final /* synthetic */ FinderGallerySearchUI f189033b;

    public C65689b0(FinderGallerySearchUI finderGallerySearchUI) {
        this.f189033b = finderGallerySearchUI;
    }

    /* renamed from: a */
    public void mo3747a(int i) {
        if (this.f189032a && i > 0) {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f189033b).mo75002a(C13442s8.class);
            C87412m.m108593f(a, "UICProvider.of(this@Find…rReporterUIC::class.java)");
            C13442s8.C13443a aVar = C13442s8.f38060Q0;
            C58556f j3 = ((C13442s8) a).mo12854j3(-1);
            if (j3 != null) {
                FinderGallerySearchUI finderGallerySearchUI = this.f189033b;
                C58563g gVar = new C58563g(j3);
                RecyclerView recyclerView = finderGallerySearchUI.f158873A;
                if (recyclerView != null) {
                    gVar.onScrollStateChanged(recyclerView, 5);
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            this.f189032a = false;
        }
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        TextView textView;
        TextView textView2;
        Log.m105924i(this.f189033b.f158882o, "onLoadMoreBegin");
        FinderGallerySearchUI finderGallerySearchUI = this.f189033b;
        String str = finderGallerySearchUI.f158885r;
        if (str != null) {
            View view = null;
            if (finderGallerySearchUI.f158887t == 1) {
                String str2 = finderGallerySearchUI.f158882o;
                Log.m105924i(str2, "startSearchNextPage: " + str + " isPreload:" + false);
                int i2 = finderGallerySearchUI.mo77408N7().f191893a.f191889b;
                C9320i4 i4Var = r2;
                C9320i4 i4Var2 = new C9320i4(str, finderGallerySearchUI.f158886s, finderGallerySearchUI.f158890w, finderGallerySearchUI.f158888u, i2 != 1 ? i2 != 2 ? i2 != 3 ? 0 : 24 : 16 : 15, ((C13442s8) C39818r.f106831a.mo62444c(finderGallerySearchUI).mo75002a(C13442s8.class)).mo12861q3(), (C89349b) null, (C89349b) null, (C89349b) null, false, 0, Exif.PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN, (C8480h) null);
                C9320i4 i4Var3 = i4Var;
                finderGallerySearchUI.f158881I = i4Var3;
                i4Var3.f29126w = false;
                C86709a0.m107524d().mo123460f(finderGallerySearchUI.f158881I);
                C86709a0.m107524d().mo123455a(3820, finderGallerySearchUI);
                Log.m105924i(finderGallerySearchUI.f158882o, "showLoadMoreFooter");
                RefreshLoadMoreLayout refreshLoadMoreLayout = finderGallerySearchUI.f158893z;
                if (refreshLoadMoreLayout != null) {
                    View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eas);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderGallerySearchUI.f158893z;
                    if (refreshLoadMoreLayout2 != null) {
                        View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderGallerySearchUI.f158893z;
                        if (refreshLoadMoreLayout3 != null) {
                            View loadMoreFooter3 = refreshLoadMoreLayout3.getLoadMoreFooter();
                            if (loadMoreFooter3 != null) {
                                view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
                            }
                            View view2 = view;
                            if (view2 != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view3 = view2;
                                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "showLoadMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                return;
                            }
                            return;
                        }
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            Log.m105924i(finderGallerySearchUI.f158882o, "showNoMoreFooter");
            RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderGallerySearchUI.f158893z;
            if (refreshLoadMoreLayout4 != null) {
                View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout5 = finderGallerySearchUI.f158893z;
                if (refreshLoadMoreLayout5 != null) {
                    View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                    TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout6 = finderGallerySearchUI.f158893z;
                    if (refreshLoadMoreLayout6 != null) {
                        View loadMoreFooter6 = refreshLoadMoreLayout6.getLoadMoreFooter();
                        if (loadMoreFooter6 != null) {
                            view = loadMoreFooter6.findViewById(C0966R.C0970id.g2s);
                        }
                        View view4 = view;
                        if (view4 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view5 = view4;
                            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/feed/ui/FinderGallerySearchUI", "showNoMoreFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105924i(this.f189033b.f158882o, "onLoadMoreEnd");
    }
}
