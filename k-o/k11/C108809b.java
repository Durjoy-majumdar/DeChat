package k11;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.listview.AnimatedExpandableListView;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import h11.C98311d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import rx3.C13604l;
import sx3.C110821n;
import sx3.C64186f0;
import sx3.C77813z;
import ux3.C65486b;

/* renamed from: k11.b */
public final class C108809b extends AnimatedExpandableListView.C97285b {

    /* renamed from: d */
    public final CleanCacheUI f325820d;

    /* renamed from: e */
    public long[] f325821e = new long[8];

    /* renamed from: f */
    public final boolean[] f325822f = new boolean[8];

    /* renamed from: g */
    public final boolean[] f325823g = new boolean[8];

    /* renamed from: h */
    public final ArrayList<Integer> f325824h;

    /* renamed from: i */
    public final boolean[][] f325825i;

    /* renamed from: j */
    public final List<C108808a<?>>[] f325826j;

    /* renamed from: k11.b$a */
    public static final class C108810a {

        /* renamed from: a */
        public final CheckBox f325827a;

        /* renamed from: b */
        public final TextView f325828b;

        /* renamed from: c */
        public final TextView f325829c;

        public C108810a(CheckBox checkBox, TextView textView, TextView textView2) {
            C87412m.m108594g(checkBox, "checkBox");
            C87412m.m108594g(textView, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(textView2, "size");
            this.f325827a = checkBox;
            this.f325828b = textView;
            this.f325829c = textView2;
        }
    }

    /* renamed from: k11.b$b */
    public static final class C108811b {

        /* renamed from: a */
        public final View f325830a;

        /* renamed from: b */
        public final View f325831b;

        /* renamed from: c */
        public final CheckBox f325832c;

        /* renamed from: d */
        public final TextView f325833d;

        /* renamed from: e */
        public final TextView f325834e;

        /* renamed from: f */
        public final TextView f325835f;

        /* renamed from: g */
        public final ImageView f325836g;

        /* renamed from: h */
        public final View f325837h;

        public C108811b(View view, View view2, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3, ImageView imageView, View view3) {
            C87412m.m108594g(view, "groupLayout");
            C87412m.m108594g(view2, "expanderLayout");
            C87412m.m108594g(checkBox, "checkBox");
            C87412m.m108594g(textView, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(textView2, "size");
            C87412m.m108594g(textView3, "expand");
            C87412m.m108594g(imageView, "expandIcon");
            C87412m.m108594g(view3, "expandLoading");
            this.f325830a = view;
            this.f325831b = view2;
            this.f325832c = checkBox;
            this.f325833d = textView;
            this.f325834e = textView2;
            this.f325835f = textView3;
            this.f325836g = imageView;
            this.f325837h = view3;
        }
    }

    /* renamed from: k11.b$c */
    public static final class C108812c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a((Long) ((C13604l) t2).f38556e, (Long) ((C13604l) t).f38556e);
        }
    }

    public C108809b(CleanCacheUI cleanCacheUI) {
        C87412m.m108594g(cleanCacheUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f325820d = cleanCacheUI;
        Integer[][] numArr = C88070q.f254721a;
        boolean[] zArr = C88070q.f254722b;
        int i = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if (zArr[i2]) {
                i++;
            }
        }
        this.f325824h = new ArrayList<>(i + 8);
        Integer[][] numArr2 = C88070q.f254721a;
        this.f325825i = new boolean[8][];
        this.f325826j = new List[8];
        mo159916h(new long[16]);
    }

