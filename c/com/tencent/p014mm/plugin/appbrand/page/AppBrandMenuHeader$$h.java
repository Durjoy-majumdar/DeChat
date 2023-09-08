package com.tencent.p014mm.plugin.appbrand.page;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h */
public class AppBrandMenuHeader$$h extends RecyclerView.C16613e<C83730b> {

    /* renamed from: d */
    public List<C83729a> f244399d;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h$a */
    public static class C83729a {

        /* renamed from: a */
        public String f244400a;

        /* renamed from: b */
        public String f244401b;

        /* renamed from: c */
        public View.OnClickListener f244402c;

        public C83729a(String str, String str2, View.OnClickListener onClickListener) {
            this.f244400a = str;
            this.f244401b = str2;
            this.f244402c = onClickListener;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader$$h$b */
    public static class C83730b extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f244403A;

        /* renamed from: z */
        public TextView f244404z;

        public C83730b(View view) {
            super(view);
            this.f244404z = (TextView) view.findViewById(C0966R.C0970id.ffb);
            this.f244403A = (TextView) view.findViewById(C0966R.C0970id.l3e);
        }
    }

    public AppBrandMenuHeader$$h(List<C83729a> list) {
        ArrayList arrayList = new ArrayList();
        this.f244399d = arrayList;
        arrayList.addAll(list);
    }

    public int getItemCount() {
        return ((ArrayList) this.f244399d).size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C83730b bVar = (C83730b) zVar;
        C83729a aVar = (C83729a) ((ArrayList) this.f244399d).get(i);
        bVar.f244404z.setText(aVar.f244400a);
        bVar.f244403A.setText(aVar.f244401b);
        bVar.f44854d.setOnClickListener(aVar.f244402c);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C83730b(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f6425ei, (ViewGroup) null));
    }
}
