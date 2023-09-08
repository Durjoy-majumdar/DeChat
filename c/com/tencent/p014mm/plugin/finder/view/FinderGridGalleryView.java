package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.C94057e;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.Metadata;
import nj3.C11184p0;
import p143ds.C97526j;
import p143ds.C97527l;
import uo3.C78253a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderGridGalleryView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/gallery/model/k$c;", "Lcom/tencent/mm/plugin/gallery/ui/e$a;", "", "columnNum", "Lrx3/b0;", "setColumnNum", "selectLimit", "setMaxSelectLimit", "Lcom/tencent/mm/plugin/finder/view/FinderGridGalleryView$a;", "onItemSelectedListener", "setOnItemSelectListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView */
public final class FinderGridGalleryView extends LinearLayout implements C93964k.C93967c, C94057e.C94058a {

    /* renamed from: d */
    public final String f270681d = "Finder.FinderGridGalleryView";

    /* renamed from: e */
    public final int[] f270682e = {C0966R.string.dad, C0966R.string.daf, C0966R.string.dae};

    /* renamed from: f */
    public final int[] f270683f = {1, 2, 3};

    /* renamed from: g */
    public TextView f270684g;

    /* renamed from: h */
    public GridView f270685h;

    /* renamed from: i */
    public MMSwitchBtn f270686i;

    /* renamed from: j */
    public C94057e f270687j;

    /* renamed from: n */
    public C97527l f270688n;

    /* renamed from: o */
    public C78253a f270689o;

    /* renamed from: p */
    public int f270690p = 4;

    /* renamed from: q */
    public int f270691q = 1;

    /* renamed from: r */
    public long f270692r;

    /* renamed from: s */
    public int f270693s = 9;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView$a */
    public interface C41563a {
        /* renamed from: a */
        void mo64648a(GalleryItem$MediaItem galleryItem$MediaItem);

        /* renamed from: b */
        void mo64649b(Bundle bundle);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView$e */
    public static final class C41564e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderGridGalleryView f111879d;