    /* renamed from: b */
    public View mo133513b(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f325820d.getLayoutInflater().inflate(C0966R.C0971layout.b0e, viewGroup, false);
            View findViewById = view.findViewById(C0966R.C0970id.cfj);
            C87412m.m108593f(findViewById, "findViewById(R.id.clean_checkbox)");
            View findViewById2 = view.findViewById(C0966R.C0970id.kpm);
            C87412m.m108593f(findViewById2, "findViewById(R.id.title_tv)");
            View findViewById3 = view.findViewById(C0966R.C0970id.mlu);
            C87412m.m108593f(findViewById3, "findViewById(R.id.size_tv)");
            view.setTag(new C108810a((CheckBox) findViewById, (TextView) findViewById2, (TextView) findViewById3));
        }
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.ChildViewHolder");
        C108810a aVar = (C108810a) tag;
        Integer num = this.f325824h.get(i);
        C87412m.m108593f(num, "posToGroupMapping[groupPosition]");
        int intValue = num.intValue();
        List<C108808a<?>> list = this.f325826j[intValue];
        C87412m.m108591d(list);
        CheckBox checkBox = aVar.f325827a;
        boolean[] zArr = this.f325825i[intValue];
        if (zArr != null) {
            z2 = zArr[i2];
        }
        checkBox.setChecked(z2);
        aVar.f325828b.setText(list.get(i2).f325817b);
        aVar.f325829c.setText(C98311d.m127053b(list.get(i2).f325818c));
        return view;
    }

    /* renamed from: c */
    public int mo133514c(int i) {
        List<C108808a<?>> list;
        Integer num = this.f325824h.get(i);
        C87412m.m108593f(num, "posToGroupMapping[groupPosition]");
        int intValue = num.intValue();
        if (intValue >= 0 && (list = this.f325826j[intValue]) != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo159906d(boolean z) {
        C110821n.m150970q(this.f325822f, z, 0, 0, 6, (Object) null);
        for (boolean[] zArr : this.f325825i) {
            if (zArr != null) {
                C110821n.m150970q(zArr, z, 0, 0, 6, (Object) null);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: e */
    public final <T> List<C108808a<T>> mo159907e(int i, boolean z) {
        boolean[] zArr = this.f325825i[i];
        if (zArr == null) {
            return C64186f0.f181907d;
        }
        List<C108808a<?>> list = this.f325826j[i];
        if (list == null) {
            return C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (zArr[i2] == z) {
                C108808a<?> aVar = list.get(i2);
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.ChildData<T of com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.getCheckedChildren>");
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final long mo159908f() {
        int length = this.f325821e.length;
        long j = 0;
        for (int i = 0; i < length; i++) {
            if (this.f325822f[i]) {
                j += this.f325821e[i];
            } else {
                List<C108808a<?>> list = this.f325826j[i];
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        boolean[] zArr = this.f325825i[i];
                        boolean z = true;
                        if (zArr == null || !zArr[i2]) {
                            z = false;
                        }
                        if (z) {
                            j += list.get(i2).f325818c;
                        }
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: g */
    public final void mo159909g(int i, List<? extends C108808a<?>> list) {
        C87412m.m108594g(list, "data");
        this.f325826j[i] = list;
        boolean z = this.f325822f[i];
        boolean[][] zArr = this.f325825i;
        int size = list.size();
        boolean[] zArr2 = new boolean[size];
        for (int i2 = 0; i2 < size; i2++) {
            zArr2[i2] = z;
        }
        zArr[i] = zArr2;
        if (this.f325823g[i]) {
            Iterator<Integer> it = this.f325824h.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (it.next().intValue() == i) {
                    break;
                }
                i3++;
            }
            AnimatedExpandableListView animatedExpandableListView = this.f325820d.f312122d;
            C87412m.m108591d(animatedExpandableListView);
            animatedExpandableListView.mo136339e(i3);
            this.f325823g[i] = false;
        }
        notifyDataSetChanged();
    }

    public Object getChild(int i, int i2) {
        Integer num = this.f325824h.get(i);
        C87412m.m108593f(num, "posToGroupMapping[groupPosition]");
        List<C108808a<?>> list = this.f325826j[num.intValue()];
        C87412m.m108591d(list);
        return list.get(i2);
    }

    public long getChildId(int i, int i2) {
        Log.m105924i("MicroMsg.CleanCacheUI", ">>> getChildId: " + i + ", " + i2 + ", " + this.f325824h + ", " + this.f325826j);
        Integer num = this.f325824h.get(i);
        C87412m.m108593f(num, "posToGroupMapping[groupPosition]");
        List<C108808a<?>> list = this.f325826j[num.intValue()];
        C87412m.m108591d(list);
        return list.get(i2).f325816a;
    }

    public Object getGroup(int i) {
        Integer num = this.f325824h.get(i);
        C87412m.m108593f(num, "posToGroupMapping[groupPosition]");
        int intValue = num.intValue();
        if (intValue < 0) {
            return null;
        }
        return Long.valueOf(this.f325821e[intValue]);
    }

    public int getGroupCount() {
        return this.f325824h.size();
    }

    public long getGroupId(int i) {
        return (long) this.f325824h.get(i).intValue();
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        View view2;
        int i2 = i;
        if (view == null) {
            view2 = this.f325820d.getLayoutInflater().inflate(C0966R.C0971layout.b0f, viewGroup, false);
            View findViewById = view2.findViewById(C0966R.C0970id.cfl);
            C87412m.m108593f(findViewById, "findViewById(R.id.clean_group_layout)");
            View findViewById2 = view2.findViewById(C0966R.C0970id.cfk);
            C87412m.m108593f(findViewById2, "findViewById(R.id.clean_expander_layout)");
            View findViewById3 = view2.findViewById(C0966R.C0970id.cfj);
            C87412m.m108593f(findViewById3, "findViewById(R.id.clean_checkbox)");
            View findViewById4 = view2.findViewById(C0966R.C0970id.kpm);
            C87412m.m108593f(findViewById4, "findViewById(R.id.title_tv)");
            View findViewById5 = view2.findViewById(C0966R.C0970id.mlu);
            C87412m.m108593f(findViewById5, "findViewById(R.id.size_tv)");
            View findViewById6 = view2.findViewById(C0966R.C0970id.f357947cn0);
            C87412m.m108593f(findViewById6, "findViewById(R.id.expand_tv)");
            View findViewById7 = view2.findViewById(C0966R.C0970id.iy9);
            C87412m.m108593f(findViewById7, "findViewById(R.id.expand_icon)");
            View findViewById8 = view2.findViewById(C0966R.C0970id.iy_);
            C87412m.m108593f(findViewById8, "findViewById(R.id.expand_loading)");
            view2.setTag(new C108811b(findViewById, findViewById2, (CheckBox) findViewById3, (TextView) findViewById4, (TextView) findViewById5, (TextView) findViewById6, (ImageView) findViewById7, findViewById8));
        } else {
            view2 = view;
        }
        Object tag = view2.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.GroupViewHolder");
        C108811b bVar = (C108811b) tag;
        Integer num = this.f325824h.get(i2);
        C87412m.m108593f(num, "posToGroupMapping[groupPosition]");
        int intValue = num.intValue();
        if (intValue < 0) {
            View view3 = bVar.f325831b;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view5 = bVar.f325830a;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar.f325836g.setVisibility(0);
            View view7 = bVar.f325837h;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i3 = i2 - 1;
            Integer num2 = this.f325824h.get(i3);
            C87412m.m108593f(num2, "posToGroupMapping[realGroupPos]");
            int intValue2 = num2.intValue();
            AnimatedExpandableListView animatedExpandableListView = this.f325820d.f312122d;
            C87412m.m108591d(animatedExpandableListView);
            if (animatedExpandableListView.isGroupExpanded(i3)) {
                bVar.f325835f.setText(C0966R.string.f8050ax);
                bVar.f325836g.setRotation(270.0f);
            } else {
                bVar.f325835f.setText(C0966R.string.f8051ay);
                bVar.f325836g.setRotation(90.0f);
                if (this.f325823g[intValue2]) {
                    bVar.f325836g.setVisibility(8);
                    View view8 = bVar.f325837h;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view9 = view8;
                    C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            View view10 = bVar.f325830a;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar5.mo10233c(0);
            View view11 = view10;
            C117292a.m165358d(view11, aVar5.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view11, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view12 = bVar.f325831b;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view13 = view12;
            C117292a.m165358d(view13, aVar6.mo10232b(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view13, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar.f325832c.setChecked(this.f325822f[intValue]);
            bVar.f325833d.setText(this.f325820d.getResources().getStringArray(C0966R.array.f2563b1)[intValue]);
            bVar.f325834e.setText(C98311d.m127053b(this.f325821e[intValue]));
        }
        return view2;
    }

    /* renamed from: h */
    public final void mo159916h(long[] jArr) {
        C87412m.m108594g(jArr, "tagsResult");
        Log.m105924i("MicroMsg.CleanCacheUI", "setGroupData: " + jArr);
        Integer[][] numArr = C88070q.f254721a;
        long[] jArr2 = new long[8];
        int i = 0;
        while (true) {
            long j = 0;
            if (i >= 8) {
                break;
            }
            for (Integer intValue : C88070q.f254721a[i]) {
                j += jArr[intValue.intValue()];
            }
            jArr2[i] = j;
            i++;
        }
        this.f325821e = jArr2;
        ArrayList arrayList = new ArrayList(jArr2.length);
        int length = jArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList.add(new C13604l(Integer.valueOf(i3), Long.valueOf(jArr2[i2])));
            i2++;
            i3++;
        }
        ArrayList arrayList2 = new ArrayList(this.f325821e.length);
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) ((C13604l) next).f38556e).longValue() <= 0) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            C77813z.m93909o(arrayList2, new C108812c());
        }
        this.f325824h.clear();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            int intValue2 = ((Number) ((C13604l) it4.next()).f38555d).intValue();
            this.f325824h.add(Integer.valueOf(intValue2));
            if (C88070q.f254722b[intValue2]) {
                this.f325824h.add(-1);
            }
        }
        notifyDataSetChanged();
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
