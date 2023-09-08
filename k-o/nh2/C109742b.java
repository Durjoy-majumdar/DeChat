package nh2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import lh2.C109344g0;
import qh2.C101198e;
import sx3.C64197v;
import zn0.C91807d;

/* renamed from: nh2.b */
public final class C109742b implements C109344g0 {

    /* renamed from: d */
    public boolean f328467d;

    /* renamed from: e */
    public RelativeLayout f328468e;

    /* renamed from: f */
    public int f328469f = 32;

    /* renamed from: g */
    public final ArrayList<C109743a> f328470g = new ArrayList<>();

    /* renamed from: h */
    public C101198e f328471h;

    /* renamed from: i */
    public ImageView f328472i;

    /* renamed from: j */
    public GridView f328473j;

    /* renamed from: n */
    public int f328474n = 2;

    /* renamed from: o */
    public RelativeLayout f328475o;

    /* renamed from: nh2.b$a */
    public static final class C109743a {

        /* renamed from: a */
        public int f328476a;

        /* renamed from: b */
        public int f328477b;
    }

    /* renamed from: nh2.b$b */
    public final class C109744b extends BaseAdapter {

        /* renamed from: d */
        public ArrayList<C109743a> f328478d;

        /* renamed from: e */
        public final /* synthetic */ C109742b f328479e;

        public C109744b(C109742b bVar, ArrayList<C109743a> arrayList) {
            C87412m.m108594g(arrayList, "resourceArray");
            this.f328479e = bVar;
            this.f328478d = arrayList;
        }

        public int getCount() {
            return this.f328478d.size();
        }

