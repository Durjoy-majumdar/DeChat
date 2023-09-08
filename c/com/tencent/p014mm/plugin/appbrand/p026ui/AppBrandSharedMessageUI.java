package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandSharedMessageUI */
public class AppBrandSharedMessageUI extends MMActivity {

    /* renamed from: d */
    public ListView f11894d;

    /* renamed from: e */
    public MRecyclerView f11895e;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandSharedMessageUI$a */
    public class C1979a implements AdapterView.OnItemClickListener {
        public C1979a(AppBrandSharedMessageUI appBrandSharedMessageUI) {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandSharedMessageUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandSharedMessageUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandSharedMessageUI$b */
    public static class C1980b extends RecyclerView.C16613e {
        public int getItemCount() {
            return 0;
        }

        public int getItemViewType(int i) {
            return super.getItemViewType(i);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandSharedMessageUI$c */
    public static class C1981c extends BaseAdapter {
        public C1981c(LayoutInflater layoutInflater) {
        }

        public int getCount() {
            return 0;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return 0;
        }

        public int getItemViewType(int i) {
            return super.getItemViewType(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }

        public int getViewTypeCount() {
            return 4;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6469fp;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11894d = (ListView) findViewById(C0966R.C0970id.fpc);
        this.f11895e = (MRecyclerView) findViewById(C0966R.C0970id.byy);
        this.f11894d.setAdapter(new C1981c(getLayoutInflater()));
        this.f11894d.setOnItemClickListener(new C1979a(this));
        this.f11895e.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f11895e.setAdapter(new C1980b());
        this.f11895e.addHeaderView(getLayoutInflater().inflate(C0966R.C0971layout.f6468fo, (ViewGroup) null));
    }
}
