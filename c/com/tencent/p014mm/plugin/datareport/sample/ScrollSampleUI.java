package com.tencent.p014mm.plugin.datareport.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.CustomScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k20.C9557b;
import kg3.C76577a;
import l31.C61212e;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.datareport.sample.ScrollSampleUI */
public class ScrollSampleUI extends MMActivity {

    /* renamed from: g */
    public static List<String> f158295g = new ArrayList();

    /* renamed from: d */
    public ListView f158296d;

    /* renamed from: e */
    public CustomScrollView f158297e;

    /* renamed from: f */
    public RecyclerView f158298f;

    /* renamed from: com.tencent.mm.plugin.datareport.sample.ScrollSampleUI$a */
    public class C55609a implements MenuItem.OnMenuItemClickListener {
        public C55609a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ScrollSampleUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.ScrollSampleUI$b */
    public class C55610b implements CustomScrollView.C57659a {
        public C55610b(ScrollSampleUI scrollSampleUI) {
        }

        /* renamed from: a */
        public void mo12459a(ScrollView scrollView, int i, int i2, int i3, int i4) {
            C9557b bVar = new C9557b();
            bVar.mo10236c(scrollView);
            bVar.mo10235b(i);
            bVar.mo10235b(i2);
            bVar.mo10235b(i3);
            bVar.mo10235b(i4);
            C117292a.m165356b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$2", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V", this, bVar.mo10234a());
            Log.m105920e("ScrollSampleUI", "onScrollChange");
            C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$2", "com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", "onScrollChange", "(Landroid/widget/ScrollView;IIII)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.ScrollSampleUI$c */
    public class C55611c extends ArrayAdapter<String> {
        public C55611c(ScrollSampleUI scrollSampleUI, Context context, int i, int i2, List list) {
            super(context, i, i2, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            Class cls = C61212e.class;
            View view2 = super.getView(i, view, viewGroup);
            ((C61212e) C86312j.m106911c(cls)).se0(view2);
            if (i % 10 == 0) {
                ((C61212e) C86312j.m106911c(cls)).o30(view2, "view_id_" + i);
                ((C61212e) C86312j.m106911c(cls)).mo86176qF(view2, "data", ((ArrayList) ScrollSampleUI.f158295g).get(i));
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(view2, 40, 24184);
            }
            return view2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.ScrollSampleUI$d */
    public class C55612d implements AbsListView.OnScrollListener {
        public C55612d(ScrollSampleUI scrollSampleUI) {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            Log.m105920e("ScrollSampleUI", "onScroll");
            C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            Log.m105920e("ScrollSampleUI", "onScrollStateChanged");
            C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.ScrollSampleUI$e */
    public class C55613e extends RecyclerView.C0130p {
        public C55613e(ScrollSampleUI scrollSampleUI) {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.datareport.sample.ScrollSampleUI$f */
    public class C55614f extends RecyclerView.C16613e {

        /* renamed from: com.tencent.mm.plugin.datareport.sample.ScrollSampleUI$f$a */
        public class C55615a extends RecyclerView.C16631z {
            public C55615a(C55614f fVar, View view) {
                super(view);
            }
        }

        public C55614f(C55609a aVar) {
        }

        public int getItemCount() {
            return ((ArrayList) ScrollSampleUI.f158295g).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            TextView textView;
            Class cls = C61212e.class;
            String str = (String) ((ArrayList) ScrollSampleUI.f158295g).get(i);
            if (str != null && (textView = (TextView) zVar.f44854d.findViewById(C0966R.C0970id.n3d)) != null) {
                textView.setText(str);
                ((C61212e) C86312j.m106911c(cls)).se0(textView);
                if (i % 10 == 0) {
                    ((C61212e) C86312j.m106911c(cls)).o30(textView, "view_id_" + i);
                    ((C61212e) C86312j.m106911c(cls)).mo86176qF(textView, "data", str);
                    ((C61212e) C86312j.m106911c(cls)).mo86162dW(textView, 100);
                    ((C61212e) C86312j.m106911c(cls)).mo86141Ky(textView, 0.30000001192092896d);
                    ((C61212e) C86312j.m106911c(cls)).mo86175pO(textView, 40, 24184);
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C55615a(this, LayoutInflater.from(ScrollSampleUI.this.getBaseContext()).inflate(C0966R.C0971layout.cw8, viewGroup, false));
        }
    }

    static {
        for (int i = 0; i < 30; i++) {
            List<String> list = f158295g;
            list.add("No." + i);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cw9;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        Intent intent = getIntent();
        int intExtra = intent != null ? intent.getIntExtra("type", 1) : 1;
        if (intExtra == 1) {
            setMMTitle("ScrollView 列表示例页面");
        } else if (intExtra == 2) {
            setMMTitle("ListView 列表示例页面");
        } else if (intExtra == 3) {
            setMMTitle("RecyclerView 列表示例页面");
        }
        setBackBtn(new C55609a());
        this.f158298f = (RecyclerView) mo176895$(C0966R.C0970id.n3p);
        this.f158297e = (CustomScrollView) mo176895$(C0966R.C0970id.n3q);
        ListView listView = (ListView) mo176895$(C0966R.C0970id.n3o);
        this.f158296d = listView;
        if (intExtra == 1) {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            Iterator it = ((ArrayList) f158295g).iterator();
            int i = 0;
            while (it.hasNext()) {
                TextView textView = new TextView(this);
                textView.setBackgroundColor(-7829368);
                textView.setText((String) it.next());
                linearLayout.addView(textView, new ViewGroup.LayoutParams(-1, C76577a.m92151b(this, 150)));
                View view = new View(this);
                view.setBackgroundColor(-7829368);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.5f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/datareport/sample/ScrollSampleUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                linearLayout.addView(view, new ViewGroup.LayoutParams(-1, C76577a.m92151b(this, 1)));
                ((C61212e) C86312j.m106911c(cls)).se0(textView);
                if (i % 10 == 0) {
                    ((C61212e) C86312j.m106911c(cls)).o30(textView, "view_id_" + i);
                    ((C61212e) C86312j.m106911c(cls)).mo86176qF(textView, "data", ((ArrayList) f158295g).get(i));
                    ((C61212e) C86312j.m106911c(cls)).mo86175pO(textView, 40, 24184);
                }
                i++;
            }
            this.f158297e.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
            this.f158297e.setOnScrollChangeListener(new C55610b(this));
            this.f158298f.setVisibility(8);
            this.f158296d.setVisibility(8);
        } else if (intExtra == 2) {
            listView.setAdapter(new C55611c(this, this, C0966R.C0971layout.cw7, C0966R.C0970id.n1v, f158295g));
            this.f158296d.setOnScrollListener(new C55612d(this));
            this.f158297e.setVisibility(8);
            this.f158298f.setVisibility(8);
        } else if (intExtra == 3) {
            this.f158298f.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            this.f158298f.setAdapter(new C55614f((C55609a) null));
            this.f158298f.mo17043c(new C55613e(this));
            this.f158297e.setVisibility(8);
            this.f158296d.setVisibility(8);
        }
    }
}