        public Object getItem(int i) {
            C109743a aVar = this.f328478d.get(i);
            C87412m.m108593f(aVar, "resourceArray[position]");
            return aVar;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C87412m.m108591d(viewGroup);
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "parent!!.context");
            Context context2 = null;
            C109741a aVar = new C109741a(context, (AttributeSet) null, true);
            C109743a aVar2 = (C109743a) getItem(i);
            aVar.setDrawColor(aVar2.f328476a);
            aVar.setType(aVar2.f328477b);
            GridView gridView = this.f328479e.f328473j;
            if (gridView != null) {
                context2 = gridView.getContext();
            }
            int b = C76577a.m92151b(context2, this.f328479e.f328469f);
            aVar.setLayoutParams(new AbsListView.LayoutParams(b, b));
            if (aVar.getType() == this.f328479e.f328474n) {
                aVar.setHasSelected(true);
            } else {
                aVar.setHasSelected(false);
            }
            return aVar;
        }
    }

    /* renamed from: nh2.b$c */
    public static final class C109745c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109742b f328480d;

        public C109745c(C109742b bVar) {
            this.f328480d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101198e eVar = this.f328480d.f328471h;
            if (eVar != null) {
                C101198e.C62622a.m73576a(eVar, C101198e.C101199b.EDIT_PHOTO_DOODLE_UNDO, (Bundle) null, 2, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nh2.b$d */
    public static final class C109746d implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C109742b f328481d;

        public C109746d(C109742b bVar) {
            this.f328481d = bVar;
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
            C109741a aVar = (C109741a) view;
            int type = aVar.getType();
            C109742b bVar = this.f328481d;
            if (type == bVar.f328474n) {
                bVar.mo160978a(aVar.getType());
                C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            bVar.f328474n = aVar.getType();
            this.f328481d.mo160978a(aVar.getType());
            C109742b bVar2 = this.f328481d;
            int i2 = 0;
            for (T next : bVar2.f328470g) {
                int i3 = i2 + 1;
                View view2 = null;
                if (i2 >= 0) {
                    C109743a aVar2 = (C109743a) next;
                    if (i2 == i) {
                        GridView gridView = bVar2.f328473j;
                        View childAt = gridView != null ? gridView.getChildAt(i2) : null;
                        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        if (!((C109741a) childAt).f328462h) {
                            GridView gridView2 = bVar2.f328473j;
                            if (gridView2 != null) {
                                view2 = gridView2.getChildAt(i2);
                            }
                            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                            ((C109741a) view2).setHasSelected(true);
                        }
                    } else {
                        GridView gridView3 = bVar2.f328473j;
                        View childAt2 = gridView3 != null ? gridView3.getChildAt(i2) : null;
                        C87412m.m108592e(childAt2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        if (((C109741a) childAt2).f328462h) {
                            GridView gridView4 = bVar2.f328473j;
                            if (gridView4 != null) {
                                view2 = gridView4.getChildAt(i2);
                            }
                            C87412m.m108592e(view2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                            ((C109741a) view2).setHasSelected(false);
                        }
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/doodle/MultiTalkScreenDoodlePlugin$refreshDoodleLayout$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    public C109742b(boolean z, RelativeLayout relativeLayout) {
        C87412m.m108594g(relativeLayout, "mRootView");
        this.f328467d = z;
        this.f328468e = relativeLayout;
        mo160979b(this.f328467d, this.f328468e);
    }

    /* renamed from: a */
    public final void mo160978a(int i) {
        if (i == 99) {
            C101198e eVar = this.f328471h;
            if (eVar != null) {
                C101198e.C62622a.m73576a(eVar, C101198e.C101199b.EDIT_PHOTO_DOODLE_MSC, (Bundle) null, 2, (Object) null);
            }
        } else if (i != 100) {
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", i);
            C101198e eVar2 = this.f328471h;
            if (eVar2 != null) {
                eVar2.mo14585p(C101198e.C101199b.EDIT_PHOTO_DOODLE_PENCIL, bundle);
            }
        } else {
            C101198e eVar3 = this.f328471h;
            if (eVar3 != null) {
                C101198e.C62622a.m73576a(eVar3, C101198e.C101199b.EDIT_PHOTO_DOODLE_BRUSH, (Bundle) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo160979b(boolean z, RelativeLayout relativeLayout) {
        RelativeLayout relativeLayout2 = relativeLayout;
        C87412m.m108594g(relativeLayout2, "rootView");
        View inflate = LayoutInflater.from(relativeLayout.getContext()).inflate(z ? C0966R.C0971layout.bun : C0966R.C0971layout.bum, relativeLayout2);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout3 = (RelativeLayout) inflate;
        this.f328475o = relativeLayout3;
        ImageView imageView = (ImageView) relativeLayout3.findViewById(C0966R.C0970id.if9);
        this.f328472i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(C74933u4.m89768e(relativeLayout.getContext(), C0966R.raw.icons_filled_previous, -1));
        }
        ImageView imageView2 = this.f328472i;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C109745c(this));
        }
        GridView gridView = (GridView) relativeLayout2.findViewById(C0966R.C0970id.bio);
        this.f328473j = gridView;
        if (z && gridView != null) {
            Context context = relativeLayout.getContext();
            C87412m.m108593f(context, "rootView.context");
            int i = C75044y4.m89990b(context).x;
            int i2 = C75044y4.m89990b(context).y;
            if (i > i2) {
                i = i2;
            }
            gridView.setVerticalSpacing((i - C74942w4.m89784a(context, C91807d.CTRL_INDEX)) / 7);
        }
        if (z) {
            this.f328470g.clear();
            ArrayList<C109743a> arrayList = this.f328470g;
            C109743a aVar = new C109743a();
            aVar.f328476a = -7054596;
            aVar.f328477b = 6;
            arrayList.add(aVar);
            ArrayList<C109743a> arrayList2 = this.f328470g;
            C109743a aVar2 = new C109743a();
            aVar2.f328476a = -15172610;
            aVar2.f328477b = 5;
            arrayList2.add(aVar2);
            ArrayList<C109743a> arrayList3 = this.f328470g;
            C109743a aVar3 = new C109743a();
            aVar3.f328476a = -16535286;
            aVar3.f328477b = 4;
            arrayList3.add(aVar3);
            ArrayList<C109743a> arrayList4 = this.f328470g;
            C109743a aVar4 = new C109743a();
            aVar4.f328476a = -17592;
            aVar4.f328477b = 3;
            arrayList4.add(aVar4);
            ArrayList<C109743a> arrayList5 = this.f328470g;
            C109743a aVar5 = new C109743a();
            aVar5.f328476a = -707825;
            aVar5.f328477b = 2;
            arrayList5.add(aVar5);
            ArrayList<C109743a> arrayList6 = this.f328470g;
            C109743a aVar6 = new C109743a();
            aVar6.f328476a = -16777216;
            aVar6.f328477b = 1;
            arrayList6.add(aVar6);
            ArrayList<C109743a> arrayList7 = this.f328470g;
            C109743a aVar7 = new C109743a();
            aVar7.f328476a = -855310;
            aVar7.f328477b = 0;
            arrayList7.add(aVar7);
        } else {
            this.f328470g.clear();
            ArrayList<C109743a> arrayList8 = this.f328470g;
            C109743a aVar8 = new C109743a();
            aVar8.f328476a = -855310;
            aVar8.f328477b = 0;
            arrayList8.add(aVar8);
            ArrayList<C109743a> arrayList9 = this.f328470g;
            C109743a aVar9 = new C109743a();
            aVar9.f328476a = -16777216;
            aVar9.f328477b = 1;
            arrayList9.add(aVar9);
            ArrayList<C109743a> arrayList10 = this.f328470g;
            C109743a aVar10 = new C109743a();
            aVar10.f328476a = -707825;
            aVar10.f328477b = 2;
            arrayList10.add(aVar10);
            ArrayList<C109743a> arrayList11 = this.f328470g;
            C109743a aVar11 = new C109743a();
            aVar11.f328476a = -17592;
            aVar11.f328477b = 3;
            arrayList11.add(aVar11);
            ArrayList<C109743a> arrayList12 = this.f328470g;
            C109743a aVar12 = new C109743a();
            aVar12.f328476a = -16535286;
            aVar12.f328477b = 4;
            arrayList12.add(aVar12);
            ArrayList<C109743a> arrayList13 = this.f328470g;
            C109743a aVar13 = new C109743a();
            aVar13.f328476a = -15172610;
            aVar13.f328477b = 5;
            arrayList13.add(aVar13);
            ArrayList<C109743a> arrayList14 = this.f328470g;
            C109743a aVar14 = new C109743a();
            aVar14.f328476a = -7054596;
            aVar14.f328477b = 6;
            arrayList14.add(aVar14);
        }
        GridView gridView2 = this.f328473j;
        if (gridView2 != null) {
            gridView2.setAdapter(new C109744b(this, this.f328470g));
        }
        GridView gridView3 = this.f328473j;
        if (gridView3 != null) {
            gridView3.setOnItemClickListener(new C109746d(this));
        }
    }

    /* renamed from: c */
    public final void mo160980c(Integer num) {
        RelativeLayout relativeLayout;
        if (!(num == null || (relativeLayout = this.f328475o) == null)) {
            relativeLayout.setVisibility(num.intValue());
        }
        if (num != null && num.intValue() == 0) {
            int i = 0;
            for (T next : this.f328470g) {
                int i2 = i + 1;
                View view = null;
                if (i >= 0) {
                    C109743a aVar = (C109743a) next;
                    GridView gridView = this.f328473j;
                    if ((gridView != null ? gridView.getChildAt(i) : null) != null) {
                        GridView gridView2 = this.f328473j;
                        View childAt = gridView2 != null ? gridView2.getChildAt(i) : null;
                        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        if (((C109741a) childAt).getType() != this.f328474n) {
                            GridView gridView3 = this.f328473j;
                            if (gridView3 != null) {
                                view = gridView3.getChildAt(i);
                            }
                            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                            ((C109741a) view).setHasSelected(false);
                        } else {
                            GridView gridView4 = this.f328473j;
                            if (gridView4 != null) {
                                view = gridView4.getChildAt(i);
                            }
                            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                            ((C109741a) view).setHasSelected(true);
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            mo160978a(this.f328474n);
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        RelativeLayout relativeLayout = this.f328475o;
        Integer valueOf = relativeLayout != null ? Integer.valueOf(relativeLayout.getVisibility()) : null;
        if (valueOf == null || valueOf.intValue() != 0) {
            return false;
        }
        mo160980c(4);
        return true;
    }

    public String name() {
        return C109742b.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        if (i == 0) {
            int i2 = 0;
            for (T next : this.f328470g) {
                int i3 = i2 + 1;
                View view = null;
                if (i2 >= 0) {
                    C109743a aVar = (C109743a) next;
                    GridView gridView = this.f328473j;
                    if ((gridView != null ? gridView.getChildAt(i2) : null) != null) {
                        GridView gridView2 = this.f328473j;
                        View childAt = gridView2 != null ? gridView2.getChildAt(i2) : null;
                        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        if (((C109741a) childAt).getType() != this.f328474n) {
                            GridView gridView3 = this.f328473j;
                            if (gridView3 != null) {
                                view = gridView3.getChildAt(i2);
                            }
                            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                            ((C109741a) view).setHasSelected(false);
                        } else {
                            GridView gridView4 = this.f328473j;
                            if (gridView4 != null) {
                                view = gridView4.getChildAt(i2);
                            }
                            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                            ((C109741a) view).setHasSelected(true);
                        }
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            mo160978a(this.f328474n);
        }
        GridView gridView5 = this.f328473j;
        if (gridView5 != null) {
            gridView5.setVisibility(i);
        }
        ImageView imageView = this.f328472i;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