        public C41564e(FinderGridGalleryView finderGridGalleryView) {
            this.f111879d = finderGridGalleryView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderGridGalleryView$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C78253a aVar = this.f111879d.f270689o;
            if (aVar != null) {
                aVar.mo70679m();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderGridGalleryView$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("mediaTypePopupMenu");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView$f */
    public static final class C41565f implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderGridGalleryView f111880d;

        public C41565f(FinderGridGalleryView finderGridGalleryView) {
            this.f111880d = finderGridGalleryView;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderGridGalleryView$init$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            this.f111880d.getClass();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderGridGalleryView$init$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView$b */
    public static final class C93782b implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ FinderGridGalleryView f270694a;

        public C93782b(FinderGridGalleryView finderGridGalleryView) {
            this.f270694a = finderGridGalleryView;
        }

        public final void onStatusChange(boolean z) {
            FinderGridGalleryView finderGridGalleryView = this.f270694a;
            finderGridGalleryView.f270691q = z ? finderGridGalleryView.f270693s : 1;
            C94057e eVar = finderGridGalleryView.f270687j;
            if (eVar != null) {
                int g0 = eVar.mo129049g0();
                FinderGridGalleryView finderGridGalleryView2 = this.f270694a;
                if (g0 > finderGridGalleryView2.f270691q) {
                    C94057e eVar2 = finderGridGalleryView2.f270687j;
                    if (eVar2 != null) {
                        eVar2.mo129047T2().clear();
                        C94057e eVar3 = this.f270694a.f270687j;
                        if (eVar3 != null) {
                            eVar3.notifyDataSetChanged();
                        } else {
                            C87412m.m108603p("albumAdapter");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("albumAdapter");
                        throw null;
                    }
                }
                FinderGridGalleryView finderGridGalleryView3 = this.f270694a;
                C94057e eVar4 = finderGridGalleryView3.f270687j;
                if (eVar4 != null) {
                    eVar4.mo129052t2(finderGridGalleryView3.f270691q);
                } else {
                    C87412m.m108603p("albumAdapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("albumAdapter");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView$c */
    public static final class C93783c implements View.OnCreateContextMenuListener {

        /* renamed from: d */
        public final /* synthetic */ FinderGridGalleryView f270695d;

        public C93783c(FinderGridGalleryView finderGridGalleryView) {
            this.f270695d = finderGridGalleryView;
        }

        public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.clear();
            for (int add : this.f270695d.f270682e) {
                contextMenu.add(add);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView$d */
    public static final class C93784d implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ FinderGridGalleryView f270696d;

        public C93784d(FinderGridGalleryView finderGridGalleryView) {
            this.f270696d = finderGridGalleryView;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            FinderGridGalleryView finderGridGalleryView = this.f270696d;
            TextView textView = finderGridGalleryView.f270684g;
            if (textView != null) {
                textView.setText(finderGridGalleryView.f270682e[i]);
                FinderGridGalleryView finderGridGalleryView2 = this.f270696d;
                C97527l lVar = finderGridGalleryView2.f270688n;
                if (lVar != null) {
                    lVar.mo128903I(finderGridGalleryView2.f270683f[i]);
                    C94057e eVar = this.f270696d.f270687j;
                    if (eVar != null) {
                        eVar.clear();
                        FinderGridGalleryView finderGridGalleryView3 = this.f270696d;
                        C94057e eVar2 = finderGridGalleryView3.f270687j;
                        if (eVar2 != null) {
                            C97527l lVar2 = finderGridGalleryView3.f270688n;
                            if (lVar2 != null) {
                                eVar2.mo129040I(lVar2.mo128906b());
                                this.f270696d.f270692r = System.currentTimeMillis();
                                FinderGridGalleryView finderGridGalleryView4 = this.f270696d;
                                C97527l lVar3 = finderGridGalleryView4.f270688n;
                                if (lVar3 != null) {
                                    lVar3.mo128911o1("", finderGridGalleryView4.f270692r);
                                } else {
                                    C87412m.m108603p("queryService");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("queryService");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("albumAdapter");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("albumAdapter");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("queryService");
                    throw null;
                }
            } else {
                C87412m.m108603p("mediaTypeTv");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderGridGalleryView$g */
    public static final class C93785g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderGridGalleryView f270697d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<GalleryItem$MediaItem> f270698e;

        public C93785g(FinderGridGalleryView finderGridGalleryView, LinkedList<GalleryItem$MediaItem> linkedList) {
            this.f270697d = finderGridGalleryView;
            this.f270698e = linkedList;
        }

        public final void run() {
            C94057e eVar = this.f270697d.f270687j;
            if (eVar != null) {
                eVar.clear();
                C94057e eVar2 = this.f270697d.f270687j;
                if (eVar2 != null) {
                    eVar2.mo129051m4(this.f270698e);
                    C94057e eVar3 = this.f270697d.f270687j;
                    if (eVar3 != null) {
                        eVar3.notifyDataSetChanged();
                    } else {
                        C87412m.m108603p("albumAdapter");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("albumAdapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("albumAdapter");
                throw null;
            }
        }
    }

    public FinderGridGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo128710b();
    }

    /* renamed from: B3 */
    public void mo80207B3(LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
        String str = this.f270681d;
        StringBuilder sb = new StringBuilder();
        sb.append("ticket ");
        sb.append(j);
        sb.append(" query finished  ");
        sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
        sb.append(" medias");
        Log.m105924i(str, sb.toString());
        if (this.f270692r == j && linkedList != null) {
            post(new C93785g(this, linkedList));
        }
    }

    /* renamed from: a */
    public void mo128709a(int i, int i2, int i3, int i4) {
        String str = this.f270681d;
        Log.m105924i(str, "selected  " + i + " items");
    }

    /* renamed from: b */
    public final void mo128710b() {
        Class cls = C97526j.class;
        View inflate = View.inflate(getContext(), C0966R.C0971layout.acx, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.gqt);
        C87412m.m108593f(findViewById, "contentView.findViewById(R.id.media_type_tv)");
        this.f270684g = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.h38);
        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.multi_select_switch)");
        this.f270686i = (MMSwitchBtn) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.gq8);
        C87412m.m108593f(findViewById3, "contentView.findViewById(R.id.media_grid_view)");
        GridView gridView = (GridView) findViewById3;
        this.f270685h = gridView;
        gridView.setNumColumns(this.f270690p);
        TextView textView = this.f270684g;
        if (textView != null) {
            textView.setText(this.f270682e[0]);
            C97527l WA = ((C97526j) C86312j.m106911c(cls)).mo136635WA();
            C87412m.m108593f(WA, "getService(IMediaFeature…createMediaQueryService()");
            this.f270688n = WA;
            WA.mo128903I(this.f270683f[0]);
            C97527l lVar = this.f270688n;
            if (lVar != null) {
                lVar.mo128902C5(this);
                long currentTimeMillis = System.currentTimeMillis();
                this.f270692r = currentTimeMillis;
                C97527l lVar2 = this.f270688n;
                if (lVar2 != null) {
                    lVar2.mo128911o1("", currentTimeMillis);
                    C94057e aK = ((C97526j) C86312j.m106911c(cls)).mo136638aK(getContext(), this);
                    C87412m.m108593f(aK, "getService(IMediaFeature…bumAdapter(context, this)");
                    this.f270687j = aK;
                    C97527l lVar3 = this.f270688n;
                    if (lVar3 != null) {
                        aK.mo129040I(lVar3.mo128906b());
                        C94057e eVar = this.f270687j;
                        if (eVar != null) {
                            eVar.mo129052t2(this.f270691q);
                            MMSwitchBtn mMSwitchBtn = this.f270686i;
                            if (mMSwitchBtn != null) {
                                mMSwitchBtn.setSwitchListener(new C93782b(this));
                                Context context = getContext();
                                TextView textView2 = this.f270684g;
                                if (textView2 != null) {
                                    C78253a aVar = new C78253a(context, textView2);
                                    this.f270689o = aVar;
                                    aVar.f229249r = new C93783c(this);
                                    aVar.f229251t = new C93784d(this);
                                    TextView textView3 = this.f270684g;
                                    if (textView3 != null) {
                                        textView3.setOnClickListener(new C41564e(this));
                                        GridView gridView2 = this.f270685h;
                                        if (gridView2 != null) {
                                            gridView2.setOnItemClickListener(new C41565f(this));
                                        } else {
                                            C87412m.m108603p("gridView");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mediaTypeTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mediaTypeTv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("multiSelect");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("albumAdapter");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("queryService");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("queryService");
                    throw null;
                }
            } else {
                C87412m.m108603p("queryService");
                throw null;
            }
        } else {
            C87412m.m108603p("mediaTypeTv");
            throw null;
        }
    }

    public final void setColumnNum(int i) {
        this.f270690p = i;
        GridView gridView = this.f270685h;
        if (gridView != null) {
            gridView.setNumColumns(i);
        } else {
            C87412m.m108603p("gridView");
            throw null;
        }
    }

    public final void setMaxSelectLimit(int i) {
        this.f270693s = i;
    }

    public final void setOnItemSelectListener(C41563a aVar) {
        C87412m.m108594g(aVar, "onItemSelectedListener");
    }

    public FinderGridGalleryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo128710b();
    }
}
